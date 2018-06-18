<%--
  Created by IntelliJ IDEA.
  User: 牛江丽
  Date: 2017/9/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title><fmt:message code="event.th.VehicleUsag" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">

    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <!-- word文本编辑器 -->
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/js/jquery.cookie.js"></script>
</head>
<style>
    .navigation{
        margin-left: 3%;
    }
    .del_btn {
        color: #E01919;
        cursor: pointer;
    }
    .edit_btn {
        color: #1772C0;
        cursor: pointer;
    }
    #tr_td td{
        text-align: center;
    }
    .btn{
        color: #1772C0;
        cursor: pointer;
    }

    .span_td {
        display: inline-block;
        width: 150px;
        text-align: right;
    }

    .div_tr {
        margin: 10px;
    }
    .div_tr input {
        float: none;
        height: 28px;
        border-width: 1px;
        border-style: solid;
        border-color: rgb(153, 153, 153);
        border-image: initial;
    }
    .inPole textarea {
        vertical-align: middle;
        margin-left: 150px;
        margin-top: -19px;
        border-width: 1px;
        border-style: solid;
        border-color: rgb(153, 153, 153);
        border-image: initial;
    }
    a{
        text-decoration: none;
        color: #0066cc;
        margin: 0 5px;
    }
</style>



<body style="font-family: 微软雅黑;">
<div>
    <div class="navigation  clearfix">
        <div class="left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vehicleQuery.png">
            <div class="news">
                <fmt:message code="event.th.PendingApplication" />
            </div>
        </div>
    </div>

    <div>
        <table id="tr_td" style="margin-left: 1%;width: 98%;" >
            <thead>
            <tr>
                <th class="th"><fmt:message code="event.th.LicensePlateNumber" /></th>
                <th class="th"><fmt:message code="event.th.VehicleMan" /></th>
                <th class="th"><fmt:message code="attend.th.Reason" /></th>
                <td class="th titleOne"><fmt:message code="event.th.Destinat" /></td>
                <th class="th"><fmt:message code="sup.th.startTime" /></th>
                <th class="th"><fmt:message code="meet.th.EndTime" /></th>
                <th class="th"><fmt:message code="journal.th.Remarks" /></th>
                <th class="th"><fmt:message code="menuSSetting.th.menuSetting" /></th>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
</div>
</div>
</body>
</html>
<script>
    var vuStatusName=${vuStatusName}
        if(vuStatusName==0){
            $('.news').html("<fmt:message code="event.th.PendingApplication" />");
        }
        else if(vuStatusName==1){
            $('.news').html("<fmt:message code="event.th.ApprovedApplication" />");
        }
        else if(vuStatusName==2){
            $('.news').html("<fmt:message code="event.th.VehicleUse" />");
        }
        else if(vuStatusName==4){
            $('.news').html("<fmt:message code="event.th.ImperfectVehicle" />");
        }
        else if(vuStatusName==5){
            $('.news').html("<fmt:message code="event.th.UnusedVehicle" />");
        }
    function showList(vuStatusName) {
        $.ajax({
            url: '/veHicleUsage/selectAllVeHicle',
            type: 'get',
            data: {
                vuStatusName: vuStatusName
            },
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                var str="";
                if(obj.flag) {
                    for (var i = 0; i < data.length; i++) {
                        var cp = data[i].vIdNum||'';
                        str += '<tr>' +
                            '<td><a class="detail_btn" vId="'+data[i].vId+'">' + cp + '</a></td>' +
                            '<td>' + data[i].vuUserName + '</td>' +
                            '<td>' + data[i].vuReason + '</td>' +
                            '<td>' + data[i].vuDestination + '</td>' +
                            '<td>'+function(){
                                if(data[i].vuStart!=undefined){
                                    return data[i].vuStart;
                                }else{
                                    return "";
                                }
                            }()+'</td>'+
                            '<td>'+function(){
                                if(data[i].vuEnd!=undefined){
                                    return data[i].vuEnd;
                                }else{
                                    return "";
                                }
                            }()+'</td>'+
                            '<td>' + data[i].vuRemark + '</td>' +
                            '<td><a class="useDetail_btn" vuId="'+data[i].vuId+'" style="cursor: pointer"><fmt:message code="hr.th.detailedInformation" /></a></td>';
                    }
                }
                $("#tr_td tbody").html(str);
            }
        })
    }

    $(function () {
        showList(vuStatusName);
    })

    //详细信息按钮
    $('#tr_td').on('click','.useDetail_btn',function(){
        $.popWindow('<%=basePath%>veHicle/veHicledetail?vuId='+$(this).attr("vuId"),'<fmt:message code="event.th.VehicleUsageDetails" />','100','300','1000px','700px');
    })

    //点击车牌号显示车辆详细信息
    $('#tr_td').on('click','.detail_btn',function(){
        $.popWindow('<%=basePath%>veHicle/veDetail?vId='+$(this).attr("vId"),'<fmt:message code="event.th.VehicleDetails" />','100','300','1000px','700px');
    })

</script>
