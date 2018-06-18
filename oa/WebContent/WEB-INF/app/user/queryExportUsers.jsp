<%--
  Created by IntelliJ IDEA.
  User: gsb
  Date: 2017/7/7
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title><fmt:message code="userInfor.th.UserQuery" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
</head>
<style type="text/css">
    *{
        margin: 0 auto;
    }
    .top{
        margin-top: 20px;
        margin-left: 30px;
    }
    .tableDiv{
        margin-top:20px;
        padding-bottom: 45px;
    }
    .tableDiv table{
        width: 88%;
    }
    input{
        width: 150px;
    }
    select{
        width: 150px;
    }
    a {
        text-decoration: none;
        color: #207bd6;
        cursor: pointer;
    }
    /*定义滚动条宽高及背景，宽高分别对应横竖滚动条的尺寸*/
    ::-webkit-scrollbar{
        width: 2px;
        height: 16px;
        background-color: #f5f5f5;
    }
    /*定义滚动条的轨道，内阴影及圆角*/
    ::-webkit-scrollbar-track{
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        border-radius: 10px;
        background-color: #f5f5f5;
    }
    /*定义滑块，内阴影及圆角*/
    ::-webkit-scrollbar-thumb{
        /*width: 10px;*/
        height: 20px;
        border-radius: 10px;
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        background-color: #555;
    }
    .tableDiv{
        overflow-y: auto;
    }
    .BigButton{
        width:76px;
        height: 30px;
        line-height: 25px;
        font-size: 15px;
        color: #404060;
        border-radius: 6px;
        background: #f6f6f6;
        text-align: center;
        cursor: pointer;

    }

    .TableBlock{
        white-space: nowrap;
        word-break: keep-all;
    }
    tr .thead{
        font-size: 15px;
        color: #2a588c;
        font-weight: bold;
    }

</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
<div>
    <div class="top">
        <span style="font-size: 20px">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_userQuery.png" style="vertical-align: middle;width: 23px;margin-right: 12px;" alt="用户查询或导出">
        <fmt:message code="userInfor.th.UserQuery" /></span>
    </div>
    <div class="content">
        <div class="tableDiv">
            <table class="TableBlock" width="50%" align="center">
                <tr>
                    <td nowrap class="TableData thead" width="120"><fmt:message code="userName" />：</td>
                    <td nowrap class="TableData">
                        <input type="text" name="byname" class="BigInput" size="20" maxlength="20">&nbsp;
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead"><fmt:message code="userManagement.th.Realname" />：</td>
                    <td nowrap class="TableData">
                        <input type="text" name="userName" class="BigInput" size="10" maxlength="20">&nbsp;
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead"><fmt:message code="hr.th.PhoneNumber" />：</td>
                    <td nowrap class="TableData">
                        <input type="text" name="mobilNo" class="BigInput" size="10" maxlength="11">&nbsp;
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead"><fmt:message code="userManagement.th.role" />：</td>
                    <td nowrap class="TableData">
            <span style="position: relative;">
                <input type="text" name="userPriv" id="userPrivInput"  class="BigInput" value="" privid="" userpriv="">
                <a href="javascript:;" class="userPrivAdd" name="orgAdd" ><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" class="userPrivClear" name="orgClear"><fmt:message code="global.lang.empty"/></a>
            </span>&nbsp;&nbsp;
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead"><fmt:message code="userManagement.th.department"/>：</td>
                    <td nowrap class="TableData">
                        <input type="text" name="deptId" id="deptInputId" />
                        <a class="deptAdd"><fmt:message code="global.lang.add" /></a>
                        <a class="deptClear"><fmt:message code="global.lang.empty" /></a>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead"><fmt:message code="userDetails.th.Gender"/>：</td>
                    <td nowrap class="TableData">
                        <select name="sex" class="BigSelect">
                            <option value=""><fmt:message code="user.th.chooseGender"/></option>
                            <option value="0"><fmt:message code="userInfor.th.male"/></option>
                            <option value="1"><fmt:message code="userInfor.th.female"/></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead" width="120"><fmt:message code="userManagement.th.ManagementScope"/>：</td>
                    <td nowrap class="TableData">
                        <select name="postPriv" class="BigSelect">
                            <option value=""><fmt:message code="userManagement.th.SelectManagementScope"/></option>
                            <option value="0"><fmt:message code="sys.th.ThisDepartment"/></option>
                            <option value="1"><fmt:message code="url.th.all"/></option>
                            <option value="2"><fmt:message code="sys.th.DesignatedDepartment"/></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead"><fmt:message code="sys.th.DesignatedDepartment"/>：</td>
                    <td nowrap class="TableData">
                        <select name="notLogin" class="BigSelect">
                            <option value=""><fmt:message code="userManagement.th.AllowOA"/></option>
                            <option value="0"><fmt:message code="user.th.AllowloginOA"/></option>
                            <option value="1"><fmt:message code="user.th.NologinOA"/></option>
                        </select>
                    </td>
                </tr>
                <tr style="display: none">
                    <td nowrap class="TableData thead"><fmt:message code="userManagement.th.AllowGetUserList"/>：</td>
                    <td nowrap class="TableData">
                        <select name="notViewUser" class="BigSelect">
                            <option value=""><fmt:message code="userManagement.th.AllowGetUserList"/></option>
                            <option value="0"><fmt:message code="userManagement.th.AllowYunXu"/></option>
                            <option value="1"><fmt:message code="userManagement.th.AllowJinzhi"/></option>
                        </select>
                    </td>
                </tr>
                <tr style="display: none">
                    <td nowrap class="TableData thead"><fmt:message code="userManagement.th.AllowDesktop"/>：</td>
                    <td nowrap class="TableData">
                        <select name="notViewTable" class="BigSelect">
                            <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                            <option value="0"><fmt:message code="userManagement.th.AllowYunXu"/></option>
                            <option value="1"><fmt:message code="userManagement.th.AllowJinzhi"/></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead" ><fmt:message code="user.th.AttendanceType"/>：</td>
                    <td nowrap class="TableData">
                        <select name="dutyType" class="BigSelect">
                            <option value=""><fmt:message code="user.th.SelectAttendanceType"/></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap class="TableData thead" width="120"><fmt:message code="userManagement.th.LoginInSortTime"/>：</td>
                    <td nowrap class="TableData">
                        <select name="orderType" class="BigSelect">
                            <option value=""><fmt:message code="userManagement.th.SortType"/></option>
                            <option value="desc"><fmt:message code="netdisk.th.desc"/></option>
                            <option value="asc"><fmt:message code="netdisk.th.asc"/></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td nowrap  class="TableControl" style="margin-left: 37%" colspan="2" align="center">
                        <input type="button" value="<fmt:message code="global.lang.query"/>" class="BigButton" id="queryBtn"  title="<fmt:message code="userInfor.th.QueryUser"/>" name="button">&nbsp;&nbsp;
                        <input type="button" value="<fmt:message code="global.lang.report"/>" class="BigButton" id="queryExportBtn"  title="<fmt:message code="main.th.ExportuserInformation"/>" name="button">
                    </td>
                </tr>
            </table>

        </div>
    </div>

</div>

<script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    var priv_id;
    var dept_id;
    var data;
    $(function () {
        // 获取角色信息控件
        $(".userPrivAdd").on("click",function(){
            priv_id="userPrivInput";
            $.popWindow("../common/selectPriv");
        });
        // 清空角色信息
        $('.userPrivClear').click(function () {
            $('#userPrivInput').attr("privid","");
            $('#userPrivInput').attr("userpriv","");
            $('#userPrivInput').val("");
        });

        // 获取部门信息控件
        $(".deptAdd").on("click",function(){
            dept_id="deptInputId";
            $.popWindow("../common/selectDept");
        });
        // 清空部门信息
        $('.deptClear').click(function () {
            $('#deptInputId').attr("deptid","");
            $('#deptInputId').attr("deptno","");
            $('#deptInputId').val("");
        });

        // 获取部门信息
        /*$('.deptSelect').deptSelect(function (me) {
            $(me).append('<option value="0"><fmt:message code="userManagement.th.Outgoing"/></option>')
        });*/

        // 查询所有考勤类型
        $.ajax({
            url: "/attendSet/selsectAttendSet",
            type:'get',
            dataType:"JSON",
            success:function(data){
                var data = data.data;
                var str='';
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].sid+'">'+data[i].title+'</option>'
                }
                $('select[name="dutyType"]').append(str);
            }
        });

        // 获取数据
        $('.BigButton').click(function () {
            data= {
                'byname': $('input[name="byname"]').val(),
                'userName': $('input[name="userName"]').val(),
                'mobilNo':$('input[name="mobilNo"]').val(),
                'userPrivs':(function () {
                    if($('#userPrivInput').attr('userpriv')!=undefined){
                        return $('#userPrivInput').attr('userpriv');
                    }else {
                        return ''
                    }
                })(),
                'deptIds':(function () {
                    if($('#deptInputId').attr('deptid')!=undefined){
                        return $('#deptInputId').attr('deptid');
                    }else {
                        return ''
                    }
                })(),
                'sex':$('select[name="sex"] option:checked').val(),
                'postPriv': $('select[name="postPriv"] option:checked').val(),
                'notViewUser':$('select[name="notViewUser"] option:checked').val(),
                'notViewTable':$('select[name="notViewTable"] option:checked').val(),
                'dutyType':$('select[name="dutyType"] option:checked').val(),
                'sortType':$('select[name="orderType"] option:checked').val()
            };
            if(data.deptId==-1){
                data.deptId="";
            }
            if($('select[name="notLogin"] option:checked').val()!=undefined &&$('select[name="notLogin"] option:checked').val()!=''){
                data.notLogin = $('select[name="notLogin"] option:checked').val();
            }
        })
        // 查询
        $('#queryBtn').click(function () {
            parent.$('.tab').find('.userData').remove();
            $.ajax({
                type: 'post',
                url: '/user/queryExportUsers',
                dataType: 'json',
                data: data,
                success:function(rsp){
                    parent.searchData = data;
                    var data1=rsp.obj;
                    var str='';
                    for(var i=0;i<data1.length;i++){
                        var colorNum='';
                        var lastVisitTime='';
                        if(data1[i].password=='') {
                            colorNum = 'colorRed'
                        }
                        if(data1[i].notLogin==1){
                            colorNum='colorddd'
                        }
                        if(data1[i].lastVisitTime!=undefined){
                            lastVisitTime=data1[i].lastVisitTime
                        }

                        str += '<tr class="userData '+colorNum+'" uId="' + data1[i].uid + '">' +
                            '<td>'+function(){
                            if(data1[i].byname=='admin'){
                                return ''
                            }else{
                                return '<input type="checkbox" class="checkChild" name="checkbox" value="" style="width:13px;height:13px;" />'
                            }
                            }()+'</td>' +
                            '<td>' + data1[i].byname + '</td>' +
                            '<td>' + data1[i].userName + '</td>' +
                            '<td data-deptid="'+data1[i].deptId+'">' + data1[i].deptName + '</td>' +
                            '<td>' + function () {
                                switch (data1[i].dutyType) {
                                    case 1:
                                        return '<fmt:message code="sys.th.RegularClass" />';
                                        break
                                    case 2:
                                        return '<fmt:message code="sys.th.Whole-day" />';
                                        break
                                    case 99:
                                        return '<fmt:message code="sys.th.ShiftSystem" />';
                                        break
                                }

                            }() + '</td>' +
                            '<td>' + data1[i].userPrivName + '</td>' +
                            '<td>' +function () {
                                switch (parseInt(data1[i].postPriv)) {
                                    case 1:
                                        return '<fmt:message code="url.th.all" />';
                                        break
                                    case 2:
                                        return '<fmt:message code="sys.th.DesignatedDepartment" />';
                                        break
                                    case 0:
                                        return '<fmt:message code="sys.th.ThisDepartment" />';
                                        break
                                }

                            }()  + '</td>' +
                            '<td>' + lastVisitTime + '</td>' +
                            '<td>' + data1[i].idleTime + '</td>' +
                            '<td>'+function(){
                                    if(data1[i].byname==''){
                                        return ''
                                    }else{
                                        return '<a href="javascript:void(0)" onclick="clickrenwu('+data1[i].uid+',this)" style="margin-right: 5px;"><fmt:message code="global.lang.edit" /></a>'
                                    }
                            }()+'</td>' +
                            '</tr>';  //<a href="javascript:;">
                        <%--<fmt:message code="userManagement.th.MenuAauthority" />--%>
                        //</a>:菜单权限查看

                    }

                    parent.$('.tr_befor').after(str);
                    parent.$('.userData').click(function(){
                        var inCh=$(this).find('.checkChild').prop('checked');
                        if(inCh == true){
                            $(this).find('.checkChild').prop('checked',true);
                            $(this).addClass('bgColor');
                        }else{
                            parent.$('#checkedAll').prop('checked',false);
                            $(this).find('.checkChild').prop('checked',false);
                            $(this).removeClass('bgColor');
                        }
                        var child = parent.$(".checkChild");
                        for(var i=0;i<child.length;i++){
                            var childstate= $(child[i]).prop("checked");
                            if(inCh!=childstate){
                                return
                            }
                        }
                        parent.$('#checkedAll').prop("checked",inCh);
                    });
                    parent.$('.content .right').css("display","block");
                    parent.$('.rightMain').css("display","none");
                }
            })
        });
        // 查询并导出
        $('#queryExportBtn').click(function () {
            if(data.notLogin!=undefined){
                window.location.href='/user/queryExportUsers?isExport=yes&orderType='+data.orderType+'&byname='+data.byname+'&userName='+data.userName+'&mobilNo='+data.mobilNo+'&userPrivs='+data.userPrivs+'&deptIds='+data.deptIds+'&sex='+data.sex
                    +'&postPriv='+data.postPriv+'&notLogin='+data.notLogin+'&notViewUser='+data.notViewUser+'&notViewTable='+data.notViewTable+'&dutyType='+data.dutyType;
            }else{
                window.location.href='/user/queryExportUsers?isExport=yes&orderType='+data.orderType+'&byname='+data.byname+'&userName='+data.userName+'&mobilNo='+data.mobilNo+'&userPrivs='+data.userPrivs+'&deptIds='+data.deptIds+'&sex='+data.sex
                    +'&postPriv='+data.postPriv+'&notViewUser='+data.notViewUser+'&notViewTable='+data.notViewTable+'&dutyType='+data.dutyType;
            }

        });
    })
</script>
</body>
</html>
