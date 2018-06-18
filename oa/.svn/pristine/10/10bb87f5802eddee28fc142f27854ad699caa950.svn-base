<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<head>
    <title><fmt:message code="main.newwork" /></title>
    <%--<meta name="viewport" content="width=device-width,target-densitydpi=high-dpi,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>--%>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/style.css" />
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/newwork.css" />
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/new.css">
    <link rel="stylesheet" type="text/css" href="../../css/main/theme1/index.css"/>
    <!--[if lte IE 8]>
<!--    <script type="text/javascript" src="/static/js/ccorrect_btn.js"></script>-->
<%--    <![endif]-->--%>

    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/main_js/index.js"></script>
    <script src="../../js/base/base.js"></script>
    <script src="/static/js/bootstrap/js/bootstrap/bootstrap.min.js"></script>
    <style>
        .tab_c{
            background: #f5f5f5;

        }
        .tab_cone{
            color: #111!important;
        }
        .one_all{
            border: none;
            border-bottom: #bfbfbf 1px solid;
            background: #f5f7f8 !important;
        }
        .one_logo {
             margin-left: 0;
             margin-top: 0;
            float: none;
        }
        .tab_cone .one:nth-child(1) {
            border-top: none;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>

<script>
if(window.external && typeof window.external.OA_SMS != 'undefined') //如果从OA精灵打开，则最大化窗口
{
var h = Math.min(800, screen.availHeight - 180);
var w = Math.min(1280, screen.availWidth - 80);
window.external.OA_SMS(w, h, "SET_SIZE");
}


var openRold=parent.opensload;
</script>
<style type="text/css">
#flow_sort_nav > a{
text-decoration:none;
color:#666666;
font-size: 18px;
font-weight:bold;
}
#flow_sort_nav > a:hover {
    text-decoration: none;
    color: #589Fff;
    font-weight: bold;
}
</style>
<style type="text/css">

    .container-fluid{
        width: 100%;
        height:100%;
        overflow-x:hidden;
    }
    .cont_left{
        background: none !important;
        border-right: 1px solid #999 !important;
    }
    .all_ul{
        width: 100% !important;
        margin-left: 0% !important;
    }
    .tab_c{
        margin-left: 0% !important;
    }
    .one_all{
        height: 40px !important;
        width: 100% !important;
        border-left: none !important;
        border-right: none !important;
        border-radius: none !important;
    }
    .one_name{
        line-height: 40px !important;
        text-align: center;
    }
    .down_jiao{
        margin-left: 16%;
    }
    .two_all h1{
        margin-left: 27%;
    }

    .cont_left{
        width:15%;
    }
    .cont_rig{
        width:84%;
    }
    .rig_all{
        width:95%;
        height:87%;
        margin:auto;
    }
    .rig_cont ul li{
        width: 99%;
        height: 80px;
        border: 1px solid #cccccc;
        border-radius: 2px;
        background: #f9fbff;
        margin-top: 10px;
    }
    .rig_cont{
        overflow-y: scroll;
        height: 98%;

    }
    .rig_title img,.rig_title h1{
        float:left;
        margin-top:5px;
    }
    .rig_title img{
        margin-top:10px;
    }
    .rig_title h1{
        font-size: 15pt;
        font-weight: normal;
        font-family: '微软雅黑';
        margin-left: 12px;
        line-height: 35px;
    }
    .rig_left,.rig_mid,.rig_rig{
        float: left;
        height: 100%;
    }
    .rig_left,.rig_rig{
       width:29%;
    }
    .rig_mid{
        width:40%;
    }
    .liucheng,.liucheng1,.liucheng2{
        height:100%;
        float: left;
        margin-right:7%;
    }
    .liucheng img,.liucheng h1,.liucheng1 img,.liucheng1 h1,.liucheng2 img,.liucheng2 h1{
        float:left;
    }
    .rig_rig div{
        width: 50%;
        float: left;
        margin-top: 14px;
    }
    .xinjian_img{
        margin-left: 39%;
    }
    .xinjian_h1{
        width: 100%;
        height: 20px;
        text-align: center;
    }
    .rig_left h1{
        font-size: 13pt;
        font-weight: bold;
        margin-left: 12px;
        margin-top: 17px;
        width: 90%;
        overflow: hidden;
        text-overflow:ellipsis;
        white-space: nowrap;
    }
    .rig_left h2{
        margin-left: 12px;
        color: #b7b8b9;
        margin-top: 5px;
        width:90%;
        overflow: hidden;
        text-overflow:ellipsis;
        white-space: nowrap;
    }
    .liucheng h1,.liucheng1 h1,.liucheng2 h1{
        line-height: 80px;
        margin-left: 5px;
    }
    .liucheng img,.liucheng1 img,.liucheng2 img{
        margin-top: 31px;
    }
    .new_work{
        font-size: 22px;
        margin-top: 9px;
    }
    .new-search{
        margin-top:8px !important;
    }
    .one_all{
        background: #d9e5e9 !important;
    }
    .one_all.one_alltwo{
        background: #fff!important;
    }
    .tab_cone li .one_all:hover{
        background: #add2f8 !important;
    }
    .tab_cone{
        width: 104% !important;
        height:99% !important;
    }
    .er_img {
        margin-top: 5% !important;
        margin-left: 4% !important;
    }
    #searchbtn,.rig_mid h1,.rig_rig h1{
        cursor: pointer;
    }
    .namenew{
        cursor: pointer;
    }
    /*定义滚动条宽高及背景，宽高分别对应横竖滚动条的尺寸*/
    .rig_cont::-webkit-scrollbar{
        width: 0px;
        height: 16px;
        background-color: #f5f5f5;
    }
    /*定义滚动条的轨道，内阴影及圆角*/
    .rig_cont::-webkit-scrollbar-track{
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        border-radius: 10px;
        background-color: #f5f5f5;
    }
    /*定义滑块，内阴影及圆角*/
    .rig_cont::-webkit-scrollbar-thumb{
        /*width: 10px;*/
        height: 20px;
        border-radius: 10px;
        -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
        background-color: #555;
    }

    #sort_cont li:hover{
        background: #e8f4fc;
    }
    .quick:hover{
        cursor: pointer;
    }
    .quick:hover .xinjian_h1{
        color:#2b7fe0;
    }
    .xiangdao:hover{
        cursor: pointer;
    }
    .xiangdao:hover h1{
        color:#2b7fe0;
    }
    #form_select{
        height: 28.4px !important;
    }
    /*一级菜单移入移出样式的改变*/
    .one_all li:hover{
        background:#ccebff;
        cursor:pointer;
    }
    .one_all li:hover h1{
        color:#2f8ae3;
    }
    /*二级菜单移入移出样式的改变*/
   /* .two_menu li:hover{
        background:#ccebff;
        cursor:pointer;
    }
    .two_menu li:hover h1{
        color:#2f8ae3;
    }*/
    .two .two_all:hover{
        color:#2f8ae3;
        background:#ccebff;
        cursor: pointer;
    }
    .menu_change{
        color:#2f8ae3;
    }
    /*三级菜单移入移出样式的改变*/
    .three:hover{
        color:#2f8ae3;
        background:#ccebff;
    }
    .rig_mid h1{
        font-size:16px;
    }
    .liucheng img, .liucheng1 img, .liucheng2 img{
        margin-top:35px;
    }
</style>
<script type="text/javascript">
var loading='<div class="loading"><fmt:message code="workflow.th.doing" /></div>';
var load_error = '<div class="message"><fmt:message code="workflow.th.dataerr" /></div>';
var quick_flow_tips = '<fmt:message code="workflow.th.alert" />';
</script>
<body>
<input id="cur_user" type="hidden" value="1">
<div class="container-fluid">
    <div class="row-fluid title-row" style="background-color:#f8f8f8;z-index:99;border-bottom:1px solid #999;height:45px;">
        <div id="title" class="date">
            <img class="title_img" src="/img/commonTheme/${sessionScope.InterfaceModel}/new_work.png"><h3 class="new_work" style="margin-bottom:0px;"><fmt:message code="main.newwork" /> </h3>
        </div>

        <div class="abs-right" style="position:fixed;">
            <div class="search_area form-search">
                <div class="input-append new-search">
                    <%--<input type="text" class="search-query" id="form_select" name="form_select" placeholder="<fmt:message code="workflow.th.flowname" />">--%>
                    <input type="text" class="search-query" id="form_select" name="form_select" placeholder="<fmt:message code="workflow.th.flowname" />">
                        <button  class="btn btn-primary" id="searchbtn" ><fmt:message code="global.lang.query" /></button>
                    <div class="btn-group" style="margin-left:8px;display: none;">
                        <a class="btn" style="zoom:1;font-weight:normal;" id="w_list_view" href="javascript:;" onclick=""><span><fmt:message code="workflow.th.view" /></span></a>
                    </div>
                    <div class="btn-group" style="margin-left:-1px;display: none;" >
                        <button class="btn" style="font-weight:normal;" id="w_task_view" onclick="to_old_new_work()" ><span><fmt:message code="workflow.th.listview" /></span></button>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <div class="cont" id="client">
        <div class="cont_left">
            <ul class="all_ul">
                <div class="tab_c list">

                    <ul class="tab_cone a yiji" >

                    </ul>
                </div>
            </ul>

        </div>
        <div class="cont_rig">
            <div class="rig_all">
                <div class="rig_title">
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/ofen_workss.png" alt="">
                    <h1 class="title_name"><fmt:message code="workflow.th.Commonwork" /></h1>
                </div>
                <div class="rig_cont" style="min-width: 650px;">
                    <ul id="sort_cont">

                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>

</body>
</html>
<script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>
<script>
    function runWorkListPage() {
        parent.changeMenuTab(1020);
    }
    $(function () {


        function init(){
            $.ajax({
                url:'../../workflow/flowclassify/flowByAuth',
                type:'get',
                dataType:'json',
                success:function(obj){
                    var data=obj.datas;
                    var str='';
                    for(var i=0;i<data.length;i++){
                        var er='';
                        for(var j=0;j<data[i].childs.length;j++){

                            if(data[i].childs[j].childs.length>0){
                                var three='';
                                for(var k=0;k<data[i].childs[j].childs.length;k++){
                                    three +='<li class="three checked" menu_tid='+data[i].childs[j].childs[k].sortId+' url='+data[i].childs[j].childs[k].url+' title="'+data[i].childs[j].childs[k].sortName+'"><div class="work_sanji"  style="margin-left:18px;"><img class="sanji_circle" src=""><h1 style="margin-left:28%;">'+data[i].childs[j].childs[k].sortName+'</h1></div></li>' ;
                                }
                                er += '<li class="two"  ><div url='+data[i].childs[j].url+' menu_tid='+data[i].childs[j].sortId+'  class="two_all click_erji  checked"  title="'+data[i].childs[j].sortName+'"><h1>'+data[i].childs[j].sortName+'</h1><img class="er_img" src="../../img/workflow/work/add_work/right.png"></div><ul class="sanji" style="display:none;">'+three+'</ul></li>';

                            }else{

                                er += '<li class="two" ><div url='+data[i].childs[j].url+' menu_tid='+data[i].childs[j].sortId+' class="two_all  checked" title="'+data[i].childs[j].sortName+'"><h1 class="erji_h1">'+data[i].childs[j].sortName+'</h1></div></li>';

                            }
                        }
                        if(data[i].childs==''){
                            str+='<li class="one person" id="administ">' +
                                '<div class="one_all checked" title="'+data[i].sortName+'" ' +
                                'menu_tid='+data[i].sortId+'>' +
                                '<h1 class="one_name" id="administ">' +
                                '<img style="vertical-align: text-bottom;\
                    margin-right: 4px;" src="/img/commonTheme/${sessionScope.InterfaceModel}/gongzuo.png" />'+data[i].sortName+'</h1>' +
                                '</div>' +
                                '<div class="two_menu">' +
                                '<ul class="erji b"  style="width:100%;display:none;">' +
                                '<li class="two">' +
                                '<div class="two_all">'+er+'</div>' +
                                '</li>' +
                                '</ul>' +
                                '</div>' +
                                '</li>';
                        }else{
                            str+='<li class="one person" id="administ">' +
                                '<div class="one_all checked" ' +
                                'title="'+data[i].sortName+'" ' +
                                'menu_tid='+data[i].sortId+'>' +
                                '<h1 class="one_name" ' +
                                'id="administ"><img style="vertical-align: text-bottom;\
                    margin-right: 4px;" src="/img/commonTheme/${sessionScope.InterfaceModel}/gongzuo.png" />'+data[i].sortName+'</h1>' +
                                '<img class="down_jiao" ' +
                                'src="../../img/workflow/work/add_work/right.png">' +
                                '</div>' +
                                '<div class="two_menu">' +
                                '<ul class="erji b"  style="width:100%;display:none;">' +
                                '<li class="two">' +
                                '<div class="two_all">'+er+'</div>' +
                                '</li>' +
                                '</ul>' +
                                '</div>' +
                                '</li>';
                        }

                    }
                    var stt='<li class="one person" id="administ">' +
                        '<div class="one_all checked">' +
                        '<h1 class="one_name" id="administ"><img style="vertical-align: text-bottom;\
                    margin-right: 4px;" src="/img/commonTheme/${sessionScope.InterfaceModel}/ofen_works.png" />\
                        <fmt:message code="workflow.th.Commonwork" /></h1>\
                        </div>\
                        </li>\
                        <li class="one person" id="administ">\
                        <div class="one_all checked">\
                        <h1 class="one_name" id="administ"><img style="vertical-align: text-bottom;margin-right: 4px;" \
                        src="/img/commonTheme/${sessionScope.InterfaceModel}/all_works.png" />\
                        <fmt:message code="workflow.th.allwork" /></h1>\
                        </div>\
                        </li>\
                        <li class="one person" id="administ">\
                        <div class="one_all checked one_alltwo" data-type="1">\
                        <h1 class="one_name" id="administ">\
                       <fmt:message code="workflow.th.New" /></h1>\
                        </div>\
                        </li>';
                    $(".tab_cone").html(stt+str);


                    //点击一级菜单。显示二级
                    $('.one_all').on('click',function () {
                        if($(this).attr('data-type')==1){
                            return;
                        }
                        var top_one=$(this).parent().next('li').find('.one_all');
                        if ($(this).siblings().find('.erji').css('display')=='none') {
                            $(this).find('.down_jiao').attr('src','../../img/workflow/work/add_work/down.png');
                            $(this).siblings().find('.erji').show();
                            $(this).siblings().find('.erji').css('background','#e8f4fc');

                            /*top_one.css('border-top','1px solid #999');*/
                        }else{
                          $(this).find('.down_jiao').attr('src','../../img/workflow/work/add_work/right.png');
                            $(this).siblings().find('.erji').hide();
                           /* top_one.css('border-top','none');*/
                        }
                        if($(this).siblings('.two_menu')){
//                            $(this).find('h1').css({
//                                'color':'#000'
//                            });
                        }else{
//                            $(this).find('h1').css({
//                                'color':'#2f8ae3'
//                               /* 'cursor':'pointer'*/
//                            });
                            $(this).css('background','#ccebff');
                        }

                        if($(this).find('h1').find('img').prop('src').indexOf('gongzuo')!=-1){
                            $('.rig_title').find('img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/gongzuos.png')
                        }else  if($(this).find('h1').find('img').prop('src').indexOf('all_works')!=-1){
                            $('.rig_title').find('img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/all_wosrkstwo.png')
                        }else  if($(this).find('h1').find('img').prop('src').indexOf('ofen_works')!=-1){
                            $('.rig_title').find('img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/ofen_workss.png')
                        }


                    });

                    //点击二级，出现三级
                    $('.click_erji').on('click',function () {
                        var san= $(this).siblings().html();
                        if ($(this).siblings('.sanji').css('display')=='none') {
                            $(this).find('.er_img').attr('src','../../img/workflow/work/add_work/down.png');
                            $(this).siblings('.sanji').show();

                        }else{
                           $(this).find('.er_img').attr('src','../../img/workflow/work/add_work/right.png');
                            $(this).siblings('.sanji').hide();
                        }
                    });

                    //点击二级菜单
                    $('.two_menu li').on('click','.two_all',function(){
                        var url=$(this).attr('url');
                        var menu_tid=$(this).parent().attr('menu_tid');
                        //样式的 改变
                        $(this).parent().siblings().find('.two_all').removeClass('menu_change');//同层级的二级文字
                        $(this).parents('.one').siblings().find('.two_all').removeClass('menu_change');//同层级的二级文字
                        $(this).parent('.two').siblings().find('.three').removeClass('menu_change');//同层级的三级文字
                        $(this).parents('.one').siblings().find('.three').removeClass('menu_change');//不同层级的三级文字
                        $(this).addClass('menu_change');

                        //判断标题id与iframeid是否相同
                        if($('#f_'+menu_tid).length>0){
                            //页面一打开，切换显示
                            $('.all_content .iItem').hide();
                            $('#f_'+menu_tid).show();

                            $('#t_'+menu_tid).css({
                                'color':'#2a588c',
                                'position':'relative',
                                'z-index':99999
                            })
                            $('#t_'+menu_tid).siblings().css({
                                'color':'#fff',
                                'position':'relative',
                                'z-index':999
                            });
                        }else{
                            if($(this).siblings('.sanji').length>0){
                                $(this).find('h1').attr('style','color:#000');
                            }else{
                                //页面不存在，新增 title和iframe

                                var titlestr = '<li class="choose" index="0;" id="t_'+menu_tid+'" title="'+$(this).find('h1').html()+'"><h1>'+$(this).find('h1').html()+'</h1><div class="img" style="display:none;"><img class="close"  src="img/main_img/icon.png"></div></li>';

                                var iframestr = '<div id="f_'+menu_tid+'" class="iItem" ><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';

                                $('.main_title ul').append(titlestr);

                                $('#t_'+menu_tid).siblings().attr('style','background: url(img/main_img/title_no.png) 0px 4px no-repeat;');
                                $('#t_'+menu_tid).siblings().css('color','#fff');

                                $('.all_content').append(iframestr);
                                $('.all_content .iItem').hide();
                                $('#f_'+menu_tid).show();

                            }

                        }


                    });


                    //点击三级菜单，跳转页面。
                    $('.sanji').on('click','li',function(){
                        var url=$(this).attr('url');
                        var menu_tid=$(this).attr('menu_tid');
                        //样式改变

                        $(this).parents('.two').siblings().find('.two_all').removeClass('menu_change');//同层级的二级文字
                        $(this).parents('.one').siblings().find('.two_all').removeClass('menu_change');//同层级的二级文字
                        $(this).siblings().removeClass('menu_change');//同层级的三级文字
                        $(this).parents('.one').siblings().find('.three').removeClass('menu_change');//不同层级的三级文字
                        $(this).addClass('menu_change');



                        if($('#f_'+menu_tid).length>0){
                            //页面一打开，切换显示
                            $('.all_content .iItem').hide();
                            $('#f_'+menu_tid).show();

                            $('#t_'+menu_tid).siblings().css({
                                'color':'#fff',
                                'position':'relative',
                                'z-index':999
                            });
                            $('#t_'+menu_tid).css({
                               /* 'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',*/
                                'color':'#2a588c',
                                'position':'relative',
                                'z-index':99999
                            })
                        }else{

                            //页面不存在，新增 title和iframe
                            var titlestrs = '<li class="choose " index="0;" id="t_'+menu_tid+'" title="'+$(this).find('h1').html()+'"><h1>'+$(this).find('h1').html()+'</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';

                            var iframestr = '<div id="f_'+menu_tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';

                            $('.main_title ul').append(titlestrs);

                            $('#t_'+menu_tid).siblings().attr('style','background: url(img/main_img/title_no.png) 0px 4px no-repeat;');
                            $('#t_'+menu_tid).siblings().css('color','#fff');
                            $('.all_content').append(iframestr);
                            $('.all_content .iItem').hide();
                            $('#f_'+menu_tid).show();
                        }

                    });
                }
            });

        }//init方法结束


        init();//调用init()方法

        //右侧内容接口对接
        $('.tab_cone').on('click','.checked',function(){
            var sortId=$(this).attr('menu_tid');

            $('.title_name').html($(this).find('h1').text());

        /*  alert(sortId);*/
            $.ajax({
                url:'../../flow/flowAuthOrSearch',
                type:'get',
                dataType:'json',
                data:{
                    sortId:sortId
                },
                success:function(obj){
                    var data=obj.obj;
                    var str='';
                    renderData(data);

                }
            })
        })

        $.ajax({
            url:'../../flow/flowAuthOrSearch',
            type:'get',
            dataType:'json',
            success:function(obj){
                var data=obj.obj;
                var str='';
                renderData(data);
            }
        })

        function renderData(data) {
            var str='';
            for(var i=0;i<data.length;i++){
                if(data[i].runName){
                    str+='<li class="sort_new" tid='+data[i].flowId+' formId='+data[i].formId+' sortId='+data[i].flowSort+'><div class="rig_left">'+
                        '<h1 flowId='+data[i].flowId+' class="namenew">'+data[i].flowName+'</h1><h2 class="runName">'+data[i].runName.replace(/\s/g,'<i style="margin: 0 2px;"></i>')+'</h2></div>'+
                        '<div class="rig_mid">'+
                        '<div class="liucheng" flowId='+data[i].flowId+'><img src="../../img/workflow/work/add_work/sheji.png" alt=""><h1><fmt:message code="newWork.th.ProcessDesign" /></h1></div>'+
                        '<div class="liucheng1" flowId='+data[i].flowId+'><img src="../../img/workflow/work/add_work/liucheng.png" alt=""><h1><fmt:message code="newWork.th.FlowForm" /></h1></div>'+
                        '<div class="liucheng2"><img src="../../img/workflow/work/add_work/speak.png" alt=""><h1><fmt:message code="workflow.th.Processdes" /></h1></div></div>'+
                        '<div class="rig_rig"><div class="quick" flowId='+data[i].flowId+'><img class="xinjian_img"  src="../../img/workflow/work/add_work/xinjian.png" alt=""><h1 class="xinjian_h1" id="quick_new" ><fmt:message code="newWork.th.QuickBuild" /></h1></div>'+
                        '<div class="xiangdao" flowId='+data[i].flowId+'><img src="../../img/workflow/work/add_work/xiangdao.png" style="margin-left: 6%;" alt=""><h1><fmt:message code="newWork.th.NewWizard" /></h1></div></div></li>'
                }else{
                    str+='<li class="sort_new" tid='+data[i].flowId+' formId='+data[i].formId+' sortId='+data[i].flowSort+'><div class="rig_left">'+
                        '<h1 flowId='+data[i].flowId+' class="namenew">'+data[i].flowName+'</h1><h2 class="runName"><fmt:message code="newWork.th.Process" /></h2></div>'+
                        '<div class="rig_mid">'+
                        '<div class="liucheng" flowId='+data[i].flowId+'><img src="../../img/workflow/work/add_work/sheji.png" alt=""><h1><fmt:message code="newWork.th.ProcessDesign" /></h1></div>'+
                        '<div class="liucheng1"><img src="../../img/workflow/work/add_work/liucheng.png" alt=""><h1><fmt:message code="newWork.th.FlowForm" /></h1></div>'+
                        '<div class="liucheng2"><img src="../../img/workflow/work/add_work/speak.png" alt=""><h1><fmt:message code="workflow.th.Processdescription" /></h1></div></div>'+
                        '<div class="rig_rig"><div class="quick" flowId='+data[i].flowId+'><img class="xinjian_img"  src="../../img/workflow/work/add_work/xinjian.png" alt=""><h1 class="xinjian_h1"  id="quick_new" ><fmt:message code="newWork.th.QuickBuild" /></h1></div>'+
                        '<div class="xiangdao" flowId='+data[i].flowId+'><img src="../../img/workflow/work/add_work/xiangdao.png" style="margin-left: 6%;" alt=""><h1><fmt:message code="newWork.th.NewWizard" /></h1></div></div></li>'
                }
            }
            $('#sort_cont').html(str);
        }

        $(document).keyup(function (e) {
            if(e.keyCode==13){
                $('#searchbtn').click()
            }
        })
        //查询按钮接口
        $('#searchbtn').on('click',function(){
            $('.title_name').html('<fmt:message code="workflow.th.allwork" />');
            var text=$(this).siblings('#form_select').val();

            $.ajax({
                url:'../../flow/flowAuthOrSearch',
                type:'get',
                dataType:'json',
                data:{
                    searchValue:text
                },
                success:function(obj){
                    if(obj.flag==true){
                        var data=obj.obj;
                        if(data.length == 0){
                            $.layerMsg({content:'没有子流程或未设置新建权限！',icon:6},function(){
                            });
                        };
                        var str='';
                        renderData(data);
                    }
                }
            })
        });

        //点击名称快速新建页面
        $('#sort_cont').on('click','.namenew',function(){
            var flowId= $(this).attr('flowId');
            user_id='quick';

//                if(typeof(qt) == 'undefined'){
                    newWorkFlow(flowId,function (data) {
                        $.popWindow("workform?flowId="+flowId+'&type=new&flowStep=1&prcsId=1&runId='+data.flowRun.runId,'<fmt:message code="newWork.th.Quick" />','0','0','1150px','700px');
                    })
                <%--}else{--%>
                    <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                        <%--var content = channel.objects.interface;--%>
                        <%--content.xoa_sms('/workflow/work/workform?flowId='+flowId+'&type=new&flowStep=1&prcsId=1','<fmt:message code="newWork.th.Quick"/>',"web_child_url");--%>
                    <%--});--%>
                <%--}--%>

        });

        //点击出现快速新建页面
        $('#sort_cont').on('click','.quick',function(){
           var flowId= $(this).attr('flowId');
            user_id='quick';

//                if(typeof(qt) == 'undefined'){
                    newWorkFlow(flowId,function (data) {
                        $.popWindow("workform?flowId="+flowId+'&type=new&flowStep=1&prcsId=1&runId='+data.flowRun.runId,'<fmt:message code="newWork.th.Quick" />','0','0','1150px','700px');
                    })
                <%--}else{--%>
                    <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                        <%--var content = channel.objects.interface;--%>
                        <%--content.xoa_sms('/workflow/work/workform?flowId='+flowId+'&type=new&flowStep=1&prcsId=1','<fmt:message code="newWork.th.Quick"/>',"web_child_url");--%>
                    <%--});--%>
                <%--}--%>

        });
        function newWorkFlow(flowId,cb){
            $.ajax({
                url:'../../workflow/work/workfastAdd',
                type:'get',
                dataType:'json',
                data:{
                    flowId:flowId,
                    prcsId : 1,
                    flowStep : 1,
                    runId:'',
                    preView:0
                },
                success:function(res){
                    if(res.flag==true){

                        cb(res.object);
                    }
                }
            });
        }
        //点击新建向导
        $('#sort_cont').on('click','.xiangdao',function(){
            var flowId=$(this).attr('flowId');
//            if(typeof(qt) == 'undefined'){
                $.popWindow("newflowguider?flowId="+flowId+'&flowStep=1&prcsId=1','<fmt:message code="newWork.th.Quick" />','0','0','1150px','700px');
            <%--}else{--%>
                <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                    <%--var content = channel.objects.interface;--%>
                    <%--content.xoa_sms('/workflow/work/newflowguider?flowId='+flowId+'&flowStep=1&prcsId=1','<fmt:message code="newWork.th.Quick"/>',"web_child_url");--%>
                <%--});--%>
            <%--}--%>
        })
        //点击流程设计图
        $('#sort_cont').on('click','.liucheng',function(){
            var flowId=$(this).attr('flowId');
//            if(typeof(qt) == 'undefined'){
                window.open('/flowSetting/processDesignToolsT?flowId='+flowId+'&type=0','流程设计器预览','width='+(window.screen.availWidth)+',height='+(window.screen.availHeight)+',top=0,left=0,scrollbars=no,resizable=no');
//            }else{
//                new QWebChannel(qt.webChannelTransport, function(channel){
//                    var content = channel.objects.interface;
//                    content.xoa_sms('/flowSetting/processDesignToolsT?flowId='+flowId+'&type=0','流程设计器预览',"web_child_url");
//                });
//            }
        })
        //点击流程表单
        $('#sort_cont').on('click','.liucheng1',function(){
          /*  alert('111');*/
            var flowId= $(this).attr('flowId');
            var formId=$(this).parents('.sort_new').attr('formid');
            /*      alert(formId);*/
            user_id='quick';
//            if(typeof(qt) == 'undefined'){
                $.popWindow('workform1?formId='+formId,'<fmt:message code="newWork.th.Quick" />','0','0','1150px','700px');
            <%--}else{--%>
                <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                    <%--var content = channel.objects.interface;--%>
                    <%--content.xoa_sms('/workflow/work/workform1?formId='+formId,'<fmt:message code="newWork.th.Quick" />',"web_child_url");--%>
                <%--});--%>
            <%--}--%>
        })
        //点击流程说明
        $('#sort_cont').on('click','.liucheng2',function(){
            var flowId=$(this).parents('.sort_new').attr('tid');
            var formId=$(this).parents('.sort_new').attr('formid');
            var word=$(this).parent().siblings('.rig_left').find('h1').text();
//            if(typeof(qt) == 'undefined'){
                $.popWindow("processSpeak?flowId="+flowId+'&formId='+formId,'流程说明-'+word+'','0','0','1150px','700px');
//            }else{
//                new QWebChannel(qt.webChannelTransport, function(channel){
//                    var content = channel.objects.interface;
//                    content.xoa_sms('/workflow/work/processSpeak?flowId='+flowId+'&formId='+formId,'流程说明-'+word+'',"web_child_url");
//                });
//            }
        })

    })
</script>
<script>
    autodivheight();
    function autodivheight(){
        var winHeight=0;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        if (document.documentElement && document.documentElement.clientHeight)
            winHeight = document.documentElement.clientHeight;
        winWidth = document.documentElement.clientWidth;
        document.getElementById("client").style.height= winHeight +"px";
        document.getElementById("client").style.width= winWidth  +"px";

    }
    window.onresize=autodivheight;
</script>
