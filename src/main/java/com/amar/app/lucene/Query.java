package com.amar.app.lucene;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;

public class Query
{

	public static void main( String [] args ) throws IOException
	{

		String indexPath = "C:/test/index";
		String key = "检验室";

		Query query = new Query();
		query.query( key,indexPath );
	}

	public void query( String query , String indexPath ) throws IOException
	{
		File indexDir = new File( indexPath );
		FSDirectory directory = FSDirectory.open( indexDir );
		DirectoryReader directoryReader = DirectoryReader.open( directory );
		IndexSearcher indexSearch = new IndexSearcher( directoryReader );
		Term term = new Term( "content" , query.toLowerCase() );
		TermQuery luceneQuery = new TermQuery( term );
		TopDocs topDocs = indexSearch.search( luceneQuery , 100 );

		for( ScoreDoc scoreDoc : topDocs.scoreDocs )
		{
			Document doc = indexSearch.doc( scoreDoc.doc );
			System.out.println( "您要查找的'" + query + "'位于:" + doc.get( "path" ) + "" );
		}
	}

}
