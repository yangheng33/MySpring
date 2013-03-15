package com.amar.web.controller;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.amar.db.ibatis.dao.RemindlogDAO;
import com.amar.db.ibatis.dao.RemindplanDAO;
import com.amar.util.ServletUtil;
import com.amar.util.TimeDateUtil;
import com.amar.web.framework.BaseController;
import com.amar.web.model.Remindlog;
import com.amar.web.model.Remindplan;

@Controller
@RequestMapping( "remindplan.amar" )
public class RemindPlanController  extends BaseController
{
	@Resource( name = "remindplanDAO" )
	RemindplanDAO remindplanDAO;

	@Resource( name = "remindlogDAO" )
	RemindlogDAO remindlogDAO;

	@RequestMapping( params = "method=list" )
	public String list( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Remindplan plan = ServletUtil.request2Bean( request , Remindplan.class );

		List<Remindplan> list = remindplanDAO.findRemindplan( plan );

		request.setAttribute( "list" , list );

		return "remindplan/list";
	}

	@RequestMapping( params = "method=loglist" )
	public String loglist( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Remindlog log = ServletUtil.request2Bean( request , Remindlog.class );

		List<Remindlog> list = remindlogDAO.findRemindlog( log );

		request.setAttribute( "list" , list );

		return "remindplan/list";
	}

	@RequestMapping( params = "method=toAdd" )
	public String toAdd( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{

		return "remindplan/add";
	}

	@RequestMapping( params = "method=add" )
	public void add( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		String exectimes = request.getParameter( "exectimes" );
		
		Date exectime = new Date( TimeDateUtil.getLongDate( exectimes ) );
		
		Remindplan plan = ServletUtil.request2Bean( request , Remindplan.class );
		
		plan.setModifytime( new Date() );

		plan.setExectime( exectime );

		remindplanDAO.addRemindplan( plan );

		response.sendRedirect( "remindplan.amar?method=list" );
	}

	@RequestMapping( params = "method=toEdit" )
	public String toEdit( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Remindplan plan = ServletUtil.request2Bean( request , Remindplan.class );

		plan.setTitle( null );
		List<Remindplan> list = remindplanDAO.findRemindplan( plan );

		request.setAttribute( "remindplan" , list.get( 0 ) );
		
		request.setAttribute( "exectimes" , TimeDateUtil.getDateTime( list.get( 0 ).getExectime() ) );
		
		return "remindplan/edit";
	}

	@RequestMapping( params = "method=edit" )
	public void edit( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Remindplan plan = ServletUtil.request2Bean( request , Remindplan.class );

		remindplanDAO.editRemindplan( plan );

		response.sendRedirect( "remindplan.amar?method=list" );
	}

	@RequestMapping( params = "method=delete" )
	public void delete( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		Remindplan plan = ServletUtil.request2Bean( request , Remindplan.class );

		remindplanDAO.deleteRemindplan( plan );
		
		response.sendRedirect( "remindplan.amar?method=list" );
	}

}
