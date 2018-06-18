<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String notifyId = request.getParameter("notifyId");
%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>公告详情</title>
    <script type="text/javascript" src="../../js/jquery/jquery.min.js"></script>
    <link href="../../css/H5/default.css" rel="stylesheet"/>
    <style>
        header {
            background-color: #5077aa;
            height: 0.85rem;
            display: flex;
            align-items: center;
            justify-content: space-between;
            font-size: 0.32rem;
            color: #fff;
            padding-left: 0.23rem;
            padding-right: 0.23rem;
            position: fixed;
            width: 100%;
            z-index: 1;
        }
        .fs14{
            font-size: 0.33rem;
            color: #646464;
        }
        .cont{
            margin: 0 .4rem;
            margin-top: .32rem;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }
        .cons{
            margin: 0 .4rem;
            border-bottom: 1px solid #5a8fd5;
            color: #c6c6c6;
            font-size: .32rem;
            line-height: 1rem;
        }
        .conts{
            margin: 0 .4rem;
            margin-top: .32rem;
            padding-bottom:  .32rem;
            font-size: .34rem;
            overflow: hidden;
        }
        .enclosure{
            height: .7rem;
            background: #eeeeee;
            line-height: .7rem;
            text-indent: 1em;
        }
        .hd{
            height: 0.85rem;
        }

    </style>
</head>
<body>
<header>
    <i><a href="/dingdingMicroApp/noticeh5" style="color: #fff">返回</a></i>
    <span>公告详情</span>
    <i style="width: .4rem"></i>
</header>
<div class="hd"></div>
<div class="content">
</div>
</body>
<script>
    var fs = document.documentElement.clientWidth / 750  * 100;
    document.querySelector("html").style.fontSize = fs + "px";
    var notifyId = <%=notifyId%>;
    $(function(){
        $.ajax({
            url:'/notice/getOneById',
            type:'get',
            data:{
                notifyId:notifyId
            },
            dataType:'json',
            success:function(res){
                if(res.flag){
                    var app='<div>'+
                                '<h2 class="cont" style="width: 85%;">'+res.object.subject+'</h2>'+
                                '<div class="cont">'+
                                    '<span class="fs14" style="margin-right:34px ;">发布人：'+res.object.name+'</span>'+
                                    '<span class="fs14">类型：<a href="javascript:;" style="color: #5087d0">'+function(){if(res.object.typeName==''){return '所有类型'}else{return  res.object.typeName}}()+'</a></span>'+
                                '</div>'+
                                '<div class="cons">'+res.object.auditDate+'</div>'+
                             '</div>'+
                             '<div class="conts" style="line-height: .6rem">'+res.object.content+'</div>'+
                             '<div>'+
                                '<p class="enclosure">附件</p>'+
                                '<div class="conts">' +
                                    ''+function(){if(res.object.attachmentName==''){return '暂无附件'}else{return  '<span style="width: 4.6rem;display: inline-block;line-height: .65rem;">'+res.object.attachmentName+'</span><a style="margin-left: .8rem;color: #5087d0;" href="/download" atm='+res.object.attachmentId+'>下载</a>' }}()+''
                                ' </div>'+
                            '</div>'
                    $('.content').html(app)
                }

            }
        })
    })
</script>
</html>