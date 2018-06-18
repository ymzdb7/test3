<%--
  Created by IntelliJ IDEA.
  User: 牛江丽
  Date: 2017/9/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
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
    <title><fmt:message  code="event.th.WorkPlanQuery"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">

    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <!-- word文本编辑器 -->
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
</head>
<style>
    .navigation{
        margin-left: 3%;
    }
    .del_btn {
        color: #E01919;
        cursor: pointer;
    }
    .edit_btn {
        color: #1772C0;
        cursor: pointer;
    }
    #tr_td td{
        text-align: center;
    }
    .btn{
        color: #1772C0;
        cursor: pointer;
    }

    .span_td {
        display: inline-block;
        width: 150px;
        text-align: right;
    }

    .div_tr {
        margin: 10px;
    }
    .div_tr input {
        float: none;
        height: 28px;
        border-width: 1px;
        border-style: solid;
        border-color: rgb(153, 153, 153);
        border-image: initial;
    }
    .inPole textarea {
        vertical-align: middle;
        margin-left: 150px;
        margin-top: -19px;
        border-width: 1px;
        border-style: solid;
        border-color: rgb(153, 153, 153);
        border-image: initial;
    }
    .nameBtn {
        color: #54b6fe;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>



<body style="font-family: 微软雅黑;">
<div>
    <div class="navigation  clearfix">
        <div class="left">
            <img id="imgs" style="margin-top:18px;" src="/img/commonTheme/${sessionScope.InterfaceModel}/dayjihua.png">
            <div class="news">
                <fmt:message  code="event.th.TodayPlan"/>
            </div>
            <%--<select id="type" style="float:left;margin-top: 21px">
                <option value="0">所有类别</option>
            </select>
            <select id="statusFlag" style="float:left;margin-left:30px;margin-top: 21px">
                <option value="0">所有计划</option>
                <option value="1">结束计划</option>
                <option value="2">未结束计划</option>
            </select>
            <div id="cx" class="submit" style="float:left;margin-left:30px">
                查询
            </div>--%>
        </div>
        <%--分页按钮--%>
        <div id="dbgz_page" class="M-box3 fr" style="margin-right: 6%;margin-top: 2%">

        </div>
    </div>

    <div>
        <table id="tr_td" style="margin-left: 1%;width: 98%;table-layout: fixed" >
            <thead>
            <tr>
                <td class="th" width="8%"><fmt:message  code="workflow.th.Serial"/></td>
                <td class="th" width="14%"><fmt:message  code="event.th.PlanName"/></td>
                <td class="th" width="8%"><fmt:message  code="event.th.SpeedProgress"/></td>
                <td class="th titleOne" width="10%"><fmt:message  code="sup.th.startTime"/></td>
                <td class="th" width="10%"><fmt:message  code="meet.th.EndTime"/></td>
                <td class="th" width="10%"><fmt:message  code="event.th.PlanCategory"/></td>
                <td class="th" width="10%"><fmt:message  code="event.th.PersonCharge"/></td>
                <td class="th" width="10%"><fmt:message  code="event.th.Participanta"/></td>
                <td class="th" width="10%"><fmt:message  code="notice.th.state"/></td>
                <td class="th notice_do" width="10%"><fmt:message  code="notice.th.operation"/></td>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
</div>
</div>
<script>


    var time=${time};

    $(function () {
        if(time==1){
            $(".news").html("<fmt:message  code="event.th.TodayPlan"/>");
            $("#imgs").attr("src","/img/commonTheme/${sessionScope.InterfaceModel}/dayjihua.png")
        }else if(time==2){
            $(".news").html("<fmt:message  code="event.th.PlansWeek"/>");
            $("#imgs").attr("src","/img/commonTheme/${sessionScope.InterfaceModel}/zhoujihua.png")
        }else{
            $(".news").html("<fmt:message  code="event.th.PlanMonth"/>");
            $("#imgs").attr("src","/img/commonTheme/${sessionScope.InterfaceModel}/yuejihua.png")
        }
    })
    //进行条件查询方法，并在列表中显示
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
            type:null,
            statusFlag:null,
            time:time
        },
        init:function () {
        },
        page:function () {
            var me=this;
            $.get('/workPlan/selectWorkPlanByCond',me.data,function (obj) {
                $("#tr_td tbody").html("");
                var str="";
                var data=obj.obj;
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td>'+data[i].planId+'</td>' +
                            '<td><a href="javascript:void(0)" class="nameBtn"  planId="'+data[i].planId+'" style="display:block;white-space:nowrap; overflow:hidden; text-overflow:ellipsis;">'+data[i].name+'</a></td>' +
                            '<td>'+data[i].progress+'%</td>' +
                            '<td>'+data[i].beginDate+'</td>' +
                            '<td>'+data[i].endDateStr+'</td>' +
                            '<td>'+data[i].typeName+'</td>' +
                            '<td>'+data[i].managerName+'</td>' +
                            '<td>'+data[i].participatorName+'</td>';
                      /*  if(data[i].attachmentId=="" || data[i].attachmentId=="undefined"){
                            str+='<td><fmt:message  code="event.th.nothing"/></td>';
                        }else{
                            str+='<td><fmt:message  code="event.th.Yes"/></td>';
                        }*/

                        if(data[i].publish=="1"){
                            if(data[i].suspendFlag==0){
                                str+='<td><fmt:message  code="event.th.suspend"/></td>';
                            }else{
                                if(data[i].status==1){
                                    str+='<td><fmt:message  code="event.th.NotBegin"/></td>';
                                }else if(data[i].status==2){
                                    str+='<td><fmt:message  code="meet.th.HaveHand"/></td>';
                                }else if(data[i].status==3){
                                    str+='<td><fmt:message  code="meet.th.IsOver"/></td>';
                                }
                            }
                        }else{
                            str+='<td><fmt:message  code="notice.th.unposted"/></td>';
                        }

                     /*   str+='<td><span class="end_btn btn" id="progressLog" planId="'+data[i].planId+'">进度日志</span>';*/
                        /*  var manager=data[i].manager;
                         var participator=data[i].participator;
                         if(manager!="" && manager!="undefined"){
                         if(manager.indexof($.cookie("uid")+",")>=0 || manager.indexof(","+$.cookie("uid")+",")>=0){
                         str+='<td><span class="end_btn btn" id="progressLog" planId="'+data[i].planId+'">进度日志</span>';
                         }
                         }else if(participator!="" && participator!="undefined"){
                         if(participator.indexof($.cookie("uid")+",")>=0 || participator.indexof(","+$.cookie("uid")+",")>=0){
                         str+='<td><span class="end_btn btn" id="progressLog" planId="'+data[i].planId+'">进度日志</span>';
                         }
                         }*/
                        if(data[i].uidPartFlag==1){
                            str+='<td><span class="end_btn btn" id="progressLog" planId="'+data[i].planId+'"><fmt:message  code="event.th.ProgressLog"/></span>';
                        }else{
                            str+='<td>';
                        }
                        str+='</td></tr>';
                    }
                    $("#tr_td tbody").html(str);
                }
                me.pageTwo(obj.totleNum,me.data.pageSize,me.data.page)
            },'json')
        },
        pageTwo:function (totalData, pageSize,indexs) {
            var mes=this;
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:indexs||1,
                callback: function (index) {
                    mes.data.page=index.getCurrent();
                    mes.page();
                }
            });
        }
    }
    ajaxPage.init();
    ajaxPage.page();

    /**
     * 查询按钮
     */
    $(".submit").click(function(){
        ajaxPage.data.page=1;
        ajaxPage.data.type=$("#type").val();
        ajaxPage.data.statusFlag=$("#statusFlag").val();
        ajaxPage.page()
    })

    $(function () {
        selType();
    })

    //加载工作计划类型下拉列表
    function selType(){
        $.ajax({
            url:"/planType/selAllPlanType",
            type:'post',
            dataType:'json',
            success:function (json) {
                var data=json.obj;
                if(json.flag){
                    var str='<option value="0"><fmt:message  code="event.th.AllCategories"/></option>';
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>';
                    }
                    $("#type").html(str);
                }
            }
        })
    }

    //进度日志按钮
    $("#tr_td").on("click","#progressLog",function () {
        var planId=$(this).attr("planId");
        layer.open({
            type: 1,
            title:['<fmt:message  code="event.th.ProgressLog"/>', 'background-color:#2b7fe0;color:#fff;'],
            area: ['1050px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content: '<div class="showWorkDetail">' +
            '<div style="font-size: 17px;margin-left: 60px;margin-top: 13px;margin-bottom: -18px;" class="list"><fmt:message  code="event.th.ProgressLogDetails"/></div>' +
            '<div class="table list">' +
            '<table style="width: 90%; margin-left:60px; margin-top: 30px;" class="showDetail">' +
            '<tr>' +
            '<td><fmt:message  code="event.th.author"/></td>' +
            '<td><fmt:message  code="notice.th.content"/></td>' +
            '<td><fmt:message  code="event.th.LogTime"/></td>' +
            '<td><fmt:message  code="event.th.PercentageProgress"/></td>' +
            '<td><fmt:message  code="notice.th.operation"/></td>' +
            '</tr>'+
            '<tbody class="tbody"></tbody>'+
            '</table>' +
            '</div></div>' +
            '<div class="div_table" style="margin-left: 15px;">' +
            '<div style="font-size: 17px;margin-left: 44px;margin-top: 13px;margin-bottom: 15px;" class="textContent"><fmt:message  code="event.th.AddProgressLog"/></div>' +
            '<div class="div_tr">' +
            '<input type="hidden" id="detailId">' +
            '<input type="hidden" id="planId">' +
            '<table class="" style="width: 92%; margin-left:45px; margin-top: 25px;">'+
            '<tr>'+
            '<td><fmt:message  code="event.th.WritingTime"/>：</td>'+
            '<td><input name="writeTime" id="writeTime" type="text" style="width: 379px" disabled readonly></td>'+
            '</tr>'+
            '<tr>'+
            '<td><fmt:message  code="event.th.PercentCompletion"/>：</td>'+
            '<td><input name="percent"" id="percent" type="text" style="width: 379px"><span><fmt:message  code="event.th.NoteEstimated"/></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td><fmt:message  code="event.th.CommentContent"/>：</td>'+
            '<td><textarea name="progress" id="progress"  cols="60" rows="7"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>'+
            '</tr>'+
            '<tr><td colspan="2"><input type="button" value="<fmt:message  code="menuSSetting.th.menusetsure"/>"  onclick="saveDetail()"  style="width: 70px;height: 28px;margin-left: 46%"></td></tr>'+
            '</table>'+
            '</div></div>',
            success:function(){
                $("#planId").val(planId);
                workDetailList(planId);
                var myDate = new Date();
                var year=myDate.getFullYear();    //获取完整的年份(4位,1970-????)
                var month=(myDate.getMonth()+1).toString();       //获取当前月份(0-11,0代表1月)
                var day=myDate.getDate().toString();        //获取当前日(1-31)
                var hour=myDate.getHours().toString();       //获取当前小时数(0-23)
                var min=myDate.getMinutes().toString();     //获取当前分钟数(0-59)
                var second=myDate.getSeconds().toString();     //获取当前秒数(0-59)
                if(month.length==1){
                    month="0"+month;
                }
                if(day.length==1){
                    day="0"+day;
                }
                if(hour.length==1){
                    hour="0"+hour;
                }
                if(min.length==1){
                    min="0"+min;
                }
                if(second.length==1){
                    second="0"+second;
                }
                dateWriteTime();
            },
            yes:function(index){
                layer.close(index);
            },
        });
    })

    //工作进度日志列表展示
    function workDetailList(planId){
        $.ajax({
            type:'get',
            url:'<%=basePath%>workDetail/selWorkDetailByPlanId',
            dataType:'json',
            data:{
                'planId':planId,
                'typeFlag':0
            },
            success:function(res){
                var data =res.obj;
                var str='';
                for(var i=0;i<data.length;i++){
                    str+='<tr>' +
                        '<td>'+data[i].writerName+'</td>' +
                        '<td>'+data[i].progress+'</td>';
                    <%--if(data[i].attachmentId==""||data[i].attachmentId=="undefined"){--%>
                        <%--str+='<td><fmt:message  code="event.th.nothing"/></td>';--%>
                    <%--}else{--%>
                        <%--str+='<td><fmt:message  code="event.th.Yes"/></td>';--%>
                    <%--}--%>
                    str+='<td>'+data[i].writeTime+'</td>' +
                        '<td>'+data[i].percent+'</td>' +
                        '<td><span class="end_btn btn" id="editDetail" onclick="editDetail('+data[i].detailId+',1)"><fmt:message  code="depatement.th.modify"/></span>&nbsp;' +
                        '<span class="end_btn btn" id="delDetail" onclick="delDetail('+data[i].detailId+')"><fmt:message  code="global.lang.delete"/></span></td>' +
                        '</tr>'
                }
                $(".tbody").html(str);
            }
        })
    }

    //工作进度日志反显
    var detailEditFlag=0;
    function editDetail(detailId,edit){
        detailEditFlag=edit;
        $(".list").hide();
        $(".textContent").html("<fmt:message  code="event.th.ModifyLog"/>");
        $.ajax({
            type: 'get',
            url: '<%=basePath%>workDetail/selWorkDetailById',
            dataType: 'json',
            data: {'detailId': detailId},
            success: function (res) {
                var data=res.object;
                $("#planId").val(data.planId);
                $("#detailId").val(data.detailId);
                $("#writeTime").val(data.writeTime);
                $("#percent").val(data.percent);
                $("#progress").val(data.progress);
            }
        })
    }

    //工作进度日志的添加和修改
    function saveDetail(){
        if($("#percent").val()==""){
            $.layerMsg({content:"<fmt:message  code="event.th.WorkSchedule"/>！",icon:2},function(){
            });
            return false;
        }
        if($("#progress").val()==""){
            $.layerMsg({content:"<fmt:message  code="event.th.ProgressDetails"/>！",icon:2},function(){
            });
            return false;
        }
        if(detailEditFlag==0){//添加工作进度日志
            $.ajax({
                type: 'get',
                url: '<%=basePath%>workDetail/insertWorkDetail',
                dataType: 'json',
                data: {
                    planId:$("#planId").val(),
                    writeTimeStr:$("#writeTime").val(),
                    percent:$("#percent").val(),
                    progress:$("#progress").val(),
                    typeFlag:0
                },
                success: function (res) {
                    if(res.flag){
                        $.layerMsg({content:"<fmt:message  code="url.th.addSuccess"/>！",icon:1},function(){
                        });
                        workDetailList($("#planId").val());
                        $("#detailId").val("");
                        $("#percent").val("");
                        $("#progress").val("");
                    }
                }
            })
        }else{//修改工作进入日志
            $.ajax({
                type: 'get',
                url: '<%=basePath%>workDetail/updateWorkDetailById',
                dataType: 'json',
                data: {
                    detailId:$("#detailId").val(),
                    planId:$("#planId").val(),
                    writeTime:$("#writeTime").val(),
                    percent:$("#percent").val(),
                    progress:$("#progress").val(),
                },
                success: function (res) {
                    if(res.flag){
                        $.layerMsg({content:"<fmt:message  code="depatement.th.Modifysuccessfully"/>！",icon:1},function(){
                        });
                        detailEditFlag=1;
                        $(".list").show();
                        dateWriteTime();
                        workDetailList($("#planId").val());
                        $("#detailId").val("");
                        $("#percent").val("");
                        $("#progress").val("");
                    }
                }
            })
        }
    }

    function dateWriteTime() {
        var myDate = new Date();
        var year=myDate.getFullYear();    //获取完整的年份(4位,1970-????)
        var month=(myDate.getMonth()+1).toString();       //获取当前月份(0-11,0代表1月)
        var day=myDate.getDate().toString();        //获取当前日(1-31)
        var hour=myDate.getHours().toString();       //获取当前小时数(0-23)
        var min=myDate.getMinutes().toString();     //获取当前分钟数(0-59)
        var second=myDate.getSeconds().toString();     //获取当前秒数(0-59)
        if(month.length==1){
            month="0"+month;
        }
        if(day.length==1){
            day="0"+day;
        }
        if(hour.length==1){
            hour="0"+hour;
        }
        if(min.length==1){
            min="0"+min;
        }
        if(second.length==1){
            second="0"+second;
        }
        var date=year+'-'+month+'-'+day+' ';
        var time=hour+':'+min+':'+second;
        $("#writeTime").val(date+time);
    }

    //删除工作进度
    function delDetail(detailId){
        $.ajax({
            type: 'get',
            url: '<%=basePath%>workDetail/delWorkDetailById',
            dataType: 'json',
            data: {
                detailId:detailId,
            },
            success: function (res) {
                if(res.flag){
                    $.layerMsg({content:"<fmt:message  code="workflow.th.delsucess"/>！",icon:1},function(){
                    });
                    detailEditFlag=1;
                    $(".list").show();
                    workDetailList($("#planId").val());
                }
            }
        })
    }

    //点击名称出现详情
    $("#tr_td").on("click",".nameBtn",function () {
        var planId=$(this).attr("planId");
        layer.open({
            type: 1,
            title: ['<fmt:message  code="event.th.DetailsPlan"/>', 'background-color:#2b7fe0;color:#fff;'],
            area: ['750px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content: '<div style="margin-left:1%;margin-top:10px;margin-bottom: 10px"><span class="" style="font-size: 17px;font-family: 微软雅黑;"> <fmt:message  code="event.th.DetailsPlan"/></span></div>'+
            '<table class="TableBlock"  width="65%" style="margin-left:1%">'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.PlanName"/></td>'+
            '<td align="left" class="TableData"><span id="name"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.PlanContent"/> </td>'+
            '<td align="left" class="TableData Content" style="word-break:break-all"><span id="content"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="sup.th.startTime"/></td>'+
            '<td nowrap align="left" class="TableData"><span id="beginDate"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="meet.th.EndTime"/></td>'+
            '<td nowrap align="left" class="TableData"><span id="endDate"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.PlanCategory"/></td>'+
            '<td nowrap align="left" class="TableData"><span id="typeName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.OpenSector"/></td>'+
            '<td align="left" class="TableData"><span id="toName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.OpenPersonnel"/></td>'+
            '<td align="left" class="TableData"><span id="toPersonName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.PersonCharge"/></td>'+
            '<td nowrap align="left" class="TableData"><span id="managerName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.Participanta"/></td>'+
            '<td align="left" class="TableData"><span id="participator"></span></tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="event.th.EndorsementLeadership"/> </td>'+
            '<td nowrap align="left" class="TableData"><span id="opinionLeaderName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="sms.th.CreationDate"/> </td>'+
            '<td nowrap align="left" class="TableData"><span id="createDate"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="journal.th.Remarks"/></td>'+
            '<td align="left" class="TableData"></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message  code="notice.th.state"/></td>'+
            '<td nowrap align="left" class="TableData"><span id="statusName"></span></td>'+
            '</tr>'+
            '<tr class="TableControl">'+
            '<td colspan="9" align="center">'+
            '</td>'+
            '</tr>'+
            '</table>',
            success:function(){
                $.ajax({
                    type: 'get',
                    url: '<%=basePath%>workPlan/selectWorkPlanById',
                    dataType: 'json',
                    data: {
                        planId:planId,
                    },
                    success: function (res) {
                        var data=res.object;
                        if(res.flag){
                            $("#name").html(data.name);
                            $("#content").html(data.content);
                            $("#beginDate").html(data.beginDate);
                            $("#endDate").html(data.endDate);
                            $("#typeName").html(data.typeName);
                            $("#toName").html(data.toName);
                            $("#toPersonName").html(data.toPersonName);
                            $("#managerName").html(data.managerName);
                            $("#participatorName").html(data.participatorName);
                            $("#creatorName").html(data.creatorName);
                            $("#opinionLeaderName").html(data.opinionLeaderName);
                            $("#createDate").html(data.createDate);
                            /* if(data.attachmentId=="" || data.attachmentId="undefined"){
                             $("#attachmentId").html("无");
                             }*/
                            if(data.suspendFlag==0){
                                $("#statusName").html("<fmt:message  code="event.th.suspend"/>");
                            }else{
                                if(data.status==1){
                                    $("#statusName").html("<fmt:message  code="event.th.NotBegin"/>");
                                }else if(data.status==2){
                                    $("#statusName").html("<fmt:message  code="meet.th.HaveHand"/>");
                                }else if(data.status==3){
                                    $("#statusName").html("<fmt:message  code="meet.th.IsOver"/>");
                                }
                            }
                        }
                    }
                })
            },
            yes:function(index){
                layer.close(index);
            }
        });
    })
</script>
</body>
</html>
