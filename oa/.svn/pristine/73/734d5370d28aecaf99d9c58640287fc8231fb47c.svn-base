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
	<title>添加</title>
	<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
	<link href="../css/diary/m/mui.css" rel="stylesheet">
	<style>
		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-object{
			width: 50%;
		}
		.mui-table-view.mui-grid-view .mui-table-view-cell .mui-media-body{
			font-size: 12px;
		}
		.mui-bar{
			background-color: #0B7CC4;
		}
		.examination{
			height: 40px;
			/*background-color: #C8C7CC;*/
		}
		.examination .left{
			float: left;
			line-height: 40px;
			margin-left: 26px;
			color: #999;
		}
		.examination .right{
			float: right;
			line-height: 40px;
			color: #22be8a;
			margin-right: 13px;
		}
		.mui-table-view:after{
			background-color: #fff;
		}
		.mui-title-bar{
			float: left;
		}
		.mui-title-bar:after{
			content: ' ';
			border-left: 2px solid red;
			line-height: 43px;
			margin-left: 10px;
		}
		input[type=search]{
			background-color: #fff;
		}
		.mui-search{
			width: 93%;
			margin: 0 auto;
			margin-top: 10px;
			height:40px;
		}

		.mui-segmented-control{
			font-size: 12px;
			width: 93%;
			margin: 0 auto;
			background-color: #fff;
		}
		#slider{
			margin-bottom: 6px;
		}
		.mui-segmented-control .mui-control-item.mui-active{
			background-color: #598fd6;
		}
		.mui-segmented-control{
			border: 1px solid #598fd6;
		}
		.item {
			float:left;
			clear:both;
			margin-bottom:23px;
		}
		.title{
			position:relative;
		}
		/* .dot-right {
		font-size: 0;
		line-height: 0;
		border-width: 10px;
		border-color: red;
		border-right-width: 0;
		border-style: dashed;
		border-left-style: solid;
		border-top-color: transparent;
		border-bottom-color: transparent;
		position:absolute;
		right:23px;
		top:11px;
	}
	.dot-bottom {
    font-size: 0;
    line-height: 0;
    border-width: 10px;
    border-color: red;
    border-bottom-width: 0;
    border-style: dashed;
    border-top-style: solid;
    border-left-color: transparent;
    border-right-color: transparent;
}    */
	</style>
</head>
<body>
<header class="mui-bar mui-bar-nav" style="display:none;">
	<h1 class="mui-title">审批</h1>
</header>
<div class="mui-input-row mui-search">
	<input id="searchLog" type="search" class="mui-input-clear" placeholder="搜索">
</div>
<body class="body">

<div id="slider" class="mui-slider">
	<div class="mui-segmented-control">
		<a class="mui-control-item mui-active" index="0" id="noadd">未添加</a>
		<a class="mui-control-item" index="1" id="add">已添加</a>
	</div>
</div>


<div class="mui-slider-group">
	<div id="item1mobile" class=" mui-slider-item mui-control-content" style="display:block;">
		<ul class="mui-table-view btn1">
			<div class="box0" style="background-color: #fff; margin-top: 10px;">
				<div class="title">
					<i class="mui-title-bar"></i>
					<div class="mui-card-header">1.1.自由工作流</div>
					<span class="item dot-right"></span></div>
			</div>

		</ul>
	</div>
	<div id="item2mobile" class=" mui-slider-item mui-control-content"  style="display:none;">
		<ul class="mui-table-view btn2">
			<div class="box10" style="background-color: #fff; margin-top: 10px;">
				<div class="title1">
					<i class="mui-title-bar"></i>
					<div class="mui-card-header">1.1.自由工作流</div>
				</div>
				<li style="display:none" class="mui-table-view-cell">申请报告
					<button flow_id="61" type="button" class="mui-btn mui-btn-danger mui-btn-outlined del1">删除</button>
				</li>
				<li style="display:none" class="mui-table-view-cell">采购物资入库单
					<button flow_id="664" type="button" class="mui-btn mui-btn-danger mui-btn-outlined del1">删除</button>
				</li>
			</div>
		</ul>
	</div>
</div>
</div>
</body>
</body>
</html>
<script type="text/javascript">
    $(function(){
        //初始化页面
        $.ajax({
            type:"post",
            url:"data/data.php",
            async:false,
            data:{
                A:'select_list',
            },
            dataType:'json',
            success:function(data){
                var li_nner1;
                var li_nner2;
                for(var i=0;i<data.length;i++){
                    li_nner1=''
                    li_nner2='';
                    li_nner1+='<div class="box'+i+'" style="background-color: #fff; margin-top: 10px;"><div class="title"><i class="mui-title-bar"></i><div class="mui-card-header">'+data[i].title+'</div><span class="item dot-right"></span></div></div>'
                    for(var j=0;j<data[i].app.length;j++){
                        if(data[i].app[j].is_common==0){
                            li_nner2+='<li style="display:none"  class="mui-table-view-cell">'+data[i].app[j].flow_name+'<button flow_id="'+data[i].app[j].flow_id+'" type="button" class="mui-btn mui-btn-success mui-btn-outlined del1">添加</button></li>'
                        }
                    }
                    $('.btn1').append(li_nner1);
                    $('.box'+i).append(li_nner2);
                }
                $('.btn1 .title').on('click',function(){
                    $(this).nextAll().toggle()
                    //$(this).find('span').toggleClass('dot-bottom')
                })
            }
        });
        //以添加
        $('a[index=1]').on('click',function(){
            $('#item1mobile').hide();
            $('#item2mobile').show();
            $("#noadd").removeClass("mui-active");
            $("#add").addClass("mui-active");
            $.ajax({
                type:"post",
                url:"data/data.php",
                async:true,
                data:{
                    A:'select_list',
                },
                dataType:'json',
                success:function(data){
                    var li_nner3;
                    var li_nner4;
                    for(var i=0;i<data.length;i++){
                        li_nner3=''
                        li_nner4='';
                        li_nner3+='<div class="box1'+i+'" style="background-color: #fff; margin-top: 10px;"><div class="title1"><i class="mui-title-bar"></i><div class="mui-card-header">'+data[i].title+'</div></div></div>'
                        for(var j=0;j<data[i].app.length;j++){
                            if(data[i].app[j].is_common==1){
                                li_nner4+='<li style="display:none"  class="mui-table-view-cell">'+data[i].app[j].flow_name+'<button flow_id="'+data[i].app[j].flow_id+'" type="button" class="mui-btn mui-btn-danger mui-btn-outlined del1">删除</button></li>'
                            }
                        }
                        $('.btn2').append(li_nner3);
                        $('.box1'+i).append(li_nner4);
                    }
                    $('.btn2 .title1').on('click',function(){
                        $(this).nextAll().toggle()

                    })
                }
            });
        })
    })

    //点击添加刷新
    $('a[index=0]').on('click',function(){
        location.reload()
    })


    //???
    $(document).on('click','.mui-btn-success',function(){
        var This=$(this)
        var btn=This.attr('flow_id');
        list(btn)
        function list(me){
            $.ajax({
                type:"post",
                url:"data/data.php",
                async:true,
                data:{
                    A:'common',
                    B:'addition',
                    flow_id:me
                },
                dataType:'json',
                success:function(data){
                    //This.text('删除');
                    //This.removeClass('mui-btn-success');
                    //This.addClass('mui-btn-danger');
                    //var li_b=This.parent().clone();
                    //$(li_b).find('button').addClass('del1')
                    //var a=$('.btn2').append(li_b);
                    This.parent().remove();

                }
            });
        }
    })
    //???
    $(document).on('click','.mui-btn-danger',function(){
        var This=$(this)
        var btn=This.attr('flow_id');
        list(btn)
        function list(me){
            $.ajax({
                type:"post",
                url:"data/data.php",
                async:true,
                data:{
                    A:'common',
                    B:'delete',
                    flow_id:me
                },
                dataType:'json',
                success:function(data){
                    This.parent().remove();

                }
            });
        }
    })
    //????????
    var u=navigator.userAgent;
    if(!!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/)){
        //???IOS  eid
        $("#searchLog").blur(function(){
            loglist();
        })
    }else if(u.indexOf("Android")>-1||u.indexOf("Linux")>-1){
        //??????  eid
        document.getElementById("searchLog").addEventListener("keydown",function(e){
            if(13 == e.keyCode){ //????????????
                loglist();
                document.activeElement.blur();//?????????
            }
        },false);
    }
    function loglist(){
        var data = {
            "A":"search",
            "keyword":$("#searchLog").val() //??????????
        };
        mui.ajax({
            url: 'data/data.php',
            type: 'POST',
            data:data,
            dataType:'json',
            success:function(data){
                var li_nner='';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){//????????
                        if(data[i].is_def==0){
                            li_nner+='<li  class="mui-table-view-cell">'+data[i].flow_name+' <button flow_id="'+data[i].flow_id+'" type="button" class="mui-btn mui-btn-success mui-btn-outlined add1">???</button></li>'
                        }else{
                            li_nner+='<li  class="mui-table-view-cell">'+data[i].flow_name+'<button flow_id="'+data[i].flow_id+'" type="button" class="mui-btn mui-btn-danger mui-btn-outlined del1">???</button></li>';
                        }
                    }
                    $("#slider").remove()
                    $(".btn1").html(li_nner);
                }else{
                    $("#slider").remove()
                    $(".btn1").html('<li style="text-align:center" class="mui-table-view-cell">????????</li>');
                }
            }
        });
    }

</script>