package kachuelitos.controller.test;

import static org.junit.Assert.assertEquals;
import kachuelitos.controller.LoginController;
import kachuelitos.persistence.dao.UserDao;
import kachuelitos.service.SimpleUserManager;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public class TestUserLoginController {

    private ApplicationContext context;
    private UserDao userDao;
    

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(
				"classpath:test-context.xml");
		userDao = (UserDao) context.getBean("userDao");
	}

	@Test
	public void addRegistrationtest() throws Exception {

		String idni = "42938470";
		String spassword = "123ABCDE";

		MockHttpServletRequest httprequest = new MockHttpServletRequest();
		httprequest.setMethod("POST");

		MockHttpServletResponse httpresponse = new MockHttpServletResponse();

		httprequest.setAttribute("idni", idni);
		httprequest.setAttribute("spassword", spassword);

		SimpleUserManager userManager = new SimpleUserManager();

		userManager.setUserDao(userDao);

		LoginController controller = new LoginController();
		controller.setUserManager(userManager);

		ModelAndView mensaje = controller.validateLogin(httprequest, httpresponse);
		assertEquals("useraccount", mensaje.getViewName());

	}

}
