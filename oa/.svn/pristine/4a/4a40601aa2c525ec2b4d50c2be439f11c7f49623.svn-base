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
    <title><fmt:message code="event.th.TrainingPlanDetails" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
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
        <td class="Big"><img src="../../img/contractinfo.png" width="17" height="17"><span class="big3"> <fmt:message code="event.th.TrainingPlanDetails" /></span><br>
        </td>
    </tr>
</table>
<br>
<table class="TableBlock" width="90%" align="center">
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingPlanNumber" />：</td>
        <td nowrap align="left" class="TableData planNo" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.NameTrainingPlan" />：</td>
        <td nowrap align="left" class="TableData planName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingChannel" />：</td>
        <td nowrap align="left" class="TableData channelName" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingForm" />：</td>
        <td nowrap align="left" class="TableData courseTypesName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="sup.th.SponsorDepartment" />：</td>
        <td align="left" class="TableData sponsoringDepartmentName" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.PersonCharge" />：</td>
        <td nowrap align="left" class="TableData chargePersonName" width="180"></td>
    </tr>

    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.PlanParticipate" />：</td>
        <td nowrap align="left" class="TableData joinNum" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingLocation" />：</td>
        <td align="left" class="TableData address" width="180"></td>
    </tr>
    <tr>
        <td rowspan="2" nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.NameInstitution" />：</td>
        <td rowspan="2" nowrap align="left" class="TableData institutionName" width="180"></td>
        <td rowspan="2" nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.ContacInstitution" />：</td>
        <td rowspan="2" nowrap align="left" class="TableData institutionContact" width="180"></td>
    </tr>
    <tr>
    </tr>
    <tr>
        <td  nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingRelated" />：</td>
        <td  align="left" class="TableData institutionInfo" width="180"></td>
        <td  nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingInstitutions" />：</td>
        <td  nowrap align="left" class="TableData instituContactInfo" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingName" />：</td>
        <td nowrap align="left" class="TableData courseName" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent">	<fmt:message code="event.th.TotalHours" />：</td>
        <td align="left" class="TableData courseHours" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.OpeningTime" />：</td>
        <td nowrap align="left" class="TableData courseStartTime" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent">	<fmt:message code="event.th.ClassTime" />：</td>
        <td align="left" class="TableData courseEndTime" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingBudget" />：</td>
        <td nowrap align="left" class="TableData bcws" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent">	<fmt:message code="hr.th.Approver" />：</td>
        <td align="left" class="TableData assessingOfficerName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.ApprovalTime" />：</td>
        <td nowrap align="left" class="TableData assessingTime" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent">	<fmt:message code="event.th.ApprovalStatus" />：</td>
        <td align="left" class="TableData assessingStatuName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.ApprovalOpinions" />：</td>
        <td align="left" colspan="3" class="TableData assessingView" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.ParticipateTraining" />：</td>
        <td align="left" colspan="3" class="TableData joinDeptName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.Participate" />：</td>
        <td align="left" colspan="3" class="TableData joinPersonName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingRequirements" />：</td>
        <td align="left" colspan="3" class="TableData requires" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingInstructions" />：</td>
        <td align="left" colspan="3" class="TableData description" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingContent" />：</td>
        <td align="left"  colspan="3" class="TableData content" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="journal.th.Remarks" />：</td>
        <td align="left"  colspan="3" class="TableData remark" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="hr.th.RegistrationTime" />：</td>
        <td align="left"  colspan="3" class="TableData addTime" width="180"></td>
    </tr>
</table>
</body>
    <script>


        //格式化时间
        function   formatDate(now)   {
            if(now!=''&& now!=undefined){
                var   year=now.getFullYear();
                var   month=now.getMonth()+1;
                var   date=now.getDate();
                var   hour=now.getHours();
                var   minute=now.getMinutes();
                var   second=now.getSeconds();
                return  year+"年"+month+"月"+date+"日";
            }else{
                return "";
            }
        }




        $(function(){
            var nid=$.getQueryString('planId');
            $('#rs').click(function(){
                window.close();
            })

            $.ajax({
                url: "<%=basePath%>/eduTrainPlan/getHrtailDetail",
                type: "get",
                data: {
                    planId: nid
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.object;
                     $('.planNo').html(data.planNo);
                     $('.planName').html(data.planName);
                    $('.channelName').html(data.channelName);
                    $('.courseTypesName').html(data.courseTypesName);
                    $('.sponsoringDepartmentName').html(data.sponsoringDepartmentName);
                    $('.chargePersonName').html(data.chargePersonName);
                    $('.joinNum').html(data.joinNum);
                    $('.address').html(data.address);
                    $('.institutionName').html(data.institutionName);
                    $('.institutionContact').html(data.institutionContact);
                    $('.institutionInfo').html(data.institutionInfo);
                    $('.instituContactInfo').html(data.instituContactInfo);
                    $('.courseName').html(data.courseName);
                    $('.courseHours').html(data.courseHours);
                    if(data.courseStartTime!=null){
                        var date=new Date(data.courseStartTime);
                        $('.courseStartTime').html(formatDate(date));
                    }else{
                        $('.courseStartTime').html("");
                    }
                  if(data.courseEndTime!=null){
                      var date=new Date(data.courseEndTime);
                      $('.courseEndTime').html(formatDate(date));
                  }else{
                      $('.courseEndTime').html("");
                  }
                    $('.bcws').html(data.bcws);
                    $('.assessingOfficerName').html(data.assessingOfficerName);
                    if(data.assessingTime!=null){
                        var date=new Date(data.assessingTime);
                        $('.assessingTime').html(formatDate(date));
                    }else{
                        $('.assessingTime').html("");
                    }
                    $('.assessingView').html(data.assessingView);
                    $('.assessingStatuName').html(data.assessingStatuName);
                    $('.joinDeptName').html(data.joinDeptName);
                    $('.joinPersonName').html(data.joinPersonName);
                    $('.requires').html(data.requires);
                    $('.description').html(data.description);
                    $('.content').html(data.content);
                    $('.remark').html(data.remark);
                    if(data.addTime!=null){
                        var date=new Date(data.addTime);
                        $('.addTime').html(formatDate(date));
                    }else{
                        $('.addTime').html("");
                    }
                }
            })
        })
    </script>
</html>


