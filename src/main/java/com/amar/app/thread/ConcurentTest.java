package com.amar.app.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurentTest
{
	final BlockingQueue<Runnable> queue = new SynchronousQueue<Runnable>();

	final ThreadPoolExecutor executor = new ThreadPoolExecutor( 11 , 20 , 30 , TimeUnit.SECONDS , queue , Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy() );

	public static void main( String [] args )
	{
		ConcurentTest test = new ConcurentTest();

		int ThreadCount = 10;
		for( int i = 0 ; i < ThreadCount ; i ++ )
		{
			ConcurrentThread con = new ConcurrentThread( "Thread_" + i );
			test.queue.add( con );
		}

		System.out.println( test.executor.getTaskCount() );
	}

	public void test1()
	{
		int ThreadCount = 3;
		for( int i = 0 ; i < ThreadCount ; i ++ )
		{
			ConcurrentThread con = new ConcurrentThread( "Thread_" + i );
			Thread thread = new Thread( con );
			thread.start();
		}
	}
}
