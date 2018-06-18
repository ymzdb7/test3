<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title><fmt:message code="workflow.th.FormPreview" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../css/workflow/work/form.css">
    <link rel="stylesheet" type="text/css" href="../../css/ueditor/bootstrap.css">
    <%--<link rel="stylesheet" href="../../lib/easyui/themes/easyui.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>--%>
    <script type="text/javascript" src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>
    <script src="/js/mustache.min.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <%--<script src="../../lib/easyui/jquery.easyui.min.js"></script>--%>
    <script src="../../js/workflow/work/workform.js"></script>
    <!-- 金格签章 -->

    <link rel="stylesheet" href="../../lib/kinggrid/dialog/artDialog/ui-dialog.css">
    <link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.css">

    <script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.min.js"></script>
    <script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.plus.min.js"></script>
    <script type="text/javascript" src="../../lib/kinggrid/dialog/artDialog/dialog.js"></script>

    <!-- html签章核心JS -->
    <script type="text/javascript" src="../../lib/kinggrid/signature.min.js"></script>
    <!-- PC端附加功能 -->
    <script type="text/javascript" src="../../lib/kinggrid/signature.pc.min.js"></script>
    <%--<!-- 移动端端附加功能 -->--%>
    <%--<link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.mobile.css">--%>
    <%--<script type="text/javascript" src="../../lib/kinggrid/signature.mobile.min.js"></script>--%>
    <!-- 手写端附加功能 -->

    <script type="text/javascript" src="../../lib/kinggrid/signature_pad.min.js"></script>
    <script type="text/javascript" src="../../lib/kinggrid/jquery.timer.dev.js"></script>
    <style>
        .table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th{
            padding: 5px;
        }
    </style>
</head>
<body>
<div>
    <div class="content">
        <div class="formDesign">

        </div>
    </div>
</div>


<script>
//    $('#cc').combotree({
//        url: domain+'/department/getChDept?deptId=20',
//        loadFilter: function(node){
//            console.log(conver(node.obj))
//            alert("33");
//            return conver(node.obj);
//        },
//        onBeforeExpand:function(node,param){
//            $(this).tree('options').url = domain+'/department/getChDept?deptId='+node.id;
//            console.log($(this).tree('options').url )
//           alert("33");
//        }
//
//    });
    function comboTree(id,text,state,children){
        this.id = id;
        this.text = text;
        this.state = state;
        this.children = children;

    }
    function conver(data){
        console.log(data);
        var arr = [];
        data.forEach(function(v,i){
            arr.push(new comboTree(v.deptId,v.deptName,'close',[new comboTree()]));
        })
        return arr;
    }
    $(function() {
        var formid = $.getQueryString("formId");
        workForm.init({
                formhtmlurl: '../../form/formType',
                resdata: {
                    fromId: formid
                },
                flowStep: -1,//预览
                target: $('.formDesign')
            },
            function (data) {
                console.log(data);
            });
    });


</script>
</body>
</html>
