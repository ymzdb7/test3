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
        .box{
            margin-bottom:10px;
        }
        .nianJi{
            padding-left:30px;
        }
        .chooseName{
            padding-left:150px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <span>选修课统计详情</span>
    </div>
    <div class="box">
        <span class="nianJi">年级：<span class="grade">二年级一班</span></span>
        <span class="chooseName">选课名称：<span class="name">2016-2017选修课发布</span></span>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th>姓名</th>
                <th>已选门数</th>
                <th>未选门数</th>
                <%--<th>操作</th>--%>
            </tr>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
//        获取url地址里的课程id和下拉框val
        var classId=$.GetRequest().classId;
        var sId=$.GetRequest().sId;

//        获取选修名称具体值
        function getName(){
            $.ajax({
                url:'/eduElectivePublish/selectEduPublish',
                type:'get',
                dataType:'json',
                success:function(res){
                   var datas=res.obj;
                   for(var i=0;i<datas.length;i++){
                       if(datas[i].id==sId){
                           $('.name').html(datas[i].electiveCourse);
                       }
                   }
                }
            })
        }
        getName();

//        统计详情列表显示
        function show(){
            $.ajax({
                url:'/eduElectiveStudentCount/eduClassStudent',
                type:'get',
                dataType:'json',
                data:{classId:classId,sid:sId},
                success:function(reg){
                    var datas=reg.obj;
                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+=' <tr id="'+datas[i].userId+'">' +
                                ' <td>'+datas[i].userName+'</td>\n' +
                                '<td>'+datas[i].nidCount+'</td>\n' +
                                '<td>'+function(){
                                    if((datas[i].maxClass-datas[i].nidCount)<0){
                                        return '0'
                                    }else{
                                        return (datas[i].maxClass-datas[i].nidCount);
                                    }
                            }()+'</td>\n' +
//                                '<td>\n' +
//                                '   <a href="javascript:;" class="change"></a>\n' +
//                                '</td>\n' +
                            '</tr>'
                    }
                    $('.list').html(str);
                }
            })
        }
        show();

//        点击调课
        $('.table').on('click','.change',function(){
            window.open("/eduElectiveStudentCount/courseStatisticsChange","_blank","top=100,left=300,width=700,height=500,menubar=yes,scrollbars=no,toolbar=yes,status=yes");
        })
    })
</script>
</body>
</html>
