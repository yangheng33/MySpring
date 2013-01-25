package com.amar.web.model;
public class Jobdetail
{
private int id;

private int jobid;

private String usedtime;

private String state;

private String content;

public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setJobid( int jobid )
{
this.jobid=jobid;
}

public int getJobid()
{
return this.jobid;
}

public void setUsedtime( String usedtime )
{
this.usedtime=usedtime;
}

public String getUsedtime()
{
return this.usedtime;
}

public void setState( String state )
{
this.state=state;
}

public String getState()
{
return this.state;
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