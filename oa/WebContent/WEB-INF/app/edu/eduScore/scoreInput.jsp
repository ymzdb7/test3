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
    <title>成绩录入</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        .content{
            width:95%;
            height:100%;
            margin:0 auto;
            overflow:hidden;
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
        /*左边栏*/
        .conLeft{
            float:left;
            width:15%;
            border:#dddddd solid 1px;

        }
        .conLeft>div{
            width:100%;
            height:50px;
            line-height:50px;
            border-top:1px dashed #dddddd;
            margin-top:-1px;
            font-size:16px;
            font-weight:bold;
            cursor:pointer;
            text-align:center;
            color:#1E1E1E;
        }
        .text{
            color:#1E1E1E;
            border-bottom:1px solid #dddddd;
            cursor:default!important;
        }
        /*右边栏*/
        .conRight{
            float:left;
            width:80%;
            margin-left:20px;
        }
        .conRight span{
            padding-left:20px;
        }
        .titNav{
            height:30px;
            line-height:30px;
            padding-bottom:8px;
            margin-top:10px;
            color:#1e1e1e;
        }
        .tongbu{
            display:inline-block;
        }
        .table th{
            height:50px;
            line-height:50px;
            font-size:16px;
            background:#2F8AE3;
            color:#fff;
            text-align:center;
        }
        .table td{
            text-align:center
        }
        .line{
            margin-top:20px;
            border-top:#2F8AE3 solid 3px;
            padding-top:5px;
        }
        .save{
            text-align:right;
        }
        #save{
            background: url(../../img/vote/saveBlue.png) no-repeat;
            color: #fff;
            line-height: 30px;
            font-size: 16px;
            width: 91px;
            height: 30px;
            cursor: pointer;
        }
        .score,.level,.event{
            width:150px;
        }
        .scoreName{
            width:150px;
        }

        .active{
            background:#2F8AE3;
        }
        .conLeft .active{
            color:#fff;
        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content">
    <div class="header" style="margin-top:20px;">
        考试成绩录入
    </div>
    <%--左边栏--%>
    <div class="conLeft">
        <div class="text">选择班级：</div>

    </div>
    <%--右边栏--%>
    <div class="conRight">
        <div class="titNav">
            <span style="float:left">科目：</span>
            <select name="" id="subject" style="float:left">

            </select>
            <span style="float:left">类型：</span>
            <select name="" id="type" style="float:left">

            </select>
            <span style="float:left">考试名:</span>
            <input type="text" class="scoreName" style="float:left">
            <div class="tongbu">
                <span style="float:left;padding-left:20px;">数据同步到学籍</span>
                <input type="checkbox" style="margin:5px 0px 0px 5px;">
            </div>
        </div>
        <div class="table">
            <table>
                <thead>
                    <tr>
                        <th style="width:20%">学号</th>
                        <th>姓名</th>
                        <th style="width:15%">成绩</th>
                        <th>成绩等级</th>
                        <th>考试情况</th>
                    </tr>
                </thead>
                <tbody class="list">

                </tbody>
            </table>
        </div>
        <div class="line"></div>
        <div class="save">
            <button id="save">保存</button>
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
                    str+=function(){
                        if(i==0){
                            return  '<div class="nianJi active">'+datas[i].graseClass+'</div>';
                        }else{
                            return  '<div class="nianJi">'+datas[i].graseClass+'</div>'
                        }
                    }()

                }
                $('.text').after(str);
//                默认显示第一个
                var text=$('.nianJi').eq(0).html();
                $.ajax({
                    url:'/eduScore/classStudent',
                    type:'get',
                    data:{graseClass:text},
                    dataType:'json',
                    success:function(res){
                        var datas=res.object;
                        var str=""
                        for(var i=0;i<datas.length;i++){
                            str+='<tr>\n' +
                                ' <td>'+datas[i].userID+'</td>\n' +
                                '     <td>'+datas[i].userName+'</td>\n' +
                                '     <td>\n' +
                                '         <input type="text" class="score">\n' +
                                '       </td>\n' +
                                '      <td>\n' +
                                '           <select name="" class="level">\n' +
                                '                 <option value="1">A</option>\n' +
                                '                 <option value="2">B</option>\n' +
                                '                 <option value="3">C</option>\n' +
                                '                 <option value="4">D</option>\n' +
                                '            </select>\n' +
                                '      </td>\n' +
                                '       <td>\n' +
                                '           <select name="" class="event">\n' +
                                '                 <option value="1">正常</option>\n' +
                                '                 <option value="2">缺考</option>\n' +
                                '                 <option value="3">作弊</option>\n' +
                                '           </select>\n' +
                                '       </td>\n' +
                                '</tr>'
                        }

                        $('.list').html(str);
                    }
                })

            }
        })
    }
    getClass();



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
// 显示第一个年级



//    点击年级
    $('.conLeft').on('click','.nianJi',function(){
        var text=$(this).text();
        $(this).addClass('active').siblings().removeClass('active');
        var data={
            graseClass:text
        };
        $.ajax({
            url:'/eduScore/classStudent',
            type:'get',
            data:data,
            dataType:'json',
            success:function(res){
               var datas=res.object;
               var str=""
               for(var i=0;i<datas.length;i++){
                   str+='<tr>\n' +
                       ' <td>'+datas[i].userID+'</td>\n' +
                       '     <td>'+datas[i].userName+'</td>\n' +
                       '     <td>\n' +
                       '         <input type="text" class="score">\n' +
                       '       </td>\n' +
                       '      <td>\n' +
                       '           <select name="" class="level">\n' +
                       '                 <option value="1">A</option>\n' +
                       '                 <option value="2">B</option>\n' +
                       '                 <option value="3">C</option>\n' +
                       '                 <option value="4">D</option>\n' +
                       '            </select>\n' +
                       '      </td>\n' +
                       '       <td>\n' +
                       '           <select name="" class="event">\n' +
                       '                 <option value="1">正常</option>\n' +
                       '                 <option value="2">缺考</option>\n' +
                       '                 <option value="3">作弊</option>\n' +
                       '           </select>\n' +
                       '       </td>\n' +
                       '</tr>'
               }

               $('.list').html(str);
            }
        })
    })

</script>
</html>
