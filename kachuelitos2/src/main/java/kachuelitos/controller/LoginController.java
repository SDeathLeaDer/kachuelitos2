package kachuelitos.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.service.UserManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserManager userManager;

	@RequestMapping(value="/hello.htm")
	    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        logger.info("Returning dashboard view");

	        String s = "wilder2";
	        
	        Map<String, Object> mapUser = new HashMap<String, Object>();
	        
	     System.out.println("salidasssssss"+userManager.getUsers().get(0).getDniuser());   
	        
	        mapUser.put("userAll", userManager.getUsers());
	        mapUser.put("prueba", "wilder");
	        
	        return new ModelAndView("dashboard","salida",mapUser);
	        
	    }
}
