<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'init.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="<%=path%>/javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" id="" media="print, projection, screen" />
	<script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
	<script type="text/javascript" src="<%=path%>/javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>

  </head>
   <script >
  	function goback()
  	{
  		document.forms[0].action="autocode.amar?t=init";
  		document.forms[0].submit();
  	}
  	
  	function go()
  	{
  		document.forms[0].submit();
  	}
  </script>
  <body>
    result<br/>
  	<form action="?t=init" method="post">
  	
  	id:<input type="text" name="id"><br/>
  	belongto:<input type="text" name="belongto"><br/>
  	postcode:<input type="text" name="postcode"><br/>
  	areatype:<input type="text" name="areatype"><br/>
  	name:<input type="text" name="name" id="name"><br/>
  	
  	<input type="button" onclick="goback()" value="返回">&nbsp;&nbsp;
  	</form>
  </body>
</html>
