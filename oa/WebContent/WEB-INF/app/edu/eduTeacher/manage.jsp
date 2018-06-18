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
    <style type="text/css">
        * {
            font-size: 14px;
        }

        .title {
            margin-top: 20px;
        }

        input {
            width: auto;
        }

        select {
            width: auto;
        }

        .title {
            margin: 10px 0 10px 20px;
        }

        .title span {
            font-size: 18px;
        }

        .grades {
            cursor: pointer;
            font-size: 14px;
            margin-left: 14px;
        }

        .classes {
            cursor: pointer;
            margin-left: 40px;
        }

        .left {
            float: left;
            width: 20%;
            height: 80%;
        }

        .right {
            width: 75%;
            height: 80%;
            float: left;
        }

        .right .table_div {
            width: 95%;
            margin: 40px auto 0 auto;
        }

        .table_div table {

        }

        .collections {
            border-right: 1px solid #d4d4d4;;
        }

        .class_collections li {
            padding: 5px;
        }

        .save_btn {
            width: 60px;
            height: 30px;
            border-radius: 5px;
            cursor: pointer;
        }

        .oper_a {
            color: #00a0e9;
            cursor: pointer;
            margin-left: 10px;
        }

        .class_span {
            display: block;
            padding-left: 14px;
            font-size: 14px;
            height: 40px;
            line-height: 40px;
            border-bottom: #ddd 1px solid;
            cursor: pointer;
            color: #000;
        }

    </style>
</head>
<body style="height:100%">
<div style="height:100%">
    <div class="content" style="height:100%">
        <div class="left">
            <div class="collections">
                <span class="class_span">
                                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_sectorList.png"
                                         style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="部门列表">
                    年级班级</span>
                <ul class="class_collections">

                </ul>
            </div>
        </div>
        <div class="right">
            <div></div>
            <div class="table_div">
                <table>
                    <thead>
                    <tr>
                        <td>学年：</td>
                        <td><select class="q_schoolYear" name="schoolYear"></select></td>
                        <td>学期：</td>
                        <td>
                            <select class="q_term" name="term">
                                <option value="上学期">上学期</option>
                                <option value="下学期">下学期</option>
                            </select>
                        </td>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>


                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var user_id;
    $(function () {
        // 初始化左侧列表
        $.ajax({
            type: "get",
            url: "<%=basePath%>eduDepartment/queryListByDeptId",
            dataType: "json",
            data: {deptId: 2},
            success: function (res) {
                if (res.flag) {
                    var objects = res.obj;
                    var str = "";
                    for (var i = 0; i < objects.length; i++) {
                        str += "<li>" +

                            "<span class='grades' dataid='" + objects[i].deptId + "' > <img src='/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png'  style='vertical-align: middle;width: 15px;margin-right: 10px;margin-left:15px;'>" + objects[i].deptName + "</span>" +
                            "</li>";
                    }
                    $(".class_collections").append(str);
                }
            }
        });

        function getCode(selectItem, codeNo) {
            $.ajax({
                type: "get",
                url: "<%=basePath%>code/GetDropDownBox",
                data: {CodeNos: codeNo},
                dataType: 'JSON',
                success: function (res) {
                    var obj;
                    if (codeNo == "EDU_YEAR_NO") {
                        obj = res.EDU_YEAR_NO;
                    } else if (codeNo == "COURSE_REALM") {
                        obj = res.COURSE_REALM;
                    }
                    var str = "";
                    for (var i = 0; i < obj.length; i++) {
                        if (i != obj.length - 1) {
                            str += "<option value='" + obj[i].codeName + "' codeNO='" + obj[i].codeNo + "'  >" + obj[i].codeName + "</option>";
                        } else {
                            str += "<option selected value='" + obj[i].codeName + "' codeNO='" + obj[i].codeNo + "'  >" + obj[i].codeName + "</option>";
                        }
                    }
                    selectItem.append(str);
                }
            })
        }

        // 初始化学年
        getCode($("select[name='schoolYear']"), "EDU_YEAR_NO");

        // 点击年级
        $('.class_collections').on('click', '.grades', function () {
            var grade_li = $(this).parent();
            if (grade_li.find('ul').length == 0) {
                $.ajax({
                    type: "get",
                    url: "<%=basePath%>eduDepartment/queryListByDeptId",
                    dataType: "json",
                    data: {deptId: $(this).attr("dataid")},
                    success: function (res) {
                        if (res.flag) {
                            var objects = res.obj;
                            var str = "<ul>";
                            for (var i = 0; i < objects.length; i++) {
                                str += "<li class='classes' dataid='" + objects[i].deptId + "' > <img src='/img/sys/dapt_right.png' style='width: 8px;height:14px;margin-top: -3px;margin-right:4px;'>" + objects[i].deptName + "</li>";
                            }
                            str += "</ul>";
                            grade_li.append(str);
                        }
                    }
                });
            } else {
                if (grade_li.find('ul').css("display") == "none") {
                    grade_li.find('ul').css("display", "block");
                } else {
                    grade_li.find('ul').css("display", "none");
                }
            }
            // 获取课程信息
            $.ajax({
                url: "<%=basePath%>eduTeacher/getCourseByGrade",
                type: "get",
                dataType: "json",
                data: {grade: $(this).text()},
                success: function (res) {
                    if (res.flag) {
                        var objects = res.obj;
                        var str = '<tr><td>班主任：</td><td colspan="3"><input teacherType = "班主任" type="text" id="teacherName"/><a class="addUser oper_a">添加</a><a class="clearUser oper_a">清空</a></td></tr>';
                        for (var i = 0; i < objects.length; i++) {
                            str += '<tr><td>' + objects[i].courseName + '：</td><td colspan="3"><input teacherType = "' + objects[i].courseName + '" type="text" id="teacherName' + i + '" /><a class="addUser oper_a">添加</a><a class="clearUser oper_a">清空</a></td></tr>';
                        }
                        str += '<tr><td></td><td colspan="3"><input type="button" class="save_btn" value="保存"></td></tr>';
                        $(".table_div table tbody").html("");
                        $(".table_div table tbody").append(str);
                    }
                }
            })
        });
        // 查询接口
        function queryTeacherMsg(data) {
            $.ajax({
                type: "get",
                url: "<%=basePath%>eduTeacher/getTeacherInfo",
                dataType: "json",
                data: data,
                success: function (res) {
                    if (res.flag) {
                        $(".table_div tbody input").each(function () {
                            if ($(this).attr("type") != "button") {
                                $(this).val("");
                                $(this).attr("user_id", "");
                            }
                        });
                        var objects = res.obj;
                        for (var i = 0; i < objects.length; i++) {
                            var userName = objects[i].userName;
                            var teacherType = objects[i].teacherType;
                            var userId = objects[i].userId;
                            if (teacherType == "班主任") {
                                $(".table_div tbody input[teachertype='班主任']").val(userName);
                                $(".table_div tbody input[teachertype='班主任']").attr("user_id", userId);
                            } else {
                                var course = objects[i].course;
                                $(".table_div tbody input[teachertype='" + course + "']").val(userName);
                                $(".table_div tbody input[teachertype='" + course + "']").attr("user_id", userId);
                            }
                        }
                    }
                }
            });
        }

        // 查询参数
        var data = {};
        // 点击班级
        $('.class_collections').on('click', '.classes', function () {
            data = {
                grade: $(this).parent().prev().text(),
                clazz: $(this).text(),
                schoolYear: $("select[name='schoolYear']").val(),
                term: $("select[name='term']").val()
            };
            queryTeacherMsg(data);
        });

        // 选人控件
        $(".table_div").on("click", ".addUser", function () {
            user_id = $(this).prev().attr("id");
            $.popWindow("../common/selectEduUser");
        });

        // 清空角色信息
        $('.table_div').on("click", ".clearUser", function () {
            $(this).prev().prev().attr("dataid", "");
            $(this).prev().prev().attr("user_id", "");
            $(this).prev().prev().val("");
        });

        $('.q_schoolYear').change(function () {
            data.schoolYear = $(this).val();
            if (data.grade != undefined && data.clazz != undefined && data.term != undefined) {
                queryTeacherMsg(data);
            }
        });

        $('.q_term').change(function () {
            data.term = $(this).val();
            if (data.grade != undefined && data.clazz != undefined && data.term != undefined) {
                queryTeacherMsg(data);
            }
        });

        // 保存方法
        $('.table_div').on('click', '.save_btn', function () {
            var map = {};
            $(".table_div tbody input").each(function () {
                if ($(this).val() != undefined && $(this).attr("teacherType") != undefined && $(this).attr("user_id") != undefined) {
                    map[$(this).attr("teacherType")] = $(this).attr("user_id");
                }
            });
            data.map = map;
            if(data.clazz==''||data.clazz==undefined||data.clazz=="undefined"){
                layer.msg("请选择班级", {icon: 1})
            }else{
                $.ajax({
                    type: "post",
                    url: "<%=basePath%>eduTeacher/save",
                    data: data,
                    dataType: "json",
                    success: function (res) {
                        if (res.flag) {
                            layer.msg("保存成功", {icon: 1})
                        } else {
                            layer.msg("保存失败", {icon: 2})
                        }
                    }
                })
            }
        });

    });
</script>
</body>
</html>
