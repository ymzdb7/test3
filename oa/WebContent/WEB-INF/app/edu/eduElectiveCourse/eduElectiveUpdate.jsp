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
    <title>编辑选修课发布</title>

    <link rel="stylesheet" type="text/css" href="../../css/edu/addVehicle.css"/>
    <link rel="stylesheet" href="../../lib/laydate/need/laydate.css">
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base.js"></script>
</head>
<body>
<div class="content">
    <div class="header">
        <div class="title">编辑选修课发布</div>
    </div>
    <div class="main">
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
                    <textarea name="deptname" id="deptname"></textarea>
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
                <td><input type="text" name="startTime" id="startTime" value="" onclick="laydate(start)"></td>
            </tr>
            <tr>
                <td>选课结束时间：</td>
                <td><input type="text" name="endTime" id="endTime" value="" onclick="laydate(end)"></td>
            </tr>
        </table>
        <div class="div_btn">
            <div class="save_btn"><span>编辑</span></div>
            <div class="reset_btn"><span>返回</span></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    <%--获取id--%>
    var id=$.GetRequest().id;

//    通过id反显到页面中
    function show(){
        $.ajax({
            url:'/eduElectivePublish/selectEduPublish',
            type:'post',
            data:{id:id},
            dataType:'json',
            success:function(res){
                var data=res.obj;
                $('#electiveCourse').val(data[0].electiveCourse);
                    $('[name="areaId"] option:checked').val(data[0].nid);
                    $('#deptname').val(data[0].classNames);
                    $('.BigSelect option:checked').val(data[0].electiveCourse)
                    $('[name="schoolYear"] option:checked').val(data[0].year);
                    $('[name="term"] option:checked').val(data[0].term);
                    $('#maxClass').val(data[0].maxClass);
                    $('#startTime').val(data[0].startTime);
                    $('#endTime').val(data[0].endTime);
            }
        })
    }
    show();
//    点击返回
    $('.reset_btn').click(function(){
        self.parent.document.getElementById('iframe').src="eduManagement";
    })

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
                id:id,
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
            $.ajax({
                type:'post',
                url:'<%=basePath%>eduElectivePublish/updateEduPublish',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.msg == 'ok'){
                        $.layerMsg({content:"编辑成功！",icon:1});
                        $('#electiveCourse').val('');
                        $('#deptname').removeAttr('deptid');
                        $('#deptname').removeAttr('deptno');
                        $('#deptname').val('');
                        $('#maxClass').val('');
                        $('#startTime').val('');
                        $('#endTime').val('');
                    }else{
                        $.layerMsg({content:"编辑失败！",icon:2});
                    }
                }
            })
        })

        //清除班级
       /* $('#clearDept').click(function(){
            $('#deptname').removeAttr('deptid');
            $('#deptname').removeAttr('deptno');
            $('#deptname').val('');
        })*/
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


