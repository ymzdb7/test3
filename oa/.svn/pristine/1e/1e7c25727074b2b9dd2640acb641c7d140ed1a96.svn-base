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
    <title><fmt:message code="event.th.PendingApplication" /></title>
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/vehicleInfo.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/layer/layer.js"></script>

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
            <span class="big3"><fmt:message code="event.th.PendingApplication" /></span>
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
    <div class="main" style="display: none">
        <form name="editVehicleUseForm" id="editVehicleUseForm">
            <table border="0" cellspacing="0" cellpadding="0" style="width: 90%;">
                <tr>
                    <td><fmt:message code="event.th.LicensePlateNumber" />：</td>
                    <td colspan="3">
                        <select name="vId" id="vId"  class="BigSelect">
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.VehicleMan" />：</td>
                    <td>
                        <textarea  id="vuUser" cols="" rows=""></textarea>
                        <a href="javascript:;" id="addvuUser"><fmt:message code="notice.th.chose" /></a>
                    </td>
                    <td><fmt:message code="event.th.VehicleDepartment" />：</td>
                    <td>
                        <textarea  id="vuDept" cols="" rows=""></textarea>
                        <a href="javascript:;" id="addvuDept"><fmt:message code="notice.th.chose" /></a>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.Entourage" />：</td>
                    <td colspan="3">
                        <textarea  id="vuSuite" cols="" rows=""></textarea>
                        <a href="javascript:;" id="addvuSuite"><fmt:message code="notice.th.chose" /></a>
                        <a href="javascript:;" id="clearvuSuite"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="journal.th.StartingTime" />：</td>
                    <td><input type="text" name="vuStart" id="vuStart" style="height: 28px;width: 150px;" value="" onclick="laydate(start)"></td>
                    <td><fmt:message code="meet.th.EndTime" />：</td>
                    <td><input type="text" name="vuEnd" id="vuEnd" style="height: 28px;width: 150px;" value="" onclick="laydate(end)"></td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.Destinat" />：</td>
                    <td><input type="text" name="vuDestination" style="height: 28px; width: 150px;" id="vuDestination" value=""></td>
                    <td><fmt:message code="event.th.ApplicationMileage" />：</td>
                    <td><input type="text" name="vuMileage" style="height: 28px;width: 150px;" value="" id="vuMileage"><fmt:message code="event.th.(kilometer)" /></td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.DepartmentApprover" />：</td>
                    <td>
                        <textarea id="deptManager" cols="" rows="deptManager"></textarea>
                        <a href="javascript:;" id="adddeptManager"><fmt:message code="notice.th.chose" /></a>
                        <div class="font_text"><fmt:message code="event.th.content" /></div>
                    </td>
                    <td><fmt:message code="event.th.Dispatcher" />：</td>
                    <td>
                        <select name="vuOperator" id="vuOperator">
                        </select>
                        <%--  <span class="font_text">是否启用备选调度员</span>
                          <input type="radio" name="radio" value="">
                          <span class="font_text">是</span>
                          <input type="radio" name="radio" value="">
                          <span class="font_text">否 (注：负责审批和收回)</span>--%>
                    </td>
                </tr>
                <%--        <tr>
                            <td>在线调度人员：</td>
                            <td>
                                <textarea name="" id="" cols="" rows=""></textarea>
                                <a href="javascript:;">选择</a>
                            </td>
                            <td>备选调度员：</td>
                            <td>
                                <select name="" id="">
                                    <option value="">--请选择--</option>
                                </select>
                                <span class="font_text">(注：若调度员不在，可启用备选调度员，只负责收回)</span>
                            </td>
                        </tr>--%>
                <tr>
                    <td><fmt:message code="attend.th.Reason" />：</td>
                    <td colspan="3">
                        <textarea name="vuReason" id="vuReason" cols="" rows=""></textarea>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="journal.th.Remarks" />：</td>
                    <td colspan="3">
                        <textarea name="vuRemark" id="vuRemark" cols="" rows=""></textarea>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.AlertDispatcher" />：</td>
                    <td colspan="3">
                        <input type="checkbox">
                        <span><fmt:message code="notice.th.remindermessage" /></span>
                    </td>
                </tr>
                <%--    <tr>
                        <td>提醒备选调度员：</td>
                        <td colspan="3">
                            <input type="checkbox">
                            <span>发送事务提醒消息</span>
                        </td>
                    </tr>--%>
                <tr>
                    <td><fmt:message code="event.th.NotifyApplicant" />：</td>
                    <td colspan="3">
                        <input type="checkbox">
                        <span><fmt:message code="notice.th.remindermessage" /></span>
                    </td>
                </tr>
            </table>
        </form>
        <div class="div_btn">
            <div class="save_btn"><span><fmt:message code="global.lang.save" /></span></div>
            <div class="reset_btn"><span><fmt:message code="global.lang.refillings" /></span></div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function(){
     init();
    })

    function init(){
        $.ajax({
            url: '/veHicleUsage/GetOperator',
            type: 'get',
            dataType: 'json',
            data: {
                sign:"0"
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
                        ' <a href="javascript:;" class="approveTrue" onclick="approvetrue('+arr[i].vuId+');">'+"<fmt:message code="meet.th.Approval" />"+'</a>'+
                        ' <a href="javascript:;" class="approveTrue" onclick="approveFalse('+arr[i].vuId+');">'+"<fmt:message code="meet.th.NotApprove" />"+'</a>'+
                        '<a href="../../veHicle/vehicleUseApply?editFlag=1&sign=1&vuId='+arr[i].vuId+'"><fmt:message code="depatement.th.modify" /></a>' +
                        ' <a href="javascript:;" class="delete" onclick="delete_1('+arr[i].vuId+');">'+"<fmt:message code="global.lang.delete" />"+'</a>'
                    '</td>'+
                    '</tr>';
                }
                $('.main table tbody').html(str)
            }
        })
    }
    function detail(e){
        $.popWindow('<%=basePath%>veHicle/veHicledetail?vuId='+e,'<fmt:message code="event.th.VehicleUsageDetails" />','100','300','1000px','700px');
    }
    function approvetrue(e){
        layer.open({
            type: 1,
            title: ['<fmt:message code="event.th.DispatcherApproval" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['350px', '230px'],
            offset: ['150px', '400px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 35px;">'+
            '<div class="div_tr" style="margin-top: 10px;"><span class="span_td" style="color: #f43838;font-family:微软雅黑"><fmt:message code="event.th.ApprovalOpin" />：</span></div>'+
            '<div class="div_tr" style="margin-top: 10px;"><textarea name="txt" id="operatorReason" value="" style="min-width: 260px;min-height:80px;"></textarea></div>'+
            '</div>',
            success:function(){
            },
            yes: function (index) {
                var data = {
                    vuId:e,
                    vuStatus:1,
                    operatorReason:$('#operatorReason').val()
                }
                editstatus(data);
                layer.close(index);
            },
        });
    }
    function approveFalse(e){
        layer.open({
            type: 1,
            title: ['<fmt:message code="event.th.DispatcherApproval" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['350px', '230px'],
            offset: ['150px', '400px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 35px;">'+
            '<div class="div_tr" style="margin-top: 10px;"><span class="span_td" style="color: #f43838;font-family:微软雅黑"><fmt:message code="event.th.rejection" />：</span></div>'+
            '<div class="div_tr" style="margin-top: 10px;"><textarea name="txt" id="operatorReason" value="" style="min-width: 260px;min-height:80px;"></textarea></div>'+
            '</div>',
            success:function(){
            },
            yes: function (index) {
                var data = {
                    vuId:e,
                    vuStatus:2,
                    operatorReason:$('#operatorReason').val()
                }
                editstatus(data);
                layer.close(index);
            },
        });
    }
    function editstatus(data){
        $.ajax({
            url: "<%=basePath%>/veHicleUsage/editOperatorstatu",
            type:'get',
            dataType:"JSON",
            data : data,
            success:function(data){
                if(data.flag){
                    $.layerMsg({content:'<fmt:message code="meet.th.SuccessfulApproval" />',icon:1},function () {
                        init();
                    });

                }else{
                    $.layerMsg({content:'<fmt:message code="event.th.ApprovalFailure" />',icon:2});
                }
            }
        })

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

