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
  
  <script type="text/javascript">
  
  function hiddenMe()
  {
	  $('#onejobDiv').hide();
  }
  </script>
  </head>
  
  <body>
  <div id="closeBtn" align="right" onclick="hiddenMe()">关闭</div>
${user.realname }<br/>
<fmt:formatDate value="${job.jobtime }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate><br/>
<hr width="600" align="left" />
<c:forEach items="${detaillist}" var="detail" varStatus="status">
<hr width="600" align="left"/>
序号:${status.count}<br/>
用时:${detail.usedtime}小时, 完成情况:
<c:if test="${detail.state=='1' }">
已完成
</c:if>
<c:if test="${detail.state=='2' }">
未完成
</c:if>
<br/> 
<textarea cols='80' rows='3'>
${detail.content }
</textarea>
<br/>
<br/> 

</c:forEach>          
	
  </body>
</html>
