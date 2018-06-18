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
	<title>回复</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
	<link rel="stylesheet" type="text/css" href="../css/email/writeMail.css"/>
	<script src="/js/common/language.js"></script>
	<script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
	<script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
	<script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
	<script src="../js/email/writeMail.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
	<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
	<script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
	<script src="/lib/jquery.form.min.js"></script>
	<script src="../js/jquery/jquery.cookie.js"></script>
	<style>
		table{margin-top:10px;width: 90%;}
		table tr td{padding-left:10px;}
		.files a{text-decoration: none;}
	</style>
</head>
<body>
<table class="TABLE" border="1" cellspacing="0" cellpadding="0" style="border-collapse: collapse;">
	<tr class="append_tr">
		<td width="10%"><fmt:message code="email.th.recipients" />：</td>
		<td width="89%">
			<div class="inPole">
				<textarea name="txt" id="senduser" user_id='' value="" disabled></textarea>
				<span class="add_img" style="margin-left: 10px;">
							<%--<span class="addImg">
								<img src="../img/org_select.png" class="addIcon"/>
							</span>--%>
							<a href="javascript:;" id="selectUser" class="Add"><fmt:message code="global.lang.add" /></a>
						</span>
				<span class="add_img">
							<%--<span class="addImg">
								<img src="../img/org_select2.png" class="clearIcon"/>
							</span>--%>
							<a href="javascript:;" class="clear"><fmt:message code="notice.th.delete1" /></a>
						</span>
				<!--<input type="checkbox" name="check" id="check" value="向此人发送外部邮件" />
                <span>向此人发送外部邮件</span>-->
			</div>
			<div class="addPepl">
				<%--<a href="javascript:;" class="a3">添加外部收件人</a>--%>
				<a href="javascript:;" class="a1"><fmt:message code="email.th.addwait" /></a>
				<a href="javascript:;" class="a2"><fmt:message code="email.th.addbcc" /></a>
			</div>
		</td>
	</tr>
	<tr>
		<td><fmt:message code="email.th.major" />：</td>
		<td>
			<input type="text" id="txt" value="" class="input_txt" />
		</td>
	</tr>
	<tr>
		<td width="10%">
			<p><fmt:message code="email.th.content" />：</p>
			<!-- <p class="Color"><fmt:message code="email.th.countnumber" />：<span>0</span></p> -->
			<!-- <p class="Color"><fmt:message code="global.lang.empty" /></p> -->
		</td>
		<td width="89%">
			<div id="container" style="width: 99.9%;min-height: 300px;" name="content" type="text/plain"></div>
		</td>
	</tr>
	<tr class="Attachment" style="width:100%;">
		<td width="10%"><fmt:message code="email.th.file" />：</td>
		<td width="89%" class="files" id="files_txt"></td>
	</tr>
	<tr>
		<td><fmt:message code="email.th.filechose" />：</td>
		<td class="files">

			<form id="uploadimgform" target="uploadiframe"  action="../upload?module=email" enctype="multipart/form-data" method="post"  onsubmit="document.charset='UTF-8';">
				<input type="file" multiple="multiple" name="file"  id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
				<a href="javascript:;" id="uploadimg"><img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
			</form>

		</td>
	</tr>
	<tr>
		<td><fmt:message code="sms.th.remind" />：</td>
		<td class="remind">
			<div class="news_t">
				<input type="checkbox" name="remind" class="remindCheck" value="0" checked>
				<fmt:message code="notice.th.remindermessage" />
			</div>
			<%--  <div class="news_two">
                  <input type="checkbox" name="remind" ><h1><fmt:message code="notice.th.share"/></h1>
              </div>--%>
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
    var ue = UE.getEditor('container');
    var user_id='senduser';
    var userName=$.cookie('userName');
    var userId=$.cookie('userId');

    //获取输入框内容
    $(function () {

        $("#selectUser").on("click",function(){
            user_id='senduser';
            $.popWindow("../common/selectUser");
        });
        $('.TABLE').on('click','#selectUserO',function(){
            user_id='copeNameText';
            $.popWindow("../common/selectUser");
        })
        $('.TABLE').on('click','#selectUserT',function(){
            user_id='secritText';
            $.popWindow("../common/selectUser");
        })
        //获取地址栏参数
        var sId=$.getQueryString('sId');  //emailId
        var nId=$.getQueryString('nId');  //bodyId
        var TYPE=$.getQueryString('type');
        var boxType=$.getQueryString('boxType');  //邮箱类型
        ue.ready(function(){
            function dataStyle(id){  //回复内容接口
                $.ajax({
                    type:'get',
                    url:'messageEmail',
                    dataType:'html',
                    data:{'emailId':id},
                    success:function(res){
                        ue.setContent(res,false);
                    }
                })
            }
            function dataStyles(id){  //回复内容接口
                $.ajax({
                    type:'get',
                    url:'messageEmail',
                    dataType:'html',
                    data:{'bodyId':id},
                    success:function(res){
                        ue.setContent(res,false);
                    }
                })
            }
            var data1={
                'emailId':sId,
                'flag':''
            }
            if(TYPE == 0){   //回复
                document.title="<fmt:message code="email.th.reply" />";
                queryById(TYPE,data1);
                dataStyle(sId)
			}else if(TYPE == 1){   //回复全部
                document.title='<fmt:message code="email.th.replyall" />';
                queryById(TYPE,data1);
                dataStyle(sId)
			}else if(TYPE == 2){   //收件箱转发、发件箱转发
				if(boxType == 'inbox'){
                    document.title="<fmt:message code="email.th.ForwardMail" />";
                    queryById(TYPE,data1);
                    dataStyle(sId)
				}else{
                    var data2={
                        'bodyId':nId,
                        'flag':''
                    }
                    document.title="<fmt:message code="email.th.ForwardMail" />";
                    queryById(TYPE,data2);
                    dataStyles(nId)
				}
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
                            str += '<div class="dech" style="margin-top:5px;" deUrl="' + encodeURI(data[i].attUrl)+ '">' +
                                '<a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*">' +
                                '<img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a>' +
                                '<span style="color:rgba(0,0,0,0.5);font-size:12px;margin-right:5px;margin-left:4px;">('+data[i].fileSize+')</span>' +
                                '<img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/>' +
                                '<input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',">' +
                                '</div>';
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

        //附件删除
        $('#files_txt').on('click','.deImgs',function(){
            var data=$(this).parents('.dech').attr('deUrl');
            var dome=$(this).parents('.dech');
            deleteChatment(data,dome);
        })

        //点击立即发送
        $(".sureBtn").on("click",function(){
            var remindVal=0;
            if($('.remindCheck').is(":checked")){
                remindVal=1;
            }
            var dataId1=$('.inPole').find('#senduser').attr('user_id');
            var dataId2=$('.tian').find('#copeNameText').attr('user_id');
            var dataId3=$('.mis').find('#secritText').attr('user_id');
            var TYPE=$.getQueryString('type');
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
            var data={
                'flag':'1',
                'emailId':sId,
                'toId2': dataId1,
                'copyToId':dataId2,
                'secretToId':dataId3,
                'subject':val,
                'content':html,
                'attachmentId':aId,
                'attachmentName':uId,
				'remind':remindVal
            };
            $.ajax({
                type:'post',
                url:'sendMessageEmail',
                dataType:'json',
                data:data,
                success:function(){
                    if (TYPE!=2 && TYPE!=3){
                        $.layerMsg({content:'<fmt:message code="doc.th.ReplySuccessfully" />！',icon:1},function(){
                                     window.close()
                                     parent.opener.location.reload()
                        });
                    }else{
                        $.layerMsg({content:'<fmt:message code="email.th.ForwardingSuccess" />！',icon:1},function(){
                            window.close()
                            parent.opener.location.reload()
                        });
                    }
                }
            });
        })

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
            var data={
                'flag':'1',
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
                        window.close()
                        parent.opener.location.reload()
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
    })

//	status:判断是转发还是回复邮件；data:调接口所需参数传参
//	单条数据回写
	function queryById(status,data){
        $.ajax({
            type:'get',
            url:'queryByID',
            dataType:'json',
            data:data,
            success:function(rsp){
                var data2=rsp.object;
                var sendTime=new Date((data2.sendTime)*1000).Format('yyyy-MM-dd hh:mm');
                var stra='';
                var arr=data2.attachment;
                if(status == 2 || status == 3){    //邮件主题
                    $('#txt').val('Fw:'+data2.subject);
				}else if(status == 0 || status == 1){
                    $('#txt').val('Re:'+data2.subject);
				}
				if(data2.attachment.length > 0){   //附件显示
				    for(var i=0;i<arr.length;i++){
                        stra+='<div class="dech" deUrl="'+encodeURI(arr[i].attUrl)+'">' +
                            '<a href="<%=basePath %>download?'+encodeURI(arr[i].attUrl)+'" NAME="'+arr[i].attachName+'*" style="text-decoration:none;">' +
                            '<img style="margin-right:10px;" src="../img/attachment_icon.png"/>'+arr[i].attachName+'</a>' +
                            '<img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/>' +
                            '<input type="hidden" class="inHidden" value="'+arr[i].aid+'@'+arr[i].ym+'_'+arr[i].attachId+',">' +
                            '</div>';
					}
                    $('#files_txt').html(stra);
				}
				if(status == 0){
				    if(data2.copyName != ''){
                        str1='<tr class="tian">' +
                            '<td><fmt:message code="main.th.CC" />：</td>'+
                            '<td><textarea user_id="" value="" name="txt" id="copeNameText" disabled></textarea>' +
                            '<span class="add_img"><span class="addImg"></span>' +
                            '<a href="javascript:;" id="selectUserO" class="Add"><fmt:message code="global.lang.add" /></a>' +
                            '<span class="add_img">' +
                            '<span class="addImg"></span>' +
                            '<a href="javascript:;" class="clear"><fmt:message code="notice.th.delete1" /></a></span></td></tr>';
                        $('.append_tr').after(str1);
                        $('.a1').text('<fmt:message code="email.th.HideCC" />');
                        $('#copeNameText').val(data2.copyName);
                        $('#copeNameText').attr('user_id',data2.copyToId);
					}
                    $('#senduser').val(data2.users.userName+',');
                    $('#senduser').attr('user_id',data2.users.userId+',');
				}else if(status == 1){
				    if(data2.copyName != ''){
                        str1='<tr class="tian">' +
                            '<td><fmt:message code="main.th.CC" />：</td>'+
                            '<td><textarea user_id="" value="" name="txt" id="copeNameText" disabled></textarea>' +
                            '<span class="add_img"><span class="addImg"></span>' +
                            '<a href="javascript:;" id="selectUserO" class="Add"><fmt:message code="global.lang.add" /></a>' +
                            '<span class="add_img">' +
                            '<span class="addImg"></span>' +
                            '<a href="javascript:;" class="clear"><fmt:message code="notice.th.delete1" /></a></span></td></tr>';
                        $('.append_tr').after(str1);
                        $('.a1').text('<fmt:message code="email.th.HideCC" />');
                        var arrCname;
                        arrCname=data2.copyName.split(',');
                        var arrCId;
                        arrCId=data2.copyToId.split(',');
                        for(var i=0;i<arrCname.length;i++){ //抄送人数组
                            if(userName==arrCname[i]){
                                arrCname.splice(i,1);
                            }
                        }
                        for(var i=0;i<arrCId.length;i++){
                            if(userId==arrCId[i]){
                                arrCId.splice(i,1);
                            }
                        }
                        $('#copeNameText').val(arrCname.join(','));
                        $('#copeNameText').attr('user_id',arrCId.join(','));
					}
                    var arrName;
                    arrName=data2.toName.split(',');
                    var arrId;
                    arrId=data2.toId2.split(',');
                    for(var i=0;i<arrName.length;i++){ //收件人数组
                        if(userName==arrName[i]){
                            arrName.splice(i,1);
                        }
                    }
                    for(var i=0;i<arrId.length;i++){
                        if(userId==arrId[i]){
                            arrId.splice(i,1);
                        }
                    }
                    $('#senduser').val(data2.users.userName+','+arrName.join(','));
                    $('#senduser').attr('user_id',data2.users.userId+','+arrId.join(','));
				}

            }
        });
	}

</script>
</body>
</html>

