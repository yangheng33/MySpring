package com.amar.web.websocket;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.websocket.StreamInbound;
import org.apache.catalina.websocket.WebSocketServlet;


public class MyWebSocketServlet extends WebSocketServlet
{
	private static final long serialVersionUID = 221212838386689261L;

	private Map<String,MyWebSocket> sessionMap = new ConcurrentHashMap<String,MyWebSocket>();

	@Override
	protected StreamInbound createWebSocketInbound( String subProtocol , HttpServletRequest request )
	{
		String username = request.getParameter( "username" );
		System.out.println( "username:" + username );

		MyWebSocket myWebSocket = new MyWebSocket( username );
		myWebSocket.setMyWebSocketServlet( this );

		sessionMap.put( username , myWebSocket );

		return myWebSocket;
	}

	public void broadcast( String message ) throws IOException
	{
		Iterator<String> iterator = sessionMap.keySet().iterator();

		while ( iterator.hasNext() )
		{
			String key = iterator.next();
			MyWebSocket myWebSocket = sessionMap.get( key );
			CharBuffer buffer = CharBuffer.wrap( message );
			myWebSocket.getWsOutbound().writeTextMessage( buffer );
			System.out.println( key );
		}
	}

	public void close( String username )
	{
		sessionMap.remove( username );
	}

}
