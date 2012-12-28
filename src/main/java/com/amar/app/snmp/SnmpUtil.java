package com.amar.app.snmp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.SMIConstants;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;

public abstract class SnmpUtil
{
	private Snmp snmp = null;

	private Address targetAddress = null;

	private String octetString = "";

	public SnmpUtil( String addr , String octetString ) throws IOException
	{
		targetAddress = GenericAddress.parse( addr );

		TransportMapping transport = new DefaultUdpTransportMapping();

		snmp = new Snmp( transport );

		this.octetString = octetString;

		transport.listen();
	}

	public VariableBinding getPDU( String oid , int type ) throws IOException
	{
		return getPDU( new OID( trans( oid ) ) , type );
	}

	public VariableBinding getPDU( OID oid , int type ) throws IOException
	{

		PDU pdu = new PDU();

		pdu.add( new VariableBinding( oid ) );

		pdu.setType( type );

		return readResponse( sendPDU( pdu ) );
	}

	@SuppressWarnings( "unchecked" )
	public VariableBinding readResponse( ResponseEvent respEvnt )
	{
		VariableBinding veriable = null;

		if ( respEvnt != null && respEvnt.getResponse() != null )
		{
			Vector<VariableBinding> recVBs = respEvnt.getResponse().getVariableBindings();
			for( int i = 0 ; i < recVBs.size() ; i ++ )
			{
				veriable = recVBs.elementAt( i );
				System.out.println( veriable.getOid().toString() + " : " + veriable.getVariable() + " : " + veriable.getSyntax() );
			}
		}
		return veriable;
	}

	public ResponseEvent sendPDU( PDU pdu ) throws IOException
	{
		CommunityTarget target = new CommunityTarget();

		target.setCommunity( new OctetString( octetString ) );

		target.setAddress( targetAddress );

		target.setRetries( 2 ); // 通信不成功时的重试次数

		target.setTimeout( 1500 ); // 超时时间

		target.setVersion( SnmpConstants.version1 );

		return snmp.send( pdu , target );
	}

	public void getPduWithCycle( int [] oidArray ) throws IOException
	{
		VariableBinding next = getPDU( new OID( oidArray ) , PDU.GETNEXT );

		while ( validate( next ) )
		{
			next = getPDU( next.getOid() , PDU.GETNEXT );
		}
	}

	public boolean validate( VariableBinding variable )
	{
		boolean result = false;

		if ( variable != null && variable.getSyntax() != SMIConstants.SYNTAX_NULL )
		{
			result = true;
		}
		return result;
	}

	public boolean validateOidStartWith( VariableBinding variable , String startWith )
	{
		return validate( variable ) ? ( "." + variable.getOid().toString() ).startsWith( startWith ) : false;
	}

	public int [] trans( String oids )
	{
		oids = oids.substring( 1 , oids.length() );
		String [] _oid = oids.split( "\\." );

		int oid[] = new int [ _oid.length ];
		for( int i = 0 ; i < _oid.length ; i ++ )
		{
			oid[ i ] = Integer.parseInt( _oid[ i ] );
		}
		return oid;
	}

	public String transCode( String orc , String codeType ) throws UnsupportedEncodingException
	{
		String [] s = orc.split( ":" );
		byte [] b = new byte [ s.length ];
		for( int i = 0 ; i < s.length ; i ++ )
		{
			b[ i ] = ( byte ) Integer.parseInt( s[ i ] , 16 );
		}
		return new String( b , codeType );
	}

	public String parseDateAndTime( Variable v )
	{
		OctetString oct = ( OctetString ) v;

		byte [] bts = oct.getValue();

		byte [] format_str = new byte [ 128 ]; // 保存格式化过后的时间字符串
		int year;
		int month;
		int day;
		int hour;
		int minute;
		int second;

		year = bts[ 0 ] * 256 + 256 + bts[ 1 ];
		month = bts[ 2 ];
		day = bts[ 3 ];
		hour = bts[ 4 ];
		minute = bts[ 5 ];
		second = bts[ 6 ];
		
		int index = 3;
		int temp = year;
		for( ; index >= 0 ; index -- )
		{
			format_str[ index ] = ( byte ) ( 48 + ( temp - temp / 10 * 10 ) );
			temp /= 10;
		}

		format_str[ 4 ] = '-';
		index = 6;
		temp = month;
		for( ; index >= 5 ; index -- )
		{
			format_str[ index ] = ( byte ) ( 48 + ( temp - temp / 10 * 10 ) );
			temp /= 10;
		}

		format_str[ 7 ] = '-';
		index = 9;
		temp = day;
		for( ; index >= 8 ; index -- )
		{
			format_str[ index ] = ( byte ) ( 48 + ( temp - temp / 10 * 10 ) );
			temp /= 10;
		}

		format_str[ 10 ] = ' ';
		index = 12;
		temp = hour;
		for( ; index >= 11 ; index -- )
		{
			format_str[ index ] = ( byte ) ( 48 + ( temp - temp / 10 * 10 ) );
			temp /= 10;
		}

		format_str[ 13 ] = ':';
		index = 15;
		temp = minute;
		for( ; index >= 14 ; index -- )
		{
			format_str[ index ] = ( byte ) ( 48 + ( temp - temp / 10 * 10 ) );
			temp /= 10;
		}

		format_str[ 16 ] = ':';
		index = 18;
		temp = second;
		for( ; index >= 17 ; index -- )
		{
			format_str[ index ] = ( byte ) ( 48 + ( temp - temp / 10 * 10 ) );
			temp /= 10;
		}

		return (new String( format_str )).substring( 0,19 );
	}
}
