<%--
  Created by IntelliJ IDEA.
  User: liruixu
  Date: 2017/6/13
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<style>

</style>
<head>
    <title><fmt:message code="urlth.Nicknames" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <script type="text/javascript" src="../../lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script type="text/javascript" src="../../lib/layer/layer.js"></script>
    <script src="../lib/jquery.form.min.js"></script>
    <script src="../js/jquery/jquery.cookie.js"></script>
    <style>
        .title{
            height:35px;
            line-height:35px;
        }
        .title span{
            margin-left:0px;
            font-size:22px;
            line-height:35px;
        }
        .title img{
            margin-left:15px;
            vertical-align: middle;
            width:24px;
            height:26px;
            padding-bottom:8px;
        }

        #btn1 {
            background: url("/img/confirm.png") no-repeat;
            border: none;
            width: 65px;
            padding-left: 6px;
            height: 29px;
            line-height: 29px;
            cursor: pointer;
        }
        #btn{
            cursor: pointer;
            background-color: #6299d9;
            padding: 2px 5px;
            border-radius: 4px;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="title">
        <img src="../img/information.png" alt="个人资料">
        <span><fmt:message code="urlth.Nicknames" /></span>
    </div>
    <form method="post" action="/user/editUserExt" enctype="multipart/form-data" id="editUserExtForm">
        <table class="tr_td tableStyle" width="65%" align="center" style="margin-top:30px;">
            <tbody>
            <tr>
                <td colspan="2" style="text-align: center">
                    <fmt:message code="urlth.Nicknames" />
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData" style="width: 88px;"><img src="../img/icon_petname.jpg" alt="昵称">&nbsp;<fmt:message code="ur.th.NicknamesUser" />：</td>
                <td nowrap="" class="TableData">
                    <input type="text" name="nickName" id="nickName" style="margin: 0;" class="inp" size="5" maxlength="10" value="">&nbsp;<br>
                </td>
            </tr>
            <tr class="setImg">
                <td nowrap="" class="TableData"><img src="../img/icon_perimg.jpg" alt="上传照片">&nbsp;<fmt:message code="url.th.UploadPhotos" />：</td>
                <td nowrap="" class="TableData">
                    <span id="showImage"></span>
                    <span id="btn">上传图片</span>
                    <input type="hidden"  class="imageFile1 imageFile" name="avatar">
                    <input type="hidden"  class="imageFile1 imageFile0" name="avatar128" >
                    <input type="file"  name="imageFile" id="imageFile" class="BigInput imageFile2" size="40" title="选择图片" style="height: 27px;" onchange="getPhoto(this)">&nbsp;
                    <%-- <span>照片文件要求是jpg、jpeg、png格式，尺寸不能低于200*200像素。照片主要用于用户名片的显示。</span>--%>
                </td>
            </tr>
            <tr class="showImg" style="display: none">
                <td><img src="../img/icon_perhead.jpg" alt="头像">&nbsp;<fmt:message code="url.th.HeadPortrait" />:</td>
                <td>
                    <image  style="width:140px;height:140px;border-radius: 100%;border: 1px solid #d6d6d6;" id="image"> &nbsp;&nbsp;<input type="button" id="delImg" value="<fmt:message code="global.lang.delete" />"></image>
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableData"><img src="../img/icon_persignature.png" alt="讨论区签名档">&nbsp;<fmt:message code="url.th.Discussion" />：</td>
                <td nowrap="" class="TableData">
                    <input type="text" name="bbsSignature" id="bbsSignature" style="margin: 0" class="inp" size="25" maxlength="100" value="">&nbsp;
                </td>
            </tr>
            <tr>
                <td nowrap="" class="TableControl" colspan="2" align="center">
                    <div style="margin:0 auto;width: 130px">
                        <div class="Btn submitBut" id="btn1"><span style="margin-left: 14px;"><fmt:message code="global.lang.save" /></span></div>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</body>
<!--[if (gte IE 10)|(!IE)]> -->
<script>$('.imageFile2').remove();$('#editUserExtForm').attr('action','/user/editUserExtNew');</script>
<!-- <![endif]-->
<!--[if lt IE 10]>
<script>$('.imageFile1').remove();$('#btn').remove()</script>
<![endif]-->
<script>
    $(function () {
        init();
    })
    function init(){
        $.ajax({
            type: 'get',
            url: '../user/getUserByuid',
            dataType: 'json',
            data: uid={
                uid:$.cookie("uid")
            },
            success: function (res) {
                if(res.flag){
                    $("#nickName").val(res.object.userExt.nickName);
                    $("#nickName").attr('sex',res.object.sex);
                    $("#nickName").attr('avatar',res.object.avatar);
                    $("#bbsSignature").val(res.object.userExt.bbsSignature);
                    if(res.object.avatar==''){
                        $('.showImg').hide();
                    }else{
                        if(res.object.avatar == '0'){
                            $('#image').attr('src','../img/boyMax.png');
                        }else if(res.object.avatar == '1'){
                            $('#image').attr('src','../img/girlMax.png');
                        }else if(res.object.avatar == ''){
                            if(res.object.sex == '1'){
                                $('#image').attr('src','../img/girlMax.png');
                            }else{
                                $('#image').attr('src','../img/boyMax.png');
                            }
                        }else{
                            $('#image').attr('src','../img/user/'+res.object.avatar);
                        }
                        $('.imageFile').val(res.object.avatar);
                        $('.imageFile0').val(res.object.avatar128);
                        $('.showImg').show();
                    }
                }
            }
        })
    }
    $(".submitBut").click(function () {
        $('#editUserExtForm').ajaxSubmit({
            type:'post',
            dataType:'json',
            success:function (json) {
                if(json.flag) {
                    $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                        init();
                    });
                }else{
                    $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                    });
                }
            }
        })
    })
    $('#btn').click(function(){
        console.log($(document).height())
        if($(document).height()<700){
            var height = 452;
        }else if($(document).height()>800){
            var height = 712;
        }else{
            var height = 612;
        }
        layer.open({
            type: 1,
            title: ['上传图片', 'background-color:#2b7fe0;color:#fff;'],
            area: ['800px', height+'px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.ok" />'],
            content:'<div style="width: 100%;height: 100%;"><iframe id="every_module" src="form?avter='+$("#nickName").attr('avatar')+'&sex='+$("#nickName").attr('sex')+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>',
            yes:function(index){
                layer.close(index);
            }
        })
    })
    $('#delImg').on('click',function(){
        $("#imageFile").val('');
        $('.imageFile1').val('');
        $('.setImg').show();
        $('.showImg').hide();
    })
    function getPhoto(node) {
        $('.showImg').hide();
    }

</script>
</html>
