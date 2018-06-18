<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() +"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <link rel="stylesheet" href="/css/spirit/groupChat.css">
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
    <style>
        body, button, select, textarea, input, label, option, fieldset,ul,li,p,ol legend{
            font-family: 微软雅黑;
            margin: 0;
            padding: 0;
        }
        ul li{
            list-style: none;
            padding-left: 8px;
            box-sizing: border-box;
            height: 40px;
            line-height: 40px;
            margin-bottom: 10px;
        }
        ul li:hover{
            background: #c0c0c0;
        }
        ul{
            margin-top:2px;
        }
        ul li label img{
            width: 24px;
            vertical-align: middle;
            height:24px;
            margin-top:-3px;
            display: inline-block;
        }
        ul li div p.title{
            height: 14px;
            line-height:14px;
            font-size: 14px;
            overflow: hidden;
            padding-left: 5px;
            margin-top:5px;
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
            width: 9em;
        }
        p.name{
            height: 14px;
            line-height:14px;
            font-size: 12px;
            overflow: hidden;
            padding-left: 5px;
            margin-top:4px;
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
            width: 9em;
        }
        .fl{
            float: left;
        }
        .clearfix{
            display: block;
            clear: both;
            content: '';
        }
        .avatarimg{
            border-radius: 100%;
        }
    </style>
</head>
<body>
    <ul class="titleText">
    </ul>
<script>
    function throttle(method,id) {
        clearTimeout(method.tId);
        method.tId = setTimeout(function () {
            method.call(window,id);
        }, 500);
    }
    function hoverAjax(id) {
        var jqStr=id;
        new QWebChannel(qt.webChannelTransport, function(channel) {
            var content = channel.objects.interface;
            content.xoa_sms(jqStr,'mv',"SHOW_USER_INFO");
        });
    }
    var geiObj=$.GetRequest();
    $.get('/im/getRoomPerson?roomOf='+geiObj.roomOf,function (json) {
        if(json.flag){
            var arr=json.obj;
            var str='';
            for(var i=0;i<arr.length;i++){
                var jQobj=$('<li>\
                    <label class="fl"><img class="avatarimg" src="'+function () {
                        var avatar = arr[i].avatar;
                        if(avatar==undefined||avatar==""){
                            avatar = arr[i].sex;
                        }
                        if(avatar==0){
                            return '/img/email/icon_head_man_06.png'
                        }else if(avatar==1){
                            return '/img/email/icon_head_woman_06.png'
                        }else {
                            return '/img/user/'+arr[i].avatar
                        }
                    }()+'" alt=""></label>\
                    <div class="fl">\
                    <p class="title" title="'+arr[i].deptName+''+function () {
                        if(arr[i].myStatus!=''){
                            return '（'+arr[i].myStatus+'）'
                        }else {
                            return ''
                        }
                    }()+'">'+arr[i].deptName+''+function () {
                        if(arr[i].myStatus!=''){
                            return '（'+arr[i].myStatus+'）'
                        }else {
                            return ''
                        }
                    }()+'</p>\
                    <p class="name">\
                    <span title="'+arr[i].userName+'('+arr[i].userPrivName+')">'+arr[i].userName+'（'+arr[i].userPrivName+'）</span>\
                    </p>\
                    </div>\
                    </li>')

                jQobj.attr('data-obj',JSON.stringify(arr[i]));
                str+=jQobj[0].outerHTML;
            }
            $('ul').html(str)
        }
    },'json')
    $('.titleText').on('mouseenter','li',function () {
        throttle(hoverAjax,$(this).attr('data-obj'))
    })


    $(".titleText").bind("contextmenu", function(e){
        return false;
    })

    $(".titleText").mousedown(function(e){
        if(e.which==3){
            var $li=null;
            if(e.target.tagName!='LI'){
                $li=$(e.target).parents('li')
            }else {
                $li=$(e.target);
            }

            var jqStr=$li.attr('data-obj');
            console.log(jqStr)
            new QWebChannel(qt.webChannelTransport, function(channel) {
                var content = channel.objects.interface;
                content.xoa_sms(jqStr,'rc',"GET_USER_INFO");
            });
        }
    })


</script>
</body>
</html>