<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title><fmt:message code="mian.panel" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">

    <link rel="stylesheet" type="text/css" href="../css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="/css/sys/url.css"/>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style>
        html,body{
            height:100%;
        }
        #pa{
            margin-left: 7px;
            margin-top: 12px;
            margin-bottom: 12px;
            line-height: 45px;
            font-size: 22px;
        }
        .headf{
            border-bottom: #999999 1px solid;
        }
        .add_back{
            background-color: #add2f8;
        }
        .one_all{
            height:34px !important;
            line-height:34px;
        }
    </style>
</head>
<body>
<div class="headf" style="position: fixed;top: 0;
    background: #fff;
    width: 100%;">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/contropan.png" style="float: left;margin-top: 10px;margin-left: 2%;">
    <span id="pa">
        <fmt:message code="mian.panel" />
    </span>
</div>

<div class="content" style="margin-top: 46px;">
    <div class="left" style="font-size: 12pt;width:230px">
        <div class="collect">
            <div id="incum" class="divUP">
                <div class="tablediv" id="them">
                    <span class="one_all"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/faceSetting.png" style="vertical-align: middle;width: 18px;margin-right: 10px;" alt="界面设置"><fmt:message code="main.interfaceset" /></span>
                </div>
                <div id="ulist" style="display: block;">
                    <span class="tablespan add_back" id="theme"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/theme.png"  alt="界面主题"><fmt:message code="interfaceSetting.th.InterfaceTopics" /></span>
                    <span class="tablespan" id="address"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/person.png" alt="个人网址"><fmt:message code="url.th.address" /></span>
                    <span class="tablespan" id="desktop"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/desktop.png" alt="桌面设置"><fmt:message code="vote.th.DesktopSettings" /></span>
                </div>
            </div>
            <div  class="divUP">
                <div class="tablediv" id="per">
                    <span class="one_all" id="persion"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/personnalInfo.png"  alt="个人信息"><fmt:message code="userDetails.th.PersonalInformation" /></span>
                </div>
                <div id="personbox" style="display: none;">
                    <span class="tablespan" id="personalinfo"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/information.png" alt="个人资料"><fmt:message code="url.th.personinfor" /></span>
                    <span class="tablespan" id="editUserExt"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/information-2.png" alt="昵称与头像"><fmt:message code="urlth.Nicknames" /></span>
                  <%--  <span class="tablespan" id="editUserExt"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/information-2.png" alt="昵称与头像"><fmt:message code="urlth.Nicknames" /></span>--%>
                </div>
            </div>

            <div  class="divUP">
                <div class="tablediv" id="cou">
                    <span class="one_all" id="securit"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/countSafe.png" alt="账号与安全"><fmt:message code="url.th.security" /></span>
                </div>
                <div id="securitbox" style="display: none;">
                    <span class="tablespan" id="myoa"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/mycount.png" alt="我的OA账户"><fmt:message code="url.th.mycount" /></span>
                    <span class="tablespan" id="updatapwd"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/modifypassword.png" alt="修改OA账户"><fmt:message code="url.th.OAcount" /></span>
                    <span class="tablespan" id="safelog"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/log.png" alt="安全日志"><fmt:message code="url.th.safelog" /></span>
                </div>
            </div>
        </div>
    </div>
    <div class="right">
        <iframe  style="display: block" id="every_module" src="theme" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize"></iframe>
    </div>
</div>
<script>

    function addEventHandler(target,type,fn){
        if(target.addEventListener){
            target.addEventListener(type,fn,false);
        }else{
            target.attachEvent("on"+type,fn,false);
        }
    }
    var  locationReloads=parent.locationReload;

    $('.right').width(document.documentElement.clientWidth-$('.left').width()-4)
    addEventHandler(window,'resize',function () {
        $('.right').width(document.documentElement.clientWidth-$('.left').width()-4)

    })


function urlHref(url) {
    $('.right').find('iframe').attr('src',url)
}

    $(function(){
        $('#them').click(function () {
            $("#ulist").toggle();

        });
        $('#per').click(function () {
            $("#personbox").toggle();

        });
        $('#cou').click(function(){
            $("#securitbox").toggle();
        });
        $('#theme').click(function(){
            $("#every_module").attr('src','theme');

        });
        $('#address').click(function(){
            $("#every_module").attr('src','adressList');
        });
        $('#desktop').click(function(){
            $("#every_module").attr('src','desktop');
        });

        $('#myoa').click(function(){
            $("#every_module").attr('src','count');
        });
        $('#updatapwd').click(function(){
            $("#every_module").attr('src','modifyInfo');
        });


        $('#personalinfo').click(function(){
            $("#every_module").attr('src','personInfor');
        });
        $('#safelog').click(function(){
            $("#every_module").attr('src','safelog');
        });

        $("#editUserExt").click(function(){
            $("#every_module").attr('src','editUserExtPage');
        })


    })



</script>
</body>
</html>

