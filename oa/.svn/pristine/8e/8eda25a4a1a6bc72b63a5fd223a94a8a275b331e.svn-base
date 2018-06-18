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
            display:block;
            overflow:hidden;
            text-overflow: ellipsis;
            white-space:nowrap;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div>
    <div class="title">
        <img src="../../img/book/manage.png" alt="">
        <span>管理图书</span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="table">
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
                <th style="width:9%">借阅范围</th>
                <th>借阅情况</th>
                <th style="width:12%">操作</th>
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
</div>
</body>
<script>
    $(function(){
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
                    url:'/bookInfo/selBookInfoByCond',
                    type:'get',
                    data:me.data,
                    dataType:'json',
                    success:function(reg){
                        var datas=reg.obj;
                        var str="";
                        for(var i=0;i<datas.length;i++){
                            str += '<tr id="'+datas[i].bookId+'">' +
                                '                    <td class="inputStyle">' +
                                '                        <input type="checkbox" class="childCheck">' +
                                '                    </td>' +
                                '                    <td ><span>'+datas[i].deptName+'</span></td>' +
                                '                    <td><div class="ellipsis" style="width:120px">'+datas[i].bookName+'</div></td>' +
                                '                    <td>'+datas[i].bookNo+'</td>' +
                                '                    <td>'+datas[i].typeName+'</td>' +
                                '                    <td>'+datas[i].author+'</td>' +
                                '                    <td>'+datas[i].pubHouse+'</td>' +
                                '                    <td>'+datas[i].area+'</td>' +
                                '                    <td><div  class="ellipsis" style="width:120px;">'+datas[i].openName.replace(/;/g,"")+'</div></td>' ;
                            if(datas[i].amt==0){
                                str+='                    <td>已全部借出</td>' ;
                            }else{
                                str+='                    <td>已借出'+datas[i].borrowNum+'册，剩余'+datas[i].amt+'册</td>' ;
                            }
                                str+='                    <td>' +
                                '                        <a href="javascript:;" class="edit">编辑</a>' +
                                '                        <a href="javascript:;" class="remove">删除</a>' +
                                '                    </td>' +
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
        //        hover显示数据
        $('.list').on('mouseover ','.ellipsis',function(){
            var textLength=$(this)[0].scrollWidth;
            var width=$(this).width();
            if(textLength>width){
                layer.tips($(this).text(),$(this),{tips:[3,'#2b7fe0']})
            }

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
    })
</script>
</html>
