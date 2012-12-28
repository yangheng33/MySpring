package com.amar.web.test;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.mongodb.base.Page;
import com.amar.db.mongodb.dao.MapReduceTestDAO;
import com.amar.db.mongodb.impl.MapReduceTestDAOImpl;
import com.amar.web.model.CountTest;

@Controller
@RequestMapping( "pageTest.amar" )
@SuppressWarnings( "unused" )
public class PageTestController
{
	private static final Logger log = LoggerFactory.getLogger( PageTestController.class );

	@Resource( name = "mapReduceTestDAO" )
	private MapReduceTestDAO mapReduceTestDAO;

	@RequestMapping( params = "query=init" )
	public String ip( HttpServletRequest request , HttpServletResponse response )
	{

		Page page = new Page( 2 , getCurrentPage( request ) );
		MapReduceTestDAOImpl dao = ( MapReduceTestDAOImpl ) mapReduceTestDAO;
		dao.getByPage( page );
		
		request.setAttribute( "page" , page );

		return "test/pageTest";
	}

	public int getCurrentPage( HttpServletRequest request )
	{
		String pages = request.getParameter( "page" );

		if ( pages == null || "".equalsIgnoreCase( pages ) ) pages = "1";

		return Integer.valueOf( pages );
	}

	@RequestMapping( params = "query=html" )
	public String page1( HttpServletRequest request , HttpServletResponse response )
	{

		Page page = new Page( 2 , getCurrentPage( request ) );

		MapReduceTestDAOImpl dao = ( MapReduceTestDAOImpl ) mapReduceTestDAO;

		List < CountTest > list = dao.getAllByPage( page ,"-"+CountTest.VALUE);

		request.setAttribute( "list" , list );

		return "test/pageContent";
	}

	@RequestMapping( params = "query=json" )
	public void page2( HttpServletRequest request , HttpServletResponse response )
	{
		try
		{
			Page page = new Page( 2 , getCurrentPage( request ) );

			MapReduceTestDAOImpl dao = ( MapReduceTestDAOImpl ) mapReduceTestDAO;

			List < CountTest > list = dao.getByPage( page );

			JSONObject json = new JSONObject();

			json.put( "list" , list );

			response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

			response.getWriter().write( json.toString() );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

}
