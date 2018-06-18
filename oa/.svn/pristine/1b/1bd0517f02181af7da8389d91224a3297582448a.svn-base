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
    <title>图书查询</title>
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
        table input[type=text]{
            height:28px;
            line-height:28px;
            font-size:14px;
            width:80%;
            border-radius: 2px;
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

        table a{
            text-decoration: none;
            color:#207bd6;
            display: inline-block;
        }

        .tablelist{
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
        .inputStyle{
            padding:0px 0px 0px 10px
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
        .list .ellipsis{
            margin:0px;
            display: block;
            overflow:hidden;
            text-overflow: ellipsis;
            white-space:nowrap;
        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="query">
    <div class="title">
        <img src="../../img/book/query.png" alt="">
        <span>图书查询</span>
    </div>
    <div class="table">
        <table>
            <div class="head">
                请输入查询条件
            </div>
            <tr>
                <td class="weight">图书类别：</td>
                <td>
                    <select id="bookType">

                    </select>
                </td>
            </tr>
            <tr>
                <td class="weight">借阅状态：</td>
                <td>
                    <select id="details">
                        <option value="">请选择</option>
                        <option value="0">未借出</option>
                        <option value="1">已借出</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="weight">书名：</td>
                <td>
                    <input type="text" class="bookName">
                </td>
            </tr>
            <tr>
                <td class="weight">图书编号：</td>
                <td>
                    <input type="text" class="number" id="bookNum">
                    <%--<a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addNum">添加</a>--%>
                    <%--<a href="javascript:;" class="emptyNum">清空</a>--%>
                </td>
            </tr>
            <tr>
                <td class="weight">作者：</td>
                <td>
                    <input type="text" class="bookAuther">
                </td>
            </tr>
            <tr>
                <td class="weight">ISBN号：</td>
                <td>
                    <input type="text" class="ISBN">
                </td>
            </tr>
            <tr>
                <td class="weight">出版社：</td>
                <td>
                    <input type="text" class="press">
                </td>
            </tr>
            <tr>
                <td class="weight">存放地点：</td>
                <td>
                    <input type="text" class="place">
                </td>
            </tr>
            <tr>
                <td class="weight">排序字段：</td>
                <td>
                    <select id="field">
                        <option value="DEPT">部门</option>
                        <option value="TYPE_ID">类别</option>
                        <option value="BOOK_NAME">书名</option>
                        <option value="AUTHOR">作者</option>
                        <option value="PUB_HOUSE">出版社</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <div class="btn">
                        <span id="query">查询</span>
                        <span id="export">导出</span>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="result" style="display: none">
    <div class="title">
        <img src="../../img/book/query.png" alt="">
        <span>图书查询结果</span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="tablelist">
        <table>
            <thead>
            <th style="width:1%"></th>
            <th>部门</th>
            <th style="width:7%">书名</th>
            <th>编号</th>
            <th>类别</th>
            <th>作者</th>
            <th>出版社</th>
            <th>存放地点</th>
            <th style="width:10%">借阅范围</th>
            <th>借阅情况</th>
            <th>操作</th>
            </thead>
            <tbody class="list">

            </tbody>
            <tfoot>
            <tr>
                <td  colspan="11">
                    <input type="checkbox" name="" id="AllCheck">
                    <label for="AllCheck" style="padding-left:10px">全选</label>
                    <span id="delete">删除</span>
                </td>
            </tr>
            </tfoot>
        </table>
    </div>
    <div style="text-align:center;margin-top:20px;">
        <span id="back">返回</span>
    </div>
</div>
</body>
<script>
    $(function(){
        //        获得图书类别
        function getType(){
            $.ajax({
                url:'/bookType/selAllType',
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str='<option value="">请选择</option>';
                    for(var i=0;i<data.length;i++){
                        str += '<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>'
                    }
                    $('#bookType').html(str)
                }
            })
        }
        getType();
        var ajaxPageLe={
            data:{
                page:1,//当前处于第几页
                pageSize:10,//一页显示几条
                useFlag:true,
            },
            page:function () {
                var me=this;
                var data={
                    bookName:$('.bookName').val(),
                    typeId:$('#bookType option:selected').val(),
                    bookNo:$('#bookNum').val(),
                    author:$('.bookAuther').val(),
                    isbn:$('.ISBN').val(),
                    pubHouse:$('.press').val(),
                    area:$('.place').val(),
                    order:$('#field option:selected').val(),
                    borrowFlag:$("#details").val()
                }
                $.ajax({
                    url:'/bookInfo/selBookInfoByCond',
                    data:Object.assign(me.data,data),
                    type:'get',
                    dataType:'json',
                    success:function(res){
                        $('.query').hide();
                        $('.result').show();
                        var data=res.obj;
                        var str='';
                        for(var i=0;i<data.length;i++){
                            str += '<tr id="'+data[i].bookId+'">' +
                                '                    <td class="inputStyle">' +
                                '                        <input type="checkbox" class="childCheck">' +
                                '                    </td>' +
                                '                    <td><span>'+data[i].deptName+'</span></td>' +
                                '                    <td><div class="ellipsis" style="width:120px;">'+data[i].bookName+'</div></td>' +
                                '                    <td>'+data[i].bookNo+'</td>' +
                                '                    <td>'+data[i].typeName+'</td>' +
                                '                    <td>'+data[i].author+'</td>' +
                                '                    <td>'+data[i].pubHouse+'</td>' +
                                '                    <td>'+data[i].area+'</td>' +
                                '                    <td><div  class="ellipsis" style="width:120px;">'+data[i].openName.replace(/;/g,"")+'</div></td>' +
                                '                    <td>已借出'+data[i].borrowNum+'册，剩余'+data[i].amt+'册</td>' +
                                '                    <td>' +
                                '                        <a href="javascript:;" class="edit">编辑</a>' +
                                '                        <a href="javascript:;" class="remove">删除</a>' +
                                '                    </td>' +
                                '                </tr>'
                        }
                        $('.list').html(str);
                        me.pageTwo(res.totleNum,me.data.pageSize,me.data.page)
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
        //        hover显示数据
        $('.list').on('mouseover ','.ellipsis',function(){
            var textLength=$(this)[0].scrollWidth;
            var width=$(this).width();
            if(textLength>width){
                layer.tips($(this).text(),$(this),{tips:[3,'#2b7fe0']})
            }

        })
//        点击查询
        $('#query').click(function(){
            ajaxPageLe.page();
        })
        //        点击返回
        $('#back').click(function(){
            $('.query').show();
            $('.result').hide();
        })
        //        点击全选
        $('#AllCheck').click(function(){
            var state=$(this).prop('checked');
            if(state==true){
                $(this).prop('checked',true);
                $('.childCheck').prop('checked',true);
            }else{
                $(this).prop('checked',false);
                $('.childCheck').prop('checked',false);
            }
        })
//        点击删除
        $('#delete').click(function(){
            var checkLength=$('.childCheck:checkbox:checked').length;
            var arr=[];
            if(checkLength!=0){
                $('.childCheck:checkbox:checked').each(function(){
                    var id=$(this).parents('tr').attr('id');
                    arr.push(id);
                })
            }
            var bookIds=arr.join();
            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="common.th.prompt" />"
            },function(){
                $.ajax({
                    url:'/bookInfo/delBookInfoByIds',
                    type:'post',
                    data:{bookIds:bookIds},
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
            },function(){
                layer.close();
            })

        })
//        点击单条删除
        $('.list').on('click','.remove',function(){
            var id=$(this).parents('tr').attr('id');
            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="common.th.prompt" />"
            },function(){
                $.ajax({
                    url:'/bookInfo/delBookInfoById',
                    type:'post',
                    data:{bookId:id},
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
//        点击编辑
        $('.list').on('click','.edit',function(){
            var id=$(this).parents('tr').attr('id');
            self.parent.document.getElementById('iframe').src='/bookManager/editBook?bookId='+id;
        })
//        点击导出
        $('#export').click(function(){
            window.location.href='/bookInfo/outputSelBookInfoByCond';
        })
    })
</script>
</html>
