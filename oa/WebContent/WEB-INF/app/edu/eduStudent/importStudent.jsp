<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script src="/js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../../js/base/base.js"></script>
    <title>学生信息导入</title>
    <style>
        .head{
            line-height: 70px;
            display: inline-block;
            font-size: 20px;
            color: #494d59;
            margin-left: 10px;
            margin-right: 20px;
            border-bottom:none;
        }
        .head img{
            width: 20px;
            height: 21px;
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
        .btn{

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

    </style>
</head>
<body>
    <div class="box">
        <div class="head">
            <img src="../../img/sys/new_dept.png">
            导入学生家长信息
        </div>
        <div class="content">
            <table class="TableBlock" align="center" width="70%">
                <form name="form1" id="uploadForm" method="post" action="/edu/student/importStudentInfor" enctype="multipart/form-data" onSubmit="return CheckForm();">
                    <tr class="TableData" align="center" height="30">
                        <td width="150" align="right"><b>下载导入模板：</b></td>
                        <td width="400" align="left">
                            <a href="javascript:;" onClick="window.location.href = encodeURI('/file/edu/eduStudent/import_eduStudent.xls');">模版下载</a>
                        </td>
                    </tr>
                    <tr class="TableData" align="center" height="30">
                        <td width="150" align="right"><b>&nbsp;&nbsp;选择导入文件：</b></td>
                        <td align="left" width="400">
                            <input class="file" type="file" name="file" class="BigInput" size="30">
                        </td>
                    </tr>
                    <tr class="TableData" align="center" height="30">
                        <td width="150" align="right"><b>&nbsp;&nbsp;学号数据重复时是否更新：</b></td>
                        <td nowrap  class="TableControl" colspan="3" align="left">
                            <input type="checkbox" name="IMPORT_STYLE" id="IMPORT_STYLE" checked ><label for="IMPORT_STYLE">是</label>
                        </td>
                    </tr>
                    <tr  class="TableData" align="center" height="30">
                        <td width="150" align="right"><b>说明：</b></td>
                        <td width="400" align="left">
                            1、请导入.xls文件。<br/>
                            2、模版下载：为包含导入所有字段的模版；简洁模版下载：为必要字段的模版。<br/>
                            3、学号、年级、班级、姓名、家长姓名为必要字段。<br/>
                            4、导入文件中，年级、班级应为类似“一年级”、“一班” 等实际存在的班级名称。<br/>
                            5、导入文件中，生日格式应为类似“2014-10-15”。<br/>
                            6、学生名数据重复时是否更新选择是时则学生名重复时会更新之前的数据，反之跳过不更新数据。			</td>
                    </tr>
                    <tr>
                        <td nowrap  class="TableControl" colspan="3" align="center">
                            <input type="hidden" name="FILE_NAME">
                            <input type="hidden" name="GROUP_ID" value="">
                            <span class="btn">导入</span>
                        </td>
                    </tr>

                </form>
            </table>
        </div>

    </div>

    <script>
        $(function () {


            $('.btn').click(function () {
                var flag = CheckForm();
                if (flag) {
                    layer.msg("正在导入中，请耐心等候", {icon: 1});
                    $.upload($('#uploadForm'), function (res) {
                        if(res.flag) {
//                            layer.msg("共新增" + insertCount + "条数据,更新" + updateCount + "条数据!", {icon: 1});
//                        }else{
//                            layer.msg(res.msg, {icon: 2});

                            layer.msg("导入成功", {icon: 1});
                        }else{

                            layer.msg("导入失败", {icon: 2});
                        }
                    });
                }
            });

        })
        function CheckForm(){
            if(document.form1.file.value==""){
                layer.msg("请选择要导入的文件！",{icon:2});
                return (false);
            }

            return (true);
        }

    </script>
</body>
</html>