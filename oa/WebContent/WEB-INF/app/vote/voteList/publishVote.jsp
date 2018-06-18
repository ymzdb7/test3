<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <%--<link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>--%>
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <%--<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">--%>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <%--<link rel="stylesheet" type="text/css" href="../../lib/laydate/laydate.css"/>--%>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

    <title><fmt:message code="vote.th.vote" /></title>
    <style>
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:20px;
        }
        .title{
            margin-bottom:20px;
        }
        document,body{
            width:100%;
            height:100%;
        }

        .content{
            margin:20px auto 0px;
            margin-top: 71px;
            width:100%;
            height:100%;
        }
        .table table{
            width: 97%;
            margin:0 auto;
        }
        th{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:45px;
            text-align:left;
            padding-left:10px;
        }
        .titleName{
            cursor:pointer;
        }
        .red{
            color:red;
            font-weight:bold;
        }
        .M-box3 .active{
            margin: 0px 3px;
            width: 29px;
            height: 29px;
            line-height: 29px;
            background: #2b7fe0;
            font-size: 12px;
            border: 1px solid #2b7fe0;
            color:#fff;
            text-align:center;
            display: inline-block;
        }
        .M-box3 a{
            margin: 0 3px;
            width: 29px;
            height: 29px;
            line-height: 29px;
            font-size: 12px;
            display: inline-block;
            text-align:center;
            background: #fff;
            border: 1px solid #ebebeb;
            color: #bdbdbd;
            text-decoration: none;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--管理已发布的投票--%>

<div class="content">
    <div class="title" >
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/publish.png" alt="" style="padding-left:30px;margin-bottom: 7px">
        <span style="padding-left:10px;"><fmt:message code="vote.th.Published" /></span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th><fmt:message code="notice.th.publisher" /></th>
                <th><fmt:message code="notice.th.title" /></th>
                <th><fmt:message code="vote.th.anonymous" /></th>
                <th><fmt:message code="notice.th.effectivedate" /></th>
                <th><fmt:message code="notice.th.endDate" /></th>
                <th><fmt:message code="notice.th.operation" /></th>
            </tr>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript">



    //点击查询后，查询列表展示
    $(function () {

        //        列表带分页
        var ajaxPageLe={
            data:{
                page:1,//当前处于第几页
                pageSize:10,//一页显示几条
                useFlag:true
            },
            page:function () {
                var me=this;
                $.ajax({
                    url:'/vote/manage/searchVoteTitleList',
                    type:'get',
                    data:me.data,
                    dateType:'json',
                    success:function(reg){
                        var data=reg.obj;
                        var str=""
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="pagediv" id='+data[i].voteId+' data-have="'+data[i].have+'"> ' +
                                '<td >'+data[i].userName+'</td> ' +
                                '<td  ><a href="javascript:;" class="titleName '+function(){
                                    if(data[i].top==1){
                                        return "red";
                                    }
                                }()+'" data-priv="'+data[i].viewPriv+'"  style="color:#1772c0">'+data[i].subject+'</a></td> ' +
                                '<td>'+function(){
                                    if(data[i].anonymity==0){
                                        return "<fmt:message code="workflow.th.NotAllowed" />";
                                    }else{
                                        return '<fmt:message code="workflow.th.Allowed" />';
                                    }
                                }()+'</td> ' +
                                '<td>'+data[i].sendTime+'</td> ' +
                                '<td>'+data[i].endDate+'</td> ' +
                                '<td>' +
                                '<a href="javascript:;" class="result" data-priv="'+data[i].viewPriv+'" style="color:#1772c0"><fmt:message code="vote.th.ViewResults" /></a> ' +
                                '</td>' +
                                '</tr>'

                        }
                        $('.list').html(str);
                        me.pageTwo(reg.totleNum,me.data.pageSize,me.data.page);
                    }
                })

            },
            pageTwo:function (totalData, pageSize,indexs) {
                var mes=this;
                $('#dbgz_page').pagination({
                    totalData: totalData,
                    showData: pageSize,
                    jump: true,
                    coping: true,
                    homePage:'',
                    endPage: '',
                    current:indexs||1,
                    callback: function (index) {
                        mes.data.page=index.getCurrent();
                        mes.page();
                    }
                });
            }
        }
        ajaxPageLe.page();


        function init(){
            $.ajax({
                url:'/vote/manage/searchVoteTitleList',
                type:'get',
                dateType:'json',

                success:function(reg){
                    var data=reg.obj;
                    var str=""
                    for(var i=0;i<data.length;i++){
                        str+='<tr class="pagediv" id='+data[i].voteId+' data-have="'+data[i].have+'"> ' +
                            '<td >'+data[i].userName+'</td> ' +
                            '<td><a href="javascript:;" class="titleName '+function(){
                                if(data[i].top==1){
                                    return "red";
                                }
                            }()+'"  style="color:#1772c0">'+data[i].subject+'</a></td> ' +
                            '<td>'+function(){
                                if(data[i].anonymity==0){
                                    return "<fmt:message code="workflow.th.NotAllowed" />";
                                }else{
                                    return '<fmt:message code="workflow.th.Allowed" />';
                                }
                            }()+'</td> ' +
                            '<td>'+data[i].sendTime+'</td> ' +
                            '<td>'+data[i].endDate+'</td> ' +
                            '<td>' +
                            '<a href="javascript:;" class="result" style="color:#1772c0"><fmt:message code="vote.th.ViewResults" /></a> ' +
                            '</td>' +
                            '</tr>'
                    }
                    $('.list').html(str);
                }
            })
        }
//        init();

        //        点击标题
        $('.list').on('click','.titleName',function(){
            var sId=$(this).parents('tr').attr('id');
            var isHave=$(this).parents('tr').attr('data-have');

//            var title=$(this).find('a').html();
//            window.open ("/vote/manage/voteResult?resultId="+sId+"&type=1&have="+isHave, "newwindow","height=500, width=800, top=100, left=300, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
            window.open ("/vote/manage/voteResult?resultId="+sId+"&type=1&have="+isHave)
        })

        //        点击查看结果
        $('.list').on('click','.result',function(){
            var sId=$(this).parents('tr').attr('id');
            var isHave=$(this).parents('tr').attr('data-have');

            var piv = $(this).attr('data-priv')
//            if(piv==0){
//                $.layerMsg({content:'请投票后在查看',icon:7})
//                return false;
//            }
            if(piv==2){
                $.layerMsg({content:'<fmt:message code="vote.th.noSee" />',icon:2})
                return false;
            }

            if(isHave == "true"){
//                window.open ("/vote/manage/voteResult?resultId="+sId+"&type=1", "newwindow", "height=500, width=800, top=100, left=300, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
                window.open ("/vote/manage/voteResult?resultId="+sId+"&type=1")
            }else{
                $.layerMsg({content: '<fmt:message code="vote.th.see" />！', icon: 2});
            }
        })



    })



</script>
</body>


</html>
