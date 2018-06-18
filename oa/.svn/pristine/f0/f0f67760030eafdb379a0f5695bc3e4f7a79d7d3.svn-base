
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="main.inform"/></title>
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base/base.css">
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <style>
        table tbody td{
            text-align: left!important;
        }
        input{
            float: none;
        }
        .editAndDelete3{
            color: red;
        }
        label input[type=text]{
            width: 150px;
            height: 28px;
            line-height: 28px;
            border-radius: 4px;
            padding-left: 10px;
            box-sizing: border-box;
        }
    </style>

</head>
<body>
<div class="navigation">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/la1.png" alt="">
    <h2><fmt:message code="main.inform"/></h2>
    <label>
        <select name="type">
            <option value="0"><fmt:message code="news.th.type"/></option>
        </select>


    </label>
    <label style="margin-left: 3px;">
        <fmt:message code="global.lang.date"/>：<input type="text" placeholder="<fmt:message code="doc.th.enterDate"/>"
                  readonly="readonly"
                  onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" name="sendTime" style="margin-right: 5px">
        <a href="javascript:;" class="submit"><fmt:message code="global.lang.query"/></a>
    </label>
</div>
<div id="pagediv">

</div>
<script src="/js/notice/InformTheView.js"></script>
</body>
</html>