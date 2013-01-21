package com.amar.web.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.ibatis.dao.DiaryDAO;
import com.amar.web.model.Diary;
import com.amar.web.model.User;

@Controller
@RequestMapping( "diary.amar" )
public class DiaryController
{
	@Resource( name = "diaryDAO" )
	private DiaryDAO diaryDAO;
	
	@RequestMapping( params = "method=list" )
	public String list( HttpServletRequest request , HttpServletResponse response )
	{

		User user =(User) request.getSession().getAttribute( "user" );
		Diary diary = new Diary();
		diary.setUserid( user.getId() );
		
		List<Diary> list = diaryDAO.findDiary( diary );

		request.setAttribute( "list" , list );
		
		return "diary/diarylist";
	}
	
	@RequestMapping( params = "method=list" )
	public String addDiary( HttpServletRequest request , HttpServletResponse response )
	{

		return "diary/adddiary";
	}

	@RequestMapping( params = "method=toEditDiary" )
	public String toEditDiary( HttpServletRequest request , HttpServletResponse response )
	{

		return "diary/editdiary";
	}
	
	@RequestMapping( params = "method=editDiary" )
	public String editDiary( HttpServletRequest request , HttpServletResponse response )
	{

		return "diary/editdiary";
	}
	
	@RequestMapping( params = "method=dellist" )
	public void delDiary( HttpServletRequest request , HttpServletResponse response )
	{

		
	}
}
