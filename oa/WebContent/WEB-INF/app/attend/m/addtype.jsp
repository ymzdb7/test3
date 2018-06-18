<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>编辑签到类型</title>
		<link href="css/mui.min.css" rel="stylesheet"/>
		<link rel="stylesheet" href="css/mui.picker.min.css" />
		<link rel="stylesheet" href="css/mui.poppicker.css" />
		<link href="css/mian.css" rel="stylesheet"/>
		<link href="css/apptype.css" rel="stylesheet" />
		<script type="text/javascript" src="js/1.10.2.jquery.min.js" ></script>
		<script src="js/mui.min.js"></script>
		<script type="text/javascript" src="js/mui.picker.min.js" ></script>
		<script type="text/javascript" src="js/mui.poppicker.js" ></script>
		<script type="text/javascript" src="js/simbaJs.js" ></script>
		<script src="js/zepto_1.1.3.js"></script>
		<script src="js/vue.min.js"></script>
		<script type="text/javascript" src="js/jquery.form.min.js" ></script>
	</head>
	<body id="addtype">
		<header id="header" class="mui-bar mui-bar-nav">
			<a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left" style="color: #999;"></a>
			<h1 class="mui-title">编辑签到类型</h1>
			<a class="mui-btn  mui-btn-link mui-pull-right" id="add_type" @click="clk_save">保存</a>
		</header>
		<div class="mui-content">
			<form class="mui-input-group" id="attendform" action="http://app.oaoa.pro/app/attend/p/m_data.php?flag=2" method="post" enctype="multipart/form-data">
				<input name="sid" id="sidnum" value="" type="hidden" />
				<div class="mui-input-row box1">
					<label style="line-height: 32px;width: 60px;">类型名称</label>
					<input type="text" name="title" id="title" value="" placeholder="默认类型" class="mui-input-clear" placeholder="请输入用户名">
				</div>
				<div class="mui-input-row box2">
					<span class="mui-table-view-cell attend_state">第1次签到</span>
					<span class="mui-pull-left switch_on">
						<label>是否开启：</label>
						<div class="mui-switch mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input name="swi_1" value="0" type="hidden" />
					</span>
					<span class="mui-pull-right work_type">
						<label>类型：</label>
						<div class="mui-segmented-control segmentedControl">
							<a class="mui-control-item a_box1 mui-active" href="#item1">上班</a>
							<a class="mui-control-item  a_box2" href="#item2">下班</a>
							<input name="commute_1" value="1" type="hidden" />
						</div>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left ">开始时间:</label>
					<input type="input" name="atime1" id="atime1" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
				</div>
				<div class="mui-input-row box3">
					<span class="mui-table-view-cell attend_state">第2次签到</span>
					<span class="mui-pull-left switch_on">
						<label>是否开启：</label>
						<div class="mui-switch mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input name="swi_2" value="0" type="hidden" />
					</span>
					<span class="mui-pull-right work_type">
						<label>类型：</label>
						<div class="mui-segmented-control segmentedControl">
							<a class="mui-control-item a_box1 mui-active" href="#item1">上班</a>
							<a class="mui-control-item a_box2" href="#item2">下班</a>
							<input name="commute_2" value="1" type="hidden" />
						</div>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left ">开始时间:</label>
					<input type="input" name="atime2" id="atime2" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
				</div>
				<div class="mui-input-row box4">
					<span class="mui-table-view-cell attend_state">第3次签到</span>
					<span class="mui-pull-left switch_on">
						<label>是否开启：</label>
						<div class="mui-switch mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input name="swi_3" value="0" type="hidden" />
					</span>
					<span class="mui-pull-right work_type">
						<label>类型：</label>
						<div class="mui-segmented-control segmentedControl">
							<a class="mui-control-item a_box1 mui-active" href="#item1">上班</a>
							<a class="mui-control-item a_box2" href="#item2">下班</a>
							<input name="commute_3" value="1" type="hidden" />
						</div>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left ">开始时间:</label>
					<input type="input" name="atime3" id="atime3" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
				</div>
				<div class="mui-input-row box5">
					<span class="mui-table-view-cell attend_state">第4次签到</span>
					<span class="mui-pull-left switch_on">
						<label>是否开启：</label>
						<div class="mui-switch mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input name="swi_4" value="0" type="hidden" />
					</span>
					<span class="mui-pull-right work_type">
						<label>类型：</label>
						<div class="mui-segmented-control segmentedControl">
							<a class="mui-control-item a_box1 mui-active" href="#item1">上班</a>
							<a class="mui-control-item a_box2" href="#item2">下班</a>
							<input name="commute_4" value="1" type="hidden" />
						</div>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left ">开始时间:</label>
					<input type="input" name="atime4" id="atime4" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
				</div>
				<div class="mui-input-row box6">
					<span class="mui-table-view-cell attend_state">第5次签到</span>
					<span class="mui-pull-left switch_on">
						<label>是否开启：</label>
						<div class="mui-switch mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input name="swi_5" value="0" type="hidden" />
					</span>
					<span class="mui-pull-right work_type">
						<label>类型：</label>
						<div class="mui-segmented-control segmentedControl">
							<a class="mui-control-item a_box1 mui-active" href="#item1">上班</a>
							<a class="mui-control-item a_box2" href="#item2">下班</a>
							<input name="commute_5" value="1" type="hidden" />
						</div>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left ">开始时间:</label>
					<input type="input" name="atime5" id="atime5" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
				</div>
				<div class="mui-input-row box7">
					<span class="mui-table-view-cell attend_state">第6次签到</span>
					<span class="mui-pull-left switch_on">
						<label>是否开启：</label>
						<div class="mui-switch mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input name="swi_6" value="0" type="hidden" />
					</span>
					<span class="mui-pull-right work_type">
						<label>类型：</label>
						<div class="mui-segmented-control segmentedControl">
							<a class="mui-control-item a_box1 mui-active" href="#item1">上班</a>
							<a class="mui-control-item a_box2" href="#item2">下班</a>
							<input name="commute_6" value="1" type="hidden" />
						</div>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left ">开始时间:</label>
					<input type="input" name="atime6" id="atime6" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
				</div>
				<div class="mui-input-row box8">
					<span class="mui-table-view-cell attend_state">上下班签到设置</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left workset">允许上班提前签到时间:</label>
					<input type="input" name="worktime_f" id="worktime_f" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left workset">允许上班延后签到时间:</label>
					<input type="input" name="worktime_b" id="worktime_b" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left workset">允许下班提前签到时间:</label>
					<input type="input" name="workafter_f" id="workafter_f" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right mui-input-clear time_picker"/>
					</span>
					<span class="choose_time">
						<label for="begintime" class="mui-pull-left workset">允许下班延后签到时间:</label>
					<input type="input" name="workafter_b" id="workafter_b" value="" data-options='{"type":"time"}'  class="btn mui-btn mui-btn-block mui-pull-right time_picker"/>
					</span>
					<span class="mui-pull-left switch_on" style="width: 100%;">
						<label style="float: left;width: 50px;">位置：</label>
						<div class="mui-switch location_tab mui-switch-blue mui-switch-mini " style="float: left;margin: 0;">
  							<div class="mui-switch-handle"></div>
						</div>
						<input type="hidden" name="location_on" id="location_on" value="0"/>
						<input type="text" value="" name="location" id="location" placeholder="请选择位置" @click="open_map"  />
					</span>
					<span class="mui-pull-left switch_on" style="width: 100%;margin-top: 6px;">
						<label style="float: left;width: 50px;">范围：</label>
						<input style="width: calc(100% - 150px);float: left;" id='range' name="range" class="mui-btn mui-btn-block" type='input' placeholder="请选择范围"/><span>米</span>
				</div>
				<div class="mui-input-row box9">
					<span class="mui-table-view-cell attend_state">WIFI签到设置</span>
					<span class="mui-pull-left switch_on" style="width: 100%;">
						<label>是否开启：</label>
						<div class="mui-switch wifi_tab mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input type="hidden" name="wifi_on" id="wifi_on" value="0" />
					</span>
					<p style="width: 100%;margin-top: 4px;float: left;">启用Wi-Fi签到后，则不会限制考勤地点和范围</p>
					<!--<div class="mui-table-view-cell">
						<label class="mui-scalable">考勤WI-FI：</label>
						<input type="text" name="wifi_name"  id="wifi_name" value="" placeholder="请点击选择wifi"/>
					</div>
					<div class="mui-table">
						<div class="mui-table-view-cell">
							<label>gsb2-5g</label><input type="checkbox" value="" name=""/>
							
						</div>
						<div class="mui-table-view-cell">
							<label>gsb2-5g</label><input type="checkbox" value="" name=""/>
							
						</div>
						<div class="mui-table-view-cell">
							<label>gsb2-5g</label><input type="checkbox" value="" name=""/>
							
						</div>
					</div>-->
					
				</div>
				<div class="mui-input-row box10">
					<span class="mui-table-view-cell attend_state">外勤签到设置</span>
					<span class="mui-pull-left switch_on" style="width: 100%;margin-bottom: 6px;">
						<label>是否开启外勤：</label>
						<div class="mui-switch isout_tab mui-switch-blue mui-switch-mini">
  							<div class="mui-switch-handle"></div>
						</div>
						<input type="hidden" name="is_out" id="is_out" value="0" />
					</span>
				</div>
				<div class="mui-input-row box11">
					<span class="mui-table-view-cell attend_state">考勤日期设置</span>
					<div class="mui-table-view-cell">
						<label class="mui-scalable">考勤日期：</label>
						<input type="text" name="datetime"  id="datetime" readonly="readonly" @click="clk_day" value="" placeholder="请点击选择考勤时间"/>
					</div>
					<div class="mui-table" id="weekdate_out" style="display: none;">
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期一</label><input type="checkbox" value="1" name="week"/>
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期二</label><input type="checkbox" value="2" name="week"/>	
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期三</label><input type="checkbox" value="3" name="week"/>	
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期四</label><input type="checkbox" value="4" name="week"/>
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期五</label><input type="checkbox" value="5" name="week"/>	
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期六</label><input type="checkbox" value="6" name="week"/>	
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<label>星期日</label><input type="checkbox" value="7" name="week"/>	
						</div>
						<div class="mui-table-view-cell mui-checkbox">
							<center><span class="mui-btn mui-btn-success"  id="week_smt" @click="clk_week" style="float: none;width: 66px;height: 24px;padding: 4px 0;" >确定</span></center>
						</div>
					</div>
				</div>
				<button style="display: none;" type="submit" id="onSubmit">提交</button>
			</form>
			<button class="mui-btn mui-btn-blue" id="form_smt" style="display: none;">提交</button>
		</div>	
		
	</body>
	<script>
		function plusReady(){
			//调用plus  api
		}
		if(window.plus){
	 		plusReady();
	 	}else{
	 		document.addEventListener('plusready',plusReady,false);
	 	}
	 	window.addEventListener('newsId',function(event){
			// mtype=event.detail.mtype;
			var  sid=event.detail.sid;
//			alert("1");
			// mui.alert(sid);
			// uid=event.detail.uid;
			//get_mail(mtype,mid,uid);
		});
		(function($) {
			$.init();
			/**选择考勤wifi**/
		//	$("#datetime").blur(function(){
			//	mui.alert("1");
		//	});
			/***编辑签到类型所有时间***/
			var btns = $('.time_picker');
			btns.each(function(i, btn) {
				btn.addEventListener('tap', function() {
					var optionsJson = this.getAttribute('data-options') || '{}';
					var options = JSON.parse(optionsJson);
					var id = this.getAttribute('id');
					var picker = new $.DtPicker(options);
					picker.show(function(rs) {
					document.getElementById(id).value=rs.value;
						picker.dispose();
					});
				}, false);
			});
			/***选择距离范围***/
				var userPicker = new $.PopPicker();
				userPicker.setData([
					{value: 10,text: '10m'}, 
					{value: 20,text: '20m'}, 
					{value: 30,text: '30m'},
					{value: 40,text: '40m'},
					{value: 50,text: '50m'},
					{value: 60,text: '60m'},
					{value: 70,text: '70m'},
					{value: 80,text: '80m'},
					{value: 90,text: '90m'},
					{value: 100,text: '100m'},
					{value: 200,text: '200m'},
					{value: 300,text: '300m'},
					{value: 400,text: '400m'},
					{value: 500,text: '500m'},
					{value: 600,text: '600m'},
					{value: 700,text: '700m'},
					{value: 800,text: '800m'},
					{value: 900,text: '900m'},
					{value: 1000,text: '1000m'}
				]);
				var showUserPickerButton = document.getElementById('range');
				showUserPickerButton.addEventListener('tap', function() {
					userPicker.show(function(items) {
						console.log(JSON.stringify(items));
						showUserPickerButton.value = JSON.stringify(items[0].value);					
					});
				}, false);
		
				/***控制开关是否开启***/
				var switch_btn=$(".mui-switch");
				 switch_btn.each(function(i, btn) {		 				
				 	btn.addEventListener("toggle",function(event){
				 		if(event.detail.isActive){
				   			event.target.nextElementSibling.value = '1';
				  		}else{
				    		event.target.nextElementSibling.value = '0';
				  		}
					});
				})		  		
			var vm=new Vue({
				el:'#addtype',
				data:{
					name:'Vue.js'
				},
				methods:{
					clk_day:function(evenet){
						document.getElementById("weekdate_out").style.display="block";//显示	
					},
					/***考勤日期设置***/
					clk_week:function(event){
						var obj=document.getElementsByName('week');
					var s=''; 
					for(var i=0; i<obj.length; i++){ 
					if(obj[i].checked) s+=obj[i].value+','; //如果选中，将value添加到变量s中 
					} 
					if(s==''){
						 mui.alert('您还没有选择考勤日期！')
					}else{
						document.getElementById("datetime").value=s;
					document.getElementById("weekdate_out").style.display="none";//隐藏
					}
					
					},
					/***表单提交***/
					clk_save:function(event){
						/***控制上班下班***/
				 		$(".segmentedControl a").each(function(){
				 			if(jQuery(this).hasClass('mui-active')){
									if(this.innerText == '上班'){
										jQuery(this).siblings('input').val(1);
									}else{
										jQuery(this).siblings('input').val(2);
									}
								}	 			
				 		});
//				 		switch_btn.each(function(i, btn) {		 				
//						 	btn.addEventListener("toggle",function(event){
//						 		if(event.detail.isActive){
//						   			event.target.nextElementSibling.value = '1';
//						  		}else{
//						    		event.target.nextElementSibling.value = '0';
//						  		}
//							});
//						})		 
//				
						if(jQuery("#title").val() == ''){
							mui.toast('类型名称不能为空！');
						}else{
								var options = { 
								target:'#form_smt',
								/*data:{
									flag:2
							},*/	
								//enctype: 'multipart/form-data',
								dataType:'json',
								//type:'POST',						
								//url:'http://app.oaoa.pro/app/attend/p/m_data.php',
								success:function(){
									console.log("1");
								}
							}; 
							 jQuery("#attendform").ajaxSubmit(function () {
				                  alert("提交成功");
				              });
				              return false;
						}
						
					},
					open_map:function(){
						mui.openWindow({
							url:'location.html'
						})
					}
				}			
			});
		})(mui);
		jQuery(function(){
			function GetQueryString(name) {
				var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
				var r = window.location.search.substr(1).match(reg);
				if (r != null) return unescape(r[2]); return null;
			}
			sid = GetQueryString("sid"); //括号里放地址栏传参变量
			if(sid != null){
				$("#sidnum").val(sid);
				var data = {
							"flag":4, //查看路径
							"sid":sid
						};
						console.log(data);
				mui.ajax('http://app.oaoa.pro/app/attend/p/m_data.php',{
							data:data,
							dataType:'json',//服务器返回json格式数据
							type:'get',//HTTP请求类型
							beforeSend: function() {
							      mui.plusReady(function() {
							             plus.nativeUI.showWaiting('正在加载');
							      })      
					        },
					        complete: function() {
						         mui.plusReady(function() {
						             plus.nativeUI.closeWaiting(); 
						            });
					        },
							success:function(data){
								$("#title").val(data.title);
								if(data.swi_1==1){
									$(".box2 .mui-switch").addClass("mui-active");
									jQuery(".box2 .switch_on input").val(1);
								}
								if(data.commute_1==2){
									jQuery(".box2 .a_box2").addClass("mui-active");
									jQuery(".box2 .a_box1").removeClass("mui-active")
								}
								$("#atime1").val(data.atime1);
								if(data.swi_2==1){
									$(".box3 .mui-switch").addClass("mui-active");
									jQuery(".box3 .switch_on input").val(1);
									
								}
								if(data.commute_2==2){
									jQuery(".box3 .a_box2").addClass("mui-active");
									jQuery(".box3 .a_box1").removeClass("mui-active")
								}
								$("#atime2").val(data.atime2);
								if(data.swi_3==1){
									$(".box4 .mui-switch").addClass("mui-active");
									jQuery(".box4 .switch_on input").val(1);
								}
								if(data.commute_3==2){
									jQuery(".box4 .a_box2").addClass("mui-active");
									jQuery(".box4 .a_box1").removeClass("mui-active")
								}
								$("#atime3").val(data.atime3);
								if(data.swi_4==1){
									$(".box5 .mui-switch").addClass("mui-active");
									jQuery(".box5 .switch_on input").val(1);
								}
								if(data.commute_4==2){
									jQuery(".box5 .a_box2").addClass("mui-active");
									jQuery(".box5 .a_box1").removeClass("mui-active")
								}
								$("#atime4").val(data.atime4);
								if(data.swi_5==1){
									$(".box6 .mui-switch").addClass("mui-active")
									jQuery(".box6 .switch_on input").val(1);
								}
								if(data.commute_5==2){
									jQuery(".box6 .a_box2").addClass("mui-active");
									jQuery(".box6 .a_box1").removeClass("mui-active")
								}
								$("#atime5").val(data.atime5);
								if(data.swi_6==1){
									$(".box7 .mui-switch").addClass("mui-active");
									jQuery(".box7 .switch_on input").val(1);
								}
								if(data.commute_6==2){
									jQuery(".box7 .a_box2").addClass("mui-active");
									jQuery(".box7 .a_box1").removeClass("mui-active")
								}
								$("#atime6").val(data.atime6);
								$("#worktime_f").val(data.worktime_f);
								$("#worktime_b").val(data.worktime_b);
								$("#workafter_f").val(data.workafter_f);
								$("#workafter_b").val(data.workafter_b);
								//位置
								if(data.location_on==1){
									$(".location_tab").addClass("mui-active");
									$("#location_on").val(1)
								}
								$("#location").val(data.location);
								$("#range").val(data.range);
								if(data.wifi_on==1){
									$(".wifi_tab").addClass("mui-active");
									$("#wifi_on").val(1)
								}
								if(data.is_out==1){
									$(".isout_tab").addClass("mui-active");
									$("#is_out").val(1)
								}
								$("#datetime").val(data.datetime);
							},
							error:function(xhr,type,errorThrown){
								//异常处理；
								console.log(type);
							}
					});
				
			}
			
		})
	</script>
</html>