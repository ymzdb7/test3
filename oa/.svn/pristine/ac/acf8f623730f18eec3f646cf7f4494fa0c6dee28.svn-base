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
    <title>新建选修课基础课表</title>
    <link rel="stylesheet" type="text/css" href="../../css/edu/addVehicle.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <style>
        table tr td:first-of-type{
            width: 30%;
        }
        .title{
            font-size:22px;
            color:#494d59;
            padding-left:0%;
            padding-right: 20px;
            display: inline;
        }
        .nav_t1{
            display: inline;
            float: left;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="header">
        <div class="nav_t1" style="padding-left: 15px;padding-top: 10px">
            <img src="../../img/edu/xinjianxuanxukejicu.png" >
        </div>
        <div class="title">新建选修课基础课表</div>
    </div>
    <div class="main" style="padding-top: 11px">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 50%;">
            <tr>
                <td>选修课程编号：</td>
                <td><input type="text" name="nid" id="nid" value="" /></td>
            </tr>
            <tr>
                <td>选修课程名称：</td>
                <td><input type="text" name="course_name" id="course_name" value="" /></td>
            </tr>
            <tr>
                <td>选修课程英文名称：</td>
                <td><input type="text" name="course_ename" id="course_ename" value="" /></td>
            </tr>
            <tr>
                <td>选修课程所属领域：</td>
                <td>
                    <select name="course_area" class="BigSelect">

                    </select>
                </td>
            </tr>
        </table>
        <div class="div_btn">
            <div class="save_btn"><span>保存</span></div>
            <div class="reset_btn"><span>返回</span></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        initArea($('[name="course_area"]'));

//        点击返回
        $('.reset_btn').click(function(){
            self.parent.document.getElementById('iframe').src="basicCourse"
        })

        //点击保存
        $('.save_btn').click(function(){
            var data={
                nid:$('#nid').val(),
                courseName:$('#course_name').val(),
                courseEname:$('#course_ename').val(),
                courseArea:$('[name="course_area"] option:checked').val()
            }
            $.ajax({
                type:'post',
                url:'<%=basePath%>eduElectiveCourseController/insertSelective',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.flag == true){
                        $.layerMsg({content:"保存成功！",icon:1});
                        $('#nid').val('');
                        $('#course_name').val('');
                        $('#course_ename').val('')
                    }else{
                        $.layerMsg({content:"保存失败！",icon:2});
                    }
                }
            })
        })
    })

    function initArea(element){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:'ELECTIVE_COURSE'},
            dataType:'json',
            success:function(res){
                var datas=res.obj;
                str='';
                if(res.flag == true){
                    for(var i=0;i<datas.length;i++){
                        str+='<option value="'+datas[i].codeNo+'">'+datas[i].codeName+'</option>'
                    }
                    element.append(str);
                }
            }
        })
    }
</script>
</body>
</html>


