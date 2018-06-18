<%--
  Created by IntelliJ IDEA.
  User: CY
  Date: 2018/3/8
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/dept/roleAuthorization.css">
    <link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>
    <%--<script type="text/javascript" src="js/jquery/jquery.min.js"></script>--%>

    <script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>

    <title>管理员权限设置</title>
    <style>
        tr td{
            text-align: center;
        }
        .tr_td thead td{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F!important;
            font-weight: bold;
        }
        .head{
            padding-bottom:0px
        }
        .head_left h1{
            font-weight: normal;
        }
    </style>
</head>
<body>
<div class="head">
    <div class="head_left">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dept1.png" alt="">
        <h1>管理员权限设置</h1>
        <%--<h1>部门/成员单位管理</h1>--%>
    </div>
</div>
<div class="navigation  clearfix" style="margin-top: 0px;">
    <div class="left">
        <img src="../img/userPriv/newHuman.png" alt="">
        <div class="news newtwo">学籍管理权限设置</div>
    </div>
</div>
<div id="showdiv">
    <table class="tr_td" width="45%" align="center">
        <form action="" method="post" name="form1"></form>
        <tbody><tr>
            <td nowrap="" class="TableData">请选择人员：</td>
            <td class="TableData">
                <input type="hidden" name="HR_ROLE_MANAGE" value="">
                <textarea cols="50"  id="mainss" name="COPY_TO_NAME" rows="5" class="BigStatic" wrap="yes" readonly=""></textarea>
                <a href="javascript:;" class="orgAdd" data-num="0">添加</a>
                <a href="javascript:;" class="orgClear" data-numTwo="0">删除</a>
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableData">请选择部门：</td>
            <td nowrap="" class="TableData">
                <input type="hidden" name="PRIV_ID" value="">
                <textarea cols="50" id="PRIV_ID" name="PRIV_NAME" rows="5" class="BigStatic" wrap="yes" readonly=""></textarea>
                <a href="javascript:;" class="orgAdd" data-num="1">添加</a>
                <a href="javascript:;" class="orgClear" data-numTwo="1">删除</a><br>
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableControl" colspan="2" align="center">
                <input type="button" value="添加" dataType="0" class="import oneim">&nbsp;&nbsp;
            </td>
        </tr>

        </tbody>
    </table>
    <div class="navigation  clearfix">
        <div class="left">
            <img src="../img/department/groupManager.png" alt="">
            <div class="news">学籍权限管理</div>
        </div>
    </div>
    <table class="tr_td tr_tds" width="70%" align="center" style="margin-bottom: 20px;">
        <thead>
        <tr class="TableHeader">
            <td nowrap="" align="center">编号</td>
            <td nowrap="" align="center">管理人员</td>
            <td nowrap="" align="center">管理部门</td>
            <td nowrap="" align="center">操作</td>
        </tr>
        </thead>
        <tbody class="list">
        </tbody></table>

</div>
<div id="editShow" style="display: none">
    <table class="tr_td" width="45%" align="center">
        <form action="" method="post" name="form1"></form>
        <tbody><tr>
            <td nowrap="" class="TableData">请选择人员：</td>
            <td class="TableData">
                <input type="hidden" name="HR_ROLE_MANAGE" value="">
                <textarea cols="50"  id="mainss2" name="COPY_TO_NAME" rows="5" class="BigStatic" wrap="yes" readonly=""></textarea>
                <a href="javascript:;" class="orgAdd" data-num="0">添加</a>
                <a href="javascript:;" class="orgClear" data-numTwo="0">删除</a>
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableData">请选择部门：</td>
            <td nowrap="" class="TableData">
                <input type="hidden" name="PRIV_ID" value="">
                <textarea cols="50" id="PRIV_ID2" name="PRIV_NAME" rows="5" class="BigStatic" wrap="yes" readonly=""></textarea>
                <a href="javascript:;" class="orgAdd" data-num="1">添加</a>
                <a href="javascript:;" class="orgClear" data-numTwo="1">删除</a><br>
            </td>
        </tr>
        <tr>
            <td nowrap="" class="TableControl" colspan="2" align="center">
                <input type="button" value="添加" dataType="0" class="import oneim2">&nbsp;&nbsp;
            </td>
        </tr>

        </tbody>
    </table>
    <div class="navigation  clearfix">
        <div class="left">
            <img src="../img/department/groupManager.png" alt="">
            <div class="news">教师设置管理</div>
        </div>
    </div>
    <table class="tr_td tr_tds" width="70%" align="center" style="margin-bottom: 20px;">
        <thead>
        <tr class="TableHeader">
            <td nowrap="" align="center">编号</td>
            <td nowrap="" align="center">管理人员</td>
            <td nowrap="" align="center">管理部门</td>
            <td nowrap="" align="center">操作</td>
        </tr>
        </thead>
        <tbody class="list">
        </tbody></table>

</div>
<script>
    <%--点击添加--%>
    $('.orgAdd').click(function(){
        if($(this).attr('data-num')=='0') {
            user_id = $(this).prev().prop('id')
            $.popWindow("../common/selectUser");
        }else {
            dept_id=$(this).prev().prop('id')
            $.popWindow("../common/selectDept");
        }
    })
    //    点击清空
    $('.orgClear').click(function () {
        if($(this).attr('data-numTwo')==0){
            $('#mainss').val('')
            $('#mainss').attr('user_id','')
        }else {
            $('#PRIV_ID').val('')
            $('#PRIV_ID').attr('deptname','')
            $('#PRIV_ID').attr('deptid','')
            $('#PRIV_ID').attr('deptno','')
        }
    })

    $('.oneim').click(function () {
        if($('#mainss').val()==''||$('#PRIV_ID').val()==''){
            $.layerMsg({content:'人员和部门不能为空',icon:6})
            return false
        }

        $.post('/schoolPriv/addSchoolPriv',
            {'personUid':$('#mainss').attr('dataid'),
                'shcoolNum':$('#PRIV_ID').attr('deptid'),'modularId':3},function (json) {
                if(json.flag) {
                    var str=' <tr class="TableHeader">' +
                        '            <td nowrap="" align="center">1</td>' +
                        '            <td nowrap="" align="center">'+json.obj.roleManagerText+'</td>' +
                        '            <td nowrap="" align="center">'+json.obj.UserPrivText+'</td>' +
                        '            <td nowrap="" align="center"><a href="javascript:;" class="edit">编辑</a><a href="javascript:;" class="del">删除</a></td>' +
                        '        </tr>'

                    $.layerMsg({content:'保存成功',icon:1},function () {
//                            $('.tr_tds tbody').append(str)
                        window.location.reload()
//                           init();

                    })

                }
            },'json')




    })

    $('.oneim2').click(function(){
        $.post('/schoolPriv/updateSchoolPriv ',
            {'personUid':$('#mainss2').attr('dataid'),id:$(this).attr('ids'),
                'shcoolNum':$('#PRIV_ID2').attr('deptid'),'modularId':3},function (json) {
                if(json.flag) {
                    $.layerMsg({content:'保存成功',icon:1},function () {
                        $('#editShow').hide();
                        $('#showdiv').show();
                        init();
                    })

                }
            },'json')
    })

    function init(){
        $.ajax({
            url:'/schoolPriv/selectAll',
            type:'get',
            data:{'modularId':2},
            dataType:'json',
            success:function(reg){
                var datas=reg.obj;
                var str="";
                for(var i=0;i<datas.length;i++){
                    str +=' <tr class="TableHeader" id="'+datas[i].id+'">' +
                        '            <td nowrap="" align="center">'+(i+1)+'</td>' +
                        '            <td nowrap="" align="center">'+datas[i].roleManagerText+'</td>' +
                        '            <td nowrap="" align="center">'+datas[i].userPrivText+'</td>' +
                        '            <td nowrap="" align="center"><a href="javascript:;" class="edit">编辑</a><a href="javascript:;" style="margin-left: 10px;" class="del">删除</a></td>' +
                        '        </tr>'
                }
                $('.list').html(str);
            }
        })
    }
    init()

    //    点击编辑
    $(document).on('click','.edit',function(){
        $('#editShow').show();
        $('#showdiv').hide();
        var id=$(this).parents('tr').attr('id');
        $('.oneim2').attr('ids',id)
        $.ajax({
            url:'/schoolPriv/selectByPrimaryKey',
            type:'get',
            data:{id:id},
            dataType:'json',
            success:function(res){
                var data=res.object;
                $('#mainss2').attr('user_id',data.personUid)
                $('#PRIV_ID2').attr('deptid',data.shcoolNum)
                $('#mainss2').val(data.roleManagerText)
                $('#PRIV_ID2').val(data.userPrivText)
            }
        })
    })

    //        点击删除
    $(document).on('click','.del',function(){
        var id=$(this).parents('tr').attr('id')
        layer.confirm('确定要删除吗？', {
            btn: ['确定', ' 取消'], //按钮
            title: "提示"
        },function(){
            $.ajax({
                url:'/schoolPriv/deleteSchoolPriv',
                type:'post',
                dataType:'json',
                data:{id:id},
                success:function(){
                    layer.msg(' 删除成功', {icon: 6});
                    init()
                }
            })
        }, function () {
            layer.closeAll();
        })
    })


</script>

</body>
</html>
