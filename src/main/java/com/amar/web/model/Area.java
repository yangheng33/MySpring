package com.amar.web.model;

import java.io.Serializable;

public class Area implements Serializable
{
	private static final long serialVersionUID = 7938752570194694550L;
	private int id;
	private int belongto;
	private String postcode;
	private String areatype;
	private String name;

	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public int getBelongto()
	{
		return belongto;
	}

	public void setBelongto( int belongto )
	{
		this.belongto = belongto;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode( String postcode )
	{
		this.postcode = postcode;
	}

	public String getAreatype()
	{
		return areatype;
	}

	public void setAreatype( String areatype )
	{
		this.areatype = areatype;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append( "Area [id=" );
		builder.append( id );
		builder.append( ", belongto=" );
		builder.append( belongto );
		builder.append( ", " );
		if ( postcode != null )
		{
			builder.append( "postcode=" );
			builder.append( postcode );
			builder.append( ", " );
		}
		if ( areatype != null )
		{
			builder.append( "areatype=" );
			builder.append( areatype );
			builder.append( ", " );
		}
		if ( name != null )
		{
			builder.append( "name=" );
			builder.append( name );
		}
		builder.append( "]" );
		return builder.toString();
	}

	@Override
	public boolean equals( Object obj )
	{
		if ( obj == null || this == null )
		{
			return false;
		}
		else
		{
			return this.toString().equals( obj.toString() );
		}
	}

	@Override
	public int hashCode()
	{
		return this.toString().hashCode();
	}
}
