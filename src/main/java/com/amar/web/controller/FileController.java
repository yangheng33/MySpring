package com.amar.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.amar.constant.ProjectInfo;
import com.amar.util.TimeDateUtil;
import com.amar.web.framework.BaseController;

@SuppressWarnings( { "unchecked", "rawtypes" } )
@Controller
@RequestMapping( "file.amar" )
public class FileController extends BaseController
{
	@Resource( name = "projectInfo" )
	private ProjectInfo projectInfo;

	private final Logger log = Logger.getLogger( this.getClass() );

	@RequestMapping( params = "method=getDirDetial" )
	public String getDirDetial( HttpServletRequest request , HttpServletResponse response )
	{
		String path = request.getParameter( "path" );

		if ( path != null )
		{
			File file = new File( path );

			File [] subFiles = file.listFiles();

			if ( subFiles.length > 0 )
			{
				List list = new ArrayList();
				for( File subfile : subFiles )
				{
					if ( subfile.isFile() )
					{
						Map map = new HashMap();

						NumberFormat format = NumberFormat.getInstance();
						double size = subfile.length() * 1.0 / 1024 / 1024;
						format.setMaximumFractionDigits( 6 );
						String size_str = format.format( size );

						map.put( "name" , subfile.getName() );
						map.put( "path" , subfile.getPath() );
						map.put( "totalspace" , size_str + " MB" );
						map.put( "lastmodified" , TimeDateUtil.getDateTime( new Date( subfile.lastModified() ) ) );
						list.add( map );
					}
				}
				request.setAttribute( "fileList" , list );
			}
		}
		return "file/file";
	}

	@RequestMapping( params = "method=init" )
	public String getAllFile( HttpServletRequest request , HttpServletResponse response )
	{

		return "file/list";
	}

	@RequestMapping( params = "method=getAllFileDir" )
	public void getAllFileDir( HttpServletRequest request , HttpServletResponse response )
	{
		File file = new File( projectInfo.datadir + "file/" );

		if ( ! file.exists() )
		{
			file.mkdirs();
		}

		Map map = getAllFileR( file );

		JSONObject json = JSONObject.fromObject( map );

		sendData( response , "[" + json.toString() + "]" );
	}

	private Map getAllFileR( File file )
	{
		Map map = new HashMap();
		if ( file == null )
		{
			log.info( "file is null" );
		}
		else if ( file.isDirectory() )
		{
			Map attr = new HashMap();
			attr.put( "path" , file.getPath() );
			attr.put( "type" , "directory" );
			map.put( "attr" , attr );
			map.put( "state" , "open" );
			map.put( "data" , file.getName() );

			int length = file.listFiles().length;
			Map submap[] = new HashMap [ length ];
			for( int i = 0 ; i < length ; i ++ )
			{
				File subFile = file.listFiles()[ i ];
				submap[ i ] = getAllFileR( subFile );
			}
			map.put( "children" , submap );
		}
		return map;
	}

	@RequestMapping( params = "method=downFile" )
	public void downFile( HttpServletRequest request , HttpServletResponse response ) throws FileNotFoundException , IOException
	{
		String path = request.getParameter( "path" );
		File file = new File( path );
		response.setContentType( "application/epub+zip" );
		response.setHeader( "Pragma" , "No-cache" );
		response.setHeader( "Cache-Control" , "no-cache" );
		response.setDateHeader( "Expires" , 0 );
		response.setCharacterEncoding( "UTF-8" );
		String filename = java.net.URLEncoder.encode( file.getName() , "UTF-8" );
		response.setHeader( "Content-Disposition" , "attachment; filename=" + filename );

		FileCopyUtils.copy( new FileInputStream( file ) , response.getOutputStream() );
	}

	@RequestMapping( params = "method=uploadFile" )
	public void uploadFile( HttpServletRequest request , HttpServletResponse response ) throws FileNotFoundException , IOException
	{
		String path = request.getParameter( "dirname" );

		if ( path != null && path.length() > 0 && request instanceof MultipartHttpServletRequest )
		{
			MultipartHttpServletRequest multipartRequest = ( MultipartHttpServletRequest ) request;

			MultipartFile multipartFile = multipartRequest.getFile( "files" );

			String fileFullName = path + "/" + multipartFile.getOriginalFilename();

			File file = new File( fileFullName );

			FileCopyUtils.copy( multipartFile.getBytes() , file );
		}

	}

	@RequestMapping( params = "method=addFolder" )
	public void addFolder( HttpServletRequest request , HttpServletResponse response ) throws FileNotFoundException , IOException
	{
		String path = request.getParameter( "dirname" );
		String title = request.getParameter( "title" );
		System.out.println( path + "," + title );
	}

	@RequestMapping( params = "method=renameFolder" )
	public void renameFolder( HttpServletRequest request , HttpServletResponse response ) throws FileNotFoundException , IOException
	{
		String path = request.getParameter( "path" );
		String title = request.getParameter( "title" );
		System.out.println( path + "," + title );
	}

	@RequestMapping( params = "method=deleteFolder" )
	public void deleteFolder( HttpServletRequest request , HttpServletResponse response ) throws FileNotFoundException , IOException
	{
		String path = request.getParameter( "path" );
		String title = request.getParameter( "title" );
		System.out.println( path + "," + title );
	}
}
