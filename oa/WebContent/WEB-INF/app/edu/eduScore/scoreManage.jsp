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
    <script src="/lib/laydate/test/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title>成绩管理</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        .content{
            width:100%;
            height:100%;
            margin:0 auto;
            overflow:hidden;
            position:relative;
        }
        .header{
            width:100%;
            height:40px;
            line-height:40px;
            border-bottom:#2F8AE3 solid 3px;
            color:#2F8AE3;
            font-size:18px;
            font-weight:bold;
            margin-bottom:15px;
        }
        .section{
            width:100%;
            height:100%;
            position:absolute;
            top:53px;
            overflow:hidden;
        }
        .left_menu{
            width:15%;
            float:left;
            height:100%;
            border-right:1px solid #EDEDED;
        }
        .right{
            width:84%;
            float:right;
            height:100%
        }
        .nav{
            width:100%;
            height:50px;
            line-height:50px;
            border-bottom:#2F8AE3 solid 3px;
        }
        table{
            width:60%;
            margin:20px auto 0px;
            font-size:15px;
        }
        table td,th{
            padding:10px;
            text-align:center;
        }
        table th{
            color:#2F5C8F;
        }
        .title{
            height:35px;
            line-height:35px;
            width:100%;
            text-align:center;
            font-size:15px;
            color:#4993b3;
            cursor:pointer;
        }


    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content">
    <div class="header" style="margin-top:10px;">
        成绩管理
    </div>
    <div class="section">
        <div class="left_menu">
            <div class="tree">
                <div class="title">
                    2016-2017学年
                </div>
                <ul class="treeList">

                </ul>
            </div>
        </div>
        <div class="right">
            <div class="nav">
                <span>类型:</span>
                <select name="">
                    <option value="">期末考试</option>
                </select>
                <span style="padding-left:20px">考试名:</span>
                <select name="">
                    <option value="">111</option>
                </select>
                <span style="padding-left:20px">更新排名</span>
                <span style="padding-left:20px">五年级<e>2</e>人，</span>
                <span>一班<e>2</e>人</span>
            </div>
            <div class="table">
                <table>
                    <thead>
                        <tr>
                            <th>学号</th>
                            <th>姓名</th>
                            <th>数学</th>
                            <th>总分</th>
                            <th>年级排名</th>
                            <th>班级排名</th>
                        </tr>
                    </thead>
                    <tbody class="list">
                        <tr>
                            <td>1</td>
                            <td>2</td>
                            <td>3</td>
                            <td>4</td>
                            <td>5</td>
                            <td>6</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>

<script type="text/javascript">
    <%--显示左边班级--%>
    function getClass(){
        $.ajax({
            url:'/eduScore/userTsf',
            type:'get',
            dataType:'json',
            success:function(res){
                var datas=res.object;
                var str=""
                for(var i=0;i<datas.length;i++){
                    str+= '<div class="nianJi">'+datas[i].graseClass+'</div>'

                }
                $('.text').after(str);

            }
        })
    }
    getClass()

    //    获取考试类型
    $.ajax({
        url:'/code/getCode',
        type:'get',
        data:{parentNo:'EXAM_TYPE'},
        dataType:'json',
        //data:datas,
        success:function(data){
            var data=data.obj;
            var str="";
            for(var i=0;i<data.length;i++){
                str+='<option value="'+data[i].codeNo+'">'+data[i].codeName+'</option>'
            }
            $('#type').append(str);
        }
    })

    //    获取科目
    $.ajax({
        url:'/eduScore/getKeMu',
        type:'get',
        dataType:'json',
        //data:datas,
        success:function(data){
            var data=data.obj;
            var str="";
            for(var i=0;i<data.length;i++){
                str+='<option value="">'+data[i]+'</option>'
            }
            $('#subject').append(str);
        }
    })

    //    点击年级
    $('.conLeft').on('click','.nianJi',function(){
        var text=$(this).html();
        var data={
            graseClass:text
        };
        $.ajax({
            url:'/eduScore/classStudent',
            type:'get',
            data:data,
            dataType:'json',
            success:function(res){
                console.log(res)
            }
        })
    })

</script>
</html>
