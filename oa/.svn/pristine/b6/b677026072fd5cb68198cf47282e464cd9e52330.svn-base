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
	<title><fmt:message  code="vote.th.OfficeInquiries"/></title>
    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
	<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
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
        .center .login .header {
            background-color: #3691DA;
            color: #fff;
            padding: 10px;
            font-size: 16px;
            letter-spacing: 1px;
            font-weight: bold;
        }
        .center .login .ce1 {
            height: 35px;
        }
        .center .login .icons {
            padding-left: 150px;
        }
		.center .login .middle {
			border: 1px solid #DCDCDC;
			border-bottom: none;
		}
		.delete_ok{
			width: 109px;
			height:24px;
			padding-top: 3px;
			padding-left: 10px;
			background: url(../../img/btn_deleteannounce.png) 0px 0px no-repeat;
		}
	</style>
</head>
<body>
<div class="bx">
	<div class="center">
		<div class="navigation  clearfix" style="margin-top: -66px;">
			<div class="left" >
				<div class="news">
					<fmt:message  code="vote.th.OfficeInquiries"/>
				</div>
			</div>
		</div>
		<div class="login" style="margin-bottom: 10px">
			<div class="header">
				<fmt:message  code="event.th.PleaseCriteria"/>
			</div>
			<form id="queryMainForm">
				<div class="middle">
					<div class="le ce1">
						<div class="color" style="width:135px;">
						   <fmt:message  code="vote.th.OfficeStorehouse"/>：
						</div>
						<div>
							<select style="width: 164px;height: 30px" id="id" name="id"></select>
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message  code="vote.th.OfficeCategory"/>：</div>
						<div>
                            <select style="width: 164px;height: 30px" id="typeId" name="typeId"></select>
						</div>
					</div>
					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message  code="vote.th.OfficeSupplies"/>：</div>
						<div>
							<select style="width: 164px;height: 30px" id="proId" name="proId"></select>
						</div>
					</div>
				</div>
			</form>
			<div class="icons">
				<div id="btn_query"  style="margin-right:10px; cursor: pointer;" onclick="queryMainByCond(0) "><h2><fmt:message  code="global.lang.query"/></h2></div>
				<div id="daochu"  style="margin-right:10px; cursor: pointer;" onclick="queryMainByCond(1) "><h2><fmt:message  code="global.lang.report"/></h2></div>
			</div>
		</div>
	</div>


	<!--表单选项显示-->
	<div class="step1" style="display: none">
		<div class="navigation  clearfix">
			<div class="left">
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/gonggaoguanli.png">
				<div class="news">
					<fmt:message  code="work.th.workList"/>
				</div>
			</div>
		</div>

		<!--table表单  标题栏 -->
		<div>
			<div>
				<table id="tr_td">
					<thead>
					<tr>
						<td class="th"><fmt:message  code="global.lang.select"/></td>
						<td class="th"><fmt:message  code="vote.th.OfficeName"/></td>
						<td class="th" ><fmt:message  code="vote.th.OfficeCategory"/></td>
						<td class="th titleOne"><fmt:message  code="vote.th.Measurement"/></td>
						<td class="th"><fmt:message  code="vote.th.Supplier"/></td>
						<td class="th"><fmt:message  code="vote.th.VigilanceInventory"/></td>
						<td class="th"><fmt:message  code="vote.th.CurrentStock"/></td>
                        <td class="th"><fmt:message  code="file.th.builder"/></td>
                        <td class="th"><fmt:message  code="hr.th.Approver"/></td>
						<td class="th notice_do"><fmt:message  code="notice.th.operation"/></td>
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

    //进行多项删除
    $("#tr_td").on("click",".delete_check",function () {
        var proIds = "";
        $("#tr_td .checkChild:checkbox:checked").each(function () {
            var proId = $(this).attr("proId");
            proIds += proId+",";
        })
        if (proIds.length<=0) {
            $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
        } else {
            layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/officeSupplies/deleteOfficeProducts',
                    dataType: 'json',
                    data: {'proIds': proIds},
                    success: function (json) {
                        if(json.flag){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            queryList();
                        }
                    }
                })
            },function (){
                layer.closeAll();
            });
        }
    })






    $(function(){
        $('#id').html("<option value=''><fmt:message  code="hr.th.PleaseSelect"/></option>");
        $('#typeId').html("<option value=''><fmt:message  code="hr.th.PleaseSelect"/></option>");
        $("#proId").html("<option value=''><fmt:message  code="hr.th.PleaseSelect"/></option>");
        //加载办公用品库
        $.ajax({
            type:'post',
            url:'<%=basePath%>officeDepository/selAllDepository',
            dataType:'json',
            success:function(res){
                var datas=res.obj;
                var str="<option value=''><fmt:message  code="hr.th.PleaseSelect"/></option>";
                if(datas!=undefined){
                    for(var i=0;i<datas.length;i++){
                        str+="<option value='"+datas[i].id+"'>"+datas[i].depositoryName+"</option>"
                    }
                }
                $('#id').html(str);
            }
        })

        $("#id").change(function () {
            $.ajax({
                url:"/officetransHistory/getDownObjects",
                type:'post',
                dataType:'json',
                data:{
                    typeDepository:$(this).val()
                },
                success:function (json) {
                    var str='<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>';
                    var data=json.obj;
                    if(json.flag){
                        for(var i=0;i<data.length;i++){
                            str+='<option value="'+data[i].id+'">'+data[i].typeName+'</option>';
                        }
                    }
                    $("#typeId").html(str);
                }
            })
        })



        $("#typeId").change(function () {
            $.ajax({
                url:"/officetransHistory/getDownObjects",
                type:'post',
                dataType:'json',
                data:{
                    officeProductType:$(this).val()
                },
                success:function (json) {
                    var str='<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>';
                    var data=json.obj;
                    if(json.flag){
                        for(var i=0;i<data.length;i++){
                            str+='<option value="'+data[i].proId+'">'+data[i].proName+'</option>';
                        }
                    }
                    $("#proId").html(str);
                }
            })
        })
    })

    //进行条件查询方法，并在列表中显示
    function queryMainByCond(output) {
        if(output!=1){//查询按钮
            queryList();
            $(".center").hide();
            $(".step1").show();
        }else{//导出按钮
            window.location.href='<%=basePath%>officeSupplies/selectOfficeProducts?export='+output+'&id='+$('#id').val()+"&typeId="+$('#typeId').val()+"&proId="+$('#proId').val();
        }
    }

    //进行条件查询方法，并在列表中显示
	function queryList() {
        $('#queryMainForm').ajaxSubmit({
            url:"/officeSupplies/selectOfficeProducts",
            type:'post',
            dataType:'json',
            success:function (json) {
                $("#tr_td tbody").html("");
                var str = "";
                var data = json.obj;
                if (json.flag) {
                    for (var i = 0; i < data.length; i++) {
                        str += '<tr>' +
                            '<td><input type="checkbox" name="checkData" class="checkChild" value="" proId="'+data[i].proId+'"/></td>' +
                            '<td>' + data[i].proName + '</td>' +
                            '<td>' + data[i].officeProtypeName + '</td>' +
                            '<td>' + data[i].proUnit + '</td>' +
                            '<td>' + data[i].proSupplier + '</td>' +
                            '<td>' + data[i].proLowstock + '</td>' +
                            '<td>' + data[i].proStock + '</td>' +
                            '<td>' + data[i].proCreatorName + '</td>'+
                            '<td>' + data[i].proAuditerName + '</td>'+
						    '<td><a class="edit_btn" href="../../officeSupplies/newProduct?editFlag=1&proId=' + data[i].proId + '" style="cursor: pointer"><fmt:message  code="depatement.th.modify"/></a>' +
                            ' &nbsp;';
                        str += '</td></tr>';
                    }
                    str+='<tr>' +
                        '<td> ' +
                        '<input type="checkbox" name="checkedAll" id="checkedAll" />' +
                        '</td>' +
                        '<td colspan="9" style="padding-left: 10px;">' +
                        '<div class="delete_ok"><span class="span"><a href="javascript:;" style="font-size: 14px;" class="delete_check"><fmt:message  code="vote.th.DeleteInformation"/></a><span></div>' +
                        '</td> ' +
                        '</tr>'
                    $("#tr_td tbody").html(str);
                }
            }
		})
    }

    <%--//删除操作--%>
    <%--$("#tr_td").on("click",".del_btn",function () {--%>
        <%--var vmId= $(this).attr("vmId");--%>
        <%--layer.confirm('确定删除吗？', {--%>
            <%--btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮--%>
            <%--title: "删除维护记录"--%>
        <%--}, function () {--%>
            <%--//确定删除，调接口--%>
            <%--$.ajax({--%>
                <%--url: '/tenance/deleteMaintenance',--%>
                <%--type: 'get',--%>
                <%--data: {--%>
                    <%--vmId: vmId,--%>
                <%--},--%>
                <%--dataType: 'json',--%>
                <%--success: function (json) {--%>
                    <%--if (json.flag) {--%>
                        <%--$.layerMsg({content: '删除成功！', icon: 1}, function () {--%>
                            <%--queryList();--%>
                        <%--});--%>
                    <%--}--%>
                <%--}--%>
            <%--})--%>
        <%--}, function () {--%>
            <%--layer.closeAll();--%>
        <%--});--%>
    <%--})--%>


</script>