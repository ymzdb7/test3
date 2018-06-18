<%--需把局部样式归并为一个通用或符合公告管理的公共样式，
接口对完需调整--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">

    <title>合同管理</title>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>--%>
    <!-- word文本编辑器 -->
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
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

        input[type="radio"]{
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
            margin-left: 40%;
        }
        .TableData{
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        .TableBlock tbody tr{
            height: 52px;
        }
        .TableBlock tbody tr td{
            border: 1px solid #c0c0c0;
        }

        .TableBlock tr td:first-of-type{
            /*  text-align: right;*/
            word-wrap:break-word;
            width: 13%;
        }
        table tr td:nth-child(3){
            word-wrap:break-word;
            width: 13%;
        }



        #cont_total td {
            color: #000;
            font-weight: normal;
        }

        .notice_do {
            width: 168px;
        }

        input {
            width: auto;
        }

        select {
            width: auto;
        }

        table {
            table-layout: fixed;
        }

        #tr_td tr td.publishtip {
            overflow: hidden;
            text-overflow: ellipsis;
            height: 40px;
            width: 40px;
            white-space: nowrap;
        }



        .news_t h1, .news_two h1 {
            line-height: 23px;
            text-align: center;
        }



        .add_print h1, .add_down h1 {
            color: #000;
            line-height: 20px;
            text-align: center;
        }

        .add_show, .textTop {
            float: left;
        }


        .title a {
            color: #59b7fb;
        }





        .caozuo a:hover {
            color: #287fe0;
        }

        .notice_geshi {
            display: block;
            margin-top: -46px;
            margin-left: 79px;
        }


        /*修改的字体*/
        .notice_change {
            color: #1772c0;
            margin-left: 5px;
        }

        .notice_change:hover {
            color: #287fe0 !important;
        }

        /*删除的字体*/
        .notice_delete {
            color: #e01919;
            margin-left: 5px;
        }

        .notice_delete:hover {
            color: #C81623 !important;
        }

        .notice_zhongzhi {
            color: #1772c0;
            margin-left: 5px;
        }

        .center .login .icons div {
            margin-left: 9px !important;
        }

        .icons div {
            display: inline-block;
            float: left;
            height: 30px;
            line-height: 30px;
            width: 56px;
            text-align: center;
            margin-right: 15px;
            /*        background: url(../../img/gobbing.png) no-repeat;*/
            cursor: pointer;
            padding-left: 20px;
        }

        .icons h2 {
            text-align: center;
            width: 71%;
        }

        table tr td input[type="radio"] {
            height: 25px;
            border: #ccc 1px solid;
            padding-left: 5px;
        }

        input[type="submit"] {
            height: 28px;
            line-height: 22px;
            border: 1px solid #c0c0c0;
        }

        /*.last_str{
            cursor: pointer;
        }*/
        .bgcolor {
            background: #c5e9fb !important;
            color: #000000;
        }




        .orgAdd {
            color: rgb(32, 123, 214);
            padding-left: 12px;
            background: url(../../img/org_select.png) 0px 0px no-repeat;
            background-position: 0px 0px;
            cursor: pointer;
        }

        .orgClear {
            color: rgb(154, 169, 184);
            padding-left: 12px;
            margin-left: 5px;
            background: url(../../img/org_select.png) 0px -60px no-repeat;
            background-position: 0px -60px;
            cursor: pointer;
        }

        .navigation {
            display: inline-block;
            float: left;
            width: 96% !important;
            margin-left: 2%;
        }



        .th {
            cursor: pointer;
        }

        .con_edit {
            width: 90%;
            /*border: 1px solid #000;*/
            margin: 10px auto;
        }

        .delete_check {
            text-align: center;
            cursor: pointer;
        }
        .deleteok{
            background: url(../../img/btn_deleteannounce.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 150px;
            height: 28px;
            line-height: 25px;
            padding-left: 20px;
        }
        .delete_ok1{
            margin-top: 30px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div>
    <div class="bx">


        <!--表单选项显示-->
        <div class="step1" style="margin-left:1.5%">
            <div class="navigation  clearfix">
                <div class="left" style="margin-left: -22px;">
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/contractManage.png">
                    <div class="news">
                        <fmt:message code="hr.th.contractManagement" />
                    </div>
                </div>

                <!-- 分页按钮-->
                <div class="right">
                    <div class="M-box3"></div>
                </div>
            </div>

            <!--table表单  标题栏 -->
            <div>
                <div>
                    <table id="tr_td">
                        <thead>
                        <tr>
                            <%--<td class="th"><fmt:message code="notice.th.chose"/></td>--%>
                            <td class="th" style="width:6%;"><fmt:message code="global.lang.select" /></td>
                            <td class="th" style="width:8%;" ><fmt:message code="userDetails.th.name" /></td>
                            <td class="th" style="width:8%;"><fmt:message code="hr.th.department" /></td>
                            <td class="th" style="width:8%;"><fmt:message code="hr.th.post" /></td>
                            <td class="th" style="width:8%;"><fmt:message code="hr.th.typeContract" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.SignCompany" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.ContractCommencementDate" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.TrialExpirationDate" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.ContractMaturityDate" /></td>
                            <td class="th notice_do" style="width:12%;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
                        </tr>
                        </thead>
                        <tbody id="j_tb"></tbody>
                    </table>
                </div>
            </div>
        </div>


        <!-- ************************************ -->
        <%--编辑页面--%>
        <div class="bodycolor con_edit" style="display:none;" topmargin="5">
            <table border="0" width="100%" cellspacing="0" cellpadding="0" class="small">
                <tr>
                    <td>
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle"><span class="big3"> <fmt:message code="hr.th.ModifyContractInformation" /></span>&nbsp;&nbsp;
                    </td>
                </tr>
                <tr>
                    <td><fmt:message code="hr.th.Note" />。</td>
                </tr>
            </table>
            <br>
            <form enctype="multipart/form-data" action=""  method="post" name="form1" onSubmit="return CheckForm();">
                <table class="TableBlock" width="80%" cellspacing="0" cellpadding="0" border="0" align="center">
                    <tr>
                        <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.Employee" />：</td>
                        <td class="TableData">
                            <input type="text" id="staffNameInput" name="staffName1" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value="">&nbsp;
                            <a href="javascript:;" id="" class="userAdd" ><fmt:message code="notice.th.chose" /></a>
                        </td>
                        <td nowrap class="TableData"><fmt:message code="hr.th.ContractNumber" />：</td>
                        <td class="TableData" >
                            <INPUT type="text"  name="staffContractNo" style="width: 158px;height:28px;" class=BigInput size="11" value="" onBlur="check_no(this.value)" />
                        </td>
                    </tr>

                    <tr>
                        <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.ContractSigningCompany" />：</td>
                        <td class="TableData">
                            <select name="contractEnterpries" style="background: white; width:170px;height: 28px;" title="<fmt:message code="menuSSetting.th.menuSetting" />。">

                            </select>
                        </td>
                        <td nowrap class="TableData"><span style="color: red;">*</span><fmt:message code="hr.th.typeContract" />：</td>
                        <td class="TableData">
                            <select name="contractType" style="background: white;width: 170px;height:28px;" id="CONTRACT_TYPE" onChange="TYPE_CHANGE()" title="<fmt:message code="hr.th.TheTypeO" />。">

                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td nowrap class="TableData"><fmt:message code="hr.th.ContractualTermAttributes" />：</td>
                        <td class="TableData">
                            <select name="contractSpecialization" style="width: 170px;height:28px;" id="CONTRACT_SPECIALIZATION" <%--onChange="TIME_LIMIT()"--%>>
                                <option value="1"><fmt:message code="hr.th.FixedTerm" /></option>
                                <option value="2"><fmt:message code="hr.th.UnfixedTerm" /></option>
                                <option value="3"><fmt:message code="hr.th.ForDuration" /></option>
                            </select>
                        </td>
                        <td nowrap class="TableData"><fmt:message code="userManagement.th.role" />：</td>
                        <td nowrap class="TableData">
                            <select name="userPriv" style="background: white; width: 170px;height:28px;"title="<fmt:message code="hr.th.InTheRoleOf" />。">

                            </select>
                            <span style="font-size: 12px;color: #666666;"><fmt:message code="hr.th.doNotSelect" /></span>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap class="TableData"><fmt:message code="hr.th.ContractDate" />：</td>
                        <td class="TableData">
                            <input type="text" id="makeContract" style="width: 158px;height:28px;" name="makeContract" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
                        </td>

                        <td nowrap class="TableData"><span><span style="color: red;">*</span><fmt:message code="hr.th.ContractCommencementDate" />：</span></td>
                        <td class="TableData">
      	<span >
         <input type="text" id="probationEffectiveDate" style="width: 158px;height:28px;" name="probationEffectiveDate" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
        </span>
                        </td>
                    </tr>

                    <tr id="contractEndTime">
                        <td nowrap class="TableData" ><span ><fmt:message code="hr.th.ContractTerminationDate" />：</span> </td>
                        <td class="TableData">
            <span>
             <input type="text" name="contractEndTime" style=" width:158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
            </span>
                        </td>
                        <td nowrap class="TableData"></td>
                        <td nowrap class="TableData"></td>
                    </tr>
                    <tr id="shiyong">
                        <td nowrap class="TableData"><fmt:message code="hr.th.Does" />：</td>
                        <td class="TableData">
                            <INPUT type="radio" name="TRAIL_PASS_OR_NOT" value="1" onClick="expandIt1()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                            <INPUT type="radio" name="TRAIL_PASS_OR_NOT" value="0" onClick="expandIt1()" checked>  <fmt:message code="global.lang.no" />       </td>
                        <td nowrap class="TableData"><span id="id_msg1" style="display:none"><fmt:message code="system.th.UseDeadline" />：</span></td>
                        <td class="TableData">
              <span id="id_msg11" style="display:none">
                <input type="text" name="trailOverTime" style="width:158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
              </span>
                        </td>
                    </tr>

                    <tr  style="display: none" id="hetongzhuanzheng">
                        <td nowrap class="TableData" ><fmt:message code="hr.th.AreEmployeesActive" />：</td>
                        <td class="TableData" >
                            <INPUT type="radio" name="PASS_OR_NOT" value="1" > <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                            <INPUT type="radio" name="PASS_OR_NOT" value="0" checked> <fmt:message code="global.lang.no" />			</td>
                        </td>
                        <td nowrap class="TableData">
                        </td>
                        <td nowrap class="TableData">
                        </td>
                    </tr>

                    <tr id="hetongjiechu">
                        <td nowrap class="TableData" id="shifoujiechu"><fmt:message code="hr.th.HasDischarged" />：</td>
                        <td class="TableData">
                            <INPUT type="radio" name="REMOVE_OR_NOT" value="1" onClick="expandIt2()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                            <INPUT type="radio" name="REMOVE_OR_NOT" value="0" onClick="expandIt2()" checked> 	<fmt:message code="global.lang.no" />		</td>

                        <td nowrap class="TableData"><span id="id_msg2" style="display:none"><fmt:message code="hr.th.DateContract" />：</span></td>
                        <td class="TableData">
      <span id="id_msg21" style="display:none">
       <input type="text" name="contractRemoveTime" style="width: 158px;height: 28px;" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
      </span>
                        </td>
                    </tr>

                    <tr id="hetongxuqian">
                        <td nowrap class="TableData"><fmt:message code="hr.th.IsRenewed" />：</td>
                        <td class="TableData">
                            <INPUT type="radio" name="RENEW_OR_NOT" value="1" onClick="expandIt3()"> <fmt:message code="global.lang.yes" />&nbsp;&nbsp;
                            <INPUT type="radio" name="RENEW_OR_NOT" value="0" onClick="expandIt3()" checked> <fmt:message code="global.lang.no" />			</td>
                        <td nowrap class="TableData"><span id="id_msg3" style="display:none"><fmt:message code="hr.th.RenewalDate" />：</span></td>
                        <td class="TableData">
      <span id="id_msg31" style="display:none">
       <input type="text" name="renewTime" size="12" style="width: 158px;height: 28px;" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
      </span>
                        </td>
                    </tr>
                    <%-- <tr>
                         <td nowrap class="TableData"> 提醒方式：</td>
                         <td class="TableData" colspan=3>
                         </td>
                     </tr>--%>
                    <tr>
                        <td nowrap class="TableData"><fmt:message code="hr.th.Reminder" />：</td>
                        <td class="TableData" colspan=3>
                            <input type="hidden" name="TO_ID" id="TO_ID">
                            <textarea name="remindUser" id="remindUser" cols="75" rows="3"  class="SmallStatic" wrap="yes" readonly></textarea>
                            <a href="#" class="orgAdd" title="<fmt:message code="doc.th.AddReminders" />"><fmt:message code="global.lang.add" /></a>
                            <a href="#" class="orgClear"  title="<fmt:message code="doc.th.EmptyReminder" />"><fmt:message code="global.lang.empty" /></a>
                            <%-- <span style="margin-left: 10px; color: #999999;">（合同到期时除提醒以上人员外，还将提醒本人和人力资源管理员）</span>--%>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap class="TableData"><fmt:message code="journal.th.Remarks" />：</td>
                        <td class="TableData" colspan=3>
                            <textarea name="remark" cols="75" rows="3" class="BigInput" value=""></textarea>
                        </td>
                    </tr>
                    <%-- <tr class="TableData" id="attachment2" style="display: none;">
                         <td nowrap>附件文档：</td>
                         <td nowrap colspan=3>
                             无附件      </td>
                     </tr>
                     <tr height="25" id="attachment1">
                         <td nowrap class="TableData"><span id="ATTACH_LABEL">附件上传：</span></td>
                         <td class="TableData" colspan=3>
                             <script>ShowAddFile();</script>
                             <input type="hidden" name="ATTACHMENT_ID_OLD" value="">
                             <input type="hidden" name="ATTACHMENT_NAME_OLD" value="">
                         </td>
                     </tr>--%>

                    <tr align="center" class="TableControl">
                        <td colspan=4 nowrap>
                            <%--   <input type="button" value="保存" class="subBtn BigButton">--%>
                            <div id="rs" type="save" class="btn_style btn_ok"><fmt:message code="global.lang.save" /></div>
                        </td>
                    </tr>
                </table>
            </form>

            <script type="text/javascript">
                $(document).ready(function () {
                    $(".xinxiyinchneg").remove();
                });
            </script>
        </div>

    </div>


    <!--content部分结束-->


    <!--footer部分结束-->
</div>
</body>
<script>
    function Refillings(id) {
        document.getElementById(id).reset();
    };
    user_id = '';
    function empty(id) {
        $("#" + id).val("");
    };
    /* word文本编辑器 */
    /*  var ue = UE.getEditor('word_container');*/


    function emptys(id, id1, id2, id3, id4, id5, id6, id7, id8, id9) {
        $("#" + id).val("");
        $("#" + id1).val("");
        $("#" + id2).val("");
        $("#" + id3).val("");
        $("#" + id4).val("");
        $("#" + id5).val('全部') == '0';
        $("#" + id6).val('选择公告类型') == '0';
        $("#" + id7).val('全部') == '0';
        $("#" + id8).val('') == '';
        $("#" + id9).val('全部') == '0';
    };
    /* 公告人员控件显示和隐藏 */
    function showAndHidden(persion, role, man) {
        if ($("#" + persion).html() == ' <fmt:message  code="notice.th.PostedByPersonnelOrRoles"/>') {
            $("#" + persion).html(" <fmt:message  code="notice.th.Hidden"/>");
            $("#" + role).show();
            $("#" + man).show();
        } else {
            $("#" + persion).html(" <fmt:message  code="notice.th.PostedByPersonnelOrRoles"/>");
            $("#" + role).hide();
            $("#" + man).hide();
        }
    }
    $(function () {
        //获取当前时间
        var now_time = null;
        var now_month = null;

        function p(s) {
            return s < 10 ? '0' + s : s;
        }

        var myDate = new Date();
        //获取当前年
        var year = myDate.getFullYear();
        //获取当前月
        var month = myDate.getMonth() + 1;
        //获取当前日
        var date = myDate.getDate();
        var h = myDate.getHours();       //获取当前小时数(0-23)
        var m = myDate.getMinutes();     //获取当前分钟数(0-59)
        var s = myDate.getSeconds();

        now_time = year + '-' + p(month) + "-" + p(date) + " " + p(h) + ':' + p(m) + ":" + p(s);
        now_month = year + '-' + p(month)

        /*本年的范围*/
        var now_year = year + "-01-01/" + year + "-12-31";

        <!-- 本月 -->
        var now = new Date(); //当前日期
        var nowDayOfWeek = now.getDay(); //今天本周的第几天
        var nowDay = now.getDate(); //当前日
        var nowMonth = now.getMonth(); //当前月
        var nowYear = now.getYear(); //当前年
        nowYear += (nowYear < 2000) ? 1900 : 0; //

        var lastMonthDate = new Date(); //上月日期
        lastMonthDate.setDate(1);
        lastMonthDate.setMonth(lastMonthDate.getMonth() - 1);
        var lastYear = lastMonthDate.getYear();
        var lastMonth = lastMonthDate.getMonth();

        //格式化日期：yyyy-MM-dd
        function formatDate(date) {
            var myyear = date.getFullYear();
            var mymonth = date.getMonth() + 1;
            var myweekday = date.getDate();

            if (mymonth < 10) {
                mymonth = "0" + mymonth;
            }
            if (myweekday < 10) {
                myweekday = "0" + myweekday;
            }
            return (myyear + "-" + mymonth + "-" + myweekday);
        }

        //获得某月的天数
        function getMonthDays(myMonth) {
            var monthStartDate = new Date(nowYear, myMonth, 1);
            var monthEndDate = new Date(nowYear, myMonth + 1, 1);
            var days = (monthEndDate - monthStartDate) / (1000 * 60 * 60 * 24);
            return days;
        }

        //获得本季度的开始月份
        function getQuarterStartMonth() {
            var quarterStartMonth = 0;
            if (nowMonth < 3) {
                quarterStartMonth = 0;
            }
            if (2 < nowMonth && nowMonth < 6) {
                quarterStartMonth = 3;
            }
            if (5 < nowMonth && nowMonth < 9) {
                quarterStartMonth = 6;
            }
            if (nowMonth > 8) {
                quarterStartMonth = 9;
            }
            return quarterStartMonth;
        }

        //获得本周的开始日期
        function getWeekStartDate() {
            var weekStartDate = new Date(nowYear, nowMonth, nowDay - nowDayOfWeek);
            return formatDate(weekStartDate);
        }

        //获得本周的结束日期
        function getWeekEndDate() {
            var weekEndDate = new Date(nowYear, nowMonth, nowDay + (6 - nowDayOfWeek));
            return formatDate(weekEndDate);
        }

        //获得本月的开始日期
        function getMonthStartDate() {
            var monthStartDate = new Date(nowYear, nowMonth, 1);
            return formatDate(monthStartDate);
        }

        //获得本月的结束日期
        function getMonthEndDate() {
            var monthEndDate = new Date(nowYear, nowMonth, getMonthDays(nowMonth));
            return formatDate(monthEndDate);
        }

        /*公告统计页面的当前月份开始*/
        $('#find_start').val(getMonthStartDate());
        /*公告统计页面的当前月份结束*/
        $('#find_end').val(getMonthEndDate());


        /*所有部门*/
        //部门共用
        <%--var opt_li_dep = '<option value="0"  class="levelleft0"><fmt:message code="workflow.th.allpart" /></option><option value="01"  class="levelleft0" id="choose_more"><fmt:message code="hr.th.MultipleDepartments" /></option>';--%>
        <%--departmentAjax(function (departmentData) {--%>
            <%--opt_li_dep = departmentChild(departmentData, opt_li_dep, 0, -1);--%>
            <%--$('#dept_id').html(opt_li_dep);--%>
        <%--});--%>

        //部门遍历方法
        function departmentChild(datas, opt_li, level, dept) {
            for (var i = 0; i < datas.length; i++) {
                var String = "";
                var space = ""
                for (var j = 0; j < level; j++) {
                    space += "├&nbsp;&nbsp;&nbsp;";
                }

                if (i == 0) {
                    String = space + "┌";
                } else if (i != 0) {
                    String = space + "├";
                } else if (i == datas.length - 1) {
                    String = space + "└";
                }
                if (dept == datas[i].deptId) {
                    opt_li += '<option value="' + datas[i].deptId + '" selected="selected">' + String + datas[i].deptName + '</option>';
                } else {
                    opt_li += '<option value="' + datas[i].deptId + '">' + String + datas[i].deptName + '</option>';
                }
                if (datas[i].childs != null) {
                    opt_li = departmentChild(datas[i].childs, opt_li, level + 1, dept);
                }
            }
            return opt_li;
        }

        //部门接口
        function departmentAjax(callback) {
            $.ajax({
                url: '../../department/getAlldept',
                type: 'get',
                dataType: 'json',
                success: function (obj) {
                    var data = obj.obj;
                    var departmentData = digui(data, 0);
                    callback(departmentData);
                }
            });
        }

        function digui(datas, departId) {
            var data = new Array();
            for (var i = 0; i < datas.length; i++) {
                if (datas[i].deptParent == departId) {
                    datas[i]["childs"] = digui(datas, datas[i].deptId);
                    data.push(datas[i]);
                }
            }
            return data;
        }

        //选人员
        $('#query_adduser').click(function () {
            user_id = 'query_userId';
            $.popWindow("../common/selectUser");
        });

        //选角色
        $('#priv_add').click(function () {
            priv_id = 'query_privId';
            $.popWindow("../common/selectPriv");
        });

        //添加附件
        /* 添加附件 */

        $('#uploadimg').click(function () {
            $('#uploadinputimg').click();
        });

        $('#uploadinputimg').change(function (e) {
            var target = $(e.target);
            var file;
            if (target[0].files && target[0].files[0]) {
                file = target[0].files[0];
            }
            if (file) {
                $.upload($('#uploadimgform'), function (res) {
                    var str = "";
                    var str1 = "";
                    var data = res.obj;
                    for (var i = 0; i < data.length; i++) {
                        str += '<div class="dech" deUrl="' + data[i].attUrl + '"><a class="ATTACH_a" NAME="' + data[i].attachName + '*" href="<%=basePath %>download?' + data[i].attUrl + '">' + data[i].attachName + '</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" NAME="' + data[i].attachName + '*"  class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                    }

                    $('#query_uploadArr').append(str);

                });
            }
        });


        var data = {
            page: 1,
            pageSize: 5,
            useFlag: true
        };

        initPageList(function (pageCount) {
            initPagination(pageCount, data.pageSize);
        });

//        表格的数据展示
        function initPageList(cb) {

            $.ajax({
                type: "get",
                url: "<%=basePath%>/hr/contract/getAllContract",
                dataType: 'JSON',
                data: data,
                success: function (data) {
                    var news = "";

                    for (var i = 0; i < data.obj.length; i++) {
                        news += "<tr id='notice_tr' notifyId=" + data.obj[i].contractId + ">" +
                            "<td style='width: 5%;'><input class='checkChild' style='margin-left: 5px;' type='checkbox' conid='" + data.obj[i].contractId + "' name='check' value=''></td>" +
                            "<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                if (data.obj[i].userName == undefined || data.obj[i].userName == "") {
                                    return "<fmt:message code="hr.th.UserNotExist" />"
                                } else {
                                    return data.obj[i].userName
                                }
                            }() + "</td>" +
                            "<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->' >" + function () {
                                if (data.obj[i].deptName == undefined || data.obj[i].deptName == "") {
                                    return "<fmt:message code="hr.th.DepartmentNotExists" />"
                                } else {
                                    return data.obj[i].deptName
                                }
                            }() + "</td>" +
                            "<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='publishtip' >" + data.obj[i].postName + "</td>" +
                            "<td style='width: 8%;' class='title' notifyId=" + data.obj[i].contractId + ">" + function () {
                                if (data.obj[i].contractTypeName == undefined) {
                                    return "<fmt:message code="hr.th.ContractTypeNotExist" />"
                                } else {
                                    return data.obj[i].contractTypeName
                                }
                            }() + "</td>" +
                            "<td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + data.obj[i].contractEnterpriesName + " class='' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                if (data.obj[i].contractEnterpriesName == undefined) {
                                    return "<fmt:message code="hr.th.companyNotExist" />"
                                } else {
                                    return data.obj[i].contractEnterpriesName
                                }
                            }() + "</td>" +
                            "<td style='width: 10%;' class='start_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function(){
                                if(data.obj[i].probationEffectiveDate==undefined){
                                    return ""
                                }else{
                                    return data.obj[i].probationEffectiveDate;
                                }
                            }() + "</td>" +
                            "<td style='width: 10%;' class='end_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                if (data.obj[i].trailOverTime == undefined) {
                                    return ""
                                } else {
                                    return data.obj[i].trailOverTime
                                }
                            }() + "</td>" +
                            "<td style='width: 10%;' class='end_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                if (data.obj[i].contractEndTime == undefined) {
                                    return ""
                                } else {
                                    return data.obj[i].contractEndTime
                                }
                            }() + "</td>" +
                            "<td style='width: 12%;' class='caozuo'>" + "<a class='find_detail' notifyId=" + data.obj[i].contractId + " style='color:#1772c0;cursor:pointer'><fmt:message code="hr.th.detailedInformation" /></a>&nbsp<a notifyId=" + data.obj[i].contractId + " class='notice_change' style='cursor:pointer'><fmt:message code="depatement.th.modify" /></a><a class='notice_delete' style='cursor:pointer' notifyId=" + data.obj[i].contractId + " ><fmt:message code="global.lang.delete" /></a></td>"//操作
                    }
                    var last_str = "<tr class='last_str'><td colspan='10'><input id='checkedAll' class='checkChild' type='checkbox' conid='29' name='check' value=''><fmt:message code="notice.th.allchose" /><div class='deleteok' style='display:inline-block;margin-left: 30px;'><span style='margin-left: 0px;'><fmt:message code="hr.th.deleteContracts" /></span></div></td></tr>";
                    $("#j_tb").html(news + last_str);
                    if (cb) {
                        cb(data.totleNum);
                    }
                    initPagination(data.totleNum, 5);

                }
            })
        };

        function initPagination(totalData, pageSize) {

            $('.M-box3').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                current: data.page,
                homePage: '<fmt:message code="global.page.first" />',
                endPage: '<fmt:message code="global.page.last" />',
                prevContent: '<fmt:message code="global.page.pre" />',
                nextContent: '<fmt:message code="global.page.next" />',
                jumpBtn: '<fmt:message code="global.page.jump" />',
                callback: function (index) {
                    data.page = index.getCurrent();

                    initPageList(function (pageCount) {
                        initPagination(pageCount, data.pageSize);
                    });
                }
            });
        }


        $('#add_notice_time').on('click', function () {
            queryTime();
            $("#add_newDate").val(now);
        });

        //点击复选框
        $("#j_tb").on('click', '#notice_tr', function () {
            /*    alert('111');*/
            var state = $(this).find('.checkChild').prop("checked");
            if (state == true) {
                $(this).find('.checkChild').prop("checked", true);
                $(this).addClass('bgcolor');
            } else {
                $('#checkedAll').prop("checked", false);
                $(this).find('.checkChild').prop("checked", false);
                $(this).removeClass('bgcolor');
            }
            var child = $(".checkChild");
            for (var i = 0; i < child.length; i++) {
                var childstate = $(child[i]).prop("checked");
                if (state != childstate) {
                    return
                }
            }
            $('#notice_tr').prop("checked", state);
        })
        //点击全选
        $('#j_tb').on('click', '#checkedAll', function () {
            /*alert('111');*/
            var state = $(this).prop("checked");
            if (state == true) {
                $(this).prop("checked", true);
                $(".checkChild").prop("checked", true);
                $(this).parents('tr').siblings('#notice_tr').addClass('bgcolor');
            } else {
                $(this).prop("checked", false);
                $(".checkChild").prop("checked", false);
                ;
                $(this).parents('tr').siblings('#notice_tr').removeClass('bgcolor');
            }
        })
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
                        /* init(4,id,1);*/
                        window.location.reload();
                    }
                })

            }, function () {
                layer.closeAll();
            });

        }

        //点击删除选中按钮
        $('#j_tb').on('click', '.deleteok', function () {
            /* alert('111');*/
            var fileId = "";
            $("#j_tb .checkChild:checkbox:checked").each(function () {

                var conId = $(this).attr("conId");
                /*  alert(conId);*/
                fileId += conId + ",";

            })
            if (fileId == '') {
                $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
            } else {
                /*    $('.contentTrs').remove();
                 $('.mainContent').show();
                 $('.details').hide();*/
                dataDelete(fileId)
            }
        })
        //点击删除所有按钮
        $('#j_tb').on('click', '.delete_all', function () {
            alert('111');
            var notifyIds = [];
            /* for(var i=0;i<){
             var n_id=$(this).parents('tr').siblings('#notice_tr').attr('notifyid');
             }*/
            $(this).parents('tr').siblings('#notice_tr').each(function () {
                var n_id = $(this).attr('notifyid');
                alert(n_id);
                notifyIds.push(n_id);
            });
            layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/hr/contract/deleteContractInfo',
                    dataType: 'json',
                    data: {'notifyIds': notifyIds},
                    success: function () {
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        /* init(4,id,1);*/
                        window.location.reload();
                    }
                })

            }, function () {
                layer.closeAll();
            });
        })


        //查阅情况
        $('#j_tb').on('click', '.find_detail', function () {
            /* alert('111');*/
            var notifyId = $(this).attr('notifyId');
            $.popWindow("contractDetail?contractId=" + notifyId, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
        })


        //删除公告通知管理
        $('#j_tb').on('click', '.notice_delete', function () {
            var that = $(this).parents('#notice_tr');
            var tid = $(this).attr('notifyId');

            layer.confirm(' <fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'],//按钮
                title: ' <fmt:message  code="workflow.th.suredel"/>'
            }, function () {
                //确定删除，调接口
                $.ajax({
                    url: "<%=basePath%>/hr/contract/deleteContractInfo",
                    type: "get",
                    data: {
                        contractId: tid
                    },
                    dataType: 'json',
                    success: function (obj) {
                        //第三方扩展皮肤
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});

                        that.remove();
                    }
                })

            }, function () {
                layer.closeAll();
            });


        });
        //删除附件
        function deleteChatment(data, element) {

            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteAttachment"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'get',
                    url: '../delete',
                    dataType: 'json',
                    data: data,
                    success: function (res) {

                        if (res.flag == true) {
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            element.remove();
                        } else {
                            layer.msg(' <fmt:message  code="lang.th.deleSucess"/>', {icon: 6});
                        }
                    }
                });

            }, function () {
                layer.closeAll();
            });
        }

        //点击x，删除附件
        $('.enclosure').on('click', '.deImg', function () {
            var data = $(this).parents('.dech').attr('deUrl');
            var dome = $(this).parents('.dech');
            deleteChatment(data, dome);
        });

        // 获取用户信息控件
        $('.userAdd').click(function () {
            user_id = "staffNameInput";
            $.popWindow("../../common/selectUser");
        });

        // 获取人员信息控件
        $('.orgAdd').click(function () {
            user_id = "remindUser";
            $.popWindow("../../common/selectUser");
        });
        // 清空
        $('.orgClear').click(function () {
            $('#remindUser').attr("dataid", "");
            $('#remindUser').attr("user_id", "");
            $('#remindUser').val("");
        });


        //获取合同信息
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
            }
        });

        // 获取角色信息
        $.ajax({
            url: "<%=basePath%>/getAllUserPriv",
            type: 'get',
            dataType: "JSON",
            data: {"CodeNos": "HR_ENTERPRISE"},
            success: function (data) {
                var str = '';
                for (var proId in data) {
                    for (var i = 0; i < data[proId].length; i++) {
                        if (data[proId][i].userPriv != undefined) {
                            str += '<option value="' + data[proId][i].userPriv + '">' + data[proId][i].privName + '</option>'
                        }
                    }
                }
                $('select[name="userPriv"]').append(str);
            }
        });

        var contractId = "";
        /*合同管理中的修改之前的查询接口*/
        $("#j_tb").on('click', '.notice_change', function () {
            $('.con_edit').show().siblings().hide();
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
                    $("input[name='staffContractNo']").val(res.object.staffContractNo);


                    $('select[name="contractEnterpries"]').find("option[value='" + res.object.contractEnterpries + "']").attr("selected", true);
                    $('select[name="contractType"] ').find("option[value='" + res.object.contractType + "']").attr("selected", true);
                    $('select[name="contractSpecialization"] ').val(res.object.contractSpecialization);
                    $('select[name="userPriv"] ').val(res.object.userPriv);


                    $('input[name="makeContract"]').val(res.object.makeContract);
                    $('[name="probationEffectiveDate"]').val(res.object.probationEffectiveDate);
                    $('[name="contractEndTime"]').val(res.object.contractEndTime);
                    $('[name="trailOverTime"]').val(res.object.trailOverTime);

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

                    $('[name="contractRemoveTime"]').val(res.object.contractRemoveTime);
                    $('[name="renewTime"]').val(res.object.renewTime);
                    $('[name="remindUser"]').attr("user_id", res.object.remindUser);
                    $('[name="remindUser"]').val(res.object.remindUserName);
                    $('[name="remark"]').val(res.object.remark);
                }
            })
        });

        // 提交修改表单
        $("#rs").click(function () {
            if (CheckForm()) {
                var staffName = $("input[name='staffName1']").attr("user_id");
                if(staffName!=undefined && staffName!=""){
                    staffName= staffName.replace(/,/g,'');
                }

                var data = {
                    'contractId': contractId,
                    'staffName': staffName,
                    'staffContractNo': $("input[name='staffContractNo']").val(),
                    'contractEnterpries': $('select[name="contractEnterpries"] option:checked').val(),
                    'contractType': $('select[name="contractType"] option:checked').val(),
                    'contractSpecialization': $('select[name="contractSpecialization"] option:checked').val(),
                    'userPriv': $('select[name="userPriv"] option:checked').val(),
                    'makeContract': $('input[name="makeContract"]').val(),
                    'probationEffectiveDate': $('[name="probationEffectiveDate"]').val(),
                    'contractEndTime': $('[name="contractEndTime"]').val(),
                    'trailOverTime': $('[name="trailOverTime"]').val(),
                    'passOrNot': $('[name="PASS_OR_NOT"] checked:checked').val(),
                    'contractRemoveTime': $('[name="contractRemoveTime"]').val(),
                    'renewTime': $('[name="renewTime"]').val(),
                    'remindUser': $('[name="remindUser"]').attr("user_id"),
                    'remark': $('[name="remark"]').val()
                }
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/hr/contract/updateContractInfo',
                    dataType: 'json',
                    data: data,
                    success: function (rsp) {
                        if (rsp.flag == true) {
                            layer.msg('<fmt:message code="hr.th.EditorSavedSuccessfully" />', {icon: 6});
                            window.location.href='<%=basePath%>/hr/page/contractStraff';
                        } else {
                            layer.msg('<fmt:message code="hr.th.EditSaveFailed" />', {icon: 6});
                            window.location.href='<%=basePath%>/hr/page/contractStraff';
                        }
                    }
                })

            }
        });


    });

    /* 终止和生效方法 */

    function stoprwo(me, id, publishId, stopId) {
        var pulbish;
        /*  alert($(stopId).html()); */
        if ($('#' + stopId).html() == '终止') {
            pulbish = "2";
            /* 	alert(2); */
        } else if ($('#' + stopId).html() == '生效') {
            pulbish = "1";
        }
        var data = {
            "notifyId": id,
            "publish": pulbish  // 发布标识(0-未发布,1-已发布,2-已终止)
        };
        $.ajax({
            url: "updateNotify",
            type: 'post',
            dataType: "JSON",
            data: data,
            success: function (data) {
                if ($(me).html() == '终止') {
                    $(me).parent().prev().html('<fmt:message code="notice.state.end" />');/*终止*/
                    $(me).html('<fmt:message code="notice.state.effective" />');/*生效*/
                } else if ($(me).html() == '生效') {
                    $(me).parent().prev().html('<fmt:message code="notice.state.effective" />');/*生效*/
                    $(me).html('<fmt:message code="notice.state.end" />');/*终止*/
                }
            },
            error: function (e) {
            }
        });

    }
    laydate({
        elem: '#add_newDate', //目标元素。
        format: 'YYYY-MM-DD hh:mm:ss', //日期格式
        istoday: true,
        istime: true //显示时、分、秒
    });

    //查询公告时间控件调用
    var start = {
        elem: '#beginTime',
        format: 'YYYY-MM-DD hh:mm:ss',
        /* min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function (datas) {
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
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    /*新建公告时间控件调用*/

    var starts = {
        elem: '#notice_start_add',
        format: 'YYYY-MM-DD',
        /*        min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }
    };
    var ends = {
        elem: '#notice_end_add',
        format: 'YYYY-MM-DD',
        /*       min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    /*   find_start*/
    var find_start = {
        elem: '#find_start',
        format: 'YYYY-MM-DD',
        /*       min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    var find_end = {
        elem: '#find_end',
        format: 'YYYY-MM-DD',
        /*       min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    laydate(start);
    laydate(end);
    laydate(starts);
    laydate(ends);
    laydate(find_start);
    laydate(find_end);

    // 验证表单
    function CheckForm() {
        var TRAIL_PASS_OR_NOT_VALUE = "";
        var REMOVE_OR_NOT_VALUE = "";
        var RENEW_OR_NOT_VALUE = "";
        var a = document.getElementsByName("TRAIL_PASS_OR_NOT");
        var b = document.getElementsByName("REMOVE_OR_NOT");
        var c = document.getElementsByName("RENEW_OR_NOT");
        for (i = 0; i < a.length; i++) {
            if (a[i].checked)
                TRAIL_PASS_OR_NOT_VALUE = a[i].value;
        }

        for (i = 0; i < b.length; i++) {
            if (b[i].checked)
                REMOVE_OR_NOT_VALUE = b[i].value;
        }

        for (i = 0; i < c.length; i++) {
            if (c[i].checked)
                RENEW_OR_NOT_VALUE = c[i].value;
        }

        if (document.form1.staffName1.value == "") {
            layer.msg("<fmt:message code="hr.th.EmployeeEmpty" />！");
            return (false);
        }
        if (document.form1.contractEnterpries.value == "") {
            layer.msg("<fmt:message code="hr.th.SigningCompany" />！");
            return (false);
        }
        if (document.form1.contractType.value == "") {
            layer.msg("<fmt:message code="hr.th.contractType" />！");
            return (false);
        }

        if (document.form1.probationEffectiveDate.value == "") {
            layer.msg("<fmt:message code="hr.th.TheEffectiveNull" />！");
            return (false);
        }
        if (TRAIL_PASS_OR_NOT_VALUE == 1 && document.form1.trailOverTime.value == "") {
            layer.msg("<fmt:message code="hr.th.Trialdeadline" />！");
            return (false);
        }

        if (REMOVE_OR_NOT_VALUE == 1 && document.form1.contractRemoveTime.value == "") {
            layer.msg("<fmt:message code="hr.th.contractReleaseDate" />！");
            return (false);
        }
        if (RENEW_OR_NOT_VALUE == 1 && document.form1.renewTime.value == "") {
            layer.msg("<fmt:message code="hr.th.renewal" />！");
            return (false);
        }

        if (document.form1.probationEffectiveDate.value != "" && document.form1.makeContract.value != "" && document.form1.makeContract.value > document.form1.probationEffectiveDate.value) {
            layer.msg("<fmt:message code="hr.th.TheEffectiveDate" />！");
            return (false);
        }

        if (TRAIL_PASS_OR_NOT_VALUE == 1 && document.form1.trailOverTime.value != "" && document.form1.contractEndTime.value != "" && document.form1.trailOverTime.value > document.form1.contractEndTime.value) {
            layer.msg("<fmt:message code="hr.th.ExceedContract" />！");
            return (false);
        }

        if (TRAIL_PASS_OR_NOT_VALUE == 1 && document.form1.trailOverTime.value != "" && document.form1.trailOverTime.value < document.form1.probationEffectiveDate.value) {
            layer.msg("<fmt:message code="hr.th.trialDeadline" />！");
            return (false);
        }

        if (document.form1.contractEndTime.value != "" && document.form1.contractEndTime.value < document.form1.probationEffectiveDate.value) {
            layer.msg("<fmt:message code="hr.th.TerminationContract" />！");
            return (false);
        }

        if (REMOVE_OR_NOT_VALUE == 1 && document.form1.contractRemoveTime.value != "" && document.form1.contractRemoveTime.value < document.form1.probationEffectiveDate.value) {
            layer.msg("<fmt:message code="hr.th.EffectiveContract" />！");
            return (false);
        }

        if (RENEW_OR_NOT_VALUE == 1 && document.form1.renewTime.value != "" && document.form1.renewTime.value < document.form1.contractEndTime.value) {
            layer.msg("<fmt:message code="hr.th.terminationContract" />！");
            return (false);
        }

        if (RENEW_OR_NOT_VALUE == 1 && document.form1.renewTime.value != "" && document.form1.renewTime.value < document.form1.probationEffectiveDate.value) {
            layer.msg("<fmt:message code="hr.th.EffectiveDate" />！");
            return (false);
        }

        return (true);
    }

    function expandIt1() {
        whichE1 = document.getElementById("id_msg1");
        whichE2 = document.getElementById("id_msg11");
        whichE10 = document.getElementById("hetongzhuanzheng");
        if (document.form1.TRAIL_PASS_OR_NOT[0].checked == true) {
            whichE1.style.display = '';
            whichE2.style.display = '';
            whichE10.style.display = '';
        }
        if (document.form1.TRAIL_PASS_OR_NOT[1].checked == true) {
            whichE1.style.display = 'none';
            whichE2.style.display = 'none';
            whichE10.style.display = 'none';
        }
    }
    function expandIt2() {
        whichE3 = document.getElementById("id_msg2");
        whichE4 = document.getElementById("id_msg21");
        if (document.form1.REMOVE_OR_NOT[0].checked == true) {
            whichE3.style.display = '';
            whichE4.style.display = '';
        }
        if (document.form1.REMOVE_OR_NOT[1].checked == true) {
            whichE3.style.display = 'none';
            whichE4.style.display = 'none';
        }
    }
    function expandIt3() {
        whichE5 = document.getElementById("id_msg3");
        whichE6 = document.getElementById("id_msg31");
        if (document.form1.RENEW_OR_NOT[0].checked == true) {
            whichE5.style.display = '';
            whichE6.style.display = '';
        }
        if (document.form1.RENEW_OR_NOT[1].checked == true) {
            whichE5.style.display = 'none';
            whichE6.style.display = 'none';
        }
    }

</script>
</body>
</html>