<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="file.th.detail" /></title>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js"></script>
    <style>
        .head{
            font-size: 22px;
            color: #494d59;
            font-family: "微软雅黑";
        }
        .head span{
            margin-left: 24px;
            margin-top: 10px;
        }
        .content_table {
            margin: 40px auto 0px auto;
            width: 88%;
        }
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="head">
    <span><fmt:message code="doc_th_seeFile" /></span>
</div>

<div class="content">
    <table class="content_table">

    </table>
</div>

<script type="text/javascript">
    $(function () {
        var dataId = $.GetRequest().fileId;
        $.ajax({
            url: "/rmsFile/selectById",
            data: {
                fileId: dataId
            },
            type: "get",
            success: function (res) {
                var str = '';
                if (res.flag) {
                    var object = res.object;

                    // 密级判断
                    if(object.secret==1){
                        object.secret = '<fmt:message code="dem.th.PuDense" />';
                    }else if(object.secret==2){
                        object.secret = '<fmt:message code="doc.th.Top-secret" />';
                    }else if(object.secret==3){
                        object.secret = '<fmt:message code="doc.th.Confidential" />';
                    }else if(object.secret==4){
                        object.secret = '<fmt:message code="doc.th.Secret" />';
                    }
                    //紧急等级判断
                    if(object.urgency == '1'){
                        object.urgency='<fmt:message code="hr.th.EmployeeType" />';
                    }else{
                        object.urgency='<fmt:message code="dem.th.GeneralLevel" />';
                    }
                    //文件分类判断
                    if(object.fileType == '1'){
                        object.fileType='<fmt:message code="email.th.document" />';
                    }else{
                        object.fileType='<fmt:message code="userDatails.th.data" />';
                    }
                    //公文类别判断
                    if(object.fileKind == '1'){
                        object.fileKind='A';
                    }else if(object.fileKind == '2'){
                        object.fileKind='B';
                    }else if(object.fileKind == '3'){
                        object.fileKind='C';
                    }else {
                        object.fileKind='D';
                    }
                    var arrAttach=object.attachmentList
                    var stra='';
                    if(arrAttach.length > 0){
                        for(var i=0;i<arrAttach.length;i++){
                            stra+= '<div class="dech" deUrl="' + encodeURI(arrAttach[i].attUrl)+ '"><a href="<%=basePath %>download?'+encodeURI(arrAttach[i].attUrl)+'" NAME="' + arrAttach[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + arrAttach[i].attachName + '</a></div>';
                        }
                    }else{
                        stra='<fmt:message code="hr.th.NoAttachments" />';
                    }

                    str += '<tr>' +
                        '   <td><fmt:message code="dem.th.FileNum" />：</td><td>'+object.fileCode+'</td>' +
                        '<td><fmt:message code="dem.th.DocumentWords" />：</td><td>'+object.fileSubject+'</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td><fmt:message code="dem.th.FileTitle" />：</td><td>'+object.fileTitle+'</td>' +
                        '<td><fmt:message code="dem.th.Supplemented" />：</td><td>'+object.fileTitle0+'</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td><fmt:message code="doc.th.DispatchUnit" />：</td><td>'+object.sendUnit+'</td>' +
                        '<td><fmt:message code="dem.th.DateWriting" />：</td><td>'+function () {
                            if(object.sendDate != undefined){
                                return object.sendDate;
                            }else{
                                return '';
                            }
                        }()+'</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td><fmt:message code="dem.th.Dense" />：</td><td>'+object.secret+'</td>' +
                        '<td><fmt:message code="dem.th.EmergencyGrade" />：</td><td>'+object.urgency+'</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td><fmt:message code="dem.th.FileClassification" />：</td><td>'+object.fileType+'</td>' +
                        '<td><fmt:message code="dem.thDocumentCategory" />：</td><td>'+object.fileKind+'</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td><fmt:message code="dem.th.FilePage" />：</td><td>'+object.filePage+'</td>' +
                        ' <td><fmt:message code="dem.th.Print" />：</td><td>'+object.printPage+'</td>' +
                        ' </tr>' +
                        ' <tr>' +
                        ' <td><fmt:message code="journal.th.Remarks" />：</td><td colspan="3">'+object.remark+'</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td><fmt:message code="depatement.th.Attachmentdocument" />：</td><td colspan="3">'+stra+'</td>' +
                        '</tr>' ;
                }
                $('.content_table').html(str);
            },
            dataType: "json"
        })
    })
</script>
</body>
</html>
