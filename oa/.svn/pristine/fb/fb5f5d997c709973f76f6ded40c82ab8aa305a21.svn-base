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
    <title><fmt:message code="event.th.VehicleMaintenanceRecord" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/jquery.cookie.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
</head>
<style>
    .headImg {
        display: inline-block;
        float: left;
    }
    .divTitle{
        font-size: 22px;
        color: rgb(73, 77, 89);
        margin-left: 10px;
        margin-right: 20px;
    }
    .editInfo textarea{
        cols:"45";
        rows:"3";
        wrap:"yes";
        readonly:"";
    }
    td{
        color: rgb(64, 64, 96);
        padding: 10px;
        font: 14px 微软雅黑;
    }
    .editInfo tr td {/*表格的边框样式*/
        border-width: 1px;
        border-style: solid;
        border-color: rgb(192, 192, 192);
        border-image: initial;
    }
    table{
        border-collapse: collapse;/*表格边框合并*/
        width: 78%;
        margin-left: 10%;
    }
    .editInfo tr td:first-child{
        width: 30%;
    }
    .main{
        margin-top: 20px;
    }
    .save_btn{/*保存按钮*/
        background: url(../../img/save.png) no-repeat;
        margin-top: 20px;
        margin-left: 45%;

    }
    .btn_ {
        height: 43px;
        margin-top: 30px;
        margin-bottom: 20px;
        padding-left: 41px;
        padding-top: 7px;
        font-size: 14px;
    }
    #saveBtn{
        cursor: pointer;
    }
    .editInfo input[type='text']{
        height: 32px;
        width: 190px;
    }
    #add_send{
        width: 66px;
        height: 43px;
        margin-right: 40px;
        margin-top: 0;
        margin-bottom: 20px;
        background: url(../../img/publish.png) no-repeat;
        padding-left: 40px;
        padding-top: 7px;
        cursor: pointer;
        font-size: 14px;
        display: inline-block;
        float: left;
        margin-left: 330px;
    }
    a{
        text-decoration: none;
        color: #0066cc;
        margin: 0 5px;
    }
</style>
<body style="font-family: 微软雅黑;">
<div class="headTop" style="margin-left: 1%">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleFix.png">&nbsp;&nbsp;
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.VehicleMaintenanceRecord" />
    </div>
</div>
<div class="main" style="margin-left: 1%">
    <div class="mainBody">
        <input type="hidden" id="vmId" name="vmId">
        <form id="editWorkPlanForm">
            <table class="editInfo">
                <tr>
                    <td><fmt:message code="event.th.LicensePlateNumber" />：</td>
                    <td><select  style="height: 29px;width: 190px" id="vId" name="vId"></select></td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.MaintenanceDate" />：</td>
                    <td><input name="vmRequestDate" id="vmRequestDate" type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.MaintenanceType" />：</td>
                    <td><select name="vmType" id="vmType" style="width: 190px;height: 29px"></select></td>
                </tr>

                <tr>
                    <td> <fmt:message code="event.th.MaintenanceReason" />：</td>
                    <td>
                        <textarea name="vmReason" id="vmReason" class="vmReason" user_id="" dataid="" cols="98%" rows="5"></textarea>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="workflow.th.Manager" />：</td>
                    <td><input name="vmPerson" id="vmPerson" type="text"></td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.maintenanceCost" />：</td>
                    <td><input name="vmFee" id="vmFee" onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" onblur="this.v();" type="text" /></td>
                </tr>
                <tr>
                    <td><fmt:message code="journal.th.Remarks" />：</td>
                    <td>
                        <textarea name="vmRemark" id="vmRemark" class="content" user_id="" dataid="" cols="98%" rows="5"></textarea>
                    </td>
                </tr>
            </table>
        </form>
        <div>
            <div id="saveBtn" value="0" type="save" class="btn_ save_btn"><fmt:message code="global.lang.save" /></div>
        </div>
    </div>
</div>

<script>
    //时间控件
    var start = {
        format: 'YYYY-MM-DD',
    };

    var editFlag=${editFlag};
    $(function(){
        if(editFlag==0){//为添加页面，对添加页面进行初始化
            getVNum();
            fixType();
            $('.setImg').show();
            $('.showImg').hide();
        }else{//为编辑页面，对编辑页面进行初始化
            $(".divTitle").html("<fmt:message code="event.th.EditMaintenanceRecord" />");
            var vmId='${vmId}';
            $.ajax({
                url: '/tenance/getdetail',
                type: 'get',
                data:{
                    vmId:parseInt(vmId)
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.object;
                    if(obj.flag){
                        $("#vmId").val(vmId);
                        getVNum(function () {
                            $("#vId").val(data.vId);
                        })
                        $("#vmRequestDate").val(data.vmRequestDate);
                        fixType(function () {
                            $("#vmType").val(data.vmType);
                        })
                        $("#vmReason").val(data.vmReason);
                        $("#vmPerson").val(data.vmPerson);
                        $("#vmFee").val(data.vmFee);
                        $("#vmRemark").val(data.vmRemark);
                    }
                }
            })
        }

    })


    //保存按钮：editFlag==0 为添加操作，editFlag==1 为修改操作
    $("#saveBtn").click(function () {
        if(editFlag==0){//添加操作
            $('#editWorkPlanForm').ajaxSubmit({/*添加时，保存按钮未发布*/
                url:"/tenance/addMaintenance",
                type:'post',
                dataType:'json',
                data:{
                  vNum:$("#vId option:selected").text()
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/tenance/queryList?queryFlag=0';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }else{
            $('#editWorkPlanForm').ajaxSubmit({
                url:"/tenance/edit",
                type:'post',
                dataType:'json',
                data:{
                    vmId:$("#vmId").val(),
                    vNum:$("#vId option:selected").text()
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/tenance/queryList?queryFlag=0';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }
    })

    function getVNum(fn) {
        //车牌号下拉列表
        $.ajax({
            url: '/veHicle/getAllVeHicle',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var str = '<option value=""></option>';
                var data = obj.obj;
                for (var i = 0; i < data.length; i++) {
                    str += '<option value="' + data[i].vId + '">' + data[i].vNum + '</option>';
                }
                $("#vId").html(str);
                if(fn!="undefined"){
                    fn();
                }
            }
        })
    }

    function fixType(fn) {
        //维护类型拉列表
        $.ajax({
            url: '/code/GetDropDownBox',
            type: 'get',
            data:{
                CodeNos:"FIX_TYPE"
            },
            dataType: 'json',
            success: function (obj) {
                var str='<option value=""></option>';
                var data=obj.FIX_TYPE;
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].codeNo+'">'+data[i].codeName+'</option>';
                }
                $("#vmType").html(str);
                if(fn!="undefined"){
                    fn();
                }
            }
        })
    }


</script>
</body>
</html>
