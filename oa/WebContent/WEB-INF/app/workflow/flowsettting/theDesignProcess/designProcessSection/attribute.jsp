<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/8/14
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.defineprocess" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <link rel="stylesheet" href="/css/workflow/work/attributeTwo.css">
</head>
<body>

<div class="define_r clearfix">
    <label style="float: left;padding-left: 23px;font-weight: bold"><fmt:message code="workflow.th.defineprocess" /></label>
    <span style="float: right"><a href="javascript:void(0)" class="keepmsg"><fmt:message code="global.lang.save" /></a></span>
</div>




<form id="uploadimgform" target="uploadiframe" action="" enctype="multipart/form-data" method="post">
    <div class="cont_r" style="margin-left: 0px;margin-top: 48px;">
        <input type="hidden" name="attachmentId">
        <input type="hidden" name="attachmentName">
        <input type="hidden" name="flowDesc">
        <input type="hidden" name="flowId">
        <div class="over_f  con_flow">
            <p class="define_p"><fmt:message code="workflow.th.basicattributes" /></p>
            <div class="con_form">
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workflow.th.processname" /> <span>*</span></label>
                    <input type="text" name="flowName" id="projectName">
                </div>
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workflow.th.process" /><span>*</span></label>
                    <select name="flowSort" id="classfiy" class="depName">
                        <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                    </select>
                </div>
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workflow.th.flowtype" /> <span>*</span></label>
                    <select name="flowType" id="class_f" class="depName">
                        <option value="1"><fmt:message code="workflow.th.fixedflow" /></option>
                        <%--<option value="2"><fmt:message code="workflow.th.freeflow" /></option>--%>
                    </select>
                </div>
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workfolw.th.form" /> <span>*</span></label>
                    <select name="formId" id="leave" class="depName">
                        <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                    </select>
                </div>
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workflow.th.delegatetype" /><span>*</span></label>
                    <select name="freeOther" id="delegate-type" class="depName">
                        <option value="2"><fmt:message code="workflow.th.freecommission" /></option>
                        <option value="1"><fmt:message code="workflow.th.handlers" /></option>
                        <option value="3"><fmt:message code="workflow.th.permissions" /></option>
                        <option value="0"><fmt:message code="workflow.th.nodelegation" /></option>
                    </select>
                </div>
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workflow.th.sector" /> <span>*</span></label>
                    <select name="deptId" id="deptName" class="depName">
                        <option value=""><fmt:message code="hr.th.PleaseSelect" /></option>
                    </select>
                </div>
                <div class="form_group">
                    <label class="flowName"><fmt:message code="workflow.th.sortnumber" /></label>
                    <input type="text" name="flowNo" id="orderID">
                </div>
                <div class="form_group sex_r">
                    <label class="flowName"><fmt:message code="workflow.th.circulate" /></label>
                    <input type="radio" name="viewPriv" value="1" class="radio_s" >
                    <label class="sex_n " ><fmt:message code="global.lang.yes" /></label>
                    <input type="radio" name="viewPriv" value="0" class="radio_s" >
                    <label class="sex_save"><fmt:message code="global.lang.no" /><!--</label--></label>
                </div>
                <div class="form_group block_n" style="padding-left: 24%;display: none">
                    <div class="title_3" style="margin-top: 0;">
                        <div class="title3_label">
                            <span class="title_s"><fmt:message code="workflow.th.chuan" /></span></div>
                        <div class="select_put">
                            <textarea name="txt" id="text_1" user_id="" value="admin" disabled=""></textarea>
                            <a style="margin-left: 10px;cursor: pointer;color: #3994f7;" id="add_f_1"><fmt:message code="global.lang.add" /></a><a class="clearAll" style="    color: #3994f7;"><fmt:message code="global.lang.empty" /></a></div>
                        <input type="hidden" name="viewUser" value="">
                        <input type="hidden" name="viewUserName">
                    </div>
                    <div class="title_3">
                        <div class="title3_label">
                            <span class="title_s"><fmt:message code="workflow.th.chuanyueren" /></span></div>
                        <div class="select_put">
                            <textarea name="txt" id="text_2" user_id="admin" value="admin" disabled="" deptid=""></textarea>
                            <a style="margin-left: 10px;cursor: pointer;color: #3994f7;" id="add_f_2"><fmt:message code="global.lang.add" /></a>
                            <a class="clearAll" style="color: #3994f7;"><fmt:message code="global.lang.empty" /></a>
                            <input type="hidden" name="viewDept" value="">
                            <input type="hidden" name="viewDeptName">
                        </div>
                    </div>
                    <div class="title_3">
                        <div class="title3_label">
                            <span class="title_s"><fmt:message code="sms.th.CirculatinRole" /></span></div>
                        <div class="select_put">
                            <textarea name="txt" id="text_3" user_id="admin" value="admin" disabled="" userpriv=""></textarea>
                            <a style="margin-left: 10px;cursor: pointer;    color: #3994f7;" id="add_f_3"><fmt:message code="global.lang.add" /></a>
                            <a class="clearAll" style="    color: #3994f7;"><fmt:message code="global.lang.empty" /></a>
                            <input type="hidden" name="viewRole" value="">
                            <input type="hidden" name="viewRoleName">
                        </div>
                    </div>
                </div>

                <div class="form_group sex_r">
                    <label class="flowName"><fmt:message code="workflow.th.Ne" /></label>
                    <input type="radio" name="flowDoc" value="1" checked="checked"><label class="sex_n"><fmt:message code="global.lang.yes" /></label>
                    <input type="radio" name="flowDoc" value="0"><label class="sex_save"><fmt:message code="global.lang.no" /></label>
                </div>

                <div class="form_group sex_r">
                    <label class="flowName"><fmt:message code="workflow.th.Versioning" /></label>
                    <input type="radio" name="isVersion" value="1" checked="checked"><label class="sex_n"><fmt:message code="global.lang.yes" /></label>
                    <input type="radio" name="isVersion" value="0"><label class="sex_save"><fmt:message code="global.lang.no" /></label>

                </div>

                <div class="form_group sex_r sex_r_f">
                    <label class="flowName"><fmt:message code="workflow.th.action" /></label>
                    <input type="checkbox" name="flowAction" value="1"><label class="label_f"><fmt:message code="notice.title.notify" /></label>
                    <input type="checkbox" name="flowAction" value="2"><label class="label_f"><fmt:message code="workflow.th.Internalmail" /></label>
                    <input type="checkbox" name="flowAction" value="3"><label class="label_f"><fmt:message code="workflow.th.Dump" /></label>
                    <input type="checkbox" name="flowAction" value="4"><label class="label_f placeFile"><fmt:message code="workflow.th.File" /></label>
                    <p class="set_form"><fmt:message code="workflow.th.Setupforms" /></p>

                </div>
            </div>






            <p class="define_p" style="margin-top: 50px;padding-bottom: 0px"><fmt:message code="workflow.th.basicattributes" /></p>
            <div style="position: relative;height: 480px">
                <div class="con_form">
                    <div class="form_group">
                        <label for="reference" class="flowName"><fmt:message code="workflow.th.expression" /></label>
                        <input type="text" name="autoName" id="reference">
                    </div>

                    <div class="form_group">
                        <label for="counteer" class="flowName"><fmt:message code="workflow.th.counter" /></label>
                        <input type="text" name="autoNum" id="counteer">
                    </div>

                    <div class="form_group">
                        <label for="figure" class="flowName"><fmt:message code="workflow.th.digits" /></label>
                        <input type="text" name="autoLen" id="figure">
                    </div>

                    <div class="form_group">
                        <label for="update_n" class="flowName"><fmt:message code="workflow.th.change" /></label>
                        <select name="forcePreSet" id="update_n" class="depName">
                            <option value="1"><fmt:message code="wworkflow.th.modify" /></option>
                            <option value="0" selected="selected"><fmt:message code="workflow.th.nomodify" /></option>
                            <option value="2"><fmt:message code="workflow.th.prefixes" /></option>
                            <option value="3"><fmt:message code="workflow.th.suffixes" /></option>
                            <option value="4"><fmt:message code="workflow.th.prefixesandsuffixes" /></option>
                        </select>
                    </div>

                </div>


                <div class="conForm_r">
                    <p><fmt:message code="workflow.th.document" /></p>
                    <p><fmt:message code="workflow.th.specialtags" />:</p>
                    <div>
                        <span><fmt:message code="workflow.th.meansyear" /></span>
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
                        <span><fmt:message code="workflow.th.exmaple" />，</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.th.automatically" />。</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.th.example" />，</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.th.BH" />。</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.th.the-expression" />，</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.zhangsan" />。</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.th.such" />：</span>
                    </div>
                    <div style="margin-top: 5px;">
                        <span><fmt:message code="workflow.th.leaveprocedure" />。</span>
                    </div>

                </div>

            </div>





            <p class="define_p" style="margin-top: 50px;padding-bottom: 0px"><fmt:message code="workflow.th.Processdes" /></p>
            <div class="con_form" id="con_form">
                <div class="form_group clearfix">
                    <label for="reference" class="flowName" style="float: left"><fmt:message code="workflow.th.shuoming" /></label>
                    <span class="notable" style="padding-right: 66px;width: 65%;display: inline-block;text-align: left;color: #000;overflow: hidden;
text-overflow:ellipsis;"> </span>
                </div>
                <div class="form_group form_icon files" style="position: relative;margin-top: 10px;">
                    <label for="counteer" class="flowName"><fmt:message code="global.th.fileup" /></label>
                    <input type="file" name="file" multiple="" onchange="uploadinputimg(this)"   id="addressSearch" class="w-icon5" style="z-index: 10;  width: 116px;opacity: 0;
    position: absolute;top: 0px;
    left: 24%;">
                    <i class="icon_plus"></i><input type="button" readonly="readonly" value="<fmt:message code="global.th.fileup" />" class="addfile" id="addfile" style="cursor: pointer;vertical-align: 10px">

                </div>
            </div>



            <div id="container" style="width: 96%;min-height: 300px;margin: 30px 20px 100px 20px" type="text/plain">




            </div>





        </div>
    </div>
</form>
<script>
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
    function inputhX(name,v,fn) {
        if(v==undefined||v==''){
            return
        }
        else {
            $('[name="'+name+'"]').val(v)
            if(fn!=undefined){
                fn($('[name="'+name+'"]'))
            }
        }
    }


    function selecthX(name,v) {
        if(v==undefined||v==''){
            return
        }
        else {
            $('[name="'+name+'"]').find('option').each(function (i,n) {
                if($(this).val()==v){
                    $(this).attr('selected','selected')
                    return false
                }
            })
        }
    }

    function radioHx(name,v,fn) {
        if(v==undefined){
            return
        }
        else {
            $('[name="'+name+'"]').each(function (i,n) {
                if($(this).val()==v){
                    $(this).attr('checked',true)
                    if(fn!=undefined){
                        fn($('[name="'+name+'"]'))
                    }
                    return false
                }
            })

        }
    }
    function checkboxhX(name,v) {
        if(v==undefined||v==''){
            return
        }
        else {
            if(v.indexOf(',')==-1){
                $('[name="'+name+'"]').each(function (i,n) {
                    if($(this).val()==v){
                        $(this).attr('checked',true)
                    }
                })
            }else {
                var arr=v.split(',');
                $('[name="'+name+'"]').each(function (i,n) {
                    for(var i=0;i<arr.length;i++){
                        if($(this).val()==arr[i]){
                            $(this).attr('checked',true)
                        }
                    }
                })

            }

        }
    }


    function uploadinputimg(me) {
                $('#uploadimgform').attr('action','/flow/fileUpload?module=workflow');
        $('#uploadimgform').ajaxSubmit({
            type:'post',
            dataType:'json',
            success:function (json) {

                var attachId='';
                var attachName='';
                var attachNameHtml=''
                var arrOne=json.datas;
                for(var i=0;i<arrOne.length;i++){
                    if(i!=arrOne.length-1) {
                        attachId += arrOne[i].attStrId + ',';
                        attachName+=arrOne[i].attStrName+'*';
                    }else {
                        attachId += arrOne[i].attStrId;
                        attachName+=arrOne[i].attStrName;
                    }
                    attachNameHtml+='<a style="width: 20%;\
                        display: inline-block;margin-bottom:10px;vertical-align:bottom;margin-right: 10px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;" href="/download?'+arrOne[i].attUrl+'" class="fileAA" title="'+arrOne[i].attachName+'">'+arrOne[i].attachName+'</a>'
                }
                $('[name="attachmentId"]').val(attachId)
                $('[name="attachmentName"]').val(attachName)
                $('.notable').html(attachNameHtml)

            }
        })
    }





    var getRueObj=$.GetRequest();
    var ue = UE.getEditor('container');
$(function () {






    $.when($.ajax({
        url: '/workflow/flowclassify/flow',
        type: 'get',
        dataType: 'json',
        success: function (obj) {
            if (obj.flag) {
                var data = obj.datas;
                var opt_li;
                opt_li = Child(data, opt_li, 0, -1);
                $('#classfiy').html(opt_li);
            }
        }
    })).done(function () {
        $('#deptName').deptSelect(function () {
            $.ajax({
                url: '/form/allformlist',
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

                }
            })
        })
    }).done(function () {
        if(getRueObj.flowId!=undefined) {
            $.ajax({
                type: "GET",
                url: "/flow/selectAllFlow",
                dataType: "JSON",
                data: {
                    flowId: getRueObj.flowId
                },
                success: function (data) {
                    console.log(data)
                    if (data.flag) {
                        inputhX('flowName',data.object.flowName)
                        selecthX('flowSort',data.object.flowSort)
                        selecthX('flowType',data.object.flowType)
                        selecthX('formId',data.object.formId)
                        selecthX('freeOther',data.object.freeOther)
                        selecthX('deptId',data.object.deptId)
                        inputhX('flowNo',data.object.flowNo)
                        radioHx('viewPriv',data.object.viewPriv,function (me) {
                            $(me).parent().next().show()
                        })
                        radioHx('flowDoc',data.object.flowDoc);



                        radioHx('isVersion',data.object.isVersion)
                        $('[name="isVersion"]').each(function (i,n) {
                            if(data.object.isVersion==undefined){
                                return false
                            }else {
                                if($(this).val()==data.object.isVersion){
                                    $(this).attr('checked',true)
                                    return false
                                }
                            }

                        })




                        inputhX('viewUser',data.object.viewUser,function (me) {
                            $(me).prev().find('textarea').attr('user_id',$(me).val())
                            $(me).prev().find('textarea').val(data.object.viewUserName)
                        })
                        inputhX('viewDept',data.object.viewDept,function (me) {
                            $(me).siblings('textarea').attr('deptid',$(me).val())
                            $(me).siblings('textarea').val(data.object.viewDeptName)
                        })
                        inputhX('viewRole',data.object.viewRole,function (me) {
                            $(me).siblings('textarea').attr('userpriv',$(me).val())
                            $(me).siblings('textarea').val(data.object.viewRoleName)
                        })
                        checkboxhX('flowAction',data.object.flowAction)
                        inputhX('autoName',data.object.autoName)
                        inputhX('autoNum',data.object.autoNum)
                        inputhX('autoLen',data.object.autoLen)
                        selecthX('forcePreSet',data.object.forcePreSet)
                        if(data.object.attachmentName!='') {
                            var arrOne=data.object.attachment;
                            var attachNameHtml='';
                            for(var i=0;i<arrOne.length;i++){

                                attachNameHtml+='<a style="width: 20%;\
                        display: inline-block;margin-bottom: 10px; vertical-align:bottom;margin-right: 10px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;" href="/download?'+arrOne[i].attUrl+'" class="fileAA" title="'+arrOne[i].attachName+'">'+arrOne[i].attachName+'</a>'
                            }
                            $('.notable').html(attachNameHtml);
                        }
                        $('[name="attachmentId"]').val(data.object.attachmentId)
                        $('[name="attachmentName"]').val(data.object.attachmentName)
                        $('[name="flowId"]').val(data.object.flowId)
                        $('[name="flowDesc"]').val(data.object.flowDesc)
                        ue.setContent(data.object.flowDesc)

                    }
                }
            });
        }
    })


//
//    $('#addfile').click(function () {
//        $('[name="file"]').click()
//    })

    $('.keepmsg').on('click', function () {
        if($('[name="viewPriv"]:checked').val()==0){
            $('#text_1').attr('user_id','')
            $('#text_1').val('')
            $('#text_2').attr('deptid','')
            $('#text_3').attr('userpriv','')
            $('#text_3').val('')
            $('#text_2').val('')
        }
        $('[name="viewUser"]').val($('#text_1').attr('user_id'))
        $('[name="viewDept"]').val($('#text_2').attr('deptid'))
        $('[name="viewRole"]').val($('#text_3').attr('userpriv'))
        $('[name="flowDesc"]').val(ue.getContent())


        if (getRueObj .flowId==undefined) {

            $('#uploadimgform').attr('action','/flow/newFlow');
            $('#uploadimgform').ajaxSubmit({
                type:'post',
                dataType:'json',
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="diary.th.modify" />！', icon: 1}, function () {
                            parent.parentUrl('/flowSetting/flowSettingMain?type=edit&flowId=' + json.object.flowId)
                        });
                    }else {
                        $.layerMsg({content: json.msg, icon: 2})
                    }
                }
            })
        } else {
            $('#uploadimgform').attr('action','/flow/updateFlow');
            $('[name="flowId"]').val(getRueObj.flowId)
            $('#uploadimgform').ajaxSubmit({
                type:'post',
                dataType:'json',
                success:function (json) {
                    if(json.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.designprocess" />！', icon: 1}, function () {
                            parent.parentUrl('/flowSetting/flowSettingMain?type=edit&flowId=' + getRueObj.flowId)
                        });
                    }else {
                        $.layerMsg({content: json.msg, icon: 2})
                    }

                }
            })

        }

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
    $('.radio_s').click(function () {
        if($(this).val()==1){
            $(".block_n").show();
        }else {
            $(".block_n").hide();

        }
    })
    $('.clearAll').click(function () {
        $(this).siblings('textarea').attr('user_id','')
        $(this).siblings('textarea').attr('dataid','')
        $(this).siblings('textarea').attr('deptid','')
        $(this).siblings('textarea').attr('deptno','')
        $(this).siblings('textarea').attr('privid','')
        $(this).siblings('textarea').attr('userpriv','')
        $(this).siblings('textarea').val('')
    })
})
</script>
</body>
</html>
