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
  
  function savechange()
  {
	  var s_detailid="";
	  var s_jobid="";
	  var s_usedtime="";
	  var s_content="";
	  var s_jobplanid="";
	  var s_type="";
	  var s_count="";
	  var s_title="";
	  var s_project="";	 
	  
	 
	 $("[name='_detailid']").each(function(index)
     {		
		   s_detailid += $(this).val()+",,,,";   
	 })
	 $("[name='_jobid']").each(function(index)
     {
		   s_jobid += $(this).val()+",,,,";   
	 })
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


	 $("#detailid").val(s_detailid);
	 $("#jobid").val(s_jobid);
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
	  divIndex ++;
      var content = "<div id='div"+divIndex+"' width='900' height='200'>";
		
		content += "<hr width='900' align='center'/>"
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
		content += "用时(小时):<input type='text' name='_usedtime' value='0' style='width:50px' />";
		content += "&nbsp;";
		content += "完成情况:<select name='_count' style='width:70px'>";
		content += "<option value='0'>0%</option>";
		content += "<option value='20'>20%</option>";
		content += "<option value='40'>40%</option>";
		content += "<option value='60'>60%</option>";
		content += "<option value='80'>80%</option>";
		content += "<option value='100'>100%</option>";
		content += "</select>";
		
		content += "<textarea name='_content' cols='80' rows='3' style='width:700px;height:80px;font-size:10'>请输入工作内容</textarea> ";    
		//content += "<br/>";
		content += "&nbsp;&nbsp;";
		content += "<input type='button' onclick='removeJob(\"div"+divIndex+"\")' value='删除本条' class='btn2'/>"
		content += "</div><br/>";
		
		$("#jobContainer").append( content );
  }
  
  function removeJob(id) 
  {

      $("#"+id).remove();
  }
  
  </script>
<body>
	<div class="container">
	
	<form action="<%=path%>/diaryJob.amar?method=saveChange" method="post" class="form-inline">
		<input name="detailid" id="detailid" type="hidden"/>
		<input name="jobid" id="jobid" type="hidden"/>
		<input name="usetime" id="usetime" type="hidden"/>
		<input name="content" id="content" type="hidden"/>
		<input name="jobplanid" id="jobplanid" type="hidden"/>
		<input name="type" id="type" type="hidden"/>
		<input name="count" id="count" type="hidden"/>
		<input name="title" id="title" type="hidden"/>
		<input name="projectid" id="projectid" type="hidden"/>
		
		&nbsp;&nbsp;&nbsp;&nbsp;
		修改工作记录：&nbsp;&nbsp;时间:<fmt:formatDate value="${job.jobtime }" pattern="yyyy-MM-dd HH:mm:ss"/>
		<br/> 
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" onclick="addjob()" value="新增一条" class="btn2"/> 
		&nbsp;&nbsp;
		<input type="button" onclick="savechange()" value="修改工作记录" class="btn2"/>
		&nbsp;&nbsp;
		<input type="button" onclick="goback()" value="返回日记列表" class="btn2"/>
		
		<div id="jobContainer" width="900" height="500">
		
		<c:forEach items="${detaillist}" var="detail" varStatus="status">
		
		<div id='div0${status.count}' width='900' height='200'>
		<hr width="900" align="center"/>
			<input type="hidden" name='_jobplanid' value="${detail.jobplanid}"/>
			<input type="hidden" name='_detailid' value="${detail.id}"/>
			<input type="hidden" name='_jobid' value="${detail.jobid}"/>
		&nbsp;
		序号:${status.count}
		&nbsp;
		标题:<c:if test="${detail.jobplanid > 0 }">
				<a href="jobPlan.amar?method=toEdtiJobplan&id=${detail.jobplanid}">
					${detail.title}
				</a>
				<input type="hidden" name='_title' value="${detail.title}"/>
			</c:if>
			<c:if test="${detail.jobplanid == 0 }">
				<input type='text' name='_title' value="${detail.title}" style='width:100px'/>
			</c:if>			
		&nbsp;
		项目:<c:if test="${detail.jobplanid > 0 }">
				<select name='_project' disabled="disabled">
			</c:if>
			<c:if test="${detail.jobplanid == 0 }">
				<select name='_project' >
			</c:if>
					<c:forEach items="${projectlist}" var="projectInfo">
						<option value='${projectInfo.id}'  <c:if test="${projectInfo.id == detail.projectid}">selected='selected'</c:if> >
							${projectInfo.name}
						</option>
					</c:forEach>
			</select>
		&nbsp;
		<c:if test="${detail.jobplanid > 0 }">
		计划中的->
		</c:if>
		<c:if test="${detail.jobplanid == 0 }">
		计划外的->
		</c:if>
		<c:if test="${detail.jobplanid > 0 }">
			<select name='_type' style='width:100px' disabled="disabled">
		</c:if>
		<c:if test="${detail.jobplanid == 0 }">
			<select name='_type' style='width:100px'>
		</c:if>
			<option value='3' <c:if test="${detail.type=='3' }">selected="selected"</c:if>>其他事项</option>
			<option value='4' <c:if test="${detail.type=='4' }">selected="selected"</c:if>>数据整理</option>
			<option value='2' <c:if test="${detail.type=='2' }">selected="selected"</c:if>>功能测试</option>
			<option value='1' <c:if test="${detail.type=='1' }">selected="selected"</c:if>>功能开发</option>
		</select>
		&nbsp;
		用时(小时):		
		<input type='text' name='_usedtime' style="width:50px" value='${detail.usedtime}' />
		&nbsp;
		完成:
		<select name='_count' style='width:70px'>	
			<option value='0'   <c:if test="${detail.count=='0' }">selected="selected"</c:if>>0%</option>
			<option value='20'  <c:if test="${detail.count=='20' }">selected="selected"</c:if>>20%</option>
			<option value='40'  <c:if test="${detail.count=='40' }">selected="selected"</c:if>>40%</option>
			<option value='60'  <c:if test="${detail.count=='60' }">selected="selected"</c:if>>60%</option>
			<option value='80'  <c:if test="${detail.count=='80' }">selected="selected"</c:if>>80%</option>
			<option value='100' <c:if test="${detail.count=='100' }">selected="selected"</c:if>>100%</option>
		</select>
		&nbsp;
		<br/> 
		&nbsp;
		<c:if test="${detail.jobplanid > 0 }">
			<textarea name='_content' cols='80' rows='3'  style="width:800px;height:80px;font-size:10" disabled="disabled">${detail.content }</textarea>
		</c:if>
		<c:if test="${detail.jobplanid == 0 }">
			<textarea name='_content' cols='80' rows='3'  style="width:800px;height:80px;font-size:10">${detail.content }</textarea>
		</c:if>	
		&nbsp;&nbsp;
		<c:if test="${detail.jobplanid == 0 }">
			<input type='button' onclick='removeJob("div0"+${status.count})' value='删除本条' class='btn2'/>	
		</c:if>	
						
		</div>
		</c:forEach> 
	
		</div>
	
	</form>
	</div>
</body>
</html>
