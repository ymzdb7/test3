<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String corpId = (String)request.getAttribute("corpId");
    String corpSecret = (String)request.getAttribute("corpSecret");
    String oId = request.getParameter("oId");
%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>钉钉首页入口</title>
    <script type="text/javascript" src="../../js/jquery/jquery.min.js"></script>
    <script src="../../js/H5/dingtalk.js"></script>
    <link href="../../css/H5/default.css" rel="stylesheet"/>
    <style>
        header {
            background-color: #5077aa;
            height: 0.85rem;
            /*display: flex;*/
            align-items: center;
            /*justify-content: space-between;*/
            font-size: 0.28rem;
            color: #fff;
            padding-left: 0.23rem;
            padding-right: 0.23rem;
            text-align: center;
            line-height: 0.85rem;
            position: fixed;
            width: 100%;
            z-index: 1;
        }


        .nav{
            font-size: 0.28rem;
            color: #666;
            border-bottom: 0.05rem solid #f2f2f2;
            margin: 0 0.2rem;
            line-height: 0.8rem;
            padding-left: 0.18rem;
        }
        .chunk{
            width: 4px;
            height: 13px;
            background:#7caeff;
            display: inline-block;
            position: relative;
            top: 2px;
            right: 9px;
        }
        .usernav {
            font-size: 0.24rem;
            height: 2rem;
            display: flex;
            align-items: center;
            justify-content: space-around;
            background-color: #fff;
            text-align: center;
        }
        .usernav img{
            width: 0.9rem;
            height: 0.9rem;
            margin:0 auto;
        }
        .usernav div{
            padding-top: 0.15rem;
            color: #666;
        }
        input{
            width: 88%;
            border:1px solid #ccc;
            padding-left: .05rem;
            height: .5rem;
            margin: .1rem 0;
            border-radius: 3px;

        }
        .footer{
            text-align: center;

        }
        .hd{
            height: 0.85rem;
        }
    </style>
    <script type="text/javascript">
        var fs = document.documentElement.clientWidth / 750  * 100;
        document.querySelector("html").style.fontSize = fs + "px";
    </script>
</head>
<body>
<header>
    <%--<i><a href="" style="color: #fff">返回</a></i>--%>
    <span>oa智能办公系统</span>
    <%--<i ></i>--%>
</header>
<div class="hd"></div>
<div class="mui-content" style="background: #ffffff;">
    <p class="nav"><span class="chunk"></span>个人事物</p>
    <div>
        <section class="usernav">
            <a href="/dingdingMicroApp/emailh5">
                <img src="../../img/H5/1.1.png"/>
                <div>电子邮件</div>
            </a>
            <a href="/dingdingMicroApp/noticeh5">
                <img src="../../img/H5/1.2.png"/>
                <div>公告通知</div>
            </a>
            <a href="/dingdingMicroApp/newsh5">
                <img src="../../img/H5/1.3.png"/>
                <div>新闻</div>
            </a>
            <a href="/dingdingMicroApp/calendarh5">
                <img src="../../img/H5/1.4.png"/>
                <div>日程安排</div>
            </a>
        </section>
        <section class="usernav">
            <a href="">
                <img src="../../img/H5/1.5.png"/>
                <div>事物提醒</div>
            </a>
            <a href="">
                <img src="../../img/H5/1.6.png"/>
                <div>个人考勤</div>
            </a>
            <a href="/dingdingMicroApp/diaryIndex">
                <img src="../../img/H5/1.7.png"/>
                <div>工作日志</div>
            </a>
            <a href="">
                <img src="../../img/H5/1.8.png"/>
                <div>工作计划</div>
            </a>
        </section>
        <section class="usernav">
            <a href="">
                <img src="../../img/H5/1.9.png"/>
                <div>通讯簿</div>
            </a>
            <a href="">
                <img src="../../img/H5/1.10.png"/>
                <div>个人文件柜</div>
            </a>
            <div style="width: 2rem;height: 1rem"></div>
            <div></div>
        </section>
    </div>
    <p class="nav"><span class="chunk"></span>工作流</p>
    <div>
        <section class="usernav">
            <a href="/dingdingMicroApp/workflowIndex">
                <img src="../../img/H5/2.1.png"/>
                <div>工作流</div>
            </a>
            <%--<a href="">--%>
                <%--<img src="../../img/H5/2.2.png"/>--%>
                <%--<div>我的工作</div>--%>
            <%--</a>--%>
            <%--<a href="">--%>
                <%--<img src="../../img/H5/2.3.png"/>--%>
                <%--<div>工作查询</div>--%>
            <%--</a>--%>
            <div style="width: 4.7rem;height: 1rem"></div>
        </section>
    </div>
    <p class="nav"><span class="chunk"></span>知识管理</p>
    <div>
        <section class="usernav">
            <a href="">
                <img src="../../img/H5/3.1.png"/>
                <div>公共文件柜</div>
            </a>
            <a href="">
                <img src="../../img/H5/3.2.png"/>
                <div>网络硬盘</div>
            </a>
            <div style="width: 3rem;height: 1rem"></div>
        </section>
    </div>
    <p class="nav"><span class="chunk"></span>资源管理</p>
    <div>
        <section class="usernav">
            <a href="">
                <img src="../../img/H5/4.1.png"/>
                <div>我的会议</div>
            </a>
            <a href="">
                <img src="../../img/H5/4.2.png"/>
                <div>会议申请</div>
            </a>
            <div style="width: 3rem;height: 1rem"></div>
        </section>
    </div>
    <p class="nav"><span class="chunk"></span>资源管理</p>
    <div>
        <section class="usernav">
            <a href="">
                <img src="../../img/H5/5.1.png"/>
                <div>代办发文</div>
            </a>
            <a href="">
                <img src="../../img/H5/5.2.png"/>
                <div>已办发文</div>
            </a>
            <a href="">
                <img src="../../img/H5/5.3.png"/>
                <div>待办收文</div>
            </a>
            <a href="">
                <img src="../../img/H5/5.4.png"/>
                <div>已办收文</div>
            </a>
        </section>
    </div>
</div>
<div class="footer">
    <input id="corpId" type="text" disabled="disabled">
    <input id="corpSecret" type="text" disabled="disabled">
    <input id="result" type="text" disabled="disabled">
    <input id="userName" type="text" disabled="disabled">
    <input id="userPrivName" type="text" disabled="disabled">
    <input id="flag" type="text" disabled="disabled">
</div>


<script>
    var corpId = '<%=corpId%>';
    var corpSecret = '<%=corpSecret%>';
    var oId = <%=oId%>;

    $(function() {

        $("#corpId").val(corpId);
        $("#corpSecret").val(corpSecret);
        dd.ready(function() {
            dd.runtime.permission.requestAuthCode({
                corpId: corpId,
                onSuccess: function(result) {
                    $.ajax({
                        url:'/dingdingManage/dingdingCodeGetUser',
                        type:'POST',
                        data:{
                            corpId:corpId,
                            corpSecret:corpSecret,
                            code:result.code,
                            oId:oId
                        },
                        dataType:'json',
                        success:function (res) {
                            if(res.flag) {
                                $("#flag").val("成功"+res.msg);
                                $("#userName").val(res.data.userName);
                                $("#userPrivName").val(res.data.userPrivName);
                            } else {
                                $("#flag").val("失败"+res.msg);
                            }
                        },
                        error : function(XMLHttpRequest, textStatus, errorThrown) {
                            $("#flag").val(errorThrown);
                        }
                    })

                    $("#result").val(result.code);
                },
                onFail : function(err) {
                    //加一个错误提示
                }

            });
        });
    })
</script>


<%--<script src="js/zepto/zepto.js"></script>--%>
<%--<script src="js/zepto/event.js"></script>--%>
<%--<script src="js/zepto/touch.js"></script>--%>
<%--<script>--%>
    <%--$(function(){--%>
        <%--$("#menu").on("tap",function(){--%>
            <%--console.info("tap");--%>
            <%--$("#mask").toggle();--%>
        <%--})--%>
    <%--})--%>
<%--</script>--%>
</body>
</html>