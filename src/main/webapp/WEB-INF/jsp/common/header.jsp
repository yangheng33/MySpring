<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
   <table width="100%" height="20" style="font-family:宋体;font-size:14;font-weight:bold">
		<tr>
			<td width="200"> 你好!${sessionScope.user.realname}</td>
			<td align="center">
				<a href="login.amar?method=main">首页</a>
				<a href="login.amar?method=exit">退出</a>
			</td>
		</tr>
	</table>
  </body>
</html>
