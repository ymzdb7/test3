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
    <title><fmt:message code="event.th.AddVehicle" /></title>
    <link rel="stylesheet" type="text/css" href="../../css/vehicle/addVehicle.css"/>
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">

    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
</head>
<style>
    .header{
        line-height: 60px;
    }
    .title{
        margin-left: 30px;
        height: 50px;
    }
    .big3{
        font-family: "微软雅黑";
        font-size: 22px;
        line-height: 45px;
        color: #494d59;
    }
    .main{
        margin-top: 20px;
    }
</style>
<body>
<div class="content">
    <div class="header">
        <div class="title">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/deptApprove.png" align="absmiddle">
            <span class="big3"><fmt:message code="event.th.AddVehicle" /></span>
        </div>
    </div>
    <div class="main">
        <input name="vId" id="vId" type="hidden">
        <form name="editVehicleForm" id="editVehicleForm" enctype="multipart/form-data">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td><fmt:message code="event.th.LicensePlateNumber" />：</td>
                <td><input type="text" name="vNum" id="vNum" value="" /> <span style="color: red;">*&nbsp;&nbsp;<fmt:message code="event.th.(required)" /></span></td>
                <td rowspan="6" width="30%"></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.BrandModel" />：</td>
                <td><input type="text" name="vModel" id="vModel" value="" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleInformation" />：</td>
                <td>
                    <div class="div_input"><span><fmt:message code="event.th.displacement" />：</span><input type="text" name="vDisplacement" id="vDisplacement" value="" /></div>
                    <div class="div_input"><span><fmt:message code="event.th.BodyColor" />：</span><input type="text" name="vColor" id="vColor" value="" /></div>
                    <div class="div_input"><span><fmt:message code="event.th.SeatNumber" />：</span><input type="text" name="vSeating" id="vSeating" value="" /></div>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.EngineInformation" />：</td>
                <td>
                    <div class="div_input"><span><fmt:message code="event.th.RearFrame6" />：</span><input type="text" name="vFrame" id="vFrame" value="" /></div>
                    <div class="div_input"><span><fmt:message code="event.th.7RegistrationCertificate" />：</span><input type="text" name="vCertification" id="vCertification" value="" /></div>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.EngineNumber" />：</td>
                <td><input type="text" name="vEngineNum" id="vEngineNum" value="" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehicleProperty" />：</td>
                <td>
                    <select name="vNature" id="vNature">

                    </select>
                    <span><fmt:message code="event.th.VehicleSystem" />-&gt;<fmt:message code="event.th.moduleSettings" /> </span>
                </td>
            </tr>
            <tr>
                <td> <fmt:message code="event.th.VehicleType" />：</td>
                <td colspan="2">
                    <select name="vType" id="vType">

                    </select>
                    <span><fmt:message code="event.th.VehicleSystem" />-&gt;<fmt:message code="event.th.moduleSettings" /></span>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DepositoryDepartment" />：</td>
                <td colspan="2">
                    <div id="depart">
                        <textarea name="vDepart1" id="vDepart1" rows="" cols="" deptid=""></textarea>
                        <a href="javascript:;" id="addVDepartBtn" onclick="addDept('vDepart1')"><fmt:message code="global.lang.select" /></a>
                        <a href="javascript:;" id="clearVDepartBtn" onclick="emptyDept('vDepart1')"><fmt:message code="global.lang.empty" /></a>
                        <span><fmt:message code="hr.th.PhoneNumber" />：</span>
                        <input type="text" name="vDepartPhone" id="vDepartPhone" size="11" maxlength="25" class="BigInput" value="">
                    </div>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.OwnerVehicle" />：</td>
                <td colspan="2">
                    <div id="depart">
                        <textarea name="vOnwer1" id="vOnwer1" rows="" cols="" user_id=""></textarea>
                        <a href="javascript:;" id="addVOnwerBtn" onclick="addUser('vOnwer1')"><fmt:message code="global.lang.select" /></a>
                        <a href="javascript:;" id="clearVOnwerBtn" onclick="emptyUser('vOnwer1')"><fmt:message code="global.lang.empty" /></a>
                        <span><fmt:message code="hr.th.PhoneNumber" />：</span>
                        <input type="text" name="vOnwerPhone" id="vOnwerPhone" size="11" maxlength="25" class="BigInput" value="">
                    </div>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.LongTermUser" />：</td>
                <td colspan="2">
                    <div id="depart">
                        <textarea name="vCaruser1" id="vCaruser1" rows="" cols="" user_id=""></textarea>
                        <a href="javascript:;" id="addVCaruserBtn" onclick="addUser('vCaruser1')"><fmt:message code="global.lang.select" /></a>
                        <a href="javascript:;" id="clearVCaruserBtn" onclick="emptyUser('vCaruser1')"><fmt:message code="global.lang.empty" /></a>
                        <span><fmt:message code="hr.th.PhoneNumber" />：</span>
                        <input type="text" name="vCaruserPhone" id="vCaruserPhone" size="11" maxlength="25" class="BigInput" value="">
                    </div>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Driver" />：</td>
                <td colspan="2">
                    <div id="">
                        <textarea name="vDriver1" id="vDriver1" rows="" cols="" user_id=""></textarea>
                        <a href="javascript:;" id="addVDriverBtn" onclick="addUser('vDriver1')"><fmt:message code="global.lang.select" /></a>
                        <a href="javascript:;" id="clearVDriverBtn" onclick="emptyUser('vDriver1')"><fmt:message code="global.lang.empty" /></a>
                        <span><fmt:message code="hr.th.PhoneNumber" />：</span>
                        <input type="text" name="vPhoneNo" id="vPhoneNo" size="11" maxlength="25" class="BigInput" value="">
                      <%--  <a href="javascript:;" style="float: right;line-height: 45px;">添加司机</a>--%>
                    </div>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.PurchasePrice" />：</td>
                <td colspan="2"><input type="text" name="vPrice" id="vPrice" value="" /></td>
            </tr>
            <tr>
                <td><fmt:message code="evvent.th.PurchasePrice" />：</td>
                <td colspan="2"><input type="text" name="vTax" id="vTax" value="" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.FinancialBorrowing" />：</td>
                <td colspan="2"><input type="text" name="vPay" id="vPay" value="" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.VehiclePhotosUpload" />：</td>
                <td colspan="2"><input type="file" name="" id="" value="<fmt:message code="system.th.Select" />" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Purchase" />：</td>
                <td colspan="2"><input type="text" name="vDate" id="vDate" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" /></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.InitialMileage" />：</td>
                <td colspan="2"><input type="text" name="vMileage" id="vMileage" value=""/></td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.AnnualInspectionDate" />：</td>
                <td colspan="2">
                    <input type="text" name="vMot" id="vMot" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" />
                    <span><fmt:message code="event.th.ExpirationReminder" />：</span>
                    <input type="text" name="vMotSms" id="vMotSms" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" />
                    <input type="checkbox" name="" id="vMotSms1" value="" />
                    <span><fmt:message code="notice.th.remindermessage" /></span>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.DateInsurance" />：</td>
                <td colspan="2">
                    <input type="text" name="vInsure" id="vInsure" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" />
                    <span><fmt:message code="event.th.ExpirationReminder" />：</span>
                    <input type="text" name="vInsureSms" id="vInsureSms" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" />
                    <input type="checkbox" name="vInsureSms1" id="vInsureSms1" value="" />
                    <span><fmt:message code="notice.th.remindermessage" /></span>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.BusinessInsuranceDate" />：</td>
                <td colspan="2">
                    <input type="text" name="vBinsure" id="vBinsure" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})"/>
                    <span><fmt:message code="event.th.ExpirationReminder" />：</span>
                    <input type="text" name="vBinsureSms" id="vBinsureSms" value="" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" />
                    <input type="checkbox" name="vBinsureSms1" id="vBinsureSms1" value="" />
                    <span><fmt:message code="notice.th.remindermessage" /></span>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Application(Department)" />：</td>
                <td colspan="2">
                    <textarea name="deptRange1" id="deptRange1" rows="" cols="" deptid=""></textarea>
                    <a href="javascript:;" id="addDeptRangeBtn" onclick="addDepts('deptRange1')"><fmt:message code="global.lang.select" /></a>
                    <a href="javascript:;" id="clearDeptRangeBtn" onclick="emptyDept('deptRange1')"><fmt:message code="global.lang.empty" /></a>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Application(personnel)" />：</td>
                <td colspan="2">
                    <textarea name="userRange1" id="userRange1" rows="" cols="" user_id=""></textarea>
                    <a href="javascript:;" id="AddUserRangeBtn" onclick="addUsers('userRange1')"><fmt:message code="global.lang.select" /></a>
                    <a href="javascript:;" id="clearUserRangeBtn" onclick="emptyUser('userRange1')"><fmt:message code="global.lang.empty" /></a>
                    <span><fmt:message code="event.th.Notice" /></span>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.currentState" />：</td>
                <td colspan="2">
                    <select name="vStatus" id="vStatus">

                    </select>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.Vehicl" />：</td>
                <td colspan="2">
                    <textarea name="vRecord" id="vRecord" rows="" cols="" class="bigText"></textarea>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="event.th.RecordsBorrowingReturning" />：</td>
                <td colspan="2">
                    <textarea name="vBackrecord" id="vBackrecord" rows="" cols="" class="bigText"></textarea>
                </td>
            </tr>
            <tr>
                <td><fmt:message code="journal.th.Remarks" />：</td>
                <td colspan="2">
                    <textarea name="vRemark" id="vRemark" rows="" cols="" class="bigText"></textarea>
                </td>
            </tr>
        <%--    <tr>
                <td colspan="3"><a href="javascript:;">添加新字段</a></td>
            </tr>--%>
        </table>
        </form>
        <div class="div_btn">
            <div class="save_btn"><span><fmt:message code="global.lang.save" /></span></div>
            <div class="reset_btn"><span><fmt:message code="global.lang.refillings" /></span></div>
        </div>
    </div>
</div>
</body>
</html>

<script>
    var editFlag=${editFlag};

    //时间控件
    var start = {
        format: 'YYYY-MM-DD',
    };

    //清空人员控件
    function emptyUser(id){
        $("#"+id).val("");
        $("#"+id).attr("dataid","");
        $("#"+id).attr("user_id","");
    }

    //选（单个）人员控件
    function addUser(id){
        user_id = id;
        $.popWindow("../../common/selectUser?0");
    }

    //选（多个）人员控件
    function addUsers(id){
        user_id = id;
        $.popWindow("../../common/selectUser");
    }

    //清空部门控件
    function emptyDept(id){
        $("#"+id).val("");
        $("#"+id).attr("deptid","");
    }

    //选（单个）部门控件
    function addDept(id) {
        dept_id = id;
        $.popWindow("../../common/selectDept?0");
    }

    //选（多个）部门控件
    function addDepts(id) {
        dept_id = id;
        $.popWindow("../../common/selectDept");
    }


    //进行初始化界面
    $(function () {
        //车辆性质下拉列表
        $.ajax({
            url: '/code/GetDropDownBox',
            type: 'get',
            data:{
                CodeNos:"PROPERTY"
            },
            dataType: 'json',
            success: function (obj) {
                var str='<option value=""></option>';
                var data=obj.PROPERTY;
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].codeNo+'">'+data[i].codeName+'</option>';
                }
                $("#vNature").html(str);
            }
        })

        //车辆类型下拉列表
        $.ajax({
            url: '/code/GetDropDownBox',
            type: 'get',
            data:{
                CodeNos:"VEHICLETYPE"
            },
            dataType: 'json',
            success: function (obj) {
                var str='<option value=""></option>';
                var data=obj.VEHICLETYPE;
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].codeNo+'">'+data[i].codeName+'</option>';
                }
                $("#vType").html(str);
            }
        })
        //当前状态下拉列表
        $.ajax({
            url: '/code/GetDropDownBox',
            type: 'get',
            data:{
                CodeNos:"VEHICLESTATE"
            },
            dataType: 'json',
            success: function (obj) {
                var str='';
                var data=obj.VEHICLESTATE;
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].codeNo+'">'+data[i].codeName+'</option>';
                }
                $("#vStatus").html(str);
            }
        })

        if(editFlag==1){//编辑时初始页面
            var vId=${vId};
            $(".title").html("<fmt:message code="event.th.ModifyVehicle" />");
            $.ajax({
                url: '/veHicle/getDetailVeHicle',
                type: 'get',
                data:{
                    vId:vId
                },
                dataType: 'json',
                success: function (obj) {
                    var data=obj.obj;
                    if(obj.flag){
                        $("#vId").val(data.vId);
                        $("#vNum").val(data.vNum);
                        $("#vModel").val(data.vModel);
                        $("#vDisplacement").val(data.vDisplacement);
                        $("#vColor").val(data.vColor);
                        $("#vSeating").val(data.vSeating);
                        $("#vFrame").val(data.vFrame);
                        $("#vCertification").val(data.vCertification);
                        $("#vEngineNum").val(data.vEngineNum);
                        $("#vNature").val(data.vNature);
                        $("#vType").val(data.vType);

                        $("#vDepart1").val(data.vDepartName);
                        $("#vDepart1").attr("deptid",data.vDepart);

                        $("#vOnwer1").val(data.oOnwerName);
                        $("#vOnwer1").attr("user_id",data.vOnwer);

                        $("#vCaruser1").val(data.vCaruserName);
                        $("#vCaruser1").attr("user_id",data.vCaruser);

                        $("#vDriver1").val(data.vDriverName);
                        $("#vDriver1").attr("user_id",data.vDriver);

                        $("#vPrice").val(data.vPrice);
                        $("#vTax").val(data.vTax);
                        $("#vPay").val(data.vPay);

                        $("#vDate").val(data.vDate);
                        $("#vMileage").val(data.vMileage);
                        $("#vMot").val(data.vMot);
                        $("#vMotSms").val(data.vMotSms);

                        $("#vInsure").val(data.vInsure);
                        $("#vInsureSms").val(data.vInsureSms);

                        $("#vBinsure").val(data.vBinsure);
                        $("#vBinsureSms").val(data.vBinsureSms);

                        $("#deptRange1").val(data.deptRangeName);
                        $("#deptRange1").attr("deptid",data.deptRange);

                        $("#userRange1").val(data.userRangeName);
                        $("#userRange1").attr("user_id",data.userRange);

                        $("#vStatus").val(data.vStatus);
                        $("#vRecord").val(data.vRecord);
                        $("#vBackrecord").val(data.vBackrecord);
                        $("#vRemark").val(data.vRemark);

                        //手机号码
                        $("#vPhoneNo").val(data.vPhoneNo);
                        $("#vOnwerPhone").val(data.vOnwerPhone);
                        $("#vCaruserPhone").val(data.vCaruserPhone);
                        $("#vDepartPhone").val(data.vDepartPhone);
                    }
                }
            })
        }

    })

    //保存按钮
    $(".save_btn").click(function () {
      if(editFlag==0){//添加车辆
          if(check()){
              $.ajax({
                  url:"/veHicle/getVeHicleByNum",
                  type:'post',
                  dataType:'json',
                  data:{vNum:$('#vNum').val()},
                  success:function(result){
                      if(result.flag){
                          $.layerMsg({content:"<fmt:message code="event.th.fillInAgain" />", icon: 2});
                      }
                      else{
                          $('#editVehicleForm').ajaxSubmit({
                              url:"/veHicle/addVeHicle",
                              type:'post',
                              dataType:'json',
                              data:{
                                  vDepart:$("#vDepart1").attr("deptid"),//保管部门
                                  vOnwer:$("#vOnwer1").attr("user_id"),//车辆所有人
                                  vCaruser:$("#vCaruser1").attr("user_id"),//长期使用人
                                  vDriver:$("#vDriver1").attr("user_id"),//司机
                                  deptRange:$("#deptRange1").attr("deptid"),//申请部门
                                  userRange:$("#userRange1").attr("user_id")//申请人员
                              },
                              success:function (json) {
                                  if(json.flag) {
                                      $.layerMsg({content: '<fmt:message code="url.th.addSuccess" />！', icon: 1}, function () {
                                          window.location.href='<%=basePath%>/veHicle/veHicleInfoManage';
                                      });
                                  }else{
                                      $.layerMsg({content: json.msg+'！', icon: 1}, function () {
                                      });
                                  }
                              }
                          })
                      }
                  }
              })
          }
      }else{//修改车辆
          if(check()) {
                          $('#editVehicleForm').ajaxSubmit({
                              url: "/veHicle/editVeHicle",
                              type: 'post',
                              dataType: 'json',
                              data: {
                                  vId: $("#vId").val(),
                                  vDepart: $("#vDepart1").attr("deptid"),//保管部门
                                  vOnwer: $("#vOnwer1").attr("user_id"),//车辆所有人
                                  vCaruser: $("#vCaruser1").attr("user_id"),//长期使用人
                                  vDriver: $("#vDriver1").attr("user_id"),//司机
                                  deptRange: $("#deptRange1").attr("deptid"),//申请部门
                                  userRange: $("#userRange1").attr("user_id")//申请人员
                              },
                              success: function (json) {
                                  if (json.flag) {
                                      $.layerMsg({content: '<fmt:message code="depatement.th.Modifysuccessfully" />！', icon: 1}, function () {
                                          window.location.href = '<%=basePath%>/veHicle/veHicleInfoManage';
                                      });
                                  } else {
                                      $.layerMsg({content: json.msg + '！', icon: 1}, function () {
                                      });
                                  }
                              }
                          })
          }
      }
    })

    //重填按钮
    $(".reset_btn").click(function () {
        $("#vId").val("");
        $("#vNum").val("");
        $("#vModel").val("");
        $("#vDisplacement").val("");
        $("#vColor").val("");
        $("#vSeating").val("");
        $("#vFrame").val("");
        $("#vCertification").val("");
        $("#vEngineNum").val("");
        $("#vNature").val("");
        $("#vType").val("")
        ;
        $("#vDepart1").val("");
        $("#vDepart1").attr("deptid","");

        $("#vOnwer1").val("");
        $("#vOnwer1").attr("user_id","");

        $("#vCaruser1").val("");
        $("#vCaruser1").attr("user_id","");

        $("#vDriver1").val("");
        $("#vDriver1").attr("user_id","");

        $("#vPrice").val("");
        $("#vTax").val("");
        $("#vPay").val("");

        $("#vDate").val("");
        $("#vMileage").val("");
        $("#vMot").val("");
        $("#vMotSms").val("");

        $("#vInsure").val("");
        $("#vInsureSms").val("");

        $("#vBinsure").val("");
        $("#vBinsureSms").val("");

        $("#deptRange1").val("");
        $("#deptRange1").attr("deptid","");

        $("#userRange1").val("");
        $("#userRange1").attr("user_id","");

        $("#vStatus").val("");
        $("#vRecord").val("");
        $("#vBackrecord").val("");
        $("#vRemark").val("");

        //手机号码
        $("#vPhoneNo").val("");
        $("#vOnwerPhone").val("");
        $("#vCaruserPhone").val("");
        $("#vDepartPhone").val("");
    })

    function check(){
       if($('#vNum').val()==""){
           $.layerMsg({content:"<fmt:message code="event.th.enterLicensePlateNumber" />", icon: 2});
          return false;
       }
        return true;

    }

</script>


