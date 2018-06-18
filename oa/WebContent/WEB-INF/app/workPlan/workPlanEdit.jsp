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
    <title><fmt:message code="event.th.WorkPlanManagement" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
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
        width: 100%;
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
        width: 160px;
    }
    #add_send{
        width: 66px;
        height: 43px;
        margin-right: 40px;
        margin-top: 0;
        margin-bottom: 20px;
        background: url(../../img/publish.png) no-repeat;
        padding-left: 37px;
        padding-top: 7px;
        cursor: pointer;
        font-size: 14px;
        display: inline-block;
        float: left;
        margin-left: 330px;
    }
</style>
<body style="font-family: 微软雅黑;margin: 0">
<div class="headTop" style="    margin-left: 30px;margin-top: 21px;">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/workPlanEdit.png">&nbsp;&nbsp;
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.NewWorkPlan" />
    </div>
</div>
<div class="main" style="margin-left: 1%">
    <div class="mainBody">
       <%-- <input type="publish" id="publish">--%>
        <form id="editWorkPlanForm">
            <input type="hidden" id="planId" name="planId">
            <table class="editInfo">
                <tr>
                    <td><fmt:message code="event.th.PlanType" />：</td>
                    <td><select  style="height: 29px;width: 160px" id="type" name="type"></select></td>
                </tr>
                <tr>
                    <td><fmt:message code="workflow.th.name" />：</td>
                    <td><input name="name" id="name" type="text" style="width: 500px"><img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt=""></td>
                </tr>
                <tr>
                    <td><fmt:message code="vote.th.Publication(Department)" />：</td>
                    <td>
                        <textarea name="toName" id="toName" class="toName test_orNull" deptid="" readonly disabled></textarea>
                        <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt="">
                        <a href="javascript:;" class="addToId"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearToId" onclick="emptyDept('toName')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="vote.th.Release(personnel)" />：</td>
                    <td>
                        <textarea name="toPersonName" id="toPersonName" class="toPersonName test_orNull" user_id="" dataid="" readonly disabled></textarea>
                        <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt="">
                        <a href="javascript:;" class="addToPersonId"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearPersonId" onclick="emptyUser('toPersonName')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.Participanta" />：</td>
                    <td>
                        <textarea name="participatorName"  id="participatorName" class="participatorName test_orNull" user_id="" dataid="" readonly disabled></textarea>
                        <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt="">
                        <a href="javascript:;" class="addParticipator"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearParticipator" onclick="emptyUser('participatorName')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.PersonCharge" />：</td>
                    <td>
                        <textarea name="managerName" id="managerName" class="managerName" user_id="" dataid="" readonly disabled></textarea>
                        <a href="javascript:;" class="addManager"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearManager" onclick="emptyUser('managerName')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="event.th.EndorsementLeadership" />：</td>
                    <td>
                        <textarea name="leader" id="leader" class="leader" user_id="" dataid="" readonly disabled></textarea>
                        <a href="javascript:;" class="addLeader"><fmt:message code="global.lang.add" /></a>
                        <a href="javascript:;" class="clearLeader" onclick="emptyUser('leader')"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
              <%--  <tr>
                    <td><fmt:message code="email.th.file" />：</td>
                    <td></td>
                </tr>
                <tr>
                    <td><fmt:message code="doc.th.AppendixDescription" />：</td>
                    <td><input name="attachmentComment" id="attachmentComment" type="text"></td>
                </tr>--%>
                <tr>
                    <td><fmt:message code="journal.th.Remarks" />：</td>
                    <td><input name="remark" id="remark" type="text"></td>
                </tr>

                <tr>
                    <td><fmt:message code="notice.th.validity" />：</td>
                    <td>
                        <fmt:message code="workflow.th.StartedOn" />：<input id="beginDate" name="beginDate" type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">&nbsp;<fmt:message code="vote.th.EmptyEffect" /><br><br>
                        <fmt:message code="workflow.th.End" />：<input id="endDate" name="endDate" type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">&nbsp;<fmt:message code="notice.th.null" />
                    </td>
                </tr>
               <%-- <tr>
                    <td><fmt:message code="sms.th.remind" />：</td>
                    <td><input type="checkbox" name="smsFlag" id="smsFlag" value="0"><fmt:message code="notice.th.remindermessage" /></td>
                </tr>--%>
                <tr>
                    <td><fmt:message code="event.th.PlanContent" />：</td>
                    <td>
                        <textarea name="content" id="content" class="content" user_id="" dataid="" cols="98%" rows="10"></textarea>
                    </td>
                </tr>
            </table>
        </form>
        <div style="padding-bottom: 30px">
            <div id="add_send" value="1" type="publish" class="fot_1 btn_ok" ac="add" style="margin-left: 35%;"><fmt:message code="global.lang.publish" /></div>
            <div id="saveBtn" value="0" type="save" class="btn_ save_btn"><fmt:message code="global.lang.save" /></div>
        </div>
    </div>
</div>

<script>
    //时间控件
    var start = {
        format: 'YYYY-MM-DD',
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
        format: 'YYYY-MM-DD',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    var editFlag=${editFlag};
    $(function(){
        if(editFlag==0){//为添加页面，对添加页面进行初始化
            $('.setImg').show();
            $('.showImg').hide();
        }else{//为编辑页面，对编辑页面进行初始化
            $(".divTitle").html("<fmt:message code="event.th.EditorialPlan" />");
            var planId='${planId}';
            $.ajax({
                url: '/workPlan/selectWorkPlanById',
                type: 'get',
                data:{
                    planId:parseInt(planId)
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.object;
                    if(obj.flag){
                        $("#planId").val(data.planId);
                        $("#name").val(data.name);
                        $("#toName").attr("deptid",data.toId);
                        $("#toName").val(data.toName);
                        $("#toPersonName").attr("dataid",data.toPersonId);
                        $("#toPersonName").val(data.toPersonName);
                        $("#participatorName").attr("dataid",data.participator);
                        $("#participatorName").val(data.participatorName);
                        $("#managerName").attr("dataid",data.manager);
                        $("#managerName").val(data.managerName);
                        $("#leader").attr("dataid",data.opinionLeader);
                        $("#leader").val(data.opinionLeaderName);
                        $("#attachmentComment").val(data.attachmentComment);
                        $("#remark").val(data.remark);
                        $("#beginDate").val(data.beginDate);
                        $("#endDate").val(data.endDate);
                        if(data.smsFlag=="1"){
                            $("#smsFlag").attr("checked","checked");
                        }
                        $("#content").val(data.content);
                        $("#publish").val(data.publish);
                        selType(function () {
                            $('#type').val(data.type)
                        });
                    }
                }
            })
        }

        //加载工作计划类型下拉列表
        selType();
    })

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }
    //清空部门控件
    function emptyDept(id){
        $("#"+id).val("");
        $("#"+id).attr("deptid","");
    }
    /* 选人控件 */
    $(".addToPersonId").on("click",function(){//发布范围（人员）
        user_id = "toPersonName";
        $.popWindow("../../common/selectUser");
    });
    $(".addParticipator").on("click",function(){//参与人
        user_id = "participatorName";
        $.popWindow("../../common/selectUser");
    });
    $(".addManager").on("click",function(){//负责人
        user_id = "managerName";
        $.popWindow("../../common/selectUser?0");
    });
    $(".addLeader").on("click",function(){//批注领导
        user_id = "leader";
        $.popWindow("../../common/selectUser?0");
    });
    /* 选部门控件 */
    $(".addToId").on("click",function(){//发布范围（部门）
        dept_id = "toName";
        $.popWindow("../../common/selectDept");
    });



    //发布按钮：editFlag==0 为添加操作，editFlag==1 为修改操作
    $("#add_send").click(function () {
        //检查是否为空
       if($("#name").val()==""){
           $.layerMsg({content:"<fmt:message code="event.th.WorkplanEmpty" />！",icon:2},function(){
           });
           return false;
       }else if($("#toName").val()=="" && $("#toPersonName").val()=="" && $("#participatorName").val()==""){
            $.layerMsg({content:"<fmt:message code="event.th.Tame" />！",icon:2},function(){
            });
            return false;
        }
        var clearEndClearFlag=0;
        if($("#endDate").val()==""){
            clearEndClearFlag=1;
        }
        var data={
            toId:$("#toName").attr("deptid"),
            toPersonId:$("#toPersonName").attr("dataid"),
            participator:$("#participatorName").attr("dataid"),
            manager:$("#managerName").attr("dataid"),
            opinionLeader:$("#leader").attr("dataid"),
            clearEndClearFlag:clearEndClearFlag,
            publish:"1"
        }
        if(editFlag==0){//添加操作
            $('#editWorkPlanForm').ajaxSubmit({/*添加时，保存按钮未发布*/
                url:"/workPlan/insertWorkPlan",
                type:'post',
                dataType:'json',
                data:{
                    toId:$("#toName").attr("deptid"),
                    toPersonId:$("#toPersonName").attr("dataid"),
                    participator:$("#participatorName").attr("dataid"),
                    manager:$("#managerName").attr("dataid"),
                    opinionLeader:$("#leader").attr("dataid"),
                    publish:"1"
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/workPlan/workPlanManager';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }else{
            $('#editWorkPlanForm').ajaxSubmit({
                url:"/workPlan/updateWorkPlanById",
                type:'post',
                dataType:'json',
                data:data,
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/workPlan/workPlanManager';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }
    })


    //保存按钮：editFlag==0 为添加操作，editFlag==1 为修改操作
    $("#saveBtn").click(function () {
        //检查是否为空
        if($("#name").val()==""){
            $.layerMsg({content:"<fmt:message code="event.th.WorkplanEmpty" />！",icon:2},function(){
            });
            return false;
        }else if($("#toName").val()=="" && $("#toPersonName").val()=="" && $("#participatorName").val()==""){
            $.layerMsg({content:"<fmt:message code="event.th.Tame" />！",icon:2},function(){
            });
            return false;
        }
        var clearEndClearFlag=0;
        if($("#endDate").val()==""){
            clearEndClearFlag=1;
        }
        var data={
            toId:$("#toName").attr("deptid"),
            toPersonId:$("#toPersonName").attr("dataid"),
            participator:$("#participatorName").attr("dataid"),
            manager:$("#managerName").attr("dataid"),
            opinionLeader:$("#leader").attr("dataid"),
            publish:"0",
            clearEndClearFlag:clearEndClearFlag
        }
        if(editFlag==0){//添加操作
            $('#editWorkPlanForm').ajaxSubmit({/*添加时，保存按钮未发布*/
                url:"/workPlan/insertWorkPlan",
                type:'post',
                dataType:'json',
                data:{
                    toId:$("#toName").attr("deptid"),
                    toPersonId:$("#toPersonName").attr("dataid"),
                    participator:$("#participatorName").attr("dataid"),
                    manager:$("#managerName").attr("dataid"),
                    opinionLeader:$("#leader").attr("dataid"),
                    publish:"0"
                },
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/workPlan/workPlanManager';
                            window.parent.show()
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }else{
            $('#editWorkPlanForm').ajaxSubmit({
                url:"/workPlan/updateWorkPlanById",
                type:'post',
                dataType:'json',
                data:data,
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/workPlan/workPlanManager';
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }
    })

    //加载工作计划类型下拉列表
    function selType(fn){
        $.ajax({
            url:"/planType/selAllPlanType",
            type:'post',
            dataType:'json',
            success:function (json) {
                var data=json.obj;
                if(json.flag){
                    var str='';
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>';
                    }
                    $("#type").html(str);
                    if(fn!=undefined){
                        fn();
                    }
                }
            }
        })
    }
</script>
</body>
</html>
