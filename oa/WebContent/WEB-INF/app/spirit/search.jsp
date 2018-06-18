<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!-- saved from url=(0082)file:///C:/Users/gaosubo/Desktop/OA%E7%B2%BE%E7%81%B5_files/saved_resource(1).html -->
<html><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/spirit/search.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/style.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/ipanel.css">
    <link rel="stylesheet" type="text/css" href="../css/main/theme1/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="../css/main/theme1/index.css"/>
    <link rel="stylesheet" type="text/css" href="../css/spirit/user_online.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/ui.dynatree.css">
    <script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js"></script>
     <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>     <script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>    <script src="/js/base/base.js"></script>
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
    <style>
        body{
            overflow-y:scroll;
        }

        ul li{
            overflow:hidden;
        }
        .user{
            text-align:left;
            padding-left:10px;
            width:8em;
            line-height:35px;
            color:#313131;
        }
        .applyImg{
            vertical-align:middle;
            border-radius: 100%;
        }
        .search_custom{
            display:none;
        }
        .apply_custom{
            display:none;
        }
        .userone{
            padding-top:10px;
        }
        .userImg{
            margin-top: 5px;
        }
        .userName:hover{
            background:#e7e7e7;
            cursor: pointer;
        }
        .menuName:hover{
            background:#e7e7e7;
        }
        .userTitle{
            color:#848484;  border-bottom: 1px solid #6bc6f7;
        }
        .apply{
            /*font-weight:bold;*/
            font-size:14px;
        }
        .applyList ul{
            background:#fff;
        }
        .userList ul{
            background:#fff
        }
        .aside{
            background:#fff;
        }
        .name{
            color:#848484;
            font-size:14px;
        }
        /*修改滚动轴样式*/
        ::-webkit-scrollbar {
            width: 6px;
        }
        ::-webkit-scrollbar-track {
            background-color: #fff;
        } /* 滚动条的滑轨背景颜色 */

        ::-webkit-scrollbar-thumb {
            background-color: #c0c0c0;
            border-radius:50px;
        } /* 滑块颜色 */

        ::-webkit-scrollbar-button {
            width:0px;
            height:0px;
        } /* 滑轨两头的监听按钮颜色 */

        ::-webkit-scrollbar-corner {
            background-color: #fff;
        } /* 横向滚动条和纵向滚动条相交处尖角的颜色 */

        .noSearch{
            width:100%;
            height:100%;
        }
        .allow{
            font-size: 14px;
            line-height: 48px;
            width: 5em;
            text-align: center;
            float: left;
            color:#999;
        }
        .menuName:hover{
            cursor:pointer;
        }

    </style>

</head>
<body style="min-width:0px!important">
<div class="noSearch">
    <div style="width: 100%;">
        <h2 class="allow">
            支持搜索
        </h2>
    </div>

    <div class="" style="text-align: center;margin-top:24px;">
        <div class="allowUser" style="display: inline-block;margin-right:66px;">
            <img src="../../img/spirit/user.png" alt="">
            <p style="color:#999;margin-top:3px;">用户</p>
        </div>
        <div class="allowCustom" style="display: inline-block;margin-left:10px;">
            <img src="../../img/spirit/gong.png" alt="">
            <p style="color:#999;margin-top:3px;">功能</p>
        </div>
    </div>
</div>
<div class="searchBox" style="display: none">
    <div class="aside">
        <ul class="search_box">
            <li class="search_custom">
                <div class="userTitle">
                    <%--<img class="userImg" src="../../img/spirit/custom.png" alt="">--%>
                    <h2 class="user name">用户</h2>
                    <img class="user_open" src="../../img/spirit/deptbuttom.png" alt="">
                    <h2 id="userNum"></h2>
                </div>
                <div class="userList">
                    <ul>

                    </ul>
                </div>
            </li>
            <li class="apply_custom">
                <div class="userTitle">
                    <%--<img class="applyImg" src="../../img/spirit/apply.png" alt="">--%>
                    <h2 class="apply">功能</h2>
                    <img class="apply_open" src="../../img/spirit/deptbuttom.png" alt="">
                    <h2 id="applyNum"></h2>
                </div>
                <div class="applyList">
                    <ul>

                    </ul>
                </div>
            </li>
        </ul>
    </div>
</div>

<script>
    $(function(){

//        window.onresize=function(){
//            var CH=$(window).height();
//            var DH=$(document).height();
//            if(DH>CH){
//                $(body).css('overflow-y','scroll');
//            }
//            console.log(DH);
//            console.log(CH);
//        }
//        onresize();

//    获取用户列表
        $.ajax({
            url:'/todoList/queryUserByUserId' ,
            type:'post',
            data:{userName:decodeURI($.GetRequest().search)},
            dataType:'json',
            success:function(reg){
                var data=reg.obj;
                var str="";
                if(data.length>0){
                    $('.noSearch').hide();
                    $('.searchBox').show();
                    $('.search_custom').show();
                    for(var i=0;i<data.length;i++){
                        var avatar = data[i].avatar;
                        if(avatar == '0'){
                            var img = '/img/user/boy.png'
                        }else if(avatar == '1'){
                            var img = '/img/user/girl.png'
                        }else{
                            var img = '/img/user/'+avatar;
                        }
                        str+='<li class="userName" prive="'+data[i].userPrivName+'"  userName="'+data[i].userName+'" id="'+data[i].uid+'" sex="'+data[i].sex+'" num="'+data[i].mobilNo+'">' +
                            '<img class="applyImg" style="width: 35px;height: 35px;" src="'+ img +'" alt="">' +
                            '<h2 class="user userone">'+data[i].userName+'</h2>' +
                            '</li>';
                    }
                    $('.userList ul').html(str);
                }

            }
        })
//   具体功能url地址
        var menu={"email":"/email/index",
            "notify_show":"/notice/index",
            "news_show":"/news/index",
            "file_folder_index2.php":"/fileHome",
            "system_file_folder":"/showFileBySort_id",
            "diary_show":"/diary/index",
            "news_manage":"/news/manage",
            "notify_manage":"/notice/manage",
            "knowledge_management":"/file/home",
            "system_file_folder":"/file/setIndex",
            "system_workflow_flow_guide":"/flow/type/index",
            "system_workflow_flow_form":"/workflow/formtype/index",
            "file_folder_index2.php":"/file/persionBox",
            "system_workflow_flow_sort":"/workflow/flowclassify/index",
            "system_unit":"/sys/companyInfo",
            "system_dept":"/common/deptManagement",
            "system_org_manage":"/sys/organizational",
            "workflow_new":"/workflow/work/addwork",
            "workflow_list":"/workflow/work/workList",
            "workflow_query":"",
            "system_user":"/common/userManagement",
            "system_status_text":"/sys/statusBar",
            "system_interface":"/sys/interfaceSettings",
            "system_reg_view":"/sys/sysInfo",
            "system_menu":"/sys/menuSetting",
            "system_log":"/sys/journal",
            "system_code":"/common/systemCode",
            "info_unit":"/sys/unitInfor",
            "info_dept":"/department/deptQuery",
            "info_user":"/sys/userInfor",
            "calendar":"/schedule/index",
            "system_user_priv":"/roleAuthorization",
            "system_netdisk":"/netdiskSettings/netdisksetting",
            "document_mine":"/document/mine",
            "person_info":"/controlpanel/index",
            "system_workflow_self-motion":"/workflow/work/automaticNumbering",
            "system_workflow_business":"/workflow/work/businessApplications",
            "document_query":"/sys/underdevelopment",
            "netdisk":"/netdiskSettings/networkHardDisk",
            "calendar_info":"/schedule/query",
            "deleteDatePage":"/deleteDatePage",
            "attendance_personal":"/attendPage/myAttendance",
            "hr_manage_staff_info" :"/hr/page/hrindex",
            "hr_manage_staff_contract":"/hr/page/contractIndex",
            "document_send_draft":"/document/draftArticlesOfCommunication",
            "document_send_backlog":"/document/makeADraft",
            "document_send_have":"/document/IthasBeenDone",
            "document_send_mine":"/document/ISentAMessage",
            "meeting_apply":"/MeetingCommon/MeetingApply",
            "meeting_query":"/MeetingCommon/selectMeeting",
            "meeting_mymeeting":"/MeetingCommon/selectMyMeeting",
            "meeting_summary":"/MeetingCommon/selectMeetingMinutes",
            "meeting_management":"/MeetingCommon/selectMeetingMange",
            "meeting_equipmentcontrol":"/MeetingCommon/MeetingDeviceMange",
            "meeting_meetingroom":"/MeetingCommon/MeetingRoom",
            "meeting_admin_settings":"/MeetingCommon/MeetingMange",
            "supervise_task":"SupervCommon/MySupervision",
            "supervise_management":"/SupervCommon/SupervisionManage",
            "supervise_classify":"/SupervCommon/SupervisionType",
            "supervise_statistics":"/SupervCommon/Supervisionstatistic",
            "document_recv_register":"/document/addresseeRegistrationForm",
            "document_recv_backlog":"/document/inAbeyance",
            "document_recv_have":"/document/received",
            "document_recv_mine":"/document/myInReply",
            "document_query":"/document/theOfficialDocumentQuery",
            "document_statistics":"/document/theOfficialStatistics",
            "document_supervise":"/document/documentsSupervisor",
            "document_setting":"/document/officialDocumentSet",
            "sms_index":"/sms/index",
            "document_template_setting":'/document/officialDocumentSet',
            "attendance_manage_confirm":"/attendPage/backlogAttendLeave",
            "attendance_manage_query":"/attendPage/attendance",
            "system_secure_rule":"/sys/secureIndex"}
//   获取功能列表
        $.ajax({
            url:'/todoList/getSysFunctionByName',
            type:'post',
            dataType:'json',
            data:{funName:decodeURI($.GetRequest().search)},
            success:function(reg){
                var data=reg.obj;
                var str="";
                if(data.length>0){
                    $('.noSearch').hide();
                    $('.searchBox').show();
                    $('.apply_custom').show();
                    for(var i=0;i<data.length;i++){
                        str+='<li class="menuName" uri="'+data[i].url+'">' +
                            '<img class="applyImg" src="../../img/spirit/applyone.png" alt="">' +
                            '<h2 class="user" style="padding-top:1px;">'+data[i].name+'</h2>' +
                            '</li>';
                    }
                    $('.applyList ul').html(str);
                }

            }
        })
//        点击具体功能实现跳转
        $('.applyList').on('click','.menuName',function(){
            var me=$(this);
            var user=decodeURI(me.find('.user').html());
            var name=me.attr('uri')
            var arr=name.split('/');
            var str=arr.join('_');
            var urll=menu[str];
            var url=decodeURI(urll);
            new QWebChannel(qt.webChannelTransport, function(channel) {
                var content = channel.objects.interface;
                content.xoa_sms(url,user,"web_url");
            });

        })

        //        点击具体用户
        $('.userList').on('click','.userName',function(){
            var me=$(this);
            var id=decodeURI(me.attr('id'));
            var datas={
                username:me.attr('username'),
                userprivname:me.attr('prive'),
                sex:me.attr('sex'),
                mobilNo:me.attr('num'),

            }
            var data=JSON.stringify(datas);
            console.log(id);
            console.log(data);
            new QWebChannel(qt.webChannelTransport, function(channel) {
                var content = channel.objects.interface;
                content.xoa_sms(id,data,"SEND_MSG");
            });

        })

//        点击用户title，显示、隐藏
        $('.search_custom  .userTitle').click(function(){
            $('.userList').toggle();
            var src='../../img/spirit/deptbuttom.png';
            if($('.user_open').attr('src')==src){
                $('.user_open').attr('src','../../img/spirit/dept.png')
            }else{
                $('.user_open').attr('src','../../img/spirit/deptbuttom.png')
            }
        })
//        点击功能title，显示、隐藏
        $('.apply_custom  .userTitle').click(function(){
            $('.applyList').toggle();
            var src='../../img/spirit/deptbuttom.png';
            if($('.apply_open').attr('src')==src){
                $('.apply_open').attr('src','../../img/spirit/dept.png')
            }else{
                $('.apply_open').attr('src','../../img/spirit/deptbuttom.png')
            }
        })
    })
</script>
</body>
</html>