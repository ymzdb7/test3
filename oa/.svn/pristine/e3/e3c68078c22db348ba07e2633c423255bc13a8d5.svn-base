<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="hr.th.ContractExpirationInquiry" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <%--<meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />--%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>

    <style>
        body{
            font-family: 微软雅黑;
            font-size: 15px;
        }

        .MessageBox .msg .center {
            padding-left: 50px;
            font-size: 16px;
            color: #2F5C8F !important;
            background-color: #F6F7F9;
        }
        .MessageBox .msg td {
            height:50px;
            color: #2F5C8F !important;
        }
        .msg{
            background-color: #fff;
            font-size: 15px !important;
            color: #2F5C8F !important;
            width:6% !important;
            font-weight: bold !important;
        }
        .TableHeader{
            font-size: 15px;
            font-weight: inherit;
            font-family: 微软雅黑;
        }
        .MessageBox{
            border-collapse: collapse;
            border-spacing: 0;
            table-layout: fixed;
            border-color: grey;
        }
        .big3{
            margin-left: 12px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
            font-weight: inherit;
        }

        .find_detail {
            cursor: pointer;
        }
        a{
            text-decoration: none;
        }
        table.MessageBox thead {
            background: white;
           line-height: 40px;
            border-bottom: 1px #dddddd solid;
            font-size: 15px;
            /*  color: #2F5C8F;*/
            /*      font-weight: bold;*/
            border: 0px;
        }
        table.MessageBox  tr td a{
            font-size: 14px;
            color: #2b7fe0;
        }
        table.MessageBox  tr  {
            border: 1px solid #c0c0c0;
        }

        table.MessageBox th,table.MessageBox td{
            text-align: left;
            padding: 10px;
        }
        .MessageBox tr td{
            border-top:1px solid #c0c0c0;
        }

        .SmallButton {
            display: inline-block;
            float:left;
            text-align:center;
            width: 70px;
            height: 28px;
            /*  line-height: 28px;*/
            background:url("../../img/hr/icon_query_2 .png") no-repeat;
            cursor: pointer;
        }
    </style>
</head>

<script src="/static/js/module.js?v=150805"></script>
<script>

    $(function(){

        /*   $('#contractType').click*/

        //页面加载时发送ajax获取下拉框数据
        var str="<option value=\"\" selected=\"\"><fmt:message code="hr.th.typeContract" />&nbsp;&nbsp;</option>";
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type:'get',
            dataType:"JSON",
            data : {"CodeNos":"HR_STAFF_CONTRACT1"},
            success:function(data){
                for (var proId in data){
                    for(var i=0;i<data[proId].length;i++){
                        str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
                    }
                }
                $('#contractType').append(str);
            }
        })

        $.ajax({
            type:"get",
            url:"../../hr/contract/getMaturityContract",
            dataType:'json',
            data:{status:1
            },
            success:function(result){
                if(result.obj!=undefined){
                    if(result.obj.length>0){
                        var datas =result.obj;

                        var str="<tr class=\"msg\"><td><fmt:message code="userDetails.th.name" /></td><td><fmt:message code="hr.th.department" /></td><td><fmt:message code="hr.th.post" /></td><td><fmt:message code="hr.th.typeContract" /></td><td><fmt:message code="hr.th.SignCompany" /></td><td><fmt:message code="hr.th.ContractCommencementDate" /><td><fmt:message code="hr.th.TrialDate" /></td><td><fmt:message code="hr.th.ContractTime" /></td><td><fmt:message code="notice.th.operation" /></td><tr>";
                        for(var i=0;i<datas.length;i++){

                            if(datas[i].probationEffectiveDate!=null && datas[i].probationEffectiveDate!=''){
                                var c= datas[i].probationEffectiveDate.replace(/-/g,"/")
                            }else{
                                var c='';
                            }
                            console.log(c)
                            if(datas[i].trailOverTime!=null && datas[i].trailOverTime!=''){
                                var d= datas[i].trailOverTime.replace(/-/g,"/");
                            }else{
                                var d='';
                            }
                            if(datas[i].contractEndTime!=null && datas[i].contractEndTime!=''){
                                var e= datas[i].contractEndTime.replace(/-/g,"/");
                            }else{
                                var e='';
                            }
                            str=str+"<tr><td>"+datas[i].userName+"</td><td>"+datas[i].deptName+"</td><td>"+datas[i].postName+"</td><td>"+datas[i].contractTypeName+"</td><td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + datas[i].contractEnterpriesName + ">"+datas[i].contractEnterpriesName+"</td><td>"+c+"</td><td>"+d+"</td><td>"+e+"</td><td><a href='javascript:;' class='find_detail' notifyId=" + datas[i].contractId + " style='color:#1772c0;'><fmt:message code="hr.th.detailedInformation" /></a></td></tr>";/*详细信息*/
                        }
                        $(".MessageBox").html(str);
                    }
                    else{
                        var str="<tr class=\"msg\"><td><fmt:message code="userDetails.th.name" /></td><td><fmt:message code="hr.th.department" /></td><td><fmt:message code="hr.th.post" /></td><td><fmt:message code="hr.th.typeContract" /></td><td><fmt:message code="hr.th.SignCompany" /></td><td><fmt:message code="hr.th.ContractCommencementDate" /><td><fmt:message code="hr.th.TrialDate" /></td><td><fmt:message code="hr.th.ContractTime" /></td><td><fmt:message code="notice.th.operation" /></td><tr>";
                        $(".MessageBox").html(str);
                        layer.msg('<fmt:message code="hr.th.NoContractExpiration" />', {icon: 6});
                    }
                }

            }
        });




        //查阅情况
        $('.MessageBox').on('click', '.find_detail', function () {
            var notifyId = $(this).attr('notifyId');
            $.popWindow("contractDetail?contractId=" + notifyId, '<fmt:message code="news.th.querysituation" />', '0', '0', '1150px', '700px');/*查阅情况*/
        })
    })
    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false
        /*  choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas //将结束日的初始值设定为开始日
         }*/
    };
    function laydates(e){
        var id = e.attr('id');
        laydate({
            elem: '#'+id, //目标元素。
            format: 'YYYY-MM-DD', //日期格式
            istime: true //显示时、分、秒
        })
    }


    function   formatDate(now)   {
        if(now!=''&& now!=undefined){
            var   year=now.getFullYear();
            var   month=now.getMonth()+1;
            var   date=now.getDate();
            var   hour=now.getHours();
            var   minute=now.getMinutes();
            var   second=now.getSeconds();
            return  year+"-"+month+"-"+date;
        }else{
            return "";
        }
    }

    function CheckForm()
    {
        if($("#start").val()!="" && $("#end").val()=="")
        {
            layer.msg('<fmt:message code="hr.th.PleaseRange" />', {icon: 2});
            return (false);
        }
        if($("#start").val()=="" && $("#end").val()!="")
        {
            layer.msg('<fmt:message code="hr.th.PleaseRange" />', {icon: 2});
            return (false);
        }
        else{
            if(($("#start").val())>$("#end").val()){
                layer.msg('<fmt:message code="hr.th.TheEnd" />', {icon: 2});
                return (false);
            }
            var startTime =$("#start").val();
            var endTime =$("#end").val();
            var isRenew=$("#isRenew").val();
            var contractType=$("#contractType").val();
            var str="<tr class=\"msg\"><td><fmt:message code="userDetails.th.name" /></td><td><fmt:message code="hr.th.department" /></td><td><fmt:message code="hr.th.post" /></td><td><fmt:message code="hr.th.typeContract" /></td><td><fmt:message code="hr.th.SignCompany" /></td><td><fmt:message code="hr.th.ContractCommencementDate" /><td><fmt:message code="hr.th.TrialDate" /></td><td><fmt:message code="hr.th.ContractTime" /></td><td><fmt:message code="notice.th.operation" /></td><tr>";
            data={"startTime":startTime,
                "endTime":endTime,
                "isRenew":isRenew,
                "contractType":contractType,
                "status":"2"
            }
            $.ajax({
                type:"get",
                url:"../../hr/contract/getMaturityContract",
                dataType:'json',
                data:data,
                success:function(result){
                    if(result.obj.length>0){
                        var data =result.obj;
                        for(var i=0;i<data.length;i++){
                            if(data[i].probationEffectiveDate!=null && data[i].probationEffectiveDate!=''){
                                var c= data[i].probationEffectiveDate.replace(/-/g,"/");
                            }else{
                                var c='';
                            }
                            if(data[i].trailOverTime!=null && data[i].trailOverTime!=''){
                                var d= data[i].trailOverTime.replace(/-/g,"/");
                            }else{
                                var d='';
                            }
                            if(data[i].contractEndTime!=null && data[i].contractEndTime!=''){
                                var e= data[i].contractEndTime.replace(/-/g,"/");
                            }else{
                                var e='';
                            }
                            str=str+"<tr><td>"+data[i].userName+"</td><td>"+data[i].deptName+"</td><td>"+data[i].postName+"</td><td>"+data[i].contractTypeName+"</td><td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + data[i].contractEnterpriesName + ">"+data[i].contractEnterpriesName+"</td><td>"+c+"</td><td>"+d+"</td><td>"+e+"</td><td><a href='javascript:;' class='find_detail' notifyId=" + data[i].contractId + " style='color:#1772c0;'><fmt:message code="hr.th.detailedInformation" /></a></td></tr>";/*详细信息*/
                        }
                        $(".MessageBox").html(str);
                    }
                    else{
                        $(".MessageBox").html(str);
                        layer.msg('<fmt:message code="hr.th.RecordWithoutContract" />', {icon: 6});
                    }
                }
            });
        }

    }
</script>

<body class="bodycolor" topmargin="5" style="margin: 0;padding: 0 30px;">
<div class="news" style="padding-top: 22px;">
    <div>
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/contractinfoend.png" align="absmiddle" style="margin-left: 5px;margin-bottom: 4px;"><span class="big3"><fmt:message code="hr.th.ContractQueryResults" /></span>
    </div>
    <div style="margin-top: 15px;margin-left: 15px;">
        &nbsp;
        <fmt:message code="hr.th.IsRenewed" />:&nbsp;&nbsp;<select name="IS_RENEW" id="isRenew" style="background: white;height:25px;">
        <option value="" ><fmt:message code="hr.th.PleaseSelect" />&nbsp;&nbsp;</option>
        <option value="0" ><fmt:message code="global.lang.no" />&nbsp;&nbsp;</option>
        <option value="1" ><fmt:message code="global.lang.yes" />&nbsp;&nbsp;</option>
    </select>&nbsp;&nbsp;&nbsp;&nbsp;
        <fmt:message code="hr.th.typeContract" />:&nbsp;&nbsp;<select name="CONTRACT_TYPE" id="contractType" style="background: white; height: 25px;" title="<fmt:message code="hr.th.TheTypeOfContract" />。">
    </select>
        &nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="hr.th.ContractTime" />:&nbsp;
        <fmt:message code="hr.th.from" />            <input type="text" id="start" width="50px" name="QUERY_DATE1" size="10" maxlength="10" class="laydate-icon" onclick="laydates($(this))"/>
        &nbsp;<fmt:message code="global.lang.to" /> &nbsp;<input type="text" id="end" name="QUERY_DATE2" size="10" maxlength="10" class="laydate-icon"  onClick="laydates($(this))"/>
        &nbsp;
        <div class="SmallButton" onClick="CheckForm();" style="float: none;text-align:center;"><span style="margin-left: 19px;font-size: 14px;line-height:28px;"><fmt:message code="global.lang.query" /></span></div>
    </div>
</div>

<form method="post" name="form1" action="#">
    <table border="0" width="100%" cellpadding="3" cellspacing="1" align="center">
        <tr>
            <td class="TableHeader">

            </td>
        </tr>
    </table>
</form>
<br>
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
</table>
<table class="MessageBox" align="center" width="100%" cellpadding="0" cellspacing="0">
    <%--  <tr class="msg">
          <td class="center info" style="width:20px; ">
              <div class="msg-content" style="text-align: center;">本月无合同到期记录</div>
          </td>
      </tr>--%>
</table>
</body>
</html>


