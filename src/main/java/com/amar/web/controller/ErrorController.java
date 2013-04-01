package com.amar.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amar.web.framework.BaseController;

@Controller
@RequestMapping( "error.amar" )
public class ErrorController extends BaseController
{
	@RequestMapping( params = "method=toWarning" )
	public String toWarning( HttpServletRequest request , HttpServletResponse response )
	{
		return "error/warning";
	}
}
