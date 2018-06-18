<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
	<title><fmt:message code="meet.th.Conference" /></title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<link rel="stylesheet" href="/css/meeting/equipment.css">
	<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
	<link rel="stylesheet" href="/lib/laydate/need/laydate.css">
	<link rel="stylesheet" href="/lib/pagination/style/pagination.css">
	<%--<link rel="stylesheet" href="/css/base.css">--%>
	<script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
	<script src="/lib/layer/layer.js"></script>
	<script src="/js/base/base.js"></script>
	<script src="/lib/laydate/laydate.js"></script>
	<script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<style>
	*{
		font-family: 微软雅黑;
		font-size: 14px;
	}
	td{
		font-size: 14px;
	}
	table tr td a{
		font-size: 14px;
	}

</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body style="font-family: 微软雅黑;">
<div class="headTop">
	<div class="headImg">
		<img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_equipment.png" alt="">
	</div>
	<div class="divTitle">
		<fmt:message code="meet.th.Conference" />
	</div>
	<div class="batchDelete" id="batchDelete" style="background:url(../../img/meeting/btn_deleteAll.jpg) no-repeat!important">
		<span style="margin-left: 38px;"><fmt:message code="meet.th.BatchDelete" /></span>
	</div>
	<div class="newClass" id="newClass">
		<span style="margin-left: 26px;"><img style="margin-right: 4px;margin-left: -16px;margin-bottom: -1px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="meet.th.AddDevice" /></span>
	</div>
</div>
<div class="main">
	<div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 50px;">
		<table>
			<thead>
			<tr>
				<th style="padding-left: 20px;"><input type="checkbox" name="checkedAll" id="checkedAll"></th>
				<th width="75%"><fmt:message code="meet.th.DeviceName" /></th>
				<th style="padding-left: 20px;" width="15%"><fmt:message code="notice.th.operation" /></th>
			</tr>
			</thead>
			<tbody>
		<%--	<tr>
				<td><input type="checkbox" name="checkedChild"></td>
				<td>暖壶</td>
				<td><a href="javascript:;">编辑</a></td>
			</tr>--%>
			</tbody>
		</table>
	</div>
</div>
</div>

<script>
    var user_id='';
    $(function () {

       //初始化数据
       init();


        //全选点击事件
        $('#checkedAll').click(function(){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
                $(".checkChild").prop("checked",true);
                $(".contentTr").addClass('bgcolor');
            }else{
                $(this).prop("checked",false);
                $(".checkChild").prop("checked",false);;
                $('.contentTr').removeClass('bgcolor');
            }
        })

        //点击新建分类
        $('#newClass').click(function(event) {
            event.stopPropagation();
            layer.open({
                type: 1,
                title: ['<fmt:message code="meet.th.NewDevice" />', 'background-color:#2b7fe0;color:#fff;'],
                area: ['300px', '220px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="height: 100px;width: 250px; margin-top: 10px; margin-left: 10px;">'+
                '<div class="div_tr">' +
					'<span class="span_td"><fmt:message code="meet.th.DeviceName" />：</span>'+
					'<span><input type="text" style="width: 130px;float: none;" name="equipmentName" class="inputTd" value="" /></span></div>' +
                '</div>',
                yes: function (index) {
                    var data = {
                        equipmentName: $('input[name="equipmentName"]').val()
                    }
                    if(data==""){
                        $.layerMsg({content:'内容不能为空',icon:3});
					}else{
                        newClassification(data);
                        layer.close(index);
					}
                },
            });
        });

        $("#stateUser").on("click",function(){//选人员控件
            user_id='userDuser';
            $.popWindow("../common/selectUser");
        });
        $('#clearState').click(function(){ //清空人员
            $('#userDuser').attr('user_id','');
            $('#userDuser').attr('dataid','');
            $('#userDuser').val('');
        });
    })

    //新建分类接口
    function newClassification(data){
        $.ajax({
            type:'post',
            url:'<%=basePath%>Meetequipment/addEquiets',
            dataType:'json',
            data:data,
            success:function(res){
                init();
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />！',icon:1});
                }else{
                    $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />！',icon:2});
                }
            }
        })
    }

    //修改接口接口
    function editClassification(data){
        $.ajax({
            type:'post',
            url:'<%=basePath%>Meetequipment/updateEquiet',
            dataType:'json',
            data:data,
            success:function(res){
                init();
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="menuSSetting.th.editSuccess" />！',icon:1});
                }else{
                    $.layerMsg({content:'<fmt:message code="depatement.th.modifyfailed" />！',icon:2});
                }
            }
        })
    }

    function init() {
        $('.pagediv tbody tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath%>Meetequipment/getAllEquiet',
            dataType:'json',
            success:function(res) {
                var data=res.obj;
                var str='';
                if(data.length>0){
                    for(var i=0;i<data.length;i++) {
                    str+='<tr class="contentTr" sId="'+data[i].sid+'"><td  style="padding-left: 20px;"><input type="checkbox" name="checkedChild" class="checkChild" sId="'+data[i].sid+'"></td><input type="hidden" id="'+data[i].sid+'"><td>'+data[i].equipmentName+'</td><td style="padding-left: 20px;"><a href="javascript:edit('+data[i].sid+');"><fmt:message code="global.lang.edit" /></a>&nbsp;<a href="javascript:deleteone('+data[i].sid+');"><fmt:message code="global.lang.delete" /></a></td>';
                    }
                    $('.pagediv tbody').append(str);
                    }
            }
            });
    }

    function edit(e){
      var equipmentName="";
        $.ajax({
            type:'get',
            url:'<%=basePath%>Meetequipment/getdetailEquiet',
			data:{Sid:e},
            dataType:'json',
            success:function(res) {
                equipmentName=res.object.equipmentName;
                layer.open({
                    type: 1,
                    title: ['<fmt:message code="meet.th.ModifDevice" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['300px', '220px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                    content: '<div class="div_table" style="height: 100px;width: 250px; margin-top: 10px; margin-left: 10px;">'+
                    '<div class="div_tr"><span class="span_td"><fmt:message code="meet.th.DeviceName" />：</span><span><input type="text" style="width: 130px;float: none;" name="equipmentName" id="next" class="inputTd" value="" /></span></div>' +
                    '</div>',
                    yes: function (index) {
                        var data = {
                            sid: e,
                            equipmentName: $('input[name="equipmentName"]').val()
                        }
                        editClassification(data);
                        layer.close(index);
                    },
					success:function(){
                        $('#next').val(equipmentName);
					}
                });
			}
        });
	}
	//单个删除新闻
function deleteone(e){
    layer.confirm('<fmt:message code="sup.th.Delete" />？', {
        btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
        title:"<fmt:message code="notice.th.DeleteAttachment" />"
    }, function(){
        //确定删除，调接口
        $.ajax({
            type:'post',
            url:'<%=basePath%>Meetequipment/deleteEquiets',
            dataType:'json',
            data:{'Sids':e},
            success:function(){
                layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                init();
            }
        })
    }, function(){
        layer.closeAll();
    });
	}
    $('#batchDelete').click(function(){
        var Sids='';
        $("#already .checkChild:checkbox:checked").each(function(){
            var conId=$(this).attr("sId");
            Sids+=conId+",";
        })
        if(Sids == ''){
            layer.msg('<fmt:message code="meet.th.PleaseDelete" />', { icon:2});
        }else {
            layer.confirm('<fmt:message code="sup.th.Delete" />？', {
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                title:"<fmt:message code="notice.th.DeleteAttachment" />"
            }, function() {
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>Meetequipment/deleteEquiets',
                    dataType: 'json',
                    data: {'Sids': Sids},
                    success: function () {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', {icon: 6});
                        init();
                    }
                })
            }, function(){
                layer.closeAll();
            });
        }
	})

</script>
</body>
</html>
