<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>内部系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/centerDiv.css" />
  </head>
  
  <body>
   <table width="100%" height="20" class="commonFont" style="font-weight:bold">
		<tr>
			<td width="200"> 你好! 
			<c:if test="${sessionScope.user == null}">
				浏览者
			</c:if>
			${sessionScope.user.realname} 			
			</td>
			<td align="center">
				<a href="login.amar?method=main">首页</a>
				<a href="login.amar?method=exit">退出</a>
			</td>
		</tr>
	</table>
  </body>
</html>
