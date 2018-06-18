<%--
  Created by IntelliJ IDEA.
  User: 高亚峰
  Date: 2017/10/9
  Time: 15:290
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>新建办公用品申请</title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/css/base.css">
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
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
        line-height: 60px;
        color: #494d59;
    }
    .main{
        margin-top: 20px;
    }

    #main_table{
        width: 60%;
        margin: 0 auto;
    }
    .span_td{
        text-align: right;
        width: 15%;
        border-right: #ccc 1px solid;
    }
    .span_td2{
        width: 45%;
    }
    .btn_ok{
        border-color: #4898d5;
        background-color: #2e8ded;
        color: #fff;
        width: 56px;
        height: 30px;
        border-radius: 5%;
        margin-left: 208px;
    }
    .btn_reset{
        border: 1px solid #dcdcdc;
        background-color: #f3f3f3;
        color: #333;
        width: 56px;
        height: 30px;
        border-radius: 5%;
        margin-left: 10px;
    }
    .remark{
        vertical-align: middle;
        border: #999 1px solid;
    }

</style>

<body style="background: #fff">

<div class="content">
    <div class="header">
        <div class="title">
            <span class="big3">新建办公用品申请</span>
        </div>
    </div>
    <div class="main">
<table id="main_table"  style="margin-bottom: 70px;">
    <input type="hidden" id="transId">
    <form id="editApplyForm">
<tr>
    <td class="span_td">登记类型:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
    <td class="span_td2">
        <select style="width: 270px; height: 30px;" id="transFlag" name="transFlag">
            <option value="1">领用</option>
            <option value="2">借用</option>
        </select>
    </td>
</tr>
    <tr>
        <td class="span_td">办公用品库:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td span_td2><select style="width: 270px; height: 30px;" id="depositoryId" name="depositoryId"><option value="">请选择</option></select></td>
    </tr>
    <tr>
        <td class="span_td">办公用品类别:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td span_td2><select style="width: 270px; height: 30px;" id="officeProtype" name="typeId"><option value="">请选择</option></select></td>
    </tr>
    <tr>
        <td class="span_td">办公用品:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td span_td2><select style="width: 270px; height: 30px;" id="proId" name="proId"><option value="">请选择</option></select></td>
    </tr>
    <tr>
        <td class="span_td"><span style="margin-right: 15px;">申请数量:</span></td>
        <td span_td2><input name="transQty" id="transQty" style="width: 270px; height: 30px;"></td>
    </tr>
    <tr>
        <td class="span_td">部门审批人:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td span_td2>
            <textarea id="deptManager1" class="deptManager1" style="min-width: 270px;min-height:78px;" disabled readonly></textarea>
            <a href="javascript:;" class="addDeptManager">添加</a>
            <a href="javascript:;" class="clearDeptManager" onclick="emptyUser('deptManager1')">清空</a>
        </td>
    </tr>

    <tr>
        <td class="span_td"><span style="margin-right: 15px;">备注:</span></td>
        <td span_td2>
            <textarea id="remark" name="remark" style="min-width: 270px;min-height:78px;"></textarea>
        </td>
    </tr>
    </form>
    <tr>
        <td colspan="2">
        <button class="btn_ok">确认</button><button class="btn_reset" onclick="empty()">清空</button>
        </td>
    </tr>
</table>
    </div>
</div>
</body>
</html>

<script>
    $(".addDeptManager").on("click",function(){//负责人
        user_id = "deptManager1";
        $.popWindow("../../common/selectUser?0");
    });
    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }

    $("#depositoryId").change(function () {
        $.ajax({
            url:"/officetransHistory/getDownObjects",
            type:'post',
            dataType:'json',
            data:{
                typeDepository:$(this).val()
            },
            success:function (json) {
                var str='<option value="">请选择</option>';
                var data=json.obj;
                if(json.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].id+'">'+data[i].typeName+'</option>';
                    }
                }
                $("#officeProtype").html(str);
            }
        })
    })



    $("#officeProtype").change(function () {
        $.ajax({
            url:"/officetransHistory/getDownObjects",
            type:'post',
            dataType:'json',
            data:{
                officeProductType:$(this).val()
            },
            success:function (json) {
                var str='<option value="">请选择</option>';
                var data=json.obj;
                if(json.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].proId+'">'+data[i].proName+'('+data[i].proStock+')</option>';
                    }
                }
                $("#proId").html(str);
            }
        })
    })
    var editFlag=${editFlag};
    var transId =${transId};
    var proid=${proid};
    var depositoryid=${depositoryid};
    var protypeid=${protypeid};
    $(function(){
        if(editFlag==0){
            $.ajax({
                url:"/officeDepository/getDeposttoryByDept",
                type:'post',
                dataType:'json',
                success:function (json) {
                    var str='<option value="">请选择</option>';
                    var data=json.obj;
                    if(json.flag){
                        for(var i=0;i<data.length;i++){
                            str+='<option value="'+data[i].id+'">'+data[i].depositoryName+'</option>';
                        }
                    }
                    $("#depositoryId").html(str);
                    $("#depositoryId").val(depositoryid);
                    $.ajax({
                        url:"/officetransHistory/getDownObjects",
                        type:'post',
                        dataType:'json',
                        data:{
                            typeDepository: $("#depositoryId").val()
                        },
                        success:function (json) {
                            var str='<option value="">请选择</option>';
                            var data=json.obj;
                            if(json.flag){
                                for(var i=0;i<data.length;i++){
                                    str+='<option value="'+data[i].id+'">'+data[i].typeName+'</option>';
                                }
                            }
                            $("#officeProtype").html(str);
                            $("#officeProtype").val(protypeid);
                            $.ajax({
                                url:"/officetransHistory/getDownObjects",
                                type:'post',
                                dataType:'json',
                                data:{
                                    officeProductType:$("#officeProtype").val()
                                },
                                success:function (json) {
                                    var str='<option value="">请选择</option>';
                                    var data=json.obj;
                                    if(json.flag){
                                        for(var i=0;i<data.length;i++){
                                            str+='<option value="'+data[i].proId+'">'+data[i].proName+'('+data[i].proStock+')</option>';
                                        }
                                    }
                                    $("#proId").html(str);
                                    $("#proId").val(proid);
                                }
                            })
                        }
                    })
                }
            })







            empty();
        }else{
            $("#transId").val(transId);
            $.ajax({
                url:"/officetransHistory/getObjectById",
                type:'post',
                dataType:'json',
                data:{
                    transId:transId
                },
                success:function (json) {
                   var data=json.object;
                    $.ajax({
                        url:"/officeDepository/getDeposttoryByDept",
                        type:'post',
                        dataType:'json',
                        success:function (json) {
                            var str1='<option value="">请选择</option>';
                            var data1=json.obj;
                            if(json.flag){
                                for(var i=0;i<data1.length;i++){
                                    str1+='<option value="'+data1[i].id+'">'+data1[i].depositoryName+'</option>';
                                }
                            }
                            $("#depositoryId").html(str1);
                            $("#depositoryId").val(data.depositoryId);
                            $.ajax({
                                url:"/officetransHistory/getDownObjects",
                                type:'post',
                                dataType:'json',
                                data:{
                                    typeDepository: $("#depositoryId").val()
                                },
                                success:function (json) {
                                    var str2='<option value="">请选择</option>';
                                    var data2=json.obj;
                                    if(json.flag){
                                        for(var i=0;i<data2.length;i++){
                                            str2+='<option value="'+data2[i].id+'">'+data2[i].typeName+'</option>';
                                        }
                                    }
                                    $("#officeProtype").html(str2);
                                    $("#officeProtype").val(data.typeId);
                                    $.ajax({
                                        url:"/officetransHistory/getDownObjects",
                                        type:'post',
                                        dataType:'json',
                                        data:{
                                            officeProductType:$("#officeProtype").val()
                                        },
                                        success:function (json) {
                                            var str3='<option value="">请选择</option>';
                                            var data3=json.obj;
                                            if(json.flag){
                                                for(var i=0;i<data3.length;i++){
                                                    str3+='<option value="'+data3[i].proId+'">'+data3[i].proName+'</option>';
                                                }
                                            }
                                            $("#proId").html(str3);
                                            $("#proId").val(data.proId);
                                        }
                                    })
                                }
                            })
                        }
                    })
                    $("#transFlag").val(data.transFlag);
                    $("#transQty").val(data.transQty);
                    $("#deptManager1").val(data.deptManagerName);
                    $("#deptManager1").attr("user_id",data.deptManagerId);
                    $("#remark").val(data.remark);
                }
            })
        }
    })

    $(".btn_ok").click(function () {


        if(editFlag==0){
            if(checkForm()){
                $('#editApplyForm').ajaxSubmit({/*添加时，保存按钮*/
                    url:"/officetransHistory/insertObject",
                    type:'post',
                    dataType:'json',
                    data:{
                        deptManager:$("#deptManager1").attr("user_id"),
                        flag:1
                    },
                    success:function (json) {
                        if(json.flag) {
                            $.layerMsg({content: '保存成功！', icon: 1}, function () {
                                empty();
                            });
                        }else{
                            if(json.msg=='numNoEnough'){
                                $.layerMsg({content: '库存数量不足！', icon: 1}, function () {
                                });
                            }else{
                                $.layerMsg({content: '申请失败！', icon: 2}, function () {
                                });
                            }
                        }
                    }
                })
            }
        }else{
            if(checkForm()){
                $('#editApplyForm').ajaxSubmit({/*添加时，保存按钮*/
                    url:"/officetransHistory/editObject",
                    type:'post',
                    dataType:'json',
                    data:{
                        deptManager:$("#deptManager1").attr("user_id"),
                        transId:$("#transId").val()
                    },
                    success:function (json) {
                        if(json.flag) {
                            $.layerMsg({content: '保存成功！', icon: 1}, function () {
                                window.location.href='<%=basePath%>/officetransHistory/goMyOfficeApply';
                            });
                        }else{
                            $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                            });
                        }
                    }
                })
            }

        }
    })
    function checkForm(){
        if($('#depositoryId option:selected').text()=="请选择"){
            $.layerMsg({content:'请选择办公用品库！',icon:2});
            return false;
        }
        if($('#deptManager1').val()==""){
            $.layerMsg({content:'部门审批人不能为空！',icon:2});
            return false;
        }
        if($('#officeProtype option:selected').text()=="请选择"){
            $.layerMsg({content:'请选择办公用品类别！',icon:2});
            return false;
        }
        if($('#proId option:selected').text()=="请选择"){
            $.layerMsg({content:'请选择办公用品！',icon:2});
            return false;
        }
        return true;
    }

    function empty() {
        $("#transFlag").val("");
        $("#depositoryId").val("");
        $("#officeProtype").val("");
        $("#proId").val("");
        $("#transQty").val("");
        $("#deptManager1").val("");
        $("#deptManager1").attr("user_id","");
        $("#remark").val("");
    }
</script>
