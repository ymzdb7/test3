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
    <title><fmt:message code="hr.th.NotSignLaborContract" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>

    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
</head>


<link rel="stylesheet" type="text/css" href="/static/theme/15/bbs.css">
<script src="/static/js/module.js?v=150805"></script>
<script>
    function CheckForm()
    {
        if(document.form1.TRAN_DEPT_AFTER_NAME.value=="")
        {
            alert("<fmt:message code="hr.th.PleaseCheck" />");
            return (false);
        }
        document.form1.submit();
    }
</script>
<body class="bodycolor">
<form method="post" name="form1" action="#">
    <table border="0" width="100%" cellpadding="3" cellspacing="1" align="center" >
        <tr>
            <td  class="TableHeader"><span> <fmt:message code="hr.th.NotInquiry" /></span>&nbsp;
                 <fmt:message code="userManagement.th.department" />   <input type="hidden" name="TRAN_DEPT_AFTER">
                <input type="text" name="TRAN_DEPT_AFTER_NAME" value="" class=BigStatic size=15 maxlength=100 readonly>
                <a href="javascript:;" class="orgAdd" onClick="SelectDeptSingle('','TRAN_DEPT_AFTER','TRAN_DEPT_AFTER_NAME')"><fmt:message code="notice.th.chose" /></a>
                <input type="hidden" name="inform" value="1"/>
                <input type="button" value="查询" class="SmallButton" onClick="CheckForm();">&nbsp;&nbsp;
            </td>
        </tr>
    </table>
</form>
<br>
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td  class="big"><img src="../../img/notify_open.gif" align="absmiddle"><span class="big3"> <fmt:message code="hr.th.NotSignLaborContract" /></span>&nbsp;
        </td>
    </tr>
</table>
<table class="TableList" width="100%">
    <tr class="TableHeader">
        <td nowrap align="center"><fmt:message code="hr.th.UnitStaff" /></td>
        <td nowrap align="center"><fmt:message code="userDetails.th.Gender" /></td>
        <td nowrap align="center"><fmt:message code="workflow.th.sector" /></td>
        <td nowrap align="center"><fmt:message code="url.th.Leading" /></td>
        <td nowrap align="center"><fmt:message code="notice.th.operation" /></td>
    </tr>
    <tr class='TableData'>
    </tr></table>
</body>

</html>


