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
    <title><fmt:message code="adding.th.numManage" /> </title>
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <style>
        .newsBtn{
            background: #2f80d1!important;
            padding: 0px 10px 0px 10px;
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
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script type="text/javascript" src="/lib/jquery.form.min.js"></script>
    <script src="/js/workflow/work/numberingAdminister.js"></script>
</head>
<body>
<div class="maintop clearfix" style="margin-top: 50px;">
    <p>
        <img src="/img/la1.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
        <label><fmt:message code="adding.th.numManage" /></label><%--自动编号设置--%>
    </p>
    <a  class="newsBtn newsBtntwo returnOne" data-num="0"
        style="float: right;margin-right: 3%;margin-top: 5px;"
        href="javascript:void (0)"><fmt:message code="notice.th.return" /></a><%--返回--%>
</div>
<div class="mainBottom" >
    <table>
        <thead>
        <tr>
            <%--<th class="th" width="15%" align="center">自定义变量</th>&lt;%&ndash;序号&ndash;%&gt;--%>
            <%--<th class="th" width="20%" align="center">全年份</th>&lt;%&ndash;名称&ndash;%&gt;--%>
            <%--<th class="th" width="20%" align="center">月份</th>&lt;%&ndash;唯一标识&ndash;%&gt;--%>
            <%--<th class="th" width="20%" align="center">计数器</th>&lt;%&ndash;规则&ndash;%&gt;--%>
            <%--<th class="th" width="25%" align="center">操作</th>&lt;%&ndash;规则描述&ndash;%&gt;--%>
        </tr>
        </thead>
        <tbody>
            <tr></tr>
        </tbody>
    </table>
</div>
</body>
</html>
