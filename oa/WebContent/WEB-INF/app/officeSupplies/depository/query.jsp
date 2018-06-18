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
	<link rel="stylesheet" href="/lib/laydate/need/laydate.css">
	<script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
	<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/laydate/laydate.js"></script>
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
        .center .login .header {
            background-color: #3691DA;
            color: #fff;
            padding: 10px;
            font-size: 16px;
            letter-spacing: 1px;
            font-weight: bold;
        }
        .center .login .ce1 {
            height: 40px;
        }
        .center .login .icons {
            padding-left: 0px;
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
		.headTop .headImg {
			float: left;
			width: 23px;
			height: 100%;
			margin-left: 30px;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="bx">
	<div class="center">
		<div class="navigation  clearfix" style="margin-top: -56px;">
			<div class="left" >
				<div class="headImg">
					<img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_offSupQuery.png" alt="">
				</div>
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

						<div class="le ce1" >
							<div class="color" style="width:135px;"><fmt:message  code="vote.th.QueryType"/>:</div>
							<div style="float:left;">
								<select id="transFlag" name="transFlag" style="width: 164px;height:30px;">
									<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>
									<option value="1"><fmt:message  code="vote.th.user"/></option>
									<option value="2"><fmt:message  code="vote.th.borrow"/></option>
									<option value="3"><fmt:message  code="vote.th.Purchasing"/></option>
									<option value="4"><fmt:message  code="vote.th.Maintain"/></option>
									<option value="5"><fmt:message  code="event.th.Scrap"/></option>
									<%--<option value="6">调拨</option>--%>
								</select>
							</div>
						</div>
						<div class="le ce1">
							<div class="color" style="width:135px;"> <fmt:message  code="sup.th.Applicant"/>：</div>
							<div>
								<input id="borrow1" name="borrow1" type="text" disabled readonly>
								<a href="javascript:;" id="addBorrow"><fmt:message  code="global.lang.select"/></a>
								<a href="javascript:;" id="clearBorrow" onclick="emptyUser(borrow1)"><fmt:message  code="global.lang.empty"/></a>
							</div>
						</div>
						<div class="le ce1">
						<div class="color" style="width:135px;">
						   <fmt:message  code="vote.th.OfficeStorehouse"/>：
						</div>
						<div>
							<select style="width: 164px;height: 30px" id="depositoryId" name="depositoryId">
								<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>
							</select>
						</div>
						</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message  code="vote.th.OfficeCategory"/>：</div>
						<div>
                            <select style="width: 164px;height: 30px" id="officeProtype" name="officeProtype">
								<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>
							</select>
						</div>
					</div>
					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message  code="vote.th.OfficeSupplies"/>：</div>
						<div>
							<select style="width: 164px;height: 30px" id="proId" name="proId">
								<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>
							</select>
						</div>
					</div>
					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message  code="global.lang.date"/>：</div>
						<div>
							<input id="transBeginDate" name="transBeginDate" type="text"  onclick="laydate(start)"><span style="margin-left: 5px; font-family: 微软雅黑;font-size: 14px;"><fmt:message  code="global.lang.to"/></span>
							<input id="transEndDate" name="transEndDate" type="text"  onclick="laydate(end)">
						</div>
					</div>

				</div>
			</form>
			<div class="icons">
				<div id="btn_query"  style="margin-right:10px; cursor: pointer;margin-left: 175px;" onclick="queryList() "><h2><fmt:message  code="global.lang.query"/></h2></div>
				<div id="daochu"  style="margin-right:10px; cursor: pointer;" onclick="empty() "><h2><fmt:message  code="workflow.th.Reset"/></h2></div>
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
						<td class="th"><fmt:message  code="vote.th.OfficeName"/></td>
						<td class="th" ><fmt:message  code="vote.th.Registration"/></td>
						<td class="th"><fmt:message  code="sup.th.Applicant"/></td>
						<td class="th"><fmt:message  code="event.th.Number"/></td>
						<td class="th"><fmt:message  code="vote.th.UnitPrice"/></td>
						<td class="th"><fmt:message  code="vote.th.OperationDate"/></td>
                        <td class="th"><fmt:message  code="vote.th.Operator"/></td>
                        <td class="th"><fmt:message  code="journal.th.Remarks"/></td>
						<td class="th notice_do"><fmt:message  code="vote.th.AdditionalInformation"/></td>
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

    $('#addBorrow').click(function(){
        user_id="borrow1";
        $.popWindow("../../common/selectUser?0");
    });

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }

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

    $("#depositoryId").change(function () {
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
                $("#officeProtype").html(str);
            }
        })
    })

    $("#officeProtype").change(function () {
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

	$(function () {
        $.ajax({
            url:"/officeDepository/getDeposttoryByDept",
            type:'post',
            dataType:'json',
            success:function (json) {
                var str='<option value=""><fmt:message  code="hr.th.PleaseSelect"/></option>';
                var data=json.obj;
                if(json.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].id+'">'+data[i].depositoryName+'</option>';
                    }
                }
                $("#depositoryId").html(str);
            }
        })
    })

    //进行条件查询方法，并在列表中显示
	function queryList() {
        $(".center").hide();
        $(".step1").show();
        $('#queryMainForm').ajaxSubmit({
            url:"/officetransHistory/selTranshistoryByCond",
            type:'post',
            dataType:'json',
            data:{
				borrower:$("#borrow1").attr("user_id"),
				output:0
			},
            success:function (json) {
                $("#tr_td tbody").html("");
                var str = "";
                var data = json.obj;
                if (json.flag) {
                    for (var i = 0; i < data.length; i++) {
                        str += '<tr>' +
                            '<td>' + data[i].proName + '</td>' ;
                        if(data[i].transFlag==1){
                            str+='<td><fmt:message  code="vote.th.user"/></td>' ;
                        }else if(data[i].transFlag==2){
                            str+='<td><fmt:message  code="vote.th.borrow"/></td>' ;
                        }else if(data[i].transFlag==3){
                            str+='<td><fmt:message  code="vote.th.Purchasing"/></td>' ;
                        }else if(data[i].transFlag==4){
                            str+='<td><fmt:message  code="vote.th.Maintain"/></td>' ;
                        }else if(data[i].transFlag==5){
                            str+='<td><fmt:message  code="event.th.Scrap"/></td>' ;
                        }else{
                            str+='<td></td>' ;
						}

                           str+= '<td>' + data[i].borrowerName + '</td>' +
                            '<td>' + data[i].transQty + '</td>' +
                            '<td>' + data[i].price + '</td>' ;
                        if(data[i].transDate!='undefined'){
                            str+='<td>'+data[i].transDate+'</td>';
                        }else{
                            str+='<td></td>';
                        }
                            str+='<td>' + data[i].operatorName + '</td>'+
                            '<td>' + data[i].remark + '</td>';
                        if(data[i].returnStatus==1){
                            str+='<td><fmt:message  code="vote.th.Res"/></td>' ;
                        }else{
                            str+='<td><fmt:message  code="vote.th.NotReturned"/></td>' ;
                        }
                        str += '</tr>';
                    }
                    $("#tr_td tbody").html(str);
                }
            }
		})
    }

    function empty() {
        $("#transFlag").val("");
        $("#borrow1").val("");
        $("#borrow1").attr("user_id","");
        $("#depositoryId").val("");
        $("#officeProtype").val("");
        $("#proId").val("");
        $("#transBeginDate").val("");
        $("#transEndDate").val("");
    }
</script>