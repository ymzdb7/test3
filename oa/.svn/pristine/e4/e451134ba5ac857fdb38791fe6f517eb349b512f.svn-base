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
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title>教师信息</title>
    <style>
        html{
            height:99%;
        }
        .cont{
            overflow-y:hidden ;
        }
        .cont_rig{
            overflow-y :auto;
        }
        .cont_left{
            overflow-y: auto;
            overflow-x: auto;
        }
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:20px;
        }
        .title{
            margin-bottom:20px;
        }
        document,body{
            width:100%;
            height:100%;
        }

        .content{
            /*margin:20px auto 0px;*/
            width:100%;
            height:100%;
        }
        .table table{
            width: 97%;
            margin:0 auto;
        }
        th{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:45px;
            padding-left: 10px;
        }
        .titleName{
            cursor:pointer;
        }
        tfoot div{
            float:left;
        }
        #del{
            background:url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            background-size: 62px;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left:20px;
            cursor:pointer;
        }
        #allDel{
            background:url(../../img/news/btn_delete_fourfont_07.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 72px;
            height: 28px;
            line-height: 25px;
            padding-left: 24px;
            margin-left:10px;
            cursor:pointer;
        }
        #empty{
            background:url(../../img/news/empty.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 100px;
            height: 28px;
            line-height: 25px;
            padding-left: 25px;
            margin-left:10px;
            cursor:pointer;
        }
        #cancle{
            background:url(../../img/news/btn_canceltop_11.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 94px;
            height: 28px;
            line-height: 25px;
            padding-left: 25px;
            margin-left:10px;
            cursor:pointer;
        }

        .success{
            text-align:center;
            display:none;
        }
        .box{
            margin-bottom:30px;
        }
        .success span{
            width: 132px;
            height: 35px;
            background-color: rgba(224, 224, 224, 0.61);
            font-size: 16px;
            border-radius: 5px;
            padding-left:8px;
            cursor:pointer;

            line-height: 30px;
            display: inline-block;
        }
        .ellipsis{
            width:100px;
            overflow:hidden;
            text-overflow: ellipsis;
            white-space:nowrap;
            display: block;
        }
        .box{
            width:500px;
            height:150px;
            text-align:center;
            font-size:20px;
            color:#fff;
            background:#2F8AE3;
            margin:0 auto;
            line-height:150px;
            margin-bottom:30px;
            margin-top:50px;
        }
        #addItem{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
            width: 142px;
        }
        #addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
        }
        .M-box3 .active{
            margin: 0px 3px;
            width: 29px;
            height: 29px;
            line-height: 29px;
            background: #2b7fe0;
            font-size: 12px;
            border: 1px solid #2b7fe0;
            color:#fff;
            text-align:center;
            display: inline-block;
        }
        .M-box3 a{
            margin: 0 3px;
            width: 29px;
            height: 29px;
            line-height: 29px;
            font-size: 12px;
            display: inline-block;
            text-align:center;
            background: #fff;
            border: 1px solid #ebebeb;
            color: #bdbdbd;
            text-decoration: none;
        }
        #query{
            padding: 5px 15px;
            border-radius: 4px;
            vertical-align: middle;
            background: #2F8AE3!important;
            color: #fff;
        }


        .section table tr td{
            /*border:none;*/
            /*border:1px solid #c0c0c0;*/
        }
        .section table tr td:nth-child(2n-1){
            text-align: right;
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        .section input[type=text]{
            width:90%;
            /*border-radius: 3px;*/
            height:28px;
            line-height: 28px;
            font-size:14px;
        }
        .section input[type=radio]{
            width: 16px;
            height:16px;
        }
        .section label span{
            font-size:14px;
        }
        .section #save {
            background: url(../../img/vote/saveBlue.png) no-repeat;
            color: #fff;
            line-height: 30px;
            font-size: 16px;
            width: 91px;
            height: 30px;
            cursor: pointer;
            padding-left: 11px;

        }
        .section  #return{
            width: 90px;
            height: 30px;
            line-height: 30px;
            font-size: 16px;
            margin: 0 auto;
            background: url(../../img/vote/return.png) no-repeat;
            cursor: pointer;
        }
        .cont{
            height:95%;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--管理已发布的投票--%>
<div class="head">
    <div class="head_left">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dept1.png" alt="">
        <h1>教师信息查询</h1>
        <%--<h1>部门/成员单位管理</h1>--%>
    </div>
</div>
<div class="cont">
    <div id="cont_left" class="cont_left">
        <ul>
            <li class="liDown dept_li" id="dept_lis"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_sectorList.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="部门列表"><fmt:message code="depatement.th.depa" /></li>
            <li class="pick" style="display: block;">
                <div class="pickCompany"><span style="height:35px;line-height:35px;" class="childdept"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left: 13px;margin-bottom: 4px;"><a href="javascript:void(0)" class="dynatree-title" title=""></a></span></div>
            </li>
        </ul>
    </div>
    <div id="cont_rig" class="cont_rig">
        <div class="content" style="width:100%;height:100%">
            <div class="title" style="    padding-top: 30px;">
                <%--<img src="/img/commonTheme/${sessionScope.InterfaceModel}/manage.png" alt="" style="padding-left:20px">--%>
                <span style="padding-left:20px">教师列表</span>
            </div>
            <%--<div style="margin: -8px 0px 26px 20px;">--%>
            <%--<select name="" id="dept" style="width: 180px;height: 28px;border-radius: 3px;"></select>--%>
            <%--<button id="query">查询</button>--%>
            <%--</div>--%>

            <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
                <div id="dbgz_page" class="M-box3">

                </div>
            </div>
            <div class="table">
                <table>
                    <thead>
                    <tr style="text-align: left;">
                        <%--<th style="width: 2%;"></th>--%>
                        <th >姓名</th>
                        <th >性别</th>
                        <th >政治面貌</th>
                        <th >联系电话</th>
                        <th >是否在编</th>
                        <th >第一学历</th>
                        <th >最高学历</th>
                        <th >开始任教日期</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody class="list">

                    </tbody>
                    <tfoot>

                    </tfoot>
                </table>
            </div>
        </div>

        <div class="section" style="display: none">
            <div class="title" style="    padding-top: 30px;">
                <%--<img src="/img/commonTheme/${sessionScope.InterfaceModel}/manage.png" alt="" style="padding-left:20px">--%>
                <span style="padding-left:20px">教师信息</span>
            </div>
            <div class="table">
                <form action="/teachering/editinfo" id="dataSave">
                    <table>
                        <tbody>


                        <tr>
                            <td style="width: 16%;">学校标识码<b style="color: red;">*</b>：</td>
                            <td style="width: 16%;"><input type="text" name="ssxxNo" id="dept"></td>
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
                            <td>所属学校：</td>
                            <td><input type="text"  name="ssxx"></td>

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
                            <td>港澳台情况：</td>
                            <td><input type="text"  name="situation"></td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="6" style="text-align: center;">
                                <%--<button id="save" type="button">保存</button>--%>
                                <button id="return" type="button">返回</button>
                            </td>
                        </tr>
                        </tfoot>

                    </table>
                </form>

            </div>
        </div>
    </div>
</div>




<div class="success">
    <div class="box"><fmt:message code="event.th.Released" />！</div>
    <div>
        <span id="addItem"><fmt:message code="vote.th.AddVotingItems" /></span>
    </div>
</div>
<script type="text/javascript">
    boolTwo=false;
    numstring=true;

    //        左侧树结构
    //        列表带分页
    var ajaxPageLe={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
            modularId:1
            // computationNumber:null
        },
        page:function () {
            var me=this;
            $.ajax({
                url:'/schoolPriv/selectObjectBySelf',
                type:'get',
                data:me.data,
                dataType:'json',
                success:function(reg){
                    var datas=reg.object.object;

                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+='<tr class="pagediv" id='+datas[i].id+'>' +
                            //                                '<td> ' +
                            //                                '<input type="checkbox" class="childCheck"> ' +
                            //                                '</td> ' +
                            '<td>'+check(datas[i].name)+'</td> ' +
                            '<td >'+check(datas[i].sex)+'</td> ' +
                            '<td >'+check(datas[i].political)+'</td> ' +
                            '<td>'+check(datas[i].pohne)+'</td> ' +
                            '<td>'+function(){
                                if(datas[i].isInseries == undefined){
                                    return ''
                                }else if(datas[i].isInseries == 0){
                                    return '是'
                                }else{
                                    return '否'
                                }
                            }()+'</td> ' +
                            '<td>'+check(datas[i].firstEdu)+'</td> ' +
                            '<td>'+check(datas[i].heighestEdu)+'</td> ' +
                            '<td>'+check(datas[i].startTeachingDate)+'</td> ' +
                            '<td>'+
                            '<a class="detail" href="javascript:;" style="color:#1772c0">查看详情</a> ' +
                            //                                '<a class="edit" href="javascript:;" style="color:#1772c0">修改</a> ' +
                            //                                '<a class="del" href="javascript:;" style="color:#1772c0">删除</a> ' +
                            '</td> ' +
                            '</tr>'
                    }
                    $('.list').html(str);
                    me.pageTwo(reg.totleNum,me.data.pageSize,me.data.page)
                }
            })

        },
        pageTwo:function (totalData, pageSize,indexs) {
            var mes=this;
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:indexs||1,
                callback: function (index) {
                    mes.data.page=index.getCurrent();
                    mes.page();
                }
            });
        }
    }
    ajaxPageLe.page();

    function ajaxdata(id,me){
        $('.content').show();
        $('.section').hide();
        ajaxPageLe.data.shcoolNum=id;
        ajaxPageLe.page();
    }

    //        验证undefined
    function  check(name) {
        if(name == undefined){
            return ''
        }else{
            return name;
        }
    }
    //点击查询后，查询列表展示
    $(function () {

        $("#dept_lis").on('click', function () {

            if ($(this).siblings('.pick').css('display') == 'none') {
                $(this).siblings('.pick').show();
                $(this).addClass("liDown").removeClass("liUp");
            } else {
                $(this).siblings('.pick').hide();
                $(this).addClass("liUp").removeClass("liDown");
            }
        });

//        var boolTwo= false;
//        部门左侧数据渲染
//        <img src="/img/spirit/icon_company.png">
        loadSidebar1($('.pick'),0)

        function loadSidebar1(target,deptId,fn) {

            $.ajax({
                url: '/department/getChDeptfq',
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {

//                    $(target).empty();
                    var str = '';
                    data.obj.forEach(function (v, i) {
                        if (v.deptName) {
                            str += '<li><span  data-numtrue="1" ' +
                                'onclick= "imgDown(' +v.deptId + ',this)"   data-numString="1"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span>' +
                                '<img src="/img/sys/dapt_right.png" alt="" class="imgleft" style="width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                        }
                    })
//                    widthnum++;
                    target.append(str);

                }
            })
        }
        $.ajax({
            url:'/sys/showUnitManage',
            type:'get',
            dataType:"JSON",
            data : '',
            success:function(obj){

                var data = obj.object.unitName;
                $('.pick .pickCompany .dynatree-title').text(data).attr('title',data);

            },
            error:function(e){
                console.log(e);
            }
        })






//        点击查看详情
        $('.list').on('click','.detail',function(){
            var id=$(this).parents('tr').attr('id')
            $('.content').hide();
            $('.section').show();

            $.ajax({
                url:'/teachering/selectObjectById',
                type:'get',
                dataType:'json',
                data:{id:id},
                success:function(res){
                    var data=res.object;
                    $('#dept').val(data.ssxxNo)
                    $('#dept').attr('deptid',data.ssxxNo)
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
        })

//        点击返回
        $('#return').click(function(){
            $('.content').show();
            $('.section').hide();
        })

//        点击修改
        $('.list').on('click','.edit',function(){
            var id=$(this).parents('tr').attr('id')
            self.parent.document.getElementById("iframe").src='/teachering/editTeacher?type=1&id='+id;
        })

//        hover显示数据
//        $('.table').on('mouseover ','.ellipsis',function(){
//            var textLength=$(this)[0].scrollWidth-20;
//            var width=$(this).width();
//            if(textLength>width){
//                layer.tips($(this).text(),$(this),{tips:[3,'#2b7fe0']})
//            }
//        })

//        点击全选
        $('#allChoose').click(function(){
            var state=$(this).prop('checked');
            if(state == true){
                $(this).prop('checked',true);
                $('.childCheck').prop('checked',true);
            }else{
                $(this).prop('checked',false);
                $('.childCheck').prop('checked',false);
            }
        })
//        点击删除
        $(document).on('click','.del',function(){
            var id=$(this).parents('tr').attr('id')
            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="common.th.prompt" />"
            },function(){
                $.ajax({
                    url:'/teachering/delete',
                    type:'post',
                    dataType:'json',
                    data:{id:id},
                    success:function(){
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        ajaxPageLe.data.page=1;
                        ajaxPageLe.page()
                    }
                })
            }, function () {
                layer.closeAll();
            })
        })

//        点击全部删除
        $('#allDel').click(function(){
//            $('.childCheck').prop('checked',true);
            var checkL=$('.childCheck:checkbox').length;
            var arr=[];
            if(checkL != 0){
                $('.childCheck:checkbox').each(function(){

                    var sId=$(this).parent().parent().attr('id');
                    arr.push(sId);
                })
                var str=arr.join();
                layer.confirm(' <fmt:message code="event.th.allDeleted" />？', {
                    btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                    title: " <fmt:message code="common.th.prompt" />"
                },function(){
                    $.ajax({
                        url:'/vote/manage/deleteByVoteId',
                        type:'post',
                        dataType:'json',
                        data:{voteIds:str},
                        success:function(){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            window.location.reload();
                        }
                    })
                }, function () {
                    layer.closeAll();
                })

            }
        })
//        点击清空数据
        $('#empty').click(function(){
            $('.list').empty();
        })


    })



</script>
</body>


</html>
