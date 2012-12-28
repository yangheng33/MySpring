<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'pageTest.jsp' starting page</title>
		
		<link rel="stylesheet" href="<%=path%>/javascript/jquery.pagination_2/pagination.css" />
		<script type="text/javascript" src="<%=path%>/javascript/jquery-1.6.2.min.js"></script>
		<script type="text/javascript" src="<%=path%>/javascript/jquery.pagination_2/jquery.pagination.js"></script>

		<script type="text/javascript">
		$(document).ready(function() {
		 initPagination();
		 
		});
		
		function pageselectCallback(page_index, jq){
        	
			var url = '<%=path%>/pageTest.amar?query=html&page='+(page_index+1);
        	url+= "&"+$("#form1").serialize();
        	alert( url );
        	$("#info").load(url, { "resultType": "html" });
        	return false;
        }
		
		function initPagination() {
          var num_entries = '${page.totalCount}';
          $("#Pagination").pagination(num_entries, {
              callback: pageselectCallback,
              items_per_page:${page.pageSize}, 
          	  next_text:'下一页',
          	  prev_text:'上一页'
          });
          $("#info").load("<%=path%>/pageTest.amar?query=html", { "resultType": "html" });
         }
		
		function btn1Click() {
			
			$("#info").load("<%=path%>/pageTest.amar?query=html", { "resultType": "html" });
		}
		
		function btn2Click() {
			
			$("#info").load("<%=path%>/pageTest.amar?query=json", { "resultType": "json" },function(data,textStatus){dealData(data,textStatus); });
		}
		
		function dealData(data , status) 
		{
		}
		
		</script>
	</head>

	<body>
		<form name="form1" id="form1" method="post">
		This is my JSP page.
		<br />
		<br />
		<button id="btn1" onclick="btn1Click()">加载html</button>
		<button id="btn2" onclick="btn2Click()">加载json</button>
		<input name="project1" type="text" value="123"/>
		<input name="project2" type="text" value="456"/>
		<br />
		
		<div id="info">

		</div>
		<br>
		<div id="Pagination"></div>
		</form>
	</body>
</html>
