<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/8/1
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.timedtask" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <link rel="stylesheet" href="/lib/laydate.css">
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/lib/laydate/laydate.js"></script>

    <script src="/js/base/base.js"></script>
</head>
<body>
<div class="cont_r " style="margin-left: 0px;">
    <div class="item_s item_con">
        <table class="table" cellspacing="0" id="table_task">
            <caption class="clearfix">
                <img style="margin-right: 10px;width: 18px;padding-left: 15px;float: left;" src="/img/workflow/flowsetting/flowSettingMain/dingshi.png"  alt="">

                <span class="priv_t"><fmt:message code="workflow.th.timedtask" /></span>
                <a href="javascript:void (0)" class="new_liucheng task_n" data-id="1"><fmt:message code="global.lang.new" /></a>
                <a href="javascript:void (0)" id="del"></a>
            </caption>
            <thead>
                <tr>
                    <th><fmt:message code="sms.th.Button" /></th>
                    <th><fmt:message code="workflow.th.TimingType" /></th>
                    <th><fmt:message code="workflow.th.ProcessInitiator" /></th>
                    <th><fmt:message code="workflow.th.DateOfLaunch" /></th>
                    <th><fmt:message code="workflow.th.LaunchTime" /></th>
                    <th><fmt:message code="menuSSetting.th.menuSetting" /></th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
</div>
<script>
    if (!Date.prototype.toISOString) {
        Date.prototype.toISOString = function() {
            function pad(n) { return n < 10 ? '0' + n : n }
            return this.getUTCFullYear() + '-'
                + pad(this.getUTCMonth() + 1) + '-'
                + pad(this.getUTCDate()) + 'T'
                + pad(this.getUTCHours()) + ':'
                + pad(this.getUTCMinutes()) + ':'
                + pad(this.getUTCSeconds()) + '.'
                + pad(this.getUTCMilliseconds()) + 'Z';
        }
    }
  function ajaxTimingTak() {
      $.ajax({
          type: 'get',
          url: '/flowSetDatas/getFlowTimerList',
          dataType: 'json',
          data: {
              flowId: parent.getResObj.flowId
          },
          success: function (data) {
              var data_d = data.datas;
              if (data.flag) {
                  var strData='';
                  for (var i = 0; i < data_d.length; i++) {
                      var data_det = JSON.stringify(data_d[i]).replace(/"/g, "'");

                      strData += '<tr>' +
                          '<td>' +
                          '<input type="checkbox" class="one"  timerId="' + data_d[i].tid + '">' +
                          '</td>' +
                          '<td>' + data_d[i].typeName +
                          '</td>' +
                          '<td style="text-align: center;padding-left: 10px">'
                          + function(){
                          if(data_d[i].userName==undefined){
                              return ''
                          }else {
                              return '<span style="display: block">'+data_d[i].userName+'</span>'
                          }
                      }() +
                          function(){
                              if(data_d[i].deptName==undefined){
                                  return ''
                              }else {
                                  return '<span style="display: block">'+data_d[i].deptName+'</span>'
                              }
                          }()   +
                          '' +
                          function(){
                                  if(data_d[i].roleName==undefined){
                                      return ''
                                  }else {
                                      return '<span style="display: block">'+data_d[i].roleName+'</span>'}
                              }() + '</td>' +
                          '<td style="text-align: center;padding-left: 10px">' + data_d[i].remindDate + '</td>' +
                          '<td style="text-align: center;padding-left: 10px">' + data_d[i].lastTime + '</td>' +
                          '<td>' +
                          '<a href="javascript:void(0)" timerId="' + data_d[i].tid + '" class="privUp fileUpdateactive task_n" ><input type="hidden" value="' + data_det + '"><fmt:message code="menuSSetting.th.editMenu" /></a>' +
                          '<a class="del del_privactive" href="javascript:void(0)" timerId="' + data_d[i].tid + '" ><fmt:message code="global.lang.delete" /></a>' + '</td>' +
                          '</tr>';
                  }
                  $('#table_task tbody').html(strData);
              }else {
                  $('#table_task tbody').html('');
              }

          }
      })
  }
  ajaxTimingTak()


  $('.table').on('click', '.task_n', function () {
      var url='';
      var me=this;
        if($(this).attr('data-id')==1){
            url='/flowSetDatas/newFlowTimer'
        } else {
            url='/flowSetDatas/updateFlowTimer'
            var timerId = $(this).attr('timerId');
            var data_up = $(this).find("input").val().replace(/'/g, '"');
            var data_upTwo=null;
            data_upTwo = JSON.parse(data_up);
        }
      var date=new Date(+new Date()+8*3600*1000).toISOString().replace(/T/g,' ').replace(/\.[\d]{3}Z/,'');



      layer.open({
          title: '<p style="height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
          shade: 0.3,
          content: '<div class="pop_con">' +
          '<div class="con_t">' +
          '<div class="con_l">' +
          '<div class="con_title">' +
          '<div class="title_1">' +
          '<div class="title_label"></div>' +
          '<span class="title_s"><fmt:message code="workflow.th.InitiatingFrequency" /> <label style="color:red">*</label></span>' +
          '<div class="title_put"><select name="" id="creaRage" class="select_t"><option value="1"><fmt:message code="workflow.th.RunponlyOnce" /></option><option value="2"><fmt:message code="workflow.th.DailyRelease" /></option><option value="3"><fmt:message code="workflow.th.WeeklyRelease" /></option><option value="4"><fmt:message code="workflow.th.MonthlyRelease" /></option><option value="5"><fmt:message code="workflow.th.YearlyRelease" /></option></select></div></div>' +
          '<p class="title_s"><fmt:message code="workflow.th.LaunchTime" /> <label style="color:red">*</label></p>' +
          '<div class="title_2">' +
          '<input type="text" class="select_t" value="'+date+'" id="creaTime" onclick="laydate({istime: true, format: \'YYYY-MM-DD hh:mm:ss\',min:\''+date+'\'})"></div>' +
          '<div class="title_3">' +
          '<div class="title3_label">' +
          '<span class="title_s"><fmt:message code="workflow.th.Initiator" /> </span></div>' +
          '<div class="select_put">' +
          '<textarea name="txt" id="addUser" user_id="admin" value="admin" disabled></textarea>' +
          '<a style="margin-left: 10px;cursor: pointer" id="addSave_u"><fmt:message code="global.lang.add" /></a>' +
          '<a id="clear_r" class="clear_r_cTwo" style="margin-left: 10px;cursor: pointer"><fmt:message code="global.lang.empty" /></a></div></div>' + '<div class="title_3">' +
          '<div class="title3_label">' +
          '<span class="title_s"><fmt:message code="worflow.th.SponsorDepartment" /> </span></div>' +
          '<div class="select_put">' +
          '<textarea name="txt" id="addDep" user_id="admin" value="admin" disabled></textarea>' +
          '<a style="margin-left: 10px;cursor: pointer" id="addSave_d"><fmt:message code="global.lang.add" /></a>' +
          '<a style="margin-left: 10px;cursor: pointer" class="clear_r_cTwo" id="clear_b"><fmt:message code="global.lang.empty" /></a></div>' + '</div>' + '<div class="title_3">' +
          '<div class="title3_label">' +
          '<span class="title_s"><fmt:message code="workflow.th.LaunchRole" /> </span></div>' +
          '<div class="select_put">' +
          '<textarea name="txt" id="addRole" user_id="admin" value="admin" disabled></textarea>' +
          '<a style="margin-left: 10px;cursor: pointer" id="addSave_r"><fmt:message code="global.lang.add" /></a>' +
          '<a style="margin-left: 10px;cursor: pointer" class="clear_r_cTwo" id="clear_e"><fmt:message code="global.lang.empty" /></a></div>' + '</div>' +
          '</div></div></div>' +
          '</div>',
          area: ['600px', '500px'],
          btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
          success: function () {
              $('.clear_r_cTwo').click(function () {
                  $(this).siblings('textarea').val('')
                  $(this).siblings('textarea').attr('dataid','')
                  $(this).siblings('textarea').attr('privid','')
                  $(this).siblings('textarea').attr('deptid','')
              })
              /*弹窗控件*/
              $("#addSave_u").click(function () {
                  user_id = 'addUser';
                  $.popWindow("../common/selectUser");
              });
              $("#addSave_d").click(function () {
                  dept_id = 'addDep';
                  $.popWindow("../common/selectDept");
              })
              $("#addSave_r").click(function () {
                  priv_id = 'addRole';
                  $.popWindow("../common/selectPriv");
              })


              if($(me).attr('data-id')!=1){
                  $('#addUser').val(data_upTwo.userName);
                  $('#addUser').attr('dataid',data_upTwo.userStr.split(',').splice(0,1).join()+',');
                  $('#addDep').val(data_upTwo.deptName);
                  $('#addDep').attr('deptid',data_upTwo.deptStr.split(',').splice(0,1).join()+',');
                  $('#addRole').val(data_upTwo.roleName);
                  $('#addRole').attr('privid',data_upTwo.privStr.split(',').splice(0,1).join()+',');

                  $('#creaRage').find('option').each(function (i,n) {
                      if($(this).val()==data_upTwo.type){
                          $(this).attr('selected','selected')
                      }
                  })
              }
          },
          yes: function () {
              if($("#addUser").attr("dataid")!=undefined||$("#addRole").attr("privid")!=undefined||
                  $("#addDep").attr("deptid")!=undefined){
                  var userId = $("#addUser").attr("dataid");
//              userId = userId.split(',');
                  var userIdAry = [];
//                  userIdAry.push(deptId||-1);
                  userIdAry.push((function () {
                      if(deptId==undefined){
                          return -1
                      }else {
                          return deptId
                      }
                  })());

                  var deptId = $('#addDep').attr('deptid');
                  var deptIdAry = [];
//                  deptIdAry.push(deptId||-1);
                  deptIdAry.push((function () {
                      if(deptId==undefined){
                          return -1
                      }else {
                          return deptId
                      }
                  })());
                  var privid = $('#addRole').attr('privid');
                  var privIdAry = [];
//                  privIdAry.push(privid||-1);
                  privIdAry.push((function () {
                      if(privid==undefined){
                          return -1
                      }else {
                          return privid
                      }
                  })());
                  var datas = {
                      'type': $('#creaRage').val(),
                      'date': $('#creaTime').val(),
                      'user[]': userId,
                      'role[]': privIdAry,
                      'dept[]': deptIdAry,
                      'flowId': parent.getResObj.flowId
                  }



                  if($(me).attr('data-id')!=1){
                      data.timerId=timerId;
                  }
                  $.ajax({
                      type: 'GET',
                      url: url,
                      dataType: 'json',
                      data: datas,
                      success: function (data) {
                          if (data.flag) {
                              $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation" />',icon:1});
                              ajaxTimingTak()
                          } else {
                              $.layerMsg({content:'<fmt:message code="sms.th.operationFailed" />',icon:2});
                          }
                      }
                  })

              }else {
                  alert('<fmt:message code="workflow.th.Authorization" />')
              }




          }
      })
  });
$(document).delegate('.del_privactive','click',function () {
    var me=this;
    $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="workflow.th.que" />？',icon:0},function(){
        var timerId = [];
        var pId = $(me).attr("timerId");
        timerId.push(pId);
        $.ajax({
            type: 'get',
            url: '/flowSetDatas/deleteFlowTimer',
            dataType: 'json',
            data: {
                'timerId[]': timerId
            },
            success: function (ret) {
                if (ret.flag) {
                    layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                    ajaxTimingTak();
            }

            }
        })
    })

})

</script>
</body>
</html>
