package com.amar.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.ibatis.dao.JobplanDAO;
import com.amar.db.ibatis.dao.JobplanfileDAO;
import com.amar.db.ibatis.dao.JobplanlogDAO;
import com.amar.db.ibatis.dao.JobplanreplyDAO;
import com.amar.db.ibatis.dao.ProjectDAO;
import com.amar.db.ibatis.dao.UserDAO;
import com.amar.util.ServletUtil;
import com.amar.util.TimeDateUtil;
import com.amar.web.model.Jobplan;
import com.amar.web.model.Project;
import com.amar.web.model.User;

@Controller
@RequestMapping( "jobPlan.amar" )
public class JobPlanController
{

	@Resource( name = "jobplanDAO" )
	private JobplanDAO jobplanDAO;

	@Resource( name = "jobplanfileDAO" )
	private JobplanfileDAO jobplanfileDAO;

	@Resource( name = "projectDAO" )
	private ProjectDAO projectDAO;

	@Resource( name = "jobplanreplyDAO" )
	private JobplanreplyDAO jobplanreplyDAO;

	@Resource( name = "userDAO" )
	private UserDAO userDAO;

	@Resource( name = "jobplanlogDAO" )
	private JobplanlogDAO jobplanlogDAO;

	@RequestMapping( params = "method=queryJobplanList" )
	public String queryJobplanList( HttpServletRequest request , HttpServletResponse response )
	{
		String scope = request.getParameter( "scope" );
		if ( "me".equals( scope ) )
		{
			User user = ( User ) request.getSession().getAttribute( "user" );

			// 我报告的
			Jobplan jobplan_report = getJobplan( request );
			jobplan_report.setReportuserid( user.getId() );
			List<Jobplan> reportlist = jobplanDAO.findJobplan( jobplan_report );
			// 我处理的
			Jobplan jobplan_deal = getJobplan( request );
			jobplan_deal.setDealuserid( user.getId() );
			List<Jobplan> deallist = jobplanDAO.findJobplan( jobplan_deal );
			// 我测试的
			Jobplan jobplan_test = getJobplan( request );
			jobplan_test.setTestuserid( user.getId() );
			List<Jobplan> testlist = jobplanDAO.findJobplan( jobplan_test );

			List<Jobplan> all = new ArrayList<Jobplan>();
			Map<Integer,Integer> alreadyMap = new HashMap<Integer,Integer>();

			for( Jobplan jobplan : reportlist )
			{
				if ( ! alreadyMap.containsKey( jobplan.getId() ) )
				{
					all.add( jobplan );
					alreadyMap.put( jobplan.getId() , jobplan.getId() );
				}
			}

			for( Jobplan jobplan : deallist )
			{
				if ( ! alreadyMap.containsKey( jobplan.getId() ) )
				{
					all.add( jobplan );
					alreadyMap.put( jobplan.getId() , jobplan.getId() );
				}
			}

			for( Jobplan jobplan : testlist )
			{
				if ( ! alreadyMap.containsKey( jobplan.getId() ) )
				{
					all.add( jobplan );
					alreadyMap.put( jobplan.getId() , jobplan.getId() );
				}
			}
			request.setAttribute( "jobplanlist" , all );
		}
		else
		{
			Jobplan jobplan = getJobplan( request );
			List<Jobplan> all = jobplanDAO.findJobplan( jobplan );
			request.setAttribute( "jobplanlist" , all );
		}
		commAttribute( request );
		return "jobplan/jobplanlist";
	}

	public Jobplan getJobplan( HttpServletRequest request )
	{
		Jobplan jobplan = ServletUtil.request2Bean( request , Jobplan.class );
		String start = request.getParameter( "reporttimestart" );
		String end = request.getParameter( "reporttimeend" );
		if ( "".equals( start ) )
		{
			jobplan.setReporttimestart( null );
		}
		else
		{
			request.setAttribute( "reporttimestart" , start );
		}

		if ( "".equals( end ) )
		{
			jobplan.setReporttimeend( null );
		}
		else
		{
			request.setAttribute( "reporttimeend" , end );
		}

		String scope = request.getParameter( "scope" );
		if ( scope != null && ! "".equals( scope ) )
		{
			request.setAttribute( "scope" , scope );
		}
		else
		{
			request.setAttribute( "scope" , "me" );
		}

		String state = request.getParameter( "state" );
		if ( ! "".equals( state ) )
		{
			request.setAttribute( "state" , state );
		}

		String plantype = request.getParameter( "plantype" );
		if ( ! "".equals( plantype ) )
		{
			request.setAttribute( "plantype" , plantype );
		}

		String jobplanlevel = request.getParameter( "jobplanlevel" );
		if ( ! "".equals( jobplanlevel ) )
		{
			request.setAttribute( "jobplanlevel" , jobplanlevel );
		}

		return jobplan;
	}

	public void commAttribute( HttpServletRequest request )
	{
		request.setAttribute( "userlist" , userDAO.findUser( new User() ) );
		request.setAttribute( "projectlist" , projectDAO.findProject( new Project() ) );
	}

	@RequestMapping( params = "method=uploadFile" )
	public String uploadFile( HttpServletRequest request , HttpServletResponse response )
	{
		return "";
	}

	@RequestMapping( params = "method=downFile" )
	public void downFile( HttpServletRequest request , HttpServletResponse response )
	{

	}

	@RequestMapping( params = "method=toAddJobplan" )
	public String toAddJobplan( HttpServletRequest request , HttpServletResponse response )
	{
		commAttribute( request );
		return "jobplan/addjobplan";
	}

	@RequestMapping( params = "method=addJobplan" )
	public String addJobplan( HttpServletRequest request , HttpServletResponse response )
	{
		Jobplan jobplan = ServletUtil.request2Bean( request , Jobplan.class );

		String planfinishtimestart = request.getParameter( "planfinishtimestart" );

		jobplan.setPlanfinishtime( new Date( TimeDateUtil.getLongDate( planfinishtimestart ) ) );

		jobplan.setReporttime( new Date() );

		jobplanDAO.addJobplan( jobplan );

		return "jobplan/jobplanlist";
	}

	@RequestMapping( params = "method=replyOneJobplan" )
	public String replyOneJobplan( HttpServletRequest request , HttpServletResponse response )
	{

		return "jobplan/";
	}

	@RequestMapping( params = "method=queryJobplanReply" )
	public String queryJobplanReply( HttpServletRequest request , HttpServletResponse response )
	{

		return "jobplan/";
	}

	@RequestMapping( params = "method=edtiJobplan" )
	public void edtiJobplan( HttpServletRequest request , HttpServletResponse response )
	{

	}

	@RequestMapping( params = "method=toEdtiJobplan" )
	public String toEdtiJobplan( HttpServletRequest request , HttpServletResponse response )
	{
		int id = Integer.parseInt( request.getParameter( "id" ) );
		User user = ( User ) request.getSession().getAttribute( "user" );

		Jobplan _jobplan = new Jobplan();
		_jobplan.setId( id );
		Jobplan jobplan = jobplanDAO.findJobplan( _jobplan ).get( 0 );

		rightAttribute( request , user.getId() , jobplan.getReportuserid() , "meReport" );
		rightAttribute( request , user.getId() , jobplan.getDealuserid() , "meDeal" );
		rightAttribute( request , user.getId() , jobplan.getTestuserid() , "meTest" );

		request.setAttribute( "jobplan" , jobplan );

		commAttribute( request );
		return "jobplan/editjobplan";
	}

	public void rightAttribute( HttpServletRequest request , int meUserid , int rightid , String rightname )
	{
		if ( meUserid == rightid )
		{
			request.setAttribute( rightname , "y" );
		}
		else
		{
			request.setAttribute( rightname , "n" );
		}
	}
}
