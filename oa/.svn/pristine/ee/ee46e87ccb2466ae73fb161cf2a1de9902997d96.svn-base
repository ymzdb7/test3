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
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title><fmt:message code="vote.th.VotingResults" /></title>
    <style>
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:20px;

        }
        .title{
            margin-bottom:20px;
            text-align:center;
            font-weight:bold;
        }
        .tit{
            background-color: #D6E4EF;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:40px;
            text-align:center;
            border:1px solid #c0c0c0;
            margin-top:-1px;
        }
        .con{
            text-align:right;
        }
        .con > span{
            padding-right:20px;
        }
        .box{
            height: 30px;
            width: 300px;
            margin: 20px auto;
        }
        .box button{
            width:80px;
            height:30px;
            line-height:30px;
            border-radius:3px;
        }
        #result{
            width:120px;
        }
        #vote{
            float: left;
            width: 76px;
            height: 30px;
            line-height: 30px;
            background: url("../../img/vote/icon_toupiao.png") no-repeat;
            cursor: pointer;
        }
        #vote span{
            margin-left: 36px;
            font-size: 14px;
            color: #fff;
        }
        #close{
            float: left;
            width: 76px;
            height: 30px;
            line-height: 30px;
            background: url("../../img/vote/icon_back.png") no-repeat;
            cursor: pointer;
        }
        #close span{
            margin-left: 36px;
            font-size: 14px;
        }
        #result{
            float: left;
            width: 106px;
            height: 30px;
            line-height: 30px;
            background: url("../../img/vote/icon_chakan.png") no-repeat;
            cursor: pointer;
            margin: 0 20px;
        }
        #result span{
            margin-left: 36px;
            font-size: 14px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>
<div style="margin-top:20px">
    <div class="title">
        <span class="titleName"></span>
    </div>
    <div class="con">
        <span><fmt:message code="notice.th.publisher" />:<span class="user"></span></span>
        <span><fmt:message code="notice.title.Releasedate" />:<span class="time"></span></span>
    </div>
</div>
<div>
    <div class="table">
        <ul class="list">

        </ul>
    </div>
</div>
<div class="box">
        <div id="vote"><span><fmt:message code="vote.th.vote" /></span></div>
        <div id="close" style="margin-left:20px"><span><fmt:message code="global.lang.close" /></span></div>
</div>
</body>

<script type="text/javascript">
    $(function(){
//        获取id和标题
        var sId=$.GetRequest().resultId;
        var id="";
        var obj=""
// 显示标题和日期以及发布人
        var type;

//展示投票
        function init(){
            $.ajax({
                url:'/vote/manage/getChildVoteList',
                type:'get',
                data:{voteId:sId},
                dataType:'json',
                success:function(res){
                    var data=res.object;
                    type=data.type;
                    var parent=data.voteItemList;
                    var child=data.voteTitleList;
                    $('.titleName').html(data.subject);
                    $('.user').html(data.userName);
                    $('.time').html(data.sendTime);
                    str='  <li id="'+data.voteId+'" data-type="'+data.type+'"> ' +
                        '<div class="tit">'+data.subject+'</div> ' +
                        '<ul class="conn"><table>'+function(){
                            var str1="";
                            for(var i=0;i<parent.length;i++){
                                str1+= '<tr>' +
                                    '<td style="width:25%">'+function(){
                                        if(data.type=="0"){
                                            return '<input type="radio" name="radio" id="'+parent[i].itemId+'" value="'+parent[i].itemName+'" />'
                                        }else{
                                            return '<input type="checkbox" name="checkbox" id="'+parent[i].itemId+'" value="'+parent[i].itemName+'" />'
                                        }
                                    }()+'<span style="padding-left:7px">'+parent[i].itemName+'</span></td>' +
                                    '</tr>'
                            }
                            return str1;
                        }()+'</table></ul> ' +
                        '</li>'+function(){
                            var str2="";
                            for(var i=0;i<child.length;i++){
                                var item=child[i].voteItemList;
                                var id=child[i].voteId;
                                var type=child[i].type;
                                str2 +='  <li id="'+child[i].voteId+'" data-type="'+data.type+'"> ' +
                                    '<div class="tit">'+child[i].subject+'</div> ' +
                                    '<ul class="conn"><table>'+function(){
                                        var str3="";
                                        for(var i=0;i<item.length;i++){
                                            str3+= '<tr>' +
                                                '<td style="width:25%">'+function(){
                                                    if(type=="0"){
                                                        return '<input type="radio" name="radio'+id+'"  id="'+item[i].itemId+'" value="'+item[i].itemName+'" />'
                                                    }else{
                                                        return '<input type="checkbox" name="checkbox" id="'+item[i].itemId+'" value="'+item[i].itemName+'" />'
                                                    }
                                                }()+'<span style="padding-left:7px;">'+item[i].itemName+'</span></td>' +
                                                '</tr>'
                                        }
                                        return str3;
                                    }()+'</table></ul> ' +
                                    '</li>'
                            }
                            return str2;
                        }();
                    $('.list').html(str);
                }

            })
        }
        init()



//        点击关闭
        $('#close').click(function(){
            window.close();
        })
        //点击投票
        $('#vote').click(function(){
            var type=$('li').eq(0).attr('data-type');
            var data={
                options:"",
                voteId:sId
            }
            var id="";

                $('[type="radio"]:checked').each(function(){
                    id+=$(this).attr('id')+",";
                });
                $('[type="checkbox"]:checked').each(function(){
                    id+=$(this).attr('id')+',';
                })
                data.options=id;

            if(data.options==""){
                $.layerMsg({content: '<fmt:message code="hr.th.PleaseSelect" />！', icon: 1});
            }else{
                $.ajax({
                    type:'post',
                    url:'/vote/manage/updateVoteTitle',
                    dataType:'json',
                    data:{
                        voteId:sId,
                        viewPriv:1
                    },
                    success:function(res){
                    }
                })
                $.ajax({
                    type:'post',
                    url:'/vote/manage/addVoteTitle',
                    dataType:'json',
                    data:data,
                    success:function(res){
                        if(res.flag){
                            $.layerMsg({content:'<fmt:message code="vote.th.VoteSuccess" />！',icon:1},function(){
                               window.close();
                                window.opener.location.href = window.opener.location.href;
                            });

                        }else{
                            $.layerMsg({content:res.msg,icon:2});
                        }
                    }
                });
            }

        })



    })
</script>
</html>
