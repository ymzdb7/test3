<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script src="/js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/base.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title></title>
    <style>
        .noDatas {
            margin-top: 10px;
        }

        .noDatas_pic {
            margin-top: 20%;
        }

        .noData_out {
            margin: 0 auto;
            text-align: center;
        }

        .foot_span_show {
            float: right;
            color: white;
            line-height: 28px;
            margin-right: 15px;
            cursor: pointer
        }

        .head_rig h1 {
            width: 78px;
            height: 30px;
            font-size: 13px !important;
            background-image: url(../img/workflow/btn_new_nor_03.png), url(../img/workflow/icon_plus_03.png);
            cursor: pointer;
            background-repeat: no-repeat;
        }

        #cont_left::-webkit-scrollbar-corner {
            background: #82AFFF;
        }

        .head_rig {
            width: 480px;
            margin-top: 8px;
            float: right !important;;
        }
        .head_rig h1 {
            float: left;
            margin-right:20px;
        }

        .inp {
            height: 24px;
        }

        .search {
            width: 72px;
            height: 29px;
            margin-top: 16px;
            background: #fff;
        }

        .search h1 {
            text-align: center;
            color: #fff;
            font-size: 14px;
            line-height: 28px;
            background-image: url(../img/workflow/btn_check_nor_03.png);
            background-repeat: no-repeat;
        }

        .cont {
            width: 102%;
            height: 95%;
            overflow-y: scroll;
        }

        .head {
            border-bottom: 1px solid #9E9E9E;
            height: 42px;
        }
        .new_excell_pic {
            border-radius: 0;
            border: none;
            width: 73px;
            height: 73px;
            margin: 10px 24px 10px 20px;
        }

        .head_rig h1 :hover {
            cursor: pointer;
        }

        .deldel {
            color: #fff;
            font-size: 12px;
            float: right;
            margin-right: 10px;
            margin-left: 5px;
            line-height: 28px;
            cursor: pointer;
        }

        .footer_span_space {
            color: #fff;
            font-size: 12px;
            float: right;
            margin-right: 10px;
            line-height: 28px;
            cursor: pointer;
        }

        .foot_span_show {
            margin-left: 9px;
        }

        .edit {
            color: #fff;
            font-size: 12px;
            float: right;
            margin-right: 10px;
            margin-left: 5px;
            line-height: 28px;
            cursor: pointer;
        }

        .search h1 :hover {
            cursor: pointer;
        }

        .deldel_img {
            float: right;
            height: 15px;
            margin-top: 7px;
        }

        .edit_img {
            float: right;
            height: 15px;
            margin-top: 7px;
        }

        .deldel_yulan {
            float: right;
            height: 15px;
            margin-top: 7px;
            margin-right: 0px;
            cursor: pointer;
            margin-left: -4px;
        }

        .new_excell_footer {
            width: 100%;
            height: 28px;
            position: relative;
            background-color: #59bdf0;
        }

        .new_excell_head {
            position: relative;
            width: 100%;
            height: 30px;
        }

        .new_excell_name {
            border-left: 4px solid #59bdf0;
            color: #59bdf0;
            position: absolute;
            bottom: 0;
            font-size: 16px;
            font-weight: 700;
            height: 24px;
            margin-left: 20px;
        }

        .new_excell_info {
            width: 100%;
            height: 123px;
            position: relative;
        }

        .new_excell_center {
            margin-left: 6%;
            margin-top: 10px;
        }

        .new_excell_info_main {
            width: 100%;
            height: 62px;
            position: absolute;

        }

        .new_excell_info_other {
            position: absolute;
            top: 10px;
            height: 100%;
            margin-left: 45px;
            margin-top: 10px;
            list-style-type: none;
            left: 20%;
        }

        .new_excell_main {
            width: 332px;
            height: 181px;
            border: 1px solid #ddd;
            margin: auto;
            margin-top: 10px;
            border-radius: 5px;
        }

        .new_excell_main:hover {
            border: 2px solid #59bdf0;
        }

        .new_excell_info_mian_pic {
            float: left;
        }

        .new_excell {
            width: 360px;
            height: 191px;
            float: left;
            margin-left: 0px;
            margin-right: 0px;
        }

        .new_excell_info_other span {
            margin-left: 10px;
            color: black;
        }

        .new_excell_info_other li {
            height: 50%;
            line-height: 24px;
            font-size: 20px;
        }

        user agent stylesheet
        li {
            display: list-item;
            text-align: -webkit-match-parent;
        }

        .conter {
            width: 461px;
            height: 800px;
            margin: auto;
        }
        table{
            margin-bottom:20px;
        }

        .f_field_title {
            display: inline-block;
            font-size: 12px;
            font-weight: bold;
            height: 18px;
            line-height: 41px;
            margin-left: 2px;
            margin-right: 2px;
        }

        .f_field_required {
            color: red;
            font-size: 12px;
            margin-top: 0px;
            margin-left: 2px;
            margin-right: 2px;
        }

        .f_field_ctrl {
            margin-top: 5px;
            margin-left: 2px;
            float: left;
        }
        select {
            height: 32px;
            width: 207px;
            border-radius: 4px;
            border: 1px solid #cccccc;
            background-color: #ffffff;
        }

        .f_field_title {
            font-size: 12px;
            font-weight: bold;
            margin-left: 2px;
            margin-right: 2px;
        }

        .f_field_required {
            color: red;
            font-size: 12px;
            margin-top: 0px;
            margin-left: 2px;
            margin-right: 2px;
        }

        .f_field_ctrl {
            margin-top: 5px;
            margin-left: 2px;
        }

        .f_field_ctrl input {
            color: #000;
        }

        .f_field_block {
            width: 100%;
            height: 68px;
            margin-top: 70px;
            margin-bottom: 4px;
            display: block;
            text-align: left;
        }

        .inp {
            width: 221px;
            height: 32px;
            border-radius: 4px;
        }

        .center {
            height: 400px !important;
        }

        .delete_flow, .edit_liucheng {
            cursor: pointer;
        }

        .layui-layer-title {
            padding: 0 80px 0 20px;
            height: 42px;
            line-height: 42px;
            border-bottom: 1px solid #eee;
            font-size: 16px;
            color: #fff;
            overflow: hidden;
            background-color: #2b7fe0;
            border-radius: 2px 2px 0 0;
        }

        .layui-layer-page .layui-layer-btn {
            padding-top: 10px;
            text-align: center;
        }
        .otherStu{
            background: powderblue;
        }
        .close_but{
            width: 105px;
            height: 30px;
            line-height: 30px;
            border-radius: 4px;
            cursor: pointer;
            background: rgba(128, 128, 128, 0.15);
            font-size: 12pt;
            color:#333;
            font-family: "微软雅黑";
            border:1px solid #c0c0c0;

        }
        .new_but{
            margin-left:0px;
            padding-left:0px;
            color:#333;
            background: rgba(128, 128, 128, 0.15);
            border:1px solid #c0c0c0;

        }

        #save{
            background:url(../../img/vote/saveBlue.png) no-repeat;
            color:#fff;
            line-height:30px;
            font-size:16px;
            width:91px;
            height: 30px;
            cursor: pointer;
            display: inline-block;

        }
        #close{
            background:url(../../img/edu/back.png) no-repeat;
            color:#000;
            line-height:30px;
            font-size:16px;
            width:161px;
            height: 30px;
            cursor: pointer;
            display: inline-block;
        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<%--新建学生--%>
<div class="step1" style="display: block;margin-left: 10px;">
    <table class="newNews">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="../../img/sys/new_dept.png"></div>
            <div class="nav_t2" class="news">学生编辑</div>
        </div>
        <tbody>
        <tr class="otherStu">
            <td colspan="2">
                学生基本信息
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                学号：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="studentNo" disabled/>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                姓名：
            </td>
            <td>
                <input class="td_title1" id="studentName" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                年级班级：
            </td>
            <td>
                <span>年级</span>
                <select class="ban" id="nianJi" type="text" placeholder="">
                    <option  value="">—选择—</option>
                </select>
                <span>班级</span>
                <select class="ban" id="banJi" type="text" placeholder="">
                    <option  value="">—选择—</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class="blue_text">
                届：
            </td>
            <td>
                <select name="" class="td_title1 time_coumon" id="deptAddress">
                    <option value="">-选择-</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                学生排序号：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="sortNum" type="text" placeholder=""/>
                用于同角色学生的排序，不能是大于65535的数字
            </td>
        </tr>

        <tr>
            <td class="blue_text">
                性别：
            </td>
            <td>
                <select class="sex" id="sex" type="text" placeholder="">
                    <option  value="0">男</option>
                    <option  value="1">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                生日：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="birthday" onclick="laydate(start)"  type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                手机：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="phoneNumber" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                电子邮件：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="email" type="text" placeholder=""/>
            </td>
        </tr>
        </tbody>
        <tbody>
        <tr class="otherStu">
            <td colspan="2">
                家长基本信息
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                姓名：
            </td>
            <td>
                <input class="td_title1" id="parentName" type="text" placeholder=""/>
            </td>
        </tr>

        <tr>
            <td class="blue_text">
                性别：
            </td>
            <td>
                <select class="sex" id="psex" type="text" placeholder="">
                    <option value="0">男</option>
                    <option  value="1">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                生日：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="pbirthday" onclick="laydate(start)" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                手机：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="perPhoneNumber" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                电子邮件：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="pemail" type="text" placeholder=""/>
            </td>
        </tr>
        </tbody>

        <tr class="otherStu" id="other">
            <td colspan="2">
                学生扩展信息
            </td>
        </tr>
        <tbody class="body" style="display: none">
        <tr>
            <td class="td_w blue_text">
                学籍号：
            </td>
            <td>
                <input class="td_title1 time_coumon" type="text" placeholder="" id="schoolNo"/>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                入学年份：
            </td>
            <td>
                <select name="" id="year">
                    <option value="">-选择-</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                姓名拼音：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="nameSpell" type="text" placeholder=""/>
            </td>
        </tr>

        <tr>
            <td class="blue_text">
                英文名：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="EnglishName" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                民族：
            </td>
            <td>
                <select name="" class="td_title1 time_coumon" id="nation">
                    <%--<option value="" selected="true">-选择-</option>--%>
                    <option value="">-选择-</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                籍贯：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="nativePlace" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                身份证号：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="idNum" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                户口性质：
            </td>
            <td>
                <select class="td_title1 time_coumon" id="registerType" type="text" placeholder="">
                    <option  value="0"></option>
                    <option  value="1">农村户口</option>
                    <option  value="2">城市户口</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                户口所在地：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="register" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                国籍/地区：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="nationnalityAddress" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                政治面貌：
            </td>
            <td>
                <select class="political" id="political" type="text" placeholder="">
                    <option  value="0"></option>
                    <option  value="1">少先队员</option>
                    <option  value="2">团员</option>
                    <option  value="3">预备党员</option>
                    <option  value="4">党员</option>
                    <option  value="5">群众</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                宗教信仰：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="religious" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                现住址：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="nowAddress" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                通讯地址：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="inforAddress" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                邮政编码：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="postalCode" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                座右铭：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="motto" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                血型：
            </td>
            <td>
                <select class="blood" id="blood" type="text" placeholder="">
                    <option  value="0"></option>
                    <option  value="1">A</option>
                    <option  value="2">B</option>
                    <option  value="3">O</option>
                    <option  value="4">AB</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                个人简介：
            </td>
            <td>
                <textarea name="" cols="60" rows="5" id="personFunc"></textarea>
            </td>
        </tr>
        </tbody>
        <div>
            <tr>
                <td colspan="2" style="text-align:center">
                    <span id="save">保存</span>
                    <span id="close">返回学生管理</span>
                </td>
            </tr>
        </div>
    </table>


</div>

</body>
<script type="text/javascript">
    $(function () {
        //新建学生信息
        $('#new').click(function () {
            var data={
                //学生基本信息
                userId:$('#studentNo').val(),
                userName:$('#userName').val(),
                semeter:$('#deptAddress').val(),
                classNo:$('#sortNum').val(),
                password:$('#password').val(),
                sex:$('#sex option:selected').text(),
                birthday:$('#birthday').val(),
                mobilNo:$('#phoneNumber').val(),
                email:$('#email').val(),
                //家长信息
                /* userId:$('#parentName').val(),*/
                pPassword:$('#passwords').val(),
                pUserName:$('#parentName').val(),
                pSex:$('#psex option:selected').text(),
                pBirthday:$('#pbirthday').val(),
                pMobilNo:$('#perPhoneNumber').val(),
                pEmail:$('#pemail').val(),
                //学生扩展信息
                grade:$('#nianJi option:selected').text(),
                clazz:$('#banJi option:selected').text(),
                studentNumber:$('#schoolNo').val(),//学籍号
                schoolYear:$('#year').val(),//入学年份
                nameSpelling:$('#nameSpell').val(),
                englishName:$('#EnglishName').val(),
                nation:$('#nation').val(),
                nativePlace:$('#nativePlace').val(),
                idNumber:$('#idNum').val(),
                accountProperty:$('#registerType').val(),
                permanentAddr:$('#register').val(),
                nationnality:$('#nationnalityAddress').val(),
                religion:$('#political option:selected').text(),
                religious:$('#religious').val(),
                presentAddr:$('#nowAddress').val(),
                postalAddr:$('#inforAddress').val(),
                postalCode:$('#postalCode').val(),
                motto:$('#motto').val(),
                bloodType:$('#blood option:selected').text(),
                introduce:$('#personFunc').text()
            }
            $.ajax({
                type: 'post',
                url: '/edu/student/addStudent',
                dataType: 'json',
                data: data,
                success: function (res) {
                    if (res.flag) {
                        $.layerMsg({content: '新建成功！', icon: 1});
                        init();
                    } else {
                        $.layerMsg({content: '新建失败！', icon: 2});
                    }
                }
            })

        })

    })
    var classId=$.GetRequest().classId;
    var title=decodeURI($.GetRequest().title)

//    点击返回学生管理
    $('#close').click(function(){
        self.parent.document.getElementById("iframe").src='/edu/student/eduStudentList?classId='+classId+"&title="+encodeURI(title);
        parent.location.reload();
    })


    $(function () {

        //学生编辑
        function getCookie (key) {
            var arr=document.cookie.split('; ');
            for (var i = 0; i < arr.length; i++) {
                var arr2=arr[i].split('=');
                if(arr2[0]==key){
                    return arr2[1];
                }
            }
            return false;
        }
        var editId=getCookie('editId');
        $.ajax({
            type:'get',
            url:'/edu/student/getStudentInforByUserId',
            dataType:'json',
            data:{uid:editId},
            success:function(reg){
                    var data=reg.object;

//                  学生具体信息
                    $('#studentNo').val(data[0].userId);
                    $('#studentName').val(data[0].userName);//姓名
                    $("#nianJi option:contains('"+data[2].grade+"')").attr("selected", true);//年级
//                    $("#banJi option:contains('"+data[2].clazz+"')").attr("selected", true)
                    $("#banJi option:selected").text(data[2].clazz)//班级

//                    $("#deptAddress option:contains('"+data[2].semeter+"')").attr("selected", true);//届
                    $('#deptAddress').val(data[2].semeter);
                    $('#sortNum').val(data[0].userNo);//学生排序号
                    $('#sex option:selected').text(data[0].sex==0?'男':'女');
                    $('#birthday').val(data[0].birthday)
                    $('#phoneNumber').val(data[0].mobilNo)
                    $('#email').val(data[0].email)
                    //家长信息
                    $('#parentName').val(data[1].userName)
                    $('#psex option:selected').text(data[1].sex==0?'男':'女')
                    $('#pbirthday').val(data[1].birthday)
                    $('#perPhoneNumber').val(data[1].mobilNo)
                    $('#pemail').val(data[1].email)
                    //学生扩展信息
                    $('#schoolNo').val(data[2].studentNumber)//学籍号
                    $("#year option:contains('"+data[2].schoolYear+"')").attr("selected", true);//入学年份
                    $('#nameSpell').val(data[2].nameSpelling)//拼音
                    $('#EnglishName').val(data[2].englishName)//英文名
                    $("#nation option:contains('"+data[2].nation+"')").attr("selected", true);//民族
                    $('#nativePlace').val(data[2].nativePlace)//籍贯
                    $('#idNum').val(data[2].idNumber)//身份证号
                    $("#registerType option:contains('"+data[2].accountProperty+"')").attr("selected", true);//户口性质
                    $('#register').val(data[2].permanentAddr)//户口所在地
                    $('#nationnalityAddress').val(data[2].nationnality)//国籍、地区
                    $("#political option:contains('"+data[2].religion+"')").html("selected", true);//政治面貌
                    $('#religious').val(data[2].religious)//宗教
                    $('#nowAddress').val(data[2].presentAddr)//现住址
                    $('#inforAddress').val(data[2].postalAddr)//通讯地址
                    $('#postalCode').val(data[2].zip)//邮政编码
                    $('#motto').val(data[2].motto)//座右铭
                    $("#blood option:contains('"+data[2].bloodType+"')").html("selected", true);//血型
                    $('#personFunc').text(data[2].introduce)//个人简介

            }
        })
//        点击保存
        $('#save').click(function () {
            var data={
                //学生基本信息
                uid:editId,
                userId:$('#studentNo').val(),
                userName:$('#studentName').val(),
                semeter:$('#deptAddress').val(),
                classNo:$('#sortNum').val(),
                sex:$('#sex option:selected').val(),
                birthday:$('#birthday').val(),
                mobilNo:$('#phoneNumber').val(),
                email:$('#email').val(),
                //家长信息
                /* userId:$('#parentName').val(),*/
                pUserName:$('#parentName').val(),
                pSex:$('#psex option:selected').val(),
                pBirthday:$('#pbirthday').val(),
                pMobilNo:$('#perPhoneNumber').val(),
                pEmail:$('#pemail').val(),
                //学生扩展信息
                grade:$('#nianJi option:selected').text(),
                clazz:$('#banJi option:selected').text(),
                studentNumber:$('#schoolNo').val(),//学籍号
                schoolYear:$('#year').val(),//入学年份
                nameSpelling:$('#nameSpell').val(),
                englishName:$('#EnglishName').val(),
                nation:$('#nation').val(),
                nativePlace:$('#nativePlace').val(),
                idNumber:$('#idNum').val(),
                accountProperty:$('#registerType').val(),
                permanentAddr:$('#register').val(),
                nationnality:$('#nationnalityAddress').val(),
                religion:$('#political option:selected').val(),
                religious:$('#religious').val(),
                presentAddr:$('#nowAddress').val(),
                postalAddr:$('#inforAddress').val(),
                postalCode:$('#postalCode').val(),
                motto:$('#motto').val(),
                bloodType:$('#blood option:selected').val(),
                introduce:$('#personFunc').text()
            }
            $.ajax({
                type: 'post',
                url: '/edu/student/updateStudent',
                dataType: 'json',
                data: data,
                success: function (res) {
                    if (res.flag) {
                        $.layerMsg({content: '编辑成功！', icon: 1});
                        parent.location.reload();
//                        history.go(-1)
                    } else {
                        $.layerMsg({content: '编辑失败！', icon: 2});
                    }
                }
            })

        })



    })
    //    获取年级和班级
    function getGrade(){
        $.ajax({
            url:'/edu/student/getGrade',
            type:'get',
            dataType:'json',
            success:function(reg){
                var datas=reg.obj;
                var str=""
                for(var i=0;i<datas.length;i++){
                    str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                }
                $('#nianJi').html(str);
                $('#nianJi').change(function(){
                    var sId=$(this).val();
                    $.ajax({
                        url:'/edu/student/getClassByDeptId',
                        type:'get',
                        data:{deptId:sId},
                        dataType:'json',
                        success:function(reg){
                            var datas=reg.obj;
                            var str="";
                            /*$('#banJi').html('<option value="" selected="true">请选择</option>');*/
                            for(var i=0;i<datas.length;i++){
                                str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                            }
                            $('#banJi').html(str);
                        }
                    })
                })
            }
        })
    }
    getGrade();
    //  获取学年控件
    function getYear(year){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:'EDU_YEAR_NO'},
            dataType:'json',
            //data:datas,
            success:function(reg){

                var datas=reg.obj;
                for (var i=0;i<datas.length;i++){
                    if(datas[i].codeOrder==13){
                        var str='<option value="'+datas[i].codeOrder+'" selected="true">'+datas[i].codeName+'</option>';
                    }else{
                        var str='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                    }
                    $(year).append(str);
                }

            }
        })
    }
    getYear('#year');

    //  获取届控件
    function getYears(deptAddress){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:'PRIMARY_SCHOOL'},
            dataType:'json',
            //data:datas,
            success:function(reg){

                var datas=reg.obj;
                for (var i=0;i<datas.length;i++){
                    if(datas[i].codeOrder==18){
                        var str='<option value="'+datas[i].codeOrder+'" selected="true">'+datas[i].codeName+'</option>';
                    }else{
                        var str='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                    }
                    $(deptAddress).append(str);
                }

            }
        })
    }
    getYears('#deptAddress');

    //伸缩下拉框
    $('#other').click(function () {
        $('.body').toggle();
    })


    /*
     * 初始化页面下拉框
     * @param id 需要初始化下拉框id
     * @param datas  需要初始化下拉框数据
     *  @param data  初始化当前的数据
     */
    //民族下拉框选择
    var _national = [{key:'01',value:'汉族'},{key:'02',value:'壮族'},{key:'03',value:'满族'},{key:'04',value:'回族 '},{key:'05',value:'苗族'},{key:'06',value:'维吾尔族 '},{key:'07',value:'土家族'},{key:'08',value:'彝族'},{key:'09',value:'蒙古族'},{key:'10',value:'藏族'},{key:'11',value:'布依族'},{key:'12',value:'侗族'},{key:'13',value:'瑶族'},{key:'14',value:'朝鲜族'},{key:'15',value:'白族'},{key:'16',value:'哈尼族'},{key:'17',value:'哈萨克族'},{key:'18',value:'黎族'},{key:'19',value:'傣族'},{key:'20',value:'畲族'},{key:'21',value:'傈僳族  '},{key:'22',value:'仡佬族'},{key:'23',value:'东乡族'},{key:'24',value:'高山族'},{key:'25',value:'拉祜族'},{key:'26',value:'水族'},{key:'27',value:'佤族'},{key:'28',value:'纳西族'},{key:'29',value:'羌族'},{key:'30',value:'土族'},{key:'31',value:'仫佬族'},{key:'32',value:'锡伯族'},{key:'33',value:'柯尔克孜族'},{key:'34',value:'达斡尔族'},{key:'35',value:'景颇族  '},{key:'36',value:'毛南族'},{key:'37',value:'撒拉族'},{key:'38',value:'布朗族'},{key:'39',value:'塔吉克族'},{key:'40',value:'阿昌族'},{key:'41',value:'普米族'},{key:'42',value:'鄂温克族'},{key:'43',value:'怒族'},{key:'44',value:'京族'},{key:'45',value:'基诺族'},{key:'46',value:'德昂族'},{key:'47',value:'保安族'},{key:'48',value:'俄罗斯族'}]

    function initSelect(element){
        var str='';
        for(var i=0;i<_national.length;i++){
            str+='<option value="'+_national[i].key+'">'+_national[i].value+'</option>';
        }
        element.append(str);
    }

    initSelect($('#nation'));
    /*时间控件调用*/
    var start = {
        elem: '#STAFF_BIRTH',
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        /* choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas; //将结束日的初始值设定为开始日
         }*/
        choose:get_animal_sign
        //回调函数
    };
    laydate(start);
    var end = {
        format: 'YYYY/MM/DD hh:mm:ss',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
</script>

</html>
