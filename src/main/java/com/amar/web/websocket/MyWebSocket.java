package com.amar.web.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Date;

import org.apache.catalina.websocket.MessageInbound;
import org.apache.catalina.websocket.WsOutbound;

import com.amar.util.TimeDateUtil;

public class MyWebSocket extends MessageInbound
{

	private MyWebSocketServlet myWebSocketServlet;

	private String username = null;

	public MyWebSocket( String username )
	{
		this.username = username;
	}

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
				CharBuffer buffer = CharBuffer.wrap( "你好,"+username+" ! 欢迎光临，本程序使用websocket! " );
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
		myWebSocketServlet.close( username );
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
		String datetime = TimeDateUtil.getDateTime( new Date().getTime() );
		myWebSocketServlet.broadcast( ""+username+" "+datetime+"\n"+arg0.toString() );
	}

}
