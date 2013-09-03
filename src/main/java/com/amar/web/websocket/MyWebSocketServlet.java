package com.amar.web.websocket;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.websocket.StreamInbound;
import org.apache.catalina.websocket.WebSocketServlet;

public class MyWebSocketServlet extends WebSocketServlet
{
	private static final long serialVersionUID = 221212838386689261L;

	@Override
	protected StreamInbound createWebSocketInbound( String subProtocol , HttpServletRequest request )
	{
		return new MyWebSocket();
	}
}
