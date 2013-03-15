package com.amar.web.framework;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.amar.web.exception.LackDataException;

public class BaseController
{
	public final Logger log = Logger.getLogger( this.getClass() );

	public final String STATUS = "status";

	public final String INFO = "info";

	public void sendData( HttpServletResponse response , Object obj )
	{

		try
		{
			response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );
			response.getWriter().write( obj.toString() );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	@ExceptionHandler
	public String dealException( HttpServletRequest request , HttpServletResponse response , Exception ex )
	{
		StringBuilder info = new StringBuilder();
		String title = "";
		if ( ex instanceof LackDataException )
		{
			title = "缺少数据";
		}
		if ( ex instanceof IOException )
		{
			title = "输入输出";
		}
		else if ( ex instanceof SQLException )
		{
			title = "SQL";
		}
		else if ( ex instanceof BadSqlGrammarException )
		{
			title = "SQL语法";
		}
		else if ( ex instanceof NullPointerException )
		{
			title = "空指针";
		}
		else if ( ex instanceof RuntimeException )
		{
			title = "运行时";
		}
		else if ( ex instanceof Exception )
		{
			title = "未知";
		}

		if ( ex.getCause() != null && ex.getCause().getMessage() != null )
		{
			info.append( ex.getCause().getMessage() ).append( "\n\n\n" );
		}

		StackTraceElement [] stes = ex.getStackTrace();
		for( StackTraceElement ste : stes )
		{
			if ( ste.getLineNumber() > 0 )
			{
				info.append( ste.getClassName() ).append( "." ).append( ste.getMethodName() ).append( "_第" ).append( ste.getLineNumber() ).append( "行" );
				info.append( "\n" );
			}
		}
		request.setAttribute( "errorTitle" , title );
		request.setAttribute( "errorInfo" , info.toString() );

		log.error( info.toString() );
		return "error/error";
	}
}
