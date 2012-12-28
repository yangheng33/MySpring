package com.amar.util.structure;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import com.amar.app.tree.Tree;
import com.amar.app.tree.TreeDeal;

public class SpringBeanInfo
{

	@SuppressWarnings( "rawtypes" )
	public List < SpringBeanNode > getBeanList( String path , String packageName )
	{
		List < SpringBeanNode > nodeList = new ArrayList < SpringBeanNode >();
		try
		{
			String cheakDir = path + packageName;

			List < String > classNameList = findWidthFirst( cheakDir , packageName );

			for( String s : classNameList )
			{
				Class c = Class.forName( s );

				Annotation [] classAnnotations = c.getAnnotations();

				if ( classAnnotations == null || classAnnotations.length < 1 )
				{
					continue;
				}
				else
				{
					SpringBeanNode node = getSpringBeanNodeFromList( classAnnotations );
					if ( node != null )
					{
						node.setFullName( s );
						nodeList.add( node );
					}
				}
			}

			if ( nodeList != null )
			{
				for( SpringBeanNode node : nodeList )
				{
					Class c = Class.forName( node.getFullName() );
					node.setResourceList( getResourceList( c.getDeclaredFields() , nodeList ) );
					c.getDeclaredMethods();

					node.setSubNameList( getSubNameList( c.getDeclaredMethods() ) );
				}
			}

		}
		catch ( ClassNotFoundException e )
		{
			e.printStackTrace();
		}

		return nodeList;
	}

	private List < String > getSubNameList( Method [] methods )
	{
		List < String > subNameList = new ArrayList < String >();
		if ( methods != null && methods.length > 0 )
		{
			for( Method method : methods )
			{
				Annotation [] annotations = method.getAnnotations();
				for( Annotation an : annotations )
				{
					String subName = getMethodAnnoName( an );
					if ( ! "".equals( subName ) )
					{
						subNameList.add( subName );
						break;
					}
				}
			}
		}
		return subNameList;
	}

	private List < SpringBeanNode > getResourceList( Field [] fields , List < SpringBeanNode > beanList )
	{
		List < SpringBeanNode > resourceList = new ArrayList < SpringBeanNode >();

		if ( fields != null && fields.length > 0 )
		{
			for( Field f : fields )
			{
				Annotation [] annotations = f.getAnnotations();
				if ( annotations != null ) for( Annotation an : annotations )
				{
					String ans = getFieldAnnoName( an );

					if ( ! "".equals( ans ) )
					{
						SpringBeanNode node = getFieldNode( ans , beanList );
						if ( node != null )
						{
							resourceList.add( node );
							break;
						}
					}
				}
			}
		}

		return resourceList;
	}

	private SpringBeanNode getFieldNode( String annotationName , List < SpringBeanNode > beanList )
	{
		SpringBeanNode node = null;
		if ( beanList != null )
		{
			for( SpringBeanNode n : beanList )
			{
				if ( annotationName.equals( n.getBeanName() ) ) node = n;
			}
		}
		return node;
	}

	private String getFieldAnnoName( Annotation an )
	{
		SpringBeanType type = SpringBeanType.getType( an.annotationType() );
		String result = "";

		if ( type != null ) switch ( type )
		{

		case RESOURCE:

			Resource rp = ( Resource ) an;
			result = rp.name();
			break;
		}

		return result;
	}

	private String getMethodAnnoName( Annotation an )
	{
		SpringBeanType type = SpringBeanType.getType( an.annotationType() );
		String result = "";

		if ( type != null ) switch ( type )
		{

		case REQUEST_MAPPING:
			RequestMapping rp = ( RequestMapping ) an;
			String [] res = rp.value();
			if ( res != null )
			{
				for( String r : res )
				{
					if ( r != null && ! r.equals( "" ) )
					{
						result = result + r;
					}
				}

			}
			String [] par = rp.params();
			for( String p : par )
			{
				if ( p != null && ! p.equals( "" ) )
				{
					result = result + p;
				}
			}

			if ( result.length() > 0 )
			{
				result.substring( 0 , result.length() - 1 );
			}

			break;
		}

		return result;
	}

	private SpringBeanNode getSpringBeanNodeFromList( Annotation [] classAnnotations )
	{
		SpringBeanNode node = null;

		for( Annotation an : classAnnotations )
		{
			node = getSpringBeanNode( an , node );
		}

		return node;
	}

	private SpringBeanNode getSpringBeanNode( Annotation an , SpringBeanNode node )
	{
		SpringBeanType type = SpringBeanType.getType( an.annotationType() );

		if ( type != null ) switch ( type )
		{
		case CONTROLLER:
			if ( node == null )
			{
				node = new SpringBeanNode();
				node.setBeanType( SpringBeanType.CONTROLLER );
			}
			break;

		case REQUEST_MAPPING:
			if ( node == null )
			{
				node = new SpringBeanNode();
				node.setBeanType( SpringBeanType.CONTROLLER );
			}

			RequestMapping rm = ( RequestMapping ) an;
			node.setBeanName( rm.value()[ 0 ] );
			break;

		case REPOSITORY:
			node = new SpringBeanNode();
			node.setBeanType( SpringBeanType.REPOSITORY );

			Repository rp = ( Repository ) an;
			node.setBeanName( rp.value() );
			break;
		}

		return node;
	}

	
	public static String pathname ;
	public static String packageName ;
	
	public static ThreadLocal<String[]> param; 
	
	private List < String > findWidthFirst( String pathname , String packageName )
	{
		List < String > classNameList = new ArrayList < String >();

		param = new ThreadLocal<String[]>();
		param.set( new String[]{pathname,packageName} );
		
		SpringBeanInfo.pathname = pathname;
		SpringBeanInfo.packageName = packageName;
		
		Tree<String> tree= new Tree<String>();
		classNameList = tree.findWidthFirst
		( 
			pathname , 
			new TreeDeal<String>()
			{  
			
				@Override
				public String deal( File file )
				{
					String name = null;
					if ( file.getName().toLowerCase().endsWith( "class" ) )
					{
						name = file.getPath();
						name = name.replace( SpringBeanInfo.pathname , SpringBeanInfo.packageName );
						name = name.replace( "\\" , "." );
						name = name.replace( ".class" , "" );
					}
					return name;
				}
				
			}  
		);
		
		
		return classNameList;
	}

}
