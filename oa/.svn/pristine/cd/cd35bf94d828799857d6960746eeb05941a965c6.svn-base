<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title><fmt:message  code="event.th.PendingApplication"/></title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/vehicleInfo.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/layer/layer.js"></script>

</head>
<!DOCTYPE html>
<html>
<style>
    table tr:nth-child(even) {
        background-color: #fff;
    }
    table  tr:nth-child(odd) {
        background-color: #F6F7F9;
    }
    body{
        font-family: 微软雅黑;
        font-size: 14px;
    }
    .header{
        line-height: 60px;
    }
    .title{
        margin-left: 30px;
        height: 50px;
    }
    .big3{
        font-family: "微软雅黑";
        font-size: 22px;
        line-height: 45px;
        color: #494d59;
    }
    .main{
        margin-top: 20px;
    }
    .th {
        background-color: #fff;
        font-size:15px;
        color: #2F5C8F;
        font-weight: bold;
        border: 0px;
    }
</style>
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/deptApprove.png" align="absmiddle">
            <span class="big3"><fmt:message  code="event.th.PendingApplication"/></span>
        </div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0" id="table_main">
            <thead>
            <tr>
                <th class="th"><fmt:message  code="event.th.LicensePlateNumber"/></th>
                <th class="th"><fmt:message  code="event.th.VehicleMan"/></th>
                <th class="th"><fmt:message  code="event.th.Entourage"/></th>
                <th class="th"><fmt:message  code="attend.th.Reason"/></th>
                <th class="th"><fmt:message  code="sup.th.startTime"/></th>
                <th class="th"><fmt:message  code="meet.th.EndTime"/></th>
                <th class="th"><fmt:message  code="menuSSetting.th.remark"/></th>
                <th class="th"><fmt:message  code="menuSSetting.th.menuSetting"/></th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function(){
       init();
    })

    function init(){
        $.ajax({
            url: '/veHicleUsage/deptApproval',
            type: 'get',
            dataType: 'json',
            data: {
                dmerStatus:"0"
            },
            success: function (result) {
                var str="";
                var arr =result.obj;
                for(var i=0;i<arr.length;i++){
                    str+='<tr>'+
                        '<td>'+function(){
                            if(arr[i].vIdNum!=undefined){
                                return arr[i].vIdNum;
                            }else{
                                return "该车辆已经不存在";
                            }
                        }()+'</td>'+
                        '<td>'+arr[i].vuUserName+'</td>'+
                        '<td>'+arr[i].vuSuiteName+'</td>'+
                        '<td>'+arr[i].vuReason+'</td>'+
                        '<td>'+function(){
                            if(arr[i].vuStart!=undefined){
                                return arr[i].vuStart;
                            }else{
                                return "";
                            }
                        }()+'</td>'+
                        '<td>'+function(){
                            if(arr[i].vuEnd!=undefined){
                                return arr[i].vuEnd;
                            }else{
                                return "";
                            }
                        }()+'</td>'+
                        '<td>'+arr[i].vuRemark+'</td>'+
                        '<td>'+
                        ' <a href="javascript:;" class="details" onclick="detail('+arr[i].vuId+');">'+"<fmt:message  code="hr.th.detailedInformation"/>"+'</a>'+'<a href="javascript:;" onclick="approvetrue('+arr[i].vuId+')"><fmt:message  code="meet.th.Approval"/></a>'+
                        '<a href="javascript:;" onclick="approvefalse('+arr[i].vuId+')"><fmt:message  code="meet.th.NotApprove"/></a>'+
                        '</td>'+
                        '</tr>';
                }
                $('.main table tbody').html(str)
            }
        })
    }

    function approvefalse(e){
        layer.open({
            type: 1,
            title: ['<fmt:message  code="event.th.ApprovalOpinions"/>', 'background-color:#2b7fe0;color:#fff;'],
            area: ['350px', '230px'],
            offset: ['150px', '400px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 35px;">'+
            '<div class="div_tr" style="margin-top: 10px;"><span class="span_td" style="color: #f43838;font-family:微软雅黑"><fmt:message  code="event.th.rejection"/>：</span></div>'+
            '<div class="div_tr" style="margin-top: 10px;"><textarea name="txt" id="deptReason" value="" style="min-width: 260px;min-height:80px;"></textarea></div>'+
            '</div>',
            success:function(){
            },
            yes: function (index) {
                var data = {
                    vuId:e,
                    dmerStatus:2,
                    deptReason:$('#deptReason').val()
                }
                edit(data);
                layer.close(index);
            },
        });
    }


    function approvetrue(e){
        layer.open({
            type: 1,
            title: ['<fmt:message  code="event.th.ApprovalOpinions"/>', 'background-color:#2b7fe0;color:#fff;'],
            area: ['350px', '230px'],
            offset: ['150px', '400px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 35px;">'+
            '<div class="div_tr" style="margin-top: 10px;"><span class="span_td" style="color: #f43838;font-family:微软雅黑"><fmt:message  code="event.th.approvalopinions"/>：</span></div>'+
            '<div class="div_tr" style="margin-top: 10px;"><textarea name="txt" id="deptReason" value="" style="min-width: 260px;min-height:80px;"></textarea></div>'+
            '</div>',
            success:function(){
            },
            yes: function (index) {
                var data = {
                    vuId:e,
                    dmerStatus:1,
                    deptReason:$('#deptReason').val()
                }
                edit(data);
                layer.close(index);
            },
        });
    }
    function edit(data){
        $.ajax({
            url: "<%=basePath%>/veHicleUsage/editDeptApproval",
            type:'get',
            dataType:"JSON",
            data : data,
            success:function(data){
                if(data.flag){
                    $.layerMsg({content:'<fmt:message  code="meet.th.SuccessfulApproval"/>',icon:1},function () {
                        init();
                    });

                }else{
                    $.layerMsg({content:'<fmt:message  code="event.th.ApprovalFailure"/>',icon:2});
                }
            }
        })

    }

    function detail(e){
        $.popWindow('<%=basePath%>veHicle/veHicledetail?vuId='+e,'<fmt:message  code="event.th.VehicleDetails"/>','100','300','1000px','700px');
    }

</script>
</html>

