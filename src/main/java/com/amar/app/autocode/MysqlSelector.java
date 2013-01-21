package com.amar.app.autocode;

public class MysqlSelector implements DBSelector
{

	@Override
	public boolean isKey( String key )
	{
		return DBDataType.MYSQL_KEY.equals( key );
	}

	@Override
	public boolean isString( String type )
	{
		return type == null ? false : type.contains( DBDataType.MYSQL_VARCHAR );
	}

	@Override
	public boolean isNumber( String type )
	{
		return DBDataType.MYSQL_INT.equals( type ) || DBDataType.MYSQL_FLOAT.equals( type );
	}

	@Override
	public boolean isInt( String type )
	{
		return DBDataType.MYSQL_INT.equals( type );
	}

	@Override
	public boolean isFloat( String type )
	{
		return DBDataType.MYSQL_FLOAT.equals( type );
	}

	@Override
	public boolean isDate( String type )
	{
		return type == null ? false : type.contains( DBDataType.MYSQL_DATE );
	}

	@Override
	public boolean isBlob( String type )
	{
		return type == null ? false : type.contains( DBDataType.MYSQL_BLOB );
	}

	@Override
	public String string2JavaType( String type )
	{
		String result = "";
		if ( isString( type ) )
		{
			result = DBDataType.JAVA_STRING;
		}
		return result;
	}

	@Override
	public String number2JavaType( String type )
	{
		String result = "";
		if ( isNumber( type ) )
		{
			result = DBDataType.JAVA_INT;
		}
		return result;
	}

	@Override
	public String int2JavaType( String type )
	{
		String result = "";
		if ( isInt( type ) )
		{
			result = DBDataType.JAVA_INT;
		}
		return result;
	}

	@Override
	public String float2JavaType( String type )
	{

		String result = "";
		if ( isFloat( type ) )
		{
			result = DBDataType.JAVA_FLOAT;
		}
		return result;
	}

	@Override
	public String date2JavaType( String type )
	{
		String result = "";
		if ( isDate( type ) )
		{
			result = DBDataType.JAVA_DATE;
		}
		return result;
	}

	@Override
	public String blob2JavaType( String type )
	{
		String result = "";
		if ( isBlob( type ) )
		{
			result = DBDataType.JAVA_BLOB;
		}
		return result;
	}

	@Override
	public String datetimeFunction( String value , String compareSign , String columnname )
	{
		return "unix_timestamp('${" + value + "}') <![CDATA[ " + compareSign + " ]]> unix_timestamp(" + columnname + ")";
	}

	@Override
	public String keyFunction( String keyname )
	{
		StringBuilder sber = new StringBuilder();
		sber.append( "<selectKey keyProperty=\"" + keyname + "\" order=\"BEFORE\" resultType=\"int\">" );
		sber.append( "SELECT @@IDENTITY AS " + keyname );
		sber.append( "</selectKey>" );
		return sber.toString();
	}

	@Override
	public String dateType( String columnName )
	{
		return new StringBuilder().append( "#{" ).append( columnName ).append( "}," ).toString();
	}
}
