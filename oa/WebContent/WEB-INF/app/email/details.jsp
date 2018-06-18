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
    <title><fmt:message code="email.th.mailDetails" /></title><%--邮件详情--%>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        div table tr td p{margin: 0;padding: 0;}
        body{font-family: "微软雅黑";font-size: 10pt;width: 100%;}
        .detailsContent{width: 90%;margin: 20px auto;}
        table{width: 100%;}
        table tr td a{text-decoration: none;}
        table tr td:first-of-type{width: 8%;padding-left: 10px;}
        table tr td:last-of-type{text-align: left;padding-left: 20px;}
        .detailsContent .p_txt{margin-top: 10px;padding: 0 10px;border-top: #ccc 1px solid;}
    </style>
    <script type="text/javascript">
        $(function () {
            var id=$.getQueryString('id');
            var TYPE=$.getQueryString('boxType');
            var dataBox;
            if(TYPE == 'outBox'){
                dataBox={'bodyId':id,flag:''}
            }else{
                dataBox={'emailId':id,flag:'isRead'}
            }

            $.ajax({
                type:'get',
                url:'queryByID',
                dataType:'json',
                data:dataBox,
                success:function(rsp){
                    var data2=rsp.object;
                    var sendTime=new Date((data2.sendTime)*1000).Format('yyyy-MM-dd hh:mm');
                    var str='';
                    var stra='';
                    var arr=new Array();
                    arr=data2.attachmentName.split('*');
                    $('.p_txt').find('p').remove();

                    var emailSubject = '';
                    if(data2.emailList[0].withdrawFlag=='0'){
                        emailSubject =  data2.subject ;
                    }else{
                        emailSubject =  '发件人已撤回：'+data2.subject;
                    }

                   if(data2.copyName!=''){
                        if(data2.attachmentName!=''){
                            if(data2.emailList[0].withdrawFlag=='0') {
                                for (var i = 0; i < (arr.length - 1); i++) {
                                    stra += '<div><a href="/download?' + encodeURI(data2.attachment[0].attUrl) + '"><img src="../img/icon_print_07.png" style="vertical-align: middle;" />' + arr[i] + '</a><a style="margin-left:30px;" href="/download?' + encodeURI(data2.attachment[0].attUrl) + '"><fmt:message code="file.th.download" /></a></div>';
                                }
                            }
                            str='<tr><td width="8%"><fmt:message code="email.th.main" />：</td><td width="72%">'+data2.subject+'</td></tr><tr><td><fmt:message code="email.th.sender" />：</td><td>'+data2.users.userName+'</td></tr><tr><td><fmt:message code="email.th.recipients" />：</td><td><span><img src="../img/icon_read_3_07.png"/>'+data2.emailList[0].toName+'</span></td></tr><tr><td>抄送人：</td><td>'+data2.copyName+'</td></tr><tr><td><fmt:message code="email.th.time" />：</td><td>'+sendTime+'</td></tr><tr><td><fmt:message code="email.th.file" />：</td><td class="attachment">'+stra+'</td></tr>';
                        }else{
                            str='<tr><td width="8%"><fmt:message code="email.th.main" />：</td><td width="72%">'+data2.subject+'</td></tr><tr><td><fmt:message code="email.th.sender" />：</td><td>'+data2.users.userName+'</td></tr><tr><td><fmt:message code="email.th.recipients" />：</td><td><span><img src="../img/icon_read_3_07.png"/>'+data2.emailList[0].toName+'</span></td></tr><tr><td>抄送人：</td><td>'+data2.copyName+'</td></tr><tr><td><fmt:message code="email.th.time" />：</td><td>'+sendTime+'</td></tr>';
                        }
                        <%--str='<tr><td width="8%"><fmt:message code="email.th.main" />：</td><td width="72%">'+data2.subject+'</td></tr><tr><td><fmt:message code="email.th.sender" />：</td><td>'+data2.users.userName+'</td></tr><tr><td><fmt:message code="email.th.recipients" />：</td><td><span><img src="../img/icon_read_3_07.png"/>'+data2.emailList[0].toName+'</span></td></tr><tr><td>抄送人：</td><td>'+data2.copyName+'</td></tr><tr><td><fmt:message code="email.th.time" />：</td><td>'+sendTime+'</td></tr><tr><td><fmt:message code="email.th.file" />：</td><td class="attachment">'+stra+'</td></tr>';--%>
                    }else{
                        if(data2.attachmentName!=''){
                            if(data2.emailList[0].withdrawFlag=='0') {
                                for (var i = 0; i < (arr.length - 1); i++) {
                                    stra += '<div><a href="/download?' + encodeURI(data2.attachment[0].attUrl) + '"><img src="../img/icon_print_07.png" style="vertical-align: middle;" />' + arr[i] + '</a><a style="margin-left:30px;" href="/download?' + encodeURI(data2.attachment[0].attUrl) + '"><fmt:message code="file.th.download" /></a></div>';
                                }
                            }
                            str='<tr><td width="8%"><fmt:message code="email.th.main" />：</td><td width="72%">'+data2.subject+'</td></tr><tr><td><fmt:message code="email.th.sender" />：</td><td>'+data2.users.userName+'</td></tr><tr><td><fmt:message code="email.th.recipients" />：</td><td><span><img src="../img/icon_read_3_07.png"/>'+data2.emailList[0].toName+'</span></td></tr><tr><td><fmt:message code="email.th.time" />：</td><td>'+sendTime+'</td></tr><tr><td><fmt:message code="email.th.file" />：</td><td class="attachment">'+stra+'</td></tr>';
                        }else{
                            str='<tr><td width="8%"><fmt:message code="email.th.main" />：</td><td width="72%">'+data2.subject+'</td></tr><tr><td><fmt:message code="email.th.sender" />：</td><td>'+data2.users.userName+'</td></tr><tr><td><fmt:message code="email.th.recipients" />：</td><td><span><img src="../img/icon_read_3_07.png"/>'+data2.emailList[0].toName+'</span></td></tr><tr><td><fmt:message code="email.th.time" />：</td><td>'+sendTime+'</td></tr>';
                        }
                    }
                    $('.Table').append(str);
                    var content = '';
                    if(data2.emailList[0].withdrawFlag=='0'){
                        content = data2.content;
                    }else{
                        content = '系统提示：邮件已被发件人撤回。';
                    }
                    $('.p_txt').append('<p>'+content+'</p>');
                }
            });

        }) ;
    </script>
</head>
<body>
    <div class="detailsContent">
        <table class="Table"  cellspacing="0" cellpadding="0">

        </table>
        <div class="p_txt">

        </div>
    </div>
</body>
</html>
