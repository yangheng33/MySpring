package com.amar.web.dwr;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.util.Logger;

@SuppressWarnings( { "rawtypes", "unchecked" } )
public class WebMessage
{
	public void addMessage( String text )
	{
		if ( text != null && text.trim().length() > 0 )
		{
			messages.addFirst( new ChatMessage( text ) );
			while ( messages.size() > 10 )
			{
				messages.removeLast();
			}
		}

		WebContext wctx = WebContextFactory.get();
		String currentPage = wctx.getCurrentPage();

		ScriptBuffer script = new ScriptBuffer();
		script.appendScript( "receiveMessages(" ).appendData( messages ).appendScript( ");" );

		Collection pages = wctx.getScriptSessionsByPage( currentPage );
		for( Iterator it = pages.iterator() ; it.hasNext() ; )
		{
			ScriptSession otherSession = ( ScriptSession ) it.next();
			otherSession.addScript( script );
		}
	}

	/**
	 * The current set of messages
	 */
	private LinkedList messages = new LinkedList();

	/**
	 * The log stream
	 */
	protected static final Logger log = Logger.getLogger( WebMessage.class );
}
