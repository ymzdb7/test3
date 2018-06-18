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
    <link rel="stylesheet" type="text/css" href="../../lib/laydate/need/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title><fmt:message code="vote.th.ModifyVoting" /></title>
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
            width:87px;
            background:url(../../img/vote/fabu.png) no-repeat;
            height: 30px;
            line-height:30px;
            border-radius: 4px;
            padding-left: 4px;
            cursor: pointer;
            color:#fff;
            margin-right:7px;
        }
        .box{
            width:300px;
            height:100px;
            background:#2F8AE3;
            color:#fff;
            line-height:100px;
            margin:0 auto;
            font-size:20px;
            text-align:center;
        }
        .addItem{
            width:100px;
            height:28px;
            line-height:28px;
            border-radius:5px;
        }
        .addChild{
            width:100px;
            height:28px;
            line-height:28px;
            border-radius:5px;
        }
        .back{
            width:50px;
            height:28px;
            line-height:28px;
            border-radius:5px;
        }

        #clearSave{
            background:url(../../img/vote/clearsave.png) no-repeat;
            background-size: 181px;
            color:#fff;
            width:181px;
            font-size:16px;
            height:30px;
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
            margin: 0px;
            padding-left: 11px;

        }
        #refull{
            color:#000;
            width: 87px;
            line-height:30px;
            height: 30px;
            font-size:16px;
            background: url("../../img/vote/new.png") no-repeat;
            margin: 0px;
            padding-left: 12px;

        }

        .addItem{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
            width: 142px;
            height:30px;
            cursor:pointer;
        }
        .addChild{
            background:url(../../img/vote/save.png) no-repeat;
            color:#fff;
            height:30px;
            width:139px;
            cursor:pointer;
        }
        .back {
            display: inline-block;
            width: 78px;
            height: 30px;
            line-height: 30px;
            cursor:pointer;
            /* margin-right: 30px; */
            /* margin-top: 20px; */
            /* margin-bottom: 20px; */
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
        }


    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>

<div class="step1" style="display: block;margin-left: 10px;">
    <table class="newNews">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="../../img/sys/new_dept.png"></div>
            <div class="nav_t2" class="news"><fmt:message code="vote.th.ModifyVoting" /></div>
        </div>
        <tbody>
        <tr>
            <td class="td_w blue_text">
                <fmt:message code="notice.th.title" /><span style="color: red">*</span>：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="studentNo"/>
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
                    <option id="only" value=""><fmt:message code="vote.th.Radio" /></option>
                    <option id="double" value=""><fmt:message code="vote.th.Multiselect" /></option>
                    <option id="textarea" value=""><fmt:message code="vote.th.TextEntry" /></option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="vote.th.ViewVoteResults" />：
            </td>
            <td>
                <select  id="seeResult" class="result">
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
                <input type="checkbox" class="niName">
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
                <input class="sentTime" id="sentTime" type="text" placeholder="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" style="width: 160px"/><fmt:message code="vote.th.EmptyEffect" />
                <br/>
                <span>
                    <fmt:message code="notice.th.endDate" />：
                </span>
                <input class="endDate" id="endDate" type="text" placeholder="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" style="width: 160px"/><fmt:message code="notice.th.null" />
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="notice.th.top" />：
            </td>
            <td>
                <input class="top"  type="checkbox" placeholder=""/><fmt:message code="vote.th.important" />
            </td>
        </tr>
        </tbody>

        <div>
            <tr style="text-align:center">
                <td colspan="2">
                    <%--<button type="button" class="close_but" id="publish"><fmt:message code="global.lang.publish" /></button>--%>
                    <button type="button" class="new_but" id="clearSave"><fmt:message code="vote.th.DataEmpty" /></button>
                    <button type="button" class="close_but" id="save"><fmt:message code="global.lang.save" /></button>
                    <button type="button" class="close_but" id="refull"><fmt:message code="global.lang.refillings" /></button>
                </td>
            </tr>
        </div>
    </table>
    <div class="success" style="display:none">
        <div class="box">
            <fmt:message code="vote.th.successfullySaved" />！
        </div>
        <div style="text-align:center;margin-top:20px">
            <button class="addItem"><fmt:message code="vote.th.AddVotingItems" /></button>
            <button class="back"><fmt:message code="notice.th.return" /></button>
        </div>
    </div>
</div>
</body>

<script type="text/javascript">

    //点击修改后，调详情接口
    $(function () {
        var sId = $.GetRequest().editId;
        $.ajax({
            url: '/vote/manage/getChildDetail',
            type: 'post',
            dataType: 'json',
            data: {voteId: sId},
            success: function (reg) {
                var data = reg.object;
                $('#studentNo').val(data.subject);
                $('#deptment').html(data.toId);
                $('#role').html(data.privId);
                $('#userDuser').html(data.userId);
                $('#seeRole').html(data.viewResultPrivId);
                $('#seeUser').html(data.viewResultUserId);
                $('#voteTitle').val(data.content);
                $('#type option:selected').val(data.type);
                $('#seeResult').val(data.viewPriv);
                $('#sentTime').val(data.sendTime.split(' ')[0]);
                $('#endDate').val(data.endDate);
                if (data.anonymity == 0) {
                     $('.niName').prop('checked', false);
                } else {
                     $('.niName').prop('checked', true);
                }

                if (data.top == 0) {
                    $('.top').prop('checked', false);
                } else {
                     $('.top').prop('checked', true);
                }

            }
        })

        function save(){
            var data = {
                voteId: sId,
                subject: $('#studentNo').val(),
                toId: $('#deptment').attr('deptid'),
                privId: $('#role').attr('userpriv'),
                userId: $('#userDuser').attr('user_id'),
                viewResultPrivId: $('#seeRole').attr('userpriv'),
                viewResultUserId: $('#seeUser').attr('user_id'),
                content: $('#voteTitle').val(),
                type: $('.type option:selected').val(),
                viewPriv: $('#seeResult option:selected').val(),
                anonymity: function () {
                    if ($('.niName').prop('checked') == false) {
                        return '0';
                    } else {
                        return '1';
                    }
                }(),
                sendTime: $('#sentTime').val(),
                endDate: $('#endDate').val(),
                top: function () {
                    if ($('.top').prop('checked') == false) {
                        return '0';
                    } else {
                        return '1';
                    }
                }(),
                attachmentId: $('#attchment').val(),
                attachmentName: $('.selectFile').val(),
            }
            $.ajax({
                type: 'post',
                url: '/vote/manage/updateVoteTitle',
                dataType: 'json',
                data: data,
                success: function (res) {
                    if (res.flag) {
                        $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1});
                        $('.success').show();
                        $('.newNews').hide();
                    } else {
                        $.layerMsg({content: '<fmt:message code="depatement.th.modifyfailed" />！', icon: 2});
                    }
                }
            })
        }
        $('#save').click(function () {
                if($('.td_title1').val().replace(/(^\s*)|(\s*$)/g, "")==""){
                    $.layerMsg({content: '标题不能为空', icon: 2});
                }else if($('#deptment').val()==""&&$('#role').val()==""&&$('#userDuser').val()==""){
                    $.layerMsg({content: '至少有一个发布范围！', icon: 2});
                }else{
                    save();
                }
            });


        //点击发布，改变状态值，接口不改变
        $('#publish').click(function () {
            var data = {
                voteId: sId,
                subject: $('#studentNo').val(),
                toId: $('#deptment').attr('deptid'),
                privId: $('#role').attr('userpriv'),
                userId: $('#user').attr('user_id'),
                viewResultPrivId: $('#seeRole').attr('userpriv'),
                viewResultUserId: $('#seeUser').attr('user_id'),
                content: $('#voteTitle').val(),
                type: $('.type option:selected').val(),
                viewPriv: $('#seeResult option:selected').val(),
                anonymity: function () {
                    if ($('.niName').prop('checked') == false) {
                        return '0';
                    } else {
                        return '1';
                    }
                }(),
                sendTime: $('#sentTime').val(),
                endDate: $('#endDate').val(),
                publish:1,
                top: function () {
                    if ($('.top').prop('checked') == false) {
                        return '0';
                    } else {
                        return '1';
                    }
                }(),
                attachmentId: $('#attchment').val(),
                attachmentName: $('.selectFile').val(),
            }
            $.ajax({
                type: 'post',
                url: '/vote/manage/updateVoteTitle',
                dataType: 'json',
                data: data,
                success: function (res) {
                    if (res.flag) {
                        $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1});
                        $('.success').show();
                        $('.newNews').hide();
                    } else {
                        $.layerMsg({content: '<fmt:message code="depatement.th.modifyfailed" />！', icon: 2});
                    }
                }
            })

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
                $.popWindow("../../common/selectDept");
            });
            //清除数据
            function clearUser(){
                $('#userDuser').attr('user_id', '');
                $('#userDuser').attr('userprivname', '');
                $('#userDuser').attr('dataid','');
                $('#userDuser').val('');
            }
            function clearRole(){
                $('#role').attr('userpriv','');
                $('#role').attr('privid','');
                $('#role').attr('dataid', '');
                $('#role').val('');
            }
            function clearDept(){
                $('#deptment').attr('deptid','');
                $('#deptment').attr('dataid', '');
                $('#deptment').attr('deptno','');
                $('#deptment').val('');
            }
            function clearproRole(){
                $('#seeRole').attr('user_id', '');
                $('#seeRole').attr('userprivname', '');
                $('#seeRole').attr('dataid','');
                $('#seeRole').val('');
            }
            function clearproUser(){
                $('#seeUser').attr('userpriv','');
                $('#seeUser').attr('privid','');
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
                $('#studentNo').val("");
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
                    $.layerMsg({content: '标题不能为空', icon: 2});
                }else if($('#deptment').val()==""&&$('#role').val()==""&&$('#userDuser').val()==""){
                    $.layerMsg({content: '至少有一个发布范围！', icon: 2});
                }else{
                    save();
                    clearAll();
                }

            })

//        点击添加投票项目
        $('.addItem').click(function(){
            self.parent.document.getElementById("iframe").src='/vote/manage/updateVote?ItemId='+sId;
        })
//        点击添加子投票
        $('.addChild').click(function(){
            self.parent.document.getElementById("iframe").src='/vote/manage/voteChild';
            document.cookie="childId="+sId;
        })
//        点击返回
        $('.back').click(function(){
            self.parent.document.getElementById("iframe").src='/vote/manage/voteList';
        })

    })

    var start = {
        elem: '#STAFF_BIRTH',
        format: 'YYYY-MM-DD',
        istime: true,
        istoday: false,
        choose: function(datas){
         end.min = datas; //开始日选好后，重置结束日的最小日期
         end.start = datas; //将结束日的初始值设定为开始日
         }
        //回调函数
    };
    laydate(start);

    var end = {
        format: 'YYYY/MM/DD hh:mm:ss',
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

</script>
</html>
