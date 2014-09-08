package kachuelitos.service;

import java.io.Serializable;

import kachuelitos.persistence.entity.Tagcache;

public interface TagCacheManager extends Serializable {

    public Tagcache getTagCache(int id);   
	public void add(Tagcache tagcache);

	
}