<%--Created by: 刘新婷
    Date: 2018-01-10
    To change this template use File | Settings | File Templates.--%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title> <fmt:message code="attend.th.seal"/></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">

    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jquery.form.min.js"></script>

    <style>
        .formUl li input[type=radio]{
            width: 16px;
        }
        .formUl li{
            width: 500px;
        }

        .clearfix input{
            float:none;
        }
     .addSign,.addAu{
            background: #00a0e9;
            margin-left: 10px;
            padding: 5px 10px;
            border-radius: 4px;
            color: #fff;
            cursor: pointer;
             float: left;
             margin-right: 30px;
     }

    </style>
</head>
<body>

<div class="headTop" style="border-bottom: 0px;">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yinzhang.png">
    </div>
    <div class="divTitle" style="margin-left: 15px;">
        <span class="titleSign" style="display: block;"> <fmt:message code="attend.th.seal"/></span>
        <span class="titleAu" style="display: none;"></span>
    </div>
    <div class="navRight" style="margin-top: 15px;float: right">
        <span class="addSign" style="display: block;"><fmt:message code="attend.th.AddSeal"/></span>
        <span class="addAu" style="display: none;"><fmt:message code="attend.th.AddKey"/></span>
    </div>
</div>


<div class="pagediv" id="pageSign" style="margin: 0 auto;width: 97%;  display: block;  margin-top: 55px;">
    <table class="list">
        <thead>
        <tr>
            <th><fmt:message code="attend.th.ElectronicSeal"/></th>
            <th><fmt:message code="depatement.th.Unitname"/></th>
            <th><fmt:message code="attend.th.KeyDisk"/></th>
            <th><fmt:message code="menuSSetting.th.menuSetting"/></th>
        </tr>
        </thead>
        <tbody>


        </tbody>
    </table>
    <div class="dbgz_page" class="M-box3 fr" style="    margin-top: 18px;margin-right: -3px">

    </div>
</div>

<div class="pagediv" id="pageAuthorize"  style="margin: 0 auto;width: 97%;  display: none;  margin-top: 55px;">
    <table class="list">
        <thead>
        <tr>
            <th style="width: 100px;"><fmt:message code="attend.th.sequence"/></th>
            <th><fmt:message code="attend.th.Authorized"/></th>
            <th><fmt:message code="notice.th.operation"/></th>
        </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
    <div class="dbgz_page" class="M-box3 fr" style="    margin-top: 18px;margin-right: -3px">

    </div>
</div>

</body>
<script type="text/javascript">
    var sId = ""; //签章id
    var sName = ""; //签章名
    var user_id=''; //用户id

    $(function () {
        signManagerList ();

            $('#pageSign').show();
            $('.addSign').show();
            $('#pageAuthorize').hide();
            $('.addAu').hide();

        //授权管理
        $(document).on('click', '.authorize', function () {
            sId = $(this).parents('tr').attr('sealId');
            sName = $(this).parents('tr').attr('sealName');
            $('#pageAuthorize').show();
            $('.addAu').show();
            $('#pageSign').hide();
            $('.addSign').hide();
            $('.titleSign').hide();
            $('.titleAu').text('<fmt:message code="attend.th.AuthorizationManagement"/> - '+sName);
            $('.titleAu').show();
            auManagerList();
        })



    //新增印章
    $(document).on('click', '.addSign', function () {
        var me = this;
            layer.open({
                type: 1,
                title: ['<fmt:message code="attend.th.AddSeal"/>', 'background-color:#2b7fe0;color:#fff;'],
                area: ['500px', '300px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save"/>', '<fmt:message code="depatement.th.quxiao"/>'],
                content: '<form id="datasave" action="/kg/addKgSignature" enctype="multipart/form-data">' +
                '<ul class="formUl">' +
                '<li class="clearfix">' +
                '<br></li>' +
                '<li class="clearfix">' +
                '<label><b>*</b><fmt:message code="attend.th.ElectronicSeal"/></label>' +
                '<input type="text" name="signatureName" id="signatureName">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label style="display: inline-block"><b>*</b><fmt:message code="depatement.th.Unitname"/></label>' +
                '<input type="text" name="signatureUnit" id="signatureUnit">' +
                '</li>' +
                '</ul>' +
                '</form>',
                btn1: function (index) {
                    if ($("#signatureName").val() == '') {
                        $.layerMsg({content: '<fmt:message code="attend.th.fillSeal"/>', icon: 2});
                        return false;
                    }
                    if ($("#signatureUnit").val() == '') {
                        $.layerMsg({content: '<fmt:message code="attend.th.fillUnit"/>', icon: 2});
                        return false;
                    }

                    $.ajax({
                        type: 'post',
                        url: '/kg/addKgSignature',
                        dataType: 'json',
                        data: {
                            signatureName: $('[name="signatureName"]').val(),
                            signatureUnit: $('[name="signatureUnit"]').val()

                        },
                        success: function (res) {
                            if (res.flag) {
                                $.layerMsg({content:  '<fmt:message code="url.th.addSuccess"/>！', icon: 1});
                                signManagerList ();
                            } else {
                                $.layerMsg({content: '<fmt:message code="hr.th.AddFailed"/>！', icon: 2})
                            }
                            layer.closeAll();
                        }
                    });

                }

            })

        })

    //编辑印章
    $(document).on('click', '.editSeal', function () {
        var signatureId = $(this).parents('tr').attr('sealId');
            layer.open({
                type: 1,
                title: ['<fmt:message code="attend.th.updateSeal"/>', 'background-color:#2b7fe0;color:#fff;'],
                area: ['500px', '300px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="depatement.th.modify"/>', '<fmt:message code="depatement.th.quxiao"/>'],
                content: '<form id="datasave" action="/kg/updateKgSignature" enctype="multipart/form-data">' +
                '<ul class="formUl">' +
                '<li class="clearfix">' +
                '<br></li>' +
                '<li class="clearfix">' +
                '<label><b>*</b><fmt:message code="attend.th.ElectronicSeal"/></label>' +
                '<input type="text" name="signatureName" id="signatureName" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label style="display: inline-block"><b>*</b><fmt:message code="depatement.th.Unitname"/></label>' +
                '<input type="text" name="signatureUnit" id="signatureUnit" value="">' +
                '</li>' +
                '</ul>' +
                '</form>',
                btn1: function (index) {
                    if ($("#signatureName").val() == '') {
                        $.layerMsg({content: '<fmt:message code="attend.th.fillSeal"/>', icon: 2});
                        return false;
                    }
                    if ($("#signatureUnit").val() == '') {
                        $.layerMsg({content: '<fmt:message code="attend.th.fillUnit"/>', icon: 2});
                        return false;
                    }

                    $.ajax({
                        type: 'post',
                        url: '/kg/updateKgSignature',
                        dataType: 'json',
                        data: {
                            signatureId: signatureId,
                            signatureName: $('[name="signatureName"]').val(),
                            signatureUnit: $('[name="signatureUnit"]').val()

                        },
                        success: function (res) {
                            if (res.flag) {
                                $.layerMsg({content:  '<fmt:message code="depatement.th.Modifysuccessfully"/>！', icon: 1});
                                signManagerList ();
                            } else {
                                $.layerMsg({content: '<fmt:message code="depatement.th.modifyfailed"/>！', icon: 2})
                            }
                            layer.closeAll();
                        }
                    });

                },
                success: function () {
                        $.post('/kg/getKgSignatureByKey', {signatureId : signatureId}, function (json) {
                            var data = json.data;
                            if (json.flag) {
                                $('#signatureName').val(data.signatureName);
                                $('#signatureUnit').val(data.signatureUnit);

                            }
                        }, 'json')
                    },

            })



        })

    //删除印章
     $(document).on('click','.delSeal',function(){
            var signatureId = $(this).parents('tr').attr('sealId');
            layer.confirm(' <fmt:message code="attend.th.qued"/>?', {
                btn: ['<fmt:message code="menuSSetting.th.menusetsure"/>', '<fmt:message code="depatement.th.quxiao"/>'],
                title: '<fmt:message code="global.lang.delete"/>'
            },function(){
                $.ajax({
                    url:'/kg/deleteKgSignature',
                    type:'post',
                    dataType:'json',
                    data:{signatureId:signatureId},
                    success:function(res){
                        if(res.flag){
                            $.layerMsg({content:'<fmt:message code="workflow.th.delsucess"/>！',icon:1});
                            signManagerList ();
                        }else{
                            $.layerMsg({content:'<fmt:message code="lang.th.deleSucess"/>！',icon:1});
                        }
                    }
                })
            },function(){
                layer.closeAll();
            })

      })

    //添加印章授权
    $(document).on('click', '.addAu', function () {
            layer.open({
                type: 1,
                title: ['<fmt:message code="document.th.SealAuthorization"/>', 'background-color:#2b7fe0;color:#fff;'],
                area: ['510px', '320px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save"/>', '<fmt:message code="depatement.th.quxiao"/>'],
                content: '<form id="datasave" action="/kg/addKgSignKey" enctype="multipart/form-data">' +
                '<ul class="formUl">' +
                '<li class="clearfix">' +
                '<br></li>' +
                '<li class="clearfix">' +
                '<label><fmt:message code="attend.th.ElectronicSeal"/></label>' +
//                '<input type="text" name="sealName" id="sealName" value="'+sName+'" readonly> ' +
                '<span class="sealName" style="line-height: 30px;font-size: 14px;    margin-left: 12px;"> </span>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label style="display: inline-block"><b>*</b><fmt:message code="attend.th.sequence"/></label>' +
                '<input type="text" name="signkeyKeysn" id="signkeyKeysn" value="" style="width: 200px;"> ' +
                '</li>' +
                '<li class="clearfix">' +
                '<label><fmt:message code="attend.th.Authorized"/></label>' +
                '<textarea name = "userId" id="userId" readonly  rows="3" cols="8" style="width: 200px;"></textarea>' +
                '<a href="javascript:;" id="addUser" style="margin-right:5px;margin-left:5px;color: #2f8ae3;margin-top: 42px; display: inline-block;"><fmt:message code="global.lang.select"/></a>' +
                '<a href="javascript:;" id="clearUser" style="color: #2f8ae3;margin-top: 42px; display: inline-block;"><fmt:message code="global.lang.empty"/></a>' +
                '</ul>' +
                '</form>',
                btn1: function (index) {
                    if ($("#signkeyKeysn").val() == '') {
                        $.layerMsg({content: '<fmt:message code="attend.th.fillKey"/>', icon: 2});
                        return false;
                    }
                    var userIdStr = $("#userId").attr("dataid");
                    if (userIdStr!="" &&  userIdStr != null && userIdStr.indexOf(",") >= 0) {
                        userIdStr = userIdStr.substring(0, userIdStr.length - 1);
                    }
                    $.ajax({
                        type: 'post',
                        url: '/kg/addKgSignKey',
                        dataType: 'json',
                        data: {
                            signId:sId,
                            signkeyKeysn: $('[name="signkeyKeysn"]').val(),
                            userIdStr: userIdStr
                        },
                        success: function (res) {
                            if (res.flag) {
                                $.layerMsg({content:  '<fmt:message code="url.th.addSuccess"/>！', icon: 1});
                                auManagerList();
                            } else {
                                $.layerMsg({content: '<fmt:message code="hr.th.AddFailed"/>！', icon: 2})
                            }
                            layer.closeAll();
                        }
                    });

                },
                success: function () {

                    $('.sealName').text(sName);
                    $('#addUser').click(function () {
                        user_id = 'userId';
                        $.popWindow('/common/selectUser');
                    })

                    $('#clearUser').click(function () {
                        $("#userId").val("");
                        $("#userId").attr("user_id", "");
                        $("#userId").attr("dataid", "");
                    })



                }

            })



        })

    //修改授权
     $(document).on('click', '.editAu', function () {
         var keyId = $(this).parents('tr').attr('keyId');
            layer.open({
                type: 1,
                title: ['<fmt:message code="attend.th.authorization"/>', 'background-color:#2b7fe0;color:#fff;'],
                area: ['510px', '320px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="menuSSetting.th.editMenu"/>', '<fmt:message code="depatement.th.quxiao"/>'],
                content: '<form id="datasave" action="/kg/updateKgSignKey" enctype="multipart/form-data">' +
                '<ul class="formUl">' +
                '<li class="clearfix">' +
                '<br></li>' +
                '<li class="clearfix">' +
                '<label><fmt:message code="attend.th.ElectronicSeal"/></label>' +
                '<span class="sealName" style="line-height: 30px;font-size: 14px; margin-left: 12px;"> </span>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label style="display: inline-block"><b>*</b><fmt:message code="attend.th.sequence"/></label>' +
                '<input type="text" name="signkeyKeysn" id="signkeyKeysn" value=""  style="width: 200px;"> ' +
                '</li>' +
                '<li class="clearfix">' +
                '<label><fmt:message code="attend.th.Authorized"/></label>' +
                '<textarea name = "userId" id="userId" readonly rows="1" cols="8" style="width: 200px;"></textarea>' +
                '<a href="javascript:;" id="addUser" style="margin-right:5px;margin-left:5px;color: #2f8ae3;margin-top: 42px; display: inline-block;"><fmt:message code="global.lang.select"/></a>' +
                '<a href="javascript:;" id="clearUser" style="color: #2f8ae3;margin-top: 42px; display: inline-block;"><fmt:message code="global.lang.empty"/></a>' +
                '</ul>' +
                '</form>',
                btn1: function (index) {
                    if ($("#signkeyKeysn").val() == '') {
                        $.layerMsg({content: '<fmt:message code="attend.th.fillKey"/>', icon: 2});
                        return false;
                    }
                    var userIdStr = $("#userId").attr("dataid");
                    if (userIdStr!="" &&  userIdStr != null && userIdStr.indexOf(",") >= 0) {
                        userIdStr = userIdStr.substring(0, userIdStr.length - 1);
                    }
                    $.ajax({
                            type: 'post',
                            url: '/kg/updateKgSignKey',
                            dataType: 'json',
                            data: {
                                signkeyId:keyId,
//                                sealId:sId,
                                signkeyKeysn: $('[name="signkeyKeysn"]').val(),
                                userIdStr: userIdStr
                            },
                        success: function (res) {
                            if (res.flag) {
                                $.layerMsg({content:  '<fmt:message code="depatement.th.Modifysuccessfully"/>！', icon: 1});
                                auManagerList();
                            } else {
                                $.layerMsg({content: '<fmt:message code="depatement.th.modifyfailed"/>！', icon: 2})
                            }
                            layer.closeAll();
                        }
                    });

                },
                success: function () {
                    $('#addUser').click(function () {
                        user_id = 'userId';
                        $.popWindow('/common/selectUser');
                    })

                    $('#clearUser').click(function () {
                        $("#userId").val("");
                        $("#userId").attr("user_id", "");
                        $("#userId").attr("dataid", "");
                    })


                    $.post('/kg/getKgSignKetByKey', {signkeyId : keyId}, function (json) {
                            var data = json.data;
                            if (json.flag) {
                                $('.sealName').text(sName);
                                $('#signkeyKeysn').val(data.signkeyKeysn);
                                $('#userId').attr("user_id", data.userIdStr);
                                $('#userId').val(data.userNameStr);

                            }
                        }, 'json')
                    }
            })



        })

     //删除授权
     $(document).on('click','.delAu',function(){
            var keyId = $(this).parents('tr').attr('keyId');
            layer.confirm(' <fmt:message code="attend.th.qued"/>?', {
                btn: ['<fmt:message code="global.lang.ok"/>', '<fmt:message code="depatement.th.quxiao"/>'],
                title: '<fmt:message code="global.lang.delete"/>'
            },function(){
                $.ajax({
                    url:'/kg/deleteKgSignKey',
                    type:'post',
                    dataType:'json',
                    data:{signkeyId:keyId},
                    success:function(res){
                        if(res.flag){
                            $.layerMsg({content:'<fmt:message code="workflow.th.delsucess"/>！',icon:1});
                        }else{
                            $.layerMsg({content:'<fmt:message code="lang.th.deleSucess"/>！',icon:1});
                        }
                        auManagerList();
                    }
                })
            },function(){
                layer.close();
                // location.reload();
            })

        })


     //金格电子印章管理数据列表
     function signManagerList(){
            $('.sm').hide();
             $('.am').show();
            $('#pageSign tbody tr').remove();
            $.ajax({
                type:'get',
                url:'/kg/getKgSignatureList',
                dataType:'json',
                success:function(res){
                    var datas = res.data;
                    var str='';
                    if(res.flag){
                        if(datas.length > 0){
                            for(var i=0;i<datas.length;i++){
                                if(datas[i].signatureStatus!=-1) {
                                    str += '<tr sealId="' + datas[i].signatureId + '" sealName="' + datas[i].signatureName + '" status="' + datas[i].signatureStatus + '">' +
                                        '<td>' + datas[i].signatureName + '</td>' +
                                        '<td>' + function () {
                                            if(datas[i].signatureUnit != undefined){
                                                return datas[i].signatureUnit;
                                            }else{
                                                return '';
                                            }
                                        }() + '</td>' +
                                        '<td>' + datas[i].signkeyKeysns + '</td>' +
                                        '<td>';
                                    if (datas[i].signatureStatus == 1) {
                                        str += '<fmt:message code="attend.th.forbidden"/>！';
                                    }
                                    str += '<a href="javascript:;" class="authorize" style="margin-right: 5px;" ><fmt:message code="attend.th.AuthorizationManagement"/></a>' +
                                        '<a href="javascript:;" class="editSeal" style="margin-right: 5px;" ><fmt:message code="global.lang.edit"/></a> ' +
                                        '<a href="javascript:;" class="delSeal" style="margin-right: 5px;" ><fmt:message code="global.lang.delete"/></a>' +
                                        '</td>' +
                                        '</tr>';
                                }
                            }
                            $('#pageSign tbody').append(str);
                        }else {
                            $.layerMsg({content:'<fmt:message code="doc.th.NoData"/>！',icon:0});
                        }

                    }else{
                        $.layerMsg({content:res.msg + '！',icon:0});
                    }
                }
            })


        }

     //授权管理数据列表
     function auManagerList() {
            $('.am').show();
            $('.sm').hide();
            $('#pageAuthorize tbody tr').remove();
         $.ajax({
             type:'get',
             url:'/kg/getKgSignKeyList',
             dataType:'json',
             data:{signId:sId},
             success:function(res){
                 var datas = res.data;
                 var str='';
                 if(res.flag){
                     if(datas.length > 0){
                         for(var i=0; i<datas.length ;i++){
                             if(datas[i].signatureStatus!=-1) {
                                 str += '<tr keyId="' + datas[i].signkeyId + '" status="' + datas[i].signatureStatus + '">' +
                                     '<td>' + datas[i].signkeyKeysn + '</td>' +
                                     '<td>' + function(){
                                     if(datas[i].userNameStr==undefined){
                                         return ''
                                     }else{
                                         return datas[i].userNameStr
                                     }
                                     }() + '</td>' +
                                     '<td>';
                                 if (datas[i].signatureStatus == 1) {
                                     str += '<fmt:message code="attend.th.prohibited"/>！';
                                 }
                                 str+='<a href="javascript:;" class="editAu" style="margin-right: 5px;" ><fmt:message code="attend.th.authorization"/></a>' +
                                     '<a href="javascript:;" class="delAu" style="margin-right: 5px;" ><fmt:message code="global.lang.delete"/></a>' +
                                     '</td>' +
                                     '</tr>';
                             }
                         }
                         $('#pageAuthorize tbody').append(str);
                     }else {
                         $.layerMsg({content:'<fmt:message code="doc.th.NoData"/>！',icon:0});
                     }

                 }else{
                     $.layerMsg({content:res.msg + '！',icon:0});
                 }
             }
         })
        }


    })







</script>
</html>
