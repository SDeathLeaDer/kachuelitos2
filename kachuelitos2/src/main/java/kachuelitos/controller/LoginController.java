package kachuelitos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kachuelitos.persistence.entity.User;
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

	@RequestMapping(value = "/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		logger.info("Haciendo login");

		String sDni = (String) request.getAttribute("dni");
		String sPassword = (String) request.getAttribute("password");
		ModelAndView modelview;

		if (userManager.validateUser(sDni, sPassword)) {

			modelview = userManager.sessionInit(request, response);

		}

		else {
			modelview = new ModelAndView("login.jsp");
		}

		return modelview;
	}
}
