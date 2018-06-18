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
    <title><fmt:message code="sms.th.ReminderQuery" /></title>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>

    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

    <style type="text/css">
        .contentTableBody {
            text-align: center;
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

        .contentTableBody tr:nth-child(even) {
            background: #ffffff;
        }

        .title_span {
            font-size: 20px;
        }

        .result_div {
            display: none;
        }

        .queryTable {
            width: 400px;
            margin: 0 auto;
        }

        .queryTable td {
            border-right: 1px solid #c0c0c0;
        }

        input {
            width: auto;
        }

        .commitBtn {
            border: 1px solid #c0c0c0;
            background: #ffffff;
            padding: 1px 6px;
            text-align: center;
            cursor: pointer;
        }

        a{
            cursor: pointer;
        }

        select{
            width: auto;
        }
        .title_span{
            margin-left: 5px;
        }
        .countSpan {
            color: red;
        }
    </style>
</head>
<body>
<div class="query_div">
    <table class="headTable">
        <tr>
            <td style="padding-top: 22px"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/title_query.png" alt=""><span class="title_span"><fmt:message code="sms.th.ReminderQuery" /></span></td>
        </tr>
    </table>
    <table class="queryTable">
        <tr>
            <td>
                <select name="type">
                    <option value="fromIds"><fmt:message code="sup.th.Sender" /></option>
                    <option value="toIds"><fmt:message code="sms.th.Addressee" /></option>
                </select>
            </td>
            <td>
                <textarea id="userIdsText"></textarea>
                <a class="userAdd"><fmt:message code="global.lang.add" /></a> <a class="userClear"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td><fmt:message code="notice.th.type" />：</td>
            <td>
                <select name="smsType">

                </select>
            </td>
        </tr>
        <tr>
            <td><fmt:message code="sms.th.StartDate" />：</td>
            <td><input onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" name="beginDate"/></td>
        </tr>
        <tr>
            <td><fmt:message code="sms.th.ClosingDate" />：</td>
            <td><input onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" name="endDate"/></td>
        </tr>
        <tr>
            <td><fmt:message code="notice.th.content" />：</td>
            <td>
                <textarea name="content"></textarea>
            </td>
        </tr>
        <tr>
            <td><fmt:message code="sms.th.sortField" />：</td>
            <td>
                <select name="orderBy">
                    <option value="sms_type"><fmt:message code="notice.th.type" /></option>
                    <option value="type"><fmt:message code="sms.th.SenderReceiver" /></option>
                    <option value="content"><fmt:message code="notice.th.content" /></option>
                    <option value="send_time" selected><fmt:message code="sup.th.SendingTime" /></option>
                </select>
                <select name="sortType">
                    <option value="desc"><fmt:message code="netdisk.th.desc" /></option>
                    <option value="asc"><fmt:message code="netdisk.th.asc" /></option>
                </select>
            </td>
        </tr>
        <tr>
            <td><fmt:message code="notice.th.operation" />：</td>
            <td>
                <input id="query" type="radio" name="opeType" value="1" checked style="float:none"/>
                <label for="query"><fmt:message code="global.lang.query" /></label>
                <input id="export" type="radio" name="opeType" value="2" style="float:none"/>
                <label for="export"><fmt:message code="global.lang.report" /></label>
            </td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center">
                <button class="commitBtn"><fmt:message code="global.lang.ok" /></button>
            </td>
        </tr>
    </table>
</div>

<div class="result_div">
    <table class="headTable">
        <tr>
            <td><span class="title_span"><fmt:message code="sms.th.QueryResult" /></span>&nbsp;&nbsp;(<fmt:message code="main.th.general" /><span class="countSpan">0</span><fmt:message code="main.th.BarReminder" />)</td>
            <td>
                <div class="M-box3">

                </div>
            </td>
        </tr>
    </table>

    <table class="contentTable">
        <thead>
        <tr>
            <th style="width: 7em;text-align:left;padding-left:10px"><fmt:message code="global.lang.select" /></th>
            <th style="width:10%" class="peopleType"><fmt:message code="sup.th.Sender" /></th>
            <th style="width: 10%"><fmt:message code="notice.th.type"/></th>
            <th style="width: 50%"><fmt:message code="notice.th.content" /></th>
            <th style="width: 20%"><fmt:message code="sup.th.SendingTime" /></th>
            <th style="width: 10%"><fmt:message code="sms.th.remind" /></th>
            <%--<th>操作</th>--%>
        </tr>
        </thead>
        <tbody class="contentTableBody">

        </tbody>
    </table>
</div>


<script type="text/javascript">
    var user_id ;
    $(function () {
        // 查询所有类型
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type:'get',
            dataType:"JSON",
            data : {"CodeNos":"SMS_REMIND"},
            success:function(data){
                var str='<option value=""><fmt:message code="news.th.type" />&nbsp;&nbsp;</option>';
                for (var proId in data){
                    for(var i=0;i<data[proId].length;i++){
                        str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
                    }
                }
                $('select[name="smsType"]').append(str);
            }
        });

        // 选人控件
        $('.userAdd').click(function () {
            user_id='userIdsText';
            $.popWindow("../common/selectUser");
        });

        // 清空
        $('.userClear').click(function(){
            $('#userIdsText').attr("dataid","");
            $('#userIdsText').attr("user_id","");
            $('#userIdsText').val("");
        });
        var pageInfo = {
            page: 1,
            pageSize: 5,
            useFlag: true
        };

        $('.commitBtn').click(function () {
            initPageList(function (pageCount) {
                initPagination(pageCount, pageInfo.pageSize);
            });

        })
        function initPagination(totalData, pageSize) {

            $('.M-box3').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                current: pageInfo.page,
                homePage: '<fmt:message code="global.page.first" />',
                endPage: '<fmt:message code="global.page.last" />',
                prevContent: '<fmt:message code="global.page.pre" />',
                nextContent: '<fmt:message code="global.page.next" />',
                jumpBtn: '<fmt:message code="global.page.jump" />',
                callback: function (index) {

                    pageInfo.page = index.getCurrent();

                    initPageList(function (pageCount) {
                        initPagination(pageCount, pageInfo.pageSize);
                    });
                }
            });
        }
        function  initPageList(cb) {
            var type = $('[name="type"]').val();
            var data = {
                smsType:$('[name="smsType"]').val(),
                beginDate:$('[name="beginDate"]').val(),
                endDate:$('[name="endDate"]').val(),
                content:$('[name="content"]').val(),
                orderBy:$('[name="orderBy"]').val(),
                sortType:$('[name="sortType"]').val(),
                opeType:$('[name="opeType"]:checked').val(),
                page:pageInfo.page,
                pageSize:pageInfo.pageSize,
                useFlag: pageInfo.useFlag
            };
            data[''+type+'']=$('#userIdsText').attr("user_id")==undefined?"":$('#userIdsText').attr("user_id");
            //console.log(data);
            if(data.opeType=="1"){
                $.ajax({
                    type: "get",
                    url: "<%=basePath%>sms/query",
                    dataType: 'JSON',
                    data:data,
                    success: function (res) {

                        if(res.flag){
                            if(res.obj.length==0){
                                parent.layer.msg("<fmt:message code="sms.th.noData" />");
                            }else{
                                $('.contentTableBody').html("");
                                var str = "";
                                if(type=='fromIds'){
                                    for (var i=0;i<res.obj.length;i++){

                                        // 格式化时间
                                        var sendTime = new Date((res.obj[i].sendTime) * 1000).Format('yyyy-MM-dd');
                                        if (res.obj[i].fromName == undefined) {
                                            res.obj[i].fromName = "<fmt:message code="sms.th.UserNotExist" />";
                                        }

                                        str += "<tr><td><input class='checkChild'  type='checkbox' bodyId='" + res.obj[i].bodyId + "' name='check' value=''></td>" +
                                            "<td>" + res.obj[i].fromName + "</td>" +
                                            "<td>"+res.obj[i].smsTypeName+"</td>"+
                                            "<td>" + res.obj[i].content + "</td>" +
                                            "<td>" + sendTime + "</td>" +
                                            "<td>"+function () {
                                                if(res.obj[i].remindFlag==0){
                                                    return "<fmt:message code="global.lang.no" />";
                                                } else{
                                                    return "<fmt:message code="global.lang.yes" />";
                                                }
                                            }()+"</td></tr>";
                                        // "<td><a class='detail_a'  remindUrl='"+res.obj[i].remindUrl+"'  bodyId='" + res.obj[i].bodyId + "' >查看详情</a></td></tr>";
                                    }
                                    $('.contentTableBody').append(str);
                                }else if(type=='toIds'){
                                    $('.contentTableBody').html("");
                                    for (var i=0;i<res.obj.length;i++){

                                        // 格式化时间
                                        var sendTime = new Date((res.obj[i].sendTime) * 1000).Format('yyyy-MM-dd');
                                        if (res.obj[i].toName == undefined) {
                                            res.obj[i].toName = "<fmt:message code="sms.th.UserNotExist" />";
                                        }

                                        str += "<tr><td><input class='checkChild' type='checkbox' bodyId='" + res.obj[i].bodyId + "' name='check' value=''></td>" +
                                            "<td>" + res.obj[i].toName + "</td>" +
                                            "<td>"+res.obj[i].smsTypeName+"</td>"+
                                            "<td>" + res.obj[i].content + "</td>" +
                                            "<td>" + sendTime + "</td>" +
                                            "<td>"+function () {
                                                if(res.obj[i].remindFlag==0){
                                                    return "<fmt:message code="global.lang.no" />";
                                                } else{
                                                    return "<fmt:message code="global.lang.yes" />";
                                                }
                                            }()+"</td></tr>";
                                        // "<td><a class='detail_a'  remindUrl='"+res.obj[i].remindUrl+"'  bodyId='" + res.obj[i].bodyId + "' >查看详情</a></td></tr>";
                                    }
                                    $('.peopleType').html("<fmt:message code="sms.th.Addressee" />");
                                    $('.contentTableBody').append(str);
                                }
                                $('.query_div').css("display","none");
                                $('.result_div').css("display","block");
                                if (res.totleNum != undefined) {
                                    $('.countSpan').html(" " + res.totleNum + " ");
                                }

                                if (cb) {
                                    cb(res.totleNum);
                                }

                                initPagination(res.totleNum, 5);

                            }

                        }else{
                            parent.layer.msg("<fmt:message code="sms.th.QueryError" />",{icon:2});
                        }
                    }
                });
            }else if(data.opeType=="2") {

                window.location.href = '<%=basePath%>sms/query?smsType=' + data.smsType +
                    '&beginDate=' + data.beginDate +
                    '&endDate=' + data.endDate +
                    '&content=' + data.content +
                    '&orderBy=' + data.orderBy +
                    '&sortType=' + data.sortType +
                    '&opeType=' + data.opeType +
                    '&fromIds=' + data.fromIds

            }
        }
    });

</script>
</body>
</html>
