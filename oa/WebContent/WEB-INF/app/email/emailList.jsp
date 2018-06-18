
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
    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery/jquery.cookie.js"></script>
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

    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="../js/email/writeMail.js" type="text/javascript" charset="utf-8"></script>--%>
    <%--<script src="../js/email/inbox.js" type="text/javascript" charset="utf-8"></script>--%>
    <script src="../js/email/emailList.js" type="text/javascript" charset="utf-8"></script>
    <style>
        a{text-decoration: none;}
        table{
            /*border-collapse: collapse;*/
            border-color: #ccc;
        }
        .main_left .BTN:hover{background:#c5e9fb;}
        .attachment a{text-decoration: none;}
        .attachment a img{vertical-align: middle;}
        .searchTxt{width:70%;height:30px;padding-left:5px;margin-bottom:5px;}
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
        .noContent{width: 100px;text-align:center;margin: 200px auto;}
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
        input{background:none}
        .ul_showtwo{
            background: #6596c8;
        }
        .divUlShow{
            background: #6596c8;
        }
        .div_down{
            background: url(/img/icon_more_dakai_07.png) no-repeat 75% center;
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
        .befor{
            display: block;
            height: 100%;
            overflow-y: auto;
        }
        .main .main_left{
            overflow: hidden;
        }
        .opeartion{
            border-bottom: #eee 1px solid;
        }
        .main_div_right{
            overflow: hidden;
        }
        .main_right .article{
            margin-top: 20px;
            padding-left: 1%;
            border-top: #ebebeb 1px solid;
            overflow-y: auto;
        }
        .drafts {
            position: relative;
            overflow: hidden;
        }
        .drafts {
            position: absolute; left: 0;
            overflow-x: hidden;
            overflow-y: scroll;
        }

        /* for Chrome */
        .drafts::-webkit-scrollbar {
            display: none;
        }
    </style>
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="page">
    <div class="main" style="display: block;position: relative;">
        <div class="main_left" style="position: relative;border-right: none;left: 0px;">
            <div class="opeartion">
                <div class="sort">
                    <img class="Search" title='<fmt:message code="workflow.th.sousuo" />' src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_search_03(1).png"/><%--搜索--%>
                    <img class="ReFresh" title='<fmt:message code="global.lang.refresh" />' src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_shuaxin_03.png"/><%--刷新--%>
                    <img class="signReaders" title='<fmt:message code="main.th.taggedRead" />' src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_duoxuan_03.png"/><%--标记已读--%>
                    <img class="selectReaders" title='一键全选' src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_dx_01.png"/><%--标记已读--%>
                </div>
                <div class="sort_right">
                    <img src="../img/icon_shaixuan_03.png"/><fmt:message code="email.th.order" />
                </div>
                <div style="clear: both"></div>
                <div style="display:none;" class="search_div">
                    <input type="text" name="text" class="searchTxt" placeholder="<fmt:message code="main.th.ContentSearch" />"><span class="cancleSpan"><fmt:message code="depatement.th.quxiao" /></span>
                </div>
                <div class="signDiv" style="display: none;">
                    <ul id="orderByName">
                        <li orderByName="2"><fmt:message code="global.lang.date" /></li>
                        <li orderByName="3"><fmt:message code="email.th.sender" /></li>
                        <li orderByName="4"><fmt:message code="main.th.ReadNot" /></li>
                        <li orderByName="5"><fmt:message code="main.th.Star" /></li>
                        <li orderByName="6"><fmt:message code="email.th.file" /></li>
                    </ul>
                    <ul id="orderWhere">
                        <li orderWhere="0" style="border-top:#ccc 1px solid;"><fmt:message code="netdisk.th.asc" /></li>
                        <li orderWhere="1"><fmt:message code="netdisk.th.desc" /></li>
                    </ul>
                </div>
            </div>
            <ul style="display: block;" class="befor" id="befor">

            </ul>
            <div class="noContent" style="display: none;"><span><fmt:message code="Email.th.noNote" /></span></div>
        </div>
        <div class="main_middle"></div>
        <div class="main_div_right" style="width: 71%;float: left;">
            <%--没有邮件显示--%>
            <div class="main_right noEmail" style="display: none;">
                <div class="noEmail_img">
                    <img src="../img/img_nomessage_03.png" alt='<fmt:message code="main.th.emptyInbox" />'><%--空收件箱--%>
                </div>
            </div>
            <!-- 收件箱 -->
            <div class="main_right detailes" style="display: block;height: 100%;">
                <div class="getUser" id="getUser" style="display: block;">
                    <span class="span_hr">
                        <div class="attrImg"><img src=""/></div>
                        <p><span></span>&nbsp;&nbsp;<span class="zong"></span></p>
                        <p class="userdept"></p>
                    </span>
                </div>
            </div>
            <div class="main_right drafts" style="display: none;height: 100%;overflow-y: auto;">
                <table border="1" cellspacing="0" cellpadding="0" style="margin-bottom: 10px;">
                    <tr class="append_tr">
                        <td width="15%"><fmt:message code="email.th.recipients" />：</td>
                        <td width="84%">
                            <div class="inPole">
                                <textarea name="txt" id="senduser" user_id='' value="" disabled style="width: 230px;height: 50px;"></textarea>
                                <span class="add_img">
												<a href="javascript:;" id="selectUser" class="Add"><fmt:message code="global.lang.add" /></a>
											</span>
                                <span class="add_img">
												<a href="javascript:;" class="clear"><fmt:message code="notice.th.delete1" /></a>
											</span>

                            </div>
                            <div class="addPepl">
                                <a href="javascript:;" class="a1"><fmt:message code="email.th.addwait" /></a>
                                <a href="javascript:;" class="a2"><fmt:message code="email.th.addbcc" /></a>
                                <%--<a href="javascript:;" class="a3"><fmt:message code="email.th.recentcontacts" />&nbsp;</a>--%>
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
                        <td><fmt:message code="email.th.major" />：</td>
                        <td>
                            <input style="width: 230px;height: 30px;color:#000;text-align: left;" type="text" id="txt" value="" class="input_txt" />
                        </td>
                    </tr>
                    <tr>
                        <td width="15%">
                            <p><fmt:message code="email.th.content" />：</p>
                            <p class="Color"><a href="javascript:;" onclick="empty()"><fmt:message code="global.lang.empty" /></a></p>
                        </td>
                        <td width="84%">
                            <div id="container" style="width: 99.9%;min-height: 200px;" name="content" type="text/plain"></div>
                        </td>
                    </tr>
                    <tr class="Attachment" style="width:100%;">
                        <td width="10%"><fmt:message code="email.th.file" />：</td>
                        <td width="89%"   class="files" id="files_txt"></td>
                    </tr>
                    <tr>
                        <td><fmt:message code="email.th.filechose" />：</td>
                        <td>
                            <%--<form id="uploadimgform" target="uploadiframe" action="../upload?module=email" enctype="multipart/form-data" method="post"  onsubmit="document.charset='UTF-8';">--%>
                                <%--<input type="file" multiple="multiple" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">--%>
                                <%--<a href="javascript:;" id="uploadimg"><img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>--%>
                            <%--</form>--%>
                            <form id="uploadimgform" target="uploadiframe"  action="/upload?module=email"  method="post" >
                                <input type="file" multiple="multiple" name="file"  id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
                                <a href="#" id="uploadimg"><img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div class="div_btn" style="margin-left:30%;">
                                <div class="sureBtn" id="btn1"><span style="margin-left: 30px;"><fmt:message code="email.th.transmitimmediate" /></span></div>
                                <div class="saveBtn" id="btn2"><span style="margin-left: 33px;"><fmt:message code="email.th.savedraftbox" /></span></div>
                                <!--<input type="button" id="btn1" style="cursor: pointer;width: 70px;border-radius: 5px;height: 30px;line-height: 30px;color: #000;" value="<fmt:message code="email.th.transmitimmediate" />" />
                                        	<input type="button" id="btn2" style="cursor: pointer;width: 90px;border-radius: 5px;height: 30px;line-height: 30px;color: #000;" value="<fmt:message code="email.th.savedraftbox" />" />-->
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    var user = 'senduser';
    var user_id='';
    var ue = UE.getEditor('container');
    var res;
    $(function () {
        var main_height = $(document).height() -86;
        $('.main_left').height(main_height);
        $('.main_middle').height(main_height);
        $('.main_div_right').height(main_height);
        $('.befor').height($('.main_left').height()-$('.opeartion').height()-2)
        var heights = main_height- 194;

        $('.article').height(heights);
        var data={
            "flag":"inbox",
            "page":1,
            "pageSize":10,
            "useFlag":true
        }
        //选人控件
        $("#selectUser").on("click",function(){
            user_id='senduser';
            $.popWindow("../common/selectUser");
        });
        $('.drafts').on('click','#selectUserO',function(){
            user_id='copeNameText';
            $.popWindow("../common/selectUser");
        })
        $('.drafts').on('click','#selectUserT',function(){
            user_id='secritText';
            $.popWindow("../common/selectUser");
        })



        if ($('.main').css('display')=='block'){
            $('.up_format ul li:first-of-type').addClass('for_on').find('img').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/icon_zuoyou_sel_03.png');

            $('.up_format ul li:first-of-type').siblings().removeClass('for_on');
            $('.up_format ul li:first-of-type').parent().find('li').eq(1).find('img').attr('src','../img/iCon_list_003.png');
        }

        $('.Inbox').click(function(){
            $('.page').find('.div_iframe').remove();
            $('.up_page_right').css('display','block');
        });

        //点击切换外部邮件箱
        $('.externalMail').click(function(){
            $('.page').find('.div_iframeOne').remove();
            $('.up_page_right').css('display','none');
            var Ifrmae='<div class="div_iframeOne" style="width: 82%;overflow-y: hidden;overflow-x: hidden;float: left;height: 100%;"><div id="iframe1" class="iframe1" style="width: 100%;height: 100%;"><iframe name="myFrame" id="iframe_id" src="manageMail" frameborder="0" height="100%" width="100%" noresize="noresize"></iframe></div></div>';
            $('.page').append(Ifrmae);
            $('.div_iframeTwo').css('display','none');
            $('.div_iframe').css('display','none');
            $('#withdraw').css('display','none');
            document.getElementById("iframe_id").onload = function() { //控制子页面的方法
                myFrame.window.showDiv();
            };
        })

        //查询邮件点击事件
//        $('.liSearch').click(function(){
//            $('.page').find('.div_iframeTwo').remove();
//            var Ifrmae='<div class="div_iframeTwo" style="width: 82%;overflow:hidden;float: left;height: 100%;"><div id="iframe1" class="iframe1" style="width: 100%;height: 100%;"><iframe  id="iframeids" src="mailQuery" frameborder="0" height="100%" width="100%" noresize="noresize"></iframe></div></div>';
//            $('.up_page_right').css('display','none');
//            $('.page').append(Ifrmae);
//            $('.div_iframeOne').css('display','none');
//            $('.div_iframe').css('display','none');
//        })

        //复选框多选点击
        $('.main_left').on('click','.BTN',function(){
            //alert($('.chekEmail').css('display'));
            if($('.chekEmail').css('display')=='block'||$('.chekEmail').css('display')=='inline-block'){
                //alert(111)
                var state=$(this).find('.chekEmail').prop("checked");
                //alert(state)
                if(state == true){
                    $(this).find('.chekEmail').prop("checked",true);
                    $(this).addClass("backing");
                }else{
                    $(this).find('.chekEmail').prop("checked",false);
                    $(this).removeClass("backing");
                }
                var child =   $(".chekEmail");
                for(var i=0;i<child.length;i++){
                    var childstate= $(child[i]).prop("checked");
                    if(state!=childstate){
                        return
                    }
                }
            }else {
                $(this).find('.chekEmail').prop("checked",false);
                $(this).addClass("backing").siblings("li").removeClass("backing");
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
                            layer.alert('<fmt:message code="dem.th.uploading" />!',{},function(){
                                layer.closeAll();
                            });
                        }else{
                            str += '<div class="dech" deUrl="' + encodeURI(data[i].attUrl)+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*" style="margin-left: 5px;"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                        }
                    }
                    $('.Attachment td').eq(1).append(str);
                }else{
                    //alert('添加附件大小不能为空!');
                    layer.alert('<fmt:message code="dem.th.AddEmpty" />',{},function(){
                        layer.closeAll();
                    });
                }
            }
        });

        //草稿箱点击立即发送
        $('#btn1').click(function(){
            var bodyId=$('.main_left .backing').find('input').attr('nId');
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
            if(dataId1 == ''){
                layer.msg('<fmt:message code="email.th.shoujian" />',{ icon:6});
                return;
            }
            if(val == ''){
                layer.msg('<fmt:message code="email.th.zhuti" />',{ icon:6});
                return;
            }
            if( html == ''){
                layer.msg('<fmt:message code="email.th.con" />',{ icon:6});
                return;
            }
            var data={
                'bodyId':bodyId,
                'sendFlag':0,
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
                url:'sendEmail',
                dataType:'json',
                data:data,
                success:function(rsp){
                    if(rsp.flag == true){
                        $.layerMsg({content:'<fmt:message code="global.lang.send" />！',icon:1},function(){
                            location.reload();
                        });
                    }else{
                        $.layerMsg({content:'<fmt:message code="global.lang.err" />！',icon:2},function(){
//										console.log(rsp.flag);
                        });
                    }
                }
            });
        })
        //草稿箱点击保存到草稿箱
        $('#btn2').click(function(){
            var bodyId=$('.main_left .backing').find('input').attr('nId');
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
                'bodyId':bodyId,
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
                        location.reload()
                    });
                }
            });
        })

    });

    //附件删除
    $('#files_txt').on('click','.deImgs',function(){
        var data=$(this).parents('.dech').attr('deUrl');
        var dome=$(this).parents('.dech');
        deleteChatment(data,dome);
    })

    //附件删除
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



    //ue编辑器清空方法
    function empty(){
        ue.setContent('');
    }

    //正在开发中
    function clicked(){
        layer.msg('<fmt:message code="lang.th.Upcoming" />', {icon: 6});
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

