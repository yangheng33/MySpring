package com.amar.web.model;
import java.util.Date;

public class Jobplanlog
{
private int id;

private int jobplanid;

private int type;

private String content;

private String logtimestart;

private String logtimeend;

private Date logtime;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setJobplanid( int jobplanid )
{
this.jobplanid=jobplanid;
}

public int getJobplanid()
{
return this.jobplanid;
}

public void setType( int type )
{
this.type=type;
}

public int getType()
{
return this.type;
}

public void setContent( String content )
{
this.content=content;
}

public String getContent()
{
return this.content;
}

public void setLogtimestart( String logtimestart )
{
this.logtimestart=logtimestart;
}

public String getLogtimestart()
{
return this.logtimestart;
}

public void setLogtimeend( String logtimeend )
{
this.logtimeend=logtimeend;
}

public String getLogtimeend()
{
return this.logtimeend;
}

public void setLogtime( Date logtime )
{
this.logtime=logtime;
}

public Date getLogtime()
{
return this.logtime;
}

}