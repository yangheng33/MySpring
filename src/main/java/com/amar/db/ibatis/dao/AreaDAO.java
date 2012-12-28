package com.amar.db.ibatis.dao;

import java.util.List;

import com.amar.web.model.Area;
import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.googlecode.ehcache.annotations.When;

public interface AreaDAO
{
	@TriggersRemove( cacheName = "allCache" , when = When.AFTER_METHOD_INVOCATION , removeAll = true )
	public void addArea( Area area );

	@TriggersRemove( cacheName = "allCache" , when = When.AFTER_METHOD_INVOCATION , removeAll = true )
	public void delArea( Area area );

	@TriggersRemove( cacheName = "allCache" , when = When.AFTER_METHOD_INVOCATION , removeAll = true )
	public void editArea( Area area );

	@Cacheable( cacheName = "allCache" )
	public List<Area> getArea( Area area );

}
