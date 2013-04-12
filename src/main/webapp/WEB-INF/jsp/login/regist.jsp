<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <title>注册新用户</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="<%=path%>/javascript/jquery.validity/jquery.validity.css" />
  <link rel="stylesheet" href="css/centerDiv.css" />
  <script type="text/javascript" src="<%=path%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.validity/jquery-1.8.3.min.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.validity/jquery.validity.min.js"></script>
  <script type="text/javascript">
  	function gogo()
  	{
  		if(confirm("您确定注册码?"))
  		{
  			document.forms[0].submit();
  		}
  	}
  	function goback()
  	{
  		window.location.href = "<%=path%>/login.amar?method=tologin";
  	}
  	
  	function initFunc()
  	{
  		$("#loginname").require('用户名不能为空');
  		$("#realname").require('真实姓名不能为空');
  		$("#pw").require('密码不能为空');
  		$("#email").require('邮箱格式不对');
  		$("#phone").require('手机号码格式不对').match("number");
  		$("#address").require('地址不能为空');
  		$("#qq").require('qq号格式不对').match("number");
  		$("#brithdays").require('生日不能为空');
  	}
  	
  	//$(document).ready(function(){initFunc();});
  	
  	
  </script>
  
  <body class="commonFont">
 欢迎前来 注册
 
  <br/>
  <form id="form1" action="<%=path%>/login.amar?method=regist" method="post">
  登录名称:<input type="text" name="loginname" id="loginname"/><br/>
  真实姓名:<input type="text" name="realname" id="realname"/><br/>
  登录密码:<input type="password" name="pw" id="pw"/><br/>
  电子邮箱:<input type="text" name="email" id="email"/><br/>
  手机号码:<input type="text" name="phone" id="phone"/><br/>
  通信地址:<input type="text" name="address" id="address"/><br/>
 qq号码:<input type="text" name="qq" id="qq" /><br/>
  出生日期:<input type="text" name="brithdays" id="brithdays" readonly="readonly" 
  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px"><br/>
  	
  	<!-- 
  	<input type="button" onclick="gogo()" value="确认注册"/>&nbsp;&nbsp;&nbsp;
  	 -->
  	
  	&nbsp;&nbsp;&nbsp;
  	<input type="submit"  value="确认注册测试"/>
  	&nbsp;&nbsp;&nbsp;
  	<input type="button" onclick="goback()" value="返回登录页"/>
  </form>
  
  <script type="text/javascript">
            $("#form1").validity(function() {
            	initFunc();
            });
</script>

  </body>
 </html>
 