<%@ page language="java" import="com.amar.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
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
	<script type="text/javascript" 
	        src="http://connect.facebook.net/zh_CN/all.js"></script>

  </head>
  
 
  <script >
	FB.init({
        appId  : '264583603594034',
        status : true,
        cookie : true,
        oauth: true
    });
	
	function sendRequestViaMultiFriendSelector() {
        FB.ui({method: 'apprequests',
          message: 'My Great Request2'
        }, requestCallback);
      }
	 function requestCallback(response) {
       alert( "requestCallback response:"+ response["request"]+",to="+response["to"] );
       console.log(response);
      }
	 
	function getRequest(requestId) {
  		FB.api(requestId, function(response) {
    	console.log(response);
  		});
	}
	 
	function getMultipleRequests(requestIds) {
  		FB.api('', {"ids": requestIds }, function(response) {
    	 	alert( "invate response:"+ response );
  			console.log(response);
  		});
	}
	
		
  </script>
  
  <body>
test info
<br/>
  <%
  	String param = request.getParameter( "param" );
  	if ( param != null )
  	{
		out.println("<br/><br/><br/>param:"+param);
		
  	}

  	boolean auth = false;
  	String sign = request.getParameter( "signed_request" );
  	String data = "";
  	String token = "";
  	if ( sign != null && ! "".equalsIgnoreCase( sign ) )
  	{
  		String [] t = sign.split( "[.]" );
  		if ( t.length > 1 )
  		{
  			String payload = t[ 1 ];
  			data = new String( Base64.decodeUrl( payload ) );
  			out.println( data );

  			if ( data.contains( "oauth_token" ) )
  			{

  				auth = true;
  			}
  		}

  		if ( ! auth )
  		{
  			out.println( "<script>window.top.location.href='https://www.facebook.com/dialog/oauth?client_id=264583603594034&redirect_uri=http://apps.facebook.com/amar_happy/&scope=email,publish_stream'</script>" );
  		}
  	}
  %>
 <br/>
 
<%
 	String request_ids = request.getParameter( "request_ids" );
 	if ( request_ids != null && ! "".equals( request_ids ) )
 	{
 		out.print( "request_ids:" + request_ids );
 %>
	<br/><input type="button" onclick="getRequest('323213517708322_100002043713620'); return false;" value="get invate on console ." /><br/>
	<br/><input type="button" onclick="getMultipleRequests('323213517708322,127535040694794'); return false;" value="get getMultipleRequests invate on console ." /><br/>
	 
<%
	 	}
	 %>

 <input type="button" onclick="sendRequestViaMultiFriendSelector(); return false;" value="Send Request to Many Users with MFS" />
 

 <a href="https://graph.facebook.com/318039058220040_100001550477960?access_token=AAADwoyu0ozIBAPOky5kyZAjoBcZB8CLXZBnzPobEWfAUbZBu8USH13NrvWejn2NXbZCPjj8m97VdwCLLNQkU60Ae7DwWcZCRspJ6ScXkJBknIXZA3HpzlNB">bb</a>
 <a href="https://graph.facebook.com/?ids=323213517708322_100002043713620,127535040694794_100002043713620,196298487124436_100002043713620&access_token=AAADwoyu0ozIBAPOky5kyZAjoBcZB8CLXZBnzPobEWfAUbZBu8USH13NrvWejn2NXbZCPjj8m97VdwCLLNQkU60Ae7DwWcZCRspJ6ScXkJBknIXZA3HpzlNB">dd</a>
 
 <br/>
 
 	<script >
function analyzeSign() {
		var jsData = <%=data%>;
		//jsData = eval(jsData);
		document.getElementById("area1").value= jsData.user_id;
		alert( "id:"+jsData.user_id);
		}
	</script>
	
 <textarea rows="10" cols="10" id="area1"></textarea>
 <br/>
 <input type="button" onclick="analyzeSign(); return false;" value="analyzeSign" /><br/>
 
 
 <div id="info"> </div>
  </body>
</html>
