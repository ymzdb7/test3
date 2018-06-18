<%--
  Created by IntelliJ IDEA.
  User: 牛江丽
  Date: 2017/9/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="event.th.WorkPlanManagement" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
</head>
<style>
  .navigation{
      margin-left: 3%;
  }
  html,body{
      height:100%;
  }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>


<body style="font-family: 微软雅黑;overflow: hidden;">
<div class="box">
    <%--标题头--%>
    <div class="head w clearfix">
        <ul class="index_head">
            <li data_id=""  url="/workPlan/workPlanManager" >
                <span class="one headli1_1">
                 <fmt:message code="event.th.WorkPlanManagement" />
               </span>
                <img class="headli1_2" src="../../img/twoth.png" alt=""/>
            </li>
            <li data_id="0" url="/workPlan/workPlanEdit?editFlag=0&planId=0"  >
                <span class="headli2_1">
                   <fmt:message code="event.th.NewWorkPlan" />
                </span>
                <img src="../../img/twoth.png" alt="" class="headli2_2"/>
            </li>
            <li data_id="1"  url="/workPlan/workPlanQuery" >
                <span class="headli3_1">
                  <fmt:message code="event.th.WorkPlanQuery" />
               </span>
                <%--<img src="../../img/twoth.png" alt="" class="headli2_2"/>--%>
            </li>

        </ul>
    </div>
</div>
<div class="div_iframe" style="width:100%;height:100%;">
    <iframe class="workPlan_iframe" src="/workPlan/workPlanManager" frameborder="0" width="100%" height="100%"></iframe>
</div>
<script>
    function show(){
        $('.index_head li').eq(0).find('span').addClass('one').parent().siblings().find('span').removeClass('one')
    }
    //标题头操作
    $(function () {
//        var iframeH=$('.box').height()-$('.head').height();
//        $('.div_iframe').height(iframeH);

        /*点击标题，获取对应的url，显示对应的src*/
        $('.index_head').on('click', 'li', function () {
            // 设置样式
            $('.index_head span').removeClass("one")
            $(this).children("span").addClass("one");
            // 获取url
            var url = $(this).attr('url');
            $('.workPlan_iframe').attr('src', url);
        });
    });
</script>
</body>
</html>
