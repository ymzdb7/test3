<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/13
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.AutomaticNumber" /> </title>
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <script>

        function getCookie(name)
        {
            var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
            if(arr=document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }

        var oHead = document.getElementsByTagName('HEAD').item(0);

        var oScript= document.createElement("script");
        var type = getCookie("language");
        oScript.type = "text/javascript";

        if(type){
            oScript.src="/js/Internationalization/"+type+".js";
        }else{
            oScript.src="/js/Internationalization/zh_CN.js";
        }
        oHead.appendChild( oScript);

    </script>
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script type="text/javascript" src="/lib/jquery.form.min.js"></script>
    <script src="/js/workflow/work/automaticNumbering.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="maintop clearfix" style="margin-top: 13px;">
    <p style="margin-left:10px;">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/bianhaos.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
        <label><fmt:message code="workflow.th.AutomaticNumber" /></label><%--自动编号设置--%>
    </p>
    <a  class="newsBtn newsBtntwo" data-num="0" style="float: right;margin-right: 3%;margin-top: 5px;" href="javascript:void (0)"><img style="margin-right: 4px;margin-left: -10px;margin-bottom: -1px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="global.lang.new" /></a><%--新建--%>
</div>
<div class="mainBottom" style="margin-top: 19px;">
    <table>
        <thead>
        <tr>
            <th class="th" width="10%" align="center"><fmt:message code="workflow.th.Serial" /></th><%--序号--%>
            <th class="th" width="20%" align="center"><fmt:message code="workflow.th.name" /></th><%--名称--%>
            <th class="th" width="10%" align="center"><fmt:message code="workflow.th.UniquelyIdentifies" /></th><%--唯一标识--%>
            <th class="th" width="25%" align="center"><fmt:message code="workflow.th.rule" /></th><%--规则--%>
            <th class="th" width="15%" align="center"><fmt:message code="workflow.th.RuleDescription" /></th><%--规则描述--%>
            <th class="th" width="20%" align="center"><fmt:message code="menuSSetting.th.menuSetting" /></th><%--操作--%>
        </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
</div>
</body>
</html>
