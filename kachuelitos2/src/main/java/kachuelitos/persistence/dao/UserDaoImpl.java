package kachuelitos.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import kachuelitos.persistence.entity.User;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {


    private EntityManager em = null;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    @Transactional(readOnly = false)
	public void add(User usuario) {
		// TODO Auto-generated method stub

	}
    @Transactional(readOnly = false)
	public void edit(User usuario) {
		// TODO Auto-generated method stub

	}
    
    @Transactional(readOnly = false)
	public void delete(int usuarioId) {
		// TODO Auto-generated method stub

	}
    
    @Transactional(readOnly = false)
	public User getUsuario(int usuarioId) {
		// TODO Auto-generated method stub
		return null;
	}

	
    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
	public List<User> getAllUsuario() {
		
	    return em.createQuery("select u from User u ").getResultList();
 
	       
	}

}
