<%--
  Created by IntelliJ IDEA.
  User: gaosubo
  Date: 2017/6/13
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title><fmt:message code="netdisk.th.Managing" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../css/base.css">
    <link rel="stylesheet" href="../../css/netdesk/netdesksetting.css">
    <style>
        .layui-layer-title{
            color:#fff!important;
        }
        .power_t{
            height: 45px;
        }
        .power_list{
            height: 30px;
            line-height:30px;
            width: auto;
            padding: 0 20px;
            margin-top: 7px;
        }
        .share_t{
            height: 70px;
            line-height: 70px;
            /*margin-top:30px;*/
            margin-left: 30px;
            margin-bottom: 0;
        }
        .power_des {
            position: relative;
            height: 70px;
            line-height: 24px;
        }
        .newtory {
            float: right;
            border: 1px solid #e5e5e5;
            padding: 3px 5px;
            border-radius: 4px;
            background: #fafafa;
            font-size: 14px;
            color: #333;
        }
        .power_t>li {
            height: 100%;
            line-height: 45px;
        }
        .access{
            margin-right: 30px;
        }
        .power_stage{
            position: absolute;
            top: 25px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="netdiskPar">
    <caption class="clearfix">
        <span class="share_t" style="    height: 70px;line-height: 70px;">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/wangluo.png" style="margin-right: 15px;" alt=""><fmt:message code="netdisk.th.Managing" />
        </span>
        <a href="javascript:void (0)" class="newtory" id="newtory" style="margin-top: 22px;margin-right: 30px;"><img style="margin-right: 4px;margin-left: -22px;margin-bottom: 2px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="netdisk.th.NewSharedDirectory" /></a>
    </caption>
    <input type="hidden" id="diskId">
    <table class="netdisk" cellspacing="0" id="netdisk">
    </table>
</div>

<div class="con">
    <div class="list_p">
        <ul class="power_t clearfix">
            <li>
                <a href="javascript:void(0)" class="power_list power_bg"><fmt:message code="netdisk.th.AccessAuthority" /></a>
                <img src="../../img/twoth.png" alt="">
            </li>
            <li><a href="javascript:void(0)" class="power_list"><fmt:message code="workflow.th.privilege" /></a>
                <img src="../../img/twoth.png" alt=""></li>
            <li>
                <a href="javascript:void(0)" class="power_list"><fmt:message code="netdisk.th.NewPermissions" /></a>
                <img src="../../img/twoth.png" alt="">
            </li>
            <li>
                <a href="javascript:void(0)" class="power_list"><fmt:message code="netdisk.th.Download-print" /></a>
                <img src="../../img/twoth.png" alt="">
            </li>
            <li><a href="javascript:void(0)" class="power_list"><fmt:message code="netdisk.th.BatchSettings" /></a></li>
        </ul>
    </div>

    <div class="con_item">

        <%--/*****************************************************************item_1****************************************************************--%>
        <div class="item item_1">
            <div class="power_des">
                <span class="share_t"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/fangwenquanxian.png" style="margin-right: 15px;" alt=""><fmt:message code="netdisk.th.SpecifiedPermissions" /></span>
                <span class="power_stage"><fmt:message code="netdisk.th.file1" /></span>
            </div>
            <div class="divtable">
                <table class="tr_td">
                    <thead>
                        <tr>
                            <th class="th"><fmt:message code="workflow.th.name" /></th>
                            <th class="th"><fmt:message code="notice.th.content" /></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.ScopeAuthorization" /></span>
                            </td>
                            <td>
                                <textarea name="txt" id="senddep" dept_id="admin" value="admin" class="sendsave senddep" disabled></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_dept1"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_dept1"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(role)" /></span>
                            </td>
                            <td>
                                <textarea name="txt" id="sendrole" priv_id="admin" value="admin" class="sendsave sendrole" disabled></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_role1"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_rloe_1"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(personnel)" /></span>
                            </td>
                            <td>
                                <textarea name="txt" id="senduser"  class="sendsave senduser" disabled></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="adduesr"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_user"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="bigButton access import" data-num="1" value="确定" id="btn_sure"><fmt:message code="global.lang.ok" /></button>
                                <button type="submit" class="bigButton btn_back import" value="返回"><fmt:message code="notice.th.return" /></button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <%--/*****************************************************************item_2****************************************************************--%>
        <div class="item">
            <div class="power_des">
                <span class="share_t"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/guanliquanxian.png" style="margin-right: 15px;" alt=""><fmt:message code="netdisk.th.SpecifiedPermissions" /></span>
                <span class="power_stage"><fmt:message code="netdisk.th.file2" /></span>
            </div>
            <div class="divtable">
                <table class="tr_td">
                    <thead>
                    <tr>
                        <th class="th"><fmt:message code="workflow.th.name" /></th>
                        <th class="th"><fmt:message code="notice.th.content" /></th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td> <span class="title_r"><fmt:message code="netdisk.th.ScopeAuthorization" /></span></td>
                            <td>
                                 <textarea name="txt" id="send_dept2" dept_id="admin" value="admin" disabled
                                           class="sendsave senddep"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_dept2"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_dept2"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(role)" /></span>
                            </td>
                            <td>
                                 <textarea name="txt" id="send_role2" priv_id="admin" value="admin" disabled
                                           class="sendsave sendrole"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_role2"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_role2"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(personnel)" /></span>
                            </td>
                            <td>
                                 <textarea name="txt" id="send_uesr2" user_id="admin" value="admin" disabled
                                           class="sendsave senduser"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_user2"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_user2"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="bigButton access import" data-num="2" value="确定" ><fmt:message code="global.lang.ok" /></button>
                                <button type="submit" class="bigButton btn_back import" value="返回"><fmt:message code="notice.th.return" /></button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <%--/*****************************************************************item_3****************************************************************--%>
        <div class="item">
            <div class="power_des">
                <span class="share_t"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/xinjianquanxian.png" style="margin-right: 15px;" alt=""><fmt:message code="netdisk.th.SpecifiedPermissions" /></span>
                <span class="power_stage"><fmt:message code="netdisk.th.file3" /></span>
            </div>
            <div class="divtable">
                <table class="tr_td">
                    <thead>
                    <tr>
                        <th class="th"><fmt:message code="workflow.th.name" /></th>
                        <th class="th"><fmt:message code="notice.th.content" /></th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.ScopeAuthorization" /></span>
                            </td>
                            <td>
                                    <textarea name="txt" id="send_dept3" dept_id="admin" value="admin" disabled
                                              class="sendsave senddep"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_dept3"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_dept3"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(role)" /></span>
                            </td>
                            <td>
                                 <textarea name="txt" id="send_role3" priv_id="admin" value="admin" disabled
                                           class="sendsave sendrole"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_role3"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_role3"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(personnel)" /></span>
                            </td>
                            <td>
                                    <textarea name="txt" id="send_user3" user_id="admin" value="admin" disabled
                                              class="sendsave senduser"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_user3"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_user3"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="bigButton access import" data-num="3" value="确定" ><fmt:message code="global.lang.ok" /></button>
                                <button type="submit" class="bigButton btn_back import" value="返回"><fmt:message code="notice.th.return" /></button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <%--/*****************************************************************item_4****************************************************************--%>
        <div class="item">
            <div class="power_des">
                <span class="share_t"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/wangluo.png" style="margin-right: 15px;" alt=""><fmt:message code="netdisk.th.SpecifiedPermissions" /></span>
                <span class="power_stage"><fmt:message code="netdisk.th.file4" /></span>
            </div>

            <div class="divtable">
                <table class="tr_td">
                    <thead>
                    <tr>
                        <th class="th"><fmt:message code="workflow.th.name" /></th>
                        <th class="th"><fmt:message code="notice.th.content" /></th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.ScopeAuthorization" /></span>
                            </td>
                            <td>
                                  <textarea name="txt" id="send_dept4" dept_id="admin" value="admin" disabled
                                            class="sendsave senddep"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_dept4"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_dept4"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(role)" /></span>
                            </td>
                            <td>
                                 <textarea name="txt" id="send_role4" priv_id="admin" value="admin" disabled
                                           class="sendsave sendrole"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_role4"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_role4"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r"><fmt:message code="netdisk.th.Scope(personnel)" /></span>
                            </td>
                            <td>
                                   <textarea name="txt" id="send_user4" user_id="admin" value="admin" disabled
                                             class="sendsave senduser"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_user4"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_user4"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="bigButton access import" data-num="4" value="确定" ><fmt:message code="global.lang.ok" /></button>
                                <button type="submit" class="bigButton btn_back import" value="返回"><fmt:message code="notice.th.return" /></button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <%--/*****************************************************************item_5****************************************************************--%>
        <div class="item">
            <div class="power_des">

                <span class="share_t"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/piliangshezhis.png" style="margin-right: 15px;" alt=""><fmt:message code="netdisk.th.BatchSettings" /></span>
                <span class="power_stage"><fmt:message code="netdisk.th.WorksOn" /></span>
            </div>

            <div class="divtable">
                <table class="tr_td">
                    <thead>
                    <tr>
                        <th class="th"><fmt:message code="workflow.th.name" /></th>
                        <th class="th"><fmt:message code="notice.th.content" /></th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <span class="title_r title_no"><fmt:message code="netdisk.th.ScopeAuthorization" /></span>
                            </td>
                            <td>
                                 <textarea name="txt" id="send_dept5"  value="admin" disabled
                                           class="sendsave senddep saveno"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_dept5"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_dept5"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r title_no"><fmt:message code="netdisk.th.Scope(role)" /></span>
                            </td>
                            <td>
                                  <textarea name="txt" id="send_role5"  value="admin" disabled
                                            class="sendsave sendrole saveno"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_role5"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_role5"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r title_no"><fmt:message code="netdisk.th.Scope(personnel)" /></span>
                            </td>
                            <td>
                                    <textarea name="txt" id="send_user5"  value="admin" disabled
                                              class="sendsave senduser saveno"></textarea>
                                <a style="margin-left: 10px;cursor: pointer" id="add_user5"><fmt:message code="global.lang.add" /></a>
                                <a style="margin-left: 10px;cursor: pointer" id="del_user5"><fmt:message code="global.lang.empty" /></a>
                            </td>
                        </tr>
                        <tr>
                            <td>  <span class="title_r title_no title_no_t"><fmt:message code="netdisk.th.OptionSetting" /></span></td>
                            <td>
                                <input type="checkbox" id="access"><span class="check_p"><fmt:message code="netdisk.th.AccessAuthority" /></span>
                                <input type="checkbox" id="download"><span class="check_p"><fmt:message code="netdisk.th.DownloadPermissions" /></span>
                                <input type="checkbox" id="mange"><span class="check_p"><fmt:message code="workflow.th.privilege" /></span>
                                <input type="checkbox" id="stamp"><span class="check_p"><fmt:message code="netdisk.th.Download-print" /></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="title_r title_no title_no_t"><fmt:message code="notice.th.operation" /></span>
                            </td>
                            <td>
                                <input type="radio" name="radio_c" checked><span class="add_mar"><fmt:message code="netdisk.th.addpermission" /></span>
                                <%--<input type="radio" name="radio_c"><span><fmt:message code="netdisk.th.RemovePermissions" /></span>--%>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="bigButton  import"value="确定" id="batch_btn" style="margin-right: 30px"><fmt:message code="global.lang.ok" /></button>
                                <button type="submit" class="bigButton btn_back import" value="返回"><fmt:message code="notice.th.return" /></button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            

        </div>
    </div>

</div>

</body>
<script src="../../js/jquery/jquery-1.9.1.js"></script>
<script src="../../lib/layer/layer.js"></script>
<script src="../../js/base/base.js"></script>
<script type="text/javascript">
    function netdiskQuery() {
        $.ajax({
            type: 'GET',
            url: '<%=basePath%>netdiskSettings/selectNetdiskSettings',
            dataType: 'json',
            success: function (data) {
                if (data.flag) {
                    var data = data.object;
                    var html = '<thead><tr><th class="check"><fmt:message code="workflow.th.Serial" /></th><th><fmt:message code="netdisk.th.DirectoryName" /></th><th><fmt:message code="netdisk.th.Directorypath" /></th>' +
                                    '<th><fmt:message code="netdisk.th.LimitedCapacity" /></th>' +
                                    '<th><fmt:message code="netdisk.th.undefand" /></th><th><fmt:message code="notice.th.operation" /></th></tr>' +
                                '</thead>';
                    var spaceLimit='';
                    var orderBy;
                    for (var i = 0; i < data.length; i++) {
                        /*容量*/
                        if (data[i].spaceLimit == 0) {
                            spaceLimit = "<fmt:message code="main.th.xian" />"
                        }else {
                            spaceLimit=data[i].spaceLimit
                        }
                        /*默认排序名称*/
                        if (data[i].orderBy == 'nom') {
                            orderBy = '<fmt:message code="main.th.name" />'
                        } else if (data[i].orderBy == 'taille') {
                            orderBy = '<fmt:message code="netdisk.th.Size" />'
                        } else if (data[i].orderBy == 'type') {
                            orderBy = '<fmt:message code="notice.th.type" />'
                        } else if (data[i].orderBy == 'mod') {
                            orderBy = '<fmt:message code="netdisk.th.Lastmodifiedtime" />'
                        }else {
                            orderBy='<fmt:message code="main.th.mo" />'
                        }
                        /*升序降序*/
                        var ascDesc;
                        if (data[i].ascDesc == 0) {
                            ascDesc = '<fmt:message code="netdisk.th.asc" />'
                        } else {
                            ascDesc = '<fmt:message code="netdisk.th.desc" />'
                        }
                        var datas = JSON.stringify(data[i]).replace(/"/g, "'");
                        html += '<tbody>' +
                            '<tr><td>' + data[i].diskNo + '</td><td class="manage">' + data[i].diskName + '</td><td class="management">' + data[i].diskPath + '</td>' +
                            '<td class="sector">' + spaceLimit + '</td><td class="">' + orderBy + "(" + ascDesc + ")" + '</td>' +
                            '<td class=""><a href="javascript:void(0)" class="save_a" id="editor"><input id="datahide"  type="hidden" value="' + datas + '"><fmt:message code="global.lang.edit" /></a>&nbsp; ' +
                            '<a href="javascript:void(0)" class="save_a" id="updete_d"><input id="datahide"  type="hidden" value="' + datas + '"><fmt:message code="global.lang.delete" /></a>&nbsp;' +
                            '<a href="javascript:void(0)" class="save_a powerset" id="powerset" ><input id="datahide"  type="hidden" value="' + datas + '"><fmt:message code="netdisk.th.PermissionSetting" /></a>&nbsp;' +
//                                '<a href="javascript:void(0)" class="save_a Menusave" >菜单定义指南</a>' +
                            '</td></tr>' +
                            '</tbody>';
                    }
                }
                $('#netdisk').html(html);
            }
        });
    }




    function clearData() {
        $('textarea').each(function () {
            $(this).val('');
            $(this).attr('deptid','')
            $(this).attr('user_id','')
            $(this).attr('userpriv','')
        })
        $('.divtable').find('input[type="checkbox"]').each(function () {
            $(this).prop('checked',false)
        })
    }

    function myrefresh() {
        window.location.reload();
    }
    //获取权限信息
    function getdiskinfor(diskId) {
        $.ajax({
            type: 'GET',
            url: '<%=basePath%>netdiskSettings/getNetiskBySortId',
            data:{
                diskId:diskId
            },
            dataType: 'json',
            success: function (data) {
                var userId = data.data.userId;
                $('#senddep').attr('deptid',userId.dept).val(userId.data.deptStr);
                $('#sendrole').attr('userpriv',userId.role).val(userId.data.roleStr);
                $('#senduser').attr('user_id',userId.user).val(userId.data.userStr);

                var manageUser = data.data.manageUser;
                $('#send_dept2').attr('deptid',manageUser.dept).val(manageUser.data.deptStr);
                $('#send_role2').attr('userpriv',manageUser.role).val(manageUser.data.roleStr);
                $('#send_uesr2').attr('user_id',manageUser.user).val(manageUser.data.userStr);

                var newUser = data.data.newUser;
                $('#send_dept3').attr('deptid',newUser.dept).val(newUser.data.deptStr);
                $('#send_role3').attr('userpriv',newUser.role).val(newUser.data.roleStr);
                $('#send_user3').attr('user_id',newUser.user).val(newUser.data.userStr);

                var downUser = data.data.downUser;
                $('#send_dept4').attr('deptid',downUser.dept).val(downUser.data.deptStr);
                $('#send_role4').attr('userpriv',downUser.role).val(downUser.data.roleStr);
                $('#send_user4').attr('user_id',downUser.user).val(downUser.data.userStr);
            }
        });
    }
    $(function () {
        /*数据查询*/
        netdiskQuery();
        /*人员部门角色控件*/
        $("#add_dept1").click(function () {
            dept_id = 'senddep';
            $.popWindow("../common/selectDept");
        });
        /*$('#del_dept').click(function () {
            $('#senddep').val(null);
        });*/
        $('#del_dept1').click(function () {
            $('#senddep').val(null);
            $('#senddep').attr('deptid','');
        });

        $("#add_role1").click(function () {
            priv_id = 'sendrole';
            $.popWindow("../common/selectPriv");
        });

        $('#del_rloe_1').click(function () {
            $('#sendrole').val(null);
            $('#sendrole').attr('userpriv','');
        });

        $("#adduesr").click(function () {
            user_id = 'senduser';
            $.popWindow("../common/selectUser");
        });
        $('#del_user').click(function () {
            $('#senduser').val(null);
            $('#senduser').attr('user_id','');
        });

        $("#add_dept2").click(function () {
            dept_id = 'send_dept2';
            $.popWindow("../common/selectDept");
        });
        $('#del_dept2').click(function () {
            $('#send_dept2').val(null);
            $('#send_dept2').attr('deptid','');
        });

        $("#add_role2").click(function () {
            priv_id = 'send_role2';
            $.popWindow("../common/selectPriv");
        });
        $('#del_role2').click(function () {
            $('#send_role2').val(null);
            $('#send_role2').attr('userpriv','');
        });

        $("#add_user2").click(function () {
            user_id = 'send_uesr2';
            $.popWindow("../common/selectUser");
        });
        $('#del_user2').click(function () {
            $('#send_uesr2').val(null);
            $('#send_uesr2').attr('user_id','');
        });

        $("#add_dept3").click(function () {
            dept_id = 'send_dept3';
            $.popWindow("../common/selectDept");
        });
        $('#del_dept3').click(function () {
            $('#send_dept3').val(null);
            $('#send_dept3').attr('deptid','');
        });

        $("#add_role3").click(function () {
            priv_id = 'send_role3';
            $.popWindow("../common/selectPriv");
        });
        $('#del_role3').click(function () {
            $('#send_role3').val(null);
            $('#send_role3').attr('userpriv','');
        });

        $("#add_user3").click(function () {
            user_id = 'send_user3';
            $.popWindow("../common/selectUser");
        });
        $('#del_user3').click(function () {
            $('#send_user3').val(null);
            $('#send_uesr3').attr('user_id','');
        });

        $("#add_dept4").click(function () {
            dept_id = 'send_dept4';
            $.popWindow("../common/selectDept");
        });
        $('#del_dept4').click(function () {
            $('#send_dept4').val(null);
            $('#send_dept4').attr('deptid','');
        });

        $("#add_role4").click(function () {
            priv_id = 'send_role4';
            $.popWindow("../common/selectPriv");
        });
        $('#del_role4').click(function () {
            $('#send_role4').val(null);
            $('#send_role4').attr('userpriv','');
        });

        $("#add_user4").click(function () {
            user_id = 'send_user4';
            $.popWindow("../common/selectUser");
        });
        $('#del_user4').click(function () {
            $('#send_user4').val(null);
            $('#send_uesr5').attr('user_id','');
        });

        $("#add_dept5").click(function () {
            dept_id = 'send_dept5';
            $.popWindow("../common/selectDept");
        });
        $('#del_dept5').click(function () {
            $('#send_dept5').val(null);
            $('#send_dept5').attr('deptid','');
        });

        $("#add_role5").click(function () {
            priv_id = 'send_role5';
            $.popWindow("../common/selectPriv");
        });
        $('#del_role5').click(function () {
            $('#send_role5').val(null);
            $('#send_role5').attr('userpriv','');
        });

        $("#add_user5").click(function () {
            user_id = 'send_user5';
            $.popWindow("../common/selectUser");
        });
        $('#del_user5').click(function () {
            $('#send_user5').val(null);
            $('#send_uesr5').attr('user_id','');
        });

        $('.power_list').click(function () {
            $('.power_list').removeClass('power_bg')
            $(this).addClass('power_bg');
        });
        
        $(document).delegate('.Menusave','click',function () {
            var titlestr='<fmt:message code="netdisk.th.NewMenu" />';
            var contstr='<div class="newTable">' +
                            '<p class="tableTop"><fmt:message code="main.network" /></p>' +
                            '<p><label><input type="radio"><fmt:message code="netdisk.th.DirectoryName" /> </label>&nbsp;&nbsp;&nbsp;&nbsp; <fmt:message code="netdisk.th.(level two or three menu)" /></p>' +
                         '</div>'
            layer.open({
                title:titlestr,
                content:contstr,
                closeBtn:0,
                area:['300px','230px'],
                btn:['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'],
                yes:function (index) {
                    
                },
                success:function () {
                    
                }
            })
        })
        /* 权限设置页面切换*/
        $('.power_t .power_list').click(function () {
            $('.con_item .item').hide()

            $('.con_item .item').eq($(this).parent().index()).show()
        })


        /*权限设置页面*/
        /*批量设置*/
        var data = {};
        var userId = {
            dept: "",
            role: "",
            user: ""
        };
        var manageUser = {
            dept: "",
            role: "",
            user: ""
        };
        var newUser = {
            dept: "",
            role: "",
            user: ""
        };
        var downUser={
            dept: "",
            role: "",
            user: ""
        };
        function settingData() {
            var comdata={
                dept:$('#send_dept5').attr('deptid'),
                role:$('#send_role5').attr('userpriv'),
                user:$('#send_user5').attr('user_id')
            };
            if($('#access').is(':checked') == true){
                data["userId"]=comdata;
            }
            if($('#download').is(':checked') == true){
                data["manageUser"]=comdata;
            }
            if($('#mange').is(':checked') == true){
                data["newUser"]=comdata;
            }
            if($('#stamp').is(':checked') == true){
                data["downUser"]=comdata;
            }
        }

        var diskId;
        $('.netdiskPar').delegate('.powerset', 'click', function () {
            var date_hide = $(this).find("input").val().replace(/'/g, '"');
            var dataMsg = JSON.parse(date_hide);
            diskId = dataMsg.diskId;
            getdiskinfor(diskId);
            $('.con').show();
            $('.con_item .item').hide()
            $('.item_1').show();
            $('.netdiskPar').hide();
            $('.power_t').find('.power_list').each(function () {
                $(this).removeClass('power_bg')
            })
            $($('.power_t').find('.power_list')[0]).addClass('power_bg')
        });

        $('.access').click(function () {
            if($(this).attr('data-num')==1) {
                var objTwos = {
                    userId: {
                        dept: $('#senddep').attr('deptid'),
                        user: $('#senduser').attr('user_id'),
                        role: $('#sendrole').attr('userpriv'),
                    },
                    diskId: diskId
                }
            }else if($(this).attr('data-num')==2){
                var objTwos = {
                    manageUser: {
                        dept: $('#send_dept2').attr('deptid'),
                        user: $('#send_uesr2').attr('user_id'),
                        role: $('#send_role2').attr('userpriv'),
                    },
                    diskId: diskId
                }
            }else if($(this).attr('data-num')==3){
                var objTwos = {
                    newUser: {
                        dept: $('#send_dept3').attr('deptid'),
                        user: $('#send_user3').attr('user_id'),
                        role: $('#send_role3').attr('userpriv'),
                    },
                    diskId: diskId
                }
            }else if($(this).attr('data-num')==4){
                var objTwos = {
                    downUser: {
                        dept: $('#send_dept4').attr('deptid'),
                        user: $('#send_user4').attr('user_id'),
                        role: $('#send_role4').attr('userpriv'),
                    },
                    diskId: diskId
                }
            }
            $.post('/netdiskSettings/editNetdiskJurisdictionSettings',{'auth':JSON.stringify(objTwos)},function (json) {
                if(json.flag){
                    $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1});
                }
                setTimeout('myrefresh()',1000);
            },'json')
        })


        /*返回*/
        $('.btn_back').click(function () {
            $('.con').hide();
            $('.netdiskPar').show();
            clearData()
        });
        /*权限设置确定提交接口*/
        $('#batch_btn').click(function () {
            settingData()
            data["diskId"]=diskId;
            var datas = JSON.stringify(data);
            var auth = {
                auth: datas
            };
            $.ajax({
                type: 'POST',
                url: '<%=basePath%>netdiskSettings/editNetdiskJurisdictionSettings',
                dataType: 'json',
                data: auth,
                success: function (data) {
                    if (data.flag) {
                        layer.msg('<fmt:message code="netdisk.th.Success" />!', {icon: 6});
                        setTimeout('myrefresh()',1000);
                    }
                }

            })
        })

        /*新建共享目录*/
        $('.netdiskPar').delegate('#newtory', 'click', function () {
            layer.open({
                title: '<p style="height: 43px;width: 100%;font-size: 16px;padding-left: 10px;color: #fff"><fmt:message code="netdisk.th.NewSharedDirectory" /></p>',
                shade: 0.3,
                offset:['150px','35%'],
                content: '<div class="newpop">' +
                '<div class="list_group">' +
                '<label for="sortNum" class="toryList"><fmt:message code="file.th.Sort" /> :</label>' +
                '<input type="text" id="sortNum" class="save_w"></div>' +
                '<div class="list_group"><label for="catalog" class="toryList"><fmt:message code="netdisk.th.SharedDirectoryName" />:</label>' +
                '<input type="text" id="catalog" class="save_w"></div>' +
                '<div class="list_group"><label for="path" class="toryList"><fmt:message code="netdisk.th.SharedDirectoryPath" /> :</label>' +
                '<input type="text" id="path" class="save_w">' +
                '<p class="file_path"><fmt:message code="netdisk.th.TheFilePath" />/soft</p>' + '</div>' +
                '<div class="list_group"><label for="maxcap" class="toryList"> <fmt:message code="netdisk.th.Maximumcapacity" />:</label>' +
                '<input type="text" id="maxcap" class="save_w" value="0"><span> MB <fmt:message code="netdisk.th.(0 unrestricted)" /></span></div>' +
                '<div class="list_group">' +
                '<label for="defaultSort" class="toryList"><fmt:message code="netdisk.th.undefand" /> :</label>' +
                '<select name="defaultSort" id="defaultSort" class="defaultSort"><option value="nom"><fmt:message code="workflow.th.name" /></option>' +
                '<option value="taille"><fmt:message code="netdisk.th.Size" /></option><option value="type"><fmt:message code="notice.th.type" /></option><option value="mod"><fmt:message code="netdisk.th.Lastmodifiedtime" /></option>' +
                '</select><select name="defaultSort" id="Ascend" class="Ascend">' + '<option value="0"><fmt:message code="netdisk.th.asc" /></option>' +
                '<option value="1"><fmt:message code="netdisk.th.desc" /></option></select></div>' + '</div>',
                area: ['600px', '450px'],
                btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="notice.th.return" />'],
                scrolling: 'no',
                yes: function () {

                    $.ajax({
                        url: '<%=basePath%>netdiskSettings/addNetdiskSettings',
                        type: 'post',
                        dataType: 'json',
                        data: {
                            diskNo: $('#sortNum').val(),
                            diskName: $('#catalog').val(),
                            diskPath: $('#path').val(),
                            spaceLimit: $('#maxcap').val(),
                            orderBy: $('#defaultSort').val(),
                            ascDesc: $('#Ascend').val()
                        },
                        success: function (data) {
                            if (data.flag) {
                                layer.msg('<fmt:message code="depatement.th.Newsuccessfully" />。。', {icon: 6})
                                netdiskQuery();
                            }else {
                                $.layerMsg({content:data.msg,icon:2});

                            }

                        }
                    })

                }
            })
        });
        /*编辑*/
        $('.netdiskPar').delegate('#editor', 'click', function () {
            var date_hide = $(this).find("input").val().replace(/'/g, '"');

            layer.open({
                title: '<p style="height: 43px;width: 100%;font-size: 16px;padding-left: 10px;color: #fff"><fmt:message code="netdisk.th.EditorSharedDirectory" /></p>',
                shade: 0.3,
                content: '<div class="newpop">' +
                '<div class="list_group">' +
                '<label for="sortNum" class="toryList"><fmt:message code="file.th.Sort" /> :</label>' +
                '<input type="text" id="sortNum" class="save_w"></div>' +
                '<div class="list_group"><label for="catalog" class="toryList"> <fmt:message code="netdisk.th.SharedDirectoryName" />:</label>' +
                '<input type="text" id="catalog" class="save_w"></div>' +
                '<div class="list_group"><label for="path" class="toryList"><fmt:message code="netdisk.th.SharedDirectoryPath" /> :</label>' +
                '<input type="text" id="path" class="save_w">' +
                '<p class="file_path"><fmt:message code="netdisk.th.TheFilePath" />d:/soft</p>' + '</div>' +
                '<div class="list_group"><label for="maxcap" class="toryList"> <fmt:message code="netdisk.th.Maximumcapacity" />:</label>' +
                '<input type="text" id="maxcap" class="save_w"><span> MB <fmt:message code="netdisk.th.(0 unrestricted)" /></span></div>' +
                '<div class="list_group">' +
                '<label for="defaultSort" class="toryList"> <fmt:message code="netdisk.th.undefand" />:</label>' +
                '<select name="defaultSort" id="defaultSort" class="defaultSort"><option value="nom"><fmt:message code="workflow.th.name" /></option>' +
                '<option value="taille"><fmt:message code="netdisk.th.Size" /></option><option value="type"><fmt:message code="notice.th.type" /></option><option value="mod"><fmt:message code="netdisk.th.Lastmodifiedtime" /></option>' +
                '</select><select name="defaultSort" id="Ascend" class="Ascend">' + '<option value="0"><fmt:message code="netdisk.th.asc" /></option>' +
                '<option value="1"><fmt:message code="netdisk.th.desc" /></option></select></div>' + '</div>',
                area: ['600px', '450px'],
                btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="notice.th.return" />'],
                success: function () {
                    var dataMsg = JSON.parse(date_hide);
                    $('#sortNum').val(dataMsg.diskNo);
                    $('#catalog').val(dataMsg.diskName);
                    $('#path').val(dataMsg.diskPath);
                    $('#desc').val();
                    $('#maxcap').val(dataMsg.spaceLimit);
                    $('#defaultSort').val(dataMsg.orderBy);
                    $('#Ascend').val(dataMsg.ascDesc);
                    $('#path').parent().hide();

                },
                yes: function () {
                    var dataMsg = JSON.parse(date_hide);
                    var diskId = dataMsg.diskId;
                    $.ajax({
                        url: '<%=basePath%>netdiskSettings/editNetdiskSettings',
                        type: 'post',
                        dataType: 'json',
                        data: {
                            diskNo: $('#sortNum').val(),
                            diskName: $('#catalog').val(),
                            diskPath: $('#path').val(),
                            remark: $('#desc').val(),
                            spaceLimit: $('#maxcap').val(),
                            orderBy: $('#defaultSort').val(),
                            ascDesc: $('#Ascend').val(),
                            diskId: diskId
                        },
                        success: function (data) {
                            if (data.flag) {
                                netdiskQuery();
                                layer.msg('<fmt:message code="netdisk.th.Editsuccess" />。。', {icon: 6})
                            }
                        }

                    })

                }
            })
        })
        /*删除*/
        $('.netdiskPar').delegate('#updete_d', 'click', function () {

            var date_hide = $(this).find("input").val().replace(/'/g, '"');
            var dataMsg = JSON.parse(date_hide);
            var diskId = dataMsg.diskId;
            $.ajax({
                type: 'GET',
                url: '<%=basePath%>netdiskSettings//deleteByDiskId',
                dataType: 'json',
                data: {
                    diskId: diskId
                },
                success: function (data) {
                    if (data.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        netdiskQuery();
                    }

                }
            })

        })
    })


</script>
</html>
