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
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <title><fmt:message code="main.unitquery" /></title>
    <link rel="stylesheet" href="../css/sys/companyinfo.css" />
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style>.edui-default{margin-top: 0px;}</style>
</head>
<body>
<div class="content">
    <div class="headDiv">
        <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/danweichaxun.png"></div>
        <div class="divP"><fmt:message code="diary.th.unitInfo" /></div>
    </div>
    <div class="tab">
        <table cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff">
            <tr>
                <td colspan="2" style="color:#23477e;font-size: 15px;font-weight: bold;"><fmt:message code="diary.th.unitInfo" /></td>
            </tr>
            <tr>
                <td width="20%"><fmt:message code="depatement.th.Unitname" />：</td>
                <td class="unitName"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.Telephone" />：</td>
                <td class="telNo"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.fax" />：</td>
                <td class="faxNo"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.Zipcode" />：</td>
                <td class="postNo"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.address" />：</td>
                <td class="address"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.website" />：</td>
                <td class="url"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.Electronicmailbox" />：</td>
                <td class="email"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.Openingbank" />：</td>
                <td class="bankName"></td>
            </tr>
            <tr>
                <td width="20%" class="blue_text"><fmt:message code="depatement.th.Accountnumber" />：</td>
                <td class="bankNo"></td>
            </tr>
            <tr>
                <td colspan="2" style="color:#23477e;font-size: 15px;font-weight: bold;"><fmt:message code="depatement.th.Unitprofile" /></td>
            </tr>

            <tr>
                <td colspan="2">
                    <div id="container" style="width: 99.9%;min-height: 300px;" name="content" type="text/plain"></div>
                </td>
            </tr>
            <tr>
                <td width="20%"><fmt:message code="depatement.th.Attachmentdocument" />：</td>
                <td class="enclosure"></td>
            </tr>
        </table>
    </div>
</div>
<script type="text/javascript">
    var ue = UE.getEditor('container',{
        initialFrameHeight: 270
    });
    $(function(){
        ue.ready(function() {
            $.ajax({
                type: 'get',
                url: '/sys/showUnitManage',
                dataType: 'json',
                success: function (res) {
                    var data = res.object;
                    var str = '';
                    var arr = new Array();
                    arr = data.attachment;
                    $('.unitName').text(data.unitName);
                    $('.telNo').text(data.telNo);
                    $('.faxNo').text(data.faxNo);
                    $('.postNo').text(data.postNo);
                    $('.address').text(data.address);
                    $('.url').text(data.url);
                    $('.email').text(data.email);
                    $('.bankName').text(data.bankName);
                    $('.bankNo').text(data.bankNo);
                    if (data.attachmentName != '') {
                        for (var i = 0; i < arr.length; i++) {
                            str += '<div><a href="<%=basePath %>download?' + arr[i].attUrl + '"><img src="../img/icon_print_07.png"/>' + arr[i].attachName + '</a></div>';
                        }
                    }
                    $('.enclosure').append(str);
                    ue.setContent(data.content);
                }
            })
        })
    })
</script>
</body>
</html>

