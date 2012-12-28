package com.amar.web.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.amar.constant.ProjectInfo;
import com.amar.db.ibatis.dao.Metarnet_visitDAO;
import com.amar.util.SpringBeanFactory;
import com.amar.web.model.Metarnet_visit;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

@Controller
@RequestMapping( "zhounan.amar" )
public class Zhounan
{
	@Resource( name = "metarnet_visitDAO" )
	private Metarnet_visitDAO metarnet_visitDAO;

	@RequestMapping( params = "method=toAnalyze" )
	public String toAnalyze( HttpServletRequest request , HttpServletResponse response )
	{
		metarnet_visitDAO.deleteAllMetarnet_visit();
		
		request.setAttribute( "status" , "no" );
		return "zhounan/analyze";
	}

	@Transactional( propagation = Propagation.REQUIRED , rollbackFor = { IOException.class } )
	@RequestMapping( params = "method=analyze" )
	public String analyze( HttpServletRequest request , HttpServletResponse response ) throws IOException , IllegalStateException
	{
		Date startDate = new Date(); 
		metarnet_visitDAO.deleteAllMetarnet_visit();

		MultipartHttpServletRequest multipartRequest = ( MultipartHttpServletRequest ) request;

		MultipartFile multipartFile = multipartRequest.getFile( "file" );

		BufferedReader read = new BufferedReader( new InputStreamReader( multipartFile.getInputStream() ) );

		String line = "";
		int i = 1;
		while ( ( line = read.readLine() ) != null )
		{
			Metarnet_visit visit = analyzeMetarnetFile( line.trim() );

			if ( visit != null )
			{
				metarnet_visitDAO.addMetarnet_visit( visit );
			}
			i ++ ;
		}
		
		Date endDate = new Date();
		
		float time = (endDate.getTime()- startDate.getTime());
		
		request.setAttribute( "status" , time+"" );
		return "zhounan/analyze";
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

	@SuppressWarnings( "rawtypes" )
	@RequestMapping( params = "method=exportExcel" )
	public void exportExcel( HttpServletRequest request , HttpServletResponse response ) throws IOException , IllegalStateException
	{
		List<Metarnet_visit> visitlist = metarnet_visitDAO.findMetarnetVisitOrderByZhounan();

		List<Map> statisticslist = metarnet_visitDAO.findMetarnetVisitStatisticsByZhounan();

		String fileName = "周楠陶毅访问列表统计.xlsx";
		FileOutputStream fos = null;
		try
		{
			String [] tableHeader = { "协议", "Inside global ip", "Inside global port", "Inside local ip", "Inside local port", "Outside local ip", "Outside local port", "Outside global ip",
					"Outside global port" };

			HSSFWorkbook demoWorkBook = new HSSFWorkbook();

			HSSFSheet demoSheet = demoWorkBook.createSheet( "明细表" );

			// 表头的单元格个数目
			short cellNumber = ( short ) tableHeader.length;

			HSSFHeader header = demoSheet.getHeader();

			header.setCenter( fileName );

			int rowNumber = 0;
			HSSFRow headerRow = demoSheet.createRow( rowNumber );
			for( int i = 0 ; i < cellNumber ; i ++ )
			{
				HSSFCell headerCell = headerRow.createCell( i );
				headerCell.setCellValue( tableHeader[ i ] );
			}

			for( int i = 0 ; i < visitlist.size() ; i ++ )
			{
				int column = 0;
				Metarnet_visit visit = visitlist.get( i );

				HSSFRow contentRow = demoSheet.createRow( ++ rowNumber );
				HSSFCell protocol_cell = contentRow.createCell( column ++ );
				protocol_cell.setCellValue( visit.getProtocol() );

				HSSFCell inside_global_ip_cell = contentRow.createCell( column ++ );
				inside_global_ip_cell.setCellValue( visit.getInside_global_ip() );

				HSSFCell inside_global_port_cell = contentRow.createCell( column ++ );
				inside_global_port_cell.setCellValue( visit.getInside_global_port() );

				HSSFCell inside_local_ip_cell = contentRow.createCell( column ++ );
				inside_local_ip_cell.setCellValue( visit.getInside_local_ip() );

				HSSFCell inside_local_port_cell = contentRow.createCell( column ++ );
				inside_local_port_cell.setCellValue( visit.getInside_local_port() );

				HSSFCell outside_local_ip_cell = contentRow.createCell( column ++ );
				outside_local_ip_cell.setCellValue( visit.getOutside_local_ip() );

				HSSFCell outside_local_port_cell = contentRow.createCell( column ++ );
				outside_local_port_cell.setCellValue( visit.getOutside_local_port() );

				HSSFCell outside_global_ip_cell = contentRow.createCell( column ++ );
				outside_global_ip_cell.setCellValue( visit.getOutside_global_ip() );

				HSSFCell outside_global_port_cell = contentRow.createCell( column ++ );
				outside_global_port_cell.setCellValue( visit.getOutside_global_port() );

			}

			String [] tableHeader2 = { "次数", "ip地址" };
			HSSFSheet demoSheet2 = demoWorkBook.createSheet( "总表" );
			rowNumber = 0;
			cellNumber = ( short ) tableHeader2.length;
			HSSFRow headerRow2 = demoSheet2.createRow( rowNumber );
			
			for( int i = 0 ; i < cellNumber ; i ++ )
			{
				HSSFCell headerCell = headerRow2.createCell( i );
				headerCell.setCellValue( tableHeader2[ i ] );
			}
			for( int i = 0 ; i < statisticslist.size() ; i ++ )
			{
				int column = 0;
				Map statistics = statisticslist.get( i );
				
				HSSFRow contentRow = demoSheet2.createRow( ++ rowNumber );
				HSSFCell count = contentRow.createCell( column ++ );
				count.setCellValue( statistics.get( "counts" ).toString() );
				HSSFCell ip = contentRow.createCell( column ++ );
				ip.setCellValue( statistics.get( "inside_local_ip" ).toString() );
			}
			
			if ( demoWorkBook != null )
			{
				response.setContentType( "application/ms-excel" );
				response.setHeader( "Content-Disposition" , "attachment;filename=" + new String( ( fileName ).getBytes() , "utf8" ) );
				demoWorkBook.write( response.getOutputStream() );
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
				if ( fos != null )
					fos.close();
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
