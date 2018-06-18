<%--
  Created by IntelliJ IDEA.
  User: liruixu
  Date: 2017/6/14
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="user.th.AddRoles" /></title>
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">

    <style>
        .TableData input{
            vertical-align: middle;
        }
    </style>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.min.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>

    <script src="/js/UserPriv/theAuxiliaryRole.js"></script>
</head>
<body>
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
                  <span class="headli1_1">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="modifyThePermissions?0" ><fmt:message code="roleAuthorization.th.Add-delete" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>
                <li data_id="1">
                  <span class="headli1_1 one">
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
    <div class="navigation  clearfix" style="margin-top: 43px;">
        <div class="left">
            <img src="../img/icon_addrole_06.png" alt="">
            <div class="news"><fmt:message code="roleAuthorization.th.Add-remove" /></div>
        </div>
    </div>
    <table class="tr_td" width="560" align="center">
        <tbody><tr class="TableData">
            <td nowrap="" width="80"><fmt:message code="notice.th.operation" />：</td>
            <td>
                <input type="radio" name="OPERATION" value="1" id="OPERATION0" checked=""><label for="OPERATION0"><fmt:message code="user.th.AddRoles" /></label>
                <input type="radio" name="OPERATION" value="0" id="OPERATION1"><label for="OPERATION1"><fmt:message code="sys.th.delRole" /></label>
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableData"><fmt:message code="diary.th.body" />：</td>
            <td class="TableData">
                <input type="hidden" name="TO_ID" value="">
                <textarea cols="50" name="TO_NAME" rows="4" id="BigStatic" class="BigStatic" wrap="yes" readonly=""></textarea>
                <a href="javascript:;" class="orgAdd" ><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" class="orgClear" ><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr class="TableData">
            <td nowrap=""><fmt:message code="userManagement.th.role" />：
                <%--<a href="javascript:select_all();"><u>全选</u></a>--%>
            </td>
            <td class="tadata">
                <label for="USER_PRIV19"><input type="checkbox" name="USER_PRIV" value="19" id="USER_PRIV19">aa</label>&nbsp;
                <label for="USER_PRIV19"><input type="checkbox" name="USER_PRIV" value="19" id="USER_PRIV19">aa</label>&nbsp;
                <label for="USER_PRIV19"><input type="checkbox" name="USER_PRIV" value="19" id="USER_PRIV19">aa</label>&nbsp;


            </td>
        </tr>
        <tr class="TableControl">
            <td colspan="2" align="center">
                <input type="button" value='<fmt:message code="global.lang.ok" />' class="import" >
            </td>
        </tr>
        <input type="hidden" name="USER_PRIV_STR" value="">
        <input type="hidden" name="DEPT_ID" value="">

        </tbody>
    </table>
    <p style="width: 565px;margin: 20px auto;color: red"><fmt:message code="sys.th.toplis" /></p>



    <script>
        function jump(me){
            parent.newjump($(me).attr('data-Url'))
        }
    </script>
</body>
</html>
