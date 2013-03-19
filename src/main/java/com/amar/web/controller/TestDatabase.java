package com.amar.web.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.db.ibatis.dao.DiaryDAO;
import com.amar.web.framework.BaseController;
import com.amar.web.model.Diary;

@Controller
@RequestMapping( "testdatabase.amar" )
public class TestDatabase extends BaseController
{

	@Resource( name = "diaryDAO" )
	private DiaryDAO diaryDAO;

	@RequestMapping( params = "method=init" )
	public String init( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		log.info( Integer.MAX_VALUE );
		log.info( Long.MAX_VALUE );
		return "test/insert";
	}

	@RequestMapping( params = "method=insert" )
	public String insert( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		log.info( "in insert" );

		Date start = new Date();
		long length = 100000;

		for( long i = 0 ; i < length ; i ++ )
		{
			Diary d = new Diary();
			d.setContent( "content" );
			d.setType( "1" );
			d.setDiarytime( new Date() );
			diaryDAO.addDiary( d );
		}
		Date end = new Date();
		log.info( "插入" + length + "条数据，耗时" + ( end.getTime() - start.getTime() ) + "毫秒" );

		return "test/insert";
	}

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { Exception.class } )
	@RequestMapping( params = "method=insertWithTran" )
	public String insertWithTran( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		log.info( "in insert" );

		Date start = new Date();
		long length = 100000;

		for( long i = 0 ; i < length ; i ++ )
		{
			Diary d = new Diary();
			d.setContent( "content" );
			d.setType( "1" );
			d.setDiarytime( new Date() );
			diaryDAO.addDiary( d );
		}
		Date end = new Date();
		log.info( "插入" + length + "条数据，耗时" + ( end.getTime() - start.getTime() ) + "毫秒" );

		return "test/insert";
	}
}
