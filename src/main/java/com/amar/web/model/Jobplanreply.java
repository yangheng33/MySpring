package com.amar.web.model;
import java.util.Date;

public class Jobplanreply
{
private int id;

private int planid;

private int replyuserid;

private String replytimestart;

private String replytimeend;

private Date replytime;

private String content;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setPlanid( int planid )
{
this.planid=planid;
}

public int getPlanid()
{
return this.planid;
}

public void setReplyuserid( int replyuserid )
{
this.replyuserid=replyuserid;
}

public int getReplyuserid()
{
return this.replyuserid;
}

public void setReplytimestart( String replytimestart )
{
this.replytimestart=replytimestart;
}

public String getReplytimestart()
{
return this.replytimestart;
}

public void setReplytimeend( String replytimeend )
{
this.replytimeend=replytimeend;
}

public String getReplytimeend()
{
return this.replytimeend;
}

public void setReplytime( Date replytime )
{
this.replytime=replytime;
}

public Date getReplytime()
{
return this.replytime;
}

public void setContent( String content )
{
this.content=content;
}

public String getContent()
{
return this.content;
}

}