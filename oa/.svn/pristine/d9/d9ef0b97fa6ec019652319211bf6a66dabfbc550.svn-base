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
            text-align:left;
        }
        th{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:45px;
            padding-left:10px;
        }
        th,td{
            border:1px solid #c0c0c0;
        }
        .box{
            margin-bottom:10px;
        }
        .nianJi{
            padding-left:30px;
        }
        .name,.publish,.course{
            padding-left:50px;
        }

        #close{
            width: 90px;
            height: 30px;
            line-height: 30px;
            border-radius: 4px;
            margin-left: 10%;
            padding-left: 14px;
            cursor: pointer;
            background: url(../../img/sys/cole.png) no-repeat;
            font-size: 16px;
            font-family: "微软雅黑";
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <span>选修课详情</span>
    </div>
    <div class="box">
        <span class="nianJi">年级：<span class="getNianji">二年级一班</span></span>
        <span class="name">姓名：<span class="getName">张有为</span></span>
        <span class="publish">发布课程：<span class="getPublishCourse">2016-2017课程发布</span></span>
        <span class="course">课程：<span class="getCourse">舞蹈</span></span>
    </div>
    <div class="table">
        <table>
            <thead>
                <tr>
                    <th>课程名称</th>
                    <th class="courseName">舞蹈</th>
                    <th>上课地点：</th>
                    <th class="place">音乐馆</th>
                    <th>上课时间：</th>
                    <th class="time">周一10:50至11:55</th>
                </tr>
            </thead>
            <tbody class="list">
                <tr>
                    <td>学分：</td>
                    <td class="fen">2</td>
                    <td>学时：</td>
                    <td class="shi">2</td>
                    <td>考试方式：</td>
                    <td class="type">考试</td>
                </tr>
                <tr>
                    <td>咨询老师：</td>
                    <td class="teacher">张老师</td>
                    <td>讲师(内部)：</td>
                    <td class="inner">李伶俐</td>
                    <td>讲师(外部)：</td>
                    <td class="out"></td>
                </tr>
                <tr>
                    <td>学费：</td>
                    <td class="fee">100</td>
                    <td>材料费：</td>
                    <td class="cost">200</td>
                    <td colspan="2">满人数50 开课人数20</td>
                </tr>
                <tr>
                    <td>课程内容：</td>
                    <td colspan="5" class="con">圣诞节和发扬</td>
                </tr>
                <tr>
                    <td>特点和意义：</td>
                    <td colspan="5" class="special">送if</td>
                </tr>
                <tr>
                    <td>备注：</td>
                    <td colspan="5" class="beizhu">史蒂夫</td>
                </tr>
                <tr>
                    <td colspan="6" style="text-align:center">
                        <button id="close">关闭</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        var sid=$.GetRequest().sid;
        function show(){
            $.ajax({
                url:'/eduElectiveStudentCount/eduElecctiveStudentCountSum',
                type:'post',
                data:{id1:sid},
                dataType:'json',
                success:function(res){
                    var data=res.object;
                    console.log(data);
                    $('.getNianji').text(data[0].class_names);
                    $('.getName').text(data[0].student_name);
                    $('.getPublishCourse').text(data[0].getPublishCourse);
                    $('.getCourse').text(data[0].course_name);
                    $('.courseName').text(data[0].course_name);
                    $('.time').text(data[0].year);
                    $('.fen').text(data[0].score);
                    $('.shi').text(data[0].class_hour);
                    $('.type').text(data[0].exam_type);
                    $('.teacher').text(data[0].student_name);
                    $('.inner').text(data[0].teacherin_name)
//                    $('.out').text(data.)
                    $('.fee').text(data[0].tuition);
                        $('.cost').text(data[0].material_cost);
                        $('.con').text(data[0].course_content)
                        $('.special').text(data[0].meaning_characteristics);
                        $('.beizhu').text(data[0].remarks);



                }
            })
        }
        show();

//        点击关闭
        $('.table').on('click','#close',function(){
            window.close();
        })
    })
</script>
</body>
</html>
