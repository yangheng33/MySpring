<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>
<%
	String picPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/image"+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>工作情况浏览</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style>
.bar{
    height: 8px;
    background: green;
}

.tableMain{
font-family:宋体;
font-size:10
}

</style>
</head>



<script type="text/javascript" src="javascript/date/WdatePicker.js"></script>
<script type="text/javascript" src="javascript/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="javascript/jquery.fileupload/js/vendor/jquery.ui.widget.js" ></script>
<script type="text/javascript" src="javascript/jquery.fileupload/js/jquery.iframe-transport.js"></script>
<script type="text/javascript" src="javascript/jquery.fileupload/js/jquery.fileupload.js"></script>
<script type="text/javascript" src="javascript/galleria/galleria-1.2.9.min.js"></script>
<script type="text/javascript" src="javascript/galleria/plugins/history/galleria.history.min.js"></script>
<script type="text/javascript">
  
function saveplan()
{
	if(confirm("您确定保存吗?"))
	{	
		document.forms[0].submit();
	}
}


function goBack()
{

	window.location.href = "jobPlan.amar?method=queryJobplanList";
}

function initFunc()
{
	  $("#state").val("${jobplan.state}");
	  $("#plantype").val("${jobplan.plantype}");
	  $("#jobplanlevel").val("${jobplan.jobplanlevel}");
	  $("#projectid").val("${jobplan.projectid}");
	  
	  $("#reportuserid").val("${jobplan.reportuserid}");
	  $("#dealuserid").val("${jobplan.dealuserid}");
	  $("#testuserid").val("${jobplan.testuserid}");
	  
	  Galleria.loadTheme('javascript/galleria/themes/classic/galleria.classic.min.js');
	  Galleria.run('#picDiv');
	  
	  if('${fn:length(picfilelist)}'>0)
	  {
		  $('#picDiv').css("height","320px");
		  $('#picDiv').css("width","700px");
	  }
	  else
	  {
		  $('#picDiv').css("height","0");
		  $('#picDiv').css("width","0");
	  }
	  
}	 

function uploadComplete(e, data)
{
	
	var result = data.result.picfile;
	var s="";
	for( var i=0;i<result.length;i++)
	{
		var start = "<a href=\"<%=picPath%>"+result[i].path+result[i].filename+"\" > ";
		s = start+ "<img src=\"<%=picPath%>"+result[i].path+result[i].filename+"\" />"+"</a>"+s;
	}
	
	$("#picDiv").remove();
	$("#picDiv_father").html("<div id='picDiv' style='height:320px;width:700px'>"+s+"</div>")
	
	Galleria.loadTheme('javascript/galleria/themes/classic/galleria.classic.min.js');
	Galleria.run('#picDiv');
	
}

$(function () 
{
    $('#fileupload').fileupload(
    {
        dataType: 'json',
        done: function (e, data) 
        {
        	uploadComplete(e, data);
        },
	    progressall: function (e, data) {
	        var progress = parseInt(data.loaded / data.total * 100, 10);
	        if(progress<100)
	        {
	        	$('#progress .bar').css('width',progress + '%');
	        }
	        else
	        {
	        	$('#progress .bar').css('width',0 + '%');
	        }
	    },
	    add: function (e, data) 
	    {
	    	$('#progress .bar').css(
		            'width',
		            0 + '%'
		        );
	    	
	   		if(confirm("文件: "+data.files[0].name+"  \n确认上传?"))
	   		{
	   			data.formData = {jobplanid:"${jobplan.id}"};
	   			data.submit();
	   		}
	    }
    });
});

$(document).ready(function(){initFunc();});
</script>
<body>
	<table width="700" height="20" style="font-family:宋体;font-size:14;font-weight:bold">
		<tr>
			<td width="200"> 查看工作</td>
			<td align="center">
				<div id="msgDiv" style="color:E83034;font-weight:bold">
				</div>
			</td>
		</tr>
	</table>
	
	<form action="jobPlan.amar?method=edtiJobplan" method="post">
	<input type="hidden" name="id" value="${jobplan.id}" />
	<table class="tableMain">
		<tr>
			<td>
				任务编号
			</td>
			<td>
				${jobplan.id}
			</td>
			<td >
			标题:
			</td>
			<td colspan="5">
			<input type="text" name="title" value="${jobplan.title}"  <c:if test="${meReport=='n'}"> disabled="disabled" </c:if> style="width:300px"/>
			</td>
		</tr>
		<tr>
			<td>
				项目:
			</td>
			<td>
				<select name="projectid" id="projectid" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if>>
					<c:forEach var="_project" items="${projectlist}">
						<option value="${_project.id}">${_project.name}</option>		
					</c:forEach>
				</select>
			</td>
			
			<td>
			性质:
			</td>
			<td>
				<select name="plantype" id="plantype" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if>>
			  		<option value="1">新需求</option>
			  		<option value="2">bug</option>
			  		<option value="3">产品改进</option>
			  	</select>
			</td>
			
			<td>
			级别:
			</td>
			<td>
				<select name="jobplanlevel" id="jobplanlevel" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if> >
					<option value="1">次要</option>
					<option value="2">普通</option>
			  		<option value="3">重要</option>
			  		<option value="4">紧急</option>
			  	</select>
			</td>
			
			<td>
			当前状态:
			</td>
			<td>
				<select name="state" id="state" <c:if test="${stateRight=='n'}"> disabled="disabled" </c:if>>
						<option value="2">开发中</option>
				  		<option value="3">测试中</option>
						<c:if test="${meDeal!='y'}">
						  		<option value="4">已完成</option>
						</c:if>
				</select>
			</td>
		</tr>
		<tr>
			<td>
			报告者:
			</td>
			<td>
				<select name="reportuserid" id="reportuserid" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if>>
					<c:forEach var="_user" items="${userlist}">
						<option value="${_user.id}">${_user.realname}</option>		
					</c:forEach>
				</select>
			</td>
			
			<td>
				程序员:
			</td>
			<td>
				<select name="dealuserid" id="dealuserid" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if>>
					<c:forEach var="_user" items="${userlist}">
						<option value="${_user.id}">${_user.realname}</option>		
					</c:forEach>
				</select>
			</td>
			
			<td>
			测试员:
			</td>
			<td>
				<select name="testuserid" id="testuserid" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if>>
					<c:forEach var="_user" items="${userlist}">
						<option value="${_user.id}">${_user.realname}</option>		
					</c:forEach>
				</select>
			</td>
			
			<td>
			
			</td>
			<td>
				<input type="button" value="返回工作列表" onclick="goBack()"/>
			</td>
		</tr>
		<tr>
			<td colspan="8">
				计划完成时间:<input type="text" id="planfinishtimestart" name="planfinishtimestart" readonly="readonly" 
				value='<fmt:formatDate value="${jobplan.planfinishtime}" pattern="yyyy-MM-dd HH:mm:ss" />'  class="Wdate"  style="width:140px"
			  	<c:if test="${meReport=='y'}">onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})"</c:if> >
				
				<c:if test="${jobplan.reporttime != null}">
					&nbsp;报告问题时间:
					<fmt:formatDate value="${jobplan.reporttime}" pattern="yyyy-MM-dd" />
				</c:if>
				
				<c:if test="${jobplan.dealtime != null}">
					&nbsp;开发完毕时间:
					<fmt:formatDate value="${jobplan.dealtime}" pattern="yyyy-MM-dd" />
				</c:if>
				
				<c:if test="${jobplan.testtime != null}">
					&nbsp;测试完毕时间
					<fmt:formatDate value="${jobplan.testtime}" pattern="yyyy-MM-dd" />
				</c:if>
				
				<c:if test="${jobplan.finishtime != null}">
					&nbsp;处理完毕时间:
					<fmt:formatDate value="${jobplan.finishtime}" pattern="yyyy-MM-dd" />
				</c:if>
			</td>
		</tr>
		<tr>
			<td>
			内容:
			</td>
			<td colspan="8">
			<textarea rows="5" cols="80"  style="width:700px;height:120px;font-size:10"
			name="content" <c:if test="${meReport=='n'}"> disabled="disabled" </c:if>>${jobplan.content}</textarea>
			</td>
		</tr>
	</table>
	</form>
	<hr width="800" align="left"/>
	<div id="picDiv_father">
	    <div id="picDiv">
	    	<c:if test="${filelist != null}">
		    	<c:forEach var="_picfile" items="${picfilelist}">
		    		<a href="<%=picPath%>${_picfile.path}${_picfile.filename}">
						<img src="<%=picPath%>${_picfile.path}${_picfile.filename}" />
					</a>
				</c:forEach>
			</c:if>
	    </div>
    </div>
    <div id="fileDiv">
    		<c:if test="${filelist != null}">
		    	<c:forEach var="_file" items="${filelist}">
	    			<a href="<%=picPath%>${_file.path}${_file.filename}">${_file.filename}</a>&nbsp;
	    		</c:forEach>
	    		<br/>
    		</c:if>
    </div>
    <input id="fileupload" type="file" name="files[]" data-url="jobPlan.amar?method=uploadFile" multiple>
	&nbsp;&nbsp; 
	<input type="button" value="更新工作情况" onclick="saveplan()"/> 
	&nbsp;&nbsp; 
	<input type="button" value="返回工作列表" onclick="goBack()"/>
    <div id="progress" style="width:700" >
    	<div class="bar" style="width: 0%;"></div>
	</div>
	<hr width="700" align="left"/>
</body>
</html>
