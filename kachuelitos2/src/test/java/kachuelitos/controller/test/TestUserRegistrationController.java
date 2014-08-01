package kachuelitos.controller.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kachuelitos.controller.UserRegistrationController;
import kachuelitos.persistence.dao.UserDao;
import kachuelitos.persistence.dao.UserDaoImpl;
import kachuelitos.persistence.entity.User;
import kachuelitos.service.SimpleUserManager;
import kachuelitos.service.UserManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class TestUserRegistrationController {

	
	/*@Test
	public void testaddRegistration()  throws Exception{
		UserDaoImpl user = new UserDaoImpl();
		
		SimpleUserManager userManager = new SimpleUserManager();

		userManager.setUserDao(user);
		UserRegistrationController controller = new UserRegistrationController();
		controller.setUserManager(userManager);
		
		ModelAndView mensaje = controller.addRegistration(null, null);
		assertNotNull(mensaje.getViewName());
		
	}*/

}
