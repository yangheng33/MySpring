package com.amar.util.randomcode;

import java.awt.image.BufferedImage;

public class RandomPicInfo
{
	private String code;

	private BufferedImage image;

	public String getCode()
	{
		return code;
	}

	public void setCode( String code )
	{
		this.code = code;
	}

	public BufferedImage getImage()
	{
		return image;
	}

	public void setImage( BufferedImage image )
	{
		this.image = image;
	}

	public RandomPicInfo( String code , BufferedImage image )
	{
		super();
		this.code = code;
		this.image = image;
	}

	public RandomPicInfo()
	{
		super();
	}
}
