<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="hr.th.ContractInformationInquiry" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <%--<link rel="stylesheet" type="text/css" href="../../css/style.css"/>--%>
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/conmon.css"/>


    <style>
        .Big{
            padding: 10px 20px;
        }
        .big3{
            margin-left: 12px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
        }

    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

    <script type="text/javascript">
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";

        $(function(){


            //删除封装的方法
            function dataDelete(fileId) {
                console.log(fileId);
                layer.confirm(' <fmt:message  code="global.lang.sure"/>', {
                    btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                    title: " <fmt:message  code="notice.th.DeleteFile"/>"
                }, function () {
                    //确定删除，调接口
                    $.ajax({
                        type: 'post',
                        url: '<%=basePath%>/hr/contract/deleteByIds',
                        dataType: 'json',
                        data: {'ids': fileId},
                        success: function () {
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            CheckForm();
                        }
                    })

                }, function () {
                });

            }
            var fileId="";
            //点击删除选中按钮
            $('.TableBlockTwo').on('click', '.notice_delete', function () {
                var notifyId = $(this).attr('notifyId');
                dataDelete(notifyId);
            })


            //查阅情况
            $('.TableBlockTwo ').on('click', '.find_detail', function () {
                var notifyId = $(this).attr('notifyId');
                $.popWindow("contractDetail?contractId=" + notifyId, '<fmt:message code="news.th.querysituation" />', '0', '0', '1150px', '700px');
            })


            /*合同管理中的修改之前的查询接口*/
            $(".TableBlockTwo").on('click', '.notice_change', function () {
                $('.TableBlockTwo').hide();
                $('.content').hide();
                $('#edit').css('display','block');
                var cid = $(this).attr('notifyid');
                $.ajax({
                    type: "post",
                    url: "<%=basePath%>/hr/contract/getContractInfo",
                    dataType: 'json',
                    data: {
                        contractId: cid
                    },
                    success: function (res) {
                        contractId = res.object.contractId;

                        $("input[name='staffName1']").attr("user_id", res.object.staffName);
                        $("input[name='staffName1']").val(res.object.userName);
                        $("input[name='staffContractNo1']").val(res.object.staffContractNo);


                        $('select[name="contractEnterpries1"]').find("option[value='" + res.object.contractEnterpries + "']").attr("selected", true);
                        $('select[name="contractType1"] ').find("option[value='" + res.object.contractType + "']").attr("selected", true);
                        $('select[name="contractSpecialization1"] ').val(res.object.contractSpecialization);
                        $('select[name="userPriv1"] ').val(res.object.userPriv);


                        $('input[name="makeContract1"]').val(res.object.makeContract);
                        $('[name="probationEffectiveDate1"]').val(res.object.probationEffectiveDate);
                        $('[name="contractEndTime1"]').val(res.object.contractEndTime);
                        $('[name="trailOverTime1"]').val(res.object.trailOverTime);
                        if(res.object.isTrial==1){
                            $("#id_msg1").show();
                            $("#id_msg11").show();
                            $('#hetongzhuanzheng').show();
                        }
                        $(":radio[name='TRAIL_PASS_OR_NOT'][value='" + res.object.isTrial + "']").prop("checked", "checked");

                        // 是否转正

                        $(":radio[name='PASS_OR_NOT'][value='" + res.object.passOrNot + "']").prop("checked", "checked");
                        if(res.object.removeOrNot==1){
                            $("#id_msg2").show();
                            $("#id_msg21").show();
                        }
                        $(":radio[name='REMOVE_OR_NOT'][value='" + res.object.removeOrNot + "']").prop("checked", "checked");
                        if( res.object.isRenew==1){
                            $("#id_msg3").show();
                            $("#id_msg31").show();
                        }
                        $(":radio[name='RENEW_OR_NOT'][value='" + res.object.isRenew + "']").prop("checked", "checked");

                        $('[name="contractRemoveTime1"]').val(res.object.contractRemoveTime);
                        $('[name="renewTime1"]').val(res.object.renewTime);
                        $('[name="remindUser1"]').attr("user_id", res.object.remindUser);
                        $('[name="remindUser1"]').val(res.object.remindUserName);
                        $('[name="remark1"]').val(res.object.remark);
                    }
                })
            });

            // 提交修改表单
            $("#rs").click(function () {
                if (CheckFormx()) {
                    var staffName = $("input[name='staffName1']").attr("user_id");
                    if (staffName != undefined && staffName != "") {
                        staffName = staffName.replace(/,/g, '');
                    }
                    var data = {
                        'contractId': contractId,
                        'staffName': staffName,
                        'staffContractNo': $("input[name='staffContractNo1']").val(),
                        'contractEnterpries': $('select[name="contractEnterpries1"] option:checked').val(),
                        'contractType': $('select[name="contractType1"] option:checked').val(),
                        'contractSpecialization': $('select[name="contractSpecialization1"] option:checked').val(),
                        'userPriv': $('select[name="userPriv1"] option:checked').val(),
                        'makeContract': $('input[name="makeContract1"]').val(),
                        'probationEffectiveDate': $('[name="probationEffectiveDate1"]').val(),
                        'contractEndTime': $('[name="contractEndTime1"]').val(),
                        'trailOverTime': $('[name="trailOverTime1"]').val(),
                        'passOrNot': $('[name="PASS_OR_NOT"] checked:checked').val(),
                        'contractRemoveTime': $('[name="contractRemoveTime1"]').val(),
                        'renewTime': $('[name="renewTime1"]').val(),
                        'remindUser': $('[name="remindUser1"]').attr("user_id"),
                        'remark': $('[name="remark1"]').val()
                    }
                    $.ajax({
                        type: 'post',
                        url: '<%=basePath%>/hr/contract/updateContractInfo',
                        dataType: 'json',
                        data: data,
                        success: function (rsp) {
                            if (rsp.flag == true) {
                                layer.msg('<fmt:message code="hr.th.EditorSavedSuccessfully" />', {icon: 6});
                                $('.content').css('display','block');
                                $('#edit').css('display','none');
                                CheckForm();
                            } else {
                                layer.msg('<fmt:message code="hr.th.EditSaveFailed" />', {icon: 2});
                                $('.content').css('display','block');
                                $('#edit').css('display','none');
                                CheckForm();
                            }
                        }
                    })

                }
            });
        })
    </script>

    <style>
        .quertyStyle {
            width: 98%;
            margin-left: 1%;
            margin-top: 7px;
        }
        .find_detail {
            cursor: pointer;
        }
        input {
            width: auto;
            float: none;
            width: 180px;
        }
        .TableBlock tr {
            border: 1px solid #c0c0c0;
        }
        .TableBlock td {
            border: none;
        }

        select {
            width: auto;
            width: 150px;
        }
        .notice_delete{
            cursor: pointer;
            color: #e01919;
            margin-left: 5px;
        }

        .th {
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
        }

        a{
            text-decoration: none;
            color: #2b7fe0;
        }
        input[type="checkbox"]{
            width: 15px;
        }


        .TableBlockOne tr td:first-of-type, table tr td:nth-child(3) {
            /* text-align: right;*/
            /*  width: 13%;*/
        }
        .TableData {
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        .TableBlockOne .TableData input{
            height: 25px;
            width: auto;
            float: none;
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
            margin-left: 20px;
            margin-bottom: 20px;
            padding-left: 23px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
            background: url("../../img/publish.png") no-repeat;
            margin-left: 45%;
        }

        /*.TableBlockOne td {*/
            /*border: 1px solid #c0c0c0;*/
        /*}*/

        table tr td input[type="radio"] {
            height: 15px;
            border: #ccc 1px solid;
            padding-left: 5px;
        }
        #table tr{
            border:1px solid #c0c0c0;
        }
        .TableBlock{
            border:1px;
        }
        .TableBlock tr td{
            border-bottom:0px;
            border-right:0px;
            border-left:0px;
        }
        .TableBlock input{
            text-align:left;
        }
        .TableBlockOne{
            border:1px solid #c0c0c0;
        }
        .TableBlockTwo{
            border:1px solid #c0c0c0;
        }
        .TableBlockOne tr{
            border:1px solid #c0c0c0;
         }
        .TableBlockTwo tr td{
            border-top:1px solid #c0c0c0;
        }
        .small tr{
            border:none;
        }





    </style>
</head>


<link rel="stylesheet" type="text/css" href="/static/theme/15/bbs.css">
<script src="/static/js/module.js?v=150805"></script>

<body class="bodycolor" topmargin="5">

<div class="content" style="display: block;">
    <table border="0" width="80%" cellspacing="0" cellpadding="3" class="small">
        <tr style="border: none">
            <td class="Big" style="padding: 20px 30px;"><img align="absMiddle" src="/img/commonTheme/${sessionScope.InterfaceModel}/infofind.png" style="    margin-bottom: 3px;"><span class="big3"> <fmt:message code="hr.th.ContractInformationInquiry" /></span></td>
        </tr>
    </table>

    <div class="right">
        <div class="M-box3"></div>
    </div>
    <table class="info">
        <form method="post" name="form1">
            <table class="TableBlock" id="table" width="450" align="center" style="border:1px solid #c0c0c0">
                <tr>
                    <th colspan="2"><fmt:message code="hr.th.ContractInformationInquiry" /></th>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="hr.th.UnitStaff" />：</td>
                    <td class="TableData">
                        <input type="text" id="staffName" name="staffName" size="13" class="BigStatic" value="">&nbsp;
                        <a href="javascript:;" class="userAdd"><fmt:message code="global.lang.select" /></a>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"><fmt:message code="hr.th.ContractNumber" />：</td>
                    <td class="TableData">
                        <INPUT type="text" id="staffContractNo" name="STAFF_CONTRACT_NO" class=BigInput size="13" value="">
                    </td>
                </tr>
                <tr>
                <tr>
                    <td nowrap class="TableData" width="100"> <fmt:message code="hr.th.typeContract" />：</td>
                    <td class="TableData">
                        <select id="contractType" name="contractType" style="background: white;"
                                title="<fmt:message code="hr.th.TheTypeOfContract" />。">

                        </select>
                    </td>
                </tr>

                <tr>
                    <td nowrap class="TableData"> <fmt:message code="hr.th.ContractDate" />：</td>
                    <td class="TableData">
                        <input type="text" id="SignstartTime" name="MAKE_CONTRACT1" size="10" maxlength="10"
                               class="BigInput" value="" onClick="laydates($(this))"/>
                        <fmt:message code="global.lang.to" /><input type="text" id="SignendTime" name="MAKE_CONTRACT2" size="10" maxlength="10" class="BigInput"
                                                                    value="" onClick="laydates($(this))"/>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"> <fmt:message code="hr.th.TrialExpirationDate" />：</td>
                    <td class="TableData">
                        <input type="text" id="TrialstartTime" name="TRAIL_OVER_TIME1" size="10" maxlength="10"
                               class="BigInput" value="" onClick="laydates($(this))"/>
                        <fmt:message code="global.lang.to" /><input type="text" id="TrialendTime" name="TRAIL_OVER_TIME2" size="10" maxlength="10"
                                                                    class="BigInput" value="" onClick="laydates($(this))"/>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"> <fmt:message code="hr.th.ContractMaturityDate" />：</td>
                    <td class="TableData">
                        <input type="text" id="MaturitystartTime" name="CONTRACT_END_TIME1" size="10" maxlength="10"
                               class="BigInput" value="" onClick="laydates($(this))"/>
                        <fmt:message code="global.lang.to" /> <input type="text" id="MaturityendTime" name="CONTRACT_END_TIME2" size="10" maxlength="10"
                                                                     class="BigInput" value="" onClick="laydates($(this))"/>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData"> <fmt:message code="hr.th.DateContract" />：</td>
                    <td class="TableData">
                        <input type="text" id="RelievestartTime" name="CONTRACT_REMOVE_TIME1" size="10" maxlength="10"
                               class="BigInput" value="" onClick="laydates($(this))"/>
                        <fmt:message code="global.lang.to" /> <input type="text" id="RelieveendTime" name="CONTRACT_REMOVE_TIME2" size="10" maxlength="10"
                                                                     class="BigInput" value="" onClick="laydates($(this))"/>
                    </td>
                </tr>

                <tr>
                    <td nowrap class="TableData"><fmt:message code="hr.th.ContractSigningCompany" />：</td>
                    <td class="TableData">
                        <select id="contractEnterpries" name="contractEnterpries" style="background: white;"
                                title="<fmt:message code="hr.th.TheContractSigning" />。">
                        </select>
                    </td>
                </tr>

                <tr>
                    <td nowrap class="TableData"><fmt:message code="hr.th.ContractualTermAttributes" />：</td>
                    <td class="TableData">
                        <select name="CONTRACT_SPECIALIZATION" id="contractSpecialization">
                            <option value=""><fmt:message code="hr.th.ContractualTermAttributes" /></option>
                            <option value="1"><fmt:message code="hr.th.FixedTerm" /></option>
                            <option value="2"><fmt:message code="hr.th.UnfixedTerm" /></option>
                            <option value="3"><fmt:message code="hr.th.ForDuration" /></option>
                        </select>
                    </td>
                </tr>

                <tr align="center" class="TableControl">
                    <td colspan="2" nowrap>
                        <%--<input type="button" value="查询" class="BigButton" onclick="CheckForm()">--%>
                        <div  class="BigButton" onclick="CheckForm()"><span style="margin-left: 6px;"><fmt:message code="global.lang.query" /></span></div>
                    </td>
                </tr>
            </table>
        </form>
    </table>
</div>

<%--编辑页面--%>
<div class="bodycolor con_edit" id="edit" style="display: none;" topmargin="5">
    <table border="1px" width="100%" cellspacing="0" cellpadding="0" class="small2">
        <tbody class="tb1"><tr>
            <td class="td1">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle"><span class="big4"> <fmt:message code="hr.th.ModifyContractInformation" /></span>&nbsp;&nbsp;
            </td>
        </tr>
        <tr>
            <td><fmt:message code="hr.th.Note" />。</td>
        </tr>
        </tbody></table>
    <br>
    <form enctype="multipart/form-data" action="" method="post" name="form1" onsubmit="return CheckForm();">
        <table class="TableBlockOne" width="80%" cellspacing="0" cellpadding="0" border="1px" align="center">
            <tbody><tr>
                <td nowrap="" class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.Employee" />：</td>
                <td class="TableData">
                    <input type="text" id="staffName1" name="staffName1" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly="" value="" user_id="">&nbsp;
                    <a href="javascript:;" id="" class="userAdd1"><fmt:message code="global.lang.select" /></a>
                </td>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.ContractNumber" />：</td>
                <td class="TableData">
                    <input type="text" name="staffContractNo1" style="width: 158px;height:28px;" class="BigInput" size="11" value="">
                </td>
            </tr>

            <tr>
                <td nowrap="" class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.ContractSigningCompany" />：</td>
                <td class="TableData">
                    <select name="contractEnterpries1" style="background: white; width:170px;height: 28px;" title="<fmt:message code="hr.th.TheContract" />"></select>
                </td>
                <td nowrap="" class="TableData"><span style="color: red;">*</span><fmt:message code="hr.th.ContractualTermAttributes" />：</td>
                <td class="TableData">
                    <select name="contractType1" style="background: white;width: 170px;height:28px;" id="CONTRACT_TYPE1" title="<fmt:message code="hr.th.TheTypeO" />。">
                        <%-- <option value="">合同类型&nbsp;&nbsp;</option><option value="1">实习协议</option><option value="2">保密协议</option><option value="3">聘用合同</option><option value="4" selected="selected">录用合同</option><option value="5">兼职合同</option><option value="6">借调合同</option><option value="7">集体合同</option></select>--%>
                </td>
            </tr>

            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.ContractualTermAttributes" />：</td>
                <td class="TableData">
                    <select name="contractSpecialization1" style="width: 170px;height:28px;" id="CONTRACT_SPECIALIZATION1">
                        <option value="1"><fmt:message code="hr.th.FixedTerm" /></option>
                        <option value="2"><fmt:message code="hr.th.UnfixedTerm" /></option>
                        <option value="3"><fmt:message code="hr.th.ForDuration" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData"><fmt:message code="userManagement.th.role" />：</td>
                <td nowrap="" class="TableData">
                    <select name="userPriv1" style="background: white; width: 170px;height:28px;" title="<fmt:message code="hr.th.InTheRoleOf" />。">
                        <%--  <option value="">请选择角色&nbsp;&nbsp;</option><option value="1">OA管理员</option><option value="2">CEO</option><option value="3">财务总监</option><option value="4">部门经理</option><option value="7">管理部总监</option><option value="6">行政经理</option><option value="8">人力资源总监</option><option value="9">研发总监</option><option value="10">人事经理</option><option value="13">营销总监</option><option value="14">区域销售经理</option><option value="17">设计部经理</option><option value="11">会计</option><option value="12">出纳</option><option value="15">销售主管</option><option value="16">销售经理</option><option value="18">研发工程师</option><option value="22">测试角色1</option><option value="5">职员</option></select>--%>
                        <span style="font-size: 12px;color: #666666;"><fmt:message code="hr.th.doNotSelect" /></span>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.ContractDate" />：</td>
                <td class="TableData">
                    <input type="text" id="makeContract1" style="width: 158px;height:28px;" name="makeContract1" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                </td>

                <td nowrap="" class="TableData"><span><span style="color: red;">*</span><fmt:message code="hr.th.ContractCommencementDate" />：</span></td>
                <td class="TableData">
      	<span>
         <input type="text" id="probationEffectiveDate1" style="width: 158px;height:28px;" name="probationEffectiveDate1" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
        </span>
                </td>
            </tr>

            <tr id="contractEndTime">
                <td nowrap="" class="TableData"><span><fmt:message code="hr.th.ContractTerminationDate" />：</span> </td>
                <td class="TableData">
            <span>
             <input type="text" name="contractEndTime1" style=" width:158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
            </span>
                </td>
                <td nowrap="" class="TableData"></td>
                <td nowrap="" class="TableData"></td>
            </tr>
            <tr id="shiyong">
                <td nowrap="" class="TableData"><fmt:message code="hr.th.Does" />：</td>
                <td class="TableData">
                    <input type="radio" name="TRAIL_PASS_OR_NOT" class="radio_1" value="1" onclick="expandIt1()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                    <input type="radio" name="TRAIL_PASS_OR_NOT" class="radio_1" value="0" onclick="expandIt1()" checked=""> <fmt:message code="global.lang.no" />       </td>
                <td nowrap="" class="TableData"><span id="id_msg1" style="display:none"><fmt:message code="system.th.UseDeadline" />：</span></td>
                <td class="TableData">
              <span id="id_msg11" style="display:none">
                <input type="text" name="trailOverTime1" style="width:158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
              </span>
                </td>
            </tr>

            <tr style="display: none" id="hetongzhuanzheng">
                <td nowrap="" class="TableData"><fmt:message code="hr.th.AreEmployeesActive" />：</td>
                <td class="TableData">
                    <input type="radio" name="PASS_OR_NOT" value="1"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                    <input type="radio" name="PASS_OR_NOT" value="0" checked=""> <fmt:message code="global.lang.no" />			</td>

                <td nowrap="" class="TableData">
                </td>
                <td nowrap="" class="TableData">
                </td>
            </tr>

            <tr id="hetongjiechu">
                <td nowrap="" class="TableData" id="shifoujiechu"><fmt:message code="hr.th.HasDischarged" />：</td>
                <td class="TableData">
                    <input type="radio" name="REMOVE_OR_NOT" class="radio_2" value="1" onclick="expandIt2()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                    <input type="radio" name="REMOVE_OR_NOT" class="radio_2" value="0" onclick="expandIt2()" checked=""> <fmt:message code="global.lang.no" />			</td>

                <td nowrap="" class="TableData"><span id="id_msg2" style="display:none"><fmt:message code="hr.th.DateContract" />：</span></td>
                <td class="TableData">
      <span id="id_msg21" style="display:none">
       <input type="text" name="contractRemoveTime1" style="width: 158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
      </span>
                </td>
            </tr>

            <tr id="hetongxuqian">
                <td nowrap="" class="TableData"><fmt:message code="hr.th.IsRenewed" />：</td>
                <td class="TableData">
                    <input type="radio" name="RENEW_OR_NOT" value="1" class="radio_3" onclick="expandIt3()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                    <input type="radio" name="RENEW_OR_NOT" value="0" class="radio_3" onclick="expandIt3()" checked=""> <fmt:message code="global.lang.no" />			</td>
                <td nowrap="" class="TableData"><span id="id_msg3" style="display:none"><fmt:message code="hr.th.RenewalDate" />：</span></td>
                <td class="TableData">
      <span id="id_msg31" style="display:none">
       <input type="text" name="renewTime1" size="12" style="width: 158px;height: 28px;" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
      </span>
                </td>
            </tr>
            <%--<tr>
                <td nowrap="" class="TableData"> 提醒方式：</td>
                <td class="TableData" colspan="3">
                </td>
            </tr>--%>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.Reminder" />：</td>
                <td class="TableData" colspan="3">
                    <input type="hidden" name="TO_ID" id="TO_ID">
                    <textarea name="remindUser1" id="remindUser1" cols="75" rows="3" class="SmallStatic" wrap="yes" readonly="" user_id=""></textarea>
                    <a href="#" class="orgAdd" title='<fmt:message code="doc.th.AddReminders" />'><fmt:message code="global.lang.add" /></a><%--添加提醒人员--%>
                    <a href="#" class="orgClear" title='<fmt:message code="doc.th.EmptyReminder" />'><fmt:message code="global.lang.empty" /></a><%--清空提醒人员--%>

                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="journal.th.Remarks" />：</td>
                <td class="TableData" colspan="3">
                    <textarea name="remark1" cols="75" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>


            <tr align="center" class="TableControl">
                <td colspan="4" nowrap="">

                    <div id="rs" type="save" class="btn_style btn_ok"><fmt:message code="global.lang.save" /></div>
                </td>
            </tr>
            </tbody></table>
    </form>

    <script type="text/javascript">
        $(document).ready(function () {
            $(".xinxiyinchneg").remove();
        });
        var user_id = "";

        // 获取用户信息控件
        $('.userAdd1').click(function () {
            user_id = "staffName1";
            $.popWindow("../../common/selectUser?0");
        });

        // 获取人员信息控件
        $('.orgAdd').click(function () {
            user_id = "remindUser1";
            $.popWindow("../../common/selectUser");
        });
        // 清空
        $('.orgClear').click(function () {
            $('#remindUser1').attr("dataid", "");
            $('#remindUser1').attr("user_id", "");
            $('#remindUser1').val("");
        });

        function expandIt1() {
            whichE1 = document.getElementById("id_msg1");
            whichE2 = document.getElementById("id_msg11");
            whichE10 = document.getElementById("hetongzhuanzheng");
            if (   $('.radio_1:checked').val()==1) {
                whichE1.style.display = '';
                whichE2.style.display = '';
                whichE10.style.display = '';
            }
            if (   $('.radio_1:checked').val()==0) {
                whichE1.style.display = 'none';
                whichE2.style.display = 'none';
                whichE10.style.display = 'none';
            }
        }
        function expandIt2() {
            whichE3 = document.getElementById("id_msg2");
            whichE4 = document.getElementById("id_msg21");
            if ($('.radio_2:checked').val()==1) {
                whichE3.style.display = '';
                whichE4.style.display = '';
            }
            if ($('.radio_2:checked').val()==0) {
                whichE3.style.display = 'none';
                whichE4.style.display = 'none';
            }
        }
        function expandIt3() {
            whichE5 = document.getElementById("id_msg3");
            whichE6 = document.getElementById("id_msg31");
            if ($('.radio_3:checked').val()==1) {
                whichE5.style.display = '';
                whichE6.style.display = '';
            }
            if ($('.radio_3:checked').val()==0) {
                whichE5.style.display = 'none';
                whichE6.style.display = 'none';
            }
        }


    </script>
</div>
<table class="TableBlockTwo">
    <tbody>

    </tbody>
</table>



</body>
<script>

    // 获取用户信息控件
    $('.userAdd').click(function () {
        user_id = "staffName";
        $.popWindow("../../common/selectUser?0");
    });


    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false
        /*  choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas //将结束日的初始值设定为开始日
         }*/
    };
    function laydates(e){

        var id = e.attr('id');
        laydate({
            elem: '#'+id, //目标元素。
            format: 'YYYY-MM-DD', //日期格式
            istime: true //显示时、分、秒
        })
    }
    var pageData = {
        "page": 1,
        "pageSize": 5,
        "useFlag": true
    }
    function CheckForm(pageCount) {
        initPagination(pageCount, pageData.pageSize);
    };
    // 分页
    function initPagination(totalData, pageSize) {

        $('.M-box3').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            current: pageData.page,
            homePage: '<fmt:message code="global.page.first" />',
            endPage: '<fmt:message code="global.page.last" />',
            prevContent: '<fmt:message code="global.page.pre" />',
            nextContent: '<fmt:message code="global.page.next" />',
            jumpBtn: '<fmt:message code="global.page.jump" />',
            callback: function (index) {
                pageData.page = index.getCurrent();
                CheckForm(function (pageCount) {
                    initPagination(pageCount, pageData.pageSize);
                });

            }
        });
    }
    function CheckForm(cb) {
        var staffName = $('#staffName').attr('user_id');
        if(staffName!=undefined && staffName!=""){
            staffName= staffName.replace(/,/g,'');
        }
        pageData.staffName=staffName;
        pageData.staffContractNo= $('#staffContractNo').val();
        pageData.contractType=$('#contractType').val();
        pageData.SignstartTime=$('#SignstartTime').val();
        pageData.SignendTime= $('#SignendTime').val(),
            pageData.TrialstartTime= $('#TrialstartTime').val(),
            pageData.TrialendTime= $('#TrialendTime').val(),
            pageData.MaturitystartTime= $('#MaturitystartTime').val(),
            pageData.MaturityendTime= $('#MaturityendTime').val(),
            pageData.RelievestartTime= $('#RelievestartTime').val(),
            pageData.RelieveendTime= $('#RelieveendTime').val(),
            pageData.contractEnterpries= $('#contractEnterpries').val(),
            pageData.contractSpecialization= $('#contractSpecialization').val()


        var str = "<tr class=\"msg\"><td></td><td class='th'><fmt:message code="userDetails.th.name" /></td><td class='th'><fmt:message code="hr.th.department" /></td><td class='th'><fmt:message code="hr.th.post" /></td><td class='th'><fmt:message code="hr.th.typeContract" /></td><td class='th'><fmt:message code="hr.th.SignCompany" /></td><td class='th'><fmt:message code="hr.th.ContractCommencementDate" /></td><td class='th'><fmt:message code="hr.th.TrialDate" /></td><td class='th'><fmt:message code="hr.th.ContractTime" /></td><td class='th'><fmt:message code="menuSSetting.th.menuSetting" /></td><tr>";
        $.ajax({
            type: "get",
            url: "../../hr/contract/getContract",
            dataType: 'json',
            data: pageData,
            success: function (result) {
                var data = result.obj;
                if (data != '') {
                    $('.small').html("<tr><td class=\"Big\"><img src=\"/img/commonTheme/${sessionScope.InterfaceModel}/infofind.png\"><span class=\"big3\"><fmt:message code="hr.th.ContractResults" /></span></td></tr>");
                    for (var i = 0; i < data.length; i++) {
                        if (data[i].probationEffectiveDate != null && data[i].probationEffectiveDate != '') {
                            var c = new Date(data[i].probationEffectiveDate);
                        } else {
                            var c = '';
                        }
                        if (data[i].trailOverTime != null && data[i].trailOverTime != '') {
                            var d = new Date(data[i].trailOverTime);
                        } else {
                            var d = '';
                        }
                        if (data[i].contractEndTime != null && data[i].contractEndTime != '') {
                            var e = new Date(data[i].contractEndTime);
                        } else {
                            var e = '';
                        }
                        // str=str+"<tr><td>"+data[i].userName+"</td><td>"+data[i].deptName+"</td><td>"+data[i].postName+"</td><td>"+data[i].contractType+"</td><td>"+data[i].contractEnterpries+"</td><td>"+formatDate(c)+"</td><td>"+formatDate(d)+"</td><td>"+formatDate(e)+"</td><td><a id=\"detail_id\" style='color:#1772c0;'>详细信息</a></td></tr>";
                        str += "<tr class='notice_tr' notifyId=" + data[i].contractId + ">" +
                            "<td><input class='checkChild' type='checkbox' conid='" + data[i].contractId + "' name='check' value=''></td>" +
                            "<td notifyId=" + data[i].contractId + " class=' '>" + function () {
                                if (data[i].userName == undefined || data[i].userName == "") {
                                    return "<fmt:message code="hr.th.UserNotExist" />"
                                } else {
                                    return data[i].userName
                                }
                            }() + "</td>" +
                            "<td notifyId=" + data[i].contractId + " class=' ' >" + function () {
                                if (data[i].deptName == undefined || data[i].deptName == "") {
                                    return "<fmt:message code="hr.th.DepartmentNoExists" />"
                                } else {
                                    return data[i].deptName
                                }
                            }() + "</td>" +
                            "<td notifyId=" + data[i].contractId + " class='  publishtip'>" + data[i].postName + "</td>" +
                            "<td class='' notifyId=" + data[i].contractId + ">" + data[i].contractTypeName + "</td>" +
                            "<td class='send_time' notifyId=" + data[i].contractId + " class=' '>" + data[i].contractEnterpriesName + "</td>" +
                            "<td class='start_time' href='#' notifyId=" + data[i].contractId + " class=' '>" + data[i].probationEffectiveDate + "</td>" +
                            "<td class='end_time' href='#' notifyId=" + data[i].contractId + " class=' '>" + function () {
                                if (data[i].trailOverTime == undefined) {
                                    return ""
                                } else {
                                    return data[i].trailOverTime
                                }
                            }() + "</td>" +
                            "<td class='end_time' href='#' notifyId=" + data[i].contractId + " class=''>" + function () {
                                if (data[i].contractEndTime == undefined) {
                                    return ""
                                } else {
                                    return data[i].contractEndTime
                                }
                            }() + "</td><td class='caozuo'>"+"<a class='find_detail' notifyId="+data[i].contractId+" style='color:#1772c0;'><fmt:message code="hr.th.detailedInformation" /></a>&nbsp<a href='javascript:;' notifyId="+data[i].contractId+" class='notice_change'><fmt:message code="depatement.th.modify" /></a><a class='notice_delete' notifyId="+data[i].contractId+"><fmt:message code="menuSSetting.th.deleteMenu" /></a></td>"
                        /*"<td class='caozuo'>"+"<a class='find_detail' notifyId="+data[i].contractId+" style='color:#1772c0;'>详细信息</a>&nbsp<a notifyId="+data[i].contractId+" class='notice_change'>修改</a><a class='notice_delete' notifyId="+data[i].contractId+">删除</a></td>"//操作*/

                    }

                    initPagination(result.totleNum, 5);

                    $(".TableBlockTwo").addClass("quertyStyle");
                    $(".TableBlockTwo").html(str);
                    $(".TableBlock").hide();
                    $(".TableBlockTwo").show();
                } else {
                    $(".TableBlockTwo").html("");
                    layer.msg('<fmt:message code="hr.th.NoMoreFound" />', {icon: 6});
                }
                if (cb) {
                    cb(result.totleNum);
                }
            }
        });
    }
    $(function () {


        // 获取所有合同类型信息
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type: 'get',
            dataType: "JSON",
            data: {"CodeNos": "HR_STAFF_CONTRACT1"},
            success: function (data) {
                var str = '<option value=""><fmt:message code="hr.th.typeContract" />&nbsp;&nbsp;</option>';
                for (var proId in data) {
                    for (var i = 0; i < data[proId].length; i++) {
                        str += '<option value="' + data[proId][i].codeNo + '">' + data[proId][i].codeName + '</option>'
                    }
                }
                $('select[name="contractType"]').append(str);
                $('select[name="contractType1"]').append(str);
            }
        });

        // 获取签约公司信息
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type: 'get',
            dataType: "JSON",
            data: {"CodeNos": "HR_ENTERPRISE"},
            success: function (data) {
                var str = '<option value=""><fmt:message code="hr.th.ContractSigningCompany" />&nbsp;&nbsp;</option>';
                for (var proId in data) {
                    for (var i = 0; i < data[proId].length; i++) {
                        str += '<option value="' + data[proId][i].codeNo + '">' + data[proId][i].codeName + '</option>'
                    }

                }
                $('select[name="contractEnterpries"]').append(str);
                $('select[name="contractEnterpries1"]').append(str);
            }
        });

        // 获取角色信息
        $.ajax({
            url: "<%=basePath%>/getAllUserPriv",
            type: 'get',
            dataType: "JSON",
            data: {"CodeNos": "HR_ENTERPRISE"},
            success: function (data) {
                var data=data.obj;
                var str = '<option value=""><fmt:message code="hr.th.SelectRoles" />&nbsp;&nbsp;</option>';
                for(var i=0;i<data.length;i++){
                    if (data[i].userPriv != undefined) {
                        str += '<option value="' + data[i].userPriv + '">' + data[i].privName + '</option>'
                    }
                }
                $('select[name="userPriv1"]').append(str);
            }
        });






        function formatDate(now) {
            if (now != '' && now != undefined) {
                var year = now.getFullYear();
                var month = now.getMonth() + 1;
                var date = now.getDate();
                var hour = now.getHours();
                var minute = now.getMinutes();
                var second = now.getSeconds();
                return year + "-" + month + "-" + date;
            } else {
                return "";
            }
        }


    });
    // 验证表单
    function CheckFormx() {

        if ($('#staffName1').attr('user_id') == "") {
            layer.msg("<fmt:message code="hr.th.EmployeeEmpty" />！");
            return (false);
        }
        if ($('select[name="contractEnterpries1"] option:checked').val() == "") {
            layer.msg("<fmt:message code="hr.th.SigningCompany" />！");
            return (false);
        }
        if ($('select[name="contractType1"] option:checked').val() == "") {
            layer.msg("<fmt:message code="hr.th.contractType" />！");
            return (false);
        }

        if ($('[name="probationEffectiveDate1"]').val() == "") {
            layer.msg("<fmt:message code="hr.th.TheEffectiveNull" />！");
            return (false);
        }
        if ($('[name="PASS_OR_NOT"] checked:checked').val() == 1 && $('[name="trailOverTime1"]').val() == "") {
            layer.msg("<fmt:message code="hr.th.Trialdeadline" />！");
            return (false);
        }

        if ( $('[name="PASS_OR_NOT"] checked:checked').val() == 1 && $('[name="contractRemoveTime1"]').val() == "") {
            layer.msg("<fmt:message code="hr.th.contractReleaseDate" />！");
            return (false);
        }
        if ($('.radio_3:checked').val() == 1 &&  $('[name="renewTime1"]').val() == "") {
            layer.msg("<fmt:message code="hr.th.renewal" />！");
            return (false);
        }

        if ($('[name="probationEffectiveDate1"]').val() != "" && $('input[name="makeContract1"]').val() != "" && $('input[name="makeContract1"]').val() > $('[name="probationEffectiveDate1"]').val()) {
            layer.msg("<fmt:message code="hr.th.TheEffectiveDate" />！");
            return (false);
        }

        if ($('.radio_1:checked').val() == 1 && $('[name="trailOverTime1"]').val() != "" && $('[name="contractEndTime"]').val() != "" && $('[name="trailOverTime1"]').val() > $('[name="contractEndTime1"]').val()) {
            layer.msg("<fmt:message code="hr.th.ExceedContract" />！");
            return (false);
        }

        if ($('.radio_1:checked').val() == 1 && $('[name="trailOverTime"]').val() != "" && $('[name="trailOverTime"]').val() < $('[name="probationEffectiveDate"]').val()) {
            layer.msg("<fmt:message code="hr.th.trialDeadline" />！");
            return (false);
        }

        if ($('[name="contractEndTime1"]').val() != "" && $('[name="contractEndTime1"]').val() < $('[name="probationEffectiveDate1"]').val()) {
            layer.msg("<fmt:message code="hr.th.TerminationContract" />！");
            return (false);
        }

        if ($('.radio_2:checked').val() == 1 && $('[name="contractRemoveTime1"]').val() != "" && $('[name="contractRemoveTime1"]').val() < $('[name="probationEffectiveDate1"]').val()) {
            layer.msg("<fmt:message code="hr.th.EffectiveContract" />！");
            return (false);
        }

        if ($('.radio_3:checked').val() == 1 &&  $('[name="renewTime1"]').val() != "" &&  $('[name="renewTime1"]').val() < $('[name="contractEndTime1"]').val()) {
            layer.msg("<fmt:message code="hr.th.terminationContract" />！");
            return (false);
        }

        if ($('.radio_3:checked').val() == 1 && $('[name="renewTime1"]').val() != "" && $('[name="renewTime1"]').val() < $('[name="probationEffectiveDate1"]').val()) {
            layer.msg("<fmt:message code="hr.th.EffectiveDate" />！");
            return (false);
        }

        return (true);
    }







</script>
</html>