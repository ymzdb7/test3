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
<style>
    .deleteok{
        width: 109px;
        height:24px;
        background: url(../../img/btn_deleteannounce.png) 0px 0px no-repeat;
    }
</style>
<html>
<head>
    <title>培训计划审批</title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
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

    .div_table .div_tr {
         border-bottom: none;
    }
</style>
<body>
    <div class="headTop" style="border-bottom: 0px;">
        <div class="headImg">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yibanfawen.png" alt="">
        </div>
        <div class="divTitle">
          <fmt:message code="event.th.TrainingPlanApproval" />
        </div>
    </div>
    <div style="margin: 0 auto;height:50px;width: 97%;" class="clearfix">
    </div>


    <div class="pagediv" style="margin: 0 auto;width: 97%;">
        <table id="tr_td">
            <thead>
            <tr>
                <td class="th" style="width:10%;" ><fmt:message code="event.th.TrainingPlanNumber" /></td>
                <td class="th" style="width:10%;"><fmt:message code="event.th.NameTrainingPlan" /></td>
                <td class="th" style="width:10%;"><fmt:message code="event.th.TrainingChannel" /></td>
                <td class="th" style="width:10%;"><fmt:message code="event.th.TrainingForm" /></td>
                <td class="th" style="width:10%;"><fmt:message code="event.th.PlanState" /></td>
                <td class="th notice_do" style="width:12%; text-align: center;"><fmt:message code="menuSSetting.th.menuSetting" /></td>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
    <script>
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
                useFlag:true,
                assessingStatus:0
            },
            init:function () {
            },
            page:function () {
                var me=this;
                $.get('/eduTrainPlan/getEduTrainByStatus',me.data,function (json) {
                        var str='';
                        var arr=json.obj
                    if(arr.length>0){
                       for(var i=0;i<arr.length;i++){
                            str+='<tr>'+
                                '<td style="width: 10%;">'+arr[i].planNo+'</td>' +
                                '<td style="width: 10%;">'+arr[i].planName+'</td>' +
                                '<td style="width: 10%;">'+arr[i].channelName+'</td>' +
                                '<td style="width: 10%;">'+arr[i].courseTypesName+'</td>' +
                                '<td style="width: 10%;">'+arr[i].assessingStatuName+'</td>' +
                                '<td style="width: 12%;">' +
                                '<a href="javascript:void(0)" data-id="'+arr[i].planId+'"  onclick="detail('+arr[i].planId+');" class="deleteSc"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+arr[i].planId+'" onclick="approval('+arr[i].planId+');" class="approval"><fmt:message code="meet.th.Approval" /></a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+arr[i].planId+'"  onclick="refuse('+arr[i].planId+');" class="refuse"><fmt:message code="sup.th.refuse" /></a>' +
                                '</td>' +
                                '</tr>'
                        }
                    }
                        $('.pagediv table tbody').html(str);
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

         function approval(e){
             layer.open({
                 type: 1,
                 title: ['<fmt:message code="event.th.ApprovalOpinions" />', 'background-color:#2b7fe0;color:#fff;'],
                 area: ['350px', '230px'],
                 offset: ['150px', '400px'],
                 shadeClose: true, //点击遮罩关闭
                 btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                 content: '<div class="div_table" style="margin-left: 35px;">'+
                 '<div class="div_tr" style="margin-top: 10px;"><span class="span_td" style="color: #f43838;font-family:微软雅黑"><fmt:message code="event.th.approvalopinions" />：</span></div>'+
                 '<div class="div_tr" style="margin-top: 10px;"><textarea name="txt" id="assessingView" value="" style="min-width: 260px;min-height:80px;"></textarea></div>'+
                 '</div>',
                 success:function(){
                 },
                 yes: function (index) {
                     var data = {
                         PlanId:e,
                         assessingStatus:1,
                         assessingView:$('#assessingView').val()
                     }
                     edit(data);
                     layer.close(index);
                 },
             });
         }

         function detail(e){
             $.popWindow("<%=basePath%>eduTrainPlan/goDetail?planId=" + e, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
         }

         function refuse(e){
             layer.open({
                 type: 1,
                 title: ['<fmt:message code="event.th.ApprovalOpinions" />', 'background-color:#2b7fe0;color:#fff;'],
                 area: ['350px', '230px'],
                 offset: ['150px', '400px'],
                 shadeClose: true, //点击遮罩关闭
                 btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                 content: '<div class="div_table" style="margin-left: 35px;">'+
                 '<div class="div_tr" style="margin-top: 10px;"><span class="span_td" style="color: #f43838;font-family:微软雅黑"><fmt:message code="event.th.rejection" />：</span></div>'+
                 '<div class="div_tr" style="margin-top: 10px;"><textarea name="txt" id="assessingView" value="" style="min-width: 260px;min-height:80px;"></textarea></div>'+
                 '</div>',
                 success:function(){
                 },
                 yes: function (index) {
                     var data = {
                         PlanId:e,
                         assessingStatus:2,
                         assessingView:$('#assessingView').val()
                     }
                     edit(data);
                     layer.close(index);
                 },
             });
         }

         function edit(data){
             $.ajax({
                 url: "<%=basePath%>/eduTrainPlan/editEduTrainByStatus",
                 type:'get',
                 dataType:"JSON",
                 data : data,
                 success:function(data){
                     if(data.flag==true){
                         $.layerMsg({content:'<fmt:message code="meet.th.SuccessfulApproval" />',icon:1});
                         ajaxPage.data.page=1;
                         ajaxPage.page()
                     }else{
                         $.layerMsg({content:'<fmt:message code="event.th.ApprovalFailure" />',icon:2});
                     }
                 }
             })

         }

       $(function(){



       })


         //时间控件调用
         var start = {
             format: 'YYYY-MM',
             /* min: laydate.now(), //设定最小日期为当前日期*/
             /* max: '2099-06-16 23:59:59', //最大日期*/
             istime: true,
             istoday: false,
             choose: function(datas){
                 end.min = datas; //开始日选好后，重置结束日的最小日期
                 end.start = datas //将结束日的初始值设定为开始日
             }
         };


    </script>
</body>
</html>
