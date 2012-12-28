package com.amar.web.model;

import java.util.Date;

public class Metarnet_visit
{
	private int id;

	private String protocol;

	private String inside_global_ip;

	private String inside_global_port;

	private String inside_local_ip;

	private String inside_local_port;

	private String outside_local_ip;

	private String outside_local_port;

	private String outside_global_ip;

	private String outside_global_port;

	private Date recorddate;

	public void setId( int id )
	{
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}

	public void setProtocol( String protocol )
	{
		this.protocol = protocol;
	}

	public String getProtocol()
	{
		return this.protocol;
	}

	public void setInside_global_ip( String inside_global_ip )
	{
		this.inside_global_ip = inside_global_ip;
	}

	public String getInside_global_ip()
	{
		return this.inside_global_ip;
	}

	public void setInside_global_port( String inside_global_port )
	{
		this.inside_global_port = inside_global_port;
	}

	public String getInside_global_port()
	{
		return this.inside_global_port;
	}

	public void setInside_local_ip( String inside_local_ip )
	{
		this.inside_local_ip = inside_local_ip;
	}

	public String getInside_local_ip()
	{
		return this.inside_local_ip;
	}

	public void setInside_local_port( String inside_local_port )
	{
		this.inside_local_port = inside_local_port;
	}

	public String getInside_local_port()
	{
		return this.inside_local_port;
	}

	public void setOutside_local_ip( String outside_local_ip )
	{
		this.outside_local_ip = outside_local_ip;
	}

	public String getOutside_local_ip()
	{
		return this.outside_local_ip;
	}

	public void setOutside_local_port( String outside_local_port )
	{
		this.outside_local_port = outside_local_port;
	}

	public String getOutside_local_port()
	{
		return this.outside_local_port;
	}

	public void setOutside_global_ip( String outside_global_ip )
	{
		this.outside_global_ip = outside_global_ip;
	}

	public String getOutside_global_ip()
	{
		return this.outside_global_ip;
	}

	@Override
	public String toString()
	{
		return "Metarnet_visit [id=" + id + ", protocol=" + protocol + ", inside_global_ip=" + inside_global_ip + ", inside_global_port=" + inside_global_port + ", inside_local_ip=" + inside_local_ip
				+ ", inside_local_port=" + inside_local_port + ", outside_local_ip=" + outside_local_ip + ", outside_local_port=" + outside_local_port + ", outside_global_ip=" + outside_global_ip
				+ ", outside_global_port=" + outside_global_port + ", recorddate=" + recorddate + "]";
	}

	public void setOutside_global_port( String outside_global_port )
	{
		this.outside_global_port = outside_global_port;
	}

	public String getOutside_global_port()
	{
		return this.outside_global_port;
	}

	public void setRecorddate( Date recorddate )
	{
		this.recorddate = recorddate;
	}

	public Date getRecorddate()
	{
		return this.recorddate;
	}

}
