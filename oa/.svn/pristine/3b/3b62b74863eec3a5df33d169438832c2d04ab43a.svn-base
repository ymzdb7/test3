<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
    <head>
        <title><fmt:message code="workflow.th.Processdes"/></title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <!--[if lte IE 8]>
            <script type="text/javascript" src="/static/js/ccorrect_btn.js"></script>
        <![endif]-->

        <script type="text/javascript" >
            var MYOA_JS_SERVER = "";
            var MYOA_STATIC_SERVER = "";
        </script>
    </head>

    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        ul{list-style:disc;}
        ol{list-style:decimal;}
        .clear,.new_edit_left_title{
            margin-left: 20px;
            color: #138eee;
        }
        .clear h2,.new_edit_left_title h2{
           line-height: 0px;
            color:#000;

            font-weight: normal;
        }
        table{
            color:#000;
            margin-left:20px;
        }
    </style>
    <body>
        <div style="min-width:500px;">
            <div class="clearfix" style="border-bottom:3px solid #3f9bca;margin-left:20px;margin-top:20px;font-weight:bold;font-size:14px;margin-right:20px;">
                <div>
                    <span class="liucheng_shuoming"><fmt:message code="main.th.nameApplication"/></span>
                </div>
            </div>
            <div class="new_edit_left_title new_edit_margin_left">
                <span  class="new_edit_left_title_span">
                    <fmt:message code="main.th.Caption"/>		</span>
            </div>
            <div class="clear" style="clear:both;float:none;margin-left:40px;margin-right:40px;">
                <h2 class="word_speak" style="margin-left:40px;line-height:30px;"></h2>
            </div>
            <div class="new_edit_left_title new_edit_margin_left">
                <span  class="new_edit_left_title_span" >
                    <fmt:message code="workflow.th.shuoming"/>		</span>
            </div>
            <div class="clear" style="margin-right:20px;margin-left:20px;">
                <table border="0" class="speak_document" style="min-width:50px;width:100%;">
                <%--    <tr>
                        <td>
                            <span style="margin-left:40px;line-height:30px;">
                                无说明文档					</span>
                        </td>
                    </tr>--%>
                </table>
            </div>
        </div>
    </body>
    <script>
        $(function(){
            var flowId=$.getQueryString("flowId");
            var formId=$.getQueryString("formId");
            $.ajax({
                url: '/flow/selectAttachment',
                type: 'get',
                data: {
                    formId: formId,
                    flowId:flowId
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.object;
                    var res=data.attachment;
                    var str='';

                   /* /flow/selectAttachment?flowId=&formId=*/
                    if(obj.flag==true){
                        var name = data.flowName;
                        var word=data.flowDesc;
                        $('.liucheng_shuoming').html('<fmt:message code="workflow.th.processname"/>：'+name);
                        if(data.flowDesc=''){
                            $('.liucheng_shuoming').html('<fmt:message code="main.th.Notext"/>')
                        }else{
                            $('.word_speak').html(word);
                        }
                      if(data.attachment==''){
                           $('.speak_document').html('<fmt:message code="main.th.NoDocument"/>');
                       }else{
                           for(var i=0;i<res.length;i++){
                               str+='<tr><td><span style="margin-left:40px;line-height:30px;"><a href="/download?'+res[i].attUrl+'"><img style="margin-right:10px;" src="../../img/attachment_icon.png"/>'+res[i].attachName+'</a></span></td></tr>'
                           }
                           $('.speak_document').html(str);
                       }



                    }
                }
            })
        })
    </script>
</html>
