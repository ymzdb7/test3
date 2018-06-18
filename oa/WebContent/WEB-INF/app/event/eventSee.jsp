<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title><fmt:message code="event.th.Chronicle" /></title>
    <link rel="stylesheet" type="text/css" href="../css/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="../css/easyui/icon.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script type="text/javascript" src="../js/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/jquery.form.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        ul{
            margin:0;
        }
        ul li{
            list-style:none;
        }
        body{
            background:white;
            color:rgb(102, 102, 102);
        }
        .head{
            width:auto;
        }
        .title{
            width:80%;
            margin:0 auto;
            padding:10px 0px;
            border-bottom:2px solid #ddd;
        }
        .titleText{
            text-align:center;
            font-size:30px;
            font-family:'微软雅黑','宋体';
        }
        .section{
            width:100%;
            margin:0 auto;
            padding:45px 0 0 0;
            min-width:720px;
        }
        .history{
            position:relative;
            background:url(../../img/line.png) repeat-y 226px 0px;
            overflow:hidden;
        }
        .history_date  h2{
            width:59px;
            font-size:25px;
            font-weight:normal;
            padding-left:230px;
            margin-bottom:74px;
            margin-top:0px;
            background:url(../../img/time_end.png)158px 0px / 59px 59px no-repeat rgb(255, 255, 255);
        }
        .history_date ul li{
            background:url("../../img/icon_dian.png")no-repeat 180px 8px;
            background-size:15px 14px;
            padding-bottom:150px;
            zoom:1;
            position: relative;
        }
        .year{
            background-color:#fea500;
            display:inline-block;
            width:56px;
            height:24px;
            color:#fff;
            text-align:center;
            line-height:24px;
            font-size:18px;
            margin:18px 0px 18px 0px;
        }
        .history_date ul .con h3{
            color:#6ea0e9;
            margin-top:8px;
            position: absolute;
            left: -20px;
            width: 187px;
        }
        .history_date ul li h3{
            float:left;
            width:168px;
            text-align:right;
            padding-right:19px;
            color:#c3c3c3;
            font:normal 18px/16px Arial;
        }
        .history_date ul .con h3 span{
            color:#6ea0e9;
        }
        .history_date ul li h3 span{
            display:block;
            font-size:12px;
            color:#d0d0d0;
        }
        .con .newCon{
            text-indent:30px;
        }
        .conTitle{
            font-weight:bold;
            font-size:18px;
            font-weight:'微软雅黑';
        }
        .conText{
            font-weight:normal;
            font-size:14px;
            font-family:'微软雅黑';
            color:#999;
        }
        .text{
            padding-left:30px;
            float:left;
            position: absolute;
            width: 680px;
            left: 180px;
        }
        .content{
            width:80%;
            margin:0 auto;
            min-width:720px;
        }
    </style>
</head>
<body>
<div class="head">
    <div class="nav_box">
        <ul class="title">
            <li class="titleText"><fmt:message code="event.th.WholeDesign" /></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="section">
        <%--<div class="history">--%>
        <%--<div class="history_date">--%>
        <%--<ul class="history_first">--%>
        <%--<h2>--%>
        <%--<span class="year">2017</span>--%>
        <%--</h2>--%>
        <%--<li class="con">--%>
        <%--<h3>09-03 <span>2017</span></h3>--%>
        <%--<div class="text">--%>
        <%--<span class="conTitle">123</span>--%>
        <%--<p class="conText">124355</p>--%>
        <%--</div>--%>
        <%--</li>--%>
        <%--</ul>--%>
        <%--</div>--%>
        <%--</div>--%>
    </div>
    <%--<div style="margin-left:223px;">--%>
        <%--<img src="../../img/circle.png" alt="">--%>
       <%--</div>--%>

</div>

<script>
    $(function () {
//        获取cookie
        function getCookie (key) {
            var arr=document.cookie.split('; '); //多个cookie之间是用;+空格连接的
            for (var i = 0; i < arr.length; i++) {
                var arr2=arr[i].split('=');
                if(arr2[0]==key){
                    return arr2[1];
                }
            }
            return false;//如果函数没有返回值，得到的结果是undefined
        }
        var cookie=getCookie('uuid');
//        列表展示
        function init(){
            $('tbody').eq(0).empty();
            $.ajax({
                type:'get',
                url:'/timeLineEvent/getEventList',
                dataType:'json',
                data:{'uuid':cookie},
                success:function(res){
                    var datas=res.obj;
                    datas.sort(function(a,b){
                        return Date.parse(a.startTime)-Date.parse(b.startTime);
                    })
                    datas.reverse();
                    var year=[],mon=[],day=[];
                    for(var i=0;i<datas.length;i++){
                        var str=datas[i].startTime.split(' ')[0].split('-')[0];
                        var str2=datas[i].startTime.split(' ')[0].split('-')[1];
                        var str3=datas[i].startTime.split(' ')[0].split('-')[2];
                        year.push(str);
                        mon.push(str2);
                        day.push(str3)
                    }

                    var arr=[];
                    for(var a=0;a<year.length;a++){
                        arr[a]=year[a];
                        for(var b=0;b<year.length;b++){
                            if(arr[a]==year[b]&&a!=b){
                                year[b]="";
                            }
                        }
                    }
                    //console.log(datas)
                    for(var j=0;j<datas.length;j++){
                        $('.section').append($('<div class="history"> ' +
                            '<div class="history_date"> ' +
                                '<ul class="history_first"> ' +function () {
                            if(j!=0) {
                                if (year[j] != year[j + 1]&&year[j]!="") {
                                    return '<h2> ' +
                                        '<span class="year">' + year[j] + '</span> ' +
                                        '</h2> '
                                } else {
                                    return ''
                                }
                            }else {
                                return '<h2> ' +
                                    '<span class="year">' + year[j] + '</span> ' +
                                    '</h2> '
                            }
                            }()+'<li class="con"> ' +
                                        '<h3>'+mon[j]+"-"+day[j]+'<span>'+year[j]+'</span></h3> ' +
                                        '<div class="text"> ' +
                                            '<span class="conTitle">'+datas[j].title+'</span> ' +
                                            '<p class="conText">'+datas[j].content+'</p> ' +
                                        '</div> ' +
                                    '</li> ' +
                                '</ul> ' +
                            '</div> ' +
                        '</div>'+function(){
                                if(j==datas.length-1){
                                    return '<div style="margin-left:200px;">' +
                                        '        <img src="../../img/time_start.png" alt="">' +
                                        '    </div>'
                                }else{
                                    return ""
                                }
                            }()
                        ))
                    }
                }
            })
        }
        init();


    })




</script>
</body>
</html>
