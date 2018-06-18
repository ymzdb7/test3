<%--
  Created by IntelliJ IDEA.
  User: huangzhijian
  Date: 2017/12/29
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
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
    <title><fmt:message code="dem.th.WageInquiries" /></title>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css" />
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/management_query.css" />
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <!-- word文本编辑器 -->
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>

</head>
<body>
<div class="head w clearfix " style="width:2150px;">
    <ul class="index_head">
        <li data_id="0" url="/salary/wages" data-num="0"><span class="one headli1_1"><fmt:message code="adding.th.EducationalWages" /></span><img class="headli1_2" src="../img/twoth.png" alt=""/>
        </li>

        <li data_id="" url="/salary/bonus" data-num="1"><span class="headli2_1"><fmt:message code="adding.th.EducationalBonus" /></span><img src="../img/twoth.png" alt="" class="headli2_2"/>
        </li>
    </ul>
</div>

<div id="iframebox"style="margin-top: 30px;">
    <iframe src="/salary/wages" frameborder="0" scrolling="no" width="2150px" noresize="noresize"  id="iframes"></iframe>

</div>
<script>
    $('.index_head').on('click','li',function() {
        $('.index_head span').removeClass('one')
        $(this).children('span').addClass('one')
        var url=$(this).attr('url');
        $('#iframes').attr('src',url);

    });

    var ifm= document.getElementById("iframes");

    ifm.height=document.documentElement.clientHeight;
</script>

</body>
</html>
