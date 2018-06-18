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
    <title></title>
    <link rel="stylesheet" href="../../css/workflow/work/m/style.css">

    <style>
        #basic_infor .table .td1{width: 130px;}
        #basic_infor .table .td1 div{min-height: 36px;}
        body{
            font-size: 14px;
        }
        .main2{background: #efefef;margin-top: 0px;}
        .file {
            position: relative;
            display: inline-block;
            background: #007df8;
            border: 1px solid #007df8;
            border-radius: 2px;
            padding: 0px 6px;
            overflow: hidden;
            color: #fff;
            text-decoration: none;
            text-indent: 0;
            line-height: 20px;
        }
        .uploadbox p{margin-bottom: 5px;color: #095de0;}
        #basic_infor .table .td1{width: 160px;}
        .done {
            height: auto;
            border-bottom: none;
            margin-bottom: 15px;
        }
        .type_done{border: none;background-color: #3984ff;padding: 13px 35px;font-size: 16px;margin-top: 20px;font-weight: bold}

    </style>
</head>
<body style="display: none">
<div class="head_top">
    <span  class="head_toptitle" style="color: #007cfd;font-style: italic;font-size: 15px;font-weight: 900;"><fmt:message code="workflow.th.liushui" />：<span id="flowRunId"></span></span>
    <ul>
        <li><span class="head_toptitle weight" id="flowName"><fmt:message code="workflow.th.processname" />：</span></li>
        <li><span class="head_toptitle weight" ><fmt:message code="workflow.th.ProcessInitiator" />：</span><span id="flowBeginUser" class="head_toptitle" style="font-weight: 600;    margin-left: 2px;"></span></li>
        <li><span class="head_toptitle weight" ><fmt:message code="workflow.th.ProcessInitiation" />：</span><span id="flowBeginTime" class="head_toptitle" style="font-weight: 600;    margin-left: 2px;"></span></li>
    </ul>
</div>
<div id="basic_infor">
    <div class="basic_infor_title">
        <img src="../../img/workflow/m/gapp_icon_no.png" alt="" class="icon">
        <div class="basic_infor"><fmt:message code="url.th.EssentialInformation" /></div>
        <div class="basic_infor_title_link">
            <a href="#"></a>
        </div>
    </div>
    <div class="table">
        <table  id="content">
        </table>
    </div>
    <div class="done">
        <button class="type_done" id="lctbtn" style="padding: 13px 27px;margin-left: 27px;"><fmt:message code="workflow.th.chart" /></button>
    </div>
    <div class="basic_infor_title">
        <img src="../../img/workflow/m/gapp_icon_no.png" alt="" class="icon">
        <div class="basic_infor"><fmt:message code="work.th.CountersignedArea" /></div>
        <div class="basic_infor_title_link">
            <a href="#"></a>
        </div>
    </div>
    <div class="signBox">
        <textarea rows="4" class="gapp_textarea" data-key="0" style="display: none" data-field-type="020000" data-must="0" data-is-write="1" name="COL101214452217682884218739" placeholder=""></textarea>
        <div class="hqbox" style="min-height: 40px;"></div>
    </div>
    <div class="basic_infor_title">
        <img src="../../img/workflow/m/gapp_icon_no.png" alt="" class="icon">
        <div class="basic_infor"><fmt:message code="email.th.file" /></div>
        <div class="basic_infor_title_link">
            <a href="#"></a>
        </div>
    </div>
    <div >
        <ul class="uploadbox" style="min-height: 50px;">

        </ul>
    </div>
    <div style="width: 100%;height: 24px;" class="choose_box">

    </div>
    <div class="photo_box" style="padding: 5px;">

    </div>

</div>
<div class="lct" style="display: none">
    <div class="lct_title">
        <fmt:message code="workflow.th.chart" />
    </div>
    <div class="lct_body">
        <ul class="lct_info">
            <li><span class="head_toptitle weight" style="color:#0074ec;"><fmt:message code="workflow.th.SerialRegistration" /></span></li>
            <li><span class="head_toptitle weight" ><fmt:message code="workflow.th.HostedAdministrator" /></span><span class="head_toptitle" style="color: #73a282;margin-left: 2px;"><fmt:message code="workflow.th.second" /></span></li>
            <li><span class="head_toptitle weight" ><fmt:message code="workflow.th.StartedOn" />：</span><span class="head_toptitle" style="font-weight: 600;    margin-left: 2px;">2017-07-26 19:24</span></li>
        </ul>
    </div>
</div>
<script src="../../js/jquery/jquery-1.9.1.js"></script>
<script src="../../js/template.js"></script>
<script src="../../lib/laydate/laydate.js"></script>
<script src="../../js/mustache.min.js"></script>
<script src="../../js/base/base.js"></script>
<script src="../../js/workflow/work/workform.js"></script>
<script src="../../js/workflow/work/m/workformh5PreView.js"></script>
<script src="../../lib/jquery.form.min.js" ></script>
<script src="../../js/jquery/jquery.cookie.js"></script>
<link rel="stylesheet" href="../../lib/kinggrid/dialog/artDialog/ui-dialog.css">
<link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.css">

<script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.min.js"></script>
<script type="text/javascript" src="../../lib/kinggrid/core/kinggrid.plus.min.js"></script>
<script type="text/javascript" src="../../lib/kinggrid/dialog/artDialog/dialog.js"></script>

<!-- html签章核心JS -->
<script type="text/javascript" src="../../lib/kinggrid/signature.min.js"></script>
<!-- PC端附加功能 -->
<script type="text/javascript" src="../../lib/kinggrid/signature.pc.min.js"></script>
<!-- 移动端端附加功能 -->
<link rel="stylesheet" href="../../lib/kinggrid/core/kinggrid.plus.mobile.css">
<script type="text/javascript" src="../../lib/kinggrid/signature.mobile.min.js"></script>
<script>
    function ready(){
        //alert(1111);
    }

    $(function () {
        //imgadd('/xs?AID=5124&MODULE=workflow&COMPANY=xoa1001&YM=1708&ATTACHMENT_ID=407195972&ATTACHMENT_NAME=1503645688962.jpg,/xs?AID=5124&MODULE=workflow&COMPANY=xoa1001&YM=1708&ATTACHMENT_ID=407195972&ATTACHMENT_NAME=1503645688962.jpg,','1503645688962.jpg,1503645688962.jpg','1');
        function auto() {
            var width = $('#word').width() / 2;
            $('#word .table td').css('width', '' + width + '');
            var width1 = width - 62;
            $('#word .action').css('width', '' + width1 + '');
        }

        function dateclick(e) {
            laydate({
                elem: '#' + $(e).attr('target'),
                format: 'YYYY-MM-DD hh:mm:ss'
            });
        }

        function uploadimg(data) {
            $('#picture').val(data);
            $('#picture').attr('value', data);
        }

        $('#fileUpload').change(function () {
            var e = this;
            $('#uploadForm').ajaxSubmit({
                dataType:'json',
                success:function (res) {
                    if(res.msg == 'OK'){
                        if( res.obj[0].isImage ==0){
                            readURL(e);
                        }else{
                            url = res.obj[0].attUrl;
                            console.log(url);
                            var str = '<li><a href="#"><span>'+ res.obj[0].attachName+'</span></a></li>';
                            $('.uploadbox').append(str);
                        }
                    }

                }
            })
            function readURL(input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();
                    reader.onload = function (e) {

                        var img = '<img id="blah" src="'+e.target.result+'" alt="<fmt:message code="workflow.th.DisplayUploaded" />" style="width:50px;height:50px;">';
                        $('.photo_box').append(img);
                    }

                    reader.readAsDataURL(input.files[0]);

                }
            }
        });
    });
</script>
</body>
</html>