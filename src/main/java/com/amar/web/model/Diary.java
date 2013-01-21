package com.amar.web.model;
import java.util.Date;

public class Diary
{
	private int id;

	private int userid;

	private Date diarytime;

	private String content;

	private String type;

	private String diarytime_start;

	private String diarytime_end;

	public void setId( int id )
	{
		this.id = id;
	}

	public String getDiarytime_start()
	{
		return diarytime_start;
	}

	public void setDiarytime_start( String diarytime_start )
	{
		this.diarytime_start = diarytime_start;
	}

	public String getDiarytime_end()
	{
		return diarytime_end;
	}

	public void setDiarytime_end( String diarytime_end )
	{
		this.diarytime_end = diarytime_end;
	}

	public int getId()
	{
		return this.id;
	}

	public void setUserid( int userid )
	{
		this.userid = userid;
	}

	public int getUserid()
	{
		return this.userid;
	}

	public void setDiarytime( Date diarytime )
	{
		this.diarytime = diarytime;
	}

	public Date getDiarytime()
	{
		return this.diarytime;
	}

	public void setContent( String content )
	{
		this.content = content;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setType( String type )
	{
		this.type = type;
	}

	public String getType()
	{
		return this.type;
	}

}