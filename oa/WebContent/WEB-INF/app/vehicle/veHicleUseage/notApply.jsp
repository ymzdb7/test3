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
    <title><fmt:message code="event.th.FailingApply" /></title>
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/vehicleInfo.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>


</head>
<!DOCTYPE html>
<html>
<style>
    table tr:nth-child(even) {
        background-color: #fff;
    }
    table  tr:nth-child(odd) {
        background-color: #F6F7F9;
    }
    body{
        font-family: 微软雅黑;
        font-size: 14px;
    }
    .header{
        line-height: 60px;
    }
    .title{
        margin-left: 30px;
        height: 50px;
    }
    .big3{
        font-family: "微软雅黑";
        font-size: 22px;
        line-height: 45px;
        color: #494d59;
    }
    .main{
        margin-top: 20px;
    }
    .th {
        background-color: #fff;
        font-size:15px;
        color: #2F5C8F;
        font-weight: bold;
        border: 0px;
    }
</style>
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleApply.png" align="absmiddle">
            <span class="big3"><fmt:message code="event.th.FailingApply" /></span>
        </div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0">
            <thead>
            <tr>
                <th class="th"><fmt:message code="event.th.LicensePlateNumber" /></th>
                <th class="th"><fmt:message code="event.th.VehicleMan" /></th>
                <th class="th"><fmt:message code="event.th.Entourage" /></th>
                <th class="th"><fmt:message code="attend.th.Reason" /></th>
                <th class="th"><fmt:message code="sup.th.startTime" /></th>
                <th class="th"><fmt:message code="meet.th.EndTime" /></th>
                <th class="th"><fmt:message code="journal.th.Remarks" /></th>
                <th class="th"><fmt:message code="menuSSetting.th.menuSetting" /></th>
            </tr>
            </thead>
          <tbody></tbody>
        </table>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function(){
        $.ajax({
            url: '/veHicleUsage/selectAllVeHicle',
            type: 'get',
            dataType: 'json',
            data: {
                vuStatusName:"4"
            },
            success: function (result) {
                var str="";
                var arr =result.obj;
                for(var i=0;i<arr.length;i++){
                    str+='<tr>'+
                        '<td>'+function(){
                            if(arr[i].vIdNum!=undefined){
                                return arr[i].vIdNum;
                            }else{
                                return "该车辆已经不存在";
                            }
                        }()+'</td>'+
                        '<td>'+arr[i].vuUserName+'</td>'+
                        '<td>'+arr[i].vuSuiteName+'</td>'+
                        '<td>'+arr[i].vuReason+'</td>'+
                        '<td>'+function(){
                            if(arr[i].vuStart!=undefined){
                                return arr[i].vuStart;
                            }else{
                                return "";
                            }
                        }()+'</td>'+
                        '<td>'+function(){
                            if(arr[i].vuEnd!=undefined){
                                return arr[i].vuEnd;
                            }else{
                                return "";
                            }
                        }()+'</td>'+
                        '<td>'+arr[i].vuRemark+'</td>'+
                        '<td>'+
                        ' <a href="javascript:;" class="details" onclick="detail_1('+arr[i].vuId+');">'+"<fmt:message code="hr.th.detailedInformation" />"+'</a>'+
                        '</td>'+
                        '</tr>';
                }
                $('.main table tbody').html(str)
            }
        })



    })
    function detail_1(e){
        $.popWindow('<%=basePath%>veHicle/veHicledetail?vuId='+e,'<fmt:message code="event.th.VehicleDetails" />','100','300','1000px','700px');
    }




</script>
</html>

