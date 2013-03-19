package com.amar.web.model;
import java.util.Date;

public class Diary
{
	private long id;

	private int userid;

	private Date diarytime;

	private String content;

	private String type;

	private String diarytimeStart;

	private String diarytimeEnd;

	public void setId( long id )
	{
		this.id = id;
	}

	public long getId()
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

	public String getDiarytimeStart()
	{
		return diarytimeStart;
	}

	public void setDiarytimeStart( String diarytimeStart )
	{
		this.diarytimeStart = diarytimeStart;
	}

	public String getDiarytimeEnd()
	{
		return diarytimeEnd;
	}

	public void setDiarytimeEnd( String diarytimeEnd )
	{
		this.diarytimeEnd = diarytimeEnd;
	}

}