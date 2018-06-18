<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html style="height: 100%">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

    <title>学籍转入转出</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        #search{
            margin-left: 360px;
            font-size: 16px;
        }
        #export{
            font-size: 16px;
        }
        .newNew tr td{
            border:none;
        }
        .newNew .tableHead tr td{
            border:1px solid #c0c0c0;
        }
        .ban{
            width: 80px;
            height: 28px;
            padding-left: 10px;
        }
        .left{
            float:left;
        }

        /*导航栏*/
        .header{
            position: fixed;
            width: 100%;
            background: #fff;
            width:100%;
            height:45px;
            border-bottom:1px solid #9E9E9E;
        }
        .nav{
            overflow:hidden;
        }
        .nav li{
            height:28px;
            line-height:28px;
            float:left;
            font-size:14px;
            margin-left:20px;
            margin-top:6px;
            cursor:pointer;
        }
        .space{
            width:2px;
            margin-left:16px;
        }
        .pad{
            padding:6px 14px;
            line-height:28px;
        }
        .select{
            background-color:#2F8AE3;
            color:#fff;
            border-radius:20px;
            -webkit-border-radius:20px;
            -moz-border-radius:20px;
            -o-border-radius:20px;;
            -ms-border-radius:20px;
        }
        /*content*/
        .tableTitle span{
            font-size:22px;
            color:#494d59;
            padding-left:20px;
        }
        .box{
            height:100%;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;height: 100%;">

<div class="box">
    <div class="header">
        <ul class="nav">
            <li url="/schoolRoll/schoolSeting">
                <span class="select pad new1">学籍查询权限</span>
                <img class="space" src="../../img/twoth.png" alt="">
            </li>

            <li style="margin-top:6px;" url="/schoolRoll/jurisdiction">
                <span class="pad new2">学籍管理权限</span>
                <img class="space" src="../../img/twoth.png" alt="">
            </li>

        </ul>
    </div>
    <div class="list" style="width:100%;height:100%">
        <%--列表展示部分--%>
        <iframe vote_id="0" id="iframe" src="/schoolRoll/schoolSeting" frameborder="0" style="width:100%;height:100%"></iframe>
    </div>
</div>

</body>

<script type="text/javascript">
    $(function(){
        var iframeH=$('.box').height()-6;
        $('.list').height(iframeH);

        $('.header').on('click','li',function(){
            $('.header span').removeClass('select')
            $(this).find('span').addClass('select');

            var url=$(this).attr('url');
            $('#iframe').attr('src',url);
        })


    })


</script>
</html>
