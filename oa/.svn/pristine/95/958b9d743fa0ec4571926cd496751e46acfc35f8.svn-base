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
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title>管理图书</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        .title{
            height:70px;
            line-height:70px;
        }
        .title span{
            font-size: 22px;
            color: #494d59;
        }
        .title img{
            vertical-align: middle;
            padding-left:20px;
            float:left;
            margin:23px 5px 0px 0px;
        }
        .table{
            width:40%;
            margin:0 auto;
        }
        table{
            width:100%;
        }
        table th{
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            text-align:center;
        }
        table td{
            text-align:center;
        }
        table th,tr{
            padding:10px;
        }
        .foot{
            text-align: center;
            height: 70px;
            line-height: 70px;
        }
        table a{
            text-decoration: none;
            color:#207bd6;
            padding-right:5px;
        }
        #back{
            display: inline-block;
            width: 78px;
            height: 30px;
            line-height: 30px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
        }
        #delete{
            background: url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left: 20px;
            cursor: pointer;
            display: inline-block;
        }
        .addBook{
            text-align:right;
            padding-right:30px;
            margin:-45px 0px 20px 0px;
        }
        .addBook span{
            cursor:pointer;
            background: url(../../img/vote/save.png) no-repeat;
            color: #fff;
            width: 128px;
            display: inline-block;
            height:30px;
            line-height: 30px;
            padding-right:50px;
            font-size:16px;
        }

        .type{
            width:400px;
            margin:30px auto;
        }
        .type tr{
            border:none;
        }

        .type input{
            width:250px;
            height:28px;
            line-height: 28px;
            border-radius: 2px;
        }
        .weight{
            font-weight:bold;
        }



    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div>
    <div class="title">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/manage.png" alt="">
        <span>图书类别定义</span>
    </div>
    <div class="addBook">
        <span class="addType">添加图书类别</span>
    </div>
    <div class="table">
        <table>
            <thead>
            <th>图书类别</th>
            <th>操作</th>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>

</div>
</body>
<script>
    $(function(){
//        点击添加图书类别
        $('.addType').click(function(){
            layer.open({
                type:1,
                title:['图书类别', 'background-color:#2b7fe0;color:#fff;'],
                area: ['400px', '220px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['添加', '关闭',],
                content:'<div class="type">' +
                '        <table>' +
                '            <tr>' +
                '                <td class="weight">类别名称：</td>' +
                '                <td>' +
                '                    <input type="text" class="typeName">' +
                '                </td>' +
                '            </tr>' +
                '        </table>' +
                '    </div>',
                yes:function(index){
                    if($('.typeName').val()==''){
                        $.layerMsg({content: '类别名称不能为空', icon:3});
                        return;
                    }
                    $.ajax({
                        url: '/bookType/selCountByTypeName',
                        type: 'post',
                        dataType: 'json',
                        data:{
                            typeName:$('.typeName').val()
                        },
                        success: function (res) {
                            var data={
                                typeName:$('.typeName').val()
                            }
                            if(res.flag){
                                if(res.totleNum>0){
                                    $.layerMsg({content: '该类型名称已经存在', icon:0});
                                    return;
                                }else{
                                    $.ajax({
                                        url:'/bookType/insertType',
                                        data:data,
                                        type:'post',
                                        dataType:'json',
                                        success:function(res){
                                            if(res.flag){
                                                $.layerMsg({content: '添加成功', icon:1});
                                                show();
                                                layer.close(index);
                                            }else{
                                                $.layerMsg({content: '添加失败', icon:1});
                                            }
                                        }
                                    })
                                }
                            }else{
                                $.layerMsg({content: '添加失败', icon:1});
                            }
                        }
                    })
                },
                btn2:function(index){
                    layer.close(index);
                }
            })
        })

//        展示图书类别
        function show(){
            $.ajax({
                url:'/bookType/selAllType',
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str=""
                    for(var i=0;i<data.length;i++){
                        str += '<tr>' +
                            '                <td>'+data[i].typeName+'</td>' +
                            '                <td id="'+data[i].typeId+'">' +
                            '                    <a href="JavaScript:;" class="edit">编辑</a>' +
                            '                    <a href="javascript:;" class="remove">删除</a>' +
                            '                </td>' +
                            '            </tr>'
                    }
                    $('.list').html(str)
                }
            })
        }
        show()

//        点击删除图书类别
        $('.list').on('click','.remove',function(){
            var typeId=$(this).parent().attr('id');
            layer.confirm('<fmt:message code="menuSSetting.th.isdeleteMenu" />？', {
                btn: ['<fmt:message code="global.lang.delete" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                title:"<fmt:message code="event.th.DeleteEvent" />"
            },function(){
                $.ajax({
                    url:'/bookType/delTypeById',
                    data:{typeId:typeId},
                    type:'post',
                    dataType:'json',
                    success:function(res){
                        if(res.flag){
                            $.layerMsg({content: '删除成功', icon:1});
                            show();
                        }else{
                            $.layerMsg({content: '删除失败', icon:2});
                        }
                    }
                })
            },function(){
                layer.close();
            })
        })

//        点击编辑图书类别
        $('.list').on('click','.edit',function(){
            var typeId=$(this).parent().attr('id');
            $.ajax({
                url:'/bookType/selTypeById',
                data:{typeId:typeId},
                type:'post',
                dataType:'json',
                success:function(res){
                    var data=res.object;
                    layer.open({
                        type:1,
                        title:['图书类别', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['400px', '220px'],
                        shadeClose: true, //点击遮罩关闭
                        btn: ['确认', '关闭',],
                        content:'<div class="type">' +
                        '        <table>' +
                        '            <tr>' +
                        '                <td class="weight">类别名称：</td>' +
                        '                <td>' +
                        '                    <input type="text" class="typeName" value="'+data.typeName+'">' +
                        '                </td>' +
                        '            </tr>' +
                        '        </table>' +
                        '    </div>',
                        yes:function(index){
                            if($('.typeName').val()==''){
                                $.layerMsg({content: '类别名称不能为空', icon:3});
                                return;
                            }else{
                                $.ajax({
                                    url: '/bookType/selCountByTypeName',
                                    type: 'post',
                                    dataType: 'json',
                                    data:{
                                        typeName:$('.typeName').val()
                                    },
                                    success: function (res) {
                                        var data={
                                            typeId:typeId,
                                            typeName:$('.typeName').val()
                                        }
                                        if(res.flag){
                                            if(res.totleNum>0){
                                                $.layerMsg({content: '该类型名称已经存在', icon:0});
                                                return;
                                            }else{
                                                $.ajax({
                                                    url:'/bookType/upTypeById',
                                                    data:data,
                                                    type:'post',
                                                    dataType:'json',
                                                    success:function(res){
                                                        if(res.flag){
                                                            $.layerMsg({content: '编辑成功', icon:1});
                                                            show();
                                                            layer.close(index);
                                                        }else{
                                                            $.layerMsg({content: '编辑失败', icon:1});
                                                        }
                                                    }
                                                })
                                            }
                                        }else{
                                            $.layerMsg({content: '编辑失败', icon:2});
                                            return;
                                        }
                                    }
                                })
                            }
                        },
                        btn2:function(index){
                            layer.close(index);
                        }
                    })
                }
            })
        })
    })
</script>
</html>
