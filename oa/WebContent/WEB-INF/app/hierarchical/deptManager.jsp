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
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script type="text/javascript" src="../../lib/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../lib/easyui/tree.js"></script>
    <script type="text/javascript" src="../../js/index.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/base/base.js"></script>
    <title><fmt:message code="global.lang.deps" /></title>
</head>
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
    .head_left h1{
        width:600px!important;
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

    #cont_left::-webkit-scrollbar {
        width: 0px;
    }

    #cont_left::-webkit-scrollbar-corner {
        /*background: #82AFFF;*/
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
    .cont_left {
        border-right: 1px solid #c0c0c0!important;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

<body style="overflow:scroll;overflow-y: hidden;overflow-x:hidden;">

<div class="wrap" style="margin-left:0px !important;">
    <div class="head">
        <div class="head_left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/classifyDeptManager.png" alt="" style="    margin-top: 10px;width: 22px;">
            <h1><fmt:message code="global.lang.deps" /></h1>
        </div>
    </div>

    <div class="cont">
        <div class="cont_left" id="cont_left">
            <ul>
                <li class="liDown dept_li" id="dept_lis" style="padding-left: 30px"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_sectorList.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="<fmt:message code="depatement.th.depa" />"><fmt:message code="depatement.th.depa" /></li>
                <li class="pick" style="display: block;padding-left: 20px;    margin-top: 8px;">
                    <div class="pickCompany"><span style="" class="childdept"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left: 10px;margin-bottom: 4px;"><a href="javascript:void(0)" class="dynatree-title" title=""></a></span></div>
                </li>
            </ul>
        </div>

        <div class="cont_rig">
            <!-- 部门右侧页面 -->
            <jsp:include page="editDept.jsp"/>
        </div>
        <div class="mainRight" style="float: left;width: 80%;display: none">
            <iframe style="width: 100%;height:100%" src="" frameborder="0"></iframe>
        </div>
    </div>
</div>
</body>


</html>
<script>


    var widthnum=1;
    boolTwo=false;
    //正在开发中
    function develop(me){
        $('.cont_rig').hide()
        $('.mainRight').show()
        $('.mainRight').height($(document).height()-$('.head').height())
        $('.mainRight').find('iframe').prop('src',$(me).attr('data-url'))
    };
    //编辑部门 详情
    var deptNoShow='';
    function ajaxdata(id,me){
        $('.mainRight').hide()
        $('.cont_rig').show()
        $.ajax({
            url:'/department/getDeptById',
            type:'get',
            dataType:'json',
            data:{'deptId':id},
            success:function(data){
                $(".step1").hide();
                $(".step2").show();
                $(".kf").hide();
                /*$("#deptNo_").attr("disabled","disabled");*/ // 部门排序号,不可修改
                $("#deptNo_").val(data.object.deptNo); // 部门排序号
                $("#deptName_").val(data.object.deptName); // 部门名称
                if(data.object.deptParent!=0&&data.object.deptParent!="0"){
                    $("#deptParent_").val(data.object.deptParentName); // 上级部门名称
                }else{
                    $("#deptParent_").val(''); // 上级部门名称
                }
                $("#deptParent_").attr('deptid',data.object.deptParent); // 上级部门ID
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
                $("#query_toId_").val(manager0); //部门主管
                $("#query_Satrap_").attr("dataid",assistantId[1]);
                $("#query_Satrap_").val(assistantId0); // 部门助理
                $("#query_UpAssistant_").attr("dataid",leader1[1]);
                $("#query_UpAssistant_").val(leader10); // 上级主管领导
                $("#query_UpSatrap_").attr("dataid",leader2[1]);
                $("#query_UpSatrap_").val(leader20); // 上级分管领导

                $("#telNo_").val(data.object.telNo); // 电话
                $("#faxNo_").val(data.object.faxNo); // 传真
                $("#deptAddress_").val(data.object.deptAddress); // 地址
                $("#deptFunc_").val(data.object.deptFunc); // 部门职责
                $("#dapaId_").html(data.object.deptId);

            }
        })

        //限制排序号只能输入三位有效数字
        var text = document.getElementById("deptNo_");
        text.onkeyup = function(){
            this.value=this.value.replace(/\D/g,'');
            if(text.value.length>3){
                text.value = deptNoShow;
            }
        }
    }
    //新建部门/成员单位按钮
    function newDept(){
        location.reload();
        $(".step1").show();
        $(".step2").hide();
    };
    $(function () {
        /*左侧点击事件显示隐藏*/

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
            if($('#deptNo_').val()=='' || $('#deptNo_').val().length<3){
                layer.msg('<fmt:message code="hr.th.dsn" />', { icon:6});
                return false;
            }else if($('#deptName_').val()==''){
                layer.msg('<fmt:message code="hr.th.fnd" />', { icon:6});
                return false;
            }
            if($('#deptParent').attr('deptid') == undefined){
                var deptParent = 0;
            }else{
                var deptParent = $('#deptParent').attr('deptid').split(',')[0];
            }
            var data = {
                'deptId':$("#dapaId_").html(),
                "deptNo":$("#deptNo_").val(),//  部门排序号
                "deptName": $("#deptName_").val(),    // 部门名称
                "telNo": $("#telNo_").val(),      //电话
                "faxNo":$("#faxNo_").val(),  //传真
                "deptAddress": $("#deptAddress_").val(),// 部门地址
                "deptParent":  deptParent,//上级部门ID
                "isOrg": "", //是否是分支机构(0-否,1-是)
                "orgAdmin":"",//机构管理员
                "deptEmailAuditsIds":"", //保密邮件审核人
                "weixinDeptId":"",  // null
                "dingdingDeptId":"",//叮叮对应部门id
                "gDept":'',// 是否全局部门(0-否,1-是)
                "manager": $("#query_toId_").attr("dataid"),//部门主管
                "assistantId": $("#query_Satrap_").attr("dataid"),//部门助理
                "leader1": $("#query_UpAssistant_").attr("dataid"),//上级主管领导
                "leader2": $("#query_UpSatrap_").attr("dataid"),//上级分管领导
                "deptFunc":$("#deptFunc_").val(),//部门职能
                "avatar": "",    // 头像
                " userName": "",      // 用户名字
                "uid":"",  // 用户uid
                "userPrivName": "",// 用户角色名字
                "type":  "" //   返回类型

            };
            //判断排序号是否重复
            var deptParentStr=$("#deptParent_").attr("deptid");
            if($("#deptParent_").attr("deptid")==''){
                deptParentStr=0;
            }
            if(deptNoShow.length>3){
                deptNoShow=deptNoShow.substring(deptNoShow.length-3,deptNoShow.length); // 部门排序号
            }
            $.ajax({
                url: "/department/selDeptNoByDeptParent",
                type: 'post',
                dataType: "JSON",
                data: {
                    deptParent: deptParentStr,
                    deptNo: $("#deptNo_").val(),
                    proDeptNo:deptNoShow,
                    editFlag: 1
                },
                success: function (json) {
                    if (!json.flag) {
                        if (json.msg == 'repeat') {
                            $.layerMsg({content: '<fmt:message code="adding.th.dept" />！', icon: 1}, function () {
                            })
                        }
                    } else {
                        $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />！',icon:1},function(){
                            $.ajax({
                                url:"<%=basePath%>../department/editDept",
                                type:'post',
                                dataType:"JSON",
                                data : data,
                                success:function(data){
                                    location.reload();

                                },
                                error:function(e){
                                    console.log(e);
                                }
                            });
                        });
                    }
                }
            })

        });
        // 删除当前部门/成员单位按钮
        $("#delete_").on("click",function(){
            var data = {
                'deptId':$("#dapaId_").html(),
                "deptNo": $("#deptNo_").val()   // 部门排序号
            };
            /* 调用插件弹窗 */
            $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="adding.th.jhddelete" />！',icon:0},function(){
                $.ajax({
                    url:"<%=basePath%>department/deletedept",
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



        $.extend({
            loadSidebar: function (target, deptId, fn) {
                /* if(deptId==0){
                 $.ajax({
                 url: '/hierarchical/getClassifyOrgByAdmin',
                 type: 'get',
                 dataType: 'json',
                 data: {
                 deptId: deptId
                 },
                 success: function (data){
                 var str = '';
                 data.obj.forEach(function (v, i) {
                 if (v.deptName) {
                 str += '<li><span data-types="1"  data-numtrue="1" ' +
                 'onclick= "imgDown(' + v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span><img src="/img/spirit/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left:15px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                 }
                 })
                 widthnum++;
                 target.html(str);
                 if (fn != undefined) {
                 fn($(target).find('.dpetWhole0'))
                 }
                 }
                 })
                 return;
                 }*/
                $.ajax({
                    url: '/department/getChDeptfq',
                    type: 'get',
                    data: {
                        deptId: deptId
                    },
                    dataType: 'json',
                    success: function (data) {
                       if(deptId == 0){
                            var str = '';
                            var strtwo='';
                            data.obj.forEach(function (v, i) {
                                    var admin=v.classifyOrgAdmin;
                                    if(v.classifyOrg==1  && admin!='undefined') {
                                        if(admin.indexOf(","+$.cookie("uid")+",")>=0 || admin.indexOf($.cookie("uid")+",")>=0){
                                            if (v.deptName) {
                                                str += '<li><span data-types="1" ' +
                                                    ' data-numtrue="1" ' +
                                                    'onclick= "imgDown(' + v.deptId + ',this)" ' +
                                                    ' style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" ' +
                                                    'class="childdept"><span class=""></span><img src="/img/sys/dapt_right.png" alt="" style="    ' +
                                                    'width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" ' +
                                                    'class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a>' +
                                                    '</span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                                            }
                                        }
                                    }

                            })
                            widthnum++;
                                target.html(str);

                            if (fn != undefined) {
                                fn($(target).find('.dpetWhole0'))
                            }


                        }else {
                            var str = '';
                           var strtwo='';
                           var numss=0;
                            data.obj.forEach(function (v, i) {
                                var targetnum = parseInt($(target).prev().attr('data-numtrue'))
                                    var admin=v.classifyOrgAdmin;
                                    if (v.classifyOrg == 1 && admin!='undefined') {
                                        if(admin.indexOf(","+$.cookie("uid")+",")>=0 || admin.indexOf($.cookie("uid")+",")>=0){
                                            if (v.deptName && v.isHaveCh == 1) {
                                                str += '<li><span  onclick= "imgDown(' + v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '"  style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img id="img' + v.deptId + '" src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                            } else {
                                                str += '<li><span onclick="imgDown(' + v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '" style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img  src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                            }
                                        }
                                    }else {
                                        if (v.deptName && v.isHaveCh == 1) {
                                            numss++;
                                            strtwo += '<li><span  onclick= "imgDown(' + v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '"  style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img id="img' + v.deptId + '" src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                        } else {
                                            numss++;
                                            strtwo += '<li><span onclick="imgDown(' + v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '" style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img  src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                        }
                                     }

                            });
                            widthnum++
                           if(numss==data.obj.length){
                               target.html(strtwo);
                           }else {
                               target.html(str);
                           }

                            if (fn != undefined) {
                                fn()
                            }
                        }

                    }
                })
            }

        })


//        部门左侧数据渲染
//        <img src="/img/spirit/icon_company.png">
        loadSidebar1($('.pick'),0)

        function loadSidebar1(target,deptId) {
            console.log(deptId);
            $.ajax({
                url: '/department/getChDeptfq',
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {
                    var str = '';
                    data.obj.forEach(function (v, i) {
                        if(v.deptNo.length==3 || v.deptNo.length==6) {
                            var admin=v.classifyOrgAdmin;
                            if (v.classifyOrg == 1 && admin!='undefined') {
                                if (admin.indexOf("," + $.cookie("uid") + ",") >= 0 || admin.indexOf($.cookie("uid") + ",") >= 0) {
                                    if (v.deptName) {
                                        str += '<li><span  data-numtrue="1" ' +
                                            'onclick= "imgDown(' +v.deptId + ',this)"   data-numString="1"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span>' +
                                            '<img src="/img/sys/dapt_right.png" alt="" class="imgleft" style="width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                                    }
                                }
                            }
                        }

                    })
                    widthnum++;
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
                console.log(obj);
                var data = obj.object.unitName;
                $('.pick .pickCompany .dynatree-title').text(data).attr('title',data);

            },
            error:function(e){
                console.log(e);
            }
        })



    });





</script>
