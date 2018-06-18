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
    <title><fmt:message code="dem.th.Poag" /></title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="/css/base/base.css" />
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <link rel="stylesheet" href="/css/notice/noticeManagement.css">

    <%--<link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="../css/news/management_query.css" />--%>

    <!-- 新闻管理  -->
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>

    <script src="../lib/laydate.js"></script>
    <script src="../lib/layer/layer.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>


    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/tablePage.js"></script>
    <style>
        .total{
            width: 98%;
            margin: auto;
            margin-top: 118px;
        }
        .navigation{
            background: none;

        }
        a {
            text-decoration: none;
            color: #207bd6;
            cursor: pointer;
        }
        select{
            padding: 5px 8px !important;
        }
        td{
            font-size: 14px;
            line-height: 19px;
            word-break: keep-all;
            white-space: nowrap;
            text-overflow: ellipsis;
            -webkit-box-orient: vertical;
            overflow: hidden;
            text-align: center;
        }
        .query {
            width: 550px;
            margin: 133px auto;
        }
        b{
            color: red;
        }

        .all{
            padding-left: 38px;
            display: none;
        }
        .all li{
            margin: 5px 0;
        }

        .btnsava {
            padding: 5px 15px;
            border-radius: 4px;
            background: #2b7fe0;
            color: #fff;
        }

    </style>
</head>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
<div class="head-top">
    <ul class="clearfix">
        <li class="fl head-top-li active" data-type=""><fmt:message code="dem.th.Poag" /></li>
        <li class="fl head-top-img"><img src="/img/twoth.png" alt=""></li>
        <li class="fl head-top-li" data-type="0"><fmt:message code="dem.th.shfdg" /></li>
        <%--<div style="padding-right:10px;" class="newBtn" id="user_btn">--%>
        <%--<div class="div_IMG">--%>
        <%--<img src="../img/sys/icon_newlyBuild.png" style="vertical-align: middle;" alt="新建公司">--%>
        <%--</div>--%>
        <%--<div class="div_txt">新建</div>--%>
        <%--</div>--%>
    </ul>
</div>
<div class="navigation" style="margin-top: 46px;">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/daishen.png" alt="">
    <h2><fmt:message code="dem.th.Poag" /></h2>
</div>

<div class="portal" >
    <form id="queryNews">
        <table class="clearfix total">
            <thead>
            <tr>
                <th><fmt:message code="vote.th.SortNumber" /></th>
                <th><fmt:message code="dem.th.PortalName" /></th>
                <th><fmt:message code="dem.th.PortaType" /></th>
                <th><fmt:message code="dem.th.PortalAddress" /></th>
                <th><fmt:message code="dem.th.Enabledstate" /></th>
                <th><fmt:message code="notice.th.operation" /></th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </form>
</div>

<div class="portalTime" style="display: none">
    <div class="query">
        <div class="header"><fmt:message code="vote.th.Sorg" /></div>
        <form id="ajaxform" action="">
            <input type="hidden" name="read">
            <input type="hidden" name="sendTime">
            <table style="width: 100%">
                <tbody>

                <tr class="borderNone" >
                    <%--<td width="30%" class="color"><fmt:message code="notice.th.content"/>：</td>--%>
                    <td width="100%" colspan="2" >
                        <input id="times" style="padding-left: 10px;width: 50%;height: 30px;" type="text" placeholder="<fmt:message code="doc.th.enterTime" />" name="times"> <fmt:message code="system.th.second" />
                    </td>
                </tr>
                <tr class="borderNone">
                    <td colspan="2" style="text-align: center">
                        <a href="javascript:;" class="btnsava" onclick="ajaxtimes()"><fmt:message code="global.lang.ok" /></a>
                        <%--<a href="javascript:;" style="margin-left: 10px" class="btnsava chongtian"  ><fmt:message code="global.lang.refillings"/></a>--%>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
    </div>
</div>


<script>

    $(function () {
        $.ajax({
            type:'post',
            url:'/portals/selPortals',
            dataType:'json',
            data:{
//                page:1,
//                pageSize:10,
            },
            success:function (json) {
                if(json.flag){
                    var v=1;
                    var arr=json.obj;
                    var str=''
                    var del=''
                    for(var i=0;i<arr.length;i++){
                        if(arr[i].portalLink==undefined){arr[i].portalLink=''}
                        if(arr[i].useFlag==undefined){arr[i].useFlag=''}
                        if(arr[i].useFlag=='1'){arr[i].useFlag='√'}
                        if(arr[i].useFlag=='0'){arr[i].useFlag='×'}
                        if(arr[i].portalType=='0'){
                            arr[i].portalType='<fmt:message code="global.lang.portal" />'
                            del=''
                        }
                        if(arr[i].portalType=='1'){
                            arr[i].portalType='<fmt:message code="global.lang.stom" />'
                            del='<fmt:message code="global.lang.delete" />'
                        }
                        str+='<tr><td>'+ arr[i].portalsNo +'</td>\
                  <td>'+arr[i].portalName+'</td>\
                  <td>'+arr[i].portalType+'</td>\
                  <td>'+arr[i].portalLink+'</td>\
                  <td>'+arr[i].useFlag+'</td>\
                        <td>'
                            +'<a href="javascript:void (0)" class="newsBtntwo" onclick="stoprwo(' + arr[i].portalsId + ')"><fmt:message code="global.lang.edit" /></a>\
                         <a href="javascript:void (0)" onclick="deleteList(' + arr[i].portalsId + ')">'+del+'</a>\
                    </td></tr>'
                    }
                    $('#queryNews table tbody').html(str)
                }
            }
        })
    })

    function portal() {
        $('.navigation h2').html('<fmt:message code="dem.th.Poag" />');
        $('.navigation img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/daishen.png')
    }
    function portalTime() {
        $('.navigation h2').html('<fmt:message code="dem.th.shfdg" />');
        $('.navigation img').attr('src','/img/commonTheme/${sessionScope.InterfaceModel}/yishen.png')
    }

    $('.head-top li').click(function () {
        $(this).siblings('li').removeClass('active')
        $(this).addClass('active')
        if($(this).attr('data-type')==''){
            portal()
            $('.portalTime').hide()
            $('.portal').show()
            $('.newBtn').show()
        }else if($(this).attr('data-type')=='0'){
            portalTime()
            $('.portalTime').show()
            $('.portal').hide()
            $('.newBtn').hide()

            $.ajax({
                type:'post',
                url:'/syspara/selectTheSysPara',
                dataType:'json',
                data: {
                    paraName:'PORTALS_TIME'
                },
                success:function(res){
                    var obj = res.object;
                    if(obj[0].paraValue != ''&&obj[0].paraValue !=undefined){
                        $('#times').val(obj[0].paraValue)
                    }

                }
            })
        }
    })
    portal()

    //新建
    $('#user_btn').on('click',function () {

        layer.open({
            type: 1,
            title:['<fmt:message code="global.lang.new" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['700px', '500px'],
            shadeClose: true, //点击遮罩关闭
            // btn: ['创建', '取消'],
            content:'<form id="saveRule" class="layui-form"><div class="inputlayout">' +
            '<ul>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="vote.th.SortNumber" /> ：</label><input id="deptNos" type="text" name="portalsNo" value=""><b style="padding-left: 10px;">* </b>' +
            '</li>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="dem.th.PortalName" /> ：</label><input type="text" name="portalName" value=""><b style="padding-left: 10px;">* </b>' +
            '</li>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="dem.th.PortaType" />：</label>' +
            ' <select style=" padding:5px 0;border: 1px solid #ddd;border-radius: 4px;; margin-left: 28px;width: 300px;display: inline-block" class="portalType" name="portalType">'+
//                '<option value="">请选择</option>'+
            '<option value="0"><fmt:message code="global.lang.portal" /></option>'+
            '<option value="1"><fmt:message code="global.lang.stom" /></option>'+
            '</select>' +
            '</li>' +
            '<li class="clearfix xadres" style="display:none">' +
            '<label><fmt:message code="global.lang.dfgsht" />：</label><input type="text" name="portalLink">' +
            '</li>' +
            '<li class="clearfix zadres" style="display:none">' +
            '<label><fmt:message code="global.lang.dutr" /> ：</label><input type="text" name="moduleId" value="">' +
            '</li>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="dem.th.shry" />：</label>' +
            ' <select style=" padding:5px 0;border: 1px solid #ddd;border-radius: 4px;; margin-left: 28px;width: 300px;display: inline-block" name="useFlag">'+
//                '<option value="">请选择</option>'+
            '<option value="0"><fmt:message code="three.th.Disable" /></option>'+
            '<option value="1"><fmt:message code="user.th.kjnf" /></option>'+
            '</select><b style="padding-left: 10px;">* </b>   ' +
            '</li>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="doc.th.Licen" /> ：</label>' +
            '<input type="text" name="accessPrivDept" id="accessPrivDept" /><b style="padding-left: 10px;"> </b>'+
            '<a style="margin: 0 10px;" class="deptAdd"><fmt:message code="global.lang.add" /></a>'+
            '<a class="deptClear"><fmt:message code="global.lang.empty" /></a>'+
            '</li>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="doc.th.Autho" /> ：</label>' +
            '<input type="text" name="accessPrivPriv" id="accessPrivPriv"  class="BigInput" value="" privid="" userpriv=""><b style="padding-left: 10px;"> </b>'+
            '<a style="margin: 0 10px;" href="javascript:;" class="userPrivAdd" name="orgAdd" ><fmt:message code="global.lang.add" /></a>'+
            '<a href="javascript:;" class="userPrivClear" name="orgClear"><fmt:message code="global.lang.empty"/></a>'+
            '</li>' +
            '<li class="clearfix">' +
            '<label><fmt:message code="attend.th.Authorized" /> ：</label>' +
            '<input type="text" name="accessPrivUser" id="accessPrivUser" /><b style="padding-left: 10px;"> </b>'+
            '<a style="margin: 0 10px;" class="userAdd"><fmt:message code="global.lang.add" /></a>'+
            '<a class="userClear"><fmt:message code="global.lang.empty" /></a>'+
            '</li>' +
            '</ul>' +
            '</div></form>',
            btn: ['<fmt:message code="global.lang.save" />','<fmt:message code="depatement.th.quxiao" />'],
            btn1: function (index) {
                if ($('[name="portalsNo"]').val() == "") {
                    $.layerMsg({ content: '<fmt:message code="netdisk.th.trhr" />', icon: 2 });
                    return false;
                };
                if ($('[name="portalType"]').val() == "") {
                    $.layerMsg({ content: '<fmt:message code="netdisk.th.tyjb" />', icon: 2 });
                    return false;
                };
                if ($('[name="portalName"]').val() == "") {
                    $.layerMsg({ content: '<fmt:message code="netdisk.th.tyjo" />', icon: 2 });
                    return false;
                };
//                    if ($('#accessPrivDept').attr('deptid') == "" || $('#accessPrivDept').attr('deptid') == undefined) {
//                        $.layerMsg({ content: '请填写授权部门', icon: 2 });
//                        return false;
//                    };
//                    if ($('#accessPrivPriv').attr('userpriv') == "" || $('#accessPrivPriv').attr('userpriv') == undefined) {
//                        $.layerMsg({ content: '请填写授权角色', icon: 2 });
//                        return false;
//                    };
//                    if ($('#accessPrivUser').attr('user_id') == "" || $('#accessPrivUser').attr('user_id') == undefined) {
//                        $.layerMsg({ content: '请填写授权用户', icon: 2 });
//                        return false;
//                    };
                $.ajax({
                    type:'post',
                    url:'/portals/add',
                    dataType:'json',
                    data:{
                        portalsNo:$('[name="portalsNo"]').val(),
                        portalName:$('[name="portalName"]').val(),
                        moduleId:$('[name="moduleId"]').val(),
                        portalLink:$('[name="portalLink"]').val(),
                        portalType: $('select[name="portalType"] option:checked').val(),
                        useFlag: $('select[name="useFlag"] option:checked').val(),
                        accessPrivDept: $('#accessPrivDept').attr('deptid'),
                        accessPrivPriv: $('#accessPrivPriv').attr('userpriv'),
                        accessPrivUser: $('#accessPrivUser').attr('user_id'),
                    },
                });
                layer.close(index);
                location.reload();
            },
            success:function(res){
                if($('.portalType option:selected').val()=='0'){
                    $('.xadres').show()
                    $('.zadres').hide()
                }
                if($('.portalType option:selected').val()=='1'){
                    $('.zadres').show()
                    $('.xadres').hide()
                }
                //限制排序号只能输入三位有效数字
                var text2 = document.getElementById("deptNos");
                text2.onkeyup = function(){
                    this.value=this.value.replace(/\D/g,'');
                    if(text2.value.length>3){
                        text2.value = '';
                    }
                }

                $('.portalType').change(function () {
                    if($('.portalType option:selected').val()=='0'){
                        $('.xadres').show()
                        $('.zadres').hide()
                    }
                    if($('.portalType option:selected').val()=='1'){
                        $('.zadres').show()
                        $('.xadres').hide()
                    }


                })



                if(res.flag){
                    console.log(res.flag)
                }
            },

        });

    })

    //编辑

    function stoprwo(me){
        $.ajax({
            type:'post',
            url:'/portals/selPortalsById',
            dataType:'json',
            data: {
                portalsId: me
            },
            success:function(res){
                if(res.flag){
                    var data=res.object;
                    if(data.moduleId==undefined){data.moduleId=''}
                    if(data.portalLink==undefined){data.portalLink=''}
                    layer.open({
                        type: 1,
                        title:['<fmt:message code="global.lang.new" />', 'background-color:#2b7fe0;color:#fff;'],
                        area: ['700px', '500px'],
                        shadeClose: true, //点击遮罩关闭
                        // btn: ['创建', '取消'],
                        content:'<form id="saveRule" class="layui-form"><div class="inputlayout">' +
                        '<ul>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="vote.th.SortNumber" /> ：</label><input id="deptNos" type="text" name="portalsNo" value="'+data.portalsNo+'"><b style="padding-left: 10px;">* </b>' +
                        '</li>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="dem.th.PortalName" /> ：</label><input type="text" name="portalName" value="'+data.portalName+'"><b style="padding-left: 10px;">* </b>' +
                        '</li>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="dem.th.PortaType" />：</label>' +
                        ' <select style=" padding:5px 0;border: 1px solid #ddd;border-radius: 4px;; margin-left: 28px;width: 300px;display: inline-block" class="portalType" name="portalType">'+
//                '<option value="">请选择</option>'+
                        '<option value="0"><fmt:message code="global.lang.portal" /></option>'+
                        '<option value="1"><fmt:message code="global.lang.stom" /></option>'+
                        '</select>' +
                        '</li>' +
                        '<li class="clearfix xadres" style="display:none">' +
                        '<label><fmt:message code="global.lang.dfgsht" />：</label><input type="text" name="portalLink" value="'+data.portalLink+'">' +
                        '</li>' +
                        '<li class="clearfix zadres" style="display:none">' +
                        '<label><fmt:message code="global.lang.dutr" />  ：</label><input type="text" name="moduleId" value="'+data.moduleId+'">' +
                        '</li>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="dem.th.shry" />：</label>' +
                        ' <select style=" padding:5px 0;border: 1px solid #ddd;border-radius: 4px;; margin-left: 28px;width: 300px;display: inline-block" name="useFlag">'+
//                '<option value="">请选择</option>'+
                        '<option value="0"><fmt:message code="three.th.Disable" /></option>'+
                        '<option value="1"><fmt:message code="user.th.kjnf" /></option>'+
                        '</select><b style="padding-left: 10px;">* </b>   ' +
                        '</li>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="depatement.th.serh" />：</label>' +
                        ' <select style=" padding:5px 0;border: 1px solid #ddd;border-radius: 4px;; margin-left: 28px;width: 300px;display: inline-block" class="uxo" name="accessPriv">'+
//                '<option value="">请选择</option>'+
                        '<option value="0"><fmt:message code="depatement.th.gsbf" /></option>'+
                        '<option value="1"><fmt:message code="netdisk.th.ryhndf" /></option>'+
                        '</select><b style="padding-left: 10px;"> </b>   ' +
                        '</li>' +
                        '<div class="all">' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="doc.th.Licen" /> ：</label>' +
                        '<input type="text" name="accessPrivDept" id="accessPrivDept" /><b style="padding-left: 10px;"> </b>'+
                        '<a style="margin: 0 10px;" class="deptAdd"><fmt:message code="global.lang.add" /></a>'+
                        '<a class="deptClear"><fmt:message code="global.lang.empty" /></a>'+
                        '</li>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="doc.th.Autho" /> ：</label>' +
                        '<input type="text" name="accessPrivPriv" id="accessPrivPriv"  class="BigInput" value="" privid="" userpriv=""><b style="padding-left: 10px;"></b>'+
                        '<a style="margin: 0 10px;" href="javascript:;" class="userPrivAdd" name="orgAdd" ><fmt:message code="global.lang.add" /></a>'+
                        '<a href="javascript:;" class="userPrivClear" name="orgClear"><fmt:message code="global.lang.empty"/></a>'+
                        '</li>' +
                        '<li class="clearfix">' +
                        '<label><fmt:message code="attend.th.Authorized" /> ：</label>' +
                        '<input type="text" name="accessPrivUser" id="accessPrivUser" /><b style="padding-left: 10px;"> </b>'+
                        '<a style="margin: 0 10px;" class="userAdd"><fmt:message code="global.lang.add" /></a>'+
                        '<a class="userClear"><fmt:message code="global.lang.empty" /></a>'+
                        '</li>' +
                        '</div>' +
                        '</ul>' +
                        '</div></form>',
                        btn: ['<fmt:message code="global.lang.save" />','<fmt:message code="depatement.th.quxiao" />'],
                        success:function(res){
                            checkehuo('portalType', data.portalType);
                            checkehuo('useFlag', data.useFlag);
                            checkehuo('accessPriv', data.accessPriv);

                            if($('.portalType option:selected').val()=='0'){
                                $('select[name="portalType"]').attr("disabled","disabled")
                                $('input[name="portalLink"]').attr("disabled","disabled")
                                $('.xadres').show()
                                $('.zadres').hide()
                            }
                            if($('.portalType option:selected').val()=='1'){

                                $('.zadres').show()
                                $('.xadres').hide()
                            }


                            if($('.uxo option:selected').val()=='0'){
                                $('.all').hide()
                            } else {
                                $('.all').show()
                            }

                            //限制排序号只能输入三位有效数字
                            var text2 = document.getElementById("deptNos");
                            text2.onkeyup = function(){
                                this.value=this.value.replace(/\D/g,'');
                                if(text2.value.length>3){
                                    text2.value = '';
                                }
                            }



                            $('.portalType').change(function () {
                                if($('.portalType option:selected').val()=='0'){
                                    $('.xadres').show()
                                    $('.zadres').hide()
                                }
                                if($('.portalType option:selected').val()=='1'){
                                    $('.zadres').show()
                                    $('.xadres').hide()
                                }


                            })

                            $('.uxo').change(function () {

                                if($('.uxo option:selected').val()=='0'){
                                    $('.all').hide()
                                }
                                if($('.uxo option:selected').val()=='1'){
                                    $('.all').show()
                                }

                            })



                            var privt = data.privDept;
                            var priv = data.privPriv;
                            var priu = data.privUser;
                            var sr1='',sr11='',sr2='',sr22='',sr3='',sr33=''
                            if(data.privDept!='' && data.privDept!=undefined){
                                for(var i=0;i<privt.length;i++){
                                    sr1 += privt[i].deptName+',';
                                    sr11 += privt[i].deptId+','
                                }
                                $('#accessPrivDept').val(sr1)
                                $('#accessPrivDept').attr('deptid', sr11)
                            }

                            if(data.privPriv!='' && data.privPriv!=undefined){
                                for(var i=0;i<priv.length;i++){
                                    sr2 += priv[i].privName+',';
                                    sr22 += priv[i].userPriv+','
                                }
                                $('#accessPrivPriv').val(sr2)
                                $('#accessPrivPriv').attr('userpriv', sr22)
                            }

                            if(data.privUser!='' && data.privUser!=undefined){
                                for(var i=0;i<priu.length;i++){
                                    sr3 += priu[i].userName+',';
                                    sr33 += priu[i].uid+','
                                }
                                $('#accessPrivUser').val(sr3)
                                $('#accessPrivUser').attr('user_id', sr33)
                            }




                        },
                        yes: function (index) {
                            if ($('[name="portalsNo"]').val() == "") {
                                $.layerMsg({ content: '<fmt:message code="netdisk.th.trhr" />', icon: 2 });
                                return false;
                            };
                            if ($('[name="portalName"]').val() == "") {
                                $.layerMsg({ content: '<fmt:message code="netdisk.th.tyjo" />', icon: 2 });
                                return false;
                            };
//                    if ($('#accessPrivDept').attr('deptid') == "" || $('#accessPrivDept').attr('deptid') == undefined) {
//                        $.layerMsg({ content: '请填写授权部门', icon: 2 });
//                        return false;
//                    };
//                    if ($('#accessPrivPriv').attr('userpriv') == "" || $('#accessPrivPriv').attr('userpriv') == undefined) {
//                        $.layerMsg({ content: '请填写授权角色', icon: 2 });
//                        return false;
//                    };
//                    if ($('#accessPrivUser').attr('user_id') == "" || $('#accessPrivUser').attr('user_id') == undefined) {
//                        $.layerMsg({ content: '请填写授权用户', icon: 2 });
//                        return false;
//                    };
                            $.ajax({
                                type:'post',
                                url:'/portals/update',
                                dataType:'json',
                                data:{
                                    portalsId: me,
                                    portalsNo:$('[name="portalsNo"]').val(),
                                    portalName:$('[name="portalName"]').val(),
                                    moduleId:$('[name="moduleId"]').val(),
                                    portalLink:$('[name="portalLink"]').val(),
                                    portalType: $('select[name="portalType"] option:checked').val(),
                                    accessPriv: $('select[name="accessPriv"] option:checked').val(),
                                    useFlag: $('select[name="useFlag"] option:checked').val(),
                                    accessPrivDept: $('#accessPrivDept').attr('deptid'),
                                    accessPrivPriv: $('#accessPrivPriv').attr('userpriv'),
                                    accessPrivUser: $('#accessPrivUser').attr('user_id'),
                                },
                            });
                            layer.close(index);
                            location.reload();
                        },

                    });
                }

            }

        });
    }

    function checkehuo(name, val) {
        if (val == '') {
            return;
        }
        $('[name="' + name + '"]').find('option').each(function(i, n) {
            if ($(this).val() == val) {
                $(this).attr('selected', 'selected')
            } else {
                $(this).removeAttr('selected', 'selected')
            }
        })
    }
    // 获取角色信息控件
    $(document).on("click",".userPrivAdd",function(){
        priv_id="accessPrivPriv";
        $.popWindow("../common/selectPriv");
    });
    // 清空角色信息
    $(document).on('click','.userPrivClear',function () {
        $('#accessPrivPriv').attr("privid","");
        $('#accessPrivPriv').attr("userpriv","");
        $('#accessPrivPriv').val("");
    });

    // 获取部门信息控件
    $(document).on("click",".deptAdd",function(){
        dept_id="accessPrivDept";
        $.popWindow("../common/selectDept");
    });
    // 清空部门信息
    $(document).on('click','.deptClear',function () {
        $('#accessPrivDept').attr("deptid","");
        $('#accessPrivDept').attr("deptno","");
        $('#accessPrivDept').val("");
    });

    //选人控件
    $(document).on("click",".userAdd",function(){
        user_id='accessPrivUser';
        $.popWindow("../common/selectUser");

    });
    // 清空用户信息
    $(document).on('click','.userClear',function () {
        $('#accessPrivUser').attr("username","");
        $('#accessPrivUser').attr("user_id","");
        $('#accessPrivUser').attr("dataid","");
        $('#accessPrivUser').attr("userprivname","");
        $('#accessPrivUser').val("");
    });

    function deleteList(me) {

        layer.confirm('<fmt:message code="attend.th.qued" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteInformation" />"
        }, function() {
            //确定删除，调接口
            $.ajax({
                type: 'post',
                url: '/portals/deletePortals',
                dataType: 'json',
                data: {
                    portalsIds: me
                },
                success: function(res) {
                    if (res.flag) {
                        $.layerMsg({ content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1 });
                    } else {
                        $.layerMsg({ content: '<fmt:message code="lang.th.deleSucess" />！', icon: 1 });
                    }
                    location.reload();
                }
            })
        }, function() {

            layer.closeAll();
        });

    }

    // 时间


    var text3 = document.getElementById("times");
    text3.onkeyup = function(){
        this.value=this.value.replace(/\D/g,'');
    }

    function ajaxtimes() {
        var tm = $('#times').val()
        $.ajax({
            type:'post',
            url:'/syspara/updateSysParaByParaName',
            dataType:'json',
            data: {
                paraName:'PORTALS_TIME',
                paraValue: tm
            },
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully" />',icon:1})
                }
            }
        })
    }


</script>

</body>
</html>
