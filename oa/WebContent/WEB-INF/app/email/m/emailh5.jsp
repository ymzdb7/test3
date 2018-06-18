<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String corpId = (String)request.getAttribute("corpId");
    String corpSecret = (String)request.getAttribute("corpSecret");
%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <title>收件箱</title>
    <link rel="stylesheet" href="../../css/email/m/jquery.mobile.css" />
    <link rel="stylesheet" href="../../css/diary/m/mui.min.css"/>
    <link rel="stylesheet" href="../../css/email/m/styles.css" />
    <link rel="stylesheet" href="../../css/email/m/style.css">
    <link rel="stylesheet" href="../../css/email/m/mail.css">
    <script type="text/javascript" src="../../js/notes/jquery-2.1.2.min.js" ></script>
    <script type="text/javascript" src="../../js/diary/m/mui.min.js" ></script>
    <script type="text/javascript" src="../../js/diary/m/simbaJs.js" ></script>
    <style>
        #Popover_0{
            background: rgb(255, 255, 255);
            box-shadow: none;
        }
        .nav{
            width: 70%;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
            height: 22px;
            line-height: 22px;
            margin-top: 15px;
        }
    </style>
</head>

<body data-role="page">
<header data-role="header" class="mui-bar mui-bar-nav" id="header">
    <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
    <h1 class="mui-title" id="mtitle">收件箱</h1>
</header>
<nav class="mui-bar mui-bar-tab " data-role="footer">
    <a class="mui-tab-item mui-icon mui-icon-email" href="#Popover_0" style="border-right: 1px solid #e2e2e2;"><span class="mui-bottom">邮件箱</span></a>
    <a class="mui-tab-item mui-icon mui-icon-compose" id="Popover_1" ><span class="mui-bottom">写邮件</span></a>
</nav>
<div id="Popover_0" class="mui-popover">
    <div class="mui-popover-arrow"></div>
    <ul class="mui-table-view" id="mailtype">
        <li class="mui-table-view-cell"><a href="#" data-type="inbox">收件箱</a>
        </li>
        <li class="mui-table-view-cell"><a href="#" data-type="outbox">发件箱</a>
        </li>
        <li class="mui-table-view-cell"><a href="#" data-type="noRead">未读</a>
        </li>
        <li class="mui-table-view-cell"><a href="#" data-type="drafts">草稿箱</a>
        </li>
        <li class="mui-table-view-cell"><a href="#" data-type="recycle">废纸篓</a>
        </li>
    </ul>
</div>
<div class="mui-content" style="overflow: auto;">
    <!--<div class="mui-input-row mui-search" style="width:96%;margin: 10px auto 0;">
    <input type="search" id="search" class="mui-input-clear" placeholder="请输入关键字智能搜索">
</div>-->
    <div id="wrapper" class="mui-content">
        <ul class="mui-table-view mui-table-view-chevron" id="ul_calendar"> </ul>
    </div>

</div>

<script>
    var mtype='inbox'

//    function plusReady(){
//        // 在这里调用plus api
//    }
//    if(window.plus){
//        plusReady();
//    }else{
//        document.addEventListener('plusready',plusReady,false);
//    }
    window.addEventListener('refresh',function(e){
        location.reload();
    });
    (function($, doc) {
//        mui.init({
//            swipeBack:true, //启用右滑关闭功能
//            preloadPages:[{
//                id:'detailh5',
//                url:'detailh5'
//            }]
//        });
//        $.back=function(){
//            plus.SimbaPlugin.quitApp();
//        };
        var rmail='rmail';
        get_data(rmail);
//        var detailPage=null;
        mui('#ul_calendar').on('tap', 'a.mui-navigate-right', function() {
//            mtype=event.target.getAttribute('data-type');
            var bodyId = this.getAttribute('bodyId');
            var href = this.href;
//            var mid = this.getAttribute('data-did');
//            var mtype=this.getAttribute('mtype');
//            var type = this.getAttribute("open-type");
//            if(!detailPage){
//                detailPage = plus.webview.getWebviewById('detailh5');
//            }
//            mui.fire(detailPage,'newsId',{
//                mid:mid,
//                mtype:mtype
//            });

                if( mtype == "inbox"|| mtype =="recycle"){
                    mui.openWindow({
                        url: 'detailh5?flag='+mtype+'&emailID='+bodyId
                    });
                }else {
                    mui.openWindow({
                        url: 'detailh5?flag='+mtype+'&bodyId='+bodyId
                    });
                }


        });
        //向左侧滑删除本条数据
        mui('#ul_calendar').on('tap', '.mui-btn', function(event) {
            var btnArray = ['确认', '取消'];
            var elem = this;
            var li = elem.parentNode.parentNode;
            var bodyId = elem.getAttribute('bodyId');
            mui.confirm('确认删除该条记录？', ' ', btnArray, function(e) {
//                var mtype=elem.parentNode.parentNode.lastChild.firstChild.getAttribute('mtype');
                var mid=elem.parentNode.parentNode.lastChild.firstChild.getAttribute('data-did');
                if (e.index == 0) {
                    console.log(mtype);
                    if(mtype=="drafts") {
                        mui.ajax('/email/deleteDraftsEmail',{
                            data:{
                                bodyId:bodyId
                            },
                            dataType:'json',//服务器返回json格式数据
                            type:'get',//HTTP请求类型
                            success:function(data){
                                if(data.flag == true){
                                    mui.toast("删除成功！");
                                    li.parentNode.removeChild(li);
                                }else{
                                    mui.toast("删除失败！");
                                }
                            }
                        });
                    } else {
                        mui.ajax('/email/deleteEmail',{
                            data:{
                                flag:mtype,
                                emailID:bodyId,
                                deleteFlag:0
                            },
                            dataType:'json',//服务器返回json格式数据
                            type:'get',//HTTP请求类型
                            success:function(data){
                                if(data.flag == true){
                                    mui.toast("删除成功！");
                                    li.parentNode.removeChild(li);
                                }else{
                                    mui.toast("删除失败！");
                                }
                            }
                        });

                    }
                } else {
                    setTimeout(function() {
                        $.swipeoutClose(li);
                    }, 0);
                }
            });
        });
        /*收件箱，发件箱，油标箱，草稿等切换*/
        mui('#mailtype').on('tap', 'a', function() {
            mtype=event.target.getAttribute('data-type');
            var title=event.target.text;
            document.getElementById('mtitle').innerHTML= title;
            mui('#Popover_0').popover('hide');
            mui.ajax('/email/showEmail?flag='+mtype+'&page=1&pageSize=3&useFlag=false',{
                dataType:'json',//服务器返回json格式数据
                type:'get',//HTTP请求类型
                success:function(data){
                    var cal='';


                    $("#ul_calendar")[0].innerHTML='';
                    if( data.obj.length != 0){
                        for(var i=0;i<data.obj.length;i++){
                            var ics
                            if( mtype == "inbox"|| mtype =="recycle"){

                                ics=data.obj[i].emailList[0].emailId
                                console.log(ics)

                            }else {
                                ics=data.obj[i].bodyId
                            }

                            cal+='<li class="mui-table-view-cell mui-transitioning">' +
                                '<div class="mui-slider-right mui-disabled">' +
                                '<a class="mui-btn mui-btn-red" bodyId="'+ics+'">删除</a>' +
                                '</div>' +
                                '<div class="mui-slider-handle">' +
                                '<a class="mui-navigate-right" href="/detail" bodyId="'+ics+'" >' +
                                '<p style="color:#333;font-size:1.1em">'+data.obj[i].users.userName+'<span style="font-size: 12px;color:#ccc;width: 65%;display: inline-block;text-align: right;">'+data.obj[i].probablyDate+'</span></p>' +
                                '<p class="nav">ReAll:<span >'+data.obj[i].subject+'</span></p>' +
                                '<div class="nav">'+data.obj[i].content+'</div>'+
                                '</a>' +
                                '</div>' +
                                '</li>';
                        }
                        $("#ul_calendar")[0].innerHTML = cal;
                    }else{
                        $("#ul_calendar")[0].innerHTML = '<li class="mui-table-view-cell">暂无内容</li>';
                    }
                }
            });
        });
        /*点击写邮箱*/
        var btn = document.getElementById("Popover_1");
        btn.addEventListener('tap', function() {
            mui.openWindow({
                url: 'addMailh5',
                id:'add'
            });
        });
    })(mui, document);
    function get_data(m){
        var cal='';
        mui.ajax('/email/showEmail?flag=inbox&page=1&pageSize=3&useFlag=false',{
            data:{
//                mtype:m,
//                flag:'loadlist',
//                ftype:'refresh'
            },
            dataType:'json',//服务器返回json格式数据
            type:'get',//HTTP请求类型
            success:function(data){
                if( data.obj.length != 0){
                    for(var i=0;i<data.obj.length;i++){
                        cal+='<li class="mui-table-view-cell mui-transitioning">' +
                            '<div class="mui-slider-right mui-disabled">' +
                                '<a class="mui-btn mui-btn-red" bodyId="'+data.obj[i].emailList[0].emailId+'">删除</a>' +
                            '</div>' +
                            '<div class="mui-slider-handle">' +
                            '<a class="mui-navigate-right" href="/detailh5" bodyId="'+data.obj[i].emailList[0].emailId+'">' +
                            '<p style="color:#333;font-size:1.1em;height: 22px;line-height: 22px;"><span style="display: inline-block;float: left">'+data.obj[i].users.userName+'</span><span style="font-size: 12px;color:#ccc;display: inline-block;float: right;padding-right: 10px;">'+data.obj[i].probablyDate+'</span></p>' +
                            '<p class="nav">ReAll:<span >'+data.obj[i].subject+'</span></p>' +
                            '<div class="nav">'+data.obj[i].content+'</div>'+
                            '</a>' +
                            '</div>' +
                            '</li>';
                    }
                    $("#ul_calendar")[0].innerHTML = cal;
                }else{
                    $("#ul_calendar")[0].innerHTML = '<li class="mui-table-view-cell">暂无内容</li>';
                }
            }
        });
    }
</script>
</body>
</html>