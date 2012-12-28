package com.amar.db.ibatis.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amar.db.ibatis.dao.AreaDAO;
import com.amar.web.model.Area;
import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.googlecode.ehcache.annotations.When;

@Repository( "areaDAOImpl" )
public class AreaDAOImpl
{
	@Autowired
	private SqlSessionTemplate template;
	
	@TriggersRemove(cacheName = "hourCache", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void addArea( Area area )
	{

	}

	@TriggersRemove(cacheName = "hourCache", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void delArea( Area area )
	{

	}

	@TriggersRemove(cacheName = "hourCache", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void editArea( Area area )
	{

	}

	@Cacheable( cacheName ="hourCache" )
	public List<Area> getArea( Area area )
	{
		AreaDAO dao = template.getMapper( AreaDAO.class );
		return dao.getArea( area );
	}
	
	@Cacheable( cacheName ="hourCache" )
	public List<Area> getArea2( int id )
	{
		
		Area area = new Area();
		area.setId( id );
		AreaDAO dao = template.getMapper( AreaDAO.class );
		return dao.getArea( area );
	}


}
