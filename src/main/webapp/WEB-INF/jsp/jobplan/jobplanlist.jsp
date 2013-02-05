<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base href="<%=basePath%>">
    <title>我的工作列表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="<%=path%>/javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <style>
	<!--
	
	 .jobdiv{
	 	   background-color: #EFEFEF;
	 	   border: 2px solid red;
           z-index:1000;
           left:40%;
           top:100;
           height:450;
           overflow-y:auto;
           overflow:auto;
           position:fixed!important;
           margin-left:-150px !important;
           _position:absolute;
           _top:expression(eval(document.compatMode && document.compatMode=='CSS1Compat')?
               documentElement.scrollTop + (document.documentElement.clientHeight - this.offsetHeight)/2: /*IE6*/
           	   document.body.scrollTop + (document.body.clientHeight - this.clientHeight)/2);  /*IE5 IE5.5*/
       }
	-->
  </style>
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  
  <script type="text/javascript">
  
function toAddJobplan()
{
	document.forms[0].action= "<%=path%>/jobPlan.amar?method=toAddJobplan";
	document.forms[0].submit();
}


function queryJobplanList()
{
	document.forms[0].action= "<%=path%>/jobPlan.amar?method=queryJobplanList";
	document.forms[0].submit();
}	

function toEditJobplan(id)
{
	document.forms[0].method="POST";
	document.forms[0].action= "<%=path%>/jobPlan.amar?method=toEdtiJobplan&id="+id;
	document.forms[0].submit();
}
		
function initFunc()
{
	  $("#state").val("${state}");
	  $("#plantype").val("${plantype}");
	  $("#jobplanlevel").val("${jobplanlevel}");
}	 

$(document).ready(function(){initFunc();});
	</script>
  </head>
  
  <body>
    
    <form action="<%=path%>/jobPlan.amar?method=queryJobplanList" method="post">
	
	报告日期,从<input type="text" id="querydatetime" name="reporttimestart" readonly="readonly" value="${reporttimestart}"
  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px">
  	到
  	<input type="text" id="querydatetime" name="reporttimeend" readonly="readonly" value="${reporttimeend}"
  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px">
  	&nbsp;&nbsp;
  	<input type="radio" name="scope" value="me" 
	  	<c:if test="${scope=='me'}">
	  		checked="checked"
	  	</c:if>
  	/>自己的任务 
  	<input type="radio" name="scope" value="all"
  	<c:if test="${scope=='all'}">
  		checked="checked"
  	</c:if>
  	/>所有的任务
  	<br/>
  	处理状态:
  	<select name="state" id="state">
  		<option value="0">不限</option>
  		<option value="2">开发中</option>
  		<option value="3">测试中</option>
  		<option value="4">已完成</option>
  	</select>
  	问题类型:
  	<select name="plantype" id="plantype">
  		<option value="0">不限</option>
  		<option value="1">新需求</option>
  		<option value="2">bug</option>
  		<option value="3">产品改进</option>
  	</select>
  	问题级别:
  	<select name="jobplanlevel" id="jobplanlevel">
  		<option value="0">不限</option>
  		<option value="2">普通</option>
  		<option value="1">次要</option>
  		<option value="3">重要</option>
  		<option value="4">紧急</option>
  	</select>
  	&nbsp;&nbsp;
  	&nbsp;&nbsp;
  	
  	<br/>
  	&nbsp;&nbsp;&nbsp;&nbsp;
  	<input type="button" onclick="queryJobplanList()" value="点击查询">&nbsp;&nbsp;
  	<input type="button" onclick="toAddJobplan()" value="报告新问题">&nbsp;&nbsp;
  	<br/>
  	<table cellspacing="1" class="tablesorter" style="width:1000">
		<thead>
			<tr>
				<th>id</th>
				<th>项目</th>
				<th>标题</th>
				<th>报告人</th>
				<th>程序员</th>
				<th>测试员</th>
				<th>类型</th>
				<th>级别</th>
				<th>状态</th>
				<th style="width:130">报告时间</th>
				<th style="width:130">预计完成时间</th>
				<th style="width:60">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${ jobplanlist != null }">
	  			<c:forEach items="${jobplanlist}" var="it" varStatus="s" >
					<tr>
						<td>${it.id}</td>
						<td>${it.project.name}</td>
						<td>${it.title}</td>
						<td>${it.reportuser.realname}</td>
						<td>${it.dealuser.realname}</td>
						<td>${it.testuser.realname}</td>
						<td>
							<c:choose>
	                     		<c:when test="${it.plantype == '1'}">新需求</c:when>
								<c:when test="${it.plantype == '2'}">bug</c:when>
								<c:when test="${it.plantype == '3'}">产品改进</c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
	                     		<c:when test="${it.jobplanlevel == '1'}">次要</c:when>
								<c:when test="${it.jobplanlevel == '2'}">普通</c:when>
								<c:when test="${it.jobplanlevel == '3'}">重要</c:when>
								<c:when test="${it.jobplanlevel == '4'}">紧急</c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
	                     		<c:when test="${it.state == '2'}">开发中</c:when>
								<c:when test="${it.state == '3'}">测试中</c:when>
								<c:when test="${it.state == '4'}">已完成</c:when>
							</c:choose>
						</td>
						<td>
							<fmt:formatDate value="${it.reporttime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
						</td>
						<td>
							<fmt:formatDate value="${it.planfinishtime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
						</td>
						<td>
							<button onclick="toEditJobplan(${it.id})">查看</button>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	</form>
	
  </body>
</html>
