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
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>jQuery头像裁剪前端代码</title>
    <style>
        @charset "utf-8";
        .container {
            width: 512px;
            margin: auto;
            position: relative;
            font-family: 微软雅黑;
            font-size: 12px;
        }

        .container p {
            line-height: 12px;
            line-height: 0px;
            height: 0px;
            margin: 10px;
            color: #bbb
        }

        .action {
            width: 515px;
            height: 30px;
            margin: 10px 0;
        }

        .imageBox {
            position: relative;
            height: 512px;
            width: 512px;
            border: 1px solid #aaa;
            background: #fff;
            overflow: hidden;
            background-repeat: no-repeat;
            cursor: move;
            box-shadow: 4px 4px 12px #B0B0B0;
        }

        .imageBox .thumbBox {
            position: absolute;
            width: 512px;
            height: 512px;
            box-sizing: border-box;
            border: 1px solid rgb(102, 102, 102);
            box-shadow: 0 0 0 1000px rgba(0, 0, 0, 0.5);
            background: none repeat scroll 0% 0% transparent;
        }

        .imageBox .spinner {
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
            text-align: center;
            line-height: 512px;
            background: rgba(0, 0, 0, 0.7);
        }

        .Btnsty_peyton {
            float: right;
            width: 66px;
            display: inline-block;
            margin-bottom: 10px;
            height: 57px;
            line-height: 57px;
            font-size: 20px;
            color: #FFFFFF;
            margin: 0px 2px;
            background-color: #f38e81;
            border-radius: 3px;
            text-decoration: none;
            cursor: pointer;
            box-shadow: 0px 0px 5px #B0B0B0;
            border: 0px #fff solid;
        }

        /*选择文件上传*/
        .new-contentarea {
            width: 165px;
            overflow: hidden;
            margin: 0 auto;
            position: relative;
            float: left;
        }

        .new-contentarea label {
            width: 100%;
            height: 100%;
            display: block;
        }

        .new-contentarea input[type=file] {
            width: 188px;
            height: 60px;
            background: #333;
            margin: 0 auto;
            position: absolute;
            right: 50%;
            margin-right: -94px;
            top: 0;
            right /*\**/: 0px \9;
            margin-right /*\**/: 0px \9;
            width /*\**/: 10px \9;
            opacity: 0;
            filter: alpha(opacity=0);
            z-index: 2;
        }

        a.upload-img {
            width: 165px;
            display: inline-block;
            margin-bottom: 10px;
            height: 57px;
            line-height: 57px;
            font-size: 20px;
            color: #FFFFFF;
            background-color: #f38e81;
            border-radius: 3px;
            text-decoration: none;
            cursor: pointer;
            border: 0px #fff solid;
            box-shadow: 0px 0px 5px #B0B0B0;
        }

        a.upload-img:hover {
            background-color: #ec7e70;
        }

        .tc {
            text-align: center;
        }
    </style>
</head>
<body style="margin: 0">
<div class="container">
    <div class="imageBox">
        <div class="thumbBox"></div>
        <div class="spinner" style="display: none">Loading...</div>
    </div>
    <div class="action">
        <div class="new-contentarea tc">
            <a href="javascript:void(0)" class="upload-img">
                <label for="upload-file">上传图像</label>
            </a>
            <input type="file" class="" name="upload-file" id="upload-file"/>
        </div>
        <input type="button" id="btnCrop" class="Btnsty_peyton" value="裁切">
        <input type="button" id="btnZoomIn" class="Btnsty_peyton" style="margin-right: 60px;" value="+">
        <input type="button" id="btnZoomOut" class="Btnsty_peyton" style="margin-right: 20px;"  value="-">
    </div>
</div>

<script src="/js/jquery/jquery-1.9.1.js" type="text/javascript"></script>
<script type="text/javascript" src="../../lib/layer/layer.js"></script>
<script type="text/javascript" src="../../js/base/base.js"></script>
<script type="text/javascript" src="/js/cropbox.js"></script>
<script type="text/javascript">
    $(window).load(function () {
        var sex = $.getQueryString('sex');
        var avter = $.getQueryString('avter');
        var imgSrc = '';
        if(avter == ''){
            if(sex == '1'){
                imgSrc = '../img/girlMax.png';
            }else{
                imgSrc = '../img/boyMax.png';
            }
        }else if(avter == '0'){
            imgSrc = '../img/boyMax.png';
        }else if(avter == '1'){
            imgSrc = '../img/girlMax.png';
        }else{
            imgSrc=('../img/user/'+avter)
        }
        var options =
            {
                thumbBox: '.thumbBox',
                spinner: '.spinner',
                imgSrc: imgSrc
            }
        var cropper = $('.imageBox').cropbox(options);
        $('#upload-file').on('change', function () {
            var reader = new FileReader();
            reader.onload = function (e) {
                options.imgSrc = e.target.result;
                cropper = $('.imageBox').cropbox(options);
            }
            reader.readAsDataURL(this.files[0]);
            this.files = [];
        })
        $('#btnCrop').on('click', function () {
            var img = cropper.getDataURL();
            var $blob=getBlobBydataURI(img,'image/png')
            var formdata = new FormData();
            formdata.append('file', $blob,"file_"+Date.parse(new Date())+".png");
            $.ajax({
                url: '/user/upload',
                type: "post",
                data: formdata,
//              contentType: 'multipart/form-data',
                dataType: "text",
                processData: false,         // 告诉jQuery不要去处理发送的数据
                contentType : false,        // 告诉jQuery不要去设置Content-Type请求头
                success: function (obj) {
                    $('.showImg',window.parent.document).show();
                    $('#image',window.parent.document).attr('src',img);
                    $('.imageFile0',window.parent.document).val(JSON.parse(obj).msg);
                    $('.imageFile',window.parent.document).val(JSON.parse(obj).data);
                    $('#editUserExtForm',window.parent.document).attr('action','/user/editUserExtNew');
                },
                xhr: function () {            //在jquery函数中直接使用ajax的XMLHttpRequest对象
                    var xhr = new XMLHttpRequest();
                    xhr.upload.addEventListener("progress", function (evt) {
                        if (evt.lengthComputable) {
                            var percentComplete = Math.round(evt.loaded * 100 / evt.total);
                            console.log("正在提交." + percentComplete.toString() + '%');        //在控制台打印上传进度
                            window.parent.layer.closeAll();
                        }
                    }, false);
                    return xhr;
                }

            });
        })
        $('#btnZoomIn').on('click', function () {
            cropper.zoomIn();
        })
        $('#btnZoomOut').on('click', function () {
            cropper.zoomOut();
        })
    });
    function getBlobBydataURI(dataURI,type) {
        var binary = atob(dataURI.split(',')[1]);
        var array = [];
        for(var i = 0; i < binary.length; i++) {
            array.push(binary.charCodeAt(i));
        }
        return new Blob([new Uint8Array(array)], {type:type });
    }
</script>

</body>
</html>