<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册新用户</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript">
  	function gogo()
  	{
  		
  		document.forms[0].submit();
  	}
  	function goback()
  	{
  		window.location.href = "<%=path%>/login.amar?method=tologin";
  	}
  </script>
  
  <body>
 欢迎前来 注册
 
  <br/>
  <form action="<%=path%>/login.amar?method=regist" method="post">
  登录名称:<input type="text" name="loginname"/><br/>
  真实姓名:<input type="text" name="realname"/><br/>
  登录密码:<input type="password" name="pw"/><br/>
  电子邮箱:<input type="text" name="email"/><br/>
  手机号码:<input type="text" name="phone"/><br/>
  通信地址:<input type="text" name="address"/><br/>
 qq号码:<input type="text" name="qq"/><br/>
  出生日期:<input type="text" name="brithdays" readonly="readonly" 
  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px"><br/>
  	<input type="button" onclick="gogo()" value="确认注册咯"/>&nbsp;&nbsp;&nbsp;
  	<input type="button" onclick="goback()" value="返回登录页"/>
  </form>
  </body>
 </html>
 