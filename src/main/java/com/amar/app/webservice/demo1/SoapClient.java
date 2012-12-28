package com.amar.app.webservice.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class SoapClient
{

	public static void main( String [] args ) throws ParseException
	{
		JaxWsProxyFactoryBean soapFactoryBean = new JaxWsProxyFactoryBean();
		
		soapFactoryBean.setAddress( "http://localhost:80/MySpring/services/helloService" );
		soapFactoryBean.setServiceClass( IHelloService.class );
		Object o = soapFactoryBean.create();
		IHelloService helloService = ( IHelloService ) o;
		Customer c1 = new Customer();
		c1.setId( 1 );
		c1.setName( "A" );
		GregorianCalendar calendar = ( GregorianCalendar ) GregorianCalendar.getInstance();
		calendar.setTime( new SimpleDateFormat( "yyyy-MM-dd" ).parse( "1989-01-28" ) );
		c1.setBirthday(calendar.getTime());
		Customer c2 = new Customer();
		c2.setId( 2 );
		c2.setName( "B" );
		calendar.setTime( new SimpleDateFormat( "yyyy-MM-dd" ).parse( "1990-01-28" ) );
		c2.setBirthday(calendar.getTime());
		System.out.println( helloService.selectMaxAgeStudent( c1 , c2 ).getName() );
	}

}
