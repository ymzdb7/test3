<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	<title>工作流</title>
	<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="../js/diary/m/mui.min.js"></script>
	<link href="../css/diary/m/mui.css" rel="stylesheet">

	<script type="text/javascript" charset="UTF-8">
        mui.init();
	</script>
	<style>
		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-object {
			width: 50%;
		}

		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-body {
			font-size: 13px;
		}

		.mui-bar {
			background-color: #0B7CC4;
		}
		/*img{
            border-radius: 50%;
            background-color: red;
        }*/

		.examination {
			height: 40px;
			/*background-color: #C8C7CC;*/
		}

		.examination .left {
			float: left;
			line-height: 40px;
			margin-left: 26px;
			color: #999;
		}

		.examination .right {
			float: right;
			line-height: 40px;
			color: #22be8a;
			margin-right: 13px;
		}

		.mui-table-view:after {
			background-color: #fff;
		}

		.mui-title-bar {
			float: left;
		}

		.mui-title-bar:after {
			content: ' ';
			border-left: 4px solid #ffa96f;
			line-height: 43px;
			margin-left: 10px;
		}

		.mui-table-view.mui-grid-view {
			padding-top: 4px;
			padding-bottom: 14px;
		}

		.mui-table-view:before {
			background-color: #FFFFFF;
		}

		.mui-card-footer,
		.mui-card-header {
			padding: 10px 12px;
		}

		.mui-badge {
			position: absolute;
			top: 0px;
			right: 0px;
		}

		.mui-table-view-cell>.mui-badge,
		.mui-table-view-cell>.mui-btn,
		.mui-table-view-cell>.mui-switch,
		.mui-table-view-cell>a>.mui-badge,
		.mui-table-view-cell>a>.mui-btn,
		.mui-table-view-cell>a>.mui-switch {
			position: absolute;
			top: 17%;
			right: 9px;
			border-radius: 50% 50%;
			z-index: 1;
		}
		img{
			width:38.67px;
			height:38.67px;
		}
		.mui-media-body{
			width:60px;
			height:15px;
		}
		.block{
			height: 88px;
			width: 100%;
		}
		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-body{
			white-space: initial;
		}
		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-body{
			height: 30px;
			margin-top: 0px;
		}
		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-object{
			width:38.67px;
		}
		.header_a{
			height: 15px;
			margin-top: 15px;
		}
	</style>
</head>

<body>
<header class="mui-bar mui-bar-nav" style="display:none;">
	<h1 class="mui-title">审批</h1>
</header>

<body>
<i class="mui-title-bar" style="display:none;"></i>
<div class="mui-card-header" style="display:none;"></div>
<div class="mui-card-content">
	<ul class="mui-table-view mui-grid-view">
		<li style="position: relative;" class="mui-table-view-cell mui-media mui-col-xs-3">
			<span class="mui-badge mui-badge-danger">2</span>
			<a id="wait" class="mui-table-view-cell" href="javascript:;">
				<img class="mui-media-object" src="/img/workflow/mh5/agency.png">
				<div class="mui-media-body " style="height: 15px;margin-top: 4px">待办工作</div>
			</a>
		</li>
		<li class="mui-table-view-cell mui-media mui-col-xs-3">
			<a id="Launch" class="mui-table-view-cell" id="launch" href="javascript:;">
				<img class="mui-media-object" src="/img/workflow/mh5/launch.png">
				<div class="mui-media-body " style="height: 15px;margin-top: 4px">我发起的</div>

			</a>
		</li>
		<li class="mui-table-view-cell mui-media mui-col-xs-3">
			<a id="trun" class="mui-table-view-cell" href="javascript:;">
				<img class="mui-media-object" src="/img/workflow/mh5/trun.png">
				<div class="mui-media-body" style="height: 15px;margin-top: 4px">已转交的</div>
			</a>
		</li>
		<li class="mui-table-view-cell mui-media mui-col-xs-3">
			<a id="End" class="mui-table-view-cell"  href="javascript:">
				<img class="mui-media-object" src="/img/workflow/mh5/handle.png">
				<div class="mui-media-body" style="height: 15px;margin-top: 4px">办结工作</div>
			</a>
		</li>
	</ul>
	<div class="examination">
		<div class="left">常用审批</div>
		<div class="right">
			<a id="add">添加</a>
		</div>
	</div>
	<ul class="mui-table-view mui-grid-view" id="Common">
		<li class="mui-table-view-cell mui-media mui-col-xs-3">
			<a class="mui-table-view-cell" href="<?=$v['url']?>" >
				<img class="mui-media-object" src="/img/workflow/mh5/liu.png">
				<div class="mui-media-body">智能表单功能测…</div>
			</a>
		</li>
	</ul>
	<div style="background-color: #fff; margin-top: 10px;">
		<i class="mui-title-bar"></i>
		<div class="mui-card-header">自由工作者</div>
		<ul class="mui-table-view mui-grid-view">
			<li class="mui-table-view-cell mui-media mui-col-xs-3">
				<a class="block mui-table-view-cell" href="<?=$val['url']?>">
					<img class="mui-media-object" src="/img/workflow/mh5/liu.png">

					<div class="mui-media-body">申请报告</div>
				</a>
			</li>
		</ul>
	</div>
</div>

</body>
</body>
<script type="text/javascript">
    mui.ajax({
        type: 'get',
        url: '/workflow/mobile/flowclassify/flowByAuth',
        dataType:'json',
        success:function(data){
            var li_str1='';
            if(data.datas[0].flowTypes.length>0){
                for(var z=0;z<data.datas[0].flowTypes.length;z++){
                    li_str1 += '<li class="mui-table-view-cell mui-media mui-col-xs-3">'+
									'<a class="mui-table-view-cell" href="/dingdingMicroApp/workform" >'+
										'<img class="mui-media-object" src="/img/workflow/mh5/liu.png">'+
										'<div class="mui-media-body">'+data.datas[0].flowTypes[z].flowName+'</div>'+
									'</a>'+
							'</li>'
                }
                jQuery("#Common").html(li_str1);
            }else{
                jQuery("#Common").html('<li class="mui-table-view-cell">暂无数据</li>');
            };

            var li_str2='';
            if(data.datas.length>0){
                for(var i=1;i<data.datas.length;i++){
                    li_str2 +=  '<div style="background-color: #fff; margin-top: 10px;">'+
									'<i class="mui-title-bar"></i>'+
									'<div class="mui-card-header">'+data.datas[i].sortName+'</div>'+
									'<ul class="mui-table-view mui-grid-view">'
                    for(var y=0;y<data.datas[i].flowTypes.length;y++){
                        li_str2 += '<li class="mui-table-view-cell mui-media mui-col-xs-3">'+
										'<a class="block mui-table-view-cell" href="/dingdingMicroApp/workform">'+
											'<img class="mui-media-object" src="/img/workflow/mh5/liu.png">'+
											'<div class="mui-media-body">'+data.datas[i].flowTypes[y].flowName+'</div>'+
										'</a>'+
									'</li>'

					}
					li_str2 +=  '</ul>'+
                      			  '</div>'
                }
                jQuery("#Common").after(li_str2);
            }else{
                jQuery("#Common").after('<li class="mui-table-view-cell">暂无数据</li>');
            }

        }
    });
    document.getElementById('add').addEventListener('tap', function(e) {
        //打开常用审批页面
        mui.openWindow({
            url: '/dingdingMicroApp/workflowAdd',
            id: '/dingdingMicroApp/workflowAdd'
        });

    });
    document.getElementById('wait').addEventListener('tap', function(e) {
        mui.openWindow({
            url: '/dingdingMicroApp/workflowLaunch?flag=1',
            id: '/dingdingMicroApp/workflowLaunch'
        });

    });
    document.getElementById('Launch').addEventListener('tap', function(e) {
        mui.openWindow({
            url: '/dingdingMicroApp/workflowLaunch?flag=2',
            id: '/dingdingMicroApp/workflowLaunch'
        });

    });
    document.getElementById('trun').addEventListener('tap', function(e) {
       alert("正在开发中！")
    });
    document.getElementById('End').addEventListener('tap', function(e) {
        mui.openWindow({
            url: '/dingdingMicroApp/workflowLaunch?flag=4',
            id: '/dingdingMicroApp/workflowLaunch'
        });

    });
</script>

</html>