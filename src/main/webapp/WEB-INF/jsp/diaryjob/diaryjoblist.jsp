<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>工作日报</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="<%=path%>/javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <style>
	<!--
	
	 .jobdiv
	 {
	 	   font-family:宋体;
	 	   font-size:10;
	 	   font-weight:blod;
	 	   background-color: #EFEFEF;
	 	   border: 1px solid red;
           z-index:1000;
           left:40%;
           top:100;
           height:450;
           overflow-y:auto;
           overflow:auto;
           position:fixed!important;
           margin-left:-150px !important;
           _position:absolute;
           _top:expression(eval(document.compatMode && document.compatMode=='CSS1Compat')?
               documentElement.scrollTop + (document.documentElement.clientHeight - this.offsetHeight)/2: /*IE6*/
           	   document.body.scrollTop + (document.body.clientHeight - this.clientHeight)/2);  /*IE5 IE5.5*/
       }
	-->
  </style>
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  
  <script type="text/javascript">
  	function go()
  	{
  		$("#onejobDiv").hide();
  		if( $("#querytype").val()=='all')
  		{
  			document.forms[0].action= "<%=path%>/diaryJob.amar?method=alllist";    
  		}
  		else
  		{
  			document.forms[0].action= "<%=path%>/diaryJob.amar?method=personallist";
  		}
  		document.forms[0].submit();
  	}
    function seePersonaljob()
    {
    	$("#onejobDiv").hide();
    	document.forms[0].action= "<%=path%>/diaryJob.amar?method=personallist";    
		document.forms[0].submit();
    }
    function seeOtherDiaryjob()
	{
    	$("#onejobDiv").hide();
		document.forms[0].action= "<%=path%>/diaryJob.amar?method=alllist";    
		document.forms[0].submit();
	}
	
	function findDiary()
	{
		document.forms[0].action= "<%=path%>/diaryJob.amar?method=personalDiarylist";    
		document.forms[0].submit();
	}
	
	function askAddDiaryjob(index)
	{
		$("#onejobDiv").hide();
		if($("#querytype").val()=='all')
		{
			return;
		}
		if(confirm("没有填写工作记录,是否去添加?"))
		{
			document.forms[0].action= "<%=path%>/diaryJob.amar?method=toAddDiaryjob&index="+index;    
			document.forms[0].submit();
		}
	}
	
	function queryDiaryjob(index,userid)
	{
		document.forms[0].action= "<%=path%>/diaryJob.amar?method=seeOneDayJob&index="+index+"&userid="+userid+"&querydatetime="+$("#querydatetime").val();    
		document.forms[0].submit();
	}
	function exportExcel()
	{
		$("#onejobDiv").hide();
		document.forms[0].action= "diaryJob.amar?method=exportExcel"; 
		document.forms[0].submit();
	}
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
	
	
	</script>
  </head>
  
  <body class="commonFont">
    
    <form action="<%=path%>/diaryJob.amar?method=personallist" method="post">
	时间选择:<input type="text" id="querydatetime" name="querydatetime" value="${querydatetime}"
  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:160px">
  	&nbsp;&nbsp;
  	<input type="hidden" id="querytype" value="${querytype}">
  	<input type="button" onclick="go()" value="查询" class="btn2">&nbsp;&nbsp;
  	
  	<c:if test="${querytype =='all'}">
  	<button onclick="seePersonaljob()" class="btn2">查看自己的工作</button>&nbsp;&nbsp;<button onclick="exportExcel()">导出excel</button>
  	</c:if>
  	<c:if test="${querytype =='personal'}">
  	<button onclick="seeOtherDiaryjob()" class="btn2">查看所有人的工作</button>
  	</c:if>
  	<br/>
	
	<table cellspacing="1" style="width:3000" class="tablesorter">
			<thead>
				<tr>
						<th >用户名</th>
					<c:forEach items="${datelist}" var="datetime">
						<th >${datetime}</th>
					</c:forEach>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${userlist}" var="user" >
				<tr>
					<td >${user.realname}</td>
					<c:forEach items="${user.havediarylist}" var="userDate" varStatus="status">
						<c:if test="${userDate == '0'}">
							<td  style="background:red" onclick="askAddDiaryjob('${status.count}')">未记录</td>
						</c:if>
						<c:if test="${userDate == '1'}">
							<td  style="background:green" onclick="query4Div('${status.count}','${user.userid}')">已记录</td>
						</c:if>
					</c:forEach>
				</tr>
			</c:forEach>
			</tbody>
	</table>
	<div id="onejobDiv" class="jobdiv" style="display:none">
	</div>
	</form>
	
  </body>
</html>
