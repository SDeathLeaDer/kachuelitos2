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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserContactController {

	protected final Log logger = LogFactory.getLog(getClass());

//	@Autowired
//	private UserManager userManager;
//	public UserManager getUserManager() {
//		return userManager;
//	}
//	public void setUserManager(UserManager userManager) {
//		this.userManager = userManager;
//	}
	@RequestMapping(value = "/contact2.htm", method = RequestMethod.GET)
	public ModelAndView formContact(){

		return new ModelAndView("contact2");
	}
	@RequestMapping(value = "/sendContact.htm", method = RequestMethod.POST)
	public ModelAndView sendContact(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ModelAndView modelview = null;
		String smessage = request.getParameter("imessage");;
		
		String dni = request.getParameter("idni");
		//String password = request.getParameter("ipassword");
		String name = request.getParameter("iname");
		String lastname = request.getParameter("ilastname");		
		String email = request.getParameter("iemail");
		//String ubigeo = request.getParameter("iubigeo");


//		User user = new User(Integer.valueOf(dni),password, name, lastname, email, Integer.valueOf(ubigeo), null, null, false);
//
//		if(userManager.addUser(user)){
//	
//			smessage = "Gracias por registrarte, ingrese lo datos para los poder loguarse =)";
//			modelview = new ModelAndView("login","smessage",smessage);
//		}
//		else{
//			// No se pudo anhadir usuario a la DB, usuario repetido
//			smessage = "No se pudo añadir usuario, comuniquese con el administrator";
//			modelview = new ModelAndView("registration","smessage",smessage);
//		}
		
		//return modelview;
		return null;
		
	}
}
