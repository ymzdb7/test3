<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/26
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>考勤审批</title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        html,body,.content{
            height:100%;
        }
        .headTop .head{
            border-bottom:0px;
        }
        .head .index_head li span{
            width: 123px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

</head>
<body>
    <div class="headTop">
        <div class="head w clearfix">
            <ul class="index_head">
                <li data_id="0" data-num="0"><span class=" headli1_1 one"><fmt:message code="attend.th.LeaveApproval" /></span><img class="headli1_2" src="../img/twoth.png" alt=""/>
                </li>
                <li data_id="" data-num="1"><span class="headli2_1 "><fmt:message code="attend.th.OutwardAndApproval" /></span><img src="../img/twoth.png" alt="" class="headli2_2"/>
                </li>

                <li data_id="1" data-num="2"><span class="headli3"><fmt:message code="attend.th.BusinessApproval" /></span></li>

            </ul>
        </div>


    </div>
    <div class="content">
        <iframe class="content_iframe" style="width: 100%;height: 100%;" scrolling="no" src="/attendPage/myAttendLeave" >

        </iframe>
    </div>
    



<script>
    var opennew;
    if(parent.opensload!=undefined){
        opennew=parent.opensload;
    }
$(function () {
    $('.headli1_1').click(function () {

  $('.content_iframe').attr("src","/attendPage/myAttendLeave");
        $('.headli1_1').addClass("one")
        $('.headli2_1').removeClass("one")
        $('.headli3').removeClass("one")
    });

    $('.headli2_1').click(function () {
        $('.headli2_1').addClass("one")
        $('.headli1_1').removeClass("one")
        $('.headli3').removeClass("one")

 $('.content_iframe').attr("src","/attendPage/myAttendOut");
    });

    $('.headli3').click(function () {
        $('.headli3').addClass("one")
        $('.headli2_1').removeClass("one")
        $('.headli1_1').removeClass("one")
      $('.content_iframe').attr("src","/attendPage/myAttendEvection");
    });
});




</script>
</body>

</html>
