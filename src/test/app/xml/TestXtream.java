package app.xml;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.amar.web.model.Area;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

/**
 * @description
 * @date 2012-2-15 下午04:35:19
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
public class TestXtream
{
	private XStream xstream = null;

	private ObjectOutputStream out;

	private ObjectInputStream in;

	private Area area = null;

	@Test
	public void testArea()
	{
		xstream.alias( "area" , Area.class );

		System.out.println( xstream.toXML( area ) );

		xstream = new XStream( new JsonHierarchicalStreamDriver() );

		xstream.alias( "area" , Area.class );

		System.out.println( xstream.toXML( area ) );

		Assert.assertTrue( true );
	}

	@Before
	public void init()
	{
		try
		{
			xstream = new XStream();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

		area = new Area();
		area.setAreatype( "001" );
		area.setId( 1 );
		area.setName( "北京" );
		area.setPostcode( "100029" );
		area.setBelongto( 1 );

	}

	@After
	public void destory()
	{
		xstream = null;
		try
		{
			if ( out != null )
			{
				out.flush();
				out.close();
			}
			if ( in != null )
			{
				in.close();
			}
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		System.gc();
	}
}
