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
    <title><fmt:message code="event.th.OilCardManagement" /></title>
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/vehicleInfo.css"/>

    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
</head>
<style>
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
    .delete_ok{
        width: 109px;
        height:24px;
        background: url(../../img/btn_deleteannounce.png) 0px 0px no-repeat;
    }
    .span{
        margin-left: 15px;
    }
</style>
<!DOCTYPE html>
<html>
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleInfo.png" align="absmiddle">
            <span class="big3"><fmt:message code="event.th.OilCardManagement" /></span>
        </div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0" id="listTable">
          <thead>
            <tr>
                <th class="th"><fmt:message code="global.lang.select" /></th>
                <th class="th"><fmt:message code="event.th.OilCardNumber" /></th>
                <th class="th"><fmt:message code="event.th.IssuingDate" /></th>
                <th class="th"><fmt:message code="event.th.HandlePerson" /></th>
                <th class="th"><fmt:message code="event.th.OilCardIssuing" /></th>
                <th class="th"><fmt:message code="event.th.OilCardPassword" /></th>
                <th class="th"><fmt:message code="event.th.UsingState" /></th>
                <th class="th"><fmt:message code="event.th.DepositoryDepartment" /></th>
                <th class="th"><fmt:message code="event.th.LicensePlateNumber" /></th>
                <th class="th"><fmt:message code="notice.th.type" /></th>
                <th class="th"><fmt:message code="event.th.All" /></th>
                <th class="th"><fmt:message code="event.th.User" /></th>
                <th class="th"><fmt:message code="notice.th.operation" /></th>
            </tr>
          </thead>
          <tbody></tbody>
        </table>
    </div>
</div>
</body>
</html>
<script>
    $(function () {
        $.ajax({
            url: '/oilCard/selectAllCard',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                var str="";
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td><input type="checkbox" name="checkData" class="checkChild" value="" id="'+data[i].id+'"/></td>' +
                            '<td>'+data[i].ocId+'</td>' +
                            '<td>'+function(){
                                if(data[i].ocDate!=undefined){
                                    return data[i].ocDate;
                                }else{
                                    return "";
                                }
                            }()+'</td>' +
                            '<td>'+data[i].ocHandled+'</td>' +
                            '<td>'+data[i].ocCompany+'</td>' +
                            '<td>'+data[i].ocPassword+'</td>' +
                            '<td>'+data[i].ocStatusName+'</td>' +
                            '<td>'+data[i].vDeptName+'</td>' +
                            '<td>'+data[i].vNum+'</td>' +
                            '<td>'+data[i].vTypeName+'</td>' +
                            '<td>'+data[i].vOnwerName+'</td>' +
                            '<td>'+data[i].vUserName+'</td>' +
                            '<td>' +
                            '<a href="../../veHicle/editOilCard?editFlag=1&id='+data[i].id+'"><fmt:message code="depatement.th.modify" /></a>' +
                            '<a href="javascript:;" id="'+data[i].id+'" class="del_btn"><fmt:message code="global.lang.delete" /></a>' +
                            '</td>' +
                            '</tr>';
                    }
                    str+='<tr>' +
                        '<td> ' +
                        '<input type="checkbox" name="checkedAll" id="checkedAll" /><span style="font-family:微软雅黑;font-family: 14px;"><fmt:message code="notice.th.allchose" /><span>' +
                        '</td>' +
                        '<td colspan=12" style="text-align: left;">' +
                        '<div class="delete_ok"><span class="span"><a href="javascript:;" style="font-size: 14px;" class="delete_check"><fmt:message code="event.th.DeleteCard" /></a><span></div>' +
                        '</td> ' +
                        '</tr>'
                    $("#listTable tbody").html(str);
                }
            }
        })
    })

    //单个删除
    $("#listTable").on("click",".del_btn",function () {
        var id="";
        id= $(this).attr("id");
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteVehiclen" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/oilCard/deleteOilCard',
                type: 'get',
                data: {
                    id: id,
                },
                dataType: 'json',
                success: function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '<fmt:message code="event.th.DeleteVehiclen" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/veHicle/oilCardManagement';
                        });
                    }
                }
            })
        }, function () {
            layer.closeAll();
        });
    })

    //点击全选
    $('#listTable').on('click', '#checkedAll', function () {
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
    $("#listTable").on("click",".delete_check",function () {
        var ids = "";
        $("#listTable .checkChild:checkbox:checked").each(function () {
            var id = $(this).attr("id");
            ids += id+",";
        })
        if (ids.length<=0) {
            $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
        } else {
            layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/oilCard/deleteCards',
                    dataType: 'json',
                    data: {'ids': ids},
                    success: function (json) {
                        if(json.flag){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            window.location.reload();
                        }
                    }
                })
            }, function () {
                layer.closeAll();
            });
        }
    })
</script>
