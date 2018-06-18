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
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>

    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>
    <style>

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
            background: #3791DA;
            color: white;
        }
        .listShow tr{
            border: 1px solid #c0c0c0;
        }
        .listShow td{
            padding: 7px;
            font: 14px "微软雅黑";
            text-align:left;
            padding-left:10px;
        }
        .titleText{
            font-size: 14px;
            margin-left: 46px;
            font-family: "微软雅黑";
            margin-top: 12px;
            margin-bottom: 10px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
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
        th{
            color:#2F5C8F;
            text-align:left;
            padding-left:10px;
        }
        table tr{
            height:40px;
            line-height:40px;
        }
        table.table{
            width:90%;
        }

       .clearfix:after{
             content:'';
             display: block;
             clear: both;
         }
        .fl{
            float: left;
        }
        .xia{margin-bottom: 18px;}


    </style>
</head>
<body>
<div class="content">
    <div class="right">
        <div class="title">
            <img src="../img/modifypassword.png" alt="修改OA账户">
            <span><fmt:message code="url.th.ModifyOA" /></span>
        </div>
        <div class="main" style="...">
            <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                <tr>
                    <td class="red_text"><fmt:message code="userName" />:</td>
                    <td>
                       <input id="username" type="text" readonly="readonly">
                    </td>
                </tr>
                <tr>
                    <td class="red_text"><fmt:message code="url.th.OriginalPW" />:</td>
                    <td>
                        <input type="password" id="oldpassword" class="pw"/>
                    </td>
                </tr>
                <tr>
                    <td class="red_text"><fmt:message code="url.th.newPW" />:</td>
                    <td>
                        <input type="password" id="password" class="pw"/><%--<fmt:message code="url.th.numbers" />--%>
                    </td>
                </tr>
                <tr>
                    <td class="red_text"><fmt:message code="url.th.Confirm" />:</td>
                    <td>
                        <input type="password" id="repassword" class="pw"  onblur="ValidateInput('password',this.value)"  onkeydown="validatePwdStrong(this.value);"/>
                        <span>6-20位，必须同时包含字母和数字</span><%--<fmt:message code="url.th.numbers" />--%>
                        <div class="clearfix" style="    width: 206px;height: 10px;border: 1px solid #ccc;margin-top: 5px;border-radius: 4px;" id="main">
                            <span class="fl" style="display:inline-block;width: 67px;height:10px;border-right: 1px solid #ccc" id="low"></span>
                            <span class="fl" style="display:inline-block;width: 67px;height:10px;border-right: 1px solid #ccc" id="medium"></span>
                            <span class="fl" style="display:inline-block;width: 68px;height:10px;" id="height"></span>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td class="red_text"><fmt:message code="url.th.LastModified" />:</td>
                    <td>
                        <span id="lastEditTime"></span>
                    </td>
                </tr>
                <tr>
                    <td class="red_text"><fmt:message code="url.th.PasswordExpired" />:</td>
                    <td>
                        <fmt:message code="url.th.passwordNeverExpires" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <div class="btn">
                            <input id="submit" type="button" class="inpuBtn backOkBtn"  value="&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="global.lang.save" />">
                        </div>
                    </td>
                </tr>
            </table>
        </div>

        <div  class="title xia">
            <img  src="../img/password_log.png" alt="密码日志">
            <span><fmt:message code="url.th.LastLogs" /></span>
        </div>
        <div style="text-align: -webkit-center;margin:0 auto">
            <table class="listShow" cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff;width: 90%;margin:0 auto">
                <thead>
                 <tr>
                      <th><fmt:message code="journal.th.user" /></th>
                      <th><fmt:message code="email.th.time" /></th>
                      <th><fmt:message code="journal.th.IPaddress" /></th>
                      <th><fmt:message code="notice.th.type" /></th>
                      <th><fmt:message code="journal.th.Remarks" /></th>
                  </tr>
                </thead>
                <tbody class="modifyPwdLogList">

                </tbody>
            </table>
        </div>
    </div>

</div>

<script>
    $(function(){
        $.ajax({
            type: "get",
            url: "<%=basePath%>getUsersByuserId",
            dataType: 'json',
            success: function (obj) {
                if(obj.flag){

//                    console.log(obj)
                    $('#username').val(obj.object.byname);
                    $('#username').attr('userId',obj.object.userId)
                    var timeStamp=obj.object.lastPassTime;
                    if(timeStamp!=undefined) {
                        var time = new Date(timeStamp);
                        var year = time.getFullYear();//年
                        var month = time.getMonth() + 1;//月
                        var date = time.getDate();//日
                        var hour = time.getHours(); //时
                        var minu = time.getMinutes(); //分
                        var conds = time.getSeconds(); //秒
                        var new_months;
                        var new_dates;
                        var new_hours;
                        var new_minus;
                        var new_condss;
                        if (month < 10) {
                            new_months = "0" + new_month
                        } else {
                            new_months = month;
                        }
                        if (date < 10) {
                            new_dates = "0" + date
                        } else {
                            new_dates = date;
                        }
                        if (minu < 10) {
                            new_minus = "0" + minu
                        } else {
                            new_minus = minu;
                        }
                        if (hour < 10) {
                            new_hours = "0" + hour;
                        } else {
                            new_hours = hour;
                        }
                        if (conds < 10) {
                            new_condss = "0" + conds;
                        } else {
                            new_condss = conds;
                        }
                        var str_time = year + "-" + new_months + "-" + new_dates + " " + new_hours + ":" + new_minus + ":" + new_condss;

                        $('#lastEditTime').html(str_time);
                    }else {
                        $('#lastEditTime').html("");
                    }
                }
            },
        });
        $('#submit').click(function(){
            var repassword = $('#repassword').val();
            var password = $('#password').val();
            var oldpassword = $('#password').val()
            if(password ==''){
                $.layerMsg({content:'<fmt:message code="url.th.PasswordNotEmpty" />！',icon:1},function(){
                    return false;
                });
            } else if(repassword == '' ){
                $.layerMsg({content:'<fmt:message code="url.th.VerifynotEmpty" />！',icon:1},function(){
                    return false;
                });
            }else if(oldpassword == ''){
                $.layerMsg({content:'<fmt:message code="url.th.TheOldNotEmpty" />！',icon:1},function(){
                   return false;
                });
            }else if(!/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{0,20}$/.test(password)){
                $.layerMsg({content:'密码必须为6-20位且同时包含字母和数字',icon:2},function(){
                    return false;
                });
            }else if(repassword == password){
                $.ajax({
                    type: "post",
                    url: "<%=basePath%>editPwd",
                    dataType: 'json',
                    data: {
                        password:$('#oldpassword').val(),
                        userId:$('#username').val(),
                        newPwd:$('#password').val()
                    },
                    success: function (obj) {
                        if(obj.flag){

                            $.layerMsg({content:'<fmt:message code="url.th.PasswordChangesSucceeded" />！',icon:1},function(){
                                 location.reload();
                            });
                        }else if(obj.msg == "原密码错误"){

                            $.layerMsg({content:"原密码错误" ,icon:2},function(){
                                // location.reload();
                            });

                        }else{
                            $.layerMsg({content:'<fmt:message code="url.th.PasswordModificationFailed" />！',icon:2},function(){
//                                 location.reload();
                        });
                        }
                    }
                });
            }else{
                $.layerMsg({content:'<fmt:message code="url.th.TwoPassword" />！',icon:0},function(){

                     location.reload();
                });
            }

        });




        //初始化修改登录日志列表显示
        logListShow();
    })
    //修改登录日志列表显示
    function logListShow(){
        $.ajax({
            type: "post",
            url: "/sys/getModifyPwdLog",
            dataType: 'json',
            success:function(data){
               var obj=data.obj;
               if(data.flag){
                   var str="";
                   for(var i=0;i<obj.length;i++){
                       str+='<tr><td>'+obj[i].userName+'</td><td>'+obj[i].time+'</td><td>'+obj[i].ip+'</td><td>'+obj[i].typeName+'</td><td>'+obj[i].remark+'</td></tr>';
                   }
                   $('.modifyPwdLogList').html(str.toString());
                   $('#lastEditTime').html(obj[0].time);
               }
            }
        })
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
        console.log(Evaluate(value))
        if (Evaluate(value) == 1) {
            colorInit();
            $('#low').css("backgroundColor","red")
            $('#medium').css("backgroundColor","#fff")
            $('#height').css("backgroundColor","#fff")

        }
        else if (Evaluate(value) == 2) {
            colorInit();
            $('#low').css("backgroundColor","#dfff36")
            $('#medium').css("backgroundColor","#dfff36")
            $('#height').css("backgroundColor","#fff")

        }
        else if (Evaluate(value) == 3) {
            colorInit();
            $('#low').css("backgroundColor","#2dff44")
            $('#medium').css("backgroundColor","#2dff44")
            $('#height').css("backgroundColor","#2dff44")
            $('#height').css("width","70")

        }


    }

</script>

</body>
</html>

