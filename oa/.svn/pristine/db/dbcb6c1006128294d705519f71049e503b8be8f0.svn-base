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
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="hr.th.NewContractInformation" /></title><%--新建合同信息--%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">

    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>


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
            padding-left: 20px;
        }
        .big3{
            margin-left: 12px;
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

        .TableBlock tr td:first-of-type,table tr td:nth-child(3){
            text-align: right;
        }

    </style>
</head>


<script Language="JavaScript">
    var upload_limit=1,limit_type="php,php3,php4,php5,";
    function CheckForm()
    {
        var TRAIL_PASS_OR_NOT_VALUE="";
        var REMOVE_OR_NOT_VALUE="";
        var RENEW_OR_NOT_VALUE="";
        var a = document.getElementsByName("TRAIL_PASS_OR_NOT");
        var b = document.getElementsByName("REMOVE_OR_NOT");
        var c = document.getElementsByName("RENEW_OR_NOT");
        for(i=0;i<a.length;i++)
        {
            if(a[i].checked)
                TRAIL_PASS_OR_NOT_VALUE = a[i].value;
        }

        for(i=0;i<b.length;i++)
        {
            if(b[i].checked)
                REMOVE_OR_NOT_VALUE = b[i].value;
        }

        for(i=0;i<c.length;i++)
        {
            if(c[i].checked)
                RENEW_OR_NOT_VALUE = c[i].value;
        }

        if(document.form1.staffName1.value=="")
        {
            layer.msg("<fmt:message code="hr.th.EmployeeEmpty" />！");/*雇员姓名不能为空*/
            return (false);
        }
        if(document.form1.contractEnterpries.value=="")
        {
            layer.msg("<fmt:message code="hr.th.SigningCompany" />！");/*请选择合同签约公司*/
            return (false);
        }
        if(document.form1.contractType.value=="")
        {
            layer.msg("<fmt:message code="hr.th.contractType" />！");/*请选择合同类型*/
            return (false);
        }

        if(document.form1.probationEffectiveDate.value=="")
        {
            layer.msg("<fmt:message code="hr.th.TheEffectiveNull" />！");/*合同生效日期不能为空*/
            return (false);
        }
        if(TRAIL_PASS_OR_NOT_VALUE==1 && document.form1.trailOverTime.value == "")
        {
            layer.msg("<fmt:message code="hr.th.Trialdeadline" />！");/*请输入试用截止日期*/
            return (false);
        }

        if(REMOVE_OR_NOT_VALUE==1 && document.form1.contractRemoveTime.value == "")
        {
            layer.msg("<fmt:message code="hr.th.contractReleaseDate" />！");/*请输入合同解除日期*/
            return (false);
        }
        if(RENEW_OR_NOT_VALUE==1 && document.form1.renewTime.value == "")
        {
            layer.msg("<fmt:message code="hr.th.renewal" />！");/*请输入续签到期日期*/
            return (false);
        }

        if(document.form1.probationEffectiveDate.value!="" && document.form1.makeContract.value!="" && document.form1.makeContract.value > document.form1.probationEffectiveDate.value)
        {
            layer.msg("<fmt:message code="hr.th.TheEffectiveDate" />！");/*合同生效日期不能小于合同签订日期*/
            return (false);
        }

        if(TRAIL_PASS_OR_NOT_VALUE==1 && document.form1.trailOverTime.value!="" && document.form1.contractEndTime.value!="" && document.form1.trailOverTime.value > document.form1.contractEndTime.value)
        {
            layer.msg("<fmt:message code="hr.th.ExceedContract" />！");/*试用截止日期不能大于合同终止日期*/
            return (false);
        }

        if(TRAIL_PASS_OR_NOT_VALUE==1 && document.form1.trailOverTime.value!="" && document.form1.trailOverTime.value < document.form1.probationEffectiveDate.value)
        {
            layer.msg("<fmt:message code="hr.th.trialDeadline" />！");/*试用截止日期不能小于同生效日期*/
            return (false);
        }

        if(document.form1.contractEndTime.value!="" && document.form1.contractEndTime.value < document.form1.probationEffectiveDate.value)
        {
            layer.msg("<fmt:message code="hr.th.TerminationContract" />！");/*合同终止日期不能小于合同生效日期*/
            return (false);
        }

        if(REMOVE_OR_NOT_VALUE==1 && document.form1.contractRemoveTime.value!="" && document.form1.contractRemoveTime.value < document.form1.probationEffectiveDate.value)
        {
            layer.msg("<fmt:message code="hr.th.EffectiveContract" />！");/*合同解除日期不能小于合同生效日期*/
            return (false);
        }

        if(RENEW_OR_NOT_VALUE==1 && document.form1.renewTime.value!="" && document.form1.renewTime.value < document.form1.contractEndTime.value)
        {
            layer.msg("<fmt:message code="hr.th.terminationContract" />！");/*合同续签日期不能小于合同终止日期*/
            return (false);
        }

        if(RENEW_OR_NOT_VALUE==1 && document.form1.renewTime.value!="" && document.form1.renewTime.value < document.form1.probationEffectiveDate.value)
        {
            layer.msg("<fmt:message code="hr.th.EffectiveDate" />！");/*合同续签日期不能小于同生效日期*/
            return (false);
        }

        return (true);
    }
    function upload_attach()
    {
        if(CheckForm())
        {
            document.form1.submit();
        }
    }
    function delete_attach(ATTACHMENT_ID,ATTACHMENT_NAME)
    {
        var msg = sprintf("<fmt:message code="hr.th.Are%s" />", ATTACHMENT_NAME);/*确定要删除文件 '%s' 吗？*/
        if(window.confirm(msg))
        {
            URL="delete_attach.php?CONTRACT_ID=&ATTACHMENT_ID="+ATTACHMENT_ID+"&ATTACHMENT_NAME="+URLSpecialChars(ATTACHMENT_NAME);
            window.location=URL;
        }
    }

    Date.prototype.format = function(formatter)
    {
        if(!formatter || formatter == "")
        {
            formatter = "yyyy-MM-dd";
        }
        var year = this.getYear().toString();
        var month = (this.getMonth() + 1).toString();
        var day = this.getDate().toString();
        var yearMarker = formatter.replace(/[^y|Y]/g,'');
        if(yearMarker.length == 2)
        {
            year = year.substring(2,4);
        }
        var monthMarker = formatter.replace(/[^m|M]/g,'');
        if(monthMarker.length > 1)
        {
            if(month.length == 1)
            {
                month = "0" + month;
            }
        }

        var dayMarker = formatter.replace(/[^d]/g,'');
        if(dayMarker.length > 1)
        {
            if(day.length == 1)
            {
                day = "0" + day;
            }
        }
        return formatter.replace(yearMarker,year).replace(monthMarker,month).replace(dayMarker,day);
    }

    Date.parseString = function(dateString,formatter)
    {
        var today = new Date();
        if(!dateString || dateString == "")
        {
            return today;
        }
        if(!formatter || formatter == "")
        {
            formatter = "yyyy-MM-dd";
        }
        var yearMarker = formatter.replace(/[^y|Y]/g,'');
        var monthMarker = formatter.replace(/[^m|M]/g,'');
        var dayMarker = formatter.replace(/[^d]/g,'');
        var yearPosition = formatter.indexOf(yearMarker);
        var yearLength = yearMarker.length;
        var year =  dateString.substring(yearPosition ,yearPosition + yearLength) * 1;
        if( yearLength == 2)
        {
            if(year < 50 )
            {
                year += 2000;
            }
            else
            {
                year += 1900;
            }
        }
        var monthPosition = formatter.indexOf(monthMarker);
        var month = dateString.substring(monthPosition,monthPosition + monthMarker.length) * 1 - 1;
        var dayPosition = formatter.indexOf(dayMarker);
        var day = dateString.substring( dayPosition,dayPosition + dayMarker.length )* 1;
        return new Date(year,month,day);
    }

    function DateAdd(strInterval,   NumDay,   dtDate)
    {
        var dtTmp   =   new   Date(dtDate);
        if(isNaN(dtTmp))   dtTmp   =   new   Date();
        switch (strInterval)
        {
            case   "s":return   new   Date(Date.parse(dtTmp)   +   (1000   *   NumDay));
            case   "n":return   new   Date(Date.parse(dtTmp)   +   (60000   *   NumDay));
            case   "h":return   new   Date(Date.parse(dtTmp)   +   (3600000   *   NumDay));
            case   "d":return   new   Date(Date.parse(dtTmp)   +   (86400000   *   NumDay));
            case   "w":return   new   Date(Date.parse(dtTmp)   +   ((86400000   *   7)   *   NumDay));
            case   "m":return   new   Date(dtTmp.getFullYear(),   (dtTmp.getMonth())   +   NumDay,   dtTmp.getDate(),   dtTmp.getHours(),   dtTmp.getMinutes(),   dtTmp.getSeconds());
            case   "y":return   new   Date((dtTmp.getFullYear()   +   NumDay),   dtTmp.getMonth(),   dtTmp.getDate(),   dtTmp.getHours(),   dtTmp.getMinutes(),   dtTmp.getSeconds());
        }
    }

    function calcu_date(day_num)
    {
        var d  = new Date.parseString(document.form1.TRAIL_EFFECTIVE_TIME.value);
        document.form1.TRAIL_OVER_TIME.value  =  DateAdd("d",day_num,d).format();
    }

    function expandIt1()
    {
        whichE1 =document.getElementById("id_msg1");
        whichE2 =document.getElementById("id_msg11");
        whichE10 =document.getElementById("hetongzhuanzheng");
        if (document.form1.TRAIL_PASS_OR_NOT[0].checked == true)
        {
            whichE1.style.display = '';
            whichE2.style.display = '';
            whichE10.style.display = '';
        }
        if (document.form1.TRAIL_PASS_OR_NOT[1].checked == true)
        {
            whichE1.style.display = 'none';
            whichE2.style.display = 'none';
            whichE10.style.display = 'none';
        }
    }
    function expandIt2()
    {
        whichE3 =document.getElementById("id_msg2");
        whichE4 =document.getElementById("id_msg21");
        if (document.form1.REMOVE_OR_NOT[0].checked == true)
        {
            whichE3.style.display = '';
            whichE4.style.display = '';
        }
        if (document.form1.REMOVE_OR_NOT[1].checked == true)
        {
            whichE3.style.display = 'none';
            whichE4.style.display = 'none';
        }
    }
    function expandIt3()
    {
        whichE5 =document.getElementById("id_msg3");
        whichE6 =document.getElementById("id_msg31");
        if (document.form1.RENEW_OR_NOT[0].checked == true)
        {
            whichE5.style.display = '';
            whichE6.style.display = '';
        }
        if (document.form1.RENEW_OR_NOT[1].checked == true)
        {
            whichE5.style.display = 'none';
            whichE6.style.display = 'none';
        }
    }


    function TIME_LIMIT()
    {
        which7 =document.getElementById("CONTRACT_SPECIALIZATION").value;
        if(which7=="1")
        {
            document.getElementById("CONTRACT_END_DATE").style.display = '';
            document.getElementById("shifoujiechu").innerHTML="<fmt:message code="hr.th.HasDischarged" />:";/*合同是否已解除*/
        }
        if(which7=="2")
        {
            document.getElementById("CONTRACT_END_DATE").style.display = 'none';
            document.getElementById("shifoujiechu").innerHTML="<fmt:message code="hr.th.HasDischarged" />:";/*合同是否已解除*/
        }
        if(which7=="3")
        {
            document.getElementById("CONTRACT_END_DATE").style.display = 'none';
            document.getElementById("shifoujiechu").innerHTML="<fmt:message code="hr.th.HasTerminated" />:";/*合同是否已终止*/
        }

    }

    function TYPE_CHANGE()
    {
        which8 =document.getElementById("CONTRACT_TYPE").value;
        if(which8=="1" || which8=="4")
        {
            document.getElementById("shiyong").style.display = '';
        }
        else
        {
            document.getElementById("shiyong").style.display = 'none';
        }
    }

    function check_no(str)
    {
        if(str!="")
            _get("check_no.php","STAFF_CONTRACT_NO="+str, show_msg);
        else
            return;
    }

    function show_msg(req)
    {
        if(req.status==200)
        {
            if(req.responseText=="+OK")
                return (true);
            else
            {
                layer.msg("合同编号重复");
                document.form1.STAFF_CONTRACT_NO.focus();
            }
        }
    }

</script>

<body class="bodycolor" topmargin="5" style="margin: 0;padding: 5px 30px;">
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td style="padding-top: 15px;padding-left: 0;
    padding-right: 0;">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle" style="margin-bottom: 4px;"><span class="big3"><fmt:message code="hr.th.NewContractInformation" /> </span>&nbsp;&nbsp;<%--新建合同信息--%>
        </td>
    </tr>
    <tr>
        <td><fmt:message code="hr.th.Note" />。</td><%--说明：1、合同试用日期应小于合同终止日期；2、合同解除日期应大于合同终止日期；3、合同续签日期应大于合同终止日期。--%>
    </tr>
</table>
<br/>
<form enctype="multipart/form-data" action=""  method="post" name="form1" onSubmit="return CheckForm();">
    <table class="TableBlock" width="85%" align="center">
        <tr>
            <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.Employee" />：</td><%--雇员--%>
            <td class="TableData">
                <input type="text" id="staffNameInput" name="staffName1" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value=""/>&nbsp;
                <a href="javascript:;" id="" class="userAdd" ><fmt:message code="global.lang.select" /></a><%--选择--%>
            </td>
            <td nowrap class="TableData"><fmt:message code="hr.th.ContractNumber" />：</td><%--合同编号--%>
            <td class="TableData" >
                <INPUT type="text"  name="staffContractNo" style="width: 158px;height:28px;" class=BigInput size="11" value="" onBlur="check_no(this.value)" />
            </td>
        </tr>

        <tr>
            <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.ContractSigningCompany" />：</td><%--合同签约公司--%>
            <td class="TableData">
                <select name="contractEnterpries" style="background: white; width:170px;height: 28px;" title="<fmt:message code="hr.th.TheContract" />。"><%--合同签约公司可在“系统管理”->“系统代码设置”模块设置。--%>

                </select>
            </td>
            <td nowrap class="TableData"><span style="color: red;">*</span><fmt:message code="hr.th.typeContract" />：</td><%--合同类型--%>
            <td class="TableData">
                <select name="contractType" style="background: white;width: 170px;height:28px;" id="CONTRACT_TYPE" onChange="TYPE_CHANGE()" title="<fmt:message code="hr.th.TheTypeO" />。">合同类型可在“系统管理”->“系统代码设置”模块设置

                </select>
            </td>
        </tr>

        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.ContractualTermAttributes" />：</td><%--合同期限属性--%>
            <td class="TableData">
                <select name="contractSpecialization" style="width: 170px;height:28px;" id="CONTRACT_SPECIALIZATION" onChange="TIME_LIMIT()">
                    <option value="1"><fmt:message code="hr.th.FixedTerm" /></option><%--固定期限--%>
                    <option value="2"><fmt:message code="hr.th.UnfixedTerm" /></option><%--无固定期限--%>
                    <option value="3"><fmt:message code="hr.th.ForDuration" /></option><%--以完成一定工作任务为期限--%>
                </select>
            </td>
            <td nowrap class="TableData"><fmt:message code="userManagement.th.role" />：</td><%--角色--%>
            <td nowrap class="TableData">
                <select name="userPriv" id="userPriv" style=" width: 170px;height:28px;"title="<fmt:message code="hr.th.InTheRoleOf" />。"><%--角色可在“系统管理”->“组织机构设置”->“角色与权限管理”模块设置--%>

                </select>
                <span style="font-size: 12px;color: #666666;"><fmt:message code="hr.th.doNotSelect" /></span><%--(不选择角色，用户将保持原始角色)--%>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.ContractDate" />：</td><%--合同签订日期--%>
            <td class="TableData">
                <input type="text" id="makeContract" style="width: 158px;height:28px;" name="makeContract" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
            </td>

            <td nowrap class="TableData"><span><span style="color: red;">*</span><fmt:message code="hr.th.ContractCommencementDate" />：</span></td><%--合同生效日期--%>
            <td class="TableData">
      	<span >
         <input type="text" id="probationEffectiveDate" style="width: 158px;height:28px;" name="probationEffectiveDate" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
        </span>
            </td>
        </tr>

        <tr id="contractEndTime">
            <td nowrap class="TableData" ><span ><fmt:message code="hr.th.ContractTerminationDate" />：</span> </td><%--合同终止日期--%>
            <td class="TableData">
            <span>
             <input type="text" name="contractEndTime" style=" width:158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
            </span>
            </td>
            <td nowrap class="TableData"></td>
            <td nowrap class="TableData"></td>
        </tr>
        <tr id="shiyong">
            <td nowrap class="TableData"><fmt:message code="hr.th.Does" />：</td><%--是否含试用期--%>
            <td class="TableData">
                <INPUT type="radio" name="TRAIL_PASS_OR_NOT" value="1" onClick="expandIt1()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                <INPUT type="radio" name="TRAIL_PASS_OR_NOT" value="0" onClick="expandIt1()" checked><fmt:message code="global.lang.no" />         </td><%--否--%>
            <td nowrap class="TableData"><span id="id_msg1" style="display:none"><fmt:message code="system.th.UseDeadline" />：</span></td><%--试用截止日期--%>
            <td class="TableData">
              <span id="id_msg11" style="display:none">
                <input type="text" name="trailOverTime" style="width:158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
              </span>
            </td>
        </tr>

        <tr  style="display: none" id="hetongzhuanzheng">
            <td nowrap class="TableData" ><fmt:message code="hr.th.AreEmployeesActive" />：</td><%--雇员是否转正--%>
            <td class="TableData" >
                <INPUT type="radio" name="PASS_OR_NOT" value="1" ><fmt:message code="global.lang.yes" /> &nbsp;&nbsp;<%--是--%>
                <INPUT type="radio" name="PASS_OR_NOT" value="0" checked><fmt:message code="global.lang.no" />	</td><%--否--%>
            </td>
            <td nowrap class="TableData">
            </td>
            <td nowrap class="TableData">
            </td>
        </tr>

        <tr id="hetongjiechu">
            <td nowrap class="TableData" id="shifoujiechu"><fmt:message code="hr.th.Has" />：</td><%--合同是否已解除--%>
            <td class="TableData">
                <input type="radio" name="REMOVE_OR_NOT" value="1" onClick="expandIt2()"> <%--是--%><fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                <input type="radio" name="REMOVE_OR_NOT" value="0" onClick="expandIt2()" checked> <%--否--%>	<fmt:message code="global.lang.no" />
            </td>

            <td nowrap class="TableData"><span id="id_msg2" style="display:none"><fmt:message code="hr.th.DateContract" />：</span></td><%--合同解除日期--%>
            <td class="TableData">
      <span id="id_msg21" style="display:none">
       <input type="text" name="contractRemoveTime" style="width: 158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
      </span>
            </td>
        </tr>

        <tr id="hetongxuqian">
            <td nowrap class="TableData"><fmt:message code="hr.th.IsRenewed" />：</td><%--合同是否续签--%>
            <td class="TableData">
                <INPUT type="radio" name="RENEW_OR_NOT" value="1" onClick="expandIt3()"> <%--是--%> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                <INPUT type="radio" name="RENEW_OR_NOT" value="0" onClick="expandIt3()" checked> <%--否--%>	<fmt:message code="global.lang.no" />
            </td>
            <td nowrap class="TableData"><span id="id_msg3" style="display:none"><fmt:message code="hr.th.RenewalDate" />：</span></td><%--续签到期日期--%>
            <td class="TableData">
              <span id="id_msg31" style="display:none">
               <input type="text" name="renewTime" size="12" style="width: 158px;height: 28px;" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
              </span>
            </td>
        </tr>
     <%--   <tr>
            <td nowrap class="TableData"> 提醒方式：</td>
            <td class="TableData" colspan=3>
            </td>
        </tr>--%>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.Reminder" />：</td><%--提醒人员--%>
            <td class="TableData" colspan=3 style="    padding-top: 10px;">
                <input type="hidden" name="TO_ID" id="TO_ID">
                <textarea name="remindUser" id="remindUser" cols="64" rows="3"  class="SmallStatic" wrap="yes" readonly></textarea>
                <a href="#" class="orgAdd" title='<fmt:message code="doc.th.AddReminders" />'><fmt:message code="global.lang.add" /></a><%--添加提醒人员 添加 --%>
                <a href="#" class="orgClear"  title='<fmt:message code="doc.th.EmptyReminder" />'><fmt:message code="global.lang.empty" /></a><%--清空提醒人员 清空 --%>
               <%-- <span style="margin-left: 10px; color: #999999;">（合同到期时除提醒以上人员外，还将提醒本人和人力资源管理员）</span>--%>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="journal.th.Remarks" />：</td><%--备注--%>
            <td class="TableData" colspan=3 style="    padding-top: 10px;">
                <textarea name="remark" cols="55" rows="3" class="BigInput" value=""></textarea>
            </td>
        </tr>


        <tr align="center" class="TableControl">
            <td colspan=4 nowrap>
             <%--   <input type="button" value="保存" class="subBtn BigButton">--%>
                <div id="rs" type="save" class="btn_style btn_ok"><fmt:message code="global.lang.save" /></div><%--保存--%>
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    var user_id;

    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false
    };
    $(function () {

        //获取合同信息
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type:'get',
            dataType:"JSON",
            data : {"CodeNos":"HR_STAFF_CONTRACT1"},
            success:function(data){
                var str='<option value="">合同类型&nbsp;&nbsp;</option>';
                for (var proId in data){
                    for(var i=0;i<data[proId].length;i++){
                        str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
                    }
                }
                $('#CONTRACT_TYPE').append(str);
            }
        });



        // 获取签约公司信息
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type:'get',
            dataType:"JSON",
            data : {"CodeNos":"HR_ENTERPRISE"},
            success:function(data){
                var str='<option value="">合同签约公司&nbsp;&nbsp;</option>';
                for (var proId in data){
                    for(var i=0;i<data[proId].length;i++){
                        str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
                    }
                }
                $('select[name="contractEnterpries"]').append(str);
            }
        });

        // 获取角色信息
        $.ajax({
            url: "<%=basePath%>/getAllUserPriv",
            type:'get',
            dataType:"JSON",
            data : {"CodeNos":"HR_ENTERPRISE"},
            success:function(data){
                var data=data.obj;
                var str='<option value="">请选择角色&nbsp;&nbsp;</option>';
                for(var i=0;i<data.length;i++){
                    if(data[i].userPriv!=undefined){
                        str+='<option value="'+data[i].userPriv+'">'+data[i].privName+'</option>'
                    }
                }
                $('select[name="userPriv"]').append(str);
            }
        });


        // 获取用户信息控件
        $('.userAdd').click(function(){
            user_id="staffNameInput";
            $.popWindow("../../common/selectUser?0");
        });

        // 获取人员信息控件
        $('.orgAdd').click(function(){
            user_id="remindUser";
            $.popWindow("../../common/selectUser");
        });
        // 清空
        $('.orgClear').click(function(){
            $('#usersInput').attr("dataid","");
            $('#usersInput').attr("user_id","");
            $('#usersInput').val("");
        });




        // 提交表单
        $("#rs").click(function(){
            if(CheckForm())
            {
                var staffName = $("input[name='staffName1']").attr("user_id");
                if(staffName!=undefined && staffName!=""){
                    staffName= staffName.replace(/,/g,'');
                }
                var data = {
                    'staffName': staffName,
                    'staffContractNo': $("input[name='staffContractNo']").val(),
                    'contractEnterpries': $('select[name="contractEnterpries"] option:selected').val(),
                    'contractType': $('select[name="contractType"] option:selected').val(),
                    'contractSpecialization': $('select[name="contractSpecialization"] option:selected').val(),
                    'userPriv': $('select[name="userPriv"] option:selected').val(),
                    'makeContract': $('input[name="makeContract"]').val(),
                    'probationEffectiveDate': $('[name="probationEffectiveDate"]').val(),
                    'contractEndTime': $('[name="contractEndTime"]').val(),

                    'trailOverTime': $('[name="trailOverTime"]').val(),
                    'passOrNot':$('[name="PASS_OR_NOT"]:checked').val(),
                     'removeOrNot':$('[name="REMOVE_OR_NOT"]:checked').val(),
                     'isTrial':$('[name="TRAIL_PASS_OR_NOT"]:checked').val(),
                     'isRenew':$('[name="RENEW_OR_NOT"]:checked').val(),
                    'contractRemoveTime': $('[name="contractRemoveTime"]').val(),
                    'renewTime': $('[name="renewTime"]').val(),
                    'remindUser': $('[name="remindUser"]').attr("user_id"),
                    'remark': $('[name="remark"]').val()
                }

                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/hr/contract/addContract',
                    dataType: 'json',
                    data: data,
                    success: function (rsp) {
                        if (rsp.flag == true) {
                            layer.msg('<fmt:message code="url.th.addSuccess" />',{icon:1});/*添加成功*/
                            window.location.href='<%=basePath%>/hr/page/contractStraff';
							  window.parent.show();
                        } else {
                            $.layer.msg('<fmt:message code="hr.th.AddFailed" />',{icon:2});/*添加失败*/
                        }
                    }
                })

            }
        });





    });


//    var start = {
//        elem: '#STAFF_BIRTH',
//        format: 'YYYY/MM/DD',
//        istime: true,
//        istoday: false,
//        choose: function(datas){
//            end.min = datas; //开始日选好后，重置结束日的最小日期
//            end.start = datas; //将结束日的初始值设定为开始日
//        }
//        //choose:get_animal_sign
//        //回调函数
//    };
//    //laydate(start);
//
//    var end = {
//        format: 'YYYY/MM/DD hh:mm:ss',
//        /*min: laydate.now(),*/
//        /*max: '2099-06-16 23:59:59',*/
//        istime: true,
//        istoday: false,
//        choose: function(datas){
//            start.max = datas; //结束日选好后，重置开始日的最大日期
//        }
//    };
    //laydate(end);

    var start = {
        elem: '#beginTime',
        format: 'YYYY-MM-DD hh:mm:ss',
        /* min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }
    };
    var end = {
        elem: '#endTime',
        format: 'YYYY-MM-DD hh:mm:ss',
        /*     min: laydate.now(),
             max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
</script>
</body>
</html>

