package kachuelitos.service;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kachuelitos.persistence.dao.UserDao;
import kachuelitos.persistence.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SimpleUserManager implements UserManager {

    private static final long serialVersionUID = 1L;

    @Autowired
    private UserDao  userDao;
    
    private User user;

    public void setProductDao(UserDao userDao) {
        this.userDao = userDao;
        
    }

    public boolean validateUser(String sDni, String sPassword){
    	
    	boolean boutput = true;
    	
    	user = userDao.getUsuarioDniPassword(sDni, sPassword);
    	if(user == null ){
    		boutput = false;
    	}
    	
    	return boutput;  
    	
    }
    
    public ModelAndView sessionInit(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setMaxInactiveInterval(30*60);
        Cookie userName = new Cookie("user", user.getNombreUser());
        userName.setMaxAge(30*60);
        response.addCookie(userName);
        
    
        return new ModelAndView("dashboard");
        /*
        try {
			response.sendRedirect("dashboard.jsp?user_id=" + user.getDniuser());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
	public ModelAndView sessionClose(HttpServletRequest request)
	{
		request.getSession().invalidate();
		
	     return new ModelAndView("index.jsp");
		
	}
    
    public List<User> getUsers() {
        return userDao.getAllUsuario();
    }

}