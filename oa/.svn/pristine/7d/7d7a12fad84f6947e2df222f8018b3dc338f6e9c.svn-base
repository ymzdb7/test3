<%--
  Created by IntelliJ IDEA.
  User: 王曰岐
  Date: 2017/5/20
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../../css/base.css">
    <link rel="stylesheet" href="../../css/workflow/flowsetting/style.css">
    <link rel="stylesheet" href="../../lib/laydate.css">
    <script src="../../js/jquery/jquery-1.9.1.js"></script>
    <script>
        $(function(){
            var locationstr=location.href.split('=')
            var locanum=locationstr[locationstr.length-1]
           if(locanum==''){
                $('.btnclia').show();
               $($('.btnclia li a')[0]).addClass('clickBack')

           }
           else {
               $('#previewTheForm').click(function () {
                     var me=this;

                   $.ajax({
                       type: "GET",
                       url: "<%=basePath%>flow/selectAllFlow",
                       dataType: "JSON",
                       data: {
                           flowId: locanum
                       },
                       success: function (data) {
                           if(data.flag) {

                               window.location.href = $(me).attr('data-url') + data.object.formId
                           }else{
                               $.layerMsg({content:'<fmt:message code="workflow.th.networkError" />',icon:2})
                           }
                       }
                   })

               })
           }

           $('.theImport').click(function(){
               $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />！',icon:6});

           })
        })
    </script>
</head>
<body>
<div class="content clearfix">
    <div class="title">
        <fmt:message code="workflow.th.application" />
    </div>
    <ul id="cont_list" class="cont_list">
        <li><a href="javascript:void(0)" class="btn_click btn_h btn "><img
                src="../../img/workflow/flowsetting/icon_mainprocess_03.png" alt=""><fmt:message code="workflow.th.firstpage" /></a>
        </li>
        <li class="list1">
            <a href="javascript:void(0)" class="btn_click btn_h btn1">
                <img src="../../img/workflow/flowsetting/icon_process_leftbar_03.png" alt=""><fmt:message code="workflow.th.designflow" /><i
                    class="icon_d"></i></a>
            <ul class="hide_list1 hide btnclia ">
                <li><a href="javascript:void(0)" class="btn_h btn_h_1"><i class="icon"></i><fmt:message code="workflow.th.defineprocess" /></a>
                </li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_2"><i class="icon"></i><fmt:message code="workflow.th.designprocess" /></a>
                </li>
                <li><a href="javascript:void(0)" data-url="<%=basePath %>workflow/work/workform1?formId=" id="previewTheForm" class="btn_h btn_h_3"><i
                        class="icon"></i><fmt:message code="workflow.th.previewform" /></a>
                </li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_4 theImport"><i class="icon"></i><fmt:message code="workflow.th.Import" /></a></li>
            </ul>
        </li>
        <li>
            <a href="javascript:void(0)" class="btn_click btn_h btn2">
                <img src="../../img/workflow/flowsetting/icon_management_03.png" alt=""><fmt:message code="workflow.th.privilege" /></a>
        </li>
        <div class="pop_up">
            <div class="new_b"><fmt:message code="global.lang.new" /></div>
            <div class="pop_con">
                <div class="con_t">
                    <div class="con_l">
                        <div class="con_title">
                            <div class="title_1">
                                <div class="title_label"></div>
                                <span class="title_s"><fmt:message code="workflow.th.formname" />:</span>
                                <div class="title_put">
                                    <input type="text">
                                </div>
                            </div>
                            <sapn class="title_s"><fmt:message code="workflow.th.formfather" />:</sapn>
                            <div class="title_2">
                                <select name="" id="" class="select_t"></select>
                                <span class><fmt:message code="workflow.th.fristNull" /></span>
                            </div>
                            <div class="title_3">
                                <div class="title3_label">
                                    <span class="title_s"><fmt:message code="workflow.th.sector" />:</span>
                                </div>
                                <div class="select_put">
                                    <select name="" class="select_t">
                                        <option value="1"><fmt:message code="workflow.th.allpart" /></option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div class="con_footer">
                <a href="javascript:void(0)" class="footer_btn1"><fmt:message code="global.lang.save" /></a>
                <a href="javascript:void(0)" class="footer_btn2"><fmt:message code="global.lang.close" /></a>
            </div>

        </div>
        <li><a href="javascript:void(0)" class="btn_click btn_h btn3"><img
                src="../../img/workflow/flowsetting/icon_timedtask_03.png" alt=""><fmt:message code="workflow.th.timedtask" /></a>
        </li>
        <li><a href="javascript:void(0)" class="btn_click btn_h btn4"><img
                src="../../img/workflow/flowsetting/icon_search_03.png" alt=""><fmt:message code="workflow.th.configuring" /></a>
        </li>
        <li style="display: none;"><a href="javascript:void(0)" class="btn_click btn_h btn5"><img
                src="../../img/workflow/flowsetting/icon_article_03.png" alt=""><fmt:message code="workflow.th.applylayoutfiles" /></a>
        </li>

        <li><a href="javascript:void(0)" class="btn_click btn_h btn6"><img
                src="../../img/workflow/flowsetting/icon_more_03.png" alt=""><fmt:message code="notice.type.other" /><i class="icon_d"></i></a>
            <ul class="hide_list2 hide">
                <li><a href="javascript:void(0)" class="btn_h btn_h_1 theImport"><i class="icon"></i><fmt:message code="global.lang.empty" /></a>
                </li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_2 theImport"><i class="icon"></i><fmt:message code="global.lang.delete" /></a>
                </li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_3 theImport"><i class="icon"></i><fmt:message code="workflow.th.datamatching" /></a>
                </li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_4 theImport"><i class="icon"></i><fmt:message code="workflow.th.datamigration" /></a></li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_4 theImport"><i class="icon"></i><fmt:message code="workflow.th.menudefine" /></a></li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_4 theImport"><i class="icon"></i><fmt:message code="workflow.th.queryfield" /></a></li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_4 theImport"><i class="icon"></i><fmt:message code="workflow.th.check" /></a></li>
                <li><a href="javascript:void(0)" class="btn_h btn_h_4 theImport"><i class="icon"></i><fmt:message code="global.lang.report" /></a></li>
            </ul>
        </li>


    </ul>

    <div class="cont_r">
        <%--流程主页--%>
        <div class="item item_s item_con">
            <%-- <div class="homePage">
                 <div class="define_r define_flow clearfix">
                     <h3>流程主页</h3>
                     <span><a href="<%=basePath %>flowSetting/processDesignTool?flowId=${flowId}"
                              class="flowJpdl flow_des" target="view_window">流程设计器</a></span>
                 </div>
                 <div class="home_mid">
                     <ul class="mid_f clearfix">
                         <li><a class="expont_num" href="javascript:void(0)">
                             <img src="../../img/workflow/flowsetting/icon_processing_03.png" alt="">
                             <p class="expont_r">
                                 <span class="num">10</span>
                                 <span class="exponent">全部流程</span>
                             </p>
                         </a>
                         </li>
                         <li><a class="expont_num" href="javascript:void(0)">
                             <img src="../../img/workflow/flowsetting/icon_allprocess_03.png" alt="">
                             <p class="expont_r">
                                 <span class="num" style="color: #d68b2f24">10</span>
                                 <span class="exponent" style="color: #d68b2f24">正在执行流程</span>
                             </p>
                         </a>
                         </li>
                         <li><a class="expont_num" href="javascript:void(0)">
                             <img src="../../img/workflow/flowsetting/icon_finish_03.png" alt="">
                             <p class="expont_r">
                                 <span class="num" style="color: #287a55">10</span>
                                 <span class="exponent" style="color: #287a55">已经结束流程</span>
                             </p>
                         </a>
                         </li>
                         <li><a class="expont_num" href="javascript:void(0)">
                             <img src="../../img/workflow/flowsetting/icon_orige_04.png" alt="">
                             <p class="expont_r">
                                 <span class="num" style="color: #966f31">10</span>
                                 <span class="exponent" style="color: #966f31">已归档流程</span>
                             </p>
                         </a>
                         </li>

                     </ul>
                 </div>
                 <div class="home_con clearfix">
                     <div class="conLeft">
                         <h3 class="con_t">流程基本信息</h3>
                         <ul class="con_c">
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg1"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID" style="color: #8f000000">流程名称/ID号</span>
                                     <p class="flow_p">请假申请</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg2"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">流程所属分类</span>
                                     <p class="flow_p">考勤管理</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg3"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">流程所有表单</span>
                                     <p class="flow_p">请假登记单</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg4"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">流程类型</span>
                                     <p class="flow_p">固定类型</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg1"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">流程所属部门</span>
                                     <p class="flow_p">人力资源部</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg2"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">工作名称/文号</span>
                                     &lt;%&ndash;<p class="flow_p">张三</p>&ndash;%&gt;
                                     <span class="flow_z">张三</span><span class="flow_q">请假流程</span>
                                     <p class="flow_date">2017年6月1号 10:30</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg3"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">流程步骤数</span>
                                     <p class="flow_p">4</p>
                                 </a>
                             </li>
                             <li class="conLeft_list clearfix">
                                 <i class="bg bg4"></i>
                                 <a href="javascript:;" class="list_click">
                                     <span class="flow_ID">流程断点数</span>
                                     <p class="flow_p">0</p>
                                 </a>
                             </li>
                         </ul>
                     </div>
                     <div class="conRight">
                         <h3 class="con_t">流程支持的功能</h3>
                         <ul style="background: #f5f7f8;">
                             <li><a href="javascript:;" class="btn_c">支持回退</a><span class="save_y"><i class="icon_y"></i></span>
                             </li>
                             <li><a href="javascript:;" class="btn_c">支持会签</a><span class="save_y save_r"><i
                                     class=" icon_n"></i></span></li>
                             <li><a href="javascript:;" class="btn_c">允许并发</a>
                                 <sapn class="save_y"><i class="icon_y"></i></sapn>
                             </li>
                             <li><a href="javascript:;" class="btn_c">可以传阅</a>
                                 <sapn class="save_y"><i class="icon_y"></i></sapn>
                             </li>
                             <li><a href="javascript:;" class="btn_c">有附件</a>
                                 <sapn class="save_y save_s"><i class="icon_y"></i></sapn>
                             </li>
                         </ul>
                     </div>
                 </div>
             </div>--%>
        </div>
        <div class="item" item_s></div>
        <%--定义流程属性--%>
        <div class="item item1">
            <div class="con_flow clearfix">
                <div class="define_r clearfix">
                    <h3><fmt:message code="workflow.th.defineprocess" /></h3>
                    <span><a href="javascript:void(0)" class="keepmsg"><fmt:message code="global.lang.save" /></a></span>
                </div>
                <div class="over_f">
                    <p class="define_p"><fmt:message code="workflow.th.basicattributes" /></p>
                    <form class="pro_flow ">
                        <div class="con_form">
                            <div class="form_group">
                                <label for="projectName" class="flowName"><fmt:message code="workflow.th.processname" /><span class="save">*</span></label>
                                <input type="hidden" id="flowId">
                                <input type="text" id="projectName">

                            </div>


                            <div class="form_group">
                                <label for="classfiy" class="flowName"><fmt:message code="workflow.th.process" /> <span class="save">*</span></label>
                                <select name="" id="classfiy" class="depName">
                                </select>
                            </div>
                            <div class="form_group">
                                <label for="class_f" class="flowName"><fmt:message code="workflow.th.flowtype" /><span class="save">*</span></label>
                                <select name="" id="class_f" class="depName">
                                    <option value="1"><fmt:message code="workflow.th.fixedflow" /></option>
                                    <option value="2"><fmt:message code="workflow.th.freeflow" /></option>
                                </select>
                            </div>
                            <div class="form_group">
                                <label for="leave" class="flowName"><fmt:message code="workflow.th.form" />  <span class="save">*</span></label>
                                <select name="" id="leave" class="depName">
                                    <%--<option value="">请假登记</option>--%>
                                </select>
                            </div>
                            <div class="form_group">
                                <label for="delegate-type" class="flowName"><fmt:message code="workflow.th.delegatetype" /><span class="save">*</span></label>
                                <select name="FREE_OTHER" id="delegate-type" class="depName">
                                    <option value="2" selected="selected"><fmt:message code="workflow.th.freecommission" /></option>
                                    <option value="1"><fmt:message code="workflow.th.handlers" /></option>
                                    <option value="3"><fmt:message code="workflow.th.delegate" /></option>
                                    <option value="0"><fmt:message code="workflow.th.nodelegation" /></option>
                                </select>
                            </div>
                            <div class="form_group">
                                <label for="deptName" class="flowName"><fmt:message code="workflow.th.sector" /> <span class="save">*</span></label>
                                <select name="" id="deptName" class="depName">
                                    <%--<option value="1">系统(仅有系统管理员管理)</option>--%>
                                </select>
                            </div>
                            <div class="form_group">
                                <label for="orderID" class="flowName"><fmt:message code="workflow.th.sortnumber" /> </label>
                                <input type="text" id="orderID">

                            </div>
                            <div class="form_group sex_r">
                                <label class="flowName"><fmt:message code="workflow.th.circulate" /></label>
                                <input type="radio" name="sex" value="1" class="radio_s"><label class="sex_n "><fmt:message code="global.lang.yes" /></label>
                                <input type="radio" name="sex" value="0" class="radio_f" checked><label class="sex_save"><fmt:message code="global.lang.no" /></</label>
                            </div>
                            <%--控件--%>
                            <div class="form_group block_n"
                                 style="padding-left: 210px;margin: -38px 0 38px 0;display: none">
                                <div class="title_3">
                                    <div class="title3_label">
                                        <span class="title_s"><fmt:message code="workflow.th.chuan" /></span></div>
                                    <div class="select_put">
                                        <textarea name="txt" id="text_1" user_id="admin" value="admin" disabled></textarea>
                                        <a style="margin-left: 10px;cursor: pointer" id="add_f_1"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div>
                                </div>
                                <div class="title_3">
                                    <div class="title3_label">
                                        <span class="title_s"><fmt:message code="workflow.th.chuanyueren" /></span></div>
                                    <div class="select_put">
                                        <textarea name="txt" id="text_2" user_id="admin" value="admin"
                                                  disabled></textarea><a style="margin-left: 10px;cursor: pointer"
                                                                         id="add_f_2"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div>
                                </div>
                                <div class="title_3">
                                    <div class="title3_label">
                                        <span class="title_s"><fmt:message code="workflow.th.ro" /></span></div>
                                    <div class="select_put">
                                        <textarea name="txt" id="text_3" user_id="admin" value="admin" disabled></textarea>
                                        <a style="margin-left: 10px;cursor: pointer" id="add_f_3"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div>
                                </div>
                            </div>

                            <div class="form_group sex_r">
                                <label class="flowName"><fmt:message code="workflow.th.Ne" /></label>
                                <input type="radio" name="sex_1" value="1" checked><label class="sex_n"><fmt:message code="global.lang.yes" /></label>
                                <input type="radio" name="sex_1" value="0"><label class="sex_save"><fmt:message code="global.lang.no" /></label>

                            </div>
                            <div class="form_group sex_r">
                                <label class="flowName"><fmt:message code="workflow.th.Versioning" /></label>
                                <input type="radio" name="sex_2" value="1" checked><label class="sex_n"><fmt:message code="global.lang.yes" /></label>
                                <input type="radio" name="sex_2" value="0"><label class="sex_save"><fmt:message code="global.lang.no" /></label>

                            </div>
                            <div class="form_group sex_r sex_r_f">
                                <label class="flowName"><fmt:message code="workflow.th.action" /></label>
                                <input type="checkbox"><label class="label_f"><fmt:message code="main.inform" /></label>
                                <input type="checkbox"><label class="label_f"><fmt:message code="workflow.th.Internalmail" /></label>
                                <input type="checkbox"><label class="label_f"><fmt:message code="workflow.th.Dump" /></label>
                                <input type="checkbox"><label class="label_f placeFile"><fmt:message code="workflow.th.File" /></label>
                                <p class="set_form"><fmt:message code="workflow.th.Setupforms" /></p>

                            </div>

                        </div>

                    </form>
                    <div class="jobName"><fmt:message code="workflow.th.job" /></div>
                    <form class="pro_flow flow_r" style="height:480px">
                        <div class="con_form">
                            <div class="form_group">
                                <label for="reference" class="flowName"><fmt:message code="workflow.th.expression" /></label>
                                <input type="text" id="reference">
                            </div>
                            <div class="form_group">
                                <label for="counteer" class="flowName"><fmt:message code="workflow.th.counter" /></label>
                                <input type="text" id="counteer">
                            </div>
                            <div class="form_group">
                                <label for="figure" class="flowName"><fmt:message code="workflow.th.digits" /></label>
                                <input type="text" id="figure">
                            </div>
                            <div class="form_group">
                                <label for="update_n" class="flowName"><fmt:message code="workflow.th.change" /></label>
                                <select name="" id="update_n" class="depName">
                                    <option value="1" selected="selected"><fmt:message code="wworkflow.th.modify" /></option>
                                    <option value="0"><fmt:message code="workflow.th.nomodify" /></option>
                                    <option value="2"><fmt:message code="workflow.th.prefixes" /></option>
                                    <option value="3"><fmt:message code="workflow.th.suffixes" /></option>
                                    <option value="4"><fmt:message code="workflow.th.prefixesandsuffixes" /></option>
                                </select>
                            </div>
                        </div>

                        <div class="form_r">
                            <div class="conForm_r">
                                <p><fmt:message code="workflow.th.document" /></p>
                                <p><fmt:message code="workflow.th.specialtags" />:</p>
                                <div>
                                    <span><fmt:message code="workflow.th.meansyear" /> </span>
                                    <span style="margin-left: 62px;"><fmt:message code="workflow.th.month" /> </span>
                                    <span style="margin-left: 55px;"><fmt:message code="workflow.th.day" /> </span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.when" /></span>
                                    <span style="margin-left: 62px;"><fmt:message code="workflow.th.points" /></span>
                                    <span style="margin-left: 62px;"><fmt:message code="workflow.th.seconds" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.process-name" /></span>
                                    <span style="margin-left: 40px;"><fmt:message code="workflow.th.username" /></span>
                                    <span style="margin-left: 22px;"><fmt:message code="workflow.th.role" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.FS" /></span>
                                    <span style="margin-left: 1px;"><fmt:message code="workflow.th.SD" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.LD" /></span>
                                    <span style="margin-left: 36px;"><fmt:message code="workflow.th.RUN" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.N" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.NY" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.NM" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.exmaple" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.automatically" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.example" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.BH" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.the-expression" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.zhangsan" /></span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.such" />：</span>
                                </div>
                                <div style="margin-top: 5px;">
                                    <span><fmt:message code="workflow.th.leaveprocedure" /></span>
                                </div>

                            </div>
                        </div>
                    </form>
                    <div class="jobName"><fmt:message code="workflow.th.Processdes" /></div>
                    <form class="pro_flow flow_r">
                        <div class="con_form">
                            <div class="form_group">
                                <label for="reference" class="flowName"><fmt:message code="workflow.th.shuoming" /></label><span
                                    class="notable"><fmt:message code="workflow.th.nul" /></span>
                            </div>
                            <div class="form_group Attachment">
                                <form action="" class="files"></form>
                            </div>
                            <div class="form_group form_icon files">
                                <form id="uploadimgform" target="uploadiframe" action="../upload?module=email"
                                      enctype="multipart/form-data" method="post">
                                    <label for="counteer" class="flowName"><fmt:message code="news.th.toup" /></label>
                                    <input type="file" name="file" id="uploadinputimg" class="w-icon5"
                                           style="display:none;">
                                    <i class="icon_plus"></i><input type="text" value="<fmt:message code="global.th.fileup" />" class="addfile"
                                                                    id="addfile" style="cursor: pointer">
                                    <i class="icon_plus"></i><input type="text" value="<fmt:message code="workflow.th.SelectCabinet" />" class="appendfile"
                                                                    id="appendfile" style="cursor: pointer">
                                    <%--<a href="#" id="uploadimg">上传</a>--%>
                                </form>


                            </div>
                        </div>
                        <div id="container" style="width: 96%;min-height: 300px;margin: 30px 20px 100px 20px"
                             name="content" type="text/plain"></div>
                    </form>
                </div>

            </div>
        </div>
        <%--设计流程步骤--%>
        <div class="item item_s">
            <table class="table" cellspacing="0" id="table_form">
                <%-- <caption>
                     <a href="javascript:void (0)" class="newbuilt">新建</a>
                     <a href="javascript:void (0)" class="delete_c">删除</a>
                 </caption>
 --%>
                <thead>
                <%-- <tr>
                     <th class="check">序号</th>
                     <th>名称</th>
                     <th>下一步骤</th>
                     <th>编辑该步骤的各项属性</th>
                     <th>操作</th>
                 </tr>--%>
                </thead>
                <%-- <tr>
                     <td>1</td>
                     <td class="manage">督办内容填写</td>
                     <td class="ordernum">2,4</td>
                     <td class="cutout">基本属性 经办权限 可写字段 保密字段 必填字段 条件设置</td>
                     <td class="opp">
                         <a href="javascript:void(0)">克隆</a>
                         <a href="javascript:void(0)">删除</a>
                     </td>
                 </tr>--%>
                <%-- <tr>
                     <td>2</td>
                     <td class="management" style="text-align: center">部门负责人审批</td>
                     <td>3,</td>
                     <td style="text-align: center">基本属性 经办权限 可写字段 保密字段 必填字段 条件设置</td>
                     <td>
                         <a href="javascript:void(0)">克隆</a>
                         <a href="javascript:void(0)">删除</a>
                     </td>
                 </tr>--%>
                <%--<tr>
                    <td>3</td>
                    <td class="management" style="text-align: center">总经理审核</td>
                    <td>4</td>
                    <td style="text-align: center">基本属性&nbsp;经办权限&nbsp;可写字段&nbsp;保密字段&nbsp;必填字段&nbsp;条件设置</td>
                    <td>
                        <a href="javascript:void(0)">克隆</a>
                        <a href="javascript:void(0)">删除</a>
                    </td>
                </tr>--%>
            </table>
        </div>
        <div class="item item_s"></div>
        <div class="item item_s"></div>
        <%--管理权限表格--%>
        <div class="item item_s">
            <table class="table" cellspacing="0" id="table_power">

                <%-- <thead>
                  <tr>
                      <th class="check"><input type="checkbox" class="checkAll">全选</th>
                      <th>权限类型</th>
                      <th>授权范围</th>
                      <th>管理范围</th>
                      <th>操作</th>
                  </tr>
                  </thead>
                 <tbody>
                 <tr>
                     <td><input type="checkbox" class="one"></td>
                     <td class="manage">管理</td>
                     <td class="management">用户：系统管理员</td>
                     <td class="sector">所有部门</td>
                     <td class="opp">
                         <a href="javascript:void(0)">修改</a>
                         <a href="javascript:void(0)">删除</a>
                     </td>
                 </tr>
                 <tr>
                     <td><input type="checkbox" class="one"></td>
                     <td>监控</td>
                     <td class="management">用户：系统管理员</td>
                     <td class="sector">所有部门</td>
                     <td>
                         <a href="javascript:void(0)">修改</a>
                         <a href="javascript:void(0)">删除</a>
                     </td>
                 </tr>
                 </tbody>--%>

            </table>
        </div>
        <%--定时任务--%>
        <div class="item item_s">
            <table class="table" cellspacing="0" id="table_task">
                <%--<caption>
                    <a href="javascript:void (0)" class="newbuilt">新建</a>
                    <a href="javascript:void (0)" class="delete_c">删除</a>
                </caption>

                <thead>
                <tr>
                    <th class="check"><input type="checkbox" class="checkAll">全选</th>
                    <th>权限类型</th>
                    <th>授权范围</th>
                    <th>管理范围</th>
                    <th>操作</th>
                </tr>

                </thead>
                <tr>
                    <td><input type="checkbox" class="one"></td>
                    <td class="manage">管理</td>
                    <td class="management">用户：系统管理员</td>
                    <td class="sector">所有部门</td>
                    <td class="opp">
                        <a href="javascript:void(0)">修改</a>
                        <a href="javascript:void(0)">删除</a>
                    </td>
                </tr>
                <tr>
                    <td><input type="checkbox" class="one"></td>
                    <td>监控</td>
                    <td class="management">用户：系统管理员</td>
                    <td class="sector">所有部门</td>
                    <td>
                        <a href="javascript:void(0)">修改</a>
                        <a href="javascript:void(0)">删除</a>
                    </td>
                </tr>--%>
            </table>
        </div>
        <%--配置查询模板--%>
        <div class="item item_s">
            <table class="table table_temp" cellspacing="0">
                <%--  <caption>
                      <a href="javascript:void (0)" class="newbuilt">新建</a>
                      <a href="javascript:void (0)" class="delete_c">删除</a>
                  </caption>

                  <thead>
                  <tr>
                      <th class="check"><input type="checkbox" class="checkAll">全选</th>
                      <th>权限类型</th>
                      <th>授权范围</th>
                      <th>管理范围</th>
                      <th>操作</th>
                  </tr>
                  </thead>
                  <tr>
                      <td><input type="checkbox" class="one"></td>
                      <td class="manage">管理</td>
                      <td class="management">用户：系统管理员</td>
                      <td class="sector">所有部门</td>
                      <td class="opp">
                          <a href="javascript:void(0)">修改</a>
                          <a href="javascript:void(0)">删除</a>
                      </td>
                  </tr>
                  <tr>
                      <td><input type="checkbox" class="one"></td>
                      <td>监控</td>
                      <td class="management">用户：系统管理员</td>
                      <td class="sector">所有部门</td>
                      <td>
                          <a href="javascript:void(0)">修改</a>
                          <a href="javascript:void(0)">删除</a>
                      </td>
                  </tr>--%>
            </table>
        </div>
        <%--应用版式文件--%>
        <div class="item item_s">
            <table class="table table_prc" cellspacing="0">
                <%-- <caption>
                     <a href="javascript:void (0)" class="newbuilt">新建</a>
                     <a href="javascript:void (0)" class="delete_c">删除</a>
                 </caption>

                 <thead>
                 <tr>
                     <th class="check"><input type="checkbox" class="checkAll">全选</th>
                     <th>权限类型</th>
                     <th>授权范围</th>
                     <th>管理范围</th>
                     <th>操作</th>
                 </tr>

                 </thead>
                 <tr>
                     <td><input type="checkbox" class="one"></td>
                     <td class="manage">管理</td>
                     <td class="management">用户：系统管理员</td>
                     <td class="sector">所有部门</td>
                     <td class="opp">
                         <a href="javascript:void(0)">修改</a>
                         <a href="javascript:void(0)">删除</a>
                     </td>
                 </tr>
                 <tr>
                     <td><input type="checkbox" class="one"></td>
                     <td>监控</td>
                     <td class="management">用户：系统管理员</td>
                     <td class="sector">所有部门</td>
                     <td>
                         <a href="javascript:void(0)">修改</a>
                         <a href="javascript:void(0)">删除</a>
                     </td>
                 </tr>--%>
            </table>
        </div>
    </div>

</div>
</body>
<script src="../../js/jquery/jquery-1.9.1.js"></script>
<script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
<script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
<script src="../../lib/layer/layer.js"></script>
<script src="../../js/base/base.js"></script>
<script src="../../lib/laydate/laydate.js"></script>
<script src="../../js/workflow/work/workform.js"></script>

<script type="text/javascript">
    function radioTheEcho(names, dataNames) {
        if (dataNames == '')return
        $('[name="' + names + '"]').each(function (i, n) {

            if ($(this).val() == dataNames) {
                $(this).prop('checked', true);
                return false;
            }
        })
    }


    //    时间控件调用
    //        var start = {
    //            elem: '#start_date',
    //            format: 'YYYY/MM/DD hh:mm:ss',
    //    //         min: laydate.now(), //设定最小日期为当前日期
    //    //         max: '2099-06-16 23:59:59', //最大日期
    //            istime: true,
    //            istoday: false,
    //            choose: function (datas) {
    //                end.min = datas; //开始日选好后，重置结束日的最小日期
    //                end.start = datas //将结束日的初始值设定为开始日
    //            }
    //        };
    //        var end = {
    //            elem: '#end_date',
    //            format: 'YYYY/MM/DD hh:mm:ss',
    //    //        min: laydate.now(),
    //    //        max: '2099-06-16 23:59:59',
    //            istime: true,
    //            istoday: false,
    //            choose: function (datas) {
    //                start.max = datas; //结束日选好后，重置开始日的最大日期
    //            }
    //        };
    //        laydate(start);
    //        laydate(end);

    var ue = UE.getEditor('container');
    $(function () {
        var flowId = '${flowId}';
        /*设计流程主页*/
        function homePageFn() {
            $.ajax({
                type: 'GET',
                url: '<%=basePath%>flow/flowDetailInfo',
                dataType: 'json',
                data: {
                    flowId: flowId
                },
                success: function (data) {
                    console.log(data)
                    if (data.flag) {
                        var data = data.object
                        console.log(data)
                        var htmlTemp = '';
                        var flowType = '';
                        if (data.flowType == '1') {
                            flowType = '<fmt:message code="workflow.th.fixedflow" />'
                        } else {
                            flowType = '<fmt:message code="workflow.th.freeflow" />'
                        }
                        var runIngCount;
                        if (!data.runIngCount) {
                            runIngCount = 0;
                        } else {
                            runIngCount = data.runIngCount;
                        }

                        var runAll = 0;
                        if (!typeof(data.runAll) == "undefined") {
                            runAll = data.runAll;
                        }
                        var endRun;
                        if (!data.endRun) {
                            endRun = 0
                        } else {
                            endRun = data.endRun;
                        }
                        var archiveRun;
                        if (!data.archiveRun) {
                            archiveRun = 0;
                        } else {
                            archiveRun = data.archiveRun;
                        }
                        var flowNameId = '';
                        var flowNames;
                        if ((!data.flowName) || data.flowName == "") {
                            flowNames = "<fmt:message code="sys.th.Undefined" />"
                        } else {
                            flowNames = data.flowName;
                        }
                        var flowIds;
                        if (!data.flowId) {
                            flowIds = 0;
                        } else {
                            flowIds = data.flowId;
                        }
                        flowNameId = flowNames + flowIds;
                        var autoNames;
                        if ((!data.autoName) || data.autoName == '') {
                            autoNames = '<fmt:message code="sys.th.Undefined" />'
                        } else {
                            autoNames = data.autoName;
                        }
                        var autoNums;
                        if (!data.autoNum) {
                            autoNums = 0;
                        } else {
                            autoNums = data.autoNum;
                        }
                        var procNum;
                        if(!data.procNum){
                            procNum=0;
                        }else{
                            procNum=data.procNum;
                        };
                        var cutNumber;
                        if(!data.cutNumber){
                            cutNumber=0;
                        }else{
                            cutNumber=data.cutNumber;
                        };

                        for (key in data) {
                            htmlTemp = '<div class="homePage">' +
                                '<div class="define_r define_flow clearfix define_r">' +
                                '<h3><fmt:message code="workflow.th.firstpage" /></h3>' +
                                '<span>' +
                                '<a href="<%=basePath %>flowSetting/processDesignTool?flowId=${flowId}"class="flowJpdl keepmsgTwo" target="view_window"><fmt:message code="workflow.th.designer" /></a></span>' + '' +
                                '</div>' +
                                '<div class="home_mid">' +
                                '<ul class="mid_f clearfix">' +
                                '<li><a class="expont_num" href="javascript:void(0)">' +
                                '<img src="../../img/workflow/flowsetting/icon_processing_03.png" alt="">' +
                                '<p class="expont_r">' +
                                '<span class="num">' + runAll + '</span>' +
                                '<span class="exponent"><fmt:message code="workflow.th.wholeprocess" /></span></p></a>' +
                                '</li>' +
                                '<li>' +
                                '<a class="expont_num" href="javascript:void(0)">' +
                                '<img src="../../img/workflow/flowsetting/icon_allprocess_03.png" alt="">' +
                                '<p class="expont_r">' + '<span class="num" style="color: #d68b2f24">' + runIngCount + '</span>' +
                                '<span class="exponent" style="color: #d68b2f24"><fmt:message code="workflow.th.executing" /></span></p>' + '</a>' +
                                '</li>' +
                                '<li>' +
                                '<a class="expont_num" href="javascript:void(0)">' +
                                '<img src="../../img/workflow/flowsetting/icon_finish_03.png" alt=""><p class="expont_r">' +
                                '<span class="num" style="color: #287a55">' + endRun + '</span>' +
                                '<span class="exponent" style="color: #287a55"><fmt:message code="workflow.th.endexecuting" /></span></p></a>' +
                                '</li>' +
                                '<li>' +
                                '<a class="expont_num" href="javascript:void(0)">' +
                                '<img src="../../img/workflow/flowsetting/icon_orige_04.png" alt="">' + '<p class="expont_r"><span class="num" style="color: #966f31">' + archiveRun + '</span>' +
                                '<span class="exponent" style="color: #966f31"><fmt:message code="workflow.th.archivedprocess" /></span></p></a>' +
                                '</li>' +
                                '</ul>' +
                                '</div>' +
                                '<div class="home_con clearfix">' +
                                '<div class="conLeft">' +
                                '<h3 class="con_t"><fmt:message code="workflow.th.basicinformation" /></h3>' +
                                '<ul class="con_c">' +
                                '<li class="conLeft_list clearfix"><i class="bg bg1"></i>' +
                                '<a href="javascript:;" class="list_click"><span class="flow_ID" style="color: #8f000000"><fmt:message code="workflow.th.Processname/id" /></span>' +
                                '<p class="flow_p">' + flowNameId + '</p></a>' +
                                '</li>' + '' +
                                '<li class="conLeft_list clearfix"><i class="bg bg2"></i>' +
                                '<a href="javascript:;" class="list_click">' +
                                '<span class="flow_ID"><fmt:message code="workflow.th.processclassification" /></span>' +
                                '<p class="flow_p">' + data.sortName + '</p>' +
                                '</a></li><li class="conLeft_list clearfix"><i class="bg bg3"></i>' +
                                '<a href="javascript:;" class="list_click">' +
                                '<span class="flow_ID"><fmt:message code="workflow.th.processallforms" /></span>' +
                                '<p class="flow_p">' + data.formName + '</p></a>' +
                                '</li>' +
                                '<li class="conLeft_list clearfix">' +
                                '<i class="bg bg4"></i>' +
                                '<a href="javascript:;" class="list_click"><span class="flow_ID"><fmt:message code="workflow.th.flowtype" /></span>' +
                                '<p class="flow_p">' + flowType + '</p></a>' +
                                '</li>' +
                                '<li class="conLeft_list clearfix">' +
                                '<i class="bg bg1"></i><a href="javascript:;" class="list_click">' +
                                '<span class="flow_ID"><fmt:message code="workflow.th.liudepartment" /></span><p class="flow_p">' + data.depName + '</p></a>' +
                                '</li>' +
                                '<li class="conLeft_list clearfix">' +
                                '<i class="bg bg2"></i>' +
                                '<a href="javascript:;" class="list_click">' +
                                '<span class="flow_ID"><fmt:message code="workflow.th.job" /></span>' +
                                '<span class="flow_z">' + autoNames + '</span><span class="flow_q">' + autoNums + '</span>' +
                                '<p class="flow_date">2017-6-1 10:30</p>' + '</a>' +
                                '</li>' +
                                '<li class="conLeft_list clearfix">' +
                                '<i class="bg bg3"></i>' +
                                '<a href="javascript:;" class="list_click">' +
                                '<span class="flow_ID"><fmt:message code="workflow.th.processsteps" /></span><p class="flow_p">' + procNum + '</p></a>' +
                                '</li>' +
                                '<li class="conLeft_list clearfix"><i class="bg bg4"></i><a href="javascript:;" class="list_click">' +
                                '<span class="flow_ID"><fmt:message code="workflow.th.FlowEndPoint" /></span><p class="flow_p">' + cutNumber + '</p></a>' +
                                '</li>' +
                                '</ul>' +
                                '</div>' +
                                '<div class="conRight"><h3 class="con_t"><fmt:message code="workflow.th.supportfunctions" /></h3>' +
                                '<ul style="background: #f5f7f8;">' +
                                '<li><a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.rollback" /></a><span class="" id="backspace"><i id="icon_1" class="icon_y"></i></span>' +
                                '</li>' +
                                '<li><a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.countersigned" /></a><span class="" id="counsign"><i id="icon_2" class=" icon_y"></i></span></li>' +
                                '<li><a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.concurrent" /></a>' +
                                '<sapn class="save_y" id="super"><i class="icon_y" id="icon_3"></i></sapn>' +
                                '</li>' +
                                '<li>' +
                                '<a href="javascript:;" class="btn_c"><fmt:message code="workflow.th.circulated" /></a>' +
                                '<sapn class="save_y"><i class="icon_y" id="icon_4"></i></sapn></li><li><a href="javascript:;" class="btn_c"><fmt:message code="woorkflow.th.attachments" /></a>' +
                                '<sapn class="save_y save_s"><i class="icon_y" id="icon_5"></i></sapn>' + '' +
                                '</li>' +
                                '</ul>' +
                                '</div>' +
                                '</div>';

                        }
                        $('.item_con').html(htmlTemp);
                        /*流程支持的功能*/
                        if (data.canBack == 0) {
                            $('#backspace').addClass('save_r');
                        } else {
                            $('#backspace').addClass('save_y');
                        }
                        if (data.canSign == 0) {
                            $('#counsign').addClass('save_y')
                        } else {
                            $('#counsign').addClass('save_r')
                        }
                        if (data.canSync == 0) {
                            $('#super').addClass('save_r')
                        } else {
                            $('#super').addClass('save_y')
                        }
                    } else {
                        alert('<fmt:message code="sms.th.noData" />');
                    }


                }
            })
        }

        $('.btn').on('click', function () {
            homePageFn();
        })
        /*流程分类控件*/
        items();
        function items() {
            $.ajax({
                url: '<%=basePath%>workflow/flowclassify/flow',
                type: 'get',
                dataType: 'json',
                success: function (obj) {
                    if (obj.flag) {
                        var data = obj.datas;
                        var opt_li = '<option value="0"  class="levelleft0 selector"></option>';
                        opt_li = Child(data, opt_li, 0, -1);
                        $('#classfiy').html(opt_li);
                    }
                }
            });
        }

        function Child(datas, opt_li, level, parentId) {
            for (var i = 0; i < datas.length; i++) {
                if (level == 0 && i == 0) continue;
                var String = "";
                var space = ""
                for (var j = 0; j < level; j++) {
                    space += "├&nbsp;&nbsp;&nbsp;";
                }
                if (i == 0) {
                    String = space + "┌";
                }
                if (i != 0) {
                    String = space + "├";
                }
                if (i == datas.length - 1) {
                    String = space + "└";
                }
                if (parentId == datas[i].sortId) {
                    opt_li += '<option value="' + datas[i].sortId + '" selected="selected">' + String + datas[i].sortName + '</option>';
                } else {
                    opt_li += '<option value="' + datas[i].sortId + '">' + String + datas[i].sortName + '</option>';
                }

                if (datas[i].childs != null) {
                    opt_li = Child(datas[i].childs, opt_li, level + 1, parentId);
                }
            }

            return opt_li;
        }

        //附件上传
        $('#addfile').on('click', function (ele) {
            $('#uploadinputimg').click();
        })
        $('#uploadinputimg').change(function (e) {
            var target = $(e.target);
            var file;
            if (target[0].files && target[0].files[0]) {
                file = target[0].files[0];
            }
            if (file) {
                $.upload($('#uploadimgform'), function (res) {
                    var data = res.obj;
                    var str = '';
                    var str1 = '';
                    for (var i = 0; i < data.length; i++) {
                        str += '<a href="<%=basePath %>download?' + data[i].attUrl + '" NAME="' + data[i].attachName + '*">' + data[i].attachName + '</a>';
                        str1 += '<input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',">';
                    }
                    $('.Attachment').append(str + str1);
                });
            }
        });

        var flowIdFromPage = '${flowId}';
        /*定义流程属性查询*/
        /*表单控件*/
        function formAjax(fn) {
            $.ajax({
                url: '<%=basePath%>form/allformlist',
                type: 'GET',
                dataType: 'json',
                success: function (data) {
                    if (data.flag) {
                        var data = data.datas;
                        var html = '';
                        for (var i = 0; i < data.length; i++) {
                            html += '<option value="" disabled>' + data[i].sortName + '</option>'
                            var form = data[i].form;
                            for (var j = 0; j < form.length; j++) {
                                html += '<option value="' + form[j].formId + '" >&nbsp;&nbsp;&nbsp;' + form[j].formName + '</option>'

                            }
                        }
                    }
                    $('#leave').html(html)

                    if(fn!=undefined){
                        fn()
                    }
                }
            })
        }

        $('.radio_s').click(function () {
            $(".block_n").show();
        });
        $('.radio_f').click(function () {
            $(".block_n").hide();
        });
        $("#add_f_1").click(function () {
            user_id = 'text_1';
            $.popWindow("../common/selectUser");
        });
        $("#add_f_2").click(function () {
            dept_id = 'text_2';
            $.popWindow("../common/selectDept");
        })
        $("#add_f_3").click(function () {
            priv_id = 'text_3';
            $.popWindow("../common/selectPriv");
        })

        /*定义流程属性保存*/

        if (flowId != "") {
            $('.btn').addClass('clickBack')
            homePageFn();
            $('.item_con').show();

            <!-- 流程属性展示 -->
            function showSvg(fn) {
                $.ajax({
                    type: "GET",
                    url: "<%=basePath%>flow/selectAllFlow",
                    dataType: "JSON",
                    data: {
                        flowId: flowId
                    },
                    success: function (data) {
                        console.log(data)
                        if (data.flag) {
                            $("#flowId").val(data.object.flowId);
                            $("#projectName").val(data.object.flowName);
                            $('#orderID').val(data.object.flowNo);
                            $("#deptName").val(data.object.deptId),
                                $("#classfiy ").val(data.object.flowSort),
                                $("#class_f").val(data.object.flowType),
                                $("#leave").val(data.object.formId),
                                $("#delegate-type").val(data.object.freeOther),
                                $('#reference').val(data.object.autoName),
                                $('#counteer').val(data.object.autoNum),
                                $('#figure').val(data.object.autoLen),
                                $("#update_n").val(data.object.autoEdit),
                                $('#text_1').val(data.object.viewUser),
                                $("input[name='sex'][value='"+data.object.viewPriv+"']").attr("checked",true);
                                $("input[name='sex_1'][value='"+data.object.flowDoc+"']").attr("checked",true);
                                $("input[name='sex_2'][value='"+data.object.isVersion+"']").attr("checked",true);

                                var arrTwo=data.object.flowAction.split(',')
                            $('input[name="text"]').each(function (index, item) {
                                for(var n=0;n<arrTwo.length;n++){
                                    if(arrTwo[n]==$(this).val()){
                                        $(this).prop('checked',true)
                                    }
                                }
                            })

                        }
                    }
                });
            }


            $('.btn_h_1').click(function () {
                /*所属部门控件*/
                $('#deptName').deptSelect();

                formAjax(function(){
                    showSvg();
                });

            })
        } else {
            $('.item1').show();
            formAjax();
            $('#deptName').deptSelect();
        }

        $('.keepmsg').on('click', function () {
            var data = {};
            if (flowId == null || flowId == "") {

                var dataid = $('#text_1').attr('dataid');
                var deptid = $('#text_2').attr('deptid');
                var privid = $('#text_3').attr('privid');
                var passval = $('input[name="sex"]:checked').val();
                var flowActionAry = new Array();
                $('input[name="text"]:checked').each(function (index, item) {
                    flowActionAry.push($(this).val())
                })
                if (passval == 0) {

                    data = {
                        flowName: $('#projectName').val(),
                        flowNo: $('#orderID').val(),
                        deptId: $("#deptName option:selected").val(),
                        flowSort: $('#classfiy option:selected').val(),
                        flowType: $('#class_f option:selected').val(),
                        formId: $('#leave option:selected').val(),
                        freeOther: $('#delegate-type option:selected').val(),
                        flowDoc: $('input[name="sex_1"]:checked').val(),
                        autoNum: $('#counteer').val(),
                        autoLen: $('#figure').val(),
                        isVersion: $('input[name="sex_2"]:checked').val(),
                        flowAction: flowActionAry.join(','),
                        autoName: $('#reference').val(),
                        autoEdit: $("#update_n").val(),
                        viewPriv:$('input[name="sex"]:checked').val()
                    };
                } else {
                    data = {
                        flowName: $('#projectName').val(),
                        flowNo: $('#orderID').val(),
                        deptId: $("#deptName option:selected").val(),
                        flowSort: $('#classfiy option:selected').val(),
                        flowType: $('#class_f option:selected').val(),
                        formId: $('#leave option:selected').val(),
                        freeOther: $('#delegate-type option:selected').val(),
                        flowDoc: $('input[name="sex_1"]:checked').val(),
                        autoNum: $('#counteer').val(),
                        autoLen: $('#figure').val(),
                        isVersion: $('input[name="sex_2"]:checked').val(),
                        flowAction: flowActionAry.toString(),
                        autoName: $('#reference').val(),
                        autoEdit: $("#update_n").val(),
                        viewUser: dataid,
                        viewDept: deptid,
                        viewRole: privid,
                    };
                }

                //保存

                $.ajax({
                    type: 'POST',
                    url: '<%=basePath%>flow/newFlow',
                    dataType: 'json',
                    data: data,
                    success: function (data) {
                        if (data.flag) {
                            $.layerMsg({content:'<fmt:message code="diary.th.modify" />！',icon:1},function(){
                                window.location.href = '<%=basePath%>flowSetting/index?type=add&flowId=' + data.object.flowId;
                            });

                            console.log(data);


                        } else {
                            $.layerMsg({content:'<fmt:message code="meet.th.SaveFailed" />！',icon:2},function(){});

                        }
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        layer.msg('<fmt:message code="workflow.th.DataException" />。。', {icon: 6})
                    }
                })
            } else {
                $(".block_n").show();
                var flowActionAry = new Array();
                $('input[name="text"]:checked').each(function (index, item) {
                    flowActionAry.push($(this).val())
                });
                var dataid = $('#text_1').attr('dataid');
                var deptid = $('#text_2').attr('deptid');
                var privid = $('#text_3').attr('privid');
                //修改|编辑
                if (passval == 0) {
                    data = {
                        flowName: $('#projectName').val(),
                        flowNo: $('#orderID').val(),
                        deptId: $("#deptName option:selected").val(),
                        flowSort: $('#classfiy option:selected').val(),
                        flowType: $('#class_f option:selected').val(),
                        formId: $('#leave option:selected').val(),
                        freeOther: $('#delegate-type option:selected').val(),
                        flowDoc: $('input[name="sex_1"]:checked').val(),
                        autoNum: $('#counteer').val(),
                        autoLen: $('#figure').val(),
                        isVersion: $('input[name="sex_2"]:checked').val(),
                        flowAction: flowActionAry.toString(),
                        autoName: $('#reference').val(),
                        autoEdit: $("#update_n").val(),
                        flowId:flowId
                    };
                } else {
                    data = {
                        flowName: $('#projectName').val(),
                        flowNo: $('#orderID').val(),
                        deptId: $("#deptName option:selected").val(),
                        flowSort: $('#classfiy option:selected').val(),
                        flowType: $('#class_f option:selected').val(),
                        formId: $('#leave option:selected').val(),
                        freeOther: $('#delegate-type option:selected').val(),
                        flowDoc: $('input[name="sex_1"]:checked').val(),
                        autoNum: $('#counteer').val(),
                        autoLen: $('#figure').val(),
                        isVersion: $('input[name="sex_2"]:checked').val(),
                        flowAction: flowActionAry.toString(),
                        autoName: $('#reference').val(),
                        autoEdit: $("#update_n").val(),
                        viewUser: dataid,
                        viewDept: deptid,
                        viewRole: privid,
                        flowId:flowId
                    };
                }
                $.ajax({
                    type: "POST",
                    url: "<%=basePath%>flow/updateFlow",
                    dataType: 'json',
                    data: data,
                    success: function (data) {
                        if (data.flag) {
                            $.layerMsg({content:'<fmt:message code="menuSSetting.th.editSuccess" />！',icon:1});
                            <%--window.location.href = '<%=basePath%>flowSetting/index?type=add&flowId=' + flowId;--%>
                        } else {
                            layer.msg('<fmt:message code="depatement.th.modifyfailed" />。。', {icon: 6})
                        }
                    }
                })
            }
        });
        /*设计步骤流程*/
        $('.btn_h_2').click(function () {
            $.ajax({
                type: "get",
                url: "<%=basePath%>flowProcess/findFlowId",
                dataType: "json",
                data: {
                    flowId: flowId
                },
                success: function (data) {
                    if (data.flag) {
                        var data = data.obj;
                        var html = '<caption class="clearfix define_r"> <span style="float:left" class="priv_t"><fmt:message code="workflow.th.designprocess" /></span> ' +
                            '<a href="<%=basePath %>flowSetting/processDesignTool?flowId=${flowId}" style="margin-right:44px" class="keepmsgTwo" target="view_window"><fmt:message code="workflow.th.designer" /></a> ' +
                            '</caption>' +
                            '<tr><th><fmt:message code="workflow.th.Serial" /></th><th><fmt:message code="workflow.th.name" /></th><th><fmt:message code="workflow.th.nextstep" /></th><th><fmt:message code="sms.th.EditStep" /></th><th><fmt:message code="notice.th.operation" /></th></tr>';

                        for (var i = 0; i < data.length; i++) {
                            var prcsTo = data[i].prcsTo;
                            if (prcsTo == "") {
                                prcsTo = [data[i].prcsId] * 1 + 1
                            } else {
                                prcsTo = data[i].prcsTo
                            }
                            html += "<tr>" + "<td>" + data[i].prcsId + "</td>" + "<td>" + data[i].prcsName + "</td>" +
                                "<td>" + data[i].prcsTo + "</td>" + "<td style='text-align: center'></td>" + "<td>" + "<a href='javascript:void(0)'></a><a href='javascript:void(0)'></a>" + "</td>" + "</tr>";

                        }
                    }
                    $('#table_form').html(html);
                    checkAll();
                }
            });
        })

        var $list = $('.cont_list li a');
        $list.each(function (index, item) {
            $(item).click(function () {
                $('.cont_r .item').eq(index).show().siblings().hide();
                if (index == 1) {
                    $('.hide_list1').toggle();
                } else if (index == 10) {
                    $('.hide_list2').toggle();
                }
            })
        });
        /*点击绑定颜色*/
        $('.btn_h').on('click', function () {
            $('.btn_h').removeClass('clickBack');
            $(this).addClass('clickBack');
        });


        /*管理权限多选删除*/
        $('#table_power').on('click', '#deleteAll', function () {
            layer.msg('<fmt:message code="menuSSetting.th.isdeleteMenu" />。。', {icon: 6})
            //获取选中项ID
            var privId = [];
            var checkBs = $(".one:checked");
            if (checkBs) {
                for (var i = 0; i < checkBs.length; i++) {
                    privId.push($(checkBs[i]).attr("privId"));
                }
            }
            $.ajax({
                type: 'get',
                url: '<%=basePath%>/flowSetDatas/deleteFlowPriv',
                dataType: 'json',
                data: {
                    'privId[]': privId
                },
                success: function (ret) {
                    if (ret.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        renderPriv();
                    } else {
                        layer.msg('<fmt:message code="lang.th.deleSucess" />。。', {icon: 6})
                    }
                }
            })
        })

        /*管理权限单个删除*/
        $('#table_power').on('click', '.delete_d', function () {
            layer.confirm('<fmt:message code="menuSSetting.th.isdeleteMenu" />？', {
                btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'] //按钮
            }, function () {
                layer.msg('<fmt:message code="workflow.th.It'sreallyImportant" />', {icon: 1});
            }, function () {
                layer.msg('<fmt:message code="workflow.th.DoThat" />', {
                    time: 20000, //20s后自动关闭
                    btn: ['<fmt:message code="workflow.th.Gotit" />', '<fmt:message code="workflow.th.kown" />']
                });
            });
            //获取选中项ID
            var privId = [];
            var pId = $(this).attr("privId");
            privId.push(pId);
            $.ajax({
                type: 'get',
                url: '<%=basePath%>/flowSetDatas/deleteFlowPriv',
                dataType: 'json',
                data: {
                    'privId[]': privId
                },
                success: function (ret) {
                    if (ret.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        renderPriv();
                    } else {
                        layer.msg('<fmt:message code="lang.th.deleSucess" />。。', {icon: 6})
                    }

                }
            })

        });
        /*定时任务修改*/
        $('.table').on('click', '.privUp', function () {
            var timerId = $(this).attr('timerId');
            var data_up = $(this).find("input").val().replace(/'/g, '"');
            var data_upTwo;
            data_upTwo = JSON.parse(data_up);
            layer.open({
                title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                shade: 0.3,
                content: '<div class="pop_con">' +
                '<div class="con_t">' +
                '<div class="con_l">' +
                '<div class="con_title">' +
                '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="workflow.th.InitiatingFrequency" /> *</span>' +
                '<div class="title_put"><select name="" id="creaRage" class="select_t"><option value="1"><fmt:message code="workflow.th.RunponlyOnce" /></option><option value="2"><fmt:message code="workflow.th.DailyRelease" /></option><option value="3"><fmt:message code="workflow.th.WeeklyRelease" /></option><option value="4"><fmt:message code="workflow.th.MonthlyRelease" /></option><option value="5"><fmt:message code="workflow.th.YearlyRelease" /></option></select></div></div>' +
                '<sapn class="title_s"><fmt:message code="workflow.th.LaunchTime" /> *</sapn>' +
                '<div class="title_2">' +
                '<input type="text" class="select_t" id="creaTime"></div>' +
                '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="workflow.th.Initiator" /> *</span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="addUser" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="addSave_u"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div></div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="worflow.th.SponsorDepartment" /> *</span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="addDep" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="addSave_d"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div>' + '</div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="workflow.th.LaunchRole" /> *</span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="addRole" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="addSave_r"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div>' + '</div>' +
                '</div></div></div>' +
                '</div>',
                area: ['600px', '500px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                success: function () {
                    $('#addUser').val(data_upTwo.userName);
                    $('#addDep').val(data_upTwo.deptName);
                    $('#addRole').val(data_upTwo.roleName);
                },
                yes: function () {
                    var creaType = $('#creaRage').val();
                    var crea_date = $('#creaTime').val();
                    console.log(creaType)
                    var dataid = $('#addUser').attr('dataid')
                    var deptid = $('#addDep').attr('deptid');
                    var privid = $('#addRole').attr('privid');

                    var dataids = new Array();
                    var deptids = new Array();
                    var privids = new Array();
                    if (dataid) {
                        dataid = dataid.split(",");
                        dataids.push(dataid)
                    }

                    if (deptid) {
                        deptid = deptid.split(",");
                        deptids.push(deptid);
                    }
                    if (privid) {
                        privid = privid.split(",");
                        privids.push(privid)
                    }
                    var data = {
                        type: creaType,
                        'date': crea_date,
                        'user[]': dataids,
                        'role[]': privids,
                        'dept[]': deptids,
                        'flowId': flowId,
                        'timerId': timerId
                    }
                    $.ajax({
                        type: 'GET',
                        url: '<%=basePath%>/flowSetDatas/updateFlowTimer',
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                layer.msg('<fmt:message code="depatement.th.Modifysuccessfully" />。。', {icon: 6})
                                dele();
                            } else {
                                layer.msg('<fmt:message code="depatement.th.modifyfailed" />。。', {icon: 6})
                            }
                        }
                    })

                }
            })

            /*弹窗控件*/
            $("#addSave_u").click(function () {
                user_id = 'addUser';
                $.popWindow("../common/selectUser");
            });
            $("#addSave_d").click(function () {
                dept_id = 'addDep';
                $.popWindow("../common/selectDept");
            })
            $("#addSave_r").click(function () {
                priv_id = 'addRole';
                $.popWindow("../common/selectPriv");
            })
            checkAll();
        });

        /*定时任务*/
        $('.btn3').click(function () {
            dele();
        });
        function dele() {
            var strData = '<caption class="clearfix"> <span class="priv_t"><fmt:message code="workflow.th.timedtask" /></span> ' +
                '<a href="javascript:void (0)" class="new_liucheng task_n"><fmt:message code="global.lang.new" /></a> ' +
                '<a href="javascript:void (0)"  id="del"></a> ' +
                '</caption>' +
                "<t><th><input type='checkbox' class='checkAll'><fmt:message code="notice.th.allchose" /></th><th><fmt:message code="workflow.th.TimingType" /></th><th><fmt:message code="workflow.th.ProcessSponsor" /></th><th><fmt:message code="workflow.th.DateOfLaunch" /></th><th><fmt:message code="workflow.th.LaunchTime" /></th><th><fmt:message code="menuSSetting.th.menuSetting" /></th></t>";
            $.ajax({
                type: 'get',
                url: '<%=basePath%>flowSetDatas/getFlowTimerList',
                dataType: 'json',
                data: {
                    flowId: flowIdFromPage
                },
                success: function (data) {
                    var data_d = data.datas;
                    if (data.flag) {
                        for (var i = 0; i < data_d.length; i++) {
                            var data_det = JSON.stringify(data_d[i]).replace(/"/g, "'");

                            strData += '<tbody>' + '<tr>' + '<td>' + '<input type="checkbox" class="one"  timerId="' + data_d[i].tid + '">' + '</td>' + '<td>' + data_d[i].typeName + '</td>' + '<td style="text-align: center;padding-left: 10px">' + function(){if(data_d[i].userName==undefined){return ''}else {return data_d[i].userName}}() + '</br>' +function(){if(data_d[i].deptName==undefined){   return ''}else {return data_d[i].deptName}}()  + '</br>' + function(){if(data_d[i].roleName==undefined){   return ''}else {return data_d[i].roleName}}() + '</td>' + '<td style="text-align: center;padding-left: 10px">' + data_d[i].remindDate + '</td>' + '<td style="text-align: center;padding-left: 10px">' + data_d[i].lastTime + '</td>' + '<td>' + '<a href="javascript:void(0)" timerId="' + data_d[i].tid + '" class="privUp fileUpdateactive" ><input type="hidden" value="' + data_det + '">修改</a>' + '<a class="del del_privactive" href="javascript:void(0)" timerId="' + data_d[i].tid + '" >删除</a>' + '</td>' + '</tr>' + '</tbody>';
                        }
                    }
                    $('#table_task').html(strData);
                    checkAll();
                }
            })
        }

        /*定时任务删除*/
        $('#table_task').on('click', '.del', function () {
            layer.msg('<fmt:message code="menuSSetting.th.isdeleteMenu" />。。', {icon: 6})
            var timerId = [];
            var pId = $(this).attr("timerId");
            timerId.push(pId);
            $.ajax({
                type: 'get',
                url: '<%=basePath%>/flowSetDatas/deleteFlowTimer',
                dataType: 'json',
                data: {
                    'timerId[]': timerId
                },
                success: function (ret) {
                    if (ret.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        dele();
                    }

                }
            })
        });
        /*定时任务多选删除*/
        $('#table_task').on('click', '#del', function () {
            layer.msg('<fmt:message code="workflow.th.que" />。。', {icon: 6})
            var timerId = [];
            var checkAlls = $('.one:checked');
            if (checkAlls) {
                for (var i = 0; i < checkAlls.length; i++) {
                    timerId.push($(checkAlls[i]).attr('timerId'));
                }
            }
            $.ajax({
                type: 'get',
                url: '<%=basePath%>/flowSetDatas/deleteFlowTimer',
                dataType: 'json',
                data: {
                    'timerId[]': timerId
                },
                success: function (ret) {
                    if (ret.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        dele();
                    }

                }
            })


        })
        /*配置查询模板*/
        $('.btn4').click(function () {
            TempPriv();
        });
        function TempPriv() {
            var html = '<caption class="clearfix"> <span class="priv_t"><fmt:message code="workflow.th.configuring" /></span> ' +
                '<a href="javascript:void (0)" class="new_liucheng temp_n"><fmt:message code="global.lang.new" /></a> ' +
                '<a href="javascript:void (0)" ></a> ' +
                '</caption>' +
                "<t><th><input type='checkbox' class='checkAll'><fmt:message code="notice.th.allchose" /></th><th><fmt:message code="sms.th.TemplateName" /></th><th><fmt:message code="sms.th.CreationDate" /></th><th><fmt:message code="notice.th.operation" /></th></t>";
            $.ajax({
                type: 'get',
                url: '<%=basePath%>/flowSetDatas/getFlowQueryTplList',
                dataType: 'json',
                data: {
                    flowId: flowIdFromPage
                },
                success: function (data) {
                    if (data.flag) {
                        var data = data.datas;
                        for (var i = 0; i < data.length; i++) {
                            html += "<tbody>" + "<tr>" + "<td>" + "<input type='checkbox' class='one'  seqId='" + data[i].seqId + "'>" + "</td>" + "<td>" + data[i].tplName + "</td>" + "<td style='text-align: center;padding-left: 10px'>" + data[i].createTime + "</td>" + "<td>" + '<a href="javascript:void(0)" class="updata_c fileUpdateactive"  seqId="' + data[i].seqId + '"><fmt:message code="depatement.th.modify" /></a>' + '<a class="del_temp del_privactive" href="javascript:void(0)" seqId="' + data[i].seqId + '" ><fmt:message code="global.lang.delete" /></a>' + "</td>" + "</tr>" + "</tbody>";

                        }
                    }
                    $('.table_temp').html(html);
                    checkAll();

                }
            })
        }

        /*配置查询模板删除*/
        $('.table_temp').on('click', '.del_temp', function () {
            layer.msg('<fmt:message code="workflow.th.que" />。。', {icon: 6})
            var seqId = [];
            var tempId = $(this).attr('seqId');
            seqId.push(tempId);
            $.ajax({
                type: 'get',
                url: '<%=basePath%>flowSetDatas/deleteFlowQuertTpl',
                dataType: "json",
                data: {
                    'tplId[]': seqId
                },
                success: function (data) {
                    if (data.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        TempPriv();
                    }

                }
            })

        });
        /*配置查询模板多选删除*/
        $('.table_temp').on('click', '.del_m', function () {
            layer.msg('<fmt:message code="workflow.th.que" />。。', {icon: 6})
            var seqIds = [];
            var checkAlls = $('.one:checked');
            if (checkAlls) {
                for (var i = 0; i < checkAlls.length; i++) {
                    seqIds.push($(checkAlls[i]).attr('seqId'));
                }
            }
            $.ajax({
                type: 'get',
                url: '<%=basePath%>flowSetDatas/deleteFlowQuertTpl',
                dataType: "json",
                data: {
                    'tplId[]': seqIds
                },
                success: function (data) {
                    if (data.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        TempPriv();
                    }

                }
            })

        })
        /*应用版式文件*/
        $('.btn5').click(function () {
            privFile();
        });
        function privFile() {
            var html = '<caption class="clearfix"> <span class="priv_t"><fmt:message code="workflow.th.applylayoutfiles" /></span> ' +
                '<a href="javascript:void (0)" class=" file_n new_liucheng"><fmt:message code="global.lang.new" /></a> ' +
                '<a href="javascript:void (0)" ></a> ' +
                '</caption>' +
                "<t><th><input type='checkbox' class='checkAll'><fmt:message code="notice.th.allchose" /></th><th><fmt:message code="sms.th.TemplateName" /></th><th><fmt:message code="sms.th.TemplateClass" /></th><th><fmt:message code="sms.th.CreationDate" /></th><th><fmt:message code="notice.th.operation" /></th></t>";
            $.ajax({
                type: 'get',
                url: '<%=basePath%>/flowSetDatas/getFlowPrintTpl',
                dataType: 'json',
                data: {
                    flowId: flowIdFromPage
                },
                success: function (data) {
                    if (data.flag) {
                        var data = data.datas;
                        for (var i = 0; i < data.length; i++) {
                            var tTypeStr = '';
                            if (data[i].tType == '1') {
                                tTypeStr = '<fmt:message code="sms.th.PrintTemplate" />'
                            } else {
                                tTypeStr = '<fmt:message code="sms.th.homePage" />'
                            }
                            var data_obj = JSON.stringify(data[i]).replace(/"/g, "'");
                            html += '<tbody>' + '<tr>' + '<td>' + '<input type="checkbox" class="one" tId="' + data[i].tId + '">' + '</td>' + '<td>' + data[i].tName + '</td>' + '<td style="text-align: center;padding-left: 10px">' + tTypeStr + '</td>' + '<td style="text-align: center;padding-left: 10px">' + data[i].createTime + '</td>' + '<td>' + '<a href="javascript:void(0)"  tId="' + data[i].tId + '" class="fileUpdate fileUpdateactive"><input type="hidden" value="' + data_obj + '"><fmt:message code="depatement.th.modify" /></a>' + '<a href="javascript:void(0)" class="del_priv del_privactive"  tId="' + data[i].tId + '"><fmt:message code="global.lang.delete" /></a>' + '</td>' + '</tr>' + '</tbody>';

                        }
                    }
                    $('.table_prc').html(html);

                    checkAll();
                }

            })
        }

        /*应用版式文件删除*/
        $('.table_prc').on('click', '.del_priv', function () {
            layer.msg('<fmt:message code="workflow.th.que" />。。', {icon: 6})
            var seqId = [];
            var tempId = $(this).attr('tId');
            seqId.push(tempId);

            $.ajax({
                url: '<%=basePath%>/flowSetDatas/deleteFlowPrintTpl',
                type: 'get',
                dataType: 'json',
                data: {
                    'tId[]': seqId
                },
                success: function (data) {
                    if (data.flag) {
                        privFile();
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                    }

                },

            })
        })
        /*应用版式文件多选删除*/
        $('.table_prc').on('click', '.delete_c', function () {
            layer.msg('<fmt:message code="workflow.th.que" />。。', {icon: 6})
            var seqId = [];
            var checkAttr = $('.one:checked')
            if (checkAttr) {
                for (var i = 0; i < checkAttr.length; i++) {
                    seqId.push($(checkAttr[i]).attr('tId'))
                }
            }
            $.ajax({
                url: '<%=basePath%>/flowSetDatas/deleteFlowPrintTpl',
                type: 'get',
                dataType: 'json',
                data: {
                    'tId[]': seqId
                },
                success: function (data) {
                    if (data.flag) {
                        layer.msg('<fmt:message code="workflow.th.delsucess" />。。', {icon: 6})
                        privFile();
                    }

                },

            })

        })

        /*管理权限查询*/
        var priv_type = ['<fmt:message code="workflow.th.Administration" />', '<fmt:message code="workflow.th.Monitor" />', '<fmt:message code="global.lang.query" />', '<fmt:message code="global.lang.edit" />', '<fmt:message code="workflow.th.Comment" />']
        $(".btn2").click(function () {
            renderPriv();
        });
        function renderPriv() {
            var html = '<caption class="clearfix"> <span class="priv_t"><fmt:message code="workflow.th.privilege" /></span> ' +
                '<a href="javascript:void (0)" class="new_liucheng" id="new"><fmt:message code="global.lang.new" /></a> ' +
                '<a href="javascript:void (0)" id="deleteAll"  ></a> ' +
                '</caption>' +
                "<tr><th><input type='checkbox' class='checkAll'><fmt:message code="notice.th.allchose" /></th><th><fmt:message code="workflow.th.PrivilegeType" /></th><th><fmt:message code="doc.th.ScopeAuthorization" /></th><th><fmt:message code="userManagement.th.ManagementScope" /></th><th><fmt:message code="notice.th.operation" /></th></tr>";
            $.ajax({
                type: 'get',
                url: "<%=basePath%>flowSetDatas/getFlowPrivList",
                dataType: "json",
                data: {
                    flowId: flowId
                },
                success: function (data) {
                    var datas = data.datas;
                    if (data.flag) {
                        for (var i = 0; i < datas.length; i++) {
                            var type = (datas[i].privType) * 1;
                            var typeStr = "<fmt:message code="workflow.th.unknownType" />";
                            if (i >= 0 && i <= 5) {
                                typeStr = priv_type[type - 1];
                            }
                            var u_d_r_Str = "";
                            if (datas[i].userName) {
                                u_d_r_Str += "<fmt:message code="journal.th.user" />:" + datas[i].userName + "</br>";
                            }
                            if (datas[i].roleName) {
                                u_d_r_Str += "<fmt:message code="userManagement.th.role" />:" + datas[i].roleName + "</br>";
                            }
                            if (datas[i].deptName) {
                                u_d_r_Str += "<fmt:message code="userManagement.th.department" />:" + datas[i].deptName + "</br>";
                            }

                            var data_g = {};
                            data_g.dept = datas[i].dept;
                            data_g.deptName = datas[i].deptName;
                            data_g.privScopeName = datas[i].privScopeName;
                            data_g.roleName = datas[i].roleName;
                            data_g.userName = datas[i].userName;
                            data_g.privType = datas[i].privType;
                            data_g.privScope = datas[i].privScope;
                            var strdata_g = JSON.stringify(data_g);

                            html += '' +
                                '<tr>' + '' +
                                '<td style="display: none">' + datas[i].id + '</td>'
                                + '<td>' + '<input type="checkbox" privId="' + datas[i].id + '" class="one">' + '</td>' +
                                '' + '<td>' + typeStr + '</td>' + '' +
                                '<td style="text-align: center;padding-left: 10px">' + u_d_r_Str + '</td>'
                                + '<td style="text-align: center;padding-left: 10px">' + datas[i].privScopeName + '</td>' +
                                '' + '<td>' + '<a href="javascript:void(0)" class="powerUpdate fileUpdateactive" privId="' + datas[i].id + '" ><input type="hidden" value=' + strdata_g + '><fmt:message code="depatement.th.modify" /></a>' +
                                '' + '<a href="javascript:void(0)" class="delete_d del_privactive" privId="' + datas[i].id + '"><fmt:message code="global.lang.delete" /></a>' + '</td>' + '</tr>';
                        }
                    }
                    $('#table_power').html(html);
                    checkAll();
                }
            })
        }

        /*管理权限新建弹窗*/
        function privUp() {
            layer.open({
                title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 10px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                shade: 0.3,
                content: '<div class="pop_con">' +
                '<div class="con_t">' +
                '<div class="con_l">' +
                '<div class="con_title">' +
                '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="workflow.th.Authorizationype" /> <label style="color: red;">*</label></span>' +
                '<div class="title_put"><select name="" id="select_t" class="select_t"><option value="1"><fmt:message code="workflow.th.Administration" /></option><option value="2"><fmt:message code="workflow.th.Monitor" /></option><option value="3"><fmt:message code="global.lang.query" /></option><option value="4"><fmt:message code="global.lang.edit" /></option><option value="5"><fmt:message code="workflow.th.Comment" /></option></select></div></div>' +
                '<sapn class="title_s"><fmt:message code="userManagement.th.ManagementScope" /> <label style="color: red;">*</label></sapn>' +
                '<div class="title_2">' +
                '<select name="" id="select_ment" class="select_t"><option value="-2"><fmt:message code="workflow.th.allpart" /></option><option value="-3"><fmt:message code="workflow.th.ThisBody" /></option><option value="-1"><fmt:message code="sys.th.ThisDepartment" /></option></select></div>' +
                '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="netdisk.th.Scope(personnel)" /><label style="color: red;">*</label></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="senduser" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="selectUser"><fmt:message code="global.lang.add" /></a><a style="margin-left: 10px;cursor: pointer" id="clear_r_c"></a></div></div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="netdisk.th.ScopeAuthorization" /><label style="color: red;">*</label></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="sendRole" user_id="admin" value="admin" disabled></textarea><span style="margin-left: 10px;cursor: pointer" id="selectUser_s"><fmt:message code="global.lang.add" /></span><span style="margin-left: 10px;cursor: pointer" id="clear_o_c"></span></div></div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="netdisk.th.Scope(role)" /><label style="color: red;">*</label></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="sendept" dept_id="admin" value="admin" disabled></textarea><span style="margin-left: 10px;cursor: pointer" id="selectUser_t"><fmt:message code="global.lang.add" /></span><span style="margin-left: 10px;cursor: pointer" id="clear_c_b"></span></div></div>' +
                '</div></div></div>' +
                '</div>',
                area: ['750px', '600px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                scrolling: 'no',
                success: function () {

                    $('#clear_r_c').click(function () {
                        $('#senduser').val(null);
                    });
                    $('#clear_o_c').click(function () {
                        $('#sendRole').val(null);
                    })
                    $('#clear_c_b').click(function () {
                        $('#sendept').val(null);
                    })
                },
                yes: function (index) {
                    if($("#senduser").attr("dataid")==undefined && $("#sendRole").attr("privid")==undefined &&
                        $("#sendept").attr("deptid")==undefined){
                        alert('<fmt:message code="workflow.th.Pleasefillinall" />')
                        return
                    }
                        var userId = $("#senduser").attr("dataid");
                        var userIdAry = new Array();
                        userIdAry.push(userId);

                        var privid = $('#sendRole').attr('privid');
                        var privIdAry = [];
                        privIdAry.push(privid);

                        var deptId = $('#sendept').attr('deptid');
                        var deptIdAry = [];
                        deptIdAry.push(deptId);


                        var scopeVal = [];
                        scopeVal.push($('#select_ment').val());
                        var data = {
                            privType: $('#select_t').val(),
                            'scope[]': scopeVal,
                            'user[]': userIdAry,
                            'role[]': privIdAry,
                            'dept[]': deptIdAry,
                            'flowId': flowId,
                        };
                        $.ajax({
                            type: 'post',
                            url: '/flowSetDatas/newFlowPriv',
                            dataType: 'json',
                            data: data,
                            success: function (data) {
                                if (data.flag) {
                                    layer.msg('<fmt:message code="depatement.th.Newsuccessfully" />。。', {icon: 6})

                                    renderPriv();
                                } else {
                                    layer.msg('<fmt:message code="depatement.th.Newfailed" />。。', {icon: 6})

                                }
                            }
                        })


                }
            })
            /*弹窗控件*/
            $("#selectUser").click(function () {
                user_id = 'senduser';
                $.popWindow("../common/selectUser");
            });
            $("#selectUser_t").click(function () {
                dept_id = 'sendept';
                $.popWindow("../common/selectDept");
            })
            $("#selectUser_s").click(function () {
                priv_id = 'sendRole';
                $.popWindow("../common/selectPriv");
            })
            checkAll();
        }

        $('.table').on('click', '#new', function () {
            privUp();
        });
        /*管理权限修改*/
        $('.table').on('click', '.powerUpdate', function () {
            var privId = $(this).attr('privId')
            var data_i = $(this).find('input').val()
            data_i = JSON.parse(data_i)
            layer.open({
                title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 10px;color: #fff"><fmt:message code="depatement.th.modify" /></p>',
                shade: 0.3,
                content: '<div class="pop_con">' +
                '<div class="con_t">' +
                '<div class="con_l">' +
                '<div class="con_title">' +
                '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="workflow.th.Authorizationype" />*</span>' +
                '<div class="title_put"><select name="" id="select_t" class="select_t"><option value="1"><fmt:message code="workflow.th.Administration" /></option><option value="2"><fmt:message code="global.lang.query" /></option><option value="3"><fmt:message code="workflow.th.allpart" /></option><option value="4"><fmt:message code="global.lang.edit" /></option><option value="5"><fmt:message code="workflow.th.Comment" /></option></select></div></div>' +
                '<sapn class="title_s"><fmt:message code="userManagement.th.ManagementScope" /> *</sapn>' +
                '<div class="title_2">' +
                '<select name="PRIV_SCOPE" id="select_ment" class="select_t"><option value="ALL_DEPT" selected="selected"><fmt:message code="workflow.th.allpart" /></option><option value="SELF_ORG"><fmt:message code="workflow.th.ThisBody" /></option><option value="SELF_DEPT"><fmt:message code="workflow.th.subordinateDepartment" /></option><option value="SELF_DEPT"><fmt:message code="workflow.th.ThisDepartment" /></option><option value="CUSTOM"><fmt:message code="workflow.th.CustomDepartments" /></option></select></div>' +
                '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="netdisk.th.Scope(personnel)" /></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="senduser" user_id="" value="" disabled userId="" ></textarea><a style="margin-left: 10px;cursor: pointer" id="selectUser"><fmt:message code="global.lang.add" /></a><a><fmt:message code="global.lang.empty" /></a></div></div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="netdisk.th.ScopeAuthorization" /></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="sendept" dept_id="" value="" disabled ></textarea><span style="margin-left: 10px;cursor: pointer" id="selectUser_t"><fmt:message code="global.lang.add" /></span><span><fmt:message code="global.lang.empty" /></span></div></div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="netdisk.th.Scope(role)" /></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="sendRole" user_id="" value="" disabled ></textarea><span style="margin-left: 10px;cursor: pointer" id="selectUser_s"><fmt:message code="global.lang.add" /></span><span><fmt:message code="global.lang.empty" /></span></div></div>' +
                '</div></div></div>' +
                '</div>',
                area: ['750px', '600px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                scrolling: 'no',
                success: function () {
                    $("#select_ment").val(data_i.privScope),
                        $('#select_t').val(data_i.privType)
                    $('#senduser').val(data_i.userName);
                    $('#sendept').val(data_i.deptName);
                    $('#sendRole').val(data_i.roleName)
                },

                yes: function () {
                    var userIdAry = new Array()
                    var userId = $("#senduser").attr("dataid");
                    userIdAry.push(userId.split(','));

                    var deptIdAry = new Array();
                    var deptId = $('#sendept').attr('deptid');
                    deptIdAry.push(deptId.split(','));

                    var privIdAry = new Array();
                    var privid = $('#sendRole').attr('privid');
                    privIdAry.push(privid.split(','));


                    var scopeArry = new Array();
                    var scopeval = $('#select_ment').val();
                    if (scopeval == "SELF_ORG") {
                        scopeval = -3;
                    } else if (scopeval == "ALL_DEPT") {
                        scopeval = -2;
                    } else if (scopeval == "SELF_DEPT") {
                        scopeval = -1;
                    }
                    scopeArry.push(scopeval);

                    var data = {
                        privType: $('#select_t').val(),
                        'scope[]': scopeArry,
                        'user[]': userId,
                        'role[]': privIdAry,
                        'dept[]': deptIdAry,
                        'flowId': flowId,
                        'privId': privId
                    };
                    $.ajax({
                        type: 'GET',
                        url: '/flowSetDatas/updateFlowPriv',
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                layer.msg('<fmt:message code="depatement.th.Modifysuccessfully" />。。', {icon: 6})
                                renderPriv();
                            } else {
                                layer.msg('<fmt:message code="depatement.th.modifyfailed" />。。', {icon: 6})
                            }
                        }
                    })
                }
            })
            /*弹窗控件*/
            $("#selectUser").click(function () {
                user_id = 'senduser';
                $.popWindow("../common/selectUser");
            });
            $("#selectUser_t").click(function () {
                dept_id = 'sendept';
                $.popWindow("../common/selectDept");
            })
            $("#selectUser_s").click(function () {
                priv_id = 'sendRole';
                $.popWindow("../common/selectPriv");
            })
            checkAll();
        })

        /*定时任务新建弹窗*/
        $('.table').on('click', '.task_n', function () {
            layer.open({
                title: '<p style="height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                shade: 0.3,
                content: '<div class="pop_con">' +
                '<div class="con_t">' +
                '<div class="con_l">' +
                '<div class="con_title">' +
                '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="workflow.th.InitiatingFrequency" /> <label style="color:red">*</label></span>' +
                '<div class="title_put"><select name="" id="creaRage" class="select_t"><option value="1"><fmt:message code="workflow.th.RunponlyOnce" /></option><option value="2"><fmt:message code="workflow.th.DailyRelease" /></option><option value="3"><fmt:message code="workflow.th.WeeklyRelease" /></option><option value="4"><fmt:message code="workflow.th.MonthlyRelease" /></option><option value="5"><fmt:message code="workflow.th.YearlyRelease" /></option></select></div></div>' +
                '<sapn class="title_s"><fmt:message code="workflow.th.LaunchTime" /> <label style="color:red">*</label></sapn>' +
                '<div class="title_2">' +
                '<input type="text" class="select_t" id="creaTime"></div>' +
                '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="workflow.th.Initiator" /> <label style="color:red">*</label></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="addUser" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="addSave_u"><fmt:message code="global.lang.add" /></a><a id="clear_r" style="margin-left: 10px;cursor: pointer"></a></div></div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="worflow.th.SponsorDepartment" /> <label style="color:red">*</label></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="addDep" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="addSave_d"><fmt:message code="global.lang.add" /></a><a style="margin-left: 10px;cursor: pointer" id="clear_b"></a></div>' + '</div>' + '<div class="title_3">' +
                '<div class="title3_label">' +
                '<span class="title_s"><fmt:message code="workflow.th.LaunchRole" /><label style="color:red">*</label></span></div>' +
                '<div class="select_put">' +
                '<textarea name="txt" id="addRole" user_id="admin" value="admin" disabled></textarea><a style="margin-left: 10px;cursor: pointer" id="addSave_r"><fmt:message code="global.lang.add" /></a><a style="margin-left: 10px;cursor: pointer" id="clear_e"></a></div>' + '</div>' +
                '</div></div></div>' +
                '</div>',
                area: ['600px', '500px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                success: function () {
                    $('#clear_r').click(function () {
                        $('#addUser').val(null);
                    });
                    $('#clear_b').click(function () {
                        $('#addDep').val(null);
                    })
                    $('#clear_e').click(function () {
                        $('#addRole').val(null);
                    })
                },
                yes: function () {
                    if($("#addUser").attr("dataid")==undefined||$("#addRole").attr("privid")==undefined||
                        $("#addDep").attr("deptid")==undefined){
                        alert('<fmt:message code="workflow.th.PleaseFillinall" />')
                        return
                    }

                    var userId = $("#addUser").attr("dataid");
                    userId = userId.split(',');
                    var deptId = $('#addDep').attr('deptid');
                    var deptIdAry = [];
                    deptIdAry.push(deptId);
                    var privid = $('#addRole').attr('privid');
                    var privIdAry = [];
                    privIdAry.push(privid);
                    var data = {
                        type: 1,
                        'date': new Date(+new Date()+8*3600*1000).toISOString().replace(/T/g,' ').replace(/\.[\d]{3}Z/,''),
                        'user[]': userId,
                        'role[]': privIdAry,
                        'dept[]': deptIdAry,
                        'flowId': flowId
                    }
                    $.ajax({
                        type: 'GET',
                        url: '<%=basePath%>/flowSetDatas/newFlowTimer',
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />',icon:1});
                            } else {
                                $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />',icon:2});
                            }
                        }
                    })
                }
            })
            /*弹窗控件*/
            $("#addSave_u").click(function () {
                user_id = 'addUser';
                $.popWindow("../common/selectUser");
            });
            $("#addSave_d").click(function () {
                dept_id = 'addDep';
                $.popWindow("../common/selectDept");
            })
            $("#addSave_r").click(function () {
                priv_id = 'addRole';
                $.popWindow("../common/selectPriv");
            })
            checkAll();
        });

        /*配置模板查询新建弹窗*/
        function layerWin() {
            layer.open({
                title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                shade: 0.3,
                content: '<div class="cont_pop">' +
                '<div class="con_flow clearfix">' +
                '<div class="over_f">' +
                '<p class="define_p flowtitle"><fmt:message code="workflow.th.TemplateBasicInformation" /></p>' +
                '<form class="pro_flow "><div class="con_form">' + '<div class="form_group form_g" style="margin-bottom: 26px">' +
                '<label for="projectName" class="flowName flow_t" ><fmt:message code="sms.th.TemplateName" /></label>' +
                '<input type="text" id="tempName">' + '</div></div></form>' +
                '<p class="define_p flowtitle"><fmt:message code="workflow.th.ProcessFilterConditions" /></p>' +
                '<form class="pro_flow "><div class="con_form con_form_c">' +
                '<div class="form_group form_g">' + '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.WorkflowStatus" /></label>' +
                '<select name="FLOW_STATUS" id="FLOW_STATUS" class="depName"><option value="ALL"><fmt:message code="email.th.own" /></option><option value="1"><fmt:message code="meet.th.IsOver" /></option><option value="0"><fmt:message code="workflow.th.InExecution" /></option>' +
                '</select></div>' +
                '<div class="form_group form_g form_c">' + '<label for="deptName" class="flowName flow_t "><fmt:message code="workflow.th.QueryRange" /></label>' +
                '<select name="FLOW_QUERY_TYPE" id="FLOW_QUERY_TYPE" class="depName"><option value="ALL"><fmt:message code="email.th.own" /></option><option value="1"><fmt:message code="workflow.th.IStarted" /></option><option value="2"><fmt:message code="workflow.th.IDidIt" /></option><option value="3"><fmt:message code="workflow.th.IManageIt" /></option></select></div>' +
                '<div class="form_group form_g form_f"><label for="deptName" class="flowName flow_t flow_q"><fmt:message code="workflow.th.ProcessStartDateRange" /> </label>' +
                '<span class="star_a"><fmt:message code="hr.th.from" /></span><input type="text" class="put" id="start_date" name="PRCS_DATE1" onclick="laydate()"><span class="star_a"><fmt:message code="global.lang.to" /></span><input type="text"class="put" id="end_date" onclick="laydate()"><span class="star_a star_d"><fmt:message code="global.lang.empty" /></span></div>' +
                '<div class="form_group form_g">' +
                '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.Name-number" /></label><select name="RUN_NAME" id="runName" class="depName"><option value="1"><fmt:message code="workflow.th.equal" /></option><option value="2"><fmt:message code="workflow.th.moreThanThe" /></option><option value="3"><fmt:message code="workflow.th.LessThan" /></option><option value="4"><fmt:message code="workflow.th.greaterOrEqualTo" /></option><option value="5"><fmt:message code="workflow.th.LessThanOrEqualTo" /></option><option value="6"><fmt:message code="workflow.th.notEqualTo" /></option><option value="7"><fmt:message code="workflow.th.Startfor" /></option><option value="8" selected><fmt:message code="hr.th.Contain" /></option><option value="9"><fmt:message code="workflow.th.Endfor" /></option></select><input type="text" name="RUN_NAME_RELATION" id="num_put" class="num_put"></div>' +
                '<div class="form_group form_g form_t">' +
                '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.PublicAttachmentName" /> </label>' + '<span style="vertical-align: 8px"><fmt:message code="hr.th.Contain" /></span>' + ' <input name="ATTACHMENT_NAME" type="text" id="attment" class="depName save_file"></div>' +
                '<div class="form_group form_g form_g_r">' +
                '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.ProcessSponsor" /></label>' +
                '<textarea name="BEGIN_NAME" id="textPut" user_id="admin" value="admin" disabled></textarea>' +
                '<a style="margin-left: 10px;cursor: pointer" id="select_User" class="save_i"><fmt:message code="global.lang.add" /></a>' +
                '<a style="margin-left: 10px;cursor: pointer" class="save_i del_v"><fmt:message code="global.lang.empty" /></a>' + '</div></div></form>' +
                '<div class="jobName flowtitle" style="font-weight: 500"><fmt:message code="workflow.th.FormDataFilter" /></div>' +
                '<form class="pro_flow flow_r"><div class="con_form"><div class="form_group form_g"><label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.Field" /></label>' +
                '<select name="" id="file_p" class="depName"></select></div>' +
                '<div class="form_group form_g style=""><label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.condition" /></label><select name="" id="term" class="depName"><option value="1"><fmt:message code="workflow.th.equal" /></option><option value="2"><fmt:message code="workflow.th.LessThan" /></option><option value="2"><fmt:message code="workflow.th.moreThanThe" /></option><option value="2"><fmt:message code="workflow.th.notEqualTo" /></option><option value="2"><fmt:message code="workflow.th.greaterOrEqualTo" /></option><option value="2"><fmt:message code="workflow.th.LessThanOrEqualTo" /></option><option value="2"><fmt:message code="workflow.th.notEqualTo" /></option><option value="2"><fmt:message code="workflow.th.Startfor" /></option><option value="2"><fmt:message code="hr.th.Contain" /></option><option value="2"><fmt:message code="workflow.th.Endfor" /></option><option value="2"><fmt:message code="workflow.th.IsEmpty" /></option></select></br>' +
                '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.value" /></label>' + '<input type="text" id="numval">' +
                '<div style="margin-left: -15px;"><a href="javascript:;" class="addbtn"><fmt:message code="workflow.th.AddFieldConditions" /></a></div>' +
                '<table class="table table_h" cellspacing="0" id="table_t" style="margin: 24px 0 24px 72px">' + '<thead><tr>' +
                '<th style="text-align: center"><fmt:message code="hr.th.number" /></th><th style="text-align: center"><fmt:message code="workflow.th.FormConditionDescription" /></th><th style="text-align: center"><fmt:message code="notice.th.operation" /></th></tr></thead>' + '</table>' +
                '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.FormConditionalFormula" /></label><input type="text" id="query_d"></div></div></form>' +
                '<div class="jobName flowtitle" style="font-weight: 500;margin-top: 26px"><fmt:message code="workflow.th.StatisticalReportOptions" /></div>' +
                '<form class="pro_flow flow_r"><div class="con_form"><div class="form_group form_g"><label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.GroupField" /></label><select name="" id="group_s" class="depName">' +
                '</select>' + '<select name="" id="groupSort" class="depName" style="margin-left: 152px">' +
                '<option value="ASC" selected="selected"><fmt:message code="netdisk.th.asc" /></option><option value="DESC"><fmt:message code="netdisk.th.desc" /></option></select></div><div class="plug_body form_group form_g" style="padding-left: 75px">' +
                '<div class="plug_body_left"><div class="list_title"><fmt:message code="workflow.th.to-do" /></div><div class="list_infomation" id="next_step_div">' +
                '<table cellspacing="0px" cellpadding="0px" width="100%" id="next_step_tab" class="next_step_tab"><tbody id="data_th"></tbody>' +
                '</table></div><div style="margin-top:10px;"><button class="btn" id="left_btn" type="button" style="border: 1px solid #c6c6c6;padding: 6px 10px;border-radius: 8px;"><fmt:message code="notice.th.allchose" /></button></div></div>' + '<div class="plug_body_center"><div class="change_right"><button type="button" style="width: 20px;height: 20px" id="btn_b1"><img src="../../img/workflow/flowsetting/icon_right_03.png"> </button></div><div class="change_left"><button type="button" style="width: 20px;height: 20px" id="btn_b2"><img src="../../img/workflow/flowsetting/icon_lift_03.png"></button></div></div>' +

                '<div class="plug_body_right"><div class="list_title"><fmt:message code="workflow.th.Alternatefield" /></div><div class="list_infomation" id="alternative_div">' +
                '<table cellspacing="0px" cellpadding="0px" width="100%" id="alternative_tab">' + '<tbody id="data_th_1"></tbody></table>' + '</div>' +
                '<div style="margin-top:10px;">' +
                '<button class="btn" id="right_btn" type="button"  style="border: 1px solid #c6c6c6;padding: 6px 10px;border-radius: 8px;">全选</button></div></div></div>' +
                '</div></form></div></div>' +
                '</div>',
                area: ['800px', '500px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                success: function () {
                    $('.del_v').click(function () {
                        $('#textPut').val(null);
                    })
                },
                yes: function () {

                    var td = $("#data_th_1 td");
                    var viewStr = "";
                    for (var i = 0; i < td.length; i++) {
                        var name = $(td[i]).attr("name");
                        if (name) {
                            viewStr += "flow_data_${flowId}." + name + ","
                        }

                    }
                    var dataConditions = $('#fileDate').attr('fileds');
                    var groupadeStr;
                    var groupadeAdd = $('#group_s').find("option:selected").attr('fields');
                    var groupadeASC = $('#groupSort').find("option:selected").val();
                    groupadeStr = groupadeAdd + groupadeASC;

                    var nameAtr = $('#FLOW_STATUS').attr('name');//工作流状态
                    var nameVal = $('#FLOW_STATUS').find("option:selected").val();//ALL
                    var atrVal = nameAtr + "\r\n" + nameVal;
                    var query_scope = $('#FLOW_QUERY_TYPE').attr('name');//查询范围
                    var query_s_a = $('#FLOW_QUERY_TYPE').find("option:selected").val();//ALL
                    var scope_ALL = query_scope + "\r\n" + query_s_a;
                    var date1 = $('#start_date').attr('name')//开始时间
                    var date_num1 = $('#start_date').val();
                    var dateVal = date1 + "\r\n" + date_num1;
                    var date2 = $('#end_date').attr('name');//结束时间
                    var date_num2 = $('#end_date').val();
                    var endVal = date2 + "\r\n" + date_num2;
                    var num_r = $('#runName').attr('name');//名称文号
                    var num_a = $('#runName').find("option:selected").val();//ALL
                    var num_w_a = $('#num_put').attr('name');
                    var num_w = $('#num_put').val();
                    var numVal = num_r + "\r\n" + num_a + "\r\n" + num_w_a + "\r\n" + num_w;
                    var empty_k = $('#num_put').attr('name');
                    var num_p = $('#num_put').val();
                    var empty_val = empty_k + "\r\n" + num_p;

                    var attment = $('#attment').attr('name');//公共附件名称
                    var attmentval = $('#attment').val();
                    var attr_val = attment + "\r\n" + attmentval;
                    var begName = $('#textPut').attr('name');//流程发起人
                    var begVal = $('#textPut').val();
                    var beg_v = begName + "\r\n" + begVal;
                    var work_f = atrVal + "\r\n" + scope_ALL + "\r\n" + dateVal + "\r\n" + endVal + "\r\n" + numVal + "\r\n" + empty_val + "\r\n" + attr_val + "\r\n" + beg_v;

                    var data = {
                        'viewFields': viewStr,
                        'tplName': $('#tempName').val(),
                        'flowId': flowIdFromPage,
                        'dataConditions': dataConditions,
                        'groupFields': groupadeStr,
                        'condFormula': $('#query_d').val(),
                        'flowConditions': work_f,
                        'dataXml': ''
                    };
                    $.ajax({
                        type: 'GET',
                        url: '<%=basePath%> / flowSetDatas//newFlowQuertTpl',
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                layer.msg('<fmt:message code="depatement.th.Newsuccessfully" />。。', {icon: 6})
                                TempPriv();
                            } else {
                                layer.msg('<fmt:message code="depatement.th.Newsuccessfully" />。。', {icon: 6})
                            }
                        }
                    });
                },
                success: function () {
                    workInit(0, [], "", "", "")
                }
            })


            $('.addbtn').click(function () {
                var fields = $('#file_p').find("option:selected").attr('fields');
                var text_d = $('#file_p').find("option:selected").text();
                var term = $('#term').find("option:selected").text();
                var numval = $('#numval').val();
                if (term == "<fmt:message code="workflow.th.equal" />") {
                    term = "=";
                } else if (term == "<fmt:message code="workflow.th.moreThanThe" />") {
                    term = ">";
                } else if (term == "<fmt:message code="workflow.th.LessThan" />") {
                    term = "<";
                } else if (term == "<fmt:message code="workflow.th.notEqualTo" />") {
                    term = "<>";
                } else if (term == "<fmt:message code="workflow.th.greaterOrEqualTo" />") {
                    term = ">=";
                } else if (term == "<fmt:message code="workflow.th.LessThanOrEqualTo" />") {
                    term = "<=";
                } else if (term == "<fmt:message code="workflow.th.Startfor" />") {
                    term = "begin";
                } else if (term == "<fmt:message code="hr.th.Contain" />") {
                    term = "include";
                } else if (term == "<fmt:message code="workflow.th.Endfor" />") {
                    term = "end";
                } else if (term == "<fmt:message code="workflow.th.IsEmpty" />") {
                    term = "null";
                }
                var html = '<tbody><tr><td style="text-align: center"></td style="text-align: center"><td id="fileDate" fileds="' + fields + term + numval + '">\'' + text_d + '\'' + term + '\'' + numval + '\'</td><td style="text-align: center"><fmt:message code="global.lang.delete" /></td></tr></tbody>'

                $('#table_t').append(html)

            })
            /*弹窗控件*/
            $("#select_User").click(function () {
                user_id = 'textPut';
                $.popWindow("../common/selectUser");
            });

        }

        var termFh = ["=", ">", "<", "<>", ">=", "<=", "begin", "include", "end", "null"];
        var fromIdtwo = 17;
        //type 0 新建 1修改
        function workInit(type, select, equals, groupBF, dataCon) {

            //存放处理后的数据
            var equalsCons = [];
            var equalsCon = {};
            //先按，分割
            var arrayCon = equals.split(',');
            //没有，号 证明是数据
            if (arrayCon.length == 0) {
                arrayCon.push(equals);
            }
            //遍历每一项
            for (var i = 0; i < arrayCon.length; i++) {
                var constr = arrayCon[i];
                //获取分割符号
                var splitStr;
                for (var j = 0; j < termFh.length; j++) {
                    if (constr.indexOf(termFh[j]) > 0) {
                        splitStr = termFh[j];
                        break;
                    }
                }
                if (splitStr) {
                    var key_value = constr.split(splitStr);
                    if (key_value.length !== 2) {
                        //数据有问题，自己处理下
                        return;
                    } else {
                        equalsCon["key"] = key_value[0];
                        equalsCon["value"] = key_value[1];
                        equalsCon["splitStr"] = splitStr;
                        equalsCons.push(equalsCon);
                    }
                }
            }
            /*分组字段*/
            var reg = /flow_data_([0-9]+)\.DATA_([0-9]+)(ASC|DESC)/;
            var regAry = groupBF.match(reg)
            var groupAry = [];
            var obj = {};
            if (regAry !== null) {
                obj["key"] = 'flow_data_' + regAry[1] + ".DATA_" + regAry[2];
                obj["value"] = regAry[3];
                groupAry.push(obj);
            }
            /*流程过滤条件*/
            var aryObj = [];
            var arry = dataCon.split("\n");
            for (var i = 0; i < arry.length; i += 2) {
                var objData = {};
                if (arry.length % 2 == 0) {
                    objData["key"] = arry[i];//偶数i
                    objData["value"] = arry[i + 1];//基数
                    aryObj.push(objData);

                }
            }
            workForm.init({
                    formhtmlurl: '../../form/formType',
                    resdata: {
                        fromId: fromIdtwo
                    },
                    flag: 3
                },
                function (data) {
                    var str = '';
                    var htmll = '';
                    var htmlr = '';
                    var groupStr = '';
                    var htmltd = '';
                    var group_s = '';
                    for (var i = 0; i < data.length; i++) {
                        if (type == 1) {
                            if (aryObj.length !== 0) {
                                var nameAttr = $('#FLOW_STATUS').attr("name");
                                var queryAttr = $('#FLOW_QUERY_TYPE').attr('name');
                                var runnameAttr = $('#runName').attr('name');
                                var attactentAttr = $('#attment').attr('name');
                                var begName = $('#textPut').attr('name');
                                var run_n_r = $('#num_put').attr('name');

                                aryObj.forEach(function (item, index) {
                                    var key = item.key.replace(/[\r\n]/g, "");
                                    if (nameAttr == key) {
                                        $('#FLOW_STATUS option[value=' + item.value + ']').attr("selected", true);
                                    } else if (queryAttr == key) {
                                        $('#FLOW_QUERY_TYPE option[value=' + item.value + ']').attr("selected", true);
                                    } else if (runnameAttr == key) {
                                        $('#runName option[value=' + item.value + ']').attr("selected", true);

                                    } else if (run_n_r == key) {
                                        $('#num_put').val(item.value)

                                    } else if (attactentAttr == key) {
                                        $('#attment').val(item.value);
                                    } else if (begName == key) {
                                        $('#textPut').val(item.value);
                                    }
                                })
                            }
                            if (groupAry.length !== 0) {
                                groupAry.forEach(function (item, index) {
                                    if (('flow_data_${flowId}.' + data[i].name) == item.key) {
                                        group_s += '<option fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>'
                                        $('#groupSort option[value=' + item.value + ']').attr("selected", true);
                                    }

                                })
                            }
                            if (equalsCons.length !== 0) {
                                equalsCons.forEach(function (item, index) {
                                    if (('flow_data_${flowId}.' + data[i].name) == item.key) {
                                        htmltd += '<tbody><tr><td style="text-align: center"></td style="text-align: center"><td id="fileDate" fileds="' + item.key + item.splitStr + item.value + '">\'' + data[i].title + '\'' + item.splitStr + '\'' + item.value + '\'</td><td style="text-align: center">删除</td></tr></tbody>'
                                    }

                                })

                            }
                            if (select.length !== 0) {
                                select.forEach(function (item, index) {
                                    if (('flow_data_${flowId}.' + data[i].name) == item) {
                                        htmlr += '<tr><td id="tr_td" name="' + data[i].name + '" class="td_d tr_td" style="cursor: pointer">' + data[i].title + '</td></tr>';
                                    } else {
                                        htmll += '<tr><td name="' + data[i].name + '" class="td_d" style="cursor: pointer">' + data[i].title + '</td></tr>';
                                        str += '<option  fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>';
                                        groupStr += '<option fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>'
                                    }

                                })

                            } else {
                                htmll += '<tr><td name="' + data[i].name + '" class="td_d" style="cursor: pointer">' + data[i].title + '</td></tr>';
                                str += '<option fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>';
                                groupStr += '<option fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>'
                            }

                        } else {
                            htmll += '<tr><td name="' + data[i].name + '" class="td_d" style="cursor: pointer">' + data[i].title + '</td></tr>';
                            str += '<option  fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>';
                            groupStr += '<option fields="flow_data_${flowId}.' + data[i].name + '" value="' + data[i].title + '">' + data[i].title + '</option>'
                        }

                    }
                    $('#data_th').html(htmll);
                    $('#file_p').html(str);
                    $('#group_s').html(groupStr);
                    $('#data_th_1').html(htmlr);
                    $('#table_t').append(htmltd);
                    $('.group_s').html(group_s);

                    $(document).delegate('#data_th tr', 'click', function () {
                        $(this).addClass('bg_d');
                    })


                    /*全选*/
                    $(document).delegate('#left_btn', 'click', function () {
                        $('#data_th tr').addClass('bg_d')
//                        $(this).html('<button id="left_btn" type="button">取消</button>');

                    });
                    $('#btn_b1').on('click', function () {
                        var htmls = $("#next_step_tab  tbody .bg_d");

                        $('#alternative_div table tbody').append(htmls);
                    });

                    $(document).delegate('#right_btn', 'click', function () {
                        $('#data_th_1 tr').addClass('bg_d')
                    });
                    $('#btn_b2').on('click', function () {
                        var htmls = $("#next_step_tab  tbody .bg_d");

                        $('#next_step_tab table tbody').append(htmls);
                    });


                    /*往左侧添加*/

                    $(document).delegate('#data_th_1 tr', 'click', function () {
                        $(this).addClass('bg_d');
                    })
                    $('#btn_b2').on('click', function () {
                        var bd = '';
                        $("#alternative_tab  tbody .bg_d").each(function (index, item) {
                            $(this).removeClass('bg_d')
                            bd += $(this)[0].outerHTML;
                            $(this).remove();
                        });

                        $('#next_step_div table tbody').append(bd);
                    })


                });
        }

        $('.table').on('click', '.temp_n', function () {
            layerWin();
        });
        /*配置查询模板修改*/
        $('.table').delegate('.updata_c', 'click', function () {
            var tplId = $(this).attr('seqId');
            $.ajax({
                type: 'GET',
                url: '<%=basePath%>/flowSetDatas/queryFlowQuertTplById',
                dataType: 'json',
                data: {
                    'tplId': tplId
                },
                success: function (data) {
                    if (data.flag) {
                        var data = data.data;
                        var dataview = data.viewExtFields;
                        dataview = dataview.split(',')
                        var viewAttr = dataview;
                        var dataCon = data.dataConditions;
                        var groupBF = data.groupByFields;
                        var flowCon = data.flowConditions;
                        layer.open({
                            title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                            shade: 0.3,
                            content: '<div class="cont_pop">' +
                            '<div class="con_flow clearfix">' +
                            '<div class="over_f">' +
                            '<p class="define_p flowtitle"><fmt:message code="workflow.th.TemplateBasicInformation" /></p>' +
                            '<form class="pro_flow "><div class="con_form">' + '<div class="form_group form_g" style="margin-bottom: 26px">' +
                            '<label for="projectName" class="flowName flow_t" ><fmt:message code="sms.th.TemplateName" /></label>' +
                            '<input type="text" id="tempName">' + '</div></div></form>' +
                            '<p class="define_p flowtitle"><fmt:message code="workflow.th.ProcessFilterConditions" /></p>' +
                            '<form class="pro_flow "><div class="con_form con_form_c">' +
                            '<div class="form_group form_g">' + '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.WorkflowStatus" /></label>' +
                            '<select name="FLOW_STATUS" id="FLOW_STATUS" class="depName"><option value="ALL"><fmt:message code="email.th.own" /></option><option value="1"><fmt:message code="meet.th.IsOver" /></option><option value="0"><fmt:message code="workflow.th.InExecution" /></option>' +
                            '</select></div>' +
                            '<div class="form_group form_g form_c">' + '<label for="deptName" class="flowName flow_t "><fmt:message code="workflow.th.QueryRange" /><fmt:message code="workflow.th.ProcessInitiator" /></label>' +
                            '<select name="FLOW_QUERY_TYPE" id="FLOW_QUERY_TYPE" class="depName"><option value="ALL"><fmt:message code="email.th.own" /></option><option value="1"><fmt:message code="workflow.th.IStarted" /></option><option value="2"><fmt:message code="workflow.th.IDidIt" /></option><option value="3"><fmt:message code="workflow.th.IManageIt" /></option></select></div>' +
                            '<div class="form_group form_g form_f"><label for="deptName" class="flowName flow_t flow_q"><fmt:message code="workflow.th.ProcessStartDateRange" /> </label>' +
                            '<span class="star_a">从</span><input type="text" class="put" id="start_date" name="PRCS_DATE1" onclick="laydate()"><span class="star_a"><fmt:message code="global.lang.to" /></span><input type="text"class="put" id="end_date" onclick="laydate()"><span class="star_a star_d"><fmt:message code="global.lang.empty" /></span></div>' +
                            '<div class="form_group form_g">' +
                            '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.Name-number" /> </label><select name="RUN_NAME" id="runName" class="depName"><option value="1"><fmt:message code="workflow.th.equal" /></option><option value="2"><fmt:message code="workflow.th.moreThanThe" /></option><option value="3"><fmt:message code="workflow.th.LessThan" /></option><option value="4"><fmt:message code="workflow.th.greaterOrEqualTo" /></option><option value="5"><fmt:message code="workflow.th.LessThanOrEqualTo" /></option><option value="6"><fmt:message code="workflow.th.notEqualTo" /></option><option value="7"><fmt:message code="workflow.th.Startfor" /></option><option value="8" selected><fmt:message code="hr.th.Contain" /></option><option value="9"><fmt:message code="workflow.th.Endfor" /></option></select><input type="text" name="RUN_NAME_RELATION" id="num_put" class="num_put"></div>' +
                            '<div class="form_group form_g form_t">' +
                            '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.PublicAttachmentName" /> </label>' + '<span style="vertical-align: 8px"><fmt:message code="hr.th.Contain" /></span>' + ' <input name="ATTACHMENT_NAME" type="text" id="attment" class="depName save_file"></div>' +
                            '<div class="form_group form_g form_g_r">' +
                            '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.ProcessInitiator" /></label>' +
                            '<textarea name="BEGIN_NAME" id="textPut" user_id="admin" value="admin" disabled></textarea>' +
                            '<a style="margin-left: 10px;cursor: pointer" id="select_User" class="save_i"><fmt:message code="global.lang.add" /></a>' +
                            '<a style="margin-left: 10px;cursor: pointer" class="save_i del_v"><fmt:message code="global.lang.empty" /></a>' + '</div></div></form>' +
                            '<div class="jobName flowtitle" style="font-weight: 500"><fmt:message code="workflow.th.FormDataFilter" /></div>' +
                            '<form class="pro_flow flow_r"><div class="con_form"><div class="form_group form_g"><label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.Field" /></label>' +
                            '<select name="" id="file_p" class="depName"></select></div>' +
                            '<div class="form_group form_g style=""><label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.condition" /></label><select name="" id="term" class="depName"><option value="1"><fmt:message code="workflow.th.equal" /></option><option value="2"><fmt:message code="workflow.th.LessThan" /></option><option value="2"><fmt:message code="workflow.th.moreThanThe" /></option><option value="2"><fmt:message code="workflow.th.notEqualTo" /></option><option value="2"><fmt:message code="workflow.th.greaterOrEqualTo" /></option><option value="2"><fmt:message code="workflow.th.LessThanOrEqualTo" /></option><option value="2"><fmt:message code="workflow.th.notEqualTo" /></option><option value="2"><fmt:message code="workflow.th.Startfor" /></option><option value="2"><fmt:message code="hr.th.Contain" /></option><option value="2"><fmt:message code="workflow.th.Endfor" /></option><option value="2"><fmt:message code="workflow.th.IsEmpty" /></option></select></br>' +
                            '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.value" /></label>' + '<input type="text" id="numval">' +
                            '<div style="margin-left: -15px;"><a href="javascript:;" class="addbtn"><fmt:message code="workflow.th.AddFieldConditions" /></a></div>' +
                            '<table class="table table_h" cellspacing="0" id="table_t" style="margin: 24px 0 24px 72px">' + '<thead><tr>' +
                            '<th style="text-align: center"><fmt:message code="hr.th.number" /></th><th style="text-align: center"><fmt:message code="workflow.th.FormConditionDescription" /></th><th style="text-align: center"><fmt:message code="notice.th.operation" /></th></tr></thead>' + '</table>' +
                            '<label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.FormConditionalFormula" /></label><input type="text" id="query_d"></div></div></form>' +
                            '<div class="jobName flowtitle" style="font-weight: 500;margin-top: 26px"><fmt:message code="workflow.th.StatisticalReportOptions" /></div>' +
                            '<form class="pro_flow flow_r"><div class="con_form"><div class="form_group form_g"><label for="deptName" class="flowName flow_t"><fmt:message code="workflow.th.GroupField" /></label><select name="" id="group_s" class="depName">' +
                            '</select>' + '<select name="" id="groupSort" class="depName" style="margin-left: 152px">' +
                            '<option value="ASC" selected="selected"><fmt:message code="netdisk.th.asc" /></option><option value="DESC"><fmt:message code="netdisk.th.desc" /></option></select></div><div class="plug_body form_group form_g" style="padding-left: 75px">' +
                            '<div class="plug_body_left"><div class="list_title"><fmt:message code="workflow.th.to-do" /></div><div class="list_infomation" id="next_step_div">' +
                            '<table cellspacing="0px" cellpadding="0px" width="100%" id="next_step_tab" class="next_step_tab"><tbody id="data_th"></tbody>' +
                            '</table></div><div style="margin-top:10px;"><button class="btn" id="left_btn" type="button" style="border: 1px solid #c6c6c6;padding: 6px 10px;border-radius: 8px;"><fmt:message code="notice.th.allchose" /></button></div></div>' + '<div class="plug_body_center"><div class="change_right"><button type="button" style="width: 20px;height: 20px" id="btn_b1"><img src="../../img/workflow/flowsetting/icon_right_03.png"> </button></div><div class="change_left"><button type="button" style="width: 20px;height: 20px" id="btn_b2"><img src="../../img/workflow/flowsetting/icon_lift_03.png"></button></div></div>' +

                            '<div class="plug_body_right"><div class="list_title"><fmt:message code="workflow.th.Alternatefield" /></div><div class="list_infomation" id="alternative_div">' +
                            '<table cellspacing="0px" cellpadding="0px" width="100%" id="alternative_tab">' + '<tbody id="data_th_1"></tbody></table>' + '</div>' +
                            '<div style="margin-top:10px;">' +
                            '<button class="btn" id="right_btn" type="button"  style="border: 1px solid #c6c6c6;padding: 6px 10px;border-radius: 8px;"><fmt:message code="notice.th.allchose" /></button></div></div></div>' +
                            '</div></form></div></div>' +
                            '</div>',
                            area: ['800px', '500px'],
                            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],

                            yes: function () {
                                var td = $("#data_th_1 td");
                                var viewStr = "";
                                for (var i = 0; i < td.length; i++) {
                                    var name = $(td[i]).attr("name");
                                    if (name) {
                                        viewStr += "flow_data_${flowId}." + name + ","
                                    }

                                }
                                var dataConditions = $('#fileDate').attr('fileds');
                                var groupadeStr;
                                var groupadeAdd = $('#group_s').find("option:selected").attr('fields');
                                var groupadeASC = $('#groupSort').find("option:selected").val();
                                groupadeStr = groupadeAdd + groupadeASC;

                                var nameAtr = $('#FLOW_STATUS').attr('name');//工作流状态
                                var nameVal = $('#FLOW_STATUS').find("option:selected").val();//ALL
                                var atrVal = nameAtr + "\r\n" + nameVal;
                                var query_scope = $('#FLOW_QUERY_TYPE').attr('name');//查询范围
                                var query_s_a = $('#FLOW_QUERY_TYPE').find("option:selected").val();//ALL
                                var scope_ALL = query_scope + "\r\n" + query_s_a;
                                var date1 = $('#start_date').attr('name')//开始时间
                                var date_num1 = $('#start_date').val();
                                var dateVal = date1 + "\r\n" + date_num1;
                                var date2 = $('#end_date').attr('name');//结束时间
                                var date_num2 = $('#end_date').val();
                                var endVal = date2 + "\r\n" + date_num2;
                                var num_r = $('#runName').attr('name');//名称文号
                                var num_a = $('#runName').find("option:selected").val();//ALL
                                var numVal = num_r + "\r\n" + num_a;
                                var empty_k = $('#num_put').attr('name');
                                var num_p = $('#num_put').val();
                                var empty_val = empty_k + "\r\n" + num_p;

                                var attment = $('#attment').attr('name');//公共附件名称
                                var attmentval = $('#attment').val();
                                var attr_val = attment + "\r\n" + attmentval;
                                var begName = $('#textPut').attr('name');//流程发起人
                                var begVal = $('#textPut').val();
                                var beg_v = begName + "\r\n" + begVal;
                                var work_f = atrVal + "\r\n" + scope_ALL + "\r\n" + dateVal + "\r\n" + endVal + "\r\n" + numVal + "\r\n" + empty_val + "\r\n" + attr_val + "\r\n" + beg_v;

                                var data = {
                                    'viewFields': viewStr,
                                    'tplName': $('#tempName').val(),
                                    'flowId': flowIdFromPage,
                                    'dataConditions': dataConditions,
                                    'groupFields': groupadeStr,
                                    'condFormula': $('#query_d').val(),
                                    'flowConditions': work_f,
                                    'dataXml': '',
                                    'tplId': tplId
                                };
                                $.ajax({
                                    type: 'GET',
                                    url: '<%=basePath%>/flowSetDatas/updateFlowQuertTpl',
                                    dataType: 'json',
                                    data: data,
                                    success: function (data) {
                                        if (data.flag) {
                                            layer.msg('<fmt:message code="depatement.th.Modifysuccessfully" />。。', {icon: 6})
                                            TempPriv();
                                        } else {
                                            layer.msg('<fmt:message code="depatement.th.Modifysuccessfully" />。。', {icon: 6})
                                        }
                                    }
                                })
                            },
                            success: function () {
                                workInit(1, viewAttr, dataCon, groupBF, flowCon);
                                $("#select_User").click(function () {
                                    user_id = 'textPut';
                                    $.popWindow("../common/selectUser");
                                });
                                $('#del_v').click(function () {
                                    $('#textPut').val(null);
                                })
                            }
                        })

                        $('#tempName').val(data.tplName);
                        $('#query_d').val(data.condFormula);

                    }
                }
            })

        })
        /*应用版式文件弹窗*/
        $('.table').on('click', '.file_n', function () {
            layer.open({
                title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                shade: 0.3,
                content: '<div class="pop_con">' +
                '<div class="con_t">' +
                '<div class="con_l">' +
                '<div class="con_title">' +
                '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="sms.th.TemplateName" /> *</span>' +
                '<div class="title_put"><input type="text" id="select_con" class="select_t"></div></div>' +
                '<div class="title_2">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="sms.th.TemplateClass" /> *</span>' +
                '<div class="title_put"><select name="" id="select_type" class="select_t"><option value ><fmt:message code="sms.th.selectTemplateClass" /></option><<option value="1" selected="selected"><fmt:message code="sms.th.PrintTemplate" /></option><option value="2" ><fmt:message code="sms.th.HandwrittenApproval" /></option></select></div></div>' + '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="sms.th.templateFile" /> *</span>' +
                '<textarea name="" id="addtext" disabled style="cursor: pointer"><fmt:message code="sms.th.SelectTemplateFile" /></textarea></div>' +
                '</div></div></div>' +
                '</div>',

                area: ['600px', '500px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                success: function () {
                    $('#addtext').click(function () {
                        layer.msg('<fmt:message code="sup.th.UnderDevelopment" />。。', {icon: 6})
                    })
                },
                yes: function () {
                    var data = {
                        'tName': $('#select_con').val(),
                        'tType': $('#select_type option:selected').val(),
                        'flowId': flowId,
                    }
                    $.ajax({
                        type: 'GET',
                        url: '/flowSetDatas/newFlowPrintTpl',
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                layer.msg('<fmt:message code="depatement.th.Newsuccessfully" />。。', {icon: 6})
                                privFile();
                            } else {
                                layer.msg('<fmt:message code="depatement.th.Newfailed" />。。', {icon: 6})
                            }
                        }
                    });
                }
            })
        });
        /*应用版式文件修改*/
        $('.table').on('click', '.fileUpdate', function () {
            var tId = $(this).attr('tId');
            var data_attr = $(this).find("input").val().replace(/'/g, '"');
            var objData = JSON.parse(data_attr);

            layer.open({
                title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 15px;color: #fff"><fmt:message code="global.lang.new" /></p>',
                shade: 0.3,
                content: '<div class="pop_con">' +
                '<div class="con_t">' +
                '<div class="con_l">' +
                '<div class="con_title">' +
                '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="sms.th.TemplateName" />*</span>' +
                '<div class="title_put"><input type="text" id="select_con" class="select_t"></div></div>' +
                '<div class="title_2">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="sms.th.TemplateClass" /> *</span>' +
                '<div class="title_put"><select name="" id="select_type" class="select_t"><option value ><fmt:message code="sms.th.selectTemplateClass" /></option><option value="1" ><fmt:message code="sms.th.PrintTemplate" /></option><option value="2" ><fmt:message code="sms.th.HandwrittenApproval" /></option></select></div></div>' + '<div class="title_1">' +
                '<div class="title_label"></div>' +
                '<span class="title_s"><fmt:message code="sms.th.templateFile" /> *</span>' +
                '<textarea name="" id="addtext" disabled><fmt:message code="sms.th.SelectTemplateFile" /></textarea></div>' +
                '</div></div></div>' +
                '</div>',

                area: ['600px', '500px'],
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                success: function () {

                    $('#select_con').val(objData.tName)
                    $('#select_type').val(objData.tType)
                },
                yes: function () {
                    var data = {
                        'tName': $('#select_con').val(),
                        'tType': $('#select_type option:selected').val(),
                        'flowId': flowId,
                        'tId': tId
                    }
                    $.ajax({
                        type: 'GET',
                        url: '/flowSetDatas/updateFlowPrintTpl',
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                layer.msg('<fmt:message code="menuSSetting.th.editSuccess" />。。', {icon: 6})
                                privFile();
                            } else {
                                layer.msg('<fmt:message code="menuSSetting.th.editFail" />。。', {icon: 6})
                            }
                        }
                    });

                }

            })


        });

        /*全选非全选*/
        function checkAll() {
            $('.checkAll').on('click', function () {
                $('.one').prop('checked', $(this).prop('checked'));
            });
            $('.one').click(function () {
                $('.checkAll').prop('checked', $('.one').length == $('.one:checked').length ? true : false);
            })
        }

        checkAll();
    });


</script>

</html>
