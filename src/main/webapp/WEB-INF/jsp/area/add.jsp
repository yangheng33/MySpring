<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
	
  </head>
  
  <script >
	
  	function goback()
  	{
  		document.forms[0].action="?t=list";
  		document.forms[0].submit();
  	}
  	
  	function go()
  	{
  		document.forms[0].submit();
  	}
  	
  </script>
  
  <body>
  	add<br/>
  	<form action="?t=addArea" method="post">
  	
  	id:<input type="text" name="id"><br/>
  	belongto:<input type="text" name="belongto"><br/>
  	postcode:<input type="text" name="postcode"><br/>
  	areatype:<input type="text" name="areatype"><br/>
  	name:<input type="text" name="name" id="name"><br/>
  	
  	<input type="button" onclick="goback()" value="返回">&nbsp;&nbsp;
  	<input type="button" onclick="go()" value="提交">
  	</form>
  	
  </body>
</html>
