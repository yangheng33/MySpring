<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
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
  <link rel="stylesheet" href="<%=path%>/javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  <link rel="stylesheet" href="css/centerDiv.css" />
  <script type="text/javascript">
  
  function hiddenMe()
  {
	  $('#onejobDiv').hide();
  }
  </script>
  </head>
  
  <body class="commonFont">
<div id="closeBtn" align="left" onclick="hiddenMe()" >关闭</div>
<div id="closeBtn" align="right" onclick="hiddenMe()" >关闭</div>

&nbsp;${user.realname }<br/>
&nbsp;<fmt:formatDate value="${job.jobtime }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate><br/>

<c:forEach items="${detaillist}" var="detail" varStatus="status">
	<hr width="600" align="left"/>
	&nbsp;
	序号:${status.count}
	&nbsp;
	标题:
	<c:if test="${detail.jobplanid > 0 }">
		<a href="<%=path%>/jobPlan.amar?method=toEdtiJobplan&id=${detail.jobplanid}">
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
