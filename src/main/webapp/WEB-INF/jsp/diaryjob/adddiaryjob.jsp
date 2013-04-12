<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>

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
  function goback()
  {
	  window.location.href = "diaryJob.amar?method=personallist";
  }
  
  function dosomething()
  {
	  var s_usedtime="";
	  var s_content="";
	  var s_jobplanid="";
	  var s_type="";
	  var s_count="";
	  var s_title="";
	  var s_project="";	 
	  
	 $("[name='_title']").each(function(index)
     {
		 s_title += $(this).val()+",,,,";
	 })
	 $("input[name='_usedtime']").each(function(index)
	 {
		 s_usedtime += $(this).val()+",,,,";
	 })
	  $("[name='_content']").each(function(index)
     {
		  s_content += $(this).val()+",,,,";
	 })
	 
	  $("[name='_jobplanid']").each(function(index)
     {
		  s_jobplanid += $(this).val()+",,,,";
	 })
	 
	  $("[name='_type']").each(function(index)
     {
		  s_type += $(this).val()+",,,,";
	 })
	 
	  $("[name='_count']").each(function(index)
     {
		  s_count += $(this).val()+",,,,";
	 })
	 
	   $("[name='_project']").each(function(index)
     {
		   s_project += $(this).val()+",,,,";
	 })
	 
	 
	 $("#title").val(s_title);
	 $("#jobplanid").val(s_jobplanid);
	 $("#type").val(s_type);
	 $("#count").val(s_count);
	 $("#usetime").val(s_usedtime);
	 $("#content").val(s_content);
	 $("#projectid").val(s_project);
	 
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
		
		content += "&nbsp;&nbsp;";
		content += "标题:<input type='text' name='_title' value='请输入标题' style='width:100px'/>&nbsp;";
		content += "<input type='hidden' name='_jobplanid' value='0'/>";
		
		content += "项目:<select name='_project' >"
		<c:forEach items="${projectlist}" var="projectInfo">
			content += "<option value='${projectInfo.id}'> ${projectInfo.name} </option>"
		</c:forEach>
		content += "</select>";
		content += "&nbsp;";
		content += "任务类型:<select name='_type' style='width:100px'>";
		content += "<option value='3' >其他事项</option>";
		content += "<option value='4' >数据整理</option>";
		content += "<option value='2' >功能测试</option>";
		content += "<option value='1' selected='selected'>功能开发</option>";
		content += " </select>";
		content += "&nbsp;";
		content += "用时(小时):<input type='text' name='_usedtime' value='0' style='width:50px'/>";
		content += "&nbsp;";
		content += "完成情况:<select name='_count' style='width:70px'>";
		content += "<option value='0'>0%</option>";
		content += "<option value='20'>20%</option>";
		content += "<option value='40'>40%</option>";
		content += "<option value='60'>60%</option>";
		content += "<option value='80'>80%</option>";
		content += "<option value='100'>100%</option>";
		content += "</select>";
		content += "<br/>";
		content += "<textarea name='_content' cols='80' rows='3' style='width:500px;height:80px;font-size:10'>请输入工作内容</textarea> ";        
		content += "<br/><input type='button' onclick='removeJob(\"div"+divIndex+"\")' value='删除本条' class='btn2'/>"
		content += "</div>";
		$("#jobContainer").html( $("#jobContainer").html()+content );
  }
  
  function removeJob(id) 
  {
      $("#"+id).remove();
  }
  
  </script>
<body
	<div class="container">
	添加工作记录
	<br>
	<form action="<%=path%>/diaryJob.amar?method=addDiaryjob" method="post" style="font-family:宋体;font-size:10;">
		<input name="usetime" id="usetime" type="hidden"/>
		<input name="content" id="content" type="hidden"/>
		<input name="jobplanid" id="jobplanid" type="hidden"/>
		<input name="type" id="type" type="hidden"/>
		<input name="count" id="count" type="hidden"/>
		<input name="title" id="title" type="hidden"/>
		<input name="projectid" id="projectid" type="hidden"/>
		
		 工作时间:<input type="text" id="recordtime" name="recordtime"  value="${querydatetime}"
		  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:160px">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" onclick="addjob()" value="新增一条" class="btn2"/> 
		&nbsp;&nbsp;
		<input type="button" onclick="dosomething()" value="保存工作记录" class="btn2"/>
		&nbsp;&nbsp;
		<input type="button" onclick="goback()" value="返回日记列表" class="btn2"/>
		
		<hr width="800" align="left"/>
		
		<c:forEach items="${dealJobList}" var="dealjob">
			标题:<input type='text' name='_title' value="${dealjob.title}" disabled="disabled" style='width:100px'/>
			    <input type="hidden" name='_jobplanid' value="${dealjob.id}"/>
			
			项目:<select name='_project' disabled="disabled">
					<c:forEach items="${projectlist}" var="projectInfo">
						<option value='${projectInfo.id}'  <c:if test="${projectInfo.id == dealjob.projectid}">selected='selected'</c:if> >
							${projectInfo.name}
						</option>
					</c:forEach>
				</select>
			
			任务类型:<select name='_type' disabled="disabled" style='width:100px'>
					<option value='3' >其他事项</option>
					<option value='4' >数据整理</option>
					<option value='2' >功能测试</option>
					<option value='1' selected="selected">功能开发</option>
				  </select>
			
			用时(小时):<input type='text' name='_usedtime' style="width:50px" value='0' />
			
			完成情况:<select name='_count' style='width:70px'>
					<option value='0'>0%</option>
					<option value='20'>20%</option>
					<option value='40'>40%</option>
					<option value='60'>60%</option>
					<option value='80'>80%</option>
					<option value='100'>100%</option>
				  </select>
			<br/>
			<textarea name='_content' cols='80' rows='3' disabled="disabled" style="width:500px;height:80px;font-size:10">${dealjob.content}</textarea>
		</c:forEach>
		
		
		<c:forEach items="${testJobList}" var="dealjob">
			标题:<input type='text' name='_title' value="${dealjob.title}" disabled="disabled" style="width:100px"/>
				<input type="hidden" name='_jobplanid' value="${dealjob.id}"/>
			
			项目:<select name='_project' disabled="disabled" >
					<c:forEach items="${projectlist}" var="projectInfo">
						<option value='${projectInfo.id}'  <c:if test="${projectInfo.id == dealjob.projectid}">selected='selected'</c:if> >
							${projectInfo.name}
						</option>
					</c:forEach>
				</select>
				
			任务类型:<select name='_type' disabled="disabled" style="width:100px">
					<option value='3' >其他事项</option>
					<option value='4' >数据整理</option>
					<option value='2' selected="selected">功能测试</option>
					<option value='1' >功能开发</option>
				  </select>
			
			用时(小时):<input type='text' name='_usedtime' style="width:50px" value='0'/>
			
			完成情况:<select name='_count' style="width:70px">
					<option value='0'>0%</option>
					<option value='20'>20%</option>
					<option value='40'>40%</option>
					<option value='60'>60%</option>
					<option value='80'>80%</option>
					<option value='100'>100%</option>
				  </select>
			<br/>
			<textarea name='_content' cols='80' rows='3' disabled="disabled" style="width:500px;height:80px;font-size:10">${dealjob.content}</textarea>
		</c:forEach>
		<br/>
		<div id="jobContainer" width="900" height="500">
		</div>

	</form>
	</div>
</body>
</html>
