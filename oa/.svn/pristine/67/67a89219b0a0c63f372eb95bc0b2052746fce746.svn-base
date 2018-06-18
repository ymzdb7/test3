<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title><fmt:message code="event.th.TrainingManagement" /></title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

</head>
<style>

    .headTop{
        width: 100%;
        position: fixed;
        top:0px;
        left: 0px;
        height: 45px;
        border-bottom: 1px solid #999;
        background: #fff;
        overflow: hidden;
    }
    .headTop .headImg{
        float: left;
        width: 23px;
        height: 100%;
        margin-left: 30px;
    }
    .headImg img {
        width: 23px;
        height: 23px;
        margin-top: 11px;
        vertical-align: middle;
    }
    .headTop .divTitle {
        float: left;
        height: 45px;
        line-height: 45px;
        font-size: 22px;
        margin-left: 10px;
        color: #494d59;
    }
    .deleteok{
        width: 109px;
        height:24px;
        background: url(../../img/btn_deleteannounce.png) 0px 0px no-repeat;
    }
    .delete_check {
        text-align: center;
        cursor: pointer;
    }
    .con_edit {
        width: 90%;
        margin: 10px auto;
    }


    .TableBlock .TableData td, .TableBlock td.TableData {
        background: #FFFFFF;
        border-bottom: none;
        border-right: none;
        padding: 3px;
    }
    .big3{
        margin-left: 5px;
        font-family: "微软雅黑";
        margin-top: -3px;
        margin-right: 40px;
        font-size: 22px;
        color: #494d59;
        font-weight: inherit;
    }


    .btn_ .btn_style {
        background: url("../../img/save.png") no-repeat;
    }
    #rs {
        display: inline-block;
        float: left;
        width: 66px;
        height: 30px;
        text-align: center;
        margin-top: 10px;
        margin-bottom: 20px;
        padding-left: 23px;
        padding-top: 7px;
        cursor: pointer;
        font-size: 14px;
        background: url("../../img/publish.png") no-repeat;
        margin-left: 40%;
    }
    .TableData{
        font-size: 14px;
        color: #2a588c;
        /*   font-weight: bold;*/
    }
    .TableBlock tbody tr{
        height: 52px;
    }
    .TableBlock tbody tr td{
        border: 1px solid #c0c0c0;
    }
    .TableBlock{
        border: 1px #124164 solid;
    }


    .TableBlock tr td:first-of-type,table tr td:nth-child(3){
        text-align: right;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
    <div class="headTop" style="border-bottom: 0px;">
        <div class="headImg">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yibanfawen.png" alt="">
        </div>
        <div class="divTitle">
           <fmt:message code="event.th.ManagementTrainingPlan" />
        </div>
    </div>
    <div style="margin: 0 auto;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3 fr">

        </div>
    </div>


    <div class="pagediv" style="margin: 0 auto;width: 97%;">
        <table id="tr_td">
            <thead>
            <tr>
                <%--<td class="th"><fmt:message code="notice.th.chose"/></td>--%>
                <td class="th" style="width:5%;"><fmt:message code="global.lang.select" /></td>
                <td class="th" style="width:10%;text-align:center;" ><fmt:message code="event.th.TrainingPlanNumber" /></td>
                <td class="th" style="width:10%;text-align:center; "><fmt:message code="event.th.NameTrainingPlan" /></td>
                <td class="th" style="width:10%;text-align:center;"><fmt:message code="event.th.TrainingChannel" /></td>
                <td class="th" style="width:10%;text-align:center;"><fmt:message code="event.th.TrainingForm" /></td>
                <td class="th" style="width:10%;text-align:center;"><fmt:message code="event.th.PlanState" /></td>
                <td class="th notice_do" style="width:12%; text-align: center;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
    <div class="bodycolor con_edit" style="display:none;" topmargin="5">
        <table border="0" width="100%" cellspacing="0" cellpadding="0" class="small">
            <tr>
                <td>
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle"><span class="big3"><fmt:message code="event.th.ModifyTrainingPlan" /></span>&nbsp;&nbsp;
                </td>
            </tr>
        </table>
        <br>
        <table class="TableBlock" width="80%" align="center">
            <input type="hidden" id="planId">
            <tr>
                <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="event.th.PlanNumber" />：</td>
                <td class="TableData">
                    <input type="text" id="planNo" name="planNo" style="width: 158px;height:28px;" size="12" class="BigInput" value="">&nbsp;
                </td>
                <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="event.th.PlanName" />：</td><%--合同编号--%>
                <td class="TableData" >
                    <INPUT type="text" id="planName"  name="planName" style="width: 158px;height:28px;" class=BigInput size="11" value="" />
                </td>
            </tr>

            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingChannel" />：</td>
                <td class="TableData">
                    <select name="channel" id="channel" style="background: white; width:160px;height: 28px;" title="">
                        <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                        <option value="0"><fmt:message code="event.th.InternalTraining" /></option>
                        <option value="1"><fmt:message code="event.th.Channeltraining" /></option>
                    </select>
                </td>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingForm" />：</td>
                <td class="TableData">
                    <select name="courseTypes" style="background: white;width: 160px;height:28px;" id="courseTypes" title="">
                        <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                        <option value="1"><fmt:message code="event.th.FaceToFace" /></option>
                        <option value="2"><fmt:message code="event.th.InstructionCorrespondence" /></option>
                        <option value="3"><fmt:message code="notice.type.other" /></option>
                    </select>
                </td>
            </tr>

            <tr>
                <td nowrap class="TableData"><fmt:message code="sup.th.SponsorDepartment" />：</td>
                <td class="TableData">
                    <input type="text" id="sponsoringDepartment" name="sponsoringDepartment" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value="">&nbsp;
                    <a href="javascript:;" id="departAdd" class="departAdd" ><fmt:message code="global.lang.select" /></a>
                </td>
                <td nowrap class="TableData"><fmt:message code="event.th.PersonCharge" />：</td>
                <td nowrap class="TableData">
                    <input type="text" id="chargePerson" name="chargePerson" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value="">&nbsp;
                    <a href="javascript:;" id="userAdd" class="userAdd" ><fmt:message code="global.lang.select" /></a>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.PlanParticipate" />：</td>
                <td class="TableData">
                    <input type="text" id="joinNum" style="width: 158px;height:28px;" name="joinNum" size="12" maxlength="10" class="BigInput" value=""/>
                </td>

                <td nowrap class="TableData"><fmt:message code="event.th.TrainingLocation" />：</td>
                <td class="TableData">
                    <input type="text" id="address" style="width: 158px;height:28px;" name="address" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
            </tr>

            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.NameInstitution" />：</td>
                <td class="TableData">
                    <input type="text" id="institutionName" style="width: 158px;height:28px;" name="institutionName" size="12" maxlength="10" class="BigInput" value=""/>
                </td>

                <td nowrap class="TableData"><fmt:message code="event.th.ContacInstitution" />：</td>
                <td class="TableData">
                    <input type="text" id="institutionContact" style="width: 158px;height:28px;" name="institutionContact" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingName" />：</td>
                <td class="TableData">
                    <input type="text" id="courseName" style="width: 158px;height:28px;" name="courseName" size="12" maxlength="10" class="BigInput" value=""/>
                </td>

                <td nowrap class="TableData"><fmt:message code="event.th.TotalHours" />：</td>
                <td class="TableData">
                    <input type="text" id="courseHours" style="width: 158px;height:28px;" name="courseHours" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.OpeningTime" />：</td>
                <td class="TableData">
                    <input type="text" id="courseStartTime" style="width: 158px;height:28px;" name="courseStartTime" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(start)"/>
                </td>

                <td nowrap class="TableData"><fmt:message code="meet.th.EndTime" />：</td>
                <td class="TableData">
                    <input type="text" id="courseEndTime" style="width: 158px;height:28px;" name="courseEndTime" size="12" maxlength="10" class="BigInput" value="" onClick="laydate(end)"/>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingBudget" />：</td>
                <td class="TableData">
                    <input type="text" id="bcws" style="width: 158px;height:28px;" name="bcws" size="12" maxlength="10" class="BigInput" value=""/>
                </td>

                <td nowrap class="TableData"><span style="color: red;margin-right: 5px;">*</span><fmt:message code="hr.th.Approver" />：</td>
                <td class="TableData">
                    <input type="text" id="assessingOfficer" style="width: 158px;height:28px;" name="assessingOfficer" size="12" maxlength="10" class="BigStatic" value=""/>
                    <a href="javascript:;" id="userAdd_1" class="userAdd_1" ><fmt:message code="global.lang.select" /></a>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.ParticipateTraining" />：</td>
                <td class="TableData" colspan=3>
                    <input type="hidden" name="TO_ID" id="TO_ID">
                    <textarea name="joinDept" id="joinDept" cols="84" rows="3"  class="SmallStatic" wrap="yes" readonly></textarea>
                    <a href="#" class="orgDepartAdd" title='添加'><fmt:message code="global.lang.add" /></a>
                    <a href="#" class="orgDepartClear"  title='清空'><fmt:message code="global.lang.empty" /></a>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.Participate" />：</td>
                <td class="TableData" colspan=3>
                    <textarea name="joinPerson" id="joinPerson" cols="84" rows="3"  class="SmallStatic" wrap="yes" readonly></textarea>
                    <a href="#" class="orgUserAdd" title='添加'><fmt:message code="global.lang.add" /></a>
                    <a href="#" class="orgUserClear"  title='清空'><fmt:message code="global.lang.empty" /></a>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingRelated" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="institutionInfo" id="institutionInfo" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingInstitutions" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="instituContactInfo" id="instituContactInfo" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingRequirements" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="requires" id="requires" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingInstructions" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="description" id="description" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="journal.th.Remarks" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="remark" id="remark" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <%--  <tr>
                  <td nowrap class="TableData">附件上传：</td>
                  <td colspan=3>
                          <form id="uploadimgform" target="uploadiframe"  action="../upload?module=meeting" enctype="multipart/form-data" method="post" >
                              <input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">
                              <a href="javascript:;" id="uploadimg">
                                  <img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
                          </form>
                  </td>
              </tr>--%>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingContent" />：</td>
                <td class="TableData" colspan=3>
                    <textarea name="content" id="content" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr align="center" class="TableControl">
                <td colspan=4 nowrap>
                    <div id="rs" type="save" class="btn_style btn_ok"><fmt:message code="global.lang.save" /></div><%--保存--%>
                </td>
            </tr>
        </table>
    </div>
    <script>




        var start = {
            format: 'YYYY-MM-DD hh:mm',
            /* min: laydate.now(), //设定最小日期为当前日期*/
            /* max: '2099-06-16 23:59:59', //最大日期*/
            istime: true,
            istoday: false,
            choose: function(datas){
                end.min = datas; //开始日选好后，重置结束日的最小日期
                end.start = datas //将结束日的初始值设定为开始日
            }
        };
        var end = {
            format: 'YYYY-MM-DD hh:mm',
            /*min: laydate.now(),*/
            /*max: '2099-06-16 23:59:59',*/
            istime: true,
            istoday: false,
            choose: function(datas){
                start.max = datas; //结束日选好后，重置开始日的最大日期
            }
        };



         //格式化时间
        function   formatDate(now)   {
            if(now!=''&& now!=undefined){
                var   year=now.getFullYear();
                var   month=now.getMonth()+1;
                var   date=now.getDate();
                var   hour=now.getHours();
                var   minute=now.getMinutes();
                var   second=now.getSeconds();
                return  year+"年"+month+"月";
            }else{
                return "";
            }
        }
        //格式化时间
        function   formatDate2(now)   {
            if(now!=''&& now!=undefined){
                var   year=now.getFullYear();
                var   month=now.getMonth()+1;
                var   date=now.getDate();
                var   hour=now.getHours();
                var   minute=now.getMinutes();
                var   second=now.getSeconds();
                return  year+"-"+month+"-"+date+" "+hour+":"+minute;
            }else{
                return "";
            }
        }


         //点击复选框
         $("#j_tb").on('click', '#notice_tr', function () {
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


         //点击删除选中按钮
         $('#j_tb').on('click', '.delete_check', function () {
             /* alert('111');*/
             var fileId = "";
             $("#j_tb .checkChild:checkbox:checked").each(function () {

                 var conId = $(this).attr("conId");
                 fileId += conId + ",";

             })
             if (fileId == '') {
                 $.layerMsg({content: '<fmt:message  code="meet.th.PleaseDelete"/>', icon: 0});
             } else {
                 layer.confirm('<fmt:message  code="global.lang.sure"/>', {
                     btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                     title: " <fmt:message  code="notice.th.DeleteFile"/>"
                 }, function () {
                     //确定删除，调接口
                     $.ajax({
                         type: 'post',
                         url: '<%=basePath%>/eduTrainPlan/deleteTrainObjects',
                         dataType: 'json',
                         data: {'planIds': fileId},
                         success: function () {
                             layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                             window.location.reload();
                         }
                     })
                 }, function () {
                     layer.closeAll();
                 });
             }
         })
        var dept_id='';
        var user_id='';
        $('#selectUser').click(function(){//选人员控件
            user_id='userDuser';
            $.popWindow("../common/selectUser?0");
        });
        $('#clearUser').click(function(){ //清空人员
            $('#userDuser').attr('user_id','');
            $('#userDuser').attr('dataid','');
            $('#userDuser').val('');
        });

        var ajaxPage={
            data:{
                page:1,//当前处于第几页
                pageSize:10,//一页显示几条
                useFlag:true
            },
            init:function () {
            },
            page:function () {
                var me=this;
                $.get('/eduTrainPlan/getAllTrain',me.data,function (json) {
                        var str='';
                        var arr=json.obj
                    if(arr.length>0){
                       for(var i=0;i<arr.length;i++){
                            str+='<tr>'+
                                   "<td style='width:5%;'><input class='checkChild' style='margin-left: 20px;' type='checkbox' conid='" + arr[i].planId + "' name='check' value=''></td>"+
                                '<td style="width: 10%;text-align:center;">'+arr[i].planNo+'</td>' +
                                '<td style="width: 10%;text-align:center;">'+arr[i].planName+'</td>' +
                                '<td style="width: 10%;text-align:center;">'+arr[i].channelName+'</td>' +
                                '<td style="width: 10%;text-align:center;">'+arr[i].courseTypesName+'</td>' +
                                '<td style="width: 10%;text-align:center;">'+arr[i].assessingStatuName+'</td>' +
                                '<td style="width: 12%;text-align:center;">' +
                                '<a href="javascript:void(0)" data-id="'+arr[i].planId+'"  onclick="detail('+arr[i].planId+');" class="deleteSc"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+arr[i].planId+'" onclick="edit('+arr[i].planId+');" class="editSc"><fmt:message code="global.lang.edit" /></a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+arr[i].planId+'"  onclick="delete_1('+arr[i].planId+');" class="deleteSc"><fmt:message code="global.lang.delete"/></a>' +
                                '</td>' +
                                '</tr>'
                        }
                    }
                    var last_str = "<tr class='last_str'><td><input id='checkedAll' style='margin-left: 20px;' class='checkChild' type='checkbox' conid='' name='check' value=''><fmt:message code="notice.th.allchose" /></td><td class='btnStyle delete_check'><div class='deleteok'><span class='delete_ok1'><fmt:message code="global.lang.delete" /></span></div></td><td class=''></td><td></td><td></td><td></td><td></td></tr>";
                        $('.pagediv table tbody').html(str+last_str);
                        me.pageTwo(json.totleNum,me.data.pageSize,me.data.page)

                },'json')
            },
            pageTwo:function (totalData, pageSize,indexs) {
                var mes=this;
                $('#dbgz_page').pagination({
                    totalData: totalData,
                    showData: pageSize,
                    jump: true,
                    coping: true,
                    homePage:'',
                    endPage: '',
                    current:indexs||1,
                    callback: function (index) {

                        mes.data.page=index.getCurrent();
                        mes.page();
                    }
                });
            }
        }

        ajaxPage.init()
        ajaxPage.page()
        $('.Query').click(function () {
            ajaxPage.data.page=1;
            ajaxPage.page()
        })


        function detail(e){
            $.popWindow("<%=basePath%>eduTrainPlan/goDetail?planId=" + e, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
        }

        function edit(e){
            $(".headTop").css("display","none");
            $(".con_edit").css("display","block");
            $(".pagediv").css("display","none");
            $(".clearfix").css("display","none");
            $.ajax({
                type:'post',
                url:'<%=basePath%>eduTrainPlan/getHrtailDetail',
                dataType:'json',
                data:{'planId':e},
                success:function(result){
                    var data=result.object;
                        $('#planId').val(data.planId);
                        $('#planNo').val(data.planNo);
                        $('#planName').val(data.planName);
                        $('#channel').val(data.channel);
                        $('#courseTypes').val(data.courseTypes);
                        $('#sponsoringDepartment').attr('deptid', data.sponsoringDepartment);
                        $('#sponsoringDepartment').val(data.sponsoringDepartmentName);
                        $('#chargePerson').attr('user_id', data.chargePerson);
                        $('#chargePerson').val(data.chargePersonName);
                        $('#joinNum').val(data.joinNum);
                        $('#address').val(data.address);
                        $('#institutionName').val(data.institutionName);
                        $('#institutionContact').val(data.institutionContact);
                        $('#courseName').val(data.courseName);
                        $('#courseHours').val(data.courseHours);
                        if(data.courseStartTime!=null){
                            var startTime = new Date(data.courseStartTime);
                            $('#courseStartTime').val(formatDate2(startTime));
                        }else{
                            $('#courseStartTime').val("");
                        }

                        if(data.courseEndTime!=null){
                            var endTime = new Date(data.courseEndTime);
                            $('#courseEndTime').val(formatDate2(endTime));
                        }else{
                            $('#courseEndTime').val("");
                        }
                        $('#bcws').val(data.bcws);
                        $('#assessingOfficer').attr('user_id',data.assessingOfficer);
                        $('#assessingOfficer').val(data.assessingOfficerName);
                        $('#joinDept').attr('deptid',data.joinDept);
                        $('#joinDept').val(data.joinDeptName);
                        $('#joinPerson').attr('user_id',data.joinPerson);
                        $('#joinPerson').val(data.joinPersonName);
                        $('#institutionInfo').val(data.institutionInfo);
                        $('#instituContactInfo').val(data.instituContactInfo);
                        $('#requires').val(data.requires);
                        $('#description').val(data.description);
                        $('#remark').val(data.remark);
                        $('#content').val(data.content);
                }
            })

        }


         function CheckForm(){
             if($('#planNo').val()==''){
                 layer.msg('<fmt:message  code="event.th.PlanNull"/>',{icon:2});
                 return false;
             }
             if($('#planName').val()==''){
                 layer.msg('<fmt:message  code="event.th.PlanEmpty"/>',{icon:2});
                 return false;
             }
             if($('#assessingOfficer').val()==''){ //审批人不能为空
                 layer.msg('<fmt:message  code="withdraw.th.shenpi"/>',{icon:2});
                 return false;
             }
             return true;
         }

        //修改时点击保存按钮
         // 提交表单
         $("#rs").click(function(){
             if(CheckForm())
             {
                 var data = {
                    planId: $('#planId').val(),
                     planNo: $('#planNo').val(),
                     planName: $('#planName').val(),
                     channel: $('#channel').val(),
                     courseTypes: $('#courseTypes').val(),
                     sponsoringDepartment: $('#sponsoringDepartment').attr('deptid'),
                     chargePerson: $('#chargePerson').attr('user_id'),
                     joinNum: $('#joinNum').val(),
                     address: $('#address').val(),
                     institutionName: $('#institutionName').val(),
                     institutionContact: $('#institutionContact').val(),
                     courseName:$('#courseName').val(),
                     courseHours:$('#courseHours').val(),
                     courseStartTime:$('#courseStartTime').val(),
                     courseEndTime:$('#courseEndTime').val(),
                     bcws:$('#bcws').val(),
                     assessingOfficer:$('#assessingOfficer').attr('user_id'),
                     joinDept:$('#joinDept').attr('deptid'),
                     joinPerson:$('#joinPerson').attr('user_id'),
                     institutionInfo:$('#institutionInfo').val(),
                     instituContactInfo:$('#instituContactInfo').val(),
                     requires:$('#requires').val(),
                     remark:$('#remark').val(),
                     content:$('#content').val()
                 }
                 $.ajax({
                     type: 'post',
                     url: '<%=basePath%>eduTrainPlan/editTrain',
                     dataType: 'json',
                     data: data,
                     success: function (rsp) {
                         if (rsp.flag == true) {
                             layer.msg('<fmt:message  code="depatement.th.Modifysuccessfully"/>',{icon:1});/*添加成功*/
                             window.location.href='<%=basePath%>/eduTrainPlan/goManage';
                         } else {
                             layer.msg('<fmt:message  code="depatement.th.modifyfailed"/>',{icon:2});/*添加失败*/
                         }
                     }
                 })

             }
         });






       $(function(){
           // 获取负责人
           $('.userAdd').click(function(){
               user_id="chargePerson";
               $.popWindow("../../common/selectUser?0");
           });

           //选择部门
           $('#departAdd').click(function(){
               dept_id="sponsoringDepartment";
               $.popWindow("../../common/selectDept?0");
           })
           //获取审批人
           $('.userAdd_1').click(function(){
               user_id="assessingOfficer";
               $.popWindow("../../common/selectUser?0");
           });
           //培训部门
           $('.orgDepartAdd').click(function(){
               dept_id="joinDept";
               $.popWindow("../../common/selectDept");
           });
           //清空
           $('.orgDepartClear').click(function(){
               $('#joinDept').attr("dataid","");
               $('#joinDept').attr("depart_id","");
               $('#joinDept').val("");
           })
           //培训人员
           $('.orgUserAdd').click(function(){
               user_id="joinPerson";
               $.popWindow("../../common/selectUser");
           });
           // 清空
           $('.orgUserClear').click(function(){
               $('#usersInput').attr("dataid","");
               $('#usersInput').attr("user_id","");
               $('#usersInput').val("");
           });

       })
      function delete_1(e){
              layer.confirm('<fmt:message code="sup.th.Delete" />？', {
                  btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                  title:"<fmt:message code="notice.th.DeleteFile" />"
              }, function(){
                  //确定删除，调接口
                  $.ajax({
                      type:'post',
                      url:'<%=basePath%>eduTrainPlan/deleteTrainById',
                      dataType:'json',
                      data:{'planId':e},
                      success:function(){
                          layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                          ajaxPage.data.page=1;
                          ajaxPage.page()
                      }
                  })
              }, function(){
                  layer.closeAll();
              });
      }
    </script>
</body>
</html>
