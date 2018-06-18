<%--
  Created by IntelliJ IDEA.
  User: 牛江丽
  Date: 2017/10/12
  Time: 11:05
  办公用品发放
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title><fmt:message code="event.th.PendingApplication" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/meeting/myMeeting.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">

    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <style>
        table tbody tr td:nth-child(1){
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .table .span_td{
            text-align: right;
        }
        select {
            margin-left: 6px;
            width: 150px;
            height: 30px;
            border: #ebebeb 1px solid;
            border-radius: 5px;
            padding: 0 5px;
        }
        .listShow td{
            line-height: 40px;
        }
    </style>
</head>
<body>
<div class="headTop" style="border-bottom:none">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_myMeeting.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.PendingApplication" />
    </div>
</div>
<div class="main">
    <div class="byDepart">
        <div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table class="listShow">
                <thead>
                <tr>
                    <th style="text-align: center" width="7%"><fmt:message code="workflow.th.Serial" /></th>
                    <th style="text-align: center" width="18%"><fmt:message code="vote.th.OfficeName" /></th>
                    <th style="text-align: center" width="10%"><fmt:message code="vote.th.Registration" /></th>
                    <th style="text-align: center" width="15%"><fmt:message code="sup.th.Applicant" /></th>
                    <th style="text-align: center" width="7%"><fmt:message code="vote.th.Total" /></th>
                    <th style="text-align: center" width="15%"><fmt:message code="hr.th.DateOfApplication" /></th>
                    <th style="text-align: center" width="10%"><fmt:message code="journal.th.Remarks" /></th>
                    <th style="text-align: center" width="7%"><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script>
    $(function () {
        //列表显示
        queryNoApprove();
    })

    function queryNoApprove() {
        //列表显示
        $.ajax({
            url: '/officetransHistory/selTranshistoryByState',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data = obj.obj;
                var str = "";
                for (var i = 0; i < data.length; i++) {
                    str += '<tr>' +
                        '<td style="text-align: center" width="7%"">'+(i+1)+'</td>' +
                        '<td style="text-align: center" width="18%" title="' + data[i].proName + '">' + data[i].proName + '</td>' ;
                       if(data[i].transFlag=="1"){
                           str+='<td style="text-align: center" width="10%"><fmt:message code="vote.th.user" /></td>' ;
                       }else{
                           str+='<td style="text-align: center" width="10%"><fmt:message code="vote.th.borrow" /></td>' ;
                       }
                        str+='<td style="text-align: center" width="15%">' + data[i].borrowerName + '</td>' +
                        '<td style="text-align: center" width="7%">' + data[i].transQty + '</td>' +
                        '<td style="text-align: center" width="15%">' + data[i].transDate + '</td>' ;
                        str+='<td style="text-align: center" width="10%">' + data[i].remark + '</td>' ;

                        str+='<td style="text-align: center" width="10%"><a href="javascript:;" style="" onclick="approval(1,'+data[i].transId+')"><fmt:message code="meet.th.Approval" /></a> &nbsp;<a href="javascript:;" style="" onclick="approval(2,'+data[i].transId+')"><fmt:message code="meet.th.NotApprove" /></a></td>' ;

                        str+='</tr>';
                }
                $("#already tbody").html(str);
            }
        });
    }

    //批准和不批准操作
    function approval(status,id) {
        $.ajax({
            url: '/officetransHistory/upTransHistoryState',
            type: 'get',
            dataType: 'json',
            data: {
                transState:status,
                transId:id
            },
            success: function (obj) {
                if(obj.flag){
                    layer.msg('<fmt:message code="meet.th.SuccessfulApproval" />', { icon:6});
                    queryNoApprove();
                }else{
                    layer.msg('<fmt:message code="event.th.ApprovalFailure" />', { icon:2});
                }
            }
        })
    }

</script>
</body>
</html>
