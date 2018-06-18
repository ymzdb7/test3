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
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="main.notice" /></title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="/css/base/base.css" />
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>



    <!-- 新闻管理  -->
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>

    <script src="../lib/laydate.js"></script>
    <script src="../lib/layer/layer.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>


    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/tablePage.js"></script>

</head>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
<div class="head-top">
    <ul class="clearfix">
        <li class="fl head-top-li active" data-type=""><fmt:message code="vote.th.PendingBulletin" /></li>
        <li class="fl head-top-img"><img src="/img/twoth.png" alt=""></li>
        <li class="fl head-top-li" data-type="0"><fmt:message code="vote.th.ApprovalBulletin" /></li>
    </ul>
</div>
<div class="navigation" style="margin-top: 46px;">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/daishen.png" alt="">
    <h2><fmt:message code="vote.th.PendingBulletin" /></h2>
</div>
<div id="pagediv">

</div>













    <script>
        var objs=null;
        function daishen() {
            var arr=[
                {
                    title:'<fmt:message code="workflow.th.Serial" />',
                    name:'',
                    width:'80px',
                    selectFun:function (name,obj,i) {
                        return i+1
                    }
                },
                {
                    title:'<fmt:message code="notice.th.publisher" />',
                    name:'name',
                    width:'100px'
                },
                {
                    title:'<fmt:message code="notice.th.type" />',
                    name:'typeName',
                    width:'100px',
                    selectFun:function (name) {
                        if(name==''){
                            return '<fmt:message code="notice.type.alltype" />'
                        }else {
                            return name
                        }
                    }
                },
                {
                    title:'<fmt:message code="notice.th.releasescope" />',
                    name:'deprange',
                    width:'200px'
                },
                {
                    title:'<fmt:message code="notice.th.title" />',
                    name:'subject',
                    width:'250px',
                    selectFun:function (name,obj) {
                        if(obj.top=='1'){
                            return '<div style="width: 100%;text-align: left">' +
                                '<span style="    color: #fff;\
background: #ef7559;\
font-size: 12px;\
padding: 2px 5px;\
margin-right: 3px;\
border-radius: 3px;"><fmt:message code="notice.th.top" /></span>'+
                                '<a href="/notice/detail?notifyId='+obj.notifyId+'" ' +
                                'target="_blank" class="windowOpen">'+name+'</a>' +
                                '</div>'
                        }else {
                            return '<div style="width: 100%;text-align: left">' +
                                '<a href="/notice/detail?notifyId='+obj.notifyId+'" ' +
                                'target="_blank" class="windowOpen">'+name+'</a>' +
                                '</div>'
                        }
                    }
                },
                {
                    title:'<fmt:message code="notice.th.createTime" />',
                    name:'sendTime',
                    width:'160px'
                },
                {
                    title:'<fmt:message code="notice.th.effectivedate" />',
                    name:'begin',
                    width:'120px'
                },
                {
                    title:'<fmt:message code="notice.th.endDate" />',
                    name:'end',
                    width:'120px'
                },

                {
                    title:'<fmt:message code="menuSSetting.th.menuSetting" />',
                    name:'',
                    width:'150px'
                }
            ]
            $('.navigation h2').html('<fmt:message code="vote.th.PendingBulletin" />');
            $('.navigation img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/daishen.png')
            objs=$.tablePage('#pagediv','1280px',arr,function (me) {
                me.init('/sys/getPendingNotifyList',[{name:'<fmt:message code="meet.th.Approval" />'},{name:'<fmt:message code="meet.th.unratified" />'}])
            })
        }
        function yishen() {
            $('.navigation h2').html('<fmt:message code="vote.th.ApprovalBulletin" />');
            $('.navigation img').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/yishen.png')
            var arr=[
                {
                    title:'<fmt:message code="workflow.th.Serial" />',
                    name:'',
                    width:'70px',
                    selectFun:function (name,obj,i) {
                        return i+1
                    }
                },
                {
                    title:'<fmt:message code="notice.th.publisher" />',
                    name:'name',
                    width:'100px'
                },
                {
                    title:'<fmt:message code="notice.th.type" />',
                    name:'typeName',
                    width:'100px',
                    selectFun:function (name) {
                        if(name==''){
                            return '<fmt:message code="notice.type.alltype" />'
                        }else {
                            return name
                        }
                    }
                },
                {
                    title:'<fmt:message code="notice.th.releasescope" />',
                    name:'deprange',
                    width:'200px'
                },
                {
                    title:'<fmt:message code="notice.th.title" />',
                    name:'subject',
                    width:'240px',
                    selectFun:function (name,obj) {
                        if(obj.top=='1'){
                            return '<div style="width: 100%;text-align: left">' +
                                '<span style="    color: #fff;\
background: #ef7559;\
font-size: 12px;\
padding: 2px 5px;\
margin-right: 3px;\
border-radius: 3px;"><fmt:message code="notice.th.top" /></span>'+
                                '<a href="/notice/detail?notifyId='+obj.notifyId+'" ' +
                                'target="_blank" class="windowOpen">'+name+'</a>' +
                                '</div>'
                        }else {
                            return '<div style="width: 100%;text-align: left">' +
                                '<a href="/notice/detail?notifyId='+obj.notifyId+'" ' +
                                'target="_blank" class="windowOpen">'+name+'</a>' +
                                '</div>'
                        }
                    }

                },
                {
                    title:'<fmt:message code="notice.th.createTime" />',
                    name:'sendTime',
                    width:'160px'
                },
                {
                    title:'<fmt:message code="notice.th.effectivedate" />',
                    name:'begin',
                    width:'120px'
                },
                {
                    title:'<fmt:message code="notice.th.endDate" />',
                    name:'end',
                    width:'120px'
                },
                {
                    title:'<fmt:message code="notice.th.state" />',
                    name:'publish',
                    width:'100px',
                    selectFun:function (data) {
                        if(data==1){
                            return '<fmt:message code="meet.th.Approval" />'
                        }else if(data==3){
                            return '<fmt:message code="meet.th.unratified" />'
                        }else {
                            return ''
                        }
                    }
                },   {
                    title:'<fmt:message code="event.th.currentState" />',
                    name:'publish',
                    width:'120px',
                    selectFun:function (name) {
                        switch(name)
                        {
                            case '0':
                                return '<span class="red"><fmt:message code="notice.th.unposted" /></span>'
                                break;
                            case '1':
                                return '<span class="green"><fmt:message code="notice.state.effective" /></span>'
                                break;
                            case '2':
                                return '<span class="blue"><fmt:message code="meet.th.PendingApproval" /></span>'
                                break;
                            case '4':
                                return '<span class="red"><fmt:message code="notice.state.end" /></span>'
                                break;
                            default:
                                return '<span class="red"><fmt:message code="vote.th.NotThrough" /></span>'

                        }
                    }
                },

            ]
            objs=$.tablePage('#pagediv','1330px',arr,function (me) {
                me.init('/sys/getApprovedNotifyList')
            })
        }



        $('.head-top li').click(function () {
            $(this).siblings('li').removeClass('active')
            $(this).addClass('active')
            if($(this).attr('data-type')==''){
                daishen()
            }else if($(this).attr('data-type')=='0'){
                yishen()
            }
        })

        daishen()

        $(document).on('click','.editAndDelete0',function () {
            var obj=objs.arrs[$(this).attr('data-i')]
            $.get('/notice/updateNotify',{notifyId:obj.notifyId,publish:1,typeId:obj.typeId},function (json) {
                if(json.flag){
                    $.layerMsg({content:'<fmt:message code="vote.th.Approval" />',icon:1},function () {
                        objs.init()
                    })
                }else {
                    $.layerMsg({content:'<fmt:message code="workflow.th.networkError" />',icon:2})
                }
            },'json')
        })

        $(document).on('click','.editAndDelete1',function () {
            var obj=objs.arrs[$(this).attr('data-i')]
            $.get('/notice/updateNotify',{notifyId:obj.notifyId,publish:3,typeId:obj.typeId},function (json) {
                if(json.flag){
                    $.layerMsg({content:'<fmt:message code="vote.th.ReviseUnapprovedSuccess" />',icon:1},function () {
                        objs.init()
                    })
                }else {
                    $.layerMsg({content:'<fmt:message code="workflow.th.networkError" />',icon:2})
                }
            },'json')
        })
    </script>

</body>
</html>
