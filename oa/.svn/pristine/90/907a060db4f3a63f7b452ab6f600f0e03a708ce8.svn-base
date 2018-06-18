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
	<title>分类设置</title>
	<link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
	<link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/base.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
	<link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
	<script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
	<script src="../../js/news/page.js"></script>
	<script src="../../lib/laydate.js"></script>
	<script type="text/javascript" src="../../lib/layui-v1.0.9_rls/layui/lay/dest/layui.all.js"></script>
	<script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="../../lib/layer/layer.js"></script>
	<style>
		* {font-family: "Microsoft Yahei" !important;}
		.wrap{
			margin-left: 1%;
			margin-top: 1%;
		}
		.head .headli1_1 {
			width:99px !important;

		}
		.f_title{
			margin-top: 22px;
		}
		.sort_liucheng,.new_liucheng{
			width: 100px;
			height: 25px;
			margin-bottom: 5px;
			background: #red;
			float: left;
			margin-top: -3px;
		}
		.sort_liucheng h1,.new_liucheng h1{
			text-align:center;
			line-height: 25px;
		}
		.table_head{
			width: 100%;
			height: 32px;
			position: relative;
		}
		.new_liucheng{
			background: url("/img/cabinet01.png") no-repeat;
			color: #fff;
			border-radius: 6px;
			position: absolute;
			right: 3px;
			cursor: pointer;
			height:30px;
			line-height: 30px;
			font-size:12pt;
			width: 100px;
		}
		.edit_biaodan,.delete_biaodan{
			cursor: pointer;
		}
		#tr_td{
			text-align: center;
		}
		.levelleft1{
			margin-left:4em;
		}
		.levelleft2{
			margin-left:8em;
		}
        .levelleft3{
            margin-left:12em;
        }
        .levelleft4{
            margin-left:16em;
        }
		.change{
			background-color: #2F8AE3;
			font-size: 14px;
			color: #ffffff;
			border-radius: 20px;
		}
		#liucheng{

			/*  margin-left: 78px;*/
			margin-top: 7px;
		}

		#liucheng h1,#biaodan h1{
			width:100%;
			text-align:center;
			line-height:26px;
		}

		.conter{
			width:500px;
			max-height:800px;
			margin:auto;
		}
		.edit_biaodan{
			color: #1772c0;
		}
		.delete_biaodan{
			color: #e01919;
		}
		.f_field_title {
			font-size: 12px;
			font-weight: bold;
			margin-left: 2px;
			margin-right: 2px;
		}
		.f_field_required {
			color: red;
			font-size: 12px;
			margin-top: 0px;
			margin-left: 2px;
			margin-right: 2px;
		}
		.f_field_ctrl {
			margin-top: 5px;
			margin-left: 2px;
		}
		select {

			height: 34px;
			padding:5px 0px;
			width: 225px;
			border-radius: 4px;
			border: 1px solid #cccccc;
			background-color: #ffffff;
			display: inline-block!important;
		}
		.f_field_label{
			width: 125px;
		}
		.f_field_title {
			font-size: 14px;
			font-weight: bold;
			margin-left: 2px;
			margin-right: 2px;
			width: 105px;
			display: inline-block;
			text-align: right;
		}
		.f_field_required {
			color: red;
			font-size: 12px;
			margin-top: 0px;
			margin-left: 2px;
			margin-right: 2px;
		}
		.f_field_ctrl {
			margin-top: 5px;
			margin-left: 2px;
		}
		.f_field_ctrl input{
			color:#000;
			text-align: left;
			padding-left: 5px;
		}
		.f_field_block {
			width: 100%;
			margin-top: 14px;
			margin-bottom: 4px;
			display: block;
			text-align: left;
		}
		.inp{
			width: 221px;
			height: 32px;
			line-height: 32px;
			border-radius: 4px;
			padding:0;
		}
		.layui-layer-title{
			background: #2b7fe0!important;
			color: #fff!important;
		}
		/*	#layui-layer2{
                border-radius:10px;
            }*/
		.center{
			height:400px !important;
		}
		.delete_flow,.edit_liucheng{
			cursor: pointer;
		}
		.edit_liucheng{
			color: #1772c0;
		}
		.delete_flow{
			color: #e01919;
		}
		.navigation .left img {

			padding-left: 10px;
		}
		.head .headli2_1{
			padding: 0px;
		}
		.navigation{
			float: none;
		}
		.spanlow{
			margin:0 7px;
		}
		table{
			table-layout: fixed!important;
		}
		table td{
			overflow: hidden!important;
			text-overflow:ellipsis!important;
			white-space: nowrap!important;
			text-align: center!important;
			padding:10px!important;
		}
		table td a{
			overflow: hidden!important;
			text-overflow:ellipsis!important;
			white-space: nowrap!important;

		}
		/*<img src="img/workflow/one.png">*/
		/*.img{
			width:20px;
			height:20px;
			background: red;
		}
			.img,.sort{
                    float:left;
                }*/
		.select_duplicate_sort{
			display: inline-block!important;
		}
		.layui-form-onswitch{
			border-color: #2b7fe0!important;
			background-color: #2b7fe0!important;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="bx">
	<!--head开始-->
	<div class="head w clearfix">
		<ul class="index_head">
			<%--<li  >--%>
				<%--<span class="one headli"></span>--%>

			<%--</li>--%>

			<%--<li >--%>
				<%--<span class="headli"></span>--%>
			<%--</li>--%>





			<li id="biaodan" data_id="0" style="height:20px;line-height: 20px;    margin-top: 6px;
    margin-left: 12px;padding: 6px 10px;" class="change">
					<fmt:message code="workflow.th.tablesort" />
			</li>
				<li>
					<img class="headli1_2" src="../../img/twoth.png" alt=""/>
				</li>
				<li data_id="" id="liucheng" style="height:20px;line-height: 20px;    margin-top: 6px;
    margin-left: 12px;padding: 6px 10px;">


					<fmt:message code="workflow.th.process" />

			</li>


		</ul>
	</div>
	<!--head通栏结束-->
	<div class="navigation  clearfix">
		<div class="left">
			<img class="flow_img" style="padding-left: 19px;" src="/img/commonTheme/${sessionScope.InterfaceModel}/form_img.png" alt="">
			<div class="news"><fmt:message code="workflow.th.tablesort" /></div>
		</div>
		<div class="table_head" style="margin-top: 24px;">

			<div class="new_liucheng" data-numtrue="1"><h1 style="line-height: 30px;"><img style="margin-right: 4px;margin-left: -5px;margin-bottom: 2px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="global.lang.new" /></h1></div>
		</div>
	</div>



	<!--content部分开始-->
	<div style="margin-top: -16px;">
		<div class="wrap">

			<div class="tab_t">
				<div class="tab_tone">
					<table id="tr_td">
						<thead>
						<tr>
							<td class="th" width="20%">
								<fmt:message code="workflow.th.Serial" />
							</td>
							<td class="th" width="35%">
								<fmt:message code="workflow.th.name" />
							</td>
							<td class="th" width="15%">
								<fmt:message code="workflow.th.Formquantity" />
							</td>

							<td class="th" width="15%">
								<fmt:message code="workflow.th.sector" />
							</td>
							<td class="th" width="15%">
								<fmt:message code="notice.th.operation" />
							</td>
							<!-- <td class="th">发布部门</td> -->
						</tr>
						</thead>
						<tbody id="j_tb">

						</tbody>

					</table>
				</div>


				<div class="tab_ttwo" style="display:none;">
					<table id="tr_tds">
						<thead>
						<tr>
							<td class="th" width="20%" align="center">
								<fmt:message code="workflow.th.Serial" />
							</td>
							<td class="th" width="35%" align="center">
								<fmt:message code="workflow.th.name" />
							</td>
							<td class="th" width="15%" align="center">
								<fmt:message code="workflow.th.Formquantity" />
							</td>

							<td class="th" width="15%" align="center">
								<fmt:message code="workflow.th.sector" />
							</td>
							<td class="th" width="15%" align="center">
								<fmt:message code="notice.th.operation" />
							</td>
							<!-- <td class="th">发布部门</td> -->
						</tr>
						</thead>
						<tbody id="c_biaodan">
						<!-- <tr><td><a  notifyId="" class="windowOpen '+className+'">1</a></td>
                            <td><a notifyId="" class="windowOpen '+className+'">行政管理</a></td>
                            <td><a notifyId="" class="windowOpen '+className+'">3</a></td>
                            <td><a notifyId="" class="windowOpen '+className+'">全部部门</a></td>
                            <td><a notifyId="" class="windowOpen '+className+'">编辑|删除</a></td>
                        </tr> -->
						</tbody>

					</table>
				</div>
			</div>

		</div>


	</div>
	<!--content部分结束-->

	<!--  内容 -->



</div>

<!--footer部分结束-->
</div>
<script>
    var form = layui.form(),layer = layui.layer;

    $(function () {
        //tab切换

        $('.clearfix').on('click','li',function(){
            $(".clearfix li").removeClass("change");
            $(this).addClass('change');
            if($(this).attr('id')=='biaodan'){
				$('.news').html('<fmt:message code="workflow.th.tablesort" />');
				$('.flow_img').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/form_img.png');
                $('.tab_tone').css("display","block");
                $('.tab_ttwo').css("display","none");
                $('.sort_liucheng h1').html('<fmt:message code="workflow.th.tablelist" />');

                $('.new_liucheng').attr('data-numtrue',1)

            }else {
                $('.news').html('<fmt:message code="workflow.th.process" />');
                $('.flow_img').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/flow_img.png');
                $('.tab_ttwo').css("display","block");
                $('.tab_tone').css("display","none");
                $('.sort_liucheng h1').html('<fmt:message code="workflow.th.processlist" />');

                $('.new_liucheng').attr('data-numtrue',2)
            }
        });

            //新增
            $('.new_liucheng').on('click', function () {
                var me = this;
                layer.open({
                    type: 1,
					/* skin: 'layui-layer-rim', //加上边框 */
                    offset: '80px',
                    area: ['600px', '400px'], //宽高
                    title: $(this).find('h1').text(),
                    content: ' <form action="" class="layui-form"><div class="conter">' +
                    '<div class="f_title">' +

                    '<div class="f_field_ctrl clear" style="margin-bottom: 14px;">' +
                    '<span class="f_field_title" id="father_form"></span>' +
                    '<span class="f_field_required">*</span>' +
                    '<select name="SORT_PARENT" id="sort_parent"></select>' +
                    '<span><fmt:message code="workflow.th.fristNull" /></span></div>' +
                    '<div class="f_field_block">' +
                    '<div class="f_field_label" style="display: inline-block;\
                    vertical-align: middle;">' +
                    '<span class="f_field_title" id="sort_form"></span>' +
                    '<span class="f_field_required">*</span>' +
                    '</div>' +
                    '<div class="f_field_ctrl clear" style="    height: 100%;\
                    display: inline-block;\
                vertical-align: middle;    margin-left: -6px;">' +
                    '<input type="number" name="SORT_NO" class="inp" value="0" id="sort_no">' +
                    '</div>' +
                    '</div>' +
                    '<div class="f_field_block">' +
                    '<div class="f_field_label" style="display: inline-block;\
                    vertical-align: middle;    ">' +
                    '<span class="f_field_title" id="name_form"></span>' +
                    '<span class="f_field_required">*</span>' +
                    '</div>' +
                    '<div class="f_field_ctrl clear"  style=" height: 100%;\
                    display: inline-block;\
                vertical-align: middle;margin-left: -6px;">' +
                    '<input type="text" class="inp name_biaodan" name="SORT_NAME" size="30" maxlength="100" value="" id="sort_name">' +
                    '</div>' +
                    '</div>' +
                    '<div class="f_field_block">' +
                    '<div class="f_field_label" style="display: inline-block;\
                    vertical-align: middle;">' +
                    '<span class="f_field_title">\
				<fmt:message code="workflow.th.sector" />\
				</span><span class="f_field_required">*</span>\
				</div>\
				<div class="f_field_ctrl clear" style=" height: 100%;\
                    display: inline-block;\
                vertical-align: middle;margin-left: -9px;">\
				<select class="select_duplicate_sort" name="DEPT_ID" id="dept_id">\
				<option><fmt:message code="workflow.th.allpart" />\
				</option>\
				</select>\
				</div>\
				</div>' +
					function () {
                        if ($(me).attr('data-numtrue') == 2) {
                            return '<div class="f_field_block">' +
                                '<div class="f_field_label" style="display: inline-block;\
                    vertical-align: middle;margin-left: -45px;\
                            margin-right: 40px;"><span class="f_field_title" style="    width: 152px;\
                            margin-top: 9px;"><fmt:message code="workflow.th.Doesclassification" /></span></div>' +
                                '<div class="f_field_ctrl clear" style=" height: 100%;\
                    display: inline-block;\
                vertical-align: middle;">' +
								'<input type="checkbox" lay-filter="liuchneng" name="yyyy" lay-skin="switch" lay-text="<fmt:message code="workflow.th.IsNot" />" checked>' +
								'</div>' +
                                '</div>' +
								'<div class="f_field_block" id="lX" style="display: none">' +
								'<div class="f_field_label"  style="display: inline-block;\
                    vertical-align: middle;"><span class="f_field_title"><fmt:message code="workflow.th.SysteFlowType" /></span><span class="f_field_required">*</span></div>' +
								'<div class="f_field_ctrl clear" style=" height: 100%;\
                    display: inline-block;\
                vertical-align: middle;">' +
								'<select name="leixing" id="liuchengleixing">' +
								'<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>' +
								'</select>' +
								'<select name="leixings" id="liuchengleixings" style="margin-left: 30px;">' +
								'<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>' +
								'</select>' +
								'</div>' +
								'</div>'
                        } else {
                            return ''
                        }
                    }() + '' +
                    '</div>' +
                    '</div></form>',

                    btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                    yes: function (index, layero) {

                        //按钮【按钮三】的回调
						/*alert($('.name_biaodan').val());*/
                        var url = "";
                        var data = {
                            sortNo: $('#sort_no').val(),
                            parentId: $('#sort_parent  option:checked').attr('value'),
                            departmentId: $('#dept_id  option:checked').attr('value')

                        };

                        if ($('.new_liucheng').attr('data-numtrue') == 1) {

                            url = 'formSave';
                            tabType = 0;
                            data["formName"] = $('#sort_name').val();
                        } else {
                            if($('#lX').css('display')!='none'){
                                if($('#liuchengleixing').val()==''||$('#liuchengleixings').val()==''){
                                    $.layerMsg({content:'<fmt:message code="workflow.th.flowEmpty" />！',icon:1});
                                    return;
                                }
                            }

                            tabType = 1;
                            url = 'flowSave';
                            data["sortMainType"]=$('[name="leixing"]').val()
                            data["sortDetailType"]=$('[name="leixings"]').val()
                            data["flowName"] = $('#sort_name').val();
                        }
                        if ($('.name_biaodan').val() == '') {
                            layer.msg('<fmt:message code="workflow.th.notnull" />');
                        } else {
							/* alert('0k');*/
							/*     alert($('#sort_parent  option:checked').attr('value'));*/
                            var layerIndex = layer.load(0, {shade: false});
                            $.ajax({
                                url: url,
                                type: 'post',
                                data: data,
                                dataType: 'json',
                                success: function (obj) {
									/*layer.closeAll();*/
                                    if (obj.flag == true) {
                                        alert(obj.msg);
                                        items();
                                        item();
                                    } else {
                                        alert(obj.msg);
                                    }
                                    layer.closeAll();
                                }
                            });

                        }
                    },
					success:function () {
                        form.render('checkbox')


						if($(me).attr('data-numtrue')==2){
                            $.get('/code/GetDropDownBox',{'CodeNos':'FLOWTYPE'},function (json) {
								var arr=json['FLOWTYPE'];
								var str='<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>';
								for(var i=0;i<arr.length;i++){
								    str+='<option   value="'+arr[i].codeNo+'">'+arr[i].codeName+'</option>'
								}
								$('#liuchengleixing').html(str)
                            },'json')
							
							$('[name=leixing]').change(function () {
							    var mes=this;

								if($(this).val()!=''){
									$.get('/code/GetDropDownBox',{'CodeNos':$(mes).val()},function (json) {
										var arrs=json[''+$(mes).val()+''];
										var str='<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>';
                                        for(var i=0;i<arrs.length;i++){
                                            str+='<option value="'+arrs[i].codeNo+'">'+arrs[i].codeName+'</option>'
                                        }
                                        $('#liuchengleixings').html(str)
                                    },'json')
								}
                            })
							
						}

                        form.on('switch(liuchneng)', function(data){
//                            console.log(data.elem.checked); //开关是否开启，true或者false
							if(!data.elem.checked){
							    $('#lX').show()
							}else {
                                $('#lX').hide()
							}

                        });
                    }

                });
                //父表单（表单）
                var opt_li = '<option value="0"  class="levelleft0"></option>';
                if ($(me).attr('data-numtrue') == 1) {
                    opt_li = Child(formdata, opt_li, 0, -1);
                } else {
                    opt_li = Child(flowdata, opt_li, 0, -1);
                }
                $('#sort_parent').html(opt_li);

                //判断是表单还是流程，确定标题
                if ($('.new_liucheng').attr('data-numtrue') == 1) {
                    $('#father_form').html('<fmt:message code="workflow.th.formfather" />');
                    $('#sort_form').html('<fmt:message code="workflow.th.tablexuhao" />');
                    $('#name_form').html('<fmt:message code="workflow.th.sortname" />');
                } else {
                    $('#father_form').html('<fmt:message code="workflow.th.processfather" />');
                    $('#sort_form').html('<fmt:message code="workflow.th.liuxuhao" />');
                    $('#name_form').html('<fmt:message code="workflow.th.liuname" />');

                }

                //部门共用

                var opt_li_dep = '<option value="0"  class="levelleft0"><fmt:message code="workflow.th.allpart" /></option>';

                opt_li_dep = departmentChild(departmentData, opt_li_dep, 0, -1);
                console.log(departmentData)
                $('#dept_id').html(opt_li_dep);

            });


        //编辑的接口
        function edit(){

            $.ajax({
                url:url,
                type:'get',
                data:data,
                dataType:'json',
                success:function(obj){

                    if(obj.flag==true){
                        items();
                        item();
						/*window.location.reload();*/
                    }else{
                        alert(obj.msg)
					}

                    console.log(obj)
                }
            });
        }
        edit();


        var url="";
        var data="";
        //编辑
        $('#j_tb').on('click','.edit_biaodan',function(){
            var id=$(this).attr('tid');
			/* alert(id);*/
            //获取序号
            var num=$(this).parent().siblings('.xuhao').find('a').text();
            //获取名称
            var form_name=$(this).parent().siblings('.mingcheng').find('a').text();
            //获取数量
            var form_num=$(this).parent().siblings('.biaodanshu').find('a').text();
            //获取部门
            var form_dept=$(this).parent().siblings('.bumen').find('a').text();
            //获取父表单

            var parent_id=$(this).attr('parent_id');


            layer.open({
                type: 1,
				/* skin: 'layui-layer-rim', //加上边框 */
                area: ['600px', '400px'], //宽高
                title:$(this).attr('name'),
                content:  '<div class="conter"><div class="f_title">' +
                '<div class="f_field_ctrl clear">' +
                '<span class="f_field_title" id="father_form"></span>' +
                '<span class="f_field_required">*</span>'+
				'<select name="SORT_PARENT" id="sort_parent"></select>' +
				'<span><fmt:message code="workflow.th.fristNull" /></span>\
				</div>'+
                '<div class="f_field_block">' +
				'<div class="f_field_label" style="display:inline-block;vertical-align: middle;height:100%">' +
				'<span class="f_field_title" id="sort_form"></span>' +
				'<span class="f_field_required">*</span>' +
				'</div>' +
				'<div class="f_field_ctrl clear" style="display:inline-block;vertical-align: middle;' +
				'height:100%;margin-left:-6px;">' +
				'<input type="text" name="SORT_NO" class="inp" ' +
				'value="'+num+'" id="sort_no">' +
				'</div>' +
				'</div>'+
                '<div class="f_field_block">' +
				'<div class="f_field_label" style="display:inline-block;vertical-align: middle;height:100%">' +
				'<span class="f_field_title" id="name_form"></span>' +
				'<span class="f_field_required">*</span>' +
				'</div>' +
				'<div class="f_field_ctrl clear" style="margin-left:-6px;display:inline-block;vertical-align: middle;height:100%">' +
				'<input type="text" class="inp" name="SORT_NAME"' +
				' size="30" maxlength="100" value="'+form_name+'" id="sort_name">' +
				'</div>' +
				'</div>'+
                '<div class="f_field_block">' +
				'<div class="f_field_label" style="display:inline-block;vertical-align: middle;height:100%">' +
				'<span class="f_field_title" ><fmt:message code="workflow.th.sector" /></span>\
				<span class="f_field_required" style="    margin-left: -3px;">*</span>\
				</div>\
				<div class="f_field_ctrl clear" style="margin-left:-9px;display:inline-block;vertical-align: middle;height:100%">\
				<select class="select_duplicate_sort" name="DEPT_ID" id="dept_id"></select>\
				</div>\
				</div>'+
                '</div>' +
				'</div>',
                btn:['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                yes: function(index, layero){
                    //按钮【按钮三】的回调

                    //表单编辑
                    url='formUpdate';
                    tabType=0;
                    data={
                        sortNo:$('#sort_no').val(),
                        parentId:$('#sort_parent  option:checked').attr('value'),
                        departmentId:$('#dept_id  option:checked').attr('value'),
                        formName:$('#sort_name').val(),
                        formId:id
                    }

                    if($('.name_biaodan').val()==''){
                        alert('<fmt:message code="workflow.th.notnull" />');
                    }else{

                        var layerIndex = layer.load(0, {shade: false});
                        edit();

                        layer.closeAll();
                    }
                }
            });

			/*$(".selector").find("option[value='+parent_id+']").attr("selected",true);*/


            var opt_li='<option value="0"  class="levelleft0 selector"></option>';
            opt_li=Child(formdata,opt_li,0,parent_id);
            $('#sort_parent').html(opt_li);

            //判断是表单还是流程，确定标题
            if($('.new_liucheng').attr('data-numtrue')==1){
                $('#father_form').html('<fmt:message code="workflow.th.formfather" />');
                $('#sort_form').html('<fmt:message code="workflow.th.tablexuhao" />');
                $('#name_form').html('<fmt:message code="workflow.th.sortname" />');
            }else{
                $('#father_form').html('<fmt:message code="workflow.th.processfather" />');
                $('#sort_form').html('<fmt:message code="workflow.th.liuxuhao" />');
                $('#name_form').html('<fmt:message code="workflow.th.liuname" />');

            }


            //部门

            var opt_li_dep='<option value="0"  class="levelleft0">'+form_dept+'</option>';

            opt_li_dep = departmentChild(departmentData,opt_li_dep,0,form_dept);
            console.log(departmentData)
            $('#dept_id').html(opt_li_dep);

        });//编辑结束

        var url="";
        var data="";
        //流程编辑
        $('#c_biaodan').on('click','.edit_liucheng',function() {
            var me=this;
            var id = $(this).attr('tid');
           /* alert(id);*/
            //获取序号
            var num = $(this).parent().siblings('.xuhao').find('a').text();
            //获取名称
            var form_name = $(this).parent().siblings('.mingcheng').find('a').text();
            //获取数量
            var form_num = $(this).parent().siblings('.biaodanshu').find('a').text();
            //获取部门
            var form_dept = $(this).parent().siblings('.bumen').find('a').text();
            //获取父表单

            var parent_id = $(this).attr('parent_id');
            var dataType=$(this).attr('data-type')
            var dataTypeOne=$(this).attr('data-typeOne')


            layer.open({
                type: 1,
				/* skin: 'layui-layer-rim', //加上边框 */
                area: ['600px', '400px'], //宽高
                title: $(this).attr('name'),
                content: '<form class="layui-form"><div class="conter">' +
				'<div class="f_title">' +

						'<div class="f_field_ctrl clear">' +
                '<span class="f_field_title" id="father_form">' +
                '</span><span class="f_field_required">*</span>' +
						'<select name="SORT_PARENT" id="sort_parent"></select>' +
						'<span><fmt:message code="workflow.th.fristNull" /></span>\
						</div>' +
                '<div class="f_field_block">' +
				'<div class="f_field_label" style="display:inline-block;vertical-align: middle;">' +
				'<span class="f_field_title" id="sort_form"></span>' +
				'<span class="f_field_required">*</span>' +
				'</div>' +
				'<div class="f_field_ctrl clear" style="margin-left:-6px;display:inline-block;vertical-align: middle;height:100%">' +
				'<input type="text" name="SORT_NO" class="inp" value="' + num + '" id="sort_no">' +
				'</div>' +
				'</div>' +
                '<div class="f_field_block">' +
				'<div class="f_field_label" style="display:inline-block;vertical-align: middle;height:100%">' +
				'<span class="f_field_title" id="name_form"></span>' +
				'<span class="f_field_required">*</span>' +
				'</div>' +
				'<div class="f_field_ctrl clear" style="margin-left:-6px;display:inline-block;vertical-align: middle;height:100%">' +
				'<input type="text" class="inp" name="SORT_NAME" size="30" maxlength="100" value="' + form_name + '" id="sort_name">' +
				'</div>' +
				'</div>' +
                '<div class="f_field_block">' +
				'<div class="f_field_label" style="display:inline-block;vertical-align: middle;height:100%">' +
				'<span class="f_field_title"><fmt:message code="workflow.th.sector" /></span>\
				<span class="f_field_required" style="margin-left:-2px">*</span>\
				</div>\
				<div class="f_field_ctrl clear" style="margin-left:-9px;display:inline-block;vertical-align: middle;height:100%">\
				<select class="select_duplicate_sort" name="DEPT_ID" id="dept_id"></select>\
				</div>\
				</div>' +
                ''+function () {
//                    if ($(me).attr('data-numtrue') == 2) {
                        return '<div class="f_field_block">' +
                            '<div class="f_field_label" style="    margin-left: -45px;\
                    margin-right: 40px;display:inline-block;vertical-align: middle;height:100%">' +
							'<span class="f_field_title" style="width: 154px;\
                    margin-top: 8px;\
                    "><fmt:message code="workflow.th.Doesclassification" /></span></div>' +
                            '<div class="f_field_ctrl clear" style="display:inline-block;vertical-align: middle;height:100%">' +
                            '<input type="checkbox" lay-filter="liuchneng" name="yyyy" lay-skin="switch" lay-text="<fmt:message code="workflow.th.IsNot" />" checked>' +
                            '</div>' +
                            '</div>' +
                            '<div class="f_field_block" id="lX" style="display: none">' +
                            '<div class="f_field_label" style="display:inline-block;vertical-align: middle;height:100%"><span class="f_field_title"><fmt:message code="workflow.th.SysteFlowType" /></span><span class="f_field_required">*</span></div>' +
                            '<div class="f_field_ctrl clear" style="display:inline-block;vertical-align: middle;height:100%">' +
                            '<select name="leixing" id="liuchengleixing">' +
                            '<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>' +
                            '</select>' +
                            '<select name="leixings" id="liuchengleixings" style="margin-left: 30px;">' +
                            '<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>' +
                            '</select>' +
                            '</div>' +
                            '</div>'
//                    } else {
//                        return ''
//                    }
                }()+'' +
				'</div></div></form>',
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                yes: function (index, layero) {
                    //按钮【按钮三】的回调
					if($('#lX').css('display')!='none'){
					    if($('#liuchengleixing').val()==''||$('#liuchengleixings').val()==''){
                            $.layerMsg({content:'<fmt:message code="workflow.th.flowEmpty" />！',icon:1});
					        return;
						}
					}

                    tabType=1;
                    url='flowUpdate';
                    data={
                        sortNo:$('#sort_no').val(),
                        parentId:$('#sort_parent  option:checked').attr('value'),
                        departmentId:$('#dept_id  option:checked').attr('value'),
                        flowName:$('#sort_name').val(),
                        sortMainType:$('[name="leixing"]').val(),
                        sortDetailType:$('[name="leixings"]').val(),
                        flowId:id
                    }


                    if($('.name_biaodan').val()==''){
                        alert('<fmt:message code="workflow.th.notnull" />');
                    }else{
                        var layerIndex = layer.load(0, {shade: false});
                        edit();
                        layer.closeAll();
                    }
                },
				success:function () {
                    form.render('checkbox')



                        $.get('/code/GetDropDownBox',{'CodeNos':'FLOWTYPE'},function (json) {
                            var arr=json['FLOWTYPE'];
                            var str='<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>';
                            for(var i=0;i<arr.length;i++){
                                str+='<option  value="'+arr[i].codeNo+'">'+arr[i].codeName+'</option>'
                            }
                            $('#liuchengleixing').html(str)
							if(dataType!=''){
                                $('[lay-skin="_switch"]').click();
                                $('#liuchengleixing').find('option').each(function (i,n) {
									if($(this).val()==dataType){
									    $(this).attr('selected','selected')
									}
                                })
                                $.get('/code/GetDropDownBox',{'CodeNos':dataType},function (json) {
                                    var arrs=json[''+dataType+''];
                                    var str='<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>';
                                    for(var i=0;i<arrs.length;i++){
                                        str+='<option value="'+arrs[i].codeNo+'">'+arrs[i].codeName+'</option>'
                                    }
                                    $('#liuchengleixings').html(str)
                                    $('#liuchengleixings').find('option').each(function (i,n) {
                                        if($(this).val()==dataTypeOne){
                                            $(this).attr('selected','selected')
                                        }
                                    })
                                },'json')

							}


                        },'json')

                        $('[name=leixing]').change(function () {
                            var mes=this;

                            if($(this).val()!=''){
                                $.get('/code/GetDropDownBox',{'CodeNos':$(mes).val()},function (json) {
                                    var arrs=json[''+$(mes).val()+''];
                                    var str='<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>';
                                    for(var i=0;i<arrs.length;i++){
                                        str+='<option value="'+arrs[i].codeNo+'">'+arrs[i].codeName+'</option>'
                                    }
                                    $('#liuchengleixings').html(str)
                                },'json')
                            }
                        })



                    form.on('switch(liuchneng)', function(data){
//                            console.log(data.elem.checked); //开关是否开启，true或者false
                        if(!data.elem.checked){
                            $('#lX').show()
                        }else {
                            $('#lX').hide()
                        }

                    });
                }
            })

            //父表单(流程)
            var opt_li='<option value="0"  class="levelleft0 selector"></option>';
            opt_li=Child(flowdata,opt_li,0,parent_id);
            $('#sort_parent').html(opt_li);
           /* $('.f_field_title').html('流程父分类');*/

            //判断是表单还是流程，确定标题
            if($('.sort_liucheng').find('h1').text()=='<fmt:message code="workflow.th.Newsort" />'){
                $('#father_form').html('<fmt:message code="workflow.th.formfather" />');
                $('#sort_form').html('<fmt:message code="workflow.th.tablexuhao" />');
                $('#name_form').html('<fmt:message code="workflow.th.sortname" />');
            }else{
                $('#father_form').html('<fmt:message code="workflow.th.processfather" />');
                $('#sort_form').html('<fmt:message code="workflow.th.liuxuhao" />');
                $('#name_form').html('<fmt:message code="workflow.th.liuname" />');

            }

            //部门

            var opt_li_dep='<option value="0"  class="levelleft0">'+form_dept+'</option>';

            opt_li_dep = departmentChild(departmentData,opt_li_dep,0,form_dept);
            console.log(departmentData)
            $('#dept_id').html(opt_li_dep);
        })


        var departmentData =new Array();
        //部门接口
        function departmentAjax(){
            $.ajax({
                url:'/department/getAlldept',
                type:'get',
                dataType:'json',
                success:function(obj){

                    var data=obj.obj;
                    console.log(data);
                    departmentData= digui(data,0);
                    console.log(departmentData);
                }
            });
        }
        departmentAjax();
        function digui(datas,departId) {
            var data=new Array();
            for(var i=0;i<datas.length;i++){
                if(datas[i].deptParent==departId){
                    datas[i]["childs"]=digui(datas,datas[i].deptId);
                    data.push(datas[i]);
                }
            }
            return data;
        }

        //表单分类递归
        function queryChild(datas,str_li,level){
            for(var i=0;i<datas.length;i++){
                var className="levelleft"+level;
                if(datas[i].sortName=='<fmt:message code="sys.th.Undefined" />'){

                    str_li+='<tr ><td><div class="img"></div><a  notifyId="" class="sort windowOpen '+className+'">'+datas[i].sortNo+'</a></td>'+
                        '<td><a notifyId="" class="windowOpen '+className+'">'+datas[i].sortName+'</a></td>'+
                        '<td><a notifyId="" class="windowOpen ">'+datas[i].formcounts+'</a></td>'+
                        '<td><a notifyId="" class="windowOpen ">'+datas[i].departName+'</a></td>'+
                        '<td class="tds"></td></tr>'
                }else{
                    str_li+='<tr class="trs" ><td class="xuhao"><div class="img "></div><a  notifyId="" class="sort windowOpen '+className+'">'+datas[i].sortNo+'</a></td>'+
                        '<td class="mingcheng"><a notifyId="" class="biao_name windowOpen '+className+'">'+datas[i].sortName+'</a></td>'+
                        '<td class="biaodanshu"><a notifyId="" class="windowOpen ">'+datas[i].formcounts+'</a></td>'+
                        '<td class="bumen"><a notifyId="" class="windowOpen ">'+datas[i].departName+'</a></td>'+
                        '<td class="tds"><a notifyId="" class="edit_biaodan" tid="'+datas[i].sortId+'" parent_id="'+datas[i].sortParent+'" name="<fmt:message code="workflow.th.EditformCategories" />"><fmt:message code="global.lang.edit" /></a><span class="spanlow"></span><a notifyId="" class="delete_biaodan" tid="'+datas[i].sortId+'" parent_id="'+datas[i].sortParent+'" name="<fmt:message code="workflow.th.Formdeletion" />"><fmt:message code="global.lang.delete" /></a></td></tr>'
                }
				/* console.log(datas[i].childs); */
                if(datas[i].childs!=null){
                    str_li = queryChild(datas[i].childs,str_li,level+1);

                }
            }
            return str_li;
        }//表单递归结束

        //流程分类递归
        function queryChild_flow(datas,str_li,level){
            console.log(datas)
            for(var i=0;i<datas.length;i++){

                var className="levelleft"+level;
                if(datas[i].sortName=='<fmt:message code="sys.th.Undefined" />'){
                    str_li+='<tr ><td ><a  notifyId="" class="windowOpen '+className+'">'+datas[i].sortNo+'</a></td>'+
                        '<td><a notifyId="" class="windowOpen '+className+'">'+datas[i].sortName+'</a></td>'+
                        '<td><a notifyId="" class="windowOpen ">'+datas[i].flowcounts+'</a></td>'+
                        '<td><a notifyId="" class="windowOpen ">'+datas[i].departName+'</a></td>'+
                        '<td></td></tr>'
                }else{
                    str_li+='<tr class="trs"><td class="xuhao" ><a  notifyId="" class="windowOpen '+className+'">'+datas[i].sortNo+'</a></td>'+
                        '<td style="" class="mingcheng"><a notifyId="" class="windowOpen '+className+'">'+datas[i].sortName+'</a></td>'+
                        '<td class="biaodanshu"><a notifyId="" class="windowOpen ">'+datas[i].flowcounts+'</a></td>'+
                        '<td class="bumen"><a notifyId="" class="windowOpen ">'+datas[i].departName+'</a></td>'+
                        '<td class="tds"><a notifyId="" class="edit_liucheng" tid="'+datas[i].sortId+'" parent_id="'+datas[i].sortParent+'" ' +
						'data-type="'+datas[i].sortMainType+'" data-typeone="'+datas[i].sortDetailType+'" name="<fmt:message code="workflow.th.EditProcessClassification" />"><fmt:message code="global.lang.edit" /></a><span class="spanlow"></span><a notifyId="" class="delete_flow" tid="'+datas[i].sortId+'" parent_id="'+datas[i].sortParent+'" name="流程删除"><fmt:message code="global.lang.delete" /></a></td></tr>'
                }

				/*   console.log(datas[i].childs); */
                if(datas[i].childs!=null){
                    str_li = queryChild_flow(datas[i].childs,str_li,level+1);
                }
            }
            return str_li;
        }


        //部门遍历方法
        function departmentChild(datas,opt_li,level,dept){
            for(var i=0;i<datas.length;i++){
                var String="";
                var space=""
                for(var j=0;j<level;j++){
                    space+="├&nbsp;&nbsp;&nbsp;";
                }
				/* console.log("kongge"+space+"kongge")*/
                if(i==0){
                    String=space+"┌";
                }else
                if(i!=0){
                    String=space+"├";
                }else
                if(i==datas.length-1){
                    String=space+"└";
                }
                if(dept==datas[i].deptId){
                    opt_li+='<option value="'+datas[i].deptId+'" selected="selected">'+String+datas[i].deptName+'</option>';
                }else{
                    opt_li+='<option value="'+datas[i].deptId+'">'+String+datas[i].deptName+'</option>';
                }
				/* 	console.log(datas[i].childs);*/
                if(datas[i].childs!=null){
                    opt_li = departmentChild(datas[i].childs,opt_li,level+1,dept);
                }
            }
            return opt_li;
        }
        //父表单递归方法（表单）

        function Child(datas,opt_li,level,parentId){

            for(var i=0;i<datas.length;i++){
                if(level==0&&i==0) continue;
                var String="";
                var space=""
                for(var j=0;j<level;j++){
                    space+="├&nbsp;&nbsp;&nbsp;";
                }
				/* console.log("kongge"+space+"kongge")*/
                if(i==0){
                    String=space+"┌";
                }
                if(i!=0){
                    String=space+"├";
                }
                if(i==datas.length-1){
                    String=space+"└";
                }
                if(parentId==datas[i].sortId){
                    opt_li+='<option value="'+datas[i].sortId+'" selected="selected">'+String+datas[i].sortName+'</option>';
                }else{
                    opt_li+='<option value="'+datas[i].sortId+'">'+String+datas[i].sortName+'</option>';
                }

				/* console.log(datas[i].childs); */
                if(datas[i].childs!=null){
                    opt_li = Child(datas[i].childs,opt_li,level+1,parentId);
                }
            }

            return opt_li;
        }

        var formdata={};
        //表单分类接口
        function item(){
            $.ajax({
                url:'form',
                type:'get',
                dataType:'json',
                success:function(obj){
                    if(obj.flag){
                        var data=obj.datas;
						/* console.log(data); */
                        var str_li='';
                        str_li=queryChild(data,str_li,0);
                        formdata={};
                        formdata=data;
                        $('#j_tb').html("");
                        $('#j_tb').html(str_li);
                    }
                }
            });
        }

        item();



        var flowdata={};
        //流程分类接口
        function items(){
            $.ajax({
                url:'flow',
                type:'get',
                dataType:'json',
                success:function(obj){
                    if(obj.flag){
                        var data=obj.datas;
						/* console.log(data); */
                        var str_li='';
                        str_li=queryChild_flow(data,str_li,0);
                        flowdata={};
                        flowdata=data;
                        $('#c_biaodan').html("");
                        $('#c_biaodan').html(str_li);
                    }
                }
            });
        }

        items();

        //删除接口

        function form_delete(){
            $.ajax({
                url:url,
                type:'get',
                data:data,
                dataType:'json',
                success:function(obj){
                    console.log(obj);
                    if(obj.flag==false){
                        var msg=obj.msg
                        $.layerMsg({content:msg,icon:2},function () {
							layer.closeAll()
                        });

                    }else{
                        $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />',icon:1});
                        items();
                        item();
						/*window.location.reload();*/
                    }

                }
            });
        }

		/*form_delete();*/

        var url="";
        var data={};

        //表单删除
        $('#tr_td').on('click','.delete_biaodan',function(){
            var me=this;
            $.layerConfirm({title:'<fmt:message code="workflow.th.suredel" />',content:'<fmt:message code="workflow.th.que" />',icon:0},function(){
                var tid=$(me).attr('tid');
				/* alert(tid);*/


                url='formDelete';
                data={
                    formId:tid
                }

                form_delete();

            })





        })
		/*	流程删除*/

        $('#c_biaodan').on('click','.delete_flow',function(){
            <%--alert('<fmt:message code="workflow.th.suredel" />');--%>
			var me=this;
            layer.open({
				content:'<fmt:message code="lang.th.delete" />',
				btn:['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'],
				yes:function (index) {
                    var tid=$(me).attr('tid');
					/* alert(tid);*/


                    url='flowDelete';
                    data={
                        flowId:tid
                    }

                    form_delete();
                }
			})





        })






    });

</script>
</body>



</html>
