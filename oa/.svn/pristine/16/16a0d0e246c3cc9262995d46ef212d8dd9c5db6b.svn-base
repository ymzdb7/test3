
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
    <title><fmt:message code="notice.th.notifymanage" /></title>
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base/base.css">
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">
    <script src="/js/common/language.js"></script>

    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/js/base/base.js"></script>
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
    </style>
    <script src="/js/notice/management.js"></script>
</head>
<body>
    <div class="navigation">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/gonggaoguanli.png" alt="">
        <h2><fmt:message code="notice.th.notifymanage" /></h2>
        <label>
            <select name="type">
                <option value="0"><fmt:message code="news.th.type" /></option>
            </select>
            <a href="javascript:;" class="submit"><fmt:message code="global.lang.query" /></a>
        </label>
    </div>
    <div id="pagediv">

    </div>
</body>
</html>