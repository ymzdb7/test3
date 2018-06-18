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

<html>
<head>
    <title><fmt:message code="event.th.EventManagement" /></title>
    <link rel="stylesheet" href="/css/event/eventIndex.css">
    <link rel="stylesheet" type="text/css" href="../css/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="../css/easyui/icon.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script type="text/javascript" src="../js/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/jquery.form.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        input,textarea{
            text-indent: 5px;
        }
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
        .inPole textarea{
            margin-left: 0;
        }
        .divbox{
            cursor: pointer;
            width: 100%;
            text-overflow: ellipsis;
            overflow: hidden;
            height: 25px;
            white-space: nowrap;
        }
    </style>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_manage.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="event.th.EventManagement" />
    </div>
    <div class="newClass" id="newClass"><span style="margin-left: 35px;"><fmt:message code="global.lang.new" /></span></div>
    <div class="seeClass" id="seeClass"><span style="margin-left: 35px;"><fmt:message code="notice.th.return" /></span></div>
</div>
<div class="main">

    <div class="mainRight">
        <div class="pagediv" style="margin: 0 auto;width: 99%;">
            <table>
                <thead>
                <tr class="conLeft">
                    <th class="conLeft" style="width: 10%;"><fmt:message code="notice.th.title" /></th>
                    <th class="conLeft" style="width: 20%;"><fmt:message code="sup.th.startTime" /></th>
                    <th class="conLeft" style="width: 20%;"><fmt:message code="meet.th.EndTime" /></th>
                    <th class="conLeft" ><fmt:message code="notice.th.content" /></th>
                    <th class="conLeft" style="width: 15%;text-align: center"><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
</div>
<script>
    $(function () {
//        获取cookie
        function getCookie (key) {
            var arr=document.cookie.split('; '); //多个cookie之间是用;+空格连接的
            for (var i = 0; i < arr.length; i++) {
                var arr2=arr[i].split('=');
                if(arr2[0]==key){
                    return arr2[1];
                }
            }
            return false;//如果函数没有返回值，得到的结果是undefined
        }
        var cookie=getCookie('uuid');
//   查看列表数据
        function init(){
            $('tbody').eq(0).empty();

            console.log(cookie);
            $.ajax({
                type:'get',
                url:'/timeLineEvent/getEventList',
                dataType:'json',
                data:{'uuid':cookie},
                success:function(res){
                    var datas=res.obj;
                    if(datas.length>0){
                        for(var i=0;i<datas.length;i++){
                            var newCon =$('<tr class="conLeft" id='+datas[i].uuid +'>' +
                                '<td style="width: 15%;"><div class="divbox" title="'+datas[i].title+'">'+datas[i].title+'</div></td>' +
                                '<td style="width: 20%;">'+datas[i].startTime+'</td>' +
                                '<td style="width: 20%;">'+datas[i].endTime+'</td>' +
                                '<td style="width: 15%;"><div class="divbox" title="'+datas[i].content+'">'+datas[i].content+'</div></td>' +
                                '<td class="pagediv">' +
                                '<a href="javascript:;" style="padding:0px 10px" class="search"><fmt:message code="long.th.See" /></a>' +
                                '<a href="javascript:;" style="padding:0px 10px" data-id="'+datas[i].uuid+'" class="edit"><fmt:message code="global.lang.edit" /></a>' +
                                '<a href="javascript:;" style="padding:0px 10px" class="remove"><fmt:message code="global.lang.delete" /></a>' +
                                '</td>' +
                                ' </tr>');
                            $('tbody').eq(0).append(newCon);
                        }
                    }else{
                        $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:3});
                    }

                }
            })
        }
        init();

//返回
        $('#seeClass').click(function(){
            window.location.href="eventManage";
        })
//        添加事件
        $('#newClass').click(function(event){
            event.stopPropagation();

            layer.open({
                type: 1,
                title:['<fmt:message code="event.th.AddEvent" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '398px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" /><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>：</span><span><input type="text" style="width: 280px;" id="title" name="typeName" class="inputTd" value="" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" /><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>：</span><span><input type="text" style="width: 180px;" name="beginTime" class="inputTd" value="" id="beginTime" onclick="laydate(start)" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" /><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>：</span><span><input type="text" style="width: 180px;" name="endTime" class="inputTd" value="" id="endTime" onclick="laydate(end)" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><div class="inPole"><textarea name="txt" id="textCont" value="" style="min-width: 300px;min-height:150px;"></textarea></div></span></div>'+
                '</div>',
                yes:function(index){
                    if($('#title').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.titleCannotEmpty" />！',icon:3});
                        return;
                    }
                    if($('#beginTime').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.StartEmpty" />！',icon:3});
                        return;
                    }
                    if($('#endTime').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                        $.layerMsg({content:'<fmt:message code="event.th.EndEmpty" />！',icon:3});
                        return;
                    }
                    var data={
                        uuid:cookie,
                        title:$('#title').val(),
                        startTime:$('#beginTime').val(),
                        endTime:$('#endTime').val(),
                        content:$('#textCont').val()
                    }
//                    新建
                    $.ajax({
                        type:'post',
                        url:'/timeLineEvent/addEventInfor',
                        dataType:'json',
                        data:data ,
                        success:function(res){
                            if(res.flag){
                                $.layerMsg({content:"保存成功!",icon:1});
                                init();
                            }else{
                                $.layerMsg({content:"保存失败!",icon:2});
                            }
                        }
                    });
                    layer.close(index);
                }
            });

        });
        //删除
        $('.pagediv').on('click','.remove',function(){
            var uuid=$(this).parent().parent().attr('id');
            console.log(uuid);
            layer.confirm('<fmt:message code="workflow.th.que" />', {
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                title:"<fmt:message code="event.th.DeleteEvent" />"
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url:'/timeLineEvent/deleteEventByUuid',
                    dataType:'json',
                    data:{'uuid':uuid},
                    success:function(){
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                        init();
                    }
                })

            }, function(){
                layer.closeAll();
            });
        })
//        点击编辑
        $('.pagediv').on('click','.edit',function(){
            var sId=$(this).parent().parent().attr('id');
            var me=this;
            $.ajax({
                type:'post',
                url:'/timeLineEvent/getEventDetailByUuid',
                dataType:'json',
                data:{'uuid':sId},
                success:function(reg){
                    var data=reg.object;
                    layer.open({
                        type:1,
                        title:['<fmt:message code="event.th.EditEvents" />', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['600px', '398px'],
                        shadeClose: true, //点击遮罩关闭
                        btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                        content:'<div class="div_table">' +
                        '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.title" /><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>：</span><span><input type="text" style="width: 280px;" id="title" name="typeName" class="inputTd" value="'+data.title+'" /></span></div>'+
                        '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span><input type="text" style="width: 180px;" name="beginTime" class="inputTd" value="'+data.startTime+'" id="beginTime" onclick="laydate(start)" /></span></div>'+
                        '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span><input type="text" style="width: 180px;" name="endTime" class="inputTd" value="'+data.endTime+'" id="endTime" onclick="laydate(end)" /></span></div>'+
                        '<div class="div_tr"><span class="span_td"><fmt:message code="notice.th.content" />：</span><span><textarea name="txt" id="textCont" value="'+data.content+'" style="min-width: 300px;min-height:150px;vertical-align:top;margin-left:0px">'+data.content+'</textarea></span></div>'+
                        '</div>',
                        yes:function(index){
                            if($('#title').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                                $.layerMsg({content:'<fmt:message code="event.th.titleCannotEmpty" />！',icon:3});
                                return;
                            }
                            if($('#beginTime').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                                $.layerMsg({content:'<fmt:message code="event.th.titleCannotEmpty" />！',icon:3});
                                return;
                            }
                            if($('#endTime').val().replace(/(^\s*)|(\s*$)/g, "") == ''){
                                $.layerMsg({content:'<fmt:message code="event.th.titleCannotEmpty" />！',icon:3});
                                return;
                            }

                            var data={
                                uuid:$(me).attr('data-id'),
                                title:$('#title').val(),
                                startTime:$('#beginTime').val(),
                                endTime:$('#endTime').val(),
                                content:$('#textCont').val()
                            }
//                            console.log(data)
                            $.ajax({
                                type:'post',
                                url:'/timeLineEvent/updateInfor',
                                dataType:'json',
                                data:data ,
                                success:function(res){
                                    if(res.flag){
                                        $.layerMsg({content:'<fmt:message code="diary.th.modify" />',icon:1});
                                        init();
                                    }else{
                                        $.layerMsg({content:'<fmt:message code="meet.th.SaveFailed" />',icon:2});
                                    }
                                }
                            });
                            layer.close(index);
                        }
                    })
                }
            })
        });

        //点击查看
        $('.pagediv').on('click','.search',function(){
            var sId=$(this).parent().parent().attr('id');
            console.log(sId);
            $.ajax({
                type:'post',
                url:'/timeLineEvent/getEventDetailByUuid',
                dataType:'json',
                data:{'uuid':sId},
                success:function(reg){
                    var data=reg.object;
                    layer.open({
                        type:1,
                        title:['<fmt:message code="event.th.ViewEvents" />', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['400px', '298px'],
                        shadeClose: true, //点击遮罩关闭
                        content:'<div class="div_table">' +
                        '<div class="div_tr"><span class="span_td span_lf"><fmt:message code="notice.th.title" />：</span><span>'+ data.title+'</span></div>'+
                        '<div class="div_tr"><span class="span_td span_lf"><fmt:message code="sup.th.startTime" />：</span><span>'+data.startTime+'</span></div>'+
                        '<div class="div_tr"><span class="span_td span_lf"><fmt:message code="meet.th.EndTime" />：</span><span>'+data.endTime+'</span></div>'+
                        '<div class="div_tr"><span class="span_td span_lf"><fmt:message code="notice.th.content" />：</span><span><div class="inPole">'+data.content+'</div></span></div>'+
                        '</div>'
                    })

                }
            })
        })

    })



    //编辑保存/发布接口
    function editSupData(data,typeId,staId){
        $.ajax({
            type:'post',
            url:'/supervision/updateSupervision',
            dataType:'json',
            data:data,
            success:function(res){
                var statusName='';
                var statusMsg='';
                if(staId == 7){
                    statusName='<fmt:message code="user.th.PublishSuccessfully" />！';
                    statusMsg='<fmt:message code="event.th.PublishingFailure" />！';
                }else if(staId == 0){
                    statusName='<fmt:message code="diary.th.modify" />！';
                    statusMsg='<fmt:message code="meet.th.SaveFailed" />！';
                }
                if(res.flag){
                    $.layerMsg({content:statusName,icon:1});
                    init(typeId)
                }else{
                    $.layerMsg({content:statusMsg,icon:2});
                }
            }
        })
    }
    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm:ss',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
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
    //正在开发中
    function development() {
        $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment" />！',icon:6});
    }
</script>
</body>
</html>
