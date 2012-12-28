package com.amar.onlytest.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
@SuppressWarnings( "unused" )
public class BuildFile
{

	public static void main( String [] args )
	{
		BuildFile bf = new BuildFile();

		// boolean first = bf.checkNotAddicted( "D:/svn4/svn4/" , "addicted.properties");

		bf.setNotAddicted( "open" , "D:/svn4/svn4/" , "addicted.properties" );
	}

	public void setNotAddicted( String closeOrOpen , String path , String filename )
	{
		try
		{
			File file = getFileByPath( path , filename );

			Properties props = new Properties();

			props.load( new FileReader( file ) );

			props.setProperty( "NotAddicted" , closeOrOpen );
			
			//props.store( new FileOutputStream( path + filename , true ) , "" );
		}
		catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	public boolean checkNotAddicted( String path , String filename )
	{
		boolean re = false;

		try
		{
			File file = getFileByPath( path , filename );

			Properties props = new Properties();

			props.load( new FileReader( file ) );

			String notAddicted = props.getProperty( "NotAddicted" );

			if ( notAddicted == null || "".equals( notAddicted ) )
			{
				re = false;
			}
			else if ( "close".equalsIgnoreCase( notAddicted.trim() ) )
			{
				re = false;
			}
			else if ( "open".equalsIgnoreCase( notAddicted.trim() ) )
			{
				re = true;
			}

		}
		catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}

		return re;
	}

	public File getFileByPath( String path , String filename )
	{
		File dir = new File( path );
		File file = new File( path + filename );

		try
		{
			if ( ! dir.exists() )
			{
				dir.mkdirs();
			}

			if ( ! file.exists() )
			{
				file.createNewFile();
			}
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}

		return file;
	}
}
