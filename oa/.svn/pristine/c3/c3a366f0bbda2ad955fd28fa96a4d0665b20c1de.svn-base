<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title><fmt:message code="event.th.MemorabiliaManagement" /></title>
    <link rel="stylesheet" href="/css/event/eventManage.css">
    <link rel="stylesheet" type="text/css" href="../css/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="../css/easyui/icon.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script type="text/javascript" src="../js/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/jquery.form.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        .div_tr input{
            float: none;
            height: 28px;
            border: #999 1px solid;
        }
        .develop_div{
            width: 100%;
            margin-top: 200px;
            font-size: 16px;
            text-align: -webkit-center;
        }
        .ellipsis{
            overflow:hidden;
            text-overflow: ellipsis;
            white-space:nowrap;
        }
        table th{
            text-align:left;
            padding-left:10px;
        }
        table td{
            text-align:left;
            padding-left:10px;
        }
        .newClass{
            margin-right: 2%;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dsjgl.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.MemorabiliaManagement" />
    </div>
    <div class="newClass" id="newClass"><span style="margin-left: 30px;"><img style="margin-right: 4px;margin-left: -11px;margin-bottom: -2px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="global.lang.new" /></span></div>
    <div class="seeClass" id="seeClass"><span style="margin-left: 28px;"><img style="margin-right: 4px;margin-left: -14px;margin-bottom: -1px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="event.th.AdvancedQuery" /></span></div>
</div>
<div class="main">

    <div class="mainRight">
        <div class="pagediv" style="margin: 0 auto;width: 99%;">
            <table>
                <thead>
                <tr>
                    <th style="width: 15%;"><fmt:message code="notice.th.title" /></th>
                    <th style="width: 15%;"><fmt:message code="notice.th.type" /></th>
                    <th style="width: 15%;"><fmt:message code="notice.th.content" /></th>
                    <th style="width: 15%;"><fmt:message code="notice.th.createTime" /></th>
                    <th style="width: 10%;"><fmt:message code="event.th.Label" /></th>
                    <th><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
</div>
<script>
    var user_id='';
    var dept_id='';
    var priv_id='';
    $(function () {


        //新建
        $('#newClass').click(function(event){
            event.stopPropagation();
            layer.open({
                type: 1,
                title:['<fmt:message code="event.th.AddMemorabilia" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '500px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-left: 35px;margin-top: 38px;">' +
                '<div class="div_tr"><span class="span_td" style="margin-left: -6px;font-size: 14px;"><fmt:message code="url.th.EssentialInformation" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" />：</span><span><input type="text" style="width: 180px;" name="name" class="inputTd" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.type" />：</span><span><select name="textType" id="textType" style="width: 180px;"><option value="001" checked="checked"><fmt:message code="evvent.th.EngineeringProject" /></option><option value="002"><fmt:message code="event.th.ConferenceActivities" /></option></select></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span><input type="text" style="width: 180px;" name="beginTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span><input type="text" style="width: 180px;" name="endTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><div class="inPole"><textarea name="txt" id="textCont" value="" style="min-width: 300px;min-height:60px;"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="event.th.Label" />：</span><span><div class="inPole"><textarea name="txt" id="tag" value="" style="min-width: 220px;min-height: 30px;"></textarea></div></span></div>'+
                '<div class="div_tr"><span class="span_td" style="margin-left: -6px;font-size: 14px;width: 275px;"><fmt:message code="event.th.View" />：</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="diary.th.body" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="hr.th.department" />：</span><span><div class="inPole"><textarea name="txt" id="userDept" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="userManagement.th.role" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td" style="margin-left: -6px;font-size: 14px;width: 275px;"><fmt:message code="event.th.Administrative" />：</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="diary.th.body" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser1" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser1" class="clearUser1 "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="hr.th.department" />：</span><span><div class="inPole"><textarea name="txt" id="userDept1" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept1" class="clearDept1 "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="userManagement.th.role" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv1" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv1" class="clearPriv1 "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '</div>',
                yes:function(index){

                    if($('input[name="name"]').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.titleCannotEmpty" />！',icon:3});
                        return;
                    }
                    if($('input[name="beginTime"]').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.StartEmpty" />！',icon:3});
                        return;
                    }
                    if($('input[name="endTime"]').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.EndEmpty" />！',icon:3});
                        return;
                    }
                    if($('#textCont').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.ContentCannotEmpty" />！',icon:3});
                        return;
                    }
                    var data={
                        title:$('input[name="name"]').val(),
                        type:$('#textType option:selected').val(),
                        startTime:$('input[name="beginTime"]').val(),
                        endTime:$('input[name="endTime"]').val(),
                        content:$('#textCont').val(),
                        tag:$('#tag').val(),
                        post1:$('#userDuser1').attr('user_id'),
                        post2:$('#userPriv1').attr('userpriv'),
                        post3:$('#userDept1').attr('deptid'),
                        view1:$('#userDuser').attr('user_id'),
                        view2:$('#userPriv').attr('userpriv'),
                        view3:$('#userDept').attr('deptid')
                    }
                    $.ajax({
                        type:'post',
                        url:'/timeLine/addData',
                        dataType:'json',
                        data:data,
                        success:function(res){
                            if(res.flag){
                                $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />！',icon:1});
                                init();
                            }else{
                                $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />！',icon:2});
                            }
                        }
                    })
                    layer.close(index);
                },
            });

            //查看权限
            $("#selectUser").on("click",function(){//选人员控件
                user_id='userDuser';
                $.popWindow("../common/selectUser");
            });
            $("#selectPriv").on("click",function(){//选角色控件
                priv_id='userPriv';
                $.popWindow("../common/selectPriv");
            });
            $("#selectDept").on("click",function(){//选部门控件
                dept_id='userDept';
                $.popWindow("../common/selectDept");
            });
            //清除数据
            $('#clearUser').click(function(){ //清空人员
                $('#userDuser').attr('user_id','');
                $('#userDuser').attr('userprivname','');
                $('#userDuser').removeAttr('dataid');
                $('#userDuser').val('');
            });
            $('#clearPriv').click(function(){ //清空角色
                $('#userPriv').removeAttr('userpriv');
                $('#userPriv').removeAttr('privid');
                $('#userPriv').attr('dataid','');
                $('#userPriv').val('');
            });
            $('#clearDept').click(function(){ //清空部门
                $('#userDept').removeAttr('deptid');
                $('#userDept').attr('dataid','');
                $('#userDept').removeAttr('deptno');
                $('#userDept').val('');
            });
            //管理权限
            $("#selectUser1").on("click",function(){//选人员控件
                user_id='userDuser1';
                $.popWindow("../common/selectUser");
            });
            $("#selectPriv1").on("click",function(){//选角色控件
                priv_id='userPriv1';
                $.popWindow("../common/selectPriv");
            });
            $("#selectDept1").on("click",function(){//选部门控件
                dept_id='userDept1';
                $.popWindow("../common/selectDept");
            });
            //清除数据
            $('#clearUser1').click(function(){ //清空人员
                $('#userDuser1').attr('user_id','');
                $('#userDuser1').removeAttr('userprivname');
                $('#userDuser1').attr('dataid','');
                $('#userDuser1').val('');
            });
            $('#clearPriv1').click(function(){ //清空角色
                $('#userPriv1').removeAttr('privid');
                $('#userPriv1').removeAttr('userpriv');
                $('#userPriv1').attr('dataid','');
                $('#userPriv1').val('');
            });
            $('#clearDept1').click(function(){ //清空部门
                $('#userDept1').removeAttr('deptid');
                $('#userDept1').attr('dataid','');
                $('#userDept1').removeAttr('deptno');
                $('#userDept1').val('');
            });
        });


        //点击高级查询
        $('.seeClass').on('click',function(event){
            event.stopPropagation();
            layer.open({
                type: 1,
                title:['<fmt:message code="event.th.queryCriteria" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['570px', '350px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.query" />', '<fmt:message code="workflow.th.Reset" />'],
                content: '<div class="div_table" style="margin-left: 35px;margin-top: 38px;">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" />：</span><span><input type="text" style="width: 220px;" name="title" id="title" class="inputTd" value="" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="event.th.EventType" />：</span><span><select name="type" id="type" style="width: 180px;"><option value="000" checked="checked"><fmt:message code="notice.th.all" /></option><option value="001"><fmt:message code="evvent.th.EngineeringProject" /></option><option value="002"><fmt:message code="event.th.ConferenceActivities" /></option>"</select></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="event.th.Label" />：</span><span><div class="tag"><textarea name="tag" id="tag" value="" style="min-width: 220px;min-height: 30px;margin-left: 85px;margin-top: -18px;"></textarea></div></span></div>'+
                '</div>',
                yes:function(index){
                    var data={
                        title:$('#title').val(),
                        type:$('#typeid option:checked').val(),
                        tag:$('#tag').val()
                    }
                    $.ajax({
                        type:'post',
                        url:'/timeLine/postPageTimelines',
                        data:data,
                        dataType:'json',
                        success:function(reg){
                            var datas=reg.obj;
                            var str = '';
                            $('tbody').eq(0).empty();
                            if(datas.length<=0){
                                $.layerMsg({content:'<fmt:message code="event.th.ContentEmpty" />！',icon:3});
                                return;
                            }else{
                                for(var i=0;i<datas.length;i++){
                                    str = $('<tr uuid='+datas[i].uuid+'>' +
                                        '<td class="ellipsis" style="width: 15%;">'+datas[i].title+'</td>' +
                                        '<td style="width: 5%;">'+datas[i].type+'</td>' +
                                        '<td class="ellipsis" style="width: 25%;">'+datas[i].content+'</td>' +
                                        '<td style="width: 15%;">'+datas[i].crTime+'</td>' +
                                        '<td class="ellipsis" style="width: 10%;">'+datas[i].tag+'</td>' +
                                        '<td class="pagediv">' +
                                        '<a href="javascript:void(0)" style="padding: 0px 5px" class="search"><fmt:message code="long.th.See" /></a>' +
                                        '<a href="javascript:void(0)" onclick="funxx(this)" style="padding: 0px 5px" calss="searchedit"><fmt:message code="global.lang.edit" /></a>' +
                                        '<a href="javascript:void(0)" style="padding: 0px 5px" class="delete"><fmt:message code="global.lang.delete" /></a>' +
                                        '<a href="javascript:void(0)" id="eventManage"  style="padding: 0px 5px" class="eventMang"><fmt:message code="event.th.EventManagement" /></a>' +
                                        '<a href="javascript:void(0)"  style="padding: 0px 5px" id="eventSee" class="eventSee"><fmt:message code="event.th.EventView" /></a>' +
                                        '</td>' +
                                        ' </tr>');
                                    $('tbody').eq(0).append(str);
                                }
                            }

                        }
                    })
                    layer.close(index);
                },
                btn2:function(index){
                    var data={
                        title:$('#title').val(""),
                        type:$('#type option:checked').val(0),
                        tag:$('#tag').val("")
                    }
                    //layer.close(index);
                }
            });
        })
    })
    //列表数据展示
    function init(){
        $('.pagediv tbody tr').remove();
        $.ajax({
            type:'get',
            url:'/timeLine/postPageTimelines',
            dataType:'json',
            success:function(res) {
                var datas = res.obj;
                var str = '';
                if (datas.length > 0) {
                    for (var i = 0; i < datas.length; i++) {
                        str += '<tr uuid='+datas[i].uuid+'>' +
                            '<td class="ellipsis"  style="width: 9%;">'+datas[i].title+'</td>' +
                            '<td style="width: 20%;">'+datas[i].codeName+'</td>' +
                            '<td class="ellipsis" style="width: 12%;">'+datas[i].content+'</td>' +
                            '<td style="width: 15%;">'+datas[i].crTime+'</td>' +
                            '<td class="ellipsis" style="width: 12%;">'+datas[i].tag+'</td>' +
                            '<td>' +
                                '<a href="javascript:void(0)" style="padding: 0px 5px" class="search"><fmt:message code="long.th.See" /></a>' +
                                '<a href="javascript:void(0)" style="padding: 0px 5px" onclick="funxx(this)" calss="searchedit"><fmt:message code="global.lang.edit" /></a>' +
                                '<a href="javascript:void(0)" style="padding: 0px 5px" class="delete"><fmt:message code="global.lang.delete" /></a>' +
                                '<a href="javascript:void(0)" style="padding: 0px 5px" id="eventManage"><fmt:message code="event.th.EventManagement" /></a>' +
                                '<a href="javascript:void(0)" style="padding: 0px 5px" class="eventSee" id="eventSee"><fmt:message code="event.th.EventView" /></a>' +
                            '</td>' +
                            '</tr>';
                    }
                    $('.pagediv tbody').append(str);
                } else {
                    $.layerMsg({content: '<fmt:message code="sup.th.NoMoreContent" />！', icon: 5});
                }
            }
        })
    }
    init();


    //点击查看详情
    $('.pagediv').on('click','.search',function () {
        var uuid=$(this).parent().parent().attr('uuid');
        $.ajax({
            type:'post',
            url:'/timeLine/getTimeLineByUuid',
            dataType:'json',
            data:{'uuid':uuid},
            success:function(reg) {
                var data = reg.object;
                layer.open({
                    type:1,
                    title: ['查看大事记', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['500px', '400px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.close" />'], //按钮
                    content: '<div class="div_table">' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" />：</span><span>' + data.title + '</span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.type" />：</span><span>' + data.codeName + '</span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span>' + data.startTime + '</span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span>' + data.endTime + '</span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="event.th.Label" />：</span><span><div class="inPole">' + data.tag + '</div></span></div>' +
                    '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><div class="inPole">' + data.content + '</div></span></div>' +
                    '</div>',
                })
            }
        })
    })

    //编辑保存

    function funxx(me){

            var uid=$(me).parent().parent().attr('uuid');
            $.ajax({
                type:'post',
                url:'/timeLine/getTimeLineByUuid',
                dataType:'json',
                data:{'uuid':uid},
                success:function(reg) {
                    var data = reg.object;

                    //console.log(data);
                    layer.open({
                        type: 1,
                        title: ['编辑大事记', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['500px', '400px'],
                        shadeClose: true, //点击遮罩关闭
                        btn: ['<fmt:message code="global.lang.save" />','<fmt:message code="global.lang.close" />'], //按钮
                        content: '<div class="div_table">' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" />：</span><span><input type="text" style="width: 180px;" name="name" class="inputTd" id="title" value="' + data.title + '" /></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.type" />：</span><select name="textType" id="textType" style="width: 180px;"><option value="001"><fmt:message code="evvent.th.EngineeringProject" /></option><option value="002"><fmt:message code="event.th.ConferenceActivities" /></option></select></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span><input type="text" style="width: 180px;" name="beginTime" id="beginTime" class="inputTd" value="' + data.startTime + '" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span><input type="text" style="width: 180px;" name="endTime" id="endTime" class="inputTd" value="' + data.endTime + '" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" /></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><div class="inPole"><textarea name="txt" id="textCont" value="" style="min-width: 300px;min-height:60px;">' + data.content + '</textarea></div></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="event.th.Label" />：</span><span><div class="inPole"><textarea name="txt" id="tag" value="" style="min-width: 220px;min-height: 30px;">' + data.tag + '</textarea></div></span></div>' +
                        '<div class="div_tr"><span class="span_td" style="margin-left: -6px;font-size: 14px;width: 275px;"><fmt:message code="event.th.View" />：</span></div>'+
                        '<div class="div_tr"><span class="span_td"><fmt:message code="diary.th.body" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser"  user_id="'+data.viewUserId+'" value="" disabled style="min-width: 220px;min-height:60px;">' + data.viewUserName + '</textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="hr.th.department" />：</span><span><div class="inPole"><textarea name="txt" id="userDept"   deptid="'+data.viewDeptId+'" value="" disabled style="min-width: 220px;min-height:60px;">' + data.viewDeptName + '</textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="userManagement.th.role" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv"  userpriv="'+data.viewRoleId+'"  value="" disabled style="min-width: 220px;min-height:60px;">' + data.viewRoleName + '</textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                        '<div class="div_tr"><span class="span_td" style="margin-left: -6px;font-size: 14px;width: 275px;"><fmt:message code="event.th.Administrative" />：</span></div>'+
                        '<div class="div_tr"><span class="span_td"><fmt:message code="diary.th.body" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser1" user_id="'+data.postUserId+'" value="" disabled style="min-width: 220px;min-height:60px;">' + data.postUserName+ '</textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser1" class="clearUser1 "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                        '<div class="div_tr"><span class="span_td"><fmt:message code="hr.th.department" />：</span><span><div class="inPole"><textarea name="txt" id="userDept1"  deptid="'+data.postDeptId+'" value="" disabled style="min-width: 220px;min-height:60px;">' + data.postDeptName + '</textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept1" class="clearDept1 "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="userManagement.th.role" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv1"  userpriv="'+data.postRoleId+'" value="" disabled style="min-width: 220px;min-height:60px;">' + data.postRoleName + '</textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv1" class="clearPriv1 "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                        '</div>',
                        yes: function (index) {
                            if ($('#title').val().replace(/(^\s*)|(\s*$)/g, "") == '') {
                                $.layerMsg({content: '<fmt:message code="event.th.titleCannotEmpty" />！', icon: 3});
                                return;
                            }
                            var data = {
                                uuid:uid,
                                title: $('#title').val(),
                                content: $('#textCont').val(),
                                type: $('#textType option:selected').val(),
                                startTime: $('#beginTime').val(),
                                endTime: $('#endTime').val(),

                                tag: $('#tag').val(),
                                post1:$('#userDuser1').attr('user_id'),
                                post2:$('#userPriv1').attr('userpriv'),
                                post3:$('#userDept1').attr('deptid'),
                                view1:$('#userDuser').attr('user_id'),
                                view2:$('#userPriv').attr('userpriv'),
                                view3:$('#userDept').attr('deptid')
                            }
                            //编辑，调接口
                            $.ajax({
                                type: 'post',
                                url: '/timeLine/updateData',
                                dataType: 'json',
                                data: data,
                                success: function (res) {
                                    if (res.flag) {
                                        $.layerMsg({content:'<fmt:message code="netdisk.th.Editsuccess" />', icon: 1});
                                        init();
                                    } else {
                                        $.layerMsg({content: '<fmt:message code="event.th.EditFailed" />', icon: 2});
                                    }
                                }
                            });
                            layer.close(index);
                        }
                    })
                    //查看权限
                    $("#selectUser").on("click",function(){//选人员控件
                        user_id='userDuser';
                        $.popWindow("../common/selectUser?0");
                    });
                    $("#selectPriv").on("click",function(){//选角色控件
                        priv_id='userPriv';
                        $.popWindow("../common/selectPriv");
                    });
                    $("#selectDept").on("click",function(){//选部门控件
                        dept_id='userDept';
                        $.popWindow("../common/selectDept");
                    });
                    //清除数据
                    $('#clearUser').click(function(){ //清空人员
                        $('#userDuser').attr('user_id','');
                        $('#userDuser').attr('userprivname','');
                        $('#userDuser').removeAttr('dataid');
                        $('#userDuser').val('');
                    });
                    $('#clearPriv').click(function(){ //清空角色
                        $('#userPriv').removeAttr('userpriv');
                        $('#userPriv').removeAttr('privid');
                        $('#userPriv').attr('dataid','');
                        $('#userPriv').val('');
                    });
                    $('#clearDept').click(function(){ //清空部门
                        $('#userDept').removeAttr('deptid');
                        $('#userDept').attr('dataid','');
                        $('#userDept').removeAttr('deptno');
                        $('#userDept').val('');
                    });
                    //管理权限
                    $("#selectUser1").on("click",function(){//选人员控件
                        user_id='userDuser1';
                        $.popWindow("../common/selectUser?0");
                    });
                    $("#selectPriv1").on("click",function(){//选角色控件
                        priv_id='userPriv1';
                        $.popWindow("../common/selectPriv?0");
                    });
                    $("#selectDept1").on("click",function(){//选部门控件
                        dept_id='userDept1';
                        $.popWindow("../common/selectDept");
                    });
                    //清除数据
                    $('#clearUser1').click(function(){ //清空人员
                        $('#userDuser1').attr('user_id','');
                        $('#userDuser1').removeAttr('userprivname');
                        $('#userDuser1').attr('dataid','');
                        $('#userDuser1').val('');
                    });
                    $('#clearPriv1').click(function(){ //清空角色
                        $('#userPriv1').removeAttr('privid');
                        $('#userPriv1').removeAttr('userpriv');
                        $('#userPriv1').attr('dataid','');
                        $('#userPriv1').val('');
                    });
                    $('#clearDept1').click(function(){ //清空部门
                        $('#userDept1').removeAttr('deptid');
                        $('#userDept1').attr('dataid','');
                        $('#userDept1').removeAttr('deptno');
                        $('#userDept1').val('');
                    });
                }

            })

    }
    //        hover显示数据
    $('.pagediv').on('mouseover ','.ellipsis',function(){
        var textLength=$(this)[0].scrollWidth-20;
        var width=$(this).width();
        if(textLength>width){
            layer.tips($(this).text(),$(this),{tips:[3,'#2b7fe0']})
        }

    })

    //点击事件管理跳转
    $('.pagediv').on('click','#eventManage',function() {
       var sId=$(this).parent().parent().attr('uuid');
       document.cookie='uuid='+sId;
       window.location.href="/timeLineConmon/eventManageIndex";
   })

    // 点击事件查看跳转
    $('.pagediv').on('click','#eventSee',function(){
        var sId=$(this).parent().parent().attr('uuid');
        document.cookie='uuid='+sId;
        window.open('/timeLineConmon/eventSee','_blank');
    })
    //删除
        $('.pagediv').delegate('.delete','click',function () {
            var uuid=$(this).parent().parent().attr('uuid');
            layer.confirm('<fmt:message code="workflow.th.suredel" />','<fmt:message code="global.lang.delete" />',function () {
                $.ajax({
                    type:'post',
                    url:'/timeLine/deleteByUuid',
                    dataType:'json',
                    data:{'uuid':uuid},
                    success:function(){
                        $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:6});
                       init();
                    }
                })
            })
    })

    //时间控件调用
//    var start = {
//        format: 'YYYY-MM-DD hh:mm:ss',
//        /* min: laydate.now(), //设定最小日期为当前日期*/
//        /* max: '2099-06-16 23:59:59', //最大日期*/
//        istime: true,
//        istoday: false
////        choose: function(datas){
////            end.min = datas; //开始日选好后，重置结束日的最小日期
////            end.start = datas //将结束日的初始值设定为开始日
////        }
//    };
    var end = {
        format: 'YYYY-MM-DD hh:mm:ss',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false
//        choose: function(datas){
//            start.max = datas; //结束日选好后，重置开始日的最大日期
//        }
    };
    //时间控件调用
    var start1 = {
        format: 'YYYY-MM-DD hh:mm:ss',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false
//        choose: function(datas){
//            end1.min = datas; //开始日选好后，重置结束日的最小日期
//            end1.start = datas //将结束日的初始值设定为开始日
//        }
    };
    var end1 = {
        format: 'YYYY-MM-DD hh:mm:ss',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false
//        choose: function(datas){
//            start1.max = datas; //结束日选好后，重置开始日的最大日期
//        }
    };
</script>
</body>
</html>
