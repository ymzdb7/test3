<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <%--<fmt:message code="global.page.first" />--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html;">
    <meta name="viewport"
          content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link rel="stylesheet" type="text/css" href="css/main/${sessionScope.InterfaceModel}/bootstrap-responsive.min.css"/>

    <link rel="stylesheet" type="text/css" href="css/main/${sessionScope.InterfaceModel}/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/main/${sessionScope.InterfaceModel}/index.css"/>
    <link rel="stylesheet" type="text/css" href="css/main/${sessionScope.InterfaceModel}/cont.css"/>
    <link rel="stylesheet" type="text/css" href="css/main/theme1/m_reset.css"/>
    <%--${sessionScope.InterfaceModel}--%>
    <script type="text/javascript" src="js/jquery/jquery-1.9.1.js"></script>
    <script src="lib/layer/layer.js"></script>
    <script src="js/base/base.js"></script>
    <script src="js/base/base.js"></script>
    <script type="text/javascript" src="js/main_js/index.js"></script>
    <script type="text/javascript" src="js/main_js/cont.js"></script>
    <script src="js/jquery/jquery.cookie.js"></script>
    <script src="lib/drag/drag.js"></script>
    <style>
        /*显示隐藏按钮*/
        .wenzi{color:white;
            position: absolute;top:5px;left:23px;}
        .show_off{
            position:absolute;top:5px;left:100px;padding:1px;padding-right: 0;
            width:37px;height:18px;background-image: url("../../../img/main_img/frame.png");
            background-repeat: no-repeat;color:#2b7fe0;font-size:9pt;
            background-size: 100% 100%;
        }
        .show_off span{
            width:18px;height:18px;display: inline-block;  cursor:pointer;
            background-repeat: no-repeat;background-size: 100% 100%;
        }
        .show_off_tag_bg{background-image: url("../../../img/main_img/bold_shadow.png");color:#ffffff;

        }
        .show_on {
            background-image: url("../../../img/main_img/frame1.png");
        }
        .show_on2 {
            background-image: url("../../../img/main_img/frame.png");

        }
        /*滑过一级菜单*/


        .apply_every_logo {
            width:10em;
            text-align: center;
        }
        .contain{
            height: 294px;
        }
        .apply_every_logo:hover {
            background: #e9f3ff;
        }

        .two_menu {
            color: #0f3b6d;
        }

        .clearfix:after {
            content: '';
            display: block;
            clear: both;
        }

        .richeng_title {
            width: 43%;
            line-height: 28px;
            margin-left: 4px;
            overflow: hidden; /*内容超出后隐藏*/
            text-overflow: ellipsis; /* 超出内容显示为省略号*/
            white-space: nowrap; /*文本不进行换行*/
        }

        .r_title {
            width: 32% !important;
            color: #1b5e8d;
        }

        .every_times {
            width: 50%;
            line-height: 27px;
            color: #919191;
            text-align: right;
        }

        /*点中状态下的一级class名*/

        .chedule_li {
            width: 100%;
            height: 41px !important;
            cursor: pointer;
        }

        .chedule_li div {
            float: left;
            margin-top: 7px;
        }
        .wenjian_list li{
            width:69px !important;
        }

        /*		.richeng_title{

                }*/
        .sanji .three {
            width: 100%;
            height: 30px;
        }

        /*	.sanji{
                background:#d5ebfa;
            }*/

        .three h1 {
            margin-left: 6%;
        }

        .side_all {
            /*width:0px;*/
            height: 100%;
            /*background: red;*/
            position: absolute;
            right: 0px;
            top: 0px;
            z-index: 9999999;
        }

        .checks {
            background: #fff;
        }

        .position {
            width: 0px;
            height: 100%;
            position: absolute;
            right: 0px;
            top: 0px;
            background: #fff;
            box-shadow: -2px 0 20px 0px #c4c4c4;
        }
        .cont_main>ul>li{
            background: #fff!important;
        }
        .button_img, .button_span {
            float: left;
        }

        .button_img {
            width: 15px;
            height: 20px;
            margin-left: 40%;
        }

        .shezhi_img {
            background: url(img/main_img/per_shezhi.png) 0px 3px no-repeat;
        }

        .suoding_img {
            background: url(img/main_img/per_suoding.png) 0px 3px no-repeat;
        }

        .zhuxiao_img {
            background: url(img/main_img/per_zhuxiao.png) 0px 3px no-repeat;
        }

        .button_chacked {
            background: #154d76;
        }

        .button_chacked span {
            color: #fff;
        }

        /*点击更换图片*/
        .button_chacked .shezhi_img {
            background: url(img/main_img/button_shezhi.png) 0px 3px no-repeat;
        }

        .button_chacked .suoding_img {
            background: url(img/main_img/button_suoding.png) 0px 3px no-repeat;
        }

        .button_chacked .zhuxiao_img {
            background: url(img/main_img/button_zhuxiao.png) 0px 3px no-repeat;
        }

        /*滑动更换图片*/
        #admin-side3 button:hover {
            background: #154d76;
        }

        #admin-side3 button:hover span {
            color: #fff;
        }

        #admin-side3 button:hover .shezhi_img {
            background: url(img/main_img/button_shezhi.png) 0px 3px no-repeat;
        }

        #admin-side3 button:hover .suoding_img {
            background: url(img/main_img/button_suoding.png) 0px 3px no-repeat;
        }

        #admin-side3 button:hover .zhuxiao_img {
            background: url(img/main_img/button_zhuxiao.png) 0px 3px no-repeat;
        }

        .c_head a {
            display: block;
        }



        /*			.more_chedule{
                        margin-top: 3px;
                    }*/
        .c_all {
            width: 35px;
            height: 20px;
            /*		background: #009;
                    color: #fff;*/
            background: #f0f0f0;
            color: #666;
            text-align: center;
            line-height: 20px;
            margin-top: 4px;
            border-radius: 4px;
            position: absolute;
            right: 169px;
            top: 2px;
        }

        /*新闻全部按钮的调整*/


        .c_head img {
            position: absolute;
            left: 7px;
            top: 8px;
        }

        .apply_all {
            padding-bottom: 6%;
        }



        .c_today {
            position: absolute;
            right: 129px;
            top: 2px;
        }

        .c_tom {
            position: absolute;
            right: 89px;
            top: 2px;
        }

        .c_nexttom {
            position: absolute;
            right: 49px;
            top: 2px;
        }

        .no_notice > img {
            margin-top: 2%;
        }

        .company {
            height: 41px;
            line-height: 41px;
            width: 97%;
        }

        .company img {
            width: 10%;
        }

        #tixing_tab_c ul li {
            margin-bottom: 8px;
        }

        #tixing_tab_c ul li .search_one_all {
            padding: 10px 0px;
        }

        #tixing_tab_c ul li .search_one_all img.custom_photo {
            /*width: 29px;*/
            /*height: 29px;*/
        }

        #tixing_tab_c ul li .custom_two > li {
            height: 40px;
            padding: 7px 0px;
        }

        #tixing_tab_c ul li .custom_two > li img {
            width: 30px;
            height: 30px;
            margin-left: 15px;
            float: left;
            margin-top: 8px;
        }

        #tixing_tab_c ul li .custom_two > li span {
            width: 16em;
            margin-left: 1em;
            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
            cursor: pointer;
            display: inline-block;
        }

        #tixing_tab_c ul li .custom_two > li label {
            display: inline-block !important;
            margin-bottom: 0px !important;
            font-size: 12px;

            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
        }

        .custom_close, .apply_close {
            float: right;
            margin-right: 1em;
        }

        .close {
            opacity: 1 !important;
        }

        img[src=""] {
            opacity: 0;
            filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0);
        }

        .mainstyle {
            width: 270px;
            height: 117px;
            margin-top: 20px;
            margin-left: 17px;
            position: relative;
        }

        .mainstyle:hover .subjectToUse {
            z-index: 1000;
        }

        .mainstyle.blue {
            background: url(/img/main_img/skin.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/skin.png',
                    sizingMethod='scale');
        }

        .mainstyle.blue.actives {
            background: url(/img/main_img/skintwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/skintwo.png',
                    sizingMethod='scale');
        }
        .e_title{
            height:20px;
        }
        .mainstyle.reds {
            background: url(/img/main_img/redzhengwu.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/redzhengwu.png',
                    sizingMethod='scale');
        }

        .mainstyle.reds.actives {
            background: url(/img/main_img/redzhengwutwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/redzhengwutwo.png',
                    sizingMethod='scale');
        }

        .mainstyle.chenjing {
            background: url(/img/main_img/chenjing.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/chenjing.png',
                    sizingMethod='scale');
        }

        .mainstyle.chenjing.actives {
            background: url(/img/main_img/chenjingtwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/chenjingtwo.png',
                    sizingMethod='scale');
        }

        .mainstyle.green {
            background: url(/img/main_img/green.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/chenjing.png',
                    sizingMethod='scale');
        }
        .mainstyle.green.actives {
            background: url(/img/main_img/greentwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/chenjingtwo.png',
                    sizingMethod='scale');
        }
        .mainstyle.dark_green {
            background: url(/img/main_img/dark_green.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/chenjing.png',
                    sizingMethod='scale');
        }
        .mainstyle.dark_green.actives {
            background: url(/img/main_img/dark_greentwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/chenjingtwo.png',
                    sizingMethod='scale');
        }

        .mainstyle.bluetwo {
            background: url(/img/main_img/bluetwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/skin.png',
                    sizingMethod='scale');
        }
        .mainstyle.bluetwo.actives {
            background: url(/img/main_img/bluetwos.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/skintwo.png',
                    sizingMethod='scale');
        }



        .mainstyle.redstwo {
            background: url(/img/main_img/redstwo.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/redzhengwu.png',
                    sizingMethod='scale');
        }

        .mainstyle.redstwo.actives {
            background: url(/img/main_img/redstwos.png) no-repeat;;
            background-size: contain;
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(
                    src='/img/main_img/redzhengwutwo.png',
                    sizingMethod='scale');
        }




        .subjectToUse {
            position: absolute;
            top: 4px;
            left: 7px;
            right: 6px;
            bottom: 10px;
            background: rgba(000, 000, 000, .3);
            text-align: center;
            border-radius: 4px;
            z-index: -1;
            cursor: pointer;
        }
        .e_mail li, .daily li, .tainer li, .new_total li{
            cursor: pointer;
        }
        .subjectToUse a {
            color: #fff;
            padding: 3px 15px;
            border-radius: 4px;
            display: inline-block;
            margin-top: 40px;
            background: #3c60e4;
        }

        .one_all:hover {
            cursor: pointer;
        }

        .apply_one_all:hover {
            cursor: pointer;
        }

        .search_one_all:hover {
            cursor: pointer;
        }

        .tab_c {
            overflow-y: auto;
        }

        .tab_cone {
            overflow-y: auto;
        }

        .cont {
            padding-bottom: 30px;
        }

        .every_logo {
            height: 117px;
        }

        .tab_ctwo a {
            font-size: 11pt;
        }

        #LockCode, #theLock {
            background: #2069d9;
        }

        #LockCode:hover {
            background: #3981f1;
        }

        #theLock:hover {
            background: #3981f1;
        }

        #xiaoWuLi li {
            float: left;
            display: inline-block;
            height: 20px;
            border-radius: 4px;
            line-height: 20px;
            margin: 4px;
            padding: 0;
            background: #e9e9e9;
            cursor: pointer;
            font-size: 8pt;
            color: #666;
        }

        #xiaoWuLi .strList {
            padding: 0px 3px;
        }

        .more_edu {
            float: left;
            position: absolute;
            right: 10px;
            width: 34px !important;
            height: 20px !important;
            border-radius: 3px;
            line-height: 20px;
            margin: 4px;
            padding: 0;
            background: #f3f3f3;
            cursor: pointer;
            font-size: 8pt;
            color: #666;
            cursor: pointer;
            text-align: center;
        }
        .two_all h1{
            width: 54%;
        }
		#iconCloseAll{
			display: inline-block;
			width: 50px;
			height: 50px;
			background: url("../../img/main_img/icon_closeAll.png") no-repeat;
			position: absolute;
			top: 32px;
			right: -50px;
			cursor: pointer;
            z-index:999999;
		}
		#iconCloseAll:hover{
			background: url("../../img/main_img/icon_closeFloat.png") no-repeat;
		}
        .cont_main ul.total>li{
            background: #fff;
            box-shadow: 0 2px 6px rgba(0,0,0,0.2)
        }
        .e_name:hover{
            color: #1b5e8d;
            cursor: pointer;
        }


        /*定义滚动条宽高及背景，宽高分别对应横竖滚动条的尺寸*/
        /*公告*/
        #admin-side0::-webkit-scrollbar,.people_wenjian::-webkit-scrollbar{
            width: 0px;
            height: 16px;
            background-color: #f5f5f5;
        }
        /*定义滚动条的轨道，内阴影及圆角*/
        #admin-side0::-webkit-scrollbar-track,.people_wenjian::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        /*定义滑块，内阴影及圆角*/
        #admin-side0::-webkit-scrollbar-thumb,.people_wenjian::-webkit-scrollbar-thumb{
            width: 0px;
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }
        /*定义滚动条宽高及背景，宽高分别对应横竖滚动条的尺寸*/
        /*公告*/
        #admin-side2::-webkit-scrollbar,.people_wenjian::-webkit-scrollbar{
            width: 0px;
            height: 16px;
            background-color: #f5f5f5;
        }
        /*定义滚动条的轨道，内阴影及圆角*/
        #admin-side2::-webkit-scrollbar-track,.people_wenjian::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        /*定义滑块，内阴影及圆角*/
        #admin-side2::-webkit-scrollbar-thumb,.people_wenjian::-webkit-scrollbar-thumb{
            width: 0px;
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }
        #rightSpan {
            width: 0;
            height: 0;
            border-top: 7px solid transparent;
            border-left: 8px solid #fff;
            border-bottom: 7px solid transparent;
            position: absolute;
            top: 41px;
            right: 20px;
            cursor: pointer;
            z-index: 111111;
        }
        .addOrReduce{
            position:absolute;top:12px;right:6px; width:28px;height:26px;background-size:100% 100%;background-repeat:no-repeat;  cursor:pointer;
        }
        .add_default{  background-image: url('/img/main_img/add_default.png');  }
        .add_click{  background-image: url('/img/main_img/add_click.png');  }
        .add_float{  background-image: url('/img/main_img/add_float.png');  }
        .reduce_click{ background-image: url('/img/main_img/reduce_click.png'); }
        .reduce_default{ background-image: url('/img/main_img/reduce_default.png'); }
        .reduce_float{ background-image: url('/img/main_img/reduce_float.png'); }
        .one_logo{
            margin-top:3%;
        }
        .contain{
            border:none;
        }
        .more{
            top:2px;
            font-size: 12px;
        }
        .sort{
            font-size: 12px;
        }
        .head{
            height: 107px;
            /*background: red;*/
        }
        .choose{
            margin-top:0px;
        }
        .gongzuoliu{
            margin-top: 0px;
        }
        .leftSpan{
            top:16px;
        }
        #rightSpan{
            top:16px;
        }
        #iconCloseAll{
            top:3px;
        }
        .header{
            position: relative;
            z-index:99999;
        }
        .total .bg_head{
            cursor: all-scroll;
        }
        .head{
            background-size: 100% 100%;
        }
        .sort{
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .tab_cone{
            height: 87%!important;
        }
        .he{
            position: absolute;
            top: -3px;
            right: -6px;
            background: red;
            color: #fff;
            border-radius: 100%;
            height: 20px;
            padding: 0 5px;
        }

    </style>
    <script>
function opensload() {

    if($('[src="workflow/work/workList"]').length!=0){
        $('[src="workflow/work/workList"]').prop('src','workflow/work/workList');
    }
    if($('[src="/document/makeADraft"]').length!=0){
        $('[src="/document/makeADraft"]').prop('src','/document/makeADraft');
    }
    if($('[src="document/inAbeyance"]').length!=0){
        $('[src="document/inAbeyance"]').prop('src','document/inAbeyance');
    }
    if($('[src="attendPage/backlogAttendLeave"]').length!=0){
        $('[src="attendPage/backlogAttendLeave"]').prop('src','attendPage/backlogAttendLeave');
    }
}
        function iebg() {
            if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.split(";")[1].replace(/[ ]/g, "") == "MSIE8.0") {
                $('.mainstyle').css('background', '#fff')
            }
        }
        function urlnewworkflow() {
            $('[url="workflow/new"]').click();
        }
        
        
        
        $(function () {
            $.ajax({
                type:'post',
                url:'/infoCenter/getInfoCenterOrder',
                dataType:'json',

                success:function(res){
                    if (res.flag) {
                        var data = res.data.split(",");
                        for (var i = 0; i < data.length; i++) {
                            if(data[i]!=''){
                                var add = $('#myTableGet').find('#'+data[i])
                                $(".total").append(add);
                            };
                        }
                        $("#myTableGet").remove();


                        $('.total').css('display','block');
                    }
                    $('.total>li').arrangeable({
                        dragSelector: '.bg_head'
                    });
                }
            })
            $('.total>li>.bg_head').css('cursor',' pointer');

            var sessionTypeStr = $('[name="sessionType"]').val();
            if (sessionTypeStr.indexOf('1') != -1) {
                $('.blue').addClass('actives')
            } else if (sessionTypeStr.indexOf('2') != -1) {
                $('.reds').addClass('actives')
            } else if (sessionTypeStr.indexOf('3') != -1) {
                $('.chenjing').addClass('actives')
            }else if (sessionTypeStr.indexOf('4') != -1) {
                $('.green').addClass('actives')
            }else if (sessionTypeStr.indexOf('5') != -1) {
                $('.dark_green').addClass('actives')
            }
            iebg()
            $('.subjectToUse').click(function () {
                var typedata = $(this).find('a').attr('data-type')
                $.get('/users/addAndApplicationUsers', {theme: typedata}, function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '修改成功！', icon: 1}, function () {
                            location.reload()
                        });
                    }
                })
            })
        })

    </script>
</head>
<body>
<div class="wrap">
    <div class="head" id="headID" style="position: relative">
        <div class="head_left" style="float: none;height: 61px;width: 100%">
            <input type="hidden" value="${sessionScope.InterfaceModel}" name="sessionType">
            <input type="hidden" name="logosession" value="/img/main_img/${sessionScope.InterfaceModel}/LOGO.png">
            <img src="" style="margin-top: 11px;margin-left: 1%;height: 61px"></div>
        <div class="head_mid" style="position: relative;float: none;height: 39px;margin-left:206px;margin-top: 7px">
            <span id="leftSpan" class="leftSpan" style="display: none"></span>
            <span id="rightSpan" style="display: none"></span>
			<span id="iconCloseAll" style="display: none;" title="关闭全部标签"></span>
            <div class="main_title" style="margin-left:20px;;overflow: hidden;position: relative">

                <ul style="position: absolute;left: 0px;top: 0px;bottom: 0px">
                    <li class="gongzuoliu" left='0' id='t_0' title='我的桌面'><h1><fmt:message
                            code="global.my.Desktop"/></h1></li>
                </ul>
            </div>
        </div>
        <!-- 右侧的小logo -->
        <div id="taskbar_right" class="head_rig" style="position: absolute;width: 300px;right: 0;top: 37px;height: 72px;">
            <a id="task_center" style="margin-left:30%;" class="task_centerActive" hidefocus="hidefocus" title="搜索"
               data-step="5" data-intro="<b style='display:block'>搜索</b>点击进入“任务中心”，可以看到按时间和紧急程度排序的待办任务，并可快速建立任务"
               data-position="left"></a>
            <a id="sns" style="position: relative" class="task_centerActive" hidefocus="hidefocus" title="提醒" data-step="6"
               data-intro="<b style='display:block'>提醒 </b>点击进入“企业社区”，促进企业信息交流与知识共享" data-position="left"></a>
            <a id="help" class="task_centerActive" hidefocus="hidefocus" title="主题 " data-step="7"
               data-intro="<b style='display:block'>主题 </b>“oa智能办公系统在线帮助”汇集了常见的用户问题，帮助用户快速掌握软件各项功能的使用" data-position="left"
               target="_blank"></a>
           <a id="theme" class="task_centerActive" hidefocus="hidefocus" title="注销" data-step="9"
               data-intro="<b style='display:block'>更换皮肤</b>oa智能办公系统为您提供了完备的界面换肤功能，通过“更换皮肤”按钮，一触即换"
               data-position="left"></a>
        </div>
    </div>
    <div class="cont" id="client" style="position: relative;height:calc(100% - 50px)">
        <ul class="side_all">
            <li class="position" id="admin-side0" style="overflow-y: auto">
                <div class="skin">

                    <h2 style="width: 90%;height:100%;line-height: 45px;text-align: center;font-size: 10pt;font-weight: bold;">
                        <fmt:message code="workflow.th.sousuo"/></h2>
                    <img id="go_back" src="img/main_img/close.png" alt="" style="margin-top: 15px;">
                </div>
                <div style="background:#fff;height: 57px;">
                    <input type="text" id="searchText" class="huiqian_inp">
                    <button class="huiqian_send" id="index_find"><fmt:message code="workflow.th.sousuo"/></button>
                </div>
                <div class="search_cont">
                    <ul class="search-cont-cus">
                        <li class="search_custom">
                            <div class="search_one_all"><img class="custom_photo" src="img/main_img/custom.png" alt="">
                                <h1 class="custom_name"><fmt:message code="journal.th.user"/></h1><img
                                        src="img/main_img/cus_open.png" class="custom_close" alt="">
                                <h2 id="userSearchNum" class="custom_num"></h2>

                            </div>
                            <div class="search_two_all">
                                <ul class="custom_two">
                                </ul>
                            </div>
                        </li>
                        <li class="search_apply">
                            <div class="apply_one_all"><img class="apply_photo" src="img/main_img/apply.png" alt="">
                                <h1 class="apply_name"><fmt:message code="main.th.function1"/></h1>
                                <img src="img/main_img/cus_open.png" class="apply_close" alt="">
                                <h2 id="applySearchNum" class="apply_num"></h2>
                            </div>
                            <div class="search_two_all">
                                <ul class="custom_two">
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>

            </li>
            <li class="position" id="admin-side1">
                <div class="skin" style="position: relative;">
                    <img class="reloadSide" src="/img/icon_refresh_10.png"
                         style="position: absolute;left: 16px;top: 13px;cursor: pointer" alt="">
                    <h2 style="width: 90%;height:100%;line-height: 45px;text-align: center;font-size: 10pt;font-weight: bold;">
                       事务提醒</h2>
                    <img id="go_back" src="img/main_img/close.png" alt="" style="margin-top: 15px;">
                </div>
                <div id="tixing_tab_c">
                    <ul class="search-cont-cus">
                        <li class="search_custom" id="emailId" style="display: none">
                            <div class="search_one_all"><img class="custom_photo" style="margin-top: 3px;"
                                                             src="/img/sidebar_icon_remind_email_14.png" alt="">
                                <h1 class="custom_name"><fmt:message code="notice.th.mail"/></h1><img
                                        src="img/main_img/cus_close.png" class="custom_close" alt="">
                                <h2 id="userSease" class="custom_num"></h2>
                            </div>
                            <div class="search_two_all" style="display: none">
                                <ul class="custom_two" id="emailAll">

                                </ul>

                            </div>
                        </li>
                        <li class="search_custom">
                            <div class="search_one_all"><img class="custom_photo" style="margin-top: 3px;"
                                                             src="img/newspaper.png" alt="">
                                <h1 class="custom_name"><fmt:message code="main.news"/></h1><img
                                        src="img/main_img/cus_close.png" class="custom_close" alt="">
                                <h2 id="userSeasenew" class="custom_num"></h2>
                            </div>
                            <div class="search_two_all" style="display: none">
                                <ul class="custom_two" id="newsAll">

                                </ul>

                            </div>
                        </li>
                        <li class="search_custom">
                            <div class="search_one_all"><img class="custom_photo" style="margin-top: 3px;"
                                                             src="/img/sidebar_icon_remind_announcement.png" alt="">
                                <h1 class="custom_name"><fmt:message code="notice.th.notice"/></h1><img
                                        src="img/main_img/cus_close.png" class="custom_close" alt="">
                                <h2 id="userSeaseTwo" class="custom_num"></h2>
                            </div>
                            <div class="search_two_all" style="display: none">
                                <ul class="custom_two" id="notifyAll">

                                </ul>
                            </div>
                        </li>
                        <li class="search_custom">
                            <div class="search_one_all"><img class="custom_photo" style="margin-top: 3px;"
                                                             src="/img/sidebar_icon_remind_backlog.png" alt="">
                                <h1 class="custom_name"><fmt:message code="main.workflow"/></h1><img
                                        src="img/main_img/cus_close.png" class="custom_close" alt="">
                                <h2 id="userSeasethree" class="custom_num"></h2>
                            </div>
                            <div class="search_two_all" style="display: none">
                                <ul class="custom_two" id="workFlowAll">

                                </ul>
                            </div>
                        </li>
                        <li class="search_custom" id="documentToDoObj">
                            <div class="search_one_all"><img class="custom_photo" style="margin-top: 3px;"
                                                             src="/img/sidebar_icon_remind.png" alt="">
                                <h1 class="custom_name"><fmt:message code="email.th.document"/></h1><img
                                        src="img/main_img/cus_close.png" class="custom_close" alt="">
                                <h2 id="docunmentSeasethree" class="custom_num"></h2>
                            </div>
                            <div class="search_two_all" style="display: none">
                                <ul class="custom_two" id="documentToDoList">

                                </ul>
                            </div>
                        </li>
                        <li class="search_custom" id="toupiao">
                            <div class="search_one_all"><img class="custom_photo" style="margin-top: 3px;"
                                                             src="/img/toupiao.png" alt="">
                                <h1 class="custom_name"><fmt:message code="vote.th.vote"/></h1><img
                                        src="img/main_img/cus_close.png" class="custom_close" alt="">
                                <h2 id="toupiao1" class="custom_num"></h2>
                            </div>
                            <div class="search_two_all" style="display: none">
                                <ul class="custom_two" id="toupiaourl">

                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </li>
            <li class="position" id="admin-side2" style="overflow-y: auto">
                <div class="skin">
                    <h2 style="width:88%;height:100%;line-height: 45px;text-align: center;font-size: 10pt;font-weight: bold;">
                        <fmt:message code="main.th.Skinpeeler"/></h2>
                    <img id="go_back" src="img/main_img/close.png" alt="" style="margin-top: 15px;">
                </div>
                <div class="mainstyle bluetwo">
                    <div class="subjectToUse">
                        <a href="javascript:void (0)" data-type="6">立即使用</a>
                    </div>
                </div>
                <div class="mainstyle redstwo">
                    <div class="subjectToUse">
                        <a href="javascript:void (0)" data-type="7">立即使用</a>
                    </div>
                </div>
                <%--<div class="mainstyle blue">--%>
                    <%--<div class="subjectToUse">--%>
                        <%--<a href="javascript:void (0)" data-type="1">立即使用</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="mainstyle reds">--%>
                    <%--<div class="subjectToUse">--%>
                        <%--<a href="javascript:void (0)" data-type="2">立即使用</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <div class="mainstyle chenjing">
                    <div class="subjectToUse">
                        <a href="javascript:void (0)" data-type="3">立即使用</a>
                    </div>
                </div>
                <div class="mainstyle green">
                    <div class="subjectToUse">
                        <a href="javascript:void (0)" data-type="4">立即使用</a>
                    </div>
                </div>
                <div class="mainstyle dark_green">
                    <div class="subjectToUse">
                        <a href="javascript:void (0)" data-type="5">立即使用</a>
                    </div>
                </div>

            </li>
            <li class="position" id="admin-side3">

                <div class="per_back">
                    <img id="go_back" class="yonghu_img" src="img/main_img/close.png" alt="" style="margin-top: 10px;">
                    <div class="per_all" style="width:100%;">
                        <div style="width: 50px;height:50px;margin:auto;"><img class="yonghu_touxiang" src="" alt="" style="border-radius: 100%;width: 100%;height: 100%;">
                        </div>
                        <h1></h1>
                        <h2 class="juede_suoping"></h2>
                        <h3></h3>
                    </div>
                </div>
                <button class="per_shezhi">
                    <div class="button_img shezhi_img"></div>
                    <span class="button_span"><fmt:message code="main.th.Set"/></span></button>
                <button class="per_suoding">
                    <div class="button_img suoding_img"></div>
                    <span class="button_span"><fmt:message code="main.th.locking"/></span></button>
                <label style="display: none"><input type="password" style="margin-left: 44px;
    width: 160px;border-top-right-radius: 0px;border-bottom-right-radius: 0px;" name="lockCode"
                                                    placeholder="<fmt:message code="main.th.lockPassword" />">
                    <span id="LockCode" style="vertical-align: top;
height: 30px;
    display: inline-block;
    width: 31px;
    text-align: center;
    line-height: 27px;border-top-right-radius: 6px;border-bottom-right-radius: 6px;"><img
                            src="/img/main_img/locktwos.png" alt=""></span></label>
                <button class="per_zhuxiao" id="per_zhuxiao">
                    <div class="button_img zhuxiao_img"></div>
                    <span class="button_span"><fmt:message code="main.cancellation"/></span></button>
            </li>
        </ul>
        <div class="cont_left" style="box-sizing: border-box">
            <ul class="all_ul">
                <div class="tab_t tab_tTwo" id="tab_tTwo" style="position: relative;">
                    <ul class="top_ul">
                        <li class="yingy" id="use"><fmt:message code="global.lang.apply"/></li>
                        <li id="orgnize" style=""><fmt:message code="global.lang.tissue"/></li>
                    </ul>
                    <div   id="zd_menu" class="addOrReduce reduce_default"  ></div>
                </div>
                <div class="tab_c list tab_cTwo" id="tab_cTwo">
                    <ul class="tab_cone a yiji">
                    </ul>
                    <ul class="tab_ctwo a" id="deptOrg" style="display:none;height:calc(100% - 60px);">
                        <div class="pickCompany" style="width: 100%;">
                            <span style="height:30px;margin-top: 5px;line-height:35px;width: 100%;display: inline-block;position: relative;" class="childdept">
                                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="position: absolute;top: 9px;width: 15px;margin-right: 10px;margin-left: 13px;">
                                <a href="javascript:void(0)" class="dynatree-title" title="" style="width: 80%;display: inherit;margin-left: 38px;margin-top: 0;    line-height: 22px;"></a>
                            </span>
                        </div>
                    </ul>
                </div>

            </ul>
        </div>
        <div class="cont_rig" style="box-sizing: border-box;padding-bottom: 10px;">
            <div class="all_content" style="width:100%;height:100%;">
                <!-- 我的桌面 -->
                <div id='f_0' class="iItem">
                    <!-- <div class="wrapper"> -->
                    <div class="header">
                        <ul style="float: left">
                            <%--<li data-id="1"><span class="head_title active" id="shouye" ><fmt:message--%>
                                    <%--code="main.th.HomePortal"/></span></li>--%>
                            <%--<li data-id="2"><span class="head_title" id="apply" ><fmt:message--%>
                                    <%--code="main.th.ApplicationPortal"/></span></li>--%>
                            <%--<li><span class="head_title" ><fmt:message code="main.th.ManagementPortal" /></span></li>--%>

                            <%--<li data-id="3">--%>
                                <%--<span class="head_title">内网门户</span>--%>
                            <%--</li>--%>
                            <%--<li data-id="4">--%>
                                <%--<span class="head_title">管理门户</span>--%>
                            <%--</li>--%>
                        </ul>
                        <div style="float: right;margin-right: 20px;cursor: pointer;width: 30px;
    margin-top: 12px;" class="reloads">
                            <img src="/img/icon_refresh_10.png" alt="">
                        </div>

                    </div>
                    <div id="myTableGet" style="display:none">
                        <%--公告--%>
                        <li id="4" class="contain middle con_notice">
                            <div class="notice_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/announce.png" alt=""><span
                                    class="model"><fmt:message code="notice.th.notice"/></span>
                                <ul class="notice_list" id="notice_listTwo">
                                    <li class="head_title sort active actives" data-bool=""
                                        onclick="announcement(this)" id="all_notice"><fmt:message
                                            code="notice.th.all"/></li>
                                    <%--<li class="weidu_notice head_title sort" onclick="announcement(this)"--%>
                                    <%--data-bool="02"><fmt:message code="email.th.notify"/></li>--%>
                                    <%--<li class="weidu_notice head_title sort" onclick="announcement(this)"--%>
                                    <%--data-bool="01"><fmt:message code="notice.type.Decision"/></li>--%>
                                    <%--<li class="weidu_notice head_title sort" onclick="announcement(this)"--%>
                                    <%--data-bool="03"><fmt:message code="notice.type.Bulletin"/></li>--%>
                                </ul>

                                <span class="more_notice" tid="0116" url="notice/index"><a style="    color: #fff;"><fmt:message
                                        code="email.th.more"/></a></span>
                            </div>
                            <div class="tainer">
                                <ul class="notify no_read_notice_two">
                                </ul>

                            </div>
                        </li>
                        <%--新闻--%>
                        <li id="147" class="contain side con_new">
                            <div class="s_head c_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/icon_newsgrid.png" alt=""><span
                                    class="model"><fmt:message code="main.news"/></span>
                                <div class="richeng_check news_all" onclick="administrivia(this)"><fmt:message
                                        code="notice.th.all"/></div>
                                <div class="news_noread" onclick="administrivia(this)" data-bool="0"><fmt:message
                                        code="email.th.unread"/></div>
                                <span class="more more_news" tid="0117" url="news/index"><a><fmt:message
                                        code="email.th.more"/></a></span>
                            </div>
                            <div class="s_container c_container new_total">
                                <%--<img style="width:100%;height:100%" src="img/spirit/menu/richenganpai.png">--%>
                                <ul class="new_all">
                                </ul>

                            </div>
                        </li>
                        <%--邮件箱--%>
                        <li id="1" class="contain middle con_email">
                            <div class="s_head m_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/emailbox.png" alt=""><span
                                    class="model youjianxiang"><fmt:message code="email.title.mailbox"/></span>
                                <ul class="mail_title">
                                    <li class="head_title sort  active" id="all_m"><fmt:message
                                            code="notice.th.all"/></li>
                                    <li class="head_title sort " id="weidu"><fmt:message
                                            code="email.th.unread"/></li>
                                    <li class="head_title sort " id="yidu"><fmt:message code="email.th.read"/></li>
                                </ul>

                                <span style="display: none;" class="more more_emil" tid="0101" url="email/index"><a><fmt:message
                                        code="email.th.more"/></a></span>
                            </div>

                            <div class="e_mail">
                                <ul class="all_mail">

                                </ul>
                                <ul class="no_read" style="display:none;">
                                </ul>
                                <ul class="read" style="display:none;">
                                </ul>
                            </div>
                        </li>
                        <%--待办--%>
                        <li id="5" class="contain middle con_daiban">
                            <div class="notice_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/backlog.png" alt=""><span
                                    class="model"><fmt:message code="main.th.TodProcess"/></span>

                            </div>
                            <div class="tainer">
                                <ul class="daiban">
                                </ul>
                            </div>
                        </li>
                        <%--日程安排--%>
                        <li id="8" class="contain side con_schedule">
                            <div class="s_head c_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/schedule.png" alt=""><span
                                    class="model"><fmt:message code="main.schedule"/></span>
                                <div class="c_all " data-url="/schedule/getAllschedule"
                                     onclick="schedule(this)"><fmt:message code="notice.th.all"/></div>
                                <div class="c_today richeng_check" data-url="/schedule/getscheduleByDay" data-schedule="1"
                                     onclick="schedule(this)"><fmt:message code="notice.th.Today"/></div>
                                <div class="c_tom" data-url="/schedule/getscheduleByDay" data-schedule="2"
                                     onclick="schedule(this)"><fmt:message code="main.th.Tomorrow"/></div>
                                <div class="c_nexttom" data-url="/schedule/getscheduleByDay" data-schedule="3"
                                     onclick="schedule(this)"><fmt:message code="main.th.AfterTomorrow"/></div>
                                <span class="more more_chedule" tid="0124" url="schedule/index">
											<a><fmt:message code="global.lang.add"/></a>
										 </span>
                            </div>
                            <div class="s_container c_container">
                                <%--<img style="width:100%;height:100%" src="img/spirit/menu/richenganpai.png">--%>
                                <ul class="chedule_all">
                                </ul>

                            </div>
                        </li>
                        <%--常用功能--%>
                        <li id="0" class="contain side con_function">
                            <div class="s_head bg_head">
                                <span class="s_head_top"></span>
                                <img class="changyong_img"
                                     src="img/main_img/${sessionScope.InterfaceModel}/changyong.png" alt=""><span
                                    class="model" style="margin-left: 6px;"><fmt:message code="main.th.function"/></span>
                                <!-- <span class="more"><a>管理</a></span> -->
                            </div>
                            <div class="s_container">
                                <div class="every_logo" menu_tid="0116" onclick="getMenuOpen(this)" data-url="notify/show"><img
                                        src="img/main_img/app/0116.png">
                                    <h2><fmt:message code="notice.th.notice"/></h2></div>
                                <div class="every_logo" menu_tid="0101" data-url="email" onclick="getMenuOpen(this)"><img
                                        src="img/main_img/app/0101.png">
                                    <h2><fmt:message code="notice.th.mail"/></h2></div>
                                <div class="every_logo" menu_tid="0124" onclick="getMenuOpen(this)"
                                     data-url="calendar"><img src="img/main_img/app/0124.png">
                                    <h2><fmt:message code="email.th.agenda"/></h2></div>
                                <div class="every_logo" menu_tid="0117" data-url="news/show" onclick="getMenuOpen(this)"><img
                                        src="img/main_img/app/0117.png">
                                    <h2><fmt:message code="main.news"/></h2></div>
                                <div class="every_logo" menu_tid="3001" data-url="file_folder/index2.php" onclick="getMenuOpen(this)"><img
                                        src="img/main_img/app/0136.png">
                                    <h2><fmt:message code="file.th.file"/></h2></div>
                                <div class="every_logo" menu_tid="0128" data-url="diary/show" onclick="getMenuOpen(this)"><img
                                        src="img/main_img/app/0128.png">
                                    <h2><fmt:message code="email.th.log"/></h2></div>
                                <%--<div class="every_logo" menu_tid="0126" url="eduSchoolBusiness/noticeIndex"><img--%>
                                <%--src="img/main_img/app/0126.png">--%>
                                <%--<h2>校务公开</h2></div>--%>
                            </div>
                        </li>
                        <%--日志--%>
                        <li id="9" class="contain side con_daily">
                            <div class="s_head d_head bg_head">
                                <span class="s_head_top"></span>

                                <img src="img/main_img/${sessionScope.InterfaceModel}/log.png" alt=""><span
                                    class="model"><fmt:message code="email.th.log"/></span>
                                <ul class="daily_all">
                                    <li class="my_daily active"><fmt:message code="diary.th.own"/></li>
                                    <%--<li class="next_daily">下属日志</li>--%>
                                </ul>
                                <span class="more_daily"><a class="daily_more" tid="0128"
                                                            url="diary/index"><fmt:message
                                        code="email.th.more"/></a></span>
                            </div>
                            <div class="daily">
                                <ul class="all_daily">

                                </ul>
                            </div>
                        </li>

                        <%--文件柜--%>
                        <li id="15" class="contain side con_file">
                            <div class="wenjian_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/fliebox.png" alt=""><span
                                    class="model"><fmt:message code="file.th.file"/></span>
                                <ul class="wenjian_list">
                                    <li class="head_title sort active actives" onclick="fileCabinet(this)"
                                        data-url="/file/writeTree"><fmt:message code="main.th.PublicFile"/></li>
                                    <li class="head_title sort" onclick="fileCabinet(this)"
                                        data-url="/file/writeTreePerson"><fmt:message
                                            code="main.th.PersonalFile"/></li>
                                </ul>

                                <span class="wenjian_span more_wenjian" tid="3001" url="file/home"><a
                                        style="color: #000;"><fmt:message code="email.th.more"/></a></span>
                            </div>
                            <div class="s_cont">
                                <ul class="pets_wenjian">
                                </ul>


                            </div>
                        </li>
                        <%--网络硬盘--%>
                        <li id="76" class="contain side con_net">
                            <div class="wenjian_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="img/main_img/${sessionScope.InterfaceModel}/webdisk.png" alt=""><span
                                    class="model"><fmt:message code="main.network"/></span>
                                <ul class="wenjian_list">
                                    <li class="head_title sort active actives"><fmt:message
                                            code="main.th.public"/></li>
                                    <li class="head_title sort"><fmt:message code="main.th.personal"/></li>
                                </ul>

                                <span class="wenjian_span more_wenjian" tid="3010"
                                      url="/netdiskSettings/networkHardDisk?0"><a style="color: #fff;"><fmt:message
                                        code="email.th.more"/></a></span>
                            </div>
                            <div class="s_cont">
                                <ul class="pets_yingpan" style="height: 100%;overflow-y: auto;">
                                </ul>
                                <ul class="people_yingpan" style="display:none;">
                                </ul>

                            </div>
                        </li>
                        <%--会议通知--%>
                        <li id="-1" class="contain side con_new">
                            <div class="s_head c_head bg_head">
                                <span class="s_head_top"></span>
                                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_myMeeting.png" alt="" width="15px" height="15px" style="top: 10px;"><span
                                    class="model"><fmt:message code="dem.th.ConferenceNotice"/></span>

                                <span class="more more_meeting" tid="0117" url="meeting/meetingList"><a><fmt:message code="email.th.more"/></a></span>
                            </div>
                            <div class="s_container c_container new_total">
                                <%--<img style="width:100%;height:100%" src="img/spirit/menu/richenganpai.png">--%>
                                <ul class="meeting">
                                </ul>

                            </div>
                        </li>
                            <%--待办公文--%>
                            <li id="3003" class="contain side con_daily">
                                <div class="s_head d_head bg_head">
                                    <span class="s_head_top"></span>

                                    <img width="18px" height="18px" src="/img/commonTheme/${sessionScope.InterfaceModel}/doctment.png" alt=""><span
                                        class="model"><fmt:message code="document.th.To-doList"/></span>
                                    <ul class="daily_all" style="right:9px">

                                        <li class="send my_daily active" documentType="0" onclick="documentFile(0)"><fmt:message code="doc.th.Dispatch"/></li>
                                        <li class="receive my_daily " documentType="1" onclick="documentFile(1)"><fmt:message code="doc.th.In"/></li>
                                        <%--<li class="next_daily">下属日志</li>--%>
                                    </ul>
                                    <%--<span class="more_daily"><a class="daily_more" tid="0128"--%>
                                                                <%--url="diary/index"><fmt:message--%>
                                            <%--code="email.th.more"/></a></span>--%>
                                </div>
                                <div class="daily">
                                    <ul class="gongwen">

                                    </ul>
                                </div>
                            </li>
                    </div>
                    <div class="main cont_main" id="contmain_2" data-tabId="2"  style="display: none">
                        <ul class="total"  style="">

                        </ul>
                    </div>
                    <div class="main_1 cont_main" id="contmain_3" data-tabId="3" style="display: none;overflow-y: scroll">
                        <div class="apply_all">

                        </div>
                    </div>
                    <div class="main_2 cont_main" style="display: none;">

                    </div>
                    <div class="main_2 cont_main" id="contmain_1" data-tabId="1" style="position:relative;z-index: -1;height: calc(100% - 45px);">
                        <iframe src="/intranetBlue" frameborder="0" style="width: 100%;height: 100%;"></iframe>
                    </div>
                    <div class="main_2 cont_main " id="contmain_4" data-tabId="4" style="display: none;height: calc(100% - 45px);">
                        <iframe src="/common/managementPortal" frameborder="0" style="width: 100%;height: 100%;"></iframe>
                    </div>
                </div>
                <div id='' class="iItem">
                    <iframe id="every_module" src="" frameborder="0" scrolling="yes" height="100%" width="100%"
                            noresize="noresize"></iframe>
                </div>

            </div>
        </div>
    </div>
    <div class="foot">
        <div style="width: 569px;height: 50px;margin: auto;">
            <label class="wenzi" ><fmt:message code="dem.th.NavigationPanel"/></label>
            <div  id="xianyin"  class="show_off"><span id="bottom_show_left" ></span><span class="show_off_tag_bg" id="bottom_hide_left" ></span></div>
            <iframe id="every_module" src="lunbo" frameborder="0" scrolling="yes" height="100%" width="100%"
                    noresize="noresize"></iframe>
        </div>
    </div>
</div>
</body>
<%--<script type="text/javascript" src="/js/main_js/index.js"></script>--%>

<script>
    var strsecced = '';
    var width = $('body').width() - 507;
    $('.head_mid').css('width',width+'px');
    function autodivheights() {

        var winHeight = 0;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        if (document.documentElement && document.documentElement.clientHeight)
            winHeight = document.documentElement.clientHeight;
        document.getElementById("client").style.height = winHeight - 137 + "px";
        if($('.cont_left').is(':hidden')){
            $('.cont_rig').width('100%')
        }else {

            $('.cont_rig').width($('#client').width() - $('.cont_left').width()-5)
        }



    }

    function throttle(method) {
        clearTimeout(method.tId);
        method.tId = setTimeout(function () {
            method.call();
        }, 100);
    }
    function addEventHandler(target,type,fn){
        if(target.addEventListener){
            target.addEventListener(type,fn,false);
        }else{
            target.attachEvent("on"+type,fn,false);
        }
    }
    function locationReload() {
        location.reload()
    }
//    $('#taskbar_right').height($('#headID').height() - $('.head_left').height() - $('.head_mid').height())
    
    var zhuxiao = "";
    function newjump(urlString) {
        $('#f_z00410').find('iframe').prop('src', urlString)
    }
    function changeMenuTab(id) {

        $('.cont_left').find('#' + id).children().click();
    }
    var menu = {
        "email": "email/index",
        "email_eamilStatis":"email/eamilStatis",
        "notify_show": "notice/allNotifications",
        "news_show": "news/index",
        "file_folder/index2.php": "fileHome",
        "system/file_folder": "showFileBySort_id",
        "diary_show": "diary/index",
        "news_manage": "news/manage",
        "notify_manage": "notice/noticeManagement",
        "knowledge_management": "file/home",
        "system_file_folder": "file/setIndex",
        "system_workflow_flow_guide": "flow/type/index",
        "system_workflow_flow_form": "workflow/formtype/index",
        "file_folder_index2.php": "file/persionBox",
        "system_workflow_flow_sort": "workflow/flowclassify/index",
        "system_unit": "sys/companyInfo",
        "system_dept": "common/deptManagement",
        "system_org_manage": "sys/organizational",
        "workflow_new": "workflow/work/addwork",
        "workflow_list": "workflow/work/workList",
        "system_user": "common/userManagement",
        "system_status_text": "sys/statusBar",
        "system_interface": "sys/interfaceSettings",
        "system_reg_view": "sys/sysInfo",
        "system_menu": "sys/menuSetting",
        "system_log": "sys/journal",
        "system_code": "common/systemCode",
        "info_unit": "sys/unitInfor",
        "info_dept": "department/deptQuery",
        "info_user": "sys/userInfor",
        "calendar": "schedule/index",
        "system_user_priv": "roleAuthorization",
        "system_netdisk": "netdiskSettings/netdisksetting",
        "document_mine": "document/mine",
        "person_info": "controlpanel/index",
        "system_workflow_self-motion": "/workflow/work/automaticNumbering",
        "system_workflow_business": "/workflow/work/businessApplications",
        "netdisk": "netdiskSettings/networkHardDisk",
        "calendar_info": "schedule/query",
        "deleteDatePage": "deleteDatePage",
        "attendance_personal": "/attendPage/myAttendance",
        "hr_manage_staff_info": "hr/page/hrindex",
        "hr_manage_staff_contract": "hr/page/contractIndex",
        "document_send_draft": "/document/draftArticlesOfCommunication",
        "document_send_backlog": "/document/makeADraft",
        "document_send_have": "/document/IthasBeenDone",
        "document_send_mine": "/document/ISentAMessage",
        "meeting_apply": "/MeetingCommon/MeetingApply",
        "meeting_query": "/MeetingCommon/selectMeeting",
        "meeting_mymeeting": "/MeetingCommon/selectMyMeeting",
        "meeting_summary": "/MeetingCommon/selectMeetingMinutes",
        "meeting_management": "/MeetingCommon/selectMeetingMange",
        "meeting_equipment": "/MeetingCommon/MeetingDeviceMange",
        "meeting_meetingroom": "/MeetingCommon/MeetingRoom",
        "meeting_admin_settings": "/MeetingCommon/MeetingMange",
        "supervise_task": "SupervCommon/MySupervision",
        "supervise_management": "SupervCommon/SupervisionManage",
        "supervise_classify": "SupervCommon/SupervisionType",
        "supervise_statistics": "SupervCommon/Supervisionstatistic",
        "document_recv_register": "document/addresseeRegistrationForm",
        "document_recv_backlog": "document/inAbeyance",
        "document_recv_have": "document/received",
        "document_recv_mine": "document/myInReply",
        "document_query": "document/theOfficialDocumentQuery",
        "document_statistics": "document/theOfficialStatistics",
        "document_supervise": "document/documentsSupervisor",
        "document_setting": "document/officialDocumentSet",
        "sms_index": "sms/index",
        "document_template_setting": 'document/officialDocumentSet',
        "attendance_manage_confirm": "attendPage/backlogAttendLeave",
        "attendance_manage_query": "attendPage/attendance",
        "system_secure_rule": "sys/secureIndex",
        "workflow_query": "flowRunPage/queryFlowRun",
        "document_seal_management": "document/SealIndex",
        "syn_data": "synData/page",
        "workflow_rule": "workflow/work/workDelegate",
        "hierarchical_setting": "hierarchical/common/setting",
        "hierarchical_deptManager": "hierarchical/common/deptManager",
        "hierarchical_userManager": "hierarchical/common/userManager",
        "timeLineConmon_timeLineEvent": "timeLineConmon/timeLineEvent",
        "timeLineConmon_eventManage": "timeLineConmon/eventManage",
        "edu_fixAssets_manager": "eduFixAssets/index",
        "edu_exam": "eduExam/index",
        "edu_school_calendar": "eduSchoolCalendar/showSchoolCalendar",
        "edu_gradeclass": "eduDepartment/eduDeptManagement",
        "eduPrize_index": "eduPrize/goIndex",
        "edu_course": "eduCourse/index",
        "edu_exam_xj": "eduExam/editExam",
        "edu_exam_cx": "eduExam/queryExam",
        "edu_exam_dr": "eduExam/insertExam",
        "hr_training_plan": "eduTrainPlan/goIndex",
        "edu_arrangeCourse": "eduArrangeCourse/arrangeCourse",
        "hr_training_approval": "eduTrainPlan/assessIndex",
        "eduTeacher_index": "eduTeacher/index",
        "workPlan_queryIndex": "workPlan/workPlanQueryIndex",
        "workPlan_planManager": "workPlan/index",
        "workPlan_typeSetting": "workPlan/workPlanTypeSetting",
        "edu_student": "edu/student/eduStudentIndex",
        "hr_training_record": "record/trainRecord",
        "vote_manage": "vote/manage/vote",
        "vote_show": "vote/manage/voteIndex",
        "vehicle_vehicleindex": "veHicle/veHicleIndex",
        "vehicle_vehicleuseageindex": "veHicle/veHicleUseageIndex",
        "vehicle_vehicleUseQuery_Index": "veHicleUsage/index",
        "vehicle_vehicleDeptApprove_index": "veHicle/vehicleDeptApproveIndex",
        "vehicle_vehicleMaintenance_index": "tenance/index",
        "vehicle_vehicleoperator_Index": "veHicle/operatorIndex",
        "edu_system_para_setting": "syspara/eduSetParamIndex",
        "vehicle_vehicleOperatormanage": "veHicle/OperatorMange",
        "edu_elective_sys_elective_count": "eduElectiveStudentCount/StatisticsIndex",
        "edu_elective_sys_elective_course": "eduElectivePublish/EduElectIndex",
        "address_index": "address/index",
        "officeDepository_index": "officeDepository/goDepositoryindex",
        "leaderActivity_leaderActivity": "leaderschedule/leaderActivity",
        "leaderActivity_query": "leaderschedule/query",
        "notes_index": "Notes/index",
        "officedepository_index": "officeDepository/goDepositoryindex",
        "officetransHistory_productRelease": "officetransHistory/productRelease",
        "officetransHistory_approvalIndex": "officetransHistory/approvalIndex",
        "officeProduct_OfficeProductApplyIndex": "officetransHistory/OfficeProductApplyIndex",
        "officetransHistory_stockIndex": "officetransHistory/stockIndex",
        "edu_importUser": "user/goImportEduUsers",
        "officetransHistory_OfficeProductApplyIndex": "officetransHistory/OfficeProductApplyIndex",
        "officeSupplies_goInfomationHome": "officeSupplies/goInfomationHome",
        "edu_eduSchoolBusiness": "eduSchoolBusiness/eduSchoolIndex",
        "book_bookManager_inputIndex": "bookManager/inputIndex",
        "book_bookManager_queryIndex": "bookManager/queryIndex",
        "book_bookManager_replayIndex": "bookManager/replayIndex",
        "book_bookManager_setIndex": "bookManager/setIndex",
        "edu_eduSchoolOpen": "eduSchoolBusiness/noticeIndex",
        "system_notify":"notice/notificAtion",
        "notify_auditing":"notice/appprove",
        "smsSettings_index":"smsSettings/index",
        "timed_management":"TimedTaskManagementController/imedTaskManagement",
        "workflow_workMonitoring":"workflow/work/workMonitoring",
        "spirit_webChatRecord":"spirit/webChatRecord",
        "footprint_index":"footprint/index",
        "rmsRoll_index":"rmsRoll/index",
        "rmsFile_index":"rmsFile/index",
        "rmsFile_toDestroyed":"rmsFile/toDestroyed",
        "salary_lclb":"/salary/lclb",
        "address_index":"/address/index",
        "sys_getPostmanagement":"/sys/getPostmanagement",
        "duties_dutiesjsp":"/duties/dutiesjsp",
        "system_remind":"/serviceReminding/InformationReminding",
        "schoolRoll_schoolQuery":"/schoolRoll/schoolQuery",
        "schoolRoll_index":"/schoolRoll/index",
        "schoolRoll_schoolSeting":"/schoolRoll/mange",
        "teachering_teacherQuery":"/teachering/teacherQuery",
        "teachering_index":"/teachering/index",
        "teachering_teacherSeting":"/teachering/teacherSeting",
        "eduYear_schoolYearManagement":"/eduYear/schoolYearManagement",
        "eduTerm_termManagement":"/eduTerm/termManagement",
        "eduLearnPhase_studySectionManagement":"/eduLearnPhase/studySectionManagement"
    };

    $(function () {

//        $.ajax({
//            type:'post',
//            url:'/infoCenter/getInfoCenterOrder',
//            dataType:'json',
//
//            success:function(res){
//                if (res.flag) {
//                    var data = res.data.mytableLeft.split(",");
//                    for (var i = 0; i < data.length; i++) {
//                        var add = $("#div" + data[i]).html();
//                        $(".total").append(add);
//                    }
//                    $('.total>div').remove();
//                    $('.total').css('display','block');
//                }
//                $('.total>li').arrangeable({
//                    dragSelector: '.bg_head'
//                });
//            }
//        })
//
//
//        $('.total>li>.bg_head').css('cursor',' pointer');

        autodivheights();
        $.get('/sys/getInterfaceInfo', function (json) {
            if (json.flag) {
                if (json.object.attachment.length != 0) {
                    $('.head_left img').attr('src', '/xs?' + json.object.attachment[0].attUrl.replace('null', $.cookie('company')))
                } else {
                    $('.head_left img').attr('src', $('[name="logosession"]').val())
                }
                strsecced = json.object.logOutText;
                document.title = json.object.ieTitle;
            }
        }, 'json')


        addEventHandler(window,'resize',function () {
            throttle(autodivheights)
        })

        window.onresize = function () {
            var width = $('body').width() - 507;
            $('.head_mid').css('width',width+'px');
        };




        $('.reloads').click(function () {
//            location.reload()
            var elType=$('.header ul .active').parent().attr('data-id');
            if(elType==4||elType==1){
                var src=$('[data-tabid="'+elType+'"]').find('iframe').prop('src');
                $('[data-tabid="'+elType+'"]').find('iframe').prop('src',src)
            }else if(elType==2){
                location.reload()
            }

        })

        $('.reloadSide').click(function () {
            listTable()
        })

        $('.per_suoding ').click(function () {
            $(this).next().show()
            $(this).next().find('input').val('')
        })
        $('#LockCode').click(function () {
            if ($('[name="lockCode"]').val() == '') {
                $.layerMsg({content: '<fmt:message code="main.th.empty" />！', icon: 2});
                return
            }
            $.cookie('lockCode', $('[name="lockCode"]').val())

            $('#go_back').click();
            var str = '<div class="posifixed">' +
                '<div style="position:fixed;width:200px;height:250px;left:50%;' +
                'margin-left:-100px;top: 50%;margin-top: -229px;">' +
                '<img style="width:100%;height:200px;" src="' + function () {
                    if ($('.yonghu_touxiang').prop('src').indexOf('boy.png') != -1) {
                        return '/img/main_img/nantouxiang.png'
                    } else if ($('.yonghu_touxiang').prop('src').indexOf('girl.png') != -1) {
                        return '/img/main_img/nvtouxiang.png'
                    } else {
                        return $('.yonghu_touxiang').prop('src')
                    }
                }() + '" />' +
                '<span style="color: #fff;display: block;text-align: center;' +
                'line-height: 77px;font-size: 26px;">' +
                '<img src="/img/main_img/people.png" style="    vertical-align: initial;\
            margin-right: 6px;"/>' + $('.juede_suoping').text() + '</span>' +
                '</div>' +
                '<div class="posifixedCenter" style="    margin-top: 65px;margin-left: -119px;">' +
                '<label><input type="password" style="height:27px;    width: 224px;" placeholder="<fmt:message code="main.th.unlockCode" />" style="margin-right: 10px;"><span id="theLock" style=" right: -17px;top: 0px;width: 38px;height: 37px;line-height: 35px;border-radius: 4px;text-align:center;"><img src="/img/main_img/icon_lock.png" /></span></label></div></div>'
            $('body').append(str)
            document.onkeydown = function (e) {
                var ev = window.event || e;
                var code = ev.keyCode || ev.which;
                if (code == 116) {
                    if (ev.preventDefault) {
                        ev.preventDefault();
                    } else {
                        ev.keyCode = 0;
                        ev.returnValue = false;
                    }
                }
            }
            document.oncontextmenu = function () {
                return false;
            }
        })
        $(document).keyup(function (e) {
            if (e.keyCode == 13) {
                $('#theLock').click()
            }
        })
        $(document).delegate('#theLock', 'click', function () {
            if ($(this).prev().val() == $.cookie('lockCode')) {
                $.layerMsg({content: '<fmt:message code="main.th.UnlockSuccessfully" />！', icon: 1}, function () {
                    $('.posifixed').remove()
                    $('#LockCode').parent().hide()
                    document.onkeydown = function (e) {
                        return true
                    }
                });

            } else {
                $.layerMsg({content: '<fmt:message code="main.th.PasswordError" />！', icon: 2});

            }
        })
        $('.cont_nav').on('click', 'li', function () {
            $(".cont_nav li").removeClass("infame");
            $(this).addClass('infame');

        });
		
		//点击关闭全部标签
			$('#iconCloseAll').click(function(){
                $('.main_title').find('.choose').remove();
                $('#f_0').css('display','block').siblings().remove();
                $('#t_0').css('display','block');
                $('.main_title').find('ul').css('left','0px');
                $(this).hide();
                $('#rightSpan').hide();
                $('#leftSpan').hide();
                $('.main_title').find('.gongzuoliu').removeAttr('style')
			})
		
        //右侧整体内容的tab切换

        $('.header').on('click', 'li span', function () {
            $(this).parent().siblings().find('span').removeClass('active');
            $(this).addClass('active');
            var id=$(this).parent().attr('data-id');
            $('#f_0 .cont_main').hide();
            $('#f_0').find('[data-tabid="'+id+'"]').show()
            $('#f_0').find('[data-tabid="'+id+'"]').css('z-index','0')
        })

        //内容右侧tab切换
        var currentIndex = 4;
        var index;
        $('#taskbar_right').on('click', 'a', function (event) {
            index = $(this).parent().find('a').index($(this));
            if (currentIndex != index) {
                currentIndex = index;
                $("#taskbar_right a").removeClass('logo_checks');
                $(this).addClass('logo_checks');
                //内容
                var contents = $(".side_all").find(".position");
                $(contents[index]).animate({width: "300px"});
                $(contents[index]).show()
                $(contents[index]).siblings().hide()
                $(contents[index]).siblings().css('width', '0px');
            }
            event.stopPropagation();

        });


        //内容右侧 提醒下的tab切换
        var currentIndexTwo = 9;
        var index;
        $('.tixing_tab_t').delegate('li', 'click', function () {
            index = $(this).index();
            /* console.log(index);*/
            if (currentIndexTwo != index) {
                currentIndexTwo = index;
                $(".tixing_tab_t li").removeClass("tixing_check");
                $(this).addClass("tixing_check");
                //内容
                var contents = $("#tixing_tab_c").find("ul");
                $(contents[index]).show();
                $(contents[index]).siblings().hide();
            }

        });

        //日程安排下的tab切换
        var currentIndexThree = 9;
        var index;
        $('.c_head').delegate('div', 'click', function () {
            index = $(this).parent().find('div').index($(this));
            /*  console.log(index);*/
            if (currentIndexThree != index) {
                currentIndexThree = index;
                $(this).parent().find("div").removeClass("richeng_check");
                $(this).addClass("richeng_check");
                //内容
                var contents = $(this).parent().next().find("ul");
                $(contents[index]).show();
                $(contents[index]).siblings().hide();
            }

        });


        //传入用户个人资料的数据
        $.ajax({
            url: '/user/findUserByuid',
            type: 'get',
            data: {
                uid: $.cookie('uid')
            },
            dataType: 'json',
            success: function (obj) {
                if (obj.flag == true) {
                    var data = obj.object;
                    var img = data.avatar;
                    var name = data.userName;
                    var dept = data.deptName;
                    var PrivName = data.userPrivName;
                }
                $('.yonghu_touxiang').attr('src', function () {
                    if (obj.object.avatar == 0) {
                        return '/img/user/boy.png'
                    }
                    else if (obj.object.avatar == 1) {
                        return '/img/user/girl.png'
                    }else if (obj.object.avatar==undefined||obj.object.avatar==''){
                        return '/img/user/boy.png'
                    } else {
                        return '/img/user/' + obj.object.avatar
                    }
                }());
                $('.per_all').find('h1').html(name);
                $('.per_all').find('h2').html(PrivName);
                $('.per_all').find('h3').html(dept);
            }
        })
        //点击返回按钮，右边内容收回
        $('.position').on('click', '#go_back', function () {

            $('.position').animate({width: "0px"});
            $('.side_all').find('.position').hide()
            currentIndex = 4;
            $('#taskbar_right').find('a').removeClass('activeTwo')


        });
        $('#headID').click(function () {
            $('.position').animate({width: "0px"});
            $('.side_all').find('.position').hide();
            currentIndex = 4;
            $('#taskbar_right').find('a').removeClass('activeTwo')
        })
        $('.cont_left').click(function () {
            $('.position').animate({width: "0px"});
            $('.side_all').find('.position').hide();
            currentIndex = 4;
            $('#taskbar_right').find('a').removeClass('activeTwo')
        })
        $(document).delegate('.cont_rig', 'click', function () {
            $('.position').animate({width: "0px"});
            $('.side_all').find('.position').hide();
            currentIndex = 4;
            $('#taskbar_right').find('a').removeClass('activeTwo')
        })
        //鼠标移入左三角，变色
        $('.left_scroll').on('mouseover', function () {
            $(this).css('background', 'url(img/main_img/tabs_arrow.png) -71px 0px no-repeat');
        });

        $('.left_scroll').on('mouseout', function () {
            $(this).css('background', 'url(img/main_img/tabs_arrow.png) -10px 0px no-repeat');
        })

        //鼠标移入右三角，变色
        $('.right_scroll').on('mouseover', function () {
            $(this).css('background', 'url(img/main_img/tabs_arrow.png) -98px 0px no-repeat');
        });

        $('.right_scroll').on('mouseout', function () {
            $(this).css('background', 'url(img/main_img/tabs_arrow.png) -37px 0px no-repeat');
        });


        //鼠标点击，右边logo变颜色
        $('.task_centerActive').on('click', function () {
            $(this).addClass('activeTwo')
            $(this).siblings('a').removeClass('activeTwo')
            if ($(this).attr('data-step') == 6) {
                listTable()
            }
        });
        $.ajax({
             type: "post",
             url: "<%=basePath%>users/getUserTheme",
             dataType: 'json',
             data: "",
             success: function (res) {
                 var data = res.object;
                 var menu = data.menuExpand;
                 var theme = data.theme;
                 if(theme == '7'){
                    $('#contmain_3 iframe').attr('src',"/intranetRed")
                 }
                 for (var i = 0; i < $('.one').length; i++) {
                     if (i == menu) {
                        $('.one').eq(i).find('.erji').show().addClass('actives');
                     }
                 }
             }
         });
        //浏览器标题和注销文字的标题的接口
        $.ajax({
            url: '<%=basePath%>/sys/getIndexInfo',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                if (obj.flag == true) {
                    /* alert(obj.object);*/
//                    document.title=obj.object.ieTitle;
                    zhuxiao = obj.object.logOutText;
                }
            }
        });

        //点击注销按钮
        $('#admin-side3').on('click', '#per_zhuxiao', function () {
            $.layerConfirm({
                title: '<fmt:message code="main.cancellation" />',
                content: strsecced,
                icon: 0
            }, function () {
                $.ajax({
                    url: 'logOut',
                    type: 'get',
                    dataType: 'json',
                    success: function (obj) {
                        if (obj.flag == true) {
                            location.href = '/';
                        }
                    }
                });
            })
        });


        //点击设置 ，变样式
        $('#admin-side3').on('click', '.per_shezhi', function () {

            $(this).siblings().removeClass('button_chacked');
            $(this).addClass('button_chacked');
        });
        //点击锁定 ，变样式
        $('#admin-side3').on('click', '.per_suoding', function () {

            $(this).siblings().removeClass('button_chacked');

            $(this).addClass('button_chacked');
        });
        //点击注销 ，变样式
        $('#admin-side3').on('click', '.per_zhuxiao', function () {
            $(this).siblings().removeClass('button_chacked');
            $(this).addClass('button_chacked');
        });


        function init() {
            $.ajax({
                url: 'showMenu',
                type: 'get',
                dataType: 'json',
                success: function (obj) {
                    var data = obj.obj;
                    var str = '';
                    for (var i = 0; i < data.length; i++) {
                        var er = '';
                        for (var j = 0; j < data[i].child.length; j++) {
                            if (data[i].child[j].child.length > 0) {
                                var three = '';
                                for (var k = 0; k < data[i].child[j].child.length; k++) {
                                    three += '<li class="three" data-three="'+ data[i].child[j].isopenNew +'" id=' + data[i].child[j].id + ' menu_tid=' + data[i].child[j].child[k].id + ' url=' + data[i].child[j].child[k].url + ' title="' + data[i].child[j].child[k].name + '"><img class="sanji_circle" src="img/main_img/${sessionScope.InterfaceModel}/hei.png"><h1 style="margin-left:6%;">' + data[i].child[j].child[k].name + '</h1></li>';
                                }
                                er += '<li class="two" data-er="'+ data[i].child[j].isopenNew +'" id=' + data[i].child[j].id + '  menu_tid=' + data[i].child[j].id + '><div url="' + data[i].child[j].url + '"  class="two_all click_erji else_two"  title="' + data[i].child[j].name + '"><img class="erji_circle" src="img/main_img/${sessionScope.InterfaceModel}/hei.png"><h1>' + data[i].child[j].name + '</h1><img class="er_img" src="img/main_img/${sessionScope.InterfaceModel}/down.png"></div><ul class="sanji" style="display:none;">' + three + '</ul></li>';
                            } else {
                                er += '<li class="two" data-er="'+ data[i].child[j].isopenNew +'" id=' + data[i].child[j].id + ' menu_tid=' + data[i].child[j].id + '><div url="' + data[i].child[j].url + '" class="two_all" title="' + data[i].child[j].name + '"><img class="erji_circle" src="img/main_img/${sessionScope.InterfaceModel}/hei.png"><h1 class="erji_h1">' + data[i].child[j].name + '</h1></div></li>';
                            }
                        }
                        str += '<li class="one person " id="administ"><div class="one_all apel" title="' + data[i].name + '"><img class="one_logo" src="img/main_img/${sessionScope.InterfaceModel}/' + data[i].img + '.png"><h1 class="one_name" id="administ">' + data[i].name + '</h1><img class="down_jiao" src="img/main_img/${sessionScope.InterfaceModel}/down.png"></div><div class="two_menu"><ul class="erji b"  style="width:100%;display:none;"><li class="two"><div class="two_all">' + er + '</div></li></ul></div></li>';
                    }

                    $(".tab_cone").html(str);
                    $.ajax({
                        type: "post",
                        url: "<%=basePath%>users/getUserTheme",
                        dataType: 'json',

                        data: "",
                        success: function (res) {
                            var data = res.object;
                            var menu = data.menuExpand;
                            for (var i = 0; i < $('.one').length; i++) {
                                if (i == menu) {
                                    $('.one').eq(i).find('.erji').show().addClass('actives');
                                }
                            }
                        }
                    })
                    $('.per_shezhi').click(function () {
                        $('[url="person_info"]').click()
                    });

                    //点击一级菜单。显示二级

                    $('.one_all').on('click', function () {
                        var top_one = $(this).parent().next('li').find('.one_all');
                        if ($(this).siblings().find('.erji').css('display') == 'none') {
                            $(this).find('.down_jiao').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/up.png');
                            $(this).siblings().find('.erji').show();
                            $(this).siblings().find('.erji').addClass('actives')
                            $(this).parent().siblings().find('.one_all').removeClass('one_check');
                            $(this).addClass('one_check');

                            /* console.log($(this).parent().next('li').find('.one_all')); */
                            top_one.css('border-top', '1px solid #999');
                        } else {
                            $(this).find('.down_jiao').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/down.png');
                            $(this).siblings().find('.erji').hide();
                            top_one.css('border-top', 'none');
                            $(this).parent().parent().find('.one_all').removeClass('one_check');
//                            $(this).addClass('one_check');
                        }
                    });

                    //点击二级，出现三级
                    $('.click_erji').on('click', function () {
                        var san = $(this).siblings().html();
                        if ($(this).siblings('.sanji').css('display') == 'none') {
                            $(this).find('.er_img').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/up.png');
                            $(this).siblings('.sanji').show();

                        } else {
                            $(this).find('.er_img').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/down.png');
                            $(this).siblings('.sanji').hide();
                        }

                    });
                    //点击二级菜单
                    $('.two_menu li').on('click', '.two_all', function () {
                        var isopenNew=$(this).parent().attr('data-er');
                        //给我的工作标签添加click事件
                        /*     console.log($(this).parent().attr('menu_tid')=='1020');*/
                        if ($(this).parent().attr('menu_tid') == '1020') {
                            $(this).parent().click();
                        }
                        $(this).parent('.two').siblings().find('.erji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//同层的二级img
                        $(this).parents('.one').siblings().find('.erji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//不同层级三级img
                        $(this).parents('.one').siblings().find('.sanji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//不同层的三级
                        $(this).parent('.two').siblings().find('.sanji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//同层的三级
                        $(this).find('.erji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/lan.png');//当前的img

                        $(this).parent().siblings().find('.two_all').removeClass('menu_change');//同层级的二级文字
//                        $(this).parent().siblings().find('.else_two').addClass('active')//同层级的有三级的二级文字
                        /*$(this).parents('.one').siblings().find('.else_two').css('background','rgb(232, 244, 252)')*/
                        $(this).parents('.one').siblings().find('.two_all').removeClass('menu_change');//不同层级的二级文字
                        $(this).parent('.two').siblings().find('.three').removeClass('three_change');//同层级的三级文字
                        $(this).parents('.one').siblings().find('.three').removeClass('three_change');//不同层级的三级文字
                        $(this).addClass('menu_change');

                        var url = $(this).attr('url');
                        var menu_tid = $(this).parent().attr('menu_tid');

                        if (menu[url.replace(/\//g, '_')]) {
                            url = menu[url.replace(/\//g, '_')];
                        }else {
                            url =url ;
                        }
                        if (menu_tid == '3010' || menu_tid == '3001' || menu_tid == '0136') {
                            url += '?0'
                        }
                        //判断标题id与iframeid是否相同
                        /*			console.log($('#f_'+menu_tid).length>0);*/
                        if(isopenNew == '1'){
                            window.open(url);
                        }else{
                            if ($('#f_' + menu_tid).length > 0) {
                                //页面一打开，切换显示
                                $('.all_content .iItem').hide();
                                $('#f_' + menu_tid).show();
                                if (menu_tid == '3010' || menu_tid == '3001' || menu_tid == '0136') {
                                    $('#f_' + menu_tid).find('iframe').attr('src', url)
                                }

                                $('#t_' + menu_tid).css({
                                    'background': 'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                                    'color': '#2a588c',
                                    'position': 'relative',
                                    'z-index': 99999
                                })
                                $('#t_' + menu_tid).siblings().css({
                                    'background': 'url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat',
                                    'color': '#fff',
                                    'position': 'relative',
                                    'z-index': 999
                                })
                            } else {
                                if ($(this).siblings('.sanji').length > 0) {
//                                $(this).css('background','#daf0fe');
                                    $(this).addClass('activesanji')
                                }
                                else {
                                    //页面不存在，新增 title和iframe
                                    if (mobileObj.statusTwo) {

                                        var titlestr = '<li class="choose" index="0;" id="t_' + menu_tid + '" title="' + $(this).find('h1').html() + '"><h1>' + $(this).find('h1').html() + '</h1><div class="img" style="display:none;"><img class="close"  src="img/main_img/icon.png"></div></li>';

                                        var iframestr = '<div id="f_' + menu_tid + '" class="iItem" ><iframe id="every_module" src="' + url + '" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';

                                        $('.main_title ul').append(titlestr);

                                        $('#t_' + menu_tid).siblings().attr('style', 'background: url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat;');
                                        $('#t_' + menu_tid).siblings().css('color', '#fff');
                                        /* console.log($('#t_'+menu_tid).siblings()); */
                                        $('.all_content').append(iframestr);
                                        $('.all_content .iItem').hide();
                                        $('#f_' + menu_tid).show();
                                        mobileObj.left()
                                    }
                                }
                            }
                        }
						if($('.main_title ul li').length >=4){
                            $('#iconCloseAll').show();
                        }else{
                            $('#iconCloseAll').hide();
                        }
                    });

                    //点击三级菜单，跳转页面。
                    $('.sanji').on('click', 'li', function () {
                        var isopenNewTh=$(this).attr('data-three');
                        $(this).parents('.two').siblings().find('.erji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//同层的二级img
                        $(this).parents('.one').siblings().find('.erji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//不同层级三级img
                        $(this).parents('.one').siblings().find('.sanji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//不同层的三级
                        $(this).siblings().find('.sanji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/hei.png');//同层的三级
                        $(this).find('.sanji_circle').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/lan.png');//当前的img

                        $(this).parents('.two').siblings().find('.two_all').removeClass('three_change');//同层级的二级文字
                        $(this).parents('.one').siblings().find('.two_all').removeClass('three_change');//同层级的二级文字
//                        $(this).parents('.one').siblings().find('.else_two').css('background','rgb(232, 244, 252)');//不同层级的有三级的二级文字
                        $(this).siblings().removeClass('three_change');//同层级的三级文字
                        $(this).parents('.one').siblings().find('.three').removeClass('three_change');//不同层级的三级文字
                        $(this).addClass('three_change');
                        $(this).parents('.two').siblings().find('.two_all').removeClass('menu_change')
                        var url = $(this).attr('url');
                        var menu_tid = $(this).attr('menu_tid');
                        if (menu[url.split('/').join('_')]) {
                            url = menu[url.split('/').join('_')];
                        } else {
                            url =url;
                        }

                        if(isopenNewTh == '1'){
                            window.open(url);
                        }else{
                            if ($('#f_' + menu_tid).length > 0) {
                                //页面一打开，切换显示
                                $('.all_content .iItem').hide();
                                $('#f_' + menu_tid).show();

                                $('#t_' + menu_tid).siblings().css({
                                    'background': 'url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat',
                                    'color': '#fff',
                                    'position': 'relative',
                                    'z-index': 999
                                });


                                $('#t_' + menu_tid).css({
                                    'background': 'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                                    'color': '#2a588c',
                                    'position': 'relative',
                                    'z-index': 99999
                                })


                            } else {
                                if (mobileObj.statusTwo) {
                                    //页面不存在，新增 title和iframe
                                    var titlestrs = '<li class="choose " index="0;" id="t_' + menu_tid + '" title="' + $(this).find('h1').html() + '"><h1>' + $(this).find('h1').html() + '</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';

                                    var iframestr = '<div id="f_' + menu_tid + '" class="iItem"><iframe id="every_module" src="' + url + '" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';

                                    $('.main_title ul').append(titlestrs);

                                    $('#t_' + menu_tid).siblings().attr('style', 'background: url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat;');
                                    $('#t_' + menu_tid).siblings().css('color', '#fff');
                                    $('.all_content').append(iframestr);
                                    $('.all_content .iItem').hide();
                                    $('#f_' + menu_tid).show();
                                    mobileObj.left()
                                }
                            }
                        }
						if($('.main_title ul li').length > 7){
                            $('#iconCloseAll').show();
                        }else{
                            $('#iconCloseAll').hide();
                        }

                    });

                    //success的后括号
                }
            });//ajax传入应用数据结束括号

        }//init方法结束

        init();//调用init()方法
        //移入
        $('.main_title').on('mouseover', 'li', function () {

            $(this).find('.close').attr('src', 'img/main_img/${sessionScope.InterfaceModel}/delet_yuan.png');
            $(this).find('.img').show();
        });
        //移出
        $('.main_title').on('mouseout', 'li', function () {
            $(this).find('.img').hide();
        });

        //点击标题栏
        $('.main_title ').on('click', 'li', function () {
            $('.main_title li').removeClass('change');
            $(this).addClass('change');
            var t_this = $(this).attr('id');
            var num = t_this.split('_')[1];
            if ($('#f_' + num).length > 0) {
                /*console.log($('#f_'+num).length);*/
                $('.all_content .iItem').hide();
                $('#f_' + num).show();
            }
            $(this).siblings().css({
                'background': 'url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat',
                'color': '#fff',
                'position': 'relative',
                'z-index': 999
            })
            $(this).css({
                'background': 'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color': '#2a588c',
                'position': 'relative',
                'z-index': 99999
            })
        });
        //删除
        //点击删除
        $('.main_title').on('click', '.close', function () {
            var me = this;
            mobileObj.right(function () {
                var re = $(me).parent().parent().attr('id');
                var delet = re.split('_')[1];
                $('#t_' + delet).siblings().attr('style', 'background:url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat; ');
                $('#t_' + delet).siblings().css('color', '#fff');
                $('#t_' + delet).prev().attr('style', 'background:url(img/main_img/title_yes.png) 0px 4px no-repeat; position: relative; z-index: 99999;');
                $(me).parent().parent().remove();
                if ($('#f_' + delet).prev().find('iframe').attr('src') == '') {
                    $('#f_0').show();
                    $('#f_' + delet).remove();
                } else {
                    $('#f_' + delet).prev().show();
                    $('#f_' + delet).remove();
                }
                if ($('.main_title ul li').length == mobileObj.liNum) {
                    $('#leftSpan').hide()
                    $('#rightSpan').hide()
                }
            });
            var re = $(me).parent().parent().attr('id');
            var delet = re.split('_')[1];
            $('#t_' + delet).siblings().attr('style', 'background:url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat; ');
            $('#t_' + delet).siblings().css('color', '#fff');
            $('#t_' + delet).prev().attr('style', 'background:url(img/main_img/title_yes.png) 0px 4px no-repeat; position: relative; z-index: 99999;');

            $(me).parent().parent().remove();
            if ($('#f_' + delet).prev().find('iframe').attr('src') == '') {
                $('#f_0').show();
                $('#f_' + delet).remove();
            } else {
                $('#f_' + delet).prev().show();
                $('#f_' + delet).remove();
            }
			if($('.main_title ul li').length > 7){
                $('#iconCloseAll').show();
            }else{
                $('#iconCloseAll').hide();
            }
        });
        //tab 切换
        $('.tab_t').on('click', 'li', function () {

            $(".tab_t li").removeClass("yingy");
            $(this).addClass('yingy');
            if ($(this).attr('id') == 'use') {
                /* init(); */
                $('.tab_cone').css("display", "block");
                $('.tab_ctwo').css("display", "none");
            } else {
                $('.tab_cone').css("display", "none");
                $('.tab_ctwo').css("display", "block");
            }

        });
        var bl = false;
        var numthree;
        var numTwo;
        //向左移动
        $('.right_scroll').on('click', function () {
            /* console.log($('.main_title li').length>=6); */
            if (!bl) {
                if (numTwo <= 6) {
                    bl = true;
                    return;
                }
                numTwo--;
                $('.left_scroll').show();
                $('.main_title li').animate({left: "-=100px"});
                $('.main_title ul').animate({width: "+=110px"});

            }
        })
        //向右移动
        $('.left_scroll').on('click', function () {
            if (bl) {
                numTwo++;
                if (numTwo == numthree) {
                    bl = false;
                }
            }
            /*	console.log($('.main_title li').length>=8);*/
            if ($('.main_title li').length >= 6) {
                $('.right_scroll').show();
                $('.main_title li').animate({left: "+=100px"});

                if ($('.main_title li:nth-child(1)').attr('left') == 0) {
                    $('.main_title li:nth-child(1)').css('left', '0px');
                }
            }
        });

        //组织
        $('.all_ul .tab_ctwo').on('click', '.childdept', function () {
            var that = $(this);

//            getChDept(that.next(),that.attr('deptid'));
        });
        function getChDept(target, deptId) {
            $.ajax({
                url: 'department/getChDept',
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {
                    /* if() */
                    if (deptId == 30) {
                        var str = '';
                        data.obj.forEach(function (v, i) {
                            if (v.deptName) {
                                str += '<li><span deptid="' + v.deptId + '" class="childdept dynatree-node dynatree-folder dynatree-expanded dynatree-has-children dynatree-lastsib"><span></span><img src="img/spirit/icon_department.png" alt=""><a href="#" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="margin-left:10%;"></ul></li>';
                            } else {

                                str += '<li><span deptid="' + v.deptId + '" class="childdept dynatree-node dynatree-folder dynatree-expanded dynatree-has-children "><span><img src="img/main_img/man.png" alt=""></span><img src="img/main_img/man.png" alt=""><a href="#" class="dynatree-title" title="' + v.userName + '">' + v.userName + '</a></span><ul style="margin-left:10%;"></ul></li>';

                            }

                        });
                    } else {
                        var str = '';
                        data.obj.forEach(function (v, i) {
                            if (v.deptName) {
                                str += '<li><span deptid="' + v.deptId + '" class="childdept dynatree-node dynatree-folder dynatree-expanded dynatree-has-children f"><span class=""></span><img src="img/spirit/icon_company.png" alt=""><a href="#" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="margin-left:10%;"></ul></li>';
                            } else {
                                if (v.sex == 0) {

                                    str += '<li><span deptid="' + v.deptId + '" class="childdept dynatree-node dynatree-folder dynatree-expanded dynatree-has-children"><span></span><img src="img/main_img/man.png" alt=""><a href="#" class="dynatree-title" title="' + v.userName + '">' + v.userName + '</a></span><ul style="margin-left:10%;"></ul></li>';
                                } else if (v.sex == 1) {
                                    str += '<li><span deptid="' + v.deptId + '" class="childdept dynatree-node dynatree-folder dynatree-expanded dynatree-has-children"><span></span><img src="img/main_img/women.png" alt=""><a href="#" class="dynatree-title" title="' + v.userName + '">' + v.userName + '</a></span><ul style="margin-left:10%;"></ul></li>';
                                }
                            }
                        });
                    }
                    target.html(str);
                }
            })
        }
        loadSidebar1($('#deptOrg'), 0)

        function loadSidebar1(target, deptId) {
//            console.log(deptId);
            $.ajax({
                url: '/department/getChDeptfq',
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {
                    var str = '';
                    data.obj.forEach(function (v, i) {
                        if (v.deptName) {
                            str += '<li><span data-types="1"  data-numtrue="1" ' +
                                'onclick= "imgDown(' + v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span><img src="/img/sys/dapt_right.png" alt="" style="margin-left: 12px;width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                        }
                    })
                    widthnum++;
                    target.append(str);
                }
            })
        }

        $.ajax({
            url: '/sys/showUnitManage',
            type: 'get',
            dataType: "JSON",
            data: '',
            success: function (obj) {
//                console.log(obj);
                var data = obj.object.unitName;
                $('#deptOrg .pickCompany .dynatree-title').text(data).attr('title', data);

            },
            error: function (e) {
//                console.log(e);
            }
        })

        //点击常用功能里面的div,进行页面跳转。
        $('.s_container').on('click', '.every_logo', function () {
            var tid = $(this).attr('menu_tid');
            if (tid == 0124) {
                return
            }
            var url = $(this).attr('url');
            /*	console.log(tid);
             console.log(url);*/

            if ($('#f_' + tid).length > 0) {
                $('.all_content .iItem').hide();
                $('#f_' + tid).show();

                $('#t_' + tid).css({
                    'background': 'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                    'color': '#2a588c',
                    'position': 'relative',
                    'z-index': 99999
                })
                $('#t_' + tid).siblings().css({
                    'background': 'url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) 0px 4px no-repeat',
                    'color': '#fff',
                    'position': 'relative',
                    'z-index': 999
                })
            } else {
                if (mobileObj.statusTwo) {
                    var titlestrs = '<li class="choose " index="0;" id="t_' + tid + '" title="' + $(this).find('h2').html() + '"><h1>' + $(this).find('h2').html() + '</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
                    var iframestr = '<div id="f_' + tid + '" class="iItem"><iframe id="every_module" src="' + url + '" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';

                    $('.main_title ul').append(titlestrs);
                    $('#t_' + tid).siblings().attr('style', 'background: url(img/main_img/${sessionScope.InterfaceModel}/title_no.png) -1px 2px no-repeat; ');
                    $('#t_' + tid).siblings().css('color', '#fff');
                    $('.all_content').append(iframestr);
                    $('.all_content .iItem').hide();
                    $('#f_' + tid).show();
                    mobileObj.left()
                }
            }
        })

        function returnUserName(users) {
            if (users == undefined || users == "") {
                return "";
            } else {
                return users.userName;
            }
        }

    });
</script>
<script>

    <%--//校务公开列表--%>
    <%--//页面加载时发送ajax获取下拉框数据--%>
    $(function () {
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type: 'get',
            dataType: "JSON",
            data: {"CodeNos": "GONGKAI_TYPE"},
            success: function (data) {
                var str = '';
                for (var i = 0; i < data.GONGKAI_TYPE.length; i++) {
                    if (i >= 2) {
                        break;
                    }
                    str += '<li class="strList" onclick="announcementXiaoWu(this)" data-bool="' + data.GONGKAI_TYPE[i].codeNo + '" >' + data.GONGKAI_TYPE[i].codeName + '</li>';
                }
                $('#xiaoWuLi').append(str);
            }
        })
    })
</script>
<script>
    <%--点击加减号菜单折叠与伸缩--%>
    var flag4=false;
    $('#zd_menu').on('click',function(){
        if(flag4){
            $('.two_menu ul').css('display','block');
            $('.two_menu ul').addClass('actives');
            flag4=false;
            $('.person').find('.down_jiao').attr('src','img/main_img/${sessionScope.InterfaceModel}/up.png');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').addClass('reduce_default');
        }else{
            $('.two_menu ul').css('display','none');
            $('.one_all').removeClass('one_check');
            flag4=true;
            $('.person').find('.down_jiao').attr('src','img/main_img/${sessionScope.InterfaceModel}/down.png');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').addClass('add_default');
        }
    })

    $('#tab_cTwo').on('click','.one',function(){
        if($('#tab_cTwo ul')[0].children[0].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[1].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[2].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[3].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[4].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[5].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[6].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[7].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[8].children[1].children[0].style.display=='none'&&$('#tab_cTwo ul')[0].children[9].children[1].children[0].style.display=='none' ){
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').addClass('add_default');
            flag4=true;
        }else{
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').addClass('reduce_default');
            flag4=false;

        }
    })

    $('#zd_menu').on('mouseover',function(){
        if(flag4){
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').addClass('add_float');
        }else{
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').addClass('reduce_float');
        }
    })
    $('#zd_menu').on('mouseout',function(){
        if(flag4){
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').addClass('add_default');
        }else{
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').addClass('reduce_default');
        }
    })
    $('#zd_menu').on('mousedown',function(){
        if(flag4){
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').removeClass('reduce_click');
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').addClass('add_click');
        }else{
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').removeClass('add_click');
            $('#zd_menu').addClass('reduce_click');
        }
    })
    $('#zd_menu').on('mouseup',function(){
        if(flag4){
            $('#zd_menu').removeClass('reduce_default');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').removeClass('reduce_click');
            $('#zd_menu').removeClass('add_click');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').addClass('add_default');
        }else{
            $('#zd_menu').removeClass('reduce_click');
            $('#zd_menu').removeClass('reduce_float');
            $('#zd_menu').removeClass('add_default');
            $('#zd_menu').removeClass('add_float');
            $('#zd_menu').removeClass('add_click');
            $('#zd_menu').addClass('reduce_default');
        }
    })
    $('#use').on('click',function(){
        $('#zd_menu').css('display','block');
    })
    $('#orgnize').on('click',function(){
        $('#zd_menu').css('display','none');
    })
</script>
</html>


