package com.amar.web.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.amar.constant.ProjectInfo;
import com.amar.db.ibatis.dao.Metarnet_visitDAO;
import com.amar.util.SpringBeanFactory;
import com.amar.web.framework.BaseController;
import com.amar.web.model.Metarnet_visit;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

@Controller
@RequestMapping( "zhounan.amar" )
public class Zhounan  extends BaseController
{
	@Resource( name = "metarnet_visitDAO" )
	private Metarnet_visitDAO metarnet_visitDAO;

	@RequestMapping( params = "method=toAnalyze" )
	public String toAnalyze( HttpServletRequest request , HttpServletResponse response )
	{
		@SuppressWarnings( "rawtypes" )
		List<Map> list = metarnet_visitDAO.findMetarnetVisitStatisticsByZhounan();

		if ( list != null && list.size() > 0 )
		{
			request.setAttribute( "status" , "ok" );
		}
		else
		{
			request.setAttribute( "status" , "no" );
		}
		return "zhounan/analyze";
	}

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { IOException.class } )
	@RequestMapping( params = "method=analyze" )
	public String analyze( HttpServletRequest request , HttpServletResponse response ) throws IOException , IllegalStateException
	{
		Date startDate = new Date();

		if ( request instanceof MultipartHttpServletRequest )
		{
			//metarnet_visitDAO.deleteAllMetarnet_visit();

			MultipartHttpServletRequest multipartRequest = ( MultipartHttpServletRequest ) request;

			MultipartFile multipartFile = multipartRequest.getFile( "file" );

			BufferedReader read = new BufferedReader( new InputStreamReader( multipartFile.getInputStream() ) );

			String line = "";

			while ( ( line = read.readLine() ) != null )
			{
				Metarnet_visit visit = analyzeMetarnetFile( line.trim() );

				if ( visit != null )
				{
					metarnet_visitDAO.addMetarnet_visit( visit );
				}

			}

			Date endDate = new Date();

			float time = ( endDate.getTime() - startDate.getTime() );

			request.setAttribute( "status" , "ok" );
			request.setAttribute( "time" , time + "" );
			return "zhounan/analyze";
		}
		else
		{
			return "zhounan/analyze";
		}
	}

	
	@RequestMapping( params = "method=del" )
	public String del( HttpServletRequest request , HttpServletResponse response ) throws IOException , IllegalStateException
	{
		
		Date startDate = new Date();

		if ( request instanceof MultipartHttpServletRequest )
		{
			metarnet_visitDAO.deleteAllMetarnet_visit();

			Date endDate = new Date();

			float time = ( endDate.getTime() - startDate.getTime() );

			request.setAttribute( "status" , "ok" );
			request.setAttribute( "time" , time + "" );
			return "zhounan/analyze";
		}
		else
		{
			return "zhounan/analyze";
		}

	}
	
	/***
	 * Pro Inside global Inside local Outside local Outside global
	 * udp 211.103.249.4:1118 192.168.1.28:2425 192.168.90.53:2425 192.168.90.53:2425
	 * tcp 211.103.249.4:1898 192.168.1.38:1898 183.60.50.51:443 183.60.50.51:443
	 * 
	 * @param line
	 */
	public Metarnet_visit analyzeMetarnetFile( String line )
	{
		Metarnet_visit visit = new Metarnet_visit();
		if ( line.startsWith( "tcp" ) || line.startsWith( "udp" ) )
		{
			line = line.replaceAll( " " , "," );

			line = replace( line , "[,]{1,100}" , "," );
			String [] _line = line.split( "," );

			if ( _line.length == 5 )
			{
				visit.setProtocol( _line[ 0 ] );

				String [] s1 = getIpAndPort( _line[ 1 ] );
				String [] s2 = getIpAndPort( _line[ 2 ] );
				String [] s3 = getIpAndPort( _line[ 3 ] );
				String [] s4 = getIpAndPort( _line[ 4 ] );

				visit.setInside_global_ip( s1[ 0 ] );
				visit.setInside_global_port( s1[ 1 ] );
				visit.setInside_local_ip( s2[ 0 ] );
				visit.setInside_local_port( s2[ 1 ] );

				visit.setOutside_local_ip( s3[ 0 ] );
				visit.setOutside_local_port( s3[ 1 ] );
				visit.setOutside_global_ip( s4[ 0 ] );
				visit.setOutside_global_port( s4[ 1 ] );
				visit.setRecorddate( new Date() );
			}
			else
			{
				visit = null;
			}

		}
		else
		{
			visit = null;
		}
		return visit;
	}

	@RequestMapping( params = "method=exportExcel4Test" )
	public void exportExcel4Test( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		String fileName = "周楠陶毅访问列表统计";
		XSSFWorkbook demoWorkBook = new XSSFWorkbook();
		Sheet demoSheet = demoWorkBook.createSheet( "明细表" );

		Row headerRow = demoSheet.createRow( 1 );
		for( int i = 0 ; i < 10 ; i ++ )
		{
			Cell headerCell = headerRow.createCell( i );
			headerCell.setCellValue( "a" );
		}

		// response.setContentType( "application/ms-excel" );
		response.setContentType( "application/binary;" );
		response.setHeader( "Content-Disposition" , "attachment;filename=" + new String( ( fileName ).getBytes() , "iso8859-1" ) + ".xlsx" );
		demoWorkBook.write( response.getOutputStream() );
	}

	@SuppressWarnings( "rawtypes" )
	@RequestMapping( params = "method=exportExcel" )
	public void exportExcel( HttpServletRequest request , HttpServletResponse response ) throws IOException , IllegalStateException
	{
		List<Map> statisticslist = metarnet_visitDAO.findMetarnetVisitStatisticsByZhounan();

		String fileName = "周楠陶毅访问列表统计.xlsx";
		
		
		OutputStream os = response.getOutputStream();
		
		SXSSFWorkbook demoWorkBook = null;
		try
		{
			String [] tableHeader = { "协议", "Inside global ip", "Inside global port", "Inside local ip", "Inside local port", "Outside local ip", "Outside local port", "Outside global ip",
					"Outside global port" };

			demoWorkBook = new SXSSFWorkbook(100);
		
			Sheet demoSheet = demoWorkBook.createSheet( "明细表" );

			// 表头的单元格个数目
			short cellNumber = ( short ) tableHeader.length;

			Header header = demoSheet.getHeader();

			header.setCenter( fileName );

			int rowNumber = 0;
			Row headerRow = demoSheet.createRow( rowNumber );
			for( int i = 0 ; i < cellNumber ; i ++ )
			{
				Cell headerCell = headerRow.createCell( i );
				headerCell.setCellValue( tableHeader[ i ] );
				
			}
			
			for (int j = 0; j < 20; j++) 
			{
				Map statistics = statisticslist.get( j );
				
				String inside_local_ip = statistics.get( "inside_local_ip" ).toString() ;
				
				Metarnet_visit metarnet_visit = new Metarnet_visit();
				
				metarnet_visit.setInside_local_ip(inside_local_ip);
				
				List<Metarnet_visit> visitlist = metarnet_visitDAO.findMetarnetVisitOrderByInsideLocalIP(metarnet_visit);
			
				for( int i = 0 ; i < visitlist.size() ; i ++ )
				{
					int column = 0;
					Metarnet_visit visit = visitlist.get( i );

					Row contentRow = demoSheet.createRow( ++ rowNumber );
					Cell protocol_cell = contentRow.createCell( column ++ );
					protocol_cell.setCellValue( visit.getProtocol() );

					
					Cell inside_global_ip_cell = contentRow.createCell( column ++ );
					inside_global_ip_cell.setCellValue( visit.getInside_global_ip() );

					Cell inside_global_port_cell = contentRow.createCell( column ++ );
					inside_global_port_cell.setCellValue( visit.getInside_global_port() );

					Cell inside_local_ip_cell = contentRow.createCell( column ++ );
					inside_local_ip_cell.setCellValue( visit.getInside_local_ip() );

					Cell inside_local_port_cell = contentRow.createCell( column ++ );
					inside_local_port_cell.setCellValue( visit.getInside_local_port() );

					Cell outside_local_ip_cell = contentRow.createCell( column ++ );
					outside_local_ip_cell.setCellValue( visit.getOutside_local_ip() );

					Cell outside_local_port_cell = contentRow.createCell( column ++ );
					outside_local_port_cell.setCellValue( visit.getOutside_local_port() );

					Cell outside_global_ip_cell = contentRow.createCell( column ++ );
					outside_global_ip_cell.setCellValue( visit.getOutside_global_ip() );

					Cell outside_global_port_cell = contentRow.createCell( column ++ );
					outside_global_port_cell.setCellValue( visit.getOutside_global_port() );

				}
				
			}
			
			
			
			String [] tableHeader2 = { "次数", "ip地址" };
			Sheet demoSheet2 = demoWorkBook.createSheet( "总表" );
			rowNumber = 0;
			cellNumber = ( short ) tableHeader2.length;
			Row headerRow2 = demoSheet2.createRow( rowNumber );

			for( int i = 0 ; i < cellNumber ; i ++ )
			{
				Cell headerCell = headerRow2.createCell( i );
				headerCell.setCellValue( tableHeader2[ i ] );
			}
			for( int i = 0 ; i < statisticslist.size() ; i ++ )
			{
				int column = 0;
				Map statistics = statisticslist.get( i );

				Row contentRow = demoSheet2.createRow( ++ rowNumber );
				Cell count = contentRow.createCell( column ++ );
				count.setCellValue( statistics.get( "counts" ).toString() );
				Cell ip = contentRow.createCell( column ++ );
				ip.setCellValue( statistics.get( "inside_local_ip" ).toString() );
			}

			if ( demoWorkBook != null )
			{
				response.setContentType( "application/ms-excel" );
				
				response.setHeader( "Content-Disposition" , "attachment;filename=" + new String( ( fileName ).getBytes() , "iso8859-1" ) );

				demoWorkBook.write(os);
				
			}
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		finally
		{
			
			try
			{
				if ( os != null )
				{
					os.flush();
					
					os.close();
				}
	
			}
			catch ( IOException e )
			{
				e.printStackTrace();
			}
		}
	}

	public String [] getIpAndPort( String src )
	{
		String result[] = { "", "" };
		if ( src != null && src.length() > 0 && src.contains( ":" ) )
		{
			result = src.split( ":" );
		}
		return result;
	}

	public String replace( String src , String pattern , String target )
	{
		Matcher matcher = Pattern.compile( pattern ).matcher( src );
		boolean result = matcher.find();
		StringBuffer sb = new StringBuffer();
		while ( result )
		{
			matcher.appendReplacement( sb , target );
			result = matcher.find();
		}
		matcher.appendTail( sb );
		return sb.toString();
	}

	@RequestMapping( params = "method=upload" )
	public String upload( HttpServletRequest request , HttpServletResponse response ) throws IOException , IllegalStateException
	{
		MultipartHttpServletRequest multipartRequest = ( MultipartHttpServletRequest ) request;

		MultipartFile multipartFile = multipartRequest.getFile( "file" );

		String logImageName = multipartFile.getOriginalFilename();

		ProjectInfo projectInfo = SpringBeanFactory.getBean( ProjectInfo.name );

		String fileName = projectInfo.getDatadir() + File.separator + logImageName;

		File file = new File( fileName );

		multipartFile.transferTo( file );

		return "zhounan/analyze";
	}
}
