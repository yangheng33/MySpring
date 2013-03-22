<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>访问次数统计日志上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" id="" media="print, projection, screen" />
	<script type="text/javascript" src="javascript/jquery-1.6.2.min.js"></script>
	<script type="text/javascript" src="javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>

  </head>
    <script >
  	function goback()
  	{
  		document.forms[0].action="?t=init";
  		document.forms[0].submit();
  	}
  	
  	function go()
  	{
  		if( $("#file").val() =="" )
  		{
  			alert("请选择要分析的日志文件...");
  		}
  		else
  		{
  			
  			document.forms[0].submit();
  		}
  		
  	}
  </script>
  
  <body>
    <h1>访问次数统计日志上传</h1>  
    <h1><font color="red">
  	<c:if test="${time=='time'}">
  		上次完毕，用时${time}毫秒
  	</c:if>
  	<c:if test="${status=='ok'}">
  		<a href="zhounan.amar?method=exportExcel">点击下载最新数据
  	</c:if>
  	</a></font></h1>
    <form action="zhounan.amar?method=analyze" method="post" enctype="multipart/form-data">  
  
        <input type="file" name="file" id="file"/>  
  
        <input type="button" onclick="go()" value="upload"/>  
  
    </form>  
    
    
  	
  	
  </body>
</html>
