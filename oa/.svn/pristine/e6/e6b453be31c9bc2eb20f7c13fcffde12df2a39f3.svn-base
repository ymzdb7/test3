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
    <title><fmt:message code="hr.th.ContractDetails" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>

    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
    <style>

       #rs {
            display: inline-block;
            float: left;
            width: 78px;
            height: 38px;
            line-height: 35px;
          /*  margin-right: 30px;*/
            margin-top: 20px;
            margin-bottom: 20px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/newReturn.png) no-repeat;
            padding-left: 19px;
            font-size: 14px;
           margin-left: 50%;

        }


    </style>


</head>


<script type="text/javascript" src="/inc/js_lang.php"></script>
<script type="text/javascript" src="/static/js/attach.js"></script>

<body class="bodycolor">
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td class="Big"><img src="../../img/contractinfo.png" width="17" height="17"><span class="big3"> <fmt:message code="hr.th.ContractDetails" /></span><br>
        </td>
    </tr>
</table>
<br>
<table class="TableBlock" width="90%" align="center">
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="userDetails.th.name" />：</td>
        <td nowrap align="left" class="TableData c_name" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="userManagement.th.role" />：</td>
        <td nowrap align="left" class="TableData c_priv" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.EnglishName" />：</td>
        <td nowrap align="left" class="TableData c_Ename" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractNumber" />：</td>
        <td nowrap align="left" class="TableData con_num" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractSigningCompany" />：</td>
        <td align="left" class="TableData con_company" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="workflow.th.sector" />：</td>
        <td nowrap align="left" class="TableData c_dept" width="180"></td>
    </tr>

    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.typeContract" />：</td>
        <td nowrap align="left" class="TableData con_type" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractualTermAttributes" />：</td>
        <td align="left" class="TableData con_date" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractStatus" />：</td>
        <td nowrap align="left" class="TableData con_zhuangtai" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractDate" />：</td>
        <td nowrap align="left" class="TableData con_qianDate" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractCommencementDate" />：</td>
        <td nowrap align="left" class="TableData con_startDate" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.ContractTerminationDate" />：</td>
        <td align="left" class="TableData con_endTime" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.Does" />：</td>
        <td align="left" class="TableData con_shiyong" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="system.th.UseDeadline" />：</td>
        <td nowrap align="left" class="TableData con_over" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.AreEmployeesActive" />：</td>
        <td align="left" colspan="3" class="TableData con_zhuangzheng" width="180"></td>
    </tr>

    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.Has" />：</td>
        <td align="left" class="TableData con_delete" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.DateContract" />：</td>
        <td align="left" class="TableData con_deleteDate" width="180"></td>
    </tr>

    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.RegistrationTime" />：</td>
        <td nowrap align="left" class="TableData con_onDate" width="180" ></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="netdisk.th.Lastmodifiedtime" />：</td>
        <td nowrap align="left" class="TableData con_lastTime" width="180"></td>
    </tr>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.Reminder" />：</td>
        <td nowrap align="left" colspan="3" class="TableData con_tixing"></td>
    </tr>

    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="journal.th.Remarks" />：</td>
        <td align="left" class="TableData con_beizhu" colspan="3"></td>
    </tr>
   <%-- <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="depatement.th.Attachmentdocument" />：</td>
        <td nowrap align="left" class="TableData" colspan="3">
             <fmt:message code="hr.th.NoAttachments" />   </td>
    </tr>--%>
    <tr align="center" class="TableControl">
        <td colspan="4">
         <%--   <input type="button" value="关闭" class="BigButton" onClick="window.close();" title="关闭窗口">--%>
            <div id="rs" type="save" class="btn_return"><fmt:message code="notice.th.return" /></div>
        </td>
    </tr>
</table>
</body>
    <script>
        $(function(){
            var nid=$.getQueryString('contractId');

            $('#rs').click(function(){
                window.close();
            })

            $.ajax({
                url: "<%=basePath%>/hr/contract/getContractInfo",
                type: "get",
                data: {
                    contractId: nid
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.object;
                    $('.c_name').html(data.userName);/*姓名*/
                    $('.c_Ename').html(data.staffName);
                    $('.con_num').html(data.staffContractNo);/*合同编号*/
                    $('.c_priv').html(data.userPrivName);
                    $('.con_company').html(data.contractEnterpriesName);/**/
                    $('.c_dept').html(data.deptName);
                    $('.con_type').html(data.contractTypeName);
                    $('.con_zhuangtai').html(data.status);
                    $('.con_startDate').html(data.probationEffectiveDate);
                    var shiyong = "";
                    if(data.isTrial==0){
                        shiyong = "<fmt:message code="hr.th.DoesContain" />";
                    }else{
                        shiyong = "<fmt:message code="hr.th.Contain" />";
                    }
                    $('.con_shiyong').html(shiyong);/*是否包含试用期*/
                    var zhuanzheng = "";
                    if(data.passOrNot==0){
                        zhuanzheng = "<fmt:message code="hr.th.NotCompleted" />";
                    }else{
                        zhuanzheng = "<fmt:message code="hr.th.AlreadyMember" />";
                    }
                    $('.con_zhuangzheng').html(zhuanzheng);
                    var con_delete = "";
                    if(data.removeOrNot==0){
                        con_delete = "<fmt:message code="hr.th.NotRelieved" />";
                    }else{
                        con_delete = "<fmt:message code="hr.th.Relieve" />";
                    }
                    $('.con_delete').html(con_delete);
                    $('.con_onDate').html(data.addTime);
                    $('.con_tixing').html(data.remindUser);
                    $('.con_beizhu').html(data.remark);
                    var con_date = "";
                    if(data.contractSpecialization==1){
                        con_date = "<fmt:message code="hr.th.FixedTerm" />";
                    }else if(data.contractSpecialization==2){
                        con_date = "<fmt:message code="hr.th.UnfixedTerm" />";
                    }
                    $('.con_date').html(con_date);
                    $('.con_qianDate').html(data.makeContract);
                    $('.con_endTime').html(data.contractEndTime);
                    $('.con_over').html(data.trailOverTime);
                    $('.con_deleteDate').html(data.contractRemoveTime);
                    $('.con_lastTime').html(data.lastUpdateTime);
                }
            })
        })
    </script>
</html>


