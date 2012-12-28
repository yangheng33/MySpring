package com.amar.web.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping( "callself.amar" )
public class CallSelfController
{
	@RequestMapping( params = "a=1" )
	public String ip( HttpServletRequest request , HttpServletResponse response )
	{
		String para1= request.getParameter( "para1" );
		
		request.setAttribute( "info" , para1 );
		return "test/callself/callSelf";
	}
	
	@RequestMapping( params = "a=2" )
	public String ip2( HttpServletRequest request , HttpServletResponse response )
	{
		return "test/callself/callSelTo";
	}

}
