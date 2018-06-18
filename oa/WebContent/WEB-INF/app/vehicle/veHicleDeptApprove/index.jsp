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
    <title>部门审批管理</title>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script src="/js/base/base.js"></script>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style >
        .bx{
            height: 100%;
        }
        .head {
            height: 45px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
        </head>
<!DOCTYPE html>
<html>
<body style="height:100%;">
<div class="bx">
    <!--标题栏-->
    <div class="head w clearfix">
        <ul class="index_head">
            <li url="vehicleDeptpendApply">
                <span class="headli2_1 one"><fmt:message code="event.th.PendingApplication" /></span>
                <img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            <li url="vehicleDeptApproveApply">
                <span class="headli2_1"><fmt:message code="event.th.ApprovedApplication" /></span>
                <img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            <li url="vehicleDeptnotApply">
                <span class="headli1_1" id="ExportSpan_2" ><fmt:message code="event.th.FailingApply" /></span>
            </li>
        </ul>
    </div>

    <div class="div_iframe" style="width:100%;height:100%;">
        <iframe class="contract_iframe" src="vehicleDeptpendApply" frameborder="0" width="100%" height="100%"></iframe>
    </div>
</div>

</div>
<script>

    function Refillings(id) {
        document.getElementById(id).reset();
    };

    $(function () {

        //设置高
        var div_iframe_h=$('.bx').height() - $('.head').height() - 7;
        $('.div_iframe').height(div_iframe_h);
6
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

