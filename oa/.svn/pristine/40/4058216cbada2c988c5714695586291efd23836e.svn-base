<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title><fmt:message code="main.votemanage" /></title>
    <style>

        #search{
            margin-left: 360px;
            font-size: 16px;
        }
        #export{
            font-size: 16px;
        }
        .newNew tr td{
            border:none;
        }
        .newNew .tableHead tr td{
            border:1px solid #c0c0c0;
        }
        .ban{
            width: 80px;
            height: 28px;
            padding-left: 10px;
        }
        .left{
            float:left;
        }
        .new_but{
            width:130px;
            background:#2F8AE3;
            height: 28px;
            line-height: 28px;
            border-radius: 4px;
            margin-left: 0px;
            padding-left: 4px;
            cursor: pointer;
            color:#fff;
        }
        .close_but{
            width:50px;
            height: 37px;
            margin-left:0px;
            line-height: 28px;
            border-radius: 4px;
            padding-left: 4px;
            cursor: pointer;
            /*color:#fff;*/
        }
        .box{
            width:300px;
            height:150px;
            text-align:center;
            font-size:20px;
            color:#fff;
            background:#2F8AE3;
            margin:0 auto;
            line-height:150px;
        }
        .success{
            text-align:center;
            display:none;
        }
        .box{
            margin-bottom:30px;
        }
        .success span{
            width: 132px;
            height: 35px;
            background-color: rgba(224, 224, 224, 0.61);
            font-size: 16px;
            border-radius: 5px;
            padding-left:8px;
            cursor:pointer;

            line-height: 30px;
            display: inline-block;
        }
        #clearSave{
            background:url(../../img/vote/clearsave.png) no-repeat;
            background-size: 181px;
            color:#fff;
            width:181px;
            font-size:16px;
            height:30px;
            cursor: pointer;
            line-height:30px;
            padding-left: 22px;
        }
        #save{
            background:url(../../img/vote/saveBlue.png) no-repeat;
            color:#fff;
            line-height:30px;
            font-size:16px;
            width:91px;
            height: 30px;
            cursor: pointer;
            padding-left: 11px;

        }
        #refull{
            color:#000;
            width: 87px;
            line-height:30px;
            height: 30px;
            cursor: pointer;
            font-size:16px;
            background: url("../../img/vote/new.png") no-repeat;
            padding-left: 12px;

        }
        #addItem,#addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
            width: 142px;
        }
        #addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
        }

        #back {
            display: inline-block;
            width: 78px;
            height: 38px;
            line-height: 30px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
        }
        .laydate-footer-btns{
            position: absolute;
            right: 69px;
            top: 10px;
        }
        .layui-laydate-content{
            margin-left: 33px;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>

<div class="step1" style="display: block;margin-left: 10px;">

    <div class="nav_box clearfix">
        <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/new_dept.png"></div>
        <div class="nav_t2" class="news"><fmt:message code="vote.th.NewVoting" /></div>
    </div>
    <table class="newNews">
        <tbody>
        <tr>
            <td class="td_w blue_text">
                <fmt:message code="notice.th.title" /><span style="color: red">*</span>：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="subject"/>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                <fmt:message code="vote.th.Publication(Department)" />：
            </td>
            <td>
                <textarea name="" id="deptment"  user_id="" value="" style="width: 230px" disabled></textarea>
                <a href="javascript:;" id="selectDept" style="color:#1772c0"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="clearDept" style="color:#1772c0"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                <fmt:message code="vote.th.Release(role)" />：
            </td>
            <td>
                <textarea name="" id="role"  user_id="" style="width: 230px" disabled></textarea>
                <a href="javascript:;" id="selectPriv" style="color:#1772c0"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="clearPriv" style="color:#1772c0"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>

        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.Release(personnel)" />：
            </td>
            <td>
                <textarea name="" id="userDuser"  user_id="" style="width: 230px" disabled></textarea>
                <a href="javascript:;" id="selectUser" style="color:#1772c0"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="clearUser" style="color:#1772c0"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.View(roles)" />：
            </td>
            <td>
                <textarea name="" id="seeRole"  user_id="" style="width: 230px" disabled></textarea>
                <a href="javascript:;" id="selectPriv1" style="color:#1772c0"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="clearPriv1" style="color:#1772c0"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.View(personnel)" />：
            </td>
            <td>
                <textarea name="" id="seeUser"  user_id="" style="width: 230px" disabled></textarea>
                <a href="javascript:;" id="selectUser1" style="color:#1772c0"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" id="clearUser1" style="color:#1772c0"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.VotingDescription" />：
            </td>
            <td>
                <textarea name="" cols="60" rows="5" id="voteTitle"></textarea>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="notice.th.type" />：
            </td>
            <td>
                <select class="type" id="type" type="text" placeholder="">
                    <option id="only" value="0"><fmt:message code="vote.th.Radio" /></option>
                    <option id="double" value="1"><fmt:message code="vote.th.Multiselect" /></option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.ViewVoteResults" />：
            </td>
            <td>
                <select name="" id="seeResult">
                    <option value="0"><fmt:message code="vote.th.Allow" /></option>
                    <option value="1"><fmt:message code="vote.th.before" /></option>
                    <option value="2"><fmt:message code="vote.th.notAllowed" /></option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.secretBallot" />：
            </td>
            <td>
                <input type="checkbox" class="noName" id="noName" checked="true">
                <span><fmt:message code="vote.th.AllowAnonymousVoting" /></span>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="notice.th.validity" />：
            </td>
            <td>
                <span>
                    <fmt:message code="notice.th.effectivedate" />：
                </span>
                <input class="sentTime" id="sentTime" type="text" readonly="readonly"  placeholder="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" style="width: 160px"/><fmt:message code="vote.th.EmptyEffect" />
                <br/>
                <span>
                    <fmt:message code="notice.th.endDate" />：
                </span>
               <input class="endDate" id="endDate" type="text" readonly="readonly"  placeholder="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" style="width: 160px"/><fmt:message code="notice.th.null" />
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="notice.th.top" />：
            </td>
            <td>
                <input  type="checkbox" id="top" placeholder="" checked="true"/><fmt:message code="vote.th.important" />
            </td>
        </tr>
        </tbody>

        <div>
            <tr style="text-align:center">
                <td colspan="2">
                    <button type="button" class="close_but" id="clearSave"><fmt:message code="vote.th.DataEmpty" /></button>
                    <button type="button" class="close_but" id="save"><fmt:message code="global.lang.save" /></button>
                    <button type="button" class="close_but" id="refull"><fmt:message code="global.lang.refillings" /></button>
                </td>
            </tr>
        </div>
    </table>
    <div class="success">
        <div class="box"><fmt:message code="vote.th.successfullySaved" />!</div>
        <div>
            <span id="addItem"><fmt:message code="vote.th.AddVotingItems" /></span>
            <span id="addChild"><fmt:message code="vote.th.AddSubVoting" /></span>
            <span id="back"><fmt:message code="notice.th.return" /></span>
        </div>
    </div>
</div>

</body>

<script type="text/javascript">
//    laydate.render({
//        elem: '#sentTime'
//    });
//    laydate.render({
//        elem: '#endDate'
//    });
    var user_id='';
    var dept_id='';
    var priv_id='';
    $(function () {
        //新建保存


        function save(){
            var voteId;
            var data={
                subject:$('#subject').val(),
                toId:$('#deptment').attr('deptid'),
                privId:$('#role').attr('userpriv'),
                userId:$('#userDuser').attr('user_id'),
                viewResultPrivId:$('#seeRole').attr('userpriv'),
                viewResultUserId:$('#seeUser').attr('user_id'),
                content:$('#voteTitle').val(),
                type:function () {
                    if($('#type option:selected').val()==""){
                        return '0'
                    } else {
                        return  $('#type option:selected').val();
                    }
                }(),
                viewPriv:$('#seeResult option:selected').val(),
                anonymity:function(){
                    if($('#noName').prop('checked')==false){
                        return '0';
                    }else {
                        return  '1';
                    }
                }(),
                sendTime:$('#sentTime').val(),
                endDate:$('#endDate').val(),
                top:function () {
                    if($('#top').prop('checked')==false){
                        return '0';
                    }else {
                        return '1';
                    }
                }(),
                attachmentId:$('#attchment').val(),
                attachmentName:$('.selectFile').val(),
            };
                $.ajax({
                    type: 'post',
                    url: '/vote/manage/newVoteTitle',
                    dataType: 'json',
                    data: data,
                    success: function (res) {

                        if(res.flag){
                            $.layerMsg({content: '<fmt:message code="depatement.th.Newsuccessfully" />！', icon: 1});
                            voteId=res.object;
                            $('.success').show();
                            $('.newNews').hide();

                            //        点击添加投票项目
                            $('#addItem').click(function(){
                                self.parent.document.getElementById('iframe').src='/vote/manage/updateVote?ItemId='+voteId;
                            })
//                            $('#addChild').click(function(){
//                                self.parent.document.getElementById('iframe').src='/vote/manage/newChildVote?voteId='+voteId;
//                            })

                            //        点击添加子投票
                            $('#addChild').click(function(){
                                document.cookie="childId="+voteId;
                                self.parent.document.getElementById('iframe').src='/vote/manage/newChildVote?voteId='+voteId;
                            })

                        }else{
                            $.layerMsg({content: '<fmt:message code="depatement.th.Newfailed" />！', icon: 2});
                        }

                    }
                })


        }

        $('#save').click(function () {

            if($('.td_title1').val().replace(/(^\s*)|(\s*$)/g, "")==""){
                $.layerMsg({content: '<fmt:message code="event.th.titleCannotEmpty" />', icon: 2});
            }else if($('#deptment').val()==""&&$('#role').val()==""&&$('#userDuser').val()==""){
                $.layerMsg({content: '<fmt:message code="withdraw.th.fabu" />！', icon: 2});
            }else{
                save();
            }
        });





//        点击返回
        $('#back').click(function(){
            self.parent.document.getElementById('iframe').src='/vote/manage/voteList';
            window.parent.show();
        })


            //添加选人控件
            $("#selectUser").on("click", function () {//选人员控件
                user_id = 'userDuser';
                $.popWindow("../../common/selectUser");
            });
            $("#selectPriv").on("click", function () {//选角色控件
                priv_id = 'role';
                $.popWindow("../../common/selectPriv");
            });
            $("#selectDept").on("click", function () {//选部门控件
                dept_id = 'deptment';
//                if(typeof(qt) == 'undefined'){
                    $.popWindow("../../common/selectDept");
//                }else{
//                    new QWebChannel(qt.webChannelTransport, function(channel){
//                        var content = channel.objects.interface;
//                        content.xoa_sms('/common/selectDept','祖安泽',"web_child_url");
//                    });
//                }
            });
            //清除数据
                function clearUser(){
                    $('#userDuser').attr('user_id', '');
                    $('#userDuser').attr('userprivname', '');
                    $('#userDuser').removeAttr('dataid');
                    $('#userDuser').val('');
                }
                function clearRole(){
                    $('#role').removeAttr('userpriv');
                    $('#role').removeAttr('privid');
                    $('#role').attr('dataid', '');
                    $('#role').val('');
                }
                function clearDept(){
                    $('#deptment').removeAttr('deptid');
                    $('#deptment').attr('dataid', '');
                    $('#deptment').removeAttr('deptno');
                    $('#deptment').val('');
                }
                function clearproRole(){
                    $('#seeRole').attr('user_id', '');
                    $('#seeRole').attr('userprivname', '');
                    $('#seeRole').removeAttr('dataid');
                    $('#seeRole').val('');
                }
                function clearproUser(){
                    $('#seeUser').removeAttr('userpriv');
                    $('#seeUser').removeAttr('privid');
                    $('#seeUser').attr('dataid', '');
                    $('#seeUser').val('');
                }

            $('#clearUser').click(function () { //清空人员
               clearUser();
            });
            $('#clearPriv').click(function () { //清空角色
                clearRole();
            });
            $('#clearDept').click(function () { //清空部门
               clearDept();
            });
//            权限清空
        $('#clearPriv1').click(function () { //清空角色
           clearproRole();
        });
        $('#clearUser1').click(function () { //清空人员
           clearproUser();
        });
            //查看权限控件添加
            $("#selectUser1").on("click", function () {//选人员控件
                user_id = 'seeUser';
                $.popWindow("../../common/selectUser");
            });
            $("#selectPriv1").on("click", function () {//选角色控件
                priv_id = 'seeRole';
                $.popWindow("../../common/selectPriv");
            });
//清空所有内容
        function clearAll(){
            $('#subject').val("");
            clearUser();
            clearDept();
            clearRole();
            clearproRole();
            clearproUser();
            $('#voteTitle').val("");
            $('#sentTime').val('');
            $('#endDate').val('');
            $('#noName').prop('checked',false);
            $('#top').prop('checked',false);
        }

//            点击重填
        $('#refull').click(function(){
           clearAll();
        })
//        清空数据并保存
        $('#clearSave').click(function(){
            if($('.td_title1').val().replace(/(^\s*)|(\s*$)/g, "")==""){
                $.layerMsg({content: '<fmt:message code="event.th.titleCannotEmpty" />', icon: 2});
                return;
            }else if($('#deptment').val()==""&&$('#role').val()==""&&$('#userDuser').val()==""){
                $.layerMsg({content: '<fmt:message code="withdraw.th.fabu" />！', icon: 2});
                return;
            }else{
                save();
                clearAll();
            }

//            clearAll();
        })


    });

    //时间控件调用
    var start = {
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var end = {
        format: 'YYYY-MM-DD',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };















    //点击查询后，查询列表展示
    $(function () {
        $('#search').click(function () {
            $('.list').show();
            $('.step1').hide();
        })
        $('#return').click(function () {
            $('.list').hide();
            $('.step1').show();
        })
        $('.step1').on('click','#search',function () {

            var arr=[$('#nianJi option:selected').text(),$('#banJi option:selected').text()];
            var zi=arr.join("");
            var data={
                userId:$('#studentNo').val(),
                userName:$('#studentName').val(),
                pUserName:$('#parentName').val(),
                mobilNo:$('#phoneNumber').val(),
                sex:$('#sex option:selected').val(),
            }
            $.ajax({
                type:'get',
                url:'/edu/student/getStudentList',
                dataType:'json',
                success:function (reg) {
                    /*$('.tableHead').remove();*/
                    var data=reg.obj;
//                    console.log(data);
                    var str="";
                    if(data.length>0){
                        for(i=0;i<data.length;i++){
                            str+='<tr class="tableHead" id="'+data[i].uid+'"> ' +
                                '<td><input class="check" type="checkbox"></td> ' +
                                '<td>'+data[i].grade+data[i].clazz+'</td> ' +
                                '<td>'+data[i].userId+'</td> ' +
                                '<td>'+data[i].userName+'</td> ' +
                                '<td>'+data[i].userPrivName+'</td> ' +
                                '<td></td> ' +
                                '<td></td> ' +
                                '<td></td> ' +
                                '<td class="priser">' +
                                '<a class="edit"  userId="'+data[i].userId+'" href="javascript:void(0);"><fmt:message code="global.lang.edit" /></a>&nbsp;&nbsp;' +
                                '<a href="javascript:void(0)" style="color: #C81623 !important;" class="delete" class="del" val="'+data[i].uid+'"><fmt:message code="global.lang.delete" /></a>' +
                                '</td> ' +
                                '</tr>';
                        }
                        $('.listBody').append(str);
                    }
                }
            })


        })
        //删除接口
        $('.priser').on('click','.delete',function () {
            var sId=$(this).parent().parent().attr('id');
//            console.log(sId);
            layer.confirm('<fmt:message code="workflow.th.que" />？', {
                btn: ['<fmt:message code="global.lang.delete" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url:'/edu/student/deleteStudentByUid',
                    dataType:'json',
                    data:{'uid':sId},
                    success:function(){
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
//                        init();
                    }
                })
            }, function(){
                layer.closeAll();
            });
        })
    })



</script>
</html>
