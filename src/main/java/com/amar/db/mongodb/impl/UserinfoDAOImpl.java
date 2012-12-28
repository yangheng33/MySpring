package com.amar.db.mongodb.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.code.morphia.query.Query;
import com.amar.db.mongodb.base.MyDAO;
import com.amar.db.mongodb.base.Page;
import com.amar.db.mongodb.dao.UserinfoDAO;
import com.amar.web.model.Userinfo;

@Repository( "userinfoDAO" )
public class UserinfoDAOImpl extends MyDAO < Userinfo > implements UserinfoDAO
{

	public UserinfoDAOImpl()
	{
		super( Userinfo.class );

	}

	@Override
	public List < Userinfo > getAllUser( Page page )
	{
		Query < Userinfo > q = super.createQuery();

		return super.find( q , page ).asList();
	}

	public List<Userinfo> getUserExist( String existName )
	{
		Query < Userinfo > q = super.createQuery();
		
		q.field( existName ).exists();
		
		return super.find( q ).asList();
	}
}
