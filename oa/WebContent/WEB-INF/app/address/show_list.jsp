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
    <title>联系人列表</title>
    <%--<fmt:message code="global.page.first" />--%>
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta http-equiv="Content-Type" content="text/html;">
    <meta name="viewport"
          content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet" type="text/css" href="../css/address/middle.css"/>
    <script src="../js/jquery/jquery.min.js"></script>
    <script src="../js/address/InitialsDict.js"></script>
    <script type="text/javascript" src="../js/base/base.js"></script>
    <style>
        .zimu{
            font-weight:normal;
        }
        .namelist li span{
            left:25px;
        }
    </style>
    <script>
        var SHARE_TYPE = "";
        function show_add(add_id) {

            parent.document.getElementById("show_add").src = "/address/show_add?addId=" + add_id+"&SHARE_TYPE="+SHARE_TYPE ;
        }
        function show_user(uid,type) {
            var $deptid = $('span[deptid='+ param["deptid"] +']', window.parent.document);
//            console.log($deptid);
//            console.log($deptid.attr('pd'));
            if($deptid.attr('pd') == 1){
                console.log(2);
                $('span[deptid='+ param["deptid"] +']', window.parent.document).attr('pd','0');
                parent.show_dept(param["deptid"]);
            }else{
                parent.document.getElementById("show_add").src = "/address/show_add?uid=" + uid+"&SHARE_TYPE="+type ;
            }
        }
        //获取姓名拼音首字母
        function getFirestName(name) {
            var first = name.substr(0, 1);
            //如果首字母为汉字，获取第一个汉字的拼音
            if (name.length > 0 && name.charCodeAt(0) > 128) {
                for (var item in InitialsDict) {
                    if (InitialsDict[item].indexOf(first) > 0) {
                        return item.toUpperCase();
                    }
                }
                return "#";
            } else if (name.length > 0) {
                //首字母为英文
                first = first.toUpperCase();
//                console.log(first)
                if (first >= 'A' && first <= 'Z') {
                        return first;
                } else {
                    return "#";
                }
            }
        }
    </script>
</head>
<body id="body">

<script>
    var param = $.GetRequest();

    var data={
        deptId:param.groupId
    }

    var url = ""
    if(param.SHARE_TYPE == 2){
        url = "/address/selectUser"
        SHARE_TYPE = param["SHARE_TYPE"]
        $.ajax({
            type: 'post',
            url: url,
            dataType: 'json',
            data: data,
            success: function (reg) {

                if (reg.flag) {
                    var data = reg.obj;

//                    alert(111)
                    //保存姓名首字母的数组
                    var name = {};
                    //保存首字母的编号
                    var nidx = {};
                    var show_list = {};
                    for (var i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(0); i++) {
                        name[String.fromCharCode(i)] = new Array();
                        nidx[String.fromCharCode(i)] = new Array();
                        show_list[String.fromCharCode(i)] = new Array();
                    }
                    name["#"] = new Array();
                    nidx["#"] = new Array();
                    show_list["#"] = new Array();
                    for (var item in data) {
//                        console.log(data[0]["uid"])
                        show_add(data[0]["uid"])
                        //获取姓名首字母
                        var firstName = getFirestName(data[item]["userName"]);

                        //裁剪名字长度
                        var short_name = data[item]["userName"].length > 10 ? data[item]["userName"].substr(0, 10) : data[item]["userName"];
                        //设置头像
                        var url_pic = "";
                        if(data[item]["sex"]==0)
                        {
                            url_pic = "../img/address/smallMan.png";
                        }
                        else if(data[item]["sex"]==1)
                        {
                            url_pic = "../img/address/smallWoman.png";
                        }else{
                            url_pic = "../img/address/smallMan.png";
                        }

                        if (name[firstName].length == 0) {
                            show_list[firstName]["show_add_id"] = data[item]["uid"];
                            show_list[firstName]["show_list"] = "<div class='zm'>"
                                + "<p id=" + firstName + " class='zimu' name=" + firstName + ">" + firstName + "</p>"
                                + "<ul class='namelist'>"
                                + "<li style='line-height: 41px;padding-left: 60px;' onclick=show_user('" + data[item]["uid"] + "',param.SHARE_TYPE);  title=" + data[item]["userName"] + ">"
                                + "<a style='padding-left: 5px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                        }else{
                            show_list[firstName]["show_list"] += "<li style='line-height: 41px;padding-left: 60px;' onclick=show_user('" + data[item]["uid"] + "',param.SHARE_TYPE);  title=" + data[item]["userName"] + ">"
                                + "<a style='padding-left: 5px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;'' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                        }
                        name[firstName].push(data[item]);
                    }
                    show_user(data[0]["uid"],param.SHARE_TYPE)
                    //对应的ul标签结束
                    var startId = -1;
                    for(var key in show_list ){
                        if(show_list[key]["show_list"] && show_list[key]["show_list"]!=""){
                            if(startId = -1){
                                startId = show_list[key]["show_list"];
                            }
                            show_list[key]["show_list"] += "</ul></div>";
                            $("#body").append(show_list[key]["show_list"]);
                        }
                    }
                }
            }
        })
    }else if (param.SHARE_TYPE == 0){
        url =  "/address/getUsersById"
        SHARE_TYPE = param["SHARE_TYPE"]
        $.ajax({
            type: 'post',
            url: url,
            dataType: 'json',
            data: param,
            success: function (reg) {
//                console.log(reg)
                if (reg.status) {
                    var data = reg.data;
                    //保存姓名首字母的数组
                    var name = {};
                    //保存首字母的编号
                    var nidx = {};
                    var show_list = {};
                    for (var i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(0); i++) {
                        name[String.fromCharCode(i)] = new Array();
                        nidx[String.fromCharCode(i)] = new Array();
                        show_list[String.fromCharCode(i)] = new Array();
                    }
                    name["#"] = new Array();
                    nidx["#"] = new Array();
                    show_list["#"] = new Array();
//                    show_add(data[0].addId)
                    for (var item in data) {
//                        console.log(data[0].addId)

                        //获取姓名首字母
                        var firstName = getFirestName(data[item]["psnName"]);
//                        console.log(firstName)
                        //裁剪名字长度
                        var short_name = data[item]["psnName"].length > 10 ? data[item]["psnName"].substr(0, 10) : data[item]["psnName"];
                        //设置头像
                        var url_pic = "";
                        if(data[item]["sex"]==0)
                        {
                            url_pic = "../img/address/smallMan.png";
                        }
                        else if(data[item]["sex"]==1)
                        {
                            url_pic = "../img/address/smallWoman.png";
                        }else{
                            url_pic = "../img/address/smallMan.png";
                        }
//                        console.log(name[firstName].length)
                        if (name[firstName].length == 0) {
                            show_list[firstName]["show_add_id"] = data[item]["addId"];
                            show_list[firstName]["show_list"] = "<div class='zm'>"
                                + "<p id=" + firstName + " class='zimu' name=" + firstName + ">" + firstName + "</p>"
                                + "<ul class='namelist'>"
                                + "<li style='line-height: 41px;' onclick=show_add('" + data[item]["addId"] + "');  title=" + data[item]["psnName"] + ">"
                                + "<a style='padding-left: 60px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;'' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                            show_add(data[0]["addId"])
                        }else{
                            show_list[firstName]["show_list"] += "<li style='line-height: 41px;' onclick=show_add('" + data[item]["addId"] + "');  title=" + data[item]["psnName"] + ">"
                                + "<a style='padding-left: 60px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;'' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                            show_add(data[0]["addId"])
                        }
                        name[firstName].push(data[item]);
                    }
                    //对应的ul标签结束
                    var startId = -1;
                    for(var key in show_list ){
                        if(show_list[key]["show_list"] && show_list[key]["show_list"]!=""){
                            if(startId = -1){
                                startId = show_list[key]["show_list"];
                            }
                            show_list[key]["show_list"] += "</ul></div>";
                            $("#body").append(show_list[key]["show_list"]);
                        }
                    }

                }
            }
        })
    }

    if(param.gettype&&param.gettype==1){
        url =  "/address/selectAddress"
        $.ajax({
            type: 'post',
            url: url,
            dataType: 'json',
            data: {psnName:decodeURI(param.psnName)},
            success: function (reg) {
                console.log(reg)
                if (reg.flag) {
                    var data = reg.obj;
//                    show_user(data[0].addId)
                    //保存姓名首字母的数组
                    var name = {};
                    //保存首字母的编号
                    var nidx = {};
                    var show_list = {};
                    for (var i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(0); i++) {
                        name[String.fromCharCode(i)] = new Array();
                        nidx[String.fromCharCode(i)] = new Array();
                        show_list[String.fromCharCode(i)] = new Array();
                    }
                    name["#"] = new Array();
                    nidx["#"] = new Array();
                    show_list["#"] = new Array();
                    for (var item in data) {
                        //获取姓名首字母
                        var firstName = getFirestName(data[item]["psnName"]);
//                        console.log(firstName)
                        //裁剪名字长度
                        var short_name = data[item]["psnName"].length > 10 ? data[item]["psnName"].substr(0, 10) : data[item]["psnName"];
                        //设置头像
                        var url_pic = "";
                        if(data[item]["sex"]==0)
                        {
                            url_pic = "../img/address/smallMan.png";
                        }
                        else if(data[item]["sex"]==1)
                        {
                            url_pic = "../img/address/smallWoman.png";
                        }else{
                            url_pic = "../img/address/smallMan.png";
                        }
//                        console.log(name[firstName].length)
                        if (name[firstName].length == 0) {
                            show_list[firstName]["show_add_id"] = data[item]["addId"];
                            show_list[firstName]["show_list"] = "<div class='zm'>"
                                + "<p id=" + firstName + " class='zimu' name=" + firstName + ">" + firstName + "</p>"
                                + "<ul class='namelist'>"
                                + "<li style='line-height: 41px;'onclick=show_add('" + data[item]["addId"] + "');  title=" + data[item]["psnName"] + ">"
                                + "<a style='padding-left: 60px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;'' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                            show_add(data[0].addId)
                        }else{
                            show_list[firstName]["show_list"] += "<li style='line-height: 41px;'onclick=show_add('" + data[item]["addId"] + "');  title=" + data[item]["psnName"] + ">"
                                + "<a style='padding-left: 60px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;'' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                            show_add(data[0].addId)
                        }
                        name[firstName].push(data[item]);
                    }
                    //对应的ul标签结束
                    var startId = -1;
                    for(var key in show_list ){
                        if(show_list[key]["show_list"] && show_list[key]["show_list"]!=""){
                            if(startId = -1){
                                startId = show_list[key]["show_list"];
                            }
                            show_list[key]["show_list"] += "</ul></div>";
                            $("#body").append(show_list[key]["show_list"]);
                        }
                    }

                }
            }
        })
    }else if(param.gettype&&param.gettype==2){
        url =  "/address/selectUser"
        $.ajax({
            type: 'post',
            url: url,
            dataType: 'json',
            data: {userName:decodeURI(param.userName)},
            success: function (reg) {
//                console.log(reg)
                if (reg.flag) {
                    var data = reg.obj;
                    show_user(data[0].uid,param.gettype)
                    //保存姓名首字母的数组
                    var name = {};
                    //保存首字母的编号
                    var nidx = {};
                    var show_list = {};
                    for (var i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(0); i++) {
                        name[String.fromCharCode(i)] = new Array();
                        nidx[String.fromCharCode(i)] = new Array();
                        show_list[String.fromCharCode(i)] = new Array();
                    }
                    name["#"] = new Array();
                    nidx["#"] = new Array();
                    show_list["#"] = new Array();
                    for (var item in data) {
                        //获取姓名首字母
                        var firstName = getFirestName(data[item]["userName"]);
//                        console.log(firstName)
                        //裁剪名字长度
                        var short_name = data[item]["userName"].length > 10 ? data[item]["psnName"].substr(0, 10) : data[item]["userName"];
                        //设置头像
                        var url_pic = "";
                        if(data[item]["sex"]==0)
                        {
                            url_pic = "../img/address/smallMan.png";
                        }
                        else if(data[item]["sex"]==1)
                        {
                            url_pic = "../img/address/smallWoman.png";
                        }else{
                            url_pic = "../img/address/smallMan.png";
                        }
//                        console.log(name[firstName].length)
                        if (name[firstName].length == 0) {
                            show_list[firstName]["show_add_id"] = data[item]["addId"];
                            show_list[firstName]["show_list"] = "<div class='zm'>"
                                + "<p id=" + firstName + " class='zimu' name=" + firstName + ">" + firstName + "</p>"
                                + "<ul class='namelist'>"
                                + "<li style='line-height: 41px;'onclick=show_add('" + data[item]["addId"] + "');  title=" + data[item]["psnName"] + ">"
                                + "<a style='padding-left: 60px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;'' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                        }else{
                            show_list[firstName]["show_list"] += "<li style='line-height: 41px;'onclick=show_add('" + data[item]["addId"] + "');  title=" + data[item]["psnName"] + ">"
                                + "<a style='padding-left: 60px;'>" + short_name + "</a>"
                                + "<span style = 'cursor: pointer;margin-top: 5px;width: 32px;height: 32px;' >"
                                + "<img src = " + url_pic + " height = '32px'  width = '32px' >"
                                + "</span > </li >"
                        }
                        name[firstName].push(data[item]);
                    }
                    console.log(name[firstName])
                    //对应的ul标签结束
                    var startId = -1;
                    for(var key in show_list ){
                        if(show_list[key]["show_list"] && show_list[key]["show_list"]!=""){
                            if(startId = -1){
                                startId = show_list[key]["show_list"];
                            }
                            show_list[key]["show_list"] += "</ul></div>";
                            $("#body").append(show_list[key]["show_list"]);
                        }
                    }

                }
            }
        })
    }

</script>

</body>
</html>