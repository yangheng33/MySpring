package com.amar.web.model;
import java.util.Date;

public class Remindplan
{
private int id;

private int userid;

private String title;

private String type;

private String cycle;

private String cycleparam;

private Date exectime;

private String content;

private String state;

private Date modifytime;


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

public void setTitle( String title )
{
this.title=title;
}

public String getTitle()
{
return this.title;
}

public void setType( String type )
{
this.type=type;
}

public String getType()
{
return this.type;
}

public void setCycle( String cycle )
{
this.cycle=cycle;
}

public String getCycle()
{
return this.cycle;
}

public void setCycleparam( String cycleparam )
{
this.cycleparam=cycleparam;
}

public String getCycleparam()
{
return this.cycleparam;
}

public void setExectime( Date exectime )
{
this.exectime=exectime;
}

public Date getExectime()
{
return this.exectime;
}

public void setContent( String content )
{
this.content=content;
}

public String getContent()
{
return this.content;
}

public void setState( String state )
{
this.state=state;
}

public String getState()
{
return this.state;
}

public void setModifytime( Date modifytime )
{
this.modifytime=modifytime;
}

public Date getModifytime()
{
return this.modifytime;
}

}