<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><fmt:message code="mian.panel" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="/css/sys/url.css"/>

    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="../js/sys/userInfor.js" type="text/javascript" charset="utf-8"></script>--%>
    <style>
        #submit{
            margin-bottom: 2px;
            border: none;
        }
        .btn input{
            padding: 2px 10px;
            border-radius: 5px;
            border-width: 1px;
            border-style: solid;
        }
        .content{
            background-color: #ffffff;
        }
        .content .right{
            width: 100%;
        }
        .colo{
            background: #e8f4fc;
            color: #313131;
            text-align: left;
        }
        table.table tr {
            border: none;
        }
        table.table tr.padstyle td {
            padding-top: 40px;
        }
        table.table tr th {
            border-right: none;
            padding: 0px 0px 0px 43px;
            height:36px;
        }
        table.table tr td {
            border-right: none;
            padding: 10px;
        }
        table.table tr td span {
            color:#999;
        }
        table.table tr td:first-of-type {
            text-align: right;
            width: 30%;
            font-weight:bold;
        }
        table.table tr td:last-of-type {
            padding-left: 20px;
        }
        table.table {
            width: 100%;
            margin: 0px auto;
            font-size: 14px;
            margin-bottom: 40px;
        }
        table.table tr td input[type="checkbox"]{
            margin-left: 10px;
            margin-right: 5px;
        }
        .title{
            height:35px;
            line-height:35px;
        }
        .title span{
            margin-left:0px;
            font-size:22px;
            line-height:35px;
        }
        .title img{
            margin-left:15px;
            vertical-align: middle;
            width:24px;
            height:26px;
            padding-bottom:8px;
        }


        table.table tr td input[type="text"] {
            width: 200px;
            height: 28px;

        }

        table.table tr .red_text{
            text-align: right;
            width: 30%;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="right">
        <div class="title">
            <img src="../img/mycount.png" alt="我的OA账户">
            <span><fmt:message code="url.th.mycount" /></span>
        </div>
        <div class="main" style="...">
            <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                <tr class="colo" align="center">
                    <th colspan="2">
                        <span style="font-weight: bold"><fmt:message code="url.th.AccountInformation" /></span>
                    </th>
                </tr>
                <tr class="padstyle">
                    <td class="red_text"><fmt:message code="userName" />:</td>
                    <td>
                        <input type="text" id="byname" name="byname" class="byname" disabled="disabled" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <div class="btn" style="margin-left: 0px">
                          <%--  <input id="submit" class="submit" type="button" value="保存修改">--%>
                            <%--<input id="submit" style="color: black " type="button" class="inpuBtn backOkBtn"  value="&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="global.lang.save" />">--%>
                        </div>
                    </td>
                </tr>
            </table>
        </div>
        <div class="main" style="...">
            <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                <tr class="colo" align="center">
                    <th colspan="2">
                        <span style="font-weight: bold"><fmt:message code="url.th.UserRole" /></span>
                    </th>
                </tr>
                <tr class="padstyle">
                    <td class="red_text"><fmt:message code="url.th.Leading" />:</td>
                    <td class="userPrivZhu">

                    </td>
                </tr>
                <tr>
                    <td class="red_text"><fmt:message code="url.th.AuxiliaryRole" />:</td>
                    <td class="userPrivOthers">

                    </td>
                </tr>
            </table>
            <div class="main" style="...">
                <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                    <tr  class="colo" align="center">
                        <th colspan="2">
                            <span style="font-weight: bold"><fmt:message code="url.th.SystemUsePermission" /></span>
                        </th>
                    </tr>
                    <tr class="padstyle">
                        <td class="red_text"><fmt:message code="url.th.accessControl" />:</td>
                        <td>
                            <input type="checkbox" disabled><fmt:message code="url.th.ViewNotAllowed" />
                            <input type="checkbox" disabled><fmt:message code="url.th.DisableDisplay" />
                            <input type="checkbox" disabled><fmt:message code="url.th.LogKEY" />
                            <input type="checkbox" disabled><fmt:message code="url.th.NoLogin" />
                        </td>
                    </tr>
                    <tr>
                        <td class="red_text"><fmt:message code="url.th.ContentMailbox" />:</td>
                        <td>
                            <fmt:message code="url.th.Unrestricted" />
                        </td>
                    </tr>
                    <tr>
                        <td class="red_text"><fmt:message code="url.th.PersonalCapacity" />:</td>
                        <td>
                            <fmt:message code="url.th.Unrestricted" />
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
<script>
    $(function() {
        $.ajax({
            type: "get",
            url: "<%=basePath%>getLoginUser",
            dataType: 'json',
            success: function (obj) {
                if(obj.flag){
                    $('#byname').val(obj.object.byname);
                    $('#byname').attr('userId',obj.object.userId)
                    $('.userPrivZhu').text(obj.object.userPrivName);
                    $('.userPrivOthers').text(obj.object.userPrivOtherName);
                }

            },
        })
        $('#submit').click(function () {
            var data={
                byname:$('#byname').val(),
                userId:$('#byname').attr('userId')
            };
            $.ajax({
                type: "get",
                url: "<%=basePath%>user/editUser",
                dataType: 'json',
                data:data,
                success: function (obj) {
                    $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />！',icon:1},function(){
                        console.log(obj);
                    });
                },
            });
        })


    })
</script>
</body>
</html>

