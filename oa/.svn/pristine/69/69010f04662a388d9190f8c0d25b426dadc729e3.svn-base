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
	<title><fmt:message code="sup.th.SupervisionStatistics" /></title>
	<link rel="stylesheet" href="/css/supervise/statistic.css">
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
		table th, table td{
			text-align:left;
			padding-left:10px;
		}
		/*#laydate_box .laydate_top,#laydate_box .laydate_table,#laydate_today{display:none;}*/
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
	<div class="headImg">
		<img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_statistics.png" alt="">
	</div>
	<div class="divTitle">
		<fmt:message code="sup.th.SupervisionStatistics" />
	</div>
</div>
<div class="head w clearfix">
	<ul class="index_head">
		<li id="survey"><span class="one headli"><fmt:message code="sup.th.ByDepartment" /></span><img src="../img/twoth.png" alt=""/></li>
		<li id="DATA"><span class="headli"><fmt:message code="sup.th.ByCategory" /></span><img src="../img/twoth.png" alt=""/></li>
		<li id="administration"><span class="headli" style="margin-top: 4px;"><fmt:message code="sup.th.ByStatus" /></span></li>
	</ul>
</div><!--标题导航结束-->
<div class="main">
	<div class="byDepart" style="display: block;">
		<div class="queryConditon">
			<%--<span><fmt:message code="sup.th.TaskClassification" />：</span>
			<select name="parentId" id="parentId" style="width: 180px;height: 28px;margin-left: 5px;border: #ebebeb 1px solid;"></select>
			<span><fmt:message code="sup.th.startTime" />：</span>
			<input type="text" name="startTime" id="startTimeOne" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
			<span style="margin: 0 15px;">～</span>
			<input type="text" name="endTime" id="endTimeOne" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})	">
			<span class="btnSpan" id="query"><fmt:message code="global.lang.query" /></span>
			<span class="btnSpan" id="reset"><fmt:message code="workflow.th.Reset" /></span>--%>
		</div>
		<div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 10px;">
			<table>
				<thead>
				<tr>
					<th><fmt:message code="sup.th.SponsorDepartment" /></th>
					<th><fmt:message code="sup.th.TotalTasks" /></th>
					<th><fmt:message code="sup.th.PendingRelease" /></th>
					<th><fmt:message code="sup.th.Substitute" /></th>
					<th><fmt:message code="sup.th.NormalProcessing" /></th>
					<th><fmt:message code="sup.th.Overdue" /></th>
					<th><fmt:message code="sup.th.Paused" /></th>
					<th><fmt:message code="sup.th.Normal" /></th>
					<th><fmt:message code="sup.th.Overdued" /></th>
				</tr>
				</thead>
				<tbody>

				</tbody>
			</table>
		</div>
	</div>
	<div class="byClass" style="display: none;">
		<div class="queryConditon">
			<%--<span><fmt:message code="sup.th.SponsorDepartment" />：</span>
			<textarea name="txt" id="userDept" deptid="" value="" disabled style="min-width: 200px;min-height:30px;"></textarea>
			<a href="javascript:;" id="addDept"><fmt:message code="global.lang.add" /></a><a href="javascript:;" id="celarDept"><fmt:message code="global.lang.empty" /></a>
			<span><fmt:message code="sup.th.startTime" />：</span>
			<input type="text" name="startTime" id="startTineTwo" onclick="laydate(start)">
			<span style="margin: 0 15px;">～</span>
			<input type="text" name="endTime" id="endTimeTwo" onclick="laydate(end)">
			<span class="btnSpan" id="queryDept"><fmt:message code="global.lang.query" /></span>
			<span class="btnSpan" id="resetType"><fmt:message code="workflow.th.Reset" /></span>--%>
		</div>
		<div class="pagediv" id="alreadys" style="margin: 0 auto;width: 97%;margin-top: 10px;">
			<table>
				<thead>
				<tr>
					<th><fmt:message code="sup.th.CategoryName" /></th>
					<th><fmt:message code="sup.th.TotalTasks" /></th>
					<th><fmt:message code="sup.th.PendingRelease" /></th>
					<th><fmt:message code="sup.th.Substitute" /></th>
					<th><fmt:message code="sup.th.NormalProcessing" /></th>
					<th><fmt:message code="sup.th.Overdue" /></th>
					<th><fmt:message code="sup.th.Paused" /></th>
					<th><fmt:message code="sup.th.Normal" /></th>
					<th><fmt:message code="sup.th.Overdued" /></th>
				</tr>
				</thead>
				<tbody>

				</tbody>
			</table>
		</div>
	</div>
	<div class="byState" style="display: none;">
		<div class="queryConditon">
			<%--<span><fmt:message code="sup.th.SponsorDepartment" />：</span>
			<textarea name="txt" id="userState" deptid="" value="" disabled style="min-width: 180px;min-height:30px;"></textarea>
			<a href="javascript:;" id="stateDept"><fmt:message code="global.lang.add" /></a><a href="javascript:;" id="clearState"><fmt:message code="global.lang.empty" /></a>
			<span><fmt:message code="sup.th.TaskClassification" />：</span>
			&lt;%&ndash;<input type="text" name="taskClass" style="width: 130px">&ndash;%&gt;
			&lt;%&ndash;<a href="javascript:;">选择</a><a href="javascript:;">清空</a>&ndash;%&gt;
			<select name="parentId" id="parentIdState" style="width: 180px;height: 28px;margin-left: 5px;border: #ebebeb 1px solid;"></select>
			<span><fmt:message code="sup.th.startTime" />：</span>
			<input type="text" name="startTime" id="startTimeThr" style="width: 130px" onclick="laydate(start)">
			<span style="margin: 0 5px;">～</span>
			<input type="text" name="endTime" id="endTimeThr" style="width: 130px" onclick="laydate(end)">
			<span class="btnSpan" id="queryState"><fmt:message code="global.lang.query" /></span>
			<span class="btnSpan" id="resetState"><fmt:message code="workflow.th.Reset" /></span>--%>
		</div>
		<div class="pagediv" id="alreadyw" style="margin: 0 auto;width: 97%;margin-top: 10px;">
			<table>
				<thead>
				<tr>
					<th><fmt:message code="notice.th.state" /></th>
					<th><fmt:message code="sup.th.Quantity(item)" /></th>
				</tr>
				</thead>
				<tbody>

				</tbody>
			</table>
		</div>
	</div>
</div>

<script>
    var dept_id='';
    $(function () {
        //数据初始化
        init($('#already tbody'),1);

        $("#addDept").on("click",function(){//选部门控件
            dept_id='userDept';
            $.popWindow("../common/selectDept");
        });
        $("#stateDept").on("click",function(){//选部门控件
            dept_id='userState';
            $.popWindow("../common/selectDept");
        });
        $('#celarDept').click(function(){ //清空部门
            $('#userDept').attr('deptid','');
            $('#userDept').attr('deptno','');
            $('#userDept').val('');
        });
        $('#clearState').click(function(){ //清空部门
            $('#userState').attr('deptid','');
            $('#userState').attr('deptno','');
            $('#userState').val('');
        });
        $('#survey').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.byDepart').show().siblings().hide();
//            typeDeptData(datas,$('#already tbody'));
            init($('#already tbody'),1)
        })
        $('#DATA').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.byClass').show().siblings().hide();
//            typeDeptData(2,$('#alreadys tbody'));
			init($('#alreadys tbody'),2)
        })
        $('#administration').click(function(){
            $(this).find('.headli').addClass('one').end().siblings().find('.headli').removeClass('one');
            $('.byState').show().siblings().hide();
//            typeStateData($('#alreadyw tbody'))
            init($('#alreadyw tbody'),3);
        })
        //所属分类下拉
        $('#parentId').typeSelect();
        //所属分类下拉
        $('#parentIdState').typeSelect();
        //按部门条件查询
		$('#query').click(function(){
			var datas={
                type1:1
//                typeId:$('#parentId option:checked').val(),
//                beginDate:$('#startTimeOne').val(),
//                endDate:$('#endTimeOne').val()
			}
            typeDeptData(datas,$('#already tbody'))
		})
        //按部门重置按钮
        $('#reset').click(function(){
            $('#parentId').val('-1');
            $('input[name="startTime"]').val('');
            $('input[name="endTime"]').val('');
		})
		//按类别条件查询
		$('#queryDept').click(function(){
            var datas={
                type1:2

//                deptId:$('#userDept').attr('deptid'),
//                beginDate:$('#startTineTwo').val(),
//                endDate:$('#endTimeTwo').val()
            }
            typeDeptData(datas,$('#alreadys tbody'))
        })
		//按类别重置按钮
		$('#resetType').click(function(){
		    $('#userDept').attr('deptid','');
            $('#userDept').attr('deptno','');
            $('#userDept').val('');
            $('input[name="startTime"]').val('');
            $('input[name="endTime"]').val('');
		})
		//按状态条件查询
		$('#queryState').click(function(){
            var datas={
                type1:3,
                typeId:$('#parentIdState option:checked').val(),
                deptId:$('#userState').attr('deptid'),
                beginDate:$('#startTimeThr').val(),
                endDate:$('#endTimeThr').val()
            }
            typeStateData(datas,$('#alreadyw tbody'))
		})
		//按状态重置按钮
		$('#resetState').click(function () {
			$('#userState').attr('deptid','');
            $('#userState').attr('deptno','');
            $('#userState').val('');
            $('#parentIdState').val('-1');
            $('input[name="startTime"]').val('');
            $('input[name="endTime"]').val('');
        })
    })

	//按部门和分类中的查询方法
	function typeDeptData(datas,element){
//        $('.sTrdata').remove();
        element.find('tr').remove();
        $.ajax({
			type:'get',
			url:'<%=basePath%>supervision/selectCountList',
			dataType:'json',
			data:datas,
			success:function(res){
			    var data=res.obj;
			    var str='';
                var totalNum=0;
			    for(var i=0;i<data.length;i++){
			        totalNum=Number(data[i].count0)+Number(data[i].count1)+Number(data[i].count2)+Number(data[i].count3)+Number(data[i].count4)+Number(data[i].count5)+Number(data[i].count6)
			        str+='<tr class="sTrdata">' +
						'<td>'+data[i].deptName+'</td><td>'+totalNum+'</td><td>'+data[i].count0+'</td><td>'+data[i].count1+'</td><td>'+data[i].count2+'</td>' +
						'<td>'+data[i].count3+'</td><td>'+data[i].count4+'</td><td>'+data[i].count5+'</td><td>'+data[i].count6+'</td>' +
						'</tr>'
				}
                element.append(str);
			}
		})
	}
    //按状态列表数据
    function typeStateData(datas,element){
        element.find('tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath%>supervision/selectCountList',
            dataType:'json',
            data:datas,
            success:function(res){
                var data=res.object;
                var str='';
                var totalNum=0;
                    totalNum=Number(data.count0)+Number(data.count1)+Number(data.count2)+Number(data.count3)+Number(data.count4)+Number(data.count5)+Number(data.count6)
                    str+='<tr><td><fmt:message code="notice.th.unposted" /></td><td>'+data.count0+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Substitute" /></td><td>'+data.count1+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.NormalProcessing" /></td><td>'+data.count2+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Overdue" /></td><td>'+data.count3+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Paused" /></td><td>'+data.count4+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Normal" /></td><td>'+data.count5+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Overdued" /></td><td>'+data.count6+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Total" /></td><td>'+totalNum+'</td></tr>';
                element.append(str);
            }
        })
    }

    //页面初始化
    function init(element,tId){
        element.find('tr').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath%>supervision/selectCountList',
            dataType:'json',
			data:{'type1':tId},
            success:function(res){
                var data=res.obj;
                var datas=res.object;
                var str='';
                var totalNum=0;
                if(tId == 1){
                    for(var i=0;i<data.length;i++){
                        totalNum=Number(data[i].count0)+Number(data[i].count1)+Number(data[i].count2)+Number(data[i].count3)+Number(data[i].count4)+Number(data[i].count5)+Number(data[i].count6)
                        str+='<tr>' +
                            '<td>'+data[i].deptName+'</td><td>'+totalNum+'</td><td>'+data[i].count0+'</td><td>'+data[i].count1+'</td><td>'+data[i].count2+'</td>' +
                            '<td>'+data[i].count3+'</td><td>'+data[i].count4+'</td><td>'+data[i].count5+'</td><td>'+data[i].count6+'</td>' +
                            '</tr>'
                    }
				}else if(tId == 3){
                    totalNum=Number(datas.count0)+Number(datas.count1)+Number(datas.count2)+Number(datas.count3)+Number(datas.count4)+Number(datas.count5)+Number(datas.count6)
                    str+='<tr><td><fmt:message code="notice.th.unposted" /></td><td>'+datas.count0+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Substitute" /></td><td>'+datas.count1+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.NormalProcessing" /></td><td>'+datas.count2+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Overdue" /></td><td>'+datas.count3+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Paused" /></td><td>'+datas.count4+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Normal" /></td><td>'+datas.count5+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Overdued" /></td><td>'+datas.count6+'</td></tr>'+
                        '<tr><td><fmt:message code="sup.th.Total" /></td><td>'+totalNum+'</td></tr>';
				}else if(tId == 2){
                    for(var i=0;i<data.length;i++){
                        totalNum=Number(data[i].count0)+Number(data[i].count1)+Number(data[i].count2)+Number(data[i].count3)+Number(data[i].count4)+Number(data[i].count5)+Number(data[i].count6)
                        str+='<tr class="sTrdata">' +
                            '<td>'+data[i].deptName+'</td><td>'+totalNum+'</td><td>'+data[i].count0+'</td><td>'+data[i].count1+'</td><td>'+data[i].count2+'</td>' +
                            '<td>'+data[i].count3+'</td><td>'+data[i].count4+'</td><td>'+data[i].count5+'</td><td>'+data[i].count6+'</td>' +
                            '</tr>'
                    }
				}

                element.append(str);
            }
        })
    }
    //
    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm',
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
        format: 'YYYY/MM/DD hh:mm',
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
