package com.amar.web.model;

public class Jobplanfile
{
	private int id;

	private int type;

	private String path;

	private String filename;

	private int userid;

	private int jobplanid;

	public void setId( int id )
	{
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}

	public void setType( int type )
	{
		this.type = type;
	}

	public int getType()
	{
		return this.type;
	}

	public void setPath( String path )
	{
		this.path = path;
	}

	public String getPath()
	{
		return this.path;
	}

	public void setFilename( String filename )
	{
		this.filename = filename;
	}

	public String getFilename()
	{
		return this.filename;
	}

	public int getUserid()
	{
		return userid;
	}

	public void setUserid( int userid )
	{
		this.userid = userid;
	}

	public int getJobplanid()
	{
		return jobplanid;
	}

	public void setJobplanid( int jobplanid )
	{
		this.jobplanid = jobplanid;
	}

}
