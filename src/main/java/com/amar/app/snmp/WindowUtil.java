package com.amar.app.snmp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.snmp4j.PDU;
import org.snmp4j.smi.VariableBinding;

public class WindowUtil extends SnmpUtil
{

	public WindowUtil( String addr , String octetString ) throws IOException
	{
		super( addr , octetString );
	}

	public static void main( String [] arg ) throws Exception
	{
		WindowUtil windowUtil = new WindowUtil( "udp:192.168.8.233/161" , "public" );
		// windowUtil.getDiskInfo();
		// windowUtil.getProcesses();
		// windowUtil.getHostName();
		// windowUtil.getSysteminfo();
		windowUtil.getSysDatetime();
		// for( int i = 0 ; i < 30 ; i ++ )
		// {
		// windowUtil.getCpuUsed();
		// Thread.sleep( 1000 );
		// }

	}

	/** 系统当前时间 */
	public String getSysDatetime() throws IOException
	{
		VariableBinding variable = getPDU( SNMP.WINDOW_DATETIME , PDU.GET );

		return parseDateAndTime( variable.getVariable() );
	}

	/** 主机名称 */
	public String getHostName() throws IOException
	{
		VariableBinding variable = getPDU( SNMP.WINDOW_HOSTNAME , PDU.GET );
		return variable.getVariable().toString();
	}

	/** 系统信息 */
	public String getSysteminfo() throws IOException
	{
		VariableBinding variable = getPDU( SNMP.WINDOW_SYSTEM_DISCRIPE , PDU.GET );
		return variable.getVariable().toString();
	}

	/**
	 * 进程数
	 */
	public int getProcesses() throws IOException
	{
		VariableBinding variable = getPDU( SNMP.WINDOW_PROCESSES , PDU.GET );
		return variable.getVariable().toInt();
	}

	/**
	 * 获取cpu负载
	 */
	public List<String> getCpuUsed() throws IOException
	{
		List<String> result = new ArrayList<String>();

		VariableBinding next = getPDU( SNMP.WINDOWS_CPU , PDU.GETNEXT );

		while ( validateOidStartWith( next , SNMP.WINDOWS_CPU ) )
		{
			result.add( next.getVariable().toString() );

			next = getPDU( next.getOid() , PDU.GETNEXT );
		}
		return result;
	}

	/**
	 * 获取磁盘信息
	 */
	public Map<String,Object> getDiskInfo() throws IOException
	{
		List<Map<String,String>> hardDiskList = new ArrayList<Map<String,String>>();

		List<String> typeList = getHardDiskType();
		List<Long> unitList = getHardDiskUnit();
		List<Long> sizeList = getHardDiskSize();
		List<Long> usedList = getHardDiskUsed();
		List<String> nameList = getHardDiskName();

		long memory = 0;
		long memory_used = 0;
		long v_memory = 0;
		long v_memory_used = 0;

		for( int i = 0 ; i < typeList.size() ; i ++ )
		{
			long capacity = unitList.get( i ) * sizeList.get( i );
			long usedCapacity = unitList.get( i ) * usedList.get( i );

			if ( typeList.get( i ).equals( SNMP.WINDOW_TYPE_HARDDISK ) )
			{
				Map<String,String> map = new HashMap<String,String>();
				map.put( "capacity" , capacity / SNMP.SIZE_G + "" );
				map.put( "usedCapacity" , usedCapacity / SNMP.SIZE_G + "" );
				map.put( "name" , nameList.get( i ) );
				hardDiskList.add( map );
			}
			else if ( typeList.get( i ).equals( SNMP.WINDOW_TYPE_MEMORY ) )
			{
				memory = capacity;
				memory_used = usedCapacity;
			}
			else if ( typeList.get( i ).equals( SNMP.WINDOW_TYPE_VIRTUAL_MEMORY ) )
			{
				v_memory = capacity;
				v_memory_used = usedCapacity;
			}
		}

		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put( "hardDiskList" , hardDiskList );
		resultMap.put( "memory" , memory );
		resultMap.put( "memory_used" , memory_used );
		resultMap.put( "v_memory" , v_memory );
		resultMap.put( "v_memory_used" , v_memory_used );

		for( Map<String,String> map : hardDiskList )
		{
			System.out.println( map.get( "name" ) + ":" + map.get( "capacity" ) + "," + map.get( "usedCapacity" ) );
		}
		System.out.println( "memory:" + memory );
		System.out.println( "memory_used:" + memory_used );
		System.out.println( "v_memory:" + v_memory );
		System.out.println( "v_memory_used:" + v_memory_used );

		return resultMap;
	}

	/**
	 * 返回簇的名称
	 */
	public List<String> getHardDiskName() throws IOException
	{
		List<String> result = new ArrayList<String>();

		VariableBinding next = getPDU( SNMP.WINDOW_HARDDISK_NAME , PDU.GETNEXT );

		while ( validateOidStartWith( next , SNMP.WINDOW_HARDDISK_NAME ) )
		{
			result.add( anlyzeHardDiskName( next.getVariable().toString() ) );

			next = getPDU( next.getOid() , PDU.GETNEXT );
		}
		return result;
	}

	/**
	 * 分析硬盘名称
	 */
	public String anlyzeHardDiskName( String srcName )
	{
		String result = "";
		try
		{
			String [] nameArray = srcName.split( ":" );
			if ( nameArray.length > 10 )
			{
				nameArray = transCode( srcName , "gb2312" ).split( ":" );
			}
			result = nameArray[ 0 ] + ":\\";
		}
		catch ( UnsupportedEncodingException e )
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 返回簇的类型
	 */
	public List<String> getHardDiskType() throws IOException
	{
		List<String> result = new ArrayList<String>();

		VariableBinding next = getPDU( SNMP.WINDOW_HARDDISK_TYPE , PDU.GETNEXT );

		while ( validateOidStartWith( next , SNMP.WINDOW_HARDDISK_TYPE ) )
		{
			result.add( next.getVariable().toString() );

			next = getPDU( next.getOid() , PDU.GETNEXT );
		}
		return result;
	}

	/**
	 * 簇的使用情况
	 */
	public List<Long> getHardDiskUsed() throws IOException
	{
		List<Long> result = new ArrayList<Long>();

		VariableBinding next = getPDU( SNMP.WINDOW_HARDDISK_USED , PDU.GETNEXT );

		while ( validateOidStartWith( next , SNMP.WINDOW_HARDDISK_USED ) )
		{
			result.add( next.getVariable().toLong() );

			next = getPDU( next.getOid() , PDU.GETNEXT );
		}

		return result;
	}

	/**
	 * 返回簇的大小
	 */
	public List<Long> getHardDiskSize() throws IOException
	{
		List<Long> result = new ArrayList<Long>();

		VariableBinding next = getPDU( SNMP.WINDOW_HARDDISK_SIZE , PDU.GETNEXT );

		while ( validateOidStartWith( next , SNMP.WINDOW_HARDDISK_SIZE ) )
		{
			result.add( next.getVariable().toLong() );

			next = getPDU( next.getOid() , PDU.GETNEXT );
		}

		return result;
	}

	/**
	 * 返回簇的单位
	 * 
	 * @throws IOException
	 */
	public List<Long> getHardDiskUnit() throws IOException
	{
		List<Long> result = new ArrayList<Long>();

		VariableBinding next = getPDU( SNMP.WINDOW_HARDDISK_UNIT , PDU.GETNEXT );

		while ( validateOidStartWith( next , SNMP.WINDOW_HARDDISK_UNIT ) )
		{
			result.add( next.getVariable().toLong() );

			next = getPDU( next.getOid() , PDU.GETNEXT );
		}

		return result;
	}

}
