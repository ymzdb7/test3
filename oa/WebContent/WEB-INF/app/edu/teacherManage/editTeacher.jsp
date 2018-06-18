<%--
  Created by IntelliJ IDEA.
  User: CY
  Date: 2018/3/7
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <title>编辑教师信息</title>
    <style>
        table tr td{
            /*border:none;*/
            /*border:1px solid #c0c0c0;*/
        }
        td:nth-child(2n-1){
            text-align: right;
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        input[type=text]{
            width:80%;
            /*border-radius: 3px;*/
            height:28px;
            line-height: 28px;
            font-size:14px;
        }
        input[type=radio]{
            width: 16px;
            height:16px;
        }
        label span{
            font-size:14px;
        }
        #save {
            background: url(../../img/vote/saveBlue.png) no-repeat;
            color: #fff;
            line-height: 30px;
            font-size: 16px;
            width: 91px;
            height: 30px;
            cursor: pointer;
            padding-left: 11px;

        }
        #return{
            width: 90px;
            height: 30px;
            line-height: 30px;
            font-size: 16px;
            margin: 0 auto;
            background: url(../../img/vote/return.png) no-repeat;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="nav_box clearfix">
        <div class="nav_t1"><img style="margin-top: 25px;margin-left: 20px;" src="/img/commonTheme/${sessionScope.InterfaceModel}/new_dept.png"></div>
        <div class="nav_t2 news" >编辑教师</div>
    </div>
    <div class="section">
        <div class="table">
            <form action="/teachering/editinfo" id="dataSave">
                <table>
                    <tbody>


                    <tr>
                        <td style="width: 16%;">学校标识码<b style="color: red;">*</b>：</td>
                        <td style="width: 16%;"><input type="text" name="ssxxNo" id="dept"><a href="javascript:;" id="chose">选择</a></td>
                        <td style="width: 16%;">姓名：</td>
                        <td style="width: 16%;"><input type="text" name="name"></td>
                        <td style="width: 16%;">性别：</td>
                        <td style="width: 16%;"><input type="text" name="sex"></td>

                    </tr>
                    <tr>
                        <td style="width: 16%;">民族：</td>
                        <td style="width: 16%;"><input type="text"  name="nation"></td>
                        <td style="width: 16%;">曾用名：</td>
                        <td style="width: 16%;"><input type="text" name="preName"></td>
                        <td style="width: 16%;">教职工号：</td>
                        <td style="width: 16%;"><input type="text" name="staffNumber"></td>

                    </tr>
                    <tr>
                        <td style="width: 16%;">国籍/地区：</td>
                        <td style="width: 16%;"><input type="text"  name="nationArea"></td>
                        <td>联系电话：</td>
                        <td><input type="text"  name="pohne"></td>
                        <%--<td>所属学校：</td>--%>
                        <%--<td><input type="text"  name="ssxx"></td>--%>
                        <td>港澳台情况：</td>
                        <td><input type="text"  name="situation"></td>
                    </tr>
                    <tr>
                        <td>政治面貌：</td>
                        <td><input type="text"  name="political"></td>
                        <td style="width: 16%;">个人标识码：</td>
                        <td style="width: 16%;"><input type="text" name="personCode"></td>
                        <td style="width: 16%;">身份证件类型：</td>
                        <td style="width: 16%;"><input type="text" name="idCardType"></td>

                    </tr>
                    <tr>
                        <td style="width: 16%;">出生地：</td>
                        <td style="width: 16%;"><input type="text"  name="birthArea"></td>
                        <td>出生日期：</td>
                        <td><input type="text"  name="birth" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td>身份证号：</td>
                        <td><input type="text"  name="idCard"></td>

                    </tr>
                    <tr>
                        <td>电子邮箱：</td>
                        <td><input type="text"  name="email"></td>
                        <td style="width: 16%;">婚姻状况：</td>
                        <td style="width: 16%;"><input type="text" name="maritalStatus"></td>
                        <td style="width: 16%;">健康状况：</td>
                        <td style="width: 16%;"><input type="text" name="health"></td>

                    </tr>
                    <tr>
                        <td style="width: 16%;">进本校时间：</td>
                        <td style="width: 16%;"><input type="text"  name="joinSchoolTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td style="width: 16%;">教职工来源：</td>
                        <td style="width: 16%;"><input type="text" name="staffSource"></td>
                        <td style="width: 16%;">教职工类别：</td>
                        <td style="width: 16%;"><input type="text" name="staffType"></td>

                    </tr>

                    <tr>
                        <td style="width: 16%;">签订合同情况：</td>
                        <td style="width: 16%;"><input type="text"  name="contractSign"></td>
                        <td>参加工作时间：</td>
                        <td><input type="text"  name="jobStartime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td>岗位分类：</td>
                        <td><input type="text"  name="postCate"></td>

                    </tr>
                    <tr>
                        <td>岗位学段：</td>
                        <td><input type="text"  name="post"></td>
                        <td>户口所在地：</td>
                        <td><input type="text"  name="origin"></td>
                        <td>家庭地址：</td>
                        <td><input type="text"  name="address"></td>

                    </tr>
                    <tr>
                        <td>通讯地址：</td>
                        <td><input type="text"  name="postalAddress"></td>
                        <td>第一学历：</td>
                        <td><input type="text"  name="firstEdu"></td>
                        <td>第一学历专业：</td>
                        <td><input type="text"  name="firstEduMajor"></td>

                    </tr>
                    <tr>
                        <td>第一学历获得日期：</td>
                        <td><input type="text"  name="firstEduDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td>第一学历毕业院校：</td>
                        <td><input type="text"  name="firstEduSchool"></td>
                        <td>最高学位：</td>
                        <td><input type="text"  name="heighestDegree"></td>

                    </tr>
                    <tr>
                        <td>最高学历：</td>
                        <td><input type="text"  name="heighestEdu"></td>
                        <td>最高学历专业：</td>
                        <td><input type="text"  name="heighestEduMajor"></td>
                        <td>最高学历获得日期：</td>
                        <td><input type="text"  name="majorDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>

                    </tr>
                    <tr>
                        <td>最高学历毕业院校：</td>
                        <td><input type="text"  name="majorEduSchool"></td>
                        <td style="width: 16%;">最高学位名称：</td>
                        <td style="width: 16%;"><input type="text" name="heighestDegreeName"></td>
                        <td style="width: 16%;">当前业务：</td>
                        <td style="width: 16%;"><input type="text" name="nowBusiness"></td>

                    </tr>
                    <tr>
                        <td style="width: 16%;">用人形式：</td>
                        <td style="width: 16%;"><input type="text"  name="humanForm"></td>
                        <td>教师资格证书类型：</td>
                        <td><input type="text"  name="teacherBookType"></td>
                        <td>教师资格证书编号：</td>
                        <td><input type="text"  name="teacherBookNo"></td>


                    </tr>
                    <tr>
                        <td>取得HSK证书等级：</td>
                        <td><input type="text"  name="getHskbookGrade"></td>
                        <td>HSK证书获得日期：</td>
                        <td><input type="text"  name="hskbookDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td>取得MHK证书等级：</td>
                        <td><input type="text"  name="getMhkbookGrade"></td>


                    </tr>
                    <tr>
                        <td>MHK证书获得日期：</td>
                        <td><input type="text"  name="mhkbookDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td>普通话证书水平等级：</td>
                        <td><input type="text"  name="putonghuaLevel"></td>
                        <td>普通话证书获得日期：</td>
                        <td><input type="text"  name="putonghuaDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>

                    </tr>
                    <tr>
                        <td>岗位聘任技术职务：</td>
                        <td><input type="text"  name="postEmeployTechnical"></td>
                        <td>岗位专业技术职务：</td>
                        <td><input type="text"  name="professionalPost"></td>
                        <td>开始任教日期：</td>
                        <td><input type="text"  name="startTeachingDate" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>


                    </tr>
                    <tr>
                        <td>现任主要教学段：</td>
                        <td><input type="text"  name="teachingSection"></td>
                        <td>现任主要年级：</td>
                        <td><input type="text"  name="teachingGrade"></td>
                        <td>现任主要教学科：</td>
                        <td><input type="text"  name="teachingSubject"></td>


                    </tr>
                    <tr>
                        <td>现任教语言：</td>
                        <td><input type="text"  name="teachLanguage"></td>
                        <td>是否在岗：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isInpost"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isInpost"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否在编：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isInseries"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isInseries"  value="1">
                                <span>否</span>
                            </label>
                        </td>

                    </tr>
                    <tr>
                        <td>是否为民语普通班授课教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isNationteacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isNationteacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>

                        <td>是否汉语普通班授课教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isChineseteacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isChineseteacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否双语教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isDoubleteacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isDoubleteacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>


                    </tr>
                    <tr>
                        <td>双语授课模式：</td>
                        <td><input type="text"  name="doubleTeachModel"></td>
                        <td>是否具备国家通用语言授课能力：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isAbility"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isAbility"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>专任教师不任课原因：</td>
                        <td><input type="text"  name="noteachReasion"></td>


                    </tr>
                    <tr>
                        <td>是否为少数民族母语教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isEthnicTeacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isEthnicTeacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否为特岗教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isSpecialTeacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isSpecialTeacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否受过特教专业培训：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isSpecialTrain"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isSpecialTrain"  value="1">
                                <span>否</span>
                            </label>
                        </td>


                    </tr>
                    <tr>
                        <td>是否是县级及以上骨干教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isBackoneTeacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isBackoneTeacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>教职工变动（增加）：</td>
                        <td><input type="text"  name="staffIncrease"></td>
                        <td>教职工变动（减少）：</td>
                        <td><input type="text"  name="staffDecrease"></td>

                    </tr>
                    <tr>
                        <td>人员状态：</td>
                        <td><input type="text"  name="personStatus"></td>
                        <td>现任岗位等级：</td>
                        <td><input type="text"  name="nowPostLevel"></td>
                        <td>信息技术应用能力：</td>
                        <td><input type="text"  name="applicationAbility"></td>

                    </tr>
                    <tr>
                        <td>是否有特殊教育从业证书：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isSpecialEduBook"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isSpecialEduBook"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否属于免费(公费)师范生：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isFreeStudent"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isFreeStudent"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否参加基层服务项目：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isPartEdu"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isPartEdu"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                    <tr>
                        <td>是否是特级教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isSpecialpostTeacher"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isSpecialpostTeacher"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否全日制师范类专业毕业：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isFulltimeGrd"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isFulltimeGrd"  value="1">
                                <span>否</span>
                            </label>
                        </td>
                        <td>是否心理健康教育教师：</td>
                        <td>
                            <label for="">
                                <input type="radio" name="isHeartHealthTeach"  value="0">
                                <span>是</span>
                            </label>
                            <label for="">
                                <input type="radio" name="isHeartHealthTeach  value="1">
                                <span>否</span>
                            </label>
                        </td>

                    </tr>
                    <tr>
                        <td>参加基层服务项目起始时间：</td>
                        <td><input type="text"  name="partEduStartime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                        <td>参加基层服务项目结束时间：</td>
                        <td><input type="text"  name="partEduEndtime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>

                    </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td colspan="6" style="text-align: center;">
                            <button id="save" type="button">保存</button>
                            <button id="return" type="button">返回</button>
                        </td>
                    </tr>
                    </tfoot>

                </table>
            </form>

        </div>
    </div>
</div>
<script>

    $('#chose').click(function(){
        dept_id='dept';
        $.popWindow("../../common/selectSchool?0");
    })

    var type=$.GetRequest().type;
    var id=$.GetRequest().id;

    if(type==0){
        $('.nav_t2').html('教师信息')
        $('input').attr('disabled','disabled');
        $('#save').hide()
        $('#chose').hide();
    }else{
        $('.nav_t2').html('编辑教师信息')
        $('input').removeAttr('disabled')
        $('#save').show()
        $('#chose').show();
    }

    $.ajax({
        url:'/teachering/selectObjectById',
        type:'get',
        dataType:'json',
        data:{id:id},
        success:function(res){
            var data=res.object;
            $('#dept').val(data.ssxxNo)
//            $('#dept').attr('deptid',data.ssxxNo)
            $('input[name="ssxxNo"]').val(data.ssxxNo)
            $('input[name="name"]').val(data.name)
            $('input[name="nation"]').val(data.nation)
            $('input[name="sex"]').val(data.sex)
            $('input[name="idCard"]').val(data.idCard)
            $('input[name="ssxx"]').val(data.ssxx)
            $('input[name="jobStartime"]').val(data.jobStartime)
            $('input[name="political"]').val(data.political)
            $('input[name="pohne"]').val(data.pohne)
            $('input[name="postCate"]').val(data.postCate)
            $('input[name="post"]').val(data.post)
            $('input[name="birth"]').val(data.birth)
            $('input[name="origin"]').val(data.origin)
            $('input[name="address"]').val(data.address)
            $('input[name="postalAddress"]').val(data.postalAddress)
            $('input[name="email"]').val(data.email)
            $('input[name="isInseries"][value="'+data.isInseries+'"]').prop('checked',true)
            $('input[name="heighestDegree"]').val(data.heighestDegree)
            $('input[name="heighestEdu"]').val(data.heighestEdu)
            $('input[name="heighestEduMajor"]').val(data.heighestEduMajor)
            $('input[name="majorDate"]').val(data.majorDate)
            $('input[name="majorEduSchool"]').val(data.majorEduSchool)
            $('input[name="firstEdu"]').val(data.firstEdu)
            $('input[name="firstEduMajor"]').val(data.firstEduMajor)
            $('input[name="firstEduDate"]').val(data.firstEduDate)
            $('input[name="firstEduSchool"]').val(data.firstEduSchool)
            $('input[name="teacherBookType"]').val(data.teacherBookType)
            $('input[name="teacherBookNo"]').val(data.teacherBookNo)
            $('input[name="getHskbookGrade"]').val(data.getHskbookGrade)
            $('input[name="hskbookDate"]').val(data.hskbookDate)
            $('input[name="getMhkbookGrade"]').val(data.getMhkbookGrade)
            $('input[name="mhkbookDate"]').val(data.mhkbookDate)
            $('input[name="putonghuaLevel"]').val(data.putonghuaLevel)
            $('input[name="putonghuaDate"]').val(data.putonghuaDate)
            $('input[name="startTeachingDate"]').val(data.startTeachingDate)
            $('input[name="postEmeployTechnical"]').val(data.postEmeployTechnical)
            $('input[name="professionalPost"]').val(data.professionalPost)
            $('input[name="teachingSection"]').val(data.teachingSection)
            $('input[name="teachingGrade"]').val(data.teachingGrade)
            $('input[name="teachingSubject"]').val(data.teachingSubject)
            $('input[name="noteachReasion"]').val(data.noteachReasion)
            $('input[name="teachLanguage"]').val(data.teachLanguage)
            $('input[name="isNationteacher"][value="'+data.isNationteacher+'"]').prop('checked',true)
            $('input[name="isChineseteacher"][value="'+data.isChineseteacher+'"]').prop('checked',true)
            $('input[name="isDoubleteacher"][value="'+data.isDoubleteacher+'"]').prop('checked',true)
            $('input[name="doubleTeachModel"]').val(data.doubleTeachModel)
            $('input[name="situation"]').val(data.situation)
            $('input[name="staffIncrease"]').val(data.staffIncrease)
            $('input[name="staffDecrease"]').val(data.staffDecrease)
            $('input[name="isAbility"][value="'+data.isAbility+'"]').prop('checked',true)
            $('input[name="isInpost"][value="'+data.isInpost+'"]').prop('checked',true)
            $('input[name="isEthnicTeacher"][value="'+data.isEthnicTeacher+'"]').prop('checked',true)
            $('input[name="isSpecialTeacher"][value="'+data.isSpecialTeacher+'"]').prop('checked',true)
            $('input[name="isBackoneTeacher"][value="'+data.isBackoneTeacher+'"]').prop('checked',true)
            $('input[name="isSpecialTrain"][value="'+data.isSpecialTrain+'"]').prop('checked',true)

            $('input[name="preName"]').val(data.preName)
            $('input[name="staffNumber"]').val(data.staffNumber)
            $('input[name="nationArea"]').val(data.nationArea)
            $('input[name="personCode"]').val(data.personCode)
            $('input[name="idCardType"]').val(data.idCardType)
            $('input[name="birthArea"]').val(data.birthArea)
            $('input[name="maritalStatus"]').val(data.maritalStatus)
            $('input[name="health"]').val(data.health)
            $('input[name="joinSchoolTime"]').val(data.joinSchoolTime)
            $('input[name="staffSource"]').val(data.staffSource)
            $('input[name="staffType"]').val(data.staffType)
            $('input[name="contractSign"]').val(data.contractSign)
            $('input[name="heighestDegreeName"]').val(data.heighestDegreeName)
            $('input[name="nowBusiness"]').val(data.nowBusiness)
            $('input[name="humanForm"]').val(data.humanForm)
            $('input[name="isSpecialTeacher"][value="'+data.isSpecialTeacher+'"]').prop('checked',true)
            $('input[name="isSpecialEduBook"][value="'+data.isSpecialEduBook+'"]').prop('checked',true)
            $('input[name="isFreeStudent"][value="'+data.isFreeStudent+'"]').prop('checked',true)
            $('input[name="isPartEdu"][value="'+data.isPartEdu+'"]').prop('checked',true)
            $('input[name="isHeartHealthTeach"][value="'+data.isHeartHealthTeach+'"]').prop('checked',true)
            $('input[name="isFulltimeGrd"][value="'+data.isFulltimeGrd+'"]').prop('checked',true)
            $('input[name="isSpecialpostTeacher"][value="'+data.isSpecialpostTeacher+'"]').prop('checked',true)
            $('input[name="personStatus"]').val(data.personStatus)
            $('input[name="nowPostLevel"]').val(data.nowPostLevel)
            $('input[name="applicationAbility"]').val(data.applicationAbility)
            $('input[name="partEduStartime"]').val(data.partEduStartime)
            $('input[name="partEduEndtime"]').val(data.partEduEndtime)
        }
    })


    <%--点击保存--%>
    $('#save').click(function(){
//        var deptid=$('#dept').attr('deptid').replace(',','');
//        $('input[name="ssxxNo"]').val(deptid)

        var schoolId=$('#dept').attr('deptid');
        if(schoolId.indexOf(",")>=0){
            schoolId=schoolId.substring(0,schoolId.length-1);
        }
        var ssxx = $('#dept').attr('deptname');

        $('#dataSave').ajaxSubmit({
            type:'post',
            data:{id:id,ssxx:ssxx,ssxxId:schoolId},
            dataType:'json',
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'保存成功',icon:1})
                    self.parent.document.getElementById("iframe").src='/teachering/teacherList';
                    return false;
                }else{
                    $.layerMsg({content:'保存失败',icon:2})
                }
            }
        })
    })
//    返回
    $('#return').click(function(){
        self.parent.document.getElementById("iframe").src='/teachering/teacherList';
    })
</script>
</body>
</html>
