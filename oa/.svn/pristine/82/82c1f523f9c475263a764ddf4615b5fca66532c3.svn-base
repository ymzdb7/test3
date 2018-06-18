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
    <style>

        .content {
            margin-top: 32px;
        }

        .resultDiv {
            display: none;
        }

        .oper_a {
            color: #3eb1f0;
            text-decoration: none;
            cursor: pointer;
        }

        input {
            width: auto;
        }

        select {
            width: auto;
        }

        .queryHead {
            margin: 10px 0 10px 20px;
        }

        .queryTable {
            width: 80%;
            margin: 0 auto;
        }

        .queryTable a {
            cursor: pointer;
            color: #3eb1f0;
            margin-left: 5px;
        }

        .operBtnTd {
            padding-left: 40%;
        }

        .operBtnTd input {
            width: 60px;
            height: 30px;
            border-radius: 5px;
            cursor: pointer;
        }

        .resultHead {
            margin: 10px 0 10px 20px;
        }

        .resultHead span {
            font-size: 18px;
        }

        .resultTable {
            width: 98%;
            margin: 0 auto;
        }

        .resultTableBody {
            text-align: center;
        }

        .edit_a {
            margin: 0 8px;
        }

        .back_div {
            margin-top: 20px;
            padding-left: 40%;
        }

        .back_a {
            width: 60px;
            height: 30px;
            border-radius: 5px;
            cursor: pointer;
        }

        label {
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="queryDiv">
        <%--<div class="queryHead">
            <span style="font-size: 18px">任课老师查询</span>
        </div>--%>
        <table class="queryTable">
            <tr>
                <td>教师：</td>
                <td><input type="text" name="userId" id="teacherUserId"/><a class="addUser">添加</a><a class="clearUser">清空</a>
                </td>
            </tr>
            <tr>
                <td>教师类型：</td>
                <td><select name="teacherType">
                    <option value="">请选择教师类型</option>
                    <option value="班主任">班主任</option>
                    <option value="任课教师">任课教师</option>
                </select></td>
            </tr>
            <tr>
                <td>年级：</td>
                <td><select name="grade">
                    <option value="" class="firstGrade">请选择年级</option>
                </select></td>
            </tr>
            <tr>
                <td>班级：</td>
                <td><select name="clazz">
                    <option value="">请选择班级</option>
                </select>
                    <span>提示:需要先选择年级才有班级信息</span>
                </td>
            </tr>
            <tr>
                <td>学年（度）：</td>
                <td><select name="schoolYear">
                    <option value="">请选择学年（度）</option>
                </select></td>
            </tr>
            <tr>
                <td>学期：</td>
                <td><select name="term">
                    <option value="">请选择学期</option>
                    <option value="上学期">上学期</option>
                    <option value="下学期">下学期</option>
                </select></td>
            </tr>
            <tr>
                <td>科目：</td>
                <td><select name="course">
                    <option value="">请选择科目</option>
                    <option value="语文">语文</option>
                    <option value="数学">数学</option>
                    <option value="英语">英语</option>
                </select></td>
            </tr>
            <tr>
                <td colspan="2" class="operBtnTd">
                    <input type="button" class="queryBtn" value="查询">
                    <input style="margin-left: 5%;" type="button" class="exportBtn" value="导出">
                </td>
            </tr>
        </table>
    </div>
    <div class="resultDiv">
        <%--<div class="resultHead">
            <span>管理任课老师</span>
        </div>--%>
        <div class="M-box3">

        </div>
        <table class="resultTable">
            <thead>
            <tr>
                <th>选择</th>
                <th>年级</th>
                <th>班级</th>
                <th>学年（度）</th>
                <th>学期</th>
                <th>科目</th>
                <th>教师类型</th>
                <th>教师姓名</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody class="resultTableBody">

            </tbody>
        </table>
        <div class="back_div">
            <input type="button" class="back_a" value="返回"/>
        </div>
    </div>
</div>


<script type="text/javascript">
    var user_id;
    $(function () {
        // 初始化选人控件
        $(".addUser").on("click", function () {
            user_id = "teacherUserId";
            $.popWindow("../common/selectEduUser");
        });
        // 清空用户信息
        $('.clearUser').click(function () {
            $('#teacherUserId').attr("dataid", "");
            $('#teacherUserId').attr("user_id", "");
            $('#teacherUserId').val("");
        });
        // 初始化部门
        function initDept(selectItem, parentDeptId, selectedItem, fn) {
            $.ajax({
                type: "get",
                url: "<%=basePath%>eduDepartment/queryListByDeptId",
                data: {deptId: parentDeptId},
                dataType: 'JSON',
                success: function (res) {
                    if (res.flag) {
                        var classes = res.obj;
                        var str = "";
                        for (var i = 0; i < classes.length; i++) {
                            str += "<option class='options' value='" + classes[i].deptName + "' deptid='" + classes[i].deptId + "'  >" + classes[i].deptName + "</option>";
                        }
                        selectItem.find(".options").remove();
                        selectItem.append(str);
                        if (selectedItem != null && selectedItem != undefined && selectedItem != '') {
                            selectItem.val(selectedItem);
                            var classText = selectItem.attr("class");
                            var gradeId = $("." + classText + " [value='" + selectedItem + "']").attr("deptid");
                            if (fn != undefined) {
                                fn(gradeId)
                            }

                        }
                    }
                }
            });
        }

        initDept($("select[name='grade']"), 2);

        $("select[name='grade']").change(function () {
            var value = $("select[name='grade']").val();
            if (value != null && value != undefined && value != '') {
                var deptId = $("select[name='grade'] option[value='" + value + "']").attr("deptid")
                initDept($("select[name='clazz']"), deptId);
            }
        });

        // 初始化学期和科目
        function getCode(selectItem, codeNo, selectedItem) {
            $.ajax({
                type: "get",
                url: "<%=basePath%>code/GetDropDownBox",
                data: {CodeNos: codeNo},
                dataType: 'JSON',
                success: function (res) {
                    var obj;
                    var str = "";
                    if (codeNo == "EDU_YEAR_NO") {
                        obj = res.EDU_YEAR_NO;
                    } else if (codeNo == "COURSE_REALM") {
                        obj = res.COURSE_REALM;
                        str = "<option value='' ></option>";
                    }
                    for (var i = 0; i < obj.length; i++) {
                        str += "<option value='" + obj[i].codeName + "' codeNO='" + obj[i].codeNo + "'  >" + obj[i].codeName + "</option>";
                    }
                    selectItem.append(str);
                    if (selectedItem != null && selectedItem != undefined && selectedItem != '') {
                        selectItem.val(selectedItem)
                    }
                }
            })
        }

        // 获取学年
        getCode($("select[name='schoolYear']"), "EDU_YEAR_NO");
        // 获取科目
        getCode($("select[name='course']"), "COURSE_REALM");

        var data = {
            queryType: 2,
            page: 1,
            pageSize: 5,
            useFlag: true
        };

        function initData() {
            var userIdValue = $('input[name="userId"]').attr("user_id")
            if (userIdValue != undefined && userIdValue != '' && userIdValue != 'undefined') {
                userIdValue.replace(/,/g, '');
            } else {
                userIdValue = "";
            }
            data.userId = userIdValue;
            data.teacherType = $('select[name="teacherType"]').val();
            data.grade = $('select[name="grade"]').val();
            data.clazz = $('select[name="clazz"]').val();
            data.schoolYear = $('select[name="schoolYear"]').val();
            data.term = $('select[name="term"]').val();
            data.course = $('select[name="course"]').val();
        }

        // 查询按钮点击
        $('.queryBtn').click(function () {
            initData();
            data.queryType = "1";
            initPageList(function (pageCount) {
                initPagination(pageCount, data.pageSize);
            });
        });

        // 查询并导出
        $('.exportBtn').click(function () {
            initData();
            data.queryType = "2";
            var url = '<%=basePath%>eduTeacher/queryAndExport?queryType=' + data.queryType +
                '&userId=' + data.userId +
                '&teacherType=' + data.teacherType +
                '&grade=' + data.grade +
                '&clazz=' + data.clazz +
                '&schoolYear=' + data.schoolYear +
                '&term=' + data.term +
                '&course=' + data.course;
            url = encodeURI(url);
            window.location.href = url;
        });

        // 分页
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

                    initPageList(function (pageCount) {
                        initPagination(pageCount, data.pageSize);
                    });
                }
            });
        }

        // 查询数据
        function initPageList(cb) {
            $.ajax({
                type: "get",
                url: "<%=basePath%>eduTeacher/queryAndExport",
                dataType: 'JSON',
                data: data,
                success: function (data) {
                    var str = "";
                    for (var i = 0; i < data.obj.length; i++) {
                        str += "<tr><td ><input class='checkChild' type='checkbox' dataid='" + data.obj[i].id + "' name='check' value=''></td>" +
                            "<td>" + data.obj[i].grade + "</td>" +
                            "<td>" + data.obj[i].clazz + "</td>" +
                            "<td>" + data.obj[i].schoolYear + "</td>" +
                            "<td>" + data.obj[i].term + "</td>" +
                            "<td>" + data.obj[i].course + "</td>" +
                            "<td>" + data.obj[i].teacherType + "</td>" +
                            "<td>" + data.obj[i].userName + "</td>" +
                            "<td>" +
                            "<a class='detail_a oper_a'  dataId='" + data.obj[i].id + "' >查看详情</a>" +
                            "<a class='edit_a oper_a'    dataId='" + data.obj[i].id + "' >修改</a>" +
                            "<a class='delete_a oper_a'  dataId='" + data.obj[i].id + "' >删除</a>" +
                            "</td></tr>";
                    }

                    var last_str = "<tr class='last_str'>" +
                        "<td><input id='checkedAll'  type='checkbox' conid='29' name='check' value=''><label for='checkedAll'><fmt:message code="notice.th.allchose" /></label></td>" +
                        "<td colspan='8' style='text-align: left' class='btnStyle delete_check'></td>" +
                        "</tr>";


                    $(".resultTableBody").html(str + last_str);

                    if (data.totleNum == 0) {
                        parent.layer.msg("<fmt:message code="sms.th.noData" />");
                    }
                    if (cb) {
                        cb(data.totleNum);
                    }

                    $('.resultDiv').css("display", "block")
                    $('.queryDiv').css("display", "none");

                    initPagination(data.totleNum, 5);
                }
            })
        }

        //点击全选
        $('.resultTableBody').on('click', '#checkedAll', function () {
            var state = $(this).prop("checked");
            if (state == true) {
                $(this).prop("checked", true);
                $(".checkChild").prop("checked", true);
            } else {
                $(this).prop("checked", false);
                $(".checkChild").prop("checked", false);
            }
        });

        // 点击返回
        $(".back_a").click(function () {
            $('.resultDiv').css("display", "none")
            $('.queryDiv').css("display", "block");
        });

        // 详情
        $('.resultTableBody').on('click', '.detail_a', function () {
            var id = $('.detail_a').attr("dataid");
            // 根据id获取信息
            $.ajax({
                type: "get",
                url: "<%=basePath%>eduTeacher/getEduTeacherById",
                dataType: 'JSON',
                data: {id: id},
                success: function (res) {
                    if (res.flag) {
                        layer.open({
                            title: "任课老师详情",
                            type: 1,
                            skin: 'layui-layer-rim', //加上边框
                            area: ['600px', '400px'], //宽高
                            content: '<table style="width: 80%;margin-top: 10px" align="center">' +
                            '<tr><td nowrap > 年级：</td>' +
                            '<td >' + res.object.grade + '</td></tr>' +
                            '<tr><td nowrap > 班级：</td>' +
                            '<td >' + res.object.clazz + '</td></tr>' +
                            '<tr><td nowrap > 学年（度）：</td>' +
                            '<td >' + res.object.schoolYear + '</td></tr>' +
                            '<tr><td nowrap > 学期：</td>' +
                            '<td >' + res.object.term + '</td></tr>' +
                            '<tr><td nowrap > 科目：</td>' +
                            '<td >' + res.object.course + '</td></tr>' +
                            '<tr><td nowrap > 教师用户名：</td>' +
                            '<td >' + res.object.userId + '</td></tr>' +
                            '<tr><td nowrap > 教师类型：</td>' +
                            '<td >' + res.object.teacherType + '</td></tr>' +
                            '<tr><td nowrap > 教师姓名：</td>' +
                            '<td >' + res.object.userName + '</td></tr>' +
                            /*'<tr  id="attachment2">'+
                             '<td nowrap align="center">附件文档：</td>'+
                             '<td nowrap></td>'+
                             '</tr>*/'</table>'
                        });

                    }
                }
            });
        });

        // 编辑
        $('.resultTableBody').on('click', '.edit_a', function () {
            var id = $(this).attr("dataid");
            // 根据id获取信息
            $.ajax({
                type: "get",
                url: "<%=basePath%>eduTeacher/getEduTeacherById",
                dataType: 'JSON',
                data: {id: id},
                success: function (res) {
                    if (res.flag) {
                        var object = res.object;
                        layer.open({
                            type: 1,
                            skin: 'layui-layer-rim', //加上边框
                            area: ['600px', '450px'], //宽高
                            content: '<table style="width: 80%;margin-top: 10px" align="center">' +
                            '<tr><td nowrap > 年级：</td>' +
                            '<td >' + '<select class="edit_grade" name="grade"></select>' + '</td></tr>' +
                            '<tr><td nowrap > 班级：</td>' +
                            '<td >' + '<select class="edit_clazz" name="clazz"></select>' + '</td></tr>' +
                            '<tr><td nowrap > 学年（度）：</td>' +
                            '<td >' + '<select class="edit_schoolYear"  name="schoolYear"></select>' + '</td></tr>' +
                            '<tr><td nowrap > 学期：</td>' +
                            '<td >' + '<select class="edit_term"  name="term"><option value="上学期">上学期</option><option value="下学期">下学期</option></select>' + '</td></tr>' +
                            '<tr><td nowrap > 科目：</td>' +
                            '<td >' + '<select class="edit_course"  name="course"></select>' + '</td></tr>' +
                            '<tr><td nowrap > 教师类型：</td>' +
                            '<td ><select class="edit_teacherType"  name="teacherType"><option value="班主任">班主任</option><option value="任课老师">任课老师</option></select> ' +
                            '</td></tr>' +
                            '<tr><td nowrap > 教师姓名：</td>' +
                            '<td >' + '<input id="edit_user_input" class="edit_userName"  name="userName" /> <a class="addUser_e oper_a">添加</a><a style="margin-left: 5px" class="clearUser_e oper_a">清空</a>' + '</td></tr>' +
                            '</table>',
                            btn: ['保存', '取消'],
                            success: function (index) {
                                // 初始化选人控件
                                $(".addUser_e").on("click", function () {
                                    user_id = "edit_user_input";
                                    $.popWindow("../common/selectEduUser");
                                });
                                // 清空用户信息
                                $('.clearUser_e').click(function () {
                                    $('#edit_user_input').attr("dataid", "");
                                    $('#edit_user_input').attr("user_id", "");
                                    $('#edit_user_input').val("");
                                });

                                // 初始化年级和班级
                                function initGradeClass(grade, clazz) {
                                    // 初始化年级
                                    initDept($('.edit_grade'), 2, grade, function (gradeId) {
                                        initDept($(".edit_clazz"), gradeId, clazz)
                                    })
                                }

                                // 使用when函数来确定初始化方法已经执行完毕
                                $.when(
                                    // 获取学年
                                    getCode($('.edit_schoolYear'), "EDU_YEAR_NO", object.schoolYear),
                                    // 获取科目
                                    getCode($('.edit_course'), "COURSE_REALM", object.course),
                                    // 获取基础年级班级
                                    initGradeClass(object.grade, object.clazz)
                                ).done(function () {
                                    // 回显数据
                                    $('.edit_term ').val(object.term);
                                    $('.edit_teacherType').val(object.teacherType);
                                    $('.edit_userName').val(object.userName);
                                    $('.edit_userName').attr('thisdataid', object.id);
                                    $('.edit_userName').attr("user_id",object.userId);
                                });

                                // 修改年级后查询班级方法
                                $("select[name='grade']").change(function () {
                                    var value = $(".edit_grade").val();
                                    if (value != null && value != undefined && value != '') {
                                        var deptId = $(".edit_grade option[value='" + value + "']").attr("deptid")
                                        initDept($(".edit_clazz"), deptId);
                                    }
                                });


                            },
                            yes: function (index) {
                                var data = {
                                    userName: $('.edit_userName').val(),
                                    teacherType: $('.edit_teacherType').val(),
                                    grade: $('.edit_grade').val(),
                                    clazz: $('.edit_clazz').val(),
                                    schoolYear: $('.edit_schoolYear').val(),
                                    term: $('.edit_term').val(),
                                    course: $('.edit_course').val(),
                                    id: $('.edit_userName').attr('thisdataid'),
                                    classId: $('.edit_clazz').find("option:selected").attr("deptid"),
                                    userId:$('.edit_userName').attr("user_id")
                                };

                                $.ajax({
                                    url: "<%=basePath%>eduTeacher/update",
                                    type: 'post',
                                    dataType: 'json',
                                    data: data,
                                    success: function (json) {
                                        if (json.flag) {
                                            $.layerMsg({content: '保存成功', icon: 1}, function () {
                                                ajaxdata()
                                            })
                                        } else {
                                            $.layerMsg({content: json.msg, icon: 2})
                                        }
                                    }
                                });

                            }
                        })
                    }
                }
            });
        });

        // 删除
        $('.resultTableBody').on('click', '.delete_a', function () {
            var id = $('.delete_a').attr("dataid");
            $.ajax({
                type: "post",
                url: "<%=basePath%>eduTeacher/deleteByIds",
                dataType: 'JSON',
                data: {ids: id},
                success: function (res) {
                    if (res.flag) {
                        layer.msg("删除成功", {icon: 1});
                        initPageList(function (pageCount) {
                            initPagination(pageCount, data.pageSize);
                        });
                    } else {
                        layer.msg("删除失败", {icon: 2});
                    }
                }
            });
        });


    });
</script>
</body>
</html>
