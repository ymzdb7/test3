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
    <title>待阅</title>
    <script src="/static/js/jquery-1.10.2/jquery.min.js"></script>
    <script src="/static/pack/mobile/js/mui.min.js"></script>
     <script src="/static/pack/mobile/js/vue.min.js"></script>
    <link href="/static/pack/mobile/style/mui.min.css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="/static/pack/mobile/style/iStarted.css">
   	<link rel="stylesheet" href="/static/pack/mobile/style/diary_base.css" />
   	<style>
   		body {
   			background-color: #fff;
   		}
   		.mui-segmented-control .mui-control-item {
		    line-height: 32px;
		}
		.mui-table-view-cell {
		    padding: 7px 15px;
		    background: #fff;
		}
		.mui-segmented-control .mui-control-item.mui-active {
		    background-color: #598FD6;
		}
		.mui-segmented-control {
		    border: 1px solid #598FD6;
		}
   		
   	</style>
    <script type="text/javascript" charset="utf-8">
      	mui.init();
    </script>
</head>
<body id="share">
	<div class="mui-content">
		<div class="stat_sear">
			<!--<div class="started_me">分享我的</div>-->
			<div class="mui-input-row mui-search diarySearch">
				<input type="search" class="mui-input-clear" id="searchLog" placeholder="搜索日志">
			</div>
		</div>
		<ul class="mui-table-view list" id="list">
		    <!--<li class="mui-table-view-cell">
		    	<h4>工作日报<span class="spot"></span></h4>
		    	<p>今日工作，市场推广计划实施有以下几个问题,例如</p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">点评：6</span>
		    		<span class="consult">查阅：10</span>
		    		
		    	</div>
		    </li>
		    <li class="mui-table-view-cell">
		    	<h4>工作日报<span class="spot"></span></h4>
		    	<p>今日工作，市场推广计划实施有以下几个问题</p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">点评：6</span>
		    		<span class="consult">查阅：10</span>
		    		
		    	</div>
		    </li>
		    <li class="mui-table-view-cell">
		    	<h4>工作日报<span class="spot"></span></h4>
		    	<p>今日工作，市场推广计划实施有以下几个问题</p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">点评：6</span>
		    		<span class="consult">查阅：10</span>
		    		
		    	</div>
		    </li>-->
		</ul>
		
		
		
		
	</div>
</body>
<script type="text/javascript">	  
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
	function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null) return unescape(r[2]); return null;
	}
	dia_id = GetQueryString("dia_id"); //括号里放地址栏传参变量
	function loglist(){
		var data = {
				"flag":14, //查看路径
				"str":dia_id,
//				"keyword":jQuery("#searchLog").val() //搜索的内容
			};
		mui.ajax({
		   	url: 'data/data.php',
		   	type: 'POST',
			data:data,
		   	dataType:'json',
		  	beforeSend: function() {
				wait;
			},
			complete: function() { 
				closewin;
			},
		  	success:function(data){
				 
				//   console.log(data)
		  		var li_inner='';
		  		if(data.data.length>0){
		  			for(var i=0;i<data.data.length;i++){
		  				if(data.data[i].READ_FLAG == 0){
		  					li_inner+='<li class="mui-table-view-cell" did="'+data.data[i].DIA_ID+'"><h4 user_id="'+data.data[i].USER_ID+'"><span class="tit_nane">'+data.data[i].SUBJECT+'<span style="padding:0 0 0 10px;color: #207BD6;">'+data.data[i].NAME+'</span><span style="padding:0 0 0 10px;color: #207BD6;">'+data.data[i].DEPT+'</span></span><span class="spot"></span></h4><p>'+data.data[i].CONTENT+'</p><div class="bt_dir"><span class="time">'+data.data[i].DIA_DATE+'</span><span class="comment">点评：'+data.data[i].COMMENT+'</span><span class="consult">查阅：'+data.data[i].CONSULT+'</span></div></li>';
		  				}else{
		  					li_inner+='<li class="mui-table-view-cell" did="'+data.data[i].DIA_ID+'"><h4 user_id="'+data.data[i].USER_ID+'")><span class="tit_nane">'+data.data[i].SUBJECT+'<span style="padding:0 0 0 10px;color: #207BD6;">'+data.data[i].NAME+'</span><span style="padding:0 0 0 10px;color: #207BD6;">'+data.data[i].DEPT+'</span></span></h4><p>'+data.data[i].CONTENT+'</p><div class="bt_dir"><span class="time">'+data.data[i].DIA_DATE+'</span><span class="comment">点评：'+data.data[i].COMMENT+'</span><span class="consult">查阅：'+data.data[i].CONSULT+'</span></div></li>';
		  				}
					  }
					//   var dt=data.data[i].USER_ID
		  			jQuery("#list").html(li_inner);
		  		}else{
		  			jQuery("#list").html('<li class="mui-table-view-cell">暂无数据</li>');
		  		}
		  	}
		});
	}
	function list(me){
		var data = {
				"flag":12, //查看路径
				'user_id':me,
				'type':'lower'				
			};
		mui.ajax({
		   	url: 'data/data.php',
		   	type: 'POST',
			data:data,
		   	dataType:'json',
		  	beforeSend: function() {
				wait;
			},
			complete: function() { 
				closewin;
			},
		  	success:function(data){
				  console.log(data);
		  		var li_inner='';
		  		if(data.data.length>0){
		  			for(var i=0;i<data.data.length;i++){
		  				if(data.data[i].READ_FLAG == 0){
		  					li_inner+='<li  class="mui-table-view-cell" did="'+data.data[i].DIA_ID+'"><h4><span class="tit_nane">'+data.data[i].SUBJECT+'<span style="padding:0 0 0 10px">'+data.data[i].NAME+'</span><span style="padding:0 0 0 10px">'+data.data[i].DEPT+'</span></span><span class="spot"></span></h4><p>'+data.data[i].CONTENT+'</p><div class="bt_dir"><span class="time">'+data.data[i].DIA_DATE+'</span><span class="comment">点评：'+data.data[i].COMMENT+'</span><span class="consult">查阅：'+data.data[i].CONSULT+'</span></div></li>';
		  				}else{
		  					li_inner+='<li class="mui-table-view-cell" did="'+data.data[i].DIA_ID+'"><h4><span class="tit_nane">'+data.data[i].SUBJECT+'<span style="padding:0 0 0 10px">'+data.data[i].NAME+'</span><span style="padding:0 0 0 10px">'+data.data[i].DEPT+'</span></span></h4><p>'+data.data[i].CONTENT+'</p><div class="bt_dir"><span class="time">'+data.data[i].DIA_DATE+'</span><span class="comment">点评：'+data.data[i].COMMENT+'</span><span class="consult">查阅：'+data.data[i].CONSULT+'</span></div></li>';
		  				}
		  			}
		  			jQuery("#list").html(li_inner);
		  		}else{
		  			jQuery("#list").html('<li class="mui-table-view-cell">暂无数据</li>');
		  		}
		  	}
		});
		// console.log(jQuery(".tit_nane"));
		// jQuery(".tit_nane").css('background','red')
	}

	(function($, doc) {    		
		mui.init();
		loglist();
				
		mui("#list").on("tap","li",function(e){
			var did = this.getAttribute("did");	
			e.preventDefault();			
			//打开详情
			mui.openWindow({
				id:'consult.php',
				url:'consult.php?id='+did
			});
		});
		mui("#list").on("tap","h4",function(e){
			// console.log($(this))
			var a=jQuery(this).attr('user_id');
			// console.log(a);
				list(a);
				return false;
			});
	})(mui, document);  
	//搜索功能
	var u=navigator.userAgent;
	if(!!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/)){
		//获取IOS  eid
		jQuery("#searchLog").blur(function(){
//			loglist();			
		})	
	}else if(u.indexOf("Android")>-1||u.indexOf("Linux")>-1){
		//获取安卓  eid
		document.getElementById("searchLog").addEventListener("keydown",function(e){ 
	        if(13 == e.keyCode){ //点击了“搜索”  
//	        	loglist();
	           document.activeElement.blur();//隐藏软键盘 	
	        } 
	    },false);	
	}	 
	    	
</script>
</html>