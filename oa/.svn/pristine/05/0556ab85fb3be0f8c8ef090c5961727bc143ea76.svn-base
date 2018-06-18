<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="hr.th.inquiry" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/index.css"/>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/sys/userInfor.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/jquery.form.min.js"></script>
    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
    <style>
        table{
            border-collapse: collapse;
        }
        /* .fList td{
             width:40%;
         }*/
        #btn_query{
          /*  background: url(../../img/file/cabinet03.png) no-repeat;*/
            width: 74px;
            height: 30px;
            margin: auto;
        }
        #btn_query h2{
            text-align: center;
            font-size: 15px;
            line-height: 28px;
            font-weight: normal;
            margin-left: 9px;
        }
        .leave_send{
            display: inline-block;
            float: left;
            width: 66px;
            height: 30px;
            margin-right: 0px;
            margin-top: 10px;
            margin-bottom: 20px;
            background: url(../../img/publish.png) no-repeat;
            padding-left: 47px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
        }
        .font_style{
            font-family: '微软雅黑';
        }

        .TableBlock tr th {
            background-color: #3691DA;
            color: #fff;
            padding: 10px;
            font-size: 16px;
            letter-spacing: 2px;
        }
        .TableBlock {
            border-collapse: collapse;
            border-spacing: 0;
            width: 80%;
            margin: 0 auto;
            /*margin-bottom: 50px;*/
        }
        .TableBlock tr td {
            border: none;
            font-family: 微软雅黑;
            font-size: 14px;
            padding-left: 10px;
            padding-right: 10px;
        }
        table{
            border-collapse:separate!important;
        }
        .fList thead{
            /* background-color: #fff;*/
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
        }
        .delete_check {
            background: url('../../img/file/cabinet12.png') no-repeat;
            display: inline-block;
            width: 87px;
            height: 24px;
            position: relative;
        }
        .colorDis{
            background-color: #e7e7e7;
        }
        table input{
            width:auto;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<script src="/static/js/module.js?v=150805"></script>
<script src="/module/DatePicker/WdatePicker.js"></script>
<script src="../lib/laydate.js"></script>
<script src="../../lib/laydate/laydate.js"></script>
<script src="../../lib/layer/layer.js"></script>
<script type="text/javascript">
    function ControlContent06()
    {
        if(contentid06.style.display == 'none'){
            contentid06.style.display = '';
            document.getElementById("imgar").src = '../../img/arrow_up.gif';
        }else{
            contentid06.style.display = 'none';
            document.getElementById("imgar").src = '../../img/arrow_down.gif';
        }
    }
</script>

<body class="bodycolor font_style">
<table border="0" width="90%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td class="Big" style="padding: 19px 0;"><img align="absMiddle" src="/img/commonTheme/${sessionScope.InterfaceModel}/infofind11.png" style="margin-left: 35px;margin-bottom: 2px;"><span class="big3" style="font-family: 微软雅黑;font-size: 22px;margin-left: 10px;"> <fmt:message code="hr.th.inquiry" /></span></td>
    </tr>
</table>
<div class="show_list">
    <table id="TableBlock" class="TableBlock" width="820" align="center" style="border: 1px solid #ddd;">
        <tr><th colspan="6"><fmt:message code="hr.th.inquiry" /></th></tr>
        <tr>
            <td nowrap class="TableData" width="100">OA<fmt:message code="global.lang.user" />：</td>
            <td class="TableData">
                <input type="hidden" name="UID" value="" id="UID" class="uid">
              <%--  <input type="text" name="USER_ID"  value="" id="USER_ID" class="user_id">--%>
                <input type="text" name="by_name"  value="" id="byName">
                <%--  <input class="my_name" type="text" name="BYNAME" id="BYNAME" value="" class="BigStatic">--%>
                <input type="hidden" name="staffId" class="staffId"/>
            </td>
            <td nowrap class="TableData"><fmt:message code="userDetails.th.name" />：</td>
            <td class="TableData" style="width:150px;"><input type="text" name="STAFF_NAME" id="STAFF_NAME" class="BigInput"></td>
            <td nowrap class="TableData"><fmt:message code="hr.th.NameUsedBefore" />：</td>
            <td class="TableData"><input type="text" name="BEFORE_NAME" id="BEFORE_NAME" class="BigInput"></td>
        </tr>
        <tr>

            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.number" />：</td>
            <td class="TableData"><input type="text" name="STAFF_NO" id="STAFF_NO" class="BigInput"></td>
            <td nowrap class="TableData"><fmt:message code="hr.th.EnglishName" />：</td>
            <td class="TableData"><input type="text" name="STAFF_E_NAME" id="STAFF_E_NAME" class="BigInput"></td>
            <td nowrap class="TableData"><fmt:message code="userDetails.th.Gender" />：</td>
            <td class="TableData">
                <select name="STAFF_SEX" class="BigSelect STAFF_SEX">
                    <option ></option>
                    <option value="0"><fmt:message code="userInfor.th.male" /></option>
                    <option value="1"><fmt:message code="userInfor.th.female" /></option>
                </select>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.IDNumber" />：</td>
            <td class="TableData"><input type="text" name="STAFF_CARD_NO" id="STAFF_CARD_NO" class="BigInput"></td>
            <td nowrap class="TableData"><fmt:message code="hr.th.DateOfBirth" />：</td>
            <td class="TableData" colspan="3"><input type="text" name="STAFF_BIRTH1" size="10" id="birth_start_time" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                <%--    到    <input type="text" name="STAFF_BIRTH2" size="10" maxlength="10" class="BigInput" value="" onClick="WdatePicker({minDate:'#F{$dp.$D(\'birth_start_time\')}'})"></td>--%>
        </tr>
        <tr>
            <td nowrap class="TableData" width="100"  ><fmt:message code="hr.th.EmployeeType" />：</td>
            <td class="TableData">
                <select name="STAFF_OCCUPATION" class="BigSelect" id="STAFF_OCCUPATION">
                    <option ></option>
                    <option value="01"><fmt:message code="hr.th.ContractWorker" /></option>
                    <option value="02"><fmt:message code="hr.th.RegularEmployee" /></option>
                    <option value="03"><fmt:message code="hr.th.TemporaryWorker" /></option>
                </select>
            </td>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.InductionTime" />：</td>
            <td class="TableData" colspan="3"><input type="text" name="DATES_EMPLOYED1" size="10" maxlength="10" class="BigInput" id="position_start_time" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                <%-- 到    	<input type="text" name="DATES_EMPLOYED2" size="10" maxlength="10" class="BigInput" value="" onClick="WdatePicker({minDate:'#F{$dp.$D(\'position_start_time\')}'})"/>--%>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.JobNumber" />：</td><%--工号--%>
            <td class="TableData"><input type="text" name="WORK_NO" id="WORK_NO" class="BigInput"></td>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.TypeWork" />：</td><%--工种--%>
            <td class="TableData"  width="180"><input type="text" name="WORK_TYPE" id="WORK_TYPE" class="BigInput"></td>
            <td nowrap class="TableData" width="100"><fmt:message code="userManagement.th.department" />：</td><%--部门--%>
            <td class="TableData"  width="180">
                <input type="hidden" name="DEPT_ID">
                <input type="text" name="DEPT_NAME"  value="" id="DEPT_NAME" deptid="" class=BigStatic size=12 maxlength=100 readonly>
                <a href="javascript:;" class="orgAdd" id="dept_add"><fmt:message code="global.lang.select" /></a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.Education" />：</td>
            <td class="TableData"  width="180">
                <select name="STAFF_HIGHEST_SCHOOL" class="BigSelect" id="STAFF_HIGHEST_SCHOOL">
                    <option ></option>
                    <option value="1"><fmt:message code="vote.hr.1" /></option>
                    <option value="2"><fmt:message code="vote.hr.2" /></option>
                    <option value="3"><fmt:message code="vote.hr.3" /></option>
                    <option value="4"><fmt:message code="vote.hr.4" /></option>
                    <option value="5"><fmt:message code="vote.hr.5" /></option>
                    <option value="6"><fmt:message code="vote.hr.6" /></option>
                    <option value="7"><fmt:message code="vote.hr.7" /></option>
                    <option value="8"><fmt:message code="vote.hr.8" /></option>
                    <option value="9"><fmt:message code="vote.hr.9" /></option>
                    <option value="11"><fmt:message code="vote.hr.10" /></option>

                </select>
            </td>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.AcademicDegree" />：</td>
            <td class="TableData"  width="180">
                <select name="STAFF_HIGHEST_DEGREE" class="BigSelect" id="STAFF_HIGHEST_DEGREE">
                    <option value=""></option>
                    <option value="1"><fmt:message code="vote.hr.9" /></option>
                    <option value="2"><fmt:message code="vote.hr.8" /></option>
                    <option value="3">MBA</option>
                    <option value="4"><fmt:message code="vote.hr.13" /></option>
                    <option value="5"><fmt:message code="vote.hr.12" /></option>
                    <option value="6"><fmt:message code="vote.hr.11" /></option>
                    <option value="7"><fmt:message code="event.th.nothing" /></option>
                </select>
            </td>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.major" />：</td><%--专业--%>
            <td class="TableData"  width="180"><input type="text" name="STAFF_MAJOR" id="STAFF_MAJOR" class="BigInput"></td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.Nation" />：</td><%--民族--%>
            <td class="TableData"><input type="text" name="STAFF_NATIONALITY" id="STAFF_NATIONALITY" class="BigInput"></td>
            <td nowrap class="TableData"><fmt:message code="hr.th.PlaceOfOrigin" />：</td><%--籍贯--%>
            <td class="TableData">
                <select name="STAFF_NATIVE_PLACE" class="BigSelect" id="STAFF_NATIVE_PLACE">
                    <option ></option>
                    <option value="110000">北京</option>
                    <option value="120000">天津</option>
                    <option value="130000">河北</option>
                    <option value="140000">山西</option>
                    <option value="150000">内蒙古</option>
                    <option value="210000">辽宁</option>
                    <option value="220000">吉林</option>
                    <option value="230000">黑龙江</option>
                    <option value="310000">上海</option>
                    <option value="320000">江苏</option>
                    <option value="330000">浙江</option>
                    <option value="340000">安徽</option>
                    <option value="350000">福建</option>
                    <option value="360000">江西</option>
                    <option value="370000">山东</option>
                    <option value="410000">河南</option>
                    <option value="420000">湖北</option>
                    <option value="430000">湖南</option>
                    <option value="440000">广东</option>
                    <option value="450000">广西</option>
                    <option value="460000">海南</option>
                    <option value="500000">重庆</option>
                    <option value="510000">四川</option>
                    <option value="520000">贵州</option>
                    <option value="530000">云南</option>
                    <option value="540000">西藏</option>
                    <option value="610000">陕西</option>
                    <option value="620000">甘肃</option>
                    <option value="630000">青海</option>
                    <option value="640000">宁夏</option>
                    <option value="650000">新疆</option>
                    <option value="710000">台湾</option>
                    <option value="810000">香港</option>
                    <option value="820000">澳门</option>
                </select>
            </td>
            <td nowrap class="TableData"><fmt:message code="hr.th.MaritalStatus" />：</td>
            <td class="TableData">
                <select name="STAFF_MARITAL_STATUS" class="BigSelect" id="STAFF_MARITAL_STATUS">
                    <option value="" selected></option>
                    <option value="0"><fmt:message code="hr.th.unmarried" /></option>
                    <option value="1"><fmt:message code="hr.th.married" /></option>
                    <option value="2"><fmt:message code="hr.th.Divorce" /></option>
                    <option value="3"><fmt:message code="hr.th.Widowed" /></option>
                </select>
            </td>
        </tr>
        <tr>

            <td nowrap class="TableData"><fmt:message code="hr.th.PoliticalOutlook" />：</td>
            <td class="TableData">
                <select name="STAFF_POLITICAL_STATUS" class="BigSelect" id="STAFF_POLITICAL_STATUS">
                    <option value="" selected></option>
                    <option value="1"><fmt:message code="hr.th.TheMasses" /></option>
                    <option value="2"><fmt:message code="hr.th.Communist" /></option>
                    <option value="3"><fmt:message code="hr.th.CPCMembers" /></option>
                    <option value="4"><fmt:message code="hr.th.CPCProbationaryParty" /></option>
                    <option value="5"><fmt:message code="hr.th.DemocraticParties" /></option>
                    <option value="6"><fmt:message code="hr.th.PersonagesWithoutParty" /></option>
                </select>
            </td>

            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.PartyMembershipTime" />：</td>
            <td class="TableData" colspan="1" nowrap>
                <input type="text" name="JOIN_PARTY_TIME1" size="7.5" maxlength="10" class="BigInput" value="" id="party_start_time" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                <%--   到    	<input type="text" name="JOIN_PARTY_TIME2" size="7.5" maxlength="10" class="BigInput" value="" onClick="WdatePicker({minDate:'#F{$dp.$D(\'party_start_time\')}'})"/>--%>
            </td>

            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.Incumbency" />：</td>
            <td class="TableData"  width="180" colspan="1">
                <select name="WORK_STATUS" class="BigSelect" id="WORK_STATUS">
                    <option value=""></option>
                    <option value="01"><fmt:message code="hr.th.Job" /></option>
                    <option value="02"><fmt:message code="hr.th.Resignation" /></option>
                    <option value="03"><fmt:message code="hr.th.Retired" /></option>
                    <option value="04"><fmt:message code="hr.th.retire" /></option>
                    <option value="05"><fmt:message code="hr.th.ToLoan" /></option>
                </select>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ContactNumber" />：</td>
            <td class="TableData"  width="180"><input type="text" name="STAFF_PHONE" id="STAFF_PHONE" class="BigInput"></td>
            <td nowrap class="TableData">  <fmt:message code="userManagement.th.role" />：</td>
            <td class="TableData" width="180">
                <select name="USER_PRIV" class="BigSelect per_priv">
                    <option value=""></option>
                    <option value="20">11</option>
                    <option value="21">12</option>
                    <option value="1">OA 管理员</option>
                    <option value="22">aaa</option>
                    <option value="5">职员</option>
                    <option value="12">出纳</option>
                    <option value="15">销售主管</option>
                    <option value="16">销售经理</option>
                    <option value="18">研发工程师</option>
                    <option value="7">管理部总监</option>
                    <option value="17">设计部经理</option>
                    <option value="8">人力资源总监</option>
                    <option value="9">研发总监</option>
                    <option value="10">人事经理</option>
                    <option value="14">区域销售经理</option>
                    <option value="2">CEO</option>
                    <option value="4">部门经理</option>
                    <option value="11">会计</option>
                    <option value="13">营销总监</option>
                    <option value="3">财务总监</option>
                    <option value="6">行政经理</option>
                </select>
            </td>
            <td nowrap class="TableData"><fmt:message code="hr.th.ShowOffStaff" />：</td>
            <td class="TableData">
                <select name="SHOW_LEAVE" class="BigSelect" id="SHOW_LEAVE">
                    <option value="" ></option>
                    <option value="1" ><fmt:message code="hr.th.display" /></option>
                    <option value="0" selected ><fmt:message code="hr.th.NotShow" /></option>
                </select>
            </td>
        </tr>
        <tr class="TableHeader" height="25">
            <td nowrap colspan="6" style="text-align: left;cursor: pointer;"><span><fmt:message code="hr.th.MoreQueryOptions" /></span>&nbsp;&nbsp;<img src="../../img/arrow_down.gif" border="0" id="imgar" title="展开/收缩" onClick="ControlContent06();" style="cursor:hand"></td>
        </tr>
        <tr  style="display:none"  id="contentid06">
            <td colspan="6"  valign="top">
                <div>
                    <table class="TableBlock" style="width: 100%" align="center">
                        <tr>

                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.AdministrativeLevel" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="ADMINISTRATION_LEVEL" id="ADMINISTRATION_LEVEL" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.PhoneNumber" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_MOBILE" id="STAFF_MOBILE" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="main.email" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_EMAIL" id="STAFF_EMAIL" class="BigInput"></td>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.Specialty" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_SKILLS" size="" id="STAFF_SKILLS" class="BigInput"></td>
                            <!--<td nowrap class="TableData" width="100">小灵通：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_LITTLE_SMART" id="STAFF_LITTLE_SMART" class="BigInput"></td>-->
                            <td nowrap class="TableData" width="100">MSN：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_MSN" id="STAFF_MSN" class="BigInput"></td>
                            <td nowrap class="TableData" width="100">QQ：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_QQ" id="STAFF_QQ" class="BigInput"></td>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.HomeAddress" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="HOME_ADDRESS" id="HOME_ADDRESS" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="userDetails.th.post" />：</td>
                            <td class="TableData"  width="180"><select type="text" name="JOB_POSITION" id="JOB_POSITION" class="BigInput"></select></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.Title" />：</td>
                            <td class="TableData"  width="180">
                                <select name="PRESENT_POSITION" class="BigSelect pre_position" id="PRESENT_POSITION">
                                    <option ></option>
                                    <option value="08"><fmt:message code="hr.th.SeniorTitles" /></option>
                                    <option value="02"><fmt:message code="hr.th.AssistantEngineer" /></option>
                                    <option value="01"><fmt:message code="hr.th.Engineer" /></option>
                                    <option value="03"><fmt:message code="hr.th.SeniorEngineer" /></option>
                                    <option value="04"><fmt:message code="hr.th.Senior" /></option>
                                    <option value="07"><fmt:message code="hr.th.Title" /></option>
                                </select>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.WorkingHours" />：</td>
                            <td class="TableData">
                                <input type="text" id="JOB_BEGINNING1" name="JOB_BEGINNING1" size="7.5" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                                <%--   到<input type="text" name="JOB_BEGINNING2" size="7.5" maxlength="10" class="BigInput" value="" onClick="WdatePicker()"/>--%>
                            </td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.GraduationTime" />：</td>
                            <td class="TableData" >
                                <input type="text" name="GRADUATION_DATE1" id="GRADUATION_DATE1" size="7.5" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                                <%-- 到<input type="text" name="GRADUATION_DATE2" size="7.5" maxlength="10" class="BigInput" value="" onClick="WdatePicker()"/>--%>
                            </td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.LengthUnit" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="JOB_AGE" id="JOB_AGE" class="BigInput"></td>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.TotalLengthOfService" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="WORK_AGE" id="WORK_AGE" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.Health" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_HEALTH" id="STAFF_HEALTH" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.RegisteredResidence" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="STAFF_DOMICILE_PLACE" id="STAFF_DOMICILE_PLACE" class="BigInput"></td>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.GraduationSchool" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="GRADUATION_SCHOOL" id="GRADUATION_SCHOOL" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ComputerLevel" />：</td>
                            <td class="TableData"  width="180"><input type="text" name="COMPUTER_LEVEL" id="COMPUTER_LEVEL" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.StartingSalary" />：</td>
                            <td class="TableData"  width="180">
                                <input type="text" id="BEGIN_SALSRY_TIME1" name="BEGIN_SALSRY_TIME1" size="7.5" maxlength="10" class="BigInput" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                                <%-- 到<input type="text" name="BEGIN_SALSRY_TIME2" size="7.5" maxlength="10" class="BigInput" value="" onClick="WdatePicker()"/>--%>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />1：</td>
                            <td class="TableData"  width="180"><input type="text" name="FOREIGN_LANGUAGE1" id="FOREIGN_LANGUAGE1" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />2：</td>
                            <td class="TableData"  width="180"><input type="text" name="FOREIGN_LANGUAGE2" id="FOREIGN_LANGUAGE2" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />3：</td>
                            <td class="TableData"  width="180"><input type="text" name="FOREIGN_LANGUAGE3" id="FOREIGN_LANGUAGE3" class="BigInput"></td>
                        </tr>
                        <tr>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />1：</td>
                            <td class="TableData"  width="180"><input type="text" name="FOREIGN_LEVEL1" id="FOREIGN_LEVEL1" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />2：</td>
                            <td class="TableData"  width="180"><input type="text" name="FOREIGN_LEVEL2" id="FOREIGN_LEVEL2" class="BigInput"></td>
                            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />3：</td>
                            <td class="TableData"  width="180"><input type="text" name="FOREIGN_LEVEL3" id="FOREIGN_LEVEL3" class="BigInput"></td>
                        </tr>
                        <!--<tr>
                          <td nowrap class="TableData" width="100">特长：</td>
                          <td class="TableData"  width="180" colspan="3"><input type="text" name="STAFF_SKILLS" size="60" id="STAFF_SKILLS" class="BigInput"></td>
                        </tr>  -->
                        <%--<tr>--%>
                            <%--<td colspan="6" >--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                    </table>
                </div>
            </td>
        </tr>
        <tr align="center" class="TableControl">
            <td colspan="6" style="cursor: pointer;">
                <div id="btn_query" style="cursor: pointer;margin-bottom: 30px;margin-top: 30px;" class="find_submit BigButton" onclick="findSubmit()"><h2><fmt:message code="global.lang.query" /></h2></div>
            </td>
        </tr>
    </table>
</div>

<div class="find_list" style="display:none">
    <table class="fList" id="flist" width="100%" style="border: 1px solid #ddd;">

    </table>

</div>

<div class="">
    <div class="table_personDetail" id="table_personDetail" style="display: none;">
        <table class="TableBlock" width="100%" align="center">
            <tbody><tr>
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="url.th.EssentialInformation" /></b></td>
            </tr>
            <tr style="margin-top:30px;">
                <td nowrap="" class="TableData test_text" width="100" style="padding-top: 40px;">OA<fmt:message code="global.lang.user" />：</td>
                <td class="TableData" width="180" colspan="3"  style="padding-top: 40px;">
                    <input type="hidden" name="UID" value="" id="UID" class="uid">
                    <input type="hidden" name="USER_ID"  value="" id="USER_ID" class="user_id">
                    <input type="text" name="byName"  value="" id="byName" class="byName test_null colorDis"  readonly>
                    <input type="hidden" name="staffId" class="staffId"/>
                    <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                </td>
                <td class="TableData" align="center" rowspan="5" colspan="2">
                    <center class="hr_photo"><fmt:message code="hr.th.NoPhotos" /></center>        </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData test_text" width="100"><fmt:message code="hr.th.department" />：</td>

                <td class="TableData"  width="180">
                    <input type="hidden" name="DEPT_ID" id="DEPT_ID" class="dept_id">
                    <input type="text" name="DEPT_NAME" disabled="disabled"  value="" id="DEPT_NAME"  class="BigStatic company dept_name test_null" size=12 maxlength=100 readonly="">
                    <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                </td>

                <%--<td class="TableData">
                    <input type="hidden" name="DEPT_ID" value="">
                    <input type="text" style="background: #eee;" name="DEPT_NAME" value="" class="BigStatic company" size="20" maxlength="100" readonly="">
                </td>--%>
                <td nowrap="" class="TableData test_text"> <fmt:message code="userManagement.th.role" />：</td>
                <td class="TableData dept" colspan="2" width="80%">
                    <input type="hidden" name="USER_PRIV" value="" class="userPriv">
                    <input type="text" name="USER_PRIV_NAME" disabled="disabled" value="" id="USER_PRIV_NAME" class="BigStatic company userPrivName test_null" size=12 maxlength=100 readonly="">
                    <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                    <%--  <a href="javascript:;" class="orgAdd userPriv_add" id="userPriv_add">添加</a>--%>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.number" />：</td>
                <td class="TableData" width="180"><input type="text" name="STAFF_NO" value="" class="BigInput per_num"></td>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.JobNumber" />：</td>
                <td class="TableData" colspan="2"><input type="text" name="WORK_NO" value="" class="BigInput per_worknum"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData test_text"><fmt:message code="userDetails.th.name" />：</td>
                <td class="TableData">
                    <input type="text" name="STAFF_NAME" disabled="disabled" value="" class="BigStatic per_name test_null" ><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                </td>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.NameUsedBefore" />：</td>
                <td class="TableData" colspan="2"><input type="text" name="BEFORE_NAME" value="" class="BigInput per_overname"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.EnglishName" />：</td>
                <td class="TableData"><input type="text" name="STAFF_E_NAME" value="" class="BigInput per_engname"></td>
                <td nowrap="" class="TableData"><fmt:message code="userDetails.th.Gender" />：</td>
                <td class="TableData" colspan="2" title="<fmt:message code="hr.th.ID" />">
                    <select name="STAFF_SEX" class="BigSelect per_sex">
                        <option value="0" selected=""><fmt:message code="userInfor.th.male" /></option>
                        <option value="1"><fmt:message code="userInfor.th.female" /></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.IDNumber" />：</td>
                <td class="TableData">
                    <input type="text" name="STAFF_CARD_NO" id="STAFF_CARD_NO" class="BigInput per_ident" value="" onblur="check()">
                </td>
                <td nowrap="" class="TableData test_text"><fmt:message code="hr.th.DateOfBirth" />：</td>
                <td class="TableData" colspan="2" title="<fmt:message code="hr.th.ID" />">
                    <input type="text" name="STAFF_BIRTH" id="STAFF_BIRTH" size="10" maxlength="10" class="BigInput per_date test_null" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:get_animal_sign})" onchange="get_animal_sign()"><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                    <input type="checkbox" name="IS_LUNAR" id="IS_LUNAR" value="1" style="margin-left: 13px;margin-top: 4px;float:none;" class="per_noneli" onclick="get_animal_sign()">
                    <label for="IS_LUNAR" class="nongli"><fmt:message code="url.th.Lunar" /></label>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.Age" />：</td>
                <td class="TableData" title="填写完身份证号码后可直接生成"><input type="text" name="STAFF_AGE" size="4" class="BigInput per_age" value="">岁</td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.annualLeave" />：</td>
                <td class="TableData" colspan="3">
                    <input type="text" name="LEAVE_TYPE" size="4" maxlength="4" class="BigInput per_yearjia" value="0"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.PlaceOfOrigin" />：</td>
                <td class="TableData" colspan="5" nowrap="">
                    <select name="STAFF_NATIVE_PLACE" class="BigSelect per_address" title="<fmt:message code="hr.th.OriginIn" />。">
                        <option value="" selected=""></option>
                        <option value="110000">北京</option>
                        <option value="120000">天津</option>
                        <option value="130000">河北</option>
                        <option value="140000">山西</option>
                        <option value="150000">内蒙古</option>
                        <option value="210000">辽宁</option>
                        <option value="220000">吉林</option>
                        <option value="230000">黑龙江</option>
                        <option value="310000">上海</option>
                        <option value="320000">江苏</option>
                        <option value="330000">浙江</option>
                        <option value="340000">安徽</option>
                        <option value="350000">福建</option>
                        <option value="360000">江西</option>
                        <option value="370000">山东</option>
                        <option value="410000">河南</option>
                        <option value="420000">湖北</option>
                        <option value="430000">湖南</option>
                        <option value="440000">广东</option>
                        <option value="450000">广西</option>
                        <option value="460000">海南</option>
                        <option value="500000">重庆</option>
                        <option value="510000">四川</option>
                        <option value="520000">贵州</option>
                        <option value="530000">云南</option>
                        <option value="540000">西藏</option>
                        <option value="610000">陕西</option>
                        <option value="620000">甘肃</option>
                        <option value="630000">青海</option>
                        <option value="640000">宁夏</option>
                        <option value="650000">新疆</option>
                        <option value="710000">台湾</option>
                        <option value="810000">香港</option>
                        <option value="820000">澳门</option>
                    </select>
                    <input type="text" class="per_detialAdd" name="STAFF_NATIVE_PLACE2" style="width:326px;height: 24px;margin-left:6px;" value="">
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="url.th.Zodiac" /></td>
                <td class="TableData" title="<fmt:message code="url.th.Zodiac" />">
                    <input type="text" value="" id="animal_id" class="BigStatic per_shengxiao" readonly="">
                </td>
                <td nowrap="" class="TableData"><fmt:message code="url.th.constellation" /></td>
                <td class="TableData" colspan="3" title="<fmt:message code="url.th.constellation" />">
                    <input type="text" value="" id="sign_id" class="BigStatic per_start" readonly="">
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="url.th.BloodType" /></td>
                <td class="TableData">
                    <select name="BLOOD_TYPE" class="BigSelect per_xiexing">
                        <option value=""></option>
                        <option value="A">A</option>
                        <option value="B">B</option>
                        <option value="O">O</option>
                        <option value="AB">AB</option>
                    </select>
                </td>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.Nation" />：</td>
                <td class="TableData" colspan="3"><input type="text" name="STAFF_NATIONALITY" class="BigInput per_minzu" value=""></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.MaritalStatus" />：</td>
                <td class="TableData" width="180">
                    <select name="STAFF_MARITAL_STATUS" class="BigSelect per_hunyin">
                        <option value="" selected=""></option>
                        <option value="0"><fmt:message code="hr.th.unmarried" /></option>
                        <option value="1"><fmt:message code="hr.th.married" /></option>
                        <option value="2"><fmt:message code="hr.th.Divorce" /></option>
                        <option value="3"><fmt:message code="hr.th.Widowed" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Health" />：</td>
                <td class="TableData" colspan="3"><input type="text" name="STAFF_HEALTH" value="" class="BigInput per_health"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.PoliticalOutlook" />：</td>
                <td class="TableData" width="180">
                    <select name="STAFF_POLITICAL_STATUS" class="BigSelect per_zhengzhi" title="<fmt:message code="hr.th.PoliticalAffiliation" />。">
                        <option value="" selected=""></option>
                        <option value="1"><fmt:message code="hr.th.TheMasses" /></option>
                        <option value="2"><fmt:message code="hr.th.Communist" /></option>
                        <option value="3"><fmt:message code="hr.th.CPCMembers" /></option>
                        <option value="4"><fmt:message code="hr.th.CPCProbationaryParty" /></option>
                        <option value="5"><fmt:message code="hr.th.DemocraticParties" /></option>
                        <option value="6"><fmt:message code="hr.th.PersonagesWithoutParty" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.PartyMembershipTime" />：</td>
                <td class="TableData" colspan="3">
                    <input type="text" name="JOIN_PARTY_TIME" size="10" maxlength="10" class="BigInput per_dang" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><fmt:message code="hr.th.Household" />：</td>
                <td class="TableData">
                    <select name="STAFF_TYPE" class="BigSelect per_hukou" title="<fmt:message code="hr.th.TheType" />。">
                        <option value="" selected=""></option>
                        <option value="01"><fmt:message code="hr.th.UrbanMunicipality" /></option>
                        <option value="02"><fmt:message code="hr.th.WorkersTowns" /></option>
                        <option value="03"><fmt:message code="hr.th.MigrantCity" /></option>
                        <option value="04"><fmt:message code="hr.th.MigrantWorkers" /></option>
                        <option value="05"><fmt:message code="hr.th.RuralLabor" /></option>
                        <option value="06"><fmt:message code="hr.th.OutOfTown" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.RegisteredResidence" />：</td>
                <td class="TableData" width="180" colspan="3"><input type="text" name="STAFF_DOMICILE_PLACE" value="" size="40" class="BigInput per_hukouAdd"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100" style="padding-bottom: 40px;"><fmt:message code="hr.th.PhotoUpload" />：</td>
                <td class="TableData" width="180" colspan="5" style="padding-bottom: 40px;">
                    <form method="post" action="" enctype="multipart/form-data" id="photoForm"><span id="showImage"></span>
                        <input type="file" name="imageFile" id="imageFile" size="40" class="BigInput" title="<fmt:message code="doc.th.SelectAttachment" />">&nbsp;<span><fmt:message code="hr.th.PhotoFormats" />!</span>
                    </form>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="hr.th.Position" />：</b></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100" style="padding-top: 40px;"><fmt:message code="hr.th.TypeWork" />：</td>
                <td class="TableData" width="180" style="padding-top: 40px;"><input type="text" name="WORK_TYPE" class="BigInput per_gongzhong" value=""></td>
                <td nowrap="" class="TableData" width="100" style="padding-top: 40px;"><fmt:message code="hr.th.AdministrativeLevel" />：</td>
                <td class="TableData" width="180" style="padding-top: 40px;"><input type="text" name="ADMINISTRATION_LEVEL" class="BigInput per_xingzheng" value=""></td>
                <td nowrap="" class="TableData" width="100" style="padding-top: 40px;"><fmt:message code="hr.th.EmployeeType" />：</td>
                <td class="TableData" style="padding-top: 40px;">
                    <select name="STAFF_OCCUPATION" class="BigSelect per_yuangongType" title="<fmt:message code="hr.th.Employees" />。">
                        <option value="" selected=""></option>
                        <option value="01"><fmt:message code="hr.th.ContractWorker" /></option>
                        <option value="02"><fmt:message code="hr.th.RegularEmployee" /></option>
                        <option value="03"><fmt:message code="hr.th.TemporaryWorker" /></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="userDetails.th.post" />：</td>
                <td class="TableData" width="180" style="text-align: left;"><select type="text" name="JOB_POSITION" class="BigInput per_zhiwu"></select></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Title" />：</td>
                <td class="TableData" width="180">
                    <select name="PRESENT_POSITION" class="BigSelect per_zhicheng" title="<fmt:message code="hr.th.TheTitle" />。">
                        <option value="" selected=""></option>
                        <option value="08"><fmt:message code="hr.th.SeniorTitles" /></option>
                        <option value="02"><fmt:message code="hr.th.AssistantEngineer" /></option>
                        <option value="01"><fmt:message code="hr.th.Engineer" /></option>
                        <option value="03"><fmt:message code="hr.th.SeniorEngineer" /></option>
                        <option value="04"><fmt:message code="hr.th.Senior" /></option>
                        <option value="07"><fmt:message code="hr.th.Title" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData test_text" width="100"><fmt:message code="hr.th.InductionTime" />：</td>
                <td class="TableData" width="180">
                    <input type="text" name="DATES_EMPLOYED" size="10" maxlength="10" class="BigInput per_ruzhiTime test_null" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:function(dates){
                                var date=new Date();
                                var year=date.getTime();
                                var oldYear=Number(new Date(dates).getTime());
                                var time=(year-oldYear) / 1000 / 60 / 60 / 24 /365;
                                var times=time.toFixed(1);
                                 times=Math.ceil(times)
                                $('.per_gongling').val(times)
                            }})"><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.TitleLevel" />：</td>
                <td class="TableData">
                    <select name="WORK_LEVEL" class="BigSelect per_zhichengjibie" title="<fmt:message code="hr.th.Thetitlelevel" />。">
                        <option value="" selected=""></option>
                        <option value="01"><fmt:message code="hr.th.primary" /></option>
                        <option value="02"><fmt:message code="hr.th.intermediate" /></option>
                        <option value="03"><fmt:message code="hr.th.deputySeniorRanks" /></option>
                        <option value="04"><fmt:message code="hr.th.IsHigh" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.post" />：</td>
                <td nowrap="" class="TableData">
                    <select name="WORK_JOB" class="BigSelect per_yingpin" >
                       <%-- <option value=""></option>
                        <option value="1"><fmt:message code="hr.th.Technology" /></option>
                        <option value="2"><fmt:message code="hr.th.TechnicalSupport" /></option>
                        <option value="3"><fmt:message code="hr.th.Sale" /></option>--%>
                    </select>
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.AttendanceSchedulingType" />：</td>
                <td nowrap="" class="TableData">
                    <select name="DUTY_TYPE" class="BigSelect per_kaoqin">
                        <option value="1" selected=""><fmt:message code="hr.th.RegularClass" /></option>
                        <option value="2"><fmt:message code="hr.th.WholeDay" /></option>
                        <option value="99"><fmt:message code="hr.th.ShiftSystem" /></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.LengthUnit" />：</td>
                <td class="TableData" width="180"><input type="text" name="JOB_AGE" class="BigInput per_gongling" value="" readonly style="background: #e7e7e7"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.StartingSalary" />：</td>
                <td class="TableData" width="180">
                    <input type="text" name="BEGIN_SALSRY_TIME" size="10" maxlength="10" class="BigInput per_xinziTime" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Incumbency" />：</td>
                <td class="TableData" width="180">
                    <select name="WORK_STATUS" class="BigSelect per_zaizhizhuangtai" title="<fmt:message code="hr.th.InTheState" />。">
                        <option value="" selected=""></option>
                        <option value="01"><fmt:message code="hr.th.Job" /></option>
                        <option value="02"><fmt:message code="hr.th.Resignation" /></option>
                        <option value="03"><fmt:message code="hr.th.Retired" /></option>
                        <option value="04"><fmt:message code="hr.th.retire" /></option>
                        <option value="05"><fmt:message code="hr.th.ToLoan" /></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.TotalLengthOfService" />：</td>
                <td class="TableData" width="180"><input type="text" name="WORK_AGE" value="" class="BigInput per_allage" readonly style="background: #e7e7e7"></td>
                <td nowrap="" class="TableData test_text" width="100"><fmt:message code="hr.th.WorkingHours" />：</td>
                <td class="TableData" width="180">
                    <input type="text" name="JOB_BEGINNING" size="10" maxlength="10" class="BigInput per_joinWork test_null" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:function(dates){
                                var date=new Date();
                                var year=date.getTime();
                                var oldYear=Number(new Date(dates).getTime());
                                var time=(year-oldYear) / 1000 / 60 / 60 / 24 /365;
                                var times=time.toFixed(1);
                                 times=Math.ceil(times)
                                $('.per_allage').val(times)
                            }})" onchange="get_work_age(this.value)"> <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                </td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ContactNumber" />：</td>
                <td class="TableData" width="180"><input type="text" name="STAFF_PHONE" class="BigInput per_dianhua" value=""></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData " width="100"><fmt:message code="hr.th.PhoneNumber" />：</td>
                <td class="TableData" width="180"><input type="text" name="STAFF_MOBILE" class="BigInput per_phone" value=""></td>
                <td nowrap="" class="TableData" width="100">MSN：</td>
                <td class="TableData" width="180" colspan="3"><input type="text" name="STAFF_MSN" class="BigInput per_msn" value=""></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="main.email" />：</td>
                <td class="TableData" width="180"><input type="text" name="STAFF_EMAIL" class="BigInput per_email" data-prompt-position="centerRight:5,-4" value=""></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.HomeAddress" />：</td>
                <td class="TableData" width="180" colspan="3"><input type="text" name="HOME_ADDRESS" size="50" value="" class="BigInput per_familyAdd"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100">QQ：</td>
                <td class="TableData" width="180"><input type="text" name="STAFF_QQ" class="BigInput per_qq" data-prompt-position="centerRight:5,-4" value=""></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.OtherInformation" />：</td>
                <td class="TableData" width="180" colspan="3"><input type="text" name="OTHER_CONTACT" size="50" value="" class="BigInput per_elseType"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData">  <fmt:message code="hr.th.IsExpert" />：</td>
                <td class="TableData">
                    <input type="radio" name="batch" value="1" class="isExperts"><label for="1" style="    margin-left: -34px;"><fmt:message code="global.lang.yes" /></label>
                    <input type="radio" name="batch" value="0" class="isExperts" checked="" style="    margin-left: 33px;"><label for="0" style="    margin-left: 20px;"><fmt:message code="global.lang.no" /></label></td>
                <td nowrap="" class="TableData"> <fmt:message code="hr.th.researchField" />：</td>
                <td class="TableData" width="180" colspan="3">
                    <textarea rows="3" cols="30" name="EXPERTS_INFO" id="EXPERTS_INFO" class="per_yanjiu"></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"> <fmt:message code="hr.th.SocialAppointments" />：</td>
                <td class="TableData">
                    <textarea rows="3" cols="30" name="PART_TIME" id="PART_TIME" class="per_socish"></textarea>
                </td>
                <td nowrap="" class="TableData">  <fmt:message code="hr.th.AchievementIntroduction" />：</td>
                <td class="TableData" width="180" colspan="3">
                    <textarea rows="3" cols="30" name="RESEARCH_RESULTS" class="per_success" id="RESEARCH_RESULTS"></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"> <fmt:message code="hr.th.ImmediateSuperior" />：</td>
                <td nowrap="" class="TableData">
                    <input type="hidden" name="COPY_TO_ID1" value="" class="inp_shangji">
                    <textarea cols="21" name="COPY_TO_NAME1" rows="2" class="BigStatic text_shangji"  id="directlySuperiorName" wrap="yes" readonly=""></textarea>
                    <a href="javascript:;" class="orgAdd choose add_shangji" ><fmt:message code="global.lang.select" /></a>
                    <a href="javascript:;" class="orgClear delect clear_xiaji" ><fmt:message code="global.lang.empty" /><</a>
                </td>
                <td nowrap="" class="TableData">  <fmt:message code="hr.th.SubordinateSubordinate" />：</td>
                <td nowrap="" class="TableData" width="180" colspan="3">
                    <input type="hidden" name="COPY_TO_ID" value="" class="inp_xiaji">
                    <textarea cols="21" name="COPY_TO_NAME" rows="2" class="BigStatic text_xiaji" id="directlyUnderName" wrap="yes" readonly=""></textarea>
                    <a href="javascript:;" class="orgAdd add_xiaji" ><fmt:message code="global.lang.select" /></a>
                    <a href="javascript:;" class="orgClear clear_xiaji" ><fmt:message code="global.lang.empty" /><</a>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.OpeningBank" />1：</td>
                <td class="TableData" width="180"><input type="text" name="BANK1" class="BigInput per_kaihuhang" value=""></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.account" />1：</td>
                <td class="TableData" width="180" colspan="3"><input type="text" name="BANK_ACCOUNT1" size="50" value="" class="BigInput zhanghuone"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100" style="padding-bottom: 40px;"><fmt:message code="hr.th.OpeningBank" />2：</td>
                <td class="TableData" width="180" style="padding-bottom: 40px;"><input type="text" name="BANK2" class="BigInput per_kaihuhangtwo" value=""></td>
                <td nowrap="" class="TableData" width="100" style="padding-bottom: 40px;"><fmt:message code="hr.th.account" />2：</td>
                <td class="TableData" width="180" colspan="3" style="padding-bottom: 40px;"><input type="text" name="BANK_ACCOUNT2" size="50" value="" class="BigInput zhanghutwo"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="hr.th.educationalBackground" />：</b></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData test_text" width="100" style="padding-top: 40px;"><fmt:message code="hr.th.Education" />：</td>
                <td class="TableData" width="180" style="padding-top: 40px;">
                    <select name="STAFF_HIGHEST_SCHOOL" class="BigSelect per_xueli test_null" title="<fmt:message code="hr.th.TheEducation" />。">
                        <option value="" selected=""></option>
                        <option value="1"><fmt:message code="vote.hr.1" /></option>
                        <option value="2"><fmt:message code="vote.hr.2" /></option>
                        <option value="3"><fmt:message code="vote.hr.3" /></option>
                        <option value="4"><fmt:message code="vote.hr.4" /></option>
                        <option value="5"><fmt:message code="vote.hr.5" /></option>
                        <option value="6"><fmt:message code="vote.hr.6" /></option>
                        <option value="7"><fmt:message code="vote.hr.7" /></option>
                        <option value="8"><fmt:message code="vote.hr.8" /></option>
                        <option value="9"><fmt:message code="vote.hr.9" /></option>
                        <option value="11"><fmt:message code="vote.hr.10" /></option>
                    </select><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                </td>
                <td nowrap="" class="TableData" width="100" style="padding-top: 40px;"><fmt:message code="hr.th.AcademicDegree" />：</td>
                <td class="TableData" width="180" style="padding-top: 40px;">
                    <select name="STAFF_HIGHEST_DEGREE" class="BigSelect per_xuewei" title="<fmt:message code="hr.th.Adegree" />。">
                        <option value="" selected=""></option>
                        <option value="1"><fmt:message code="vote.hr.9" /></option>
                        <option value="2"><fmt:message code="vote.hr.8" /></option>
                        <option value="3">MBA</option>
                        <option value="4"><fmt:message code="vote.hr.13" /></option>
                        <option value="5"><fmt:message code="vote.hr.12" /></option>
                        <option value="6"><fmt:message code="vote.hr.11" /></option>
                        <option value="7"><fmt:message code="event.th.nothing" /></option>
                    </select>
                </td>
                <td nowrap="" class="TableData" width="100" style="padding-top: 40px;"><fmt:message code="hr.th.GraduationTime" />：</td>
                <td class="TableData" width="180" style="padding-top: 40px;">
                    <input type="text" name="GRADUATION_DATE" size="10" maxlength="10" class="BigInput per_overtime" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.GraduationSchool" />：</td>
                <td class="TableData" width="180"><input type="text" name="GRADUATION_SCHOOL" value="" class="BigInput per_school"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.major" />：</td>
                <td class="TableData" width="180"><input type="text" name="STAFF_MAJOR" value="" class="BigInput per_zhuanye"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ComputerLevel" />：</td>
                <td class="TableData" width="180"><input type="text" name="COMPUTER_LEVEL" value="" class="BigInput per_shuiping"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />1：</td>
                <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE1" value="" class="BigInput per_yuzhongone"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />2：</td>
                <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE2" value="" class="BigInput per_yuzhongtwo"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />3：</td>
                <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE3" value="" class="BigInput per_yuzhongthree"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />1：</td>
                <td class="TableData" width="180"><input type="text" name="FOREIGN_LEVEL1" value="" class="BigInput per_waiyuone"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />2：</td>
                <td class="TableData" width="180"><input type="text" name="FOREIGN_LEVEL2" value="" class="BigInput per_waiyutwo"></td>
                <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />3：</td>
                <td class="TableData" width="180"><input type="text" name="FOREIGN_LEVEL3" value="" class="BigInput per_waiyuthree"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" width="100" style="padding-bottom: 40px;"><fmt:message code="hr.th.Specialty" />：</td>
                <td class="TableData" width="180" colspan="5" style="padding-bottom: 40px;"><input type="text" name="STAFF_SKILLS" value="" size="80" class="BigInput per_techang"></td>
            </tr>
            <tr>
                <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;&nbsp;<fmt:message code="hr.th.JobStatus" />：</b></td>
                <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="HR.TH.WarrantyRecord" />：</b></td>
            </tr>
            <tr>
                <td class="TableData" colspan="3" style="text-align: left;"><textarea cols="45" name="CERTIFICATE" rows="3" class="BigInput zhiwu" wrap="on"></textarea></td>
                <td class="TableData" colspan="3"><textarea cols="45" name="SURETY" rows="3" class="BigInput danbao" wrap="on"></textarea></td>
            </tr>
            <tr>
                <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="HR.TH.SocialPayment" />：</b></td>
                <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="HR.TH.PhysicalRecord" />：</b></td>
            </tr>
            <tr>
                <td class="TableData" colspan="3" style="text-align: left;"><textarea cols="45" name="INSURE" rows="3" class="BigInput shebao" wrap="on"></textarea></td>
                <td class="TableData" colspan="3"><textarea cols="45" name="BODY_EXAMIM" rows="3" class="BigInput tijian" wrap="on"></textarea></td>
            </tr>
            <tr>
                <td colspan="6">
                </td>
            </tr>
            <tr>
                <td nowrap="" align="left" colspan="6" class="TableHeader"><fmt:message code="journal.th.Remarks" />：</td>
            </tr>
            <tr>
                <td style="text-align: left;" nowrap="" class="TableData" colspan="6"><textarea name="REMARK" cols="95" rows="3" class="BigInput beizhu" value=""></textarea></td>
            </tr>
           <%-- <tr>
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="depatement.th.Attachmentdocument" />：</b></td>
            </tr>
            <tr>
                <td class="TableData" colspan="6"></td>
            </tr>
            <tr height="25">
                <td nowrap="" class="TableData"><fmt:message code="email.th.filechose" />：</td>
                <td class="TableData" colspan="6">
                    &lt;%&ndash;<script>ShowAddFile('1');</script>&ndash;%&gt;
                    <span id="ATTACHMENT1_div"></span><span id="ATTACHMENT1_upload_div" style="display:none;"></span><div id="SelFileDiv1"></div><a class="addfile" href="javascript:;">添加附件<input class="addfile" type="file" name="ATTACHMENT1_0" id="ATTACHMENT1_0" size="1" hidefocus="true" onchange="AddFile();"></a><a href="javascript:void(0);" onclick="sel_attach('SelFileDiv1','ATTACH_DIR1','ATTACH_NAME1','DISK_ID1');" class="selfile">从文件柜和网络硬盘选择附件</a><input type="hidden" value="" name="ATTACH_NAME1"><input type="hidden" value="" name="ATTACH_DIR1"><input type="hidden" value="" name="DISK_ID1">
                </td>
            </tr>--%>
            <tr>
                <td nowrap="" class="TableHeader" colspan="6"><fmt:message code="HR.TH.resume" />：</td>
            </tr>
            <tr>
                <%--uevar data_器--%>
                <td colspan="6">
                    <div id="word_container" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></div>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="box_two foot_mg">
            <div class="btn_">
                <div id="add_send" value="1" type="publish" class="fot_1 btn_ok" ac="edit"><fmt:message code="global.lang.save" /></div>
                <%--<div id="leave_send" value="0" type="save" class="btn_style btn_ok leave_send"><fmt:message code="hr.th.Quit" /></div>--%>
            </div>
        </div>

    </div>


    <%--新建离职:点击离职后跳转的页面--%>
    <div class="addLeave" style="display: none" >
        <p><fmt:message code="hr.th.NewEmployee" /></p>
        <div class="" >
            <table class="TableBlock" width="100%" align="center">
                <tbody>
                <tr>
                    <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Demission" />：</td>
                    <td class="TableData"  width="180">
                        <input type="text" name="LEAVE_PERSON"  value="" id="LEAVE_PERSON"  class="BigStatic leave_person leaveTestNull" size=12 maxlength=100 readonly=""><span style="color:red;size: 18px">*</span>
                        <a href="javascript:;" class="orgAdd leavePerson_add" id="leavePerson_add"><fmt:message code="global.lang.select" /></a>
                    </td>

                    <td nowrap="" class="TableData"> <fmt:message code="hr.th.AssumeOffice" />：</td>
                    <td class="TableData dept" colspan="2" width="80%">
                        <input type="text" name="POSITION" value="" class="position">
                    </td>
                </tr>
                <tr>
                    <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.TurnoverType" />：</td>
                    <td class="TableData" width="180">
                        <select name="QUIT_TYPE" class="BigSelect quitType" id="QUIT_TYPE">
                            <option value="" selected=""><fmt:message code="hr.th.TurnoverType" /></option>
                            <option value="1"><fmt:message code="hr.th.Resignation" /></option>
                            <option value="2"><fmt:message code="hr.th.Retired" /></option>
                            <option value="3"><fmt:message code="hr.th.retire" /></option>
                            <option value="4"><fmt:message code="hr.th.ToLoan" /></option>
                        </select>
                    </td>
                    <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.DateOfApplication" />：</td>
                    <td class="TableData" width="180">
                        <input type="text" name="APPLICATION_DATE" size="10" maxlength="10" class="BigInput applicationDate leaveTestNull" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)"><span style="color:red;size: 18px">*</span>
                    </td>
                </tr>
                <tr>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.ProposedDateOfDeparture" />：</td>
                    <td class="TableData" width="180">
                        <input type="text" name="QUIT_TIME_PLAN" size="10" maxlength="10" class="BigInput quitTimePlan" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)">
                    </td>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.ActualDeparture" />：</td>
                    <td class="TableData" width="180">
                        <input type="text" name="QUIT_TIME_FACT" size="10" maxlength="10" class="BigInput quitTimeFact leaveTestNull" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)"><span style="color:red;size: 18px">*</span>
                    </td>
                </tr>
                <tr>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.WageDate" />：</td>
                    <td class="TableData" width="180">
                        <input type="text" name="LAST_SALARY_TIME" size="10" maxlength="10" class="BigInput lastSalaryTime" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)">
                    </td>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.DepartureDepartment" />：</td>
                    <td> <input type="text" name="LEAVE_DEPT"  value="" id="LEAVE_DEPT"  class="BigStatic  leaveDept leaveTestNull" size=12 maxlength=100 readonly=""><span style="color:red;size: 18px">*</span>
                        <a href="javascript:;" class="orgAdd dept_add" id="leaveDept_add"><fmt:message code="global.lang.select" /></a></td>
                </tr>
                <tr>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.Month'sSalary" />：</td>
                    <td class="TableData">
                        <input type="text" name="SALARY" id="SALARY" class="BigInput salary" value="" >
                    </td>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.JoinBlacklist" />：</td>
                    <td class="TableData" colspan="2">
                        <input type="checkbox" name="IS_BLACKLIST" id="IS_BLACKLIST" class="isBlackList"></input>
                    </td>
                </tr>
                <tr>
                    <td nowrap="" class="TableData"><fmt:message code="hr.th.Whereabouts" />：</td>
                    <td style="text-align: left;" nowrap="" class="TableData" colspan="3"><textarea name="TRACE" cols="95" rows="3" class="BigInput trace" value=""></textarea></td>
                </tr>
                <%--  <tr>
                      <td nowrap="" align="left" colspan="6" class="TableHeader">离职手续办理：</td>
                  </tr>
                  <tr>
                      <td style="text-align: left;" nowrap="" class="TableData" colspan="6"><textarea name="REMARK" cols="95" rows="3" class="BigInput beizhu" value=""></textarea></td>
                  </tr>--%>
                <tr>
                    <td nowrap=""   class="TableDataTableData"><fmt:message code="journal.th.Remarks" />：</td>
                    <td style="text-align: left;" nowrap="" class="TableData" colspan="3"><textarea name="REMARK" cols="95" rows="3" class="BigInput leaveBeizhu" value=""></textarea></td>
                </tr>
               <%-- <tr height="25">
                    <td nowrap="" class="TableData"><fmt:message code="email.th.filechose" />：</td>
                    <td class="TableData" colspan="6">
                        &lt;%&ndash;<script>ShowAddFile('1');</script>&ndash;%&gt;
                        <span id="ATTACHMENT1_div"></span><span id="ATTACHMENT1_upload_div" style="display:none;"></span><div id="SelFileDiv1"></div><a class="addfile" href="javascript:;"><fmt:message code="email.th.addfile" /><input class="addfile" type="file" name="ATTACHMENT1_0" id="ATTACHMENT1_0" size="1" hidefocus="true" onchange="AddFile();"></a><a href="javascript:void(0);" onclick="sel_attach('SelFileDiv1','ATTACH_DIR1','ATTACH_NAME1','DISK_ID1');" class="selfile">从文件柜和网络硬盘选择附件</a><input type="hidden" value="" name="ATTACH_NAME1"><input type="hidden" value="" name="ATTACH_DIR1"><input type="hidden" value="" name="DISK_ID1">
                    </td>
                </tr>--%>
                <tr>
                    <td nowrap="" class="TableData" ><fmt:message code="hr.th.ReasonsLeaving" />：</td>
                    <td class="TableData" colspan="3"><textarea name="QUIT_REASON" id="QUIT_REASON" cols="95" rows="5" class="quitReason leaveTestNull" ></textarea><span style="color:red;size: 18px">*</span></td>
                </tr>
                </tbody>
            </table>
            <div class="box_two foot_mg">
                <div class="btn_">
                    <div id="leave_baocun" value="0" type="save" class="btn_style btn_ok leave_send"><fmt:message code="global.lang.save" /></div>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
<script>

    //选角色
    $('.userPriv_add').click(function(){
        priv_id='USER_PRIV_NAME';
        $.popWindow("../../common/selectPriv");
    });
    //人员选择控件（离职人员）
    $(".leavePerson_add").on("click",function(){
        user_id='LEAVE_PERSON';
        $.popWindow("../../common/selectUser?0");
    });
    //人员选择控件（直属上级）
    $(".add_shangji").on("click",function(){
        user_id='directlySuperiorName';
        $.popWindow("../../common/selectUser");
    });
    //人员选择控件（直属下级）
    $(".add_xiaji").on("click",function(){
        user_id='directlyUnderName';
        $.popWindow("../../common/selectUser");
    });

    //清空（直属上级）
    $(".clear_shangji").on("click",function(){
        $('#directlySuperiorName').val('');
        $('#directlySuperiorName').attr("dataid",'');
    });
    //人清空（直属下级）
    $(".clear_xiaji").on("click",function(){
        /*直属上级*/
        $('#directlyUnderName').val('');
        $('#directlyUnderName').attr("dataid",'');
    });

    /*时间控件调用*/
    var start = {
        format: 'YYYY-MM-DD',
        choose:get_animal_sign
        //回调函数
    };


    var ue = UE.getEditor('word_container');
    //选部门
    $('#dept_add').click(function(){
        dept_id='DEPT_NAME';
        $.popWindow("../../common/selectDept?0");
    });
    /*人事档案查询*/
    function findSubmit(){
        $('.find_list').show();
        var queryDeptId=$('#DEPT_NAME').attr('deptid');
        if(queryDeptId!=''){
            queryDeptId=queryDeptId.substring(0,queryDeptId.length-1);
        }
        var data={
            leaveShow:$("#SHOW_LEAVE").val(),
            userPriv:$('.per_priv option:checked').attr('value'),
            userPrivName:$('.per_priv option:checked').attr('value'),/*角色*/
            byName:$('#byName').val(),
            staffName:$('#STAFF_NAME').val(),
            beforeName:$('#BEFORE_NAME').val(),
            staffNo: $('#STAFF_NO').val(),
            staffEName:$('#STAFF_E_NAME').val(),
            staffSex:$('.STAFF_SEX option:checked').attr('value'),
            staffCardNo:$('#STAFF_CARD_NO').val(),/*从这开始*/
            staffBirth:$('#birth_start_time').val(),
            staffOccupation:$('#STAFF_OCCUPATION option:checked').attr('value'),/*员工类型*/
            datesEmployed:$('#position_start_time').val(),/*出生日期*/
            workNo:$('#WORK_NO').val(),
            workType:$('#WORK_TYPE').val(),
            deptId:queryDeptId,/*填的部门名称  部门空传0 后续要改 $('#DEPT_NAME').attr('value')*/
            staffHighestSchool:$('#STAFF_HIGHEST_SCHOOL option:checked').attr('value'),/*学历*/
            staffHighestDegree:$('#STAFF_HIGHEST_DEGREE option:checked').attr('value'),/*学位*/
            staffMajor:$('#STAFF_MAJOR').val(),/*专业*/
            staffNationality:$('#STAFF_NATIONALITY').val(),/*民族*/
            staffNativePlace:$('#STAFF_NATIVE_PLACE option:checked').attr('value'),/*籍贯*/
            staffMaritalStatus:$('#STAFF_MARITAL_STATUS option:checked').attr('value'),/*婚姻状况*/
            staffPoliticalStatus:$('#STAFF_POLITICAL_STATUS option:checked').attr('value'),/*政治面貌*/
            joinPartyTime:$('#party_start_time').val(),/*入党时间 时间点*/
            workStatus:$('#WORK_STATUS option:checked').attr('value'),/*在职状态*/
            staffPhone:$('#STAFF_PHONE').val(),/*联系电话*/
            administrationLevel:$('#ADMINISTRATION_LEVEL').val(),/*行政等级*/
            staffMobile:$('#STAFF_MOBILE').val(),
            staffEmail:$('#STAFF_EMAIL').val(),
            staffSkills:$('#STAFF_SKILLS').val(),
            staffMsn:$('#STAFF_MSN').val(),
            staffQq:$('#STAFF_QQ').val(),
            homeAddress:$('#HOME_ADDRESS').val(),
            jobPosition:$('#JOB_POSITION').val(),
            presentPosition:$('#PRESENT_POSITION').val(),/*昵称*/
            jobBeginning:$('#JOB_BEGINNING1').val(),/*参加工作时间  时间点*/
            graduationDate:$('#GRADUATION_DATE1').val(),/*毕业时间 时间点*/
            workAge:$('#WORK_AGE').val(),/*总工龄*/
            jobAge:$('#JOB_AGE').val(),/*本工位年龄*/
            staffHealth:$('#STAFF_HEALTH').val(),/*健康状态*/
            staffDomicilePlace:$('#STAFF_DOMICILE_PLACE').val(),/*户口所在地*/
            graduationSchool:$('#GRADUATION_SCHOOL').val(),/*毕业院校*/
            computerLevel:$('#COMPUTER_LEVEL').val(),/*计算机水平*/
            beginSalsryTime:$('#BEGIN_SALSRY_TIME1').val(),/*起薪时间*/
            foreignLanguage1:$('#FOREIGN_LANGUAGE1').val(),/*语种1*/
            foreignLanguage2:$('#FOREIGN_LANGUAGE2').val(),/*语种2*/
            foreignLanguage3:$('#FOREIGN_LANGUAGE3').val(),/*语种3*/
            foreignLevel1:$('#FOREIGN_LEVEL1').val(),/*语法1*/
            foreignLevel2:$('#FOREIGN_LEVEL2').val(),/*语法2*/
            foreignLevel3:$('#FOREIGN_LEVEL3').val()/*语法3*/

        }
        /*var num1=0;
         if($('#DEPT_NAME').val=''){
         return num1;
         }*/
        $.ajax({
            type:'post',
            url:'<%=basePath%>hr/api/selectOnLinePerson',
            dataType:'json',
            data:data,
            success:function(obj){
                $(".checkOper").remove();
                if(obj.flag==true){
                    var str='';
                    var data=obj.obj;
                    if(data.length>0){
                        for(var i=0;i<data.length;i++){
                            var staffPoliticalStatusName="";
                            if(data[i].staffPoliticalStatus=="1"){
                                staffPoliticalStatusName='<fmt:message code="hr.th.TheMasses" />';
                            }else if(data[i].staffPoliticalStatus=="2"){
                                staffPoliticalStatusName='<fmt:message code="hr.th.Communist" />';
                            }else if(data[i].staffPoliticalStatus=="3"){
                                staffPoliticalStatusName='<fmt:message code="hr.th.CPCMembers" />';
                            }else if(data[i].staffPoliticalStatus=="4"){
                                staffPoliticalStatusName='<fmt:message code="hr.th.CPCProbationaryParty" />';
                            }else if(data[i].staffPoliticalStatus=="5"){
                                staffPoliticalStatusName='<fmt:message code="hr.th.DemocraticParties" />';
                            }else{
                                staffPoliticalStatusName='<fmt:message code="hr.th.PersonagesWithoutParty" />';
                            }
                            var txt=data[i].staffSex==0?'<fmt:message code="userInfor.th.male" />':'<fmt:message code="userInfor.th.female" />';

                            /* var photo=data[i].photo==''?'未上传':data[i].photo;
                             var photoName=data[i].photoName==''?'未上传':data[i].photoName;*/
                            var photo=data[i].photo==''?'<fmt:message code="hr.th.NotUploaded" />':'<fmt:message code="doc.th.Uploaded" />';
                            var photoName=data[i].photoName==''?'<fmt:message code="hr.th.NotUploaded" />':'<fmt:message code="doc.th.Uploaded" />';
                            str+='<tr class="TableData">' +
                                '<td align="center"><input type="checkbox" name="hrms_select" style="margin-left: 42%;" class="checkChild" val="'+data[i].staffId+'"></td>'
                                +'<td align="center">'+data[i].staffName+'</td>' +
                                '<td nowrap="" align="center" style="font-weight: bold; color: red">'+photo+'</td>' +
                                '<td nowrap="" align="center" style="font-weight: bold; color: red">'+photoName+'</td>'
                                +'<td nowrap="" align="center">'+data[i].userPrivName+'</td>' +
                                '<td nowrap="" align="center">'+txt+'</td>' +
                                '<td nowrap="" align="center">'+data[i].staffBirth+'</td>' +
                                '<td nowrap="" align="center">'+data[i].staffNationality+'</td>' +
                                '<td nowrap="" align="center">'+data[i].staffNativePlace2+'</td>' +
                                '<td nowrap="" align="center">'+staffPoliticalStatusName+'</td>' +
                                '<td nowrap="" align="center">'+data[i].datesEmployed+'</td>' +
                                '<td align="center">'
                                +'<a href="/hr/page/personnelInformation?staffId='+data[i].staffId+'" target="_blank"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;'
                                +'<a class="hr_edit"  uid="'+data[i].uid+'" href="javascript:void(0);"><fmt:message code="global.lang.edit" /></a>&nbsp;&nbsp;' +
                                '<a href="javascript:void(0)" style="color: #C81623 !important;" class="delBtnSingle" val="'+data[i].staffId+'"><fmt:message code="global.lang.delete" /></a>' +
                                '</td></tr>'
                        }
                        var thea='<thead class="TableHeader"><tr><td nowrap="" align="center"><fmt:message code="global.lang.select" /></td><td nowrap="" align="center"><fmt:message code="userDetails.th.name" /></td>'
                            +'<td nowrap="" align="center"><fmt:message code="interfaceSetting.th.UserAvatar" /></td><td nowrap="" align="center"><fmt:message code="HR.TH.FileAvatar" /></td><td nowrap="" align="center">OA<fmt:message code="userManagement.th.role" /></td>'
                            +'<td nowrap="" align="center"><fmt:message code="userDetails.th.Gender" /></td><td nowrap="" align="center"><fmt:message code="hr.th.DateOfBirth" /></td><td nowrap="" align="center"><fmt:message code="hr.th.Nation" /></td><td nowrap="" align="center"><fmt:message code="hr.th.PlaceOfOrigin" /></td>'
                            +'<td nowrap="" align="center"><fmt:message code="hr.th.PoliticalOutlook" /></td><td nowrap="" align="center" width="132"><fmt:message code="hr.th.InductionTime" /></td><td align="center" width="150"><fmt:message code="menuSSetting.th.menuSetting" /></td></tr></thead>'

                        $('#TableBlock').hide();
                        $('#flist').html(thea+str);
                        $(".find_list").append('<div class="checkOper" style=" text-align:center;margin-top:10px;font-size: 12px;"><input type="checkbox" name="hrms_select" style="margin-left: 3%;" id="checkedAll"><fmt:message code="notice.th.allchose" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:void(0);" class="delete_check delButMul" style="font-size:12px;width:74px;line-height:24px"><fmt:message code="global.lang.delete" /></a></div>');
//                        console.log(str);
                    }else{
                        layer.msg('<fmt:message code="hr.th.NoQualified" />', {icon: 6});
                    }

                }

            }
        })
    }

    $('#flist').on('click','.hr_edit',function(){
        /* $.popWindow('writeEmail','<fmt:message code="global.lang.reply" />','0','0','1500px','800px');*/
    })
    //在列表中进行单个删除
    $('.fList').on('click','.delBtnSingle',function () {
        var staffId=$(this).attr("val")+",";
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="doc.th.DeletePersonnelFile" />"
        }, function(){
            $.ajax({
                type:'post',
                url:'/hr/api/deletePersonById',
                dataType:'json',
                data:{'staffId':staffId},
                success:function(obj){
                    if(obj.flag){
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 6}, function () {
                            findSubmit();
                        })
                    }
                }
            });
        }, function(index){
            layer.close(index);
        });
    })

    $(function(){
        $('.find_list').on('click','#checkedAll',function (){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
                $(".checkChild").prop("checked",true);
            }else{
                $(this).prop("checked",false);
                $(".checkChild").prop("checked",false);;
            }
        })

        //职务下拉列表
        $.ajax({
            type: 'post',
            url: '/duties/selectUserPostList',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                str="<option value='0'><fmt:message code="hr.th.PleaseSelect" /></option>";
                str1="<option value=''><fmt:message code="hr.th.PleaseSelect" /></option>";
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+="<option value='"+data[i].postId+"'>"+data[i].postName+"</option>";
                        str1+="<option value='"+data[i].postId+"'>"+data[i].postName+"</option>";
                    }
                }
                $(".per_zhiwu").html(str);
                $("#JOB_POSITION").html(str1);
            }
        });
        //岗位下拉列表
        $.ajax({
            type: 'post',
            url: '/position/selectUserJob',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                str="<option value='0'><fmt:message code="hr.th.PleaseSelect" /></option>";
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+="<option value='"+data[i].jobId+"'>"+data[i].jobName+"</option>";
                    }
                }
                $(".per_yingpin").html(str);
            }
        });
    })

    //进行多个删除
    $('.find_list').on('click','.delButMul',function () {
        if($(".checkChild:checkbox:checked").length<=0){
            $.layerMsg({content: '<fmt:message code="hr.th.pleaseChoose" />！', icon: 2}, function () {
            })
            return;
        }
        var staffIdStr="";
        $(".checkChild:checkbox:checked").each(function(){
            staffIdStr+=$(this).attr("val")+",";
        })
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="doc.th.DeletePersonnelFile" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'/hr/api/deletePersonById',
                dataType:'json',
                data:{'staffId':staffIdStr},
                success:function(obj){
                    /*location.reload();*/
                    if(obj.flag){
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 6}, function () {
                            findSubmit();
                        })
                    }
                }
            });

            /* $(".table_personDetail").show();
             $(".find_list").hide();
             $(".show_list").hide();*/
        }, function(index){
            layer.close(index);
        });
    })



    /*点击编辑，展示其对应的详情接口*/
    $('.find_list').on('click','.hr_edit',function(){
        $(".table_personDetail").show();
        $(".find_list").hide();
        $(".show_list").hide();
        var uid=$(this).attr('uid');
        $('.table_personDetail').show().siblings().hide();
        $('#add_send').attr('ac','edit');
        $("#showImage").html("");
        //先清空头像
        $(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');
        var data={
            'uid':uid
        }
        ue.ready(function(){
            $.ajax({
                type:'get',
                url:'<%=basePath%>hr/api/getPersonFileByUserId',
                dataType:'json',
                data:data,
                success:function(res){
                    var data=res;
                    var str='';
                    //清空星座和生肖
                    $("#animal_id").val('');
                    $("#sign_id").val('');

                    $(".uid").val(data.uid);
                    $(".user_id").val(data.userId);//userId
                    $(".staffId").val(data.staffId);
                    $(".byName").val(data.byName);
                    $('.per_name').val(data.staffName);/*姓名*/
                    $('.dept_name').val(data.deptName);/*部门 缺少字段*/
                    $('.per_health').val(data.staffHealth);/*健康*/
                    $('.per_zhuanye').val(data.staffMajor);/*专业*/
                    $('.per_school').val(data.graduationSchool);/*大学*/
                    //$('.per_familyAdd').val(data.homeAddress);/*家庭住址*/
                    $('.per_email').val(data.staffEmail);/*邮件*/
                    $('.userPrivName').val(data.userPrivName);/*角色*/
                    /*$(".userPriv").val(data.userPriv);//角色id*/
                    $(".userPrivName").attr("userPriv",data.userPriv);//角色id
                    $('.per_engname').val(data.staffEName);/*本人的英文姓名*/
                    $('.per_minzu').val(data.staffNationality);/*民族*/
                    $('.per_worknum').val(data.workNo);/*工号*/
                    $('.per_sex').val(data.staffSex);/*性别*/
                    $('.per_ident').val(data.staffCardNo);/*身份证号*/
                    if(data.staffBirth=='0000-00-00'){//出生日期
                        $('.per_date').val('');
                    }else{
                        $('.per_date').val(data.staffBirth);
                    }
                    $('.per_age').val(data.staffAge);/*年龄*/
                    $('.per_yearjia').val(data.leaveType);/*年休假 */
                    $('.per_address').val(data.staffNativePlace);/*籍贯*/
                    $('.per_detialAdd').val(data.staffNativePlace2);/*具体籍贯*/
                    $('.per_xiexing').val(data.bloodType);/*血型*/
                    $('.per_hunyin').val(data.staffMaritalStatus);/*婚姻状况*/
                    $('.per_zhengzhi').val(data.staffPoliticalStatus);/*政治面貌*/
                    if(data.joinPartyTime=='0000-00-00'){
                        $('.per_dang').val('');
                    }else{
                        $('.per_dang').val(data.joinPartyTime);
                    }/*入党时间*/
                    $('.per_hukou').val(data.staffType);/*户口类别*/
                    $('.per_hukouAdd').val(data.staffDomicilePlace);/*户口所在地*/
                    $('.per_gongzhong').val(data.workType);/*工种*/
                    $('.per_xingzheng').val(data.administrationLevel);/*行政级别 */
                    $('.per_yuangongType').val(data.staffOccupation);/*员工类型*/
                    $('.per_zhiwu').val(data.jobPosition);/*职务*/
                    $('.per_zhicheng').val(data.presentPosition);/*职称*/
                    if(data.datesEmployed=='0000-00-00'){
                        $('.per_ruzhiTime').val('');
                    }else{
                        $('.per_ruzhiTime').val(data.datesEmployed);
                    }/*入职时间*/
                    $('.per_zhichengjibie').val(data.workLevel);/*职称级别*/
                    $('.per_yingpin').val(data.workJob);/*应聘岗位*/
                    $('.per_kaoqin').val(data.workNo);/*考勤排班类别   ====》无字段 未找到*/
                    $('.per_gongling').val(data.jobAge);/*本单位工龄*/
                    $('.per_allage').val(data.workAge);/*总工龄*/
                    if(data.beginSalsryTime=='0000-00-00'){
                        $('.per_xinziTime').val('');
                    }else{
                        $('.per_xinziTime').val(data.beginSalsryTime);
                    }/*起薪时间 ===》找到*/
                    $('.per_zaizhizhuangtai').val(data.workStatus);/*在职状态*/
                    if(data.jobBeginning=='0000-00-00'){
                        $('.per_joinWork').val('');
                    }else{
                        $('.per_joinWork').val(data.jobBeginning);
                    }//参加工作时间
                    $('.per_dianhua').val(data.staffPhone);/*联系电话*/
                    $('.per_phone').val(data.staffMobile);/*手机号码*/
                    $('.per_msn').val(data.staffMsn);/*msn*/
                    $('.per_familyAdd').val(data.homeAddress);/*家庭地址 */
                    $('.per_elseType').val(data.otherContact);/*其他联系方式*/
                    $('.per_yanjiu').val(data.researchResults);/*研究领域 未找到*/
                    $('.per_socish').val(data.partTime);/*社会兼职*/
                    $('.per_success').val(data.researchResults);/*成果介绍*/
                    $('#directlySuperiorName').val(data.directlySuperiorName);
                    $('#directlySuperiorName').attr("dataid",data.directlySuperior);
                    /*直属上级*/
                    $('#directlyUnderName').val(data.directlyUnderName);
                    $('#directlyUnderName').attr("dataid",data.directlyUnder);/*直属下级*/
                    $('.per_kaihuhang').val(data.bank1);/*开户行1*/
                    $('.per_kaihuhangtwo').val(data.bank2);/*开户行2*/
                    $('.zhanghuone').val(data.bankAccount1);/*开户行的账号1*/
                    $('.zhanghutwo').val(data.bankAccount2);/*开户行的账号2*/
                    $('.per_xueli').val(data.staffHighestSchool);/*学历*/
                    $('.per_xuewei').val(data.staffHighestDegree);/*学位*/
                    if(data.graduationDate=='0000-00-00'){
                        $('.per_overtime').val('');
                    }else{
                        $('.per_overtime').val(data.graduationDate);
                    }/*毕业时间*/
                    $('.per_shuiping').val(data.computerLevel);/*计算机水平*/
                    $('.per_yuzhongone').val(data.foreignLanguage1);/*外语语种1*/
                    $('.per_yuzhongtwo').val(data.foreignLanguage2);/*外语语种2*/
                    $('.per_yuzhongthree').val(data.foreignLanguage3);/*外语语种3*/
                    $('.per_waiyuthree').val(data.foreignLevel1);/*外语水平1*/
                    $('.per_waiyutwo').val(data.foreignLevel2);/*外语水平2*/
                    $('.per_waiyuone').val(data.foreignLevel3);/*外语水平3*/
                    $('.per_techang').val(data.staffSkills);/*特长*/
                    $('.zhiwu').val(data.certificate);/*职务情况 */
                    $('.danbao').val(data.surety);/*担保记录*/
                    $('.shebao').val(data.insure);/*社保*/
                    $('.tijian').val(data.bodyExamim);/*体检*/
                    $('.beizhu').val(data.remark);/*备注*/
                    $(".per_qq").val(data.staffQq);//qq
                    $(".per_num").val(data.staffNo);//编号
                    $(".per_overname").val(data.beforeName);//曾用名
                    $(".dept_id").val(data.deptId);//部门编号
                    ue.setContent(data.resume);/*简历*/

                    var birth=$("#STAFF_BIRTH").val();
                    if (birth != '' && birth != '0000-00-00') {
                        var birth=$("#STAFF_BIRTH").val();
                        $("#animal_id").val(Calculator.shengxiao(birth));
                        birth=birth.replace(/-/g,"");
                        var month=birth.substring(4,6);
                        var day=birth.substring(6,8);
                        $("#sign_id").val(Calculator.xingzuo(month,day));
                    }
                    //是否农历
                    if(data.isLunar==1){
                        console.log( $("#IS_LUNAR").attr("checked"));
                        $("#IS_LUNAR").prop("checked",true);
                    }else{
                        $("#IS_LUNAR").prop("checked",false);
                    }
                    /*是否成为专家*/
                    if(data.isExperts==1){
                        $('.isExperts').eq(0).prop("checked",true);
                    }else{
                        $('.isExperts').eq(1).prop("checked",true);
                    }
                    //头像
                    $("#showImage").html(data.photoName);
                    if(data.photoName!=''){
                        $(".hr_photo").html('<image  style="width:140px;height:135px;" src="<%=basePath%>img/hr/'+data.photoName+'" >');//头像
                    }else{
                        $(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');
                    }
                }
            })
        })
    })

    /*编辑之后保存接口*/
    $('#add_send').on('click', function () {
        var cardId=$(".per_ident").val();
        var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if(cardId!='') {
            if (!regIdNo.test(cardId)) {
                alert('<fmt:message code="vote.th.IDMistaken" />');
                return false;
            }
        }
        var array=$(".test_null");
        var arrayText=$(".test_text");
        for(var i=0; i< array.length; i++){
            if(array[i].value==""){
                var tmp=$(arrayText[i]).text();
                if(tmp.indexOf("：")>=0){
                    tmp=tmp.substring(0,tmp.length-1);
                }
                $.layerMsg({content:tmp+"不能为空",icon: 2}, function(){
                });
                return;
            }
        }
        var userPriv=$('.userPrivName ').attr("userpriv");
        if (userPriv!="" && userPriv.indexOf(',') >= 0){
            userPriv= userPriv.substr(0,
                userPriv.length-1);
        }
        var isLunar=0;
        if($("#IS_LUNAR").prop("checked")){
            isLunar=1;
        }
        var data_all={
            uid:$(".uid").val(), staffId:$(".staffId").val(), staffName: $('.per_name').val(), /*姓名*/
            deptName:$('.dept_name').val(), /*部门   却少字段*/
            deptId:$(".dept_id").val(),
            staffHealth:$('.per_health').val(), /*健康*/
            staffMajor:$('.per_zhuanye').val(),/*专业*/
            graduationSchool:$('.per_school').val(), /*大学*/
            homeAddress:$('.per_familyAdd').val(), /*家庭住址*/ staffEmail:$('.per_email').val(),/*邮件*/
            userPriv: userPriv,/*角色*/
            userName:$('.per_name').val(),/*本人的中文姓名*/
            staffEName:$('.per_engname').val(),/*本人的英文姓名*/
            userId:$('.user_id').val(),/*用户名*/ workNo:$('.per_worknum').val(), /*工号*/
            staffSex:$('.per_sex').val(),/*性别*/
            staffCardNo:$('.per_ident').val(),/*身份证号*/ staffBirth:$('.per_date').val(), /*出生日期*/
            staffAge:$('.per_age').val(),/*年龄*/
            leaveType:$('.per_yearjia').val(), /*年休假 */
            staffNativePlace:$('.per_address').val(),/*籍贯*/
            staffNativePlace2:$('.per_detialAdd').val(),/*具体籍贯*/
            bloodType: $('.per_xiexing').val(), /*血型*/
            staffMaritalStatus:$('.per_hunyin').val(),/*婚姻状况*/
            staffPoliticalStatus:$('.per_zhengzhi').val(),/*政治面貌*/ joinPartyTime:$('.per_dang').val(),/*入党时间*/
            staffType:$('.per_hukou').val(),/*户口类别*/
            staffDomicilePlace:$('.per_hukouAdd').val(), /*户口所在地*/
            workType:$('.per_gongzhong').val(),/*工种*/
            administrationLevel:$('.per_xingzheng').val(),/*行政级别 */
            staffOccupation:$('.per_yuangongType').val(),/*员工类型*/
            jobPosition: $('.per_zhiwu').val(), /*职务*/
            presentPosition:$('.per_zhicheng').val(), /*职称*/
            datesEmployed: $('.per_ruzhiTime').val(), /*入职时间*/
            workLevel:$('.per_zhichengjibie').val(),/*职称级别*/
            workJob:$('.per_yingpin').val(),/*应聘岗位*/ /*userPrivName:$('.per_kaoqin').val(),*//*考勤排班类别   ====》无字段 未找到*/
            jobAge:$('.per_gongling').val(),/*本单位工龄*/ workAge:$('.per_allage').val(),
            /*总工龄*/ beginSalsryTime:$('.per_xinziTime').val(),
            /*起薪时间 ===》 找到*/
            workStatus: $('.per_zaizhizhuangtai').val(),/*在职状态*/
            jobBeginning:$('.per_joinWork').val(), /*参加工作时间*/
            staffPhone:$('.per_dianhua').val(),/*联系电话*/ staffMobile:$('.per_phone').val(), /*手机号码*/
            staffMsn:$('.per_msn').val(), /*msn*/
            // homeAddress:$('.per_familyAdd').val(),/*家庭地址 */
            otherContact:$('.per_elseType').val(), /*其他联系方式*/
            isExperts:$('.isExperts:checked').val(), /*是否成为专家          单选*/
            // researchResults:$('.per_yanjiu').val(),/*研究领域 未找到*/
            partTime:$('.per_socish').val(), /*社会兼职*/
            researchResults:$('.per_success').val(), /*成果介绍*/
            directlySuperior:$('#directlySuperiorName').attr('dataid'), /*直属上级*/
            directlyUnder:$('#directlyUnderName').attr('dataid'), /*直属下级*/
            bank1:$('.per_kaihuhang').val(), /*开户行1*/
            bank2:$('.per_kaihuhangtwo').val(), /*开户行2*/
            bankAccount1:$('.zhanghuone').val(), /*开户行的账号1*/
            bankAccount2:$('.zhanghutwo').val(), /*开户行的账号2*/
            staffHighestSchool:$('.per_xueli').val(), /*学历*/
            staffHighestDegree:$('.per_xuewei').val(), /*学位*/
            graduationDate:$('.per_overtime').val(), /*毕业时间*/
            computerLevel:$('.per_shuiping').val(), /*计算机水平*/
            foreignLanguage1:$('.per_yuzhongone').val(), /*外语语种1*/
            foreignLanguage2:$('.per_yuzhongtwo').val(), /*外语语种2*/
            foreignLanguage3:$('.per_yuzhongthree').val(), /*外语语种3*/
            foreignLevel1:$('.per_waiyuone').val(), /*外语水平1*/
            foreignLevel2:$('.per_waiyutwo').val(), /*外语水平2*/
            foreignLevel3:$('.per_waiyuthree').val(), /*外语水平3*/
            staffSkills:$('.per_techang').val(), /*特长*/
            certificate:$('.zhiwu').val(), /*职务情况 */
            surety:$('.danbao').val(), /*担保记录*/
            insure:$('.shebao').val(), /*社保*/
            bodyExamim:$('.tijian').val(), /*体检*/
            remark:$('.beizhu').val(), /*备注*/
            staffNationality:$('.per_minzu').val(), /*民族*/
            beforeName:$('.per_overname').val(), /*曾用名*/
            staffNo:$(".per_num").val(), /*编号*/
            isLunar:isLunar,
            staffQq:$('.per_qq').val(),
            resume: ue.getContentTxt()/*简历*/
        }
        $.ajax({
            type:'post',
            url:'<%=basePath%>hr/api/editPersonFile',
            dataType:'json',
            data:data_all,
            success:function(res){
                if(res.flag==true) {
                    submitPhoto();
                    layer.msg('<fmt:message code="diary.th.modify" />', {icon: 6});
//                    findSubmit();
                }

            }
        })

    })
    //头像
    function submitPhoto()
    {
        var imageFile=$("#imageFile").val();
        var userId=$('.user_id').val();
        if(imageFile!=''){
            $("#photoForm").ajaxSubmit({
                url: '/hr/api/uploadImage?userId='+userId,
                type: "post",
                enctype: 'multipart/form-data',
                // iframe: true,
                dataType:'json',
                success: function (data)
                {
                },
            })
        }
    }
    //新建离职，进行保存
    $("#leave_baocun").click(function () {
        var array = $(".leaveTestNull");
        for (var i = 0; i < array.length; i++) {
            if (array[i].value == "") {
                $.layerMsg({content: "<fmt:message code="sup.th.With*" />", icon: 2}, function () {
                });
                return;
            }
        }
        var isBlackList = $(".isBlackList").attr("checked");
        var data = {
            'leavePerson': $(".leave_person").attr("user_id"),
            'position': $(".position").val(),
            'quitType': $(".quitType").val(),
            'applicationDate': $(".applicationDate").val(),
            'quitTimePlan': $(".quitTimePlan").val(),
            'quitTimeFact': $(".quitTimeFact").val(),
            'lastSalaryTime': $(".lastSalaryTime").val(),
            'leaveDept': $(".leaveDept").attr("deptid"),
            'salary': $(".salary").val(),
            'isBlackList': isBlackList,
            'trace': $(".trace").val(),
            'remark': $(".leaveBeizhu").val(),
            'quitReason': $(".quitReason").val()
        }
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/leave/addLeaveInfor',
            dataType: 'json',
            data: data,
            success: function (res) {
                var data = res;
                if (res.flag) {
                    $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                        /*$('.childQuery').show().siblings().hide();*/
                        window.location.reload();
                    });
                }
            }
        })
    })

    //点击离职后跳转到新建离职页面
    $("#leave_send").click(function () {
        //点击离职，先将用户信息保存到人事表中
        var array=$(".test_null");
        var arrayText=$(".test_text");
        for(var i=0; i< array.length; i++){
            if(array[i].value==""){
                var tmp=$(arrayText[i]).text();
                if(tmp.indexOf("：")>=0){
                    tmp=tmp.substring(0,tmp.length-1);
                }
                $.layerMsg({content:tmp+"不能为空",icon: 2}, function(){
                });
                return;
            }
        }
        var userPriv = $('.userPrivName ').attr("userpriv");
        if (userPriv != "" && userPriv.indexOf(',') >= 0) {
            userPriv = userPriv.substr(0, userPriv.length - 1);
        }
        var isLunar=0;
        if($("#IS_LUNAR").prop("checked")){
            isLunar=1;
        }
        var data_all = {
            uid: $(".uid").val(),
            staffId: $(".staffId").val(),
            staffName: $('.per_name').val(), /*姓名*/
            deptName: $('.dept_name').val(), /*部门   却少字段*/
            deptId: $(".dept_id").val(),
            staffHealth: $('.per_health').val(), /*健康*/
            staffMajor: $('.per_zhuanye').val(), /*专业*/
            graduationSchool: $('.per_school').val(), /*大学*/
            homeAddress: $('.per_familyAdd').val(), /*家庭住址*/
            staffEmail: $('.per_email').val(), /*邮件*/
            userPriv: userPriv, /*角色*/
            userName: $('.per_name').val(), /*本人的中文姓名*/
            staffEName: $('.per_engname').val(), /*本人的英文姓名*/
            userId: $('.user_id').val(), /*用户名*/
            workNo: $('.per_worknum').val(), /*工号*/
            staffSex: $('.per_sex').val(), /*性别*/
            staffCardNo: $('.per_ident').val(), /*身份证号*/
            staffBirth: $('.per_date').val(), /*出生日期*/
            staffAge: $('.per_age').val(), /*年龄*/
            leaveType: $('.per_yearjia').val(), /*年休假 */
            staffNativePlace: $('.per_address').val(), /*籍贯*/
            staffNativePlace2: $('.per_detialAdd').val(), /*具体籍贯*/
            bloodType: $('.per_xiexing').val(), /*血型*/
            staffMaritalStatus: $('.per_hunyin').val(), /*婚姻状况*/
            staffPoliticalStatus: $('.per_zhengzhi').val(), /*政治面貌*/
            joinPartyTime: $('.per_dang').val(), /*入党时间*/
            staffType: $('.per_hukou').val(), /*户口类别*/
            staffDomicilePlace: $('.per_hukouAdd').val(), /*户口所在地*/
            workType: $('.per_gongzhong').val(), /*工种*/
            administrationLevel: $('.per_xingzheng').val(), /*行政级别 */
            staffOccupation: $('.per_yuangongType').val(), /*员工类型*/
            jobPosition: $('.per_zhiwu').val(), /*职务*/
            presentPosition: $('.per_zhicheng').val(), /*职称*/
            datesEmployed: $('.per_ruzhiTime').val(), /*入职时间*/
            workLevel: $('.per_zhichengjibie').val(), /*职称级别*/
            workJob: $('.per_yingpin').val(), /*应聘岗位*/
            /*userPrivName:$('.per_kaoqin').val(),*//*考勤排班类别   ====》无字段 未找到*/
            jobAge: $('.per_gongling').val(), /*本单位工龄*/
            workAge: $('.per_allage').val(), /*总工龄*/
            beginSalsryTime: $('.per_xinziTime').val(), /*起薪时间 ===》 找到*/
            workStatus: $('.per_zaizhizhuangtai').val(), /*在职状态*/
            jobBeginning: $('.per_joinWork').val(), /*参加工作时间*/
            staffPhone: $('.per_dianhua').val(), /*联系电话*/
            staffMobile: $('.per_phone').val(), /*手机号码*/
            staffMsn: $('.per_msn').val(), /*msn*/
            // homeAddress:$('.per_familyAdd').val(),/*家庭地址 */
            otherContact: $('.per_elseType').val(), /*其他联系方式*/
            isExperts: $('.isExperts:checked').val(), /*是否成为专家          单选*/
            // researchResults:$('.per_yanjiu').val(),/*研究领域 未找到*/
            partTime: $('.per_socish').val(), /*社会兼职*/
            researchResults: $('.per_success').val(), /*成果介绍*/
            directlySuperior:$('#directlySuperiorName').attr('dataid'), /*直属上级*/
            directlyUnder:$('#directlyUnderName').attr('dataid'), /*直属下级*/
            bank1: $('.per_kaihuhang').val(), /*开户行1*/
            bank2: $('.per_kaihuhangtwo').val(), /*开户行2*/
            bankAccount1: $('.zhanghuone').val(), /*开户行的账号1*/
            bankAccount2: $('.zhanghutwo').val(), /*开户行的账号2*/
            staffHighestSchool: $('.per_xueli').val(), /*学历*/
            staffHighestDegree: $('.per_xuewei').val(), /*学位*/
            graduationDate: $('.per_overtime').val(), /*毕业时间*/
            computerLevel: $('.per_shuiping').val(), /*计算机水平*/
            foreignLanguage1: $('.per_yuzhongone').val(), /*外语语种1*/
            foreignLanguage2: $('.per_yuzhongtwo').val(), /*外语语种2*/
            foreignLanguage3: $('.per_yuzhongthree').val(), /*外语语种3*/
            foreignLevel1: $('.per_waiyuone').val(), /*外语水平1*/
            foreignLevel2: $('.per_waiyutwo').val(), /*外语水平2*/
            foreignLevel3: $('.per_waiyuthree').val(), /*外语水平3*/
            staffSkills: $('.per_techang').val(), /*特长*/
            certificate: $('.zhiwu').val(), /*职务情况 */
            surety: $('.danbao').val(), /*担保记录*/
            insure: $('.shebao').val(), /*社保*/
            bodyExamim: $('.tijian').val(), /*体检*/
            remark: $('.beizhu').val(), /*备注*/
            staffNationality: $('.per_minzu').val(), /*民族*/
            beforeName: $('.per_overname').val(), /*曾用名*/
            staffNo: $(".per_num").val(), /*编号*/
            isLunar:isLunar,
            resume: ue.getContentTxt()/*简历*/
        }
        $.ajax({
            type: 'post',
            url: '<%=basePath%>hr/api/editPersonFile',
            dataType: 'json',
            data: data_all,
            success: function (res) {
            }
        })
        //进行跳转页面，进行离职保存
        $(".addLeave").show();
        $(this).parents('#table_personDetail').hide()
        var data = {
            'uid': $("#UID").val()
        }
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/api/getPersonFileByUserId',
            dataType: 'json',
            data: data,
            success: function (res) {
                var data = res;
                $(".leave_person").val(data.staffName);
                $(".leave_person").attr("user_id", data.userId);
                $(".leaveDept").val(data.deptName);
                $(".leaveDept").attr("deptid", data.deptId);
            }
        })
    })

    //新建离职，进行保存
    $("#leave_baocun").click(function () {
        var array = $(".leaveTestNull");
        for (var i = 0; i < array.length; i++) {
            if (array[i].value == "") {
                $.layerMsg({content: "<fmt:message code="sup.th.With*" />", icon: 2}, function () {
                });
                return;
            }
        }
        var isBlackList = $(".isBlackList").attr("checked");
        var data = {
            'leavePerson': $(".leave_person").attr("user_id"),
            'position': $(".position").val(),
            'quitType': $(".quitType").val(),
            'applicationDate': $(".applicationDate").val(),
            'quitTimePlan': $(".quitTimePlan").val(),
            'quitTimeFact': $(".quitTimeFact").val(),
            'lastSalaryTime': $(".lastSalaryTime").val(),
            'leaveDept': $(".leaveDept").attr("deptid"),
            'salary': $(".salary").val(),
            'isBlackList': isBlackList,
            'trace': $(".trace").val(),
            'remark': $(".beizhu").val(),
            'quitReason': $(".quitReason").val()
        }
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/leave/addLeaveInfor',
            dataType: 'json',
            data: data,
            success: function (res) {
                var data = res;
                if (res.flag) {
                    $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                        $('.childQuery').show().siblings().hide();
                    });
                }
            }
        })
    })

    //计算生肖和星座
    var Calculator = function () {
        /* *
         *  计算生肖
         *      支持简写生日，比如01，转换为2001，89转换为1989；
         *      支持任何可以进行时间转换的格式，比如'1989/01/01','1989 01'等
         * */
        function getShengXiao(birth) {
            birth += '';
            var len = birth.length;
            if (len < 4 && len != 2) {
                return
                false;
            }
            if (len == 2) {
                birth - 0 > 30 ? birth = '19' + birth : birth = '20' + birth;
            }
            var year = (new Date(birth)).getFullYear();
            var arr = ['猴', '鸡', '狗', '猪', '鼠', '牛', '虎', '兔', '龙', '蛇', '马', '羊'];
            return /^\d{4}$/.test(year) ? arr[year % 12] : false;
        }

        /* *
         *  计算星座
         *      支持传递[月日]，[月,日]，[年月日]等格式，详见例子
         * */
        function getxingzuo(month, day) {
            var d = new Date(1999, month - 1, day, 0, 0, 0);
            var arr = [];
            arr.push(["魔羯座", new Date(1999, 0, 1, 0, 0, 0)])
            arr.push(["水瓶座", new Date(1999, 0, 20, 0, 0, 0)])
            arr.push(["双鱼座", new Date(1999, 1, 19, 0, 0, 0)])
            arr.push(["牡羊座", new Date(1999, 2, 21, 0, 0, 0)])
            arr.push(["金牛座", new Date(1999, 3, 21, 0, 0, 0)])
            arr.push(["双子座", new Date(1999, 4, 21, 0, 0, 0)])
            arr.push(["巨蟹座", new Date(1999, 5, 22, 0, 0, 0)])
            arr.push(["狮子座", new Date(1999, 6, 23, 0, 0, 0)])
            arr.push(["处女座", new Date(1999, 7, 23, 0, 0, 0)])
            arr.push(["天秤座", new Date(1999, 8, 23, 0, 0, 0)])
            arr.push(["天蝎座", new Date(1999, 9, 23, 0, 0, 0)])
            arr.push(["射手座", new Date(1999, 10, 22, 0, 0, 0)])
            arr.push(["魔羯座", new Date(1999, 11, 22, 0, 0, 0)])
            for (var i = arr.length - 1; i >= 0; i--) {
                if (d >= arr[i][1]) return arr[i][0];
            }
        }
        return{
            shengxiao: getShengXiao,
            xingzuo: getxingzuo
        }
    }()


    function get_animal_sign(){
        var birth=$("#STAFF_BIRTH").val();
        if (birth != '' && birth != '0000-00-00') {
            $("#animal_id").val(Calculator.shengxiao(birth));
            birth = birth.replace(/-/g, "");
            var month = birth.substring(4, 6);
            var day = birth.substring(6, 8);
            $("#sign_id").val(Calculator.xingzuo(month, day));
        }
    }

    //身份证号进行校验STAFF_CARD_NO
    function  check(){
        var cardId=$(".per_ident").val();
        var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if(cardId!=''){
            if(!regIdNo.test(cardId)){
                alert('<fmt:message code="vote.th.IDMistaken" />');
                return false;
            }
            //出生日期
            var birth=cardId.substring(6, 10) + "-" + cardId.substring(10, 12) + "-" + cardId.substring(12, 14);
            $("#STAFF_BIRTH").val(birth);
            //年龄
            var myDate = new Date();
            var month = myDate.getMonth() + 1;
            var day = myDate.getDate();
            var age = myDate.getFullYear() - cardId.substring(6, 10) - 1;
            if (cardId.substring(10, 12) < month || cardId.substring(10, 12) == month && cardId.substring(12, 14) <= day) {
                age++;
            }
            $("[name='STAFF_AGE']").val(age);
            //生肖
            var shengxiao=Calculator.shengxiao(birth);
            $("#animal_id").val(shengxiao);
            //星座
            var xingzuo=Calculator.xingzuo(cardId.substring(10, 12),cardId.substring(12, 14) );
            $("#sign_id").val(xingzuo);
        }
    }
</script>
</html>

