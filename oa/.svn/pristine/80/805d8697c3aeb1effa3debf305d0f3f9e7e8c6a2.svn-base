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
    <meta charset="UTF-8">
    <title><fmt:message code="main.userquery" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/index.css"/>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/sys/userInfor.js" type="text/javascript" charset="utf-8"></script>
    <style>

    </style>
</head>
<body>
<table class="TableBlock" width="770" align="center">
    <tbody><tr>
        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="url.th.EssentialInformation" /></b></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100">OA<fmt:message code="userName" />：</td>
        <td class="TableData" width="180" colspan="4">
            <input type="hidden" name="USER_ID" value="admin">
            <input type="text" name="BYNAME" id="BYNAME" value="admin" class="BigStatic" readonly="">
        </td>
        <td class="TableData" align="center" rowspan="6" colspan="2">
            <center><fmt:message code="hr.th.NoPhotos" /></center>        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.department" />：</td>
        <td class="TableData">
            <input type="hidden" name="DEPT_ID" value="2">
            <input type="text" name="DEPT_NAME" value="<fmt:message code="hr.th.NorthernResearch" />" class="BigStatic" size="20" maxlength="100" readonly="">
        </td>
        <td nowrap="" class="TableData"> <fmt:message code="userManagement.th.role" />：</td>
        <td class="TableData" colspan="2" width="80%">OA <fmt:message code="diary.th.manager" /></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.number" />：</td>
        <td class="TableData" width="180"><input type="text" name="STAFF_NO" value="" class="BigInput" onblur="check_no(this.value,'admin')"></td>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.JobNumber" />：</td>
        <td class="TableData" colspan="2"><input type="text" name="WORK_NO" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="userDetails.th.name" />：</td>
        <td class="TableData">
            <input type="text" name="STAFF_NAME" value="系统管理员" class="BigStatic" readonly="">
        </td>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.NameUsedBefore" />：</td>
        <td class="TableData" colspan="2"><input type="text" name="BEFORE_NAME" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.EnglishName" />：</td>
        <td class="TableData"><input type="text" name="STAFF_E_NAME" value="" class="BigInput"></td>
        <td nowrap="" class="TableData"><fmt:message code="userDetails.th.Gender" />：</td>
        <td class="TableData" colspan="2" title="填写完身份证号码后可直接生成">
            <select name="STAFF_SEX" class="BigSelect">
                <option value="0" selected=""><fmt:message code="userInfor.th.male" /></option>
                <option value="1"><fmt:message code="userInfor.th.female" /></option>
            </select>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.IDNumber" />：</td>
        <td class="TableData">
            <input type="text" name="STAFF_CARD_NO" id="STAFF_CARD_NO" class="BigInput" value="" onblur="checkIdcard()">
        </td>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.DateOfBirth" />：</td>
        <td class="TableData" colspan="2" title="<fmt:message code="hr.th.ID" />">
            <input type="text" name="STAFF_BIRTH" id="STAFF_BIRTH" size="10" maxlength="10" class="BigInput" value="1992-05-14" onclick="WdatePicker()" onblur="checkDate()" onchange="get_animal_sign()">
            <input type="checkbox" name="IS_LUNAR" id="IS_LUNAR" value="1" onclick="get_animal_sign()">
            <label for="IS_LUNAR"><fmt:message code="url.th.Lunar" /></label>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.Age" />：</td>
        <td class="TableData" title="填写完身份证号码后可直接生成"><input type="text" name="STAFF_AGE" size="4" class="BigInput" value="25"><fmt:message code="hr.th.year" /></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.annualLeave" />：</td>
        <td class="TableData" colspan="3">
            <input type="text" name="LEAVE_TYPE" size="4" maxlength="4" class="BigInput" value="0.0"> <fmt:message code="hr.th.Days0Days" />       </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.PlaceOfOrigin" />：</td>
        <td class="TableData" colspan="5" nowrap="">
            <select name="STAFF_NATIVE_PLACE" class="BigSelect" title="<fmt:message code="hr.th.OriginIn" />。">
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
            <input type="text" name="STAFF_NATIVE_PLACE2" style="width:326px;height: 24px;" value="">
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="url.th.Zodiac" /></td>
        <td class="TableData" title="生肖">
            <input type="text" value="猴" id="animal_id" class="BigStatic" readonly="">
        </td>
        <td nowrap="" class="TableData"><fmt:message code="url.th.constellation" /></td>
        <td class="TableData" colspan="3" title="星座">
            <input type="text" value="金牛座" id="sign_id" class="BigStatic" readonly="">
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="url.th.BloodType" /></td>
        <td class="TableData">
            <select name="BLOOD_TYPE" class="BigSelect">
                <option value=""></option>
                <option value="A">A</option>
                <option value="B" selected="">B</option>
                <option value="O">O</option>
                <option value="AB">AB</option>
            </select>
        </td>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.Nation" />：</td>
        <td class="TableData" colspan="3"><input type="text" name="STAFF_NATIONALITY" class="BigInput" value=""></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.MaritalStatus" />：</td>
        <td class="TableData" width="180">
            <select name="STAFF_MARITAL_STATUS" class="BigSelect">
                <option value="" selected=""></option>
                <option value="0"><fmt:message code="hr.th.unmarried" /></option>
                <option value="1"><fmt:message code="hr.th.married" /></option>
                <option value="2"><fmt:message code="hr.th.Divorce" /></option>
                <option value="3"><fmt:message code="hr.th.Widowed" /></option>
            </select>
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Health" />：</td>
        <td class="TableData" colspan="3"><input type="text" name="STAFF_HEALTH" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.PoliticalOutlook" />：</td>
        <td class="TableData" width="180">
            <select name="STAFF_POLITICAL_STATUS" class="BigSelect" title="<fmt:message code="hr.th.PoliticalAffiliation" />。">
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
            <input type="text" name="JOIN_PARTY_TIME" size="10" maxlength="10" class="BigInput" value="" onclick="WdatePicker()">
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"><fmt:message code="hr.th.Household" />：</td>
        <td class="TableData">
            <select name="STAFF_TYPE" class="BigSelect" title="<fmt:message code="hr.th.TheType" />。">
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
        <td class="TableData" width="180" colspan="3"><input type="text" name="STAFF_DOMICILE_PLACE" value="" size="40" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.PhotoUpload" />：</td>
        <td class="TableData" width="180" colspan="5">
            <input type="file" name="ATTACHMENT" id="cursor_file" size="40" class="BigInput" title="选择附件文件">&nbsp;<span><fmt:message code="hr.th.PhotoFormats" />!</span>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="hr.th.Position" />：</b></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.TypeWork" />：</td>
        <td class="TableData" width="180"><input type="text" name="WORK_TYPE" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.AdministrativeLevel" />：</td>
        <td class="TableData" width="180"><input type="text" name="ADMINISTRATION_LEVEL" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.EmployeeType" />：</td>
        <td class="TableData">
            <select name="STAFF_OCCUPATION" class="BigSelect" title="<fmt:message code="hr.th.Employees" />。">
                <option value="" selected=""></option>
                <option value="01"><fmt:message code="hr.th.ContractWorker" /></option>
                <option value="02"><fmt:message code="hr.th.RegularEmployee" /></option>
                <option value="03"><fmt:message code="hr.th.TemporaryWorker" /></option>
            </select>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="userDetails.th.post" />：</td>
        <td class="TableData" width="180"><input type="text" name="JOB_POSITION" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Title" />：</td>
        <td class="TableData" width="180">
            <select name="PRESENT_POSITION" class="BigSelect" title="<fmt:message code="hr.th.TheTitle" />。">
                <option value="" selected=""></option>
                <option value="08"><fmt:message code="hr.th.SeniorTitles" /></option>
                <option value="02"><fmt:message code="hr.th.AssistantEngineer" /></option>
                <option value="01"><fmt:message code="hr.th.Engineer" /></option>
                <option value="03"><fmt:message code="hr.th.SeniorEngineer" /></option>
                <option value="04"><fmt:message code="hr.th.Senior" /></option>
                <option value="07"><fmt:message code="hr.th.Title" /></option>
            </select>
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.InductionTime" />：</td>
        <td class="TableData" width="180">
            <input type="text" name="DATES_EMPLOYED" size="10" maxlength="10" class="BigInput" value="" onclick="WdatePicker()" onchange="get_job_age(this.value)">
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.TitleLevel" />：</td>
        <td class="TableData">
            <select name="WORK_LEVEL" class="BigSelect" title="<fmt:message code="hr.th.Thetitlelevel" />。">
                <option value="" selected=""></option>
                <option value="01"><fmt:message code="hr.th.primary" /></option>
                <option value="02"><fmt:message code="hr.th.intermediate" /></option>
                <option value="03"><fmt:message code="hr.th.deputySeniorRanks" /></option>
                <option value="04"><fmt:message code="hr.th.IsHigh" /></option>
            </select>
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.position" />：</td>
        <td nowrap="" class="TableData">
            <select name="WORK_JOB" class="BigSelect">
                <option value=""></option>
                <option value="1"><fmt:message code="hr.th.Technology" /></option>
                <option value="2"><fmt:message code="hr.th.TechnicalSupport" /></option>
                <option value="3"><fmt:message code="hr.th.Sale" /></option>
            </select>
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.AttendanceSchedulingType" />：</td>
        <td nowrap="" class="TableData">
            <select name="DUTY_TYPE" class="BigSelect">
                <option value="1" selected=""><fmt:message code="hr.th.RegularClass" /></option>
                <option value="2"><fmt:message code="hr.th.WholeDay" /></option>
                <option value="99"><fmt:message code="hr.th.ShiftSystem" /></option>
            </select>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.LengthUnit" />：</td>
        <td class="TableData" width="180"><input type="text" name="JOB_AGE" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.StartingSalary" />：</td>
        <td class="TableData" width="180">
            <input type="text" name="BEGIN_SALSRY_TIME" size="10" maxlength="10" class="BigInput" value="" onclick="WdatePicker()">
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Incumbency" />：</td>
        <td class="TableData" width="180">
            <select name="WORK_STATUS" class="BigSelect" title="<fmt:message code="hr.th.InTheState" />。">
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
        <td class="TableData" width="180"><input type="text" name="WORK_AGE" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.WorkingHours" />：</td>
        <td class="TableData" width="180">
            <input type="text" name="JOB_BEGINNING" size="10" maxlength="10" class="BigInput" value="" onclick="WdatePicker()" onchange="get_work_age(this.value)">
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ContactNumber" />：</td>
        <td class="TableData" width="180"><input type="text" name="STAFF_PHONE" class="BigInput" value=""></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.PhoneNumber" />：</td>
        <td class="TableData" width="180"><input type="text" name="STAFF_MOBILE" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100">MSN：</td>
        <td class="TableData" width="180" colspan="3"><input type="text" name="STAFF_MSN" class="BigInput" value=""></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="main.email" />：</td>
        <td class="TableData" width="180"><input type="text" name="STAFF_EMAIL" class="BigInput validate[required,custom[email]]" data-prompt-position="centerRight:5,-4" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.HomeAddress" />：</td>
        <td class="TableData" width="180" colspan="3"><input type="text" name="HOME_ADDRESS" size="50" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100">QQ：</td>
        <td class="TableData" width="180"><input type="text" name="STAFF_QQ" class="BigInput validate[custom[number],maxSize[11],minSize[5]]" data-prompt-position="centerRight:5,-4" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.OtherInformation" />：</td>
        <td class="TableData" width="180" colspan="3"><input type="text" name="OTHER_CONTACT" size="50" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"> <fmt:message code="hr.th.IsExpert" />：</td>
        <td class="TableData">
            <input type="radio" name="batch" value="1"><label for="1" style="margin-right: 10px;"><fmt:message code="global.lang.yes" /></label>
            <input type="radio" name="batch" value="0" checked=""><label for="0"><fmt:message code="global.lang.no" />        </label></td>
        <td nowrap="" class="TableData"> <fmt:message code="hr.th.researchField" />：</td>
        <td class="TableData" width="180" colspan="3">
            <textarea rows="3" cols="30" name="EXPERTS_INFO" id="EXPERTS_INFO"></textarea>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"> <fmt:message code="hr.th.SocialAppointments" />：</td>
        <td class="TableData">
            <textarea rows="3" cols="30" name="PART_TIME" id="PART_TIME"></textarea>
        </td>
        <td nowrap="" class="TableData"> <fmt:message code="hr.th.AchievementIntroduction" />：</td>
        <td class="TableData" width="180" colspan="3">
            <textarea rows="3" cols="30" name="RESEARCH_RESULTS" id="RESEARCH_RESULTS"></textarea>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData"> <fmt:message code="hr.th.ImmediateSuperior" />：</td>
        <td nowrap="" class="TableData">
            <input type="hidden" name="COPY_TO_ID1" value="">
            <textarea cols="21" name="COPY_TO_NAME1" rows="2" class="BigStatic" wrap="yes" readonly=""></textarea>
            <a href="javascript:;" class="orgAdd" onclick="SelectUser('60','','COPY_TO_ID1', 'COPY_TO_NAME1')"><fmt:message code="global.lang.select" /></a>
            <a href="javascript:;" class="orgClear" onclick="ClearUser('COPY_TO_ID1', 'COPY_TO_NAME1')"><fmt:message code="global.lang.empty" /></a>
        </td>
        <td nowrap="" class="TableData"> <fmt:message code="hr.th.SubordinateSubordinate" />：</td>
        <td nowrap="" class="TableData" width="180" colspan="3">
            <input type="hidden" name="COPY_TO_ID" value="">
            <textarea cols="21" name="COPY_TO_NAME" rows="2" class="BigStatic" wrap="yes" readonly=""></textarea>
            <a href="javascript:;" class="orgAdd" onclick="SelectUser('60','','COPY_TO_ID', 'COPY_TO_NAME')"><fmt:message code="global.lang.select" /></a>
            <a href="javascript:;" class="orgClear" onclick="ClearUser('COPY_TO_ID', 'COPY_TO_NAME')"><fmt:message code="global.lang.empty" /></a>
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.OpeningBank" />1：</td>
        <td class="TableData" width="180"><input type="text" name="BANK1" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.account" />1：</td>
        <td class="TableData" width="180" colspan="3"><input type="text" name="BANK_ACCOUNT1" size="50" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.OpeningBank" />2：</td>
        <td class="TableData" width="180"><input type="text" name="BANK2" class="BigInput" value=""></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.account" />2：</td>
        <td class="TableData" width="180" colspan="3"><input type="text" name="BANK_ACCOUNT2" size="50" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="hr.th.educationalBackground" />：</b></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Education" />：</td>
        <td class="TableData" width="180">
            <select name="STAFF_HIGHEST_SCHOOL" class="BigSelect" title="<fmt:message code="hr.th.TheEducation" />。">
                <option value="" selected=""></option>
                <option value="1">小学</option>
                <option value="2">初中</option>
                <option value="3">高中</option>
                <option value="4">中专</option>
                <option value="5">大专</option>
                <option value="6">本科</option>
                <option value="7">研究生</option>
                <option value="8">博士</option>
                <option value="9">博士后</option>
                <option value="11">技校</option>
            </select>
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.AcademicDegree" />：</td>
        <td class="TableData" width="180">
            <select name="STAFF_HIGHEST_DEGREE" class="BigSelect" title="<fmt:message code="hr.th.Adegree" />。">
                <option value="" selected=""></option>
                <option value="1">博士后</option>
                <option value="2">博士</option>
                <option value="3">MBA</option>
                <option value="4">硕士</option>
                <option value="5">双学士</option>
                <option value="6">学士</option>
                <option value="7">无</option>
            </select>
        </td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.GraduationTime" />：</td>
        <td class="TableData" width="180">
            <input type="text" name="GRADUATION_DATE" size="10" maxlength="10" class="BigInput" value="" onclick="WdatePicker()">
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.GraduationSchool" />：</td>
        <td class="TableData" width="180"><input type="text" name="GRADUATION_SCHOOL" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.major" />：</td>
        <td class="TableData" width="180"><input type="text" name="STAFF_MAJOR" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ComputerLevel" />：</td>
        <td class="TableData" width="180"><input type="text" name="COMPUTER_LEVEL" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />1：</td>
        <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE1" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />2：</td>
        <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE2" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguage" />3：</td>
        <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE3" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />1：</td>
        <td class="TableData" width="180"><input type="text" name="FOREIGN_LEVEL1" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />2：</td>
        <td class="TableData" width="180"><input type="text" name="FOREIGN_LEVEL2" value="" class="BigInput"></td>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.ForeignLanguageProficiency" />3：</td>
        <td class="TableData" width="180"><input type="text" name="FOREIGN_LEVEL3" value="" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.Specialty" />：</td>
        <td class="TableData" width="180" colspan="5"><input type="text" name="STAFF_SKILLS" value="" size="80" class="BigInput"></td>
    </tr>
    <tr>
        <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="hr.th.JobStatus" />：</b></td>
        <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="HR.TH.WarrantyRecord" />：</b></td>
    </tr>
    <tr>
        <td class="TableData" colspan="3"><textarea cols="45" name="CERTIFICATE" rows="3" class="BigInput" wrap="on"></textarea></td>
        <td class="TableData" colspan="3"><textarea cols="45" name="SURETY" rows="3" class="BigInput" wrap="on"></textarea></td>
    </tr>
    <tr>
        <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="HR.TH.SocialPayment" />：</b></td>
        <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;<fmt:message code="HR.TH.PhysicalRecord" />：</b></td>
    </tr>
    <tr>
        <td class="TableData" colspan="3"><textarea cols="45" name="INSURE" rows="3" class="BigInput" wrap="on"></textarea></td>
        <td class="TableData" colspan="3"><textarea cols="45" name="BODY_EXAMIM" rows="3" class="BigInput" wrap="on"></textarea></td>
    </tr>
    <tr>
        <td colspan="6">
        </td>
    </tr>
    <tr>
        <td nowrap="" align="left" colspan="6" class="TableHeader"><fmt:message code="journal.th.Remarks" />：</td>
    </tr>
    <tr>
        <td nowrap="" class="TableData" colspan="6"><textarea name="REMARK" cols="95" rows="3" class="BigInput" value=""></textarea></td>
    </tr>
    <tr>
        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="depatement.th.Attachmentdocument" />：</b></td>
    </tr>
    <tr>
        <td class="TableData" colspan="6"></td>
    </tr>
    <tr height="25">
        <td nowrap="" class="TableData"><fmt:message code="email.th.filechose" />：</td>
        <td class="TableData" colspan="6">
            <%--<script>ShowAddFile('1');</script>--%>
            <span id="ATTACHMENT1_div"></span><span id="ATTACHMENT1_upload_div" style="display:none;"></span><div id="SelFileDiv1"></div><a class="addfile" href="javascript:;"><fmt:message code="email.th.addfile" /><input class="addfile" type="file" name="ATTACHMENT1_0" id="ATTACHMENT1_0" size="1" hidefocus="true" onchange="AddFile();"></a><a href="javascript:void(0);" onclick="sel_attach('SelFileDiv1','ATTACH_DIR1','ATTACH_NAME1','DISK_ID1');" class="selfile"><fmt:message code="notice.th.net" /></a><input type="hidden" value="" name="ATTACH_NAME1"><input type="hidden" value="" name="ATTACH_DIR1"><input type="hidden" value="" name="DISK_ID1">
        </td>
    </tr>
    <tr>
        <td nowrap="" class="TableHeader" colspan="6"><fmt:message code="HR.TH.resume" />：</td>
    </tr>
    <tr>
        <td class="TableData" colspan="6">
            <div id="TD_HTML_EDITOR_RESUME" class="edui-default" style=""><div id="edui1" class="edui-editor  edui-default" style="width: 100%; z-index: 1; box-sizing: border-box;"><div id="edui1_toolbarbox" class="edui-editor-toolbarbox edui-default"><div id="edui1_toolbarboxouter" class="edui-editor-toolbarboxouter edui-default"><div class="edui-editor-toolbarboxinner edui-default"><div id="edui2" class="edui-toolbar   edui-default" onselectstart="return false;" onmousedown="return $EDITORUI[&quot;edui2&quot;]._onMouseDown(event, this);" style="user-select: none;"><div id="edui98" class="edui-box edui-button edui-for-fullscreen edui-default"><div id="edui98_state" onmousedown="$EDITORUI[&quot;edui98&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui98&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui98&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui98&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui98_body" unselectable="on" title="全屏" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui98&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui98&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui3" class="edui-box edui-button edui-for-bold edui-default"><div id="edui3_state" onmousedown="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui3&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui3_body" unselectable="on" title="加粗" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui3&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui3&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui4" class="edui-box edui-button edui-for-italic edui-default"><div id="edui4_state" onmousedown="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui4&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui4_body" unselectable="on" title="斜体" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui4&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui4&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui5" class="edui-box edui-button edui-for-underline edui-default"><div id="edui5_state" onmousedown="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui5&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui5_body" unselectable="on" title="下划线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui5&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui5&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui6" class="edui-box edui-button edui-for-strikethrough edui-default"><div id="edui6_state" onmousedown="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui6&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui6_body" unselectable="on" title="删除线" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui6&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui6&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui7" class="edui-box edui-button edui-for-removeformat edui-default"><div id="edui7_state" onmousedown="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui7&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui7_body" unselectable="on" title="清除格式" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui7&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui7&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui8" class="edui-box edui-splitbutton edui-for-forecolor edui-default edui-colorbutton"><div title="字体颜色" id="edui8_state" onmousedown="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui8&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui8_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui8_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui8&quot;]._onArrowClick();"></div></div></div></div><div id="edui11" class="edui-box edui-splitbutton edui-for-backcolor edui-default edui-colorbutton"><div title="背景色" id="edui11_state" onmousedown="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui11&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui11_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div id="edui11_colorlump" class="edui-colorlump"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui11&quot;]._onArrowClick();"></div></div></div></div><div id="edui14" class="edui-box edui-splitbutton edui-for-autotypeset edui-default"><div title="自动排版" id="edui14_state" onmousedown="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui14&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui14_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui14&quot;]._onArrowClick();"></div></div></div></div><div id="edui17" class="edui-box edui-combox edui-for-paragraph edui-default"><div title="段落格式" id="edui17_state" onmousedown="$EDITORUI[&quot;edui17&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui17&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui17&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui17&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui17_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui17&quot;]._onButtonClick(event, this);">段落格式</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui17&quot;]._onArrowClick();"></div></div></div></div><div id="edui26" class="edui-box edui-combox edui-for-fontfamily edui-default"><div title="字体" id="edui26_state" onmousedown="$EDITORUI[&quot;edui26&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui26&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui26&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui26&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui26_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui26&quot;]._onButtonClick(event, this);">字体</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui26&quot;]._onArrowClick();"></div></div></div></div><div id="edui39" class="edui-box edui-combox edui-for-fontsize edui-default"><div title="字号" id="edui39_state" onmousedown="$EDITORUI[&quot;edui39&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui39&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui39&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui39&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-combox-body edui-default"><div id="edui39_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui39&quot;]._onButtonClick(event, this);">字号</div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui39&quot;]._onArrowClick();"></div></div></div></div><div id="edui50" class="edui-box edui-menubutton edui-for-lineheight edui-default"><div title="行间距" id="edui50_state" onmousedown="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui50&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui50_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui50&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui50&quot;]._onArrowClick();"></div></div></div></div><div id="edui59" class="edui-box edui-menubutton edui-for-insertorderedlist edui-default"><div title="有序列表" id="edui59_state" onmousedown="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui59&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui59_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui59&quot;]._onArrowClick();"></div></div></div></div><div id="edui62" class="edui-box edui-menubutton edui-for-insertunorderedlist edui-default"><div title="无序列表" id="edui62_state" onmousedown="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui62&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-menubutton-body edui-default"><div id="edui62_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui62&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui62&quot;]._onArrowClick();"></div></div></div></div><div id="edui65" class="edui-box edui-separator  edui-default"></div><div id="edui66" class="edui-box edui-button edui-for-justifyleft edui-default"><div id="edui66_state" onmousedown="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui66&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui66_body" unselectable="on" title="居左对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui66&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui66&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui67" class="edui-box edui-button edui-for-justifycenter edui-default"><div id="edui67_state" onmousedown="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui67&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui67_body" unselectable="on" title="居中对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui67&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui67&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui68" class="edui-box edui-button edui-for-justifyright edui-default"><div id="edui68_state" onmousedown="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui68&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui68_body" unselectable="on" title="居右对齐" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui68&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui68&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui75" class="edui-box edui-button edui-for-link edui-default"><div id="edui75_state" onmousedown="$EDITORUI[&quot;edui75&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui75&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui75&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui75&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui75_body" unselectable="on" title="超链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui75&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui75&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui76" class="edui-box edui-button edui-for-unlink edui-default"><div id="edui76_state" onmousedown="$EDITORUI[&quot;edui76&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui76&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui76&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui76&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui76_body" unselectable="on" title="取消链接" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui76&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui76&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui77" class="edui-box edui-button edui-for-undo edui-default"><div id="edui77_state" onmousedown="$EDITORUI[&quot;edui77&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui77&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui77&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui77&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui77_body" unselectable="on" title="撤销" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui77&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui77&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui78" class="edui-box edui-button edui-for-redo edui-default"><div id="edui78_state" onmousedown="$EDITORUI[&quot;edui78&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui78&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui78&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui78&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui78_body" unselectable="on" title="重做" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui78&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui78&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div><div id="edui83" class="edui-box edui-button edui-for-insertimage edui-default"><div id="edui83_state" onmousedown="$EDITORUI[&quot;edui83&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui83&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui83&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui83&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui83_body" unselectable="on" title="多图上传" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui83&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui83&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui84" class="edui-box edui-splitbutton edui-for-inserttable edui-default"><div title="插入表格" id="edui84_state" onmousedown="$EDITORUI[&quot;edui84&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui84&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui84&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui84&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui84_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui84&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui84&quot;]._onArrowClick();"></div></div></div></div><div id="edui87" class="edui-box edui-splitbutton edui-for-emotion edui-default"><div title="表情" id="edui87_state" onmousedown="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui87&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-splitbutton-body edui-default"><div id="edui87_button_body" class="edui-box edui-button-body edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onButtonClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div><div class="edui-box edui-splitborder edui-default"></div><div class="edui-box edui-arrow edui-default" onclick="$EDITORUI[&quot;edui87&quot;]._onArrowClick();"></div></div></div></div><div id="edui91" class="edui-box edui-button edui-for-preview edui-default"><div id="edui91_state" onmousedown="$EDITORUI[&quot;edui91&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui91&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui91&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui91&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui91_body" unselectable="on" title="预览" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui91&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui91&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui96" class="edui-box edui-button edui-for-template edui-default"><div id="edui96_state" onmousedown="$EDITORUI[&quot;edui96&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui96&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui96&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui96&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui96_body" unselectable="on" title="模板" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui96&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui96&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div><div class="edui-box edui-label edui-default"></div></div></div></div></div><div id="edui97" class="edui-box edui-button edui-for-source edui-default"><div id="edui97_state" onmousedown="$EDITORUI[&quot;edui97&quot;].Stateful_onMouseDown(event, this);" onmouseup="$EDITORUI[&quot;edui97&quot;].Stateful_onMouseUp(event, this);" onmouseover="$EDITORUI[&quot;edui97&quot;].Stateful_onMouseOver(event, this);" onmouseout="$EDITORUI[&quot;edui97&quot;].Stateful_onMouseOut(event, this);" class="edui-default"><div class="edui-button-wrap edui-default"><div id="edui97_body" unselectable="on" title="源代码" class="edui-button-body edui-default" onmousedown="return $EDITORUI[&quot;edui97&quot;]._onMouseDown(event, this);" onclick="return $EDITORUI[&quot;edui97&quot;]._onClick(event, this);"><div class="edui-box edui-icon edui-default"></div></div></div></div></div></div></div></div><div id="edui1_toolbarmsg" class="edui-editor-toolbarmsg edui-default" style="display:none;"><div id="edui1_upload_dialog" class="edui-editor-toolbarmsg-upload edui-default" onclick="$EDITORUI[&quot;edui1&quot;].showWordImageDialog();">点击上传</div><div class="edui-editor-toolbarmsg-close edui-default" onclick="$EDITORUI[&quot;edui1&quot;].hideToolbarMsg();">x</div><div id="edui1_toolbarmsg_label" class="edui-editor-toolbarmsg-label edui-default"></div><div style="height:0;overflow:hidden;clear:both;" class="edui-default"></div></div><div id="edui1_message_holder" class="edui-editor-messageholder edui-default" style="top: 34px; z-index: 2;"></div></div><div id="edui1_iframeholder" class="edui-editor-iframeholder edui-default" style="width: 100%; height: 450px; z-index: 1; overflow: hidden;"><iframe id="ueditor_0" width="100%" height="100%" frameborder="0" src="javascript:void(function(){document.open();document.write(&quot;<!DOCTYPE html><html xmlns='http://www.w3.org/1999/xhtml' class='view' ><head><style type='text/css'>.view{padding:0;word-wrap:break-word;cursor:text;height:90%;}
body{margin:8px;font-family:sans-serif;font-size:16px;}p{margin:5px 0;}</style><link rel='stylesheet' type='text/css' href='/module/ueditor/themes/iframe.css'/></head><body class='view' ></body><script type='text/javascript'  id='_initialScript'>setTimeout(function(){editor = window.parent.UE.instants['ueditorInstant0'];editor._setup(document);},0);var _tmpScript = document.getElementById('_initialScript');_tmpScript.parentNode.removeChild(_tmpScript);</script></html>&quot;);document.close();}())"></iframe></div><div id="edui1_bottombar" class="edui-editor-bottomContainer edui-default"><table class="edui-default"><tbody class="edui-default"><tr class="edui-default"><td id="edui1_elementpath" class="edui-editor-bottombar edui-default" style="display: none;"></td><td id="edui1_wordcount" class="edui-editor-wordcount edui-default" style="display: none;"></td><td id="edui1_scale" class="edui-editor-scale edui-default" style="display: none;"><div class="edui-editor-icon edui-default"></div></td></tr></tbody></table></div><div id="edui1_scalelayer" class="edui-default"></div></div></div><textarea name="TD_HTML_EDITOR_RESUME" rows="8" cols="60" style="display: none;"></textarea>
            <script type="text/javascript">//<![CDATA[
            window.UEDITOR_CONFIG={"UEDITOR_HOME_URL":"\/module\/ueditor\/"};
            //]]></script>
            <script type="text/javascript">//<![CDATA[
            window.HTML_MODEL_TYPE='14';
            //]]></script>
            <script type="text/javascript" src="/module/ueditor/ueditor.config.min.js?t=D5AC"></script>
            <script type="text/javascript" src="/module/ueditor/ueditor.all.min.js?t=D5AC"></script>
            <script type="text/javascript">//<![CDATA[
//            UE.dom.domUtils.on(window, 'load', function(){var ue = UE.getEditor('TD_HTML_EDITOR_RESUME', {"EditorAreaStyles":"body{font-size:20pt;}","model_type":"14","initialFrameWidth":"100%","initialFrameHeight":"450","attachmentId":"ATTACHMENT_ID_OLD","attachmentName":"ATTACHMENT_NAME_OLD","lang":"zh-cn"});ue.ready(function(){typeof(editorLoaded) == 'function' && editorLoaded({editor:ue});ue.dirty = false;ue.on('contentChange',function(){ue.dirty = true;});});});
            //]]></script>
        </td>
    </tr>
    <tr align="center" class="TableControl">
        <td colspan="6" nowrap="">
            <input type="button" value="<fmt:message code="global.lang.save" />" class="BigButton" onclick="CheckForm();">&nbsp;
            <input type="button" value="<fmt:message code="hr.th.Quit" />" class="BigButton" onclick="location='../staff_leave/new.php?USER_ID=admin';">
        </td>
    </tr>
    </tbody></table>
<div class="childQuery">

</div>



<script>

    function ajaxdata(deptNumId,me) {//部门
        $('.childQuery').show().siblings().hide();
        $('#ULDown li').find('span').removeClass('on');
        $(this).addClass('on');
        $('.loopData').remove();
        var data={
            'choice':1,
            'deptId':deptNumId
        }
        $.ajax({
            type:'get',
            url:'../../getUserbyCondition',
            dataType:'json',
            data:data,
            success:function(res){
                var data1=res.obj;
                var str='';
                for(var i=0;i<data1.length;i++){
                    var txt=data1[i].sex==0?'男':'女';
                    if(data1[i].RoleAuxiliaryName){
                        str+='<tr class="loopData" uid="'+data1[i].uid+'"><td>'+data1[i].dep.deptName+'</td><td><a href="javascript:;" class="userDetail">'+data1[i].userName+'</a></td><td>'+data1[i].userPrivName+'</td><td>'+data1[i].RoleAuxiliaryName+'</td><td>'+data1[i].online+'</td><td>'+txt+'</td><td>'+data1[i].telNoDept+'</td><td>'+data1[i].dep.telNo+'</td><td>'+data1[i].mobilNo+'</td><td>'+data1[i].email+'</td></tr>'
                    }else{
                        str+='<tr class="loopData" uid="'+data1[i].uid+'"><td>'+data1[i].dep.deptName+'</td><td><a href="javascript:;" class="userDetail">'+data1[i].userName+'</a></td><td>'+data1[i].userPrivName+'</td><td></td><td>'+data1[i].online+'</td><td>'+txt+'</td><td>'+data1[i].telNoDept+'</td><td>'+data1[i].dep.telNo+'</td><td>'+data1[i].mobilNo+'</td><td>'+data1[i].email+'</td></tr>'
                    }

                }
                $('.allCondition').after(str);
            }
        })
    }
    $(function(){
       $('#department').deptSelect();
     $('#selectUser').privSelect();
        $.loadSidebar($('#downChild'),0,function (el) {
//            $.loadSidebar(el,30)
        })
    })
</script>
</body>
</html>

