package kachuelitos.searchblog;

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

public class RunConsole {

	public static void main(String[] args) throws BlogSearcherException  {

		
		
		BlogQueryParameter tagQueryParam = new RSSFeedBlogQueryParameterImpl(RSSProviderURL.MSN);	
		System.out.println("entrando al bucle");
		BlogSearcher searcher  = new RSSFeedBlogSearcherImpl();
		System.out.println(" bucle 1");
		tagQueryParam.setParameter(QueryParameter.START_INDEX, "1");
		tagQueryParam.setParameter(QueryParameter.LIMIT, "1");
		tagQueryParam.setParameter(QueryParameter.QUERY,"collective intelligence");
		BlogQueryResult tagResult = searcher.getRelevantBlogs(tagQueryParam);
		System.out.println(" bucle 1");
		
		
		//tagResult = searcher.getRelevantBlogs(tagQueryParam);
		System.out.println(tagResult);
			
		
	
	
	
	}

}
