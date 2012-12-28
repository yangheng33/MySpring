package com.amar.web.model;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

@SuppressWarnings( "unused" )
public class JmsMessage implements MessageCreator
{
	private String content;

	public JmsMessage( String content )
	{
		this.content = content;
	}

	@Override
	public Message createMessage( Session session ) throws JMSException
	{
		/*MapMessage mm = session.createMapMessage();
		mm.setString( "count" , new Date().toString() + "::::" + content );
		mm.setLong("count", new Date().getTime());*/
		
		return session.createTextMessage( content );
	}

	public String getContent()
	{
		return content;
	}

	public void setContent( String content )
	{
		this.content = content;
	}

}
