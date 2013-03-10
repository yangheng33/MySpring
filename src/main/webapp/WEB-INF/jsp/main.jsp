<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp" %>
<%@ include file="common/header.jsp" %>

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
	
  </script>
  
  <body>
  
  
  	<b>工具与案例:</b><br/>
  	<hr align="left" width="700">
  <a href="<%=path%>/autocode.amar?method=init">生成代码</a><br/>
  <a href="<%=path%>/zhounan.amar?method=toAnalyze">日志分析</a><br/>
  <a href="<%=path%>/html/chart/chart.html">flash图表</a><br/>
  <a href="<%=path%>/diary.amar?method=personallist">写日记</a><br/>
  <a href="<%=path%>/remindplan.amar?method=list">提醒计划</a><br/>
  <a href="jsDemo.amar?method=list">jsDemo</a><br/>
  
  <br/>
  	<b>工作流程:</b><br/>
  <hr align="left" width="700">
  	
  <a href="<%=path%>/diaryJob.amar?method=personallist">写工作日记</a><br/>
  <a href="<%=path%>/jobPlan.amar?method=queryJobplanList">做工作计划</a><br/>
  
  	
  </body>
</html>