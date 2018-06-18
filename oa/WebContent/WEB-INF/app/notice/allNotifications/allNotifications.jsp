
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
    <title><fmt:message code="notice.title.notify"/></title>
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base/base.css">


    <%--<script src="/js/common/language.js"></script>--%>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>


    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <style>
        .main{
            margin-top:46px;
            width: 100%;
        }

    </style>
</head>
<body>
<div class="head-top">
    <ul class="clearfix">
        <li class="fl head-top-li active" data-type=""><fmt:message code="notice.title.unreadannouncement"/></li>
        <li class="fl head-top-img"><img src="/img/twoth.png" alt=""></li>
        <li class="fl head-top-li" data-type="0"><fmt:message code="notice.title.notify"/></li>
        <li class="fl head-top-img"><img src="/img/twoth.png" alt=""></li>
        <li class="fl head-top-li" data-type="1"><fmt:message code="notice.title.announcementquery"/></li>
    </ul>
</div>
<div class="main">
    <iframe name="notices" src="../../notice/unread" frameborder="0"></iframe>
</div>
<script>
    function addEventHandler(target,type,fn){
        if(target.addEventListener){
            target.addEventListener(type,fn,false);
        }else{
            target.attachEvent("on"+type,fn,false);
        }
    }
    $('.main').height((document.documentElement.clientHeight || document.body.clientHeight)-50)

    addEventHandler(window,'resize',function () {

        $('.main').height((document.documentElement.clientHeight || document.body.clientHeight)-50)

    })
    $('.head-top li').click(function () {
        $(this).siblings('li').removeClass('active')
        $(this).addClass('active')
        if($(this).attr('data-type')==''){
            $('.main').find('iframe').prop('src','../../notice/unread')
        }else if($(this).attr('data-type')=='0'){
            $('.main').find('iframe').prop('src','../../notice/InformTheView')
        }else if($(this).attr('data-type')=='1'){
            $('.main').find('iframe').prop('src','../../notice/queryAll')
        }
    })
</script>
</body>
</html>