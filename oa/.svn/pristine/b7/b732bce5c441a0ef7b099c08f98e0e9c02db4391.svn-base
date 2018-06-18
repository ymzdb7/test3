<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<head>
    <title><fmt:message code="file.th.reminder" /></title>

    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>

    <style>
        html,body{
            height:100%;
            margin: 0px;
            font-family: "微软雅黑";
            color: #666;
        }
        .head{
            border-bottom: 1px solid #9E9E9E;
            height: 43px;
        }
        .head div{
            float: left;
        }
        .content {
            min-width: 988px;
            height:94%;
        }

        .content .left {
            width: 250px;
            float: left;
            height: 100%;
            overflow-y: auto;
            overflow-x: hidden;
            border-right: #ccc 1px solid;
            margin-left: -135px;
        }

        .content .left .collect {
            width: 100%;
        }

        .content .left .collect div {
            width: 100%;
            overflow: hidden;
        }

        .content .left .collect span {
            display: block;
            width: 90%;
            padding-left: 10%;
            font-size: 14px;
            height: 40px;
            line-height: 40px;
            border-bottom: #ddd 1px solid;
            cursor: pointer;
        }

        .content .right {
            font-size: 14px;
            overflow-y: auto;
        }

        #smsIframe {
            width: 100%;
        }

        .div_p {
            float: left;
            height: 45px;
            line-height: 45px;
            font-size: 22px;
            margin-left: 10px;
            color: #494d59;
        }

        .collect div{
            background: url(../../img/sys/icon_rightarrow_03.png) no-repeat 95% center;
        }

    </style>

</head>
<body>
<div class="head">
    <div class="div_img" style="margin-top: 10px;margin-left: 16px">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_alart_03.png">
    </div>
    <div class="div_p">
        <fmt:message code="file.th.reminder" />
    </div>
</div>
<div class="content">
    <div class="left">
        <div class="collect">
            <div>
                <span class="unconfirmedSms add_back"><fmt:message code="sms.th.UnconfirmedReminders" /></span>
            </div>
            <div>
                <span class="receivedSms"><fmt:message code="sms.th.ReceivedReminder" /></span>
            </div>
            <div>
                <span class="sentSms"><fmt:message code="sms.th.SendReminders" /></span>
            </div>
            <div>
                <span class="querySms"><fmt:message code="sms.th.ReminderQuery" /></span>
            </div>
        </div>
    </div>
    <div class="right">
        <iframe id="smsIframe" src="../sms/unconfirmedSmsPage" frameborder="0" style="height:520px"></iframe>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        // 跳转到未确认提醒
        $('.unconfirmedSms').click(function () {
            $("#smsIframe").attr("src", "../sms/unconfirmedSmsPage");
        });
        // 跳转到已接收提醒
        $('.receivedSms').click(function () {
            $("#smsIframe").attr("src", "../sms/receivedSmsPage");
        });
        // 跳转到提醒查询
        $('.sentSms').click(function () {
            $("#smsIframe").attr("src", "../sms/sentSmsPage");
        });
        // 跳转到查询提醒
        $('.querySms').click(function () {
            $("#smsIframe").attr("src", "../sms/querySmsPage");
        });

//        $("#smsIframe").load(function () {
//            var mainheight = $(this).contents().find("body").height()+100;
//            if(mainheight<350){
//                mainheight = 520;
//            }
//            if(mainheight>=600){
//                mainheight = 520;
//            }
//            $(this).height(mainheight);
//        });

    });
</script>
</body>
</html>
