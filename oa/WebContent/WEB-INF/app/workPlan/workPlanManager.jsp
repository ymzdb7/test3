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
    <title><fmt:message code="event.th.WorkPlanManagement" /></title>
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
    <script src="/js/common/language.js"></script>
</head>
<style>
    .navigation{
        margin-left: 30px;
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
    .delete_check {
        background: url(../../img/btn_deleteannounce.png) 0px 10px no-repeat;
        text-align: center;
        font-size: 12px;
    }
    .btn{
        color: #1772C0;
        cursor: pointer;
    }
    #tr_td td{
        overflow: hidden;
        text-overflow:ellipsis;
        white-space: nowrap;
        box-sizing: border-box;
        text-align: left;
    }
    .delete_check {
        background: url(../../img/btn_deleteannounce.png) 0px 0px no-repeat;
        font-size: 12px;
        width: 83px;
        height: 28px;
        line-height: 25px;
        padding-left: 28px;
    }
    .nameBtn{
        color: #54b6fe;
        display: inline-block;
        overflow: hidden;
        text-overflow:ellipsis;
        white-space:nowrap;
        width:180px;
    }
    .span_1{
        float: left;
        margin-left: 5px;
        margin-top: 2px;
    }
    .div_check{
        margin-left:11%;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>


<body style="font-family: 微软雅黑;">
<div class="box" style="width: 100%;height: 100%;">
    <div class="navigation  clearfix">
        <div class="left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/workPlanManager.png">
            <div class="news">
                <fmt:message code="event.th.WorkPlanManagement" />
            </div>
            <select id="type" style="float:left;margin-top: 21px">
                <option value="0"><fmt:message code="event.th.AllCategories" /></option>
            </select>
            <select id="statusFlag" style="float:left;margin-left:30px;margin-top: 21px">
                <option value="0"><fmt:message code="event.th.AllPlans" /></option>
                <option value="1"><fmt:message code="event.th.EndProject" /></option>
                <option value="2"><fmt:message code="event.th.UnfinishedProject" /></option>
            </select>
            <div id="cx" class="submit" style="float:left;margin-left:30px">
                <fmt:message code="global.lang.query" />
            </div>
        </div>
        <%--分页按钮--%>
        <div id="dbgz_page" class="M-box3 fr" style="margin-right: 6%;margin-top: 2%">

        </div>
    </div>



    <span style="margin-left: 13px;margin-bottom: 10px;"><fmt:message code="event.th.Note" /></span>
    <div>
        <table id="tr_td" style="margin-left: 1%;width: 98%;table-layout: fixed" >
            <thead>
            <tr>
                <td class="th" width="6%"><fmt:message code="global.lang.select" /></td>
                <td class="th" width="5%"><fmt:message code="workflow.th.Serial" /></td>
                <td class="th" width="15%"><fmt:message code="event.th.PlanName" /></td>
                <td class="th titleOne" width="10%"><fmt:message code="sup.th.startTime" /></td>
                <td class="th" width="10%"><fmt:message code="meet.th.EndTime" /></td>
                <td class="th" width="10%"><fmt:message code="event.th.PlanCategory" /></td>
                <td class="th" width="10%"><fmt:message code="event.th.PersonCharge" /></td>
                <td class="th" width="10%"><fmt:message code="event.th.Participanta" /></td>
               <%-- <td class="th"><fmt:message code="email.th.file" /></td>--%>
                <td class="th" width="10%"><fmt:message code="notice.th.state" /></td>
                <td class="th notice_do" width="15%"><fmt:message code="notice.th.operation" /></td>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
</div>



<script>
	 //进行条件查询方法，并在列表中显示
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
            type:null,
            statusFlag:null
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
                            '<td><input type="checkbox" class="checkChild" planId="'+data[i].planId+'" ></td>' +
                            '<td>'+(i+1)+'</td>' +
                            '<td title="'+data[i].name+'"><a href="javascript:void(0)" class="nameBtn"  planId="'+data[i].planId+'">'+data[i].name+'</a></td>' +
                            '<td>'+data[i].beginDate+'</td>' +
                            '<td>'+data[i].endDateStr+'</td>' +
                            '<td>'+data[i].typeName+'</td>' +
                            '<td>'+data[i].managerName+'</td>' +
                            '<td>'+data[i].participatorName+'</td>';
                     /*   if(data[i].attachmentId=="" || data[i].attachmentId=="undefined"){
                            str+='<td><fmt:message code="event.th.nothing" /></td>';
                        }else{
                            str+='<td><fmt:message code="event.th.Yes" /></td>';
                        }*/

                      if(data[i].publish=="1"){
                          if(data[i].suspendFlag==0){
                              str+='<td><fmt:message code="event.th.suspend" /></td>';
                          }else{
                              if(data[i].status==1){
                                  str+='<td><fmt:message code="event.th.suspend" /></td>';
                              }else if(data[i].status==2){
                                  str+='<td><fmt:message code="meet.th.HaveHand" /></td>';
                              }else if(data[i].status==3){
                                  str+='<td><fmt:message code="meet.th.IsOver" /></td>';
                              }else{
                                  str+='<td></td>';
                              }
                          }
                      }else{
                          str+='<td><fmt:message code="notice.th.unposted" /></td>';
                      }
                        str+= '<td><a class="edit_btn" href="../../workPlan/workPlanEdit?editFlag=1&planId='+data[i].planId+'"><fmt:message code="global.lang.edit" /></a>' +
                            ' &nbsp;' +
                            '<span class="del_btn" planId="'+data[i].planId+'"><fmt:message code="menuSSetting.th.deleteMenu" /></span>' +
                            ' &nbsp;';
                        if(data[i].opinionLeader==$.cookie("uid")+","){
                            str+='<span class="approve_btn btn" planId="'+data[i].planId+'"><fmt:message code="workflow.th.pizhu" /></span>' +
                            ' &nbsp;';
                        }

                       if(data[i].publish=="1"){
                           if(data[i].status==2){
                               if(data[i].suspendFlag==0){
                                   str+= '<span class="goOn_btn btn" planId="'+data[i].planId+'" onclick="modifyStatus(1,'+data[i].planId+')"><fmt:message code="event.th.Continue" /></span>'+ ' &nbsp;';
                               }else{
                                   str+='<span class="suspend_btn btn" planId="'+data[i].planId+'" onclick="modifyStatus(0,'+data[i].planId+')"><fmt:message code="event.th.suspend" /></span>'+ ' &nbsp;';
                               }
                               str+='<span class="end_btn btn" planId="'+data[i].planId+'" onclick="modifyStatus(3,'+data[i].planId+')"><fmt:message code="meet.th.End" /></span>';
                           }else{
                               str+='<span class="effec_btn btn" planId="'+data[i].planId+'" onclick="modifyStatus(2,'+data[i].planId+','+data[i].status+')" publish="'+data[i].publish+'" status="'+data[i].status+'"><fmt:message code="notice.state.effective" /></span>';
                           }
                       }else{
                           str+='<span class="effec_btn btn" planId="'+data[i].planId+'" onclick="modifyStatus(2,'+data[i].planId+','+data[i].status+')" publish="'+data[i].publish+'" status="'+data[i].status+'"><fmt:message code="notice.state.effective" /></span>';
                       }
                        str+='</td></tr>';
                    }
                    str += '<tr><td colspan="2"><div class="div_check"><input id="checkedAll" style="float:left" type="checkbox"  conid="29" name="check" value=""><span class="span_1"><fmt:message code="notice.th.allchose" /></span></td><td colspan="3"></div><div class="delete_check" style="cursor:pointer;width:95px;padding-left:20px;"><fmt:message code="event.th.DeleteSelectedProject" /></div></td><td colspan="5"></td></tr>'
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

    //删除操作
    $("#tr_td").on("click",".del_btn",function () {
        var id= $(this).attr("planId");
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteWorkPlan" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/workPlan/delWorkPlanById',
                type: 'get',
                data: {
                    planId: id,
                },
                dataType: 'json',
                success: function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1}, function () {
                            window.location.href = '<%=basePath%>/workPlan/workPlanManager';
                        });
                    }
                }
            })
        }, function () {
            layer.closeAll();
        });
    })

    /**
     * 查询按钮
     */
    $(".submit").click(function(){
        ajaxPage.data.page=1;
        ajaxPage.data.type=$("#type").val();
        ajaxPage.data.statusFlag=$("#statusFlag").val();
        ajaxPage.page()
    })

    /**
     * 修改状态：暂停、结束、生效
     */
    function modifyStatus(flag,planId,status) {
        var data={};
        if(flag==0){//暂停按钮
            data={
                planId:planId,
                suspendFlag:0
            }
        }else if(flag==3){//结束按钮
            var myDate = new Date();
            data={
                planId:planId,
                endDate:myDate.getFullYear()+"-"+parseInt(myDate.getMonth()+1)+"-"+myDate.getDate()
            }
        }else if(flag==2){//生效按钮
            var status=$(this).attr("status");
            var publish=$(this).attr("publish");
            if(publish=="1"){//判断是否发布，已发布
                if(status==1){//未开始，将开始日期改为现在日期，即可生效
                    data={
                        planId:planId,
                        beginDate:myDate.getFullYear()+"-"+parseInt(myDate.getMonth()+1)+"-"+myDate.getDate()
                    }
                }else{
                    data={//已结束，将结束日期清空，即可生效
                        planId:planId,
                        clearEndClearFlag:"1"
                    }
                }
            }else{//未发布
                if(status==1){//未开始，将开始日期改为现在日期，即可生效
                    data={
                        planId:planId,
                        beginDate:myDate.getFullYear()+"-"+parseInt(myDate.getMonth()+1)+"-"+myDate.getDate(),
                        publish:"1"
                    }
                }else{
                    data={//已结束，将结束日期清空，即可生效
                        planId:planId,
                        clearEndClearFlag:"1",
                        publish:"1"
                    }
                }
            }
        }else{//继续按钮
            data={//已结束，将结束日期清空，即可生效
                planId:planId,
                suspendFlag:1
            }
        }
        $.ajax({
            url:"/workPlan/updateWorkPlanById",
            type:'post',
            dataType:'json',
            data:data,
            success:function (json) {
                if(json.flag) {
                    $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                        ajaxPage.data.page=1;
                        ajaxPage.page()
                    });
                }else{
                    $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                    });
                }
            }
        })
    }

    $(function () {
        selType()
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
                    var str='<option value="0"><fmt:message code="event.th.AllCategories" /></option>';
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>';
                    }
                    $("#type").html(str);
                }
            }
        })
    }

    //批注按钮
    $("#tr_td").on("click",".approve_btn",function () {
        var planId=$(this).attr("planId");
        layer.open({
            type: 1,
            title: ['<fmt:message code="event.th.Leader" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['900px', '90%'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content: '<div class="showWorkDetail">' +
            '<div style="font-size: 17px;margin-left: 60px;margin-top: 13px;margin-bottom: -18px;" class="list"><fmt:message code="event.th.LeaderAnnotationRecord" /></div>' +
            '<div class="table list">' +
            '<table style="width: 90%; margin-left:60px; margin-top: 30px;" class="showDetail">' +
            '<tr>' +
            '<td><fmt:message code="event.th.Leader" /></td>' +
            '<td><fmt:message code="event.th.CommentContent" /></td>' +
            '<td><fmt:message code="event.th.CommentTime" /></td>' +
            '<td><fmt:message code="notice.th.operation" /></td>' +
            '</tr>' +
            '<tbody class="tbody"></tbody>' +
            '</table>' +
            '</div></div>' +
            '<div class="div_table" style="margin-left: 15px;">' +
            '<div style="font-size: 17px;margin-left: 44px;margin-top: 23px;margin-bottom: -13x;" class="textContent"><fmt:message code="event.th.AddLeaderComments" /></div>' +
            '<div class="div_tr">' +
            '<input type="hidden" id="detailId">' +
            '<input type="hidden" id="planId">' +
            '<table class="" style="width: 92%; margin-left:45px; margin-top: 25px;">'+
            '<tr>'+
            '<td><fmt:message code="event.th.CommentTime" />：</td>'+
            '<td><input name="writeTime" id="writeTime" type="text" style="width: 379px" disabled readonly></td>'+
            '</tr>'+
            '<tr>'+
            '<td><fmt:message code="event.th.CommentContent" />：</td>'+
            '<td><textarea name="progress" id="progress"  cols="60" rows="7"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></td>'+
            '</tr>'+
            '<tr><td  colspan="2"><input type="button" value="<fmt:message code="global.lang.ok" />" onclick="saveDetail()" style="width: 70px;height: 28px;margin-left: 46%"></td></tr>'+
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
                'typeFlag':1
            },
            success:function(res){
                var data =res.obj;
                var str='';
                for(var i=0;i<data.length;i++){
                    str+='<tr>' +
                        '<td>'+data[i].writerName+'</td>' +
                        '<td>'+data[i].progress+'</td>';
                   /* if(data[i].attachmentId==""||data[i].attachmentId=="undefined"){
                        str+='<td><fmt:message code="event.th.nothing" /></td>';
                    }else{
                        str+='<td><fmt:message code="event.th.Yes" /></td>';
                    }*/
                    str+='<td>'+data[i].writeTime+'</td>' +
                        '<td><span class="edit_btn btn" id="editDetail" onclick="editDetail('+data[i].detailId+',1)"><fmt:message code="depatement.th.modify" /></span>&nbsp;' +
                        '<span class="del_btn btn" id="delDetail" onclick="delDetail('+data[i].detailId+')"><fmt:message code="global.lang.delete" /></span></td>' +
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
        $(".textContent").html("<fmt:message code="event.th.ModifyLeaderComments" />");
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
                $("#progress").val(data.progress);
            }
        })
    }

    //领导批注的添加和修改
    function saveDetail(){
        if($("#progress").val()==""){
            $.layerMsg({content:"<fmt:message code="event.th.Comment" />！",icon:2},function(){
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
                    typeFlag:1
                },
                success: function (res) {
                    if(res.flag){
                        $.layerMsg({content:"<fmt:message code="url.th.addSuccess" />！",icon:1},function(){
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
                        $.layerMsg({content:"<fmt:message code="depatement.th.Modifysuccessfully" />！",icon:1},function(){
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
                    $.layerMsg({content:"<fmt:message code="workflow.th.delsucess" />！",icon:1},function(){
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
            title: ['工作计划详情', 'background-color:#2b7fe0;color:#fff;'],
            area: ['750px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content:
            '<div style="margin-left:1%;margin-top:10px;margin-bottom: 10px"><span class="" style="font-size: 17px;font-family: 微软雅黑;"> <fmt:message code="event.th.DetailedWork" /></span><br></div>'+
            '<table class="TableBlock"  width="65%" style="margin-left:1%">'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.PlanName" /></td>'+
            '<td align="left" class="TableData"><span id="name"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.PlanContent" /> </td>'+
            '<td align="left" class="TableData Content" style="word-break:break-all "><span id="content"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="sup.th.startTime" /></td>'+
            '<td nowrap align="left" class="TableData"><span id="beginDate"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="meet.th.EndTime" /></td>'+
            '<td nowrap align="left" class="TableData"><span id="endDate"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.PlanCategory" /></td>'+
            '<td nowrap align="left" class="TableData"><span id="typeName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.OpenSector" /></td>'+
            '<td align="left" class="TableData"><span id="toName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.OpenPersonnel" /></td>'+
            '<td align="left" class="TableData"><span id="toPersonName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.PersonCharge" /></td>'+
            '<td nowrap align="left" class="TableData"><span id="managerName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.Participanta" /></td>'+
            '<td align="left" class="TableData"><span id="participator"></span></tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="file.th.builder" /> </td>'+
            '<td nowrap align="left" class="TableData"><span id="creatorName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.EndorsementLeadership" /> </td>'+
            '<td nowrap align="left" class="TableData"><span id="opinionLeaderName"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"> <fmt:message code="sms.th.CreationDate" /></td>'+
            '<td nowrap align="left" class="TableData"><span id="createDate"></span></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="event.th.LeaderComments" /> </td>'+
            '<td nowrap align="left" class="TableData">'+
            '</td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="journal.th.Remarks" /></td>'+
            '<td align="left" class="TableData"></td>'+
            '</tr>'+
            '<tr>'+
            '<td nowrap align="center" class="TableContent" width="80"><fmt:message code="notice.th.state" /></td>'+
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
                           if(data.publish=="1"){
                               if(data.suspendFlag==0){
                                   $("#statusName").html("<fmt:message code="event.th.suspend" />");
                               }else{
                                   if(data.status==1){
                                       $("#statusName").html("<fmt:message code="event.th.NotBegin" />");
                                   }else if(data.status==2){
                                       $("#statusName").html("<fmt:message code="meet.th.HaveHand" />");
                                   }else if(data.status==3){
                                       $("#statusName").html("<fmt:message code="meet.th.IsOver" />");
                                   }
                               }
                           }else{
                               $("#statusName").html("<fmt:message code="notice.th.unposted" />");
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



    //进行多项删除
    $("#tr_td").on("click",".delete_check",function () {
        var planIds = "";
        $("#tr_td .checkChild:checkbox:checked").each(function () {
            var planId = $(this).attr("planId");
            planIds += planId + ",";
        })
        if (planIds == '') {
            $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
        } else {
            layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/workPlan/deleteWorkPlanByIds',
                    dataType: 'json',
                    data: {'planIds': planIds},
                    success: function () {
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        window.location.reload();
                    }
                })
            }, function () {
                layer.closeAll();
            });
        }
    })

    //点击全选
    $('#tr_td').on('click', '#checkedAll', function () {
        var state = $(this).prop("checked");
        if (state == true) {
            $(this).prop("checked", true);
            $(".checkChild").prop("checked", true);
            $(this).parents('tr').siblings('#notice_tr').addClass('bgcolor');
        } else {
            $(this).prop("checked", false);
            $(".checkChild").prop("checked", false);
            ;
            $(this).parents('tr').siblings('#notice_tr').removeClass('bgcolor');
        }
    })
</script>
</body>
</html>