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
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title>管理图书</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        .title{
            height:70px;
            line-height:70px;
        }
        .title span{
            font-size: 22px;
            color: #494d59;
        }
        .title img{
            vertical-align: middle;
            padding-left:20px;
            float:left;
            margin:23px 5px 0px 0px;
        }
        .table{
            width:98%;
            margin:0 auto;
        }
        table{
            width:100%;
        }
        table th{
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            text-align:left;
        }
        table th,tr{
            padding:10px;
        }
        .foot{
            text-align: center;
            height: 70px;
            line-height: 70px;
        }
        table a{
            text-decoration: none;
            color:#207bd6;
            padding-right:5px;
        }
        #back{
            display: inline-block;
            width: 78px;
            height: 30px;
            line-height: 30px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
        }
        #delete{
            background: url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left: 20px;
            cursor: pointer;
            display: inline-block;
        }
        .noDate{
            text-align:center;
        }
        .noDate h2{
            font-size:22px;
            font-weight:normal;
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
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div>
    <div class="title">
        <img src="../../img/book/no.png" alt="">
        <span>未批借阅</span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="table" >
        <table>
            <thead>
            <th>书名</th>
            <th>图书编号</th>
            <th>借书日期</th>
            <th>还书日期</th>
            <th>登记人</th>
            <th>状态</th>
            <th>操作</th>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
    <div class="noDate" style="display: none">
        <img src="/img/noData.png" alt="">
        <h2>暂无数据</h2>
    </div>
</div>
</body>
<script>
//    $(function(){
        //        列表带分页
        var ajaxPageLe={
            data:{
                page:1,//当前处于第几页
                pageSize:10,//一页显示几条
                useFlag:true,
                bookStatus:2
                // computationNumber:null
            },
            page:function () {
                var me=this;
                $.ajax({
                    url:'/bookManage/selManageByBookStatus',
                    type:'get',
                    data:me.data,
                    dataType:'json',
                    success:function(reg){
                        var datas=reg.obj;
                        var str="";
                        for(var i=0;i<datas.length;i++){
                            var date = new Date(parseInt(datas[i].borrowDate));
                            var date1=new Date(parseInt(datas[i].returnDate));
                            str += '<tr id="'+datas[i].borrowId+'">' +
                                '                <td>'+datas[i].bookName+'</th>' +
                                '                <td>'+datas[i].bookNo+'</td>' +
                                '                <td>'+[date.getFullYear(), date.getMonth()+1, date.getDate()].join('-')+'</td>' +
                                '                <td>'+[date1.getFullYear(), date1.getMonth()+1, date1.getDate()].join('-')+'</td>' +
                                '                <td>登记人</td>' +
                                '                <td>'+function(){
                                    if(datas[i].status==2){
                                        return "未准还书"
                                    }else if(datas[i].bookStatus==2){
                                        return "未准借书"
                                    }else{
                                        return ""
                                    }
                                }()+'</td>' +   '                <td>'+function(){
                                    if(datas[i].status==2){
                                        return  '<a href="javascript:;" class="return" onclick="upManage('+datas[i].borrowId+',0)">还书</a>'
                                    }else if(datas[i].bookStatus==2){
                                        return  '<a href="javascript:;" class="remove">删除</a>'
                                    }else{
                                        return ""
                                    }
                                }()+'</td>' +
                                '            </tr>'
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
        //        点击删除
        $('.list').on('click','.remove',function(){
            var id=$(this).parents('tr').attr('id');
            layer.confirm('<fmt:message  code="workflow.th.que"/>',{
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="common.th.prompt" />"
            },function(){
                $.ajax({
                    url:'/bookManage/upManageById',
                    type:'post',
                    data:{borrowId:id,deleteFlag:1},
                    dataType:'json',
                    success:function(res){
                        if(res.flag){
                            $.layerMsg({content:'删除成功',icon:1});
                            ajaxPageLe.page();
                        }else{
                            $.layerMsg({content:'删除失败',icon:2});
                        }
                    }
                })
            },function(){
                layer.close();
            })

//        })

        // 还书：status=0
        function upManage(borrowId,status) {
            $.ajax({
                url: '/bookManage/upManageById',
                type: 'get',
                dataType: 'json',
                data:{
                    borrowId:borrowId,
                    status:status
                },
                success: function (res) {
                    if(res.flag){
                        $.layerMsg({content: '修改成功', icon:1});
                        ajaxPageLe.page();
                    }else{
                        $.layerMsg({content: '修改失败', icon:2});
                    }
                }
            })
        }

    })




</script>
</html>
