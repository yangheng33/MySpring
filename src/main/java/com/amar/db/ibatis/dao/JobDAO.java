package com.amar.db.ibatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.amar.web.model.Job;

public interface JobDAO
{

	public List<Job> findJob( Job job );

	public void deleteJob( Job job );

	public void addJob( Job job );

	public void editJob( Job job );

	@SuppressWarnings( "rawtypes" )
	public List findJobRecode( @Param( "userid" ) int userid , @Param( "datetime" ) String datetime );

}
