<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>课表管理</title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <script type="text/javascript" src="/js/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<style>
    .box{
        width:100%;
    }
    .header{
        width:100%;
        height:43px;
        border-bottom:1px solid #9E9E9E;
    }
    .nav{
        overflow:hidden;
    }
    .nav li{
        height:28px;
        line-height:28px;
        float:left;
        font-size:14px;
        margin-left:20px;
        margin-top:6px;
        cursor:pointer;
    }


    .banji_head{
        line-height:71px;
    }
    .title{
        font-size:22px;
        color:#494d59;
        padding-left:20px;
    }


    table{
        width:95%;
        margin:0 auto;
    }
    tr{
        height:50px;
        line-height:30px;
    }
    td,th{
        border:1px solid #c0c0c0;
        text-align:center;
    }

    th{
        color:#2F5C8F;
    }
    .content li.show{
        display:block;
    }
    .content li{
        display:none;
    }

    .text a{
        text-decoration:none;
        color:#207BD6;
    }

    .all div{
        width:70px;
    }
    .import{
        width:70%;
        margin:0 auto;
    }
    .left{
        font-weight:bold;
        text-align:right;
        valign:middle;
        width:20%;

    }
    .right{
        text-align:left;
    }

    .import a{
        text-decoration: none;
        color:#0066cc;
    }
    #save{
        background: url(../../img/vote/saveBlue.png) no-repeat;
        color: #fff;
        line-height: 30px;
        font-size: 16px;
        width: 91px;
        height: 30px;
        cursor: pointer;
    }


</style>
<body>
<%--导入课表--%>
<li>
    <div class="banji_head">
        <span class="title">新建权限</span>
    </div>
    <form class="form1" name="form1" id="uploadForm" method="post" action="../eduScore/wordEduScoreInsert"
          enctype="multipart/form-data">
        <table class="import">
            <tbody>
            <tr>
                <td colspan="2" style="text-align:left">说明： 在这里设置哪些人可以管理所有人的记录，其他人只能管理自己创建的记录。</td>
            </tr>
            <tr>
                <td class="left" >授权范围（人员）：</td>
                <td class="right">
                    <textarea name="" style="width:300px;height:150px;" disabled></textarea>
                    <a href="javascript:;">添加</a>
                    <a href="javascript:;">清空</a>
                </td>
            </tr>
            <tr>
                <td class="left" colspan="2">
                    <button id="save">保存</button>
                </td>

            </tr>
            </tbody>
        </table>

    </form>
</li>
</body>
<script>
    //成绩模版下载
    $('#importScore').click(function () {
        window.location.href = encodeURI("/file/edu/eduScore/import_edu_score.xls");
    });
    //导入
    $('.importBtn').click(function () {
    });
</script>
</html>