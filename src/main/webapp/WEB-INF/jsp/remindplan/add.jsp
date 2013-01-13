<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
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
  
  <script type="text/javascript" src="<%=request.getContextPath()%>/javascript/date/WdatePicker.js"></script>
  <script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript">
  
  function goback()
  {
	  alert(123);
  }
  
  
  function dosomething()
  {
	  var cycleid = $('#cycle').val();
	  var label = "";
	  if( cycleid==1)
	  {
		  label="hour";
	  }
	  else if(cycleid==2)
	  {
		  label="day";
	  }
	  else if(cycleid==3)
	  {
		  label="week";
	  }
	  else if(cycleid==4)
	  {
		  label="moonth";
	  }
	  var TypeID =$("input[name="+label+"]");
	  
      var values =",";
	  for(var i=0;i<TypeID.length;i++)
	  {
		 
          if(TypeID[i].checked )
          {
        	  values = values+TypeID[i].value+",";
          }
      }
	  $("#cycleparam").val(values);
	  document.forms[0].submit();
  }
  
  function changeCycle()
  {
	  $('#hourDiv').hide();
	  $('#dayDiv').hide();
	  $('#weekDiv').hide();
	  $('#moonthDiv').hide();
	  
	  cycleid = $('#cycle').val();
	  if( cycleid==1)
	  {
		  $('#hourDiv').show();
	  }
	  else if( cycleid ==2)
	  {
		  $('#dayDiv').show();
	  }
	  else if( cycleid ==3)
	  {
		  $('#weekDiv').show();
	  }
	  else if( cycleid ==4)
	  {
		  $('#moonthDiv').show();	  
	  }
	  
  }
  
  function changeType()
  {
	  var typeid = $("#type").val();
	  if(typeid==0)
	  {
		  $('#timeDiv').hide();
		  $('#cycleDiv').hide();
	  }
	  else if(typeid==1)
	  {
		  $('#cycleDiv').hide();
		  $('#timeDiv').show();
	  }
	  else if(typeid==2)
	  {
		  $('#cycleDiv').show();
		  $('#timeDiv').show();
	  }
  }
  </script>
  <body>
     添加新提醒<br>
     <form action="<%=path%>/remindplan.amar?method=add" method="post">
     <input type="hidden" id="userid" name="userid" value="${sessionScope.user.id}"/>
     <input type="hidden" id="cycleparam" name="cycleparam" />
     
     标题:<input type="text" id="title" name="title"/><br/>
     使用状态:<select id="state" name="state">
     	<option value="2">停止</option>
     	<option value="1">启动</option>
     </select><br/>
     
     任务类型:<select id="type" name="type" onchange="changeType()">
		<option value="0">请选运行方式</option>
     	<option value="1">提醒一次</option>
     	<option value="2">循环提醒</option>
     </select><br/>
     <div id="cycleDiv" style="display: none">
		      循环周期:<select id="cycle" name="cycle" onchange="changeCycle()">
		      <option value="0">请选择循环方式</option>
		     	<option value="1">小时循环</option>
		     	<option value="2">日循环</option>
		     	<option value="3">周循环</option>
		     	<option value="4">月循环</option>
		     </select><br/>
		     <div id="hourDiv" style="display: none">
			     <c:forEach begin="1" end="60" step="1" varStatus="status">
			     ${status.count}分<input type="checkbox" name="hour" value="${status.count}"/>
			     <c:if test="${status.count % 10 == 0}"><br/></c:if>
			     </c:forEach>
		     </div>
		
		     <div id="dayDiv" style="display: none">
		     	<c:forEach begin="1" end="23" step="1" varStatus="status">
			     	${status.count}点<input type="checkbox" name="day" value="${status.count}"/>
			     	<c:if test="${status.count % 10 == 0}"><br/></c:if>
			    </c:forEach>
		     </div>
		     
		     <div id="weekDiv" style="display: none">
		    	星期一<input type="checkbox" name="week" value="1"/>
		    	星期二<input type="checkbox" name="week" value="2"/>
		    	星期三<input type="checkbox" name="week" value="3"/>
		    	星期四<input type="checkbox" name="week" value="4"/>
		    	星期五<input type="checkbox" name="week" value="5"/>
		    	星期六<input type="checkbox" name="week" value="6"/>
		    	星期天<input type="checkbox" name="week" value="7"/>
		     </div>
		     
		     <div id="moonthDiv" style="display: none">
		     		<c:forEach begin="1" end="31" step="1" varStatus="status">
			     		${status.count}号<input type="checkbox" name="moonth" value="${status.count}"/>
			     		<c:if test="${status.count % 11 == 0}"><br/></c:if>
			    	</c:forEach>
		     </div>
		 </div>
		 <div id="timeDiv" style="display: none">   
		     运行时间:<input type="text" id="exectimes" name="exectimes" readonly="readonly" 
		  	onfocus="WdatePicker({skin:'blue',autoPickDate:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate"  style="width:140px"><br/>
		  </div>
		  
		    <textarea id="content" cols="80" rows="10" name="content">要提醒的内容</textarea><br/>
		    <input type="button" onclick="dosomething()" value="提交咯"/>
		    <input type="button" onclick="goback()" value="返回"/>
    
     </form>
  </body>
</html>
