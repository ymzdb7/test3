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
    <title>学籍信息</title>
    <style>
        html{
            height:99%;
        }
        .cont{
            overflow-y:hidden ;
        }
        .content td{
            text-align: center;
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



        .cont{
            height:95%;
        }




        #search{
            margin-left: 360px;
            font-size: 16px;
        }
        #export{
            font-size: 16px;
        }
        .newNew tr td{
            border:none;
        }
        .newNew .tableHead tr td{
            border:1px solid #c0c0c0;
        }
        .ban{
            width: 80px;
            height: 28px;
            padding-left: 10px;
        }
        .left{
            float:left;
        }
        .new_but{
            width:130px;
            background:#2F8AE3;
            height: 28px;
            line-height: 28px;
            border-radius: 4px;
            margin-left: 0px;
            padding-left: 4px;
            cursor: pointer;
            color:#fff;
        }
        /*.close_but{*/
            /*width:50px;*/
            /*height: 37px;*/
            /*margin-left:0px;*/
            /*line-height: 28px;*/
            /*border-radius: 4px;*/
            /*padding-left: 4px;*/
            /*cursor: pointer;*/
            /*!*color:#fff;*!*/
        /*}*/
        .box{
            width:300px;
            height:150px;
            text-align:center;
            font-size:20px;
            color:#fff;
            background:#2F8AE3;
            margin:0 auto;
            line-height:150px;
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
        #clearSave{
            background:url(../../img/vote/clearsave.png) no-repeat;
            background-size: 181px;
            color:#fff;
            width:181px;
            font-size:16px;
            height:30px;
            cursor: pointer;
            line-height:30px;
            padding-left: 22px;
        }
        #save{
            background:url(../../img/vote/saveBlue.png) no-repeat;
            color:#fff;
            line-height:30px;
            font-size:16px;
            width:91px;
            height: 30px;
            cursor: pointer;
            padding-left: 11px;

        }
        #refull{
            color:#000;
            width: 87px;
            line-height:30px;
            height: 30px;
            cursor: pointer;
            font-size:16px;
            background: url("../../img/vote/new.png") no-repeat;
            padding-left: 12px;

        }
        #addItem,#addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
            width: 142px;
        }
        #addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
        }

        #back {
            display: inline-block;
            width: 78px;
            height: 38px;
            line-height: 30px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
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
        .laydate-footer-btns{
            position: absolute;
            right: 69px;
            top: 10px;
        }
        .layui-laydate-content{
            margin-left: 33px;
        }
        .td_title1{
            float: none;
            width: 150px;
        }
        .td_w span{
            width: 36%;
            display: inline-block;
            text-align: right;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">


<div class="head">
    <div class="head_left">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dept1.png" alt="">
        <h1>学籍信息查询</h1>
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
                <span style="padding-left:20px">学籍列表</span>
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
                    <tr>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>出生日期</th>
                        <th>民族</th>
                        <th>联系电话</th>
                        <th>家庭地址</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody class="list">

                    </tbody>
                </table>
            </div>
        </div>

        <div class="section" style="display: none">
            <div class="title" style="    padding-top: 30px;">
                <%--<img src="/img/commonTheme/${sessionScope.InterfaceModel}/manage.png" alt="" style="padding-left:20px">--%>
                <span style="padding-left:20px">学籍信息</span>
            </div>
            <div class="table">
                <table class="newNews">
                    <form action="/schoolRoll/editShoolRollInfo" id="datasave">
                        <tbody>
                        <tr>
                            <td class="td_w blue_text">
                                <span class="test_text">姓名：<b style="color: red;">*</b></span>
                                <input name="name" class="td_title1 test_null" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>性别：</span>
                                <input name="sex" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>出生日期：</span>
                                <input id="STAFF_BIRTH" name="brith" class="td_title1" type="text" />
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span class="test_text">学校标识码：<b style="color: red;">*</b></span>
                                <input  class="td_title1 test_null" id="dept" name="schoolCode" type="text" readonly/>
                                <%-- <input type="hidden" name="schoolName" class="td_title1"  type="text" />--%>
                                <%--<a href="javascript:;" id="chose" style="font-weight: normal">选择</a>--%>
                                <%--<a href="javascript:;" id="clear" style="font-weight: normal">清除</a>--%>
                            </td >
                            <td class="td_w blue_text">
                                <span class="test_text">学段：<b style="color: red;">*</b></span>
                                <select name="learnPhaseId" class="learnPhaseId test_null" id="learnPhaseId" style="width: 157px;"></select>
                            </td >
                            <td class="td_w blue_text">
                                <span class="test_text">年级：<b style="color: red;">*</b></span>
                                <select name="gradeId" class="gradeId test_null" id="gradeId" style="width: 157px;"></select>
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span class="test_text">班级：<b style="color: red;">*</b></span>
                                <select name="classId" class="classId test_null" id="classId" style="width: 157px;"></select>
                            </td >
                            <td class="td_w blue_text">
                                <span>班内学号：</span>
                                <input name="stuNo" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>学生来源：</span>
                                <input name="stuSource" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>曾用名：</span>
                                <input name="preName" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>身份证件类型：</span>
                                <input name="cardType" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>身份证件号：</span>
                                <input name="cardId" class="td_title1" type="text" />
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>政治面貌：</span>
                                <input name="political" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>民族：</span>
                                <input name="nation" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>国籍/地区：</span>
                                <input name="nationality" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>港澳台侨外：</span>
                                <input name="region" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>籍贯：</span>
                                <input name="origin" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>出生地行政区划代码：</span>
                                <input name="districtNo" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>健康状况：</span>
                                <input name="health" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>户口性质：</span>
                                <input name="registration" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>户口所在地行政区划：</span>
                                <input name="registrDistrict" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>

                            <td class="td_w blue_text">
                                <span>入学日期：</span>
                                <input name="entranceDate" id="STAFF_BIRTHS" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>入学方式：</span>
                                <input name="entranceWay" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>就读方式：</span>
                                <input name="studyWay" class="td_title1" type="text" />
                            </td >
                        </tr>


                        <tr>
                            <td class="td_w blue_text">
                                <span>现住址：</span>
                                <input name="address" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>通信地址：</span>
                                <input name="mailAddress" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>家庭地址：</span>
                                <input name="homrAddress" class="td_title1" type="text" />
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>联系电话：</span>
                                <input name="phone" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>邮政编码：</span>
                                <input name="postalCode" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>是否独生子女：</span>
                                <label>是<input value="1" checked name="onlyChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="onlyChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>是否受过学前教育：</span>
                                <label>是<input value="1" checked name="preEducation" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="preEducation" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text">
                                <span>是否留守儿童：</span>
                                <label>是<input value="1" checked name="leftChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="leftChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text">
                                <span>是否需要申请资助：</span>
                                <label>是<input value="1" checked name="appliedFund" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="appliedFund" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>是否享受一补：</span>
                                <label>是<input value="1" checked name="supplement" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="supplement" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text">
                                <span>是否孤儿：</span>
                                <label>是<input value="1" checked name="orphan" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="orphan" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text">
                                <span>是否烈士或优抚子女：</span>
                                <label>是<input value="1" checked name="martyrsChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="martyrsChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>上下学距离：</span>
                                <input name="goDistance" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>上下学方式：</span>
                                <input name="goWay" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>是否需要乘坐校车：</span>
                                <label>是<input value="1" checked name="takeBus" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="takeBus" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td >
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>身份证件有效期：</span>
                                <input name="cardValiDate" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>血型：</span>
                                <input name="bloodType" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>特长：</span>
                                <input name="specialty" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>电子信箱：</span>
                                <input name="eMail" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>学籍辅号：</span>
                                <input name="auxiliaryNum" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>是否由政府购买学位：</span>
                                <label>是<input value="1" checked name="governDegree" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="governDegree" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                        </tr>


                        <tr>
                            <td class="td_w blue_text">
                                <span>残疾类型：</span>
                                <input name="disabilityType" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>随班就读：</span>
                                <input name="regularStudy" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>隐藏：</span>
                                <input name="hidden" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员1姓名：</span>
                                <input name="member1Name" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>成员1关系：</span>
                                <input name="member1Relation" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员1关系说明：</span>
                                <input name="member1RelationDesc" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员1现住址：</span>
                                <input name="member1Address" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>成员1户口所在地行政区划：</span>
                                <input name="member1District" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员1联系电话：</span>
                                <input name="member1Phone" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员1是否监护人：</span>
                                <label>是<input value="1" checked name="member1Keeper" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="member1Keeper" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text">
                                <span>成员1身份证件类型：</span>
                                <input name="member1CardType" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员1身份证件号：</span>
                                <input name="member1CardId" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员1民族：</span>
                                <input name="member1Nation" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>成员1工作单位：</span>
                                <input name="member1Workplace" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员1职务：</span>
                                <input name="member1Post" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员2姓名：</span>
                                <input name="member2Name" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>成员2关系：</span>
                                <input name="member2Relation" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员2关系说明：</span>
                                <input name="member2RelationDesc" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员2现住址：</span>
                                <input name="member2Address" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>成员2户口所在地行政区划：</span>
                                <input name="member2District" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员2联系电话：</span>
                                <input name="member2Phone" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员2是否监护人：</span>
                                <label>是<input value="1" checked name="member2Keeper" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="member2Keeper" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text">
                                <span>成员2身份证件类型：</span>
                                <input name="member2CardType" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员2身份证件号：</span>
                                <input name="member2CardId" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span>成员2民族：</span>
                                <input name="member2Nation" class="td_title1" type="text">
                            </td>
                            <td class="td_w blue_text">
                                <span>成员2工作单位：</span>
                                <input name="member2Workplace" class="td_title1" type="text" />
                            </td >
                            <td class="td_w blue_text">
                                <span>成员2职务：</span>
                                <input name="member2Post" class="td_title1" type="text">
                            </td>
                        </tr>

                        <tr>
                            <td class="td_w blue_text">
                                <span style="    font-size: 13px;">是否进城务工人员随迁子女：</span>
                                <label>是<input value="1" checked name="migrantChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                                <label>否<input value="0" name="migrantChild" class="td_title1" type="radio" style="width: 18px;margin: 0 10px"/></label>
                            </td>
                            <td class="td_w blue_text" colspan="2">
                                <span>主页地址：</span>
                                <input name="homePage" class="td_title1" type="text">
                            </td>
                        </tr>
                        </tbody>
                    </form>
                    <div>
                        <tr style="text-align:center">
                            <td colspan="3">
                                <%--<button type="button" class="close_but" id="clearSave"><fmt:message code="vote.th.DataEmpty" /></button>--%>
                                <%--<button type="button" class="close_but" id="save">保存</button>--%>
                                <button type="button"  id="return">返回</button>
                            </td>
                        </tr>
                    </div>
                </table>

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
            pageSize:10,//一页显示几条
            useFlag:true,
            modularId:2
        },
        page:function () {
            var me=this;
            $.ajax({
                url:'/schoolPriv/selectObjectBySelf',
                type:'get',
                data:me.data,
                dateType:'json',
                success:function(reg){
                    var data=reg.object.object;
                    var str=""
                    for(var i=0;i<data.length;i++){
                        str+='<tr class="pagediv" id='+data[i].id+' data-have="'+data[i].have+'"> ' +
                            '<td >'+function () {
                                if(data[i].name==''||data[i].name==undefined){
                                    return '';
                                } else {
                                    return data[i].name
                                }
                            }()+'</td> ' +
                            '<td >'+function () {
                                if(data[i].sex==''||data[i].sex==undefined){
                                    return '';
                                } else {
                                    return data[i].sex
                                }
                            }()+'</td> ' +
                            '<td >'+function () {
                                if(data[i].brith==''||data[i].brith==undefined){
                                    return '';
                                } else {
                                    return data[i].brith
                                }
                            }()+'</td> ' +
                            '<td >'+function () {
                                if(data[i].nation==''||data[i].nation==undefined){
                                    return '';
                                } else {
                                    return data[i].nation
                                }
                            }()+'</td> ' +
                            '<td >'+function () {
                                if(data[i].phone==''||data[i].phone==undefined){
                                    return '';
                                } else {
                                    return data[i].phone
                                }
                            }()+'</td> ' +
                            '<td >'+function () {
                                if(data[i].homrAddress==''||data[i].homrAddress==undefined){
                                    return '';
                                } else {
                                    return data[i].homrAddress
                                }
                            }()+'</td> ' +
                            '<td>' +
                            '<a href="javascript:;" class="detail" sid="'+data[i].id+'" style="color:#1772c0">查看详情</a> ' +
//                            '<a href="javascript:;" class="edit" sid="'+data[i].id+'" style="color:#1772c0">编辑</a> ' +
//                            '<a href="javascript:;" class="del" sid="'+data[i].id+'" style="color:#1772c0">删除</a> ' +
                            '</td>' +
                            '</tr>'

                    }
                    $('.list').html(str);
                    me.pageTwo(reg.totleNum,me.data.pageSize,me.data.page);
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


        //学段
        $.ajax({
            url:'/eduLearnPhase/selEduLearnPhase',
            type:'post',
            dataType:'json',
            success:function(res){
                var str='<option value="">请选择</option>';
                var data=res.obj;
                if(res.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].id+'">'+data[i].name+'</option>';
                    }
                }
                $('#learnPhaseId').html(str);
            }
        })

        //年级
        $.ajax({
            url:'/eduDepartment/queryGetObj',
            type:'post',
            dataType:'json',
            success:function(res){
                var str='<option value="">请选择</option>';
                var data=res.obj;
                if(res.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].deptId+'">'+data[i].deptName+'</option>';
                    }
                }
                $('#gradeId').html(str);
            }
        })

        function huixian(url,id,ban,e){
            $.ajax({
                url:url,
                data:{
                    deptId:id
                },
                type:'post',
                dataType:'json',
                success:function(res){
                    var str='<option value="">请选择</option>';
                    var data=res.obj;
                    if(res.flag){
                        for(var i=0;i<data.length;i++){
                            str+='<option value="'+data[i].deptId+'">'+data[i].deptName+'</option>';
                        }
                    }
                    $(e).html(str);
                    $(e).val(ban);
                }
            })
        }
        //班级
        $("#gradeId").change(function () {
            $.ajax({
                url:'/eduDepartment/queryListByDeptId',
                data:{
                    deptId:$(this).val()
                },
                type:'post',
                dataType:'json',
                success:function(res){
                    var str='<option value="">请选择</option>';
                    var data=res.obj;
                    if(res.flag){
                        for(var i=0;i<data.length;i++){
                            str+='<option value="'+data[i].deptId+'">'+data[i].deptName+'</option>';
                        }
                    }
                    $('#classId').html(str);
                }
            })
        })



//        点击查看详情
        $('.list').on('click','.detail',function(){
            var id=$(this).parents('tr').attr('id')
            $('.content').hide();
            $('.section').show();

            $.ajax({
                url:'/schoolRoll/querySchoolRollInfoById',
                type:'get',
                data:{id:id},
                dateType:'json',
                success:function(reg){
                    var data=reg.object
                    $('#dept').val(data.deptCode)
//                $('#dept').attr('deptid',data.schoolId)
                    $('input[name="schoolCode"]').val(data.schoolCode)

                    $("#learnPhaseId").val(data.learnPhaseId)

                    $('#gradeId').val(data.gradeId);

                    huixian('/eduDepartment/queryListByDeptId',data.gradeId,data.classId,'#classId')
                    $('input[name="schoolCode"]').attr('deptName',data.schoolName)
                    $('input[name="name"]').val(data.name)
                    $('input[name="sex"]').val(data.sex)
                    $('input[name="brith"]').val(data.brith)
                    $('input[name="cardId"]').val(data.cardId)
                    $('input[name="origin"]').val(data.origin)
                    $('input[name="nation"]').val(data.nation)
                    $('input[name="nationality"]').val(data.nationality)
                    $('input[name="cardType"]').val(data.cardType)
                    $('input[name="region"]').val(data.region)
                    $('input[name="health"]').val(data.health)
                    $('input[name="political"]').val(data.political)
                    $('input[name="districtNo"]').val(data.districtNo)
                    $('input[name="registration"]').val(data.registration)
                    $('input[name="registrDistrict"]').val(data.registrDistrict)

                    $('input[name="entranceDate"]').val(data.entranceDate)
                    $('input[name="entranceWay"]').val(data.entranceWay)
                    $('input[name="studyWay"]').val(data.studyWay)
                    $('input[name="address"]').val(data.address)
                    $('input[name="mailAddress"]').val(data.mailAddress)
                    $('input[name="homrAddress"]').val(data.homrAddress)
                    $('input[name="phone"]').val(data.phone)
                    $('input[name="postalCode"]').val(data.postalCode)
                    $("input[name='onlyChild']").each(function(index) {
                        if ($("input[name='onlyChild']").get(index).value == data.onlyChild) {
                            $("input[name='onlyChild']").get(index).checked = true;
                        }
                    });
                    $("input[name='preEducation']").each(function(index) {
                        if ($("input[name='preEducation']").get(index).value == data.onlyChild) {
                            $("input[name='preEducation']").get(index).checked = true;
                        }
                    });
                    $("input[name='leftChild']").each(function(index) {
                        if ($("input[name='leftChild']").get(index).value == data.onlyChild) {
                            $("input[name='leftChild']").get(index).checked = true;
                        }
                    });
                    $("input[name='appliedFund']").each(function(index) {
                        if ($("input[name='appliedFund']").get(index).value == data.onlyChild) {
                            $("input[name='appliedFund']").get(index).checked = true;
                        }
                    });
                    $("input[name='supplement']").each(function(index) {
                        if ($("input[name='supplement']").get(index).value == data.onlyChild) {
                            $("input[name='supplement']").get(index).checked = true;
                        }
                    });
                    $("input[name='orphan']").each(function(index) {
                        if ($("input[name='orphan']").get(index).value == data.onlyChild) {
                            $("input[name='orphan']").get(index).checked = true;
                        }
                    });
                    $("input[name='martyrsChild']").each(function(index) {
                        if ($("input[name='martyrsChild']").get(index).value == data.onlyChild) {
                            $("input[name='martyrsChild']").get(index).checked = true;
                        }
                    });
                    $('input[name="goDistance"]').val(data.goDistance)
                    $('input[name="goWay"]').val(data.goWay)
                    $("input[name='takeBus']").each(function(index) {
                        if ($("input[name='takeBus']").get(index).value == data.onlyChild) {
                            $("input[name='takeBus']").get(index).checked = true;
                        }
                    });
                    $("input[name='takeBus']").each(function(index) {
                        if ($("input[name='takeBus']").get(index).value == data.onlyChild) {
                            $("input[name='takeBus']").get(index).checked = true;
                        }
                    });
                    $('input[name="preName"]').val(data.preName)
                    $('input[name="cardValiDate"]').val(data.cardValiDate)
                    $('input[name="bloodType"]').val(data.bloodType)
                    $('input[name="specialty"]').val(data.specialty)
                    $("input[name='governDegree']").each(function(index) {
                        if ($("input[name='governDegree']").get(index).value == data.onlyChild) {
                            $("input[name='governDegree']").get(index).checked = true;
                        }
                    });
                    $('input[name="auxiliaryNum"]').val(data.auxiliaryNum)
                    $('input[name="stuNo"]').val(data.stuNo)
                    $('input[name="stuSource"]').val(data.stuSource)
                    $('input[name="eMail"]').val(data.eMail)
                    $('input[name="homePage"]').val(data.homePage)
                    $('input[name="disabilityType"]').val(data.disabilityType)
                    $('input[name="regularStudy"]').val(data.regularStudy)
                    $('input[name="hidden"]').val(data.hidden)
                    $('input[name="member1Name"]').val(data.member1Name)
                    $('input[name="member1Relation"]').val(data.member1Relation)
                    $('input[name="member1RelationDesc"]').val(data.member1RelationDesc)
                    $('input[name="member1Address"]').val(data.member1Address)
                    $('input[name="member1District"]').val(data.member1District)
                    $('input[name="member1Phone"]').val(data.member1Phone)
                    $("input[name='member1Keeper']").each(function(index) {
                        if ($("input[name='member1Keeper']").get(index).value == data.onlyChild) {
                            $("input[name='member1Keeper']").get(index).checked = true;
                        }
                    });
                    $('input[name="member1CardType"]').val(data.member1CardType)
                    $('input[name="member1CardId"]').val(data.member1CardId)
                    $('input[name="member1Nation"]').val(data.member1Nation)
                    $('input[name="member1Workplace"]').val(data.member1Workplace)
                    $('input[name="member1Post"]').val(data.member1Post)
                    $('input[name="member2Name"]').val(data.member2Name)
                    $('input[name="member2Relation"]').val(data.member2Relation)
                    $('input[name="member2RelationDesc"]').val(data.member2RelationDesc)
                    $('input[name="member2Address"]').val(data.member2Address)
                    $('input[name="member2District"]').val(data.member2District)
                    $('input[name="member2Phone"]').val(data.member2Phone)
                    $("input[name='member2Keeper']").each(function(index) {
                        if ($("input[name='member2Keeper']").get(index).value == data.onlyChild) {
                            $("input[name='member2Keeper']").get(index).checked = true;
                        }
                    });
                    $('input[name="member2CardType"]').val(data.member2CardType)
                    $('input[name="member2CardId"]').val(data.member2CardId)
                    $('input[name="member2Nation"]').val(data.member2Nation)
                    $('input[name="member2Workplace"]').val(data.member2Workplace)
                    $('input[name="member2Post"]').val(data.member2Post)
                    $("input[name='migrantChild']").each(function(index) {
                        if ($("input[name='migrantChild']").get(index).value == data.onlyChild) {
                            $("input[name='migrantChild']").get(index).checked = true;
                        }
                    });



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
