<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
	<title><fmt:message code="sup.th.SupervisionAndManagement" /></title>
	<link rel="stylesheet" href="/css/supervise/supervisionManage.css">
	<link rel="stylesheet" type="text/css" href="../css/easyui/easyui.css">
	<link rel="stylesheet" type="text/css" href="../css/easyui/icon.css">
	<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
	<link rel="stylesheet" href="/lib/laydate/need/laydate.css">
	<link rel="stylesheet" href="/lib/pagination/style/pagination.css">
	<%--<link rel="stylesheet" href="/css/base.css">--%>
	<script type="text/javascript" src="../js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>
	<script src="/lib/layer/layer.js"></script>
	<script src="/js/base/base.js"></script>
	<script src="/lib/laydate/laydate.js"></script>
	<script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../lib/jquery.form.min.js" type="text/javascript" charset="utf-8"></script>
	<style>
		.div_tr input{
			float: none;
			height: 28px;
			border: #999 1px solid;
		}
		.develop_div{
			width: 100%;
			margin-top: 200px;
			font-size: 16px;
			text-align: -webkit-center;
		}
		table th, table td{
			text-align:left;
			padding-left:10px;
		}
		.main{
			margin-top:0px;
			height:calc(100% - 50px);
		}
		.headTop {
			position: static;
		}
		.ellipsis{
			width:90px;
			overflow: hidden;
			text-overflow: ellipsis;
			white-space: nowrap;
		}

	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>

<div class="main">
	<div class="headTop">
		<div class="headImg">
			<img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_manage.png" alt="">
		</div>
		<div class="divTitle">
			<fmt:message code="sup.th.SupervisionAndManagement" />
		</div>
		<div class="newClass" id="newClass" style="border-radius: 3px;"><img src="../../img/mywork/newbuildworjk.png" style="margin:-3px 0px 0px 9px" alt=""><span style="margin-left: 5px;"><fmt:message code="sup.th.NewSupervision" /></span></div>
	</div>

		<div class="mainLeft">
			<div class="div_ul">
				<%--<ul>--%>
				<%--<li class="one"><span>公告督办事项</span></li>--%>
				<%--<li class=""><span>立项督办事项</span></li>--%>
				<%--</ul>--%>
			</div>
		</div>

		<div class="mainRight">
			<div class="pagediv" style="margin: 0 auto;width: 99%;">
				<table>
					<thead>
					<tr>
						<th style="width: 15%;"><fmt:message code="sup.th.WorkItems" /></th>
						<th style="width: 9%;"><fmt:message code="file.th.builder" /></th>
						<th style="width: 9%;"><fmt:message code="sup.th.ResponsibleLeadership" /></th>
						<th style="width: 9%;"><fmt:message code="sup.th.Sponsor" /></th>
						<th style="width: 9%;"><fmt:message code="sup.th.CoOrganizer" /></th>
						<th style="width: 15%;"><fmt:message code="sup.th.workingCondition" /></th>
						<th style="width: 16%;"><fmt:message code="journal.th.Deadline" /></th>
						<th><fmt:message code="notice.th.operation" /></th>
					</tr>
					</thead>
					<tbody>

					</tbody>
				</table>
			</div>
		</div>


</div>
<script>
    function defaultRenderLi(nodeId){
        $(".div_ul li").find("div[node-id='"+nodeId+"']").addClass("tree-node-selected");   //设置第一个节点高亮
        $(".div_ul li").find("div[node-id='"+nodeId+"']").click()
//        var n = $(".div_ul").tree("getSelected");
//        if(n!=null){
//            $(".div_ul").tree("select",n.target);    //相当于默认点击了一下第一个节点，执行onSelect方法
//        }
    }
    var user_id='';
	$(function () {
	    //左侧树结构展示
        reloadTree();



        function reloadTree(){
            $(".div_ul").empty();
            $.ajax({
                Type: "GET",
                url: "<%=basePath %>/supervision/getSupManageMenu",
                dataType:'json',
                success: function (data) {
                    if(data.obj.length>0){
                        $(".div_ul").append("<ul id=\"fileTree\" class=\"easyui-tree\"data-options=\"method:'get',animate:true\" ></ul>");
                        $("#fileTree").tree({
                            data : data.obj,
                            onClick : function(node){
                                init(node.id);
                            },
                            onLoadSuccess:function(node,data) {
                                defaultRenderLi(data[0].id);
                            }
                        });
					}else{
                        $.layerMsg({content:'没有更多内容！',icon:3});
					}

                }
            });
        }

        //新建
		$('#newClass').click(function(event){
            event.stopPropagation();//            var typeId=$(this).attr('typeId');
            layer.open({
                type: 1,
                title:['<fmt:message code="sup.th.NewSupervision" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '500px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />','<fmt:message code="global.lang.publish" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-left: 35px;margin-top: 38px;">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.WorkItems" />：</span><span><input type="text" style="width: 180px;margin-left:5px;" name="typeName" class="inputTd" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SubordinateCategory" />：</span><span><select name="parentId" id="parentId" style="width: 180px;"></select></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ResponsibleLeadership" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Sponsor" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.CoOrganizer" />：</span><span><div class="inPole"><textarea name="txt" id="userDept" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span><input type="text" style="width: 180px;margin-left:5px;" name="beginTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span><input type="text" style="width: 180px;margin-left:5px;" name="endTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SupervisionContent" />：</span><span><div class="inPole"><textarea name="txt" id="textCont" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>'+
//                '<div class="div_tr"><span class="span_td">相关附件：</span><span><div class="inPole"><div class="Attachment"></div>' +
//				'<form id="uploadimgform" target="uploadiframe"  action="../upload?module=file_folder" enctype="multipart/form-data" method="post" >'+
//                '<input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">' +
//				'<a href="javascript:;" id="uploadimg">' +
//				'<img style="margin-right:5px;" src="../img/icon_uplod.png"/>附件上传</a>'+
//                '</form></div></span></div>'+
				'</div>',
                success:function(){
                    //所属分类下拉
                    $('#parentId').typeSelect();
				},
                yes:function(index){
                    var data={
                        status:0,
                        supName:$('input[name="typeName"]').val(),
                        typeId:$('#parentId option:checked').val(),
                        leaderId:$('#userDuser').attr('user_id'),
                        managerId:$('#userPriv').attr('user_id'),
                        userId:$('#userDept').attr('user_id'),
                        beginTime:$('input[name="beginTime"]').val(),
                        endTime:$('input[name="endTime"]').val(),
                        content:$('#textCont').val()
                    }
                    if($('input[name="typeName"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.fillItems" />！',icon:3});
                        return;
                    }
                    if($('#parentId option:checked').val() == '-1'){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectCategory" />！',icon:3});
                        return;
					}
                    if($('#userDuser').attr('user_id') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectLeadership" />！',icon:3});
                        return;
                    }
                    if($('#userPriv').attr('user_id') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                        return;
                    }
                    if($('input[name="beginTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectStartTime" />！',icon:3});
                        return;
                    }
                    if($('input[name="endTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectEndTime" />！',icon:3});
                        return;
                    }
                    newSupervision(data,$('#parentId option:checked').val());
                    layer.close(index);
                },
				btn2:function(index){
                    var data={
                        status:7,
                        supName:$('input[name="typeName"]').val(),
                        typeId:$('#parentId option:checked').val(),
                        leaderId:$('#userDuser').attr('user_id'),
                        managerId:$('#userPriv').attr('user_id'),
                        userId:$('#userDept').attr('user_id'),
                        beginTime:$('input[name="beginTime"]').val(),
                        endTime:$('input[name="endTime"]').val(),
                        content:$('#textCont').val()
                    }
                    if($('input[name="typeName"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.fillItems" />！',icon:3});
                        return;
                    }
                    if($('#parentId option:checked').val() == '-1'){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectCategory" />！',icon:3});
                        return;
                    }
                    if($('#userDuser').attr('userpriv') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectLeadership" />！',icon:3});
                        return;
                    }
                    if($('#userPriv').attr('userpriv') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                        return;
                    }
                    if($('input[name="beginTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectStartTime" />！',icon:3});
                        return;
                    }
                    if($('input[name="endTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectEndTime" />！',icon:3});
                        return;
                    }
                    newSupData(data,$('#parentId option:checked').val())
                    layer.close(index);
				}
            });
            $("#selectUser").on("click",function(){//选角色控件
                user_id='userDuser';
                $.popWindow("../common/selectUser?0");
            });
            $("#selectPriv").on("click",function(){//选角色控件
                user_id='userPriv';
                $.popWindow("../common/selectUser?0");
            });
            $("#selectDept").on("click",function(){//选角色控件
                user_id='userDept';
                $.popWindow("../common/selectUser");
            });
            $('#clearUser').click(function(){ //清空角色
                $('#userDuser').attr('user_id','');
                $('#userDuser').attr('dataid','');
                $('#userDuser').val('');
            });
            $('#clearPriv').click(function(){ //清空角色
                $('#userPriv').attr('user_id','');
                $('#userPriv').attr('dataid','');
                $('#userPriv').val('');
            });
            $('#clearDept').click(function(){ //清空角色
                $('#userDept').attr('user_id','');
                $('#userDept').attr('dataid','');
                $('#userDept').val('');
            });
            $('#uploadimg').on('click', function(ele) {
                $('#uploadinputimg').click();
            });
            $('#uploadinputimg').change(function(e){
                var target = $(e.target);
                var file;
                if(target[0].files && target[0].files[0]){
                    file=target[0].files[0];
                }
                if(file){
                    $.upload($('#uploadimgform'),function(res){
                        var data=res.obj;
                        var str='';
                        for(var i=0;i<data.length;i++){
                            str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';
                        }
                        $('.Attachment').append(str);
                    });
                }
            });
		});
        //删除
		$('.pagediv').on('click','.deleteData',function(){
		    var typeId=$(this).parents('tr').attr('typeId');
		    var sId=$(this).attr('sId');
            layer.confirm('<fmt:message code="sup.th.Delete" />？', {
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                title:"<fmt:message code="notice.th.DeleteFile" />"
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url:'<%=basePath %>supervision/deleteSupervisionBySid',
                    dataType:'json',
                    data:{'sid':sId},
                    success:function(){
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                        init(typeId);
                    }
                })

            }, function(){
                layer.closeAll();
            });
		})

		//点击办理
		$('.pagediv').on('click','.handle',function(){
		    var status=$(this).attr('publish');
		    if(status==0){
		        $.layerMsg({content:'<fmt:message code="sys.lang.publish" />',icon:6})
			}else{
                var sId=$(this).attr('sId');
                var parId=$(this).parents('tr').attr('paId');
                $.popWindow('<%=basePath %>SupervCommon/Supervisionhandle?type=0&sid='+sId+'&paId='+parId,'<fmt:message code="sup.th.SupervisionTaskManagement" />','0','0','1500px','800px');
			}

		});
		//点击查看
        $('.pagediv').on('click','.seeDat',function(){
            var sId=$(this).attr('sId');
            var parId=$(this).parents('tr').attr('paId');
            $.popWindow('<%=basePath %>SupervCommon/Supervisionhandle?type=0&sid='+sId+'&paId='+parId,'<fmt:message code="sup.th.SupervisionTaskManagement" />','0','0','1500px','800px');
		})
		//点击编辑
        $('.pagediv').on('click','.editDats',function(event){
            event.stopPropagation();
            var sId=$(this).attr('sId');
            layer.open({
                type: 1,
                title:['<fmt:message code="sup.th.NewSupervision" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '500px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />','<fmt:message code="global.lang.publish" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-left: 35px;margin-top: 38px;">' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.WorkItems" />：</span><span><input type="text" style="width: 180px;" name="typeName" class="inputTd" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SubordinateCategory" />：</span><span><select name="parentId" id="parentId" style="width: 180px;"></select></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ResponsibleLeadership" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Sponsor" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.CoOrganizer" />：</span><span><div class="inPole"><textarea name="txt" id="userDept" user_id="" value="" disabled style="min-width: 220px;min-height:60px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.startTime" />：</span><span><input type="text" style="width: 180px;" name="beginTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.EndTime" />：</span><span><input type="text" style="width: 180px;" name="endTime" class="inputTd" value="" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})" /></span></div>'+
                '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SupervisionContent" />：</span><span><div class="inPole"><textarea name="txt" id="textCont" value="" style="min-width: 300px;min-height:60px;"></textarea></div></span></div>'+
//                '<div class="div_tr"><span class="span_td">相关附件：</span><span><div class="inPole"><div class="Attachment"></div>' +
//				'<form id="uploadimgform" target="uploadiframe"  action="../upload?module=file_folder" enctype="multipart/form-data" method="post" >'+
//                '<input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">' +
//				'<a href="javascript:;" id="uploadimg">' +
//				'<img style="margin-right:5px;" src="../img/icon_uplod.png"/>附件上传</a>'+
//                '</form></div></span></div>'+
                '</div>',
                success:function(){
                    //所属分类下拉
                    $('#parentId').typeSelect();
                    $.ajax({
						type:'get',
						url:'<%=basePath %>supervision/getSupAssistDetail',
						dataType:'json',
						data:{sid:sId},
						success:function(res){
                            var data=res.object;
                            $('#parentId').val('');
//                            var num;
//                            if(data.typeId == 0){
//                                num=-1;
//							}else{
//                                num=data.typeId;
//							}
//							console.log(num);
                            $('input[name="typeName"]').val(data.supName);
                            if(data.typeId == 0){
                                $('#parentId').val('-1');
							}else{
                                $('#parentId').val(data.typeId);
							}
                            $('#userDuser').attr('user_id',data.leaderId+',');
                            $('#userDuser').val(data.deptName);
                            $('#userPriv').attr('user_id',data.managerId+',');
                            $('#userPriv').val(data.managerName);
                            $('#userDept').attr('user_id',data.userId);
                            $('#userDept').val(data.userPrivName);
                            $('input[name="beginTime"]').val(data.beginTime);
                            $('input[name="endTime"]').val(data.endTime);
                            $('#textCont').val(data.content);
						}
					})
                },
                yes:function(index){
                    var data={
                        sid:sId,
                        status:0,
                        supName:$('input[name="typeName"]').val(),
                        typeId:$('#parentId option:checked').val(),
                        leaderId:$('#userDuser').attr('user_id'),
                        managerId:$('#userPriv').attr('user_id'),
                        userId:$('#userDept').attr('user_id'),
                        beginTime:$('input[name="beginTime"]').val(),
                        endTime:$('input[name="endTime"]').val(),
                        content:$('#textCont').val()
                    }
                    if($('input[name="typeName"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.fillItems" />！',icon:3});
                        return;
                    }
                    if($('#parentId option:checked').val() == '-1'){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectCategory" />！',icon:3});
                        return;
                    }
                    if($('#userDuser').attr('userpriv') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectLeadership" />！',icon:3});
                        return;
                    }
                    if($('#userPriv').attr('userpriv') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                        return;
                    }
                    if($('input[name="beginTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectStartTime" />！',icon:3});
                        return;
                    }
                    if($('input[name="endTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectEndTime" />！',icon:3});
                        return;
                    }
                    editSupData(data,$('#parentId option:checked').val(),data.status);
                    layer.close(index);
                },
                btn2:function(index){
                    var data={
                        sid:sId,
                        status:7,
                        supName:$('input[name="typeName"]').val(),
                        typeId:$('#parentId option:checked').val(),
                        leaderId:$('#userDuser').attr('user_id'),
                        managerId:$('#userPriv').attr('user_id'),
                        userId:$('#userDept').attr('user_id'),
                        beginTime:$('input[name="beginTime"]').val(),
                        endTime:$('input[name="endTime"]').val(),
                        content:$('#textCont').val()
                    }
                    if($('input[name="typeName"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.fillItems" />！',icon:3});
                        return;
                    }
                    if($('#parentId option:checked').val() == '-1'){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectCategory" />！',icon:3});
                        return;
                    }
                    if($('#userDuser').attr('userpriv') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectLeadership" />！',icon:3});
                        return;
                    }
                    if($('#userPriv').attr('userpriv') == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.SelectTheSponsor" />！',icon:3});
                        return;
                    }
                    if($('input[name="beginTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectStartTime" />！',icon:3});
                        return;
                    }
                    if($('input[name="endTime"]').val() == ''){
                        $.layerMsg({content:'<fmt:message code="sup.th.selectEndTime" />！',icon:3});
                        return;
                    }
                    editSupData(data,$('#parentId option:checked').val(),data.status)
                    layer.close(index);
                }
            });
            $("#selectUser").on("click",function(){//选角色控件
                user_id='userDuser';
                $.popWindow("../common/selectUser?0");
            });
            $("#selectPriv").on("click",function(){//选角色控件
                user_id='userPriv';
                $.popWindow("../common/selectUser?0");
            });
            $("#selectDept").on("click",function(){//选角色控件
                user_id='userDept';
                $.popWindow("../common/selectUser");
            });
            $('#clearUser').click(function(){ //清空角色
                $('#userDuser').attr('user_id','');
                $('#userDuser').attr('dataid','');
                $('#userDuser').val('');
            });
            $('#clearPriv').click(function(){ //清空角色
                $('#userPriv').attr('user_id','');
                $('#userPriv').attr('dataid','');
                $('#userPriv').val('');
            });
            $('#clearDept').click(function(){ //清空角色
                $('#userDept').attr('user_id','');
                $('#userDept').attr('dataid','');
                $('#userDept').val('');
            });
            $('#uploadimg').on('click', function(ele) {
                $('#uploadinputimg').click();
            });
            $('#uploadinputimg').change(function(e){
                var target = $(e.target);
                var file;
                if(target[0].files && target[0].files[0]){
                    file=target[0].files[0];
                }
                if(file){
                    $.upload($('#uploadimgform'),function(res){
                        var data=res.obj;
                        var str='';
                        for(var i=0;i<data.length;i++){
                            str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data[i].attachName+'</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';
                        }
                        $('.Attachment').append(str);
                    });
                }
            });
		})
		//点击列表中的发布
        $('.pagediv').on('click','.release',function(){
			var sId=$(this).attr('sId');
			var typeId=$(this).parents('tr').attr('typeId');
			$.ajax({
				type:'post',
				url:'<%=basePath %>supervision/updateSupStatus',
				dataType:'json',
				data:{sid:sId,status:7},
				success:function(res){
				    if(res.flag){
                        $.layerMsg({content:'<fmt:message code="user.th.PublishSuccessfully" />！',icon:6});
                        init(typeId)
					}else{
                        $.layerMsg({content:'<fmt:message code="event.th.PublishingFailure" />！',icon:3});
					}

				}
			})
		})
    })
	//列表数据展示
	function init(typeId){
        $('.pagediv tbody tr').remove();
	    $.ajax({
			type:'get',
			url:'<%=basePath %>supervision/getSupManageListByTypeId',
			dataType:'json',
			data:{'typeId':typeId},
			success:function(res){
			    var datas=res.obj;
			    var str='';
//			    if(datas.length>0){
//                    $('#newClass').attr('typeId','1');
//				}else{
//                    $('#newClass').attr('typeId','');
//				}
				if(datas.length>0){
                    for(var i=0;i<datas.length;i++){
                        if(datas[i].status == '0'){
                            str+='<tr typeId="'+datas[i].typeId+'" paId="'+datas[i].parentId+'">' +
                                '<td class="ellipsis" title="'+datas[i].supName+'">'+datas[i].supName+'</td>' +
                                '<td>'+datas[i].deptName+'</td>' +
                                '<td>'+function(){
                                    if(datas[i].userName==undefined){
                                        return "";
                                    }else{
                                        return datas[i].userName;
                                    }
                                }()+'</td>' +
                                '<td>'+function(){
                                if(datas[i].managerName==undefined){
                                    return "";
								}else{
                                    return datas[i].managerName;
								}
								}()+'</td>' +
                                '<td><div class="ellipsis" title="'+datas[i].userPrivName+'">'+datas[i].userPrivName+'</div></td>' +
                                '<td class="ellipsis" title="'+datas[i].content+'">'+datas[i].content+'</td>' +
                                '<td>'+datas[i].endTime+'</td>' +
                                '<td><a href="javascript:;" class="handle" publish="'+datas[i].status+'" sId="'+datas[i].sid+'"><fmt:message code="document.th.handle" /></a><a href="javascript:;" class="editDats" sId="'+datas[i].sid+'" style="margin-left: 10px"><fmt:message code="global.lang.edit" /></a>'+
                                '<a href="javascript:;" class="release" sId="'+datas[i].sid+'" style="margin-left: 10px"><fmt:message code="global.lang.publish" /></a><a href="javascript:;" style="margin-left: 10px" sId="'+datas[i].sid+'" class="deleteData"><fmt:message code="menuSSetting.th.deleteMenu" /></a></td>' +
                                '</tr>';
                        }else if(datas[i].status == '6'){
                            str+='<tr typeId="'+datas[i].typeId+'" paId="'+datas[i].parentId+'">' +
                                '<td class="ellipsis" title="'+datas[i].supName+'">'+datas[i].supName+'</td>' +
                                '<td>'+datas[i].deptName+'</td>' +
                                '<td>'+function(){
                                    if(datas[i].userName==undefined){
                                        return "";
                                    }else{
                                        return datas[i].userName;
                                    }
                                }()+'</td>' +
                                '<td>'+function(){
                                    if(datas[i].managerName==undefined){
                                        return "";
                                    }else{
                                        return datas[i].managerName;
                                    }
                                }()+'</td>' +
                                '<td><div class="ellipsis" title="'+datas[i].userPrivName+'">'+datas[i].userPrivName+'</div></td>' +
                                '<td class="ellipsis" title="'+datas[i].content+'">'+datas[i].content+'</td>' +
                                '<td>'+datas[i].endTime+'</td>' +
                                '<td><a href="javascript:;" class="seeDat" sId="'+datas[i].sid+'"><fmt:message code="long.th.See" /></a><a href="javascript:;" style="margin-left: 10px" sId="'+datas[i].sid+'" class="deleteData"><fmt:message code="menuSSetting.th.deleteMenu" /></a></td>' +
                                '</tr>';
                        } else{
                            str+='<tr typeId="'+datas[i].typeId+'" paId="'+datas[i].parentId+'">' +
                                '<td class="ellipsis" title="'+datas[i].supName+'">'+datas[i].supName+'</td>' +
                                '<td>'+datas[i].deptName+'</td>' +
                                '<td>'+function(){
                                    if(datas[i].userName==undefined){
                                        return "";
                                    }else{
                                        return datas[i].userName;
                                    }
                                }()+'</td>' +
                                '<td>'+function(){
                                    if(datas[i].managerName==undefined){
                                        return "";
                                    }else{
                                        return datas[i].managerName;
                                    }
                                }()+'</td>' +
                                '<td><div class="ellipsis" title="'+datas[i].userPrivName+'">'+datas[i].userPrivName+'</div></td>' +
                                '<td class="ellipsis" title="'+datas[i].content+'">'+datas[i].content+'</td>' +
                                '<td>'+datas[i].endTime+'</td>' +
                                '<td><a href="javascript:;" class="handle" publish="'+datas[i].status+'" sId="'+datas[i].sid+'"><fmt:message code="document.th.handle" /></a><a href="javascript:;" style="margin-left: 10px" sId="'+datas[i].sid+'" class="deleteData"><fmt:message code="menuSSetting.th.deleteMenu" /></a></td>' +
                                '</tr>';
                        }
                    }
                    $('.pagediv tbody').append(str);
				}else{
				    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:5});
				}


			}
		})
	}

    //        hover显示数据
    $('.pagediv').on('mouseover ','.ellipsis',function(){

        var textLength=$(this)[0].scrollWidth;
        var width=$(this).width();

        if(textLength>width){
            layer.tips($(this).text(),$(this),{tips:[3,'#2b7fe0']})
        }
    })
	//新建
	function newSupervision(data,typeId){
	    $.ajax({
			type:'post',
			url:'<%=basePath %>supervision/addSupervision',
			dataType:'json',
			data:data,
			success:function(res){
			    if(res.flag){
                    $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />！',icon:1});
                    init(typeId)
				}else{
                    $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />！',icon:2});
				}
			}
		})
	}
	//发布
	function newSupData(data,typeId){
        $.ajax({
            type:'post',
            url:'<%=basePath %>supervision/addSupervision',
            dataType:'json',
            data:data,
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="user.th.PublishSuccessfully" />！',icon:1});
                    init(typeId)
                }else{
                    $.layerMsg({content:'<fmt:message code="event.th.PublishingFailure" />！',icon:2});
                }
            }
        })
	}
	//编辑保存/发布接口
	function editSupData(data,typeId,staId){
		$.ajax({
			type:'post',
			url:'<%=basePath %>supervision/updateSupervision',
			dataType:'json',
			data:data,
			success:function(res){
			    var statusName='';
			    var statusMsg='';
			    if(staId == 7){
                    statusName='<fmt:message code="user.th.PublishSuccessfully" />！';
                    statusMsg='<fmt:message code="event.th.PublishingFailure" />！';
				}else if(staId == 0){
                    statusName='<fmt:message code="diary.th.modify" />！';
                    statusMsg='<fmt:message code="meet.th.SaveFailed" />！';
				}
                if(res.flag){
                    $.layerMsg({content:statusName,icon:1});
                    init(typeId)
                }else{
                    $.layerMsg({content:statusMsg,icon:2});
                }
			}
		})
	}
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
    //正在开发中
    function development() {
        $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment" />！',icon:6});
    }
</script>
</body>
</html>
