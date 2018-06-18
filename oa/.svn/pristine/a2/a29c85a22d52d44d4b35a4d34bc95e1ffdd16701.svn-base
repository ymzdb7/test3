
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <script src="/lib/ueditor/js/codemirror.js"></script>
    <link rel="stylesheet" href="/lib/ueditor/js/codemirror.css">

    <script src="/lib/ueditor/js/css.js"></script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js" ></script>
    <script type="text/javascript" src="../../../js/base/base.js"></script>
</head>

<style>
    html,body{
        overflow:hidden;
        height:100%;
    }
    .CodeMirror{
        height:100%;
    }
</style>

<script>

    $(function () {
        var formId = $.getQueryString('formId');

        var control = $.getQueryString('control');


        $.when($.ajax({
            type: "get",
            url: "/form/formType",
            dataType: 'JSON',
            data: {
                fromId: formId
            },
            success: function (res) {
                var date = res.object;
                if (control == 2) {
                    $('#content1').val(date.css)


                } else if (control == 1) {
                    $('#content1').val(date.script)
                }

            }
        })).done(function () {
            window.editor = CodeMirror.fromTextArea(document.getElementById('content1'), {

                indentWithTabs: true,
                smartIndent: true,
                lineNumbers: true,
                matchBrackets : true,
                autofocus: true
            });
            editor.getValue();
            parent.editorVal=window.editor;
        })





    });

</script>



<body>
<div style="color:#FF0000;">注：需要填写标签</div>


<textarea  name="content1" id="content1"  style="width:100%;height:400px;display:none;"></textarea>
<script>

    /*CodeMirror.defaults.lineNumbers = true;
     CodeMirror.defaults.styleActiveLine = true;
     CodeMirror.defaults.matchBrackets = true;
     console.log($("#content1")[0].value)
     var editor = CodeMirror.fromTextArea($("#content1")[0], {
     lineNumbers: true,//是否显示行号3
     mode:"shell",　//默认脚本编码4
     lineWrapping:true, //是否强制换行5
     });*/
</script>
</body>
</html>