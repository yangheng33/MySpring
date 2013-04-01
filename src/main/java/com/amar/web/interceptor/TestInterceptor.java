package com.amar.web.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor
{
	private final Logger log = Logger.getLogger( this.getClass() );

	@Override
	public void afterCompletion( HttpServletRequest arg0 , HttpServletResponse arg1 , Object arg2 , Exception arg3 ) throws Exception
	{
		log.info( "afterCompletion" );

	}

	@Override
	public void postHandle( HttpServletRequest arg0 , HttpServletResponse arg1 , Object arg2 , ModelAndView arg3 ) throws Exception
	{
		log.info( "postHandle" );
	}

	public boolean validate( String data )
	{
		boolean result = true;

		String forbiddens[] = { "drop", "select" };

		if ( data != null )
		{
			for( String forbidden : forbiddens )
			{
				if ( forbidden.toLowerCase().contains( data ) )
				{
					result = false;
					break;
				}
			}
		}
		return result;
	}

	@SuppressWarnings( "rawtypes" )
	@Override
	public boolean preHandle( HttpServletRequest arg0 , HttpServletResponse arg1 , Object arg2 ) throws Exception
	{
		boolean result = true;

		Enumeration names = arg0.getParameterNames();
		while ( names.hasMoreElements() )
		{
			String name = names.nextElement().toString();
			String value = arg0.getParameter( name.toString() );

			if ( !validate( name ) || ! validate( value ) )
			{
				log.info( "" + name + "=" + value );
				result = false;
				arg1.sendRedirect( "error.amar?method=toWarning" );
				break;
			}
		}

		return result;
	}

}
