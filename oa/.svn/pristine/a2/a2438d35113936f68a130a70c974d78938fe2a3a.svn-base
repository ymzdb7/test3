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
    <title>教师管理主页</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="<%=basePath%>js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=basePath%>lib/laydate.js"></script>
    <script src="<%=basePath%>lib/pagination/js/jquery.pagination.min.js" type="text/javascript"
            charset="utf-8"></script>
    <script src="<%=basePath%>lib/laydate/laydate.js"></script>
    <script src="<%=basePath%>lib/layer/layer.js"></script>
    <style type="text/css">
        .active {
            color: #00a0e9;
        }
        html,body{
            height:100%;
        }
        .head {
            height:45px;
        }
        .head .one{
            padding:3px 14px;
        }

        .head div {
            height: 28px;
            line-height: 28px;
            display: inline-block;
            float: left;
            font-family: "微软雅黑";
            font-size: 14px;
            margin-left: 20px;
            margin-top: 6px;
            cursor: pointer;
        }

        .head div span {
            font-family: "微软雅黑";
            font-size: 14px;
            padding: 4px;
        }

        .head .importBtn {
            margin-top: 6px;
        }

        iframe {
            width: 100%;
            height: 100%;
            border: none;
        }
    </style>
</head>
<body>
<div class="content" style="height:100%">
    <div class="head">
        <div class="manageBtn">
            <span class="one">任课老师管理</span>
            <img class="headli1_2" src="../img/twoth.png" alt="">
        </div>
        <div class="queryBtn">
            <span>任课老师查询</span>
            <img class="headli1_2" src="../img/twoth.png" alt="">
        </div>
        <div class="importBtn">
            <span>任课老师导入</span>
        </div>
    </div>
    <div class="content" style="height:100%">
        <div style="width: 100%; height: 100%; ">
            <iframe src="<%=basePath%>eduTeacher/manage">

            </iframe>
        </div>
    </div>
</div>

<script type="text/javascript">

    $(function () {
        var btns = $('.head').children().children("span");
        $('.manageBtn').click(function () {
            $('.content iframe').attr("src", "<%=basePath%>eduTeacher/manage");
            btns.removeClass("one");
            $('.manageBtn span').addClass("one");
        });
        $('.queryBtn').click(function () {
            $('.content iframe').attr("src", "<%=basePath%>eduTeacher/query");
            btns.removeClass("one");
            $('.queryBtn span').addClass("one");
        });
        $('.importBtn').click(function () {
            $('.content iframe').attr("src", "<%=basePath%>eduTeacher/import");
            btns.removeClass("one");
            $('.importBtn span').addClass("one");
        });

    })
</script>

</body>
</html>
