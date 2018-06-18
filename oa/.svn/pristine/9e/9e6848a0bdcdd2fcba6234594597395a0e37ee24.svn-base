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
    <link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title>选修课按教学班统计</title>
    <style>
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:0px;
        }
        .title img{
            vertical-align: middle;
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
            text-align:center;
        }
        th{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:45px;
        }
        .titleName{
            cursor:pointer;
        }
        .name{
            padding-left:20px;
            color:#333;
        }
        #chooseName{
            width:150px;
        }
        .box{
            margin-bottom:10px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div class="content" style="width:100%;height:100%">
    <div class="title">
        <img src="../../img/edu/jiao.png" alt="">
        <span >选修课按教学班统计</span>
    </div>
    <div class="box">
        <label class="name">选课名称:</label>
        <select  id="chooseName">
                 <option value="0">请选择</option>
        </select>
    </div>
    <div class="table">
        <table>
            <thead>
                <tr>
                    <th>班级</th>
                    <th>总人数</th>
                    <th>选修课选满人数</th>
                    <th>选修课没选满人数</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
//        获取选修课名称下拉框数据
        function getSelect(){
            $.ajax({
                url:'/eduElectivePublish/selectEduPublish',
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str=""
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].id+'">'+data[i].electiveCourse+'</option>'
                    }
                    $('#chooseName').append(str);
                }
            })
        }
        getSelect();
//        按教学班统计列表显示
        function show(data){
            $.ajax({
                url:'/eduElectiveStudentCount/eudSelectStudentCount',
                type:'get',
                data:data,
                dataType:'json',
                success:function(reg){
                    var datas=reg.obj;
                    var str="";
                    for(var i=0;i<datas.length;i++){
                        str+=' <tr id="'+datas[i].classId+'"> ' +
                            '<td>'+function () {
                                if(datas[i].deptFunc!=undefined){
                                    return datas[i].deptFunc;
                                }else{
                                   return '';
                                }
                            }()+'</td> ' +
                            '<td>'+datas[i].contsum+'</td> ' +
                            '<td>'+datas[i].ysesum+'</td> ' +
                            '<td>'+(datas[i].contsum-datas[i].ysesum)+'</td> ' +
                            '<td><a href="javascript:;" class="details" style="color:#1772c0">详细信息</a></td> ' +
                            '</tr>'
                    }
                    $('.list').html(str);
                }
            })
        }
        show();

//        通过选择下拉框数据获取列表数据
        $('#chooseName').change(function(){
            var data={
                id:$('#chooseName option:selected').val()
            };
            show(data);
        })

//        详细信息
        $('.list').on('click','.details',function(){
            var classId=$(this).parent().parent().attr('id');
            var sId=$('#chooseName option:selected').val();
            window.open("/eduElectiveStudentCount/courseStatisticsDetails?classId="+classId+"&sId="+sId,"_blank","top=100,left=300,width=700,height=500,menubar=yes,scrollbars=no,toolbar=yes,status=yes");
        })
    })
</script>
</body>
</html>
