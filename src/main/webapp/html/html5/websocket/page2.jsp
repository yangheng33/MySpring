<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<% 
    String path = request.getContextPath(); 
    String basePath = request.getScheme() + "://" 
            + request.getServerName() + ":" + request.getServerPort() 
            + path + "/"; 
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
<script type="text/javascript"> 
    var ws = null; 
    function startServer() 
    { 
        var url = "ws:localhost:80/myspring/socket/MyWebSocketServlet"; 
        if ('WebSocket' in window) 
        { 
            ws = new WebSocket(url); 
        } 
        else if ('MozWebSocket' in window) 
        { 
            ws = new MozWebSocket(url); 
        } 
        else 
        { 
            alert('WebSocket is not supported by this browser.'); 
            return; 
        } 
        ws.onopen = function() 
        { 
            alert("connect success!"); 
        }; 
        ws.onmessage = function(event) 
        { 
            alert("revice mess:" + event.data); 
        }; 
        ws.onclose = function() 
        { 
            alert("close connect.."); 
        }; 
    } 
</script> 
</head> 

<body onload="startServer()"> 

</body> 
</html>