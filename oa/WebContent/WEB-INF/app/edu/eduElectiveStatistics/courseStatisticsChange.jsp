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
        td{
            border:1px solid #c0c0c0;
            text-align:left;
        }
        .box{
            margin-bottom:10px;
        }
        .name{
            padding-left:30px;
        }
        #save,#back{
            width: 50px;
            height: 26px;
            border-radius: 5px;
            color: #fff;
            background-color: #2F8AE3;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <span>选修课统计调课</span>
    </div>
    <div class="box">
        <span class="name">姓名：<span class="getName">付丽</span></span>
    </div>
    <div class="table">
        <table>
            <tbody class="list">
                <tr>
                    <td>可选课程：</td>
                    <td>
                        <input type="checkbox" name="" class="check">
                        <span class="course">舞蹈</span>
                        <span>上课时间：</span>
                        <span class="startTime">星期一10:50</span>
                        <span>下课时间：</span>
                        <span class="endTime">11:50</span>
                    </td>
                </tr>
            </tbody>
            <tfoot>
                <tr >
                    <td colspan="2" style="text-align:center;">
                        <button id="save">保存</button>
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
            window.close();
        })
    })
</script>
</body>
</html>
