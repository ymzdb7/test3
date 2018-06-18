
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<head>
    <title>电子校历模块</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <link rel="stylesheet" type="text/css" href="/css/edu/eduSchoolCalendar/style.css" />
    <script type="text/javascript" src="/js/edu/eduSchoolCalendar/ccorrect_btn.js"></script>
    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
</head>
<link rel="stylesheet" type="text/css" href="/css/edu/eduSchoolCalendar/xiaoliDemo.css">

<body>
<div class="Big">
    <img src="/img/edu/eduSchoolCalendar/sc_calendar.png" style="position:relative; top:10px; left:20px;">
    <div class="big3" style="position:relative; top:-10px; left:55px;">电子校历</div>
</div>
<div class="main">

    <div class="calendar_div">
        <div class="school_calendar_selectDiv">
            <div class="info"></div>
            <select class="grade" onChange="userDate_Select()" id="grade">
            </select>
            <select class="term" id="term" onChange="userDate_Select()">
            </select>
            <select class="semester" id="semester" onChange="userDate_Select()">
                <option value="第一学期" selected >第一学期</option><option value="第二学期"  >第二学期</option>                </select>
            <select id="calendar_select_month" onchange="School_Calenda.move_calendar()">
            </select>
        </div>
        <div class="school_calendar noselect">
            <table class="tabHead">
                <tr>
                    <td style="color:#094dba;">周次</td>
                    <td style="color:#094dba;">一</td>
                    <td style="color:#094dba;">二</td>
                    <td style="color:#094dba;">三</td>
                    <td style="color:#094dba;">四</td>
                    <td style="color:#094dba;">五</td>
                    <td style="color:#094dba;">六</td>
                    <td style="color:#094dba;">日</td>
                </tr>
            </table>
            <div class="school_calendar_main">
                <div class="school_calendar_tab_div" id="school_calendar_tab_div">
                    <table class="school_calendar_tab">
                    </table>
                </div>
            </div>
            <div class="up_btn" onMouseOver="School_Calenda.aotu_page_up()"></div>
            <div class="down_btn" onMouseOver="School_Calenda.aotu_page_down()"></div>
        </div>
        <div id="year_description_ins">学期大事件</div>
        <div id="year_description">
            <textarea readonly  onClick="allowY_Desp()" id="YearDescription" onblur="saveY_Desp()"></textarea>
        </div>
        <div class="Edit_div">
            <div class="info	">编辑类型</div>
            <div class="Edit_main">
                <table>
                    <tr>
                        <td>类型：</td>
                        <td>
                            <select class="SC_event">
                                <option value="0">事件</option>
                                <option value="1">节日</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>是否放假：</td>
                        <td>
                            <input type="radio" id="holidayY" name="holiday" value="1" checked>
                            <label for="holidayY">是</label>
                            <input type="radio" id="holidayN" name="holiday" value="0">
                            <label for="holidayN">否</label>
                        </td>
                    </tr>
                    <tr>
                        <td>时间从</td>
                        <td>
                            <input id="BegDate" name="d1" onClick="WdatePicker({dateFmt:'yyyy/MM/dd'})"/>至<input id="EndDate" name="d2" onClick="WdatePicker({dateFmt:'yyyy/MM/dd'})"/>
                        </td>
                    </tr>
                    <tr>
                        <td>描述：</td>
                        <td><textarea  id="edit_description" num=""></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2" height="30">
                            <div class="btn_div">
                                <input type="button" value="删除" onClick="test_delete()">
                                <input type="button" value="保存" onClick="save_event()">
                            </div>
                        </td>
                    </tr>
                </table>

            </div>
        </div>
        <div class="this_month_event">
            <table id="month_event_tb">
                <tr>
                    <td width="55">类型</td>
                    <td>是否放假</td>
                    <td>时间</td>
                    <td>描述</td>
                    <td>操作</td>
                </tr>
            </table>
        </div>

        <div id="developTest" style="width:500px; height:200px; overflow:auto;"></div>
    </div>



</div>

</body>
<%--<script type="text/javascript" src="/js/jquery-1.9.1.js"></script>--%>
<script type="text/javascript" src="/js/edu/eduSchoolCalendar/jquery-1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="/js/edu/eduSchoolCalendar/xiaoliDemo.js"></script>
<script src="/js/edu/eduSchoolCalendar/DatePicker/WdatePicker.js"></script>
</html>

