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
    <title>草稿</title>
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
		/*.mui-content{
			margin-top:50px;
		}*/
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
	<!--<header class="mui-bar mui-bar-nav">
	    <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left mui-nav-btn"></a>
	    <h1 class="mui-title">锟斤拷锟斤拷锟斤拷志</h1>
	    <a id="info" class="mui-icon mui-icon-more-filled mui-pull-right mui-nav-btn"></a>
	</header>-->
	<div class="mui-content">
		<div class="stat_sear">
			<!--<header class="mui-bar mui-bar-nav">
	           <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left mui-nav-btn"></a>
	           <h1 class="mui-title">草稿</h1>
	        </header>-->
			<div class="mui-input-row mui-search diarySearch">
				<input type="search" class="mui-input-clear" id="searchLog" placeholder="搜索">
			</div>
		</div>
		<ul class="mui-table-view list" id="list">
		    <!--<li class="mui-table-view-cell">
		    	<h4><span class="spot"></span></h4>
		    	<p></p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">1</span>
		    		<span class="consult">2</span>
		    	</div>
		    </li>
		    <li class="mui-table-view-cell">
		    	<h4><span class="spot"></span></h4>
		    	<p></p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">锟斤拷锟斤拷锟斤拷6</span>
		    		<span class="consult">锟斤拷锟侥ｏ拷10</span>

		    	</div>
		    </li>
		    <li class="mui-table-view-cell">
		    	<h4>锟斤拷锟斤拷锟秸憋拷<span class="spot"></span></h4>
		    	<p>锟斤拷锟秸癸拷锟斤拷锟斤拷锟叫筹拷锟狡癸拷苹锟绞凳╋拷锟斤拷锟斤拷录锟斤拷锟斤拷锟斤拷锟?/p>
		    	<div class="bt_dir">
		    		<span class="time">2017-11-24</span>
		    		<span class="comment">锟斤拷锟斤拷锟斤拷6</span>
		    		<span class="consult">锟斤拷锟侥ｏ拷10</span>

		    	</div>
		    </li>-->
		</ul>




	</div>
</body>
<script type="text/javascript">
			var wait=null;var closewin=null;
			// H5 plus锟铰硷拷锟斤拷锟斤拷
			function plusReady(){
				wait=plus.nativeUI.showWaiting('锟斤拷锟节硷拷锟斤拷');
				closewin= plus.nativeUI.closeWaiting();
			}
			if(window.plus){
				plusReady();
			}else{
				document.addEventListener("plusready",plusReady,false);
			}
			function loglist(){
				var data = {
						"flag":13, //锟介看路锟斤拷
						"ftype":"refresh",
						"keyword":jQuery("#searchLog").val() //锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
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
				  		//console.log(data);
				  		var li_inner='';
				  		if(data.length>0){
				  			for(var i=0;i<data.length;i++){
				  				if(data[i].READ_FLAG == 0){
				  					li_inner+='<li class="mui-table-view-cell" did="'+data[i].DIA_ID+'">'+
				  									'<h4><span class="tit_nane">'+data[i].SUBJECT+'</span><span class="spot"></span></h4>'+
				  									'<p class="content_a">'+data[i].CONTENT+'</p>'+
				  									'<div class="bt_dir">'+
				  										'<span class="time">'+data[i].DIA_DATE+'</span>'+
			  										'</div>'+
		  										'</li>';
				  				}else{
				  					li_inner+='<li class="mui-table-view-cell" did="'+data[i].DIA_ID+'">'+
				  									'<h4><span class="tit_nane">'+data[i].SUBJECT+'</span></h4>'+
				  									'<p>'+data[i].CONTENT+'</p>'+
				  									'<div class="bt_dir">'+
				  										'<span class="time">'+data[i].DIA_DATE+'</span>'+
			  										'</div>'+
		  										'</li>';
				  				}
				  			}
				  			jQuery("#list").html(li_inner);
				  		}else{
				  			jQuery("#list").html('<li class="mui-table-view-cell">无数据</li>');
				  		}
				  	}
				});
			}
	    	(function($, doc) {
	    		mui.init();
	    		loglist();
				mui("#list").on("tap","li",function(){
					var did = this.getAttribute("did");
					//锟斤拷锟斤拷锟斤拷
					mui.openWindow({
						id:'draft.php',
						url:'draft.php?id='+did
					});
					//alert(did);

				});
	    	})(mui, document);
	   /*
		 	//锟斤拷锟斤拷锟斤拷锟斤拷
			var u=navigator.userAgent;
			if(!!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/)){
				//锟斤拷取IOS  eid
				jQuery("#searchLog").blur(function(){
					loglist();
				})
			}else if(u.indexOf("Android")>-1||u.indexOf("Linux")>-1){
				//锟斤拷取锟斤拷卓  eid
				document.getElementById("searchLog").addEventListener("keydown",function(e){
			        if(13 == e.keyCode){ //锟斤拷锟斤拷恕锟斤拷锟斤拷锟斤拷锟?
			        	loglist();
			           document.activeElement.blur();//锟斤拷锟斤拷锟斤拷锟斤拷锟?
			        }
			    },false);
			}	*/
	    </script>
</html>
