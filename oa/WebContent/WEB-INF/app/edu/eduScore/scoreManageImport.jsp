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
    .space{
        width:2px;
        margin-left:16px;
    }
    .pad{
        padding:3px 10px;
        line-height:28px;
    }
    .select{
        background-color:#2F8AE3;
        color:#fff;
        border-radius:20px;
        -webkit-border-radius:20px;
        -moz-border-radius:20px;
        -o-border-radius:20px;;
        -ms-border-radius:20px;
    }
    .banji_head{
        line-height:71px;
    }
    .title{
        font-size:22px;
        color:#494d59;
        padding-left:20px;
    }
    .dan{
        float:right;
        margin-right:20px;
    }
    #btn{
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
    }
    #see{
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
    }
    #see2{
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
    }
    #see3{
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
    }
    #see4{
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
    }
    #see5{
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
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
    .center{
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
    .ipt{
        width:120px;
        height:28px;
    }
    .text a{
        text-decoration:none;
        color:#207BD6;
    }
    #add{
        padding-left:12px;
    }
    #del{
        padding-left:4px;
        padding-right:10px;
        color:#9AA9B8;
    }
    #del:hover{
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
    #file{
        width:200px;
    }
    .import a{
        text-decoration: none;
        color:#0066cc;
    }
    #importBtn{
        width: 70px;
        height: 28px;
        font-size: 13px !important;
        cursor: pointer;
        background-repeat: no-repeat;
        background-image: url(../../img/sys/confirm.png);
        padding-left: 25px;
    }
</style>
<body>
<%--导入课表--%>
<li>
    <div class="banji_head">
        <span class="title">课表导入:</span>
    </div>
    <form class="form1" name="form1" id="uploadForm" method="post" action="../eduScore/wordEduScoreInsert"
          enctype="multipart/form-data">
        <table class="import">
            <tbody>
            <tr>
                <td class="left">下载导入模板:</td>
                <td class="right"><a id="importScore">成绩管理导入模板下载</a></td>
            </tr>
            <tr>
                <td class="left" >选择导入文件:</td>
                <td class="right"><input type="file" id="file" name="file"></td>
            </tr>
            <tr>
                <td class="left">说明:</td>
                <td class="right">
                   <span>
                        1、请导入.xls文件。<br>
                        2、导入文件中，学号，姓名不能为空，且必须正确对应。<br>
                        3、导入文件中，年级、班级应为类似“一年级”、“一班” 等实际存在的班级名称。<br>
                        4、导入文件中，学年、学期应为类似“2013-2014”、“上学期” 的形式。<br>
                        5、导入文件中，科目应为<select><option value="语文">语文</option><option value="数学">数学</option><option value="英语">英语</option><option value="物理">物理</option><option value="化学">化学</option><option value="政治">政治</option><option value="历史">历史</option><option value="地理">地理</option><option value="体育">体育</option><option value="音乐">音乐</option><option value="美术">美术</option><option value="心理学">心理学</option><option value="计算机">计算机</option></select>中的一个。<br>
                        6、导入文件中，考试类型应为“入学考试”、“期中考试”、“期末考试”、“重考”、“会考”、“月考”、“其他”。<br>
                        7、导入文件中，成绩录入日期格式为文本格式，（2014-09-01）。<br>
                        8、导入文件中，模板中每个字段都应该填写。    </span>
                </td>
            </tr>
            </tbody>
        </table>
        <div style="text-align:center;margin-top:20px;">
            <button id="importBtn">导入</button>
        </div>

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