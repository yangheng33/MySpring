<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
 %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>图标测试</title>
		<script type="text/javascript" src="<%=path%>/javascript/chart/swfobject.js"></script>
		
	
	</head>
	
	
	
<body>

<div id="chart1" style="padding: 0px; margin:10px; border: 1px solid lightblue; width: 600px; height: 600px;" ></div>
	<script type="text/javascript">
			swfobject.embedSWF("<%=path%>/javascript/chart/open-flash-chart.swf", "chart1", "600", "600", "9.0.0", "expressInstall.swf",
			  {"data-file":"<%=path%>/chart.amar?t=${t}"}
		);
</script>		
</body>
</html>