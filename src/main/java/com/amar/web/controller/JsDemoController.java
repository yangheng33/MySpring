package com.amar.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.web.framework.BaseController;

@Controller
@RequestMapping( "jsDemo.amar" )
public class JsDemoController  extends BaseController
{
	
	@RequestMapping( params = "method=list" )
	public String init( HttpServletRequest request , HttpServletResponse response ) throws IOException
	{
		
		return "jsdemo/list";
	}
}
