package com.amar.db.mongodb.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.amar.db.mongodb.base.MyDAO;
import com.amar.db.mongodb.base.Page;
import com.amar.db.mongodb.dao.MapReduceTestDAO;
import com.amar.web.model.CountTest;
import com.google.code.morphia.query.Query;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.GroupCommand;
import com.mongodb.MapReduceOutput;
@SuppressWarnings( "unused" )
@Repository( "mapReduceTestDAO" )
public class MapReduceTestDAOImpl extends MyDAO < CountTest > implements MapReduceTestDAO
{
	private final Logger log = Logger.getLogger( this.getClass() );

	public MapReduceTestDAOImpl()
	{
		super( CountTest.class );

	}

	@Override
	public List < CountTest > getCountTestMaxValue( int MaxN )
	{
		DBObject q = new BasicDBObject();

		DBObject q1 = new BasicDBObject();
		q1.put( "$lt" , 10 );
		q.put( "value" , q1 );

		JSONObject json = null;

		String first = "function(){ emit( this.type,this.value); }";
		String second = "function(key, values){ var count=0; for(var i in values){ count+=values[i]; } return {'d':key,'m':count};}";

		MapReduceOutput out = getCollection().mapReduce( first , second , "" + System.currentTimeMillis() , q );

		DBCursor cur = out.getOutputCollection().find();
		while ( cur.hasNext() )
		{
			q = cur.next();

			json = JSONObject.fromObject( q );

			System.out.println( json.toString() );
		}
		out.drop();

		log.info( "info in MapReduceTestDAOImpl getCountTestMaxValue( int )" );
		log.error( "error in MapReduceTestDAOImpl getCountTestMaxValue( int )" );
		return null;
	}

	public List < CountTest > getAllByPage( Page page , String ordername )
	{
		Query < CountTest > q = super.createQuery();
		q.order( ordername );

		if ( page != null )
		{
			q.limit( page.getPageSize() ).offset( ( page.getPageIndex() - 1 ) * page.getPageSize() );
			page.setTotalCount( ( int ) q.countAll() );
		}
		return dao.find( q ).asList();
	}

	public long total()
	{
		DBObject q = new BasicDBObject();

		JSONObject json = null;

		// String map = "function(){ emit( '1',{'v':this.value}); }";
		// String reduce = "function(key, values){ var count=0;var total=0; for(var i in values){ total+=values[i].v; count++; } return {'count':count,'total':total,'flag':0};}";

		String map = "function(){ if(!isNaN(this.value)) emit( 1,{'v':this.value}); }";
		String reduce = "function(key, values){ var count=0;var total=0; for(var i in values){ if(!isNaN(values[i].v)) {total+=values[i].v;} count++; } return {'count':count,'total':total,'flag':0};}";

		DBObject cmd = new BasicDBObject();
		cmd.put( "mapreduce" , "CountTest" );
		cmd.put( "map" , map );
		cmd.put( "reduce" , reduce );
		cmd.put( "out" , "t_" + System.currentTimeMillis() );
		cmd.put( "verbose" , true );
		cmd.put( "keeptemp" , true );
		cmd.put( "limit" , 2000 );
		// String finalize = "function finalize(key, value){ value.flag=1; return value ;}";
		// cmd.put( "finalize" , finalize );

		MapReduceOutput out = getCollection().mapReduce( cmd );
		DBCursor cur = out.getOutputCollection().find();
		while ( cur.hasNext() )
		{
			q = cur.next();

			json = JSONObject.fromObject( q );

			System.out.println( json.toString() );
		}
		out.drop();
		return 0;
	}

	@SuppressWarnings( value={"unchecked", "rawtypes" } )
	public long total_group()
	{
		DBObject initial = new BasicDBObject();
		DBObject key = new BasicDBObject();
		DBObject cond = new BasicDBObject();
		key.put( "type" , true );
		initial.put( "count" , 0 );

		String reduce = "function(obj,prev){ prev.count++;}";

		DBObject result = getCollection().group( key , cond , initial , reduce );
		
		JSONArray jsons = JSONArray.fromObject( result );
		Map map = new HashMap();
		if ( jsons != null ) 
		for( int i = 0 ; i < jsons.size() ; i ++ )
		{
			JSONObject json = jsons.getJSONObject( i );
			System.out.println( json.toString() );
			log.info( json.toString() );
			String name = json.getString( "type" );
			Float value = Float.parseFloat( json.getString( "count" ) );
			map.put( name , value.longValue() );
			
		}
		
		log.info( map.toString() );
		return 0;
	}

}
