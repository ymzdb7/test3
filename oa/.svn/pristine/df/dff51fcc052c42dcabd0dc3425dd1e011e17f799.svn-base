<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2017/5/23
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html xmlns:v="urn:schemas-microsoft-com:vml">
<!DOCTYPE html>
<head>
    <title><fmt:message code="workflow.th.designer" /></title><%--流程设计器--%>
    <?import namespace="v" implementation="#default#VML" ?>
    <link rel="stylesheet" type="text/css" href="../../lib/GooFlow/GooFlow.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/flowtype/default.css"/>
    <link rel="stylesheet" href="../../css/workflow/flowsetting/processDesignTool.css">
    <%--<link rel="stylesheet" type="text/css" href="../../lib/layer/mobile/need/layer.css" media="all"/>--%>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <script>
        var changeTheValue=true;
        var newlinebool=false;
        function GetRequest() {
            var url = location.search; //获取url中"?"符后的字串
            var theRequest = new Object();
            if (url.indexOf("?") != -1) {
                var str = url.substr(1);
                strs = str.split("&");
                for(var i = 0; i < strs.length; i ++) {
                    theRequest[strs[i].split("=")[0]]=(strs[i].split("=")[1]);
                }
            }
            return theRequest;
        }
    </script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script type="text/javascript" src="../../lib/GooFlow/GooFunc.js"></script>
    <script type="text/javascript" src="../../lib/GooFlow/GooFlow.js"></script>

    <!-- <script type="text/javascript" src="../../js/workflow/json2.js"></script> -->
    <script src="/js/workflow/work/workform.js"></script>
    <script src="/js/workflow/flowtype/processDesignToolsT.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>

    <style>
        .myForm {
            display: block;
            margin: 0px;
            padding: 0px;
            line-height: 1.5;
            border: #ccc 1px solid;
            font: 12px Arial, Helvetica, sans-serif;
            margin: 5px 5px 0px 0px;
            border-radius: 4px;
        }

        .myForm .form_title {
            background: #428bca;
            padding: 4px;
            color: #fff;
            border-radius: 3px 3px 0px 0px;
        }

        .myForm .form_content {
            padding: 4px;
            background: #fff;
        }

        .myForm .form_content table {
            border: 0px
        }

        .myForm .form_content table td {
            border: 0px
        }

        .myForm .form_content table .th {
            text-align: right;
            font-weight: bold
        }

        .myForm .form_btn_div {
            text-align: center;
            border-top: #ccc 1px solid;
            background: #f5f5f5;
            padding: 4px;
            border-radius: 0px 0px 3px 3px;
        }
        .flowTitle{
            position: fixed;
            width:100%;
            height:50px;
            background: #D6E4EF ;
            top:0;
        }
        .flowTitle ul li{
            float: left;
            height: 28px;
            line-height: 28px;
            width:100px;
            color: #4889f0;
            cursor: pointer;
            text-align: center;
            border-right:1px solid #4889f0;
        }
        .flowTitle ul li.active{
            color: #fff;
            background: #4889f0;
        }
        .flowTitle ul{
            margin-top:10px;
            width: 302px;
            height: 28px;
            border: 1px solid #4889f0;
            border-radius: 5px;
            margin-left:15px;
        }
        .clearfix:after{
            clear: both;
            display: block;
            content: '';
        }
        .explanation {
            position: fixed;
            left: 31px;
            top: 58px;
            background-color: white;
            border: 2px solid #ddd;
            padding: 10px 5px;
            opacity: 0.9;
            z-index: 5000;
            -moz-border-radius: 5px;
            border-radius: 5px;
            filter: alpha(opacity=80);
            box-shadow: 2px 2px 19px #aaa;
            -o-box-shadow: 2px 2px 19px #aaa;
            -webkit-box-shadow: 2px 2px 19px #aaa;
            -moz-box-shadow: 2px 2px 19px #aaa;
        }
        .big3 {
            font-size: 12pt;
            COLOR: #124164;
            FONT-WEIGHT: bold;
        }
        .flowTitle ul{
            width: 201px;
        }
        .position {
            cursor: pointer;
            position: absolute;
            right: 14px;
            top: 14px;
            clear: both;
        }
        .cont_cone li {
            width: 90%;
            height: 56px;
            margin: 10px auto;
            border: 1px solid #cccccc;
            border-radius: 3px;
            background: #fff;
        }
        .fujian_logo {
            margin-top: 14px;
            width: 15px;
        }
        .fujian_logo, .fujian_h1 {
            float: left;
        }
        .fujian_h1 {
            margin-left: 8px;
            font-size: 12pt;
            margin-top: 3px;
        }
    </style>
</head>
<body>
<div class="bodys">
    <div class="flowTitle">
        <ul class="clearfix">
            <li class="liActive active" data-num="1" data-allid="1"><fmt:message code="workflow.th.designer" /></li><%--流程设计器--%>
            <li class="liActive" data-num="2" data-allid="2" style="border-right: none"><fmt:message code="workflow.th.listview" /></li><%--列表视图--%>
            <%--<li class="liActive" data-num="3">流程日志</li>--%>
        </ul>
    </div>

    <div class="srcCla" id="flowDesignTable" style="margin-top: 50px;display: none;    height: 100%;">

    </div>

    <div class="position backbtn"><img src="../../img/workflow/work/add_work/back.png"></div>
    <div class="srcCla" id="flowDesignTableTwo" style="margin-top: 50px;display: none">
        <table width="90%" style="margin: 15px auto;" class="tr_td trtd_d">
            <thead class="TableHeader">
            <tr >
                <th  nowrap="" class="th" colspan="3" align="center"><fmt:message code="workflow.th.TheProcessBegins" /></th><%--流程开始--%>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>


<script>
    var getType=GetRequest();
    if(getType.type==0){
        $('.liActive').removeClass('active')
       $('[data-allid="1"]').addClass('active')
        $('#flowDesignTable').show()
        $('#flowDesignTableTwo').hide()

    }else if(getType.type==1){
        $('.liActive').removeClass('active')
        $('[data-allid="2"]').addClass('active')
        $('#flowDesignTable').hide()
        $('#flowDesignTableTwo').show()
    }else if(getType.type==2){
//        $('.liActive').removeClass('active')
//        $('[data-allid="2"]').addClass('active')
        $('.flowTitle').remove()
        $('#flowDesignTable').hide()
        $('#flowDesignTableTwo').show()
    }else if(getType.type==3){
        $('.flowTitle').remove()
        $('#flowDesignTable').show()
        $('#flowDesignTableTwo').hide()
        $('#flowDesignTable').css('margin-top','0px')
    }

    $('.liActive').click(function () {
        $(this).siblings().removeClass('active')
        $(this).addClass('active')
        if($(this).attr('data-num')==1){
            $('#flowDesignTable').show()
            $('#flowDesignTableTwo').hide()
        }else {
            $('#flowDesignTable').hide()
            $('#flowDesignTableTwo').show()
        }
    })
    $(function(){
        $('.position').click(function(){
            window.parent.$('.position').click();
        })
    })
</script>
</body>

</html>
