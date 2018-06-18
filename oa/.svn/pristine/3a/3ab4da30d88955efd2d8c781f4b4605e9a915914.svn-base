<%--
  Created by IntelliJ IDEA.
  User: liruixu
  Date: 2017/6/14
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
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
    <title><fmt:message code="event.th.JobSetting" /></title>
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
</head>
<style>
    .del_btn {
        color: #E01919;
        cursor: pointer;
    }
    .edit_btn {
        color: #1772C0;
        cursor: pointer;
    }
</style>
<body class="bodycolor">
<div class="navigation  clearfix">
    <div class="left">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/workPlanEdit.png" alt="">
        <div class="news newtwo"><fmt:message code="event.th.AddType" /></div>
    </div>
</div>
<div id="showdiv" style="padding-bottom: 5%">
    <table class="tr_td" width="45%" align="center">
        <tbody><tr>
            <td nowrap="" class="TableData"><fmt:message code="file.th.Sort" />：</td>
            <td class="TableData">
                <input type="text" name="add_typeNo" id="add_typeNo" value="">
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableData"><fmt:message code="event.th.NameType" />：</td>
            <td nowrap="" class="TableData">
                <input type="text" name="add_typeName" id="add_typeName" value="">
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableControl" colspan="2" align="center">
                <input type="button" value="<fmt:message code="global.lang.add" />" class="import oneim addBut">&nbsp;&nbsp;
            </td>
        </tr>

        </tbody>
    </table>
    <div class="navigation  clearfix">
        <div class="left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/workPlanManager.png" alt="">
            <div class="news"><fmt:message code="event.th.ManagementPlanType" /></div>
        </div>
    </div>
    <table class="tr_td tr_tds" width="70%" align="center">
        <thead>
        <tr class="TableHeader">
            <td nowrap="" align="center"><fmt:message code="file.th.Sort" /></td>
            <td nowrap="" align="center"><fmt:message code="event.th.TypeName" /></td>
            <td nowrap="" align="center"><fmt:message code="menuSSetting.th.menuSetting" /></td>
        </tr>
        </thead>
        <tbody>


        </tbody></table>

</div>
<div id="hidediv" style="display: none">
    <table class="tr_td" width="45%" align="center">
        <tbody>
        <<input type="hidden" name="edit_typeId" id="edit_typeId">
        <tr>
            <td nowrap="" class="TableData"><fmt:message code="file.th.Sort" />：</td>
            <td class="TableData">
                <input type="text" name="edit_typeNo" id="edit_typeNo" value="">
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableData"><fmt:message code="event.th.NameType" />：</td>
            <td nowrap="" class="TableData">
                <input type="text" name="edit_typeName" id="edit_typeName" value="">
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableControl" colspan="2" align="center">
                <input type="button" value="<fmt:message code="depatement.th.modify" />" class="import twoim editBut">&nbsp;&nbsp;
            </td>
        </tr>

        </tbody>
    </table>
</div>

<script>
    function init() {
        var str="";
        $.ajax({
            url: '/planType/selAllPlanType',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                $(".tr_tds tbody").html("");
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td style="text-align: center">'+data[i].typeNo+'</td>' +
                            '<td style="text-align: center">'+data[i].typeName+'</td>' +
                            '<td style="text-align: center">' +
                            '<a class="edit_btn" href="javascript:void(0)" onclick="editPlanType('+data[i].typeId+')"><fmt:message code="global.lang.edit" /></a>' +
                            ' &nbsp;' +
                            '<span class="del_btn" id="'+data[i].id+'" onclick="delPlanType('+data[i].typeId+')"><fmt:message code="global.lang.delete" /></span></td>' +
                            '</tr>'
                    }
                    $(".tr_tds tbody").html(str);
                }
            }
        })
    }

    $(function () {
        init();
    })

    $(".addBut").click(function () {
        if($("#add_typeNo").val()==""){
            $.layerMsg({content:"<fmt:message code="event.th.sortingEmpty" />",icon:2},function(){
            })
            return false;
        }
        if($("#add_typeName").val()==""){
            $.layerMsg({content:"<fmt:message code="event.th.PanTypeEmpty" />",icon:2},function(){
            })
            return false;
        }
        $.ajax({
            url: '/planType/insertPlanType',
            type: 'get',
            data:{
                typeNo:$("#add_typeNo").val(),
                typeName:$("#add_typeName").val()
            },
            dataType: 'json',
            success: function (obj) {
                if(obj.flag){
                    $.layerMsg({content:"<fmt:message code="url.th.addSuccess" />",icon:1},function(){
                        init();
                    })
                }
            }
        })
    })


    function editPlanType(typeId) {
        $.ajax({
            url: '/planType/selectPlanTypeById',
            type: 'get',
            data:{
                typeId:typeId,
            },
            dataType: 'json',
            success: function (obj) {
                var data=obj.object;
                $("#edit_typeId").val(data.typeId);
                $("#edit_typeNo").val(data.typeNo);
                $("#edit_typeName").val(data.typeName);
                $("#showdiv").hide();
                $("#hidediv").show();
            }
        })
    }

    $("#hidediv").on("click",".editBut",function () {
        $.ajax({
            url: '/planType/updatePlanTypeById',
            type: 'get',
            data:{
                typeId:$("#edit_typeId").val(),
                typeNo:$("#edit_typeNo").val(),
                typeName:$("#edit_typeName").val()
            },
            dataType: 'json',
            success: function (obj) {
                if(obj.flag){
                    $.layerMsg({content:"<fmt:message code="menuSSetting.th.editSuccess" />",icon:1},function(){
                        window.location.href = '<%=basePath%>/workPlan/workPlanTypeSetting';
                    })
                }
            }
        })
    })
    
    function delPlanType(typeId) {
        //确定删除，调接口

        layer.confirm('<fmt:message code="menuSSetting.th.isdeleteMenu" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:["<fmt:message code="menuSSetting.th.suredeleteMenu" />","background-color:#3791DA;color:#ffffff;"]
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url: '/planType/deletePlanTypeById',
                dataType:'json',
                data:{
                    typeId:typeId
                },
                success:function(obj){
                    if(obj.flag){
                        $.layerMsg({content:"<fmt:message code="workflow.th.delsucess" />",icon:1},function(){
                            init();
                        })
                    }

                }
            })

        }, function(){
            layer.closeAll();
        });


//        $.ajax({
//            url: '/planType/deletePlanTypeById',
//            type: 'get',
//            data:{
//                typeId:typeId
//            },
//            dataType: 'json',
//            success: function (obj) {
//                if(obj.flag){
//                    $.layerMsg({content:"删除成功",icon:1},function(){
//                        init();
//                    })
//                }
//            }
//        })
    }
</script>
</body>
</html>
