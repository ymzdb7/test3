<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/31
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.designprocess" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <link rel="stylesheet" href="/lib/laydate.css">
    <style>
        .cont_list .icon_d {
            display: block;
            width: 12px;
            height: 12px;
            background: url(/img/workflow/flowsetting/icon_rightarrow_03.png) no-repeat -1px -1px;
            position: absolute;
            top: 20px;
            right: 30px;
        }
    </style>
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script>
        function fileNew(me) {
            $('#datasave').attr('action','/flow/inputFlow?flowId='+$.GetRequest().flowId)
            $('#datasave').ajaxSubmit({
                type:'post',
                dataType:'json',
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="menuSSetting.th.importSuccess" />！', icon: 1}, function () {
                        });
                    }else {
                        alert('异常')
                    }
                }
            })
        }
    </script>
</head>
<body>
<form action="" id="datasave">
    <input type="file" style="display: none" onchange="fileNew(this)" name="file">
</form>
    <div class="content clearfix">
        <div class="title">
            <img style="vertical-align: middle;margin-top: -4px;" src="/img/workflow/liuchengbuzhoua.png" alt="">
            <span style="vertical-align: middle"><fmt:message code="workflow.th.designprocess" /></span>
        </div>
        <ul id="cont_list" class="cont_list">
            <li>
                <a href="javascript:void(0)" class="btn_click btn_h btn " data-url="/flowSetting/theHomePage">
                    <img src="/img/workflow/flowsetting/icon_mainprocess_03.png" alt="">
                    <fmt:message code="workflow.th.firstpage" />
                </a>
            </li>
            <li class="list1">
                <a href="javascript:void(0)" class="btn_click btn_h btn " data-display="hide">
                    <img src="/img/workflow/flowsetting/icon_process_leftbar_03.png" alt="">
                    <fmt:message code="main.designflow" />
                    <i class="icon_d"></i>
                </a>

                <ul class="hide_list1 hide  " >
                    <li data-child="true" data-url="/flowSetting/attributeThree?flowId=" data-id="true">
                        <a href="javascript:void(0)" class="btn_h">
                            <i class="icon"></i>
                            <fmt:message code="workflow.th.defineprocess" />
                        </a>
                    </li>
                    <li data-child="true" data-url="/flowSetting/stepsTwo">
                        <a href="javascript:void(0)" class="btn_h">
                            <i class="icon"></i>
                            <fmt:message code="workflow.th.designprocess" />
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)" data-url="/workflow/work/workform1?formId=" id="previewTheForm" class="btn_h">
                            <i class="icon"></i>
                            <fmt:message code="workflow.th.previewform" />
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)"  id="ImportTwo" class="btn_h ">
                            <i class="icon"></i>
                            <fmt:message code="workflow.th.Import" />
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:void(0)" class="btn_click btn_h btn" data-url="/flowSetting/permissions">
                    <img src="/img/workflow/flowsetting/icon_management_03.png" alt="">
                    <fmt:message code="workflow.th.privilege" />
                </a>
            </li>
            <li style="display: none;">
                <a href="javascript:void(0)" class="btn_click btn_h btn" data-url="/flowSetting/timingTask">
                    <img src="/img/workflow/flowsetting/icon_timedtask_03.png" alt="">
                    <fmt:message code="workflow.th.timedtask" />
                </a>
            </li>
            <li  style="display: none;">
                <a href="javascript:void(0)" data-url="/flowSetting/configureTemplateQuery" class="btn_click btn_h btn ">
                    <img src="/img/workflow/flowsetting/icon_search_03.png" alt="">
                    <fmt:message code="workflow.th.configuring" />
                </a>
            </li>
            <li  style="display: none;">
                <a href="javascript:void(0)" class="btn_click btn_h btn" data-url="/flowSetting/applicationLayoutFile">
                    <img src="/img/workflow/flowsetting/icon_article_03.png" alt="">
                    <fmt:message code="workflow.th.applylayoutfiles" />
                </a>
            </li>
            <li>
                <a href="javascript:void(0)" class="btn_click btn_h btn btn1" data-display="hide">
                    <img src="/img/workflow/flowsetting/icon_more_03.png" alt="">
                    <fmt:message code="notice.type.other" />
                    <i class="icon_d"></i>
                </a>

                <ul class="hide_list1 hide btnclia " style="display: none">
                    <li>
                        <a href="javascript:void(0)" class="btn_h clearFlow">
                            <i class="icon"></i>
                            <fmt:message code="global.lang.empty" />
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0)" class="btn_h deleteFlow">
                            <i class="icon"></i>
                            <fmt:message code="menuSSetting.th.deleteMenu" />
                        </a>
                    </li>
                    <%--<li>--%>
                        <%--<a href="javascript:void(0)" class="btn_h inDevelopment">--%>
                            <%--<i class="icon"></i>--%>
                            <%--数据迁移--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="javascript:void(0)" class="btn_h inDevelopment">--%>
                            <%--<i class="icon"></i>--%>
                            <%--菜单定义--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="javascript:void(0)" class="btn_h inDevelopment">--%>
                            <%--<i class="icon"></i>--%>
                            <%--查询字段--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <%--<li>--%>
                        <%--<a href="javascript:void(0)" class="btn_h inDevelopment">--%>
                            <%--<i class="icon"></i>--%>
                            <%--效验--%>
                        <%--</a>--%>
                    <%--</li>--%>
                    <li>
                        <a href="javascript:void(0)" id="inDevelopmentTwo" class="btn_h">
                            <i class="icon"></i>
                            <fmt:message code="global.lang.report" />
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
        <div class="cont_r" id="cont_rTwo" style="height: 100%;">
            <iframe src="" frameborder="0" style="height: 100%;width: 100%">

            </iframe>
        </div>
    </div>
    <script>
            var getResObj=$.GetRequest();
            function parentUrl(urlNum) {
                window.location.href=urlNum;
//                $('#cont_rTwo').find('iframe').attr('src',url)
            }

            $('#inDevelopmentTwo').click(function () {
                if(getResObj.flowId!=undefined) {
                    window.location.href='/flow/checkOut?flowId=' + getResObj.flowId;
                }else {
                    $.layerMsg({content:'请先定义流程属性！',icon:2});
                }
            })

            $('#ImportTwo').click(function () {
                $('[name="file"]').click()
            })

            $('.clearFlow').click(function () {

                $.layerConfirm({title:'确定清空',content:'您确定要清空吗？',icon:0},function(){
                    $.layerConfirm({title:'清空',content:'真的要清空吗？',icon:0},function(){
                        $.get('/flow/clearFlow',{flowId:getResObj.flowId},function (json) {
                            if(json.flag){
                                $.layerMsg({content:'清空成功！',icon:1});
                            }else {
                                $.layerMsg({content:'清空失败！',icon:1});
                            }
                        },'json')
                    })
                })
            })
            $('.deleteFlow').click(function () {

                $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="workflow.th.que" />？',icon:0},function(){
                    $.layerConfirm({title:'<fmt:message code="menuSSetting.th.deleteMenu" />',content:'真的要删除吗？',icon:0},function(){
                        $.get('/flow/deleteFlow',{flowId:getResObj.flowId},function (json) {
                            if(json.flag){
                                $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1},function () {
                                    window.close()
                                });
                            }else {
                                $.layerMsg({content:'<fmt:message code="lang.th.deleSucess" />！',icon:1});
                            }
                        },'json')
                    })
                })
            });

            if(getResObj.type=='edit'){
                $('#cont_rTwo').find('iframe').attr('src','/flowSetting/theHomePage')
                $($('.btn_click')[0]).addClass('clickBack')
//
            }else if(getResObj.type=='newEdit'){
                $('#cont_rTwo').find('iframe').attr('src','/flowSetting/attributeThree?flowId='+getResObj.flowId)
                $('#cont_list').find('.list1').children('a').addClass('clickBack')
                $('#cont_list').find('.list1').children('ul').show()
                $($('#cont_list').find('.list1').children('ul').children('li')[0]).children('a').addClass('clickBack')
            }else {

                $('#cont_rTwo').find('iframe').attr('src','/flowSetting/attributeThree')
                $('#cont_list').find('.list1').children('a').addClass('clickBack')
                $('#cont_list').find('.list1').children('ul').show()
                $($('#cont_list').find('.list1').children('ul').children('li')[0]).children('a').addClass('clickBack')
            }

            $('.inDevelopment').click(function () {//开发中提示
                $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />！',icon:6});
            })
            $('[data-child="true"]').click(function () {
                if($(this).attr('data-id')=='true'){
                    $('#cont_rTwo').find('iframe').attr('src',$(this).attr('data-url')+getResObj.flowId)
                }else {
                    $('#cont_rTwo').find('iframe').attr('src',$(this).attr('data-url'))
                }

                $(this).parent().find('a').removeClass('clickBack')
                $(this).find('a').addClass('clickBack')
            });



            $('.btn_click').click(function () {
                $(this).parent().parent().find('.btn_click').removeClass('clickBack')
                $(this).addClass('clickBack')
                if($(this).attr('data-display')=='hide'){
                    if($(this).next().css('display')=='none'){
                        $(this).next().show()
                    }else {
                        $(this).removeClass('clickBack')
                        $(this).next().hide()
                        $(this).next().find('a').removeClass('clickBack')
                    }
                }else {
                    $('[data-display="hide"]').next().hide();
                    $('[data-display="hide"]').next().find('a').removeClass('clickBack');
                }


                if($(this).attr('data-url')!=undefined){
                    if(getResObj.flowId!=undefined) {
                        $('#cont_rTwo').find('iframe').attr('src', $(this).attr('data-url'))
                    }else {
                        $.layerMsg({content:'请先定义流程属性！',icon:2});

                    }
                }
            })
        
        $('#previewTheForm').click(function () {
            var me=this;
            $.ajax({
                type: "GET",
                url: "/flow/selectAllFlow",
                dataType: "JSON",
                data: {
                    flowId: getResObj.flowId
                },
                success: function (data) {
                    if(data.flag) {
                        window.open($(me).attr('data-url') + data.object.formId)
                    }else{
                        $.layerMsg({content:'网络错误',icon:2})
                    }
                }
            })
        })
    </script>
</body>
</html>
