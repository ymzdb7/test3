<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <title><fmt:message code="sup.th.SupervisionTaskManagement" /></title>
    <link rel="stylesheet" href="/css/supervise/handle.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/supervision/handel.js"></script>
    <style>
        #already table tbody tr td:first-of-type{
            width: 10%;
        }
        .head .headli{
            width:135px!important;
        }
        .index_head li{
            width:165px!important;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/sys/icon_organizationmanagement_03.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="sup.th.SupervisionTaskManagement" />
    </div>
</div>
<div class="head w clearfix">
    <ul class="index_head">
        <li id="survey"><span class="one headli"><fmt:message code="sup.th.BasicDetails" /></span><img src="../img/twoth.png" alt=""/></li>
        <li id="situation"><span class="headli"><fmt:message code="sup.th.Feedback" /></span><img src="../img/twoth.png" alt=""/></li>
        <li id="record"><span class="headli"><fmt:message code="sup.th.RecordReminders" /></span><img src="../img/twoth.png" alt=""/></li>
        <li id="suspend" count=""><span class="headli"><fmt:message code="sup.th.Suspension" /></span><img src="../img/twoth.png" alt=""/></li>
        <li id="comEnd" count=""><span class="headli" style="margin-top: 4px;"><fmt:message code="sup.th.ApplyRecord" /></span></li>
    </ul>
    <div class="operationBtn" style="display: none;"><span><fmt:message code="sup.th.RelatedOperations" /></span></div>
    <div class="hideBtn" style="display: none;">
        <ul>
            <li class="newAdd" onclick="development()" style="display: none;"><fmt:message code="sup.th.NewSubtask" /></li>
            <li class="reminders" style="display: none;"><fmt:message code="sup.th.HastenWork" /></li>
            <li class="feedback" style="display: none;"><fmt:message code="sup.th.Feedback" /></li>
            <li class="suspend" style="display: none;"><fmt:message code="sup.th.ApplicationForSuspension" /></li>
            <li class="throung" style="display: none;"><fmt:message code="sup.th.ApplySettlement" /></li>
            <li class="replayD" style="display: none;"><fmt:message code="doc.th.ResumeApplication" /></li>
        </ul>
    </div>
</div><!--标题导航结束-->
<div class="main">
    <div class="bysurvey" style="display: block;">
        <div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table>
                <tbody>
                    <tr>
                        <td colspan="2"><fmt:message code="url.th.EssentialInformation" /></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.WorkItems" />：</td>
                        <td class="supName"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.ResponsibleLeadership" />：</td>
                        <td class="manageUser"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.Sponsor" />：</td>
                        <td class="userName"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.CoOrganizer" />：</td>
                        <td class="leaderName"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.startTime" />：</td>
                        <td class="baginTime"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="meet.th.EndTime" />：</td>
                        <td class="endTime"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.workingCondition" />：</td>
                        <td class="workState"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.CreatePersonnel" />：</td>
                        <td class="addUser"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="sup.th.JobDescription" />：</td>
                        <td class="workTask"></td>
                    </tr>
                    <%--<tr>
                        <td><fmt:message code="sup.th.SuperiorTask" />：</td>
                        <td class="superior"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="email.th.file" />：</td>
                        <td class="attment"></td>
                    </tr>--%>
                </tbody>
            </table>
        </div>
    </div>
    <div class="bysuspend" style="display: none;">
        <div class="pagediv" id="alreadys" style="margin: 10px auto;width: 97%;">
            <table>
                <thead>
                <tr>
                    <th style="padding-left: 15px;"><fmt:message code="sup.th.Applicant" /></th>
                    <th><fmt:message code="sup.th.ApplicationContent" /></th>
                    <th><fmt:message code="sup.th.ApplicationType" /></th>
                    <th><fmt:message code="sup.th.ApplicationTime" /></th>
                    <th><fmt:message code="sup.th.ApplicationStatus" /></th>
                    <th><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <div class="byrecord" style="display: none;">
        <div class="pagediv" id="alreadyw" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table>
                <thead>
                <tr>
                    <th style="padding-left: 15px;"><fmt:message code="sup.th.Sender" /></th>
                    <th><fmt:message code="sup.th.SendingTime" /></th>
                    <th><fmt:message code="sup.th.Do" /></th>
                    <th><fmt:message code="sup.th.RemindersContent" /></th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <div class="bysituation" style="display: none;">
        <div class="pagediv" id="alreadywSd" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table>
                <thead>
                <tr>
                    <th style="padding-left: 15px;"><fmt:message code="sup.th.Feed" /></th>
                    <th><fmt:message code="sup.th.Administrator" /></th>
                    <th><fmt:message code="sup.th.ProcessingTime" /></th>
                    <th><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody id="alreadywSt">

                </tbody>
            </table>
        </div>
    </div>
    <div class="bycomEnd" style="display: none;">
        <div class="pagediv" id="alreadywAd" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table>
                <thead>
                <tr>
                    <th style="padding-left: 15px;"><fmt:message code="sup.th.Applicant" /></th>
                    <th><fmt:message code="sup.th.ApplicationContent" /></th>
                    <th><fmt:message code="sup.th.ApplicationTime" /></th>
                    <th><fmt:message code="sup.th.ApplicationStatus" /></th>
                    <th><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
</div>

<script>
    var sId;
    var user_id='';
    $(function () {
        sId=$.getQueryString('sid');
        //基本详情
        $('#survey').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.bysurvey').show().siblings().hide();
        })
        //发表反馈
        $('#situation').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.bysituation').show().siblings().hide();
            suspendAndthroungDataFeedBack(sId,'2',$('#alreadywSd tbody'));
        })
        //催办记录
        $('#record').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.byrecord').show().siblings().hide();
            recordData(sId,$('#alreadyw tbody'));
        })
        //暂停恢复申请记录
        $('#suspend').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.bysuspend').show().siblings().hide();
            var count=$(this).attr('count');
            suspendRecovery(sId,$('#alreadys tbody'),count);
        })
        //办结申请记录
        $('#comEnd').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.bycomEnd').show().siblings().hide();
            var count=$(this).attr('count');
            comEndData(sId,$('#alreadywAd tbody'),count);
        })

        //暂停/恢复申请审批同意功能
        $('#alreadys').on('click','.suspendAgree',function(){
            var stype=$(this).parents('tr').attr('sType');
            var dataId=$(this).parents('tr').attr('sId');
            var data={
                sid:dataId,
                status:1,
                type:stype,
                supId:sId
            }
            agreeResfuse(data);
        })
        //暂停申请审批拒绝功能
        $('#alreadys').on('click','.suspendRefuse',function(){
            var stype=$(this).parents('tr').attr('sType');
            var dataId=$(this).parents('tr').attr('sId');
//            var data={
//                sid:dataId,
//                status:2,
//                type:stype,
//                supId:sId
//            }
            ResfuseDatas(dataId,stype)
        })

        //办结申请审批同意功能
        $('#alreadywAd').on('click','.throungAgree',function(){
            var dataId=$(this).parents('tr').attr('sId');
            var data={
                sid:dataId,
                status:1,
                type:3,
                supId:sId
            }
            agreeResfuse(data);
        })
        //办结申请审批拒绝功能
        $('#alreadywAd').on('click','.throungResfuse',function(){
            var stype=$(this).parents('tr').attr('sType');
            var dataId=$(this).parents('tr').attr('sId');
//            var data={
//                sid:dataId,
//                status:2,
//                type:stype,
//                supId:sId
//            }
            ResfuseDatas(dataId,stype)
        })

        //点击相关操作
        $('.operationBtn').click(function(e){
            e.stopPropagation();
            $('.hideBtn').toggle();
        })
        $(document).click(function(){
            if($('.hideBtn').css('display')=='block'){
                $('.hideBtn').css('display','none');
            }
        })
        //新建子任务
        $('.newAdd').click(function(){
            $('.hideBtn').hide();
           addChildren (event);
        })
        //任务催办
        $('.reminders').click(function(){
            $('.hideBtn').hide();
            reminderData(event);
        })
        //发表反馈
        $('.feedback').click(function(){
            $('.hideBtn').hide();
            feedbackData(event);
        })
        //申请暂停
        $('.suspend').click(function(){
            $('.hideBtn').hide();
            suspendData(event);
        })
        //恢复申请
        $('.replayD').click(function(){
            $('.hideBtn').hide();
            recoverySupData(event);
        })
        //申请办结
        $('.throung').click(function(){
            $('.hideBtn').hide();
            throungData(event)
        })
    })
    //新建弹窗
    function addChildren (event) {
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="sup.th.NewSupervision" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['600px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 35px;margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.WorkItems" />：</span><span><input type="text" style="width: 180px;" name="typeName" class="inputTd" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SubordinateCategory" />：</span><span><select name="parentId" id="parentId" style="width: 180px;"></select></span></div>'+
            <%--'<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SubordinateClassification" />：</span><span><input type="text" style="width: 180px;" name="parentId" class="inputTd" value="" /><a href="javascript:;"><fmt:message code="global.lang.select" /></a></span></div>'+--%>
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ResponsibleLeadership" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Sponsor" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.CoOrganizer" />：</span><span><div class="inPole"><textarea name="txt" id="userDept" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span><input type="text" style="width: 180px;" name="beginTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})" /></span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span><input type="text" style="width: 180px;" name="endTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})" /></span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SupervisionContent" />：</span><span><div class="inPole"><textarea name="txt" id="textCont" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>'+
            <%--'<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.RelatedAccessories" />：</span><span><div class="inPole"><div class="Attachment"></div>' +--%>
            <%--'<form id="uploadimgform" target="uploadiframe"  action="../upload?module=file_folder" enctype="multipart/form-data" method="post" >'+--%>
            <%--'<input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">' +--%>
            <%--'<a href="javascript:;" id="uploadimg">' +--%>
            <%--'<img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>'+--%>
            <%--'</form></div></span></div>'+--%>
            '</div>',
            success:function(){
                //所属分类下拉
                $('#parentId').typeSelect();
            },
            yes:function(index){
                var data={
                    status:7,
                 //   sId:sId,
                    supName:$('input[name="typeName"]').val(),
                    typeId:$('#parentId option:checked').val(),
                    leaderId:$('#userDuser').attr('user_id'),
                    managerId:$('#userPriv').attr('user_id'),
                    userId:$('#userDept').attr('user_id'),
                    beginTime:$('input[name="beginTime"]').val(),
                    endTime:$('input[name="endTime"]').val(),
                    content:$('#textCont').val()
                }

               /* if(parentId==null){
                    $.layerMsg({content:'创建子任务！',icon:3});
                    return;
                }*/
                if($('input[name="typeName"]').val() == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.fillItems" />！',icon:3});
                    return;
                }
                if($('#parentId option:checked').val() == '-1'){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectCategory" />！',icon:3});
                    return;
                }
                if($('#userPriv').val()==""){
                    $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                    return;
                }
                if($('#userDuser').attr('userpriv') == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectLeadership" />！',icon:3});
                    return;
                }
                if($('#userPriv').attr('userpriv') == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                    return;
                }
                if($('input[name="beginTime"]').val() == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectStartTime" />！',icon:3});
                    return;
                }
                if($('input[name="endTime"]').val() == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectEndTime" />！',icon:3});
                    return;
                }
                $.ajax({
                    type:'post',
                    url:'/supervision/addSupervision',
                    dataType:'json',
                    data:data,
                    success:function(res){
                        if(res.flag){
                            $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />！',icon:1});
                            layer.close(index);
                        }else{
                            $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />！',icon:2});
                        }
                    }
                })
            },
            btn2:function(index){
                var data={
                    status:7,
                    supName:$('input[name="typeName"]').val(),
                    typeId:$('#parentId option:checked').val(),
                    leaderId:$('#userDuser').attr('user_id'),
                    managerId:$('#userPriv').attr('user_id'),
                    userId:$('#userDept').attr('user_id'),
                    beginTime:$('input[name="beginTime"]').val(),
                    endTime:$('input[name="endTime"]').val(),
                    content:$('#textCont').val()
                }
                if($('input[name="typeName"]').val() == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.fillItems" />！',icon:3});
                    return;
                }
                if($('#parentId option:checked').val() == '-1'){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectCategory" />！',icon:3});
                    return;
                }
                if($('#userDuser').attr('userpriv') == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectLeadership" />！',icon:3});
                    return;
                }
                if($('#userPriv').attr('userpriv') == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                    return;
                }
                if($('input[name="beginTime"]').val() == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectStartTime" />！',icon:3});
                    return;
                }
                if($('input[name="endTime"]').val() == ''){
                    $.layerMsg({content:'<fmt:message code="sup.th.selectEndTime" />！',icon:3});
                    return;
                }
                layer.close(index);
            }
        });
        $("#selectUser").on("click",function(){//选角色控件
            user_id='userDuser';
            $.popWindow("../common/selectUser?0");
        });
        $("#selectPriv").on("click",function(){//选角色控件
            user_id='userPriv';
            $.popWindow("../common/selectUser?0");
        });
        $("#selectDept").on("click",function(){//选角色控件
            user_id='userDept';
            $.popWindow("../common/selectUser");
        });
        $('#clearUser').click(function(){ //清空角色
            $('#userDuser').attr('user_id','');
            $('#userDuser').attr('dataid','');
            $('#userDuser').val('');
        });
        $('#clearPriv').click(function(){ //清空角色
            $('#userPriv').attr('user_id','');
            $('#userPriv').attr('dataid','');
            $('#userPriv').val('');
        });
        $('#clearDept').click(function(){ //清空角色
            $('#userDept').attr('user_id','');
            $('#userDept').attr('dataid','');
            $('#userDept').val('');
        });
        //附件上传
        <%--$('#uploadimg').on('click', function(ele) {--%>
            <%--$('#uploadinputimg').click();--%>
        <%--});--%>
        <%--$('#uploadinputimg').change(function(e){--%>
            <%--var target = $(e.target);--%>
            <%--var file;--%>
            <%--if(target[0].files && target[0].files[0]){--%>
                <%--file=target[0].files[0];--%>
            <%--}--%>
            <%--if(file){--%>
                <%--$.upload($('#uploadimgform'),function(res){--%>
                    <%--var data=res.obj;--%>
                    <%--var str='';--%>
                    <%--for(var i=0;i<data.length;i++){--%>
                        <%--str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';--%>
                    <%--}--%>
                    <%--$('.Attachment').append(str);--%>
                <%--});--%>
            <%--}--%>
        <%--});--%>
    }
    //任务催办弹窗
    function reminderData(event){
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="sup.th.HastenWork" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['560px', '280px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 35px;margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.RemindersContent" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
//            '<div class="div_tr"><span class="span_td">是否包含下级任务：</span><span><input type="radio" name="choice" style="width: 15px;vertical-align: middle;"><span>是</span><input type="radio" name="choice" style="width: 15px;vertical-align: middle;"><span>否</span></span></div>'+
            '</div>',
            yes:function(index){
                var data={
                    status:'0',
                    supId:sId,
                    type:'4',
                    content:$('#userDuser').val()
                }
                suthData(data);
                layer.close(index);
            },
        });
    }
    //发表反馈弹窗
    function feedbackData(event){
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="sup.th.Feedback" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['560px', '360px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" />：</span><span><input type="text" name="subject" value=""></span></div>' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Urgency" />：</span><span><select name="seleceChoice" id="seleceChoice"><option value="0" ><fmt:message code="sup.th.ordinary" /></option><option value="1"><fmt:message code="sup.th.urgent" /></option></select></span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" userpriv="" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
            '</div>',
            yes:function(index){
                var data={
                    title:$('input[name="subject"]').val(),
                    supId:sId,
                    level:$('#seleceChoice option:checked').val(),
                    content:$('#userDuser').val()
                }
                suthDataFeedBack(data);
                layer.close(index);
            },
        });
    }
    //申请暂停弹窗
    function suspendData(event){
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="sup.th.ApplicationForSuspension" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['560px', '260px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ApplicationContent" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
            '</div>',
            yes:function(index){
                var data={
                    status:'0',
                    supId:sId,
                    type:'1',
                    content:$('#userDuser').val()
                }
                suthData(data);
                layer.close(index);
            },
        });
    }
    //恢复申请
    function recoverySupData(event){
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="doc.th.ResumeApplication" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['560px', '260px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ApplicationContent" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
            '</div>',
            yes:function(index){
                var data={
                    status:'0',
                    supId:sId,
                    type:'2',
                    content:$('#userDuser').val()
                }
                suthData(data);
                layer.close(index);
            },
        });
    }
    //申请办结
    function throungData(event){
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="sup.th.ApplySettlement" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['560px', '260px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ApplicationContent" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
            '</div>',
            yes:function(index){
                var data={
                    status:'0',
                    supId:sId,
                    type:'3',
                    content:$('#userDuser').val()
                }
                suthData(data);
                layer.close(index);
            },
        });
    }
    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm:ss',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var end = {
        format: 'YYYY/MM/DD hh:mm:ss',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    //申请暂停、恢复申请、办结接口
    function suthData(data){
        $.ajax({
            type:'post',
            url:'<%=basePath %>supApply/insertSupApply',
            dataType:'json',
            data:data,
            success:function(res){
                $.layerMsg({content:'<fmt:message code="sup.th.SuccessfulApplication" />！',icon:6});
                location.reload();
            }
        })
    }

    //发表反馈保存接口
    function suthDataFeedBack(data){
        $.ajax({
            type:'post',
            url:'<%=basePath %>supFeedBack/addSupFeedBack',
            dataType:'json',
            data:data,
            success:function(res){
                $.layerMsg({content:'<fmt:message code="sup.th.SuccessfulApplication" />！',icon:6});
//                $('.operationBtn').hide();
            }
        })
    }

    //获取反馈（发表反馈）列表接口
    function suspendAndthroungDataFeedBack(sid,typeId,element){
        $('#alreadywSt').empty();
        $.ajax({
            type:'post',
            url:'<%=basePath %>supFeedBack/getSupFeedBackList',
            dataType:'json',
            data:{supId:sid},
            success:function(res){
                var data=res.obj;
                var str='';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        str+='<tr sId="'+data[i].sid+'"><td style="padding-left: 15px;">'+data[i].content+'</td><td>'+data[i].userName+'</td><td>'+data[i].createTime+'</td><td><a href="javascript:;" style="margin-right: 10px;" id="detailsDt"><fmt:message code="file.th.detail" /></a>'
                            if(data[i].createrId=='1'){
                                str+='<a href="javascript:;" style="margin-right: 10px;" id="editDt"><fmt:message code="depatement.th.modify" /></a><a href="javascript:;" style="margin-right: 10px;" id="deleteDt"><fmt:message code="menuSSetting.th.deleteMenu" /></a>';
                            }
                        str+='<a href="javascript:;" style="margin-right: 10px;" id="replayDt"><fmt:message code="global.lang.reply" /></a></th></tr>'
                    }
                    element.append(str);
                }else{
                    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:0});
                }

            }
        })

    }

    //删除
    $('#alreadywSd').on('click','#deleteDt',function(){
        var suId=$(this).parents('tr').attr('sId');
        feedBack(suId,$('#alreadywSd tbody'));
    })
    //修改
    $('#alreadywSd').on('click','#editDt',function(){
        var suId=$(this).parents('tr').attr('sId');
        feedEditData(event,suId,$('#alreadywSd tbody'))
    })
    //详情
    $('#alreadywSd').on('click','#detailsDt',function(){
        var suId=$(this).parents('tr').attr('sId');
        detailsData(event,suId);
    })
    //回复
    $('#alreadywSd').on('click','#replayDt',function(){
        var suId=$(this).parents('tr').attr('sId');
        replayData(event,suId);
    })

    //发表反馈列表删除接口
    function feedBack(sid,element) {
        sId=$.getQueryString('sid');
        layer.confirm('<fmt:message code="sup.th.Delete" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="notice.th.DeleteFile" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'<%=basePath %>supFeedBack/deleteSupFeedBack ',
                dataType:'json',
                data:{sid:sid},
                success:function(res){
                    var data=res.flag;
                    if(data){
                        $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1});
                        suspendAndthroungDataFeedBack(sId,2,element);

                    }else{
                        $.layerMsg({content:'<fmt:message code="lang.th.deleSucess" />！',icon:2});
                    }
                }
            })
        }, function(){
            layer.closeAll();
        });
    }
    //发表反馈修改接口
    function feedEditData(event,sid,element){
        sId=$.getQueryString('sid');
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="sup.th.ModifyFeedback" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['560px', '360px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-top: 38px;">' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" />：</span><span><input type="text" name="subject" value=""></span></div>' +
            '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Urgency" />：</span><span><select name="seleceChoice" id="seleceChoice"><option value="0" ><fmt:message code="sup.th.ordinary" /></option><option value="1"><fmt:message code="sup.th.urgent" /></option></select></span></div>'+
            '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" userpriv="" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
            '</div>',
            success:function(){
                $.ajax({
                    type:'get',
                    url:'<%=basePath %>supFeedBack/getSupDetail',
                    dataType:'json',
                    data:{sid:sid},
                    success:function(res){
                        var data=res.object;
                        $('input[name="subject"]').val(data.title);
                        if(data.level== 0){
                            $('#seleceChoice').val('0');
                        }else{
                            $('#seleceChoice').val('1');
                        }
                        $('#userDuser').val(data.content);
                    }
                })
            },
            yes:function(index){
                var data={
                    title:$('input[name="subject"]').val(),
                    sid:sid,
                    level:$('#seleceChoice option:checked').val(),
                    content:$('#userDuser').val()
                }
                $.ajax({
                    type:'post',
                    url:'<%=basePath %>supFeedBack/updateSupFeedBack',
                    dataType:'json',
                    data:data,
                    success:function(res){
                        $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />！',icon:6});
                        suspendAndthroungDataFeedBack(sId,2,element)
                    }
                })
                layer.close(index);
            },
        });
    }
    //发表反馈回复接口
        function replayData(event,sid){
            event.stopPropagation();
            layer.open({
                type: 1,
                title:['<fmt:message code="doc.th.FeedbackRecovery" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['560px', '260px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="diary.th.remand" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-top: 38px;">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="doc.th.ReplyContent" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
                '</div>',
                yes:function(index){
                    var data={
                        supId:sid,
                        content:$('#userDuser').val()
                    }
                    $.ajax({
                        type:'post',
                        url:'<%=basePath %>supFeedBackReply/insertsupFeedBackReply',
                        dataType:'json',
                        data:data,
                        success:function(){
                            $.layerMsg({content:'<fmt:message code="doc.th.ReplySuccessfully" />！',icon:6});
                            location.reload();
                        }
                    })
                    layer.close(index);
                },
            });
        }
    //发表反馈详情接口
    function detailsData(event,sid){
        event.stopPropagation();
        layer.open({
            type: 1,
            title:['<fmt:message code="doc.th.FeedbackDetails" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['600px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-top: 38px;"><table>' +
            '<tr><th colspan="2" style="padding:8px;font-size: 14px;color: #2b7fe0;"><fmt:message code="url.th.EssentialInformation" /></th></tr>' +
            '<tr><td style="padding-left: 15px;width: 20%;"><fmt:message code="doc.th.FeedbackHeader" />：</td><td class="subject"></td></tr>' +
            '<tr><td style="padding-left: 15px;width: 20%;"><fmt:message code="doc.th.FeedbackContent" />：</td><td class="content"></td></tr>' +
            '<tr><td style="padding-left: 15px;width: 20%;"><fmt:message code="doc.th.FeedbackPeople" />：</td><td class="suer"></td></tr>' +
            '<tr><td style="padding-left: 15px;width: 20%;"><fmt:message code="doc.th.FeedbackTime" />：</td><td class="timer"></td></tr>' +
            '<tr><td colspan="2">' +
            '<table><tr><th colspan="4" style="padding:8px;font-size: 14px;color: #2b7fe0;"><fmt:message code="doc.th.ReplyList" /></th></tr>' +
            '<tr class="afterData"><td style="padding-left: 5px;" width="15%"><fmt:message code="doc.th.ReplyPersonnel" /></td><td width="30%"><fmt:message code="doc.th.RecoveryTime" /></td><td width="45%"><fmt:message code="doc.th.ReplyContent" /></td><td width="10%"><fmt:message code="notice.th.operation" /></td></tr>' +
            '</table>' +
            '</td></tr>' +
            '</table></div>',
            success:function(){
                $.ajax({
                    type:'get',
                    url:'<%=basePath %>supFeedBack/getSupDetail',
                    dataType:'json',
                    data:{sid:sid},
                    success:function(res){
                        var data=res.object;
                        var datas=res.obj;
                        var str='';
                        $('.subject').text(data.title);
                        $('.content').text(data.content);
                        $('.suer').text(data.userName);
                        $('.timer').text(data.createTime);
                        if(datas.length>0){
                            for(var i=0;i<datas.length;i++){
                                str+='<tr sId="'+datas[i].sid+'"><td>'+datas[i].userName+'</td><td>'+datas[i].createTime+'</td><td><div style="display: block;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">'+datas[i].content+'</div></td><td><a href="javascript:;" class="deleteReplay" id="deleteReplay"><fmt:message code="global.lang.delete" /></a></td></tr>';
                            }
                        }else{
                            str='<tr><td colspan="4" style="text-align: center;padding: 8px;"><div><fmt:message code="sup.th.NoMoreContent" /></div></td></tr>'
                        }

                        $('.afterData').after(str);
                        $('.deleteReplay').click(function(){
                            var sid=$(this).parents('tr').attr('sId');
                            console.log(sid)
                            $.ajax({
                                url:'<%=basePath %>supFeedBackReply/deleteByPrimaryKey',
                                type:'post',
                                data:{sid:sid},
                                dataType:'json',
                                success:function(res){
                                    if(res.flag){
                                        $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation" />！',icon:1});
                                        location.reload();
                                    }else{
                                        $.layerMsg({content:'<fmt:message code="sms.th.operationFailed" />！',icon:2});
                                    }
                                }
                            })
                        })
                    }
                })
            },
            yes:function(index){
                layer.close(index);
            },
        });
    }

    //回复列表中的回复删除
    $('.div_table').on('click','#deleteReplay',function(){
        var deId=$(this).parents('tr').attr('sId');
        layer.confirm('<fmt:message code="doc.th.reply" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="notice.th.DeleteFile" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'<%=basePath %>supFeedBackReply/deleteByPrimaryKey',
                dataType:'json',
                data:{sid:deId},
                success:function(res){
                    if(res.flag){
                        $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation" />！',icon:1});
                        location.reload();
                    }else{
                        $.layerMsg({content:'<fmt:message code="sms.th.operationFailed" />！',icon:2});
                    }
                }
            })
        }, function(index){
            layer.close(index);
            //layer.closeAll();
        });
    })

    //催办记录
    function recordData(sid,element) {
        element.find('tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath %>supApply/getSupApplyByStatus',
            dataType:'json',
            data:{status:'0',supId:sid,type:4},
            success:function(res){
                var data=res.obj;
                var str='';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td style="padding-left: 15px;">'+data[i].createrId+'</td>' +
                            '<td>'+data[i].createTime+'</td>' +
                            '<td></td>' +
                            '<td>'+data[i].content+'</td>' +
                            '</tr>'
                    }
                    element.append(str);
                }else{
                    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:0});
                }
            }
        })
    }

    //暂停恢复申请记录
    function suspendRecovery(sid,element,count) {
        element.find('tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath %>supApply/getSupApplyByStatus',
            dataType:'json',
            data:{status:'0',supId:sid,type:1},
            success:function(res){
                var data=res.obj;
                var str='';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        var typeId=data[i].type;
                        var typeName='';
                        var statusName='';
                        if(typeId == 1){
                            typeName='<fmt:message code="doc.th.SuspensionApplication" />';
                        }else if(typeId == 2){
                            typeName='<fmt:message code="doc.th.ResumeApplication" />';
                        }
                        if(data[i].status == 0){
                            statusName='<fmt:message code="meet.th.PendingApproval" />';
                        }else if(data[i].status == 1){
                            statusName='<fmt:message code="doc.th.HaveAgreed" />';
                        }else if(data[i].status == 2){
                            statusName='<fmt:message code="doc.th.Rejected" />';
                        }
                        str+='<tr sId="'+data[i].sid+'" sType="'+data[i].type+'">' +
                            '<td style="padding-left: 15px;">'+data[i].createrId+'</td>' +
                            '<td>'+data[i].content+'</td>' +
                            '<td>'+typeName+'</td>' +
                            '<td>'+data[i].createTime+'</td>' +
                            '<td>'+statusName+'</td>' +
                            '<td>';
                        if(count == 1 && data[i].status == 0){
                            str+='<a href="javascript:;" style="margin-right: 10px;" class="suspendAgree"><fmt:message code="sup.th.Agree" /></a><a href="javascript:;" class="suspendRefuse"><fmt:message code="sup.th.refuse" /></a>';
                        }
                            str+='</td></tr>';
                    }
                    element.append(str);
                }else{
                    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:0});
                }
            }
        })
    }

    //办结申请记录
    function comEndData(sid,element,count) {
        element.find('tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath %>supApply/getSupApplyByStatus',
            dataType:'json',
            data:{status:'0',supId:sid,type:3},
            success:function(res){
                var data=res.obj;
                var str='';
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        var statusName='';
                        if(data[i].status == 0){
                            statusName='<fmt:message code="meet.th.PendingApproval" />';
                        }else if(data[i].status == 1){
                            statusName='<fmt:message code="doc.th.HaveAgreed" />';
                        }else if(data[i].status == 2){
                            statusName='<fmt:message code="doc.th.Rejected" />';
                        }
                        str+='<tr sId="'+data[i].sid+'" sType="'+data[i].type+'">' +
                            '<td style="padding-left: 15px;">'+data[i].createrId+'</td>' +
                            '<td>'+data[i].content+'</td>' +
                            '<td>'+data[i].createTime+'</td>' +
                            '<td>'+statusName+'</td>' +
                            '<td>';
                        if(count == 1 && data[i].status == 0){
                            str+='<a href="javascript:;" style="margin-right: 10px;" class="throungAgree"><fmt:message code="sup.th.Agree" /></a><a href="javascript:;" class="throungResfuse"><fmt:message code="sup.th.refuse" /></a>';
                        }
                        str+='</td></tr>';
                    }
                    element.append(str);
                }else{
                    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:0});
                }
            }
        })
    }

    //同意接口
    function agreeResfuse(data){
        layer.confirm('<fmt:message code="doc.th.agreeApplication" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="notice.th.DeleteFile" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'<%=basePath %>supApply/updateSupApply',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.flag){
                        $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation" />！',icon:6});
                        location.reload();
                    }else{
                        $.layerMsg({content:'<fmt:message code="sms.th.operationFailed" />！',icon:5});
                    }
                }
            })
        }, function(){
            layer.closeAll();
        });

    }
    //拒绝接口
    function ResfuseDatas(sid,sType){
        sId=$.getQueryString('sid');
        layer.confirm('<fmt:message code="doc.th.application" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="notice.th.DeleteFile" />"
        }, function(){
            //确定删除，调接口
            layer.open({
                type: 1,
                title:['<fmt:message code="doc.th.GroundsRefusal" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['560px', '260px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-top: 38px;">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="doc.th.GroundsRefusal" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" value="" style="min-width: 300px;min-height:100px;"></textarea></div></span></div>' +
                '</div>',
                yes:function(index){
                    $.ajax({
                        type:'post',
                        url:'<%=basePath %>supApply/updateSupApply',
                        dataType:'json',
                        data:{sid:sid,status:2,type:sType,supId:sId,reason:$('#userDuser').val()},
                        success:function(res){
                            if(res.flag){
                                $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation" />！',icon:6,});
                                location.reload();
                            }else{
                                $.layerMsg({content:'<fmt:message code="sms.th.operationFailed" />！',icon:5});
                            }
                        }
                    })
                    //layer.close(index);
                    layer.closeAll();
                },
            });
            //location.reload();
        }, function(index){
            layer.close(index);
        });

    }
    //新建
    function newSupervision(data,typeId){
        $.ajax({
            type:'post',
            url:'<%=basePath %>supervision/addSupervision',
            dataType:'json',
            data:data,
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />！',icon:1});
                    init(typeId)
                }else{
                    $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />！',icon:2});
                }
            }
        })
    }
    //正在开发中
    function development(){
        $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment" />！',icon:6});
    }
</script>
</body>
</html>
