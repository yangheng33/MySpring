<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  
  <script >
	//window.location.href = "http://www.baidu.com";
	
	//window.top.location.href='https://www.facebook.com/dialog/oauth?client_id=264583603594034&redirect_uri=http://apps.facebook.com/amar_happy/&scope=email,publish_stream';
  </script>
  
  <body>
  
  你好!${sessionScope.user.realname} <br/><br/>
  
  <a href="<%=path%>/remindplan.amar?method=list">提醒计划</a><br/>
  <a href="<%=path%>/autocode.amar?method=init">生成代码</a><br/>
  <a href="<%=path%>/zhounan.amar?method=toAnalyze">日志分析</a><br/>
  <a href="<%=path%>/html/chart/chart.html">flash图表</a><br/>
  <a href="<%=path%>/diary.amar?method=personallist">写日记</a><br/>
  	
  </body>
</html>