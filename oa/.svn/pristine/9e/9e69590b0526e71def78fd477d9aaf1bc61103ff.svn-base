<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/12
  Time: 15:290
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
   <title><fmt:message code="workflow.th.BusAppInterConfig" /></title><%--业务应用接口配置--%>

    <style>
        .news{
            cursor: pointer;
        }
    </style>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <style>
        .inputlayout>ul ul>li.active {
            background: #4898d5;
            color: #fff;
        }
        .navigation .left{
            line-height: 45px;
            height: 45px;
             border-bottom: 1px solid #999;
        }
    </style>
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
    <script type="text/javascript" src="../../lib/layui-v1.0.9_rls/layui/layui.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script type="text/javascript" src="/lib/jquery.form.min.js"></script>
    <script src="/js/workflow/work/workform.js"></script>
    <script src="/js/workflow/work/businessApplications.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="background: #fff">
    <div class="navigation clearfix">
        <div class="left">
            <%--<img src="/img/la1.png" alt="">--%>
            <div class="news active" style="padding-left: 2%;">
               <span data-num="1"><fmt:message code="workflow.th.InternalInterfaceConfiguration" /></span><%--内部接口配置--%>
            </div>
                <img src="/img/twoth.png" style="margin: 4px 15px;" alt="" class="lf">

        </div>
    </div>
    <div class="maintop clearfix" style="margin-top: 61px;">
        <p style="margin-left: 10px">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/jiekous.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
            <label><fmt:message code="workflow.th.InternalInterfaceConfiguration" /></label><%--内部接口配置--%>
        </p>
        <a  class="newsBtn newsBtntwo" style="float: right;margin-right: 3%;margin-top: 5px;" href="javascript:void (0)" data-num="0"><img style="margin-right: 7px;margin-left: -10px;margin-bottom: 3px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="global.lang.new" /></a><%--新建--%>
    </div>



    <div class="mainBottom" style="margin-top: 21px;">
        <table>
            <thead>
            <tr>
                <th class="th" width="10%" align="center"><fmt:message code="workflow.th.Serial" /></th><%--序号--%>
                <th class="th" width="10%" align="center"><fmt:message code="workflow.th.BusinessModule" /></th><%--业务模块--%>
                <th class="th" width="10%" align="center"><fmt:message code="workflow.th.name" /></th><%--名称--%>
                <th class="th" width="10%" align="center"><fmt:message code="workflow.th.DataDirection" /></th><%--数据方向--%>
                <th class="th" width="10%" align="center"><fmt:message code="ducument.th.Technological" /></th><%--流程--%>
                <th class="th" width="20%" align="center"><fmt:message code="workflow.th.DataMapping" /></th><%--数据映射--%>
                <th class="th" width="10%" align="center"><fmt:message code="workflow.th.desc" /></th><%--描述--%>
                <th class="th" width="20%" align="center"><fmt:message code="menuSSetting.th.menuSetting" /></th><%--操作--%>
            </tr>
            </thead>
            <tbody>
            <tr>

            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
