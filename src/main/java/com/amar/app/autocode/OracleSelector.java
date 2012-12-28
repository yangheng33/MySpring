package com.amar.app.autocode;

public class OracleSelector implements DBSelector
{

	@Override
	public boolean isKey( String key )
	{
		return DBDataType.ORACLE_KEY.equals( key );
	}

	@Override
	public boolean isString( String type )
	{
		return type == null ? false : type.contains( DBDataType.ORACLE_VARCHAR );
	}

	@Override
	public boolean isNumber( String type )
	{
		return DBDataType.ORACLE_NUMBER.equals( type );
	}

	@Override
	public boolean isInt( String type )
	{
		return DBDataType.ORACLE_NUMBER.equals( type );
	}

	@Override
	public boolean isFloat( String type )
	{
		return DBDataType.ORACLE_FLOAT.equals( type );
	}

	@Override
	public boolean isDate( String type )
	{
		return type == null ? false : type.contains( DBDataType.ORACLE_DATE );
	}

	@Override
	public boolean isBlob( String type )
	{
		return DBDataType.ORACLE_BLOB.equals( type );
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

}
