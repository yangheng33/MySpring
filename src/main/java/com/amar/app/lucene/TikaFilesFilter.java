package com.amar.app.lucene;

import java.io.File;
import java.io.FileFilter;

public class TikaFilesFilter implements FileFilter
{

	public boolean accept( File path )
	{
		String [] ableExtendNames = { "pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "html", "htm" };

		boolean result = false;
		for( String extendName : ableExtendNames )
		{
			if ( path.getName().toLowerCase().endsWith( "." + extendName ) )
			{
				result = true;
			}
		}
		return result;
	}
}
