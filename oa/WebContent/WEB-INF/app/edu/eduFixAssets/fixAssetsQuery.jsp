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
	<title><fmt:message code="main.assetquery" /></title>
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
	<style>
		body{
			margin-top:65px;
		}
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
		.center .login .icons{
			padding-left:180px;
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
			margin-left: 30px;
		}
		table td{
			overflow: hidden;
			text-overflow: ellipsis;
			white-space: nowrap;
		}
		.le input[type='text']{
			height: 26px;
			width: 174px;
		}
		.le input[type='radio']{
			height: 14px;
			margin-top: -3px;
		}
		#tr_td td{
			text-align: center;
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
<div class="bx">
	<div class="center">
		<div class="navigation  clearfix" style="margin-top: -66px;">
			<div class="left" >
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/fixAssetsQuery.png"/>
				<div class="news">
					<fmt:message code="main.assetquery" />
				</div>
			</div>
		</div>
		<div class="login" style="margin-bottom: 10px">
			<div class="header">
				<fmt:message code="event.th.PleaseCriteria" />
			</div>
			<form id="queryFixAssets">
				<div class="middle">
					<div class="le ce1">
						<div class="color" style="width:135px;">
							<fmt:message code="event.th.FixedAssetNumber" /> ：
						</div>
						<div>
							<input id="id" name="id" type="text" />
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message code="event.th.AssetName" />：</div>
						<div>
							<input id="assetsName" name="assetsName" type="text">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="event.th.BuyTime" />：</div>
						<div>
							<input id="buyTime" name="buyTime" type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="event.th.Information" />：</div>
						<div>
							<input id="info" name="info" type="text">
						</div>
					</div>

					<div class="le ce1">
						<div class="color" style="width:135px;"> <fmt:message code="event.th.Number" />：</div>
						<div>
							<input id="number" name="number" type="text">
						</div>
					</div>

					<div class="le publisher">
						<div class="color" style="width:135px;"><fmt:message code="event.th.location" />：</div>
						<textarea name="localAddress1" id="localAddress" class="localAddress" deptid="" cols="26" disabled readonly></textarea>
						<a href="javascript:;" class="addAddress" style="color:#207bd6"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearAddress" style="color:#207bd6" onclick="emptyDept('localAddress')"><fmt:message code="global.lang.empty" /></a>
					</div>
					<div class="le publisher">
						<div class="color" style="width:135px;"><fmt:message code="event.th.Custodian" />：</div>
						<textarea name="custodion1" id="custodion" class="custodion" user_id="" cols="26" disabled readonly></textarea>
						<a href="javascript:;" class="addCustodion" style="color:#207bd6"><fmt:message code="global.lang.add" /></a>
						<a href="javascript:;" class="clearCustodion" style="color:#207bd6" onclick="emptyUser('custodion')"><fmt:message code="global.lang.empty" /></a>
					</div>
					<div class="le ce1">
						<div class="color" style="width:135px;"><fmt:message code="event.th.ArticleStatus" />：</div>
						<div>
							<select name="status" id="status">
								<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
								<option value="1"><fmt:message code="event.th.notUsed" /></option>
								<option value="2"><fmt:message code="evvent.th.Use" /></option>
								<option value="3"><fmt:message code="event.th.damage" /></option>
								<option value="4"><fmt:message code="event.th.Lose" /></option>
								<option value="5"><fmt:message code="event.th.Scrap" /></option>
							</select>
						</div>
					</div>
					<div class="le ce1" style="padding: 2px">
						<div><input type="radio" name="condition" value="3" style="" checked><span style="font-size: 15px"><fmt:message code="event.th.Satisfy" />&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
						<div><input type="radio" name="condition" value="2" style="margin-left: 14px;"><span  style="font-size: 15px"><fmt:message code="event.th.ConcurrentSatisfaction" /></span></div>
					</div>
				</div>
			</form>
			<div class="icons" style="padding-left:180px;">
				<div id="btn_query"  style="margin-right:10px; cursor: pointer;" onclick="queryFixAssetsByCond(0) "><h2><fmt:message code="global.lang.query" /></h2></div>
				<div id="daochu"  style="margin-right:10px; cursor: pointer;" onclick="queryFixAssetsByCond(1) "><h2><fmt:message code="global.lang.report" /></h2></div>
			</div>
		</div>
	</div>


	<!--表单选项显示-->
	<div class="step1" style="display: none">
		<div class="navigation  clearfix" style="margin-top: -66px;">
			<div class="left">
				<img src="/img/commonTheme/${sessionScope.InterfaceModel}/fixAssetsQuery.png">
				<div class="news">
					<fmt:message code="main.assetquery" />
				</div>
			</div>
			<%--分页按钮--%>
			<div id="dbgz_page" class="M-box3 fr" style="margin-top: 2%">
			</div>
		</div>

		<!--table表单  标题栏 -->
		<div>
			<div>
				<table id="tr_td" style="margin-left: 1%;width: 98%;" >
					<thead>
					<tr>
						<td class="th" style=" width: 15%;text-align: center"><fmt:message code="event.th.FixedAssetNumber" /></td>
						<td class="th"><fmt:message code="event.th.AssetName" /></td>
						<td class="th" ><fmt:message code="event.th.BuyTime" /></td>
						<td class="th titleOne"><fmt:message code="event.th.Information" /></td>
						<td class="th"><fmt:message code="event.th.Number" /></td>
						<td class="th"><fmt:message code="event.th.location" /></td>
						<td class="th"><fmt:message code="event.th.Custodian" /></td>
						<td class="th"><fmt:message code="event.th.ArticleStatus" /></td>
						<td class="th"><fmt:message code="event.th.FixedAssetsPicture" /></td>
						<td class="th notice_do"><fmt:message code="notice.th.operation" /></td>
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
	/* 选人控件 */
    $(".addCustodion").on("click",function(){//使用保管人
        user_id = "custodion";
        $.popWindow("../../common/selectUser?0");
    });
    //清空部门控件
    function emptyDept(id){
        $("#"+id).val("");
        $("#"+id).attr("deptid","");
    }
	/* 选部门控件 */
    $(".addAddress").on("click",function(){//所在位置
        dept_id = "localAddress";
        $.popWindow("../../common/selectDept?0");
    });

    //进行条件查询方法，并在列表中显示
    function queryFixAssetsByCond(output) {
        //使用保管人
        var custodion=$("#custodion").attr("user_id");
        if(custodion!='' && custodion.indexOf(",")>=0){
            custodion=custodion.replace(",","");
        }
        //所在位置
        var locationAddress=$("#localAddress").attr("deptid");
        if(locationAddress!='' && locationAddress.indexOf(",")>=0){
            locationAddress=locationAddress.replace(",","");
        }
        if(output!=1){//查询按钮
            ajaxPage.data.page=1;
            ajaxPage.data.output=output;
            ajaxPage.data.custodion=custodion;
            ajaxPage.data.locationAddress=locationAddress;
            ajaxPage.page()
            $(".center").hide();
            $(".step1").show();
		}else{//导出按钮
            window.location.href='<%=basePath%>/eduFixAssets/selFixAssetsByCond?output='+output+'&custodion='+custodion+
			'&locationAddress='+locationAddress+'&id='+$("#id").val()+'&fixAssetsName='+$("#fixAssetsName").val()+
			'&buyTime='+$("#buyTime").val()+'&info='+$("#info").val()+'&number='+$("#number").val()+'&status='+$("#status").val();
		}
    }

    //进行条件查询方法，并在列表中显示
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
           	output:0,
            custodion:null,
            locationAddress:null,
        },
        init:function () {
        },
        page:function () {
            var me=this;
            $('#queryFixAssets').ajaxSubmit({
                url:"/eduFixAssets/selFixAssetsByCond",
                type:'post',
                dataType:'json',
                data:me.data,
                success:function (json) {
                    $("#tr_td tbody").html("");
                    var str="";
                    var data=json.obj;
                    if(json.flag) {
                        for (var i = 0; i < data.length; i++) {
                            str += '<tr>' +
                                '<td style=" width: 15%;text-align: center">' + data[i].id + '</td>' +
                                '<td>' + data[i].assetsName + '</td>' +
                                '<td>' + data[i].buyTime + '</td>' +
                                '<td>' + data[i].info + '</td>' +
                                '<td>' + data[i].number + '</td>' +
                                '<td>' + data[i].locationAddressName + '</td>' +
                                '<td>' + data[i].custodionName + '</td>';
                            if (data[i].status == 1) {
                                str += '<td><fmt:message code="event.th.notUsed" /></td>';
                            } else if (data[i].status == 2) {
                                str += '<td><fmt:message code="evvent.th.Use" /></td>';
                            } else if (data[i].status == 3) {
                                str += '<td><fmt:message code="event.th.damage" /></td>';
                            } else if (data[i].status == 4) {
                                str += '<td><fmt:message code="event.th.Lose" /></td>';
                            } else {
                                str += '<td><fmt:message code="event.th.Scrap" /></td>';
                            }
                           if(data[i].image!='' && data[i].image!='undefined'){
                               str += '<td>' + '<img src="/img/edu/eduFixAssets/' + data[i].image + '"  style="height: 70px;width: 110px;"/>' + '</td>';
						   }else{
                               str += '<td></td>';
                           }
                            str+='<td><a class="edit_btn" href="../../eduFixAssets/fixAssetsEdit?editFlag=1&id='+data[i].id+'"><fmt:message code="global.lang.edit" /></a>' +
                                ' &nbsp;' +
                                '<span class="del_btn" id="'+data[i].id+'"><fmt:message code="global.lang.delete" /></span></td>' +
                                '</tr>';
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
    $("#tr_td").on("click",".del_btn",function () {
        var id= $(this).attr("id");
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteAssets" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/eduFixAssets/deleteFixAssetsById',
                type: 'get',
                data: {
                    id: id,
                },
                dataType: 'json',
                success: function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1}, function () {
                            window.location.href = '<%=basePath%>/eduFixAssets/fixAssetsManager';
                        });
                    }
                }
            })
        }, function () {
            layer.closeAll();
        });
    })

</script>