<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<script type="text/javascript"
	src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
<script type="text/javascript">
  
function saveplan()
{
	if(confirm("您确定保存吗?"))
	{	
		document.forms[0].submit();
	}
}
 
function initFunc()
{
	  $("#state").val("${jobplan.state}");
	  $("#plantype").val("${jobplan.plantype}");
	  $("#jobplanlevel").val("${jobplan.jobplanlevel}");
	  $("#projectid").val("${jobplan.projectid}");
	  
	  $("#reportuserid").val("${jobplan.reportuserid}");
	  $("#dealuserid").val("${jobplan.dealuserid}");
	  $("#testuserid").val("${jobplan.testuserid}");
}	 

$(document).ready(function(){initFunc();});
</script>
<body>
	查看工作
	<br>
	<form action="<%=path%>/jobPlan.amar?method=addJobplan" method="post">
	
	标题:<input type="text" name="title" value="${jobplan.title}"/>
	<br/>
	项目:
	<select name="projectid" id="projectid">
		<c:forEach var="_project" items="${projectlist}">
			<option value="${_project.id}">${_project.name}</option>		
		</c:forEach>
	</select>
	<br/>
	性质:
	<select name="plantype" id="plantype">
  		<option value="1">新需求</option>
  		<option value="2">bug</option>
  		<option value="3">产品改进</option>
  	</select>
  	<br/>
  	级别:
	<select name="jobplanlevel" id="jobplanlevel">
		<option value="1">次要</option>
		<option value="2">普通</option>
  		<option value="3">重要</option>
  		<option value="4">紧急</option>
  	</select>
  	<br/>
  	状态:
	<select name="state" id="state">
		<option value="2">开发中</option>
  		<option value="3">测试中</option>
  		<option value="4">已完成</option>
  	</select>
  	<br/>
  	
	报告者:
	<select name="reportuserid" id="reportuserid">
		<c:forEach var="_user" items="${userlist}">
			<option value="${_user.id}">${_user.realname}</option>		
		</c:forEach>
	</select>
	<br/>
	程序员:
	<select name="dealuserid" id="dealuserid">
		<c:forEach var="_user" items="${userlist}">
			<option value="${_user.id}">${_user.realname}</option>		
		</c:forEach>
	</select><br/>
	测试员:
	<select name="testuserid" id="testuserid">
		<c:forEach var="_user" items="${userlist}">
			<option value="${_user.id}">${_user.realname}</option>		
		</c:forEach>
	</select><br/>
	
	计划完成时间:<input type="text" id="planfinishtimestart" name="planfinishtimestart" readonly="readonly" 
	value='<fmt:formatDate value="${jobplan.planfinishtime}" pattern="yyyy-MM-dd HH:mm:ss" />'
  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px">
	<br/>
	内容:<br/>
	<textarea rows="8" cols="80" name="content">${jobplan.content}</textarea>
	<br/>
	<input type="button" value="更新" onclick="saveplan()"/>
	</form>
</body>
</html>
