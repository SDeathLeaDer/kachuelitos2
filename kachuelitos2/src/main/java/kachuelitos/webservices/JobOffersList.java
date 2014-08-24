package kachuelitos.webservices;

import java.util.List;

import kachuelitos.persistence.entity.User;


public class JobOffersList {
	
	public List<User> verifyJobList(String description){
		
		ServiceDao serviceDao = new ServiceDao();

		return 	serviceDao.JobOffersListService(description);
	}
	
}
