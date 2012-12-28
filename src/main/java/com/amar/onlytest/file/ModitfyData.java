/**
 * 
 */
package com.amar.onlytest.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.amar.util.TimeDateUtil;

/**
 * @author Administrator
 */
public class ModitfyData
{
	static public String dir = "C:/Documents and Settings/Administrator/桌面/data-files/";

	static public String dataSuffix = ".txt";

	public static void main( String [] args )
	{
		ModitfyData mf = new ModitfyData();

		mf.getFileNames( ModitfyData.dir );

		// 看时间

		/* */
	}

	public void lookDate()
	{
		long ct = System.currentTimeMillis();
		long sday = TimeDateUtil.getDayTime( ct );// 开始时间
		long eday = sday + 24 * 3600 * 1000;// 结束时间

		sday = sday - 24 * 3600 * 1000 * 2;
		eday = eday - 24 * 3600 * 1000 * 2;

		System.out.println( sday + "," + eday );
	}

	public void getFileNames( String dir )
	{
		// List < String > fileNames = new ArrayList < String >();

		File root = new File( dir );
		File [] allFile = root.listFiles( new FilenameFilter()
		{
			public boolean accept( File dir , String name )
			{
				if ( name.endsWith( ModitfyData.dataSuffix ) ) return true;
				else return false;
			}
		} );

		String except = ",line_bow,bar_test_all,line_anchor,line_dot,line_on_show,pie_fixed_radius,pie_label_colours,pie_many_slices,";

		for( File file : allFile )
		{
			String fileName = file.getName().replace( dataSuffix , "" );
			fileName = fileName.replace( "-" , "_" );

			// System.out.println("<INPUT TYPE=BUTTON OnClick=\"loadChart("+fileName+",'"+fileName+"');\" VALUE=\"" +fileName+"\"/>");

			if ( ! except.contains( "," + fileName + "," ) )
			{
				System.out.println( "var " + fileName + "=" );
				readFileByLines( file );
				System.out.println( ";" );
			}
		}

	}

	public void readFileByLines( File file )
	{
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader( new FileReader( file ) );
			String tempString = null;
			int line = 1;

			while ( ( tempString = reader.readLine() ) != null )
			{

				System.out.println( tempString );
				line ++ ;
			}
			reader.close();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		finally
		{
			if ( reader != null )
			{
				try
				{
					reader.close();
				}
				catch ( IOException e1 )
				{
				}
			}
		}
	}

	public static void appendMethodA( String fileName , String content )
	{
		try
		{
			// 打开一个随机访问文件流，按读写方式
			RandomAccessFile randomFile = new RandomAccessFile( fileName , "rw" );
			// 文件长度，字节数
			long fileLength = randomFile.length();
			// 将写文件指针移到文件尾。
			randomFile.seek( fileLength );
			randomFile.writeBytes( content );
			randomFile.close();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

}
