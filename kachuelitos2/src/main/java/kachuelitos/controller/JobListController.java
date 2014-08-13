package kachuelitos.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.service.UserManager;
import kachuelitos.webservices.Entries;
import kachuelitos.webservices.Page;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobListController {

	protected final Log logger = LogFactory.getLog(getClass());
	private  String  idPage = "1659292967629525";

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/searchjobs.htm", method = RequestMethod.GET)
	public ModelAndView formUserAccount() {

		// Haciendo una peticion rest a fb

		RestTemplate restTemplate = new RestTemplate();
		Page page = restTemplate.getForObject(
				"https://www.facebook.com/feeds/page.php?format=json&id="+idPage, Page.class);

//		System.out.println("Name:    " + page.getName());
//		System.out.println("About:   " + page.getAbout());
//		System.out.println("Phone:   " + page.getPhone());
//		System.out.println("Website: " + page.getWebsite());
//		System.out.println("Website: " + page.getCategory_list().get(0).getId());
//
		Map<String , Object> mapModel = new HashMap<String, Object>();
		
		mapModel.put("title", page.getTitle());
		mapModel.put("icon", page.getIcon());
		mapModel.put("listEntry", page.getEntries());
	
		System.out.println( page.getEntries().get(0).getContent());
		return new ModelAndView("joblist", mapModel);
		
	}

	@RequestMapping(value = "/joblistjobs.htm", method = RequestMethod.POST)
	public ModelAndView updateUserAccount(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/*
		 * logger.info("Haciendo login");
		 * 
		 * 
		 * String sDni = (String) request.getParameter("idni"); String sPassword
		 * = (String) request.getParameter("spassword"); ModelAndView modelview;
		 * 
		 * System.out.println("ta aqui"); System.out.println(sDni + "-" +
		 * sPassword);
		 * 
		 * if (userManager.validateUser(sDni, sPassword)) {
		 * 
		 * modelview = userManager.sessionInit(request, response);
		 * 
		 * }
		 * 
		 * else { modelview = new ModelAndView("login"); }
		 * 
		 * return modelview;
		 */

		return null;
	}

}
