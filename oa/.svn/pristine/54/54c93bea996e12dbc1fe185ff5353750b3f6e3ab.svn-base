<%--需把局部样式归并为一个通用或符合公告管理的公共样式，
接口对完需调整--%>

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
<head lang="en">
	<meta charset="UTF-8">
	<title><fmt:message code="event.th.WorkPlanQuery" /></title>
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
	<style>
		#cont_totals td{
			color: #000;
			font-weight: normal;
		}
		table{
			table-layout:fixed;
		}
		#tr_td tr td.publishtip {
			overflow: hidden;
			text-overflow:ellipsis;
			height: 40px;
			width: 40px;
			white-space:nowrap;
		}
		.news_t h1,.news_two h1{
			line-height: 23px;
			text-align: center;
		}
		.add_print h1,.add_down h1{
			color: #000;
			line-height: 20px;
			text-align: center;
		}
		.title a{
			color: #59b7fb;
		}
		.caozuo a:hover{
			color:#287fe0;
		}
		.center .login .icons div{
			margin-left:9px !important;
		}

		.icons div {
			float: left;
			line-height: 30px;
		}
		#daochu{
			background: url(../../img/news/new_export.png) no-repeat;
		}
		#btn_query{
			background: url(../img/file/cabinet03.png) no-repeat;
		}
		.icons h2{
			text-align: center;
			width: 71%;
		}
		table tr td input {
			height: 25px;
			border: #ccc 1px solid;
			padding-left: 5px;
		}
		.notice_top h2,.notice_notop h2,.delete_check h2,.delete_all h2{
			text-align: left;
			margin-left: 12px;
		}
		.navigation{
			/*display: inline-block;*/
			float: left;
			width: 96% !important;
			margin-left: 2%;
		}
		table td{
			overflow: hidden;
			text-overflow: ellipsis;
			white-space: nowrap;
		}
		.le input[type='text']{
			height: 25px;
			width: 160px;
		}
		.le input[type='radio']{
			height: 14px;
			margin-top: 6px;
		}
		#tr_td td{
			text-align: center;
		}
		.center .login{
			height: 100%;
		}
		.btn{
			color: #1772C0;
			cursor: pointer;
		}
		.center .login .icons{
			padding-left: 195px;
		}
		.del_btn {
			color: #E01919;
			cursor: pointer;
		}
		.edit_btn {
			color: #1772C0;
			cursor: pointer;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="bx" style="padding-bottom: 50px">
	<div class="center">
		<div class="navigation  clearfix" style="margin-top: -66px;">
			<div class="left" >
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/workPlanQuery.png"/>
				<div class="news">
					<fmt:message code="event.th.WorkPlanQuery" />
				</div>
			</div>
		</div>
		<div class="login" style="margin-bottom: 10px">
			<div class="header">
				<fmt:message code="event.th.PleaseCriteria" />
			</div>
			<form id="queryWorkPlanForm">
				<div class="middle">
					<div class="le ce1">
						<div class="color" style="width:175px;text-align: center">
							<fmt:message code="event.th.PlanName" /> ：
						</div>
						<div>
							<input id="name" name="name" type="text" />
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:175px;text-align: center"> <fmt:message code="event.th.PlanContent" />：</div>
						<div>
							<input id="content" name="content" type="text">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:175px;text-align: center"><fmt:message code="notice.th.validity" />：</div>
						<div>
							<span style="float: left"><fmt:message code="hr.th.from" />&nbsp;</span>
							<input id="beginDate" name="beginDate" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
							<span style="float: left">&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span>
							<input id="endDate" name="endDate" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:175px;text-align: center"><fmt:message code="event.th.PlanType" />：</div>
						<div>
							<select style="width: 164px;height: 32px" id="type" name="type"></select>
						</div>
					</div>

					<div class="le publisher">
						<div class="color" style="width:175px;text-align: center"><fmt:message code="vote.th.Publication(Department)" /> ：</div>
						<textarea name="toName" id="toName" class="toName" deptid="" cols="24"></textarea>
						<a href="javascript:;" class="addToId"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearToId" onclick="emptyDept('toName')"><fmt:message code="global.lang.empty" /></a>
					</div>
					<div class="le publisher">
						<div class="color" style="width:175px;text-align: center"><fmt:message code="vote.th.Release(personnel)" />：</div>
						<textarea name="toPersonName" id="toPersonName" class="toPersonName" dataid="" cols="24"></textarea>
						<a href="javascript:;" class="addToPerson"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearToPerson" onclick="emptyUser('toPersonName')"><fmt:message code="global.lang.empty" /></a>
					</div>
					<div class="le publisher">
						<div class="color" style="width:175px;text-align: center"><fmt:message code="event.th.Participanta" />：</div>
						<textarea name="custodion1" id="participatorName" class="participatorName" dataid="" cols="24"></textarea>
						<a href="javascript:;" class="addParticipator"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearParticipator" onclick="emptyUser('participatorName')"><fmt:message code="global.lang.empty" /></a>
					</div>
					<div class="le publisher">
						<div class="color" style="width:175px;text-align: center"><fmt:message code="journal.th.Remarks" />：</div>
						<textarea name="managerName" id="managerName" class="managerName" dataid="" cols="24"></textarea>
						<a href="javascript:;" class="addManager"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearManager" onclick="emptyUser('managerName')"><fmt:message code="global.lang.empty" /></a>
					</div>

					<div class="le ce1" style="padding-bottom:15px">
						<div class="color" style="width:175px;text-align: center"> <fmt:message code="journal.th.Remarks" />：</div>
						<div>
							<input id="remark" name="remark" type="text">
						</div>
					</div>
				</div>
			</form>
			<div class="icons">
				<div id="btn_query"  style="margin-right:10px; cursor: pointer;" onclick="queryWorkPlanByCond(0) "><h2><fmt:message code="global.lang.query" /></h2></div>
				<div id="daochu"  style="margin-right:10px; cursor: pointer;" onclick="queryWorkPlanByCond(1) "><h2><fmt:message code="global.lang.report" /></h2></div>
			</div>
		</div>
	</div>


	<!--表单选项显示-->
	<div class="step1" style="display: none">
		<div class="navigation  clearfix">
			<div class="left">
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/workPlanQuery.png">
				<div class="news">
					<fmt:message code="event.th.WorkPlanQuery" />
				</div>
			</div>
			<%--分页按钮--%>
			<div id="dbgz_page" class="M-box3 fr" style="margin-top: 2%">
			</div>
		</div>

		<!--table表单  标题栏 -->
		<div>
			<div>
				<table id="tr_td" style="margin-left: 1%;width: 98%;">
					<thead>
					<tr>
						<%--<td class="th" style="width: 5%;text-align: center"><fmt:message code="global.lang.select" /></td>--%>
						<td class="th" style="width: 5%;text-align: center"><fmt:message code="workflow.th.Serial" /></td>
						<td class="th" style="width: 10%;text-align: center"><fmt:message code="event.th.PlanName" /></td>
						<td class="th titleOne" style="width: 9%;text-align: center"><fmt:message code="sup.th.startTime" /></td>
						<td class="th" style="width: 9%;text-align: center"><fmt:message code="meet.th.EndTime" /></td>
						<td class="th" style="width: 8%;text-align: center"><fmt:message code="event.th.PlanCategory" /></td>
						<td class="th" style="width: 10%;text-align: center"><fmt:message code="event.th.PersonCharge" /></td>
						<td class="th" style="width: 10%;text-align: center"><fmt:message code="event.th.Participanta" /></td>
						<td class="th" style="width: 8%;text-align: center"><fmt:message code="notice.th.state" /></td>
						<td class="th notice_do" style="width: 18%;text-align: center"><fmt:message code="notice.th.operation" /></td>
					</tr>
					</thead>
					<tbody id="j_tb"></tbody>
				</table>
			</div>
		</div>
	</div>
</div>


</body>
</html>

<script>
    //时间控件
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
        format: 'YYYY-MM-DD',
		/*min: laydate.now(),*/
		/*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }
    //清空部门控件
    function emptyDept(id){
        $("#"+id).val("");
        $("#"+id).attr("deptid","");
    }
	/* 选人控件 */
    $(".addToPerson").on("click",function(){//发布范围（人员）
        user_id = "toPersonName";
        $.popWindow("../../common/selectUser?0");
    });
    $(".addParticipator").on("click",function(){//参与人
        user_id = "participatorName";
        $.popWindow("../../common/selectUser?0");
    });
    $(".addManager").on("click",function(){//负责人
        user_id = "managerName";
        $.popWindow("../../common/selectUser?0");
    });
    $(".addLeader").on("click",function(){//批注领导
        user_id = "leader";
        $.popWindow("../../common/selectUser?0");
    });
	/* 选部门控件 */
    $(".addToId").on("click",function(){//发布范围（部门）
        dept_id = "toName";
        $.popWindow("../../common/selectDept?0");
    });


    //进行条件查询方法，并在列表中显示
    function queryWorkPlanByCond(output) {
        if(output!=1){//查询按钮
            ajaxPage.data.toId=$("#toName").attr("deptid"),
			ajaxPage.data.toPersonId=$("#toPersonName").attr("dataid"),
            ajaxPage.data.participator=$("#participatorName").attr("dataid"),
            ajaxPage.data.manager=$("#managerName").attr("dataid"),
            ajaxPage.data.page=1;
            ajaxPage.page();
            $(".center").hide();
            $(".step1").show();
        }else{//导出按钮

            window.location.href='<%=basePath%>/workPlan/selectWorkPlanByCond?output='+output+'&name='+$("#name").val()+
                '&content='+$("#content").val()+'&beginDate='+$("#beginDate").val()+'&endDate='+$("#endDate").val()+
                '&type='+$("#type").val()+'&toId='+$("#toName").attr("deptid")+'&toPerson='+$("#toPersonName").attr("dataid")
				+'&participator='+$("#participatorName").attr("dataid")+'&manager='+$("#managerName").attr("dataid")+'&remark='+$("#remark").val();
        }
    }

    //进行条件查询方法，并在列表中显示
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
            output:0,
            toId:null,
            toPersonId:null,
            participator:null,
            manager:null,
            opinoin:null,
        },
        init:function () {
        },
        page:function () {
            var me=this;
            $('#queryWorkPlanForm').ajaxSubmit({
                url:"/workPlan/selectWorkPlanByCond",
                type:'post',
                dataType:'json',
                data:me.data,
                success:function (json) {
                    $("#tr_td tbody").html("");
                    var str="";
                    var data=json.obj;
                    if(json.flag) {
                        for(var i=0;i<data.length;i++){
                            str+='<tr>' +
//                                '<td  style="width: 5%;text-align: center"><input type="checkbox" style="margin-left: 5px;"></td>' +
                                '<td  style="width: 5%;text-align: center">'+data[i].planId+'</td>' +
                                '<td  style="width: 10%;text-align: center">'+data[i].name+'</td>' +
                                '<td style="width: 9%;text-align: center">'+data[i].beginDate+'</td>' +
                                '<td style="width: 9%;text-align: center">'+data[i].endDateStr+'</td>' +
                                '<td style="width: 8%;text-align: center">'+data[i].typeName+'</td>' +
                                '<td style="width: 10%;text-align: center">'+data[i].managerName+'</td>' +
                                '<td style="width: 10%;text-align: center">'+data[i].participatorName+'</td>';
                           /* if(data[i].attachmentId=="" || data[i].attachmentId=="undefined"){
                                str+='<td style="width: 8%;text-align: center"><fmt:message code="event.th.nothing" /></td>';
                            }else{
                                str+='<td style="width: 8%;text-align: center"><fmt:message code="event.th.Yes" /></td>';
                            }*/

                            if(data[i].suspendFlag==0){
                                str+='<td style="width: 8%;text-align: center"><fmt:message code="event.th.suspend" /></td>';
                            }else{
                                if(data[i].status==1){
                                    str+='<td style="width: 8%;text-align: center"><fmt:message code="event.th.NotBegin" /></td>';
                                }else if(data[i].status==2){
                                    str+='<td style="width: 8%;text-align: center"><fmt:message code="meet.th.HaveHand" /></td>';
                                }else if(data[i].status==3){
                                    str+='<td style="width: 8%;text-align: center"><fmt:message code="meet.th.IsOver" /></td>';
                                }else{
                                    str+='<td></td>';
								}
                            }
                            str+= '<td style="width: 18%;text-align: center"><a class="edit_btn" href="../../workPlan/workPlanEdit?editFlag=1&planId='+data[i].planId+'"><fmt:message code="global.lang.edit" /></a>' +
                                ' &nbsp;' +
                                '<span class="del_btn" planId="'+data[i].planId+'" style="cursor: pointer"><fmt:message code="global.lang.delete" /></span>' +
                                ' &nbsp;' ;
                            if(data[i].opinionLeader==$.cookie("uid")+","){
                                str+='<span class="approve_btn btn" planId="'+data[i].planId+'"><fmt:message code="workflow.th.pizhu" /></span>' +
                                    ' &nbsp;';
                            }
                            if(data[i].status==2){
                                if(data[i].suspendFlag==0){
                                    str+= '<span class="goOn_btn btn" planId="'+data[i].planId+'" style="cursor: pointer" onclick="modifyStatus(1,'+data[i].planId+')"><fmt:message code="event.th.Continue" /></span>'+ ' &nbsp;';
                                }else{
                                    str+='<span class="suspend_btn btn" planId="'+data[i].planId+'" style="cursor: pointer" onclick="modifyStatus(0,'+data[i].planId+')"><fmt:message code="event.th.suspend" /></span>'+ ' &nbsp;';
                                }
                                str+='<span class="end_btn btn" planId="'+data[i].planId+'" style="cursor: pointer" onclick="modifyStatus(3,'+data[i].planId+')"><fmt:message code="meet.th.End" /></span></td>';
                            }else{
                                str+='<span class="effec_btn btn" planId="'+data[i].planId+'" style="cursor: pointer" onclick="modifyStatus(2,'+data[i].planId+','+data[i].status+')" status="'+data[i].status+'"><fmt:message code="notice.state.effective" /></span></td>';
                            }
                            str+='</td></tr>';
                        }
                        $("#tr_td tbody").html(str);
                    }
                    me.pageTwo(json.totleNum,me.data.pageSize,me.data.page)
                }
            })
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


    //加载工作计划类型下拉列表
    function selType(){
        $.ajax({
            url:"/planType/selAllPlanType",
            type:'post',
            dataType:'json',
            success:function (json) {
                var data=json.obj;
                if(json.flag){
                    var str='<option value="0"><fmt:message code="hr.th.PleaseSelect" /></option>';
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>';
                    }
                    $("#type").html(str);
                }
            }
        })
    }

    $(function () {
		selType();
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
                    /*if(data[i].attachmentId==""||data[i].attachmentId=="undefined"){
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

</script>