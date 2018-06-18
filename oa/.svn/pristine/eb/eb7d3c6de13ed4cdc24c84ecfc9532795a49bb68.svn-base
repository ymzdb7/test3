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
    <title>选修课详情</title>
    <link rel="stylesheet" type="text/css" href="../../css/edu/addVehicle.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <style>
            .title{
                padding-left:15px;
            }
        table tr td:first-child{
            font-weight:bold;
        }
        input[type='text']{
            height:30px;
            width:280px;

        }
    </style>
</head>
<body>
<div class="content">
    <div class="header">
        <div class="title">选修课详情</div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 90%;">
            <tr>
                <input type="hidden" name="nid" id="nid">
                <td style="font-weight:bold">课程名称：</td>
                <td><input type="text" name="electiveCourse" id="electiveCourse"value=""></td>
            </tr>
            <tr>
                <td>上课地点：</td>
                <td><input type="text" name="place" id="place" value=""></td>
            </tr>
            <tr>
                <td>上课时间：</td>
                <td>
                    <select name="xingqi" id="xingqi">
                        <option value="1">周一</option>
                        <option value="2">周二</option>
                        <option value="3">周三</option>
                        <option value="4">周四</option>
                        <option value="5">周五</option>
                        <option value="6">周六</option>
                        <option value="7">周七</option>
                    </select>
                    <input type="text" name="timeClass" id="timeClass" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"readonly="readonly">
                    <span>至</span>
                    <input type="text" name="classOver" id="classOver" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" readonly="readonly">
                </td>
            </tr>
            <tr>
                <td>学分：</td>
                <td><input type="text" name="score"  id="score"value=""></td>
            </tr>
            <tr>
                <td>学时：</td>
                <td><input type="text" name="classHour" id="classHour"value=""></td>
            </tr>
            <tr>
                <td>考试方式：</td>
                <td>
                    <select name="examType" id="examType">
                        <option value="1">考试</option>
                        <option value="2">考察</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>咨询老师：</td>
                <td><input type="text" name="counselingTeachers" id="counselingTeachers"value=""></td>
            </tr>
            <tr>
                <td>讲师（内部）：</td>
                <td>
                    <textarea name="teacherUserId" id="teacherUserId" placeholder="请输入真实姓名..." style="min-height:24px;"></textarea>
                    <%--<a href="javascript:;" id="add">选择</a>--%>
                    <%--<a href="javascript:;" id="clear">清除</a>--%>
                </td>
            </tr>
            <tr>
                <td>讲师（外部）：</td>
                <td><textarea name="teacherout" id="teacherout" placeholder="请输入真实姓名..." style="min-height:24px;"></textarea></td>
            </tr>
            <tr>
                <td>学费：</td>
                <td><input type="text" name="tuition" id="tuition" value=""></td>


            </tr>
            <tr>
                <td>材料费：</td>
                <td><input type="text" name="materialCost" id="materialCost" value=""></td>
            </tr>
            <tr>
                <td>
                    <span>满人数：</span>
                </td>
                <td>
                    <input type="text" name="maxpeople" id="maxpeople" value="">
                </td>
            </tr>
            <tr>
                <td>
                    <span>开课人数：</span>
                </td>
                <td>
                    <input type="text" name="minpeople" id="minpeople" value="">
                </td>
            </tr>
            <tr>
                <td>课程内容：</td>
                <td colspan="5">
                    <textarea name="courseContent" id="courseContent"  cols="60" rows="6"></textarea>
                </td>
            </tr>
            <tr>
                <td>特点和意义：</td>
                <td colspan="5">
                    <textarea name="meaningCharacteristics" id="meaningCharacteristics" cols="60" rows="6"></textarea>
                </td>
            </tr>
            <tr>
                <td>备注：</td>
                <td colspan="5">
                    <textarea name="remarks" id="remarks" cols="60" rows="6"></textarea>
                </td>
            </tr>
        </table>
        <div class="div_btn">
            <div class="save_btn"><span>保存</span></div>
            <div class="reset_btn"><span>关闭</span></div>
        </div>
    </div>
</div>
<script>
        $(function(){

//            点击关闭
            $('.reset_btn').click(function(){
                window.close();
            })

            <%--获取id--%>
            var sid=$.GetRequest().dataId;
            var nId=$.GetRequest().nId;

//            var user_id='';
//            $(function(){
//                var dataId=$.getQueryString('dataId');
//                $('#add').click(function(){
//                    user_id='teacherUserId';
//                    $.popWindow("../common/selectEduUser");
//                })
//            })
            //    通过id反显到页面中
            function show(){
                var electiveCourse=$.GetRequest().electiveCourset;
                var courseName=$.GetRequest().courseName;
                $.ajax({
                    url:'/eduElectiveDetail/eduSelectOneDetail',
                    type:'post',
                    data:{tid:sid},
                    dataType:'json',
                    success:function(res){
                        var data=res.object;
                         $('#electiveCourse').val(electiveCourse);
                        if(data){
                            var str=data.classTime;
//                $("#nid").val(data.nid);
                            if (str != null && str != '') {
                                var arr = str.split('|');
                                $("#xingqi").val(arr[0]);
                                $("#timeClass").val(arr[1]);
                            }

                            //$("#xingqi").text(arr[0]);
                            $('#electiveCourse').val(electiveCourse);
                            $('#place').val(data.place);
                            $('#classOver').val(data.classOver);
                            $('#score').val(data.score);
                            $('#classHour').val(data.classHour);
                            $('#examType').val(data.examType);
                            $('#counselingTeachers').val(data.counselingTeachers);
                            $('#teacherinName').val(data.teacherinName); <!--讲师内部teacherinId-->
                            $('#teacherUserId').attr('user_id',data.teacherinId);
                            $('#teacherout').val(data.teacherout);
                            $('#tuition').val(data.tuition);
                            $('#materialCost').val(data.materialCost);
                            $('#maxpeople').val(data.maxpeople);
                            $('#minpeople').val(data.minpeople);
                            $('#courseContent').val(data.courseContent);
                            $('#meaningCharacteristics').val(data.meaningCharacteristics);
                            $('#remarks').val(data.remarks);
                        }

                    }
                })
            }
            show();



            var courseName=$.GetRequest().data_courseName;
            //点击保存
            $('.save_btn').click(function(){
                var data={
                    sid:sid,
                    nid:nId,
                    electiveCourse:$('#electiveCourse').val(),
                    place:$('#place').val(),
                    classOver:$('#classOver').val(),
                    score:$('#score').val(),
                    classHour:$('#classHour').val(),
                    examType:$('#examType option:checked').val(),
                    counselingTeachers:$('#counselingTeachers').val(),
                    teacherinName:$('#teacherUserId').attr('user_id'), //使用插件
                    teacherout:$('#teacherout').val(),
                    tuition:$('#tuition').val(),
                    materialCost:$('#materialCost').val(),
                    maxpeople:$('#maxpeople').val(),
                    minpeople:$('#minpeople').val(),
                    courseContent:$('#courseContent').val(),
                    meaningCharacteristics:$('#meaningCharacteristics').val(),
                    remarks:$('#remarks').val(),
                    classTime:$("#xingqi option:checked").val()+"|"+$("#timeClass").val()
                }
                $.ajax({
                    type:'post',
                    url:'<%=basePath%>eduElectiveDetail/eduUpdateDetail',
                    dataType:'json',
                    data:data,
                    success:function(res){
                        if(res.flag == true){
                            $.layerMsg({content:"保存成功！",icon:1});
                            $("nid").val('');
                            $("#xingqi").val('1');
                            $("#timeClass").val('');
                            $('#electiveCourse').val('');
                            $('#place').val('');
                            $('#classOver').val('');
                            $('#score').val('');
                            $('#classHour').val('');
                            $('#examType').val('1');
                            $('#counselingTeachers').val('');
                            $('#teacherinName').val(''); <!--讲师内部-->
                            $('#teacherout').val('');
                            $('#tuition').val('');
                            $('#materialCost').val('');
                            $('#maxpeople').val('');
                            $('#courseContent').val('');
                            $('#meaningCharacteristics').val('');
                            $('#remarks').val('');
                            $('sid').val('');
                        }else{
                            $.layerMsg({content:"保存失败！",icon:2});
                        }
                    }
                })
            })
        })
    //调用考试方式接口
    function initArea(element){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:'ELECTIVE_EXAM_TYPE'},
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


