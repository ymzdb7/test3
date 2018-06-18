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
    <title><fmt:message code="main.usermanage" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../css/sys/addUser.css"/>
    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/sys/adduser.js" type="text/javascript" charset="utf-8"></script>
<style>
.clearfix:after{
    content:'';
    display: block;
    clear: both;
}
    .fl{
        float: left;
    }

</style>
    <script>
        var priv_id;
        var res;
        var dept_id;
        var user_id;
        $(function(){
            //选人控件
            $("#selectUser1").on("click",function(){
                priv_id='senduser1';
                if($('input[name="userId"]').val()=='admin'){
                    $.popWindow("../common/selectPriv?2");
                }else {
                    $.popWindow("../common/selectPriv?0");
                }

            });
            $("#selectUser2").on("click",function(){
                priv_id='senduser2';
                $.popWindow("../common/selectPriv");
            });
            $("#selectUsers").on("click",function(){
                priv_id='sendusers';
                $.popWindow("../common/selectPriv");
            });
            $('.newBtnone').click(function () {
                dept_id='departments'
                $.popWindow("../common/selectAddDept");
            })
            $('#tr_Up').click(function(){
                $('.trOption').toggle();
            })
            $('#trOther').click(function(){
                $('.otherOption').toggle();
            })
            $('#selectUser7').click(function () {
                user_id='senduser7';
                $.popWindow("../common/selectUser");
            })
            $('#selectUser8').click(function () {
                dept_id='senduser8';
                $.popWindow("../common/selectDept");
            })
           /* var radioValOA=$('input:radio[name="notLogin"]:checked').val();
            var radioValOther=$('input:radio[name="notMobileLogin"]:checked').val();*/

            $('#btn1').click(function(){
              /*  var idNumber = $('input[name="idNumber"]').val();
                console.log(idNumber);
                if (typeof (isCardID(idNumber))=="string"){
                    alert(isCardID(idNumber));
                    return;
                }*/
                if($('input[name="userId"]').val()==''){
                    layer.msg('<fmt:message code="user.th.userName" />', {icon: 5});
                    <%--alert('<fmt:message code="user.th.userName" />');--%>
                    return;
                }
                if($('input[name="userName"]').val()==''){
                    layer.msg('<fmt:message code="user.th.realName" />', {icon: 5});
                    <%--alert('<fmt:message code="user.th.realName" />');--%>
                    return;
                }
                if($('#senduser1').attr('userPriv')==undefined){
                    layer.msg('<fmt:message code="user.th.leadingColors" />', {icon: 5});
                    <%--alert('<fmt:message code="user.th.leadingColors" />')--%>
                    return
                }
                if($('#department').val()==-1){
                    layer.msg('<fmt:message code="user.th.selectDepartment" />', {icon: 5});
                    <%--alert('<fmt:message code="user.th.selectDepartment" />')--%>
                    return
                }
                var notLogin=$('input:radio[name="notLogin"]:checked').val();
                var notMobileLogin=$('input:radio[name="notMobileLogin"]:checked').val();
                var isLunar='';
                var mobilNoHidden='';
                var notViewUserstr;
                var notViewTablestr;
                var useingKeystr,usingFingerstr,usePop3str,useEmailstr;
                if($('[name="notViewUser"]').is(':checked')){
                    notViewUserstr=1
                }else {
                    notViewUserstr=0
                }
                if($('[name="usePop3"]').is(':checked')){
                    usePop3str=1
                }else {
                    usePop3str=0
                }
                if($('[name="useEmail"]').is(':checked')){
                    useEmailstr=1
                }else {
                    useEmailstr=0
                }
                if($('[name="notViewTable"]').is(':checked')){
                    notViewTablestr=1
                }else {
                    notViewTablestr=0
                }
                if($('[name="useingKey"]').is(':checked')){
                    useingKeystr=1
                }else {
                    useingKeystr=0
                }
                if($('[name="usingFinger"]').is(':checked')){
                    usingFingerstr=1
                }else {
                    usingFingerstr=0
                }
                if($('input[name="isLunar"]').prop('checked')==true){
                    isLunar=1;
                }else{
                    isLunar=0;
                }
                if($('input[name="mobilNoHidden"]').prop('checked')==true){
                    mobilNoHidden=0;
                }else{
                    mobilNoHidden=1;
                }
                var data= {
                    'theme':$('select[name="THEME"] option:checked').val(),
                    'byname': $('input[name="userId"]').val(),
                    'userName': $('input[name="userName"]').val(),/*
                    'userId':$('input[name="userId"]').val(),*/
                    'userPriv': $('#senduser1').attr('userpriv').replace(/,/g,''),
                    'deptId': $('select[name="deptId"] option:checked').val(),
                    'userNo': $('input[name="userNo"]').val(),
                    'postPriv': $('select[name="postPriv"] option:checked').val(),
                    'imRange': $('select[name="imRange"] option:checked').val(),
                    'notLogin': notLogin,
                    'notViewUser':notViewUserstr,
                    'notViewTable':notViewTablestr,
                    'notMobileLogin': notMobileLogin,
                    'useingKey':useingKeystr,
                    'usingFinger':usingFingerstr,
                    'useEmail':useEmailstr,
                    'usePop3':usePop3str,
                    'userPrivOther':$('#sendusers').attr('userpriv'),
                    'webmailNum':$('[name="webmailNum"]').val(),
                    'webmailCapacity':$('[name="webmailCapacity"]').val(),
                    'dutyType':$('[name="twoSele"]').val(),
                    'emailCapacity':$('[name="emailCapacity"]').val(),
                    'folderCapacity':$('[name="folderCapacity"]').val(),
                    'bindIp':$('#bindIp').val(),
                    'remark':$('#remark').val(),
                    'password':$('input[name="password"]').val(),
                    'sex':$('select[name="sex"] option:checked').val(),
                    'birthday':$('input[name="birthday"]').val(),
                    'isLunar':isLunar,
                    'mobilNo':$('input[name="mobilNo"]').val(),
                    'mobilNoHidden':mobilNoHidden,
                    'email':$('input[name="email"]').val(),
                    'telNoDept':$('input[name="telNoDept"]').val(),
                    'deptIdOther':$('#departments').attr('deptid'),
                    'privIds':$('#senduser2').attr('userpriv'),
                    'userIds':$('#senduser7').attr('dataid'),
                    'deptIds':$('#senduser8').attr('deptid'),
                    "subject":$('.subject option:selected').val(),
                    'idNumber':$('input[name="idNumber"]').val(),
                    'traNumber':$('input[name="traNumber"]').val(),
                    'postId':$('select[name="postId"]').val(),
                    'jobId':$('select[name="jobId"]').val()

                };
                 var num=Evaluate(data.password);
                if(data.password.length<6){
                    layer.msg('<fmt:message code="sys.th.mima" />',{icon:0});

                    return false;
                }else if(num<2){
                    layer.msg('<fmt:message code="sys.th.mimaNo" />',{icon:0});
                    return false;
                }
                if(location.href.split('?')[1]==0) {
                    $.ajax({
                        type: 'post',
                        url: '/user/addUser',
                        dataType: 'json',
                        data: data,
                        success: function (rsp) {
                            if (rsp.flag == true) {
                                layer.open({
                                    title:'<fmt:message code="depatement.th.Newsuccessfully" />',
                                    content:'<fmt:message code="user.thbuildingNew" />',
                                    btn:['<fmt:message code="global.lang.ok" />','<fmt:message code="global.lang.close" />'],
                                    yes:function (index) {
                                        location.reload()
                                    },
                                    btn2:function (index) {
//                                        parent.opener.ajaxdata(window.opener.numdept);
                                        var deptIds=$('#department').val();
                                        if(window.opener.$('[deptid="'+deptIds+'"]')!=undefined){
                                            window.opener.$('[deptid="'+deptIds+'"]').click();
//                                            if(window.opener.$('[deptid="'+deptIds+'"]').next().is(':hidden')){
//                                                window.opener.$('[deptid="'+deptIds+'"]').click();
//                                            }

                                        }
                                        //loadSidebar1($('#downChild'),window.opener.numdept);
                                        window.close();
                                    }
                                });
                            } else {
                                $.layerMsg({content:rsp.msg,icon:2});
                            }


                        }
                    })
                }else {
                    data.uid=location.href.split('?')[1];
                    $.ajax({
                        type: 'post',
                        url: '/user/editUser',
                        dataType: 'json',
                        data: data,
                        success: function (rsp) {
                            if (rsp.flag == true) {
                                $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />',icon:1},function () {
                                    parent.opener.ajaxdata(deptidnum)
                                    window.close()
                                });
                            } else {
                                $.layerMsg({content:'<fmt:message code="depatement.th.modifyfailed" />',icon:2});
                            }

                        }
                    })
                }
            })
        })
    </script>
</head>
<body>
<div class="content">
    <div class="title" style="margin-top: 20px;">
        <span class="titleTxt"><fmt:message code="userManagement.th.NewUser" /></span>
        <%--<span>（</span><span class="newname"></span><span>）</span>--%>
    </div>
    <form action="" method="post" name="form1">
        <table cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff">
            <tr>
                <td colspan="2" style="color: #3eb1f0"><fmt:message code="user.th.UserBasicInformation" /></td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="global.lang.user" />：</td>
                <td width="70%">
                    <input type="text"  name="userId" value="">
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="userManagement.th.Realname" />：</td>
                <td width="70%">
                    <input type="text" name="userName"  value="">
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="url.th.Leading" />：</td>
                <td width="70%">
                    <textarea name="txtsenduser" id="senduser1" readonly="" user_id='admin' value=""></textarea>
                    <a href="javascript:;" id="selectUser1" class="Add addUserPriv"><fmt:message code="global.lang.add" /></a>
                    <a href="javascript:void (0)" class="clearData clearUserPriv"><fmt:message code="global.lang.empty" /></a>
                    <a href="javascript:;" id="selectUsertwo" class="Add "><fmt:message code="user.th.AddRoles" /></a>

                </td>
            </tr>
            <tr id="fuzhuPriv" style="display: none">
                <td width="15%"><fmt:message code="userDetails.th.AuxiliaryRole" />：</td>
                <td width="70%">
                    <textarea name="txtsendusers" id="sendusers" readonly="" user_id='admin' value=""></textarea>
                    <a href="javascript:;" id="selectUsers" class="Add "><fmt:message code="global.lang.add" /></a>
                    <a href="javascript:void (0)" class="clearData"><fmt:message code="global.lang.empty" /></a>
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="userManagement.th.department" />：</td>
                <td width="70%">
                    <select id="department" name="deptId" style="width: 200px;">

                    </select>
                    <a href="jaavascript:void(0)" class="departmentbu"><fmt:message code="user.th.DesignatedOther" /></a>
                </td>
            </tr>
            <tr id="otherDept" style="display: none">
                <td width="15%"><fmt:message code="user.th.OtherDepartments" />：</td>
                <td width="70%">
                    <textarea name="departmentname" id="departments" ></textarea>
                    <a href="jaavascript:void(0)" class="newBtnone"><fmt:message code="global.lang.add" /></a>
                    <a href="javascript:void (0)" class="clearData"><fmt:message code="global.lang.empty" /></a>
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="hr.th.post" />：</td>
                <td width="70%">
                    <select name="jobId" style="width: 200px;" >
                        <option value=""><fmt:message code="sys.th.fillPost" /></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="userDetails.th.post" />：</td>
                <td width="70%">
                    <select name="postId" style="width: 200px;" >
                        <option value=""><fmt:message code="sys.th.fillRet" /></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="user.th.UserNumber" />：</td>
                <td width="70%">
                    <input type="text" name="userNo" value="">
                    <span><fmt:message code="user.th.SortUsers" /></span>
                </td>
            </tr>

            <tr>
                <td width="15%"><fmt:message code="hr.th.IDNumber" />：</td>
                <td width="70%">
                    <input type="text" name="idNumber" value="">
                </td>
            </tr>

            <tr class="jiaoyu">
                <td width="15%"><fmt:message code="sys.th.planNo" />：</td>
                <td width="70%">
                    <input type="text" name="traNumber" value="">
                </td>
            </tr>

            <tr class="jiaoyu">
                <td width="15%"><fmt:message code="sys.th.subject" />：</td>
                <td width="70%">
                    <select name="" class="subject" name="subject">
                        <%--<option value="">-选择-</option>--%>
                    </select>
                </td>
            </tr>

            <tr>
                <td colspan="2" style="color:#3eb1f0 "><fmt:message code="user.th.UserRights" /></td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="userManagement.th.ManagementScope" />：</td>
                <td width="70%">
                    <select name="postPriv">
                        <option value="0"><fmt:message code="sys.th.ThisDepartment" /></option>
                        <option value="1"><fmt:message code="url.th.all" /></option>
                        <option value="2"><fmt:message code="sys.th.DesignatedDepartment" /></option>
                    </select>
                    <span><fmt:message code="user.th.PlayRole" /></span>
                </td>
            </tr>
            <tr>
                <td width="15%"><fmt:message code="url.th.accessControl" />：</td>
                <td width="70%">
                    <%--<div class="spanChech">
                          <input type="checkbox" name="notViewUser" value="">
                          <span><fmt:message code="url.th.ViewNotAllowed" /></span>
                         <input type="checkbox" name="notViewTable" value="">
                          <span><fmt:message code="url.th.DisableDisplay" /></span>
                         <input type="checkbox" name="useingKey" value="">
                          <span><fmt:message code="user.th.USBKEY" /></span>
                         <input type="checkbox" name="usingFinger" value="">
                          <span><fmt:message code="user.th.UsingFingerprint" /></span>
                     </div>--%>
                    <div class="divRadio" style="float: left">
                        <input type="radio" checked="true" name="notLogin" value="0">
                        <span><fmt:message code="user.th.AllowloginOA" /></span>
                        <input type="radio" name="notLogin" value="1">
                        <span><fmt:message code="user.th.NologinOA" /> </span>
                        <input type="radio" name="notMobileLogin" checked="true" value="0">
                        <span><fmt:message code="user.th.NoLogin" /></span>
                        <input type="radio" name="notMobileLogin" value="1">
                        <span><fmt:message code="url.th.NoLogin" /></span>
                    </div>

                </td>
            </tr>
            <%--<tr>
                <td width="15%"><fmt:message code="user.th.InstantAccess" />：</td>
                <td width="70%">
                    <select name="imRange">
                        <option value="1"><fmt:message code="user.th.AllowUse" /></option>
                        <option value="2"><fmt:message code="user.th.stopU" /></option>
                    </select>
                </td>
            </tr>--%>
            <tr>
                <td width="15%">
                    <span><fmt:message code="user.th.WhiteList" />：</span>
                    <p><fmt:message code="user.th.SetRole" /></p>
                    <a href="javascript:void(0)" style="color: sandybrown" class="tdAnewrole"><fmt:message code="user.th.SetUp" /></a>
                </td>
                <td width="70%">
                    <div class="inPole">
                        <textarea name="txtPrivName" id="senduser2"  disabled style="height: 30px;min-height: 30px;"></textarea>
                        <span class="add_img" style="margin-left: 10px">
									<a href="javascript:;" id="selectUser2" class="Add "><fmt:message code="global.lang.add" /></a>
                                    <a href="javascript:void (0)" class="clearDataTwo"><fmt:message code="global.lang.empty" /></a>
								</span>
                        <span class="add_img">
									<%--<a href="javascript:;" class="clear">清除</a>--%>
								</span>
                        <p><fmt:message code="user.th.TheRoles" /></p>
                    </div>
                </td>
            </tr>
            <tr class="trrole" style="display: none">
                <td width="15%">
                    <span><fmt:message code="user.th.WhiteList" />：</span>
                    <p><fmt:message code="user.th.SetPersonnel" /></p>
                </td>
                <td width="70%">
                    <div class="inPole">
                        <textarea name="txtUserName" id="senduser7"  disabled style="height: 30px;min-height: 30px;"></textarea>
                        <span class="add_img" style="margin-left: 10px">
									<a href="javascript:;" id="selectUser7" class="Add "><fmt:message code="global.lang.add" /></a>
                            <a href="javascript:void (0)" class="clearDataTwo">清空<fmt:message code="global.lang.empty" /></a>
								</span>
                        <span class="add_img">
									<%--<a href="javascript:;" class="clear">清除</a>--%>
								</span>
                        <p><fmt:message code="user.th.Personnel" /></p>
                    </div>
                </td>
            </tr>
            <tr class="trrole" style="display: none">
                <td width="15%">
                    <span><fmt:message code="user.th.WhiteList" />：</span>
                    <p><fmt:message code="user.th.SetDepartment" /></p>
                </td>
                <td width="70%">
                    <div class="inPole">
                        <textarea name="txtDeptName" id="senduser8"  disabled style="height: 30px;min-height: 30px;"></textarea>
                        <span class="add_img" style="margin-left: 10px">
									<a href="javascript:;" id="selectUser8" class="Add "><fmt:message code="global.lang.add" /></a>
                              <a href="javascript:void (0)" class="clearDataTwo">清空<fmt:message code="global.lang.empty" /></a>
								</span>
                        <span class="add_img">
                            <%--<a href="javascript:;" class="clear">清除</a>--%>
                        </span>
                        <p><fmt:message code="user.th.withoutRestriction" /></p>
                    </div>
                </td>
            </tr>
            <tr>
                <td colspan="2"><a href="javascript:;" id="trOther" style="text-decoration: none;"><fmt:message code="user.th.other" /></a></td>
            </tr>
            <tr style="" class="otherOption">
                <td colspan="2">
                    <table cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff;width: 100%;margin-top:0;">
                        <tr>
                            <td width="15%"><fmt:message code="user.th.AttendanceType" />：</td>
                            <td width="70%">
                                <select name="twoSele">
                                </select>
                            </td>
                        </tr>
                        <%--<tr>
                            <td width="15%"><fmt:message code="user.th.InternalMailboxCapacity" />：</td>
                            <td width="70%">
                                <input type="text" name="emailCapacity" value="500">
                                <span>MB <fmt:message code="user.th.NullSize" /></span>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="url.th.PersonalCapacity" />：</td>
                            <td width="70%">
                                <input type="text" name="folderCapacity" value="500">
                                <span>MB <fmt:message code="user.th.NullSize" /></span>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="user.th.enablePOP3" />：</td>
                            <td width="70%">
                            <span class="spanChech">
                                <input type="checkbox" name="usePop3" value="">
                                <span><fmt:message code="global.lang.yes" /></span>
                            </span>

                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="user.th.MailEnable" />：</td>
                            <td width="70%">
                                <span class="spanChech">
                                    <input type="checkbox" name="useEmail" value="">
                                    <span><fmt:message code="user.th.InternalConnections" /></span>
                                </span>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="user.th.stop" />：</td>
                            <td width="70%">
                                <span class="spanChech">
                                    <input type="checkbox" name="SUMMARY" value="500">
                                    <span><fmt:message code="user.th.ProhibitFunctionality" /></span>
                                </span>

                            </td>
                        </tr>
                        <tr class="inthide">
                            <td width="15%"><fmt:message code="user.th.Internet" />：</td>
                            <td width="70%">
                                <input type="text" name="webmailNum" value="">
                                <span> <fmt:message code="user.th.NullMeans" /></span>
                            </td>
                        </tr>
                        <tr class="inthide">
                            <td width="15%"><fmt:message code="user.th.PerMailbox" />：</td>
                            <td width="70%">
                                <input type="text" name="webmailCapacity" value="">
                                <span> <fmt:message code="user.th.MBempty" /></span>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="user.th.BoundIPAddress" />：</td>
                            <td width="70%">
                                <textarea name="txtbindIp" id="bindIp" value="" style="height: 30px;min-height: 30px;"></textarea>
                                <p>为空则该用户不绑定固定的IP地址，绑定多个IP地址用英文逗号(,)隔开</p>
                                <p>也可以绑定IP段，如“192.168.0.60,192.168.0.100-192.168.0.200”</p>
                                <p>表示192.168.0.60或192.168.0.100到192.168.0.200这个范围内都可以登录</p>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%">备注：</td>
                            <td width="70%">
                                <textarea name="txtremark" id="remark" value="" style="height: 30px;min-height: 30px;"></textarea>
                            </td>
                        </tr>--%>
                    </table>
                </td>
            </tr>



            <tr>
                <td colspan="2"><a href="javascript:;" id="tr_Up" style="text-decoration: none;"><fmt:message code="sys.th.user" /></a></td>
            </tr>
            <tr style="" class="trOption">
                <td colspan="2">
                    <table cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff;width: 100%;margin-top:0;">
                        <tr>
                            <td width="15%"><fmt:message code="passWord" />：</td>
                            <td width="70%">
                                <input type="password" name="password" value="" style="width: 200px"
                                       onblur="ValidateInput('password',this.value)"  onkeydown="validatePwdStrong(this.value);"/>
                                <span><fmt:message code="sys.th.zimu" /></span>
                                <div class="clearfix" style="    width: 206px;height: 10px;border: 1px solid #ccc;margin-top: 5px;border-radius: 4px;" id="main">
                                     <span class="fl" style="display:inline-block;width: 67px;height:10px;border-right: 1px solid #ccc" id="low"></span>
                                    <span class="fl" style="display:inline-block;width: 67px;height:10px;border-right: 1px solid #ccc" id="medium"></span>
                                    <span class="fl" style="display:inline-block;width: 68px;height:10px;" id="height"></span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="userDetails.th.Gender" />：</td>
                            <td width="20%">
                                <select name="sex">
                                    <option value="0"><fmt:message code="userInfor.th.male" /></option>
                                    <option value="1"><fmt:message code="userInfor.th.female" /></option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="userDetails.th.Birthday" />：</td>
                            <td width="30%">
                    <span class="spanChech">
                        <input type="text" name="birthday" value="" onclick="laydate(start)">
                        <input type="checkbox" name="isLunar" value="">
                        <span><fmt:message code="url.th.Lunar" /></span>
                    </span>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="interfaceSetting.th.InterfaceTopics" />：</td>
                            <td width="70%">
                                <select name="THEME" class="BigSelect">
                                    <option value="6"><fmt:message code="controller.th.er" /></option>
                                    <option value="7"><fmt:message code="controller.th.san" /></option>
                                    <option value="3"><fmt:message code="controller.th.si" /></option>
                                    <option value="4"><fmt:message code="controller.th.gm" /></option>
                                    <option value="5"><fmt:message code="controller.th.dge" /></option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="userDetails.th.MobilePhone" />：</td>
                            <td width="30%">
                                <input type="text" name="mobilNo" value="">
                                <span class="spanChech">
                                    <%--<input type="checkbox" name="mobilNoHidden" value="">
                                    <span>手机号码不公开</span>--%>
                                    <%--<p>填写后可接收OA系统发送的手机短信，手机号码不公开仍可接收短信</p>--%>
                                </span>
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="main.email" />：</td>
                            <td width="70%">
                                <input type="email" name="email" value="" style="width: 200px;">
                            </td>
                        </tr>
                        <tr>
                            <td width="15%"><fmt:message code="userInfor.th.Workphone" />：</td>
                            <td width="70%">
                                <input type="text" name="telNoDept" value="">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <%--<tr>
                <td width="15%">密码：</td>
                <td width="70%">
                    <input type="password" name="SUMMARY" value="">
                    <span>8-20位，必须同时包含字母和数字</span>
                </td>
            </tr>
            <tr>
                <td width="15%">性别：</td>
                <td width="70%">
                    <select name="sex">
                        <option value="01">男</option>
                        <option value="01">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="15%">生日：</td>
                <td width="70%">
                    <span class="spanChech">
                        <input type="text" name="SUMMARY" value="">
                        <input type="checkbox" name="SUMMARY" value="">
                        <span>是农历生日</span>
                    </span>
                </td>
            </tr>
            <tr>
                <td width="15%">界面主题：</td>
                <td width="70%">
                    <select name="THEME" class="BigSelect">
                        <option value="1">2008版经典主题：儒雅深沉</option>
                        <option value="2">2008版经典主题：清新怡然</option>
                        <option value="9">2009版经典主题：生命与自然之美</option>
                        <option value="10">2010版梦幻灵动主题：宁静的思考</option>
                        <option value="13">2013版梦幻灵动主题：现代或未来</option>
                        <option value="15">2015版梦幻灵动主题：T-OS</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="15%">手机：</td>
                <td width="70%">
                    <input type="text" name="SUMMARY" value="">
                    <span class="spanChech">
                        <input type="checkbox" name="SUMMARY" value="">
                        <span>手机号码不公开</span>
                        <p>填写后可接收OA系统发送的手机短信，手机号码不公开仍可接收短信</p>
                    </span>
                </td>
            </tr>
            <tr>
                <td width="15%">电子邮件：</td>
                <td width="70%">
                    <input type="email" name="SUMMARY" value="">
                </td>
            </tr>
            <tr>
                <td width="15%">工作电话：</td>
                <td width="70%">
                    <input type="text" name="SUMMARY" value="">
                </td>
            </tr>--%>
            <tr>
                <td colspan="2">
                    <div class="div_btn">
                        <input type="button" class="inpuBtn new_liucheng" id="btn1" value="<fmt:message code="global.lang.save" />" />
                        <input type="button" class="inpuBtn backCanBtn" style="padding-left: 28px;" id="btn2" onclick="backtn($(this))" value="<fmt:message code="global.lang.close" />" />
                    </div>

                </td>
            </tr>
        </table>
    </form>
</div>
<script>
    function backtn(e){
        window.close();
    }
    $(function(){
        if(location.href.split('?')[1]==0) {
            $('#department').deptSelect(function(me){
                $(me).val(window.opener.numdept);
                $(me).append('<option value="0"><fmt:message code="userManagement.th.Outgoing" /></option>')
            });
        }else {
            /*$('input[name="userId"]').prop('readonly',true);
            $('input[name="userId"]').css('background','#E3E3E3');*/

        }


    });

    //时间控件调用
    var start = {
//        elem: '#beginTime',
        format: 'YYYY-MM-DD',
//                        min: laydate.now(), //设定最小日期为当前日期*/
//        max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false
//        choose: function(datas){
//            end.min = datas; //开始日选好后，重置结束日的最小日期
//            end.start = datas; //将结束日的初始值设定为开始日
//        }
    };


    function isCardID(sId){
        var iSum=0 ;
        var info="" ;
        if(!/^\d{17}(\d|x)$/i.test(sId)) return '<fmt:message code="sys.th.cardID" />';
        sId=sId.replace(/x$/i,"a");
        if(aCity[parseInt(sId.substr(0,2))]==null) return '<fmt:message code="sys.th.cardFei" />';
        sBirthday=sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2));
        var d=new Date(sBirthday.replace(/-/g,"/")) ;
        if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return '<fmt:message code="sys.th.illegal" />';
        for(var i = 17;i>=0;i --) iSum += (Math.pow(2,i) % 11) * parseInt(sId.charAt(17 - i),11) ;
        if(iSum%11!=1) return '<fmt:message code="sys.th.fillIllegal" />';
        //aCity[parseInt(sId.substr(0,2))]+","+sBirthday+","+(sId.substr(16,1)%2?"男":"女");//此次还可以判断出输入的身份证号的人性别
        return true;
    }
    /******************************************************验证用户输入******************************************************/


     function ValidateInput(element, value) {
//验证密码
        if (element == "password") {
            if (value.toString().length < 6) {
                 /* alert("您的密码不到6位")*/
                return;
            }

        }
    }



    /*================================密码强度 ===========Begin=======================================*/

    function Evaluate(word) {
        var regLow =/^[0-9]*$/;
        var regMetih=/^[A-Za-z0-9]+$/
        var regHeight=/[0-9a-zA-Z\._\$%&\*\!]/
    if(regLow.exec(word)){
         return 1;
    }else if(regMetih.exec(word)){
        return 2;
    }else if(regHeight.exec(word)){
        return 3;
    }else {
        return 1;
    }
    }
    function colorInit() {
        $('#low').css("backgroundColor","#fff")
        $('#medium').css("backgroundColor","#fff")
        $('#height').css("backgroundColor","#fff")

    }
    function validatePwdStrong(value) {

            if (Evaluate(value) == 1) {
                colorInit();
                $('#low').css("backgroundColor", "red")
                $('#medium').css("backgroundColor", "#fff")
                $('#height').css("backgroundColor", "#fff")

            }
            else if (Evaluate(value) == 2) {
                colorInit();
                $('#low').css("backgroundColor", "#dfff36")
                $('#medium').css("backgroundColor", "#dfff36")
                $('#height').css("backgroundColor", "#fff")

            }
            else if (Evaluate(value) == 3) {
                colorInit();
                $('#low').css("backgroundColor", "#2dff44")
                $('#medium').css("backgroundColor", "#2dff44")
                $('#height').css("backgroundColor", "#2dff44")
                $('#height').css("width", "70")

            }



    }
</script>

<%--<script type="text/javascript">

    //        获取学科控件
    function getYear(year){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:'COURSE_REALM'},
            dataType:'json',
            //data:datas,
            success:function(reg){
                var datas=reg.obj;
                var str;
                for (var i=0;i<datas.length;i++){
                     str+='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                }
                $(year).append(str);
            }
        })
    }



    function isCardID(sId){
        var iSum=0 ;
        var info="" ;
        if(!/^\d{17}(\d|x)$/i.test(sId)) return "你输入的身份证长度或格式错误";
        sId=sId.replace(/x$/i,"a");
        if(aCity[parseInt(sId.substr(0,2))]==null) return "你的身份证地区非法";
        sBirthday=sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2));
        var d=new Date(sBirthday.replace(/-/g,"/")) ;
        if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return "身份证上的出生日期非法";
        for(var i = 17;i>=0;i --) iSum += (Math.pow(2,i) % 11) * parseInt(sId.charAt(17 - i),11) ;
        if(iSum%11!=1) return "你输入的身份证号非法";
        //aCity[parseInt(sId.substr(0,2))]+","+sBirthday+","+(sId.substr(16,1)%2?"男":"女");//此次还可以判断出输入的身份证号的人性别
        return true;
    }
</script>--%>
</body>
</html>
