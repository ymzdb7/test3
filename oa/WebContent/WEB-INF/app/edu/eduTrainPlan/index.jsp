<%--需把局部样式归并为一个通用或符合公告管理的公共样式，
接口对完需调整--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html style="height:100%;">
<head lang="en">
    <meta charset="UTF-8">
    <title>培训计划</title>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script>
        var lan=$.cookie('language');
        if(lan=='en_US'){
            $('#headLi').css('width','145px!important')
        }else{
            $('#headLi').css('width','90px!important')
        }
    </script>
</head>
<style>
    html, body, .bx {
        width: 100%;
        height: 100%;
    }
    .head{
        height: 45px;
    }
    .head .index_head li span{
        width:183px;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
<div class="bx">
    <!--标题栏-->
    <div class="head w clearfix">
        <ul class="index_head">
            <li url="goManage">
                  <span class="headli2_1 one">
                  <fmt:message code="event.th.TrainingManagement" />
                </span>
                <img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            <li url="goNew">
                <span class="headli2_1">
                <fmt:message code="event.th.New" />
                </span>
                <img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>

            <li url="goQuery">
                <span class="headli3" id="headLi">
                <fmt:message code="event.th.TrainingPlanEnquiry" />
                </span>
              </li>
        </ul>
    </div>

    <div style="width:100%;height:100%;">
        <iframe class="contract_iframe" src="goManage" frameborder="0" width="100%" height="100%"></iframe>
    </div>
</div>

</div>
<script>
    $(function () {
        /*点击标题，获取对应的url，显示对应的src*/
        $('.index_head').on('click', 'li', function () {
            // 设置样式
            $('.index_head span').removeClass("one")
            $(this).children("span").addClass("one");
            // 获取url
            var url = $(this).attr('url');
            $('.contract_iframe').attr('src', url);
        });

    });



</script>
</body>
</html>