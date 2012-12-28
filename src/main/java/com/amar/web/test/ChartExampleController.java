package com.amar.web.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "chart.amar" )
public class ChartExampleController
{
	@RequestMapping( )
	public void testChart( HttpServletRequest request , HttpServletResponse response )
	{
		try
		{
			response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

			String t = request.getParameter( "t" );

			String res = "" + request.getSession().getAttribute( "json" + t );

			request.getSession().removeAttribute( "json" + t );

			response.getWriter().write( res );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}

	@RequestMapping( params = "a=getJson" )
	public void defatultEntry( HttpServletRequest request , HttpServletResponse response ) throws Exception
	{
		response.setHeader( "Content-Type" , "text/plain;charset=UTF-8" );

		String t = request.getParameter( "t" );

		String res = "" + request.getSession().getAttribute( "json" + t );

		request.getSession().removeAttribute( "json" + t );

		response.getWriter().write( res );
	}

	@RequestMapping( params = "a=chart1" )
	public String chart1( HttpServletRequest request , HttpServletResponse response )
	{
		try
		{
			Map < String , Double > map = new HashMap < String , Double >();
			map.put( "红--颜色" , 3d );
			map.put( "黄--颜色" , 3d );
			map.put( "蓝--颜色" , 4d );
			double total = 10d;

			request.setAttribute( "total" , total );

			long t = System.nanoTime();
			String json = this.getJson( map );
			request.getSession().setAttribute( "json" + t , json );
			request.setAttribute( "t" , t );

		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

		return "test/chart";
	}
	
	@RequestMapping( params = "chart=pie" )
	public String chart2( HttpServletRequest request , HttpServletResponse response )
	{
		try
		{
			JSONObject element = new JSONObject();
			element.put( "type" , "pie" );
			String [] colors = new String [] { "#d01f3c", "#356aa0", "#C79810" };
			element.put( "colours" , colors );
			element.put( "alpha" , 0.8 );
			element.put( "border" , 2 );
			element.put( "start-angle" , 90 );
			element.put( "tip" , "数量：#val#<br>总：#total#<br>#percent#<br>#label#" );
			
			JSONObject [] values = new JSONObject [ 4 ];
			
			for(int i=0;i<4;i++)
			{
				JSONObject v = new JSONObject();
				
				v.put( "value" , i*10 );
				
				v.put( "font-size" , 15+i*3 );
				
				v.put( "label" , "__"+i );
				
				//v.put( "label" , "__"+i );
				
				values[i] = v;
			}
			element.put( "values" , values );
			
			JSONObject [] elements = new JSONObject [] { element };
			JSONObject json = new JSONObject();
			
			JSONObject title = new JSONObject();
			title.put( "text" , "测试饼图" );

			json.put( "title" , title );
			json.put( "elements" , elements );
			
			request.setAttribute( "chartJson" , json.toString() );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

		return "test/chart_pie";
	}

	public String getJson( Map < String , Double > map )
	{
		JSONObject json = new JSONObject();
		JSONObject title = new JSONObject();
		title.put( "text" , "测试饼图" );
		//title.put( "style" , "{font-size: 40px;}" );
		JSONObject element = new JSONObject();
		element.put( "type" , "pie" );
		String [] colors = new String [] { "#d01f3c", "#356aa0", "#C79810" };
		element.put( "colours" , colors );
		element.put( "alpha" , 0.8 );
		element.put( "border" , 2 );
		element.put( "start-angle" , 90 );
		element.put( "gradient-fill" , false );
		element.put( "no-labe-ls" , true );
		element.put( "tip" , "数量：#val#<br>总：#total#<br>#percent#<br>#label#" );

		JSONObject [] values = new JSONObject [ map.size() ];
		int i = 0;
		for( Entry < String , Double > e : map.entrySet() )
		{
			JSONObject j = new JSONObject();
			j.put( "value" , e.getValue() );
			j.put( "label" , e.getKey() );
			values[ i ++ ] = j;
		}
		element.put( "values" , values );

		JSONObject [] elements = new JSONObject [] { element };
		json.put( "title" , title );
		json.put( "elements" , elements );

		return json.toString();
	}
	
	@RequestMapping( params = "chart=bar" )
	public String bar( HttpServletRequest request , HttpServletResponse response )
	{
		
		JSONObject json = new JSONObject();
		
		JSONObject title = new JSONObject();
		JSONObject y_legend = new JSONObject();
		JSONObject element = new JSONObject();
		
		JSONObject x_axis = new JSONObject();
		JSONObject y_axis = new JSONObject();
		
		JSONObject labels = new JSONObject();
		labels.put( "labels" , new String[]{ "abc","bcd","cde","def","efg","fgh"} );
		labels.put( "rotate" , -20 );
		
		title.put( "text", "玩家等级分布");
		title.put(  "style","{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}");
		
		y_legend.put( "text","number");
		y_legend.put( "style", "{color: #736AFF; font-size: 12px;}");
		
		element.put( "type" , "bar" );
		element.put( "alpha" , 0.5 );
		element.put( "colour" , "#9933CC" );
		element.put( "text" , "人数" );
		element.put( "font-size" , 10 );
		element.put( "values" , new long[]{ 1,2,3,4,5,2} );
		
		x_axis.put("stroke",3);
		x_axis.put("tick_height",10);
		x_axis.put("colour","#d000d0");
		x_axis.put("grid_colour","#00ff00");
		x_axis.put("labels", labels);
		
		y_axis.put("stroke",4);
		y_axis.put("tick_length",3);
		y_axis.put("colour","#d000d0");
		y_axis.put("grid_colour","#00ff00");
		y_axis.put("offset",0);
		y_axis.put("max", 7);
		
		JSONObject [] elements = new JSONObject [] { element };
		
		json.put( "title" , title );
		json.put( "y_legend" ,y_legend  );
		json.put( "elements" , elements );
		json.put( "x_axis" , x_axis );
		json.put( "y_axis" ,  y_axis);
		
		System.out.println( json.toString());
		
		request.setAttribute( "chartJson" , json.toString() );
		return "test/chart_pie";
	}
}
