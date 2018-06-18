 <%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/8/22
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录超时</title>
    <meta charset="UTF-8">
    <style>
        .timeOut{
            position: fixed;
            width: 270px;
            height: 224px;
            top: 50%;
            left: 50%;
            margin-left: -135px;
            margin-top: -112px;
            text-align: center;
        }
        .timeOut .timeOutMain{
            width: 100%;
            height: 225px;
            /*background: url("/img/timeOut.png") no-repeat;*/
            background-size: contain;
        }
 

        .timeOut a{
            display: inline-block;
            margin-top: 46px;
            padding: 10px 54px;
            background: #2b7fe0;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
            margin: 26px auto;
        }
        a{
            text-decoration:none
        }
        .alertText{
            top: 190px;
            position: relative;
            color: #809ab7;
            font-size: 18px;
        }
    </style>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery/jquery.cookie.js"></script>
     <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>     <script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>    <script src="/js/base/base.js"></script>
</head>
<body>
    <div class="timeOut">
        <div class="timeOutMain">

            <span class="alertText" id="alertText"></span>
        </div>
        <a href="javascript:void (0)">重新登录</a>
    </div>
    <script>

        var imageType = $.GetRequest().imageType;
        if(imageType!=undefined){
            if(imageType==100030){
                //用户权限表缺失
                $('#alertText').html('登录失败，用户权限表数据缺失（错误代码：100030）');
                $(".timeOutMain").css("background","url(/img/noauth.png) no-repeat")
            }else if(imageType==403){
                $('#alertText').html('认证信息已过期，请重新登录<br>（错误代码：403）');
                //服务器session创建失败
                $(".timeOutMain").css("background","url(/img/loginOut.png) no-repeat")
            }else if(imageType==1070){
                $('#alertText').html('登录失败，用户权限表数据缺失（错误代码：100030）');
                //用户登录过期
                $(".timeOutMain").css("background","url(/img/loginTimeOut.png) no-repeat")
            }else{
                //服务器session创建失败
                $('#alertText').html('认证信息已过期，请重新登录<br>（错误代码：403）');
                $(".timeOutMain").css("background","url(/img/loginOut.png) no-repeat")
            }
        }
        $('a').click(function () {
            if(typeof parent.urlHost =='function'){
                parent.urlHost('/')
            }else {
                window.location.href='/'
            }



        })

        $.cookie('JSESSIONID',null)
        $.cookie('company',null)
        $.cookie('deptId',null)
        $.cookie('language',null)
        $.cookie('sex',null)
        $.cookie('uid',null)
        $.cookie('userId',null)
        $.cookie('userName',null)
        $.cookie('userPriv',null)
        $.cookie('userPrivName',null)
    </script>
</body>
</html>
