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
	<%
		Enumeration < String > e = request.getParameterNames();
		StringBuffer s = new StringBuffer();
		int i=0;
		while ( e.hasMoreElements() )
		{
			String key = e.nextElement();
			String value = request.getParameter( key );
			if( i==0 )
				s.append("?");
			else
				s.append("&");
			s.append( key + "=" + value + "" );
			i++;
		}
	%>
	url = '<%=path%>/fb.amar<%=s.toString() %>';
	
	window.location.href=url;
  </script>
  
  <body>
  	<%=s.toString() %>
  </body>
</html>
