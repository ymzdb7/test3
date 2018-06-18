<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<head>
    <title>基础功能 - 钉钉组织架构管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../css/enterpriseManage/weixinqy.css">
    <script type="text/javascript" src="../../js/jquery/jquery.min.js"></script>
</head>
<body>
<div>
    <fieldset>
        <legend><h5>基础功能 - 钉钉组织架构管理</h5></legend>
    </fieldset>

    <div class="func-item">
        <button class="btn btn-small btn-primary"  data-module="list"><i class="icon-home icon-white"></i>钉钉部门管理</button>
    </div>

    <div id="mod-list" class="mod-func well" style="display:block;">
        <iframe class="iframes" src="/dingdingManage/getOrganizationalStructure" frameborder="0"></iframe>
    </div>
    <div id="mod-sync" class="mod-func well">
        <iframe class="iframes" src="dingding_dept_sync.php" frameborder="0"></iframe>
    </div>
</div>
</body>

<script type="text/javascript">
    $(function(){
        $(".func-item button").on("click", function(){
            $(".func-item button").removeClass("btn-primary");
            $(".func-item button i").removeClass("icon-white");
            $(".mod-func").hide();
            var module = $(this).attr("data-module");
            $(this).addClass("btn-primary");
            $(this).find("i").addClass("icon-white");
            $("#mod-" + module).show();
        });
    });
</script>

</html>