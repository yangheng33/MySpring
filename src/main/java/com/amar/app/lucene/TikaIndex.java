package com.amar.app.lucene;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.document.Field.Store;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class TikaIndex extends Index
{


	public long starttime;

	public long endtime;

	private TikaFilesFilter filter = new TikaFilesFilter();

	public TikaIndex()
	{
		
	}
	
	
	public static void main( String [] args )
	{

		// String dataPath = "D:\\work\\项目文档";
//		String dataPath = "C:\\test\\data";
//		String indexPath = "C:\\test\\index";
//
//		TikaIndex index = new TikaIndex();
//		index.starttime = System.currentTimeMillis();
//
//		index.initWriter( indexPath );
//		index.makeIndex( dataPath );
//
//		index.endtime = System.currentTimeMillis();
//
//		System.out.println( "用时" + ( index.endtime - index.starttime ) + "毫秒" );
	}
	
	

	public void makeIndex( String dataPath )
	{
		makeIndexDetail(dataPath);
		writeClose();
	}
	
	
	public void makeIndexDetail( String dataPath )
	{
		File dataFile = new File( dataPath );
		if ( dataFile.isDirectory() )
		{
			for( File subFile : dataFile.listFiles() )
			{
				makeIndexDetail( subFile.getPath() );
			}
		}
		else if ( filter.accept( dataFile ) && ! dataFile.isHidden() && dataFile.exists() && dataFile.canRead() )
		{
			Document document = new Document();

			String tikaContent = tika( dataFile );
			Field pathField = new StringField( "path" , dataFile.getPath() , Store.YES );
			Field nameField = new StringField( "name" , dataFile.getName() , Store.NO );

			Field contentField = new TextField( "content" , tikaContent , Store.NO );
			
			document.add( pathField );
			document.add( nameField );
			document.add( contentField );

			writeDocument( document );
		}
	}


	public String tika( File file )
	{
		InputStream is = null;
		ContentHandler handler = new BodyContentHandler();
		try
		{
			is = new FileInputStream( file );

			Parser parser = new AutoDetectParser();

			ParseContext context = new ParseContext();
			context.set( Parser.class , parser );

			Metadata metadata = new Metadata();

			metadata.set( Metadata.RESOURCE_NAME_KEY , file.getName() );

			parser.parse( is , handler , metadata , context );

		}
		catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		catch ( SAXException e )
		{
			e.printStackTrace();
		}
		catch ( TikaException e )
		{
			e.printStackTrace();
		}
		finally
		{
			if ( is != null )
			{
				try
				{
					is.close();
				}
				catch ( IOException e )
				{
					e.printStackTrace();
				}
			}
		}
		return handler.toString();
	}

}
