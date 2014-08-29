package kachuelitos.webservices;

import java.util.ArrayList;
import java.util.List;

import kachuelitos.persistence.entity.User;


public class JobOffersList {
	
	public ArrayList <User> verifyJobList(String description){
		
		ServiceDao serviceDao = new ServiceDao();

		return 	serviceDao.JobOffersListService(description);
	}
	
}
