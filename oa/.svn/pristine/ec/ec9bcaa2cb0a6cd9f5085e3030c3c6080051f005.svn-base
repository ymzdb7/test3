<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
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
    <title><fmt:message code="main.personmanage" /></title>
    <link rel="stylesheet" href="/css/meeting/setLeader.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <%--<link rel="stylesheet" href="/css/base.css">--%>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body style="font-family: 微软雅黑;">
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/vihicleOperator.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="main.personmanage" />
    </div>
</div>
<div class="main">
    <div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 50px;">
        <table>
            <tr>
                <td style="text-align: center; font-family:微软雅黑;font-size: 15px;"><fmt:message code="meet.th.AddPersonnel" /></td>
            </tr>
            <tr>
                <td>
                    <div>
                        <textarea name="txt" id="operator" user_id="" value="" disabled="" style="margin-left: 30px;"></textarea>
                        <span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectEduUser" class="Add "><fmt:message code="global.lang.add" /></a></span>
                        <span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearEduUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span>
                    </div>
                </td>
            </tr>
            <tr>
                <td style="text-align: center">
                    <div class="btnSure">
                        <span style="margin-left: 22px;" id="okbtn"><fmt:message code="global.lang.ok" /></span>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
</div>

<script>
    var user_id='';
    $(function () {
        $.ajax({
            url: "<%=basePath%>/syspara/getOperator",
            type: "get",
            data: {
                paraName: "OPERATOR_NAME"
            },
            dataType: 'json',
            success: function (obj) {
                $('#operator').attr('user_id',obj.object.userId);
           $('#operator').html(obj.object.userName);
            }
        });

        $("#selectEduUser").on("click",function(){//选人员控件
            user_id='operator';
            $.popWindow("../../common/selectUser");
        });
        $('#clearEduUser').click(function(){ //清空人员
            $('#operator').attr('user_id','');
            $('#operator').attr('dataid','');
            $('#operator').val('');
        });
    })
    $('#okbtn').click(function(){
        var data={
           usersIds:$('#operator').attr("user_id")
        }
   $.ajax({
       url: "<%=basePath%>/syspara/editOperator",
       type: 'get',
       dataType: "JSON",
       data: data,
       success:function (data){
           if(data.flag==true){
               layer.msg('<fmt:message code="diary.th.modify" />', {icon: 1});
           }else{
               layer.msg('<fmt:message code="meet.th.SaveFailed" />', {icon: 6});
           }
       }
    })
    });
</script>
</body>
</html>
