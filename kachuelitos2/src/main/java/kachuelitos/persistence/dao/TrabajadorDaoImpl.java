package kachuelitos.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import kachuelitos.persistence.entity.Trabajador;
import kachuelitos.persistence.entity.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "trabajadorDao")
public class TrabajadorDaoImpl implements TrabajadorDao {
	
    private EntityManager em = null;
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }


	public User add(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return null;
	}
	public void edit(Trabajador trabajador) {
		// TODO Auto-generated method stub
		
	}
	public Trabajador getTrabajador(int trabajadorId) {
		
    	
		Trabajador trabajador = null;
    
    	System.out.print("salida"+"select t from Trabajador t where t.trabajadorDniuser=:"+trabajadorId);
            	
		Query query= em.createQuery("FROM Trabajador T WHERE T.trabajadorDniuser = :dni");
		query.setParameter("dni", Integer.valueOf(trabajadorId));

		
		trabajador = (Trabajador)query.getSingleResult();
    
    	return trabajador;	
	}
	
	public List<Trabajador> getAllTrabajador() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int trabajadorId) {
		// TODO Auto-generated method stub
		
	}

}
