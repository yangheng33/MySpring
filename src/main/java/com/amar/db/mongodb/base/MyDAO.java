package com.amar.db.mongodb.base;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.InitializingBean;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.dao.BasicDAO;
import com.google.code.morphia.query.Query;
import com.google.code.morphia.query.QueryResults;
import com.google.code.morphia.query.UpdateOperations;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.amar.util.TimeDateUtil;

public class MyDAO< T > implements InitializingBean
{
	@Resource( name = "morphia" )
	protected MorphiaBean morphia;

	protected BasicDAO < T , ObjectId > dao;

	protected Datastore ds;

	private Class < T > clazz;

	protected Log log = null;

	public MyDAO( Class < T > clazz )
	{
		super();
		this.clazz = clazz;
		log = LogFactory.getLog( clazz );
	}

	public void afterPropertiesSet() throws Exception
	{
		this.ds = morphia.getDataStore();
		dao = new BasicDAO < T , ObjectId >( clazz , this.ds );
	}

	/**
	 * 增加
	 */
	public void add( T t )
	{
		dao.save( t );
	}

	/**
	 * 创建一个查询
	 */
	protected Query < T > createQuery()
	{
		return dao.createQuery();
	}

	/**
	 * 根据_id查询
	 */
	protected Query < T > createIdQuery( Object _id )
	{
		return dao.createQuery().field( "_id" ).equal( _id );
	}

	/**
	 * 查找一个实体
	 */
	protected T findOne( Query < T > q )
	{
		return dao.findOne( q );
	}

	/**
	 * 根据_id查找
	 */
	public T findById( ObjectId _id )
	{
		return dao.findOne( "_id" , _id );
	}

	/**
	 * 可查找多个实体
	 */
	protected QueryResults < T > find( Query < T > q )
	{
		return dao.find( q );
	}

	/**
	 * 返回全部实体
	 */
	public List < T > getAll()
	{
		return this.find( this.createQuery() ).asList();
	}

	/**
	 * 分页获取
	 */
	public List < T > getByPage( Page page )
	{
		Query < T > q = this.createQuery();
		if ( page != null )
		{
			q.limit( page.getPageSize() ).offset( ( page.getPageIndex() - 1 ) * page.getPageSize() );
			page.setTotalCount( ( int ) q.countAll() );
		}
		return dao.find( q ).asList();
	}

	/**
	 * 获取数量
	 */
	protected long getCount( Query < T > q )
	{
		return dao.count( q );
	}

	/**
	 * 分页查找
	 */
	protected QueryResults < T > find( Query < T > q , Page page )
	{
		if ( page != null )
		{
			q.limit( page.getPageSize() ).offset( ( page.getPageIndex() - 1 ) * page.getPageSize() );
			page.setTotalCount( ( int ) q.countAll() );
		}
		return dao.find( q );
	}

	/**
	 * 创建一个更新操作
	 */
	protected UpdateOperations < T > createUpdateOperations()
	{
		UpdateOperations < T > ops = dao.createUpdateOperations();
		return ops;
	}

	/**
	 * 删除实体
	 */
	protected void delete( T t )
	{
		dao.delete( t );
	}

	/**
	 * 根据查询删除
	 */
	protected void delete( Query < T > q )
	{
		dao.deleteByQuery( q );
	}

	/**
	 * 根据_id删除
	 */
	public void delById( ObjectId id )
	{
		Query < T > q = this.createIdQuery( id );
		dao.deleteByQuery( q );

	}

	/**
	 * 更新
	 */
	protected void update( Query < T > q , UpdateOperations < T > ops )
	{
		dao.update( q , ops );
	}

	/**
	 * 更新，bCreate指定当不存在时是否新加
	 */
	protected void update( Query < T > q , UpdateOperations < T > ops , boolean bCreate )
	{
		this.ds.update( q , ops , bCreate );
	}

	/**
	 * 已知_id进行添加就是更新覆盖
	 */
	public void update( T t )
	{
		dao.save( t );
	}

	/**
	 * 更新字段
	 */
	protected void updateFields( Query < T > q , String [] fields , Object [] values )
	{
		UpdateOperations < T > ops = this.createUpdateOperations();
		for( int i = 0 ; i < fields.length ; i ++ )
		{
			ops.set( fields[ i ] , values[ i ] );
		}
		this.update( q , ops );
	}

	/*************** 同步用 *******************************/
	public void requestStart()
	{
		morphia.getDb().requestStart();
	}

	public boolean checkUpdateStatus()
	{
		DBObject err = this.getLastError();
		if ( Boolean.valueOf( "" + err.get( "updatedExisting" ) ) == false )
		{
			// 修改时已经被修改了，需要给予origin值
			this.requestDone();
			return false;
		}
		this.requestDone();
		return true;
	}

	public boolean checkDeleteStatus()
	{
		DBObject err = this.getLastError();
		if ( Long.valueOf( err.get( "n" ).toString() ) == 0 )
		{
			// 已经被删除了
			this.requestDone();
			return false;
		}
		this.requestDone();
		return true;
	}

	public boolean checkAddStatus()
	{
		DBObject err = this.getLastError();
		if ( err.get( "code" ) != null )
		{
			// 已经添加了，需要添加索引
			this.requestDone();
			return false;
		}
		this.requestDone();
		return true;
	}

	protected void requestDone()
	{
		morphia.getDb().requestDone();
	}

	protected DBObject getLastError()
	{
		return morphia.getDb().getLastError();
	}
	
	public DBCollection getCollection() { 
		return this.dao.getCollection();
	}

	/********************* utils *******************/
	public String getDateID()
	{
		String date = TimeDateUtil.getDate( System.currentTimeMillis() );
		date = date.replace( "-" , "" );
		Random r = new Random();
		if ( r.nextBoolean() )
		{
			date += ( char ) ( 'A' + r.nextInt( 26 ) );
		}
		else
		{
			date += ( char ) ( 'a' + r.nextInt( 26 ) );
		}
		if ( r.nextBoolean() )
		{
			date += ( char ) ( 'A' + r.nextInt( 26 ) );
		}
		else
		{
			date += ( char ) ( 'a' + r.nextInt( 26 ) );
		}
		if ( r.nextBoolean() )
		{
			date += ( char ) ( 'A' + r.nextInt( 26 ) );
		}
		else
		{
			date += ( char ) ( 'a' + r.nextInt( 26 ) );
		}
		if ( r.nextBoolean() )
		{
			date += ( char ) ( 'A' + r.nextInt( 26 ) );
		}
		else
		{
			date += ( char ) ( 'a' + r.nextInt( 26 ) );
		}
		if ( r.nextBoolean() )
		{
			date += ( char ) ( 'A' + r.nextInt( 26 ) );
		}
		else
		{
			date += ( char ) ( 'a' + r.nextInt( 26 ) );
		}
		if ( r.nextBoolean() )
		{
			date += ( char ) ( 'A' + r.nextInt( 26 ) );
		}
		else
		{
			date += ( char ) ( 'a' + r.nextInt( 26 ) );
		}
		return date;
	}

}
