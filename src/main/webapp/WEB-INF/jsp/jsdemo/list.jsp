<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <title>js测试</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <script type="text/javascript" src="javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  <script type="text/javascript" src="javascript/jstree-v.pre1.0/jquery.jstree.js"></script>

  
  
  <script type="text/javascript">
	
	function query4Div(index,userid)
	{
		$("#onejobDiv").hide();
		var url = "<%=path%>/diaryJob.amar?method=seeOneDayJob"
		$("#onejobDiv").load(url, { "index": index,"userid":userid,"querydatetime":$("#querydatetime").val() },
				function(responseText, textStatus, XMLHttpRequest){queryComplete(responseText, textStatus, XMLHttpRequest);} );
	}
	
	function queryComplete(responseText, textStatus, XMLHttpRequest)
	{
		$("#onejobDiv").show();
	}
	
	$(function () 
	{
		$("#demo1").jstree({ 
		"json_data" : 
		{
			"data" : [
				{ 
					"data" : "A node", 
					"metadata" : { id : 1 },
					"children" : [ { "data" : "A node","metadata" : { id : 2 } },{ "data" : "A node","metadata" : { id : 3 } } ]
				},
				{ "data" : "A node","metadata" : { id : 4 } }
				]
		},
		"plugins" : [ "themes", "json_data" , "ui" ]	
		}).bind("select_node.jstree", function (e, data) { alert(jQuery.data(data.rslt.obj[0], "id")); });
		}
	);

	</script>
  </head>
  
  <body>
    
    <div class="demo jstree jstree-0 jstree-default" id="demo1" style="height: 398px;width:200">
	<div class="demo jstree jstree-0 jstree-default" id="demo2" style="height: 398px;width:200">
  </body>
</html>
