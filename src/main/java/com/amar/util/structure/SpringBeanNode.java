package com.amar.util.structure;

import java.util.ArrayList;
import java.util.List;

public class SpringBeanNode
{

	private String beanName;

	private String fullName;

	private SpringBeanType beanType;
	
	private List < SpringBeanNode > resourceList;

	private List < String > subNameList;

	public SpringBeanNode()
	{
		resourceList = new ArrayList < SpringBeanNode >();
		subNameList = new ArrayList < String >();
	}

	public String getBeanName()
	{
		return beanName;
	}

	public void setBeanName( String beanName )
	{
		this.beanName = beanName;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setFullName( String fullName )
	{
		this.fullName = fullName;
	}

	public List < SpringBeanNode > getResourceList()
	{
		return resourceList;
	}

	public void setResourceList( List < SpringBeanNode > resourceList )
	{
		this.resourceList = resourceList;
	}

	public List < String > getSubNameList()
	{
		return subNameList;
	}

	public void setSubNameList( List < String > subNameList )
	{
		this.subNameList = subNameList;
	}

	public SpringBeanType getBeanType()
	{
		return beanType;
	}

	public void setBeanType( SpringBeanType beanType )
	{
		this.beanType = beanType;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append( "SpringBeanNode [" );
		if ( beanName != null )
		{
			builder.append( "beanName=" );
			builder.append( beanName );
			builder.append( ", " );
		}
		if ( fullName != null )
		{
			builder.append( "fullName=" );
			builder.append( fullName );
			builder.append( ", " );
		}
		if ( beanType != null )
		{
			builder.append( "beanType=" );
			builder.append( beanType );
			builder.append( ", " );
		}
		if ( resourceList != null )
		{
			builder.append( "resourceList=[" );
			for( SpringBeanNode node : getResourceList() )
			{
				builder.append( node.getBeanName()).append( "," );
				
			}
			if( resourceList.size() >0 )
				builder.deleteCharAt( builder.length()-1 );
			builder.append( "]," );
		}
		if ( subNameList != null )
		{
			builder.append( "subNameList=[" );
			for( String node : getSubNameList() )
			{
				builder.append( node ).append( "," );
			}
			if( subNameList.size() >0 )
			builder.deleteCharAt( builder.length()-1 );
			
			builder.append( "]" );
		}
		builder.append( "]<br/><br/>" );
		return builder.toString();
	}

}
