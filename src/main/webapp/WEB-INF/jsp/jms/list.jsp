<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	<link rel="stylesheet" href="<%=path%>/javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" id="" media="print, projection, screen" />
	<script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
	<script type="text/javascript" src="<%=path%>/javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
	
  </head>
  
	<script type="text/javascript" id="js">
  
  	$(document).ready(function() {
	$("table").tablesorter({});
	}); 

  	function go()
  	{
  		document.forms[0].submit();
  	}
  	
	</script>
  <body>
  	
  	<form action="?t=addTopicToFlex" method="post">
  	content:<input type="text" name="content">&nbsp;&nbsp;
  	<input type="button" onclick="go()" value="提交">&nbsp;&nbsp;
  	
  	<br/>
	
	<table cellspacing="1" class="tablesorter">
		<thead>
			<tr>
				<th>id</th>
				<th>属于</th>
				<th>地区类型</th>
				<th>邮编</th>
				<th>名字</th>
				<th style="width:100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${ list != null }">
	  			<c:forEach items="${list}" var="it" varStatus="s" >
					<tr>
						<td>${it.id}</td>
						<td>${it.belongto}</td>
						<td>${it.areatype}</td>
						<td>${it.postcode}</td>
						<td>${it.name}</td>
						<td>
							<button onclick="edit(${it.id})">修改</button>
							<button onclick="del(${it.id})">删除</button>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	
	</form>
  </body>
</html>
