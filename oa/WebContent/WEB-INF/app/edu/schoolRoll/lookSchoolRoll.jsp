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
    <title>新建学籍</title>
    <style>

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
        .close_but{
            width:50px;
            height: 37px;
            margin-left:0px;
            line-height: 28px;
            border-radius: 4px;
            padding-left: 4px;
            cursor: pointer;
            /*color:#fff;*/
        }
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
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>

<div class="step1" style="display: block;margin-left: 10px;margin-top: 30px;">

    <div class="nav_box clearfix">
        <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/new_dept.png"></div>
        <div class="nav_t2" class="news">查看学籍</div>
    </div>

    <table class="newNews">
        <form action="/schoolRoll/addShoolRollInfo" id="datasave">
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
                    <button type="button" class="close_but" id="refull">返回</button>
                </td>
            </tr>
        </div>
    </table>
</div>

</body>

<script type="text/javascript">

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


    $(function () {
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

        $('input').attr('disabled','disabled')
        var id=$.GetRequest().id;
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


        $('#save').click(function () {

            save();

        });

    });


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
//        choose:get_animal_sign
        //回调函数
    };
    var starts = {
        elem: '#STAFF_BIRTHS',
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        /* choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas; //将结束日的初始值设定为开始日
         }*/
//        choose:get_animal_sign
        //回调函数
    };
    laydate(start);
    laydate(starts);
    $('#STAFF_BIRTH').val('')
    $('#STAFF_BIRTHS').val('')


    $('#refull').click(function () {
        window.location.href='/schoolRoll/schoolRollList'
    })
</script>
</html>
