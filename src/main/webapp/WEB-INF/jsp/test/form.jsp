<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
	
	
  </head>
  
  <body>
    This is my JSP page. <br>
    
    <form action="<%=request.getContextPath()%>/login.amar" method="post">
	   username<input type="text" name="username" /><br>
	   password<input type="text" name="password" /><br>
	   logintime<input type="text" name="logintime" readonly="readonly" 
	    	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px"/><br>
	   phone<input type=text" name="phone"/><br>
	   money<input type=text" name="money"/><br>
	   age<input type=text" name="age"/><br>
	    <input type="submit"/>
    </form>
    
  </body>
</html>
