<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><fmt:message code="doc.th.HasOffice" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <link rel="stylesheet" href="/css/base/base.css">
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yibanshouwen.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="doc.th.HasOffice" />
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
        <label class="fl"><input type="text" name="printDate" placeholder="<fmt:message code="doc.th.enterDate"/>" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"></label>

    </label>
    <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;">
        <span class="fl" style="margin-top: 5px;"><fmt:message code="notice.th.title"/>：</span>
        <label class="fl"><input type="text" name="title" placeholder="<fmt:message code="global.lang.printsubject"/>" ></label>
        <button  type="button" class="Query fl"><fmt:message code="global.lang.query"/></button>
    </label>

</div>

<div id="pagediv">

</div>
<%--<div class="pagediv" style="margin: 0 auto;width: 97%;">--%>
    <%--<table>--%>
        <%--<thead>--%>
        <%--<tr>--%>
            <%--<th><fmt:message code="doc.th.DispatchHeader"/></th>--%>
            <%--<th><fmt:message code="doc.th.TypeDocument"/></th>--%>
            <%--<th><fmt:message code="doc.th.Scholar"/></th>--%>
            <%--<th><fmt:message code="doc.th.DispatchUnit"/></th>--%>
            <%--<th><fmt:message code="doc.th.DispatchTime"/></th>--%>
            <%--<th><fmt:message code="workflow.th.Settlingtime"/></th>--%>
            <%--<th><fmt:message code="attend.th.CurrentStep"/></th>--%>
            <%--<th><fmt:message code="notice.th.state"/></th>--%>
            <%--<th><fmt:message code="notice.th.operation"/></th>--%>
        <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>

        <%--</tbody>--%>
    <%--</table>--%>
    <%--<div id="dbgz_page" class="M-box3 fr">--%>

    <%--</div>--%>
<%--</div>--%>
<script>

    <%--var ajaxPage={--%>
        <%--data:{--%>
            <%--page:1,//当前处于第几页--%>
            <%--pageSize:7,//一页显示几条--%>
            <%--useFlag:true,--%>
            <%--documentType:1,--%>
<%--//            curUserID:1,--%>
            <%--printDate:null,--%>
            <%--dispatchType:null,--%>
            <%--title:null--%>
        <%--},--%>
        <%--init:function () {--%>
            <%--$.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {--%>
                <%--var arrTwo=json.GWTYPE;--%>
                <%--var str='<option value=""><fmt:message code="hr.th.PleaseSelect"/></option>'--%>
                <%--for(var i=0;i<arrTwo.length;i++){--%>
                    <%--str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'--%>
                <%--}--%>
                <%--$('[name="dispatchType"]').html(str)--%>
            <%--},'json')--%>

        <%--},--%>
        <%--page:function () {--%>
            <%--var me=this;--%>
            <%--this.data.printDate=$('[name="printDate"]').val();--%>
            <%--this.data.dispatchType=$('[name="dispatchType"]').val()--%>
            <%--this.data.title=$('[name="title"]').val()--%>
            <%--$.get('/document/selOverDocSendOrReceive',me.data,function (json) {--%>

                <%--var str='';--%>
                <%--var arr=json.datas--%>
                <%--for(var i=0;i<arr.length;i++){--%>
                    <%--str+='<tr>'+--%>
                        <%--'<td>'+arr[i].title+'</td>' +--%>
                        <%--'<td>'+function () {--%>
                            <%--if(arr[i].codeName){--%>
                                <%--return arr[i].codeName--%>
                            <%--}else {--%>
                                <%--return ""--%>
                            <%--}--%>
                        <%--}()+'</td>' +--%>
                        <%--'<td>'+arr[i].createrName+'</td>' +--%>
                        <%--'<td>'+function () {--%>
                            <%--if(arr[i].unit){--%>
                                <%--return arr[i].unit--%>
                            <%--}else {--%>
                                <%--return ""--%>
                            <%--}--%>
                        <%--}()+'</td>' +--%>
                        <%--'<td>'+arr[i].printDate+'</td>' +--%>
                        <%--'<td>'+function () {--%>
                            <%--if(arr[i].endTime){--%>
                                <%--return arr[i].endTime--%>
                            <%--}else {--%>
                                <%--return ""--%>
                            <%--}--%>
                        <%--}()+'</td>'+--%>
                        <%--'<td>第'+arr[i].step+'步：'+arr[i].prcsName+'</td>' +--%>
                        <%--'<td>'+function () {--%>
                            <%--if(arr[i].prFlag==3){--%>
                                <%--return '<fmt:message code="doc.th.ToReceive"/>'--%>
                            <%--}else {--%>
                                <%--return '<fmt:message code="lang.th.HaveThrough"/>'--%>
                            <%--}--%>
                        <%--}()+'</td>' +--%>
                        <%--'<td>' +--%>
                        <%--'<a href="/workflow/work/workformPreView?flowId='+arr[i].flowId+'&tabId='+arr[i].id+'&tableName='+arr[i].tableName+'&flowStep='+arr[i].step+'&runId='+arr[i].runId+'&prcsId='+arr[i].realPrcsId+'&isNomalType=false&hidden=true" target="_blank"><fmt:message code="roleAuthorization.th.ViewDetails"/></a>' +--%>
                        <%--'</td>' +--%>
                        <%--'</tr>'--%>
                <%--}--%>
                <%--$('.pagediv table tbody').html(str)--%>
                <%--me.pageTwo(json.total,me.data.pageSize,me.data.page)--%>

            <%--},'json')--%>
        <%--},--%>
        <%--pageTwo:function (totalData, pageSize,indexs) {--%>
            <%--var mes=this;--%>
            <%--$('#dbgz_page').pagination({--%>
                <%--totalData: totalData,--%>
                <%--showData: pageSize,--%>
                <%--jump: true,--%>
                <%--coping: true,--%>
                <%--homePage:'',--%>
                <%--endPage: '',--%>
                <%--current:indexs||1,--%>
                <%--callback: function (index) {--%>

                    <%--mes.data.page=index.getCurrent();--%>
                    <%--mes.page();--%>
                <%--}--%>
            <%--});--%>
        <%--}--%>
    <%--}--%>

    <%--ajaxPage.init()--%>
    <%--ajaxPage.page()--%>
    <%--$('.Query').click(function () {--%>
        <%--ajaxPage.data.page=1;--%>
        <%--ajaxPage.page()--%>
    <%--})--%>

    $.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {
        var arrTwo=json.GWTYPE;
        var str='<option value=""><fmt:message code="hr.th.PleaseSelect" /></option>'
        for(var i=0;i<arrTwo.length;i++){
            str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'
        }
        $('[name="dispatchType"]').html(str)
    },'json')

    var pageObj=$.tablePage('#pagediv','1490px',[
        {
            width:'90px',
            title:'<fmt:message code="workflow.th.liushui"/>',
            name:'runId'
        },
        {
            width:'165px',
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
            width:'125px',
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
            name:'createrName',
            selectFun:function (createrName,obj) {
                if(createrName){
                    return createrName
                }else {
                    return ""
                }
            }
        },{
            width:'160px',
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
            width:'180px',
            title:'<fmt:message code="workflow.th.Settlingtime"/>',
            name:'endTime'
        },
        {
            width:'190px',
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
                return '<fmt:message code="lang.th.HaveThrough" />'
            }
        },
        {
            width:'150px',
            title:'<fmt:message code="notice.th.operation"/>'
        }
    ],function (me) {
        me.data.printDate=$('[name="printDate"]').val();
        me.data.dispatchType=$('[name="dispatchType"]').val()
        me.data.title=$('[name="title"]').val()
//        me.data.docStatus=$('[name="status"]').val()
        me.data.documentType=1;
        //1显示  // 2不显示  //不写fn这个属性就是全显示
        me.init('/document/selOverDocSendOrReceive',[{name:'下发',fn:function (obj) {
            return 1
        }},{name:'<fmt:message code="roleAuthorization.th.ViewDetails" />',fn:function (obj) {
            return 1
        }}])
    })










    $('.Query').click(function () {
        pageObj.data.page=1;
        pageObj.data.printDate=$('[name="printDate"]').val();
        pageObj.data.dispatchType=$('[name="dispatchType"]').val()
        pageObj.data.title=$('[name="title"]').val()
//        pageObj.data.docStatus=$('[name="status"]').val()
        pageObj.init();
    })
    $(document).on('click','.editAndDelete0',function () {
        var obj=pageObj.arrs[$(this).attr('data-i')]

        layer.open({
            title: '下发公文',
            btn: ['<fmt:message code="global.lang.ok"/>', '<fmt:message code="depatement.th.quxiao"/>'],
            area: ['600px', '400px'],
            content: '<ul id="xiafagongwen" class="clearfix"></ul>',
            success:function () {
                $.get('/getCompanyAll',function (json) {
                    if(json.flag){
                        var str='';
                        var arr=json.obj;
                        for(var i=0;i<arr.length;i++){
                            str+='<li style="margin: 5px 10px;float: left">' +
                                '<label><input style="vertical-align: middle" type="checkbox" value="'+arr[i].oid+'">'+arr[i].name+'</label></li>'
                        }
                        $('#xiafagongwen').html(str);
                    }
                },'json')
            },
            yes:function (index) {

                var transferReceiveOrg='';
                $('#xiafagongwen li [type=checkbox]:checked').each(function (i,n) {
                    transferReceiveOrg+=$(this).val()+','
                })
                $.post('/documentOrg/save',{transferReceiveOrg:transferReceiveOrg,id:obj.id},function (json) {
                    if(json.flag){
                        $.layerMsg({content:'下发成功',icon:1})
                    }
                },'json')
            }
        })
    })


    $(document).on('click','.editAndDelete1',function () {
        var obj=pageObj.arrs[$(this).attr('data-i')]
        window.open('/workflow/work/workformPreView?flowId='+obj.flowId+'&flowStep='+obj.step+'' +
            '&tabId='+obj.id+'&tableName='+obj.tableName+'&runId='+obj.runId+'&' +
            'prcsId='+obj.realPrcsId+'&isNomalType=false&hidden=true')
    })

</script>
</body>
</html>
