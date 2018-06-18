<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <title><fmt:message code="document.th.nextStep" /></title>
    <link rel="stylesheet" href="../../css/workflow/work/m/style.css">
    <script src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../js/template.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/mustache.min.js"></script>
    <script src="../../js/base/base.js"></script>
    <style>
        @font-face {
            font-family: PingFangSC-Regular, sans-serif; /*这里是说明调用来的字体名字*/
            src: url('/css/base/pingf.ttf'); /*这里是字体文件路径*/
        }
        body{
            font-size: 12px;
            font-family: PingFangSC-Regular, sans-serif!important; /*这里是说明调用来的字体名字*/
        }
        .imgbox{
            width: 150px;
            height: 150px;
            margin: 0px auto;
            margin-top: 120px;
            margin-bottom: 10px;
        }
        .pclass span{
            color: #999;
            height: 30px;
            display: inline-block;
            line-height: 30px;
            font-size: 15px;
            text-align: center;
            width: 100%;
        }
        .pclass .zj{
            color: #333;
            font-size: 20px;
        }
    </style>
</head>
<body>
    <div class="imgbox">
        <img src="/img/workflow/work/workformh5/beijingtu.png" alt="">
    </div>
    <div class="pclass">
        <span class="zj">转交成功</span>
        <span>2秒后跳转</span>
    </div>
<script>
    if (/(iPhone|iPad|iPod|iOS|Mac OS X)/i.test(navigator.userAgent)) {
        //rightTitle(' ','end',' ');
    } else if (/(Android)/i.test(navigator.userAgent)) {
        Android.rightTitle(' ','end',' ');
    }
    $(function(){
        setTimeout(function(){
            if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                finishWork();
            } else if (/(Android)/i.test(navigator.userAgent)) {
                Android.finishWebActivity();
            }
        },2000)
    })
</script>
</body>
</html>