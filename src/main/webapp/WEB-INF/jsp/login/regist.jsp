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
  		window.location.href = "login.amar?method=main";
  	}
  	
  	function initFunc()
  	{
  		$("#_loginname").require('用户名不能为空');
  		$("#realname").require('真实姓名不能为空');
  		$("#_pw").require('密码不能为空');
  		$("#email").require('邮箱格式不对');
  		$("#phone").require('手机号码格式不对').match("number");
  		$("#address").require('地址不能为空');
  		$("#qq").require('qq号格式不对').match("number");
  		$("#brithdays").require('生日不能为空');
  	}
  	
  	//$(document).ready(function(){initFunc();});
  	
  	
  </script>
  
  <body class="commonFont">
  <div class="container">
 	  
	  <form id="form1" action="login.amar?method=regist" method="post" class="form-horizontal">
	  <div class="control-group">
 		<div class="controls"><h2>欢迎前来注册</h2></label>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="_loginname">登录名称</label>
	   	<div class="controls">
	      <input type="text" name="_loginname" id="_loginname" placeholder="请输入登录名称">
	    </div>
	  </div>
	   <div class="control-group">
	   	<label class="control-label" for="realname">真实姓名</label>
	   	<div class="controls">
	      <input type="text" name="realname" id="realname" placeholder="请输入真实姓名">
	    </div>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="_pw">登录密码</label>
	   	<div class="controls">
	      <input type="password" name="_pw" id="_pw" placeholder="请输入登录密码">
	    </div>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="email">电子邮箱</label>
	   	<div class="controls">
	      <input type="text" name="email" id="email" placeholder="请输入电子邮箱">
	    </div>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="phone">手机号码</label>
	   	<div class="controls">
	      <input type="text" name="phone" id="phone" placeholder="请输入手机号码">
	    </div>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="address">通信地址</label>
	   	<div class="controls">
	      <input type="text" name="address" id="address" placeholder="请输入通信地址">
	    </div>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="qq">qq号码</label>
	   	<div class="controls">
	      <input type="text" name="qq" id="qq" placeholder="请输入QQ号码">
	    </div>
	  </div>
	  <div class="control-group">
	   	<label class="control-label" for="brithdays">出生日期</label>
	   	<div class="controls">
	      <input type="text" name="brithdays" id="brithdays" placeholder="请点击"
	  		onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:160px">
	    </div>
	  </div>
	  <div class="control-group">
	  	<div class="controls">
	   		<input type="submit"  value="确认注册"/>&nbsp;&nbsp;&nbsp;<input type="button" onclick="goback()" value="返回"/>
	   </div>
	  </div>	
	  </form>
  
  </div>
  <script type="text/javascript">
            $("#form1").validity(function() {
            	initFunc();
            });
</script>

  </body>
 </html>
 