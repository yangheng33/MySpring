package com.amar.web.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(noClassnameStored=true)
public class Userinfo
{

	@Id
	private ObjectId id;
	
	private String username;
	private String password;
	private Date logintime;
	private int age;
	private float money;
	private long phone;
	
	private List<String>son;
	
	public ObjectId getId()
	{
		return id;
	}
	public void setId( ObjectId id )
	{
		this.id = id;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge( int age )
	{
		this.age = age;
	}
	public float getMoney()
	{
		return money;
	}
	public void setMoney( float money )
	{
		this.money = money;
	}
	public long getPhone()
	{
		return phone;
	}
	public void setPhone( long phone )
	{
		this.phone = phone;
	}

	public String getUsername()
	{
		return username;
	}
	public void setUsername( String username )
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword( String password )
	{
		this.password = password;
	}
	public Date getLogintime()
	{
		return logintime;
	}
	public void setLogintime( Date logintime )
	{
		this.logintime = logintime;
	}
	@Override
	public String toString()
	{
		return "Userinfo [username=" + username + ", password=" + password + ", logintime=" + logintime + ", age=" + age + ", money="
				+ money + ", phone=" + phone + "]";
	}
	public List < String > getSon()
	{
		return son;
	}
	public void setSon( List < String > son )
	{
		this.son = son;
	}
	
	
	
}
