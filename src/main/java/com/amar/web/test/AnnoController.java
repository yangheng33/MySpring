package com.amar.web.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amar.db.mongodb.dao.UserinfoDAO;
import com.amar.util.ip.IPSeeker;
import com.amar.web.model.Userinfo;

@Controller
@RequestMapping( "anno.amar" )
public class AnnoController
{
	private final Logger log = Logger.getLogger( this.getClass() );

	@Resource( name = "userinfoDAO" )
	private UserinfoDAO userinfoDAO;

	@RequestMapping( "/toLogin" )
	public String login( HttpServletRequest request , HttpServletResponse response )
	{
		log.info( request.getRemoteAddr() );

		return "test/form";
	}

	@RequestMapping( params = "a=ip" )
	public String ip( HttpServletRequest request , HttpServletResponse response )
	{
		IPSeeker seeker = IPSeeker.getInstance();
		String ip = "136.101.179.28";
		System.out.println( seeker.getAddress( ip ) );
		log.info( request.getRemoteAddr() );
		return "test/form";
	}

	@RequestMapping( value = "/login" , method = RequestMethod.POST )
	public String test2( HttpServletRequest request , HttpServletResponse response , Userinfo userinfo , BindingResult binding )
	{
		log.info( userinfo.toString() );

		return "test/result";
	}

	@InitBinder
	public void initBinder( WebDataBinder binder )
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		dateFormat.setLenient( false );
		binder.registerCustomEditor( Date.class , new CustomDateEditor( dateFormat , false ) );
		binder.registerCustomEditor( Integer.class , null , new CustomNumberEditor( Integer.class , null , true ) );
		binder.registerCustomEditor( Long.class , null , new CustomNumberEditor( Long.class , null , true ) );
		binder.registerCustomEditor( Float.class , new CustomNumberEditor( Float.class , true ) );
		binder.registerCustomEditor( Double.class , new CustomNumberEditor( Double.class , true ) );
	}

	@RequestMapping( params = "a=login" )
	public String para( HttpServletRequest request , HttpServletResponse response )
	{
		log.info( request.getRemoteAddr() );
		return "test/form";
	}

	public void parameters( HttpServletRequest request , HttpServletResponse response , HttpSession session , @PathVariable String path , @RequestParam String param , @CookieValue String cookie )
	{

	}

	@RequestMapping( params = "a=json" )
	public void testJson( HttpServletRequest request , HttpServletResponse response )
	{
		String result = "";
		try
		{
			List<Userinfo> list = userinfoDAO.getAllUser( null );

			log.info( "list.size()" + list.size() );

			JSONObject json = new JSONObject();

			json.put( "testjson-key" , "testjson-value" );

			result = json.toString();

			response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

			response.getWriter().write( result );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}

	@RequestMapping( params = "a=json2" )
	public void testJson2( HttpServletRequest request , HttpServletResponse response )
	{
		String result = "";
		try
		{
			JSONObject json = new JSONObject();

			json.put( "testjson-key" , "testjson-value" );

			result = "{'programmers': [{ 'firstName': 'Brett', 'lastName':'McLaughlin', 'email': 'aaaa' },{ 'firstName': 'Jason', 'lastName':'Hunter', 'email': 'bbbb' },{ 'firstName': 'Elliotte', 'lastName':'Harold', 'email': 'cccc' }],'authors': [{ 'firstName': 'Isaac', 'lastName': 'Asimov', 'genre': 'science fiction' },{ 'firstName': 'Tad', 'lastName': 'Williams', 'genre': 'fantasy' },{ 'firstName': 'Frank', 'lastName': 'Peretti', 'genre': 'christian fiction' }],'musicians': [{ 'firstName': 'Eric', 'lastName': 'Clapton', 'instrument': 'guitar' },　　{ 'firstName': 'Sergei', 'lastName': 'Rachmaninoff', 'instrument': 'piano' }　　] }";

			response.setHeader( "Content-Type" , "application/json;charset=UTF-8" );

			response.getWriter().write( result );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}

	@ResponseBody
	@RequestMapping( value = "/annotationReturnType" , method = RequestMethod.GET )
	public ResponseEntity<String> annotationReturnType()
	{
		log.info( "=================使用ResponseEntity<?>输出====================" );
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType( MediaType.valueOf( "application/json;charset=UTF-8" ) );
		httpHeaders.setAccept( Collections.singletonList( MediaType.APPLICATION_JSON ) );
		String result = "{'programmers': [{ 'firstName': 'Brett', 'lastName':'McLaughlin', 'email': 'aaaa' },{ 'firstName': 'Jason', 'lastName':'Hunter', 'email': 'bbbb' },{ 'firstName': 'Elliotte', 'lastName':'Harold', 'email': 'cccc' }],'authors': [{ 'firstName': 'Isaac', 'lastName': 'Asimov', 'genre': 'science fiction' },{ 'firstName': 'Tad', 'lastName': 'Williams', 'genre': 'fantasy' },{ 'firstName': 'Frank', 'lastName': 'Peretti', 'genre': 'christian fiction' }],'musicians': [{ 'firstName': 'Eric', 'lastName': 'Clapton', 'instrument': 'guitar' },　　{ 'firstName': 'Sergei', 'lastName': 'Rachmaninoff', 'instrument': 'piano' }　　] }";
		ResponseEntity<String> responseEntity = new ResponseEntity<String>( result , httpHeaders , HttpStatus.OK );
		return responseEntity;
	}
}
