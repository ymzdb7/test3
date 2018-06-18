<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title><fmt:message code="doc.th.ReceivingRegistration" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <%--<link rel="stylesheet" href="/lib/pagination/style/pagination.css">--%>
    <link rel="stylesheet" href="/css/base.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/js/document/addresseeRegistrationForm.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

</head>
<body class="bodybG">
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/shouwendengji.png" alt="">
    </div>
    <div class="divTitle">
         <fmt:message code="doc.th.ReceivingRegistration" />
    </div>
</div>


<div class="tableDl clearfix" style="margin-top: 50px;">

</div>
</body>
</html>
