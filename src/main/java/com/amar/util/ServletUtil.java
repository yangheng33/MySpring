package com.amar.util;

import java.lang.reflect.Field;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.bson.types.ObjectId;

public class ServletUtil
{
	/**
	 * 通过反射从request中读取参数到对象
	 * 
	 * @param request
	 * @param objClass
	 * @return
	 */
	public static < T > T getRequestObject( HttpServletRequest request , Class<T> objClass )
	{

		T t = null;
		Object t1 = null;
		try
		{
			t = objClass.newInstance();
			Field [] fields = objClass.getDeclaredFields();
			for( Field f : fields )
			{
				f.setAccessible( true );
				t1 = request.getParameter( f.getName() );
				if ( t1 != null )
				{
					if ( f.getType() == Integer.class || f.getType() == Integer.TYPE )
					{
						t1 = t1.equals( "" ) ? "0" : t1;
						f.set( t , Integer.valueOf( t1.toString() ) );
					}
					else if ( f.getType() == String.class )
					{
						f.set( t , String.valueOf( t1.toString() ) );
					}
					else if ( f.getType() == Long.class || f.getType() == Long.TYPE )
					{
						t1 = t1.equals( "" ) ? "0" : t1;
						f.set( t , Long.valueOf( t1.toString() ) );
					}
					else if ( f.getType() == Float.class || f.getType() == Float.TYPE )
					{
						t1 = t1.equals( "" ) ? "0" : t1;
						f.set( t , Float.valueOf( t1.toString() ) );
					}
					else if ( f.getType() == Double.class || f.getType() == Double.TYPE )
					{
						t1 = t1.equals( "" ) ? "0" : t1;
						f.set( t , Double.valueOf( t1.toString() ) );
					}
					else if ( f.getType() == Boolean.class || f.getType() == Boolean.TYPE )
					{
						t1 = t1.equals( "" ) ? "false" : t1;
						f.set( t , Boolean.valueOf( t1.toString() ) );
					}
					else if ( f.getType() == ObjectId.class )
					{
						t1 = t1.equals( "" ) ? "0" : t1;
						f.set( t , new ObjectId( t1.toString() ) );
					}

				}

			}
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

		return t;
	}

	@SuppressWarnings( "rawtypes" )
	public static < T > T request2Bean( HttpServletRequest request , Class<T> beanClass )
	{
		try
		{
			/** 创建封装数据的bean **/
			T bean = beanClass.newInstance();
			Map map = request.getParameterMap();
			BeanUtils.populate( bean , map );
			return bean;
		}
		catch ( Exception e )
		{
			throw new RuntimeException( e );
		}
	}

	/**
	 * 检查t是否为空值或者空字符串，是返回true,否返回false
	 */
	public static < T > boolean checkIsNull( T t )
	{
		if ( t == null )
			return true;
		if ( "".equals( t ) )
			return true;
		return false;
	}

}
