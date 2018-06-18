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
    <title>Title</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css"/>

    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
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

        .importDiv{
            margin-top: 32px;
        }

        .importHead span {
            font-size: 18px;
            margin: 10px 0 10px 20px;
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
    <%--<div class="importHead">
        <span>任课老师导入</span>
    </div>--%>
    <div class="importDiv">
        <form class="form1" name="form1" id="uploadForm" method="post" action="../eduTeacher/importTeacher"
              enctype="multipart/form-data">
            <table class="importTable">
                <tr>
                    <td>下载导入模板：</td>
                    <td><a id="model">任课老师导入模板下载</a></td>
                </tr>
                <tr>
                    <td>选择导入文件：</td>
                    <td><input style="width: auto" type="file" name="file"/></td>
                </tr>
                <tr>
                    <td>说明：</td>
                    <td><p>1、请导入.xls文件或者.xlsx。</p>
                        <p>2、导入文件中，任课老师用户名、姓名不能为空，且必须正确对应。</p>
                        <p>3、导入文件中，年级、班级应为类似“一年级”、“一班” 等实际存在的班级名称。</p>
                        <p>4、导入文件中，学年、学期应为类似“2013-2014”、“上学期” 的形式。</p>
                        <p>5、导入文件中，科目应为<select></select>中的一个。</p>
                        <p>6、导入文件中，教师类型应为任课老师或班主任。</p></td>
                </tr>
                <tr>
                    <td colspan="2"><input class="importBtn" type="button" value="导入"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $('#model').click(function () {
            window.location.href = encodeURI("/file/edu/eduTeacher/import_edu_teacher.xls");
        });

        $('.importBtn').click(function () {
            var flag = CheckForm();
            if (flag) {
                layer.msg("正在导入中，请耐心等候", {icon: 1});
                $.upload($('#uploadForm'), function (res) {
                    if (res.flag) {

                        layer.msg("共导入" + res.totleNum +"条数据!", {icon: 1});
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
