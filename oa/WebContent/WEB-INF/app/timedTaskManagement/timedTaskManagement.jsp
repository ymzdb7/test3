<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title><fmt:message code="work.th.TimedtaskManagement" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" href="/css/officialDocument/rentingList.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">

    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
</head>
<script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
<script src="/lib/layer/layer.js"></script>
<script src="/js/base/base.js"></script>
<script src="/lib/timing/laydate/laydate.js"></script>
<script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
<script src="/lib/jquery.form.min.js"></script>
<%--<script src="/js/pzGrid/gridShjzry.js"></script>--%>

<%--<script src="/js/pzGrid/runPsychosis.js"></script>--%>
<style>
    .formUl li input[type=radio]{
        width: 16px;
    }
    .formUl li .radiolabel{
        width: 50px;
    }
    .divAdd{
        background-color:rgba(0,0,0,0);
    }
    .clearfix input{
        float:none;
    }
    .importTable{
        width: 90%;
        margin: 20px auto;
    }
    .formUl li input{
        width: 100px;
        float: none;
    }
    .formUl li span {
        margin: 20px;
        line-height: 33px;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

</head>
<body>
<div class="headTop">
    <div class="headTop">
        <div class="headImg">
            <%--<img src="/img/document/icon_agentDispatch.png" alt="">--%>
        </div>
        <div class="divTitle">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dingshirenwu.png" alt="">
            <fmt:message code="work.th.TimedtaskManagement" />
        </div>

    </div>
</div>
<div style="margin: 0 auto;margin-top: 46px;height: 30px;width: 97%;" class="clearfix">

</div>

<div class="pagediv" style="margin: 0 auto;width: 97%;">
    <table>
        <thead>
        <tr>
            <th> <fmt:message code="user.th.fbds" /></th>
            <th><fmt:message code="user.th.dfsfd" /></th>
            <th><fmt:message code="user.th.klf" /></th>
            <th><fmt:message code="user.th.dfswa" /></th>
            <th><fmt:message code="user.th.kfdd" /></th>
            <th><fmt:message code="notice.th.state" /></th>
            <th><fmt:message code="notice.th.operation" /></th>
        </tr>
        </thead>
        <tbody>
            <%--<tr>--%>
                <%--<td>新建流程</td>--%>
                <%--<td>根据流程规则设置定时检查是否需要发起新的流程</td>--%>
                <%--<td>3</td>--%>
                <%--<td>10</td>--%>
                <%--<td>2017-12-15 11:41:10</td>--%>
                <%--<td>成功</td>--%>
                <%--<td>√</td>--%>
                <%--<td>--%>
                    <%--<a href="#">编辑</a>--%>
                    <%--<a href="#">立即执行</a>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--<tr keyPetitionsId="11">--%>
                <%--<td>工作流超时催办</td>--%>
                <%--<td>根据流程规则设置定时检查工作办理超时情况</td>--%>
                <%--<td>3</td>--%>
                <%--<td>10</td>--%>
                <%--<td>2017-12-15 11:41:10</td>--%>
                <%--<td>成功</td>--%>
                <%--<td>×</td>--%>
                <%--<td >--%>
                    <%--<a class="edit" href="#">编辑</a>--%>
                    <%--<a href="#">立即执行</a>--%>
                <%--</td>--%>
            <%--</tr>--%>
        </tbody>
    </table>
    <%--<div id="dbgz_page" class="M-box3 fr">--%>

    <%--</div>--%>

</div>
</body>
<script type="text/javascript">

    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:15,//一页显示几条
            useFlag:true,
            gridId:null,
            pName:null
        },
        page:function () {
            var me=this;
            $.post('/TimedTaskManagementController/TimedSelect',me.data,function (json) {
                var status = '';
                var str='';
                var abiao = '';
                var arr=json.obj;
                var result='';
                var executionTime ='';

                for(var i=0;i<arr.length;i++){
                    function add0(m){return m<10?'0'+m:m };
                    function getDate(shijianchuo) {
                        var time = new Date(shijianchuo);
                        var y = time.getFullYear();
                        var m = time.getMonth()+1;
                        var d = time.getDate();
                        var h = time.getHours();
                        var mm = time.getMinutes();
                        var s = time.getSeconds();
                        return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
                    };
                    executionTime=getDate(arr[i].executionTime)
                    if(arr[i].execute==1){
                        status = "√";
                        abiao = '<a class="liji" href="#"><fmt:message code="user.th.dfsfad" /></a>'
                    } else{
                        status = "×";
                    }
                    if(arr[i].result==0){
                        result='<fmt:message code="netdisk.th.Success" />'
                    }else{
                        result='<fmt:message code="event.th.fail" />'
                    }
                    str+='<tr ttmId="'+arr[i].ttmId+'" taskMet="'+arr[i].taskMete+'" taskType="'+arr[i].taskType+'">' +
                        '<td>'+arr[i].taskName+'</td>' +
                        '<td>'+arr[i].taskDescription+'</td>' +
                        '<td>'+arr[i].intwevalTime+'</td>' +
                        '<td>'+executionTime+'</td>' +
                        '<td>'+result+'</td>' +
                        '<td>'+status+'</td>' +
                        '<td>'+
                        '<a class="edit" href="#"><fmt:message code="global.lang.edit" /> </a>'+ abiao+
                        '</td>' +
                        '</tr>'
                }
                $('.pagediv table tbody').html(str)
                me.pageTwo(json.totalNum,me.data.pageSize,me.data.page)
            },'json')
        },
        pageTwo:function (totalData, pageSize,indexs) {
            var mes=this;
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:indexs||1,
                callback: function (index) {
                    mes.data.page=index.getCurrent();
                    mes.page();
                }
            });
        }
    }

    var chuzuwuId=null;
    $(function () {
        ajaxPage.page()

        //查询
        $('.query1').click(function () {
            if($('#gridId').attr('wanggeid')!=''){
                var gridId=$('#gridId').attr('wanggeid').replace(/,/g,"");
                ajaxPage.data.pGrid=gridId;
            }else{
                ajaxPage.data.pGrid=null;
            }
            ajaxPage.data.pName=$("#pName").val()
            ajaxPage.data.page=1;
            ajaxPage.page()

        })


        $('#selGrid').click(function(){
            wangge_id='gridId';
            $.popWindow('/pzGridPage/selectDeptWG');
        })
        $('#emptyGrid').click(function(){
            $('#gridId').val('');
            $('#gridId').attr('wanggeid','');
        })

        //刷新
        $('#refresh').click(function(){
            location.reload();
        })

        //我的编辑
        $(document).on('click','.edit',function () {
            var me=this;
            var taskMet=$(this).parents('tr').attr('taskMet');
            if(taskMet==2){
                layer.open({
                    title:'<fmt:message code="user.th.jkn" />',
                    area:['400px','300px'],
                    type:1,
                    content:'<ul class="formUl">' +
                    '<input type="hidden" id="rentId">'+
                    '<li class="clearfix" style="margin-top: 30px;">' +
                    '<label><fmt:message code="user.th.fbds" />：</label>' +
                    '<span id="taskname"><span>' +
                    '</li>' +
                    '<li class="clearfix">' +
                    '<label><fmt:message code="user.thlkjl" />：</label>' +
                    '<input type="text" id="executionTime"><span style="margin:10px;"><fmt:message code="attend.th.Minute" /></span>' +
                    '</li>' +
                    '<li class="clearfix" >' +
                    '<label><fmt:message code="three.th.Enable" />：</label>' +
                    '<span style="margin:0;margin-left:13px;"><fmt:message code="user.th.kjnf" /></span><input id="qiy" style="margin-left:2px" type="radio" name="available" value="1">' +
                    '<span style="margin:0;margin-left:13px;"><fmt:message code="three.th.Disable" /></span><input id="tingy" style="margin-left:2px" type="radio" name="available" value="0">' +
                    '</li>'+
                    '</ul>',
                    btn:['<fmt:message code="global.lang.ok" />','<fmt:message code="notice.th.return" />'],
                    btn1:function () {
                        if($("#intwevalTime").val()==''){
                            $.layerMsg({content:'<fmt:message code="event.th.Please" />',icon:2});
                            return false;
                        }
                        else {
                            var intwevalTime=$('#intwevalTime').value;
                            var execute='';
                            var available=$("input[name='available']");
                            for (var i = 0; i < available.length; i++) {
                                if (available[i].checked) {
                                    execute=$('input')[i].value
                                }
                            }
                            var ttmId=$(me).parents('tr').attr('ttmId')
                            $.ajax({
                                url:'TimedTaskManagementController/updateTimedTaskManagement',
                                data:{
                                    ttmId:ttmId,
                                    intwevalTime:intwevalTime,
                                    execute:execute
                                },
                                type:'post',
                                dataType:'json',
                                success:function (res) {
                                    if(res.flag){
                                        $.layerMsg({content:'<fmt:message code="netdisk.th.Editsuccess" />！',icon:1})
                                        ajaxPage.page();
                                        layer.closeAll()
                                    }else{
                                        $.layerMsg({content:'<fmt:message code="event.th.EditFailed" />！',icon:1})
                                    }
                                }
                            })
                        }
                        y
                    },
                    success:function () {

                        //    编辑返现
                        $.ajax({
                            url:'/TimedTaskManagementController/selectTimedTaskKey',
                            data:{ttmId:ttmId},
                            type:'get',
                            dataType:'json',
                            success:function(res){
                                var data=res.object;
                                $("#taskname").html(data.taskname);
                                $("#intwevalTime").val(data.intwevalTime);
                                if(data.execute==1){
                                    $("#qiy").attr('checked','checked')
                                }else{
                                    $("#tingy").attr('checked','checked')
                                }
                            }
                        })
                    }
                })
            }else {
                layer.open({
                    title: '<fmt:message code="user.th.jkn" />',
                    area: ['400px', '350px'],
                    type: 1,
                    content: '<ul class="formUl">' +
                    '<input type="hidden" id="rentId">' +
                    '<li class="clearfix" style="margin-top: 30px;">' +
                    '<label><fmt:message code="user.th.fbds" />：</label>' +
                    '<span id="taskname"><span>' +
                    '</li>' +
                    '<li class="clearfix">' +
                    '<label><fmt:message code="user.thlkjl" />：</label>' +
                    '<input type="text" id="intwevalTime"><span style="margin:10px;"><fmt:message code="attend.th.today" /></span>' +
                    '</li>' +
                    '<li class="clearfix">' +
                    '<label><fmt:message code="user.th.dfswa" />：</label>' +
                    '<input type="text" id="executionTime"><span style="margin:10px;"><fmt:message code="attend.th.Minute" /></span>' +
                    '</li>' +
                    '<li class="clearfix" >' +
                    '<label><fmt:message code="three.th.Enable" />：</label>' +
                    '<span style="margin:0;margin-left:13px;"><fmt:message code="user.th.kjnf" /></span><input id="qiy" style="margin-left:2px" type="radio" name="available" value="1">' +
                    '<span style="margin:0;margin-left:13px;"><fmt:message code="three.th.Disable" /></span><input id="tingy" style="margin-left:2px" type="radio" name="available" value="0">' +
                    '</li>' +
                    '</ul>',
                    btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="notice.th.return" />'],
                    btn1: function (index) {
                        if($("#intwevalTime").val()==''){
                            $.layerMsg({content:'<fmt:message code="event.th.Please" />',icon:2});
                            return false;
                        }
                        if($("#executionTime").val()==''){
                            $.layerMsg({content:'<fmt:message code="event.th.Pleasetime" />',icon:2});
                            return false;
                        }
                        else {
                            var intwevalTime=$('#intwevalTime').val();
                            var executionTime=$('#executionTime').val();
                            var available=$("input[name='available']");
                            var execute=';'
                            for (var i = 0; i < available.length; i++) {
                                if (available[i].checked) {
                                    execute=available[i].value
                                }
                            }
                            var ttmId=$(me).parents('tr').attr('ttmId')
                            $.ajax({
                                url:'TimedTaskManagementController/updateTimedTaskManagement',
                                data:{
                                    ttmId:ttmId,
                                    intwevalTime:intwevalTime,
                                    executionTime:executionTime,
                                    execute:execute
                                },
                                type:'post',
                                dataType:'json',
                                success:function (res) {
                                    if(res.flag){
                                        $.layerMsg({content:'<fmt:message code="netdisk.th.Editsuccess" />！',icon:1})
                                        ajaxPage.page();
                                        layer.closeAll()
                                    }else{
                                        $.layerMsg({content:'<fmt:message code="event.th.EditFailed" />！',icon:1})
                                    }
                                }
                            })
                        }

                        layer.closeAll()
                    },
                    success:function () {
//                        laydate.render({
//                            elem: '#executionTime'
//                            ,type: 'time'
//                            ,ready: function(date){
//                                $('#layui-laydate2').css('left','400px')
//                            }
//                        });

                        //    编辑返现
                        var ttmId=$(me).parents('tr').attr('ttmId')
                        $.ajax({
                            url:'/TimedTaskManagementController/selectTimedTaskKey',
                            data:{ttmId:ttmId},
                            type:'post',
                            dataType:'json',
                            success:function(res){
                                var data=res.object;
                                $("#taskname").text(data.taskName);
                                $("#intwevalTime").val(data.intwevalTime);
                                if(data.taskType==1){
                                    $("#qiy").attr('checked','checked')
                                }else{
                                    $("#tingy").attr('checked','checked')
                                }
                            }
                        })
                    }
                    //cccc
                })
            }
        })
        //立即执行
        $(document).on('click','.liji',function(){
            var ttmId=$(this).parents('tr').attr('ttmId')
            var taskType=$(this).parents('tr').attr('taskType')
            layer.open({
                title:'<fmt:message code="user.th.lkjnlk" />',
                area:['300px','220px'],
                type:1,
                content:'<ul class="formUl">' +
                '<li class="clearfix" style="margin-top: 30px;">' +
                '<span style="margin-left: 40px;font-size:15px;"><fmt:message code="user.th.kljlk" />？<span>' +
                '</li>' +
                '</ul>',
                btn:['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'],
                btn1:function () {
                    $.ajax({
                        url:'/TimedTaskManagementController/stactTo',
                        data:{
                            ttmId:ttmId,
                            taskType:taskType
                        },
                        type:'post',
                        dataType:'json',
                        success:function () {
                            if(res.flag){
                                $.layerMsg({content:'<fmt:message code="diary.th.implementationSuccess" />！',icon:1})
                                ajaxPage.page();
                                layer.closeAll()
                            }else{
                                $.layerMsg({content:'<fmt:message code="diary.th.failureToExecute" />！',icon:1})
                            }
                        }


                    })
                }

            })
        })


    })



</script>
</html>
