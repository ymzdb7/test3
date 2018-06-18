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
<!DOCTYPE html>
<html xmlns:v="urn:schemas-microsoft-com:vml">
<head>
    <title></title><%--流程设计器--%>
    <?import namespace="v" implementation="#default#VML" ?>
    <link rel="stylesheet" type="text/css" href="../../lib/GooFlow/GooFlow.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/flowtype/default.css"/>
    <link rel="stylesheet" href="../../css/workflow/flowsetting/processDesignTool.css">
    <%--<link rel="stylesheet" type="text/css" href="../../lib/layer/mobile/need/layer.css" media="all"/>--%>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <script>
        var changeTheValue=true;
        var newlinebool=false;
    </script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script type="text/javascript" src="../../lib/GooFlow/GooFunc.js"></script>
    <script type="text/javascript" src="../../lib/GooFlow/GooFlow.js"></script>

    <!-- <script type="text/javascript" src="../../js/workflow/json2.js"></script> -->
    <script src="/js/workflow/work/workform.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script>
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
        if(parent.opener.eventas!=undefined&&parent.opener.eventas!=null) {
            if(GetRequest().type=='banli'){
                document.title =parent.opener.eventas.text();
            }else {
                document.title = parent.opener.eventas.parent().parent().find('.wenhao').text()
            }
        }
        $(function () {
            if(parent.opener.eventas!=undefined&&parent.opener.eventas!=null) {
                if (GetRequest().type == 'banli') {
                    var $title = parent.opener.eventas.text();
                } else {
                    var $title = parent.opener.eventas.parent().parent().find('.wenhao').text()
                }
                $('.flowTitle p').html($title)
            }
        })
    </script>

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
            height:108px;
            background: #f6f6f6 ;
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
            margin-top:15px;
            width: 302px;
            height: 28px;
            border: 1px solid #4889f0;
            border-radius: 5px;
            margin-left:15px;
            background: #fff;
        }
        .clearfix:after{
            clear: both;
            display: block;
            content: '';
        }
        .explanation {
            position: fixed;
            right: 12px;
            top: 54px;
            background-color: white;
            border: 1px solid #ddd;
            padding: 1px 5px;
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
    </style>
</head>
<body>

<div class="flowTitle">
    <p style="padding-left: 18px;height: 40px;line-height: 40px;    font-size: 20px;
    font-weight: bold;
    letter-spacing: 1px;"></p>
    <ul class="clearfix">
        <li class="liActive active" data-num="2"><fmt:message code="workflow.th.listview" /></li><%--列表视图--%>

        <li class="liActive " data-num="1"><fmt:message code="workflow.th.GraphicView" /></li><%--图形视图--%>
        <%--<li class="liActive" data-num="3">流程日志</li>--%>
        <li class="liActive" data-num="4" style="border: none;"><fmt:message code="workflow.th.designer" /></li><%--流程设计器--%>
    </ul>
</div>



<div class="explanation" style="display: none">
   <span class="big3"><img src="/img/workflow.gif" align="absmiddle" style="width: 14px;
    height: 16px;margin-right: 10px;
    vertical-align: middle;"><label style="    font-size: 15px;
    vertical-align: middle;"></label> </span>
    <div class="explanationMain">
        <fmt:message code="workflow.th.ColorIdentificationInstructions" />：<label><%--颜色标识说明--%>

    </label>
    </div>
</div>








<div class="srcCla" style="margin-top: 100px;">
    <iframe src="" frameborder="0" style="width: 100%;height: 100%;"></iframe>
    <%--controlpanel/index--%>

</div>
<script>
    $(function(){
        var heights =(document.documentElement.clientHeight || document.body.clientHeight) - 105;
        $('.srcCla').height(heights);
    })
</script>
<script>

  function numOneHtml(){/*未接收  办理中  办理完毕*/
      $('.explanationMain').find('label').html(' <span style="color:#FFBC18;">■</span><fmt:message code="lang.th.will" />               &nbsp;&nbsp;\
                            <span style="color:#50C625;">■</span> <fmt:message code="lang.th.Process" />                  &nbsp;&nbsp;\
                    <span style="color:#F4A8BD;">■</span>   <fmt:message code="workflow.th.FinishedProcessing" />                &nbsp;&nbsp;\
                    ')
  }
//    <span style="color:#7D26CD;">■</span>挂起中                &nbsp;&nbsp;\
//    <span style="color:#D7D7D7; ">■</span>预设步骤                &nbsp;&nbsp;\
//    <span style="color:#70A0DD;">■</span>子流程                &nbsp;&nbsp;注：子流程可双击步骤查看流程图&nbsp;&nbsp;


    function numTwoHtml() {/*开始节点 结束节点 普通节点*/
      $('.explanationMain').find('label').html('<span style="color:#50C625;">■</span>   <fmt:message code="workflow.th.StartNode" />              &nbsp;&nbsp;' +
          '<span style="color:#F4A8BD;">■</span>    <fmt:message code="workflow.th.EndNode" />             &nbsp;&nbsp;' +
          '<span style="color:#EEEEEE;">■</span>  <fmt:message code="workflow.th.OrdinaryNode" />               &nbsp;&nbsp;' )
//      '<span style="color:#7D26CD;">■</span>子流程节点                &nbsp;&nbsp;' +
//      '<span style="color:#FFBC18;">■</span>外部节点
  }



  function big(titles) {
      $('.big3').find('label').text(titles)
  }
  var $widths=$('.srcCla').width();
  $('.srcCla').find('iframe').attr('src','/flowSetting/processDesignToolTwoView'+location.search)


  $('.liActive').click(function () {
      $(this).siblings().removeClass('active')
      $(this).addClass('active')
      if($(this).attr('data-num')==1){
          $('.explanation').show()
          $('.srcCla').find('iframe').attr('src','/flowSetting/processDesignToolTwoO'+location.search)
      }else if($(this).attr('data-num')==4){
          $('.explanation').show()
          $('.srcCla').find('iframe').attr('src','/flowSetting/processDesignToolTwoT'+location.search+'&trueId=1')

      }else if($(this).attr('data-num')==2){
          $('.explanation').hide()
          $('.srcCla').find('iframe').attr('src','/flowSetting/processDesignToolTwoView'+location.search)
      }else {
          $('.explanation').hide()
          $('.srcCla').find('iframe').attr('src','/flowSetting/processDesignToolTwoThelog')
      }
  })
    function phonejs(e){
        $('.clearfix .liActive').eq(e).click();
    }
    if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
        //alert(navigator.userAgent);
        $('.clearfix').hide();
    } else if (/(Android)/i.test(navigator.userAgent)) {
        //alert(navigator.userAgent);
        $('.clearfix').hide();
    }
</script>

</body>
</html xmlns:v="urn:schemas-microsoft-com:vml">
