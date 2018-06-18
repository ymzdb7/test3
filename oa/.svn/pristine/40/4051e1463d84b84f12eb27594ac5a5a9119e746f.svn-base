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
    <title><fmt:message code="event.th.VehicleDetails" /></title>
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
            width: 270px;
            margin: 0 auto;
        }
        .div_btn div{
            float: left;
            cursor: pointer;
        }
        .save_btn{
            width: 70px;
            height:28px;
            line-height: 28px;
            margin: 10px;
            background: url("../img/vehicle/confirm.png") no-repeat;
        }
        .div_btn span{
            margin-left: 33px;
        }
        .reset_btn{
            width: 70px;
            height:28px;
            line-height: 28px;
            margin: 10px;
            background: url("../img/vehicle/icon_backing.png") no-repeat;
        }
    </style>
</head>
<!DOCTYPE html>
<html>
<body>
<div class="content">
    <div class="header">
        <div class="title"><fmt:message code="event.th.VehicleDetails" /></div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td><fmt:message code="event.th.Model" />：</td>
                <td><span id="vModel"></span></td>
                <td rowspan="6"></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.LicensePlateNumber" />：</td>
                <td><span id="vNum"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.displacement" />：</td>
                <td><span id="vDisplacement"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.BodyColor" />：</td>
                <td><span id="vColor"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.SeatNumber" />：</td>
                <td><span id="vSeating"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.RearFrame6" />：</td>
                <td><span id="vFrame"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.RearFrame7" />：</td>
                <td colspan="2"><span id="vCertification"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.EngineNumber" />：</td>
                <td colspan="2"><span id="vEngineNum"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleProperty" />：</td>
                <td colspan="2"><span id="vNatureName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleType" />：</td>
                <td colspan="2"><span id="vTypeName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DepositoryDepartment" />：</td>
                <td colspan="2"><span id="vDepartName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.CustodialTel" />：</td>
                <td colspan="2"><span id="vDepartPhone"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.OwnerVehicle" />：</td>
                <td colspan="2"><span id="oOnwerName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.carPhone" />：</td>
                <td colspan="2"><span id="vOnwerPhone"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.LongTermUser" />：</td>
                <td colspan="2"><span id="vCaruserName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.LongPhone" />：</td>
                <td colspan="2"><span id="vCaruserPhone"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Driver" />：</td>
                <td colspan="2"><span id="vDriverName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DriverPhone" />：</td>
                <td colspan="2"><span id="vPhoneNo"></span></td>
            </tr>

            <tr>
                <td><fmt:message code="event.th.PurchaseDate" />：</td>
                <td colspan="2"><span id="vDate"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.InitialMileage" />：</td>
                <td colspan="2"><span id="vPrice"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.PurchasePrice" />：</td>
                <td colspan="2"><span id="vMileage"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="evvent.th.PurchasePrice" />：</td>
                <td colspan="2"><span id="vTax"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.FinancialBorrowing" />：</td>
                <td colspan="2"><span id="vPay"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.AnnualInspectionDate" />：</td>
                <td colspan="2"><span id="vMot"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DateInsurance" />：</td>
                <td colspan="2"><span id="vInsure"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.BusinessInsuranceDate" />：</td>
                <td colspan="2"><span id="vBinsure"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.BookingCondition" />：</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Application(Department)" />：</td>
                <td colspan="2"><span id="deptRangeName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Application(personnel)" />：</td>
                <td colspan="2"><span id="userRangeName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.currentState" />：</td>
                <td colspan="2"><span id="vStatusName"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Vehicl" />：</td>
                <td colspan="2"><span id="vRecord"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.RecordsBorrowingReturning" />：</td>
                <td colspan="2"><span id="vBackrecord"></span></td>
            </tr>
            <tr>
                <td><fmt:message code="journal.th.Remarks" />：</td>
                <td colspan="2"><span id="vRemark"></span></td>
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
    var vId=${vId};


    $('.reset_btn').click(function(){
        window.close();
    })


    function useDetail(vId) {
        $.ajax({
            url:"/veHicle/getDetailVeHicle",
            type:'post',
            data:{
                vId:vId
            },
            dataType:'json',
            success:function (json) {
                var data=json.obj;
                $("#vModel").html(data.vModel);
                $("#vNum").html(data.vNum);
                $("#vDisplacement").html(data.vDisplacement);
                $("#vColor").html(data.vColor);
                $("#vSeating").html(data.vSeating);
                $("#vFrame").html(data.vFrame);
                $("#vCertification").html(data.vCertification);
                $("#vEngineNum").html(data.vEngineNum);
                $("#vNatureName").html(data.vNatureName);
                $("#vTypeName").html(data.vTypeName);
                $("#vDepartName").html(data.vDepartName);
                $("#vDepartPhone").html(data.vDepartPhone);
                $("#oOnwerName").html(data.oOnwerName);
                $("#vOnwerPhone").html(data.vOnwerPhone);
                $("#vCaruserName").html(data.vCaruserName);
                $("#vCaruserPhone").html(data.vCaruserPhone);
                $("#vDriverName").html(data.vDriverName);
                $("#vPhoneNo").html(data.vPhoneNo);
                $("#vDate").html(data.vDate);
                $("#vPrice").html(data.vPrice);
                $("#vMileage").html(data.vMileage);
                $("#vTax").html(data.vTax);
                $("#vNum").html(data.vNum);
                $("#vPay").html(data.vPay);
                $("#vMot").html(data.vMot);
                $("#vInsure").html(data.vInsure);
                $("#vBinsure").html(data.vBinsure);
                $("#deptRangeName").html(data.deptRangeName);
                $("#userRangeName").html(data.userRangeName);
                $("#vStatusName").html(data.vStatusName);
                $("#vRecord").html(data.vRecord);
                $("#vBackrecord").html(data.vBackrecord);
                $("#vRemark").html(data.vRemark);
            }
        })
    }

    $(function () {
        useDetail(vId);
    })
</script>