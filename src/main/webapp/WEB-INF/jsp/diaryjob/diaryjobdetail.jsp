<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
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
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <script type="text/javascript" src="javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  <link type="text/css" rel="stylesheet" href="css/centerDiv.css"/>
  <script type="text/javascript">
  
	function hiddenMe()
  	{
	  $('#onejobDiv').hide();
  	}
  
  	function deleteMe(id)
  	{
  		if( confirm("您确定删除吗?"))
	  	{
  			var url = "diaryJob.amar?method=delDiaryjob"
			$("#noDiv").load(url, { "id": id},
			function(responseText, textStatus, XMLHttpRequest){dealComplete(responseText, textStatus, XMLHttpRequest);} );
	  	}
  	}
  	
  	function dealComplete(responseText, textStatus, XMLHttpRequest)
  	{
  		if( responseText =="ok")
  		{
  			$("#infoDiv").html( "<font color='RED'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除成功&nbsp;&nbsp;&nbsp;&nbsp;</font>" ).show(300).delay(2000).hide(300);
  			setTimeout("reflash()",2000);
  		}
  		else
  		{
  			$("#infoDiv").html( "<font color='RED'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除失败&nbsp;&nbsp;&nbsp;&nbsp;</font>" ).show(300).delay(2000).hide(300);
  		}
  		$('#onejobDiv').hide();
  	}
  	
  	function reflash()
  	{
  		window.location.reload();
  	}
  	
  </script>
  </head>
  
  <body class="commonFont">
  <div id="noDiv" style="display:none"/>
  <div id="infoDiv" width="300" style="display:block" class="centerDiv"></div>
  <table width="100%" class="commonFont">
  	<tr>
  		<td align="left">
  			<c:if test="${sessionScope.user.id==user.id }">
  				<div id="deleteBtn"  onclick="deleteMe( '${job.id}' )" >删除</div>
  			</c:if>
  		</td>
  		<td align="right">
  			<div id="closeBtn"  onclick="hiddenMe()" >关闭</div>
  		</td>
  	</tr>
  </table>



&nbsp;${user.realname }<br/>
&nbsp;<fmt:formatDate value="${job.jobtime }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate><br/>

<c:forEach items="${detaillist}" var="detail" varStatus="status">
	<hr width="600" align="left"/>
	&nbsp;
	序号:${status.count}
	&nbsp;
	标题:
	<c:if test="${detail.jobplanid > 0 }">
		<a href="jobPlan.amar?method=toEdtiJobplan&id=${detail.jobplanid}">
		${detail.title}
		</a>
	</c:if>
	<c:if test="${detail.jobplanid == 0 }">
	${detail.title}
	</c:if>
	&nbsp;
	项目:	<c:forEach items="${projectlist}" var="projectInfo">
				<c:if test="${projectInfo.id == detail.projectid}">${projectInfo.name}</c:if>
		</c:forEach>
		
	<br/>
	&nbsp;
	<c:if test="${detail.jobplanid > 0 }">
	计划中的->
	</c:if>
	<c:if test="${detail.jobplanid == 0 }">
	计划外的->
	</c:if>
	<c:if test="${detail.type=='1' }">
	功能开发
	</c:if>
	<c:if test="${detail.type=='2' }">
	功能测试
	</c:if>
	<c:if test="${detail.type=='3' }">
	其他事项
	</c:if>
	<c:if test="${detail.type=='4' }">
	数据整理
	</c:if>
	&nbsp;
	用时:${detail.usedtime}小时
	&nbsp;
	完成${detail.count}%
	&nbsp;
	<br/> 
	&nbsp;
	${detail.content }
</c:forEach>          
	
  </body>
</html>
