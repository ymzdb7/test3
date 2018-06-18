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
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="main.userquery" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/sys/userInfor.css"/>
    <link rel="stylesheet" type="text/css" href="/css/sys/userManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/hr/index.css"/>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/sys/userInfor.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../../lib/jquery.form.min.js"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

    <!-- word文本var data_器 -->
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <style>
        html,body{
            height:100%
        }
        .btn_{
            width:300px;
        }
        .leave_send{
            display: inline-block;
            float: left;
            width: 66px;
            height: 30px;
            margin-right: 0px;
            margin-top: 10px;
            margin-bottom: 20px;
            background: url(../../img/publish.png) no-repeat;
            padding-left: 47px;
            padding-top: 7px;
            cursor: pointer;
            font-size: 14px;
        }
        #downChild .dpetWhole0 .childdept{
            padding-left: 60px!important;
        }
        #downChild .dpetWhole0 ul .childdept{
            padding-left: 80px!important;
        }
        #downChild .dpetWhole0 ul ul li .childdept{
            padding-left: 95px!important;
        }

        .rig {
            width: 78%;
        }
        .cont .left .collect .liUp:first-of-type {
            border-top: none!important;
        }
        .liUp{
            background: no-repeat;
        }
        .liDown{
            background: no-repeat;
        }
        .cont .left .collect .spanUP {
            display: block;
            width: 100%;
            padding-left: 30px;
            font-size: 14px;
            height: 40px;
            line-height: 40px;
            cursor: pointer;
            border-bottom: 1px solid rgb(221, 221, 221);
        }
        .childdept{
            padding-left: 19px;
        }
        .cont .left {
            position: fixed;
            width: 19.9%;
            float: left;
            height: 100%;
            overflow-y: auto;
            overflow-x: auto;
            overflow-x: hidden;
            border-right: #ccc 1px solid;
        }
         .rightMain {
            width:80%;
            height: 100%;
            float: right;
             overflow-y: auto;
            font-size: 14px;

        }
        .showInfo {
            width:80%;
            height: 100%;
            float: right;
            overflow-y: auto;
            font-size: 14px;

        }


    </style>
</head>
<body>

    <div class="cont">
        <div class="left">
            <div class="collect">
                <div><span class="spanUP liUp queryExport"><img src="/img/sys/icon_userQuery.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="在职人员人事档案查询">在职人员人事档案查询</span></div>
                <div id="incum" class="divUP">
                    <span class="spanUP liUp AUP" ><img src="/img/sys/icon_inservicsPersonnel.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="在职人员">在职人员</span>
                    <div id="downChild" style="display:block;">
                        <div class="pickCompany"><span style="height:35px;line-height:35px;" class="childdept"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left: 13px;margin-bottom: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="" style="color: #000;"></a></span></div>
                    </div>
                </div>
            </div>
        </div>
      <%--  <div class="rig">
            <iframe src="hrContRight" frameborder="0" width="100%" height="100%"></iframe>
        </div>--%>


        <div class="rightMain clearfix" style="height:100%;display: block;">
            <iframe id="iframe" src="/hr/query/hr_onLineFind" frameborder="0" style="width: 100%;height: 100%">

            </iframe>
            <div class="rig" style="display: none;">

                <div class="table_personDetail" id="table_personDetail" style="display: none;">
                    <table class="TableBlock" width="100%" align="center">
                        <tbody>
                        <tr>
                            <td nowrap="" class="TableData"><fmt:message code="hr.th.IDNumber" />：</td>
                            <td class="TableData">
                                <input type="text" name="STAFF_CARD_NO" id="STAFF_CARD_NO" class="BigInput per_ident" value="" >
                            </td>
                            <td nowrap="" class="TableData"><fmt:message code="hr.th.DateOfBirth" />：</td>
                            <td class="TableData" colspan="2" title="<fmt:message code="hr.th.ID"/>">
                                <input type="text" name="STAFF_BIRTH" id="STAFF_BIRTH" size="10" maxlength="10" class="BigInput per_date" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:get_animal_sign})" onchange="get_animal_sign()">
                                <input type="checkbox" name="IS_LUNAR" id="IS_LUNAR"  style="margin-left: 13px;margin-top: 4px;" class="per_noneli">
                                <label for="IS_LUNAR" class="nongli"><fmt:message code="url.th.Lunar" /></label>
                            </td>
                        </tr>
                        </tr>

            <tr>
            <%--uevar data_器--%>
            <td colspan="6">
            <div id="word_container" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></div>
            </td>
            </tr>
            </tbody>
            </table>
                </div>
                <table class="allCondition"    style="border-collapse: collapse;" ></table>
            </div>
            </div>
        <div class="showInfo" style="display: none;height: 100%;">
            <iframe src="" frameborder="0" style="width: 100%;height: 100%" >

            </iframe>
        </div>
    </div>
    </div>


<script>

    $('.queryExport').click(function () {
        $('.cont .rig').css("display","none");
        $('.showInfo').css("display","none");
        $('.rightMain').css("display","block");
        $('.rightMain #iframe').attr("src","/hr/query/hr_onLineFind");
    });
    //选部门
    $('.dept_add').click(function(){
        dept_id='LEAVE_DEPT';
        $.popWindow("../../common/selectDept?0");
    });
    //选角色
    $('.userPriv_add').click(function(){
        priv_id='USER_PRIV_NAME';
        $.popWindow("../../common/selectPriv");
    });
    //人员选择控件（离职人员）
    $(".leavePerson_add").on("click",function(){
        user_id='LEAVE_PERSON';
        $.popWindow("../../common/selectUser?0");
    });
    //人员选择控件（直属上级）
    $(".add_shangji").on("click",function(){
        user_id='directlySuperiorName';
        $.popWindow("../../common/selectUser");
    });
    //人员选择控件（直属下级）
    $(".add_xiaji").on("click",function(){
        user_id='directlyUnderName';
        $.popWindow("../../common/selectUser");
    });
    //清空（直属上级）
    $(".clear_shangji").on("click",function(){
        $('#directlySuperiorName').val('');
        $('#directlySuperiorName').attr("dataid",'');
    });
    //人清空（直属下级）
    $(".clear_xiaji").on("click",function(){
        /*直属上级*/
        $('#directlyUnderName').val('');
        $('#directlyUnderName').attr("dataid",'');
    });
    /* word文本编辑器 */
    var ue = UE.getEditor('word_container');
    /*人员接口*/
    function clickrenwu(id,me) {
        $('.cont .rig').css("display","none");
        $('.rightMain').css("display","none");
        $('.showInfo').css("display","block");
        $('.showInfo iframe').attr("src","/hr/query/personInfo?id="+id);
        //$.GetRequest().id
    }
    <%--function clickrenwu (id,me) {--%>
        <%--$('#add_send').attr('ac', 'edit');--%>
        <%--$(".leave_send").show();//离职按钮显示--%>
        <%--$('.table_personDetail').show().siblings().hide();--%>
        <%--//先清空头像--%>
        <%--$(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');/*暂无照片*/--%>
        <%--$("#showImage").html("");--%>
        <%--var data = {--%>
            <%--'uid': id--%>
        <%--}--%>
        <%--ue.ready(function () {--%>
            <%--$.ajax({--%>
                <%--type: 'get',--%>
                <%--url: '<%=basePath%>hr/api/getPersonFileByUserId',--%>
                <%--dataType: 'json',--%>
                <%--data: data,--%>
                <%--success: function (res) {--%>
                    <%--var data = res;--%>
                    <%--var str = '';--%>
                    <%--//附件--%>
                   <%--/* if(data.attachmentList.length>0){--%>
                        <%--for(var i=0;i<data.attachmentList.length;i++){--%>
                            <%--str+='<div class="dech" deUrl="'+data.attachmentList[i].attUrl+'"><a href="<%=basePath %>download?'+data.attachmentList[i].attUrl+'" NAME="'+data.attachmentList[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data.attachmentList[i].attachName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data.attachmentList[i].aid+'@'+data.attachmentList[i].ym+'_'+data.attachmentList[i].attachId+',"></div>';--%>
                        <%--}--%>
                    <%--}else{--%>
                        <%--str='';--%>
                    <%--}--%>
                    <%--$('.Attachment').append(str);*/--%>
                    <%--$("#animal_id").val("");//先将生肖清空--%>
                    <%--$("#sign_id").val("");//先将星座清空--%>

                    <%--$(".dept_id").val(data.deptId);--%>
                    <%--$(".uid").val(data.uid);--%>
                    <%--$(".staffId").val(data.staffId);--%>
                    <%--$(".user_id").val(data.userId);//userId--%>
                    <%--$('.per_name').val(data.staffName);--%>
                    <%--/*姓名*/--%>
                    <%--$('.dept_name ').val(data.deptName);--%>
                    <%--/*部门 缺少字段*/--%>
                    <%--$('.per_health').val(data.staffHealth);--%>
                    <%--/*健康*/--%>
                    <%--$('.per_zhuanye').val(data.staffMajor);--%>
                    <%--/*专业*/--%>
                    <%--$('.per_school').val(data.graduationSchool);--%>
                    <%--/*大学*/--%>
                    <%--//$('.per_familyAdd').val(data.homeAddress);/*家庭住址*/--%>
                    <%--$('.per_email').val(data.staffEmail);--%>
                    <%--/*邮件*/--%>
                    <%--$('.userPrivName').val(data.userPrivName);--%>
                    <%--/*角色*/--%>
                    <%--/*$(".userPriv").val(data.userPriv);//角色id*/--%>
                    <%--$(".userPrivName").attr("userPriv", data.userPriv);//角色id--%>

                    <%--$('.per_engname').val(data.staffEName);--%>
                    <%--/*本人的英文姓名*/--%>
                    <%--$('.per_minzu').val(data.staffNationality);--%>
                    <%--/*民族*/--%>
                    <%--$('.per_worknum').val(data.workNo);--%>
                    <%--/*工号*/--%>
                    <%--$('.per_sex').val(data.staffSex);--%>
                    <%--/*性别*/--%>
                    <%--$('.per_ident').val(data.staffCardNo);--%>
                    <%--/*身份证号*/--%>
                    <%--if(data.staffBirth=='0000-00-00'){--%>
                        <%--$('.per_date').val('');--%>
                    <%--}else{--%>
                        <%--$('.per_date').val(data.staffBirth);--%>
                    <%--}--%>
                    <%--/*出生日期*/--%>
                    <%--$('.per_age').val(data.staffAge);--%>
                    <%--/*年龄*/--%>
                    <%--$('.per_yearjia').val(data.leaveType);--%>
                    <%--/*年休假 */--%>
                    <%--$('.per_address').val(data.staffNativePlace);--%>
                    <%--/*籍贯*/--%>
                    <%--$('.per_detialAdd').val(data.staffNativePlace2);--%>
                    <%--/*具体籍贯*/--%>
                    <%--$('.per_xiexing').val(data.bloodType);--%>
                    <%--/*血型*/--%>
                    <%--$('.per_hunyin').val(data.staffMaritalStatus);--%>
                    <%--/*婚姻状况*/--%>
                    <%--$('.per_zhengzhi').val(data.staffPoliticalStatus);--%>
                    <%--/*政治面貌*/--%>
                    <%--if(data.joinPartyTime=='0000-00-00'){--%>
                        <%--$('.per_dang').val('');--%>
                    <%--}else{--%>
                        <%--$('.per_dang').val(data.joinPartyTime);--%>
                    <%--}--%>
                    <%--/*入党时间*/--%>
                    <%--$('.per_hukou').val(data.staffType);--%>
                    <%--/*户口类别*/--%>
                    <%--$('.per_hukouAdd').val(data.staffDomicilePlace);--%>
                    <%--/*户口所在地*/--%>
                    <%--$('.per_gongzhong').val(data.workType);--%>
                    <%--/*工种*/--%>
                    <%--$('.per_xingzheng').val(data.administrationLevel);--%>
                    <%--/*行政级别 */--%>
                    <%--$('.per_yuangongType').val(data.staffOccupation);--%>
                    <%--/*员工类型*/--%>
                    <%--$('.per_zhiwu').val(data.jobPosition);--%>
                    <%--/*职务*/--%>
                    <%--$('.per_zhicheng').val(data.presentPosition);--%>
                    <%--/*职称*/--%>
                    <%--if(data.datesEmployed=='0000-00-00'){--%>
                        <%--$('.per_ruzhiTime').val('');--%>
                    <%--}else{--%>
                        <%--$('.per_ruzhiTime').val(data.datesEmployed);--%>
                    <%--}--%>
                    <%--/*入职时间*/--%>
                    <%--$('.per_zhichengjibie').val(data.workLevel);--%>
                    <%--/*职称级别*/--%>
                    <%--$('.per_yingpin').val(data.workJob);--%>
                    <%--/*应聘岗位*/--%>
                    <%--$('.per_kaoqin').val(data.workNo);--%>
                    <%--/*考勤排班类别   ====》无字段 未找到*/--%>
                    <%--$('.per_gongling').val(data.jobAge);--%>
                    <%--/*本单位工龄*/--%>
                    <%--$('.per_allage').val(data.workAge);--%>
                    <%--/*总工龄*/--%>
                    <%--if(data.beginSalsryTime=='0000-00-00'){--%>
                        <%--$('.per_xinziTime').val('');--%>
                    <%--}else{--%>
                        <%--$('.per_xinziTime').val(data.beginSalsryTime);--%>
                    <%--}--%>
                    <%--/*起薪时间 ===》找到*/--%>
                    <%--$('.per_zaizhizhuangtai').val(data.workStatus);--%>
                    <%--/*在职状态*/--%>
                    <%--if(data.jobBeginning=='0000-00-00'){--%>
                        <%--$('.per_joinWork').val('');--%>
                    <%--}else{--%>
                        <%--$('.per_joinWork').val(data.jobBeginning);--%>
                    <%--}--%>
                    <%--/*参加工作时间*/--%>
                    <%--$('.per_dianhua').val(data.staffPhone);--%>
                    <%--/*联系电话*/--%>
                    <%--$('.per_phone').val(data.staffMobile);--%>
                    <%--/*手机号码*/--%>
                    <%--$('.per_msn').val(data.staffMsn);--%>
                    <%--/*msn*/--%>
                    <%--$('.per_familyAdd').val(data.homeAddress);--%>
                    <%--/*家庭地址 */--%>
                    <%--$('.per_elseType').val(data.otherContact);--%>
                    <%--/*其他联系方式*/--%>
                     <%--$('.per_yanjiu').val(data.researchResults);/*研究领域 未找到*/--%>
                    <%--$('.per_socish').val(data.partTime);--%>
                    <%--/*社会兼职*/--%>
                    <%--$('.per_success').val(data.researchResults);--%>
                    <%--/*成果介绍*/--%>
                    <%--$('#directlySuperiorName').val(data.directlySuperiorName);--%>
                    <%--$('#directlySuperiorName').attr("dataid",data.directlySuperior);--%>
                    <%--/*直属上级*/--%>
                    <%--$('#directlyUnderName').val(data.directlyUnderName);--%>
                    <%--$('#directlyUnderName').attr("dataid",data.directlyUnder);--%>
                    <%--/*直属下级*/--%>
                    <%--$('.per_kaihuhang').val(data.bank1);--%>
                    <%--/*开户行1*/--%>
                    <%--$('.per_kaihuhangtwo').val(data.bank2);--%>
                    <%--/*开户行2*/--%>
                    <%--$('.zhanghuone').val(data.bankAccount1);--%>
                    <%--/*开户行的账号1*/--%>
                    <%--$('.zhanghutwo').val(data.bankAccount2);--%>
                    <%--/*开户行的账号2*/--%>
                    <%--$('.per_xueli').val(data.staffHighestSchool);--%>
                    <%--/*学历*/--%>
                    <%--$('.per_xuewei').val(data.staffHighestDegree);--%>
                    <%--/*学位*/--%>
                    <%--if(data.graduationDate=='0000-00-00'){--%>
                        <%--$('.per_overtime').val('');--%>
                    <%--}else{--%>
                        <%--$('.per_overtime').val(data.graduationDate);--%>
                    <%--}--%>
                    <%--/*毕业时间*/--%>
                    <%--$('.per_shuiping').val(data.computerLevel);--%>
                    <%--/*计算机水平*/--%>
                    <%--$('.per_yuzhongone').val(data.foreignLanguage1);--%>
                    <%--/*外语语种1*/--%>
                    <%--$('.per_yuzhongtwo').val(data.foreignLanguage2);--%>
                    <%--/*外语语种2*/--%>
                    <%--$('.per_yuzhongthree').val(data.foreignLanguage3);--%>
                    <%--/*外语语种3*/--%>
                    <%--$('.per_waiyuthree').val(data.foreignLevel1);--%>
                    <%--/*外语水平1*/--%>
                    <%--$('.per_waiyutwo').val(data.foreignLevel2);--%>
                    <%--/*外语水平2*/--%>
                    <%--$('.per_waiyuone').val(data.foreignLevel3);--%>
                    <%--/*外语水平3*/--%>
                    <%--$('.per_techang').val(data.staffSkills);--%>
                    <%--/*特长*/--%>
                    <%--$('.zhiwu').val(data.certificate);--%>
                    <%--/*职务情况 */--%>
                    <%--$('.danbao').val(data.surety);--%>
                    <%--/*担保记录*/--%>
                    <%--$('.shebao').val(data.insure);--%>
                    <%--/*社保*/--%>
                    <%--$('.tijian').val(data.bodyExamim);--%>
                    <%--/*体检*/--%>
                    <%--$('.beizhu').val(data.remark);--%>
                    <%--/*备注*/--%>
                    <%--$(".per_qq").val(data.staffQq);//qq--%>
                    <%--/*简历*/--%>
                    <%--$(".per_num").val(data.staffNo);//编号--%>
                    <%--$(".per_overname").val(data.beforeName);//曾用名--%>
                    <%--var birth = $("#STAFF_BIRTH").val();--%>
                    <%--if (birth != '' && birth != '0000-00-00') {--%>
                        <%--var birth=$("#STAFF_BIRTH").val();--%>
                        <%--$("#animal_id").val(Calculator.shengxiao(birth));--%>
                        <%--birth=birth.replace(/-/g,"");--%>
                        <%--var month=birth.substring(4,6);--%>
                        <%--var day=birth.substring(6,8);--%>
                        <%--$("#sign_id").val(Calculator.xingzuo(month,day));--%>
                    <%--}--%>
                    <%--//是否农历--%>
                    <%--if(data.isLunar==1){--%>

                        <%--$("#IS_LUNAR").prop("checked",true);--%>
                    <%--}else{--%>
                        <%--$("#IS_LUNAR").prop("checked",false);--%>
                    <%--}--%>
                    <%--/*是否成为专家*/--%>
                    <%--if(data.isExperts==1){--%>
                        <%--$('.isExperts').eq(0).prop("checked",true);--%>
                    <%--}else{--%>
                        <%--$('.isExperts').eq(1).prop("checked",true);--%>
                    <%--}--%>
                    <%--//头像--%>
                    <%--$("#showImage").html(data.photoName);--%>
                    <%--if(data.photoName!=''){--%>
                        <%--$(".hr_photo").html('<image  style="width:140px;height:135px;" src="<%=basePath%>img/hr/'+data.photoName+'" >');//头像--%>
                    <%--}else{--%>
                        <%--$(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');--%>
                    <%--}--%>
                    <%--ue.setContent(data.resume);--%>
                <%--}--%>
            <%--})--%>
        <%--})--%>
    <%--}--%>

    var deptNameShow = "";
    var deptIdShow = "";
    /*部门接口*/
    function ajaxdata(deptNumId, me) {//部门
        deptIdShow = deptNumId;
        deptNameShow = $(me).find('a').text();
        $('.loopData').remove();
        $('.childQuery').show().siblings().hide();
        var data = {
            'deptId': deptNumId
        };
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/api/getPersonFilesByDeptId',
            dataType: 'json',
            data: data,
            success: function (res) {
                $(".checkOper").remove();
                var th = '<tr>' +
                    '<th><fmt:message code="notice.th.chose" /></th>' +
                    '<th><fmt:message code="userDetails.th.name" /></th>' +
                    '<th><fmt:message code="interfaceSetting.th.UserAvatar" /></th>' +
                    '<th><fmt:message code="HR.TH.FileAvatar" /></th>' +
                    '<th>OA<fmt:message code="userManagement.th.role" /></th>' +
                    '<th><fmt:message code="userDetails.th.Gender" /></th>' +
                    '<th><fmt:message code="hr.th.DateOfBirth" /></th>' +
                    '<th><fmt:message code="hr.th.Nation" /></th>' +
                    '<th><fmt:message code="hr.th.PlaceOfOrigin" /></th>' +
                    '<th><fmt:message code="hr.th.PoliticalOutlook" /></th>' +
                    '<th><fmt:message code="hr.th.InductionTime" /></th>' +
                    '<th><fmt:message code="notice.th.operation" /></th>' +
                    '</tr>';
                var data = res.obj;
                var str = '';
                if (data.length > 0) {
                    for (var i = 0; i < data.length; i++) {
                        var txt = data[i].staffSex == 0 ? '<fmt:message code="userInfor.th.male" />' : '<fmt:message code="userInfor.th.female" />';
                        var photo=data[i].photo==''?'<fmt:message code="hr.th.NotUploaded" />':'<fmt:message code="doc.th.Uploaded" />';
                        var photoName=data[i].photoName==''?'<fmt:message code="hr.th.NotUploaded" />':'<fmt:message code="doc.th.Uploaded" />';
                        str += '<tr class="loopData" uid="' + data[i].deptId + '">' +
                            '<td align="center"><input  id="input1" name="" type="checkbox" val="' + data[i].staffId + '" class="checkChild" style="margin-left: 30%;"/></td>' +
                            '<td class="userDetail">' + data[i].staffName + '</td>' +
                            '<td>' + photo + '</td>' +
                            '<td>' + photoName + '</td>' +
                            '<td>' + data[i].userPrivName + '</td>' +
                            '<td>' + txt + '</td>' +
                            '<td>' + data[i].staffBirth + '</td>' +
                            '<td>' + data[i].staffNationality + '</td>' +
                            '<td>' + data[i].staffNativePlace2 + '</td>' ;

                           if(data[i].staffPoliticalStatus==1){
                               str+= '<td>群众</td>' ;
                           }else  if(data[i].staffPoliticalStatus==2){
                               str+= '<td>共青团员</td>' ;
                           }else  if(data[i].staffPoliticalStatus==3){
                               str+= '<td>中共党员</td>' ;
                           }else  if(data[i].staffPoliticalStatus==4){
                               str+= '<td>中共预备党员</td>' ;
                           }else  if(data[i].staffPoliticalStatus==5){
                               str+= '<td>民主党派</td>' ;
                           }else  if(data[i].staffPoliticalStatus==6){
                               str+= '<td>无党派人士</td>' ;
                           }else{
                               str+= '<td></td>' ;
                           }
                        str+=  '<td>' + data[i].datesEmployed + '</td>' +
                            '<td><a class="hr_edit"  uid="' + data[i].uid + '"><fmt:message code="global.lang.edit" /></a>&nbsp;&nbsp;' +
                            '<a class="delBtnSingle"  val="' + data[i].staffId + '" href="javascript:void(0)"><fmt:message code="global.lang.delete" /></a></td>' +
                            '</tr>';
                    }
                    $('.allCondition').html(th + str);
                } else {
                    $('.allCondition').html(th);
                }
                var userCount = 0;//用户人数
                var haveDocument = 0;//建档人数
                //根据部门查询当前部门下用户的人数
                $.ajax({
                    type: 'get',
                    url: '<%=basePath%>user/getUsersByDeptId',
                    dataType: 'json',
                    data: {
                        'deptId': deptNumId
                    },
                    success: function (obj) {
                        var data1 = obj.obj;
                        userCount = data1.length;
                        $(".have_per").html(userCount);
                        haveDocument = data.length;
                        $(".no_perCount").html(parseInt(userCount) - parseInt(haveDocument));
                    }
                })
            }
        })
        <%--$.ajax({--%>
            <%--type: 'get',--%>
            <%--url: '<%=basePath%>hr/api/queryCountNoDocument',--%>
            <%--dataType: 'json',--%>
            <%--data: data,--%>
            <%--success: function (res) {--%>
                <%--var count = res.totleNum;--%>
                <%--$(".no_perCount").html(count);--%>
            <%--}--%>
        <%--})--%>
    }

    //列表中的复选框
    $(function () {
        $('.childQuery').on('click', '#checkedAll', function () {
            var state = $(this).prop("checked");
            if (state == true) {
                $(this).prop("checked", true);
                $(".checkChild").prop("checked", true);
            } else {
                $(this).prop("checked", false);
                $(".checkChild").prop("checked", false);
            }
        })
    })
    //在列表中进行单个删除
    $('.allCondition').on('click', '.delBtnSingle', function () {
        var staffId = $(this).attr("val") + ",";
        layer.confirm('<fmt:message code="workflow.th.suredel" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="doc.th.DeletePersonnelFile" />"
        }, function(){
             $.ajax({
                    type: 'post',
                    url: '/hr/api/deletePersonById',
                    dataType: 'json',
                    data: {'staffId': staffId},
                   success: function (obj) {
                        if(obj.flag){
                            $.layerMsg({content:"<fmt:message code="workflow.th.delsucess" />",icon: 6}, function(){
                            });
                            window.location.reload();
                        }
                     }
                });
        }, function(index){
            layer.close(index);
        });
    });
    /*新建用户档案*/
    $('.hr_add').on('click', function () {
        //先清空头像
        $(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');
        $("#showImage").html("");
        $("#IS_LUNAR").prop("checked",false);
        $('#add_send').attr('ac', 'add');
        $(".dept_name").val(deptNameShow);
        $(".dept_id").val(deptIdShow);
        $('.user_id').val('');//清空userId
        $(".staffId").val('');
        $('.table_personDetail').show().siblings().hide();
        /*初始化*/
        $(".userPrivName").attr("userPriv", "");//角色id
        $(".userPrivName").val("");
        $('.per_name').val('');
        /*姓名*/
        $('.per_health').val('');
        /*健康*/
        $('.per_zhuanye').val('');
        /*专业*/
        $('.per_school').val('');
        /*大学*/
        // $('.per_familyAdd').val('');/*家庭住址*/
        $('.per_email').val('');
        /*邮件*/
        $('.user_priv').val('');
        /*角色*/
        $('.per_engname').val('');
        /*本人的英文姓名*/
        $('.per_minzu').val('');
        /*用户名*/
        $('.per_worknum').val('');
        /*工号*/
        $('.per_sex').val('');
        /*性别*/
        $('.per_ident').val('');
        /*身份证号*/
        $('.per_date').val('');
        /*出生日期*/
        $('.per_age').val('');
        /*年龄*/
        $('.per_yearjia').val('');
        /*年休假 */
        $('.per_address').val('');
        /*籍贯*/
        $('.per_detialAdd').val('');
        /*具体籍贯*/
        $('.per_shengxiao').val('');
        /*生肖 未找到*/
        $('.per_start').val('');
        /*星座  未找到*/
        $('.per_xiexing').val('');
        /*血型*/
        $('.per_hunyin').val('');
        /*婚姻状况*/
        $('.per_zhengzhi').val('');
        /*政治面貌*/
        $('.per_dang').val('');
        /*入党时间*/
        $('.per_hukou').val('');
        /*户口类别*/
        $('.per_hukouAdd').val('');
        /*户口所在地*/
        $('.per_gongzhong').val('');
        /*工种*/
        $('.per_xingzheng').val('');
        /*行政级别 */
        $('.per_yuangongType').val('');
        /*员工类型*/
        $('.per_zhiwu').val('');
        /*职务*/
        $('.per_zhicheng').val('');
        /*职称*/
        $('.per_ruzhiTime').val('');
        /*入职时间*/
        $('.per_zhichengjibie').val('');
        /*职称级别*/
        $('.per_yingpin').val('');
        /*应聘岗位*/
        $('.per_kaoqin').val('');
        /*考勤排班类别   ====》无字段 未找到*/
        $('.per_gongling').val('');
        /*本单位工龄*/
        $('.per_allage').val('');
        /*总工龄*/
        $('.per_xinziTime').val('');
        /*起薪时间 ===》少字段 未找到*/
        $('.per_zaizhizhuangtai').val('');
        /*在职状态*/
        $('.per_joinWork').val('');
        /*参加工作时间*/
        $('.per_dianhua').val('');
        /*联系电话*/
        $('.per_phone').val('');
        /*手机号码*/
        $('.per_msn').val('');
        /*msn*/
        $('.per_familyAdd').val('');
        /*家庭地址 */
        $('.per_elseType').val('');
        /*其他联系方式*/
        $('.isExperts').eq(1).prop("checked",true);
        /*是否成为专家          单选*/
        $('.per_yanjiu').val('');
        /*研究领域 未找到*/
        $('.per_socish').val('');
        /*社会兼职*/
        $('.per_success').val('');
        /*成果介绍*/
        $('.text_shangji').val('');
        $('#directlySuperiorName').attr("dataid",""); /*直属上级*/
        $('#directlyUnderName').attr("dataid","");/*直属下级*/
        $('#directlySuperiorName').val(""); /*直属上级*/
        $('#directlyUnderName').val("");/*直属下级*/
        /*开户行1*/
        $('.per_kaihuhangtwo').val('');
        $(".per_kaihuhang").val('');
        /*开户行2*/
        $('.zhanghuone').val('');
        /*开户行的账号1*/
        $('.zhanghutwo').val('');
        /*开户行的账号2*/
        $('.per_xueli').val('');
        /*学历*/
        $('.per_xuewei').val('');
        /*学位*/
        $('.per_overtime').val('');
        /*毕业时间*/
        $('.per_shuiping').val('');
        /*计算机水平*/
        $('.per_yuzhongone').val('');
        /*外语语种1*/
        $('.per_yuzhongtwo').val('');
        /*外语语种2*/
        $('.per_yuzhongthree').val('');
        /*外语语种3*/
        $('.per_yuzhongone').val('');
        /*外语水平1*/
        $('.per_yuzhongtwo').val('');
        /*外语水平2*/
        $('.per_yuzhongthree').val('');
        /*外语水平3*/
        $('.per_techang').val('');
        /*特长*/
        $(".per_num").val('');//编号
        $(".per_overname").val('');//曾用名
        $("#cursor_file").val('');//照片上传
        $(".per_qq").val('');//qq
        $(".per_waiyuone").val('');
        $(".per_waiyutwo").val('');
        $(".per_waiyuthree").val('');
        $('.zhiwu').val('');
        /*职务情况 */
        $('.danbao').val('');
        /*担保记录*/
        $('.shebao').val('');
        /*社保*/
        $('.tijian').val('');
        /*体检*/
        $('.beizhu').val('');
        /*备注*/
        ue.setContent('');

        /*简历*/
        /* $('#add_send').attr('ac','add');*/
        saveButton = 2;
        $(".leave_send").hide();//离职按钮隐藏
    })

    /*点击编辑，展示其对应的详情接口*/
    $('.allCondition').on('click', '.hr_edit', function () {
        var uid = $(this).attr('uid');
        $('.table_personDetail').show().siblings().hide();
        $(".leave_send").show();//离职按钮显示
        $('#add_send').attr('ac', 'edit');
        //先清空头像
        $(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');/*暂无照片*/
        $("#showImage").html("");
        var data = {
            'uid': uid
        };
        ue.ready(function () {
            $.ajax({
                type: 'get',
                url: '<%=basePath%>hr/api/getPersonFileByUserId',
                dataType: 'json',
                data: data,
                success: function (res) {
                    var data = res;
                    var str = '';
                    //清空星座和生肖
                    $("#animal_id").val('');
                    $("#sign_id").val('');

                    $(".uid").val(data.uid);
                    $(".user_id").val(data.userId);//userId
                    $(".staffId").val(data.staffId);
                    $('.per_name').val(data.staffName);
                    /*姓名*/
                    $('.dept_name').val(data.deptName);
                    /*部门 缺少字段*/
                    $('.per_health').val(data.staffHealth);
                    /*健康*/
                    $('.per_zhuanye').val(data.staffMajor);
                    /*专业*/
                    $('.per_school').val(data.graduationSchool);
                    /*大学*/
                    //$('.per_familyAdd').val(data.homeAddress);/*家庭住址*/
                    $('.per_email').val(data.staffEmail);
                    /*邮件*/
                    $('.userPrivName').val(data.userPrivName);
                    /*角色*/
                    /*$(".userPriv").val(data.userPriv);//角色id*/
                    $(".userPrivName").attr("userPriv", data.userPriv);//角色id
                    $('.per_engname').val(data.staffEName);
                    /*本人的英文姓名*/
                    $('.per_minzu').val(data.staffNationality);
                    /*民族*/
                    $('.per_worknum').val(data.workNo);
                    /*工号*/
                    $('.per_sex').val(data.staffSex);
                    /*性别*/
                    $('.per_ident').val(data.staffCardNo);
                    /*身份证号*/
                    if(data.staffBirth=='0000-00-00'){
                        $('.per_date').val('');
                    }else{
                        $('.per_date').val(data.staffBirth);
                    }
                    /*出生日期*/
                    $('.per_age').val(data.staffAge);
                    /*年龄*/
                    $('.per_yearjia').val(data.leaveType);
                    /*年休假 */
                    $('.per_address').val(data.staffNativePlace);
                    /*籍贯*/
                    $('.per_detialAdd').val(data.staffNativePlace2);
                    /*具体籍贯*/
                    $('.per_xiexing').val(data.bloodType);
                    /*血型*/
                    $('.per_hunyin').val(data.staffMaritalStatus);
                    /*婚姻状况*/
                    $('.per_zhengzhi').val(data.staffPoliticalStatus);
                    /*政治面貌*/
                    if(data.joinPartyTime=='0000-00-00'){
                        $('.per_dang').val('');
                    }else{
                        $('.per_dang').val(data.joinPartyTime);
                    }
                    /*入党时间*/
                    $('.per_hukou').val(data.staffType);
                    /*户口类别*/
                    $('.per_hukouAdd').val(data.staffDomicilePlace);
                    /*户口所在地*/
                    $('.per_gongzhong').val(data.workType);
                    /*工种*/
                    $('.per_xingzheng').val(data.administrationLevel);
                    /*行政级别 */
                    $('.per_yuangongType').val(data.staffOccupation);
                    /*员工类型*/
                    $('.per_zhiwu').val(data.jobPosition);
                    /*职务*/
                    $('.per_zhicheng').val(data.presentPosition);
                    /*职称*/
                    if(data.datesEmployed=='0000-00-00'){
                        $('.per_ruzhiTime').val('');
                    }else{
                        $('.per_ruzhiTime').val(data.datesEmployed);
                    }
                    /*入职时间*/
                    $('.per_zhichengjibie').val(data.workLevel);
                    /*职称级别*/
                    $('.per_yingpin').val(data.workJob);
                    /*应聘岗位*/
                    $('.per_kaoqin').val(data.workNo);
                    /*考勤排班类别   ====》无字段 未找到*/
                    $('.per_gongling').val(data.jobAge);
                    /*本单位工龄*/
                    $('.per_allage').val(data.workAge);
                    /*总工龄*/
                    if(data.beginSalsryTime=='0000-00-00'){
                        $('.per_xinziTime').val('');
                    }else{
                        $('.per_xinziTime').val(data.beginSalsryTime);
                    }
                    /*起薪时间 ===》找到*/
                    $('.per_zaizhizhuangtai').val(data.workStatus);
                    /*在职状态*/
                    if(data.jobBeginning=='0000-00-00'){
                        $('.per_joinWork').val('');
                    }else{
                        $('.per_joinWork').val(data.jobBeginning);
                    }
                    /*参加工作时间*/
                    $('.per_dianhua').val(data.staffPhone);
                    /*联系电话*/
                    $('.per_phone').val(data.staffMobile);
                    /*手机号码*/
                    $('.per_msn').val(data.staffMsn);
                    /*msn*/
                    $('.per_familyAdd').val(data.homeAddress);
                    /*家庭地址 */
                    $('.per_elseType').val(data.otherContact);
                    /*其他联系方式*/
                    $('.per_yanjiu').val(data.researchResults);/*研究领域 未找到*/
                    $('.per_socish').val(data.partTime);/*社会兼职*/
                    $('.per_success').val(data.researchResults);/*成果介绍*/
                    $('#directlySuperiorName').val(data.directlySuperiorName);
                    $('#directlySuperiorName').attr("dataid",data.directlySuperior);
                    /*直属上级*/
                    $('#directlyUnderName').val(data.directlyUnderName);
                    $('#directlyUnderName').attr("dataid",data.directlyUnder);
                    /*直属下级*/
                    $('.per_kaihuhang').val(data.bank1);/*开户行1*/
                    $('.per_kaihuhangtwo').val(data.bank2);/*开户行2*/
                    $('.zhanghuone').val(data.bankAccount1);/*开户行的账号1*/
                    $('.zhanghutwo').val(data.bankAccount2);/*开户行的账号2*/
                    $('.per_xueli').val(data.staffHighestSchool);/*学历*/
                    $('.per_xuewei').val(data.staffHighestDegree);/*学位*/
                    if(data.graduationDate=='0000-00-00'){
                        $('.per_overtime').val('');
                    }else{
                        $('.per_overtime').val(data.graduationDate);
                    }/*毕业时间*/
                    $('.per_shuiping').val(data.computerLevel);/*计算机水平*/
                    $('.per_yuzhongone').val(data.foreignLanguage1);/*外语语种1*/
                    $('.per_yuzhongtwo').val(data.foreignLanguage2);/*外语语种2*/
                    $('.per_yuzhongthree').val(data.foreignLanguage3);/*外语语种3*/
                    $('.per_waiyuthree').val(data.foreignLevel1);/*外语水平1*/
                    $('.per_waiyutwo').val(data.foreignLevel2);/*外语水平2*/
                    $('.per_waiyuone').val(data.foreignLevel3);/*外语水平3*/
                    $('.per_techang').val(data.staffSkills);/*特长*/
                    $('.zhiwu').val(data.certificate);/*职务情况 */
                    $('.danbao').val(data.surety);/*担保记录*/
                    $('.shebao').val(data.insure);/*社保*/
                    $('.tijian').val(data.bodyExamim);/*体检*/
                    $('.beizhu').val(data.remark);/*备注*/
                    $(".text_xiaji").val(data.directlyUnder);//直属下级
                    $(".per_qq").val(data.staffQq);//qq
                    $(".per_num").val(data.staffNo);//编号
                    $(".per_overname").val(data.beforeName);//曾用名
                    $(".dept_id").val(data.deptId);//部门编号

                    var birth=$("#STAFF_BIRTH").val();
                    if (birth != '' && birth != '0000-00-00') {
                         var birth=$("#STAFF_BIRTH").val();
                         $("#animal_id").val(Calculator.shengxiao(birth));
                         birth=birth.replace(/-/g,"");
                         var month=birth.substring(4,6);
                         var day=birth.substring(6,8);
                         $("#sign_id").val(Calculator.xingzuo(month,day));
                    }
                    //是否农历
                    if(data.isLunar==1){
                        $("#IS_LUNAR").prop("checked",true);
                    }else{
                        $("#IS_LUNAR").prop("checked",false);
                    }

                    /*是否成为专家*/
                    if(data.isExperts==1){
                        $('.isExperts').eq(0).prop("checked",true);
                    }else{
                        $('.isExperts').eq(1).prop("checked",true);
                    }
                    //头像
                    $("#showImage").html(data.photoName);
                    if(data.photoName!=''){
                        $(".hr_photo").html('<image  style="width:140px;height:135px;" src="<%=basePath%>img/hr/'+data.photoName+'" >');//头像
                    }
                    ue.setContent(data.resume);/*简历*/
                }
            })
        })
    })
    /*编辑之后保存接口*/

    $('#add_send').on('click', function () {
        var array=$(".test_null");
        for(var i=0; i< array.length; i++){
            if(array[i].value==""){
                $.layerMsg({content:"<fmt:message code="sup.th.With*" />",icon: 2}, function(){
                });
                return;
            }
        }
       var userPriv=$('.userPrivName ').attr("userpriv");
        if (userPriv!="" && userPriv.indexOf(',') >= 0){
            userPriv= userPriv.substr(0, userPriv.length-1);
        }
        var isLunar=0;
        if($("#IS_LUNAR").prop("checked")){
            isLunar=1;
        }
        //附件上传
       /* var attachmentId,attachmentName;
        for(var i=0;i<$('.Attachment .inHidden').length;i++){
            attachmentId += $('.Attachment .inHidden').eq(i).val();
        }
        for(var i=0;i<$('.Attachment .inHidden').length;i++){
            attachmentName += $('.Attachment a').eq(i).attr('NAME');
        }*/

        var data_all={
            uid:$(".uid").val(),
            staffId:$(".staffId").val(),
            staffName: $('.per_name').val(), /*姓名*/
            deptName:$('.dept_name').val(), /*部门   却少字段*/
            deptId:$(".dept_id").val(),
            staffHealth:$('.per_health').val(), /*健康*/
            staffMajor:$('.per_zhuanye').val(),/*专业*/
            graduationSchool:$('.per_school').val(), /*大学*/
            homeAddress:$('.per_familyAdd').val(), /*家庭住址*/
            staffEmail:$('.per_email').val(),/*邮件*/
            userPriv: userPriv,/*角色*/
            userName:$('.per_name').val(),/*本人的中文姓名*/
            staffEName:$('.per_engname').val(),/*本人的英文姓名*/
            userId:$('.user_id').val(),/*用户名*/
            workNo:$('.per_worknum').val(), /*工号*/
            staffSex:$('.per_sex').val(),/*性别*/
            staffCardNo:$('.per_ident').val(),/*身份证号*/
            staffBirth:$('.per_date').val(), /*出生日期*/
            staffAge:$('.per_age').val(),/*年龄*/
            leaveType:$('.per_yearjia').val(), /*年休假 */
            staffNativePlace:$('.per_address').val(),/*籍贯*/
            staffNativePlace2:$('.per_detialAdd').val(),/*具体籍贯*/
            bloodType: $('.per_xiexing').val(), /*血型*/
            staffMaritalStatus:$('.per_hunyin').val(),/*婚姻状况*/
            staffPoliticalStatus:$('.per_zhengzhi').val(),/*政治面貌*/
            joinPartyTime:$('.per_dang').val(),/*入党时间*/
            staffType:$('.per_hukou').val(),/*户口类别*/
            staffDomicilePlace:$('.per_hukouAdd').val(), /*户口所在地*/
            workType:$('.per_gongzhong').val(),/*工种*/
            administrationLevel:$('.per_xingzheng').val(),/*行政级别 */
            staffOccupation:$('.per_yuangongType').val(),/*员工类型*/
            jobPosition: $('.per_zhiwu').val(), /*职务*/
            presentPosition:$('.per_zhicheng').val(), /*职称*/
            datesEmployed: $('.per_ruzhiTime').val(), /*入职时间*/
            workLevel:$('.per_zhichengjibie').val(),/*职称级别*/
            workJob:$('.per_yingpin').val(),/*应聘岗位*/ /*userPrivName:$('.per_kaoqin').val(),*//*考勤排班类别   ====》无字段 未找到*/
            jobAge:$('.per_gongling').val(),/*本单位工龄*/
            workAge:$('.per_allage').val(), /*总工龄*/
            beginSalsryTime:$('.per_xinziTime').val(), /*起薪时间 ===》 找到*/
            workStatus: $('.per_zaizhizhuangtai').val(),/*在职状态*/
            jobBeginning:$('.per_joinWork').val(), /*参加工作时间*/
            staffPhone:$('.per_dianhua').val(),/*联系电话*/
            staffMobile:$('.per_phone').val(), /*手机号码*/
            staffMsn:$('.per_msn').val(), /*msn*/
            // homeAddress:$('.per_familyAdd').val(),/*家庭地址 */
            otherContact:$('.per_elseType').val(), /*其他联系方式*/
            isExperts:$('.isExperts:checked').val(), /*是否成为专家          单选*/
            // researchResults:$('.per_yanjiu').val(),/*研究领域 未找到*/
            partTime:$('.per_socish').val(), /*社会兼职*/
            researchResults:$('.per_success').val(), /*成果介绍*/
            directlySuperior:$('#directlySuperiorName').attr('dataid'), /*直属上级*/
            directlyUnder:$('#directlyUnderName').attr('dataid'), /*直属下级*/
            bank1:$('.per_kaihuhang').val(), /*开户行1*/
            bank2:$('.per_kaihuhangtwo').val(), /*开户行2*/
            bankAccount1:$('.zhanghuone').val(), /*开户行的账号1*/
            bankAccount2:$('.zhanghutwo').val(), /*开户行的账号2*/
            staffHighestSchool:$('.per_xueli').val(), /*学历*/
            staffHighestDegree:$('.per_xuewei').val(), /*学位*/
            graduationDate:$('.per_overtime').val(), /*毕业时间*/
            computerLevel:$('.per_shuiping').val(), /*计算机水平*/
            foreignLanguage1:$('.per_yuzhongone').val(), /*外语语种1*/
            foreignLanguage2:$('.per_yuzhongtwo').val(), /*外语语种2*/
            foreignLanguage3:$('.per_yuzhongthree').val(), /*外语语种3*/
            foreignLevel1:$('.per_waiyuone').val(), /*外语水平1*/
            foreignLevel2:$('.per_waiyutwo').val(), /*外语水平2*/
            foreignLevel3:$('.per_waiyuthree').val(), /*外语水平3*/
            staffSkills:$('.per_techang').val(), /*特长*/
            certificate:$('.zhiwu').val(), /*职务情况 */
            surety:$('.danbao').val(), /*担保记录*/
            insure:$('.shebao').val(), /*社保*/
            bodyExamim:$('.tijian').val(), /*体检*/
            remark:$('.beizhu').val(), /*备注*/
            staffNationality:$('.per_minzu').val(), /*民族*/
            beforeName:$('.per_overname').val(), /*曾用名*/
            staffNo:$(".per_num").val(), /*编号*/
            isLunar:isLunar,
            staffQq:$('.per_qq').val(),
         /*   attachmentId:attachmentId,
            attachmentName:attachmentName,*/
            resume: ue.getContentTxt()/*简历*/
        }
        if($(this).attr('ac') == 'edit'){
                $.ajax({
                    type:'post',
                    url:'<%=basePath%>hr/api/editPersonFile',
                    dataType:'json',
                    data:data_all,
                    success:function(res){
                        if(res.flag==true){
                            submitPhoto();
                            layer.msg('<fmt:message code="diary.th.modify" />', {icon: 6});
                            window.location.reload();
                        }else{
                            layer.msg(res.msg, {icon: 2});
                        }
                    }
                })
        }else if($(this).attr('ac')=='add'){
                $.ajax({
                    type:'post',
                    url:'<%=basePath%>hr/api/savePersonFile',
                    dataType:'json',
                    data:data_all, success:function(res){
                        if(res.flag==true){
                            submitPhoto();
                            layer.msg('<fmt:message code="diary.th.modify" />', {icon: 6});
                            window.location.reload();
                        }else{
                            layer.msg(res.msg, {icon: 2});
                        }
                    }
                })
        }

    })

    //头像
   function submitPhoto()
   {
       var imageFile=$("#imageFile").val();
       var userId=$('.user_id').val();
       if(imageFile!=''){
           $("#photoForm").ajaxSubmit({
               url: '/hr/api/uploadImage?userId='+userId,
               type: "post",
               enctype: 'multipart/form-data',
               // iframe: true,
               dataType:'json',
               success: function (data)
               {
               },
           })
       }
   }

    //删除附件
    /*$('.Attachment').on('click','.deImg',function(){
        var data=$(this).parents('.dech').attr('deUrl');
        var dome=$(this).parents('.dech');
        deleteChatment(data,dome);
    })*/

   /*$(function(){
       //添加附件
       $('#uploadimg').on('click', function(ele) {
           $('#uploadinputimg').click();
       })
       $('#uploadinputimg').change(function(e){
           var target = $(e.target);
           var file;
           if(target[0].files && target[0].files[0]){
               file=target[0].files[0];
           }
           if(file){
               $.upload($('#uploadimgform'),function(res){
                   var data=res.obj;
                   var str='';
                   var str1='';
                   alert(data)
                   console,log(data);
                   for(var i=0;i<data.length;i++){
                       <%--str+='<a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*" style="display:block;"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>'+data[i].attachName+'</a>';--%>
                       <%--str1+='<input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',">';--%>
                       str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>'+data[i].attachName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';
                   }
                   $('.Attachment').append(str);
               });
           }
       });
   })
*/

    /*时间控件调用*/
    var start = {
       elem: '#STAFF_BIRTH',
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期
         max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        /* choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }*/
        choose:get_animal_sign
        //回调函数
    };
    laydate(start);
            /*部门选择调用的方法*/
    $(function () {
        $('#department').deptSelect();
        $('#selectUser').privSelect();
//        $.loadSidebar($('#downChild'),0, function (el) {
////            $.loadSidebar(el, 30)
//        })
        loadSidebar1($('#downChild'),0)

        function loadSidebar1(target,deptId) {
            $.ajax({
                url: '/department/getChDeptfq',
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {
                    var str = '';
                    data.obj.forEach(function (v, i) {
                        if (v.deptName) {
                            str += '<li><span data-types="1"  data-numtrue="1" ' +
                                'onclick= "imgDown(' +v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 30px" deptid="' + v.deptId + '" class="firsttr childdept"><span class=""></span><img src="/img/sys/dapt_right.png" alt="" style="margin-left: 12px;width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                        }
                    })
                    widthnum++;
                    target.append(str);
                }
            })
        }
        $.ajax({
            url:'/sys/showUnitManage',
            type:'get',
            dataType:"JSON",
            data : '',
            success:function(obj){
                var data = obj.object.unitName;
                $('#downChild .pickCompany .dynatree-title').text(data).attr('title',data);

            },
            error:function(e){
            }
        })
    })





        //计算生肖和星座
    var Calculator = function () {
        /* *
        *  计算生肖
        *      支持简写生日，比如01，转换为2001，89转换为1989；
        *      支持任何可以进行时间转换的格式，比如'1989/01/01','1989 01'等
        * */
        function getShengXiao(birth) {
            birth += '';
            var len = birth.length;
            if (len < 4 && len != 2) {
                return false;
            }
            if (len == 2) {
                birth - 0 > 30 ? birth = '19' + birth : birth = '20' + birth;
            }
            var year = (new Date(birth)).getFullYear();
            var arr = ['猴', '鸡', '狗', '猪', '鼠', '牛', '虎', '兔', '龙', '蛇', '马', '羊'];
            return /^\d{4}$/.test(year) ? arr[year % 12] : false;
        }
            /* *
        *  计算星座
        *      支持传递[月日]，[月,日]，[年月日]等格式，详见例子
        * */
        function getxingzuo(month, day) {
            var d = new Date(1999, month - 1, day, 0, 0, 0);
            var arr = [];
            arr.push(["魔羯座", new Date(1999, 0, 1, 0, 0, 0)])
            arr.push(["水瓶座", new Date(1999, 0, 20, 0, 0, 0)])
            arr.push(["双鱼座", new Date(1999, 1, 19, 0, 0, 0)])
            arr.push(["牡羊座", new Date(1999, 2, 21, 0, 0, 0)])
            arr.push(["金牛座", new Date(1999, 3, 21, 0, 0, 0)])
            arr.push(["双子座", new Date(1999, 4, 21, 0, 0, 0)])
            arr.push(["巨蟹座", new Date(1999, 5, 22, 0, 0, 0)])
            arr.push(["狮子座", new Date(1999, 6, 23, 0, 0, 0)])
            arr.push(["处女座", new Date(1999, 7, 23, 0, 0, 0)])
            arr.push(["天秤座", new Date(1999, 8, 23, 0, 0, 0)])
            arr.push(["天蝎座", new Date(1999, 9, 23, 0, 0, 0)])
            arr.push(["射手座", new Date(1999, 10, 22, 0, 0, 0)])
            arr.push(["魔羯座", new Date(1999, 11, 22, 0, 0, 0)])
            for (var i = arr.length - 1; i >= 0; i--) {
                  if (d >= arr[i][1]) return arr[i][0];
            }
        }
        return{
            shengxiao: getShengXiao,
            xingzuo: getxingzuo
        }
    }()

    function get_animal_sign(){
        var birth=$("#STAFF_BIRTH").val();
        if (birth != '' && birth != '0000-00-00') {
            $("#animal_id").val(Calculator.shengxiao(birth));
            birth = birth.replace(/-/g, "");
            var month = birth.substring(4, 6);
            var day = birth.substring(6, 8);
            $("#sign_id").val(Calculator.xingzuo(month, day));
        }
    }
</script>
</body>
</html>

