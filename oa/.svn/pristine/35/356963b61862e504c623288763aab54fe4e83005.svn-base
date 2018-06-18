<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <title><fmt:message code="event.th.TrainingRecordInquiry" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css"/>
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/conmon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>


    <style>
        .big3 {
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
            font-weight: inherit;
        }
        .tab{
            width: 80%;
            margin:0 auto;
        }
        input {
            width: auto;
            float: none;
            width: 180px;
        }
        .BigInput{
            width: 170px;
        }
        .TableBlock tr {
            height:52px;
        }
        .TableBlock td.TableData{
            border: none;
        }
        .TableBlockOne .TableData input{
            height: 25px;
            width: auto;
            float: none;
        }
        .see,.out{
            margin:0 5px;
            text-align: center;
            cursor: pointer;
        }
        .niu{
            margin:0 auto;
            text-align:center;
        }
        .planName{
            width: 186px;
        }
        button{
            width:50px;
            height:28px;
            border-radius: 5px;
            color:#fff;
            background-color:#2F8AE3;

        }
        .div_1{
            margin-left: 20px;
        }

    </style>

    <script type="text/javascript">
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";

$(function(){
})
    </script>

</head>


<link rel="stylesheet" type="text/css" href="/static/theme/15/bbs.css">
<script src="/static/js/module.js?v=150805"></script>

<body class="bodycolor" topmargin="5">

<div class="content" style="display: block;">
    <table border="0" width="80%" style="border-collapse: inherit;" cellspacing="0" cellpadding="3" class="small">
        <tr>
            <td class="Big">
                <div class="div_1">
                <img align="absMiddle" src="/img/commonTheme/${sessionScope.InterfaceModel}/infofind.png"><span class="big3"><fmt:message code="event.th.TrainingRecordInquiry" /></span>
                </div></td>

        </tr>
    </table>
    <br>
    <div class="right">
        <div class="M-box3"></div>
    </div>
    <div class="divQuery">
        <table class="tab">
            <tr>
                <td><fmt:message code="event.th.trainee" />：</td>
                <td>
                    <input type="text" id="staffUserId" name="staffUserId" style="width: 176px;height:31px;" class="BigStatic" disabled>
                    <a href="javascript:;" class="choose"><fmt:message code="global.lang.select" /></a>
                </td>
                <td><fmt:message code="event.th.NameTrainingPlan" />：</td>
                <td>
                    <select name="" id="tPlanName" class="planName"></select>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.TrainingInstitution" />：</td>
                <td>
                    <input type="text" id="tInstitutionName" class="trainInst">
                </td>
                <td><fmt:message code="event.th.TrainingCost" />：</td>
                <td>
                    <input type="text" id="trainningCost" class="cost" onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" onblur="this.v();">
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Attendance" />：</td>
                <td colspan="3">
                    <input type="text" id="dutySituation" class="trainInst">
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <div class="niu">
                        <button class="see" onclick="Query()"><fmt:message code="global.lang.query" /></button>
                        <button class="out" onclick="Export()"><fmt:message code="global.lang.report" /></button>
                    </div>
                </td>
            </tr>
        </table>
    </div>
    <div class="pagediv" style="display:none;margin: 0 auto;width: 97%;">
        <table id="tr_td">
            <thead>
            <tr>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.NameTrainingPlan" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.trainee" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.TrainingCost" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="event.th.TrainingInstitution" /></td>
                <td class="th" style="width:10%;text-align: center;"><fmt:message code="sup.th.RelatedAccessories" /></td>
                <td class="th" style="width:12%;text-align: center;"><fmt:message code="notice.th.operation" /></td>
            </tr>
            </thead>
            <tbody id="j_tb"></tbody>
        </table>
    </div>
</div>





</body>
<script>

    // 获取用户信息控件
    $('.choose').click(function () {
        user_id = "staffUserId";
        $.popWindow("../../common/selectUser?0");
    });

    $(function () {
        //下拉框获取
        $.ajax({
            type:'post',
            url:'<%=basePath%>eduTrainPlan/getAllPlanTrue',
            dataType:'json',
            success:function(result){
                var data =result.obj;
                var str="<option value=''><fmt:message code="hr.th.PleaseSelect" /></option>";
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        str=str+ '<option value="' + data[i].planNo + '">' + data[i].planName + '</option>'
                    }
                }
                $('#tPlanName').html(str);
            }
        })
    });

    function detail(e){
        $.popWindow("<%=basePath%>record/goDetail?recordId=" + e, '<fmt:message  code="news.th.querysituation"/>', '0', '0', '1150px', '700px');
    }
    function Export(){
        var id=$('#staffUserId').attr('user_id');
        if(id!=undefined){
            window.location.href='query?export=1&staffUserId='+$('#staffUserId').attr('user_id')+"&tPlanNo="+$('#tPlanName').val()+"&tInstitutionName="+$('#tInstitutionName').val()+"&trainningCost="+$('#trainningCost').val()+"&dutySituation="+$('#dutySituation').val();
        }
        window.location.href='query?export=1&tPlanNo='+$('#tPlanName').val()+"&tInstitutionName="+$('#tInstitutionName').val()+"&trainningCost="+$('#trainningCost').val()+"&dutySituation="+$('#dutySituation').val();
    }

    function Query(){
      var data={
          staffUserId:$('#staffUserId').attr('user_id'),
          tPlanNo:$('#tPlanName').val(),
          tInstitutionName:$('#tInstitutionName').val(),
          trainningCost:$('#trainningCost').val(),
          dutySituation:$('#dutySituation').val()
      }
      $.ajax({
          type:'post',
          url:'<%=basePath%>record/query',
          dataType:'json',
          data:data,
          success:function(result){
              var str='';
              var arr=result.obj;
              if(arr.length>0){
                  for(var i=0;i<arr.length;i++){
                      str+='<tr>'+
                          '<td style="width: 10%;text-align:center;">'+arr[i].tPlanName+'</td>' +
                          '<td style="width: 10%;text-align:center;">'+arr[i].staffUserName+'</td>' +
                          '<td style="width: 10%;text-align:center;">'+function () {
                              if(arr[i].trainningCost!=null){
                                  return arr[i].trainningCost
                              }else{
                                  return "";
                              }
                          }()+'</td>' +
                          '<td style="width: 10%;text-align:center;">'+arr[i].tInstitutionName+'</td>' +
                          '<td style="width: 10%;text-align:center;">'+arr[i].attachmentName+'</td>' +
                          '<td style="width: 12%;text-align:center;">' +
                          '<a href="javascript:void(0)" data-id="'+arr[i].planId+'"  onclick="detail('+arr[i].recordId+');" class="deleteSc"><fmt:message code="hr.th.detailedInformation" /></a>&nbsp;&nbsp;' +
                          '</td>' +
                          '</tr>'
                  }
                  $('.pagediv table tbody').html(str);
                  $('.divQuery').css('display','none');
                  $('.pagediv').css('display','block');
              }else{
                  $.layerMsg({content:'<fmt:message code="event.th.NoCorrespondingData" />',icon:3});
              }

          }
      })
    }
</script>
</html>