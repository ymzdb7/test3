<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>考勤月度报表</title>
    <link rel="stylesheet" href="/css/supervise/statistic.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/js/bootstrap/bootstrap.min.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

    <style type="text/css">
        #body{
        overflow: auto;
        }
        .sels1{display: inline;}
        @media only screen and (min-width: 100px) and (max-width: 960px) {
            .sels1 select{width: 40%;}
        }
        select{

            margin:14px 30px 0 0;

        }
        .font_siz{
            font-size: 20px;
        }
        .sels21{
            width:5%;
            float:left;
        }
        .form-font{
            display: inline-block;
            height: 30px;
            vertical-align: bottom;
            line-height:30px;
        }
        #table td{
            border-right: 1px solid #dddddd;
        }
        #table th{
            text-align: center;
            vertical-align: middle;
            border-right: 1px solid #dddddd;
            border-top: 1px solid #dddddd;
            min-width: 90px;
        }
        .head_right_top1{
            font-weight: 900;
            display: inline-block;
        }
        .table th{
            border-bottom: 1px solid #dddddd;
        }
        .table td{
            border-bottom: 1px solid #dddddd;
            text-align: center;
        }
        .head_right_top1 span{
            height: 35px;
            line-height: 35px;
            margin-top: 16px;
            background-color: #447dc0;
            width: 130px;
            border: 1px solid #447DC0;
        }
        .thing{

        }
        .select-box input{
            float: left;
            margin-left: 25px;
        }
        .select-box div{
            float: left;
        }
        .f1{
            display: none;
        }
        .f2{
            display: none;
        }
        .f3{
            display: none;
        }
        .f4{
            display: none;
        }
        .f5{
            display: none;
        }
        .f6{
            display: none;
        }
        .f7{
            display: none;
        }
    </style>
</head>

<body style="background-color:#fff" class="bodycolor">

<div style="margin: 0 0 15px 20px;min-width: 890px;">

    <span class="form-font">年：</span>
    <select name="year" style="width: 180px" class="select1">
        <option value="2015">2015年</option>
        <option value="2016">2016年</option>
        <option value="2017">2017年</option>
        <option value="2018" selected="selected">2018年</option>
        <option value="2019">2019年</option>
        <option value="2020">2020年</option>
        <option value="2021">2021年</option>
        <option value="2022">2022年</option>
        <option value="2023">2023年</option>
        <option value="2024">2024年</option>
        <option value="2025">2025年</option>
        <option value="2026">2026年</option>
        <option value="2027">2027年</option>
        <option value="2028">2028年</option>
        <option value="2029">2029年</option>
    </select>

    <span class="form-font">部门：</span><select style="width: 180px;" name="DID" class="liebiao1" view='' uid='' did='1'></select>

    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span class="form-font">人员：</span><select name="deptpeople" style="width: 180px"  class="select2" id="userList">
    <option value="all">全部</option>
    <option value='101000215'>fdfd</option><option value='101000185'>高然</option>	</select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</div>

<div class="select-box" style="min-width: 790px;">
    <div style="margin-left: 18px;">筛选：</div>
    <input type="checkbox" class="selectyear" num="1" checked='checked'><div>年假</div>
    <input type="checkbox" class="selectsick" num="2" checked='checked'><div>病假</div>
    <input type="checkbox" class="selectthing" num="3" checked='checked'><div>事假</div>
    <input type="checkbox" class="selectmarital" num="4"><div>婚假</div>
    <input type="checkbox" class="selectmaternity" num="5"><div>产假</div>
    <input type="checkbox" class="selectfuneral" num="6"><div>丧假</div>
    <input type="checkbox" class="selectother" num="7"><div>其他</div>
    <span class="form-font" style="margin-left: 66px;"><input value="查询" type="submit" class="submit" style="margin-top: -7px;width: 100px;padding: 5px 10px; font-size: 15px; color: #fff;border: 0;background: #7bafea;margin-left: 46px; border-radius: 5px;">
        <!--a href="attend_query.php?YEAR=&MONTH=&DID=1">导出</a-->
	</span>

</div>

<div style="    margin-left: 17px;min-width: 590px;" class="sm">
    <span>说明：（</span>
    <span>入职时间、年假天数在人事档案管理中设置。另外统计请假时间的单位为天）</span>
</div>
<br>
<%--<div class="l-wrapper" style="margin: 0 auto;width: 40px;">--%>
    <%--<svg viewBox="0 0 120 120" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">--%>
        <%--<g id="circle" class="g-circles g-circles--v3">--%>
            <%--<circle id="12" transform="translate(35, 16.698730) rotate(-30) translate(-35, -16.698730) " cx="35" cy="16.6987298" r="10"></circle>--%>
            <%--<circle id="11" transform="translate(16.698730, 35) rotate(-60) translate(-16.698730, -35) " cx="16.6987298" cy="35" r="10"></circle>--%>
            <%--<circle id="10" transform="translate(10, 60) rotate(-90) translate(-10, -60) " cx="10" cy="60" r="10"></circle>--%>
            <%--<circle id="9" transform="translate(16.698730, 85) rotate(-120) translate(-16.698730, -85) " cx="16.6987298" cy="85" r="10"></circle>--%>
            <%--<circle id="8" transform="translate(35, 103.301270) rotate(-150) translate(-35, -103.301270) " cx="35" cy="103.30127" r="10"></circle>--%>
            <%--<circle id="7" cx="60" cy="110" r="10"></circle>--%>
            <%--<circle id="6" transform="translate(85, 103.301270) rotate(-30) translate(-85, -103.301270) " cx="85" cy="103.30127" r="10"></circle>--%>
            <%--<circle id="5" transform="translate(103.301270, 85) rotate(-60) translate(-103.301270, -85) " cx="103.30127" cy="85" r="10"></circle>--%>
            <%--<circle id="4" transform="translate(110, 60) rotate(-90) translate(-110, -60) " cx="110" cy="60" r="10"></circle>--%>
            <%--<circle id="3" transform="translate(103.301270, 35) rotate(-120) translate(-103.301270, -35) " cx="103.30127" cy="35" r="10"></circle>--%>
            <%--<circle id="2" transform="translate(85, 16.698730) rotate(-150) translate(-85, -16.698730) " cx="85" cy="16.6987298" r="10"></circle>--%>
            <%--<circle id="1" cx="60" cy="10" r="10"></circle>--%>
        <%--</g>--%>
    <%--</svg>--%>
<%--</div>--%>
<div class="tablebody" style="padding:0 0 0 10px;">
    <table class="table table-striped" id="table"  style="max-width: 3500px;width: 1850px;">
        <tr>
            <th rowspan = '2' style="min-width: 60px;">姓名</th>
            <th rowspan = '2' style="min-width: 80px;">部门</th>
            <th rowspan = '2' style="min-width: 80px;">入职时间</th>
            <th rowspan = '2' style="min-width: 80px;">年假天数</th>
            <th class="th1" colspan = ''>请假合计</th>
            <th class="th" colspan = ''>一月</th>
            <th class="th" colspan = ''>二月</th>
            <th class="th" colspan = ''>三月</th>
            <th class="th" colspan = ''>四月</th>
            <th class="th" colspan = ''>五月</th>
            <th class="th" colspan = ''>六月</th>
            <th class="th" colspan = ''>七月</th>
            <th class="th" colspan = ''>八月</th>
            <th class="th" colspan = ''>九月</th>
            <th class="th" colspan = ''>十月</th>
            <th class="th" colspan = ''>十一月</th>
            <th class="th" colspan = ''>十二月</th>
        </tr>
        <tr>
            <td class="f0">总</td>
            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>

            <td class="f1">年</td>
            <td class="f2">病</td>
            <td class="f3">事</td>
            <td class="f4">婚</td>
            <td class="f5">产</td>
            <td class="f6">丧</td>
            <td class="f7">其他</td>
        </tr>
    </table>
</div>

<script>
    $(function(){
        var lieobiao = $('.liebiao1');
        var view = lieobiao.attr('view');
        var did = lieobiao.attr('did');
        var uid = lieobiao.attr('uid');
        onload(view,uid,did);
        var s1 = $('.select1 option:selected').val();
        var s2 = $('.liebiao1 option:selected').val();

        //console.log($('.liebiao1 option:selected'));
        search(s1,s2);
        $('.submit').click(function(){
            $('.l-wrapper').show();
            search(s1,s2);
        });
        function search(s1,s2){
            $('.f1').hide();
            $('.f2').hide();
            $('.f3').hide();
            $('.f4').hide();
            $('.f5').hide();
            $('.f6').hide();
            $('.f7').hide();
            var array = [];
            var arr = [];
            var booler1 = $('.selectyear').is(':checked');
            var booler2 = $('.selectsick').is(':checked');
            var booler3 = $('.selectthing').is(':checked');
            var booler4 = $('.selectmarital').is(':checked');
            var booler5 = $('.selectmaternity').is(':checked');
            var booler6 = $('.selectfuneral').is(':checked');
            var booler7 = $('.selectother').is(':checked');
            arr.push(booler1,booler2,booler3,booler4,booler5,booler6,booler7);
            //console.log(arr);
            for(var i=0;i<7;i++){
                if(arr[i] == false){
                    arr[i] = i+1;
                    array.push(arr[i]);
                }else{
                    //console.log(i);
                    var j = i+1;
                    $('.f'+j+'').show();
                }
            }
            var len = 7 - array.length;
            var len1 = len + 1;
            $('.th1').attr('colspan',''+len1+'');
            $('.th').attr('colspan',''+len+'');
            //console.log(s1,s2);
            $('.tr').empty();
            if(array.length == 7){
                alert('请选择请假类型！');
                $('.l-wrapper').hide();
            }else{
                $.ajax({
                    url: 'index_ndcontent.php',
                    data: {year:$('.select1 option:selected').val(),DID:$('.liebiao1 option:selected').val(),flag:array,deptpeople:$('.select2 option:selected').val()},
                    dataType: 'json',
                    type: 'post',
                    success:function(data){
                        //console.log(s1);
                        //console.log(array);
                        //console.log(data);
                        setTimeout(function(){
                            $('.l-wrapper').hide();
                            for(var i=0;i<data.length;i++){
                                if(data[i].content.year.length != 0)
                                    var str = $('<tr class="tr"></tr>');
                                var str_1 = '';
                                var str_2 = '';
                                if(data[i].DNAME.length > 5){
                                    str_1 = '<td>'+data[i].UNAME+'</td>'+
                                        '<td><p title="'+data[i].DNAME+'" style="width:80px;white-space:nowrap; overflow:hidden; text-overflow:ellipsis;">'+data[i].DNAME+'</p></td>'+
                                        '<td>'+data[i].DATES_EMPLOYED+'</td>'+
                                        '<td>'+data[i].LEAVE_TYPE+'</td>'
                                }else{
                                    str_1 = '<td>'+data[i].UNAME+'</td>'+
                                        '<td><p style="width:80px;white-space:nowrap; overflow:hidden; text-overflow:ellipsis;">'+data[i].DNAME+'</p></td>'+
                                        '<td>'+data[i].DATES_EMPLOYED+'</td>'+
                                        '<td>'+data[i].LEAVE_TYPE+'</td>'
                                }

                                str.append(str_1);
                                $('#table').append(str);
                                //console.log(data[i].content.year.niannum);
                                var add1 = Number(0);
                                var add2 = Number(0);
                                var add3 = Number(0);
                                var add4 = Number(0);
                                var add5 = Number(0);
                                var add6 = Number(0);
                                var add7 = Number(0)
                                var s = $('<td class="add'+i+'"></td>');
                                str.append(s);
                                if(data[i].content.year.niannum != undefined){
                                    var s = $('<td>'+data[i].content.year.niannum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.niannum != ""){
                                        add1 = Number(data[i].content.year.niannum);

                                    }
                                }
                                if(data[i].content.year.bingnum != undefined){
                                    var s = $('<td>'+data[i].content.year.bingnum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.bingnum != ""){
                                        add2 = Number(data[i].content.year.bingnum);
                                    }
                                }
                                if(data[i].content.year.shinum != undefined){
                                    var s = $('<td>'+data[i].content.year.shinum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.shinum != ""){
                                        add3 = Number(data[i].content.year.shinum);
                                    }
                                }
                                if(data[i].content.year.hunnum != undefined){
                                    var s = $('<td>'+data[i].content.year.hunnum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.hunnum != ""){
                                        add4 = Number(data[i].content.year.hunnum);
                                    }
                                }
                                if(data[i].content.year.channum != undefined){
                                    var s = $('<td>'+data[i].content.year.channum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.channum != ""){
                                        add5 = Number(data[i].content.year.channum);
                                    }
                                }
                                if(data[i].content.year.sangnum != undefined){
                                    var s = $('<td>'+data[i].content.year.sangnum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.sangnum != ""){
                                        add6 = Number(data[i].content.year.sangnum);
                                    }
                                }
                                if(data[i].content.year.qitanum != undefined){
                                    var s = $('<td>'+data[i].content.year.qitanum+'</td>');
                                    str.append(s);
                                    if(data[i].content.year.qitanum != ""){
                                        add7 = Number(data[i].content.year.qitanum);
                                    }
                                }
                                var add = add1+add2+add3+add4+add5+add6+add7;
                                if(add == 0){
                                    add = '';
                                }
                                console.log(add);
                                $('.add'+i+'').html(add);
                                for(var z=1;z<13;z++){
                                    if(data[i].content[z] == undefined)
                                    {
                                        for(var j=0;j<len;j++){
                                            var str_2 = $('<td></td>');
                                            str.append(str_2);
                                        }
                                    }else{
                                        if(data[i].content[z].niannum != undefined){
                                            var s = $('<td>'+data[i].content[z].niannum+'</td>');
                                            str.append(s);
                                        }
                                        if(data[i].content[z].bingnum != undefined){
                                            var s = $('<td>'+data[i].content[z].bingnum+'</td>');
                                            str.append(s);
                                        }
                                        if(data[i].content[z].shinum != undefined){
                                            var s = $('<td>'+data[i].content[z].shinum+'</td>');
                                            str.append(s);
                                        }
                                        if(data[i].content[z].hunnum != undefined){
                                            var s = $('<td>'+data[i].content[z].hunnum+'</td>');
                                            str.append(s);
                                        }
                                        if(data[i].content[z].channum != undefined){
                                            var s = $('<td>'+data[i].content[z].channum+'</td>');
                                            str.append(s);
                                        }
                                        if(data[i].content[z].sangnum != undefined){
                                            var s = $('<td>'+data[i].content[z].sangnum+'</td>');
                                            str.append(s);
                                        }
                                        if(data[i].content[z].qitanum != undefined){
                                            var s = $('<td>'+data[i].content[z].qitanum+'</td>');
                                            str.append(s);
                                        }
                                    }
                                }
                            }
                        },2000);

                    },
                    error:function(data){
                        console.log('error');
                    }
                });
            }

        }

        $(".liebiao1").change(function(){
            var did = $(this).val();
            $.ajax({
                url:"data_api.php",
                type:"post",
                dataType:"json",
                data:{
                    did:did,
                    flag:'getUser',
                },
                success:function(data){
                    // console.log(data);
                    var str = '<option value="all">全部</option>';
                    for(var i=0;i<data.length;i++){
                        str += "<option value='"+data[i].uid+"'>"+data[i].uname+"</option>";
                    }
                    $("#userList").html(str);
                },
                error:function(data){
                    console.log('error');
                }
            })
        })
        $("#attend_execl").click(function(){
            var year = $('.select1 option:selected').val();
            var did = $('.liebiao1 option:selected').val();
            var booler1 = $('.selectyear').is(':checked');
            var booler2 = $('.selectsick').is(':checked');
            var booler3 = $('.selectthing').is(':checked');
            var booler4 = $('.selectmarital').is(':checked');
            var booler5 = $('.selectmaternity').is(':checked');
            var booler6 = $('.selectfuneral').is(':checked');
            var booler7 = $('.selectother').is(':checked');
            var strFlag = '';
            if(booler1){
                strFlag += "1,";
            }
            if(booler2){
                strFlag += '2,';
            }
            if(booler3){
                strFlag += '3,';
            }
            if(booler4){
                strFlag += '4,';
            }
            if(booler5){
                strFlag += '5,';
            }
            if(booler6){
                strFlag += '6,';
            }
            if(booler7){
                strFlag += '7,';
            }
            var url = "attend_execl_nd.php?YEAR="+year+"&DID="+did+"&FLAG="+strFlag;
            window.location.href = url;
        })
    })

</script>
</body>
</html>
