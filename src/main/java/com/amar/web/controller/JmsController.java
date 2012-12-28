package com.amar.web.controller;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.web.model.JmsMessage;

@SuppressWarnings( "unused" )
@Controller
@RequestMapping( "jms.amar" )
public class JmsController
{
	/*
	private final Logger log = Logger.getLogger( this.getClass() );

	@Resource( name = "jmsTemplate" )
	private JmsTemplate jms;

	@Resource( name = "queueDestination" )
	private ActiveMQQueue queue;

	@Resource( name = "topicDestination" )
	private ActiveMQTopic topic;

	@Resource( name = "jmsTemplateFlex" )
	private JmsTemplate jmsTemplateFlex;

	@RequestMapping( params = "t=addQueue" )
	public String addJms( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		String content = request.getParameter( "content" );

		log.info( "in addJms:" + content );

		if ( content != null && ! "".equals( content ) )
		{
			JmsMessage message = new JmsMessage( content );

			jms.send( queue , message );
		}

		return "jms/list";
	}

	@RequestMapping( params = "t=jms" )
	public String jms( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		boolean flag = true;
		while ( flag )
		{
			@SuppressWarnings( "unchecked" )
			Map<String,Object> mm = ( Map<String,Object> ) jms.receiveAndConvert();
			if ( mm != null && mm.containsKey( "count" ) )
			{
				log.info( "收到消息：" + ( String ) mm.get( "count" ) );
			}
		}

		return "jms/list";
	}

	@RequestMapping( params = "t=addTopic" )
	public String addTopic( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{

		String content = request.getParameter( "content" );

		log.info( "in addTopic:" + content );

		if ( content != null && ! "".equals( content ) )
		{
			JmsMessage message = new JmsMessage( content );

			jms.send( topic , message );
		}

		return "jms/list";
	}

	@RequestMapping( params = "t=addTopicToFlex" )
	public String addTopicToFlex( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{

		String content = request.getParameter( "content" );

		if ( content != null && ! "".equals( content ) )
		{
			jmsTemplateFlex.send( new JmsMessage( content ) );
		}

		return "jms/list";
	}
*/
}
