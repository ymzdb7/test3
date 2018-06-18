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
    <title><fmt:message code="vote.th.OfficeSupp" /></title>
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
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/bangongfafang.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="vote.th.OfficeSupp" />
    </div>
</div>
<div class="main">
    <div class="byDepart">
        <div class="queryConditon">
            <span><fmt:message code="sup.th.Applicant" />：</span>
            <textarea name="txt" id="borrower" class="borrower" user_id="" value="" dataid="" disabled style="min-width: 160px;height:30px;"></textarea>
            <a href="javascript:;" id="addBorrower"><fmt:message code="global.lang.add" /></a><a href="javascript:;" id="clearBorrower"><fmt:message code="global.lang.empty" /></a>
            <span style="margin-left: 1%;"><fmt:message code="notice.th.state" />：</span>
            <select id="grantStatus">
                <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                <option value="0"><fmt:message code="vote.th.Untreated" /></option>
                <option value="1"><fmt:message code="vote.th.Processed" /></option>
            </select>
            <span style="margin-left: 2%;"><fmt:message code="hr.th.DateOfApplication" />：</span>
            <input type="text" name="transBeginDate" id="transBeginDate" onclick="laydate(start)" style="width: 170px">
            <span style="margin: 0 5px;"><fmt:message code="global.lang.to" /></span>
            <input type="text" name="transEndDate" id="transEndDate" onclick="laydate(end)" style="width: 170px">
            <span class="btnSpan" id="query" onclick="queryRelease()"><fmt:message code="global.lang.query" /></span>
            <span class="btnSpan" id="clearCondition"><fmt:message code="workflow.th.Reset" /></span>
        </div>
        <div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table class="listShow">
                <thead>
                <tr>
                    <th style="text-align: center" width="7%"><fmt:message code="workflow.th.Serial" /></th>
                    <th style="text-align: center" width="18%"><fmt:message code="vote.th.OfficeName" /></th>
                    <th style="text-align: center" width="10%"><fmt:message code="vote.th.Registration" /></th>
                    <th style="text-align: center" width="15%"><fmt:message code="sup.th.Applicant" /></th>
                    <th style="text-align: center" width="7%"><fmt:message code="event.th.Number" /></th>
                    <th style="text-align: center" width="15%"><fmt:message code="hr.th.DateOfApplication" /></th>
                    <th style="text-align: center" width="15%"><fmt:message code="event.th.ApprovalStatus" /></th>
                    <th style="text-align: center" width="15%"><fmt:message code="notice.th.state" /></th>
                   <%-- <th style="text-align: center" width="15%">操作人</th>--%>
                    <th style="text-align: center" width="10%"><fmt:message code="journal.th.Remarks" /></th>
                    <th style="text-align: center" width="7%"><fmt:message code="menuSSetting.th.menuSetting" /></th>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script>
    var user_id='';
    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var end = {
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    //申请人的添加
    $("#addBorrower").on("click",function(){//选人员控件
        user_id='borrower';
        $.popWindow("../common/selectUser?0");
    });
    $('#clearBorrower').click(function(){ //清空人员
        $('#borrower').attr('user_id','');
        $('#borrower').attr('dataid','');
        $('#borrower').val('');
    });


    $(function () {
        //列表显示
        queryRelease();

    })

    function queryRelease() {
        //列表显示
        $.ajax({
            url: '/officetransHistory/selGrantByCond',
            type: 'get',
            data:{
                borrower:$("#borrower").attr("user_id"),
                grantStatus:$("#grantStatus").val(),
                transBeginDate:$("#transBeginDate").val(),
                transEndDate:$("#transEndDate").val()
            },
            dataType: 'json',
            success: function (obj) {
                var data = obj.obj;
                var str = "";
                for (var i = 0; i < data.length; i++) {
                    str += '<tr>' +
                        '<td style="text-align: center" width="7%"">'+(i+1)+'</td>' +
                        '<td style="text-align: center" width="18%" title="' + data[i].proName + '">' + data[i].proName + '</td>' ;
                       if(data[i].transFlag==1){
                           str+='<td style="text-align: center" width="10%"><fmt:message code="vote.th.user" /></td>' ;
                       }else{
                           str+='<td style="text-align: center" width="10%"><fmt:message code="vote.th.borrow" /></td>' ;
                       }
                        str+='<td style="text-align: center" width="15%">' + data[i].borrowerName + '</td>' +
                        '<td style="text-align: center" width="7%">' + data[i].transQty + '</td>' +
                        '<td style="text-align: center" width="15%">' + data[i].transDate + '</td>' ;
                        if(data[i].transState=="1"){
                            str+='<td style="text-align: center" width="10%"><fmt:message code="meet.th.Ratified" /></td>' ;
                        }else{
                            str+='<td style="text-align: center" width="10%"></td>' ;
                        }
                        if(data[i].grantStatus=="0"){
                            str+='<td style="text-align: center" width="15%"><fmt:message code="vote.th.WaitDistribution" /></td>' ;
                        }else{
                            str+='<td style="text-align: center" width="15%"><fmt:message code="vote.th.AlreadyIssued" /></td>' ;
                        }
                       /* if(data[i].grantStatus=="0"){
                            str+= '<td style="text-align: center" width="15%">' + data[i].statusName + '</td>' ;
                        }else{
                            str+= '<td style="text-align: center" width="15%">' + data[i].statusName + '</td>' ;
                        }*/
                        str+='<td style="text-align: center" width="10%">' + data[i].remark + '</td>' ;
                        if(data[i].grantStatus=="0"){
                            str+='<td style="text-align: center" width="7%"><a href="javascript:;" style="" onclick="productRelease('+ data[i].transId+')"><fmt:message code="vote.th.grant" /></a></td>' ;
                        }else{
                            str+='<td style="text-align: center" width="7%"><fmt:message code="vote.th.AlreadyIssued" /></td>' ;
                        }
                        str+='</tr>';
                }
                $("#already tbody").html(str);
            }
        });
    }

    $("#clearCondition").click(function () {
        $('#borrower').attr('user_id','');
        $('#borrower').attr('dataid','');
        $('#borrower').val('');
        $("#grantStatus").val("");
        $("#transBeginDate").val("");
        $("#transEndDate").val("");
    })

    function productRelease(id) {
        $.ajax({
            url: '/officetransHistory/upGrantStatus',
            type: 'get',
            data: {
                transId:id,
                grantStatus: 1,
            },
            dataType: 'json',
            success: function (obj) {
                if(obj.flag == true){
                    layer.msg('<fmt:message code="vote.th.Success" />', { icon:6});
                    queryRelease();
                }else{
                    layer.msg('<fmt:message code="vote.th.Failure" />', { icon:2});
                }
            }
        })
    }
</script>
</body>
</html>
