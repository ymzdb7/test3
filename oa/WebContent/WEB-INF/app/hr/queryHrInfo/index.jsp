<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工自助查询</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" type="text/css" href="/css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="/css/hr/index.css"/>
    <link rel="stylesheet" type="text/css" href="/css/hr/style.css"/>
    <script src="/js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/sys/userInfor.js" type="text/javascript" charset="utf-8"></script>
    <style>
        html,body{
            height:100%;
        }
        .headli1_1 {
            padding: 0px 10px;
            display: inline-block;
            text-align: center;
        }
        .headli1_2 {
            width: 2px;
            margin-left: 26px;vertical-align: middle;

        }
        .dingbu .divTitle {
            float: left;
            height: 45px;
            line-height: 20px;
            font-size: 22px;
            margin-left: 40px;
            color: rgb(73, 77, 89);
        }
        .dingbu {
            height: 40px;
            border-bottom: 1px solid #999;
        }
        .dingbu .headImg {
            float: left;
            width: 23px;
            height: 100%;
            margin-left: 12px;
        }
        .headImg img {
            width: 23px;
            height: 23px;
            margin-top: 11px;
            vertical-align: middle;
            border: 0;
        }
    </style>
</head>
<body>
<div class="content" style="overflow:hidden">
    <div class="dingbu" style="margin-top: 14px">
        <div class="headImg">
            <img src="/img/hr/employQuery.png" style="margin-top: -6px;margin-left: 22px;" alt="">
        </div>

        <div class="divTitle">
            员工自助查询
        </div>

    </div>
    <div class="main" style="margin-left: 16px;margin-top: 20px;height: 86%">
        <div>
            <select name="title" class="selectTitle" id="select" style="width: 100px;height: 30px;">
                <option value="01">人事档案</option>
                <option value="02">合同信息</option>
                <option value="03">考勤记录</option>
            </select>
        </div>



    <div class="staffInfo" style="display: block;height: 100%;">
        <iframe src="/hr/query/queryHr/staffPersonInfo" frameborder="0" style="width: 100%;height: 100%" >

        </iframe>
    </div>
    <div class="contractInfo" style="display: none;height: 100%;">
        <iframe src="" frameborder="0" style="width: 100%;height: 100%" >

        </iframe>
    </div>
        <div class="attendRecord" style="display: none;height: 100%;">
            <iframe src="" frameborder="0" style="width: 100%;height: 100%" >

            </iframe>
        </div>
    </div>


</div>
<script>
    $(function () {
        $('#select').change(function(){
            var id = $('#select option:checked').val();
            if(id == 01){
                $('.contractInfo').css("display","none");
                $('.attendRecord').css("display","none");
                $('.staffInfo').css("display","block");
                $('.contractInfo iframe').attr("src","");
                $('.attendRecord iframe').attr("src","");
                $('.staffInfo iframe').attr("src","/hr/query/queryHr/staffPersonInfo");
            }else if(id == 02){
                $('.contractInfo').css("display","block");
                $('.staffInfo').css("display","none");
                $('.attendRecord').css("display","none");
                $('.staffInfo iframe').attr("src","");
                $('.attendRecord iframe').attr("src","");
                $('.contractInfo iframe').attr("src","/hr/query/queryHr/contractInfo");
            }else {
                $('.contractInfo').css("display","none");
                $('.staffInfo').css("display","none");
                $('.attendRecord').css("display","block");
                $('.staffInfo iframe').attr("src","");
                $('.contractInfo iframe').attr("src","");
                $('.attendRecord iframe').attr("src","/hr/query/attend/attendanceRecord");
            }

        });
    })
//    $(function(){
//        //$('#department').deptSelect();
//        //$('#selectUser').privSelect();
//        $.loadSidebar($('#downChild'),0,function (el) {
////            $.loadSidebar(el,30)
//            $('#downChild>li>span').css();
//        })
//        $('.headDiv .main_title').on('click','.headli1_1',function(){
//            var url=$(this).attr('url');
//            $(this).addClass('title_on');
//            $(this).parent().siblings().find('.headli1_1').removeClass('title_on');
//            $('.cont_frame').attr('src',url);
//        })
//    })
</script>
</body>
</html>

