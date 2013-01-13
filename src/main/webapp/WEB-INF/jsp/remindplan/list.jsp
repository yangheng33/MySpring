<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
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
  </head>
  <link rel="stylesheet" href="<%=path%>/javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  
  <script type="text/javascript">
	function seeRemindLog()
	{
		document.forms[0].action= "<%=path%>/remindplan.amar?method=loglist";    
		document.forms[0].submit();
	}
	
	function addRemind()
	{
		document.forms[0].action= "<%=path%>/remindplan.amar?method=toAdd";    
		document.forms[0].submit();
	}
	
	function delRemind(id)
	{
		if( confirm( "确认删除吗?" ) )
		{
			document.forms[0].action= "<%=path%>/remindplan.amar?method=delete&id="+id;    
			document.forms[0].submit();
		}
	}
	
	function editRemind(id)
	{
		document.forms[0].action= "<%=path%>/remindplan.amar?method=toEdit&id="+id;    
		document.forms[0].submit();
	}
	
	function findRemind()
	{
		document.forms[0].action= "<%=path%>/remindplan.amar?method=list";    
		document.forms[0].submit();
	}
	
	</script>
  </head>
  
  <body>
    This is my JSP page. 1344<br>
    
    <form action="<%=path%>/remindplan.amar?method=list" method="post">
	标题:<input type="text" name="title">&nbsp;&nbsp;
  	<input type="button" onclick="go()" value="查询">&nbsp;&nbsp;
  	<button onclick="addRemind()">添加 </button>&nbsp;&nbsp;<button onclick="seeRemindLog()">查看日志</button>
  	<br/>
	
	<table cellspacing="1" class="tablesorter">
		<thead>
			<tr>
				<th>id</th>
				<th>标题</th>
				<th>类型</th>
				<th>提醒内容</th>
				<th>状态</th>
				<th style="width:100">55</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${ list != null }">
	  			<c:forEach items="${list}" var="it" varStatus="s" >
					<tr>
						<td>${it.id}</td>
						<td>${it.title}</td>
						<td>${it.type}</td>
						<td>${it.content}</td>
						<td>${it.state}</td>
						<td>
							<button onclick="editRemind(${it.id})">编辑</button>
							<button onclick="delRemind(${it.id})">删除</button>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	
	</form>
	
  </body>
</html>
