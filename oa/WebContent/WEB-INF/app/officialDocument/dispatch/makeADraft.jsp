<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/26
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><fmt:message code="doc.th.To-doList"/></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base/base.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script src="/js/common/language.js"></script>

    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="/js/document/makeADraft.js"></script>--%>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <style>
        table{
            table-layout: fixed;
        }
    </style>
</head>
<body>
    <div class="headTop">
        <div class="headImg">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/daibanfawen.png" alt="">
        </div>
        <div class="divTitle">
            <fmt:message code="doc.th.To-doList"/>
        </div>


    </div>
    <div style="margin: 0 auto;margin-top: 46px;height: 60px;width: 97%;" class="clearfix">
        <label class="fl" style="margin-top: 16px;">
            <span class="fl" style="margin-top: 5px;"><fmt:message code="doc.th.recordType"/>：</span>
            <select name="dispatchType" id="">
                <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
            </select>
        </label>
        
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;">
            <span class="fl" style="margin-top: 5px;"><fmt:message code="global.lang.date"/>：</span>
            <label class="fl"><input name="printDate" readonly="readonly" placeholder="<fmt:message code="doc.th.enterDate"/>" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" type="text"></label>

        </label>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="notice.th.title"/>：</span>
            <label class="fl"><input name="title" placeholder="<fmt:message code="global.lang.printsubject"/>"  type="text"></label>
        </label>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="notice.th.state"/>：</span>
            <label class="fl"><select name="status">
                <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                <option value="1"><fmt:message code="lang.th.will"/></option>
                <option value="2"><fmt:message code="lang.th.Process"/></option>
            </select></label>
            <button  type="button" class="Query fl"><fmt:message code="global.lang.query"/></button>
        </label>

    </div>


    <div id="pagediv">

    </div>


    <script>
        var openRold=parent.opensload;
        var typeName;
        var huiqian;
        $.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {
            var arrTwo=json.GWTYPE;
            var str='<option value=""><fmt:message code="hr.th.PleaseSelect"/></option>'
            for(var i=0;i<arrTwo.length;i++){
                str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'
            }
            $('[name="dispatchType"]').html(str)
        },'json')




        var pageObj=$.tablePage('#pagediv','1290px',[
            {
              width:'90px',
              title:'<fmt:message code="workflow.th.liushui"/>',
              name:'runId'
            },
            {
                width:'180px',
                title:'<fmt:message code="doc.th.DispatchHeader"/>',
                name:'title',
                selectFun:function (title) {
                    if(title!=undefined){
                        return title
                    }else {
                        return ""
                    }
                }
            },
            {
                width:'122px',
                title:'<fmt:message code="doc.th.TypeDocument"/>',
                name:'codeName',
                selectFun:function (codeName,obj) {
                    if(codeName){
                        return codeName
                    }else {
                        return ""
                    }
                }
            },
            {
                width:'120px',
                title:'<fmt:message code="doc.th.Scholar"/>',
                name:'createrName'
            },{
                width:'170px',
                title:'<fmt:message code="doc.th.DispatchUnit"/>',
                name:'unit',
                selectFun:function (unit,obj) {
                    if(unit){
                        return unit
                    }else {
                        return ""
                    }
                }
            },{
                width:'180px',
                title:'<fmt:message code="doc.th.DispatchTime"/>',
                name:'printDate'
            },
            {
                width:'200px',
                title:'<fmt:message code="attend.th.CurrentStep"/>',
                name:'step',
                selectFun:function (step,obj) {
                    return '<p><fmt:message code="workflow.th.First"/>'+step+'<fmt:message code="workflow.th.step"/>：'+obj.prcsName+'</p>' +
                                '<p style="'+function () {
                                    if(obj.ifOutTime!=undefined&&obj.ifOutTime==true){
                                        return "color:red";
                                    }else {
                                        return "color:green";
                                    }
                                    }()+'">'+function () {
                                        if(obj.timeOutStr!=undefined&&obj.timeOutStr!='undefined'){
                                            return obj.timeOutStr;
                                        }else {
                                            return ""
                                    }
                            }()+'</p>'
                }
            },
            {
                width:'120px',
                title:'<fmt:message code="notice.th.state"/>',
                name:'prFlag',
                selectFun:function (prFlag) {
                    if(prFlag==1){
                        return '<fmt:message code="sup.th.NotReceived"/>'
                    }else if(prFlag==2){
                        return '<fmt:message code="lang.th.Process"/>'
                    } else if(prFlag==3){
                        return '<fmt:message code="doc.th.ToReceive"/>'
                    }else {
                        return '<fmt:message code="lang.th.HaveThrough"/>'
                    }
                }
            },
            {
                width:'108px',
                title:'<fmt:message code="notice.th.operation"/>'
            }
        ],function (me) {
            me.data.printDate=$('[name="printDate"]').val();
            me.data.dispatchType=$('[name="dispatchType"]').val()
            me.data.title=$('[name="title"]').val()
            me.data.docStatus=$('[name="status"]').val()
            me.data.documentType=0;
            //1显示  // 2不显示  //不写fn这个属性就是全显示
            me.init('/document/selWillDocSendOrReceive',[{name:'<fmt:message code="document.th.handle" />',fn:function (obj) {
                if(obj.opFlag=="1"){
                    return "<fmt:message code="document.th.handle" />"
                }else if(obj.opFlag=="0") {
                    return "<fmt:message code="workflow.th.JointlySign" />"
                }
            }},{name:'<fmt:message code="roleAuthorization.th.ViewDetails" />',fn:function (obj) {
                return 1
            }}])
        })




        $('.Query').click(function () {
            pageObj.data.page=1;
            pageObj.data.printDate=$('[name="printDate"]').val();
            pageObj.data.dispatchType=$('[name="dispatchType"]').val()
            pageObj.data.title=$('[name="title"]').val()
            pageObj.data.docStatus=$('[name="status"]').val()
            pageObj.init();
        })
    $(document).on('click','.editAndDelete0',function () {
        var obj=pageObj.arrs[$(this).attr('data-i')];
        huiqian='zhuban';

        window.open('/workflow/work/workform?flowId='+obj.flowId+'&prcsId='+obj.realPrcsId+'&flowStep='+obj.step
            +'&runId='+obj.runId+'&tabId='+obj.id+'&tableName='+obj.tableName+'&isNomalType=false&hidden=true&opFlag='+obj.opFlag)
    })


        $(document).on('click','.editAndDelete1',function () {
            var obj=pageObj.arrs[$(this).attr('data-i')];
            typeName=$(this).parent().parent().find('td')[0].innerHTML;
            window.open('/workflow/work/workformPreView?flowId='+obj.flowId+'&flowStep='+obj.step+'' +
                '&tabId='+obj.id+'&tableName='+obj.tableName+'&runId='+obj.runId+'&' +
                'prcsId='+obj.realPrcsId+'&isNomalType=false&hidden=true')
        })

    </script>
</body>
</html>
