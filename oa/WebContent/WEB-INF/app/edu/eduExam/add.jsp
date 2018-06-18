<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <meta charset="UTF-8">
    <title>管理考试管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <link rel="stylesheet" type="text/css" href="/static/theme/2/style.css" />
    <script type="text/javascript" src="/static/js/ccorrect_btn.js"></script>
    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
</head>

<script type="text/javascript" src="/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="/static/js/module.js"></script>
<script type="text/javascript" src="/static/js/edu/module_edu.js"></script>
<script type="text/javascript" src="/static/js/utility.js"></script>
<script type="text/javascript" src="/static/js/attach.js"></script>
<script src="/module/DatePicker/WdatePicker.js"></script>
<script Language="JavaScript">
    function upload_attach()
    {
        if(CheckForm())
        {
            document.form1.submit();
        }
    }
    function delete_attach(ATTACHMENT_ID,ATTACHMENT_NAME)
    {
        var msg = sprintf("确定要删除文件 '%s' 吗？", ATTACHMENT_NAME);
        if(window.confirm(msg))
        {
            URL="delete_attach.php?ID=&ATTACHMENT_ID="+ATTACHMENT_ID+"&ATTACHMENT_NAME="+URLSpecialChars(ATTACHMENT_NAME);
            window.location=URL;
        }
    }
    function CheckForm()
    {
        if(document.form1.EXAM_NAME.value=="")
        {
            alert("考试名称不能为空！");
            document.form1.EXAM_NAME.focus();
            return (false);
        }
        return (true);
    }
</script>

<body class="bodycolor">

<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td><img src="/static/images/notify_new.gif" align="absmiddle"><span class="big3"> 管理考试管理</span>&nbsp;&nbsp;
        </td>
    </tr>
</table>
<br>
<form enctype="multipart/form-data" action="submit.php"  method="post" name="form1"  onSubmit="return CheckForm();">
    <table class="TableBlock" width="80%" align="center">
        <tr>
            <td nowrap class="TableData" align="center"> 考试名称：</td>
            <td class="TableData" >
                <input type="text" name="EXAM_NAME" value="" class="BigInput">
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center"> 学年：</td>
            <td class="TableData" >
                <select name="SCHOOL_YEAR">
                    <option value="2007-2008"  >2007-2008</option>\n<option value="2008-2009"  >2008-2009</option>\n<option value="2009-2010"  >2009-2010</option>\n<option value="2010-2011"  >2010-2011</option>\n<option value="2011-2012"  >2011-2012</option>\n<option value="2012-2013"  >2012-2013</option>\n<option value="2013-2014"  >2013-2014</option>\n<option value="2014-2015"  >2014-2015</option>\n<option value="2015-2016"  >2015-2016</option>\n<option value="2016-2017"  >2016-2017</option>\n<option value="2017-2018" selected >2017-2018</option>\n<option value="2018-2019"  >2018-2019</option>\n<option value="2019-2020"  >2019-2020</option>\n<option value="2020-2021"  >2020-2021</option>\n                            </select>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center"> 学期：</td>
            <td class="TableData" >
                <select name="SEMESTER">
                    <option value="上学期" selected >上学期</option><option value="下学期"  >下学期</option>                            </select>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center">考试范围(年级)：</td>
            <td class="TableData">
                <input type="hidden" name="COPY_TO_ID11" value="">
                <textarea cols=60 name="COPY_TO_NAME11" rows=4 class="BigStatic" wrap="yes" readonly></textarea>
                <a href="javascript:;" class="orgAdd" onClick="SelectGrade('','COPY_TO_ID11', 'COPY_TO_NAME11','','')">添加</a>
                <a href="javascript:;" class="orgClear" onClick="ClearUser('COPY_TO_ID11', 'COPY_TO_NAME11')">清空</a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center">考试范围(班级)：</td>
            <td class="TableData">
                <input type="hidden" name="CLASS_ID" value="">
                <textarea cols=60 name="CLASS_NAME" rows=4 class="BigStatic" wrap="yes" readonly></textarea>
                <a href="javascript:;" class="orgAdd" onClick="SelectClass('','CLASS_ID', 'CLASS_NAME')">添加</a>
                <a href="javascript:;" class="orgClear" onClick="ClearUser('CLASS_ID', 'CLASS_NAME')">清空</a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center">考试范围(人员)：</td>
            <td class="TableData">
                <input type="hidden" name="EXAM_USER_ID" value="">
                <textarea cols=60 name="EXAM_USER_NAME" rows=4 class="BigStatic" wrap="yes" readonly></textarea>
                <a href="javascript:;" class="orgAdd" onClick="SelectStudent('','','EXAM_USER_ID', 'EXAM_USER_NAME','','','','1')">添加</a>
                <a href="javascript:;" class="orgClear" onClick="ClearUser('EXAM_USER_ID', 'EXAM_USER_NAME')">清空</a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center"> 考试类型：</td>
            <td class="TableData" >
                <select name="EXAM_TYPE">
                    <option value="01">期末考试</option>
                    <option value="02">重考</option>
                    <option value="03">会考</option>
                    <option value="04">入学考试</option>
                    <option value="05">期中考试</option>
                    <option value="06">月考</option>
                    <option value="07">其他</option>
                    <option value="1">期末考试</option>
                    <option value="2">期中考试</option>
                    <option value="3">入学考试</option>
                </select>
            </td>
        </tr>

        <tr id="EDITOR">
            <td class="TableData" colspan="2">
                考试安排：
                <textarea name="TD_HTML_EDITOR_EXAM_ARRANGE" rows="8" cols="60"></textarea>
                <script type="text/javascript">//<![CDATA[
                window.CKEDITOR_BASEPATH='/module/editor/';
                //]]></script>
                <script type="text/javascript">//<![CDATA[
                window.HTML_MODEL_TYPE='05';
                //]]></script>
                <script type="text/javascript" src="/module/editor/ckeditor.js?t=D5AC"></script>
                <script type="text/javascript">//<![CDATA[
                CKEDITOR.replace('TD_HTML_EDITOR_EXAM_ARRANGE', {"contentsCss":"body{font-size:pt;}","model_type":"05","width":"100%","height":"450","toolbar":"Default","language":"zh-CN","allowedContent":true});
                //]]></script>
            </td>
        </tr>

        <tr class="TableData" id="attachment2">
            <td nowrap align="center">附件文档：</td>
            <td nowrap colspan=3>
                无附件                </td>
        </tr>
        <tr height="25" id="attachment1">
            <td nowrap class="TableData" align="center"><span id="ATTACH_LABEL">附件上传：</span></td>
            <td class="TableData" colspan=3>
                <script>ShowAddFile();</script>
                <input type="hidden" name="ATTACHMENT_ID_OLD" value="">
                <input type="hidden" name="ATTACHMENT_NAME_OLD" value="">
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData" align="center"> 提醒：</td>
            <td class="TableData" colspan=3>
                <label class='sms-remind-label'><input type="checkbox" name="SMS_REMIND" id="SMS_REMIND">发送事务提醒消息</label>				</td>
        </tr>
        <tr align="center" class="TableControl">
            <td colspan=4 nowrap>
                <input type="hidden" value="" name="ID">
                <input type="submit" value="保存" class="BigButton" id="save">
                <input type="button" value="返回" class="BigButton">
            </td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
    $(function () {
        $('#save').click(function () {
            var data={
                "examName": $("#query_subject").val(),
                "schoolYear": $('#schoolyear option:checked').attr('value'),
                "semester": $('#Semester option:checked').attr('value'),
                "examType":  $('#testType option:checked').attr('value'),
                "gradeName": $("#query_toId").val(),
                "className": $("#query_privId").val(),
                "examUserName": $("#query_userId").val(),
                "examArrange": ue.getContent()
            }
            $.ajax({
                type: 'post',
                url: '/eduExam/updateExam',
                dataType: 'json',
                data: data,
                success: function (res) {
                    if (res.flag) {
                        $.layerMsg({content: '新建成功！', icon: 1});
                        init();
                    } else {
                        $.layerMsg({content: '新建失败！', icon: 2});
                    }
                }
            })
            layer.close(index);
        })
    })

    function getYear(year,type){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:type},
            dataType:'json',
            success:function(reg){
                var datas=reg.obj;
                for (var i=0;i<datas.length;i++){
                    if(datas[i].codeOrder==13){
                        var str='<option value="'+datas[i].codeOrder+'" selected="true">'+datas[i].codeName+'</option>';
                    }else{
                        var str='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                    }
                    $(year).append(str);
                }
            }
        })
    }

    user_id='query_userId';//选人控件
    $(function() {
        getYear('.year', 'EDU_YEAR_NO');
        getYear('.test', 'EXAM_TYPE');
        //选人员
        $('#query_adduser').click(function () {
            user_id = 'query_userId';
            $.popWindow("../common/selectEduUser");
        });
        //选班级
        $('#priv_add').click(function () {
            dept_id = 'query_privId';
            $.popWindow("../common/selectEduDept");
        });
        //选年级
        $('#grade').click(function () {
            dept_id = 'query_toId';
            $.popWindow("../common/selectEduDept");
        });
    })
</script>
</html>