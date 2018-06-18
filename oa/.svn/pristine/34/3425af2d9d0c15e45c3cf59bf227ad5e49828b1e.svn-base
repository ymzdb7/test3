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
    <title><fmt:message code="document.th.Sealmanger"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" href="/css/meeting/myMeeting.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../js/news/page.js"></script>
   <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
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
        .last_str{
            cursor: pointer;
        }

        .determine_2{
            margin-left: 0%;
            background: url("../../img/sys/return.png") no-repeat;
            display: inline-block;
            float: left;
            height: 30px;
            line-height: 30px;
            width: 56px;
            text-align: center;
            margin-right: 15px;
            cursor: pointer;
            padding-left: 20px;
        }

        .bt {
            margin-left: 35%;
            background: url("../../img/confirm.png") no-repeat;
            display: inline-block;
            float: left;
            height: 30px;
            line-height: 30px;
            width: 56px;
            text-align: center;
            margin-right: 15px;
            cursor: pointer;
            padding-left: 20px;

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
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 20px;
            font-size: 22px;
            color: #494d59;
            font-weight: inherit;
        }
        .icons h2{
            text-align: center;
            width: 71%;
        }
        .notice_top h2,.notice_notop h2,.delete_check h2,.delete_all h2{
            text-align: left;
            margin-left: 12px;
        }
        /*选中删除*/
        .delete_check{
            background: url(../../img/btn_deleteannounce.png) 0px 10px no-repeat;
            text-align: center;
            font-size: 12px;
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
        .bgcolor{
            background: #c5e9fb !important;
            color: #000000;
        }

        table.MessageBox th,table.MessageBox td{
            text-align: left;
            padding: 10px;
        }

        .SmallButton {
            display: inline-block;
            width: 70px;
            height: 28px;
            line-height: 28px;
            vertical-align: middle;
            background:url("/img/hr/icon_query_2 .png") no-repeat;
            cursor: pointer;
        }
        .table tr td{
            line-height: 20px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>

<script src="/static/js/module.js?v=150805"></script>
<script>

$(function(){

    //点击删除选中按钮
    $('.sealPrivList').on('click','.delete_check',function(){
         var fileId=[];
         $(".sealPrivList .checkChild:checkbox:checked").each(function(){
         var conId=$(this).attr("conId");
         fileId.push(conId);
         })
         if(fileId == ''){
         $.layerMsg({content:'<fmt:message code="meet.th.PleaseDelete"/>',icon:1});
         }else{
             layer.confirm('<fmt:message code="workflow.th.que"/>', {
                 btn: ['<fmt:message code="menuSSetting.th.menusetsure"/>','<fmt:message code="depatement.th.quxiao"/>'], //按钮
                 title:"<fmt:message code="document.th.deleteSealinfo"/>"
             }, function(){
                 //确定删除，调接口
                 $.ajax({
                     type:'post',
                     url:'<%=basePath%>seal/deleteSeal',
                     dataType:'json',
                     data:{'ids':fileId},
                     success:function(){
                         layer.msg('<fmt:message code="workflow.th.delsucess"/>', { icon:6});
                         init();
                     }
                 })
             }, function(){
                 layer.closeAll();
             });
         }
    })





    //点击全选
    $('.sealPrivList').on('click','#checkedAll',function(){
        var state =$(this).prop("checked");
        if(state==true){
            $(this).prop("checked",true);
            $(".checkChild").prop("checked",true);
            $(this).parents('tr').siblings('#notice_tr').addClass('bgcolor');
        }else{
            $(this).prop("checked",false);
            $(".checkChild").prop("checked",false);
            $(this).parents('tr').siblings('#notice_tr').removeClass('bgcolor');
        }
    })


    //选人控件
     //选择按钮
    $('#selectUserSd').on("click",function(){
           user_id='BigStatic';
         $.popWindow("../common/selectUser");
    })
    //清空按钮
    $('#clearUserSd').click(function(){ //清空人员
        $('#BigStatic').attr('user_id','');
        $('#BigStatic').attr('dataid','');
        $('#BigStatic').val('');
    });


   init();
        //查阅情况
        $('.sealPrivList').on('click', '.find_detail', function () {
            var notifyId = $(this).attr('notifyId');
            layer.open({
                type: 1,
                title:['<fmt:message code="document.th.sealdetail"/>', 'background-color:#2b7fe0;color:#fff;'],
                area: ['800px', '420px'],
                offset: ['100px', '200px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.close" />'],
                content: '<div class="table"><table style="width: 80%; margin-left:60px; margin-top: 30px;">' +
                '<tr style="height: 50px;"><td style="width: 100px"><fmt:message code="document.th.SealId"/>：</td><td class="data1" style="text-align: center"></td></tr>' +
                '<tr  style="height: 50px;"><td style="width: 100px"><fmt:message code="document.th.SealName"/>：</td><td class="data2" style="text-align: center"></td></tr>' +
                '<tr  style="height: 50px;"><td style="width: 100px"><fmt:message code="document.th.SealBind"/>：</td><td class="data3" style="text-align: center"></td></tr>' +
                '<tr  style="height: 50px;"><td style="width: 100px"><fmt:message code="notice.th.createTime"/>：</td><td class="data5" style="text-align: center"></td></tr>' +
                '<tr  style="height: 50px;"><td rowspan="3" style="width: 100px"><fmt:message code="doc.th.ScopeAuthorization"/>：</td><td class="data4" style="text-align:center;word-wrap: break-word;"></td></tr>' +
                '</table></div>',
                success:function(){
                    $.ajax({
                        type:'get',
                        url:'<%=basePath%>seal/getSealById',
                        dataType:'json',
                        data:{'id':notifyId},
                        success:function(res){
                            var datas =res.object;
                            $('.data1').append(datas.sealId);
                            $('.data2').append(datas.sealName);
                            $('.data3').append(datas.certStr);
                            $('.data4').append(datas.userName);
                            $('.data5').append( formatDate(new Date(datas.createTime)));
                        }
                    })
                },
                yes:function(index){

                    layer.close(index);
                },
            });
    })
    $('.sealPrivList').on('click', '.find_edit', function () {
        var notifyId = $(this).attr('notifyId');
        $.ajax({
            url: '/seal/getSealById',
            dataType: 'json',
            data: {id:notifyId},
            success: function (obj) {
                var result=obj.object;
                $('#BigStatic').val(result.userName);
                $('#BigStatic').attr('user_id',result.userStr);
                $('#editId').val(result.id);
            }
        })
        $(".sealPrivList").hide();
        $('.news').hide();
        $('.conteng').show();

    })
})

//确定按钮
function submit() {
    var userStr = $('#BigStatic').attr('user_id');
    var id = $('#editId').val();


    $.ajax({
        url: '/seal/editSealObject',
        dataType: 'json',
        data: {
            id: id,
            userStr:userStr
},
        success: function (obj) {
            layer.msg('<fmt:message code="document.th.sealAuthorizedSuccess" />', {icon: 6});
        }

    })

}
//查询按钮
function CheckForm(){
    var data={
        sealId: $('#sealId').val(),
        sealName:$('#sealName').val(),
        startTime:$('#start').val(),
        endTime:$('#end').val()
    }
    $.ajax({
        type:"get",
        url:"<%=basePath%>/seal/getAllSealInfo",
        dataType:'json',
        data:data,
        success:function(result){
            if(result.obj!=undefined){
                if(result.obj.length>0){
                    var datas =result.obj;
                    var str="<tr class=\"msg\"><td><fmt:message code="notice.th.chose" /></td><td><fmt:message code="document.th.SealId" /></td><td><fmt:message code="document.th.SealName" /></td><td><fmt:message code="document.th.SealBind" /></td><td><fmt:message code="doc.th.ScopeAuthorization" /></td><td><fmt:message code="notice.th.createTime" /></td><td style='text-align: center'><fmt:message code="notice.th.operation" /></td><tr>";
                    for(var i=0;i<datas.length;i++){
                        if(datas[i].createTime!=null && datas[i].createTime!=''){
                            var c= new Date(datas[i].createTime);
                        }else{
                            var c='';
                        }
                        str=str+"<tr><td style='width: 5%;'><input class='checkChild' style='margin-left: 5px;' type='checkbox' conid='" + datas[i].id + "' name='check' value=''></td><td>"+datas[i].sealId+"</td><td>"+datas[i].sealName+"</td><td>"+datas[i].certStr+"</td><td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + datas[i].userName + ">"+datas[i].userName+"</td><td>"+formatDate(c)+"</td><td style='text-align: center'><a href='javascript:;' class='find_detail' notifyId=" + datas[i].id + " style='color:#1772c0;'><fmt:message code="long.th.See" /></a>&nbsp;&nbsp;<a href='javascript:;' class='find_edit' notifyId=" + datas[i].id + " style='color:#1772c0;'><fmt:message code="roleAuthorization.th.SetPermissions" /></a></td></tr>";
                    }
                    var last_str="<tr class='last_str'><td><input id='checkedAll' class='checkChild' type='checkbox' name='check' value=''><fmt:message code="notice.th.allchose" /></td></td><td class='delete_check'><span style='margin-left: 13px;'><fmt:message code="doc.th.deleteSomeInfo" /></span></td><td></td><td></td><td></td><td></td><td></td></tr>";
                    $(".sealPrivList").html(str+last_str);
                }
                else{

                    str+="<tr class=\"msg\"><td class=\"center info\" style=\"width:20px;\"><div class=\"msg-content\" style=\"text-align: center;\"><fmt:message code="document.th.Sealnofind" /></div></td></tr>";
                    $(".sealPrivList").html(str);
                }
            }

        }
    });

}

   //返回按钮
function return_1(){
    init();
    $('.conteng').hide();
    $('.news').show();
    $('.sealPrivList').show();
}

//初始化函数
function init(){
    $.ajax({
        type:"get",
        url:"<%=basePath%>/seal/getAllSealInfo",
        dataType:'json',
        success:function(result){
            if(result.obj!=undefined){
                if(result.obj.length>0){
                    var datas =result.obj;
                    var str="<tr class=\"msg\"><td><fmt:message code="notice.th.chose" /></td><td><fmt:message code="document.th.SealId" /></td><td><fmt:message code="document.th.SealName" /></td><td><fmt:message code="document.th.SealBind" /></td><td><fmt:message code="doc.th.ScopeAuthorization" /></td><td><fmt:message code="notice.th.createTime" /></td><td style='text-align: center'><fmt:message code="notice.th.operation" /></td><tr>";
                    for(var i=0;i<datas.length;i++){
                        if(datas[i].createTime!=null && datas[i].createTime!=''){
                            var c= new Date(datas[i].createTime);
                        }else{
                            var c='';
                        }
                        str=str+"<tr><td style='width: 5%;'><input class='checkChild' style='margin-left: 5px;' type='checkbox' conid='" + datas[i].id + "' name='check' value=''></td><td>"+datas[i].sealId+"</td><td>"+datas[i].sealName+"</td><td>"+datas[i].certStr+"</td><td style='width: 10%;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;width: 90px;' title=" + datas[i].userName + ">"+datas[i].userName+"</td><td>"+formatDate(c)+"</td><td style='text-align: center'><a href='javascript:;' class='find_detail' notifyId=" + datas[i].id + " style='color:#1772c0;'><fmt:message code="long.th.See" /></a>&nbsp;&nbsp;<a href='javascript:;' class='find_edit' notifyId=" + datas[i].id + " style='color:#1772c0;'><fmt:message code="roleAuthorization.th.SetPermissions" /></a></td></tr>";
                    }
                    var last_str="<tr class='last_str'><td><input id='checkedAll' class='checkChild' type='checkbox' name='check' value=''><fmt:message code="notice.th.allchose" /></td></td><td class='delete_check'><span style='margin-left: 13px;'><fmt:message code="doc.th.deleteSomeInfo" /></span></td><td></td><td></td><td></td><td></td><td></td></tr>";
                    $(".sealPrivList").html(str+last_str);
                }
                else{

                    str+="<tr class=\"msg\"><td class=\"center info\" style=\"width:20px;\"><div class=\"msg-content\" style=\"text-align: center;\"><fmt:message code="document.th.SealnoInfo" /></div></td></tr>";
                    $(".sealPrivList").html(str);
                }
            }

        }
    });
}

    //时间控件调用
    var start = {
        format: 'YYYY/MM/DD hh:mm:ss',
        istime: true,
        istoday: false,
        /*  choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas //将结束日的初始值设定为开始日
         }*/
    };



    function   formatDate(now)   {
        if(now!=''&& now!=undefined){
        var   year=now.getFullYear();
        var   month=now.getMonth()+1;
        var   date=now.getDate();
        var   hour=now.getHours();
        var   minute=now.getMinutes();
        var   second=now.getSeconds();
        return  year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second;
        }else{
            return "";
        }
    }
</script>

<body class="bodycolor" topmargin="5">
<div class="news" style="margin-top: 10px;">
  <img style="margin-left: 30px" src="/img/commonTheme/${sessionScope.InterfaceModel}/yinzhang.png" align="absmiddle"><span class="big3"><fmt:message code="document.th.Sealinquiry" /></span>&nbsp;
    <fmt:message code="document.th.SealId" />:&nbsp;&nbsp;
    <input type="text" id="sealId" name="sealId" style="height: 24px; width: 110px;" class="idclass" value="">&nbsp;
    &nbsp;&nbsp;<fmt:message code="document.th.SealName" />:&nbsp;&nbsp;
    <input type="text" id="sealName" name="sealName" style="height: 24px; width: 130px;" class="nameclass" value="">&nbsp;
    &nbsp;&nbsp;<fmt:message code="document.th.SealNewTime" />:&nbsp;&nbsp;
    <fmt:message code="hr.th.from" />            <input type="text" id="start"  name="QUERY_DATE1" STYLE="height: 24px; width: 120px;"  class="laydate-icon" onclick="laydate(start)"/>
    <fmt:message code="global.lang.to" />           <input type="text" id="end" name="QUERY_DATE2" STYLE="height: 24px; width: 120px;"  class="laydate-icon"  onClick="laydate(start)"/>
    <div class="SmallButton" onClick="CheckForm();"><span style="margin-left: 30px;font-size: 14px;"><fmt:message code="global.lang.query" /></span></div>
</div>
<br>
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
</table>
<table class="MessageBox sealPrivList" align="center" width="100%" cellpadding="0" cellspacing="0">
  <%--  <tr class="msg">
        <td class="center info" style="width:20px; ">
            <div class="msg-content" style="text-align: center;">本月无合同到期记录</div>
        </td>
    </tr>--%>
</table>
<div class="conteng" style="display: none;margin-top: -20px;">
    <div style="height: 50px;line-height: 40px;margin-left: 2%;">
        <img src="../../img/contractinfoend.png" align="absmiddle"><span class="big3"><fmt:message code="document.th.setSealAuthority" /></span>&nbsp;
    </div>
    <table class="MessageBox settingPriv"  width="650" align="center" cellpadding="0" cellspacing="0" BACKGROUND="#f8f8f8;">
        <tbody><tr>
            <td nowrap="" class="TableData"  width="20%"><fmt:message code="document.th.SealExplain" />：</td>
            <td nowrap="" class="TableData"  width="80%">
                <%-- <input type="text" name="PRIV_NO" style="margin: 0;" class="inp" size="5" maxlength="10" value="">&nbsp;<br>--%>
                <div style="margin-bottom: 0px"><span><fmt:message code="document.th.Explain" /></span></div>
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableData"  width="20%"><fmt:message code="document.th.Sealfanwei" />：</td>
            <td class="TableData"  width="80%">
                <input type="hidden" name="ID" id="editId" value="">
                <textarea cols="50" name="TO_NAME" rows="4" id="BigStatic" class="BigStatic" user_id=""  readonly=""></textarea>
                <a href="javascript:;" id="selectUserSd" class="selectUserSd" ><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="clearUserSd" class="clearUserSd" ><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td colspan="2"><div class="bt determine" onclick="submit()"><fmt:message code="menuSSetting.th.menusetsure" /></div>
                <div class="determine_2" onclick="return_1()"><fmt:message code="depatement.th.quxiao" /></div>
            </td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>


