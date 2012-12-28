package com.amar.web.test;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.util.structure.SpringBeanInfo;
import com.amar.util.structure.SpringBeanNode;

@Controller
@RequestMapping( "annotation.amar" )
@SuppressWarnings( "unused" )
public class AnnotationInfoController
{

	private int inner = 1;

	private static int outer = 1;

	private ThreadLocal < Integer > innerTL = new ThreadLocal < Integer >();

	private static ThreadLocal < Integer > outerTL = new ThreadLocal < Integer >();

	@SuppressWarnings( "deprecation" )
	@RequestMapping( params = "a=t1" )
	public String ip2( HttpServletRequest request , HttpServletResponse response )
	{
		SpringBeanInfo SpringBeanInfo = new SpringBeanInfo();

		String path = request.getRealPath( "" ) + File.separatorChar + "WEB-INF" + File.separatorChar + "classes" + File.separatorChar;
		String packageName = "com" + File.separatorChar + "amar" + File.separatorChar;

		List < SpringBeanNode > nodeList = SpringBeanInfo.getBeanList( path , packageName );
		StringBuffer sb = new StringBuffer(); // sb -.-#!

		for( SpringBeanNode node : nodeList )
		{
			sb.append( node.toString() ).append( "\n" );
		}

		sb.append( "<br>inner" + inner ).append( " outer:" + outer );
		inner ++ ;
		outer ++ ;

		if( innerTL.get() == null ) innerTL.set(1);
		if( outerTL.get() == null ) outerTL.set(1);
		
		sb.append( "<br>innerTL" + innerTL.get() ).append( " outerTL:" + outerTL.get() );
		
		innerTL.set( innerTL.get() + 1 );
		outerTL.set( outerTL.get() + 1 );
		
		
		request.setAttribute( "info" , sb.toString() );

		return "index";
	}

	public void p( String s )
	{
		System.out.println( s );
	}
}
