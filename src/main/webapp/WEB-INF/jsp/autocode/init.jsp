<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>

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
  		document.forms[0].action="?method=init";
  		document.forms[0].submit();
  	}
  	
  	function go()
  	{
  		document.forms[0].submit();
  	}
  </script>
  
  <body>
    This is my JSP page. <br>
    
    add<br/>
  	<form action="<%=request.getContextPath()%>/autocode.amar?method=generate" method="post">
  	
  	数据库类型:	<select name="dbtype">
  					<option value="oracle">ORACLE</option>
  					<option value="mysql">MYSQL</option>
  				</select><br/>
  	数据库名称:<input type="text" name="dbname" value="spring"><br/>
  	程序根路径:<input type="text" name="path" value="d:/autocode"><br/>
  	model路径:<input type="text" name="modelPath" value="com/amar/web/model"><br/>
  	xml配置文件路径:<input type="text" name="configPath" value="mybatis"><br/>
  	dao的路径:<input type="text" name="daoPath" value="com/amar/db/ibatis/dao"><br/>
  	
  	<input type="button" onclick="goback()" value="返回">&nbsp;&nbsp;
  	<input type="button" onclick="go()" value="提交">
  	</form>
  	
  </body>
</html>
