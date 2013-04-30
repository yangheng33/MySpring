package com.amar.db.ibatis.page;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.parameter.DefaultParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.apache.ibatis.session.Configuration;

import com.amar.web.framework.BaseModel;

@SuppressWarnings( "unused" )
@Intercepts( { @Signature( type = StatementHandler.class , method = "prepare" , args = { Connection.class } ) } )
public class PagePlugin implements Interceptor
{
	private final Logger log = Logger.getLogger( this.getClass() );

	@Override
	public Object intercept( Invocation invocation ) throws Throwable
	{
		StatementHandler statementHandler = ( StatementHandler ) invocation.getTarget();
		MetaObject metaStatementHandler = MetaObject.forObject( statementHandler );

		RowBounds rowBounds = ( RowBounds ) metaStatementHandler.getValue( "delegate.rowBounds" );
		if ( rowBounds == null || rowBounds == RowBounds.DEFAULT )
		{
			return invocation.proceed();
		}

		DefaultParameterHandler defaultParameterHandler = ( DefaultParameterHandler ) metaStatementHandler.getValue( "delegate.parameterHandler" );
		//BaseModel model = (BaseModel)defaultParameterHandler.getParameterObject();
		/*
		Map parameterMap = ( Map ) defaultParameterHandler.getParameterObject();
		Object sidx = parameterMap.get( "_sidx" );
		Object sord = parameterMap.get( "_sord" );
		*/
		
		String originalSql = ( String ) metaStatementHandler.getValue( "delegate.boundSql.sql" );
		/*
		if ( sidx != null && sord != null )
		{
			originalSql = originalSql + " order by " + sidx + " " + sord;
		}
		 */
		Configuration configuration = ( Configuration ) metaStatementHandler.getValue( "delegate.configuration" );

		Dialect.Type databaseType = null;
		try
		{
			databaseType = Dialect.Type.valueOf( configuration.getVariables().getProperty( "dialect" ).toUpperCase() );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		if ( databaseType == null )
		{
			throw new RuntimeException( "the value of the dialect property in configuration.xml is not defined : " + configuration.getVariables().getProperty( "dialect" ) );
		}
		Dialect dialect = null;
		switch ( databaseType )
		{
		case ORACLE:
			dialect = new OracleDialect();
			break;
		case MYSQL:
			dialect = new MysqlDialect();
			break;
		}

		metaStatementHandler.setValue( "delegate.boundSql.sql" , dialect.getLimitString( originalSql , rowBounds.getOffset() , rowBounds.getLimit() ) );
		metaStatementHandler.setValue( "delegate.rowBounds.offset" , RowBounds.NO_ROW_OFFSET );
		metaStatementHandler.setValue( "delegate.rowBounds.limit" , RowBounds.NO_ROW_LIMIT );
		if ( log.isDebugEnabled() )
		{
			BoundSql boundSql = statementHandler.getBoundSql();
			log.debug( "生成分页SQL : " + boundSql.getSql() );
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin( Object target )
	{
		return Plugin.wrap( target , this );
	}

	@Override
	public void setProperties( Properties properties )
	{
		log.info( properties.toString() );

	}

}
