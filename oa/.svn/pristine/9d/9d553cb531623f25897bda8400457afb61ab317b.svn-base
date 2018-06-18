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
    <title><fmt:message code="event.th.VehicleInformationManagement" /></title>
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
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<!DOCTYPE html>
<html>
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/deptApprove.png" align="absmiddle">
            <span class="big3"><fmt:message code="event.th.VehicleInformationManagement" /></span>
        </div>
    </div>
    <div class="main">
        <table border="0" cellspacing="0" cellpadding="0" id="listTable">
            <thead>
                <tr>
                    <th class="th"><fmt:message code="global.lang.select" /></th>
                    <th class="th"><fmt:message code="event.th.BrandModel" /></th>
                    <th class="th"><fmt:message code="event.th.LicensePlateNumber" /></th>
                    <th class="th"><fmt:message code="event.th.Driver" /></th>
                    <th class="th"><fmt:message code="notice.th.type" /></th>
                    <th class="th"><fmt:message code="event.th.PurchaseDate" /></th>
                    <th class="th"><fmt:message code="event.th.AnnualInspectionDate" /></th>
                    <th class="th"><fmt:message code="event.th.InsuranceDate" /></th>
                    <th class="th"><fmt:message code="notice.th.state" /></th>
                    <th class="th"><fmt:message code="menuSSetting.th.menuSetting" /></th>
                </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
<script>
    $(function () {
        $.ajax({
            url: '/veHicle/getAllVeHicle',
            type: 'get',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                var str="";
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td><input type="checkbox" name="checkData" class="checkChild" value="" vId="'+data[i].vId+'"/></td>' +
                            '<td>'+data[i].vModel+'</td>' +
                            '<td><a class="detail_btn" vId="'+data[i].vId+'" style="cursor: pointer">'+data[i].vNum+'</a></td>' +
                            '<td>'+data[i].vDriverName+'</td>' +
                            '<td>'+data[i].vTypeName+'</td>' +
                            '<td>'+function(){
                             if(data[i].vDate!=undefined){
                               return data[i].vDate;
                             }else{
                                 return "";
                             }
                            }()+'</td>' +
                            '<td>'+function(){
                                 if(data[i].vMot!=undefined){
                                     return data[i].vMot;
                                 }else{
                                     return "";
                                 }
                            }()+'</td>' +
                            '<td>'+function(){
                                     if(data[i].vInsure!=undefined){
                                         return data[i].vInsure;
                                     }else{
                                         return "";
                                     }
                            }()+'</td>' +
                            '<td>'+data[i].vStatusName+'</td>' +
                            '<td>' +
                            '<a href="javascript:;" onclick="schSituation('+data[i].vId+')"><fmt:message code="event.th.BookingCondition" /></a>' +
                            '<a href="javascript:;" onclick="mainRecord('+data[i].vId+')"><fmt:message code="event.th.MaintenancRecord" /></a>' +
                            '<a href="javascript:;" onclick="vehicleFile('+data[i].vId+')"><fmt:message code="event.th.VehicleArchives" /></a>' +
                            '<a href="../../veHicle/veHicleEdit?editFlag=1&vId='+data[i].vId+'"><fmt:message code="depatement.th.modify" /></a>' +
                            '<a href="javascript:;" vid="'+data[i].vId+'" class="del_btn"><fmt:message code="global.lang.delete" /></a>' +
                            '</td>' +
                            '</tr>';
                    }
                    str+='<tr>' +
                        '<td> ' +
                        '<input type="checkbox" name="checkedAll" id="checkedAll" />' +
                        '</td>' +
                        '<td colspan="9" style="text-align: left;">' +
                        '<div class="delete_ok"><span class="span"><a href="javascript:;" style="font-size: 14px;" class="delete_check"><fmt:message code="event.th.DeleteSelectedVehicle" /></a><span></div>' +
                        '</td> ' +
                        '</tr>'
                    $("#listTable tbody").html(str);
                }
            }
        })
    })

    //单个删除
    $("#listTable").on("click",".del_btn",function () {
        var vId="";
        vId= $(this).attr("vId");
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteVehiclen" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/veHicle/deleteVeHicleByVid',
                type: 'get',
                data: {
                    vId: vId,
                },
                dataType: 'json',
                success: function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1}, function () {
                            window.location.href='<%=basePath%>/veHicle/veHicleInfoManage';
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
        var vIds = "";
        $("#listTable .checkChild:checkbox:checked").each(function () {
            var vId = $(this).attr("vId");
            vIds += vId+",";
        })
        if (vIds.length<=0) {
            $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
        } else {
            layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                title: " <fmt:message  code="notice.th.DeleteFile"/>"
            }, function () {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '<%=basePath%>/veHicle/deleteVeHiclesByVids',
                    dataType: 'json',
                    data: {'vIds': vIds},
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

    //点击车牌号显示车辆详细信息
    $('#listTable').on('click','.detail_btn',function(){
        $.popWindow('<%=basePath%>veHicle/veDetail?vId='+$(this).attr("vId"),'<fmt:message code="event.th.VehicleDetails" />','100','300','1000px','700px');
    })

    //车辆档案按钮
    function vehicleFile(vId) {
        layer.open({
            type: 1,
            title: ['<fmt:message code="event.th.VehicleArchives" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['650px', '450px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content: '<div class="div_table" style="margin-left: 15px;">' +
            '<div style="font-size: 17px;margin-left: 18px;margin-top: 15px;margin-bottom: -13x;" class="textContent"><fmt:message code="event.th.VehicleArchives" /></div>' +
            '<div class="div_tr">' +
            '<input type="hidden" id="vId">' +
            '<table class="" style="width: 92%; margin-left:18px; margin-top: 10px;">'+
            '<tr>'+
            '<td><fmt:message code="event.th.CurrentUser" />：</td>'+
            '<td><input name="vCaruser" id="vCaruser" type="text" style="width: 180px;height: 30px;float:left" disabled readonly user_id="">' +
            '<a href="javascript:;" id="addVCaruserBtn" onclick="addUser('+"'vCaruser'"+')" style="float:left"><fmt:message code="global.lang.select" /></a>' +
            ' <a href="javascript:;" id="clearVCaruserBtn" onclick="emptyUser('+"'vCaruser'"+')" style="float:left"><fmt:message code="global.lang.empty" /></a>' +
            '</td>'+
            '</tr>'+
            '<tr>'+
            '<td><fmt:message code="event.th.HistoricalRecord" />：</td>'+
            '<td><textarea name="histort" id="histort"  cols="60" rows="7"></textarea></td>'+
            '</tr>'+
            '<tr>'+
            '<td><fmt:message code="email.th.filechose" /></td>'+
            '<td>'+
            '</td>'+
            '</tr>'+
            '<tr><td  colspan="2"><input type="button" value="<fmt:message code="global.lang.save" />" id="save_btn" style="width: 70px;height: 28px"></td></tr>'+
            '</table>'+
            '</div></div>',
            success:function(){
                $.ajax({ type: 'post',
                    url: '/veHicle/getDetailVeHicle',
                    dataType: 'json',
                    data: {'vId': vId},
                    success:function (json) {
                        var data=json.obj;
                        $("#vId").val(data.vId);
                        $("#vCaruser").attr("user_id",data.vCaruser);
                        $("#vCaruser").val(data.vCaruserName);
                        $("#histort").val(data.histort);
                    }
                })
                $("#save_btn").click(function () {
                    $.ajax({
                        url: "/veHicle/editVeHicle",
                        type: 'post',
                        dataType: 'json',
                        data: {
                            vId: $("#vId").val(),
                            vCaruser: $("#vCaruser").attr("user_id"),
                            histort: $("#histort").val()
                        },
                        success: function (json) {
                            if (json.flag) {
                                $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                                });
                            }
                        }
                    })
                })
            },
            yes:function(index){
                layer.close(index);
            },
        });
    }

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }

    //选（单个）人员控件
    function addUser(id){
        user_id = id;
        $.popWindow("../../common/selectUser?0");
    }

    //预定情况
     function schSituation(vId){
         layer.open({
             type: 1,
             title: ['<fmt:message code="event.th.VehicleBooking" />', 'background-color:#2b7fe0;color:#fff;'],
             area: ['800px', '450px'],
             shadeClose: true, //点击遮罩关闭
             btn: ['<fmt:message code="global.lang.close" />'],
             content: '<div class="showWorkDetail">' +
             '<div style="font-size: 17px;margin-left: 60px;margin-top: 13px;margin-bottom: -18px;" class="list"><fmt:message code="event.th.LeaderAnnotationRecord" /></div>' +
             '<div class="table list">' +
             '<table style="width: 90%; margin-left:60px; margin-top: 30px;" class="showSchList">' +
             '<thead>'+
             '<tr>' +
             '<td style="width: 15%"><fmt:message code="notice.th.state" /></td>' +
             '<td style="width: 10%"><fmt:message code="event.th.VehicleMan" /></td>' +
             '<td style="width: 25%"><fmt:message code="attend.th.Reason" /></td>' +
             '<td style="width: 15%"><fmt:message code="sup.th.startTime" /></td>' +
             '<td style="width: 15%"><fmt:message code="meet.th.EndTime" /></td>' +
             '<td style="width: 20%"><fmt:message code="journal.th.Remarks" /></td>' +
             '</tr>' +
             '</thead>'+
             '<tbody class="tbody"></tbody>' +
             '</table>' +
             '</div></div>',
             success:function(){
                 $.ajax({ type: 'post',
                     url: '/veHicleUsage/getReservation',
                     dataType: 'json',
                     data: {'vId': vId},
                     success:function (json) {
                         var data=json.obj;
                         var str="";
                         for(var i=0;i<data.length;i++){
                             str+='<tr>' +
                                 '<td>'+data[i].vuStatusName+'</td>' +
                                 '<td>'+data[i].vuUserName+'</td>' +
                                 '<td>'+data[i].vuReason+'</td>' +
                                 '<td>'+data[i].vuStart+'</td>' +
                                 '<td>'+data[i].vuEnd+'</td>' +
                                 '<td>'+data[i].vuRemark+'</td>' +
                                 '</tr>';
                         }
                         $(".showSchList tbody").html(str);
                     }
                 })
             },
             yes:function(index){
                 layer.close(index);
             },
         });
     }

     //维护记录
    function mainRecord(vId){
        layer.open({
            type: 1,
            title: ['<fmt:message code="event.th.VehicleRecord" />', 'background-color:#2b7fe0;color:#fff;'],
            area: ['800px', '450px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['<fmt:message code="global.lang.close" />'],
            content: '<div class="showWorkDetail">' +
            '<div style="font-size: 17px;margin-left: 60px;margin-top: 13px;margin-bottom: -18px;" class="list"><fmt:message code="event.th.MaintenanceRecord" /></div>' +
            '<div class="table list">' +
            '<table style="width: 90%; margin-left:60px; margin-top: 30px;" class="showRecordList">' +
            '<thead><tr>' +
            '<td><fmt:message code="event.th.LicensePlateNumber" /></td>' +
            '<td><fmt:message code="event.th.MaintenanceType" /></td>' +
            '<td><fmt:message code="event.th.MaintenanceReason" /></td>' +
            '<td><fmt:message code="event.th.MaintenanceDate" /></td>' +
            '<td><fmt:message code="workflow.th.Manager" /></td>' +
            '<td><fmt:message code="event.th.maintenanceCost" /></td>' +
            '<td><fmt:message code="journal.th.Remarks" /></td>' +
            '</tr></thead>' +
            '<tbody class="tbody"></tbody>' +
            '</table>' +
            '</div></div>',
            success:function(){
                $.ajax({ type: 'post',
                    url: '/veHicle/getVeHicleFixRecord',
                    dataType: 'json',
                    data: {'vId': vId},
                    success:function (json) {
                        var data=json.obj;
                        var str="";
                        for(var i=0;i<data.length;i++){
                            str+='<tr>' +
                                '<td>'+data[i].vIdNumber+'</td>' +
                                '<td>'+data[i].vmTypeName+'</td>' +
                                '<td>'+data[i].vmReason+'</td>' +
                                '<td>'+data[i].vmRequestDate+'</td>' +
                                '<td>'+data[i].vmPersonName+'</td>' +
                                '<td>'+data[i].vmFee+'</td>' +
                                '<td>'+data[i].vmRemark+'</td>' +
                                '</tr>';
                        }
                        $(".showRecordList tbody").html(str);
                    }
                })
            },
            yes:function(index){
                layer.close(index);
            },
        });
    }

</script>
