package com.amar.db.mongodb.impl;

import org.springframework.stereotype.Repository;

import com.amar.db.mongodb.base.MyDAO;
import com.amar.db.mongodb.dao.FB_RequestDAO;
import com.amar.web.model.FB_Request;

/** 
 * @description 
 * @date 2011-12-9 下午02:21:52 
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */

@Repository( "fb_RequestDAO" )
public class FB_RequestDAOImpl extends MyDAO < FB_Request > implements FB_RequestDAO
{

	public FB_RequestDAOImpl()
	{
		super( FB_Request.class );
	}

}
