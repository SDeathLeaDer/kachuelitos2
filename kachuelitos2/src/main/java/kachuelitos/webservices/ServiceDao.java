package kachuelitos.webservices;

import java.util.List;

import kachuelitos.persistence.entity.User;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ServiceDao {

	private SessionFactory session;


	public ServiceDao() {
		session = SessionFactoryUtil.getInstance();

	}

	public List<Object[]> JobOffersListService(String description) {

		Session s = session.getCurrentSession();

		Transaction trans = s.beginTransaction();
		Query query = s.createSQLQuery("{call JobOffersListPA('"+description +"')}");

		@SuppressWarnings("unchecked")
		List<Object[]>  listWorker =  (List<Object[]>)query.list();
		
		trans.commit();

		return listWorker;
	}
}