<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>日志系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="css/bootstrap/js/jquery.js"></script>
	<script type="text/javascript" src="css/bootstrap/js/bootstrap-alert.js"></script>
	<link href="css/centerDiv.css" rel="stylesheet"/>
	<link href="css/bootstrap/css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
	<script type="text/javascript">
	function toRegist()
  	{
  		document.forms[0].action="login.amar?method=toRegist";
  		
  		document.forms[0].submit();
  	}
	
	function login()
  	{
  		if( $("#loginname").val()=="" || $("#pw").val()=="")
		  {
			 // $("#errorDiv").html( "<font color='RED'>&nbsp;用户名或者密码不能为空.&nbsp;</font>" ).show(300).delay(2000).hide(300);
			  return;
		  }
  		document.forms[0].submit();
  	}
	</script>
  </head>
  
  <body>
	
	 <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">日志管理系统v0.1</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
	              <li class="dropdown"><a href="login.amar?method=main">首页</a></li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown">工作流程 <b class="caret"></b></a>
	                <ul class="dropdown-menu">
	                  <li><a href="diaryJob.amar?method=personallist">工作日记</a></li>
	                  <li><a href="jobPlan.amar?method=queryJobplanList">工作计划</a></li>
	                  <li class="divider"></li>
	                  <li><a href="zhounan.amar?method=toAnalyze">日志分析</a></li>
	                </ul>
	              </li>
	              <li class="dropdown">
	                <a href="#" class="dropdown-toggle" data-toggle="dropdown">程序案例 <b class="caret"></b></a>
	                <ul class="dropdown-menu">
	                  <li><a href="autocode.amar?method=init">生成代码</a></li>
	                  <li><a href="html/chart/chart.html">flash图表</a></li>
	                  <li><a href="diary.amar?method=personallist">写日记</a></li>
	                  <li><a href="remindplan.amar?method=list">提醒计划</a></li>
	                  <li><a href="jsDemo.amar?method=list">jsDemo</a></li>
	                  <li><a href="file.amar?method=init">文件管理</a></li>
	                  <li class="divider"></li>
	                  <li class="nav-header">Nav header</li>
	                </ul>
	              </li>
	              <li><a href="#about">关于我们</a></li>
	              <li><a href="#contact">合作信息</a></li>
            </ul>
            <c:if test="${sessionScope.user == null}">
	            <form class="navbar-form pull-right" action="login.amar?method=login" method="post">
	              <input class="span2" type="text" placeholder="请输入姓名" name="loginname" id="loginname">
	              <input class="span2" type="password" placeholder="请输入密码" name="pw" id="pw">
	              <button type="button" class="btn" onclick="login()">登录</button>
	              <button type="button" onclick="toRegist()" class="btn">注册</button>
	            </form>
            </c:if>
            <c:if test="${sessionScope.user != null}">
            
            <div class="nav-collapse collapse">
           		<p class="navbar-text pull-right">
	             	  &nbsp;&nbsp;
	             	  <a href="login.amar?method=exit" class="navbar-link">退出登录</a>
	            </p>
	            <p class="navbar-text pull-right">
	             	 当前用户： <a href="#" class="navbar-link">${sessionScope.user.realname} </a>
	            </p>
          	</div>
            	
            </c:if>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
	<br/><br/><br/>
	<script type="text/javascript" src="css/bootstrap/js/bootstrap-dropdown.js"></script>
  </body>
</html>
