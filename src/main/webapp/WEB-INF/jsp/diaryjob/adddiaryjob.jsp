<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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

<script type="text/javascript"
	src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
<script type="text/javascript">
  
  
  function dosomething()
  {
	  var s_usedtime="";
	  var s_states="";
	  var s_content="";
		 
	 $("input[name='_usedtime']").each(function(index)
	 {
		 s_usedtime += $(this).val()+",,,,";
	 })
	  $("select[name='_state']").each(function(index)
	 {
		 
		  s_states += $(this).val()+",,,,";
	 })
	  $("[name='_content']").each(function(index)
     {
		  s_content += $(this).val()+",,,,";
	 })
	 
	 $("#usetime").val(s_usedtime);
	 $("#state").val(s_states);
	 $("#content").val(s_content);
	 
	if(confirm("您确认提交工作日志??"))
	{
		document.forms[0].submit();
	}
  }
  
  var divIndex=1;
  function addjob() 
  {
	  divIndex++;
      var content = "<div id='div"+divIndex+"' width='900' height='200'>";
      content += "用时:<input type='text' name='_usedtime'/>状态:<select name='_state'><option value='2'>"
      content += "未完成</option><option value='1'>已完成</option></select><br/>"
      content += "<textarea name='_content' cols='80' rows='3' name='content'>请输入内容</textarea><br/>";
      content += "<input type='button' onclick='removeJob(\"div"+divIndex+"\")' value='删除本条' />"
      content += "</div>";
      $("#jobContainer").html( $("#jobContainer").html()+content );
      
  }
  
  function removeJob(id) 
  {
      $("#"+id).remove();
  }
  
  </script>
<body>
	添加工作记录
	<br>
	<form action="<%=path%>/diaryJob.amar?method=addDiaryjob" method="post">
		<input name="usetime" id="usetime" type="hidden"/>
		<input name="state" id="state" type="hidden"/>
		<input name="content" id="content" type="hidden"/>
		
		  运行时间:<input type="text" id="recordtime" name="recordtime" readonly="readonly" value="${querydatetime}"
		  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" onclick="addjob()" value="新增一条"/> 
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" onclick="dosomething()" value="保存工作记录"/><br/>
		<hr width="800" align="left"/>
		用时:<input type='text' name='_usedtime'/>
		状态:<select name='_state'>
				<option value='1'>已完成</option>
				<option value='2'>未完成</option>
			</select>
		<br/>
		<textarea name='_content' cols='80' rows='3'>请输入内容</textarea>
		<br/>
		<div id="jobContainer" width="900" height="500">
		</div>

	</form>
</body>
</html>
