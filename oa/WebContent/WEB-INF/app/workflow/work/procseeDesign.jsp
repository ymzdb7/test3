
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
    <title><fmt:message code="main.newwork" /></title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8 ? MYOA_CHARSET : htmlspecialchars($HTML_PAGE_CHARSET))?>" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/m_reset.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/new_work.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/handle.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../lib/jquery.jqprint-0.3.js"></script>
    <script type="text/javascript" src="../../lib/jquery-migrate-1.1.0.js"></script>
    <script src="../../js/base/base.js"></script>
    <script src="../../js/workflow/work/workform.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
</head>
<style type="text/css">
    .cont{
        position: relative;
    }
    .downloadBtn{
        cursor: pointer;
        display: inline-block;
    }
    .deletefileBtn{
        cursor: pointer;
        margin-left: 10px;
        display: inline-block;
    }
    .previewBtn{
        cursor: pointer;
        margin-left: 10px;
        display: inline-block;
    }
    #tab_c{
        width: 316px;
        height: 86% !important;
        /* display: none; */
        top: 43px;
        right: -316px;
        bottom: 0;
        position: fixed;
        background: #fff;
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
        width: 200px;

    }
    .item_word h1{
        text-align: left;
        color: #4b4b4b;
        font-size: 10pt;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }
    .item_word h2{
        color: #919191;
        text-align: left;
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
        text-align: left;
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
    .foot li:hover {
        color:#fff !important;
        background:#4889f0 !important;
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
        max-height: 375px !important;
    }
    .layui-layer-title{
        font-family: '微软雅黑';
    }
    .orgAdd{
        display: inline-block;
        margin-top: 10px;
    }
    .userSelectBtn{
        background-image: url(../../img/userSelectBtn.png);
        width: 70px;
        height: 24px;
        background-color: rgb(238, 238, 238);
        cursor: pointer;
        margin-left: 5px;
        line-height: 23px;
        padding: 0px 6px;
        border-radius: 5px;
        border-width: 1px;
        border-style: solid;
    }
</style>
<body>

<div class="body">
    <div class="content">
        <div class="cont" id="client">
            <div class="cont_form" id="a2">

            </div>
        </div>

    </div>

</div>
<div id="printdiv">
    <div>
        <script>
            $(function(){
                domain;
                var flowId = $.getQueryString("flowId");
                var flowStep = $.getQueryString("flowStep") || '';
                var runId = $.getQueryString("runId") || '';
                $('#tab_c').css('right',-($('#tab_c').width()))
                $('#tab_c').css('height',$('#tab_c').height()-$('.head').height()-$('.foot').height())
                $('#tab_c').css('top',$('.head').height())
                //引入方法
                workForm.init({
                        formhtmlurl:'../../workflow/work/workfastAdd',//URL
                        resdata:{
                            flowId:flowId,
                            runId:runId,
                            prcsId:flowStep
                        },
                        flowStep:flowStep,//预览
                        target:'.cont_form'},
                    function (data,option) {
                        prcsId = data.object.flowRunPrcs.prcsId;
                        runId = data.object.flowRun.runId;
                        flowPrcs =  data.object.flowRunPrcs.flowPrcs;
                        prcsPrivlist = option.prcsPrivlist;
                        prcsUserlist = option.prcsUserlist;
                        prcsDeptlist = option.prcsDeptlist;
                        feedback = data.object.feedback;
                        attachPriv = data.object.attachPriv;
                        initSlideBar(prcsId,flowPrcs,runId);

                        zhuanjiao(data,option);
                        var obj=data.object.flowRun
                        var  titleName=obj.runName;
                        $('.num').html(titleName);
                        var obj2=data.object.listFp[0];
                        $('.step').html('<fmt:message code="workflow.th.host" />：(<fmt:message code="workflow.th.FirstStep" />：'+obj2.prcsName+')');
                        $('#add_fujian').click(function(){
                            if(checkttachPriv(1)){
                                $('#uprunId').val(data.object.flowRun.runId);
                                $('#uploadinputimg').click();
                            }else{
                                $.layerMsg({content:'<fmt:message code="document.th.AttachmentPermission" />！',icon:6},function(){

                                });
                            }

                        });
                    });


                function checkttachPriv(privNum){

                    if(attachPriv.indexOf(privNum) > -1){
                        return true;
                    }
                    return false   ;
                }
                function checkFeeback(){
                    if(feedback == '0'){
                        return true;
                    }
                    return false;
                }
                $('#oneUploadFile').on('click','.downloadBtn',function () {
                    var _this = $(this);
                    if(checkttachPriv(4)){
                        var url = _this.attr("atturl")
                        window.location="../../download?"+url;
                    }else{
                        $.layerMsg({content:'<fmt:message code="document.th.permissionDownload" />！',icon:6},function(){

                        });
                    }
                });
                $('#oneUploadFile').on('click','.deletefileBtn',function () {
                    var _this = $(this);
                    if(checkttachPriv(3)){
                        var url = _this.attr("atturl")
                        window.location="../../download?"+url;
                    }else{
                        $.layerMsg({content:'<fmt:message code="document.th.DeletePermissions" />！',icon:6},function(){

                        });
                    }
                });
                $('#oneUploadFile').on('click','.previewBtn',function () {
                    var _this = $(this);
                    if(checkttachPriv(4)){
                        $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment" />！',icon:6},function(){

                        });
                    }else{
                        $.layerMsg({content:'<fmt:message code="workflow.th.previewPermissions" />！',icon:6},function(){

                        });
                    }
                });
                $('#print').click(function(){

                    if(checkttachPriv(5)){
                        $('.cont_form').jqprint();
                    }else{
                        $.layerMsg({content:'<fmt:message code="document.th.printPermissions" />！',icon:6},function(){

                        });
                    }

                });
                $("#signSendBtn").click(function(){
                    console.log(checkFeeback())
                    if(checkFeeback()){
                        var text = $('#signText').val();
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
                                $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                                    $('#signText').val('');
                                    initSlideBar(prcsId,flowPrcs,runId);
                                });
                            }
                        });
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
                                    str += ' <li><div class="item_logo"></div><div class="item_word"><h1>'+v.attachName+'</h1><h2></h2></div><div  class="item_word"><h2  attUrl="'+v.attUrl+'" class="downloadBtn"><fmt:message code="file.th.download" /></h2><h2  attUrl="'+v.attUrl+'" class="previewBtn"><fmt:message code="global.lang.view" /></h2><h2  attUrl="'+v.attUrl+'" class="deletefileBtn"><fmt:message code="global.lang.delete" /></h2></div></li>';
                                });
                                $('#oneUploadFile').html(str)
                            }

                        }
                    });
                }
                $('#uploadinputimg').change(function(e){
                    var target = $(e.target);
                    var file;
                    if(target[0].files && target[0].files[0]){
                        file=target[0].files[0];
                    }
                    if(file){
                        $.upload($('#uploadimgform'),function(res){
                            var data=res.obj;
                            var str=''
                            data.forEach(function (v,i) {
                                str += ' <li><div class="item_logo"></div><div class="item_word"><a href="javascript:void(0);"><h1 attUrl="'+v.attUrl+'">'+v.attachName+'</h1></a><h2></h2></div><div  class="item_word"><h2  attUrl="'+v.attUrl+'" class="downloadBtn"><fmt:message code="file.th.download" /></h2><h2  attUrl="'+v.attUrl+'" class="previewBtn"><fmt:message code="global.lang.view" /></h2><h2  attUrl="'+v.attUrl+'" class="deletefileBtn"><fmt:message code="global.lang.delete" /></h2></div></li>';
                            });
                            $('#oneUploadFile').append(str)
                        });
                    }
                });
                function initSign(prcsId,flowPrcs,runId){
                    $.ajax({
                        type: "get",
                        url: "findworkfeedback",
                        dataType: 'JSON',
                        data: {
                            prcsId:prcsId,
                            flowPrcs:flowPrcs,
                            runId:runId
                        },
                        success: function (obj) {
                            if(obj.flag){
                                var str = '';
                                obj.obj.forEach(function (v,i) {
                                    str += '<li><div class="huiqian_touxiang"><img class="huiqian_logo" src="../../img/workflow/work/add_work/touxiang.png"></div><div class="huiqian_word"><h1><fmt:message code="workflow.th.DivisionManager" /></h1><h2>'+v.editTime+'</h2><h3 title="'+v.content+'">'+v.content+'</h3></div></li>';
                                });
                                $('#signbox').html(str)
                            }
                        }
                    });
                }
                //第一个
                $('.fujian').on('click',function(){
                    $('.fujian').find('a').css('color','#fff');
                    $('.huiqian').find('a').css('color','#4889f0');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('#tab_c').css('right','0px')
//           $('#tab_c').animate({width:"316px"});
                    $('#tab_ctwo').hide();
                    $('.tab_one').show();

                })
                //第二个
                $('.huiqian').on('click',function(){
                    $('.fujian').find('a').css('color','#4889f0');
                    $(this).find('a').css('color','#fff');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('#tab_ctwo').hide();
                    $('.tab_one').show();
                    /*$('.one_all').hide();
                     $('.tab_one').show();
                     $('.cont_ctwo').show();*/
                })
                //第三个
                $('.liucheng').on('click',function(){
                    $('.huiqian').find('a').css('color','#4889f0');
                    $('.fujian').find('a').css('color','#4889f0');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('.cont_cthr').siblings().hide();
                    $('.tab_one').hide();
                    $('#tab_ctwo').show();
                    $('.cont_cthr').show();
                })
                //第四个
                $('.guanlian').on('click',function(){
                    $('.huiqian').find('a').css('color','#4889f0');
                    $('.fujian').find('a').css('color','#4889f0');
                    $(this).siblings().removeClass("check");
                    $(this).addClass('check');
                    $('.cont_cfour').siblings().hide();
                    $('.tab_one').hide();
                    $('#tab_ctwo').show();
                    $('.cont_cfour').show();
                })
                $('.position').on('click',function () {
                    $('#tab_c').css('right',-$('#tab_c').width())
                })
                //点击左下角的附件
                $('#attach_name').on('click',function(){

                    $('#tab_c').animate({right:'0px'},"slow");

                })
                function subPric(source,pos) {
                    var strs= new Array(); //定义一数组
                    strs=source.split(pos); //字符分割
                    return strs;
                }
                function zhuanjiao(data,option) {
                    var formLength=option.formLength;
                    //转交下一步
                    var obj=data.object.flowRun
                    var titleName=obj.runName;
                    var prcsTo;
                    var prcsName='';
                    var turnObj = {};
                    var nextFlowid = ''
                    for(var i=0;i<data.object.listFp.length;i++){
                        var obj2=data.object.listFp[i];
                        if(flowStep == obj2.prcsId){
                            turnObj = obj2;
                            if(obj2.prcsTo=='0,'){
                                prcsName='<div class="prcsName" style="" prcsId=0><h1><fmt:message code="main.th.EndProcess" /></h1></div>';
                            }
                            if(obj2.prcsTo!=""){
                                prcsTo= subPric(obj2.prcsTo,",");
                                break;
                            }
                            break;
                        }
                    }
                    if(prcsTo){
                        for (var j=0;j<prcsTo.length;j++){
                            if(j == 1){
                                nextFlowid = prcsTo[0];
                            }
                            for(var i=0;i<data.object.listFp.length;i++){
                                var obj2=data.object.listFp[i];
                                if(obj2.prcsId== prcsTo[j]){
                                    prcsName+='<div class="prcsName" style="" prcsId='+obj2.prcsId+'><h1>'+obj2.prcsName+'</h1></div>';
                                }
                            }
                        }
                    }
                    $('.zhuanjiao').on('click',function(){
                        //找到表格上的内容
                        var form_item=$('.cont_form .form_item');
                        var realData=[];
                        var radioArr = {};
                        var modifydata =[]
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
                            }else if(datatype=="macros"){
                                if(obj.attr('type') == "text"){
                                    value= obj.val();
                                }else{
                                    value= obj.val()==0?'':form_item.eq(i).val();
                                }
                            }else if(obj.attr("type")=="radio"){
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
                            if(value != ''){
                                modifydata.push(baseData);
                            }
                        }
                        if(flag){
                            realData = [];
                            return false;
                        }
                        var obj3=data.object.flowRun;
                        datas={
                            flowId:obj3.flowId,
                            formdata:JSON.stringify(realData),
                            runId:obj3.runId,
                            runName:obj3.runName,
                            beginTime:obj3.beginTime,
                            beginUser:obj3.beginUser,
                            formLength:formLength,
                            prcsId : prcsId,
                            flowPrcs : flowPrcs,
                            modifydata:JSON.stringify(modifydata)
                        }
                        $.ajax({
                            type: "get",
                            url: "../../workflow/work/findbranch",
                            dataType: 'JSON',
                            data: {
                                flowId:obj3.flowId,
                                flowPrcs:nextFlowid,
                                runId:obj3.runId
                            },
                            success: function(obj){
                                var data1 = obj.object;
                                var autoTypelist1 = data1.autoTypelist;
                                prcsPrivlist = data1.prcsPrivlist;
                                prcsUserlist = data1.prcsUserlist;
                                prcsDeptlist = data1.prcsDeptlist;
                                //保存表格数据的接口
                                $.ajax({
                                    type: "post",
                                    url: "../../workflow/work/nextwork",
                                    dataType: 'JSON',
                                    data: datas,
                                    success: function(obj){
                                        if(obj.flag==true){
                                            //传入的参数
                                            layer.open({
                                                type: 1,
                                                /* skin: 'layui-layer-rim', //加上边框 */
                                                offset: '80px',
                                                area: ['800px', '500px'],
                                                closeBtn: 0,
                                                title:titleName,
                                                content: '<div class="modal-body" style="max-height: 274px;">'+
                                                '<div class="work-prcs-title" id="op_user_show_info" style="margin-bottom: 10px;font-weight: normal;border-radius: 4px;-webkit-border-radius: 4px;">'+
                                                '<fmt:message code="main.th.currentStep" /><font color="red">1</font><fmt:message code="workflow.th.step" />[<fmt:message code="workflow.th.HumanResourcesDepartment" />]<font color="red"><div self_type="self" style="display:inline;"><fmt:message code="email.th.systemmanager" /></div>'+
                                                '<div style="margin-top: -21px;margin-left: 274px;">(<fmt:message code="lang.th.Process" />)</div></font></div><div class="work-prcs-block">'+
                                                '<div class="work-prcs-content clearfix" style="border: 1px solid #f3f3f3;"><div style="width:231px;height:30px;background:#2b7fe0;"><h1 style="margin: 0px 57px;line-height: 30px;color: #f3f3f3;"><fmt:message code="main.th.nextStep" /></h1></div><div class="workflow-procs-nodes-wrap"><ul id="workPrcsData" class="workflow-procs-nodes"><li class="workflow-node" id="next_prcs_2">'+
                                                prcsName+'<ol></ol> </li></ul></div><div class="workflow-procs-line"></div><div class="workflow-procs-nodes-result-wrap">'+
                                                '<ul id="work-next-prcs-block" class="workflow-procs-nodes-result" style="top: 0px;">'+
                                                '<li class="workflow-node-result clearfix " prcs_id_next="2">'+
                                                '<div class="workflow-node-title"><div class="workflow-node-ops"><input type="button" class="userSelectBtn" name="userSelectBtn" id="chose_user2" value="&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="main.th.SelectPersonnel" />"></div> </div>'+
                                                '<div class="users-select-block"><div id="host_op_block_div2" class="clearfix">'+
                                                '  <input type="hidden" id="PRCS_OP_USER2" data_type="op_user_btn" name="PRCS_OP_USER2" value="admin">'+
                                                ' <input type="hidden" id="PRCS_BACK" name="PRCS_BACK" value=""><div class="sponsor">'+
                                                '<a href="#" class="prcs-op-uname" id="TOP_FLAG_SHOW2"><fmt:message code="sup.th.Sponsor" />：</a><input type="hidden" id="TOP_FLAG2" name="TOP_FLAG2" value="0">'+
                                                '<div id="TOP_FLAG_SHOW2_menu" class="attach_div small" style="display: none; top: 33px; left: 153px;">'+
                                                '<a href="javascript:set_top(0,"2");"><fmt:message code="sup.th.Sponsor" />：</a><a href="javascript:set_top(2,"2");"><fmt:message code="workflow.th.NoSponsorWillSign" />：</a>'+
                                                '<a href="javascript:set_top(1,"2");"><fmt:message code="main.th.FirstReceiverHosting" />：</a></div></div>'+
                                                '<textarea class="user-tags" id="remind_name" user_id=""></textarea></div>'+
                                                '<div id="prcs_op_block_div2" class="clearfix">'+
                                                '<input type="hidden" data_type="op_user_btn" id="PRCS_USER2" name="PRCS_USER2" value="admin,">'+
                                                '<div class="managers"><fmt:message code="workflow.th.Manager" />：</div><textarea class="user-tags" user_id="" id="jingban"></textarea>'+
                                                '</div></div></li></ul></div></div></div><div class="work-msg-block">'+
                                                '<div class="work-msg-title"><a id="msg-control" href="#"><img style="vertical-align: text-top; margin-top: 5px;" src="../../img/workflow/work/add_work/form_down.png"></a><fmt:message code="main.th.Sendmessage" /></div>'+
                                                '<div class="work-msg-content" style="display: block;"><div class="clearfix">'+
                                                '<div data_type="next" class="work-msg-op-title"><fmt:message code="workflow.th.nextstep" />：<span class="sms-check sms-bg " title="<fmt:message code="notice.th.remindermessage" />"></span> <span class="mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span class="email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span>'+
                                                '</div>'+
                                                '<div data_type="create" class="work-msg-op-title"><fmt:message code="workflow.th.Initiator" />：<span class="sms-check sms-bg sms-bg-static" title="<fmt:message code="notice.th.remindermessage" />"></span>'+
                                                '<span class="mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span class="email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span></div>'+
                                                '<div data_type="managers" class="work-msg-op-title"><fmt:message code="doc.th.AllHandlers" />：<span class="sms-check sms-bg sms-bg-static" title="<fmt:message code="notice.th.remindermessage" />"></span> <span class="mobile-check mobile-bg mobile-bg-static" title="<fmt:message code="main.th.SendSMS" />" style="display:none;"></span>'+
                                                '<span class="email-check email-bg email-bg-static" title="<fmt:message code="main.th.SendMail" />"></span> </div> </div>'+
                                                '<div class="clearfix">'+
                                                '<fmt:message code="main.th.RemindHandler" />： <input type="hidden" name="remind_others_id" id="remind_others_id" value="">'+
                                                '<textarea name="remind_others_name" id="remind_others_name" readonly="" style="width:376px;"></textarea>&nbsp;'+
                                                '<a class="orgAdd" id="others-add"><fmt:message code="global.lang.select" /></a>&nbsp;'+
                                                '<a class="orgClear" id="others-clear" href="javascript:ClearUser("remind_others_id", "remind_others_name");"><fmt:message code="global.lang.empty" /></a>'+
                                                '</div>'+
                                                '<div class="work-msg-sms-block">'+
                                                '<fmt:message code="main.th.ReminderContent" />：<input type="text" style="width: 600px;" name="SMS_CONTENT" id="SMS_CONTENT" value="<fmt:message code="main.th.serialNumber" />：829，<fmt:message code="workflow.th.job" />：<fmt:message code="workflow.th.JobDescriptionEnterprise" />(2017-05-25 18:47:35)">'+
                                                ' </div></div></div></div>',

                                                btn:['<fmt:message code="main.th.confirm" />', '<fmt:message code="depatement.th.quxiao" />'],
                                                success: function(layero,index){
                                                    var mainprcName = '';
                                                    var overprcName = '';
                                                    var mainprcId = '';
                                                    var overprcId = '';
                                                    if(autoTypelist1 && (autoTypelist1 instanceof Array)){
                                                        autoTypelist1.forEach(function(v,i){
                                                            mainprcName += v.userName+',';
                                                            mainprcId += v.userId+',';
                                                            overprcName = v.userName+',';
                                                            overprcId += v.userId+',';
                                                        });

                                                    }
                                                    $('#remind_name').val(mainprcName);
                                                    $('#remind_name').attr('user_id',mainprcId);
                                                    $('#jingban').val(overprcName);
                                                    $('#jingban').attr('user_id',overprcId);

                                                    if($('#next_prcs_2 .prcsName').length > 0){
                                                        $('#next_prcs_2 .prcsName').eq(0).addClass('prcsName_chang');
                                                    }

                                                    //调取选人控件
                                                    $('#chose_user2').on('click',function(){
                                                        UserItemMain = 'remind_name';
                                                        UserItem = 'jingban';
                                                        $.popWindow("../../common/selectUserWorkFlow");
                                                    })

                                                    //底部选择人员
                                                    $('#others-add').on('click',function(){
                                                        user_id='remind_others_name';
                                                        $.popWindow("../../common/selectUser");
                                                    })
                                                    //折叠
                                                    $('#msg-control').on('click',function(){
                                                        if($('#msg-control').find('img').attr('src')=='../../img/workflow/work/add_work/form_down.png'){
                                                            $('#msg-control').find('img').attr('src','../../img/workflow/work/add_work/from_right.png')
                                                        }else{
                                                            $('#msg-control').find('img').attr('src','../../img/workflow/work/add_work/form_down.png')
                                                        }
                                                        $('.work-msg-content').slideToggle();
                                                    });
                                                    //点击下一步骤，样式的改变
                                                    $('.workflow-procs-nodes-wrap').on('click','.prcsName',function(){
                                                        var _this = $(this);
                                                        _this.siblings().removeClass('prcsName_chang');
                                                        _this.addClass('prcsName_chang');
                                                        _this.siblings().attr('check','0');
                                                        _this.attr('check','1');
                                                        $.ajax({
                                                            type: "get",
                                                            url: "../../workflow/work/findbranch",
                                                            dataType: 'JSON',
                                                            data: {
                                                                flowId: obj3.flowId,
                                                                flowPrcs: nextFlowid,
                                                                runId: obj3.runId
                                                            },
                                                            success: function (obj) {
                                                                var option = obj.object;
                                                                var autoTypelist = option.autoTypelist;
                                                                var mainprcName = '';
                                                                var overprcName = '';
                                                                var mainprcId = '';
                                                                var overprcId = '';
                                                                if(autoTypelist && (autoTypelist instanceof Array)){
                                                                    autoTypelist.forEach(function(v,i){
                                                                        mainprcName += v.userName+',';
                                                                        mainprcId += v.userId+',';
                                                                        overprcName = v.userName+',';
                                                                        overprcId += v.userId+',';
                                                                    });

                                                                }
                                                                $('#remind_name').val(mainprcName);
                                                                $('#remind_name').attr('user_id',mainprcId);
                                                                $('#jingban').val(overprcName);
                                                                $('#jingban').attr('user_id',overprcId);

                                                                prcsPrivlist = option.prcsPrivlist;
                                                                prcsUserlist = option.prcsUserlist;
                                                                prcsDeptlist = option.prcsDeptlist;
                                                            }
                                                        });
                                                    })

                                                },
                                                yes: function(index, layero){
                                                    //按钮【按钮三】的回调
                                                    //新建工作之后的保存接口，跳转到我的工作页面
                                                    var ret=data.object.flowRun;
                                                    var ret3=data.object.flowRunPrcs;
                                                    var pId=$('#next_prcs_2 .prcsName_chang').attr('prcsid')
                                                    var beginUser = $('#remind_name').attr('user_id');
                                                    var jingbanUser = $('#jingban').attr('user_id');
                                                    if(beginUser == '' &&$('#next_prcs_2 .prcsName_chang').find('h1').text()!='<fmt:message code="main.th.EndProcess" />'){
                                                        $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:0},function(){
                                                            return false;
                                                        });
                                                    }else{
                                                        if($('#next_prcs_2 .prcsName_chang').find('h1').text()=='<fmt:message code="main.th.EndProcess" />'){
                                                            savedData={
                                                                flowId:ret.flowId,
                                                                runId:ret.runId,
                                                                runName:ret.runName,
                                                                beginTime:ret.beginTime,
                                                                beginUser:$('#remind_name').attr('user_id'),
                                                                prcsId:ret3.prcsId,
                                                                prcsflag:1,
                                                                flowPrcs:pId,
                                                                jingbanUser:$('#jingban').attr('user_id')
                                                            }
                                                        }else{
                                                            savedData={
                                                                flowId:ret.flowId,
                                                                runId:ret.runId,
                                                                runName:ret.runName,
                                                                beginTime:ret.beginTime,
                                                                beginUser:$('#remind_name').attr('user_id'),
                                                                prcsId:ret3.prcsId,
                                                                flowPrcs:pId,
                                                                prcsflag:1,
                                                                jingbanUser:$('#jingban').attr('user_id')
                                                            }
                                                        }
                                                        //保存的接口
                                                        $.ajax({
                                                            type: "post",
                                                            url: "../../workflow/work/saveWork",
                                                            dataType: 'JSON',
                                                            data: savedData,
                                                            success: function (obj) {
                                                                if(obj.flag==true){
                                                                    $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                                                                        window.close();
                                                                        parent.opener.location.href='workList';
                                                                    });
                                                                }else{
                                                                    $.layerMsg({content:'<fmt:message code="meet.th.SaveFailed" />！',icon:1},function(){

                                                                    });
                                                                }
                                                            }
                                                        });
                                                        layer.closeAll();
                                                    }

                                                }
                                            });
                                        }else{
                                            //alert('错误');
                                            $.layerMsg({content:'<fmt:message code="global.lang.error" />！',icon:1},function(){

                                            });
                                        }
                                    }
                                });
                            }
                        });





                    });
                }
            });
        </script>
        <script>
            //控制高度
          autodivheight();
            function autodivheight(){
                var winHeight=0;
                if (window.innerHeight)
                    winHeight = window.innerHeight;
                else if ((document.body) && (document.body.clientHeight))
                    winHeight = document.body.clientHeight;
                if (document.documentElement && document.documentElement.clientHeight)
                    winHeight = document.documentElement.clientHeight;
                winWidth = document.documentElement.clientWidth;
                document.getElementById("client").style.height= winHeight +"px";
                document.getElementById("client").style.width= winWidth  +"px";
            }
            window.onresize=autodivheight;
        </script>
</body>
</html>
