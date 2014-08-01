package kachuelitos.controller.test;

import static org.junit.Assert.*;

import java.net.URI;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

import kachuelitos.controller.LoginController;
import kachuelitos.controller.UserRegistrationController;
import kachuelitos.persistence.dao.UserDao;
import kachuelitos.persistence.dao.UserDaoImpl;
import kachuelitos.persistence.entity.User;
import kachuelitos.service.SimpleUserManager;
import kachuelitos.service.UserManager;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;

public class TestUserLoginController {

	@Test
	public void addRegistrationtest()  throws Exception{
		
		String idni = "42938470";
		String spassword = "123ABCDE";
		HttpServletRequest httpserrequest = new NullHttpServletRequest();
		
		httpserrequest.setAttribute("idni", idni);
		httpserrequest.setAttribute("spassword", spassword);

		
		UserDaoImpl user = new UserDaoImpl();
		SimpleUserManager userManager = new SimpleUserManager();

		userManager.setUserDao(user);
		
		LoginController controller = new LoginController();
		controller.setUserManager(userManager);
		
		ModelAndView mensaje = controller.validateLogin(httpserrequest, null);
		assertEquals("useraccount",mensaje.getViewName());
	}

}
