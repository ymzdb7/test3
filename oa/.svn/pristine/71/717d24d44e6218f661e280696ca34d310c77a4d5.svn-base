<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title>管理图书</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        .title{
            height:70px;
            line-height:70px;
        }
        .title span{
            font-size: 22px;
            color: #494d59;
        }
        .title img{
            vertical-align: middle;
            padding-left:20px;
            float:left;
            margin:23px 5px 0px 0px;
        }
        .content{
            width:80%;
            margin:0 auto;
            margin-top:20px;
        }
        table tr,td{
            border:1px solid #c0c0c0;
        }
        .file{
            width:200px;
        }
        #input{
            width: 46px;
            height: 30px;
            line-height:30px;
            font-size: 13px !important;
            cursor: pointer;
            background-repeat: no-repeat;
            background-image: url(../../img/sys/confirm.png);
            padding-left: 25px;
            display: inline-block;
        }
        b{
            color:#2a588c
        }
        a{
            color:#207bd6;
            text-decoration: none;
        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div>
    <div class="title">
        <img src="../../img/book/input.png" alt="">
        <span>图书信息导入</span>
    </div>
    <div class="content">
        <table class="TableBlock" align="center" width="70%">
            <form name="form1" id="uploadForm" method="post" action="/bookInfo/importBookInfo" enctype="multipart/form-data">
                <tr class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>下载导入模板：</b></td>
                    <td width="400" align="left">
                        <a href="javascript:;" onClick="window.location.href = encodeURI('/file/book/bookTemple.xls');">模版下载</a>
                    </td>
                </tr>
                <tr class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>&nbsp;&nbsp;选择导入文件：</b></td>
                    <td align="left" width="400">
                        <input class="file" type="file" name="file" class="BigInput" size="30">
                    </td>
                </tr>
                <tr  class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>说明：</b></td>
                    <td width="400" align="left">
                        导入的文件请使用模板文件导入。</br>图书编号不能重复。</br>借阅范围包括部门、人员、角色之间用分号分隔，部门与部门、人员与人员、角色与角色之间用逗号分隔 (注意、分号逗号为英文状态下的)。
                    </td>
                </tr>
                <tr>
                    <td nowrap  class="TableControl" colspan="3" align="center">
                        <span id="input">导入</span>
                    </td>
                </tr>

            </form>
        </table>
    </div>
</div>
</body>
<script>
    $(function(){
//        点击导入
        $('#input').click(function(){
            var flag = CheckForm();
            if (flag) {
                layer.msg("正在导入中，请耐心等候", {icon: 1});
                $.upload($('#uploadForm'), function (res) {
                    if (res.flag) {
                        layer.msg("导入成功!", {icon: 1});
                    } else {
                        $.layerMsg({content: '文件格式不正确！', icon: 1});
                    }
                });
            }else{
                e.preventDefault();
                $.layerMsg({content: '请选择文件！', icon: 2});
            }
        })
        function CheckForm() {
            if (document.form1.file.value == "") {
                layer.msg("<fmt:message code="user.th.selectImport" />！", {icon: 2});
                return (false);
            }else{
                return (true);
            }
        }
    })
</script>
</html>
