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
    <title><fmt:message code="event.th.ApprovedApplication" /></title>
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/vehicleInfo.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
</head>
<!DOCTYPE html>
<html>
<style>
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
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleMange.png" align="absmiddle">
            <span class="big3"><fmt:message code="event.th.ApprovedApplication" /></span>
        </div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0" id="table_main">
            <thead>
            <tr>
                <th class="th"><fmt:message code="event.th.LicensePlateNumber" /></th>
                <th class="th"><fmt:message code="event.th.VehicleMan" /></th>
                <th class="th"><fmt:message code="event.th.DepartmentApprover" /></th>
                <th class="th"><fmt:message code="sup.th.startTime" /></th>
                <th class="th"><fmt:message code="meet.th.EndTime" /></th>
                <th class="th"><fmt:message code="sup.th.Applicant" /></th>
                <th class="th"><fmt:message code="menuSSetting.th.menuSetting" /></th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function(){
        $.ajax({
            url: '/veHicleUsage/GetOperator',
            type: 'get',
            dataType: 'json',
            data: {
                sign:"1"
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
                        '<td>'+arr[i].deptManagerName+'</td>'+
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
                        '<td>'+function(){
                            if(arr[i].vuProposerName!=undefined){
                                return arr[i].vuProposerName;
                            }else{
                                return "";
                            }
                        }()+'</td>'+
                        '<td>'+
                        ' <a href="javascript:;" class="details" onclick="detail('+arr[i].vuId+');">'+"<fmt:message code="hr.th.detailedInformation" />"+'</a>'+
                        '<a href="../../veHicle/vehicleUseApply?editFlag=1&sign=2&vuId='+arr[i].vuId+'"><fmt:message code="depatement.th.modify" /></a>' +
                        ' <a href="javascript:;" class="delete" onclick="delete_1('+arr[i].vuId+');">'+"<fmt:message code="global.lang.delete" />"+'</a>'
                    '</td>'+
                    '</tr>';
                }
                $('.main table tbody').html(str)
            }
        })
    })
    function detail(e){
        $.popWindow('<%=basePath%>veHicle/veHicledetail?vuId='+e,'<fmt:message code="event.th.VehicleUsageDetails" />','100','300','1000px','700px');
    }

    function edit(e){

    }

    function delete_1(e){
        layer.confirm('<fmt:message code="sup.th.Delete" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="event.th.DeleteInformation" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'<%=basePath%>veHicleUsage/deleteVehicleUsage',
                dataType:'json',
                data:{'vuId':e},
                success:function(){
                    layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                    init()
                }
            })
        }, function(){
            layer.closeAll();
        });
    }
</script>
</html>

