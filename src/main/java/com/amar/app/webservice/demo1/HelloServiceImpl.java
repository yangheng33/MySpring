package com.amar.app.webservice.demo1;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import com.amar.db.ibatis.dao.AreaDAO;
import com.amar.web.model.Area;

@WebService(endpointInterface = "com.amar.app.webservice.demo1.IHelloService")
public class HelloServiceImpl implements IHelloService
{
	
	@Resource( name = "areaDAO" )
	private AreaDAO areaDAO;
	
	@Override
	public Customer selectMaxAgeStudent( Customer c1 , Customer c2 )
	{
		
		@SuppressWarnings( "unused" )
		List<Area> list = areaDAO.getArea( new Area() );
		
		if ( c1.getBirthday().getTime() > c2.getBirthday().getTime() )
		{
			return c2;
		}
		else
		{
			return c1;
		}
	}

	@Override
	public Customer selectMaxLongNameStudent( Customer c1 , Customer c2 )
	{
		if ( c1.getName().length() > c2.getName().length() )
		{
			return c1;
		}
		else
		{
			return c2;
		}
	}
}
