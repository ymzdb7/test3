<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title><fmt:message code="hr.th.detailedInformation" /></title>
    <%--<link rel="stylesheet" type="text/css" href="../../css/vehicle/vehicleInfo.css"/>--%>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style>
        body,div,a,span,input,table,tr,td,tbody,thead{
            margin: 0;
            padding: 0;
        }
        body{
            font-family: "微软雅黑";
            font-size: 14px;
        }
        .content{
            width: 100%;
        }
        .header{
            width: 100%;
            height: 40px;
            line-height: 40px;
        }
        .header .title{
            font-size: 20px;
        }
        .main{
            width: 100%;
        }
        table{
            width: 98%;
            margin: 10px auto;
            border-collapse:collapse;
        }
        table tr{
            border: #ccc 1px solid;
        }
        table tr td{
            border-right: #ccc 1px solid;
            padding: 6px;
        }
        table tr td:first-of-type{
            width: 10%;
        }
        .div_btn{
            border-bottom: 20px;
            width: 180px;
            margin: 0 auto;
        }
        .div_btn div{
            float: left;
            width: 70px;
            height:28px;
            line-height: 28px;
            margin: 10px;
            cursor: pointer;
        }
        .save_btn{
            background: url("../img/vehicle/confirm.png") no-repeat;
        }
        .div_btn span{
            margin-left: 33px;
        }
        .reset_btn{
            background: url("../img/vehicle/icon_backing.png") no-repeat;
        }
    </style>
</head>
<!DOCTYPE html>
<html>
<body>
<div class="content">
    <div class="header">
        <div class="title"><fmt:message code="event.th.VehicleUsageDetails" /></div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td><fmt:message code="event.th.LicensePlateNumber" />：</td>
                <td><span id="vIdNum"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Driver" />：</td>
                <td><span id="vuDriverName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="sup.th.Applicant" />：</td>
                <td><span id="vuProposerName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="sup.th.ApplicationTime" />：</td>
                <td><span id="vuRequestDate"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleMan" />：</td>
                <td><span id="vuUserName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Entourage" />：</td>
                <td><span id="vuSuiteName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleDepartment" />：</td>
                <td><span id="vuDeptName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="attend.th.Reason" />：</td>
                <td><span id="vuReason"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="sup.th.startTime" />：</td>
                <td><span id="vuStart"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="meet.th.EndTime" />：</td>
                <td><span id="vuEnd"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Destinat" />：</td>
                <td><span id="vuDestination"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.ApplicationMileage" />：</td>
                <td><span id="vuMileage"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Mileage" />：</td>
                <td><span id="vuMileageTrue"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Dispatcher" />：</td>
                <td><span id="vuOperatorName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DepartmentApprover" />：</td>
                <td><span id="deptManagerName"></span></td>
            </tr>
           <%-- <tr>
                <td>当前状态：</td>
                <td><span id="vuStatusName"></span></td>
            </tr>--%>
            <tr>
                <td><fmt:message code="journal.th.Remarks" />：</td>
                <td><span id="vuRemark"></span></td>
            </tr>
        </table>
        <div class="div_btn">
            <div class="reset_btn"><span><fmt:message code="global.lang.close" /></span></div>
        </div>
    </div>
</div>
</body>
</html>
<script>
    var vuId=${vuId};

    $('.reset_btn').click(function(){
        window.close();
    })

    function useDetail(vuId) {
        $.ajax({
            url:"/veHicleUsage/getVehicleUsageDetail",
            type:'post',
            data:{
              vuId:vuId
            },
            dataType:'json',
            success:function (json) {
                var data=json.obj;
                $("#vIdNum").html(data.vIdNum);
                $("#vuDriverName").html(data.vuDriverName);
                $("#vuProposerName").html(data.vuProposerName);
                $("#vuRequestDate").html(data.vuRequestDate);
                $("#vuUserName").html(data.vuUserName);
                $("#vuSuiteName").html(data.vuSuiteName);
                $("#vuDeptName").html(data.vuDeptName);
                $("#vuReason").html(data.vuReason);
                $("#vuStart").html(data.vuStart);
                $("#vuEnd").html(data.vuEnd);
                $("#vuDestination").html(data.vuDestination);
                $("#vuMileage").html(data.vuMileage);
                $("#vuMileageTrue").html(data.vuMileageTrue);
                $("#vuOperatorName").html(data.vuOperatorName);
                $("#deptManagerName").html(data.deptManagerName);
              /*  $("#vuStatusName").html(data.vuStatusName);*/
                $("#vuRemark").html(data.vuRemark);

            }
        })
    }

    $(function () {
        useDetail(vuId);
    })
</script>
