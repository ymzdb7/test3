<%--
  Created by IntelliJ IDEA.
  User: 牛江丽
  Date: 2017/9/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>教育OA系统设置</title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/jquery.cookie.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="<%=basePath%>lib/layer/layer.js"></script>
</head>
<style>
    .headImg {
        display: inline-block;
        float: left;
    }
    .divTitle{
        font-size: 22px;
        color: rgb(73, 77, 89);
        margin-left: 10px;
        margin-right: 20px;
    }
    .editInfo textarea{
        cols:"45";
        rows:"3";
        wrap:"yes";
        readonly:"";
    }
    td{
        color: rgb(64, 64, 96);
        padding: 10px;
        font: 14px 微软雅黑;
    }
    .editInfo tr td {/*表格的边框样式*/
        border-width: 1px;
        border-style: solid;
        border-color: rgb(192, 192, 192);
        border-image: initial;
    }
    table{
        border-collapse: collapse;/*表格边框合并*/
        width: 95%;
    }
    .editInfo tr td:first-child{
        width: 30%;
    }
    .main{
        margin-top: 20px;
    }
    .save_btn{/*保存按钮*/
        background: url(../../img/save.png) no-repeat;
        margin-top: 20px;
        margin-left: 45%;

    }
    .btn_ {
        height: 43px;
        margin-top: 30px;
        margin-bottom: 20px;
        padding-left: 41px;
        padding-top: 7px;
        font-size: 14px;
    }
    #saveBtn{
        cursor: pointer;
    }
    .editInfo input[type='text']{
        height: 32px;
        width: 200px;
    }

    /* .editInfo input[type='password']{
         height: 32px;
         width: 200px;
     }*/

    #add_send{
        width: 66px;
        height: 43px;
        margin-right: 40px;
        margin-top: 0;
        margin-bottom: 20px;
        background: url(../../img/publish.png) no-repeat;
        padding-left: 40px;
        padding-top: 7px;
        cursor: pointer;
        font-size: 14px;
        display: inline-block;
        float: left;
        margin-left: 330px;
    }
</style>
<body style="font-family: 微软雅黑;">
<div class="headTop" style="margin-left: 3%">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png">&nbsp;&nbsp;
    </div>
    <div class="divTitle">
        参数设置
    </div>
</div>
<div class="main" style="margin-left: 3%">
    <div class="mainBody">
        <%-- <input type="publish" id="publish">--%>
        <form id="editParamForm">
            <table class="editInfo">
                <tr>
                    <td align="center" style="width:15%"><span>选项</span></td>
                    <td align="center" style="width:20%"><span>参数</span></td>
                    <td align="center" style="width:60%"><span>备注</span></td>
                </tr>
                <tr>
                    <td style="width:15%;text-align: right;">上学期开学时间：</td>
                    <td style="width:20%"><input id="firstDate1" name="firstDate1" type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                    <td style="width:60%"><span class="firstRemark">暑假结束的开学时间。这个时间是用于判断学期的，需设置准确。</span></td>
                </tr>
                <tr>
                    <td style="width:15%;text-align: right;">下学期开学时间：</td>
                    <td style="width:20%"><input id="secondDate1" name="secondDate1" type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></td>
                    <td style="width:60%"><span>寒假结束的开学时间。这个时间是用于判断学期的，需设置准确</span></td>
                </tr>
                <tr>
                    <td style="width:15%;text-align: right;">初始密码：</td>
                    <td style="width:20%">
                        <input id="initPwd" name="initPwd" type="text">
                    </td>
                    <td style="width:60%"><span>创建学生时，学生家长的初始密码</span></td>
                </tr>
            </table>
        </form>
        <div>
            <div id="saveBtn" value="0" type="save" class="btn_ save_btn">保存</div>
        </div>
    </div>
</div>

<script>
    //时间控件
    var start = {
        format: 'YYYY-MM-DD',
    };

    $(function(){
        $.ajax({
            url: '/eduSchoolCalendar/getYearTerm',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data=obj.object;
                if(obj.flag){
                    if(data.schoolTerm==1){
                        $(".firstRemark").append("当前时间是"+data.schoolYear+"学年  上学期");
                    }else{
                        $(".firstRemark").append("当前时间是"+data.schoolYear+"学年  下学期");
                    }

                }
            }
        })
        $.ajax({
            url: '/syspara/selEduParam',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data=obj.attributes;
                if(obj.flag){
                    $("#firstDate1").val(data.SUMMER_VACATION_END);
                    $("#secondDate1").val(data.WINTER_VACATION_END);
                    $("#initPwd").val(data.EDU_DEFAULT_PASSWORD);
                }
            }
        })
    })



    //保存按钮：editFlag==0 为添加操作，editFlag==1 为修改操作
    $("#saveBtn").click(function () {
        var firstDate=$("#firstDate1").val();
        if(firstDate!=""){
            firstDate=firstDate.substring(5);
        }
        var secondDate=$("#secondDate1").val();
        if(secondDate!=""){
            secondDate=secondDate.substring(5);
        }
        $('#editParamForm').ajaxSubmit({
            url:"/syspara/eduSetParam",
            type:'post',
            dataType:'json',
            data:{
                firstDate:firstDate,
                secondDate:secondDate
            },
            success:function (json) {
                if(json.flag) {
                    $.layerMsg({content: '保存成功！', icon: 1}, function () {
                    });
                }else{
                    $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                    });
                }
            }
        })
    })

</script>
</body>
</html>
