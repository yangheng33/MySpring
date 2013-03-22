<%@ page language="java" pageEncoding="UTF-8" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <title>注册新用户</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="<%=path%>/javascript/jquery.validity/jquery.validity.css" />
  <link rel="stylesheet" href="css/centerDiv.css" />
  <script type="text/javascript" src="<%=path%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.validity/jquery-1.8.3.min.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.validity/jquery.validity.min.js"></script>
  <script type="text/javascript">
  	function gogo()
  	{
  		if(confirm("您确定注册码?"))
  		{
  			document.forms[0].submit();
  		}
  	}
  	
  </script>
  
  <body class="commonFont">
 开始测试,参考
 <table class="commonFont" border="1">
	 <tr>
	 	<td>数据库</td>	<td>数据</td>	<td>事务</td>	<td>打印日志</td>	<td>耗时(秒)</td>	<td>每秒处理</td>
	 </tr>
	 <tr>
	 	<td>mysql</td>	<td>100000</td>	<td>无</td>	<td>是</td>	<td>188.8</td>	<td>529.6610169</td>
	 </tr>
	 <tr>
	 	<td>mysql</td>	<td>100000</td>	<td>有</td>	<td>是</td>	<td>124.712</td>	<td>801.8474565</td>
	 </tr>
	 <tr>
	 	<td>mysql</td>	<td>100000</td>	<td>有</td>	<td>否</td>	<td>62.547</td>	<td>1598.797704</td>
	 </tr>
	 <tr>
	 	<td>mysql</td>	<td>100000</td>	<td>无</td>	<td>否</td>	<td>63.6</td>	<td>1572.327044</td>
	 </tr>
 </table>
  <br/>
  <form id="form1" action="testdatabase.amar?method=insert" method="post">
  
  <input type="submit" />
  </form>

  </body>
 </html>
 