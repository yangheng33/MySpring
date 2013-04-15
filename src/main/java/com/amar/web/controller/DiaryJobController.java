package com.amar.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import com.amar.db.ibatis.dao.JobDAO;
import com.amar.db.ibatis.dao.JobdetailDAO;
import com.amar.db.ibatis.dao.JobplanDAO;
import com.amar.db.ibatis.dao.ProjectDAO;
import com.amar.db.ibatis.dao.UserDAO;
import com.amar.util.TimeDateUtil;
import com.amar.web.framework.BaseController;
import com.amar.web.model.Job;
import com.amar.web.model.Jobdetail;
import com.amar.web.model.Jobplan;
import com.amar.web.model.Project;
import com.amar.web.model.User;

@SuppressWarnings( { "unchecked", "rawtypes" } )
@Controller
@RequestMapping( "diaryJob.amar" )
public class DiaryJobController extends BaseController
{
	@Resource( name = "jobDAO" )
	private JobDAO jobDAO;

	@Resource( name = "jobdetailDAO" )
	private JobdetailDAO jobdetailDAO;

	@Resource( name = "userDAO" )
	private UserDAO userDAO;

	@Resource( name = "jobplanDAO" )
	private JobplanDAO jobplanDAO;

	@Resource( name = "projectDAO" )
	private ProjectDAO projectDAO;

	@RequestMapping( params = "method=personallist" )
	public String personallist( HttpServletRequest request , HttpServletResponse response )
	{

		User user = ( User ) request.getSession().getAttribute( "user" );
		String querydatetime = request.getParameter( "querydatetime" );
		if ( querydatetime == null || "".equals( querydatetime ) )
		{
			querydatetime = TimeDateUtil.getDateTime( new Date() );
		}

		List alllist = jobDAO.findJobRecode( user.getId() , querydatetime );

		List<String> dateList = getDateList( alllist );

		List<User> userlist = userDAO.findUser( user );

		List userList = initUserList( userlist , dateList );

		checkDiaryJob( alllist , userList );

		request.setAttribute( "userlist" , userList );

		request.setAttribute( "datelist" , dateList );

		request.setAttribute( "querytype" , "personal" );

		request.setAttribute( "querydatetime" , querydatetime );

		return "diaryjob/ownerdiaryjoblist";
	}

	@RequestMapping( params = "method=alllist" )
	public String alllist( HttpServletRequest request , HttpServletResponse response )
	{

		String querydatetime = request.getParameter( "querydatetime" );
		if ( querydatetime == null || "".equals( querydatetime ) )
		{
			querydatetime = TimeDateUtil.getDateTime( new Date() );
		}

		List alllist = jobDAO.findJobRecode( 0 , querydatetime );

		List<String> dateList = getDateList( alllist );

		User user = new User();

		user.setLevel( "2" );// 普通员工才必须写日志

		List<User> userlist = userDAO.findUser( user );

		List userList = initUserList( userlist , dateList );

		checkDiaryJob( alllist , userList );

		request.setAttribute( "userlist" , userList );

		request.setAttribute( "datelist" , dateList );

		request.setAttribute( "querytype" , "all" );

		request.setAttribute( "querydatetime" , querydatetime );

		return "diaryjob/diaryjoblist";
	}

	@RequestMapping( params = "method=exportExcel" )
	public void exportExcel( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		String querydatetime = request.getParameter( "querydatetime" );
		if ( querydatetime == null || "".equals( querydatetime ) )
		{
			querydatetime = TimeDateUtil.getDateTime( new Date() );
		}

		List alllist = jobDAO.findJobRecode( 0 , querydatetime );
		List<String> dateList = getDateList( alllist );
		List<User> userlist = userDAO.findUser( new User() );
		List userList = initUserList( userlist , dateList );
		checkDiaryJob( alllist , userList );

		String fileName = "统计";
		XSSFWorkbook demoWorkBook = new XSSFWorkbook();
		Sheet demoSheet = demoWorkBook.createSheet( "明细表" );

		int rowNumber = 0;
		Row headerRow = demoSheet.createRow( rowNumber );
		for( int i = 0 ; i < dateList.size() ; i ++ )
		{
			Cell headerCell = headerRow.createCell( i );
			headerCell.setCellValue( dateList.get( i ) );
		}

		response.setContentType( "application/binary;" );
		response.setHeader( "Content-Disposition" , "attachment;filename=" + new String( ( fileName ).getBytes() , "iso8859-1" ) + ".xlsx" );
		demoWorkBook.write( response.getOutputStream() );
	}

	public void checkDiaryJob( List alllist , List userList )
	{
		for( int i = 0 ; i < userList.size() ; i ++ )
		{
			Map map = ( Map ) userList.get( i );
			String userid = map.get( "userid" ).toString();
			List dateList = ( List ) map.get( "datelist" );
			List haveDiaryList = new ArrayList();

			for( int k = 0 ; k < dateList.size() ; k ++ )
			{
				String date = dateList.get( k ).toString();
				boolean find = false;
				for( int j = 0 ; j < alllist.size() ; j ++ )
				{
					Map userMap = ( Map ) alllist.get( j );
					Object _userid = userMap.get( "userid" );
					Object _date = userMap.get( "date" );

					if ( _userid != null && _date != null && userid.equals( _userid.toString() ) && date.equals( _date.toString() ) )
					{
						find = true;
					}
				}
				if ( find )
				{
					haveDiaryList.add( "1" );
				}
				else
				{
					haveDiaryList.add( "0" );
				}
			}
			map.put( "havediarylist" , haveDiaryList );
			map.remove( "datelist" );
		}
	}

	public List initUserList( List<User> userlist , List<String> dateList )
	{
		List allUserList = new ArrayList();

		for( User user : userlist )
		{
			String userid = user.getId() + "";
			String realname = user.getRealname();
			String level = user.getLevel();
			Map userMap = new HashMap();
			userMap.put( "level" , level );
			userMap.put( "userid" , userid );
			userMap.put( "realname" , realname );
			userMap.put( "datelist" , dateList );
			allUserList.add( userMap );
		}
		return allUserList;
	}

	public List<String> getDateList( List alllist )
	{
		List<String> datelist = new ArrayList<String>();
		for( int i = 0 ; i < alllist.size() ; i ++ )
		{
			Map map = ( Map ) alllist.get( i );
			String date = map.get( "date" ).toString();

			if ( ! datelist.contains( date ) )
			{
				datelist.add( date );
			}
		}
		return datelist;
	}

	@RequestMapping( params = "method=seeOneDayJob" )
	public String seeOneDayJob( HttpServletRequest request , HttpServletResponse response )
	{
		String index = request.getParameter( "index" );
		String userid = request.getParameter( "userid" );
		String querydatetime = request.getParameter( "querydatetime" );

		if ( index.length() == 1 )
		{
			index = "0" + index;
		}

		String datetime = querydatetime.substring( 0 , 8 ) + index;

		String start = datetime + " 00:00:00";
		String end = datetime + " 23:59:59";

		Job job = new Job();
		job.setJobtimeend( end );
		job.setJobtimestart( start );
		job.setUserid( Integer.parseInt( userid ) );

		Job _job = jobDAO.findJob( job ).get( 0 );

		Jobdetail jobdetail = new Jobdetail();
		jobdetail.setJobid( _job.getId() );
		List<Jobdetail> detaillist = jobdetailDAO.findJobdetail( jobdetail );

		User user = new User();
		user.setId( _job.getUserid() );

		User _user = userDAO.findUser( user ).get( 0 );

		request.setAttribute( "job" , _job );
		request.setAttribute( "detaillist" , detaillist );
		request.setAttribute( "user" , _user );
		request.setAttribute( "projectlist" , projectDAO.findProject( new Project() ) );

		return "diaryjob/diaryjobdetail";
	}

	@RequestMapping( params = "method=toAddDiaryjob" )
	public String toAddDiaryjob( HttpServletRequest request , HttpServletResponse response )
	{
		String querydatetime = request.getParameter( "querydatetime" );

		String index = request.getParameter( "index" );

		if ( index.length() == 1 )
		{
			index = "0" + index;
		}

		String newDatetime = querydatetime.substring( 0 , 8 ) + index + querydatetime.substring( 10 , querydatetime.length() );

		User user = ( User ) request.getSession().getAttribute( "user" );
		Jobplan _jobplanDeal = new Jobplan();
		Jobplan _jobplanTest = new Jobplan();

		_jobplanDeal.setState( 2 );
		_jobplanTest.setState( 3 );

		_jobplanDeal.setDealuserid( user.getId() );
		_jobplanTest.setTestuserid( user.getId() );

		List<Jobplan> dealJobList = jobplanDAO.findJobplan( _jobplanDeal );
		List<Jobplan> testJobList = jobplanDAO.findJobplan( _jobplanTest );

		request.setAttribute( "querydatetime" , newDatetime );

		request.setAttribute( "dealJobList" , dealJobList );

		request.setAttribute( "testJobList" , testJobList );

		request.setAttribute( "projectlist" , projectDAO.findProject( new Project() ) );

		return "diaryjob/adddiaryjob";
	}

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { Exception.class } )
	@RequestMapping( params = "method=addDiaryjob" )
	public void addDiaryjob( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		String splitSign = ",,,,";
		String [] usetimes = request.getParameter( "usetime" ).split( splitSign );
		String [] contents = request.getParameter( "content" ).split( splitSign );
		String [] jobplanids = request.getParameter( "jobplanid" ).split( splitSign );
		String [] titles = request.getParameter( "title" ).split( splitSign );
		String [] counts = request.getParameter( "count" ).split( splitSign );
		String [] types = request.getParameter( "type" ).split( splitSign );
		String [] projectids = request.getParameter( "projectid" ).split( splitSign );

		String recordtime = request.getParameter( "recordtime" );

		User user = ( User ) request.getSession().getAttribute( "user" );

		Job job = new Job();
		job.setJobtime( new Date( TimeDateUtil.getLongDate( recordtime ) ) );
		job.setUserid( user.getId() );

		jobDAO.addJob( job );

		for( int i = 0 ; i < usetimes.length ; i ++ )
		{
			if ( ! "".equals( usetimes[ i ].trim() ) && ! "".equals( contents[ i ].trim() ) )
			{
				Jobdetail jobdetail = new Jobdetail();
				jobdetail.setJobid( job.getId() );
				jobdetail.setUsedtime( usetimes[ i ] );
				jobdetail.setContent( contents[ i ] );
				jobdetail.setTitle( titles[ i ] );
				jobdetail.setType( Integer.parseInt( types[ i ] ) );
				jobdetail.setCount( Integer.parseInt( counts[ i ] ) );
				jobdetail.setJobplanid( Integer.parseInt( jobplanids[ i ] ) );
				jobdetail.setProjectid( Integer.parseInt( projectids[ i ] ) );

				jobdetailDAO.addJobdetail( jobdetail );
			}
		}

		response.sendRedirect( "diaryJob.amar?method=personallist" );
	}

	@RequestMapping( params = "method=toEditDiary" )
	public String toEditDiary( HttpServletRequest request , HttpServletResponse response )
	{

		return "diaryjob/editdiary";
	}

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { Exception.class } )
	@RequestMapping( params = "method=delDiaryjob" )
	public void delDiaryjob( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		int id = Integer.parseInt( request.getParameter( "id" ) );
		Job job = new Job();
		job.setId( id );
		jobDAO.deleteJob( job );

		Jobdetail jobdetail = new Jobdetail();
		jobdetail.setJobid( id );
		jobdetailDAO.deleteJobdetail( jobdetail );

		sendData( response , "ok" );
	}
}
