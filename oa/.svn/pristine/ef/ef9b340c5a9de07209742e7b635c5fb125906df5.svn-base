<%--
  Created by IntelliJ IDEA.
  User: CY
  Date: 2018/3/8
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>

    <script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>

    <title>学期管理</title>
    <style>
        tr{
            height:45px;
        }
        .head_left{
            width: 50%;
        }
        .head_left h1{
            font-weight: normal;
        }
        .head{
            padding-bottom:0px
        }
        .newDiv{
            width: 70px;
            float: right;
            height: 100%;
            margin-right: 40px;
        }
        .divBtn{
            width: 70px;
            height: 28px;
            background: #2b7fe0;
            border-radius: 4px;
            margin-top: 7px;
            cursor: pointer;
            line-height: 28px;
        }
        .divBtn span{
            float: none;
            color: #ffffff;
            font-size: 11pt;
            margin-left: 5px;
        }
        .divBtn img{
            margin-top: -5px;
            margin-left: 8px;
        }
        .mainCont{
            width: 100%;
        }
        .mainCont table{
            width: 98%;
            margin: 20px auto;
        }
        .mainCont table th{
            font-size: 11pt;
            color: #2F5C8F;
            padding: 5px;
        }
        .newLayer{
            width: 100%;
        }
        .newLayer table{
            width: 82%;
            margin: 20px auto;
            border:none;
        }
        .newLayer table tr{
            border: none;
        }
        .newLayer table tr td{
            font-size: 11pt;

        }
        .newLayer table tr td:first-of-type{
            width: 100px;
            text-align: right;
        }
        .newLayer table tr td input{
            width: 300px;
            height: 30px;
        }
        .newLayer table tr td select{
            width: 120px;
        }
        #trList td{
            padding: 8px;
            text-align: center;
        }
    </style>
    <script type="text/javascript" src="/js/edu/basicSetting/termManagement.js"></script>
</head>
<body>
<div class="head">
    <div class="head_left">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dept1.png" alt="">
        <h1>学期管理</h1>
    </div>
    <div class="newDiv">
        <div class="divBtn">
            <img src="../../img/mywork/newbuildworjk.png" alt="">
            <span>新建</span>
        </div>
    </div>
</div>
<div class="mainCont">
    <table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">
        <thead>
        <tr>
            <th style="width: 40px;">序号</th>
            <th>名称</th>
            <th>编号</th>
            <th>学年</th>
            <th>默认学期</th>
            <th>第几学期</th>
            <th>开始日期</th>
            <th>结束日期</th>
            <th>上课天数</th>
            <th>激活</th>
            <th>显示位置</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="trList">

        </tbody>
    </table>
    <div class="right">
        <!-- 分页按钮-->
        <div class="M-box3" id="dbgz_page">
        </div>

    </div>
</div>
</body>
</html>
