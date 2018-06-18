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
		<title>手机考勤</title>
		<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="../js/diary/m/mui.min.js"></script>
		<script type="text/javascript" src="../js/diary/m/vue.min.js"></script>
		<script type="text/javascript" src="../js/diary/m/simbaJs.js" ></script>
		<script src="../js/diary/m/zepto_1.1.3.js"></script>
		<link href="../css/diary/m/mui.css" rel="stylesheet">
		<link href="../css/attend/m/mian.css" rel="stylesheet"/>
		<style>	
			.mui-content{
				height: calc(100% - 44px);
				background: #fff;
			}
			.buttonStyletest{
				color: #fff;	
			}
			.buttonStyle{
				margin-top:3%;
				width:90%;
				margin-left:5%;
				background-image: url('img/sign in-icon-statistics.png');
				background-position:37% 35%;
				background-repeat:no-repeat;				
				height:50px;				
				background-size:24px 24px;
			}
			.dateShow{
				color:#333333;
				font-size:1.5rem;
				margin-bottom:2%;
			}
			.qdlx{
				font-size:1rem;
				color:#999999
			}
			.currentTime{
				text-align: center;
				margin-top: 3%;
				margin-bottom: 3%;
			}
			.qdzt{
				font-size:1rem;
				display: inline-block;
				padding-top: 2px;
			}
			.mui-btn-danger{
				color: #fff;
				border: 1px solid #dd524d;
				background-color: #dd524d;
				width: 52px;
				height: 27px;
				line-height: 15px;
			}
			.mui-bar{
				background-color: #ffffff !important;
			}
			.mui-bar .mui-btn-link{
				color:#000000 !important;
			}
			.mui-title{
				color:#000000 !important;
				font-size:17px;
			}
			input.mui-btn-danger {
				color: #fff;
				border: 1px solid #dd524d;
				background-color: #dd524d;
				width: 52px;
				height: 27px;
				line-height: 15px;
			}
			input.mui-btn-primary{
				color: #fff;
				border: 1px solid #007aff;
				background-color: #007aff;
			}
		</style>
	</head>
	<body id="app">
		<header id="header" class="mui-bar mui-bar-nav">
			<a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left" style="color: #999;"></a>
			<h1 class="mui-title">手机签到</h1>
			<a class="mui-btn  mui-btn-link mui-pull-right" id="setlist" @click="clk_setlist" style="display: none;">设置</a>
		</header>
		<div class="mui-content">
			<div style="width:100%;height:35%;border:#ccc solid 1px;" id="map">map loading...</div>
			<div class="currentTime" id="">
				<div id="dateShow" class="dateShow"></div>
				<div class="qdlx" id="att_title">您的签到类型: 默认类型</div>
				<div class="mui-text-center qdlx" id="address"></div>
			</div>
			<div>		
				<ul class="mui-table-view" id="qd">				
				</ul>
				<button type="button" class="mui-btn mui-btn-primary  buttonStyle buttonStyletest" @click="clk_kqtj_index" id="kqtj1">考勤统计</button>
				<button type="button" class="mui-btn mui-btn-primary  buttonStyle buttonStyletest" @click="clk_windex" id="wqqd"style="display: none;">外勤签到</button>
			</div>
		</div>
	</body>
	<script>
		var ws=null,wo=null;
		var em=null,map=null,pcenter=null;
		var wait=null;var closewin=null;
		var worktime_b,worktime_f,workafter_b,workafter_f,wifi_sw,range,location_sw,location_str;
		// H5 plus事件处理
		function plusReady(){
			if(!em||ws){return};
			// 获取窗口对象,初始化地图
			map=new plus.maps.Map("map");
			ws=plus.webview.currentWebview();
			plus.geolocation.getCurrentPosition(function(p){
				pcenter = new plus.maps.Point(p.coords.longitude, p.coords.latitude);
				map.centerAndZoom(pcenter, 16);
				// 显示页面并关闭等待框
				ws.show("pop-in");
			}, function(e){
				alert('Geolocation error: ' + e.message);
			},{geocode:true,provider:'amap'});		
			wait=plus.nativeUI.showWaiting('正在加载'); 
			closewin= plus.nativeUI.closeWaiting();  
		}
		if(window.plus){
			plusReady();
		}else{
			document.addEventListener("plusready",plusReady,false);
		}
		// DOMContentloaded事件处理
		document.addEventListener("DOMContentLoaded",function(){
			em=document.getElementById("map");
			window.plus&&plusReady();
		},false);		
		(function ($,doc){
			mui.init();
			$.back=function(){
				plus.SimbaPlugin.quitApp();
			}
			function p(s) {
				return s < 10 ? '0' + s: s;
			}
			var date=new Date();
			var d=date.getDate();
			var y=date.getFullYear();
			var m=date.getMonth()+1;
			var Week = ["日","一","二","三","四","五","六"];
			var w = new Date().getDay();
			
			var str=y+'年'+p(m)+'月'+p(d)+'日&nbsp;&nbsp;&nbsp;星期'+Week[w];
			document.getElementById('dateShow').innerHTML=str;
			/***获取设置好的签到类型***/
			mui.ajax("http://app.oaoa.pro/app/attend/p/m_data.php",{
				data:{
					flag:11
				},
				async:false,
				dataType:'json',//服务器返回json格式数据
				type:'post',//HTTP请求类型        
				beforeSend: function() {
					wait;
				},
				complete: function() { 
					closewin;
				},
				success:function(data){
					/***签到类型名称***/
					jQuery("#att_title").html('您的签到类型：'+data.title);
					/***外勤签到是否开启***/
					(data.is_out == '1')?jQuery("#wqqd").css("display","inline-block"):jQuery("#wqqd").css("display","none");
					/***是否有设置权限***/
					(data.pid == '1')?jQuery("#setlist").css("display","inline-block"):jQuery("#wqqd").css("display","none");
					/***提前延后签到时间***/
					worktime_b=data.worktime_b;//上班可延后
					worktime_f=data.worktime_f;//上班可提前
					workafter_b=data.workafter_b;//下班可延后
					workafter_f=data.workafter_f;//下班可提前
					/**签到地点范围设置**/
					location_sw=data.location_on;
					range=Number(data.range);
					/***签到地点***/
					location_str=data.location.split(",");
					jQuery("#address").html('签到位置：'+location_str[location_str.length-1]);
					/***签到wifi开关***/
					wifi_sw=data.wifi_on;					
					/***签到按钮***/
					var work_type='';var work_img='';
					var att_btn='';
					for(var w=0;w<data.switch.length;w++){
						if(data.work[w]=='1'){
							work_type='上班';
							work_img='img/sign in-icon-be on duty.png';
						}else if(data.work[w]=='2'){
							work_type='下班';
							work_img='img/sign in-icon-off duty.png';
						}					
						if(data.switch[w]=='1'){							
							att_btn+='<li class="mui-table-view-cell mui-media"><a href="javascript:;"><img class="mui-media-object mui-pull-left" src="'+work_img+'" style="height: 24px;width: 24px;margin-top:3px;"><div class="mui-media-body" style="margin-top:3px;"><span class="qdzt">'+work_type+'</span>(<span class="att_time">'+data.time[w]+'</span>)<input onclick="Time_attend(this)" type="button" class="mui-btn mui-btn-danger" data-flag="'+(w+1)+'" id="time_btn'+(w+1)+'" style="float:right" value="签到"/></div></a></li>';
						}						
					}
					jQuery("#qd").html(att_btn);
				}
			});
			/*检测是否有签到记录，防止重新载入页面时签到记录丢失*/
			mui.ajax("http://app.oaoa.pro/app/attend/p/m_data.php",{
				data:{
					flag:1
				},
				async:false,
				dataType:'json',//服务器返回json格式数据
				type:'post',//HTTP请求类型        
				success:function(data){			
					for(var l=0;l<data.attend.length;l++){
						if(data.attend[l].atime_state != '未签到'){
							jQuery("#qd a input")[l].value=data.attend[l].atime_state;
						}						
					}
				}
			});
		})(mui,document);
		//签到功能
		/****1.判断网络状态，定位等设置信息***/
		function Time_attend(that){
			plus.geolocation.getCurrentPosition(function(p){
				var startp = new plus.maps.Point(location_str[0],location_str[1]);
				var endp = new plus.maps.Point(p.coords.longitude,p.coords.latitude);
				map.centerAndZoom(endp, 16);
				var address=p.addresses+','+p.coords.longitude+','+p.coords.latitude //获取签到地点
				if(wifi_sw =='1'){//开启网络wifi设置
					var net_type='';
					function plusReady(){
						net_type=plus.networkinfo.getCurrentType(); 
						if(net_type ==0){
							mui.toast('设备网络状态未知');
						}else if(net_type ==1){
							mui.toast('当前设备网络未连接网络');
						}else if(net_type ==3){
							Worktime(that,address);
						}
					}
					if(window.plus){
						plusReady();
					}else{
						document.addEventListener("plusready",plusReady,false);
					}
				}else if(location_sw=='1'){//开启地点定位和范围		
								plus.maps.Map.calculateDistance(startp,endp,function(event){
									var distance = event.distance;  // 转换后的距离值
									if(distance > range){
										mui.toast("您不在签到范围内！");
									}else{
										Worktime(that,address);
									}
								},function(e){
									alert("Failed:"+JSON.stringify(e));
								});
				}else{
					mui.toast('请联系管理员设置正确的考勤方式！');
				}			
			}, function(e){
				alert('Geolocation error: ' + e.message);
			},{geocode:true,provider:'amap'});		
		}
		/***2.判断上下班时间范围相关信息***/
		function Worktime(that,address){
			/** 获取当前时间*/
			function p(s) {
				return s < 10 ? '0' + s: s;
			}
			var myDate = new Date();
			var d=myDate.getDate();
			var y=myDate.getFullYear();
			var m=myDate.getMonth()+1;
			var h=myDate.getHours();       //获取当前小时数(0-23)
			var mt=myDate.getMinutes();     //获取当前分钟数(0-59)
			var s=myDate.getSeconds();  
			var now=p(h)+':'+p(mt)+":"+p(s);
			var tdate=Date.parse(new Date(y+'-'+p(m)+'-'+p(d)+' '+now)); //当前时间
			var set_now=Date.parse(new Date(y+'-'+p(m)+'-'+p(d)+' '+$(that).siblings('span.att_time').html()+':00'));                //设置时间
			var real_dis=Math.abs(parseInt(set_now - tdate) / 1000 / 60);       //时间差
			var aflag = that.getAttribute("data-flag");
			if($(that).siblings('span.qdzt')[0].innerHTML== "上班"){
				if(tdate< set_now && real_dis>parseInt(worktime_f.split(":")[0])*60+parseInt(worktime_f.split(":")[1])){
					mui.toast('未到签到时间！') ;
				}else if(tdate>set_now && real_dis> parseInt(worktime_b.split(":")[0])*60+parseInt(worktime_b.split(":")[1])){
					mui.toast('签到时间已过！');
				}else{
					userLocation(aflag,now,address);
				}
			}else if($(that).siblings('span.qdzt')[0].innerHTML== "下班"){
				if(tdate< set_now && real_dis>parseInt(workafter_f.split(":")[0])*60+parseInt(workafter_f.split(":")[1])){
					mui.toast('未到签到时间！') ;
				}else if(tdate>set_now && real_dis> parseInt(workafter_b.split(":")[0])*60+parseInt(workafter_b.split(":")[1])){
					mui.toast('签到时间已过！');
				}else{
					userLocation(aflag,now,address);
				}
			}
		}
		function userLocation(aflag,now,address){
				mui.ajax("http://app.oaoa.pro/app/attend/p/m_data.php",{
					data:{
						flag:3,
						aflag:aflag, 
						time:now,
						phone_id:plus.device.uuid,
						device:plus.device.vendor + ',' + plus.device.model + ',' + plus.os.version,
						address:address	
					},
					dataType:'json',//服务器返回json格式数据
					type:'post',//HTTP请求类型        
					beforeSend: function() {
						wait;
					},
					complete: function() { 
						 plus.nativeUI.closeWaiting();          
					},
					success:function(data){
						if(data.state=='ok'){
							plus.nativeUI.toast('签到成功！') ;
							if(parseInt(aflag)==1){
								document.getElementById("time_btn1").value=data.info.attend[0].atime_state;
							}else{
								document.getElementById("time_btn"+parseInt(aflag)).value=data.info.attend[parseInt(aflag)-2].atime_state;
							}
						}else if(data.state=='repeat'){
							plus.nativeUI.toast('您已签到,请不要重复签到！') ;
						}
					},
					error:function(e){
						plus.nativeUI.toast('网络请求失败！') ;
					}
				});
		}
		var vm=new Vue({
			el:'#app',
			data:{
				name:'Vue.js'
			},
			methods:{
				clk_kqtj_index:function(event){
					 mui.openWindow({
						url:'kqtj_index.html', 
						id:'kaoqin'
					 }); 
				},
				clk_windex:function(event){
					 mui.openWindow({
						url:'windex.html', 
						id:'waiqin'
					 }); 
				},
				clk_setlist:function(event){
					mui.openWindow({
						url:'setlist.html', 
						id:'setlists'
					}); 
				}
			}			
		});
	</script>
</html>