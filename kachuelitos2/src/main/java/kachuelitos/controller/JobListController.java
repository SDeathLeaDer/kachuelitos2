package kachuelitos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.persistence.entity.DataTableObject;
import kachuelitos.persistence.entity.Worker;
import kachuelitos.service.UserManager;
import kachuelitos.webservices.Page;
import kachuelitos.webservices.ServiceDao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Controller
public class JobListController {

	protected final Log logger = LogFactory.getLog(getClass());
	private String idPage = "1659292967629525";
	private String typeService;

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/searchjobs.htm", method = RequestMethod.GET)
	public ModelAndView formUserAccount(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RestTemplate restTemplate = new RestTemplate();
		ModelAndView mv = new ModelAndView();
		typeService = request.getParameter("typework");

		try {
			Page page = restTemplate.getForObject(
					"https://www.facebook.com/feeds/page.php?format=json&id="
							+ idPage, Page.class);
			Map<String, Object> mapModel = new HashMap<String, Object>();

			mapModel.put("title", page.getTitle());
			mapModel.put("icon", page.getIcon());
			mapModel.put("listEntry", page.getEntries());

			System.out.println(page.getEntries().get(0).getContent());

			mv.setViewName("joblist");
			mv.addAllObjects(mapModel);

		} catch (RestClientException rce) {

			mv.setViewName("joblist");
		} catch (Exception e) {
			// TODO: handle exception
		}


		return mv;
	}
	
	@RequestMapping(value = "/listjobs.htm", method = RequestMethod.GET)
	public @ResponseBody String  listJobs(){

		// Haciendo una consulta a la bd para busqueda de trabajadores

		ServiceDao serviceDao = new ServiceDao();
		List<Object[]> listObject = serviceDao.JobOffersListService(typeService);
		List<Worker> listWork = new ArrayList<Worker>();
		
		for (int i = 0; i < listObject.size() ; i++) {
			
			Worker worker = new Worker();
			
			worker.setDni(Integer.valueOf(listObject.get(i)[0].toString()));
			worker.setName(listObject.get(i)[1].toString());
			worker.setLastName(listObject.get(i)[2].toString());
			//worker.setEmail(listObject.get(i)[3].toString());
			worker.setPhone(listObject.get(i)[4].toString());
			worker.setAddress(listObject.get(i)[5].toString());
			worker.setShow("<center><a href='ShowWorker.htm?idWorker="+worker.getDni()+"'><img src='resource/images/search.png'></a>"
					+ "</center>");
			
			//worker.setShow("prueba");
//			System.out.println("hay"+worker.getLastName());			
			
			listWork.add(worker);
		}
		
		System.out.println("la cantidad " +listWork.size());
		System.out.println("la cantidad " +listWork.get(0).getDni());

		
		//response.setContentType("application/json");
		//PrintWriter out = response.getWriter();
		//List<Worker> lWorker = StudentDataService.getStudentList();
		
		DataTableObject dataTableObject = new DataTableObject();
		dataTableObject.setAaData(listWork);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(dataTableObject);
		//out.print(json);

		System.out.println("el json " +json);
		
		return json;
	}
}