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
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title><fmt:message code="meet.th.ConferenceApplication" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
    .header {
    font-weight: bold;
    margin: 10px;
        font-size: 20px;
    }

    .main {
    width: 50%;
    margin: 0 auto;
    background-color: #fff;
    }

    .main .box {
    width: 100%;
    padding: 20px 30px;
    }
    .main .box p{
        width: 92%;
    }
    .main .box p span {
    color: rgb(42, 88, 140);
    font-weight: bold;
    }
        .header img{
            width: 20px;
            height: 20px;
            vertical-align: middle;
        }

    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="background-color:#eee;">
<div class="header">
    <img src="/img/commonTheme/theme1/icon_myMeeting.png" alt=""> 会议通知详情
</div>
<div class="main">
    <div class="box">

    </div>
</div>
</body>

</html>
<script>
    $(function () {
        var nid = $.getQueryString('meetingId');
        $.ajax({
            type: "post",
            url: "/meeting/queryMeetingById",
            dataType: 'json',
            data: {sid:nid},
            success: function (res) {
                var data = res.object;
              var p='<p><span>名称：</span>'+data.meetName+'</p>'+
                  '<p><span>主题：</span>'+data.subject+'</p>'+
                '<p><span>申请人：</span>'+data.userName+'</p>'+
                  '<p><span>会议要员：</span>'+data.recorderName+'</p>'+
                  '<p><span>申请时间：</span>从 '+data.startTime+' 至 '+data.endTime+'</p>'+
                  '<p><span>会议室：</span>'+data.meetRoomName+'</p>'+
                  '<p><span>审批管理员：</span>'+data.managerName+'</p>'+
                  '<p><span>出席人员（外部）：</span>'+data.attendeeOut+'</p>'+
                  '<p><span>出席人员（内部）：</span>'+data.attendeeName+'</p>'+
                  '<p><span>会议室设备：</span>'+data.equipmentNames+'</p>'+
                  '<p><span>附件：</span>'+data.attachmentName+'</p>'+
                  '<p><span>会议描述：</span>'+data.meetDesc+'</p>'
                   $('.box').html(p);
            }
        })


    })
</script>