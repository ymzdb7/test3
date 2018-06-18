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
    <title><fmt:message code="event.th.NewAssets" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="/lib/qrcode.js"></script>
</head>
<style>
    body{
        margin:0px;
    }
    .headImg {
        display: inline-block;
        float: left;
        margin-top:22px;
    }
    .divTitle{
        font-size: 22px;
        color: rgb(73, 77, 89);
        margin-left: 10px;
        margin-right: 20px;
        height:70px;
        line-height:70px;
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
        width: 100%;
    }
    /*.editInfo tr td:first-child{*/
    /*width: 30%;*/
    /*}*/
    /*.main{*/
    /*margin-top: 20px;*/
    /*}*/
    .save_btn{/*保存按钮*/
        background: url(../../img/save.png) no-repeat;
        margin-top: 20px;
        margin-left: 45%;

    }
    .btn_ {
        height: 43px;
        margin-top: 10px;
        margin-bottom: 20px;
        padding-left: 41px;
        padding-top: 7px;
        font-size: 14px;
    }
    #saveBtn{
        cursor: pointer;
    }
    .editInfo input[type="text"]{
        height: 32px;
    }
    .blue{

        font-weight:bold;
        color:#2a588c;
    }
</style>
<body style="font-family: 微软雅黑;">
<div class="headTop" style="margin-left: 30px">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/fixAssetsNew.png">&nbsp;&nbsp;
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.NewAssets" />
    </div>
</div>
<div class="main" style="margin-left: 30px">
    <div class="mainBody">
        <form id="editFixAssetsForm"  enctype="multipart/form-data">
            <table class="editInfo">
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.FixedAssetNumber" />：</td>
                    <td><input name="id" id="id" type="text" class="test_null" disabled readonly><span style="font-size: 14px;color: red">&nbsp;&nbsp;*</span></td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.AssetName" />：</td>
                    <td><input name="assetsName" id="assetsName"  type="text"  class="test_null"><span style="font-size: 14px;color: red">&nbsp;&nbsp;*</span></td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.BuyTime" />：</td>
                    <td><input name="buyTime" id="buyTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"  type="text" readonly  class="test_null"><span style="font-size: 14px;color: red">&nbsp;&nbsp;*</span></td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.Information" />：</td>
                    <td><input name="info" id="info"  type="text"></td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.Number" />：</td>
                    <td><input name="number" id="number"  type="text"></td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.location" />：</td>
                    <td>
                        <textarea name="localAddress1" id="localAddress" class="localAddress" deptid="" cols="22" disabled readonly></textarea>
                        <a href="javascript:;" class="addAddress" style="color:#207bd6;text-decoration:none"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearAddress" style="color:#207bd6;text-decoration:none" onclick="emptyDept('localAddress')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.Custodian" />：</td>
                    <td>
                        <textarea name="custodion1" id="custodion" class="custodion" user_id="" disabled readonly cols="22"></textarea>
                        <a href="javascript:;" class="addCustodion" style="color:#207bd6;text-decoration:none"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearCustodion" style="color:#207bd6;text-decoration:none" onclick="emptyUser('custodion')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td class="blue" style="width:15%";><fmt:message code="event.th.ArticleStatus" />：</td>
                    <td>
                        <select name="status" id="status" style="height: 30px;width: 85px">
                            <option value="1"><fmt:message code="event.th.notUsed" /></option>
                            <option value="2"><fmt:message code="evvent.th.Use" /></option>
                            <option value="3"><fmt:message code="event.th.damage" /></option>
                            <option value="4"><fmt:message code="event.th.Lose" /></option>
                            <option value="5"><fmt:message code="event.th.Scrap" /></option>
                        </select>
                    </td>
                </tr>
                <tr class="setImg">
                    <td nowrap="" class="TableData" class="blue" style="width:15%";><fmt:message code="event.th.FixedAssetsPicture" />：</td>
                    <td nowrap="" class="TableData">
                        <span id="showImage"></span>
                        <input type="file" name="imageFile" id="imageFile" size="40" class="BigInput" title="<fmt:message code="url.th.SelectPicture" />" style="height: 27px;">&nbsp;
                    </td>
                </tr>
                <tr class="showImg" style="display: none">
                    <td nowrap="" class="TableData" class="blue" style="width:15%";><fmt:message code="event.th.FixedAssetsPicture" />：</td>
                    <td>
                        <image  style="width:100px;height:100px;" id="image" > &nbsp;&nbsp;<input type="button" id="delImg" value="<fmt:message code="global.lang.delete" />"></image>
                    </td>
                </tr>


                <tr>
                    <td class="blue" width="15%";><fmt:message code="journal.th.Remarks" />：</td>
                    <td><input name="remake" id="remake"  type="text"></td>
                </tr>
                <tr style="display: none" class="qrTd">
                    <td class="blue" width="15%";><fmt:message code="doc.th.QRCode" />：</td>
                    <td><span id="showQRCode"  style="display: inline-block;"></span></td>
                </tr>
                <tr>
                    <td class="blue" width="15%";><fmt:message code="file.th.builder" />：</td>
                    <td><input name="creater1" id="creater" user_id="" readonly disabled  type="text"></td>
                </tr>
                <tr>
                    <td class="blue" width="15%";><fmt:message code="notice.th.createTime" />：</td>
                    <td><input name="createrTime" id="createrTime" readonly disabled type="text"></td>
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
    /* var start = {
     format: 'YYYY-MM-DD',
     istime: true
     };*/

    var editFlag=${editFlag};
    $(function(){
        if(editFlag==0){//为添加页面，对添加页面进行初始化
            //初始化固定资产编号
            $.ajax({
                url: '/eduFixAssets/getFixAssetsId',
                type: 'get',
                dataType: 'json',
                success: function (obj) {
                    if(obj.flag){
                        $("#id").val(obj.object.id);//初始化固定资产编号
                        $("#createrTime").val(obj.object.createrTime);//创建时间
                    }
                }
            })
            //初始化创建人和创建时间
            $("#creater").val($.cookie("userName"));//创建人姓名
            $("#creater").attr("user_id",$.cookie("userId"));//创建人userId
            $('.setImg').show();
            $('.showImg').hide();
            $(".qrTd").hide();
        }else{//为编辑页面，对编辑页面进行初始化
            $(".divTitle").html("<fmt:message code="event.th.ModifyAssets" />");
            $.ajax({
                url: '/eduFixAssets/selFixAssetsById',
                type: 'get',
                data:{
                    id:'${id}',
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.object;
                    if(obj.flag){
                        $("#id").val(data.id);
                        $("#assetsName").val(data.assetsName);
                        $("#buyTime").val(data.buyTime);
                        $("#info").val(data.info);
                        $("#number").val(data.number);
                        $("#localAddress").val(data.locationAddressName);
                        $("#localAddress").attr("deptid",data.locationAddress);
                        $("#custodion").val(data.custodionName);
                        $("#custodion").attr("user_id",data.custodion);
                        $("#status").val(data.status);
                        /*$("#imageFile").val(data.imageFile);*/
                        $("#remake").val(data.remake);
                        /*   $("#QRcodeFile").val(data.QRcodeFile);*/
                        $("#creater").val(data.createrName);
                        $("#creater").attr("user_id",data.creater);
                        $("#createrTime").val(data.createrTime);
                        if(data.image!=''){
                            $('#image').attr('src','<%=basePath%>img/edu/eduFixAssets/'+data.image);
                            $('.setImg').hide();
                            $('.showImg').show();
                            $('.qrTd').show();
                        }else{
                            $('.setImg').show();
                            $('.showImg').hide();
                            $('.qrTd').show();
                        }

                        var qrcode = new QRCode(document.getElementById("showQRCode"), {
                            width : 100,//设置宽高
                            height : 100,
                            text:'<%=basePath%>eduFixAssets/selFixAssetsById?id='+'${id}'
                        });
                        str='{"mark":"SID_MEETING","sid":'+meetingId+'}';
                        qrcode.makeCode(str);
                    }
                }
            })
        }
    })

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }
    /* 选人控件 */
    $(".addCustodion").on("click",function(){//使用保管人
        user_id = "custodion";
        $.popWindow("../../common/selectUser?0");
    });
    //清空部门控件
    function emptyDept(id){
        $("#"+id).val("");
        $("#"+id).attr("deptid","");
    }
    /* 选部门控件 */
    $(".addAddress").on("click",function(){//所在位置
        dept_id = "localAddress";
        $.popWindow("../../common/selectDept?0");
    });

    //保存按钮：editFlag==0 为添加操作，editFlag==1 为修改操作
    $("#saveBtn").click(function () {
        //检查是否为空
        var array=$(".test_null");
        var attendId='';
        var attendName='';
        for(var i=0;i<array.length;i++){
            if(array[i].value==""){
                $.layerMsg({content:"<fmt:message code="sup.th.With*" />",icon:2},function(){
                });
                return;
            }
        }
        //使用保管人
        var custodion=$("#custodion").attr("user_id");
        if(custodion!='' && custodion.indexOf(",")>=0){
            custodion=custodion.replace(",","");
        }
        //所在位置
        var locationAddress=$("#localAddress").attr("deptid");
        if(locationAddress!='' && locationAddress.indexOf(",")>=0){
            locationAddress=locationAddress.replace(",","");
        }
        //创建人
        var creater=$("#creater").attr("user_id");
        if(creater!='' && creater.indexOf(",")>=0){
            creater=creater.replace(",","");
        }
        if(editFlag==0){//添加操作
            $('#editFixAssetsForm').ajaxSubmit({
                url:"/eduFixAssets/insertFixAssets",
                type:'post',
                dataType:'json',
                data:{
                    id:$('#id').val(),
                    custodion:custodion,
                    locationAddress:locationAddress,
                    creater:creater,
                    createrTime:$("#createrTime").val()
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/eduFixAssets/fixAssetsManager';
                            window.parent.show()
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }else{
            $('#editFixAssetsForm').ajaxSubmit({
                url:"/eduFixAssets/updateFixAssetsById",
                type:'post',
                dataType:'json',
                data:{
                    id:$('#id').val(),
                    custodion:custodion,
                    locationAddress:locationAddress,
                    creater:creater
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/eduFixAssets/fixAssetsManager';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }
    })
    $('#delImg').on('click',function(){
        $("#imageFile").val('');
        $('.setImg').show();
        $('.showImg').hide();
    })
</script>
</body>
</html>
