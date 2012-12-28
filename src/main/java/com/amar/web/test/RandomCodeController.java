package com.amar.web.test;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.util.SpringBeanFactory;
import com.amar.util.randomcode.RandomCode;
import com.amar.util.randomcode.RandomPicInfo;
import com.amar.web.exception.LackDataException;
import com.amar.web.framework.MyThrowsAdvice;

@SuppressWarnings( "unused" )
@Controller
@RequestMapping( "random.amar" )
public class RandomCodeController
{

	@RequestMapping( params = "a=random" )
	protected void doGet( HttpServletRequest request , HttpServletResponse response)
	{
		response.setContentType( "image/jpeg" );
		response.setHeader( "Pragma" , "No-cache" );
		response.setHeader( "Cache-Control" , "no-cache" );
		response.setDateHeader( "Expires" , 0 );
		
		try
		{
			AnnotationInfoController annotationInfoController = SpringBeanFactory.getBean( "annotationInfoController" );
			annotationInfoController.p( "in controller" );
			
			RandomCode rc = new RandomCode();
			
			RandomPicInfo picInfo = rc.getRandcode();
			
			HttpSession session = request.getSession();
			
			session.removeAttribute( "Rand" );
			
			session.setAttribute( "Rand" , picInfo.getCode() );
			
			ImageIO.write( picInfo.getImage() , "JPEG" , response.getOutputStream() );
		}
		catch ( Exception e )
		{
			System.err.println( e );
		}
	}
	
	@RequestMapping( params = "a=exception" )
	protected void exception( HttpServletRequest request , HttpServletResponse response) throws IOException, LackDataException
	{
		JSONObject json = new JSONObject();

		json.put( "list" , 123 );
		
		if( "amar".equals( request.getParameter( "name" ) ))
		{
			json.put( "error" , 456 );
			throw new LackDataException();
		}

		response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

		response.getWriter().write( json.toString() );
	}
}
