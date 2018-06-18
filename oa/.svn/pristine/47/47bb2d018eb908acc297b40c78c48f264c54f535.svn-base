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
	<title><fmt:message code="event.th.MaintenanceRecord" /></title>
	<link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
	<link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
	<link rel="stylesheet" type="text/css" href="../css/base.css" />
	<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
	<script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
	<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
	<script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
	<!-- word文本编辑器 -->
	<script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
	<script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
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
			/*margin-left:9px !important;*/
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
		.center .login .icons {
			padding-left: 0px;
		}
		.center .login .ce1{
			margin-top:25px;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="bx">
	<div class="center">
		<div class="navigation  clearfix" style="margin-top: -66px;">
			<div class="left" >
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleFix.png">&nbsp;&nbsp;
				<div class="news">
					<fmt:message code="event.th.MaintenanceRecord" />
				</div>
			</div>
		</div>
		<div class="login" style="margin-bottom: 10px">
			<div class="header">
				<fmt:message code="event.th.PleaseCriteria" />
			</div>
			<form id="queryMainForm">
				<div class="middle">
					<div class="le ce1">
						<div class="color" style="width:135px;">
							<fmt:message code="event.th.LicensePlateNumber" /> ：
						</div>
						<div>
							<select id="vId" name="vId"></select>
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="event.th.MaintenanceDate" />：</div>
						<div>
							<input id="startTime" name="startTime" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
							<span style="float: left">&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span>
							<input id="endTime" name="endTime" type="text" style="float: left;width: 130px" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="event.th.MaintenanceType" />：</div>
						<div>
							<select style="width: 164px;height: 32px" id="vmType" name="vmType"></select>
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message code="event.th.MaintenanceReason" />：</div>
						<div>
							<input name="vmReason" id="vmReason" style="width: 270px; height: 30px;">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message code="workflow.th.Manager" />：</div>
						<div>
							<input id="vmPerson" name="vmPerson" type="text">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="event.th.maintenanceCost" />：</div>
						<div>
							<input id="startFee" name="startFee" type="text" style="float: left;width: 130px">
							<span style="float: left">&nbsp;<fmt:message code="global.lang.to" />&nbsp;</span>
							<input id="endFee" name="endFee" type="text" style="float: left;width: 130px">
						</div>
					</div>

					<div class="le ce1" style="padding-bottom:15px">
						<div class="color" style="width:135px;"><fmt:message code="journal.th.Remarks" />：</div>
						<div>
							<input id="vmRemark" name="vmRemark" type="text">
						</div>
					</div>
				</div>
			</form>
			<div class="icons">
				<div id="btn_query"  style="margin-right:10px; cursor: pointer;margin-left: 175px;margin-top: 16px;" onclick="queryMainByCond(0) "><h2><fmt:message code="global.lang.query" /></h2></div>
				<div id="daochu"  style="margin-right:10px; cursor: pointer;margin-top: 16px;" onclick="queryMainByCond(1) "><h2><fmt:message code="global.lang.report" /></h2></div>
			</div>
		</div>
	</div>


	<!--表单选项显示-->
	<div class="step1" style="display: none">
		<div class="navigation  clearfix">
			<div class="left">
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/gonggaoguanli.png">
				<div class="news">
					<fmt:message code="event.th.MaintenanceRecord" />
				</div>
			</div>
		</div>

		<!--table表单  标题栏 -->
		<div>
			<div>
				<table id="tr_td">
					<thead>
					<tr>
						<th class="th"><fmt:message code="event.th.LicensePlateNumber" /></th>
						<td class="th"><fmt:message code="event.th.MaintenanceType" /></td>
						<td class="th" ><fmt:message code="event.th.MaintenanceReason" /></td>
						<td class="th titleOne"><fmt:message code="event.th.MaintenanceDate" /></td>
						<td class="th"><fmt:message code="workflow.th.Manager" /></td>
						<td class="th"><fmt:message code="event.th.maintenanceCost" /></td>
						<td class="th"><fmt:message code="journal.th.Remarks" /></td>
						<td class="th notice_do"><fmt:message code="menuSSetting.th.menuSetting" /></td>
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

    var queryFlag=${queryFlag};//查询标志，1为查询，0列表展示

	$(function(){
        //删除操作
        $("#tr_td").on("click",".del_btn",function () {
            var vmId= $(this).attr("vmId");
            layer.confirm('<fmt:message code="workflow.th.que" />？', {
                btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
                title: "<fmt:message code="event.th.DeleteMaintenance" />"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    url: '/tenance/deleteMaintenance',
                    type: 'get',
                    data: {
                        vmId: vmId,
                    },
                    dataType: 'json',
                    success: function (json) {
                        if (json.flag) {
                            <%--layer.msg({content:'<fmt:message code="workflow.th.delsucess" />！', icon: 1});--%>
                            layer.msg('<fmt:message code="workflow.th.delsucess"/>', { icon:6});
                            queryList();
                        }
                    }
                })
            }, function () {
                layer.closeAll();
            });
        })
	})

    //进行条件查询方法，并在列表中显示
    function queryMainByCond(output) {
        if(output!=1){//查询按钮
            queryList();
            $(".center").hide();
            $(".step1").show();
        }else{//导出按钮
            window.location.href='<%=basePath%>/tenance/selectAllMaintenance?export='+output+'&vId='+$("#vId").val()+
                '&startTime='+$("#startTime").val()+'&endTime='+$("#endTime").val()+'&vmType='+$("#vmType").val()+
                '&vmReason='+$("#vmReason").val()+'&vmPerson='+$("#vmPerson").val()+'&startFee='+$("#startFee").val()
				+'&endFee='+$("#endFee").val()+'&vmRemark='+$("#vmRemark").val();
        }
    }





    //进行条件查询方法，并在列表中显示
    function queryList() {
        $('#queryMainForm').ajaxSubmit({
            url:"/tenance/selectAllMaintenance",
            type:'post',
            dataType:'json',
            success:function (json) {
                $("#tr_td tbody").html("");
                var str = "";
                var data = json.obj;
                if(data!=undefined && data!=''){
                    if (json.flag) {
                        for (var i = 0; i < data.length; i++) {
                            str += '<tr>' +
                                '<td>' + data[i].vIdNumber + '</td>' +
                                '<td>' + data[i].vmTypeName + '</td>' +
                                '<td>' + data[i].vmReason + '</td>' +
                                '<td>'+function(){
                                    if(data[i].vmRequestDate!=undefined){
                                        return data[i].vmRequestDate;
                                    }else{
                                        return "";
                                    }
                                }()+'</td>'+
                                '<td>' + data[i].vmPerson + '</td>' +
                                '<td>' + data[i].vmFee + '</td>' +
                                '<td>' + data[i].vmRemark + '</td>'+
                                '<td><a class="edit_btn" href="../../tenance/editMaintenance?editFlag=1&vmId=' + data[i].vmId + '" style="cursor: pointer"><fmt:message code="depatement.th.modify" /></a>' +
                                ' &nbsp;' +
                                '<span class="del_btn" vmId="' + data[i].vmId + '" style="cursor: pointer"><fmt:message code="global.lang.delete" /></span>' +
                                ' &nbsp;';
                            str += '</td></tr>';
                        }
                        $("#tr_td tbody").html(str);
                    }
                }else{
                    for (var i = 0; i < data.length; i++) {
                        str += '<tr>' +
                            '<td>' + data[i].vIdNumber + '</td>' +
                            '<td>' + data[i].vmTypeName + '</td>' +
                            '<td>' + data[i].vmReason + '</td>' +
                            '<td>'+function(){
                                if(data[i].vmRequestDate!=undefined){
                                    return data[i].vmRequestDate;
                                }else{
                                    return "";
                                }
                            }()+'</td>'+
                            '<td>' + data[i].vmPerson + '</td>' +
                            '<td>' + data[i].vmFee + '</td>' +
                            '<td>' + data[i].vmRemark + '</td>'+
                            '<td><a class="edit_btn" href="../../tenance/editMaintenance?editFlag=1&vmId=' + data[i].vmId + '" style="cursor: pointer"><fmt:message code="depatement.th.modify" /></a>' +
                            ' &nbsp;' +
                            '<span class="del_btn" vmId="' + data[i].vmId + '" style="cursor: pointer"><fmt:message code="global.lang.delete" /></span>' +
                            ' &nbsp;';
                        str += '</td></tr>';
                    }
                    $("#tr_td tbody").html(str);
                    layer.msg('<fmt:message code="event.th.NoInformation" />', {icon: 6});
                }
            }
        })
    }

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

        //维护类型拉列表
        $.ajax({
            url: '/code/GetDropDownBox',
            type: 'get',
            data:{
                CodeNos:"FIX_TYPE"
            },
            dataType: 'json',
            success: function (obj) {
                var str='<option value=""></option>';
                var data=obj.FIX_TYPE;
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].codeNo+'">'+data[i].codeName+'</option>';
                }
                $("#vmType").html(str);
            }
        })

		if(queryFlag==0){
            queryList();
            $(".center").hide();
            $(".step1").show();
		}
    })


</script>