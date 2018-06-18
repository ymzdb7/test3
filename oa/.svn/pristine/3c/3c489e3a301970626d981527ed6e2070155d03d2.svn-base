<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <title><fmt:message code="event.th.New" /></title><%--新建合同信息--%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">

    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>


    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>

    <style>

        body{
            font-size: 15px;
            font-family: 微软雅黑;
        }

        .TableBlock .TableData td, .TableBlock td.TableData {
            background: #FFFFFF;
            border-bottom: none;
            border-right: none;
            padding: 3px;
        }
        .big3{
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
            font-weight: inherit;
        }


        .btn_ .btn_style {
            background: url("../../img/save.png") no-repeat;
        }
        #rs {
            display: inline-block;
            float: left;
            width: 66px;
            height: 30px;
            text-align: center;
            margin-top: 10px;
            margin-bottom: 20px;
            padding-left: 23px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
            background: url("../../img/publish.png") no-repeat;
            margin-left: 40%;
        }
        .TableData{
            font-size: 14px;
            color: #2a588c;
         /*   font-weight: bold;*/
        }
        .TableBlock tbody tr{
            height: 52px;
        }
        .TableBlock tbody tr td{
            border: 1px solid #c0c0c0;
        }
        .TableBlock{
            border: 1px #124164 solid;
        }


        .TableBlock tr td:first-of-type,table tr td:nth-child(3){
            text-align: right;
        }
        .div_1{
            margin-left: 20px;
        }

    </style>
</head>


<script type="text/javascript">

</script>

<body class="bodycolor" topmargin="5">
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td>
            <div class="div_1">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle"><span class="big3"><fmt:message code="event.th.New" /></span>&nbsp;&nbsp;
            </div>
        </td>
    </tr>
</table>
<br>
<form enctype="multipart/form-data" action=""  method="post" name="form1" onSubmit="return CheckForm();">
    <table class="TableBlock" width="80%" align="center">
        <tr>
            <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="event.th.PlanNumber" />：</td>
            <td class="TableData">
                <input type="text" id="planNo" name="planNo" style="width: 158px;height:28px;" size="12" class="BigInput" value="">&nbsp;
            </td>
            <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="event.th.PlanName" />：</td><%--合同编号--%>
            <td class="TableData" >
                <INPUT type="text" id="planName"  name="planName" style="width: 158px;height:28px;" class=BigInput size="11" value="" />
            </td>
        </tr>

        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingChannel" />：</td>
            <td class="TableData">
                <select name="channel" id="channel" style="background: white; width:170px;height: 28px;" title="">
                    <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                    <option value="0"><fmt:message code="event.th.InternalTraining" /></option>
                    <option value="1"><fmt:message code="event.th.Channeltraining" /></option>
                </select>
            </td>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingForm" />：</td>
            <td class="TableData">
                <select name="courseTypes" style="background: white;width: 170px;height:28px;" id="courseTypes" title="">
                    <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                    <option value="1"><fmt:message code="event.th.FaceToFace" /></option>
                    <option value="2"><fmt:message code="event.th.InstructionCorrespondence" /></option>
                    <option value="3"><fmt:message code="notice.type.other" /></option>
                </select>
            </td>
        </tr>

        <tr>
            <td nowrap class="TableData"><fmt:message code="sup.th.SponsorDepartment" />：</td>
            <td class="TableData">
                <input type="text" id="sponsoringDepartment" name="sponsoringDepartment" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value="">&nbsp;
                <a href="javascript:;" id="departAdd" class="departAdd" ><fmt:message code="global.lang.select" /></a>
            </td>
            <td nowrap class="TableData"><fmt:message code="event.th.PersonCharge" />：</td>
            <td nowrap class="TableData">
                <input type="text" id="chargePerson" name="chargePerson" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value="">&nbsp;
                <a href="javascript:;" id="userAdd" class="userAdd" ><fmt:message code="global.lang.select" /></a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.PlanParticipate" />：</td>
            <td class="TableData">
                <input type="text" id="joinNum" style="width: 158px;height:28px;" name="joinNum" size="12" maxlength="10" class="BigInput" value=""/>
            </td>

            <td nowrap class="TableData"><fmt:message code="event.th.TrainingLocation" />：</td>
            <td class="TableData">
                <input type="text" id="address" style="width: 158px;height:28px;" name="address" size="12" maxlength="10" class="BigInput" value=""/>
            </td>
        </tr>

        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.NameInstitution" />：</td>
            <td class="TableData">
                <input type="text" id="institutionName" style="width: 158px;height:28px;" name="institutionName" size="12" maxlength="10" class="BigInput" value=""/>
            </td>

            <td nowrap class="TableData"><fmt:message code="event.th.ContacInstitution" />：</td>
            <td class="TableData">
                <input type="text" id="institutionContact" style="width: 158px;height:28px;" name="institutionContact" size="12" maxlength="10" class="BigInput" value=""/>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingName" />：</td>
            <td class="TableData">
                <input type="text" id="courseName" style="width: 158px;height:28px;" name="courseName" size="12" maxlength="10" class="BigInput" value=""/>
            </td>

            <td nowrap class="TableData"><fmt:message code="event.th.TotalHours" />：</td>
            <td class="TableData">
                <input type="text" id="courseHours" style="width: 158px;height:28px;" name="courseHours" size="12" maxlength="10" class="BigInput" value=""/>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.OpeningTime" />：</td>
            <td class="TableData">
                <input type="text" id="courseStartTime" style="width: 158px;height:28px;" name="courseStartTime" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"/>
            </td>

            <td nowrap class="TableData"><fmt:message code="meet.th.EndTime" />：</td>
            <td class="TableData">
                <input type="text" id="courseEndTime" style="width: 158px;height:28px;" name="courseEndTime" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"/>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingBudget" />：</td>
            <td class="TableData">
                <input type="text" id="bcws" style="width: 158px;height:28px;" name="bcws" size="12" maxlength="10" class="BigInput" value=""/>
            </td>

            <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.Approver" />：</td>
            <td class="TableData">
                <input type="text" id="assessingOfficer" style="width: 158px;height:28px;" name="assessingOfficer" size="12" maxlength="10" class="BigStatic" value=""/>
                <a href="javascript:;" id="userAdd_1" class="userAdd_1" ><fmt:message code="global.lang.select" /></a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.ParticipateTraining" />：</td>
            <td class="TableData" colspan=3>
                <input type="hidden" name="TO_ID" id="TO_ID">
                <textarea name="joinDept" id="joinDept" cols="84" rows="3"  class="SmallStatic" wrap="yes" readonly></textarea>
                <a href="#" class="orgDepartAdd" title='添加'><fmt:message code="global.lang.add" /></a>
                <a href="#" class="orgDepartClear"  title='清空'><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.Participate" />：</td>
            <td class="TableData" colspan=3>
                <textarea name="joinPerson" id="joinPerson" cols="84" rows="3"  class="SmallStatic" wrap="yes" readonly></textarea>
                <a href="#" class="orgUserAdd" title='添加'><fmt:message code="global.lang.add" /></a>
                <a href="#" class="orgUserClear"  title='清空'><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingRelated" />：</td><%--备注--%>
            <td class="TableData" colspan=3>
                <textarea name="institutionInfo" id="institutionInfo" cols="84" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingInstitutions" />：</td><%--备注--%>
            <td class="TableData" colspan=3>
                <textarea name="instituContactInfo" id="instituContactInfo" cols="84" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingRequirements" />：</td><%--备注--%>
            <td class="TableData" colspan=3>
                <textarea name="requires" id="requires" cols="84" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingInstructions" />：</td><%--备注--%>
            <td class="TableData" colspan=3>
                <textarea name="description" id="description" cols="84" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="journal.th.Remarks" />：</td><%--备注--%>
            <td class="TableData" colspan=3>
                <textarea name="remark" id="remark" cols="84" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>
      <%--  <tr>
            <td nowrap class="TableData">附件上传：</td>
            <td colspan=3>
                    <form id="uploadimgform" target="uploadiframe"  action="../upload?module=meeting" enctype="multipart/form-data" method="post" >
                        <input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">
                        <a href="javascript:;" id="uploadimg">
                            <img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
                    </form>
            </td>
        </tr>--%>
        <tr>
            <td nowrap class="TableData"><fmt:message code="event.th.TrainingContent" />：</td>
            <td class="TableData" colspan=3>
                <textarea name="content" id="content" cols="84" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>
        <tr align="center" class="TableControl">
            <td colspan=4 nowrap>
                <div id="rs" type="save" class="btn_style btn_ok"><fmt:message code="global.lang.save" /></div><%--保存--%>
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    var user_id;
    var depart_id;
    //时间控件调用
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
    $(function () {

        // 获取负责人
        $('.userAdd').click(function(){
            user_id="chargePerson";
            $.popWindow("../../common/selectUser?0");
        });

        //选择部门
        $('#departAdd').click(function(){
            dept_id="sponsoringDepartment";
            $.popWindow("../../common/selectDept?0");
        })
        //获取审批人
        $('.userAdd_1').click(function(){
            user_id="assessingOfficer";
            $.popWindow("../../common/selectUser?0");
        });
        //培训部门
        $('.orgDepartAdd').click(function(){
            dept_id="joinDept";
            $.popWindow("../../common/selectDept");
        });
        //清空
        $('.orgDepartClear').click(function(){
            $('#joinDept').attr("dataid","");
            $('#joinDept').attr("depart_id","");
            $('#joinDept').val("");
        })
        //培训人员
        $('.orgUserAdd').click(function(){
            user_id="joinPerson";
            $.popWindow("../../common/selectUser");
        });
        // 清空
        $('.orgUserClear').click(function(){
            $('#usersInput').attr("dataid","");
            $('#usersInput').attr("user_id","");
            $('#usersInput').val("");
        });

        function CheckForm(){
            if($('#planNo').val()==''){
                layer.msg('<fmt:message  code="event.th.PlanNull"/>',{icon:2});
              return false;
            }
            if($('#planName').val()==''){
                layer.msg('<fmt:message  code="event.th.PlanEmpty"/>',{icon:2});
                return false;
            }
            if($('#assessingOfficer').val()==''){ //审批人不能为空
                layer.msg('<fmt:message  code="withdraw.th.shenpi"/>',{icon:2});
                return false;
            }
            return true;
        }

        // 提交表单
        $("#rs").click(function(){

            if(CheckForm())
            {
                var data = {
                    assessingStatus:0,
                    planNo: $('#planNo').val(),
                    planName: $('#planName').val(),
                    channel: $('#channel').val(),
                    courseTypes: $('#courseTypes').val(),
                    sponsoringDepartment: $('#sponsoringDepartment').attr('deptid'),
                    chargePerson: $('#chargePerson').attr('user_id'),
                    joinNum: $('#joinNum').val(),
                    address: $('#address').val(),
                    institutionName: $('#institutionName').val(),
                    institutionContact: $('#institutionContact').val(),
                    courseName:$('#courseName').val(),
                    courseHours:$('#courseHours').val(),
                    courseStartTime:$('#courseStartTime').val(),
                    courseEndTime:$('#courseEndTime').val(),
                    bcws:$('#bcws').val(),
                    assessingOfficer:$('#assessingOfficer').attr('user_id'),
                    joinDept:$('#joinDept').attr('deptid'),
                    joinPerson:$('#joinPerson').attr('user_id'),
                    institutionInfo:$('#institutionInfo').val(),
                    instituContactInfo:$('#instituContactInfo').val(),
                    requires:$('#requires').val(),
                    description:$('#description').val(),
                    remark:$('#remark').val(),
                    content:$('#content').val()
                }
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>eduTrainPlan/addTrain',
                    dataType: 'json',
                    data: data,
                    success: function (rsp) {
                        if (rsp.flag == true) {
                            layer.msg('<fmt:message code="url.th.addSuccess" />',{icon:1});/*添加成功*/
                           window.location.href='<%=basePath%>/eduTrainPlan/goManage';
                        } else {
                            layer.msg('<fmt:message code="hr.th.AddFailed" />',{icon:2});/*添加失败*/
                        }
                    }
                })

            }
        });

    });
</script>
</body>
</html>

