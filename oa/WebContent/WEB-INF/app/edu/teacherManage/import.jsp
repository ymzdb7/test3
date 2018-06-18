<%--
  Created by IntelliJ IDEA.
  User: liruixu
  Date: 2017/6/14
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>导入导出</title>
    <link rel="stylesheet" href="/css/dept/userGroup.css">
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>

    <script src="../lib/jquery.form.min.js"></script>
    <style>
        .export_div1{
            width:100%;
            height:200px;
        }
        .bumen_dc img{
            vertical-align: middle;height: 30px;
        }
        .zisize{font-size: 18px;margin-left: 3px;}
        .juzhong{text-align: center;margin-top: 50px;}
        .juzhong input{background-image: url("../../img/import/export.png");width:120px;height:30px; border: none;color:#fff;cursor:pointer;padding: 5px;padding-left: 35px;}
        .import_div2{
            width:100%;
            height:300px;
        }
        .import_div2 table {  margin:0 auto;  width:600px;height: 200px; border-collapse:collapse;  border: 1px solid rgb(217,217,217);}
        .import_div2 table tr td{   border: 1px solid rgb(217,217,217);text-align: left;}
        .import_div2 table .g1{height:30px;background-color:rgb(255,255,255);}
        .import_div2 table .g2{height:70px;}
        .import_div2 table .g3{height:100px;background-color:rgb(255,255,255);}
        .xiazaimb{ position:relative;top:2px;left:251px; width:102px;height:30px;background-image: url("../../img/import/fill.png");display: inline-block;}
        .daorumb{position:absolute;top:56px;left:255px;text-align: center;padding-left: 30px;   width:90px;height:30px;background-image: url("../../img/import/import.png");display: inline-block;}
        .xuanze{ position: absolute;top:16px;left:255px;cursor: pointer;   height:30px;}
        .downtp{ text-align: center;line-height: 30px;padding-left: 10px;   position:absolute;top:0px;left:0px;color:black;width: 102px;height: 30px; text-decoration: none;font-size: 13px;display: block;}
        .dingwei{position: relative;}
        .zuoce{position: absolute;top:24px;left:20px;}
        .daoru{color:#fff;font-size: 13px;line-height: 30px;}
        .daoru_file{width:120px;height:30px;position: absolute;top:0;left:0;cursor: pointer;opacity: 0;}

        thead td{
            font-size:15px;
            font-weight: 600;
            color:#23477e;
        }
        .bodycolor {
            BACKGROUND: #f9f9f9;
        }
        .navigation .left img {
            padding-left: 0;
            margin-left: 30px;
        }
        .tr_td thead tr{
            background-color: #fff!important;
        }
        .tr_td tr:nth-child(odd) {
            background-color: #F6F7F9;
        }
        .tr_td tr:nth-child(even) {
            background-color: #fff;
        }
        tr td{
            text-align: center;
        }
        input[type="file"]{
            width: 270px;
        }
        .introduce{
            position: relative;
            top: 11px;
            left: 70px;
            width: 318px;
            height: 88px;
            display: inline-block;
        }
    </style>
</head>
<body class="bodycolor">

<div class="export_div1">
    <p class="bumen_dc"><img src="../../img/import/department_export.png" alt=""><span class="zisize">教师信息导出</span></p>
    <div class="juzhong"><input type="button" class="export" value='导出' /></div>
</div>
<div class="import_div2">
    <p class="bumen_dc"><img src="../../img/import/department_import.png" alt=""><span class="zisize">教师信息导入</span></p>
    <form class="form1" name="form1" id="uploadForm" method="post" action="/teachering/importTeacherInfo" enctype="multipart/form-data" >
        <table>
            <%--<tr class="g1"><td style="padding: 20px;border:none"><span>说明：</span></td><td style="text-align: left;border:none"><span class="introduce">1、<fmt:message code="dept.th.deptOne" /><br>2、<fmt:message code="dept.th.chongfu" /><br>3、<fmt:message code="dept.th.together" /></span></td></tr>--%>
            <tr  class="g2"><td class="dingwei" colspan="2"><span class="zuoce"><fmt:message code="user.th.TemplateDownload" />：</span>  <span class="xiazaimb"> <a href="javascript:void(0)"  class="modlepanl downtp"  id="modle" style=""><fmt:message code="user.th.TemplateDownload" /></a></span></td></tr>
            <tr  class="g3"><td class="dingwei" colspan="2"><span class="zuoce" style="top: 40px;">信息导入：</span><input type="file" class="import xuanze" name="file" /> <span class="daorumb"><span class="daoru"><fmt:message code="workflow.th.Import" /></span><input type="button" class="subBtn daoru_file" value='<fmt:message code="workflow.th.Import" />' /></span></td></tr>
        </table>

    </form>






</div>
</body>
<script type="text/javascript">

    $(function () {

        $('.export').click(function () {
            window.open("<%=basePath%>teachering/outputTeacherInfo")
        });

        $('#modle').click(function () {
            window.location.href="/file/edu/eduTeacher/教师信息导入模板.xls"
        });

        $('.subBtn').click(function () {
            var flag = CheckForm();
            if (flag) {
                $('#uploadForm').ajaxSubmit({
                    dataType: 'json',
                    success: function (res) {
                        var data=res.object;
                        if(res.flag) {
                            var str='导入成功'
//                                +data.successCount+"条数据，失败"+data.failCount+"条数据。";
//                            if(data.nameRoNoNull==1 || data.nameRepeat==1 || data.noRepeat==1 || data.noParent==1){
//                                str+='失败原因：';
//                                if(data.nameRoNoNull==1){
//                                    str+='部门名称或部门排序号为空;';
//                                }
//                                if(data.nameRepeat==1){
//                                    str+='部门名称重复;';
//                                }
//                                if(data.noRepeat==1){
//                                    str+='部门排序号重复;';
//                                }
//                                if(data.noParent==1){
//                                    str+='所填写的上级部门不存在;';
//                                }
//                            }
                            layer.msg(str, {icon: 1});
                        }else{
                            layer.msg(res.msg, {icon: 2});
                        }
                    }
                })
            }
        });


        function    CheckForm(){
            if($('.import').val()==""){
                layer.msg("<fmt:message code="user.th.selectImport" />！",{icon:2});
                return (false);
            }
            return (true);
        }

    });



</script>
</html>
