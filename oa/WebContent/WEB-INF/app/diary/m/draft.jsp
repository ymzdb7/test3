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
		<title></title>
		 <script src="/static/js/jquery-1.10.2/jquery.min.js"></script>
	    <!--<script src="/static/js/jweixin-1.2.3.js"></script>-->
	    <script src="/static/js/weui.min.js"></script>
	    <!--<script src="https://res.wx.qq.com/open/libs/weuijs/1.0.0/weui.min.js"></script>-->
	    <script src="/static/pack/mobile/js/mui.min.js"></script>
	     <script src="/static/pack/mobile/js/mui.picker.min.js"></script>
	   	<script src="/static/pack/mobile/js/vue.min.js"></script>
	   	<script src="https://cdn.bootcss.com/zepto/1.1.6/zepto.min.js"></script>
	   	<link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/0.3.0/weui.css" />
	   <link href="/static/pack/mobile/style/mui.min.css" rel="stylesheet">
	   	 <link href="/static/pack/mobile/style/mui.picker.min.css" rel="stylesheet">
	   	<link rel="stylesheet" href="/static/pack/mobile/style/diary_base.css" />
		<!--<link rel="stylesheet" href="/static/pack/mobile/style/weui.min.css" />-->
	   	<link rel="stylesheet" href="/static/pack/mobile/style/weui-for-work.css" />
		<!--<script src="https://cdn.bootcss.com/webuploader/0.1.1/webuploader.min.js"></script>-->
		<!--引入淘宝图标-->
		<link rel="stylesheet" href="//at.alicdn.com/t/font_514260_l812l3ij7cvdkj4i.css" />
		<style>
			body{
				font-size: 16px;
			}
	    .mui-content-padded{
	    	margin: 0;
	    }
	    li.mui-table-view-cell{
	    	/*padding: 6px 15px;*/
	    }
	     .mui-btn{
	     	display: inline-block;
	     	width: 30%;
	     	margin-left: 2.5%;


	     }
	     .mui-btn-negative{
	     	padding: 4px 0;
	     }
	     .mui-input-row .mui-btn{
	     	width: 64%;
	     	padding-left: 5px;
	     }
	     .mui-area{
	     	margin-top: 10px;
	     }
	     .share .mui-card{
	     	width: calc(100% - 20px);
	     }
	    .mui-input-row .mui-btn  input#mui-share-other{

	     }
		.mui-table-view:after {
		    position: absolute;
		    right: 0;
		    bottom: 0;
		    left: 0;
		    height: 1px;
		    content: '';
		    -webkit-transform: scaleY(.5);
		    transform: scaleY(.5);
		    background-color: #f5f5f5;
		}
		.mui-table-view:before {
		    position: absolute;
		    right: 0;
		    left: 0;
		    height: 1px;
		    content: '';
		    -webkit-transform: scaleY(.5);
		    transform: scaleY(.5);
		     background-color: #f5f5f5;
		    top: -1px;
		}
		.mui-bar {
		    position: fixed;
		    z-index: 10;
		    right: 0;
		    left: 0;
		    height: 44px;
		    padding-right: 10px;
		    padding-left: 10px;
		    border-bottom: 0;
		    background-color: #f7f7f7;
		    -webkit-box-shadow: 0 0 1px #c6c6c6;
		    -webkit-backface-visibility: hidden;
		    backface-visibility: hidden;
		}
		.weui-cell__bd{
			margin-bottom:60px;
		}
		#fenxiang_logo{
			float:right;
			font-size:20px;
			color:#CECECE;
		}
		#share_list{
			width:100%;
			height:100%;
			/* background:gray; */
			position:absolute;
			top:0;
			left:0;
			z-index:999;
			display:none;
		}
		#batch_operate_list{

		}
		#cancel{
			position:absolute;

			z-index:999;
		}
		/*覆盖底部按钮边框颜色*/
		.mui-btn{
		  border-color:#d9d9d9;
		}
		.pda_attach.pda_attach_img .icon-delete{
			top: -10px;
			right: -10px;
		}
		.icon-delete{
			position: absolute;
			right: 5px;
			top: 5px;
			background: red;
			width: 20px;
			text-align: center;
			height: 20px;
			line-height: 20px !important;
			border-radius: 10px;
			font-size: 20px !important;
			color: #fff;
			z-index: 99;
		}
		.no_delete .icon-delete{
			display: none;
		}
		</style>
	</head>

	<body id="Create">
	<div class="mui-content" style="height:100%;margin-bottom: 44px;">
		<div class="mui-content-padded">
			<ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
				<li class="mui-table-view-cell mui-input-row">
					<label class="mui-tab-label mui-pull-left " style="color: #666; padding-left:0px;">日志类型</label>
					<select name="" class="typeId" id="showPicker">
                    	<option value="0" selected="">工作日报</option>
                    	<option value="1">工作周报</option>
                    	<option value="2">工作月报</option>
                    </select>
				</li>
				<li class="mui-table-view-cell mui-input-row">
					<label class="mui-tab-label mui-pull-left " style="color: #666;padding-left:0px;">日志标题</label>
					<input type="text" name="" id="diary_title" value="工作日报-0706"  class="mui-pull-right mui-popup-input" style="text-align:left;"/>
				</li>
				<li class="mui-table-view-cell mui-input-row btnTime">
					<label class="mui-tab-label mui-pull-left " style="color: #666;padding-left:0px;">选择日期</label>
					<div id="showDatePicker"></div>
				</li>
				<li class="mui-table-view-cell mui-input-row share">
					<label class="mui-tab-label mui-pull-left " style="color:#666666;padding-left:0px;">分享给</label>
					<span id="fenxiang_logo" class='iconfont icon-fenxiang' @click="jump_shareother"></span>
				    <input type="input" name=""   class="mui-btn mui-pull-right " id="mui-share-other" value=""  style="position: absolute;left: 30%;width: calc(65% - 30px); text-align:left; padding-left:16px;"/>
					<input type="hidden" name="" id="diary-share-id" value="" />
					<input type="hidden" name="pics" value="" id="picupload">
				</li>
			</ul>
			<ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
				<li class="mui-table-view-cell mui-input-row mui-area" style="padding-top: 15px;">
					<textarea class="mui-text-justify" id="diary_connect" style="min-height: 180px;border:none; padding:0 15px 10px 0;" placeholder="请填写日志内容"></textarea>
				</li>
			</ul>
			<!--附件上传-->
			<!--div class="container" style="padding-bottom:44px;">
				<div class="weui_cells_title">上传</div>
				<div class="weui_cells weui_cells_form">
					<div class="weui_cell">
						<div class="weui_cell_bd weui_cell_primary">
							<div class="weui_uploader">
								<div class="weui_uploader_hd weui_cell">
									<div class="weui_cell_bd weui_cell_primary">图片上传</div>
									<div class="weui_cell_ft js_counter">0/6</div>
								</div>
								<div class="weui_uploader_bd">
									<ul class="weui_uploader_files">
										<!-- 预览图插入到这
									</ul>
									<div class="weui_uploader_input_wrp">
										<input class="weui_uploader_input js_file" type="file"
											accept="image/jpg,image/jpeg,image/png,image/gif" multiple="">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div-->
			<div class="weui-cells weui-cells_form">
				<div class="weui-cell">
					<div class="weui-cell__bd">
						<div id="uploader" class="weui-uploader">
							<div class="weui-uploader__hd">
								<p class="weui-uploader__title" style="margin-left:0px;">图片上传</p>
								<!--div class="weui-uploader__info" id="num">0</div-->
							</div>
							<div class="weui-uploader__bd">
								<ul class="weui-uploader__files" id="uploaderFiles" >
								</ul>
								<div class="weui-uploader__input-box" onclick="upload_images(upload_sign)">
									<!--input id="uploaderInput" class="weui-uploader__input" type="file" accept="image/*" multiple="" onChange=""-->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="weui_dialog_alert" style="display: none;">
				<div class="weui_mask"></div>
				<div class="weui_dialog">
					<div class="weui_dialog_hd">
						<strong class="weui_dialog_title">警告</strong>
					</div>
					<div class="weui_dialog_bd">弹窗内容，告知当前页面信息等</div>
					<div class="weui_dialog_ft">
						<a href="javascript:;" class="weui_btn_dialog primary">确定</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer class="mui-bar-footer">
		<nav class="mui-bar mui-bar-tab mui-btn-nav" data-role="footer" style="z-index:1000">
			<button class="mui-btn mui-btn-block" onclick="diary_delete()"><img style="width:15px; margin-right:6px;margin-bottom:-2px;" src="/static/images/draftdel.png" alt=""><span style="color:#dc3434">删除</span></button>
			<button class="mui-btn mui-btn-block" onclick="diary_save()" style="color:#598fd6;"><img style="width:15px; margin-right:6px;margin-bottom:-2px;" src="/static/images/draftsave.png" alt="">保存</button>
			<button class="mui-btn mui-btn-block mui-btn-primary" onclick="diary_submit()" style="background-color:#598fd6;border: 1px solid #598fd6;">提交</button>
		</nav>
	</footer>
</body>
<script>
		mui.init({
	        //禁用mui tap监听 否则点击生日选择会弹出两次
	        gestureConfig:{
	            tap:false
	        }
	    });
	    (function($) {
            $.init();
            var result = $('#showDatePicker')[0];
            var btns = $('.btnTime');
            btns.each(function(i, btn) {
                btn.addEventListener('tap', function() {
                    var optionsJson = this.getAttribute('data-options') || '{}';
                    var options = JSON.parse(optionsJson);
                    var id = this.getAttribute('id');
                    /*
                     * 首次显示时实例化组件
                     * 示例为了简洁，将 options 放在了按钮的 dom 上
                     * 也可以直接通过代码声明 optinos 用于实例化 DtPicker
                     */
                    var picker = new $.DtPicker(options);
                    picker.show(function(rs) {
                        /*
                         * rs.value 拼合后的 value
                         * rs.text 拼合后的 text
                         * rs.y 年，可以通过 rs.y.vaue 和 rs.y.text 获取值和文本
                         * rs.m 月，用法同年
                         * rs.d 日，用法同年
                         * rs.h 时，用法同年
                         * rs.i 分（minutes 的第二个字母），用法同年
                         */
                        result.innerText = ' ' + rs.text;
                        /*
                         * 返回 false 可以阻止选择框的关闭
                         * return false;
                         */
                        /*
                         * 释放组件资源，释放后将将不能再操作组件
                         * 通常情况下，不需要示放组件，new DtPicker(options) 后，可以一直使用。
                         * 当前示例，因为内容较多，如不进行资原释放，在某些设备上会较慢。
                         * 所以每次用完便立即调用 dispose 进行释放，下次用时再创建新实例。
                         */
                        picker.dispose();
                    });
                }, false);
            });
        })(mui);
</script>
<script >
	 	var did=location.search.substr(1).split("=")[1];
        var data = {
			DIA_ID:did,
			flag:18
		};

		$.ajax({
			type:'POST',
			url:'/pda/diary/data/data.php',
			data:data,
			dataType:'json',
			success:function(data){
				$("#showPicker").find("option[value="+data[0].DIA_TYPE+"]").attr("selected",true);
				$("#diary_title").val(data[0].SUBJECT);
				$("#showDatePicker").html(data[0].DIA_DATE);
				$("#diary_connect").val(data[0].CONTENT);
				$("#diary-share-id").val(data[0].TO_ID);
				$("#mui-share-other").val(data[0].TO_NAME);

				if(data[0].FILE_INFO!=""){
					var tmpll="";
					var attach_arr_id=data[0].ATTACHMENT_ID.split(',');
					var attach_arr_name=data[0].ATTACHMENT_NAME.split(',');
					for(var i=0;i<data[0].FILE_INFO.length;i++){
						tmpll += '<li class="weui-uploader__file pda_attach pda_attach_img" style="background-image:url('+data[0].FILE_INFO[i].view+')" data-diary-id="'+data[0].DIA_ID+'" data-attach_id="'+attach_arr_id[i]+'," data-attach_name="'+attach_arr_name[i]+'," ><span class="icon-delete">×</span></li>';
					}
					jQuery("#uploaderFiles").append(tmpll);
				}
			}
		})

	//保存草稿数据
	function diary_save(){
		var diary_share=$("#diary-share-id").val();
		var save_data = {
			DIA_TYPE:$("#showPicker").val(),
			DIA_ID:did,
			SUBJECT:$("#diary_title").val(),
			CONTENT:$("#diary_connect").val(),
			DIA_DATE:$("#showDatePicker").html(),
			TO_ID:diary_share,
			flag:'18',
			mark:'E',
			ATTACHMENT_ID:id_str,
			ATTACHMENT_NAME:name_str,
		};
		$.ajax({
			type:'POST',
			url:'/pda/diary/data/data.php',
			data:save_data,
			dataType:'json',
			success:function(data){
				history.back(-1);
			}
		})
	}
	//删除草稿
	function diary_delete(){
		var delete_data = {
			DIA_TYPE:$("#showPicker").val(),
			DIA_ID:did,
			SUBJECT:$("#diary_title").val(),
			CONTENT:$("#diary_connect").val(),
			DIA_DATE:$("#showDatePicker").html(),
			flag:'18',
			mark:'D'
		};
		$.ajax({
			type:'POST',
			url:'/pda/diary/data/data.php',
			data:delete_data,
			dataType:'json',
			success:function(data){
				history.back(-1);
			}
		})
	}
	//提交草稿
	function diary_submit(){
		var diary_share=$("#diary-share-id").val();
		var submit_data = {
			DIA_TYPE:$("#showPicker").val(),
			DIA_ID:did,
			SUBJECT:$("#diary_title").val(),
			CONTENT:$("#diary_connect").val(),
			DIA_DATE:$("#showDatePicker").html(),
			TO_ID:diary_share,
			flag:'18',
			mark:'S',
			ATTACHMENT_ID:id_str,
			ATTACHMENT_NAME:name_str,
		};
		$.ajax({
			type:'POST',
			url:'/pda/diary/data/data.php',
			data:submit_data,
			dataType:'json',
			success:function(data){
				history.back(-1);
			}
		})
	}

	//图片上传
	$(function(){
		var tmpl = '<li class="weui-uploader__file" style="background-image:url(#url#)"></li>',
            $gallery = $("#gallery"), $galleryImg = $("#galleryImg"),
            $uploaderInput = $("#uploaderInput"),
            $uploaderFiles = $("#uploaderFiles")
            ;
        $uploaderInput.on("change", function(e){
            var src, url = window.URL || window.webkitURL || window.mozURL, files = e.target.files;
            for (var i = 0, len = files.length; i < len; ++i) {
                var file = files[i];

                if (url) {
                    src = url.createObjectURL(file);
                } else {
                    src = e.target.result;
                }

                $uploaderFiles.append($(tmpl.replace('#url#', src)));
            }
        });
        $uploaderFiles.on("click", "li", function(){
            $galleryImg.attr("style", this.getAttribute("style"));
            $gallery.fadeIn(100);
        });
        $gallery.on("click", function(){
            $gallery.fadeOut(100);
        });
	})
	var id_str ='';
	var name_str ='';
	var platform = "<?=$platform;?>";
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
	DIA_ID = GetQueryString("id"); //括号里放地址栏传参变量
	tMobileSDK.ready(function() {
		/* jQuery('.flex-container').click(function(){
			alert(123123123);
		}); */
		// alert(platform);
		// alert(123123123);
		window.upload_sign = function(fileinfo, is_image){
			// alert(is_image);
			if(platform == "client"){
				$.each(fileinfo, function(k, file){
					var name = file.name;
					name = name.substring(0,name.length-1);
					if(is_image){
						$("#file").append('<a href="javascript:void(0);" data-attach_id="'+file.id+'" data-attach_name="'+name+'" class="pda_attach pda_attach_img" _href="'+file.url+'" is_image="1"><img src="'+ file.url +'" /><span class="icon-delete">×</span></a>');
					}else{
						$("#file").append('<a href="javascript:void(0);" data-attach_id="'+file.id+'" data-attach_name="'+name+'" class="pda_attach" _href="'+file.url+'"><span class="fileupload_attach_name">'+name+'</span><span class="icon-delete">×</span></a>');
					}

				});
			}else if(platform == "wx"){
				// alert('wxlalal');
				var imgServerId = tMobileSDK.imgServerId.join(',');
				// alert(imgServerId);
				$.ajax({
					type: 'GET',
					url: '/pda/workflow/img_download.php',
					cache: false,
					data: {
						'ATTACHMENTS': imgServerId,
						"PLATFORM": platform
					},
					success: function(ret)
					{
						// alert(ret);
						str = '';
						var d = JSON.parse(ret);
						$.each(d, function(k, img){
							var attach_id = img.attach_id;
							var attach_name = img.attach_name;
							var attach_url = img.attach_url;
							// str += attach_id+',';
							// $("#uploaderFiles").append('<li  data-attach_id="'+attach_id+'" data-attach_name="'+attach_name+'" class="pda_attach pda_attach_img" is_image="1" _href="'+attach_url+'" width="50" height="50"><img src="'+ attach_url +'" /><span class="icon-delete">×</span></li>');<li class="weui-uploader__file" style="background-image:url(#url#)"></li>
							//$("#UPLOAD_AREA_PUBLIC").append('<a href="javascript:void(0);" data-attach_id="'+attach_id+'" data-attach_name="'+attach_name+'" class="pda_attach pda_attach_img" is_image="1" _href="'+attach_url+'"><img src="'+ attach_url +'" /><span class="icon-delete">×</span></a>');
							id_str += attach_id;
							name_str += attach_name+',';

							var tmpl = '<li class="weui-uploader__file pda_attach pda_attach_img" style="background-image:url(#url#)" data-attach_id="'+attach_id+'" data-attach_name="'+attach_name+'" ><span class="icon-delete">×</span></li>'
							// alert(tmpl);
							$("#uploaderFiles").append($(tmpl.replace('#url#', attach_url)));

						});
					}
				});
			}
		}
				window.upload_images = function(callback, $list, from)//from是会签还是附件
				{
					// alert(callback);
					// return;
					if(typeof callback != "function"){
						callback = function(){}
					}
						$list = $("#uploaderFiles");
					try{
						if(platform == "client"){
							tMobileSDK.chooseImage({
								onSuccess: function(result) {
									callback && callback(result, 'is_image');
								},
								onFail: function(err) {
								}
							});
						}else if(platform == "wx"){
							tMobileSDK.uploadImage({
								sizeType: ['compress'],
								imgList: $list,
								upErrorCb : function (){},
								upSuccessCb: function (){
									// alert('5121111');
									callback && callback();
									return;
								},
								imgTpl: ''
							})
						}

					}catch(e){
						alert(e);
					}
				}
		$('body').delegate('span.icon-delete', 'click', function(event){
			event.preventDefault();
			event.stopPropagation();
			var $this = $(this);
			var diary_id = $this.parent(".pda_attach").attr("data-diary-id");
			var id = $this.parent(".pda_attach").attr("data-attach_id");
			var name = $this.parent(".pda_attach").attr("data-attach_name");
			var delete_flag = delete_attach(id, name);
			if(delete_flag === true){
				$this.parent(".pda_attach").remove();
				//删除日志表的图片id和name
				jQuery.ajax({
					type: 'POST',
					url: 'data/data.php',
					cache: false,
					data: {
						'flag':22,
						"dia_id": diary_id,
						"attach_id": id,
						"attach_name": name
					},
					success: function(data)
					{

					}
				});
			}
			return false;
		});
		window.delete_attach = function(id, name){
			var url = '';
			var delete_flag = false;
			$.ajax({
				type: 'GET',
				url: 'delete_sign_attach.php',
				cache: false,
				async: false,
				data: {
					'ATTACHMENT_ID': id,
					'ATTACHMENT_NAME': name
				},
				success: function(d){
					if(d == '1'){
						//alert("附件删除成功");
					   delete_flag = true;
					}
				},
				error: function(e){
					//alert("附件删除失败");
					delete_flag = false;
				}
			});
			return delete_flag;
		}
	});


	var vm=new Vue({
			el:'#Create',
			data:{
				name:'Vue.js'
			},
			methods:{
				jump_shareother:function(event){
					var dia_type=jQuery("#diary_type").val();
					var diary_title=jQuery("#diary_title").val();
					var d_date=jQuery("#diary_date").html();
					var txt=$('.mui-text-justify').val();
					// alert(jQuery("#diary_date").html());
					var diary_share=jQuery("#diary-share-id").val();
					var diary_connect=jQuery("#diary_connect").val();
					// var attach_id=jQuery(".pda_attach").data('attach_id');
					// var attach_name=jQuery(".pda_attach").data('attach_name');
					if(dia_type == "" && diary_title == "" && d_date == "" && diary_share == "" && diary_connect == ""){
						mui.toast("您还没有输入任何内容！");
					}else{
						// alert(111111);
						window.location = '/pda/diary/depart_list.php?DIA_ID='+did;

					}


				},
				jump_share:function(event){

					var r=document.getElementsByName("checkbox1");
			    	var to_id='',to_name='';
				    for(var i=0;i<r.length;i++){
				         if(r[i].checked){
				         to_id+=r[i].value+",";
				         to_name+=r[i].previousSibling.firstChild.innerHTML+",";
				       }
				    }
				     jQuery("#diary-share-id").val(to_id);
		  			jQuery("#mui-share-other").val(to_name);
				    jQuery("#main").css("display","block");
					jQuery("#share").css("display","none");

				}
			}
		});

</script>

</html>
