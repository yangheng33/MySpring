package com.amar.web.test;

import java.util.Enumeration;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.amar.db.mongodb.dao.FB_RequestDAO;
import com.amar.util.Base64;
import com.amar.web.model.FB_Request;

/**
 * @description
 * @date 2011-11-22 下午05:27:42
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
@Controller
@RequestMapping( "fb.amar" )
public class FacebookController
{
	private final Logger log = Logger.getLogger( this.getClass() );

	@Resource( name = "fb_RequestDAO" )
	private FB_RequestDAO fb_RequestDAO;

	@RequestMapping( )
	public ModelAndView ip7( HttpServletRequest request , HttpServletResponse response )
	{

		@SuppressWarnings( "unchecked" )
		Enumeration < String > e = request.getParameterNames();
		StringBuffer s = new StringBuffer();
		while ( e.hasMoreElements() )
		{
			String key = e.nextElement();
			String value = request.getParameter( key );
			s.append( key + ":" + value + "<br/>" );
		}

		String sign = request.getParameter( "signed_request" );
		boolean auth = false;

		if ( sign != null && ! "".equalsIgnoreCase( sign ) )
		{
			String [] t = sign.split( "[.]" );
			String payload = t[ 1 ];
			String data = new String( Base64.decodeUrl( payload ) );
			s.append( "<br/>" + data + "<br/>" );
			if ( data.contains( "oauth_token" ) )
			{
				auth = true;
			}
		}
		request.setAttribute( "info" , s.toString() );

		String request_ids = request.getParameter( "request_ids" );

		if ( request_ids != null && ! "".equals( request_ids ) )
		{
			log.info( request_ids );
		}

		
		//try
		//{
		//	response.sendRedirect( "http://www.baidu.com" );
		//}
		//catch ( IOException e1 )
		//{
		//	e1.printStackTrace();
		//}
	

		if ( ! auth ) return new ModelAndView( "facebook/auth" );
		else return new ModelAndView( "facebook/index" );
	}

	@SuppressWarnings( "unchecked" )
	@RequestMapping( params = "a=login" )
	public String ip( HttpServletRequest request , HttpServletResponse response )
	{
		String uri = request.getRequestURI();
		Enumeration < String > e = request.getParameterNames();

		StringBuffer s = new StringBuffer();
		while ( e.hasMoreElements() )
		{
			String key = e.nextElement();
			String value = request.getParameter( key );
			s.append( key + ":" + value + "<br/>" );
		}
		s.append( uri );

		String sign = request.getParameter( "signed_request" );
		if ( sign != null && ! "".equalsIgnoreCase( sign ) )
		{
			String [] t = sign.split( "[.]" );
			String payload = t[ 1 ];
			String data = new String( Base64.decodeUrl( payload ) );
			s.append( "<br/>" + data + "<br/>" );
		}
		else
		{

		}

		String request_ids = request.getParameter( "request_ids" );

		if ( request_ids != null && ! "".equals( request_ids ) )
		{
			FB_Request fb_r = new FB_Request();
			fb_r.setContent( request_ids );
			fb_RequestDAO.add( fb_r );
		}

		request.setAttribute( "info" , s.toString() );

		return "facebook/index";
	}

	@RequestMapping( params = "a=toInvate" )
	public String ip5( HttpServletRequest request , HttpServletResponse response )
	{

		return "facebook/invate";
	}

	@RequestMapping( params = "a=invate" )
	public String ip4( HttpServletRequest request , HttpServletResponse response )
	{
		String usernames = request.getParameter( "username" );

		request.setAttribute( "msg" , usernames );

		return "facebook/invate";
	}

	@RequestMapping( params = "a=do1" )
	public String ip2( HttpServletRequest request , HttpServletResponse response )
	{
		return "facebook/do1";
	}

	@RequestMapping( params = "a=callback" )
	public String ip3( HttpServletRequest request , HttpServletResponse response )
	{
		String uri = request.getRequestURI();
		@SuppressWarnings( "unchecked" )
		Enumeration < String > e = request.getParameterNames();

		StringBuffer s = new StringBuffer();
		while ( e.hasMoreElements() )
		{
			String key = e.nextElement();
			String value = request.getParameter( key );
			s.append( key + ":" + value + "<br/>" );
		}
		s.append( uri );

		request.setAttribute( "info" , s.toString() );

		return "facebook/welcome";
	}
	
}
