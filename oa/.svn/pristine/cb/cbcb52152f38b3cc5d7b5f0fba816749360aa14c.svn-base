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

        #see,#add,#back{
            width: 50px;
            height: 26px;
            border-radius: 5px;
            color: #fff;
            background-color: #2F8AE3;
        }
        .box{
            margin-bottom:10px;
            text-align:center;
        }
        .text{
            width:200px;
        }
        .statistics{
            padding-left:20px;
            margin-bottom:10px;
        }
        .course{
            font-size:14px;
            color:#333;
            padding-right:5px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <span>选修课统计(开发中)</span>
    </div>
    <div class="box">
        <input type="text" class="text" placeholder="按姓名搜索">
        <button id="see">查找</button>
    </div>
    <div class="statistics">
        <span class="course">舞蹈</span>
        <button id="add">添加</button>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th>姓名</th>
                <th>年级班级</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody class="list">
            <tr>
                <td>刘同</td>
                <td>三年级一班</td>
                <td>
                    <a href="javascript:;" class="delete">删除</a>
                </td>
            </tr>
            </tbody>
            <tfoot>
            <tr>
                <td colspan="3">
                    <button id="back">返回</button>
                </td>
            </tr>
            </tfoot>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
//        function init(){
//            $.ajax({
//                url:'/vote/manage/getVoteTitleList',
//                type:'get',
//                dataType:'json',
//                success:function(reg){
//                    var datas=reg.obj;
//                    var str="";
//                    for(var i=0;i<datas.length;i++){
//                        str+='<tr class="pagediv" id='+datas[i].voteId+'> ' +
//                            '<td> ' +
//                            '<input type="checkbox" class="childCheck"> ' +
//                            '</td> ' +
//                            '<td>'+datas[i].userName+'</td> ' +
//                            '<td>'+datas[i].toId+'</td> ' +
//                            '<td class="titleName"><a href="javascript:;">'+datas[i].subject+'</a></td> ' +
//                            '<td>'+datas[i].type+'</td> ' +
//                            '<td>'+datas[i].anonymity+'</td> ' +
//                            '<td>'+datas[i].sendTime+'</td> ' +
//                            '<td>'+datas[i].endDate+'</td> ' +
//                            '<td>'+datas[i].publish+'</td> ' +
//                            '<td></td> ' +
//                            '<td class="parent" id="'+datas[i].voteId+'"> ' +
//                            '<a class="children" href="javascript:;">子投票</a> ' +
//                            '<a class="item" href="javascript:;">投票项目</a> ' +
//                            '<a class="editd" href="javascript:;">修改</a> ' +
////                                    '<a class="out" href="javascript:;">导出</a> ' +
//                            '<a class="end" href="javascript:;">立即终止</a> ' +
//                            '</td> ' +
//                            '</tr>'
//                    }
//                    $('.list').append(str);
//                }
//            })
//        }
//        init();

//        点击返回
        $('#back').click(function(){
            self.parent.document.getElementById('iframe').src='/eduElectiveStudentCount/onClassStatistics'
        })
    })
</script>
</body>
</html>
