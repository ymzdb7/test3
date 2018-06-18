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
	<title><fmt:message code="event.th.VehicleUsageQuery" /></title>
	<link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
	<link rel="stylesheet" type="text/css" href="../css/base.css" />
	<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
	<link rel="stylesheet" href="/lib/laydate/need/laydate.css">
	<script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
	<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
	<!-- word文本编辑器 -->
	<script src="../../lib/laydate/laydate.js"></script>
	<script src="../../lib/layer/layer.js"></script>
	<script src="/lib/jquery.form.min.js"></script>
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
		a{
			text-decoration: none;
			color: #0066cc;
			margin: 0 5px;
		}
		.center .login .ce1{
			margin-top:11px!important;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="bx">
	<div class="center">
		<div class="navigation  clearfix" style="margin-top: -66px;">
			<div class="left" >
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/vehicleQuery.png"/>
				<div class="news">
					<fmt:message code="event.th.VehicleUsageQuery" />
				</div>
			</div>
		</div>
		<div class="login" style="margin-bottom: 10px">
			<div class="header">
				<fmt:message code="event.th.PleaseCriteria" />
			</div>
			<form id="queryVehicleUseForm">
				<div class="middle">
					<div class="le ce1">
						<div class="color" style="width:135px;line-height: 24px">
							<fmt:message code="notice.th.state" /> ：
						</div>
						<div>
							<select name="vuStatusName" id="vuStatusName">
								<option value=""></option>
								<option value="0"><fmt:message code="event.th.Pending" /></option>
								<option value="1"><fmt:message code="event.th.HaveQuasi" /></option>
								<option value="2"><fmt:message code="event.th.inUse" /></option>
								<option value="3"><fmt:message code="meet.th.End" /></option>
								<option value="4"><fmt:message code="event.th.DoNotAssociate" /></option>
							</select>
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message code="event.th.LicensePlateNumber" />：</div>
						<div>
							<select id="vId" name="vId" type="text"></select>
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message code="event.th.Driver" />：</div>
						<div>
							<input id="vuDriver" name="vuDriver" type="text">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;line-height: 24px"><fmt:message code="hr.th.DateOfApplication" />：</div>
						<div>
							<input id="applyStartTime" name="applyStartTime" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
							<span style="float: left">&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span>
							<input id="applyEndTime" name="applyEndTime" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
						</div>
					</div>

					<div class="le publisher">
						<div class="color" style="width:135px;"><fmt:message code="event.th.VehicleMan" />：</div>
						<textarea name="vuUser1" id="vuUser1" class="vuUser1" user_id="" cols="24"></textarea>
						<a href="javascript:;" class="addVuUser"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearVuUser" onclick="emptyUser('vuUser1')"><fmt:message code="global.lang.empty" /></a>
					</div>

					<div class="le publisher">
						<div class="color" style="width:135px;line-height: 24px"><fmt:message code="event.th.VehicleDepartment" /> ：</div>
						<textarea name="vuDept1" id="vuDept1" class="vuDept1" deptid="" cols="24"></textarea>
						<a href="javascript:;" class="addvuDept"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearvuDept" onclick="emptyDept('vuDept1')"><fmt:message code="global.lang.empty" /></a>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="sms.th.StartDate" />：</div>
						<div>
							<input id="beginDate1" name="beginDate" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
							<span style="float: left">&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span>
							<input id="endDate1" name="endDate" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="attend.th.EndDate" />：</div>
						<div>
							<input id="beginDate" name="beginDate" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
							<span style="float: left">&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span>
							<input id="endDate" name="endDate" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
						</div>
					</div>

					<div class="le publisher">
						<div class="color" style="width:135px;"><fmt:message code="sup.th.Applicant" />：</div>
						<textarea name="vuProposer1" id="vuProposer" class="vuProposer" user_id="" cols="24"></textarea>
						<a href="javascript:;" class="addvuProposer"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearvuProposer" onclick="emptyUser('vuProposer1')"><fmt:message code="global.lang.empty" /></a>
					</div>


					<div class="le ce1" style="padding-bottom:15px">
						<div class="color" style="width:135px;"> <fmt:message code="event.th.Dispatcher" />：</div>
						<div>
							<select id="vuOperator" name="vuOperator" type="text"></select>
						</div>
					</div>

					<div class="le ce1" style="padding-bottom:15px">
						<div class="color" style="width:135px;"> <fmt:message code="attend.th.Reason" />：</div>
						<div>
							<input id="vuReason" name="vuReason" type="text">
						</div>
					</div>

					<div class="le ce1" style="padding-bottom:15px">
						<div class="color" style="width:135px;"> <fmt:message code="journal.th.Remarks" />：</div>
						<div>
							<input id="vuRemark" name="vuRemark" type="text">
						</div>
					</div>
				</div>
			</form>
			<div class="icons">
				<div id="btn_query"  style="margin-right:10px; cursor: pointer;" onclick="queryVehicleUseByCond(0) "><h2><fmt:message code="global.lang.query" /></h2></div>
				<div id="daochu"  style="margin-right:10px; cursor: pointer;" onclick="queryVehicleUseByCond(1) "><h2><fmt:message code="global.lang.report" /></h2></div>
			</div>
		</div>
	</div>


	<!--表单选项显示-->
	<div class="step1" style="display: none">
		<div class="navigation  clearfix">
			<div class="left">
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/vehicleQuery.png">
				<div class="news">
					<fmt:message code="event.th.VehicleUsageQuery" />
				</div>
			</div>
		</div>

		<!--table表单  标题栏 -->
		<div>
			<div>
				<table id="tr_td">
					<thead>
					<tr>
						<th class="th" style="width: 10%;"><fmt:message code="event.th.LicensePlateNumber" /></th>
						<th class="th" style="width: 10%;"><fmt:message code="event.th.VehicleMan" /></th>
						<th class="th" style="width: 10%;"><fmt:message code="attend.th.Reason" /></th>
						<td class="th titleOne" style="width: 10%;"><fmt:message code="event.th.Destinat" /></td>
						<th class="th" style="width: 10%;"><fmt:message code="sup.th.startTime" /></th>
						<th class="th" style="width: 10%;"><fmt:message code="meet.th.EndTime" /></th>
						<td class="th" style="width: 10%;"><fmt:message code="event.th.ActualEnd" /></td>
						<th class="th" style="width: 10%;"><fmt:message code="journal.th.Remarks" /></th>
						<td class="th notice_do" style="width: 15%;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
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
    $(".addVuUser").on("click",function(){//使用人
        user_id = "vuUser1";
        $.popWindow("../../common/selectUser?0");
    });
    $(".addvuProposer").on("click",function(){//申请人
        user_id = "vuProposer";
        $.popWindow("../../common/selectUser?0");
    });

	/* 选部门控件 */
    $(".addvuDept").on("click",function(){//用车部门
        dept_id = "vuDept1";
        $.popWindow("../../common/selectDept");
    });

    $(function () {
        //车牌号下拉列表
        $.ajax({
            url: '/veHicle/getAllVeHicle',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var str = '<option value=""></option>';
                var data = obj.obj;
                for (var i = 0; i < data.length; i++) {
                    str += '<option value="' + data[i].vId + '">' + data[i].vNum + '</option>';
                }
                $("#vId").html(str);
            }
        })

        //调度员下拉列表
        $.ajax({
            url: '/syspara/getOperator',
            type: 'get',
            dataType: 'json',
            data: {
                paraName: "OPERATOR_NAME"
            },
            success: function (obj) {
                var data = obj.object.eduUserList;
                var str = '<option value=""></option>';
                for (var i = 0; i < data.length; i++) {
                    str += '<option value="' + data[i].userId + '">' + data[i].userName + '</option>';
                }
                $("#vuOperator").html(str);
            }
        })
    })
    

    //进行条件查询方法，并在列表中显示
    function queryVehicleUseByCond(output) {
        if(output!=1){//查询按钮
            query();
        }else{//导出按钮
            window.location.href='<%=basePath%>/veHicleUsage/selectAllVeHicle?export='+output+'&vuStatusName='+$("#vuStatusName").val()+
                '&vId='+$("#vId").val()+'&vuDriver='+$("#vuDriver").val()+'&vuUser='+$("#vuUser1").attr("user_id")+
                '&vuDept='+$("#vuDept1").attr("deptid")+'&vuProposer='+$("#vuProposer").attr("user_id")+'&vuOperator='+$("#vuOperator").val()
				+'&vuReason='+$("#vuReason").val()+'&vuRemark='+$("#vuRemark").val();
        }
    }

    function query() {
        $('#queryVehicleUseForm').ajaxSubmit({
            url:"/veHicleUsage/selectAllVeHicle",
            type:'post',
            dataType:'json',
            data:{
                vuUser:$("#vuUser1").attr("user_id"),
                vuProposer:$("#vuProposer").attr("user_id"),
                vuDept:$("#vuDept1").attr("deptid")
			},
            success:function (json) {
                $("#tr_td tbody").html("");
                var str="";
                var data=json.obj;
                if(json.flag) {
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td><a class="detail_btn" vId="'+data[i].vId+'">'+data[i].vIdNum+'</a></td>' +
                            '<td>'+data[i].vuUserName+'</td>' +
                            '<td>'+data[i].vuReason+'</td>' +
                            '<td>'+data[i].vuDestination+'</td>' +
                            '<td>'+function(){
                                if(data[i].vuStart!=undefined){
                                    return data[i].vuStart;
                                }else{
                                    return "";
                                }
                            }()+'</td>'+
                            '<td>'+function(){
                                if(data[i].vuEnd!=undefined){
                                    return data[i].vuEnd;
                                }else{
                                    return "";
                                }
                            }()+'</td>'+
                            '<td>'+function(){
                                if(data[i].vuFinalEnd!=undefined){
                                    return data[i].vuFinalEnd;
                                }else{
                                    return "";
                                }
                            }()+'</td>'+
                            '<td>'+data[i].vuRemark+'</td>'+
                            '<td><a class="useDetail_btn" vuId="'+data[i].vuId+'" style="cursor: pointer"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;<a class="del_btn" vuId="'+data[i].vuId+'" style="cursor: pointer"><fmt:message code="global.lang.delete" /></a></td>'+
                             '</tr>';
                    }
                    $("#tr_td tbody").html(str);
					$(".center").hide();
					$(".step1").show();
                }
            }
        })
    }

    //删除操作
    $("#tr_td").on("click",".del_btn",function () {
        var id= $(this).attr("vuId");
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteVehicleInformation" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/veHicleUsage/deleteVehicleUsage',
                type: 'get',
                data: {
                    vuId: id,
                },
                dataType: 'json',
                success: function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1}, function () {
                            query();
                        });
                    }
                }
            })
        }, function () {
            layer.closeAll();
        });
    })

    //详细信息按钮
	$('#tr_td').on('click','.useDetail_btn',function(){
         $.popWindow('<%=basePath%>veHicle/veHicledetail?vuId='+$(this).attr("vuId"),'<fmt:message code="event.th.VehicleDetails" />','100','300','1000px','700px');
    })


    //点击车牌号显示车辆详细信息
     $('#tr_td').on('click','.detail_btn',function(){
          $.popWindow('<%=basePath%>veHicle/veDetail?vId='+$(this).attr("vId"),'<fmt:message code="event.th.VehicleDetails" />','100','300','1000px','700px');
	 })
</script>