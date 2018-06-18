
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
    <title></title>
    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <!-- 课程管理  -->
    <link rel="stylesheet" type="text/css" href="../css/news/management_query.css" />
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
</head>
<style>
    .release4{
        margin-top: 10px;
    }
    #tr_td .publishtip {
        overflow: hidden;
        text-overflow:ellipsis;
        width: 60px;
        white-space:nowrap;
    }

    /*标题长时隐藏设置*/
    .title{
        width: 300px;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }
    .head .headli3{
        width:120px;
    }
    .float {
        float: left;
    }
    #cx{
        float:left;
    }

    .left .inputWidth{
        width:150px;
        margin:20px 0px 0px 5px;
    }
    .div_table{
        font-size:14px;
        width:80%;
        margin:0 auto;
        line-height:40px;
    }
    .seeTitle{
        text-align:center;
        font-weight:bold;
    }
    .seeTitle span{
        padding:0px 10px;
    }
    /*多选框div定位*/
    .checkboxdiv1{
        position:absolute;  left:16.8%; top:55%
    }
    .checkboxdiv2{
        position:absolute;  left:22.8%; top:55%
    }
    .checkboxdiv3{
        position:absolute;  left:27.5%; top:55%
    }
    .checkboxdiv4{
        position:absolute;  left:32.3%; top:55%
    }
    #tr_td,td{
        border:none;
    }
    .pagediv a{
        color:#1772c0;
    }
    .foot_mg .btn_ #hd{
        background:url(../../img/save.png) no-repeat;
        color:#000;
        width:80px;
    }
    .foot_mg .btn_ #rd{
        background:url(../../img/newReturn.png) no-repeat;
        color:#000;
        width:80px;
    }
</style>
<body>
<div class="bx">
    <!--head开始-->
    <div class="head w clearfix">
        <ul class="index_head">
            <li data_id="">
                <span class="one headli1_1">课程管理</span>
                <img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            <li data_id="0" style="">
                <span class="headli2_1">新建课程</span>

            </li>

        </ul>
    </div>
    <!--head通栏结束-->

    <!--navigation开始-->
    <div class="step1">
        <div class="navigation  clearfix">
            <div class="left">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png">
                <div class="news">
                    全部课程
                </div>
                <label class="float">课程编号:</label>
                <input type="text" class="float inputWidth" id="courseId"/>
                <label  class="float">&nbsp;&nbsp;课程名称:</label>
                <input type="text" class="float inputWidth" id="courseName"/>
                <label  class="float">&nbsp;&nbsp;学分:</label>
                <input type="text" class="float inputWidth" id="courseScore"/>
                <!-- 查询按钮 -->
                <div id="cx" class="submit float"> 查询</div>
                <div class="submitnot float" onclick="clearForm()">重置</div>
            </div>
            <div class="right">
                <!-- 分页按钮-->
                <div class="M-box3">
                </div>
            </div>
        </div>
        <!--navigation结束-->
        <!--content部分开始-->
        <div>
            <div>
                <table id="tr_td" border="1" style="border-collapse: collapse;">
                    <thead>
                    <tr>
                        <td class="th">课程编号</td>
                        <td class="th">课程名</td>
                        <td class="th">学分</td>
                        <td class="th">课时</td>
                        <td class="th" align="center">操作</td>
                    </tr>
                    </thead>
                    <tbody id="j_tb">

                    </tbody>
                </table>
            </div>
        </div>
        <!--content部分结束-->
    </div>
    <!-- 新建课程页面********************* -->
    <div class="step2" style="display: none;margin-left: 10px;">
        <!-- 中间部分 -->
        <table class="newNews">
            <div class="nav_box clearfix">
                <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png"></div>
                <div class="nav_t2" class="news">新建课程</div>
            </div>
            <tbody>
            <tr>
                <td class="td_w">
                    课程编号:
                </td>
                <td>
                    <input class="td_title1" id="COURSE_ID" name="courseId"  type="text" placeholder="请输入课程编号..."/>
                    <img class="td_title2" src="../img/mg2.png" alt=""/>
                </td>
            </tr>
            <tr>
                <td class="td_w">  课程名称:</td>
                <td>
                    <input class="td_title1" id="COURSE_NAME" name="courseName" type="text"  placeholder="请输入课程名称..."/>
                    <img class="td_title2" src="../img/mg2.png" alt=""/>

                </td>
            </tr>
            <tr id="role">
                <td class="td_w">  课程序号:</td>
                <td>
                    <input class="td_title1" id="ORDER_NO" name="orderNo" type="text"  value="10"/>
                </td>
            </tr>
            <tr id="man">
                <td class="td_w"> 课程阶段: </td>
                <td height="90px">
                    <div>
                        <div class="checkboxdiv1"><input type="checkbox" name="stage" class="news_t1 remindCheck" value="0">幼儿园</div>
                        <div class="checkboxdiv2"><input type="checkbox" name="stage" class="news_t1 remindCheck" value="1">小学</div>
                        <div class="checkboxdiv3"><input type="checkbox" name="stage" class="news_t1 remindCheck" value="2">初中</div>
                        <div class="checkboxdiv4"><input type="checkbox" name="stage" class="news_t1 remindCheck" value="3">高中</div>
                    </div>
                </td>
            </tr>
            <tr>
                <td class="td_w">
                    所属领域:
                </td>
                <td>
                    <select name="realm" class="anonymityYn" id="REALM"></select>
                </td>
            </tr>
            <tr>
                <td class="td_w">
                    课程类别:
                </td>
                <td>
                    <select name="courseType" class="anonymityYn" id="COURSE_TYPE"></select>
                </td>
            </tr>
            <tr>
                <td class="td_w">
                    选课指导:
                </td>
                <td class="top_box">
                    <textarea id="guidance" name="guidance" cols="74" rows="3" value></textarea>
                </td>
            </tr>
            <tr>
                <td class="td_w">学分:</td>
                <td><input class="td_title1" id="COURSE_SCORE" name="courseScore" type="text"  /></td>
            </tr>
            <tr>
                <td class="td_w">周学时间:</td>
                <td><input class="td_title1" id="CREDIT_HOURS" name="creditHours" type="text"  /></td>
            </tr>
            <tr>
                <td class="td_w">人数上限:</td>
                <td><input class="td_title1" id="MAX_MEMBER" name="maxMember" type="text"  /></td>
            </tr>
            <tr>
                <td class="td_w">年级要求:</td>
                <td>
                    <textarea name="gradeReq" id="GRADE_REQ" cols="74" rows="3" value></textarea></td>
            </tr>
            <tr>
                <td class="td_w">性别要求:</td>
                <td>
                    <textarea id="SEX_REQ" name="sexReq" cols="74" rows="3" value></textarea></td>
            </tr>
            <tr>
                <td class="td_w">上课时间要求:</td>
                <td>
                    <textarea id="classTimeReq" name="classTimeReq" id="CLASS_TIME_REQ" cols="74" rows="3" value></textarea>
                </td>
            </tr>
            <tr>
                <td class="td_w">场地要求:</td>
                <td>
                    <textarea id="SITE_REQ" name="siteReq"  cols="74" rows="3" value></textarea>
                </td>
            </tr>
            <tr>
                <td class="td_w">课程规划:</td>
                <td colspan="2">
                    <div class="content" id="container" name="courseDescription" type="text/plain" style="width: 100%;min-height: 200px;"></div>
                </td>
            </tr>
            <tr>
                <td class="td_w">
                    附件上传:
                </td>
                <td class="enclosure">
                    <div id="query_uploadArr" style="display: block;">

                    </div>
                    <div><img src="../img/mg11.png" alt=""/></div>
                    <!--  <div class="enclosure_t"><a href="#">添加附件</a></div> -->
                    <div>
                        <form id="uploadimgform" target="uploadiframe"  action="../upload?module=news" enctype="multipart/form-data" method="post" >
                            <input type="file" name="file" id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;
filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
                            <a id="uploadimg" style="cursor: pointer;">添加附件</a>
                        </form>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="foot_mg">
            <div class="btn_">
                <div  id="hd" type="publish" class="">保存</div>
                <div  id="rd" type="save" class="">返回</div>
            </div>
        </div>
    </div>
</div>
<script>
    var ue = UE.getEditor('container');
    //列表数据
    function dataList(datas){

        $('tbody').eq(0).empty();
        if(datas.length>0){
            for(var i=0;i<datas.length;i++) {
                var newCon = $('<tr class="conLeft cue" id=' + datas[i].id + '>' +
                    '<td class="ellipsis" id="courseId">' + datas[i].courseId + '</td>' +
                    '<td class="ellipsis">' + datas[i].courseName + '</td>' +
                    '<td class="ellipsis">' + function () {
                            if(datas[i].courseScore==undefined){
                                return "";
                            }else{
                                return datas[i].courseScore;
                            }
                    }()
                    + '</td>' +
                    '<td class="ellipsis">' + function(){
                        if(datas[i].creditHours==undefined){
                            return "";
                        }else{
                            return datas[i].creditHours;
                        }
                    }() + '</td>' +
                    '<td class="pagediv" id="' + datas[i].id + '" align="center">' +
                    '<a href="javascript:;" style="padding:0px 10px" class="edit" onclick="revise(' + datas[i].id + ')">修改</a>' +
                    '<a href="javascript:;" style="padding:0px 10px" class="search" onclick="deletes(' + datas[i].id + ')">删除</a>' +
                    '</td>' +
                    ' </tr>');
                $('tbody').eq(0).append(newCon);
            }
        }else{
            $.layerMsg({content:'没有更多内容！',icon:3});
        }
    }

    function init(){
        $.ajax({
            type:'get',
            url:'/eduCourse/selectEdu',
            dataType:'json',
            success:function(res){
//                console.log(res);
                if(res.flag){
                    dataList(res.obj);
                }else{
                    $.layerMsg({content:"查询失败",icon:3});
                }
            }
        })
    }
    function clearForm(){
        courseId = $("#courseId").val("");
        courseName = $('#courseName').val("");
        courseScore = $('#courseScore').val("");
    }
    //删除
    function deletes(Id){
        layer.confirm('确定删除吗？', {
            btn: ['删除','取消']
        }, function(){
            $.ajax({
                type:'get',
                url:'/eduCourse/deleteByPrimaryKey',
                dataType:'json',
                data:{'id':Id},
                success:function(){
                    layer.msg('删除成功', { icon:6});
                    init();
                }
            })
        }, function(){
            layer.closeAll();
        });
    };

    function revise(id){
                            $('#hd').attr('ac','update');
                            $("#hd").attr("testId",id)
                            $('.step2').show();
                            $('.step1').hide();
                            $.ajax({
                                url:'/eduCourse/selectByPrimaryKey ',
                                type:'post',
                                data:{id:id},
                                dataType:'json',
                                success:function(data){
                                    var datas=data.object;
                                    var str='';
                                    $('#query_uploadArr').append(str);
                                    $("#COURSE_ID").val(datas.courseId);
                                    $("#COURSE_NAME").val(datas.courseName);
                                    $("#ORDER_NO").val(datas.orderNo);
                                    if(datas.attUrl != undefined){
                                        str='<div class="dech" deUrl="'+datas.attUrl+'"><a href="<%=basePath %>download?'+datas.attUrl+'" NAME="' + datas.attachmentName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>'+datas.attachmentName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+datas.attachmentId+'"></div>'
                                    }
                                    $('#query_uploadArr').html(str);
                                    if(data.object.stage !=undefined){
                                        var checkBoxArray =  data.object.stage.split(",");
                                        for(var i=0;i<checkBoxArray.length;i++){
                                            $("input[name='stage']").each(function(){
                                                if($(this).val()==checkBoxArray[i]){
                                                    $(this).prop("checked",true);
                                                }
                                            })
                                        };
                                    }

                $("#REALM").find("option[value="+data.object.realm+"]").attr("selected",true);
                $("#COURSE_TYPE").find("option[value="+data.object.courseType+"]").attr("selected",true);
                $("#guidance").val(data.object.guidance);
                $("#COURSE_SCORE").val(data.object.courseScore);
                $("#CREDIT_HOURS").val(data.object.creditHours);
                $("#MAX_MEMBER").val(data.object.maxMember);
                $("#GRADE_REQ").val(data.object.gradeReq);
                $("#SEX_REQ").val(data.object.sexReq);
                $("#classTimeReq").val(data.object.classTimeReq);
                $("#SITE_REQ").val(data.object.siteReq);
                ue.setContent(data.object.courseDescription);
            }
        })
    };
    // 获取所属领域、课程类别控件
    function coursesSelect(courses,type){
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
                    $(courses).append(str);
                }
            }
        })
    }

    //    点击返回
    $('#rd').click(function(){
        $('.step2').hide();
        $('.step1').show();
        $('li').find('span').removeClass('one');
        $('li').eq(0).find('span').addClass('one');
    })
    //删除附件
//    function deleteChatment(data,element){
//        layer.confirm('确定删除吗？', {
//            btn: ['确定','取消'], //按钮
//            title:'删除附件'
//        }, function(){
//            //确定删除，调接口
//            $.ajax({
//                type:'get',
//                url:'/delete',
//                dataType:'json',
//                data:data,
//                success:function(res){
//
//                    if(res.flag == true){
//                        layer.msg('删除成功', { icon:6});
//                        element.remove();
//                    }else{
//                        layer.msg('删除失败', { icon:6});
//                    }
//                }
//            });
//            layer.closeAll();
//        }, function(){
//            layer.closeAll();
//        });
//    }
</script>
<script>
    $(function () {
        init();
        coursesSelect('#REALM','COURSE_REALM');
        coursesSelect('#COURSE_TYPE','COURSE_TYPE');
        // tab切换
        $('li').click(function(){
            var i=$(this).index();
            if(i==0){
                $('.step1').show();
                $('.step2').hide();
                $(this).find('span').addClass('one')
                $(this).siblings().find('span').removeClass('one');
            }
            if(i==1){
                $('.step2').show();
                $('.step1').hide();
                $(this).find('span').addClass('one')
                $(this).siblings().find('span').removeClass('one');
                $('#hd').attr('ac','add');
                $(".remindCheck").prop("checked",false);
                $('#COURSE_ID').val('');
                $('#COURSE_NAME').val('');
                $('#ORDER_NO').val('');
                $('#guidance').val('');
                $('#COURSE_SCORE').val('');
                $('#CREDIT_HOURS').val('');
                $('#MAX_MEMBER').val('');
                $('#GRADE_REQ').val('');
                $('#SEX_REQ').val('');
                $('#classTimeReq').val('');
                $('#SITE_REQ').val('');
                $('#query_uploadArr').html('');
                ue.setContent('');
            }
        });
        /* 课程查询按钮 */
        $('.submit').click(function (){
            var courseId = $("#courseId").val();
            var courseName = $('#courseName').val();
            var courseScore = $('#courseScore').val();
            $.ajax({
                type:'post',
                url:'/eduCourse/selectEdu',
                dataType:'json',
                data:{
                    courseId:courseId,
                    courseName:courseName,
                    courseScore:courseScore
                },
                success:function(res){
                    if(res.flag){
                        dataList(res.obj);
                    }else{
                        $.layerMsg({content:"查询失败",icon:3});
                    }
                }
            })
        });
        //编辑新建时保存调用的接口
        $("#hd").click(function(){
            var action=$(this).attr("ac");
            var stage = "";
            $("input[name='stage']").each(function(){
                if($(this).prop("checked")==true){
                    stage += $(this).val()+','
                }
            });
            var aId='';
            var uId='';
            for(var i=0;i<$('#query_uploadArr .inHidden').length;i++){
                aId += $('#query_uploadArr .inHidden').eq(i).val();
                uId += $('#query_uploadArr a').eq(i).attr('name');
            };
            var data = {
                "courseId": $("#COURSE_ID").val(),
                "courseName": $('#COURSE_NAME').val(),
                "orderNo": $('#ORDER_NO').val(),
                "stage":stage,
                "realm": $('#REALM option:checked').attr('value'),
                "courseType":  $('#COURSE_TYPE option:checked').attr('value'),
                "guidance": $("#guidance").val(),
                "courseScore": $("#COURSE_SCORE").val(),
                "maxMember": $("#MAX_MEMBER").val(),
                "gradeReq": $("#GRADE_REQ").val(),
                "sexReq": $("#SEX_REQ").val(),
                "classTimeReq": $("#classTimeReq").val(),
                "siteReq": $("#SITE_REQ").val(),
                "creditHours": $("#CREDIT_HOURS").val(),
                "attachmentId":aId,//附件ID串
                "attachmentName":uId,//附件名称串
                "courseDescription": ue.getContent()
            };
            if(action == "update"){
                var testId=$(this).attr("testId");
                data['id']=testId;
                if($('#COURSE_ID').val()==""){
                    $.layerMsg({content:"课程编号不能为空!",icon:2})
                }else if($('#COURSE_NAME').val()==""){
                    $.layerMsg({content:"课程名称不能为空!",icon:2})
                } else{
                    $.ajax({
                        url:"/eduCourse/updateByPrimaryKeySelective",
                        type:'post',
                        dataType:"JSON",
                        data : data,
                        success:function(data){
                            $('.step1').show();
                            $('.step2').hide();
                            location.reload();
                        },
                        error:function(e){
//                        console.log(e);
                        }
                    });
                }
            }else if(action == "add"){
                if($('#COURSE_ID').val()==""){
                    $.layerMsg({content:"课程编号不能为空!",icon:2})
                }else if($('#COURSE_NAME').val()==""){
                    $.layerMsg({content:"课程名称不能为空!",icon:2})
                }
                else{

                    $.ajax({
                        url:"/eduCourse/insertEdu",
                        type:'post',
                        dataType:"JSON",
                        data : data,
                        success:function(data){
                            $('.step1').show();
                            $('.step2').hide();
                          location.reload();
                        },
                        error:function(e){
//                        console.log(e);
                        }
                    });
                }




            }
        });
        /* 新建页面附件添加 */
//        $('#uploadimg').click(function () {
//            $('#uploadinputimg').click();
//        });
//        $('#uploadinputimg').change(function (e) {
//            var target = $(e.target);
//            var file;
//            if (target[0].files && target[0].files[0]) {
//                file = target[0].files[0];
//            }
//            if (file) {
//                $.upload($('#uploadimgform'), function (res) {
//                    var str = "";
//                    var str1 = "";
//                    res.obj.forEach(function (v, i) {
//                        str += '<div deUrl="' + v.attUrl + '" class="dech" style="display:block;"><a class="ATTACH_a" NAME="' + v.attachName + '*" href="http://192.168.0.18:80/download?' + v.attUrl + '"><img style="width:16px;" src="../img/file/cabinet@.png"/>' + v.attachName + '</a><img   class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/>' +
//                            '<input type="hidden" class="inHidden" NAME="' + v.attachName + '*" value="' + v.aid + '@' + v.ym + '_' + v.attachId + ',"></div>';
//                    });
//                    $('#query_uploadArr').append(str);
//                });
//            }
//        });
//        $('#query_uploadArr').on('click', '.deImgs', function () {
//            var data = $(this).parents('.dech').attr('deUrl');
//            var dome = $(this).parents('.dech');
////                            alert(data);
////                            alert(dome);
//            deleteChatment(data, dome);
//        });
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

    })



</script>
</body>
</html>
