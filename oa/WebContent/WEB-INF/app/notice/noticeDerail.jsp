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
<head>
    <meta charset="UTF-8">
    <title><fmt:message code="notice.th.queryDetail"/></title>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        body {
            padding: 0;
            margin: 0;
            font-family: "微软雅黑";
            width: 100%;
        }

        /* .detailsContent{width: 100%;overflow: hidden;background-color: #f6f7f9;} */
        .detailsContent {
            width: 100%;
            overflow: hidden;
        }

        .detailsContent .title {
            width: 90%;
            margin: 0 auto;
            text-align: center;
            height: 60px;
            line-height: 60px;
            color: #2a588c;
            font-size: 25px;
            font-weight: bold;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }

        .infor {
            width: 100%;
            overflow: hidden;
            height: 40px;
            background-color: #d3e7fa;
        }

        .infor ul {
            list-style: none;
            overflow: hidden;
            float: right;
            margin-top: 10px;
        }

        .infor ul li {
            float: left;
            margin-right: 20px;
            font-size: 14px;
        }

        .infor ul li span {
            font-size: 14px;
        }

        .divContent {
            width: 100%;
        }

        .divContent .divTxt {
            margin: 20px 20px;
        }

        .divContent .divTxt p {
            font-size: 14px;
            color: #444;
            line-height: 25px;
        }

        .divContent .keyWord {
            margin: 0 0 10px 50px;
        }

        .divContent .keyWord span {
            margin-right: 10px;
            color: #2b7fe0;
        }

        .btnImg {
            width: 100%;
        }

        .btnImg .margin {
            width: 370px;
            margin: 20px auto;
        }

        .btnImg .margin a {
            margin-right: 20px;
        }

        .spanbreak {
            width: 60px;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
            display: inline-block;
        }
        .divContent1 .font_{
            margin-top: 6px;
        }
        .divContent1 .file_a{
            text-decoration: none;
            color: #00a0e9;
            cursor: pointer;
        }
        .divContent1 .download_a{
            margin-left: 25px;
            color: #0A5FA2;
        }
    </style>
    <script type="text/javascript">
        $(function () {

            var nid = $.getQueryString('notifyId');

            $.ajax({
                type: 'get',
                url: 'getOneById',
                dataType: 'json',
                data: {
                    'notifyId': nid,
                    'permissionId': 1
                },
                success: function (rsp) {
                    var data1 = rsp.object;
                    var str = '';
                    var toTypeName = "";
                    if (rsp.object.toId != "") {
                        toTypeName += rsp.object.deprange;
                    }
                    if (rsp.object.privId != "") {
                        toTypeName += "角色,";
                    }
                    if (rsp.object.userId != "") {
                        toTypeName += rsp.object.userrange;
                    }
                    $('.title').text(data1.subject);
                    str = '<li><span><fmt:message code="notice.th.publishdepartment" />：</span><span style="padding-right:20px">'+data1.depName+'</span><span><fmt:message code="notice.th.publisher" />：</span><span>' + data1.name + '</span></li><li>' +
                        '<span>'+
                    function () {
                    if(data1.publish==1 || data1.publish==3){
                        return '<fmt:message code="dem.th.AuditTime" />：'
                    }else {
                        return '<fmt:message code="notice.th.PostedTime" /> : '
                    }
                }()
                +'</span><span>'+function () {
                    if(data1.publish==1 || data1.publish==3){
                        return new Date(data1.sendTime).Format('yyyy-MM-dd hh:mm:ss')
                    }else {
                        return data1.notifyDateTime
                    }
                }()
                +  '</span><span style="padding-left:20px" class="approver"><fmt:message code="hr.th.Approver" />：</span><span class="approver">'+data1.auditerName+'</span></li>';
                    $('ul').append(str);
                    $('.divTxt').append('<p>' + data1.content + '</p>');
                    var str1 = "";
                    var arr = new Array();
                    arr = data1.attachment;
                    if (data1.attachmentName != '') {
                        for (var i = 0; i < (arr.length); i++) {
                            var fileType = arr[i].attachName.substring(arr[i].attachName.lastIndexOf("."),arr[i].attachName.length);

                            var previewUrl = '';
                            var downloadStr = '';
                            if(data1.download==1){
                                downloadStr = '<a class="download_a" href="<%=basePath %>download?' + encodeURI(arr[i].attUrl) + '"><fmt:message code="file.th.download" /></a>';
                                previewUrl = '<%=basePath %>download?' + encodeURI(arr[i].attUrl);
                            }
                            if(fileType.indexOf("doc")==1||fileType.indexOf("docx")==1){
                                previewUrl = '<%=basePath %>common/ntko?documentEditPriv=0&'+ encodeURI(arr[i].attUrl);
                            }else if (fileType.indexOf("jpg")==1||fileType.indexOf("gif")==1||fileType.indexOf("png")==1||fileType.indexOf("jpeg")==1||fileType.indexOf("bmp")==1){
                                previewUrl = '<%=basePath %>xs?'+ encodeURI(arr[i].attUrl);
                            }
                            str1 += '<div class="font_">' +
                                '<span>附件文件：</span>' +
                                '<a class="file_a" data-url="'+previewUrl+'"><img class="img_" src="../img/enclosure.png"/>' + arr[i].attachName + '</a>' +
                                downloadStr +
                                '</div>';
                        }
                        $('.divContent1').append(str1);

                    }
                    if(data1.auditerName==''||null){
                        console.log($('.approver'))
                        $('.approver').remove();
                    }
                }
            });
            
            $('.divContent1').delegate(".file_a","click",function () {
                if($(this).attr("data-url")!=undefined){
                    $.popWindow($(this).attr("data-url"),'<fmt:message code="main.th.PreviewPage" />','0','0','1500px','800px');
                }
            });
        });
    </script>
</head>
<body>
<div class="detailsContent">
    <div class="title"></div>
    <div class="infor">
        <ul>

        </ul>
    </div>
    <div class="divContent">
        <div class="divTxt">
        </div>
        <div class="divContent1" style="border-top:1px solid #dedede; padding-top:10px;">

        </div>
    </div>
</div>

</body>
</html>

