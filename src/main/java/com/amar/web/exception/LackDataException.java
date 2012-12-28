package com.amar.web.exception;

/**
 * 缺少数据异常
 */
public class LackDataException extends Exception
{

	private static final long serialVersionUID = - 8676215038465477213L;

	public LackDataException()
	{
		super();
	}

	public LackDataException( String info )
	{
		super( info );
	}
}
