<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<% 
    String path = request.getContextPath(); 

    String basePath = request.getScheme() + "://"  + request.getServerName() + ":" + request.getServerPort() + path + "/"; 
    String serverPath = request.getServerName() + ":" + request.getServerPort();
%> 

<!DOCTYPE html>
<html>
<head> 
<base href="<%=basePath%>"> 
<title>My JSP 'index.jsp' starting page</title> 
<script type="text/javascript"> 
    var ws = null; 
    function startServer(username) 
    { 
        var url = "ws:<%=serverPath%>/myspring/socket/MyWebSocketServlet?username="+username; 
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
        	showMessage("WebSocket is not supported by this browser."); 
            return; 
        } 
        ws.onopen = function() 
        { 
            showMessage("成功连接服务器!");
        }; 
        ws.onmessage = function(event) 
        { 
        	showMessage("" + event.data); 
        }; 
        ws.onclose = function() 
        { 
        	showMessage("close connect.."); 
        }; 
    } 
    
    function send()
    {
    	var content = document.getElementById("sendContent");
    	ws.send(content.value);
    	content.value="";
    }
    
    function showMessage(message)
    {
    	var s = document.getElementById("messageArea").innerHTML;
    	document.getElementById("messageArea").innerHTML=s+"\n"+message;
    }
    
    function login()
    {
    	var username = document.getElementById("username").value;
    	if(username=="" )
    	{
    		alert("请输入用户名");
    	}
    	else
    	{
    		document.getElementById("logoutBtn").disabled = false;
    		document.getElementById("loginBtn").disabled=true;
    		document.getElementById("username").value="你好！"+username;
    		startServer(username);
    		document.getElementById("sendBtn").disabled = false;
    	}
    }
    
    function logout()
    {
    	document.getElementById("loginBtn").disabled=false;
    	document.getElementById("logoutBtn").disabled = true;
    	document.getElementById("username").value="";
    	document.getElementById("sendBtn").disabled = true;
    	ws.close();
    }
</script> 
</head> 

<body > 
	
	<%--<div id="messageDiv" style="float:left;width:299px;height:199px;border:1px solid #c3c3c3"></div>--%>
	
	<input type="text" id="username" placeholder="请输入用户名"/> 
	<button onclick="login()" id="loginBtn">登录</button> 
	<button onclick="logout()" id="logoutBtn" disabled="disabled">退出</button>
	<br/>
	<textarea rows="10" cols="60" id="messageArea"></textarea>
	<br/>
	<textarea rows="5" cols="60" id="sendContent"></textarea> 
	<button id="sendBtn" onclick="send()" disabled="disabled">发送</button>
</body> 
</html>