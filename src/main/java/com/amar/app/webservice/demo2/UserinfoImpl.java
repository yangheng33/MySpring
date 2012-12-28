package com.amar.app.webservice.demo2;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.amar.db.ibatis.dao.AreaDAO;
import com.amar.web.model.Area;

@WebService( endpointInterface = "com.amar.app.webservice.demo2.IUserinfo" )
@Component( value="userinfoImpl" )
public class UserinfoImpl implements IUserinfo
{
	@Resource( name = "areaDAO" )
	private AreaDAO areaDAO;

	@Override
	public String getUsername( String userid )
	{
		@SuppressWarnings( "unused" )
		List<Area> list = areaDAO.getArea( new Area() );
		return userid + "123";
	}

}
