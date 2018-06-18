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
    <title><fmt:message code="event.th.OilCardInformation" /></title>
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/addVehicle.css"/>

    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
</head>
<style>
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
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/deptApprove.png" align="absmiddle">
            <span class="big3"><fmt:message code="event.th.OilCardInformation" /></span>
        </div>
    </div>
    <div class="main">
        <input name="id" id="id" type="hidden">
        <form name="editOilCardForm" id="editOilCardForm">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 50%;">
            <tr>
                <td><fmt:message code="event.th.OilCardNumber" />：</td>
                <td><input type="text" name="ocId" id="ocId" value="" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.IssuingDate" />：</td>
                <td><input type="text" name="ocDate" id="ocDate" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.HandlePerson" />：</td>
                <td>
                    <textarea name="ocHandled1" id="ocHandled1" cols="" rows="" user_id=""></textarea>
                    <a href="javascript:;" onclick="addUser('ocHandled1')"><fmt:message code="global.lang.select" /></a>
                    <a href="javascript:;" onclick="emptyUser('ocHandled1')"><fmt:message code="notice.th.delete1" /></a>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.OilCardIssuing" />：</td>
                <td><input type="text" name="ocCompany" id="ocCompany" value=""></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.OilCardPassword" />：</td>
                <td><input type="text" name="ocPassword" id="ocPassword" value=""></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.UsingState" />：</td>
                <td>
                    <select name="ocStatus" class="BigSelect" id="ocStatus">

                    </select>
                </td>
            </tr>

            <tr>
                <td><fmt:message code="event.th.LicensePlateNumber" />：</td>
                <td>
                    <select name="vNum1" class="BigSelect" id="vNum1">

                    </select>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DepositoryDepartment" />：</td>
                <td><input type="text" name="vDept1" id="vDept1" value="" deptid="" disabled readonly></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleType" />：</td>
                <td><input type="text" name="vType1" id="vType1" value="" vType="" disabled readonly></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.OwnerVehicle" />：</td>
                <td><input type="text" name="vOnwer1" id="vOnwer1" value="" user_id="" disabled readonly></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.LongTermUser" />：</td>
                <td><input type="text" name="vUser1" id="vUser1" value="" user_id="" disabled readonly></td>
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
</html>
<script>
    var editFlag=${editFlag};

    //时间控件
    var start = {
        format: 'YYYY-MM-DD',
    };

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }

    //选（单个）人员控件
    function addUser(id){
        user_id = id;
        $.popWindow("../../common/selectUser?0");
    }
    function ajaxselect(fn) {
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
                $("#vNum1").html(str);
                if(fn!=undefined){
                    fn()
                }
            }
        })
    }

    //进行初始化界面
    $(function () {
        //车牌号下拉列表
        ajaxselect()

        //油卡使用状态下拉列表
        $.ajax({
            url: '/code/GetDropDownBox',
            type: 'get',
            data: {
                CodeNos: "OILCARDSTATUS"
            },
            dataType: 'json',
            success: function (obj) {
                var str = '<option value=""></option>';
                var data = obj.OILCARDSTATUS;
                for (var i = 0; i < data.length; i++) {
                    str += '<option value="' + data[i].codeNo + '">' + data[i].codeName + '</option>';
                }
                $("#ocStatus").html(str);
            }
        })

        //编辑的初始页面
        if(editFlag==1){//编辑时初始页面
            var id=${id};
            $.ajax({
                url: '/oilCard/selectOilCardById',
                type: 'get',
                data:{
                    id:id
                },
                dataType: 'json',
                success: function (obj){
                    var data=obj.object;
                    if(obj.flag){
                        $("#id").val(id);
                        $("#ocId").val(data.ocId);
                        $("#ocDate").val(data.ocDate);

                        $("#ocHandled1").val(data.ocHandled);
                        $("#ocHandled1").attr("user_id",data.recorderHandled);

                        $("#ocCompany").val(data.ocCompany);
                        $("#ocPassword").val(data.ocPassword);
                        $("#ocStatus").val(data.ocStatus);
                        ajaxselect(function () {
                            $("#vNum1").val(data.vId);
                        })

                        /*$("#vNum1  option[value='"+data.vId+"'] ").attr("selected",true)*/

                        $("#vDept1").val(data.vDeptName);
                        $("#vDept1").attr("deptid",data.vDept);

                        $("#vType1").val(data.vTypeName);
                        $("#vType1").attr("vType",data.vType);

                        $("#vOnwer1").val(data.vOnwerName);
                        $("#vOnwer1").attr("user_id",data.vOnwer);
                        $("#vUser1").val(data.vUserName);
                        $("#vUser1").attr("user_id",data.vUser);

                    }
                }
            })
        }
    })

    //保存按钮
    $(".save_btn").click(function () {
        if(editFlag==0){//添加油卡信息
            $('#editOilCardForm').ajaxSubmit({
                url:"/oilCard/addVehicleOilCard",
                type:'post',
                dataType:'json',
                data:{
                    vType:$("#vType1").attr("vType"),
                    vId:$("#vNum1").val(),
                    vNum:$("#vNum1 option:selected").text(),
                    ocHandled:$("#ocHandled1").val(),//经手人姓名
                    recorderHandled:$("#ocHandled1").attr("user_id"),//经手人id
                    vDept:$("#vDept1").attr("deptid"),//保管部门
                    vOnwer:$("#vOnwer1").attr("user_id"),//车辆所有人
                    vUser:$("#vUser1").attr("user_id"),//长期使用人
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="url.th.addSuccess" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/veHicle/oilCardManagement';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }else{//修改油卡信息
            $('#editOilCardForm').ajaxSubmit({
                url:"/oilCard/editVehicleOilCard",
                type:'post',
                dataType:'json',
                data:{
                    id:$("#id").val(),
                    vId:$("#vNum1").val(),
                    vNum:$("#vNum1 option:selected").text(),
                    vType:$("#vType1").attr("vType"),
                    ocHandled:$("#ocHandled1").val(),//经手人姓名
                    recorderHandled:$("#ocHandled1").attr("user_id"),//经手人id
                    vDept:$("#vDept1").attr("deptid"),//保管部门
                    vOnwer:$("#vOnwer1").attr("user_id"),//车辆所有人
                    vCaruser:$("#vUser1").attr("user_id"),//长期使用人
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/veHicle/oilCardManagement';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }
    })


    //车牌号下拉列表的联动
    $("#vNum1").change(function () {
        $.ajax({
            url: '/veHicle/getDetailVeHicle',
            type: 'get',
            data:{
                vId:$(this).val()
            },
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
               if(obj){
                   $("#vDept1").val(data.vDepartName);
                   $("#vDept1").attr("deptid",data.vDepart);
                   $("#vType1").val(data.vTypeName);
                   $("#vType1").attr("vType",data.vType);

                   $("#vOnwer1").val(data.oOnwerName);
                   $("#vOnwer1").attr("user_id",data.vOnwer);
                   $("#vUser1").val(data.vCaruserName);
                   $("#vUser1").attr("user_id",data.vCaruser);
               }
            }
        })
    })

    //重填按钮
    $(".reset_btn").click(function () {
        $("#ocId").val("");
        $("#ocDate").val("");

        $("#ocHandled1").val("");
        $("#ocHandled1").attr("user_id","");

        $("#ocCompany").val("");
        $("#ocPassword").val("");
        $("#ocStatus").val("");
        $("#vNum1").val("");

        $("#vDept1").val("");
        $("#vDept1").attr("deptid","");

        $("#vType1").val("");

        $("#vOnwer1").val("");
        $("#vOnwer1").attr("user_id","");
        $("#vUser1").val("");
        $("#vUser1").attr("user_id","");
    })
</script>

