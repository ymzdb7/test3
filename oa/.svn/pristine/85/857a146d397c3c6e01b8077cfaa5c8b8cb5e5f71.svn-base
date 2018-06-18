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
    <link rel="stylesheet" type="text/css" href="/static/pack/mobile/style/consult.css">
   	<link rel="stylesheet" href="/static/pack/mobile/style/diary_base.css" />
   	<style>
   		body {
   			background-color: #fff;
   		}
   		.mui-btn-block {
		    width: calc(100% - 20px);
		    margin: auto;
		}
    /*覆盖搜索框图标样式*/
    .mui-search .mui-placeholder .mui-icon{
      font-size:20px;
      color:#c1c1c1;
    }
   	</style>
    <script type="text/javascript" charset="utf-8">
      	mui.init();
    </script>
</head>
<body id="ireceived">
	<div class="mui-content">
		<div class="stat_sear">
			<div class="mui-input-row mui-search diarySearch">
				<input type="search" class="mui-input-clear" id="searchLog" placeholder="搜索日志">
			</div>
		</div>
		<div class="Mod_ireve tab clearfix">
			<a class="pull_left line_tab" id="consult_tab">
				<div class="sub">0</div>
				<div class="sub_font">已提交</div>
			</a>
			<a class="pull_right" id="comment_tab">
				<div class="no_sub"></div>
				<div>未提交</div>
			</a>
		</div>
		<ul class="mui-table-view list" id="list">
		   <!--<li class="mui-table-view-cell">
		    	<h4><span class="spot"></span><span>丁祖海</span><span class="spac_left">日报</span><span class="spac_left">信息部</span></h4>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    	</div>
		    </li>
		     <li class="mui-table-view-cell">
		    	<h4><span>丁祖海</span><span class="spac_left">日报</span><span class="spac_left">信息部</span></h4>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    	</div>
		    </li>
		     <li class="mui-table-view-cell">
		    	<h4><span class="spot"></span><span>丁祖海</span><span class="spac_left">日报</span><span class="spac_left">信息部</span></h4>
		    </li>-->
		    
		    <!--<li class="mui-table-view-cell">
		    	<h4>工作日报</h4>
		    	<p>今日工作，市场推广计划实施有以下几个问题</p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">点评：6</span>
		    		<span class="consult">查阅：10</span>

		    	</div>
		    </li>
		    <li class="mui-table-view-cell li_sub" did="46267">
		    	<h4><span class="spot"></span><span class="tit_nane">2018-01-03 星期三工作日报&nbsp;侯玲燕&nbsp;电商技术开发部</span></h4>
		    	<p>工作日志内容</p>
		    	<div class="bt_dir">
		    		<span class="time">2018-01-03</span>
		    		<span class="comment">点评：0</span>
		    		<span class="consult">查阅：2</span>
	    		</div>
    		</li>-->
		</ul>
	</div>
	<footer class="mui-bar-footer" id="">
		<nav class="mui-bar mui-bar-tab mui-btn-nav" data-role="footer">
			<button class="mui-btn mui-btn-block mui-btn-mini mui-btn-primary" style="border: 1px solid #649be3;background-color: #649be3;" id="read">一键已阅</button>
		</nav>
	</footer>
	<footer class="mui-bar-footer" id="footer" style="display: none;">
		<nav class="mui-bar mui-bar-tab mui-btn-nav" data-role="footer">
			<button class="mui-btn mui-btn-block mui-btn-mini mui-btn-negative" id="remind">一键提醒</button>
		</nav>
	</footer>
</body>
<script type="text/javascript">
		var str1="";
		var str2="";
		var user_list="";
		var str_list="";
		var str3 = '<li class="mui-table-view-cell">暂无数据</li>';
		function GetQueryString(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if (r != null) return unescape(r[2]); return null;
		}

			var wait=null;var closewin=null;
			// H5 plus事件处理
			function plusReady(){

				wait=plus.nativeUI.showWaiting('正在加载');
				closewin= plus.nativeUI.closeWaiting();
			}
			if(window.plus){
				plusReady();
			}else{
				document.addEventListener("plusready",plusReady,false);
			}
			function loglist(ctype,ctime){
				var data = {
						"flag":15, //查看路径
						"ftype":"loadlist",
						"ctype":ctype,
						"ctime":ctime
//						"keyword":jQuery("#searchLog").val() //搜索的内容
					};
				mui.ajax({
				   	url: 'data/data.php',
				   	type: 'get',
					data:data,
				   	dataType:'json',
				  	beforeSend: function() {
						wait;
					},
					complete: function() {
						closewin;
					},
				  	success:function(data){
				  		str1="";
						str2="";
				  		if(data.send.length>0){
				  			for(var i=0;i<data.send.length;i++){
								str_list+=data.send[i].dia_id+",";
								str1 += '<li class="mui-table-view-cell li_sum" user_id='+data.send[i].user_id+'>'+
									    	'<h4><span>'+data.send[i].name+'</span><span class="spac_left">'+data.send[i].dia_type+'</span><span class="spac_left">'+data.send[i].dept+'</span></h4>'+
									    	'<div class="bt_dir">'+
									    		'<span class="time">2017-11-24</span>'+
									    	'</div>'+
									    '</li>'
				  			}
				  			jQuery("#list").html(str1);
				  		}else{
				  			jQuery("#list").html('<li class="mui-table-view-cell">暂无数据</li>');
				  		};
				  		if(data.unsend.length > 0){
				  			for(var i=0;i<data.unsend.length;i++){
								user_list+=data.unsend[i].user_id+",";
				  				str2 += '<li class="mui-table-view-cell li_sum" user_id='+data.unsend[i].user_id+'>'+
									    	'<h4><span>'+data.unsend[i].name+'</span><span class="spac_left">'+data.unsend[i].dept+'</span></h4>'+
									    '</li>'
				  			}
//					  			jQuery("#list").html(str1);
				  		};

				  	}
				});
			}
			function Prompt(data){
					mui.ajax({
					url: '/pda/diary/data/data.php',
					type: 'POST',
					data:data,
					dataType:'json',
					async: true,
					beforeSend: function() {
						wait;
					},
					complete: function() {
						closewin;
					},
					success:function(data){
						mui.toast('消息已发送',{ duration:'200', type:'div' });
					}
			});
				
			}
	    	(function($, doc) {
	    		mui.init();
	    		window.onload=function(){
	    			mui.plusReady(function(){
	    				var self = plus.webview.currentWebview();
                		var dia_id = self.dia_id;
                		alert(dia_id);
                plus.nativeUI.closeWaiting();
                mui.currentWebview.show();
	    			});
	    		};
	    		mui("#list").on("tap",".li_sum",function(){
	    			jQuery(".tab").hide();
	    			jQuery("footer").hide();
					var user_id = this.getAttribute("user_id");
					var data = {
						"flag":24, //查看路径
						"user_id":user_id
					};
					mui.ajax({
					   	url: 'data/data.php',
					   	type: 'get',
						data:data,
					   	dataType:'json',
					  	beforeSend: function() {
							wait;
						},
						complete: function() {
							closewin;
						},
					  	success:function(data){
							strsum="";
					  		if(data.length>0){
					  			for(var i=0;i<data.length;i++){
					  				if(data[i].READ == 0){
					  					strsum += '<li class="mui-table-view-cell li_sub" did="'+data[i].DIA_ID+'">'+
										    	'<h4><span class="spot"></span><span class="tit_nane">'+data[i].DIA_TYPE+':&nbsp;'+data[i].USER_NAME+'&nbsp;'+data[i].DEPT_NAME+'</span></h4>'+
										    	'<p>'+data[i].CONTENT+'</p>'+
										    	'<div class="bt_dir">'+
										    		'<span class="time">'+data[i].DIA_DATE+'</span>'+
										    		'<span class="comment">点评：'+data[i].COMMENT+'</span>'+
										    		'<span class="consult">查阅：'+data[i].CONSULT+'</span>'+
									    		'</div>'+
								    		'</li>'
					  				}else{
					  					strsum += '<li class="mui-table-view-cell li_sub" did="'+data[i].DIA_ID+'">'+
											    	'<h4><span class="tit_nane">'+data[i].DIA_TYPE+':&nbsp;'+data[i].USER_NAME+'&nbsp;'+data[i].DEPT_NAME+'</span></h4>'+
											    	'<p>'+data[i].CONTENT+'</p>'+
											    	'<div class="bt_dir">'+
											    		'<span class="time">'+data[i].DIA_DATE+'</span>'+
											    		'<span class="comment">点评：'+data[i].COMMENT+'</span>'+
											    		'<span class="consult">查阅：'+data[i].CONSULT+'</span>'+
										    		'</div>'+
									    		'</li>'
						  				}
					  			}
					  			
					  			jQuery("#list").html(strsum);
					  		}else{
					  			jQuery("#list").html('<li class="mui-table-view-cell">暂无数据</li>');
					  		};
					  	}
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
	    	})(mui, document);
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
</script>
<script>
	jQuery(function(){
		ctype = GetQueryString("ctype"); //括号里放地址栏传参变量
		sub = GetQueryString("sub"); //括号里放地址栏传参变量
		unsub = GetQueryString("unsub"); //括号里放地址栏传参变量
		ctime = GetQueryString("ctime"); //括号里放地址栏传参变量
		if(ctime==null){
			ctime=""
		};
		$(".sub").html(sub);
		$(".no_sub").html(unsub);
		loglist(ctype,ctime);
		/*已提交*/
		mui(".tab").on('tap','#consult_tab',function(){
			jQuery("#footer").css("display","none");
			$(this).addClass("line_tab").siblings().removeClass("line_tab");
			if(str1 != ""){
				jQuery("#list").html(str1);
			}else{
				jQuery("#list").html(str3);
			}
		})
		//未提交
		mui(".tab").on('tap','#comment_tab',function(){
			jQuery("#footer").css("display","block");
			$(this).addClass("line_tab").siblings().removeClass("line_tab");
			if(str2 != ""){
				jQuery("#list").html(str2);
			}else{
				jQuery("#list").html(str3);
			}


		});
		mui("footer").on('tap','#remind',function(){
			if(user_list != ""){
				var data = {
					flag:17,
					uncommit:user_list,
				};
				Prompt(data)
			}else{
				mui.toast('暂无数据',{ duration:'200', type:'div' });
			}
					
		});
		mui("footer").on('tap','#read',function(){
			if(str_list != ""){
				var data = {
						flag:19,
						str:str_list,
					};
				Prompt(data)
			}else{
				mui.toast('暂无数据',{ duration:'200', type:'div' });
			}
		});





	})

</script>
</html>
