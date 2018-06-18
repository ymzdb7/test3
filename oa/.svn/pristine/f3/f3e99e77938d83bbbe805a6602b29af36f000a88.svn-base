<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="../../lib/ueditor/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>
    <script src="/js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/base.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <title></title>
    <style>

   #search{
       font-size: 16px;
   }
   #export{
       font-size: 16px;
   }
   .newNew tr td{
        border:none;
    }
   .newNew .tableHead tr td{
            border:1px solid #c0c0c0;
        }
    .ban{
        width: 80px;
        height: 28px;
        padding-left: 10px;
    }
        #search{
            width: 90px;
            height: 28px;
            line-height: 28px;
            background:url("../../img/sys/icon_query_2 .png") no-repeat;
            cursor: pointer;
        }
        #export{
            width: 90px;
            height: 28px;
            line-height: 28px;
            background: url(../../img/sys/icon_export_2.png) no-repeat;
            cursor: pointer;
        }
       a{
           color:#2F8AE3;
           padding:0px 2px;
       }
        #return{
            width: 84px;
            height: 28px;
            line-height: 28px;
            margin: 0 auto;
            background: url(../../img/vote/return.png) no-repeat;
            cursor: pointer;
        }
        #delete{
            background: url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left: 20px;
            cursor: pointer;
            color: #000;
            display: inline-block;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<div class="step1" style="display: block;margin-left: 10px;">
    <!-- 查询部分 -->
    <table class="newNews">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_userManagement1.png"></div>
            <div class="nav_t2" class="searth">查询学生及家长信息</div>
        </div>
        <tbody>
        <tr>
            <td class="td_w blue_text">
                学号：
            </td>
            <td>
                <input class="td_title1" type="text" placeholder="" id="studentNo"/>
            </td>
        </tr>
        <tr>
            <td class="td_w blue_text">
                学生真实姓名：
            </td>
            <td>
                <input class="td_title1" id="studentName" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                手机：
            </td>
            <td>
                <input class="td_title1" id="phoneNumber" type="text" placeholder=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                性别：
            </td>
            <td>
                <select class="sex" id="sex" type="text" placeholder="">
                    <option  value="0">男</option>
                    <option  value="1">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                班级：
            </td>
            <td>
                <span>年级</span>
                <select class="ban" id="nianJi" type="text" placeholder="">
                    <option  value="">—选择—</option>
                </select>
                <span>班级</span>
                <select class="ban" id="banJi" type="text" placeholder="">
                    <option  value="">—选择—</option>
                </select>
            </td>
        </tr>
        <tr>
        <td colspan="2" style="text-align:center">
            <button type="button" class="search_but" id="search" >查询</button>
            <button type="button" class="export_but" id="export" >导出</button>
        </td>
        </tr>
        </tbody>
    </table>
</div>
<div class="list"  style="display:none">
    <%--列表展示部分--%>
    <table class="newNew">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="../../img/sys/new_dept.png"></div>
            <div class="nav_t2" class="searth">用户查询</div>
        </div>
        <thead>
        <tr class="tableHead">
            <td>选择</td>
            <td>年级班级</td>
            <td>用户名</td>
            <td>姓名</td>
            <td>角色</td>
            <td>最后访问</td>
            <td>闲置</td>
            <td>登录</td>
            <td>操作</td>
        </tr>

        </thead>
        <tbody class="listBody">

        </tbody>
        <tfoot >
        <tr>
            <td colspan="9"><input type="checkbox" name="all_but" id="all" >全选
                <a href="javascript:;" id="delete">删除</a>
                <%--<a href="javascript:;" id="empty">清空密码</a>--%>
        </tr>
        </tfoot>

    </table>
    <div style="text-align:center">
        <button type="button" class="return_but" id="return">返回</button>
    </div>
</div>

</body>

<script type="text/javascript" charset="utf-8" >

//点击查询后，查询列表展示
    $(function () {
            $('.step1').on('click','#search',function () {
                $('.step1').hide();
                $('.list').show();
                $('.listBody').empty();
                init();
            })
        $('.step1').on('click','#export',function () {
            window.location.href='/edu/student/getStudentExport?export=1&userId='+$("#studentNo").val()+
                '&userName='+$("#studentName").val()+'&mobilNo='+$("#phoneNumber").val()+'&sex='+$("#sex option:selected").val()+
                '&grade='+$("#nianJi option:selected").text()+'&clazz='+$("#banJi option:selected").text();
        })

                function init(){
                var data={
                    userId:$('#studentNo').val(),
                    userName:$('#studentName').val(),
                    mobilNo:$('#phoneNumber').val(),
                    sex:$('#sex option:selected').val(),
                    grade:function(){
                        if($('#nianJi option:selected').text()=="—选择—"){
                            return "";
                        }else{
                            return $('#nianJi option:selected').text();
                        }
                    }(),
                    clazz:function(){
                            if($('#banJi option:selected').text()=="—选择—"){
                                return "";
                            }else{
                                return $('#banJi option:selected').text();
                            }
                    }()
                }

                $.ajax({
                    type:'get',
                    url:'/edu/student/getStudentExport',
                    dataType:'json',
                    data:data,
                    success:function (reg) {
                        /*$('.tableHead').remove();*/
                        var data=reg.obj;
                        var str="";
                        if(data.length>0){
                            for(i=0;i<data.length;i++){
                                str+='<tr class="tableHead" id="'+data[i].uid+'"> ' +
                                    '<td><input class="check" type="checkbox"></td> ' +
                                    '<td>'+data[i].grade+data[i].clazz+'</td> ' +
                                    '<td>'+data[i].userId+'</td> ' +
                                    '<td>'+data[i].userName+'</td> ' +
                                    '<td>'+data[i].userPrivName+'</td> ' +
                                    '<td></td> ' +
                                    '<td></td> ' +
                                    '<td></td> ' +
                                    '<td class="priser">' +
                                    '<a class="edit"  userId="'+data[i].userId+'" href="javascript:void(0);">编辑</a>&nbsp;&nbsp;' +
                                    '<a href="javascript:void(0)" style="color: #C81623 !important;" class="delete" val="'+data[i].uid+'">删除</a>' +
                                    '</td> ' +
                                    '</tr>';
                            }
                            $('.listBody').html(str);
                        }
                    }
                })



        }

//点击返回
        $('#return').click(function(){
            $('.list').hide();
            $('.step1').show();
        })
        function getGrade(){
            $.ajax({
                url:'/edu/student/getGrade',
                type:'get',
                dataType:'json',
                success:function(reg){
                    var datas=reg.obj;
                    var str=""
                    for(var i=0;i<datas.length;i++){
                        str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                    }
                    $('#nianJi').append(str);
                    $('#nianJi').change(function(){
                        var sId=$(this).val();
                        $.ajax({
                            url:'/edu/student/getClassByDeptId',
                            type:'get',
                            data:{deptId:sId},
                            dataType:'json',
                            success:function(reg){
                                var datas=reg.obj;
                                var str="";
                                $('#banJi').html('<option value="" selected="true">请选择</option>');
                                for(var i=0;i<datas.length;i++){
                                    str+='<option value="'+datas[i].deptId+'">'+datas[i].deptName+'</option>';
                                }
                                $('#banJi').append(str);
                            }
                        })
                    })
                }
            })
        }
        getGrade();

        //删除接口
        $('.listBody').on('click','.delete',function () {
            var sId=$(this).parent().parent().attr('id');
            layer.confirm('确定删除吗？', {
                btn: ['删除','取消'], //按钮
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url:'/edu/student/deleteStudentByUid',
                    dataType:'json',
                    data:{uids:sId},
                    success:function(){
                        layer.msg('删除成功', { icon:6});
                        init();
                    }
                })
            }, function(){
                layer.closeAll();
            });
        })


//        点击编辑
        $('.listBody').on('click','.edit',function(){
            var sId=$(this).parent().parent().attr('id');
            document.cookie="editId="+sId;
            self.parent.document.getElementById("iframe").src='/edu/student/editStudent';
        })
//        点击全选
        $('#all').click(function(){
            var state=$(this).prop('checked');
            if(state == true){
                $(this).prop('checked',true);
                $('.check').prop('checked',true);
            }else{
                $(this).prop('checked',false);
                $('.check').prop('checked',false);
            }
        })

        //        点击删除
        $('#delete').click(function(){
            var checkL=$('.check:checkbox:checked').length;
            var arr=[];
            if(checkL != 0){
                $('.check:checkbox:checked').each(function(){
                    if(this.checked){
                        var sId=$(this).parent().parent().attr('id');
                        arr.push(sId);
                    }
                })
                var str=arr.join();
                layer.confirm('确定删除吗？', {
                    btn: ['删除','取消'], //按钮
                },function(){
                    $.ajax({
                        url:'/edu/student/deleteStudentByUid',
                        type:'post',
                        dataType:'json',
                        data:{uids:str},
                        success:function(){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            $('.listBody').empty();
                            init();
                        }
                    })
                },function(){
                    layer.close();
                })

            }
        })

//        清空密码
        $('#empty').click(function(){
            var checkL=$('.check:checkbox:checked').length;
            var arr=[];
            if(checkL != 0) {
                $('.check:checkbox:checked').each(function () {
                    if (this.checked) {
                        var sId = $(this).parent().parent().attr('id');
                        arr.push(sId);
                    }
                })
                var str = arr.join();
                $.ajax({
                    url:'edu/student/clearPasswordByUid',
                    type:'get',
                    dataType:'json',
                    data:{uids:str},
                    success:function(){
                        layer.msg(' 清空密码', {icon: 6});
                    }
                })
            }
        })



    })



</script>
</html>
