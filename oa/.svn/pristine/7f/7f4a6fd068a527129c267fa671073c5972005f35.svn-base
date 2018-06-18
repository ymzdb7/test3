<%--
  Created by IntelliJ IDEA.
  User: liruixu
  Date: 2017/6/14
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="sys.th.addQuan" /></title>
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.min.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script src="/js/UserPriv/modifyThePermissions.js"></script>
    <style>
        input{
            vertical-align: text-bottom;
        }
        .TableContentTwo>td{
            padding-right: 5px;
        }
        input[type=checkbox]{
            padding: 0 !important;
        }
        .TableBlock td{
            padding: 5px;
        }
        .TableHeader{
            background: #ccebff;
            font-weight: bold;
        }
        .navigation{
            margin-top:47px;
        }
    </style>
</head>
<body >
    <div id="north">

        <div class="head w clearfix">
            <ul class="index_head clearfix">
                <li data_id="0">
                <span class="headli1_1">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="roleAuthorization" ><fmt:message code="roleAuthorization.th.RoleMmanagement" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>

                <li>
                <span class="headli1_1 ">
                    <a onclick="jump(this)" href="javascript:void(0)" data-Url="newRole" ><fmt:message code="roleAuthorization.th.NewRole" /></a></span>
                    <img src="../img/twoth.png" alt="" class="headli1_2">
                </li>
                <li data_id="1">
                  <span class="headli1_1">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="adjustTheRole" ><fmt:message code="roleAuthorization.th.AdjustRoleSorting" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>
                <li data_id="1">
                  <span class="headli1_1 one">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="modifyThePermissions?0" ><fmt:message code="roleAuthorization.th.Add-delete" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>
                <li data_id="1">
                  <span class="headli1_1">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="theAuxiliaryRole" ><fmt:message code="roleAuthorization.th.Add-remove" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>
                <li data_id="1">
                  <span class="headli1_1">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="superPassword" ><fmt:message code="roleAuthorization.th.SuperPasswordSettings" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>
                <li data_id="1">
                  <span class="headli1_1">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="theHumanResources" ><fmt:message code="roleAuthorization.th.HR" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>
            </ul>
        </div>
    </div>
    <div class="navigation  clearfix">
        <div class="left">
            <img src="../img/icon_addrole_06.png" alt="">
            <div class="news"><fmt:message code="roleAuthorization.th.Add-delete" /></div>
        </div>
        <div style="float: right;margin-top: 18px;">
            <input type="button" class="import btntrue" value='<fmt:message code="global.lang.ok" />'>
            <input type="button" style="margin-left: 10px" class="backCanBtn" onclick="history.back()" value='<fmt:message code="notice.th.return" />'>
        </div>
    </div>

    <table class="TableBlockthree" width="100%" align="center">
        <form method="post" name="form1" action="add_remove_priv.php"></form>
        <tbody><tr class="TableData">
            <td nowrap="" width="80"><b><fmt:message code="notice.th.operation" />：</b></td>
            <td>
                <input type="radio" name="OPERATION" value="0" id="OPERATION0" checked=""><label for="OPERATION0"><fmt:message code="netdisk.th.addpermission" /></label>
                <input type="radio" name="OPERATION" value="1" id="OPERATION1"><label for="OPERATION1"><fmt:message code="main.th.DeletePermissions" /></label>
            </td>
        </tr>
        <tr class="TableData">
            <td nowrap=""><b><fmt:message code="userManagement.th.role" />：</b></td>
            <%--<a href="javascript:select_all();"><u>全选</u></a>--%>
            <td class="newrole">
                <input type="radio" name="USER_PRIV" value="19" id="USER_PRIV19"><label for="USER_PRIV19">aa</label>&nbsp;
            </td>
        </tr>
        <input type="hidden" name="USER_PRIV_STR" value="">
        <input type="hidden" name="FUNC_ID_STR" value="">

        </tbody>
    </table>
    <table border="0" cellspacing="0" class="small" cellpadding="3" align="left">
        <tbody>
        <tr class="TableContentTwo">

        </tr>
        </tbody>
    </table>
    <script>

    </script>
</body>
</html>
