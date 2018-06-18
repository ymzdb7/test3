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
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title>教师信息</title>
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
            padding-left: 10px;
        }
        .titleName{
            cursor:pointer;
        }
        tfoot div{
            float:left;
        }
        #del{
            background:url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            background-size: 62px;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left:20px;
            cursor:pointer;
        }
        #allDel{
            background:url(../../img/news/btn_delete_fourfont_07.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 72px;
            height: 28px;
            line-height: 25px;
            padding-left: 24px;
            margin-left:10px;
            cursor:pointer;
        }
        #empty{
            background:url(../../img/news/empty.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 100px;
            height: 28px;
            line-height: 25px;
            padding-left: 25px;
            margin-left:10px;
            cursor:pointer;
        }
        #cancle{
            background:url(../../img/news/btn_canceltop_11.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 94px;
            height: 28px;
            line-height: 25px;
            padding-left: 25px;
            margin-left:10px;
            cursor:pointer;
        }

        .success{
            text-align:center;
            display:none;
        }
        .box{
            margin-bottom:30px;
        }
        .success span{
            width: 132px;
            height: 35px;
            background-color: rgba(224, 224, 224, 0.61);
            font-size: 16px;
            border-radius: 5px;
            padding-left:8px;
            cursor:pointer;

            line-height: 30px;
            display: inline-block;
        }
        .ellipsis{
            width:100px;
            overflow:hidden;
            text-overflow: ellipsis;
            white-space:nowrap;
            display: block;
        }
        .box{
            width:500px;
            height:150px;
            text-align:center;
            font-size:20px;
            color:#fff;
            background:#2F8AE3;
            margin:0 auto;
            line-height:150px;
            margin-bottom:30px;
            margin-top:50px;
        }
        #addItem{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
            width: 142px;
        }
        #addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
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

<div class="content" style="width:100%;height:100%">
    <div class="title">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/manage.png" alt="" style="padding-left:20px">
        <span style="padding-left:0px">教师信息管理</span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr style="text-align: left;">
                <%--<th style="width: 2%;"></th>--%>
                <th >姓名</th>
                <th >性别</th>
                <th >政治面貌</th>
                <th >联系电话</th>
                <th >是否在编</th>
                <th >第一学历</th>
                <th >最高学历</th>
                <th >开始任教日期</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody class="list">

            </tbody>
            <tfoot>
            <%--<tr>--%>
                <%--<td colspan="10">--%>
                    <%--<div>--%>
                        <%--<input id="allChoose" type="checkbox">--%>
                        <%--<span><fmt:message code="notice.th.allchose" /></span>--%>
                    <%--</div>--%>
                    <%--<div id="del">--%>
                        <%--<fmt:message code="global.lang.delete" />--%>
                    <%--</div>--%>
                    <%--<div id="allDel">--%>
                        <%--<fmt:message code="meet.th.DeleteAll" />--%>
                    <%--</div>--%>
                    <%--&lt;%&ndash; <div id="empty">--%>
                         <%--<fmt:message code="notice.th.wipeData" />--%>
                     <%--</div>&ndash;%&gt;--%>
                <%--</td>--%>
            <%--</tr>--%>
            </tfoot>
        </table>
    </div>
</div>
<div class="success">
    <div class="box"><fmt:message code="event.th.Released" />！</div>
    <div>
        <span id="addItem"><fmt:message code="vote.th.AddVotingItems" /></span>
    </div>
</div>
<script type="text/javascript">

    //点击查询后，查询列表展示
    $(function () {
//        验证undefined
        function  check(name) {
            if(name == undefined){
                return ''
            }else{
                return name;
            }
        }

//        列表带分页
        var ajaxPageLe={
            data:{
                page:1,//当前处于第几页
                pageSize:10,//一页显示几条
                useFlag:true
                // computationNumber:null
            },
            page:function () {
                var me=this;
                $.ajax({
                    url:'/teachering/selectObject',
                    type:'get',
                    data:me.data,
                    dataType:'json',
                    success:function(reg){
                        var datas=reg.object;
                        var str="";
                        for(var i=0;i<datas.length;i++){
                            str+='<tr class="pagediv" id='+datas[i].id+'>' +
//                                '<td> ' +
//                                '<input type="checkbox" class="childCheck"> ' +
//                                '</td> ' +
                                '<td>'+check(datas[i].name)+'</td> ' +
                                '<td >'+check(datas[i].sex)+'</td> ' +
                                '<td >'+check(datas[i].political)+'</td> ' +
                                '<td>'+check(datas[i].pohne)+'</td> ' +
                                '<td>'+function(){
                                if(datas[i].isInseries == undefined){
                                    return ''
                                }else if(datas[i].isInseries == 0){
                                    return '是'
                                }else{
                                    return '否'
                                }
                                }()+'</td> ' +
                                '<td>'+check(datas[i].firstEdu)+'</td> ' +
                                '<td>'+check(datas[i].heighestEdu)+'</td> ' +
                                '<td>'+check(datas[i].startTeachingDate)+'</td> ' +
                                    '<td>'+
                                '<a class="detail" href="javascript:;" style="color:#1772c0">查看详情</a> ' +
                                '<a class="edit" href="javascript:;" style="color:#1772c0">修改</a> ' +
                                '<a class="del" href="javascript:;" style="color:#1772c0">删除</a> ' +
                                '</td> ' +
                                '</tr>'
                        }
                        $('.list').html(str);
                        me.pageTwo(reg.totleNum,me.data.pageSize,me.data.page)
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

//        点击查看详情
        $('.list').on('click','.detail',function(){
            var id=$(this).parents('tr').attr('id')
            self.parent.document.getElementById("iframe").src='/teachering/editTeacher?type=0&id='+id;
        })

//        点击修改
        $('.list').on('click','.edit',function(){
            var id=$(this).parents('tr').attr('id')
            self.parent.document.getElementById("iframe").src='/teachering/editTeacher?type=1&id='+id;
        })

//        hover显示数据
//        $('.table').on('mouseover ','.ellipsis',function(){
//            var textLength=$(this)[0].scrollWidth-20;
//            var width=$(this).width();
//            if(textLength>width){
//                layer.tips($(this).text(),$(this),{tips:[3,'#2b7fe0']})
//            }
//        })

//        点击全选
        $('#allChoose').click(function(){
            var state=$(this).prop('checked');
            if(state == true){
                $(this).prop('checked',true);
                $('.childCheck').prop('checked',true);
            }else{
                $(this).prop('checked',false);
                $('.childCheck').prop('checked',false);
            }
        })
//        点击删除
        $(document).on('click','.del',function(){
            var id=$(this).parents('tr').attr('id')
            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="common.th.prompt" />"
            },function(){
                $.ajax({
                    url:'/teachering/delete',
                    type:'post',
                    dataType:'json',
                    data:{id:id},
                    success:function(){
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        ajaxPageLe.data.page=1;
                        ajaxPageLe.page()
                    }
                })
            }, function () {
                layer.closeAll();
            })
        })

//        点击全部删除
        $('#allDel').click(function(){
//            $('.childCheck').prop('checked',true);
            var checkL=$('.childCheck:checkbox').length;
            var arr=[];
            if(checkL != 0){
                $('.childCheck:checkbox').each(function(){

                    var sId=$(this).parent().parent().attr('id');
                    arr.push(sId);
                })
                var str=arr.join();
                layer.confirm(' <fmt:message code="event.th.allDeleted" />？', {
                    btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                    title: " <fmt:message code="common.th.prompt" />"
                },function(){
                    $.ajax({
                        url:'/vote/manage/deleteByVoteId',
                        type:'post',
                        dataType:'json',
                        data:{voteIds:str},
                        success:function(){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            window.location.reload();
                        }
                    })
                }, function () {
                    layer.closeAll();
                })

            }
        })
//        点击清空数据
        $('#empty').click(function(){
            $('.list').empty();
        })


    })



</script>
</body>


</html>
