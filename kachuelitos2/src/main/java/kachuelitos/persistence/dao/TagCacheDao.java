package kachuelitos.persistence.dao;

import kachuelitos.persistence.entity.Tagcache;

public interface TagCacheDao {

	public Tagcache add(Tagcache tagcache);
	public Tagcache getTagcache(int tagcacheid);
	
}
