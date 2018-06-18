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

    <title>学籍信息</title>
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
        th{
            text-align: center;
        }
        td{
            text-align: center;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--管理已发布的投票--%>

<div class="content">
    <div class="title" >
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/publish.png" alt="" style="padding-left:30px;margin-bottom: 7px">
        <span style="padding-left:10px;">学籍信息管理</span>
    </div>
    <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3">

        </div>
    </div>
    <div class="table">
        <table>
            <thead>
            <tr>
                <th>姓名</th>
                <th>性别</th>
                <th>出生日期</th>
                <th>民族</th>
                <th>联系电话</th>
                <th>家庭地址</th>
                <th>操作</th>
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
                    url:'/schoolRoll/querySchoolRollInfo',
                    type:'get',
                    data:me.data,
                    dateType:'json',
                    success:function(reg){
                        var data=reg.obj;
                        var str=""
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="pagediv" id='+data[i].voteId+' data-have="'+data[i].have+'"> ' +
                                '<td >'+function () {
                                    if(data[i].name==''||data[i].name==undefined){
                                        return '';
                                    } else {
                                        return data[i].name
                                    }
                                }()+'</td> ' +
                                '<td >'+function () {
                                   if(data[i].sex==''||data[i].sex==undefined){
                                       return '';
                                   } else {
                                       return data[i].sex
                                   }
                                }()+'</td> ' +
                                '<td >'+function () {
                                    if(data[i].brith==''||data[i].brith==undefined){
                                        return '';
                                    } else {
                                        return data[i].brith
                                    }
                                }()+'</td> ' +
                                '<td >'+function () {
                                    if(data[i].nation==''||data[i].nation==undefined){
                                        return '';
                                    } else {
                                        return data[i].nation
                                    }
                                }()+'</td> ' +
                                '<td >'+function () {
                                    if(data[i].phone==''||data[i].phone==undefined){
                                        return '';
                                    } else {
                                        return data[i].phone
                                    }
                                }()+'</td> ' +
                                '<td >'+function () {
                                    if(data[i].homrAddress==''||data[i].homrAddress==undefined){
                                        return '';
                                    } else {
                                        return data[i].homrAddress
                                    }
                                }()+'</td> ' +
                                '<td>' +
                                '<a href="javascript:;" class="look" sid="'+data[i].id+'" style="color:#1772c0">查看</a> ' +
                                '<a href="javascript:;" class="edit" sid="'+data[i].id+'" style="color:#1772c0">编辑</a> ' +
                                '<a href="javascript:;" class="del" sid="'+data[i].id+'" style="color:#1772c0">删除</a> ' +
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



        //        删除
        $(document).on('click','.del',function(){
            var id=$(this).attr('sid')
            layer.confirm(' 确定要删除吗', {
                btn: ['确定', '取消'], //按钮
                title: " 删除"
            },function(){
                $.ajax({
                    url:'/schoolRoll/delShoolRollInfo',
                    type:'post',
                    dataType:'json',
                    data:{id:id},
                    success:function(){
                        layer.msg(' 删除成功', {icon: 6});
                        ajaxPageLe.page();
                    }
                })
            }, function () {
                layer.closeAll();
            })
        })


        //        点击查看详情
        $(document).on('click','.look',function(){
            var id=$(this).attr('sid')
            self.parent.document.getElementById("iframe").src='/schoolRoll/lookSchoolRoll?id='+id;
        })

//        点击修改
        $(document).on('click','.edit',function(){
            var id=$(this).attr('sid')
            self.parent.document.getElementById("iframe").src='/schoolRoll/editSchoolRoll?id='+id;
        })
    })





</script>
</body>


</html>
