<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/18
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html xmlns:v="urn:schemas-microsoft-com:vml">
<head>
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <title>Title</title>
    <?import namespace="v" implementation="#default#VML" ?>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <style>
        table{
            table-layout:fixed;
        }
        table tr td{
            font-size: 16px;
        }
        .tr_td tr:nth-child(odd):hover {
            background-color: #F6F7F9;
        }
        .tr_td tr:nth-child(even):hover{
            background-color: #fff;
        }
    </style>
</head>
<body>
<p class="th" style="font-size: 20px;width: 96%;text-align: center;margin: 0 auto;line-height: 50px">
    <fmt:message code="workflow.th.TheProcessBegins" />
</p>
<table width="96%" style="margin: 15px auto;table-layout: fixed;margin-top: 0px" class="tr_td trtd_d">
    <%--<thead class="TableHeader">--%>
    <%--<tr>--%>
        <%--<th  style="font-size: 20px"  nowrap="" class="th"  align="center"><fmt:message code="workflow.th.TheProcessBegins" /></th>&lt;%&ndash;流程开始&ndash;%&gt;--%>
    <%--</tr>--%>
    <%--</thead>--%>
    <tbody>

    </tbody>
</table>

<script>

    function GetRequest() {
        var url = location.search; //获取url中"?"符后的字串
        var theRequest = new Object();
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            strs = str.split("&");
            for(var i = 0; i < strs.length; i ++) {
                theRequest[strs[i].split("=")[0]]=(strs[i].split("=")[1]);
            }
        }
        return theRequest;
    }



    $.get('/flowProcess/getFlowRunPrecsAll',{
        'runId':GetRequest().rilwId
    },function (json) {
        if(json.flag){
            var designdata=json.datas;
            var str='';
            for(var i=0;i<designdata.length;i++){
                if(designdata.length==1){
                    str+='<tr class="this" style="border-right: 1px solid #ddd" prcsId='+ designdata[i].prcsId +' >' +
                        '<td width="20%" align="center"><fmt:message code="workflow.th.First" />'+(designdata[i].prcsId)+'<fmt:message code="workflow.th.step" /></td>' +/*第 步*/
                        '<td width="20%" align="center"><img src="/img/arrow_down.gif" alt=""><fmt:message code="workflow.th.Serial" />'+(i+1)+'：'+designdata[i].prcsName+'</td>' +/*序号*/
                        '<td width="60%" align="left"><img style="margin-right: 10px;" src="/img/workflow.gif" alt=""><a style=" color: red;text-decoration:underline" href="javascript:void(0)">' +
                        ''+designdata[i].userName +'&nbsp'+function () {
                            if (designdata[i].opFlag == 0) {
                                return '<fmt:message code="workflow.th.HandledBy" />'/*经办*/
                            } else if (designdata[i].opFlag == 1) {
                                return '<fmt:message code="workflow.th.host" />'/*主办*/
                            }
                        }()+'</a><span style="color: #00aa00;margin-left: 5px;">('+function () {
                            if (designdata[i].prcsFlag == 1) {
                                return '<fmt:message code="lang.th.will" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime/*未接收*/
                            } else if (designdata[i].prcsFlag == 2) {
                                return '<fmt:message code="lang.th.Process" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime/*+designdata[i].handleTime办理中*/
                            } else if (designdata[i].prcsFlag == 3) {
                                return '<fmt:message code="lang.th.Forwarded" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                <%--var handleTimes;--%>
                                <%--if(designdata[i].handleTime==undefined){--%>
                                    <%--handleTimes=''--%>
                                <%--}else {--%>
                                    <%--handleTimes=designdata[i].handleTime--%>
                                <%--}--%>
                                <%--return '<fmt:message code="workflow.th.ForwardToTheNextStep" />' + handleTimes /*转交下一步,用时*/--%>
                            } else if(designdata[i].prcsFlag == 4){
                                return '<fmt:message code="lang.th.HaveThrough" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                            }
                        }()+function () {
                            <%--if (designdata[i].prcsFlag == 2) {--%>
                                <%--return ')</span><p><fmt:message code="workflow.th.StartedOn" /> ' + designdata[i].createTime.split('.')[0] + '</p>' +/*开始于*/--%>
                                    <%--'</td>' +/*结束于*/--%>
                                    <%--'</tr>'--%>
                            <%--} else {--%>
                                <%--return   ')</span><p><fmt:message code="workflow.th.StartedOn" /> ' + designdata[i].createTime.split('.')[0] + '</p>' +/*开始于*/--%>
                                    <%--'</td>' +/*结束于*/--%>
                                    <%--'</tr>'--%>
                            <%--}--%>
                            return ')</span><p><fmt:message code="workflow.th.ArriveTo" />：' + designdata[i].createTime + '</p>' + /*开始于*/
                                '<p><fmt:message code="workflow.th.ReceiveTo" />：' + designdata[i].prcsTime + '</p><p><fmt:message code="workflow.th.DoTo" />：' + designdata[i].deliverTime + '</p></td>' + /*结束于*/
                                '</tr>'
                        }()+""
                    break;
                }else {
                    str += '<tr class="this" style="border-right: 1px solid #ddd" prcsId='+ designdata[i].prcsId +'>' +
                        '<td width="20%" align="center" style="border-right: 1px solid #ddd"><fmt:message code="workflow.th.First" />' + (designdata[i].prcsId) + '<fmt:message code="workflow.th.step" /></td>' + /*第 步*/
                        '<td width="20%" align="center" style="border-right: 1px solid #ddd"><img src="/img/arrow_down.gif" alt=""><fmt:message code="workflow.th.Serial" />' + (i + 1) + '：' + designdata[i].prcsName + '</td>' + /*序号*/
                        '<td width="60%" align="left"><img style="margin-right: 10px;" src="/img/workflow.gif" alt=""><a style=" color: red;text-decoration:underline" href="javascript:void(0)">' +
                        '' + designdata[i].userName + '&nbsp' + function () {
                            if (designdata[i].opFlag == 0) {
                                return '<fmt:message code="workflow.th.HandledBy" />'
                                /*经办*/
                            } else if (designdata[i].opFlag == 1) {
                                return '<fmt:message code="workflow.th.host" />'
                                /*主办*/
                            }
                        }() + '</a><span style="color: #00aa00;margin-left: 5px;">(' + function () {
                            if (designdata[i].prcsFlag == 1) {
                                return '<fmt:message code="lang.th.will" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                /*未接收*/
                            } else if (designdata[i].prcsFlag == 2) {
                                return '<fmt:message code="lang.th.Process" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime/*+designdata[i].handleTime办理中*/
                                /*办理中*/
                            } else if (designdata[i].prcsFlag == 3) {
                                return '<fmt:message code="lang.th.Forwarded" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                <%--var handleTimes;--%>
                                <%--if (designdata[i].handleTime == undefined) {--%>
                                    <%--handleTimes = ''--%>
                                <%--} else {--%>
                                    <%--handleTimes = designdata[i].handleTime--%>
                                <%--}--%>
                                <%--return '<fmt:message code="workflow.th.ForwardToTheNextStep" />' + handleTimes--%>
                                /*转交下一步,用时*/
                            } else if (designdata[i].prcsFlag == 4) {
                                <%--return '<fmt:message code="lang.th.HaveThrough" />' + designdata[i].handleTime--%>
                                return '<fmt:message code="lang.th.HaveThrough" />)(<fmt:message code="workflow.th.ArriveTime" />：'+ designdata[i].arriveTime +'；<fmt:message code="document.th.handleTime" />：'+ designdata[i].handleTime
                                /*已办结*/
                            } else if (designdata[i].prcsFlag == 5) {
                                return '<fmt:message code="workflow.th.FreeFlowPresettingSteps" />'
                                /*自由流程预设步骤*/
                            } else if (designdata[i].prcsFlag == 6) {
                                return '<fmt:message code="workflow.th.HasBeenSuspended" />'
                                /*已挂起*/
                            }
                        }() + function () {
                            if (designdata[i].prcsFlag == 1) {
                                return ')'
                            } else {
                                return ')</span><p><fmt:message code="workflow.th.ArriveTo" />：' + designdata[i].createTime + '</p>' + /*开始于*/
                                    '<p><fmt:message code="workflow.th.ReceiveTo" />：' + designdata[i].prcsTime + '</p><p><fmt:message code="workflow.th.DoTo" />：' + designdata[i].deliverTime + '</p></td>' + /*结束于*/
                                    '</tr>'
                            }
                        }() + ""
                }

            }
            if(json.status){
                str += '<tr style="background-color: #fff"><td colspan="3" style="text-align: center;font-size: 20px;color: #2F5C8F;font-weight: bold;">流程结束</td></tr>'
            }
            $('.tr_td tbody').html(str)
            for(var i= 0;i<$('.trtd_d .this').length;i++){
                var prcsid = $('.trtd_d .this').eq(i).attr('prcsid');
                if($('.trtd_d .this[prcsid='+ prcsid +']').length !=1){
                    $('.trtd_d .this[prcsid='+ prcsid +']').eq(0).find('td').eq(0).attr('rowspan',$('.trtd_d .this[prcsid='+ prcsid +']').length);
                    for(var j=1;j<$('.trtd_d .this[prcsid='+ prcsid +']').length;j++){
                        $('.trtd_d .this[prcsid='+ prcsid +']').eq(j).find('td').eq(0).remove();
                    }
                    break;
                }

            }
        }
    },'json')
</script>
</body>
</html>
