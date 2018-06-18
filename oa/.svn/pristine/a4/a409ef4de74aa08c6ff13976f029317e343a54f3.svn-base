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
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <!-- word文本编辑器 -->
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <style >
        .bx{
            height: 100%;
        }
        .title{
            padding-left: 20px;
        }
        .head{
            height:45px;
        }
    </style>

</head>
<!DOCTYPE html>
<html>
<body style="height:100%;">
<div class="bx">
    <!--标题栏-->
    <div class="head w clearfix">
        <ul class="index_head">
            <li url="eduManagement">
                <span class="one headli1_1">选修课发布管理</span>
                <img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            <li url="eduElectiveAdd">
                <span class="headli2_1">新建选修课发布</span>
                <img src="../img/twoth.png" alt="" class="headli2_2"/>
            </li>
            <li url="basicCourse">
                <span class="headli1_1" id="ExportSpan_1">选修课基础课表管理</span>
                <img src="../img/twoth.png" alt="" class="headli2_2"/>
            </li>
            <li url="basicCourseAdd">
                <span class="headli1_1" id="ExportSpan_2" >新建选修课基础课表</span>
               <%-- <img src="../img/twoth.png" alt="" class="headli2_2"/>--%>
            </li>
        </ul>
    </div>

    <div class="div_iframe" style="width:100%;height:100%;">
        <iframe id="iframe" class="contract_iframe" src="eduManagement" frameborder="0" width="100%" height="100%"></iframe>
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
    $('#ExportSpan').click(function(){
        layer.msg('<fmt:message code="sup.th.UnderDevelopment" />', {icon: 6});
    });
    /*  $('#ExportSpan_1').click(function(){
     layer.msg('正在开发中', {icon: 6});
     });*/
    /* $('#ExportSpan_2').click(function(){
     layer.msg('正在开发中', {icon: 6});
     });*/
    $('#ExportSpan_3').click(function(){
        layer.msg('<fmt:message code="sup.th.UnderDevelopment" />', {icon: 6});
    });



</script>
</body>
</html>

