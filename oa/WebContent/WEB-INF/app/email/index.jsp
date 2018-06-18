
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
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><fmt:message code="email.title.inbox" /></title><!-- 收件箱 -->
		<meta name="renderer" content="webkit">
	    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
		<link rel="stylesheet" type="text/css" href="/css/email/inbox.css"/>
		<link rel="stylesheet" type="text/css" href="/css/email/inbox-upright.css"/>
		<script src="../js/common/language.js"></script>
		<script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
		<script src="../lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
		<script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
		<script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
		<script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>

		<script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
		<script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
		<script src="/lib/jquery.form.min.js"></script>
		<script src="../js/jquery/jquery.cookie.js"></script>
		<script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../js/email/writeMail.js" type="text/javascript" charset="utf-8"></script>
		<script src="../js/email/inbox.js" type="text/javascript" charset="utf-8"></script>
		<style>
			a{text-decoration: none;}
			table{
				/*border-collapse: collapse;*/
				border-color: #ccc;
			}
			.main_left .BTN:hover{background:#c5e9fb;}
			.attachment a{text-decoration: none;}
			.attachment a img{vertical-align: middle;}
			.befor .searchTxt{width:70%;height:30px;padding-left:5px;margin-bottom:5px;}
			.UP_INBOX .tab table .Hover:hover{background-color:#c5e9fb;}
			.Hover img{width:16px;}
			.on_tr{background-color: #c5e9fb !important;}
			.UP_INBOX,.UP_INBOX .tab,.UP_INBOX .tab table{width: 99%;}
			.UP_INBOX .tab table tr{border: 1px solid #c0c0c0;}
			.UP_INBOX .tab table tr th{color: #2F5C8F;font-weight: normal;}
			.UP_INBOX .tab table tr:nth-child(odd){background-color: #fff;}
			.UP_INBOX .tab table tr:nth-child(even){background-color: #F6F7F9;}
			.UP_INBOX .tab table tr th,.UP_INBOX .tab table tr td{padding:10px;}
			.UP_INBOX,.UP_INBOX .tab,.UP_INBOX .tab table tr th.theme{text-align: center}
			.UP_INBOX .tab table .theme_a a{text-decoration: none;text-align: left;display: block;color:#2B7FE0;}
			.M-box3{margin-top:10px;float:right;margin-right: 7px;}
			.M-box3 a{margin: 0 3px;width: 29px;height: 29px;line-height: 29px;font-size: 12px;text-decoration: none;}
			.M-box3 .active{margin: 0px 3px;width: 29px;height: 29px;line-height: 29px;background: #2b7fe0;font-size: 12px;border: 1px solid #2b7fe0;}
			.jump-ipt{margin: 0 3px;width: 29px;height: 29px;line-height: 29px;font-size: 12px;}
			.M-box3 a:hover{background: #2b7fe0;}
			.set_up_ul{font-size: 14px;border: #ccc 1px solid;border-radius: 5px;width: 80%;background-color: #fff;position: absolute;bottom: 42px;margin-left: 5px}
			.set_up_ul ul{list-style: none;}
			.set_up_ul ul li{width: 100%;text-align: center;color: #000;height:25px;line-height:25px;}
			.set_up_ul ul li:hover{background-color: #6ea1d5;color:#fff;cursor: pointer;}
			.RemoveTo_div{font-size: 12px;border: #ccc 1px solid;border-radius: 5px;min-width:160px;background-color: #fff;position: absolute;left:0px;top: 30px;z-index: 9999;}
			.RemoveTo_div ul li{padding: 5px 10px;display:block;clear: both;}
			.RemoveTo_div .RemoveTo_child:hover{background-color: #6ea1d5;color:#fff;cursor: pointer;}
			.allEmail_div{font-size: 12px;border: #ccc 1px solid;border-radius: 5px;min-width:150px;background-color: #fff;position: absolute;left: 18.3%;top: 52px;z-index: 9999;}
			.allEmail_div ul li{padding: 5px 10px;display:block;clear: both;}
			.allEmail_div ul li:hover{background-color: #6ea1d5;color:#fff;cursor: pointer;}
			textarea{width: 230px;height: 50px;margin: 5px;}
			.noEmail_img{width: 163px;height: 162px;margin: 170px auto;}
			.noContent{width: 50px;margin: 200px auto;}
			.main_right table tr td>span>span{
				float: left;
			}
			.page .page_left .write .d_im{
				background: url(../../img/email/icon_normal_01.png) no-repeat;
				background-size:100% 100%;
			}
			.main .main_left ul li .xia img{
				float: none;
				position: absolute;
				margin-right: 0;
				right: 8%;
			}
			.inbox_btn_tim{
				height: 52px;
			}
			.page .page_left .inbox_btn{
				height: 52px;
				line-height: 52px;
			}
			img[src=""],img:not([src]){opacity:0;}
			.up_page_right{overflow-y: hidden}
			/*.main{overflow: hidden}*/
			input{background:none}
			.ul_showtwo{
				background: #6596c8;
			}
			.divUlShow{
				background: #6596c8;
			}
			.div_down{
				background: url(/img/icon_more_dakai_07.png) no-repeat 75% center;
				background-size: 18px 15px;
			}
			.main_middle{
				position: absolute;
				float: left;
				width: 8px;
				height: 100%;
				background: #cee7ff;
				left:28%;
				cursor: col-resize;
				z-index: 10;
			}
			#divTbaleText{
				border-collapse: collapse;
			}
			#divTbaleText tr{
				border:#ccc 1px solid;
			}
			#divTbaleText tr th{
				padding: 5px;
			}
			#divTbaleText tr td{
				padding: 5px;
			}
			.div_up{
				background:url(../../img/icon_more_shouqi_07.png) no-repeat 87% center
			}
		</style>
		<script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
		<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
		<script>
			$(function () {
				if($('#InBox').find('img').prop('src').indexOf('theme2')!=-1||$('#InBox').find('img').prop('src').indexOf('theme4')!=-1){
                    $('#InBox').find('img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/icon_inbox_07-.png')
					$('.ul_showtwo ul>li').click(function () {
						if($(this).hasClass('on')){
						    if($(this).find('img').prop('src').indexOf('-')==-1) {
                                $(this).siblings('li').each(function (i,n) {
                                    $(this).find('img').prop('src',$(this).find('img').prop('src').replace(/-/g,''))
                                })
                                $(this).parents('.inBox').next().find('.divUlShow').find('li').each(function () {
                                    $(this).find('img').prop('src',$(this).find('img').prop('src').replace(/-/g,''))

                                })


                                $(this).find('img').prop('src', $(this).find('img').prop('src').split('.png')[0] + '-' + '.png')
                            }
						}
                    })
					$(document).on('click','.divUlShow>ul>li',function () {
                        if($(this).hasClass('on')){
                            if($(this).find('img').prop('src').indexOf('-')==-1) {
                                $(this).siblings('li').each(function (i,n) {
                                    $(this).find('img').prop('src',$(this).find('img').prop('src').replace(/-/g,''))
                                })
                                $(this).parents('.other').prev().find('.ul_showtwo').find('li').each(function () {
                                    $(this).find('img').prop('src',$(this).find('img').prop('src').replace(/-/g,''))

                                })


                                $(this).find('img').prop('src', $(this).find('img').prop('src').split('.png')[0] + '-' + '.png')
                            }
                        }
                    })
				}
            })
		</script>
	</head>
	<body>
		<div class="page">
			
				<!--左侧侧边栏 开始-->
				<div class="page_left">
					<!--写邮件-->
					<div class="write">
						<div class="d_im" style="text-align:center;background-size:100% 100%;">

								<img src="/img/commonTheme/${sessionScope.InterfaceModel}/writeemail.png" alt="" style="width: 16px;height: 16px;margin-bottom: -2px;margin-right: 3px;">
								<span><fmt:message code="email.title.waitmail" /></span>
						</div>
					</div>
					<!--收件箱-->
					<div class="inBox">
						<a href="javascript:;" class="inbox_btn">
							<div class="inbox_btn_tim div_down" ><fmt:message code="email.title.mailbox" /></div>
						</a>
						<div class="ul_show ul_showtwo" style="display: block;">
							<ul>
								<li id="InBox" class="on Inbox"><a href="javascript:;"><img src="../img/commonTheme/${sessionScope.InterfaceModel}/icon_inbox_07.png"/><fmt:message code="email.title.inbox" /><span id="inboxNum"></span></a></li>
								<li id="drafts"><a href="javascript:;"><img src="../img/commonTheme/${sessionScope.InterfaceModel}/icon_drafts_07.png"/><fmt:message code="email.title.draftbox" /><span id="draftsNum"></span></a></li>
								<li id="hasBeenSend"><a href="javascript:;"><img src="../img/commonTheme/${sessionScope.InterfaceModel}/icon_sent_07.png"/><fmt:message code="email.title.sent" /><span id="hasBeenSendNum"></span></a></li>
								<li id="wastebasket"><a href="javascript:;"><img src="../img/commonTheme/${sessionScope.InterfaceModel}/icon_dustbin_07.png"/><fmt:message code="email.title.wastebasket" /></a></li>
								<li class='liSearch'><a href="javascript:;"><img src="../img/commonTheme/${sessionScope.InterfaceModel}/icon_search_03.png"/><fmt:message code="email.title.querymail" /></a></li>
							</ul>
						</div>
					</div>
					<!--其他邮件箱-->
					<div class="other">
						<a href="javascript:;" class="inbox_btn">
							<div class="inbox_btn_tim div_up"><fmt:message code="email.title.othermailbox" /></div>
						</a>
						<div class="ul_show divUlShow" >
							<ul>
								<%--<li><a href="javascript:;"><img src="../img/icon_file_11.png"/><fmt:message code="email.title.oneselffile" /></a></li>--%>
							</ul>
						</div>
						
					</div>
					<!--邮箱设置-->
					<div class="setUp">
						<a href="javascript:;" class="aSeting">
							<img class="setUp_img" src="../img/icon_setmail_11.png"/>
							<span><fmt:message code="email.th.mailimpost" /></span>
						</a>
						<a href="javascript:;" class="aReflresh" >
							<img class="loding" src="../img/icon_refresh_11.png"/>
						</a>
						<div class="set_up_ul" style="display:none;">
							<ul>
								<li class="exceptLi"><fmt:message code="Email.th.Manageboxes" /></li>
								<%--<li class="externalMail">Internet邮箱</li>--%>
								<%--<li>导入Internet邮箱</li>
								<li>邮箱整理</li>
								<li>POP3设置</li>--%>
							</ul>
						</div>
					</div>
				</div>
			
			<!--左侧侧边栏 结束-->
			
			<!--右侧侧边栏 开始-->
			<div class="up_page_right">
				<div class="up_header">
					<div class="up_nav">
						<ul>
							<li id="allEmail" style="margin-right: 15%;"><img src="../img/icon_allmail_06.png" class="im"/><fmt:message code="email.th.allmail" /><img src="../img/icon_more_06.png" class="more_im"/></li>
							<li id="withdraw" style="display: none;"><fmt:message code="withdraw.th.draw" /></li>
							<%--<li onclick="clicked()"><img src="../img/icon_notread_06.png" class="im"/><fmt:message code="email.th.unread" /><span>3</span></li>--%>
							<li id="Replay"><img src="../img/icon_replay_03.png" class="im"/><fmt:message code="global.lang.reply" /></li>
							<li id="ReplayAll"><img src="../img/icon_replay_03.png" class="im"/><fmt:message code="email.th.replyall" /></li>
							<li id="Forward" data-boxType="inbox"><img src="../img/icon_transmit_06.png" class="im"/><fmt:message code="email.th.transmit" /></li>
							<li id="RemoveTo" style="position: relative;">
								<img src="../img/icon_move_06.png" class="im"/><fmt:message code="email.th.remove" /><img src="../img/icon_more_06.png" class="more_im"/>
								<div class="RemoveTo_div" style="display:none;">
									<ul>

									</ul>
								</div>
							</li>
							<li id="delete" dataHeng="" data-deleteType="inbox" data-defats="otherBox" data-box=""><img src="../img/icon_delete_06.png" class="im"/><fmt:message code="global.lang.delete" /></li><%--<img src="../img/icon_more_06.png" class="more_im"/>--%>
							<%--<li onclick="clicked()"><fmt:message code="email.th.more" /><img src="../img/icon_more_06.png" class="am"/></li>--%>
						</ul>

						<div class="allEmail_div" style="display:none;">
							<ul>
								<li attrAll=""><fmt:message code="email.th.allmail" /></li>
								<li attrAll="0"><fmt:message code="workflow.th.Internalmail" /></li>
								<%--<li attrAll="1"><fmt:message code="workflow.th.ExternalMail" /></li>--%>
							</ul>
						</div>
					</div>
					<div class="up_pages">
						<%--<div class="up_div_pages">
							<ul>
								<li onclick="clicked()"><img src="../img/icon_left_03.png"/><fmt:message code="email.th.beforemail" /><span>|</span></li>
								<li onclick="clicked()"><fmt:message code="email.th.nextmail" /><img src="../img/icon_right_03.png"/></li>
							</ul>
						</div>--%>
						<div class="up_format">
							<ul>
								<li class="for_on"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_zuoyou_sel_03.png" id="ul_imgs"/></li>
								<li><img src="../img/iCon_list_003.png" id="ul_img"/></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="iframe" style="display:block;height: 100%;">
					<iframe src="/email/emailList?boxStyle=inbox" id="iframeEmailList" frameborder="0" style="width: 100%;height: 100%;"></iframe>
				</div>
				<div class="iframeUp" style="display:none;height: 100%;">
					<iframe src="/email/inBoxUp" id="iframeEmailListUp" frameborder="0" style="width: 100%;height: 100%;"></iframe>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
             var user = 'senduser';
             var user_id='';
			 var ue = UE.getEditor('container');
			 var res;
			 var otherBoxId;
			$(function () {
                var main_height = $(document).height() - 65;
//                $('.main_left').height(main_height);
                $('.main_middle').height(main_height);
                var heights = main_height - 194;
                $('.article').height(heights);

                //与写邮件页面互调
                $('.d_im').click(function () {
//				    $(this).css('background','url("../../img/email/icon_email_click_01.png") no-repeat');
                    $('.page').find('.div_iframe').remove();
                    var Ifrmae = '<div class="div_iframe" style="width: 82%;overflow: hidden;float: left;height: 100%;"><div id="iframe1" class="iframe1" style="width: 100%;height: 100%;"><iframe  id="iframeId" src="addbox" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize"></iframe></div></div>';
                    $('.up_page_right').css('display', 'none');
                    $('.page').append(Ifrmae);
                    $('.div_iframeTwo').css('display', 'none')
                    $('.div_iframeOne').css('display', 'none');
                });
                $('.Inbox').click(function () {
                    $('.page').find('.div_iframe').remove();
                    $('.up_page_right').css('display', 'block');
                });

//                切换收件箱显示风格
				$('.up_format li').click(function(){
				    var indexNum=$(this).index();
				    if(indexNum == 0){
				        $('.iframe').show();
				        $('.iframeUp').hide();
                        $('.up_format li').eq(0).addClass('for_on').find('img').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/icon_zuoyou_sel_03.png');
                        $('.up_format li').eq(1).removeClass('for_on').find('img').attr('src','/img/iCon_list_003.png');
                        $('#delete').attr('dataHeng','');
					}else{
                        $('.iframe').hide();
                        $('.iframeUp').show();
                        $('.up_format li').eq(0).removeClass('for_on').find('img').attr('src','/img/icon_zuoyou_03.png');
                        $('.up_format li').eq(1).addClass('for_on').find('img').attr('src','/img/icon_list_sel_03.png');
                        $('#delete').attr('dataHeng','true');
					}
				})

                //点击切换邮件箱管理页面（邮箱设置）
                $('.exceptLi').click(function () {
                    $('.page').find('.div_iframeOne').remove();
                    $('.up_page_right').css('display', 'none');
                    var Ifrmae = '<div class="div_iframeOne" style="width: 82%;overflow-y: hidden;overflow-x: hidden;float: left;height: 100%;"><div id="iframe1" class="iframe1" style="width: 100%;height: 100%;"><iframe name="myFrame" id="iframe_id" src="manageMail" frameborder="0" height="100%" width="100%" noresize="noresize"></iframe></div></div>';
                    $('.page').append(Ifrmae);

                    $('.div_iframeTwo').css('display', 'none');
                    $('.div_iframe').css('display', 'none');
                    document.getElementById("iframe_id").onload = function () {
                        myFrame.window.divListShow();
                    };
                })
                //点击切换外部邮件箱
                $('.externalMail').click(function () {
                    $('.page').find('.div_iframeOne').remove();
                    $('.up_page_right').css('display', 'none');
                    var Ifrmae = '<div class="div_iframeOne" style="width: 82%;overflow-y: hidden;overflow-x: hidden;float: left;height: 100%;"><div id="iframe1" class="iframe1" style="width: 100%;height: 100%;"><iframe name="myFrame" id="iframe_id" src="manageMail" frameborder="0" height="100%" width="100%" noresize="noresize"></iframe></div></div>';
                    $('.page').append(Ifrmae);
                    $('.div_iframeTwo').css('display', 'none');
                    $('.div_iframe').css('display', 'none');
                    $('#withdraw').css('display', 'none');
                    document.getElementById("iframe_id").onload = function () { //控制子页面的方法
                        myFrame.window.showDiv();
                    };
                })

                //查询邮件点击事件
                $('.liSearch').click(function () {
                    $('.page').find('.div_iframeTwo').remove();
                    var Ifrmae = '<div class="div_iframeTwo" style="width: 82%;overflow:hidden;float: left;height: 100%;"><div id="iframe1" class="iframe1" style="width: 100%;height: 100%;"><iframe  id="iframeids" src="mailQuery" frameborder="0" height="100%" width="100%" noresize="noresize"></iframe></div></div>';
                    $('.up_page_right').css('display', 'none');
                    $('.page').append(Ifrmae);
                    $('.div_iframeOne').css('display', 'none');
                    $('.div_iframe').css('display', 'none');
                });
                //收件箱点击事件
                $('#InBox').click(function () {

                    $('#iframeEmailList').attr('src', '/email/emailList?boxStyle=inbox');
                    $('#Forward').attr('data-boxType','inbox');
					$('.up_nav').find('li').css('display','block');
                    $('.up_pages').css('display','block');
                    $('#withdraw').css('display','none');
					$('#delete').attr('data-deleteType','inbox');
                    $('#delete').attr('dataHeng','');
					$('.iframeUp').hide();
					$('.iframe').show();
                });


                //草稿箱点击事件
                $('#drafts').click(function () {

                    $('#iframeEmailList').attr('src', '/email/emailList?boxStyle=drafts');

                    $('#delete').attr('data-deleteType','drafts');
					$('#allEmail').css('display','block');
					$('#delete').css('display','block');
                    $('#Replay').css('display','none');
                    $('#ReplayAll').css('display','none');
                    $('#Forward').css('display','none');
					$('#RemoveTo').css('display','none');
					$('.div_iframeOne').css('display','none');
                    $('.up_page_right').css('display','block');
                    $('.up_pages').css('display','none');
                    $('#withdraw').css('display','none');
                    $('#delete').attr('dataHeng','');
                    $('.iframeUp').hide();
                    $('.iframe').show();
                });

                //已发送点击事件
                $('#hasBeenSend').click(function () {

                    $('#iframeEmailList').attr('src', '/email/emailList?boxStyle=outbox');
                    $('#Forward').attr('data-boxType','outbox');
                    $('#delete').attr('data-deleteType','outbox');

                    selectBox = 'hasBeenSend';
                    showAndHide();
                    $('#Forward').css('display', 'block');
                    $('#withdraw').css('display', 'block');
                    $('#delete').css('display', 'block');
                    $('#Replay').css('display', 'none');
                    $('#ReplayAll').css('display', 'none');
                    $('#RemoveTo').css('display', 'none');
                    $('.div_iframeOne').css('display', 'none');
                    $('.up_page_right').css('display', 'block');
                    $('.up_pages').css('display', 'none');
                    $('#delete').attr('dataHeng','');
                    $('.iframeUp').hide();
                    $('.iframe').show();
                });

                //废纸篓点击事件
                $('#wastebasket').click(function () {

                    $('#iframeEmailList').attr('src', '/email/emailList?boxStyle=recycle');
                    $('#delete').attr('data-deleteType','recycle');
                    $('#allEmail').css('display', 'block');
                    $('#withdraw').css('display', 'none');
                    $('#delete').css('display', 'block');
                    $('#Replay').css('display', 'none');
                    $('#ReplayAll').css('display', 'none');
                    $('#Forward').css('display', 'none');
                    $('#RemoveTo').css('display', 'none');
                    $('.div_iframeOne').css('display', 'none');
                    $('.up_page_right').css('display', 'block');
                    $('.up_pages').css('display', 'none');
                    $('#delete').attr('dataHeng','');
                    $('.iframeUp').hide();
                    $('.iframe').show();

                });
                $('.page_left').on('click', '.otherLi', function () {
                    $('.page_left li').removeClass('on');
                    $(this).addClass('on');
                    otherBoxId = $(this).attr('boxid');
                })

                //删除事件
                $('#delete').click(function () {
                    var dataHengNum=$(this).attr('dataHeng');
                    var boxStyle=$(this).attr('data-deletetype');
                    var bodyId='',ueId='',boxId='',emailId='';
                    var defatsStyle=$(this).attr('data-defats');
                    var arrId1=[];
                    var arrId2=[];
                    var arrId3=[];
                    if($('.iframeUp').css('display') == 'block'){
                        emailId=$("#iframeEmailListUp").contents().find(".tab .backList").attr('Attr');
                        ueId=$("#iframeEmailListUp").contents().find(".tab .backList").attr('uId');
                        $("#iframeEmailListUp").contents().find(".checkboxChild:checkbox:checked").each(function(){
                            var sId=$(this).parents('.Hover').attr('Attr');
                            arrId1.push(sId);
                        })
                        $("#iframeEmailListUp").contents().find(".checkboxChild:checkbox:checked").each(function(){
                            var ueID=$(this).parents('.Hover').attr('uId');
                            arrId2.push(ueID);
                        })
					}else{
                        emailId=$("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('id');
                        bodyId=$("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('nId');
                        ueId=$("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('ueId');
                        boxId=$(this).attr('data-box');
                        $("#iframeEmailList").contents().find(".chekEmail:checkbox:checked").each(function(){
                            var sId=$(this).parents('.BTN').find('input[type="hidden"]').attr('id');
                            arrId1.push(sId);
                        })
                        $("#iframeEmailList").contents().find(".chekEmail:checkbox:checked").each(function(){
                            var ueID=$(this).parents('.BTN').find('input[type="hidden"]').attr('ueId');
                            arrId2.push(ueID);
                        })
                        $("#iframeEmailList").contents().find(".chekEmail:checkbox:checked").each(function(){
                            var bodyId=$(this).parents('.BTN').find('input[type="hidden"]').attr('nId');
                            arrId3.push(bodyId);
                        })
					}
                    var data0={
                        "flag":"inbox",
                        "page":1,
                        "pageSize":10,
                        "useFlag":true
                    }

                    var data1={
                        "flag":'inbox',
                        "page":1,
                        "pageSize":100,
                        "useFlag":true,
                        "searchCriteria":'',
                        "orderByName":'',
                        "orderWhere":'',
                        "isWebmail":''
                    };
                    var data2={
                        "flag":'drafts',
                        "page":1,
                        "pageSize":100,
                        "useFlag":true,
                        "searchCriteria":'',
                        "orderByName":'',
                        "orderWhere":''
                    };
                    var data3={
                        "flag":'outbox',
                        "page":1,
                        "pageSize":100,
                        "useFlag":true,
                        "searchCriteria":'',
                        "orderByName":'',
                        "orderWhere":'',
                        "isWebmail":''
                    };
                    var data4={
                        "flag":'recycle',
                        "page":1,
                        "pageSize":100,
                        "useFlag":true,
                        "searchCriteria":'',
                        "orderByName":'',
                        "orderWhere":'',
                        "isWebmail":''
                    };
                    var data5={
                        'page':1,
                        'pageSize':100,
                        'useFlag':false,
                        'boxId': boxId,
                        "searchCriteria":'',
                        "orderByName":'',
                        "orderWhere":''
                    }
                    var data={
                        "flag":boxStyle,
                        "emailID":emailId,
                        "deleteFlag":ueId
                    }
                    var dataCheck={
						"flag":boxStyle,
						"requestFlags":arrId1,
						"deleteFlags":arrId2
					}
					if(dataHengNum == 'true'){
                        deleteData(dataCheck,boxStyle,data0,dataHengNum);
					}else{
                        if($("#iframeEmailList").contents().find(".befor .chekEmail").css('display') == 'inline-block'){
                            if(boxStyle == 'inbox'){
                                deleteData(dataCheck,boxStyle,data1,dataHengNum);
                            }else if(boxStyle == 'drafts'){
                                var draftsData={
                                    requestFlags:arrId3
                                }
                                deleteDrafts(draftsData,data2,dataHengNum);
                            }else if(boxStyle == 'outbox'){
                                dataCheck.requestFlags=arrId3;
                                deleteData(dataCheck,boxStyle,data3,dataHengNum);
                            }else if(boxStyle == 'recycle'){
                                deleteData(dataCheck,boxStyle,data4,dataHengNum);
                            }else if(boxStyle == 'otherBox'){
                                dataCheck.flag='inbox';
                                deleteData(dataCheck,'otherBox',data5,dataHengNum);
                            }
                        }else{
                            if(boxStyle == 'inbox'){
                                deleteData(data,boxStyle,data1,dataHengNum);
                            }else if(boxStyle == 'drafts'){
                                var draftsData={
                                    bodyId:bodyId
                                }
                                deleteDrafts(draftsData,data2,dataHengNum);
                            }else if(boxStyle == 'recycle'){
                                deleteData(data,boxStyle,data4,dataHengNum);
                            }else if(boxStyle == 'outbox'){
                                data.emailID=bodyId
                                deleteData(data,boxStyle,data3,dataHengNum);
                            }else if(boxStyle == 'otherBox'){
                                data.flag='inbox';
                                deleteData(data,'otherBox',data5,dataHengNum);
                            }
                        }
					}

                })

                //回复事件
                $('#Replay').click(function () {
                    var dataHengNum=$('#delete').attr('dataHeng');
                    var sId='';
                    if(dataHengNum == 'true'){
                        sId=$("#iframeEmailListUp").contents().find(".tab .backList").attr('Attr');
					}else{
                        sId=$("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('id');
					}
//                    if (typeof(qt) == 'undefined') {
                        $.popWindow('writeEmail?sId=' + sId + '&type=0', '<fmt:message code="global.lang.reply" />', '0', '0', '1600px', '800px');
                    <%--} else {--%>
                        <%--alert('111')--%>
                        <%--new QWebChannel(qt.webChannelTransport, function (channel) {--%>
                            <%--var content = channel.objects.interface;--%>
                            <%--content.xoa_sms('/email/writeEmail?sId=' + sId + '&type=0', '<fmt:message code="global.lang.reply" />', "web_child_url");--%>
                        <%--});--%>
                    <%--}--%>
                });
                //回复全部事件
                $('#ReplayAll').click(function () {
                    var dataHengNum=$('#delete').attr('dataHeng');
                    var sId='';
                    if(dataHengNum == 'true'){
                        sId=$("#iframeEmailListUp").contents().find(".tab .backList").attr('Attr');
                    }else{
                        sId=$("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('id');
                    }
//                    if (typeof(qt) == 'undefined') {
                        $.popWindow('writeEmail?sId=' + sId + '&type=1', '<fmt:message code="global.lang.reply" />', '0', '0', '1600px', '800px');
                    <%--} else {--%>
                        <%--new QWebChannel(qt.webChannelTransport, function (channel) {--%>
                            <%--var content = channel.objects.interface;--%>
                            <%--content.xoa_sms('/email/writeEmail?sId=' + sId + '&type=1', '<fmt:message code="global.lang.reply" />', "web_child_url");--%>
                        <%--});--%>
                    <%--}--%>
                })
                //转发事件
                $('#Forward').click(function () {
                    var dataHengNum=$('#delete').attr('dataHeng');
                    var sId='';
                    if(dataHengNum == 'true'){
                        sId=$("#iframeEmailListUp").contents().find(".tab .backList").attr('Attr');
                    }else{
                        sId=$("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('id');
                    }
//                    var sId = $("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('id');
                    var nId = $("#iframeEmailList").contents().find(".befor .backing").find('input[type="hidden"]').attr('nId');
                    var dataBoxType=$(this).attr('data-boxType')
//                        if (typeof(qt) == 'undefined') {
                            $.popWindow('writeEmail?sId=' + sId + '&type=2&nId='+nId+'&boxType='+dataBoxType, '<fmt:message code="email.th.transmit" />', '0', '0', '1500px', '800px');
                        <%--} else {--%>
                            <%--new QWebChannel(qt.webChannelTransport, function (channel) {--%>
                                <%--var content = channel.objects.interface;--%>
                                <%--content.xoa_sms('/email/writeEmail?sId=' + sId + '&type=2&nId='+nId+'&boxType='+dataBoxType, '<fmt:message code="email.th.transmit" />', "web_child_url");--%>
                            <%--});--%>
                        <%--}--%>
                })
            })

			//ue编辑器清空方法
			function empty(){
				ue.setContent('');
			}


             //邮件删除
             function deleteData(data,boxType,datan,use_heng){
                 layer.confirm('<fmt:message code="global.lang.sure" />', {title:'<fmt:message code="information" />',
                     btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'] //按钮
                 }, function(){
                     //确定删除，调接口
                     $.ajax({
                         type:'get',
                         url:'deleteEmail',
                         dataType:'json',
                         data:data,
                         success:function(){
                             if(boxType == 'inbox'){
                                 if(use_heng == 'true'){
                                     xianshihengban(datan);
								 }else{
                                     btnClick(datan,'showEmail');
								 }
                             }else if(boxType == 'drafts'){
                                 btnClick(datan,'showEmail');
                             }else if(boxType == 'outbox'){
                                 btnClick(datan,'showEmail');
                             }else if(boxType == 'recycle'){
                                 btnClick(datan,'showEmail');
                             }else if(boxType == 'otherBox'){
                                 btnClick(datan,'selectBoxEmail');
                             }
                             //第三方扩展皮肤
                             layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                         }
                     })
                 }, function(){
                     layer.closeAll();
                 });
             }
             
//             草稿箱邮件删除
			 function deleteDrafts(data,datan) {
                 layer.confirm('<fmt:message code="global.lang.sure" />', {
                     btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'] //按钮
                 }, function(){
                     //确定删除，调接口
                     $.ajax({
                         type:'get',
                         url:'deleteDraftsEmail',
                         dataType:'json',
                         data:data,
                         success:function(){
                             //第三方扩展皮肤
                             layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                             btnClick(datan,'showEmail');
                         }
                     }) ;
                 }, function(){
                     layer.closeAll();
                 });
             }

             function btnClick(data,emailUrl) {
                 document.getElementById("iframeEmailList").contentWindow.showAjax(data,emailUrl);
             }
             function xianshihengban(data) {
                 document.getElementById("iframeEmailListUp").contentWindow.hengEmailList(data);
             }

		</script>

		<script language="javascript" type="text/javascript">
			function parenttest() {
                $('.other .ul_show ul').empty();
                $('.up_nav .RemoveTo_div ul').empty();
				var data={
					'page':1,
					'pageSize':10,
					'useFlag':true
				}
				$.ajax({
					type:'GET',
					url:'showEmailBox',
					dataType:'json',
					data:data,
					success:function(rsp){
						var data1=rsp.obj;
						var str='';
						var str1='';
						for(var i=0;i<data1.length;i++){
							str+='<li class="otherLi" boxId="'+data1[i].boxId+'"><a href="javascript:;"><img src="../img/commonTheme/${sessionScope.InterfaceModel}/icon_file_11.png"/>'+data1[i].boxName+'</a></li>';
							str1+='<li class="RemoveTo_child" boxId="'+data1[i].boxId+'">'+data1[i].boxName+'</li>';
						}
						$('.other .ul_show ul').append(str);
						$('.up_nav .RemoveTo_div ul').append(str1);
					}
				})
			}

			function showAndHide(){
                //图标切换
                if($('.UP_INBOX').css('display') == 'none'){
                    $('#ul_imgs').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/icon_zuoyou_sel_03.png');
                    $('#ul_img').attr('src','../../img/iCon_list_003.png');
                }else{
                    $('#ul_imgs').attr('src','../../img/icon_zuoyou_03.png');
                    $('#ul_img').attr('src','../../img/icon_list_sel_03.png');
                }
			}
		</script>


		<script>
            $(".a_post").on("click",function(event){
                event.preventDefault();  // 使a自带的方法失效，即无法向addStudent.action发出请求
                $.ajax({
                    type: "POST",  // 使用post方式
                    url: "addStudent.action",
                    contentType:"application/json",
                    data: JSON.stringify({param1:value1, param2:value2}),  // 参数列表，stringify()方法用于将JS对象序列化为json字符串
                    dataType:"json",
                    success: function(result){
                        // 请求成功后的操作
                    },
                    error: function(result){
                        // 请求失败后的操作
                    }
                });
            });
		</script>
	</body>
</html>

