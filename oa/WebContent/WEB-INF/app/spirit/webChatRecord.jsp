<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title><fmt:message code="seal.messagehistory" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <link rel="stylesheet" href="/css/spirit/chatRecord.css">
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
    <script src="../../js/jquery/jquery.cookie.js"></script>
    <style>
        body, button, select, textarea, input, label, option, fieldset, legend{
            font-family: 微软雅黑;
        }
        .main-title{
            font-size:12px;
            line-height: 20px;
        }
        .main-text{
            line-height:21px;
            margin-left: 10px;
        }
        .main-title.colorBule{
            color: #0097f3;
            font-weight: 600;
        }
        .jsonstring{
            display: none;
        }
        .page-data{
            width: 110px;
        }
        /*定义滚动条宽高及背景，宽高分别对应横竖滚动条的尺寸*/
        .mainbox::-webkit-scrollbar{
            width: 4px;
            height: 16px;
            background-color: #f5f5f5;
        }
        /*定义滚动条的轨道，内阴影及圆角*/
        .mainbox::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        /*定义滑块，内阴影及圆角*/
        .mainbox::-webkit-scrollbar-thumb{
            /*width: 10px;*/
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #ccc;
        }
        .main {
            padding: 10px 20px;
        }

        .tabbox li{
            width: 60px;
            float: left;
            margin: 11px 10px;
            height: 24px;
            line-height: 24px;
            cursor: pointer;
        }
        .search{
            background-color: c0c0c0;
            color: #fff;
            border-radius: 2px;
        }

        /*************qywx修改样式*****************/
        .main-title .name-color {
            margin-right: 6px;
        }
        .wjbox{
            position: relative;
            height: 60px;
            margin-top: 6px;
            cursor: pointer;
            padding: 0 10px;
        }
        .wjbox:hover{
            background-color: #e0e9f2;
        }
        .wjbox:first-child{
            margin-top: 0px;
        }
        .liimg{
            width: calc(33% - 16px);
            height: 71px;
            float: left;
            margin: 5px;
            background-size: cover;
            border: 2px solid #dadde0;
        }
        .active{
            float: left;
            height: 45px;
            line-height: 45px;
            font-size: 22px;
            margin-left: 10px;
            color: rgb(73, 77, 89);
        }
        .headbox{
            height: 45px;
            border-bottom: 1px solid #999;
        }
        .mainCon{
            width: 100%;
        }
        .mainCon table{
            width: 99%;
            margin: 20px auto;
        }
        .mainCon table tr{
            border: #ccc 1px solid;
        }
        .mainCon table tr th{
            padding: 8px;
            color: #2F5C8F;
        }
        .mainCon table tr td{
            padding: 8px;
            text-align: center;
        }
        .mainCon table tr td a{
            text-decoration: none;
            color:#59b7fb;
        }
        .headbox .div img{
            margin-top: 5px;
        }
    </style>
    <div class="headbox">
        <div>
            <span class="active" style="position: relative;"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/webChat.png" style="position: absolute;top: 8px;"/><span style="    margin-left: 40px;"><fmt:message code="seal.messagehistory" /></span></span>
        </div>
    </div>
</head>
<body>
<div class="content" style="display: block;">
    <div class="mainCon">
        <table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">
            <thead>
            <tr>
                <th><fmt:message code="chat.th.chetType" /></th>
                <th><fmt:message code="userDetails.th.name" /></th>
                <th><fmt:message code="email.th.time" /></th>
                <th><fmt:message code="notice.th.content" /></th>
                <th><fmt:message code="notice.th.operation" /></th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</div>
</body>

<script language="JavaScript">
    /*var cookie = $.cookie('company');
    var uid = $.cookie('uid');*/
    Date.prototype.format = function(format) {
        var date = {
            "M+": this.getMonth() + 1,
            "d+": this.getDate(),
            "h+": this.getHours(),
            "m+": this.getMinutes(),
            "s+": this.getSeconds(),
            "q+": Math.floor((this.getMonth() + 3) / 3),
            "S+": this.getMilliseconds()
        };
        if (/(y+)/i.test(format)) {
            format = format.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));
        }
        for (var k in date) {
            if (new RegExp("(" + k + ")").test(format)) {
                format = format.replace(RegExp.$1, RegExp.$1.length == 1
                    ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
            }
        }
        return format;
    }

    function getLocalTime(nS) {
        return new Date(parseInt(nS) * 1000).toLocaleString().substr(0,21)
    }
    function isFloat(n) {
        return n+".0"!=n;
    }
    var res=$.GetRequest();

    function ajaxform(){
        $.ajax({
            url: '/im/getSqlType',
            type: 'get',
            dataType: 'json',
            success: function (result) {
                var datas = result.object;
                var str = '';
                $.ajax({
                    url: '/im/getImList1?of_from='+datas.sqlType+'pq'+ datas.str +'@gsubo',
                    type: 'get',
                    dataType: 'json',
                    data: {},
                    success: function (result) {
                        var datas = result;
                        var str = '';
                        if (datas.length > 0) {
                            for (var i = 0; i < datas.length; i++) {
                                var newDate = new Date();
                                newDate.setTime(datas[i].time * 1000);
                                if(datas[i].of_to.indexOf('gsrooms') == -1){
                                    var dats = '单聊';
                                }else{
                                    var dats = '群聊';
                                }
                                str += '<tr uuid='+datas[i].list_id+' from="'+datas[i].of_from+'" to="'+datas[i].of_to+'" time="'+datas[i].time+'">' +
                                    '<td >'+dats+'</td>' +
                                    '<td >'+datas[i].toUserName+'</td>' +
                                    '<td >'+newDate.format('yyyy-MM-dd h:m')+'</td>' +
                                    '<td >'+datas[i].content+'</td>' +
                                    '<td>' +
                                    '<a href="javascript:void(0)" style="padding: 0px 5px"  class="search"><fmt:message code="long.th.See" /></a>' +
                                    '</td>' +
                                    '</tr>';
                            }
                            $('.mainCon tbody').append(str);
                        } else {
                            $.layerMsg({content: '<fmt:message code="doc.th.NoData" />！', icon: 5});
                        }


                    }
                });
            }
        })
    }
    $(function(){
        ajaxform()
    })
//    onclick="clickSee('+datas[i].of_from+','+datas[i].of_to+','+datas[i].time+')"
//    function clickSee(from,to,time){
//        window.open("/spirit/chatRecord?of_from="+from +"&of_to="+to+"&last_time="+time);
////        window.open("/spirit/chatRecord?of_from="+datas[i].of_from +"&of_to="+datas[i].of_to+"&last_time="+datas[i].time);
//    }
    $('.mainCon').on('click','.search',function(){
        var from=$(this).parents('tr').attr('from');
        var to=$(this).parents('tr').attr('to');
        var time=$(this).parents('tr').attr('time');
        console.log($(document).width()/2 -150)
        var left = $(document).width()/2 -150;
        console.log($(document).height()/2 - 300)
        var top = $(document).height()/2 - 300;
        window.open("/spirit/chatRecord?of_from="+from +"&of_to="+to+"&last_time="+time,"","top="+ top +",left=" +left+ ",width=300,height=600");
    })

//    $('.search').click(function () {
//        window.open("/spirit/chatRecord?of_from="+from +"&of_to="+to+"&last_time="+time);
//    })
</script>
</html>