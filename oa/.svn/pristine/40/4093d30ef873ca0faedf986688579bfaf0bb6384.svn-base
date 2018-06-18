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
    <title><fmt:message code="main.votemanage" /></title>
    <style>
        .title span{
            font-size:22px;
            color:#494d59;

        }
        .title img{
            vertical-align: middle;
            padding-left:20px;
        }
        .title{
            margin-bottom:20px;
        }
        .btn{
            text-align:center;
        }
        button{
            width:50px;
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
        .choose{
            width:300px;
            height:25px;
            vertical-align: middle;
        }
        a{
            text-decoration:none;
        }
        label{
            float:left;
            padding-top:5px;
        }
        #add{
            width: 50px;
            height: 25px;
            border-radius: 5px;
            color: #fff;
            margin:3px 0px 0px 10px;
            background-color: #2F8AE3;
        }
        #back{
            display: inline-block;
            width: 78px;
            height: 38px;
            line-height: 30px;
            /*margin-right: 30px;*/
            /*margin-top: 20px;*/
            /*margin-bottom: 20px;*/
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
        }
        .del{

        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>
<div style="margin-top:20px">
    <div class="title">
      <%--  <img src="../../img/vote/item.png" alt="">--%>
        <span style="padding-left: 20px; "><fmt:message code="vote.th.projectManagement" /></span>
    </div>
</div>
<div>

    <div class="table">
        <table>
            <thead>
            <tr>
                <th style="width:50%"><fmt:message code="main.th.option" /></th>
                <th><fmt:message code="vote.th.NumberVotes" /></th>
                <th style="width:30%"><fmt:message code="vote.th.Voters" /></th>
                <th><fmt:message code="menuSSetting.th.menuSetting" /></th>
            </tr>
            </thead>
            <tbody class="item">

            </tbody>
            <tfoot>
            <tr>
                <td colspan="4">
                    <label for=""><fmt:message code="vote.th.addItem" />：</label>
                    <input type="text" class="choose add">
                    <button id="add"><fmt:message code="global.lang.add" /></button>
                </td>
            </tr>
            </tfoot>
        </table>
    </div>
    <div style="text-align:center;margin-top:20px;">
        <span id="back" ><fmt:message code="notice.th.return" /></span>
    </div>
</div>
</body>

<script type="text/javascript">
   $(function(){

//       获取id
       var ItemId=$.GetRequest().ItemId;
//       获取项目内容返显
       function show(){
           $.ajax({
               url:'/voteItem/getVoteItemList',
               type:'post',
               data:{voteId:ItemId},
               dataType:'json',
               success:function(reg){
                   var data=reg.obj;
                   var str="";
                   for(var i=0;i<data.length;i++){
                       str+='<tr id="'+data[i].itemId+'"> ' +
                           '<td> ' +
                           '<input type="text" value="'+data[i].itemName+'" class="choose"> ' +
                           '</td> ' +
                           '<td>'+data[i].voteCount+'</td> ' +
                           '<td>'+function() {
                                if(data[i].voteUser==undefined) {
                                    return ""
                                }else{
                                    return data[i].voteUser;
                                }
                       }()+'</td> ' +
                               '<td> ' +
                           '<a href="javascript:;" class="update" style="color:#1772c0"><fmt:message code="depatement.th.modify" /></a> ' +
                               '<a href="javascript:;" class="del" style="color:#e01919;"><fmt:message code="global.lang.delete" /></a> ' +

                               '</td> ' +
                               '</tr>'
                           }
                   $('.item').html(str);
                   }

               })
           }

       show();

//       点击返回
       $('#back').click(function(){
           self.parent.document.getElementById('iframe').src='/vote/manage/voteList';
       })
//       点击删除
       $('.item').on('click','.del',function(){
           var sId=$(this).parent().parent().attr('id');
           layer.confirm(' 确定要删除吗？', {
               btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
               title: " 提示"
           },function(){
               $.ajax({
                   url:'/voteItem/deleteByItemId',
                   type:'post',
                   data:{itemId:sId},
                   dataType:'json',
                   success:function(){
                       layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                       show();
                   }
               })
           },function(){
               layer.close();
           })
       })
//       点击修改
       $('.item').on('click','.update',function(){
           var sId=$(this).parent().parent().attr('id');
           var text=$(this).parent().parent().find('.choose').val();
           if(text.replace(/(^\s*)|(\s*$)/g, "")==""){
               layer.msg(' 投票项目不能为空！', {icon: 2});
               return;
           }
           $.ajax({
               url:'/voteItem/updateVoteItem',
               type:'post',
               data:{itemId:sId,itemName:text},
               dataType:'json',
               success:function(){
                   layer.msg(' <fmt:message code="menuSSetting.th.editSuccess" />！', {icon: 6});
                   show();
               }
           })
       })

//       点击添加
        $('#add').click(function(){
            var text=$('.add').val();
            if(text.replace(/(^\s*)|(\s*$)/g, "")==""){
                layer.msg(' 投票项目不能为空！', {icon: 2});
                return;
            }
            $.ajax({
                url:'/voteItem/addVoteItem',
                data:{itemName:text,voteId:ItemId},
                type:'post',
                dataType:'json',
                success:function(){
                    layer.msg(' <fmt:message code="depatement.th.Newsuccessfully" />！', {icon: 6});
                    show();
                    $('.add').val("");
                }

            })
        })
   })
</script>
</html>
