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
    <meta charset="gbk">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>我收到的</title>
    <script src="/static/js/jquery-1.10.2/jquery.min.js"></script>
    <script src="/static/pack/mobile/js/mui.min.js"></script>
    <script src="/static/pack/mobile/js/vue.min.js"></script>
    <link href="/static/pack/mobile/style/mui.min.css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="/static/pack/mobile/style/iStarted.css">
   	<link rel="stylesheet" href="/static/pack/mobile/style/diary_base.css" />
    <link rel="stylesheet" href="/static/pack/mobile/style/my_receive.css">
   	<style>
   		body,.mui-content {
   			background-color: #f5f5f5;
   		}
      /*覆盖搜索框图标样式*/
      .mui-search .mui-placeholder .mui-icon{
        font-size:20px;
        color:#c1c1c1;
      }
   	</style>
    <script type="text/javascript" charset="utf-8">
      	mui.init();
        // 自适应布局
        (function (doc, win) {
          var docEl = doc.documentElement,
              resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
              recalc = function () {
                  var clientWidth = docEl.clientWidth;
                  if (!clientWidth) return;
                  if(clientWidth>=640){
                      docEl.style.fontSize = '100px';
                  }else{
                      docEl.style.fontSize = 100 * (clientWidth / 720) + 'px';
                  }
              };

          if (!doc.addEventListener) return;
          win.addEventListener(resizeEvt, recalc, false);
          doc.addEventListener('DOMContentLoaded', recalc, false);
        })(document, window);
    </script>
</head>
<body id="ireceived">
	<div class="mui-content">
		<div class="stat_sear" style="margin-top:8px;">
			<div class="mui-input-row mui-search diarySearch">
				<input type="search" class="mui-input-clear" id="searchLog" placeholder="搜索日志">
			</div>
		</div>
		<div class="Modular">
			<!--<div class="mo_box mo_daily">
				<div class="clearfix badge_blue">
					<h4 class="pull_left">工作日报</h4>
					<i class="date_icon" data-type="0"></i>
				</div>
		    	<div class="box_count">
           			<span class="spacing">今日提交情况&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已提交<span class="txt-blue" id="dir_unsub">0</span>/<span class="dir_total">0</span></span>
           			<span class="Arrow">查看详情</span>
		    	</div>
		    	<div class="box_count">
           			<span class="spacing">昨天提交情况&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已提交<span class="txt-blue" id="">0</span>/<span class="dir_total">0</span></span>
           			<span class="Arrow">查看详情</span>
		    	</div>
			</div>
			<div class="mo_box mo_week">
				<div class="clearfix badge_blue">
					<h4 class="pull_left">工作周报</h4>
					<i class="date_icon" data-type="0"></i>
				</div>
		    	<div class="box_count">
           			<span class="spacing">本周提交情况&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已提交<span class="txt-blue" id="dir_unsub">0</span>/<span class="dir_total">0</span></span>
           			<span class="Arrow">查看详情</span>
		    	</div>
		    	<div class="box_count">
           			<span class="spacing">上周提交情况&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已提交<span class="txt-blue" id="">0</span>/<span class="dir_total">0</span></span>
           			<span class="Arrow">查看详情</span>
		    	</div>
			</div>
			<div class="mo_box mo_month">
				<div class="clearfix badge_blue">
					<h4 class="pull_left">工作月报</h4>
					<i class="date_icon" data-type="0"></i>
				</div>
		    	<div class="box_count">
           			<span class="spacing">本月提交情况&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已提交<span class="txt-blue" id="dir_unsub">0</span>/<span class="dir_total">0</span></span>
           			<span class="Arrow">查看详情</span>
		    	</div>
		    	<div class="box_count">
           			<span class="spacing">上月提交情况&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已提交<span class="txt-blue" id="">0</span>/<span class="dir_total">0</span></span>
           			<span class="Arrow">查看详情</span>
		    	</div>
			</div>-->
		</div>
		<ul class="mui-table-view list" style="display: none;" id="list">
		</ul>

	</div>
</body>
<script>
	function GetQueryString(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if (r != null) return unescape(r[2]); return null;
	}
	

</script>
<script type="text/javascript">
	cal_time = GetQueryString("time"); //括号里放地址栏传参变量
	if(cal_time==null){
		cal_time="";
	}
	var user_id="";
	user_id = GetQueryString("user_id"); //括号里放地址栏传参变量
	if(user_id==null){
		user_id="";
	}
	function loglist(){
			$(".Modular").hide();
			$("#list").show();
			var data = {
				"flag":15, //查看路径
				"user_id":user_id,
				"keyword":jQuery("#searchLog").val() //搜索的内容
			};
			mui.ajax({
			   	url: 'data/data.php',
			   	type: 'get',
				data:data,
			   	dataType:'json',
			  	success:function(data){
			  		str1="";
			  		if(data.length>0){
			  			for(var i=0;i<data.length;i++){
			  				if(data[i].READ_FLAG == '0'){
			  					str1+='<li class="mui-table-view-cell li_sub" did="'+data[i].DIA_ID+'"><h4><span class="tit_nane">'+data[i].SUBJECT+'</span><span class="spot"></span></h4><p>'+data[i].CONTENT+'</p><div class="bt_dir"><span class="time">'+data[i].DIA_DATE+'</span><span class="comment">点评：'+data[i].COMMENT+'</span><span class="consult">查阅：'+data[i].CONSULT+'</span></div></li>';
			  				}else{
			  					str1+='<li class="mui-table-view-cell li_sub" did="'+data[i].DIA_ID+'"><h4><span class="tit_nane">'+data[i].SUBJECT+'</span></h4><p>'+data[i].CONTENT+'</p><div class="bt_dir"><span class="time">'+data[i].DIA_DATE+'</span><span class="comment">点评：'+data[i].COMMENT+'</span><span class="consult">查阅：'+data[i].CONSULT+'</span></div></li>';
			  				}
			  			}
			  			jQuery("#list").html(str1);
			  		}else{
			  			jQuery("#list").html('<li class="mui-table-view-cell">暂无数据</li>');
			  		};
			  	}
			});
		}
	jQuery(function(){
		var data = {
			"flag":15, //查看路径
			"ctime":cal_time,
			"user_id":user_id
			};
		mui.ajax('data/data.php',{
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
						var str="";
						str = '<div class="mo_box mo_daily">'+
									'<div class="clearfix badge_blue">'+
										'<h4 class="pull_left">工作日报</h4>'+
										'<i class="date_icon calendar-icon" data-type="3"></i>'+
									'</div>'+
							    	'<div class="box_count">'+
					           			'<span class="spacing">今日提交情况<span class="btn_style">已提交</span><span class="txt-blue" id="dir_unsub">'+data[0].sub +'</span>/<span class="dir_total">'+data[0].total +'</span></span>'+
					           			'<span class="Arrow" sub='+data[0].sub +' unsub='+data[0].unsub+' ctype="day">查看详情</span>'+
							    	'</div>'+
							    	'<div class="box_count">'+
					           			'<span class="spacing">昨天提交情况<span class="btn_style">已提交</span><span class="txt-blue" id="">'+data[3].sub +'</span>/<span class="dir_total">'+data[0].total +'</span></span>'+
					           			'<span class="Arrow" sub='+data[3].sub +' unsub='+data[3].unsub+' ctype="yesterday">查看详情</span>'+
							    	'</div>'+
								'</div>'+
								'<div class="mo_box mo_week">'+
									'<div class="clearfix badge_blue">'+
										'<h4 class="pull_left">工作周报</h4>'+
										'<i class="date_icon calendar-icon" data-type="4"></i>'+
									'</div>'+
							    	'<div class="box_count">'+
					           			'<span class="spacing">本周提交情况<span class="btn_style">已提交</span><span class="txt-blue" id="dir_unsub">'+data[1].sub +'</span>/<span class="dir_total">'+data[1].total +'</span></span>'+
					           			'<span class="Arrow" sub='+data[1].sub +' unsub='+data[1].unsub+' ctype="week">查看详情</span>'+
							    	'</div>'+
							    	'<div class="box_count">'+
					           			'<span class="spacing">上周提交情况<span class="btn_style">已提交</span><span class="txt-blue" id="">'+data[4].sub +'</span>/<span class="dir_total">'+data[4].total +'</span></span>'+
					           			'<span class="Arrow" sub='+data[4].sub +' unsub='+data[4].unsub+' ctype="lastweek">查看详情</span>'+
							    	'</div>'+
								'</div>'+
								'<div class="mo_box mo_month">'+
									'<div class="clearfix badge_blue">'+
										'<h4 class="pull_left">工作月报</h4>'+
										'<i class="date_icon calendar-icon" data-type="5"></i>'+
									'</div>'+
							    	'<div class="box_count">'+
					           			'<span class="spacing">本月提交情况<span class="btn_style">已提交</span><span class="txt-blue" id="dir_unsub">'+data[2].sub +'</span>/<span class="dir_total">'+data[2].total +'</span></span>'+
					           			'<span class="Arrow" sub='+data[2].sub +' unsub='+data[2].unsub+' ctype="month">查看详情</span>'+
							    	'</div>'+
							    	'<div class="box_count">'+
					           			'<span class="spacing">上月提交情况<span class="btn_style">已提交</span><span class="txt-blue" id="">'+data[5].sub +'</span>/<span class="dir_total">'+data[5].total +'</span></span>'+
					           			'<span class="Arrow" sub='+data[5].sub +' unsub='+data[5].unsub+' ctype="lastmonth">查看详情</span>'+
							    	'</div>'+
								'</div>'

						$(".Modular").html(str);
					},
					error:function(xhr,type,errorThrown){
						//异常处理；
						console.log(type);
						console.log(xhr);
						console.log(errorThrown);
					}
			});
			mui(".Modular").on("tap",".Arrow ",function(){
				var sub = this.getAttribute("sub");
				var unsub = this.getAttribute("unsub");
				var ctype = this.getAttribute("ctype");
				//打开详情
				mui.openWindow({
					id:'ireceived_list.php',
					url:'ireceived_list.php?sub='+sub+'&unsub='+unsub+'&ctype='+ctype+'&ctime='+cal_time
				});
			});
			mui(".Modular").on("tap",".calendar-icon ",function(){
				var dia_type = this.getAttribute("data-type");
				//打开日历界面
				mui.openWindow({
					id:'calender.php',
					url:'calender.php?dia_type='+dia_type
				});
			});
			mui("#list").on("tap",".li_sub",function(){
				var did = this.getAttribute("did");
				//打开详情
				mui.openWindow({
					id:'received_details.php',
					url:'received_details.php?type=receive&id='+did
				});
			});
			//搜索功能
			var u=navigator.userAgent;
			if(!!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/)){
				//获取IOS  eid
				jQuery("#searchLog").blur(function(){
					loglist();
				})
			}else if(u.indexOf("Android")>-1||u.indexOf("Linux")>-1){
				//获取安卓  eid
				document.getElementById("searchLog").addEventListener("keydown",function(e){
			        if(13 == e.keyCode){ //点击了“搜索”
			        	loglist();
			           document.activeElement.blur();//隐藏软键盘
			        }
			    },false);
			}







		})












</script>
</html>
