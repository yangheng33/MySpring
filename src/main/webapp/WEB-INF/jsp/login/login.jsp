<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
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
  
  <script type="text/javascript">
	
  	function login()
  	{
  		document.forms[0].submit();
  	}
  	
  	function toRegist()
  	{
  		document.forms[0].action="?method=toRegist";
  		
  		document.forms[0].submit();
  	}
  	
  </script>
  
  <body>
  	登录咯<br/>
  	<form action="<%=path%>/login.amar?method=login" method="post">
  	
  	用户名:<input type="text" name="loginname"><br/>
  	密码:<input type="password" name="pw"><br/>
  	
  	
  	<input type="button" onclick="login()" value="登录">&nbsp;&nbsp;
  	<input type="button" onclick="toRegist()" value="去注册">
  	</form>
  	
  </body>
</html>
