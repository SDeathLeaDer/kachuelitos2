package kachuelitos.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.persistence.entity.Trabajador;
import kachuelitos.persistence.entity.User;
import kachuelitos.service.UserManager;
import kachuelitos.service.WorkerManager;
import kachuelitos.webservices.Page;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import util.LuceneTextAnalyzer;
import ci.tagcloud.TagCloud;
import ci.textanalysis.InverseDocFreqEstimator;
import ci.textanalysis.TagMagnitudeVector;
import ci.textanalysis.lucene.impl.EqualInverseDocFreqEstimator;
import ci.textanalysis.lucene.impl.TagCacheImpl;

@Controller
public class ShowWorkerController {

	protected final Log logger = LogFactory.getLog(getClass());
	private String idPage = "1659292967629525";

	@Autowired
	private WorkerManager workerManager;

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/ShowWorker.htm", method = RequestMethod.GET)
	public ModelAndView formUserAccount(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RestTemplate restTemplate = new RestTemplate();
		ModelAndView mv = new ModelAndView();
		Map<String, Object> mapModel = new HashMap<String, Object>();

		try {
			Page page = restTemplate.getForObject(
					"https://www.facebook.com/feeds/page.php?format=json&id="
							+ idPage, Page.class);

			mapModel.put("title", page.getTitle());
			mapModel.put("icon", page.getIcon());
			mapModel.put("listEntry", page.getEntries());

			System.out.println(page.getEntries().get(0).getContent());

			mv.setViewName("showWorker");

		} catch (RestClientException rce) {
			mv.setViewName("showWorker");
		} catch (Exception e) {
			// TODO: handle exception
		}

		// Buscando en la tabla cache en caso contrario se genera los tags
		// clouds

		int dni = Integer.valueOf(request.getParameter("idWorker"));
		Trabajador trabajador = workerManager.getWorker(dni);
		mapModel.put("worker", trabajador);

		User user = userManager.getUser(dni);
		mapModel.put("userworker", user);

		
//		String title = "Collective Intelligence and Web2.0";
//		String body = "Web2.0 is all about connecting users to users, "
//				+ " inviting users to participate and applying their collective"
//				+ " intelligence to improve the application. Collective intelligence"
//				+ " enhances the user experience";

		String document1 = trabajador.getExperienciaTrabajador();
		String document2 = trabajador.getResumenTrabajador();
		
		TagCacheImpl t = new TagCacheImpl();
		InverseDocFreqEstimator idfEstimator = new EqualInverseDocFreqEstimator();
		LuceneTextAnalyzer lta = new LuceneTextAnalyzer(t, idfEstimator);

		TagMagnitudeVector tmdocument1 = lta.createTagMagnitudeVector(document1);
		TagMagnitudeVector tmdocument2 = lta.createTagMagnitudeVector(document2);
		TagMagnitudeVector tmCombined = tmdocument1.add(tmdocument2);
		
		System.out.println(tmCombined);
		
		TagCloud tagCloud = lta.createTagCloud(tmdocument2);
		String html = lta.visualizeTagCloud(tagCloud);
		
		System.out.println("html:" + html);

		mapModel.put("tagCloud", html);
		
		mv.addAllObjects(mapModel);

		// System.out.println("el id de dni que entro es:" +idDni);

		return mv;
	}

}