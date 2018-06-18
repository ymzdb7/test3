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
    <title><fmt:message code="vote.th.Introduction" /></title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css"/>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=basePath%>js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=basePath%>lib/laydate.js"></script>
    <script src="<%=basePath%>lib/pagination/js/jquery.pagination.min.js" type="text/javascript"
            charset="utf-8"></script>
    <script src="<%=basePath%>lib/laydate/laydate.js"></script>
    <script src="<%=basePath%>lib/layer/layer.js"></script>
    <script src="https://cdn.bootcss.com/jquery.form/4.2.1/jquery.form.js"></script>
    <style type="text/css">
        .importHead {
            margin: 10px 0 10px 20px;
        }

        .importHead span {
            font-size: 18px;
            margin: 10px 0 10px 5px;
            color: black;
        }

        .importTable {
            width: 80%;
            margin: 0 auto;
        }

        .importBtn {
            width: 60px;
            height: 30px;
            border-radius: 5px;
            cursor: pointer;
            margin-left: 40%;
        }

        #model{
            color: #00a0e9;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="importHead">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_addrole_06.png" style="margin-left: 30px;margin-bottom: 2px;">
        <span><fmt:message code="vote.th.Introduction" /></span>
    </div>
    <div class="importDiv">
        <form class="form1" name="form1" id="uploadForm" method="post" action="/hr/api/importStaffInfo"
              enctype="multipart/form-data">
            <table class="importTable">
                <tr>
                    <td><fmt:message code="hr.th.DownloadImportTemplates" />：</td>
                    <td><a id="model"><fmt:message code="down.th.1" /></a></td>
                </tr>
                <tr>
                    <td><fmt:message code="hr.th.SelectImportfile" />：</td>
                    <td><input style="width: auto" type="file" name="file"/></td>
                </tr>
                <tr>
                    <td><fmt:message code="roleAuthorization.th.Explain" />：</td>
                    <td><p><fmt:message code="ipmort.th.7" />。</p>
                        <p><fmt:message code="import.th.6" />。</p>
                        <p><fmt:message code="import.th.5" />。</p>
                        <p><fmt:message code="import.th.4" />。</p>
                        <p><fmt:message code="import.th.3" />。</p>
                        <p><fmt:message code="import.th.2" />。</p>
                        <p><fmt:message code="import.th.1" />。</p>

                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input class="importBtn" type="button" value="<fmt:message code="workflow.th.Import" />"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $('#model').click(function () {
            window.location.href = encodeURI("/file/hr/hrStaffInfo.xls");
        });

        $('.importBtn').click(function () {
            var flag = CheckForm();
            if (flag) {
                layer.msg("<fmt:message code="down.th.2" />", {icon: 1});
                $.upload($('#uploadForm'), function (res) {
                    if (res.flag) {

                        layer.msg("<fmt:message code="down.th.3" />" + res.totleNum +"<fmt:message code="event.th.StripData" />!", {icon: 1});
                    } else {
                        layer.msg(res.msg, {icon: 2});
                    }
                });
            }
        });

    })
    function CheckForm() {
        if (document.form1.file.value == "") {
            layer.msg("<fmt:message code="user.th.selectImport" />！", {icon: 2});
            return (false);
        }

        return (true);
    }
</script>
</body>
</html>
