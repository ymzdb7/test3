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
        <td nowrap align="left" class="TableData tPlanNo" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.NameTrainingPlan" />：</td>
        <td nowrap align="left" class="TableData tPlanName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingInstitution" />：</td>
        <td nowrap align="left" class="TableData tInstitutionName" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingCost" />：</td>
        <td nowrap align="left" class="TableData trainningCost" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingResults" />：</td>
        <td align="left" class="TableData tExamResults" width="180"></td>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.TrainingGrade" />：</td>
        <td nowrap align="left" class="TableData tExamLevel" width="180"></td>
    </tr>

    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.trainee" />：</td>
        <td colspan="3" nowrap align="left" class="TableData staffUserName" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.Attendance" />：</td>
        <td colspan="3" nowrap align="left" class="TableData dutySituation" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="event.th.SummarizSituation" />：</td>
        <td colspan="3" nowrap align="left" class="TableData trainningSituation" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="news.th.comment" />：</td>
        <td colspan="3" nowrap align="left" class="TableData tComment" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="journal.th.Remarks" />：</td>
        <td colspan="3" nowrap align="left" class="TableData remark" width="180"></td>
    </tr>
    <tr>
        <td nowrap align="left" width="120" class="TableContent"><fmt:message code="email.th.file" />：</td>
        <td colspan="3" nowrap align="left" class="TableData attachmentName" width="180"></td>
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
            var nid=$.getQueryString('recordId');
            $('#rs').click(function(){
                window.close();
            })

            $.ajax({
                url: "<%=basePath%>/record/getdetail",
                type: "get",
                data: {
                    recordId: nid
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.obj;
                     $('.tPlanNo').html(data.tPlanNo);
                     $('.tPlanName').html(data.tPlanName);
                    $('.tInstitutionName').html(data.tInstitutionName);
                    $('.trainningCost').html(data.trainningCost);
                    $('.tExamResults').html(data.tExamResults);
                    $('.tExamLevel').html(data.tExamLevel);
                    $('.staffUserName').html(data.staffUserName);
                    $('.dutySituation').html(data.dutySituation);
                    $('.trainningSituation').html(data.trainningSituation);
                    $('.tComment').html(data.tComment);
                    $('.remark').html(data.remark);
                    $('.attachmentName').html(data.attachmentName);
                }
            })
        })
    </script>
</html>


