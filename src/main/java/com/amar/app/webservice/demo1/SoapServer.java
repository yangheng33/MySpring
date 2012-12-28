package com.amar.app.webservice.demo1;

import javax.xml.ws.Endpoint;

public class SoapServer
{
	public static void main( String [] args )
	{
		Endpoint.publish( "http://localhost:80/helloService" , new HelloServiceImpl() );
	}
}
