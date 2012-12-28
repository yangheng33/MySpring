package com.amar.web.controller;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.cache.CacheTest;
import com.amar.db.ibatis.dao.AreaDAO;
import com.amar.util.ServletUtil;
import com.amar.web.model.Area;

@Controller
@RequestMapping( "area.amar" )
public class AreaController
{
	private final Logger log = Logger.getLogger( this.getClass() );

	@Resource( name = "areaDAO" )
	private AreaDAO areaDAO;
	
	@Resource( name = "cacheTest" )
	private CacheTest cacheTest;
	
	@RequestMapping( params = "t=toAddArea" )
	public String toAddArea( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		log.info( "in toAddArea" );
		return "area/add";
	}

	@RequestMapping( params = "t=toEditArea" )
	public String toEditArea( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Area area = ServletUtil.getRequestObject( request , Area.class );

		List<Area> list = areaDAO.getArea( area );

		Area a = list.get( 0 );

		request.setAttribute( "area" , a );

		return "area/edit";
	}

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { Exception.class, IOException.class } )
	@RequestMapping( params = "t=addArea" )
	public void addArea( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		Area area = ServletUtil.getRequestObject( request , Area.class );

		areaDAO.addArea( area );

			//response.sendRedirect( "area.amar?t=list" );

			throw new IOException();

	}

	@RequestMapping( params = "t=delArea" )
	public void delArea( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Area area = ServletUtil.getRequestObject( request , Area.class );

		areaDAO.delArea( area );

		response.sendRedirect( "area.amar?t=list" );
	}

	@RequestMapping( params = "t=editArea" )
	public String editArea( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Area area = ServletUtil.getRequestObject( request , Area.class );

		areaDAO.editArea( area );

		return list( request , response );
	}

	@RequestMapping( params = "t=list" )
	public String list( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Area area = ServletUtil.getRequestObject( request , Area.class );

		List<Area> list = areaDAO.getArea( area );

		request.setAttribute( "list" , list );
		
		log.info( cacheTest.addArea("123 ") );
		
		/*for( int i=10; i<10000;i++)
		{
			Area a = new Area();
			a.setId( i );
			a.setBelongto( i+10 );
			a.setName( (char)i+"" );
			a.setPostcode( "11000" );
			areaDAO.addArea( a );
		}*/
		
		return "area/list";
	}

	public AreaDAO getAreaDAO()
	{
		return areaDAO;
	}

	public void setAreaDAO( AreaDAO areaDAO )
	{
		this.areaDAO = areaDAO;
	}

}
