<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<table cellspacing="1" style="width:800" class="tablesorter">
<thead>
			<tr>
				<th>文件名</th>
				<th>服务器路径</th>
				<th>文件大小</th>
				<th>最后修改时间</th>
			</tr>
</thead>
<c:forEach items="${fileList}" var="file" >
	<tr>
	<td>${file.name}</td>
	<td><a href="file.amar?method=downFile&path=${file.path}">${file.path}</a></td>
	<td>${file.totalspace}</td>
	<td>${file.lastmodified}</td>
	</tr>
</c:forEach>

</table>