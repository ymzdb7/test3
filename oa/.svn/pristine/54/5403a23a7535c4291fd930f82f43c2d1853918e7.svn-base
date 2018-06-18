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
    <title><fmt:message code="main.newwork" /></title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8 ? MYOA_CHARSET : htmlspecialchars($HTML_PAGE_CHARSET))?>" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/m_reset.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/new_work.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/handle.css"/>
    <link rel="stylesheet" type="text/css" href="/css/dept/roleAuthorization.css"/>
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/workflow/work/workform.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="/lib/jquery.jqprint-0.3.js"></script>
    <script src="/lib/jquery-migrate-1.1.0.js"></script>
    <script src="/js/mustache.min.js"></script>
</head>

<style type="text/css">
    .steptext{
        float: right;
        margin-top: 2px;
    }
    .cont{
        position: relative;
        overflow-y: auto;
    }
    #tab_c{
        width:316px;
        height:100%;
        top:0;
        bottom:0;
        position: fixed;
        /* background: red;*/
        overflow-y: scroll;
        box-shadow: -2px 0 20px 0px #c4c4c4;
    }
    .cont_form{
        margin: 0 auto;
    }

    .tab_one,#tab_ctwo{
        width:100%;
        height:100%;
    }
    .cont_ctwo{
        width:100%;
        height:100%;
    }
    .cont_cone{
        width:100%;
        height:85%;
    }
    .tab_one{
        width:100%;
        height: 200%;
    }
    .cont_cone li{
        width: 85%;
        height:50px;
        margin:10px auto;
        border: 1px solid #cccccc;
        border-radius: 3px;

    }

    .one_all,.two_all{
        width:100%;
        height:25%;
    }
    .one_all{
        border-bottom: 1px solid #ccc;
    }
    #tab_ctwo ul{
        width:100%;
        height:100%;
        display:none;
    }
    .item_logo,.item_word{
        float:left;
    }
    .item_logo{
        width: 40px;
        height: 40px;
        margin-left: 3px;
        margin-top: 5px;
        background: #00a2d4;
    }
    .item_word{
        margin-top: 5px;
        margin-left: 7px;
    }
    .item_word h1{
        color: #4b4b4b;
        font-size: 10pt;
    }
    .item_word h2{
        color: #919191;
    }
    .position{
        position: absolute;
        right: 21px;
        top: 17px;
        clear: both;
    }
    .fujian_logo,.fujian_h1,.huiqian_logo,.huiqian_h1{
        float: left;

    }
    .fujian_logo{
        margin-top: 3px;
    }
    .huiqian_logo{
        margin-top: 10px;
    }
    .fujian_h1,.huiqian_h1{
        margin-left: 5px;
        font-size: 12pt;
        margin-top: 3px;
        /*        line-height: 40px;*/
    }
    .huiqian_h1{
        line-height: 40px;
    }
    .add_fujian{
        width: 85%;
        height: 40px;
        border-radius: 7px;
        /*border: none;*/
        background: #54a9fc;
        color: #fff;
        margin: auto;
        margin-left: 24px;
        text-align: center;
        line-height: 40px;
        outline: none;
    }
    .foot_left{
        width:160px;
    }
    .foot_rig{
        width: 535px;
    }
    .cont_ctwo li{
        width: 90%;
        height: 70px;
        border-radius: 3px;
        margin: auto;
        border:1px solid #cccccc;
        margin-top: 7px;
    }
    .huiqian_inp,.huiqian_send{
        float:left;
    }
    .hui_inp{
        width: 81% !important;
        margin-left: -56px !important;
    }
    .huiqian_inp{
        width: 68%;
        height: 30px;
        border-radius: 3px;
        border: none;
        outline: none;
        text-align: left;
        border: 1px solid #cccccc;
        margin-left: 0px;
    }
    .huiqian_send{
        width: 15%;
        height: 30px;
        background: #ff9b30;
        color: #fff;
        margin-left: 8px;
        outline: none;
        border-radius: 3px;
        border: none;
    }
    .huiqian_word{
        width:80%;
        height:100%;
        margin-left: 4px;
    }
    .huiqian_word h1{
        margin-top: 8px;
    }
    .huiqian_word h2{
        color: #919191;
    }
    .huiqian_touxiang{
        margin-left: 2px;
    }
    .huiqian_touxiang,.huiqian_word{
        float: left;
    }
    .huiqian_word h3{
        overflow: hidden;/*内容超出后隐藏*/
        text-overflow: ellipsis;/* 超出内容显示为省略号*/
        white-space: nowrap;/*文本不进行换行*/

    }
    .huiqian_touxiang{
        width: 40px;
        height: 40px;
    }
    .layui-layer-page .layui-layer-content {

        overflow: hidden !important;
    }
    .foot li:hover {
        color:#fff !important;
        background:#4889f0 !important;
    }
    /*.choose{
       color:#fff;
        background:#4889f0 !important;
    }*/
    #remind_name,#jingban{
        height: 20px !important;
    }
    .workflow-node {
        padding: 0px !important;
    }
    .prcsName{
        width: 100%;
        height: 40px;
        background: url("../../../img/workflow/work/add_work/uncheck.png") no-repeat 20px center;
    }
    .prcsName h1 {
        text-align: center;
        line-height: 40px;
    }
    .prcsName_chang{
        color:#fff;
        background: #5B7FCB  url("../../../img/workflow/work/add_work/checked.png") no-repeat 20px center;
    }
    .fujian a,.huiqian a{
        width: 70px;
        height: 28px;
        display: block;
        text-decoration: none;
    }
    .top_one{
        position: absolute;
        top: 0px;
    }
    .top_two{
        position: absolute;
        top: 696px;
    }
    #tab_c{
        transition: all 1s ease 0s;
    }
    .list_table{
        border-width: medium;
        border-style: none;
        border-color: initial;
        border-collapse: collapse;
        word-wrap: break-word;
        table-layout: fixed;
    }
    .list_table .head {
        font-weight: 600;
    }
    .list_table td{
        border-bottom: #7F7F7F 1pt solid;
        /* border-left: #000000 2.25pt solid; */
        text-align: center;
        width: 50px;
        padding-bottom: 1px;
        padding-left: 1px;
        padding-right: 1px;
        vertical-align: middle;
        border-top: #7F7F7F 1pt solid;
        border-right: black 1pt solid;
        padding-top: 1px;
        padding: 0;
    }
    .modal-body{
        max-height: 341px !important;
    }
    .flowtypetext{
        float: left;
        margin-top: 2px;
        line-height: 48px;
    }
    .fileDownload{
        cursor: pointer;
    }
    .fileDownload:hover{
        color:blue;
    }
    .steptextcheck ul li{
        padding: 10px 25px;
        line-height: 22px;
        background: #fff;
        font-size: 12px;
        color: #666;
        border: 1px solid #ddd;
        margin: 10px 0;
        text-align: left;
        list-style: none;
    }
    .clearfix:after{
        content:'';
        display: block;
        clear: both;
    }
    .tabAB{

        position: absolute;
        background-color: #fff;
        margin-left:50%;
        width:140px;
        height:28px;
        margin-top:8px;
        display: none;
    }
    .tabAB ul{
        width: 140px;
        height: 28px;
        border: 1px solid #4889f0;
        border-radius: 5px;
    }
    .tabAB ul li{
        height:28px;
        line-height: 28px;
        width:70px;
        color:#4889f0;
        cursor: pointer;
        text-align: center;
        margin:0;
    }
    .tabAB ul li.active{
        background: #4889f0 ;
        color:#fff;
    }
    .tabAB ul li:hover{
        background: #4889f0 ;
        color:#fff;
    }
</style>
<body>
<div id="bodys">
    <div class="head" style="position: relative">
        <div id="title" class="abs_left">
            <h1 class="num"><fmt:message code="workflow.th.PipelineName" />：<span id="flowNum"></span></h1>
            <h2 class="step"></h2>
            <h2 class="step"><input data-id="1" type="checkbox" checked="checked" name="checkWorkshopOverviewItem" id="checkOne"><span class="steptext"><fmt:message code="workfolw.th.form" /></span></h2>
            <h2 class="step"><input data-id="2" type="checkbox" checked="checked" name="checkWorkshopOverviewItem" id="checkTwo" ><span class="steptext"><fmt:message code="workflow.th.PublicAccessories" /></span></h2>
            <h2 class="step"><input data-id="3" type="checkbox" checked="checked" name="checkWorkshopOverviewItem" id="checkThree"><span class="steptext"><fmt:message code="work.th.CountersignedArea" /></span></h2>
            <h2 class="step"><input data-id="4" type="checkbox" checked="checked" name="checkWorkshopOverviewItem" id="checkFour"><span class="steptext"><fmt:message code="workflow.th.chart" /></span></h2>
            <h2 class="step" ><span class="steptext"style="color: #FF0000">点击“确定”后，进入“新建公告通知”页面</span></h2>
        </div>

         <div id="tab_t" class="abs_right">
            <span id="flowtype" class="flowtypetext"></span>
        </div>
         <div class="tabAB">
            <ul class="clearfix">
                <li class="fl active" data-id="1" ><fmt:message code="workflow.th.form" /></li>
                <li class="fl" data-id="2" ><fmt:message code="main.th.text" /></li>
            </ul>
        </div>
    </div>
         <div class="content" >
        <%-- <form action="<%=basePath%>/workflow/work/nextwork"   id="ajaxform">--%>
        <div class="cont" style="background: #e6ebef" id="client">
            <div class="cont_form" id="a2">





            </div>  <!-- 表单 -->
            <div class="theAttachment" style="width: 100%;">
                <p style="width: 70%;margin: 0 auto;font-size: 14pt;margin-top: 10px;">
                    <fmt:message code="workflow.th.PublicAccessories" />
                </p>
                <p style="width: 70%;margin: 0 auto;font-size: 12pt;margin-top: 10px;padding-left: 10px;">
                    <label><input type="checkbox" name="allchebox"><fmt:message code="notice.th.allchose" /></label>
                </p>
                <table style="width: 70%;margin: 0 auto;table-layout: fixed" class="tr_td tr_tds">
                    <thead>
                    <tr>
                        <th class="th" width="40%">
                            <fmt:message code="workflow.th.AttachmentName" />
                        </th>
                        <th class="th" width="30%">
                            <fmt:message code="workflow.th.AttachmentSize" />
                        </th>
                        <th class="th" width="30%">
                            <fmt:message code="notice.th.createTime" />
                        </th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>  <!-- 附件 -->
            <div class="steptextcheck">   <!-- 会签 -->
                <p style="width: 70%;margin: 0 auto;font-size: 14pt;margin-top: 10px;">
                    <fmt:message code="work.th.CountersignedArea" />
                </p>
                <table width="70%" style="margin: 0 auto;table-layout: fixed;font-size: 12pt;margin-top: 10px;">
                    <tbody></tbody>
                </table>
            </div>
            <div class="steptextliucheng">      <!-- 流程 -->
                <p style="width: 70%;margin: 0 auto;font-size: 14pt;margin-top: 10px;">
                    <fmt:message code="workflow.th.chart" />
                </p>
                <table width="70%" style="margin: 15px auto;table-layout: fixed" class="tr_td trtd_d">
                    <thead class="TableHeader">
                    <tr >
                        <th  nowrap="" class="th" colspan="3" align="center"><fmt:message code="workflow.th.TheProcessBegins" /></th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>

            </div>

        </div>








    </div>

    <div class="foot" style="background: #fff;height: 48px;">
        <div class="foot_left">

        </div>
        <div class="foot_rig">
            <ul>
               <li class="rig_li"><h1 class="rig_h1" id="closeWin"><fmt:message code="global.lang.close" /></h1></li>
                <li class="rig_li"><h1 class="rig_h1" id="actionOverflows">确定</h1></li>
            </ul>
        </div>
    </div>
</div>
<script>

    var flowId = $.GetRequest().flowId|| '';
    var flowStep = $.GetRequest().flowStep || '';
    var runId = $.GetRequest().runId || '';
    var prcsId=$.GetRequest().prcsId || '';
    $('#actionOverflows').click(function () {

    var num='';
      if(document.getElementById("checkOne").checked){
              num+=1;
        }
        if(document.getElementById("checkTwo").checked){
             num+=2;
        }
        if(document.getElementById("checkThree").checked){
             num+=3;
        }
        if(document.getElementById("checkFour").checked){
             num+=4;
        }

     window.open("/notice/add?flowId="+flowId+"&type=todo&prcsId="+prcsId+"&flowStep="+flowStep+"&runId="+runId+"&num="+num)

    })




    $('#print').click(function () {
        var widths=$('#a2 table').width();
        $('#a2 table').css('width','100%')
        $("#client").jqprint();
        $('#a2 table').css('width',widths)
    });

    $('#title input[type=checkbox]').click(function () {
        if($(this).is(':checked')){
            if($(this).attr('data-id')==1){
                $('#a2').show()

            }else if($(this).attr('data-id')==2){
                $('.theAttachment').show()

            }else if($(this).attr('data-id')==3){
                $('.steptextcheck').show()

            }else if($(this).attr('data-id')==4){
                $('.steptextliucheng').show()

            }

        }else {
            if($(this).attr('data-id')==1){
                $('#a2').hide()
            }else if($(this).attr('data-id')==2){
                $('.theAttachment').hide()
            }else if($(this).attr('data-id')==3){
                $('.steptextcheck').hide()
            }else if($(this).attr('data-id')==4){
                $('.steptextliucheng').hide()
            }
        }
    })


   





    $('#printPreView').click(function () {
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){

        });
    });

    $('#exportToWord').click(function () {
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){

        });
    });
    $('#exportToHtml').click(function () {
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){

        });
    });
    $('#closeWin').click(function () {
        window.close();
    });
</script>
</body>
</html>
<script>

    function fujian() {
        if($('.theAttachment table tbody tr').length>0){
            $('.theAttachment').show()
        }else {
            $('.theAttachment').hide()
        }
    }




    function huiqian() {
        if($('.steptextcheck table').length>0){
            $('.theAttachment').show()
        }else {
            $('.theAttachment').hide()
        }
    }



    function liucheng() {
        if($('.steptextliucheng table tbody tr').length>0){
            $('.steptextliucheng').show()
        }else {
            $('.steptextliucheng').hide()
        }
    }



    var isNomalType =  $.GetRequest().isNomalType;
    var tabId =  $.GetRequest().tabId;
    var tableName =  $.GetRequest().tableName;
    $(function(){
        if(isNomalType == 'false'){

            $('.officialDocument').height($(document).height()-$('.head').height())
            console.log($('.officialDocument').height())
            console.log($(document).height())
            console.log($('.head').height())


            $('.tabAB').show();
            if(tabId != ''){
                $('#zw').attr('src','../../common/ntko?tabId='+tabId+'&tableName='+tableName);
            }

            $('.tabAB ul li').click(function () {
                $(this).siblings().removeClass('active');
                $(this).addClass('active');
                if($(this).attr('data-id')==1){
                    $('#client').show();

                    $('.officialDocument').hide()
                }else {
                    $('#client').hide();
                    $('.officialDocument').show()
                }
            });
        }else{
            $('.opt').show();
            $('.step').show()
        }










        domain;
        var flowId = $.getQueryString("flowId");
        var flowStep = $.GetRequest().flowStep || '';
        var runId = $.getQueryString("runId") || '';
        var prcsId=$.GetRequest().prcsId || '';
        $('#tab_c').css('right',-($('#tab_c').width()))
        $('#tab_c').css('height',$('#tab_c').height()-$('.head').height()-$('.foot').height())
        $('#tab_c').css('top',$('.head').height())
        //引入方法
        workForm.init({
                formhtmlurl:'../../workflow/work/workfastAdd',//URL
                resdata:{
                    flowId:flowId,
                    runId:runId,
                    flowStep:flowStep,
                    prcsId:prcsId
                },
                flowStep:flowStep,//预览
                target:'.cont_form',
                preView:true},
            function (data,option) {
                //$('.num').html(titleName);
                var obj2=data.object.listFp[0];
                var prcsFlag = data.object.flowRunPrcs.prcsFlag;

                $('#flowNum').html(data.object.flowRun.runName)
                var flowtype = prcsFlag == '1' ? '<fmt:message code="lang.th.will" />':(prcsFlag == '2' ?'<fmt:message code="lang.th.Process" />':(prcsFlag == '3'?'<fmt:message code="lang.th.Forwarded" />':'<fmt:message code="lang.th.HaveThrough" />'))
//                $('#flowtype').text(flowtype);
            });



        $.post('/flowProcess/getFlowAttachment',{'runId':$.GetRequest().runId},function (json) {
            if(json.flag){
                var str='';
                for(var i=0;i<json.obj.length;i++){
                    str+='<tr class="/download?'+json.obj[i].attUrl+'"><td class="fileDownload" align="center">'+json.obj[i].attachName+'</td><td align="center">11</td><td align="center">sss</td></tr>'
                }
                $('.tr_tds tbody').html(str)
                console.log(str)
                fujian()
            }
        },'json')



        $.post('/flowProcess/getFlowFeedBack',{'runId':$.GetRequest().runId},function (json) {
            if(json.flag){

                var arr=json.obj;
                var str='';
                for(var i=0;i<arr.length;i++){
                    str+=' <tr style="background: #fff;margin-top: 10px;">\
                        <td width="70%"><p style="font-weight: bold"><fmt:message code="workflow.th.First" />'+arr[i].prcsId+'<fmt:message code="workflow.th.step" />'+arr[i].prcsName+' '+arr[i].userName+'：</p> <p style="margin: 10px;">'+arr[i].content+'</p></td>\
                        <td width="30%" align="right">'+arr[i].editTime+'</td>\
                    </tr>'
                }

                $('.steptextcheck table tbody').html(str)
                console.log(str)
                huiqian()
            }
        },'json')




        $.get('/flowProcess/getFlowRunPrecsAll',{
            'runId':$.GetRequest().runId
        },function (json) {
            if(json.flag){
                var designdata=json.datas;
                var str='';
                for(var i=0;i<designdata.length;i++){
                    str+='<tr style="border-right: 1px solid #ddd">' +
                        '<td width="30%" align="center"><fmt:message code="workflow.th.First" />'+(i+1)+'<fmt:message code="workflow.th.step" /></td>' +
                        '<td width="35%" align="center"><img src="/img/arrow_down.gif" alt=""><fmt:message code="workflow.th.Serial" />'+(i+1)+'：'+designdata[i].prcsName+'</td>' +
                        '<td width="35%" align="center"><img src="/img/workflow.gif" alt=""><a style=" color: red;text-decoration:underline" href="javascript:void(0)">' +
                        ''+designdata[i].userName +'&nbsp'+function () {
                            if (designdata[i].opFlag == 0) {
                                return '<fmt:message code="workflow.th.HandledBy" />'
                            } else if (designdata[i].opFlag == 1) {
                                return '<fmt:message code="workflow.th.host" />'
                            }
                        }()+'</a><span style="color: #00aa00;margin-left: 5px;">('+function () {
                            if (designdata[i].prcsFlag == 1) {
                                return '<fmt:message code="sup.th.NotReceived" />'
                            } else if (designdata[i].prcsFlag == 2) {
                                return '<fmt:message code="lang.th.Process" />'+designdata[i].handleTime
                            } else if (designdata[i].prcsFlag == 3) {
                                var handleTimes;
                                if(designdata[i].handleTime==undefined){
                                    handleTimes=''
                                }else {
                                    handleTimes=designdata[i].handleTime
                                }
                                return '<fmt:message code="workflow.th.ForwardToTheNextStep" />' + handleTimes
                            } else if (designdata[i].prcsFlag == 4) {
                                return '<fmt:message code="lang.th.HaveThrough" />'+designdata[i].handleTime
                            } else if (designdata[i].prcsFlag == 5) {
                                return '<fmt:message code="workflow.th.FreeFlowPresettingSteps" />'
                            } else if (designdata[i].prcsFlag == 6) {
                                return '<fmt:message code="workflow.th.HasBeenSuspended" />'
                            }
                        }()+')</span><p><fmt:message code="workflow.th.StartedOn" />: ' + designdata[i].createTime + '</p>' +
                        '<p><fmt:message code="workflow.th.EndTo" />: ' + designdata[i].deliverTime + '</p></td>' +
                        '</tr>'
                }
                $('.trtd_d tbody').html(str)
                console.log(str)
                liucheng()

            }
        },'json')


    });
</script>
<script>
    //控制高度
    autodivheight();
    function autodivheight(){
        var winHeight=0;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        if (document.documentElement && document.documentElement.clientHeight)
            winHeight = document.documentElement.clientHeight;
        winWidth = document.documentElement.clientWidth;
        document.getElementById("client").style.height= winHeight - 95 +"px";
        document.getElementById("client").style.width= winWidth  +"px";

    }
    window.onresize=autodivheight;

    $(document).delegate('.fileDownload','click',function () {
        window.open($(this).parent().prop('class'))
    })

</script>




