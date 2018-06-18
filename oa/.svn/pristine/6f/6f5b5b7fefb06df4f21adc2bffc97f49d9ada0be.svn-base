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
    <title><fmt:message code="news.th.newsDetail"/></title>
    <link rel="stylesheet" type="text/css" href="../css/news/newsDetail.css"/>
    <script src="/js/common/language.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {

            var nid = $.getQueryString('newsId');

            $.ajax({
                type: 'get',
                url: 'getOneById',
                dataType: 'json',
                data: {'newsId': nid},
                success: function (rsp) {
                    var data1 = rsp.object;
                    var str = '';

                    var toTypeName = "";
                    if (rsp.object.toId != "") {
                        toTypeName += "部门";
                    }
                    if (rsp.object.privId != "") {
                        toTypeName += ",角色";
                    }
                    if (rsp.object.userId != "") {
                        toTypeName += ",用户";
                    }
                    if(rsp.object.anonymityYn==0){
                        $('#anonymous_personnel').hide();
                    }else if(rsp.object.anonymityYn==2){
                        $('#anonymous_personnel').hide();
                        $('#system_personnel').hide();
                        $('#add_text').attr('disabled',true);
                        $('#determine').hide();
                    }

//<a href="/common/ntkoPreview?'+encodeURI(arr[i].attUrl)+'"  target="_Blank" style="margin: 0 20px;"><fmt:message code="global.lang.view" /></a>
                    $('.title').text(data1.subject);
                    $('.title').attr("title",data1.subject);
                    str = '<li><span><fmt:message code="notice.th.publisher" />：</span><span>' + data1.users.userName + '</span></li><li><span><fmt:message code="notice.th.PostedTime" />：</span><span>' + data1.newsDateTime + '</span></li>';
                    $('ul').append(str);
                    $('.divTxt').append('<p>' + data1.content + '</p>');
                    var str1 = "";
                    var arr = new Array();
                    arr = data1.attachment;
                    if (data1.attachmentName != '') {
                        for (var i = 0; i < (arr.length); i++) {
                            str1 += '<div class="font_">附件文件：<a href="<%=basePath %>download?' + encodeURI(arr[i].attUrl) + '"><img class="img_" src="../img/enclosure.png"/>' + arr[i].attachName + '</a><a href="<%=basePath %>download?' + encodeURI(arr[i].attUrl) + '" style="margin-left:10px;"><fmt:message code="file.th.download" /></a></div>';
                        }
//                        str1 += '<tr><td class="attachment">' + data1.attachmentName + '</td></tr>';
                        $('.Table').append(str1);
                    }

                }
            });

            /*关闭按钮*/
//            $('#buttonReturn').click(function () {
//                window.close();
//                location.reload();
//            });


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
            <table class="Table" cellspacing="0" cellpadding="0">
            </table>
        </div>
    </div>
    <jsp:include page="comment.jsp"/>
    <%--<a href="javascript:void(0);" id="buttonReturn" class="button_query">关闭</a>--%>
</div>
</body>
</html>

