<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title><fmt:message code="event.th.LeadershipActivitiesArrangement" /></title>
    <link rel="stylesheet" href="/css/meeting/index.css">
    <link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.print.css"/>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/css/meeting/myMeeting.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <style>
        table tbody tr td:nth-child(1){
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .pagediv tr {
            height: 50px;!important;
        }
    </style>
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/meeting/Mymeeting.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        /*.table table td{*/
        /*padding: 10px;*/
        /*}*/
        .table .span_td{
            text-align: right;
        }
        .showQRCode{
            /*	position: absolute;*/
            right: 32px;
            top:50px;
            z-index:99999;

        }
        #newActivity{
            padding-left:25px;!important;
        }
        .newActivity {
            float: right;
            width: 70px;
            height: 28px;
            background: url(../../img/file/cabinet01.png) no-repeat;
            color: #fff;
            font-size: 14px;
            line-height: 28px;
            margin-right: 4%;
            margin-top: 8px;
            cursor: pointer;
        }
        .queryConditon span{
            margin-left: 23px !important;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_myMeeting.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.LeadershipActivitiesArrangement" />
    </div>
    <div class="newActivity">
        <span class="btnSpans"  id="newActivity"><img style="margin-right: 4px;margin-left: -16px;margin-bottom: -1px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="global.lang.new" /></span>
    </div>

</div>
<div class="main">
    <div class="byDepart">
        <div class="queryConditon">
            <span style="margin-left: 20px;"><fmt:message code="event.th.NameActivity" />：</span>
            <input type="text" name="taskClass" id="meetName">
            <span style="margin-left: 20%;"><fmt:message code="email.th.time" />：</span>
            <input type="text" name="startTime" id="startTime" onclick="laydate(end)">
            <span style="margin: 0 5px;"><fmt:message code="global.lang.to" /></span>
            <input type="text" name="endTime" id="endTime" onclick="laydate(end)">
            <span class="btnSpan" id="query"><fmt:message code="global.lang.query" /></span>
            <span class="btnSpan" id="clearCondition"><fmt:message code="workflow.th.Reset" /></span>

        </div>
        <div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table>
                <thead>
                <tr>
                    <th style="text-align: center" width="8%"><fmt:message code="global.lang.date" /></th>
                    <th style="text-align: center" width="8%"><fmt:message code="event.th.timeInterval" /></th>
                    <th style="text-align: center" width="8%"><fmt:message code="email.th.time" /></th>
                    <th style="text-align: center" width="10%"><fmt:message code="email.th.Project" /></th>
                    <th style="text-align: center" width="8%"><fmt:message code="email.th.main" /></th>
                    <th style="text-align: center" width="8%"><fmt:message code="sup.th.Applicant" /></th>
                    <%--<th style="text-align: center" width="8%"><fmt:message code="notice.th.state" /></th>--%>
                    <th style="text-align: center" width="12%"><fmt:message code="event.th.Organizer" /></th>
                    <th style="text-align: center" width="8%"><fmt:message code="event.th.place" /></th>
                    <th style="text-align: center" width="12%"><fmt:message code="event.th.Participant" /></th>
                    <th style="text-align: center" width="10%"><fmt:message code="journal.th.Remarks" /></th>
                    <%--<th style="text-align: center" width="8%">操作</th>--%>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script>
    var user_id='';
    var dept_id='';
    var priv_id='';
    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm:ss',
        istime: true,
        /*istoday: false,
        choose: function(datas){
          //  end.min = datas; //开始日选好后，重置结束日的最小日期
         //   end.start = datas //将结束日的初始值设定为开始日
        }*/
    };
    var end = {
        format: 'YYYY/MM/DD hh:mm:ss',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        /*istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }*/
    };
    $(function () {
        //列表显示
        $.ajax({
            url: '/leaderschedule/queryLeaderActiveAll',
            type: 'get',
            dataType: 'json',
            success: function (data) {

                var str = "";
                for (var i = 0; i < data.obj.length; i++) {

                    str +="<tr sid='"+data.obj[i].id+"'><td style='text-align:center;' width='8%' >"+data.obj[i].date+"</td>" +
                        "<td style='text-align: center' width='8%'>"+data.obj[i].dateAmong+"</td>" +
                        "<td style='text-align:center;' width='8%'>"+data.obj[i].time+"</td>" +
                        "<td style='text-align:center;' width='8%'>"+data.obj[i].scheduleType+"</td>" +
                        "<td style='text-align:center;' width='8%'>"+data.obj[i].subject+"</td>" +
                        "<td style='text-align:center;' width='8%'>"+data.obj[i].appUser+"</td>" +
                        /*"<td style='text-align:center;' width='8%'><span class='label label-important'>"+data.obj[i].status+"</span></td>" +*/
                        "<td style='text-align:center;' width='8%'><span rel='tooltip' title='' data-original-title='undertake'>"+data.obj[i].undertake+"</span></td>" +
                        "<td style='text-align:center;' width='8%'><span rel='tooltip' title='' data-original-title='location'>"+data.obj[i].location+"</span></td>" +
                        "<td style='text-align:center;' width='8%'>"+data.obj[i].attentee+"</td>" +
                        "<td style='text-align:center;overflow:hidden;white-space: nowrap;text-overflow: ellipsis;' width='8%'>"+data.obj[i].remark+"</td>";
                        /*"<td style='text-align:center;' width='8%'  ><a class='td-link-icon' title='' rel='tooltip' href='javascript:void(0);' onclick=\"commitLeaderActivity('"+data.obj[i].id+"');\" data-original-title='审批'><i class='icon-pencil-5'></i>审批</a></td>" +*/
//
//                    if($.cookie("uid")==1&&data.obj[i].status=='未审批'){
//                        str+="<td style='text-align:center;' width='8%'  ><a class='td-link-icon' title='' rel='tooltip' href='javascript:void(0);' onclick=\"commitLeaderActivity('"+data.obj[i].id+"');\" data-original-title='审批'><i class='icon-pencil-5'></i>审批</a></td>";
//                    }else{
//                        str+="<td style='text-align:center;' width='8%'  ></td>";
//                    }
                    str+="</tr>";

                }
                $("#already tbody").html(str);
            }
        });


        //查询按钮点击事件
        $("#query").click(function () {
            var create_user=$(".userName").attr("dataid");
            if(create_user!=""){
                create_user=parseInt(create_user);
            }
            var begin=$("#startTime").val();
            var end=$("#endTime").val();
            if(begin!=""&&begin!=null) {
                begin = new Date(begin).getTime();
            }else{
                begin=0;
            }
            if(end!=""&&end!=null){
                end=new Date(end).getTime();
            }else{
                begin=0;
            }


            var paraData={
                subject:$("#meetName").val(),
                begin_time:begin,
                end_time:end
            }
            $.ajax({
                url:'/leaderschedule/queryLeaderActiveAll',
                type:'get',
                dataType:'json',
                data:paraData,
                success:function(data){

                    if(data.obj!=undefined && data.obj!=""){
                        var str="";
                        for(var i=0;i<data.obj.length;i++){

                            str +="<tr sid='"+data.obj[i].id+"'><td style='text-align:center;' width='8%' >"+data.obj[i].date+"</td>" +
                                "<td style='text-align: center' width='8%'>"+data.obj[i].dateAmong+"</td>" +
                                "<td style='text-align:center;' width='8%'>"+data.obj[i].time+"</td>" +
                                "<td style='text-align:center;' width='8%'>"+data.obj[i].scheduleType+"</td>" +
                                "<td style='text-align:center;' width='8%'>"+data.obj[i].subject+"</td>" +
                                "<td style='text-align:center;' width='8%'>"+data.obj[i].appUser+"</td>" +
                                /*"<td style='text-align:center;' width='8%'><span class='label label-important'>"+data.obj[i].status+"</span></td>" +*/
                                "<td style='text-align:center;' width='8%'><span rel='tooltip' title='' data-original-title='undertake'>"+data.obj[i].undertake+"</span></td>" +
                                "<td style='text-align:center;' width='8%'><span rel='tooltip' title='' data-original-title='location'>"+data.obj[i].location+"</span></td>" +
                                "<td style='text-align:center;' width='8%'>"+data.obj[i].attentee+"</td>" +
                                "<td style='text-align:center;overflow:hidden;white-space: nowrap;text-overflow: ellipsis;' width='8%'>"+data.obj[i].remark+"</td>";
                            /*"<td style='text-align:center;' width='8%'  ><a class='td-link-icon' title='' rel='tooltip' href='javascript:void(0);' onclick=\"commitLeaderActivity('"+data.obj[i].id+"');\" data-original-title='审批'><i class='icon-pencil-5'></i>审批</a></td>" +*/

                            /*if($.cookie("uid")==1&&data.obj[i].status=='未审批'){
                                str+="<td style='text-align:center;' width='8%'  ><a class='td-link-icon' title='' rel='tooltip' href='javascript:void(0);' onclick=\"commitLeaderActivity('"+data.obj[i].id+"');\" data-original-title='审批'><i class='icon-pencil-5'></i><fmt:message code="event.th.Examination" /></a></td>";
                            }else{
                                str+="<td style='text-align:center;' width='8%'  ></td>";
                            }*/
                            str+="</tr>";
                            /*str+='<tr><td><a href="javascript:void(0);" class="meetingDetail"  sid="'+data[i].sid+'">'+data[i].meetName+'</a></td>'+'<td>'+data[i].userName+'</td>'+'<td>'+data[i].startTime+'</td>'+
                             '<td>'+data[i].endTime+'</td>'+'<td>'+data[i].statusName+'</td>'+'<td><a href="javascript:void(0);" class="meetRoomDetail"  meetRoomId="'+data[i].meetRoomId+'">'+data[i].meetRoomName+'</a></td></tr>';
                             */
                            /* str+='<tr>' +
                             '<td style="text-align: center" width="20%" title="'+data[i].meetName+'"><a href="javascript:void(0);" class="meetingDetail"  sid="'+data[i].sid+'">'+data[i].meetName+'</a></td>'+
                             '<td style="text-align: center" width="15%">'+data[i].userName+'</td>'+
                             '<td style="text-align: center" width="20%">'+data[i].startTime+'</td>'+
                             '<td style="text-align: center" width="20%">'+data[i].endTime+'</td>'+
                             '<td style="text-align: center" width="10%">'+data[i].statusName+'</td>'+
                             '<td style="text-align: center" width="15%"><a href="javascript:void(0);" class="meetRoomDetail"  meetRoomId="'+data[i].meetRoomId+'">'+data[i].meetRoomName+'</a></td>' +
                             '</tr>';*/
                        }
                        $("#already tbody").html(str);
                    }
                    else{
                        $("#already tbody").html("");
                        layer.msg('<fmt:message code="event.th.NoInformation" />', {icon: 6});
                    }
                }
            });
        })

        //重置按钮点击事件
        $("#clearCondition").click(function () {
            $("#meetName").val("");
            $("#startTime").val("");
            $("#endTime").val("");
        })
    })


    //点击会议名称显示会议详情
    $('.pagediv').on('click','.meetingDetail',function (event){
        $.ajax({
            url: '/meeting/queryMeetingById',
            type: 'get',
            dataType: 'json',
            data: {
                sid: $(this).attr("sid")
            },
            success: function (obj) {
                var data=obj.object;
                var str='';
                if(data.attachmentList.length>0){
                    for(var i=0;i<data.attachmentList.length;i++){
                        str+='<div style="line-height: 0;"><img style="width:16px;margin-right: 5px;" src="../img/file/cabinet@.png"/><a href="<%=basePath %>download?'+data.attachmentList[i].attUrl+'">'+data.attachmentList[i].attachName+'</a></div>'
                    }
                }else{
                    str='';
                }
                layer.open({
                    type: 1,
                    title: ['<fmt:message code="meet.th.SeeConferenceDetails" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['600px', '500px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.close" />'],
                    content:  '<div class="table"><table style="margin:auto;">' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="workflow.th.name" />：</span></td><td><span>'+data.meetName+'</span></td><tr>'+
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="email.th.main" />：</span></td><td><span>'+data.subject+'</span></td><tr>'+
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="sup.th.Applicant" />：</span></td><td><span>'+data.userName+'</span></td><tr>'+
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="meet.th.MeetingMinutesClerk" />：</span></td><td><span>'+data.recorderName+'</span></td><tr>'+
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span></td><td><span>从 &nbsp;</span><span>'+data.startTime+'</span><span>&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span><span>'+data.endTime+'</span></td><tr>' +
                    '<tr><td width="30%"><span class="span_td"><fmt:message code="meet.th.ConferenceRoom" />：</span></td><td><span>'+data.meetRoomName+'</span></td><tr>'+
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ApprovalAdministrator" />：</span></td><td><span>'+data.managerName+'</span></td><tr>'+
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.external" />：</span></td><td><span>'+data.attendeeOut+'</span></td><tr>'+
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.internal" />：</span></td><td><span>'+data.attendeeName+'</span></td><tr>'+
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceRoomEquipment" />：</span></td><td><span>'+data.equipmentNames+'</span></td><tr>'+
                    '<tr><td><span class="span_td"><fmt:message code="email.th.file" />：</span></td><td><span><div class="inPole">'+str+'</div></span></td><tr>' +
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.ConferenceDescription" />：</span></td><td><span>'+data.meetDesc+'</span></td><tr>'+
                    '<tr><td><span class="span_td"><fmt:message code="meet.th.MySignin" />：</span></td><td><span>'+data.myAttend+'</span></td><tr>'+
                    '</table></div>',
                })
            }
        })

    })

    //点击会议室名称显示会议室详情
    $('.pagediv').on('click','.meetRoomDetail',function (event){
        $.ajax({
            url: '/meetingRoom/getMeetRoomBySid',
            type: 'get',
            dataType: 'json',
            data: {
                sid: $(this).attr("meetRoomId")
            },
            success: function (obj) {
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
            }
        })
    })




    $(function(){
        $(".pagediv").on('mouseover','.QRCode',function(){
            var temp=$(this).attr('num');
            console.log("aa0"+temp)
            $(".showQRCode").html('')
            $($(".showQRCode")[temp]).qrcode({
                render: "canvas",
                width: 100,
                height:100,/*"<%=basePath%>/meeting/MeetingAttend"*/
                text:'http://192.168.0.78:8080/meeting/MeetingAttend?meetingId='+$(this).attr('sid')
            });
        })

        $(".pagediv").on('mouseout','.QRCode',function(){
            var temp=$(this).attr('num');
            $(".showQRCode").html('');
            /* $(this).next().hide()*/
        })
    })

    $('#newActivity').click(function(){
       /* dayClick:function(date, allDay, jsEvent, view){*/
            var timestamp = Date.parse(new Date());
            var timer=parseInt(timestamp)+7200000;
            var startTime=new Date(timestamp).Format('hh:mm:ss');
            var endTime=new Date(timer).Format('hh:mm:ss');
            layer.open({
                type: 1,
                title: ['<fmt:message code="event.th.NewLeadershipActivities" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '500px'],
                offset: ['30px', '200px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="">' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="event.th.ActiveName" />：</span>' +
                '<span><input type="text" style="width: 180px;margin-left: 5px;" name="typeName" id="subject" class="inputTd meetName test_null" value="" /></span>' +
                '<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="email.th.Project" />：</span>'+
                '<span><input type="text" style="width: 180px;margin-left: 5px;" name="typeName" id="schedule_type" class="inputTd subject test_null" value="" /></span>' +
                '<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="event.th.Organizer" />：</span>' +
                '<span>' +
                '<div class="inPole">' +
                '<textarea name="txt" dataid="" class="userName test_null" id="dept_id" dept_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea>' +
                '<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
                '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span>' +
                '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearUser "><fmt:message code="global.lang.empty" /></a></span>' +
                '</div>' +
                '</span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="event.th.Leadership" />：</span>'+
                '<span>' +
                '<div class="inPole"><textarea name="txt" dataid="" class="recorderName" id="recoderDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea>' +
                '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectRecorder" class="Add "><fmt:message code="global.lang.add" /></a></span>' +
                '<span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearRecoder" class="clearRecoder "><fmt:message code="global.lang.empty" /></a></span>'+
                '</div>' +
                '</span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span>' +
                '<span><input type="text" style="width: 140px;margin-left: 5px;" name="typeName" class="inputTd startTime" id="start_time" test_null" value="" onclick="laydate(end)" /></span>' +
                '<span><fmt:message code="global.lang.to" /></span>' +
                '<span><input type="text" style="width: 140px;" name="typeName" class="endTime test_null" value="" id="end_time" onclick="laydate(end)" /></span>' +
                '<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="meet.th.ConferenceRoom" />：</span>'+
                '<span><select name="typeName" class="meetRoomId" id="meetRoomId"></select></span>' +
                '<span style="color: #FF0000;margin-left: 10px;font-size: 16px;"></span>' +
                '<span><a href="javascript:;" class="meetRoomDetail"><fmt:message code="meet.th.SeeDetails" /></a></span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="sup.th.Applicant" />：</span>' +
                '<span><select name="typeName" class="managerId test_null" id="managerId"></select></span>' +
                '<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>' +
                '</div>' +
                '<div class="div_tr">' +
                '<span class="span_td"><fmt:message code="event.th.place" />：</span><span><div class="inPole"><textarea name="attendeeOut" id="location" class="attendeeOut" value="" style="min-width: 220px;min-height:58px;"></textarea></div></span></div>' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.internal" />：</span><span><div class="inPole"><textarea name="txt" class="attendee" id="attendeeDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectAttendee" class="selectAttenddee"><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearAttendee" class="clearAttendee "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="journal.th.Remarks" />：</span><span><div class="inPole"><textarea name="meetDesc" id="remark" class="meetDesc" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>' +
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
                    var smsRemind=0;

                    if($('#smsRemind').is(':checked')){
                        smsRemind=1;
                    }
                    var sms2Remind=0;
                    if($('#sms2Remind').is(':checked')){
                        sms2Remind=1;
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


                    /*var begin_time = new Date(Date.parse($("#begin_time").val().replace(/-/g, "/")));
                    var end_time=new Date(Date.parse($("#end_time").val().replace(/-/g, "/")));*/
                    var beginTime=new Date($("#start_time").val());
                    var endTime=new Date($("#end_time").val());
                    var para={
                        subject:$("#subject").val(),
                        schedule_type:$("#schedule_type").val(),
                        undertake:$("#dept_id").val().substring(0,$("#dept_id").val().length-1),
                        leader:$("#recoderDuser").val(),
                        begin_time:beginTime.getTime(),
                        end_time:endTime.getTime(),
                        room_id:$("#meetRoomId").val(),
                        create_user:${uid},
                        location:$("#location").val(),
                        attendee:$("#attendeeDuser").val().substring(0,$("#attendeeDuser").val().length-1),
                        remark:$("#remark").val(),
                    };

                    $.ajax({
                        cache: true,
                        type: "POST",
                        url:"/leaderschedule/saveSchedule",
                        data:para,
                        datatype:"json",
                        error: function(request) {
                            alert("Connection error");
                        },
                        success: function(data) {
                            var content=data.msg;
                            if(data.flag!=false){
                                location.reload();
                                layer.close(index);
                            }
                        }
                    });


                }
            });
            //删除附件
            $('.Attachment').on('click','.deImg',function(){
                var data=$(this).parents('.dech').attr('deUrl');
                var dome=$(this).parents('.dech');
                deleteChatment(data,dome);
            })

            //添加附件
            $('#uploadimg').on('click',function(){
                $('#uploadinputimg').click();
            })
            $('#uploadinputimg').change(function(e){
                var target = $(e.target);
                var file;
                if(target[0].files && target[0].files[0]){
                    file=target[0].files[0];
                }
                if(file){
                    $.upload($('#uploadimgform'),function(res){
                        var data=res.obj;
                        var str='';
                        var str1='';
                        console.log(res);
                        for(var i=0;i<data.length;i++){
                            str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';
                            /*str1+='<input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',">';*/
                        }
                        $('.Attachment').append(str);
                    });
                }
            });

            $('#selectUser').click(function(){//选人员控件(申请人)
                user_id='userDuser';
                $.popWindow("../common/selectUser?0");
            });
        $('#selectDept').click(function(){//选人员控件(申请人)
            dept_id='dept_id';
            $.popWindow("../common/selectDept?0");
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
        $('#clearDept').click(function(){ //清空承办单位
            $('#dept_id').attr('dept_id','');
            $('#dept_id').attr('dataid','');
            $('#dept_id').val('');
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

    })
    function initManager(){

        var userId="${userId}";
                $.ajax({
            url: '/user/getUserNameById',
            type: 'get',
            dataType: 'json',
            data: {
                userIds:userId
            },
            success: function (obj) {
                var data=obj.object;
               /* var managerIdArray=data.paraValue.split(",");
                var managerNameArray=data.userName.split(",");*/
                var str="";
                str+='<option value="'+data+'">'+data+'</option>';
               /* for(var i=0;i<managerIdArray.length;i++){

                }*/
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
    function commitLeaderActivity(id){

        var id={id:id};
        $.ajax({
            type: "POST",
            url:"/leaderschedule/commitSchedule",
            data:id,// 你的formid
            datatype:"json",
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                var content=data.msg;
                if(data.flag!=false){
                    layer.msg('<fmt:message code="event.th.SubmitSuccessfully" />', {icon: 6});
                    window.location.reload();
                }
            }
        });
    }
</script>
</body>
</html>