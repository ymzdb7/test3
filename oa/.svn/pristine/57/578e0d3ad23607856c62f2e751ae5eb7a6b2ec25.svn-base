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
    <title><fmt:message code="roleAuthorization.th.ViewDetails" /></title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8 ? MYOA_CHARSET : htmlspecialchars($HTML_PAGE_CHARSET))?>" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/m_reset.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/new_work.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/handle.css"/>
    <link rel="stylesheet" type="text/css" href="/css/dept/roleAuthorization.css"/>
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/workflow/work/workform.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="/lib/jquery.jqprint-0.3.js"></script>
    <script src="/lib/jquery-migrate-1.1.0.js"></script>
    <script src="/js/mustache.min.js"></script>
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
    <!-- 移动端端附加功能 -->
    <link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.mobile.css">
    <script type="text/javascript" src="../../lib/kinggrid/signature.mobile.min.js"></script>
    <script>
//        if(parent.opener.typeName!=undefined){
//            document.title=parent.opener.typeName;
//        }else if(parent.opener.typeName==undefined||parent.opener.typeName==''){
//            document.title='查看详情';
//        }
    </script>
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


    .steptext{
        float: right;
        margin-top: 2px;
    }
    .cont{
        position: relative;
        overflow-y: auto;
        overflow-x: hidden;
    }
    #tab_c{
        width:316px;
        height:100%;
        top:0;
        bottom:0;
        position: fixed;
        /* background: red;*/
        overflow-y: scroll;
        box-shadow: -2px 0 20px 0px #c4c4c4;
    }
    .cont_form{
        margin: 0 auto;
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
        height:85%;
    }
    .tab_one{
        width:100%;
        height: 200%;
    }
    .cont_cone li{
        width: 85%;
        height:50px;
        margin:10px auto;
        border: 1px solid #cccccc;
        border-radius: 3px;

    }

    .one_all,.two_all{
        width:100%;
        height:25%;
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
        margin-left: 3px;
        margin-top: 5px;
        background: #00a2d4;
    }
    .item_word{
        margin-top: 5px;
        margin-left: 7px;
    }
    .item_word h1{
        color: #4b4b4b;
        font-size: 10pt;
    }
    .item_word h2{
        color: #919191;
    }
    .position{
        position: absolute;
        right: 21px;
        top: 17px;
        clear: both;
    }
    .fujian_logo,.fujian_h1,.huiqian_logo,.huiqian_h1{
        float: left;
    }
    .fujian_logo{
        margin-top: 3px;
    }
    .huiqian_logo{
        margin-top: 10px;
    }
    .fujian_h1,.huiqian_h1{
        margin-left: 5px;
        font-size: 12pt;
        margin-top: 3px;
        /*        line-height: 40px;*/
    }
    .huiqian_h1{
        line-height: 40px;
    }
    .add_fujian{
        width: 85%;
        height: 40px;
        border-radius: 7px;
        /*border: none;*/
        background: #54a9fc;
        color: #fff;
        margin: auto;
        margin-left: 24px;
        text-align: center;
        line-height: 40px;
        outline: none;
    }
    .foot_left{
        width:160px;
    }
    .foot_rig{
        width: 535px;
    }
    .cont_ctwo li{
        width: 90%;
        height: 70px;
        border-radius: 3px;
        margin: auto;
        border:1px solid #cccccc;
        margin-top: 7px;
    }
    .huiqian_inp,.huiqian_send{
        float:left;
    }
    .hui_inp{
        width: 81% !important;
        margin-left: -56px !important;
    }
    .huiqian_inp{
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
        width: 15%;
        height: 30px;
        background: #ff9b30;
        color: #fff;
        margin-left: 8px;
        outline: none;
        border-radius: 3px;
        border: none;
    }
    .huiqian_word{
        width:80%;
        height:100%;
        margin-left: 4px;
    }
    .huiqian_word h1{
        margin-top: 8px;
    }
    .huiqian_word h2{
        color: #919191;
    }
    .huiqian_touxiang{
        margin-left: 2px;
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

        overflow: hidden !important;
    }
    /*.foot li:hover {*/
        /*color:#fff !important;*/
        /*background:#4889f0 !important;*/
    /*}*/
    .foot .bak1{
        background:url("/img/workflow/work/print_default.png") no-repeat ;
        width: 74px!important;
        height:30px;color:#333;font-size: 11pt;
    }
    .foot .bak1:hover{
        background:url("/img/workflow/work/print_float.png") no-repeat ;
        width: 74px!important;
        height:30px;color:white;
    }
    .foot .bak1 h1 {margin-left: 20px;z-index: 1000;}
    .foot .bak2 h1 {margin-left: 20px; z-index: 1000;}
    .foot .bak2{
        background:url("/img/workflow/work/close_default.png") no-repeat ;
        width: 74px!important;
        height:30px;color:#333;font-size: 11pt;
    }
    .foot .bak2:hover{
        background:url("/img/workflow/work/close_float.png") no-repeat ;
        width: 74px!important;
        height:30px;color:white;
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
        width: 100%;
        height: 40px;
        background: url("../../../img/workflow/work/add_work/uncheck.png") no-repeat 20px center;
    }
    .prcsName h1 {
        text-align: center;
        line-height: 40px;
    }
    .prcsName_chang{
        color:#fff;
        background: #5B7FCB  url("../../../img/workflow/work/add_work/checked.png") no-repeat 20px center;
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
        width: 50px;
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
        max-height: 341px !important;
    }
    .flowtypetext{
        float: left;
        margin-top: 2px;
        line-height: 48px;
    }
    .fileDownload{
        cursor: pointer;
    }
    .fileDownload:hover{
        color:blue;
    }
    .steptextcheck ul li{
        padding: 10px 25px;
        line-height: 22px;
        background: #fff;
        font-size: 12px;
        color: #666;
        border: 1px solid #ddd;
        margin: 10px 0;
        text-align: left;
        list-style: none;
    }
    .clearfix:after{
        content:'';
        display: block;
        clear: both;
    }
    .tabAB{

        position: absolute;
        background-color: #fff;
        margin-left:50%;
        width:140px;
        height:28px;
        margin-top:8px;
        display: none;
    }
    .tabAB ul{
        width: 140px;
        height: 28px;
        border: 1px solid #4889f0;
        border-radius: 5px;
    }
    .tabAB ul li{
        height:28px;
        line-height: 28px;
        width:70px;
        color:#4889f0;
        cursor: pointer;
        text-align: center;
        margin:0;
    }
    .tabAB ul li.active{
        background: #4889f0 ;
        color:#fff;
    }
    .tabAB ul li:hover{
        background: #4889f0 ;
        color:#fff;
    }
    .foot_rig ul li:nth-child(3){
        width: 73px !important;
    }
    .foot_rig ul li:nth-child(1){
        width: 73px !important;
    }
    .tr_td tr:nth-child(odd):hover {
        background-color: #F6F7F9;
    }
    .tr_td tr:nth-child(even):hover{
        background-color: rgb(230, 235, 239);
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
</style>
<body>
<div id="bodys" style="display: none">
    <div class="head" style="position: relative">
        <div id="title" class="abs_left">
            <h1 class="num"></h1>
            <h2 class="step"></h2>
            <h2 class="step"><input data-id="1" type="checkbox" checked="checked"><span class="steptext"><fmt:message code="workfolw.th.form" /></span></h2>
            <h2 class="step"><input data-id="2" type="checkbox" checked="checked"><span class="steptext"><fmt:message code="workflow.th.PublicAccessories" /></span></h2>
            <h2 class="step"><input data-id="3" type="checkbox" checked="checked"><span class="steptext"><fmt:message code="work.th.CountersignedArea" /></span></h2>
            <h2 class="step"><input data-id="4" type="checkbox" checked="checked"><span class="steptext"><fmt:message code="workflow.th.chart" /></span></h2>
        </div>

        <div id="tab_t" class="abs_right">
            <span id="flowtype" class="flowtypetext"></span>
        </div>
        <div class="tabAB">
            <ul class="clearfix">
                <li class="fl active" data-id="1" ><fmt:message code="workflow.th.form" /></li>
                <li class="fl" data-id="2" ><fmt:message code="main.th.text" /></li>
            </ul>
        </div>
    </div>
    <div class="content" >
        <%-- <form action="<%=basePath%>/workflow/work/nextwork"   id="ajaxform">--%>
        <div class="cont" style="background: #fff" id="client">
            <div class="cont_form" id="a2">

            </div>
            <div class="theAttachment" style="width: 100%;">
                <p style="width: 70%;margin: 0 auto;font-size: 14pt;margin-top: 10px;">
                    <fmt:message code="workflow.th.PublicAccessories" />
                </p>
                <p style="width: 70%;margin: 0 auto;font-size: 12pt;margin-top: 10px;padding-left: 10px;">
                    <label><input type="checkbox" name="allchebox"><fmt:message code="notice.th.allchose" /></label>
                </p>
                <table style="width: 70%;margin: 0 auto;table-layout: fixed" class="tr_td tr_tds">
                    <thead>
                        <tr>
                            <th class="th" width="40%">
                               <fmt:message code="workflow.th.AttachmentName" />
                            </th>
                            <th class="th" width="30%">
                                <fmt:message code="workflow.th.AttachmentSize" />
                            </th>
                            <th class="th" width="30%">
                                <fmt:message code="notice.th.createTime" />
                            </th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>


            <div class="steptextcheck">
                <p style="width: 70%;margin: 0 auto;font-size: 14pt;margin-top: 10px;">
                    <fmt:message code="work.th.CountersignedArea" />
                </p>
                <table width="70%" style="margin: 0 auto;table-layout: fixed;font-size: 12pt;margin-top: 10px;">
                   <tbody></tbody>
                </table>
            </div>





            <div class="steptextliucheng">
                <p style="width: 70%;margin: 0 auto;font-size: 14pt;margin-top: 10px;">
                    <fmt:message code="workflow.th.chart" />
                </p>
                <table width="70%" style="margin: 15px auto;table-layout: fixed" class="tr_td trtd_d">
                    <thead class="TableHeader">
                    <tr >
                        <th  nowrap="" class="th" colspan="3" align="center"><fmt:message code="workflow.th.TheProcessBegins" /></th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
            <div style="width: 100%;height: 49px;">

            </div>
        </div>





        <div class="officialDocument clearfix" style="display: none">
            <iframe id="zw" src="" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe>
        </div>
    </div>
    <div class="foot" style="background: #f8f8f8;height: 48px;border-top: 1px solid #9E9E9E;">
        <div class="foot_left">
        </div>
        <div class="foot_rig">
            <ul>
                <%--<li class="rig_li bak1"><h1 class="rig_h1" id="actionOverflow">更多操作</h1></li>--%>
                <li class="bak1" ><h1  id="print"><fmt:message code="global.lang.print" /></h1></li>
                <%--<li class="rig_li bak1"><h1 class="rig_h1" id="printPreView"><fmt:message code="workflow.th.allwork" /></h1></li>--%>
                <%--<li class="rig_li bak1"><h1 class="rig_h1" id="exportToWord"><fmt:message code="long.th.ExportWord" /></h1></li>--%>
                <%--<li class="rig_li bak1"><h1 class="rig_h1" id="exportToHtml"><fmt:message code="long.th.ExportHTML" /></h1></li>--%>
                <li class="bak2"><h1  id="closeWin"><fmt:message code="global.lang.close" /></h1></li>
            </ul>
        </div>
    </div>
</div>
<script>
    $('#print').click(function () {
        var widths=$('#a2 table').width();
        $('#a2 table').css('width','100%')
        $("#client").jqprint();
        $('#a2 table').css('width',widths)
    });
    $('#title input[type=checkbox]').click(function () {
        if($(this).is(':checked')){
            if($(this).attr('data-id')==1){
                $('#a2').show()
            }else if($(this).attr('data-id')==2){
                $('.theAttachment').show()
            }else if($(this).attr('data-id')==3){
                $('.steptextcheck').show()
            }else if($(this).attr('data-id')==4){
                $('.steptextliucheng').show()
            }
        }else {
            if($(this).attr('data-id')==1){
                $('#a2').hide()
            }else if($(this).attr('data-id')==2){
                $('.theAttachment').hide()
            }else if($(this).attr('data-id')==3){
                $('.steptextcheck').hide()
            }else if($(this).attr('data-id')==4){
                $('.steptextliucheng').hide()
            }
        }
    })
    $('#printPreView').click(function () {
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){

        });
    });

    $('#exportToWord').click(function () {
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){

        });
    });
    $('#exportToHtml').click(function () {
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){

        });
    });
    $('#closeWin').click(function () {
       window.close();
    });
</script>
</body>
</html>
<script>

    function fujian() {
        if($('.theAttachment table tbody tr').length>0){
            $('.theAttachment').show()
        }else {
            $('.theAttachment').hide()
        }
    }




    function huiqian() {
        if($('.steptextcheck table').length>0){
            $('.theAttachment').show()
        }else {
            $('.theAttachment').hide()
        }
    }
    
    
    
    function liucheng() {
        if($('.steptextliucheng table tbody tr').length>0){
            $('.steptextliucheng').show()
        }else {
            $('.steptextliucheng').hide()
        }
    }



    var isNomalType =  $.GetRequest().isNomalType;
    var tabId =  $.GetRequest().tabId;
    var tableName =  $.GetRequest().tableName;
    $(function(){
        if(isNomalType == 'false'){

            $('.officialDocument').height($(document).height()-$('.head').height())



            $('.tabAB').show();
            $('.tabAB ul li').click(function () {
                if ($(this).attr('data-id') == 2) {
                    if(tabId != ''){
                        $('#zw').attr('src','../../common/ntko?documentEditPriv=0&tabId='+tabId+'&tableName='+tableName);
                    }
                }
            });


            $('.tabAB ul li').click(function () {
                $(this).siblings().removeClass('active');
                $(this).addClass('active');
                if($(this).attr('data-id')==1){
                    $('#client').show();

                    $('.officialDocument').hide()
                }else {
                    $('#client').hide();
                    $('.officialDocument').show()
                }
            });
        }else{
            $('.opt').show();
            $('.step').show()
        }

        domain;
        var flowId = $.getQueryString("flowId");
        var flowStep = $.GetRequest().flowStep || '';
        var runId = $.getQueryString("runId") || '';
        var prcsId=$.GetRequest().prcsId || '';
        var tabId = $.getQueryString("tabId") || '';
        var tableName = $.getQueryString("tableName") || '';
        $('#tab_c').css('right',-($('#tab_c').width()))
        $('#tab_c').css('height',$('#tab_c').height()-$('.head').height()-$('.foot').height())
        $('#tab_c').css('top',$('.head').height())
        //引入方法
        workForm.init({
                formhtmlurl:'../../workflow/work/workfastAdd',//URL
                resdata:{
                    flowId:flowId,
                    runId:runId,
                    flowStep:flowStep,
                    prcsId:prcsId,
                    tabId:tabId,
                    tableName:tableName
                },
                prcsId:prcsId,
                flowStep:flowStep,//预览
                target:'.cont_form',
                preView:true
            },
            function (data,option) {

                if(data.object.flowRun.runId){
                    var  titleName= 'NO.&nbsp'+data.object.flowRun.runId+'&nbsp;'+data.object.flowRun.runName;
                    $('.num').html(titleName);
                }


                var obj2=data.object.listFp[0];
                var prcsFlag = data.object.flowRunPrcs.prcsFlag;

                var flowtype = prcsFlag == '1' ? '<fmt:message code="lang.th.will" />':(prcsFlag == '2' ?'<fmt:message code="lang.th.Process" />':(prcsFlag == '3'?'<fmt:message code="lang.th.Forwarded" />':'<fmt:message code="lang.th.HaveThrough" />'))

            });



        $.post('/flowProcess/getFlowAttachment',{'runId':$.GetRequest().runId},function (json) {
            if(json.flag){
                var str='';
                for(var i=0;i<json.obj.length;i++){
                    str+='<tr class="/download?'+encodeURI(json.obj[i].attUrl)+'"><td class="fileDownload" align="center">'+json.obj[i].attachName+'</td><td align="center">'+ json.obj[i].fileSize +'</td><td align="center">'+ json.obj[i].time +'</td></tr>'
                }
                $('.tr_tds tbody').html(str)
                fujian()
            }
        },'json')



        $.post('/flowProcess/getFlowFeedBack',{'runId':$.GetRequest().runId},function (json) {
            if(json.flag){

                var arr=json.obj;
                var str='';
                for(var i=0;i<arr.length;i++){
                    str+=' <tr style="background: #fff;margin-top: 10px;">\
                        <td width="70%"><p style="font-weight: bold"><fmt:message code="workflow.th.First" />'+arr[i].prcsId+'<fmt:message code="workflow.th.step" />'+arr[i].prcsName+' '+arr[i].userName+'：</p> <p style="margin: 10px;">'+arr[i].content+'</p></td>\
                        <td width="30%" align="right">'+arr[i].editTime+'</td>\
                    </tr>'
                }

                $('.steptextcheck table tbody').html(str)
                huiqian()
            }
        },'json')




        $.get('/flowProcess/getFlowRunPrecsAll',{
            'runId':$.GetRequest().runId
        },function (json) {
            if(json.flag){
                var designdata=json.datas;
                var str='';
                for(var i=0;i<designdata.length;i++){
                    str += '<tr class="this" style="border-right: 1px solid #ddd" prcsId='+ designdata[i].prcsId +'>' +
                        '<td width="15%" align="center" style="border-right: 1px solid #ddd"><fmt:message code="workflow.th.First" />' + (designdata[i].prcsId) + '<fmt:message code="workflow.th.step" /></td>' + /*第 步*/
                        '<td width="20%" align="center" style="border-right: 1px solid #ddd"><img src="/img/arrow_down.gif" alt=""><fmt:message code="workflow.th.Serial" />' + (i + 1) + '：' + designdata[i].prcsName + '</td>' + /*序号*/
                        '<td width="65%" align="left"><img src="/img/workflow.gif" alt=""><a style=" color: red;text-decoration:underline" href="javascript:void(0)">' +
                        '' + designdata[i].userName + '&nbsp' + function () {
                            if (designdata[i].opFlag == 0) {
                                return '<fmt:message code="workflow.th.HandledBy" />'
                                /*经办*/
                            } else if (designdata[i].opFlag == 1) {
                                return '<fmt:message code="workflow.th.host" />'
                                /*主办*/
                            }
                        }() + '</a><span style="color: #00aa00;margin-left: 5px;">(' + function () {
                            if (designdata[i].prcsFlag == 1) {
                                return '<fmt:message code="lang.th.will" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                /*未接收*/
                            } else if (designdata[i].prcsFlag == 2) {
                                return '<fmt:message code="lang.th.Process" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime/*+designdata[i].handleTime办理中*/
                                /*办理中*/
                            } else if (designdata[i].prcsFlag == 3) {
                                return '<fmt:message code="lang.th.Forwarded" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                <%--var handleTimes;--%>
                                <%--if (designdata[i].handleTime == undefined) {--%>
                                <%--handleTimes = ''--%>
                                <%--} else {--%>
                                <%--handleTimes = designdata[i].handleTime--%>
                                <%--}--%>
                                <%--return '<fmt:message code="workflow.th.ForwardToTheNextStep" />' + handleTimes--%>
                                /*转交下一步,用时*/
                            } else if (designdata[i].prcsFlag == 4) {
                                <%--return '<fmt:message code="lang.th.HaveThrough" />' + designdata[i].handleTime--%>
                                return '<fmt:message code="lang.th.HaveThrough" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                /*已办结*/
                            } else if (designdata[i].prcsFlag == 5) {
                                return '<fmt:message code="workflow.th.FreeFlowPresettingSteps" />'
                                /*自由流程预设步骤*/
                            } else if (designdata[i].prcsFlag == 6) {
                                return '<fmt:message code="workflow.th.HasBeenSuspended" />'
                                /*已挂起*/
                            }
                        }() + function () {
                            if (designdata[i].prcsFlag == 1) {
                                return ')'
                            } else {
                                return ')</span><p><fmt:message code="workflow.th.ArriveTo" />：' + designdata[i].createTime + '</p>' + /*开始于*/
                                    '<p><fmt:message code="workflow.th.ReceiveTo" />：' + designdata[i].prcsTime + '</p><p><fmt:message code="workflow.th.DoTo" />：' + designdata[i].deliverTime + '</p></td>' + /*结束于*/
                                    '</tr>'
                            }
                        }() + ""
                }
                if(json.status){
                    str += '<tr style="background-color: #fff"><td colspan="3" style="padding: 20px;font-size: 15px;text-align: center;color: #2F5C8F;font-weight: bold;">流程结束</td></tr>'
                }
                $('.trtd_d tbody').html(str)
                for(var i= 0;i<$('.trtd_d .this').length;i++){
                    var prcsid = $('.trtd_d .this').eq(i).attr('prcsid');
                    if($('.trtd_d .this[prcsid='+ prcsid +']').length !=1){
                        $('.trtd_d .this[prcsid='+ prcsid +']').eq(0).find('td').eq(0).attr('rowspan',$('.trtd_d .this[prcsid='+ prcsid +']').length);
                        for(var j=1;j<$('.trtd_d .this[prcsid='+ prcsid +']').length;j++){
                            console.log($('.trtd_d .this[prcsid='+ prcsid +']').eq(j))
                            $('.trtd_d .this[prcsid='+ prcsid +']').eq(j).find('td').eq(0).remove();
                        }
                        break;
                    }

                }
                liucheng()

            }
        },'json')


    });
</script>
<script>
    //控制高度
    autodivheight();
    $('#bodys').show()

    function autodivheight(){
        var winHeight=0;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        if (document.documentElement && document.documentElement.clientHeight)
            winHeight = document.documentElement.clientHeight;
            winWidth = document.documentElement.clientWidth;

    }
    window.onresize=autodivheight;

    $(document).delegate('.fileDownload','click',function () {
        window.open($(this).parent().prop('class'))
    })

</script>




