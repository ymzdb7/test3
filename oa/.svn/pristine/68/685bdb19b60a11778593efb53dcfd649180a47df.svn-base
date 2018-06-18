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
            width: 80%;
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
        th,td{
            border:1px solid #c0c0c0;
        }
        #back{
            display: inline-block;
            width: 90px;
            height: 38px;
            line-height: 35px;
            margin-right: 30px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/newReturn.png) no-repeat;
            padding-left: 19px;
            font-size: 14px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <span>选修课详细</span>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th>已选学生</th>
                <th>所属班级</th>
            </tr>
            </thead>
            <tbody class="list">

            </tbody>
            <tfoot>
                <tr>
                    <td colspan="2">
                        <button id="back">返回</button>
                    </td>
                </tr>
            </tfoot>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        var sId=$.GetRequest().sId;
        console.log(sId);
        function show(){
            $.ajax({
                url:'/eduElectiveStudentCount/studentClassIdName',
                type:'post',
                data:{sid:sId},
                dataType:'json',
                success:function(res){
                    var datas=res.obj;
                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+='<tr id="'+datas[i].classId+'">' +
                            '                    <td>'+datas[i].studentName+'</td>' +
                            '                    <td>'+datas[i].classStudentName+'</td>' +
                            '                </tr>'
                    }
                    $('.list').html(str)
                }
            })
        }
        show();
//        点击返回
        $('#back').click(function(){
            self.parent.document.getElementById('iframe').src='/eduElectiveStudentCount/onClassStatistics'
        })
    })
</script>
</body>
</html>
