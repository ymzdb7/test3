<%--
  Created by IntelliJ IDEA.
  User: CY
  Date: 2017/12/21
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>公共通讯簿设置</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <%--<link rel="stylesheet" type="text/css" href="../../css/dept/deptManagement.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>--%>
    <%--<link rel="stylesheet" href="/lib/layer/skin/default/layer.css">--%>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <%--<link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>--%>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <%--<link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>--%>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <%--<script src="../../lib/laydate.js"></script>--%>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/leader/jquery.form.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
    <style>
        .head{
            width:100%;
            height:45px;
            border-bottom:1px solid #9E9E9E;
            position:fixed;
            top:0px;
            z-index: 100;
            background: #fff;
        }
        .nav{
            overflow:hidden;
        }
        .nav li{
            height:28px;
            line-height:28px;
            float:left;
            font-size:14px;
            margin-left:20px;
            margin-top:6px;
            cursor:pointer;
        }
        .space{
            width:2px;
            margin-left:16px;
        }
        .pad{
            padding:0px 10px;
            line-height:28px;
        }
        .select{
            background-color:#2F8AE3;
            color:#fff;
            border-radius:20px;
            -webkit-border-radius:20px;
            -moz-border-radius:20px;
            -o-border-radius:20px;;
            -ms-border-radius:20px;
        }
        .headRight{
            float:right;
            background: url("../img/file/cabinet01.jpg") no-repeat;
            width: 124px;
            height: 30px;
            margin-top: -27px;
            margin-right: 20px;
            color:#fff;
            font-size:14px;
            cursor:pointer;
        }
        .headRight span{
            padding:5px 0px 0px 36px;
        }
        .title span{
            font-size:22px;
            color:#494d59;
            padding-left:20px;
        }
        .title{
            margin-bottom:20px;
            margin-top:60px;
        }
        .M-box3 .active{
            margin: 0px 3px;
            width: 29px;
            height: 29px;
            line-height: 29px;
            background: #2b7fe0;
            font-size: 12px;
            border: 1px solid #2b7fe0;
            color:#fff;
            text-align:center;
            display: inline-block;
        }
        .M-box3 a{
            margin: 0 3px;
            width: 29px;
            height: 29px;
            line-height: 29px;
            font-size: 12px;
            display: inline-block;
            text-align:center;
            background: #fff;
            border: 1px solid #ebebeb;
            color: #bdbdbd;
            text-decoration: none;
        }
        th{
            background-color: #fff;
            font-size: 15px;
            color: #2F5C8F;
            font-weight: bold;
            border: 0px;
            line-height:45px;
            padding-left: 10px;
        }
    </style>
</head>
<body>
    <div class="content">
        <div class="head">
            <ul class="nav">
                <li>
                    <span class="select pad">公共通讯簿</span>
                    <img class="space" src="../../img/twoth.png" alt="">
                </li>
            </ul>
            <div class="headRight choose" data-type="0">
                <span>新建分组</span>
            </div>
        </div>
        <div class="title">
            <img src="../../img/vote/manage.png" alt="" style="padding-left:20px">
            <span style="padding-left:0px">管理分组</span>
        </div>
        <div style="margin: -60px auto 0px;height:50px;width: 97%;" class="clearfix">
            <div id="dbgz_page" class="M-box3">

            </div>
        </div>
        <div class="table">
            <table style="width: 95%;margin:0 auto">
                <thead>
                    <tr>
                        <th>分组名称</th>
                        <th>开放部门</th>
                        <th>开放角色</th>
                        <th>开放人员</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody class="list">

                </tbody>
            </table>
        </div>
    </div>
    <script>
        <%--分页列表--%>
        var ajaxPageLe={
            data:{
                page:1,//当前处于第几页
                pageSize:5,//一页显示几条
                useFlag:true
            },
            page:function () {
                var me=this;
                $.ajax({
                    url:'/addressGroup/getPublicGroups',
                    type:'get',
                    data:me.data,
                    dataType:'json',
                    success:function(reg){
                        var datas=reg.obj;
                        var str="";
                        for(var i=0;i<datas.length;i++){
                            str+=' <tr id="'+datas[i].groupId+'">' +
                                '                        <td>'+datas[i].groupName+'</td>' +
                                '                        <td>'+function(){
                                    if(datas[i].deptRange==undefined){
                                        return ''
                                    }else{
                                        return datas[i].deptRange
                                    }
                                }()+'</td>' +
                                '                        <td>'+function(){
                                        if(datas[i].roleRange==undefined){
                                            return '';
                                        }else{
                                            return datas[i].roleRange
                                        }
                                }()+'</td>' +
                                '                        <td>'+function(){
                                            if(datas[i].userRange==undefined){
                                                return ''
                                            }else{
                                                return datas[i].userRange
                                            }
                                }()+'</td>' +
                                '                        <td>' +
                                '                            <a href="javascript:;" class="edit choose" data-type="1">编辑</a>' +
                                '                            <a href="javascript:;" class="import">导入</a>' +
                                '                            <a href="javascript:;" class="del">删除</a>' +
                                '                        </td>' +
                                '                    </tr>'
                        }
                        $('.list').html(str);
                        me.pageTwo(reg.totleNum,me.data.pageSize,me.data.page)
                    }
                })

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
        ajaxPageLe.page();

    <%--点击新建--%>
        $(document).on('click','.choose',function() {
            var type=$(this).attr('data-type');
            var me=$(this);
            layer.open({
                title: ['新建分组', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '400px'],
                type: 1,
                btn: ['保存', '取消'],
                content: '<form action="" id="ajaxdata">' +
                '<ul class="formUl" data-type="people">' +
                '<li class="clearfix" style="background: #00a0e9;margin-top: 12px;">' +
                '<input type="hidden" >' +
                '<input type="hidden" >' +
                '<li class="clearfix">' +
                '<label>排序号</label>' +
                '<input type="text" name="orderNo">' +
                '</li>' +
                '<li class="clearfix lessee">' +
                '<label><b>*</b> 分组名称</label>' +
                '<input type="text" name="groupName">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label><b>*</b>公布范围（部门）</label>' +
                '<input type="text"  id="dept">' +
                '<input type="hidden" name="privDept" id="depthid">' +
                '<a href="javascript:;"  style="margin-right:5px;margin-left:5px" class="dept">选择</a>' +
                '<a href="javascript:;" class="delDept">清空</a>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label><b>*</b>公布范围（角色）</label>' +
                '<input type="text"  id="priv">' +
                '<input type="hidden" name="privRole" id="privhid">' +
                '<a href="javascript:;"  style="margin-right:5px;margin-left:5px" class="priv">选择</a>' +
                '<a href="javascript:;" class="delPriv">清空</a>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label><b>*</b>公布范围（人员）</label>' +
                '<input type="text"  id="user">' +
                '<input type="hidden" name="privUser" id="userhid">' +
                '<a href="javascript:;"  style="margin-right:5px;margin-left:5px" class="user">选择</a>' +
                '<a href="javascript:;" class="delUser">清空</a>' +
                '</li>' +
                '</ul>' +
                '</form>',
                yes: function () {
                    $('input[name="privDept"]').val($('#dept').attr('deptid'));
                    $('input[name="privRole"]').val($('#priv').attr('userpriv'));
                    $('input[name="privUser"]').val($('#user').attr('user_id'));
                    if(type==0){
                        $('#ajaxdata').ajaxSubmit({
                            type:'post',
                            dataType:'json',
                            success:function(res){
                                if(res.flag){
                                    $.layerMsg({content:'保存成功',icon:1});
                                    window.location.reload()
                                    layer.closeAll();
                                }else{
                                    $.layerMsg({content:res.msg,icon:2});
                                }
                            }
                        })
                    }else{
                        var groupId=me.parents('tr').attr('id')
                        $('#ajaxdata').ajaxSubmit({
                            type:'post',
                            dataType:'json',
                            data:{groupId:groupId},
                            success:function(res){
                                if(res.flag){
                                    $.layerMsg({content:'保存成功',icon:1});
                                    window.location.reload()
                                    layer.closeAll();
                                }else{
                                    $.layerMsg({content:res.msg,icon:2});
                                }
                            }
                        })
                    }

                },
                btn1: function (index) {
                    layer.close(index)
                },
                success: function () {
                    if(type==0){
                        $('#ajaxdata').attr('action','/addressGroup/addPublicGroup')
                    }else{
                        $('#ajaxdata').attr('action','/addressGroup/updatePublicGroup');
                        var groupId=me.parents('tr').attr('id');
                        $.ajax({
                            url:'/addressGroup/selectPublicGroupInfo',
                            data:{groupId:groupId},
                            type:'get',
                            dataType:'json',
                            success:function(res){
                                    var data=res.object;

                                $('input[name="orderNo"]').val(data.orderNo);
                                $('input[name="groupName"]').val(data.groupName);
                                $('input[name="privDept "]').val(data.deptRange);
                                $('input[name="privRole"]').val(data.roleRange);
                                $('input[name="privUser"]').val(data.userRange);
                                $("#dept").val(data.deptRange); //部门
                                $("#dept").attr("deptid",data.privDept);
                                $("#priv").val(data.roleRange); //角色
                                $("#priv").attr("userpriv",data.privRole);
                                $("#user").val(data.userRange); //人员
                                $("#user").attr("user_id",data.privUser);
                            }
                        })
                    }
                    $(".user").on("click", function () {//选人员控件
                        user_id = 'user';
                        $.popWindow("../../common/selectUser");
                    });
                    $(".priv").on("click", function () {//选角色控件
                        priv_id = 'priv';
                        $.popWindow("../../common/selectPriv");
                    });
                    $(".dept").on("click", function () {//选部门控件
                        dept_id = 'dept';
                        $.popWindow("../../common/selectDept");
                    });
                    $('.delUser').click(function () { //清空人员
                        clearUser();
                    });
                    $('.delPriv').click(function () { //清空角色
                        clearRole();
                    });
                    $('.delDept').click(function () { //清空部门
                        clearDept();
                    });
                }

            })
        })
        function clearUser(){
            $('#user').attr('user_id', '');
            $('#user').attr('userprivname', '');
            $('#user').attr('username', '');
            $('#user').removeAttr('dataid');
            $('#user').val('');
        }
        function clearRole(){
            $('#priv').removeAttr('userpriv');
            $('#priv').removeAttr('privid');
            $('#priv').attr('dataid', '');
            $('#priv').val('');
        }
        function clearDept(){
            $('#dept').removeAttr('deptid');
            $('#dept').attr('deptno', '');
            $('#dept').removeAttr('deptname');
            $('#dept').val('');
        }
//        点击删除
        $('.list').on('click','.del',function(){
            var groupId=$(this).parents('tr').attr('id');
            layer.confirm(' 确定要删除吗', {
                btn: ['确定', ' 取消'],//按钮
                title: " 删除"
            },function(){
                $.ajax({
                    url:'/addressGroup/deleteGroups ',
                    type:'post',
                    dataType:'json',
                    data:{groupId:groupId},
                    success:function(){
                        $.layerMsg(' <fmt:message  code="workflow.th.delsucess"/>', {icon: 6});
                        window.location.reload();
                    }
                })
            }, function () {
                layer.closeAll();
            })
        })
//        点击导入


          $('.list').on('click','.import',function(){
              var groupId=$(this).parents('tr').attr('id');
              layer.open({
                  type:1,
                  title: ['分组导入', 'background-color:#2b7fe0;color:#fff;'],
                  area: ['600px', '420px'],
                  btn: ['导入', '取消'],
                  content:'<div>' +
                  '<form class="form1" name="form1" id="uploadForm" method="post" action="/address/importPublicAddressWithBLOBs?groupId="'+groupId+' enctype="multipart/form-data">' +
                  '<table class="importTable" style="margin-top:20px;">' +
                  '<tr><td style="width: 100px;">下载导入模板：</td><td style="text-align: left;"><a id="model">分组管理信息模板下载</a></td></tr>' +
                  '<tr> <td>选择导入文件：</td> <td><input style="width: auto" type="file" name="file"/><input type="hidden" name="groupId" id="groupId" value="'+groupId+'"/></td> </tr>' +
                  '<tr>' +
                  '<td>说明：</td>'+
                  '<td style="text-align: left;"><p>1、请导入.xls文件。</p>'+
//                  '<p>2、请填写网格信息中已有网格。</p>'+
                  '</td> ' +

                  '</tr>' +
                  '</table>' +
                  '</form>' +
                  '</div>',
                  success:function(){
                      $('#model').click(function () {
                          window.location.href = encodeURI("/file/address/public_address.xls");
                      });
                  },
                  yes:function(){
                      var flag = CheckForm();
                      if (flag) {
                          layer.msg("正在导入中，请耐心等候", {icon: 1});
                          $.upload($('#uploadForm'), function (res) {
                              if (res.flag) {
                                  layer.msg("共导入" + res.totleNum +"条数据!", {icon: 1});
                              } else {
                                  layer.msg(res.msg, {icon: 2});
                              }
                          });
                      }
                  }
              })
          })




        function CheckForm() {
            if (document.form1.file.value == "") {
                layer.msg("请选择要导入的文件！", {icon: 2});
                return (false);
            }

            return (true);
        }





    </script>
</body>
</html>
