<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
	<link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.css"/>
	<link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.print.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/FullCalendar/style.css"/>
	<link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
	<%--<script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js" ></script>--%>
	<%--<script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>--%>
	<script src="../../lib/fullcalendar/moment.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
	<%--<script src="../../lib/fullcalendar/fullcalendar.js" type="text/javascript" charset="utf-8"></script>--%>
	<script src="../../lib/fullcalendar/fullcalendar.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/fullcalendar/zh-cn.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/fullcalendar/jquery-ui.custom.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/layer/layer.js"></script>
	<script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../js/jquery/jquery.cookie.js"></script>
	<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
	<%--<script src="../../lib/fullcalendar/script.js" type="text/javascript" charset="utf-8"></script>--%>
	<%--<script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>--%>
	<title>日程安排查询</title>
	<style>
		.fc-event-skin {
			border-color: #36c !important;
			background-color: #36c !important;
			color: #fff !important;
		}
		.control-group{
			text-align: center;
			margin-top:15px;
		}
		.modal-body input[type=text]{
			padding-left:5px;
		}

	</style>
	<style>
		body{
			position: relative;
		}
		/*.fc-event-skin {*/
		/*border-color: #36c !important;*/
		/*background-color: #36c !important;*/
		/*color: #fff !important;*/
		/*}*/
		/*.fc-event-inner{*/
		/*border-color: #36c !important;*/
		/*background-color: #36c !important;*/
		/*color: #fff !important;*/
		/*}*/
		.smallSelect{
			margin-left: 50px;
		}
		.CAL_LEVEL{
			margin-left: 54px;
		}
		.CAL_CONTENT{
			margin-left: 50px;
		}
		.modal-header{
			margin-left:20px;
		}
		.text_boder{
			width:275px;
			height:26px;
			border-radius:4px;
			color: rgb(169, 169, 169);
			margin-left: 50px;
		}
		/*#calendar{*/
		/*border-top-color: #3c8dbc;*/
		/*}*/
		/*.box{*/
			/*border-top-color: #3c8dbc !important;*/
			/*border-top-width:3px;*/
		/*}*/
		.row-fluid {
			border-top-color: #3c8dbc !important;
			border-top-width:3px;
		}
		.fc-header{
			background: #fff;
		}
		.content .box{
			border:none;
		}
		.content{
			background-color:#fff;
			/*position: relative;*/
		}
		body{
			margin:0px;
		}

		/*.fc-first .fc-last{*/
		/*background: #eee;*/
		/*}*/
		body {
			background: url("") repeat !important;
			font-family: "微软雅黑";
		}
		input{
			color: rgb(169, 169, 169) !important;
		}
		thead{
			background: #eee;
		}
		.fc-header tr{
			height:30px;
		}
		.fc table{
			margin-bottom: -5px;
		}
		.fc-header-title h2 {
			margin-top: 0;
			white-space: nowrap;
			font-weight:500;
		}
		thead tr th{
			font-weight:500;
		}
		.fc-day-number{
			font-weight:300;
		}
		.layui-layer-title {
			padding: 0 80px 0 20px;
			height: 42px;
			line-height: 42px;
			border-bottom: 1px solid #eee;
			font-size: 16px;
			color: #fff;
			overflow: hidden;
			background-color: #2b7fe0;
			border-radius: 2px 2px 0 0;
		}
		input {
			-webkit-appearance: textfield;
			background-color: white;
			-webkit-rtl-ordering: logical;
			user-select: text;
			cursor: auto;
			padding: 1px;
			border-width: 1px !important;
			border-style: inset;
			border-color: initial;
			border-image: initial;
			color:black !important;
			font-family:"微软雅黑";
		}
		input, textarea, select, button {
			text-rendering: auto;
			color: initial;
			letter-spacing: normal;
			word-spacing: normal;
			text-transform: none;
			text-indent: 0px;
			text-shadow: none;
			display: inline-block;
			text-align: start;
			margin: 0em 0em 0em 0em;
			font-family:"微软雅黑";
			color: black !important;
		}
		input, textarea, select, button, meter, progress {
			-webkit-writing-mode: horizontal-tb;
		}
		.CAL_LEVEL{
			height:29px;
		}
		.layui-layer-page .layui-layer-btn {
			/*text-align: center;*/
		}
		.fc-state-highlight{
			background-color:#beddff !important;
		}
		input[placeholder], [placeholder], *[placeholder] {
			color:black !important;
		}
		:-moz-placeholder { /* Mozilla Firefox 4 to 18 */
			color: #000; opacity:1;
		}

		::-moz-placeholder { /* Mozilla Firefox 19+ */
			color: #000;opacity:1;
		}

		input:-ms-input-placeholder{
			color: #000;opacity:1;
		}

		input::-webkit-input-placeholder{
			color: #000;opacity:1;
		}
		:-moz-placeholder { /* Mozilla Firefox 4 to 18 */
			color: #000; opacity:1;
		}

		::-moz-placeholder { /* Mozilla Firefox 19+ */
			color: #000;opacity:1;
		}

		textarea:-ms-input-placeholder{
			color: #000;opacity:1;
		}

		textarea::-webkit-input-placeholder{
			color: #000;opacity:1;
		}
		.style_a{
			margin-left:5px;
			margin-bottom:5px;
		}
		.title{
			padding-left: 27px;
			height: 45px;
			line-height: 50px;
			border-bottom: 1px solid #ccc;
			font-size: 22px;
			color: rgb(73, 77, 89);
			font-family: "微软雅黑";
		}

		.fc table{
			margin-bottom:0px;
		}

		.colorClass a{
			display: inline-block;
			width:16px;
			height:16px;
            vertical-align:middle;
		}
		.colorClass{
			position: absolute;
			right:27px;
			top:13px;
		}
		.select select{
			height:30px;
			border-radius:3px;
		}
		.control-group a{
			text-decoration: none;
			color: #1772c0;
		}
	</style>
</head>
<body>

<div class="container">
	<div class="title" style=" background: #fff;">
		<img src="/img/commonTheme/${sessionScope.InterfaceModel}/dayQuery.png" alt="" style="vertical-align: middle">
		<div style='height: 45px;display:inline-block;line-height: 50px;border-bottom: 1px solid #ccc;font-size: 22px;color: rgb(73, 77, 89);font-family: "微软雅黑";'><fmt:message code="main.schedulequery"/></div>
		<%--<button id="" style="margin-left:40px;margin-right:20px;">今天</button>--%>

	</div>
	<div class="select" style=" background: #fff;">
		<select class="" id="selectYear" style="margin-left:20px;width:96px;" onchange="query()">
			<option id="" value="2010">2010年</option>
			<option id="" value="2011">2011年</option>
			<option id="" value="2012">2012年</option>
			<option id="" value="2013">2013年</option>
			<option id="" value="2014">2014年</option>
			<option id="" value="2015">2015年</option>
			<option id="" value="2016">2016年</option>
			<option id="" value="2017">2017年</option>
			<option id="" value="2018">2018年</option>
			<option id="" value="2019">2019年</option>
			<option id="" value="2020">2020年</option>
		</select>
		<select class="" id="selectWeek" style="height: 23px;line-height: 0px;margin-left: 20px; display:none;">
			<option id="" value="1">第1周</option>
			<option id="" value="2">第2周</option>
			<option id="" value="3">第3周</option>
			<option id="" value="4">第4周</option>
			<option id="" value="5">第5周</option>
			<option id="" value="6">第6周</option>
			<option id="" value="7">第7周</option>
			<option id="" value="8">第8周</option>
			<option id="" value="9">第9周</option>
			<option id="" value="10">第10周</option>
			<option id="" value="11">第11周</option>
			<option id="" value="12">第12周</option>
			<option id="" value="13">第13周</option>
			<option id="" value="14">第14周</option>
			<option id="" value="15">第15周</option>
			<option id="" value="16">第16周</option>
			<option id="" value="17">第17周</option>
			<option id="" value="18">第18周</option>
			<option id="" value="19">第19周</option>
			<option id="" value="20">第20周</option>
			<option id="" value="21">第21周</option>
			<option id="" value="22">第22周</option>
			<option id="" value="23">第23周</option>
			<option id="" value="24">第24周</option>
			<option id="" value="25">第25周</option>
			<option id="" value="26">第26周</option>
			<option id="" value="27">第27周</option>
			<option id="" value="28">第28周</option>
			<option id="" value="29">第29周</option>
			<option id="" value="30">第30周</option>
			<option id="" value="31">第31周</option>
			<option id="" value="32">第32周</option>
			<option id="" value="33">第33周</option>
			<option id="" value="34">第34周</option>
			<option id="" value="35">第35周</option>
			<option id="" value="36">第36周</option>
			<option id="" value="37">第37周</option>
			<option id="" value="38">第38周</option>
			<option id="" value="39">第39周</option>
			<option id="" value="40">第40周</option>
			<option id="" value="41">第41周</option>
			<option id="" value="42">第42周</option>
			<option id="" value="43">第43周</option>
			<option id="" value="44">第44周</option>
			<option id="" value="45">第45周</option>
			<option id="" value="46">第46周</option>
			<option id="" value="47">第47周</option>
			<option id="" value="48">第48周</option>
			<option id="" value="49">第49周</option>
			<option id="" value="50">第50周</option>
			<option id="" value="51">第51周</option>
			<option id="" value="52">第52周</option>
			<option id="" value="53">第53周</option>
		</select>
		<select class="" id="selectMonth" style="width:64px;" onchange="query()">
			<option id="" value="1">1月</option>
			<option id="" value="2">2月</option>
			<option id="" value="3">3月</option>
			<option id="" value="4">4月</option>
			<option id="" value="5">5月</option>
			<option id="" value="6">6月</option>
			<option id="" value="7">7月</option>
			<option id="" value="8">8月</option>
			<option id="" value="9">9月</option>
			<option id="" value="10">10月</option>
			<option id="" value="11">11月</option>
			<option id="" value="12">12月</option>
		</select>
		<select class="" id="selectDay" style="display:none;">
		</select>
		<!--<button type="button" onclick="" class="btn btn-primary" style="float:right;">查询</button>-->

<%--
		<button type="button" onclick="" class="btn btn-primary"  id="tjreasch" style="margin-left:16px;"><fmt:message code="global.lang.query"/></button>
--%>

		<select  name="DEPT_ID" id="dept_id"  style="width:130px;height: 30px;margin-left: 20px;margin-top:17px;">
		</select>
		<select name="USER_ID" id="selUser_id" style="width:130px;height: 30px;margin-right: 16px;margin-top:17px;" onchange="query()">
			<option value='admin'><fmt:message code="email.th.systemmanager"/></option>
		</select>
<%--
		<button type="button" onclick="" class="btn btn-primary" style="margin-top:17px;" id="deptreasch"><fmt:message code="attend.lang.deptquery"/></button>
--%>
	</div>
	<div class="content">
		<div class="colorClass">

				<a href="javascript:;" style="background-color: rgb(255, 87, 87);"></a>
				<span><fmt:message code="attend.th.Importanturgent"/></span><%--重要/紧急--%>
				<a href="javascript:;" style="background-color: rgb(255, 149, 64);"></a>
				<span><fmt:message code="attend.th.ImportantNourgent"/></span><%--重要/不紧急--%>


				<a href="javascript:;" style="background-color: rgb(206, 132, 206);"></a>
				<span><fmt:message code="attend.th.NOImportanturgent"/></span><%--不重要/紧急--%>
				<a href="javascript:;" style="background-color: rgb(69, 162, 255);"></a>
				<span><fmt:message code="attend.th.NOImportantNOurgent"/></span><%--不重要/不紧急--%>

		</div>
		<div class="row-fluid">
			<div class="span12">
				<div class="box">
					<div class="box-content box-nomargin">
						<div class="calendar" id="calendar"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
    var arr=[];
    var searchArr=[];
    var date = new Date();
    var d = date.getDate();
    var m = date.getMonth();
    var y = date.getFullYear();
    var timestamp = Date.parse(new Date());
    var timestamp = timestamp / 1000;
	//使下拉列表显示当前日期
   var yearArray= $("#selectYear option")
   for(var i=0;i<yearArray.length;i++){
       if(yearArray[i].value==y){
           $($("#selectYear  option")[i]).attr("selected",true)
	   }
   }
    var monthArray= $("#selectMonth option")
    for(var i=0;i<monthArray.length;i++) {
        if (monthArray[i].value == m + 1) {
            $($("#selectMonth  option")[i]).attr("selected", true)
        }
    }

    //初始化下拉列表日
    function initselDay(){//获取本月的天数
        var month = parseInt(m+1, 10);
        var d= new Date(y, month, 0);
        var monthArray= $("#selectDay option");
        var dayOpt;
        for(var i=0;i<d.getDate();i++) {
           dayOpt +='<option value='+(i+1)+'>'+(i+1)+"<fmt:message code="attend.th.day"/>"+'</option>';
        }
        $("#selectDay").html(dayOpt);
    }
    //获取当前日期是本年度的第几周
    Date.prototype.getWeekOfYear = function(weekStart) { // weekStart：每周开始于周几：周日：0，周一：1，周二：2 ...，默认为周日
        weekStart = (weekStart || 0) - 0;
        if(isNaN(weekStart) || weekStart > 6)
            weekStart = 0;

        var year = this.getFullYear();
        var firstDay = new Date(year, 0, 1);
        var firstWeekDays = 7 - firstDay.getDay() + weekStart;
        var dayOfYear = (((new Date(year, this.getMonth(), this.getDate())) - firstDay) / (24 * 3600 * 1000)) + 1;
        return Math.ceil((dayOfYear - firstWeekDays) / 7) + 1;
    }
    var date = new Date(); // 注意：JS 中月的取值范围为 0~11
    var weekOfYear = date.getWeekOfYear(); // 当前日期是本年度第几周


    //判断是否是闰年
    function isLeapYear(year){
        return (0==year%4&&((year%100!=0)||(year%400==0)));
    }
    $(document).ready(function(){
        //alert("加载开始1");
        var timestamp = Date.parse(new Date());
        var timestamp = timestamp / 1000;

        $.ajax({
            url:"../../schedule/getAllSchedule",
            type:"get",
            dataType:"json",
            success:function (data){
                //alert("请求成功");
                var arrObject;
                for(var i=0;i<data.obj.length;i++){
                    if(data.obj[i].calLevel==1){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ff5757",
                            backgroundColor:"#ff5757"
                        };
                    }else if(data.obj[i].calLevel==2){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ff9540",
                            backgroundColor:"#ff9540"
                        };
                    }else if(data.obj[i].calLevel==3){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ce84ce",
                            backgroundColor:"#ce84ce"
                        };
                    }else if(data.obj[i].calLevel==4){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#45a2ff",
                            backgroundColor:"#45a2ff"
                        };
                    }


                    arr.push(arrObject);
                }
                if($('#calendar').length > 0){
                    var timestamp = Date.parse(new Date());
                    var timer=parseInt(timestamp)+3600000;
                    var startTime=new Date(timestamp).Format('hh:mm:ss');
                    var endTime=new Date(timer).Format('hh:mm:ss');
                    $('#calendar').fullCalendar({
                        header: {
                            left: 'prev,next,today',
                            center: 'title',
                            right: 'month,agendaWeek,agendaDay'
                        },
                        buttonText:{
                            today:'<fmt:message code="meet.th.JumpthDay"/>'
                        },
                        editable: true,
                        events:arr,
                        dayClick: function (date, allDay, jsEvent, view) {
                            
                        },
                        eventClick:function (calEvent, jsEvent, view){
                            var content=calEvent.title;
                            //var calTime=getLocalTime(parseInt(calEvent.start,10));
                            //var endTime=getLocalTime(parseInt(calEvent.end,10));
                            var starttime=(calEvent.start)/1000;
                            var endtime=(calEvent.end)/1000;
                            //console.log(calEvent.start);
                            //console.log(calEvent.end);
                            var calTime=calEvent.start._i
                            //console.log(calEvent.start)
                            var endTime=calEvent.end._i
                            var cal_level=calEvent.calLevel;
                            var cal_type=calEvent.calType;
                            var ownerName=calEvent.ownerName;
                            var takeName=calEvent.takeName;
                            var takeIds=calEvent.takeIds;
                            var ownerIds=calEvent.ownerIds;
                            var type_map=["<fmt:message code="attend.th.Worktransaction"/>","<fmt:message code="attend.th.Persontransaction"/>"];
                            var level_map=["<fmt:message code="attend.th.Importanturgent"/>","<fmt:message code="attend.th.ImportantNourgent"/>","<fmt:message code="attend.th.NOImportanturgent"/>","<fmt:message code="attend.th.NOImportantNOurgent"/>"];
                            var cal_type_str=type_map[cal_type-1];
                            var cal_type_str2;
                            if(cal_type==1){
                                cal_type_str2=type_map[1];
                                cal_type2=2;
                            }else{
                                cal_type_str2=type_map[0];
                                cal_type2=1;
                            }
                            //var cal_type_str2=
                            var cal_level_str=level_map[cal_level-1];
                            //$("#CAL_TYPE").val(cal_type_str);
                            //$("#CAL_LEVEL").val(cal_level_str);
                            layer.open({
                                type: 1,
								/* skin: 'layui-layer-rim', //加上边框 */
                                offset: '80px',
                                area: ['600px', '500px'], //宽高
                                title:"<fmt:message code="attend.th.Scheduleedit"/>",
                                closeBtn: 2,
                                content: '<div id="myModal" class="modal hide in">' +
								'<div class="modal-header"></div>' +
								'<div class="modal-body" id="new_modal" style="max-height:300px;">' +
								'<div class="control-group"><label><fmt:message code="attend.th.Contentofthings"/>:' +
								'<textarea style="height: auto;resize : none;vertical-align: middle;" name="CAL_CONTENT" id="CAL_CONTENT" placeholder="<fmt:message code="notice.th.content"/>" class="input input-xl CAL_CONTENT text_boder test_null" ></textarea>' +
								'</label><span style="color:red;font-size:25px ">*</span></div>' +
								'<div class="control-group"><label><fmt:message code="attend.th.Typesofthings"/>:' +
								'<select class="smallSelect text_boder" name="CAL_TYPE text_boder" id="CAL_TYPE" style="height: 29px;width: 279px;">' +
								'<option value="1"><fmt:message code="attend.th.Worktransaction"/></option><!--<option value="2" disabled="disabled"><fmt:message code="attend.th.Persontransaction"/><fmt:message code="global.lang.save"/></option>--></select></label><span style="color:red;font-size:25px ">*</span></div>' +
								'<div class="control-group" style=" clear:both"><span><fmt:message code="sup.th.startTime"/>:</span>' +
								'<input name="START_DATE" id="START_DATE" class="text_boder test_null" placeholder="<fmt:message code="attend.th.startDate"/>" type="text" value="'+calTime+'" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})">' +
								'<span style="color:red;font-size:25px ">*</span></div><div class="control-group" id="endtimeArea1" style=""><span><fmt:message code="meet.th.EndTime"/>:</span>' +
								'<input name="EDN_DATE" id="EDN_DATE" class="text_boder test_null" placeholder="结束日期"<fmt:message code="attend.th.NOImportantNOurgent"/>" type="text" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" value="'+endTime+'">' +
								'<span style="color:red;font-size:25px ">*</span></div>' +
								'<div class="control-group" style="margin-left: 60px;"><span><fmt:message code="attend.th.Participant"/>:</span><textarea name="TAKER_NAME1" id="TAKER_NAME1" rows="2" class="BigStatic" wrap="yes" readonly="" style="margin-left: 70px;width: 273px;border-radius:4px;vertical-align: middle;"></textarea><a href="javascript:;" id="takerOrgAdd1" onclick="" class="style_a"><fmt:message code="global.lang.add"/></a><a href="javascript:;" id="takerOrgClear1" onclick="clearTakerName();" class="style_a"><fmt:message code="global.lang.empty"/></a></div><div class="control-group" style="margin-left: 60px;"><span><fmt:message code="attend.th.Subordinate"/>:</span><textarea cols="35" name="OWNER_NAME1" id="OWNER_NAME1" rows="2" class="BigStatic" wrap="yes" readonly="" style=" margin-left: 70px; width: 273px;border-radius:4px;vertical-align: middle;"></textarea><a href="javascript:;" id="ownerOrgAdd1" onclick="" class="style_a"><fmt:message code="global.lang.add"/></a><a href="javascript:;" id="ownerOrgClear1" onclick="clearOwnerName();" class="style_a"><fmt:message code="global.lang.empty"/></a></div>'+
								'<div class="control-group" style="margin-left:-22px"><span><fmt:message code="attend.th.Eventlevel"/>:</span>' +
								'<select id="CAL_LEVEL" class="CAL_LEVEL text_boder" style="height: 29px;width: 279px;">' +
                                '<option value="1"><fmt:message code="attend.th.Importanturgent"/></option>' +
                                '<option value="2"><fmt:message code="attend.th.ImportantNourgent"/></option>' +
                                '<option value="3"><fmt:message code="attend.th.NOImportanturgent"/></option>' +
                                '<option value="4"><fmt:message code="attend.th.NOImportantNOurgent"/></option>' +
								'</select></div>' +
								'</div><div class="modal-footer"></div></div>',
                                btn:['<fmt:message code="global.lang.save"/>','<fmt:message code="global.lang.close"/>','<fmt:message code="global.lang.delete"/>'],
                                success:function(layero, index){
                                    //var cal_type_str=type_map[cal_type-1];
                                    //var cal_level_str=level_map[cal_level-1];
                                    $("#CAL_CONTENT").val(content);

									var calTypeArray= $("#CAL_TYPE option")
                                    for(var i=0;i<calTypeArray.length;i++) {
                                        if (calTypeArray[i].value == cal_type) {
                                            $($("#CAL_TYPE  option")[i]).attr("selected", true)
                                        }
                                    }

                                    var calLevelArray= $("#CAL_LEVEL option")
                                    for(var i=0;i<calLevelArray.length;i++) {
                                        if (calLevelArray[i].value == cal_level) {
                                            $($("#CAL_LEVEL  option")[i]).attr("selected", true)
                                        }
                                    }
                                    $("#TAKER_NAME1").val(takeName);
                                    $("#OWNER_NAME1").val(ownerName);
                                    $("#TAKER_NAME1").attr("user_id",takeIds);
                                    $("#OWNER_NAME1").attr("user_id",ownerIds);
                                    $("#takerOrgAdd1").on("click",function(){
                                        user_id='TAKER_NAME1';
                                        $.popWindow("../common/selectUser");
                                    });
                                    $("#ownerOrgAdd1").on("click",function(){
                                        user_id='OWNER_NAME1';
                                        $.popWindow("../common/selectUser");
                                    });
                                    $("#takerOrgClear1").on("click",function(){
                                        $("#TAKER_NAME1").val("");
                                        $("#TAKER_NAME1").attr('user_id','');
                                    })
                                    $("#ownerOrgClear1").on("click",function(){
                                        $("#OWNER_NAME1").val("");
                                        $("#OWNER_NAME1").attr('user_id','');
                                    })
                                },
                                //编辑日程接口
                                yes: function(index, layero){
                                    var array=$(".test_null");
                                    for(var i=0;i<array.length;i++){
                                        if(array[i].value==""){
                                            /*layer.tips("不能为空",".test_null", {
                                                area: ['100px', '30px']
                                            });*/
                                            $.layerMsg({content:"<fmt:message code="meet.th.AnAsterisk"/>",icon:3},function(){
                                            });
                                            return;
                                        }
                                    }
                                    //按钮【按钮三】的回调
									/*alert($('.name_biaodan').val());*/
                                    //var url='';
                                    var calTime=new Date(Date.parse($("#START_DATE").val().replace(/-/g, "/"))).getTime()/1000;
                                    var endTime=new Date(Date.parse($("#EDN_DATE").val().replace(/-/g, "/"))).getTime()/1000;
                                    var calLevel=$("#CAL_LEVEL").val();
                                    var calType=$("#CAL_TYPE").val();
                                    var content=$("#CAL_CONTENT").val();
                                    var calId=calEvent.id;
                                    var takerOrgAdd = $("#TAKER_NAME1").attr("user_id");
                                    var ownerOrgAdd = $("#OWNER_NAME1").attr("user_id");
                                    var datass={
                                        calId:calId,
                                        calType:calType,
                                        content:content,
                                        calTime:calTime,
                                        endTime:endTime,
                                        userId:$.cookie('userId'),
                                        calLevel:calLevel,
										owner:ownerOrgAdd,
                                        taker:takerOrgAdd
                                    };
                                    console.log(datass);
                                    $.ajax({
                                        url:"/schedule/editCalender",
                                        type:"post",
                                        data:datass,
                                        dataType:"json",
                                        success:function (){
                                            location.reload();

                                        }

                                    })

                                    //var layerIndex = layer.load(0, {shade: false});
                                    //layer.closeAll();

                                },
                                //删除日程接口
                                btn3:function(){
                                    /*if(confirm("你确定要删除吗？")){*/
                                    $.layerConfirm({title:'<fmt:message code="workflow.th.suredel"/>',content:'<fmt:message code="workflow.th.que"/>？',icon:0},function(){
                                        //console.log();
                                        //var url='';
                                        var data={
                                            calId:calEvent.id,
                                        };
                                        $.ajax({
                                            url:"../../schedule/delete",
                                            type:"get",
                                            data:data,
                                            dataType:"json",
                                            success:function (){
                                                location.reload();
                                            }
                                        })
                                   /* }else{
                                        return false;*/
                                    })
                                    //console.log(calEvent.id);
                                }
                            });
                            //console.log("success");
                            //layer.closeAll();
                        },
                    });
                }
                //月视图查询切换
                $(".fc-button-month").click(function(){
                    //alert("11111");
                    $("#selectMonth").show();
                    $("#selectDay").hide();
                    $("#selectWeek").hide();
                });
                //周视图查询切换
                $(".fc-button-agendaWeek").click(function(){
                    //alert("22222");
                    $("#selectMonth").hide();
                    $("#selectDay").hide();
                    $("#selectWeek").show();
                    var weekArray= $("#selectWeek option")
                    for(var i=0;i<weekArray.length;i++) {
                        if (weekArray[i].value == weekOfYear) {
                            $($("#selectWeek  option")[i]).attr("selected", true)
                        }
                    }
                });
                //日视图查询切换
                $(".fc-button-agendaDay").click(function(){
                    //alert("33333");
                    $("#selectMonth").show();
                    $("#selectDay").show();
                    initselDay();
                    $("#selectWeek").hide();
                    var dayArray= $("#selectDay option")
                    for(var i=0;i<dayArray.length;i++) {
                        if (dayArray[i].value == d) {
                            $($("#selectDay  option")[i]).attr("selected", true)
                        }
                    }
                });
            }
        });
       //设置新建时的人员反显(将下拉列表中的人员进行反显)

    });



    //日期下拉菜单显示
    $("#selectMonth").change(function(){
        var str='';
        var monthnum=$("#selectMonth option:selected").attr("value");
        var yearnum=$("#selectYear option:selected").attr("value");
        //var option;
        if(monthnum==1||monthnum==3||monthnum==5||monthnum==7||monthnum==8||monthnum==10||monthnum==12){
            for(var d=1;d<32;d++){
                //var option = document.createElement("option");
                //var str='';
                str=str+'<option value="'+d+'">'+d+'<fmt:message code="attend.th.day"/></option>';
                //option.value = d;
                //option.innerHTML = d;
                //console.log(option[d].value);
            }
            //console.log(option.value);
        }else if(monthnum==4||monthnum==6||monthnum==9||monthnum==11){
            for(var d=1;d<31;d++){
                //var option = document.createElement("option");
                //option.value = d;
                //option.innerHTML = d;
                //var str='';
                str=str+'<option value="'+d+'">'+d+'<fmt:message code="attend.th.day"/></option>';
                //console.log(option[d].value);
            }
            //console.log(option.value);
        }else if(monthnum==2){
            if(!isLeapYear(yearnum)){
                for(var d=1;d<29;d++){
                    //var option = document.createElement("option");
                    //option.value = d;
                    //option.innerHTML = d;
                    //console.log(option[d].value);
                    //var str='';
                    str=str+'<option value="'+d+'">'+d+'<fmt:message code="attend.th.day"/></option>';
                }
                //console.log(option.value);
            }else{
                for(var d=1;d<30;d++){
                    //var option = document.createElement("option");
                    //option.value = d;
                    //option.innerHTML = d;
                    //var str='';
                    str=str+'<option value="'+d+'">'+d+'<fmt:message code="attend.th.day"/></option>';
                    //console.log(option[d].value);
                }
                //console.log(option.value);
            }
        }
        //console.log(option.value);
        $("#selectDay").html(str);
//        query();
    });
    //}
    //})
    //获取根据周数获取开始时间
    var weekGetTime = function(year, index) {
        var d = new Date(year, 0, 1);
        while (d.getDay() != 1) {
            d.setDate(d.getDate() + 1);
        }
        var to = new Date(year + 1, 0, 1);
        var i = 1;
        var arr = [];
        for (var from = d; from < to;) {
            if (i == index) {
                arr.push(from.getFullYear() + "-" + (from.getMonth() + 1) + "-" + from.getDate());
            }
            var j = 6;
            while (j > 0) {
                from.setDate(from.getDate() + 1);
                if (i == index) {
                    arr.push(from.getFullYear() + "-" + (from.getMonth() + 1) + "-" + from.getDate());
                }
                j--;
            }
            if (i == index) {
                return arr;
            }
            from.setDate(from.getDate() + 1);
            i++;
        }
    }
    //根据月份获取日期
    function monthGetDay(month){
        var month_day;
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            var month_day=31;
        }else if(month==4||month==6||month==9||month==11){
            var month_day=31;
        }else if(month==4){
            if(!isLeapYear(yearnum)){
                var month_day=28;
            }else{
                var month_day=29;
            }
        }
        return month_day;
    }
    //
  /*  $("#tjreasch").click(function(){
        var search_year=$("#selectYear").val();
        var search_year_num=parseInt($("#selectYear").val());
        var search_month=$("#selectMonth").val();
        var search_month_num=parseInt($("#selectMonth").val());
        var search_day=$("#selectDay").val();
        var search_day_num=parseInt($("#selectDay").val());
        var search_week=$("#selectWeek").val();
        //var search_week=$("#selectWeek").attr("value");
        var day_str=search_year+'-'+search_month+'-'+search_day;
        var month_day=monthGetDay(search_month);
        var dateArr1=day_str.split("-");
        var choicedWeek=weekGetTime(search_year,search_week);
        var choicedWeekS=choicedWeek[0];
        var choicedWeekE=choicedWeek[6];
        var dateArr2=choicedWeekS.split("-");
        var dateArr3=choicedWeekE.split("-");
        var num=1;
        var search_month_h=(search_month_num).toString();//setDate(dateArr1[1])+1);
        var search_day_h=(search_day_num).toString();
        var search_week_h=(parseInt(dateArr2[1])).toString();
        if($('#selectMonth').css('display')=='inline-block'&&$('#selectDay').css('display')=='none'){
            if(search_month_num==12){
                var datas={
                    calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,1))/1000,
                    endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,month_day))/1000,
                };
                var search_month_h=(search_month_num).toString();
                //var timeHandle=search_year+'-'+search_month_h+'-1';
                var timeHandle = search_year + '-' + search_month_h + '-01';
            }else{
                var datas={
                    calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,1))/1000,
                    endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,month_day))/1000,
                };
                var search_month_h=(search_month_num).toString();
                if(search_month_h==1||search_month_h==2||search_month_h==3||search_month_h==4||search_month_h==5||search_month_h==6||search_month_h==7||search_month_h==8||search_month_h==9) {
                    var timeHandle = search_year + '-0' + search_month_h + '-01';
                }else{
                    var timeHandle = search_year + '-' + search_month_h + '-01';
                }
            }
        }else if($('#selectMonth').css('display')=='inline-block'&&$('#selectDay').css('display')=='inline-block'){
            if(search_month_num<10){
                var search_day_h=parseInt($("#selectDay").val());
                var datas={
                    calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,dateArr1[2]))/1000,
                    endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,parseInt(dateArr1[2])+1))/1000,
                };
                if(search_day_h<10){
                    var timeHandle=search_year+'-0'+search_month+'-0'+search_day_h;
                }else if(search_day_h>10){
                    var timeHandle=search_year+'-0'+search_month+'-'+search_day_h;
                }
            }else if(search_month_num>=10){
                var search_day_h=parseInt($("#selectDay").val());
                if(search_day_h<10){
                    var timeHandle=search_year+'-'+search_month+'-0'+search_day_h;
                }else if(search_day_h>10){
                    var timeHandle=search_year+'-'+search_month+'-'+search_day_h;
                }
            }
        }else if($('#selectWeek').css('display')=='inline-block'){
            var datas={
                calTime:Date.parse(new Date(dateArr2[0],parseInt(dateArr2[1])-1,dateArr2[2]))/1000,
            }
            var timeHandle=dateArr2[0]+'-'+search_week_h+'-'+dateArr2[2];
        }

        $('#calendar').fullCalendar( 'removeEventSource', arr);
        $.ajax({
            url:"../../schedule/getAllScheduleByDeptIdAndDate",
            type:"post",
            dataType:"json",
            data:datas,
            success:function(data){
                //alert("请求成功");
				arr=[];

                for(var i=0;i<data.obj.length;i++){
                    if(data.obj[i].calLevel==1){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ff5757",
                            backgroundColor:"#ff5757"
                        };
                    }else if(data.obj[i].calLevel==2){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ff9540",
                            backgroundColor:"#ff9540"
                        };
                    }else if(data.obj[i].calLevel==3){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ce84ce",
                            backgroundColor:"#ce84ce"
                        };
                    }else if(data.obj[i].calLevel==4){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#45a2ff",
                            backgroundColor:"#45a2ff"
                        };
                    }
                    arr.push(arrObject);


                }

//                $('#calendar').fullCalendar('refetchEvents',arr);

                if($('#calendar').length > 0){
                    $('#calendar').fullCalendar('gotoDate',timeHandle);
                    $('#calendar').fullCalendar( 'addEventSource', arr);
                }
            }
        })
    });
    //部门查询接口调用
    $("#deptreasch").click(function(){
        var arr_reasch=[];
        var search_year=$("#selectYear").val();
        var search_year_num=parseInt($("#selectYear").val());
        var search_month=$("#selectMonth").val();
        var search_month_num=parseInt($("#selectMonth").val());
        var search_day=$("#selectDay").val();
        var search_day_num=parseInt($("#selectDay").val());
        var search_week=$("#selectWeek").val();
        //var search_week=$("#selectWeek").attr("value");
        var day_str=search_year+'-'+search_month+'-'+search_day;
        var month_day=monthGetDay(search_month);
        var dateArr1=day_str.split("-");
        var choicedWeek=weekGetTime(search_year,search_week);
        var choicedWeekS=choicedWeek[0];
        var choicedWeekE=choicedWeek[6];
        var dateArr2=choicedWeekS.split("-");
        var dateArr3=choicedWeekE.split("-");
        var num=1;
        var search_month_h=(search_month_num).toString();//setDate(dateArr1[1])+1);
        var search_day_h=(search_day_num).toString();
        var search_week_h=(parseInt(dateArr2[1])).toString();
        var deptId=$("#dept_id").val();
        if($("#selUser_id").val()=='admin'){
             deptId=0
		}

        if($('#selectMonth').css('display')=='inline-block'&&$('#selectDay').css('display')=='none'){
            if(search_month_num==12){
                var datas={
                    calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,1))/1000,
                    endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,month_day))/1000,
                    deptId:deptId,
                    userId:$("#selUser_id").val()
                };
                var search_month_h=(search_month_num).toString();
                //var timeHandle=search_year+'-'+search_month_h+'-1';
                var timeHandle = search_year + '-' + search_month_h + '-01';
            }else{
                var datas={
                    calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,1))/1000,
                    endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,month_day))/1000,
                    deptId:deptId,
                    userId:$("#selUser_id").val()
                };
                var search_month_h=(search_month_num).toString();
                if(search_month_h==1||search_month_h==2||search_month_h==3||search_month_h==4||search_month_h==5||search_month_h==6||search_month_h==7||search_month_h==8||search_month_h==9) {
                    var timeHandle = search_year + '-0' + search_month_h + '-01';
                }else{
                    var timeHandle = search_year + '-' + search_month_h + '-01';
                }
            }

        }else if($('#selectMonth').css('display')=='inline-block'&&$('#selectDay').css('display')=='inline-block'){
            if(search_month_num<10){
                var search_day_h=parseInt($("#selectDay").val());
                var datas={
                    calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,dateArr1[2]))/1000,
                    endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,parseInt(dateArr1[2])+1))/1000,
                    deptId:deptId,
                    userId:$("#selUser_id").val()
                };
                if(search_day_h<10){
                    var timeHandle=search_year+'-0'+search_month+'-0'+search_day_h;
                }else if(search_day_h>10){
                    var timeHandle=search_year+'-0'+search_month+'-'+search_day_h;
                }
            }else if(search_month_num>=10){
                var search_day_h=parseInt($("#selectDay").val());
                if(search_day_h<10){
                    var timeHandle=search_year+'-'+search_month+'-0'+search_day_h;
                }else if(search_day_h>10){
                    var timeHandle=search_year+'-'+search_month+'-'+search_day_h;
                }
            }
        }else if($('#selectWeek').css('display')=='inline-block'){
            var datas={
                calTime:Date.parse(new Date(dateArr2[0],parseInt(dateArr2[1])-1,dateArr2[2]))/1000,
                deptId:deptId,
                userId:$("#selUser_id").val()
            }
            var timeHandle=dateArr2[0]+'-'+search_week_h+'-'+dateArr2[2];

        }



        $('#calendar').fullCalendar( 'removeEventSource', arr);
        $.ajax({
            url:"/schedule/getAllScheduleByDeptIdAndDate",
            type:"post",
            dataType:"json",
            data:datas,
            success:function(data){
                arr=[];
                for(var i=0;i<data.obj.length;i++){
                    if(data.obj[i].calLevel==1){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ff5757",
                            backgroundColor:"#ff5757"
                        };
                    }else if(data.obj[i].calLevel==2){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ff9540",
                            backgroundColor:"#ff9540"
                        };
                    }else if(data.obj[i].calLevel==3){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#ce84ce",
                            backgroundColor:"#ce84ce"
                        };
                    }else if(data.obj[i].calLevel==4){
                        var arrObject = {
                            title: data.obj[i].content,
                            start: data.obj[i].stim,
                            end: data.obj[i].etim,
                            id:data.obj[i].calId,
                            calLevel:data.obj[i].calLevel,
                            calType:data.obj[i].calType,
                            takeIds:data.obj[i].taker,
                            takeName:data.obj[i].takeName,
                            ownerIds:data.obj[i].owner,
                            ownerName:data.obj[i].ownerName,
                            color:"#45a2ff",
                            backgroundColor:"#45a2ff"
                        };
                    }
                   /!* searchArr.push(arrObject);*!/
                    arr.push(arrObject);
                }


                if($('#calendar').length > 0){
                    $('#calendar').fullCalendar('gotoDate',timeHandle);
                    $('#calendar').fullCalendar( 'addEventSource', arr);
                }
//                callback(arr);
                }

        });
    });*/

  function query(){
      arr.splice(0,arr.length);//清空数组
      var search_year=$("#selectYear").val();
      var search_year_num=parseInt($("#selectYear").val());
      var search_month=$("#selectMonth").val();
      var search_month_num=parseInt($("#selectMonth").val());
      var search_day=$("#selectDay").val();
      var search_day_num=parseInt($("#selectDay").val());
      var search_week=$("#selectWeek").val();
      //var search_week=$("#selectWeek").attr("value");
      var day_str=search_year+'-'+search_month+'-'+search_day;
      var month_day=monthGetDay(search_month);
      var dateArr1=day_str.split("-");
      var choicedWeek=weekGetTime(search_year,search_week);
      var choicedWeekS=choicedWeek[0];
      var choicedWeekE=choicedWeek[6];
      var dateArr2=choicedWeekS.split("-");
      var dateArr3=choicedWeekE.split("-");
      var num=1;
      var search_month_h=(search_month_num).toString();//setDate(dateArr1[1])+1);
      var search_day_h=(search_day_num).toString();
      var search_week_h=(parseInt(dateArr2[1])).toString();
      var deptId=$("#dept_id").val();
      if($("#selUser_id").val()=='admin'){
          deptId=0
      }

      if($('#selectMonth').css('display')=='inline-block'&&$('#selectDay').css('display')=='none'){
          if(search_month_num==12){
              var datas={
                  calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,1))/1000,
                  endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,month_day))/1000,
                  deptId:deptId,
                  userId:$("#selUser_id").val()
              };
              var search_month_h=(search_month_num).toString();
              //var timeHandle=search_year+'-'+search_month_h+'-1';
              var timeHandle = search_year + '-' + search_month_h + '-01';
          }else{
              var datas={
                  calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,1))/1000,
                  endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,month_day))/1000,
                  deptId:deptId,
                  userId:$("#selUser_id").val()
              };
              var search_month_h=(search_month_num).toString();
              if(search_month_h==1||search_month_h==2||search_month_h==3||search_month_h==4||search_month_h==5||search_month_h==6||search_month_h==7||search_month_h==8||search_month_h==9) {
                  var timeHandle = search_year + '-0' + search_month_h + '-01';
              }else{
                  var timeHandle = search_year + '-' + search_month_h + '-01';
              }
          }

      }else if($('#selectMonth').css('display')=='inline-block'&&$('#selectDay').css('display')=='inline-block'){
          if(search_month_num<10){
              var search_day_h=parseInt($("#selectDay").val());
              var datas={
                  calTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,dateArr1[2]))/1000,
                  endTime:Date.parse(new Date(dateArr1[0],parseInt(dateArr1[1])-1,parseInt(dateArr1[2])+1))/1000,
                  deptId:deptId,
                  userId:$("#selUser_id").val()
              };
              if(search_day_h<10){
                  var timeHandle=search_year+'-0'+search_month+'-0'+search_day_h;
              }else if(search_day_h>10){
                  var timeHandle=search_year+'-0'+search_month+'-'+search_day_h;
              }
          }else if(search_month_num>=10){
              var search_day_h=parseInt($("#selectDay").val());
              if(search_day_h<10){
                  var timeHandle=search_year+'-'+search_month+'-0'+search_day_h;
              }else if(search_day_h>10){
                  var timeHandle=search_year+'-'+search_month+'-'+search_day_h;
              }
          }
      }else if($('#selectWeek').css('display')=='inline-block'){
          var datas={
              calTime:Date.parse(new Date(dateArr2[0],parseInt(dateArr2[1])-1,dateArr2[2]))/1000,
              deptId:deptId,
              userId:$("#selUser_id").val()
          }
          var timeHandle=dateArr2[0]+'-'+search_week_h+'-'+dateArr2[2];

      }



      $('#calendar').fullCalendar( 'removeEventSource', arr);
      $.ajax({
          url:"/schedule/getAllScheduleByDeptIdAndDate",
          type:"post",
          dataType:"json",
          data:datas,
          success:function(data){
              arr=[];
              for(var i=0;i<data.obj.length;i++){
                  if(data.obj[i].calLevel==1){
                      var arrObject = {
                          title: data.obj[i].content,
                          start: data.obj[i].stim,
                          end: data.obj[i].etim,
                          id:data.obj[i].calId,
                          calLevel:data.obj[i].calLevel,
                          calType:data.obj[i].calType,
                          takeIds:data.obj[i].taker,
                          takeName:data.obj[i].takeName,
                          ownerIds:data.obj[i].owner,
                          ownerName:data.obj[i].ownerName,
                          color:"#ff5757",
                          backgroundColor:"#ff5757"
                      };
                  }else if(data.obj[i].calLevel==2){
                      var arrObject = {
                          title: data.obj[i].content,
                          start: data.obj[i].stim,
                          end: data.obj[i].etim,
                          id:data.obj[i].calId,
                          calLevel:data.obj[i].calLevel,
                          calType:data.obj[i].calType,
                          takeIds:data.obj[i].taker,
                          takeName:data.obj[i].takeName,
                          ownerIds:data.obj[i].owner,
                          ownerName:data.obj[i].ownerName,
                          color:"#ff9540",
                          backgroundColor:"#ff9540"
                      };
                  }else if(data.obj[i].calLevel==3){
                      var arrObject = {
                          title: data.obj[i].content,
                          start: data.obj[i].stim,
                          end: data.obj[i].etim,
                          id:data.obj[i].calId,
                          calLevel:data.obj[i].calLevel,
                          calType:data.obj[i].calType,
                          takeIds:data.obj[i].taker,
                          takeName:data.obj[i].takeName,
                          ownerIds:data.obj[i].owner,
                          ownerName:data.obj[i].ownerName,
                          color:"#ce84ce",
                          backgroundColor:"#ce84ce"
                      };
                  }else if(data.obj[i].calLevel==4){
                      var arrObject = {
                          title: data.obj[i].content,
                          start: data.obj[i].stim,
                          end: data.obj[i].etim,
                          id:data.obj[i].calId,
                          calLevel:data.obj[i].calLevel,
                          calType:data.obj[i].calType,
                          takeIds:data.obj[i].taker,
                          takeName:data.obj[i].takeName,
                          ownerIds:data.obj[i].owner,
                          ownerName:data.obj[i].ownerName,
                          color:"#45a2ff",
                          backgroundColor:"#45a2ff"
                      };
                  }
				  /* searchArr.push(arrObject);*/
                  arr.push(arrObject);
              }


              if($('#calendar').length > 0){
                  $('#calendar').fullCalendar('gotoDate',timeHandle);
                  $('#calendar').fullCalendar( 'addEventSource', arr);
              }
//                callback(arr);
          }

      });
  }



    //部门获取
    var opt_li_dep='<option value="-1"  class="levelleft0"><fmt:message code="workflow.th.allpart"/></option>';
    departmentAjax(function (departmentData) {
        opt_li_dep=  departmentChild(departmentData,opt_li_dep,0,-1);
        $('#dept_id').html(opt_li_dep);
    });

    //部门遍历方法
    function departmentChild(datas,opt_li,level,dept){
        for(var i=0;i<datas.length;i++){
            var String="";
            var space=""
            for(var j=0;j<level;j++){
                space+="├&nbsp;&nbsp;&nbsp;";
            }
			/* console.log("kongge"+space+"kongge")*/
            if(i==0){
                String=space+"┌";
            }else
            if(i!=0){
                String=space+"├";
            }else
            if(i==datas.length-1){
                String=space+"└";
            }
            if(dept==datas[i].deptId){
                opt_li+='<option value="'+datas[i].deptId+'" selected="selected">'+String+datas[i].deptName+'</option>';
            }else{
                opt_li+='<option value="'+datas[i].deptId+'">'+String+datas[i].deptName+'</option>';
            }
			/* 	console.log(datas[i].childs);*/
            if(datas[i].childs!=null){
                opt_li = departmentChild(datas[i].childs,opt_li,level+1,dept);
            }
        }
        return opt_li;
    }
	//根据部门的变化获取部门下的人员
    $("#dept_id").change(function () {
        var innerText;
        $("#selUser_id").html("<option value='admin'><fmt:message code="email.th.systemmanager"/></option>");
		$.ajax({
			url:'/user/getUsersByDeptId',
			type:'get',
            dataType:"json",
			data:{
                deptId:$('#dept_id').val()
			},
			success:function(data){
                for(var i=0;i<data.obj.length;i++){
                    if(data.obj[i].userId=='admin'){
                        innerText+='';
					}else{
                        innerText+='<option value="'+data.obj[i].userId+'">'+data.obj[i].userName+'</option>';
					}
                }
                $("#selUser_id").append(innerText);
			}
		})
		query();
    })

    //部门遍历接口
    function departmentAjax(callback){
        $.ajax({
            url:'../../department/getAlldept',
            type:'get',
            dataType:'json',
            success:function(obj){
                var data=obj.obj;
                var  departmentData= digui(data,0);
                callback(departmentData);
            }
        });
    }

    function digui(datas,departId) {
        var data=new Array();
        for(var i=0;i<datas.length;i++){
            if(datas[i].deptParent==departId){
                datas[i]["childs"]=digui(datas,datas[i].deptId);
                data.push(datas[i]);
            }
        }
        return data;
    }

    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD hh:mm:ss',
		/* min: laydate.now(), //设定最小日期为当前日期*/
		/* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var end = {
        format: 'YYYY-MM-DD hh:mm:ss',
		/*min: laydate.now(),*/
		/*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
</script>
</body>

</html>
