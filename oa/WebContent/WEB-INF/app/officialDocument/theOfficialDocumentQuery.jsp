<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/28
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="doc.th.DocumentInquiry" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/lib/laydate.css">
    <script src="/lib/laydate.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/lib/jquery-validate.js"></script>
    <script src="/lib/validate-mothods.js"></script>
    <style>
        /*.fffbg tbody tr{*/
            /*background: #fff!important;*/
        /*}*/
        /*.eeebg{*/
            /*background: #eee!important;*/
        /*}*/
        .fffbg tbody tr input[type=text]{
            width: 70%;
            height:30px;
            border:1px solid #ccc;
            border-radius: 4px;
            padding-left: 10px;
        }
        .fffbg tbody tr select{
            width: 70%;
            height:30px;
            border:1px solid #ccc;
            border-radius: 4px;
            padding-left: 10px;
        }

        #btnsearch{
            top: -42px;
            right: 53px;
            padding: 5px 10px;
            background: red;
            color: #fff;
            border-radius: 6px;
            position: absolute;
        }
        .errrs{
            width:100px;
            height: 100px;
            background: red;
            display: inline-block;
        }
        input[type=submit]{
            width: 70px;
            height: 28px;
            line-height: 26px;
            padding-left:17px;
            text-align: center;
            background-image: url(../img/center_q.png);
            background-repeat: no-repeat;
            color: #000;
            cursor: pointer;
            font-size: 14px;
            font-family: "微软雅黑";
            float: none;
            border:none;
        }
        .chongzhi{
            width: 70px;
            height: 28px;
            line-height: 26px;
            padding-left:2px;
            text-align: center;
            background-image: url(../img/center_q.png);
            background-repeat: no-repeat;
            color: #000;
            cursor: pointer;
            font-size: 13px;
            font-family: "微软雅黑";
            float: none;
            display: inline-block;
            border:none;
        }
        textarea{
            outline: none;
            width: 70%;
            border-radius: 4px;
            padding:10px;
            height:60px;
        }
        .headTop{
            z-index: 999;
        }
    </style>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>
<div class="headTop">
    <div class="headImg">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/contractinfoend.png" alt="">
    </div>
    <div class="divTitle">
        <fmt:message code="doc.th.DocumentInquiry" />
    </div>
</div>

<div style="margin: 0 auto;margin-top: 48px;height: 60px;width: 97%;" class="clearfix">

</div>
<div style="margin: 0 auto;width: 97%;">
    <div class="formData" style="display: block">
    <form id="registerForm" action="/document/selectDocSelective">
        <%--/document/selectDocSelective--%>
    <table class="fffbg">
        <thead>
        <tr>
            <th width="15%" style="font-size: 16pt;"><fmt:message code="doc.th.CommonConditions" /></th>
            <th width="35%"></th>
            <th width="15%"></th>
            <th width="35%"></th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td width="15%">
                    <fmt:message code="document.th.DocumentType" />：
                </td>
                <td width="35%" style="text-align: left">
                    <select name="documentType" >
                        <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                        <option value="1"><fmt:message code="doc.th.In" /></option>
                        <option value="0"><fmt:message code="doc.th.Dispatch" /></option>
                    </select>
                </td>
                <td width="15%">
                    <fmt:message code="notice.th.title"/>：
                </td>
                <td width="35%"  style="text-align: left">
                    <input type="text" placeholder="<fmt:message code="global.lang.printsubject"/>" id="title" name="title">
                </td>
            </tr>
            <tr>
                <td width="15%">
                    <fmt:message code="doc.th.TechnologicalProcess"/>：
                </td>
                <td width="35%" style="text-align: left">
                    <select name="flowId" >
                        <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                    </select>
                </td>
                <td width="15%">
                    <fmt:message code="doc.th.DocumentType1"/>：
                </td>
                <td width="35%" style="text-align: left">
                    <select name="dispatchType" >
                        <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                    </select>
                    <%--<input type="text" placeholder="请输入公文种类" name="dispatchType">--%>
                </td>
            </tr>
            <tr>
                <td width="15%" >
                    <fmt:message code="document.th.Urgency"/>：
                </td>
                <td width="35%" style="text-align: left">
                    <select name="urgency" >
                        <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                        <option value="急件"><fmt:message code="doc.th.Dispatch1"/></option>
                        <option value="特急"><fmt:message code="doc.th.ExtraUrgent"/></option>
                        <option value="加急"><fmt:message code="doc.th.Urgent"/></option>
                    </select>
                    <%--<input type="text" placeholder="请输入紧急程度" name="urgency">--%>
                </td>
                <td width="15%" >
                    <fmt:message code="doc.th.ClassifiedLevel"/>：
                </td>
                <td width="35%" style="text-align: left">

                    <select name="secrecy" >
                        <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                        <option value="秘密"><fmt:message code="doc.th.Secret"/></option>
                        <option value="内部"><fmt:message code="doc.th.inside"/></option>
                        <option value="机密"><fmt:message code="doc.th.Confidential"/></option>
                        <option value="绝密"><fmt:message code="doc.th.Top-secret"/></option>
                    </select>
                    <%--<input type="text" placeholder="请输入机密等级" name="secrecy">--%>
                </td>

            </tr>
            <tr>

                <td width="15%">
                    <fmt:message code="file.th.builder"/>：
                </td>
                <td width="35%" style="text-align: left">

                    <textarea name="" readonly style="vertical-align: middle" placeholder="<fmt:message code="doc.th.PleaseCreator"/>" id="creater" cols="30" rows="10"></textarea>
                    <a href="javascript:void (0)" style="vertical-align: bottom" data-num="1" class="theCandidates"><fmt:message code="global.lang.select"/></a>
                    <a href="javascript:void (0)" class="clearAll" style="vertical-align: bottom"><fmt:message code="global.lang.empty"/></a>
                    <input type="hidden" name="userId">
                </td>
                <td width="15%">
                    <fmt:message code="doc.th.FoundingDepartment"/>：
                </td>
                <td width="35%" style="text-align: left">

                    <textarea name="" readonly style="vertical-align: middle" placeholder="<fmt:message code="doc.th.selectCreationSection"/>" id="createDept" cols="30" rows="10"></textarea>
                    <a href="javascript:void (0)" style="vertical-align: bottom" data-num="2"  class="theCandidates"><fmt:message code="global.lang.select"/></a>
                    <a href="javascript:void (0)" style="vertical-align: bottom"><fmt:message code="global.lang.empty"/></a>
                    <input type="hidden" name=" deptId">
                </td>

            </tr>
            <tr>

                <td width="15%">
                    <fmt:message code="notice.th.createTime"/>：
                </td>
                <td width="35%"  style="text-align: left">
                    <input type="text" readonly="readonly" placeholder="<fmt:message code="doc.th.enterCreationTime"/>" onclick="laydate({istime: true, format: 'YYYY-MM-DD'})" name="createTime">
                </td>
                <td width="15%">
                    <fmt:message code="notice.th.state"/>：
                </td>
                <td width="35%" style="text-align: left">
                    <select name="status" id="">
                        <option value=""><fmt:message code="hr.th.PleaseSelect"/></option>
                        <option value="1"><fmt:message code="lang.th.will"/></option>
                        <option value="2"><fmt:message code="lang.th.Process"/></option>
                        <option value="3"><fmt:message code="doc.th.ToReceive"/></option>
                        <option value="4"><fmt:message code="lang.th.HaveThrough"/></option>
                    </select>
                    <%--<input type="text" placeholder="请输入状态" name="status">--%>
                </td>

            </tr>

            <tr>
                <td colspan="4">
                    <%--<a href="javascript:void(0)" style="margin-right: 10px" class="dataBtn">搜索</a>--%>
                        <input type="submit" value="<fmt:message code="workflow.th.sousuo"/>">
                    <a href="javascript:void(0)" class="chongzhi"><fmt:message code="workflow.th.Reset"/></a>
                </td>

            </tr>
        </tbody>
    </table>
    </form>
    </div>


    <div class="tableData" style="display: none;position: relative">
        <a href="javascript:void(0)" id="btnsearch"><fmt:message code="doc.th.AdvancedSearch"/></a>
        <table class="fffbg">
            <thead>
            <tr>
                <th><fmt:message code="document.th.DocumentType"/></th>

                <th><fmt:message code="notice.th.title"/></th>
                <th><fmt:message code="doc.th.TechnologicalProcess"/></th>
                <th><fmt:message code="doc.th.DocumentType1"/></th>
                <th><fmt:message code="document.th.Urgency"/></th>
                <th><fmt:message code="doc.th.ClassifiedLevel"/></th>
                <th><fmt:message code="file.th.builder"/></th>
                <th><fmt:message code="notice.th.createTime"/></th>
                <th><fmt:message code="notice.th.state"/></th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>


<script>
    var user_id='';
    var dept_id='';
//    var priv_id='';
    $.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {
        var arrTwo=json.GWTYPE;
        var str='<option value=""><fmt:message code="hr.th.PleaseSelect"/></option>'
        for(var i=0;i<arrTwo.length;i++){
            str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'
        }
        $('[name="dispatchType"]').html(str)
    },'json')

    $.get('/document/getFlowDocument',function (json) {
        if(json.flag) {
            var arrTwo = json.datas;
            var str = '<option value=""><fmt:message code="hr.th.PleaseSelect"/></option>'
            for (var i = 0; i < arrTwo.length; i++) {
                str += '<option value="' + arrTwo[i].flowId + '">' + arrTwo[i].flowName + '</option>'
            }
            $('[name="flowId"]').html(str)
        }
    },'json')



    $('.theCandidates').click(function () {

        var num=$(this).attr('data-num')
        if(num==1) {
            user_id = $(this).siblings('textarea').prop('id');
            $.popWindow("../common/selectUser?0");
        }else if(num==2){
            dept_id=$(this).siblings('textarea').prop('id');
            $.popWindow("../common/selectDept?0");
        }
    })




    $('#btnsearch').click(function () {
        $('.formData').show()
        $('.tableData').hide()
    })
$(function () {


    $("#registerForm").validate({
        checkStart: true,
        focusInvalid: false,
        errorPlacement: function(error, element) { //错误信息位置设置方法
            layer.tips(error[0].innerText, $(element) , { time: 2000,tipsMore: true});
        },
        rules:{//验证那个东西
            title:{
//                required:true,
//                maxlength:100
            },
            documentType:{
//                required:true
            }
        },
        messages:{//提示信息
            title:{
//                required:'该项为必填项',
//                maxlength:'最多输入十0位'
            },
            documentType:{
//                required:'该项为必填项'
            }
        },
        submitHandler:function(form){//提交
            if($('[name="userId"]').siblings('textarea').attr('user_id')!=undefined){
                $('[name="userId"]').val($('[name="userId"]').siblings('textarea').attr('user_id').replace(/,/,''))
            }
            if($('[name=" deptId"]').siblings('textarea').attr('deptid')!=undefined){
                $('[name=" deptId"]').val($('[name=" deptId"]').siblings('textarea').attr('deptid').replace(/,/,''))
            }


            $(form).ajaxSubmit({
                type:'post',
                dataType:'json',
                success:function (json) {
                    if(json.flag){

                        if(json.datas.length>0) {
                            $('.formData').hide()
                            $('.tableData').show()
                            var  dataArr=json.datas;
                            var str = '';
                            for (var i = 0; i < dataArr.length; i++) {
                                str+='' +
                                    '<tr>' +
                                    '<td>'+function () {
                                        if(dataArr[i].documentType==0){
                                            return '发文'
                                        }else if(dataArr[i].documentType==1){
                                            return '收文'
                                        }else {
                                            return ''
                                        }
                                    }()+'</td>' +
                                    '<td>'+ function(){
                                    if(dataArr[i].title!=undefined){
                                        return dataArr[i].title
                                    }else {
                                        return ''
                                    }
                                }()+'</td>' +
                                    '<td>'+dataArr[i].flowName+'</td>' +
                                    '<td>'+function(){
                                            if(dataArr[i].codeName!=undefined){
                                                return dataArr[i].codeName
                                            }else {
                                                return ''
                                            }
                                    }()+'</td>' +
                                    '<td>'+function(){
                                        if(dataArr[i].urgency!=undefined){
                                            return dataArr[i].urgency
                                        }else {
                                            return ''
                                        }
                                    }()+'</td>' +
                                    '<td>'+function(){
                                        if(dataArr[i].secrecy!=undefined){
                                            return dataArr[i].secrecy
                                        }else {
                                            return ''
                                        }
                                    }()+'</td>' +
                                    '<td>'+dataArr[i].createrName+'</td>' +
                                    '<td>'+function(){
                                        if(dataArr[i].printDate!=undefined){
                                            return dataArr[i].printDate
                                        }else {
                                            return ''
                                        }
                                    }()+'</td>' +
                                    '<td>'+function () {
                                       if(dataArr[i].prFlag==1){
                                            return '<fmt:message code="lang.th.will"/>'
                                       }else  if(dataArr[i].prFlag==2){
                                           return '<fmt:message code="lang.th.Process"/>'
                                       }else  if(dataArr[i].prFlag==3){
                                           return '<fmt:message code="doc.th.ToReceive"/>'
                                       }else  if(dataArr[i].prFlag==4){
                                           return '<fmt:message code="lang.th.HaveThrough"/>'
                                       }
                                    }()+'</td>' +
                                    '</tr>'

                            }
                            $('.tableData table tbody').html(str)
                        }else {
                            $.layerMsg({content:'<fmt:message code="doc.th.NoData"/>！',icon:2});
                        }

                    }
                }
            })
        }

    })

})
    
    $('.chongzhi').click(function () {
        $('#registerForm input[type=text]').each(function (i,n) {
            $(this).val('')
        })
        $('#registerForm select option').each(function (i,n) {
            if($(this).val()==''){
                $(this).attr('selected',true)
            }else {
                $(this).removeAttr('selected')
            }
        })
        $('#registerForm textarea').val('')
        $('#registerForm textarea').attr('user_id','')
        $('#registerForm textarea').attr('deptid','')
    })


    $('.clearAll').click(function () {
        $(this).siblings('textarea').attr('user_id','')
        $(this).siblings('textarea').attr('deptid','')
        $(this).siblings('textarea').val('')
    })

</script>
</body>
</html>
