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
    <meta charset="UTF-8">
    <title><fmt:message code="lang.th.deleSgfh" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" href="/css/base/base.css">
    <link rel="stylesheet" type="text/css" href="../css/sys/userInfor.css"/>
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery.cookie.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        .delete_check{
            display: inline-block;
            width: 50px;
            height: 24px;
            line-height: 30px;
            background: url(../../img/btn_deleteannounce.png) no-repeat;
            font-size: 14px;
            cursor: pointer;
            margin: 0 20px;
        }
        table input{
            line-height: 0 ;
        }
        table input{
            line-height: 0 ;
        }
        table.table tr td {
            border-right: 0;
        }
        .content{
            background-color: #fff;
        }
        .blue_text {
            width: 100px;
        }
        input{
            margin: 0 0px 0 37px;
        }
        .btn{
            width: 66%;
            margin: 0 auto;
        }
        .backQueryBtn1{
            background:url("../img/btn_deletecontent_03.png") no-repeat -4px -2px;
            float: left;
            width: 70px;
            height: 28px;
            line-height: 28px;
            cursor: pointer;
            background-color: #CCCCCC;
        }
        table.table tr td input[type="text"]{
            width: 250px;
            height: 22px;
            border: none;
            outline: none;
            border: #ccc 1px solid;
            margin-left: 60px;
            padding-left: 3px;
        }


        .content .right{
            float: left;
            width: 100%;
            font-size: 14px;
            overflow-y: auto;
            height: 100%;
        }


    </style>
</head>
<body>
<div class="content">


    <div class="right">
        <div class="queryUser" style="display: block;width:52%">
            <div class="title">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_personnelQuery.png" class="ChildTitleIcon" alt="<fmt:message code="main.th.Sendgl" />" style="    margin-top: 12px;">
                <span><fmt:message code="lang.th.deleSgfh" /></span>
            </div>
            <table class="table" cellspacing="0" cellpadding="0" style="width:500px; border-collapse:collapse;background-color: #fff;margin-left: 300px" >
                <tbody >
                <tr >
                    <td class="blue_text"><fmt:message code="main.th.Seid" /></td>
                    <td >
                        <input type="text" name="fromId" id="fromId"  disabled="disabled" style="background-color: #f1f0e8;"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="main.th.Sj" /></td>
                    <td class="right_td">
                        <input type="text" name="phone" id="phone" class="inputTd"/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="main.th.rl" /></td>
                    <td class="right_td">
                        <input type="text" id="content" name="content"  />
                    </td>
                </tr>

                <tr>
                    <td class="div-left"><fmt:message code="sup.th.SendingTime" /></td>
                    <td class="right_td">
                        <%--不能使用sendTime作为id和name的值--%>
                        <input type="text" id="sendTime" name="sendTime"  onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" >

                    </td>
                </tr>
                <tr>
                    <td class="div-left"><fmt:message code="sup.th.Sending" /></td>
                    <td class="right_td" >
                        <select id="sendFlag"  name="sendFlag" style="width:255px;height:26px;margin-left:60px">
                            <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                            <option value="1"  ><fmt:message code="hr.th.PleaseSon" /></option>
                            <option value="2" ><fmt:message code="global.lang.send" /></option>
                            <option value="3" ><fmt:message code="global.lang.cg" /></option>
                            <option value="4" ><fmt:message code="global.lang.in" /></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="div-left"><fmt:message code="global.lang.sl" /></td>
                    <td class="right_td">
                        <input type="text" id="sendNum" name="sendNum"  >
                    </td>
                </tr>



                <tr>
                    <td colspan="2">
                        <div class="btn" style="width:230px;height: 30px">

                            <input id="sel_btn" type="button" class="backQueryBtn" value="&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="global.lang.query" />"/>
                            <input id="del_btn" type="button" class="backQueryBtn1" value="&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message code="global.lang.delete" />">
                        </div>

                    </td>
                </tr>
                </tbody>
            </table>
        </div>



        <div class="conditionQuery" style="display: none;">
            <div class="title">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_personnelQuery.png" class="ChildTitleIcon" alt="<fmt:message code="global.lang.del" />" style="    margin-top: 12px;">
                <span><fmt:message code="global.lang.delcq" /></span>
            </div>
            <div class="tab">
                <table cellspacing="0" cellpadding="0" style="border-collapse:collapse;" class="tt">
                    <thead>
                    <tr class='Condition'>
                        <th width=""><fmt:message code="main.th.Seid" /></th>
                        <th width=""><fmt:message code="main.th.Sj" /></th>
                        <th width=""><fmt:message code="main.th.rl" /></th>
                        <th width=""><fmt:message code="sup.th.SendingTime" /></th>
                        <th width=""><fmt:message code="sup.th.Sending" /></th>
                        <th width=""><fmt:message code="global.lang.sl" /></th>
                        <th width=""><fmt:message code="notice.th.operation" /></th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>

                <div id="dbgz_page" class="M-box3 fr" style="float:right;margin-top:10px;">

                </div>

                <div class="backBtn"><span id="back" style="margin-left: 30px;"><fmt:message code="notice.th.return" /></span></div>

            </div>
        </div>




        <div class="Statistics" style="display: block;width:52%">
            <div class="title">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_inservicsPersonnel.png" class="ChildTitleIcon" alt="<fmt:message code="userInfor.th.UserQuery" />">
                <span><fmt:message code="userInfor.th.Usetj" /></span>
            </div>
            <table class="table" cellspacing="0" cellpadding="0" style="width:500px; border-collapse:collapse;background-color: #fff;margin-left: 300px">

                <tr>
                    <td class="blue_text"><fmt:message code="sup.th.SendingTime" /></td>
                    <td class="right_td">
                        <input type="text" id="sendTime" name="sendTime"  onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" >
                        <%--<input type="text" id="sendTime" name="sendTime"  >--%>
                    </td>
                </tr>

                <tr>
                    <td class="blue_text"><fmt:message code="sup.th.Seny" /></td>
                    <td class="right_td">

                        <label><input style="float: none; width:15px;height: 15px;vertical-align: bottom;margin-left: 60px" name="stat" type="radio" value="1" ><span><fmt:message code="sup.th.Senyup" /></span>
                            <input name="stat" style="float: none; width:15px;height: 15px;vertical-align: bottom;margin-left: 30px" name="stat" type="radio"  value="2"  ><span><fmt:message code="sup.th.Senyupy" /></span>
                        </label>
                        <%--<label> </label>--%>
                    </td>

                </tr>
                <tr>
                    <td class="blue_text"><fmt:message code="sup.th.yuk" /></td>
                    <td class="right_td">
                        <label>
                            <input style="float: none; width:15px;height: 15px;vertical-align: bottom;;margin-left: 60px"    name="stat" type="radio" value="1" ><span><fmt:message code="sup.th.rsth" /></span>
                            <input name="stat" style="float: none; width:15px;height: 15px;vertical-align: bottom;;margin-left: 44px" name="stat" type="radio"  value="2"  ><span><fmt:message code="sup.th.rstherg" /></span>
                        </label>

                    </td>
                </tr>

                <tr>
                    <td colspan="2">
                        <div class="btn">


                            <button type="button" class="bigButton  import" value="<fmt:message code="workflow.th.Stati" />" id="sta_btn" style="margin-right: 30px"><fmt:message code="workflow.th.Stati" /></button>
                        </div>
                    </td>
                </tr>
            </table>
        </div>

    </div>
</div>
<script>


    $(function () {
        var arr = null;
        var data = null;
        /*console.log(decodeURI($.cookie('userName')))*/
        $('.Statistics').css('display','block');
        $('#back').on('click',function () {
            $('.queryUser').css('display','block');
            $('.Statistics').css('display','block');
            $('.conditionQuery').css('display','none');
            location.reload();
        })

        $.ajax({
            url: '/user/findUserByuserId',
            type:'get',
            dataType: 'json',
            data:{
                userId:$.cookie('userId')

            },
            success: function (data) {
                arr=data.object;

                $('#fromId').val(decodeURI(arr.userName));

            }
        });
        //查询按钮点击事件

        $('#sel_btn').click(function(){

            $('.Statistics').css('display','none');
            data={
                'page':1,//当前处于第几页
                'pageSize':15,//一页显示几条
                'useFlag':true,

                'phone':$('input[name="phone"]').val(),
                'content':$('input[name="content"]').val(),
                'sendTime':$('input[name="sendTime"]').val(),
                'sendFlag':$('input[name="sendFlag"]').val(),
                'sendNum':$('input[name="sendNum"]').val()
            }
            queryAllSms2(data,$('.Condition'));
            $('.queryUser').css('display','none');
        })

//查询所有人员
        function queryAllSms2(data,element){
            $(".center").hide();
            $(".conditionQuery").show();
            $.ajax({
                type:'get',
                url:'/sms2/selectSms2',
                dataType:'json',
                data:data,
                success:function(res){
                    var data1=res.obj;
                    var str='';
                    for(var i=0;i<data1.length;i++){
                        /* var fromId=$('#fromId').val(decodeURI(arr.userName));*/
                        var phone='';
                        var content='';
                        var sendTime='';
                        var sendFlag='';
                        var sendNum='';

                        if(data1[i].phone!='') {
                            phone = data1[i].phone
                        }
                        if(data1[i].content!=''){
                            content=data1[i].content
                        }
                        if(data1[i].sendTime!=undefined){
                            sendTime=data1[i].sendTime
                        }else if(data1[i].sendTime==undefined){
                            sendTime="0000-00-00 00:00:00"
                        }else if(data1[i].sendTime==''){
                            sendTime="0000-00-00 00:00:00"
                        }

                        if(data1[i].sendFlag==''){
                            sendFlag;
                        }else if(data1[i].sendFlag==1){
                            sendFlag="<fmt:message code="hr.th.PleaseSon" />"
                        }else if(data1[i].sendFlag==2){
                            sendFlag="<fmt:message code="global.lang.send" />"
                        }else if(data1[i].sendFlag==3){
                            sendFlag="<fmt:message code="global.lang.cg" />"
                        }else if(data1[i].sendFlag==4){
                            sendFlag="<fmt:message code="global.lang.in" />"
                        }
                        if(data1[i].sendNum!=''){
                            sendNum=data1[i].sendNum
                        }
                        str += '<tr class="userData" smsId="'+data1[i].smsId+'">' +

                            '<td>' +decodeURI(arr.userName)+ '</td>' +
                            '<td>' + phone+ '</td>' +
                            '<td>' + content+ '</td>' +
                            '<td>' +sendTime+ '</td>' +
                            '<td>' +sendFlag+ '</td>' +
                            '<td>' +sendNum+ '</td>' +
                            '<td>'+'<a href="javascript:void (0)" class="del_btn1" smsId="'+data1[i].smsId+'"><fmt:message code="global.lang.delete" /></a></td>'+
                            '</tr>';

                    }
                    var a=element.parents('.tt').find('tbody').html(str);
                    pageTwo(res.totleNum,data.pageSize,data.page)
                }
            })
        }

        function pageTwo(totalData, pageSize,indexs) {
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:indexs||1,
                callback: function (index) {
                    data.page=index.getCurrent();
                    queryAllSms2(data,$('.Condition'));
                }
            });
        }
        $("tbody").on('click','.del_btn1',function () {
            var delId=$(this).attr('smsid')
            var that = $(this);
            layer.confirm('<fmt:message code="attend.th.qued" />？', {
                btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
                title: "<fmt:message code="event.th.DeleteInformation" />"
            }, function() {
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url: '<%=basePath%>sms2/delSms2',
                    dataType: 'json',
                    data:{
                        smsId:delId
                    },
                    success: function (data) {

                        if (data.flag) {

                            $.layerMsg({ content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1 });
                            that.parents('tr').remove()

                        }else{
                            $.layerMsg({ content: '<fmt:message code="lang.th.deleSucess" />！', icon: 1 });
                        }
                    }
                });
            }, function() {
                layer.closeAll();

            });


        })

        $("#del_btn").click(function () {
            layer.confirm('<fmt:message code="attend.th.qued" />？', {
                btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
                title: "<fmt:message code="event.th.DeleteInformation" />"
            }, function() {
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url: '<%=basePath%>sms2/delSms2',
                    dataType: 'json',
                    data:{
                        phone:$('[id="phone"]').val(),
                        content:$('[id="content"]').val(),
                        sendTime:$('[id="sendTime"]').val(),
                        sendFlag:$('[id="sendFlag"]').val(),
                        sendNum:$('[id="sendNum"]').val()

                    },
                    success: function (data) {

                        if (data.flag) {

                            $.layerMsg({ content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1 });

                        }else{
                            $.layerMsg({ content: '<fmt:message code="lang.th.deleSucess" />！', icon: 1 });
                        }
                    }
                });
            }, function() {
                layer.closeAll();
            });

        })



    })



</script>
</body>
</html>

