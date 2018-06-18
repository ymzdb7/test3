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
    <title>新建选修课发布</title>

    <link rel="stylesheet" type="text/css" href="../../css/edu/addVehicle.css"/>
    <link rel="stylesheet" href="../../lib/laydate/need/laydate.css">
    <script src="<%=basePath%>js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=basePath%>js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <style>
        .title{
            padding-left: 20px;
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
        .nav_t1 img{
            vertical-align: top;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="header">
        <div class="nav_t1" style="padding-left: 15px;padding-top: 10px">
            <img src="../../img/edu/xinjianxuankefabu.png" >
        </div>
        <div class="title">新建选修课发布</div>
    </div>
    <div class="main" style="padding-top: 11px">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 50%;">
            <tr>
                <td>选修课名称：</td>
                <td><input type="text" name="electiveCourse" id="electiveCourse" value="" /></td>
            </tr>
            <tr>
                <td>课程编号：</td>
                <td>
                    <select name="course_area" class="BigSelect">

                    </select>
                    <select name="areaId" class="BigSelect">
                        <option value="">请选择</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>班级名称：</td>
                <td>
                    <textarea name="deptname" id="deptname" disabled></textarea>
                    <a href="javascript:;" id="choseData">选择</a><a href="javascript:;" id="clearDept">清除</a>
                </td>
            </tr>
            <tr>
                <td>学年：</td>
                <td>
                    <select name="schoolYear" class="BigSelect">

                    </select>
                </td>
            </tr>
            <tr>
                <td>学期：</td>
                <td>
                    <select name="term" class="BigSelect">
                        <option value="1">第一学期</option>
                        <option value="2">第二学期</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>每人选课上线：</td>
                <td><input type="text" name="maxClass" id="maxClass" value=""></td>
            </tr>
            <tr>
                <td>选课开始时间：</td>
                <td><input type="text" name="startTime" id="startTime" value="" onclick="laydate(start),laydate({istime: true, format: 'YYYY-MM-DD'})" readonly="readonly"></td>
            </tr>
            <tr>
                <td>选课结束时间：</td>
                <td><input type="text" name="endTime" id="endTime" value="" onclick="laydate(end),laydate({istime: true, format: 'YYYY-MM-DD'})" readonly="readonly"></td>
            </tr>
        </table>
        <div class="div_btn">
            <div class="save_btn"><span>保存</span></div>
            <div class="reset_btn"><span>返回</span></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var dept_id;
    $(function(){
        $('#choseData').click(function(){
            dept_id = 'deptname';
            $.popWindow("../common/selectEduDept");
        });
        initArea($('[name="course_area"]'),'ELECTIVE_COURSE');
        init("01",$('[name="areaId"]'));
        initArea($('[name="schoolYear"]'),'EDU_YEAR_NO');

        $('[name="course_area"]').change(function(){
            var cId=$(this).find('option:checked').val();
            init(cId,$('[name="areaId"]'));
        });

        //点击保存
        $('.save_btn').click(function(){
            var data={
                electiveCourse:$('#electiveCourse').val(),
                nid:$('[name="areaId"] option:checked').val(),
                classIds:$('#deptname').attr('deptid'),
                classNames:$('#deptname').val(),
                year:$('[name="schoolYear"] option:checked').val(),
                term:$('[name="term"] option:checked').val(),
                maxClass:$('#maxClass').val(),
                startTime:$('#startTime').val(),
                endTime:$('#endTime').val()
            }
            var reg = /^\w+$/;
            if(!reg.test(data.maxClass)){
                $.layerMsg({content:"每人选修上线格式为数字！",icon:2});
                return;
            }
            $.ajax({
                type:'post',
                url:'<%=basePath%>eduElectivePublish/insertEduEPublish',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.msg == 'ok'){
                        $.layerMsg({content:"保存成功！",icon:1});
                        $('#electiveCourse').val('');
                        $('#deptname').removeAttr('deptid');
                        $('#deptname').removeAttr('deptno');
                        $('#deptname').val('');
                        $('#maxClass').val('');
                        $('#startTime').val('');
                        $('#endTime').val('');
                    }else{
                        $.layerMsg({content:"保存失败！",icon:2});
                    }
                }
            })
        })

        //    点击返回
        $('.reset_btn').click(function(){
            self.parent.document.getElementById('iframe').src="eduManagement";
        })

        //清除班级
        $('#clearDept').click(function(){
            $('#deptname').removeAttr('deptid');
            $('#deptname').removeAttr('deptno');
            $('#deptname').val('');
        })
    })

    //获取课程编号/获取学年
    function initArea(element,type){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:type},
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
    //获取选修课名称
    function init(id,element) {
        element.find('.clearOp').remove();
        $.ajax({
            type: 'get',
            url: '<%=basePath%>eduElectiveCourseController/selectEduElectiveCourse',
            dataType: 'json',
            data: {courseArea: id},
            success: function (res) {
                var datas = res.obj;
                var str = '';
                if(res.msg == 'ok'){
                    for(var i=0;i<datas.length;i++){
                        str+='<option class="clearOp" value="'+datas[i].courseArea+'">'+datas[i].courseName+'</option>';
                    }
                    element.append(str)
                }
            }
        })
    }

    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var end = {
        format: 'YYYY-MM-DD',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
</script>
</body>
</html>


