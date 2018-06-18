<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/31
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.firstpage" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <style>
        .home_con{
            height: 360px;
        }
        .conLeft_list .list_click .flow_z{
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
            width:4em;
        }
        .conLeft_list .list_click .flow_q{
            vertical-align: bottom;
        }
        .clearfix:after{
            content: '';
            display: block;
            clear: both;
        }
    </style>
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/base/base.js"></script>
</head>
<body>
    <div class="cont_r" style="margin-left: 0px;">
        <div class="item_s item_con"></div>
    </div>
    <script>

        function ifUndefind(dataTwo) {
            var datas=0;
            if(dataTwo!=undefined){
                datas=dataTwo;
            }
            return datas;
        }

        $.ajax({
            type: 'GET',
            url: '/flow/flowDetailInfo',
            dataType: 'json',
            data: {
                flowId: parent.getResObj.flowId
            },
            success: function (data) {
                if (data.flag) {
                    var data = data.object;
                    var htmlText='' +
                        '<div class="homePage">' +
                            '<div class="define_r define_flow clearfix define_r">' +
                                '<h3> <img style="width: 18px;margin-right: 10px;" src="/img/workflow/flowsetting/flowSettingMain/liuchengzhuye.png" /><fmt:message code="workflow.th.firstpage" /></h3>' +
                                '<span>' +
                                    '<a href="/flowSetting/processDesignTool?flowId='+parent.getResObj.flowId+'" class="flowJpdl keepmsgTwo" target="view_window"><fmt:message code="workflow.th.designer" /></a>' +
                                '</span>' +
                            '</div>' +
                            '<div class="home_mid">' +
                                '<ul class="mid_f clearfix">' +
                                    '<li>' +
                                        '<a class="expont_num" href="javascript:void(0)">' +
                                            '<img src="/img/workflow/flowsetting/icon_processing_03.png" alt="">' +
                                            '<p class="expont_r">' +
                                            '<span class="num">'+ifUndefind(data.runAll)+'</span>' +
                                            '<span class="exponent"><fmt:message code="workflow.th.wholeprocess" /></span>' +
                                            '</p>' +
                                        '</a>' +
                                    '</li>' +
                                    '<li>' +
                                        '<a class="expont_num" href="javascript:void(0)">' +
                                            '<img src="/img/workflow/flowsetting/icon_allprocess_03.png" alt="">' +
                                            '<p class="expont_r">' +
                                            '<span class="num" style="color: #d68b2f24">' +
                                            ''+ifUndefind(data.runIngCount)+'</span>' +
                                            '<span class="exponent" style="color: #d68b2f24"><fmt:message code="workflow.th.executing" /></span></p>' +
                                        '</a>' +
                                    '</li>' +
                                    '<li>' +
                                        '<a class="expont_num" href="javascript:void(0)">' +
                                            '<img src="/img/workflow/flowsetting/icon_finish_03.png" alt="">' +
                                            '<p class="expont_r">' +
                                            '<span class="num" style="color: #287a55">' +
                                            ''+ifUndefind(data.endRun)+'</span>' +
                                            '<span class="exponent" style="color: #287a55"><fmt:message code="workflow.th.endexecuting" /></span></p>' +
                                        '</a>' +
                                    '</li>' +
                                    '<li>' +
                                        '<a class="expont_num" href="javascript:void(0)">' +
                                            '<img src="/img/workflow/flowsetting/icon_orige_04.png" alt="">' +
                                            '<p class="expont_r">' +
                                            '<span class="num" style="color: #966f31">' +
                                            ''+ifUndefind(data.endRun)+'</span>' +
                                            '<span class="exponent" style="color: #287a55"><fmt:message code="workflow.th.endexecuting" /></span></p>' +
                                        '</a>' +
                                    '</li>' +
                                '</ul>' +
                            '</div>' +
                            '<div class="home_con clearfix">' +
                                '<div class="conLeft">' +
                                    '<h3 class="con_t"><fmt:message code="workflow.th.basicinformation" /></h3>' +
                                    '<ul class="con_c">' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg1"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                            '<span class="flow_ID" style="color: #8f000000"><fmt:message code="workflow.th.Processname/id" /></span>' +
                                                '<p class="flow_p">'+function(){
                                                        var str='';
                                                    if ((!data.flowName) || data.flowName == "") {
                                                        str='<fmt:message code="sys.th.Undefined" />';
                                                        if(ifUndefind(data.flowId)==0){
                                                            return str+0
                                                        }else {
                                                            return str+data.flowId
                                                        }

                                                    }else {
                                                        return data.flowName+"/"+data.flowId
                                                    }
                                                }()+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg2"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                    '<span class="flow_ID" ><fmt:message code="workflow.th.processclassification" /></span>' +
                                                    '<p class="flow_p">'+data.sortName+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg3"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                '<span class="flow_ID" ><fmt:message code="workflow.th.processallforms" /></span>' +
                                                '<p class="flow_p">'+data.formName+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg4"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                '<span class="flow_ID" ><fmt:message code="workflow.th.flowtype" /></span>' +
                                                    '<p class="flow_p">'+function(){if (data.flowType == '1') {
                                                        return '<fmt:message code="workflow.th.fixedflow" />'
                                                    } else {
                                                        return '<fmt:message code="workflow.th.freeflow" />'
                                                    }}()+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg1"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                '<span class="flow_ID" ><fmt:message code="workflow.th.liudepartment" /></span>' +
                                                '<p class="flow_p">'+data.depName+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg2"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                '<span class="flow_ID" ><fmt:message code="workflow.th.job" /></span>' +
                                                '<span class="flow_z">' + function(){
                                                        if ((!data.autoName) || data.autoName == '') {
                                                             return '<fmt:message code="sys.th.Undefined" />'
                                                        } else {
                                                            return data.autoName;
                                                        }
                                                }() + '</span><span style="    color: #111;\
                    display: inline-block;\
                    height: 22px;\
                    line-height: 22px;\
                    font-size: 26px;">/</span><span class="flow_q">' + ifUndefind(data.autoNum) + '</span>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg3"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                '<span class="flow_ID" ><fmt:message code="workflow.th.processsteps" /></span>' +
                                                '<p class="flow_p">'+ifUndefind(data.procNum)+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                        '<li class="conLeft_list clearfix"><i class="bg bg4"></i>' +
                                            '<a href="javascript:;" class="list_click">' +
                                                '<span class="flow_ID" ><fmt:message code="workflow.th.processsteps" /></span>' +
                                                '<p class="flow_p">'+ifUndefind(data.cutNumber)+'</p>' +
                                            '</a>' +
                                        '</li>' +
                                    '</ul>' +
                                '</div>' +
                                '<div class="conRight"><h3 class="con_t"><fmt:message code="workflow.th.supportfunctions" /></h3>' +
                                    '<ul style="background: #f5f7f8;">' +
                                        '<li>' +
                                            '<a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.rollback" /></a>' +
                                            '<span class="" id="backspace">' +
                                            '<i id="icon_1" class="icon_y">' +
                                            '</i>' +
                                            '</span>' +
                                        '</li>' +
                                        '<li>' +
                                            '<a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.countersigned" /></a>' +
                                            '<span class="" id="counsign"><i id="icon_2" class=" icon_y"></i></span>' +
                                        '</li>' +
                                        '<li>' +
                                            '<a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.concurrent" /></a>' +
                                            '<sapn class="save_y" id="super"><i class="icon_y" id="icon_3"></i></sapn>' +
                                        '</li>' +
                                        '<li>' +
                                            '<a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.circulated" /></a>' +
                                            '<sapn class="save_y"><i class="icon_y" id="icon_4"></i></sapn>' +
                                        '</li>' +
                                        '<li>' +
                                            '<a href="javascript:;" class="btn_c"><fmt:message code="woorkflow.th.attachments" /></a>' +
                                            '<sapn class="save_y save_s"><i class="icon_y" id="icon_5"></i></sapn>' + '' +
                                        '</li>' +
                                    '</ul>' +
                                '</div>' +
                            '</div> ' +
                        '</div>'
                    $('.item_con').html(htmlText);
                    if (data.canBack == 0) {
                        $('#backspace').addClass('save_r');
                    } else {
                        $('#backspace').addClass('save_y');
                    }
                    if (data.canSign == 0) {
                        $('#counsign').addClass('save_y')
                    } else {
                        $('#counsign').addClass('save_r')
                    }
                    if (data.canSync == 0) {
                        $('#super').addClass('save_r')
                    } else {
                        $('#super').addClass('save_y')
                    }
                }else {
                    alert('网络错误')
                }
            }
        })
    </script>
</body>
</html>
