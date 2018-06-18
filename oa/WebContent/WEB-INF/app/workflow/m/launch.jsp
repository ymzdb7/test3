<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html>

<head>
	<meta charset="UTF-8">
	<title></title>
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="../js/diary/m/mui.min.js"></script>
	<link href="../css/diary/m/mui.css" rel="stylesheet">
	<script type="text/javascript">
        mui.init({
        });
	</script>
	<style type="text/css">
		input[type=search]{
			background-color: #fff;
		}
		.mui-search{
			width: 93%;
			margin: 0 auto;
			/*margin-top: 50px;*/
			height:40px;
		}
		.mui-input-row{
			margin-top: 3px;
			z-index:10;
		}
	</style>
</head>

<body>
<div class="mui-input-row mui-search">
	<input id="searchLog" type="search" class="mui-input-clear" placeholder="搜索">
</div>
<div id="refreshContainer" class="mui-content mui-scroll-wrapper">
	　　<div class="mui-scroll">
	　　	<!--数据列表-->
	　　　　<ul id="testUl" class="mui-table-view mui-table-view-chevron"></ul>
	　　</div>
</div>
</body>

</html>
<script type="text/javascript">
    function GetQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return unescape(r[2]); return null;
    }
   	var flag_type = GetQueryString("flag"); //括号里放地址栏传参变量
	var type_url ="";
	if(flag_type == 1){
        type_url = "/workflow/work/selectWork"
	}else if(flag_type==2){
        type_url = "/workflow/work/selectAll"
	}else if(flag_type==4){
        type_url = "/workflow/work/selectEndWord"
	}
    var pageSize=10;
    var counter = 1;//计数器
    var pageStart = 0;//开始数据条数
    var dataNum;
    mui.init({
        pullRefresh : {
            container:refreshContainer,//待刷新区域标识，querySelector能定位的css选择器均可，比如：id、.class等
            up : {
                height:50,//可选.默认50.触发上拉加载拖动距离
                auto:true,//可选,默认false.自动上拉加载一次
                contentrefresh : "加载中...",//可选，正在加载状态时，上拉加载控件上显示的标题内容
                contentnomore:'没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容；
                callback: pullupRefresh
            }
        }
    });
	var sum=0;
    function data(add,sum,type_url){
        $.ajax({
            type: 'get',
            url: type_url,
            dataType: 'json',
            data: {
                page: sum,
                pageSize:10,
                useFlag:true
            },
            success: function(res) {
                var data=res.obj;
                var li_inner='';
                var li_inner1='<li class="nothing mui-table-view-cell">没有更多数据了</li>';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){//增加数据
						li_inner+='<li class="pin mui-table-view-cell"><a  href="javascript:;" class="mui-navigate-right"><div>['+data[i].createTime+'] - 第'+data[i].prcsId+'步 '+data[i].flowProcess.prcsName+'</div><p>'+data[i].flowRun.runName+' '+data[i].flowRun.userName+' '+data[i].flowRun.runId+'</p><p>'+data[i].userName+'</p></a></li>';
					}
                    $(".mui-table-view").append(li_inner);
                    if(data.length<1){//当没有数据时
                        $(".nothing").remove();
                        $(".mui-table-view").append(li_inner1);
                    }
                }else{
                    $(".mui-table-view").append(li_inner1);
                }

                $('p').css({//多余的文字省略
                    'overflow': 'hidden',
                    'text-overflow':'ellipsis',
                    'white-space': 'nowrap',
                    'margin-right':'10px'
                })
                add();
            },

        })
    }
    function pullupRefresh() {
        sum = sum+1;
        var This=this;
        setTimeout(function(){
            data(add,sum,type_url);
            This.endPullupToRefresh(false);
        },500)
    }
    function add(){
        return	pageStart += 10
    }
    //搜索功能
    var u=navigator.userAgent;
    if(!!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/)){
        //获取IOS  eid
        $("#searchLog").blur(function(){
            loglist();
        })
    }else if(u.indexOf("Android")>-1||u.indexOf("Linux")>-1){
        //获取安卓  eid
        document.getElementById("searchLog").addEventListener("keydown",function(e){
            if(13 == e.keyCode){ //点击了“搜索”
                loglist();
                document.activeElement.blur();//隐藏软键盘
            }
        },false);
    }
    function loglist(){
        var data = {
            "page":1,
            "pageSize":10,
            "useFlag":true,
            "keyword":$("#searchLog").val() //搜索的内容
        };
        mui.ajax({
            url: type_url,
            type: 'get',
            data:data,
            dataType:'json',

            success:function(res){
                var data=res.obj;
                var li_inner='';
                var li_inner1='<li class="nothing mui-table-view-cell">没有更多数据了</li>';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){//增加数据
                        li_inner+='<li class="pin mui-table-view-cell"><a  href="javascript:;" class="mui-navigate-right"><div>['+data[i].createTime+'] - 第'+data[i].prcsId+'步 '+data[i].flowProcess.prcsName+'</div><p>'+data[i].flowRun.runName+' '+data[i].flowRun.userName+' '+data[i].flowRun.runId+'</p><p>'+data[i].userName+'</p></a></li>';
                    }
                    $("#testUl").html(li_inner);
                }else{
                    $("#testUl").html('<li style="text-align:center" class="mui-table-view-cell">暂无数据</li>');
                }
            }
        });
    };
    mui("ul").on("tap","li",function(){
        mui.openWindow({
            url: '/dingdingMicroApp/workform',
            id: '/dingdingMicroApp/workform'
        });
    });

</script>