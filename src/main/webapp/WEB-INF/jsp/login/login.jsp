<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
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
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="登录">
	<script type="text/javascript" src="javascript/jquery-1.6.2.min.js"></script>
	<link type="text/css" rel="stylesheet" href="css/centerDiv.css"/>
  </head>
  
  <script type="text/javascript">
	
    function keyLogin()
    {
	  if (event.keyCode==13)   //回车键的键值为13
	  {
		  if( $("#loginname").val()=="" || $("#pw").val()=="")
		  {
			  $("#errorDiv").html( "<font color='RED'>&nbsp;用户名或者密码不能为空.&nbsp;</font>" ).show(300).delay(3000).hide(300);
		  }
		  else
		  {
			  document.getElementById("loginBtn").click();
		  }
	  }
	}
  
  	function login()
  	{
  		if( $("#loginname").val()=="" || $("#pw").val()=="")
		  {
			  $("#errorDiv").html( "<font color='RED'>&nbsp;用户名或者密码不能为空.&nbsp;</font>" ).show(300).delay(2000).hide(300);
			  return;
		  }
  		document.forms[0].submit();
  	}
  	
  	function toRegist()
  	{
  		document.forms[0].action="login.amar?method=toRegist";
  		
  		document.forms[0].submit();
  	}
  	
  	function beBrower()
  	{
		if(confirm("您想作为浏览用户进入系统吗?很多功能将不可用哦"))
		{
			document.forms[0].action="login.amar?method=beBrower";
	  		
	  		document.forms[0].submit();
		}
  		
  	}
  	
  </script>
  
  <body onkeydown="keyLogin();" class="">
  	登录<br/>
  	<div id="errorDiv" width="300" style="display:none" class="centerDiv"></div>
  	<c:if test="${errorinfo!=null}">
		<script type="text/javascript">
			$("#errorDiv").html( "<font color='RED'>&nbsp;用户名或密码错误,请重新输入&nbsp;</font>" ).show(300).delay(2000).hide(300);
		</script>  	
	</c:if>
	
  	<form action="login.amar?method=login" method="post">
  	
  	用户名称:<input type="text" name="loginname" id="loginname"><br/>
  	用户密码:<input type="password" name="pw" id="pw"><br/>
  	
  	
  	<input type="button" id="loginBtn" onclick="login()" value="登录">
  	&nbsp;&nbsp;
  	<input type="button" onclick="toRegist()" value="去注册">
  	&nbsp;&nbsp;
  	<input type="button" onclick="beBrower()" value="浏览者">
  	</form>
  	
  </body>
</html>
