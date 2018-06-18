
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
    <title><fmt:message code="notice.title.announcementquery"/></title>
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base/base.css">
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">
    <script src="/js/common/language.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <style>
        table tbody td{
            text-align: left;
            padding: 10px;
            box-sizing: border-box;
        }
        table tbody td.color{
            padding:10px 10px 10px 50px;
        }
        input{
            float: none;
        }
        .editAndDelete3{
            color: red;
        }
        .color{
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        table tbody td textarea{
            width: 229px;
            height: 34px;
            outline: none;
            border-radius: 4px;
            vertical-align: middle;
        }
        table tbody td a{
            vertical-align: middle;
        }
        table tbody td select{
            width: 119px;
            height: 28px;
            border-radius: 4px;
        }
        table tbody td input[type=text]{
            width: 288px;
            height: 32px;
            border-radius: 4px;
            padding-left: 10px;
            box-sizing: border-box;
        }
        .btnsava{
            padding:5px 15px;
            border-radius: 4px;
            background: #2F8AE3;
            color: #fff;
        }
        .pagediv .page-bottom-outer-layer table td{
            text-align: left;
        }
        /*table tr.borderNone{*/
            /*border:none;*/
        /*}*/
    </style>
    <script src="/js/notice/theQuery.js"></script>
</head>
<body>
<div class="navigation">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/gonggaochaxun.png" alt="">
    <h2><fmt:message code="notice.title.announcementquery"/></h2>
</div>
<div class="query">
    <div class="header"><fmt:message code="global.lang.inputquerycondition"/></div>
    <form id="ajaxform" action="">
        <input type="hidden" name="changeId" value="1">
        <input type="hidden" name="exportId" value="">
    <table style="width: 100%;    border: 1px solid #c0c0c0;
    border-top: none;">
        <tbody>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.publisher"/>：</td>
                <td width="70%">
                    <textarea name="" placeholder="<fmt:message code="addiing.th.Publisher"/>" class="theControlData" readonly="readonly" id="reles" cols="30" rows="10"></textarea>
                    <a href="javascript:;" class="addroles"><fmt:message code="global.lang.add"/></a>
                    <a href="javascript:;" class="cleardate"><fmt:message code="global.lang.empty"/></a>
                    <input type="hidden" name="fromId">
                </td>
            </tr>
            <%--<tr class="borderNone">--%>
                <%--<td width="30%" class="color">格式：</td>--%>
                <%--<td width="70%">--%>
                    <%--<select name="format" id="">--%>
                        <%--<option value="0">普通格式</option>--%>
                    <%--</select>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.type"/>： <input type="hidden" name="format" value="0"></td>
                <td width="70%">
                    <select name="typeId" id="">
                        <option value=""><fmt:message code="addiing.th.bulletin"/></option>
                    </select>
                </td>
            </tr>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.postedType"/>：</td>
                <td width="70%">
                    <select name="publish" id="">
                        <option value=""><fmt:message code="notice.th.all"/></option>
                        <option value="0"><fmt:message code="notice.th.unposted"/></option>
                        <option value="1"><fmt:message code="notice.th.posted"/></option>
                    </select>
                </td>
            </tr>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.ReleaseTop"/>：</td>
                <td width="70%">
                    <select name="top" id="">
                        <option value=""><fmt:message code="notice.th.all"/></option>
                        <option value="0"><fmt:message code="notice.th.untoped"/></option>
                        <option value="1"><fmt:message code="notice.th.toped"/></option>
                    </select>
                </td>
            </tr>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.title"/>：</td>
                <td width="70%">
                    <input type="text" placeholder="<fmt:message code="main.th.ContentSearch"/>" name="subject">
                </td>
            </tr>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.title.Releasedate"/>：</td>
                <td width="70%">
                    <input type="text" placeholder="<fmt:message code="adding.th.Start"/>" name="beginTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" readonly="readonly" style="width: 128px">
                    <span><fmt:message code="global.lang.to"/></span>
                    <input type="text" placeholder="<fmt:message code="adding.th.end"/>" name="endTime" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"  style="width: 128px" readonly="readonly">
                </td>
            </tr>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.effectiveType"/>：</td>
                <td width="70%">
                    <select name="" id="">
                        <option value="0"><fmt:message code="notice.th.all"/></option>
                        <option value="1"><fmt:message code="notice.th.uneffective"/></option>
                        <option value="2"><fmt:message code="notice.th.effectived"/></option>
                        <option value="3"><fmt:message code="notice.th.hasEnd"/></option>
                    </select>
                </td>
            </tr>
            <tr class="borderNone">
                <td width="30%" class="color"><fmt:message code="notice.th.content"/>：</td>
                <td width="70%">
                    <input type="text" placeholder="<fmt:message code="new.th.putcontent"/>" name="content">
                </td>
            </tr>
            <tr class="borderNone">
                <td colspan="2" style="text-align: center">
                    <a href="javascript:;" class="btnsava" onclick="ajaxforms(1)"><fmt:message code="global.lang.query"/></a>
                    <a href="javascript:;" style="margin-left: 10px" class="btnsava"  onclick="ajaxforms(2)"><fmt:message code="global.lang.report"/></a>
                    <a href="javascript:;" style="margin-left: 10px" class="btnsava chongtian"  ><fmt:message code="global.lang.refillings"/></a>
                </td>
            </tr>
        </tbody>
    </table>
    </form>
</div>
<div id="pagediv" style="visibility:hidden;">

</div>
</body>
</html>