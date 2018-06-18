<%--需把局部样式归并为一个通用或符合公告管理的公共样式，
接口对完需调整--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%@ include file="../header.jsp"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<style>
    html, body, .bx {
        width: 100%;
        height: 100%;
    }
</style>
<!DOCTYPE html>
<html style="height:100%;">
<head lang="zh-cn">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script type="text/javascript" src="../../js/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
    </style>
</head>
<body>
<div class="bx">
    <!--标题栏-->
    <div class="head w clearfix">
        <ul class="index_head">
            <li url="goManage">
                  <span class="headli2_1">
                  培训计划管理
                </span>
                <img class="headli1_2" src="../../img/02.png" alt=""/>
            </li>
            <li url="goNew">
                <span class="headli2_1">
                新建培训计划
                </span>
                <img src="../../img/02.png" alt="" class="headli2_2"/>
            </li>

            <li url="goQuery">
                <span class="headli3">
                培训计划查询
                </span>
                <img src="../../img/02.png" alt="" class="headli2_2"/></li>
        </ul>
    </div>

    <div style="width:100%;height:100%;">
        <iframe class="contract_iframe" src="goManage" frameborder="0" width="100%" height="100%"></iframe>
    </div>
</div>

</div>
<script>

    $(function () {
        /*点击标题，获取对应的url，显示对应的src*/
        $('.index_head').on('click', 'li', function () {
            // 设置样式
            $('.index_head span').removeClass("one")
            $(this).children("span").addClass("one");
            // 获取url
            var url = $(this).attr('url');
            $('.contract_iframe').attr('src', url);
        });
    });



</script>
</body>
</html>