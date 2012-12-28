package com.amar.util.structure;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings( "rawtypes" )
public enum SpringBeanType
{
	SERVICE(Service.class), CONTROLLER(Controller.class), RESOURCE(Resource.class), REPOSITORY(Repository.class), COMPONENT(Component.class), REQUEST_MAPPING(RequestMapping.class);

	private Class value;

	private SpringBeanType( Class value )
	{
		this.value = value;
	}
 
	public static SpringBeanType getType( Class value )
	{
		SpringBeanType [] items = values();
		for( SpringBeanType item : items )
		{
			if ( item.value == value ) { return item; }
		}
		return null;
	}
}
