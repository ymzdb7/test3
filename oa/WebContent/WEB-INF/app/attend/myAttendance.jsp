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
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="attend.th.MyAttendance" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.print.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../css/attend/myAttendance.css"/>
    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/moment.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/fullcalendar.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/jquery-ui.custom.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/zh-cn.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery/jquery.cookie.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/attend/myAttendance.js" type="text/javascript" charset="utf-8"></script>

    <style>
        .fc-event{
            border: none;
            background-color: #fff;
        }
        .fc-event-inner img{
            vertical-align: middle;
            margin-right: 5px;
        }
        .fc-event-inner {
            width: 96%;
            overflow: hidden;
            margin: 0 auto;
        }
        .inp{
            width: 214px;
            height: 26px;
            border-radius: 4px;
            border: 1px solid #ccc;
            font-size: 12px;
            margin: 0;
            font-family: "微软雅黑";
        }
        .next{
            width: 40px;
        }
        table{
            table-layout: fixed;
        }
        table tr td{
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .head .one{
            -webkit-border-radius:20px;
            -moz-border-radius:20px;
            border-radius:20px;
            behavior: url(ie-css3.htc);
            position:relative;
            z-index: 100;
        }
        .table tr td{
            font-size:14px;
            height:30px;
            line-height:30px;
        }
        .title .div_Img{
            margin-left:22px;
        }
        .newLeave{
            margin-right:3%;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="content">
    <div class="head w clearfix">
        <ul class="index_head">
            <li id="survey"><span class="one headli"><fmt:message code="attend.th.WorkAttendance" /></span><img src="../img/twoth.png" alt=""/></li>
            <li id="DATA" ><span class="headli"><fmt:message code="attend.th.leave" /></span><img src="../img/twoth.png" alt=""/></li>
            <li id="statistics"><span class="headli"><fmt:message code="attend.th.goOut" /></span><img src="../img/twoth.png" alt=""/></li>
            <li id="administration"><span class="headli" ><fmt:message code="attend.th.ATravel" /></span></li>
        </ul>
    </div><!--标题导航结束-->
    <div class="main">
        <%--上下班考勤--%>
        <div class="commuting" style="display: block;">
            <div class="attendTime" style="display: block;">
                <div class="title">
                    <div class="div_Img">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_logProfile.png" style="vertical-align: middle;" alt="<fmt:message code="journal.th.MenuMain" />">
                    </div>
                    <div class="new"><fmt:message code="attend.th.WorkAttendance" /></div>
                    <div class="div_time">
                        <img id="leftArrow" src="../img/attend/icon_forword_18.png" class="fc-icon fc-icon-left-single-arrow" style="vertical-align: middle;margin-right: 15px;" alt="">
                        <select name="year" id="years"  onchange="changeDate()">
                            <option value="2011">2011</option>
                            <option value="2012">2012</option>
                            <option value="2013">2013</option>
                            <option value="2014">2014</option>
                            <option value="2015">2015</option>
                            <option value="2016">2016</option>
                            <option value="2017">2017</option>
                            <option value="2018">2018</option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                        </select>
                        <select name="month" id="month" onchange="changeDate()">
                            <option value="01">01</option>
                            <option value="02">02</option>
                            <option value="03">03</option>
                            <option value="04">04</option>
                            <option value="05">05</option>
                            <option value="06">06</option>
                            <option value="07">07</option>
                            <option value="08">08</option>
                            <option value="09">09</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                        </select>
                        <img id="rightArrow" src="../img/attend/icon_behand_18.png" class="fc-icon fc-icon-right-single-arrow" style="vertical-align: middle;margin-left: 15px;" alt="">
                    </div>
                    <div class="switchBtn">
                        <ul>
                            <li class="dataWeek on"><fmt:message code="attend.th.calendar" /></li>
                            <li id="dataList"><fmt:message code="attend.th.list" /></li>
                        </ul>
                    </div>
                </div>
                <div class="mainList">
                </div>
            </div>
            <div class="attendList" style="display: none;">
                <div class="title">
                    <div class="div_Img">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_logProfile.png" style="vertical-align: middle;" alt="<fmt:message code="journal.th.MenuMain" />">
                    </div>
                    <div class="new"><fmt:message code="attend.th.WorkAttendance" /></div>
                  <%--  <div class="div_time" style="margin-left: 36%">
                        <span>2017年07月</span>
                    </div>--%>

                    <div class="div_time">
                        <img id="leftArrow1" src="../img/attend/icon_forword_18.png" class="fc-icon fc-icon-left-single-arrow" style="vertical-align: middle;margin-right: 15px;" alt="">
                        <select name="year" id="years1" onchange="changeDate1()">
                            <option value="2011">2011</option>
                            <option value="2012">2012</option>
                            <option value="2013">2013</option>
                            <option value="2014">2014</option>
                            <option value="2015">2015</option>
                            <option value="2016">2016</option>
                            <option value="2017">2017</option>
                            <option value="2018">2018</option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                        </select>
                        <select name="month" id="month1" onchange="changeDate1()">
                            <option value="01">01</option>
                            <option value="02">02</option>
                            <option value="03">03</option>
                            <option value="04">04</option>
                            <option value="05">05</option>
                            <option value="06">06</option>
                            <option value="07">07</option>
                            <option value="08">08</option>
                            <option value="09">09</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                        </select>
                        <img id="rightArrow1" src="../img/attend/icon_behand_18.png" class="fc-icon fc-icon-right-single-arrow" style="vertical-align: middle;margin-left: 15px;" alt="">
                    </div>
                    <div class="switchBtn">
                        <ul>
                            <li id="dataWeek" class="dataWeek"><fmt:message code="attend.th.calendar" /></li>
                            <li class="dataList on"><fmt:message code="attend.th.list" /></li>
                        </ul>
                    </div>
                </div>
                <div class="table">
                    <table cellspacing="0" cellpadding="0" style="border-collapse:collapse;width:96%;margin:10px auto;">
                        <tr class="surverData">
                            <th width="15%"><fmt:message code="attend.rh.SignDate" /></th>
                            <th width="10%"><fmt:message code="attend.th.SignType" /></th>
                            <th width="15%"><fmt:message code="attend.th.CheckTime" /></th>
                            <th width="50%"><fmt:message code="attent.th.SignPlace" /></th>
                            <th width="10%"><fmt:message code="journal.th.Remarks" /></th>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <%--请假--%>
        <div class="leave" style="display: none;">
            <div class="leaveList">
                <div class="title">
                    <div class="div_Img">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_logProfile.png" style="vertical-align: middle;" alt="<fmt:message code="journal.th.MenuMain" />">
                    </div>
                    <div class="new"><fmt:message code="attend.th.leave" /></div>
                    <%--<div class="div_time" style="margin-left: 36%">--%>
                        <%--<span>2017年07月</span>--%>
                    <%--</div>--%>
                    <div class="newLeave" id="newLeave"><span style="margin-left: 26px;"><img style="margin-right: 4px;margin-left: -16px;margin-bottom: 2px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="attend.tn.NewLeave" /></span></div>
                </div>
                <div class="table">
                    <table cellspacing="0" cellpadding="0" style="border-collapse:collapse;width:96%;margin:10px auto;">
                        <tr class="leaveData">
                            <th width="5%"><fmt:message code="hr.th.LeaveNumber" /></th>
                            <th width="10%"><fmt:message code="sup.th.Applicant" /></th>
                            <th width="10%"><fmt:message code="hr.th.department" /></th>
                            <th width="10%"><fmt:message code="sup.th.startTime" /></th>
                            <th width="10%"><fmt:message code="meet.th.EndTime" /></th>
                            <th width="7%"><fmt:message code="attend.th.Total" /></th>
                            <th width="8%"><fmt:message code="attend.th.Reason" /></th>
                            <th width="10%"><fmt:message code="hr.th.Approver" /></th>
                            <th width="5%"><fmt:message code="notice.th.state" /></th>
                            <th width="10%"><fmt:message code="notice.th.operation" /></th>
                        </tr>
                    </table>
                </div>
                <div class="div_page">
                    <div class="M-box3" id="outLeave">
                    </div>
                </div>
            </div>
        </div>
        <%--外出--%>
        <div class="goOut" style="display: none;">
            <div class="leaveList">
                <div class="title">
                    <div class="div_Img">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_logProfile.png" style="vertical-align: middle;" alt="<fmt:message code="journal.th.MenuMain" />">
                    </div>
                    <div class="new"><fmt:message code="attend.th.goOut" /></div>
                    <%--<div class="div_time" style="margin-left: 36%">--%>
                    <%--<span>2017年07月</span>--%>
                    <%--</div>--%>
                    <div class="newLeave" id="goOutData"><span style="margin-left: 26px;"><img style="margin-right: 4px;margin-left: -16px;margin-bottom: 2px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="attend.th.NewGoOut" /></span></div>
                </div>
                <div class="table">
                    <table cellspacing="0" cellpadding="0" style="border-collapse:collapse;width:96%;margin:10px auto;">
                        <tr class="goOutData">
                            <th width="5%"><fmt:message code="attend.th.OutgoingNumber" /></th>
                            <th width="10%"><fmt:message code="sup.th.Applicant" /></th>
                            <th width="10%"><fmt:message code="hr.th.department" /></th>
                            <th width="10%"><fmt:message code="sup.th.startTime" /></th>
                            <th width="10%"><fmt:message code="meet.th.EndTime" /></th>
                            <th width="7%"><fmt:message code="attend.th.Total" /></th>
                            <th width="10%"><fmt:message code="attend.th.Reason" /></th>
                            <th width="5%"><fmt:message code="hr.th.Approver" /></th>
                            <th width="5%"><fmt:message code="notice.th.state" /></th>
                            <th width="8%"><fmt:message code="notice.th.operation" /></th>
                        </tr>
                    </table>
                </div>
                <div class="div_page">
                    <div class="M-box3" id="outUser">
                    </div>
                </div>
            </div>
        </div>
        <%--出差--%>
        <div class="busTravel" style="display: none;">
            <div class="leaveList">
                <div class="title">
                    <div class="div_Img">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_logProfile.png" style="vertical-align: middle;" alt="<fmt:message code="journal.th.MenuMain" />">
                    </div>
                    <div class="new"><fmt:message code="attend.th.ATravel" /></div>
                    <%--<div class="div_time" style="margin-left: 36%">--%>
                    <%--<span>2017年07月</span>--%>
                    <%--</div>--%>
                    <div class="newLeave" id="busTravelData"><span style="margin-left: 26px;"><img style="margin-right: 4px;margin-left: -16px;margin-bottom: 2px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="attend.th.NewTravel" /></span></div>
                </div>
                <div class="table">
                    <table cellspacing="0" cellpadding="0" style="border-collapse:collapse;width:96%;margin:10px auto;">
                        <tr class="busTravelData">
                            <th width="5%"><fmt:message code="attend.th.TravelNumber" /></th>
                            <th width="10%"><fmt:message code="sup.th.Applicant" /></th>
                            <th width="10%"><fmt:message code="hr.th.department" /></th>
                            <th width="10%"><fmt:message code="sup.th.startTime" /></th>
                            <th width="10%"><fmt:message code="meet.th.EndTime" /></th>
                            <th width="7%"><fmt:message code="attend.th.Total" /></th>
                            <th width="10%"><fmt:message code="attend.th.Reason" /></th>
                            <th width="5%"><fmt:message code="hr.th.Approver" /></th>
                            <th width="5%"><fmt:message code="notice.th.state" /></th>
                            <th width="5%"><fmt:message code="notice.th.operation" /></th>
                        </tr>
                    </table>
                </div>
                <div class="div_page">
                    <div class="M-box3" id="outTravel">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>

    function runWorkListPage() {
//        leaveDataList();
        ajaxPageLe.page();

    }
    //请假列表
//    function leaveDataList(){
//        $('.leaveData').siblings().remove();
//        layer.load()
//        $.ajax({
//            type:'get',
//            url:'../attendLeave/queryAllAttendLeave',
//            dataType:'json',
//            success:function(res){
//                var data=res.obj;
//                var str='';
//                for(var i=0;i<data.length;i++){
//                    str+='<tr>' +
//                        '<td>'+data[i].userName+'</td>' +
//                        '<td>'+data[i].deptName+'</td>' +
//                        '<td>'+data[i].leaveId+'</td>' +
//                        '<td>'+data[i].beginDate+'</td>' +
//                        '<td>'+data[i].endDate+'</td>' +
//                        '<td>'+data[i].leaveTime+'</td>' +
//                        '<td>'+data[i].leaveType+'</td>' +
//                        '<td>'+data[i].leaderId+'</td>' +
//                        '<td>'+data[i].allow+'</td></tr>';
//                }
//                $('.leaveData').after(str);
//                layer.closeAll();
//            }
//        })
//    }

    //请假列表带分页
    var ajaxPageLe={
        data:{
            page:1,//当前处于第几页
            pageSize:10,//一页显示几条
            useFlag:true,
            // computationNumber:null
        },
        page:function () {
            $('.leaveData').siblings().remove();
            var me=this;
            $.ajax({
                type:'get',
                url:'../attendLeave/queryAllAttendLeave',
                dataType:'json',
                data:me.data,
                success:function(res){
                    var data=res.obj;
                    var str='';
                    for(var i=0;i<data.length;i++){
                        str+='<tr>'
                        if(data[i].leaveId){
                            str+='<td>'+data[i].leaveId+'</td>';
                        }else{
                            str+='<td></td>';
                        }
                       str+= '<td>'+data[i].userName+'</td>' +
                        '<td>'+data[i].deptName+'</td>';

                        str+='<td>'+data[i].beginDate+'</td>' +
                        '<td>'+data[i].endDate+'</td>';
                        if(data[i].leaveTime){
                            str+='<td>'+data[i].leaveTime+'</td>';
                        }else{
                            str+='<td></td>';
                        }
                        if(data[i].leaveTime){
                            str+='<td>'+data[i].leaveType+'</td>';
                        }else{
                            str+='<td></td>';
                        }
                        str+='<td>'+data[i].leaderId+'</td>' +
                        '<td>'+data[i].allow+'</td>'+
                            '<td>'+'<a href="/workflow/work/workformPreView?flowId='+data[i].flowId+'&flowStep='+data[i].step+'&runId='+data[i].runId+'&prcsId='+data[i].realPrcsId+'" target="_blank"><fmt:message code="roleAuthorization.th.ViewDetails" /></a>'+'</td>'+
                            '</tr>';

                    }
                    $('.leaveData').after(str);
                    me.pageTwo(res.totleNum,me.data.pageSize,me.data.page)
                }
            })

        },
        pageTwo:function (totalData, pageSize,indexs) {
            var mes=this;
            $('#outLeave').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:indexs||1,
                callback: function (index) {
                    mes.data.page=index.getCurrent();
                    mes.page();
                }
            });
        }
    }
</script>
</body>
</html>
