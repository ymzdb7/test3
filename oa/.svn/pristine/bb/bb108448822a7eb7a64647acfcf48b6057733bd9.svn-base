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
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="sms.th.ReceivedReminder" /></title>

    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>

    <style>
        .countSpan {
            color: red;
        }

        .contentTableBody {
            text-align: center;
        }

        .detail_a {
            color: dodgerblue;
            cursor: pointer;
        }

        .bottom_a_style {
            cursor: pointer;
            margin-left: 10px;
            color: #404060;
            display: inline-block;
            padding-left: 22px;
            line-height: 25px;
        }

        .headTable tr {
            border: none;
        }

        table {
            width: 98%;
            margin: 0px 1%;
        }

        .contentTable {
            margin-top: 10px;
        }

        .contentTable thead tr {
            height: 50px;
        }

        label {
            cursor: pointer;
        }

        .contentTableBody tr {
            background: #F6F7F9;
        }

        .contentTableBody tr td{
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }

        .contentTableBody tr:nth-child(even) {
            background: #ffffff;
        }

        .title_span{
            font-size: 20px;
        }

        .bottom_table{
            margin-top: 20px;
        }
        .bottom_table .first_td{
            background-color: #f2f2f2;
            border-right: 1px #dddddd solid;
            width: 80px;
        }
        .bottom_table a {
            cursor: pointer;
            margin-left: 10px;
            color: #404060;
            display: inline-block;
            padding-left: 22px;
            line-height: 25px;
        }
        .delete_a{
            background: url(../../img/sms/icon_affairremind_delete_12.png) no-repeat;
            background-position-y: 5px;
            padding-right: 6px;
        }
        .delete_allRead{
            background: url(../../img/sms/icon_affairremind_delete_12.png) no-repeat;
            background-position-y: 5px;
            padding-right: 6px;
        }
        .delete_all{
            background: url(../../img/sms/icon_affairremind_delete_12.png) no-repeat;
            background-position-y: 5px;
            padding-right: 6px;
        }
        .remind_a{
            background: url(../../img/sms/icon_readmark_12.png) no-repeat;
            background-position-y: 5px;
            padding-right: 4px;
        }
        .remind_all{
            background: url(../../img/sms/icon_readmarkall_12.png) no-repeat;
            background-position-y: 5px;
            padding-right: 4px;
        }
        .title_span{
            margin-left: 5px;
        }

    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>

<table class="headTable">
    <tr>
        <td><img src="/img/commonTheme/${sessionScope.InterfaceModel}/title_received_sms.png" alt=""><span class="title_span"><fmt:message code="sms.th.ReceivedReminder" /></span>&nbsp;&nbsp;(<fmt:message code="main.th.general" /><span class="countSpan">0</span><fmt:message code="main.th.BarReminder" />)</td>
        <td></td>
        <td>
            <div class="M-box3">

            </div>
        </td>
    </tr>
</table>

<table class="contentTable" style="table-layout: fixed" >
    <thead>
    <tr>
        <th style="width: 7em;padding-left:10px"><fmt:message code="global.lang.select" /></th>
        <th style="width: 10%"><fmt:message code="sup.th.Sender" /></th>
        <th style="width: 10%"><fmt:message code="notice.th.type" /></th>
        <th style="width: 50%"><fmt:message code="notice.th.content" /></th>
        <th style="width: 20%"><fmt:message code="sup.th.SendingTime" /></th>
        <th style="width: 10%"><fmt:message code="notice.th.operation" /></th>
    </tr>
    </thead>
    <tbody class="contentTableBody">

    </tbody>
</table>

<table class="bottom_table">
    <tr>
        <td class="first_td"><fmt:message code="news.th.Quickoperation" />：</td>
        <td colspan=""><a class="delete_allRead"><fmt:message code="sms.th.DeleteAll" /></a><a class="delete_all"><fmt:message code="meet.th.DeleteAll" /></a><a class="remind_all"><fmt:message code="sms.th.AllMarkedRead" /></a></td>
    </tr>
</table>

<script type="text/javascript">
    $(function () {


        var data = {
            queryType: 2,
            page: 1,
            pageSize: 5,
            useFlag: true
        };

        initPageList(function (pageCount) {
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

                    initPageList(function (pageCount) {
                        initPagination(pageCount, data.pageSize);
                    });
                }
            });
        }

        function initPageList(cb) {

            $.ajax({
                type: "get",
                url: "<%=basePath%>sms/selectByQueryType",
                dataType: 'JSON',
                data: data,
                success: function (data) {

                    var str = "";

                    for (var i = 0; i < data.obj.length; i++) {
                        // 格式化时间
                        var sendTime = new Date((data.obj[i].sendTime) * 1000).Format('yyyy-MM-dd');
                        if (data.obj[i].fromName == undefined) {
                            data.obj[i].fromName = "<fmt:message code="sms.th.UserNotExist" />";
                        }

                        str += "<tr><td style='width: 3em ' ><input class='checkChild' type='checkbox' bodyId='" + data.obj[i].bodyId + "' name='check' value=''></td>" +
                            "<td style='width: 5em '>" + data.obj[i].fromName + "</td>" +
                            "<td style='width: 4em'>" + data.obj[i].smsTypeName + "</td>" +
                            "<td title='"+ data.obj[i].content +"'>" + data.obj[i].content + "</td>" +
                            "<td style='width:6em'>" + sendTime + "</td>" +
                            "<td><a class='detail_a'  remindUrl='"+data.obj[i].remindUrl+"'  bodyId='" + data.obj[i].bodyId + "' ><fmt:message code="roleAuthorization.th.ViewDetails" /></a></td></tr>";
                    }

                    var last_str = "<tr class='last_str'>" +
                        "<td><input id='checkedAll'  type='checkbox' conid='29' name='check' value=''><label for='checkedAll' style='margin-left: 5px;'><fmt:message code="notice.th.allchose" /></label></td>" +
                        "<td colspan='5' style='text-align: left' class='btnStyle delete_check'><a class='delete_a bottom_a_style' ><fmt:message code="menuSSetting.th.deleteMenu" /></a><a class='remind_a bottom_a_style' ><fmt:message code="sms.th.MarkRead" /></a></td>" +
                        "</tr>";

                    if (data.totleNum != undefined) {
                        $('.countSpan').html(" " + data.totleNum + " ");
                    }
                    $(".contentTableBody").html(str + last_str);

                    if (data.totleNum == 0) {
                        parent.layer.msg("<fmt:message code="sms.th.noData" />");
                    }
                    if (cb) {
                        cb(data.totleNum);
                    }

                    initPagination(data.totleNum, 5);
                }
            })
        }

        //点击全选
        $('.contentTableBody').on('click', '#checkedAll', function () {
            /*alert('111');*/
            var state = $(this).prop("checked");
            if (state == true) {
                $(this).prop("checked", true);
                $(".checkChild").prop("checked", true);
            } else {
                $(this).prop("checked", false);
                $(".checkChild").prop("checked", false);
            }
        });

        // 删除
        $('.contentTableBody').on('click', '.delete_a', function () {
            var bodyIds = '';
            if($('.checkchild:checked').size()==0){
                parent.layer.msg("<fmt:message code="sms.th.SelectLeastOneData" />",{icon:0});
                return;
            }
            $('.checkchild:checked').each(function () {
                bodyIds+=$(this).attr("bodyId")+',';
            });
            $.ajax({
                type: "post",
                url: "<%=basePath%>sms/delete",
                dataType: 'JSON',
                data: {"bodyIds":bodyIds,"deleteFlag":"1",},
                success: function (res) {
                    if(res.flag){
                        parent.layer.msg("<fmt:message code="workflow.th.delsucess" />",{icon:1});
                        initPageList(function (pageCount) {
                            initPagination(pageCount, data.pageSize);
                        });
                    }else{
                        parent.layer.msg("<fmt:message code="lang.th.deleSucess" />",{icon:2});
                    }
                }
            })
        });

        // 全部删除
        $('.delete_all').click(function () {
            parent.layer.confirm('<fmt:message code="workflow.th.que" />',{title:'<fmt:message code="information" />',
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'] //按钮
            }, function(){
                $.ajax({
                    type: "post",
                    url: "<%=basePath%>sms/delete",
                    dataType: 'JSON',
                    data: {"deleteFlag":"1",},
                    success: function (res) {
                        if(res.flag){
                            parent.layer.msg("<fmt:message code="workflow.th.delsucess" />",{icon:1});
                            initPageList(function (pageCount) {
                                initPagination(pageCount, data.pageSize);
                            });
                        }else{
                            parent.layer.msg("<fmt:message code="lang.th.deleSucess" />",{icon:2});
                        }
                    }
                })
            });
        });

        // 标记为已读
        $('.contentTableBody').on('click', '.remind_a', function () {
            var bodyIds = '';
            if($('.checkchild:checked').size()==0){
                parent.layer.msg("<fmt:message code="sms.th.SelectLeastOneData" />",{icon:0});
                return;
            }
            $('.checkchild:checked').each(function () {
                bodyIds+=$(this).attr("bodyId")+',';
            });
            $.ajax({
                type: "post",
                url: "<%=basePath%>sms/updateRemind",
                dataType: 'JSON',
                data: {"bodyIds":bodyIds,"remindFlag":"0",},
                success: function (res) {
                    if(res.flag){
                        parent.layer.msg("<fmt:message code="sms.th.MarkSuccess" />",{icon:1});
                        initPageList(function (pageCount) {
                            initPagination(pageCount, data.pageSize);
                        });
                    }else{
                        parent.layer.msg("<fmt:message code="sms.th.FlagFailure" />",{icon:2});
                    }
                }
            })
        });

        // 全部标记为已读
        $('.remind_all').click(function () {
            $.ajax({
                type: "post",
                url: "<%=basePath%>sms/updateRemind",
                dataType: 'JSON',
                data: {"remindFlag":"0",},
                success: function (res) {
                    if(res.flag){
                        parent.layer.msg("<fmt:message code="sms.th.MarkSuccess" />",{icon:1});
                        initPageList(function (pageCount) {
                            initPagination(pageCount, data.pageSize);
                        });
                    }else{
                        parent.layer.msg("<fmt:message code="sms.th.FlagFailure" />",{icon:2});
                    }
                }
            })
        });

        // 详情点击事件
        $('.contentTableBody').on('click', '.detail_a', function () {
            var remindUrl = $(this).attr("remindUrl");
            var bodyId = $(this).attr("bodyId");

        });

        // 删除所有已读
        $('.delete_allRead').click(function () {
            parent.layer.confirm("<fmt:message code="workflow.th.que" />",{title:'<fmt:message code="information" />',
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'] //按钮
            }, function(){
                $.ajax({
                    type: "post",
                    url: "<%=basePath%>sms/deleteByRemind",
                    dataType: 'JSON',
                    data:{"deleteType":"1"},
                    success: function (res) {
                        if(res.flag){
                            parent.layer.msg("<fmt:message code="workflow.th.delsucess" />",{icon:1});
                            initPageList(function (pageCount) {
                                initPagination(pageCount, data.pageSize);
                            });
                        }else{
                            parent.layer.msg("<fmt:message code="lang.th.deleSucess" />",{icon:2});
                        }
                    }
                })
            });
        });

        // 详情点击事件
        $('.contentTableBody').on('click', '.detail_a', function () {
            var remindUrl = $(this).attr("remindUrl");
            var bodyId = $(this).attr("bodyId");
            $.ajax({
                type: "post",
                url: "<%=basePath%>sms/setRead",
                dataType: 'JSON',
                data: {"bodyId":bodyId},
                success: function (res) {
                }
            })
            window.open('<%=basePath%>'+remindUrl);
        });

    });

    function kaifa() {
        parent.layer.msg("<fmt:message code="sup.th.UnderDevelopment" />", {icon: 1});
    }
</script>
</body>
</html>
