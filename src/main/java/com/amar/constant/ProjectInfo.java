package com.amar.constant;

public class ProjectInfo
{
	public static String name = "projectInfo";

	public static String IP = "localhost";

	public static String PORT = "80";

	public static String PROTOCOL = "http";

	public static String PROJECTNAME = "myspring";

	public static String JMS_IP = "192.168.8.186";

	public static String JMS_PORT = "61616";

	public String datadir;

	public String getDatadir()
	{
		return datadir;
	}

	public void setDatadir( String datadir )
	{
		this.datadir = datadir;
	}

	public static String webBaseAddress()
	{
		return PROTOCOL + "://" + IP + ":" + PORT + "/" + PROJECTNAME;
	}

	public static String jmsAddress()
	{
		return "tcp" + "://" + JMS_IP + ":" + JMS_PORT;
	}
}
