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
    <link rel="stylesheet" type="text/css" href="/lib/ueditor/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="/css/base.css"/>
    <link rel="stylesheet" type="text/css" href="/css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="/css/news/center.css"/>
    <script src="/js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/edu/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate.js"></script>
    <script type="text/javascript" src="/lib/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/lib/easyui/tree.js"></script>
    <script type="text/javascript" src="/js/index.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <%--<script src="../lib/laydate.js"></script>--%>
    <title>年级班级</title>
    <style>
        html,
        body,
        .wrap{
            width:100%;
            height:100%;
            /* overflow: hidden;*/
        }
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
        .head_rig  .import {
            width: 56px;
            height: 30px;
            font-size: 13px !important;
            cursor: pointer;
            background-repeat: no-repeat;
            background-image: url(../img/sys/import.png);
            padding-left: 25px;
        }
        .head_rig  .export {
            width: 56px;
            height: 30px;
            font-size: 13px !important;
            cursor: pointer;
            background-repeat: no-repeat;
            background-image: url(../img/sys/export.png);
            padding-left: 25px;
        }
        .head_rig .new_dept {
            width: 130px;
            height: 30px;
            font-size: 13px !important;
            background-image:url(../img/sys/dept_personnel.png);
            cursor: pointer;
            background-repeat: no-repeat;
            color: #fff;
        }

        .head_rig .new_dept1 {
            width: 130px;
            height: 30px;
            font-size: 13px !important;
            cursor: pointer;
            background-repeat: no-repeat;
            color: #fff;
        }

        #delete_ {
            padding-left: 17px;
            background-image: url(../../img/sys/dept_personneldel.png);
        }

        #cont_left::-webkit-scrollbar {
            width: 0px;
        }

        #cont_left::-webkit-scrollbar-corner {
            /*background: #82AFFF;*/
        }
        #cont_left .pick>li:hover{
            background:#e8f4fc;
        }

        .head_rig {
            width: 29%;
            margin-top: 0px;
            float: right;
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
            border-bottom: 1px solid #dedede;
            height: 45px;
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
            width: 220px;
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
        .dpetWhole0{overflow: auto}
        dpetWhole0 li{white-space: nowrap;}
    </style>
</head>
<body style="overflow:scroll;overflow-y: hidden;overflow-x:hidden;">

<div class="wrap" style="margin-left:0px !important;">
    <div class="head" style="height:45px;">
        <div class="head_left">
            <img src="../img/edu/eduSchoolCalendar/home.png" alt="">
            <h1>年级班级</h1>
            <%--<h1>班级/成员单位管理</h1>--%>
        </div>
    </div>

    <div class="cont">
        <div class="cont_left" id="cont_left">
            <ul>
                <li class="liDown dept_li" id="dept_lis">
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_sectorList.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="班级列表">年级班级</li>
                <li class="pick" style="display: block;">
                    <%--<ul class="tab_ctwo a" id="deptOrg">--%>
                    <%--<!-- <li>--%>

                    <%--</li> -->--%>
                    <%--</ul>--%>
                </li>
                <%--<li class="liUp dept_li" onclick="develop(this)" data-url="/department/batchSetDept"><img src="../img/sys/icon_departingStaff.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="班级批量设置">班级批量设置</li>
                <li class="liUp dept_li" onclick="develop(this)" data-url="/usergroup/userGroup"><img src="../img/sys/icon_publicCustomGroup.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="公共自定义组">公共自定义组</li>
                <li class="liUp dept_li" onclick="develop(this)" data-url="/department/upDeptRank"><img src="../img/sys/icon_fixDepartmentLevel.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="修正班级级别">修正班级级别</li>
--%>
            </ul>
        </div>

       <div class="cont_rig">
            <!-- 班级右侧页面 -->

            <jsp:include page="new_deptManagement.jsp"/>


        </div>
        <div class="mainRight" style="    float: left;
    width: 80%;">
            <iframe style="width: 100%;height:100%" src="" frameborder="0"></iframe>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    loadSidebarurl='/eduDepartment/queryListByDeptId'
    //正在开发中
    function develop(me){
        $('.cont_rig').hide()
        $('.mainRight').show()
        $('.mainRight').height($(document).height()-$('.head').height())
        $('.mainRight').find('iframe').prop('src',$(me).attr('data-url'))
    };

    //新建班级/成员单位按钮
    function newDept(){

        $(".step1").show();
        $(".step2").hide();
        $(".step3").hide();
//        location.reload();
    };

    function newDept1(){
//        location.reload();
        $(".step1").hide();
        $(".step2").hide();
        $(".step3").show();
    };
    //编辑班级 详情
    function ajaxdata(id,me){
        $('.mainRight').hide()
        $('.cont_rig').show()
        var a=$("#grade").html();
        $.ajax({
            url:'/eduDepartment/queryGetObjectByDeptId',
            type:'get',
            dataType:'json',
            data:{'deptId':id},
            success:function(data){
                if(data.object.deptParent == 2){
                    $(".step1").hide();
                    $(".step2").show();
                    $(".step3").hide();
                    $(".kf").hide();
                    document.getElementById("showClass").style.display = "none";
                    var grade = a.substring(0,4);
                    $("#grade").html(grade+'-['+data.object.deptName+']');
                    $("#deptNo_").attr("disabled","disabled"); // 年级排序号,不可修改
                    $("#deptNo_").val(data.object.deptNo); // 年级排序号
                    $("#deptParent_").val(data.object.deptId); // 年级级ID
                    var manager= data.object.manager.split("&");
                    var manager0=manager[0];
                    if(manager0=="null"){
                        manager0=""
                    };
                    var assistantId= data.object.assistantId.split("&");
                    var assistantId0=assistantId[0];
                    if(assistantId0=="null"){
                        assistantId0=""
                    };
                    var leader1= data.object.leader1.split("&");
                    var leader10=leader1[0];
                    if(leader10=="null"){
                        leader10=""
                    };
                    var leader2= data.object.leader2.split("&");
                    var leader20=leader2[0];
                    if(leader20=="null"){
                        leader20=""
                    };

                    $("#query_toId_").attr("dataid",manager[1]);

                    $("#deptAddress_").val(data.object.deptOtherName); // 地址
                    $("#deptFunc_").val(data.object.deptFunc); // 班级职责
                    $("#dapaId_").html(data.object.deptId);

                }else{
                    $(".step1").hide();
                    $(".step2").show();
                    $(".step3").hide();
                    $(".kf").hide();
                    document.getElementById("showClass").style.display = "";
                    var grade = a.substring(0,4);
                    $("#grade").html(grade+'-['+data.object.deptName+']');
                    $("#deptNo_").attr("disabled","disabled"); // 班级排序号,不可修改
                    $("#deptNo_").val(data.object.deptNo); // 班级排序号
                    $("#deptName_").val(data.object.deptName); // 班级名称--
                    $("#deptParent_").val(data.object.deptParent); // 上级班级ID
                    var manager= data.object.manager.split("&");
                    var manager0=manager[0];
                    if(manager0=="null"){
                        manager0=""
                    };
                    var assistantId= data.object.assistantId.split("&");
                    var assistantId0=assistantId[0];
                    if(assistantId0=="null"){
                        assistantId0=""
                    };
                    var leader1= data.object.leader1.split("&");
                    var leader10=leader1[0];
                    if(leader10=="null"){
                        leader10=""
                    };
                    var leader2= data.object.leader2.split("&");
                    var leader20=leader2[0];
                    if(leader20=="null"){
                        leader20=""
                    };

                    $("#query_toId_").attr("dataid",manager[1]);

                    $("#deptAddress_").val(data.object.deptAddress); // 地址
                    $("#deptFunc_").val(data.object.deptFunc); // 班级职责
                    $("#dapaId_").html(data.object.deptId);
                }


            }
        })
    }

    $(function () {
        /*左侧点击事件显示隐藏*/
        boolTwo=false;
        $("#dept_lis").on('click', function () {

            if ($(this).siblings('.pick').css('display') == 'none') {
                $(this).siblings('.pick').show();
                $(this).addClass("liDown").removeClass("liUp");
            } else {
                $(this).siblings('.pick').hide();
                $(this).addClass("liUp").removeClass("liDown");
            }
        });
        // 编辑保存***********************
        $("#new_").on("click",function(){
//            alert($("#dapaId_").html());
            var data = {
                'deptId':$("#dapaId_").html(),
                "deptNo":$("#deptNo_").val(),//  班级排序号
                "deptName": $("#deptName_").val(),    // 班级名称
                "deptOtherName": $("#deptAddress_").val(),// 班级地址
                "deptFunc":$("#deptFunc_").val(),//班级职能
                "deptParent":  $('#deptParent_ option:checked').attr('value')

            }
            if(data.deptParent==-1){
                data.deptParent=2
            }


                $.ajax({
                    url:"<%=basePath%>/eduDepartment/updateEduDepartmentWithBLOBs",
                    type:'post',
                    dataType:"JSON",
                    data : data,
                    success:function(data){
                        if(data.flag == true){
                            $.layerMsg({content: '保存成功！', icon: 1});
                            location.reload();
                        }else {
                            $.layerMsg({content: '保存失败！', icon: 2});
                        }
                    },
//                    error:function(e){
//                        console.log(e);
//                        $.layerMsg({content: '保存失败！', icon: 2});
//                    }
                });


        });
        // 编辑保存***********************
        <%--$("#newOne").on("click",function(){--%>
<%--//            alert($("#dapaId_").html());--%>
            <%--var data = {--%>
                <%--'deptId':$("#dapaIdOne").html(),--%>
                <%--"deptNo":$("#deptNoOne").val(),//  班级排序号--%>
                <%--"deptName": $("#deptNameOne").val(),    // 班级名称--%>
                <%--"deptOtherName": $("#deptAddressOne").val(),// 班级地址--%>
                <%--"deptFunc":$("#deptFuncOne").val(),//班级职能--%>
                <%--"deptParent":  '2'--%>

            <%--};--%>
            <%--$.layerMsg({content:'修改成功！',icon:1},function(){--%>
                <%--$.ajax({--%>
                    <%--url:"<%=basePath%>/eduDepartment/updateEduDepartmentWithBLOBs",--%>
                    <%--type:'post',--%>
                    <%--dataType:"JSON",--%>
                    <%--data : data,--%>
                    <%--success:function(data){--%>
                        <%--location.reload();--%>
                        <%--console.log(data);--%>
                    <%--},--%>
                    <%--error:function(e){--%>
                        <%--console.log(e);--%>
                    <%--}--%>
                <%--});--%>
            <%--});--%>

        <%--});--%>

        // 删除当前班级/成员单位按钮
        $(".new_dept1").on("click",function(){
            var data = {
                'deptId':$("#dapaId_").html(),
                "deptNo": $("#deptNo_").val()   // 班级排序号
            };
            /* 调用插件弹窗 */
            $.layerConfirm({title:'确定删除',content:'您确定要删除该班级吗？这将同时删除该班级下的所有下级班级和用户！',icon:0},function(){
                $.ajax({
                    url:"/eduDepartment/deleteEduDepartmentWithBLOBs",
                    type:'get',
                    dataType:"JSON",
                    data : data,
                    success:function(data){
                        location.reload();
                        console.log(data);
                    },
                    error:function(e){
                        console.log(e);
                    }
                });
            },function(){
                return true;
            })
        });
//        班级左侧数据渲染
        $.loadSidebar($('.pick'),2,function (el) {
            $(".step3").hide();
//            $.loadSidebar(el,30)
        })








    });


</script>

</html>
