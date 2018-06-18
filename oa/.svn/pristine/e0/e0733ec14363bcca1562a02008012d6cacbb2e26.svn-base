<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/31
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title><fmt:message code="workflow.th.designprocess" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/base/base.js"></script>
</head>
<body>
<div class="cont_r " style="margin-left: 0px;">
    <div class="item_s item_con">
        <table class="table" cellspacing="0" id="table_form">
            <caption class="clearfix define_r">
                <img style="margin-right: 10px;width: 18px;padding-left: 15px;float: left;margin-top: 12px;" src="/img/workflow/flowsetting/flowSettingMain/shejiliucheng.png"  alt="">

                <span style="float:left" class="priv_t"><fmt:message code="workflow.th.designprocess" /></span>
                <a href="" style="margin-right:44px" class="keepmsgTwo" target="view_window"><fmt:message code="workflow.th.designer" /></a>
            </caption>
            <thead>
                <tr>
                    <th><fmt:message code="url.th.safeLogNo" /></th>
                    <th><fmt:message code="workflow.th.name" /></th>
                    <th><fmt:message code="workflow.th.nextstep" /></th>

                </tr>
            </thead>
            <tbody>


            </tbody>
        </table>

    </div>
</div>
<script>
    $(function () {
        $('.keepmsgTwo').attr('href','/flowSetting/processDesignTool?flowId='+parent.getResObj.flowId)
        $.ajax({
            type: "get",
            url: "/flowProcess/findFlowId",
            dataType: "json",
            data: {
                flowId: parent.getResObj.flowId
            },
            success: function (data) {
                if (data.flag) {
                    var data = data.obj;
                    var html=''
                    for (var i = 0; i < data.length; i++) {
                        var prcsTo = data[i].prcsTo;
                        if (prcsTo == "") {
                            prcsTo = [data[i].prcsId] * 1 + 1
                        } else {
                            prcsTo = data[i].prcsTo
                        }
                        html += "<tr>" +
                            "<td>" + data[i].prcsId + "</td>" +
                            "<td>" + data[i].prcsName + "</td>" +
                            "<td>" + data[i].prcsTo + "</td>" +

                            "</tr>";

                    }
                }
                $('#table_form tbody').html(html);
//                checkAll();
            }
        });


    })
</script>
</body>
</html>
