<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <title><fmt:message code="doc.th.RedTemplate"/></title><%--套红模板--%>

    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>

    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>

    <style>
        * {
            margin: 0 auto;
            text-align: center;
        }

        body, html {
            width: 100%;
            height: 100%;
            overflow: hidden;
            font-size: 16px;
            font-family: "Microsoft yahei";
        }

        .template_table {
            margin-top: 35px;
        }

        thead {
            padding: 5px;
        }

        th {
            border: 1px dashed #c0c0c0;
        }

        td {
            border: 1px dashed #c0c0c0;
        }

        .template_content {
            border: 1px;
        }

        .active {
            background-color: #B0E0E6;
        }

        .content {
            width: 98%;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="M-box3">

    </div>
    <table class="template_table">
        <thead>
        <th><fmt:message code="url.th.safeLogNo"/></th>
        <%--序号--%>
        <th><fmt:message code="sms.th.TemplateName"/></th>
        <%--模板名称--%>
        </thead>
        <tbody class="template_content">

        </tbody>
    </table>
</div>
<script type="text/javascript">
    $(function () {
        var data = {
            page: 1,
            pageSize: 10,
            useFlag: true,
            type: "office",
            categoryId: 2,
            ramdomNum: Math.random()
        };

        init(function (pageCount) {
            initPagination(pageCount, data.pageSize);
        });

        function initPagination(totalData, pageSize) {
            $('.M-box3').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                current: data.page,
                homePage: '<fmt:message code="global.page.first" />',
                endPage: '<fmt:message code="global.page.last" />',
                prevContent: '<fmt:message code="global.page.pre" />',
                nextContent: '<fmt:message code="global.page.next" />',
                jumpBtn: '<fmt:message code="global.page.jump" />',
                callback: function (index) {
                    data.page = index.getCurrent();

                    init(function (pageCount) {
                        initPagination(pageCount, data.pageSize);
                    });
                }
            });
        }

        function init(fn) {
            $.ajax({
                url: "<%=basePath%>template/queryTemplateByPriv",
                dataType: "json",
                data: data,
                success: function (res) {
                    if (res.flag) {
                        var str = "";
                        for (var i = 0; i < res.obj.length; i++) {
                            str += "<tr attUrl='" + function () {
                                    if (res.obj[i].attUrl != undefined) {
                                        return res.obj[i].attUrl;
                                    } else {
                                        return "";
                                    }
                                }() + "'>" +
                                "<td>" + res.obj[i].id + "</td>" +
                                "<td>" + res.obj[i].name + "</td>" +
                                "</tr>";
                        }
                        $('.template_content').html(str);
                    }

                    if (fn) {
                        fn(res.totleNum);
                    }

                    initPagination(res.totleNum, 10);
                }
            });
        }

        $('.template_content').on('click', 'tr', function () {
            $(this).siblings().each(function () {
                $(this).removeClass("active");
            });
            $(this).addClass("active");
            var url = $(this).attr("attUrl");
            if (url != undefined && url != '' && url != 'undefined') {
                url = encodeURI(url);
                parent.opener.red_chromatography_url("<%=basePath%>download?" + url);
                window.close();
            } else {
                alert('<fmt:message code="common.th.templateNotFiles" />');
                /*该模板没有上传Word文件！*/
            }

        });

    });

    function GetQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        re = new RegExp("amp;", "g"); //定义正则表达式
        var r = window.location.search.substr(1).replace(re, "").match(reg);  //获取url中"?"符后的字符串并正则匹配
        var context = "";
        if (r != null)
            context = r[2];
        reg = null;
        r = null;
        return context == null || context == "" || context == "undefined" ? "" : context;
    }
</script>
</body>
</html>
