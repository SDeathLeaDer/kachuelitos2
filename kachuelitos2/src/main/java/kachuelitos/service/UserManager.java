package kachuelitos.service;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.persistence.entity.User;

import org.springframework.web.servlet.ModelAndView;

public interface UserManager extends Serializable {

    public List<User> getUsers();
    public boolean validateUser(String sDni, String sPassword); 
    public boolean addUser(User user); 
    
    public ModelAndView sessionInit(HttpServletRequest request, HttpServletResponse response);
	public ModelAndView sessionClose(HttpServletRequest request);
	

}