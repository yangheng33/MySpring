package com.amar.web.model;
import java.util.Date;

import com.amar.web.framework.BaseModel;

public class User extends BaseModel
{
private int id;

private String loginname;

private String realname;

private String pw;

private String phone;

private String email;

private String qq;

private String address;

private Date regtime;

private Date brithday;

private Date lastlogintime;


public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setLoginname( String loginname )
{
this.loginname=loginname;
}

public String getLoginname()
{
return this.loginname;
}

public void setRealname( String realname )
{
this.realname=realname;
}

public String getRealname()
{
return this.realname;
}

public void setPw( String pw )
{
this.pw=pw;
}

public String getPw()
{
return this.pw;
}

public void setPhone( String phone )
{
this.phone=phone;
}

public String getPhone()
{
return this.phone;
}

public void setEmail( String email )
{
this.email=email;
}

public String getEmail()
{
return this.email;
}

public void setQq( String qq )
{
this.qq=qq;
}

public String getQq()
{
return this.qq;
}

public void setAddress( String address )
{
this.address=address;
}

public String getAddress()
{
return this.address;
}

public void setRegtime( Date regtime )
{
this.regtime=regtime;
}

public Date getRegtime()
{
return this.regtime;
}

public void setBrithday( Date brithday )
{
this.brithday=brithday;
}

public Date getBrithday()
{
return this.brithday;
}

public void setLastlogintime( Date lastlogintime )
{
this.lastlogintime=lastlogintime;
}

public Date getLastlogintime()
{
return this.lastlogintime;
}

}