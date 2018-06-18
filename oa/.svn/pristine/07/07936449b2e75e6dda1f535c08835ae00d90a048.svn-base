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
<head>
    <meta charset="UTF-8">
    <title><fmt:message  code="event.th.ApplyVehicles"/></title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/addVehicle.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <style>
        table tr td:nth-child(odd){
            width: 11%;
        }
        .font_text{
            font-size: 12px;
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
    </style>
</head>
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleApply.png" align="absmiddle">
            <span class="big3"><fmt:message  code="event.th.ApplyVehicles"/></span>
        </div>
    </div>
    <div class="main">
        <form name="editVehicleUseForm" id="editVehicleUseForm">
            <input type="hidden" id="vuId">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 90%;">
            <tr>
                <td><fmt:message  code="event.th.LicensePlateNumber"/>：</td>
                <td colspan="3">
                    <select name="vId" id="vId"  class="BigSelect">
                    </select><span style="color: red;">&nbsp;*&nbsp;&nbsp;<fmt:message  code="event.th.(required)"/></span>
                </td>
            </tr>
            <tr>
                <td><fmt:message  code="event.th.VehicleMan"/>：</td>
                <td>
                    <textarea  id="vuUser" cols="" rows=""></textarea>
                    <a href="javascript:;" id="addvuUser"><fmt:message  code="global.lang.select"/></a>
                </td>
                <td><fmt:message  code="event.th.VehicleDepartment"/>：</td>
                <td>
                    <textarea  id="vuDept" cols="" rows=""></textarea>
                    <a href="javascript:;" id="addvuDept"><fmt:message  code="global.lang.select"/></a>
                </td>
            </tr>
            <tr>
                <td><fmt:message  code="event.th.Entourage"/>：</td>
                <td colspan="3">
                    <textarea  id="vuSuite" cols="" rows=""></textarea>
                    <a href="javascript:;" id="addvuSuite"><fmt:message  code="global.lang.select"/></a>
                    <a href="javascript:;" id="clearvuSuite"><fmt:message  code="global.lang.empty"/></a>
                </td>
            </tr>
            <tr>
                <td><fmt:message  code="journal.th.StartingTime"/>：</td>
                <td><input type="text" name="vuStart" id="vuStart" style="height: 28px;width: 150px;" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"><span style="color: red;">&nbsp;*</span></td>
                <td><fmt:message  code="meet.th.EndTime"/>：</td>
                <td><input type="text" name="vuEnd" id="vuEnd" style="height: 28px;width: 150px;" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"><span style="color: red;">&nbsp;*</span></td>
            </tr>
            <tr>
                <td><fmt:message  code="event.th.Destinat"/>：</td>
                <td><input type="text" name="vuDestination" style="height: 28px; width: 150px;" id="vuDestination" value=""><span style="color: red;">&nbsp;*</span></td>
                <td><fmt:message  code="event.th.ApplicationMileage"/>：</td>
                <td><input type="text" name="vuMileage" style="height: 28px;width: 150px;" value="" id="vuMileage" onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" onblur="this.v();"><fmt:message  code="event.th.(kilometer)"/></td>
            </tr>
            <tr>
                <td><fmt:message  code="event.th.DepartmentApprover"/>：</td>
                <td>
                    <textarea id="deptManager" cols="" rows="deptManager"></textarea>
                    <a href="javascript:;" id="adddeptManager"><fmt:message  code="global.lang.select"/></a>
                    <div class="font_text"><fmt:message  code="event.th.content"/></div>
                </td>
                <td><fmt:message  code="event.th.Dispatcher"/>：</td>
                <td>
                    <select name="vuOperator" id="vuOperator">
                    </select><span style="color: red;">&nbsp;*</span>
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
                <td><fmt:message  code="attend.th.Reason"/>：</td>
                <td colspan="3">
                    <textarea name="vuReason" id="vuReason" cols="" rows=""></textarea>
                </td>
            </tr>
            <tr>
                <td><fmt:message  code="journal.th.Remarks"/>：</td>
                <td colspan="3">
                    <textarea name="vuRemark" id="vuRemark" cols="" rows=""></textarea>
                </td>
            </tr>
            <tr>
                <td><fmt:message  code="event.th.AlertDispatcher"/>：</td>
                <td colspan="3">
                    <input type="checkbox">
                    <span><fmt:message  code="notice.th.remindermessage"/></span>
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
                <td><fmt:message  code="event.th.NotifyApplicant"/>：</td>
                <td colspan="3">
                    <input type="checkbox">
                    <span><fmt:message  code="notice.th.remindermessage"/></span>
                </td>
            </tr>
        </table>
        </form>
        <div class="div_btn">
            <div class="save_btn"><span><fmt:message  code="global.lang.save"/></span></div>
            <div class="reset_btn"><span><fmt:message  code="global.lang.refillings"/></span></div>
        </div>
    </div>
</div>
</body>

<script type="text/javascript">
    var editFlag=${editFlag};
    var sign=${sign};
var user_id="";
var dept_id="";

    var start = {
        format: 'YYYY-MM-DD hh:mm',
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
        format: 'YYYY-MM-DD hh:mm',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    //用车人
    $('#addvuUser').click(function(){
        user_id="vuUser";
        $.popWindow("../../common/selectUser?0");
    });
    //部门审批人
    $('#adddeptManager').click(function(){
        user_id="deptManager";
        $.popWindow("../../common/selectUser?0");
    });
    //用车部门
    $('#addvuDept').click(function(){
        dept_id="vuDept";
        $.popWindow("../../common/selectDept?0");
    });
    //随行人员
    $('#addvuSuite').click(function(){
        user_id="vuSuite";
        $.popWindow("../../common/selectUser");
    });
    // 随行人员清空
    $('#clearvuSuite').click(function(){
        $('#vuSuite').attr("deptid","");
        $('#vuSuite').attr("user_id","");
        $('#vuSuite').val("");
    });

function initManager(){
    $.ajax({
        url: '/syspara/getOperator',
        type: 'get',
        dataType: 'json',
        data: {
            paraName:"OPERATOR_NAME"
        },
        success: function (obj) {
            var data=obj.object;
            var str="<option value=''><fmt:message  code="hr.th.PleaseSelect"/></option>";
            if(data!=null){
                for(var i=0;i<data.eduUserList.length;i++){
                    str+='<option value="'+data.eduUserList[i].userId+'">'+data.eduUserList[i].userName+'</option>';
                }
            }
            var managerNameArray=data.userName.split(",");





            $("#vuOperator").html(str);
        }
    });
}

    $(function(){
        //下拉框获取
        $.ajax({
            type:'post',
            url:'<%=basePath%>veHicle/getDropDownBox',
            dataType:'json',
            success:function(result){
                var data =result.obj;
                var str="<option value=''><fmt:message  code="hr.th.PleaseSelect"/></option>";
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        str=str+ '<option value="' + data[i].vId + '">' + data[i].vNum + '</option>'
                    }
                }
                $('#vId').html(str);
            }
        })
        initManager()
        if(editFlag==1){
            var vuId=${vuId};
            $(".title").html("<fmt:message  code="event.th.ModifyVehicle"/>");
            $.ajax({
                url: '/veHicleUsage/getVehicleUsageDetail',
                type: 'get',
                data: {
                    vuId: vuId
                },
                dataType: 'json',
                success: function (obj) {
                    var data = obj.obj;
                    if (obj.flag) {
                        $("#vuId").val(data.vuId);
                        $('#vId').val(data.vId);
                        $("#vuDept").attr("deptid",data.vuDept);
                        $("#vuDept").val(data.vuDeptName);
                        $("#vuUser").attr("user_id",data.vuUser);
                        $("#vuUser").val(data.vuUserName);
                        $("#vuSuite").attr("user_id",data.vuSuite);
                        $("#vuSuite").val(data.vuSuiteName);
                        $("#deptManager").attr("user_id",data.deptManager);
                        $("#deptManager").val(data.deptManagerName);
                        $("#vuOperator").val(data.vuOperator);
                        $("#vuStart").val(data.vuStart);
                        $("#vuEnd").val(data.vuEnd);
                        $("#vuDestination").val(data.vuDestination);
                        $("#vuMileage").val(data.vuMileage);
                        $("#vuReason").val(data.vuReason);
                        $("#vuRemark").val(data.vuRemark);
                    }
                }
            })
        }
    })


    //点击保存按钮
    $('.save_btn').click(function() {
        if (editFlag == 0) {
          /*  if ($('#vId').val() == "") {
                $.layerMsg({content: "请选择车牌号", icon: 2});
            } else {*/
          if(check()){
                $.ajax({
                    url: "/veHicle/getVeHicleStatus",
                    type: 'post',
                    dataType: 'json',
                    data: {
                        vId: $('#vId').val(),
                        vuStart: $('#vuStart').val(),
                        vuEnd: $('#vuEnd').val()
                    },
                    success: function (result) {
                        if (result.flag) {
                            $.layerMsg({content: "<fmt:message  code="event.th.When"/>", icon: 2});
                        } else {
                            $('#editVehicleUseForm').ajaxSubmit({
                                url: "/veHicleUsage/addVeHicle",
                                type: 'post',
                                dataType: 'json',
                                data: {
                                    vuDept: $("#vuDept").attr("deptid"),//用车部门
                                    vuUser: $("#vuUser").attr("user_id"),//用车人
                                    vuSuite: $("#vuSuite").attr("user_id"),//随行人员
                                    deptManager: $("#deptManager").attr("user_id"),//部门审批人
                                }, success: function (json) {
                                    if (json.flag) {
                                        $.layerMsg({content: '<fmt:message  code="url.th.addSuccess"/>！', icon: 1}, function () {
                                            window.location.href = '<%=basePath%>/veHicle/pendingApply';
                                        });
                                    } else {
                                        $.layerMsg({content: json.msg + '！', icon: 1}, function () {
                                        });
                                    }
                                }
                            })
                        }
                    }
                })
            }
        }else{
            $('#editVehicleUseForm').ajaxSubmit({
                url: "/veHicleUsage/editVehicleUsage",
                type: 'post',
                dataType: 'json',
                data: {
                    vuId:$('#vuId').val(),
                    vuDept: $("#vuDept").attr("deptid"),//用车部门
                    vuUser: $("#vuUser").attr("user_id"),//用车人
                    vuSuite: $("#vuSuite").attr("user_id"),//随行人员
                    deptManager: $("#deptManager").attr("user_id"),//部门审批人
                }, success: function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message  code="depatement.th.Modifysuccessfully"/>！', icon: 1}, function () {
                            if(sign==1){
                                window.location.href='<%=basePath%>/veHicle/operatorpendingApply';
                            }else if(sign==2){
                                window.location.href='<%=basePath%>/veHicle/operatorapprovedApply';
                            }
                            else if(sign==3){
                                window.location.href='<%=basePath%>/veHicle/operatorinUseVehicle';
                            }
                            else if(sign==4){
                                window.location.href='<%=basePath%>/veHicle/operatornotApply';
                            }else if(sign==5){
                                window.location.href='<%=basePath%>/veHicle/operatorUseEnd';
                            }


                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }
    })

    function check(){
        if ($('#vId').val() == ""){
            $.layerMsg({content: "<fmt:message  code="event.th.number"/>", icon: 2});
            return false;
        }
        if($('#vuStart').val()==""||$('#vuEnd').val()==""){
            $.layerMsg({content: "<fmt:message  code="event.th.Vehicleverification"/>", icon: 2});
            return false;
        }
        if($('#vuDestination').val()==""){
            $.layerMsg({content: "<fmt:message  code="event.th.Destination"/>", icon: 2});
            return false;
        }
        if($('#vuOperator').val()==""){
            $.layerMsg({content: "<fmt:message  code="event.th.FillDispatcher"/>", icon: 2});
            return false;
        }
        return true;
    }
    //点击清空按钮
    $('.reset_btn').click(function () {
        $('#vId').val("");
        $("#vuDept").attr("deptid","");
        $("#vuDept").val("");
        $("#vuUser").attr("user_id","");
        $("#vuUser").val("");
        $("#vuSuite").attr("user_id","");
        $("#vuSuite").val("");
        $("#deptManager").attr("user_id","");
        $("#deptManager").val("");
        $("#vuOperator").val("");
        $("#vuStart").val("");
        $("#vuEnd").val("");
        $("#vuDestination").val("");
        $("#vuMileage").val("");
        $("#vuReason").val("");
        $("#vuRemark").val("");
    })


</script>
</html>


