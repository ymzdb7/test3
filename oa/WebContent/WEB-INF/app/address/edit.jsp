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
    <title><fmt:message code="global.lang.Edit" /></title>
    <%--<fmt:message code="global.page.first" />--%>
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta http-equiv="Content-Type" content="text/html;">
    <meta name="viewport"
          content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.tag.css">
    <link rel="stylesheet" type="text/css" href="../css/address/new_add.css" />
    <script type="text/javascript" src="../js/utility.js"></script>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <script type="text/javascript" src="../js/attach.js"></script>
    <script src="../js/module.js"></script>
    <script src="../js/mouse_mon.js"></script>
    <script src="../js/wdatepicker.js"></script>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>

<%--<script src="../js/jquery/jquery.min.js"></script>--%>
    <script src="../../lib/laydate.js"></script>
    <script src="../js/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/base/base.js"></script>
    <script>
        var param = $.GetRequest();
        $(function(){
            //初始化联系人信息
            $.ajax({
                type: "post",
                url: "/address/getUserInfoById",
                data: param,
                success: function (res) {
                    if (res.status) {
                        var data = res.data;
                        var icon = "";
                        if (icon == "") {
                            if (data["sex"] == 0) {
                                icon = "../img/address/man_s.png";
                            } else if (data["sex"] == 1) {
                                icon = "../img/address/w_s.png";
                            } else {
                                icon = "../img/address/man_s.png";
                            }
                        }else {
                            icon = "../img/address/man_s.png";
                        }
                        $("#img img").attr("src",icon);
                        $("#addId").val(data.addId)
                        $("#psnName").val(data.psnName);
                        $("#mobilNo").val(data.mobilNo);
                        $("#email").val(data.email);
                        $("#ministration").val(data.ministration);
                        $("#deptName").val(data.deptName);
                        $("#notes").val(data.notes);

                        if(data.telNoDept!=null&&data.telNoDept!=""){
                            $("#telNoDept").val(data.telNoDept);
                            show_hidden('tel_no_dept');
                        }
                        if(data.telNoHome!=null&&data.telNoHome!=""){
                            $("#telNoHome").val(data.telNoHome);
                            show_hidden('tel_no_home');
                        }
                        if(data.faxNoDept!=null&&data.faxNoDept!=""){
                            $("#faxNoDept").val(data.faxNoDept);
                            show_hidden('fax_no_dept');
                        }
                        if(data.perWeb!=null&&data.perWeb!=""){
                            $("#perWeb").val(data.perWeb);
                            show_hidden('per_web');
                        }
                        if(data.icqNo!=null&&data.icqNo!=""){
                            $("#icqNo").val(data.icqNo);
                            show_hidden('icq_no');
                        }
                        if(data.oicqNo!=null&&data.oicqNo!=""){
                            $("#oicqNo").val(data.oicqNo);
                            show_hidden('oicq_no');
                        }
                        if(data.sex!=null&&data.sex!=""){
                            $("#sex").val(data.sex);
                            show_hidden('sex');
                        }
                        if(data.birthday!=null&&data.birthday!=""){
                            $("#birthday").val(data.birthday);
                            show_hidden('birthday');
                        }
                        if(data.nickName!=null&&data.nickName!=""){
                            $("#nickName").val(data.nickName);
                            show_hidden('nick_name');
                        }
                        if(data.addDept!=null&&data.addDept!=""){
                            $("#addDept").val(data.addDept);
                            show_hidden('add_dept');
                        }
                        if(data.addHome!=null&&data.addHome!=""){
                            $("#addHome").val(data.addHome);
                            show_hidden('add_home');
                        }
                        if(data.postNoDept!=null&&data.postNoDept!=""){
                            $("#postNoDept").val(data.postNoDept);
                            show_hidden('post_no_dept');
                        }


                    }
                }
            })
        })
    </script>
    <script>
        function IsNumber(str)
        {
            return str.match(/^[0-9]*$/)!=null;
        }

        function IsValidEmail(str)
        {
            var re = /@/;
            return str.match(re)!=null;
        }
        function CheckForm()
        {
            if(document.form1.psnName.value=="")
            {
                alert("<fmt:message code="hr.th.empty" />");
                return (false);
            }
            if(document.form1.email.value!="" && !IsValidEmail(document.form1.email.value))
            {
                alert("<fmt:message code="hr.th.mailbox" />");
                return (false);
            }

//            document.form1.submit();
            var formData = new FormData($("form")[0]);
            $.ajax({
                type: "post",
                url: "/address/updateUser",
                data: formData,
                processData:false,
                contentType:false,
                success: function(res){
                    if(res.status){
                        alert("<fmt:message code="depatement.th.Modifysuccessfully" />");
                        parent.location.reload();
                    }else{
                        alert("<fmt:message code="depatement.th.modifyfailed" />！\n"+res.message);
                    }
                }
            })
        }

        function show_hidden(show_id)
        {
            $('#'+show_id+'_div').show();
        }

        function hide_div(show_id)
        {
            $('#'+show_id).val("");
            $('#'+show_id+'_div').hide();
        }
        function hide_show(group_id)
        {
            var all_public = $('#public_group_id_str').val();
            var all_public_arr = all_public.split(",");
            if($.inArray(group_id, all_public_arr) > -1)
            {
                $('#share').hide();
                $('#show_share').hide();
            }
            else
            {
                $('#share').show();
            }
        }
    </script>
</head>
<body>
<div class="new_f">
    <form enctype="multipart/form-data" action="edit_update.php"  method="post" name="form1" id="form1" class="form-horizontal" onSubmit="return CheckForm();" style="margin: 0px;">
        <div class="left" style="width: 220px;height: 400px;">
            <div id="img">
                <img src="" style="width:170px;height:175px"/>
            </div>
            <div id="left_bts">
                <button type="button" class="btn btn-success" style="width:80px;margin-right: 3px;margin-bottom:5px;" id="upload" onClick="photo.click()" title="<fmt:message code="url.th.format" />"><i class="icon-arrow-up icon-white"></i><fmt:message code="global.th.upload" /></button>
                <button type="button" class="btn btn-danger" style="width:80px;margin-right: 0px;margin-bottom:5px;" id="clear" onClick="clear_photo()"><i class="icon-remove icon-white"></i><fmt:message code="notice.th.delete1" /></button><br />
                <input type='file' id="photo" name="ATTACHMENT" style="cursor:pointer; position:absolute; top:0; right:80px; height:24px; filter:alpha(opacity:0);opacity: 0;width:100px" size='1'  hideFocus='' title="<fmt:message code="url.th.format" />"/><!-- onChange="previewImg(this.value);"-->
            </div>
        </div>
        <input type="hidden" id="addId" name="addId"/>
        <div class="right" id="show_right" style="height:400px;width: 780px;">
            <div id="name">
                <div class="control-group" style="margin-top:20px;">
                    <label class="control-label" for="psnName"><fmt:message code="userDetails.th.name" />：</label>
                    <div class="controls" style="position:relative;">
                        <input type="text" id="psnName" name="psnName" style="width: 180px;" value=""><span class="red">&nbsp;&nbsp;<fmt:message code="userDetails.th.required" /></span>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="mobilNo"><fmt:message code="userDetails.th.mobilePhone" />：</label>
                    <div class="controls">
                        <input type="text" id="mobilNo" name="mobilNo" value="" style="width: 180px;">
                    </div>
                </div>
                <div class="control-group" style="width:480px;">
                    <label class="control-label" for="email"><fmt:message code="main.email" />：</label>
                    <div class="controls">
                        <input type="text" id="email" name="email" value="" style="width: 180px;">
                    </div>
                </div>
            </div>
            <div id="add">
                <div class="control-group">
                    <label class="control-label" for="groupId"><fmt:message code="user.th.Grouping" />：</label>
                    <div class="controls">
                        <select name="groupId" id="groupId" class="input-large" style="width: 195px;" onChange="hide_show(this.value)">
                            <option value="0"><fmt:message code="main.th.mo" /></option>
                        </select>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="ministration"><fmt:message code="main.position" />：</label>
                    <div class="controls" style="position:relative;">
                        <input type="text" id="ministration" name="ministration" style="width: 180px;" value="">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="deptName"><fmt:message code="depatement.th.Company" />：</label>
                    <div class="controls">
                        <input type="text" id="deptName" name="deptName" value="" style="width: 180px;">
                    </div>
                </div>
                <div id="tel_no_dept_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="telNoDept"><fmt:message code="depatement.th.phone" />：</label>
                    <div class="controls">
                        <input type="text" id="telNoDept" name="telNoDept" value="" style="width: 180px;"><a href="#" onClick="hide_div('tel_no_dept')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="tel_no_home_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="telNoHome"><fmt:message code="depatement.th.telephone" />：</label>
                    <div class="controls">
                        <input type="text" id="telNoHome" name="telNoHome" value="" style="width: 180px;"><a href="#" onClick="hide_div('tel_no_home')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="fax_no_dept_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="faxNoDept"><fmt:message code="url.th.Workfax" />：</label>
                    <div class="controls">
                        <input type="text" id="faxNoDept" name="faxNoDept" value="" style="width: 180px;"><a href="#" onClick="hide_div('fax_no_dept')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="per_web_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="perWeb"><fmt:message code="url.th.Home1" />：</label>
                    <div class="controls">
                        <input type="text" id="perWeb" name="perWeb" value="" style="width: 180px;"><a href="#" onClick="hide_div('per_web')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="icq_no_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="icqNo">MSN：</label>
                    <div class="controls">
                        <input type="text" id="icqNo" name="icqNo" value="" style="width: 180px;"><a href="#" onClick="hide_div('icq_no')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="oicq_no_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="oicqNo">QQ：</label>
                    <div class="controls">
                        <input type="text" id="oicqNo" name="oicqNo" value="" style="width: 180px;"><a href="#" onClick="hide_div('oicq_no')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="sex_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="sex"><fmt:message code="userDetails.th.Gender" />：</label>
                    <div class="controls">
                        <select name="sex" id="sex" class="input-large" style="width: 135px;">
                            <option value="" ></option>
                            <option value="0"><fmt:message code="userInfor.th.male" /></option>
                            <option value="1"><fmt:message code="userInfor.th.female" /></option>
                        </select>
                        <a href="#" onClick="hide_div('sex')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="birthday_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="birthday"><fmt:message code="userInfor.th.Birthday" />：</label>
                    <div class="controls">
                        <input type="text" id="birthday" name="birthday" value="" style="width: 180px;" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"><a href="#" onClick="hide_div('birthday')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="nick_name_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="nickName"><fmt:message code="workflow.th.nickname" />：</label>
                    <div class="controls">
                        <input type="text" id="nickName" name="nickName" value="" style="width: 180px;"><a href="#" onClick="hide_div('nick_name')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="add_dept_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="addDept"><fmt:message code="workflow.th.officeAddress" />：</label>
                    <div class="controls">
                        <input type="text" id="addDept" name="addDept" value="" style="width: 180px;"><a href="#" onClick="hide_div('add_dept')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="add_home_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="addHome"><fmt:message code="workflow.th.Address" />：</label>
                    <div class="controls">
                        <input type="text" id="addHome" name="addHome" value="" style="width: 180px;"><a href="#" onClick="hide_div('add_home')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>
                <div id="post_no_dept_div" class="control-group" style="width:480px;display:none;">
                    <label class="control-label" for="postNoDept"><fmt:message code="controller.th.liu" />：</label>
                    <div class="controls">
                        <input type="text" id="postNoDept" name="postNoDept" value="" style="width: 180px;"><a href="#" onClick="hide_div('post_no_dept')" style=" cursor: pointer; text-decoration: none; height: 20px; "> <img src="../img/address/delete.png" /> </a>
                    </div>
                </div>

                <div class="control-group" style="width:480px;">
                    <div class="btn-group dropup" style="margin-left: 40px;">
                        <button data-toggle="dropdown" class="btn dropdown-toggle"><fmt:message code="email.th.more" /><span class="caret"></span></button>
                        <ul class="dropdown-menu">
                            <li><a href="#" onClick="show_hidden('tel_no_dept')"><fmt:message code="depatement.th.phone" /></a></li>
                            <li><a href="#" onClick="show_hidden('tel_no_home')"><fmt:message code="depatement.th.telephone" /></a></li>
                            <li><a href="#" onClick="show_hidden('fax_no_dept')"><fmt:message code="url.th.Workfax" /></a></li>
                            <li><a href="#" onClick="show_hidden('per_web')"><fmt:message code="url.th.Home1" /></a></li>
                            <li><a href="#" onClick="show_hidden('icq_no')">MSN</a></li>
                            <li><a href="#" onClick="show_hidden('oicq_no')">QQ</a></li>
                            <li><a href="#" onClick="show_hidden('sex')"><fmt:message code="userDetails.th.Gender" /></a></li>
                            <li><a href="#" onClick="show_hidden('birthday')"><fmt:message code="userInfor.th.Birthday" /></a></li>
                            <li><a href="#" onClick="show_hidden('nick_name')"><fmt:message code="workflow.th.nickname" /></a></li>
                            <li><a href="#" onClick="show_hidden('add_dept')"><fmt:message code="workflow.th.officeAddress" /></a></li>
                            <li><a href="#" onClick="show_hidden('add_home')"><fmt:message code="workflow.th.Address" /></a></li>
                            <li><a href="#" onClick="show_hidden('post_no_dept')"><fmt:message code="controller.th.liu" /></a></li>
                        </ul>
                    </div>
                    <input class="span2" id="prependedDropdownButton" name="input_name0" type="text" style="width: 180px;margin-left: 25px;"/>
                </div>
            </div>
            <div id="beizhu">
                <textarea name="notes" id="notes" style="margin-top: 0px; margin-bottom: 0px; height: 170px;"></textarea>
            </div>
            <div id="show_share" style="display:none;width:500px;clear:both; padding-top:10px; float:left;">
                <div class="control-group" style="height:150px;">
                    <label class="control-label" for="yx"><fmt:message code="journal.th.Sharing" />：</label>
                    <div class="controls" style="margin-bottom:30px; width:500px; ">
                        <input type="text" id="share_start" name="share_start" style="width:180px;" size="20" maxlength="19" value="" title="<fmt:message code="sup.th.startTime" />" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">&nbsp;<fmt:message code="global.lang.to" />&nbsp;
                        <input type="text" id="share_end" name="share_end" style="width: 180px;" size="20" maxlength="19" value="" title="<fmt:message code="meet.th.EndTime" />" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"><br>
                        <font color=red><b><fmt:message code="news.th.notes" />：</b></font><fmt:message code="meet.th.EndTime1" />！
                    </div>

                    <label class="control-label" for="yx"><fmt:message code="diart.th.scope" />：</label>
                    <div class="controls" style="margin-bottom:30px;width: 500px;">
                        <input type="hidden" name="to_id" id="to_id" value="">
                        <textarea rows="3" class="SmallStatic" name="to_name" id="to_name" style="width:270px;" readonly></textarea>
                        <a href="#" class="orgAdd" onClick="SelectUser('10', '', 'to_id', 'to_name')"><fmt:message code="global.lang.add" /></a>
                        <a href="#" class="orgClear" onClick="ClearUser('to_id', 'to_name')"><fmt:message code="global.lang.empty" /></a><br>
                        <input type='checkbox' style="width:20px; margin-bottom:6px;" NAME='sms'/><label style="display:inline;"><fmt:message code="global.lang.transaction" /></label>
                    </div>

                    <!--    <label class="control-label" for="yx">共享内容：</label>
                        <div class="controls">
                            <input type="hidden" name="add_id_str" id="add_id_str" value="">
                            <textarea name="add_name_str" id="add_name_str" rows="3" style="overflow-y:auto;width:270px;" class="SmallStatic" wrap="yes" readonly></textarea>
                            <a href="javascript:;" class="orgAdd" onClick="SelectAdd('add_id_str','add_name_str','')">添加</a>
                            <a href="javascript:;" class="orgClear" onClick="ClearUser('add_id_str', 'add_name_str')">清空</a>&nbsp;&nbsp;
                        </div>-->
                </div>
            </div>

            <input type="hidden" name="add_input_count" id="add_input_count" value="0">
            <input type="hidden" name="add_id" id="add_id" value="">
            <input type="hidden" name="attachment_id_old" value="">
            <input type="hidden" name="attachment_name_old" value="">
            <!--<div id="bts">
                <button type="submit" class="button button-primary button-rounded" id="bc" style="margin-right:20px;">保存</button>
                <button type="button" class="btn button-rounded" id="fh" onClick="hide_dialog()">关闭</button> 
            </div>-->
        </div>
        <input type="hidden" name="public_group_id_str" id="public_group_id_str" value="">
    </form>
</div>
</body>
</html>