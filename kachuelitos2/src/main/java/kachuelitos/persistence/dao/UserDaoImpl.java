package kachuelitos.persistence.dao;

import java.util.Iterator;
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

    @SuppressWarnings("unchecked")
	@Transactional(readOnly = false)
	public User getUsuarioDniPassword(String sDni, String sPassword) {
		// TODO Auto-generated method stub
    	User user = null;
    	
    	List<User> lUser = em.createQuery("select u from User u where u.dniuser="+sDni+"and u.contrasenhaUser="+ sPassword).getResultList();

    	if(lUser.iterator().hasNext()){
    		user = lUser.iterator().next();
    	}
    	
    	return user;
	}


    
    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
	public List<User> getAllUsuario() {
		
	    return em.createQuery("select u from User u ").getResultList();
 
	       
	}

}
