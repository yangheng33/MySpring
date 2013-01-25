package com.amar.web.model;
import java.util.Date;

public class Job
{
private int id;

private int userid;

private String jobtimestart;

private String jobtimeend;

private Date jobtime;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setUserid( int userid )
{
this.userid=userid;
}

public int getUserid()
{
return this.userid;
}


public void setJobtime( Date jobtime )
{
this.jobtime=jobtime;
}

public Date getJobtime()
{
return this.jobtime;
}

public String getJobtimestart()
{
	return jobtimestart;
}

public void setJobtimestart( String jobtimestart )
{
	this.jobtimestart = jobtimestart;
}

public String getJobtimeend()
{
	return jobtimeend;
}

public void setJobtimeend( String jobtimeend )
{
	this.jobtimeend = jobtimeend;
}

}