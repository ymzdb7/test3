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
	<head>
		<meta charset="UTF-8">
		<title><fmt:message code="email.title.waitmail" /></title><!-- 写邮件 -->
		<meta name="renderer" content="webkit">
	    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<link rel="stylesheet" type="text/css" href="/css/email/writeMail.css"/>
		<script src="/js/common/language.js"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
		<script src="/js/base/base.js" type="text/javascript" charset="utf-8"></script>
		<script src="/js/email/writeMail.js" type="text/javascript" charset="utf-8"></script>
		<script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jquery.form.min.js"></script>
		<script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
		<style>
			.files a{text-decoration: none;}
			a{
				text-decoration: none;
				color: #207BD6;
				cursor: pointer;
			}
			#attention{
				margin: 0;
				padding:0;
				list-style: none;
				width:100px;
				position: absolute;
				left: 10px;
				text-align: center;
				display: none;
				z-index: 9999;
				border:#ccc 1px solid;
				top:20px;
			}
			#attention li{
				background: #ffffff;
				cursor:pointer;
				line-height: 22px;
			}
			#attention li:hover{
				background-color: #6ea1d5;
				color: #fff;
			}
			.choose{
				width: 180px;
				position: absolute;
				left: 145px;
				top: 0px;
			}
		</style>
	</head>
	<body>
		<table class="TABLE" border="1" cellspacing="0" cellpadding="0" style="border-collapse: collapse;margin-bottom: 20px;margin-top: 30px">
			<tr class="append_tr">
				<td width="15%" style="padding-left: 10px;"><fmt:message code="email.th.recipients" />：</td>
				<td width="85%">
					<div class="inPole">
						<textarea name="txt" id="senduser" user_id='' style="min-width: 70%;" value="admin" disabled></textarea>
						<span class="add_img" style="margin-left: 10px">
							<a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a>
						</span>
						<span class="add_img">
							<a href="javascript:;" class="clear"><fmt:message code="notice.th.delete1" /></a>
						</span>
					</div>
					<div class="addPepl">
						<%--<a href="javascript:;" class="a3">添加外部收件人</a>--%>
						<a href="javascript:;" class="a1"><fmt:message code="email.th.addwait" /></a>
						<a href="javascript:;" class="a2"><fmt:message code="email.th.addbcc" /></a>
						<div class="choose">
								<a href="javascript:;" class="show"><fmt:message code="email.th.add" /></a>
								<%--<button style="margin-left:3px;cursor:pointer;">请点击选择</button>--%>
								<ul id="attention" >
									<%--<li>张三</li>--%>
									<%--<li>李四</li>--%>
									<%--<li>王麻子</li>--%>
								</ul>
							</div>
						<!-- <a href="javascript:;" class="a3">最近联系人&nbsp;</a> -->
						<!-- <span class="day">
							<ul>
								<li>系统管理员</li>
								<li>王德</li>
								<li>王云</li>
							</ul>
						</span> -->
					</div>
				</td>
			</tr>
			<tr>
				<td width="15%" style="padding-left: 10px;"><fmt:message code="email.th.major" />：</td>
				<td width="85%">
					<input type="text" id="txt" value="" style="width: 70%;" class="input_txt" />
					<!-- <span class="import">一般邮件</span> -->
				</td>
			</tr>
			<tr>
				<td width="15%" style="padding-left: 10px;">
					<p><fmt:message code="email.th.content" />：</p>
					<!-- <p class="Color"><fmt:message code="email.th.countnumber" />：<span>0</span></p> -->
					<p class="Color"><a href="javascript:;" onclick="empty()"><fmt:message code="global.lang.empty" /></a></p>
				</td>
				<td width="85%">
					<div id="container" style="width: 99.9%;min-height: 300px;" name="content" type="text/plain"></div>
				</td>
			</tr>
			<tr class="Attachment" style="width:100%; padding-left: 10px;">
				<td width="15%"><fmt:message code="email.th.filechose" />：</td>
				<td width="85%"   class="files" id="files_txt"></td>
			</tr>
			<tr>
				<td width="15%" style="padding-left: 10px;"><fmt:message code="email.th.file" />：</td>
				<td width="85%" class="files" style="position: relative">
					<!-- <fmt:message code="email.th.addfile" /> -->
					<form id="uploadimgform" target="uploadiframe"  action="/upload?module=email"  method="post" >
						<input type="file" multiple="multiple" name="file"  id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
						<a href="#" id="uploadimg"><img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
					</form>
				</td>
			</tr>
			<tr>
				<td width="15%" style="padding-left: 10px;"><fmt:message code="sms.th.remind" />：</td>
				<td width="85%" class="remind">
					<div class="news_t">
						<input type="checkbox" name="remind" class="remindCheck" value="0" checked>
						<fmt:message code="notice.th.remindermessage" />&nbsp;
						<input type="checkbox" name="smsDefault" class="smsDefault" value="1" >
						<span><fmt:message code="vote.th.UseRemind" /></span>
					</div>

				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div class="div_btn">
						<div class="sureBtn"><span style="margin-left: 30px;"><fmt:message code="email.th.transmitimmediate" /></span></div>
                    	<div class="saveBtn"><span style="margin-left: 33px;"><fmt:message code="email.th.savedraftbox" /></span></div>

					</div>
				</td>
			</tr>
		</table>

		<script type="text/javascript">
			$(function () {
				$('table').width($(document).width()-100);
                var userId=$.getQueryString('userId');
                var userName=$.getQueryString('userName');
				if(userId != null || userName!= null){
					$('#senduser').attr('user_id',userId+',');
					$('#senduser').attr('username',decodeURI(userName)+',');
					$('#senduser').val(decodeURI(userName)+',');
				}else{
                    $('#senduser').attr('user_id','');
                    $('#senduser').attr('username','');
                    $('#senduser').val('');
				}
            })

            $('#uploadinputimg').fileupload({
				dataType:'json',
                done: function (e, data) {
                    if(data.result.obj != ''){
                        var data = data.result.obj;
                        var str = '';
                        var str1 = '';
                        for (var i = 0; i < data.length; i++) {
                            var gs = data[i].attachName.split('.')[1];
                            if(gs == 'jsp'||gs == 'css'||gs == 'js'||gs == 'html'||gs == 'java'||gs == 'php' ){
                                str += '';
                                layer.alert('jsp、css、js、html、java文件禁止上传!',{},function(){
                                    layer.closeAll();
                                });
							}else{
                                str += '<div class="dech" deUrl="' + encodeURI(data[i].attUrl)+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                            }
                        }
                        $('.Attachment td').eq(1).append(str);
					}else{
                        //alert('添加附件大小不能为空!');
                        layer.alert('添加附件大小不能为空!',{},function(){
                            layer.closeAll();
						});
					}
                }
            });


			var user_id='senduser';
                //获取输入框内容
       		 var ue = UE.getEditor('container',{elementPathEnabled : false});
       		 var res;

       		 $(function(){

                 $(document).delegate('.clearBCC','click',function(){
                         $('#secritText').val('');
                         $('#secritText').attr('user_id','');
                 })
                 $(document).delegate('.clearCC','click',function(){
                     $('#copeNameText').val('');
                     $('#copeNameText').attr('user_id','');

                 })
                 //选人控件
       		 	$("#selectUser").on("click",function(){
       		 		user_id='senduser';
       		 		//alert(typeof(qt));
//                    if(typeof(qt) == 'undefined'){
                        $.popWindow("../common/selectUser");
					<%--}else{--%>
                        <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                            <%--var content = channel.objects.interface;--%>
                            <%--content.xoa_sms('/common/selectUser','<fmt:message code="main.th.SelectPersonnel"/>',"web_child_url");--%>
                        <%--});--%>
					<%--}--%>
       		 	});
				 $('.TABLE').on('click','#selectUserO',function(){
					 user_id='copeNameText';
//                     if(typeof(qt) == 'undefined'){
                         $.popWindow("../common/selectUser");
                     <%--}else{--%>
                         <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                             <%--var content = channel.objects.interface;--%>
                             <%--content.xoa_sms('/common/selectUser','<fmt:message code="main.th.SelectPersonnel"/>',"web_child_url");--%>
                         <%--});--%>
                     <%--}--%>

				 })
                 $('.TABLE').on('click','#selectUserT',function(){
					 user_id='secritText';
//                     if(typeof(qt) == 'undefined'){
                         $.popWindow("../common/selectUser");
                     <%--}else{--%>
                         <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                             <%--var content = channel.objects.interface;--%>
                             <%--content.xoa_sms('/common/selectUser','<fmt:message code="main.th.SelectPersonnel"/>',"web_child_url");--%>
                         <%--});--%>
                     <%--}--%>
                 })

                 //附件删除
                 $('#files_txt').on('click','.deImgs',function(){
                     var data=$(this).parents('.dech').attr('deUrl');
                     var dome=$(this).parents('.dech');
                     deleteChatment(data,dome);
                 })

       		 	//点击立即发送按钮
       		 	$(".sureBtn").on("click",function(){
                    var remindVal=0;
                    if($('.remindCheck').is(":checked")){
                        remindVal=1;
                    }
                    var smsDefault =1;
                    if($('.smsDefault').is(":checked")){
                       smsDefault=0;
                    }
					var dataId1=$('.inPole').find('#senduser').attr('user_id');
					var dataId2=$('.tian').find('#copeNameText').attr('user_id');
					var dataId3=$('.mis').find('#secritText').attr('user_id');

					var userId=$('textarea[name="txt"]').attr('user_id');
					var txt = ue.getContentTxt();
					var html = ue.getContent();
					var val=$('#txt').val();
					var attach=$('.Attachment td').eq(1).find('a');
					var aId='';
					var uId='';
					for(var i=0;i<$('.Attachment td .inHidden').length;i++){
						aId += $('.Attachment td .inHidden').eq(i).val();
					}
					for(var i=0;i<$('.Attachment td .inHidden').length;i++){
						uId += attach.eq(i).attr('NAME');
					}
                    if(val == ''){
                        val='<fmt:message code="email.th.noSubject" />';/*无主题*/
                    }
                    if($.trim(val).length == 0){
                        val='<fmt:message code="email.th.noSubject" />';/*无主题*/
					}
					var data={
					 	'toId2': dataId1,
						'copyToId':dataId2,
						'secretToId':dataId3,
						'subject':val,
						'content':html,
						'attachmentId':aId,
						'attachmentName':uId,
						 remind:remindVal,//事务提醒
                        smsDefault:smsDefault //手机提醒
					};
					if(data.toId2=='' || data.subject=='' || data.content==''){
						layer.msg('<fmt:message code="email.th.recipientTopicsContent" />',{ icon:6});/*请输入收件人、主题和内容*/
						return;
					}
					layer.load(0,{shade:[0.2, '#ffffff']});
					$.ajax({
						 type:'post',    
						 url:'sendEmail',
						 dataType:'json',
						 data:data,
						 success:function(rsp){
							 if(rsp.flag == true){
                                 $.layerMsg({content:'<fmt:message code="global.lang.send" />！',icon:1},function(){
                                     if(userId != null || userName!= null){
                                         window.close();
									 }
                                     parent.location.reload();
								 });
							 }else{
                                 $.layerMsg({content:'<fmt:message code="global.lang.err" />！',icon:2},function(){

								 });
							 }
//							 layer.closeAll();
						}
					});
				});
				
				//点击保存到草稿箱按钮
				$(".saveBtn").on("click",function(){
                    var dataId1=$('.inPole').find('#senduser').attr('user_id');
                    var dataId2=$('.tian').find('#copeNameText').attr('user_id');
                    var dataId3=$('.mis').find('#secritText').attr('user_id');
					var userId=$('textarea[name="txt"]').attr('user_id');
					var txt = ue.getContentTxt();
					var html = ue.getContent();
					var val=$('#txt').val();
					var attach=$('.Attachment td').eq(1).find('a');
					var aId='';
					var uId='';
					for(var i=0;i<$('.Attachment td .inHidden').length;i++){
						aId += $('.Attachment td .inHidden').eq(i).val();
					}
					for(var i=0;i<$('.Attachment td .inHidden').length;i++){
						uId += attach.eq(i).attr('NAME');
					}
					if(dataId1 == '' && html == '' && val == '' && aId == '' && uId == ''){
                        val='<fmt:message code="email.th.noSubject" />';/*无主题*/
					}

					var data={
                        'toId2': dataId1,
                        'copyToId':dataId2,
                        'secretToId':dataId3,
						'subject':val,
						'content':html,
						'attachmentId':aId,
						'attachmentName':uId
					};
					$.ajax({
						 type:'post',    
						 url:'saveEmail',
						 dataType:'json',
						 data:data,
						 success:function(){
                             $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                                 parent.location.reload();
							 });
						}
					});
				});

                 //删除附件
                 function deleteChatment(data,element){

                     layer.confirm('<fmt:message code="workflow.th.que" />？', {
                         btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                         title:"<fmt:message code="notice.th.DeleteAttachment" />"
                     }, function(){
                         //确定删除，调接口
                         $.ajax({
                             type:'get',
                             url:'../delete',
                             dataType:'json',
                             data:data,
                             success:function(res){

                                 if(res.flag == true){
                                     layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
//                                     var file = $('[name="file"]')
//                                     file.after(file.clone().val(""));
//                                     file.remove();
                                     element.remove();
                                 }else{
                                     layer.msg('<fmt:message code="lang.th.deleSucess" />', { icon:6});
                                 }
                             }
                         });

                     }, function(){
                         layer.closeAll();
                     });
                 }
				 
       		 });

       		//清空UE内容
       		function empty(){
       			ue.setContent('');
       		}
       		$(function(){
                //添加常联系人员
                $('.choose ').click(function (e){
//                    $("#attention").show();
                    e.stopPropagation();
                    $("#attention").toggle();
                    $.ajax({
                        type:'post',
                        url:'/contactPerson/serchContactPerson',
                        dataType:'json',
                        success:function(json){
                            var arr=json.obj;
                            var str='';
                            for(var i=0;i<arr.length;i++){
                                str+='<li dataid="'+arr[i].uid+'" user_id="'+arr[i].userId+'">'+arr[i].userName+'</li>';
                            }
                            $('#attention').html(str);
                        }
                    });
                });
                var userName=[];
                var userIds=[];
                $('#attention').on('click','li',function(){
                    var uName=$(this).text();
                    var uId=$(this).attr('user_id');
                    userName.push(uName);
                    userIds.push(uId);
                    function unique(arr){
                        var res =[];
                        var json = {};
                        for(var i=0;i<arr.length;i++){
                            if(!json[arr[i]]){
                                res.push(arr[i]);
                                json[arr[i]] = 1;
                            }
                        }
                        return res;
                    }
                    var d = unique(userName);
                    var f = unique(userIds);
                    $('#senduser').val(d);
                    $('#senduser').attr('user_id',f);
                });

//                $('#attention'). mouseleave(function (){
//                    $("#attention").hide();
//                });
                $(document).click(function(){
                    if ($('#attention').css('display')=='block'){
                        $('#attention').css('display','none');
                    }
                })
			})

    	</script>
	</body>
</html>

