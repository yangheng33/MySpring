package util;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import com.amar.util.HttpURLUtils;
import com.google.code.morphia.utils.Assert;

/**
 * @description
 * @date 2012-2-20 下午02:03:10
 * @author Amar.Yang
 * @mail yanghs@sun-ground.com
 */
public class TestUtil
{

	@Test
	public void testHttpURLUtils()
	{ 
		String url_get = "http://localhost/MySpring/anno.amar?a=json";
		String result_get = HttpURLUtils.doGet( url_get );
		System.out.println( "get:"+result_get );

		Map < String , String > map = new HashMap < String , String >();
		map.put( "a" , "json" );
		String url_post = "http://localhost/MySpring/anno.amar";
		String result_post = HttpURLUtils.doPost( url_post , map );
		System.out.println( "post:"+result_post );

		Assert.isTrue( true );
	}
}
