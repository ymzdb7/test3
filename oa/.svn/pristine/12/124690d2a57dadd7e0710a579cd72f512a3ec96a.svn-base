<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2017/5/23
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html xmlns:v="urn:schemas-microsoft-com:vml">
<head>
    <title><fmt:message code="workflow.th.designer" /></title><%--流程设计器--%>
    <?import namespace="v" implementation="#default#VML" ?>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="../../lib/GooFlow/GooFlowTheDesigner.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/flowtype/default.css"/>
    <link rel="stylesheet" href="../../css/workflow/flowsetting/processDesignTool.css">
    <%--<link rel="stylesheet" type="text/css" href="../../lib/layer/mobile/need/layer.css" media="all"/>--%>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <style>
        .GooFlow_item:hover{
            background: #a1ccff!important;
        }
        .item_focusTwo:hover{
            background: #e6a1b4!important;
        }
        .GooFlow_item.active{
            background: #8dafd9!important;
            color: #333;
        }
        .item_focusTwo.active{
            background: #cc8196!important;
            color: #333;
        }
        table .layui-form-checked span, table .layui-form-checked:hover span{
            background: #3994f7!important;
        }
        .GooFlow_head label{
            width: 244px;
        }
        .GooFlow_tool{
            width: 224px;
        }
        #flowDesignTable{
            background: none;
        }
        .GooFlow_work{
            border: none;
        }
        .GooFlow_tool{
            border-color:#d9d9d9;
        }
        .GooFlow .ico{
            cursor: pointer;
        }
        .GooFlow_item{
            cursor: pointer;
        }
        .GooFlow_item>table{
            cursor: pointer;
        }
        .GooFlow_item>table td{
            cursor: pointer;
        }
    </style>
    <script>
        var changeTheValue=true;
    </script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="../../js/base/base.js"></script>
    <script type="text/javascript" src="../../lib/layer/layer.js"></script>
    <script type="text/javascript" src="../../lib/layui-v1.0.9_rls/layui/layui.js"></script>
    <script src="../../lib/jquery.form.min.js"></script>
    <script src="../../js/workflow/flowtype/processDesignTool.js"></script>
    <script type="text/javascript" src="../../lib/GooFlow/GooFunc.js"></script>
    <script type="text/javascript" src="../../lib/GooFlow/GooFlowTheDesigner.js"></script>

    <!-- <script type="text/javascript" src="../../js/workflow/json2.js"></script> -->
    <script src="../../js/workflow/work/workform.js"></script>
    <style>
        .myForm {
            display: block;
            margin: 0px;
            padding: 0px;
            line-height: 1.5;
            border: #ccc 1px solid;
            font: 12px Arial, Helvetica, sans-serif;
            margin: 5px 5px 0px 0px;
            border-radius: 4px;
        }

        .myForm .form_title {
            background: #428bca;
            padding: 4px;
            color: #fff;
            border-radius: 3px 3px 0px 0px;
        }

        .myForm .form_content {
            padding: 4px;
            background: #fff;
        }

        .myForm .form_content table {
            border: 0px
        }

        .myForm .form_content table td {
            border: 0px
        }

        .myForm .form_content table .th {
            text-align: right;
            font-weight: bold
        }

        .myForm .form_btn_div {
            text-align: center;
            border-top: #ccc 1px solid;
            background: #f5f5f5;
            padding: 4px;
            border-radius: 0px 0px 3px 3px;
        }
        .candidatesPTwoall>div>a{
            float: left;
            width: 100%;
            line-height:28px;
        }
        .GooFlow_tool_btndown{
            width: 100%;
            border: 2px solid transparent;
            background: #d5e7f9;

            display: block;
        }
        .GooFlow_tool_btndown b{
            border:none;
        }
        .GooFlow_tool_div a b{
            display: inline-block;
            /*margin-top: 9px;*/
            margin-left: 20px;
            vertical-align: middle;
        }
        .GooFlow_tool_div a>label{
            vertical-align: middle;
            display: inline-block;
            height: 18px;
            line-height: 18px;
            font-size: 14px;
            letter-spacing: 2px;
            margin-left: 15px;
        }
        .GooFlow_tool_div a{
            height:36px;
            line-height: 36px;
            width: 100%;
            display: block;
        }
        .GooFlow_tool_btn:hover{
            border:2px solid transparent;
            background: #d5e7f9;
            -moz-border-radius: 0px;
            -webkit-border-radius: 0px;
             border-radius: 0px;
            padding: 0px;
            width: 100%;
            height: 36px;
        }
        .GooFlow_tool_btn:hover b{
            border:none;
        }
        .Toptitle img{
            margin-top:-12px;
            margin-left: 22px;
        }
        .fixedtitle{
            background:url("/img/workflow/flowsetting/xiaojiqiao.png") no-repeat ;
            width: 225px;
            height: 152px;
            position: fixed;
            bottom: 7px;
            left:4px;
        }
        .fixedtitle .textP{
            width: 100%;
            margin-top:40px;
            height: 88px;
            box-sizing: border-box;
            padding:0 15px;
            text-indent:2em;
            line-height: 18px;
        }
        .prevAndNext{
            width: 100%;
            height: 20px;
            line-height:20px;
            text-align: center;
        }
        .prevAndNext span{
            margin-left: 10px;
            font-size: 12px;
            cursor: pointer;
            position: relative;
        }
        .prevBg{
            width: 10px;
            height: 9px;
            background: url(../../img/prev.png) no-repeat;
            background-size: 100% 100%;
            position: absolute;
            left: -14px;
            top: 4px;
        }
        .nextBg{
            width: 10px;
            height: 9px;
            background: url(../../img/next.png) no-repeat;
            background-size: 100% 100%;
            position: absolute;
            left: 42px;
            top: 4px;
        }

    </style>

</head>
<body>
<div class="fixedtitle">
    <%--友情提示 ：(每个按钮信息修改后，必须需要保存.)--%>

    <p class="textP" data-num="0">

    </p>
    <p class="prevAndNext">
        <span class="prev"> <b class="prevBg"></b>上一条</span>
        <span class="next"><b class="nextBg"></b> 下一条</span>
    </p>
</div>

    <div class="showAndHide"
         style="display:none;background: #111;opacity: 0.4;position: fixed;top: 0;left: 0px;right: 0px;bottom: 0px;z-index: 999;">

    </div>
    <div id="flowDesignTable" ></div>
    <form action="/flowProcess/saveFlow" class="layui-form" id="datasave" method="post">
        <input type="hidden" id="ele_id">
        <input type="hidden" id="ele_model">
        <input type="hidden" id="ele_designerId" name="id">
        <div id="propertyForm" >
            <div class="setUpThe">
                <span class="basic"></span>
                <label><fmt:message code="workflow.th.basicsettings" /></label><%--基本设置--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl" style="display: none">
                <li>
                    <p class="candidatesPone">
                        <%--序号--%><fmt:message code="workflow.th.Serial" />
                    </p>
                    <p class="candidatesPTwo">
                        <input type="text" name="prcsId" style="width: 100%">
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                       <%-- 节点类型--%><fmt:message code="workflow.th.NodeType" />
                    </p>
                    <div class="dropDownDiv">
                        <p class="candidatesPTwo">
                            <%--<input type="text" readonly="true" value="不进行自动选择" style="cursor: pointer;"><span class="xiala"><b></b></span>--%>
                            <%--<input type="hidden">--%>
                                <select name="prcsType" lay-verify="">
                                    <option value="0"><fmt:message code="workflow.th.Stepnode" /></option><%--步骤节点--%>
                                    <%--<option value="1"><fmt:message code="workflow.th.SelfProcessNode" /></option>&lt;%&ndash;自流程节点&ndash;%&gt;--%>
                                    <%--<option value="2"><fmt:message code="workflow.th.ExternalFlowNode" /></option>&lt;%&ndash;外部流转节点&ndash;%&gt;--%>
                                    <option value="4">循环节点</option><%--步骤节点--%>
                                </select>
                        </p>
                        <%--<ol class="dropDown">--%>
                            <%--<li>--%>
                                <%--<span>步骤节点</span>--%>
                                <%--<input type="hidden" value="1">--%>
                            <%--</li>--%>
                            <%--<li>--%>
                                <%--<span>子流程节点</span>--%>
                                <%--<input type="hidden" value="2">--%>
                            <%--</li>--%>
                            <%--<li>--%>
                                <%--<span>柔性节点</span>--%>
                                <%--<input type="hidden" value="3">--%>
                            <%--</li>--%>
                        <%--</ol>--%>
                    </div>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--步骤名称--%><fmt:message code="workflow.th.StepName" />
                    </p>
                    <p class="candidatesPTwo" style="margin-bottom: 20px">
                        <input type="text" name="prcsName"  style="width: 100%">
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--下一步骤--%><fmt:message code="workflow.th.nextstep" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 20px;">
                        <ul id="candidatesPoneli" style="height: 126px;">

                        </ul>
                        <div style="float:left;">
                            <a href="javascript:;" class="bottomsteps" data-field="0"><fmt:message code="notice.th.chose" /></a><%--选择--%>
                            <input type="hidden" name="prcsTo">
                        </div>
                    </div>

                </li>
            </ul>
            <div class="setUpThe">
                <span class="agent"></span>
                <label><fmt:message code="workflow.th.Manager" /></label><%--经办人--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl">
                <li>
                    <p class="candidatesPone">
                       <%-- 授权范围（人员）--%><fmt:message code="workflow.th.AuthorizationPerson" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 4px;">
                        <%--<input type="text" id="" readonly="true">--%>
                        <textarea name="prcsUserName" class="theControlData" id="query_userId" readonly="true"></textarea>
                        <input type="hidden" name="prcsUser">
                        <div style="float:left;">
                            <a href="javascript:;" data-num="1" class="theCandidates"><fmt:message code="global.lang.add" /></a><%--添加--%>
                            <a href="javascript:;"  class="theCandidates deleteTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                        </div>
                    </div>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--授权范围（部门）--%><fmt:message code="workflow.th.AuthorizationDepartment" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 4px;">
                        <%--<input type="text" id="" readonly="true">--%>
                        <textarea name="prcsDeptName" class="theControlData" id="department" readonly="true" ></textarea>
                        <input type="hidden" name="prcsDept">
                        <div style="float:left;">
                            <a href="javascript:;" data-num="2" class="theCandidates"><fmt:message code="global.lang.add" /></a><%--添加--%>
                            <a href="javascript:;"  class="theCandidates deleteTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                        </div>
                    </div>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--授权范围（角色）--%><fmt:message code="workflow.th.AuthorizationScopeRole" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 4px;">
                        <%--<input type="text" id="" readonly="true">--%>
                        <textarea name="prcsPrivName" class="theControlData" id="theScopeOf" readonly="true"></textarea>
                        <input type="hidden" name="prcsPriv">
                        <div style="float:left;">
                            <a href="javascript:;" data-num="3" class="theCandidates"><fmt:message code="global.lang.add" /></a><%--添加--%>
                            <a href="javascript:;"  class="theCandidates deleteTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                        </div>
                    </div>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--会签人设置--%><fmt:message code="workflow.th.WillBeSetUp" />
                    </p>
                    <p class="candidatesPothree">

                        <input type="radio" name="signType" value="0" title="<fmt:message code="workflow.th.NotAllowed" />"><%--不允许--%>

                    </p>
                    <p class="candidatesPothree">

                            <input type="radio" name="signType" value="1" checked="true" title="<fmt:message code="workflow.th.ThisStepManager" />"><%--本步骤经办人--%>

                    </p>
                    <p class="candidatesPothree">

                            <input type="radio" name="signType" value="2" title="<fmt:message code="userInfor.th.Allpersonnel" />"><%--全部人员--%>

                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--是否允许会签人加签--%><fmt:message code="workflow.th.WhetherItIsAllowedToSign" />
                    </p>
                    <p class="candidatesPothree">

                            <input type="radio" checked="true" name="countersign" value="0" title='<fmt:message code="workflow.th.NotAllowed" />'><%--不允许--%>

                    </p>
                    <p class="candidatesPothree" style="margin-bottom: 10px">

                            <input type="radio" name="countersign"  value="1" title='<fmt:message code="workflow.th.Allowed" />'><%--允许--%>

                    </p>
                </li>
            </ul>
            <div class="setUpThe">
                <span class="candidates"></span>
                <label><fmt:message code="workflow.th.IntelligentSelection" /></label><%--智能选人--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl hiddenul" style="display: none">
                <li>
                    <p class="candidatesPone">
                        <%--选人过滤规则--%><fmt:message code="workflow.th.FilterRules" />
                    </p>
                    <p class="candidatesPTwo">
                    <%--<input type="text" readonly="true" value="允许选择全部指定的经办人"><span class="xiala"><b></b></span>--%>
                        <select name="userFilter"  lay-filter="candidatesfilters"  lay-verify="">
                            <option value=""><fmt:message code="hr.th.PleaseSelect" /></option><%--请选择--%>
                            <option value=""><fmt:message code="workflow.th.AllowsYouToSelect" /></option><%--允许选择全部指定的经办人--%>
                            <option value="1"><fmt:message code="workflow.th.OnlyAllowToSelTheDeparManager" /></option><%--只允许选择本部门经办人--%>
                            <option value="8"><fmt:message code="workflow.th.OnlySelTheAuxiDepartManager" /></option><%--只允许选择本辅助部门经办人--%>
                            <option value="5"><fmt:message code="workflow.th.OnlySelTheSameDepartManager" /></option><%--只允许选择同级部门经办人--%>
                            <option value="3"><fmt:message code="workflow.th.OnlyAllowToChoHigherDepartManager" /></option><%--只允许选择上级部门经办人--%>
                            <option value="4"><fmt:message code="workflow.th.OnlySelSubDepartManagers" /></option><%--只允许选择下级部门经办人--%>
                            <option value="12"><fmt:message code="workflow.th.OnlydepartAndSubDepartManagers" /></option><%--只允许选择本部门和下级部门经办人--%>
                            <option value="6"><fmt:message code="workflow.th.OnlySelDesignDepartManager" /></option><%--只允许选择指定部门经办人--%>
                            <%--<option value="9"><fmt:message code="workflow.th.AllowOnlySelDesignAssistantManager" /></option>&lt;%&ndash;只允许选择指定辅助部门经办人&ndash;%&gt;--%>
                            <option value="2"><fmt:message code="workflow.th.OnlyAllowRoleManagerToBeSelected" /></option><%--只允许选择本角色经办人--%>
                          <%--  <option value="10"><fmt:message code="workflow.th.OnlySelAuxiRoleManager" /></option>&lt;%&ndash;只允许选择本辅助角色经办人&ndash;%&gt;--%>
                            <option value="7"><fmt:message code="workflow.th.OnlySeleDesignRoleManager" /></option><%--只允许选择指定角色经办人--%>
                           <%-- <option value="11"><fmt:message code="workflow.th.AllowOnlySelSecondRoleManager" /></option>&lt;%&ndash;只允许选择指定辅助角色经办人&ndash;%&gt;--%>
                        </select>
                    </p>
                    <div class="departmentAgent">
                        <p class="candidatesPone"><fmt:message code="sys.th.DesignatedDepartment" /></p><%--指定部门--%>
                        <div class="candidatesPTwoall">
                            <textarea name="" class="theControlData" id="departmentAgent" readonly="true"></textarea>
                            <input type="hidden" name="userFilterPrcsDept">
                            <div style="float: left;line-height: 25px;">
                                <a href="javascript:;" style="display: block" class="theCandidates" data-num="2"><fmt:message code="global.lang.add" /></a><%--添加--%>
                                <a href="javascript:;" style="display: block" class="emptyTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                            </div>
                        </div>
                    </div>
                    <div class="auxiliaryDepartmentAgent">
                        <p class="candidatesPone"><fmt:message code="workflow.th.SpecifyAuxiliaryDepartment" /></p><%--指定辅助部门--%>
                        <div class="candidatesPTwoall">
                            <textarea name="" class="theControlData" id="auxiliaryDepartmentAgent" readonly="true"></textarea>
                            <input type="hidden" name="userFilterPrcsDeptOther">
                            <div style="float: left;line-height: 25px" >
                                <a href="javascript:;" style="display: block" class="theCandidates" data-num="2"><fmt:message code="global.lang.add" /></a><%--添加--%>
                                <a href="javascript:;" style="display: block" class="emptyTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                            </div>
                        </div>
                    </div>
                    <div class="theSpecifiedRole">
                        <p class="candidatesPone"><fmt:message code="workflow.th.SpecifiesTheRole" /></p><%--指定角色--%>
                        <div class="candidatesPTwoall">
                            <textarea name="" class="theControlData" id="theSpecifiedRole" readonly="true"></textarea>
                            <input type="hidden" name="userFilterPrcsPriv">
                            <div style="float: left;line-height: 25px">
                                <a href="javascript:;" style="display: block" class="theCandidates" data-num="3"><fmt:message code="global.lang.add" /></a><%--添加--%>
                                <a href="javascript:;" style="display: block" class="emptyTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                            </div>
                        </div>
                    </div>
                    <div class="assignRole">
                        <p class="candidatesPone"><fmt:message code="workflow.th.SpecifiesSecondaryRole" /></p><%--指定辅助角色--%>
                        <div class="candidatesPTwoall">
                            <textarea name="" class="theControlData" id="assignRole" readonly="true"></textarea>
                            <input type="hidden" name="userFilterPrcsPrivOther">
                            <div style="float: left;line-height: 25px">
                                <a href="javascript:;" style="display: block" class="theCandidates" data-num="3"><fmt:message code="global.lang.add" /></a><%--添加--%>
                                <a href="javascript:;" style="display: block" class="emptyTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--自动选择人规则--%><fmt:message code="workflow.th.AutoSelPeopleRules" />
                    </p>
                    <p class="candidatesPTwo" style="margin-bottom: 20px">
                        <%--<input type="text" readonly="true" value="不进行自动选择"><span class="xiala"><b></b></span>--%>
                            <select name="autoType" lay-filter="automaticCandidateTwo" lay-verify="">
                                <option value=""><fmt:message code="hr.th.PleaseSelect" /></option><%--请选择--%>
                                <option value=""><fmt:message code="workflow.th.NoAutoSel" /></option><%--不进行自动选择--%>
                                <option value="1"><fmt:message code="workflow.th.AutoSelProcessSponsors" /></option><%--自动选择流程发起人--%>
                                <option value="2"><fmt:message code="workflow.th.AutoSelDepartHead" /></option><%--自动选择本部门主管--%>
                               <%-- <option value="3"><fmt:message code="workflow.th.SpecifiesAutoSelDefaultPerson" /></option>--%><%--指定自动选择默认人员--%>
                                <option value="4"><fmt:message code="workflow.th.AutoSelSupervisorHigherLevel" /></option><%--自动选择上级主管领导--%>
                                <option value="5"><fmt:message code="workflow.th.AutoSelDepart" /></option><%--自动选择一级部门主管--%>
                                <option value="6"><fmt:message code="workflow.th.AutoSelSupervisorCharge" /></option><%--自动选择上级分管领导--%>
                               <%-- <option value="7"><fmt:message code="workflow.th.SelByFormField" /></option>&lt;%&ndash;按表单字段选择&ndash;%&gt;--%>
                               <%-- <option value="8"><fmt:message code="workflow.th.AutoSelSpecifiedStepOrganizer" /></option>&lt;%&ndash;自动选择指定步骤主办人&ndash;%&gt;--%>
                                <option value="9"><fmt:message code="workflow.th.AutoSelThisDepartAssistant" /></option><%--自动选择本部门助理--%>
                            <%--    <option value="10"><fmt:message code="workflow.th.AutoSelQuaPersDepart" /></option>&lt;%&ndash;自动选择本部门内符合条件所有人员&ndash;%&gt;
                                <option value="11"><fmt:message code="workflow.th.AutoSelAllQuaPerWithinLevel" /></option>&lt;%&ndash;自动选择本一级部门内符合条件所有人员&ndash;%&gt;
                                <option value="12"><fmt:message code="workflow.th.AutoSelDesignDepartManager" /></option>&lt;%&ndash;自动选择指定部门主管&ndash;%&gt;
                                <option value="13"><fmt:message code="workflow.th.AutoSelDesignDepartAssistant" /></option>&lt;%&ndash;自动选择指定部门助理&ndash;%&gt;
                                <option value="14"><fmt:message code="workflow.th.AutoSelDesigDepartHigherLevelLeadership" /></option>&lt;%&ndash;自动选择指定部门上级主管领导&ndash;%&gt;
                                <option value="15"><fmt:message code="workflow.th.AutoSelDesignDepartHighLevelChargeOfLeadership" /></option>&lt;%&ndash;自动选择指定部门上级分管领导&ndash;%&gt;
--%>
                            </select>
                    </p>
                    <div class="autoBaseUser">
                        <p class="candidatesPone">
                           <%-- 部门针对对象--%><fmt:message code="workflow.th.DepartForObject" />
                        </p>
                        <p class="candidatesPTwo" style="margin-bottom: 20px">
                            <%--<input type="text" readonly="true" value="不进行自动选择"><span class="xiala"><b></b></span>--%>
                            <select name="autoBaseUser" lay-verify="">
                                <option value="0"><fmt:message code="attend.th.CurrentStep" /></option><%--当前步骤--%>
                            </select>
                        </p>
                    </div>
                    <div class="optionalDepartmentAgent" >
                            <p class="candidatesPone"><fmt:message code="sys.th.DesignatedDepartment" /></p><%--指定部门--%>
                            <div class="candidatesPTwoall" style="margin-bottom: 20px">
                                <textarea name="" class="theControlData" id="optionalDepartmentAgent" readonly="true"></textarea>
                                <input type="hidden" name="autoDept">
                                <div style="float: left;line-height: 25px;">
                                    <a href="javascript:;" style="display: block" class="theCandidates" data-num="2"><fmt:message code="notice.th.chose" /></a><%--选择--%>
                                    <a href="javascript:;" class="emptyTwo"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                                </div>
                            </div>
                    </div>
                    <div class="specifyTheHost">
                        <p class="candidatesPone"><fmt:message code="sup.th.Sponsor" /></p><%--主办人--%>
                        <input type="text" id="xuanzezhuban" readonly="true" name="autoUserOp" style="width: 60%;margin-bottom: 12px;background: #eee;border: 1px solid #ccc;border-radius: 4px">
                        <a href="javascript:;" class="xuanzezhuban" style="font-size: 12px;color: #3994f7;"><fmt:message code="notice.th.chose" /></a>
                        <a href="javascript:;" class="qingchuzhuban" style="font-size: 12px;color: #3994f7;"><fmt:message code="global.lang.empty" /></a>
                        <div class="candidatesPTwoall">
                            <textarea name="" class="theControlData" id="specifyTheHost" readonly="true"></textarea>
                            <input type="hidden" name="autoUser">
                            <div style="float: left;line-height: 25px;">
                                <a href="javascript:;"  style="margin-right: 24px;" class="theCandidates" data-num="1"><fmt:message code="dem.th.AppointedAgent" /></a><%--指定经办/主办人--%>
                                <a href="javascript:;"></a><%--清空--%>
                            </div>
                        </div>
                    </div>
                    <div class="oneTheHost">
                        <p class="candidatesPone"><fmt:message code="workflow.th.AccordToTheFormFieldDecByDefSponsor" /></p><%--根据表单字段决定默认办理人(第一个作为主办人)--%>
                        <div class="candidatesPTwoall">
                            <ul style="height: 126px;margin-bottom: 20px"></ul>
                            <div style="float: left">
                                <a href="javascript:;" class="bottomsteps" data-field="1"><fmt:message code="global.lang.select" /></a><%--选择--%>

                                <input type="hidden" name="ITEM_ID">
                            </div>
                        </div>
                    </div>
                    <div class="stepsTwos">
                        <p class="candidatesPone">
                            <%--请指定步骤--%><fmt:message code="workflow.th.PleaseSpecifySteps" />
                        </p>
                        <p class="candidatesPTwo" style="margin-bottom: 20px">
                            <%--<input type="text" readonly="true" value="不进行自动选择"><span class="xiala"><b></b></span>--%>
                            <select name="AUTO_PRCS_USER" lay-verify="">
                                <option value=""><fmt:message code="hr.th.PleaseSelect" /></option><%--请选择--%>

                            </select>
                        </p>
                    </div>
                </li>
            </ul>
            <div class="setUpThe">
                <span class="flowSet"></span>
                <label><fmt:message code="workflow.th.FlowSettings" /></label><%--流转设置--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl" style="display: none">
                <li>
                    <p class="candidatesPone">
                        <%--主办人相关选项--%><fmt:message code="workflow.th.OrgRelatedOptions" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="topDefault" type="radio"  value="0" checked="true"  title='<fmt:message code="workflow.th.ClearlySpeciTheSponsor" />'></label><%--明确指定主办人--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="topDefault" type="radio" value="2" title='<fmt:message code="workflow.th.NoSponsorWillSign" />'>	</label><%--无主办人会签--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="topDefault" type="radio" value="1" title='<fmt:message code="workflow.th.TheFirstRecipientIsTheSponsor" />'>	</label><%--先接收者为主办人--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                       <%-- 是否允许修改主办人相关选项--%><fmt:message code="workflow.th.whetherAllowChangesToOrgRelatedOptions" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="userLock" type="radio" value="0" title="<fmt:message code="workflow.th.NotAllowed" />"></label>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="userLock" type="radio" checked="true" value="1" title="<fmt:message code="workflow.th.Allowed" />">	</label>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--是否允许会签--%><fmt:message code="workflow.th.whetherItIsAllowedToSign" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="feedback" type="radio" checked="true" value="0" lay-filter="feedbackS" title='<fmt:message code="workflow.th.PermissionToSign" />'></label><%--允许会签--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="feedback" type="radio" value="1" lay-filter="feedbackS" title='<fmt:message code="workflow.th.forbiddenToSign" />'></label><%--禁止会签--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="feedback" type="radio" value="2" lay-filter="feedbackS" title='<fmt:message code="workflow.th.ForcedToSign" />'></label><%--强制会签--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--会签意见可见性--%><fmt:message code="workflow.th.signMeetingVisibility" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="signlook" type="radio" value="0" checked="true" title='<fmt:message code="workflow.th.alwaysVisible" />'></label><%--总是可见--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="signlook" type="radio" value="1" title='<fmt:message code="workflow.th.thisStepIsNotVisibleManager" />'></label><%--本步骤经办人之间不可见--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input name="signlook" type="radio" value="2" title='<fmt:message code="workflow.th.NotVisibleForOtherSteps" />'></label><%--针对其他步骤不可见--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--经办人未办理完毕时是否允许主办人强制转交--%><fmt:message code="workflow.th.wheManNotAllow" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" checked="true" value="1" name="turnPriv" title='<fmt:message code="workflow.th.Allowed" />'></label><%--允许--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="turnPriv" value="0" title='<fmt:message code="workflow.th.NotAllowed" />'></label><%--不允许--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--是否允许退回--%><fmt:message code="workflow.th.whetherAllowReturn" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="allowBack" checked="true" value="0" title='<fmt:message code="workflow.th.NotAllowed" />'></label><%--不允许--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="allowBack" value="1" title='<fmt:message code="workflow.th.AllowReturnPreviouStep" />'></label><%--允许退回上一步骤--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="allowBack" value="2" title='<fmt:message code="workflow.th.AllowPreStepsReturned" />'></label><%--允许退回之前步骤--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--是否允许并发--%><fmt:message code="workflow.th.WhetherAllowConcurrent" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="syncDeal" value="0" checked="true" title='<fmt:message code="workflow.th.Prohibitconcurrency" />'></label><%--禁止并发--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="syncDeal" value="1" title='<fmt:message code="workflow.th.AllowConcurrent" />'></label><%--允许并发--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="syncDeal" value="2" title='<fmt:message code="workflow.th.ForcedConcurrent" />'></label><%--强制并发--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--并发合并选项--%><fmt:message code="workflow.th.ConcurrentMergeOptions" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="gatherNode" checked="true" value="0" title='<fmt:message code="workflow.th.NonCompulsoryMerger" />'></label><%--非强制合并--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="gatherNode" value="1" title='<fmt:message code="workflow.th.ForcedMerger" />'></label><%--强制合并--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--传阅设置--%><fmt:message code="workflow.th.CirculateSettings" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="viewPriv" value="1" title='<fmt:message code="userManagement.th.AllowYunXu" />'></label><%--允许--%>
                    </p>
                    <p class="candidatesPothree" style="margin-bottom: 10px">
                        <label><input type="radio" name="viewPriv" checked="true" value="0" title='<fmt:message code="workflow.th.NotAllowed" />'></label><%--不允许--%>
                    </p>
                </li>
            </ul>

            <div class="setUpThe" id="canWriteField">
                <span class="canWriteField"></span>
                <label><fmt:message code="workflow.th.WriteableField" /></label><%--可写字段--%>
                <input type="hidden" name="prcsItemTwo">
                <input type="hidden" name="imguploadPriv">
                <input type="hidden" name="fileuploadPriv">
                <b class="notstart"></b>
            </div>
            <div class="setUpThe">
                <span class="confidentialFields"></span>
                <label><fmt:message code="workflow.th.ConfidentialField" /></label><%--保密字段--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl">
                <li>
                    <p class="candidatesPone">
                        <%--编辑保密字段--%><fmt:message code="workflow.th.EditTheSecurityField" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 20px;">
                        <ul style="height: 126px" id="hiddenItem"></ul>
                        <div style="float: left">
                            <a href="javascript:;" class="bottomsteps" data-field="1"><fmt:message code="notice.th.chose" /></a><%--选择--%>
                            <a href="javascript:viod(0)" class="QKone"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                            <input type="hidden" name="hiddenItem">
                        </div>
                    </div>
                </li>
            </ul>
            <div class="setUpThe">
                <span class="requiredFields"></span>
                <label><fmt:message code="workflow.th.RequiredField" /></label><%--必填字段--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl">
                <li>
                    <p class="candidatesPone">
                        <%--编辑必填字段--%><fmt:message code="workflow.th.EditTheRequiredFields" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 20px;">
                        <ul style="height: 126px" id="requiredItem"></ul>

                        <div style="float: left">
                            <a href="javascript:;" class="bottomsteps" data-field="1"><fmt:message code="global.lang.select" /></a><%--选择--%>
                            <a href="javascript:viod(0)" class="QKone"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                            <input type="hidden" name="requiredItem">
                        </div>
                    </div>
                </li>
            </ul>
            <div class="setUpThe" id="conditions">
                <span class="conditionsSet"></span>
                <label><fmt:message code="workflow.th.ConditionSetting" /></label><%--条件设置--%>
                <input type="hidden" name="settlementOfCondition">
                <b class="notstart"></b>
            </div>
            <div class="setUpThe">
                <span class="dealWithTime"></span>
                <label><fmt:message code="workflow.th.TimeLimit" /></label><%--办理时限--%>
                <b class="notstart"></b>
            </div>
            <ul class="candidatesUl" style="display: none">
                <li>
                    <p class="candidatesPoform" style="padding-top: 20px;">
                        <input type="text" name="timeOut" style="width: 78%">
                        <span class="btnTime" data-type="hour" style="cursor: pointer;width:
17%">
                        <fmt:message code="meet.th.hour" />
                    </span><%--小时--%>
                    </p>
                    <p class="candidatesPone">
                       <%-- 是否允许转交时设置办理时限--%><fmt:message code="workflow.th.WheToSetTheProceTimeLimit" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="timeOutModify" value="0" title='<fmt:message code="userManagement.th.AllowYunXu" />'></label><%--允许--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="timeOutModify" checked="true" value="1" title='<fmt:message code="workflow.th.NotAllowed" />'></label><%--不允许--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--超时计算方法--%><fmt:message code="workflow.th.TimeoutCalculationMethod" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="timeOutType" checked="true" value="0" title='<fmt:message code="workflow.th.ThisStepStartsTimer" />'></label><%--本步骤接收后开始计时--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="timeOutType"  value="1" title='<fmt:message code="workflow.th.TheLastStepStarts" />'></label><%--上一步骤转交后开始计时--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--工作天数换算方式--%><fmt:message code="workflow.th.WorkDaysConverMethod" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="workingdaysType" checked="true" value="0" title='<fmt:message code="workflow.th.24hoursADay" />'></label><%--24小时为一天--%>
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="workingdaysType"  value="1" title='<fmt:message code="workflow.th.WorkTypeInd" />'></label><%--按个人排班类型工作时长为一天--%>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--是否排除非工作时段(按排班类型)--%><fmt:message code="workflow.th.WheExcluNonHours" />
                    </p>
                    <p class="candidatesPothree">
                        <label><input type="radio" name="timeOutAttend" checked="true"  value="0" title='<fmt:message code="global.lang.no" />'></label><%--否--%>
                    </p>
                    <p class="candidatesPothree" style="margin-bottom: 10px">
                        <label><input type="radio" name="timeOutAttend" value="1" title='<fmt:message code="global.lang.yes" />'></label><%--是--%>
                    </p>
                </li>
            </ul>
            <div class="setUpThe" id="theTrigger">
                <span class="theTrigger"></span>
                <label><fmt:message code="workflow.th.trigger" /></label><%--触发器--%>
                <b class="notstart"></b>
            </div>
            <%--<div class="setUpThe">--%>
                <%--<span class="remindSet"></span>--%>
                <%--<label><fmt:message code="workflow.th.ReminderSettings" /></label>&lt;%&ndash;提醒设置&ndash;%&gt;--%>
                <%--<b class="notstart"></b>--%>
            <%--</div>--%>
            <ul class="candidatesUl" style="display: none">
                <li>
                    <p class="candidatesPone">
                        <%--事务提醒设置--%><fmt:message code="workflow.th.TransactionAlertSettings" />
                    </p>
                    <p class="candidatesPothree">
                      <input type="checkbox"  title='<fmt:message code="workflow.th.WhetherReminderIndependently" />'><%--此步骤是否独立设置提醒方式--%>

                    </p>
                    <p class="candidatesPone activeall">
                       <%-- 提醒开启状态--%><fmt:message code="workflow.th.RemindOpenState" />
                    </p>
                    <p class="candidatesPothree activeall">
                        <label><fmt:message code="workflow.th.nextstep" /></label><br><input type="checkbox" lay-skin="primary"><i></i><%--下一步骤--%>
                        <input type="checkbox" lay-skin="primary"><i></i>
                        <input type="checkbox"lay-skin="primary"><i></i>
                    </p>
                    <p class="candidatesPothree activeall" style="margin-top: 10px;">
                        <label><fmt:message code="workflow.th.Initiator" /></label><br><%--发起人--%>
                        <input type="checkbox" lay-skin="primary"><i></i>
                        <input type="checkbox" lay-skin="primary"><i></i>
                        <input type="checkbox" lay-skin="primary"><i></i>
                    </p>
                    <p class="candidatesPothree activeall" style="margin-top: 10px;">
                        <label><fmt:message code="doc.th.AllHandlers" /></label><br><%--全部经办人--%>
                        <input type="checkbox" lay-skin="primary"><i></i>
                        <input type="checkbox" lay-skin="primary"><i></i>
                        <input type="checkbox" lay-skin="primary"><i></i>
                    </p>
                </li>
                <li>
                    <p class="candidatesPone">
                        <%--转交时内部邮件通知以下人员--%><fmt:message code="workflow.th.TheInforInterNotification" />
                    </p>
                    <p class="candidatesPone activeall">
                        <%--通知范围（人员）--%><fmt:message code="workflow.th.NotificationRangePerson" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 20px;">
                        <%--<input type="text" readonly="true" id="">--%>
                        <textarea name="" class="theControlData" id="query_userIds" readonly="true"></textarea>
                        <div style="float: left;line-height: 25px">
                            <a href="javascript:;" style="display: block" data-num="1" class="theCandidates"><fmt:message code="global.lang.add" /></a><%--添加--%>
                            <a href="javascript:;" style="display: block" data-num="1" class="theCandidates"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                        </div>
                    </div>
                    <p class="candidatesPone activeall">
                        <%--通知范围（部门）--%><fmt:message code="workflow.th.NoticeScopeDepart" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 20px;">
                        <%--<input type="text" readonly="true" id="">--%>
                        <textarea name="" class="theControlData" id="departments" readonly="true"></textarea>
                        <div style="float: left;line-height: 25px">
                            <a href="javascript:;" style="display: block" data-num="2" class="theCandidates"><fmt:message code="global.lang.add" /></a><%--添加--%>
                            <a href="javascript:;" style="display: block" data-num="1" class="theCandidates"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                        </div>
                    </div>
                    <p class="candidatesPone activeall">
                        <%--通知范围（角色）--%><fmt:message code="workflow.th.NotificationRangerRole" />
                    </p>
                    <div class="candidatesPTwoall" style="margin-bottom: 20px;">
                        <%--<input type="text" readonly="true" id="">--%>
                        <textarea name="" class="theControlData" id="theScopeOfs" readonly="true"></textarea>
                        <div style="float: left;line-height: 25px">
                            <a href="javascript:;" style="display: block" data-num="3" class="theCandidates"><fmt:message code="global.lang.add" /></a><%--添加--%>
                            <a href="javascript:;" style="display: block" data-num="1" class="theCandidates"><fmt:message code="global.lang.empty" /></a><%--清空--%>
                        </div>
                    </div>
                </li>
            </ul>

            <%--<div class="setUpThe">--%>
                <%--<span class="groupOfSingleSet"></span>--%>
                <%--<label><fmt:message code="workflow.th.BatchOrderSet" /></label>&lt;%&ndash;呈批单设置&ndash;%&gt;--%>
                <%--<b class="notstart"></b>--%>
            <%--</div>--%>
            <ul class="candidatesUl" style="display: none;border-bottom: none">
                <li>
                    <p class="candidatesPone">
                        <%--选择呈批单--%><fmt:message code="workflow.th.ChooseToApproved" />
                    </p>
                    <div class="dropDownDiv">
                        <p class="candidatesPTwo">
                            <select name="" lay-verify="">
                                <option value=""><fmt:message code="workflow.th.PleaseChooseCity" /></option><%--请选择一个城市--%>
                                <option value="010"><fmt:message code="workflow.th.Beijing" /></option><%--北京--%>
                                <option value="021"><fmt:message code="workflow.th.Shanghai" /></option><%--上海--%>
                                <option value="0571"><fmt:message code="workflow.th.Hangzhou" /></option><%--杭州--%>
                            </select>
                        </p>

                    </div>
                </li>
            </ul>
        </div>
        <div class="btnstorage">
            <a href="javascript:;" class="closebtns" style="background: #ff880a"><fmt:message code="global.lang.close" /></a><%--关闭--%>
            <a href="javascript:;" data-type="true"  class="savetwo" style="background: #5ab65a"><fmt:message code="global.lang.save" /></a><%--保存--%>
        </div>
    </form>
</body>

</html>
