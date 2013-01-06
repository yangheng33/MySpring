package com.amar.web.model;
import java.util.Date;

public class Remindlog
{
private int id;

private int remindplanid;

private Date logtime;

private String state;

private String type;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setRemindplanid( int remindplanid )
{
this.remindplanid=remindplanid;
}

public int getRemindplanid()
{
return this.remindplanid;
}

public void setLogtime( Date logtime )
{
this.logtime=logtime;
}

public Date getLogtime()
{
return this.logtime;
}

public void setState( String state )
{
this.state=state;
}

public String getState()
{
return this.state;
}

public void setType( String type )
{
this.type=type;
}

public String getType()
{
return this.type;
}

}