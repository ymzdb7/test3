<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <title><fmt:message code="main.th.feedbackStep" /></title>
    <link rel="stylesheet" href="../../css/workflow/work/m/style.css">
</head>
<body>
<div class="turnview" id="pro_turn"><div class="word_title">
    <img src="../../img/workflow/m/apply_next_select.png" alt="" class="icon">
    <div class="word_quick_action"><fmt:message code="main.th.feedbackStep" /></div>
</div>
    <div class="list-panel" id="nextstep">

    </div>

    <div id="panel-next-user">
        <div class="word_title nofirest">
            <img src="../../img/workflow/m/apply_next_select.png" alt="" class="icon">
            <div class="word_quick_action">请输入回退意见：</div>
        </div>
        <div class="signBox">
            <textarea id="feedbacktext" rows="4" class="gapp_textarea" data-key="0" data-field-type="020000" data-must="0" data-is-write="1" name="" placeholder=""></textarea>

        </div>

    </div>
    <button id="feedbackbtn" style="display: none;">确定</button>
</div>
<script src="../../js/jquery/jquery-1.9.1.js"></script>
<script src="../../js/template.js"></script>
<script src="../../lib/laydate/laydate.js"></script>
<script src="../../js/mustache.min.js"></script>
<script src="../../js/base/base.js"></script>
<script>

var feedback = {};
function ready(){
    if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
        rightTitle('<fmt:message code="workflow.th.Transfer" />','xxxxx','feedback');
    } else if (/(Android)/i.test(navigator.userAgent)) {
        //alert(navigator.userAgent);
        Android.rightTitle('<fmt:message code="workflow.th.Transfer" />','xxxxx','feedback');
    }
}
    $(function () {
        var flowId = $.getQueryString("flowId");
        var flowStep = $.getQueryString("flowStep") || '';
        var prcsId = $.getQueryString("prcsId") || '';
        var runId = $.getQueryString("runId") || '';
        var allowback = $.getQueryString("allowback") || '';

            $.ajax({
                type: "get",
                url: "getflowprcsdata",
                dataType: 'JSON',
                data: {
                    prcsId: flowStep,
                    runId: runId,
                    allowBack:allowback
                },
                success: function (res) {

                   if(res.flag){
                       var prcName = '';
                        res.obj.forEach(function (v,i) {
                            prcName +='<span class="nofirest"><input type="radio" flowPrcs="'+v.flowProcess.prcsId+'" nextPrcsId="0" value="normal2" name="feedbackstep" >&nbsp;<fmt:message code="workflow.th.First" />'+v.prcsId+'<fmt:message code="workflow.th.step" />'+v.flowProcess.prcsName+'&nbsp;&nbsp;主办人：'+v.userName+'</span><br>';
                        })
                       $('#nextstep').html(prcName);
                        $('.nofirest input').eq(0).click();
                   }
                }
             });

        feedback = function () {
            var backflowPrcs = $("input[name='feedbackstep']:checked").attr('flowPrcs');
            var feedbacktext = $('#feedbacktext').val()
            if(feedbacktext == ''){
                alert("<fmt:message code="main.th.ReturnOpinion" />！");
            }else{


            $.ajax({
                type: "get",
                url: "insertprcsdata",
                dataType: 'JSON',
                data: {
                    flowPrcs : backflowPrcs,
                    prcsId : prcsId,
                    flowStep:flowStep,
                    runId : runId,
                    feedback : feedbacktext
                },
                success: function (res) {
                    if(res.flag){
                        alert('回退成功！');
                    /************调用移动端返回工作流列表方法************************/
                        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                            finishWork();
                        } else if (/(Android)/i.test(navigator.userAgent)) {
                            Android.finishWebActivity();
                        }

                    }else{
                        alert('回退失败！');
                    }

                }
            });
            }
        };
        $('#feedbackbtn').click(function () {
            feedback();
        });


    });


</script>
</body>
</html>