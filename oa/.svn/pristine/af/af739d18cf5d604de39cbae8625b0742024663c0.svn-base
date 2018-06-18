<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <title><fmt:message code="event.th.ExaminationApproval" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css"/>
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/conmon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>


    <style>
        .big3 {
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
            font-weight: inherit;
        }
        input {
            width: auto;
            float: none;
            width: 180px;
        }
        .BigInput{
            width: 170px;
        }
        .TableBlock tr {
            height:52px;
        }
        .small tbody tr{
            border: none;
        }
        .TableBlock td.TableData{
            border: none;
        }
        .TableBlockOne .TableData input{
            height: 25px;
            width: auto;
            float: none;
        }
        .div_1{
            margin-left: 20px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

    <script type="text/javascript">
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";

$(function(){
})
    </script>

</head>


<link rel="stylesheet" type="text/css" href="/static/theme/15/bbs.css">
<script src="/static/js/module.js?v=150805"></script>

<body class="bodycolor" topmargin="5">

<div class="content" style="display: block;">
    <table border="0" width="80%" cellspacing="0" cellpadding="3" class="small">
        <tr>
            <td class="Big">
                <div class="div_1">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yinzhang.png" style="vertical-align: middle;display: inline-block;    margin-top: -10px;"><span class="big3"><fmt:message  code="event.th.ExaminationApproval"/></span>
                </div>
            </td>
        </tr>
    </table>
    <br>
    <div class="right">
        <div class="M-box3"></div>
    </div>
    <div class="divQuery">
    <table class="info">
        <form method="post" name="form1">
            <table class="TableBlock" width="450" align="center">
                <tr>
                    <th colspan="2"><fmt:message  code="event.th.TrainingPlanEnquiry"/></th>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="event.th.NameTrainingPlan" />：</td>
                    <td class="TableData">
                        <select id="planName" name="planName" style="background: white; width:170px;height: 30px;"
                                title="">
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="event.th.TrainingChannel" />：</td>
                    <td class="TableData">
                        <select name="channel" id="channel" style="background: white; width:170px;height: 30px;" title="">
                            <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                            <option value="0"><fmt:message code="event.th.InternalTraining" /></option>
                            <option value="1"><fmt:message code="event.th.Channeltraining" /></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="hr.th.Approver" />：</td>
                    <td class="TableData">
                        <input type="text" id="assessingOfficer" disabled="disabled" style="width: 165px;height:28px;background: #E0E0E0;" name="assessingOfficer" size="12" maxlength="10" class="BigOutput" value=""/>
                        <a href="javascript:;" id="userAdd_1" class="userAdd_1" ><fmt:message code="global.lang.select" /></a>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="event.th.ApprovalStatus" />：</td>
                    <td class="TableData">
                        <select name="assessingStatus" id="assessingStatus" style="background: white; width:170px;height: 30px;" title="">
                            <option value=""><fmt:message code="event.th.Plan(APPROVAL)status" /></option>
                            <option value="0"><fmt:message code="event.th.Unapproved" /></option>
                            <option value="1"><fmt:message code="event.th.HavePassed" /></option>
                            <option value="2"><fmt:message code="doc.th.Rejected" /></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="event.th.ApprovalTime" />：</td>
                    <td class="TableData">
                        <input type="text" id="startTime" name="assessingTime" style="width:160px;height:28px;" maxlength="10"
                               class="BigInput" value="" onClick="laydate(start)"/>
                        <fmt:message code="global.lang.to" /> <input type="text" id="endTime" name="CONTRACT_END_TIME2" style="width:160px;height:28px;" maxlength="10"
                                 class="BigInput" value="" onClick="laydate(end)"/>
                    </td>
                </tr>
                <tr align="center" class="TableControl">
                    <td colspan="2" style="border-top: none;">
                            <div  class="BigButton" onclick="Query()"><span style="margin-left: 23px;"><fmt:message code="global.lang.query" /></span></div>
                    </td>
                </tr>
            </table>
        </form>
    </table>
    </div>
    <div class="pagediv" style="display:none;margin: 0 auto;width: 97%;">
        <table id="tr_td">
            <thead>
            <tr>
                <td class="th" style="width:10%; text-align: center;" ><fmt:message code="event.th.TrainingPlanNumber" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.NameTrainingPlan" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.TrainingChannel" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.TrainingForm" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.PlanState" /></td>
                <td class="th notice_do" style="width:12%; text-align: center;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
</div>
</body>
<script>
var user_id;
    //获取审批人
    $('#userAdd_1').click(function(){
        user_id="assessingOfficer";
        $.popWindow("../../common/selectUser?0");
    });


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
    $(function () {
        //下拉框获取
        $.ajax({
            type:'post',
            url:'<%=basePath%>eduTrainPlan/getAllPlan',
            dataType:'json',
            success:function(result){
             var data =result.obj;
             var str="<option value=''><fmt:message code="hr.th.PleaseSelect" /></option>";
             if(data.length>0){
                 for(var i=0;i<data.length;i++){
                     str=str+ '<option value="' + data[i].planName + '">' + data[i].planName + '</option>'
                 }
             }
                $('#planName').html(str);
            }
        })




    function formatDate(now) {
        if (now != '' && now != undefined) {
            var year = now.getFullYear();
            var month = now.getMonth() + 1;
            var date = now.getDate();
            var hour = now.getHours();
            var minute = now.getMinutes();
            var second = now.getSeconds();
            return year + "-" + month + "-" + date;
        } else {
            return "";
        }
    }
    });
    function detail(e){
        $.popWindow("<%=basePath%>eduTrainPlan/goDetail?planId=" + e, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
    }

    function Query(){
    var data={
        planName:$('#planName').val(),
        channel:$('#channel').val(),
        assessingOfficer:$('#assessingOfficer').attr('user_id'),
        assessingStatus:$('#assessingStatus').val(),
        startTime:$('#startTime').val(),
        endTime:$('#endTime').val()
    }
        $.ajax({
            type:'post',
            url:'<%=basePath%>eduTrainPlan/QueryPlanStatus',
            dataType:'json',
            data:data,
            success:function(result){
                var str='';
                var arr=result.obj;
                if(arr.length>0){
                    for(var i=0;i<arr.length;i++){
                        str+='<tr>'+
                            '<td style="width: 10%;text-align:center;">'+arr[i].planNo+'</td>' +
                            '<td style="width: 10%;text-align:center;">'+arr[i].planName+'</td>' +
                            '<td style="width: 10%;text-align:center;">'+arr[i].channelName+'</td>' +
                            '<td style="width: 10%;text-align:center;">'+arr[i].courseTypesName+'</td>' +
                            '<td style="width: 10%;text-align:center;">'+arr[i].assessingStatuName+'</td>' +
                            '<td style="width: 12%;text-align:center;">' +
                            '<a href="javascript:void(0)" data-id="'+arr[i].planId+'"  onclick="detail('+arr[i].planId+');" class="deleteSc"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;&nbsp;' +
                            '</td>' +
                            '</tr>'
                    }
                    $('.pagediv table tbody').html(str);
                    $('.divQuery').css('display','none');
                    $('.pagediv').css('display','block');
                }else{
                    $.layerMsg({content:'<fmt:message code="event.th.NoCorrespondingData" />',icon:3});
                }

            }
        })
    }
</script>
</html>