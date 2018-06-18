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
    <title>还书管理</title>
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
            width:550px;
            margin:0 auto;
        }
        table{
            width:100%;
        }
        /*table td{*/
        /*border:1px solid #ccc;*/
        /*}*/
        .head{
            height: 31px;
            line-height: 31px;
            background-color: #3791DA;
            color: #fff;
            font-size: 14px;
            text-align: center;
            border-radius: 4px 4px 0px 0px;
            margin-bottom:-1px;
        }
        table select{
            height:30px;
            border-radius: 3px;
        }
        table input{
            height:28px;
            line-height:28px;
            font-size:14px;
            width:80%;
            border-radius: 2px;
            vertical-align: middle;
        }
        .btn{
            width:100%;
            text-align:center;
        }
        .weight{
            width:100px;
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        #query{
            background: url(../img/file/cabinet03.png) no-repeat;
            margin-right: 10px;
            cursor: pointer;
            display: inline-block;
            width: 80px;
            height: 28px;
            line-height: 28px;
        }
        #export{
            display: inline-block;
            width: 80px;
            height: 28px;
            line-height: 28px;
            background: url(../../img/news/new_export.png) no-repeat;
            cursor: pointer;
        }
        .number{
            width:60%;
        }
        table a{
            text-decoration: none;
            color:#207bd6;
            display: inline-block;
            margin-top:17px;
        }
        .beginTime,.endTime{
            width:100px;
            float:left;
            vertical-align: middle;
        }
        .text{
            float:left;
            display: inline-block;
            margin:7px 3px 0px 3px;
        }
        .tableList .table{
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

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="query">
    <div class="title">
        <img src="../../img/book/history.png" alt="">
        <span>历史记录查询</span>
    </div>
    <div class="table">
        <table>
            <tr>
                <td class="weight">借书人：</td>
                <td>
                    <input type="text" class="number" disabled="disabled" id="borrower">
                    <a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addUser">指定</a>
                </td>
            </tr>
            <tr>
                <td class="weight">借书编号：</td>
                <td>
                    <input type="text" class="number" disabled="disabled" id="bookNo">
                    <a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addNum">选择</a>
                </td>
            </tr>
            <tr>
                <td class="weight">借书日期：</td>
                <td>
                    <span class="text">从</span>
                    <input type="text" class="beginTime" >
                    <span class="text">到</span>
                    <input type="text" class="endTime">
                </td>
            </tr>
            <tr>
                <td class="weight">状态：</td>
                <td>
                    <select  id="details">
                        <option value="">选择</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="weight">备注：</td>
                <td>
                    <input type="text" class="beizhu">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <div class="btn">
                        <span id="query">查询</span>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="tableList" style="display: none">
    <div class="title">
        <img src="../../img/book/query.png" alt="">
        <span>历史记录查询</span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="table">
        <table>
            <thead>
            <th>借书人</th>
            <th>图书编号</th>
            <th>书名</th>
            <th>借书日期</th>
            <th>还书日期</th>
            <th>实还日期</th>
            <th>登记人</th>
            <th>状态</th>
            <th>备注</th>
            <th>操作</th>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
    <div style="text-align:center;margin-top:20px;">
        <span id="back">返回</span>
    </div>
</div>
</body>
<script>
    $(function(){
        //        点击添加借书人
        $('.addUser').click(function(){
            user_id='borrower';
            $.popWindow('../common/selectUser')
        })
//        点击添加借书编号
        $('.addNum').click(function(){
            $.popWindow('/bookManager/selectBook')
//            window.open('/bookManager/selectBook','_blank','width=800,height=700,top=100px,left=200px')
        })

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
                var data={
                    buserId:$('#borrower').val(),
                    bookNo:$('#bookNo').val(),
                    borrowDate:$('.beginTime').val(),
                    returnDate:$('.endTime').val(),
                    status:$('#details option:selected').val(),
                    borrowRemark:$('.beizhu').val()
                }
                $.ajax({
                    url:'/bookManage/selDelFlag',
                    type:'get',
                    data:Object.assign(me.data,data),
                    dataType:'json',
                    success:function(reg){
                        var datas=reg.obj;
                        console.log(datas);
                        var str="";
                        for(var i=0;i<datas.length;i++){
                            var date = new Date(parseInt(datas[i].borrowDate));
                            var date1=new Date(parseInt(datas[i].returnDate));
                            str += '<tr id="'+datas[i].borrowId+'">' +
                                '                    <td>'+datas[i].buserName+'</td>' +
                                '                    <td>'+datas[i].bookNo+'</td>' +
                                '                    <td>'+datas[i].bookName+'</td>' +
                                '                    <td>'+[date.getFullYear(), date.getMonth()+1, date.getDate()].join('-')+'</td>' +
                                '                    <td>'+[date1.getFullYear(), date1.getMonth()+1, date1.getDate()].join('-')+'</td>' +
                                '                    <td></td>' +
                                '                    <td>'+datas[i].ruserName+'</td>' +
                                '                    <td>'+function(){
                                    if(datas[i].status==0){
                                        return "未还"
                                    }else{
                                        return "已还"
                                    }
                                }()+'</td>' +
                                '                    <td>'+datas[i].borrowRemark+'</td>' +
                                '                    <td><a href="javascript:;" class="delete" style="margin-top:0px">彻底删除</a></td>' +
                                '                </tr>'
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
        //        点击查询
        $('#query').click(function(){
            $('.tableList').show();
            $('.query').hide();
            ajaxPageLe.page();
        })
//        点击返回
        $('#back').click(function(){
            $('.tableList').hide();
            $('.query').show();
        })

        //彻底删除
        $('.list').on('click','.delete',function(){
            var id=$(this).parents('tr').attr('id');
            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="common.th.prompt" />"
            },function(){
                $.ajax({
                    url:'/bookManage/delManageById',
                    type:'get',
                    data:{borrowId:id},
                    dataType:'json',
                    success:function(res){
                        if(res.flag){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            ajaxPageLe.page();
                        }else{
                            layer.msg(' 删除失败', {icon: 2});
                        }
                    }
                })
            })
        })

    })

</script>
</html>
