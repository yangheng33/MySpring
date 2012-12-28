package com.amar.web.model;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/** 
 * @description 
 * @date 2011-12-9 下午02:19:50 
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
@Entity(noClassnameStored=true)
public class FB_Request
{
	@Id
	private ObjectId id;
	private String content;
	
	public ObjectId getId()
	{
		return id;
	}
	public void setId( ObjectId id )
	{
		this.id = id;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent( String content )
	{
		this.content = content;
	}
	
	
}
