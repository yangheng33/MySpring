package com.amar.web.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import org.apache.catalina.websocket.MessageInbound;
import org.apache.catalina.websocket.WsOutbound;

public class MyWebSocket extends MessageInbound
{

	private MyWebSocketServlet myWebSocketServlet;

	public MyWebSocketServlet getMyWebSocketServlet()
	{
		return myWebSocketServlet;
	}

	public void setMyWebSocketServlet( MyWebSocketServlet myWebSocketServlet )
	{
		this.myWebSocketServlet = myWebSocketServlet;
	}

	@Override
	protected void onOpen( WsOutbound outbound )
	{
		System.out.println( "connect...." );

		try
		{
			int i = 0;
			while ( i < 1 )
			{
				CharBuffer buffer = CharBuffer.wrap( "hello,welcome to connect! " );
				this.getWsOutbound().writeTextMessage( buffer );
				Thread.sleep( 2000 );
				i ++ ;
			}
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}
	}

	@Override
	protected void onClose( int status )
	{
		System.out.println( "close....." );
	}

	@Override
	protected void onBinaryMessage( ByteBuffer arg0 ) throws IOException
	{
		System.out.println( "onBinaryMessage....." + arg0.toString() );
	}

	@Override
	protected void onTextMessage( CharBuffer arg0 ) throws IOException
	{
		System.out.println( "onTextMessage....." + arg0.toString() );
		// CharBuffer buffer = CharBuffer.wrap( arg0.toString() );
		// this.getWsOutbound().writeTextMessage( buffer );
		myWebSocketServlet.broadcast( arg0.toString() );
	}

}
