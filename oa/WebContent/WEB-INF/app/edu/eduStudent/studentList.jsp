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
    <script src="../../js/base/base.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script>
        var loads=parent.refresh;
    </script>
    <title></title>
    <style>

        #search{
            margin-left: 360px;
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
        #newStu{
            margin-right: 87px;
            float:right;

            font-size: 16px;
            margin-top: 20px;
            width: 131px;
            height: 33px;
            border-radius: 5px;
            color: #fff;
            cursor:pointer;
            background: url(../../../img/sys/newdept.png) no-repeat;
        }
        a{
            color:#2F8AE3;
            padding:0px 2px;
        }
        #delete{
            background:url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left:20px;
            cursor:pointer;
            color:#000;
            display: inline-block;
        }
        .msg{
            width:400px;
            height:130px;
            text-align:center;
            margin:30px auto;
            margin-left: 30px;
            background:#2F8AE3;
            font-size:20px;
            border-radius:10px;
            color:#fff;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">

<%--学生信息列表--%>
<div class="list" >
    <%--列表展示部分--%>

        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="../../img/vote/child.png"></div>
            <div class="nav_t2" class="searth">管理学生(<span class="banJi">一年级</span>)</div>
            <button type="button" style="display: none" class="newStu" id="newStu">新建学生</button>
        </div>
        <div class="cont_rig" style="width:80%;height:100%;float:right;display: none" >
            <div class="msg" >
                <div style="padding: 10px 10px 10px 10px;line-height: 50px;width: 95%;float: right;">点击左侧年级班级后，可以新建学生及家长</div>
                <div>暂无可管理的学生</div>
            </div>
        </div>
    <table class="newNew" style="display: none">
        <thead>
        <tr class="tableHead">
            <td>选择</td>
            <td>学号</td>
            <td>真实姓名</td>
            <td>年级班级</td>
            <td>角色</td>
            <td>最后访问</td>
            <td>闲置</td>
            <td>操作</td>
        </tr>

        </thead>
        <tbody class="listBody">

        </tbody>
        <tfoot >
        <tr>
            <td colspan="8"><input type="checkbox" name="all_but" id="all" >全选
                <a href="javascript:;" id="delete">删除</a>
                <%--<a href="javascript:;" id="empty">清除密码</a>--%>
        </tr>
        </tfoot>
    </table>
</div>

</body>

<script type="text/javascript">


    //点击查询后，查询列表展示
    $(function () {
        var title=decodeURI($.GetRequest().title);
        var gradeId=$.GetRequest().gradeId;
        var classId=$.GetRequest().classId;
        var classname=decodeURI($.GetRequest().classname);
        var grade=decodeURI($.GetRequest().grade);
        var nianJi=encodeURI(grade);
        var banJi=encodeURI(title);


        if(classId){
            $('#newStu').show();
            $('.cont_rig').hide();
        }else{
            $('.cont_rig').show();
            $('#newStu').hide();
        }

        //        点击新建学生
        $('#newStu').click(function(){
           window.open('/edu/student/eduStudentNew?grade='+nianJi+'&classId='+classId+'&title='+banJi);
        })


        $('.banJi').html(title);
        if(classname=='nianJi'){
            $('.newNew').hide();
        }else{
            $('.newNew').show();
        }


//        管理学生列表

        function manage(){
            var classId=$.GetRequest().classId;
            $.ajax({
                url:'/edu/student/getStudentList1',
                type:'get',
                data:{deptId:classId},
                dataType:'json',
                success:function(reg){
                    var data=reg.obj;
                    var str="";
                    for(var i=0;i<data.length;i++){
                        str+='<tr class="tableHead" id="'+data[i].uid+'"> ' +
                            '<td><input type="checkbox" class="choose"></td> ' +
                            '<td>'+data[i].userId+'</td> ' +
                            '<td>'+data[i].userName+'</td> ' +
                            '<td>'+data[i].grade+data[i].clazz+'</td> ' +
                            '<td>'+data[i].userPrivName+'</td> ' +
                            '<td></td> ' +
                            '<td></td> ' +
                            '<td ><a href="javascript:;" class="edit">编辑</a></td> ' +
                            '</tr>'
                    }
                    $('.listBody').html(str);
                }

            })
        }
        manage();

//        点击全选
        $('#all').click(function(){
            var state=$(this).prop('checked');
            if(state == true){
                $(this).prop('checked',true);
                $('.choose').prop('checked',true);
            }else{
                $(this).prop('checked',false);
                $('.choose').prop('checked',false);
            }
        })

//        点击删除
        $('#delete').click(function(){
            var checkL=$('.choose:checkbox:checked').length;
            var arr=[];
            if(checkL != 0){
                $('.choose:checkbox:checked').each(function(){
                    if(this.checked){
                        var sId=$(this).parent().parent().attr('id');
                        arr.push(sId);
                    }
                })
                var str=arr.join();
                layer.confirm(' <fmt:message  code="workflow.th.que"/>', {
                    btn: [' <fmt:message  code="global.lang.ok"/>', ' <fmt:message  code="depatement.th.quxiao"/>'], //按钮
                    title: " 提示"
                },function(){
                    $.ajax({
                        url:'/edu/student/deleteStudentByUid',
                        type:'post',
                        dataType:'json',
                        data:{uids:str},
                        success:function(){
                            layer.msg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                            $('.listBody').empty();
                            manage();
                            window.parent.location.reload();
                        }
                    })
                },function(){
                    layer.close();
                })

            }
        })
        //        清空密码
        $('#empty').click(function(){
            var checkL=$('.choose:checkbox:checked').length;
            var arr=[];
            if(checkL != 0) {
                $('.choose:checkbox:checked').each(function () {
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
                        layer.msg(' 清空密码成功', {icon: 6});
                    }
                })
            }
        })


//        点击编辑
        $('.listBody').on('click','.edit',function(){
            var sId=$(this).parent().parent().attr('id');
            document.cookie='editId='+sId;
            self.parent.document.getElementById("iframe").src='/edu/student/editStudent?classId='+classId+'&title='+encodeURI(title);
        })

        $('.step1').on('click','#search',function () {
            var arr=[$('#nianJi option:selected').text(),$('#banJi option:selected').text()];
            var zi=arr.join("");
            var data={
                userId:$('#studentNo').val(),
                userName:$('#studentName').val(),
                pUserName:$('#parentName').val(),
                mobilNo:$('#phoneNumber').val(),
                sex:$('#sex option:selected').val(),
            }
            $.ajax({
                type:'get',
                url:'/edu/student/getStudentList',
                dataType:'json',
                success:function (reg) {
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
                                '<a href="javascript:void(0)" style="color: #C81623 !important;" class="delete" class="del" val="'+data[i].uid+'">删除</a>' +
                                '</td> ' +
                                '</tr>';
                        }
                        $('.listBody').append(str);
                    }
                }
            })


        })

        //删除接口
        $('.priser').on('click','.delete',function () {
            var sId=$(this).parent().parent().attr('id');
            layer.confirm('确定删除吗？', {
                btn: ['删除','取消'], //按钮
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url:'/edu/student/deleteStudentByUid',
                    dataType:'json',
                    data:{'uid':sId},
                    success:function(){
                        layer.msg('删除成功', { icon:6});
                        init();

                    }
                })
            }, function(){
                layer.closeAll();
            });
        })
    })



</script>
</html>
