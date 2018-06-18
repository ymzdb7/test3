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
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/fullcalendar/css/fullcalendar.print.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/FullCalendar/style.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <%--<link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>--%>
    <%--<script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js" ></script>--%>
    <%--<script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>--%>
    <script src="/js/common/language.js"></script>
    <script src="../../lib/fullcalendar/moment.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="../../lib/fullcalendar/fullcalendar.js" type="text/javascript" charset="utf-8"></script>--%>
    <script src="../../lib/fullcalendar/fullcalendar.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/zh-cn.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/fullcalendar/jquery-ui.custom.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../lib/laydate/laydate.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="../../lib/fullcalendar/script.js" type="text/javascript" charset="utf-8"></script>--%>
    <%--<script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>--%>
    <title><fmt:message code="main.schedule"/> </title>
    <style>
        /*行大盒*/
        .control-group{
            margin-top:10px;
            margin-left: 100px;
            height:40px;
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
        /*类型框*/
        .smallSelect{
            /*margin-left: 50px;*/
        }
        /*级别框*/
        .CAL_LEVEL{
            margin-left: 56px;
            height:29px;
        }
        /*内容框*/
        .CAL_CONTENT{
            width:274px;
            margin-left: 50px;
            height: 24px;;
            vertical-align: middle;
        }
        /*.modal-header{*/
            /*margin-left:20px;*/
        /*}*/
        /*前四框*/
        .text_boder{
            /*width:275px;*/
            /*height:26px;*/
            border-radius:3px;
            margin-left: 8px;
            position:relative;
            bottom:0px;
        }
        #START_DATE,#EDN_DATE{
            width:276px;
            height:26px;
        }
        /*#calendar{*/
        /*border-top-color: #3c8dbc;*/
        /*}*/
        html{
            background:#fff;
        }
        body{
            margin:0px;
            positon:relative;
        }
        /*.box{*/
            /*border-top-color: #3c8dbc !important;*/
            /*border-top-width:3px;*/
        /*}*/
        /*.row-fluid {*/
            /*border-top-color: #3c8dbc !important;*/
            /*border-top-width:3px;*/
        /*}*/
        .fc-header{
            background: #fff;
        }
        /*.fc-first .fc-last{*/
        /*background: #eee;*/
        /*}*/
        body {

            font-family: "微软雅黑";
        }
        .container{
            backgrongd:#fff;
        }
        /*.content{*/
            /*!*position: relative;*!*/
            /*margin-top:6px;*/
            /*padding: 24px 20px 100px 20px;*/
        /*}*/
        thead{
            background: #eee;
        }
        .fc-header tr{
            height:30px;
        }
        .fc table{
            margin-bottom: 0px;
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
            color:#333;
            font-family:"微软雅黑";
        }
        input, textarea, select, button {
            text-rendering: auto;
            color: #333;
            letter-spacing: normal;
            word-spacing: normal;
            text-transform: none;
            text-indent: 0px;
            text-shadow: none;
            display: inline-block;
            text-align: start;
            margin: 0em 0em 0em 0em;
            font-family:"微软雅黑";

        }
        input, textarea, select, button, meter, progress {
            -webkit-writing-mode: horizontal-tb;
        }

        .layui-layer-page .layui-layer-btn {
            /*text-align: center;*/
            /*border-top: 1px solid #ccc;*/
        }
        .fc-state-highlight{
            background-color:#beddff !important;
        }


        .style_a{
            margin-left:5px;
            margin-bottom:5px;
            color: #1687cb;
            text-decoration: none;
            font-size: 13px;
        }
        .title{
            /*margin-left: 2%;*/
            padding-left:27px;
            height:45px;
            line-height:50px;
            border-bottom:1px solid #ccc;
            font-size: 22px;
            color: rgb(73, 77, 89);
            font-family: "微软雅黑";
        }
        .titName{
            display:inline-block;
        }
        .content .box{
            border:none;
        }
        .row-fluid{
            border-top:none;
            border-top-color:#ccc;
        }
        .colorClass a{
            display: inline-block;
            width:16px;
            height:16px;
            margin-left:10px;
            vertical-align: middle;
        }
        .colorClass{
            color:#666;
            line-height:21px;
            position: absolute;
            right:27px;
            top:13px;
        }
        .test_null{
            border:1px solid #ccc!important;
        }
        .group_one{
            margin-top: 40px;
        }
        /*#CAL_CONTENT{*/
            /*width:273px!important;*/
            /*height:24px!important;*/
            /*position: relative;*/
            /*top:6px;*/
        /*}*/
        /*#CAL_TYPE{*/
            /*height:30px!important;*/
        /*}*/
        #TAKER_NAME,#OWNER_NAME{
            margin-left: 32px!important;
        }
        /*#CAL_LEVEL{*/
            /*margin-left: 40px!important;*/
        /*}*/
        .TAKER,.OWNER{
            display: inline-block;
            position: relative;
            top:-42px;
            left:24px;
        }
        .typeone{
            display: inline-block;
            position: relative;
            top:-10px;
            top:0px\0;
        }
        .input-small{
            border-radius: 3px;
        }
        .control-go{
            height:60px;
            margin-top:10px;
            margin-bottom: 20px;
            margin-left:100px;
        }
    </style>
</head>
<body>
<div class="title">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dayli.png" alt="" style="vertical-align:middle;margin-bottom: 3px">
    <div class="titName" style="margin-left: 7px"><fmt:message code="main.schedule"/></div><%--日程安排--%>
</div>
<div class="container">
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



    var user_id;
    function clearOwnerName(){
        //console.log(id);
        $("#OWNER_NAME").val('');
        $("#OWNER_NAME").attr("user_id",'');

    }
    function parseISO8601(dateStringInRange) {
        var year = dateStringInRange.split('-')[0];
        var month = dateStringInRange.split('-')[1];
        var day = dateStringInRange.split('-')[2];

        var date = year + '/' +month+ '/' +day;
        //console.log(date);
        return date;
    }
    function clearTakerName(){
        //console.log(id);
        $("#TAKER_NAME").val('');
        $("#TAKER_NAME").attr("user_id",'');

    }
    function getLocalTime(nS){
//        console.log(nS)
        return new Date(parseInt(nS) * 1000).toLocaleString().replace(/:\d{1,2}$/,' ');
    }
    var arr=[];
    $(document).ready(function(){
        //alert("加载开始1");
        var date = new Date();
        var d = date.getDate();
        var m = date.getMonth();
        var y = date.getFullYear();
        var timestamp = Date.parse(new Date());
        var timestamp = timestamp / 1000;

        datas={
            //uid:$.cookie('uid')
            userId:$.cookie('userId'),
           // calTime:timestamp
        };
        $.ajax({
            url:"../../schedule/getscheduleByTakerAndOwner",
            type:"get",
            dataType:"json",
            data:datas,
            success:function (data){
                //alert("请求成功"); 5
                var arrObject;
                for(var i=0;i<data.obj.length;i++){
                    //console.log(data.obj[i].calMessage[content]);
                    //console.log(data.obj[i].calMessage.stim);
                    //console.log(data.obj[i].calMessage.etim);
                    //var  calMessages= data.obj[i].calMessage;
                    //calMessages[j];
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
                            backgroundColor:"#ff5757",
                            beforeDay:data.obj[i].beforeDay,
                            beforeHour:data.obj[i].beforeHour,
                            beforeMin:data.obj[i].beforeMin,
                            beforeRemaind:data.obj[i].beforeRemaind
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
                            backgroundColor:"#ff9540",
                            beforeDay:data.obj[i].beforeDay,
                            beforeHour:data.obj[i].beforeHour,
                            beforeMin:data.obj[i].beforeMin,
                            beforeRemaind:data.obj[i].beforeRemaind
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
                            backgroundColor:"#ce84ce",
                            beforeDay:data.obj[i].beforeDay,
                            beforeHour:data.obj[i].beforeHour,
                            beforeMin:data.obj[i].beforeMin,
                            beforeRemaind:data.obj[i].beforeRemaind
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
                            backgroundColor:"#45a2ff",
                            beforeDay:data.obj[i].beforeDay,
                            beforeHour:data.obj[i].beforeHour,
                            beforeMin:data.obj[i].beforeMin,
                            beforeRemaind:data.obj[i].beforeRemaind
                        };
                    }
                    arr.push(arrObject);
                }
                if($('#calendar').length > 0){
                    var timestamp = Date.parse(new Date());
                    var timer=parseInt(timestamp)+3600000;
                    var startTime=new Date(timestamp).Format('hh:mm:ss');
                    var endTime=new Date(timer).Format('hh:mm:ss');

                    $('#START_DATE').val(startTime);
                    $('#EDN_DATE').val(endTime)
                    // alert("加载开始2");
                    $('#calendar').fullCalendar({
                        header: {
                            left: 'prev,next,today',
                            center: 'title',
                            right: 'month,agendaWeek,agendaDay'
                        },
                        buttonText:{
                            today:'<fmt:message code="attend.th.Jumptoday"/>'
                        },
                        editable: true,
                        events:arr,
                        dayClick: function (date, allDay, jsEvent, view) {
                            /*date=new Date(date);*/
                            date=date._d.Format('yyyy-MM-dd');
                            layer.open({
                                type: 1,
//                                skin: 'layui-layer-rim', //加上边框
                                offset: '80px',
                                area: ['600px', '500px'], //宽高
                                title:"<fmt:message code="attend.th.Newschedule"/>",
                                closeBtn: 2,
                                content:'<div id="myModal" class="modal hide in">' +
                        '   <div class="modal-header"></div>' +
                            '<div class="modal-body" id="new_modal">' +
                                ' <div class="control-group group_one" >' +
                                '           <span class="typeone" style="color:red;font-size:14px">*</span>' +
                                '       <span class="typeone" style="font-size:14px"><fmt:message code="attend.th.Contentofthings"/>:</span> '+
                        '               <textarea style="resize:none; font-size:14px;" name="CAL_CONTENT"  id="CAL_CONTENT" placeholder="<fmt:message code="new.th.putcontent"/>" class="input input-xl CAL_CONTENT text_boder  test_null"></textarea>' +
                        '       </div>' +
                        '       <div class="control-group">' +
                                '           <span style="color:red;font-size:14px ">*</span>' +
                        '           <span style="font-size:14px"><fmt:message code="attend.th.Typesofthings"/>:</span>'+
                            '           <select class="smallSelect text_boder" name="CAL_TYPE text_boder" id="CAL_TYPE" style="height: 30px;width: 280px;">' +
                            '               <option value="1"><fmt:message code="attend.th.Worktransaction"/></option>' +
                            '               <option value="2"><fmt:message code="attend.th.Persontransaction"/></option>' +
                            '           </select>' +
                        '       </div>' +
                        '       <div class="control-group" style=" clear:both">' +
                                '           <span style="color:red;font-size:14px ">*</span>' +
                        '           <span style="font-size:14px"><fmt:message code="sup.th.startTime"/>:</span> '+
                        '           <input name="START_DATE" id="START_DATE" class="text_boder test_null" placeholder="<fmt:message code="attend.th.startDate"/>" type="text" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})">' +

                        '       </div>' +
                        '       <div class="control-group" id="endtimeArea1" style="">' +
                                '           <span style="color:red;font-size:14px ">*</span>' +
                        '           <span style="font-size:14px"><fmt:message code="meet.th.EndTime"/>:</span> '+
                        '           <input name="EDN_DATE" id="EDN_DATE" class="text_boder test_null" placeholder="<fmt:message code="attend.th.EndDate"/>" type="text" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})">' +

                        '       </div>' +
                        '       <div class="control-go" style="">' +
                        '           <span class="TAKER" style="font-size:14px"><fmt:message code="attend.th.Participant"/>:</span>' +
                        '           <textarea name="TAKER_NAME" id="TAKER_NAME" class="BigStatic" wrap="yes" readonly="" style="height:54px;width: 274px;border-radius:3px;"></textarea>' +
                        '           <a href="javascript:;" id="takerOrgAdd" onclick="" class="style_a"><fmt:message code="global.lang.add"/></a>'+
                        '           <a href="javascript:;" id="takerOrgClear" onclick="clearTakerName();" class="style_a"><fmt:message code="global.lang.empty"/></a>' +
                        '       </div>' +
                        '       <div class="control-go" style="">' +
                        '           <span class="OWNER" style="font-size:14px"><fmt:message code="attend.th.Subordinate"/>:</span> '+
                        '           <textarea cols="35" name="OWNER_NAME" id="OWNER_NAME" class="BigStatic" wrap="yes" readonly="" style="height:54px; width: 274px;border-radius:3px;"></textarea>' +
                        '           <a href="javascript:;" id="ownerOrgAdd" onclick="" class="style_a"><fmt:message code="global.lang.add"/></a>' +
                        '           <a href="javascript:;" id="ownerOrgClear" onclick="clearOwnerName();" class="style_a"><fmt:message code="global.lang.empty"/></a>' +
                        '       </div>' +
                        '       <div class="control-group" style="">' +
                                '           <span style="color:red;font-size:14px ">*</span>' +
                        '           <span style="font-size:14px"><fmt:message code="attend.th.Eventlevel"/>:</span>'+
                        '           <select id="CAL_LEVEL" class="CAL_LEVEL text_boder" style="height: 30px;width: 280px;margin-left: 6px;">' +
                        '               <option value="1"><fmt:message code="attend.th.Importanturgent"/></option>'+
                        '               <option value="2"><fmt:message code="attend.th.ImportantNourgent"/></option>' +
                        '               <option value="3"><fmt:message code="attend.th.NOImportanturgent"/></option>' +
                        '               <option value="4"><fmt:message code="attend.th.NOImportantNOurgent"/></option>' +
                        '           </select>' +
                        '       </div>' +
                        '       <div class="control-group">' +
                        '           <span style="font-size:14px;display:inline;margin:0 12px 0 10px;"><fmt:message code="attend.th.Remindertime"/>:</span><fmt:message code="meet.th.Advance"/><input type="text" name="BEFORE_DAY" id="BEFORE_DAY" size="3" class="input input-small" style="width:30px" value=""><fmt:message code="attend.th.today"/><input type="text" name="BEFORE_HOUR" id="BEFORE_HOUR" size="3" class="input input-small" style="width:30px" value=""><fmt:message code="meet.th.hour"/><input type="text" name="BEFORE_MIN" id="BEFORE_MIN" size="3" class="input input-small" style="width:30px" value="10"><fmt:message code="attend.th.Minutesreminder"/>'+
                        '       </div>' +
                        '   </div>' +
                        '   <div class="modal-footer"></div>' +
                        '</div>',
                                btn:['<fmt:message code="global.lang.save"/>', '<fmt:message code="global.lang.close"/>'],
                                yes: function(index, layero){
                                    var array=$(".test_null");
                                    for(var i=0;i<array.length;i++){
                                        if(array[i].value==""){
                                            $.layerMsg({content:"<fmt:message code="meet.th.AnAsterisk"/>",icon:3},function(){
                                            });
                                            return;
                                        }
                                    }
                                    //新建日程接口
                                    var calTime=Date.parse(new Date($("#START_DATE").val().replace(/-/g,"/")))/1000;
                                    var endTime=Date.parse(new Date($("#EDN_DATE").val().replace(/-/g,"/")))/1000;
                                    var calLevel=$("#CAL_LEVEL option:selected").attr("value");
                                    var calType=$("#CAL_TYPE option:selected").attr("value");
                                    var content=$("#CAL_CONTENT").val();
                                    var takerOrgAdd = $("#TAKER_NAME").attr("user_id");
                                    var ownerOrgAdd = $("#OWNER_NAME").attr("user_id");
                                    var beforeDay=$("#BEFORE_DAY").val();
                                    var beforeHour=$("#BEFORE_HOUR").val();
                                    var beforeMin=$("#BEFORE_MIN").val();
                                    //console.log(takerOrgAdd);
                                    //console.log(ownerOrgAdd);
                                    //oldCodeName=$("select option:selected").val();
                                    //var calId=
                                    var data={
                                        //calId:calId,
                                        calType:calType,
                                        content:content,
                                        calTime:calTime,
                                        endTime:endTime,
                                        userId:$.cookie('userId'),
                                        calLevel:calLevel,
                                        owner:ownerOrgAdd,
                                        taker:takerOrgAdd,
                                        beforeDay:beforeDay,
                                        beforeHour:beforeHour,
                                        beforeMin:beforeMin
                                    };
                                    datas={
                                        //uid:$.cookie('uid')
                                        userId:$.cookie('userId')
                                       // calTime:timestamp
                                    };
                                    $.ajax({
                                        url:"../../schedule/addCalender",
                                        data:data,
                                        type:"get",
                                        dataType:"json",
                                        success:function(){
                                            $.ajax({
                                                url:"../../schedule/getscheduleByTakerAndOwner",
                                                type:"get",
                                                dataType:"json",
                                                data:datas,
                                                success:function (data){
                                                    //alert("请求成功");
                                                    if(data.flag==true){
                                                        var arrObject;
                                                        for(var i=0;i<data.obj.length;i++){
                                                            var arrObject = {
                                                                title: data.obj[i].content,
                                                                start: data.obj[i].stim,
                                                                end: data.obj[i].etim,
                                                                id:data.obj[i].calId
                                                            };
                                                            // console.log(data.obj[i].calId);
                                                            arr.push(arrObject);
                                                            //console.log(arr);
                                                        }
                                                        return arr;
                                                    }else if(data.flag==false){
                                                        $.layerMsg({content:'<fmt:message code="attend.th.NewFail"/>',icon:0},function(){});
                                                    }
                                                }
                                            });
//                                            console.log(arr);
                                            location.reload();
                                        }
                                    })

                                },
                                success:function(layero, index){

                                    //console.log(layero, index);
                                    $("#takerOrgAdd").on("click",function(){
                                        user_id='TAKER_NAME';
                                        $.popWindow("../common/selectUser");
                                    });
                                    $("#ownerOrgAdd").on("click",function(){
                                        user_id='OWNER_NAME';
                                        $.popWindow("../common/selectUser");
                                    });

                                }
                            });
                        },
                        //拖拽保存
                        eventDrop:function (event, dayDelta, minuteDelta, allDay, revertFunc, jsEvent, ui, view){
                            //alert(123);
                            var calTime=Date.parse(new Date(event.start))/1000;
                            var endTime=Date.parse(new Date(event.end))/1000;
                            var calLevel=event.calLevel;
                            var calType=event.calType;
                            var content=event.title;
                            var calId=event.id;
                            var takerOrgAdd = event.taker;
                            var ownerOrgAdd = event.owner;
                            //var calId=calEvent.id;
                            var data={
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
                            $.ajax({
                                url:"../../schedule/editCalender",
                                type:"get",
                                data:data,
                                dataType:"json",
                                success:function (){
                                    //location.reload();
                                }
                            })
                        },
                        eventClick:function (calEvent, jsEvent, view){
                            var arrBefore=calEvent.beforeRemaind.split('|');
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
                            var beforeDay=arrBefore[0];
                            var beforeHour=arrBefore[1];
                            var beforeMin=arrBefore[2];
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
                            var cal_level_str=level_map[cal_level-1];
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
                                                    '<div class="control-group">' +
                                                        '<label><fmt:message code="attend.th.Contentofthings"/>:' +
                                                        '<textarea  name="CAL_CONTENT" style="height: auto;resize : none" id="CAL_CONTENT" placeholder="<fmt:message code="notice.th.content"/>" class="input input-xl CAL_CONTENT text_boder test_null" ></textarea>'+
                                                        '</label>' +
                                                        '<span style="color:red;font-size:25px ">*</span>' +
                                                    '</div>' +
                                                    '<div class="control-group">' +
                                                        '<label><fmt:message code="attend.th.Typesofthings"/>:</label>'+
                                                        '<select class="smallSelect text_boder" name="CAL_TYPE" id="CAL_TYPE" style="height: 29px;width: 279px;">' +
                                                            '<option value="'+cal_type+'">'+cal_type_str+'</option>' +
                                                            '<option value="'+cal_type2+'">'+cal_type_str2+'</option>' +
                                                        '</select>' +
                                                        '<span style="color:red;font-size:14px ">*</span>' +
                                                    '</div>' +
                                                    '<div class="control-group" style=" clear:both">' +
                                                        '<span><fmt:message code="sup.th.startTime"/>:</span>' +
                                                        '<input name="START_DATE" id="START_DATE" class="text_boder test_null" placeholder="<fmt:message code="attend.th.startDate"/>" type="text" value="'+calTime+'" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})">' +
                                                        '<span style="color:red;font-size:14px ">*</span>' +
                                                    '</div>' +
                                                    '<div class="control-group" id="endtimeArea1" style="">' +
                                                        '<span><fmt:message code="meet.th.EndTime"/>:</span>'+
                                                        '<input name="EDN_DATE" id="EDN_DATE" class="text_boder test_null" placeholder="<fmt:message code="attend.th.EndDate"/>" type="text" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\'})" value="'+endTime+'">' +
                                                        '<span style="color:red;font-size:14px ">*</span>' +
                                                    '</div>' +
                                                    '<div class="control-group" style="">' +
                                                        '<span><fmt:message code="attend.th.Participant"/>:</span>'+
                                                        '<textarea name="TAKER_NAME1" id="TAKER_NAME1" class="BigStatic" wrap="yes" readonly="" style="height:54px;width: 273px;margin-left:24px;vertical-align: middle;border-radius:3px;"></textarea>' +
                                                        '<a href="javascript:;" id="takerOrgAdd1" onclick="" class="style_a"><fmt:message code="global.lang.add"/></a>' +
                                                         '<a href="javascript:;" id="takerOrgClear1" onclick="clearTakerName();" class="style_a"><fmt:message code="global.lang.empty"/></a>' +
                                                    '</div>' +
                                                    '<div class="control-group" style="">' +
                                                        '<span><fmt:message code="attend.th.Subordinate"/>:</span>' +
                                                        '<textarea cols="35" name="OWNER_NAME1" id="OWNER_NAME1" rows="2" class="BigStatic" wrap="yes" readonly="" style=" margin-left: 24px; width: 273px;margin-top:24px;vertical-align:middle;border-radius:4px;"></textarea>' +
                                                        '<a href="javascript:;" id="ownerOrgAdd1" onclick="" class="style_a"><fmt:message code="global.lang.add"/></a>' +
                                                        '<a href="javascript:;" id="ownerOrgClear1" onclick="clearOwnerName();" class="style_a"><fmt:message code="global.lang.empty"/></a>' +
                                                    '</div>' +
                                                    '<div class="control-group" style="margin-left:70px">' +
                                                        '<span style="padding-left:24px;"><fmt:message code="attend.th.Eventlevel"/>:</span>' +
                                                        '<select id="CAL_LEVEL" class="CAL_LEVEL text_boder" style="height: 29px;width: 279px;margin-left: 18px;margin-top:24px;">' +
                                                            '<option value="1"><fmt:message code="attend.th.Importanturgent"/></option>'+
                                                            '<option value="2"><fmt:message code="attend.th.ImportantNourgent"/></option>' +
                                                            '<option value="3"><fmt:message code="attend.th.NOImportanturgent"/></option>' +
                                                            '<option value="4"><fmt:message code="attend.th.NOImportantNOurgent"/></option>' +
                                                        '</select>' +
                                                    '</div>' +
                                                    '<div class="control-group" style="margin-left:70px;margin-top: 20px;">' +
                                                        '<span style="display:inline;margin:0 12px 0 10px;padding-left:14px;"><fmt:message code="attend.th.Remindertime"/>:</span><fmt:message code="meet.th.Advance"/><input type="text" name="BEFORE_DAY" id="BEFORE_DAY" size="3" class="input input-small" style="width:30px" value=""><fmt:message code="attend.th.today"/><input type="text" name="BEFORE_HOUR" id="BEFORE_HOUR" size="3" class="input input-small" style="width:30px" value=""><fmt:message code="meet.th.hour"/><input type="text" name="BEFORE_MIN" id="BEFORE_MIN" size="3" class="input input-small" style="width:30px" value="10"><fmt:message code="attend.th.Minutesreminder"/>'+
                                                    '</div>' +
                                                '</div>' +
                                            '<div class="modal-footer"></div>' +
                                        '</div>',
                                btn:['<fmt:message code="global.lang.save"/>','<fmt:message code="global.lang.close"/>','<fmt:message code="menuSSetting.th.deleteMenu"/>'],
                                success:function(layero, index){
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
                                    $("#CAL_CONTENT").val(content);
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

                                    $('#BEFORE_DAY').val(beforeDay)
                                    $('#BEFORE_HOUR').val(beforeHour)
                                    $('#BEFORE_MIN').val(beforeMin)

                                },
                                //编辑日程接口
                                yes: function(index, layero){
                                    //alert('html');
                                    //按钮【按钮三】的回调
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
                                    var start_time = parseISO8601($("#START_DATE").val());
                                    var end_time = parseISO8601($("#EDN_DATE").val());
                                    var calTime=Date.parse(new Date(start_time))/1000;

                                    var endTime=Date.parse(new Date(end_time))/1000;
                                    var calLevel=$("#CAL_LEVEL").val();
                                    var calType=$("#CAL_TYPE").val();
                                    var content=$("#CAL_CONTENT").val();
                                    var takerOrgAdd = $("#TAKER_NAME1").attr("user_id");
                                    var ownerOrgAdd = $("#OWNER_NAME1").attr("user_id");
                                    var beforeDay=$("#BEFORE_DAY").val();
                                    var beforeHour=$("#BEFORE_HOUR").val();
                                    var beforeMin=$("#BEFORE_MIN").val();
                                    var calId=calEvent.id;
                                    var data={
                                        calId:calId,
                                        calType:calType,
                                        content:content,
                                        calTime:calTime,
                                        endTime:endTime,
                                        userId:$.cookie('userId'),
                                        calLevel:calLevel,
                                        owner:ownerOrgAdd,
                                        taker:takerOrgAdd,
                                        beforeDay:beforeDay,
                                        beforeHour:beforeHour,
                                        beforeMin:beforeMin
                                    };


                                    $.ajax({
                                        url:"../../schedule/editCalender",
                                        type:"get",
                                        data:data,
                                        dataType:"json",
                                        success:function (){

                                            //alert('111');
//                                            $.ajax({
//                                                url:"../../schedule/getscheduleBycId",
//                                                type:"get",
//                                                dataType:"json",
//                                                data:data,
//                                                success:function (data){
//                                                    //alert("请求成功");
//                                                    var arrObject;
//                                                    for(var i=0;i<data.obj.length;i++){
//                                                        var arrObject = {
//                                                            title: data.obj[i].content,
//                                                            start: data.obj[i].stim,
//                                                            end: data.obj[i].etim,
//                                                            id:data.obj[i].calId
//                                                        };
//                                                        //console.log(arrObject);
//                                                        arr.push(arrObject);
//                                                        //console.log(arr);
//                                                    }
//                                                    return arr;
//                                                    location.reload();
//                                                }
//                                            });
                                            location.reload();
//                                            if($('.calendar').length > 0){
//
//                                                $('.calendar').fullCalendar({
//                                                    header: {
//                                                        left: 'prev,next,today',
//                                                        center: 'title',
//                                                        right: 'month,agendaWeek,agendaDay'
//                                                    },
//                                                    buttonText:{
//                                                        today:'跳转到当天'
//                                                    },
//                                                    editable: true,
//                                                    events:arr,
//                                                })
//                                            }

                                        }

                                    })

                                    //var layerIndex = layer.load(0, {shade: false});
                                    //layer.closeAll();

                                },
                                //删除日程接口
                                btn3:function(){
                                    $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu"/>',content:'<fmt:message code="workflow.th.que"/>',icon:0},function(){
                                   /* if(confirm("你确定要删除吗？")){
                                        //console.log();
                                        //var url='';*/
                                        var data={
                                            calId:calEvent.id
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
                                        return false;
                                    }*/
                                    //console.log(calEvent.id);
                                })
                                }
                            });
                            //console.log("success");
                            //layer.closeAll();
                        },
                    });
                }
                //return arr;

            }
        })

    });

    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm:ss',
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
        format: 'YYYY/MM/DD hh:mm:ss',
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
