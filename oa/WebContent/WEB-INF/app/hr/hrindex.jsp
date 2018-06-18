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
<head>
    <meta charset="UTF-8">
    <title>人事档案</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" type="text/css" href="../../css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/index.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/style.css"/>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>

    <style>
        html,body{
            height:100%;
        }
        .headli1_1 {
            padding: 0px 10px;
            display: inline-block;
            text-align: center;
        }
        .headli1_2 {
            width: 2px;
            margin-left: 26px;vertical-align: middle;

        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="content" style="overflow:hidden">
    <div class="headDiv">
        <ul class="main_title">
            <li><span class="headli1_1 title_on" url="hrOnJop"><fmt:message code="hr.th.onTheJob" /></span><img class="headli1_2" src="../../img/twoth.png" alt=""></li>
            <li><span class="headli1_1" url="hrLeaveJop"><fmt:message code="hr.th.demission" /></span><img class="headli1_2" src="../../img/twoth.png" alt=""></li>
            <li><span class="headli1_1" url="hrOnFind"><fmt:message code="hr.th.inquiry" /></span><img class="headli1_2" src="../../img/twoth.png" alt=""></li>
            <li><span class="headli1_1" url="hrImportInfo"><fmt:message code="vote.th.Introduction" /></span></li>
           <%-- <li url="hrLeaveFind">未建人事档案管理人事查询</li>--%>
        </ul>
    </div>
    <div   id="smallWindow" style="width:100%;height:93%;">
        <iframe class="cont_frame" src="hrOnJop" frameborder="0" width="100%" height="100%"></iframe>
    </div>

</div>
<script>
    $(function(){
        //$('#department').deptSelect();
        //$('#selectUser').privSelect();
        $.loadSidebar($('#downChild'),0,function (el) {
//            $.loadSidebar(el,30)
            $('#downChild>li>span').css();
        })
        $('.headDiv .main_title').on('click','.headli1_1',function(){
            var url=$(this).attr('url');
            $(this).addClass('title_on');
            $(this).parent().siblings().find('.headli1_1').removeClass('title_on');
            $('.cont_frame').attr('src',url);
        })
    })
</script>
<script src="../../js/sys/userInfor.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>

