package com.amar.web.model;
import java.util.Date;

public class Jobplan
{
private int id;

private int projectid;

private String title;

private String content;

private String planfinishtimestart;

private String planfinishtimeend;

private Date planfinishtime;

private String finishtimestart;

private String finishtimeend;

private Date finishtime;

private int state;

private int plantype;

private int reportuserid;

private int jobplanlevel;

private String reporttimestart;

private String reporttimeend;

private Date reporttime;

private int dealuserid;

private String dealtimestart;

private String dealtimeend;

private Date dealtime;

private int testuserid;

private String testtimestart;

private String testtimeend;

private Date testtime;

private Project project;

private User reportuser;

private User dealuser;

private User testuser;

public void setId( int id )
{
this.id=id;
}

public int getId()
{
return this.id;
}

public void setProjectid( int projectid )
{
this.projectid=projectid;
}

public int getProjectid()
{
return this.projectid;
}

public void setTitle( String title )
{
this.title=title;
}

public String getTitle()
{
return this.title;
}

public void setContent( String content )
{
this.content=content;
}

public String getContent()
{
return this.content;
}

public void setPlanfinishtimestart( String planfinishtimestart )
{
this.planfinishtimestart=planfinishtimestart;
}

public String getPlanfinishtimestart()
{
return this.planfinishtimestart;
}

public void setPlanfinishtimeend( String planfinishtimeend )
{
this.planfinishtimeend=planfinishtimeend;
}

public String getPlanfinishtimeend()
{
return this.planfinishtimeend;
}

public void setPlanfinishtime( Date planfinishtime )
{
this.planfinishtime=planfinishtime;
}

public Date getPlanfinishtime()
{
return this.planfinishtime;
}

public void setFinishtimestart( String finishtimestart )
{
this.finishtimestart=finishtimestart;
}

public String getFinishtimestart()
{
return this.finishtimestart;
}

public void setFinishtimeend( String finishtimeend )
{
this.finishtimeend=finishtimeend;
}

public String getFinishtimeend()
{
return this.finishtimeend;
}

public void setFinishtime( Date finishtime )
{
this.finishtime=finishtime;
}

public Date getFinishtime()
{
return this.finishtime;
}

public void setState( int state )
{
this.state=state;
}

public int getState()
{
return this.state;
}

public void setPlantype( int plantype )
{
this.plantype=plantype;
}

public int getPlantype()
{
return this.plantype;
}

public void setReportuserid( int reportuserid )
{
this.reportuserid=reportuserid;
}

public int getReportuserid()
{
return this.reportuserid;
}

public void setReporttimestart( String reporttimestart )
{
this.reporttimestart=reporttimestart;
}

public String getReporttimestart()
{
return this.reporttimestart;
}

public void setReporttimeend( String reporttimeend )
{
this.reporttimeend=reporttimeend;
}

public String getReporttimeend()
{
return this.reporttimeend;
}

public void setReporttime( Date reporttime )
{
this.reporttime=reporttime;
}

public Date getReporttime()
{
return this.reporttime;
}

public void setDealuserid( int dealuserid )
{
this.dealuserid=dealuserid;
}

public int getDealuserid()
{
return this.dealuserid;
}

public void setDealtimestart( String dealtimestart )
{
this.dealtimestart=dealtimestart;
}

public String getDealtimestart()
{
return this.dealtimestart;
}

public void setDealtimeend( String dealtimeend )
{
this.dealtimeend=dealtimeend;
}

public String getDealtimeend()
{
return this.dealtimeend;
}

public void setDealtime( Date dealtime )
{
this.dealtime=dealtime;
}

public Date getDealtime()
{
return this.dealtime;
}

public void setTestuserid( int testuserid )
{
this.testuserid=testuserid;
}

public int getTestuserid()
{
return this.testuserid;
}

public void setTesttimestart( String testtimestart )
{
this.testtimestart=testtimestart;
}

public String getTesttimestart()
{
return this.testtimestart;
}

public void setTesttimeend( String testtimeend )
{
this.testtimeend=testtimeend;
}

public String getTesttimeend()
{
return this.testtimeend;
}

public void setTesttime( Date testtime )
{
this.testtime=testtime;
}

public Date getTesttime()
{
return this.testtime;
}

public int getJobplanlevel()
{
	return jobplanlevel;
}

public void setJobplanlevel( int jobplanlevel )
{
	this.jobplanlevel = jobplanlevel;
}

public Project getProject()
{
	return project;
}

public void setProject( Project project )
{
	this.project = project;
}

public User getReportuser()
{
	return reportuser;
}

public void setReportuser( User reportuser )
{
	this.reportuser = reportuser;
}

public User getDealuser()
{
	return dealuser;
}

public void setDealuser( User dealuser )
{
	this.dealuser = dealuser;
}

public User getTestuser()
{
	return testuser;
}

public void setTestuser( User testuser )
{
	this.testuser = testuser;
}

}