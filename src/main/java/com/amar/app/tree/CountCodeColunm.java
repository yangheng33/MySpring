package com.amar.app.tree;

import java.io.*;

public class CountCodeColunm
{
	private boolean countCondition( String filename )
	{
		boolean re = false;
		
		String [] codePatten = { "html" , "jsp" ,"properties" , "xml" ,"java"};
		
		for( String patten : codePatten ) 
		{
			if( filename.toLowerCase().endsWith( patten.toLowerCase() ) )
			{
				re = true;
			}
		}
		
		return re;
	}
	
	public long countOneFile( File file )
	{
		long re = 0;
		
		try
		{
			if ( countCondition( file.getName() ) )
			{
				BufferedReader in = new BufferedReader( new FileReader( file.getPath() ) );
				
				while( true )
				{
					if( in.readLine() != null )
					{
						re ++;
					}
					else
					{
						break;
					}
					
				}
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return re;
	}
}
