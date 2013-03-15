package com.amar.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.amar.constant.ProjectInfo;
import com.amar.db.ibatis.dao.JobplanDAO;
import com.amar.db.ibatis.dao.JobplanfileDAO;
import com.amar.db.ibatis.dao.JobplanlogDAO;
import com.amar.db.ibatis.dao.JobplanreplyDAO;
import com.amar.db.ibatis.dao.ProjectDAO;
import com.amar.db.ibatis.dao.UserDAO;
import com.amar.util.DataTool;
import com.amar.util.ServletUtil;
import com.amar.util.TimeDateUtil;
import com.amar.util.mail.MailTool;
import com.amar.web.framework.BaseController;
import com.amar.web.model.Jobplan;
import com.amar.web.model.Jobplanfile;
import com.amar.web.model.Project;
import com.amar.web.model.User;

@SuppressWarnings( "unused" )
@Controller
@RequestMapping( "jobPlan.amar" )
public class JobPlanController  extends BaseController
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

	@Resource( name = "projectInfo" )
	private ProjectInfo projectInfo;

	@Resource( name = "mailTool" )
	private MailTool mailTool;

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
	public void uploadFile( HttpServletRequest request , HttpServletResponse response )
	{
		JSONObject result = new JSONObject();

		int jobplanid = Integer.parseInt( request.getParameter( "jobplanid" ) );
		User user = ( User ) request.getSession().getAttribute( "user" );

		try
		{
			if ( request instanceof MultipartHttpServletRequest )
			{
				MultipartHttpServletRequest multipartRequest = ( MultipartHttpServletRequest ) request;

				MultipartFile multipartFile = multipartRequest.getFile( "files[]" );

				String origName = multipartFile.getOriginalFilename();
				int _sign = origName.lastIndexOf( "." );
				String newFilename = "";
				if ( _sign > 0 )
				{
					newFilename = origName.substring( 0 , _sign - 1 ) + "_" + ( new Date().getTime() % 100000 ) + origName.substring( _sign , origName.length() );
				}
				else
				{
					newFilename = origName + "_" + ( new Date().getTime() % 100000 );
				}

				String filePath = "jobplan/" + TimeDateUtil.getDate( new Date() ) + "/";

				DataTool.checkFileDir( projectInfo.datadir + filePath );

				File file = new File( projectInfo.datadir + filePath + newFilename );

				FileCopyUtils.copy( multipartFile.getBytes() , file );

				String [] picType = { "jpeg", "bmp", "jpg", "png", "gif" };

				int fileType = 2;

				for( String picName : picType )
				{
					if ( origName.toLowerCase().endsWith( picName ) )
					{
						fileType = 1;
					}
				}

				Jobplanfile jobplanfile = new Jobplanfile();
				jobplanfile.setType( fileType );
				jobplanfile.setFilename( newFilename );
				jobplanfile.setPath( filePath );
				jobplanfile.setUserid( user.getId() );
				jobplanfile.setJobplanid( jobplanid );
				jobplanfileDAO.addJobplanfile( jobplanfile );

				Jobplanfile _jobplanfile = new Jobplanfile();
				_jobplanfile.setJobplanid( jobplanid );
				_jobplanfile.setType( 1 );// 图片类型
				List<Jobplanfile> list = jobplanfileDAO.findJobplanfile( _jobplanfile );

				result.put( "picfile" , list );
			}

			response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

			response.getWriter().write( result.toString() );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
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

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { Exception.class } )
	@RequestMapping( params = "method=addJobplan" )
	public void addJobplan( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		Jobplan jobplan = ServletUtil.request2Bean( request , Jobplan.class );

		String planfinishtimestart = request.getParameter( "planfinishtimestart" );

		jobplan.setPlanfinishtime( new Date( TimeDateUtil.getLongDate( planfinishtimestart ) ) );

		jobplan.setReporttime( new Date() );

		jobplanDAO.addJobplan( jobplan );

		Jobplan _jobplan = new Jobplan();
		_jobplan.setId( jobplan.getId() );
		jobplan = jobplanDAO.findJobplan( _jobplan ).get( 0 );

		String [] sendto = new String [] { jobplan.getReportuser().getEmail(), jobplan.getDealuser().getEmail(), jobplan.getTestuser().getEmail() };
		mailTool.sendEmail( "报告任务:" + jobplan.getTitle() , jobplanInfo( jobplan ) , projectInfo.managerMail , sendto , projectInfo.managerMailPw , MailTool.MAIL_TYPE_HTML );

		response.sendRedirect( "jobPlan.amar?method=toEdtiJobplan&id=" + jobplan.getId() );
	}

	public String jobplanInfo( Jobplan jobplan )
	{
		StringBuilder sb = new StringBuilder();
		String sign = "<br/>";
		sb.append( "主题:" ).append( jobplan.getTitle() ).append( sign );
		sb.append( "内容:" ).append( jobplan.getContent() ).append( sign );
		sb.append( "发布时间:" ).append( TimeDateUtil.getDateTime( jobplan.getReporttime() ) ).append( sign );
		sb.append( "要求完成时间:" ).append( TimeDateUtil.getDateTime( jobplan.getPlanfinishtime() ) ).append( sign );
		sb.append( "发布者:" ).append( jobplan.getReportuser().getRealname() ).append( sign );
		sb.append( "程序员:" ).append( jobplan.getDealuser().getRealname() ).append( sign );
		sb.append( "测试者:" ).append( jobplan.getTestuser().getRealname() ).append( sign );

		return sb.toString();
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

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { Exception.class } )
	@RequestMapping( params = "method=edtiJobplan" )
	public void edtiJobplan( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		Jobplan _jobplan = ServletUtil.request2Bean( request , Jobplan.class );

		Jobplan jobplan = new Jobplan();
		jobplan.setId( _jobplan.getId() );

		jobplan = jobplanDAO.findJobplan( jobplan ).get( 0 );

		String [] sendtoAll = new String [] { jobplan.getReportuser().getEmail(), jobplan.getDealuser().getEmail(), jobplan.getTestuser().getEmail() };

		if ( jobplan.getState() == 1 )
		{

		}
		else if ( jobplan.getState() == 2 )// 开始开发
		{
			jobplan.setTesttime( new Date() );
			mailTool.sendEmail( "请开始开发:" + jobplan.getTitle() , jobplanInfo( jobplan ) , projectInfo.managerMail , new String [] { sendtoAll[ 1 ] } , projectInfo.managerMailPw ,
					MailTool.MAIL_TYPE_HTML );
		}
		else if ( jobplan.getState() == 3 )// 开始测试
		{
			jobplan.setDealtime( new Date() );
			mailTool.sendEmail( "请开始测试:" + jobplan.getTitle() , jobplanInfo( jobplan ) , projectInfo.managerMail , new String [] { sendtoAll[ 2 ] } , projectInfo.managerMailPw ,
					MailTool.MAIL_TYPE_HTML );
		}
		else if ( jobplan.getState() == 4 )// 已经完毕
		{
			jobplan.setFinishtime( new Date() );

			mailTool.sendEmail( "任务结束:" + jobplan.getTitle() , jobplanInfo( jobplan ) , projectInfo.managerMail , sendtoAll , projectInfo.managerMailPw , MailTool.MAIL_TYPE_HTML );
		}

		jobplanDAO.editJobplan( _jobplan );

		response.sendRedirect( "jobPlan.amar?method=toEdtiJobplan&id=" + jobplan.getId() );
	}

	@RequestMapping( params = "method=toEdtiJobplan" )
	public String toEdtiJobplan( HttpServletRequest request , HttpServletResponse response )
	{
		int id = Integer.parseInt( request.getParameter( "id" ) );
		User user = ( User ) request.getSession().getAttribute( "user" );

		Jobplan _jobplan = new Jobplan();
		_jobplan.setId( id );

		Jobplanfile _jobplanfile = new Jobplanfile();
		_jobplanfile.setJobplanid( id );
		_jobplanfile.setType( 1 );// 图片类型
		List<Jobplanfile> picfilelist = jobplanfileDAO.findJobplanfile( _jobplanfile );

		Jobplanfile _jobplanfile2 = new Jobplanfile();
		_jobplanfile2.setJobplanid( id );
		_jobplanfile2.setType( 2 );// 图片类型
		List<Jobplanfile> filelist = jobplanfileDAO.findJobplanfile( _jobplanfile2 );

		Jobplan jobplan = jobplanDAO.findJobplan( _jobplan ).get( 0 );

		rightAttribute( request , user.getId() , jobplan.getReportuserid() , "meReport" );
		rightAttribute( request , user.getId() , jobplan.getDealuserid() , "meDeal" );
		rightAttribute( request , user.getId() , jobplan.getTestuserid() , "meTest" );

		if ( user.getId() == jobplan.getReportuserid() )// 报告者
		{
			request.setAttribute( "stateRight" , "y" );
		}
		else if ( jobplan.getState() == 2 && user.getId() == jobplan.getDealuserid() )// 程序员
		{
			request.setAttribute( "stateRight" , "y" );
		}
		else if ( jobplan.getState() == 3 && user.getId() == jobplan.getTestuserid() )// 测试者
		{
			request.setAttribute( "stateRight" , "y" );
		}
		else
		{
			request.setAttribute( "stateRight" , "n" );
		}

		request.setAttribute( "jobplan" , jobplan );
		request.setAttribute( "picfilelist" , picfilelist );
		request.setAttribute( "filelist" , filelist );

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
