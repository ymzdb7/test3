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
    <title>选修课总览</title>
    <style>
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:0px;
        }
        .title{
            margin-bottom:-6px;
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
        #courseName,#session{
            width:80px;
        }
        #chooseName{
            width:150px;
        }
        #nianJi,#banJi{
            width:100px;
        }
        .box{
            margin-bottom:10px;
        }
        #choose{
            width:100px;
            height:22px;
            margin-left:5px;
        }
        #see,#outport{
            width: 71px;
            height: 30px;
            border-radius: 5px;
            color: #222222;
            padding-left:10px;
            background-color: #f5f5f5;
        }
        span{
            color:#333;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <img src="../../img/edu/all.png" alt="">
        <span >选修课总览</span>
    </div>
    <div class="box">
        <label class="name">选修课程:</label>
        <select  id="chooseName">
            <option value="0">请选择</option>
        </select>
        <label >课程名称:</label>
        <select  id="courseName">
            <option value="0">请选择</option>
        </select>
        <label>年级:</label>
        <select  class="grade">
            <option value="0">请选择</option>
        </select>
        <label>班级:</label>
        <select  class="ban">
            <option value="0">所有</option>
        </select>
        <label >学期:</label>
        <select  id="session">
            <option value="1">第一学期</option>
            <option value="2">第二学期</option>
        </select>
        <%--<input type="text" id="choose">--%>
        <button id="see" class="submit float">查看</button>
        <%--<button id="outport">导出</button>--%>
        <span >学费总计：<span class="xuefei"></span>元</span>
        <span style="padding-left:10px">材料费总计:<span class="cailiaofei"></span>元</span>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th>学期</th>
                <th>课程</th>
                <th>班级</th>
                <th>姓名</th>
                <th>上课时间</th>
                <th>上课地点</th>
                <th>学分</th>
                <th>学时</th>
                <th>考试方式</th>
                <th>咨询教师</th>
                <th>学费</th>
                <th>材料费</th>
                <th>满课人员</th>
                <th>开课人员</th>
                <th>上课老师</th>
                <th>备注</th>
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
        //    获取课程名称下拉框数据
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
                    $('#courseName').append(str);
                }
            })
        }
        getSelect();

//        获取班级年级下拉框列表


//        统计总览列表显示
        function show(data){
            $.ajax({
                url:'/eduElectiveStudentCount/eduElecctiveStudentCountSum',
                type:'get',
                data:data,
                dataType:'json',
                success:function(reg){
                    var datas=reg.object;
                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+='<tr id="'+datas[i].ID+'"> ' +
                                '<td>'+function(){
                            if(datas[i].term==1){
                                return "第一学期"
                            }else{
                                return "第二学期"
                            }
                        }()+'</td> ' +
                                '<td>'+datas[i].elective_course+'</td> ' +
                                '<td>'+datas[i].class_names+'</td> ' +
                                '<td>'+datas[i].student_name+'</td> ' +
                                '<td>'+datas[i].class_time.split('|')[1]+'</td> ' +
                                '<td>'+datas[i].class_over+'</td> ' +
                                '<td>'+datas[i].score+'</td> ' +
                                '<td>'+datas[i].class_hour+'</td> ' +
                                '<td>'+datas[i].exam_type+'</td> ' +
                                '<td>'+function(){
                                if(datas[i].teacherin_name==undefined){
                                    return ""
                                }else{
                                    return datas[i].teacherin_name;
                                }
                            }()+'</td> ' +
                                '<td class="schoolFee">'+datas[i].tuition+'</td> ' +
                                '<td class="caiLiao">'+datas[i].material_cost+'</td> ' +
                                '<td>'+datas[i].maxpeople+'</td> ' +
                                '<td>'+datas[i].minpeople+'</td> ' +
                                '<td>'+function(){
                                    if(datas[i].teacherin_name==undefined){
                                        return ""
                                    }else{
                                        return datas[i].teacherin_name  ;
                                    }
                            }()+'</td> ' +
                                '<td>'+datas[i].remarks+'</td> ' +
                                '<td> ' +
                                    '<a href="javascript:;" class="details" id="'+datas[i].ID+'" style="color:#1772c0">详细</a> ' +
                                '</td> ' +
                            '</tr>'
                    }
                    $('.list').html(str);
//                    获取总学费

                    var num=0;
                    $('.schoolFee').each(function(){
                        var that=$(this);
                        num+=parseInt(that.text());
                    })
                    $('.xuefei').html(num);
//                    获取总材料费
                    var num1=0;
                    $('.caiLiao').each(function(){
                        var that=$(this);
                        num1+= Number(that.text());
                    })
                    $('.cailiaofei').html(num1);

                }
            })
        }
        show();

//        点击查看按钮
        $('#see').click(function(){
            var nianji=$('.grade option:checked').text();
            var banji=$('.ban option:checked').text();
            var data={
                className:nianji+banji, //班级年级
                sid:$('#chooseName option:selected').val(), //选修课id
                courseName:$('#courseName option:selected').text(), //课程名称
                term:$('#session option:selected').val(), //学期
            }
            $.ajax({
                url:'/eduElectiveStudentCount/eduElecctiveStudentCountSum',
                type:'get',
                data:data,
                dataType:'json',
                success:function(reg){
                    var datas=reg.object;
                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+='<tr id="'+datas[i].ID+'"> ' +
                            '<td>'+function(){
                            if(datas[i].term==1){
                                return "第一学期"
                            }else{
                                return "第二学期"
                            }
                        }()+'</td> ' +
                            '<td>'+datas[i].elective_course+'</td> ' +
                            '<td>'+datas[i].class_names+'</td> ' +
                            '<td>'+datas[i].student_name+'</td> ' +
                            '<td>'+datas[i].class_time.split('|')[1]+'</td> ' +
                            '<td>'+datas[i].class_over+'</td> ' +
                            '<td>'+datas[i].score+'</td> ' +
                            '<td>'+datas[i].class_hour+'</td> ' +
                            '<td>'+datas[i].exam_type+'</td> ' +
                            '<td>'+function(){
                                if(datas[i].teacherin_name=="undefined"){
                                    return ""
                                }else{
                                    return datas[i].teacherin_name;
                                }
                            }()+'</td> ' +
                            '<td class="schoolFee">'+datas[i].tuition+'</td> ' +
                            '<td class="caiLiao">'+datas[i].material_cost+'</td> ' +
                            '<td>'+datas[i].maxpeople+'</td> ' +
                            '<td>'+datas[i].minpeople+'</td> ' +
                            '<td>'+function(){
                                if(datas[i].teacherin_name==undefined){
                                    return ""
                                }else{
                                    return datas[i].teacherin_name;
                                }
                            }()+'</td> ' +
                            '<td>'+datas[i].remarks+'</td> ' +
                            '<td> ' +
                            '<a href="javascript:;" class="details" id="'+datas[i].id1+'" style="color:#1772c0">详细</a> ' +
                            '</td> ' +
                            '</tr>'
                    }
                    $('.list').html(str);
//                    获取总学费
                    var allFee=0;
                    $('.schoolFee').each(function(){
                        var that=$(this);
                        allFee += Number(that.text());
                    })
                    $('.xuefei').html(allFee);
//                    获取总材料费
                    var allCost=0;
                    $('.caiLiao').each(function(){
                        var that=$(this);
                        allCost+= Number(that.text());
                    })
                    $('.cailiaofei').html(allCost);

                }
            })
        })

        //        详细信息
        $('.list').on('click','.details',function(){
            var sid=$(this).attr('id');
            window.open("/eduElectiveStudentCount/courseDetails?sid="+sid,"_blank","top=100,left=300,width=700,height=500,menubar=yes,scrollbars=no,toolbar=yes,status=yes");
        })
    })
    //    获取年级和班级
    function getGrade(){
        $.ajax({
            url:'/eduDepartment/queryGetObj',
            type:'get',
            dataType:'json',
            success:function(reg){
                var datas=reg.obj;
                var str=""
                for(var i=0;i<datas.length-2;i++){
                    str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                }
                $('.grade').append(str);
                $('.grade').change(function(){
                    var sId=$(this).val();
                    $.ajax({
                        url:'/eduDepartment/queryListByDeptId',
                        type:'get',
                        data:{deptId:sId},
                        dataType:'json',
                        success:function(reg){
                            var datas=reg.obj;
                            var str="";
                            $('.ban').html('<option value="" selected="true">请选择</option>');
                            for(var i=0;i<datas.length;i++){
                                str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                            }
                            $('.ban').append(str);
                        }
                    })
                })
            }
        })
    }
    getGrade();
</script>
</body>
</html>
