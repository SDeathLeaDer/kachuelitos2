package kachuelitos.service;

import kachuelitos.persistence.dao.TagCacheDao;
import kachuelitos.persistence.dao.TrabajadorDao;
import kachuelitos.persistence.entity.Tagcache;
import kachuelitos.persistence.entity.Trabajador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SimpleTagCacheManager implements TagCacheManager {

    private static final long serialVersionUID = 1L;

    @Autowired
    private TagCacheDao  tagcacheDao;
    
    private Tagcache tagcache;

    public void setTagCacheDao(TagCacheDao tagcacheDao) {
        this.tagcacheDao = tagcacheDao;
        
    }

	public Tagcache getTagCache(int id) {
		tagcache = tagcacheDao.getTagcache(id);
		return tagcache;
	}

	public void add(Tagcache tagcache) {
		tagcacheDao.add(tagcache);
		// TODO Auto-generated method stub
	}

}