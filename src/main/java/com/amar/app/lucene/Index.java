package com.amar.app.lucene;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class Index
{
	protected IndexWriter indexWriter;

	public void writeDocument( Document document )
	{
		try
		{
			indexWriter.addDocument( document );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	public void initWriter( String indexPath )
	{
		SmartChineseAnalyzer smartChineseAnalyzer = new SmartChineseAnalyzer( Version.LUCENE_43 );

		initWriter( indexPath , smartChineseAnalyzer );
	}

	public void initWriter( String indexPath , Analyzer analyzer )
	{
		try
		{
			File indexDir = new File( indexPath );

			IndexWriterConfig config = new IndexWriterConfig( Version.LUCENE_43 , analyzer );

			indexWriter = new IndexWriter( FSDirectory.open( indexDir ) , config );

		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	public void writeClose()
	{
		try
		{
			indexWriter.close();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}
}
