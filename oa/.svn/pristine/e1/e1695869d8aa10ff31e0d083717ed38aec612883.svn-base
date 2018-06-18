
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
    <title>选修课管理</title>
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
        display:block;
        margin:10px auto 0px;
        width:50px;
        height:28px;
        border-radius: 5px;
        color:#fff;
        background-color:#2F8AE3;
    }
</style>
<body>
<div class="box">
    <%--导航栏--%>
    <div class="header">
        <ul class="nav">
            <li>
                <span class="select pad">选修课发布管理</span>
                <img class="space" src="../img/02.png" alt="">
            </li>
            <li>
                <span class="pad">新建选修课发布</span>
                <img class="space" src="../img/02.png" alt="">
            </li>
            <li>
                <span class="pad">选修课基础课表管理</span>
                <img class="space" src="../img/02.png" alt="">
            </li>
            <li>
                <span class="pad">新建选修课基础课表</span>
                <img class="space" src="../img/02.png" alt="">
            </li>
        </ul>
    </div>
    <%--tab切换具体内容section--%>
    <div class="section" id="section">
        <ul class="content">
            <%--班级课表--%>
            <li class="banji show">
                <div class="banji_head">
                    <span class="title">班级课表</span>
                    <div class="dan">
                        <label>选择学年：</label>
                        <select name="" class="year">
                            <option value="">-选择-</option>
                        </select>
                        <label>选择学期：</label>
                        <select name="" class="Semester">
                            <option value="1">一学期</option>
                            <option value="2">二学期</option>
                        </select>
                        <label for="">选择年级：</label>
                        <select name="" class="grade">
                        </select>
                        <label for="">选择班级：</label>
                        <select name="" class="ban">
                            <option value="">请选择</option>
                        </select>
                        <button id="btn">查询</button>
                    </div>
                </div>
                <div class="classTable">
                    <table class="layui-table" lay-skin="row" >
                        <thead>
                        <tr>
                            <th></th>
                            <th>星期一</th>
                            <th>星期二</th>
                            <th>星期三</th>
                            <th>星期四</th>
                            <th>星期五</th>
                            <th>星期六</th>
                            <th>星期日</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td rowspan="5" class="center">上午</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td rowspan="3" class="center">下午</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </li>
            <%--教师课表--%>
            <li class="banji">
                <div class="banji_head">
                    <span class="title">教师课表</span>
                    <div class="dan">
                        <label>选择学年：</label>
                        <select name="" class="teachYear">
                            <option value="">-选择-</option>
                        </select>
                        <label>选择学期：</label>
                        <select name="" class="teacherSem">
                            <option value="1">一学期</option>
                            <option value="2">二学期</option>
                        </select>
                        <label for="">选择老师：</label>
                        <input type="text" class="ipt"  name="userId" id="teacherUserId">
                        <span class="text">
                                <a href="javascript:;" id="add">添加</a>
                                <a href="javascript:;" id="del">清空</a>
                            </span>
                        <button id="see">查询</button>
                    </div>
                </div>
                <div class="teacherTable">
                    <table class="layui-table" lay-skin="row" >
                        <thead>
                        <tr>
                            <th></th>
                            <th>星期一</th>
                            <th>星期二</th>
                            <th>星期三</th>
                            <th>星期四</th>
                            <th>星期五</th>
                            <th>星期六</th>
                            <th>星期日</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td rowspan="5" class="center">上午</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td rowspan="3" class="center">下午</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </li>
            <%--场地课表--%>
            <li>
                <div class="banji_head">
                    <span class="title">场地课表</span>
                    <div class="dan">
                        <label>选择学年：</label>
                        <select name="" class="fieldYear">
                            <option value="">-选择-</option>
                        </select>
                        <label>选择学期：</label>
                        <select name="" class="fieldSem">
                            <option value="1">一学期</option>
                            <option value="2">二学期</option>
                        </select>
                        <label>选择场地：</label>
                        <select name="" class="field">
                            <option value="">--选择--</option>
                            <option value="">A203</option>
                            <option value="">A204</option>
                            <option value="">A205</option>
                            <option value="">A206</option>
                            <option value="">物理实验室</option>
                            <option value="">体育场A区</option>
                            <option value="">教学楼503</option>
                            <option value="">教一102</option>
                        </select>
                        <button id="see2">查询</button>
                    </div>
                </div>
                <div class="fieldTable">
                    <table class="layui-table" lay-skin="row" >
                        <thead>
                        <tr>
                            <th></th>
                            <th>星期一</th>
                            <th>星期二</th>
                            <th>星期三</th>
                            <th>星期四</th>
                            <th>星期五</th>
                            <th>星期六</th>
                            <th>星期日</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td rowspan="5" class="center">上午</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td rowspan="3" class="center">下午</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </li>
            <%--班级总课表--%>
            <li>
                <div class="banji_head">
                    <span class="title">班级总课表</span>
                    <div class="dan">
                        <label>选择学年：</label>
                        <select name="" class="banYear">
                            <option value="">选择</option>
                        </select>
                        <label>选择学期：</label>
                        <select name="" class="classSem">
                            <option value="1">一学期</option>
                            <option value="2">二学期</option>
                        </select>
                        <button id="see3">查询</button>
                    </div>
                </div>
                <table class="layui-table all" lay-skin="row" >
                    <thead>
                    <tr>
                        <th></th>
                        <th colspan="7">星期一</th>
                        <th colspan="7">星期二</th>
                        <th colspan="7">星期三</th>
                        <th colspan="7">星期四</th>
                        <th colspan="7">星期五</th>
                        <th colspan="7">星期六</th>
                        <th colspan="7">星期日</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><div>班级</div></td>
                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>
                    </tr>
                    </tbody>
                    <tfoot class="allBan">

                    </tfoot>
                </table>
            </li>
            <%--教师总课表--%>
            <li>
                <div class="banji_head">
                    <span class="title">教师总课表</span>
                    <div class="dan">
                        <label>选择学年：</label>
                        <select name="" class="teachAllyear">
                            <option value="">选择</option>
                        </select>
                        <label>选择学期：</label>
                        <select name="" class="teaAllsem">
                            <option value="1">一学期</option>
                            <option value="2">二学期</option>
                        </select>
                        <button id="see4">查询</button>
                    </div>
                </div>
                <table class="layui-table all" lay-skin="row" >
                    <thead>
                    <tr>
                        <th></th>
                        <th colspan="7">星期一</th>
                        <th colspan="7">星期二</th>
                        <th colspan="7">星期三</th>
                        <th colspan="7">星期四</th>
                        <th colspan="7">星期五</th>
                        <th colspan="7">星期六</th>
                        <th colspan="7">星期日</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><div>教师</div></td>
                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>
                    </tr>
                    </tbody>
                    <tfoot class="allTeacher">

                    </tfoot>
                </table>
            </li>
            <%--场地总课表--%>
            <li>
                <div class="banji_head">
                    <span class="title">场地总课表</span>
                    <div class="dan">
                        <label>选择学年：</label>
                        <select name="" class="fieldAllyear">
                            <option value="">选择</option>
                        </select>
                        <label>选择学期：</label>
                        <select name="" class="fieldAllsem">
                            <option value="1">一学期</option>
                            <option value="2">二学期</option>
                        </select>
                        <button id="see5">查询</button>
                    </div>
                </div>
                <table class="layui-table all" lay-skin="row" >
                    <thead>
                    <tr>
                        <th colspan="7">星期一</th>
                        <th colspan="7">星期二</th>
                        <th colspan="7">星期三</th>
                        <th colspan="7">星期四</th>
                        <th colspan="7">星期五</th>
                        <th colspan="7">星期六</th>
                        <th colspan="7">星期日</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>

                        <td><div>上午第1节</div></td>
                        <td><div>上午第2节</div></td>
                        <td><div>上午第3节</div></td>
                        <td><div>上午第4节</div></td>
                        <td><div>下午第5节</div></td>
                        <td><div>下午第6节</div></td>
                        <td><div>下午第7节</div></td>
                    </tr>
                    </tbody>
                </table>
            </li>
            <%--导入课表--%>
            <li>
                <div class="banji_head">
                    <span class="title">课表导入:</span>
                </div>
                <form action="">
                    <table class="import">
                        <tbody>
                        <tr>
                            <td class="left">下载导入模板:</td>
                            <td class="right"><a id="importStudent">课表导入模板下载</a></td>
                        </tr>
                        <tr>
                            <td class="left" >选择导入文件:</td>
                            <td class="right"><input type="file" id="file"></td>
                        </tr>
                        <tr>
                            <td class="left">说明:</td>
                            <td class="right">
                                <p>1、请导入.xls文件。</p>
                                <p>2、导入文件中，学年、学期应为类似“2013-2014”、“一学期” 的形式。</p>
                                <p>3、导入的节次必须是数字，类似“1”、“2”,分别表示第一节和第二节。</p>
                                <p>4、导入文件中，年级、班级应为类似“一年级”、“一班” 等实际存在的班级名称。</p>
                                <p>5、导入文件中，上下午标记只需要输入“上午”或者“下午”即可。</p>
                                <p>6、导入文件中，周一到周日应为类似“语文|高德才|教学楼503”，第一个值为科目，且系统中存在，具体参考“教务管理”->“课程建设”，第二个值为教师名称，且系统中存在，第三个值为场地，且系统中存在，具体参考“系统管理”->“系统代码设置”-〉“场地管理”。</p>
                                <p>7、导入文件中，单双周标记只需要输入“单”、“双”，如果不输入表示无单双周</p>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <button id="importBtn">导入</button>
                </form>
            </li>
        </ul>
    </div>
</div>
<script>
    $(function(){
//        导航tab切换
        $('.nav li').click(function(){
            var i=$(this).index();
            $('.nav li span').eq(i).addClass('select').parent().siblings().find('span').removeClass('select');
            $('.content li').eq(i).addClass('show').siblings().removeClass('show');
        })

//        获取学年控件
        function getYear(year){
            $.ajax({
                url:'/code/getCode',
                type:'get',
                data:{parentNo:'EDU_YEAR_NO'},
                dataType:'json',
                //data:datas,
                success:function(reg){

                    var datas=reg.obj;
                    for (var i=0;i<datas.length;i++){
                        if(datas[i].codeOrder==13){
                            var str='<option value="'+datas[i].codeOrder+'" selected="true">'+datas[i].codeName+'</option>';
                        }else{
                            var str='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                        }
                        $(year).append(str);
                    }

                }
            })
        }
        getYear('.year');
        getYear('.teachYear');
        getYear('.banYear');
        getYear('.fieldYear');
        getYear('.teachAllyear');
        getYear('.fieldAllyear');

//    获取年级和班级
        function getGrade(){
            $.ajax({
                url:'/eduDepartment/queryGetObj',
                type:'get',
                dataType:'json',
                success:function(reg){
                    var datas=reg.obj;
                    var str=""
                    for(var i=0;i<datas.length-2;i++){
                        str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                    }
                    $('.grade').append(str);
                    $('.grade').change(function(){
                        var sId=$(this).val();
                        $.ajax({
                            url:'/eduDepartment/queryListByDeptId',
                            type:'get',
                            data:{deptId:sId},
                            dataType:'json',
                            success:function(reg){
                                var datas=reg.obj;
                                var str="";
                                $('.ban').html('<option value="" selected="true">请选择</option>');
                                for(var i=0;i<datas.length;i++){
                                    str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                                }
                                $('.ban').append(str);
                            }
                        })
                    })
                }
            })
        }
        getGrade();

//        选择教师控件
        $('#add').click(function(){
            user_id='teacherUserId';
            $.popWindow("../common/selectEduUser");
        })

//        清空教师内容
        $('#del').click(function(){
            $('.ipt').val("");
        })


//        获取班级课表
        $('#btn').click(function(){
            $('.classTable').empty();
            var arr=[$('.grade option:selected').text(),$('.ban option:selected').text()];
            var zi=arr.join("");
            var data={
                academicYear:$('.year option:selected').text(),
                semester:$('.Semester option:selected').text(),
                gradeClass:zi
            }
            $.ajax({
                url:'/eduArrangeCourse/eduArrangeCourseClassSelect',
                type:'post',
                dataType:'json',
                data:data,
                success:function(reg){
                    var data=reg.obj;
                    console.log(data);
                    if(data.length<=0){
                        var str='<table class="layui-table" lay-skin="row" > ' +
                            '<thead> ' +
                            '<tr> ' +
                            '<th></th> ' +
                            '<th>星期一</th> ' +
                            '<th>星期二</th> ' +
                            '<th>星期三</th> ' +
                            '<th>星期四</th> ' +
                            '<th>星期五</th> ' +
                            '<th>星期六</th> ' +
                            '<th>星期日</th> ' +
                            '</tr> ' +
                            '</thead> ' +
                            '<tbody> ' +
                            '<tr> ' +
                            '<td rowspan="5" class="center">上午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tbody> ' +
                            '<tfoot> ' +
                            '<tr> ' +
                            '<td rowspan="3" class="center">下午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tfoot> ' +
                            '</table>'
                        $('.classTable').append(str);
                    }else{
                        var str='<table class="layui-table" lay-skin="row" > ' +
                            '<thead> ' +
                            '<tr> ' +
                            '<th></th> ' +
                            '<th>星期一</th> ' +
                            '<th>星期二</th> ' +
                            '<th>星期三</th> ' +
                            '<th>星期四</th> ' +
                            '<th>星期五</th> ' +
                            '<th>星期六</th> ' +
                            '<th>星期日</th> ' +
                            '</tr> ' +
                            '</thead> ' +
                            '<tbody> ' +
                            '<tr> ' +
                            '<td rowspan="5" class="center">上午</td> ' +
                            '<td>'+data[0].mondayAmOne+'</td> ' +
                            '<td>'+data[0].tuesdayAmOne+'</td> ' +
                            '<td>'+data[0].wednesdayAmOne+'</td> ' +
                            '<td>'+data[0].thursdayAmOne+'</td> ' +
                            '<td>'+data[0].fridayAmOne+'</td> ' +
                            '<td>'+data[0].saturdayAmOne+'</td> ' +
                            '<td>'+data[0].sundayAmOne+'</td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data[0].mondayAmTwo+'</td> ' +
                            '<td>'+data[0].tuesdayAmTwo+'</td> ' +
                            '<td>'+data[0].wednesdayAmTwo+'</td> ' +
                            '<td>'+data[0].thursdayAmTwo+'</td> ' +
                            '<td>'+data[0].fridayAmTwo+'</td> ' +
                            '<td>'+data[0].saturdayAmTwo+'</td> ' +
                            '<td>'+data[0].sundayAmTwo+'</td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data[0].mondayAmTree+'</td> ' +
                            '<td>'+data[0].tuesdayAmTree+'</td> ' +
                            '<td>'+data[0].wednesdayAmTree+'</td> ' +
                            '<td>'+data[0].thursdayAmTree+'</td> ' +
                            '<td>'+data[0].fridayAmTree+'</td> ' +
                            '<td>'+data[0].saturdayAmTree+'</td> ' +
                            '<td>'+data[0].sundayAmTree+'</td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data[0].mondayAmFour+'</td> ' +
                            '<td>'+data[0].tuesdayAmFour+'</td> ' +
                            '<td>'+data[0].wednesdayAmFour+'</td> ' +
                            '<td>'+data[0].thursdayAmFour+'</td> ' +
                            '<td>'+data[0].fridayAmFour+'</td> ' +
                            '<td>'+data[0].saturdayAmFour+'</td> ' +
                            '<td>'+data[0].sundayAmFour+'</td> ' +
                            '</tr> ' +
                            '</tbody> ' +
                            '<tfoot> ' +
                            '<tr> ' +
                            '<td rowspan="3" class="center">下午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tfoot> ' +
                            '</table>'
                        $('.classTable').append(str);
                    }


                }
            })
        })

//        获取教师课表
        $('#see').click(function(){
            $('.teacherTable').empty();
            var data={
                academicYear :$('.teachYear option:selected').text(),
                semester:$('.teacherSem option:selected').text(),
                teacheri:$('.ipt').val()
            };
            $.ajax({
                url:'/eduArrangeCourse/eduArrangeCourseTeacherSelect',
                type:'post',
                dataType:'json',
                data:data,
                success:function(reg){
                    var data=reg.object;
                    console.log(data);
                    if(data.length<=0){
                        var str='<table class="layui-table" lay-skin="row" > ' +
                            '<thead> ' +
                            '<tr> ' +
                            '<th></th> ' +
                            '<th>星期一</th> ' +
                            '<th>星期二</th> ' +
                            '<th>星期三</th> ' +
                            '<th>星期四</th> ' +
                            '<th>星期五</th> ' +
                            '<th>星期六</th> ' +
                            '<th>星期日</th> ' +
                            '</tr> ' +
                            '</thead> ' +
                            '<tbody> ' +
                            '<tr> ' +
                            '<td rowspan="5" class="center">上午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tbody> ' +
                            '<tfoot> ' +
                            '<tr> ' +
                            '<td rowspan="3" class="center">下午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tfoot> ' +
                            '</table>';
                        $('.teacherTable').append(str);
                    }else{
                        var str='<table class="layui-table" lay-skin="row" > ' +
                            '<thead> ' +
                            '<tr> ' +
                            '<th></th> ' +
                            '<th style="width:15%">星期一</th> ' +
                            '<th style="width:15%">星期二</th> ' +
                            '<th style="width:15%">星期三</th> ' +
                            '<th style="width:15%">星期四</th> ' +
                            '<th style="width:15%">星期五</th> ' +
                            '<th>星期六</th> ' +
                            '<th>星期日</th> ' +
                            '</tr> ' +
                            '</thead> ' +
                            '<tbody> ' +
                            '<tr> ' +
                            '<td rowspan="5" class="center">上午</td> ' +
                            '<td>'+data.E11+'</td> ' +
                            '<td></td> ' +
                            '<td>'+data.E13+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data.E21+'</td> ' +
                            '<td>'+data.E22+'</td> ' +
                            '<td>'+data.E23+'</td> ' +
                            '<td>'+data.E24+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data.E31+'</td> ' +
                            '<td>'+data.E32+'</td> ' +
                            '<td></td> ' +
                            '<td>'+data.E34+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td>'+data.E43+'</td> ' +
                            '<td>'+data.E44+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data.E51+'</td> ' +
                            '<td>'+data.E52+'</td> ' +
                            '<td>'+data.E53+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tbody> ' +
                            '<tfoot> ' +
                            '<tr> ' +
                            '<td rowspan="3" class="center">下午</td> ' +
                            '<td>'+data.E61+'</td> ' +
                            '<td>'+data.E62+'</td> ' +
                            '<td>'+data.E63+'</td> ' +
                            '<td>'+data.E64+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tfoot> ' +

                            '</table>';
                        $('.teacherTable').append(str);
                    }
                }
            })
        })

//         获取场地课表
        $('#see2').click(function(){
            $('.fieldTable').empty();
            var data={
                academicYear :$('.fieldYear option:selected').text(),
                semester:$('.fieldSem option:selected').text(),
                teacheri:$('.field option:selected').text()
            }
            $.ajax({
                url:'/eduArrangeCourse/eduArrangeCourseTeacherSelect',
                type:'post',
                dataType:'json',
                data:data,
                success:function(reg){
                    var data=reg.object;
                    if(data.length<=0){
                        var str='<table class="layui-table" lay-skin="row" > ' +
                            '<thead> ' +
                            '<tr> ' +
                            '<th></th> ' +
                            '<th>星期一</th> ' +
                            '<th>星期二</th> ' +
                            '<th>星期三</th> ' +
                            '<th>星期四</th> ' +
                            '<th>星期五</th> ' +
                            '<th>星期六</th> ' +
                            '<th>星期日</th> ' +
                            '</tr> ' +
                            '</thead> ' +
                            '<tbody> ' +
                            '<tr> ' +
                            '<td rowspan="5" class="center">上午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tbody> ' +
                            '<tfoot> ' +
                            '<tr> ' +
                            '<td rowspan="3" class="center">下午</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tfoot> ' +
                            '</table>';
                        $('.fieldTable').append(str);
                    }else{
                        var str='<table class="layui-table" lay-skin="row" > ' +
                            '<thead> ' +
                            '<tr> ' +
                            '<th></th> ' +
                            '<th style="width:15%">星期一</th> ' +
                            '<th style="width:15%">星期二</th> ' +
                            '<th style="width:15%">星期三</th> ' +
                            '<th style="width:15%">星期四</th> ' +
                            '<th style="width:15%">星期五</th> ' +
                            '<th>星期六</th> ' +
                            '<th>星期日</th> ' +
                            '</tr> ' +
                            '</thead> ' +
                            '<tbody> ' +
                            '<tr> ' +
                            '<td rowspan="5" class="center">上午</td> ' +
                            '<td>'+data.E11+'</td> ' +
                            '<td></td> ' +
                            '<td>'+data.E13+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data.E21+'</td> ' +
                            '<td>'+data.E22+'</td> ' +
                            '<td>'+data.E23+'</td> ' +
                            '<td>'+data.E24+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data.E31+'</td> ' +
                            '<td>'+data.E32+'</td> ' +
                            '<td></td> ' +
                            '<td>'+data.E34+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td>'+data.E43+'</td> ' +
                            '<td>'+data.E44+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td>'+data.E51+'</td> ' +
                            '<td>'+data.E52+'</td> ' +
                            '<td>'+data.E53+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tbody> ' +
                            '<tfoot> ' +
                            '<tr> ' +
                            '<td rowspan="3" class="center">下午</td> ' +
                            '<td>'+data.E61+'</td> ' +
                            '<td>'+data.E62+'</td> ' +
                            '<td>'+data.E63+'</td> ' +
                            '<td>'+data.E64+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '<tr> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '</tr> ' +
                            '</tfoot> ' +

                            '</table>';
                        $('.fieldTable').append(str);
                    }
                }
            })
        })

//        获取班级总课表
        function getAlltable(id,url,table,academicYear,Semester){
            $(id).click(function(){
                $(table).empty();
                var data={
                    academicYear:$(academicYear).text(),
                    semester:$(Semester).text()
                };
                $.ajax({
                    url:url,
                    type:'post',
                    dataType:'json',
                    data:data,
                    success:function(reg){
                        var datas=reg.obj;
                        var str="";
                        console.log(datas)
                        for(var i=0;i<datas.length;i++){
                            str+='<tr> ' +
                                '<td><div>'+datas[i].gradeClass+'</div></td> ' +
                                '<td><div>'+datas[i].mondayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].mondayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].mondayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].mondayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +

                                '<td><div>'+datas[i].tuesdayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].tuesdayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].tuesdayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].tuesdayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +

                                '<td><div>'+datas[i].wednesdayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].wednesdayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].wednesdayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].wednesdayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +

                                '<td><div>'+datas[i].thursdayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].thursdayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].thursdayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].thursdayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +

                                '<td><div>'+datas[i].fridayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].fridayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].fridayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].fridayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +

                                '<td><div>'+datas[i].saturdayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].saturdayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].saturdayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].saturdayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +

                                '<td><div>'+datas[i].sundayAmOne+'</div></td> ' +
                                '<td><div>'+datas[i].sundayAmTwo+'</div></td> ' +
                                '<td><div>'+datas[i].sundayAmTree+'</div></td> ' +
                                '<td><div>'+datas[i].sundayAmFour+'</div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '<td><div></div></td> ' +
                                '</tr>';

                        }
                        $(table).append(str);
                    }
                })
            })
        }
//        获取所有班级课表
        getAlltable('#see3','/eduArrangeCourse/eduArrangeCourseTotalClass','.allBan','.banYear option:selected','.classSem option:selected');
//        获取所有教师课表
//        getAlltable('#see4','/eduArrangeCourse/eduArrangeCourseTotalTeacher','.allTeacher','.teachAllyear option:selected','.teaAllsem option:selected');


    })
    //课表模版下载
    $('#importStudent').click(function () {
        window.location.href = encodeURI("/file/edu/eduArrang/import_edu_arrange_course.xls");
    });

</script>
</body>
</html>
