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
<head >
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <title></title>
    <link rel="stylesheet" href="../../css/workflow/work/m/style.css">
    <style>
        @font-face {
            font-family: PingFangSC-Regular, sans-serif; /*这里是说明调用来的字体名字*/
            src: url('/css/base/pingf.ttf'); /*这里是字体文件路径*/
        }
        body{
            font-size: 12px;
            font-family: PingFangSC-Regular, sans-serif!important; /*这里是说明调用来的字体名字*/
        }
        .ui-dialog{
            margin-left: 0px !important;
            margin-top: -50px !important;
        }
        .main2{background: #efefef;margin-top: 0px;}
        .file {
            position: relative;
            display: inline-block; 
            background: #007df8;
            border: 1px solid #007df8;
            border-radius: 2px;
            padding: 0px 6px;
            overflow: hidden;
            color: #fff;
            text-decoration: none;
            text-indent: 0;
            line-height: 20px;
        }
        .uploadbox p{margin-bottom: 5px;color: #095de0;}
        .grey{
            color: #333;
        }
        .grey1{
            color: #333;
        }
        table{
            border-collapse: inherit;
        }
        .gapp_input {
            height: 45px;
            margin-left: 0px;
            border-width: 0px;
            width: 100%;
            border: 1px solid #e4e4e4;
            border-radius: 4px;
            text-indent: 10px;
        }
        .type_done{border: none;background-color: #3984ff;padding: 13px 35px;font-size: 16px;margin-top: 20px;font-weight: bold}
        #deleteBtn{background-color: #ec5959}
        .done{height: auto;border-bottom:none;margin-bottom: 15px;}
        .head_toptitle{font-size: 14px;height: 14px;line-height: 14px}
        .head_top{
            height: 98px;
            border-top: none;
            padding: 0 16px;
        }
        #basic_infor .table{
            padding-left: 16px;
            padding-right: 16px;
            padding-bottom: 20px;
        }
        #basic_infor .table .td1{
            position: relative;
            width: 110px;
        }
        #basic_infor .table .td1 div{
            min-height: 36px;
            margin: 12px 0 0 0;
            line-height: 36px;
            border-right: none;
        }
        #basic_infor .table .td2 {
            position: relative;
            line-height: 36px;
            padding-left: 10px;
            padding-right: 5px;
            padding-top: 12px;
            padding-bottom: 0;
        }
        @media screen and (min-width: 321px) and (max-width:360px){
            #lctbtn{
                margin-left: 20px!important;
                padding: 13px 24px!important;
            }
            #deleteBtn{
                margin-left: 20px!important;
            }
            #backBtn{
                margin-left: 20px!important;
            }
            .type_done{
                margin-left: 9px;
                padding: 13px 32px;
            }
        }
        @media screen and (max-width: 320px){
            #lctbtn{
                padding: 13px 19px!important;
                margin-left: 22px!important;
            }
            #deleteBtn{
                margin-left: 22px!important;
            }
            #backBtn{
                margin-left: 22px!important;
            }
            .type_done{
                padding: 12px 26px;
                font-size: 15px;
            }
        }
        .td2 img{
            float: left;
            width: 58px;
            height: 58px;
            margin: 0!important;
        }
        .td2 .qrcode img{
            float: left;
            width: 100%;
            height: 100%;
        }
        .head_top{
            margin-top: 14px;
        }
        .weight{
            font-weight: 300;
        }
        .head_top ul li span{
            letter-spacing: 1px;
        }
        #basic_infor .basic_infor_title{
            background: #f5f5f9;
            height: 32px;
            padding: 0 16px;
        }
        #basic_infor .basic_infor_title .basic_infor{
            margin-left: 6px;
            line-height:32px;
        }
        #basic_infor .basic_infor_title .icon{
            margin-top: 8px;
            height: 16px;
            width: auto;
        }
        #content input,#content textarea,#content select{
            border:1px solid #e4e4e4!important;
            font-size: 16px;
            font-family: PingFangSC-Regular, sans-serif!important; /*这里是说明调用来的字体名字*/
            -webkit-appearance: none;
            /*background-color: #fffde9;*/
            background-color: #fff9c1;
        }
        #content input[data-type="checkbox"]{
            -webkit-appearance: checkbox;
            background: #fff!important;
            opacity: 0;
        }
        #content input[data-type="radio"]{
            -webkit-appearance: radio;
            background: #fff!important;
        }
        #content input.grey,#content textarea.grey{
            background: #f8f8f8!important;
        }
        textarea{
            padding: 10px 0;
        }
        input:disabled,textarea:disabled{
            opacity:1;
        }
        .gapp_textarea{
            border: 1px solid #e4e4e4;
            border-radius: 4px;
            padding:10px;
            margin-top: 10px;
            margin-bottom: 0;
            margin-left: 0px;
            box-sizing: border-box;
        }
        .hqbox{
            margin-bottom: 10px;
        }
        input[data-type="calendar"]{
            height:45px!important;
            background: url("/img/workflow/work/workformh5/calendar1.png") no-repeat 95% 12px;
        }
        input[type="radio"],input[type="checkbox"] {
            width: 20px;
            height: 20px;
        }
        label {
            position: absolute;
            left: 9px;
            top: 15px;
            width: 20px;
            height: 20px;
            border-radius: 50%;
            border: 1px solid #e4e4e4;
            background: #fff;
        }

        /*设置选中的input的样式*/
        /* + 是兄弟选择器,获取选中后的label元素*/
        input:checked+label {
            background-color: #fe6d32;
            border: 1px solid #fe6d32;
        }

        input:checked+label::after {
            position: absolute;
            content: "";
            width: 5px;
            height: 10px;
            top: 3px;
            left: 6px;
            border: 2px solid #fff;
            border-top: none;
            border-left: none;
            transform: rotate(45deg)
        }
        .gapp_select{
            height: 45px;
            margin-left: 0px;
            border: 1px solid #e4e4e4;
            border-radius: 4px;
            text-indent: 10px;
            background: url("/img/workflow/work/workformh5/selecthei.png") no-repeat 95% 12px;
        }
        .gapp_textarea{
            height: 130px;
        }
        .textareaclass{
            position: absolute;
            top: 0;
        }
        .fl{
            float: left;
        }
        .bgweijinyong{
            /*background:#fffde9;*/
            background:#fff9c1;
        }
        .bgyijingyong{
            background:#f8f8f8;
        }
        .uploadbox{
            font-size: 11pt;
        }
    </style>
</head>
<body style="display: none">
<div class="head_top">
    <span class="head_toptitle" style="color: #3682e1;font-size: 18px;font-weight: 900;"><span style="letter-spacing: 1px;"><fmt:message code="workflow.th.liushui" />&nbsp;</span><span id="flowRunId"></span></span>
    <ul style="margin-top: 10px;color: #333;font-weight: 300;">
        <li><span class="head_toptitle weight" id="flowName"><fmt:message code="workflow.th.processname" />：</span></li>
        <li style="margin-top: 7px"><span class="head_toptitle weight" ><fmt:message code="workflow.th.ProcessInitiator" />：</span><span id="flowBeginUser" class="head_toptitle" style="margin-left: 2px;"></span></li>
        <li style="margin-top: 7px"><span class="head_toptitle weight" ><fmt:message code="workflow.th.ProcessInitiation" />：</span><span id="flowBeginTime" class="head_toptitle" style=" margin-left: 2px;"></span></li>
    </ul>
</div>
<div id="basic_infor">
    <div class="basic_infor_title">
        <img src="/img/workflow/work/workformh5/leftpng.png" alt="" class="icon">
        <div class="basic_infor" style="font-size: 16px;color: #333;margin-left: 6px;font-weight: 300"><fmt:message code="url.th.EssentialInformation" /></div>
        <div class="basic_infor_title_link">
            <a href="#"></a>
        </div>
    </div>
    <div class="table">
        <table  id="content" style="font-size: 16px;">
        </table>
    </div>
    <div class="done">
        <button class="type_done" id="lctbtn" style="padding: 13px 27px;margin-left: 20px;"><fmt:message code="workflow.th.chart" /></button>
        <button class="type_done" id="saveBtn"><fmt:message code="global.lang.save" /></button>
        <button class="type_done" id="turnBtn" style="  margin-left: 10px;"><fmt:message code="workflow.th.Transfer" /></button>
        <button class="type_done" style="display: none;"><fmt:message code="workflow.th.Entrust" /></button>
        <button class="type_done" id="deleteBtn"  style="margin-left: 20px;"><fmt:message code="menuSSetting.th.deleteMenu" /></button>
        <button class="type_done" id="backBtn" style="background-color: #ec5959;display: none;margin-left: 20px;"><fmt:message code="workflow.th.backbtn" /></button>
    </div>
    <!-- 会签意见区-->
    <div class="basic_infor_title">
        <img src="/img/workflow/work/workformh5/leftpng.png" alt="" class="icon">
        <div class="basic_infor" style="font-size: 16px;color: #333;margin-left: 6px;font-weight: 300"><fmt:message code="work.th.CountersignedArea" /></div>
        <div class="basic_infor_title_link">
            <a href="#"></a>
        </div>
    </div>

    <div class="signBox">
        <textarea rows="4" id="signText" class="gapp_textarea" data-key="0" data-field-type="020000" data-must="0" data-is-write="1" name="COL101214452217682884218739" placeholder=""></textarea>
        <div class="hqbox"></div>
    </div>
    <%--<div class="basic_infor_title">--%>
        <%--<img src="/img/workflow/work/workformh5/leftpng.png" alt="" class="icon">--%>
        <%--<div class="basic_infor"><fmt:message code="email.th.file" /></div>--%>
        <%--<div class="basic_infor_title_link">--%>
            <%--<a href="#"></a>--%>
        <%--</div>--%>
    <%--</div>--%>

    <div class="basic_infor_title">
        <img src="/img/workflow/work/workformh5/leftpng.png" alt="" class="icon">
        <div class="basic_infor" style="font-size: 16px;color: #333;margin-left: 6px;font-weight: 300"><fmt:message code="email.th.file" /></div>
        <div class="basic_infor_title_link">
            <a href="#"></a>
        </div>
    </div>
    <div style="padding-bottom: 8px;">
        <ul class="uploadbox" style="">

        </ul>
        <div class="photo_box" style="margin: 20px;">

        </div>
    </div>
    <div style="width: 100%;height: 45px;" class="choose_box">
        <div style="width: 100%;text-align: center">
            <%--<img class="choosewj" src="/img/workflow/work/choose_img.png" alt="" onclick="btn1()" style="height:46px;width: 100%;margin-bottom: 40px">--%>
            <span style="padding: 13px 80px;background: #3984ff;font-size: 16px;
font-weight: bold; border-radius: 2px;color:#fff;" onclick="btn1()">选择文件</span>
        </div>
    </div>


</div>
<div class="lct" style="display: none">
    <div class="lct_title">
        <fmt:message code="workflow.th.chart" />
    </div>
    <div class="lct_body">
        <ul class="lct_info">
            <li><span class="head_toptitle weight" style="color:#0074ec;"><fmt:message code="workflow.th.SerialRegistration" /></span></li>
            <li><span class="head_toptitle weight" ><fmt:message code="workflow.th.HostedAdministrator" /></span><span class="head_toptitle" style="color: #73a282;margin-left: 2px;"><fmt:message code="workflow.th.second" /></span></li>
            <li><span class="head_toptitle weight" ><fmt:message code="workflow.th.StartedOn" />：</span><span class="head_toptitle" style="font-weight: 600;    margin-left: 2px;">2017-07-26 19:24</span></li>
        </ul>
    </div>
</div>
<script src="../../js/jquery/jquery-1.9.1.js"></script>
<script src="/lib/layer/layer.js"></script>
<script src="../../js/template.js"></script>
<script src="../../lib/laydate/laydate.js"></script>
<script src="../../js/mustache.min.js"></script>
<script src="../../js/base/base.js"></script>
<script src="/lib/layer/layer.js"></script>
<script src="../../js/workflow/work/workform.js"></script>
<script src="../../js/workflow/work/m/workformh5.js"></script>
<script src="../../lib/jquery.form.min.js" ></script>
<script src="../../js/jquery/jquery.cookie.js"></script>
<script src="../../lib/qrcode.js"></script>
<!-- 金格签章 -->

<link rel="stylesheet" href="../../lib/kinggrid/dialog/artDialog/ui-dialog.css">
<link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.css">

<script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.min.js"></script>
<script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.plus.min.js"></script>
<script type="text/javascript" src="../../lib/kinggrid/dialog/artDialog/dialog.js"></script>

<!-- html签章核心JS -->
<script type="text/javascript" src="../../lib/kinggrid/signature.min.js"></script>
<!-- PC端附加功能 -->
<%--<script type="text/javascript" src="../../lib/kinggrid/signature.pc.min.js"></script>--%>
<!-- 移动端端附加功能 -->
<link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.mobile.css">
<script type="text/javascript" src="../../lib/kinggrid/signature.mobile.min.js"></script>
<%--<script src="/js/base/vconsole.min.js"></script>--%>
<script type="text/javascript" src="../../lib/kinggrid/signature_pad.min.js"></script>
<script type="text/javascript" src="../../lib/kinggrid/jquery.timer.dev.js"></script>
<script>
    /**********************与移动端对接webview的初始化调用函数*****************************/
    function ready(){
        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
            rightTitle('<fmt:message code="workflow.th.Transfer" />','321','turn');
        } else if (/(Android)/i.test(navigator.userAgent)) {
            //alert(navigator.userAgent);
            Android.rightTitle('<fmt:message code="workflow.th.Transfer" />','321','turn');
        }
    }
    /**********************结束*****************************/
    /**********************与移动端交互 调用移动端选取文件的方法*****************************/
    function btn1(){
        $('.choosewj').attr('src','/img/workflow/work/choose_imgclick.png')
        btn('imgadd1',0)
    }
    function btn(cb,num){
        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
            //alert(navigator.userAgent);
            addImage(cb,num);
        } else if (/(Android)/i.test(navigator.userAgent)) {
            //alert(navigator.userAgent);
            Android.addImage(cb,num);
        }
        $('.choosewj').attr('src','/img/workflow/work/choose_img.png')
    }
    function imgadd1(img,name,type){

        var arr = img.split(',');
        var name_arr = name.split(',');
        var http = 'http://'+ window.location.host;

        if(type == 1){
            var img = '';
            for(var i=0;i<arr.length -1;i++){
                var url =  arr[i];

                img += '<img id="blah"  src="'+ arr[i] +'" onclick="anios($(this))" style="width:50px;height:50px;margin-right: 10px;margin-bottom: 10px;" url="'+url +'" name="'+ name_arr[i] +'">';
            }
            $('.photo_box').append(img);
        }else{
            var name_str = '';
            for(var i=0;i<name_arr.length -1;i++){
                var url = http + arr[i];
                name_str += '<p onclick="anios($(this))" url="'+url+'"  name="'+ name_arr[i] +'">'+ name_arr[i] +'</p>'
            }
            $('.uploadbox').css('min-height', '50px')
            $('.uploadbox').append(name_str);
        }
    }
    function anios(e){
        var url = e.attr('url');
        var name = e.attr('name');
        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
            overLookFile(url,name);
        } else if (/(Android)/i.test(navigator.userAgent)) {
            Android.overLookFile(url,name);
        }
    }
    function anios1(e){
        var url = e.attr('url');
        var name = e.attr('names');
        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
            overLookFile(url,name);
        } else if (/(Android)/i.test(navigator.userAgent)) {
            Android.overLookFile(url,name);
        }
    }
    /**********************结束*****************************/
    /**********************与移动端交互 页面加载后 将附件的图片添加 初始化页面附件查看方式*****************************/
    imptarget = '';
    function phoneimgupload(e) {
        imptarget = $(e);
        if($(e).attr('src') == '/img/fileupload.png'){
            btn("imgupload4",2)
        }else{
            btn("imgupload3",1)
        }
    }
    function imgupload3(img,name,type){
        var url = img.split(',')[0];
        var names = name.split(',')[0];
        var listStr = '<img name="'+imptarget.attr('name')+'" names="'+names+'" onclick="anios1($(this))" src="'+url+'" url="'+url+'" style="cursor: pointer;"  id="'+imptarget.attr('name')+'" title="'+imptarget.attr('title')+'" align="absmiddle" style=""  class="imgupload_data"    width="'+imptarget.attr('width')+'" height="'+imptarget.attr('height')+'"/>';
        imptarget.before(listStr);
        imptarget = '';
    }
    function imgupload4(img,name,type){
        var arr = img.split(',');
        var name_arr = name.split(',');
        var http = 'http://'+ window.location.host;
        var iconImgType = {
            txt : '/img/icon_file.png',
            jpg : '/img/icon_image.png',
            png : '/img/icon_image.png',
            pdf :  '/img/icon_pdf.png',
            ppt : '/img/icon_ppt.png',
            pptx :  '/img/icon_ppt.png',
            doc : '/img/icon_word.png',
            docx : '/img/icon_word.png',
            xls :  '/img/icon_excel.png',
            xlsx :  '/img/icon_excel.png'
        };
        var attrnametype = name.split('.')[1];
        imptarget.attr('src',iconImgType[attrnametype])
        if(iconImgType[attrnametype] == undefined){
            imptarget.attr('src','/img/icon_file.png')
        }
        imptarget.attr('onclick','anios1($(this))')
        imptarget.attr('url',arr[0]);
        imptarget.attr('atturl',arr[0]);
        imptarget.attr('names',name_arr[0]);
    }
/*******************结束*****************************/

    $(function () {
//        var vConsole = new VConsole();
        function auto() {
            var width = $('#word').width() / 2;
            $('#word .table td').css('width', '' + width + '');
            var width1 = width - 62;
            $('#word .action').css('width', '' + width1 + '');
        }

        function dateclick(e) {
            laydate({
                elem: '#' + $(e).attr('target'),
                format: 'YYYY-MM-DD hh:mm:ss'
            });
        }

//        function uploadimg(data) {
//            $('#picture').val(data);
//            $('#picture').attr('value', data);
//        }

        $('img[data-type="fileupload"]').on('click',function(){
            if(!$(this).hasClass('grey')){
                if($(this).attr('src') == '/img/fileupload.png'){
                    phoneimgupload($(this));
                }
            }
        })
        $('img[data-type="imgupload"]').on('click',function(){
            if(!$(this).hasClass('grey')){
                if($(this).attr('src') == '/img/workflow/work/workformh5/addpng.png'){
                    phoneimgupload($(this));
                }
            }
        })
    });
</script>
</body>
</html>