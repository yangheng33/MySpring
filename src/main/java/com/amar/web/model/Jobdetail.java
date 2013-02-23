package com.amar.web.model;
public class Jobdetail
{
private int id;

private int jobid;

private String usedtime;

private String content;

private String title;

private int type;

private int count;

private int jobplanid;

private int projectid;

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

public String getContent()
{
	return content;
}

public void setContent( String content )
{
	this.content = content;
}

public String getTitle()
{
	return title;
}

public void setTitle( String title )
{
	this.title = title;
}

public int getType()
{
	return type;
}

public void setType( int type )
{
	this.type = type;
}

public int getCount()
{
	return count;
}

public void setCount( int count )
{
	this.count = count;
}

public int getJobplanid()
{
	return jobplanid;
}

public void setJobplanid( int jobplanid )
{
	this.jobplanid = jobplanid;
}

public int getProjectid()
{
	return projectid;
}

public void setProjectid( int projectid )
{
	this.projectid = projectid;
}

}