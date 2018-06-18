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
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery/jquery.cookie.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <style>
     #submit{
         margin-bottom: 50px;
         font-size: 14px;
         border: none;
         cursor: pointer;
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
         padding:0 15px;
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
         padding-left: 3px;
     }
     table.table {
         width: 100%;
         margin: 0px auto;
         font-size: 14px;
         margin-bottom: 40px;
     }
     table.table tr td input[type="text"]{
         padding-left: 5px;
     }
     table.table tr td p{
         color:#999;
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
     table.table tr th {
         height:39px;
         padding:0 10px 0px 43px;
     }
     #birthday{
         height:28px;
         width: 184px;
     }
     table.table tr td input[type="text"] {
         width: 200px;
         height: 28px;
     }

     table.table tr .blue_text{
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
            <img src="../img/information.png" alt="个人资料">
            <span><fmt:message code="url.th.personinfor" /></span>
        </div>
        <div class="addPerson" style="display: block;">
            <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                <tr class="colo" align="center">
                    <th colspan="2">
                        <span style="font-weight: bold"><fmt:message code="url.th.EssentialInformation" /></span>
                    </th>
                </tr>
                <tr class="padstyle">
                    <td class="blue_text"><fmt:message code="controller.th.wu" />：</td><%--登录账号--%>
                    <td>
                        <span id="byName" style="color: #000;"></span>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text" style="color: #000;"><fmt:message code="user.thklfg" />：</td><%--所在部门--%>
                    <td>
                        <span id="deptName" style="color: #000;"></span>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="userDetails.th.name" />：</td>
                    <td>
                        <span id="userName" uid="" style="color: #000;"></span>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="userDetails.th.post" />：</td><%--职务--%>
                    <td>
                        <span id="jobPosition" style="color: #000;"></span>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="workflow.th.nickname" />：</td><%--昵称--%>
                    <td>
                        <input type="text" id="nickName" class="bord"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text" ><fmt:message code="userDetails.th.Gender" />：</td>
                    <td>
                        <select id="sex">
                            <option value="0"><fmt:message code="userInfor.th.male" /></option>
                            <option value="1"><fmt:message code="userInfor.th.female" /></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="userDetails.th.Birthday" />：</td>
                    <td>
                        <input  id="birthday" onclick="laydate({istime: true, format: 'YYYY-MM-DD',max:laydate.now(),choose:shengxiaochange})" class="laydate-icon">
                        <%--<p style="display: inline-block;"> <input id="isLunar" type="checkbox" style="margin-left: 10px;margin-right: 5px;"><fmt:message code="url.th.Lunar" /></p>--%>
                    </td>
                </tr>
               <tr>
                    <td class="blue_text"><fmt:message code="url.th.Zodiac" />：</td>
                    <td>
                        <input readonly="true" type="text" id="bord" class="bord"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="url.th.constellation" />：</td>
                    <td>
                        <input readonly="true" type="text" name="xz" class="xz"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text" id="blood"><fmt:message code="url.th.BloodType" />：</td>
                    <td>
                        <select name="blood">
                            <option value="0">O</option>
                            <option value="1">A</option>
                            <option value="2">B</option>
                            <option value="3">AB</option>
                        </select>
                    </td>
                </tr>
            </table>
            <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                <tr class="colo" align="center">
                    <th colspan="2">
                        <span style="font-weight: bold"><fmt:message code="url.th.line" /></span>
                    </th>
                </tr>
                <tr class="padstyle">
                    <td class="blue_text"><fmt:message code="userInfor.th.Workphone" />：</td>
                    <td>
                        <input type="text" id="telNoDept" class="num"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="url.th.Workfax" />：</td>
                    <td>
                        <input type="text" id="faxNoDept" class="trans"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="userDetails.th.MobilePhone" />：</td>
                    <td>
                        <input type="text" id="mobilNo" class="phone"/>
                        <%--<p style="margin-top: 5px;"> <input  type="checkbox" style="margin-left: 10px;margin-right: 5px;"><fmt:message code="url.th.MobilePhone" /></p>
                        <p><fmt:message code="url.th.AfterFilling" /></p>--%>
                    </td>
                </tr>
                <%--<tr>
                    <td class="blue_text"><fmt:message code="userInfor.th.Workphone" />2：</td>
                    <td>
                        <input type="text" name="phone" class="phone"/>
                    </td>
                </tr>--%>
                <tr>
                    <td class="blue_text"><fmt:message code="main.email" />：</td>
                    <td>
                        <input type="text" id="email" class="email"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">QQ<fmt:message code="url.th.QQnumber" />：</td>
                    <td>
                        <input type="text" id="oicqNo" class="qq"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">MSN：</td>
                    <td>
                        <input type="text" id="msn" class="msn"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">ICQ<fmt:message code="url.th.QQnumber" />：</td>
                    <td>
                        <input type="text" id="icqNo" class="icq"/>
                    </td>
                </tr>
            </table>
            <table class="table" cellspacing="0" cellpadding="0" style="border-collapse:collapse;background-color: #fff">
                <tr class="colo" align="center">
                    <th colspan="2">
                        <span style="font-weight: bold"><fmt:message code="url.th.Family" /></span>
                    </th>
                </tr>
                <tr class="padstyle">
                    <td class="blue_text"><fmt:message code="url.th.Home" />：</td>
                    <td>
                        <input type="text" id="addHome" class="address"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="url.th.Familycode" />：</td>
                    <td>
                        <input type="text" id="postNoHome" class="addN"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="url.th.HomePhone" />：</td>
                    <td>
                        <input type="text" id="telNoHome" class="home"/>
                    </td>
                </tr>
            </table>
            <div style="margin:0 auto;width: 110px">
                <input id="submit" type="button" class="inpuBtn backOkBtn" value="&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="global.lang.save" />">

            </div>
        </div>
    </div>
</div>
<script>


    var Calculator = function () {
        /* *
         *  计算生肖
         *
         *      支持简写生日，比如01，转换为2001，89转换为1989；
         *      支持任何可以进行时间转换的格式，比如'1989/01/01','1989 01'等
         *
         * */
        function getShengXiao(birth) {
            birth += '';
            var len = birth.length;
            if (len < 4 && len != 2) {
                return false;
            }
            if (len == 2) {
                birth - 0 > 30 ? birth = '19' + birth : birth = '20' + birth;
            }
            var year = (new Date(birth)).getFullYear();
            var arr = ['猴', '鸡', '狗', '猪', '鼠', '牛', '虎', '兔', '龙', '蛇', '马', '羊'];
            return /^\d{4}$/.test(year) ? arr[year % 12] : "";
        }

        /* *
         *  计算星座
         *
         *      支持传递[月日]，[月,日]，[年月日]等格式，详见例子
         *
         * */
        function getAstro(month,day){
            var s="魔羯水瓶双鱼牡羊金牛双子巨蟹狮子处女天秤天蝎射手魔羯";
            var arr=[20,19,21,21,21,22,23,23,23,23,22,22];
            return s.substr(month*2-(day<arr[month-1]?2:0),2);
        }

        return{
            shengxiao: getShengXiao,
            astro: getAstro
        }
    }()


    function shengxiaochange(me){

        $('#bord').val(Calculator.shengxiao(me))
        $('[name="xz"]').val(Calculator.astro(me.split('-')[1],me.split('-')[1]))

    }

    $(function(){
        init();
        function init(){
            $.ajax({
                type: "get",
                type: "get",
                url: "<%=basePath%>user/findUserByuserId",
                dataType: 'json',
                data: {
                    userId:"${userId}"
                },
                success: function (obj) {
                    if(obj.flag){
                        var data = obj.object;
                        $("#byName").html(data.byname);
                        $("#deptName").html(data.deptName);
                        $("#nickName").val(data.userExt.nickName);
                        $("#jobPosition").html(data.postName);
                        $('#userName').html(data.userName);
                        $('#username').attr('uid',data.uid);
                        $('#sex').val(data.sex);
                        $('#birthday').val(data.birthday);
                        $('#telNoDept').val(data.telNoDept);
                        $('#faxNoDept').val(data.faxNoDept);
                        $('#mobilNo').val(data.mobilNo);
                        $('#email').val(data.email);
                        $('#oicqNo').val(data.oicqNo);
                        $('#msn').val(data.msn);
                        $('#icqNo').val(data.icqNo);
                        $('#addHome').val(data.addHome);
                        $('#postNoHome').val(data.postNoHome);
                        $('#telNoHome').val(data.telNoHome);
                        if(data.isLunar == 1){
                            $('#isLunar').prop('checked',true)
                        }

                        $('#bord').val(Calculator.shengxiao(data.birthday))
                        console.log(data.birthday.substring(data.birthday.indexOf('-')+1).replace('-',''))
                        $('[name="xz"]').val(Calculator.astro(data.birthday.split('-')[1],data.birthday.split('-')[2]))

                    }
                }
            });
        }



        $('#submit').click(function(){
//            alert(111);
            var data1={
                'uid':$.cookie('uid'),
                'userName': $('#userName').val(),
                'nickName':$("#nickName").val(),
                "sex": $('#sex option:checked').attr('value'),
                'birthday':$('#birthday').val(),
                'telNoDept':$('#telNoDept').val(),
                'faxNoDept':$('#faxNoDept').val(),
                'mobilNo':$('#mobilNo').val(),
                'bpNo':$('#bpNo').val(),
                'email':$('#email').val(),
                'oicqNo':$('#oicqNo').val(),
                'msn':$('#msn').val(),
                'icqNo':$('#icqNo').val(),
                'addHome':$('#addHome').val(),
                'postNoHome':$('#postNoHome').val(),
                'telNoHome':$('#telNoHome').val(),
                'isLunar':$('#isLunar').is(':checked') == true?1:0
            };
            $.ajax({
                type: "post",
                url: "<%=basePath%>user/editUser",
                dataType: 'json',
                data: data1,
                success: function (obj) {
                    console.log(obj);
                    $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                        location.reload();
                    });
                },
            });

        });







    })
    laydate({
        elem: '#birthday', //目标元素。
        format: 'YYYY-MM-DD', //日期格式
        istime: false, //显示时、分、秒
    });
</script>

</body>
</html>

