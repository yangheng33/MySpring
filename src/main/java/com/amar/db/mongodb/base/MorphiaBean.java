package com.amar.db.mongodb.base;

import java.util.logging.Logger;

import org.springframework.beans.factory.InitializingBean;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.mapping.Mapper;
import com.mongodb.DB;
import com.mongodb.Mongo;

public class MorphiaBean extends Morphia implements InitializingBean
{

	private Mongo mongo = null;

	private String dbName = null;

	private Datastore ds = null;

	private DB db = null;

	public Datastore getDataStore()
	{
		if ( this.mongo == null || this.dbName == null ) { return null; }
		if ( ds == null )
		{
			ds = createDatastore( mongo , dbName );
			db = ds.getDB();
		}
		return ds;
	}

	public Mongo getMongo()
	{
		return mongo;
	}

	public void setMongo( Mongo mongo )
	{
		this.mongo = mongo;
	}

	public String getDbName()
	{
		return dbName;
	}

	public void setDbName( String dbName )
	{
		this.dbName = dbName;
	}

	public void afterPropertiesSet() throws Exception
	{
		if ( this.mongo == null || this.dbName == null ) { return; }
		if ( ds == null )
		{
			ds = createDatastore( mongo , dbName );
			db = ds.getDB();
		}
		java.util.logging.Logger maplog = Logger.getLogger( Mapper.class.getName() );
		// 设置日志级别
		maplog.setLevel( java.util.logging.Level.SEVERE );
	}

	public DB getDb()
	{
		return db;
	}

}