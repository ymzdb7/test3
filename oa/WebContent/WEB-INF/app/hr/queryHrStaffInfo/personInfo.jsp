
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事档案详细信息</title>
    <link rel="stylesheet" href="/css/hr/personnelInformation.css">
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
</head>
<body>

</body>
<script>
    var urlsObj = null;

    $(function () {
        urlsObj=$.GetRequest().id;


        $.post('/hr/api/getPersonByUserId',{uid:urlsObj},function(json){
            if(json.flag){
                var arr=json.object;
                var str=' <table border="0" width="100%" cellspacing="0" cellpadding="3" class="small" style="margin-top: 24px;">\
                            <tbody>\
                                <tr>\
                                    <td class="Big">\
                                        <img src="/static/images/menu/hr_manage.gif" width="17" height="17">\
                                    <span class="big3" style = "font-family: 微软雅黑;font-size: 22px;color: #000;FONT-WEIGHT: normal;"> 人员档案（'+arr.staffName+'）'+function () {
                        if(arr.workStatus== 02){
                            return '[离职]'
                        }else if(arr.workStatus == 01){
                            return ''
                        }else{
                            return '[未建档]'
                        }}()+'</span>\
                                    <br>\
                                    </td>\
                                </tr>\
                             </tbody>\
                     </table>\
                      <table class="TableBlock" width="80%" align="center" style="margin-top: 16px;">\
                <tbody>\
                <tr>\
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;基本信息</b></td>\
            </tr>\
            <tr>\
            <td nowrap="" align="left" class="TableContent">OA用户名：</td>\
            <td class="TableData" colspan="4">'+arr.userId+'</td>\
                <td class="TableData" align="center" rowspan="6" colspan="2">\
                <div class="avatar"><a href="javascript:void(0)">' +
                    '<img src="../../img/hr/'+arr.photoName+'" width="130">' +
                    '</a></div>\
                        </td>\
                        </tr>\
                        <tr>\
                        <td nowrap="" align="left" class="TableContent">部门：</td>\
                    <td nowrap="" align="left" class="TableData">'+arr.deptName+'</td>\
                <td nowrap="" align="left" class="TableContent">角色：</td>\
            <td class="TableData" colspan="2">'+arr.userPrivName+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">编号：</td>\
            <td nowrap="" align="left" class="TableData" width="180">'+function () {
                        if(arr.staffNo== null){
                            return ''
                        }else {
                            return arr.staffNo
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">工号：</td>\
            <td class="TableData" colspan="2">'+function () {
                        if(arr.workNo== null){
                            return ''
                        }else {
                            return arr.workNo
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">姓名：</td>\
            <td class="TableData" width="180">'+arr.staffName+'</td>\
                <td nowrap="" align="left" class="TableContent">曾用名：</td>\
            <td class="TableData" colspan="2">'+arr.beforeName+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">英文名：</td>\
            <td class="TableData">'+arr.staffEName+'</td>\
                <td nowrap="" align="left" class="TableContent">性别：</td>\
            <td class="TableData" colspan="2">'+function () {
                        if(arr.staffSex==1){
                            return '女'
                        }else {
                            return '男'
                        }
                    }()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">身份证号：</td>\
            <td class="TableData">'+function () {
                        if(arr.staffCardNo== null){
                            return ''
                        }else {
                            return arr.staffCardNo
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">出生日期：</td>\
            <td class="TableData" colspan="2">'+function () {
                        if(arr.staffBirth==undefined || arr.staffBirth=='0000-00-00'){
                            return ''
                        }
                        return arr.staffBirth;
                    }()+' </td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">生肖</td>\
                <td class="TableData">狗</td>\
                <td nowrap="" align="left" class="TableContent">星座</td>\
                <td class="TableData">天蝎座</td>\
                <td nowrap="" align="left" class="TableContent">血型</td>\
                <td class="TableData">AB </td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">年龄：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffAge== null){
                            return ''
                        }else {
                            return arr.staffAge
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">年休假:</td>\
            <td class="TableData" colspan="3">'+function () {
                        if(arr.leaveType==undefined){
                            return ''
                        }else {
                            return arr.leaveType
                        }
                    }()+ '</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">籍贯：</td>\
            <td class="TableData">'+arr.staffNativePlace2+'</td>\
                <td nowrap="" align="left" class="TableContent">民族：</td>\
            <td class="TableData" colspan="3">'+arr.staffNationality+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">婚姻状况：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffMaritalStatus==1){
                            return '已婚'
                        } else if(arr.staffMaritalStatus==0){
                            return '未婚'
                        }else if(arr.staffMaritalStatus==2){
                            return '离异'
                        }else if(arr.staffMaritalStatus==0){
                            return '丧偶'
                        }else if(arr.staffMaritalStatus == null){
                            return ''
                        }
                    }()+' </td>\
                <td nowrap="" align="left" class="TableContent">健康状况：</td>\
            <td class="TableData" colspan="3">'+function () {
                        if(arr.staffHealth== null){
                            return ''
                        }else {
                            return arr.staffHealth
                        }}()+'</td>\
                </tr><tr>\
                <td nowrap="" align="left" class="TableContent">政治面貌：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffPoliticalStatus==0 || arr.staffPoliticalStatus == null){
                            return ''
                        }else if(arr.staffPoliticalStatus==1){
                            return '群众'
                        }else if(arr.staffPoliticalStatus==2){
                            return '共青团员'
                        }else if(arr.staffPoliticalStatus==3){
                            return '中共党员'
                        }else if(arr.staffPoliticalStatus==4){
                            return '中共预备党员'
                        }else if(arr.staffPoliticalStatus==5){
                            return '民族党派'
                        }else if(arr.staffPoliticalStatus==4){
                            return '无党派人士'
                        }
                    }()+'</td>\
                <td nowrap="" align="left" class="TableContent">入党时间：</td>\
            <td class="TableData" colspan="3">'+function(){
                        if(arr.joinPartyTime==undefined){
                            return ''
                        }else {
                            return arr.joinPartyTime
                        }
                    }()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">户口类别：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffType==0 || arr.staffType == null){
                            return ''
                        }else if(arr.staffType==1){
                            return '本市城镇职工'
                        }else if(arr.staffType==2){
                            return '外户城镇职工'
                        }else if(arr.staffType==3){
                            return '本市农民工'
                        }else if(arr.staffType==4){
                            return '外市农民工'
                        }else if(arr.staffType==5){
                            return '本市农村劳动力'
                        }else if(arr.staffType==6){
                            return '外市农村劳动力'
                        }

                    }()+'</td>\
                <td nowrap="" align="left" class="TableContent">户口所在地:</td>\
            <td class="TableData" colspan="3">'+arr.staffDomicilePlace+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;职位情况及联系方式：</b></td>\
            </tr>\
            <tr>\
            <td nowrap="" align="left" class="TableContent">工种：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.workType== null){
                            return ''
                        }else {
                            return arr.workType
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">行政级别：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.administrationLevel== null){
                            return ''
                        }else {
                            return arr.administrationLevel
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">员工类型:</td>\
            <td class="TableData">'+function () {
                        if(arr.staffOccupation== null){
                            return ''
                        }else {
                            return arr.staffOccupation
                        }}()+' </td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">职称级别：</td>\
            <td class="TableData" width="180">'+function(){
                        if(arr.workLevel==undefined){
                            return ''
                        }else {
                            return arr.workLevel
                        }
                    }()+'</td>\
                <td nowrap="" align="left" class="TableContent">岗位：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.workJob== null){
                            return ''
                        }else {
                            return arr.workJob
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">考勤排班类型：</td>\
            <td class="TableData" width="180">正常班</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">职务：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.jobPosition== null){
                            return ''
                        }else {
                            return arr.jobPosition
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">职称：</td>\
            <td class="TableData" width="180">'+function(){
                        if(arr.presentPosition==undefined){
                            return ''
                        }else if(arr.presentPosition==''){
                            return ''
                        }else if(arr.presentPosition=='01'){
                            return '工程师'
                        }else if(arr.presentPosition=='02'){
                            return '助理工程师'
                        }else if(arr.presentPosition=='03'){
                            return '高级工程师'
                        }else if(arr.presentPosition=='04'){
                            return '研高工'
                        }else if(arr.presentPosition=='07'){
                            return '职称'
                        }else if(arr.presentPosition=='08'){
                            return '高级职称'
                        }
                    }()+'</td>\
                <td nowrap="" align="left" class="TableContent">入职时间：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.datesEmployed==undefined || arr.datesEmployed=='0000-00-00'){
                            return ''
                        }
                            /*return formatDate(new Date(arr.datesEmployed))*/
                        return arr.datesEmployed
                    }()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">本单位工龄:</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.jobAge== null){
                            return ''
                        }else {
                            return arr.jobAge
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">起薪时间:</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.beginSalsryTime==undefined || arr.beginSalsryTime=='0000-00-00'){
                            return ''
                        }
                        return arr.beginSalsryTime
                    }()+'</td>\
                <td nowrap="" align="left" class="TableContent">在职状态:</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.workStatus== null){
                            return ''
                        }else {
                            return arr.workStatus
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">总工龄：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.workAge== null){
                            return ''
                        }else {
                            return arr.workAge
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">参加工作时间：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.jobBeginning==undefined  || arr.jobBeginning=='0000-00-00'){
                            return ''
                        }
                        return arr.jobBeginning
                    }()+'</td>\
                <td nowrap="" align="left" class="TableContent">联系电话：</td>\
            <td class="TableData" width="180">'+arr.staffPhone+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">手机号码：</td>\
            <td class="TableData">'+arr.staffMobile+'</td>\
                <!--<td nowrap align="left" class="TableContent">小灵通：</td>\
            <td class="TableData"  width="180"></td>-->\
                <td nowrap="" align="left" class="TableContent">MSN：</td>\
            <td class="TableData" colspan="3">'+arr.staffMsn+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">电子邮件：</td>\
            <td class="TableData" width="180">'+arr.staffEmail +'</td>\
                <td nowrap="" align="left" class="TableContent">家庭地址：</td>\
            <td class="TableData" colspan="3">'+arr.homeAddress+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">QQ：</td>\
            <td class="TableData" width="180">'+arr.staffQq+'</td>\
                <td nowrap="" align="left" class="TableContent">其他联系方式：</td>\
            <td class="TableData" colspan="3">'+function () {
                        if(arr.otherContact== null){
                            return ''
                        }else {
                            return arr.otherContact
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">开户行1：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.bank1== null){
                            return ''
                        }else {
                            return arr.bank1
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">账户1：</td>\
            <td class="TableData" colspan="3">'+function () {
                        if(arr.bankAccount1== null){
                            return ''
                        }else {
                            return arr.bankAccount1
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">开户行2：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.bank2== null){
                            return ''
                        }else {
                            return arr.bank2
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">账户2：</td>\
            <td class="TableData" colspan="3">'+function () {
                        if(arr.bankAccount2== null){
                            return ''
                        }else {
                            return arr.bankAccount2
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;教育背景：</b></td>\
            </tr>\
            <tr>\
            <td nowrap="" align="left" class="TableContent">学历：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffHighestSchool==''|| arr.staffHighestSchool == null){
                            return ''
                        }else if(arr.staffHighestSchool=='1'){
                            return '小学'
                        }else if(arr.staffHighestSchool=='2'){
                            return '初中'
                        }else if(arr.staffHighestSchool=='3'){
                            return '高中'
                        }else if(arr.staffHighestSchool=='4'){
                            return '中专'
                        }else if(arr.staffHighestSchool=='5'){
                            return '大专'
                        }else if(arr.staffHighestSchool=='6'){
                            return '本科'
                        } else if(arr.staffHighestSchool=='7'){
                            return '研究生'
                        }else if(arr.staffHighestSchool=='8'){
                            return '博士'
                        }else if(arr.staffHighestSchool=='9'){
                            return '博士后'
                        }else if(arr.staffHighestSchool=='11'){
                            return '技校'
                        }
                    }()+ '</td>\
                <td nowrap="" align="left" class="TableContent">学位：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffHighestDegree==''|| arr.staffHighestDegree == null){
                            return ''
                        }else if(arr.staffHighestDegree=='1'){
                            return '博士后'
                        }else if(arr.staffHighestDegree=='2'){
                            return '博士'
                        }else if(arr.staffHighestDegree=='3'){
                            return 'MBA'
                        }else if(arr.staffHighestDegree=='4'){
                            return '硕士'
                        }else if(arr.staffHighestDegree=='5'){
                            return '双学士'
                        }else if(arr.staffHighestDegree=='6'){
                            return '学士'
                        } else if(arr.staffHighestDegree=='7'){
                            return '无'
                        }
                    }()+ '</td>\
                <td nowrap="" align="left" class="TableContent">毕业时间：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.graduationDate==undefined  || arr.graduationDate=='0000-00-00'){
                            return ''
                        }
                        return arr.graduationDate
                    }()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">毕业学校：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.graduationSchool== null){
                            return ''
                        }else {
                            return arr.graduationSchool
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">专业：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.staffMajor== null){
                            return ''
                        }else {
                            return arr.staffMajor
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">计算机水平：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.computerLevel== null){
                            return ''
                        }else {
                            return arr.computerLevel
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">外语语种1：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.foreignLanguage1== null){
                            return ''
                        }else {
                            return arr.foreignLanguage1
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">外语语种2：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.foreignLanguage2== null){
                            return ''
                        }else {
                            return arr.foreignLanguage2
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">外语语种3：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.foreignLanguage3== null){
                            return ''
                        }else {
                            return arr.foreignLanguage3
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">外语水平1：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.foreignLevel1== null){
                            return ''
                        }else {
                            return arr.foreignLevel1
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">外语水平2：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.foreignLevel2== null){
                            return ''
                        }else {
                            return arr.foreignLevel2
                        }}()+'</td>\
                <td nowrap="" align="left" class="TableContent">外语水平3：</td>\
            <td class="TableData" width="180">'+function () {
                        if(arr.foreignLevel3== null){
                            return ''
                        }else {
                            return arr.foreignLevel3
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableContent">特长：</td>\
            <td class="TableData" colspan="5">'+function () {
                        if(arr.staffSkills== null){
                            return ''
                        }else {
                            return arr.staffSkills
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" colspan="3" class="TableHeader">职务情况：</td>\
            <td nowrap="" align="left" colspan="3" class="TableHeader">担保记录：</td>\
            </tr>\
            <tr>\
            <td class="TableData" colspan="3" style="vertical-align:top;">'+function () {
                        if(arr.certificate== null){
                            return ''
                        }else {
                            return arr.certificate
                        }}()+'</td>\
                <td class="TableData" colspan="3" style="vertical-align:top;">'+function () {
                    if(arr.surety== null){
                        return ''
                    }else {
                        return arr.surety
                    }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;社保缴纳情况：</b></td>\
            <td nowrap="" class="TableHeader" colspan="3"><b>&nbsp;体检记录：</b></td>\
            </tr>\
            <tr>\
            <td class="TableData" colspan="3" style="vertical-align:top;">'+function () {
                        if(arr.insure== null){
                            return ''
                        }else {
                            return arr.insure
                        }}()+'</td>\
                <td class="TableData" colspan="3" style="vertical-align:top;">'+function () {
                        if(arr.bodyExamim== null){
                            return ''
                        }else {
                            return arr.bodyExamim
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td colspan="6">\
                <table width="100%" class="TableBlock">\
                <tbody><tr>\
                <td class="TableHeader" colspan="2">自定义字段：'+arr.userdef1+'</td>\
            </tr>\
            </tbody></table>\
            </td>\
            </tr>\
            <tr>\
            <td nowrap="" align="left" colspan="6" class="TableHeader">备注：</td>\
            </tr>\
            <tr>\
            <td nowrap="" class="TableData" colspan="6">'+function () {
                        if(arr.remark== null){
                            return ''
                        }else {
                            return arr.remark
                        }}()+'</td>\
                </tr>\
                <tr>\
                <td nowrap="" class="TableHeader" colspan="6">附件文档：</td>\
            </tr>\
            <tr>\
            <td nowrap="" align="left" class="TableData" colspan="6">\
                无附件    </td>\
                </tr>\
                <tr>\
                <td nowrap="" align="left" class="TableHeader" colspan="6">简历:</td>\
            </tr>\
            <tr>\
            <td nowrap="" class="TableData" colspan="6" style="vertical-align:top;">'+function () {
                        if(arr.resume== null){
                            return ''
                        }else {
                            return arr.resume
                        }}()+'</td>\
                </tr>\
                </tbody>\
                </table>'

                $('body').html(str)

            }
        },'json')

    })


</script>
</html>
