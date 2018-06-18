<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">

    <title>个人合同</title>
    <link rel="stylesheet" type="text/css" href="/css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="/css/base.css"/>
    <script type="text/javascript" src="/js/news/jquery-1.9.1.js"></script>
    <script src="/js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>--%>

    <style>


        body{
            font-size: 15px;
            font-family: 微软雅黑;
        }

        .TableBlock .TableData td, .TableBlock td.TableData {
            background: #FFFFFF;
            border-bottom: none;
            border-right: none;
            padding: 3px;
        }

        input[type="radio"]{
            float: none;
        }

        .btn_ .btn_style {
            background: url("../../img/save.png") no-repeat;
        }
        #rs {
            display: inline-block;
            float: left;
            width: 66px;
            height: 30px;
            text-align: center;
            margin-top: 10px;
            margin-left: 20px;
            margin-bottom: 20px;
            padding-left: 23px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
            background: url("../../img/publish.png") no-repeat;
            margin-left: 40%;
        }
        .TableData{
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        .TableBlock tbody tr{
            height: 52px;
        }
        .TableBlock tbody tr td{
            border: 1px solid #c0c0c0;
        }

        .TableBlock tr td:first-of-type,table tr td:nth-child(3){
            /*  text-align: right;*/
            width: 13%;
        }


        #cont_total td {
            color: #000;
            font-weight: normal;
        }

        .notice_do {
            width: 168px;
        }

        input {
            width: auto;
        }

        select {
            width: auto;
        }

        table {
            table-layout: fixed;
        }

        #tr_td tr td.publishtip {
            overflow: hidden;
            text-overflow: ellipsis;
            height: 40px;
            width: 40px;
            white-space: nowrap;
        }



        .news_t h1, .news_two h1 {
            line-height: 23px;
            text-align: center;
        }



        .add_print h1, .add_down h1 {
            color: #000;
            line-height: 20px;
            text-align: center;
        }

        .add_show, .textTop {
            float: left;
        }


        .title a {
            color: #59b7fb;
        }





        .caozuo a:hover {
            color: #287fe0;
        }

        .notice_geshi {
            display: block;
            margin-top: -46px;
            margin-left: 79px;
        }


        /*修改的字体*/
        .notice_change {
            color: #1772c0;
            margin-left: 5px;
        }

        .notice_change:hover {
            color: #287fe0 !important;
        }

        /*删除的字体*/
        .notice_delete {
            color: #e01919;
            margin-left: 5px;
        }

        .notice_delete:hover {
            color: #C81623 !important;
        }

        .notice_zhongzhi {
            color: #1772c0;
            margin-left: 5px;
        }

        .center .login .icons div {
            margin-left: 9px !important;
        }

        .icons div {
            display: inline-block;
            float: left;
            height: 30px;
            line-height: 30px;
            width: 56px;
            text-align: center;
            margin-right: 15px;
            /*        background: url(../../img/gobbing.png) no-repeat;*/
            cursor: pointer;
            padding-left: 20px;
        }

        .icons h2 {
            text-align: center;
            width: 71%;
        }

        table tr td input[type="radio"] {
            height: 25px;
            border: #ccc 1px solid;
            padding-left: 5px;
        }

        input[type="submit"] {
            height: 28px;
            line-height: 22px;
            border: 1px solid #c0c0c0;
        }

        /*.last_str{
            cursor: pointer;
        }*/
        .bgcolor {
            background: #c5e9fb !important;
            color: #000000;
        }




        .orgAdd {
            color: rgb(32, 123, 214);
            padding-left: 12px;
            background: url(../../img/org_select.png) 0px 0px no-repeat;
            background-position: 0px 0px;
            cursor: pointer;
        }

        .orgClear {
            color: rgb(154, 169, 184);
            padding-left: 12px;
            margin-left: 5px;
            background: url(../../img/org_select.png) 0px -60px no-repeat;
            background-position: 0px -60px;
            cursor: pointer;
        }

        .navigation {
            display: inline-block;
            float: left;
            width: 96% !important;
            margin-left: 2%;
        }



        .th {
            cursor: pointer;
        }

        .con_edit {
            width: 90%;
            /*border: 1px solid #000;*/
            margin: 10px auto;
        }

        .delete_check {
            text-align: center;
            cursor: pointer;
        }
        .deleteok{
            background: url(/img/btn_deleteannounce.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 90px;
            height: 28px;
            line-height: 25px;
            padding-left: 20px;
        }
        .delete_ok1{
            margin-top: 30px;
        }
    </style>
</head>
<body style="background:no-repeat;">
<div>
    <div class="bx" style="margin-right:22px">


        <!--表单选项显示-->
        <div class="step1" style="margin-left:1.5%;display: none">
            <div class="navigation  clearfix" style="margin-left: 22px;">
                <div class="left" style="margin-left: -22px;">
                    <img src="/img/contractManage.png">
                    <div class="news">
                        个人合同
                    </div>
                </div>

                <!-- 分页按钮-->
                <div class="right">
                    <div class="M-box3"></div>
                </div>
            </div>

            <!--table表单  标题栏 -->
            <div>
                <div>
                    <table id="tr_td">
                        <thead>
                        <tr>
                            <%--<td class="th"><fmt:message code="notice.th.chose"/></td>--%>
                            <%--<td class="th" style="width:6%;"><fmt:message code="global.lang.select" /></td>--%>
                            <td class="th" style="width:8%;" ><fmt:message code="userDetails.th.name" /></td>
                            <td class="th" style="width:8%;"><fmt:message code="hr.th.department" /></td>
                            <td class="th" style="width:8%;"><fmt:message code="hr.th.post" /></td>
                            <td class="th" style="width:8%;"><fmt:message code="hr.th.typeContract" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.SignCompany" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.ContractCommencementDate" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.TrialExpirationDate" /></td>
                            <td class="th" style="width:10%;"><fmt:message code="hr.th.ContractMaturityDate" /></td>
                            <td class="th notice_do" style="width:12%;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
                        </tr>
                        </thead>
                        <tbody id="j_tb"></tbody>
                    </table>
                </div>
            </div>
        </div>

        <div class="tishi" style="height: 100%;text-align: center;border: none;display: none">
            <div style="width:100%;padding-top:15%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
            <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;">无合同信息记录</h2>
        </div>



    </div>


    <!--content部分结束-->


    <!--footer部分结束-->
</div>
</body>
<script>
    function Refillings(id) {
        document.getElementById(id).reset();
    };
    user_id = '';





    $(function () {
        getContractInfo();
        function getContractInfo() {

            $.ajax({
                type: "get",
                url: "<%=basePath%>/hr/contract/getContractInfoByStaffName",
                dataType: 'JSON',
                success: function (data) {
                    if(data.obj.length == 0){
                        $('.step1').css("display","none");
                        $('.tishi').css("display","block");
                    }else{
                        $('.step1').css("display","block");
                        $('.tishi').css("display","none");
                        var news = "";
                        for (var i = 0; i < data.obj.length; i++) {
                            news += "<tr id='notice_tr' notifyId=" + data.obj[i].contractId + ">" +
//                                "<td style='width: 5%;'><input class='checkChild' style='margin-left: 5px;' type='checkbox' conid='" + data.obj[i].contractId + "' name='check' value=''></td>" +
                                "<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                    if (data.obj[i].userName == undefined || data.obj[i].userName == "") {
                                        return "<fmt:message code="hr.th.UserNotExist" />"
                                    } else {
                                        return data.obj[i].userName
                                    }
                                }() + "</td>" +
                                "<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->' >" + function () {
                                    if (data.obj[i].deptName == undefined || data.obj[i].deptName == "") {
                                        return "<fmt:message code="hr.th.DepartmentNotExists" />"
                                    } else {
                                        return data.obj[i].deptName
                                    }
                                }() + "</td>" +
                                "<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='publishtip' >" + data.obj[i].postName + "</td>" +
                                "<td style='width: 8%;' class='title' notifyId=" + data.obj[i].contractId + ">" + function () {
                                    if (data.obj[i].contractTypeName == undefined) {
                                        return "<fmt:message code="hr.th.ContractTypeNotExist" />"
                                    } else {
                                        return data.obj[i].contractTypeName
                                    }
                                }() + "</td>" +
                                "<td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + data.obj[i].contractEnterpriesName + " class='' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                    if (data.obj[i].contractEnterpriesName == undefined) {
                                        return "<fmt:message code="hr.th.companyNotExist" />"
                                    } else {
                                        return data.obj[i].contractEnterpriesName
                                    }
                                }() + "</td>" +
                                "<td style='width: 10%;' class='start_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function(){
                                    if(data.obj[i].probationEffectiveDate==undefined){
                                        return ""
                                    }else{
                                        return data.obj[i].probationEffectiveDate;
                                    }
                                }() + "</td>" +
                                "<td style='width: 10%;' class='end_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                    if (data.obj[i].trailOverTime == undefined) {
                                        return ""
                                    } else {
                                        return data.obj[i].trailOverTime
                                    }
                                }() + "</td>" +
                                "<td style='width: 10%;' class='end_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {
                                    if (data.obj[i].contractEndTime == undefined) {
                                        return ""
                                    } else {
                                        return data.obj[i].contractEndTime
                                    }
                                }() + "</td>" +
                                "<td style='width: 12%;' class='caozuo'>" + "<a class='find_detail' notifyId=" + data.obj[i].contractId + " style='color:#1772c0;cursor:pointer'><fmt:message code="hr.th.detailedInformation" /></a></td></tr>"//操作
                        }
                        <%--var last_str = "<tr class='last_str'><td colspan='10'><input id='checkedAll' class='checkChild' type='checkbox' conid='29' name='check' value=''><fmt:message code="notice.th.allchose" /><div class='deleteok' style='display:inline-block;margin-left: 30px;'><span style='margin-left: 8px;'><fmt:message code="hr.th.deleteContracts" /></span></div></td></tr>";--%>
                        $("#j_tb").html(news);
                    }



                }
            })
        };







        //添加附件
        /* 添加附件 */

        $('#uploadimg').click(function () {
            $('#uploadinputimg').click();
        });

        $('#uploadinputimg').change(function (e) {
            var target = $(e.target);
            var file;
            if (target[0].files && target[0].files[0]) {
                file = target[0].files[0];
            }
            if (file) {
                $.upload($('#uploadimgform'), function (res) {
                    var str = "";
                    var str1 = "";
                    var data = res.obj;
                    for (var i = 0; i < data.length; i++) {
                        str += '<div class="dech" deUrl="' + data[i].attUrl + '"><a class="ATTACH_a" NAME="' + data[i].attachName + '*" href="<%=basePath %>download?' + data[i].attUrl + '">' + data[i].attachName + '</a><img class="deImg" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" NAME="' + data[i].attachName + '*"  class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                    }

                    $('#query_uploadArr').append(str);

                });
            }
        });


        <%--var data = {--%>
            <%--page: 1,--%>
            <%--pageSize: 5,--%>
            <%--useFlag: true--%>
        <%--};--%>

        <%--initPageList(function (pageCount) {--%>
            <%--initPagination(pageCount, data.pageSize);--%>
        <%--});--%>

<%--//        表格的数据展示--%>
        <%--function initPageList(cb) {--%>

            <%--$.ajax({--%>
                <%--type: "get",--%>
                <%--url: "<%=basePath%>/hr/contract/getAllContract",--%>
                <%--dataType: 'JSON',--%>
                <%--data: data,--%>
                <%--success: function (data) {--%>
                    <%--var news = "";--%>

                    <%--for (var i = 0; i < data.obj.length; i++) {--%>
                        <%--news += "<tr id='notice_tr' notifyId=" + data.obj[i].contractId + ">" +--%>
                            <%--"<td style='width: 5%;'><input class='checkChild' style='margin-left: 5px;' type='checkbox' conid='" + data.obj[i].contractId + "' name='check' value=''></td>" +--%>
                            <%--"<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {--%>
                                <%--if (data.obj[i].userName == undefined || data.obj[i].userName == "") {--%>
                                    <%--return "<fmt:message code="hr.th.UserNotExist" />"--%>
                                <%--} else {--%>
                                    <%--return data.obj[i].userName--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->' >" + function () {--%>
                                <%--if (data.obj[i].deptName == undefined || data.obj[i].deptName == "") {--%>
                                    <%--return "<fmt:message code="hr.th.DepartmentNotExists" />"--%>
                                <%--} else {--%>
                                    <%--return data.obj[i].deptName--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 8%;' notifyId=" + data.obj[i].contractId + " class='publishtip' >" + data.obj[i].postName + "</td>" +--%>
                            <%--"<td style='width: 8%;' class='title' notifyId=" + data.obj[i].contractId + ">" + function () {--%>
                                <%--if (data.obj[i].contractTypeName == undefined) {--%>
                                    <%--return "<fmt:message code="hr.th.ContractTypeNotExist" />"--%>
                                <%--} else {--%>
                                    <%--return data.obj[i].contractTypeName--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + data.obj[i].contractEnterpriesName + " class='' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {--%>
                                <%--if (data.obj[i].contractEnterpriesName == undefined) {--%>
                                    <%--return "<fmt:message code="hr.th.companyNotExist" />"--%>
                                <%--} else {--%>
                                    <%--return data.obj[i].contractEnterpriesName--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 10%;' class='start_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function(){--%>
                                <%--if(data.obj[i].probationEffectiveDate==undefined){--%>
                                    <%--return ""--%>
                                <%--}else{--%>
                                    <%--return data.obj[i].probationEffectiveDate;--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 10%;' class='end_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {--%>
                                <%--if (data.obj[i].trailOverTime == undefined) {--%>
                                    <%--return ""--%>
                                <%--} else {--%>
                                    <%--return data.obj[i].trailOverTime--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 10%;' class='end_time' href='#' notifyId=" + data.obj[i].contractId + " class='<!--windowOpen-->'>" + function () {--%>
                                <%--if (data.obj[i].contractEndTime == undefined) {--%>
                                    <%--return ""--%>
                                <%--} else {--%>
                                    <%--return data.obj[i].contractEndTime--%>
                                <%--}--%>
                            <%--}() + "</td>" +--%>
                            <%--"<td style='width: 12%;' class='caozuo'>" + "<a class='find_detail' notifyId=" + data.obj[i].contractId + " style='color:#1772c0;cursor:pointer'><fmt:message code="hr.th.detailedInformation" /></a>&nbsp<a notifyId=" + data.obj[i].contractId + " class='notice_change' style='cursor:pointer'><fmt:message code="depatement.th.modify" /></a><a class='notice_delete' style='cursor:pointer' notifyId=" + data.obj[i].contractId + " ><fmt:message code="global.lang.delete" /></a></td>"//操作--%>
                    <%--}--%>
                    <%--var last_str = "<tr class='last_str'><td colspan='10'><input id='checkedAll' class='checkChild' type='checkbox' conid='29' name='check' value=''><fmt:message code="notice.th.allchose" /><div class='deleteok' style='display:inline-block;margin-left: 30px;'><span style='margin-left: 8px;'><fmt:message code="hr.th.deleteContracts" /></span></div></td></tr>";--%>
                    <%--$("#j_tb").html(news + last_str);--%>
                    <%--if (cb) {--%>
                        <%--cb(data.totleNum);--%>
                    <%--}--%>
                    <%--initPagination(data.totleNum, 5);--%>

                <%--}--%>
            <%--})--%>
        <%--};--%>

        <%--function initPagination(totalData, pageSize) {--%>

            <%--$('.M-box3').pagination({--%>
                <%--totalData: totalData,--%>
                <%--showData: pageSize,--%>
                <%--jump: true,--%>
                <%--coping: true,--%>
                <%--current: data.page,--%>
                <%--homePage: '<fmt:message code="global.page.first" />',--%>
                <%--endPage: '<fmt:message code="global.page.last" />',--%>
                <%--prevContent: '<fmt:message code="global.page.pre" />',--%>
                <%--nextContent: '<fmt:message code="global.page.next" />',--%>
                <%--jumpBtn: '<fmt:message code="global.page.jump" />',--%>
                <%--callback: function (index) {--%>
                    <%--data.page = index.getCurrent();--%>

                    <%--initPageList(function (pageCount) {--%>
                        <%--initPagination(pageCount, data.pageSize);--%>
                    <%--});--%>
                <%--}--%>
            <%--});--%>
        <%--}--%>




        //点击复选框
        $("#j_tb").on('click', '#notice_tr', function () {
            /*    alert('111');*/
            var state = $(this).find('.checkChild').prop("checked");
            if (state == true) {
                $(this).find('.checkChild').prop("checked", true);
                $(this).addClass('bgcolor');
            } else {
                $('#checkedAll').prop("checked", false);
                $(this).find('.checkChild').prop("checked", false);
                $(this).removeClass('bgcolor');
            }
            var child = $(".checkChild");
            for (var i = 0; i < child.length; i++) {
                var childstate = $(child[i]).prop("checked");
                if (state != childstate) {
                    return
                }
            }
            $('#notice_tr').prop("checked", state);
        })
        //点击全选
        $('#j_tb').on('click', '#checkedAll', function () {
            /*alert('111');*/
            var state = $(this).prop("checked");
            if (state == true) {
                $(this).prop("checked", true);
                $(".checkChild").prop("checked", true);
                $(this).parents('tr').siblings('#notice_tr').addClass('bgcolor');
            } else {
                $(this).prop("checked", false);
                $(".checkChild").prop("checked", false);
                ;
                $(this).parents('tr').siblings('#notice_tr').removeClass('bgcolor');
            }
        })
        //删除封装的方法
        function dataDelete(fileId) {
            console.log(fileId);
            layer.confirm(' <fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/hr/contract/deleteByIds',
                    dataType: 'json',
                    data: {'ids': fileId},
                    success: function () {
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        /* init(4,id,1);*/
                        window.location.reload();
                    }
                })

            }, function () {
                layer.closeAll();
            });

        }

        //点击删除选中按钮
        $('#j_tb').on('click', '.deleteok', function () {
            /* alert('111');*/
            var fileId = "";
            $("#j_tb .checkChild:checkbox:checked").each(function () {

                var conId = $(this).attr("conId");
                /*  alert(conId);*/
                fileId += conId + ",";

            })
            if (fileId == '') {
                $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
            } else {
                /*    $('.contentTrs').remove();
                 $('.mainContent').show();
                 $('.details').hide();*/
                dataDelete(fileId)
            }
        })
        //点击删除所有按钮
        $('#j_tb').on('click', '.delete_all', function () {
            alert('111');
            var notifyIds = [];
            /* for(var i=0;i<){
             var n_id=$(this).parents('tr').siblings('#notice_tr').attr('notifyid');
             }*/
            $(this).parents('tr').siblings('#notice_tr').each(function () {
                var n_id = $(this).attr('notifyid');
                alert(n_id);
                notifyIds.push(n_id);
            });
            layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/hr/contract/deleteContractInfo',
                    dataType: 'json',
                    data: {'notifyIds': notifyIds},
                    success: function () {
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        /* init(4,id,1);*/
                        window.location.reload();
                    }
                })

            }, function () {
                layer.closeAll();
            });
        })


        //查阅情况
        $('#j_tb').on('click', '.find_detail', function () {
            /* alert('111');*/
            var notifyId = $(this).attr('notifyId');
            $.popWindow("/hr/page/contractDetail?contractId=" + notifyId, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
        })


        //删除公告通知管理
        $('#j_tb').on('click', '.notice_delete', function () {
            var that = $(this).parents('#notice_tr');
            var tid = $(this).attr('notifyId');

            layer.confirm(' <fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'],//按钮
                title: ' <fmt:message  code="workflow.th.suredel"/>'
            }, function () {
                //确定删除，调接口
                $.ajax({
                    url: "<%=basePath%>/hr/contract/deleteContractInfo",
                    type: "get",
                    data: {
                        contractId: tid
                    },
                    dataType: 'json',
                    success: function (obj) {
                        //第三方扩展皮肤
                        layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});

                        that.remove();
                    }
                })

            }, function () {
                layer.closeAll();
            });


        });
        //删除附件
        function deleteChatment(data, element) {

            layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteAttachment"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'get',
                    url: '../delete',
                    dataType: 'json',
                    data: data,
                    success: function (res) {

                        if (res.flag == true) {
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            element.remove();
                        } else {
                            layer.msg(' <fmt:message  code="lang.th.deleSucess"/>', {icon: 6});
                        }
                    }
                });

            }, function () {
                layer.closeAll();
            });
        }

        //点击x，删除附件
        $('.enclosure').on('click', '.deImg', function () {
            var data = $(this).parents('.dech').attr('deUrl');
            var dome = $(this).parents('.dech');
            deleteChatment(data, dome);
        });

        // 获取用户信息控件
        $('.userAdd').click(function () {
            user_id = "staffNameInput";
            $.popWindow("../../common/selectUser");
        });

        // 获取人员信息控件
        $('.orgAdd').click(function () {
            user_id = "remindUser";
            $.popWindow("../../common/selectUser");
        });
        // 清空
        $('.orgClear').click(function () {
            $('#remindUser').attr("dataid", "");
            $('#remindUser').attr("user_id", "");
            $('#remindUser').val("");
        });


        <%--//获取合同信息--%>
        <%--$.ajax({--%>
            <%--url: "<%=basePath%>/code/GetDropDownBox",--%>
            <%--type: 'get',--%>
            <%--dataType: "JSON",--%>
            <%--data: {"CodeNos": "HR_STAFF_CONTRACT1"},--%>
            <%--success: function (data) {--%>
                <%--var str = '<option value=""><fmt:message code="hr.th.typeContract" />&nbsp;&nbsp;</option>';--%>
                <%--for (var proId in data) {--%>
                    <%--for (var i = 0; i < data[proId].length; i++) {--%>
                        <%--str += '<option value="' + data[proId][i].codeNo + '">' + data[proId][i].codeName + '</option>'--%>
                    <%--}--%>
                <%--}--%>
                <%--$('select[name="contractType"]').append(str);--%>
            <%--}--%>
        <%--});--%>

        <%--// 获取签约公司信息--%>
        <%--$.ajax({--%>
            <%--url: "<%=basePath%>/code/GetDropDownBox",--%>
            <%--type: 'get',--%>
            <%--dataType: "JSON",--%>
            <%--data: {"CodeNos": "HR_ENTERPRISE"},--%>
            <%--success: function (data) {--%>
                <%--var str = '<option value=""><fmt:message code="hr.th.ContractSigningCompany" />&nbsp;&nbsp;</option>';--%>
                <%--for (var proId in data) {--%>
                    <%--for (var i = 0; i < data[proId].length; i++) {--%>
                        <%--str += '<option value="' + data[proId][i].codeNo + '">' + data[proId][i].codeName + '</option>'--%>
                    <%--}--%>
                <%--}--%>
                <%--$('select[name="contractEnterpries"]').append(str);--%>
            <%--}--%>
        <%--});--%>

        // 获取角色信息
        <%--$.ajax({--%>
            <%--url: "<%=basePath%>/getAllUserPriv",--%>
            <%--type: 'get',--%>
            <%--dataType: "JSON",--%>
            <%--data: {"CodeNos": "HR_ENTERPRISE"},--%>
            <%--success: function (data) {--%>
                <%--var str = '';--%>
                <%--for (var proId in data) {--%>
                    <%--for (var i = 0; i < data[proId].length; i++) {--%>
                        <%--if (data[proId][i].userPriv != undefined) {--%>
                            <%--str += '<option value="' + data[proId][i].userPriv + '">' + data[proId][i].privName + '</option>'--%>
                        <%--}--%>
                    <%--}--%>
                <%--}--%>
                <%--$('select[name="userPriv"]').append(str);--%>
            <%--}--%>
        <%--});--%>

        var contractId = "";
        /*合同管理中的修改之前的查询接口*/
        $("#j_tb").on('click', '.notice_change', function () {
            $('.con_edit').show().siblings().hide();
            var cid = $(this).attr('notifyid');
            $.ajax({
                type: "post",
                url: "<%=basePath%>/hr/contract/getContractInfo",
                dataType: 'json',
                data: {
                    contractId: cid
                },
                success: function (res) {
                    contractId = res.object.contractId;

                    $("input[name='staffName1']").attr("user_id", res.object.staffName);
                    $("input[name='staffName1']").val(res.object.userName);
                    $("input[name='staffContractNo']").val(res.object.staffContractNo);


                    $('select[name="contractEnterpries"]').find("option[value='" + res.object.contractEnterpries + "']").attr("selected", true);
                    $('select[name="contractType"] ').find("option[value='" + res.object.contractType + "']").attr("selected", true);
                    $('select[name="contractSpecialization"] ').val(res.object.contractSpecialization);
                    $('select[name="userPriv"] ').val(res.object.userPriv);


                    $('input[name="makeContract"]').val(res.object.makeContract);
                    $('[name="probationEffectiveDate"]').val(res.object.probationEffectiveDate);
                    $('[name="contractEndTime"]').val(res.object.contractEndTime);
                    $('[name="trailOverTime"]').val(res.object.trailOverTime);

                    if(res.object.isTrial==1){
                        $("#id_msg1").show();
                        $("#id_msg11").show();
                        $('#hetongzhuanzheng').show();
                    }
                    $(":radio[name='TRAIL_PASS_OR_NOT'][value='" + res.object.isTrial + "']").prop("checked", "checked");

                    // 是否转正

                    $(":radio[name='PASS_OR_NOT'][value='" + res.object.passOrNot + "']").prop("checked", "checked");
                    if(res.object.removeOrNot==1){
                        $("#id_msg2").show();
                        $("#id_msg21").show();
                    }
                    $(":radio[name='REMOVE_OR_NOT'][value='" + res.object.removeOrNot + "']").prop("checked", "checked");
                    if( res.object.isRenew==1){
                        $("#id_msg3").show();
                        $("#id_msg31").show();
                    }
                    $(":radio[name='RENEW_OR_NOT'][value='" + res.object.isRenew + "']").prop("checked", "checked");

                    $('[name="contractRemoveTime"]').val(res.object.contractRemoveTime);
                    $('[name="renewTime"]').val(res.object.renewTime);
                    $('[name="remindUser"]').attr("user_id", res.object.remindUser);
                    $('[name="remindUser"]').val(res.object.remindUserName);
                    $('[name="remark"]').val(res.object.remark);
                }
            })
        });

        // 提交修改表单
        $("#rs").click(function () {
            if (CheckForm()) {
                var staffName = $("input[name='staffName1']").attr("user_id");
                if(staffName!=undefined && staffName!=""){
                    staffName= staffName.replace(/,/g,'');
                }

                var data = {
                    'contractId': contractId,
                    'staffName': staffName,
                    'staffContractNo': $("input[name='staffContractNo']").val(),
                    'contractEnterpries': $('select[name="contractEnterpries"] option:checked').val(),
                    'contractType': $('select[name="contractType"] option:checked').val(),
                    'contractSpecialization': $('select[name="contractSpecialization"] option:checked').val(),
                    'userPriv': $('select[name="userPriv"] option:checked').val(),
                    'makeContract': $('input[name="makeContract"]').val(),
                    'probationEffectiveDate': $('[name="probationEffectiveDate"]').val(),
                    'contractEndTime': $('[name="contractEndTime"]').val(),
                    'trailOverTime': $('[name="trailOverTime"]').val(),
                    'passOrNot': $('[name="PASS_OR_NOT"] checked:checked').val(),
                    'contractRemoveTime': $('[name="contractRemoveTime"]').val(),
                    'renewTime': $('[name="renewTime"]').val(),
                    'remindUser': $('[name="remindUser"]').attr("user_id"),
                    'remark': $('[name="remark"]').val()
                }
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/hr/contract/updateContractInfo',
                    dataType: 'json',
                    data: data,
                    success: function (rsp) {
                        if (rsp.flag == true) {
                            layer.msg('<fmt:message code="hr.th.EditorSavedSuccessfully" />', {icon: 6});
                            window.location.href='<%=basePath%>/hr/page/contractStraff';
                        } else {
                            layer.msg('<fmt:message code="hr.th.EditSaveFailed" />', {icon: 6});
                            window.location.href='<%=basePath%>/hr/page/contractStraff';
                        }
                    }
                })

            }
        });


    });

    /* 终止和生效方法 */

    function stoprwo(me, id, publishId, stopId) {
        var pulbish;
        /*  alert($(stopId).html()); */
        if ($('#' + stopId).html() == '终止') {
            pulbish = "2";
            /* 	alert(2); */
        } else if ($('#' + stopId).html() == '生效') {
            pulbish = "1";
        }
        var data = {
            "notifyId": id,
            "publish": pulbish  // 发布标识(0-未发布,1-已发布,2-已终止)
        };
        $.ajax({
            url: "updateNotify",
            type: 'post',
            dataType: "JSON",
            data: data,
            success: function (data) {
                if ($(me).html() == '终止') {
                    $(me).parent().prev().html('<fmt:message code="notice.state.end" />');/*终止*/
                    $(me).html('<fmt:message code="notice.state.effective" />');/*生效*/
                } else if ($(me).html() == '生效') {
                    $(me).parent().prev().html('<fmt:message code="notice.state.effective" />');/*生效*/
                    $(me).html('<fmt:message code="notice.state.end" />');/*终止*/
                }
            },
            error: function (e) {
            }
        });

    }
    laydate({
        elem: '#add_newDate', //目标元素。
        format: 'YYYY-MM-DD hh:mm:ss', //日期格式
        istoday: true,
        istime: true //显示时、分、秒
    });

    //查询公告时间控件调用
    var start = {
        elem: '#beginTime',
        format: 'YYYY-MM-DD hh:mm:ss',
        /* min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }
    };
    var end = {
        elem: '#endTime',
        format: 'YYYY-MM-DD hh:mm:ss',
        /*     min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    /*新建公告时间控件调用*/

    var starts = {
        elem: '#notice_start_add',
        format: 'YYYY-MM-DD',
        /*        min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }
    };
    var ends = {
        elem: '#notice_end_add',
        format: 'YYYY-MM-DD',
        /*       min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    /*   find_start*/
    var find_start = {
        elem: '#find_start',
        format: 'YYYY-MM-DD',
        /*       min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    var find_end = {
        elem: '#find_end',
        format: 'YYYY-MM-DD',
        /*       min: laydate.now(),
         max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    laydate(start);
    laydate(end);
    laydate(starts);
    laydate(ends);
    laydate(find_start);
    laydate(find_end);



</script>
</body>
</html>