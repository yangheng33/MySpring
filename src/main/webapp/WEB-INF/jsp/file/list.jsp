<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/header.jsp" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>文件管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <link rel="stylesheet" href="javascript/jquery.tablesorter/themes/blue/style.css" type="text/css" media="print, projection, screen" />
  <link rel="stylesheet" href="css/centerDiv.css" type="text/css"/>
  <script type="text/javascript" src="javascript/jquery-1.6.2.min.js"></script>
  <script type="text/javascript" src="javascript/jquery.tablesorter/jquery.tablesorter.min.js"></script>
  <script type="text/javascript" src="javascript/jstree-v.pre1.0/jquery.jstree.js"></script>
  <script type="text/javascript" src="javascript/jquery.fileupload/js/vendor/jquery.ui.widget.js" ></script>
<script type="text/javascript" src="javascript/jquery.fileupload/js/jquery.iframe-transport.js"></script>
<script type="text/javascript" src="javascript/jquery.fileupload/js/jquery.fileupload.js"></script>
  
  <script type="text/javascript">
	
	
	
	function queryComplete(responseText, textStatus, XMLHttpRequest)
	{
		$("#onejobDiv").show();
	}
	
	$(function () 
	{
		$("#demo1").jstree(
		{
	        "json_data" : 
	        {
	            "ajax" : 
	            {
	                "url" : "file.amar?method=getAllFileDir",
	                "data" : function (n) 
	                {
	                    return { id : n.attr ? n.attr("id") : 0 };
	                }
	            }
	        },
	        "plugins" :["themes","json_data","ui","contextmenu","crrm"]
	    }).bind("select_node.jstree", function (e, data) 
    	{ 
    		
    		var path = data.rslt.obj.attr("path");
    		$("#dirname").val(path);
    		queryFile( path );
    	}).bind("create.jstree", function (e, data)
   		{
    		alert("123");
   			$.post(
            "file.amar?method=addFolder",
            {
                "operation" : "create_node",
                "path" : data.rslt.parent.attr("path"),
                "position" : data.rslt.position,
                "title" : data.rslt.name,
                "type" : data.rslt.obj.attr("rel")
            },
            function (r) 
            {
                if(r.status) 
                {
                    $(data.rslt.obj).attr("path", "node_" + r.id);
                }
                else 
                {
                    $.jstree.rollback(data.rlbk);
                }
            }
            );
		}
    	).bind("remove.jstree", function (e, data) 
    	{
            data.rslt.obj.each(function () 
            {
                $.ajax({
                    async : false,
                    type: 'POST',
                    url: "file.amar?method=deleteFolder",
                    data : {
                        "operation" : "remove_node",
                        "id" : this.id.replace("node_","")
                    },
                    success : function (r) {
                        if(!r.status) {
                            data.inst.refresh();
                        }
                    }
                });
            });
        })
        .bind("rename.jstree", function (e, data) {
            $.post(
                "file.amar?method=renameFolder",
                {
                    "operation" : "rename_node",
                    "id" : data.rslt.obj.attr("id").replace("node_",""),
                    "title" : data.rslt.new_name
                },
                function (r) {
                    if(!r.status) {
                        $.jstree.rollback(data.rlbk);
                    }
                }
            );
        })
	;
	}
	);

	function queryFile( path )
	{
		var url = "file.amar?method=getDirDetial";	
		$("#fileDiv").load(url ,{ "path":path },function(responseText, textStatus, XMLHttpRequest){});
	}
	function queryComplete(responseText, textStatus, XMLHttpRequest)
	{
		
	}

	function uploadFile()
	{
		if($("#dirname").val()=="")
		{
			alert("请选择要上传的路径");
			return;
		}
		if($("#files").val()=="")
		{
			alert("请选择要上传的路径");
			return;
		}
		
	}
	
	$(function () 
			{
				$("#mmenu input").click(function () 
				{
			        switch(this.id) 
			        {
			            case "add_default":
			            case "add_folder":
			                $("#demo1").jstree("create", null, "last", { "attr" : { "rel" : this.id.toString().replace("add_", "") } });
			                break;
			            case "search":
			                $("#demo1").jstree("search", document.getElementById("text").value);
			                break;
			            case "text": break;
			            default:
			                $("#demo1").jstree(this.id);
			                break;
			        }
		        });

				$("#create_1").click(function () 
				{
					$("#demo1").jstree("create", null, "last", { "attr" : { "rel" : this.id.toString().replace("add_", "") } });
				});

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
				   			data.formData = {dirname:$("#dirname").val()};
				   			data.submit();
				   		}
				    }
			    });
			});
	</script>
  </head>
  
  <body>
  <div class="container"><!-- container -->
	  	<div class="divtable">
	  		<div class="row">
	    		<div class="three">
	    			<input type="button" value="新建文件夹" id="create_1"/>
	    			<div class="demo jstree jstree-0 jstree-default" id="demo1" style="height: 500px;width:200">
	    		</div>
				<div class="three">
					<form action="file.amar?method=uploadFile">
						<input type="text" name="dirname" id="dirname" placeholder="请选择上传的路径" class="span6"/>
						<input id="fileupload" type="file" id="files" name="files" data-url="file.amar?method=uploadFile" multiple>
					<div id="fileDiv"> 
						<table cellspacing="1" style="width:800" class="tablesorter">
							<thead>
										<tr>
											<th>文件名</th>
											<th>路径</th>
											<th>文件大小</th>
											<th>最后修改时间</th>
										</tr>
							</thead>
						</table>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div><!-- container -->
  </body>
</html>
