package com.amar.web.model;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(noClassnameStored=true)
public class CountTest
{

	@Id
	private ObjectId id;
	private String name;
	private long value;
	private String type;
	
	public static final String NAME="name";
	public static final String VALUE="value";
	public static final String TYPE="type";
	
	public ObjectId getId()
	{
		return id;
	}
	public void setId( ObjectId id )
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName( String name )
	{
		this.name = name;
	}
	public long getValue()
	{
		return value;
	}
	public void setValue( long value )
	{
		this.value = value;
	}
	public String getType()
	{
		return type;
	}
	public void setType( String type )
	{
		this.type = type;
	}
	
	
	
}
