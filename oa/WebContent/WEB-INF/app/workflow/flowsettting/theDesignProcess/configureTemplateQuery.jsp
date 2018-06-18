<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/8/7
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.ConfigureTemplateQueries" /></title><%--配置模板查询--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <link rel="stylesheet" href="/lib/laydate.css">
    <style>
        .pro_flow .con_form .form_group .flow_q{
            margin-right:;
        }
    </style>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>

    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/workflow/work/workform.js"></script>
</head>
<body>
<div class="cont_r" style="margin-left: 0px;">
    <div class="item_s item_con">
        <table class="table" cellspacing="0" id="table_power">
            <caption class="clearfix">
                <img style="margin-right: 10px;width: 18px;padding-left: 15px;float: left;" src="/img/workflow/flowsetting/flowSettingMain/peizhichaxun.png"  alt="">

                <span class="priv_t"><fmt:message code="workflow.th.ConfigureTemplateQueries" /></span><%--配置模板查询--%>
                <a href="javascript:void (0)" class="new_liucheng newAndeEdit newAndeEditTwo" data-type="1"><fmt:message code="global.lang.new" /></a><%--新建--%>
                <a href="javascript:void (0)" id="deleteAll"></a>
            </caption>
            <thead>
            <tr>
                <th><fmt:message code="sms.th.Button" /></th><%--按钮--%>
                <th><fmt:message code="sms.th.TemplateName" /></th><%--模板名称--%>
                <th><fmt:message code="notice.th.createTime" /></th><%--创建时间--%>
                <th><fmt:message code="notice.th.operation" /></th><%--操作--%>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>

<script>
    var user_id='';
    function TempPriv() {

        $.ajax({
            type: 'get',
            url: '/flowSetDatas/getFlowQueryTplList',
            dataType: 'json',
            data: {
                flowId: parent.getResObj.flowId
            },
            success: function (data) {
                if (data.flag) {
                    var data = data.datas;
                    var html = "";
                    for (var i = 0; i < data.length; i++) {
                        html +=  "<tr>" 
                            + "<td>" 
                            + "<input type='checkbox' class='one'  seqId='" + data[i].seqId + "'>" + 
                            "</td>" + 
                            "<td>" + data[i].tplName + "</td>" +
                            "<td style='text-align: center;padding-left: 10px'>" + data[i].createTime + "</td>"
                            + "<td>" + '<a href="javascript:void(0)" class="updata_c fileUpdateactive newAndeEditTwo"  seqId="' + data[i].seqId + '"><fmt:message code="depatement.th.modify" /></a>'//修改
                            + '<a class="del_temp del_privactive" href="javascript:void(0)" seqId="' + data[i].seqId + '" ><fmt:message code="global.lang.delete" /></a>' +//删除
                            "</td>" + "</tr>" ;

                    }
                    $('#table_power tbody').html(html);
                }else {
                    $('#table_power tbody').html('');
                }

            }
        })
    }

    TempPriv()

    $(document).delegate('#select_User','click',function () {

        user_id = 'textPut';
        $.popWindow("../common/selectUser");
    });
    
    $(document).delegate('#next_step_tab tbody tr','click',function () {
        if($(this).hasClass('bg_d')){
            $(this).removeClass('bg_d')
        }else {
            $(this).addClass('bg_d')
        }

    })
    $(document).delegate('#alternative_div tbody tr','click',function () {
        if($(this).hasClass('bg_d')){
            $(this).removeClass('bg_d')
        }else {
            $(this).addClass('bg_d')
        }
    })
    $(document).delegate('#table_t tbody tr a','click',function () {
       $(this).parent().parent().remove()
    })
    
    $('#table_power').delegate('.newAndeEditTwo','click',function () {
        var titleStr='';
        var ajaxUrl='';
        var me=this;
        if($(this).attr('data-type')==1){
            titleStr='<fmt:message code="global.lang.new"/>'/*新建*/
            ajaxUrl='/flowSetDatas//newFlowQuertTpl'
        }else {
            titleStr='<fmt:message code="global.lang.edit" />'/*编辑*/
            ajaxUrl='/flowSetDatas/updateFlowQuertTpl'
        }
        layer.open({
            title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff">'+titleStr+'</p>',
            shade: 0.3,
            content:
            '<div class="cont_pop">' +
                '<div class="con_flow clearfix">' +
                     '<div class="over_f">' +
                        '<p class="define_p flowtitle"><fmt:message code="workflow.th.TemplateBasicInformation" /></p>' +/*模板基本信息*/
                            '<form class="pro_flow ">' +
                                '<div class="con_form">' +
                                    '<div class="form_group form_g" style="margin-bottom: 26px;margin-left:35px">' +
                                        '<label for="projectName" class="flowName flow_t" ><fmt:message code="sms.th.TemplateName" /></label>' +/*模板名称*/
                                        '<input type="text" id="tempName">' +
                                    '</div>' +
                                '</div>' +
                            '</form>' +
                        '<p class="define_p flowtitle"><fmt:message code="workflow.th.ProcessFilterConditions" /></p>' +/*流程过滤条件*/
                            '<form class="pro_flow ">' +
                            '<div class="con_form con_form_c">' +
                                '<div class="form_group form_g">' +
                                    '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.WorkflowStatus" /></label>' +/*工作流状态*/
                                    '<select name="FLOW_STATUS" id="FLOW_STATUS" class="depName">' +
                                        '<option value="ALL"><fmt:message code="email.th.own" /></option>' +/*所有*/
                                        '<option value="1"><fmt:message code="meet.th.IsOver" /></option>' +/*已结束*/
                                        '<option value="0"><fmt:message code="workflow.th.InExecution" /></option>' +/*执行中*/
                                    '</select>' +
                                '</div>' +
                                '<div class="form_group form_g form_c">' +
                                    '<label for="deptName" class="flowName flow_t "><fmt:message code="workflow.th.QueryRange" /></label>' +/*查询范围*/
                                    '<select name="FLOW_QUERY_TYPE" id="FLOW_QUERY_TYPE" class="depName">' +
                                        '<option value="ALL"><fmt:message code="email.th.own" /></option>' +/*所有*/
                                        '<option value="1"><fmt:message code="workflow.th.IStarted" /></option>' +/*我发起的*/
                                        '<option value="2"><fmt:message code="workflow.th.IDidIt" /></option>' +/*我经办的*/
                                        '<option value="3"><fmt:message code="workflow.th.IManageIt" /></option>' +/*我管理的*/
                                    '</select>' +
                                '</div>' +
                                '<div class="form_group form_g form_f" style="width:702px;padding-left:0px">' +
                                    '<label for="deptName" class="flowName flow_t flow_q"><fmt:message code="workflow.th.ProcessStartDateRange" /> </label>' +/*流程开始日期范围*/
                                    '<span class="star_a"><fmt:message code="hr.th.from" /></span>' +/*从*/
                                    '<input type="text" class="put" id="start_date" name="PRCS_DATE1" onclick="laydate()">' +
                                    '<span class="star_a"><fmt:message code="global.lang.to" /></span>' +/*至*/
                                    '<input type="text"class="put" id="end_date" onclick="laydate()">' +
                                    '<span class="star_a star_d"><fmt:message code="global.lang.empty" /></span>' +/*清空*/
                                '</div>' +
                                '<div class="form_group form_g">' +
                                    '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.Name-number" /></label>' +/*名称/文号*/
                                    '<select name="RUN_NAME" id="runName" class="depName">' +
                                        '<option value="1"><fmt:message code="workflow.th.equal" /></option>' +/*等于*/
                                        '<option value="2"><fmt:message code="workflow.th.moreThanThe" /></option>' +/*大于*/
                                        '<option value="3"><fmt:message code="workflow.th.LessThan" /></option>' +/*小于*/
                                        '<option value="4"><fmt:message code="workflow.th.greaterOrEqualTo" /></option>' +/*大于等于*/
                                        '<option value="5"><fmt:message code="workflow.th.LessThanOrEqualTo" /></option>' +/*小于等于*/
                                        '<option value="6"><fmt:message code="workflow.th.notEqualTo" /></option>' +/*不等于*/
                                        '<option value="7"><fmt:message code="workflow.th.Startfor" /></option>' +/*开始为*/
                                        '<option value="8" selected><fmt:message code="hr.th.Contain" /></option>' +/*包含*/
                                        '<option value="9"><fmt:message code="workflow.th.Endfor" /></option>' +/*结束为*/
                                    '</select>' +
                                    '<input type="text" style="padding-left:0px;margin-left:140px" name="RUN_NAME_RELATION" id="num_put" class="num_put">' +
                                '</div>' +
                                '<div class="form_group form_g form_t">' +
                                    '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.PublicAttachmentName" /></label>' +/*公共附件名称*/
                                    '<span style="vertical-align: 8px"><fmt:message code="hr.th.Contain" /></span>' +/*包含*/
                                    ' <input name="ATTACHMENT_NAME" type="text" id="attment" class="depName save_file">' +
                                '</div>' +
                                '<div class="form_group form_g form_g_r">' +
                                    '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.ProcessSponsor" /></label>' +/*流程发起人*/
                                    '<textarea name="BEGIN_NAME" id="textPut"   disabled></textarea>' +
                                    '<a style="margin-left: 10px;cursor: pointer" id="select_User" class="save_i"><fmt:message code="global.lang.add" /></a>' +/*添加*/
                                    '<a style="margin-left: 10px;cursor: pointer" class="save_i del_v"><fmt:message code="global.lang.empty" /></a>' +/*清空*/
                                '</div>' +
                            '</div>' +
                            '</form>' +
                            '<div class="jobName flowtitle" style="font-weight: 500"><fmt:message code="workflow.th.FormDataFilter" /></div>' +/*表单数据过滤条件*/
                            '<form class="pro_flow flow_r">' +
                                '<div class="con_form" style="padding: 50px 0 0 58px;">' +
                                    '<div class="form_group form_g">' +
                                        '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.Field" /></label>' +/*字段*/
                                        '<select name="" id="file_p" class="depName"></select>' +
                                    '</div>' +
                                    '<div class="form_group form_g style="">' +
                                        '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.condition" /></label>' +/*条件*/
                                        '<select name="" id="term" class="depName">' +
                                            '<option value="="><fmt:message code="workflow.th.equal" /></option>' +/*等于*/
                                            '<option value="<"><fmt:message code="workflow.th.LessThan" /></option>' +/*小于*/
                                            '<option value=">"><fmt:message code="workflow.th.moreThanThe" /></option>' +/*大于*/
                                            '<option value="!="><fmt:message code="workflow.th.notEqualTo" /></option>' +/*不等于*/
                                            '<option value=">="><fmt:message code="workflow.th.greaterOrEqualTo" /></option>' +/*大于等于*/
                                            '<option value="<="><fmt:message code="workflow.th.LessThanOrEqualTo" /></option>' +/*小于等于*/
                                            '<option value="begin"><fmt:message code="workflow.th.Startfor" /></option>' +/*开始为*/
                                            '<option value="include"><fmt:message code="hr.th.Contain" /></option>' +/*包含*/
                                            '<option value="end"><fmt:message code="workflow.th.Endfor" /></option>' +/*结束为*/
                                            '<option value="null"><fmt:message code="workflow.th.IsEmpty" /></option>' +/*为空*/
                                        '</select>' +
                                        '</br>' +
                                        '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.value" /></label>' +/*值*/
                                        '<input type="text" id="numval">' +
                                        '<div style="margin-left: -66px;">' +
                                            '<a href="javascript:;" class="addbtn"><fmt:message code="workflow.th.AddFieldConditions" /></a>' +/*添加字段条件*/
                                        '</div>' +
                                        '<table class="table table_h" cellspacing="0" id="table_t" style="margin: 24px 0 24px 72px">' +
                                            '<thead>' +
                                                '<tr>' +
                                                    '<th style="text-align: center"><fmt:message code="hr.th.number" /></th>' +/*编号*/
                                                    '<th style="text-align: center"><fmt:message code="workflow.th.FormConditionDescription" /></th>' +/*表单条件描述*/
                                                    '<th style="text-align: center"><fmt:message code="menuSSetting.th.menuSetting" /></th>' +/*操作*/
                                                '</tr>' +
                                            '</thead>' +
                                            '<tbody></tbody>' +
                                        '</table>' +
                                        '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.FormConditionalFormula" /></label>' +/*表单条件公式*/
                                        '<input type="text" id="query_d">' +
                                    '</div>' +
                                '</div>' +
                            '</form>' +
                            '<div class="jobName flowtitle" style="font-weight: 500;margin-top: 26px"><fmt:message code="workflow.th.StatisticalReportOptions" /></div>' +/*统计报表选项*/
                            '<form class="pro_flow flow_r">' +
                                '<div class="con_form">' +
                                    '<div class="form_group form_g">' +
                                        '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.GroupField" /></label>' +/*分组字段*/
                                            '<select name="" id="group_s" class="depName">' +
                                            '</select>' +
                                            '<select name="" id="groupSort" class="depName" style="margin-left: 140px">' +
                                                '<option value="ASC" selected="selected"><fmt:message code="netdisk.th.asc" /></option>' +/*升序*/
                                                '<option value="DESC"><fmt:message code="netdisk.th.desc" /></option>' +/*降序*/
                                            '</select>' +
                                    '</div>' +
                                    '<div class="plug_body form_group form_g" style="padding-left: 75px">' +
                                        '<div class="plug_body_left">' +
                                            '<div class="list_title"><fmt:message code="workflow.th.to-do" /></div>' +/*显示在待办列表上的字段*/
                                                '<div class="list_infomation" id="next_step_div" style="width:220px">' +
                                                    '<table cellspacing="0px" cellpadding="0px" width="100%" id="next_step_tab" class="next_step_tab">' +
                                                        '<tbody id="data_th">' +
                                                        '</tbody>' +
                                                    '</table>' +
                                                '</div>' +
                                                '<div style="margin-top:10px;">' +
                                                    '<button class="btn" id="left_btn" type="button" style="border: 1px solid #c6c6c6;padding: 6px 10px;border-radius: 8px;"><fmt:message code="notice.th.allchose" /></button>' +/*全选*/
                                                '</div>' +
                                            '</div>' +
                                            '<div class="plug_body_center">' +
                                                '<div class="change_right">' +
                                                    '<button type="button" style="width: 20px;height: 20px" class="btn_b1s" data-type="1" id="btn_b1">' +
                                                        '<img src="../../img/workflow/flowsetting/icon_right_03.png"> ' +
                                                    '</button>' +
                                                '</div>' +
                                                '<div class="change_left">' +
                                                    '<button type="button" style="width: 20px;height: 20px" class="btn_b1s" data-type="2" id="btn_b2">' +
                                                        '<img src="../../img/workflow/flowsetting/icon_lift_03.png">' +
                                                    '</button>' +
                                                '</div>' +
                                            '</div>' +
                                            '<div class="plug_body_right">' +
                                                '<div class="list_title"><fmt:message code="workflow.th.Alternatefield" /></div>' +/*备选字段*/
                                                '<div class="list_infomation" id="alternative_div" style="width:220px">' +
                                                    '<table cellspacing="0px" cellpadding="0px" width="100%" id="alternative_tab">' +
                                                        '<tbody id="data_th_1"></tbody>' +
                                                    '</table>' +
                                                '</div>' +
                                                '<div style="margin-top:10px;">' +
                                                    '<button class="btn" id="right_btn" type="button"  style="border: 1px solid #c6c6c6;padding: 6px 10px;border-radius: 8px;"><fmt:message code="notice.th.allchose" /></button>' +/*全选*/
                                                '</div>' +
                                            '</div>' +
                                        '</div>' +
                                    '</div>' +
                                '</form>' +
                        '</div>' +
                    ' </div>' +
            '</div>',
            area: ['800px', '500px'],
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],/*保存 关闭*/
            success: function () {
                $('#left_btn').click(function () {
                    $('#next_step_tab tbody tr').addClass('bg_d')
                })
                $('#right_btn').click(function () {
                    $('#alternative_tab tbody tr').addClass('bg_d')
                })

                $('.del_v').click(function () {
                    $(this).siblings('textarea').attr('user_id','')
                    $(this).siblings('textarea').attr('dataid','')
                    $(this).siblings('textarea').val('')
                })
                $('.addbtn').click(function () {

                    var $arr=$('#table_t tbody tr');
                    var ellar=true;
                    for(var i=0;i<$arr.length;i++){
                        if($($arr[i]).find('td').eq(1).attr('data-fileds')==$('#file_p').val()+$('#term').val()+$('#numval').val()){
                            ellar=false;
                            break;
                        }
                    }
                    if(!ellar){
                        layer.tips('<fmt:message code="workflow.th.dataExists" />',$('#numval').next().find('a'),{time:2000})/*该项数据已存在不能重复添加*/
                        return false;
                    }

                    var str='<tr>' +
                        '<td>'+function () {
                            if($('#table_t tbody tr').length!=''){
                                return $('#table_t tbody tr').length+1
                            }else {
                                return '0'
                            }
                        }()+'</td>' +
                        '<td class="filedsTwo" data-fileds="'+$('#file_p').find('option:selected').attr('fields')+$('#term').val()+$('#numval').val()+'">'+'"'+$('#file_p').find('option:selected').text()+'"' +
                        ''+$('#term').val()+'"'+$('#numval').val()+'"</td>' +
                        '<td><a href="javascript:void(0)"><fmt:message code="global.lang.delete" /></a></td>' +/*删除*/
                        '</tr>'

                    $('#table_t tbody').append(str)

                })
                $('.btn_b1s').on('click', function () {

                    var htmls = "";
                    if($(this).attr('data-type')==1){
                        $("#next_step_tab  tbody .bg_d").each(function (index, item) {
                            $(this).removeClass('bg_d')
                            $('#alternative_div table tbody').append($(this).clone(true))

                            $(this).remove();
                        });
                    }else {
                        $("#alternative_div  tbody .bg_d").each(function (index, item) {
                            $(this).removeClass('bg_d')
                            $('#next_step_tab tbody').append($(this).clone(true))

                            $(this).remove();
                        });
                    }

                });
                


                (function (fn) {
                    (function (fns) {
                        $.ajax({
                            type: "GET",
                            url: "/flow/selectAllFlow",
                            dataType: "JSON",
                            data: {
                                flowId: parent.getResObj.flowId
                            },
                            success: function (datah) {
                                if(datah.flag) {
                                    fns(datah.object.formId)
                                }else{
                                    $.layerMsg({content:'网络错误',icon:2})
                                }
                            }
                        })
                    })(function (formIds) {
                        workForm.init({
                                formhtmlurl: '../../form/formType',
                                resdata: {
                                    fromId: formIds
                                },
                                flag: 3
                            },
                            function (data) {
                                console.log(data)
                                var str='';
                                var htmlStr='';
                                for(var i=0;i<data.length;i++){
                                    str+='<option fields="flow_data_168.'+data[i].name+'" value="'+data[i].title+'">'+data[i].title+'</option>';
                                    htmlStr+='<tr><td name="'+data[i].name+'" style="cursor: pointer">'+data[i].title+'</td></tr>'
                                }
                                $('#file_p').html(str)
                                $('#group_s').html(str)
                                $('#data_th').html(htmlStr)
                                if(fn!=undefined){
                                    fn()
                                }
                            });
                    })

                })(function () {
                    if($(me).attr('data-type')!=1){
                        $.ajax({
                            type: 'GET',
                            url: '/flowSetDatas/queryFlowQuertTplById',
                            dataType: 'json',
                            data: {
                                'tplId': $(me).attr('seqid')
                            },
                            success:function(data){
                                if(data.flag){
                                    var datas=data.data;
                                    $('#tempName').val(datas.tplName)
                                    var arr=datas.flowConditions.split('\r\n');
                                    console.log(arr)
                                    $('#FLOW_STATUS').find('option').each(function (i,n) {
                                        if($(this).val()==arr[1]){
                                            $(this).attr('selected','selected')
                                        }
                                    })
                                    $('#FLOW_QUERY_TYPE').find('option').each(function (i,n) {
                                        if($(this).val()==arr[3]){
                                            $(this).attr('selected','selected')
                                        }
                                    })
                                    $('#start_date').val(arr[5])
                                    $('#end_date').val(arr[7])
                                    $('#runName').find('option').each(function (i,n) {
                                        if($(this).val()==arr[9]){
                                            $(this).attr('selected','selected')
                                        }
                                    })
                                    $('#num_put').val(arr[11])
                                    $('#attment').val(arr[15])
                                    $('#textPut').val(arr[17])
                                    $('#textPut').attr('user_id',datas.userId)
                                    var arrTwo=datas.dataConditions.split(',');
                                    var dataConditionsStr='';
                                    for(var i=0;i<arrTwo.length;i++){
                                        if(i<arrTwo.length-1) {
                                            dataConditionsStr += '<tr><td>' + (i + 1) + '</td>' +
                                                '<td class="filedsTwo" data-fileds="' + arrTwo[i] + '">' + arrTwo[i] + '</td>' +
                                                '<td><a href="javascript:void(0)"><fmt:message code="global.lang.delete" /></a></td></tr>'/*删除*/
                                        }
                                    }
                                    $('#table_t tbody').html(dataConditionsStr)
                                    $('#query_d').val(datas.condFormula)
                                    var groupByFieldsArr=datas.groupByFields.split(',')
                                    $('#group_s').find('option').each(function (i,n) {
                                        if($(this).attr('fields')==groupByFieldsArr[0]){
                                            $(this).attr('selected','selected')
                                        }
                                    })
                                    $('#groupSort').find('option').each(function (i,n) {
                                        if($(this).val()==groupByFieldsArr[1]){
                                            $(this).attr('selected','selected')
                                        }
                                    })
                                    $('#next_step_tab tbody tr').each(function (i,n) {
                                        if(datas.viewExtFields.indexOf($(this).find('td').eq(0).attr('name'))!=-1){
                                            $('#alternative_div table tbody').append($(this).clone(true));
                                            $(this).remove();
                                        }
                                    })
                                }
                            }
                        })
                    }
                })


            },
            yes: function () {

                var td = $("#data_th_1 td");
                var viewStr = "";
                for (var i = 0; i < td.length; i++) {
                    var name = $(td[i]).attr("name");
                    if (name) {
                        viewStr += "flow_data_"+parent.getResObj.flowId+"." + name + ","
                    }

                }
                var dataConditionsArr=$('.filedsTwo');
                var dataConditions = '';
                var dataConditionsStr=''
                $(dataConditionsArr).each(function (i,n) {
                    dataConditions+=$(this).attr('data-fileds')+','
                    dataConditionsStr+=$(this).text()+','
                })
                var groupadeStr;
                var groupadeAdd = $('#group_s').find("option:selected").attr('fields');
                var groupadeASC = $('#groupSort').find("option:selected").val();
                groupadeStr = groupadeAdd +','+ groupadeASC;

                var nameAtr = $('#FLOW_STATUS').attr('name');//工作流状态
                var nameVal = $('#FLOW_STATUS').find("option:selected").val();//ALL
                var atrVal = nameAtr + "\r\n" + nameVal;
                var query_scope = $('#FLOW_QUERY_TYPE').attr('name');//查询范围
                var query_s_a = $('#FLOW_QUERY_TYPE').find("option:selected").val();//ALL
                var scope_ALL = query_scope + "\r\n" + query_s_a;
                var date1 = $('#start_date').attr('name')//开始时间
                var date_num1 = $('#start_date').val();
                var dateVal = date1 + "\r\n" + date_num1;
                var date2 = $('#end_date').attr('name');//结束时间
                var date_num2 = $('#end_date').val();
                var endVal = date2 + "\r\n" + date_num2;
                var num_r = $('#runName').attr('name');//名称文号
                var num_a = $('#runName').find("option:selected").val();//ALL
                var num_w_a = $('#num_put').attr('name');
                var num_w = $('#num_put').val();
                var numVal = num_r + "\r\n" + num_a + "\r\n" + num_w_a + "\r\n" + num_w;
                var empty_k = $('#num_put').attr('name');
                var num_p = $('#num_put').val();
                var empty_val = empty_k + "\r\n" + num_p;

                var attment = $('#attment').attr('name');//公共附件名称
                var attmentval = $('#attment').val();
                var attr_val = attment + "\r\n" + attmentval;
                var begName = $('#textPut').attr('name');//流程发起人
                var begVal = $('#textPut').val();
                var beg_v = begName + "\r\n" + begVal;
                var work_f = atrVal + "\r\n" + scope_ALL + "\r\n" + dateVal + "\r\n" + endVal + "\r\n" + numVal + "\r\n" + empty_val + "\r\n" + attr_val + "\r\n" + beg_v;

                var data = {
                    'viewFields': viewStr,
                    'tplName': $('#tempName').val(),
                    'flowId': parent.getResObj.flowId,
                    'dataConditions': dataConditions,
                    'groupFields': groupadeStr,
                    'condFormula': $('#query_d').val(),
                    'flowConditions': work_f,
                    'dataXml': ''
                };

                if($(me).attr('data-type')!=1){
                    data.tplId=$(me).attr('seqid')
                }
                $.ajax({
                    type: 'POST',
                    url: ajaxUrl,
                    dataType: 'json',
                    data: data,
                    success: function (data) {
                        if (data.flag) {
                            if($(me).attr('data-type')==1){
                                $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){ TempPriv();});/*保存成功*/

                            }else {
                                $.layerMsg({content:'<fmt:message code="netdisk.th.Editsuccess" />！',icon:1},function(){ TempPriv();});/*编辑成功*/
                            }


                        } else {
                            layer.msg(data.msg, {icon: 6})
                        }
                    }
                });
            }
        })

    })

    $('#table_power').on('click', '.del_temp', function () {
        var me=this;
        $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="menuSSetting.th.isdeleteMenu" />？',icon:0},function(){/*确定删除*/  /*您确定要删除吗*/
            var seqId = [];
            var tempId = $(me).attr('seqId');
            seqId.push(tempId);
            $.ajax({
                type: 'get',
                url: '/flowSetDatas/deleteFlowQuertTpl',
                dataType: "json",
                data: {
                    'tplId[]': seqId
                },
                success: function (data) {
                    if (data.flag) {
                        $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1},function(){ TempPriv();});/*删除成功*/
                    }

                }
            })
    })
    });
</script>
</body>
</html>
