<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>考试管理</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../css/officialDocument/officialDocument.css">
    <link rel="stylesheet" href="../../lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="../../lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="../../lib/laydate/need/laydate.css">
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <link rel="stylesheet" href="../../css/base.css">
    <link rel="stylesheet" type="text/css" href="../../css/news/management_query.css" />
    <link rel="stylesheet" type="text/css" href="../../css/edu/eduExam/insertExam.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/management_query.css" />
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../js/easyui/easyui-lang-zh_CN.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/base/base.js"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/jquery.form.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <!-- word文本编辑器 -->
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>

    <style type="text/css">
        .inPole{
            display: inline-block;
        }
        .inPole textarea{
            vertical-align: middle;
            margin-left: 5px;
            border: #999 1px solid;
        }

        .span_td{
            display: inline-block;
            width: 20%;
            text-align: center;
            border-right: 1px solid #c0c0c0;
            height: 43px;
            line-height: 43px;
        }
        table th,table td {
            text-align: left;
        }
        table th {
            padding-left: 10px;
        }
        .btn_ div{
            width: 74px;
            background:url(../../img/edu/save.png) no-repeat
        }
        .btn_ .btn_style{
            width: 74px;
            color:#000;
            background:url(../../img/edu/return.png) no-repeat
        }
        .nav_box div{
            float:none;
        }
        .head{
            height:45px;
        }
    </style>
</head>
<body>
<div class="head w clearfix">
    <ul class="index_head">
        <li data_id="0">
            <span class="one headli1_1">考试管理</span>
            <img class="headli1_2" src="../img/twoth.png" alt="">
        </li>
        <li data_id="1">
            <span class="headli2_1">新建考试</span>
            <img src="../img/twoth.png" alt="" class="headli2_2">
        </li>
        <li data_id="2">
            <span class="headli2_1">考试查询</span>
            <img src="../img/twoth.png" alt="" class="headli2_2">
        </li>
        <li data_id="3">
            <span class="headli3">考试导入</span>
        </li>
    </ul>
</div>
<div class="pagediv1" style="margin: 0 auto;width: 97%;">
    <div class="navigation  clearfix">
        <div class="left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/daibanfawen.png">
            <div class="news">
                管理考试管理
            </div>
        </div>
        <div id="dbgz_page" class="M-box3 fr">
        </div>
    </div>
    <table>
        <thead>
        <tr>
            <th style="width:55px;">选择</th>
            <th>编号</th>
            <th>学年</th>
            <th>学期</th>
            <th>考试名称</th>
            <th>考试类型</th>
            <th style="width:170px;">发布时间</th>
            <th style="width:170px;">操作</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
</div>
<div class="newtest" style="display:none;margin: 0 auto;width: 97%;">
    <div class="step2" style="margin-left: 10px;">
        <table class="newNews">
            <div class="nav_box clearfix">
                <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png" style=" "></div>
                <div class="nav_t2" class="news">考试管理</div>
            </div>
            <tbody>
            <tr>
                <td class="blue_text td_w">
                    考试名称：
                </td>
                <td>
                    <input class="td_title1" id="query_subject" type="text"  placeholder=""/>
                </td>
            </tr>
            <tr>
                <td class="blue_text">
                    学年：
                </td>
                <td>
                    <select name="" class="anonymityYn year" id="schoolyear"></select>
                </td>
            </tr>
            <tr>
                <td class="blue_text">
                    学期:
                </td>
                <td>
                    <select name="" class="term" id="Semester">
                        <option value="第一学期">第一学期</option>
                        <option value="第二学期">第二学期</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="blue_text">考试范围(年级)：</td>
                <td>
                    <textarea readonly="readonly" class=" td_title1  release1" id="query_toId" dataid="" resize="auto"></textarea>
                    <%--<input class="td_title1  release1"  id="query_toId" type="text"/>--%>
                    <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt=""/>
                    <div class="release3" id="grade">添加</div>
                    <div class="release4 empty"onclick="empty('query_toId','query_toId')" style="margin-top:10px;">清空</div>
                </td>
            </tr>
            <tr id="role">
                <td class="blue_text">考试范围(班级)：</td>
                <td>
                    <textarea readonly="readonly" class="td_title1  release1" id="query_privId" dataid="" resize="auto"></textarea>
                    <%--<input class="td_title1  release1" id="query_privId" type="text"/>--%>
                    <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt=""/>
                    <div class="release3" id="priv_add">添加</div>
                    <div class="release4 empty" onclick="empty('query_privId','query_privId')"  style="margin-top:10px;">清空</div>
                </td>
            </tr>
            <tr id="man">
                <td class="blue_text">考试范围(人员)：</td>
                <td>
                    <textarea readonly="readonly" class=" td_title1  release1" id="query_userId" dataid="" resize="auto"></textarea>
                    <img class="td_title2 release2"  src="../img/mg2.png" alt=""/>
                    <div class="release3"  id="query_adduser">添加</div>
                    <div class="release4 empty" onclick="empty('query_userId','query_userId')"  style="margin-top:10px;">清空</div>
                </td>
            </tr>
            <tr>
                <td class="blue_text">
                    考试类型:
                </td>
                <td>
                    <select name="" class="test" id="testType"></select>
                </td>
            </tr>
            <tr>
                <td class="blue_text">考试安排:</td>
                <td><div class="content" id="container" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></div></td>
            </tr>
            <tr>
                <td class="blue_text">
                    附件上传:
                </td>
                <td class="enclosure">
                    <div id="query_uploadArr" style="display: block;">
                    </div>
                    <div><img src="../img/mg11.png" alt=""/></div>
                    <div>
                        <form id="uploadimgform" target="uploadiframe"  action="../upload?module=news" enctype="multipart/form-data" method="post" >
                            <input type="file" multiple="multiple" name="file" id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;
filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
                            <a id="uploadimg" style="cursor: pointer;">添加附件</a>
                        </form>
                    </div>
                    <%--<div><img class="left_img" src="../img/mg12.png" alt=""/></div>--%>
                    <%--<div class="enclosure_t">从文件柜和网络硬盘选择附件</div>--%>
                </td>
            </tr>
            <tr>
                <td class="blue_text">
                    提醒：
                </td>
                <td class="remind">
                    <div><input class="news_t1 remindCheck"  type="checkbox" checked="checked" /></div>
                    <div class="news_t">发送事务提醒消息</div>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="foot_mg">
            <div class="btn_">
                <div  id="hd"  type="publish" class="fot_1 btn_ok">保存</div>
                <div  id="rs" type="save" class="btn_style btn_ok">返回</div>
            </div>
        </div>
    </div>
</div>

<div class="testQuery" style="display:none;">
    <div class="center" id="" style="width: 100%;margin-left: 10px;">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png" style=""></div>
            <div class="nav_t2" class="news">考试管理查询</div>
        </div>
        <table class="clearfix total">
            <tbody>
            <tr>
                <td colspan="2" class="query_title">
                    输入查询条件
                </td>
            </tr>
            <tr>
                <td class="td_w size_color">
                    学年：
                </td>
                <td>
                    <select name="" class="year" id="format"></select>
                </td>
            </tr>
            <tr>
                <td class="blue_text size_color">
                    学期：
                </td>
                <td>
                    <select name="" class="typeId" id="type_id">
                        <option value="第一学期">第一学期</option>
                        <option value="第二学期">第二学期</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="blue_text size_color">
                    考试类型：
                </td>
                <td>
                    <select name="" class="test" id="examType"></select>
                </td>
            </tr>
            <tr>
                <td class="size_color">
                    考试安排:
                </td>
                <td>
                    <input class="title_" id="subject" type="text"/>
                </td>
            </tr>
            <tr class="table_b">
                <td colspan="2">
                    <div class="bt determine" id="Querydata">查询</div>
                    <div class="exportNew" id="export">导出</div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<div class="testImport" style="display:none;">
    <div class="center" style="width: 100%;margin-left: 10px;">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png" style=""></div>
            <div class="nav_t2" class="news">考试管理导入</div>
        </div>
        <form name="form2" id="uploadForm" method="post" action="../eduExam/importEduExam" enctype="multipart/form-data">
            <table class="TableBlock" align="center" style="width: 65%">
                <tr class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>下载导入模板：</b></td>
                    <td width="400" align="left">
                        <a href="javascript:void(0)"  class="modlepanl"  id="modle" style="">考试管理导入模板下载</a>
                    </td>
                </tr>
                <tr class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>&nbsp;&nbsp;选择导入文件：</b></td>
                    <td align="left" width="400">
                        <input type="file" name="file" class="BigInput " size="30">
                        <input type="hidden" name="FILE_NAME">
                        <input type="hidden" name="GROUP_ID" value="">
                    </td>
                </tr>
                <tr class="TableData" align="center" height="30">
                    <td align="right"><b>说明：</b></td>
                    <td align="left">
                        <span>
                        1、请导入.xls文件。</br>
                            2、导入文件中，“学年”的格式为（2013-2014）。</br>
                            3、导入文件中，“学期”的格式为（上学期、下学期）。</br>
                            4、导入文件中，“班级”的格式为（一年级，二年级，三年级，）若有多个班级，请用英文逗号分开。</br>
                            5、导入文件中，“考试类型”的格式为（入学、期中、期末）。</br>
                            6、导入文件中， 模板中每个字段都应该填写。</br>
                        </span>
                    </td>
                </tr>
                <tr>
                    <td nowrap  class="TableControl" colspan="2" align="center">
                        <button id="importBtn" class="import subBtn">导入</button>&nbsp;&nbsp;
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
<script type="text/javascript">

    function xs() {
        $(".pagediv1").show();
        $(".testQuery").hide();
        $(".testImport").hide();
        $(".newtest").hide();
        ajaxPage.data.schoolYear="";
        ajaxPage.data.semester= "";
        ajaxPage.data.examType="";
        ajaxPage.data.examArrange="";
        ajaxPage.page()
    }

//新建考试信息
    $(function () {
        var ue = UE.getEditor('container');
        $('#hd').click(function () {
           var isUpdate= $('#hd').attr('ac')
            if(isUpdate != "update"){
                var aId='';
                var uId='';
                for(var i=0;i<$('#query_uploadArr .inHidden').length;i++){
                    aId += $('#query_uploadArr .inHidden').eq(i).val();
                    uId += $('#query_uploadArr .inHidden').eq(i).attr('NAME');
                };
                var data={
                    "examName": $("#query_subject").val(),
                    "schoolYear": $('#schoolyear option:checked').attr('value'),
                    "semester": $('#Semester option:checked').attr('value'),
                    "examType":  $('#testType option:checked').attr('value'),
                    "gradeName": $("#query_toId").val(),
                    "className": $("#query_privId").val(),
                    "examUserName": $("#query_userId").val(),
                    "examArrange": ue.getContent(),
                    "attachmentId":aId,
                    "attachmentName":uId

                }
                var examName = $("#query_subject").val();
                var gradeName = $("#query_toId").val();
                var className = $("#query_privId").val();
                var examUserName = $("#query_userId").val();
                if(examName ==''){
                    $.layerMsg({content:"考试名称不能为空",icon:2},function(){
                        return false;
                    });
                }else if(gradeName == "" && className == "" && examUserName == ""){
                    $.layerMsg({content:"年级，班级，人员 不能都为空",icon:2},function(){
                        return false;
                    });
                }else{
                    $.ajax({
                        type: 'post',
                        url: '/eduExam/updateExam',
                        dataType: 'json',
                        data: data,
                        success: function (res) {
                            if (res.flag) {
                                $.layerMsg({content: '新建成功！', icon: 1});
                                //init();
                                xs();
                            } else if(res.msg == "考试名称重复"){
                                $.layerMsg({content: '考试名称重复！', icon: 2});
                            }else {
                                $.layerMsg({content: '新建失败！', icon: 2});
                            }
                            // xs();
                        }
                    })
                }

                //layer.close(index);
            }else{
                var id = $('#hd').attr('testId');

                var aId='';
                var uId='';
                for(var i=0;i<$('#query_uploadArr .inHidden').length;i++){
                    aId += $('#query_uploadArr .inHidden').eq(i).val();
                    uId += $('#query_uploadArr .inHidden').eq(i).attr('NAME');
                };

                var data={
                    "id":id,
                    "examName": $("#query_subject").val(),
                    "schoolYear": $('#schoolyear option:checked').attr('value'),
                    "semester": $('#Semester option:checked').attr('value'),
                    "examType":  $('#testType option:checked').attr('value'),
                    "gradeName": $("#query_toId").val(),
                    "className": $("#query_privId").val(),
                    "examUserName": $("#query_userId").val(),
                    "examArrange": ue.getContent(),
                    "attachmentId":aId,
                    "attachmentName":uId

                }
                var examName = $("#query_subject").val();
                var gradeName = $("#query_toId").val();
                var className = $("#query_privId").val();
                var examUserName = $("#query_userId").val();
                if(examName ==''){
                    $.layerMsg({content:"考试名称不能为空",icon:2},function(){
                        return false;
                    });
                }else if(gradeName == "" && className == "" && examUserName == ""){
                    $.layerMsg({content:"年级，班级，人员 不能都为空",icon:2},function(){
                        return false;
                    });
                }else {
                    $.ajax({
                        type: 'post',
                        url: '/eduExam/editExamInfor',
                        dataType: 'json',
                        data: data,
                        success: function (res) {
                            if (res.flag) {
                                $.layerMsg({content: '修改成功！', icon: 1});
                                //init();
                                xs();
                            } else if(res.msg == "考试名称重复"){
                                $.layerMsg({content: '考试名称重复！', icon: 2});
                            }else {
                                $.layerMsg({content: '修改失败！', icon: 2});
                            }
                           // xs();
                        }
                    })
                }

                //layer.close(index);

            }

        })
    })


    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
            /*documentType:0,*/
            // curUserID:0,
            printDate:null,
            dispatchType:null,
            title:null,
            docStatus:null,
            schoolYear:null,
            semester:null,
            examType:null,
            examArrange:null
        },
        init:function () {
            $.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {
                var arrTwo=json.GWTYPE;
                var str='<option value="">请选择</option>'
                for(var i=0;i<arrTwo.length;i++){
                    str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'
                }
                $('[name="dispatchType"]').html(str)
            },'json')
        },
        page:function () {
            var me=this;
           //this.data.printDate=$('[name="printDate"]').val();
           // this.data.dispatchType=$('[name="dispatchType"]').val();
            //this.data.title=$('[name="title"]').val();
           // this.data.docStatus=$('[name="status"]').val();
            $.get('/eduExam/selectEduExam',me.data,function (json) {
                var str='';
                var arr=json.obj
//                console.log(arr);
                for(var i=0;i<arr.length;i++){

                    str+='<tr id='+arr[i].id+'>' +
                        '<td><input type="checkbox"  class="cbox checkChild"  conid='+arr[i].id+' ></td>' +
                        '<td>'+arr[i].id+'</td>' +
                        '<td>'+arr[i].schoolYear+'</td>' +
                        '<td>'+arr[i].semester+'</td>' +
                        '<td>'+function () {
                            if(arr[i].examName== null){
                                return ''
                            }else {
                                return arr[i].examName
                            }}()+'</td>' +
                        '<td>'+function () {
                            if(arr[i].examType==01){
                                return '期末考试'
                            }else if(arr[i].examType==02){
                                return '重考'
                            }else if(arr[i].examType==03){
                                return '会考'
                            }else if(arr[i].examType==04){
                                return '入学考试'
                            }else if(arr[i].examType==05){
                                return '期中考试'
                            }else if(arr[i].examType==06){
                                return '月考'
                            }else if(arr[i].examType==07){
                                return '其他'
                            }
                        }()+'</td>' +
                        '<td>'+function () {
                            if(arr[i].releaseTime==null){
                                return ''
                            }else {
                                return arr[i].releaseTime.substring(0,arr[i].releaseTime.length - 2)
                            }
                        }()+'</td>' +
                        '<td class="pagediv" id='+arr[i].id+'>' +
                        '<a href="javascript:;" target="_blank" style="margin-right: 10px" class="search" onclick="searchmessage('+arr[i].id+')">详细信息</a>' +
                        '<a href="javascript:;" target="_blank" style="margin-right: 10px" class="edit" onclick="revise('+arr[i].id+')">修改</a>' +
                        '<a href="javascript:;" target="_blank" class="remove" onclick="remove('+arr[i].id+')" style="color: #E01919;">删除</a>' +
                        '</td>' +
                        '</tr>'
                }
                str +='<tr class="last_str">' +
                    '<td colspan="8" class="function">' +
                    '<div><input id="checkedAll" type="checkbox"  name="check" value="">全选</div>' +
                    '<div class="delete_check">删除所选文件</div>' +
                    '</td>' +
                    '</tr>'
                $('.pagediv1 table tbody').html(str)
                me.pageTwo(json.totleNum,me.data.pageSize,me.data.page)
            },'json')
        },
        pageTwo:function (totalData, pageSize,indexs) {
            var mes=this;
            $('#dbgz_page').pagination({
                totalData: totalData,
                showData: pageSize,
                jump: true,
                coping: true,
                homePage:'',
                endPage: '',
                current:indexs||1,
                callback: function (index) {
                    mes.data.page=index.getCurrent();
                    mes.page();
                }
            });
        }
    }
    $(function () {
        ajaxPage.page()
        $('.Query').click(function () {
            ajaxPage.data.page=1;
            ajaxPage.page()
        })
    })
    //查看详情
    function searchmessage(Id) {

        $.ajax({
            type:'post',
            url:'/eduExam/getOne',
            dataType:'json',
            data:{'Id':Id},
            success:function(reg){
                var data=reg.obj;
                layer.open({
                    type:1,
                    title:['查看详情', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['600px', '398px'],
                    shadeClose: true, //点击遮罩关闭
                    content:'<div class="div_table">' +
                    '<div class="div_tr"><span class="span_td span_lf">学 年<span></span>：</span><span>'+ data.schoolYear+'</span></div>'+
                    '<div class="div_tr"><span class="span_td span_lf">学 期：</span><span>'+data.semester+'</span></div>'+
                    '<div class="div_tr" style="word-wrap:break-word;word-break:break-all;"><span class="span_td span_lf">考试范围(年级)：</span>' +
                    '<span class="seeCon" >'+function () {
                        if(data.gradeName== null){
                            return ''
                        }else {
                            return data.gradeName
                        }}()+'</span></div>'+
                    '<div class="div_tr" style="word-wrap:break-word;word-break:break-all;"><span class="span_td span_lf">考试范围(班级)：</span><span><div class="inPole">'+function () {
                        if(data.className== null){
                            return ''
                        }else {
                            return data.className
                        }}()+'</div></span></div>'+
                    '<div class="div_tr" style="word-wrap:break-word;word-break:break-all;"><span class="span_td span_lf">考试范围(人员)：</span><span><div class="inPole">'+function () {
                        if(data.examUserName== null){
                            return ''
                        }else {
                            return data.examUserName
                        }}()+'</div></span></div>'+
                    '<div class="div_tr"><span class="span_td span_lf">考试名称：</span><span><div class="inPole">'+function () {
                        if(data.examName == null){
                            return ''
                        }else {
                            return data.examName
                        }}()+'</div></span></div>'+
                    '<div class="div_tr"><span class="span_td span_lf">考试类型：</span><span><div class="inPole">'+
                    function () {
                        if(data.examType==01){
                            return '期末考试'
                        }else if(data.examType==02){
                            return '重考'
                        }else if(data.examType==03){
                            return '会考'
                        }else if(data.examType==04){
                            return '入学考试'
                        }else if(data.examType==05){
                            return '期中考试'
                        }else if(arr[i].examType==06){
                            return '月考'
                        }else if(arr[i].examType==07){
                            return '其他'
                        }
                    }()+'</div></span></div>'+
                    '<div class="div_tr"><span class="span_td span_lf">考试安排：</span><span><div class="inPole">'+function () {
                        if(data.examArrange== null){
                            return ''
                        }else {
                            return data.examArrange
                        }}()+'</div></span></div>'+
                    /* '<div class="div_tr"><span class="span_td span_lf">附件文档：</span><span><div class="inPole">'+data.tag+'</div></span></div>'+*/
                    '</div>'
                })

            }
        })
    }
    //删除
    function remove(sId){
        //alert(sId);
        layer.confirm('确定删除吗？', {
            btn: ['删除','取消'], //按钮
            title:"删除事件"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'/eduExam/deleteExam',
                dataType:'json',
                data:{'Id':sId},
                success:function(){
                    layer.msg('删除成功', { icon:6});
                    ajaxPage.page()
                    $('.Query').click(function () {
                        ajaxPage.data.page=1;
                        ajaxPage.page()
                    })
                }
            })
        }, function(){
            layer.closeAll();
        });
    }
    //修改内容回填
    function revise(id){
      /*  alert(id);*/
        $('#hd').attr('ac','update');
        $("#hd").attr("testId",id)
        $(".pagediv1").hide();
        $(".testQuery").hide();
        $(".testImport").hide();
        $(".newtest").show();
        $.ajax({
            url:'/eduExam/getOne',
            type:'get',
            data:{Id:id},
            dataType:'json',
            success:function(data){
                $("#query_subject").val(data.obj.examName);
                $("#schoolyear").find("option[value="+data.obj.schoolYear+"]").attr("selected",true);//学年
                $("#Semester").find("option[value="+data.obj.semester+"]").attr("selected",true);//学期
                $("#testType").find("option[value="+data.obj.examType+"]").attr("selected",true);//考试类型
                $("#query_toId").val(data.obj.gradeName); //年级
                //  $("#step3_ip2").attr("deptid",data.object.toId);
                $("#query_privId").val(data.obj.className); //班级
                //  $("#privId_").attr("userpriv",data.object.privId);
                $("#query_userId").val(data.obj.examUserName); //人员
                //   $("#userId_").attr("user_id",data.object.userId);
                ue.setContent(data.obj.examArrange);
//                    if(data.object.top==1){
//                        $('#top_').prop('checked',true);//是否置顶
//                    };
            }
        })
    }
    var ue = UE.getEditor('container');
    // 获取学年、考试类型控件
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
                        var str='<option value="'+datas[i].codeName+'" selected="true">'+datas[i].codeName+'</option>';
                    }else{
                        var str='<option value="'+datas[i].codeName+'">'+datas[i].codeName+'</option>';
                    }
                    $(year).append(str);

                }
            }
        })
    }
    function getExamType(year,type){
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
    //清空
    function empty(id,type){
        $("#"+id).val("");
        $("#"+id).attr(type,"");
    };
    function savetest(url){
        var data={
            "examName": $("#query_subject").val(),
            "schoolYear": $('#schoolyear option:checked').attr('value'),
            "semester": $('#Semester option:checked').attr('value'),
            "examType":  $('#testType option:checked').attr('value'),
            "gradeName": $("#query_toId").val(),
            "className": $("#query_privId").val(),
            "examUserName": $("#query_userId").val(),
            "examArrange": ue.getContent(),
            "id":id,
        }
        $.ajax({
            url:url,
            type:'get',
            dataType:"JSON",
            data : data,
            success:function(data){
                $(".pagediv1").show();
                $(".testQuery").hide();
                $(".testImport").hide();
                $(".newtest").hide();
                location.reload();
                if (data.flag) {
                    $.layerMsg({content: '修改成功！', icon: 1});
                    init();
                } else {
                    $.layerMsg({content: '修改失败！', icon: 2});
                }
            },
            error:function(e){
//                console.log(e);
            }
        });
        layer.close(index);
    }
$(function () {
    $('#modle').click(function () {
        window.location.href="../file/edu/eduExam/import_edu_exam.xls"
    })

    $('.subBtn').click(function () {
        var flag = CheckForm();
        if (flag) {
            layer.msg("正在导入中，请耐心等候", {icon: 1});
            $.upload($('#uploadForm'), function (res) {
                if(res.flag) {

                    xs();

                }
            });
        }
    });

})
function CheckForm(){

    if(document.form2.file.value==""){
        layer.msg("<fmt:message code="user.th.selectImport" />！",{icon:2});
        return (false);
    }
    return (true);
}

</script>

<script>
    user_id='query_userId';//选人控件
    $(function(){
        getYear('.year','EDU_YEAR_NO');
        getExamType('.test','EXAM_TYPE');
        //选人员
        $('#query_adduser').click(function(){
            user_id='query_userId';
            $.popWindow("/common/selectEduUser");
        });
        //选班级
        $('#priv_add').click(function(){
            dept_id='query_privId';
            $.popWindow("/common/selectClazz");
        });
        //选年级
        $('#grade').click(function(){
            dept_id='query_toId';
            $.popWindow("/common/selectGrade");
        });
        //页面之间的切换
        $(".index_head li").click(function (){
            $(this).find('span').addClass('one').parent().siblings('').find('span').removeClass('one');  // 删除其他兄弟元素的样式
            var read= $(this).attr('data_id');
            if(read == 0){
                $(".pagediv1").show();
                $(".testQuery").hide();
                $(".testImport").hide();
                $(".newtest").hide();
                ajaxPage.data.schoolYear="";
                ajaxPage.data.semester= "";
                ajaxPage.data.examType="";
                ajaxPage.data.examArrange="";
                ajaxPage.page()
            }else if(read == 1){
                $(".pagediv1").hide();
                $(".testQuery").hide();
                $(".testImport").hide();
                $(".newtest").show();
                $('#hd').attr('ac','add');
                $('#query_subject').val('');
                $('#query_toId').val('');
                $('#query_privId').val('');
                $('#query_userId').val('');
                ue.setContent('');

            }else if(read == 2){
                $(".pagediv1").hide();
                $(".testQuery").show();
                $(".testImport").hide();
                $(".newtest").hide();
            }else if(read == 3){
                $(".pagediv1").hide();
                $(".testQuery").hide();
                $(".testImport").show();
                $(".newtest").hide();
            }
        });
        //编辑新建时保存调用的接口
        $("#hd").click(function(){
            var action=$(this).attr("ac");
            var data = {
                "examName": $("#query_subject").val(),
                "schoolYear": $('#schoolyear option:checked').attr('value'),
                "semester": $('#Semester option:checked').attr('value'),
                "examType":  $('#testType option:checked').attr('value'),
                "gradeName": $("#query_toId").val(),
                "className": $("#query_privId").val(),
                "examUserName": $("#query_userId").val(),
                "examArrange": ue.getContent()
            };
           if(action == "update"){
                var testId=$(this).attr("testId");
                data['Id']=testId;
                savetest("/eduExam/editExamInfor");
            }else if(action == "add"){
                savetest("/eduExam/updateExam");
            }
        });
        //编辑新建时返回按钮
        $("#rs").click(function(){
            $(".pagediv1").show();
            $(".testQuery").hide();
            $(".testImport").hide();
            $(".newtest").hide();
        });
        //点击全选
        $(".pagediv1").on('click','#checkedAll',function(){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
                $(".checkChild").prop("checked",true);
            }else{
                $(this).prop("checked",false);
                $(".checkChild").prop("checked",false);
            }
        });
        //点击删除选中按钮
        $(".pagediv1").on('click','.delete_check',function(){
            var sunId ="";
            $(".pagediv1 .checkChild:checkbox:checked").each(function(){
                sunId += $(this).attr("conid")+",";
            })
            alert(sunId);
            if(sunId == ''){
                $.layerMsg({content:'请选择文件！',icon:1});
            }else{
                layer.confirm('确定删除吗？', {
                    btn: ['删除','取消'], //按钮
                    title:"删除事件"
                }, function(){
                    //确定删除，调接口
                    $.ajax({
                        type:'post',
                        url:'/eduExam/deleteManyExam',
                        dataType:'json',
                        data:{'ids':sunId},
                        success:function(){
                            sunId ="";
                            layer.msg('删除成功', { icon:6});
                            ajaxPage.page()
                            $('.Query').click(function () {
                                ajaxPage.data.page=1;
                                ajaxPage.page()
                            })
                        }
                    })
                }, function(){
                    layer.closeAll();
                });
            }
        });
        //添加附件
        <%--$('#uploadimg').click(function(){--%>
            <%--$('#uploadinputimg').click();--%>
        <%--});--%>
        <%--$('#uploadinputimg').change(function(e){--%>
            <%--var target = $(e.target);--%>
            <%--var file;--%>
            <%--if(target[0].files && target[0].files[0]){--%>
                <%--file=target[0].files[0];--%>
            <%--}--%>

            <%--if(file){--%>
                <%--$.upload($('#uploadimgform'),function(res){--%>
                    <%--console.log(res);--%>
                    <%--var str = "";--%>
                    <%--var str1="";--%>
                    <%--res.obj.forEach(function(v,i){--%>
                        <%--console.log(v.attachId);--%>
                        <%--console.log(v.attachName);--%>

                        <%--str+='<div class="divDe" style="float:left;margin-right:10px;"><a class="ATTACH_a dech" deUrl="'+encodeURI(v.attUrl)+'" NAME="'+v.attachName+'*" href="<%=basePath %>download?'+encodeURI(v.attUrl)+'">'+v.attachName+'</a>' +--%>
                            <%--'<img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><br>'+--%>
                            <%--'<input type="hidden" class="inHidden" NAME="'+v.attachName+'*" value="'+v.aid+'@'+v.ym+'_'+v.attachId+',"></div>';--%>
                    <%--});--%>

                    <%--$('#query_uploadArr').append(str);--%>

                <%--});--%>
            <%--}--%>
        <%--});--%>

        $('#uploadinputimg').fileupload({
            dataType:'json',
            done: function (e, data) {
                if(data.result.obj != ''){
                    var data = data.result.obj;
                    var str = '';
                    var str1 = '';
                    for (var i = 0; i < data.length; i++) {
                        str += '<div class="dech" deUrl="' + data[i].attUrl+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                    }
                    $('#query_uploadArr').append(str);
                }else{
                    //alert('添加附件大小不能为空!');
                    layer.alert('添加附件大小不能为空!',{},function(){
                        layer.closeAll();
                    });
                }
            }
        });

        $('#query_uploadArr').on('click','.deImgs',function(){
            var data=$(this).parents('.dech').attr('deUrl');
            var dome=$(this).parents('.dech');
            deleteChatment(data,dome);
        })

        //删除附件
        function deleteChatment(data,element){

            layer.confirm('<fmt:message code="menuSSetting.th.isdeleteMenu" />？', {/*确定要删除吗*/
                btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮 /* 确定  取消*/
                title:'<fmt:message code="notice.th.DeleteAttachment" />'/*删除附件*/
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'get',
                    url:'../delete',
                    dataType:'json',
                    data:data,
                    success:function(res){

                        if(res.flag == true){
                            layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});/*删除成功*/
                            element.remove();
                        }else{
                            layer.msg('<fmt:message code="lang.th.deleSucess" />', { icon:6});/*删除失败*/
                        }
                    }
                });

            }, function(){
                layer.closeAll();
            });
        }
        /* 考试查询按钮 */
        $('#Querydata').click(function (){
            ajaxPage.data.schoolYear= $("#format").val();
            ajaxPage.data.semester= $('#type_id').val();
            ajaxPage.data.examType= $('#examType').val();
            ajaxPage.data.examArrange= $('#subject').val();
            /*ajaxPage.data.useFlag= false;
            ajaxPage.data.page= 1;
            ajaxPage.data.pageSize= "";*/
            ajaxPage.page()
            $(".pagediv1").show();
            $(".testQuery").hide();
            $(".testImport").hide();
            $(".newtest").hide();
        });



    })
</script>
</html>
