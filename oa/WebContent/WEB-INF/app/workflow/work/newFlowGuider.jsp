<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!-- saved from url=(0060)http://192.168.0.21/general/workflow/new/edit.php?FLOW_ID=35 -->
<html><!--<![endif]--><head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title><fmt:message code="newWork.th.NewWizard" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/flowguider.css">
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js"></script>
    <style type="text/css">
        ul{list-style:disc;}
        ol{list-style:decimal;}
        html{
            margin:0px;
            padding:0px;
            height:100%;
            overflow-y:hidden;
        }
        body{
            margin:0px;
            padding:0px;
            height:100%;
            min-width:960px;
        }
        .bodycolor {
            BACKGROUND: #FFFFFF;
        }
        .clear{
            clear:both; float:none;
        }
        .float_left{
            float:left;
        }
        .float_left{
            float:left;
        }
        .f_field_block{
            margin-top:4px;
            margin-bottom:4px;
            display:block;
            text-align:left;
        }
        .f_field_block_small{
            padding:0px;
            margin:0px;
            margin-top:1px;
            margin-bottom:1px;

        }
        .f_field_label{
            margin:0px;
            padding:0px;
        }
        .f_field_title{
            font-size:12px;
            font-weight:bold;
            margin-left:2px;
            margin-right:2px;
        }
        .f_field_ctrl{
            margin-top:5px;
            margin-left:2px;
        }
        .f_field_ctrl_small{
            margin-top:1px;
            margin-left:2px;
        }
        .f_field_explain_label{
            /*background:#F0F8FA;*/
            width:90%;
            margin:0px;
            padding:0px;
            float:left;
            margin-bottom:5px;
            border:0px;

        }
        .f_field_explain_title_red{
            color:red;
            margin:0px;
            padding:0px;
            font-size:12px;
        }
        .f_field_explain_title_blue{
            color:blue;
            margin:0px;
            padding:0px;
            font-size:12px;
        }
        .f_field_explain_title_green{
            color:green;
            margin:0px;
            padding:0px;
            font-size:12px;
        }
        /*--必填*样式 --*/
        .f_field_required{
            color:red;
            font-size:12px;
            margin-top:0px;
            margin-left:2px;
            margin-right:2px;

        }
        /*--提示小图标样式 --*/
        .icon18-illustration{
            margin-left:8px;
            width:24px;
            height:24px;
            padding-bottom:5px;
            padding-left:16px;
            background:url(/static/modules/workflow/system/flow_guide/flow_type/css/images/tip.png) no-repeat;
        }

        .flow_top_type{
            margin:0px;
            padding:0px;
            margin-top:26px;
            margin-right:10px;
            border-bottom:3px solid #3f9bca;
            color:#3f9bca;
            font-size:14px;
            font-weight:bold;
            margin-bottom:16px;
        }
        .flow_name{
            color:rgb(60, 40, 143);
            font-size:12px;
            float:left;
            font-weight:normal;
        }
        .flow_intro{
            color:#94918c;
            float:left;
        }
    </style>
</head>
<body class="bodycolor">
<div style="width:100%; min-width:1024px;">
    <div class="new_edit_left" style="height: 945px;">
        <form  method="post" name="form1">
            <div class="new_edit_left_title new_edit_margin_left">
                <span class="new_edit_left_title_span"><fmt:message code="main.th.FillWork" /></span>
            </div>
            <div class="new_edit_title new_edit_margin_left clear">
                <span class="new_edit_title_span" id="mcwn"></span>
            </div>
            <div class="new_edit_left_content new_edit_margin_left clear">
                <div class="f_field_block" id="qianzhui"></div>
                <div class="f_field_block clear">
                    <div class="f_field_label"><span class="f_field_title"><fmt:message code="workflow.th.Name-number" /></span></div>
                    <div class="f_field_ctrl">
                        <input class="span4" id="runName" type="text" value="<fmt:message code="attend.th.LeaveApproval" />(2017-07-28 11:29:05)" name="RUN_NAME" size="60">
                        <input type="hidden" name="AUTO_NUM" id="AUTO_NUM" value="1">
                        <a href="javascript:;" class="orgClear" onclick="document.form1.RUN_NAME.value=&#39;&#39;"><fmt:message code="global.lang.empty" /></a>
                    </div>
                </div>
                <div class="f_field_block" id="houzhui"></div>
            </div>
            <div class="new_edit_left_button">
                <input type="hidden" value="" name="MENU_FLAG">
                <input type="hidden" value="35" name="FLOW_ID">
                <input type="hidden" value="1" name="AUTO_NEW">
                <button type="button" class="btn btn-primary" id="xiangdaoxinjian" style="cursor: pointer;"><fmt:message code="main.th.NewProcessed" /></button>
                <button type="button" class="btn" onclick="javascript:window.opener=null;window.open('','_self');window.close();" style="cursor: pointer;"><fmt:message code="notice.th.return" /></button>
            </div>
        </form>
    </div>
    <div class="new_edit_right" style="overflow: auto; height: 945px;">
        <div class="new_edit_left_title new_edit_margin_left">
				<span class="new_edit_left_title_span">
						<fmt:message code="main.th.procedureList" />			</span>
        </div>
        <div class="new_edit_title new_edit_margin_left clear">
		    	<span class="new_edit_title_span">
		    		&lt;<fmt:message code="workflow.th.Processdes" />&gt;		    	</span>
        </div>
        <div class="new_edit_right_content new_edit_margin_left clear">
		    	<span class="shuomingwenzi">
		    			    		<fmt:message code="main.th.ProcessDescription" />		    			    	</span>
        </div>
        <div class="new_edit_right_table new_edit_margin_left clear">
            <table class="table table-bordered table-hover" style="width:600px;">
                <tbody class="xz">

                </tbody></table>
        </div>
        <div class="new_edit_left_title new_edit_margin_left">
				<span class="new_edit_left_title_span">
					<fmt:message code="workflow.th.shuoming" />				</span>
        </div>
        <div class="new_edit_right_content new_edit_margin_left clear">
            <table border="0" class="table table-bordered table-hover" style="width:600px;">
                <tbody><tr style="background:#e4f1f9;">
                    <td style="font-size:14px; font-weight:bold;">
							<span style="margin-left:20px;"><fmt:message code="main.th.LeaveApprovalDocumentation" /></span>
                    </td>
                </tr>
                <tr>
                    <td>
							<span style="margin-left:20px;line-height:30px;" class="shuomingwd"><fmt:message code="main.th.NoDocumentation" /></span>
                    </td>
                </tr>
                </tbody></table>
        </div>
        <form method="POST" name="form_plugin">
        </form>
    </div>
</div>


<div id="cli_dialog_div"></div>
</body>
<script>
    $(function() {
        var flowId = $.getQueryString("flowId");
        var formId = '';
        (function (fn) {
        $.ajax({
            type: "post",
            url: "createGuide",
            dataType: 'JSON',
            data: {
                flowId: flowId
            },
            success: function (rsp) {
                var myArray=new Array()
                var myArray= rsp.attributes.AllFlowProcess;
                var runName = rsp.attributes.runName;
                formId = rsp.attributes.formId
                var flowDesc = rsp.attributes.flowDesc;
                var flowName = rsp.attributes.flowName;
                var flowType = rsp.attributes.flowType;
                var attachmentId = rsp.attributes.attachmentId;
                var attachmentName = rsp.attributes.attachmentName;
                var attachList = rsp.attributes.attachList;
                var autoEdit = flowType.forcePreSet;
                $(".shuomingwenzi").html(flowDesc);
                $("#mcwn").append('&lt;'+flowName+'- <fmt:message code="workflow.th.Name-number" />&gt;');
                $(".smwd").html(flowName+'- <fmt:message code="workflow.th.shuoming" />');
                $("#runName").val(runName);

                for(var i=0;i<attachList.length;i++){
                    str+='<tr><td><span style="margin-left:40px;line-height:30px;"><a href="/download?'+attachList[i].attUrl+'"><img style="margin-right:10px;" src="../../img/attachment_icon.png"/>'+attachList[i].attachName+'</a></span></td></tr>'
                }
                $('.shuomingwd').html(str);

                if(autoEdit==0) {
                    $("#runName").attr("readonly", "readonly");
                    $(".orgClear").remove();
                }
                if (autoEdit==2){
                    $("#runName").attr("readonly", "readonly");
                    $(".orgClear").remove();
                    var str = '';
                    str+='<div class="f_field_label"><span class="f_field_title"><fmt:message code="main.th.prefix" />：</span></div>' +
                        '       <div class="f_field_ctrl">' +
                        '        <input type="text" id="RUN_NAME_LEFT" name="RUN_NAME_LEFT" size=46 class="span4">' +
                        '       </div>'
                    $("#qianzhui").html(str);

                }
                if (autoEdit==3){
                    $("#runName").attr("readonly", "readonly");
                    $(".orgClear").remove();
                    var str = '';
                    str+='<div class="f_field_label"><span class="f_field_title"><fmt:message code="main.th.Suffix" />：</span></div>' +
                        '       <div class="f_field_ctrl">' +
                        '        <input type="text" id="RUN_NAME_RIGHT" name="RUN_NAME_RIGHT" size=46 class="span4">' +
                        '       </div>'
                    $("#houzhui").html(str);
                }
                if (autoEdit==4){
                    $("#runName").attr("readonly", "readonly");
                    $(".orgClear").remove();
                    var str = '';
                    str+='<div class="f_field_label"><span class="f_field_title"><fmt:message code="main.th.prefix" />：</span></div>' +
                        '       <div class="f_field_ctrl">' +
                        '        <input type="text" id="RUN_NAME_LEFT" name="RUN_NAME_LEFT" size=46 class="span4">' +
                        '       </div>'
                    $("#qianzhui").html(str);
                    var str1 = '';
                    str1+='<div class="f_field_label"><span class="f_field_title"><fmt:message code="main.th.Suffix" />：</span></div>' +
                        '       <div class="f_field_ctrl">' +
                        '        <input type="text" id="RUN_NAME_RIGHT" name="RUN_NAME_RIGHT" size=46 class="span4">' +
                        '       </div>'
                    $("#houzhui").html(str1);
                }
                renderData(myArray);
                fn()
            }
        })
        })(function () {
            var foucs=$('[name="form1"]').find('input[type="text"]')[0];
            if($(foucs).attr('readonly')!='readonly') {
                foucs.focus()
            }
        })

        function getNowFormatDate() {
            var now = new Date();
            var year = now.getFullYear();       //年
            var month = now.getMonth() + 1;     //月
            var day = now.getDate();            //日
            var hh = now.getHours();            //时
            var mm = now.getMinutes();          //分
            var ss = now.getSeconds();           //秒

            var clock = year + "-";

            if(month < 10)
                clock += "0";

            clock += month + "-";

            if(day < 10)
                clock += "0";

            clock += day + " ";

            if(hh < 10)
                clock += "0";

            clock += hh + ":";
            if (mm < 10) clock += '0';
            clock += mm + ":";

            if (ss < 10) clock += '0';
            clock += ss;
            return(clock);
        }

        $('#xiangdaoxinjian').on('click',function(){
            var flowId = $.getQueryString("flowId");
            var runName = $("#runName").val();
            var RUN_NAME_LEFT = $("#RUN_NAME_LEFT").val();
            var RUN_NAME_RIGHT = $("#RUN_NAME_RIGHT").val();
            if (RUN_NAME_LEFT!=''&&RUN_NAME_LEFT!=undefined){
                runName=RUN_NAME_LEFT+runName;
            }
            if (RUN_NAME_RIGHT!=''&&RUN_NAME_RIGHT!=undefined){
                runName=runName+RUN_NAME_RIGHT;
            }
            $.ajax({
                type: "post",
                url: "workfastAdd",
                dataType: 'JSON',
                data: {
                    flowId:flowId,
                    runId:'',
                    prcsId:1,
                    flowStep:1,
                    runName:runName
                },
                success: function (rsp) {
                    if(rsp.flag){
                        $.popWindow("workform?flowId="+flowId+'&flowStep=1&prcsId=1'+'&runId='+rsp.object.flowRun.runId,'<fmt:message code="main.th.ProcessManagement" />','0','0','1150px','700px');
                        window.close();
                    }

                }
            });


        });
    $('.xz').on('click','#flowProcess',function(){
        var flowId = $(this).parent().attr('flowId');
        $.popWindow('/flowSetting/processDesignToolsT?flowId='+flowId+'&type=0','<fmt:message code="main.th.ProcessManagement" />','0','0','1150px','700px');
    });
    $('.xz').on('click','#formTpl',function(){
        var formid = $(this).parent().attr('formid');
        $.popWindow('workform1?formId='+formid,'<fmt:message code="main.th.ProcessManagement" />','0','0','1150px','700px');
    });
        function renderData(data) {
            var str='';
            str+='<tr style="background:#e4f1f9;">\n' +
                '                    <th nowrap="" style="text-align:center;" align="center" width="80px"><fmt:message code="main.th.StepNumber" /></th>\n' +
                '                    <th nowrap="" style="text-align:center;" align="center" width="250px"><fmt:message code="workflow.th.name" /></th>\n' +
                '                    <th nowrap="" style="text-align:center;" align="center" width="150px"><fmt:message code="main.th.OptionalFlowDirection" /></th>\n' +
                '                </tr>'
            for(var i=0;i<data.length;i++){
                if(data[i]){
                    str+='<tr class="TableLine1"><td style="text-align:center;">'+data[i].prcsId+'</td><td style="text-align:center;">'+data[i].prcsName+'</td><td style="text-align:center;">'+'→'+data[i].prcsTo+'</td></tr>'
                }
            }
            str+=' <tr class="TableControl" style="height:45px;">\n' +
                '                    <td align="center" colspan="3" style="text-align:center;" formId="'+formId+'" flowId="'+flowId+'">\n' +
                '                        <button type="button" class="btn btn-small btn-primary" id="flowProcess" style="cursor: pointer;"><fmt:message code="main.th.SeeDesignDiagram" /></button>\n' +
                '                        <button type="button" class="btn btn-small btn-primary" id="formTpl" style="cursor: pointer;"><fmt:message code="main.th.ViewFormTemplates" /></button>\n' +
                '                    </td>\n' +
                '                </tr>'

            $('.xz').append(str);
        }

    })

</script>
</html>
