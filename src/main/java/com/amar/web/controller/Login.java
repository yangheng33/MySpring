package com.amar.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "login.amar" )
public class Login
{
	@RequestMapping( params = "method=logintest" )
	public void toAddArea( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );
		JSONObject json = new JSONObject();
		String name = request.getParameter( "name" );
		String pw = request.getParameter( "pw" );
		
		json.put( "name" , name );
		json.put( "pw" , pw );
		
		response.getWriter().write( json.toString() );
	}
	
	@RequestMapping( params = "method=tologin" )
	public String tologin( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		
		
		return "login/login";
	}
	
	@RequestMapping( params = "method=login" )
	public String login( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		
		String username = request.getParameter( "username" );
		request.getSession().setAttribute( "username" , username );
		return "login/success";
	}
	
	@RequestMapping( params = "method=query" )
	public String query( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		request.setAttribute( "username" , request.getSession().getAttribute( "username" ) ) ;
		
		return "login/query";
	}
}
