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
  
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript">
  
  function goback()
  {
	  alert(123);
  }
  
  function dosomething()
  {
	  
	  document.forms[0].submit();
  }
  
  
  </script>
  <body>
     添加新提醒<br>
     <form action="<%=path%>/diary.amar?method=addDiary" method="post">
	    <input type="hidden" id="userid" name="userid" value="${sessionScope.user.id}"/>
	    <input type="hidden" id="type" name="type" value="1"/>
	    运行时间:<input type="text" id="exectimes" name="diarytimes" readonly="readonly" 
		  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px"><br/>
		<textarea id="content" cols="80" rows="10" name="content">日报内容</textarea><br/>
	    <input type="button" onclick="dosomething()" value="提交咯"/>
	    <input type="button" onclick="goback()" value="返回"/>
    
     </form>
  </body>
</html>
