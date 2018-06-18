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
    <script src="/js/jquery/jquery.cookie.js"></script>
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
        .borrow{
            text-align:right;
            padding-right:30px;
            margin:-45px 0px 20px 0px;
        }
        .borrow span{
            cursor:pointer;
            background: url(../../img/vote/save.png) no-repeat;
            color: #fff;
            width: 105px;
            display: inline-block;
            height:30px;
            line-height: 30px;
            padding-right:50px;
            font-size:16px;
        }

        .type{
            width:400px;
            margin:30px auto;
        }
        .type tr{
            border:none;
        }

        .type input{
            width:250px;
            height:28px;
            line-height: 28px;
            border-radius: 2px;
        }
        .weight{
            font-weight:bold;
        }
        .noBorrow,.noBorrowRecord,.noReturn{
            text-align:center;
        }
        .noBorrow h2,.noBorrowRecord h2 ,.noReturn h2{
            font-size:16px;
            color:#ccc;
            margin-top:10px;
            font-weight:normal;
        }

        .register{
            width:550px;
            margin:0 auto;
        }
        .register table tr{
            border:none;
        }
        .register table input[type=text]{
            width:200px;
            height:28px;
        }



    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div>

    <div class="title">
        <img src="../../img/book/manage.png" alt="">
        <span>借书管理</span>
    </div>
    <div class="borrow">
        <span class="borrowBook">借书登记</span>
    </div>
    <div class="borrowed table"  style="display: none">
        <table>
            <thead>
            <th>借书人</th>
            <th>图书编号</th>
            <th>书名</th>
            <th>借书日期</th>
            <th>还书日期</th>
            <th>登记人</th>
            <th>备注</th>
            <th>操作</th>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
    <div class="noBorrow">
        <img src="/img/book/noDate.png" alt="">
        <h2>暂无借书记录</h2>
    </div>

    <div class="title" style="margin-top:20px;">
        <img src="../../img/book/commit.png" alt="">
        <span>借书确认</span>
    </div>
    <div class="noBorrowRecord">
        <img src="/img/book/noDate.png" alt="">
        <h2>暂无借书确认记录</h2>
    </div>
    <div class="yes table"  style="display: none">
        <table>
            <thead>
            <th>借书人</th>
            <th>图书编号</th>
            <th>书名</th>
            <th>借书日期</th>
            <th>还书日期</th>
            <th>登记人</th>
            <th>备注</th>
            <th>操作</th>
            </thead>
            <tbody class="list2">

            </tbody>
        </table>
    </div>


    <div class="title" style="margin-top:20px;">
        <img src="../../img/book/return.png" alt="">
        <span>还书确认</span>
    </div>
    <div class="noReturn">
        <img src="/img/book/noDate.png" alt="">
        <h2>暂无还书确认记录</h2>
    </div>
    <div class="return table"  style="display: none">
        <table>
            <thead>
            <th>借书人</th>
            <th>图书编号</th>
            <th>书名</th>
            <th>借书日期</th>
            <th>还书日期</th>
            <th>登记人</th>
            <th>备注</th>
            <th>操作</th>
            </thead>
            <tbody class="list3">

            </tbody>
        </table>
    </div>

</div>
</body>
<script>
//    $(function(){
//        点击借书登记
        $('.borrowBook').click(function(){
            layer.open({
                type:1,
                title:['借阅登记','background-color:#2b7fe0;color:#fff;'],
                area:['600px','450px'],
                shadeClose:true,
                btn:['确认','关闭'],
                content:'<div class="register">' +
                '    <table>' +
                '        <tr>' +
                '            <td class="weight">借书人：</td>' +
                '            <td>' +
                '                <input class="borrower" id="borrower" type="text" disabled userid="'+$.cookie('userId')+'" value="'+$.cookie('userName')+'"/><a href="javascript:;" id="user" style="display: inline-block;margin-top:14px;">选择</a>' +
                '            </td>' +
                '        </tr>' +
                '        <tr>' +
                '            <td class="weight">图书编号：</td>' +
                '            <td>' +
                '                <input type="text" class="bookNo" id="bookNo"/><a href="javascript:;" id="select" style="display: inline-block;margin-top:14px;">选择</a>' +
                '            </td>' +
                '        </tr>' +
                '        <tr>' +
                '            <td class="weight">借书日期：</td>' +
                '            <td>' +
                '                <input type="text" class="borrowDate" value="'+laydate.now()+'" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})"><span>为空时为当前日期</span>' +
                '            </td>' +
                '        </tr>' +
                '        <tr>' +
                '            <td class="weight">还书日期：</td>' +
                '            <td>' +
                '                <input type="text" class="returnDate" value="'+(laydate.now(+30))+'" onclick="laydate({istime: true, format: \'YYYY-MM-DD\'})"><span>为空为借书之日起30天日期</span>' +
                '            </td>' +
                '        </tr>' +
                '        <tr>' +
                '            <td class="weight">备注：</td>' +
                '            <td>' +
                '                <textarea name="" id="beizhu" style="width:350px;height:100px;"></textarea>' +
                '            </td>' +
                '        </tr>' +
                '    </table>' +
                '</div>',
                yes:function(index){
                    var data={
                        buserId:$('.borrower').attr('userid'),
                        bookNo:$('.bookNo').val(),
                        borrowDate:$('.borrowDate').val(),
                        returnDate:$('.returnDate').val(),
                        borrowRemark:$('#beizhu').val(),
                        regFlag:1
                    }
                    $.ajax({
                        url:'/bookManage/insertManage',
                        type:'get',
                        data:data,
                        dataType:'json',
                        success:function(res){
                            if(res.flag){
                                $.layerMsg({content: '借阅成功', icon:1});
                                show();
                            }else{
                                if(res.msg=='notEnoughNum'){
                                    $.layerMsg({content:'该图书已经借出',icon:2});
                                }else if(res.msg=='notEnoughPriv'){
                                    $.layerMsg({content:'借书人无权借阅本书',icon:2});
                                }else{
                                    $.layerMsg({content:'借阅失败',icon:2});
                                }
                            }
                        }
                    })
                    layer.close(index);
                },
                success:function(){
                    $('#select').click(function(){
                        window.open('/bookManager/selectBook','_blank','width=800,height=700,top=100px,left=200px')
                    });
                    $('#user').click(function(){
                        user_id='borrower';
                        $.popWindow('../common/selectUser')
                    })
                },
                btn2:function(index){
                    layer.close(index);
                }
            })
        })
//        借书管理列表
        function show(){
            $('.list').empty();
            $.ajax({
                url:'/bookManage/selByRegFlag',
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str="";
                    if(data.length>0){
                        $('.borrowed').show();
                        $('.noBorrow').hide();
                        for(var i=0;i<data.length;i++){
                            var date = new Date(parseInt(data[i].borrowDate));
                            var date1=new Date(parseInt(data[i].returnDate));
                            str+='<tr id="'+data[i].borrowId+'">' +
                                '                <td>'+data[i].buserName+'</td>' +
                                '                <td>'+data[i].bookNo+'</td>' +
                                '                <td>'+data[i].bookName+'</td>' +
                                '                <td>'+[date.getFullYear(), date.getMonth()+1, date.getDate()].join('-')+'</td>' +
                                '                <td>'+[date1.getFullYear(), date1.getMonth()+1, date1.getDate()].join('-')+'</td>' +
                                '                <td>'+data[i].ruserName+'</td>' +
                                '                <td>备注</td>' +
                                '                <td>' +
                                '                    <a href="javascript:;" class="return" onclick="upManage('+data[i].borrowId+',3,1,3)">还书</a>' +
                                '                </td>' +
                                '            </tr>'
                        }
                        $('.list').html(str);
                    }

                }
            })
        }
        show();

//        借书确认列表
        function conmit(){
            $('.list2').empty();
            $.ajax({
                url:'/bookManage/selByRegFlagAndBookStatus',
                type:'json',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str=''
                    if(data.length>0){
                        $('.noBorrowRecord').hide();
                        $('.yes').show();
                        for(var i=0;i<data.length;i++){
                            var date = new Date(parseInt(data[i].borrowDate));
                            var date1=new Date(parseInt(data[i].returnDate));
                            str+='<tr id="'+data[i].borrowId+'">' +
                                '                <td>'+data[i].buserName+'</td>' +
                                '                <td>'+data[i].bookNo+'</td>' +
                                '                <td>'+data[i].bookName+'</td>' +
                                '                <td>'+[date.getFullYear(), date.getMonth()+1, date.getDate()].join('-')+'</td>' +
                                '                <td>'+[date1.getFullYear(), date1.getMonth()+1, date1.getDate()].join('-')+'</td>' +
                                '                <td>'+data[i].ruserName+'</td>' +
                                '                <td>备注</td>' +
                                '                <td>' +
                                '                    <a href="javascript:;" class="yes" onclick="upManage('+data[i].borrowId+',1,3,3)">同意</a>' +
                                '                    <a href="javascript:;" class="return" onclick="upManage('+data[i].borrowId+',2,3,3)">退回</a>' +
                                '                </td>' +
                                '            </tr>'
                        }
                        $('.list2').html(str)
                    }

                }
            })
        }
        conmit()
//        还书确认列表
        function returnBook(){
            $('.list3').empty();
            $.ajax({
                url:'/bookManage/selByStatusQuire',
                type:'json',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str=''
                    if(data.length>0){
                        $('.noReturn').hide();
                        $('.return').show();
                        for(var i=0;i<data.length;i++){
                            var date = new Date(parseInt(data[i].borrowDate));
                            var date1=new Date(parseInt(data[i].returnDate));
                            str+='<tr id="'+data[i].borrowId+'">' +
                                '                <td>'+data[i].buserName+'</td>' +
                                '                <td>'+data[i].bookNo+'</td>' +
                                '                <td>'+data[i].bookName+'</td>' +
                                '                <td>'+[date.getFullYear(), date.getMonth()+1, date.getDate()].join('-')+'</td>' +
                                '                <td>'+[date1.getFullYear(), date1.getMonth()+1, date1.getDate()].join('-')+'</td>' +
                                '                <td>'+data[i].ruserName+'</td>' +
                                '                <td>备注</td>' +
                                '                <td>' +
                                '                    <a href="javascript:;" class="yes" onclick="upManage('+data[i].borrowId+',3,1,3)">同意</a>' +
                                '                    <a href="javascript:;" class="return" onclick="upManage('+data[i].borrowId+',3,2,3)">退回</a>' +
                                '                </td>' +
                                '            </tr>'
                        }
                        $('.list3').html(str)
                    }

                }
            })
        }
        returnBook();

//    })

    // 同意借书：bookStatus=1   同意还书：status=1  还书：status=0  续借：renewFlag=1  拒绝借书：bookStatus=2  拒绝还书：status=2
    function upManage(borrowId,bookStatus,status,renewFlag) {
        $.ajax({
            url: '/bookManage/upManageById',
            type: 'get',
            dataType: 'json',
            data:{
                borrowId:borrowId,
                bookStatus:bookStatus,
                status:status,
                renewFlag:renewFlag
            },
            success: function (res) {
                if(res.flag){
                    $.layerMsg({content: '修改成功', icon:1});
                    show();
                    conmit();
                    returnBook();
                }else{
                    $.layerMsg({content: '修改失败', icon:2});
                }
            }
        })
    }

</script>
</html>
