package com.amar.app.quartz;

import java.util.Date;

import com.amar.util.TimeDateUtil;

public class TimeQuartz
{

	public void printNow()
	{
		print( TimeDateUtil.getDateTime( new Date()  ));
	}
	
	public void print( String s )
	{
		System.out.println( s ); 
	}
	
	

}
