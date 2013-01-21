package com.amar.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.app.autocode.DBType;
import com.amar.app.autocode.GeneralCode;
import com.amar.app.autocode.Parameter;
import com.amar.app.autocode.TableInfo;
import com.amar.app.compress.Compress;
import com.amar.db.ibatis.dao.AutocodeDAO;
import com.amar.util.DataTool;
import com.amar.util.ServletUtil;

@Controller
@RequestMapping( "autocode.amar" )
public class AutocodeController
{
	private final Logger log = Logger.getLogger( this.getClass() );

	@Resource( name = "autocodeDAO" )
	private AutocodeDAO autocodeDAO;

	@RequestMapping( params = "method=init" )
	public String init( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{

		return "autocode/init";
	}

	@SuppressWarnings( "unused" )
	@RequestMapping( params = "method=generate" )
	public void generate( HttpServletRequest request , HttpServletResponse response , OutputStream os ) throws Exception
	{

		log.info( "AutocodeController.generate" );
		Parameter para = ServletUtil.request2Bean( request , Parameter.class );

		DBType dbtype = DBType.getType( para.getDbtype() );

		List<TableInfo> tableInfoList = null;
		if ( dbtype == DBType.MYSQL )
		{
			para.setTableInfoList( autocodeDAO.getMysqlTableInfo( para.getDbname() ) );
		}
		else if ( dbtype == DBType.ORACLE )
		{
			para.setTableInfoList( autocodeDAO.getOracleTableInfo() );
		}

		GeneralCode generalCode = new GeneralCode( dbtype );
		generalCode.general( para );

		String codeZipName = "autocode_" + ( new Date().getTime() ) + ".zip";

		Compress compress = new Compress();

		compress.zip( para.getPath() , para.getPath() + File.separatorChar + "../" + codeZipName );

		response.setContentType( "application/epub+zip" );
		response.setHeader( "Pragma" , "No-cache" );
		response.setHeader( "Cache-Control" , "no-cache" );
		response.setDateHeader( "Expires" , 0 );
		response.setCharacterEncoding( "UTF-8" );
		codeZipName = java.net.URLEncoder.encode( codeZipName , "UTF-8" );
		response.setHeader( "Content-Disposition" , "attachment; filename=" + codeZipName );

		File zipfile = new File( para.getPath() + File.separatorChar + "../" + codeZipName );

		FileCopyUtils.copy( new FileInputStream( zipfile ) , os );
		zipfile.delete();
		DataTool.deleteFile( new File( para.getPath() ));
	}
	
}
