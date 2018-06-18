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
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="hr.th.TrialExpirationQuery" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
    <style>
        body{
            font-family: 微软雅黑;
            font-size: 15px;
        }
        .big3{
            margin-left: 12px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
        }
        .msg{
            background-color: #fff;
            font-size: 15px !important;
            color: #2F5C8F !important;
            font-weight: bold !important;
            width:6% !important;
        }
        .TableHeader{
            COLOR: #2E2E5A;
        }
        .MessageBox{
            border-collapse: collapse;
            border-spacing: 0;
            table-layout: fixed;
        }
        table.MessageBox thead {
            background: white;
            line-height: 40px;
            border-bottom: 1px #dddddd solid;
            font-size: 15px;
            color: #2F5C8F;
            border: 0px;
        }
        .find_detail {
            cursor: pointer;
        }
        a{
            text-decoration: none;
        }
        table.MessageBox th,table.MessageBox td{
            text-align: left;
            padding: 10px;
        }

        table.MessageBox  tr {
            border: 1px solid #c0c0c0;
        }
        .msg  td{
            background-color: rgb(255, 255, 255);;
        }
        table.MessageBox tbody tr:nth-child(odd) {
            /*   background-color: #F6F7F9;*/
        }
        table.MessageBox  tr td a{
            font-size: 14px;
            color: #2b7fe0;
        }
        .MessageBox tr td{
            border-top:1px solid #c0c0c0;
        }
        .SmallButton{
            display: inline-block;
            float:left;
            width: 70px;
            height: 28px;
            line-height: 28px;
            background: url("../../img/hr/icon_query_2 .png") no-repeat;
            cursor: pointer;
        }

    </style>
</head>
<script>

    $(function(){
        //查阅情况
        $('.MessageBox').on('click', '.find_detail', function () {
            var notifyId = $(this).attr('notifyId');
            $.popWindow("contractDetail?contractId=" + notifyId, '<fmt:message code="news.th.querysituation" />', '0', '0', '1150px', '700px');

        })
    })


    $.ajax({
        type:"get",
        url:"../../hr/contract/getTrialContract",
        dataType:'json',
        data:{status:1
        },
        success:function(data) {
            if (data.obj != undefined) {
                if (data.obj.length > 0) {
                    var result = data.obj;
                    var str="<tr class=\"msg\"><td><fmt:message code="userDetails.th.name" /></td><td><fmt:message code="hr.th.department" /></td><td><fmt:message code="hr.th.post" /></td><td><fmt:message code="hr.th.TrialDate" /></td><td><fmt:message code="notice.th.operation" /></td><tr>";
                    for (var i = 0; i < result.length; i++) {
                        if (result[i].trailOverTime != null && result[i].trailOverTime != '') {
                            var d = new Date(result[i].trailOverTime);
                        } else {
                            var d = '';
                        }
                        str +="<tr><td>" + result[i].userName + "</td><td>" + data.obj[i].deptName + "</td><td>" + data.obj[i].postName + "</td><td>" + formatDate(d) + "</td><td><a href='javascript:;' class='find_detail' notifyId=" + data.obj[i].contractId + " style='color:#1772c0;'><fmt:message code="hr.th.detailedInformation" /></a></td></tr>";
                        $(".MessageBox").html(str);
                    }
                }
                else {
                    var str="<tr class=\"msg\"><td><fmt:message code="userDetails.th.name" /></td><td><fmt:message code="hr.th.department" /></td><td><fmt:message code="hr.th.post" /></td><td><fmt:message code="hr.th.TrialDate" /></td><td><fmt:message code="notice.th.operation" /></td><tr>";
                    $(".MessageBox").html(str);
                    layer.msg('<fmt:message code="hr.th.NoMonth" />', {icon: 6});
                }
            }
        }
    });





    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false
        /*  choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas //将结束日的初始值设定为开始日
         }*/
    };
    function laydates(e){

        var id = e.attr('id');
        laydate({
            elem: '#'+id, //目标元素。
            format: 'YYYY-MM-DD', //日期格式
            istime: true //显示时、分、秒
        })
    }
    function   formatDate(now)   {
        if(now!=''&& now!=undefined){
            var   year=now.getFullYear();
            var   month=now.getMonth()+1;
            var   date=now.getDate();
            var   hour=now.getHours();
            var   minute=now.getMinutes();
            var   second=now.getSeconds();
            return  year+"-"+month+"-"+date;
        }
        else{
            return "";
        }
    }

    function CheckForm()
    {
        if($("#start").val()=="" || $("#end").val()=="")
        {
            layer.msg('<fmt:message code="hr.th.PleaseRange" />', {icon: 2});
            return (false);
        }
        else{
            if(($("#start").val())>$("#end").val()){
                layer.msg('<fmt:message code="hr.th.TheEnd" />', {icon: 2});
                return (false);
            }
            var startTime =$("#start").val();
            var endTime =$("#end").val();
            var str="<tr class=\"msg\"><td><fmt:message code="userDetails.th.name" /></td><td><fmt:message code="hr.th.department" /></td><td><fmt:message code="hr.th.post" /></td><td><fmt:message code="hr.th.TrialDate" /></td><td><fmt:message code="notice.th.operation" /></td><tr>";
            data={"startTime":startTime,
                "endTime":endTime,
                "status":"2"
            }
            $.ajax({
                type:"get",
                url:"../../hr/contract/getTrialContract",
                dataType:'json',
                data:data,
                success:function(data){
                    if(data.obj!=''){
                        var result =data.obj;
                        for(var i=0;i<result.length;i++){
                            if(result[i].trailOverTime!=null && result[i].trailOverTime!=''){
                                var d= new Date(result[i].trailOverTime);
                            }else{
                                var d='';
                            }
                            str=str+"<tr><td>"+result[i].userName+"</td><td>"+data.obj[i].deptName+"</td><td>"+data.obj[i].postName+"</td><td>"+formatDate(d)+"</td><td><a href='javascript:;' class='find_detail' notifyId=" + data.obj[i].contractId + " style='color:#1772c0;'><fmt:message code="hr.th.detailedInformation" /></a></td></tr>";
                            $(".MessageBox").html(str);
                        }
                    }
                    else{
                        $(".MessageBox").html(str);
                        layer.msg('<fmt:message code="hr.th.NoEligible" />', {icon: 6});
                    }
                }
            });
        }

    }
</script>


<body class="bodycolor" topmargin="5" style="margin: 0;padding:0 30px;">
<div class="left">
    <div class="news" style="margin:20px 7px;">
        <div style="float:left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/infoend.png" align="absmiddle" style="margin-bottom: 3px;"><span class="big3"><fmt:message code="hr.th.TrialResults" /></span>&nbsp;
            <input type="text" id="start" name="QUERY_DATE1" class="laydate-icon" onClick="laydates($(this))"/>
            ~  <input type="text" id="end" name="QUERY_DATE2" class="laydate-icon" onClick="laydates($(this))" />
            <input type="hidden" name="inform" value="1"/>
        </div>
        <%--<input type="button" value="确定" class="SmallButton" onClick="CheckForm();">&nbsp;&nbsp;--%>
        <div class="SmallButton" onClick="CheckForm();" style="margin-left: 20px"><span style="margin-left: 30px;font-size: 14px;"><fmt:message code="global.lang.query" /></span></div>
    </div>
</div>
<form method="post" name="form1" action="#">
    <table border="0" width="100%" cellpadding="0" cellspacing="0" align="center" bgcolor="#000000" style="margin: 0px 0;">
    </table>
</form>
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td class="TableHeader">

        </td>
        </td>
    </tr>
</table>
<table class="MessageBox" align="center" width="100%" cellpadding="0" cellspacing="0" style="border:1px solid #c0c0c0">
    <tr class="msg">
        <td class="center info">
            <div class="msg-content" style="text-align: center;"><fmt:message code="hr.th.NoMonth" /></div>
        </td>
    </tr>
</table>
</body>
</html>



