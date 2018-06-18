<%--需把局部样式归并为一个通用或符合公告管理的公共样式，
接口对完需调整--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html style="height:100%;">
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <title>合同管理</title>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <!-- word文本编辑器 -->
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <style>
        .headli4 {
            width: 120px;
            display: inline-block;
            text-align: center;
        }

        #cont_total td {
            color: #000;
            font-weight: normal;
        }

        .notice_type {
            width: 61px;
        }

        .notice_do {
            width: 168px;
        }

        table {
            table-layout: fixed;
        }

        #tr_td tr td.publishtip {
            overflow: hidden;
            text-overflow: ellipsis;
            height: 40px;
            width: 40px;
            white-space: nowrap;
        }

        #add_send {
            display: inline-block;
            float: left;
            width: 66px;
            height: 30px;
            margin-right: 40px;
            margin-top: 10px;
            margin-bottom: 20px;
            background: url(../../img/publish.png) no-repeat;
            padding-left: 23px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
        }

        #add_baocun {
            display: inline-block;
            float: left;
            width: 66px;
            height: 30px;
            margin-right: 40px;
            margin-top: 10px;
            margin-bottom: 20px;
            background: url(../../img/save.png) no-repeat;
            padding-left: 23px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
        }

        #add_titileTime {
            text-align: left;
        }


        .foot_mg {
            width: 57%;
            height: 50px;
            margin: 20px auto;
        }

        .start_end_time {
            display: inline-block;
            float: left;
            border: none;
            width: 400px;
            height: 20px;

        }

        .td_title1 {
            border: none !important;
            color: #000 !important;
        }

        .step2 {
            margin-left: 2%;
        }

        .news_t {
            width: 139px !important;
        }

        .news_t h1, .news_two h1 {
            line-height: 23px;
            text-align: center;
        }

        .news_two {
            width: 139px;
            margin-top: 3px;
        }

        .add_print, .add_down, .add_nochose {
            float: left;
            margin-top: 10px;
        }

        .add_print, .add_down {
            width: 152px;

        }

        .add_nochose {
            width: 195px;
            text-align: center;
            line-height: 20px;
        }

        .add_print h1, .add_down h1 {
            color: #000;
            line-height: 20px;
            text-align: center;
        }

        .add_show, .textTop {
            float: left;
        }

        .add_show {
            line-height: 24px;
            /* text-align: -webkit-auto; */
            text-align: center;
        }

        .zhiding {
            margin-top: 3px;
        }

        .title a {
            color: #59b7fb;
        }

        .titleOne {
            width: 148px;
        }

        .find_detail {
            cursor: pointer;
        }

        /*标题长时隐藏设置*/
        .title {
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }

        .notice_change, .notice_delete, #add_send, #add_baocun, .release3 {
            cursor: pointer;
        }

        .release3 {
            margin-top: 0px !important;
            line-height: 26px;
        }

        .caozuo a:hover {
            color: #287fe0;
        }

        .notice_geshi {
            display: block;
            margin-top: -46px;
            margin-left: 79px;
        }

        #add_type_notice, .notice_type {
            float: left;
        }

        /*修改的字体*/
        .notice_change {
            color: #1772c0;
            margin-left: 5px;
        }

        .notice_change:hover {
            color: #287fe0 !important;
        }

        /*删除的字体*/
        .notice_delete {
            color: #e01919;
            margin-left: 5px;
        }

        .notice_delete:hover {
            color: #C81623 !important;
        }

        .notice_zhongzhi {
            color: #1772c0;
            margin-left: 5px;
        }

        .center .login .icons div {
            margin-left: 9px !important;
        }

        .icons div {
            display: inline-block;
            float: left;
            height: 30px;
            line-height: 30px;
            width: 56px;
            text-align: center;
            margin-right: 15px;
            /*        background: url(../../img/gobbing.png) no-repeat;*/
            cursor: pointer;
            padding-left: 20px;
        }

        #daochu {
            background: url(../../img/news/new_export.png) no-repeat;
        }

        #btn_query {
            background: url(../img/file/cabinet03.png) no-repeat;
        }

        #new_change {
            background: url(../../img/gobbing.png) no-repeat;
        }

        #find_delete {
            background: url(../../img/btn_delete.png) no-repeat;
        }

        .icons h2 {
            text-align: center;
            width: 71%;
        }

        table tr td input {
            height: 25px;
            border: #ccc 1px solid;
            padding-left: 5px;
        }

        .last_str {
            cursor: pointer;
        }

        .bgcolor {
            background: #c5e9fb !important;
            color: #000000;
        }

        /*置顶一系列按钮的背景图片*/
        .notice_top {
            background: url(../../img/btn_top.png) 23px 10px no-repeat;
            text-align: center;
            font-size: 12px;
        }

        /*取消置顶*/
        .notice_notop {
            background: url(../../img/btn_canceltop.png) 8px 10px no-repeat;
            text-align: center;
            font-size: 12px;
        }

        /*选中删除*/
        .delete_check {
            background: url(../../img/btn_deleteannounce.png) 19px 10px no-repeat;
            text-align: center;
            font-size: 12px;
        }

        /*全部删除*/
        .delete_all {
            background: url(../../img/btn_deleteannounce.png) 9px 10px no-repeat;
            text-align: right;
            font-size: 12px;
        }

        #find_start, #find_end {
            height: 20px;
            line-height: 20px;
            width: 130px;
            /* margin-left: -4.2px; */
            margin-top: 20px;
            cursor: pointer;
        }

        .orgAdd {
            color: rgb(32, 123, 214);
            padding-left: 12px;
            background: url(../../img/org_select.png) 0px 0px no-repeat;
            background-position: 0px 0px;
            cursor: pointer;
        }

        .orgClear {
            color: rgb(154, 169, 184);
            padding-left: 12px;
            margin-left: 5px;
            background: url(../../img/org_select.png) 0px -60px no-repeat;
            background-position: 0px -60px;
            cursor: pointer;
        }

        .navigation {
            display: inline-block;
            float: left;
            width: 96% !important;
            margin-left: 2%;
        }

        /*  #find_end{
              margin-left:20px;
          }*/
        .tbody_th {
            background-color: #fff;
            font-size: 15px !important;
            color: #2F5C8F !important;
            font-weight: bold !important;
            border: 0px !important;
            width: 6% !important;
        }

        .th {
            cursor: pointer;
        }

        html, body, .bx {
            width: 100%;
            height: 100%;
        }
        /*右侧整体内容*/
        .bx::-webkit-scrollbar,.people_wenjian::-webkit-scrollbar{
            width: 0px;
            height: 16px;
            background-color: #f5f5f5;
        }
        /*定义滚动条的轨道，内阴影及圆角*/
        .bx::-webkit-scrollbar-track,.people_wenjian::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        /*定义滑块，内阴影及圆角*/
        .bx::-webkit-scrollbar-thumb,.people_wenjian::-webkit-scrollbar-thumb{
            width: 0px;
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }
        /*右侧整体内容*/
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
        .head .headli3 {
            margin-top: 0px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="bx">
    <!--标题栏-->
    <div class="head w clearfix" style="height: 45px;padding-bottom: 0px;">
        <ul class="index_head">
            <li url="contractStraff">
                <span class="one headli1_1"><fmt:message code="hr.th.contractManagement" /></span>
                <img class="headli1_2" src="../../img/twoth.png" alt=""/>
            </li>
            <li url="contractNew">
                <span class="headli2_1">
                <fmt:message code="hr.th.NewContractInformation" />
                </span>
                <img src="../../img/twoth.png" alt="" class="headli2_2"/>
            </li>

            <li url="contractQuery">
                <span class="headli3">
              <fmt:message code="hr.th.ContractInformationInquiry" />
                </span>
                <img src="../../img/twoth.png" alt="" class="headli2_2"/></li>
     <%--       <li &lt;%&ndash;url="contractInOut"&ndash;%&gt;>
                <span class="headli4" id="ExportSpan">
               批量导入导出
                </span>
                <img src="../../img/twoth.png" alt="" class="headli2_2"/></li>--%>
            <li url="contractDueQuery">
                <span class="headli4" id="ExportSpan_1">
              <fmt:message code="hr.th.TrialExpirationQuery" />
                </span>
                <img src="../../img/twoth.png" alt="" class="headli2_2"/></li>
            <li url="contractUp">
                <span class="headli4" id="ExportSpan_2" >
               <fmt:message code="hr.th.ContractExpirationInquiry" />
                </span>
                <%--<img src="../../img/twoth.png" alt="" class="headli2_2"/></li>--%>
        <%--    <li url="&lt;%&ndash;noContract&ndash;%&gt;">
                <span class="headli4" id="ExportSpan_3">
               未签劳动合同
                </span>
            </li>--%>
        </ul>
    </div>

    <div style="width:100%;height:100%;">
        <iframe class="contract_iframe" src="contractStraff" frameborder="0" width="100%" height="100%"></iframe>
    </div>
</div>

</div>
<script>

    function Refillings(id) {
        document.getElementById(id).reset();
    };
	
	 function show(){
        $('.index_head li').eq(0).find('span').addClass('one').parent().siblings().find('span').removeClass('one')
    }

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
    $('#ExportSpan').click(function(){
        layer.msg('<fmt:message code="sup.th.UnderDevelopment" />', {icon: 6});
    });
  /*  $('#ExportSpan_1').click(function(){
        layer.msg('正在开发中', {icon: 6});
    });*/
   /* $('#ExportSpan_2').click(function(){
        layer.msg('正在开发中', {icon: 6});
    });*/
    $('#ExportSpan_3').click(function(){
        layer.msg('<fmt:message code="sup.th.UnderDevelopment" />', {icon: 6});
    });



</script>
</body>
</html>