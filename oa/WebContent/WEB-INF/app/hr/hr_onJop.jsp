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
    <title><fmt:message code="hr.th.onTheJob" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/sys/userInfor.css"/>
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
            height:100%;
        }
        .btn_{
            width:300px;display: block;
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
        .left {
            width: 21.5%;
            border-right: 1px solid #ccc;
            overflow-y: auto;
        }
        .rig {
            width: 78%;
        }
        .colorDis{
            background-color: #e7e7e7;
        }
        table input{
            width: auto;
        }
        .allCondition{
            width: 1200px;
            margin-left: 20px;
        }
            /*.biaoge{  border:1px solid red;  border-collapse:collapse;}*/
        /*.biaoge tbody tr td{ border:1px solid red; }*/
        .text_width{width:126px;}

    </style>
    <script>
        function newtime(val) {
//            console.log($(val).val())
            var date = new Date($(val).val());
            // 有三种方式获取
            var time1 = date.getTime();

            var datanew=new Date();


        }

    </script>
</head>
<body>

    <div class="cont">
        <div class="left">
            <div class="collect">
                <div id="incum" class="divUP">
                    <div id="downChild" style="display:block;">
                        <div class="pickCompany"><span style="height:35px;line-height:35px;" class="childdept"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left: 13px;margin-bottom: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="" style="color: #000;"></a></span></div>
                    </div>
                </div>
            </div>
        </div>
      <%--  <div class="rig">
            <iframe src="hrContRight" frameborder="0" width="100%" height="100%"></iframe>
        </div>--%>
        <div class="rig">
            <div class="tishi" style="height: 100%;text-align: center;border: none;">
                <div style="width:100%;padding-top:20%;"><img style="margin-top: 2%;text-align: center;" src="/img/noData.png" alt=""></div>
                <h2 style="margin: auto;text-align: center;font-size: 20px;font-weight: normal;"><fmt:message code="user.th.selectDepartment" /></h2>
            </div>
            <div class="table_personDetail" id="table_personDetail" style="display: none;">
                <table class="TableBlock biaoge" width="100%" align="center">
                    <tbody>
                    <tr>
                        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="url.th.EssentialInformation" /></b></td>
                    </tr>
                    <tr >
                        <td nowrap="" class="TableData text_width test_text"      >OA<fmt:message code="global.lang.user" />：</td>
                        <td class="TableData" width="180" colspan="1"  >
                            <input type="hidden" name="UID" value="" id="UID" class="uid">
                            <input type="hidden" name="USER_ID"  value="" id="USER_ID" class="user_id">
                            <input type="text" name="byName"  value="" id="byName" class="byName test_null colorDis"  readonly>
                            <input type="hidden" name="staffId" class="staffId"/>
                            <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                        </td>
                        <td  class=" text_width" rowspan="5"></td>
                        <td class="TableData" align="left" rowspan="5" colspan="3">
                            <p class="hr_photo"><fmt:message code="hr.th.NoPhotos" /></p>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width test_text" ><fmt:message code="hr.th.department" />：</td>
                        <td class="TableData"  width="180">
                            <input type="hidden" name="DEPT_ID" id="DEPT_ID" class="dept_id">
                            <input type="text" name="DEPT_NAME" style="background-color: #e7e7e7;" value="" id="DEPT_NAME"  class="BigStatic company dept_name test_null" size=12 maxlength=100 readonly="">
                            <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.number" />：</td>
                        <td class="TableData" width="180"><input type="text" name="STAFF_NO" value="" class="BigInput per_num"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width test_text"><fmt:message code="userDetails.th.name" />：</td>
                        <td class="TableData">
                            <input type="text" name="STAFF_NAME"  value="" class="BigStatic per_name test_null" ><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.EnglishName" />：</td>
                        <td class="TableData"><input type="text" name="STAFF_E_NAME" value="" class="BigInput per_engname"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.JobNumber" />：</td>
                        <td class="TableData"><input type="text" name="WORK_NO" value="" class="BigInput per_worknum"></td>

                        <%--<td class="TableData">
                            <input type="hidden" name="DEPT_ID" value="">
                            <input type="text" style="background: #eee;" name="DEPT_NAME" value="" class="BigStatic company" size="20" maxlength="100" readonly="">
                        </td>--%>
                        <td nowrap="" class="TableData text_width test_text">  <fmt:message code="userManagement.th.role" />：</td>
                        <td class="TableData dept" colspan="3" width="80%">
                            <input type="hidden" name="USER_PRIV" value="" class="userPriv">
                            <input type="text" name="USER_PRIV_NAME"  style="background-color: #e7e7e7;" value="" id="USER_PRIV_NAME" class="BigStatic company userPrivName test_null" size=12 maxlength=100 readonly="">
                            <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                            <a href="javascript:;" class="orgAdd userPriv_add" id="userPriv_add"> <fmt:message code="global.lang.add" /></a>
                        </td>
                    </tr>


                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.NameUsedBefore" />：</td>
                        <td class="TableData" ><input type="text" name="BEFORE_NAME" value="" class="BigInput per_overname"></td>
                        <td nowrap="" class="TableData text_width"><fmt:message code="userDetails.th.Gender" />：</td>
                        <td class="TableData" colspan="3" title="<fmt:message code="hr.th.ID" />">
                            <select style="width:218px;" name="STAFF_SEX" class="BigSelect per_sex">
                                <option value="0" selected=""><fmt:message code="userInfor.th.male" /></option>
                                <option value="1"><fmt:message code="userInfor.th.female" /></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.IDNumber" />：</td>
                        <td class="TableData">
                            <input type="text" name="STAFF_CARD_NO" id="STAFF_CARD_NO" class="BigInput per_ident" value="" onblur="check()">
                        </td>
                        <td nowrap="" class="TableData text_width test_text"><fmt:message code="hr.th.DateOfBirth" />：</td>
                        <td class="TableData" colspan="3" title="<fmt:message code="hr.th.ID"/>">
                            <input type="text" name="STAFF_BIRTH" id="STAFF_BIRTH" size="10" maxlength="10" class="BigInput per_date test_null" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:get_animal_sign})" onchange="get_animal_sign()"><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                            <input type="checkbox" name="IS_LUNAR" id="IS_LUNAR"  style="width:15px;   margin-left: 13px;margin-top: 4px;float:none;" class="per_noneli">
                            <label for="IS_LUNAR" style="color:#999;" class="nongli"><fmt:message code="url.th.Lunar" /></label>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.Age" />：</td>
                        <td class="TableData" title="<fmt:message code="hr.th.ID" />"><input type="text" name="STAFF_AGE" size="4" class="BigInput per_age" value=""><span style="margin-left: 4px;font-size:12px;line-height: 28px;color:#999;"><fmt:message code="hr.th.year" /></span></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.annualLeave" />：</td>
                        <td class="TableData" colspan="3">
                            <input type="text" name="LEAVE_TYPE" size="4" maxlength="4" class="BigInput per_yearjia" value="0"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.PlaceOfOrigin" />：</td>
                        <td class="TableData"  nowrap="">
                            <select style="width:218px;" name="STAFF_NATIVE_PLACE" class="BigSelect per_address" title="<fmt:message code="hr.th.OriginIn" />。">
                                <option value="" selected=""></option>
                                <option value="110000">北京</option>
                                <option value="120000">天津</option>
                                <option value="130000">河北</option>
                                <option value="140000">山西</option>
                                <option value="150000">内蒙古</option>
                                <option value="210000">辽宁</option>
                                <option value="220000">吉林</option>
                                <option value="230000">黑龙江</option>
                                <option value="310000">上海</option>
                                <option value="320000">江苏</option>
                                <option value="330000">浙江</option>
                                <option value="340000">安徽</option>
                                <option value="350000">福建</option>
                                <option value="360000">江西</option>
                                <option value="370000">山东</option>
                                <option value="410000">河南</option>
                                <option value="420000">湖北</option>
                                <option value="430000">湖南</option>
                                <option value="440000">广东</option>
                                <option value="450000">广西</option>
                                <option value="460000">海南</option>
                                <option value="500000">重庆</option>
                                <option value="510000">四川</option>
                                <option value="520000">贵州</option>
                                <option value="530000">云南</option>
                                <option value="540000">西藏</option>
                                <option value="610000">陕西</option>
                                <option value="620000">甘肃</option>
                                <option value="630000">青海</option>
                                <option value="640000">宁夏</option>
                                <option value="650000">新疆</option>
                                <option value="710000">台湾</option>
                                <option value="810000">香港</option>
                                <option value="820000">澳门</option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width"  style="padding-right: 8px;"><fmt:message code="url.th.Zodiac" /> : </td>
                        <td colspan="3" class="TableData" title="<fmt:message code="url.th.Zodiac" />">
                            <input type="text" value="" id="animal_id" class="BigStatic per_shengxiao" readonly="">
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  style="padding-right: 8px;"></td>
                        <td><input type="text" placeholder="<fmt:message code="vote.th.enterAddress" />" class="per_detialAdd" name="STAFF_NATIVE_PLACE2" style="width:218px;height: 28px;" value=""></td>
                        <td nowrap="" class="TableData text_width " style="padding-right: 8px;"><fmt:message code="url.th.constellation" /> : </td>
                        <td class="TableData" colspan="3" title="<fmt:message code="url.th.constellation" />">
                            <input type="text" value="" id="sign_id" class="BigStatic per_start" readonly="">
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" style="padding-right: 8px;"><fmt:message code="url.th.BloodType" /> : </td>
                        <td class="TableData">
                            <select style="width:218px;" name="BLOOD_TYPE" class="BigSelect per_xiexing">
                                <option value=""></option>
                                <option value="A">A</option>
                                <option value="B">B</option>
                                <option value="O">O</option>
                                <option value="AB">AB</option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.Nation" />：</td>
                        <td class="TableData" colspan="3"><input type="text" name="STAFF_NATIONALITY" class="BigInput per_minzu" value=""></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.MaritalStatus" />：</td>
                        <td class="TableData" width="180">
                            <select  style="width:218px;"   name="STAFF_MARITAL_STATUS" class="BigSelect per_hunyin">
                                <option value="" selected=""></option>
                                    <option value="0"><fmt:message code="hr.th.unmarried" /></option>
                                    <option value="1"><fmt:message code="hr.th.married" /></option>
                                    <option value="2"><fmt:message code="hr.th.Divorce" /></option>
                                    <option value="3"><fmt:message code="hr.th.Widowed" /></option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width" width="100"><fmt:message code="hr.th.Health" />：</td>
                        <td class="TableData" colspan="3"><input type="text" name="STAFF_HEALTH" value="" class="BigInput per_health"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.PoliticalOutlook" />：</td>
                        <td class="TableData" width="180">
                            <select style="width:218px;" name="STAFF_POLITICAL_STATUS" class="BigSelect per_zhengzhi" title="<fmt:message code="hr.th.PoliticalAffiliation" />。">
                                <option value="" selected=""></option>
                                    <option value="1"><fmt:message code="hr.th.TheMasses" /></option>
                                    <option value="2"><fmt:message code="hr.th.Communist" /></option>
                                    <option value="3"><fmt:message code="hr.th.CPCMembers" /></option>
                                    <option value="4"><fmt:message code="hr.th.CPCProbationaryParty" /></option>
                                    <option value="5"><fmt:message code="hr.th.DemocraticParties" /></option>
                                    <option value="6"><fmt:message code="hr.th.PersonagesWithoutParty" /></option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.PartyMembershipTime" />：</td>
                        <td class="TableData" colspan="3">
                            <input type="text" name="JOIN_PARTY_TIME" size="10" maxlength="10" class="BigInput per_dang" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"><fmt:message code="hr.th.Household" />：</td>
                        <td class="TableData">
                            <select style="width:218px;" name="STAFF_TYPE" class="BigSelect per_hukou" title="<fmt:message code="hr.th.TheType" />。">
                                <option value="" selected=""></option>
                                    <option value="01"><fmt:message code="hr.th.UrbanMunicipality" /></option>
                                    <option value="02"><fmt:message code="hr.th.WorkersTowns" /></option>
                                    <option value="03"><fmt:message code="hr.th.MigrantCity" /></option>
                                    <option value="04"><fmt:message code="hr.th.MigrantWorkers" /></option>
                                    <option value="05"><fmt:message code="hr.th.RuralLabor" /></option>
                                    <option value="06"><fmt:message code="hr.th.OutOfTown" /></option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.RegisteredResidence" />：</td>
                        <td class="TableData" width="180" colspan="3"><input type="text" name="STAFF_DOMICILE_PLACE" value="" size="40" class="BigInput per_hukouAdd"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.PhotoUpload" />：</td>
                        <td class="TableData" width="180" colspan="5" >
                            <form method="post" action="" enctype="multipart/form-data" id="photoForm"><span id="showImage"></span>
                                <input style="width:218px;text-align: right; color:#999;" type="file" name="imageFile" id="imageFile" size="40" class="BigInput" title="<fmt:message code="doc.th.SelectAttachment" />" >&nbsp;
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  ></td>
                        <td colspan="5"><span style="color:#999;font-size:14px;"><fmt:message code="hr.th.PhotoFormats" />!</span></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="hr.th.Position" />：</b></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.TypeWork" />：</td>
                        <td class="TableData" width="180" ><input type="text" name="WORK_TYPE" class="BigInput per_gongzhong" value=""></td>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.AdministrativeLevel" />：</td>
                        <td class="TableData" colspan="3" ><input type="text" name="ADMINISTRATION_LEVEL" class="BigInput per_xingzheng" value=""></td>

                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.EmployeeType" />：</td>
                        <td class="TableData" >
                            <select style="width:218px;" name="STAFF_OCCUPATION" class="BigSelect per_yuangongType" title="<fmt:message code="hr.th.Employees" />。">
                                <option value="" selected=""></option>
                                <option value="01"><fmt:message code="hr.th.ContractWorker" /></option>
                                <option value="02"><fmt:message code="hr.th.RegularEmployee" /></option>
                                <option value="03"><fmt:message code="hr.th.TemporaryWorker" /></option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width test_text" ><fmt:message code="hr.th.InductionTime" />：</td>
                        <td class="TableData" colspan="3">
                            <input type="text" name="DATES_EMPLOYED" size="10" maxlength="10" class="BigInput per_ruzhiTime test_null" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:function(dates){
                                var date=new Date();
                                var year=date.getTime();
                                var oldYear=Number(new Date(dates).getTime());
                                var time=(year-oldYear) / 1000 / 60 / 60 / 24 /365;
                                var times=time.toFixed(1);
                                 times=Math.ceil(times)
                                $('.per_gongling').val(times)
                            }})"> <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.post" />：</td>
                        <td nowrap="" class="TableData">
                            <select style="width:218px;" name="WORK_JOB" class="BigSelect per_yingpin" >
                                <%--  <option value=""></option>
                                      <option value="1"><fmt:message code="hr.th.Technology" /></option>
                                      <option value="2"><fmt:message code="hr.th.TechnicalSupport" /></option>
                                      <option value="3"><fmt:message code="hr.th.Sale" /></option>--%>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.Incumbency" />：</td>
                        <td class="TableData"  colspan="3">
                            <select style="width:218px;" name="WORK_STATUS" class="BigSelect per_zaizhizhuangtai" title="<fmt:message code="hr.th.InTheState" />。">
                                <option value="" selected=""></option>
                                <option value="01"><fmt:message code="hr.th.Job" /></option>
                                <option value="02"><fmt:message code="hr.th.Resignation" /></option>
                                <option value="03"><fmt:message code="hr.th.Retired" /></option>
                                <option value="04"><fmt:message code="hr.th.retire" /></option>
                                <option value="05"><fmt:message code="hr.th.ToLoan" /></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ContactNumber" />：</td>
                        <td class="TableData" width="180"><input type="text" name="STAFF_PHONE" class="BigInput per_dianhua" value=""></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.AttendanceSchedulingType" />：</td>
                        <td nowrap=""   colspan="3" class="TableData">
                            <select style="width:218px;" name="DUTY_TYPE" class="BigSelect per_kaoqin">
                                <option value="1" selected=""><fmt:message code="hr.th.RegularClass" /></option>
                                <option value="2"><fmt:message code="hr.th.WholeDay" /></option>
                                <option value="99"><fmt:message code="hr.th.ShiftSystem" /></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="userDetails.th.post" />：</td>
                        <td class="TableData" width="180" style="text-align: left;"><select   style="width:218px;"  type="text" name="JOB_POSITION" class="BigInput per_zhiwu"></select></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.Title" />：</td>
                        <td class="TableData"  colspan="3">
                            <select style="width:218px;" name="PRESENT_POSITION" class="BigSelect per_zhicheng" title="<fmt:message code="hr.th.TheTitle" />。">
                                <option value="" selected=""></option>
                                    <option value="08"><fmt:message code="hr.th.SeniorTitles" /></option>
                                    <option value="02"><fmt:message code="hr.th.AssistantEngineer" /></option>
                                    <option value="01"><fmt:message code="hr.th.Engineer" /></option>
                                    <option value="03"><fmt:message code="hr.th.SeniorEngineer" /></option>
                                    <option value="04"><fmt:message code="hr.th.Senior" /></option>
                                    <option value="07"><fmt:message code="hr.th.Title" /></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="vote.th.JobLevel" />：</td>
                        <td class="TableData" width="180">
                            <select style="width:218px;" name="USERDEF5" class="BigSelect per_jobLevel" title="<fmt:message code="hr.th.InTheState" />。">
                                <option value="" selected=""></option>
                                <option value="1"><fmt:message code="vote.th.Clerk" /></option>
                                <option value="2"><fmt:message code="vote.th.Minor" /></option>
                                <option value="3"><fmt:message code="vote.th.ZHENGKe" /></option>
                                <option value="4"><fmt:message code="vote.th.DeputyDirector" /></option>
                                <option value="5"><fmt:message code="vote.th.ZHENGChu" /></option>
                            </select>
                        </td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.TitleLevel" />：</td>
                        <td class="TableData" colspan="3">
                            <select style="width:218px;" name="WORK_LEVEL" class="BigSelect per_zhichengjibie" title="<fmt:message code="hr.th.Thetitlelevel" />。">
                                <option value="" selected=""></option>
                                    <option value="01"><fmt:message code="hr.th.primary" /></option>
                                    <option value="02"><fmt:message code="hr.th.intermediate" /></option>
                                    <option value="03"><fmt:message code="hr.th.deputySeniorRanks" /></option>
                                    <option value="04"><fmt:message code="hr.th.IsHigh" /></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.LengthUnit" />：</td>
                        <td class="TableData" width="180"><input type="text" name="JOB_AGE" class="BigInput per_gongling" readonly="readonly" style="background: #e7e7e7"  value=""></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.StartingSalary" />：</td>
                        <td class="TableData" colspan="3">
                            <input type="text" onblur="newtime(this)"  name="BEGIN_SALSRY_TIME" size="10" maxlength="10" class="BigInput per_xinziTime" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"<%--,choose:function(dates){
                                var date=new Date();
                                var year=date.getTime();
                                var oldYear=Number(new Date(dates).getTime());
                                var time=(year-oldYear) / 1000 / 60 / 60 / 24 /365;
                                var times=time.toFixed(1);
                                $('.per_gongling').val(times)
                            }})"--%>>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.TotalLengthOfService" />：</td>
                        <td class="TableData" width="180"><input type="text" name="WORK_AGE" style="background: #e7e7e7" readonly="readonly" value="" class="BigInput per_allage"></td>
                        <td nowrap="" class="TableData text_width test_text" ><fmt:message code="hr.th.WorkingHours" />：</td>
                        <td class="TableData"  colspan="3">
                            <input type="text" name="JOB_BEGINNING" size="10"  maxlength="10"  class="BigInput per_joinWork test_null" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD',choose:function(dates){
                                var date=new Date();
                                var year=date.getTime();
                                var oldYear=Number(new Date(dates).getTime());
                                var time=(year-oldYear) / 1000 / 60 / 60 / 24 /365;
                                var times=time.toFixed(1);
                                times=Math.ceil(times)
                                $('.per_allage').val(times)
                            }})" onchange="get_work_age(this.value)"> <span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.PhoneNumber" />：</td>
                        <td class="TableData" width="180"><input type="text" name="STAFF_MOBILE" class="BigInput per_phone" value=""></td>
                        <td nowrap="" class="TableData text_width" >MSN：</td>
                        <td class="TableData" colspan="3" ><input type="text" name="STAFF_MSN" class="BigInput per_msn" value=""></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="main.email" />：</td>
                        <td class="TableData" width="180"><input type="text" name="STAFF_EMAIL" class="BigInput per_email" data-prompt-position="centerRight:5,-4" value=""></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.HomeAddress" />：</td>
                        <td class="TableData" width="180" colspan="3"><input type="text" name="HOME_ADDRESS" size="50" value="" class="BigInput per_familyAdd"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" >QQ：</td>
                        <td class="TableData" width="180"><input type="text" name="STAFF_QQ" class="BigInput per_qq" data-prompt-position="centerRight:5,-4" value=""></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.OtherInformation" />：</td>
                        <td class="TableData" width="180" colspan="3"><input type="text" name="OTHER_CONTACT" size="50" value="" class="BigInput per_elseType"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width">  <fmt:message code="hr.th.IsExpert" />：</td>
                        <td class="TableData">
                            <input type="radio" id="yes" name="batch" value="1" class="isExperts" style="width:16px; margin-left: 33px;"><label for="yes" style="    line-height: 23px;    margin-left: -47px;"><fmt:message code="global.lang.yes" /></label>
                            <input type="radio" id="no" name="batch" value="0" class="isExperts" style="width:16px;    margin-left: 33px;"><label for="no" style="    line-height: 23px;    margin-left: 32px;"><fmt:message code="global.lang.no" /></label></td>
                        <td nowrap="" class="TableData text_width"> <fmt:message code="hr.th.researchField" />：</td>
                        <td class="TableData" width="180" colspan="3">
                            <textarea rows="3" cols="29" name="EXPERTS_INFO" id="EXPERTS_INFO" class="per_yanjiu"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"> <fmt:message code="hr.th.SocialAppointments" />：</td>
                        <td class="TableData">
                            <textarea rows="3" cols="29" name="PART_TIME" id="PART_TIME" class="per_socish"></textarea>
                        </td>
                        <td nowrap="" class="TableData text_width">  <fmt:message code="hr.th.AchievementIntroduction" />：</td>
                        <td class="TableData" width="180" colspan="3">
                            <textarea rows="3" cols="29" name="RESEARCH_RESULTS" class="per_success" id="RESEARCH_RESULTS"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"> <fmt:message code="hr.th.ImmediateSuperior" />：</td>
                        <td nowrap="" class="TableData">
                            <input type="hidden" name="COPY_TO_ID1" value="" id="directlySuperior" class="inp_shangji">
                            <textarea cols="19" style="vertical-align: middle;"  name="COPY_TO_NAME1" id="directlySuperiorName"  rows="2" class="BigStatic text_shangji" wrap="yes" readonly=""></textarea>
                            <a href="javascript:;" class="orgAdd choose add_shangji" style="color:#999;font-size: 14px;" ><fmt:message code="global.lang.select" /></a>
                            <a href="javascript:;" class="orgClear delect clear_shangji" style="color:#999;font-size: 14px;"><fmt:message code="global.lang.empty" /></a>
                        </td>
                        <td nowrap="" class="TableData text_width"> <fmt:message code="hr.th.SubordinateSubordinate" />：</td>
                        <td nowrap="" class="TableData" width="180" colspan="3">
                            <input type="hidden" name="COPY_TO_ID" value="" id="directlyUnder" class="inp_xiaji">
                            <textarea cols="19" style="vertical-align: middle;" name="COPY_TO_NAME" id="directlyUnderName" rows="2" class="BigStatic text_xiaji" wrap="yes" readonly=""></textarea>
                            <a href="javascript:;" class="orgAdd add_xiaji" style="color:#999;font-size: 14px;"><fmt:message code="global.lang.select" /></a>
                            <a href="javascript:;" class="orgClear clear_xiaji" style="color:#999;font-size: 14px;"><fmt:message code="global.lang.empty" /></a>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.OpeningBank" />1：</td>
                        <td class="TableData" width="180"><input type="text" name="BANK1" class="BigInput per_kaihuhang" value=""></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.account" />1：</td>
                        <td class="TableData" width="180" colspan="3"><input type="text" name="BANK_ACCOUNT1" size="50" value="" class="BigInput zhanghuone"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.OpeningBank" />2：</td>
                        <td class="TableData" width="180" ><input type="text" name="BANK2" class="BigInput per_kaihuhangtwo" value=""></td>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.account" />2：</td>
                        <td class="TableData" width="180" colspan="3" ><input type="text" name="BANK_ACCOUNT2" size="50" value="" class="BigInput zhanghutwo"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableHeader" colspan="6"><b>&nbsp;<fmt:message code="hr.th.educationalBackground" />：</b></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width test_text"  ><fmt:message code="hr.th.Education" />：</td>
                        <td class="TableData" width="180" >
                            <select style="width:218px;" name="STAFF_HIGHEST_SCHOOL" class="BigSelect per_xueli test_null" title="<fmt:message code="hr.th.TheEducation" />。">
                                <option value="" selected=""></option>
                                <option value="1"><fmt:message code="vote.hr.1" /></option>
                                <option value="2"><fmt:message code="vote.hr.2" /></option>
                                <option value="3"><fmt:message code="vote.hr.3" /></option>
                                <option value="4"><fmt:message code="vote.hr.4" /></option>
                                <option value="5"><fmt:message code="vote.hr.5" /></option>
                                <option value="6"><fmt:message code="vote.hr.6" /></option>
                                <option value="7"><fmt:message code="vote.hr.7" /></option>
                                <option value="8"><fmt:message code="vote.hr.8" /></option>
                                <option value="9"><fmt:message code="vote.hr.9" /></option>
                                <option value="11"><fmt:message code="vote.hr.10" /></option>
                            </select><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span>
                        </td>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.AcademicDegree" />：</td>
                        <td class="TableData" colspan="3" >
                            <select style="width:218px;" name="STAFF_HIGHEST_DEGREE" class="BigSelect per_xuewei" title="<fmt:message code="hr.th.Adegree" />。">
                                <option value="" selected=""></option>
                                <option value="1"><fmt:message code="vote.hr.9" /></option>
                                <option value="2"><fmt:message code="vote.hr.8" /></option>
                                <option value="3">MBA</option>
                                <option value="4"><fmt:message code="vote.hr.13" /></option>
                                <option value="5"><fmt:message code="vote.hr.12" /></option>
                                <option value="6"><fmt:message code="vote.hr.11" /></option>
                                <option value="7"><fmt:message code="event.th.nothing" /></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width"  ><fmt:message code="hr.th.GraduationTime" />：</td>
                        <td class="TableData" width="180" >
                            <input type="text" name="GRADUATION_DATE" size="10" maxlength="10" class="BigInput per_overtime" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                        </td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ComputerLevel" />：</td>
                        <td class="TableData" colspan="3"><input type="text" name="COMPUTER_LEVEL" value="" class="BigInput per_shuiping"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.GraduationSchool" />：</td>
                        <td class="TableData" width="180"><input type="text" name="GRADUATION_SCHOOL" value="" class="BigInput per_school"></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.major" />：</td>
                        <td class="TableData" colspan="3"><input type="text" name="STAFF_MAJOR" value="" class="BigInput per_zhuanye"></td>

                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ForeignLanguage" />1：</td>
                        <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE1" value="" class="BigInput per_yuzhongone"></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ForeignLanguageProficiency" />1：</td>
                        <td class="TableData" colspan="3"><input type="text" name="FOREIGN_LEVEL1" value="" class="BigInput per_waiyuone"></td>

                    </tr>
                    <tr>

                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ForeignLanguage" />2：</td>
                        <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE2" value="" class="BigInput per_yuzhongtwo"></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ForeignLanguageProficiency" />2：</td>
                        <td class="TableData" colspan="3"><input type="text" name="FOREIGN_LEVEL2" value="" class="BigInput per_waiyutwo"></td>

                    </tr>
                    <tr>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ForeignLanguage" />3：</td>
                        <td class="TableData" width="180"><input type="text" name="FOREIGN_LANGUAGE3" value="" class="BigInput per_yuzhongthree"></td>
                        <td nowrap="" class="TableData text_width" ><fmt:message code="hr.th.ForeignLanguageProficiency" />3：</td>
                        <td class="TableData" colspan="3"><input type="text" name="FOREIGN_LEVEL3" value="" class="BigInput per_waiyuthree"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableData" width="100" ><fmt:message code="hr.th.Specialty" />：</td>
                        <td class="TableData" width="180" colspan="5" ><input type="text" name="STAFF_SKILLS" value="" size="80" style="width:218px;" class="BigInput per_techang"></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableHeader" colspan="2"><b>&nbsp;<fmt:message code="hr.th.JobStatus" />：</b></td>
                        <td nowrap="" class="TableHeader" colspan="4"><b>&nbsp;<fmt:message code="HR.TH.WarrantyRecord" />：</b></td>
                    </tr>
                    <tr>
                        <td class="TableData" colspan="2" style="text-align: left;"><textarea cols="30" style="margin-left: 134px;margin-top: 9px; margin-bottom: 6px;" name="CERTIFICATE" rows="5" class="BigInput zhiwu" wrap="on"></textarea></td>
                        <td class="TableData" colspan="4"><textarea cols="30" name="SURETY" rows="5" style="margin-left: 136px;margin-top: 9px; margin-bottom: 6px;" class="BigInput danbao" wrap="on"></textarea></td>
                    </tr>
                    <tr>
                        <td nowrap="" class="TableHeader" colspan="2"><b>&nbsp;<fmt:message code="HR.TH.SocialPayment" />：</b></td>
    <td nowrap="" class="TableHeader" colspan="4"><b>&nbsp;<fmt:message code="HR.TH.PhysicalRecord" />：</b></td>
                    </tr>
                    <tr>
                        <td class="TableData" colspan="2" style="text-align: left;"><textarea cols="30" style="margin-left: 134px; margin-top: 9px;margin-bottom: 6px;" name="INSURE" rows="5" class="BigInput shebao" wrap="on"></textarea></td>
                        <td class="TableData" colspan="4"><textarea cols="30" style="margin-left: 136px;margin-top: 9px; margin-bottom: 6px;" name="BODY_EXAMIM" rows="5" class="BigInput tijian" wrap="on"></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="6">
                        </td>
                    </tr>
                    <tr>
                        <td nowrap="" align="left" colspan="6" class="TableHeader"><b>&nbsp; <fmt:message code="journal.th.Remarks" />：</b></td>
                    </tr>
                    <tr>
                        <td style="text-align: left;" nowrap="" class="TableData" colspan="6"><textarea name="REMARK" cols="94" rows="5" style="margin-top: 9px;margin-bottom: 6px;margin-left: 132px;" class="BigInput beizhu" value=""></textarea></td>
                    </tr>
                   <%-- <tr height="25">
                        <td class="TableData" colspan="1">
                            <span class="span_td" style="text-align: right"><fmt:message code="sup.th.RelatedAccessories" />：</span>
                        </td>
                        <td class="TableData" colspan="2">
                           <div class="Attachment"></div>
                            <form id="uploadimgform" target="uploadiframe"  action="../upload?module=hr_staffinfo" enctype="multipart/form-data" method="post" >
                                <input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">
                                <a href="javascript:;" id="uploadimg"><img style="margin-right:5px;" src="/img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
                            </form>
                        </td>

&lt;%&ndash;
                            <span id="ATTACHMENT1_div"></span><span id="ATTACHMENT1_upload_div" style="display:none;"></span><div id="SelFileDiv1"></div><a class="addfile" href="javascript:;">添加附件<input class="addfile" type="file" name="ATTACHMENT1_0" id="ATTACHMENT1_0" size="1" hidefocus="true" onchange="AddFile();"></a><a href="javascript:void(0);" onclick="sel_attach('SelFileDiv1','ATTACH_DIR1','ATTACH_NAME1','DISK_ID1');" class="selfile">从文件柜和网络硬盘选择附件</a><input type="hidden" value="" name="ATTACH_NAME1"><input type="hidden" value="" name="ATTACH_DIR1"><input type="hidden" value="" name="DISK_ID1">
&ndash;%&gt;
                    </tr>--%>
                    <tr>
                        <td nowrap="" class="TableHeader" colspan="6"> <b>&nbsp; <fmt:message code="HR.TH.resume" />：</b></td>
                    </tr>
                    <tr>
                        <%--uevar data_器--%>
                            <td colspan="6">
                                <div id="word_container" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></div>
                            </td>
                    </tr>
                    </tbody>
                </table>
                <div class="box_two foot_mg">
                    <div class="btn_">
                        <div id="add_send" value="1" type="publish" class="fot_1 btn_ok" ac="edit"><fmt:message code="global.lang.save" /></div>
                       <div id="leave_send" value="0" type="save" class="btn_style btn_ok leave_send"><fmt:message code="hr.th.Quit" /></div>
                    </div>
                </div>

            </div>

            <div class="childQuery" style="display:none;">
                <div align="center" style="float: right; ">
                    <input type="button" value="<fmt:message code="HR.TH.Newuserfile" />" class="BigButton hr_add" title="<fmt:message code="HR.TH.Newuserfile" />">
                </div>
                <div class="per_title" style="margin-top:20px;margin-left:20px;"><h3><fmt:message code="hr.th.Userfilelist" /><span class="have_per">0</span><fmt:message code="hr.th.PeopleNotFiling" /><span class="no_perCount">0</span>人</h3></div>
                <table class="allCondition"    style="border-collapse: collapse;" ></table>
            </div>



            <%--新建离职:点击离职后跳转的页面--%>
            <div class="addLeave" style="display: none" >
                <p><fmt:message code="hr.th.NewEmployee" /></p>
                <div class="" >
                    <table class="TableBlock" width="100%" align="center">
                        <tbody>
                        <tr>
                            <td nowrap="" class="TableData leaveTestText" width="100"><fmt:message code="hr.th.Demission" />：</td>
                            <td class="TableData"  width="180">
                                <input type="text" name="LEAVE_PERSON"  value="" id="LEAVE_PERSON"  class="BigStatic leave_person colorDis leaveTestNull" size=12 maxlength=100 readonly="">
                                <span style="color:red;size: 18px">*</span><%--<a href="javascript:;" class="orgAdd leavePerson_add" id="leavePerson_add"><fmt:message code="global.lang.select" /></a>--%>
                            </td>

                            <td nowrap="" class="TableData"> <fmt:message code="hr.th.AssumeOffice" />：</td>
                            <td class="TableData dept" colspan="2" width="80%">
                                <input type="text" name="POSITION" value="" class="position">
                            </td>
                        </tr>
                        <tr>
                            <td nowrap="" class="TableData" width="100"><fmt:message code="hr.th.TurnoverType" />：</td>
                            <td class="TableData" width="180">
                                <select style="width:218px;" name="QUIT_TYPE" class="BigSelect quitType" id="QUIT_TYPE">
                                    <option value="" selected=""><fmt:message code="hr.th.TurnoverType" /></option>
                                    <option value="1"><fmt:message code="hr.th.Resignation" /></option>
                                    <option value="2"><fmt:message code="hr.th.Retired" /></option>
                                    <option value="3"><fmt:message code="hr.th.retire" /></option>
                                    <option value="4"><fmt:message code="hr.th.ToLoan" /></option>
                                </select>
                            </td>
                            <td nowrap="" class="TableData leaveTestText" width="100"><fmt:message code="hr.th.DateOfApplication" />：</td>
                            <td class="TableData" width="180">
                                <input type="text" name="APPLICATION_DATE" size="10" maxlength="10" class="BigInput applicationDate leaveTestNull" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)"><span style="color:red;size: 18px">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap="" class="TableData"><fmt:message code="hr.th.ProposedDateOfDeparture" />：</td>
                            <td class="TableData" width="180">
                                <input type="text" name="QUIT_TIME_PLAN" size="10" maxlength="10" class="BigInput quitTimePlan" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)">
                            </td>
                            <td nowrap="" class="TableData leaveTestText"><fmt:message code="hr.th.ActualDeparture" />：</td>
                            <td class="TableData" width="180">
                                <input type="text" name="QUIT_TIME_FACT" size="10" maxlength="10" class="BigInput quitTimeFact leaveTestNull" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)"><span style="color:red;size: 18px">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap="" class="TableData"><fmt:message code="hr.th.WageDate" />：</td>
                            <td class="TableData" width="180">
                                <input type="text" name="LAST_SALARY_TIME" size="10" maxlength="10" class="BigInput lastSalaryTime" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" onchange="get_work_age(this.value)">
                            </td>
                            <td nowrap="" class="TableData leaveTestText"><fmt:message code="hr.th.DepartureDepartment" />：</td>
                            <td> <input type="text" name="LEAVE_DEPT"  value="" id="LEAVE_DEPT"  class="BigStatic  leaveDept leaveTestNull colorDis" size=12 maxlength=100 readonly=""><span style="color:red;size: 18px">*</span>
                                <%--<a href="javascript:;" class="orgAdd dept_add" id="leaveDept_add"><fmt:message code="global.lang.select" /></a>--%></td>
                        </tr>
                        <tr>
                            <td nowrap="" class="TableData"><fmt:message code="hr.th.Month'sSalary" />：</td>
                            <td class="TableData">
                                <input type="text" name="SALARY" id="SALARY" class="BigInput salary" value="" >
                            </td>
                            <td nowrap="" class="TableData"><fmt:message code="hr.th.JoinBlacklist" />：</td>
                            <td class="TableData" colspan="2">
                                <input type="checkbox" name="IS_BLACKLIST" id="IS_BLACKLIST" class="isBlackList"></input>
                            </td>
                        </tr>
                        <tr>
                            <td nowrap=""   class="TableData"><fmt:message code="hr.th.Whereabouts" />：</td>

                            <td style="text-align: left;" nowrap="" class="TableData" colspan="3"><textarea name="TRACE" cols="95" rows="3" class="BigInput trace" value=""></textarea></td>
                        </tr>
                        <%--  <tr>
                              <td nowrap="" align="left" colspan="6" class="TableHeader">离职手续办理：</td>
                          </tr>
                          <tr>
                              <td style="text-align: left;" nowrap="" class="TableData" colspan="6"><textarea name="REMARK" cols="95" rows="3" class="BigInput beizhu" value=""></textarea></td>
                          </tr>--%>
                        <tr>
                            <td nowrap="" class="TableData"><fmt:message code="journal.th.Remarks" />：</td>

                            <td style="text-align: left;" nowrap="" class="TableData" colspan="3"><textarea name="REMARK" cols="95" rows="3" class="BigInput leaveBeizhu" value=""></textarea></td>
                        </tr>
                       <%-- <tr height="25">
                            <td nowrap="" class="TableData"><fmt:message code="email.th.filechose" />：</td>
                            <td class="TableData" colspan="3">
                                &lt;%&ndash;<script>ShowAddFile('1');</script>&ndash;%&gt;
                                <span id="ATTACHMENT1_div"></span><span id="ATTACHMENT1_upload_div" style="display:none;"></span><div id="SelFileDiv1"></div><a class="addfile" href="javascript:;"><fmt:message code="email.th.addfile" /><input class="addfile" type="file" name="ATTACHMENT1_0" id="ATTACHMENT1_0" size="1" hidefocus="true" onchange="AddFile();"></a><a href="javascript:void(0);" onclick="sel_attach('SelFileDiv1','ATTACH_DIR1','ATTACH_NAME1','DISK_ID1');" class="selfile">从文件柜和网络硬盘选择附件</a><input type="hidden" value="" name="ATTACH_NAME1"><input type="hidden" value="" name="ATTACH_DIR1"><input type="hidden" value="" name="DISK_ID1">
                            </td>
                        </tr>--%>
                        <tr>
                            <td nowrap="" class="TableData leaveTestText"><fmt:message code="hr.th.ReasonsLeaving" />：</td>
                            <td class="TableData" colspan="3">
                                <textarea name="QUIT_REASON" id="QUIT_REASON" class="quitReason leaveTestNull" cols="95" rows="5"></textarea><span style="color:red;size: 18px">*</span>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="box_two foot_mg">
                        <div class="btn_">
                            <div id="leave_baocun" value="0" type="save" class="btn_style btn_ok leave_send"><fmt:message code="global.lang.save" /></div>
                        </div>
                    </div>

                </div>
            </div>

        </div>

    </div>


<script>
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
    function clickrenwu (id,me) {
        $('#add_send').attr('ac', 'edit');
        $(".leave_send").show();//离职按钮显示
        $('.table_personDetail').show().siblings().hide();
        //先清空头像
        $(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');/*暂无照片*/
        $("#showImage").html("");
        var data = {
            'uid': id
        }
        ue.ready(function () {
            $.ajax({
                type: 'get',
                url: '<%=basePath%>hr/api/getPersonFileByUserId',
                dataType: 'json',
                data: data,
                success: function (res) {
                    var data = res;
                    var str = '';
                    //附件
                   /* if(data.attachmentList.length>0){
                        for(var i=0;i<data.attachmentList.length;i++){
                            str+='<div class="dech" deUrl="'+data.attachmentList[i].attUrl+'"><a href="<%=basePath %>download?'+data.attachmentList[i].attUrl+'" NAME="'+data.attachmentList[i].attachName+'*"><img style="width:16px;" src="../img/file/cabinet@.png"/>'+data.attachmentList[i].attachName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data.attachmentList[i].aid+'@'+data.attachmentList[i].ym+'_'+data.attachmentList[i].attachId+',"></div>';
                        }
                    }else{
                        str='';
                    }
                    $('.Attachment').append(str);*/
                    $("#animal_id").val("");//先将生肖清空
                    $("#sign_id").val("");//先将星座清空
                    $(".byName").val(data.byName);
                    $(".dept_id").val(data.deptId);
                    $(".uid").val(data.uid);
                    $(".staffId").val(data.staffId);
                    $(".user_id").val(data.userId);//userId
                    $('.per_name').val(data.staffName);
                    /*姓名*/
                    $('.dept_name ').val(data.deptName);
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
                    $('.per_jobLevel').val(data.userdef5);

                    $('.per_familyAdd').val(data.homeAddress);
                    /*家庭地址 */
                    $('.per_elseType').val(data.otherContact);
                    /*其他联系方式*/
                     $('.per_yanjiu').val(data.researchResults);/*研究领域 未找到*/
                    $('.per_socish').val(data.partTime);
                    /*社会兼职*/
                    $('.per_success').val(data.researchResults);
                    /*成果介绍*/
                    $('#directlySuperiorName').val(data.directlySuperiorName);
                    $('#directlySuperiorName').attr("dataid",data.directlySuperior);
                    /*直属上级*/
                    $('#directlyUnderName').val(data.directlyUnderName);
                    $('#directlyUnderName').attr("dataid",data.directlyUnder);
                    /*直属下级*/
                    $('.per_kaihuhang').val(data.bank1);
                    /*开户行1*/
                    $('.per_kaihuhangtwo').val(data.bank2);
                    /*开户行2*/
                    $('.zhanghuone').val(data.bankAccount1);
                    /*开户行的账号1*/
                    $('.zhanghutwo').val(data.bankAccount2);
                    /*开户行的账号2*/
                    $('.per_xueli').val(data.staffHighestSchool);
                    /*学历*/
                    $('.per_xuewei').val(data.staffHighestDegree);
                    /*学位*/
                    if(data.graduationDate=='0000-00-00'){
                        $('.per_overtime').val('');
                    }else{
                        $('.per_overtime').val(data.graduationDate);
                    }
                    /*毕业时间*/
                    $('.per_shuiping').val(data.computerLevel);
                    /*计算机水平*/
                    $('.per_yuzhongone').val(data.foreignLanguage1);
                    /*外语语种1*/
                    $('.per_yuzhongtwo').val(data.foreignLanguage2);
                    /*外语语种2*/
                    $('.per_yuzhongthree').val(data.foreignLanguage3);
                    /*外语语种3*/
                    $('.per_waiyuthree').val(data.foreignLevel1);
                    /*外语水平1*/
                    $('.per_waiyutwo').val(data.foreignLevel2);
                    /*外语水平2*/
                    $('.per_waiyuone').val(data.foreignLevel3);
                    /*外语水平3*/
                    $('.per_techang').val(data.staffSkills);
                    /*特长*/
                    $('.zhiwu').val(data.certificate);
                    /*职务情况 */
                    $('.danbao').val(data.surety);
                    /*担保记录*/
                    $('.shebao').val(data.insure);
                    /*社保*/
                    $('.tijian').val(data.bodyExamim);
                    /*体检*/
                    $('.beizhu').val(data.remark);
                    /*备注*/
                    $(".per_qq").val(data.staffQq);//qq
                    /*简历*/
                    $(".per_num").val(data.staffNo);//编号
                    $(".per_overname").val(data.beforeName);//曾用名
                    var birth = $("#STAFF_BIRTH").val();
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
                    }else{
                        $(".hr_photo").html('<fmt:message code="hr.th.NoPhotos" />');
                    }
                    ue.setContent(data.resume);
                }
            })
        })
    }

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
                               str+= '<td><fmt:message code="hr.th.TheMasses" /></td>' ;
                           }else  if(data[i].staffPoliticalStatus==2){
                               str+= '<td><fmt:message code="hr.th.Communist" /></td>' ;
                           }else  if(data[i].staffPoliticalStatus==3){
                               str+= '<td><fmt:message code="hr.th.CPCMembers" /></td>' ;
                           }else  if(data[i].staffPoliticalStatus==4){
                               str+= '<td><fmt:message code="hr.th.CPCProbationaryParty" /></td>' ;
                           }else  if(data[i].staffPoliticalStatus==5){
                               str+= '<td><fmt:message code="hr.th.DemocraticParties" /></td>' ;
                           }else  if(data[i].staffPoliticalStatus==6){
                               str+= '<td><fmt:message code="hr.th.PersonagesWithoutParty" /></td>' ;
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
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/api/queryCountNoDocument',
            dataType: 'json',
            data: data,
            success: function (res) {
                var count = res.totleNum;
                $(".no_perCount").html(count);
            }
        })
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

        //职务下拉列表
        $.ajax({
            type: 'post',
            url: '/duties/selectUserPostList',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                str="<option value='0'><fmt:message code="hr.th.PleaseSelect" /></option>";
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+="<option value='"+data[i].postId+"'>"+data[i].postName+"</option>";
                    }
                }
                $(".per_zhiwu").html(str);
            }
        });
        //岗位下拉列表
        $.ajax({
            type: 'post',
            url: '/position/selectUserJob',
            dataType: 'json',
            success: function (obj) {
                var data=obj.obj;
                str="<option value='0'><fmt:message code="hr.th.PleaseSelect" /></option>";
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+="<option value='"+data[i].jobId+"'>"+data[i].jobName+"</option>";
                    }
                }
                $(".per_yingpin").html(str);
            }
        });
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
        $(".byName").val('');
        $(".byName").removeClass('colorDis');
        $(".byName").attr("readOnly",false);
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

        $('.per_jobLevel').val('');
        /*职务级别*/
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
                    $(".byName").val(data.byName);
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
                    $('.per_jobLevel').val(data.userdef5);
                    /*职务级别*/

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
        var cardId=$("#STAFF_CARD_NO").val();
        var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if(cardId!='') {
            if (!regIdNo.test(cardId)) {
                alert('身份证号填写有误');
                return false;
            }
        }

        var array=$(".test_null");
        var arrayText=$(".test_text");
        for(var i=0; i< array.length; i++){
            if(array[i].value==""){
                var tmp=$(arrayText[i]).text();
                if(tmp.indexOf("：")>=0){
                    tmp=tmp.substring(0,tmp.length-1);
                }
                $.layerMsg({content:tmp+"不能为空",icon: 2}, function(){
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
            userdef5:$('.per_jobLevel').val(),/*职务级别*/

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
            var byName=$(".byName").val();
            $(".user_id").val(byName);
            data_all.userId= $(".user_id").val();
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

    //点击离职后跳转到新建离职页面
    $("#leave_send").click(function () {
        //点击离职，先将用户信息保存到人事表中
        var array=$(".test_null");
        var arrayText=$(".test_text");
        for(var i=0; i< array.length; i++){
            if(array[i].value==""){
                var tmp=$(arrayText[i]).text();
                if(tmp.indexOf("：")>=0){
                    tmp=tmp.substring(0,tmp.length-1);
                }
                $.layerMsg({content:tmp+"不能为空",icon: 2}, function(){
                });
                return;
            }
        }
        var userPriv = $('.userPrivName ').attr("userpriv");
        if (userPriv != "" && userPriv.indexOf(',') >= 0) {
            userPriv = userPriv.substr(0, userPriv.length - 1);
        }
        var isLunar=0;
        if($("#IS_LUNAR").prop("checked")){
            isLunar=1;
        }
        var data_all = {
            uid: $(".uid").val(),
            staffId: $(".staffId").val(),
            staffName: $('.per_name').val(), /*姓名*/
            deptName: $('.dept_name').val(), /*部门   却少字段*/
            deptId: $(".dept_id").val(),
            staffHealth: $('.per_health').val(), /*健康*/
            staffMajor: $('.per_zhuanye').val(), /*专业*/
            graduationSchool: $('.per_school').val(), /*大学*/
            homeAddress: $('.per_familyAdd').val(), /*家庭住址*/
            staffEmail: $('.per_email').val(), /*邮件*/
            userPriv: userPriv, /*角色*/
            userName: $('.per_name').val(), /*本人的中文姓名*/
            staffEName: $('.per_engname').val(), /*本人的英文姓名*/
            userId: $('.user_id').val(), /*用户名*/
            workNo: $('.per_worknum').val(), /*工号*/
            staffSex: $('.per_sex').val(), /*性别*/
            staffCardNo: $('.per_ident').val(), /*身份证号*/
            staffBirth: $('.per_date').val(), /*出生日期*/
            staffAge: $('.per_age').val(), /*年龄*/
            leaveType: $('.per_yearjia').val(), /*年休假 */
            staffNativePlace: $('.per_address').val(), /*籍贯*/
            staffNativePlace2: $('.per_detialAdd').val(), /*具体籍贯*/
            bloodType: $('.per_xiexing').val(), /*血型*/
            staffMaritalStatus: $('.per_hunyin').val(), /*婚姻状况*/
            staffPoliticalStatus: $('.per_zhengzhi').val(), /*政治面貌*/
            joinPartyTime: $('.per_dang').val(), /*入党时间*/
            staffType: $('.per_hukou').val(), /*户口类别*/
            staffDomicilePlace: $('.per_hukouAdd').val(), /*户口所在地*/
            workType: $('.per_gongzhong').val(), /*工种*/
            administrationLevel: $('.per_xingzheng').val(), /*行政级别 */
            staffOccupation: $('.per_yuangongType').val(), /*员工类型*/
            jobPosition: $('.per_zhiwu').val(), /*职务*/
            presentPosition: $('.per_zhicheng').val(), /*职称*/
            datesEmployed: $('.per_ruzhiTime').val(), /*入职时间*/
            workLevel: $('.per_zhichengjibie').val(), /*职称级别*/
            workJob: $('.per_yingpin').val(), /*应聘岗位*/
            /*userPrivName:$('.per_kaoqin').val(),*//*考勤排班类别   ====》无字段 未找到*/
            jobAge: $('.per_gongling').val(), /*本单位工龄*/
            workAge: $('.per_allage').val(), /*总工龄*/
            beginSalsryTime: $('.per_xinziTime').val(), /*起薪时间 ===》 找到*/
            workStatus: $('.per_zaizhizhuangtai').val(), /*在职状态*/
            jobBeginning: $('.per_joinWork').val(), /*参加工作时间*/
            staffPhone: $('.per_dianhua').val(), /*联系电话*/
            staffMobile: $('.per_phone').val(), /*手机号码*/
            staffMsn: $('.per_msn').val(), /*msn*/
            userdef5:$('.per_jobLevel').val(),/*职务级别*/
            // homeAddress:$('.per_familyAdd').val(),/*家庭地址 */
            otherContact: $('.per_elseType').val(), /*其他联系方式*/
            isExperts: $('.isExperts:checked').val(), /*是否成为专家          单选*/
            // researchResults:$('.per_yanjiu').val(),/*研究领域 未找到*/
            partTime: $('.per_socish').val(), /*社会兼职*/
            researchResults: $('.per_success').val(), /*成果介绍*/
            directlySuperior:$('#directlySuperiorName').attr("dataid"), /*直属上级*/
            directlyUnder:$('#directlyUnderName').attr("dataid"), /*直属下级*/
            bank1: $('.per_kaihuhang').val(), /*开户行1*/
            bank2: $('.per_kaihuhangtwo').val(), /*开户行2*/
            bankAccount1: $('.zhanghuone').val(), /*开户行的账号1*/
            bankAccount2: $('.zhanghutwo').val(), /*开户行的账号2*/
            staffHighestSchool: $('.per_xueli').val(), /*学历*/
            staffHighestDegree: $('.per_xuewei').val(), /*学位*/
            graduationDate: $('.per_overtime').val(), /*毕业时间*/
            computerLevel: $('.per_shuiping').val(), /*计算机水平*/
            foreignLanguage1: $('.per_yuzhongone').val(), /*外语语种1*/
            foreignLanguage2: $('.per_yuzhongtwo').val(), /*外语语种2*/
            foreignLanguage3: $('.per_yuzhongthree').val(), /*外语语种3*/
            foreignLevel1: $('.per_waiyuone').val(), /*外语水平1*/
            foreignLevel2: $('.per_waiyutwo').val(), /*外语水平2*/
            foreignLevel3: $('.per_waiyuthree').val(), /*外语水平3*/
            staffSkills: $('.per_techang').val(), /*特长*/
            certificate: $('.zhiwu').val(), /*职务情况 */
            surety: $('.danbao').val(), /*担保记录*/
            insure: $('.shebao').val(), /*社保*/
            bodyExamim: $('.tijian').val(), /*体检*/
            remark: $('.beizhu').val(), /*备注*/
            staffNationality: $('.per_minzu').val(), /*民族*/
            beforeName: $('.per_overname').val(), /*曾用名*/
            staffNo: $(".per_num").val(), /*编号*/
            isLunar:isLunar,
            resume: ue.getContentTxt()/*简历*/
        }
        $.ajax({
            type: 'post',
            url: '<%=basePath%>hr/api/editPersonFile',
            dataType: 'json',
            data: data_all,
            success: function (res) {
            }
        })
        //进行跳转页面，进行离职保存
        $(".addLeave").show();
        $(this).parents('#table_personDetail').hide()
        var data = {
            'uid': $("#UID").val()
        }
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/api/getPersonFileByUserId',
            dataType: 'json',
            data: data,
            success: function (res) {
                var data = res;
                $(".leave_person").val(data.staffName);
                $(".leave_person").attr("user_id", data.userId);
                $(".leaveDept").val(data.deptName);
                $(".leaveDept").attr("deptid", data.deptId);
            }
        })
    })

    //新建离职，进行保存
    $("#leave_baocun").click(function () {
        var array = $(".leaveTestNull");
        var arrayText=$(".leaveTestText");
        for (var i = 0; i < array.length; i++) {
            if (array[i].value == "") {
                var tmp=$(arrayText[i]).text();
                if(tmp.indexOf("：")>=0){
                    tmp=tmp.substring(0,tmp.length-1);
                }
                $.layerMsg({content:tmp+"不能为空",icon: 2}, function(){
                });
                return;
            }
        }
        var isBlackList = $(".isBlackList").attr("checked");
        var data = {
            'leavePerson': $(".leave_person").attr("user_id"),
            'position': $(".position").val(),
            'quitType': $(".quitType").val(),
            'applicationDate': $(".applicationDate").val(),
            'quitTimePlan': $(".quitTimePlan").val(),
            'quitTimeFact': $(".quitTimeFact").val(),
            'lastSalaryTime': $(".lastSalaryTime").val(),
            'leaveDept': $(".leaveDept").attr("deptid"),
            'salary': $(".salary").val(),
            'isBlackList': isBlackList,
            'trace': $(".trace").val(),
            'remark': $(".leaveBeizhu").val(),
            'quitReason': $(".quitReason").val()
        }
        $.ajax({
            type: 'get',
            url: '<%=basePath%>hr/leave/addLeaveInfor',
            dataType: 'json',
            data: data,
            success: function (res) {
                var data = res;
                if (res.flag) {
                    $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                       /* $('.childQuery').show().siblings().hide();*/
                    });
                    window.location.reload();
                }
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

    //身份证号进行校验STAFF_CARD_NO
    function  check(){
        var cardId=$("#STAFF_CARD_NO").val();
        var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if(cardId!=''){
            if(!regIdNo.test(cardId)){
                alert('身份证号填写有误');
                return false;
            }
            //出生日期
            var birth=cardId.substring(6, 10) + "-" + cardId.substring(10, 12) + "-" + cardId.substring(12, 14);
            $("#STAFF_BIRTH").val(birth);
            //年龄
            var myDate = new Date();
            var month = myDate.getMonth() + 1;
            var day = myDate.getDate();
            var age = myDate.getFullYear() - cardId.substring(6, 10) - 1;
            if (cardId.substring(10, 12) < month || cardId.substring(10, 12) == month && cardId.substring(12, 14) <= day) {
                age++;
            }
            $("[name='STAFF_AGE']").val(age);
            //生肖
            var shengxiao=Calculator.shengxiao(birth);
            $("#animal_id").val(shengxiao);
            //星座
            var xingzuo=Calculator.xingzuo(cardId.substring(10, 12),cardId.substring(12, 14) );
            $("#sign_id").val(xingzuo);
        }
    }

</script>
</body>
</html>

