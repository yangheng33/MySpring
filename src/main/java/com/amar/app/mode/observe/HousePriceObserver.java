package com.amar.app.mode.observe;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer
{
	private String name;

	public HousePriceObserver( String name )
	{ // 设置每一个购房者的名字
		this.name = name;
	}

	public void update( Observable o , Object arg )
	{
		if ( arg instanceof Float )
		{
			System.out.print( this.name + "观察到价格更改为：" );
			System.out.println( ( ( Float ) arg ).floatValue() );
		}
	}
}
