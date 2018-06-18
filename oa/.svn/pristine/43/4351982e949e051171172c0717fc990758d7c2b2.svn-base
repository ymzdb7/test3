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
	<title>我的工作</title>
	<link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
	<link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
	<link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/base.css" />
    <link rel="stylesheet" type="text/css" href="/css/base/base.css" />
	<link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/news/management_query.css" />
	<%--<script src="/js/common/language.js"></script>--%>
	<script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
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
		.zhungtai{
			position:relative;
			left:5px;
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
        .cbox{
            display: none;
        }
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
            float: right;
            padding-top: 17px;
            padding-bottom: 10px;
            margin-right: 12px;
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
        table{
            table-layout: fixed;
        }
        table tr th{
            text-align: left;
            padding: 10px!important;
        }
        table tr td{
            text-align: left!important;
            padding: 15px 10px!important;
        }
        .banjietr td span{
            display: inline-block;
            width: 100%;
        }
        .navigation .left{
            margin-left: 30px;
        }
        #pageTbody tr:nth-child(odd) {
            background-color: #F6F7F9;
        }
        #pageTbody tr:hover{
            background: #D3E7FA;
        }
        .editAndDelete0{
            color: #1772c0;
        }
        .editAndDelete1{
            color: #e01919;
        }
        .head{
            position: fixed;
            top: 0;
            left: 0;
            background: #fff;
        }
        .pagediv .page-top-inner-layer{
            height:62px;
        }
		.head .headli3{
			width: 56px;
		}
    </style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
	<script>
		var openRold=parent.opensload;
	</script>
</head>
<body style="overflow-y: auto">
<div class="bx">
	<!--head开始-->
	<div class="head w clearfix">
		<ul class="index_head">
			<li data-num="0"><span class="headli1_1 one" id="waitwork"><fmt:message code="workflow.th.wait" /></span><img class="headli1_2" src="../../img/twoth.png" alt="">
			</li>

			<li data-num="1"><span class="headli2_1 endWork"  id="endWork"><fmt:message code="workflow.th.gowork" /></span><img src="../../img/twoth.png" alt="" class="headli2_2">
			</li>

			<li data-num="2"><span class="headli3 allwork"  id="allwork"><fmt:message code="workflow.th.allwork" /></span><img src="../../img/twoth.png" alt="" class="headli2_2"></li>
			</li>
		</ul>
	</div>
	<%--<div class="body" style="width: 100%;margin-top: 44px">--%>
		<%--<iframe id="every_module" src="/workflow/work/waitwork" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe>--%>
            <div class="bx" style=" margin-top: 44px">
                <div class="navigation  clearfix">
                    <div class="left">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/daibangongzuow.png">
                        <div class="news"><fmt:message code="workflow.th.wait" /></div>
                        <input id="flow_search_value" class="inp" type="text" placeholder="&nbsp;<fmt:message code="workflow.th.Searchforname" />">
                        <div id="btn_search" class="search"><h1 style="cursor:pointer;" class="subsearch" id="dbgz_search"><fmt:message code="workflow.th.sousuo" /></h1></div>
                    </div>
                    <div class="button-operation">
                        <button type="button" class="btn btn-success" id="btn-success" onclick="clicked5();"><img src="../../img/mywork/newbuildworjk.png" style="margin-right: 3px;margin-bottom: 1px;"><fmt:message code="main.newwork" /></button>
                        <button type="button" class="btn btn-info hidden" onclick="clicked();"><img src="../../img/mywork/weituo.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.Entrust" /></button>
                        <button type="button" class="btn btn-info hidden" onclick="clicked();"><img src="../../img/mywork/hungwork.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.guaqi" /></button>
                        <button type="button" class="btn btn-info hidden" onclick="clicked();"><img src="../../img/mywork/pizhu.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.pizhu" /></button>
                        <form name="selected_export_form" id="selected_export_form" style="display: none;" method="post" action="data/work_to_export.php?ispirit_export=1">
                            <input type="hidden" name="THE_ID_STR" id="THE_ID_STR" value="">
                            <button type="submit" id="selected_export" class="btn btn-info"><fmt:message code="global.lang.report" /></button>
                        </form>
                        <button type="button" id="export" class="btn btn-info daochuwork" onclick="clicked1();"><img src="../../img/mywork/dclist.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="workflow.th.Exportwork" /></button>
                        <button type="button" class="btn btn-info" id="refresh" onclick="clicked2();"><img src="../../img/mywork/shuxinwork.png" style="margin-right: 8px;margin-bottom: 1px;"><fmt:message code="global.lang.refresh" /></button>
                    </div>
                </div>
                <div id="pagediv">

                </div>
            </div>
	</div>
<%--</div>--%>
<script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>
<script>
    $.ajaxSetup({cache: false});

	$(document).keyup(function (e) {//捕获文档对象的按键弹起事件
		if (e.keyCode == 13) {//按键信息对象以参数的形式传递进来了
			//此处编写用户敲回车后的代码
			$('#btn_search h1').click();
		}
	});
	$(function(){
        $('.index_head li').click(function(){
            var datanums = $(this).attr('data-num');
            $(this).find('span').addClass('one').parent().siblings().find('span').removeClass('one');
            if(datanums == 0){
                window.location.href='/workflow/work/workList';
            }else if(datanums == 1){
                window.location.href='/workflow/work/endwork';
            }else if(datanums == 2){
                window.location.href='/workflow/work/allwork';
            }
        })
    })
</script>
<script type="text/javascript">
	var huiqian = '';
	var zhuban = '';
    function runWorkListPage() {
        location.reload();
    }
    function clicked5(){
        parent.parent.urlnewworkflow()
    }
    function getWorkLevle(num_workLevel){
        var str_workLevel;
        switch(num_workLevel){
            case 0:
                str_workLevel='普通';
                break;
            case 2:
                str_workLevel='重要';
                break;
            case 1:
                str_workLevel='紧急';
                break;
            default:
                str_workLevel='普通';
        }
        return str_workLevel;
    }
    function clicked1(){
        window.location.href ="exportExcel?type=1"
    }
    function clicked2(){
        location.reload();
    }
    function handleData(data){
        switch(data){
            case "1":
                return '<fmt:message code="lang.th.will" />';
            case "2":
                return '<fmt:message code="lang.th.Process" />';
            case "3":
                return '<fmt:message code="main.th.ToStep" />';
            case "4":
                return '<fmt:message code="lang.th.HaveThrough" />';
            case "5":
                return '<fmt:message code="workflow.th.FreeFlowPresettingSteps" />';
            case "6":
                return '<fmt:message code="workflow.th.HasBeenSuspended" />';
        }
    }
    function js_method(e){
        e.parents('tr').find('.editAndDelete0').click();
	}
	var eventas=null;
	function bzlct(e){
        eventas=e;
        var aa=window.open('/flowSetting/processDesignToolTwo?flowId='+e.attr('flowid')+'&rilwId='+e.attr('runid'),'');


	}
    var pageObj=$.tablePage('#pagediv','1296px',[
        {
            width:'75px',
            title:'<fmt:message code="workflow.th.liushui"/>',
            name:'runId',
        },
        {
            width:'268px',
            title:'<fmt:message code="workflow.th.Documentname-number"/>',
            name:'workLevel',
            selectFun:function (workLevel,obj) {
                if(obj.flowRun.workLevel == 0){
                    var fontcolor = 'green';
                }else{
                    var fontcolor = 'red';
				}
                var workLevers = getWorkLevle(obj.flowRun.workLevel);
                return '<a class="wenhao" style="cursor: pointer;" href="javascript:void(0);" onclick ="js_method($(this))" title='+obj.flowRun.runName.split(' ')[0]+' runId='+obj.runId+' flowId='+obj.flowRun.flowId+' prcsId='+obj.flowProcess.prcsId+' flowstep='+obj.prcsId+'><span class="font-green" style="color:'+ fontcolor +'">【'+workLevers+'】</span>'+obj.flowRun.runName+'</a>';
            }
        },
        {
            width:'116px',
            title:'<fmt:message code="workflow.th.Initiator"/>',
            name:'userName',
            selectFun:function (userName,obj) {
                return obj.flowRun.userName;
            }
        },{
            width:'147px',
            title:'<fmt:message code="workflow.th.liuchengtu"/>',
            name:'prcsId',
            selectFun:function (prcsId,obj) {
                var fontcolor = '';
                return '<a class="wenhao" style="cursor: pointer;" onclick="bzlct($(this))" runid="'+ obj.flowRun.runId +'" flowid="'+ obj.flowRun.flowId +'"><fmt:message code="workflow.th.First" />'+prcsId+'<fmt:message code="workflow.th.step" />:'+obj.flowProcess.prcsName+'</a>';
            }
        },{
            width:'93px',
            title:'<fmt:message code="notice.th.state"/>',
            name:'prcsFlag',
            selectFun:function (prcsFlag,obj) {
                var status = handleData(prcsFlag);
                return status;
            }
        },
        {
            width:'187px',
            title:'<fmt:message code="workflow.th.totime"/>',
            name:'receiptTime',
            selectFun:function (receiptTime,obj) {
                var thiss = '';
                if(obj.receive == ""){
                    thiss = '未接收';
				}else{
                    thiss = '接收于:' + obj.receive;
				}
                return '<fmt:message code="workflow.th.ArriveTo" />:'+receiptTime+'<br>'+thiss;
            }
        },
        {
            width:'157px',
            title:'<fmt:message code="workflow.th.Alreadystop"/>',
            name:'arriveTime',
            selectFun:function (arriveTime,obj) {
                var thiss = '';
                if(obj.handleTime == ""){
                    thiss = '未接收';
                }else{
                    thiss = '接收时长:' + obj.handleTime;
                }
                return '<fmt:message code="workflow.th.ArriveTime" />:'+arriveTime+'<br>'+thiss;
            }
        },
        {
            width:'110px',
            title:'<fmt:message code="menuSSetting.th.menuSetting"/>',
        }
    ],function (me) {
        me.data.pageSize = 5;
        me.data.userId = $.cookie('userId');
        me.init('../../workflow/work/selectWork',[{name:'<fmt:message code="workflow.th.host" />',fn:function(obj){
            if(obj.opFlag == '0'){
                return "<fmt:message code="workflow.th.JointlySign" />";
			}else{
                return "<fmt:message code="workflow.th.host" />";
			}
        }},{name:'<fmt:message code="global.lang.delete" />',fn:function(obj){
            if(obj.flowProcess.prcsId == '1'){
                return  1;
            }else{
                return  0;
            }
        }}])
    })
    $(document).on('click','.editAndDelete0',function () {
        var obj=pageObj.arrs[$(this).attr('data-i')];
       if(obj.opFlag == 1){
           huiqian = 'zhuban';
	   }else{
           huiqian = 'huiqian';
	   }
		window.open('/workflow/work/workform?opflag='+ obj.opFlag +'&flowId='+obj.flowRun.flowId+'&prcsId='+obj.flowProcess.prcsId+'&flowStep='+obj.prcsId
			+'&runId='+obj.runId);

    })
    $(document).on('click','.editAndDelete1',function (){
        var obj=pageObj.arrs[$(this).attr('data-i')]
        var tid=obj.id;
        //删除判断
        layer.confirm('<fmt:message code="sup.th.Delete" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'] //按钮
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
                    layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                    location.reload();
                }
            })
        }, function(){
            layer.closeAll();

        });
    })
    $('#dbgz_search').click(function () {
        pageObj.data.myworkconditions=$("#flow_search_value").val();
        pageObj.init();
    })
</script>

</body>
</html>
