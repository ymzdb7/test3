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
        .piao{
            text-align:right;
        }
        meter{
            width:150px;
        }
        .zhu{
            width:80%;
            height:10px;
            background:skyblue;
        }
        .closeWindow{
            width: 100%;
            margin: 20px 0;
        }
        .closeWindow .btnReturn{
            width: 70px;
            height:28px;
            line-height: 28px;
            margin: 0 auto;
            background: url("../../img/vote/return.png") no-repeat;
            cursor: pointer;
        }
        .closeWindow .btnReturn span{
            margin-left: 26px;
            font-size: 14px;
        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>
<div style="margin-top:20px">
    <div class="title">
        <span><fmt:message code="vote.th.VotingResults" />-<span class="titleName"></span></span>
    </div>
    <div class="con">
        <p class="content"></p>
    </div>
</div>
<div>
    <div class="table">
        <ul class="list">

        </ul>
    </div>
</div>
<div class="closeWindow">
    <div class="btnReturn" id="btnReturn"><span><fmt:message code="notice.th.return" /></span></div>
</div>
</body>

<script type="text/javascript">
    $(function(){
//        获取id和标题
        var sId=$.GetRequest().resultId;
        var title=decodeURI($.GetRequest().title);
        var id="";
        var obj=""

//        显示数据
        function init(){
            $.ajax({
                url:'/vote/manage/getVoteDataByVoteId',
                type:'get',
                data:{voteId:sId},
                dataType:'json',
                success:function(res){
                    var data=res.object;
                    var parent=data.voteItemList;
                    var child=data.voteTitleList;
                    var count=data.sum;
                    $('.titleName').html(data.subject);
                    $('.user').html(data.toId);
                    $('.time').html(data.sendTime);
                    str='  <li id="'+data.voteId+'" data-type="'+data.type+'"> ' +
                        '<div class="tit">'+data.subject+'</div> ' +
                        '<ul class="conn"><table>'+function(){
                            var str1="";
                            for(var i=0;i<parent.length;i++){
                                console.log(parent[i].voteCount)
                                str1+= '<tr>' +
                                    '<td style="width:25%">'+parent[i].itemName+'</td>' +
                                    '<td style="width:30%">' +
                                    '<div class="zhu" style="'+function(){
                                        if(parent[i].voteCount==0){
                                            return "width:0%"
                                        }else if(parent[i].voteCount/count==1){
                                            return "width:86%"
                                        }else{
                                            return "width:"+Math.round((parent[i].voteCount/count)*100)+"%";
                                        }
                                    }()+';display:inline-block"></div>'+
                                    '<span>'+function(){
                                        if(parent[i].voteCount==0){
                                            return "0%"
                                        }else{
                                            return Math.round((parent[i].voteCount/count)*100)+"%"
                                        }
                                    }()+'</span>' +
                                    '</td>' +
                                    '<td style="width:15%">'+parent[i].voteCount+'<fmt:message code="vote.th.ticket" /></td>' +
                                    '</tr>'
                            }
                            return str1;
                        }()+'</table></ul> ' +
                        '</li>'+function(){
                            var str2="";
                            for(var i=0;i<child.length;i++){
                                var item=child[i].voteItemList;
                                var countNum=child[i].sum;
                                str2 +='  <li id="'+child[i].voteId+'" data-type="'+data.type+'"> ' +
                                    '<div class="tit">'+child[i].subject+'</div> ' +
                                    '<ul class="conn"><table>'+function(){
                                        var str3="";
                                        for(var i=0;i<item.length;i++){
                                            str3+= '<tr>' +
                                                '<td style="width:25%">'+item[i].itemName+'</td>' +
                                                '<td style="width:30%">' +
                                                '<div class="zhu" style="'+function(){
                                                    if(item[i].voteCount==0){
                                                        return "width:0%"
                                                    }else if(item[i].voteCount/countNum==1){
                                                        return "width:86%"
                                                    }else{
                                                        return "width:"+Math.round((item[i].voteCount/countNum)*100)+"%";
                                                    }
                                                }()+';display:inline-block"></div>'+
                                                '<span>'+function(){
                                                    if(item[i].voteCount==0){
                                                        return "0%"
                                                    }else{
                                                        return Math.round((item[i].voteCount/countNum)*100)+"%"
                                                    }
                                                }()+'</span>' +
                                                '</td>' +
                                                '<td style="width:15%">'+item[i].voteCount+'<fmt:message code="vote.th.ticket" /></td>' +
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


        $('#btnReturn').click(function(){
            window.close();
        })


    })
</script>
</html>
