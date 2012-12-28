package com.amar.app.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings( "unused" )
public class Tree< T >
{

	/**
	 * @param args
	 */
	public static void main( String [] args )
	{

		// Tree t = new Tree();
		//
		// String rootFolder = "C:\\";
		//
		// Date dateDepthDateStart = new Date();
		// t.findDepthFirst( rootFolder );
		// Date dateDepthDateFinish = new Date();
		//
		// Date dateWidthDateStart = new Date();
		// t.findWidthFirst( rootFolder , new TreeFilter(){ public boolean dealCondition( File file ){return true;} } );
		// Date dateWidthDateFinish = new Date();
		//
		// t.p( "widthFirstCount:" + t.widthFirstCount );
		//
		// t.p( "depthFirstCount:" + t.depthFirstCount );
		//
		// t.p( "depthFirst waste time:" + ( dateDepthDateFinish.getTime() - dateDepthDateStart.getTime() ) );
		// t.p( "widthFirst waste time:" + ( dateWidthDateFinish.getTime() - dateWidthDateStart.getTime() ) );

	}

	public void rootFile()
	{
		File file = new File( "D:\\1.txt" );

		File [] rootFolder = File.listRoots();
		for( File f : rootFolder )
		{
			p( f.getPath() + f.isFile() + f.isDirectory() );
			if ( f.isDirectory() )
			{
				for( File f2 : f.listFiles() )
				{
					p( f2.getPath() );
				}
			}

		}
	}

	/*
	 * String rootFolder = "D:\\Program Files";
	 * 打印结果
	 * widthFirstCount:145193
	 * depthFirstCount:145193
	 * depthFirst waste time:259231
	 * widthFirst waste time:47500
	 * 不打印结果
	 * widthFirstCount:145193
	 * depthFirstCount:145193
	 * depthFirst waste time:6432
	 * widthFirst waste time:6618
	 * can't read D:\System Volume Information
	 * can't read D:\System Volume Information
	 * widthFirstCount:283979
	 * depthFirstCount:283979
	 * depthFirst waste time:221785
	 * widthFirst waste time:15290
	 */

	private long widthFirstCount = 0;

	private long depthFirstCount = 0;

	private long widthFirstCodeCount = 0;

	private long depthFirstCodeCount = 0;

	private Stack < File > dealStack = new Stack < File >();

	private Stack < File > subStack = new Stack < File >();

	public List < T > findWidthFirst( String pathname , TreeDeal < T > treeDeal )
	{
		List < T > list = new ArrayList < T >();

		File rootFolder = new File( pathname );

		subStack.push( rootFolder );

		while ( true )
		{
			while ( ! dealStack.isEmpty() )
			{
				File thisFolder = dealStack.pop();

				File [] subFiles = thisFolder.listFiles();

				if ( subFiles == null || ! thisFolder.canRead() )
				{
					p( "can't read " + thisFolder.getPath() );
				}
				else for( File subFile : subFiles )
				{
					if ( subFile.isDirectory() )
					{
						subStack.push( subFile );
					}
					else
					{
						T t = treeDeal.deal( subFile );
						if ( t != null )
						{
							list.add( t );
						}
						widthFirstCount ++ ;
					}
				}
			}

			if ( ! subStack.isEmpty() )
			{
				while ( ! subStack.isEmpty() )
				{
					dealStack.push( subStack.pop() );
				}
			}
			else
			{
				break;
			}
		}
		return list;
	}

	public void findDepthFirst( String pathname )
	{
		CountCodeColunm ccc = new CountCodeColunm();

		File thisFolder = new File( pathname );

		File [] subFiles = thisFolder.listFiles();

		if ( subFiles == null || ! thisFolder.canRead() )
		{
			p( "can't read " + thisFolder.getPath() );
		}
		else for( File subFile : subFiles )
		{
			if ( subFile.isDirectory() )
			{
				findDepthFirst( subFile.getPath() );
			}
			else
			{
				// p( subFile.getPath() );

				// depthFirstCodeCount += ccc.countOneFile( subFile );

				depthFirstCount ++ ;
			}
		}
	}

	public void p( String s )
	{
		System.out.println( s );
	}
}
