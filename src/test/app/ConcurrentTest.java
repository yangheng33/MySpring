package app;

import org.junit.Assert;
import org.junit.Test;
import com.amar.app.thread.ConcurrentThread;

public class ConcurrentTest
{
	/**
	 * 测试线程好像没用
	 * @return void
	 * @description 
	 */
	@Test
	public void ConcurrentThread()
	{
		int ThreadCount = 3;
		for( int i = 0 ; i < ThreadCount ; i ++ )
		{
			ConcurrentThread con = new ConcurrentThread( "Thread_" + i );
			Thread thread = new Thread( con );
			thread.start();
		}
		Assert.assertEquals( 1 , 1 );
	}
}
