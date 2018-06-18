
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/workflow/index.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base/base.css"/>
    <%--<link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>--%>
    <link rel="stylesheet" href="/css/workflow/flowtype/formtypeDesign.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" ></script>
    <script type="text/javascript" src="/lib/jquery.form.min.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script type="text/javascript" src="../../lib/easyui/jquery.easyui.min.js" ></script>
    <script type="text/javascript" src="../../lib/easyui/tree.js" ></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="/js/workflow/flowtype/formtypeDesign.js"></script>
    <title><fmt:message code="main.designform"/></title>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <style>
        .footer_span_space{
            margin-right:8px;
        }
        .edit{
            margin-right:15px;
        }
    </style>
</head>
<body>
<div class="head-top">
    <div class="head-img">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_processdesign_03.png" alt="">
        </div>
    <div class="div-title">
        <fmt:message code="workflow.th.formdis"/>
    </div>

    <div class="head_mids">
        <input name="form_value" type="text" placeholder="<fmt:message code="workflow.th.bmc"/>">
        <img id="btn_search" src="../../img/reaschbutton.png" alt="">
    </div>

    <span id="head_rig" class="new_liucheng fr editAnddele" data-type="new" style="margin-top: 8px;margin-right: 10px;">
        <img  src="../../img/mywork/newbuildworjk.png" alt="">
         <span> <fmt:message code="global.lang.new" /></span>
    </span>

</div>


<div class="wrap" style="margin-top: 46px;">
    <div class="cont">
        <div class="cont_left" id="cont_left">
            <div class="left_all">
                <div class="ul_all" id="li_parent">

                </div>
            </div>

        </div>
        <div class="cont_rig">

        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    function cbCallBack(deptId) {
        if(deptId=="ALL_DEPT"){
            $('[name="deptId"]').val(-1);
        }
    }

    function renderDatas(data) {//数据查询的展示
        var html="";
        for(var i =0 ;i<data.length;i++){
            html+=  '<div class="new_excell" id="new_excell1">'+
                '<div class="new_excell_main" formId="'+data[i].formId+'" >'+
                '<a class="set" formId="'+data[i].formId+'" title="<fmt:message code="global.lang.edit"/>" href="javascript:void(0)"><div class="new_excell_head"><span class="new_excell_name">&nbsp;'+data[i].formName+'</span></div>'+
                '<div class="new_excell_info"><div class="new_excell_info_main">'+
                ' <div style="float: left;text-align: center;margin: 0 auto;">'+
                ' <img src="../../img/workflow/icon_form_10.png" class="new_excell_pic">'+
                ' <ul class="new_excell_info_other">'+
                ' <li><span class="new_excell_info_username">'+data[i].sortName+'</span></li>'+
                '<li style="font-size: 12px;height: 16px;line-height: 16px;float: left;"><span class="new_excell_info_time" style="margin-left: 13px;color: #999;"><fmt:message code="workflow.th.TableType"/></span></li>'+
                '</ul>'+
                '</div>'+
                '</div>'+
                ' <div style="position: absolute;bottom: 5px;left: 20px;"><div style="width:200px;margin-bottom:4px;">'+
                '<img src="" class="new_excell_info_img position_img" style="vertical-align: middle;">'+
                '<span class="new_excell_info_username" style="font-size: 12px;margin-left: 5px;color: #999;"><fmt:message code="workflow.th.sector"/>：'+data[i].depName+'</span>'+
                ' </div>'+
                ' </div>'+
                ' </div>'+
                '</a>'+
                ' <div class="new_excell_footer">' +
                ' <img src="../../img/mydesk_icon_export_35.png" class="deldel_yulan" style="float:left;margin-left:12px">'+
                '<a href="/form/outForm?formId='+data[i].formId+'" target="_blank" style="margin-left: 5px;float:left;margin-top: 5px;display: inline-block;color: #fff;"><fmt:message code="global.lang.report"/></a>' +
                '<span class="footer_span_space" style="margin-left:10px;float:left">&nbsp;|&nbsp;</span>'+
                '<span class="foot_span_show" formId="'+data[i].formId+'" ><fmt:message code="global.lang.view"/></span>'+
                ' <img src="../../img/workflow/icon_preview_07.png" class="deldel_yulan" >'+
                '<span class="footer_span_space">&nbsp;|&nbsp;</span>'+
                '<span class="deldel" id="deldel" formId="'+data[i].formId+'" sortId="'+data[i].formSort+'" ><fmt:message code="global.lang.delete"/></span>'+
                ' <img src="../../img/workflow/new_excell_info_img_shanchu.png" class="deldel_img" >'+
                '<span class="footer_span_space">&nbsp;|&nbsp;</span>'+
                '<span class="edit editAnddele" depName="'+data[i].depName+'" data-type="edit" id="edit" formId="'+data[i].formId+'" formName="'+data[i].formName+'" deptId="'+data[i].deptId+'"  formSort="'+data[i].formSort+'" ><fmt:message code="global.lang.edit"/></span>'+
                '<img src="../../img/workflow/new_excell_info_img_bianji.png" class="edit_img">'+
                ''+
                '</div>'+
                '</div>'+
                '</div>';
        }
        $(".cont_rig").html(html);
    }



    $(function () {

        $(document).on('click','.deldel',function () {
            var me=this;
            $.layerConfirm({title:'<fmt:message code="workflow.th.suredel"/>',content:'<fmt:message code="workflow.th.que"/>？',icon:0},function(){

                var formId = $(me).attr("formId");
                var sortId=$(me).attr("sortId");
                $.ajax({
                    url:'../../form/deleteForm',
                    type:'post',
                    dataType:'json',
                    data:{formId:formId},
                    success:function (ret) {
                        if(ret.flag==true){
                            $.layerMsg({content:'<fmt:message code="workflow.th.delsucess"/>',icon:1});
                            $.ajax({
                                url:'../../form/formlistbysort',
                                type:'post',
                                dataType:'json',
                                data:{sortId:sortId},
                                success:function (ret) {
                                    var sortId=$('#sort_parent option:checked').attr('value');
                                    if(ret.flag==true){
                                        renderDatas(ret.datas);
                                    }else{
                                        noDatas();
                                    }
                                }
                            });

                        }else{
                            $.layerMsg({content:ret.msg,icon:2});

                        }

                    },
                });
            })

        })



        $(document).on('click','.editAnddele',function () {
            var me=this;
            var str='',url='';
            if($(me).attr('data-type')=='new'){
                str='<fmt:message code="global.lang.new"/>';
                url='/form/newForm';
            }else {
                str='<fmt:message code="global.lang.edit"/>';
                url='/form/updateForm';
            }
            layer.open({
                type:1,
                offset: '80px',
                area: ['600px', '400px'], //宽高
                title:[str, 'background-color:#2b7fe0;color:#fff;'],
                closeBtn: 1,
                content:
                '<form id="new_liucheng_form" action="'+url+'"  enctype="multipart/form-data" method="post" >' +
                '<input type="hidden" name="formId" >' +
                '<div id=""class="layui-layer-content" style="height: 298px;overflow:-Scroll;overflow-y:hidden;">' +
                '<div class="conter">' +
                '<div class="f_title">' +
                '<div class="f_field_block" style="margin-top:48px">' +
                '<div class="f_field_label" style="width:100px;float:left">' +
                '<span class="f_field_title"><fmt:message code="workflow.th.formname"/>:</span>\
                </div>'+
                '<div class="f_field_ctrl clear">' +
                '<input type="text" class="inp name_biaodan" name="formName" size="30" maxlength="100" value="" id="sort_name" style="margin-left: 0px;margin-top: 0px"; placeholder="&nbsp;<fmt:message code="workflow.th.fillName"/>"><font class="mustinput">*</font>\
                </div>\
                </div>\
                <span class="f_field_title" style="width:95px;float:left"><fmt:message code="workflow.th.formfather"/>:</span>\
                <div class="f_field_ctrl clear">\
                <select name="formSort" id="sort_parent"></select>\
                <span><fmt:message code="workflow.th.fristNull"/></span>\
                </div>'+
                '<div class="f_field_block" style="position:relative">' +
                '<span style="position:absolute;top:62px;left:70px;font-weight:bold" class="enInport"><fmt:message code="workflow.th.Import"/>:</span>' +
                '<div class="f_field_label" style="width:100px;float:left">' +
                '<span class="f_field_title"><fmt:message code="workflow.th.sector"/>:</span>\
                </div>\
                <div class="f_field_label" style="width:100px;float:left">\
                <div class="f_field_ctrl clear">\
                <input type="text" id="deptIds" readonly="readonly" style="margin-top:0px;margin-left:0px" class="inp">\
                <a href="javascript:void(0)" style="    position: absolute;\
                top: 10px;\
                right: 104px;" class="deptidBtn"><fmt:message code="global.lang.select"/></a>\
                <input type="hidden" name="deptId" value="0">\
                <div class="drmenu" style="float:left">\
                <input type="file" name="file" value="" style="width:100%">\
                </div>\
                </div>\
                </div>\
                </div>\
                </div>\
                </div>\
                </div>\
                </form>',
                btn:['<fmt:message code="global.lang.save"/>', '<fmt:message code="global.lang.close"/>'],
                success:function () {
                    var language=$.cookie('language');
                    console.log(language)
                    if(language=='zh_CN'){
                        $('.conter').width(461);
                    }else{
                        $('.conter').width(520);
                        $('.enInport').css('left','53px');
                        $('.deptidBtn').css('right','165px');
                    }


                    if($(me).attr('data-type')=='edit'){
                        var formId = $(me).attr("formId");

                        var formName = $(me).attr("formName");
                        var formSort = $(me).attr("formSort");
                        var depname = $(me).attr("depname");

                        var deptId =$(me).attr("deptId");
                        $('[name="formName"]').val(formName)
                        $('[name="formId"]').val(formId)
                        $('[name="deptId"]').val(deptId)
                        $('#deptIds').val(depname)


                    }
                    $('.deptidBtn').click(function () {
                        dept_id='deptIds'
                        $.popWindow('/common/selectDept?0')
                    })
                    var opt_li='<option value="0"  class="levelleft0"></option>';
                    item(function (data) {
                        opt_li=Child(data,opt_li,0,-1);
                        $('#sort_parent').html(opt_li);
                        if($(me).attr('data-type')=='edit'){
                            $('#sort_parent').val(formSort)
                        }
                    })




                },
                yes:function (index) {
                    if($('.name_biaodan').val()==''){
                        alert('<fmt:message code="workflow.th.notnull"/>');
                    }else{
//                        var layerIndex = layer.load(0, {shade: false});
                        if($('#deptIds').attr('deptid')!=undefined) {
                            if ($('#deptIds').attr('deptid').indexOf(',') != -1) {
                                $('#deptIds').attr('deptid', $('#deptIds').attr('deptid').replace(',', ''))
                            }
                        }

                        $('[name="deptId"]').val($('#deptIds').attr('deptid'))

                        $('#new_liucheng_form').ajaxSubmit({
                            dataType:'html',
                            success:function(objs){
                                var obj=JSON.parse(objs);
                                if(obj.flag==true){

                                    $.layerMsg({content:'<fmt:message code="user.th.SuccessfulOperation"/>',icon:1},function () {
                                        var sortId=$('#sort_parent option:checked').attr('value');
                                        $.ajax({
                                            url:'../../form/formlistbysort',
                                            type:'post',
                                            dataType:'json',
                                            data:{sortId:sortId},
                                            success:function (ret) {
                                                if(ret.flag==true){
                                                    renderDatas(ret.datas);

                                                }else{
                                                    noDatas();
                                                }
                                                $("#li_parent li").find("div").removeClass("tree-node-selected");
                                                $("#li_parent li").find("div[node-id='"+sortId+"']").addClass("tree-node-selected");   //设置第一个节点高亮
                                                var n = $("#li_parent").tree("getSelected");

                                                if(n!=null){

                                                    $("#li_parent").tree("select",n.target);
                                                    var parentN=n;
                                                    while(true){
                                                        parentN=$("#li_parent").tree('getParent',parentN.target);
                                                        if(parentN==null) break;
                                                        $("#li_parent").tree("expand",parentN.target);
                                                    }

                                                }
                                                layer.closeAll()
                                            }
                                        });
                                    })


                                }else {
                                    $.layerMsg({content:obj.msg,icon:2},function () {
                                        layer.closeAll()
                                    })
                                }
                            }
                        });

                    }
                }

            })
        })



    })

</script>

</html>
