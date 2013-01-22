package com.amar.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.amar.db.ibatis.dao.DiaryDAO;
import com.amar.util.ServletUtil;
import com.amar.util.TimeDateUtil;
import com.amar.web.model.Diary;
import com.amar.web.model.User;

@Controller
@RequestMapping( "diary.amar" )
public class DiaryController
{
	@Resource( name = "diaryDAO" )
	private DiaryDAO diaryDAO;

	@RequestMapping( params = "method=personallist" )
	public String personallist( HttpServletRequest request , HttpServletResponse response )
	{

		User user = ( User ) request.getSession().getAttribute( "user" );
		Diary diary = new Diary();
		diary.setUserid( user.getId() );

		List<Diary> list = diaryDAO.findDiary( diary );

		request.setAttribute( "list" , list );

		return "diary/personallist";
	}

	@RequestMapping( params = "method=toAddDiary" )
	public String toAddDiary( HttpServletRequest request , HttpServletResponse response )
	{

		return "diary/adddiary";
	}

	@RequestMapping( params = "method=addDiary" )
	public void addDiary( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		Diary diary = ServletUtil.request2Bean( request , Diary.class );

		Date diarytime = new Date( TimeDateUtil.getLongDate( request.getParameter( "diarytimes" ) ) );

		User user = ( User ) request.getSession().getAttribute( "user" );

		diary.setUserid( user.getId() );

		diary.setDiarytime( diarytime );

		diaryDAO.addDiary( diary );
		
		response.sendRedirect( "diary.amar?method=personallist" );
	}

	@RequestMapping( params = "method=toEditDiary" )
	public String toEditDiary( HttpServletRequest request , HttpServletResponse response )
	{

		return "diary/editdiary";
	}

	@RequestMapping( params = "method=editDiary" )
	public void editDiary( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{

		response.sendRedirect( "diary.amar?method=personallist" );
	}

	@RequestMapping( params = "method=delDiary" )
	public void delDiary( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		Diary diary = ServletUtil.request2Bean( request , Diary.class );
		
		diaryDAO.deleteDiary( diary );
		
		response.sendRedirect( "diary.amar?method=personallist" );
	}
}
