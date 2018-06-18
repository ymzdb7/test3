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
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css" />
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <!-- 新闻管理  -->
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
    <style type="text/css">
        span.host-span {
            padding-left: 12px;
        }
        span.host-span{color: #1772c0;}
        .daochu{color: #1772c0;}
        .shanchu{color:#e01919;}
        .operation_text_left {
            padding-left: 20px;
        }
        .operation_text_left {
            padding-left: 20px;
        .button-operation {
            float: left;
            padding-top: 4px;
            padding-bottom: 10px;
        }

        .navigation .right {
            float: right;
            margin-top: -141px;
        }

        .btn-success {
            border: 1px solid #359947;
            color: #ffffff;
            background-color: #35aa47;
            background-image: -moz-linear-gradient(top, #35aa47, #35aa47);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#35aa47), to(#35aa47));
            background-image: -webkit-linear-gradient(top, #35aa47, #35aa47);
            background-image: -o-linear-gradient(top, #35aa47, #35aa47);
            background-image: linear-gradient(to bottom, #35aa47, #35aa47);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff35aa47', endColorstr='#ff35aa47', GradientType=0);
            filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
            width: 100px;
            height: 35px;
        }
        .btn-danger {
            border: 1px solid #c6322a;
            color: #ffffff;
            background-color: #d84a38;
            background-image: -moz-linear-gradient(top, #dd4b39, #d14836);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#dd4b39), to(#d14836));
            background-image: -webkit-linear-gradient(top, #dd4b39, #d14836);
            background-image: -o-linear-gradient(top, #dd4b39, #d14836);
            background-image: linear-gradient(to bottom, #dd4b39, #d14836);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffdd4b39', endColorstr='#ffd14836', GradientType=0);
            filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
            width: 100px;
            height: 35px;
        }
        form {
            margin: 0 0 20px;
        }
        .btn-info {
            border: 1px solid #46b8da;
            color: #ffffff;
            background-color: #5bc0de;
            cursor: pointer;
            background-image: -moz-linear-gradient(top, #5bc0de, #5bc0de);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#5bc0de), to(#5bc0de));
            background-image: -webkit-linear-gradient(top, #5bc0de, #5bc0de);
            background-image: -o-linear-gradient(top, #5bc0de, #5bc0de);
            background-image: linear-gradient(to bottom, #5bc0de, #5bc0de);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5bc0de',endColorstr='#ff5bc0de',GradientType=0);
            filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
            width: 100px;
            height: 35px;
        }
        .step1_title {
            width: 6%;
            display: inline-block;
            float: left;
            margin-top: 28px;
        }
        .navigation {
            heihgt: 70px;
            /* display: inline-block; */
            /* float: left; */
            width:100%;
        }
        .navigation .left .news {
            /* font-size: 14px; */
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
            margin-top: 5px;
        }
        .navigation .left img {
            float: left;
            margin-top: 30px;
            margin-right: 5px;
            width: 25px;
            height: 24px;
        }
        .ui-state-default, .ui-widget-content .ui-state-default, .ui-widget-header .ui-state-default {
            background-color: #f5f5f4;
            background-image: none;
        }
        .ui-state-default, .ui-widget-content .ui-state-default, .ui-widget-header .ui-state-default th {
            border-bottom: 0px;
        }

        .ui-state-default, .ui-widget-content .ui-state-default, .ui-widget-header .ui-state-default {
            border: 1px solid #d3d3d3;
            background: #f5f5f5 url(images/fhbg.gif) 50% 50% repeat-x;
            font-weight: normal;
            color: #555555;
        }
        .ui-jqgrid .ui-jqgrid-hdiv {
            position: relative;
            margin: 0em;
            padding: 0em;
            overflow-x: hidden;
            border-left: 0px none !important;
            border-top: 0px none !important;
            border-right: 0px none !important;
        }
        .ui-jqgrid .ui-jqgrid-view, .ui-jqgrid .ui-jqgrid-pager {
            font-family: inherit;
        }
        .ui-jqgrid .ui-jqgrid-view, .ui-jqgrid .ui-jqgrid-pager {
            background-color: #fff;
            font-family: Microsoft YaHei,Simsun,Verdana,Arial,sans-serif;
            font-size: 9pt;
        }
        #gbox_gridTable {
            border: 1px solid #d3d3d3;
            -moz-border-radius: 2px, 2px, 0px, 0px;
            -webkit-border-radius: 2px, 2px, 0px, 0px;
            border-radius: 4px 4px 0px 0px;
        }
        .ui-jqgrid {
            border-left: 1px solid #d3d3d3;
            border-right: 1px solid #d3d3d3;
        }

        .ui-jqgrid {
            position: relative;
        }
        .head {
            border-bottom: 1px solid #9E9E9E;
            padding-bottom: 3px;
            height: 43px;
            background-color:#e4eff8;
        }
        .head li {
            width: 120px;
            text-align: center;
            height: 28px;
            line-height: 28px;
            display: inline-block;
            float: left;
            font-family: "微软雅黑";
            font-size: 14px;
            margin-left: 20px;
            margin-top: 6px;
            cursor: pointer;
        }
        .index_head li{
            border-right: 1px solid #b4c1ca;
            height: 37px;
        }
        .index_head li:hover{
            background-color: #F5F5F5;
            padding-bottom: 6px;
            color: blue;
            border: 0px;
            cursor: pointer;
        }

    </style>
    <style type="text/css">
        .search_area {
            padding: 8px 0px;
            margin: 0 auto;
            text-align: center;
            margin-top: 0px;
            background-color: #f5f5f5;
            border-bottom: 1px solid #dddddd;
        }
        .search_area {
            padding: 8px 0px;
            margin: 0 auto;
            text-align: center;
            margin-top: 0px;
            background-color: #f5f5f5;
            border-bottom: 1px solid #dddddd;
        }
        .form-search .input-append{
            margin-bottom: 0;
        }
        .form-search .input-append{
            display: inline-block;
            margin-bottom: 0;
            vertical-align: middle;
        }
        .form-search .input-append .search-query {
            -webkit-border-radius: 14px 0 0 14px;
            -moz-border-radius: 14px 0 0 14px;
            border-radius: 14px 0 0 14px;
        }
        .search_normal .input-append .btn {
            vertical-align: middle;
            /* background-color: #f5f5f4; */
        }
        input.search-query {
            padding-right: 14px;
            padding-right: 4px \9;
            padding-left: 14px;
            padding-left: 4px \9;
            margin-bottom: 0;
        }
        .btn-primary {
            border: 1px solid #3079ed;
            color: #ffffff;
            background-color: #4b8cf7;
            background-image: -moz-linear-gradient(top, #4d90fe, #4787ed);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#4d90fe), to(#4787ed));
            background-image: -webkit-linear-gradient(top, #4d90fe, #4787ed);
            background-image: -o-linear-gradient(top, #4d90fe, #4787ed);
            background-image: linear-gradient(to bottom, #4d90fe, #4787ed);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff4d90fe', endColorstr='#ff4787ed', GradientType=0);
            filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
        }
        input.span4, textarea.span4,.uneditable-input.span4 {
            width: 286px;
        }
        .span4 search-query{
            width:316px;
            height:30px;
        }
        .daochuwork{width:110px !important;}
        .btn_checked {
            position: relative;
            padding: 4px 12px;
            margin: 0;
            color: #333;
            text-shadow: 0 1px 0 #fff;
            white-space: nowrap;
            font-family: Simsun, Arial, sans-serif;
            font-weight: bold;
            font-size: 13px;
            text-align: center;
            vertical-align: middle;
            -webkit-background-clip: padding;
            -moz-background-clip: padding;
            background-clip: padding;
            cursor: default;
            background-color: #f3f3f3;
            background-image: -moz-linear-gradient(top, #f5f5f5, #f1f1f1);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#f5f5f5), to(#f1f1f1));
            background-image: -webkit-linear-gradient(top, #f5f5f5, #f1f1f1);
            background-image: -o-linear-gradient(top, #f5f5f5, #f1f1f1);
            background-image: linear-gradient(to bottom, #f5f5f5, #f1f1f1);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff5f5f5', endColorstr='#fff1f1f1', GradientType=0);
            border: 1px solid #dcdcdc;
            -webkit-border-radius: 2px;
            -moz-border-radius: 2px;
            border-radius: 2px;
            -webkit-box-shadow: none;
            -moz-box-shadow: none;
            box-shadow: none;
        }
        #table1 {
            border-collapse: collapse;
            border-spacing: 0;
            margin-top: 6px;
            width: 700px;
            float: left;
        }
        .inp {
            height: 24px;
            width: 200px;
            height: 27px;
            border-radius: 6px;
            margin-top: 16px;
            margin-left: 97px;
        }
        .inp, .search {
            float: left;
        }
        .navigation .right {
            float: right;
            margin-top: 0px;
        }
        .subsearch {
            width: 80px;
            height: 33px;
            line-height: 28px;
            margin-top: 18px;
            margin-left: 10px;
            text-align: center;
            background-image: url(../../img/center_q.png);
            background-repeat: no-repeat;
            color: #000;
            cursor: pointer;
            font-family: "微软雅黑";
        }
        .button-operation {
            float: left;
            padding-top: 4px;
            padding-bottom: 10px;
        }
        .btn-success {
            border: 1px solid #359947;
            color: #ffffff;
            background-color: #35aa47;
            background-image: -moz-linear-gradient(top, #35aa47, #35aa47);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#35aa47), to(#35aa47));
            background-image: -webkit-linear-gradient(top, #35aa47, #35aa47);
            background-image: -o-linear-gradient(top, #35aa47, #35aa47);
            background-image: linear-gradient(to bottom, #35aa47, #35aa47);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff35aa47', endColorstr='#ff35aa47', GradientType=0);
            filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
            height: 30px;
            width: 85px;
        }
        .btn-info {
            border: 1px solid #46b8da;
            color: #ffffff;
            background-color: #5bc0de;
            cursor: pointer;
            background-image: -moz-linear-gradient(top, #5bc0de, #5bc0de);
            background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#5bc0de), to(#5bc0de));
            background-image: -webkit-linear-gradient(top, #5bc0de, #5bc0de);
            background-image: -o-linear-gradient(top, #5bc0de, #5bc0de);
            background-image: linear-gradient(to bottom, #5bc0de, #5bc0de);
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5bc0de', endColorstr='#ff5bc0de', GradientType=0);
            filter: progid:DXImageTransform.Microsoft.gradient(enabled = false);
            height: 29px;
            width: 82px;
        }
        .head .one {
            background-color: #2F8AE3;
            font-size: 14px;
            color: #ffffff;
            border-radius: 20px;
        }
        .font-green {
            color: green;
        }
        tr td{
            font-size:13px;
        }
        .step{
            margin-left: 15px;
        }
        .wenhao:hover{
            cursor: pointer;
            color: #2f8ae3;
        }
        .bjtitle:hover{
            cursor: pointer;
            color: #2f8ae3;
        }
        .alerthtml:hover{cursor: pointer;color: #2f8ae3;}
        .hidden{display: none;}
        .flowtype{  cursor: pointer;  }
        .flowtype:hover{  cursor: pointer; color: #1772c0 }
        .flowtitle{  cursor: pointer;  }
        .flowtitle:hover{  cursor: pointer; color: #1772c0 }
    </style>
    <style type="text/css">
        .navigation .left .news {
            /* font-size: 14px; */
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 0px;
            font-size: 15px;
            color: #494d59;
        }

        .navigation .left .button1 {
            /* height: 26px; */
            width: 100px;
            /* line-height: 26px; */
            border: 1px solid #d0d0d0;
            border-radius: 3px;
            margin: 20px 10px;
        }
    </style>

    <script type="text/javascript">
        function change_list() {
            var type = $("#TAB_TYPE ").val();
            //隐藏
            if (type=="tab1"){
                $("#commissioned").css('display','none');
                $("#was_commissioned").css('display','block');
            }else if (type=="tab0"){
                $("#was_commissioned").css('display','none');
                $("#commissioned").css('display','block');
            }else {
                $("#was_commissioned").css('display','block');
                $("#commissioned").css('display','block');
            }
        }
    </script>

</head>
<body>
<div class="bx">
    <!--head开始-->

    <!--head通栏结束-->

    <!--navigation待办工作开始-->
    <div>
        <div class="step">
            <div class="navigation  clearfix">
                <div class="left">
                    <div class="news">
                        <fmt:message code="workflow.th.processname"/>：
                    </div>
                    <select name="TYPE" class="button1 nav_type" id="select">
                    </select>
                    <div class="adv-select" style="margin-left:10px;">
                        <select name="TAB" id="TAB_TYPE" class="button1 nav_type" onChange="change_list();">
                            <option value="tab1"><fmt:message code="work.th.entrusted"/></option>
                            <option value="tab0"><fmt:message code="work.th.Entrusted"/></option>
                            <option value="tab2"><fmt:message code="notice.type.other"/></option>
                        </select>
                    </div>

                    <div id="commissioned" style="display:block;">
                        <div class="news"><fmt:message code="work.th.Client"/>：</div>
                        <div class="inPole">
                            <input name="adminuserSd" id="adminuserSd" user_id="" value="" class="button1" readonly="readonly"></input>
                            <span class="add_img" style="margin-left: 10px">
                         <div  id="adduserAssistant_"><fmt:message code="global.lang.select"/></div>
                <div  style="margin-left: 10px" onclick="empty('query_toId_')"><fmt:message code="global.lang.empty"/></div>

                        </span>
                        </div>
                    </div>

                    <div id="was_commissioned" style="display:none;">

                        <div class="news"><fmt:message code="work.th.ThePrincipal"/>：</div>
                        <div class="inPole">
                            <input name="adminuserSd" id="adminuserSd" user_id="" value="" class="button1" readonly="readonly"></input>
                            <span class="add_img" style="margin-left: 10px">
                         <div id="adduserAssistant_"><fmt:message code="global.lang.select"/></div>
                <div style="margin-left: 10px" onclick="empty('query_toId_')"><fmt:message code="global.lang.empty"/></div>
                        </span>
                        </div>
                    </div>


                    <!-- 查询按钮 -->
                    <div id="cx" class="submit">
                        <fmt:message code="global.lang.query"/>
                    </div>
                </div>


            </div>
            <div class="button-operation navigation  clearfix">
                <button type="button" class="btn btn-success" id="btn-success" onclick=""><fmt:message code="global.lang.new"/></button>
                <button type="button"class="btn btn-info hidden" onclick="clicked();"><img src="../../img/mywork/weituo.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.Entrust"/></button>
                <button type="button" class="btn btn-info hidden" onclick="clicked();"><img src="../../img/mywork/hungwork.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.guaqi"/></button>
                <button type="button"  class="btn btn-info hidden" onclick="clicked();"><img src="../../img/mywork/pizhu.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.pizhu"/></button>
                <form name="selected_export_form" id="selected_export_form" style="display: none;" method="post" action="data/work_to_export.php?ispirit_export=1">
                    <input type="hidden" name="THE_ID_STR" id="THE_ID_STR" value="">
                    <button type="submit" id="selected_export" class="btn btn-info"><fmt:message code="global.lang.report"/></button>
                </form>
                <button type="button" id="export" class="btn btn-info daochuwork" onclick="clicked1()"><fmt:message code="event.th.TurnAll"/></button>
                <button type="button" id="export" class="btn btn-info daochuwork" onclick="clicked2()"><fmt:message code="event.th.AbortAll"/></button>
                <button type="button" id="export" class="btn btn-info daochuwork" onclick="clicked3()"><fmt:message code="meet.th.DeleteAll"/></button>
                <button type="button" class="btn btn-info" onclick="refresh();"><img src="../../img/mywork/shuxinwork.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="global.lang.refresh"/></button>
                <div class="right">
                    <!-- 分页按钮-->
                    <div class="M-box3" id="dbgz_page"></div>
                </div>
            </div>

            <!--navigation结束-->

            <!--content部分开始-->

            <table id="tr_td"  style="margin-top:10px">
                <thead>
                <tr id="notice_tr">
                    <td style="text-align:center;width: 30px;background:white;"><input type="checkbox" id="jqg_gridTable_1871" class="cbox" style="background:white;"></td>
                    <td class="th">
                        <fmt:message code="workflow.th.processname"/>
                    </td>
                    <td class="th">
                        <fmt:message code="work.th.Client"/>
                    </td>
                    <td class="th">
                        <fmt:message code="work.th.ThePrincipal"/>
                    </td>

                    <td class="th">
                        <fmt:message code="notice.th.validity"/>
                    </td>
                    <td class="th">
                        <fmt:message code="work.th.RuleState"/>
                    </td>
                    <td class="th">
                        <fmt:message code="menuSSetting.th.menuSetting"/>
                    </td>
                </tr>
                </thead>
                <tbody id="dbgz" class="tr_td">

                </tbody>
            </table>


            <!--content待办部分结束-->

        </div>

    </div>

</div>
<script type="text/javascript">
    function runWorkListPage() {
        parent.changeMenuTab(1020);
        location.reload();
    }
    function  refresh(){
        location.reload();
    }

    function clicked(){
        layer.msg('<fmt:message code="global.lang.doing"/>', {icon: 6});
    }

    function clicked5(){
        window.location.href ="addwork"
    }

    function clicked1(ruleId){
        console.log(ruleId);
        $.ajax({
            url:'../../flowRule/updateStatusToStart',
            type:'get',
            dataType:'json',
            data: {
              ruleId:ruleId
            },
            cache:false,
            success:function(data){
                location.reload();
            }
        })

    }
    function clicked2(ruleId){
        $.ajax({
            url:'../../flowRule/updateStatusToEnd',
            type:'get',
            dataType:'json',
            data: {
                ruleId:ruleId
            },
            cache:false,
            success:function(data){
                location.reload();
            }
        })
    }
    function clicked3(ruleId){
        $.ajax({
            url:'../../flowRule/deleteFlowRule',
            type:'get',
            dataType:'json',
            data: {
                ruleId:ruleId
            } ,
            cache:false,
            success:function(data){
                location.reload();
            }
        })
    }


    $(function(){
        var data = {
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
            //time:new Date().getTime()
        };
        var datas = {
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
            //time:new Date().getTime()
        };
        var dataall={
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
        }
        var datawait={
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
        }
        var dataend={
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
        }
//        $('#btn-success').on('click',function(){
//            //var sortId=$(this).attr("sortId");
//            layer.tips('功能还在开发中', '吸附元素选择器', {
//                tips: [1, '#3595CC'],
//                time: 4000
//            });
//        });
        $(".index_head li").click(function(){
            //$(this).find("span").addClass("one").siblings().removeClass("one");
            $(this).find("span").addClass("one").parent('li').siblings().find("span").removeClass("one");

            if($(this).attr('data-num')==0){
                $('.navigation .left img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/daibangongzuow.png')
            }else if($(this).attr('data-num')==1){
                $('.navigation .left img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/banjiegongzuo.png')
            }else {
                $('.navigation .left img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/quanbugongzuo.png')
            }

            var index=$(this).index();
            var head_title=$(this).text();
            $('.news').text(head_title);
            $(".step").eq(index).show().siblings().hide();
        });
//处理数据状态字段
        function handleData(data){
            switch(data){
                case "1":
                    return '<fmt:message code="work.th.AlreadyValid"/>';
//                    break;
                case "0":
                    return '<fmt:message code="eork.th.Expired"/>';
//                    break;
                //default:
                //str='办理中';
            }
        }
        function getWorkLevle(num_workLevel){
            var str_workLevel;
            switch(num_workLevel){
                case "0":
                    str_workLevel='<fmt:message code="sup.th.ordinary"/>';
                    break;
                case "1":
                    str_workLevel='<fmt:message code="workflow.th.important"/>';
                    break;
                case "2":
                    str_workLevel='<fmt:message code="sup.th.urgent"/>';
                    break;
                default:
                    str_workLevel='<fmt:message code="sup.th.ordinary"/>';
            }
            return str_workLevel;
        }

        function getFlowType(num_flowType){
            var str_flowType;
            switch (num_flowType){
                case "1":
                    str_flowType="<fmt:message code="workflow.th.fixedflow"/>";
                    break;
                case "2":
                    str_flowType="<fmt:message code="workflow.th.freeflow"/>";
                    break;
                default:
                    str_flowType='<fmt:message code="sup.th.ordinary"/>';
            }
            return str_flowType;
        }
        function changeShadow(){
            var td_cs=document.getElementById("tr_td");
            var ts_cs=td_cs.getElementsByTagName("tr"),
                length_cs=ts_cs.length;
            for(var i=0;i<length_cs;i++){
                if(i%2==0){
                    ts_cs[i].style.backgroundcolor='#F6F7F9';
                }
            }
        }
        $(document).ready(function(){
            initPageList_db(function (pageCount) {

                initPagination_db(pageCount, data.pageSize);
            });
            changeShadow();
        });
        $('#waitwork').click(function(){
            initPageList_db(function (pageCount) {

                initPagination_db(pageCount, data.pageSize);
            });
            changeShadow();
        });
        $('#allwork').click(function(){
                initPageList_qb(function (pageCount) {

                    initPagination_qb(pageCount,data.pageSize);
                });
                changeShadow();
            }
        );

        $('#endWork').click(function(){
                initPageList_bj(function (pageCount) {
                    initPagination_bj(pageCount,data.pageSize)
                })

            }
        );

        $('#hungwork').click(function(){
                initPageList_gq(function (pageCount) {

                    initPagination_gq(pageCount,data.pageSize);
                });

            }
        );

        function initPagination_bj(totalData, pageSize) {
            $('#bjgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:dataend.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {
                    dataend.page = index.getCurrent();

                    initPageList_bj(function (pageCount) {
                        initPagination_bj(pageCount,data.pageSize)
                    })
                }
            });
        }
        function initPageList_bj(cb){
            $.ajax({
                url:'../../workflow/work/selectEndWord',
                //http://192.168.0.21/xoa/workflow/work/selectEndWord?page=1&pageSize=5&useFlag=true&userId=admin
                type:'get',
                dataType:'json',
                data:dataend,
                success:function(data){

                    var length=data.obj.length;
                    var str='';
                    for(var i=0;i<length;i++){
                        var status=handleData(data.obj[i].prcsFlag);
                        var str= str+'<tr prcsId='+data.obj[i].flowProcess.prcsId+' runId='+data.obj[i].runId+' flowstep="'+data.obj[i].prcsId+'" flowId="'+data.obj[i].flowProcess.flowId+'" ><td style="text-align:center;width: 30px;">'+
                            '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                            '<td class="">'+data.obj[i].runId+'</td>'+
                            '<td class="bjtitle" flowid="'+data.obj[i].flowProcess.flowId+'">'+data.obj[i].flowRun.runName+'</td>'+
                            '<td class="alerthtml">'+
                            '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                            '<td class="">'+data.obj[i].userName+'</td>'+
                            '<td class="">'+data.obj[i].deliverTime+'</td><td class="">'+status+'</td>'+
                            '<td style="text-align:left;" title="<fmt:message code="workflow.th.HostExportDelete"/>">'+
                            '<a href="javascript:"><span class="host-span" id="cuiban" title="<fmt:message code="main.th.Reminders"/>" runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].flowProcess.prcsId+'></span></a>'+
                            '<a href="javascript:"><span class="operation_text_left daochu"></span></a>';

                        //$('#dbgz').html(str);
                    }
                    $('#bjwork').html(str);
                    if (cb) {
                        cb(data.totleNum);
                    }
                }
            });
        }


        $('#bjwork').on('click','.bjtitle',function() {
            var that = $(this).parent();
            var flowId = that.attr('flowId');
            var runId =  that.attr('runId');
            var prcsId = that.attr('prcsId');
            var flowstep = that.attr('flowstep');
            $.popWindow("workformPreView?flowId="+flowId+'&flowStep='+flowstep+'&runId='+runId+'&prcsId='+prcsId,'<fmt:message code="main.th.PreviewPage"/>','0','0','1500px','800px');
        });
        function initPageList_db(cb){
            // var datas ={
            //page:page,
            //pageSize:15,
            //useFlag:true,
            // };
            $.ajax({
                url:'../../flowRule/queryFlowRule',
                type:'get',
                dataType:'json',
                data:datawait,
                success:function(data){

                    var length=data.obj.length;
                    var str='';
                    for(var i=0;i<length;i++){
                        var status=handleData(data.obj[i].status);
                        //var workLeverl=getWorkLevle(data.obj[i].flowRun.workLevel);
                        if(data.obj[i].status=='0'){
                            var str= str+'<tr id="notice_tr" ruleId="'+data.obj[i].ruleId+'"><td style="text-align:center;width: 30px;">'+
                                '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                                '<input type="hidden" id="ruleId"  >'+data.obj[i].ruleId+'</td>'+
                                '<td class="">'+data.obj[i].flowName+'</td>'+
                                '<td class="">'+data.obj[i].userIdName+'</td>'+
                                '<td class="">'+data.obj[i].toIdName+'</td>'+
                                '<td class="">'+ '  '+'</td>'+
                                '<td class="">'+'<fmt:message code="work.th.Invalid"/>'+'</td>'+
                                '<td style="text-align:left; padding:0px; !important" >'+
                                '<a href="javascript:"><span class="host-span" id="kq" title="<fmt:message code="three.th.open"/>" style="padding-left:0px;" onclick="clicked1('+data.obj[i].ruleId+')" ><fmt:message code="three.th.open"/></span></a>'+
                                '<a href="javascript:"><span class="operation_text_left daochu" title="<fmt:message code="global.lang.edit"/>" id="bj" style="padding-left:10px" ><fmt:message code="global.lang.edit"/></span></a>'+
                                '<a href="javascript:">'+
                                '<span class="operation_text_left shanchu" id="delete"   title="<fmt:message code="menuSSetting.th.deleteMenu"/>" style="padding-left:10px" onclick="clicked3('+data.obj[i].ruleId+')" ><fmt:message code="menuSSetting.th.deleteMenu"/></span></a></td></tr>';
                        }else{
                            var str= str+'<tr id="notice_tr" ruleId="'+data.obj[i].ruleId+'"><td style="text-align:center;width: 30px;">'+
                                '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                                '<input type="hidden" id="ruleId"  >'+data.obj[i].ruleId+'</td>'+
                                '<td class="">'+data.obj[i].flowName+'</td>'+
                                '<td class="">'+data.obj[i].userIdName+'</td>'+
                                '<td class="">'+data.obj[i].toIdName+'</td>'+
                                '<td class="">'+
                                '<fmt:message code="workflow.th.First"/>'+data.obj[i].beginDate+' <fmt:message code="global.lang.to"/> '+data.obj[i].endDate+'</td>'+
                                '<td class="">'+'<fmt:message code="work.th.AlreadyValid"/>'+'</td>'+
                                '<td style="text-align:left; padding:0px; !important" >'+
                                '<a href="javascript:"><span class="host-span" id="gb" title="<fmt:message code="global.lang.close"/>" style="padding-left:0px;" onclick="clicked2('+data.obj[i].ruleId+')" value='+data.obj[i].ruleId+'><fmt:message code="global.lang.close"/></span></a>'+
                                '<a href="javascript:"><span class="operation_text_left daochu" title="<fmt:message code="global.lang.edit"/>" id="bj" style="padding-left:10px" value='+data.obj[i].ruleId+'><fmt:message code="main.query"/></span></a>'+
                                '<a href="javascript:">'+
                                '<span class="operation_text_left shanchu" id="delete"   title="<fmt:message code="menuSSetting.th.deleteMenu"/>" style="padding-left:10px" onclick="clicked3('+data.obj[i].ruleId+')" value='+data.obj[i].ruleId+'><fmt:message code="menuSSetting.th.deleteMenu"/></span></a></td></tr>';
                        }

                        //$('#dbgz').html(str);
                    }
                    $('#dbgz').html(str);
                    if (cb) {
                        //alert(data.totleNum);
                        cb(data.totleNum);
                    }
                }
            });
        }

        function initPagination_db(totalData, pageSize) {
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:datawait.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {
                    datawait.page = index.getCurrent();

                    initPageList_db(function (pageCount) {

                        initPagination_db(pageCount, data.pageSize);
                    });
                }
            });
        }

//全部工作接口调用
        function initPageList_qb(cb) {
            //var layerIndex = layer.load(0, {shade: false}); /* 0代表加载的风格，支持0-2 */
            //var datas_qb ={
            //page:page,
            //pageSize:15,
            //useFlag:true,
            //};
            $.ajax({
                url:'../../workflow/work/selectAll',
                type:'get',
                dataType:'json',
                data:dataall,
                cache:false,
                success:function(data){

                    var length=data.obj.length;
                    var str='';
                    for(var i=0;i<length;i++){
                        var status=handleData(data.obj[i].prcsFlag);
                        //var flowType=getFlowType(data.obj[i].flowType.flowName);
                        var str= str+'<tr formId="'+data.obj[i].flowType.formId+'" flowId="'+data.obj[i].flowProcess.flowId+'" runId="'+data.obj[i].runId+'" prcsId="'+data.obj[i].flowProcess.prcsId+'" flowstep="'+data.obj[i].prcsId+'"><td style="text-align:center;width: 30px;">'+
                            '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                            '<td class="">'+data.obj[i].runId+'</td>'+
                            '<td class="flowtype">'+data.obj[i].flowType.flowName+'</td>'+
                            '<td class="flowtitle">'+data.obj[i].flowRun.runName+'</td>'+
                            '<td class="" flowid="'+data.obj[i].flowProcess.flowId+'">'+data.obj[i].userName+'</td>'+
                            '<td class="alerthtml">'+
                            '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                            '<td class="">'+status+'</td>';
                        //$('#dbgz').html(str);
                    }
                    $('#qbgz').html(str);
                    if (cb) {
                        //alert(data.totleNum);
                        cb(data.totleNum);
                    }
                }
            })
        };
        $('#qbgz').on('click','.flowtype',function () {
            var flowId = $(this).parent().attr("flowId");
            window.open('/flowSetting/processDesignToolsT?flowId='+flowId+'&type=0','<fmt:message code="workflow.th.FlowChartPreview"/>','width='+(window.screen.availWidth)+',height='+(window.screen.availHeight)+',top=0,left=0,scrollbars=no,resizable=no')
        });
        $('#qbgz').on('click','.flowtitle',function () {
            var formId = $(this).parent().attr("formId");
            var flowId = $(this).parent().attr("flowId");
            var flowstep = $(this).parent().attr("flowstep");
            var runId = $(this).parent().attr("runId");
            var prcsId = $(this).parent().attr("prcsId");
            //$.popWindow("workformPreView?flowId="+flowId+'&flowStep='+flowstep+'&runId='+runId+'&prcsId='+prcsId,'流程图预览','0','0','1500px','800px');
            window.open("workformPreView?flowId="+flowId+'&flowStep='+flowstep+'&runId='+runId+'&prcsId='+prcsId,'<fmt:message code="workflow.th.FlowChartPreview"/>','width='+(window.screen.availWidth)+',height='+(window.screen.availHeight)+',top=0,left=0,scrollbars=yes,resizable=yes')
        });

        //点击删除按钮
        $('#tr_td').on('click','#work_delete',function(){
            var tid=$(this).attr('tid');
            var that = $(this).parents('#notice_tr');
            /* $.ajax({
             url: '../../workflow/work/deleteRunPrcs',
             type: 'get',
             dataType: 'json',
             data:{
             id:tid
             },
             success: function (data) {

             }
             })*/
            //删除判断
            layer.confirm('<fmt:message code="sup.th.Delete"/>？', {
                btn: ['<fmt:message code="global.lang.ok"/>','<fmt:message code="depatement.th.quxiao"/>'] //按钮
            }, function(){
                //确定删除，调接口
                $.ajax({
                    url: '../../workflow/work/deleteRunPrcs',
                    type: 'get',
                    dataType: 'json',
                    data:{
                        id:tid
                    },
                    success: function (obj) {
                        //第三方扩展皮肤
                        layer.msg('<fmt:message code="workflow.th.delsucess"/>', { icon:6});
                        that.remove();
                    }
                })
            }, function(){
                layer.closeAll();

            });
        })
//全部工作分页
        function initPagination_qb(totalData, pageSize) {
            $('#qbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:dataall.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {
                    dataall.page = index.getCurrent();

                    initPageList_qb(function (pageCount) {

                        initPagination_qb(pageCount, data.pageSize);
                    });
                }
            });
        }

        function initPageList_gq(cb){
            // var datas ={
            // page:page,
            // pageSize:15,
            //useFlag:true,
            //};
            $.ajax({
                url:'../../workflow/work/selectHang',
                //http://192.168.0.21/xoa/workflow/work/selectHang?page=1&pageSize=5&useFlag=true&userId=admin
                type:'get',
                dataType:'json',
                data:data,
                success:function(data){

                    var length=data.obj.length;
                    var str='';
                    for(var i=0;i<length;i++){
                        var status=handleData(data.obj[i].prcsFlag);
                        var str= str+'<tr><td class="">'+data.obj[i].runId+'</td>'+
                            '<td class="">'+data.obj[i].flowRun.runName+'</td>'+
                            '<td class="">'+
                            '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                            '<td class="">'+data.obj[i].userName+'</td>'+
                            '<td class="">'+data.obj[i].deliverTime+'</td><td class="th"><fmt:message code="workflow.th.type"/></td>'+
                            '<td style="text-align:left;" title="<fmt:message code="workflow.th.HostExportDelete"/>">'+
                            '<a href="javascript:"><span class="host-span" style="padding-left:0px"><fmt:message code="workflow.th.host"/></span></a>'+
                            '<a href=""><span class="operation_text_left" style="padding-left:10px"><fmt:message code="global.lang.report"/></span></a>'+
                            '<a href="javascript:">'+
                            '<span class="operation_text_left" style="padding-left:10px"><fmt:message code="menuSSetting.th.deleteMenu"/></span></a></td></tr>';
                        //$('#dbgz').html(str);
                    }
                    $('#gqwork').html(str);
                    if (cb) {
                        // event.stopPropagation();
                        //alert(data.totleNum);
                        cb(data.totleNum);
                    }
                }
            });
        }

        $(document).delegate('.alerthtml','click',function () {

            window.open('/flowSetting/processDesignToolTwo?flowId='+$(this).prev().
            attr('flowid')+'&rilwId='+$(this).parent().find('td').eq(1).text(),'<fmt:message code="workflow.th.ProcessDesignerPreview"/>','width='+(window.screen.availWidth)+',height='+(window.screen.availHeight)+',top=0,left=0,scrollbars=no,resizable=no')
        })
        function initPagination_gq(totalData, pageSize) {
            $('#gqgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:data.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {
                    data.page = index.getCurrent();

                    initPageList_gq(function (pageCount) {

                        initPagination_gq(pageCount, data.pageSize);
                    });
                }
            });
        }

        //待办工作搜索
        $("#dbgz_search").click(function (){
            data_search_db.myworkconditions=$("#flow_search_value").val();

            dbgzsearch(function (pageCount){
                initPagination_ssdb(pageCount,datas.pageSize)
            })
        });
        var data_search_db={
            myworkconditions:$("#flow_search_value").val(),
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
        };
        function dbgzsearch(cb){
            //$("#dbgz_search").click(function(){
            //var data={
            // myworkconditions:$("#flow_search_value").val(),
            //};
            $.ajax({
                url:"../../workflow/work/selectWork",
                data:data_search_db,
                type:"get",
                dataType:"json",
                success:function(data){

                    if(data.flag==true){
                        var length=data.obj.length;
                        for(var i=0;i<length;i++){
                            var status=handleData(data.obj[i].prcsFlag);
                            var workLeverl=getWorkLevle(data.obj[i].flowRun.workLevel);
//                        var str= str+'<tr><td style="text-align:center;width: 30px;">'+
//                            '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
//                            '<td class="">'+data.obj[i].runId+'</td>'+
//                            '<td class="wenhao"  id="zhuban" title=data.obj[i].flowRun.runName runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].flowProcess.prcsId+'>'+
//                            '<span class="font-green">'+
//                            '【'+workLeverl+'】</span>'+data.obj[i].flowRun.runName+'</td>'+
//                            '<td class="alerthtml">'+
//                            '第'+data.obj[i].flowProcess.prcsId+'步:'+data.obj[i].flowProcess.prcsName+'</td>'+
//                            '<td class="">'+data.obj[i].userName+'</td>'+
//                            '<td class="">'+status+'</td>'+
//                            '<td class="">到达:'+data.obj[i].receiptTime+'<br>接收:'+data.obj[i].receive+'</td>'+
//                            '<td class="">到达:'+data.obj[i].arriveTime+'<br>办理:'+data.obj[i].handleTime+'</td>'+
//                            '<td style="text-align:left; padding:0px; !important" >'+
//                            '<a href="javascript:"><span class="host-span" id="zhuban" title="主办" runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].flowProcess.prcsId+' style="padding-left:0px;">主办</span></a>'+
//                            '<a href=""><span class="operation_text_left" title="导出" style="padding-left:10px">导出</span></a>'+
//                            '<a href="javascript:">'+
//                            '<span class="operation_text_left" title="删除" style="padding-left:10px">删除</span></a></td></tr>';
                            if(data.obj[i].flowProcess.prcsId=='1'){
                                var str= str+'<tr id="notice_tr" runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+'><td style="text-align:center;width: 30px;">'+
                                    '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                                    '<td class="">'+data.obj[i].runId+'</td>'+
                                    '<td class="wenhao"  data-id="zhuban" title='+data.obj[i].flowRun.runName+' runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].prcsId+'>'+
                                    '<span class="font-green">'+
                                    '【'+workLeverl+'】</span>'+data.obj[i].flowRun.runName+'</td>'+
                                    '<td class="alerthtml">'+
                                    '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                                    '<td class="">'+data.obj[i].userName+'</td>'+
                                    '<td class="">'+status+'</td>'+
                                    '<td class=""><fmt:message code="workflow.th.Arrive"/>:'+data.obj[i].receiptTime+'<br><fmt:message code="workflow.th.Receive"/>:'+data.obj[i].receive+'</td>'+
                                    '<td class=""><fmt:message code="workflow.th.Arrive"/>:'+data.obj[i].arriveTime+'<br><fmt:message code="document.th.handle"/>:'+data.obj[i].handleTime+'</td>'+
                                    '<td style="text-align:left; padding:0px; !important" >'+
                                    '<a href="javascript:"><span class="host-span" data-id="zhuban" title="<fmt:message code="workflow.th.host"/>" runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].prcsId+' style="padding-left:0px;"><fmt:message code="workflow.th.host"/></span></a>'+
                                    '<a href="javascript:"><span class="operation_text_left daochu" data-id="daochu" title="<fmt:message code="global.lang.report"/>" style="padding-left:10px"><fmt:message code="global.lang.report"/></span></a>'+
                                    '<a href="javascript:">'+
                                    '<span class="operation_text_left shanchu" id="work_delete" tid='+data.obj[i].id+'  title="<fmt:message code="menuSSetting.th.deleteMenu"/>" style="padding-left:10px"><fmt:message code="menuSSetting.th.deleteMenu"/></span></a></td></tr>';
                            }else{
                                var str= str+'<tr id="notice_tr"><td style="text-align:center;width: 30px;">'+
                                    '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                                    '<td class="">'+data.obj[i].runId+'</td>'+
                                    '<td class="wenhao"  data-id="zhuban" title=data.obj[i].flowRun.runName runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].prcsId+'>'+
                                    '<span class="font-green">'+
                                    '【'+workLeverl+'】</span>'+data.obj[i].flowRun.runName+'</td>'+
                                    '<td class="alerthtml">'+
                                    '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                                    '<td class="">'+data.obj[i].userName+'</td>'+
                                    '<td class="">'+status+'</td>'+
                                    '<td class=""><fmt:message code="workflow.th.Arrive"/>:'+data.obj[i].receiptTime+'<br><fmt:message code="workflow.th.Receive"/>:'+data.obj[i].receive+'</td>'+
                                    '<td class=""><fmt:message code="workflow.th.Arrive"/>:'+data.obj[i].arriveTime+'<br><fmt:message code="document.th.handle"/>:'+data.obj[i].handleTime+'</td>'+
                                    '<td style="text-align:left; padding:0px; !important" >'+
                                    '<a href="javascript:"><span class="host-span" data-id="zhuban" title="<fmt:message code="workflow.th.host"/>" runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].prcsId+' style="padding-left:0px;"><fmt:message code="workflow.th.host"/></span></a>'+
                                    '<a href="javascript:"><span class="operation_text_left daochu" data-id="daochu" title="<fmt:message code="global.lang.report"/>" style="padding-left:10px"><fmt:message code="global.lang.report"/></span></a>'+
                                    '<a href="javascript:">'+
                                    '<span class="operation_text_left" title="" style="padding-left:10px"></span></a></td></tr>';
                            }

                            //$('#dbgz').html(str);
                        }
                        $("#dbgz").html(str);
                    }else if(data.flag==false){
                        alert('<fmt:message code="workflow.th.noexit"/>');
                        $("#dbgz").empty();
                    }
                    if (cb) {
                        // event.stopPropagation();
                        //alert(data.totleNum);
                        cb(data.totleNum);
                    }
                }
            })
            //}
            //)
        }
        //待办工作搜索分页
        function initPagination_ssdb(totalData, pageSize) {
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:data_search_db.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {

                    data_search_db.page = index.getCurrent();

                    dbgzsearch(function (pageCount) {

                        initPagination_ssdb(pageCount,data.pageSize);
                    });
                }
            });
        }
        //待办工作搜索结束
        //办结工作搜索开始
        $("#bjgz_search").click(function (){
            data_search_bj.myworkconditions=$("#flow_search_value_bj").val();

            bjgzsearch(function (pageCount){
                initPagination_ssbj(pageCount,datas.pageSize)
            })
        });
        var data_search_bj={
            myworkconditions:$("#flow_search_value_bj").val(),
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
        };
        function bjgzsearch(cb){
            //$("#bjgz_search").click(function(){
            //var data_search_bj={
            //myworkconditions:$("#flow_search_value_bj").val(),
            //page:1,
            //pageSize:5,
            //useFlag:true,
            //userId:$.cookie('userId'),
            //};
            $.ajax({
                url:"../../workflow/work/selectEndWord",
                data:data_search_bj,
                type:"get",
                dataType:"json",
                success:function(data){

                    if(data.flag==true){
                        var length=data.obj.length;
                        var str='';
                        for(var i=0;i<length;i++){
                            var status=handleData(data.obj[i].prcsFlag);
                            var str= str+'<tr><td style="text-align:center;width: 30px;">'+
                                '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                                '<td class="">'+data.obj[i].runId+'</td>'+
                                //'<td class="bjtitle" flowid="'+data.obj[i].flowProcess.flowId+'">'+data.obj[i].flowRun.runName+'</td>'+
                                //'<td class="alerthtml">'+
                                '<td class="bjtitle" flowid="'+data.obj[i].flowProcess.flowId+'">'+data.obj[i].flowRun.runName+'</td>'+
                                '<td class="alerthtml">'+
                                '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                                '<td class="">'+data.obj[i].userName+'</td>'+
                                '<td class="">'+data.obj[i].deliverTime+'</td><td class="">'+status+'</td>'+
                                '<td style="text-align:left;" title="<fmt:message code="workflow.th.HostExportDelete"/>">'+
                                /*  '<a href="javascript:"><span class="host-span" id="cuiban" title="催办" runId='+data.obj[i].runId+' flowId='+data.obj[i].flowRun.flowId+' prcsId='+data.obj[i].flowProcess.prcsId+'>催办</span></a>'+
                                  '<a href=""><span class="operation_text_left">导出</span></a>'+*/
                                '<a href="javascript:">'+
                                '<span class="operation_text_left"><fmt:message code="menuSSetting.th.deleteMenu"/></span></a></td></tr>';
                            //$('#dbgz').html(str);
                        }
                        $('#bjwork').html(str);

                    }else if(data.flag==false){
                        alert('<fmt:message code="workflow.th.noexit"/>');
                        $('#bjwork').empty();
                    }
                    if (cb) {
                        // event.stopPropagation();
                        //alert(data.totleNum);
                        cb(data.totleNum);
                    }
                }
            })
            //}
            //)
        }
        //办结工作搜索分页
        function initPagination_ssbj(totalData, pageSize) {
            $('#bjgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:data_search_bj.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {

                    data_search_bj.page = index.getCurrent();

                    bjgzsearch(function (pageCount) {

                        initPagination_ssbj(pageCount,data.pageSize);
                    });
                }
            });
        }
        //办结工作搜索结束
        //全部工作搜索
        $("#qbgz_search").click(function (){
            data_search.myworkconditions=$("#flow_search_value_qb").val();
            qbgzsearch(function (pageCount){
                initPagination_ssqb(pageCount,datas.pageSize)
            })
        });
        var data_search={
            myworkconditions:$("#flow_search_value_qb").val(),
            page:1,
            pageSize:15,
            useFlag:true,
            userId:$.cookie('userId'),
        };

        function qbgzsearch(cb){
            //$("#qbgz_search").click(function(){

            $.ajax({
                url:"../../workflow/work/selectAll",
                data:data_search,
                type:"get",
                dataType:"json",
                success:function(data){

                    if(data.flag==true){
                        var length=data.obj.length;
                        var str='';
                        for(var i=0;i<length;i++){
                            var status=handleData(data.obj[i].prcsFlag);
                            //var flowType=getFlowType(data.obj[i].flowType.flowName);
                            var str= str+'<tr><td style="text-align:center;width: 30px;">'+
                                '<input type="checkbox" id="jqg_gridTable_1871" class="cbox" ></td>'+
                                '<td class="">'+data.obj[i].runId+'</td>'+
                                '<td class="">'+data.obj[i].flowType.flowName+'</td>'+
                                '<td class="">'+data.obj[i].flowRun.runName+'</td>'+
                                '<td class="" flowid="'+data.obj[i].flowProcess.flowId+'">'+data.obj[i].userName+'</td>'+
                                '<td class="alerthtml">'+
                                '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                                '<td class="">'+status+'</td>';
                            //$('#dbgz').html(str);
                        }
                        $('#qbgz').html(str);

                    }else if(data.flag==false){
                        alert('<fmt:message code="workflow.th.noexit"/>');
                        $('#qbgz').empty();

                    }
                    if (cb) {
                        // event.stopPropagation();
                        //alert(data.totleNum);
                        cb(data.totleNum);
                    }
                }
            })
            //}
            //)
        }
        //全部工作搜索分页
        function initPagination_ssqb(totalData, pageSize) {
            $('#qbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:data_search.page,
                //prevContent: '',
                //nextContent: '',
                //jumpBtn: '',
                callback: function (index) {
                    data_search.page = index.getCurrent();
                    qbgzsearch(function (pageCount) {

                        initPagination_ssqb(pageCount,data.pageSize);
                    });
                }
            });
        }
        //挂起工作搜索
        $("#gqgz_search").click(function(){
                var data={
                    myworkconditions:$("#flow_search_value_gq").val(),
                };
                $.ajax({
                    url:"../../workflow/work/selectHang?page=1&pageSize=5&useFlag=true&userId=admin",
                    data:data,
                    type:"get",
                    dataType:"json",
                    success:function(data){

                        if(data.flag==true){
                            var length=data.obj.length;
                            var str='';
                            for(var i=0;i<length;i++){
                                var status=handleData(data.obj[i].prcsFlag);
                                var str= str+'<tr><td class="">'+data.obj[i].runId+'</td>'+
                                    '<td class="">'+data.obj[i].flowRun.runName+'</td>'+
                                    '<td class="">'+
                                    '<fmt:message code="workflow.th.First"/>'+data.obj[i].prcsId+'<fmt:message code="workflow.th.step"/>:'+data.obj[i].flowProcess.prcsName+'</td>'+
                                    '<td class="">'+data.obj[i].userName+'</td>'+
                                    '<td class="">'+data.obj[i].deliverTime+'</td><td class="th"><fmt:message code="workflow.th.type"/></td>'+
                                    '<td style="text-align:left;" title="<fmt:message code="workflow.th.HostExportDelete"/>">'+
                                    '<a href="javascript:"><span class="host-span" style="padding-left:0px"><fmt:message code="workflow.th.host"/></span></a>'+
                                    '<a href=""><span class="operation_text_left" style="padding-left:10px"><fmt:message code="global.lang.report"/></span></a>'+
                                    '<a href="javascript:">'+
                                    '<span class="operation_text_left" style="padding-left:10px"><fmt:message code="menuSSetting.th.deleteMenu"/></span></a></td></tr>';
                                //$('#dbgz').html(str);
                            }
                            $('#gqwork').html(str);

                        }else if(data.flag==false){
                            alert('<fmt:message code="workflow.th.noexit"/>');
                            $('#gqwork').empty();

                        }
                    }
                })
            }
        )


        //点击主办按钮，出现主办页面
        $('#dbgz').on('click','[data-id="zhuban"]',function(){
            var parent = $(this).parents('tr').eq(0);
            var flowId= parent.attr('flowId');
            var flowStep= parent.attr('flowStep');
            var prcsId= parent.attr('prcsId');
            var runId= parent.attr('runId');
            user_id='zhuban';
            $.popWindow("workform?flowId="+flowId+'&prcsId='+prcsId+'&flowStep='+flowStep+'&runId='+runId+'','<fmt:message code="newWork.th.Quick"/>','0','0','1500px','650px');
        });

        //点击导出按钮，出现导出页面
        $('#dbgz').on('click','[data-id="daochu"]',function(){
            $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment"/>！',icon:1});
        });

        //点击催办按钮，出现主办页面
        $('#bjwork').on('click','#cuiban',function(){
            var parent = $(this).parents('tr').eq(0);
            var flowId= parent.attr('flowId');
            var flowStep= parent.attr('flowStep');
            var prcsId= parent.attr('prcsId');
            var runId= parent.attr('runId');

            var runId= $(this).parent().attr('runId');
            user_id='cuiban';
            $.popWindow("workform?flowId="+flowId+'&prcsId='+prcsId+'&flowStep='+flowStep+'&runId='+runId+'','<fmt:message code="newWork.th.Quick"/>','0','0','1500px','650px');
        });



    });
    //-->
</script>

</body>
</html>
