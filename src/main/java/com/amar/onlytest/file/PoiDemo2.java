package com.amar.onlytest.file;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFooter;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @description
 * @date 2011-11-7 下午05:12:13
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
public class PoiDemo2
{

	/**
	 * @param args
	 * @return void
	 * @description
	 */
	public static void main( String [] args )
	{
		String fileName = "D:\\世界五百强企业名次表.xls";
		FileOutputStream fos = null;
		try
		{
			String [] tableHeader = { "企业中文名", "所属国家", "企业英文名", "2003年排名", "2004年排名", "2005年排名", "2006年排名", "2007年排名", "主要业务", "2003年营业额", "2004年营业额", "2005年营业额", "2006年营业额" };

			HSSFWorkbook demoWorkBook = new HSSFWorkbook();

			HSSFSheet demoSheet = demoWorkBook.createSheet( "The World's 500 Enterprises" );

			// 表头的单元格个数目
			short cellNumber = ( short ) tableHeader.length;

			HSSFHeader header = demoSheet.getHeader();

			header.setCenter( "世界五百强企业名次表" );

			HSSFRow headerRow = demoSheet.createRow( 0 );
			for( int i = 0 ; i < cellNumber ; i ++ )
			{
				HSSFCell headerCell = headerRow.createCell( i );
				// headerCell.setEncoding(HSSFCell.ENCODING_UTF_16);
				headerCell.setCellValue( tableHeader[ i ] );
			}

			fos = new FileOutputStream( fileName );

			demoSheet.setGridsPrinted( true );
			HSSFFooter footer = demoSheet.getFooter();
			footer.setRight( "Page " + HSSFFooter.page() + " of " + HSSFFooter.numPages() );

			demoWorkBook.write( fos );

			JOptionPane.showMessageDialog( null , "表格已成功导出到 : " + fileName );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if ( fos != null ) fos.close();
			}
			catch ( IOException e )
			{
				e.printStackTrace();
			}
		}

	}

}
