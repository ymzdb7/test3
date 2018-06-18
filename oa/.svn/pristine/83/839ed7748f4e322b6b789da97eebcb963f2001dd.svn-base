<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="main.worklog"/></title>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../css/diary/workLog.css"/>
    <link rel="stylesheet" type="text/css" href="../css/diary/calendar1.css"/>
    <script src="/js/common/language.js"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="../js/diary/calendar1.js/"></script>
    <script type="text/javascript" src="../js/diary/date.js/"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../js/news/page.js"></script>
    <%--<script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>--%>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <%-- <script type="text/javascript" src="../js/diary/index.js/"></script>--%>
    <script src="../lib/layer/layer.js"></script>
    <script src="../../lib/jquery.form.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>

</head>
<style>
    .layui-layer-title {
        padding: 0 80px 0 20px;
        height: 42px;
        line-height: 42px;
        border-bottom: 1px solid #eee;
        font-size: 16px;
        color: #fff;
        overflow: hidden;
        background-color: #2b7fe0;
        border-radius: 2px 2px 0 0;
    }

    .edui-toolbar{
        height: 22px !important;
    }

    .displayNone{
        display: none;
    }
    .feed-ext-body-readers{
        border: 1px solid #ddd;
        border-top: 0;
        padding: 8px 30px;
        background: #F8F8F8;
    }
    .feed-cmt-list-item {
        position: relative;
        padding: 5px 0;
        border-top: 1px dashed #CCC;
        margin: 0 20px;
        line-height: 20px;
    }
    .feed-cmt-list-item a {
        color: #2A94CF;
        text-decoration: none;
    }
    .feed-cmt-content {
        padding: 4px;
        line-height: 1.3;
    }
    .feed-cmt-list-ext {
        position: absolute;
        right: 5px;
        top: 5px;
    }
    .blue_text{
        width:15%;
        padding-left:10px;
        font-weight:bold;
        text-align:right;
        border: 1px #ccc solid;
    }
    .ATTACH_a{
        text-decoration: none;
    }
    .feed-ext-add-comment{
        margin-bottom: 30px!important;
    }
    /*.controls  textarea.inText{*/
    /*float:none;*/
    /*}*/
    .control-label{
        display:block;
    }
    .controls  div{
        float:left;
        margin-top:68px;
    }
    textarea{
        min-height:85px;
    }
    .step2{
        width:98%;
        margin:0 auto;
        display:block;
        float:none;
    }
    .input-medium{
        width:180px;
    }
    select{
        margin-top:0%;
    }
    .control-group{
        height:auto;
    }

    .newlogHeade{
        height:44px;
        line-height:44px;
    }
    .newlogHeade img{
        margin-top:1%;
    }
    .head .one{
        padding:0px 10px;
    }
    #share_type{
        vertical-align:middle;
        position: absolute;
        right: 50px;
    }
    .modular_user{
        display:inline-block;
    }
    .modular_user img{
        width:68px;
        height:68px;
        float:left;
    }
    .head  .titName{
        display:block;
    }
    .newNews {
        border:1px solid #e0e0e0;
    }
    .newNews tr{
        border:1px solid #e0e0e0;
    }
    .title{
        width: 99%;
        height: 50px;
        overflow: hidden;
        margin-left: 10px;
    }
    .title .div_Img{
        float: left;
        width: 23px;
        height: 100%;
        margin-left: 20px;
    }
    .title .new{
        float: left;
        height: 50px;
        line-height: 50px;
        font-size: 22px;
        margin-left: 10px;
        color: #494d59;
    }
    .content_right{
        margin-top:18px;
    }
    .span3{
        margin-top:1.5%;
    }
    .headLog img{
        margin-top: 0.8%;
    }
    .headLog div{
        margin-left: 0.6%;
    }
    .content_right {
        margin-top: -21px;
    }
    .newNews,.newNews tr{
        border:none;
    }
    .btnLog .btn_ok {
        padding-left:15px;
        line-height:30px;
    }
    .btnLog {
        margin-left: 300px;
    }
    .btn_ok{
        background: url(../../img/diary/save.png) no-repeat;
    }

    #rs{
        padding-left:19px;
        line-height:30px;
    }
    .td_s{
        border: 1px #ccc solid;
    }
    .btnLog div{
        width: 80px;
    }

    .modular_info{
        width:85%;
    }

    /*.step2{overflow-y: auto;}*/
    /*#edui1_iframeholder{*/
        /*max-height: 240px;*/
    /*}*/
    /*.edui-default .edui-editor-iframeholder{*/
        /*height:65px!important;*/
    /*}*/
    /*.edui-default .edui-editor-bottomContainer{*/
        /*display: none;*/
    /*}*/
    #word_container{
        min-height: 250px;
    }
    .attacheName{
        width: 100%;
        margin-bottom: 10px;
    }
    .attachDiv{
        border-bottom: #efefef 1px solid;
        margin-bottom: 10px;
    }
    .modular_footer{
        position: inherit;
        margin-top: 10px;
    }
    .modular_info p{
        margin-bottom: 10px !important;
        font-size: 11pt;
        color:#333;
    }
    .modular_info h3{
        height: 30px;
        line-height: 30px;
        font-size: 11pt;
    }
    .modular_info .modular_name{
        font-size: 9pt;
    }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body style="overflow: hidden;">
<%--头部样式--%>
<div class="head w clearfix" style="position: fixed;background: #fff;width:100%;z-index:1000;height:45px;">
    <ul class="index_head clearfix">
        <li data_id=""><span class="one headli1_1 titName"><fmt:message code="main.worklog"/></span>
        </li>
        <%--<li data_id="0" onclick="develop()"><span class="headli2_1"><fmt:message code="diary.th.LogRetrieval"/></span><img class="headli1_2" src="../img/twoth.png" alt=""/></span>--%>
        <%--</li>--%>
    </ul>
</div>
<div class="title">
    <div class="div_Img"></div>
    <div class="new">
        <fmt:message code="main.worklog"/>
    </div>
</div>
<%--日志信息--%>
<div class="clearfix" id="logInfo" style="display:block;overflow: auto;">
    <%--中间部门--%>
    <div class="headLog clearfix">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/logimg.png">
        <div class="">
            <fmt:message code="main.worklog"/>
        </div>
    </div>
    <%--内容部分左侧--%>
    <div class="span3">
        <div>
            <h3 class="diary-user-name"><fmt:message code="email.th.systemmanager"/></h3>
            <ul class="diary-types-box clearfix">
                <li data-type="all" id="all">
                    <div class="diary-types-counter" id="qb">0</div>
                    <div class="diary-types-title"><fmt:message code="diary.th.allLog"/></div>
                </li>
                <li data-type="mine" id="mine">
                    <div class="diary-types-counter" id="zj">0</div>
                    <div class="diary-types-title"><fmt:message code="diary.th.own"/></div>
                </li>
                <li data-type="others" id="others">
                    <div class="diary-types-counter" id="tr">0</div>
                    <div class="diary-types-title"><fmt:message code="diary.th.other"/></div>
                </li>
            </ul>
            <div class="diary-calendar-wrapper" id="calendar_" style="display: block;">
                <%--日历插件--%>
                <div id="ca"></div>
                <div id="diary-date-result" class="tags" style="border: none;"></div>
            </div>
            <%--高级搜索--%>
            <div id="diary-search-box">
                <form class="form-search" name="searchForm">
                    <div class="search_">
                        <i class="icon-search"></i>
                        <i class="icon-chevron-down" id="triangle"></i>
                    </div>

                    <div id="diary-adv-search-box" class="diary-adv-search-box" style="display:none">
                        <div class="control-group control-group2">
                            <div class="controls pull-right">
                                <a class="date-quicklink" id="recent3day" href="javascript:void(0)"><fmt:message code="diary.th.this3"/></a>
                                <a class="date-quicklink" id="recent1week" href="javascript:void(0)"><fmt:message code="diary.th.thisW"/></a>
                                <a class="date-quicklink" id="recent1month" href="javascript:void(0)"><fmt:message code="diary.th.thisM"/></a>
                            </div>
                            <label class="control-label"><b class="date"><fmt:message code="global.lang.date"/></b></label>
                            <div class="controls clearfix">
                                <input type="text" id="startdate">
                                <div class="zhi"><fmt:message code="global.lang.to"/></div>
                                <input type="text" id="enddate">


                            </div>
                        </div>

                        <div class="control-group control-group2">
                            <label class="control-label"><b class="date"><fmt:message code="diary.th.Range"/></b></label>
                            <div class="controls">
                                <select id="diarytype" class="input-medium " name="diarytype">
                                    <option value="1"><fmt:message code="diary.th.all"/></option>
                                    <option value="2"><fmt:message code="diary.th.my"/></option>
                                    <option value="3"><fmt:message code="diary.th.shared"/></option>
                                    <option value="4"><fmt:message code="diary.th.Authorized"/></option>
                                </select>
                            </div>

                        </div>
                        <div id="dept-group" class="control-group">
                            <label class="control-label"><b class="date"><fmt:message code="userManagement.th.department"/></b></label>
                            <div class="controls">
                                <textarea class="inText" id="dept" type="text" disabled></textarea>
                                <div id="dept_add"><fmt:message code="global.lang.add"/></div>
                                <div onclick="empty('dept')"><fmt:message code="global.lang.empty"/></div>
                            </div>
                        </div>

                        <div id="role-group" class="control-group">
                            <label class="control-label"><b class="date"><fmt:message code="userManagement.th.role"/></b></label>
                            <div class="controls">
                                <textarea class="inText" id="add_selectjuese" type="text" disabled></textarea>
                                <div id="priv_add"><fmt:message code="global.lang.add"/></div>
                                <div onclick="empty('add_selectjuese')"><fmt:message code="global.lang.empty"/></div>
                            </div>
                        </div>
                        <div id="user-group" class="control-group">
                            <label class="control-label"><b class="date"><fmt:message code="diary.th.body"/></b></label>
                            <div class="controls">
                                <textarea class="inText" id="add_selectUser" type="text" disabled></textarea>
                                <div id="add_selectUserbtn"><fmt:message code="global.lang.add"/></div>
                                <div onclick="empty('add_selectUser')"><fmt:message code="global.lang.empty"/></div>
                            </div>
                        </div>

                        <div class="control-group control-group2">
                            <!-- Select Basic -->
                            <label class="control-label"><b class="date"><fmt:message code="journal.th.LogTable"/></b></label>
                            <div class="controls">
                                <select class="input-medium " id="diarydb" name="diarydb">
                                    <option value=""><fmt:message code="journal.th.CurrentLog"/></option>

                                </select>
                            </div>
                        </div>

                        <div class="control-group control-group3">
                            <a href="javascript:void(0);" id="buttonQuery" class="button_  button_query"><fmt:message code="global.lang.query"/></a>
                            <a href="javascript:void(0);" id="" class="button_" onclick="develop()"><fmt:message code="global.lang.report"/></a>
                        </div>
                    </div>


                </form>
            </div>
        </div>

        <div class="writeLog" id="writeLog"><fmt:message code="diary.th.write"/></div>
        <%--<dl id="diary-cmt-list" class="diary-cmt-list">--%>
        <%--<dt>--%>
        <%--系统管理员 <i>回复了</i>--%>
        <%--</dt>--%>
        <%--<dd>--%>
        <%--<a target="_blank" href="show_diary.php?dia_id=216">《2017-05-12 星期五 工作日志》</a>--%>
        <%--</dd>--%>
        <%--</dl>--%>
    </div>
    <%--内容部分右侧--%>
    <div class="content_right clearfix">
        <div class="button_news clearfix">
            <button class="btn" type="button" id="allPeople"><fmt:message code="diary.th.lookAll"/></button>
            <button class="btn active" type="button" id="oneselfPeople"><fmt:message code="diary.th.yourself"/></button>
            <button class="btn" type="button" id="otherPeople"><fmt:message code="diary.th.lookOthers"/></button>
        </div>
        <div class="details clearfix" id="details" style="zoom:0">
            <%--第一板块--%>
        </div>
        <!-- 分页按钮-->
        <div class="M-box3">
        </div>
    </div>
</div>
<%--新建日志--%>
<div id="lognewBox" style="overflow: auto;">
    <div id="logNew" class="clearfix" style="display:none;padding-top:0px;">
        <div class="newLog_left">
            <%--中间部门--%>
            <div class="headLog newlogHeade clearfix" style="margin-top:-5px">
                <img src="../img/workLog/reviseLog.png">
                <div class="log">
                    <fmt:message code="diary.th.new"/>
                </div>
            </div>
            <!-- 新建日志页面********************* -->


            <div class="step2" >
                <!-- 中间部分 -->
                <table class="newNews" style="width:70%;margin-top:20px;margin-left:170px;border: 1px #ccc solid;table-layout: fixed;">
                    <tbody>
                    <tr>
                        <td class="td_w blue_text">
                            <fmt:message code="notice.th.title"/>：
                        </td>
                        <td class="td_s">
                            <input class="td_title1" id="query_subject" style="width:390px;text-align:left;border-radius:3px" type="text" placeholder="<fmt:message code="diary.th.logTitle"/>"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_w blue_text">
                             <fmt:message code="global.lang.date"/>：
                        </td>
                        <td class="td_s">
                            <div class="row-fluid clearfix" style="text-align:left;">
                                <input type="text" id="inputsendTime" name="dia_date" class="input-medium" value="" style="text-align:left;width:390px;">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_w blue_text">
                             <fmt:message code="notice.th.type"/>：
                        </td>
                        <td class="td_s">
                            <div>
                                <select class="input-medium" name="dia_type" id="diary_log" onclick="diary_log()" style="width:396px;">
                                    <option value="1"><fmt:message code="main.worklog"/></option>
                                    <option value="2"><fmt:message code="diary.th.personLog"/></option>
                                </select>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="blue_text" valign="top">
                            <fmt:message code="notice.th.content"/>：
                        </td>
                        <!--word编辑器-->
                        <td class="td_s">
                            <div class="content" id="word_container" name="content"  style="width: 100%;"></div>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" class="blue_text">
                            <div class="control-group" id="dia_share" style="display:block;">
                                <label class="control-label" style="position:relative;" for="share_type"><input id="share_type" type="checkbox" name="share_type" value="1" onclick="share()"><span style="margin-right:5px;"><fmt:message code="diary.th.Share"/>:</span> </label>
                            </div>
                        </td>
                        <td class="td_s">
                            <div id="share" style="display: none;">
                                <!-- Textarea -->
                                <div class="textarea">
                                    <input type="hidden" name="to_id" value="">
                                    <textarea class="SmallStatic" id="add_text" name="to_name" style="margin: 0px;width: 390px;height: 60px;" readonly=""> </textarea>
                                    <span align="right" style="margin-top:5px;margin-bottom: 8px;">
                                        <a href="javascript:void(0);" class="orgAdd" id="add_log" style="color:#1772c0"><fmt:message code="global.lang.add"/></a>
                                        <a href="javascript:void(0);" class="orgClear" style="color:#1772c0" onclick="clearData()"><fmt:message code="global.lang.empty"/></a>
                                    </span>
                                </div>

                                <%--<label class="sms-remind-labe_" style="padding-right:10px">--%>
                                    <%--<input type="checkbox" name="share_init" value="1"><fmt:message code="global.lang.query"/>--%>
                                <%--</label>--%>
                                <%--<label class="sms-remind-labe_" style="padding-right:10px"><input type="checkbox" name="" checked=""><fmt:message code="notice.th.remindermessage"/>--%>
                                <%--</label>--%>
                                <%--<label class="sms-remind-labe_" style="padding-right:10px"><input type="checkbox" name="" checked=""> <fmt:message code="notice.th.share"/>--%>
                                <%--</label>--%>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="blue_text">
                            <span style="margin-right:5px;">
                                <fmt:message code="email.th.file"/>:
                            </span>

                        </td>
                        <td class="enclosure td_s">
                            <div id="query_uploadArr" style="margin-bottom: 5px;"></div>
                            <div style="float: left;margin-right: 10px;"><img src="../img/mg11.png" alt=""/></div>
                            <div style="float: left;">
                                <form id="uploadimgform" target="uploadiframe" action="../upload?module=diary"
                                      enctype="multipart/form-data" method="post" style="position: relative">
                                    <input type="file" name="file" multiple="multiple" id="uploadinputimg" class="w-icon5"
                                           style="position: absolute;opacity: 0;width: 70px;
filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
                                    <a id="uploadimg" style="cursor: pointer;"><fmt:message code="notice.th.addfile"/></a>
                                </form>
                            </div>
                            <%--<div><img class="left_img" src="../img/mg12.png" alt=""/></div>--%>
                            <%--<div class="enclosure_t"><a href="#"><fmt:message code="notice.th.net"/></a></div>--%>
                        </td>
                    </tr>

                    </tbody>
                </table>
            </div>
        </div>
        <div class="foot_log" style="float:left;width: 100%;">
            <div class="btnLog" style="margin-left: 0;">
                <div id="hd" type="publish" class="btn_ok"><fmt:message code="global.lang.save"/></div>
                <div id="rs" type="save" class="btn_return"><fmt:message code="notice.th.return"/></div>
            </div>
        </div>

    </div>
</div>





</body>
<script>
    <%--获取标题--%>
    function getTitle(){
        $.ajax({
            url:'/users/getUserTheme',
            type:'post',
            dataType:'json',
            success:function(res){
                var data=res.object;
                $('.diary-user-name').html(data.userName)
            }
        })
    }
    getTitle()

    var data = {
        page: 1,
        pageSize: 10,
        useFlag: true,
        startBegin:'', //查询时间 开始
        startEnd: '',   //查询时间 结束
        userId:'',    //查询范围 用户范围
        userPriv:'',    //查询范围 角色范围
        deptId:'',  //查询范围 用户范围
        queryScope:'',//高级查询的范围
        time:''

    };
    var user_id='userDuser';
    var ue;
    $(function () {
         ue= UE.getEditor('word_container',{elementPathEnabled : false});
        autodivheight();
        function autodivheight() {
            var winHeight = 0;
            if (window.innerHeight)
                winHeight = window.innerHeight;
            else if ((document.body) && (document.body.clientHeight))
                winHeight = document.body.clientHeight;
            if (document.documentElement && document.documentElement.clientHeight)
                winHeight = document.documentElement.clientHeight;
            winWidth = document.documentElement.clientWidth;
            document.getElementById("lognewBox").style.height = winHeight - 46  + "px";
            document.getElementById("logInfo").style.height = winHeight - 46  + "px";
        }
        window.onresize = autodivheight;
        $('#uploadinputimg').fileupload({
            dataType:'json',
            done: function (e, data) {
                if(data.result.obj != ''){
                    var data = data.result.obj;
                    var str = '';
                    var str1 = '';
                    for (var i = 0; i < data.length; i++) {
                        str += '<div class="dech" deUrl="' + data[i].attUrl+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden"  NAME="' + data[i].attachName + '*" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                    }
                    $('#query_uploadArr').append(str);
                }else{
                    //alert('添加附件大小不能为空!');
                    layer.alert('添加附件大小不能为空!',{},function(){
                        layer.closeAll();
                    });
                }
            }
        });

        $('#query_uploadArr').on('click','.deImgs',function(){
            var data=$(this).parents('.dech').attr('deUrl');
            var dome=$(this).parents('.dech');
            deleteChatment(data,dome);
        })

        //删除附件
        function deleteChatment(data,element){

            layer.confirm('<fmt:message code="menuSSetting.th.isdeleteMenu" />？', {/*确定要删除吗*/
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮 /* 确定  取消*/
                title:'<fmt:message code="notice.th.DeleteAttachment" />'/*删除附件*/
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'get',
                    url:'../delete',
                    dataType:'json',
                    data:data,
                    success:function(res){

                        if(res.flag == true){
                            layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});/*删除成功*/
                            element.remove();
                        }else{
                            layer.msg('<fmt:message code="lang.th.deleSucess" />', { icon:6});/*删除失败*/
                        }
                    }
                });

            }, function(){
                layer.closeAll();
            });
        }


//         日历插件
        $('#ca').calendar({
            width: 250,
            height: 160,

            data: [
                {
                    date: '2015/12/24',
                    value: 'Christmas Eve'
                },
                {
                    date: '2015/12/25',
                    value: 'Me rry Christmas'
                },
                {
                    date: '2016/01/01',
                    value: 'Happy New Year'
                }
            ],
            onSelected: function (view, date) {
//                console.log('view:' + view)
                //alert('date:' + date.Format('yyyy-MM-dd'))

                data.queryScope =5;   //queryScope=5

                data.time =  date.Format('yyyy-MM-dd');    //当前时间
                initPageList_rl(function (pageCount) {
                    initPagination_rl(pageCount, data.pageSize);
                });

            }
        });
        //新建日志的设置当前时间
        $("#inputsendTime").val(getNowFormatDate1());
        // 日历和高级查询的切换和隐藏
        $("#triangle").on('click', function () {
            $("#diary-adv-search-box").toggle();
            $("#calendar_").toggle();

            //  小箭头切换类名
            if ($("#diary-adv-search-box").css('display') == 'none') {
                $("#triangle").addClass("icon-chevron-down").removeClass("icon-chevron-up");
                document.getElementById("diary-search-box").style.borderTop = "1px solid #dbdbdb";

            } else {
                $("#triangle").addClass("icon-chevron-up").removeClass("icon-chevron-down");
                document.getElementById("diary-search-box").style.borderTop = "none"; //高级编辑的时候上边框为空

            }

        });
        //  评论的显示和隐藏
        $(".commentNumber").on('click', function () {
            $("#comment").toggle();
            if ($("#comment").css('display') == 'block') {
                document.getElementById("commentNumber").style.color = "#1687cb";
                document.getElementById("commentNumber").style.textDecoration = "underline";
            } else {
                document.getElementById("commentNumber").style.color = "#b4b4b4";
                document.getElementById("commentNumber").style.textDecoration = "none";
            }
        });
        //写日志按钮
        $("#writeLog").on("click", function () {
            $("#logInfo").hide();
            $("#logNew").show();
            $(".log").html("<fmt:message code="diary.th.new"/>");
            $('#hd').attr('ac','add');

        });
        //新建页面的返回按钮
        $("#rs").on("click", function () {
            $("#logInfo").show();
            $("#logNew").hide();
            location.reload();

        });
        //点击看所有人按钮
        $("#allPeople").on("click", function () {
            $(this).addClass('active').siblings('').removeClass('active');
            initPageList_sy(function (pageCount) {
                initPagination_sy(pageCount, data.pageSize);
            });

        });
        $("#all").on("click", function () {
            initPageList_sy(function (pageCount) {
                initPagination_sy(pageCount, data.pageSize);
            });
            $("#allPeople").addClass('active').siblings('').removeClass('active');
        });
        //点击看自己按钮
        <!-- 介意用异步 -->
        $("#oneselfPeople").on("click", function () {
            $(this).addClass('active').siblings('').removeClass('active');
            initPageList_zj(function (pageCount) {
                initPagination_zj(pageCount, data.pageSize);
            });
        });
        $("#mine").on("click", function () {
            /*$(this).addClass('active').siblings('').removeClass('active');*/
            initPageList_zj(function (pageCount) {
                initPagination_zj(pageCount, data.pageSize);
            });
            $("#oneselfPeople").addClass('active').siblings('').removeClass('active');
        });
        initPageList_zj(function (pageCount) {
            initPagination_zj(pageCount, data.pageSize);
        });
        //点击看其他人按钮
        <!-- 介意用异步 -->
        $("#otherPeople").on("click", function () {
            $(this).addClass('active').siblings('').removeClass('active');
            initPageList_qt(function (pageCount) {
                initPagination_qt(pageCount, data.pageSize);
            });
        });
        $("#others").on("click", function () {
            initPageList_qt(function (pageCount) {
                initPagination_qt(pageCount, data.pageSize);
            });
            $("#otherPeople").addClass('active').siblings('').removeClass('active');
        })
        //获取3天内的日期
        $("#recent3day").on("click", function () {
            $("#enddate").val(getNowFormatDate1());
            $("#startdate").val(getNowFormatDate2());
        });
        //获取本周内的日期
        $("#recent1week").on("click", function () {
            $("#enddate").val(getNowFormatDate1());
            $("#startdate").val(getWeekStartDate());
        });
        //获取本月内的日期
        $("#recent1month").on("click", function () {
            $("#enddate").val(getNowFormatDate1());
            $("#startdate").val(getMonthStartDate());
        });
        //高级查询接口
        $("#buttonQuery").on("click", function () {
            data.startBegin = $("#startdate").val();   //查询时间 开始
            data.startEnd = $("#enddate").val();    //查询时间 结束
            data.userId = $("#add_selectUser").attr("user_id");    //查询范围 人员范围
            data.userPriv = $("#add_selectjuese").attr("userpriv");   //查询范围 角色范围
            data.deptId = $("#dept").attr("deptid");  //查询范围部门范围
            data.queryScope = $('#diarytype option:checked').attr('value');   //高级查询的范围
            initPageList_query(function (pageCount) {
                initPagination_query(pageCount, data.pageSize);
            });
        });
        //新建日志 编辑日志接口
        $("#hd").on("click",function(){
            var aId='';
            var uId='';
            for(var i=0;i<$('#query_uploadArr .inHidden').length;i++){
                aId += $('#query_uploadArr .inHidden').eq(i).val();
                uId += $('#query_uploadArr .inHidden').eq(i).attr('NAME');
            };
            var data = {
                "diaType": $('#diary_log option:checked').attr('value'),    // (日志类型(1-工作日志,2-个人日志))
                "subject": $("#query_subject").val(),      //（日志标题）
                "content": ue.getContent()  ,//（日志内容）
                "toAll":0,// （是否全部共享(0-否,1-是)）
                "toId": $("#add_text").attr("user_id"), //（共享用户ID串,人员控件）
                "attachmentId":aId,//（附件ID串）
                "attachmentName":uId, //（附件名称串）
                "diaDate":$('#inputsendTime').val()
            };
            if($(this).attr("ac")=="update"){
                var noId=$(this).attr("noId");
                data['diaId']=noId;
                update(data);
            }else if($(this).attr("ac")=="add") {
                add_log(data);
            };
            //新建保存的数据接口
            function add_log(data){
                $.ajax({
                    type: "post",
                    url: "<%=basePath%>diary/save",
                    dataType: 'json',
                    data: data,
                    success: function (obj) {
                        $.layerMsg({content:'<fmt:message code="diary.th.modify"/>！',icon:1},function(){
                            $("#logInfo").show();
                            $("#logNew").hide();
                            location.reload();
                        });
                    }
                });
            };
            //修改保存的数据接口
            function update(data){
                $.ajax({
                    url: "<%=basePath%>diary/update",
                    type: "get",
                    data: data,
                    dataType: 'json',
                    success: function (obj) {
                        $.layerMsg({content:'<fmt:message code="depatement.th.Modifysuccessfully"/>！',icon:1},function(){
                            $("#logInfo").show();
                            $("#logNew").hide();
                            location.reload();
                        });
                    }
                })
            }
        })

        // 删除评论
        $('.feed-cmt-del-handle').click(function () {

        })
    });


    //日志共享弹窗
    function share_log(that){
        var diarId=that.attr('diaId');
        layer.open({
            type: 1,
            /* skin: 'layui-layer-rim', //加上边框 */
            offset: '80px',
            area: ['400px', '300px'], //宽高
            title:'<fmt:message code="diary.th.Share"/>',
            closeBtn: 0,
            content: '<div id="" class="ry">'+
            '<label class="control-label"><b class="date"><fmt:message code="diary.th.body"/></b></label>'+
            '<div class="controls">'+
            '<textarea class="inText" id="gx_text" type="text" disabled></textarea>'+
            '<div id="add_gx"><fmt:message code="global.lang.add"/></div>'+
            '<div><fmt:message code="global.lang.empty"/></div>'+
            '</div>'+
            ' </div>',
            btn:['<fmt:message code="global.lang.ok"/>', '<fmt:message code="global.lang.close"/>'],
            yes: function(){
                var userId=$('#gx_text').attr('user_id');

                commentShare(diarId,userId);
                layer.closeAll();
            }
        });
        $('#add_gx').click(function(){
            user_id='gx_text';
            $.popWindow("../common/selectUser");
        })
    }
    //日志共享接口
    function commentShare(id,userId){
        $.ajax({
            type:'post',
            url:'<%=basePath%>diary/update',
            dataType:'json',
            data:{'diaId':id,'toId':userId},
            success:function(){
                $.layerMsg({content:'<fmt:message code="diary.th.sharedSuccess" />！',icon:1});/*共享成功*/
            }
        })
    }
    //日志删除接口
    function delete_log(i,type){
        var data1={
            'diaId':$(".delete"+i).attr("del")
        };
        $.layerConfirm({title:'<fmt:message code="workflow.th.suredel"/>',content:'<fmt:message code="workflow.th.que"/>',icon:0},function(){
            $.ajax({
                url:"<%=basePath%>diary/delete",
                type:'get',
                dataType:"JSON",
                data : data1,
                success:function(dataResult){
                    if("allPeople"==$(".active").attr("id")){
                        $(this).addClass('active').siblings('').removeClass('active');
                        initPageList_sy(function (pageCount) {
                            initPagination_sy(pageCount, data.pageSize);
                        });
                    }else{
                        location.reload();
                    }
                },
                error:function(e){
                    console.log(e);
                }
            });
        },function(){
            return false;
        })
    }
    //日志编辑接口
    function edit_log(i){
        $("#logInfo").hide();
        $("#logNew").show();
        $(".log").html("<fmt:message code="diary.th.modi"/>");
        $('#hd').attr('ac',"update");
        $('#hd').attr('noId',$(".edit"+i).attr("del"));
        var data={
            'diaId':$(".edit"+i).attr("del")
        };
        /* alert(data.diaId);*/
        $.ajax({
            url:"<%=basePath%>diary/getConByDiaId",
            type:'get',
            dataType:"JSON",
            data : data,
            success:function(data){
//                alert(data.object.toIdName);
                $("#diary_log").find("option[value="+data.object.diaType+"]").attr("selected",true);//(日志类型(1-工作日志,2-个人日志))
                $("#query_subject").val(data.object.subject); //（日志标题）
                ue.setContent(data.object.content);//（日志内容）
                if(data.object.diaType==1){
                    $("#dia_share").show();
                }else{
                    $("#dia_share").hide();
                };// （日志类型(1-工作日志,2-个人日志 控制显示隐藏）
                if(data.object.toIdName=""){
//                    alert(1);
                    $('input:checkbox').attr("checked", false);
                    $("#share").hide();
                }else{
                    $('input:checkbox').attr("checked", true);
                    $("#share").show();
                };// （是否全部共享(0-否,1-是)）
                $("#add_text").val(data.object.toIdName);//（共享用户ID串,人员控件）
                $("#add_text").attr("user_id",data.object.toId);
                //附件下载
                var str1 = "";
                var arr = new Array();
                arr = data.object.attachment;
                if (data.attachmentName != '') {
                    for (var i = 0; i < (arr.length); i++) {
                        str1 += '<div class="font_"><a href="<%=basePath%>download?' + encodeURI(arr[i].attUrl) + '"><img class="img_" src="../img/enclosure.png"/>' + arr[i].attachName + '</a></div></br>'+
                            '<input type="hidden" class="inHidden" NAME="'+arr[i].attachName+'*" value="'+arr[i].aid+'@'+arr[i].ym+'_'+arr[i].attachId+',">';
                    }
                    $('#query_uploadArr').append(str1);
                };
                $()
            },
            error:function(e){
                console.log(e);
            }
        });
    }
    /* 日志详情页 */
    function windowOpen(i){
        var nid = i;
        <%--$.popWindow("<%=basePath%>diary/details?id="+nid+"")--%>
        window.open ("<%=basePath%>diary/details?id="+nid, "newwindow", "height=650, width=1012, top=100, left=300, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
    }

    //看你自己评论的显示和隐藏
    function details(i,diaId) {
        $('.btn-primary').attr('btnType','2');
        if ($("#comment" + i).css('display') == 'block') {
             $("#comment" + i).hide();
            $(".commentNumber" + i).removeClass("font_color");
        } else {
            console.log('xianshi');
            disComment(i,diaId)
            $("#comment" + i).show();
            $(".commentNumber" + i).addClass("font_color");
            var a=$('.feed-ext-comment-sms-advcomment');

            a.on('click',function () {
                var ischecked = $(this).find("[name='advcomment']").prop('checked');
                //console.log(ischecked);
                if(ischecked){
                    $textarea= $(this).parents().children('.feed-submit-cmt-context');
                    var $id=$(this).parents('.feed-ext-add-comment').parent().prop('id')+'s';
                    $($textarea).prop('id',$id);
                    var ue = UE.getEditor($id);
                }
            })
            $('.txt').click(function(){//隐藏富文本
                //console.log('123')
                $('.feed-submit-cmt-context').css('height',0)
                $('.feed-submit-cmt-context').show();
                $(".edui-editor").hide();
            })
            $('.advcomment').click(function(){//显示富文本
                //$(".feed-ext-add-comment .feed-submit-cmt-context").css('height',87);
                //console.log('478')
                $(".edui-editor").show();
            })
            $('.feed-ext-comment-sms-advcomment .advcomment').eq(0).css('background','red');
        }
    };
var lg

    //看自己函数
    function initPageList_zj(cb) {
        $("#details").html("");
        $.ajax({
            url: "<%=basePath%>diary/getIndex",
            type: 'get',
            dataType: "JSON",
            data: data,
            success: function (obj) {
                if (obj.obj.length == 0) {
                    $("#qb").html(obj.msg.split(",")[0]);
                    $("#zj").html(obj.msg.split(",")[1]);
                    $("#tr").html(obj.msg.split(",")[2]);
                    $.layerMsg({content:'<fmt:message code="global.lang.nodata"/>',icon:6},function(){});
                    if (cb) {
                        cb(0);
                    }
                } else {
                    var str = "";
                    for (var i = 0; i < obj.obj.length; i++) {
                        var dia_type='';
                        if(obj.obj[i].diaType == '1'){
                            dia_type='<fmt:message code="main.worklog" />';/*工作日志*/
                        }else if(obj.obj[i].diaType == '2'){
                            dia_type='<fmt:message code="diary.th.personLog" />';/*个人日志*/
                        }
                        var src_sex ="";
                        if(obj.obj[i].sex == '0'){
                            src_sex='/img/workLog/basichead_man.png';
                        }else{
                            src_sex='/img/workLog/portrait3.png';
                        }
                        var stra='';
                        if(obj.obj[i].attachment != ''){
                            for(var j=0;j<obj.obj[i].attachment.length;j++){
                                stra+='<div class="font_">' +
                                    '<a download="'+ encodeURI(obj.obj[i].attachment[j].attUrl)+'" style="color: #207BD6;" href="<%=basePath%>download?'+ encodeURI(obj.obj[i].attachment[j].attUrl) + '">' +
                                    '<img class="img_" src="../img/enclosure.png"/>' + obj.obj[i].attachment[j].attachName + '</a></div>'+
                                    '<input type="hidden" class="inHidden" NAME="'+obj.obj[i].attachment[j].attachName+'*" value="'+obj.obj[i].attachment[j].aid+'@'+obj.obj[i].attachment[j].ym+'_'+obj.obj[i].attachment[j].attachId+',">';
                            }
                        }

                        str += '<div class="tianErNiu1" dailId="'+obj.obj[i].diaId+'">' +
                            '<div class="details_modular clearfix">' +
                            <%--头像--%>
                            //                            ' <div class="modular_user"></div>' +
                            ' <div class="modular_user"  style="float:left"><img src="'+src_sex+'"></div>' +
                            <%--内容部分--%>
                            '<div class="modular_info" >' +
                            ' <div class="modular_title clearfix">' +
                            '<div class="modular_name clearfix">' +
                            '<ul>' +
                            '<li><a href="javascript:;">' + obj.obj[i].userName + '</a></li>' +
                            '<li>'+obj.obj[i].deptName+'</li>' +
                            '<li>'+obj.obj[i].userPrivName+'</li>' +
                            '<li>'+dia_type+'</li>' +
                            ' </ul>' +
                            ' </div>' +
                            '<div class="modular_time">' + function(){
                                if(obj.obj[i].diaDate == undefined){
                                    return ''
                                }else{
                                    return obj.obj[i].diaDate
                                }
                            }() + '</div>' +
                            ' </div>' +
                            '<h3 onclick= "windowOpen(' +obj.obj[i].diaId+ ')">' + obj.obj[i].subject + '</h3>' +
                            '<div style="margin-bottom: 20px;text-overflow:ellipsis;overflow:hidden;white-space：nowrap;">' + obj.obj[i].content + '</div>' + function () {
                                if(obj.obj[i].attachment != ''){
                                    return '<div class="attacheName">' +
                                    '<div class="attachDiv">附件：</div>' +
                                        '<div style="margin-bottom: 5px;">'+stra+'</div>' +
                                    '</div>';
                                }else{
                                    return '';
                                }
                            }()+
                            '<div class="modular_footer">' +
                            ' <ul>' +
                            '<li><a href="javascript:;" class="commentNumber' + i + '" onclick= "details(' + i + ',' + obj.obj[i].diaId + ')"><fmt:message code="news.th.comment"/>('+obj.obj[i].comTotal+')</a></li>' +
                            ' <li><a href="javascript:;" class="share' + i + '" diaId="'+obj.obj[i].diaId+'" onclick= "share_log($(this))"><fmt:message code="diary.th.Share"/></a></li>' +
                            '<li><a href="javascript:;"   del='+obj.obj[i].diaId+' class="edit' + i + '" onclick= "edit_log(' + i + ')"><fmt:message code="global.lang.edit"/></a></li>' +
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="delete' + i + '" onclick= "delete_log(' + i + ')"><fmt:message code="global.lang.delete"/></a></li>' +
                            ' <li><a href="javascript:;" onclick="setTop(' + i + ','+ obj.obj[i].diaId +','+obj.obj[i].topFlag+')">'+ function(){ if(obj.obj[i].topFlag==0){ return "  <fmt:message code="notice.th.top"/> " } else { return "<fmt:message code="news.th.quittop" />"} }()+'</a></li>' +
                            '  <li><a href="javascript:;" onclick="showReaders(' + i +','+ obj.obj[i].diaId + ')"><fmt:message code="diary.th.show"/></a></li>' +
                            ' </ul>' +
                            '</div>' +
                            '</div>' +
                            '</div>' +
                            <%--评论--%>
                            '<div class="feed-ext-body comment' + i + '" id="comment' + i + '" style="display: none;">' +
                            '<div class="feed-ext-add-comment">' +
                            '<form target="" action="" name="feed-comment-form">' +
                            ' <div class="feed-ext-add-comment-to" style="width:100px;height:28px;line-hight:28px;border:#ccc 1px solid;margin-bottom:5px;display:none;"></div>' +
                            ' <textarea class="feed-submit-cmt-context" name="feed-submit-cmt-context"></textarea>' +
                            '<button type="button" class="btn btn-primary feed-submit-cmt-btn" cutId="" onclick="commentDia($(this),' + i +','+obj.obj[i].diaId+ ')"><fmt:message code="diary.th.remand"/></button>' +
                            '<input type="hidden" name="comment-to" value="">' +
                            ' <input type="hidden" name="comment-id" value="">' +
                            '<input type="hidden" name="comment-type" value="">' +
                            '<input type="hidden" name="diary-id" value="11">' +
                            ' <div class="feed-ext-comment-sms-op">' +
                            '<label class="sms-remind-label">' +
                            ' <input type="checkbox" name="" id="SMS_REMIND_11" checked=""><fmt:message code="notice.th.remindermessage"/></label>' +
                            ' </div>' +
                            ' <div class="feed-ext-comment-sms-advcomment">' +
                            '<label> <input type="checkbox" name="advcomment" class="advcomment"><fmt:message code="diary.th.AdvancedReview"/> </label>' +
                            ' </div>' +
                            ' </form>' +
                            ' </div>' +
                            '   <ul class="feed-ext-list">' +

                            ' </ul>' +
                            '  </div>' +
                            // 浏览信息
                            ' <div class="feed-ext-body-readers displayNone  readers_div'+i+'  ">' +
                            '   <div class="feed-ext-readers">' +
                            '      <span></span>' +
                            '   </div> ' +
                            ' </div>'+
                            '</div>';
                    }
                    $("#qb").html(obj.msg.split(",")[0]);
                    $("#zj").html(obj.msg.split(",")[1]);
                    $("#tr").html(obj.msg.split(",")[2]);

                    $("#details").html(str);
                    if (cb) {
                        cb(obj.msg.split(",")[1]);
                    }
                }
            },
            error: function (e) {
                console.log(e);
            }
        });
    }
    //看自己分页函数
    function initPagination_zj(totalData, pageSize) {
        $('.M-box3').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            current: data.page,
            homePage: '<fmt:message code="global.page.first" />',
            endPage: '<fmt:message code="global.page.last" />',
            prevContent: '<fmt:message code="global.page.pre" />',
            nextContent: '<fmt:message code="global.page.next" />',
            jumpBtn: '<fmt:message code="global.page.jump" />',
            callback: function (index) {
                data.page = index.getCurrent();
                console.log(index.getCurrent());
                initPageList_zj(function (pageCount) {
                    /*   console.log(pageCount);*/
                    initPagination_zj(pageCount, data.pageSize);
                });
            }
        });
    }
    //看所有人评论的显示和隐藏
    function details_sy(i,diaId) {
        if ($("#comment_sy" + i).css('display') == 'block') {
            $("#comment_sy" + i).hide();
            $(".commentNumber" + i).removeClass("font_color");

        } else {
            $.ajax({
                url: "<%=basePath%>diary/getDiaryCommentByDiaId",
                type: 'get',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
//                        for (var j = 0; j < res.obj.length; j++) {
//                            str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">' +
//                                '<a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
//                                '<div class="feed-cmt-list-ext">' +
//                                '<span style="margin-right: 20px;">'+res.obj[j].sendTime+'</span>' +
//                                '<a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus">删除</a> ' +
//                                '<a class="feed-cmt-reply-handle" num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:;" hidefocus="hidefocus">回复</a>' +
//                                '</div>' +
//                                '<div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
//                                '<div class="feed-cmt-attachments"> </div> ' +
//                                '</li>';
//                        }

                        for (var j = 0; j < res.obj.length; j++) {
                            var stra='';
                            if(res.obj[j].diaryCommentReplyModelList != ''){/*回复  删除 回复*/

                                for(var i=0; i<res.obj[j].diaryCommentReplyModelList.length; i++){

                                    stra+='<ul><li class="feed-cmt-list-item " style="border-top:none;">' +
                                        '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].diaryCommentReplyModelList[i].replyerName+'</a>&nbsp; &nbsp;<span><fmt:message code="global.lang.reply" /></span>&nbsp;&nbsp;<a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].diaryCommentReplyModelList[i].toName+'</a>' +
                                        '   <div class="feed-cmt-list-ext">' +
                                        '       <span>'+res.obj[j].diaryCommentReplyModelList[i].replyTime+'</span>' +
                                        '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].diaryCommentReplyModelList[i].replyId+'" data-cmt-type="" href="javascript:;" onclick="deleteReplayCom($(this))"><fmt:message code="global.lang.delete" /></a> ' +
                                        '       <a class="feed-cmt-reply-handle" data-cmd="replyComment" data-to-id="" data-cmt-type="" data-to-text="" href="javascript:;"><fmt:message code="global.lang.reply" /></a>' +
                                        '   </div>    ' +
                                        '   <div class="feed-cmt-content">'+res.obj[j].diaryCommentReplyModelList[i].replyComment+'</div> ' +
                                        '</li></ul>';
                                }/*删除 回复*/
                                str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                    '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                    '   <div class="feed-cmt-list-ext">' +
                                    '       <span>'+res.obj[j].sendTime+'</span>' +
                                    '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="global.lang.delete" /></a> ' +
                                    '       <a class="feed-cmt-reply-handle"  num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:;"><fmt:message code="email.th.reply" /></a>' +
                                    '      <span class="feed-cmt-list-time" title="'+res.obj[j].sendTime+'" > </span>' +
                                    '   </div>    ' +
                                    '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                    '   <div class="feed-cmt-attachments">'+stra+'</div> ' +
                                    '</li>';
                            }else{ /*删除 回复*/
                                str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                    '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                    '   <div class="feed-cmt-list-ext">' +
                                    '       <span style="margin-right: 20px;">'+res.obj[j].sendTime+'</span>' +
                                    '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="menuSSetting.th.deleteMenu" /></a> ' +
                                    '       <a class="feed-cmt-reply-handle" num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:void(0);" hidefocus="hidefocus"><fmt:message code="email.th.reply" /></a>' +
                                    '   </div>    ' +
                                    '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                    '</li>';
                            }

                        }
                        $("#comment_sy"+ i +" ul").html(str);
                    }
                }
            });
            $("#comment_sy" + i).show();


            $(".commentNumber" + i).addClass("font_color");

        var a=$('.feed-ext-comment-sms-advcomment');
        a.on('click',function () {
            console.log('danji');
            var ischecked = $(this).find("[name='advcomment']").prop('checked');
            console.log(ischecked);
            if(ischecked){
//            alert("33333");
                $textarea= $(this).parents().children('.feed-submit-cmt-context');
                var $id=$(this).parents('.feed-ext-add-comment').parent().prop('id')+'s';

                // $id.css('height','67px');
                $($textarea).prop('id',$id)
//            var $textarea = $panel.find(".feed-submit-cmt-context")[0];
//            $textarea.value = $textarea.value.replace(/\n/ig, '</br>');
                var ue = UE.getEditor($id);
//            replaceEditor($textarea,{
//                width:565,
//                height:85,
//                toolbar:'Feedback',
//                allowedContent:true
//            });
//            $(this).hide();
            }
        })

        $('.feed-ext-comment-sms-advcomment .advcomment').eq(0).css('background','red');
    }


    };
    //看所有人函数
    function initPageList_sy(cb) {
        $("#details").html("");
        $.ajax({
            url: "<%=basePath%>diary/getAll",
            type: 'post',
            dataType: "JSON",
            data: data,
            success: function (obj) {
                if (obj.obj.length == 0) {
                    $.layerMsg({content:'<fmt:message code="global.lang.nodata"/>',icon:6},function(){});
                    <%--alert("<fmt:message code="global.lang.nodata"/>！");--%>
                    if (cb) {
                        cb(0);
                    }
                } else {
                    var str = "";
                    for (var i = 0; i < obj.obj.length; i++) {
                        var dia_type='';
                        if(obj.obj[i].diaType == '1'){
                            dia_type='<fmt:message code="main.worklog" />';/*工作日志*/
                        }else if(obj.obj[i].diaType == '2'){
                            dia_type='<fmt:message code="diary.th.personLog" />';/*个人日志*/
                        }
                        var src_sex ="";
                        if(obj.obj[i].sex == '0'){
                            src_sex='/img/workLog/basichead_man.png';
                        }else{
                            src_sex='/img/workLog/portrait3.png';
                        }
                        var stra='';
                        if(obj.obj[i].attachment != ''){
                            for(var j=0;j<obj.obj[i].attachment.length;j++){
                                stra+='<div class="font_">' +
                                    '<a download="'+ encodeURI(obj.obj[i].attachment[j].attUrl)+'" style="color: #207BD6;" href="<%=basePath%>download?'+ encodeURI(obj.obj[i].attachment[j].attUrl) + '">' +
                                    '<img class="img_" src="../img/enclosure.png"/>' + obj.obj[i].attachment[j].attachName + '</a></div>'+
                                    '<input type="hidden" class="inHidden" NAME="'+obj.obj[i].attachment[j].attachName+'*" value="'+obj.obj[i].attachment[j].aid+'@'+obj.obj[i].attachment[j].ym+'_'+obj.obj[i].attachment[j].attachId+',">';
                            }
                        }
                        str += '<div class="tianErNiu1">' +
                            '<div class="details_modular clearfix">' +
                            <%--头像--%>
                            //                            ' <div class="modular_user"></div>' +
                            ' <div class="modular_user"  style="float:left"><img src="'+src_sex+'"></div>' +
                            <%--内容部分--%>
                            '<div class="modular_info">' +
                            ' <div class="modular_title clearfix">' +
                            '<div class="modular_name clearfix">' +
                            '<ul>' +
                            '<li><a href="javascript:;">' + obj.obj[i].userName + '</a></li>' +
                            '<li>'+obj.obj[i].deptName+'</li>' +
                            '<li>'+obj.obj[i].userPrivName+'</li>' +
                            '<li>'+dia_type+'</li>' +
                            ' </ul>' +
                            ' </div>' +
                            '<div class="modular_time">' + obj.obj[i].diaTime + '</div>' +
                            ' </div>' +
                            '<h3 onclick= "windowOpen(' + obj.obj[i].diaId + ')">' + obj.obj[i].subject + '</h3>' +
//                            '<div>' + obj.obj[i].content + '</div>' +
                            '<div style="margin-bottom: 20px;">' + obj.obj[i].content + '</div>' + function () {
                                if(obj.obj[i].attachment != ''){
                                    return '<div class="attacheName">' +
                                        '<div class="attachDiv">附件：</div>' +
                                        '<div style="margin-bottom: 5px;">'+stra+'</div>' +
                                        '</div>';
                                }else{
                                    return '';
                                }
                            }()+
                            '<div class="modular_footer">' +
                            ' <ul>' +
                            '<li><a href="javascript:;" class=" '+ ' commentNumber' + i + '  " onclick= "details_sy(' + i + ',' + obj.obj[i].diaId + ')"><fmt:message code="news.th.comment"/>('+obj.obj[i].comTotal+')</a></li>' +
                            ' <li><a href="javascript:;" class="share' + i + '"  onclick= "share_log(' + i + ')"><fmt:message code="diary.th.Share"/></a></li>' +
                            '<li><a href="javascript:;"  del='+obj.obj[i].diaId+' class="'+function(){ if(obj.obj[i].isComments==1){ return " displayNone " }else{return ""}}()+'edit' + i + '" onclick= "edit_log(' + i + ')"><fmt:message code="global.lang.edit"/></a></li>' +
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="'+function(){ if(obj.obj[i].isComments==1){ return " displayNone " }else{return ""} }()+'delete' + i + '" onclick= "delete_log(' + i + ')"><fmt:message code="global.lang.delete"/></a></li>' +
                            ' <li><a href="javascript:;" onclick="setTop(' + i + ','+ obj.obj[i].diaId +','+obj.obj[i].topFlag+')">'+ function(){ if(obj.obj[i].topFlag==0){ return "  <fmt:message code="notice.th.top"/> " } else { return "<fmt:message code="news.th.quittop" />"} }()+'</a></li>' +
                            '  <li><a href="javascript:;" onclick="showReaders(' + obj.obj[i].diaId + ')"><fmt:message code="diary.th.show"/></a></li>' +
                            ' </ul>' +
                            '</div>' +
                            '</div>' +
                            '</div>' +
                            <%--评论--%>
                            '<div class="feed-ext-body comment' + i + '" id="comment_sy' + i + '" style="display: none;">' +
                            '<div class="feed-ext-add-comment">' +
                            '<form target="" action="" name="feed-comment-form">' +
                            ' <div class="feed-ext-add-comment-to" style="width:100px;height:28px;line-hight:28px;border:#ccc 1px solid;margin-bottom:5px;display:none;"></div>' +
                            ' <textarea class="feed-submit-cmt-context" name="feed-submit-cmt-context"></textarea>' +
                            '<button type="button" class="btn btn-primary feed-submit-cmt-btn" cutId="" onclick="commentDia($(this),' + i +','+obj.obj[i].diaId+ ')"><fmt:message code="diary.th.remand"/></button>' +
                            '<input type="hidden" name="comment-to" value="">' +
                            ' <input type="hidden" name="comment-id" value="">' +
                            '<input type="hidden" name="comment-type" value="">' +
                            '<input type="hidden" name="diary-id" value="11">' +
                            ' <div class="feed-ext-comment-sms-op">' +
                            '<label class="sms-remind-label">' +
                            ' <input type="checkbox" name="" id="SMS_REMIND_11" checked=""><fmt:message code="notice.th.remindermessage"/></label>' +
                            ' </div>' +
                            ' <div class="feed-ext-comment-sms-advcomment">' +
                            '<label> <input type="checkbox" name="advcomment" class="advcomment"><fmt:message code="diary.th.AdvancedReview"/> </label>' +
                            ' </div>' +
                            ' </form>' +
                            ' </div>' +
                            '   <ul class="feed-ext-list">' +

                            ' </ul>' +
                            '  </div>' +

                            // 浏览信息
                            ' <div class="feed-ext-body-readers displayNone  readers_div'+i+'  ">' +
                            '   <div class="feed-ext-readers">' +
                            '      <span></span>' +
                            '   </div> ' +
                            ' </div>'+

                            '</div>'
                    }
                    $("#qb").html();

                    $("#details").html(str);
                    if (cb) {
//                        alert(obj.msg.split(",")[1]);
                        cb($("#qb").html());
                    }
                }
            },
            error: function (e) {
                console.log(e);
            }
        });
    }
    //看所有人分页函数
    function initPagination_sy(totalData, pageSize) {
        $('.M-box3').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            current: data.page,
            homePage: '<fmt:message code="global.page.first" />',
            endPage: '<fmt:message code="global.page.last" />',
            prevContent: '<fmt:message code="global.page.pre" />',
            nextContent: '<fmt:message code="global.page.next" />',
            jumpBtn: '<fmt:message code="global.page.jump" />',
            callback: function (index) {
                data.page = index.getCurrent();
                console.log(index.getCurrent());
                initPageList_sy(function (pageCount) {
                    /*   console.log(pageCount);*/
                    initPagination_sy(pageCount, data.pageSize);
                });
            }
        });
    }
    //看其他人的评论的显示和隐藏
    function details_qt(i) {
        if ($("#comment_qt" + i).css('display') == 'block') {
            $("#comment_qt" + i).hide();
            $(".commentNumber" + i).removeClass("font_color");

        } else {
            $.ajax({
                url: "<%=basePath%>diary/getDiaryCommentByDiaId",
                type: 'get',
                dataType: "JSON",
                data: "diaId="+i,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
                        for (var j = 0; j < res.obj.length; j++) {/*删除 回复*/
                            str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                '   <div class="feed-cmt-list-ext">' +
                                '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="menuSSetting.th.deleteMenu" /></a> ' +
                                '       <a class="feed-cmt-reply-handle" num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:void(0);" hidefocus="hidefocus"><fmt:message code="global.lang.reply" /></a>' +
                                '      <span class="feed-cmt-list-time" title="'+res.obj[j].sendTime+'" > </span>' +
                                '   </div>    ' +
                                '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                '   <div class="feed-cmt-attachments"> </div> ' +
                                '</li>';
                        }
                        $("#comment_qt" + i +" ul").html(str);
                    }
                }
            });
            $("#comment_qt" + i).show();

            $(".commentNumber" + i).addClass("font_color");
            $('.txt').click(function(){//隐藏富文本
                //console.log('123')
                $('.feed-submit-cmt-context').css('height',0)
                $('.feed-submit-cmt-context').show();
                $(".edui-editor").hide();
            })
            $('.advcomment').click(function(){//显示富文本
                //$(".feed-ext-add-comment .feed-submit-cmt-context").css('height',87);
                //console.log('478')
                $(".edui-editor").show();
            })


        }

    };
    //看其他人的函数
    function initPageList_qt(cb) {
        $("#details").html("");
        $.ajax({
            url: "<%=basePath%>diary/getOther",
            type: 'post',
            dataType: "JSON",
            data: data,
            success: function (obj) {
                if (obj.obj.length == 0) {
                    $.layerMsg({content:'<fmt:message code="global.lang.nodata"/>',icon:6},function(){});
                    if (cb) {
                        cb(0);
                    }
                } else {
                    var str = "";
                    for (var i = 0; i < obj.obj.length; i++) {
                        var dia_type='';
                        if(obj.obj[i].diaType == '1'){
                            dia_type='<fmt:message code="main.worklog" />';/*工作日志*/
                        }else if(obj.obj[i].diaType == '2'){
                            dia_type='<fmt:message code="diary.th.personLog" />';/*个人日志*/
                        }
                        var src_sex ="";
                        if(obj.obj[i].sex == '0'){
                            src_sex='url(../img/workLog/basichead_man.png) no-repeat';
                        }else{
                            src_sex='url(../img/workLog/portrait3.png) no-repeat';
                        }
                        var stra='';
                        if(obj.obj[i].attachment != ''){
                            for(var j=0;j<obj.obj[i].attachment.length;j++){
                                stra+='<div class="font_">' +
                                    '<a download="'+ encodeURI(obj.obj[i].attachment[j].attUrl)+'" style="color: #207BD6;" href="<%=basePath%>download?'+ encodeURI(obj.obj[i].attachment[j].attUrl) + '">' +
                                    '<img class="img_" src="../img/enclosure.png"/>' + obj.obj[i].attachment[j].attachName + '</a></div>'+
                                    '<input type="hidden" class="inHidden" NAME="'+obj.obj[i].attachment[j].attachName+'*" value="'+obj.obj[i].attachment[j].aid+'@'+obj.obj[i].attachment[j].ym+'_'+obj.obj[i].attachment[j].attachId+',">';
                            }
                        }
                        str += '<div class="tianErNiu1">' +
                            '<div class="details_modular clearfix">' +
                            <%--头像--%>
                            //                            ' <div class="modular_user"></div>' +
                            ' <div class="modular_user" style="background:'+src_sex+';display: inline-block;float: left;width: 68px;height: 68px;border-radius: 50%;box-shadow: 0 1px 2px #b0b3b6;background-size:100% 100%;"></div>' +
                            <%--内容部分--%>
                            '<div class="modular_info">' +
                            ' <div class="modular_title clearfix">' +
                            '<div class="modular_name clearfix">' +
                            '<ul>' +
                            '<li><a href="javascript:;">' + obj.obj[i].userName + '</a></li>' +
                            '<li>'+obj.obj[i].deptName+'</li>' +
                            '<li>'+obj.obj[i].userPrivName+'</li>' +
                            '<li>'+dia_type+'</li>' +
                            ' </ul>' +
                            ' </div>' +
                            '<div class="modular_time">' + obj.obj[i].diaTime + '</div>' +
                            ' </div>' +
                            '<h3 onclick= "windowOpen(' + obj.obj[i].diaId + ')">' + obj.obj[i].subject + '</h3>' +
//                            '<div>' + obj.obj[i].content + '</div>' +
                            '<div style="margin-bottom: 20px;">' + obj.obj[i].content + '</div>' + function () {
                                if(obj.obj[i].attachment != ''){
                                    return '<div class="attacheName">' +
                                        '<div class="attachDiv">附件：</div>' +
                                        '<div style="margin-bottom: 5px;">'+stra+'</div>' +
                                        '</div>';
                                }else{
                                    return '';
                                }
                            }()+
                            '<div class="modular_footer">' +
                            ' <ul>' +
                            '<li><a href="javascript:;" class="  '+ function(){ if(obj.obj[i].isComments==1){ return " displayBlock " } }()+'  commentNumber' + i + '" onclick= "details_qt(' + i + ',' + obj.obj[i].diaId + ')"><fmt:message code="news.th.comment"/>('+obj.obj[i].comTotal+')</a></li>' +
                            ' <li><a href="javascript:;" class="share' + i + '" diaId="'+obj.obj[i].diaId+'" onclick= "share_log($(this))"><fmt:message code="diary.th.Share"/></a></li>' +
                            <%--'<li><a href="javascript:;"   del='+obj.obj[i].diaId+' class="edit' + i + '" onclick= "edit_log(' + i + ')"><fmt:message code="global.lang.edit"/></a></li>' +--%>
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="delete' + i + '" onclick= "delete_log(' + i + ')"><fmt:message code="global.lang.delete"/></a></li>' +
                            ' <li><a href="javascript:;" onclick="setTop_qt(' + i + ','+ obj.obj[i].diaId +','+obj.obj[i].topFlag+')">'+ function(){ if(obj.obj[i].topFlag==0){ return "  <fmt:message code="notice.th.top"/> " } else { return "<fmt:message code="news.th.quittop" />"} }()+'</a></li>' +
                            '  <li><a href="javascript:;" onclick="showReaders(' + i +','+ obj.obj[i].diaId + ')"><fmt:message code="diary.th.show"/></a></li>' +
                            ' </ul>' +
                            '</div>' +
                            '</div>' +
                            '</div>' +
                            <%--评论--%>
                            '<div class="feed-ext-body comment' + i + '" id="comment_qt' + i + '" style="display: none;">' +
                            '<div class="feed-ext-add-comment">' +
                            '<form target="" action="" name="feed-comment-form">' +
                            ' <div class="feed-ext-add-comment-to" style="width:100px;height:28px;line-hight:28px;border:#ccc 1px solid;margin-bottom:5px;display:none;"></div>' +
                            ' <textarea class="feed-submit-cmt-context" name="feed-submit-cmt-context"></textarea>' +
                            '<button type="button" class="btn btn-primary feed-submit-cmt-btn" cutId="" onclick="commentDia($(this),' + i +','+obj.obj[i].diaId+ ')"><fmt:message code="diary.th.remand"/></button>' +
                            '<input type="hidden" name="comment-to" value="">' +
                            ' <input type="hidden" name="comment-id" value="">' +
                            '<input type="hidden" name="comment-type" value="">' +
                            '<input type="hidden" name="diary-id" value="11">' +
                            ' <div class="feed-ext-comment-sms-op">' +
                            '<label class="sms-remind-label">' +
                            ' <input type="checkbox" name="" id="SMS_REMIND_11" checked=""><fmt:message code="notice.th.remindermessage"/></label>' +
                            ' </div>' +
                            ' <div class="feed-ext-comment-sms-advcomment">' +
                            '<label> <input type="checkbox" name="advcomment" class="advcomment"><fmt:message code="diary.th.AdvancedReview"/> </label>' +
                            ' </div>' +
                            ' </form>' +
                            ' </div>' +
                            '   <ul class="feed-ext-list">' +

                            ' </ul>' +
                            '  </div>' +

                            // 浏览信息
                            ' <div class="feed-ext-body-readers displayNone  readers_div'+i+'  ">' +
                            '   <div class="feed-ext-readers">' +
                            '      <span></span>' +
                            '   </div> ' +
                            ' </div>'+

                            '</div>'
                    }
                    $("#tr").html();

                    $("#details").html(str);
                    if (cb) {
//                        alert(obj.msg.split(",")[1]);
                        cb($("#tr").html());
                    }
                }
            },
            error: function (e) {
                console.log(e);
            }
        });
    }
    //看其他人的分页函数
    function initPagination_qt(totalData, pageSize) {
        $('.M-box3').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            current: data.page,
            homePage: '<fmt:message code="global.page.first" />',
            endPage: '<fmt:message code="global.page.last" />',
            prevContent: '<fmt:message code="global.page.pre" />',
            nextContent: '<fmt:message code="global.page.next" />',
            jumpBtn: '<fmt:message code="global.page.jump" />',
            callback: function (index) {
                data.page = index.getCurrent();
                console.log(index.getCurrent());
                initPageList_qt(function (pageCount) {
                    /*   console.log(pageCount);*/
                    initPagination_qt(pageCount, data.pageSize);
                });
            }
        });
    }
    //高级查询的评论的显示和隐藏
    function details_query(i,diaId) {
        if ($("#comment_query" + i).css('display') == 'block') {
            $("#comment_query" + i).hide();
            $(".commentNumber" + i).removeClass("font_color");

        } else {
            $.ajax({
                url: "<%=basePath%>diary/getDiaryCommentByDiaId",
                type: 'get',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
                        for (var j = 0; j < res.obj.length; j++) {
                            str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                '   <div class="feed-cmt-list-ext">' +
                                '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="global.lang.delete" /></a> ' +
                                '       <a class="feed-cmt-reply-handle" num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:void(0);" hidefocus="hidefocus"><fmt:message code="global.lang.reply" /></a>' +
                                '      <span class="feed-cmt-list-time" title="'+res.obj[j].sendTime+'" > </span>' +
                                '   </div>    ' +
                                '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                '   <div class="feed-cmt-attachments"> </div> ' +
                                '</li>';
                        }
                        $("#comment_query" + i+" ul").html(str);
                    }
                }
            });

            $("#comment_query" + i).show();

            $(".commentNumber" + i).addClass("font_color");
        }

    };
    //高级查询的函数
    function initPageList_query(cb) {
        $("#details").html("");
        $.ajax({
            url: "<%=basePath%>diary/diarySelect",
            type: 'post',
            dataType: "JSON",
            data: data,
            async: false,
            success: function (obj) {
                if (obj.obj.length == 0) {
                    $.layerMsg({content:'<fmt:message code="global.lang.nodata"/>',icon:6},function(){});
                    if (cb) {
                        cb(0);
                    }
                } else {
                    var str = "";
                    for (var i = 0; i < obj.obj.length; i++) {
                        var dia_type='';
                        if(obj.obj[i].diaType == '1'){
                            dia_type='<fmt:message code="main.worklog" />';/*工作日志*/
                        }else if(obj.obj[i].diaType == '2'){
                            dia_type='<fmt:message code="diary.th.personLog" />';/*个人日志*/
                        }
                        var src_sex ="";
                        if(obj.obj[i].sex == '0'){
                            src_sex='url(../img/workLog/basichead_man.png) no-repeat';
                        }else{
                            src_sex='url(../img/workLog/portrait3.png) no-repeat';
                        }
                        var stra='';
                        if(obj.obj[i].attachment != ''){
                            for(var j=0;j<obj.obj[i].attachment.length;j++){
                                stra+='<div class="font_">' +
                                    '<a download="'+ encodeURI(obj.obj[i].attachment[j].attUrl)+'" style="color: #207BD6;" href="<%=basePath%>download?'+ encodeURI(obj.obj[i].attachment[j].attUrl) + '">' +
                                    '<img class="img_" src="../img/enclosure.png"/>' + obj.obj[i].attachment[j].attachName + '</a></div>'+
                                    '<input type="hidden" class="inHidden" NAME="'+obj.obj[i].attachment[j].attachName+'*" value="'+obj.obj[i].attachment[j].aid+'@'+obj.obj[i].attachment[j].ym+'_'+obj.obj[i].attachment[j].attachId+',">';
                            }
                        }
                        str += '<div class="tianErNiu1">' +
                            '<div class="details_modular clearfix">' +
                            <%--头像--%>
                            ' <div class="modular_user" style="background:'+src_sex+';display: inline-block;float: left;width: 68px;height: 68px;border-radius: 50%;box-shadow: 0 1px 2px #b0b3b6;background-size:100% 100%;"></div>' +
                            <%--内容部分--%>
                            '<div class="modular_info">' +
                            ' <div class="modular_title clearfix">' +
                            '<div class="modular_name clearfix">' +
                            '<ul>' +
                            '<li><a href="javascript:;">' + obj.obj[i].userName + '</a></li>' +
                            '<li>'+obj.obj[i].deptName+'</li>' +
                            '<li>'+obj.obj[i].userPrivName+'</li>' +
                            '<li>'+dia_type+'</li>' +
                            ' </ul>' +
                            ' </div>' +
                            '<div class="modular_time">' + obj.obj[i].diaTime + '</div>' +
                            ' </div>' +
                            '<h3 onclick= "windowOpen(' + obj.obj[i].diaId + ')">' + obj.obj[i].subject + '</h3>' +
//                            '<div>' + obj.obj[i].content + '</div>' +
                            '<div style="margin-bottom: 20px;">' + obj.obj[i].content + '</div>' + function () {
                                if(obj.obj[i].attachment != ''){
                                    return '<div class="attacheName">' +
                                        '<div class="attachDiv">附件：</div>' +
                                        '<div style="margin-bottom: 5px;">'+stra+'</div>' +
                                        '</div>';
                                }else{
                                    return '';
                                }
                            }()+
                            '<div class="modular_footer">' +
                            ' <ul>' +
                            '<li><a href="javascript:;" class="  '+ function(){ if(obj.obj[i].isComments==1){ return " displayNone " } }()+'  commentNumber' + i + '" onclick= "details_query(' + i+','+ obj.obj[i].diaId + ')"><fmt:message code="news.th.comment"/>('+obj.obj[i].comTotal+')</a></li>' +
                            ' <li><a href="javascript:;"><fmt:message code="diary.th.Share"/></a></li>' +
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="edit' + i + '" onclick= "edit_log(' + i + ')"><fmt:message code="global.lang.edit"/></a></li>' +
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="delete' + i + '" onclick= "delete_log(' + i + ')"><fmt:message code="global.lang.delete"/></a></li>' +
                            ' <li><a href="javascript:;" onclick="setTop(' + i + ','+ obj.obj[i].diaId +','+obj.obj[i].topFlag+')">'+ function(){ if(obj.obj[i].topFlag==0){ return "  <fmt:message code="notice.th.top"/> " } else { return "<fmt:message code="news.th.quittop" />"} }()+'</a></li>' +
                            '  <li><a href="javascript:;" showReaders(' + i +','+ obj.obj[i].diaId + ')"><fmt:message code="diary.th.show"/></a></li>' +
                            ' </ul>' +
                            '</div>' +
                            '</div>' +
                            '</div>' +
                            <%--评论--%>
                            '<div class="feed-ext-body comment' + i + '" id="comment_query' + i + '" style="display: none;">' +
                            '<div class="feed-ext-add-comment">' +
                            '<form target="" action="" name="feed-comment-form">' +
                            ' <div class="feed-ext-add-comment-to" style="width:100px;height:28px;line-hight:28px;border:#ccc 1px solid;margin-bottom:5px;display:none;"></div>' +
                            ' <textarea class="feed-submit-cmt-context" name="feed-submit-cmt-context"></textarea>' +
                            '<button type="button" class="btn btn-primary feed-submit-cmt-btn" cutId="" onclick="commentDia($(this),' + i +','+obj.obj[i].diaId+ ')"><fmt:message code="diary.th.remand"/></button>' +
                            '<input type="hidden" name="comment-to" value="">' +
                            ' <input type="hidden" name="comment-id" value="">' +
                            '<input type="hidden" name="comment-type" value="">' +
                            '<input type="hidden" name="diary-id" value="11">' +
                            ' <div class="feed-ext-comment-sms-op">' +
                            '<label class="sms-remind-label">' +
                            ' <input type="checkbox" name="" id="SMS_REMIND_11" checked=""><fmt:message code="notice.th.remindermessage"/></label>' +
                            ' </div>' +
                            ' <div class="feed-ext-comment-sms-advcomment">' +
                            '<label> <input type="checkbox" name="advcomment" class="advcomment"><fmt:message code="diary.th.AdvancedReview"/>  </label>' +
                            ' </div>' +
                            ' </form>' +
                            ' </div>' +
                            '   <ul class="feed-ext-list">' +

                            ' </ul>' +
                            '  </div>' +

                            // 浏览信息
                            ' <div class="feed-ext-body-readers displayNone  readers_div'+i+'  ">' +
                            '   <div class="feed-ext-readers">' +
                            '      <span></span>' +
                            '   </div> ' +
                            ' </div>'+

                            '</div>'
                    }

                    $("#details").html(str);
                    /*location.reload();*/
                    if (cb) {
//                      alert(obj.totleNum);

                        cb( obj.totleNum);

                    }
                }
            },
            error: function (e) {
                console.log(e);
            }
        });
    }
    //高级查询的分页函数
    function initPagination_query(totalData, pageSize) {
        $('.M-box3').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            current: data.page,
            homePage: '<fmt:message code="global.page.first" />',
            endPage: '<fmt:message code="global.page.last" />',
            prevContent: '<fmt:message code="global.page.pre" />',
            nextContent: '<fmt:message code="global.page.next" />',
            jumpBtn: '<fmt:message code="global.page.jump" />',
            callback: function (index) {
                data.page = index.getCurrent();
                console.log(index.getCurrent());
                initPageList_query(function (pageCount) {
                    /*   console.log(pageCount);*/
                    initPagination_query(pageCount, data.pageSize);
                });
            }
        });
    }
    //日历的评论的显示和隐藏
    function details_rl(i,diaId) {
        if ($("#comment_rl" + i).css('display') == 'block') {
            $("#comment_rl" + i).hide();
            $(".commentNumber" + i).removeClass("font_color");

        } else {
            $.ajax({
                url: "<%=basePath%>diary/getDiaryCommentByDiaId",
                type: 'get',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
                        for (var j = 0; j < res.obj.length; j++) {
                            str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                '   <div class="feed-cmt-list-ext">' +
                                '       <a class="feed-cmt-del-handle" data-cmd="delReply"  data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="global.lang.delete" /></a> ' +
                                '       <a class="feed-cmt-reply-handle" num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:;"><fmt:message code="global.lang.reply" /></a>' +
                                '      <span class="feed-cmt-list-time" title="'+res.obj[j].sendTime+'" > </span>' +
                                '   </div>    ' +
                                '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                '   <div class="feed-cmt-attachments"> </div> ' +
                                '</li>';
                        }
                        $("#comment_rl" + i+" ul").html(str);
                    }
                }
            });
            $("#comment_rl" + i).show();
            $(".commentNumber" + i).addClass("font_color");
        }

    };
    //日历查询的函数
    function initPageList_rl(cb) {
        $("#details").html("");
        $.ajax({
            url: "<%=basePath%>diary/diarySelect",
            type: 'get',
            dataType: "JSON",
            data: data,
            async: false,
            success: function (obj) {
                if (obj.obj.length == 0) {
                    $.layerMsg({content:'<fmt:message code="global.lang.nodata"/>',icon:6},function(){});
                    if (cb) {
                        cb(0);
                    }
                } else {
                    var str = "";
                    for (var i = 0; i < obj.obj.length; i++) {
                        var dia_type='';
                        if(obj.obj[i].diaType == '1'){
                            dia_type='<fmt:message code="main.worklog" />';/*工作日志*/
                        }else if(obj.obj[i].diaType == '2'){
                            dia_type='<fmt:message code="diary.th.personLog" />';/*个人日志*/
                        }
                        var src_sex ="";
                        if(obj.obj[i].sex == '0'){
                            src_sex='url(../img/workLog/basichead_man.png) no-repeat';
                        }else{
                            src_sex='url(../img/workLog/portrait3.png) no-repeat';
                        }
                        var stra='';
                        if(obj.obj[i].attachment != ''){
                            for(var j=0;j<obj.obj[i].attachment.length;j++){
                                stra+='<div class="font_">' +
                                    '<a download="'+ encodeURI(obj.obj[i].attachment[j].attUrl)+'" style="color: #207BD6;" href="<%=basePath%>download?'+ encodeURI(obj.obj[i].attachment[j].attUrl) + '">' +
                                    '<img class="img_" src="../img/enclosure.png"/>' + obj.obj[i].attachment[j].attachName + '</a></div>'+
                                    '<input type="hidden" class="inHidden" NAME="'+obj.obj[i].attachment[j].attachName+'*" value="'+obj.obj[i].attachment[j].aid+'@'+obj.obj[i].attachment[j].ym+'_'+obj.obj[i].attachment[j].attachId+',">';
                            }
                        }
                        str += '<div class="tianErNiu1">' +
                            '<div class="details_modular clearfix">' +
                            <%--头像--%>
                            //                            ' <div class="modular_user"></div>' +
                            ' <div class="modular_user" style="background:'+src_sex+';display: inline-block;float: left;width: 68px;height: 68px;border-radius: 50%;box-shadow: 0 1px 2px #b0b3b6;background-size:100% 100%;"></div>' +
                            <%--内容部分--%>
                            '<div class="modular_info">' +
                            ' <div class="modular_title clearfix">' +
                            '<div class="modular_name clearfix">' +
                            '<ul>' +
                            '<li><a href="javascript:;">' + obj.obj[i].userName + '</a></li>' +
                            '<li>'+obj.obj[i].deptName+'</li>' +
                            '<li>'+obj.obj[i].userPrivName+'</li>' +
                            '<li>'+obj.obj[i].userPrivName+'</li>' +
                            '<li>'+dia_type+'</li>' +
                            ' </ul>' +
                            ' </div>' +
                            '<div class="modular_time">' + obj.obj[i].diaTime + '</div>' +
                            ' </div>' +
                            '<h3 onclick= "windowOpen(' + obj.obj[i].diaId+ ')">' + obj.obj[i].subject + '</h3>' +
//                            '<div>' + obj.obj[i].content + '</div>' +
                            '<div style="margin-bottom: 20px;">' + obj.obj[i].content + '</div>' + function () {
                                if(obj.obj[i].attachment != ''){
                                    return '<div class="attacheName">' +
                                        '<div class="attachDiv">附件：</div>' +
                                        '<div style="margin-bottom: 5px;">'+stra+'</div>' +
                                        '</div>';
                                }else{
                                    return '';
                                }
                            }()+
                            '<div class="modular_footer">' +
                            ' <ul>' +
                            '<li><a href="javascript:;" class="  '+ function(){ if(obj.obj[i].isComments==1){ return " displayNone " } }()+'  commentNumber' + i + '" onclick= "details_rl(' + i + ')"><fmt:message code="news.th.comment"/>('+obj.obj[i].comTotal+')</a></li>' +
                            ' <li><a href="javascript:;"><fmt:message code="diary.th.Share"/></a></li>' +
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="edit' + i + '" onclick= "edit_log(' + i + ')"><fmt:message code="global.lang.edit"/></a></li>' +
                            '<li><a href="javascript:;" del='+obj.obj[i].diaId+' class="delete' + i + '" onclick= "delete_log(' + i + ')"><fmt:message code="global.lang.delete"/></a></li>' +
                            ' <li><a href="javascript:;" onclick="setTop(' + i + ','+ obj.obj[i].diaId +','+obj.obj[i].topFlag+')">'+ function(){ if(obj.obj[i].topFlag==0){ return "  <fmt:message code="notice.th.top"/> " } else { return "<fmt:message code="news.th.quittop" />"} }()+'</a></li>' +
                            '  <li><a href="javascript:;"  onclick="showReaders(' + i +','+ obj.obj[i].diaId + ')"><fmt:message code="diary.th.show"/></a></li>' +
                            ' </ul>' +
                            '</div>' +
                            '</div>' +
                            '</div>' +
                            <%--评论--%>
                            '<div class="feed-ext-body comment' + i + '" id="comment_rl' + i + '" style="display: none;">' +
                            '<div class="feed-ext-add-comment">' +
                            '<form target="" action="" name="feed-comment-form">' +
                            ' <div class="feed-ext-add-comment-to" style="width:100px;height:28px;line-hight:28px;border:#ccc 1px solid;margin-bottom:5px;display:none;"></div>' +
                            ' <textarea class="feed-submit-cmt-context" name="feed-submit-cmt-context"></textarea>' +
                            '<button type="button" class="btn btn-primary feed-submit-cmt-btn" cutId=""  onclick="commentDia($(this),' + i +','+obj.obj[i].diaId+ ')"><fmt:message code="diary.th.remand"/></button>' +
                            '<input type="hidden" name="comment-to" value="">' +
                            ' <input type="hidden" name="comment-id" value="">' +
                            '<input type="hidden" name="comment-type" value="">' +
                            '<input type="hidden" name="diary-id" value="11">' +
                            ' <div class="feed-ext-comment-sms-op">' +
                            '<label class="sms-remind-label">' +
                            ' <input type="checkbox" name="" id="SMS_REMIND_11" checked=""><fmt:message code="notice.th.remindermessage"/></label>' +
                            ' </div>' +
                            ' <div class="feed-ext-comment-sms-advcomment">' +
                            '<label> <input type="checkbox" name="advcomment" class="advcomment"><fmt:message code="diary.th.AdvancedReview"/> </label>' +
                            ' </div>' +
                            ' </form>' +
                            ' </div>' +
                            '   <ul class="feed-ext-list comUl"'+i+'>' +

                            ' </ul>' +
                            '  </div>' +

                            // 浏览信息
                            ' <div class="feed-ext-body-readers displayNone  readers_div'+i+' ">' +
                            '   <div class="feed-ext-readers">' +
                            '      <span></span>' +
                            '   </div> ' +
                            ' </div>'+

                            '</div>'
                    }

                    $("#details").html(str);
                    if (cb) {
//                      alert(obj.totleNum);

                        cb( obj.totleNum);

                    }
                }
            },
            error: function (e) {
                console.log(e);
            }
        });
    }
    //日历查询的分页函数
    function initPagination_rl(totalData, pageSize) {
        $('.M-box3').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            current: data.page,
            homePage: '<fmt:message code="global.page.first" />',
            endPage: '<fmt:message code="global.page.last" />',
            prevContent: '<fmt:message code="global.page.pre" />',
            nextContent: '<fmt:message code="global.page.next" />',
            jumpBtn: '<fmt:message code="global.page.jump" />',
            callback: function (index) {
                data.page = index.getCurrent();
                console.log(index.getCurrent());
                initPageList_rl(function (pageCount) {
                    /*   console.log(pageCount);*/
                    initPagination_rl(pageCount, data.pageSize);
                });
            }
        });
    }
    // 置顶操作
    function setTop(num,diaId,flag) {
        if(flag==0){
            $.ajax({ //置顶
                url: "<%=basePath%>diary/insertDiaryTop",
                type: 'post',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    if(res.flag){
                        layer.msg("<fmt:message code="notice.th.TopSuccess" />！",{icon:1});/*置顶成功*/
                        initPageList_zj(function (pageCount) {
                            initPagination_zj(pageCount, data.pageSize);
                        });
                    }
                }
            });
        }else{
            $.ajax({  //取消置顶
                url: "<%=basePath%>diary/deleteDiaryTop",
                type: 'post',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
                        layer.msg("<fmt:message code="notice.th.CancelTopSuccess" />！",{icon:1});/*取消置顶成功*/
                        initPageList_zj(function (pageCount) {
                            initPagination_zj(pageCount, data.pageSize);
                        });
                    }
                }
            });
        }

    }
    //其他置顶操作
    function setTop_qt(num,diaId,flag) {
        if(flag==0){
            $.ajax({ //置顶
                url: "<%=basePath%>diary/insertDiaryTop",
                type: 'post',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    if(res.flag){
                        layer.msg("<fmt:message code="notice.th.TopSuccess" />！",{icon:1});/*置顶成功*/
                        initPageList_qt(function (pageCount) {
                            initPagination_qt(pageCount, data.pageSize);
                        });
                    }
                }
            });
        }else{
            $.ajax({  //取消置顶
                url: "<%=basePath%>diary/deleteDiaryTop",
                type: 'post',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
                        layer.msg("<fmt:message code="notice.th.CancelTopSuccess" />！",{icon:1});/*取消置顶成功*/
                        initPageList_qt(function (pageCount) {
                            initPagination_qt(pageCount, data.pageSize);
                        });
                    }
                }
            });
        }

    }
    // 删除评论接口
    function deleteCmt(num,cmtId) {
        var cmtId = cmtId;
        layer.confirm('<fmt:message code="diary.th.removeComment" />？', {/*确定删除该条评论*/
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮  /*确定  取消*/
            title:'<fmt:message code="notice.th.DeleteFile" />' /*删除文件*/
        }, function(){
            //确定删除，调接口
            $.ajax({
                url: "<%=basePath%>diary/delDiaryCommentByCommentId",
                type: 'post',
                dataType: "JSON",
                data: "commentId="+cmtId,
                async: false,
                success: function (res) {
                    var str = "";
                    if(res.flag){
                        layer.msg("<fmt:message code="workflow.th.delsucess" />！",{icon:1});/*删除评论成功*/
                        initPageList_zj(function (pageCount) {
                            initPagination_zj(pageCount, data.pageSize);
                        });
                    }
                }
            });

        }, function(){
            layer.closeAll();
        });
    }
    //评论接口
    function commentEvent(num,diaId){
        var content = $('.comment'+num+' textarea').val();
        var data = {
            diaId:diaId,
            content:content
        };
        $.ajax({
            url: "<%=basePath%>diary/insertDiaryComment",
            type: 'post',
            dataType: "JSON",
            data: data,
            async: false,
            success: function (res) {
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="diary.th.CommentSuccess" />！',icon:6});/*评论成功*/
                    $('.feed-submit-cmt-context').val('');
                    disComment(num,diaId)
                }
            }
        });
    }

    //评论数量
    <%--function diaTotalNum(){--%>
    <%--var diaId=that.parents('.tianErNiu1').attr('dailId');--%>
    <%--$.ajax({--%>
    <%--type:'get',--%>
    <%--url:'<%=basePath%>diary/getDiaryCommentCount',--%>
    <%--dataType:'json',--%>
    <%--data:{'diaId':diaId},--%>
    <%--success:function(){--%>
    <%----%>
    <%--}--%>
    <%--})--%>
    <%--}--%>

    //回复
    $('.details').on('click','.feed-cmt-reply-handle',function(){
        var uName=$(this).attr('data-to-text');
        var comId=$(this).attr('data-cmt-type');
        $('.btn-primary').attr('btnType','1');
        $('.btn-primary').attr('cutId',comId);
        $('.feed-ext-add-comment-to').toggle();
        $('.feed-ext-add-comment-to').text(uName);
    })
    // 提交按钮
    function commentDia(that,num,diaId){
        var cmtTpe=that.attr('cutId');
        var val=that.siblings('.feed-submit-cmt-context').val();
        if(that.siblings('.feed-ext-add-comment-to').css('display') == 'none'){
            commentEvent(num,diaId);
        }else if(that.siblings('.feed-ext-add-comment-to').css('display') == 'block'){
            replayCommetTo(cmtTpe,val,num,diaId)
//            details(num,diaId)
        }
    }
    // 获取浏览阅读人信息
    function showReaders(num,diaId) {
        if ($('.readers_div'+num ).css('display') == 'block') {
            $('.readers_div'+num ).hide();
        } else {
            $('.readers_div'+num ).removeClass("displayNone");
            $('.readers_div'+num ).show();
            $.ajax({
                url: "<%=basePath%>diary/getReaders",
                type: 'get',
                dataType: "JSON",
                data: "diaId="+diaId,
                async: false,
                success: function (res) {
                    if(res.flag){
                        $('.readers_div'+num+' span' ).text(res.object.readersName);
                    }
                }
            });
        }
    }
    //回复评论方法
    function replayCommetTo(cmtTpe,val,num,diaId){
        $.ajax({
            type:'post',
            url:'<%=basePath%>diary/insertCommentReply',
            dataType:'json',
            data:{'replyComment':val,
                'commentId':cmtTpe,
                'toId':$('.feed-cmt-reply-handle').attr('data-to-id')
            },
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="doc.th.ReplySuccessfully" />！',icon:1});/*回复成功*/
                    disComment(num,diaId)
                    $('.feed-submit-cmt-context').val('');
                    $('.feed-ext-add-comment-to').hide();
                }
            }
        })
    }
    //回复删除
    function deleteReplayCom(that){
        var repId=that.attr('data-cmt-id');
        layer.confirm('<fmt:message code="diary.th.removeComment" />？', {/*确定删除该条评论*/
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮  /*确定 取消*/
            title:'<fmt:message code="notice.th.DeleteFile" />' /*删除文件*/
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'<%=basePath%>diary/delCommentReplyByReplyId',
                dataType:'json',
                data:{'replyId':repId},
                success:function(res){
                    if(res.flag){
                        layer.msg("<fmt:message code="workflow.th.delsucess" />！",{icon:1});/*删除评论成功*/
                        initPageList_zj(function (pageCount) {
                            initPagination_zj(pageCount, data.pageSize);
                        });
                    }
                }
            })
        }, function(){
            layer.closeAll();
        });

    }
    //评论显示
    function disComment(num,diaId){
        $('.feed-cmt-list-item').remove();
        $.ajax({
            url: "<%=basePath%>diary/getDiaryCommentByDiaId",
            type: 'get',
            dataType: "JSON",
            data: "diaId="+diaId,
            async: false,
            success: function (res) {
                var str = "";
                if(res.flag){
                    for (var j = 0; j < res.obj.length; j++) {
                        var stra='';
                        if(res.obj[j].diaryCommentReplyModelList != ''){
                            for(var i=0; i<res.obj[j].diaryCommentReplyModelList.length; i++){
                                stra+='<ul><li class="feed-cmt-list-item " style="border-top:none;">' +
                                    '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].diaryCommentReplyModelList[i].replyerName+'</a>&nbsp; &nbsp;<span><fmt:message code="email.th.reply" /></span>&nbsp;&nbsp;<a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].diaryCommentReplyModelList[i].toName+'</a>' +
                                    '   <div class="feed-cmt-list-ext">' +
                                    '       <span>'+res.obj[j].diaryCommentReplyModelList[i].replyTime+'</span>' +
                                    '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].diaryCommentReplyModelList[i].replyId+'" data-cmt-type="" href="javascript:;" onclick="deleteReplayCom($(this))"><fmt:message code="global.lang.delete" /></a> ' +
                                    '       <a class="feed-cmt-reply-handle" data-cmd="replyComment" data-to-id="" data-cmt-type="" data-to-text="" href="javascript:;"><fmt:message code="email.th.reply" /></a>' +
                                    '   </div>    ' +
                                    '   <div class="feed-cmt-content">'+res.obj[j].diaryCommentReplyModelList[i].replyComment+'</div> ' +
                                    '</li></ul>';
                            }
                            str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                '   <div class="feed-cmt-list-ext">' +
                                '       <span>'+res.obj[j].sendTime+'</span>' +
                                '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="global.lang.delete" /></a> ' +
                                '       <a class="feed-cmt-reply-handle"  num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:;"><fmt:message code="email.th.reply" /></a>' +
                                '      <span class="feed-cmt-list-time" title="'+res.obj[j].sendTime+'" > </span>' +
                                '   </div>    ' +
                                '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                '   <div class="feed-cmt-attachments">'+stra+'</div> ' +
                                '</li>';
                        }else{
                            str+='<li class="feed-cmt-list-item " data-cmt-id="" data-comment-to-id="">  ' +
                                '   <a href="javascript:void(0);" td-user-id="admin" class="feed-cmt-list-user">'+res.obj[j].userName+'</a>' +
                                '   <div class="feed-cmt-list-ext">' +
                                '       <span>'+res.obj[j].sendTime+'</span>' +
                                '       <a class="feed-cmt-del-handle" data-cmd="delReply" data-cmt-id="'+res.obj[j].commentId+'" data-to-id="'+res.obj[j].userId+'" data-cmt-type="" data-to-text="'+res.obj[j].userName+'" href="javascript:deleteCmt('+j+','+res.obj[j].commentId+');" hidefocus="hidefocus"><fmt:message code="global.lang.delete" /></a> ' +
                                '       <a class="feed-cmt-reply-handle" num="'+j+'" data-cmd="replyComment" data-to-id="'+res.obj[j].userId+'" data-cmt-type="'+res.obj[j].commentId+'" data-to-text="'+res.obj[j].userName+'" href="javascript:void(0);" hidefocus="hidefocus"><fmt:message code="email.th.reply" /></a>' +
                                '   </div>    ' +
                                '   <div class="feed-cmt-content">'+res.obj[j].content+'</div> ' +
                                '</li>';
                        }

                    }
                    $(".comment" + num+" ul").html(str);
                    var liLength=$('.feed-cmt-list-item ').length;
                }
            }
        });
    }
    laydate({
        elem: '#inputsendTime', //目标元素。
        format: 'YYYY-MM-DD', //日期格式
        istime: true //显示时、分、秒
    });
    //时间控件调用
    var start = {
        elem: '#startdate',
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }
    };
    var end = {
        elem: '#enddate',
        format: 'YYYY-MM-DD',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    laydate(start);
    laydate(end);
    //获取当前时间
    function getNowFormatDate1() {
        var date = new Date();
        var seperator1 = "-";
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
        return currentdate;
    }
    //获取3天前时间
    function getNowFormatDate2() {
        var date = new Date();
        var seperator1 = "-";
        var month = date.getMonth() + 1;
        var strDate = date.getDate() - 3;
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
        return currentdate;
    }
    //高级搜索的选人员
    $('#add_selectUserbtn').click(function () {
        user_id = 'add_selectUser';
        $.popWindow("../common/selectUser");
    });
    //高级搜索的选部门
    $('#dept_add').click(function () {
        dept_id = 'dept';
        $.popWindow("../common/selectDept");
    });
    //高级搜索的选角色
    $('#priv_add').click(function () {
        priv_id = 'add_selectjuese';
        $.popWindow("../common/selectPriv");
    });
    //写日志中选人员
    $('#add_log').click(function(){
        user_id='add_text';
        $.popWindow("../common/selectUser");
    });
    /* 写日志清空人员控件 */
    function clearData(){
        $("#add_text").val("");
    };
    /* 高级搜索的清空按钮*/
    function empty(id){
        $("#"+id).val("");
        $("#"+id).attr("user_id","");
        $("#"+id).attr("userpriv","");
        $("#"+id).attr("deptid","");

    };
    /*写日志是否共享*/
    function share(){
        $("#share").toggle();
    };
    /*写日志中工作日志、个人日志显示隐藏*/
    function diary_log(){
        if ($('#diary_log option:checked').attr('value') == 1) {
            $("#dia_share").show();
        } else {
            $("#dia_share").hide();
        }
    };
    //正在开发中
    function develop(i){
        <%--layer.msg('<fmt:message code="global.lang.doing" />', {icon: 6});--%>
        $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6},function(){});
    }

</script>

</html>
