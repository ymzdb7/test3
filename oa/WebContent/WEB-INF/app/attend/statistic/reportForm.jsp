
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>考勤月度报表</title>
    <link rel="stylesheet" href="/css/supervise/statistic.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/bootstrap/bootstrap.min.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>


<style type="text/css">
    /*#body{*/
        /*overflow: hidden;*/
    /*}*/
    .sels1{display: inline;}
    @media only screen and (min-width: 100px) and (max-width: 960px) {
        .sels1 select{width: 40%;}
    }
    select{

        margin:14px 30px 0 0;

    }
    .font_siz{
        font-size: 20px;
    }
    .sels21{
        width:5%;
        float:left;
    }
    .form-font{
        display: inline-block;
        height: 30px;
        vertical-align: bottom;
        line-height:30px;
    }
    #table td img{
        width: 13px;
        height: 13px;
    }
    #table th{
        text-align: center;
        border-bottom: 1px solid #dddddd;
        vertical-align: middle;
        border-right: 1px solid #dddddd;
        border-top: 1px solid #dddddd;
    }
    .head_right_top1{
        font-weight: 900;
        display: inline-block;
    }
    .tablebody{
        overflow-x: auto;
        overflow-y: auto;
    }
    .table{
        width: 1850px;
        border: 1px solid #dddddd;
    }
    .table td{
        border-right: 1px solid #dddddd;
        text-align: center;
        padding: 6px;
        min-width: 40px;
    }
    .sm span{
        margin-left: 5px;
    }
    .head_right_top1 span{
        height: 35px;
        line-height: 35px;
        margin-top: 16px;
        background-color: #447dc0;
        width: 130px;
        border: 1px solid #447DC0;
    }

</style>
</head>

<body id="body" style="background-color:#fff" class="bodycolor"  onload="onload('','','1');">
<div>

    <!--<form action="" method="post" name="form1">-->

    <form action="" method="post" style="margin: 0 0 15px 20px;min-width: 890px;">

        <span class="form-font">年：</span>
        <select name="year" style="width: 90px" id="year-value">
            <option value="2015">2015年</option>
            <option value="2016">2016年</option>
            <option value="2017">2017年</option>
            <option value="2018" selected="selected">2018年</option>
            <option value="2019">2019年</option>
            <option value="2020">2020年</option>
            <option value="2021">2021年</option>
            <option value="2022">2022年</option>
            <option value="2023">2023年</option>
            <option value="2024">2024年</option>
            <option value="2025">2025年</option>
            <option value="2026">2026年</option>
            <option value="2027">2027年</option>
            <option value="2028">2028年</option>
            <option value="2029">2029年</option>
        </select>
        <span class="form-font">月：</span>
        <select name="month" style="width: 90px" id="month-value">
            <option value="1" selected="selected">1月</option>
            <option value="2">2月</option>
            <option value="3">3月</option>
            <option value="4">4月</option>
            <option value="5">5月</option>
            <option value="6">6月</option>
            <option value="7">7月</option>
            <option value="8">8月</option>
            <option value="9">9月</option>
            <option value="10">10月</option>
            <option value="11">11月</option>
            <option value="12">12月</option>
        </select>

        <span class="form-font">部门：</span><select id="did-value" style="width: 130px;" name="DID" class="liebiao1"></select>
        <span class="form-font">人员：</span><select name="deptpeople" style="width: 90px"  class="select2" id="userList">
        <option value="all">全部</option>
        <option value='101000215'>fdfd</option><option value='101000185'>高然</option>	</select>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <span class="form-font"><input value="查询" type="submit" style="width: 100px;padding: 5px 10px; font-size: 15px; color: #fff;border: 0;background: #7bafea; border-radius: 5px;">
&nbsp;
	</span>
    </form>
    <div style="    margin-left: 13px;min-width: 590px;" class="sm">
        <span>说明：（</span>
        <img src="/ui/img/attend/yd_duigou.png"><span>指考勤准时和外勤签到</span>
        <img src="/ui/img/attend/yd_triangle.png" style="    margin-left: 10px;"><span>指设备异常</span>
        <img src="/ui/img/attend/yd_circle.png" style="    margin-left: 10px;"><span>指迟到、早退）</span>
    </div>
</div>
<br>
<%--<div class="l-wrapper" style="margin: 0 auto;width: 40px;">--%>
    <%--<svg viewBox="0 0 120 120" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">--%>
        <%--<g id="circle" class="g-circles g-circles--v3">--%>
            <%--<circle id="12" transform="translate(35, 16.698730) rotate(-30) translate(-35, -16.698730) " cx="35" cy="16.6987298" r="10"></circle>--%>
            <%--<circle id="11" transform="translate(16.698730, 35) rotate(-60) translate(-16.698730, -35) " cx="16.6987298" cy="35" r="10"></circle>--%>
            <%--<circle id="10" transform="translate(10, 60) rotate(-90) translate(-10, -60) " cx="10" cy="60" r="10"></circle>--%>
            <%--<circle id="9" transform="translate(16.698730, 85) rotate(-120) translate(-16.698730, -85) " cx="16.6987298" cy="85" r="10"></circle>--%>
            <%--<circle id="8" transform="translate(35, 103.301270) rotate(-150) translate(-35, -103.301270) " cx="35" cy="103.30127" r="10"></circle>--%>
            <%--<circle id="7" cx="60" cy="110" r="10"></circle>--%>
            <%--<circle id="6" transform="translate(85, 103.301270) rotate(-30) translate(-85, -103.301270) " cx="85" cy="103.30127" r="10"></circle>--%>
            <%--<circle id="5" transform="translate(103.301270, 85) rotate(-60) translate(-103.301270, -85) " cx="103.30127" cy="85" r="10"></circle>--%>
            <%--<circle id="4" transform="translate(110, 60) rotate(-90) translate(-110, -60) " cx="110" cy="60" r="10"></circle>--%>
            <%--<circle id="3" transform="translate(103.301270, 35) rotate(-120) translate(-103.301270, -35) " cx="103.30127" cy="35" r="10"></circle>--%>
            <%--<circle id="2" transform="translate(85, 16.698730) rotate(-150) translate(-85, -16.698730) " cx="85" cy="16.6987298" r="10"></circle>--%>
            <%--<circle id="1" cx="60" cy="10" r="10"></circle>--%>
        <%--</g>--%>
    <%--</svg>--%>
<%--</div>--%>
<div class="tablebody" id="table_box" style="padding: 0 0 0 10px;">
    <table class="table table-striped" id="table">
        <tr>
            <th style="min-width: 90px;width: 73px;">员工/月度</th>
            <th style="min-width: 40px;">类型</th>
            <th>1</th>
            <th>2</th>
            <th>3</th>
            <th>4</th>
            <th>5</th>
            <th style="color: #9c9c9c">6</th>
            <th style="color: #9c9c9c">7</th>
            <th>8</th>
            <th>9</th>
            <th>10</th>
            <th>11</th>
            <th>12</th>
            <th style="color: #9c9c9c">13</th>
            <th style="color: #9c9c9c">14</th>
            <th>15</th>
            <th>16</th>
            <th>17</th>
            <th>18</th>
            <th>19</th>
            <th style="color: #9c9c9c">20</th>
            <th style="color: #9c9c9c">21</th>
            <th>22</th>
            <th>23</th>
            <th>24</th>
            <th>25</th>
            <th>26</th>
            <th style="color: #9c9c9c">27</th>
            <th style="color: #9c9c9c">28</th>
            <th>29</th>
            <th>30</th>
            <th>31</th>
            <th style="min-width: 40px;">合计</th>
        </tr>

        <tr class="tr1">
            <td rowspan="7" class="uname">fdfd</td>
            <td>上班</td>
            <td class="1-1"><input type="hidden" value="3"></td>
            <td class="1-2"><input type="hidden" value="3"></td>
            <td class="1-3"><input type="hidden" value="3"></td>
            <td class="1-4"><input type="hidden" value="3"></td>
            <td class="1-5"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-8"><input type="hidden" value="3"></td>
            <td class="1-9"><input type="hidden" value="3"></td>
            <td class="1-10"><input type="hidden" value="3"></td>
            <td class="1-11"><input type="hidden" value="3"></td>
            <td class="1-12"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-15"><input type="hidden" value="3"></td>
            <td class="1-16"><input type="hidden" value="3"></td>
            <td class="1-17"><input type="hidden" value="3"></td>
            <td class="1-18"><input type="hidden" value="3"></td>
            <td class="1-19"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-22"><input type="hidden" value="3"></td>
            <td class="1-23"><input type="hidden" value=""></td>
            <td class="1-24"><input type="hidden" value=""></td>
            <td class="1-25"><input type="hidden" value=""></td>
            <td class="1-26"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-29"><input type="hidden" value=""></td>
            <td class="1-30"><input type="hidden" value=""></td>
            <td class="1-31"><input type="hidden" value=""></td>
            <td>0</td>
        </tr>

        <tr class="tr2">
            <td>下班</td>
            <td class="1-1"><input type="hidden" value="3"></td>
            <td class="1-2"><input type="hidden" value="3"></td>
            <td class="1-3"><input type="hidden" value="3"></td>
            <td class="1-4"><input type="hidden" value="3"></td>
            <td class="1-5"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-8"><input type="hidden" value="3"></td>
            <td class="1-9"><input type="hidden" value="3"></td>
            <td class="1-10"><input type="hidden" value="3"></td>
            <td class="1-11"><input type="hidden" value="3"></td>
            <td class="1-12"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-15"><input type="hidden" value="3"></td>
            <td class="1-16"><input type="hidden" value="3"></td>
            <td class="1-17"><input type="hidden" value="3"></td>
            <td class="1-18"><input type="hidden" value="3"></td>
            <td class="1-19"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-22"><input type="hidden" value=""></td>
            <td class="1-23"><input type="hidden" value=""></td>
            <td class="1-24"><input type="hidden" value=""></td>
            <td class="1-25"><input type="hidden" value=""></td>
            <td class="1-26"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-29"><input type="hidden" value=""></td>
            <td class="1-30"><input type="hidden" value=""></td>
            <td class="1-31"><input type="hidden" value=""></td>
            <td>0</td>
        </tr>

        <tr>
            <td>请假</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr>

            <td>出差</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr>
            <td>外出</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr>

            <td>加班</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr class="tr3">
            <td>外勤</td>
            <td class="1-1"><input type="hidden" value=""></td>
            <td class="1-2"><input type="hidden" value=""></td>
            <td class="1-3"><input type="hidden" value=""></td>
            <td class="1-4"><input type="hidden" value=""></td>
            <td class="1-5"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-8"><input type="hidden" value=""></td>
            <td class="1-9"><input type="hidden" value=""></td>
            <td class="1-10"><input type="hidden" value=""></td>
            <td class="1-11"><input type="hidden" value=""></td>
            <td class="1-12"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-15"><input type="hidden" value=""></td>
            <td class="1-16"><input type="hidden" value=""></td>
            <td class="1-17"><input type="hidden" value=""></td>
            <td class="1-18"><input type="hidden" value=""></td>
            <td class="1-19"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-22"><input type="hidden" value=""></td>
            <td class="1-23"><input type="hidden" value=""></td>
            <td class="1-24"><input type="hidden" value=""></td>
            <td class="1-25"><input type="hidden" value=""></td>
            <td class="1-26"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="1-29"><input type="hidden" value=""></td>
            <td class="1-30"><input type="hidden" value=""></td>
            <td class="1-31"><input type="hidden" value=""></td>
            <td>0</td>
        </tr>


        <tr class="tr1">
            <td rowspan="7" class="uname">高然</td>
            <td>上班</td>
            <td class="2-1"><input type="hidden" value="3"></td>
            <td class="2-2"><input type="hidden" value="3"></td>
            <td class="2-3"><input type="hidden" value="3"></td>
            <td class="2-4"><input type="hidden" value="3"></td>
            <td class="2-5"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-8"><input type="hidden" value="3"></td>
            <td class="2-9"><input type="hidden" value="3"></td>
            <td class="2-10"><input type="hidden" value="3"></td>
            <td class="2-11"><input type="hidden" value="3"></td>
            <td class="2-12"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-15"><input type="hidden" value="3"></td>
            <td class="2-16"><input type="hidden" value="3"></td>
            <td class="2-17"><input type="hidden" value="3"></td>
            <td class="2-18"><input type="hidden" value="3"></td>
            <td class="2-19"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-22"><input type="hidden" value="3"></td>
            <td class="2-23"><input type="hidden" value=""></td>
            <td class="2-24"><input type="hidden" value=""></td>
            <td class="2-25"><input type="hidden" value=""></td>
            <td class="2-26"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-29"><input type="hidden" value=""></td>
            <td class="2-30"><input type="hidden" value=""></td>
            <td class="2-31"><input type="hidden" value=""></td>
            <td>0</td>
        </tr>

        <tr class="tr2">
            <td>下班</td>
            <td class="2-1"><input type="hidden" value="3"></td>
            <td class="2-2"><input type="hidden" value="3"></td>
            <td class="2-3"><input type="hidden" value="3"></td>
            <td class="2-4"><input type="hidden" value="3"></td>
            <td class="2-5"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-8"><input type="hidden" value="3"></td>
            <td class="2-9"><input type="hidden" value="3"></td>
            <td class="2-10"><input type="hidden" value="3"></td>
            <td class="2-11"><input type="hidden" value="3"></td>
            <td class="2-12"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-15"><input type="hidden" value="3"></td>
            <td class="2-16"><input type="hidden" value="3"></td>
            <td class="2-17"><input type="hidden" value="3"></td>
            <td class="2-18"><input type="hidden" value="3"></td>
            <td class="2-19"><input type="hidden" value="3"></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-22"><input type="hidden" value=""></td>
            <td class="2-23"><input type="hidden" value=""></td>
            <td class="2-24"><input type="hidden" value=""></td>
            <td class="2-25"><input type="hidden" value=""></td>
            <td class="2-26"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-29"><input type="hidden" value=""></td>
            <td class="2-30"><input type="hidden" value=""></td>
            <td class="2-31"><input type="hidden" value=""></td>
            <td>0</td>
        </tr>

        <tr>
            <td>请假</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr>

            <td>出差</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr>
            <td>外出</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr>

            <td>加班</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td></td>
            <td></td>
            <td></td>
            <td>0</td>
        </tr>

        <tr class="tr3">
            <td>外勤</td>
            <td class="2-1"><input type="hidden" value=""></td>
            <td class="2-2"><input type="hidden" value=""></td>
            <td class="2-3"><input type="hidden" value=""></td>
            <td class="2-4"><input type="hidden" value=""></td>
            <td class="2-5"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-8"><input type="hidden" value=""></td>
            <td class="2-9"><input type="hidden" value=""></td>
            <td class="2-10"><input type="hidden" value=""></td>
            <td class="2-11"><input type="hidden" value=""></td>
            <td class="2-12"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-15"><input type="hidden" value=""></td>
            <td class="2-16"><input type="hidden" value=""></td>
            <td class="2-17"><input type="hidden" value=""></td>
            <td class="2-18"><input type="hidden" value=""></td>
            <td class="2-19"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-22"><input type="hidden" value=""></td>
            <td class="2-23"><input type="hidden" value=""></td>
            <td class="2-24"><input type="hidden" value=""></td>
            <td class="2-25"><input type="hidden" value=""></td>
            <td class="2-26"><input type="hidden" value=""></td>
            <td style="background-color:#e0effc"></td>
            <td style="background-color:#e0effc"></td>
            <td class="2-29"><input type="hidden" value=""></td>
            <td class="2-30"><input type="hidden" value=""></td>
            <td class="2-31"><input type="hidden" value=""></td>
            <td>0</td>
        </tr>

    </table>
</div>

<script>
    $(function(){
        var lieobiao = $('.liebiao1');
        var dv_num = 0;
        $(".uname").each(function(){
            dv_num +=1;
        })
        var dv_num = dv_num+1;

        setTimeout(function(){
            $('.l-wrapper').hide();
            for(var j=1;j<dv_num;j++){
                for(var i=1;i<=31;i++){
                    //console.log(td1);//上班循环
                    var td1 = $('.tr1 .'+j+'-'+i+' input').val();
                    if(td1 == '1'){
                        var img = $("<img src='/ui/img/attend/yd_triangle.png'></img>");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }
                    if(td1 == '2'){
                        var img = $("<img src='/ui/img/attend/yd_circle.png'></img>");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }
                    if(td1 == '3'){
                        var img = $("");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }
                    if(td1 == '4'){
                        var img = $("<img src='/ui/img/attend/yd_duigou.png'></img>");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }
                    if(td1 == '5'){
                        var img = $("");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }
                    if(td1 == '6'){
                        var img = $("<img src='/ui/img/attend/yd_duigou.png'></img><img src='/ui/img/attend/yd_triangle.png'></img>");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }
                    if(td1 == '7'){
                        var img = $("<img src='/ui/img/attend/yd_circle.png'></img><img src='/ui/img/attend/yd_triangle.png'></img>");
                        $('.tr1 .'+j+'-'+i+'').append(img);
                    }

                    //console.log(td1);下班循环
                    var td2 = $('.tr2 .'+j+'-'+i+' input').val();
                    if(td2 == '1'){
                        var img = $("<img src='/ui/img/attend/yd_triangle.png'></img>");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    if(td2 == '2'){
                        var img = $("<img src='/ui/img/attend/yd_circle.png'></img>");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    if(td2 == '3'){
                        var img = $("");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    if(td2 == '4'){
                        var img = $("<img src='/ui/img/attend/yd_duigou.png'></img>");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    if(td2 == '5'){
                        var img = $("");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    if(td2 == '6'){
                        var img = $("<img src='/ui/img/attend/yd_duigou.png'></img><img src='/ui/img/attend/yd_triangle.png'></img>");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    if(td2 == '7'){
                        var img = $("<img src='/ui/img/attend/yd_circle.png'></img><img src='/ui/img/attend/yd_triangle.png'></img>");
                        $('.tr2 .'+j+'-'+i+'').append(img);
                    }
                    //console.log(td1);外勤循环
                    var td3 = $('.tr3 .'+j+'-'+i+' input').val();
                    if(td3 == '1'){
                        var img = $("");
                        $('.tr3 .'+j+'-'+i+'').append(img);
                    }
                    if(td3 == '2'){
                        var img = $("");
                        $('.tr3 .'+j+'-'+i+'').append(img);
                    }
                    if(td3 == '3'){
                        var img = $("");
                        $('.tr3 .'+j+'-'+i+'').append(img);
                    }
                    if(td3 == '4'){
                        var img = $("");
                        $('.tr3 .'+j+'-'+i+'').append(img);
                    }
                    if(td3 == '5'){
                        var img = $("<img src='/ui/img/attend/yd_duigou.png'></img>");
                        $('.tr3 .'+j+'-'+i+'').append(img);
                    }
                }
            }
        },3000);


        $(".liebiao1").change(function(){
            var did = $(this).val();
            $.ajax({
                url:"data_api.php",
                type:"post",
                dataType:"json",
                data:{
                    did:did,
                    flag:'getUser',
                },
                success:function(data){
                    // console.log(data);
                    var str = '<option value="all">全部</option>';
                    for(var i=0;i<data.length;i++){
                        str += "<option value='"+data[i].uid+"'>"+data[i].uname+"</option>";
                    }
                    $("#userList").html(str);
                },
                error:function(data){
                    console.log('error');
                }
            })
        })
        // var DID = $("select:DID").val();
        // alert(DID);
        $("#attend-execl").click(function(){
            var year = $("#year-value").val();
            var month = $("#month-value").val();
            var did = $("#did-value").val();
            var url = "attend_execl_yd.php?YEAR="+year+"&MONTH="+month+"&DID="+did;
            //alert(url);
            window.location.href = url;
        })
    })

</script>
<script>
    winHeight1 = document.documentElement.clientHeight;
    winHeight = window.screen.height;
    autodivheight();

    function autodivheight() {
        var winHeight = 0;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        if (document.documentElement && document.documentElement.clientHeight)
            winHeight = document.documentElement.clientHeight;
        //alert(winHeight);
        document.getElementById("body").style.height = winHeight1 + 'px';
        document.getElementById("table_box").style.height = winHeight1 - 103 + 'px';
    }
    window.onresize = autodivheight;
</script>
</body>
</html>
