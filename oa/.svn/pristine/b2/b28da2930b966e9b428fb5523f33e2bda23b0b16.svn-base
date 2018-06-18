<%--
  Created by IntelliJ IDEA.
  User: liruixu
  Date: 2017/6/13
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="main.roleandpriv" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.min.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/js/UserPriv/roleAuthorization.js"></script>
    <style>
        .headDiv {

            background: #f5f5f5;
            width: 100%;
            height: 45px;
            border-bottom: #999 1px solid;
            overflow: hidden;
        }
        .div_Img {
            float: left;
            width: 23px;
            height: 100%;
            margin-left: 30px;
        }
        .div_Img img {
            width: 23px;
            height: 23px;
            margin-top: 11px;
        }
        .divP {
            float: left;
            height: 45px;
            line-height: 45px;
            font-size: 22px;
            margin-left: 10px;
            color: #494d59;
        }
        .big3{
              margin-left: 5px;
              font-family: "微软雅黑";
              font-size: 20px;
              color: #494d59;
              FONT-WEIGHT: normal;
        }
        .Big img{
            float: left;
            margin-top: 3px;
            margin-right: 5px;
            padding-left: 20px;
        }
        .head li{
            margin-left: 15px;
        }
        .head .headli1_2{
            margin-left: 15px;
        }
        .layui-layer{
            top:200px!important;
        }
    </style>
</head>
<body>
    <div id="loginAdmin">
        <input name="username" value="${sign}" type="hidden" />
        <%--<div class="navigation  clearfix" style="margin-top:0;">--%>
            <%--<div class="left">--%>
                <%--<img src="../img/key_03.png" alt="">--%>
                <%--<div class="news"><fmt:message code="roleAuthoorization.th.EnterSuperPassword" /></div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="headDiv">
            <div class="div_Img">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/key_03.png" style="vertical-align: middle;" alt="输入超级密码">
            </div>
            <div class="divP"><fmt:message code="roleAuthoorization.th.EnterSuperPassword" /></div>
        </div>
        <table class="tr_td" width="50%" align="center" style="margin-top: 20px">
            <tbody>
                <tr>
                    <td class="th" colspan="2">
                        <b><fmt:message code="roleAuthorization.th.Explain" />：</b>

                        <fmt:message code="sys.th.superPassword" />

                    </td>
                </tr>
                <tr>
                    <td class="TableContent" style="width: 25%">
                     <fmt:message code="roleAuthorizzation.th.PleaseEnter" />：
                    </td>
                    <td class="TableData">
                        <input style="margin-left: 10px;" placeholder="<fmt:message code="roleAuthorizzation.th.PleaseEnter" />" type="password" id="super_pass" name="super_pass" class="inp" size="30" ><span class="super_pass_msg"></span>
                    </td>
                </tr>
                <td nowrap="" style="padding: 7px;" align="center" colspan="2">
                    <input class="import"  type="button" value="<fmt:message code="global.lang.ok" />">
                </td>
            </tbody>
        </table>
    </div>
    <div id="north" style="display: none">
        <div class="head w clearfix">
            <ul class="index_head clearfix">
                <li data_id="0">
                <span class="headli1_1 one">
                <a onclick="jump(this)" href="javascript:void(0)" data-Url="roleAuthorization" ><fmt:message code="roleAuthorization.th.RoleMmanagement" /></a>
                </span><img class="headli1_2" src="../img/twoth.png" alt="">
                </li>

                <li>
                <span class="headli1_1 ">
                    <a onclick="jump(this)" href="javascript:void(0)" data-Url="newRole?0" ><fmt:message code="roleAuthorization.th.NewRole" /></a></span>
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
    <div id="hiddenMain" class="clearfix" style="display: none">

        <div class="mainAdmin clearfix" >
            <div class="mainLeft" style="display: none">
                <div class="cont_left" id="cont_left">
                    <ul>
                        <li class="dept_li liUp" id="dept_lis"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_sectorList.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="部门列表"><fmt:message code="depatement.th.depa" /></li>
                        <li class="pick" style="display: none;">
                            <ul class="tab_ctwo a" id="deptOrg"><li><span deptid="30" class="childdept"><span class=""></span><a href="#" class="dynatree-title" title="北京公司"><fmt:message code="roleAuthorization.th.BJ" /></a></span><ul style="margin-left:10%;display:block;" id="dpetWhole"><li><span deptid="1" class="childdept"><span></span><img src="../img/main_img/company_logo.png" alt=""><a href="#" class="dynatree-title" title="董事会"><fmt:message code="roleAuthorization.th.Board" /></a></span><ul style="margin-left:10%;display:none;"></ul></li><li><span deptid="2" class="childdept"><span></span><img src="../img/main_img/company_logo.png" alt=""><a href="#" class="dynatree-title" title="管理部"><fmt:message code="roleAuthorization.th.ManagementDepartment" /></a></span><ul style="margin-left:10%;display:none;"></ul></li><li><span deptid="3" class="childdept"><span></span><img src="../img/main_img/company_logo.png" alt=""><a href="#" class="dynatree-title" title="市场部"><fmt:message code="roleAuthorization.th.MarketingDepartment" /></a></span><ul style="margin-left:10%;display:none;"></ul></li><li><span deptid="4" class="childdept"><span></span><img src="../img/main_img/company_logo.png" alt=""><a href="#" class="dynatree-title" title="销售部"><fmt:message code="roleAuthorization.th.SalesDepartment" /></a></span><ul style="margin-left:10%;display:none;"></ul></li><li><span deptid="15" class="childdept"><span></span><img src="../img/main_img/company_logo.png" alt=""><a href="#" class="dynatree-title" title="技术部"><fmt:message code="roleAuthorization.th.TechnologyDepartment" /></a></span><ul style="margin-left:10%;display:none;"></ul></li></ul></li></ul>
                        </li>
                        <li class="liUp dept_li"><img src="../img/sys/icon_departingStaff.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="离职人员/外部人员"><fmt:message code="userManagement.th.Outgoing" /></li>
                        <li class="liUp dept_li"><img src="../img/sys/icon_publicCustomGroup.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="公共自定义组"><fmt:message code="roleAuthorization.th.PublicCustom" /></li>
                        <li class="liUp dept_li"><img src="../img/sys/icon_fixDepartmentLevel.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="修正部门级别"><fmt:message code="roleAuthorization.th.FixDepartmentLevel" /></li>

                    </ul>
                </div>
            </div>
            <div class="mainRight" style="padding-top: 5px;margin-top: 47px">
                <table border="0" width="100%" cellspacing="0" cellpadding="3" class="tr_td ">
                    <tbody><tr style="border: none">
                        <td class="Big">
                            <img src="/img/icon_rolemanage_06.png"  align="absmiddle">
                            <span class="big3"> <fmt:message code="roleAuthorization.th.RoleMmanagement" /></span>
                            &nbsp;&nbsp;        </td>

                        <td align="right" style="position: relative">
                            <form action="/inputUserPriv" id="fileload" enctype="multipart/form-data" method ="post">
                                <%--<input type="file" name="file">--%>
                                <%--<input type="submit">--%>
                                <input type="button" value="<fmt:message code="workflow.th.Import" />" class="exportsss"  title="导入角色">&nbsp;&nbsp;
                            <input type="file" name="file" class="fileload" onchange="filechang()">

                            <%--<input type="button" value="<fmt:message code="global.lang.report" />" class="BigButton"  title="导出角色">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                            <a href="/outputUserPriv" style="display: inline-block"  class="importTwo"><fmt:message code="global.lang.report" /></a>
                            </form>
                        </td>

                    </tr>
                    </tbody>
                </table>
                <div align="center">
                    <table id="table_style" width="96%" class="tr_td trtd_d">
                        <thead class="TableHeader">
                        <tr><td nowrap="" class="th" align="center"><fmt:message code="roleAuthorization.th.RoleSortingNumber" /></td>
                            <td nowrap="" class="th" align="center"><fmt:message code="roleAuthorization.th.RoleName" /></td>
                            <%--<td nowrap="" class="th"  align="center"><fmt:message code="workflow.th.sector" /></td>--%>
                            <td nowrap="" class="th" align="center"><fmt:message code="roleAuthorization.th.TotalNumber" /></td>
                            <td nowrap="" class="th" align="center"><fmt:message code="notice.th.operation" /></td>
                        </tr></thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <script>
        function jump(me){
            parent.newjump($(me).attr('data-Url'));

        }
    </script>
</body>
</html>
