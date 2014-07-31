package kachuelitos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.persistence.entity.User;
import kachuelitos.service.UserManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAccountController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserManager userManager;
	
	@RequestMapping(value = "/useraccount.htm", method = RequestMethod.GET)
	public ModelAndView formUserAccount(){

		return new ModelAndView("useraccount");
	}
	
	@RequestMapping(value = "/updateuseraccount.htm", method = RequestMethod.POST)
	public ModelAndView updateUserAccount(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/*
		logger.info("Haciendo login");

		
		String sDni = (String) request.getParameter("idni");
		String sPassword = (String) request.getParameter("spassword");
		ModelAndView modelview;

		System.out.println("ta aqui");
		System.out.println(sDni + "-" + sPassword);

		if (userManager.validateUser(sDni, sPassword)) {

			modelview = userManager.sessionInit(request, response);

		}

		else {
			modelview = new ModelAndView("login");
		}
	
		return modelview;
			*/
		
		return null;
	}
	
}
