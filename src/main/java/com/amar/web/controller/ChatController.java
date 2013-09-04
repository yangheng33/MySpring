package com.amar.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "chat.amar" )
public class ChatController
{
	@RequestMapping( params = "method=init" )
	public String upload( HttpServletRequest request , HttpServletResponse response )
	{
		return "chat/page2";
	}
}
