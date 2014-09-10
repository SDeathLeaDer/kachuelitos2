package kachuelitos.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.service.UserManager;
import kachuelitos.webservices.Page;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import kachuelitos.searchblog.BlogQueryParameter;
import kachuelitos.searchblog.BlogQueryResult;
import kachuelitos.searchblog.BlogSearcherException;
import kachuelitos.searchblog.BlogQueryParameter.QueryParameter;
import kachuelitos.searchblog.BlogQueryParameter.QueryType;
import kachuelitos.searchblog.BlogSearcherImpl;
import kachuelitos.searchblog.RSSFeedBlogQueryParameterImpl;
import kachuelitos.searchblog.RSSFeedBlogQueryParameterImpl.RSSProviderURL;
import kachuelitos.searchblog.RSSFeedBlogSearcherImpl;
import sun.org.mozilla.javascript.internal.ast.TryStatement;

@Controller
public class SearchBlogController {
	
	
	
	

//	@Autowired	
//	private UserManager userManager;
	
	@RequestMapping(value = "/searchblogs.htm", method = RequestMethod.GET)
	public ModelAndView  handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException  {
		ModelAndView mv = new ModelAndView();
		System.out.println(request.toString());
		String target = (String) request.getParameter("tipework");
		System.out.println(target);
		RSSFeedBlogQueryParameterImpl tagQueryParam = new RSSFeedBlogQueryParameterImpl(RSSProviderURL.MSN);	
		System.out.println("entrando al bucle");
		try {
			RSSFeedBlogSearcherImpl searcher = new RSSFeedBlogSearcherImpl();
			tagQueryParam.setParameter(QueryParameter.START_INDEX, "1");
			tagQueryParam.setParameter(QueryParameter.LIMIT, "1");
			tagQueryParam.setParameter(QueryParameter.QUERY,"fidel castro");
			BlogQueryResult tagResult = searcher.getRelevantBlogs(tagQueryParam);;
			System.out.println("entrando al try");
			//tagResult = searcher.getRelevantBlogs(tagQueryParam);
			System.out.println(tagResult);
			System.out.println(tagResult.toString());
			mv.setViewName("bloglist");
			mv.addObject(tagResult);
			
		} catch (BlogSearcherException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mv.setViewName("bloglist");
			
		}
		System.out.println("saliendo del bucle");
		
		return mv;
	}
}

//		try {
//			
//			
//		
////			Page page = restTemplate.getForObject(
////					"https://www.facebook.com/feeds/page.php?format=json&id="
////							+ idPage, Page.class);
////			Map<String, Object> mapModel = new HashMap<String, Object>();
////
////			mapModel.put("title", page.getTitle());
////			mapModel.put("icon", page.getIcon());
////			mapModel.put("listEntry", page.getEntries());
////
////			System.out.println(page.getEntries().get(0).getContent());
////
//			mv.setViewName("bloglist");
//			//mv.addAllObjects(mapModel);
////
//		} catch (RestClientException rce) {
//			mv.setViewName("bloglist");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		// return new ModelAndView("joblist", mapModel);

		
//	@RequestMapping(value = "/joblistjobs.htm", method = RequestMethod.POST)
//	public ModelAndView updateUserAccount(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//
//		/*
//		 * logger.info("Haciendo login");
//		 * 
//		 * 
//		 * String sDni = (String) request.getParameter("idni"); String sPassword
//		 * = (String) request.getParameter("spassword"); ModelAndView modelview;
//		 * 
//		 * System.out.println("ta aqui"); System.out.println(sDni + "-" +
//		 * sPassword);
//		 * 
//		 * if (userManager.validateUser(sDni, sPassword)) {
//		 * 
//		 * modelview = userManager.sessionInit(request, response);
//		 * 
//		 * }
//		 * 
//		 * else { modelview = new ModelAndView("login"); }
//		 * 
//		 * return modelview;
//		 */
//
//		return null;
//	}


