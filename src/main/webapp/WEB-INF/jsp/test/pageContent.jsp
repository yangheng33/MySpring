<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


    	<table width="300" height="400" border=2>
    	<c:forEach items="${list}" var="lists" varStatus="listIndex">
    		<tr>
	    		<td>${lists.name}</td>
	    		<td>${lists.value}</td>
	    		<td>${lists.type}</td>
    		</tr>
    	</c:forEach>
    	
    </table>
    	