package com.amar.db.mongodb.dao;

import java.util.List;

import com.amar.db.mongodb.base.Page;
import com.amar.web.model.Userinfo;

public interface UserinfoDAO
{
	public List<Userinfo> getAllUser( Page page );
	
	public List<Userinfo> getUserExist( String existName );
}
