<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title><fmt:message code="meet.th.ConferenceApplication" /></title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<link rel="stylesheet" href="/css/meeting/index.css">
	<link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.css"/>
	<link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.print.css"/>
	<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
	<link rel="stylesheet" href="/lib/laydate/need/laydate.css">
	<link rel="stylesheet" href="/lib/pagination/style/pagination.css">
	<style>
		.equip tbody td{
			text-align: center;
		}
		.equipSpan{
			background-color:#00a2d4;
		}
		.equip {
			width: 77%;
			margin: 20px auto;
		}
		table tbody td{
			overflow: hidden;
			text-overflow:ellipsis;
			white-space: nowrap;
			padding:0 10px;
		}
		.head .headli{
			width:94px;
		}
	</style>
	<%--<link rel="stylesheet" href="/css/base.css">--%>
	<script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
	<script src="../../lib/fullcalendar/moment.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/fullcalendar/fullcalendar.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/fullcalendar/jquery-ui.custom.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/fullcalendar/zh-cn.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/layer/layer.js"></script>
	<script src="/js/base/base.js"></script>
	<script src="/lib/laydate/laydate.js"></script>
	<script src="/js/jquery/jquery.cookie.js"></script>
	<script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jquery.form.min.js"></script>
	<style>
		.typeBtn{
			float: right;
			margin: 5px 5px;
			width: 60px;
			height: 28px;
			line-height: 38px;
			color: #fff;
			border: 1px solid #ebebeb;
			outline: none;
			font-size: 14px;
			border-radius: 5px;
			line-height: 28px;
			cursor: pointer;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="font-family: 微软雅黑;">
<div class="headTop" style="z-index: 999;">
	<div class="headImg">
		<img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_apply.png" alt="">
	</div>
	<div class="divTitle">
		<fmt:message code="meet.th.ConferenceApplication" />
	</div>
</div>
<div class="head w clearfix">
	<ul class="index_head">
		<li id="meetingApply" onclick="listByStatus(0)"><span class="one headli"><fmt:message code="meet.th.ConferenceApplication" /></span><img src="../img/twoth.png" alt=""/></li>
		<li id="PAMeeting" onclick="listByStatus(1)"><span class="headli"><fmt:message code="meet.th.Meeting" /></span><img src="../img/twoth.png" alt=""/></li>
		<li id="ApMeeting" onclick="listByStatus(2)"><span class="headli"><fmt:message code="meet.th.Approved" /></span><img src="../img/twoth.png" alt=""/></li>
		<li id="HaveMeeting" onclick="listByStatus(3)"><span class="headli"><fmt:message code="meet.th.InSession" /></span><img src="../img/twoth.png" alt=""/></li>
		<li id="NotMeeting" onclick="listByStatus(4)"><span class="headli" style="margin-top: 4px;"><fmt:message code="meet.th.NotApprovedMeeting" /></span></li>
	</ul>
	<div class="colorClass">
		<a href="javascript:;" style="background-color: rgb(58, 135, 173);"></a>
		<span><fmt:message code="meet.th.PendingApproval" /></span>
		<a href="javascript:;" style="background-color: rgb(105, 240, 164);"></a>
		<span><fmt:message code="meet.th.Ratified" /></span>
		<a href="javascript:;" style="background-color: rgb(255, 136, 124);"></a>
		<span><fmt:message code="meet.th.HaveHand" /></span>
		<a href="javascript:;" style="background-color: rgb(245, 181, 46);"></a>
		<span><fmt:message code="meet.th.unratified" /></span>
		<a href="javascript:;" style="background-color: rgb(219, 173, 255);"></a>
		<span style="margin-right: 24px"><fmt:message code="meet.th.IsOver" /></span>
	</div>
</div>
<div class="meentingDate" style="display: block;">
	<%--<input class="typeBtn" type="button" onclick="addMeeting()" value="申请" style="background: dodgerblue"/>--%>
	<div class="mainList">
	</div>
</div>
<div class="pagediv" id="already" style="margin: 0 auto;width: 97%;display: none;margin-top: 10px;">
	<table>
		<thead>
		<tr>
			<th width="11%" style="text-align:center"><fmt:message code="meet.th.ConferenceName" /></th>
			<th width="11%" style="text-align:center"><fmt:message code="meet.th.ConferenceTitle" /></th>
			<th width="15%" style="text-align:center"><fmt:message code="sup.th.ApplicationTime" /></th>
			<th width="15%" style="text-align:center"><fmt:message code="sup.th.startTime" /></th>
			<th width="15%" style="text-align:center"><fmt:message code="meet.th.EndTime" /></th>
			<th width="9%" style="text-align:center"><fmt:message code="meet.th.ConferenceRoom" /></th>
			<th width="9%" style="text-align:center"><fmt:message code="sup.th.Applicant" /></th>
			<th width="15%" style="text-align:center"><fmt:message code="notice.th.operation" /></th>
		</tr>
		</thead>
		<tbody>
		<%--<tr>
			<td>关于召开公司年总结大会</td>
			<td>关于召开公司年总结大会</td>
			<td>
				2017-07-31 09:43:43</td>
			<td>2017-07-31 09:30</td>
			<td>
				2017-07-31 10:00</td>
			<td>1022会议室</td>
			<td>人力专员</td>
			<td>
				<a href="javascript:;" class="editData" style="margin-right: 10px">编辑</a><a href="javascript:;">删除</a>
			</td>
		</tr>--%>
		</tbody>
	</table>
</div>
<script>
    var dept_id='';
    var priv_id='';
    var user_id='';
    //初始化申请管理员下拉列表
	$(function(){
        $('.mainList').fullCalendar({
            header: {
                left: 'prev,next,today',
                center: 'title',
                right: 'month,agendaWeek'
            },
            buttonText:{
                today:'<fmt:message code="meet.th.JumpthDay" />'
            },
//            defaultDate: '2016-08-20',
            lang: 'zh-cn',
//            buttonIcons: false, // show the prev/next text
//            weekMode: 'liquid',
            editable: true,
            events: function(start,end,timezone, callback) {
                var date = this.getDate().format('YYYY-MM');
                $.ajax({
                    url: '<%=basePath %>meeting/queryMeeting',
                    dataType: 'json',
                    data: {
                        date: date
                    },
                    success: function(res) { // 获取当前月的数据
						var datas=res.obj;
                        var events = [];
                        var TColor='';
                        var BColor='';
                        for(var i=0;i<datas.length;i++){
                            var arr=datas[i].startTime.split(' ');
                            if(datas[i].status == 1){
                                BColor='rgb(58, 135, 173)';
							}else if(datas[i].status == 2){
                                BColor='rgb(105, 240, 164)';
							}else if(datas[i].status == 3){
                                BColor='rgb(255, 136, 124)';
                            }else if(datas[i].status == 4){
                                BColor='rgb(245, 181, 46)';
                            }else if(datas[i].status == 5){
                                BColor='rgb(219, 173, 255)';
                            }
                            events.push({
								id:datas[i].sid,
                                title: arr[1]+'  '+datas[i].meetName,
                                start: arr[0] , // will be parsed
                                textColor: '#fff',
                                backgroundColor:BColor
                            });
						}
                        callback(events);
                    }
                });
            },
            dayClick:function(date, allDay, jsEvent, view){
                var timestamp = Date.parse(new Date());
                var timer=parseInt(timestamp)+7200000;
                var startTime=new Date(timestamp).Format('hh:mm:ss');
                var endTime=new Date(timer).Format('hh:mm:ss');
                layer.open({
                    type: 1,
                    title: ['<fmt:message code="meet.th.ConferenceApplication" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['600px', '500px'],
                    offset: ['250px', '400px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                    content: '<div class="div_table" style="">' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="workflow.th.name" />：</span>' +
						'<span><input type="text" style="width: 180px;margin-left:5px;" name="typeName" class="inputTd meetName test_null" value="" /></span>' +
						'<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="email.th.main" />：</span>'+
						'<span><input type="text" style="width: 180px;margin-left:5px;" name="typeName" class="inputTd subject test_null" value="" /></span>' +
						'<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="sup.th.Applicant" />：</span>' +
						'<span>' +
							'<div class="inPole">' +
								'<textarea name="txt" dataid="" class="userName test_null" id="userDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea>' +
								'<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
								'<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span>' +
								'<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span>' +
							'</div>' +
						'</span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="meet.th.MeetingMinutesClerk" />：</span>'+
						'<span>' +
							'<div class="inPole"><textarea name="txt" dataid="" class="recorderName" id="recoderDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea>' +
							'<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectRecorder" class="Add "><fmt:message code="global.lang.add" /></a></span>' +
							'<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearRecoder" class="clearRecoder "><fmt:message code="global.lang.empty" /></a></span>'+
							'</div>' +
						'</span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span>' +
						'<span style="margin:0 5px;">从</span><span><input type="text" style="width: 140px;" name="typeName" class="inputTd startTime test_null" value="'+date._i+' '+startTime+'" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span>' +
						'<span style="margin:0 5px;"><fmt:message code="global.lang.to" /></span>' +
						'<span><input type="text" style="width: 140px;" name="typeName" class="endTime test_null" value="'+date._i+' '+endTime+'" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span>' +
						'<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="meet.th.ConferenceRoom" />：</span>'+
						'<span><select name="typeName" class="meetRoomId test_null" id="meetRoomId"></select></span>' +
						'<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
						'<span><a href="javascript:;" class="meetRoomDetail"><fmt:message code="meet.th.SeeDetails" /></a></span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="meet.th.ApprovalAdministrator" />：</span>' +
						'<span><select name="typeName" class="managerId test_null" id="managerId"></select></span>' +
						'<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
					'</div>' +
                    '<div class="div_tr">' +
						'<span class="span_td"><fmt:message code="meet.th.external" />：</span><span><div class="inPole"><textarea name="attendeeOut" id="attendeeOut" class="attendeeOut" value="" style="min-width: 220px;min-height:58px;"></textarea></div></span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.internal" />：</span><span><div class="inPole"><textarea name="txt" class="attendee" id="attendeeDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectAttendee" class="selectAttenddee"><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearAttendee" class="clearAttendee "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceRoomEquipment" />：</span><span><div class="inPole"><textarea name="txt" id="equipmentId" class="equipmentId" equipmentId="" disabled style="min-width: 220px;min-height:60px;"></textarea></span>' +
                    '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="addEquipment" class="addEquipment"><fmt:message code="global.lang.add" /></a></span>'+
                    '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearEquipment" class="clearEquipment"><fmt:message code="global.lang.empty" /></a></div></span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.WriteSchedule" />：</span><span><input type="checkbox" checked="true" id="isWriteCalendar" class="isWriteCalendar"></span><span><fmt:message code="meet.th.Yes" /></span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.NotifyAttendees" />：</span><span><input type="checkbox" id="smsRemind" class="smsRemind"></span><span><fmt:message code="meet.th.UseSMSAlerts" /></span><span><input type="checkbox" id="sms2Remind" class="sms2Remind"></span><span><fmt:message code="meet.th.SMSReminder" /></span><span><fmt:message code="meet.th.Advance" /></span><input type="text" style="width:30px" name="resendHour" id="resendHour" class="resendHour"><span><fmt:message code="meet.th.hour" /></span><input type="text" style="width:30px" class="resendMinute" id="resendMinute"><span><fmt:message code="meet.th.Reminder" /></span></div>' +
                    '<div class="div_tr"><span class="span_td" style="text-align: right"><fmt:message code="sup.th.RelatedAccessories" />：</span><span><div class="inPole" style="float: none;"><div class="Attachment"></div>' +
                    '<form id="uploadimgform" target="uploadiframe"  action="../upload?module=meeting" enctype="multipart/form-data" method="post" >'+
                    '<input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">' +
                    '<a href="javascript:;" id="uploadimg">' +
                    '<img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>'+
                    '</form></div></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceDescription" />：</span><span><div class="inPole"><textarea name="meetDesc" id="meetDesc" class="meetDesc" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>' +
                    '</div>',
                    success: function () {
                        initManager();
                        initMeetRoom();
                        //点击会议室名称显示会议室详情
                        $('.meetRoomDetail').click(function (){
                            $.ajax({
                                url: '/meetingRoom/getMeetRoomBySid',
                                type: 'get',
                                dataType: 'json',
                                data: {
                                    sid: $(".meetRoomId").val()
                                },
                                success: function (obj) {
                                    if(obj.flag==true){
                                    var data=obj.object;
                                    var meetList=data.meetingWithBLOBs;
                                    var str= '<div class="table"><table style="margin:auto;">' +
                                        '<tr><td width="20%"><span class="span_td"><fmt:message code="meet.th.ConferenceRoomName" />：</span></td><td><span>'+data.mrName+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceRoomDescription" />：</span></td><td><span>'+data.mrDesc+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.MeetingRoomManager" />：</span></td><td><span>'+data.managetnames+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.ApplicatioAuthority" />：</span></td><td><span>'+data.meetroomdeptName+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.Application" />：</span></td><td><span>'+data.meetroompersonName+'</span></td></tr>' +
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.NumbeAccommodated" />：</span></td><td><span>'+data.mrCapacity+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.EquipmentStatus" />：</span></td><td><span>'+data.mrDevice+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="depatement.th.address" />：</span></td><td><span>'+data.mrPlace+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.ApplicationRecord" />：</span></td>' +
                                        '<td>' +
                                        '<table>' +
                                        '<tr>' +
                                        '<td><fmt:message code="meet.th.ConferenceName" /></td>' +
                                        '<td><fmt:message code="sup.th.Applicant" /></td>' +
                                        '<td><fmt:message code="sup.th.startTime" /></td>' +
                                        '<td><fmt:message code="meet.th.EndTime" /></td>' +
                                        '<td><fmt:message code="notice.th.state" /></td>' +
                                        '<tr>';
                                    for(var i=0;i<meetList.length;i++){
                                        str+='<tr>' +
                                            '<td>'+meetList[i].meetName+'</td>' +
                                            '<td>'+meetList[i].userName+'</td>' +
                                            '<td>'+meetList[i].startTime+'</td>' +
                                            '<td>'+meetList[i].endTime+'</td>' +
                                            '<td>'+meetList[i].statusName+'</td>' +
                                            '</tr>'
                                    }
                                    str+='</table></td></tr>'+
                                        '</table></div>';
                                    layer.open({
                                        type: 1,
                                        title: ['<fmt:message code="meet.th.SeeDetails" />', 'background-color:#2b7fe0;color:#fff;'],
                                        area: ['900', '500px'],
                                        offset: ['60px', '200px'],
                                        shadeClose: true, //点击遮罩关闭
                                        btn: [ '<fmt:message code="global.lang.close" />'],
                                        content: str
                                    })
                                    }else{
                                        $.layerMsg({content:"暂无会议室详情",icon:2},function(){
                                        });
									}
                                }
                            })
                        })
                    },
                    yes: function (index) {
                        var array=$(".test_null");
                        var attendId='';
                        var attendName='';
                        for(var i=0;i<array.length;i++){
                            if(array[i].value==""){
                                $.layerMsg({content:"<fmt:message code="sup.th.With*" />",icon:2},function(){
                                });
                                return;
                            }
                        }
                        var isWriteCalednar=0;
                        if($('#isWriteCalendar').is(':checked')){
                            isWriteCalednar=1;
                        }
                        var smsRemind=1;

                        if($('#smsRemind').is(':checked')){
                            smsRemind=0;
                        }
                        var sms2Remind=1;
                        if($('#sms2Remind').is(':checked')){
                            sms2Remind=0;
                        }
                        var recoder=$(".recorderName").attr("dataid");
                        if(recoder!=""){
                            var recorderId=recoder.substr(0,recoder.length-1);
                        }
                        var uidId=$(".userName").attr("dataid");
                        if(uidId!=""){
                            var uid=uidId .substr(0,uidId.length-1);
                        }
                        for(var i=0;i<$('.Attachment .inHidden').length;i++){
                            attendId += $('.Attachment .inHidden').eq(i).val();
                        }
                        for(var i=0;i<$('.Attachment .inHidden').length;i++){
                            attendName += $('.Attachment a').eq(i).attr('NAME');
                        }
                        var paraData = {
                            meetName: $(".meetName").val(),
                            subject: $(".subject").val(),
                            uid: uid,
                            recorderId:recorderId,
                            startTime: $(".startTime").val(),
                            endTime: $(".endTime").val(),
                            attendeeOut: $(".attendeeOut").val(),
                            attendee: $(".attendee").attr("dataid"),
                            isWriteCalednar: isWriteCalednar,
                            smsRemind: smsRemind,
                            sms2Remind: sms2Remind,
                            resendHour: $(".resendHour").val(),
                            resendMinute: $(".resendMinute").val(),
                            meetDesc: $(".meetDesc").val(),
                            managerId: $("#managerId").val(),
                            meetRoomId: $("#meetRoomId").val(),
                            equipmentNames: $(".equipmentId").val(),
                            equipmentIds: $(".equipmentId").attr("equipmentId"),
                            attachmentId:attendId,
                            attachmentName:attendName
                        }

                        $.ajax({
                            url: '/meeting/insertMeeting',
                            type: 'get',
                            dataType: 'json',
                            data: paraData,
                            success: function (obj) {
                                if (obj.flag) {
                                    if(obj.msg=="申请成功"){
                                        $.layerMsg({content: '"<fmt:message code="sup.th.SuccessfulApplication" />"！', icon: 1}, function () {
                                            //更新列表
                                            listByStatus(queryStatus);
                                        })
										location.reload();
                                        layer.close(index);
                                    }
                                }else{
                                    if(obj.msg=="该会议室已被占用") {
                                        $.layerMsg({content: '"<fmt:message code="meet.th.Occupied" />"！', icon: 2}, function () {
                                        })
                                    }
                                }
                            }
                        })
                    }
                });
                //删除附件
                $('.Attachment').on('click','.deImgs',function(){
                    var data=$(this).parents('.dech').attr('deUrl');
                    var dome=$(this).parents('.dech');
                    deleteChatment(data,dome);
                })

                //添加附件
                <%--$('#uploadimg').on('click',function(){--%>
                    <%--$('#uploadinputimg').click();--%>
                <%--})--%>
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
                            <%--var str1='';--%>
                            <%--console.log(res);--%>
                            <%--for(var i=0;i<data.length;i++){--%>
                                <%--str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';--%>
								<%--/*str1+='<input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',">';*/--%>
                            <%--}--%>
                            <%--$('.Attachment').append(str);--%>
                        <%--});--%>
                    <%--}--%>
                <%--});--%>

                $('#uploadinputimg').fileupload({
                    dataType:'json',
                    done: function (e, data) {
                        if(data.result.obj != ''){
                            var data = data.result.obj;
                            var str = '';
                            var str1 = '';
                            for (var i = 0; i < data.length; i++) {
                                str += '<div class="dech" deUrl="' + data[i].attUrl+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                            }
                            $('.Attachment').append(str);
                        }else{
                            //alert('添加附件大小不能为空!');
                            layer.alert('添加附件大小不能为空!',{},function(){
                                layer.closeAll();
                            });
                        }
                    }
                });

                $('#selectUser').click(function(){//选人员控件(申请人)
                    user_id='userDuser';
                    $.popWindow("../common/selectUser?0");
                });
                $('#selectRecorder').click(function(){//选人员控件（纪要员）
                    user_id='recoderDuser';
                    $.popWindow("../common/selectUser?0");
                });
                $('#selectAttendee').click(function(){//选人员控件（出席内部人员）
                    user_id='attendeeDuser';
                    $.popWindow("../common/selectUser");
                });
                $('#clearUser').click(function(){ //清空人员(申请人)
                    $('#userDuser').attr('user_id','');
                    $('#userDuser').attr('dataid','');
                    $('#userDuser').val('');
                });
                $('#clearRecoder').click(function(){ //清空人员（纪要员）
                    $('#recoderDuser').attr('user_id','');
                    $('#recoderDuser').attr('dataid','');
                    $('#recoderDuser').val('');
                });
                $('#clearAttendee').click(function(){ //清空人员（出席内部人员）
                    $('#attendeeDuser').attr('user_id','');
                    $('#attendeeDuser').attr('dataid','');
                    $('#attendeeDuser').val('');
                });

                //查询所有办公设备
                var equipStr='';
                $.ajax({
                    url: '/Meetequipment/getAllEquiet',
                    type: 'get',
                    dataType: 'json',
                    success: function (obj) {
                        var data=obj.obj;
                        for(var i=0;i<data.length;i++){
                            equipStr+='<tr><td class="equipClick" equipmentid="'+data[i].sid+'">'+data[i].equipmentName+'</td></tr>';
                        }
                    }
                })
                //选择办公设备控件
                $(".addEquipment").click(function(){
                    layer.open({
                        type: 1,
                        title: ['<fmt:message code="meet.th.SelectDevice" />', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['300px', '500px'],
                        offset: ['30px', '400px'],
                        shadeClose: true, //点击遮罩关闭
                        btn: ['<fmt:message code="global.lang.ok" />'],
                        content:'<table class="equip">' +
                        '<tr><td><span><fmt:message code="meet.th.SelectDevice" /></span></td></tr>'+
                        '<tr><td id="addAll"><span><fmt:message code="meet.th.addAll" /></span></td></tr>'+
                        '<tr><td id="delAll"><span><fmt:message code="meet.th.DeleteAll" /></span></td></tr>'+
                        equipStr+
                        '</table>',
                        success:function(){
                            $(".equipClick").click(function(){
                                $(this).toggleClass('equipSpan');
                            })
                            $("#addAll").click(function(){
                                $(".equipClick").addClass('equipSpan');
                            })
                            $("#delAll").click(function(){
                                $(".equipClick").removeClass('equipSpan');
                            })
                        },
                        yes:function(index){
                            var equipSpanArray=$(".equipSpan");
                            var equipId="";
                            var equipName="";
                            for(var i=0;i<equipSpanArray.length;i++){
                                equipName+=$(equipSpanArray[i]).html()+",";
                                equipId+=$(equipSpanArray[i]).attr("equipmentid")+",";
                            }
                            $(".equipmentId").attr("equipmentId",equipId);
                            $(".equipmentId").val(equipName);
                            layer.close(index);
                        }

                    })
                })
                $(".clearEquipment").click(function(){
                    $(".equipmentId").attr("equipmentId","");
                    $(".equipmentId").val("");
                })
			},
            eventClick:function(calEvent){
				var sid=calEvent.id;
                layer.open({
                    type: 1,
                    title:['<fmt:message code="meet.th.Editorial" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['600px', '500px'],
                    offset: '100px',
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                    content: '<div class="div_table" style="margin-left: 15px;">' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="workflow.th.name" />：</span><span><input type="text" style="width: 180px;margin-left:5px;" name="typeName" class="inputTd meetName test_null" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="email.th.main" />：</span><span><input type="text" style="width: 180px;margin-left:5px;" name="typeName" class="inputTd subject test_null" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Applicant" />：</span><span><div class="inPole"><textarea name="txt" class="userName test_null" id="userDuser" user_id="" dataid="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.MeetingMinutesClerk" />：</span><span><div class="inPole"><textarea name="txt" class="recorderName" id="recoderDuser" user_id="" dataid="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectRecorder" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearRecoder" class="clearRecoder "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span><span style="margin:0 5px;">从</span><span><input type="text" style="width: 140px;" name="typeName" class="inputTd startTime test_null" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span><span style="margin:0 5px;"><fmt:message code="global.lang.to" /></span><span><input type="text" style="width: 140px;" name="typeName" class="endTime test_null" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceRoom" />：</span><span><select name="typeName" class="meetRoomId test_null" id="meetRoomId"></select></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span><span><a href="javascript:;" class="meetRoomDetail"><fmt:message code="meet.th.SeeDetails" /></a></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ApprovalAdministrator" />：</span><span><select name="typeName" class="managerId test_null" id="managerId"></select></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.external" />：</span><span><div class="inPole"><textarea name="attendeeOut" id="attendeeOut" class="attendeeOut" value="" style="min-width: 220px;min-height:58px;"></textarea></div></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.internal" />：</span><span><div class="inPole"><textarea name="txt" class="attendee" id="attendeeDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectAttendee" class="selectAttenddee"><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearAttendee" class="clearAttendee "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceRoomEquipment" />：</span><span><div class="inPole"><textarea name="txt" id="equipmentId" class="equipmentId" equipmentId="" disabled style="min-width: 220px;min-height:60px;"></textarea></span>' +
                    '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="addEquipment" class="addEquipment"><fmt:message code="global.lang.add" /></a></span>'+
                    '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearEquipment" class="clearEquipment"><fmt:message code="global.lang.empty" /></a></div></span></div>' +                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.WriteSchedule" />：</span><span><input type="checkbox" id="isWriteCalendar" class="isWriteCalendar"></span><span><fmt:message code="meet.th.Yes" /></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.NotifyAttendees" />：</span><span><input type="checkbox" id="smsRemind" class="smsRemind"></span><span><fmt:message code="meet.th.UseSMSAlerts" /></span><span><input type="checkbox" id="sms2Remind" class="sms2Remind"></span><span><fmt:message code="meet.th.SMSReminder" /></span><span><fmt:message code="meet.th.Advance" /></span><input type="text" style="width:30px" name="resendHour" id="resendHour" class="resendHour"><span><fmt:message code="meet.th.hour" /></span><input type="text" style="width:30px" class="resendMinute" id="resendMinute"><span><fmt:message code="meet.th.Reminder" /></span></div>'+
                    '<div class="div_tr"><span class="span_td" style="text-align: right"><fmt:message code="sup.th.RelatedAccessories" />：</span><span><div class="inPole" style="float: none;"><div class="Attachment"></div>' +
                    '<form id="uploadimgform" target="uploadiframe"  action="../upload?module=meeting" enctype="multipart/form-data" method="post" >'+
                    '<input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">' +
                    '<a href="javascript:;" id="uploadimg">' +
                    '<img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>'+
                    '</form></div></span></div>'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceDescription" />：</span><span><div class="inPole"><textarea name="meetDesc" id="meetDesc" class="meetDesc" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>'+
                    '</div>',
                    success:function(){
                        initManager();
                        initMeetRoom();
                        $.ajax({
                            url:'/meeting/queryMeetingById',
                            type:'get',
                            dataType:'json',
                            data:{
                                sid:sid
                            },
                            success:function(obj){
                                var data=obj.object;
                                var str='';
                                if(data.attachmentList.length>0){
                                    for(var i=0;i<data.attachmentList.length;i++){
                                        str+='<div class="dech" deUrl="'+data.attachmentList[i].attUrl+'"><a href="<%=basePath %>download?'+data.attachmentList[i].attUrl+'" NAME="'+data.attachmentList[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data.attachmentList[i].attachName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data.attachmentList[i].aid+'@'+data.attachmentList[i].ym+'_'+data.attachmentList[i].attachId+',"></div>';
                                    }
                                }else{
                                    str='';
                                }
                                $(".meetName").val(data.meetName);
                                $(".subject").val(data.subject);
                                $(".userName").val(data.userName);
                                $(".userName").attr("dataid",data.uid);
                                $(".recorderName").val(data.recorderName);
                                $(".recorderName").attr("dataid",data.recorderId);
                                $(".startTime").val(data.startTime);
                                $(".endTime").val(data.endTime);
                                $(".attendeeOut").val(data.attendeeOut);
                                $(".attendee").val(data.attendeeName);
                                $(".attendee").attr("dataid",data.attendee);
								/*$(".equipmentId").val()*/
                                if(data.isWriteCalednar==1){
                                    $(".isWriteCalendar").attr("checked",true);
                                }
                                if(data.smsRemind==0){
                                    $(".smsRemind").attr("checked",true)
                                }
                                if(data.sms2Remind==0){
                                    $(".sms2Remind").attr("checked",true);
                                }
                                $(".resendHour").val(data.resendHour);
                                $(".resendMinute").val(data.resendMinute);
                                $(".meetDesc").val(data.meetDesc);
                                $("#managerId").val(data.managerId);
                                $("#meetRoomId").val(data.meetRoomId);
                                $(".equipmentId").val(data.equipmentNames);
                                $(".equipmentId").attr("equipmentId",data.equipmentIds);
                                $('.Attachment').append(str);
                            }
                        });
                        //点击会议室名称显示会议室详情
                        $('.meetRoomDetail').click(function (){
                            $.ajax({
                                url: '/meetingRoom/getMeetRoomBySid',
                                type: 'get',
                                dataType: 'json',
                                data: {
                                    sid: $(".meetRoomId").val()
                                },
                                success: function (obj) {
                                    if(obj.flag){
                                    var data=obj.object;
                                    var meetList=data.meetingWithBLOBs;
                                    var str= '<div class="table"><table style="margin:auto;">' +
                                        '<tr><td width="20%"><span class="span_td"><fmt:message code="meet.th.ConferenceRoomName" />：</span></td><td><span>'+data.mrName+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceRoomDescription" />：</span></td><td><span>'+data.mrDesc+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.MeetingRoomManager" />：</span></td><td><span>'+data.managetnames+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.ApplicatioAuthority" />：</span></td><td><span>'+data.meetroomdeptName+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.Application" />：</span></td><td><span>'+data.meetroompersonName+'</span></td></tr>' +
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.NumbeAccommodated" />：</span></td><td><span>'+data.mrCapacity+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.EquipmentStatus" />：</span></td><td><span>'+data.mrDevice+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="depatement.th.address" />：</span></td><td><span>'+data.mrPlace+'</span></td></tr>'+
                                        '<tr><td><span class="span_td"><fmt:message code="meet.th.ApplicationRecord" />：</span></td>' +
                                        '<td>' +
                                        '<table>' +
                                        '<tr>' +
                                        '<td><fmt:message code="meet.th.ConferenceName" /></td>' +
                                        '<td><fmt:message code="sup.th.Applicant" /></td>' +
                                        '<td><fmt:message code="sup.th.startTime" /></td>' +
                                        '<td><fmt:message code="meet.th.EndTime" /></td>' +
                                        '<td><fmt:message code="notice.th.state" /></td>' +
                                        '<tr>';
                                    for(var i=0;i<meetList.length;i++){
                                        str+='<tr>' +
                                            '<td>'+meetList[i].meetName+'</td>' +
                                            '<td>'+meetList[i].userName+'</td>' +
                                            '<td>'+meetList[i].startTime+'</td>' +
                                            '<td>'+meetList[i].endTime+'</td>' +
                                            '<td>'+meetList[i].statusName+'</td>' +
                                            '</tr>'
                                    }
                                    str+='</table></td></tr>'+
                                        '</table></div>';
                                    layer.open({
                                        type: 1,
                                        title: ['<fmt:message code="meet.th.SeeDetails" />', 'background-color:#2b7fe0;color:#fff;'],
                                        area: ['900', '500px'],
                                        shadeClose: true, //点击遮罩关闭
                                        btn: [ '<fmt:message code="global.lang.close" />'],
                                        content: str
                                    })
                                    }else{
                                        $.layerMsg({content:"暂无会议室详情",icon:2},function(){
                                        });
									}
                                }
                            })


                        })
                        //删除附件
                        $('.Attachment').on('click','.deImgs',function(){
                            var data=$(this).parents('.dech').attr('deUrl');
                            var dome=$(this).parents('.dech');
                            deleteChatment(data,dome);
                        })
                    },
                    yes:function(index){
                        var array=$(".test_null");
                        for(var i=0;i<array.length;i++){
                            if(array[i].value==""){
                                $.layerMsg({content:"<fmt:message code="sup.th.With*" />",icon:2},function(){
                                });
                                return;
                            }
                        }
                        var isWriteCalednar=0;
                        var attendId='';
                        var attendName='';
                        if($('#isWriteCalendar').is(':checked')){
                            isWriteCalednar=1;
                        }
                        var smsRemind=1;

                        if($('#smsRemind').is(':checked')){
                            smsRemind=0;
                        }
                        var sms2Remind=1;
                        if($('#sms2Remind').is(':checked')){
                            sms2Remind=0;
                        }
                        var recorderId=$(".recorderName").attr("dataid");
                        if(recorderId!="" && recorderId.indexOf(",") >= 0){
                            recorderId=recorderId.substr(0,recorderId.length-1);
                        }
                        var uid=$(".userName").attr("dataid");
                        if(uid!="" && uid.indexOf(",") >= 0 ){
                            uid=uid .substr(0,uid.length-1);
                        }
                        for(var i=0;i<$('.Attachment .inHidden').length;i++){
                            attendId += $('.Attachment .inHidden').eq(i).val();
                        }
                        for(var i=0;i<$('.Attachment .inHidden').length;i++){
                            attendName += $('.Attachment a').eq(i).attr('NAME');
                        }
                        var paraData={
                            sid:sid,
                            meetName: $(".meetName").val(),
                            subject:$(".subject").val(),
                            uid: uid,
                            recorderId:recorderId,
                            startTime:$(".startTime").val(),
                            endTime:$(".endTime").val(),
                            attendeeOut:$(".attendeeOut").val(),
                            attendee:$(".attendee").attr("dataid"),
                            isWriteCalednar:isWriteCalednar,
                            smsRemind:smsRemind,
                            sms2Remind:sms2Remind,
                            resendHour:$(".resendHour").val(),
                            resendMinute:$(".resendMinute").val(),
                            meetDesc:$(".meetDesc").val(),
                            managerId:$("#managerId").val(),
                            meetRoomId:$("#meetRoomId").val(),
                            equipmentNames:$(".equipmentId").val(),
                            equipmentIds:$(".equipmentId").attr("equipmentId"),
                            attachmentId:attendId,
                            attachmentName:attendName
                        }

                        $.ajax({
                            url: '/meeting/updateMeetingById',
                            type: 'get',
                            dataType: 'json',
                            data: paraData,
                            success: function (obj) {
                                if(obj.flag){
                                    $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />！',icon:1},function() {
                                        //更新列表
                                        listByStatus(queryStatus);
                                    })
									location.reload();
                                    layer.close(index);
                                }
                            }
                        })
                        layer.close(index);
                    }
                });
                $('.Attachment').on('click','.deImgs',function(){
                    var data=$(this).parents('.dech').attr('deUrl');
                    var dome=$(this).parents('.dech');
                    deleteChatment(data,dome);
                })

                //添加附件
                <%--$('#uploadimg').on('click',function(){--%>
                    <%--$('#uploadinputimg').click();--%>
                <%--})--%>
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
                            <%--var str1='';--%>
                            <%--console.log(res);--%>
                            <%--for(var i=0;i<data.length;i++){--%>
                                <%--str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';--%>
								<%--/*str1+='<input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',">';*/--%>
                            <%--}--%>
                            <%--$('.Attachment').append(str);--%>
                        <%--});--%>
                    <%--}--%>
                <%--});--%>

                $('#uploadinputimg').fileupload({
                    dataType:'json',
                    done: function (e, data) {
                        if(data.result.obj != ''){
                            var data = data.result.obj;
                            var str = '';
                            var str1 = '';
                            for (var i = 0; i < data.length; i++) {
                                str += '<div class="dech" deUrl="' + data[i].attUrl+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                            }
                            $('.Attachment').append(str);
                        }else{
                            //alert('添加附件大小不能为空!');
                            layer.alert('添加附件大小不能为空!',{},function(){
                                layer.closeAll();
                            });
                        }
                    }
                });

                $('#selectUser').click(function(){//选人员控件(申请人)
                    user_id='userDuser';
                    $.popWindow("../common/selectUser?0");
                });
                $('#selectRecorder').click(function(){//选人员控件（纪要员）
                    user_id='recoderDuser';
                    $.popWindow("../common/selectUser?0");
                });
                $('#selectAttendee').click(function(){//选人员控件（出席内部人员）
                    user_id='attendeeDuser';
                    $.popWindow("../common/selectUser");
                });
                $('#clearUser').click(function(){ //清空人员(申请人)
                    $('#userDuser').attr('user_id','');
                    $('#userDuser').attr('dataid','');
                    $('#userDuser').val('');
                });
                $('#clearRecoder').click(function(){ //清空人员（纪要员）
                    $('#recoderDuser').attr('user_id','');
                    $('#recoderDuser').attr('dataid','');
                    $('#recoderDuser').val('');
                });
                $('#clearAttendee').click(function(){ //清空人员（出席内部人员）
                    $('#attendeeDuser').attr('user_id','');
                    $('#attendeeDuser').attr('dataid','');
                    $('#attendeeDuser').val('');
                });

                //查询所有办公设备
                var equipStr='';
                $.ajax({
                    url: '/Meetequipment/getAllEquiet',
                    type: 'get',
                    dataType: 'json',
                    success: function (obj) {
                        var data=obj.obj;
                        for(var i=0;i<data.length;i++){
                            equipStr+='<tr><td class="equipClick" equipmentid="'+data[i].sid+'">'+data[i].equipmentName+'</td></tr>';
                        }
                    }
                })
                //选择办公设备控件
                $(".addEquipment").click(function(){
                    layer.open({
                        type: 1,
                        title: ['<fmt:message code="meet.th.SelectDevice" />', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['300px', '500px'],
                        shadeClose: true, //点击遮罩关闭
                        btn: ['<fmt:message code="global.lang.ok" />'],
                        content:'<table class="equip">' +
                        '<tr><td><span><fmt:message code="meet.th.SelectDevice" /></span></td></tr>'+
                        '<tr><td id="addAll"><span><fmt:message code="meet.th.addAll" /></span></td></tr>'+
                        '<tr><td id="delAll"><span><fmt:message code="meet.th.DeleteAll" /></span></td></tr>'+
                        equipStr+
                        '</table>',
                        success:function(){
                            $(".equipClick").click(function(){
                                $(this).toggleClass('equipSpan');
                            })
                            $("#addAll").click(function(){
                                $(".equipClick").addClass('equipSpan');
                            })
                            $("#delAll").click(function(){
                                $(".equipClick").removeClass('equipSpan');
                            })
                        },
                        yes:function(index){
                            var equipSpanArray=$(".equipSpan");
                            var equipId="";
                            var equipName="";
                            for(var i=0;i<equipSpanArray.length;i++){
                                equipName+=$(equipSpanArray[i]).html()+",";
                                equipId+=$(equipSpanArray[i]).attr("equipmentid")+",";
                            }
                            $(".equipmentId").attr("equipmentId",equipId);
                            $(".equipmentId").val(equipName);
                            layer.close(index);
                        }

                    })
                })
                $(".clearEquipment").click(function(){
                    $(".equipmentId").attr("equipmentId","");
                    $(".equipmentId").val("");
                })
			}
        });
	})
    function initManager(){
        $.ajax({
            url: '/syspara/getUserName',
            type: 'get',
            dataType: 'json',
            data: {
                paraName:"MEETING_MANAGER_TYPE"
            },
            success: function (obj) {
                var data=obj.object;
                var managerIdArray=data.paraValue.split(",");
                var managerNameArray=data.userName.split(",");
                var str="";
                for(var i=0;i<managerIdArray.length;i++){
                    str+='<option value="'+managerIdArray[i]+'">'+managerNameArray[i]+'</option>';
                }
                $(".managerId").html(str);
            }
        });
    }

    //初始化会议室下拉列表
    function initMeetRoom(){
        $.ajax({
            url: '../../meetingRoom/getAllMeetRoom',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                var str="";
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].sid+'">'+data[i].mrName+'</option>';
                }
                $(".meetRoomId").html(str);
            }
        });
    }
    $(function () {
        //修改会议
        $('.pagediv').on('click','.editData',function (event){
            var sid=$(this).attr("sid");
            event.stopPropagation();
            layer.open({
                type: 1,
                title:['<fmt:message code="meet.th.ModifyInformation" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '500px'],
                offset: '100px',
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-left: 15px;">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="workflow.th.name" />：</span><span><input type="text" style="width: 180px;margin-left: 5px;" name="typeName" class="inputTd meetName test_null" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="email.th.main" />：</span><span><input type="text" style="width: 180px;margin-left: 5px;" name="typeName" class="inputTd subject test_null" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Applicant" />：</span><span><div class="inPole"><textarea name="txt" class="userName test_null" id="userDuser" user_id="" dataid="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.MeetingMinutesClerk" />：</span><span><div class="inPole"><textarea name="txt" class="recorderName" id="recoderDuser" user_id="" dataid="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectRecorder" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearRecoder" class="clearRecoder "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span><span style="margin:0 5px;">从</span><span><input type="text" style="width: 140px;" name="typeName" class="inputTd startTime test_null" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span><span style="margin:0 5px;"><fmt:message code="global.lang.to" /></span><span><input type="text" style="width: 140px;" name="typeName" class="endTime test_null" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>' +
				'<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceRoom" />：</span><span><select name="typeName" class="meetRoomId test_null" id="meetRoomId"></select></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span><span><a href="javascript:;" class="meetRoomDetail"><fmt:message code="meet.th.SeeDetails" /></a></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ApprovalAdministrator" />：</span><span><select name="typeName" class="managerId test_null" id="managerId"></select></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.external" />：</span><span><div class="inPole"><textarea name="attendeeOut" id="attendeeOut" class="attendeeOut" value="" style="min-width: 220px;min-height:58px;"></textarea></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.internal" />：</span><span><div class="inPole"><textarea name="txt" class="attendee" id="attendeeDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectAttendee" class="selectAttenddee"><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearAttendee" class="clearAttendee "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceRoomEquipment" />：</span><span><div class="inPole"><textarea name="txt" id="equipmentId" class="equipmentId" equipmentId="" disabled style="min-width: 220px;min-height:60px;"></textarea></span>' +
                '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="addEquipment" class="addEquipment"><fmt:message code="global.lang.add" /></a></span>'+
                '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearEquipment" class="clearEquipment"><fmt:message code="global.lang.empty" /></a></div></span></div>' +                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.WriteSchedule" />：</span><span><input type="checkbox" id="isWriteCalendar" class="isWriteCalendar"></span><span><fmt:message code="meet.th.Yes" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.NotifyAttendees" />：</span><span><input type="checkbox" id="smsRemind" class="smsRemind"></span><span><fmt:message code="meet.th.UseSMSAlerts" /></span><span><input type="checkbox" id="sms2Remind" class="sms2Remind"></span><span><fmt:message code="meet.th.SMSReminder" /></span><span><fmt:message code="meet.th.Advance" /></span><input type="text" name="resendHour" id="resendHour" style="width: 30px;" class="resendHour"><span><fmt:message code="meet.th.hour" /></span><input type="text"class="resendMinute" style="width: 30px;" id="resendMinute"><span><fmt:message code="meet.th.Reminder" /></span></div>'+
                '<div class="div_tr"><span class="span_td" style="text-align: right"><fmt:message code="sup.th.RelatedAccessories" />：</span><span><div class="inPole" style="float: none;"><div class="Attachment"></div>' +
                '<form id="uploadimgform" target="uploadiframe"  action="../upload?module=meeting" enctype="multipart/form-data" method="post" >'+
                '<input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">' +
                '<a href="javascript:;" id="uploadimg">' +
                '<img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>'+
                '</form></div></span></div>'+
				'<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.ConferenceDescription" />：</span><span><div class="inPole"><textarea name="meetDesc" id="meetDesc" class="meetDesc" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>'+
                '</div>',
                success:function(){
                    initManager();
                    initMeetRoom();
                    $.ajax({
                        url:'/meeting/queryMeetingById',
                        type:'get',
                        dataType:'json',
                        data:{
                            sid:sid
                        },
                        success:function(obj){
                            var data=obj.object;
                            var str='';
                            if(data.attachmentList.length>0){
                                for(var i=0;i<data.attachmentList.length;i++){
                                    str+='<div class="dech" deUrl="'+data.attachmentList[i].attUrl+'"><a href="<%=basePath %>download?'+data.attachmentList[i].attUrl+'" NAME="'+data.attachmentList[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data.attachmentList[i].attachName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data.attachmentList[i].aid+'@'+data.attachmentList[i].ym+'_'+data.attachmentList[i].attachId+',"></div>';
                                }
                            }else{
                                str='';
                            }
                           $(".meetName").val(data.meetName);
                           $(".subject").val(data.subject);
                           $(".userName").val(data.userName);
                           $(".userName").attr("dataid",data.uid);
                           $(".recorderName").val(data.recorderName);
                           $(".recorderName").attr("dataid",data.recorderId);
                          $(".startTime").val(data.startTime);
                           $(".endTime").val(data.endTime);
                           $(".attendeeOut").val(data.attendeeOut);
                           $(".attendee").val(data.attendeeName);
							$(".attendee").attr("dataid",data.attendee);
							/*$(".equipmentId").val()*/
							if(data.isWriteCalednar==1){
                                $(".isWriteCalendar").attr("checked",true);
							}
							if(data.smsRemind==0){
							    $(".smsRemind").attr("checked",true)
							}
							if(data.sms2Remind==0){
							    $(".sms2Remind").attr("checked",true);
							}
							$(".resendHour").val(data.resendHour);
							$(".resendMinute").val(data.resendMinute);
							$(".meetDesc").val(data.meetDesc);
							$("#managerId").val(data.managerId);
                            $("#meetRoomId").val(data.meetRoomId);
                            $(".equipmentId").val(data.equipmentNames);
                            $(".equipmentId").attr("equipmentId",data.equipmentIds);
                            $('.Attachment').append(str);
                        }
                    });
                    //点击会议室名称显示会议室详情
                    $('.meetRoomDetail').click(function (){
                        $.ajax({
                            url: '/meetingRoom/getMeetRoomBySid',
                            type: 'get',
                            dataType: 'json',
                            data: {
                                sid: $(".meetRoomId").val()
                            },
                            success: function (obj) {
                                if(obj.flag){
                                var data = obj.object;
                                var meetList = data.meetingWithBLOBs;
                                var str = '<div class="table"><table style="margin:auto;">' +
                                    '<tr><td width="20%"><span class="span_td"><fmt:message code="meet.th.ConferenceRoomName" />：</span></td><td><span>' + data.mrName + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceRoomDescription" />：</span></td><td><span>' + data.mrDesc + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.MeetingRoomManager" />：</span></td><td><span>' + data.managetnames + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ApplicatioAuthority" />：</span></td><td><span>' + data.meetroomdeptName + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.Application" />：</span></td><td><span>' + data.meetroompersonName + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.NumbeAccommodated" />：</span></td><td><span>' + data.mrCapacity + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.EquipmentStatus" />：</span></td><td><span>' + data.mrDevice + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="depatement.th.address" />：</span></td><td><span>' + data.mrPlace + '</span></td></tr>' +
                                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ApplicationRecord" />：</span></td>' +
                                    '<td>' +
                                    '<table>' +
                                    '<tr>' +
                                    '<td><fmt:message code="meet.th.ConferenceName" /></td>' +
                                    '<td><fmt:message code="sup.th.Applicant" /></td>' +
                                    '<td><fmt:message code="sup.th.startTime" /></td>' +
                                    '<td><fmt:message code="meet.th.EndTime" /></td>' +
                                    '<td><fmt:message code="notice.th.state" /></td>' +
                                    '<tr>';
                                for (var i = 0; i < meetList.length; i++) {
                                    str += '<tr>' +
                                        '<td>' + meetList[i].meetName + '</td>' +
                                        '<td>' + meetList[i].userName + '</td>' +
                                        '<td>' + meetList[i].startTime + '</td>' +
                                        '<td>' + meetList[i].endTime + '</td>' +
                                        '<td>' + meetList[i].statusName + '</td>' +
                                        '</tr>'
                                }
                                str += '</table></td></tr>' +
                                    '</table></div>';
                                layer.open({
                                    type: 1,
                                    title: ['<fmt:message code="meet.th.SeeDetails" />', 'background-color:#2b7fe0;color:#fff;'],
                                    area: ['900', '500px'],
                                    shadeClose: true, //点击遮罩关闭
                                    btn: ['<fmt:message code="global.lang.close" />'],
                                    content: str
                                })
                            }
                            else{
                                    $.layerMsg({content:"暂无会议室详情",icon:2},function(){
                                    });
								}
                            }
                        })
                    })
                    //删除附件
                    $('.Attachment').on('click','.deImgs',function(){
                        var data=$(this).parents('.dech').attr('deUrl');
                        var dome=$(this).parents('.dech');
                        deleteChatment(data,dome);
                    })
				},
                yes:function(index){
                    var array=$(".test_null");
                    for(var i=0;i<array.length;i++){
                        if(array[i].value==""){
                            $.layerMsg({content:"<fmt:message code="sup.th.With*" />",icon:2},function(){
                            });
                            return;
                        }
                    }
                    var isWriteCalednar=0;
                    var attendId='';
                    var attendName='';
                    if($('#isWriteCalendar').is(':checked')){
                        isWriteCalednar=1;
                    }
                    var smsRemind=1;

                    if($('#smsRemind').is(':checked')){
                        smsRemind=0;
                    }
                    var sms2Remind=1;
                    if($('#sms2Remind').is(':checked')){
                        sms2Remind=0;
                    }
					var recorderId=$(".recorderName").attr("dataid");
                   if(recorderId!="" && recorderId.indexOf(",") >= 0){
                       recorderId=recorderId.substr(0,recorderId.length-1);
				   }
                   var uid=$(".userName").attr("dataid");
                   if(uid!="" && uid.indexOf(",") >= 0 ){
                       uid=uid .substr(0,uid.length-1);
				   }
                    for(var i=0;i<$('.Attachment .inHidden').length;i++){
                        attendId += $('.Attachment .inHidden').eq(i).val();
                    }
                    for(var i=0;i<$('.Attachment .inHidden').length;i++){
                        attendName += $('.Attachment a').eq(i).attr('NAME');
                    }
					var paraData={
                        sid:sid,
                        meetName: $(".meetName").val(),
                    	subject:$(".subject").val(),
                  	    uid: uid,
              		    recorderId:recorderId,
                   		startTime:$(".startTime").val(),
                   		endTime:$(".endTime").val(),
						attendeeOut:$(".attendeeOut").val(),
                	    attendee:$(".attendee").attr("dataid"),
						isWriteCalednar:isWriteCalednar,
                        smsRemind:smsRemind,
                        sms2Remind:sms2Remind,
                        resendHour:$(".resendHour").val(),
                        resendMinute:$(".resendMinute").val(),
                        meetDesc:$(".meetDesc").val(),
                        managerId:$("#managerId").val(),
                        meetRoomId:$("#meetRoomId").val(),
                        equipmentNames:$(".equipmentId").val(),
                        equipmentIds:$(".equipmentId").attr("equipmentId"),
                        attachmentId:attendId,
                        attachmentName:attendName
                    }

                    $.ajax({
                        url: '/meeting/updateMeetingById',
                        type: 'get',
                        dataType: 'json',
                        data: paraData,
                        success: function (obj) {
                           if(obj.flag){
                               $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />！',icon:1},function() {
                                   //更新列表
                                   listByStatus(queryStatus);
                               })
                               layer.close(index);
						   }
                        }
                    })
                }
            });

            $('.Attachment').on('click','.deImgs',function(){
                var data=$(this).parents('.dech').attr('deUrl');
                var dome=$(this).parents('.dech');
                deleteChatment(data,dome);
            })

            //添加附件
            <%--$('#uploadimg').on('click',function(){--%>
                <%--$('#uploadinputimg').click();--%>
            <%--})--%>
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
                        <%--var str1='';--%>
                        <%--console.log(res);--%>
                        <%--for(var i=0;i<data.length;i++){--%>
                            <%--str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';--%>
							<%--/*str1+='<input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',">';*/--%>
                        <%--}--%>
                        <%--$('.Attachment').append(str);--%>
                    <%--});--%>
                <%--}--%>
            <%--});--%>

            $('#uploadinputimg').fileupload({
                dataType:'json',
                done: function (e, data) {
                    if(data.result.obj != ''){
                        var data = data.result.obj;
                        var str = '';
                        var str1 = '';
                        for (var i = 0; i < data.length; i++) {
                            str += '<div class="dech" deUrl="' + data[i].attUrl+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                        }
                        $('.Attachment').append(str);
                    }else{
                        //alert('添加附件大小不能为空!');
                        layer.alert('添加附件大小不能为空!',{},function(){
                            layer.closeAll();
                        });
                    }
                }
            });

            $('#selectUser').click(function(){//选人员控件(申请人)
                user_id='userDuser';
                $.popWindow("../common/selectUser?0");
            });
            $('#selectRecorder').click(function(){//选人员控件（纪要员）
                user_id='recoderDuser';
                $.popWindow("../common/selectUser?0");
            });
            $('#selectAttendee').click(function(){//选人员控件（出席内部人员）
                user_id='attendeeDuser';
                $.popWindow("../common/selectUser");
            });
            $('#clearUser').click(function(){ //清空人员(申请人)
                $('#userDuser').attr('user_id','');
                $('#userDuser').attr('dataid','');
                $('#userDuser').val('');
            });
            $('#clearRecoder').click(function(){ //清空人员（纪要员）
                $('#recoderDuser').attr('user_id','');
                $('#recoderDuser').attr('dataid','');
                $('#recoderDuser').val('');
            });
            $('#clearAttendee').click(function(){ //清空人员（出席内部人员）
                $('#attendeeDuser').attr('user_id','');
                $('#attendeeDuser').attr('dataid','');
                $('#attendeeDuser').val('');
            });

            //查询所有办公设备
            var equipStr='';
            $.ajax({
                url: '/Meetequipment/getAllEquiet',
                type: 'get',
                dataType: 'json',
                success: function (obj) {
                    var data=obj.obj;
                    for(var i=0;i<data.length;i++){
                        equipStr+='<tr><td class="equipClick" equipmentid="'+data[i].sid+'">'+data[i].equipmentName+'</td></tr>';
                    }
                }
            })
            //选择办公设备控件
            $(".addEquipment").click(function(){
                layer.open({
                    type: 1,
                    title: ['<fmt:message code="meet.th.SelectDevice" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['300px', '500px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.ok" />'],
                    content:'<table class="equip">' +
                    '<tr><td><span><fmt:message code="meet.th.SelectDevice" /></span></td></tr>'+
                    '<tr><td id="addAll"><span><fmt:message code="meet.th.addAll" /></span></td></tr>'+
                    '<tr><td id="delAll"><span><fmt:message code="meet.th.DeleteAll" /></span></td></tr>'+
                    equipStr+
                    '</table>',
                    success:function(){
                        $(".equipClick").click(function(){
                            $(this).toggleClass('equipSpan');
                        })
						$("#addAll").click(function(){
						    $(".equipClick").addClass('equipSpan');
						})
						$("#delAll").click(function(){
                            $(".equipClick").removeClass('equipSpan');
						})
                    },
                    yes:function(index){
                        var equipSpanArray=$(".equipSpan");
                        var equipId="";
                        var equipName="";
                        for(var i=0;i<equipSpanArray.length;i++){
                            equipName+=$(equipSpanArray[i]).html()+",";
                            equipId+=$(equipSpanArray[i]).attr("equipmentid")+",";
                        }
                        $(".equipmentId").attr("equipmentId",equipId);
                        $(".equipmentId").val(equipName);
                        layer.close(index);
                    }

                })
            })
            $(".clearEquipment").click(function(){
                $(".equipmentId").attr("equipmentId","");
                $(".equipmentId").val("");
            })
		})

        $('#meetingApply').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.meentingDate').show();
            $('#already').hide();
            $('.colorClass').show();
        })
        $('#PAMeeting').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#already').show();
            $('.meentingDate').hide();
            $('.colorClass').hide();
        })
        $('#ApMeeting').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#already').show();
            $('.meentingDate').hide();
            $('.colorClass').hide();
        })
        $('#HaveMeeting').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#already').show();
            $('.meentingDate').hide();
            $('.colorClass').hide();
        })
        $('#NotMeeting').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#already').show();
            $('.meentingDate').hide();
            $('.colorClass').hide();
        })
    })
    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm',
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
        format: 'YYYY/MM/DD hh:mm',
		/*min: laydate.now(),*/
		/*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    //点击各个状态后显示的列表
    function listByStatus(status){
        var paraData;
        queryStatus=status;
        if(status==0){
            paraData={}
		}else{
            paraData={
                uid:$.cookie('uid'),
				status:status
            }
		}
        $.ajax({
            url:'/meeting/queryMeeting',
            type:'get',
            dataType:'json',
            data:paraData,
            success:function(obj){
                var data=obj.obj;
                var str="";
                for(var i=0;i<data.length;i++) {
                    str += '<tr>' +
						'<td style="text-align: center" width="11%" title="' + data[i].meetName + '"><a class="meetingDetail" href="javascript:void(0)" sid="' + data[i].sid + '">' + data[i].meetName + '</a></td>' +
						'<td style="text-align:center" width="11%" title="' + data[i].subject + '">' + data[i].subject + '</td>' +
						'<td style="text-align:center" width="15%">' + data[i].createTime + '</td>' +
                        '<td style="text-align:center" width="15%">' + data[i].startTime + '</td>' +
						'<td style="text-align:center" width="15%">' + data[i].endTime + '</td>' +
						'<td style="text-align:center" width="9%">' + data[i].meetRoomName + '</td>'+
                        '<td style="text-align:center" width="9%">' + data[i].managerName + '</td>';

                    if(status==1 || status==4){
                        str+='<td style="text-align:center" width="15%">' +
							'<a href="javascript:;" style="" class="editData" sid="'+data[i].sid+'"><fmt:message code="depatement.th.modify" /></a>&nbsp;&nbsp;'+
                            '<a href="javascript:;" style="" onclick="delMeeting('+data[i].sid+')"' + '><fmt:message code="global.lang.delete" /></a></td>'+
                            '</tr>';
                    }
                    if(status==2){
						/*'<td style="text-align:center" width="15%"><a href="javascript:;" style="">撤销</a>&nbsp;&nbsp;'+*/
                        str+= '<td style="text-align:center" width="15%"><a href="javascript:;" style="" onclick="attendState('+data[i].sid+',1)"><fmt:message code="mee.th.Participants" /></a>&nbsp;&nbsp;'+
                            '<a href="javascript:;" style="" onclick="attendState('+data[i].sid+',2)"><fmt:message code="meet.th.ReadingStatus" /></a></td>'+
                            '</tr>';
                    }
                    if(status==3){
                        str+='<td width="15%" style="text-align:center"><a href="javascript:;" style="" onclick="attendState('+data[i].sid+',1)"><fmt:message code="mee.th.Participants" /></a>&nbsp;&nbsp;'+
                            '<a href="javascript:;" style="" onclick="attendState('+data[i].sid+',2)"><fmt:message code="meet.th.ReadingStatus" /></a>'+
                            '</tr>';
                    }
                }
                $("#already tbody").html(str);
            }
        });
    }

    //参会情况和签阅情况
    function attendState(meetingId,join){
        if(join==1){//参会情况
            $.ajax({
                url:'/meeting/queryAttendConfirm',
                type:'get',
                dataType:'json',
                data:{
                    meetingId:meetingId
                },
                success:function(obj){
                    var data=obj.obj;
                    layer.open({
                        type: 1,
						/* skin: 'layui-layer-rim', //加上边框 */
                        offset: '80px',
                        area: ['800px', '400px'], //宽高
                        title: "<fmt:message code="meet.th.ViewParticipants" />",
                        closeBtn: 1,
                        content:
                        '<div class="mainRight attendContent"><div class="pagediv" style="margin: 0 auto;width: 97%;" id="showList">'+
                        '<table><thead>'+
                        '<tr> <th><fmt:message code="workflow.th.Serial" /></th><th><fmt:message code="userDetails.th.name" /></th> <th><fmt:message code="workflow.th.sector" /></th> <th><fmt:message code="userManagement.th.role" /></th><th><fmt:message code="meet.th.AttendanceStatus" /></th><th><fmt:message code="meet.th.ConfirmationTime" /></th><th><fmt:message code="hr.th.Explain" /></th></tr>'+
                        '</thead>' +
                        '<tbody></tbody>'+
                        '</table>'+
                        '</div></div>',
                        btn: ['<fmt:message code="global.lang.close" />'],
                        success:function () {
                            $(".attendContent tbody").html("");
                            var str="";
                            for(var i=0;i<data.length;i++){
                                str += '<tr><td>' +(i+1)+ '</td>' + '<td>' + data[i].attendeeName + '</td>' + '<td>' + data[i].deptName + '</td>' +
                                    '<td>' + data[i].userPrivName + '</td>' + '<td>' + data[i].attendFlagStr + '</td>' + '<td>' + data[i].createTime + '</td>' +'<td>' + data[i].remark + '</td>' +
                                    '</tr>';
                            }
                            $(".attendContent tbody").html(str);
                        }
                    })
                }
            });
        }else {//签阅情况
            $.ajax({
                url: '/meeting/queryAttendConfirm',
                type: 'get',
                dataType: 'json',
                data: {
                    meetingId: meetingId
                },
                success: function (obj) {
                    var data = obj.obj;
                    layer.open({
                        type: 1,
						/* skin: 'layui-layer-rim', //加上边框 */
                        offset: '80px',
                        area: ['800px', '400px'], //宽高
                        title: "<fmt:message code="meet.th.CheckMeeting" />",
                        closeBtn: 1,
                        content: '<div class="mainRight attendContent"><div class="pagediv" style="margin: 0 auto;width: 97%;" id="showList">' +
                        '<table><thead>' +
                        '<tr> <th><fmt:message code="workflow.th.Serial" /></th><th><fmt:message code="userDetails.th.name" /></th> <th><fmt:message code="workflow.th.sector" /></th> <th><fmt:message code="userManagement.th.role" /></th><th><fmt:message code="meet.th.ReadStatus" /></th><th><fmt:message code="meet.th.TimeRead" /></th></tr>' +
                        '</thead>' +
                        '<tbody></tbody>' +
                        '</table>' +
                        '</div></div>',
                        btn: ['<fmt:message code="global.lang.close" />'],
                        success: function () {
                            $(".attendContent tbody").html("");
                            var str = "";
                            for (var i = 0; i < data.length; i++) {
                                str += '<tr><td>' + (i + 1) + '</td>' + '<td>' + data[i].attendeeName + '</td>' + '<td>' + data[i].deptName + '</td>' +
                                    '<td>' + data[i].userPrivName + '</td>' + '<td>' + data[i].readFlagStr + '</td>' + '<td>' + data[i].readingTime + '</td>' +
                                    '</tr>';
                            }
                            $(".attendContent tbody").html(str);
                        }
                    })
                }
            });
        }
    }

    //删除会议
    function delMeeting(sid){
        $.layerConfirm({title:'<fmt:message code="meet.th.DeleteSession" />',content:'<fmt:message code="meet.th.DeterminesRecovered" />！',icon:0},function(){
            $.ajax({
                url:'/meeting/delMeetingById',
                type:'get',
                dataType:'json',
                data:{
                    sid:sid
                },
                success:function(obj){
                    $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1},function(){
                        //更新列表
                        listByStatus(queryStatus)
                        //更新数量
                        //各个状态的数量显示
                        $.ajax({
                            url:'/meeting/queryCountByStatus',
                            type:'get',
                            dataType:'json',
                            success:function(obj){
                                var data=obj.object;
                                $("#pendingCount").html(data.pendingCount);
                                $("#approvedCount").html(data.approvedCount);
                                $("#processingCount").html(data.processingCount);
                                $("#notApprovedCount").html(data.notApprovedCount);
                                $("#overCount").html(data.overCount);
                            }
                        });
                    })
                }
            });
        })
    }
    //附件删除
    function deleteChatment(data,element){

        layer.confirm('<fmt:message code="sup.th.Delete" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="notice.th.DeleteFile" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'get',
                url:'../delete',
                dataType:'json',
                data:data,
                success:function(res){

                    if(res.flag == true){
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                        element.remove();
                    }else{
                        layer.msg('<fmt:message code="lang.th.deleSucess" />', { icon:6});
                    }
                }
            });

        }, function(index){
            layer.close(index);
        });
    }

    $('.pagediv').on('click','.meetingDetail',function (event) {
        $.ajax({
            url: '/meeting/queryMeetingById',
            type: 'get',
            dataType: 'json',
            data: {
                sid: $(this).attr("sid")
            },
            success: function (obj) {
                var data = obj.object;
                var str = '';
                if (data.attachmentList.length > 0) {
                    for (var i = 0; i < data.attachmentList.length; i++) {
                        str += '<div style="line-height: 0;"><img style="width:16px;margin-right: 5px;" src="../img/file/cabinet@.png"/><a href="<%=basePath %>download?' + data.attachmentList[i].attUrl + '">' + data.attachmentList[i].attachName + '</a></div>'
                    }
                } else {
                    str = '';
                }
                layer.open({
                    type: 1,
                    title: ['<fmt:message code="meet.th.SeeConferenceDetails" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['600px', '500px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.close" />'],
                    content: '<div class="table"><table style="margin:auto;" class="detailTable">' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="workflow.th.name" />：</span></td><td><span>' + data.meetName + '</span></td><tr>' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="email.th.main" />：</span></td><td><span>' + data.subject + '</span></td><tr>' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="sup.th.Applicant" />：</span></td><td><span>' + data.userName + '</span></td><tr>' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="meet.th.MeetingMinutesClerk" />：</span></td><td><span>' + data.recorderName + '</span></td><tr>' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span></td><td><span>从 &nbsp;</span><span>' + data.startTime + '</span><span>&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span><span>' + data.endTime + '</span></td><tr>' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="meet.th.ConferenceRoom" />：</span></td><td><span>' + data.meetRoomName + '</span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ApprovalAdministrator" />：</span></td><td><span>' + data.managerName + '</span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.external" />：</span></td><td><span>' + data.attendeeOut + '</span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.internal" />：</span></td><td><span>' + data.attendeeName + '</span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceRoomEquipment" />：</span></td><td><span>' + data.equipmentNames + '</span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="email.th.file" />：</span></td><td><span><div class="inPole">' + str + '</div></span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceDescription" />：</span></td><td><span>' + data.meetDesc + '</span></td><tr>' +
                    '</table></div>',
					success:function(){

					}
                })
            }
        })
        //queryStatus
    })

</script>
</body>
</html>
