<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() +"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>

    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js">    </script>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/ipanel.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/menu.css">
    <style>
        .yiji_title{
            font-size: 14px;
            position: relative;
        }
        .yiji_title .before{
            position: absolute;
            right:5px;
        }
        .yiji_title .after{
            position: absolute;
            right:5px;
        }
        ul{
            margin-left:0px;
        }
        .app_connect ul li .yiji_title{
            padding-left:15px;
            height: 40px;
            line-height: 40px;
            border-bottom: 1px solid #d0dde9;
            border-top: 1px solid #fbfdff;
        }
        .app_connect ul li .yiji_title:hover{
            background: #abd9fe;
        }
        body{
            background: #eaf4fd;
        }
        .common{
            background: #f9fcff;
        }
        .app_connect .common ul li .yiji_title{
            border: none;
            height: 30px;
            line-height: 30px;
        }
        .appname{
            color: #1c3347;
        }
        .common .appname{
            font-size: 14px;
            height: 30px;
            line-height: 30px;
        }
        .common .head_pic{
            margin: 5px;
        }
        .common .yiji_title .before{
            background: url(../../img/main_img/cc-sq.png) no-repeat center;
        }
        .common .yiji_title .after{
             background:url(../../img/main_img/cc-dk.png) no-repeat center;
        }
        .app_connect{
            overflow-y: auto;
            overflow-x: hidden;
        }
        /*修改滚动轴样式*/
        ::-webkit-scrollbar {
            width: 0px;
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

    </style>
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
</head>
<body>
	<div class="wrap">
				<div class="app_connect yiji">
					<ul></ul>
				</div>
	</div>
</body>
 
<script language="JavaScript">
    var menu = {
        "email":"email/index",
        "email_eamilStatis":"email/eamilStatis",
        "sys_getPostmanagement":"sys/getPostmanagement",
        "footprint_index":"footprint/index",
        "vote_show":"vote/manage/voteIndex",
        "salary_lclb":"salary/lclb",
        "address_index":"address/index",
        "spirit_webChatRecord":"spirit/webChatRecord",
        "rmsRollRoom_manage":"rmsRollRoom/manage",
        "rmsRoll_index":"rmsRoll/index",
        "rmsFile_index":"rmsFile/index",
        "rmsFile_toDestroyed":"rmsFile/toDestroyed",
        "system_notify":"notice/notificAtion",
        "smsSettings_index":"smsSettings/index",
        "timed_management":"TimedTaskManagementController/imedTaskManagement",
        "notify_auditing":"notice/appprove",
        "notify_show":"notice/allNotifications",
        "news_show":"news/index",
        "system_file_folder":"showFileBySort_id",
        "diary_show":"diary/index",
        "news_manage":"news/manage",
        "notify_manage":"notice/noticeManagement",
        "knowledge_management":"file/home",
        "system_file_folder":"file/setIndex",
        "system_workflow_flow_guide":"flow/type/index",
        "system_workflow_flow_form":"workflow/formtype/index",
        "file_folder_index2.php":"file/persionBox?0",
        "system_workflow_flow_sort":"workflow/flowclassify/index",
        "system_unit":"sys/companyInfo",
        "system_dept":"common/deptManagement",
        "system_org_manage":"sys/organizational",
        "workflow_new":"workflow/work/addwork",
        "workflow_list":"workflow/work/workList",
        "workflow_query":"flowRunPage/queryFlowRun",
        "workflow_workMonitoring":"workflow/work/workMonitoring",
        "system_user":"common/userManagement",
        "system_status_text":"sys/statusBar",
        "system_interface":"sys/interfaceSettings",
        "system_reg_view":"sys/sysInfo",
        "system_menu":"sys/menuSetting",
        "system_log":"sys/journal",
        "system_code":"common/systemCode",
        "info_unit":"sys/unitInfor",
        "info_dept":"department/deptQuery",
        "info_user":"sys/userInfor",
        "calendar":"schedule/index",
        "system_user_priv":"roleAuthorization",
        "system_netdisk":"netdiskSettings/netdisksetting",
        "document_mine":"document/mine",
        "person_info":"controlpanel/index",
        "system_workflow_self-motion":"/workflow/work/automaticNumbering",
        "system_workflow_business":"/workflow/work/businessApplications",
        "document_query":"sys/underdevelopment",
        "netdisk":"netdiskSettings/networkHardDisk",
        "calendar_info":"schedule/query",
        "deleteDatePage":"deleteDatePage",
        "attendance_personal":"/attendPage/myAttendance",
        "hr_manage_staff_info" :"hr/page/hrindex",
        "hr_manage_staff_contract":"hr/page/contractIndex",
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
        "supervise_management":"SupervCommon/SupervisionManage",
        "supervise_classify":"SupervCommon/SupervisionType",
        "supervise_statistics":"SupervCommon/Supervisionstatistic",
        "document_recv_register":"document/addresseeRegistrationForm",
        "document_recv_backlog":"document/inAbeyance",
        "document_recv_have":"document/received",
        "document_recv_mine":"document/myInReply",
        "document_query":"document/theOfficialDocumentQuery",
        "document_statistics":"document/theOfficialStatistics",
        "document_supervise":"document/documentsSupervisor",
        "document_setting":"document/officialDocumentSet",
        "sms_index":"sms/index",
        "document_template_setting":'document/officialDocumentSet',
        "attendance_manage_confirm":"attendPage/backlogAttendLeave",
        "attendance_manage_query":"attendPage/attendance",
        "system_secure_rule":"sys/secureIndex",
        "notes_index":"Notes/index",
        "vote_manage":"vote/manage/vote",
        "timeLineConmon_timeLineEvent":"timeLineConmon/timeLineEvent",
        "timeLineConmon_eventManage":"timeLineConmon/eventManage",
        "edu_fixAssets_manager":"eduFixAssets/index",
        "hr_training_plan":"eduTrainPlan/goIndex",
        "hr_training_approval":"eduTrainPlan/assessIndex",
        "hr_training_record":"record/trainRecord",
        "meeting_equipment":"/MeetingCommon/MeetingDeviceMange",
        "leaderActivity_leaderActivity":"leaderschedule/leaderActivity",
        "leaderActivity_query":"leaderschedule/query",
        "workPlan_planManager":"workPlan/index",
        "workPlan_queryIndex":"workPlan/workPlanQueryIndex",
        "workPlan_typeSetting":"workPlan/workPlanTypeSetting",
        "officetransHistory_OfficeProductApplyIndex":"officetransHistory/OfficeProductApplyIndex",
        "officetransHistory_approvalIndex":"officetransHistory/approvalIndex",
        "officetransHistory_productRelease":"officetransHistory/productRelease",
        "officeSupplies_goInfomationHome":"officeSupplies/goInfomationHome",
        "officeDepository_index":"officeDepository/goDepositoryindex",
        "officetransHistory_stockIndex":"officetransHistory/stockIndex",
        "vehicle_vehicleuseageindex":"veHicle/veHicleUseageIndex",
        "vehicle_vehicleUseQuery_Index":"veHicleUsage/index",
        "vehicle_vehicleoperator_Index":"veHicle/operatorIndex",
        "vehicle_vehicleMaintenance_index":"tenance/index",
        "vehicle_vehicleDeptApprove_index":"veHicle/vehicleDeptApproveIndex",
        "vehicle_vehicleindex":"veHicle/veHicleIndex",
        "vehicle_vehicleOperatormanage":"veHicle/OperatorMange",
        "document_seal_management":"document/SealIndex",
        "hierarchical_setting":"hierarchical/common/setting",
        "hierarchical_deptManager":"hierarchical/common/deptManager",
        "hierarchical_userManager":"hierarchical/common/userManager",
        "duties_dutiesjsp":"duties/dutiesjsp"
    };
	var type = {
        "email":"email_url",
        "notify_show":"notice_url",
        "news_show":"news_url",
        "file_folder_index2.php":"personfile_ur",
        "system_file_folder":"publicfileset_url",
        "diary_show":"joblog_url",
        "news_manage":"newsmanage_url",
        "notify_manage":"noticemanage_url",
        "knowledge_management":"publicfile_url",
        "system_file_folder":"publicfileset_url",
        "system_workflow_flow_guide":"designflow_url",
        "system_workflow_flow_form":"designform_url",
        "system_workflow_flow_sort":"typeset_url",
        "system_unit":"unitmanage_url",
        "system_dept":"departmanage_url",
        "system_org_manage":"orgmanage_url",
        "workflow_new":"newworkflow_url",
        "workflow_list":"mywork_url",
        "workflow_query":"query_url",
        "system_user":"usermanage_url",
        "system_status_text":"statusbarset_url",
        "system_interface":"desktopset_url",
        "system_reg_view":"sysinfo_url",
        "system_menu":"menuset_url",
        "system_log":"syslogmanage_url",
        "system_code":"syscodeset_url",
        "info_unit":"unitinfoquery_url",
        "info_dept":"departinfoquery_url",
        "info_user":"userinfoquery_url",
        "calendar":"schedule_url",
        "system_user_priv":"powermanage_url",
        "system_netdisk":"netdiskset_url",
        "document_mine":"mydispatch_url",
        "person_info":"controlpanel_url",
        "system_workflow_self-motion":"autonumset_url",
        "system_workflow_business":"userinterface_url",
        "netdisk":"netdisk_url",
        "calendar_info":"schedulequery_url",
        "deleteDatePage":"cleardata_url",
        "attendance_personal":"sign_url",
        "hr_manage_staff_info" :"personfile_url",
        "hr_manage_staff_contract":"contractmanage_url",
        "document_send_draft":"dispatch_url",
        "document_send_backlog":"waitedispatch_url",
        "document_send_have":"alreadydispatch_url",
        "document_send_mine":"mydispatch_url",
        "meeting_apply":"meetingapply_url",
        "meeting_query":"meetingquery_url",
        "meeting_mymeeting":"mymeeting_url",
        "meeting_summary":"meetingsummary_url",
        "meeting_management":"meetingmanage_url",
        "meeting_equipmentcontrol":"meetingdevice_url",
        "meeting_meetingroom":"meetingroom_url",
        "meeting_admin_settings":"admin_url",
        "supervise_task":"supervisetask_url",
        "supervise_management":"supervisemanage_url",
        "supervise_classify":"supervisetype_url",
        "supervise_statistics":"supervisecount_url",
        "document_recv_register":"indispatch_url",
        "document_recv_backlog":"waiteindispatch_url",
        "document_recv_have":"pastindispatch_url",
        "document_recv_mine":"myindispatch_url",
        "document_query":"docquery_url",
        "document_statistics":"doccount_url",
        "document_supervise":"docsupervise_url",
        "document_setting":"docset_url",
        "sms_index":"affairnotice_url",
        "document_template_setting":'templateset_url',
        "attendance_manage_confirm":"workapproval_url",
        "attendance_manage_query":"workcount_url",
        "system_secure_rule":"safetymanage_url",
    };
	$.ajax({
	     url:'<%=basePath%>/showMenu',
	     type:'get',      
	     dataType:'json',
	     success:function(obj){
	     	if(obj.msg=='ok'){
	     		var obj=obj.obj;
	     		var li='';
	     		if(obj!=''){
	     			for(var i=0;i<obj.length;i++){
	     				var fchild=obj[i].child;
	     				li+='<li ><div class="yiji_title"><span  class="head_pic"><img src="/img/main_img/spirit/spirit/'+obj[i].img+'.png" alt="img"/></span><span  id="'+obj[i].id+'" class="appname">'+obj[i].name+'</span><span class="dianji before"></span></div>';
	     				if(fchild.length!=0){
	     					li+='<div class="erji common"><ul>';
	     					for(var j=0;j<fchild.length;j++){
	     						var schild=fchild[j].child;
	     						if(fchild[j].child!=''){
	     							li+='<li ><div style="padding-left: 36px" class="yiji_title" url="'+fchild[j].url+'" onClick="opennew(this)"><span  class="head_pic"><img src="../img/main_img/hei.png" alt="erimg"/></span><span  id="'+fchild[j].id+'"  class="appname">'+fchild[j].name+'</span><span class="dianji before"></span></div><div class="sanji common"><ul>';
	     							for(var z=0;z<schild.length;z++){
	     								li+='<li ><div class="yiji_title" style="padding-left: 56px" url="'+schild[z].url+'" onClick="opennew(this)"><span  class="head_pic"><img src="../img/main_img/hei.png" alt=""/></span><span  id="'+schild[z].id+'"  class="appname">'+schild[z].name+'</span></div></li>';
	     							}
	     							li+='</ul></div>';
	     						}else{
	     							li+='<li ><div style="padding-left: 36px" class="yiji_title"  url="'+fchild[j].url+'" onClick="opennew(this)"><span  class="head_pic"><img src="../img/main_img/hei.png" alt=""/></span><span  id="'+fchild[j].id+'"  class="appname">'+fchild[j].name+'</span></div></li>';
	     						}
	     					}
	     					li+='</ul></div>';
	     				}
	     				li+='</li>';
	     			}
	     			$(".app_connect ul").html(li);
	     		}
	     	}
		 }
		
	});
	   function opennew(e){
	   		var url=$(e).attr('url');
            var aurl;
	   		var id=$(event.currentTarget).find('span.appname').attr('id');
            var name=$(event.currentTarget).find('span.appname').text();
            if(url.indexOf('@') == -1){
                if(url.indexOf('/')>0){
                    url = url.split('/').join('_');
                }
                if(menu[url]){
                    aurl="/"+menu[url];
                }else{
                    aurl='http://192.168.0.17:81/gotophp.php?uid=admin&url='+url;
                }
                parent.fuacQt(aurl,type[url],name);
            }
		}
</script>
<script language="JavaScript">
	$(function(){
	   /***应用二三级菜单展示隐藏***/
	   	$(".app_connect ul").on('click','li .yiji_title',function(){
			if($(this).siblings('div.common').css('display')=='none'){
				$(this).children('span:eq(2)').removeClass('before').addClass('after');
				$(this).siblings('div.common').slideDown(100).children('ul li');
			}else{
				$(this).children('span:eq(2)').removeClass('after').addClass('before');
				$(this).siblings('div.common').slideUp(100);
			}
	   	});		
		
	});
	
</script>
</html>