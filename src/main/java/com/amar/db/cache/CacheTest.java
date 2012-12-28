package com.amar.db.cache;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.googlecode.ehcache.annotations.Cacheable;

@Service( "cacheTest" )
public class CacheTest
{
	@Cacheable( cacheName = "allCache" )
	public String addArea( String s )
	{
		Date date = new Date();
		return date.toString();
	}

	public void delArea()
	{
		System.out.println( "in del" );
	}
}
