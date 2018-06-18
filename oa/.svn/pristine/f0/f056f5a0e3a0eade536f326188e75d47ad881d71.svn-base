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
	    <title>外勤签到</title>
	    <script type="text/javascript" src="js/1.10.2.jquery.min.js" ></script>
	    <script src="js/mui.min.js"></script>
	    <script type="text/javascript" src="js/simbaJs.js" ></script>
	    <script src="js/zepto_1.1.3.js"></script>
		<script src="js/vue.min.js"></script>
		<script src="layer/layer.js"></script>
	    <link href="css/mui.min.css" rel="stylesheet"/>
	    <link href="css/mian.css" rel="stylesheet"/>
	    <link rel="stylesheet" href="css/windex.css" />
	  	<link rel="stylesheet" href="layer/skin/layer.css" />
	</head>
	<body id="app">
		<header id="header" class="mui-bar mui-bar-nav">
		   <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left" style="color: #999;"></a>
			<h1 class="mui-title">外勤签到</h1>
		</header>
		<div class="mui-content">
			 <div style="width:100%;height:35%;border:#ccc solid 1px;" id="map">map loading...</div>
			<div class="currentTime" id="">
				<div id="dateShow" class="dateShow"></div>
				<div class="qdlx"></div>
				<div class="mui-text-center qdlx" id="address"></div>
			</div>
			<div class="mui-card-content-inner">		
				<ul class="mui-table-view" id="waiqin_ul">
				</ul>
			</div>
			<div class="bottomBtn"><button type="button" class="mui-btn   buttonStyle buttonStyletest"  onclick="userLocation()">立即签到</button></div>
		</div>
	</body>
	<script>
		var ws=null,wo=null;
		var em=null,map=null,pcenter=null;
		var wait=null;var closewin=null;
		// H5 plus事件处理
		function plusReady(){
			if(!em||ws){return};
			//map.reset();
			// 获取窗口对象,初始化地图
			map=new plus.maps.Map("map");
			ws=plus.webview.currentWebview();
			wo=ws.opener();
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
	      
			var date=new Date();
			var d=date.getDate();
			var y=date.getFullYear();
			if(date.getMonth()<10){
				var monthstr=date.getMonth()+1;
				m='0'+monthstr;
			}else {
				m=date.getMonth();
			}
			function numToStr(data) {
				switch(data){
					case 0:
					 return "星期日";
					 break;
					case 1:
					 return "星期一";
					 break;
					 case 2:
					 return "星期二";
					 break;
					 case 3:
					 return "星期三";
					 break;
					 case 4:
					 return "星期四";
					 break;
					 case 5:
					 return "星期五";
					 break;
					 case 6:
					 return "星期六";
					 break;
					 
				}
			}
			var w=numToStr(date.getDay());
			var str=y+'年'+m+'月'+d+'日&nbsp;&nbsp;&nbsp;'+w;
			document.getElementById('dateShow').innerHTML=str;
			/*检测是否有签到记录，防止重新载入页面时签到记录丢失*/
			$.ajax("http://app.oaoa.pro/app/attend/p/m_data.php",{
					data:{
						flag:1,
						type:1
					},
					dataType:'json',//服务器返回json格式数据
					type:'post',//HTTP请求类型        
					beforeSend: function() {
						wait;
			        },
			        complete: function() { 
			            // plus.nativeUI.closeWaiting();  
			            closewin;
			        },
					success:function(data){
						var wq_str=data.waiqin;
						var waiqin='';
							if(wq_str.length>0){
								for(var i=0;i<wq_str.length>0;i++){
									waiqin+='<li class="mui-table-view-cell mui-media"><div class="mui-media-body"><input  type="button" class="mui-btn-danger"  id="morning" value="外勤"/><span class="qdaddress">'+wq_str[i].address_out.split(',')[0]+'</span><span class="qdtime">'+wq_str[i].atime_out+'</span></div></li>';
								}
								document.getElementById('waiqin_ul').innerHTML = waiqin;
							}

					}
			});
		})(mui,document);
		//外勤签到功能
		function userLocation(){
			/*并且获取当地定位*/
			plus.geolocation.getCurrentPosition(function(p){
				map.showUserLocation( true );
				map.getUserLocation(function(state,pos){
					if(0==state){
						map.setCenter(pos);
					}
				});
				var address = p.addresses ;  // 地理位置
				$("#address").html('您的位置:'+address);
				$.ajax("http://app.oaoa.pro/app/attend/p/m_data.php",{
					data:{
						flag:5,
						phone_id:plus.device.uuid,
						device:plus.device.vendor + ',' + plus.device.model + ',' + plus.os.version,
						address:address+','+p.coords.longitude+','+p.coords.latitude,
						remark:''
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
						console.log(JSON.stringify(data));
						var wq_str=data.waiqin;
						var waiqin='';
						if(data.state=='ok'){
							plus.nativeUI.toast('签到成功！') ;
									waiqin='<li class="mui-table-view-cell mui-media"><div class="mui-media-body"><input  type="button" class="mui-btn-danger"  id="morning" value="外勤"/><span class="qdaddress">'+wq_str.address_out.split(',')[0]+'</span><span class="qdtime">'+wq_str.atime_out+'</span></div></li>';
								$(".mui-card-content-inner ul").append(waiqin);
						}
					},
					error:function(e){
						plus.nativeUI.toast('网络请求失败！') ;
					}
				});
			}, function(e){
				alert('Geolocation error: ' + e.message);
			},{geocode:true,provider:'amap'});
		}
	</script>
</html>