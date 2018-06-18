<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:03
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
<html>
<head>
    <title><fmt:message code="doc.th.AlreadyDocument"/></title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">

    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <script type="text/javascript" src="/js/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

</head>
<style>
    .Export{
        background: #00a0e9;
        margin-left: 10px;
        padding:5px 10px;
        border-radius: 4px;
        color: #fff;
        cursor: pointer;
    }
    .NEW{
        background: #00a0e9;
        margin-left: 10px;
        padding:5px 10px;
        border-radius: 4px;
        color: #fff;
        cursor: pointer;
    }
    .div_tr{
        margin: 10px;
    }
    .span_td{
        display: inline-block;
        margin-top: 20px;
        width: 110px;
        text-align: right;
    }
    .inPole{
        display: inline-block;
    }
</style>
<body>
    <div class="headTop">
        <div class="headImg">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yibanfawen.png" alt="">
        </div>
        <div class="divTitle">
           教师获奖信息
        </div>
    </div>
    <div style="margin: 0 auto;margin-top: 46px;height: 60px;width: 97%;" class="clearfix">
        <label class="fl" style="margin-top: 16px;">
            <span class="fl" style="margin-top: 5px;">教师名称：</span>
            <div class="inPole" style="width:240px;margin-top:0px;"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 120px;min-height:30px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div>
        </label>

        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;">
            <span class="fl" style="margin-top: 5px;" >获奖时间：</span>
            <label class="fl">
                <input type="text" name="time" id="time_2" placeholder="<fmt:message code="doc.th.enterDate"/>" onclick="laydate({istime: true, format: 'YYYY-MM'})"></label>

        </label>
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;">获奖项目：</span>
            <label class="fl"><input name="prizeProject" id="prizeProject_2" placeholder="请输入获奖项目"  type="text"></label>
            <button  type="button" class="Query fl"><fmt:message code="global.lang.query"/></button>
            <button  type="button" class="Export" onclick="export_1();">导出Excel</button>
            <button  type="button" class="NEW">新建获奖信息</button>
        </label>
        <div id="dbgz_page" class="M-box3 fr">

        </div>
    </div>


    <div class="pagediv" style="margin: 0 auto;width: 97%;">
        <table>
            <thead>
            <tr>
                <th>序号</th>
                <th>教师姓名</th>
                <th>任课班级</th>
                <th>科目</th>
                <th>获奖项目</th>
                <th>获奖时间</th>
                <th>级别</th>
                <th>备注</th>
                <th><fmt:message code="notice.th.operation"/></th>
            </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
    <script>
         //格式化时间
        function   formatDate(now)   {
            if(now!=''&& now!=undefined){
                var   year=now.getFullYear();
                var   month=now.getMonth()+1;
                var   date=now.getDate();
                var   hour=now.getHours();
                var   minute=now.getMinutes();
                var   second=now.getSeconds();
                return  year+"年"+month+"月";
            }else{
                return "";
            }
        }




        var dept_id='';
        var user_id='';
        $('#selectUser').click(function(){//选人员控件
            user_id='userDuser';
            $.popWindow("../common/selectEduUser?0");
        });
        $('#clearUser').click(function(){ //清空人员
            $('#userDuser').attr('user_id','');
            $('#userDuser').attr('dataid','');
            $('#userDuser').val('');
        });

        var ajaxPage={
            data:{
                page:1,//当前处于第几页
                pageSize:5,//一页显示几条
                useFlag:true,
                teacherUserId:null,
                time:null,
                prizeProject:null
            },
            init:function () {
            },
            page:function () {
                var me=this;
                this.data.teacherUserId=$('#userDuser').attr('user_id');
                this.data.time=$('[name="time"]').val()
                this.data.prizeProject=$('[name="prizeProject"]').val()
                $.get('/eduPrize/getAllEduPrizeInfo',me.data,function (json) {

                        var str='';
                        var arr=json.obj
                        for(var i=0;i<arr.length;i++){
                            str+='<tr>'+
                                '<td>'+arr[i].idNo+'</td>' +
                                '<td>'+arr[i].teacherUserName+'</td>' +
                                '<td>'+arr[i].gradeName+arr[i].className+'</td>' +
                                '<td>'+arr[i].subjectName+'</td>' +
                                '<td>'+function () {
                                    if(arr[i].prizeProject){
                                        return arr[i].prizeProject
                                    }else {
                                        return ""
                                    }
                                }()+'</td>'+
                               '<td>'+function () {
                                    if(arr[i].time){
                                        var c= new Date(arr[i].time);
                                        return formatDate(c)
                                    }else {
                                        return ""
                                    }
                                }()+'</td>'+
                                '<td>'+arr[i].levelName+'</td>' +
                                '<td>'+function () {
                                    if(arr[i].remark){
                                        return arr[i].remark
                                    }else {
                                        return ""
                                    }
                                }()+'</td>'+
                                '<td>' +
                                '<a href="javascript:void(0)" data-id="'+json.obj[i].id+'" onclick="edit('+json.obj[i].id+');" class="editSc">编辑</a>&nbsp;&nbsp;<a href="javascript:void(0)" data-id="'+json.obj[i].id+'"  onclick="delete_1('+json.obj[i].id+');" class="deleteSc"><fmt:message code="global.lang.delete"/></a>' +
                                '</td>' +
                                '</tr>'
                        }
                        $('.pagediv table tbody').html(str)
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

        ajaxPage.init()
        ajaxPage.page()
        $('.Query').click(function () {
            ajaxPage.data.page=1;
            ajaxPage.page()
        })

        function edit(e){
            layer.open({
                type: 1,
                title: ['编辑教师获奖信息', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '500px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                content: '<div class="div_table" style="margin-left: 35px;">'+
                '<div class="div_tr"><span class="span_td">教师姓名：</span><span><div class="inPole"><textarea name="txt" id="userDuser_2" user_id="" value="" disabled style="min-width: 210px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser_2" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser_2" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                '<div class="div_tr"><span class="span_td">任课年级：</span><span><select id="grade" style="width: 210px;"></select></span></div>' +
                '<div class="div_tr"><span class="span_td">任课班级：</span><span><select id="clazz" style="width: 210px;"></select></span></div>'+
                '<div class="div_tr"><span class="span_td">科目：</span><select id="subject" style="width: 210px;"></select></div>'+
                '<div class="div_tr"><span class="span_td">获奖项目：</span><span><input type="text" id="prizeProject" style="width: 210px;float: none;" name="prizeProject" class="inputTd" value="" /></span></div>'+
                '<div class="div_tr"><span class="span_td">获奖时间：</span><span><input type="text" id="time" style="width: 210px;float: none;" name="time" class="inputTd startTime test_null" value="" onclick="laydate(start)" /></span></div>' +
                '<div class="div_tr"><span class="span_td">级别：</span><select id="level" style="width: 210px;"></select></div>'+
                '<div class="div_tr"><span class="span_td">备注：</span><textarea name="txt" id="remark" value="" style="min-width: 210px;min-height:50px;"></textarea><input type="hidden" id="ID"></div>'+
                '</div>',
                success:function(){

                    //选人
                    $('#selectUser_2').click(function(){//选人员控件
                        user_id='userDuser_2';
                        $.popWindow("../common/selectEduUser?0");
                    });
                    $('#clearUser_2').click(function(){ //清空人员
                        $('#userDuser_2').attr('user_id','');
                        $('#userDuser_2').attr('dataid','');
                        $('#userDuser_2').val('');
                    });

                    //查询年级
                    $.ajax({
                        type: 'get',
                        url: '<%=basePath%>eduDepartment/queryObjectsBydeptParent',
                        data: {'deptParent':2},
                        dataType: 'json',
                        success: function (res) {
                            var str="<option value='0'>请选择</option>";
                            if(res.obj!=undefined){
                                for(var i=0;i<res.obj.length;i++){
                                    str+='<option value="'+res.obj[i].deptId+'">'+res.obj[i].deptName+'</option>'
                                }
                            }
                            $('#grade').append(str);
                        }
                    });

                    //获取科目
                    $.ajax({
                        type: 'get',
                        url: '<%=basePath%>eduPrize/getAllSubject',
                        dataType: 'json',
                        success: function (res) {
                            $('#subject').html("");
                            var str="<option value=' '>请选择</option>";
                            if(res.obj!=undefined){
                                for(var i=0;i<res.obj.length;i++){
                                    str+='<option value="'+res.obj[i].courseId+'">'+res.obj[i].courseName+'</option>'
                                }
                            }
                            $('#subject').append(str);
                        }
                    });
                    //查询班级
                    $('#grade').change(function(){
                        if($('#grade').val()!="0"){
                            $('#clazz').html("");
                            $.ajax({
                                type: 'get',
                                url: '<%=basePath%>eduDepartment/queryObjectsBydeptParent',
                                data: {'deptParent':$('#grade').val()},
                                dataType: 'json',
                                success: function (res) {
                                    str="<option value=' '>请选择</option>";
                                    if(res.obj!=undefined){
                                        for(var i=0;i<res.obj.length;i++){
                                            str+='<option value="'+res.obj[i].deptId+'">'+res.obj[i].deptName+'</option>'
                                        }
                                    }
                                    $('#clazz').append(str);
                                }
                            });
                        }else{
                            $('#clazz').html("");
                            var str="<option value=' '>请选择</option>";
                            $('#clazz').append(str);
                        }
                    })
                    //获取级别
                    $.ajax({
                        url: "<%=basePath%>/code/GetDropDownBox",
                        type:'get',
                        dataType:"JSON",
                        data : {"CodeNos":"PRIZE_LEVEL"},
                        success:function(data){
                            $('#level').html("");
                            var str="<option value=' '>请选择</option>";
                            for (var proId in data){
                                for(var i=0;i<data[proId].length;i++){
                                    str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
                                }
                            }
                            $('#level').append(str);
                        }
                    })

                      //回显数据
                    $.ajax({
                        type: 'get',
                        url: '<%=basePath%>eduPrize/getEduPrizeInfoById',
                        data: {id: e},
                        dataType: 'json',
                        success: function (res) {
                            var datas = res.obj;
                            $('#ID').val(datas.id);
                            $('#userDuser_2').attr('user_id', datas.teacherUserId);
                            $('#userDuser_2').val(datas.teacherUserName);
                            $('#grade').val(datas.grade);
                            $('#subject').val(datas.subject);
                            $('#prizeProject').val(datas.prizeProject);
                            $('#time').val(datas.time);
                            $('#level').val(datas.level);
                            $('#remark').val(datas.remark);
                            if($('#grade').val()!="0"){
                                $('#clazz').html("");
                                $.ajax({
                                    type: 'get',
                                    url: '<%=basePath%>eduDepartment/queryObjectsBydeptParent',
                                    data: {'deptParent':$('#grade').val()},
                                    dataType: 'json',
                                    success: function (res) {
                                        str="<option value=' '>请选择</option>";
                                        if(res.obj!=undefined){
                                            for(var i=0;i<res.obj.length;i++){
                                                str+='<option value="'+res.obj[i].deptId+'">'+res.obj[i].deptName+'</option>'
                                            }
                                        }
                                        $('#clazz').append(str);
                                        $('#clazz').val(datas.clazz);
                                    }
                                });
                            }else{
                                $('#clazz').html("");
                                var str="<option value=' '>请选择</option>";
                                $('#clazz').append(str);
                            }

                        }
                    })
                },
                yes: function (index) {
                    if($('#userDuser_2').val() ==''){
                        $.layerMsg({content:'<fmt:message code="sup.th.With*" />！',icon:2});
                        return;
                    }
                    var data = {
                        id:$('#ID').val(),
                        teacherUserId:$('#userDuser_2').attr('user_id'),
                        teacherUserName:$('#userDuser_2').val(),
                        grade:$('#grade').val(),
                        clazz:$('#clazz').val(),
                        subject: $('#subject').val(),
                        prizeProject: $('#prizeProject').val(),
                        time:$('#time').val(),
                        level:$('#level').val(),
                        remark:$('#remark').val()
                    }
                    editClassification(data);
                    layer.close(index);
                },
            });

            //编辑分类接口
            function editClassification(data){
                $.ajax({
                    url: "<%=basePath%>/eduPrize/editEduPrizeInfo",
                    type:'get',
                    dataType:"JSON",
                    data : data,
                    success:function(data){
                        if(data.flag==true){
                            $.layerMsg({content:'编辑成功',icon:1});
                            ajaxPage.data.page=1;
                            ajaxPage.page()
                        }else{
                            $.layerMsg({content:'编辑失败',icon:2});
                        }
                    }
                })
            }
        }
       $(function(){
           $('.NEW').click(function(){
               layer.open({
                   type: 1,
                   title: ['新建教师获奖信息', 'background-color:#2b7fe0;color:#fff;'],
                   area: ['600px', '500px'],
                   shadeClose: true, //点击遮罩关闭
                   btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
                   content: '<div class="div_table" style="margin-left: 35px;">'+
                   '<div class="div_tr"><span class="span_td">教师姓名：</span><span><div class="inPole"><textarea name="txt" id="userDuser_1" user_id="" value="" disabled style="min-width: 210px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser_1" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser_1" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
                   '<div class="div_tr"><span class="span_td">任课年级：</span><span><select id="grade_1" style="width: 210px;"></select></span></div>' +
                   '<div class="div_tr"><span class="span_td">任课班级：</span><span><select id="clazz_1" style="width: 210px;"></select></span></div>'+
                   '<div class="div_tr"><span class="span_td">科目：</span><select id="subject_1" style="width: 210px;"></select></div>'+
                   '<div class="div_tr"><span class="span_td">获奖项目：</span><span><input type="text" id="prizeProject_1" style="width: 210px;float: none;" name="mrCapacity" class="inputTd" value="" /></span></div>'+
                   '<div class="div_tr"><span class="span_td">获奖时间：</span><span><input type="text" id="time_1" style="width: 210px;float: none;" name="typeName" class="inputTd startTime test_null" value="" onclick="laydate(start)" /></span></div>' +
                   '<div class="div_tr"><span class="span_td">级别：</span><select id="level_1" style="width: 210px;"></select></div>'+
                   '<div class="div_tr"><span class="span_td">备注：</span><textarea name="txt" id="remark_1" value="" style="min-width: 210px;min-height:50px;"></textarea></div>'+
                   '</div>',
                   success:function(){
                       //选人
                       $('#selectUser_1').click(function(){//选人员控件
                           user_id='userDuser_1';
                           $.popWindow("../common/selectEduUser?0");
                       });
                       $('#clearUser_1').click(function(){ //清空人员
                           $('#userDuser_1').attr('user_id','');
                           $('#userDuser_1').attr('dataid','');
                           $('#userDuser_1').val('');
                       });

                       //查询年级
                       $.ajax({
                           type: 'get',
                           url: '<%=basePath%>eduDepartment/queryObjectsBydeptParent',
                           data: {'deptParent':2},
                           dataType: 'json',
                           success: function (res) {
                               var str="<option value='0'>请选择</option>";
                             if(res.obj!=undefined){
                                 for(var i=0;i<res.obj.length;i++){
                                     str+='<option value="'+res.obj[i].deptId+'">'+res.obj[i].deptName+'</option>'
                                 }
                             }
                               $('#grade_1').append(str);
                           }
                       });
                       //查询班级
                       $('#grade_1').change(function(){
                           if($('#grade_1').val()!="0"){
                           $('#clazz_1').html("");
                           $.ajax({
                               type: 'get',
                               url: '<%=basePath%>eduDepartment/queryObjectsBydeptParent',
                               data: {'deptParent':$('#grade_1').val()},
                               dataType: 'json',
                               success: function (res) {
                                   str="<option value=' '>请选择</option>";
                                   if(res.obj!=undefined){
                                       for(var i=0;i<res.obj.length;i++){
                                           str+='<option value="'+res.obj[i].deptId+'">'+res.obj[i].deptName+'</option>'
                                       }
                                   }
                                   $('#clazz_1').append(str);
                               }
                           });
                           }else{
                               $('#clazz_1').html("");
                               var str="<option value=' '>请选择</option>";
                               $('#clazz_1').append(str);
                           }
                       })
                 //获取科目
                       $.ajax({
                           type: 'get',
                           url: '<%=basePath%>eduPrize/getAllSubject',
                           dataType: 'json',
                           success: function (res) {
                               $('#subject').html("");
                               var str="<option value=' '>请选择</option>";
                               if(res.obj!=undefined){
                                   for(var i=0;i<res.obj.length;i++){
                                       str+='<option value="'+res.obj[i].courseId+'">'+res.obj[i].courseName+'</option>'
                                   }
                               }
                               $('#subject_1').append(str);
                           }
                       });

                       //获取级别
                       $.ajax({
                           url: "<%=basePath%>/code/GetDropDownBox",
                           type:'get',
                           dataType:"JSON",
                           data : {"CodeNos":"PRIZE_LEVEL"},
                           success:function(data){
                               $('#level').html("");
                               var str="<option value=' '>请选择</option>";
                               for (var proId in data){
                                   for(var i=0;i<data[proId].length;i++){
                                       str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
                                   }
                               }
                               $('#level_1').append(str);
                           }
                       })
               },
                   yes: function (index) {
                       if($('#userDuser_1').val() ==''){
                           $.layerMsg({content:'<fmt:message code="sup.th.With*" />！',icon:2});
                           return;
                       }
                       var data = {
                           teacherUserId:  $('#userDuser_1').attr('user_id'),
                           teacherUserName: $('#userDuser_1').val(),
                           grade:$('#grade_1').val(),
                           clazz:$('#clazz_1').val(),
                           subject:$('#subject_1').val(),
                           prizeProject:$('#prizeProject_1').val(),
                           time:$('#time_1').val(),
                           level:$('#level_1').val(),
                           remark:$('#remark_1').val()
                       }
                       newClassification(data);
                       layer.close(index);
                   },
               });
           })
           //新建分类接口
           function newClassification(data){
            $.ajax({
                url: "<%=basePath%>/eduPrize/addEduPrizeInfo",
                type:'get',
                dataType:"JSON",
                data : data,
                success:function(data){
                    if(data.flag==true){
                        $.layerMsg({content:'添加成功',icon:1});
                        ajaxPage.data.page=1;
                        ajaxPage.page()
                    }else{
                        $.layerMsg({content:'添加失败',icon:2});
                    }
                }
            })
           }

       })


         function export_1(){
             window.location.href ="exportExcel?teacherUserId="+$('#userDuser').attr('user_id')+"&time="+$('#time_2').val()+"&prizeProject="+$('#prizeProject_2').val();
         }

      function delete_1(e){
              layer.confirm('<fmt:message code="sup.th.Delete" />？', {
                  btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
                  title:"<fmt:message code="notice.th.DeleteFile" />"
              }, function(){
                  //确定删除，调接口
                  $.ajax({
                      type:'post',
                      url:'<%=basePath%>eduPrize/deleteEduPrizeInfo',
                      dataType:'json',
                      data:{'id':e},
                      success:function(){
                          layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                          ajaxPage.data.page=1;
                          ajaxPage.page()
                      }
                  })
              }, function(){
                  layer.closeAll();
              });
      }

         //时间控件调用
         var start = {
             format: 'YYYY-MM',
             /* min: laydate.now(), //设定最小日期为当前日期*/
             /* max: '2099-06-16 23:59:59', //最大日期*/
             istime: true,
             istoday: false,
             choose: function(datas){
                 end.min = datas; //开始日选好后，重置结束日的最小日期
                 end.start = datas //将结束日的初始值设定为开始日
             }
         };


    </script>
</body>
</html>
