<%--
  Created by IntelliJ IDEA.
  User: 高亚峰
  Date: 2017/10/9
  Time: 15:290
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="work.th.ApplyRecord" /></title>

    <style>
        *{
            font-family: 微软雅黑;
            font-size: 14px;
        }
        .news{
            cursor: pointer;
        }
        .div_tr input {
            float: none;
            height: 28px;
            border-width: 1px;
            border-style: solid;
            border-color: rgb(153, 153, 153);
            border-image: initial;
        }
        .span_td{
            display: inline-block;
            width: 150px;
            text-align: right;
        }
        .inputlayout>ul ul>li.active {
            background: #4898d5;
            color: #fff;
        }
        .inPole{
            display: inline-block;
        }
        a{
            color: #2e8ded;
        }
        .return {
            border-color: #4898d5;
            background-color: #2e8ded;
            color: #fff;
            width: 70px;
            height: 25px;
            border-radius: 5%;
            margin-left: 10px;
            cursor: pointer;
        }
    </style>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <link rel="stylesheet" href="/css/office/depository/index.css">
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
</head>
<body style="background: #fff">
<div class="maintop clearfix" >
    <p style="margin-left: 10px">
        <label><fmt:message code="work.th.ApplyRecord" /></label>
    </p>
</div>



<div class="mainBottom" style="margin-top: 10px;">
    <table>
        <thead>
        <tr>
          <%--  <th class="th" style="color: #2F5C8F;" width="5%" align="center">选择</th>--%>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="vote.th.OfficeName" /></th>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="vote.th.Registration" /></th>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="vote.th.NumberApplications" /></th>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="vote.th.OperationDate" /></th>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="event.th.DepartmentApprover" /></th>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="journal.th.Remarks" /></th>
            <th class="th" style="color: #2F5C8F;" width="10%" align="center"><fmt:message code="notice.th.state" /></th>
            <th class="th" style="color: #2F5C8F;" width="20%" align="center"><fmt:message code="menuSSetting.th.menuSetting" /></th><%--操作--%>
        </tr>
        </thead>
        <tbody id="j_tb">
        <tr>

        </tr>
        </tbody>
    </table>
</div>
</body>
<script>
    $(function(){
     init();
    })
    //点击复选框
    $("#mainBottom").on('click', '#notice_tr', function () {
        /*    alert('111');*/
        var state = $(this).find('.checkChild').prop("checked");
        if (state == true) {
            $(this).find('.checkChild').prop("checked", true);
            $(this).addClass('bgcolor');
        } else {
            $('#checkedAll').prop("checked", false);
            $(this).find('.checkChild').prop("checked", false);
            $(this).removeClass('bgcolor');
        }
        var child = $(".checkChild");
        for (var i = 0; i < child.length; i++) {
            var childstate = $(child[i]).prop("checked");
            if (state != childstate) {
                return
            }
        }
        $('#notice_tr').prop("checked", state);
    })




    //点击全选
    $('#j_tb').on('click', '#checkedAll', function () {
        /*alert('111');*/
        var state = $(this).prop("checked");
        if (state == true) {
            $(this).prop("checked", true);
            $(".checkChild").prop("checked", true);
            $(this).parents('tr').siblings('#notice_tr').addClass('bgcolor');
        } else {
            $(this).prop("checked", false);
            $(".checkChild").prop("checked", false);
            ;
            $(this).parents('tr').siblings('#notice_tr').removeClass('bgcolor');
        }
    })

    //进行多项删除
    $("#j_tb").on("click",".return",function () {
        var transIds = "";
        $("#j_tb .checkChild:checkbox:checked").each(function () {
            var transId = $(this).attr("conid");
            if(transId!=""){
                transIds += transId+",";
            }
        })
        if (transIds.length<=0) {
            $.layerMsg({content: '<fmt:message code="vote.th.Returned" />', icon: 0});
        } else {
            layer.confirm('<fmt:message code="vote.th.AreReturn" />？', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message code="vote.th.Restitution" />"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/officetransHistory/returnObject',
                    dataType: 'json',
                    data: {'transIds': transIds},
                    success: function (json) {
                        if(json.flag){
                            layer.msg('<fmt:message code="vote.th.ReturnSuccess" />', {icon: 6});
                            queryList();
                        }
                    }
                })
            },function (){
                layer.closeAll();
            });
        }
    })


    //初始化列表
    function init(){
        $.ajax({
            url: '/officetransHistory/getMyHistroy',
            type: 'get',
            dataType: 'json',
            success: function (result) {
                var str="";
                var str1="";
                var arr =result.obj;
                for(var i=0;i<arr.length;i++){
                    if(arr[i].transState=="1"){
                       str1='<a href="javascript:;" class="details" onclick="detail('+arr[i].transId+');">'+"<fmt:message code="file.th.detail" />"+'</a>&nbsp'
                    }
                    else{
                        str1='<a href="/officetransHistory/OfficeProductApply?editFlag=1&transId='+arr[i].transId+'" class="details">'+"<fmt:message code="global.lang.edit" />"+'</a>&nbsp'+
                        '<a href="javascript:;" onclick="deleteone('+arr[i].transId+')"><fmt:message code="global.lang.delete" /></a>&nbsp'
                    }
                    // "<td style='width:8%;'align='center';><input class='checkChild'  type='checkbox' conid='" + arr[i].transId + "' name='check' value=''></td>"+
                    str+='<tr>'+
                        '<td>'+arr[i].proName+'</td>';
                    if(arr[i].transFlag==1){
                        str+='<td><fmt:message code="vote.th.user" /></td>';
                    }else if(arr[i].transFlag==2){
                        str+='<td><fmt:message code="vote.th.borrow" /></td>';
                    }
                     str+= '<td>'+arr[i].transQty+'</td>'+
                        '<td>'+arr[i].transDate+'</td>'+
                        '<td>'+arr[i].deptManagerName+'</td>'+
                        '<td>'+arr[i].remark+'</td>';
                    if(arr[i].transState=="01"){
                        str+='<td><fmt:message code="vote.th.ApprovalDepartment" /></td>';
                    }else if(arr[i].transState=="02"){
                        str+='<td><fmt:message code="vote.th.ToAdministrator" /></td>';
                    }else if(arr[i].transState=="1"){
                        str+='<td><fmt:message code="sup.th.Agree" /></td>';
                    }else if(arr[i].transState=="21"){
                        str+='<td><fmt:message code="vote.th.DisapprovaApproval" /></td>';
                    }else if(arr[i].transState=="22"){
                        str+='<td><fmt:message code="vote.th.StorekeeperDismissal" /></td>';
                    }
                    str+='<td>'+str1 +'</td>'+
                        '</tr>';
                }
               /* var last_str = "<tr class='last_str'><td style='width: 65px;display:block;'><input id='checkedAll' style='margin-left:12px;' class='checkChild' type='checkbox' conid='' name='check' value=''><fmt:message code="notice.th.allchose" /></td>"+
                    "<td class='btnStyle return_btn'><button class='return' id='return_btn'>批量归还</button></td><td class=''></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
                 */ $('.mainBottom table tbody').html(str);
            }
        })
    }
    //删除
    function deleteone(id) {
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="vote.th.DeleteApplication" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/officetransHistory/deleteObject',
                type: 'get',
                data:{
                    transId:id
                },
                dataType: 'json',
                success: function (result) {
                    if(result.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1}, function () {
                            init();
                        });
                    }else{
                        $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                        });
                    }
                }
            })
        }, function () {
            layer.closeAll();
        });
    }

    //详情展示
    function detail(transId) {
        $.ajax({
            url: '/officetransHistory/getObjectById',
            type: 'get',
            dataType: 'json',
            data: {
                transId: transId
            },
            success: function (obj) {
                var data = obj.object;
                var str = '';
                layer.open({
                    type: 1,
                    title: ['<fmt:message code="vote.th.DetailsClaim" />', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['500px', '450px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['<fmt:message code="global.lang.close" />'],
                    content: '<div class="table" style="margin-top: 10px"><table style="margin:auto;width:90%">' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="sup.th.ApplicationType" />：</span></td><td><span id="transFlag"></span></td><tr>' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="sup.th.Applicant" />：</span></td><td><span>' + data.borrowerName + '</span></td><tr>' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="vote.th.DepartmentStatus" />：</span></td><td><span id="deptApprove"></span></td><tr>' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="sup.th.ApplicationTime" />：</span></td><td><span>' + data.transDate + '</span></td><tr>' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="vote.th.OfficeName" />：</span></td><td><span>' + data.proName + '</span></td><tr>' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="vote.th.AlertRange" />：</span></td><td><span>' + data.proLowstock + '</span>-<span>' + data.proMaxstock + '</span></td><tr>' +
                    '<tr><td width="40%"><span class="span_td"><fmt:message code="vote.th.UnitPrice" />：</span></td><td><span>' + data.proPrice + '</span></td><tr>' +
                    '</table></div>',
                    success: function () {
                        if (data.transFlag == 1) {
                            $("#transFlag").html("<fmt:message code="vote.th.user" />");
                        } else if (data.transFlag == 2) {
                            $("#transFlag").html("<fmt:message code="vote.th.borrow" />");
                        }

                        if (data.transState == "01") {
                            $("#deptApprove").html("<fmt:message code="meet.th.PendingApproval" />");
                        } else if (data.transState == "02" || data.transState == "1") {
                            $("#deptApprove").html("<fmt:message code="vote.th.Approved" />");
                        } else if (data.transState == "21") {
                            $("#deptApprove").html("<fmt:message code="meet.th.unratified" />");
                        }
                    }
                })
            }
        })
    }

</script>
</html>
