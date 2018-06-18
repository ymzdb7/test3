
<%@ page language="java" contentType="text/html; charset=UTF-8"
           pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="notice.th.buildnotify"/></title>
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base/base.css">
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/common/language.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <%--<script src="../js/jquery/jquery.cookie.js"></script>--%>
    <script src="/lib/jquery.form.min.js"></script>
    <%--<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>--%>
    <style>

        input{
            float: none;
        }
        .editAndDelete3{
            color: red;
        }
    </style>
    <script src="/js/notice/newAndEdit.js"></script>
    <script>

    </script>
</head>
<body>
<div class="navigation">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png" alt="">
    <h2></h2>

</div>
<div id="pagediv" class="tableMain">
    <form id="ajaxform" action="">
        <input type="hidden" name="tuisong" value="">
        <input type="hidden" name="format" value="0">
        <input type="hidden" name="publish" >
        <input type="hidden" name="notifyId">
        <input type="hidden" name="lastEditTimes">
        <input type="hidden" name="auditer">
    <table>
        <tbody>
            <tr>
                <td width="20%">
                    <select name="typeId" onchange="typeIdStatic(this)">
                        <option value=""><fmt:message code="news.th.type"/></option>
                    </select>
                </td>
                <td width="80%" style="text-align: left">
                    <input type="text" name="subject" placeholder="<fmt:message code="global.lang.printsubject"/>">
                    <b>*</b>
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <p style="margin-bottom:5px;"><fmt:message code="notice.th.IssuedByDepartment"/>：</p>
                    <a href="javascript:;" class="deptandrole"><fmt:message code="notice.th.PostedByPersonnelOrRoles"/></a>
                </td>
                <td width="80%" style="text-align: left">
                    <textarea name="" class="theControlData" readonly="readonly" id="department" cols="30" rows="10"></textarea>
                    <b>*</b>
                    <a href="javascript:;" class="addControls" data-type="1"><fmt:message code="global.lang.add"/></a>
                    <a href="javascript:;" class="cleardate"><fmt:message code="global.lang.empty"/></a>
                    <input type="hidden" name="toId">
                    <p><fmt:message code="vote.th.(UnionPersonnel)"/></p>
                </td>
            </tr>
            <tr class="deptrole">
                <td class="blue_text" width="20%">
                    <p ><fmt:message code="notice.th.role"/>：</p>
                </td>
                <td width="80%" style="text-align: left">
                    <textarea name="" class="theControlData" readonly="readonly" id="roleall" cols="30" rows="10"></textarea>
                    <a style="margin-left:5px;" href="javascript:;" class="addControls" data-type="2"><fmt:message code="global.lang.add"/></a>
                    <a href="javascript:;" class="cleardate"><fmt:message code="global.lang.empty"/></a>
                    <input type="hidden" name="privId">
                </td>
            </tr>
            <tr class="deptrole">
                <td class="blue_text" width="20%">
                    <p ><fmt:message code="notice.th.somebody"/>：</p>
                </td>
                <td width="80%" style="text-align: left">
                    <textarea name="" class="theControlData" readonly="readonly" id="personnel" cols="30" rows="10"></textarea>
                    <a style="margin-left:5px;" href="javascript:;" class="addControls" data-type="3"><fmt:message code="global.lang.add"/></a>
                    <a href="javascript:;" class="cleardate"><fmt:message code="global.lang.empty"/></a>
                    <input type="hidden" name="userId">
                </td>
            </tr>

            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="notice.th.PostedTime"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <input style="width: 228px" type="text" name="sendTimes" readonly="readonly" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})">
                    <b>*</b>
                    <a href="javascript:;" class="recoveryTime"><fmt:message code="notice.th.ResetToCurrentTime"/></a>
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="notice.th.validity"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <input style="width: 204px" readonly="readonly" type="text" name="beginDates" placeholder="<fmt:message code="adding.th.PleasePeriod"/>" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                    <span><fmt:message code="global.lang.to"/></span>
                    <input style="width: 204px" readonly="readonly" type="text" name="endDates"
                           placeholder="<fmt:message code="adding.th.PleasePeriod"/>"
                           onclick="laydate(dataobj)">
                    <span><fmt:message code="notice.th.null"/></span>
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="notice.th.reminder"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <input type="checkbox" name="thingDefault">
                    <span><fmt:message code="notice.th.remindermessage"/></span>
                    <input type="hidden" name="remind" value="0">&nbsp;
                    <input type="checkbox" name="smsRemind" >
                    <span><fmt:message code="vote.th.UseRemind"/></span>
                    <input type="hidden" name="smsDefault" value="1">
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="notice.th.top"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <input type="checkbox" name="topDing" checked="checked">
                    <input type="hidden" name="top" value="1">
                    <span><fmt:message code="notice.th.topMajor"/></span>
                    <input type="text" name="topDays" value="3" style="height: 20px;width: 23px;">
                    <span><fmt:message code="notice.th.endTop"/></span>
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="notice.th.contentValidity"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <textarea name="summary" placeholder="<fmt:message code="adding.th.PleaseIntroduction"/>"  id="" cols="30" rows="10" maxlength="30" style="background: #fff"></textarea>
                    <span><fmt:message code="notice.th.contentHigh"/></span>
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="notice.th.fileUpload"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <div id="fileAll">

                    </div>
                    <a href="javascript:;" class="openFile">
                        <img src="../img/mg11.png" alt="">
                        <span><fmt:message code="email.th.addfile"/></span>
                        <input type="file" multiple id="fileupload" data-url="../upload?module=notify" name="file">
                    </a>
                    <input type="hidden" name="attachmentId">
                    <input type="hidden" name="attachmentName">
                </td>
            </tr>
            <tr>
                <td class="blue_text" width="20%">
                    <fmt:message code="adding.th.Attachment"/>：
                </td>
                <td width="80%" style="text-align: left">
                    <input type="checkbox" id="download_ck" checked="checked"><label for="download_ck"><fmt:message code="adding.th.allow"/></label>
                    <input type="hidden" name="download" value="1" >
                </td>
            </tr>
            <tr>
                <td colspan="2" style="padding: 5px;">
                    <div id="word_container" name="word_container">

                    </div>
                    <input type="hidden" name="content">
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center" class="btnarr">
                    <a href="javascript:;" class="sendbtn" onclick="ajaxforms(1)"><fmt:message code="global.lang.publish"/></a>
                    <a style="display: none" href="javascript:;" class="tijiaobtn" ><fmt:message code="adding.th.Submit"/></a>
                    <a href="javascript:;" class="savebtn" onclick="ajaxforms(0)"><fmt:message code="global.lang.save"/></a>
                </td>
            </tr>
        </tbody>
    </table>
    </form>
</div>
</body>
</html>