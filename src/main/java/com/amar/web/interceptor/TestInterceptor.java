package com.amar.web.interceptor;

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

	@Override
	public boolean preHandle( HttpServletRequest arg0 , HttpServletResponse arg1 , Object arg2 ) throws Exception
	{
		log.info( "preHandle" );
		return true;
	}

}
