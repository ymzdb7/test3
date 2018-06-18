<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <title>新建培训记录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">

    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>


    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>

    <style>

        body{
            font-size: 15px;
            font-family: 微软雅黑;
        }
       .tab{
           width: 80%;
           margin:0 auto;
       }
      .tab td{
           border:1px solid #c0c0c0;
       }
        .trainInst{
            width:200px;
        }
        .cost{
            width:200px;
        }
        a{
            text-decoration:none;
            color:#207BD6;
            padding:0px 5px;
        }
        button{
            width:50px;
            height:28px;
            border-radius: 5px;
            color:#fff;
            background-color:#2F8AE3;

        }
        .big3{
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
            font-weight: inherit;
        }
        .plan{
            width:150px;
        }
        .txt{
            width:350px;
        }
        .save{
            margin:0 auto;
            display:block;
        }
         .save {
            text-align: center;
            cursor: pointer;
        }
        .div_1{
            margin-left: 20px;
        }

    </style>
</head>


<script type="text/javascript">

</script>

<body class="bodycolor" topmargin="5">
<table border="0" width="100%" style="border: none; border-collapse: inherit;" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td>
            <div class="div_1">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle"><span class="big3"><fmt:message code="event.th.NewTrainingRecord" /></span>&nbsp;&nbsp;
            </div>
        </td>
    </tr>
</table>

    <table class="tab">
        <tr>
            <td><span style="color: red;margin-right: 5px;">*</span><fmt:message code="event.th.NameTrainingPlan" />：</td>
            <td colspan="3">
                <select name="" class="plan" id="plan"></select>
            </td>
        </tr>
        <tr>
            <td><fmt:message code="event.th.trainee" />：</td>
            <td colspan="3">
                <textarea name="" class="txt" id="usersInput" wrap="yes" disabled></textarea>
                <a href="javascript:;" id="add"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="del"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td><fmt:message code="event.th.TrainingInstitution" />：</td>
            <td>
                <input type="text" class="trainInst">
            </td>
            <td><fmt:message code="event.th.TrainingCost" />：</td>
            <td><input type="text" class="cost" onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" onblur="this.v();"></td>
        </tr>
    <%--    <tr>
            <td><fmt:message code="email.th.filechose" />：</td>
            <td colspan="3">
                <a href="javascript:;"><fmt:message code="email.th.addfile" /></a>
            </td>
        </tr>--%>
        <tr>
            <td colspan="4">
                <button class="save"><fmt:message code="global.lang.save" /></button>
            </td>
        </tr>
    </table>
<br>
<script type="text/javascript">
    var user_id;

    $(function () {


        //下拉框获取
        $.ajax({
            type:'post',
            url:'<%=basePath%>eduTrainPlan/getAllPlanTrue',
            dataType:'json',
            success:function(result){
                var data =result.obj;
                var str="<option value=''><fmt:message code="hr.th.PleaseSelect" /></option>";
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        str=str+ '<option value="' + data[i].planNo + '">' + data[i].planName + '</option>'
                    }
                }
                $('.plan').html(str);
            }
        })



        //培训人员
        $('#add').click(function(){
            user_id="usersInput";
            $.popWindow("../../common/selectUser");
        });
        // 清空
        $('#del').click(function(){
            $('#usersInput').attr("dataid","");
            $('#usersInput').attr("user_id","");
            $('#usersInput').val("");
        });

        //点击新建保存
        $('.save').click(function(){
            var data={
                tPlanNo:$('.plan').val(),
                tPlanName:$('#plan').find("option:selected").text(),
                staffUserId: $('#usersInput').attr("user_id"),
                tInstitutionName:$('.trainInst').val(),
                trainningCost:$('.cost').val()
            }
            if($('.plan').val()==''){
                layer.msg('<fmt:message code="event.th.SelectTrainingPlan" />',{icon:2});
            }else{
                $.ajax({
                    type:'post',
                    url:'<%=basePath%>record/save',
                    data:data,
                    dataType:'json',
                    success:function(result){
                        if (result.flag == true) {
                            layer.msg('<fmt:message code="url.th.addSuccess" />',{icon:1});
                            window.location.href='<%=basePath%>/record/trainRecordMange';

                        } else {
                            layer.msg('<fmt:message code="hr.th.AddFailed" />',{icon:2});
                        }
                    }
                })
            }
        })

    });
</script>
</body>
</html>

