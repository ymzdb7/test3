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
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript"  src="../../lib/laydate.js"></script>
    <script src="/js/edu/base.js" type="text/javascript" charset="utf-8"></script>
    <title>年级班级</title>
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
            width: 467px;
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

        /*	#layui-layer2{
                border-radius:10px;
            }*/
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
        .new_but{
            background:url(../../img/sys/baocun.png) no-repeat;
            color:#fff;
            margin-left:47%;
        }
        .nav_box .head_rig .new_dept{
            font-size:16px!important;
            background-image:url(../../img/edu/eduSchoolCalendar/add-.png);
            padding-left:8px;
        }
        #new_{
            background:url(../../img/sys/baocun.png) no-repeat;
            color:#fff;
            width:82px;
        }
        #delete_{
            background:url(../../img/edu/eduSchoolCalendar/del.png) no-repeat;
            width:60px;
            padding-left:19px;
            font-size:16px!important;
        }




    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<%--新建班级--%>
<div class="step1" style="display: block;margin-left: 10px;">
    <!-- 中间部分 -->
    <table class="newNews">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/new_dept.png"></div>
            <%--<div class="nav_t2" class="news">编辑班级/成员单位-当前节点：[北京公司]</div>--%>
            <div class="nav_t2" class="news">修改年级/班级</div>
            <div class="head_rig" id="head_rig_" style="width:325px;">
                <h1 style='cursor:pointer; color: #def1ff; background-image:url(../../img/edu/eduSchoolCalendar/add-.png);padding-left:8px;font-size:16px!important;' class="new_dept" onclick="newDept()" >新增年级</h1>

                <h1 style='cursor:pointer; color: #def1ff;' class="new_dept1" id="delete_">删除</h1>
                <%--<h1 style='cursor:pointer;' class="import" onclick="develop()"><fmt:message code="workflow.th.Import" /></h1>--%>
                <%--<h1 style='cursor:pointer;' class="export" onclick="develop()"><fmt:message code="global.lang.report" /></h1>--%>
            </div>
        </div>
        <tbody>
        <tr>
            <td class="td_w blue_text">
               年级排序号：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="deptNo"/>
                <img class="td_title2" src="../img/mg2.png" alt="">
                <div class="tit">  <fmt:message code="depatement.th.digit" /></div>

            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
               年级：
            </td>
            <td>
                <input class="td_title1" id="deptName" type="text" placeholder=""/>
                <img class="td_title2" src="../img/mg2.png" alt="">

            </td>
        </tr>


        <tr>
            <td class="blue_text">
                别名：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="deptAddress" type="text" placeholder=""/>

            </td>
        </tr>
        <tr>
            <td class="blue_text">
                年级简介：
            </td>
            <td>
                <textarea name="" cols="60" rows="5" id="deptFunc"></textarea>

            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="button" class="new_but" id="new">保存</button>
                <span id="dapaId" style="display: none"></span>
            </td>
        </tr>
        <%--<tr>--%>
        <%--<td colspan="2">--%>
        <%--<button type="button" class="delete_but" id="delete_"><fmt:message code="depatement.th.currentdel" /></button>--%>
        <%--</td>--%>
        <%--</tr>--%>



        </tbody>
    </table>
</div>



<%--编辑班级--%>
<div class="step2" style="display: none;margin-left: 10px;">
    <!-- 中间部分 -->
    <table class="newNews">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/new_dept.png"></div>
            <%--<div class="nav_t2" class="news">编辑班级/成员单位-当前节点：[北京公司]</div>--%>
            <div class="nav_t2" class="news" id="grade">修改年级/班级</div>
            <div class="head_rig" id="head_rig_">
                <h1 style='cursor:pointer; color: #def1ff;' class="new_dept" onclick="newDept()" >新增年级</h1>
                <h1 style='cursor:pointer; color: #def1ff;' class="new_dept" onclick="newDept1()" >新增班级</h1>

                <h1 style='cursor:pointer; color: #def1ff;' class="new_dept1" id="delete_">删除</h1>
                <%--<h1 style='cursor:pointer;' class="import" onclick="develop()"><fmt:message code="workflow.th.Import" /></h1>--%>
                <%--<h1 style='cursor:pointer;' class="export" onclick="develop()"><fmt:message code="global.lang.report" /></h1>--%>
            </div>
        </div>
        <tbody>
        <tr>
            <td class="td_w blue_text">
                 班级排序号：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="deptNo_"/>
                <img class="td_title2" src="../img/mg2.png" alt="">
                <div class="tit">  <fmt:message code="depatement.th.digit" /></div>

            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                所属年级：
            </td>
            <td>
                <select name="DEPT_PARENT" class="BigSelect" id="deptParent_">

                </select>
                <img class="td_title2" src="../img/mg2.png" alt="">


            </td>
        </tr>
        <tr id = "showClass">
            <td class="td_w blue_text" >
                年级/班级：
            </td>
            <td>
                <input class="td_title1" id="deptName_" type="text" placeholder=""/>
                <img class="td_title2" src="../img/mg2.png" alt="">

            </td>
        </tr>

        <tr>
            <td class="blue_text">
                别名：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="deptAddress_" type="text" placeholder=""/>

            </td>
        </tr>
        <tr>
            <td class="blue_text">
                年级/班级简介：
            </td>
            <td>
                <textarea name="" cols="60" rows="5" id="deptFunc_"></textarea>

            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="button" class="new_but" id="new_">保存</button>
                <span id="dapaId_" style="display: none"></span>
            </td>
        </tr>
        <%--<tr>--%>
        <%--<td colspan="2">--%>
        <%--<button type="button" class="delete_but" id="delete_"><fmt:message code="depatement.th.currentdel" /></button>--%>
        <%--</td>--%>
        <%--</tr>--%>



        </tbody>
    </table>
</div>

<div class="step3" style="display: none;margin-left: 10px;">
    <div class="nav_box clearfix">
        <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/new_dept.png"></div>
        <%--<div class="nav_t2" class="news">编辑班级/成员单位-当前节点：[北京公司]</div>--%>
        <div class="nav_t2" class="news">修改班级</div>

    </div>
    <!-- 中间部分 -->
    <table class="newNews">

        <tbody>
        <tr>
            <td class="td_w blue_text">
                班级排序号：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="deptNoOne"/>
                <img class="td_title2" src="../img/mg2.png" alt="">
                <div class="tit">  <fmt:message code="depatement.th.digit" /></div>

            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                所属年级：
            </td>
            <td>
                <select name="DEPT_PARENT" class="BigSelect" id="deptParentOne">

                </select>
                <img class="td_title2" src="../img/mg2.png" alt="">


            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                班级：
            </td>
            <td>
                <input class="td_title1" id="deptNameOne" type="text" placeholder=""/>
                <img class="td_title2" src="../img/mg2.png" alt="">


            </td>
        </tr>

        <tr>
            <td class="blue_text">
                别名：
            </td>
            <td>
                <input class="td_title1 time_coumon" id="deptAddressOne" type="text" placeholder=""/>

            </td>
        </tr>
        <tr>
            <td class="blue_text">
                班级简介：
            </td>
            <td>
                <textarea name="" cols="60" rows="5" id="deptFuncOne"></textarea>

            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="button" class="new_but" id="newOne">保存</button>
                <span id="dapaIdOne" style="display: none"></span>
            </td>
        </tr>
        <%--<tr>--%>
        <%--<td colspan="2">--%>
        <%--<button type="button" class="delete_but" id="delete_"><fmt:message code="depatement.th.currentdel" /></button>--%>
        <%--</td>--%>
        <%--</tr>--%>



        </tbody>
    </table>
</div>



</body>

<script>
    loadALLDeptSidebarurl='/eduDepartment/queryGetObj'
    //    user_id='query_toId';//选人控件
    /* 人员控件清空 */
    function empty(id){
        $("#"+id).val("");
    };
    $(function(){

        $("#deptParent").deptquerySelect(); //新建中上级班级中班级控件
        $("#deptParent_").deptquerySelect(); //编辑中上级班级中班级控件
        $("#deptParentOne").deptquerySelect();

        /* 选人控件 */
        $("#adduserAssistant").on("click",function(){
            user_id = "query_toId";
            $.popWindow("../common/selectUser");
        });
        $("#adduserSatrap").on("click",function(){
            user_id = "query_Satrap";
            $.popWindow("../common/selectUser");
        });
        $("#UpAssistant").on("click",function(){
            user_id = "query_UpAssistant";
            $.popWindow("../common/selectUser");
        });
        $("#UpSatrap").on("click",function(){
            user_id = "query_UpSatrap";
            $.popWindow("../common/selectUser");
        });
        $("#adduserAssistant_").on("click",function(){
            user_id = "query_toId_";
            $.popWindow("../common/selectUser");
        });
        $("#adduserSatrap_").on("click",function(){
            user_id = "query_Satrap_";
            $.popWindow("../common/selectUser");
        });
        $("#UpAssistant_").on("click",function(){
            user_id = "query_UpAssistant_";
            $.popWindow("../common/selectUser");
        });
        $("#UpSatrap_").on("click",function(){
            user_id = "query_UpSatrap_";
            $.popWindow("../common/selectUser");
        });


        // 新建班级的
        $("#newOne").on("click",function(){

//           alert($('#deptParent option:checked').attr('value'));
            var data = {
                "deptName": $("#deptNameOne").val(),    // 班级名称
                "telNo": $("#telNoOne").val(),      //电话
                "faxNo":$("#faxNoOne").val(),  //传真
                "deptAddress": $("#deptAddressOne").val(),// 班级地址
                "deptNo":   $("#deptNoOne").val(),//  班级排序号
                "deptParent":  $('#deptParentOne option:checked').attr('value'),//上级班级ID
                 "deptFunc":$("#deptFunc").val()
            };

            if($('#deptNoOne').val()=='' || $('#deptNoOne').val().length>3){
                layer.msg('请填写班级排序号,最多3个字符', { icon:6});
                return false;
            }else if($('#deptNameOne').val()==''){
                layer.msg('请填写班级名称', { icon:6});
                return false;
            }else if(data.deptParent==-1){
                layer.msg('请填写上级班级id', { icon:6});
                return false;
            }{

                    $.ajax({
                        url:"<%=basePath%>/eduDepartment/addEduDepartmentWithBLOBs",
                        type:'post',
                        dataType:"JSON",
                        data : data,
                        success:function(data){
                            console.log(data);
                            if(data.flag == true){
                                $.layerMsg({content: data.msg, icon: 1});
                                location.reload();
                            }else {
                                $.layerMsg({content: data.msg, icon: 2});
                            }

                        },
//                        error:function(e){
//                            $.layerMsg({content: '保存失败！', icon: 2});
//                            console.log(e);
//                        }
                    });

            }
        });

        // 新建班级的
        $("#new").on("click",function(){

//           alert($('#deptParent option:checked').attr('value'));
            var data = {
                "deptName": $("#deptName").val(),    // 班级名称
                "telNo": $("#telNo").val(),      //电话
                "faxNo":$("#faxNo").val(),  //传真
                "deptAddress": $("#deptAddress").val(),// 班级地址
                "deptNo":   $("#deptNo").val(),//  班级排序号
                "deptParent":  '2',//上级班级ID

            };

            if($('#deptNo').val()=='' || $('#deptNo').val().length>3){
                layer.msg('请填写班级排序号,最多3个字符', { icon:6});
                return false;
            }else if($('#deptName').val()==''){
                layer.msg('请填写班级名称', { icon:6});
                return false;
            }else if(data.deptParent==-1){
                layer.msg('请填写上级班级id', { icon:6});
                return false;
            }{
                $.layerMsg({content:'正在新建！',icon:1},function(){
                    $.ajax({
                        url:"<%=basePath%>/eduDepartment/addEduDepartmentWithBLOBs",
                        type:'post',
                        dataType:"JSON",
                        data : data,
                        success:function(data){
                            if(data.flag == true){
                                $.layerMsg({content: '新建成功！', icon: 1});
                                setTimeout(function(){
                                    location.reload();
                                },1000)

                            }else {
                                $.layerMsg({content:'新建失败！', icon: 2});
                                setTimeout(function(){
                                    location.reload();
                                },1000)
                            }
                        },
                        error:function(e){
                            console.log(e);
                        }
                    });
                });
            }
        });

        //新建下级班级
        $("#newdeptDown").on("click",function(){
            $(".step1").show();
            $(".step2").hide();
            $(".step3").hide();
            var newbumen=$("#dapaId_").text();
            $('#deptParent').val(newbumen)
//            console.log($("#deptParent").find('option[value="'+newbumen_+'"]'))
//            $("#deptParent").find('option[value="'+newbumen_+'"]').attr("selected",true);//上级班级ID

        })


    })





</script>

</html>
