package com.amar.web.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import org.apache.catalina.websocket.MessageInbound;
import org.apache.catalina.websocket.WsOutbound;

public class MyWebSocket extends MessageInbound
{
	@Override
	protected void onOpen( WsOutbound outbound )
	{
		System.out.println( "connect...." );
		CharBuffer buffer = CharBuffer.wrap( "hello,welcome to connect!" );
		try
		{
			this.getWsOutbound().writeTextMessage( buffer );
		}
		catch ( IOException e )
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
		System.out.println( "onBinaryMessage....." );
	}

	@Override
	protected void onTextMessage( CharBuffer arg0 ) throws IOException
	{
		System.out.println( "onTextMessage....." );
	}
}
