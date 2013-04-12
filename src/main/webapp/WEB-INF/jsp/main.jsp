<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="common/tag.jsp" %>
<%@ include file="common/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/centerDiv.css" />
  </head>
  
  <script >
	//window.location.href = "http://www.baidu.com";
	
  </script>
  
  <body class="commonFont">
  <div class="container">

      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>你好，欢迎光临!</h1>
      	<p>我们自己的信息管理系统，期望以最简单的方式提高大家工作效率，我们的目标是快乐的工作着!</p>
      	<br/>
        <p><a href="http://www.metarnet.com" class="btn btn-primary btn-large">友情链接：北京市天元网络股份有限公司 &raquo;</a></p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>写日志</h2>
          <p>坚持写日志是一个好习惯，不管是为自己或是工作，最简单的目的就是总结与回顾，毛主席1968年就说‘历史的经验值得注意’，我们还有什么理由不写下自己的工作历程呢？再者，坚持写日志，周报、年报以及统计工作量还不是手到擒来？</p>
          <p><a class="btn" href="diaryJob.amar?method=personallist">查看 &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>做工作计划</h2>
          <p>类似jira、mantis的报告问题和跟踪问题的模块，因为是我们自己开发的，可以根据我们的需求进行个性化定制。目前已经具备文件上传，图片预览功能。分为三种角色，报告者、程序员、测试员（验收）</p>
          <p><a class="btn" href="jobPlan.amar?method=queryJobplanList">查看 &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>自动生成代码</h2>
          <p>一个小工具，能自动生成mybatis的配置文件与java代码，生成的文件支持单crud（增删改查），前提条件为数据库的表必须有唯一主键，目前支持的数据库为mysql和oracle</p>
		  <p><a class="btn" href="autocode.amar?method=init">查看  &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

    </div> <!-- /container -->
  	
  
  	
  </body>
</html>