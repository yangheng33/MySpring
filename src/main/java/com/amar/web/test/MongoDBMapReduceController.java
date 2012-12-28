package com.amar.web.test;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.mongodb.dao.MapReduceTestDAO;
import com.amar.db.mongodb.dao.UserinfoDAO;
import com.amar.web.model.CountTest;
import com.amar.web.model.Userinfo;

@Controller
@RequestMapping( "mapReduce.amar" )
@SuppressWarnings( "unused" )
public class MongoDBMapReduceController
{
	private final Logger log = Logger.getLogger( this.getClass() );
	
	@Resource(name="mapReduceTestDAO")
	private MapReduceTestDAO mapReduceTestDAO;
	
	@Resource(name="userinfoDAO")
	private UserinfoDAO userinfoDAO;
	
	@RequestMapping( params = "a=map1" )
	public void mapReduce( HttpServletRequest request , HttpServletResponse response )
	{
		try
		{
			JSONObject json = new JSONObject();
			
			log.info( "info in MongoDBMapReduceController mapReduce(request,response)" );
			log.error( "error in MongoDBMapReduceController mapReduce(request,response)" );
			
			List <CountTest>list = mapReduceTestDAO.getCountTestMaxValue( 5 );
			

			json.put( "testjson-key" , "testjson-value" );

			String result = json.toString();

			response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

			response.getWriter().write( result );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}

	}
	
	@RequestMapping( params = "a=exists" )
	public void exists( HttpServletRequest request , HttpServletResponse response )
	{
		List<Userinfo> list = userinfoDAO.getUserExist( "son" );
		
		System.out.println( list.size() );
	}
	
	@RequestMapping( params = "a=total" )
	public void total( HttpServletRequest request , HttpServletResponse response )
	{
		long total = mapReduceTestDAO.total();
		log.info( "total:"+total );
	}
	
	@RequestMapping( params = "a=group" )
	public void group( HttpServletRequest request , HttpServletResponse response )
	{
		long total = mapReduceTestDAO.total_group();
		log.info( "total:"+total );
	}
	
}
