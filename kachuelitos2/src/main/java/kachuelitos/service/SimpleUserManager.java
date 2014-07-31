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

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        
    }
    
    public boolean addUser(User user){
    	
    	boolean boutput = true;
    	
    	user = userDao.add(user);
    	if(user == null ){
    		boutput = false;
    	}
    	
    	return boutput;  
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
		HttpSession session = request.getSession(true);
        session.setAttribute("user", user);
        session.setMaxInactiveInterval(30*60);
        Cookie userName = new Cookie("user", user.getNombreUser());
        userName.setMaxAge(30*60);
        response.addCookie(userName);
        
        return new ModelAndView("useraccount");
        
	}
	
	public ModelAndView sessionClose(HttpServletRequest request)
	{
		request.getSession().invalidate();
		
	    return new ModelAndView("logout");
	}
    
    public List<User> getUsers() {
        return userDao.getAllUsuario();
    }

}