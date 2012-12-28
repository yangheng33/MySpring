package com.amar.app.thread;

import java.util.Vector;

/**
 * @description
 * @date 2012-1-10 下午02:35:22
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
public class MyThread
{
	private int length = 1000;

	private Vector<String> value = new Vector<String>();

	private volatile boolean value2 = false;

	public MyThread()
	{
		for( int i=2001;i<20000;i++)
		System.out.println( "db.CountTest.insert( {'name':'amar"+i+"','value':"+i+",'type':'apple'}); ");
	}

	public void test_volatile()
	{
		Thread read_thread = new Thread( new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Thread.sleep( 5 * 1000 );
					value2 = true;
				}
				catch ( InterruptedException e )
				{
					e.printStackTrace();
				}

			}
		} );
		read_thread.setName( "read_thread" );
		read_thread.start();
		
		for( int j = 0 ; j < 20 ; j ++ )
		{
 
			Thread thread = new Thread( new Runnable()
			{
				@Override
				public void run()
				{
					boolean re = value2;
					while( re )
					{
						System.out.println(Thread.currentThread().getName()+" running...");
					}
					System.out.println("***"+Thread.currentThread().getName()+" stop...");
				}
			} );
			thread.setName( "print_" + j + "" );
			thread.start();
		}
		
		
	}

	public void test_synchronized()
	{
		for( int j = 0 ; j < 20 ; j ++ )
		{
			for( int i = 0 ; i < length ; i ++ )
			{
				value.add( i + "" );
				// System.out.println( "add:" + i );
			}

			Thread thread1 = new Thread( new Runnable()
			{
				@Override
				public void run()
				{
					synchronized ( value )
					{
						// System.out.println(Thread.currentThread().getName());
						for( int i = value.size() - 1 ; i >= 0 ; i -- )
						{
							value.remove( i );
							// System.out.println( "remove:" + i );
						}
					}
				}
			} );
			thread1.setName( "remove_" + j + "" );

			Thread thread2 = new Thread( new Runnable()
			{
				@Override
				public void run()
				{
					synchronized ( value )
					{
						// System.out.println(Thread.currentThread().getName());
						for( int i = value.size() - 1 ; i > 0 ; i -- )
						{
							// System.out.println( "print:" + value.get( i ) );
							value.get( i );
						}
					}
				}
			} );

			thread2.setName( "print_" + j + "" );

			thread1.start();
			thread2.start();
		}
	}

	public static void main( String [] args )
	{
		@SuppressWarnings( "unused" )
		MyThread myThread = new MyThread();
		//myThread.test_volatile();

	}

}
