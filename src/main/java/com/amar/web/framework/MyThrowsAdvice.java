package com.amar.web.framework;

import java.lang.reflect.Method;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

import com.amar.web.exception.LackDataException;

public class MyThrowsAdvice implements ThrowsAdvice
{
	private final Logger log = Logger.getLogger( this.getClass() );
	
	public void afterThrowing( Method method , Object [] args , Object target , Exception ex )
	{
		try
		{

			log.info( ex.getMessage() );
			
			HttpServletResponse response = ( HttpServletResponse ) args[ 1 ];
			HttpServletRequest request = ( HttpServletRequest ) args[ 0 ];
			request.setAttribute( "errorinfo" , ex.getMessage() );
			
			if ( ex instanceof LackDataException )
			{
				try
				{
					ex = null;

					response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );
					JSONObject json = new JSONObject();
					json.put( "list" , 123 );

					// response.getWriter().write( json.toString() );
				}
				catch ( Exception e )
				{
					e.printStackTrace();
				}
			}
			else if ( ex instanceof SQLException )
			{
				
			}
			else if ( ex instanceof RuntimeException )
			{

			}
			else if ( ex instanceof NullPointerException )
			{

			}
			else if ( ex instanceof Exception )
			{

			}
			response.sendRedirect( "http://localhost/MySpring/random.amar?a=random" );
		}
		catch ( Exception e )
		{
			System.out.println( "in afterThrowing.error" );
			e.printStackTrace();
			System.out.println( "in afterThrowing.error" );
		}
	}

	public void print()
	{
		System.out.println( "in print." );
	}
}
