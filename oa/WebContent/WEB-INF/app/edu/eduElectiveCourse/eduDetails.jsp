<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选修课发布详情</title>
    <link rel="stylesheet" type="text/css" href="../../css/edu/addVehicle.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style>
        table tr td:first-of-type{
            width: 30%;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="header">
        <div class="title">选修课发布详情</div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 50%;">
            <tr>
                <td>选修课名称：</td>
                <td class="electiveCourse"></td>
            </tr>
            <tr>
                <td>课程：</td>
                <td class="courseName"></td>
            </tr>
            <tr>
                <td>学年：</td>
                <td class="year"></td>
            </tr>
            <tr>
                <td>学期：</td>
                <td class="term"></td>
            </tr>
            <tr>
                <td>每人选课上限：</td>
                <td class="maxClass"></td>
            </tr>
            <tr>
                <td>选课开始时间：</td>
                <td class="startTime"></td>
            </tr>
            <tr>
                <td>选课结束时间：</td>
                <td class="endTime"></td>
            </tr>
            <tr>
                <td>班级名称：</td>
                <td class="classNames"></td>
            </tr>
            <tr>
                <td>附件文档：</td>
                <td class="attachmentName"></td>
            </tr>
        </table>
        <div class="div_btn">
            <div class="save_btn"><span>关闭</span></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        var dataId=$.getQueryString('dataId');
        $.ajax({
            type:'get',
            url:'<%=basePath%>eduElectivePublish/selectEduPublish',
            dataType:'json',
            data:{id:dataId},
            success:function(res){
                var datas=res.obj;
                var startTime=new Date((datas[0].startTime)).Format('yyyy-MM-dd hh:mm');
                var endTime=new Date((datas[0].endTime)).Format('yyyy-MM-dd hh:mm');
                $('.electiveCourse').text(datas[0].electiveCourse);
                $('.courseName').text(datas[0].courseName);
                $('.year').text(datas[0].year);
                $('.term').text(datas[0].term);
                $('.maxClass').text(datas[0].maxClass);
                $('.startTime').text(startTime);
                $('.endTime').text(startTime);
                $('.classNames').text(datas[0].classNames);
                $('.attachmentName').text(datas[0].attachmentName);
            }
        })

//        点击关闭
        $('.save_btn').click(function(){
            window.close();
        })
    })
</script>
</body>
</html>


