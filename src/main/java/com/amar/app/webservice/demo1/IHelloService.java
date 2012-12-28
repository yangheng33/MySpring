package com.amar.app.webservice.demo1;

import javax.jws.WebService;

@WebService
public interface IHelloService
{
	Customer selectMaxAgeStudent( Customer c1 , Customer c2 );

	Customer selectMaxLongNameStudent( Customer c1 , Customer c2 );
}
