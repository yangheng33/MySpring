package com.amar.app.webservice.demo2;

import javax.jws.WebService;

@WebService
public interface IUserinfo
{
	String getUsername(String userid);
}
