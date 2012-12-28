package com.amar.app.jms.demo1;

import java.util.Date;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.amar.constant.ProjectInfo;
import com.amar.util.TimeDateUtil;

@SuppressWarnings( "unused" )
public class TestActiveMQ
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
		connection.start();

		Session session = connection.createSession( true , Session.AUTO_ACKNOWLEDGE );

		Topic topic = session.createTopic( "messageTopic" );

		MessageProducer producer = session.createProducer( topic );

		for( int j = 0 ; j < 10000 ; j ++ )
		{
			for( int i = 0 ; i < 1 ; i ++ )
			{
				ObjectMessage message = session.createObjectMessage();
				message.setStringProperty( "type" , j + ":" + i + ":告警" );
				message.setStringProperty( "date" , TimeDateUtil.getDateTime( new Date() ) );
				/*
				 * MapMessage message = session.createMapMessage();
				 * message.setLong( "count" , new Date().getTime() );
				 * message.setString( "type" , j + ":" + i + ":告警" );
				 */

				producer.send( message );
				session.commit();
			}
			Thread.sleep( 1000 );
		}
		session.close();
		connection.close();

	}
}
