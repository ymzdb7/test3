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
	<title><fmt:message code="sup.th.SupervisionTask" /></title>
	<link rel="stylesheet" href="/css/supervise/index.css">
	<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
	<link rel="stylesheet" href="/lib/laydate/need/laydate.css">
	<link rel="stylesheet" href="/lib/pagination/style/pagination.css">
	<%--<link rel="stylesheet" href="/css/base.css">--%>
	<script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
	<script src="/lib/layer/layer.js"></script>
	<script src="/js/base/base.js"></script>
	<script src="/lib/laydate/laydate.js"></script>
	<script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
	<style>
		table th,table td{
			text-align:left;
			padding:10px;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
	<div class="headImg">
		<img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_task.png" alt="">
	</div>
	<div class="divTitle">
		<fmt:message code="sup.th.SupervisionTask" />
	</div>
</div>
<%--<div style="margin: 0 auto;margin-top: 46px;height: 60px;width: 97%;" class="clearfix">--%>
	<div class="head w clearfix">
		<ul class="index_head">
			<li id="survey"><span class="one headli"><fmt:message code="lang.th.will" /></span><img src="../img/twoth.png" alt=""/>
			</li>
			<li id="DATA"><span class="headli"><fmt:message code="sup.th.InProcess" /></span><img src="../img/twoth.png" alt=""/>
			</li>
			<li id="statistics"><span class="headli"><fmt:message code="sup.th.Paused" /></span><img src="../img/twoth.png" alt=""/>
			</li>
			<li id="administration"><span class="headli" style="margin-top: 4px;"><fmt:message code="sup.th.HaveGoneThrough" /></span></li>
		</ul>
	</div><!--标题导航结束-->
	<%--<label class="fl" style="margin-top: 16px;">--%>
		<%--<select name="dispatchType" id="">--%>
			<%--<option value="">请选择</option>--%>
		<%--</select>--%>
	<%--</label>--%>

	<%--<label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;">--%>
		<%--<span class="fl" style="margin-top: 5px;">日期：</span>--%>
		<%--<label class="fl">--%>
			<%--<input name="printDate"  placeholder="请输入日期" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" type="text">--%>
		<%--</label>--%>
		<%--<button  type="button" class="Query fl">查询</button>--%>
	<%--</label>--%>
	<%--<div id="dbgz_page" class="M-box3 fr">--%>

	<%--</div>--%>

<%--</div>--%>

<div class="pagediv" id="already" style="margin: 0 auto;width: 97%;display: block;margin-top: 10px;">
	<table>
		<thead>
		<tr>
			<th><fmt:message code="sup.th.SupervisionMatters" /></th>
			<th><fmt:message code="sup.th.SubordinateClassification" /></th>
			<th><fmt:message code="sup.th.ResponsibleLeadership" /></th>
			<th><fmt:message code="sup.th.Sponsor" /></th>
			<th><fmt:message code="sup.th.CoOrganizer" /></th>
			<th style="width:25%"><fmt:message code="journal.th.Deadline" /></th>
			<th><fmt:message code="notice.th.operation" /></th>
		</tr>
		</thead>
		<tbody>

		</tbody>
	</table>
</div>
<div class="pagediv" id="pagediv" style="margin: 0 auto;width: 97%;margin-top: 10px;display: none;">
	<table>
		<thead>
		<tr>
			<th><fmt:message code="sup.th.SupervisionMatters" /></th>
			<th><fmt:message code="sup.th.SubordinateClassification" /></th>
			<th><fmt:message code="sup.th.ResponsibleLeadership" /></th>
			<th><fmt:message code="sup.th.Sponsor" /></th>
			<th><fmt:message code="sup.th.CoOrganizer" /></th>
			<th style="width: 25%"><fmt:message code="journal.th.Deadline" /></th>
			<th><fmt:message code="sup.th.StateDescription" /></th>
			<th><fmt:message code="notice.th.operation" /></th>
		</tr>
		</thead>
		<tbody>

		</tbody>
	</table>
</div>
<script>
	$(function () {
	    //页面初始化
        dataList (7);
		$('#survey').click(function(){
		    $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
		    $('#already').show();
		    $('#pagediv').hide();
            dataList (7);
		})
        $('#DATA').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#pagediv').show();
            $('#already').hide();
            dataInit();
        })
        $('#statistics').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#already').show();
            $('#pagediv').hide();
            dataList (3);
        })
        $('#administration').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('#already').show();
            $('#pagediv').hide();
            dataList (6);
        })
    })
	//点击查看
	$('#already').on('click','#seeDetails',function(){
	    var sId=$(this).parents('tr').attr('sId');
        var status=$(this).parents('tr').attr('status');
        $.popWindow('<%=basePath %>SupervCommon/Supervisionhandle?type=2&sid='+sId+'&status='+status,'<fmt:message code="sup.th.SupervisionTaskManagement" />','0','0','1500px','800px');
	})
	//点击办理
	$('#pagediv').on('click','#handleSup',function(){
	    var sId=$(this).attr('sId');
	    var status=$(this).parents('tr').attr('status');
        $.popWindow('<%=basePath %>SupervCommon/Supervisionhandle?type=1&sid='+sId+'&status='+status,'<fmt:message code="sup.th.SupervisionTaskManagement" />','0','0','1500px','800px');
	})
	//点击签收
	$('#already').on('click','#signSup',function(){
        var sId=$(this).parents('tr').attr('sId');
        $.ajax({
            type:'post',
            url:'<%=basePath %>supervision/updateSupStatus',
            dataType:'json',
            data:{sid:sId,status:1},
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'签收成功！',icon:6});
                    dataList (7);
                }else{
                    $.layerMsg({content:'签收失败！',icon:5});
                }

            }
        })
	})
	//未接收、已暂停、已办结数据列表
	function dataList (iNow) {
        $('#already tbody tr').remove();
		$.ajax({
			type:'get',
			url:'<%=basePath %>supervision/getSupApplyTaskList',
			dataType:'json',
			data:{'status':iNow},
			success:function(res){
			    var datas=res.object;
			    console.log(datas);
			    var str='';
			    if(datas.length>0){
                    for(var i=0;i<datas.length;i++){

                        if(iNow == 7){

                            str+='<tr sId="'+datas[i].sid+'" status="'+datas[i].status+'">' +
                                '<td>'+datas[i].supName+'</td>' +
                                '<td>'+datas[i].typeName+'</td>' +
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
                                '<td>'+datas[i].userPrivName+'</td>' +
                                '<td>'+datas[i].endTime.split('.')[0]+'</td>' +
                                '<td><a href="javascript:;" id="seeDetails"><fmt:message code="long.th.See" /></a>';
                                if(datas[i].count0==1){
                                    str+='<a href="javascript:;" id="signSup" style="margin-left: 10px;"><fmt:message code="sup.th.Sign" />';
								}
                            str+='</a></td> </tr>';
                        }else{
                            str+='<tr sId="'+datas[i].sid+'" status="'+datas[i].status+'">' +
                                '<td>'+datas[i].supName+'</td>' +
                                '<td>'+datas[i].typeName+'</td>' +
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
                                '<td>'+datas[i].userPrivName+'</td>' +
                                '<td>'+datas[i].endTime+'</td>' +
                                '<td><a href="javascript:;" id="seeDetails"><fmt:message code="long.th.See" /></a></td>' +
                                '</tr>';
                        }
                    }
                    $('#already tbody').append(str);
				}else{
                    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:0});
				}
			}
		})
    }
    //处理中数据列表
    function dataInit(){
        $('#pagediv tbody tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath %>supervision/getSupApplyTaskList',
            dataType:'json',
            data:{'status':1},
            success:function(res){
                var datas=res.object;
                var str='';

                if(res.msg == 'ok'){
                    for(var i=0;i<datas.length;i++){
                        var state='';
                        if(datas[i].status == '1'){
                            state='进行中';
						}else if(datas[i].status == '2'){
                            state='暂停申请中';
						}else if(datas[i].status == '4'){
						    state='恢复暂停申请中';
						}else if(datas[i].status == '5'){
						    state='办结申请中';
						}
                        str+='<tr  status="'+datas[i].status+'">' +
                            '<td>'+datas[i].supName+'</td>' +
                            '<td>'+datas[i].typeName+'</td>' +
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
                            '<td>'+datas[i].userPrivName+'</td>' +
                            '<td>'+datas[i].endTime.split('.')[0]+'</td>' +
                            '<td>'+state+'</td>' +
                            '<td><a href="javascript:;" id="handleSup" sId="'+datas[i].sid+'"><fmt:message code="document.th.handle" /></a></td>' +
                            '</tr>';
                    }
                    $('#pagediv tbody').append(str);
				}else{
                    $.layerMsg({content:'<fmt:message code="sup.th.NoMoreContent" />！',icon:0});
				}
            }
        })
	}

	//正在开发中
	function development(){
        $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment" />！',icon:6});
	}
</script>
</body>
</html>
