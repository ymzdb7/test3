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
    <title><fmt:message code="main.interfaceset" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <!--<link rel="stylesheet" type="text/css" href="../css/sys/addUser.css"/>-->
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery/jquery.cookie.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        table tr td {
            border: 1px solid rgb(192, 192, 192) !important;
        }
        #TableHeader { border: 1px solid rgb(192, 192, 192);}
        #TableHeader { border: 1px solid rgb(192, 192, 192);}
        .header {
            height: 45px;
            border-bottom: #999 1px solid;
            overflow: hidden;
            margin-bottom: 10px;
            padding-left: 30px;
            position: fixed;
            top: 0px;
            width: 100%;
            background-color: #fff;
            z-index:1099;
        }
        .tab{
            top:68px;
            z-index: 0;
            margin-top: 77px;
        }
        .headertitle{
            margin-top: 12px;
            font-family: "微软雅黑";
            font-size: 22px;
            color: #494d59;
            display: inline-block;
            margin-left:12px;
            /*width: 90px;*/
            float:left;
        }
        table {
            width: 600px;
        }
        button{
            cursor: pointer;
        }
        .charstyle {
            color: #2F5C8F;
        }
        .big1 {
            color: #2F5C8F;
        }
        .savebutton{
            background-image:url(../../img/confirm.png);
            cursor:pointer;
            background-repeat:no-repeat;
            background-position:center;
            height: 28px;
        }
        .savebutton span{
            margin-left: 17px;
            line-height: 27px;
        }
        .empty{
            float: right;
            filter:alpha(opacity=0); /*IE滤镜，透明度50%*/
            -moz-opacity:0; /*Firefox私有，透明度50%*/
            opacity:1;/*其他，透明度50%*/
            width: 900px;
            z-index: 9999;
            background: white;
            height:45px;
        }
        td{
            font-size: 11pt;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body class="bodycolor">
<div class="header"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/faceSetting.png" style="margin-top: 7px;float: left;"><div class="headertitle"> <fmt:message code="main.interfaceset" /></div><div class="empty"></div></div>
<div class="tab">

</div>
<script type="text/javascript">
    function saveData(){
        var avatarUpload=$("#upload_head").is(':checked')?'1':'0';
        var themeSelect=$("#theme_select").is(':checked')?'1':'0';
        var datas={
            template:$("#model_sytle option:selected").attr("value"),
            //档案备案号
            MIIBEIAN:$("#document_num").val(),
            //浏览器标题设置
            ieTitle:$("#ie_title").val(),
            //登录界面模板
            //：$("#model_sytle").val(),
            bannertText:$("#BigInput_topwz").val(),
            //底部状态栏置中文字
            statusText:$("#status_text").val(),

            //imgWidth:$("#img_width").val(),
            //imgHeight:$("#img_height").val(),
            //是否允许选择界面主题
            themeSelect:themeSelect,
            //界面设置默认主题
            theme:$("#theme").val(),
            //允许用户上传图像
            avatarUpload:avatarUpload,
            //上传头像最宽
            avatarWidth:$("#width_max").val(),
            //上传头像最高
            avatarHeight:$("#height_max").val(),
            //注销提示文字
            LOG_OUT_TEXT:$("#log_out_text").val(),
            //attachMentId:$
            //$("#MYTABLE_BKGROUND").val
            //即时通信
            IM_WINDOW_CAPTION:$("#wi_title").val(),
            loginLiterals:$('[name="loginLiterals"]').val(),
            attachmentId2:$('[name="attachmentId2"]').val(),
            attachmentName2:$('[name="attachmentName2"]').val(),
            attachmentId:$('[name="attachmentId"]').val(),
            attachmentName:$('[name="attachmentName"]').val(),
            attachmentId3:$('[name="attachmentId3"]').val(),
            attachmentName3:$('[name="attachmentName3"]').val(),
            attachmentId4:$('[name="attachmentId4"]').val(),
            attachmentName4:$('[name="attachmentName4"]').val()
        };
        $.ajax({
            url:"../../sys/updateInterfaceInfo",
            type:"post",
            datatType:"json",
            data:datas,
            success:function(data){
                $.layerMsg({content:"<fmt:message code="interfaceSetting.th.interface" />",icon:1},function () {
//                    parent.locationReload();
                    window.location.reload();
                })

            }
        })
    }
    function buildThemeSelect(){
        $.ajax({
            url:"../../code/GetDropDownBox",
            type:"get",
            datatType:"json",
            data:{
                CodeNos:'loginTmpl'
            },
            success:function(data){
                if(data && data.loginTmpl){
                    var optionStr = '';
                    data.loginTmpl.forEach(function(v,i){
                        optionStr += '<option value="'+v.codeNo+'">'+v.codeName+'</option> ';
                    })
                   // $('#theme').html(optionStr);
                }

            }
        })
    }
    $(function () {


    $.ajax({
        url:"../../sys/getInterfaceInfo",
        type:"post",
        datatType:"json",
        //data:datas,
        success:function(data){
            var fileNumber=data.object.fileNumber;
            var ieTitle=data.object.ieTitle;
            var status_text=data.object.statusText;
            var log_text=data.object.logOutText;
            var title =data.object.title;
            var widthpic=data.object.avatarWidth;
            var heightpic=data.object.avatarHeight;
            var datatwo=data.object;

            var str='<table class="TableBlock" align="center" style="border-collapse: collapse;width:685px">' +
                '<tbody>'
                +function () {
                    if($.cookie('company')=='1001'){
                        return '<tr>\
                    <td class="TableHeader" colspan="2">\
                    <img src="/img/commonTheme/theme1/icon_login.png" alt="" style="margin-right: 6px;"><b class="charstyle"><fmt:message code="interfaceSetting.th.LoginInterface" /></b>\
                    </td></tr>\
                    <tr>\
                    <td class="TableData" id="sign_in"><fmt:message code="interfaceSetting.th.LoginInterfaceTemplate" /></td><td>\
                    <select name="" id="model_sytle">\
                              <option value="1"><fmt:message code="interfaceSetting.th.FutureUniverse" /></option>\
                    <option value="2"><fmt:message code="interfaceSetting.th.DeepElegance" /></option>\
                    <option value="4"><fmt:message code="interfaceSetting.cityLight" /></option>\
                    <option value="5"><fmt:message code="interfaceSetting.impression" /></option>\
                    <option value="6"><fmt:message code="interfaceSetting.red" /></option>\
                    <option value="3"><fmt:message code="interfaceSetting.wash" /></option>\
                    </select></td>\
                    </tr>\
                    <tr>\
                    <td><fmt:message code="interfaceSetting.th.Logo" /></td>\
                    <td style="position:relative">\
                    <input type="file" name="file" id="uploadinputimg"  style="position:absolute;z-index:10;background: red;\
            width: 50px;\
            left: 20px;opacity:0;\
            top: 5px;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0)"/>\
                    <a href="javascript:void(0)" class="chuan" style="position: absolute;\
                        z-index: 1;\
                        top: 9px;\
                        color: #fff;\
                        text-decoration: none;\
                        left: 24px;\
                        padding: 2px 10px;\
                        border-radius: 4px;\
                        background: cornflowerblue;"><fmt:message code="global.th.upload" /></a>\
                    <a href="javascript:void(0)" style="position: absolute;\
                        z-index: 1;\
                        top: 9px;\
                        text-decoration: none;\
                        left: 94px;\
                        padding: 2px 10px;\
                        border-radius: 4px;display:none;" class="yulan"><fmt:message code="global.lang.view" /></a>\
                    <input type="hidden" name="attachmentId2">\
                    <input type="hidden" name="attachmentName2">\
                    <span style="width: 100%;float: left;margin-top: 28px;"><fmt:message code="global.lang.recommended" />。</span>\
                    </td>\
                     </tr>\
                     <tr>\
                     <td><fmt:message code="global.lang.mobile" /></td>\
                     <td style="position:relative">\
                     <input type="file" name="file" id="uploadinputimgIphone"  style="position:absolute;z-index:10;background: red;\
                     width: 50px; left: 20px;opacity:0;top: 5px;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0)"/>\
                     <a href="javascript:void(0)" class="chuan" style="position: absolute;\
                      z-index: 1;\
                      top: 9px;\
                      color: #fff;\
                      text-decoration: none;\
                      left: 24px;\
                      padding: 2px 10px;\
                      border-radius: 4px;\
                     background: cornflowerblue;"><fmt:message code="global.th.upload" /></a>\
                     <a href="javascript:void(0)" style="position: absolute;z-index: 1; top: 9px;text-decoration: none; left: 94px; padding: 2px 10px; border-radius: 4px;display:none;" class="yulan"><fmt:message code="global.lang.view" /></a>\
                    <input type="hidden" name="attachmentId3"> <input type="hidden" name="attachmentName3">\
                    <span style="width: 100%;float: left;margin-top: 28px;"><fmt:message code="global.th.upBoot" />。</span>\
                    </td>\
                    </tr> \
                     <tr>\
                    <td><fmt:message code="global.th.seting" /></td>\
                    <td><input type="text" style="width:280px;" name="loginLiterals"/></td>\
                    </tr>\
                    <tr>\
                    <td><fmt:message  code="interfaceSetting.th.ArchivalFilingNumber" />：</td>\
                    <td><input class=""style="width:280px;" id="document_num" value="'+fileNumber+'"></td>' +
                        '</tr>'
                    }else {
                        return ''
                    }
                }()+''+
                '<tr>' +
                '<td colspan="2" class="TableHeader">' +
                '<img src="/img/commonTheme/theme1/icon_webtitle.png" alt="" style="margin-right: 6px;margin-top: -5px;"><b class="charstyle"><fmt:message code="interfaceSetting.th.BrowserTitle" /></b>\
                </td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableData" id="" style="width: 189px;"><fmt:message code="interfaceSetting.th.BrowserTitle" />：</td>\
            <td nowrap="" class="TableData" id="win_title">\
            <input type="text" name="IE_TITLE" \
            class="BigInput" size="40" maxlength="100" style="width:280px" \
            value="'+ieTitle+'" id="ie_title">&nbsp;</td></tr><tr><td colspan="2" ' +
                'class="TableHeader">' +
                '<img src="/img/commonTheme/theme1/icon_mainInterface.png" alt="" style="margin-right: 6px;margin-top: -5px;"><b class="charstyle"><fmt:message code="interfaceSetting.th.Main" /></b>\
                </td>\
                </tr>\
                <tr style="display: none;">\
                <td nowrap="" class="TableData"><fmt:message code="interfaceSetting.th.MainInterface" />：</td>\
            <td nowrap="" class="TableData">\
            <textarea class="BigInput" cols="44" rows="3" id="status_text"></textarea>\
            <br><fmt:message code="interfaceSetting.th.MultipleLines" /> </td> \
                </tr>\
                      <tr>\
                        <td><fmt:message code="global.th.master" /></td>\
                        <td style="position:relative">\
                        <input type="file" name="file" id="uploadinputimgs"  style="position:absolute;z-index:10;background: red;\
            width: 50px;\
            left: 20px;opacity:0;\
            top: 5px;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0)"/>\
                        <a href="javascript:void(0)" class="chuan" style="position: absolute;\
                        z-index: 1;\
                        top: 9px;\
                        color: #fff;\
                        text-decoration: none;\
                        left: 24px;\
                        padding: 2px 10px;\
                        border-radius: 4px;\
                        background: cornflowerblue;"><fmt:message code="global.th.upload" /></a>\
                         <a href="javascript:void(0)" style="position: absolute;\
                        z-index: 1;\
                        top: 9px;\
                        text-decoration: none;\
                        left: 84px;\
                        padding: 2px 10px;\
                        border-radius: 4px;display:none;"\
                       class="yulan"><fmt:message code="global.lang.view" /></a>\
                        <input type="hidden" name="attachmentId">\
                        <input type="hidden" name="attachmentName">\
                         <span style="width: 100%;float: left;margin-top: 28px;"><fmt:message code="global.lang.main" />。</span>\
                        </td>\
                    </tr>\
                  <tr>\
                  <td><fmt:message code="global.lang.interface" /></td>\
                 <td style="position:relative">\
                 <input type="file" name="file" id="uploadinputimgIphoneLogin"  style="position:absolute;z-index:10;background: red;\
                 width: 50px; left: 20px;opacity:0;top: 5px;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0)"/>\
                 <a href="javascript:void(0)" class="chuan" style="position: absolute;\
                  z-index: 1;\
                  top: 9px;\
                  color: #fff;\
                  text-decoration: none;\
                  left: 24px;\
                 padding: 2px 10px;\
                 border-radius: 4px;\
                 background: cornflowerblue;"><fmt:message code="global.th.upload" /></a>\
                <a href="javascript:void(0)" style="position: absolute;z-index: 1; top: 9px;text-decoration: none; left: 84px; padding: 2px 10px; border-radius: 4px;display:none;" class="yulan"><fmt:message code="global.lang.view" /></a>\
                <input type="hidden" name="attachmentId4"> <input type="hidden" name="attachmentName4">\
                                         <span style="width: 100%;float: left;margin-top: 28px;"><fmt:message code="global.lang.width" />。</span>\
                </td>\
                </tr> \
                <tr>\
                <td colspan="2" class="TableHeader">\
                <img src="/img/commonTheme/theme1/icon_interfaceTitle.png" alt="" style="margin-right: 6px;margin-top: -5px;"><b class="charstyle"><fmt:message code="interfaceSetting.th.InterfaceTopics" /></b>\
                </td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableData"><fmt:message code="interfaceSetting.th.SelectInterface" />：</td>\
            <td nowrap="" class="TableData">\
            <input type="checkbox" name="THEME_SELECT" id="theme_select" checked="checked">\
            <label for="THEME_SELECT"><fmt:message code="interfaceSetting.th.AllowsSelectInterface" /></label>\
                </td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableData"><fmt:message code="interfaceSetting.th.Default" />：</td>\
            <td nowrap="" class="TableData">\
            <select name="THEME" id="theme">\
                <option value="6"><fmt:message code="controller.th.er" /></option>  \
                <option value="7"><fmt:message code="controller.th.san" /></option>\
                <option value="3"><fmt:message code="controller.th.si" /></option>\
                <option value="4"><fmt:message code="controller.th.gm" /></option>\
                <option value="5"><fmt:message code="controller.th.dge" /></option>\
                </select>\
                </td>\
                \
                </tr>\
                <tr>\
                <td nowrap="" class="TableHeader" colspan="2">\
                <img src="/img/commonTheme/theme1/icon_userImage.png" alt="" style="margin-right: 6px;margin-top: -5px;"><b class="charstyle"><fmt:message code="interfaceSetting.th.UserAvatar" /></b>\
                </td>\
                </tr>\
                <tr>\
                <td><fmt:message code="interfaceSetting.th.UserUploadAvatar" />：</td>\
            <td nowrap="" class="TableData">\
            <input type="checkbox" name="" id="upload_head" checked="checked">\
            <label for="THEME_SELECT"><fmt:message code="interfaceSetting.th.AllowUpload" /></label>\
               </td>\
               </tr>\
               <tr><td><fmt:message code="interfaceSetting.th.MaximumWidth" />：</td>\
            <td nowrap="" class="TableData">\
            <input type="text" name="" class="BigInput" \
            size="10" maxlength="100" value="'+widthpic+'" id="width_max" ' +
                'style="width:50px">&nbsp; <fmt:message code="interfaceSetting.th.pixel" /></td>\
                </td>\
                </tr>\
                <tr>\
                <td><fmt:message code="interfaceSetting.th.MaximumHeight" />：</td>\
            <td nowrap="" class="TableData">\
            <input type="text" name="" class="BigInput" size="10" \
            maxlength="100" value="'+heightpic+'" id="height_max" ' +
                'style="width:50px">&nbsp;<fmt:message code="interfaceSetting.th.pixel" /> </td> \
                </td>\
                </tr>\
                <tr>\
                <td colspan="2" class="TableHeader">\
                <img src="/img/commonTheme/theme1/icon_tishiText.png" alt="" style="margin-right: 6px;"><b class="charstyle"><fmt:message code="interfaceSetting.th.CancelPrompt" /></b>\
                </td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableData" width="150"><fmt:message code="interfaceSetting.th.clicks" />：</td>\
            <td nowrap="" class="TableData">\
            <textarea name="LOG_OUT_TEXT" class="BigInput" cols="44" rows="3" id="log_out_text"><fmt:message code="interfaceSetting.th.leave" /></textarea>\
                <br>\
                </td>\
                </tr>\
                <tr>\
                <td nowrap="" colspan="2" class="TableData TableHeader">\
                <img src="/img/commonTheme/theme1/icon_PCTitle.png" alt="" style="margin-right: 6px;margin-top: -5px;"><b class="charstyle"><fmt:message code="global.lang.clinet" /></b>\
                </td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableData"><fmt:message code="interfaceSetting.th.WindowTitle" />：</td>\
            <td nowrap="" class="TableData">\
            <input type="text" name="IM_WINDOW_CAPTION" \
            class="BigInput" size="40" maxlength="100"\
             value="<fmt:message code="title.login.txt"/>" style="width:280px" id="wi_title">&nbsp;</td>\
            </tr>\
            <tr>\
            <td nowrap="" class="TableControl" colspan="2" align="center">\
            <div onclick="saveData();" class="savebutton"><span><fmt:message code="global.lang.ok"/></span></div>\
                </td>\
                </tr>\
                </tbody>\
                </table>';
            $(".tab").html(str);
            parent.strsecced=datatwo.logOutText;
            $('[name="loginLiterals"]').val(datatwo.loginLiterals)

            $('[name="attachmentId2"]').val(datatwo.attachmentId2)
            $('[name="attachmentName2"]').val(datatwo.attachmentName2)
            if(datatwo.attachment2.length!=0) {
                $('[name="attachmentName2"]').siblings('.yulan').show()
                $('[name="attachmentName2"]').siblings('.yulan').attr('data-url', '/xs?' + datatwo.attachment2[0].attUrl)
            }
            $('[name="attachmentId"]').val(datatwo.attachmentId)
            $('[name="attachmentName"]').val(datatwo.attachmentName)

            if(datatwo.attachment.length!=0) {
                $('[name="attachmentName"]').siblings('.yulan').show()
                $('[name="attachmentName"]').siblings('.yulan').attr('data-url', '/xs?' + datatwo.attachment[0].attUrl)
            }
            $('[name="attachmentId3"]').val(datatwo.attachmentId3)
            $('[name="attachmentName3"]').val(datatwo.attachmentName3)
            if(datatwo.attachment3.length!=0) {
                $('[name="attachmentName3"]').siblings('.yulan').show()
                $('[name="attachmentName3"]').siblings('.yulan').attr('data-url', '/xs?' + datatwo.attachment3[0].attUrl)
            }
            $('[name="attachmentId4"]').val(datatwo.attachmentId4)
            $('[name="attachmentName4"]').val(datatwo.attachmentName4)
            if(datatwo.attachment4.length!=0) {
                $('[name="attachmentName4"]').siblings('.yulan').show()
                $('[name="attachmentName4"]').siblings('.yulan').attr('data-url', '/xs?' + datatwo.attachment4[0].attUrl)
            }
            $('#theme_select').val(datatwo.themeSelect);
            $('#upload_head').val(datatwo.avatarUpload);
            buildThemeSelect();

            $('#uploadinputimg').fileupload({//加载上以后启动上传
                dataType:'json',
                url:'/upload?module=interface',
                done: function (e, data) {
                    var datas = data.result.obj;
                    var strid = datas[0].attachId;
                    var strname = datas[0].attachName;
                    $('[name="attachmentId2"]').val(datas[0].aid+'@'+datas[0].ym+'_'+strid+',');
                    $('[name="attachmentName2"]').val(strname+'*');
                    $(this).siblings('.yulan').attr('data-url','/xs?'+datas[0].attUrl);
                    $(this).siblings('.yulan').show();
//                    $(this).siblings('.sczs').html(' <img style="width:100%;height:100%;position: absolute;top:0;left:0" src="/xs?'+datas[0].attUrl+'" />\
//                        <b style="    position: absolute;\
//                        color: red;\
//                        right: -2px;\
//                        top: -10px;\
//                        font-weight: bold;cursor: pointer;">x</b>')
                }
            });



            $('#uploadinputimgs').fileupload({//加载上以后启动上传
                dataType:'json',
                url:'/upload?module=interface',
                done: function (e, data) {
                    var datas = data.result.obj;
                    var strid = datas[0].attachId;
                    var strname = datas[0].attachName;
                    $('[name="attachmentId"]').val(datas[0].aid+'@'+datas[0].ym+'_'+strid+',');
                    $('[name="attachmentName"]').val(strname+'*');
                    $(this).siblings('.yulan').attr('data-url','/xs?'+datas[0].attUrl);
                    $(this).siblings('.yulan').show();
                }
            });
            $('#uploadinputimgIphone').fileupload({//加载上以后启动上传
                dataType:'json',
                url:'/upload?module=interface',
                done: function (e, data) {
                    var datas = data.result.obj;
                    var strid = datas[0].attachId;
                    var strname = datas[0].attachName;
                    $('[name="attachmentId3"]').val(datas[0].aid+'@'+datas[0].ym+'_'+strid+',');
                    $('[name="attachmentName3"]').val(strname+'*');
                    $(this).siblings('.yulan').attr('data-url','/xs?'+datas[0].attUrl);
                    $(this).siblings('.yulan').show();
                }
            });
            $('#uploadinputimgIphoneLogin').fileupload({//加载上以后启动上传
                dataType:'json',
                url:'/upload?module=interface',
                done: function (e, data) {
                    var datas = data.result.obj;
                    var strid = datas[0].attachId;
                    var strname = datas[0].attachName;
                    $('[name="attachmentId4"]').val(datas[0].aid+'@'+datas[0].ym+'_'+strid+',');
                    $('[name="attachmentName4"]').val(strname+'*');
                    $(this).siblings('.yulan').attr('data-url','/xs?'+datas[0].attUrl);
                    $(this).siblings('.yulan').show();
                }
            });


            $("#model_sytle").val(data.object.template);
            $("#theme").val(data.object.theme);
            $("#status_text").val(status_text);
            $("#log_out_text").val(log_text);
            $("#wi_title").val(title);
        }
    });
    $(document).delegate('.yulan','click',function () {
        var str='<div style="z-index: 1000;position: fixed;top: 0;left: 0;right: 0;bottom: 0;' +
            'background: rgba(111,111,111,.5)"><img width="165" height="61"' +
            'style="z-index: 1000;position: fixed;top: 50%;margin-top: -30px;left: 50%;margin-left: -82px" src="'+$(this).attr('data-url')+'" alt="">' +
            '<b class="guanbi" style="cursor:pointer;color: red;font-size: 18px;font-weight: bold;position: fixed;top: 76px;right: 20px;">x</b></div>';
        $('body').append(str)
    })
    $(document).delegate('.guanbi','click',function () {
        $(this).parent().remove()
    })
 



})
</script>
</body>
</html>