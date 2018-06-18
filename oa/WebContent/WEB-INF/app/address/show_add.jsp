<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>联系人信息</title>
    <%--<fmt:message code="global.page.first" />--%>
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta http-equiv="Content-Type" content="text/html;">
    <meta name="viewport"
          content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet" type="text/css" href="../css/address/right.css"/>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css"/>
    <script src="../js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="../js/base/base.js"></script>

    <style>
        html{
            height:100%;
        }
        .lb {
            font-size: 14px;
        }
        img[src=""],img:not([src]){opacity:0;}
    </style>
</head>
<body topmargin="5" style="OVERFLOW-Y:auto;height: 100%">
<div class="content">
    <div class="right userName" id="right userName" style="height: 100%">
        <div class="pic">
            <a class="" style="border: 0px solid #ddd;">
                <img class="img-circle" src="" style="width: 90px;height: 90px;"/>
            </a>
        </div>
        <div class="jianjie">
            <p>
                <span id="xm" title="" style="color: #333333;font-size:20px;margin-right: 12px;"></span>
                <span id="zhiwu" title="" style="color: #666666;font-size: 16px;font-weight:bold;"></span>
            </p>
            <p id="gs" title="" style="color: #999999;font-size: 14px;font-weight:bold;margin-top: 4px;"></p>
            <ul id="mail">
            </ul>
        </div>
        <div class="address" style="border-top:1px solid #f1f1f1; padding-top:12px;word-break:break-all;">
            <form>
                <div id='phoneNumber' style="width:550px; margin-bottom:20px; float:left; ">
                </div>
            </form>
        </div>
    </div>
    <div id="dept" style="display: none;padding-left:20px;">
        <h2>部门：<span class="deptName"></span></h2>
        <p>电话：<span class="tel"> </span></p>
        <p>传真：<span class="No"> </span></p>
        <p>地址：<span class="add"> </span></p>
    </div>
</div>
<script>

    $(window).resize(function(){
        $('#right').height($(window).height());
    });

    var param = $.GetRequest();
//    console.log(param)
    var SHARE_TYPE = param["SHARE_TYPE"]
    var url = "";
    //SHARE_TYPE = 2,即获取同事信息
    if(param.deptId){
        $.ajax({
            url:'/department/getDeptById',
            type:'get',
            data:{deptId:param.deptId},
            dataType:'json',
            success:function(res){
//                var data=res.object;
//                $('.deptName').html(data.deptName);
//                $('.No').html(data.faxNo);
//                $('.tel').html(data.telNo);
//                $('.add').html(data.deptAddress);
                if (res.flag) {
                    var data = res.object;
                    var icon = data["attachmentName"];

                    icon = "../img/address/department.png";

                    $(".img-circle").attr("src",icon);
                    $("#xm").attr("title",data["deptName"])
                    $("#xm").text(data["deptName"]);
//                    $("#gs").attr("title",data["deptName"]);
//                    $("#gs").text(data["deptName"]);
//                    var mailcontent = " <li style='cursor:pointer;'><img src='../img/address/A1.png' width='31' height='29' title='发送邮件' onClick='send_email("+data["email"]+");' />" +
//                        "</li><li style='cursor:pointer;'><img src='../img/address/A3.png' width='31' height='29' title='发送短信' onClick='window.open('../../../mobile_sms/new/index.php?TO_ID1="+1+"','','height=550,width=800,status=1,toolbar=no,menubar=no,location=no,scrollbars=yes,left=110,top=60,resizable=yes')' /></li>";
//                            mailcontent += "<li style='cursor:pointer;'><img src='../img/address/A4.png' width='31' height='29' title='编辑' onClick='add_edit("+data["addId"]+");' /></li>" +
//                                "<li style='cursor:pointer;'><img src='../img/address/A2.jpg' width='31' height='29' title='删除' onClick='delete_add("+data["addId"]+","+data["groupId"]+");'/></li>"
//
//                    $("#mail").html(mailcontent);
                    var phoneNumber = "";
                    if(data.telNo!="") {
                        phoneNumber += "<div style='float: left;width: 500px;'>"
                            + "<label class='lb'>电话</label>"+data.telNo+"<br>"
                            + "</div>"
                    }
                    if(data.faxNo!="") {
                        phoneNumber += "<div style='float: left;width: 500px;'>"
                            + "<label class='lb'>传真</label>"+data.faxNo+"<br>"
                            + "</div>"
                    }
                    if(data.deptAddress!="") {
                        phoneNumber += "<div style='float: left;width: 500px;'>"
                            + "<label class='lb'>地址</label>"+data.deptAddress+"<br>"
                            + "</div>"
                    }
                    $("#phoneNumber").html(phoneNumber)
                }

            }
        })
        $.ajax({
            url:'/sys/showUnitManage',
            type:'get',
            dataType:"JSON",
            data : '',
            success:function(obj){

                var data = obj.object.unitName;
//                $("#zhiwu").attr("title",data["userPrivName"]);
//                $("#zhiwu").text(data["userPrivName"]);
                $('#gs').text(data).attr('title',data);

            },
            error:function(e){
                console.log(e);
            }
        })

    }else{
        if (SHARE_TYPE && SHARE_TYPE == 2) {


            url = "/address/queryUserInfoById";

            var data1={"uid" : param.uid}

            $('#right').height($(window).height());
            $('#dept').css('display','none');
            // 填充联系人信息
            $.ajax({
                type: "get",
                url: url,
                data: data1,
                success: function (res) {
                    if (res.flag) {
                        var data = res.object;
                        var icon = data["attachmentName"];
                        if (icon == "") {
                            if (data["sex"] == 0) {
                                icon = "../img/address/headMan.png";
                            } else if (data["sex"] == 1) {
                                icon = "../img/address/headMan.png";
                            } else {
                                icon = "../img/address/headMan.png";
                            }
                        }else {
                            icon = "../img/address/headMan.png";
                        }
                        $(".img-circle").attr("src",icon);
                        $("#xm").attr("title",data["userName"])
                        $("#xm").text(data["userName"]);
                        $("#zhiwu").attr("title",data["userPrivName"]);
                        $("#zhiwu").text(data["userPrivName"]);
                        $("#gs").attr("title",data["deptName"]);
                        $("#gs").text(data["deptName"]);
                        var mailcontent = " <li style='cursor:pointer;'><img src='../img/address/email.png' style=' height: 20px;width: 20px;' title='发送邮件' onClick='send_email("+data["email"]+");' />" +
                            "</li><li style='cursor:pointer;'><img src='../img/address/sms.png'style=' height: 20px;width: 20px;' title='发送短信' onClick='window.open('../../../mobile_sms/new/index.php?TO_ID1="+1+"','','height=550,width=800,status=1,toolbar=no,menubar=no,location=no,scrollbars=yes,left=110,top=60,resizable=yes')' /></li>";
//                            mailcontent += "<li style='cursor:pointer;'><img src='../img/address/A4.png' width='31' height='29' title='编辑' onClick='add_edit("+data["addId"]+");' /></li>" +
//                                "<li style='cursor:pointer;'><img src='../img/address/A2.jpg' width='31' height='29' title='删除' onClick='delete_add("+data["addId"]+","+data["groupId"]+");'/></li>"

                        $("#mail").html(mailcontent);
                        var phoneNumber = "";
                        if(data["mobilNo"]!="") {
                            phoneNumber += "<div style='float: left;width: 500px;'>"
                                + "<label class='lb'>移动电话</label>"+data["mobilNo"]+"<br>"
                                + "</div>"
                        }
                        if(data["telNoDept"]!=""&& data["telNoDept"]!=null) {
                            phoneNumber += "<div style='float: left;width: 500px;'>"
                                + "<label class='lb'>办公电话</label>"+data["telNoDept"]+"<br>"
                                + "</div>"
                        }
                        if(data["email"]!="") {
                            phoneNumber += "<div style='float: left;width: 500px;'>"
                                + "<label class='lb'>邮箱</label>"+data["email"]+"<br>"
                                + "</div>"
                        }
                        $("#phoneNumber").html(phoneNumber)
                    }
                }
            })

        } else {


            url = "/address/getUserInfoById";

            $('#right').height($(window).height());
            $('#dept').css('display','none');
            // 填充联系人信息
            $.ajax({
                type: "post",
                url: url,
                data: param,
                success: function (res) {
                    if (res.status) {
                        var data = res.data;
                        var icon = data["attachmentName"];
                        if (icon == "") {
                            if (data["sex"] == 0) {
                                icon = "../img/address/headMan.png";
                            } else if (data["sex"] == 1) {
                                icon = "../img/address/headMan.png";
                            } else {
                                icon = "../img/address/headMan.png";
                            }
                        }else {
                            icon = "../img/address/headMan.png";
                        }
                        $(".img-circle").attr("src",icon);
                        $("#xm").attr("title",data["psnName"])
                        $("#xm").text(data["psnName"]);
                        $("#zhiwu").attr("title",data["ministration"]);
                        $("#zhiwu").text(data["ministration"]);
                        $("#gs").attr("title",data["deptName"]);
                        $("#gs").text(data["deptName"]);
                        var mailcontent = " <li style='cursor:pointer;margin-left: -20px;'><img src='../img/address/email.png' style=' height: 20px;width: 20px;' title='发送邮件' onClick='send_email("+data["email"]+");' />" +
                            "</li><li style='cursor:pointer;'><img src='../img/address/sms.png' style=' height: 20px;width: 20px;' title='发送短信' onClick='window.open('../../../mobile_sms/new/index.php?TO_ID1="+1+"','','height=550,width=800,status=1,toolbar=no,menubar=no,location=no,scrollbars=yes,left=110,top=60,resizable=yes')' /></li>";
                        mailcontent += "<li style='cursor:pointer;'><img src='../img/address/edit.png' style=' height: 20px;width: 20px;' title='编辑' onClick='add_edit("+data["addId"]+");' /></li>" +
                            "<li style='cursor:pointer;'><img src='../img/address/doDelete.png' style=' height: 20px;width: 20px;' title='删除' onClick='delete_add("+data["addId"]+","+data["groupId"]+");'/></li>"

                        $("#mail").html(mailcontent);
                        var phoneNumber = "";
                        if(data["mobilNo"]!="") {
                            phoneNumber += "<div style='float: left;width: 500px;'>"
                                + "<label class='lb'>移动电话</label>"+data["mobilNo"]+"<br>"
                                + "</div>"
                        }
                        if(data["telNoDept"]!=""&&data["telNoDept"]!=null) {
                            phoneNumber += "<div style='float: left;width: 500px;'>"
                                + "<label class='lb'>办公电话</label>"+data["telNoDept"]+"<br>"
                                + "</div>"
                        }
                        if(data["email"]!="") {
                            phoneNumber += "<div style='float: left;width: 500px;'>"
                                + "<label class='lb'>邮箱</label>"+data["email"]+"<br>"
                                + "</div>"
                        }
                        $("#phoneNumber").html(phoneNumber)
                    }
                }
            })
        }
    }



    //        if(url == ""){
    //            url = "/address/getUserInfoById";
    //        }
//    function send_email(EMAIL)
//    {
//        var URL = "/general/email/new/?TO_WEBMAIL="+EMAIL;
//        var myleft = (screen.availWidth-500)/2;
//        window.open(URL, "send_email", "height=500,width=700,status=0,toolbar=no,menubar=no,location=no,scrollbars=yes,top=150,left="+myleft+",resizable=yes");
//    }
//    function send_email_oa(TO_NAME,TO_ID)
//    {
//        var URL = "/general/email/new/?TO_ID="+TO_ID+"&TO_NAME="+TO_NAME;
//        var myleft = (screen.availWidth-500)/2;
//        window.open(URL, "send_email", "height=500,width=700,status=0,toolbar=no,menubar=no,location=no,scrollbars=yes,top=150,left="+myleft+",resizable=yes");
//    }
    function add_edit(add_id)
    {
        //eval("parent.form1."+NAME+".value=VALUE")
        parent.document.getElementById('show_add_id').value = add_id;
        parent.document.getElementById('edit').click();
    }
    function delete_add(ADD_ID,GROUP_ID)
    {
        var msg='<fmt:message code="global.lang.transadel" />？';
        if(window.confirm(msg))
        {
            var data = {"addId":ADD_ID,"groupId":GROUP_ID};
//            console.log(data);
            $.ajax({
                type: "post",
                url: "/address/deleteUser",
                data: data,
                success: function(res){
                    if(res.status){
                        alert("<fmt:message code="workflow.th.delsucess" />");
                        parent.location.reload();
                    }else{
                        alert("<fmt:message code="lang.th.deleSucess" />！\n"+res.message);
                    }
                }
            })
        }
    }
</script>
</body>
</html>