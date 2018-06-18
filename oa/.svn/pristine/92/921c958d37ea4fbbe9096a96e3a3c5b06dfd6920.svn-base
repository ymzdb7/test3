<%--
  Created by IntelliJ IDEA.
  User: 杨璞
  Date: 2017/12/7
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title><fmt:message code="main.workmonitor"/></title>
    <meta charset="UTF-8">
    <%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8 ? MYOA_CHARSET : htmlspecialchars($HTML_PAGE_CHARSET))?>" />--%>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">--%>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/m_reset.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/workMonitor.css">
    <link rel="stylesheet" href="../../css/officialDocument/officialDocument.css">
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css" />
    <link rel="stylesheet" type="text/css" href="/css/base/base.css" />
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/handle.css"/>
   <%--<link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">--%>
    <script>

        function getCookie(name)
        {
            var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
            if(arr=document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }

        var oHead = document.getElementsByTagName('HEAD').item(0);

        var oScript= document.createElement("script");
        var type = getCookie("language");
        oScript.type = "text/javascript";

        if(type){
            oScript.src="/js/Internationalization/"+type+".js";
        }else{
            oScript.src="/js/Internationalization/zh_CN.js";
        }
        oHead.appendChild( oScript);

    </script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="../../js/workflow/work/workform.js"></script>
    <script src="/js/workflow/work/workMonitor.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>

    <style>
        input{
            float:none;
            border:1px solid #ccc;
        }
        .workMon {
            font-size: 22px;
            font-weight: normal;
            line-height: 45px;
            float: none;
            margin-top: 9px;
            font-size: 22px;
            color: #333;
        }
        .flowNum, .artNum, #user {
            width: 100px;
        }



        .sms-bg-static{
            background: #d2d2d2 url("/img/images/sms-static.png") no-repeat left center;
        }
        .sms-bg-static.active{
            background: #3691da url(/img/images/sms.png) no-repeat left center;
        }
        .email-bg-static{
            background: #d2d2d2 url(/img/images/email-static.png) no-repeat left center;
        }
        .email-bg-static.active{
            background: #3691da url(/img/images/email.png) no-repeat left center;
        }
        .sms-check, .email-check, .mobile-check{
            width: 88px;
            height: 30px;
        }
        .userSelectBtn:hover {
            background: url(../../img/userSelectBtnhover.png) no-repeat -3px -2px;
        }
        .layui-layer-btn-{
            /*border-top: 1px solid #d6d6d6;*/
            /*background-color: #f6f6f6;*/
        }
        .prcsName h1 {
            text-align: center;
            line-height: 35px;
        }
        .layui-layer-page .layui-layer-content {
            overflow-x: hidden !important;
        }
        .layui-layer-title{
            color: #fff;
            font-size: 16px;
            font-family: '微软雅黑';
            background:linear-gradient(to bottom,#2077c6,#2495df);
            FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0, startColorStr=#2077c6, endColorStr=#2495df);
            background: -ms-linear-gradient(top, #2077c6, #2495df);        /* IE 10 */
            background:-moz-linear-gradient(top, #2077c6, #2495df);/*火狐*/
            background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#2077c6), to(#2495df));  /* Safari 4-5, Chrome 1-9*/
            background: -webkit-linear-gradient(top, #2077c6, #2495df);   /*Safari5.1 Chrome 10+*/
            background: -o-linear-gradient(top, #2077c6, #2495df);  /*Opera 11.10+*/
            linear-gradient(to bottom, hsl(0, 80%, 70%), #2077c6); /* Standard syntax; must be last */
        }
        .xuanzhong1{
            left: 193px;
        }
        .work-prcs-title,.work-msg-title{
            background-color: #d6e7f8;
            color: #023964;
            font-size: 14px;
            position: relative;
        }
        .prcsName_chang{
            border: none;
            color:#fff;
            background: #3691da  url("../../../img/workflow/work/add_work/checked.png") no-repeat 20px center;
        }
        .user-tags{
            background: #fff;
        }
        .cytitle{
            position: absolute;
            left: 140px;
            font-size: 14px;
            color: #023964;
            top: 30px;
        }
        .feedbacktitle {
            position: relative;
            top: 3px;
            font-weight: bold;
            margin-left: 10px;
            color: #333333;
        }
        .feedbackcontent {
            margin-left: 23px;
            font-size: 15px;
            color: #333333;
        }
        .backinfo {
            width: 100%;
            height: 100px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
    <div class="mainCon">
        <div class="header" style="background-color:white ">
            <div class="title">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/gongzuojiankong.png" alt="" style="margin-bottom:10px;">
                <h3 style="display:inline;" class="workMon"><fmt:message code="main.workmonitor"/></h3>
            </div>
        </div>
        <div class="section">
            <div class="selectNav" style="padding-top: 63px;padding-bottom: 13px">
                <label><fmt:message code="workflow.th.processname"/>：</label>
                <select name="flowId" id="flowName">
                    <%--<option value=""><fmt:message code="workflow.th.wholeprocess"/></option>--%>
                </select>
                <label><fmt:message code="workflow.th.liushui"/>：</label>
                <input type="text" class="flowNum" name="runId">
                <label><fmt:message code="workflow.th.job"/>：</label>
                <input type="text" class="artNum" name="runName" value="">
                <label><fmt:message code="work.th.priority"/>：</label>
                <select id="first" name="workLevel">
                    <option value=""><fmt:message code="notice.th.all"/></option>
                    <option value="2"><fmt:message code="sup.th.urgent"/></option>
                    <option value="0"><fmt:message code="sup.th.ordinary"/></option>
                </select>
                <select id="flowUser" name="status">
                    <option value="1"><fmt:message code="workflow.th.ProcessInitiator"/></option>
                    <option value="2"><fmt:message code="ending.th.CurrentTransactor"/></option>
                </select>
                <input type="text" id="user" name="userId" user_id="" readonly>
                <a href="javascript:;" id="addUser"><fmt:message code="notice.th.chose"/></a>
                <a href="javascript:;" id="clearUser"><fmt:message code="global.lang.empty"/></a>
                <button id="query"><fmt:message code="global.lang.query"/></button>
                <button id="outport"><fmt:message code="global.lang.report"/></button>
            </div>
        </div>

        <div id="pagediv">

        </div>
    </div>
</body>
</html>
<script>
    var eventas;
    var pageObj=$.tablePage('#pagediv','1195px',[
        {
            width:'70px',
            title:'<fmt:message code="workflow.th.liushui"/>',
            name:'runId'
        },
        {
            width:'130px',
            title:'<fmt:message code="workflow.th.processname"/>',
            name:'flowName',
            selectFun:function (flowName,obj) {
                return '<a class="wenhao" style="cursor: pointer;" onclick="jumpOpenType('+obj.flowId+',type=0)">'+flowName+'</a>';
            }
        },
        {
            width:'255px',
            title:'<fmt:message code="workflow.th.job"/>',
            name:'runName',
            selectFun:function (runName,obj) {
                return '<a class="wenhaoTwo" style="cursor: pointer;" flowId="'+ obj.flowId+'" runId="'+ obj.runId+'" prcsId="'+ obj.runId +'" onclick="jumpOpenName('+obj.flowId+','+obj.flowPrcs+','+obj.runId+','+obj.prcsId+')">'+runName+'</a>';
            }
        },
        {
            width:'110px',
            title:'<fmt:message code="attend.th.CurrentStep"/>',
            name:'prcsName',
            selectFun:function (prcsName,obj) {
                return '<a class="wenhao" style="cursor: pointer;" onclick="jumpOpenStep('+obj.flowId+','+obj.runId+',this)">'+prcsName+'</a>';
            }
        },{
            width:'160px',
            title:'<fmt:message code="ending.th.CurrentTransactor"/>',
            name:'userName',
        },{
            width:'230px',
            title:'<fmt:message code="work.th.shouTime"/>',
            name:'handleTime',
            selectFun:function (handleTime,obj) {
                return '<div>'+obj.prcsTime+'</div><div>'+handleTime+'</div>';
            }
        },
        {
            width:'230px',
            title:'<fmt:message code="notice.th.operation"/>',
        }
    ],function (me){
        me.data.pageSize = 5;
        me.init('../../workflow/work/monitoring',[
            <%--{name:'<fmt:message code="workflow.th.Transfer"/>',fn:function(obj){--%>
            <%--return 1;--%>
        <%--}},--%>
            {name:'<fmt:message code="workflow.th.Entrust"/>',fn:function(obj){
            return 1;
        }},{name:'<fmt:message code="main.th.Reminders"/>',fn:function(obj){
            return 1;
        }},{name:'<fmt:message code="meet.th.End"/>',fn:function(obj){
            return 1;
        }},{name:'<fmt:message code="menuSSetting.th.deleteMenu"/>',fn:function(obj){
            return 1;
        }}/*,{name:'退回',fn:function(obj){
           if(obj.allowBack=='1' || obj.allowBack=='2'){
               return 1;
           }else{
               return 0;
           }
        }}*/])
    })

    $(function(){
        $.ajax({
            url:"/flow/selAllType",
            type:'post',
            dataType:'json',
            success:function(res){
                var data=res.obj;
                var str='<option value=""><fmt:message code="hr.th.PleaseSelect"/></option>';
                if(res.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].flowId+'">'+data[i].flowName+'</option>';
                    }
                }
                $('[name="flowId"]').html(str);
            }
        })
    })


  /*  $(document).on('click','.editAndDelete0',function () {//转交
        layer.open({
            type:1,
            offset: '80px',
            area: ['800px', '520px'],
            // closeBtn: 0,
            title:['<fmt:message code="workflow.th.Transfer"/>', 'background-color:#f3f3f3;color:#333'],
            btn:['<fmt:message code="global.lang.ok"/>','<fmt:message code="depatement.th.quxiao"/>'],
            content: '<div class="content" style="width:98%;margin:0 auto">' +
            '<div class="open_title"><img src="/img/gzlnum1.png" style="top: 5px;"><span style="color: #023964;font-size: 14px;margin-left: 5px"><fmt:message code="main.th.currentStep"/><e style="color:red">1</e><fmt:message code="workflow.th.step"/>[<fmt:message code="adding.th.nbdhbhs"/>]</span><span style="color:red"><fmt:message code="email.th.systemmanager"/></span><span style="color:red">（<fmt:message code="lang.th.Process"/>）</span></div>'+
            '<div class="heade"><fmt:message code="main.th.nextStep"/></div>'+
            '<div class="wrap" style="margin:-1px;">' +
            '<div class="left"><ul>' +
            '<li class="buData"><h1><fmt:message code="adding.th.scfxc"/></h1></li>'+
            '</ul></div>'+
            '<div class="right"><ul>' +
            '<li class="workflow-node-result clearfix ">' +
            '<div class="chooseUser"><input type="button" id="chooseUser" value=""><span class="spantitles"><fmt:message code="main.th.SelectPersonnel"/></span></div>'+
            '<div class="text"><div class="zhu">' +
            '<a href="javascript:;" style="color:#0088cc"><fmt:message code="sup.th.Sponsor"/>:</a><textarea name="" id="remind_name" user_id=""></textarea>'+
            '</div><div class="jing"><a href="javascript:;" style="color:#0088cc"><fmt:message code="workflow.th.Manager"/>:</a><textarea name="" id="jingban_name" user_id=""></textarea></div></div>'+
            '</li>'+
            '</ul></div>'+
            '</div>'+
            '<div class="work-msg-title"><img src="/img/gzlnum3.png" style="position: absolute;top: 5px;"><span style="margin-left: 32px;"><fmt:message code="main.th.Sendmessage"/></span></div>'+
            '<div>' +
            '<div class="msg_content">' +
            '<div>' +
            '<div class="gjtitles"><fmt:message code="workflow.th.nextstep"/>：</div>'+
            '<span class="addactiveClass sms-check sms-bg sms-bg-static active" style="margin-left: 70px;text-align: -webkit-center;" data-id="1" title="<fmt:message code="notice.th.remindermessage"/>"><fmt:message code="sms.th.remind"/></span>'+
            '<span data-id="2" class="addactiveClass email-check email-bg email-bg-static" style="text-align: -webkit-center;" title="<fmt:message code="main.th.SendMail"/>"><fmt:message code="adding.th.duanxin"/></span>'+
/!*            '<div class="gjtitles">发起人：</div>' +
            '<span data-id="3" class="addactiveClass sms-check sms-bg sms-bg-static" style="margin-left: 60px;" title="发送事务提醒消息"></span>' +
            '<span data-id="4" class="addactiveClass email-check email-bg email-bg-static" title="发送Internet邮件"></span>' +
            '<span class="xuanzhong xuanzhong1" style="left: 183px;">短信</span>' +
            '<div data_type="managers" class="work-msg-op-title" style="margin-right: 0;width:286px;"><div class="gjtitles">全部经办人：</div><span data-id="5" class="addactiveClass sms-check sms-bg sms-bg-static" title="发送事务提醒消息" style="margin-left: 90px;"></span><span class="xuanzhong" style="    left: 115px;">提醒</span> <span class=" mobile-check mobile-bg mobile-bg-static" title="发送手机短信" style="display:none;"></span><span data-id="6" class="addactiveClass email-check email-bg email-bg-static" title="发送Internet邮件"></span> <span class="xuanzhong xuanzhong1" style="left: 220px;">短信</span></div>'+
            '<span data-id="5" class="addactiveClass sms-check sms-bg sms-bg-static" title="发送事务提醒消息" style="margin-left: 90px;"></span>' +
            '<span class="xuanzhong" style="    left: 115px;">提醒</span>' +
            '<span class=" mobile-check mobile-bg mobile-bg-static" title="发送手机短信" style="display:none;"></span>' +
            '<span data-id="6" class="addactiveClass email-check email-bg email-bg-static" title="发送Internet邮件"></span>' +
            '<span class="xuanzhong xuanzhong1" style="left: 220px;">短信</span>' +*!/
            '</div>'+
            '<div class="tix_jingban" style="margin: 10px 0px;"><fmt:message code="main.th.RemindHandler"/>:<textarea name="" style="width: 490px;height: 50px" id="jingban" cols="" rows=""></textarea><a href="javascript:;" id="choose" style="padding-left:10px;"><fmt:message code="global.lang.select"/></a> <a href="javascript:;" id="empty"><fmt:message code="global.lang.empty"/></a></div>'+
            '<div class="tix_con" style="margin:10px 0px;"><fmt:message code="main.th.ReminderContent"/>：<textarea class="conText" type="text" style="width: 490px;height: 50px"></textarea></div>'+
            '</div>'+
            '</div>'+
            '</div>',
            yes:function(){

            },
            btn2:function(){

            },
            success:function(){
                //    点击选择人员
                $('#chooseUser').on('click',function(){
                    UserItemMain = 'remind_name';
                    UserItem = 'jingban_name';
                    $.popWindow("../../common/selectUserWorkFlow");
                })
                //    点击选择提醒经办人
                $('#choose').click(function(){
                    user_id='jingban';
                    $.popWindow('../../common/selectUser');
                })
                //    点击清空提醒指定步骤经办人
                $('#empty').click(function(){
                    $('#jingban').val('');
                    $('#jingban').attr('dataid','');
                    $('#jingban').attr('username','');
                    $('#jingban').attr('user_id','');
                    $('#jingban').attr('userprivname','');
                })
                //    点击铃铛
                $('.sms-bg-static').click(function(){
                    if($(this).attr('data-type')=='no'){
                        $(this).addClass('showLing');
                        $(this).attr('data-type','yes')
                    }else{
                        $(this).removeClass('showLing');
                        $(this).attr('data-type','no')
                    }
                })
                //    点击email
                $('.email-bg-static').click(function(){
                    if($(this).attr('data-type')=='no'){
                        $(this).addClass('showEmail');
                        $(this).attr('data-type','yes')
                    }else{
                        $(this).removeClass('showEmail');
                        $(this).attr('data-type','no')
                    }
                })
            }

        })
    })*/
</script>