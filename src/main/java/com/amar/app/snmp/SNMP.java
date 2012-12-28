package com.amar.app.snmp;

public class SNMP
{
	/** windows */

	/** 系统信息 */
	public static String WINDOW_SYSTEM_DISCRIPE = ".1.3.6.1.2.1.1.1.0";

	/** 主机名称 */
	public static String WINDOW_HOSTNAME = ".1.3.6.1.2.1.1.5.0";

	/** CPU负载 */
	public static String WINDOWS_CPU = ".1.3.6.1.2.1.25.3.3.1.2";

	/** 簇描述信息 */
	public static String WINDOW_HARDDISK_NAME = ".1.3.6.1.2.1.25.2.3.1.3";

	/** 簇类型 */
	public static String WINDOW_HARDDISK_TYPE = ".1.3.6.1.2.1.25.2.3.1.2";

	/** 簇的大小 */
	public static String WINDOW_HARDDISK_SIZE = ".1.3.6.1.2.1.25.2.3.1.5";

	/** 簇的单位 */
	public static String WINDOW_HARDDISK_UNIT = ".1.3.6.1.2.1.25.2.3.1.4";

	/** 簇已经使用的大小 */
	public static String WINDOW_HARDDISK_USED = ".1.3.6.1.2.1.25.2.3.1.6";

	/** 簇类型-硬盘 */
	public static String WINDOW_TYPE_HARDDISK = "1.3.6.1.2.1.25.2.1.4";

	/** 簇类型-内存 */
	public static String WINDOW_TYPE_MEMORY = "1.3.6.1.2.1.25.2.1.2";

	/** 簇类型-虚拟内存 */
	public static String WINDOW_TYPE_VIRTUAL_MEMORY = "1.3.6.1.2.1.25.2.1.3";

	/** 进程数 */
	public static String WINDOW_PROCESSES = ".1.3.6.1.2.1.25.1.6.0";
	
	/**系统当前时间*/
	public static String WINDOW_DATETIME = ".1.3.6.1.2.1.25.1.2.0";
	
	public static long SIZE_K = 1024;

	public static long SIZE_M = SIZE_K * 1024;

	public static long SIZE_G = SIZE_M * 1024;
}
