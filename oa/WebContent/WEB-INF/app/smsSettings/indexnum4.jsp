
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>被提醒权限</title>

    <style>
        .news{
            cursor: pointer;
        }
    </style>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <link rel="stylesheet" type="text/css" href="../css/base.css">
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/lib/laydate/laydate.js"></script>
    <script type="text/javascript" src="../../lib/layui-v1.0.9_rls/layui/layui.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script type="text/javascript" src="/lib/jquery.form.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

    <style>

        .sendsave senduser{
            height: 30px;
            line-height:30px;
            width: auto;
            padding: 0 20px;
        }
        .btnSure{
            background-image: url(../../img/confirm.png);
            width: 70px;
            height: 28px;
            margin: 2px auto;
            line-height: 28px;
            cursor: pointer;
            position: absolute;
            left:40%;
            bottom: 47%
        }

        table{
            width: 70%;
            margin:0 auto;
           margin-top:25px;
        }
        .divtable{
            position: relative
        }


    </style>
</head>
<body style="background: #fff">

<div class="maintop clearfix" style="">
    <p style="margin-left: 5px">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/wangguan.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
        <label>被提醒权限</label><%--内部接口配置--%>
    </p>

<%--<a  class="newsBtn newsBtntwo btnTheme " id="newBtn1" style="float: right;margin-right: 3%;margin-top: 5px;" href="javascript:void (0)" data-num="0"><img src="../../img/mywork/newbuildworjk.png" alt="" style="margin:-3px 0px 0px -8px;"><fmt:message code="global.lang.new" /></a>&lt;%&ndash;新建&ndash;%&gt;--%>
</div>

<div class="divtable">
    <table class="tr_td">
        <thead>
        <tr>
            <th style="width:30%;height: 35px; font-size: 15px; color: #2F5C8F"><fmt:message code="workflow.th.name" /></th>
            <th style="width:65%;height: 3px;font-size: 15px; color: #2F5C8F"><fmt:message code="notice.th.content" /></th>
        </tr>
        </thead>
        <tbody>


        <tr>
            <td>
                <fmt:message code="netdisk.th.Scope(personnel)" />
            </td>
            <td >
                <textarea name="txt" id="remindPriv" user_id=""  class="sendsave senduser" disabled rows="3" cols="50"></textarea>
                <a style="margin-left: 10px;cursor: pointer" id="adduesr"><fmt:message code="global.lang.add" /></a>
              <a style="margin-left: 10px;cursor: pointer" id="del_user"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>

                <div class="btnSure" style=" left: 45%; bottom: -50%;" >
                    <span style="margin-left: 32px;" id="okbtn"><fmt:message code="global.lang.ok" /></span>
                </div>

        </tbody>
    </table>
</div>
</div>
</body>
<script type="text/javascript">

    //获取权限信息
    $(function () {

        $('#del_user').click(function(){ //清空人员
            $('#remindPriv').attr('user_id','');

            $('#remindPriv').val('');
        });

        $.ajax({
            url: '<%=basePath%>sms2Priv/selectRemindPriv',
            dataType: 'json',
            success: function (data) {
                var str = '';
                for (var i = 0; i < data.obj.length;i++){
                    str+=data.obj[i].userName+",";

                    $('#remindPriv').val(str);
                }
            }
        });
    })
    var user_id='';
    $(function () {
        $("#adduesr").click(function () {
            user_id = 'remindPriv';
            $.popWindow("../common/selectUser");
        });

        $("#okbtn").click(function () {
            $.ajax({
                type:'get',
                url: '<%=basePath%>sms2Priv/upRemindPriv',
                dataType: 'json',
                data:{
                    remindPriv:$('[id="remindPriv"]').val()
                },
                success: function (data) {
                    if (data.flag) {
                        layer.msg('<fmt:message code="netdisk.th.Success" />!', {icon: 6});

                    }
                }
            });

        });
    })

</script>
</html>
