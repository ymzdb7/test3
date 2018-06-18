<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/8/8
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.applylayoutfiles" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <link rel="stylesheet" href="/lib/laydate.css">
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
</head>
<body>
<div class="cont_r " style="margin-left: 0px;">
    <div class="item_s item_con">
        <table class="table" cellspacing="0" id="table_task">
            <caption class="clearfix">
                <img style="margin-right: 10px;width: 18px;padding-left: 15px;float: left;" src="/img/workflow/flowsetting/flowSettingMain/yingyong.png"  alt="">

                <span class="priv_t"><fmt:message code="workflow.th.applylayoutfiles" /></span>
                <a href="javascript:void (0)" class="new_liucheng task_n" data-id="1"><fmt:message code="global.lang.new" /></a>
                <a href="javascript:void (0)" id="del"></a>
            </caption>
            <thead>
            <tr>
                <th><fmt:message code="sms.th.Button" /></th>
                <th><fmt:message code="sms.th.TemplateType" /></th>
                <th><fmt:message code="sms.th.TemplateClass" /></th>
                <th><fmt:message code="sms.th.CreationDate" /></th>
                <th><fmt:message code="notice.th.operation" /></th>
            </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
</div>


<script>
    function privFile() {

        $.ajax({
            type: 'get',
            url: '/flowSetDatas/getFlowPrintTpl',
            dataType: 'json',
            data: {
                flowId: parent.getResObj.flowId
            },
            success: function (data) {
                if (data.flag) {
                    var data = data.datas;
                    var html='';
                    for (var i = 0; i < data.length; i++) {
                        var tTypeStr = '';
                        if (data[i].tType == '1') {
                            tTypeStr = '<fmt:message code="sms.th.PrintTemplate" />'
                        } else {
                            tTypeStr = '<fmt:message code="sms.th.homePage" />'
                        }
                        var data_obj = JSON.stringify(data[i]).replace(/"/g, "'");
                        html += '<tr>' +
                            '<td>' + '<input type="checkbox" class="one" tId="' + data[i].tId + '">' +
                            '</td>' +
                            '<td>' + data[i].tName + '</td>' +
                            '<td style="text-align: center;padding-left: 10px">' + tTypeStr + '</td>' +
                            '<td style="text-align: center;padding-left: 10px">' + data[i].createTime + '</td>' +
                            '<td>' + '<a href="javascript:void(0)"  tId="' + data[i].tId + '" class="fileUpdate fileUpdateactive task_n"><input type="hidden" value="' + data_obj + '"><fmt:message code="depatement.th.modify" /></a>' + '<a href="javascript:void(0)" class="del_priv del_privactive"  tId="' + data[i].tId + '"><fmt:message code="global.lang.delete" /></a>' + '</td>' + '</tr>';

                    }
                    $('#table_task tbody').html(html);
                }else {
                    $('#table_task tbody').html('');
                }



            }

        })
    }
    privFile()


    $('#table_task').delegate('.task_n','click',function () {

        var urlTitle='';
        var me=this;
        if($(this).attr('data-id')==1){
            urlTitle='/flowSetDatas/newFlowPrintTpl'
        }else {
            urlTitle='/flowSetDatas/updateFlowPrintTpl'
        }

        layer.open({
            title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
            shade: 0.3,
            content: '<div class="pop_con">' +
            '<div class="con_t">' +
            '<div class="con_l">' +
            '<div class="con_title">' +
            '<div class="title_1">' +
            '<div class="title_label"></div>' +
            '<span class="title_s"><fmt:message code="sms.th.TemplateName" /> *</span>' +
            '<div class="title_put"><input type="text" id="select_con" class="select_t"></div></div>' +
            '<div class="title_2">' +
            '<div class="title_label"></div>' +
            '<span class="title_s"> <fmt:message code="sms.th.TemplateClass" />*</span>' +
            '<div class="title_put"><select name="" id="select_type" class="select_t"><option value ><fmt:message code="sms.th.selectTemplateClass" /></option><<option value="1" selected="selected"><fmt:message code="sms.th.PrintTemplate" /></option><option value="2" ><fmt:message code="sms.th.HandwrittenApproval" /></option></select></div></div>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '</div>',

            area: ['600px', '500px'],
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            success: function () {
                $('#addtext').click(function () {
                    alert('<fmt:message code="sup.th.UnderDevelopment" />')
                })
                if($(me).attr('data-id')!=1){
                    var data_attr = $(me).find("input").val().replace(/'/g, '"');
                    var objData = JSON.parse(data_attr);
                    $('#select_con').val(objData.tName)
                    $('#select_type').find('option').each(function (i,n) {
                        if($(this).val()==objData.tType){
                            $(this).attr('selected','selected')
                            return false
                        }
                    })
                }

            },
            yes: function () {
                if($('#select_con').val()==''){
                    alert('请输入模板名称');
                    return;
                }
                var data = {
                    'tName': $('#select_con').val(),
                    'tType': $('#select_type option:selected').val(),
                    'flowId': parent.getResObj.flowId,
                }
                if($(me).attr('data-id')!=1){
                    data.tId=$(me).attr('tid')
                }
                $.ajax({
                    type: 'GET',
                    url: urlTitle,
                    dataType: 'json',
                    data: data,
                    success: function (data) {
                        if (data.flag) {
                            $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation" />！',icon:1},function(){
                                privFile();
                            });
                        } else {
                            layer.msg('<fmt:message code="sms.th.operationFailed" />。。', {icon: 6})
                        }
                    }
                });
            }
        })
    });

    $('#table_task').on('click', '.del_priv', function () {
        var me=this;
        $.layerConfirm({title:'<fmt:message code="workflow.th.suredel" />',content:'<fmt:message code="menuSSetting.th.isdeleteMenu" />？',icon:0},function() {
            var seqId = [];
            var tempId = $(me).attr('tId');
            seqId.push(tempId);
            $.ajax({
                url: '/flowSetDatas/deleteFlowPrintTpl',
                type: 'get',
                dataType: 'json',
                data: {
                    'tId[]': seqId
                },
                success: function (data) {
                    if (data.flag) {

                        $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1},function(){ privFile()});

                }

                },

            })
        })




    })
</script>

</body>
</html>
