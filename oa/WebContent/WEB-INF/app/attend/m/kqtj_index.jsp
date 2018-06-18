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
	    <!--<meta charset="UTF-8">-->
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
	    <title>考勤统计</title>
		<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="../js/diary/m/mui.min.js"></script>
		<script type="text/javascript" src="../js/diary/m/vue.min.js"></script>
		<script src="../js/attend/m/zepto_1.1.3.js"></script>
		<script src="../js/attend/m/jquery.circliful.min.js"></script>
		<script type="text/javascript" src="../js/attend/m/mui.picker.min.js" ></script>
		<link href="../css/diary/m/mui.css" rel="stylesheet">
		<link href="../css/attend/m/jquery.circliful.css" rel="stylesheet"/>
		<link rel="stylesheet" href="../css/attend/m/mui.picker.min.css" />
		<link href="../css/attend/m/kqtj_main.css" rel="stylesheet"/>



		<style>
			.content{font-size:16px;}
			.pmbimg{
				float: right;
				margin-top:5px;
			}
			.phbtx{
				margin-left:5px;
				margin-top:-2px;
			}
			
			.kq_left{
				float: left;
	   	 		width: 45%;
	    		margin-top:125px;
				}
			.btn-bgl{
				background-image:url('img/left.png');
				height: 20px;
				margin-right:12px;
				background-size: 18px,26px;
				border: 1px solid #fff;
				background-repeat: no-repeat
			}
			.btn-bgr{
				background-image:url('img/right.png');
				height: 20px;
				margin-left:12px;
				background-size: 18px,26px;
				border: 1px solid #fff;
				background-repeat: no-repeat
			}
			.circle-info, .circle-info-half {
				color: #999;
				font-size: 15px;
				margin-top: 4px;
			}
			.mui-table-view-cell{
				height:75px;
			}
			.pnum {
				display: inline;
				margin-left: 70px;
			}
		</style>
	</head>
	<body id="app">
		<header id="header" class="mui-bar mui-bar-nav">
		   <h1 class="mui-title">考勤统计</h1>
		   <button class="mui-action-back mui-btn mui-btn-blue mui-btn-link mui-btn-nav mui-pull-left" @click="fh_index" id="fh_index" style="color:#999;">
			<span class="mui-icon mui-icon-left-nav"></span>
		   </button>
		   <a class="mui-icon mui-pull-right add"></a>
		</header>
		<div style="padding: 10px 10px;margin-top: 44px;">
			<div id="segmentedControl" class="mui-segmented-control">
				<a class="mui-control-item mui-active" href="#item2">
				我的考勤
				</a>
				<a class="mui-control-item " href="#item1">
				公司考勤
				</a>
			</div>
		</div>
		<div>
			<div id="item1" class="mui-control-content">
				<div style="margin-bottom: 10px;text-align: center;margin-top: 10px;"id="suanfa">
					<button type="button" class="mui-btn btn-bgl" id="sub" onclick="changeSubTime()"></button><time id="timeShow"><a></a></time><button type="button" class="mui-btn btn-bgr"  id="add" onclick="changeAddTime()"></button>
				</div>
				<div style="height:435px;">
					<div style="background-color:#f0eff5;height:20px;"></div>
					<div style="margin-top: 20px;border-left:4px solid #257cfc;margin-left: 20px;">
						<span style="margin-left:10px;">公司考勤情况</span>
					</div>
					<div style="margin-top: 5px;">
						<div class="kq_left" id="kq_left">
						</div>
						<div class="kq_right" id="kq_right">
							<div style="width: 25%;float:left;">
							<ul style="margin-top: 0px;padding-left: 0px;" id="attend_left">
								<li style="margin-top:5px;">
									<div style="font-size:15px;margin-bottom: 5px;">上班正常</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#74caff;width: 20px;height: 14px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">下班正常</div>
									<div style="position:relative;">
										<div style="position:absolute;top:0;left: 0;background-color:#F7F7F7;width: 60px;height: 14px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#fb892f;width:15px;height: 15px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">未签到</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:greenyellow;width: 10px;height: 15px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">未签退</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#8cc63a;width: 10px;height: 15px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">迟到</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#fb7c64;width: 10px;height: 15px;"></div>
										<span class="pnum">0</span>
										<div style="clear: both;"></div>
									</div>
								</li>
							</ul>
						</div>
						<div style="width:25%;float:right;margin-left:0px ;">
							<ul style="margin-top: -10px;padding-left:0px;" id="attend_right">
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">早退</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#9cd9ff;width: 10px;height: 15px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">外出</div>
									<div style="position:relative;">
										<div style="position:absolute;top:top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#ffa45c;width: 17px;height: 15px;"></div>
										<span class="pnum">0</span></div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">外勤</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#bcdf72;width: 25px;height: 15px;"></div>
									    <span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">出差</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#c9abfa;width: 25px;height: 15px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
								<li style="margin-top: 15px;">
									<div style="font-size:15px;margin-bottom: 5px;">请假</div>
									<div style="position:relative;">
										<div style="position:absolute;top:2px;left: 0;background-color:#F7F7F7;width: 60px;height: 15px;"></div>
										<div style="position:absolute;top:2px;left: 0;background-color:#c9abfa;width: 25px;height: 15px;"></div>
										<span class="pnum">0</span>
									</div>
								</li>
							</ul>
						</div>
					
						</div>
					</div>
				</div>
				<div style="margin-top: 5px;">
					<div style="background-color:#f0eff5;height:20px;"></div>
					<div style="margin-top:16px;border-left:4px solid #257cfc;margin-left: 20px;margin-bottom: 10px;">
						<span style="margin-left:10px;">今日考勤排行榜</span>
					</div>
				</div>
				<div>
					<ul class="mui-table-view" id="phb">
					</ul>
				</div>
			</div>
			<div id="item2" class="mui-control-content mui-active">
				<div>
					<div style="float:left;margin-top:6px;margin-left:20px;">
						<img id="avatar" style="height: 55px;width:55px;border-radius: 50%;">
					</div>
					<div style="float:left; margin-left:10px;margin-top:10px;">
						<div style="font-size: 20px;" id="username"></div>
						<div style="font-size: 14px;color:#666666">考勤类型：默认类型</div>
					</div>
						<div id="result" class="btn" style="margin-left:20px;float: left;height:41px;width:auto;line-height:39px;border:1px solid #257cfc;border-radius:4px;text-align: center;color: #257cfc;" data-options="{&quot;type&quot;:&quot;month&quot;}">选择月份</div> 
					<!--</div>-->
					<div style="clear:both"></div>
				</div>
				<div style="height:210px; width:100%" id="mykqtj">
					<div style="clear:both;"></div>
				</div>
				<div style="border-bottom: 1px solid #AAAAAA;background-color: #F7F7F7;height: 40px;line-height: 40px;"><div style="margin-left: 10px;color: #999999;" >迟到记录</div></div><div style="margin-left: 10px;" id="cdjl0"></div>
				<div style="border-bottom: 1px solid #AAAAAA;background-color: #F7F7F7;height: 40px;line-height: 40px;"><div style="margin-left: 10px;color: #999999;" >早退记录</div></div><div style="margin-left: 10px;" id="cdjl1"></div>
				<div style="border-bottom: 1px solid #AAAAAA;background-color: #F7F7F7;height: 40px;line-height: 40px;"><div style="margin-left: 10px;color: #999999;" >缺卡记录</div></div><div style="margin-left: 10px;" id="cdjl2"></div>
				<div style="border-bottom: 1px solid #AAAAAA;background-color: #F7F7F7;height: 40px;line-height: 40px;"><div style="margin-left: 10px;color: #999999;" >旷工记录</div></div><div style="margin-left: 10px;" id="cdjl3"></div>
			</div>
		</div>
		<script>
			var wait=null;var closewin=null;
			if(window.plus){
				plusReady();
			}else{
				document.addEventListener("plusready",plusReady,false);
			}
			function plusReady(){
				wait=plus.nativeUI.showWaiting('正在加载');   
				closewin= plus.nativeUI.closeWaiting(); 
			}
		   (function($) {
		    $.init();
		   var result = $('#result')[0];
		    var btns = $('.btn');
		     btns.each(function(i, btn) {
		     btn.addEventListener('tap', function() {
		      var optionsJson = this.getAttribute('data-options') || '{}';
		      var options = JSON.parse(optionsJson);
		      var id = this.getAttribute('id');
		      var picker = new $.DtPicker(options);
		      picker.show(function(rs) {
		       result.innerText = ' ' + rs.text;
				var select_year=parseInt(rs.y.value);
				var select_month=parseInt(rs.m.value);
				//mui.alert("1");
				get_myattend(select_year,select_month);
			   picker.dispose();
		      });
		     }, false);
		    });
		    choose_type();
		   })(mui);
			mui(".mui-slider").slider({interval:4000});
			//时间戳转捿	
			function getLocalTime(nS) {
				return new Date(parseInt(nS)).toLocaleString().replace(/:\d{1,2}$/,' ');     
			}  
			//
			function changeAddTime(){
				var timenei=$("#timeShow").text();
				var timestrap=Date.parse(new Date(timenei));
				var times=60*60*24*1000;
				var nowTime=timestrap+times;
				var c=(getLocalTime(nowTime)).toString();
				var ar=c.split(" ");
				var strAdd=ar[0];
				var strAddArr=ar[0].split("/");
				var strAdd=strAddArr.join("-");
				$("#timeShow").html(strAdd);
				choose_date(strAdd);
			}
			function changeSubTime(){
				var timewai=$("#timeShow").text();
				var timestrap=Date.parse(new Date(timewai));
				var times=60*60*24*1000;
				var nowTime=timestrap-times;
				var c=(getLocalTime(nowTime)).toString();
				var ar=c.split(" ");
				var strSubArr=ar[0].split("/");
				var strSub=strSubArr.join("-");
				$("#timeShow").html(strSub);
				choose_date(strSub);
			}
			//选择日期进行公司考勤情况查询
			function choose_date(dd){
				$.ajax("http://app.oaoa.pro/app/attend_query/p/m_date.php",{
					data:{
						flag:5,
						date:dd
					},
					dataType:'json',//服务器返回json格式数据
					type:'post',//HTTP请求类型 
					beforeSend: function() {
			              wait;
			        },
			        complete: function() { 
			             closewin;     
			        },
					success:function(data){
						
						//服务器返回响应，根据响应结果，分析是否登录成功；
						var data_part=data.user_all;
						var data_total=data.chuqinrenshu;
						var data_percent=(data.chuqinrenshu/data.user_all)*100;
						var att_total=data.data;
						$("#kq_right ul li").each(function(){
						    for(var i=0;i<10;i++){
						    	if($(this).find("div").eq(0).text() == att_total[i]['sname']){
						    		$(this).find("div").eq(1).find(".pnum").text(att_total[i]['num']);
						    		break;
						    	}
						    }
						});
						var	str_map='<div id="myStat" data-dimension="140" data-text="'+data_total+'/'+data_part+'" data-width="10" data-fontsize="14" data-percent="'+data_percent+'" data-fgcolor="#61a9dc" data-bgcolor="#eee" data-fill="#fff" data-info="出勤人员" data-total="'+data_total+'" data-part="'+data_part+'"  style="margin-left:12px;"></div>';
								$("#kq_left").html(str_map);
								//$("#kq_right").html(str);
								$('#myStat').circliful();
								var phb_str='';
								if(data.rank != null){
									for(var k=0;k<data.rank.length;k++){
										phb_str+='<li class="mui-table-view-cell">'+
										'<img src="'+data.rank[k].avatar+'"height="20" width="20" style="margin-left:5px;">'+
										'<span style="margin-left:65px;">'+data.rank[k].name+'</span>'+
										'<time style="margin-left:25px;">'+data.rank[k].attend_time+'</time><span class="mui-badge">'+(k+1)+'</span>'+
										'</li>';
									}
									$("#phb").html(phb_str);
								}else{
									$("#phb").html('<li style="height:30px;" class="mui-table-view-cell">暂无考勤排行！</li>');
								}
					}
				});
			}
			
			
			var now=new Date();
			var nowmonth=now.getMonth()+1;
			var datestr=now.getFullYear()+'-'+nowmonth+'-'+now.getDate();
			$("#timeShow").html(datestr);
			choose_date(datestr);
		
		//我的考勤接口
			function choose_type(){
				var morenDate=new Date();
				var morenMonth=morenDate.getMonth()+1;
				var morenYear=morenDate.getFullYear();
				get_myattend(morenYear,morenMonth)
			}
			//选择日期进行我的考勤查询
			function get_myattend(morenYear,morenMonth){
			$.ajax("http://app.oaoa.pro/app/attend_query/p/m_date.php",{
				data:{
					flag:6,
					year:morenYear,
					month:morenMonth
				},
				dataType:'json',//服务器返回json格式数据
				type:'post',//HTTP请求类型            
				beforeSend: function() {
		            wait;
		        },
		        complete: function() { 
		            closewin;          
		        },
				success:function(data){
					var str='<div style="float:left;width:45%;margin-left: 30px;"><ul style="margin-top:17px;padding-left: 0px;margin-bottom: 0px;">'+
								'<li style="border-left:20px solid #3982c1 ;margin-bottom: 10px;"><div class="content">'+
								'<span style="margin-left: 20px;">'+data.return_arr.data[0].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[0].num+data.return_arr.data[0].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content">'+
								'<span style="margin-left: 20px;">'+data.return_arr.data[2].sname+'</span><span style="margin-right:26px;float:right;">'+data.return_arr.data[2].num+data.return_arr.data[2].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[4].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[4].num+data.return_arr.data[4].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[6].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[6].num+data.return_arr.data[6].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[8].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[8].num+data.return_arr.data[8].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[10].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[10].num+data.return_arr.data[10].type+'</span></div></li></ul></div>'+
								'<div style="float:left;width:45%;"><ul style="padding-left: 0px;margin-bottom: 0px;">'+
								'<li style="border-left:20px solid #3982c1 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[1].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[1].num+data.return_arr.data[1].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[3].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[3].num+data.return_arr.data[3].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[5].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[5].num+data.return_arr.data[5].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[7].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[7].num+data.return_arr.data[7].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[9].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[9].num+data.return_arr.data[9].type+'</span></div></li>'+
								'<li style="border-left:20px solid #fba953 ;margin-bottom: 10px;"><div class="content"><span style="margin-left: 20px;">'+data.return_arr.data[11].sname+'</span>'+
								'<span style="margin-right:26px;float:right;">'+data.return_arr.data[11].num+data.return_arr.data[11].type+'</span></div></li></ul></div>';
								for(var i=0;i<data.return_arr.list.length;i++){
									if(i!=3){
										if(data.return_arr.list[i].data.length==0){
											var cdjl='';
											$("#cdjl"+i).html(cdjl);
										}else if(data.return_arr.list[i].data.length>0){
											var cdjl='';
											for(j=0;j<data.return_arr.list[i].data.length;j++){
												var cdjl=cdjl+'<p style="color:#000000">'+data.return_arr.list[i].data[j].date+'('+data.return_arr.list[i].data[j].week+')'+data.return_arr.list[i].data[j].time+'</p>';
											}
											$("#cdjl"+i).html(cdjl);
										}
									}else if(i==3){
										if(data.return_arr.list[i].data.length==0){
											var cdjl='';
											$("#cdjl"+i).html(cdjl);
										}else if(data.return_arr.list[i].data.length>0){
											var cdjl='';
											for(j=0;j<data.return_arr.list[i].data.length;j++){
												var cdjl=cdjl+'<p style="color:#000000">'+data.return_arr.list[i].data[j].date+'('+data.return_arr.list[i].data[j].week+')</p>';
											}
											$("#cdjl"+i).html(cdjl);
										}
									}
								}
								document.getElementById("avatar").src =data.data[0].avatar;
								$("#username").html(data.data[0].uname);
								$("#mykqtj").html(str);
							}
				});
			}
				
			//点击返回按钮
			var vm=new Vue({
					el:'#app',
					data:{
						name:'Vue.js'
					},
					methods:{
						fh_index:function(event){
							 mui.openWindow({
								url:'index.html', 
								id:'fh_index'
							 }); 
						}
				}
			});
		</script>
	</body>
</html>