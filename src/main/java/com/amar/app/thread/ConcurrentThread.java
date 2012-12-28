package com.amar.app.thread;

public class ConcurrentThread implements Runnable
{
	private String name = "";

	public ConcurrentThread( String name )
	{
		this.name = name;
	}

	@Override
	public void run()
	{
		int i = 0;
		while ( true )
		{
			try
			{
				System.out.println( "name:" + name + "_" + i );
				i ++ ;
				Thread.sleep( 1000L );
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

}
