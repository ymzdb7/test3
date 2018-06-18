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
    <title new="<fmt:message code="main.newwork" />" todo="办理工作" ><fmt:message code="roleAuthorization.th.ViewDetails" /></title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8 ? MYOA_CHARSET : htmlspecialchars($HTML_PAGE_CHARSET))?>" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/m_reset.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/new_work.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">
    <link rel="stylesheet" href="../../lib/layui-v2.2.5/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/handle.css"/>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>

    <script src="../../lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="../../lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="../../lib/jquery.jqprint-0.3.js"></script>
    <script type="text/javascript" src="../../lib/jquery-migrate-1.1.0.js"></script>
    <script src="../../js/base/base.js"></script>
    <script src="../../js/mustache.min.js"></script>
    <script src="../../lib/layui-v1.0.9_rls/layui/layui.js"></script>
    <script src="../../js/workflow/work/workform.js"></script>
    <script src="../../lib/jquery.form.min.js"></script>

    <!-- 金格签章 -->

    <link rel="stylesheet" href="../../lib/kinggrid/dialog/artDialog/ui-dialog.css">
    <link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.css">

    <script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.min.js"></script>
    <script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.plus.min.js"></script>
    <script type="text/javascript" src="../../lib/kinggrid/dialog/artDialog/dialog.js"></script>

    <!-- html签章核心JS -->
    <script type="text/javascript" src="../../lib/kinggrid/signature.min.js"></script>
    <!-- PC端附加功能 -->
    <script type="text/javascript" src="../../lib/kinggrid/signature.pc.min.js"></script>
    <%--<!-- 移动端端附加功能 -->--%>
    <%--<link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.mobile.css">--%>
    <%--<script type="text/javascript" src="../../lib/kinggrid/signature.mobile.min.js"></script>--%>
    <!-- 手写端附加功能 -->

    <script type="text/javascript" src="../../lib/kinggrid/signature_pad.min.js"></script>
    <script type="text/javascript" src="../../lib/kinggrid/jquery.timer.dev.js"></script>

</head>
<style type="text/css">
    textarea, input[type="text"], input[type="password"], input[type="datetime"], input[type="datetime-local"], input[type="date"], input[type="month"], input[type="time"], input[type="week"], input[type="number"], input[type="email"], input[type="url"], input[type="search"], input[type="tel"], input[type="color"], .uneditable-input {
        background-color: #ffffff;
        border: 1px solid #cccccc;
        -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        -webkit-transition: border linear .2s, box-shadow linear .2s;
        -moz-transition: border linear .2s, box-shadow linear .2s;
        -o-transition: border linear .2s, box-shadow linear .2s;
        transition: border linear .2s, box-shadow linear .2s;
    }

    select, textarea, input[type="text"], input[type="password"], input[type="datetime"], input[type="datetime-local"], input[type="date"], input[type="month"], input[type="time"], input[type="week"], input[type="number"], input[type="email"], input[type="url"], input[type="search"], input[type="tel"], input[type="color"], .uneditable-input {
        display: inline-block;
        padding: 4px 6px;
        //margin-bottom: 10px;
        font-size: 13px;
        line-height: 20px;
        color: #555555;
        -webkit-border-radius: 4px;
        -moz-border-radius: 4px;
        border-radius: 4px;
        vertical-align: middle;
    }
    input[disabled], select[disabled], textarea[disabled], select[readonly], textarea[readonly] {
        cursor: not-allowed;
        background-color: #eeeeee;
    }
    body{
        font-size: 15px;
    }
    .table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th{
        padding: 5px;
    }
    .hideen{
        display: none;
    }
    .content{
        margin-top: 46px;
        margin-bottom: 52px;
    }
    /*设置原始元素样式*/
    #origin
    {
        margin:100px auto;/*水平居中*/
        width:200px;
        height:100px;
        border:1px dashed gray;
    }
    /*设置当前元素样式*/
    #current
    {
        width:200px;
        height: 28px;
        line-height: 26px;
        color:white;
        background-color: #007BEE;
        text-align:center;
        transform:rotate(0deg);
        -webkit-transform:rotate(0deg);  /*兼容-webkit-引擎浏览器*/
        -moz-transform:rotate(0deg);     /*兼容-moz-引擎浏览器*/
        transition:all 0.5s ease-in-out;

    }
    #current:hover{
        transform: rotate(360deg);
        -webkit-transform:rotate(360deg) ;
        -moz-transform:rotate(360deg) ;
    }
    .feedbacktitle{
        position: relative;
        top:3px;
        font-weight: bold;
        margin-left: 10px;
    }
    .feedbackcontent{
        margin-left: 23px;
    }
    .backinfo{
        width:100%;
        height: 100px;
    }
    .cont{
        position: relative;
    }
    .downloadBtn{
        cursor: pointer;
        margin-left: 10px;
        display: inline-block;
    }
    .deletefileBtn{
        color:#e01919!important;
        cursor: pointer;
        margin-left: 10px;
        display: inline-block;
    }
    .previewBtn{
        cursor: pointer;
        display: inline-block;
    }
    .editBtn{
        cursor: pointer;
        margin-left: 10px;
        display: inline-block;
    }
    #tab_c{
        width: 300px;
        height: 86%;
        /* display: none; */
        top: 43px;
        right: -316px;
        bottom: 0;
        position: fixed;
        background: #f8f8f8;
        overflow-y: scroll;
        box-shadow: -2px 0 20px 0px #c4c4c4;
        top: 47px;
        z-index: 22;
    }
    #tab_c,.cont_form{
        float:left;
    }
    .tab_one,#tab_ctwo{
        width:100%;
        height:100%;
    }
    .cont_ctwo{
        width:100%;
        height:100%;
    }
    .cont_cone{
        width:100%;
        height:auto;
    }
    .tab_one{
        width:100%;
        height: 200%;
    }
    .cont_cone li{
        width: 90%;
        height:56px;
        margin:10px auto;
        border: 1px solid #cccccc;
        border-radius: 3px;
        background: #fff;
    }

    .one_all,.two_all{
        width:100%;
        min-height:330px;
    }
    .one_all{
        border-bottom: 1px solid #ccc;
    }
    #tab_ctwo ul{
        width:100%;
        height:100%;
        display:none;
    }
    .item_logo,.item_word{
        float:left;
    }
    .item_logo{
        width: 40px;
        height: 40px;
        margin-left: 8px;
        margin-top: 8px;
    }
    .item_word{
        margin-top: 15px;
        margin-left: 8px;
        width: 165px;

    }
    .item_word .item_wordH1{
        text-align: left;
        color: #292929;
        font-size: 10pt;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }
    .item_wordH1:hover{
        color: #1772c0;
    }
    .item_wordH2{
        font-size: 9pt;
        color: #1772c0;
        text-align: left;
        float: left;
        margin-left: 10px;
    }
    .position{
        position: absolute;
        right: 14px;
        top: 12px;
        clear: both;
    }
    .fujian_logo,.fujian_h1,.huiqian_logo,.huiqian_h1{
        float: left;

    }
    .fujian_logo{
        margin-top: 14px;
        width: 18px;
    }
    .huiqian_logo{
        margin-top: 15px;
        width: 14px;
    }
    .fujian_h1,.huiqian_h1{
        margin-left: 10px;
        font-size: 12pt;
        margin-top: 3px;
    }
    .huiqian_h1{
        line-height: 33px;
        font-weight: bold;
        font-size: 11pt;
        margin-top: 6px;
    }
    .add_fujian{
        margin: 0 auto;
        width: 90%;
        height: 30px;
        border-radius: 3px;
        background: #458de5;
        color: #fff;
        text-align: center;
        line-height: 30px;
        outline: none;
        margin-left: 13px;
        border: 1px solid #458de5;
    }
    .cont_ctwo li{
        width: 90%;
        height: 105px;
        border-radius: 3px;
        margin: auto;
        border:1px solid #cccccc;
        margin-top: 10px;
        background: #fff;
    }
    .huiqian_inp,.huiqian_send{
        float:left;
    }
    .hui_inp{
        width: 81% !important;
        margin-left: -56px !important;
    }
    .huiqian_inp{
        text-indent: 5px;
        width: 68%;
        height: 30px;
        border-radius: 3px;
        border: none;
        outline: none;
        text-align: left;
        border: 1px solid #cccccc;
        margin-left: 0px;
    }
    .huiqian_send{
        width: 58px;
        height: 32px;
        background: #ff9b30;
        color: #fff;
        margin-left: 210px;
        outline: none;
        border-radius: 3px;
        border: 1px solid #ff9b30;
    }
    .huiqian_word{
        height:100%;
        margin-left: 12px;
        text-align: left;
    }
    .huiqian_word h1{
        margin-top: 10px;
    }
    .huiqian_word .h2s{
        color: #999;
        word-spacing: 0;
    }
    .huiqian_touxiang{
        margin-left: 8px;
    }
    .huiqian_touxiang,.huiqian_word{
        float: left;
    }
    .huiqian_word h3{
        overflow: hidden;/*内容超出后隐藏*/
        text-overflow: ellipsis;/* 超出内容显示为省略号*/
        white-space: nowrap;/*文本不进行换行*/

    }
    .huiqian_touxiang{
        width: 40px;
        height: 40px;
    }
    .layui-layer-page .layui-layer-content {
        overflow-x: hidden !important;
    }

    .head{
        background: linear-gradient(to bottom,#196fe3,#2497e0);
        FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0, startColorStr=#196fe3, endColorStr=#2497e0);
        background: -ms-linear-gradient(top, #196fe3, #2497e0);
        background: -moz-linear-gradient(top, #196fe3, #2497e0);
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#196fe3), to(#2497e0));
        background: -webkit-linear-gradient(top, #196fe3, #2497e0);
        background: -o-linear-gradient(top, #196fe3, #2497e0);
    }
    .step,.num{
        color: #fff;
    }
    .abs_right ul{
        background: #fff;
    }
    .fujian a, .huiqian a{
        font-weight: 300;
    }
    #tab_t ul li{
        font-weight: 300;
    }

    .check{
        background: #5caeee;
    }

    /*.choose{
       color:#fff;
        background:#4889f0 !important;
    }*/
    #remind_name,#jingban{
        height: 20px !important;
    }
    .workflow-node {
        padding: 0px !important;
    }
    .prcsName{
        font-size: 14px;
        border: 1px solid #3691da;
        color: #3691da;
        margin-bottom: 10px;
        width: 100%;
        height: 35px;
        background: url("../../../img/workflow/work/add_work/uncheck.png") no-repeat 20px center;
    }
    .prcsName h1 {
        text-align: center;
        line-height: 35px;
    }
    .prcsName_chang{
        border: none;
        color:#fff;
        background: #3691da  url("../../../img/workflow/work/add_work/checked.png") no-repeat 20px center;
    }
    .fujian a,.huiqian a{
        width: 70px;
        height: 28px;
        display: block;
        text-decoration: none;
    }
    .top_one{
        position: absolute;
        top: 0px;
    }
    .top_two{
        position: absolute;
        top: 696px;
    }
    #tab_c{
        transition: all 1s ease 0s;
    }
    .list_table{
        border-width: medium;
        border-style: none;
        border-color: initial;
        border-collapse: collapse;
        word-wrap: break-word;
        table-layout: fixed;
    }
    .list_table .head {
        font-weight: 600;
    }
    .list_table td{
        border-bottom: #7F7F7F 1pt solid;
        /* border-left: #000000 2.25pt solid; */
        text-align: center;
    //width: 50px;
        padding-bottom: 1px;
        padding-left: 1px;
        padding-right: 1px;
        vertical-align: middle;
        border-top: #7F7F7F 1pt solid;
        border-right: black 1pt solid;
        padding-top: 1px;
        padding: 0;
    }
    .modal-body{
        overflow-y: hidden;
        max-height: 836px !important;
    }
    .layui-layer-btn-{
        border-top: 1px solid #d6d6d6;
        background-color: #f6f6f6;
    }
    .layui-layer-title{
        color: #fff;
        font-size: 16px;
        font-family: '微软雅黑';
        background:linear-gradient(to bottom,#2077c6,#2495df);
        FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0, startColorStr=#2077c6, endColorStr=#2495df);
        background: -ms-linear-gradient(top, #2077c6, #2495df);        /* IE 10 */
        background:-moz-linear-gradient(top, #2077c6, #2495df);/*火狐*/
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#2077c6), to(#2495df));  /* Safari 4-5, Chrome 1-9*/
        background: -webkit-linear-gradient(top, #2077c6, #2495df);   /*Safari5.1 Chrome 10+*/
        background: -o-linear-gradient(top, #2077c6, #2495df);  /*Opera 11.10+*/
    linear-gradient(to bottom, hsl(0, 80%, 70%), #2077c6); /* Standard syntax; must be last */
    }
    .orgAdd{
        display: inline-block;
        margin-top: 10px;
        cursor: pointer;
    }
    .orgClear{ cursor: pointer;}
    .userSelectBtn{
        background: url(../../img/userSelectBtn.png) no-repeat -3px -2px;
        width: 98px!important;
        height: 88px;
        cursor: pointer;
        margin-left: 15px;
        padding: 0;
        border-width: 1px;
        border-style: solid;
        border-radius: 4px;
        margin-top: 10px;
    }
    .userSelectBtn:hover {
        background: url(../../img/userSelectBtnhover.png) no-repeat -3px -2px;
    }
    .tabAB{
        float: left;
        position: absolute;
        background-color: #fff;
        margin-left:50%;
        width:140px;
        height:28px;
        margin-top:8px;
        display: none;
        border-radius: 6px;
    }
    .tabAB ul{
        width: 141px;
        height: 28px;
        border: 1px solid #fff;
        border-radius: 5px;
        background: #fff;
    }
    .tabAB ul li{
        height: 28px;
        line-height: 28px;
        width: 70px;
        color: #4889f0;
        cursor: pointer;
        text-align: center;
        border-radius: 5px;
    }
    .tabAB ul li.active{
        background: #4889f0;
        color: #fff;
    }
    .tabAB ul li:hover{
        background: #4889f0 ;
        color:#fff;
    }
    .clearfix:after{
        clear: both;
        display: block;
        content: '';
    }
    .fl{
        float: left;
    }
    .fr{
        float: right;
    }
    .officialDocument{
        width: 100%;
        height: 99%;
    }
    .officialDocumentLeft{
        width: 15%;
        float: left;
        border: 1px solid #4889f0;
        min-height: 400px;
        border-radius: 4px;
        margin-left:1%;
    }
    .officialDocumentLeft li{
        height: 50px;
        line-height: 49px;
        font-size: 14pt;
        text-align: center;
        font-weight: bold;
    }
    .officialDocumentLeft li:hover{
        background: #4889f0;
        color: #fff;
        cursor: pointer;
    }
    .officialDocumentLeft li.active{
        background: #4889f0;
        color: #fff;
    }
    .officialDocumentRight{
        width: 80%;
        border: 1px solid #4889f0;
        min-height: 400px;
        border-radius: 4px;
        float: right;
        margin-right:2%;
    }


    .wrap{
        width:100%;
        height:100%;
        float: left;
        clear:both;
    }
    .left_side,.right_side{
        float: left;
    }
    .left_side {
        width: 15%;
        height: 100%;
        background: #eff5f2;
    }
    .right_side{
        width:84%;
    }
    .btn {
        height: 36px;
        margin: auto;
        margin-top: 16px;
        line-height: 36px;
        color: #fff;
        text-align: center;
        cursor: pointer;
    }
    .big_btn{
        width: 70%;
        border: 1px solid rgb(5, 88, 197);
        background: #047dca;
    }
    .small_btn{
        width:40%;
        background: #fe3131;
        border:1px solid #D91600;
    }
    #EnterRevisionMode{
        width:100%;
        height:100%;
    }
    #EnterRevisionMode option{
        height: 36px;
    }
    .tipmsg{
        float: left;
        position: absolute;
        margin-left: 89px;
        margin-top: 27px;
        color: red;
        font-size: 11px;
    }
    .sms-bg-static{
        background: #d2d2d2 url("/img/images/sms-static.png") no-repeat left center;
    }
    .sms-bg-static.active{
        background: #3691da url(/img/images/sms.png) no-repeat left center;
    }
    .email-bg-static{
        background: #d2d2d2 url(/img/images/email-static.png) no-repeat left center;
    }
    .email-bg-static.active{
        background: #3691da url(/img/images/email.png) no-repeat left center;
    }

    .floatRight{
        position: absolute;
        top: -67px;
        width: 100px;
        height: 55px;
        border: 1px solid #ccc;

    }
    .foot_rig ul li{
        color: #333;
    }
    .foot_rig ul li:hover{
        color: #fff;
    }
    #fenxiang{
        border-radius: inherit;
        background: url(/img/workflow/work/share.png)-3px -2px no-repeat;
    }
    #fenxiang:hover{
        color: #fff;
        background: url(/img/workflow/work/share2.png)-3px -2px no-repeat;
    }
    #guidang{
        border-radius: inherit;
        background: url(/img/workflow/work/guina.png)-3px -2px no-repeat;
    }
    #guidang:hover{
        color: #fff;
        background: url(/img/workflow/work/guina1.png)-3px -2px no-repeat;
    }
    #daochu{
        border-radius: inherit;
        background: url(/img/workflow/work/guina.png)-3px -2px no-repeat;
    }
    #daochu:hover{
        color: #fff;
        background: url(/img/workflow/work/guina1.png)-3px -2px no-repeat;
    }
    .foot_rig .floatRight>li{
        width: 100%;
        height: 28px;
    }
    .hide{display: none;}
    .show{ display: block;}
    .turnboxselect{
        margin-top: -20px;
    }
    .turnboxselectli{
        padding: 18px;
    }
    .workflow-node-result{
        border: none;
        width: 80%;
        height: auto
    }
    .work-prcs-content{
        border: none;
    }
    .work-prcs-title,.work-msg-title{
        background-color: #d6e7f8;
        color: #023964;
        font-size: 14px;
        position: relative;
    }
    .workflow-procs-nodes-wrap{
        width: 170px;
        margin-left: 30px;
    }
    .spantitles{
        position: absolute;
        width: 81px;
        bottom: 2px;
        left: 32px;
        color: #fff;
        font-size: 16px;
        margin-left: 0;
    }
    .user-tags{
        background: #fff;
    }
    a{
        color: #333;
    }
    .users-select-block{
        margin-top: 10px;
        margin-bottom: 10px;
    }
    .cytitle{
        position: absolute;
        left: 140px;
        font-size: 14px;
        color: #023964;
        top: 30px;
        width:190px;
    }
    .work-msg-op-title{
        font-size: 14px;
        color: #023964;
        width: 266px;
        position: relative;
        margin: 5px 0px 5px 0px;
    }
    .sms-check, .email-check, .mobile-check{
        width: 88px;
        height: 30px;
    }
    .gjtitles{
        height: 30px;
        position: absolute;
        line-height: 30px;
    }
    .xuanzhong{
        cursor: pointer;
        position: absolute;
        left: 93px;
        top: 5px;
        color: #666666;
    }
    .xuanzhong1{
        left: 193px;
    }
    .xuanzhongactive{
        color: #fff;
    }
    .fujian a, .huiqian a{
        color: #4889f0;
    }
    .rig_h1onexiayibu {
        background: url(/img/workflow/work/zhuanjiao1.png) no-repeat;
        color: #fff!important;
        width: 100px!important;
    }
    .rig_h1onexiayibu:hover {
        background: url(/img/workflow/work/zhuanjiao2.png) no-repeat;
    }
    .saveformlo{
        width: 75px!important;
    }
    #goback{
        height: 30px;
        color: #333;
        background: url(/img/workflow/work/back.png) no-repeat;
    }
    #goback:hover{
        color: #fff;
        background: url(/img/workflow/work/back2.png) no-repeat;
    }
    #goback h1{
        width: 90px;
    }
    #saveform{
        height: 30px;
        color: #333;
        background: url(/img/workflow/work/save.png) no-repeat;
    }
    #saveform:hover{
        background: url(/img/workflow/work/save2.png) no-repeat;
        color: #fff;
    }
    #saveformback{
        height: 30px;
        color: #333;
        width: 104px!important;
        background: url(/img/workflow/work/saveback.png) no-repeat;
    }
    #saveformback:hover{
        background: url(/img/workflow/work/saveback2.png) no-repeat;
        color: #fff;
    }
    #saveformback h1{
        width: 80px;
        margin-left: 22px;
    }
    #cancleBtn{
        height: 30px;
        color: #333;
        width:74px!important;
        background: url(/img/workflow/work/close.png) no-repeat;
    }
    #cancleBtn{
        width: 73px!important;
    }
    #cancleBtn:hover{
        background: url(/img/workflow/work/close2.png) no-repeat;
        color: #fff;
    }
    #cancleBtn h1{
        width: 90px;
    }
    #more {
        z-index: 23;
        height: 30px;
        color: #333;
        width: 104px!important;
        background: url(/img/workflow/work/more.png) no-repeat;
    }
    #more:hover{
        background: url(/img/workflow/work/more2.png) no-repeat;
        color: #fff;
    }
    #more h1{
        width: 80px;
        margin-left: 22px;
    }
    .zhuanjiao{
        height: 30px!important;
    }
    .rig_h1{
        font-size: 14px;
        height: 30px;
        line-height: 30px;
    }
    #saveform1{
        height: 30px;
        color: #333;
        background: url(/img/workflow/work/save.png) no-repeat;
    }
    #saveform1:hover{
        color: #fff;
        background: url(/img/workflow/work/save2.png) no-repeat;
    }
    #saveformback1{
        height: 30px;
        color:#333;
        width: 104px!important;
        background: url(/img/workflow/work/saveback.png) no-repeat;
    }
    #saveformback1:hover{
        color: #fff;
        background: url(/img/workflow/work/saveback2.png) no-repeat;
    }
    #saveformback1 h1{
        width: 80px;
        margin-left: 22px;
    }
    #cancleBtn1{
        height: 30px;
        width:74px!important;
        color: #333;
        background: url(/img/workflow/work/close.png) no-repeat;
    }
    #cancleBtn1{
        width: 74px!important;
    }
    #cancleBtn1:hover{
        color: #fff;
        background: url(/img/workflow/work/close2.png) no-repeat;
    }
    #cancleBtn1 h1{
        width: 90px;
    }

    #cancleBtn{
        width: 75px!important;
    }
    #flowImg{
        border: 1px solid #eaeaea;
    }
    #print{
        border: 1px solid #eaeaea;
    }
    #attach_name{
        border: 1px solid #eaeaea;
    }
    #flowImg:hover{
        border: 1px solid #4889f0;
        background: #fff;
    }
    #print:hover{
        border: 1px solid #4889f0;
        background: #fff;
    }
    #attach_name:hover{
        border: 1px solid #4889f0;
        background: #fff;
    }
    .item_logo img{
        width: 40px;
    }
    #oneUploadFile li:last-child{
        margin-bottom: 24px;
    }
    /*定义滚动条宽高及背景，宽高分别对应横竖滚动条的尺寸*/
    /*公告*/
    #tab_c::-webkit-scrollbar,.people_wenjian::-webkit-scrollbar{
        width: 3px;
        height: 16px;
        background-color: #f8f8f8;
    }
    /*定义滚动条的轨道，内阴影及圆角*/
    #tab_c::-webkit-scrollbar-track,.people_wenjian::-webkit-scrollbar-track{
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        border-radius: 10px;
        background-color: #f8f8f8;
    }
    /*定义滑块，内阴影及圆角*/
    #tab_c::-webkit-scrollbar-thumb,.people_wenjian::-webkit-scrollbar-thumb{
        width: 0px;
        height: 20px;
        border-radius: 10px;
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        background-color: #bbb;
    }
    body::-webkit-scrollbar,.people_wenjian::-webkit-scrollbar{
        width: 0px;
        height: 16px;
        background-color: #f5f5f5;
    }
    /*定义滚动条的轨道，内阴影及圆角*/
    body::-webkit-scrollbar-track,.people_wenjian::-webkit-scrollbar-track{
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        border-radius: 10px;
        background-color: #f5f5f5;
    }
    /*定义滑块，内阴影及圆角*/
    body::-webkit-scrollbar-thumb,.people_wenjian::-webkit-scrollbar-thumb{
        width: 0px;
        height: 20px;
        border-radius: 10px;
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        background-color: #555;
    }
    #oneUploadFile{
        min-height: 199px;
    }
    .cesdiv{
        height: 35px;
        width: 100%;
        display: inline-block;
        word-wrap: break-word;
        overflow: hidden;
        font-size: 13px;
        margin-top: 5px;
        line-height: 18px;
    }
    .layui-row ul li{
        cursor: pointer;
        padding: 3px 5px;
    }
</style>
<script>

</script>
<body >
<div id="tab_c">
    <div class="tab_one">
        <div class="one_all" id="fu">
            <ul class="cont_cone" style="position: relative">
                <li style="height:33px;line-height: 33px;position:relative;border:none;background: #f8f8f8;margin-top: 0;"><img class="fujian_logo" src="../../img/workflow/work/add_work/black1.png"><h1 class="fujian_h1" style="font-weight: bold;  font-size: 11pt;margin-top: 6px;"><fmt:message code="email.th.file" /></h1></li>
                <li id="img_none" style="background: #f8f8f8;width:100%;height:199px;text-align: center;line-height:32px;margin: 0px;border: none;"><img src="/img/workflow/work/add_work/img_nomessage_03.png" alt="" style="margin-top: 16px;">
                    <span style="display: block;color: #666;"><fmt:message code="main.th.Enclosure" /></span>
                </li>
                <div class="position backbtn"><img src="../../img/workflow/work/add_work/back.png"></div>
                <div id="oneUploadFile"></div>
            </ul>
            <div style="position: relative;height: 15%;margin-bottom: 24px;margin-top: 24px;">
                <span style="display: inline-block;cursor: pointer;" class="add_fujian" id="add_fujian"><fmt:message code="email.th.addfile" /></span>
                <form id="uploadimgform" target="uploadiframe" action="workUpload?module=workflow" enctype="multipart/form-data" method="post" >
                    <input type="file" multiple="multiple" name="file" id="uploadinputimg" class="w-icon5" style="top: 0;position: absolute;width: 90%;height: 30px;opacity: 0;display: inline-block;z-index: 9999;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0);color: #fff; margin: auto;margin-left: 15px;line-height: 30px;outline: none;">
                    <input type="hidden" id="uprunId" name="runId">
                </form>
            </div>
        </div>
        <div class="two_all" id="hui">
            <ul class="cont_ctwo" style="position: relative">
                <li style="margin-top: 0;height:33px;border: none;background: #f8f8f8"><img class="huiqian_logo" src="../../img/workflow/work/add_work/huiqian1.png" style="height: 18px;width: 18px;margin-top: 13px;"><h1 class="huiqian_h1"><fmt:message code="workflow.th.JointlySign" /></h1></li><div class="position backbtn"><img src="../../img/workflow/work/add_work/back.png"></div>
                <li style="height:33px;border: none;position: relative;margin-top: 12px;background: #f8f8f8;"><input type="text" id="signText" class="huiqian_inp hui_inp" style="position: absolute;height:24px;left: 56px;width: 187px!important;"><button class="huiqian_send" id="signSendBtn"><fmt:message code="diary.th.remand" /></button></li>
                <div id="signbox">
                    <li style="background: #f8f8f8;width:100%;height:199px;text-align: center;line-height:32px;margin: 0px;border: none;">
                        <img src="/img/workflow/work/add_work/img_nomessage_03.png" alt="" style="margin-top: 16px;">
                        <span style="display: block;color: #666;"> <fmt:message code="main.th.Opinion"/></span>
                    </li>
                </div>
            </ul>
        </div>

    </div>
    <div id="tab_ctwo">
        <ul class="cont_cthr" style="overflow: hidden;">
            <iframe frameborder="0" width="100%" height="100%" marginheight="0" marginwidth="0" scrolling="no" src=""></iframe>
        </ul>
        <ul class="cont_cfour" style="display: block;position: relative;">
            <li style="height:33px;line-height: 33px;position:relative;border:none;background: #f8f8f8;margin-top: 0;width:  90%;margin: 0 auto;"><img class="fujian_logo" src="../../img/workflow/work/add_work/guanlian.png"><h1 class="fujian_h1" style="font-weight: bold;  font-size: 11pt;margin-top: 6px;"><fmt:message code="document.th.Relation" /></h1></li>
            <div class="position backbtn"><img src="../../img/workflow/work/add_work/back.png"></div>
            <li style="background: #f8f8f8;width:100%;height:199px;text-align: center;line-height:32px;margin: 0px;margin-top: 46px;border: none;">
                <img src="/img/workflow/work/add_work/img_nomessage_03.png" alt="" style="margin-top: 16px;">
                <span style="display: block;color: #666;"><fmt:message code="main.th.AssociationData" /></span>
            </li>
        </ul>
    </div>

</div>
<div class="body" style="display: none;height: 500px;">
    <div class="head" style="    position: fixed;z-index: 9999;top: 0px;">
        <div id="title" class="abs_left">
            <h1 class="num"></h1>
            <h2 class="step hideen"></h2>
            <select class="opt hideen" id="level" style="float: left">
                <option value="0"><fmt:message code="sup.th.ordinary" /></option>
                <option value="1"><fmt:message code="sup.th.urgent" /></option>
            </select>
            <div class="tabAB">
                <ul class="clearfix">
                    <li class="fl active" data-id="1" ><fmt:message code="workflow.th.form" /></li>
                    <li class="fl" style="margin-left: 1px" data-id="2" ><fmt:message code="main.th.text" /></li>
                </ul>
            </div>
        </div>

        <div id="tab_t" class="abs_right">
            <ul>
                <li class="fujian"><a  href="#fu"><fmt:message code="email.th.file" /></a></li>
                <li class="huiqian" ><a  href="#hui"><fmt:message code="document.th.JointlySign" /></a></li>
                <li class="liucheng"><fmt:message code="doc.th.TechnologicalProcess" /></li>
                <li class="guanlian" style="border-right: none"><fmt:message code="document.th.Relation" /></li>
            </ul>
        </div>
    </div>
    <div class="content" style="height: 100%;">
        <div class="cont" id="client">
            <div class="cont_form" id="a2" style="float: none;">
            </div>
            <div class="officialDocument clearfix" style="display: none">
                <iframe id="zw" name="zw" src="" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe>
            </div>
            <div style="width: 100%;height: 52px;"></div>
        </div>
        <div class="foot">
            <div class="foot_left">
                <ul>
                    <li class="left_li" id="flowImg" style="width: 89px;"><img class="left_img" style="margin-top: 7px;" src="../../img/workflow/work/add_work/sheji.png"><h1 class="left_h1" style="font-weight: 300;"><fmt:message code="workflow.th.chart" /></h1></li>
                    <%--  <li class="left_li"><img class="left_img" src="../../img/workflow/work/add_work/weituo.png"><h1 class="left_h1">委托</h1></li>--%>
                    <li class="left_li" id="print" style="width: 60px;"><img class="left_img" src="../../img/workflow/work/add_work/print.png"><h1 class="left_h1" style="font-weight: 300;"><fmt:message code="global.lang.print" /></h1></li>
                    <li class="left_li" id="attach_name" style="margin-left: 16px;"><img class="left_img" src="../../img/workflow/work/add_work/lan.png"><h1 class="left_h1" style="font-weight: 300;"><fmt:message code="email.th.file" /></h1></li>
                </ul>
            </div>
            <div class="foot_rig" id="foot_rig" >
                <ul>
                    <li class="rig_li more baocunfanhui"  id="more" style="position: relative">
                        <ul class="floatRight" style="position: absolute;display: none;background-color: #fff;">
                            <%--<li id="fenxiang" style="width: 100%!important;"><h1 class="rig_h1 rig_h1one" ><fmt:message code="adding.th.sort" /></h1></li>--%>
                            <li id="guidang" style="width: 100%!important;"><h1 class="rig_h1 rig_h1one" ><fmt:message code="workflow.th.File" /></h1></li>
                            <li id="daochu" style="width: 100%!important;"><h1 class="rig_h1 rig_h1one" ><fmt:message code="global.lang.report" /></h1></li>
                        </ul>

                        <h1 class="rig_h1 rig_h1one" ><fmt:message code="adding.th.more" /></h1></li>
                    <li class="rig_li saveformlo" id="cancleBtn"><h1 class="rig_h1" ><fmt:message code="notice.th.return" /></h1></li>
                    <li class="rig_li baocunfanhui" id="saveformback"><h1 class="rig_h1" ><fmt:message code="main.th.SaveReturn" /></h1></li>
                    <li class="rig_li saveformlo" id="saveform"><h1 class="rig_h1" style="width: 90px;"><fmt:message code="global.lang.save" /></h1></li>
                    <li class="rig_li hideen saveformlo" id="goback"><h1 class="rig_h1 "><fmt:message code="document.th.Fallback" /></h1></li>
                    <li class="rig_li zhuanjiao rig_h1onexiayibu"><h1 class="rig_h1" style="width: 82px;margin-left: 20px;"><fmt:message code="document.th.nextStep" /></h1></li>
                </ul>
            </div>

            <div class="foot_rig" id="foot_rig1" style="display: none">
                <ul>
                    <li class="rig_li saveformlo" id="cancleBtn1"><h1 class="rig_h1"><fmt:message code="depatement.th.quxiao" /></h1></li>
                    <li class="rig_li baocunfanhui" id="saveformback1"><h1 class="rig_h1" ><fmt:message code="main.th.SaveReturn" /></h1></li>
                    <li class="rig_li saveformlo" id="saveform1" style="width: 74px!important;"><h1 class="rig_h1" style="width: 90px;"><fmt:message code="global.lang.save" /></h1></li>
                    <li class="rig_li rig_h1onexiayibu" id="finish" style="height: 30px"><h1 class="rig_h1" style="width: 82px;margin-left: 20px;"><fmt:message code="workflow.th.FinishedProcessing" /></h1></li>
                </ul>
            </div>

        </div>
    </div>
    <div id="printdiv">
    </div>

    <div id="readcommentstpl" class="layui-fluid layui-form " style="display:none;">
        <div class="layui-row layui-rows">
            <div class="layui-col-md12">
                <fieldset class="layui-elem-field layui-field-title" style="margin: 0;">
                    <legend style="display: inline-block;width: 5em;border: 0;margin-bottom: 0;"> [送]方式</legend>
                </fieldset>

                <ul class="fl clearfix" style="padding-left: 35px;box-sizing: border-box;">
                    <li class="layui-badge" style="margin: 5px">请</li>
                    <li class="layui-badge" style="margin: 5px">送</li>
                    <li class="layui-badge" style="margin: 5px">拟请</li>
                    <li class="layui-badge" style="margin: 5px">转</li>
                    <li class="layui-badge" style="margin: 5px">有请</li>
                    <li class="layui-badge" style="margin: 5px">请各位领导</li>

                </ul>
            </div>
        </div>
        <div class="layui-row layui-rows" style="padding-top: 22px;">
            <fieldset class="layui-elem-field layui-field-title" style="margin: 0;">
                <legend style="display: inline-block;width: 9em;border: 0;margin-bottom: 0;">请选择部门和人员</legend>
            </fieldset>

            <div class="layui-col-md12">

                <select name="" class="select1" id="select11" style="vertical-align: middle;width: 29%;    margin-left: 35px; margin-right: 10%;" num="1">
                    <option value="">请选择部门</option>

                </select>
                <select name="" id="select2" style="vertical-align: middle;width: 29%;" num="2">
                    <option value="">请选择人员</option>

                </select>
            </div>

        </div>
        <div class="layui-row layui-rows">
            <div class="layui-col-md12">
                <fieldset class="layui-elem-field layui-field-title" style="margin:0">
                    <legend style="display: inline-block;width: 5em;border: 0;margin-bottom: 0;">处理方式</legend>
                </fieldset>

                <ul class="fl clearfix" style="padding-left: 35px;box-sizing: border-box;">
                    <li class="layui-badge" style="margin: 5px">办理</li>
                    <li class="layui-badge" style="margin: 5px">已阅</li>
                    <li class="layui-badge" style="margin: 5px">阅示</li>
                    <li class="layui-badge" style="margin: 5px">阅</li>
                    <li class="layui-badge" style="margin: 5px">提出意见</li>
                    <li class="layui-badge" style="margin: 5px">批示</li>
                    <li class="layui-badge" style="margin: 5px">协办</li>
                    <li class="layui-badge" style="margin: 5px">研酌</li>
                    <li class="layui-badge" style="margin: 5px">同意</li>
                    <li class="layui-badge" style="margin: 5px">不同意</li>
                    <li class="layui-badge" style="margin: 5px">研阅</li>
                    <li class="layui-badge" style="margin: 5px">复印</li>
                </ul>
            </div>


        </div>
        <div class="centertion" style="width:100%;margin-left: 35px;margin-top: 10px; box-sizing: border-box">
            <textarea name="" id="" cols="30" rows="5" style="width: 84%;"></textarea>
        </div>
    </div>
    <script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>
    <script>
        //控制高度
        layer.load();

        $.ajax({
            url: "../../department/getAlldept",
            type: 'get',
            data: {},
            dataType: 'json',
            success: function (obj) {
                var data = obj.obj;
                departmentData = digui(data, 0);
                var str = departmentChild(departmentData, '<option value="-1">请选择部门</option>', 0, -1);
                $('#select11').html(str);
            },
            error: function () {
            }
        });
        //autodivheight();
        $('.body').show()
        function autodivheight(){
            var winHeight=0;
            if (window.innerHeight)
                winHeight = window.innerHeight;
            else if ((document.body) && (document.body.clientHeight))
                winHeight = document.body.clientHeight;
            if (document.documentElement && document.documentElement.clientHeight)
                winHeight = document.documentElement.clientHeight;
            winWidth = document.documentElement.clientWidth;
            document.getElementById("client").style.height= winHeight - 95 +"px";
        }

        function openFiledaochu(text) {

            $.post('/rmsFile/createFormHtml',{
                htmlContent:text,
                typeFlag:2
            },function (json) {
                if(json.flag){
                    window.open('/download?'+json.object.attUrl)
                }
            },'json')
        }
        //window.onresize=autodivheight;
    </script>
    <script>
        var globalData = {};
        var flowrunId=null;
        var eventas=null;
        function openFile(a) {
            $.post('/rmsFile/createFormHtml',{htmlContent:a,typeFlag:1},function (json) {
                if(json.flag){
                    $('#ifDiv').remove();
                    window.open('/rmsFile/toAdd?aid='+json.object.aid);
                }
            },'json')
        }

        window.onresize = function(){
            $('#tab_c').css('height',$('body').height()-52);
        }

        $(function(){
            // 更多操作 归档
            $('#guidang').click(function () {
                var $url=window.location.href.split('?')[1];
                var $html=$('<div id="ifDiv" style="display:none;">' +
                    '<iframe src="/workflow/work/workformPreView?'+$url+'" frameborder="0"></iframe>' +
                    '</div>')
                $('body').append($html)
                var l = $('#ifDiv iframe'),a=null;
                var f = setInterval(function(){
                    try{
                        a = l.contents().find("#client").html();

                    }catch(i){

                        clearInterval(f);
                    }
                    if(a){
                        clearInterval(f);
                        openFile(a)
                    }
                },300);
            });

            // 更多操作-导出
            $('#daochu').click(function () {
                var $url=window.location.href.split('?')[1];
                var $html=$('<div id="ifDiv" style="display:none;">' +
                    '<iframe src="/workflow/work/workformPreView?'+$url+'" frameborder="0"></iframe>' +
                    '</div>')
                $('body').append($html)
                var l = $('#ifDiv iframe'),a=null;
                var f = setInterval(function(){
                    try{
                        a = l.contents().find("#client").html();

                    }catch(i){
//                        console.log("存在跨域", i);
                        clearInterval(f);
                    }
                    if(a){
                        clearInterval(f);
                        openFiledaochu(a)
                    }
                },300);

            });
            // domain;
            var flowId = $.getQueryString("flowId");
            $('.cont_cthr').find('iframe').prop('src','/flowSetting/processDesignToolsT?type=2&flowId='+flowId)
            var flowStep = $.getQueryString("flowStep") || '';
            var prcsId = $.getQueryString("prcsId") || '';
            var runId = $.getQueryString("runId") || '';
            var type = $.getQueryString("type") || '';
            var tableName = $.getQueryString("tableName") || '';
            var tabId =  $.getQueryString("tabId") || '';
            var isNomalType =  $.getQueryString("isNomalType") || '';
            var opflag =  $.getQueryString("opflag") || '';

            var iconImgType = {
                txt : '/img/workflow/work/txt.png',
                jpg : '../../img/icon_image.png',
                png : '../../img/icon_image.png',
                pdf :  '/img/workflow/work/pdf.png',
                ppt : '/img/workflow/work/ppt.png',
                pptx :  '/img/workflow/work/ppt.png',
                doc : '/img/workflow/work/doc.png',
                docx : '/img/workflow/work/doc.png',
                xls :  '/img/workflow/work/xls.png',
                xlsx :  '/img/workflow/work/xls.png',
                rar: '/img/workflow/work/rar.png',
                zip: '/img/workflow/work/zip.png',
                html: '/img/workflow/work/html.png',
                xmind: '/img/workflow/work/xmind.png'
            }
            if(parent.opener && parent.opener.huiqian){
                if(parent.opener.huiqian == 'zhuban'){
                    $('title').html('流程办理');
                }else if(parent.opener.huiqian == 'huiqian'){
                    $('title').html('会签办理');
                }
            }else{
                if(opflag == 1){
                    $('title').html('流程办理');
                }else if(opflag == 0){
                    $('title').html('会签办理');
                }else{
                    $('title').html('<fmt:message code="main.newwork" />');
                }
            }
            if(type){
                if(type == 'new'){
                    document.title=$('title').attr(type);
                }else{
                    document.title=$('title').attr(type);
                }
            }
            $('#tab_c').css('right',-($('#tab_c').width()+30));
            $('#tab_c').css('height',$('body').height()-52)
            $('#tab_c').css('top',$('.head').height());

            $('.rig_h1one').click(function(){
                $('.floatRight').toggle();
            })
            var flowId = $.GetRequest().flowId|| '';
            var flowStep = $.GetRequest().flowStep || '';
            var runId = $.GetRequest().runId || '';
            var prcsId=$.GetRequest().prcsId || '';
            $('#fenxiang').click(function(){
                window.open("/workflow/work/notifyWork?flowId="+flowId+"&type=todo&prcsId="+prcsId+"&flowStep="+flowStep+"&runId="+runId);
            })
            if(isNomalType == 'false'){
                $('.tabAB').show();
                $('.tabAB ul li').click(function () {
                    if ($(this).attr('data-id') == 2) {
                        if(tabId != ''){
                            autodivheight();
                            $('#zw').prop('src','../../common/ntko?tabId='+tabId+'&tableName='+tableName);
                        }
                    }
                });

                $('.tabAB ul li').click(function () {
                    $(this).siblings().removeClass('active');
                    $(this).addClass('active');
                    if($(this).attr('data-id')==1){
                        $('#a2').show();
                        $('#tab_t').show();
                        $('.officialDocument').hide()
                    }else {
                        $('#a2').hide();
                        $('#tab_t').hide();
                        $('.officialDocument').show()
                    }
                });
            }else{
                $('.opt').show();
                $('.step').show()
            }
            //引入方法
            workForm.init({
                    formhtmlurl:'../../workflow/work/workfastAdd',//URL
                    resdata:{
                        flowId:flowId,
                        runId:runId,
                        prcsId:prcsId,
                        flowStep:flowStep
                    },
                    flowStep:prcsId,//预览
                    target:'.cont_form'},
                function (data,option) {
                    fromDataReject = buildFormData();
                    var obj = data.object;
                    runId = obj.flowRun.runId;
                    flowrunId = obj.flowRun.runId;
                    globalData.flowRun = obj.flowRun;
                    globalData.isViewPriv = obj.isViewPriv;
                    globalData.listFp = obj.listFp;
                    globalData.flowRunPrcs = obj.flowRunPrcs;
                    globalData.option = option;
                    globalData.listView = obj.listView;
                    globalData.flowTypeModel = obj.flowTypeModel;
                    globalData.conditionDesc = obj.conditionDesc;
                    globalData.prcsIn = obj.prcsIn;
                    globalData.flowProcesses = obj.flowProcesses;
                    globalData.prcsInSet = obj.prcsInSet;
                    globalData.prcsOut = obj.prcsOut;
                    globalData.prcsType = obj.flowProcesses.prcsType;
                    globalData.prcsOutSet = obj.prcsOutSet;
                    globalData.gatherNodePriv = obj.gatherNodePriv;
                    globalData.topDefault = obj.flowProcesses.topDefault;
                    globalData.userName = obj.userName;
                    var flowName = globalData.flowTypeModel.flowName || '';
                    $('#level').val(obj.flowRun.workLevel);
                    if(parent.opener && parent.opener.huiqian){
                        if(parent.opener.huiqian == 'zhuban'){
                            $('title').html('<fmt:message code="main.th.ProcessManagement" />');
                        }else if(parent.opener.huiqian == 'huiqian'){
                            $('title').html('<fmt:message code="work.th.huiqian" />');
                        }
                        if(opflag == 1){
                            $('title').html('<fmt:message code="main.th.ProcessManagement" />');
                        }else if(opflag == 0){
                            $('title').html('<fmt:message code="work.th.huiqian" />');
                        }
                    }else{
                        if(opflag == 1){
                            $('title').html('<fmt:message code="main.th.ProcessManagement" />');
                        }else if(opflag == 0){
                            $('title').html('<fmt:message code="work.th.huiqian" />');
                        }else{
                            $('title').html('<fmt:message code="main.newwork" />-'+flowName);
                        }
                    }
                    if(type){
                        if(type == 'new'){
                            document.title=$('title').attr(type)+'-'+flowName;
                        }else{
                            document.title=$('title').attr(type)+'-'+globalData.flowRun.runName
                        }
                    }
                    flowPrcs =  data.object.flowRunPrcs.flowPrcs;
                    prcsPrivlist = option.prcsPrivlist;
                    prcsUserlist = option.prcsUserlist;
                    prcsDeptlist = option.prcsDeptlist;
                    feedback = data.object.feedback;
                    attachPriv = data.object.attachPriv;
                    allowBack = data.object.allowBack;
                    signlock = data.object.signlock;
                    if(feedback == '1'){
                        $('#signText').attr("disabled","disabled")
                    }
                    if(allowBack != 0){
                        $("#goback").show();
                        $("#goback").attr("allowBack",allowBack);
                        $("#goback").click(function () {
                            $.ajax({
                                type: "get",
                                url: "getflowprcsdata",
                                dataType: 'JSON',
                                data: {
                                    prcsId: flowStep,
                                    runId: runId,
                                    allowBack:$('#goback').attr('allowback')
                                },
                                success: function (res) {
                                    if(res.flag){
                                        var feedbackLiObj = "";
                                        res.obj.forEach(function(v,i){
                                            feedbackLiObj += '<li><input type="radio" name="feedbackstep" class="" flowPrcs="'+v.flowProcess.prcsId+'" ><span class="feedbacktitle"><fmt:message code="workflow.th.First" />'+v.prcsId+'<fmt:message code="workflow.th.step" />'+v.flowProcess.prcsName+'</span><div class="feedbackcontent"><fmt:message code="sup.th.Sponsor" />：'+v.userName+'&nbsp;&nbsp;&nbsp;<fmt:message code="workflow.th.Settlingtime" />：'+v.prcsTime+'</div></li>';
                                        });
                                        layer.open({
                                            type: 1,
                                            offset: '80px',
                                            area: ['800px', '500px'],
                                            closeBtn: 2,
                                            title: titleName,
                                            content: '<div class="modal-body" style="max-height: 274px;">' +
                                            '<div class="work-prcs-title" id="op_user_show_info" style="margin-bottom: 10px;font-weight: normal;border-radius: 4px;-webkit-border-radius: 4px;">' +
                                            '<fmt:message code="document.th.SelectReturnStep" />：' +
                                            '</div><div class="work-prcs-block">' +
                                            '<div class="work-prcs-content clearfix" style="border: 1px solid #f3f3f3;"><div class=" workflow-procs-nodes-result-wrap">' +
                                            '<ul id="work-next-prcs-block" class="workflow-procs-nodes-result" style="top: 0px; margin-left: 30px;word-spacing: 0px;">' +feedbackLiObj+
                                            '</ul></div></div></div><div class="work-msg-block">' +
                                            '<div class="work-msg-title"><a id="msg-control" href="#"><img style="vertical-align: text-top; margin-top: 5px;" src="../../img/workflow/work/add_work/form_down.png"></a> <fmt:message code="document.th.InputReturnOpinion" />：</div>' +
                                            '<div class="work-msg-content" style="display: block;"><div class="clearfix"><textarea id="feedback" class="backinfo"></textarea>' +
                                            '</div></div></div></div>',
                                            btn: ['<fmt:message code="main.th.confirm" />', '<fmt:message code="depatement.th.quxiao" />'],
                                            success: function (layero, index) {

                                            },
                                            yes: function(index, layero){
                                                var feedback = $('#feedback').val();
                                                var backflowPrcs = $("input[name='feedbackstep']:checked").attr('flowPrcs');
                                                if(backflowPrcs == undefined){
                                                    $.layerMsg({content:'<fmt:message code="main.th.FallbackStep" />！',icon:3},function(){
                                                    });
                                                    return false;
                                                }
                                                if(feedback == ''){
                                                    $.layerMsg({content:'<fmt:message code="main.th.ReturnOpinion" />！',icon:3},function(){
                                                    });
                                                    return false;
                                                }
                                                $.ajax({
                                                    type: "get",
                                                    url: "insertprcsdata",
                                                    dataType: 'JSON',
                                                    data: {
                                                        flowPrcs : backflowPrcs,
                                                        prcsId : prcsId,
                                                        flowStep:flowStep,
                                                        runId : runId,
                                                        feedback : $('#feedback').val()
                                                    },
                                                    success: function (res) {
                                                        if(res.flag){
                                                            $.layerMsg({content:'<fmt:message code="document.th.RollbackSuccessful" />！',icon:1},function(){
                                                                window.close();
                                                                parent.opener.runWorkListPage();
                                                            });
                                                        }else{
                                                            $.layerMsg({content:'<fmt:message code="document.th.RollbackFailed" />！',icon:2},function(){
//                                                            layer.closeAll();
                                                            });
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                    }
                                }
                            });
                        });
                    }
                    initSlideBar(prcsId,flowPrcs,runId);
                    var obj=data.object.flowRun
                    var  titleName= 'NO.&nbsp'+obj.runId+'&nbsp;'+obj.runName;
                    $('.num').html(titleName);
                    var obj2 = [];
                    var listFp = data.object.listFp;
                    for(var i=0;i<listFp.length;i++){
                        if(listFp[i]!=undefined&&listFp[i].prcsId==prcsId){
                            obj2=listFp[i];
                        }
                    }
                    $('.step').html('<fmt:message code="workflow.th.host" />：(<fmt:message code="workflow.th.First" />'+flowStep+'<fmt:message code="workflow.th.step" />：'+obj2.prcsName+')');
                });

            function buildFormData(){
                var arr = {};
                $(".cont_form").find('.form_item').each(function(i,v){
                    var _this = $(this);
                    arr[_this.attr('title')] = _this.attr('name');
                });
                return arr;
            }
            function checkttachPriv(privNum){
                if(attachPriv.indexOf(privNum) > -1){
                    return true;
                }
                return false   ;
            }
            function checkFeeback(){
                if(feedback != '1' ){
                    return true;
                }
                return false;
            }
            $('#oneUploadFile').delegate('.downloadBtn','click',function () {
                var _this = $(this);
                if(checkttachPriv(4)){
                    var url = _this.attr("atturl")
//                    alert("../../download?"+url);
                    window.location="../../download?"+url;
                }else{
                    $.layerMsg({content:'<fmt:message code="document.th.permissionDownload" />！',icon:6},function(){
                    });
                }
            });
            $('#cancleBtn').click(function(){
                if(parent.opener.openRold!=undefined){
                    parent.opener.openRold()
                }
                window.close();
            });
            $('#oneUploadFile').on('click','.deletefileBtn',function () {
                var _this = $(this);
                if(checkttachPriv(3)){
                    var url =  'deletework?runId='+runId+'&'+_this.attr("atturl");
                    $.get(url,function(data,status){

                        if(data.flag){
                            $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="workflow.th.que" />？',icon:0},function(){
                                $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1},function(){
                                    _this.parent().parent().remove();

                                    if($('#oneUploadFile li').length == 0){
                                        $('#oneUploadFile').hide();
                                        $('#img_none').show();
                                    }
                                });
                            },function(){

                            });
                        }else{
                            $.layerMsg({content:'<fmt:message code="lang.th.deleSucess" />！',icon:2},function(){

                            });
                        }
                    });
                }else{
                    $.layerMsg({content:'<fmt:message code="document.th.DeletePermissions" />！',icon:6},function(){
                    });
                }
            });
            $('#oneUploadFile').on('click','.previewBtn',function () {
                var _this = $(this);
                var atturl = _this.attr("atturl");

                if(_this.parent().parent().find('.item_logo img').attr('src') == "../../img/icon_image.png"){
                    $.popWindow("../..//xs?"+atturl,'<fmt:message code="main.th.PreviewPage" />','0','0','1500px','800px');
                }else{
                    $.popWindow("../../common/ntkoPreview?"+atturl,'<fmt:message code="main.th.PreviewPage" />','0','0','1500px','800px');
                }
            });
            $('#oneUploadFile').on('click','.editBtn',function () {
                var _this = $(this);
                var atturl = _this.attr("atturl");

                if(checkttachPriv(2)){
                    $.popWindow("../../common/ntko?"+atturl,'<fmt:message code="main.th.PreviewPage" />','0','0','1500px','800px');
                }else{
                    $.layerMsg({content:'<fmt:message code="document.th.HaveEditRights" />！',icon:6},function(){

                    });
                }
            });

            $('#print').click(function(){
                <%--if(checkttachPriv(5)){--%>
                <%--$('.cont_form').jqprint();--%>
                <%--}else{--%>
                <%--$.layerMsg({content:'<fmt:message code="document.th.printPermissions" />！',icon:6},function(){--%>

                <%--});--%>
                <%--}--%>
                window.open('workformPreView?flowId='+ flowId +'&prcsId='+ prcsId +'&flowStep='+ flowStep +'&runId='+runId)
            });
            $("#signSendBtn").click(function() {
                if(checkFeeback()){
                    var text = $('#signText').val();
                    if(text == ''){
                        $.layerMsg({content:'<fmt:message code="document.th.Countersign" />！',icon:5},function(){

                        });
                        return false;
                    }else{
                        $.ajax({
                            type: "get",
                            url: "workfeedback",
                            dataType: 'JSON',
                            data: {
                                prcsId:prcsId,
                                flowPrcs:flowPrcs,
                                runId:runId,
                                content:text,
                                file:''
                            },
                            success: function (obj) {
                                $('#signText').val('');
                                initSlideBar(prcsId,flowPrcs,runId);
                            }
                        });
                    }

                }else{
                    $.layerMsg({content:'<fmt:message code="document.th.permissionToCountersign" />！',icon:6},function(){

                    });
                }
            });
            function initSlideBar(prcsId,flowPrcs,runId){
                initSign(prcsId,flowPrcs,runId);
                initUpload(runId);
            }
            function initUpload(runId) {
                $.ajax({
                    type: "get",
                    url: "findworkUpload",
                    dataType: 'JSON',
                    data: {
                        runId:runId
                    },
                    success: function (obj) {
                        if(obj.flag){
                            var str = '';
                            obj.obj.forEach(function (v,i) {
                                var arr = v.attachName.split('.');
                                var imgurl = iconImgType[arr[arr.length-1]] || '/img/workflow/work/doc.png';
                                var str2 = '';
                                if(imgurl.substring(imgurl.lastIndexOf('/')+1,imgurl.lastIndexOf('.'))=='doc'){
                                    str2 = '<h2  attUrl="'+encodeURI(v.attUrl)+'" class="editBtn item_wordH2"><fmt:message code="global.lang.edit" /></h2> ';
                                }
                                str += ' <li><div class="item_logo"><img src="'+imgurl+'"></div>' +
                                    '<div class="item_word" style="margin-top: 8px;letter-spacing: 1px;"><h1 class="item_wordH1" style="font-size: 11pt;" title="'+v.attachName+'">'+v.attachName+'</h1><h2></h2></div>' +
                                    '<div  class="item_word" style="margin-top: 2px;font-size: 9pt;">' +
                                    '<h1 class="previewBtn item_wordH2" style="margin-left: 0;" attUrl="'+encodeURI(v.attUrl)+'"><fmt:message code="global.lang.view" /></h1>' +
                                    '<h1 class="downloadBtn item_wordH2" attUrl="'+encodeURI(v.attUrl)+'"><fmt:message code="file.th.download" /></h1>' +
                                    str2+
                                    '<h1 class="deletefileBtn item_wordH2" attUrl="'+encodeURI(v.attUrl)+'"><fmt:message code="global.lang.delete" /></h1>'+
                                    '</div></li>';
                            });
                            if( obj.obj.length>0){
                                $('#img_none').hide();
                            }
                            if(obj.obj.length ==0){
                                $('#oneUploadFile').hide();
                            }
                            $('#oneUploadFile').html(str)
                        }

                    }
                });
            }
            $('#uploadinputimg').change(function(e){
                if(checkttachPriv(1)){
                    $('#uprunId').val(flowrunId);
//                    $('#uploadinputimg').click();
                }else{
                    $.layerMsg({content:'<fmt:message code="document.th.AttachmentPermission" />！',icon:6},function(){
                    });
                    return;
                }
                var target = $(e.target);
                var file;
                if(target[0].files && target[0].files[0]){
                    file=target[0].files[0];
                }
                if(file){
                    $('#uploadimgform').ajaxSubmit({
                        type: 'post',
                        dataType: 'json',
                        success: function (res) {
                            $('#uploadinputimg').val('');
                            var data=res.obj;
                            var str=''
                            data.forEach(function (v,i) {
                                var arr = v.attachFile.split('.');
                                var imgurl = iconImgType[arr[arr.length-1]] || '/img/workflow/work/doc.png';
                                var str2 = '';
                                if(imgurl.substring(imgurl.lastIndexOf('/')+1,imgurl.lastIndexOf('.'))=='doc'){
                                    str2 = '<h2  attUrl="'+encodeURI(v.attUrl)+'" class="editBtn item_wordH2"><fmt:message code="global.lang.edit" /></h2> ';
                                }
                                str += ' <li><div class="item_logo"><img src="'+imgurl+'"></div>' +
                                    '<div class="item_word" style="margin-top: 8px;letter-spacing: 1px;"><h1 class="item_wordH1" style="font-size: 11pt;" title="'+v.attachName+'">'+v.attachName+'</h1><h2></h2></div>' +
                                    '<div  class="item_word" style="margin-top: 2px;font-size: 9pt;">' +
                                    '<h1 class="previewBtn item_wordH2" style="margin-left: 0;" attUrl="'+encodeURI(v.attUrl)+'"><fmt:message code="global.lang.view" /></h1>' +
                                    '<h1 class="downloadBtn item_wordH2" attUrl="'+encodeURI(v.attUrl)+'"><fmt:message code="file.th.download" /></h1>' +
                                    str2+
                                    '<h1 class="deletefileBtn item_wordH2" attUrl="'+encodeURI(v.attUrl)+'"><fmt:message code="global.lang.delete" /></h1>'+
                                    '</div></li>';
                            });
                            if($('#img_none')!=null||$('#img_none')!=undefined){
                                $('#img_none').hide()
                            }
                            $('#oneUploadFile').show();
                            $('#oneUploadFile').append(str)

                        }
                    });

                }
            });

            function checkPrcIn(prcsIn,prcsInSet,formdata,fromDataReject,cb){
                var res = {
                    flag:true,
                    msg:''
                };
                if(prcsInSet != ""){
                    var prcsInArr = prcsIn.split('\n');
                    formdata = covertToFormData(formdata);

                    prcsInArr.forEach(function(v,i){
                        var check_pass = 0;
                        var titleValue = '';
                        if(v.indexOf("'") > -1){
                            var arr_rule = v.split("'");

                            var item_title = myTrim(arr_rule[1]);
                            var item_con = myTrim(arr_rule[2]);
                            var item_value = myTrim(arr_rule[3]);
                            titleValue = formdata[fromDataReject[item_title]];
                            check_pass = checkTileValue(titleValue,item_con,item_value);
                            var setitem =  '['+(i+1)+']'
                            prcsInSet = prcsInSet.replace(setitem,check_pass);
                        }
                    });
                    prcsInSet = covertToPrcsOutSet(prcsInSet.toLowerCase());

                    var result = eval(prcsInSet);

                    if(result == 0){
                        res.flag = false;
                    }
                }
                if(cb){
                    cb(res);
                }
            };
            function covertToFormData(formdata){
                var data = {};
                if(formdata instanceof Array){
                    formdata.forEach(function(v,i){
                        data[v.key] =  v.value;
                    });
                }
                return data;
            }
            function covertToPrcsOutSet(data){
                data = data.replace(/or/g,'||')
                data = data.replace(/and/g,'&&')
                return data;
            }
            function checkPrcOut(formdata,fromDataReject,cb){
                var msg = globalData.conditionDesc.split('\n')[1];
                var res = {
                    flag:true,
                    msg:""
                };
                if(msg){
                    res.msg = msg;
                }else{
                    res.msg =  '<fmt:message code="main.th.NonConformity" />'
                }
                var prcsOut = globalData.prcsOut;
                var prcsOutSet = globalData.prcsOutSet;
                if(prcsOutSet != ""){
                    var prcsOutArr = prcsOut.split('\n');
                    formdata = covertToFormData(formdata);
                    prcsOutArr.forEach(function(v,i){
                        var check_pass = 0;
                        var titleValue = '';
                        var arr_rule = v.split("'");
                        var item_title = myTrim(arr_rule[1]);
                        var item_con = myTrim(arr_rule[2]);
                        var item_value = myTrim(arr_rule[3]);
                        titleValue = formdata[fromDataReject[item_title]];
                        check_pass = checkTileValue(titleValue,item_con,item_value);
                        var setitem =  '['+(i+1)+']'
                        prcsOutSet = prcsOutSet.replace(setitem,check_pass);
                    });
                    prcsOutSet = covertToPrcsOutSet(prcsOutSet.toLowerCase());
                    var result = eval(prcsOutSet);

                    if(result == 0){
                        res.flag = false;
                    }
                }
                if(cb){
                    cb(res);
                }
            };
            function checkTileValue(item_title,rule,item_value){
                var checkpass = 0;
                var item_title = parseInt(item_title) || item_title;
                var item_value = parseInt(item_value) || item_value;
                switch (rule) {
                    case '=':
                        if (item_title == item_value) {
                            checkpass = 1;
                        }
                        break;
                    case '!=':
                        if (item_title != item_value) {
                            checkpass = 1;
                        }
                        break;
                    case '>':
                        if (item_title > item_value) {
                            checkpass = 1;
                        }
                        break;
                    case '<':
                        if (item_title < item_value) {
                            checkpass = 1;
                        }
                        break;
                    case '<=':
                        if (item_title <= item_value) {
                            checkpass = 1;
                        }
                        break;
                    case '>=':
                        if (item_title >= item_value) {
                            checkpass = 1;
                        }
                        break;
                    case 'include':
                        if (item_value.indexOf(item_title) > -1) {
                            checkpass = 1;
                        }
                        break;
                    case 'exclude':
                        if (item_title.indexOf(item_value) == -1) {
                            checkpass = 1;
                        }
                        break;
                }
                return checkpass;
            }
            function myTrim(x) {
                return x.replace(/^\s+|\s+$/gm,'');
            }
            function initSign(prcsId,flowPrcs,runId){
                $.ajax({
                    type: "get",
                    url: "findworkfeedback",
                    dataType: 'JSON',
                    data: {
                        prcsId:prcsId,
                        signlock:signlock,
                        flowPrcs:flowPrcs,
                        runId:runId
                    },
                    success: function (obj) {
                        if(obj.flag){
                            if(obj.obj.length!=0){
                                var str = '';
                                obj.obj.forEach(function (v,i) {
                                    var avatar = v.users.avatar;
                                    if (avatar==0){
                                        str += '<li><div class="huiqian_touxiang"><img class="huiqian_logo" style="width: 40px;margin-top: 8px" src="../../img/user/boy.png"></div><div class="huiqian_word" style="width:163px;"><h1 style="display: inline-block;font-weight: 600;">'+v.users.userName+'</h1><h1 style="display: inline-block;font-size: 12px;margin-left: 8px;color: #999;">'+v.users.userPrivName+'</h1><div class="cesdiv" title="'+v.content+'">'+v.content+'</div><div class="h2s" style="font-size: 12px;margin-top: 1px;">'+v.editTime+'</div></div></li>';
                                    }else if(avatar==1){
                                        str += '<li><div class="huiqian_touxiang"><img class="huiqian_logo" style="width: 40px;margin-top: 8px" src="../../img/user/girl.png"></div><div class="huiqian_word" style="width:163px;"><h1 style="display: inline-block;font-weight: 600;">'+v.users.userName+'</h1><h1 style="display: inline-block;font-size: 12px;margin-left: 8px;color: #999;">'+v.users.userPrivName+'</h1><div class="cesdiv" title="'+v.content+'">'+v.content+'</div><div class="h2s" style="font-size: 12px;margin-top: 1px;">'+v.editTime+'</div></div></li>';
                                    }else{
                                        str += '<li><div class="huiqian_touxiang"><img class="huiqian_logo" style="width: 40px;margin-top: 8px" src="../../img/user/'+ avatar +'"></div><div class="huiqian_word" style="width:163px;"><h1 style="display: inline-block;font-weight: 600;">'+v.users.userName+'</h1><h1 style="display: inline-block;font-size: 12px;margin-left: 8px;color: #999;">'+v.users.userPrivName+'</h1><div class="cesdiv" title="'+v.content+'">'+v.content+'</div><div class="h2s" style="font-size: 12px;margin-top: 1px;">'+v.editTime+'</div></div></li>';

                                    }

                                });
                                $('#signbox').html(str)


                            }
                        }
                    }
                });
            }
            //第一个
            $('.fujian').on('click',function(){
                if($(this).hasClass('check')){
                    $('.position').click();
                }else{
                    $('.fujian').find('a').css('color','#fff');
                    $('.huiqian').find('a').css('color','#4889f0');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('#tab_c').css('right','0px')
                    //  $('#tab_c').animate({width:"316px"});
                    $('#tab_ctwo').hide();
                    $('.tab_one').show();
                }
            })
            //第二个
            $('.huiqian').on('click',function(){
                if($(this).hasClass('check')){
                    $('.position').click();
                }else {
                    $('.fujian').find('a').css('color', '#4889f0');
                    $(this).find('a').css('color', '#fff');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('#tab_c').css('right', '0px')
                    $('#tab_ctwo').hide();
                    $('.tab_one').show();
                }
            });
            //第三个
            $('.liucheng').on('click',function(){
                if($(this).hasClass('check')){
                    $('.position').click();
                }else {
                    $('.huiqian').find('a').css('color', '#4889f0');
                    $('.fujian').find('a').css('color', '#4889f0');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('#tab_c').css('right', '0px')
                    $('.cont_cthr').siblings().hide();
                    $('.tab_one').hide();
                    $('#tab_ctwo').show();
                    $('.cont_cthr').show();
                    $('#tab_c').scrollTop(99999999999999);
                }
            })
            //第四个
            $('.guanlian').on('click',function(){
                if($(this).hasClass('check')){
                    $('.position').click();
                }else {
                    $('.huiqian').find('a').css('color', '#4889f0');
                    $('.fujian').find('a').css('color', '#4889f0');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('#tab_c').css('right', '0px')
                    $('.cont_cfour').siblings().hide();
                    $('.tab_one').hide();
                    $('#tab_ctwo').show();
                    $('.cont_cfour').show();
                }
            })
            $('.position').on('click',function () {
                $('#tab_c').css('right',-($('#tab_c').width()+30))
                $('.check a').css('color','#4889f0');
                $('.check').removeClass('check');
            })
            //点击左下角的附件
            $('#attach_name').on('click',function(){
                $('.fujian').click()
            })
            function subPric(source,pos) {
                var strs= new Array(); //定义一数组
                strs=source.split(pos); //字符分割
                return strs;
            }
            $('#flowImg').click(function(){
//                if(typeof(qt) == 'undefined'){
                    eventas=$('.num');
                    window.open('../../flowSetting/processDesignToolTwo?flowId='+flowId+'&rilwId='+runId+'&type=banli');
                <%--}else{--%>
                    <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                        <%--var content = channel.objects.interface;--%>
                        <%--content.xoa_sms('/flowSetting/processDesignToolTwo?flowId='+flowId+'&rilwId='+runId,'<fmt:message code="workflow.th.chart" />',"web_child_url");--%>
                    <%--});--%>
                <%--}--%>
            });
            $('#finish').click(function(){
                var flowfun = globalData.flowRun;
                var finishdata={
                    runId:flowfun.runId,
                    prcsId : flowStep,
                    flowPrcs : prcsId,
                    flowId:flowId,
                    tableName:tableName,
                    tabId:tabId
                };
                $.ajax({
                    type: "post",
                    url: "/workflow/work/saveHandle",
                    dataType: 'JSON',
                    data: finishdata,
                    success: function(res){
                        if(res.flag){
                            $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                                window.close();
                                parent.opener.runWorkListPage();
                            });
                        }
                    }
                });
            });
            $('#saveform').click(function(){
                saveFlowData(function(data){
                    if(data.flag){
                        $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){

                        });
                    }else{
                        $.layerMsg({content:'<fmt:message code="meet.th.SaveFailed" />！',icon:2},function(){

                        });
                    }

                });
            });

            $('#saveform1').click(function(){
                $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                    location.reload();
                });
            });
            $('#saveformback1').click(function(){
                $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                    window.close();
                });
            });
            $('#cancleBtn1').click(function(){
                $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                    window.close();
                });
            });
            $('#saveformback').click(function(){
                saveFlowData(function(){
                    if(parent.opener.openRold!=undefined){
                        parent.opener.openRold()
                    }
                    window.close();
                });
            });
            function saveFlowData(cb) {
                var flowfun = globalData.flowRun;
                var form_item=$('.cont_form .form_item');
                var realData=[];
                var radioArr = {};
                var modifydata =[];
                var flag = false;
                for(var i=0;i<form_item.length;i++){
                    var baseData={};
                    var value="";
                    var obj = form_item.eq(i);
                    var datatype = obj.attr("data-type");
                    var key=obj.attr("name");
                    var ismust = obj.attr('ismust');
                    if(datatype=="select"){
                        value= obj.val()==0?'':form_item.eq(i).val();
                    }else if(datatype=="textarea" || datatype=="text"  ){
                        value=obj.val();
                    }else if(datatype=="checkbox"){
                        if(obj.is(':checked')){
                            value = '1';
                        }else{
                            value = '0'
                        }
                    }else if(datatype=="macros"){
                        if(obj.attr('type') == "text"){
                            value= obj.val();
                        }else{
                            if(obj.val() > -1){
                                value = obj.val()+'_'+obj.find("option:selected").text();
                            }
                        }
                    }else if(datatype == "radio"){
                        var name = obj.attr('name');
                        if(!radioArr[obj.attr('name')]){
                            radioArr[obj.attr('name')] = true;
                            if($("input[name='"+name+"']:checked").length>0){
                                value= $("input[name='"+name+"']:checked").val();
                            }else{
                                value = "";
                            }
                        }else{
                            continue;
                        }
                    }else if(datatype == "macrossign"){
                        value= obj.html();

                    }else if(datatype == "fileupload"){
                        value= obj.attr('atturl');
                    }else if(datatype == "imgupload"){
                        var name = obj.attr('name');
                        $('img[name='+name+']').each(function(i,v){
                            var url = $(v).attr('src');
                            if(url!='/img/icon_uploadimg.png'){
                                value+= (url+',');
                            }
                        })
                    }else if(datatype == "sign"){
                        //if(!_this.attr('disabled') == 'disabled'){
                            var pre = obj.prev();
                            value = Mustache.render(pre.html(),{content:''});
//                        }else{
//                            value = "";
//                        }

                    } else if(datatype == "userselect"){
                        value= (obj.attr('user_id')||'')+'|'+ (obj.attr('username')||'');
                    }else if(datatype == "deptselect"){
                        value= (obj.attr('deptid') || '')+'|'+(obj.attr('deptname')||'');
                    }else if(datatype == "kgsign"){
                        value = (obj.attr('signatureId') || '');
                    }else if(datatype == "listing"){
                        var vtrStr = [];
                        obj.find('tr').each(function(){
                            if($(this).attr('class') != 'listhead' && $(this).attr('class')!= 'listfoot'){
                                var  listTdObj = $(this).find('td');
                                var vtdStr = []
                                listTdObj.each(function (i,v) {

                                    var _this = $(v);
                                    var listtype = $(v).attr('listtype');
                                    switch (listtype){
                                        case 'text':
                                            vtdStr.push(_this.find('input').val());
                                             break;
                                        case 'textarea':
                                            vtdStr.push(_this.find('textarea').val());
                                            break;
                                        case 'select':
                                            vtdStr.push(_this.find('select').val());
                                             break;
                                        case 'radio':
                                            var name = _this.find('input').eq(0).attr('name');
                                            vtdStr.push($('input[name="'+name+'"]:checked').val());
                                            break;
                                        case 'checkbox':
                                            var checkboxStr = [];
                                            _this.find('input:checked').each(function(i,v){
                                                checkboxStr.push($(v).attr('value'));
                                            });
                                            vtdStr.push(checkboxStr.join(','));
                                            break;
                                        case 'datetime':
                                            vtdStr.push(_this.text())
                                            break;
                                        case 'dateAndTime':
                                            vtdStr.push(_this.text())
                                            break;
                                        default:

                                    }

                                });

                                vtrStr.push(vtdStr.join('`'))
                            }
                        });
                        value = vtrStr.join('\r\n');
                    }else if(datatype == 'readcomments'){
                        value = obj.val();
                    }else{
                        value = obj.val();
                    }
                    if(ismust == 'true' && value == ""){
                        flag = true;
                        layer.msg('<fmt:message code="main.th.PleaseFill" />'+obj.attr('title'), {icon: 1});
                        break;
                    }
                    if( value!=null){
                        baseData["key"]=key;
                        baseData["value"]=value;
                        realData.push(baseData);
                    }
                    if(value && value != ''){
                        modifydata.push(baseData);
                    }
                }
                if(!flag){
                    var fdata={
                        flowId:flowfun.flowId,
                        formdata:JSON.stringify(realData),
                        runId:flowfun.runId,
                        runName:flowfun.runName,
                        beginTime:flowfun.beginTime,
                        beginUser:flowfun.beginUser,
                        formLength:globalData.option.formLength,
                        prcsId : flowStep,
                        flowPrcs : prcsId,
                        modifydata:JSON.stringify(modifydata),
                        fromDataReject:JSON.stringify(fromDataReject),
                        tableName:tableName,
                        tabId:tabId,
                        workLevel:$('#level option:selected').val()
                    };
                    var list = Signature.list;
                    var signatureCreator = Signature.create();
                    var kgsignList=$('.cont_form .kgsign');
                    kgsignList.each(function(){
                        var value = $(this).attr('value');
//                        if(value){//已经存在签章
//
//                        }else{
                            //新增签章
                            var key = ($(this).attr('signatureid') || '').split(',');
                            key.forEach(function (v,i) {
                                if(list[v]){
                                    signatureCreator.saveSignature(flowfun.runId, v, list[v].getSignatureData());
                                }
                            })

//                        }
                    });

                    $.ajax({
                        type: "post",
                        url: "../../workflow/work/nextwork",
                        dataType: 'JSON',
                        data: fdata,
                        success: function(res){
                            var data ={};
                            if(cb){
                                if(res.flag){
                                    data['flag'] = true;
                                }else{
                                    data['flag'] = false;
                                }
                                data.data = res.obj;
                                data.opt = fdata;
                                cb(data)
                            }
                        }
                    });
                }
            }
            $('.zhuanjiao').on('click',function(){
                if(zw.window.hiddenRight!=undefined){
                    zw.window.hiddenRight();
                }
                if('1' == globalData.gatherNodePriv){
                    layer.alert("<fmt:message code="work.th.hebing" />！", {
                        icon: 0,
                        title:'NO.'+globalData.flowRun.runId+'&nbsp;&nbsp;'+globalData.flowRun.runName,
                        skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                    })
                    return false;
                }
                //保存表格数据的接口
                saveFlowData(function(res){
                    if(!res.flag){
                        $.layerMsg({content:'<fmt:message code="meet.th.SaveFailed" />！',icon:2},function(){

                        });
                        return false;
                    }
                    var formLength=globalData.option.formLength;
                    var obj=globalData.flowRun;
                    var listFp = globalData.listFp
                    var titleName='<img src="/img/spicon.png" style="position: absolute;top: 8px;left: 30px;">'+'<span style="display: inline-block;letter-spacing: 0.5px;margin-left: 43px;">'+obj.runName+'</span>';
                    var prcsTo;
                    var prcsToBycode;
                    var prcsName='';
                    var turnObj = {};
                    var nextFlowid = ''
                    var syncDeal='';
                    var workflowpricToArray = '';
                    if(globalData.flowProcesses.syncDeal == 0){
                        syncDeal = '<fmt:message code="workflow.th.Prohibitconcurrency" />';
                    }else if(globalData.flowProcesses.syncDeal == 1){
                        syncDeal = '<fmt:message code="workflow.th.AllowConcurrent" />';
                    }else if(globalData.flowProcesses.syncDeal == 2){
                        syncDeal = '<fmt:message code="workflow.th.ForcedConcurrent" />';
                    }
                    for(var i=0;i<listFp.length;i++){
                        var obj2=listFp[i];
                        if(prcsId == obj2.prcsId){
                            turnObj = obj2;
                            if(obj2.prcsTo!=""){
                                prcsToBycode = obj2.prcsTo;
                                prcsTo= subPric(obj2.prcsTo,",");
                                break;
                            }
                            break;
                        }
                    }
                    if(globalData.flowProcesses.prcsType == '4'){
                        prcsTo.push(prcsId)
                    }
                    if(prcsTo){
                        var indexCurrent = 0;
                        var index = 0;
                        for (var j=0;j<prcsTo.length;j++){
                            if(j == 1){
                                nextFlowid = prcsTo[0];
                            }
                            if(prcsTo[j]=='0'){
                                if(indexCurrent == 0){
                                    prcsName+='<div class="prcsName prcsName_chang" style="" prcsId=0><h1><fmt:message code="main.th.EndProcess" /></h1></div>';
                                }else{
                                    prcsName+='<div class="prcsName " style="" prcsId=0><h1><fmt:message code="main.th.EndProcess" /></h1></div>';
                                }
                                index = 1;
                                indexCurrent++;
                            }
                            for(var i=0;i<listFp.length;i++){
                                var obj2=listFp[i];
                                if(obj2.prcsId == prcsTo[j]){
                                    checkPrcIn(obj2.prcsIn,obj2.prcsInSet,JSON.parse(res.opt.formdata),JSON.parse(res.opt.fromDataReject),function(res){
                                        if(res.flag){
                                            if(indexCurrent == 0){
                                                indexCurrent++;
                                                prcsName+='<div class="prcsName prcsName_chang" style="" prcsId='+obj2.prcsId+'><h1>'+obj2.prcsName+'</h1></div>';
                                                if(obj2.topDefault == 0){
                                                    workflowpricToArray +=  '<li class="workflow-node-result clearfix " id="userSelectBtn_'+obj2.prcsId+'">'+
                                                        '<div class="workflow-node-title"><div class="workflow-node-ops" style="position: relative;"><input type="button" class="userSelectBtn" name="userSelectBtn" pid="'+obj2.prcsId+'"  value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel" /></span></div> </div>'+
                                                        '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix"  style="margin-bottom: 10px;"><input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                        '<input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                        '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="sup.th.Sponsor" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                        '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                        '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                        '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                        '<input type="text" class="user-tags"  readonly="readonly" id="remind_name_'+obj2.prcsId+'" user_id="" style="width: 120px;border-radius: 0px;"></div>'+
                                                        '<div id="prcs_op_block_div2" class="clearfix">'+
                                                        '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                        '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea class="user-tags" user_id=""  readonly="readonly" id="jingban_'+obj2.prcsId+'" style="width: 240px;"></textarea></div></div></li>';

                                                }else if(obj2.topDefault == 1){
                                                    workflowpricToArray +=  '<li class="workflow-node-result clearfix " id="userSelectBtn_'+obj2.prcsId+'">'+
                                                        '<div class="workflow-node-title"><div class="workflow-node-ops" style="position: relative;"><input type="button" class="userSelectBtn" name="userSelectBtn" pid="'+obj2.prcsId+'"  value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel" /></span></div> </div>'+
                                                        '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix"  style="margin-bottom: 10px;"><input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                        '<input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                        '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="main.th.FirstReceiverHosting" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                        '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                        '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                        '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                        '<input type="text" class="user-tags"  readonly="readonly" id="remind_name_'+obj2.prcsId+'" user_id="" style="width: 120px;border-radius: 0px;display: none;"></div>'+
                                                        '<div id="prcs_op_block_div2" class="clearfix">'+
                                                        '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                        '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea class="user-tags" user_id=""  readonly="readonly" id="jingban_'+obj2.prcsId+'" style="width: 240px;"></textarea></div></div></li>';

                                                }else{
                                                    workflowpricToArray +=  '<li class="workflow-node-result clearfix " id="userSelectBtn_'+obj2.prcsId+'">'+
                                                        '<div class="workflow-node-title"><div class="workflow-node-ops" style="position: relative;"><input type="button" class="userSelectBtn" name="userSelectBtn" pid="'+obj2.prcsId+'"  value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel" /></span></div> </div>'+
                                                        '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix"  style="margin-bottom: 10px;"><input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                        '<input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                        '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                        '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                        '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                        '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                        '<input type="text" class="user-tags"  readonly="readonly" id="remind_name_'+obj2.prcsId+'" user_id="" style="width: 120px;border-radius: 0px;display: none;"></div>'+
                                                        '<div id="prcs_op_block_div2" class="clearfix">'+
                                                        '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                        '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea class="user-tags" user_id=""  readonly="readonly" id="jingban_'+obj2.prcsId+'" style="width: 240px;"></textarea></div></div></li>';

                                                }
                                            }else{
                                                if(globalData.flowProcesses.syncDeal != 2){
                                                    prcsName+='<div class="prcsName" style="" prcsId='+obj2.prcsId+'><h1>'+obj2.prcsName+'</h1></div>';

                                                }else{
                                                    prcsName+='<div class="prcsName prcsName_chang" style="" prcsId='+obj2.prcsId+'><h1>'+obj2.prcsName+'</h1></div>';

                                                }
                                                if(obj2.topDefault == 0){
                                                    workflowpricToArray +=  '<li class="workflow-node-result clearfix hide" id="userSelectBtn_'+obj2.prcsId+'" >'+
                                                        '<div class="workflow-node-title"><div class="workflow-node-ops" style="position: relative;"><input type="button" class="userSelectBtn" name="userSelectBtn" pid="'+obj2.prcsId+'"  value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel" /></span></div> </div>'+
                                                        '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix"  style="margin-bottom: 10px;">'+
                                                        '<input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                        '<input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                        '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="sup.th.Sponsor" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                        '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                        '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                        '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                        '<input type="text" class="user-tags"  readonly="readonly" id="remind_name_'+obj2.prcsId+'" user_id="" style="width: 120px;border-radius: 0px;"></div>'+
                                                        '<div id="prcs_op_block_div2" class="clearfix">'+
                                                        '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                        '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea  readonly="readonly" class="user-tags" user_id="" id="jingban_'+obj2.prcsId+'" style="width: 240px;"></textarea></div></div></li>';

                                                }else if(obj2.topDefault == 1){
                                                    workflowpricToArray +=  '<li class="workflow-node-result clearfix hide" id="userSelectBtn_'+obj2.prcsId+'" >'+
                                                        '<div class="workflow-node-title"><div class="workflow-node-ops" style="position: relative;"><input type="button" class="userSelectBtn" name="userSelectBtn" pid="'+obj2.prcsId+'"  value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel" /></span></div> </div>'+
                                                        '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix"  style="margin-bottom: 10px;">'+
                                                        '<input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                        '<input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                        '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="main.th.FirstReceiverHosting" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                        '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                        '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                        '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                        '<input type="text" class="user-tags"  readonly="readonly" id="remind_name_'+obj2.prcsId+'" user_id="" style="width: 120px;border-radius: 0px;display: none;"></div>'+
                                                        '<div id="prcs_op_block_div2" class="clearfix">'+
                                                        '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                        '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea  readonly="readonly" class="user-tags" user_id="" id="jingban_'+obj2.prcsId+'" style="width: 240px;"></textarea></div></div></li>';

                                                }else{
                                                    workflowpricToArray +=  '<li class="workflow-node-result clearfix hide" id="userSelectBtn_'+obj2.prcsId+'" >'+
                                                        '<div class="workflow-node-title"><div class="workflow-node-ops" style="position: relative;"><input type="button" class="userSelectBtn" name="userSelectBtn" pid="'+obj2.prcsId+'"  value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel" /></span></div> </div>'+
                                                        '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix"  style="margin-bottom: 10px;">'+
                                                        '<input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                        '<input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                        '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                        '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                        '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                        '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                        '<input type="text" class="user-tags"  readonly="readonly" id="remind_name_'+obj2.prcsId+'" user_id="" style="width: 120px;border-radius: 0px;display: none;"></div>'+
                                                        '<div id="prcs_op_block_div2" class="clearfix">'+
                                                        '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                        '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea  readonly="readonly" class="user-tags" user_id="" id="jingban_'+obj2.prcsId+'" style="width: 240px;"></textarea></div></div></li>';

                                                }

                                            }
                                        }else{
                                            prcsName+='<div class="prcsName" style="" prcsId='+obj2.prcsId+'><span class="tipmsg" style="display: none;" msg="'+obj2.conditionDesc.split('\n')[0]+'"><fmt:message code="main.th.NonConformity" /></span><h1>'+obj2.prcsName+'</h1></div>';
                                        }
                                    });

                                }
                            }
                        }
                    }
                    //找到表格上的内容
                    var form_item=$('.cont_form .form_item');
                    var realData=[];
                    var radioArr = {};
                    var modifydata =[]
                    var flag = false;
                    var flowSelectAutoList;
                    if(globalData.prcsType == 4){
                        prcsToBycode += prcsId + ',';
                    }

                    if(prcsToBycode==undefined){
                        $.layerMsg({content:'<fmt:message code="work.th.liucheng" />',icon:2})
                        return;
                    }
                    $.ajax({
                        type: "get",
                        url: "../../workflow/work/findbranch",
                        dataType: 'JSON',
                        data: {
                            flowId:flowId,
                            flowPrcs:prcsToBycode,
                            runId:runId,
                            currentFlowPrcs:prcsId
                        },
                        success: function(obj){
                            var data1 = '';
                            if(obj.flag){
                                flowSelectAutoList = obj.obj
                            }
                            var prcsFlag = '<fmt:message code="lang.th.Process" />';
                            checkPrcOut(JSON.parse(res.opt.formdata),JSON.parse(res.opt.fromDataReject),function(res){
                                if(res.flag){
                                    var tipMsg = '<fmt:message code="main.th.serialNumber" />：'+globalData.flowRun.runId+'，<fmt:message code="workflow.th.job" />：'+globalData.flowRun.runName
                                    if(index == 0){
                                        if(prcsId !=1){
                                            var content = '<div class="modal-body" style="max-height: 274px;">'+
                                                '<div style="border: 1px solid #d6d6d6;border-radius: 5px;margin-bottom: 25px;"><div class="work-prcs-title" id="op_user_show_info" style="margin-bottom: 20px;border: none;height: 22px;line-height: 22px;font-weight: normal;position: relative;"><img src="/img/gzlnum1.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.nextStep" />：<fmt:message code="main.th.currentStep" />'+flowStep+'<fmt:message code="workflow.th.step" /> ('+ globalData.flowTypeModel.flowName+') </span>'+
                                                '<font color="#af0707" style="margin-left: 10px;"><div self_type="self" style="display:inline;">'+globalData.userName+'&nbsp;&nbsp;('+prcsFlag+')&nbsp;&nbsp;<fmt:message code="work.th.step" />'+syncDeal+'</div>'+
                                                '<div style="margin-top: -21px;margin-left: 274px;"></div></font></div><div class="work-prcs-block">'+
                                                '<div class="work-prcs-content clearfix" style=""><div class="workflow-procs-nodes-wrap"><ul id="workPrcsData"  class="workflow-procs-nodes"><li class="workflow-node" style="" id="next_prcs_2">'+
                                                prcsName+'<ol></ol> </li></ul></div><div class="workflow-procs-nodes-result-wrap">'+
                                                '<ul id="work-next-prcs-block" class="workflow-procs-nodes-result" style="top: 0px;">'+workflowpricToArray+
                                                '</ul></div></div></div></div>' +
                                                '<div class="work-msg-block hide" id="viewbox" style="margin-bottom: 25px;display:none;"><div class="work-msg-title"><img src="/img/gzlnum2.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="work.th.add" /></span></div><div class="work-msg-content" style="display: block;position: relative;padding: 15px 10px;"><div class="cytitle">传阅人：</div><div class="clearfix" style="margin-left: 233px;"><textarea name="viewUserName" id="viewUserName" dataid="" username="" readonly="" style="width:468px;height: 60px;"></textarea>&nbsp;<a class="orgAdd" id="viewUserNameSelect" tarobj = "viewUserName" style="color: #3691da;margin-left: 5px;">选择</a>&nbsp;<a class="orgClear"  tarobj = "viewUserName" id="viewUserNameClear" style="color: #3691da;margin-left: 15px;">清空</a></div></div></div>'+
                                                '<div class="work-msg-block"><div class="work-msg-title"><img src="/img/gzlnum3.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.Sendmessage" /></span></div>'+
                                                '<div class="work-msg-content" style="display: block;"><div class="clearfix">'+
                                                '<div data_type="next" class="work-msg-op-title"><div class="gjtitles"><fmt:message code="workflow.th.nextstep" />：</div><span class="addactiveClass sms-check sms-bg sms-bg-static active" style="margin-left: 70px;" data-id="1" title="<fmt:message code="notice.th.remindermessage" />"></span><span class="xuanzhong xuanzhongactive"><fmt:message code="sms.th.remind" /></span><span  class=" mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span data-id="2" class="addactiveClass email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span><span class="xuanzhong xuanzhong1"><fmt:message code="adding.th.duanxin" /></span>'+
                                                '</div>'+
                                                '<div data_type="create" class="work-msg-op-title" style="width: 259px;"><div class="gjtitles"><fmt:message code="workflow.th.Initiator" />：</div><span data-id="3" class="addactiveClass sms-check sms-bg sms-bg-static" style="margin-left: 60px;" title="<fmt:message code="notice.th.remindermessage" />"></span><span class="xuanzhong" style="left: 87px;"><fmt:message code="sms.th.remind" /></span>'+
                                                '<span class=" mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span data-id="4" class="addactiveClass email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span><span class="xuanzhong xuanzhong1" style="left: 183px;"><fmt:message code="adding.th.duanxin" /></span></div>'+
                                                '<div data_type="managers" class="work-msg-op-title" style="margin-right: 0;width:286px;"><div class="gjtitles" ><fmt:message code="doc.th.AllHandlers" />：</div><span data-id="5" class="addactiveClass sms-check sms-bg sms-bg-static" title="<fmt:message code="notice.th.remindermessage" />" style="margin-left: 90px;"></span><span class="xuanzhong" style="    left: 115px;"><fmt:message code="sms.th.remind" /></span> <span class=" mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span data-id="6" class="addactiveClass email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span> <span class="xuanzhong xuanzhong1" style="left: 220px;"><fmt:message code="adding.th.duanxin" /></span></div> </div>'+
                                                '<div class="clearfix" style="position: relative;margin: 10px 0;"><div class="cytitle" style="top: 15px;left: 45px;"><fmt:message code="main.th.RemindHandler" />：</div><div style="margin-left: 233px;"><input type="hidden" name="remind_others_id" id="remind_others_id" value="">'+
                                                '<textarea name="remind_others_name" id="remind_others_name" readonly="" style="width:476px;height: 50px;"></textarea>&nbsp;'+
                                                '<a class="orgAdd" id="others-add" style="color: #3691da;margin-left: 5px;"><fmt:message code="global.lang.select" /></a>&nbsp;<a class="orgClear" style="color: #3691da;margin-left: 5px;" id="others-clear" href="javascript:ClearUser("remind_others_id", "remind_others_name");"><fmt:message code="global.lang.empty" /></a></div>'+
                                                '</div><div class="work-msg-sms-block" style="position: relative;margin-bottom: 10px;"><div class="cytitle" style="top: 15px;left: 115px;"><fmt:message code="main.th.ReminderContent" />：</div><div style="margin-left: 233px;"><textarea style="width: 476px;height: 40px;padding: 7px;" name="SMS_CONTENT" id="SMS_CONTENT">'+tipMsg+'</textarea></div>'+
                                                ' </div></div></div></div>';
                                        }else{
                                            var content = '<div class="modal-body" style="max-height: 274px;">'+
                                                '<div style="border: 1px solid #d6d6d6;border-radius: 5px;margin-bottom: 25px;"><div class="work-prcs-title" id="op_user_show_info" style="margin-bottom: 20px;border: none;height: 22px;line-height: 22px;font-weight: normal;position: relative;"><img src="/img/gzlnum1.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.nextStep" />：<fmt:message code="main.th.currentStep" />'+flowStep+'<fmt:message code="workflow.th.step" /> ('+ globalData.flowTypeModel.flowName+') </span>'+
                                                '<font color="#af0707" style="margin-left: 10px;"><div self_type="self" style="display:inline;">'+globalData.userName+'&nbsp;&nbsp;('+prcsFlag+')&nbsp;&nbsp;<fmt:message code="work.th.step" />'+syncDeal+'</div>'+
                                                '<div style="margin-top: -21px;margin-left: 274px;"></div></font></div><div class="work-prcs-block">'+
                                                '<div class="work-prcs-content clearfix" style=""><div class="workflow-procs-nodes-wrap"><ul id="workPrcsData"  class="workflow-procs-nodes"><li class="workflow-node" style="" id="next_prcs_2">'+
                                                prcsName+'<ol></ol> </li></ul></div><div class="workflow-procs-nodes-result-wrap">'+
                                                '<ul id="work-next-prcs-block" class="workflow-procs-nodes-result" style="top: 0px;">'+workflowpricToArray+
                                                '</ul></div></div></div></div>' +
                                                '<div class="work-msg-block hide" id="viewbox" style="margin-bottom: 25px;display:none;"><div class="work-msg-title"><img src="/img/gzlnum2.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="work.th.add" /></span></div><div class="work-msg-content" style="display: block;position: relative;padding: 15px 10px;"><div class="cytitle">传阅人：</div><div class="clearfix" style="margin-left: 233px;"><textarea name="viewUserName" id="viewUserName" dataid="" username="" readonly="" style="width:468px;height: 60px;"></textarea>&nbsp;<a class="orgAdd" id="viewUserNameSelect" tarobj = "viewUserName" style="color: #3691da;margin-left: 5px;">选择</a>&nbsp;<a class="orgClear"  tarobj = "viewUserName" id="viewUserNameClear" style="color: #3691da;margin-left: 15px;">清空</a></div></div></div>'+
                                                '<div class="work-msg-block"><div class="work-msg-title"><img src="/img/gzlnum3.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.Sendmessage" /></span></div>'+
                                                '<div class="work-msg-content" style="display: block;"><div class="clearfix">'+
                                                '<div data_type="next" class="work-msg-op-title"><div class="gjtitles"><fmt:message code="workflow.th.nextstep" />：</div><span class="addactiveClass sms-check sms-bg sms-bg-static active" style="margin-left: 70px;" data-id="1" title="<fmt:message code="notice.th.remindermessage" />"></span><span class="xuanzhong xuanzhongactive"><fmt:message code="sms.th.remind" /></span><span  class=" mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span data-id="2" class="addactiveClass email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span><span class="xuanzhong xuanzhong1"><fmt:message code="adding.th.duanxin" /></span>'+
                                                '</div>'+
                                                '</div>'+
                                                '<div class="clearfix" style="position: relative;margin: 10px 0;"><div class="cytitle" style="top: 15px;left: 45px;"><fmt:message code="main.th.RemindHandler" />：</div><div style="margin-left: 233px;"><input type="hidden" name="remind_others_id" id="remind_others_id" value="">'+
                                                '<textarea name="remind_others_name" id="remind_others_name" readonly="" style="width:476px;height: 50px;"></textarea>&nbsp;'+
                                                '<a class="orgAdd" id="others-add" style="color: #3691da;margin-left: 5px;"><fmt:message code="global.lang.select" /></a>&nbsp;<a class="orgClear" style="color: #3691da;margin-left: 5px;" id="others-clear" href="javascript:ClearUser("remind_others_id", "remind_others_name");"><fmt:message code="global.lang.empty" /></a></div>'+
                                                '</div><div class="work-msg-sms-block" style="position: relative;margin-bottom: 10px;"><div class="cytitle" style="top: 15px;left: 115px;"><fmt:message code="main.th.ReminderContent" />：</div><div style="margin-left: 233px;"><textarea style="width: 476px;height: 40px;padding: 7px;" name="SMS_CONTENT" id="SMS_CONTENT">'+tipMsg+'</textarea></div>'+
                                                ' </div></div></div></div>';
                                        }
                                    }else{
                                        var content = '<div class="modal-body" style="max-height: 274px;">'+
                                            '<div style="border: 1px solid #d6d6d6;border-radius: 5px;margin-bottom: 25px;"><div class="work-prcs-title" id="op_user_show_info" style="margin-bottom: 20px;border: none;height: 22px;line-height: 22px;font-weight: normal;position: relative;"><img src="/img/gzlnum1.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.nextStep" />：<fmt:message code="main.th.currentStep" />'+flowStep+'<fmt:message code="workflow.th.step" /> ('+ globalData.flowTypeModel.flowName+') </span>'+
                                            '<font color="#af0707" style="margin-left: 10px;"><div self_type="self" style="display:inline;">'+globalData.userName+'&nbsp;&nbsp;('+prcsFlag+')&nbsp;&nbsp;<fmt:message code="work.th.step" />'+syncDeal+'</div>'+
                                            '<div style="margin-top: -21px;margin-left: 274px;"></div></font></div><div class="work-prcs-block">'+
                                            '<div class="work-prcs-content clearfix" style=""><div class="workflow-procs-nodes-wrap"><ul id="workPrcsData"  class="workflow-procs-nodes"><li class="workflow-node" style="" id="next_prcs_2">'+
                                            prcsName+'<ol></ol> </li></ul></div><div class="workflow-procs-nodes-result-wrap">'+
                                            '<ul id="work-next-prcs-block" class="workflow-procs-nodes-result" style="top: 0px;">'+workflowpricToArray+
                                            '</ul></div></div></div></div>' +
                                            '<div class="work-msg-block hide" id="viewbox" style="margin-bottom: 25px;display:none;"><div class="work-msg-title"><img src="/img/gzlnum2.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="work.th.add" /></span></div><div class="work-msg-content" style="display: block;position: relative;padding: 15px 10px;"><div class="cytitle">传阅人：</div><div class="clearfix" style="margin-left: 233px;"><textarea name="viewUserName" id="viewUserName" dataid="" username="" readonly="" style="width:468px;height: 60px;"></textarea>&nbsp;<a class="orgAdd" id="viewUserNameSelect" tarobj = "viewUserName" style="color: #3691da;margin-left: 5px;">选择</a>&nbsp;<a class="orgClear"  tarobj = "viewUserName" id="viewUserNameClear" style="color: #3691da;margin-left: 15px;">清空</a></div></div></div>'+
                                            '<div class="work-msg-block"><div class="work-msg-title"><img src="/img/gzlnum3.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.Sendmessage" /></span></div>'+
                                            '<div class="work-msg-content" style="display: block;"><div class="clearfix">'+
                                            '<div data_type="create" class="work-msg-op-title" style="width: 259px;"><div class="gjtitles"><fmt:message code="workflow.th.Initiator" />：</div><span data-id="3" class="addactiveClass sms-check sms-bg sms-bg-static active" style="margin-left: 60px;" title="<fmt:message code="notice.th.remindermessage" />"></span><span class="xuanzhong xuanzhongactive" style="left: 87px;"><fmt:message code="sms.th.remind" /></span>'+
                                            '<span class=" mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                            '<span data-id="4" class="addactiveClass email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span><span class="xuanzhong xuanzhong1" style="left: 183px;"><fmt:message code="adding.th.duanxin" /></span></div>'+
                                            '<div data_type="managers" class="work-msg-op-title" style="margin-right: 0;width:286px;"><div class="gjtitles" ><fmt:message code="doc.th.AllHandlers" />：</div><span data-id="5" class="addactiveClass sms-check sms-bg sms-bg-static" title="<fmt:message code="notice.th.remindermessage" />" style="margin-left: 90px;"></span><span class="xuanzhong" style="    left: 115px;"><fmt:message code="sms.th.remind" /></span> <span class=" mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                            '<span data-id="6" class="addactiveClass email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span> <span class="xuanzhong xuanzhong1" style="left: 220px;"><fmt:message code="adding.th.duanxin" /></span></div> </div>'+
                                            '<div class="clearfix" style="position: relative;margin: 10px 0;"><div class="cytitle" style="top: 15px;left: 45px;"><fmt:message code="main.th.RemindHandler" />：</div><div style="margin-left: 233px;"><input type="hidden" name="remind_others_id" id="remind_others_id" value="">'+
                                            '<textarea name="remind_others_name" id="remind_others_name" readonly="" style="width:476px;height: 50px;"></textarea>&nbsp;'+
                                            '<a class="orgAdd" id="others-add" style="color: #3691da;margin-left: 5px;"><fmt:message code="global.lang.select" /></a>&nbsp;<a class="orgClear" style="color: #3691da;margin-left: 5px;" id="others-clear" href="javascript:ClearUser("remind_others_id", "remind_others_name");"><fmt:message code="global.lang.empty" /></a></div>'+
                                            '</div><div class="work-msg-sms-block" style="position: relative;margin-bottom: 10px;"><div class="cytitle" style="top: 15px;left: 115px;"><fmt:message code="main.th.ReminderContent" />：</div><div style="margin-left: 233px;"><textarea style="width: 476px;height: 40px;padding: 7px;" name="SMS_CONTENT" id="SMS_CONTENT">'+tipMsg+'</textarea></div>'+
                                            ' </div></div></div></div>'
                                    }
                                    
                                    layer.open({
                                        type: 1,
                                        /* skin: 'layui-layer-rim', //加上边框 */
                                        area: ['880px', '580px'],
                                        closeBtn: 0,
                                        title:titleName,
                                        content: content,
                                        btn:['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'],
                                        success: function(layero,index){

                                            var firtnode = $('#next_prcs_2 .prcsName_chang');
                                            if(firtnode.attr('prcsid') == '0'){
                                                $('#work-next-prcs-block').hide();
                                            }

                                            if(globalData.isViewPriv == '1'){
                                                $('#viewbox').show();
                                                var userid = [];
                                                var username = [];
                                                if(globalData.listView){
                                                    globalData.listView.forEach(function(v,i){
                                                        userid.push(v.userId);
                                                        username.push(v.userName);
                                                    });
                                                }

                                                $('#viewUserName').attr('dataid',userid.join(','));
                                                $('#viewUserName').attr('username',username.join(','));
                                                $('#viewUserName').val(username.join(','));
                                                $('#viewUserNameSelect').click(function(){
                                                    user_id = 'viewUserName';
                                                    $.popWindow("../../common/selectUser");
                                                });
                                                $('#viewUserNameClear').click(function(){
                                                    $('#viewUserName').val('');
                                                    $('#viewUserName').attr('username','');
                                                    $('#viewUserName').attr('dataid','');
                                                    $('#viewUserName').attr('user_id','');
                                                    $('#viewUserName').attr('userprivname','');
                                                })

                                                $('#others-clear').click(function(){
                                                    $('#remind_others_name').val('');
                                                    $('#remind_others_name').attr('username','');
                                                    $('#remind_others_name').attr('dataid','');
                                                    $('#remind_others_name').attr('user_id','');
                                                    $('#remind_others_name').attr('userprivname','');
                                                })
                                            }
                                            $('.xuanzhong').click(function(){
                                                $(this).prev().click();
                                            })
                                            $('.addactiveClass').click(function () {
                                                if($(this).hasClass('active')){
                                                    $(this).removeClass('active');
                                                    $(this).next().removeClass('xuanzhongactive');
                                                }else {
                                                    $(this).addClass('active');
                                                    $(this).next().addClass('xuanzhongactive');
                                                }
                                            });
                                            //调取选人控件
                                            $('#work-next-prcs-block').on('click','.userSelectBtn',function(){
                                                var pid = $(this).attr('pid');
                                                UserItemMain = 'remind_name_'+pid;
                                                UserItem = 'jingban_'+pid;
                                                var option = flowSelectAutoList[pid];
                                                prcsPrivlist = option.prcsPrivlist;
                                                prcsUserlist = option.prcsUserlist;
                                                prcsDeptlist = option.prcsDeptlist;
                                                $.popWindow("../../common/selectUserWorkFlow");
                                            });
                                            $('#workPrcsData .prcsName').each(function(){
                                                var _this = $(this);
                                                var prcsid = _this.attr('prcsid');
                                                var obj = flowSelectAutoList[prcsid] || {};
                                                var autoTypelist = obj.autoTypelist || [] ;
                                                var mainprcName = '';
                                                var mainprcId = '';
                                                var overprcName = '';
                                                var overprcId = '';
                                                if(autoTypelist && (autoTypelist instanceof Array)) {
                                                    autoTypelist.forEach(function (v, i) {
                                                        mainprcName += v.userName + ',';
                                                        mainprcId += v.userId + ',';
                                                        overprcName = v.userName + ',';
                                                        overprcId += v.userId + ',';
                                                    });
                                                }
                                                $('#remind_name_'+prcsid).val(mainprcName);
                                                $('#remind_name_'+prcsid).attr('user_id',mainprcId);
                                                $('#jingban_'+prcsid).val(overprcName);
                                                $('#jingban_'+prcsid).attr('user_id',overprcId);
                                            });
                                            //底部选择人员
                                            $('#others-add').on('click',function(){
                                                user_id='remind_others_name';
                                                $.popWindow("../../common/selectUser");
                                            });

                                            //点击下一步骤，样式的改变
                                            if(globalData.flowProcesses.syncDeal == 2){//强制并发
                                                $('#work-next-prcs-block li').show();
                                            }else if(globalData.flowProcesses.syncDeal == 1){//允许并发
                                                $('.workflow-procs-nodes-wrap').on('click','.prcsName',function(){
                                                    var _this = $(this);
                                                    if(_this.find('.tipmsg').length>0){
                                                        var msg = _this.find('.tipmsg').attr('msg') || '不符合条件！';
                                                        $.layerMsg({content:msg,icon:0},function(){

                                                        });
                                                    }else{
                                                        if(nextFlowid != 0){
                                                            var nextFlowid = _this.attr("prcsid");
                                                            if(_this.attr('class').indexOf('prcsName_chang') == -1){
                                                                _this.addClass('prcsName_chang');
                                                                _this.attr('check','1');
                                                                $('#userSelectBtn_'+nextFlowid).show();
                                                            }else{
                                                                if($('.prcsName_chang').length>1){
                                                                    _this.removeClass('prcsName_chang');
                                                                    _this.attr('check','0');
                                                                    $('#userSelectBtn_'+nextFlowid).hide();
                                                                }
                                                            }
                                                        }
                                                    }
                                                });
                                            }else{
                                                $('.workflow-procs-nodes-wrap').on('click','.prcsName',function(){
                                                    var _this = $(this);
                                                    if(_this.find('.tipmsg').length>0){
                                                        var msg = _this.find('.tipmsg').attr('msg') || '不符合条件！';
                                                        _this.find('.tipmsg').hide();
                                                        $.layerMsg({content:msg,icon:0},function(){

                                                        });
                                                    }else{
                                                        if(nextFlowid != 0){
                                                            _this.siblings().removeClass('prcsName_chang');
                                                            _this.addClass('prcsName_chang');
                                                            _this.siblings().attr('check','0');
                                                            _this.attr('check','1');
                                                            var nextFlowid = _this.attr("prcsid");
                                                            $('#work-next-prcs-block .workflow-node-result').hide();
                                                            $('#userSelectBtn_'+nextFlowid).show();
                                                        }else{
                                                            $('#work-next-prcs-block').hide();
                                                        }
                                                    }
                                                })
                                            }
                                        },
                                        yes: function(index, layero){
                                            var layerLoadindex = layer.load();
                                            //按钮【按钮三】的回调
                                            //新建工作之后的保存接口，跳转到我的工作页面
                                            var ret=globalData.flowRun;
                                            var ret3=globalData.flowRunPrcs;
                                            var pId = [];
                                            var beginUser = [];
                                            var jingbanUser = [];
                                            var flag = true;
                                            var viewUser = $('#viewUserName').attr('dataid') ||''
                                            $('#workPrcsData .prcsName_chang').each(function(){
                                                var prcsid = $(this).attr('prcsid');
                                                pId.push(prcsid);
                                                var bu = $('#remind_name_'+prcsid).attr('user_id');
                                                if(bu == ''){
                                                    flag = false;
                                                }
                                                if(bu && bu.indexOf(',') > -1){
                                                    bu = bu.split(',')[0];
                                                }
                                                beginUser.push(bu);
                                                jingbanUser.push($('#jingban_'+prcsid).attr('user_id'));
                                            });
                                            beginUser = beginUser.join(',');
                                            if(globalData.topDefault == 1||globalData.topDefault == 2){
                                                beginUser = "";
                                            }
                                            if( !flag &&$('#next_prcs_2 .prcsName_chang').find('h1').text()!='<fmt:message code="main.th.EndProcess" />'){
                                                $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:0},function(){
                                                    layer.close(layerLoadindex);
                                                    return false;
                                                });
                                            }else{

                                                if($('#next_prcs_2 .prcsName_chang').find('h1').text()=='<fmt:message code="main.th.EndProcess" />'){
                                                    savedData={
                                                        flowId:ret.flowId,
                                                        runId:ret.runId,
                                                        runName:ret.runName,
                                                        beginTime:ret.beginTime,
                                                        beginUser:beginUser,
                                                        prcsId:ret3.prcsId,
                                                        prcsflag:1,
                                                        flowPrcs:pId.join(','),
                                                        jingbanUser:jingbanUser.join('|'),
                                                        tableName:tableName,
                                                        tabId:tabId,
                                                        currentPrcsId:prcsId,
                                                        flowStep:flowStep,
                                                        viewUser:viewUser,
                                                        topDefault:globalData.topDefault
                                                    }
                                                }else{
                                                    savedData={
                                                        flowId:ret.flowId,
                                                        runId:ret.runId,
                                                        runName:ret.runName,
                                                        beginTime:ret.beginTime,
                                                        beginUser:beginUser,
                                                        prcsId:ret3.prcsId,
                                                        flowPrcs:pId.join(','),
                                                        prcsflag:1,
                                                        jingbanUser:jingbanUser.join('|'),
                                                        tableName:tableName,
                                                        tabId:tabId,
                                                        currentPrcsId:prcsId,
                                                        flowStep:flowStep,
                                                        viewUser:viewUser,
                                                        topDefault:globalData.topDefault
                                                    }
                                                }
                                                var smsTypes=''
                                                var smsTypesArr=$('.addactiveClass');
                                                for(var i=0;i<smsTypesArr.length;i++){
                                                    if($(smsTypesArr[i]).hasClass('active')){
                                                        smsTypes+=$(smsTypesArr[i]).attr('data-id')+','
                                                    }else {
                                                        smsTypes+=','
                                                    }
                                                }
                                                savedData.smsType=smsTypes;
                                                savedData.smsContent=$('#SMS_CONTENT').val()
                                                savedData.orgAdd=$('#remind_others_name').attr('user_id')
                                                //保存的接口
                                                $.ajax({
                                                    type: "post",
                                                    url: "../../workflow/work/saveWork",
                                                    dataType: 'JSON',
                                                    data: savedData,
                                                    success: function (obj) {
                                                        if(obj.flag==true){
                                                            layer.close(layerLoadindex);

                                                            $.layerMsg({content:'<fmt:message code="workflow.turn.ok" />',icon:1},function(){
                                                                   if(  parent.opener.openRold!=undefined){
                                                                       parent.opener.openRold()
                                                                   }
                                                                window.close();
                                                                parent.opener.runWorkListPage();
                                                                //parent.opener.location.href='workList';
                                                            });
                                                        }else{
                                                            layer.close(layerLoadindex);
                                                            $.layerMsg({content:'<fmt:message code="meet.th.SaveFailed" />！',icon:1},function(){

                                                            });
                                                        }
                                                    }
                                                });

                                            }
                                        },
                                        btn2:function (index) {
                                            if(zw.window.showRight!=undefined){
                                                zw.window.showRight();
                                            }
                                        }
                                    });
                                }else{
                                    $.layerMsg({content:res.msg,icon:0},function(){

                                    });
                                }
                            });
                        }
                    });
                });
            });
            function otherFlowRflect(tableName,tableId,runId){
                if(tableName && tableName!='' && tableId!='' && runId !=''){
                    $.ajax({
                        type: "post",
                        url: "../../tigger/modifyFieldProperties",
                        dataType: 'JSON',
                        data: {
                            tableName:tableName,
                            id:tableId,
                            runId:runId
                        },
                        success: function(res){
                            //console.log(res);
                        }
                    })
                }
            }

        });
    </script>
    <script type="text/javascript">
        var TANGER_OCX_OBJ;
        function init()
        {
            TANGER_OCX_OBJ=document.getElementById("TANGER_OCX");
            TANGER_OCX_OBJ.activate(true);
            if(window.navigator.platform=="Win64"){
                TANGER_OCX_OBJ.AddDocTypePlugin(".pdf","PDF.NtkoDocument","4.0.0.2","../../lib/officecontrol/ntkooledocallx64.cab",51,true);
            }else{
                TANGER_OCX_OBJ.AddDocTypePlugin(".tif","tif.NtkoDocument","4.0.0.2","../../lib/officecontrol/ntkooledocall.cab",51,true);
                TANGER_OCX_OBJ.AddDocTypePlugin(".pdf","PDF.NtkoDocument","4.0.0.2","../../lib/officecontrol/ntkooledocall.cab",51,true);
            }
            TANGER_OCX_OBJ.CreateNew("word.document");
        }
        /*
         *  func 从本地附件套红功能filename='C:\Users\gsb\Desktop\test.dot'
         *  string filename 必选  本地模板的路径
         *  bool [PromptSelect] 是否允许用户选择
         *  bool [IsConfirmConversions] 当模板文件不是WORD类型时，是否提示转换，默认true
         * */
        function red_chromatography_local(){//套红
            //AddTemplateFromLocal(filename, [PromptSelect], [IsConfirmConversions]);
            var filename = 'test.dot';
            TANGER_OCX_OBJ.AddTemplateFromLocal(filename);//此处不能为空，必须带一个参数
        }
        /*
         *  func 从url套红功能
         *  string URL 必选  远程模板文件URL
         *  bool [IsConfirmConversions] 当模板文件不是WORD类型时，是否提示转换，默认true
         * */
        function red_chromatography_url(){//套红可用，加载服务器资源下的，路径如下
            //TANGER_OCX_OBJ.AddTemplateFromURL(URL,[IsConfirmConversions]);
            var URL='/file/pjc/test.dot';
            TANGER_OCX_OBJ.AddTemplateFromURL(URL);
        }
        /*
         * 进入或者退出保留痕迹
         * bool vbool 是否保留痕迹
         * */
        /*function TrackRevisions(vbool){
         //var vbool = $('#TrackRevisions option:selected').val();
         TANGER_OCX_OBJ.TrackRevisions(vbool);
         }*/
        /*
         * 强制进入或者退出保留痕迹
         * bool vbool 是否保留痕迹
         * */
        function EnterRevisionMode(id){
            // var vbool = $('#TrackRevisions option:selected').val();
            var domID = document.getElementById(id);
            var vbool = domID.value;
            TANGER_OCX_OBJ.EnterRevisionMode(vbool);
        }
        /*
         * 该函数使用HTTP协议将文件保存到URL
         * string URL 处理后台保存的URL地址
         * String FileFieldName 控件文件域名称
         * string FileName 文件名
         * bool IsShowUI 是否显示进度条
         * return 提交URL之后从服务器返回的数据
         * */
        function SaveToURL(){
            //TANGER_OCX_OBJ.SaveToURL("/upload","DocFile","","NewDoc.doc",1);
            TANGER_OCX_OBJ.SaveToURL("../../upload?module=email","file","","/file/pjc/test.dot","upload_file");
        }
        /*
         * string SaveAsDocument 保存到本地的文档路径 可选
         * bool OverwriteExisting 是否覆盖现文件 可选
         * bool isPrompt 是否提示用户选择 可选
         * */
        function SaveToLocal(){//可用
            //TANGER_OCX_OBJ.SaveToLocal([SaveAsDocument], [OverwriteExisting], [isPrompt]);
            var SaveAsDocument = 'D:/test1.doc';
            TANGER_OCX_OBJ.SaveToLocal(SaveAsDocument);
        }
        //打印功能
        function doc_print(){
            //alert("a")；
            TANGER_OCX_OBJ.PrintPreview();
            TANGER_OCX_OBJ.PrintOut();

        }
    </script>
</div>
</body>
</html>