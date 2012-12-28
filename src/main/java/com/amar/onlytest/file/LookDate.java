package com.amar.onlytest.file;

import java.util.Calendar;

import com.amar.util.TimeDateUtil;

/**
 * @description
 * @date 2011-11-18 下午01:25:43
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
@SuppressWarnings( "unused" )
public class LookDate
{

	/**
	 * @param args
	 * @return void
	 * @description
	 */
	public static void main( String [] args )
	{
		LookDate lookDate = new LookDate();
		
		lookDate.lookNow();
		lookDate.lookToday();
		lookDate.lookYesterday();
		
		java.util.Random r = new java.util.Random();
		long rd = r.nextLong();
		lookDate.p( rd +"" );
		
		
	}

	public void lookNow()
	{
		long ct = System.currentTimeMillis();
		String now = TimeDateUtil.getDateTime( ct );
		p( "现在:"+now);
	}
	
	public void lookToday()
	{
		long ct = System.currentTimeMillis();
		long sday = TimeDateUtil.getDayTime( ct );// 开始时间
		long eday = sday + 24 * 3600 * 1000;// 结束时间
		p( "今天:"+sday + "," + eday );
		
	}
	
	public boolean between(long p1 ,long p2 , long p3)
	{
		boolean re= true;
		
		if( p1>p2 && p2>p3){}
		else if( p1<p2 && p2<p3){}
		else
			re = false;
			
		return re;
	}

	public void lookYesterday()
	{
		long ct = System.currentTimeMillis();
		long sday = TimeDateUtil.getDayTime( ct );// 开始时间
		long eday = sday + 24 * 3600 * 1000;// 结束时间

		sday = sday - 24 * 3600 * 1000;
		eday = eday - 24 * 3600 * 1000;

		p( "昨天:"+sday + "," + eday );
		
		p(  between( sday,1321544618507L, eday)+"" );
		
		p( "测试1:"+TimeDateUtil.getDateTime( 1326816000000L ) );
		p( "测试2:"+TimeDateUtil.getDateTime( 1326988799000L ) );
		p( "测试3:"+TimeDateUtil.getDateTime( 1326729700000L ) );
	}
	
	public void p( String src )
	{
		System.out.println( src );
	}
}
