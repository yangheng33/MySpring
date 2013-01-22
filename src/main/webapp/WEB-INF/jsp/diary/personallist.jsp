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
	
    function seeOtherDiary()
	{
		document.forms[0].action= "<%=path%>/diary.amar?method=toAdd";    
		document.forms[0].submit();
	}
	function addDiary()
	{
		document.forms[0].action= "<%=path%>/diary.amar?method=toAddDiary";    
		document.forms[0].submit();
	}
	
	function delDiary(id)
	{
		if( confirm( "确认删除吗?" ) )
		{
			document.forms[0].action= "<%=path%>/diary.amar?method=delDiary&id="+id;    
			document.forms[0].submit();
		}
	}
	
	function editDiary(id)
	{
		document.forms[0].action= "<%=path%>/diary.amar?method=toEditDiary&id="+id;    
		document.forms[0].submit();
	}
	
	function findDiary()
	{
		document.forms[0].action= "<%=path%>/diary.amar?method=personalDiarylist";    
		document.forms[0].submit();
	}
	
	</script>
  </head>
  
  <body>
            你好!${sessionScope.user.realname}&nbsp;&nbsp; 写日记啦<br><br/>
    
    <form action="<%=path%>/diary.amar?method=personalDiarylist" method="post">
	标题:<input type="text" name="title">&nbsp;&nbsp;
  	<input type="button" onclick="go()" value="查询">&nbsp;&nbsp;
  	<button onclick="addDiary()">添加 </button>&nbsp;&nbsp;<button onclick="seeOtherDiary()">查看他人的日记</button>
  	<br/>
	
	<table cellspacing="1" class="tablesorter">
		<thead>
			<tr>
				<th>id</th>
				<th>日期</th>
				<th>日记内容</th>
				<th style="width:100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${ list != null }">
	  			<c:forEach items="${list}" var="it" varStatus="s" >
					<tr>
						<td>${it.id}</td>
						<td>${it.diarytime}</td>
						<td>${it.content}</td>
						<td>
							<!--<button onclick="editDiary(${it.id})">编辑</button>-->
							<button onclick="delDiary(${it.id})">删除</button>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	
	</form>
	
  </body>
</html>
