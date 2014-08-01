package kachuelitos.persistence.dao.test;


import static org.junit.Assert.*;
import kachuelitos.persistence.dao.UserDao;
import kachuelitos.persistence.entity.User;
  

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



//@ContextConfiguration({ "file:/src/test/java/resources/test-context.xml" })
public class TestUserDaoImpl {
	private ApplicationContext context;
    private UserDao userDao;
    
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        userDao =  (UserDao)context.getBean("userDao");
    }

	@Test
	public void getUsuarioDniPasswordtest() {
		String sDni= "42938470";
		String sPassword= "123ABCDE";
		User user = userDao.getUsuarioDniPassword(sDni, sPassword);
		assertEquals(user.getDniuser(), Integer.valueOf(sDni));
		assertEquals(user.getContrasenhaUser(), sPassword);
		
		
		
		
	}
	

}
