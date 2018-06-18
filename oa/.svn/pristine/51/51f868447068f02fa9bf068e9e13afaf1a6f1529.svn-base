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
    <title>培训记录管理</title>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
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
        margin-left: 50px;
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
    .div_1{
        margin-left: 20px;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
    <div class="headTop" style="border-bottom: 0px;">
        <div class="headImg">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" alt="">
        </div>
        <div class="divTitle">
          <fmt:message code="event.th.TrainingRecordManagement" />
        </div>
    </div>
    <div style="margin: 0 auto;height:50px;width: 97%;" class="clearfix">
        <div id="dbgz_page" class="M-box3 fr">

        </div>
    </div>


    <div class="pagediv" style="margin: 0 auto;width: 97%;">
        <table id="tr_td" style="width: 100%;">
            <thead>
            <tr>
                <td class="th" style="width:8%;text-align: center;"><fmt:message code="global.lang.select" /></td>
                <td class="th" style="width:15%;text-align: center;"><fmt:message code="event.th.NameTrainingPlan" /></td>
                <td class="th" style="width:15%;text-align: center;"><fmt:message code="event.th.trainee" /></td>
                <td class="th" style="width:20%;text-align: center;"><fmt:message code="event.th.TrainingCost" /></td>
                <td class="th" style="width:20%;text-align: center;"><fmt:message code="event.th.TrainingInstitution" /></td>
                <%--<td class="th" style="width:10%;text-align: center;"><fmt:message code="sup.th.RelatedAccessories" /></td>--%>
                <td class="th" style="width:22%;text-align: center;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
            </tr>
            </thead>
            <tbody id="j_tb">
            </tbody>
        </table>
    </div>
    <div class="bodycolor con_edit" style="display:none;" topmargin="5">
        <table border="0" width="100%" cellspacing="0" cellpadding="0" class="small">
            <tr>
                <td>
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/notify_new.png" align="absmiddle"><span class="big3"><fmt:message code="event.th.ReviseTrainingRecordInformation" /></span>&nbsp;&nbsp;
                </td>
            </tr>
        </table>
        <br>
        <table class="TableBlock" width="80%" align="center">
            <input type="hidden" id="recordId">
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.trainee" />：</td>
                <td nowrap class="TableData">
                    <input type="text" id="staffUserName" name="staffUserName" style="width: 158px;height:28px;" size="12" class="BigStatic" readonly value="">&nbsp;
                </td>
                <td nowrap class="TableData"><fmt:message code="event.th.NameTrainingPlan" />：</td>
                <td class="TableData" >
                    <INPUT type="text" id="tPlanName"  name="tPlanName" style="width: 158px;height:28px;" class=BigStatic size="11" value="" />
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingInstitution" />：</td>
                <td class="TableData">
                    <input type="text" id="tInstitutionName" style="width: 158px;height:28px;" name="joinNum" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingCost" />：</td>
                <td>
                <input type="text" id="trainningCost" style="width: 158px;height:28px;" name="trainningCost" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingResults" />：</td>
                <td class="TableData">
                    <input type="text" id="tExamResults" style="width: 158px;height:28px;" name="joinNum" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
                <td nowrap class="TableData"><fmt:message code="event.th.TrainingGrade" />：</td>
                <td>
                <input type="text" id="tExamLevel" style="width: 158px;height:28px;" name="trainningCost" size="12" maxlength="10" class="BigInput" value=""/>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.Attendance" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="dutySituation" id="dutySituation" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="event.th.SummarizSituation" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="trainningSituation" id="trainningSituation" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="news.th.comment" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="tComment" id="tComment" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
            <tr>
                <td nowrap class="TableData"><fmt:message code="journal.th.Remarks" />：</td><%--备注--%>
                <td class="TableData" colspan=3>
                    <textarea name="remark" id="remark" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>
         <%--   <tr>
                <td nowrap class="TableData">附件上传：</td>
                <td class="TableData" colspan=3>
                    <textarea name="content" id="att" cols="84" rows="3" class="BigInput" value=""></textarea>
                </td>
            </tr>--%>
            <tr align="center" class="TableControl">
                <td colspan=4 nowrap>
                    <div id="rs" type="save" class="btn_style btn_ok"><fmt:message code="global.lang.save" /></div><%--保存--%>
                </td>
            </tr>
        </table>
    </div>
    <script>

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
                         url: '<%=basePath%>/record/deleteByIds',
                         dataType: 'json',
                         data: {'recordIds': fileId},
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

         var user_id;
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
                 $.get('<%=basePath%>record/getAll',me.data,function (json) {
                     var str='';
                     var arr=json.obj
                     if(arr.length>0){
                         for(var i=0;i<arr.length;i++){
                             str+='<tr>'+
                                 "<td style='width:8%;'><input class='checkChild' style='margin-left: 20px;' type='checkbox' conid='" + arr[i].recordId + "' name='check' value=''></td>"+
                                 '<td style="width: 15%;text-align:center;">'+arr[i].tPlanName+'</td>' +
                                 '<td style="width: 15%;text-align:center;">'+arr[i].staffUserName+'</td>' +
                                 '<td style="width: 20%;text-align:center;">'+function () {
                                     if(arr[i].trainningCost!=null){
                                         return arr[i].trainningCost
                                     }else{
                                         return "";
                                     }
                                 }()+'</td>' +
                                 '<td style="width: 20%;text-align:center;">'+arr[i].tInstitutionName+'</td>' +
                                /* '<td style="width: 10%;text-align:center;">'+arr[i].attachmentName+'</td>' +*/
                                 '<td style="width: 22%;text-align:center;">' +
                                 '<a href="javascript:void(0)" data-id="'+arr[i].recordId+'"  onclick="detail('+arr[i].recordId+');" class="deleteSc"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+arr[i].recordId+'" onclick="edit('+arr[i].recordId+');" class="editSc"><fmt:message code="global.lang.edit" /></a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+arr[i].recordId+'"  onclick="delete_1('+arr[i].recordId+');" class="deleteSc"><fmt:message code="global.lang.delete"/></a>' +
                                 '</td>' +
                                 '</tr>'
                         }
                     }
                     var last_str = "<tr class='last_str'><td><input id='checkedAll' style='margin-left: 20px;' class='checkChild' type='checkbox' conid='' name='check' value=''><fmt:message code="notice.th.allchose" /></td><td class='btnStyle delete_check'><div class='deleteok'><span class='delete_ok1'><fmt:message code="global.lang.delete" /></span></div></td><td class=''></td><td></td><td></td><td></td></tr>";
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

         function detail(e){
             $.popWindow("<%=basePath%>record/goDetail?recordId=" + e, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
         }

         function edit(e){
             $(".headTop").css("display","none");
             $(".con_edit").css("display","block");
             $(".pagediv").css("display","none");
             $(".clearfix").css("display","none");
             $.ajax({
                 type:'post',
                 url:'<%=basePath%>record/getdetail',
                 dataType:'json',
                 data:{'recordId':e},
                 success:function(result){
                     var data=result.obj;
                     $('#recordId').val(data.recordId);
                     $('#staffUserName').val(data.staffUserName);
                     $('#tPlanName').val(data.tPlanName);
                     $('#tInstitutionName').val(data.tInstitutionName);
                     $('#trainningCost').val(data.trainningCost);
                     $('#tExamResults').val(data.tExamResults);
                     $('#tExamLevel').val(data.tExamLevel);
                     $('#dutySituation').val(data.dutySituation);
                     $('#trainningSituation').val(data.trainningSituation);
                     $('#tComment').val(data.tComment);
                     $('#remark').val(data.remark);
                 }
             })

         }

        //修改时点击保存按钮
         // 提交表单
         $("#rs").click(function(){
                 var data = {
                     recordId:$('#recordId').val(),
                     staffUserName:$('#staffUserName').val(),
                     tPlanName:$('#tPlanName').val(),
                     tInstitutionName:$('#tInstitutionName').val(),
                     trainningCost:$('#trainningCost').val(),
                     tExamResults:$('#tExamResults').val(),
                     tExamLevel:$('#tExamLevel').val(),
                     dutySituation:$('#dutySituation').val(),
                     trainningSituation:$('#trainningSituation').val(),
                     tComment:$('#tComment').val(),
                     remark:$('#remark').val()
                 }
                 $.ajax({
                     type: 'post',
                     url: '<%=basePath%>record/editRecord',
                     dataType: 'json',
                     data: data,
                     success: function (rsp) {
                         if (rsp.flag == true) {
                             layer.msg('<fmt:message  code="depatement.th.Modifysuccessfully"/>',{icon:1});/*添加成功*/
                             window.location.href='<%=basePath%>/record/trainRecordMange';
                         } else {
                             layer.msg('<fmt:message  code="depatement.th.modifyfailed"/>',{icon:2});/*添加失败*/
                         }
                     }
                 })
         });


         function delete_1(e){
             layer.confirm('<fmt:message code="sup.th.Delete" />？', {
                 btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                 title:"<fmt:message code="notice.th.DeleteFile" />"
             }, function(){
                 //确定删除，调接口
                 $.ajax({
                     type:'post',
                     url:'<%=basePath%>record/delete',
                     dataType:'json',
                     data:{'recordId':e},
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


       $(function(){
           //培训人员
           $('#add').click(function(){
               user_id="usersInput";
               $.popWindow("../../common/selectEduUser");
           });
           // 清空
           $('#del').click(function(){
               $('#usersInput').attr("dataid","");
               $('#usersInput').attr("user_id","");
               $('#usersInput').val("");
           });
       })

    </script>
</body>
</html>
