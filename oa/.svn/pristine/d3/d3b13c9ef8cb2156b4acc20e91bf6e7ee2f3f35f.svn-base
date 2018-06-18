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
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title>选修课统计</title>
    <style>
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:0px;
        }
        .title{
            margin-bottom:-7px;
        }
        .title img{
            vertical-align: middle;
            padding-left:20px;
        }
        document,body{
            width:100%;
            height:100%;
        }

        .content{
            margin:20px auto 0px;
            width:100%;
            height:100%;
        }
        .table table{
            width: 97%;
            margin:0 auto;
            text-align:center;
        }
        th{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:45px;
        }
        .titleName{
            cursor:pointer;
        }
        .name{
            padding-left:20px;
            color:#333;
        }
        #course{
            width:80px;
        }
        #chooseName{
            width:150px;
        }
        #state{
            width:80px;
        }
        .box{
            margin-bottom:10px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <img src="../../img/edu/class.png" alt="">
        <span >选修课统计</span>
    </div>
    <div class="box" >
        <label class="name">课程:</label>
        <select  id="course">
            <option value="0">请选择</option>
        </select>
        <label class="name">状态:</label>
        <select  id="zhuangtai">
            <option value="2">请选择</option>
            <option value="0">未选满</option>
            <option value="1">已选满</option>
        </select>
        <label class="name">课程名称:</label>
        <select  id="chooseName">
            <option value="0">请选择</option>
        </select>
        <button id="cx" class="submit float" style="    width: 70px; height: 28px;border-radius: 4px;padding-left:10px;"> 查询</button>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th>课程名称</th>
                <th>已选学生</th>
                <th>上限</th>
                <th>上课时间</th>
                <th>上课地点</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        //        获取课程名称和课程下拉框数据
        function getSelect(){
            $.ajax({
                url:'/eduElectivePublish/selectEduPublish',
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str=""
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].id+'">'+data[i].electiveCourse+'</option>'
                    }
                    $('#chooseName').append(str);
                }
            });
            $.ajax({
                url:'/eduElectiveCourseController/selectEduElectiveCourse',
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str=""
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].id+'">'+data[i].courseName+'</option>'
                    }
                    $('#course').append(str);
                }
            })
        }
        getSelect();

//        按上课班统计列表显示
        function show(data){
            $.ajax({
                url:'/eduElectiveStudentCount/eudSelectClassStudentCount',
                type:'get',
                data:data,
                dataType:'json',
                success:function(reg){
                    var datas=reg.object;
                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+='<tr> ' +
                                '<td>'+datas[i].electiveCourse+'</td> ' +
                                '<td>'+datas[i].sumsid+'</td> ' +
                                '<td>'+datas[i].maxpeople+'</td> ' +
                                '<td>'+datas[i].classTime.split('|')[1]+'</td> ' +
                                '<td>'+datas[i].place+'</td> ' +
                                '<td id="'+datas[i].sid+'"> ' +
//                                    '<a href="javascript:;" class="change">调课</a> ' +
                                    '<a href="javascript:;" class="details" style="color:#1772c0">详情</a> ' +
                                '</td> ' +
                            '</tr>'
                    }
                    $('.list').html(str);
                }
            })
        }
        show();

//        点击详情
        $('.list').on('click','.details',function(){
            var sId=$(this).parent().attr('id')
            self.parent.document.getElementById('iframe').src='/eduElectiveStudentCount/statisticsDetails?sId='+sId;
        })
//        点击调课
        $('.list').on('click','.change',function(){
            self.parent.document.getElementById('iframe').src='/eduElectiveStudentCount/statisticsChange'
        })
    })
//    点击按钮查询
    $('#cx').click(function () {
        var date={
            nid:$('#course option:checked').val(),
            zhuangtai:$('#zhuangtai option:checked').val(),
            sid:$('#chooseName option:checked').val()
        }
        $.ajax({
            url:'/eduElectiveStudentCount/eudSelectClassStudentCount',
            type:'get',
            data:date,
            dataType:'json',
            success:function(reg){
                var datas=reg.object;
                var str="";
                for(var i=0;i<datas.length;i++){
                    str+='<tr> ' +
                        '<td>'+datas[i].electiveCourse+'</td> ' +
                        '<td>'+datas[i].sumsid+'</td> ' +
                        '<td>'+datas[i].maxpeople+'</td> ' +
                        '<td>'+datas[i].classTime.split('|')[1]+'</td> ' +
                        '<td>'+datas[i].place+'</td> ' +
                        '<td> ' +
                        //                                    '<a href="javascript:;" class="change">调课</a> ' +
                        '<a href="javascript:;" class="details"  style="color:#1772c0">详情</a> ' +
                        '</td> ' +
                        '</tr>'
                }
                $('.list').html(str);
            }
        })
    })
</script>
</body>
</html>
