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
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">

    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <title>管理图书</title>
    <style>
        html,body{
            width:100%;
            height:100%
        }
        .title{
            height:70px;
            line-height:70px;
        }
        .title span{
            font-size: 22px;
            color: #494d59;
        }
        .title img{
            vertical-align: middle;
            padding-left:20px;
            float:left;
            margin:23px 5px 0px 0px;
        }
        .table{
            width:60%;
            margin:0 auto;
        }
        table{
            width:100%;
        }
        table td{
            border:1px solid #ccc;
        }
        table select{
            height:30px;
            border-radius: 3px;
        }
        table input{
            height:30px;
            line-height:30px;
            font-size:14px;
            width:280px;
            border-radius: 3px;
        }
        .btn{
            width:100%;
            text-align:center;
        }
        .weight{
            width:150px;
            font-size: 14px;
            color: #2a588c;
            font-weight: bold;
        }
        #query{
            background: url(../img/file/cabinet03.png) no-repeat;
            margin-right: 10px;
            cursor: pointer;
            display: inline-block;
            width: 80px;
            height: 28px;
            line-height: 28px;
        }
        #back{
            display: inline-block;
            width: 78px;
            height: 30px;
            line-height: 30px;
            cursor: pointer;
            border-radius: 3px;
            background: url(../../img/edu/eduSchoolCalendar/back.png) no-repeat;
            padding-left: 7px;
            font-size: 14px;
        }
        #add{
            width: 71px;
            display: inline-block;
            height: 30px;
            color:#fff;
            line-height: 30px;
            border-radius: 4px;
            padding-left: 14px;
            cursor: pointer;
            background: url(../../img/sys/baocun.png) no-repeat;
            font-size: 12pt;
            font-family: "微软雅黑";
        }

        table a{
            text-decoration: none;
            color:#207bd6;
            display: inline-block;
            margin-top:17px;
        }

    </style>
</head>
<body style="overflow:scroll;overflow-y: auto;overflow-x:hidden;">
<div>
    <div class="title">
        <img src="../../img/book/add.png" alt="">
        <span>新建图书</span>
    </div>
    <div class="table">
        <table>
            <form id="editBookInfoForm"  enctype="multipart/form-data">
            <tr>
                <td class="weight">部门<span style="color:red">*</span>：</td>
                <td>
                    <input type="text" disabled="disabled" name="deptName" id="deptName" deptid="">
                    <a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addDeptName">添加</a>
                    <a href="javascript:;" class="emptyDeptName">清空</a>
                </td>
            </tr>
            <tr>
                <td class="weight">图书名称<span style="color:red">*</span>：</td>
                <td>
                    <input type="text" class="bookName" name="bookName">
                </td>
            </tr>
            <tr>
                <td class="weight">图书编号<span style="color:red">*</span>：</td>
                <td>
                    <input type="text" class="bookNum" name="bookNo">
                </td>
            </tr>
            <tr>
                <td class="weight">图书类别：</td>
                <td>
                    <select id="bookType" name="typeId">

                    </select>
                </td>
            </tr>
            <tr>
                <td class="weight">图书作者：</td>
                <td>
                    <input type="text" class="bookAuther" name="author">
                </td>
            </tr>
            <tr>
                <td class="weight">ISBN号：</td>
                <td>
                    <input type="text" class="ISBN" name="isbn">
                </td>
            </tr>
            <tr>
                <td class="weight">出版社：</td>
                <td>
                    <input type="text" class="press" name="pubHouse">
                </td>
            </tr>
            <tr>
                <td class="weight">出版日期：</td>
                <td>
                    <input type="text" class="date" name="pubDate" onclick="laydate({istime: true,max:laydate.now(), format: 'YYYY-MM-DD'})">
                </td>
            </tr>
            <tr>
                <td class="weight">存放地点：</td>
                <td>
                    <input type="text" class="place" name="area">
                </td>
            </tr>
            <tr>
                <td class="weight">数量<span style="color:red">*</span>：</td>
                <td>
                    <input type="text" class="number" name="amt">
                </td>
            </tr>
            <tr>
                <td class="weight">价格：</td>
                <td>
                    <input type="text" class="price" name="price"><span>元</span>
                </td>
            </tr>
            <tr>
                <td class="weight">内容：</td>
                <td>
                    <textarea name="brief" id="con" style="width:300px;height:50px"></textarea>
                </td>
            </tr>
            <tr>
                <td class="weight">借阅范围(部门)：</td>
                <td>
                    <input type="text" disabled="disabled" id="dept" deptid="">
                    <a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addDept">添加</a>
                    <a href="javascript:;" class="emptyDept">清空</a>
                </td>
            </tr>
            <tr>
                <td class="weight">借阅人员：</td>
                <td>
                    <input type="text" disabled="disabled" id="user" user_id="">
                    <a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addUser">添加</a>
                    <a href="javascript:;" class="emptyUser">清空</a>
                </td>
            </tr>
            <tr>
                <td class="weight">借阅角色：</td>
                <td>
                    <input type="text" disabled="disabled" id="role" privid="">
                    <a href="javascript:;" style="padding:0px 5px 0px 5px;" class="addRole">添加</a>
                    <a href="javascript:;" class="emptyRole">清空</a>
                </td>
            </tr>
            <tr>
                <td class="weight">录入人：</td>
                <td>
                    <input type="text" disabled="disabled" id="inputUser" user_id="">
                </td>
            </tr>
            <tr>
                <td class="weight">备注：</td>
                <td>
                    <input type="text" class="remarks" name="memo"/>
                </td>
            </tr>
            <tr>
                <td class="weight">上传封面：</td>
                <td>
                    <input type="file" class="file" name="imageFile"/>
                </td>
            </tr>
            </form>
            <tr>
                <td colspan="2">
                    <div class="btn">
                        <span id="add">保存</span>
                        <span id="back">返回</span>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
</body>
<script>
    $(function(){
        $('#inputUser').val($.cookie('userName'))
        $('#inputUser').attr("user_id",$.cookie('userId'))
//        点击添加部门
        $('.addDeptName').click(function(){
            dept_id='deptName';
            $.popWindow('../common/selectDept?0')
        })
//        点击清空部门
        $('.emptyDeptName').click(function(){
            $('#deptName').val("");
            $('#deptName').attr('deptid','')
        })
//        点击添加借阅部门
        $('.addDept').click(function(){
            dept_id='dept';
            $.popWindow('../common/selectDept')
        })
//        点击清空借阅部门
        $('.emptyDept').click(function(){
            $('#dept').val("");
            $('#dept').attr('deptid','')
        })
//         点击添加借阅人员
        $('.addUser').on('click',function(){
            user_id='user';
            $.popWindow('../common/selectUser')
        })
//        点击清空借阅人员
        $('.emptyUser').click(function(){
            $('#user').val('');
            $('#user').attr('user_id','')
        })
//        点击添加借阅角色
        $('.addRole').click(function(){
            priv_id='role';
            $.popWindow("../common/selectPriv");
        })
//        点击清空借阅角色
        $('.emptyRole').click(function(){
            $('#role').val('');
            $('#role').attr('privid','')
        })
//        获得图书类别
        function getType(){
            $.ajax({
                url:'/bookType/selAllType',
                type:'get',
                dataType:'json',
                success:function(res){
                   var data=res.obj;
                   var str=""
                   for(var i=0;i<data.length;i++){
                       str += '<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>'
                   }
                   $('#bookType').html(str)
                }
            })
        }
        getType();

//        点击添加
        $('#add').click(function(){
            var arr=[$('#dept').attr('deptid'),$('#user').attr('user_id'),$('#role').attr('privid')];
            var str=arr.join(';')
            var data={
                dept:$('#deptName').attr('deptid').replace(/,/g,''),
                bookName:$('.bookName').val(),
                bookNo:$('.bookNum').val(),
                typeId:$('#bookType option:selected').val(),
                pubDate:$('.date').val(),
                author:$('.bookAuther').val(),
                isbn:$('.ISBN').val(),
                pubHouse:$('.press').val(),
                area:$('.place').val(),
                amt:$('.number').val(),
                price:$('.price').val(),
                brief:$('#con').val(),
                open:str,
                borrPerson:$('.inputUser').attr("user_id"),
                memo:$('.remarks').val(),
                attachmentName:"",
                attachmentId:""
            }
            if(data.dept.replace(/^\s*/,"")==""){
                $.layerMsg({content: '部门不能为空', icon:0});
                return;
            }
            if(data.bookName.replace(/^\s*/,"")==""){
                $.layerMsg({content: '图书名称不能为空', icon:0});
                return;
            }
            if(data.bookNo.replace(/^\s*/,"")==""){
                $.layerMsg({content: '图书编号不能为空', icon:0});
                return;
            }
            if(data.amt.replace(/^\s*/,"")==""){
                $.layerMsg({content: '数量不能为空', icon:0});
                return;
            }
            if($('#dept').val()==""&&$('#user').val()==""&&$('#role').val()==""){
                $.layerMsg({content: '借阅范围、借阅人员、借阅角色至少有一个不为空', icon:0});
                return;
            }
            var editData={
                dept:$('#deptName').attr('deptid').replace(/,/g,''),
                open:str,
                borrPerson:$('.inputUser').attr("user_id"),
            }
            $.ajax({
                url:'/bookInfo/selInfoCountByBookNo',
                type:'get',
                data:{
                    bookNo:$('.bookNum').val()
                },
                dataType:'json',
                success:function(res){
                    if(res.flag){
                        if(res.totleNum>0){
                            $.layerMsg({content: '该图书编号已经存在', icon:0});
                        }else{
                            $('#editBookInfoForm').ajaxSubmit({
                                url:"/bookInfo/insertBookInfo",
                                type:'post',
                                dataType:'json',
                                data:editData,
                                success:function (json) {
                                    if(json.flag){
                                        layer.msg(' 添加成功', {icon: 6});
                                        self.parent.document.getElementById('iframe').src='/bookManager/bookManage'
                                    }else{
                                        if(json.msg=="img"){
                                            layer.msg('图片格式不正确', {icon: 2});
                                        }else{
                                            layer.msg(' 添加失败', {icon: 2});
                                        }
                                    }
                                }
                            })
                        }
                    }else{
                        layer.msg(' 添加失败', {icon: 2});
                    }
                }
            })

        })
//        点击返回
        $('#back').click(function(){
            self.parent.document.getElementById('iframe').src='/bookManager/bookManage'
        })
    })
</script>
</html>
