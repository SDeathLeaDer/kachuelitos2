package kachuelitos.webservices;

import java.util.List;


public class JobOffersList {
	
	public List<Object[]> verifyJobList(String description){
		
		ServiceDao serviceDao = new ServiceDao();

		return 	serviceDao.JobOffersListService(description);
	}
}
