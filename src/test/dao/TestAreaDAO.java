package dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import base.AbstractBaseTest;
import com.amar.db.ibatis.dao.AreaDAO;
import com.amar.db.ibatis.dao.impl.AreaDAOImpl;
import com.amar.web.model.Area;
import com.google.code.morphia.utils.Assert;

@SuppressWarnings( "unused" )
public class TestAreaDAO extends AbstractBaseTest
{

	@Resource( name = "areaDAO" )
	private AreaDAO areaDAO;

	
	@Resource( name = "areaDAOImpl" )
	private AreaDAOImpl areaDAOImpl;
	
	
	@Test
	@Ignore
	public void testArea()
	{
		List<Area> list = areaDAO.getArea( new Area() );
		System.out.println( "in testAreaDAO" );
		Assert.isTrue( list != null && list.size() > 0 );
	}
	
	@Test
	@Ignore
	public void testArea1()
	{
		Area area = new Area();
		area.setAreatype( "002" );
		area.setBelongto( 1 );
		//area.setId( 15 );
		area.setName( "三都" );
		area.setPostcode( "100029" );
		
		areaDAO.addArea( area );
		System.out.println( "obj:"+area.toString() );
		Assert.isTrue( true );
	}
	
	@Test
	@Ignore
	public void testArea2()
	{
		Area area = new Area();
		area.setAreatype( "001" );
		area.setBelongto( 1 );
		//area.setId( 16 );
		area.setName( "三都" );
		area.setPostcode( "100029" );
		
		Assert.isTrue( true );
	}
	
	@Test
	public void testArea3()
	{
		Area area = new Area();
		List<Area> areaList1 = areaDAO.getArea( area );
		Assert.isEqual( areaList1.size() , 8 );
		
	}

	
	@Test
	public void testArea4()
	{
		Area area = new Area();
		List<Area> areaList1 = areaDAO.getArea( area );
		Assert.isEqual( areaList1.size() , 8 );
		
	}
	

}
