package kachuelitos.controller;

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
public class OtherController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserManager userManager;
/*
	@RequestMapping(value = "/login.htm")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

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
	}
*/
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView formLogin() {
		
		System.out.println("haciendo cambio");
		
		return new ModelAndView("login", "command", new User());
		
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("SpringWeb") User user,
			ModelMap model) {
	//	model.addAttribute("name", student.getName());
	//	model.addAttribute("age", student.getAge());
	//	model.addAttribute("id", student.getId());

		return "result";
	}

}
