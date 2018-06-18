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
    <title>编辑选修课基础课表</title>
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
        .header img{
            width:24px;
            height:24px;
            vertical-align: middle;
            padding-left:15px;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="header">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png" alt="">
        <div class="title">编辑选修课基础课表</div>
    </div>
    <div class="main"  style="padding-top: 11px">
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
            <div class="save_btn"><span>编辑</span></div>
            <div class="reset_btn"><span>返回</span></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        initArea($('[name="course_area"]'));

        <%--获取id--%>
        var sid=$.GetRequest().id;
        //点击编辑
        $('.save_btn').click(function(){
            var data={
                id:sid,
                nid:$('#nid').val(),
                courseName:$('#course_name').val(),
                courseEname:$('#course_ename').val(),
                courseArea:$('[name="course_area"] option:checked').val()
            }
            $.ajax({
                type:'post',
                url:'<%=basePath%>eduElectiveCourseController/updateByPrimaryKeySelective',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.msg == "ok"){
                        $.layerMsg({content:"编辑成功！",icon:1});
                        $('#nid').val('');
                        $('#course_name').val('');
                        $('#course_ename').val('')
                    }else{
                        $.layerMsg({content:"编辑失败！",icon:2});
                    }
                }
            })
        })
//        点击返回
        $('.reset_btn').click(function(){
            self.parent.document.getElementById('iframe').src="basicCourse"
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

    //    通过id反显到页面中
    function show(){
        <%--获取id--%>
        var sid=$.GetRequest().id;
        $.ajax({
            url:'/eduElectiveCourseController/selectEduElectiveCourse',
            type:'post',
            data:{id:sid},
            dataType:'json',
            success:function(res){
                var data=res.obj;
                    $('#nid').val(data[0].nid);
                    $('#course_name').val(data[0].courseName);
                    $('#course_ename').val(data[0].courseEname);
                    $('[name="course_area"] option:checked').val(data[0].courseArea);
            }
        })
    }
    show();
</script>
</body>
</html>


