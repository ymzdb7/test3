<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>

    <title><fmt:message code="doc.th.AttendanceStatistics" /></title>

    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" type="text/css" href="/lib/ueditor/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="/css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="/lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="/css/base.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="/css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="/css/dept/new_news.css"/>
    <script src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script src="/lib/laydate.js"></script>
    <script src="/js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        .title span {
            font-size: 22px;
            color: #494d59;
        }
        th {
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height: 45px;
            text-align: left;
            padding-left: 10px;
        }
        .queryConditon input {
            float: none;
            width: 180px;
            height: 30px;
        }
        .btnSpan {
            display: inline-block;
            width: 60px;
            height: 28px;
            background-color: #2f80d1;
            font-size: 14px;
            cursor: pointer;
            color: #fff;
            border-radius: 5px;
            line-height: 28px;
            text-align: center;
        }
        .btn_return {
            display: inline-block;
            float: left;
            width: 78px;
            height: 38px;
            line-height: 35px;
            /* margin-right: 30px; */
            margin-top: 20px;
            margin-bottom: 20px;
            cursor: pointer;
            border-radius: 3px;
            background: url(/img/newReturn.png) no-repeat;
            padding-left: 40px;
            font-size: 14px;
            margin-left: 47%;
        }
    </style>
</head>
<body style="background: no-repeat;">
<div class="main">
    <div class="diaryAttend"style="height: 40%">
        <div class="title" style="margin-top: 20px">
            <img src="/img/hr/todayAttend.png" style="vertical-align: middle;margin-top: -6px;" alt="">
            <span style="padding-left:10px;">今日上下班登记</span>
        </div>
        <div class="table" style="display: none;margin-right: 28px;margin-top: 16px;">
            <table style="width: 96%;margin-left: 36px;">
                <thead>
                <tr>
                    <th>登记类型</th>
                    <th>登记日期</th>
                    <th>登记时间</th>
                    <th>登记地点</th>
                    <th>备注</th>

                </tr>
                </thead>
                <tbody class="list">

                </tbody>
            </table>
        </div>
        <div class="tishi" style="height: 100%;text-align: center;border: none;display: none;margin-top:-5px ">
            <div style="width:100%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
            <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">暂无登记记录</h2>
        </div>
    </div>
    <div class="selectAttend">
        <div class="title" style="margin-top: 20px">
            <img src="/img/hr/attendanceQuery.png" style="vertical-align: middle;margin-top: -6px;" alt="">
            <span style="padding-left:10px;">考勤查询与统计</span>
        </div>
        <div class="queryConditon" style="    margin-top: 20px; margin-left: 36px;">
            <span>起始日期：</span>
            <input type="text" name="startTime" id="startTimeOne" onclick="laydate(start)">
            <span style="margin: 0 15px;">截止日期：</span>
            <input type="text" name="endTime" id="endTimeOne" onclick="laydate(end)">
            <span class="btnSpan" id="query"><fmt:message code="global.lang.query" /></span>

        </div>

    </div>
</div>
<div class="selectContent" style="display: none">
  <div class="attend">
      <div class="title" style="margin-top: 20px">
          <img src="/img/hr/attendQuery.png" style="vertical-align: middle;margin-top: -9px;" alt="">
          <span style="padding-left:10px;">上下班统计</span>
      </div>
      <div class="table" style="display: none;margin-right: 28px;margin-top: 16px;">
          <table style="width: 96%;margin-left: 36px;">
              <thead>
              <tr>
                  <th>上班准时登记次数</th>
                  <th>下班准时登记次数</th>

              </tr>
              </thead>
              <tbody class="aList">

              </tbody>
          </table>
      </div>

      <div class="tishi" style="height: 100%;text-align: center;border: none;display: none;margin-top:-5px ">
          <div style="width:100%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
          <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">暂无登记记录</h2>
      </div>
  </div>
  <div class="attendOut">
      <div class="title" style="margin-top: 20px">
          <img src="/img/hr/attendOut.png" style="vertical-align: middle;margin-top: -6px;" alt="">
          <span style="padding-left:10px;">外出记录</span>
      </div>
      <div class="table" style="display: none;margin-right: 28px;margin-top: 16px;">
          <table style="width: 96%;margin-left: 36px;">
              <thead>
              <tr>
                  <th>申请时间</th>
                  <th>外出原因</th>
                  <th>登记IP</th>
                  <th>外出开始时间</th>
                  <th>外出结束时间</th>
                  <th>审批人</th>
                  <th>状态</th>
              </tr>
              </thead>
              <tbody class="aoList">

              </tbody>
          </table>
      </div>

      <div class="tishi" style="height: 24%;text-align: center;border: none;display: none;margin-top:-5px ">
          <div style="width:100%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
          <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">暂无外出记录</h2>
      </div>
  </div>
  <div class="attendLeave">
      <div class="title" style="margin-top: 20px">
          <img src="/img/hr/attendLeave.png" style="vertical-align: middle;margin-top: -6px;" alt="">
          <span style="padding-left:10px;">请假记录</span>
      </div>
      <div class="table" style="display: none;margin-right: 28px;margin-top: 16px;">
          <table style="width: 96%;margin-left: 36px;">
              <thead>
              <tr>
                  <th>申请时间</th>
                  <th>请假原因</th>
                  <th>登记IP</th>
                  <th>请假开始时间</th>
                  <th>请假结束时间</th>
                  <th>审批人</th>
                  <th>状态</th>


              </tr>
              </thead>
              <tbody class="alList">

              </tbody>
          </table>
      </div>

      <div class="tishi" style="height: 25%;text-align: center;border: none;display: none;margin-top:-5px ">
          <div style="width:100%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
          <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">暂无请假记录</h2>
      </div>

  </div>
  <div class="attendEvection">
      <div class="title" style="margin-top: 20px">
          <img src="/img/hr/attendEvection.png" style="vertical-align: middle;margin-top: -9px;" alt="">
          <span style="padding-left:10px;">出差记录</span>
      </div>
      <div class="table" style="display: none;margin-right: 28px;margin-top: 16px;">
          <table style="width: 96%;margin-left: 36px;">
              <thead>
              <tr>
                  <th>申请时间</th>
                  <th>出差原因</th>
                  <th>登记IP</th>
                  <th>出差开始时间</th>
                  <th>出差结束时间</th>
                  <th>审批人</th>
                  <th>状态</th>
              </tr>
              </thead>
              <tbody class="aeList">

              </tbody>
          </table>
      </div>

      <div class="tishi" style="height: 24%;text-align: center;border: none;display: none;margin-top:-5px ">
          <div style="width:100%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
          <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">暂无出差记录</h2>
      </div>
  </div>
    <div class="attendanceOvertime">
        <div class="title" style="margin-top: 20px">
            <img src="/img/hr/attendanceOvertime.png" style="vertical-align: middle;margin-top: -6px;" alt="">
            <span style="padding-left:10px;">加班记录</span>
        </div>
        <div class="table" style="display: none;margin-right: 28px;margin-top: 16px;">
            <table style="width: 96%;margin-left: 36px;">
                <thead>
                <tr>
                    <th>申请时间</th>
                    <th>加班内容</th>
                    <th>登记IP</th>
                    <th>加班开始时间</th>
                    <th>加班结束时间</th>
                    <th>审批人</th>
                    <th>状态</th>
                </tr>
                </thead>
                <tbody class="aoList">

                </tbody>
            </table>
        </div>

        <div class="tishi" style="height: 40%;text-align: center;border: none;display: none;margin-top:-5px ">
            <div style="width:100%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
            <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">暂无加班记录</h2>
        </div>
    </div>
    <div id="rs" type="save" class="btn_return">返回</div>
</div>

</body>
<script>
    var start = {
        format: 'YYYY-MM-DD',
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
        /*format: 'YYYY/MM/DD hh:mm',*/
        format:'YYYY-MM-DD',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    $(function (){
        var zero='0';
        var timer;
        var myDate = new Date();
         //获取当前年
        var year=myDate.getFullYear();
        //获取当前月
        var month=myDate.getMonth()+1;
        //获取当前日
        var day=myDate.getDate();
        var new_month;
        var new_day;
        if(month < 10){
            new_month = zero + month;
        }else {
            new_month = month
        }
        if(day < 10){
            new_day = zero + day;
        }else {
            new_day = day;
        }
        timer = year + '-'+ new_month + '-' +new_day;
//        timer = '2017-10-31';
        $("#startTimeOne").val(year+"-"+new_month+"-"+"01");
        $("#endTimeOne").val(year+"-"+new_month+"-"+new_day)

        init(timer);
        function init(date) {
            $.ajax({
                type:'get',
                url:'/attend/PersonalTodayAttendance',
                dataType:'json',
                data:{'date':date},
                success:function (reg) {
                    var data=reg.data;
                    if(data.length == 0){
                        $('.diaryAttend .table').css("display","none");
                        $('.diaryAttend .tishi').css("display","block");
                    }else {
                        var str="";
                        for(var i=0;i<data.length;i++){
                            var num = i+1;
                            str+='<tr class="pagediv" > ' +
                                '<td >'+'第'+num+'次登记'+'</td> ' +
                                '<td class="data" >'+timer+'</a></td> ' +
                                '<td>'+data[i].time+'</td> ' +
                                '<td>'+data[i].address+'</td> ' +
                                '<td>'+data[i].remark+'</td> ' +
                                '</tr>'
                        }
                        $('.diaryAttend .table').css("display","block");
                        $('.list').html(str);

                    }

                }
            })
        }

        $('#query').click(function(){
            var data={
                'beginDate':$("#startTimeOne").val(),
                'endDate':$("#endTimeOne").val()
            }
            $('.main').css("display","none");
            $('.selectContent').css("display","block");
            //上下班统计
            $.ajax({
                type:'get',
                url:'/attend/AttendanceStatistics',
                dataType:'json',
                data:data,
                success:function (reg) {
                    var data=reg.data;
                    if(data.length == 0){
                        $('.attend .table').css("display","none");
                        $('.attend .tishi').css("display","block");
                    }else {

                        var str="";
                        str+='<tr class="pagediv" > ' +
                                '<td>'+data.count1+'</td> ' +
                                '<td>'+data.count2+'</td> ' +
                                '</tr>'

                        $('.attend .table').css("display","block");
                        $('.alist').html(str);

                    }
                }
            })

            //外出记录
            $.ajax({
                type:'get',
                url:'/attendOut/queryAttendOutByUserId',
                dataType:'json',
                data:data,
                success:function (reg) {
                    var data=reg.obj;
                    if(data.length == 0){
                        $('.attendOut .table').css("display","none");
                        $('.attendOut .tishi').css("display","block");
                    }else {
                        var str="";
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="pagediv" > ' +
                                '<td>'+data[i].submitTime+'</td> ' +
                                '<td>'+data[i].outType+'</td> ' +
                                '<td>'+data[i].registerIp+'</td> ' +
                                '<td>'+data[i].outTime1+'</td> ' +
                                '<td>'+data[i].outTime2+'</td> ' +
                                '<td>'+data[i].leaderId+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].allow== 0){
                                        return '待审批'
                                    }else if(data[i].allow ==1){
                                        return '已批准'
                                    }else {
                                        return '未批准'

                                    }}()+'</td> ' +
                                '</tr>'
                        }
                        $('.attendOut .table').css("display","block");
                        $('.attendOut .tishi').css("display","none");
                        $('.aolist').html(str);

                    }
                }
            })
            // 请假记录
            $.ajax({
                type:'get',
                url:'/attendLeave/selectAttendLeaveByUserId',
                dataType:'json',
                data:data,
                success:function (reg) {
                    var data=reg.obj;
                    if(data.length == 0){
                        $('.attendLeave .table').css("display","none");
                        $('.attendLeave .tishi').css("display","block");
                    }else {
                        var str="";
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="pagediv" > ' +
                                '<td>'+data[i].recordTime+'</td> ' +
                                '<td>'+data[i].leaveType+'</td> ' +
                                '<td>'+data[i].registerIp+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].leaveDate1== null){
                                        return ''
                                    }else {
                                        return data[i].leaveDate1
                                    }}()+'</td> ' +
                                '<td>'+function () {
                                if(data[i].leaveDate2== null){
                                    return ''
                                }else {
                                    return data[i].leaveDate2
                                }}()+'</td> ' +
                                '<td>'+data[i].leaderId+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].allow== 0){
                                        return '待审批'
                                    }else if(data[i].allow ==1){
                                        return '已批准'
                                    }else {
                                        return '未批准'

                                    }}()+'</td> ' +
                                '</tr>'
                        }
                        $('.attendLeave .table').css("display","block");
                        $('.attendLeave .tishi').css("display","none");
                        $('.allist').html(str);

                    }
                }
            })
            //出差记录
            $.ajax({
                type:'get',
                url:'/attendEvection/selectAttendEvectionByUserId',
                dataType:'json',
                data:data,
                success:function (reg) {
                    var data=reg.obj;
                    if(data.length == 0){
                        $('.attendEvection .table').css("display","none");
                        $('.attendEvection .tishi').css("display","block");
                    }else {
                        var str="";
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="pagediv" > ' +
                                '<td>'+data[i].recordTime+'</td> ' +
                                '<td>'+data[i].reason+'</td> ' +
                                '<td>'+data[i].registerIp+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].evectionDate1== null){
                                        return ''
                                    }else {
                                        return data[i].evectionDate1
                                    }}()+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].evectionDate2== null){
                                        return ''
                                    }else {
                                        return data[i].evectionDate2
                                    }}()+'</td> ' +
                                '<td>'+data[i].leaderId+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].allow== 0){
                                        return '待审批'
                                    }else if(data[i].allow ==1){
                                        return '已批准'
                                    }else {
                                        return '未批准'

                                    }}()+'</td> ' +
                                '</tr>'
                        }
                        $('.attendEvection .table').css("display","block");
                        $('.attendEvection .tishi').css("display","none");
                        $('.aelist').html(str);

                    }
                }
            })
            //加班记录
            $.ajax({
                type:'get',
                url:'/attendanceOvertime/queryAttendanceOvertimeByUserId',
                dataType:'json',
                data:data,
                success:function (reg) {
                    var data=reg.obj;
                    if(data.length == 0){
                        $('.attendanceOvertime .table').css("display","none");
                        $('.attendanceOvertime .tishi').css("display","block");
                    }else {
                        var str="";
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="pagediv" > ' +
                                '<td>'+data[i].recordTime+'</td> ' +
                                '<td>'+data[i].reason+'</td> ' +
                                '<td>'+data[i].registerIp+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].startTime== null){
                                        return ''
                                    }else {
                                        return data[i].startTime
                                    }}()+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].endTime== null){
                                        return ''
                                    }else {
                                        return data[i].endTime
                                    }}()+'</td> ' +
                                '<td>'+data[i].approveId+'</td> ' +
                                '<td>'+function () {
                                    if(data[i].allow== 0){
                                        return '待审批'
                                    }else if(data[i].allow ==1){
                                        return '已批准'
                                    }else if(data[i].allow == 2){
                                        return '未批准'
                                    }else {
                                       return '待确认'
                                    }}()+'</td> ' +
                                '</tr>'
                        }
                        $('.attendanceOvertime .table').css("display","block");
                        $('.attendanceOvertime .tishi').css("display","none");
                        $('.aolist').html(str);

                    }
                }
            })



        })

        $('#rs').click(function () {
            $('.main').show();
            $('.selectContent').hide();
        })

        })
</script>
</html>