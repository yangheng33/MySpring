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
	<script src="http://connect.facebook.net/en_US/all.js"></script>

  </head>
  
  <script >
	FB.init({
        appId  : '264583603594034',
        frictionlessRequests : true,
        status : true,
        cookie : true,
        oauth: true
    });
      
	function sendRequestViaMultiFriendSelector() {
        FB.ui({method: 'apprequests',
          message: 'My Great Request'
        }, requestCallback);
      }
	 function requestCallback(response) {
       alert( response );
       console.log(response);
      }
  </script>
  
  <body>
  	info:
    <br/>
    ${info}
    <br/><br/><br/>
    
   <input type="button"
      onclick="sendRequestViaMultiFriendSelector(); return false;"
      value="Send Request to Many Users with MFS by frictionless" />
    
  <a href="<%=path%>/fb.amar?a=login"> 首页</a>
  </body>
</html>
