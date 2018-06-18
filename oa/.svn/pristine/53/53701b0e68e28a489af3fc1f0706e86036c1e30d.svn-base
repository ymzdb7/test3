<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/26
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
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
    <title><fmt:message code="main.query"/></title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" type="text/css" href="/css/base/base.css" />
    <%--<script>

        function getCookie(name)
        {
            var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
            if(arr=document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }
        var oHead = document.getElementsByTagName('HEAD').item(0);
        var oScript= document.createElement("script");
        var type = getCookie("language");
        oScript.type = "text/javascript";

        if(type){
            oScript.src="/js/Internationalization/"+type+".js";
        }else{
            oScript.src="/js/Internationalization/zh_CN.js";
        }
        oHead.appendChild( oScript);

    </script>--%>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script type="text/javascript" src="/js/base/tablePage.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        .head{
            margin-top: 10px;
            height: 33px;
        }
        .head .title{
            margin-left: 22px;
        }
        .head span{
            float: none;
            margin-top: 9px;
            font-size: 22px;
            color: #333;
        }
        label select{
            width: 130px;
        }
        .fl input{
            width: 130px;
        }
        #export{
            margin-left: 10px;
            border: 1px solid #46b8da;
            color: #ffffff;
            background-color: #5bc0de;
            cursor: pointer;
            background-image: linear-gradient(to bottom, #5bc0de, #5bc0de);
            height: 28px;
            border-radius: 10%;
        }
        #end{
            background: #00a0e9;
            margin-left: 10px;
            padding: 5px 10px;
            border-radius: 4px;
            color: #fff;
            cursor: pointer;
        }

    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<script>
    $(function(){
        $('#displayBtn').click(function () {
            if($('#more_div').css("display")=="none"){
                $('#more_div').css("display","block");
                $("#displayBtn").text("<fmt:message code="main.th.Stop"/>");
            }else {
                $('#more_div').css("display","none");
                $('#more_div').css("height","0px");
                $("#displayBtn").text("<fmt:message code="email.th.more"/>");
            }
        })
    });
</script>

<body>
<div class="head">
    <div class="title">
    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/flow_run_title.png"><span style=""><fmt:message code="main.query"/></span>
    </div>
</div>
<div style="margin: 0 auto;width: 97%; ">
    <div style="margin: 0 auto; height:60px;width: 100%;">
        <%--流程类型--%>
        <label class="fl" style="margin-top: 16px;margin-left: 4px;">
            <span class="fl" style="margin-top: 5px;"><fmt:message code="workflow.th.processname"/>：</span>
            <select name="dispatchType" id="">
                <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
            </select>
        </label>
        <%--流水号--%>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="workflow.th.liushui"/>：</span>
            <label class="fl"><input  name="runId" placeholder="<fmt:message code="workflow.th.liushui"/>"  type="text" onblur="onblus(this.value);"/></label>
        </label>
        <%--工作名称/文号--%>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="workflow.th.job"/>：</span>
            <label class="fl"><input name="runName" placeholder="<fmt:message code="workflow.th.job"/>"  type="text"></label>
        </label>
        <%-- 范围--%>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 4px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="diary.th.Range"/>：</span>
            <label class="fl">
                <select name="status" id="status">
                    <option value=""><fmt:message code="work.th.AllRange"/></option>
                    <option value="1"><fmt:message code="workflow.th.IStarted"/></option>
                    <option value="2"><fmt:message code="workflow.th.IDidIt"/></option>
               <%--     <option value="3"><fmt:message code="workflow.th.IManageIt"/></option>--%>
                   <%-- <option value="4"><fmt:message code="work.th.MyConcern"/></option>--%>
                    <option value="5"><fmt:message code="work.th.DesignatedSponsor"/></option>
                    <option value="6"><fmt:message code="work.th.DesignatedController"/></option>
                    <option value="7"><fmt:message code="adding.th.look"/></option>
                </select>
                <input  name="userId" type="text" readonly id="userId" user_Id="" style="display: none"/>
                <a href="javascript:;" id="addUser" style="display: none"><fmt:message code="global.lang.add"/></a>
                <a href="javascript:;" id="clearUser" style="display: none"><fmt:message code="global.lang.empty"/></a>
            </label>
        </label>

        <div class="fl clearfix" style="margin-top: 16px;margin-left: 10px;margin-bottom: 10px;" >
            <button  type="button" class="Query fl queryBtn"><fmt:message code="global.lang.query"/></button>
            <button type="button1"  class="Query fl" id="displayBtn" ><fmt:message code="email.th.more"/></button>
            <button type="button"  class="export fl" id="export" >
                <img src="../../img/mywork/dclist.png" style="margin-right: 2px;margin-left:5px;margin-bottom: 1px;">
               <span style="margin-right: 5px;"><fmt:message code="global.lang.report"/></span>
            </button>
            <button type="button"  class="end fl" id="end" ><fmt:message code="adding.th.Coercion"/></button>
        </div>
      <%--  <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <label class="fl"> <button type="button2"  class="Query fl" id="butn2" >高级查询</button></label>
        </label>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <label class="fl"> <button type="button3"  class="Query fl" id="butn3" >归档查询</button></label>
        </label>--%>

    </div>
    <div id="more_div" style="padding-bottom: 43px;display: none" >
        <%--流程发起日期--%>
        <label class="fl clearfix" style="margin-left: 4px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="adding.th.launch"/>：</span>
            <label class="fl">
                <input  name="beginDate" placeholder="<fmt:message code="sup.th.startTime"/>"  type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                <fmt:message code="global.lang.to"/>
                <input  name="endDate" placeholder="<fmt:message code="meet.th.EndTime"/>"  type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
            </label>
        </label>


        <%--状态--%>
        <label class="fl clearfix" style="margin-left: 4px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="notice.th.state"/>：</span>
            <label class="fl"><select name="status1">
                <option value=""><fmt:message code="work.th.AllStates"/></option>
                <option value="1"><fmt:message code="work.th.Executing"/></option>
                <option value="4"><fmt:message code="work.th.ItOver."/></option>
                <%--<option value="3"><fmt:message code="work.th.Archived"/></option>--%>
            </select></label>
       </label>
        <%--优先级--%>
        <label class="fl clearfix" style="margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="work.th.priority"/>：</span>
            <label class="fl"><select name="status2">
                <option value=""><fmt:message code="notice.th.all"/></option>
                <option value="2"><fmt:message code="sup.th.urgent"/></option>
                <option value="0"><fmt:message code="sup.th.ordinary"/></option>
            </select></label>
        </label>
      </div>
</div>
<div id="pagediv">

</div>
    <%--<div>
    <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
        <label class="fl"> <button type="button3"  class="Query fl" >导出工作列表</button></label>
    </label>
    <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
        <label class="fl"> <button type="button3"  class="Query fl"  >管理人员删除</button></label>
    </label>
    <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
        <label class="fl"> <button type="button3"  class="Query fl"  >强制结束</button></label>
    </label>
    </div>--%>


  <%--  <div class="pagediv" style="margin: 0 auto;width: 97%">
        <table>
            <thead>
                <tr>
                    <th><fmt:message code="workflow.th.liushui"/></th>
                    <th><fmt:message code="workflow.th.flowtype"/></th>
                    <th><fmt:message code="work.th.JobNumber"/></th>
                    <th>流程发起人</th>
                    <th><fmt:message code="sup.th.startTime"/></th>
                    <th><fmt:message code="workflow.th.PublicAccessories"/></th>
                    <th><fmt:message code="notice.th.state"/></th>
                    <th><fmt:message code="notice.th.operation"/></th>
                </tr>
            </thead>
            <tbody>

        </tbody>
        </table>
    </div>--%>

    <%--<div id="dbgz_page" class="M-box3 fr">

    </div>
--%>
</body>
<script>

    function onblus(x) {
        // 清除两边的空格
        String.prototype.trim = function() {
            return this.replace(/(^\s*)|(\s*$)/g, '');
        };
        var inputStr = x;//用于存放输入的字符串
        if(!inputStr || !inputStr.trim() || isNaN(inputStr)){
            //输入的不是数字
            <%--alert("<fmt:message code="doc.th.number"/>");--%>
        }

    }
    $("#addUser").on("click",function(){
        user_id='userId';
        $.popWindow("../common/selectUser?0");
    });
    $("#clearUser").on("click",function(){
        $("#userId").val("");
        $("#userId").attr('user_id','');
    })
    
    $("#status").change(function () {
        var str=this.value;
        if(str==5 || str==6){
            $('#userId').css("display","inline-block");
            $('#addUser').css("display","inline-block");
            $('#clearUser').css("display","inline-block");
        }else{
            $('#userId').css("display","none");
            $('#addUser').css("display","none");
            $('#clearUser').css("display","none");
        }
    })

    $(function () {
        $.ajax({
            url:"/flow/selAllType",
            type:'post',
            dataType:'json',
            success:function(res){
                var data=res.obj;
                var str='<option value=""><fmt:message code="hr.th.PleaseSelect"/></option>';
                if(res.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<option value="'+data[i].flowId+'">'+data[i].flowName+'</option>';
                    }
                }
                $('[name="dispatchType"]').html(str);
            }
        })
    })
</script>
<script src="/js/workflow/flowRun/flowRun.js"></script>

</html>
