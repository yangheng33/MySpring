package com.amar.app.jms.demo1;

import java.util.Date;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.amar.constant.ProjectInfo;

@SuppressWarnings( "unused" )
public class TestActiveReceiveMQ
{
	/**
	 * @param args
	 * @throws JMSException
	 * @throws InterruptedException
	 */
	public static void main( String [] args ) throws JMSException , InterruptedException
	{
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory( ProjectInfo.jmsAddress() );
		Connection connection = connectionFactory.createConnection();

		final Session session = connection.createSession( true , Session.CLIENT_ACKNOWLEDGE );
		Topic topic = session.createTopic( "messageTopic" );
		MessageConsumer consumer = session.createConsumer( topic );
		consumer.setMessageListener( new MessageListener()
		{
			public void onMessage( Message msg )
			{
				try
				{
					ObjectMessage message = ( ObjectMessage ) msg;
					/*
					 * MapMessage message = ( MapMessage ) msg;
					 * long d = message.getLong( "count" );
					 * String type = message.getString( "type" );
					 * System.out.println( "receive message:" + new Date( d ) + "---" + type );
					 */
					System.out.println( "receive message:" + new Date() + "---" + message.getStringProperty( "type" ) );
					session.commit();
				}
				catch ( JMSException e )
				{
					e.printStackTrace();
				}
			}
		} );
		connection.start();

	}
}
