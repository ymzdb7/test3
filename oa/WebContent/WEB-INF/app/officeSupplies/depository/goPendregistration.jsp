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
    <title>代登记</title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
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
        margin-left: 350px;
    }
    a{
        text-decoration: none;
        color: #0066cc;
        margin: 0 5px;
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
            <span class="big3">代登记</span>
        </div>
    </div>
    <div class="main">
<table id="main_table"  style="margin-bottom: 70px;">
    <input type="hidden" id="transId">
    <form id="editApplyForm">
<tr>
    <td class="span_td">登记类型:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
    <td class="span_td2">
        <select style="width: 270px; height: 30px;" id="transFlag">
            <option value="">请选择</option>
            <option value="1">领用</option>
            <option value="2">借用</option>
            <option value="6">归还</option>
        </select>
    </td>
</tr>
    <tr>
        <td class="span_td">申请人:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td class="span_td2"><input name="borrow1" disabled="disabled" id="borrow1" style="width: 270px; height: 30px;">
            <a href="javascript:;" id="addBorrow"><fmt:message  code="global.lang.select"/></a>
            <a href="javascript:;" class="clearBorrow" onclick="emptyUser('borrow1')">清空</a>
        </td>
    </tr>
        <tr>
            <td class="span_td">办公用品库:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
            <td class="span_td2">
                <select style="width: 270px; height: 30px;" id="depositoryId" name="depositoryId"><option value="">请选择</option></select>
            </td>
        </tr>
    <tr>
        <td class="span_td">办公用品类别:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td class="span_td2"><select style="width: 270px; height: 30px;" id="officeProtype" name="typeId"><option value="">请选择</option></select></td>
    </tr>
    <tr>
        <td class="span_td">办公用品:<span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td class="span_td2"><select style="width: 270px; height: 30px;" id="proId" name="proId"><option value="">请选择</option></select></td>
    </tr>
    <tr>
        <td class="span_td span_td4"><span style="margin-right: 15px;">申请数量:</span></td>
        <td class="span_td2 span_td4"><input name="transQty" id="transQty" style="width: 270px; height: 30px;"></td>
    </tr>
        <tr>
            <td class="span_td span_td5"><span class="span_5" style="margin-right: 15px;">申请日期:</span></td>
            <td class="span_td2 span_td5"><input name="num2" class="span_input2" id="transDate" name="transDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" id="num2" style="width: 270px; height: 30px;"></td>
        </tr>
        <tr>
            <td class="span_td span_td6" style="display: none"><span class="span_6" style="margin-right: 15px;">归还日期:</span></td>
            <td class="span_td2 span_td6" style="display: none" ><input name="num2" class="span_input2" id="returnDate" name="returnDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" id="num2" style="width: 270px; height: 30px;"></td>
        </tr>

    <tr>
        <td class="span_td"><span style="margin-right: 15px;">备注:</span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>
        <td class="span_td2">
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

        <div class="left"><span class="big3">今日操作查看</span></div>
        <table class="tr_td tr_tds mainBottom" style="width: 80%;margin-bottom: 50px" align="center">
            <thead>
            <tr>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">办公用品名称</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">登记类型</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">领用/借用/归还人</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">数量</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">当前库存</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">单价</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">操作日期</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center">操作员</th>
                <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="menuSSetting.th.menuSetting" /></th><%--操作--%>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>

<script>
    var user_id="";
 $('#transFlag').change(function(){
    if($('#transFlag').val()==1){
        $('.span_td4').show();
        $('.span_td5').show();
        $('.span_td6').hide();
        $("#returnDate").val("");
    }else if($('#transFlag').val()==2){
        $('.span_td4').show();
        $('.span_td5').show();
        $('.span_td6').hide();
        $("#returnDate").val("");
    }else{
        $('.span_td5').hide();
        $('.span_td4').hide();
        $('.span_td6').show();
        $("#transDate").val("");
        $("#transQty").val("");
    }
 })

 $('#addBorrow').click(function(){
     user_id="borrow1";
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

    $(function () {
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
            }
        })
        init();
    })

    $(".btn_ok").click(function () {
        if($('#transFlag').val()==6){
            if(checkForm()){
                $('#editApplyForm').ajaxSubmit({/*添加时，保存按钮*/
                    url:"/officetransHistory/insertObject",
                    type:'post',
                    dataType:'json',
                    data:{
                        borrower:$("#borrow1").attr("user_id"),
                        flag:2
                    },
                    success:function (json) {
                        if(json.flag) {
                            $.layerMsg({content: '保存成功！', icon: 1}, function () {
                                empty();
                                init();
                            });
                        }else{
                            $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                            });
                        }
                    }
                })
            }

        }else{
            if(checkForm()){
                $('#editApplyForm').ajaxSubmit({/*添加时，保存按钮*/
                    url:"/officetransHistory/insertObject",
                    type:'post',
                    dataType:'json',
                    data:{
                        borrower:$("#borrow1").attr("user_id"),
                        transFlag:$("#transFlag").val(),
                        flag:2
                    },
                    success:function (json) {
                        if(json.flag) {
                            $.layerMsg({content: '保存成功！', icon: 1}, function () {
                                empty();
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


        if($('#transFlag option:selected').text()=='请选择'){
            $.layerMsg({content:"请选择登记类型", icon: 2});
            return false;
        }
        if($('#borrow1').val()==""){
            $.layerMsg({content:'请选择申请人',icon:2});
            return false;
        }
        if($('#depositoryId option:selected').text()=='请选择'){
            $.layerMsg({content:"请选择办公用品库", icon: 2});
            return false;
        }
        if($('#officeProtype option:selected').text()=='请选择'){
            $.layerMsg({content:"请选择办公用品类型", icon: 2});
            return false;
        }
        if($('#proId option:selected').text()=='请选择'){
            $.layerMsg({content:"请选择办公用品", icon: 2});
            return false;
        }
        return true;
    }

    function empty() {
        $("#transFlag").val("");
        $("#borrow1").val("");
        $("#borrow1").attr("user_id","");
        $("#depositoryId").val("");
        $("#officeProtype").val("");
        $("#proId").val("");
        $("#transDate").val("");
        $("#transQty").val("");
        $("#remark").val("");
    }

    function init(){
        $.ajax({
            url: '/officetransHistory/selInstead',
            type: 'get',
            dataType: 'json',
            success: function (result) {
                var str="";
                var arr =result.obj;
                for(var i=0;i<arr.length;i++){
                    str+='<tr>'+
                        '<td style="text-align: center">'+arr[i].proName+'</td>';
                    if(arr[i].transFlag==3){
                        str+='<td>采购入库</td>' ;
                    }else if(arr[i].transFlag==4){
                        str+='<td>维护</td>' ;
                    }else if(arr[i].transFlag==5){
                        str+='<td>报废</td>' ;
                    }else{
                        str+='<td></td>' ;
                    }
                    str+= '<td style="text-align: center">'+arr[i].borrowerName+'</td>'+
                        '<td style="text-align: center">'+arr[i].transQty+'</td>'+
                        '<td style="text-align: center">'+arr[i].proStock+'</td>'+
                        '<td style="text-align: center">'+arr[i].price+'</td>'+
                        '<td style="text-align: center">'+arr[i].transDate+'</td>'+
                        '<td style="text-align: center">'+arr[i].operatorName+'</td>'+
                        '<td style="text-align: center">';
                    if(arr[i].transFlag==3 || arr[i].transFlag==5){
                        str+= ' <a href="javascript:;" class="details" onclick="edit('+arr[i].id+');">'+"修改"+'</a>&nbsp';
                    }
                    str+= ' <a href="javascript:;" class="details" onclick="edit('+arr[i].id+');">'+"放弃操作"+'</a>&nbsp'+
                        '</td>'+
                        '</tr>';
                }
                $('.mainBottom tbody').html(str);
            }
        })
    }
</script>
