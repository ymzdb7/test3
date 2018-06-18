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
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/dept/new_news.css"/>

    <script src="../../js/common/language.js"></script>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>

    <title>学年管理</title>
    <style>
        tr{
            height:45px;
        }
        .head_left{
            width: 50%;
        }
        .head_left h1{
            font-weight: normal;
        }
        .head{
            padding-bottom:0px
        }
        .newDiv{
            width: 70px;
            float: right;
            height: 100%;
            margin-right: 40px;
        }
        .divBtn{
            width: 70px;
            height: 28px;
            background: #2b7fe0;
            border-radius: 4px;
            margin-top: 7px;
            cursor: pointer;
            line-height: 28px;
        }
        .divBtn span{
            float: none;
            color: #ffffff;
            font-size: 11pt;
            margin-left: 5px;
        }
        .divBtn img{
            margin-top: -5px;
            margin-left: 8px;
        }
        .mainCont{
            width: 100%;
        }
        .mainCont table{
            width: 98%;
            margin: 20px auto;
        }
        .mainCont table th{
            font-size: 11pt;
            color: #2F5C8F;
            padding: 5px;
        }
        .newLayer{
            width: 100%;
        }
        .newLayer table{
            width: 82%;
            margin: 20px auto;
            border:none;
        }
        .newLayer table tr{
            border: none;
        }
        .newLayer table tr td{
            font-size: 11pt;

        }
        .newLayer table tr td:first-of-type{
            width: 100px;
            text-align: right;
        }
        .newLayer table tr td input{
            width: 300px;
            height: 30px;
        }
        .newLayer table tr td select{
            width: 120px;
        }
        #trList td{
            padding: 8px;
            text-align: center;
        }
    </style>
    <%--<script type="text/javascript" src="/js/edu/basicSetting/studySectionManagement.js"></script>--%>
</head>
<body>
<div class="head">
    <div class="head_left">
        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/dept1.png" alt="">
        <h1>学年管理</h1>
    </div>
    <div class="newDiv">
        <div class="divBtn">
            <img src="../../img/mywork/newbuildworjk.png" alt="">
            <span>新建</span>
        </div>
    </div>
</div>
<div class="mainCont">
    <table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">
        <thead>
        <tr>
            <th style="width: 40px;">序号</th>
            <th>名称</th>
            <th>编号</th>
            <th>入学年份</th>
            <th>默认学年</th>
            <th>激活</th>
            <th>显示位置</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="trList">

        </tbody>
    </table>
    <div class="right">
        <!-- 分页按钮-->
        <div class="M-box3" id="dbgz_page">
        </div>

    </div>
    <script>
        var dataId={
            page:1,//当前处于第几页
            pageSize:10,//一页显示几条
            useFlag:true
        };
        $(function () {
            $('.M-box3').pagination({
                pageCount:10,
                jump:true,
                coping:true,
                homePage:'首页',
                endPage:'末页',
                prevContent:'上页',
                nextContent:'下页'
            });

            init(dataId,$('#trList'));
            //编辑
            $('#trList').on('click','.dataEdit',function () {
                var id=$(this).parents('tr').attr('data-id');
                layer.open({
                    type: 1,
                    title:['编辑', 'background-color:#2b7fe0;color:#fff;font-size:13pt;'],
                    area: ['600px', '500px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['保存','关闭'],
                    content: '<div class="newLayer">' +
                    '<table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">' +
                    '<tr><td>名称：</td><td><input type="text" name="yearName" value=""></td></tr>' +
                    '<tr><td>编号：</td><td><input type="text" name="yearCode" value=""></td></tr>' +
                    '<tr><td>入学年份：</td><td><input type="text" name="schoolYear"  value=""></td></tr>' +
                    '<tr><td>默认学年：</td><td><input type="text" name="defaultSchoolYear"  value=""></td></tr>' +
                    '<tr><td>激活：</td><td><select name="enabled" id="isEnabled"><option value="0">激活</option><option value="1">不激活</option></select></td></tr>' +
                    '<tr><td>显示位置：</td><td><input type="text" name="position" value=""></td></tr>' +
                    '<tr><td>备注：</td><td><input type="text" name="note" value=""></td></tr>' +
                    '</table>' +
                    '</div>',
                    success:function(){
                        $.ajax({
                            type:'get',
                            url:'/eduYear/selectEduYear',
                            dataType:'json',
                            data:{yearId:id},
                            success:function (res) {
                                var data=res.object;
                                $('input[name="yearName"]').val(data.yearName);
                                $('input[name="yearCode"]').val(data.yearCode);
                                $('input[name="schoolYear"]').val(data.schoolYear);
                                $('input[name="defaultSchoolYear"]').val(data.defaultSchoolYear);
                                $('#isEnabled').val(data.enabled);
                                $('input[name="position"]').val(data.position);
                                $('input[name="note"]').val(data.note);
                            }
                        })
                    },
                    yes:function(index){
                        var data={
                            yearId:id,
                            yearName:$('input[name="yearName"]').val(),
                            yearCode:$('input[name="yearCode"]').val(),
                            schoolYear:$('input[name="schoolYear"]').val(),
                            defaultSchoolYear:$('input[name="defaultSchoolYear"]').val(),
                            enabled :$('#isEnabled option:selected').val(),
                            position:$('input[name="position"]').val(),
                            note:$('input[name="note"]').val(),
                        }
                        updataSupervision(data,dataId,$('#trList'))
                        layer.close(index);
                    }
                });
            })
            //删除
            $('#trList').on('click','.dataDetele',function () {
                var id=$(this).parents('tr').attr('data-id');
                deleteData(id,dataId,$('#trList'));
            })

            $('.divBtn').click(function () {
                layer.open({
                    type: 1,
                    title:['新建', 'background-color:#2b7fe0;color:#fff;font-size:13pt;'],
                    area: ['600px', '500px'],
                    shadeClose: true, //点击遮罩关闭
                    btn: ['保存','关闭'],
                    content: '<div class="newLayer">' +
                    '<table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">' +
                    '<tr><td>名称：</td><td><input type="text" name="yearName" value=""></td></tr>' +
                    '<tr><td>编号：</td><td><input type="text" name="yearCode" value=""></td></tr>' +
                    '<tr><td>入学年份：</td><td><input type="text" name="schoolYear"  value=""></td></tr>' +
                    '<tr><td>默认学年：</td><td><input type="text" name="defaultSchoolYear"  value=""></td></tr>' +
                    '<tr><td>激活：</td><td><select name="enabled" id="isEnabled"><option value="0">激活</option><option value="1">不激活</option></select></td></tr>' +
                    '<tr><td>显示位置：</td><td><input type="text" name="position" value=""></td></tr>' +
                    '<tr><td>备注：</td><td><input type="text" name="note" value=""></td></tr>' +
                    '</table>' +
                    '</div>',
                    success:function(){

                    },
                    yes:function(index){
                        var data={
                            yearName:$('input[name="yearName"]').val(),
                            yearCode:$('input[name="yearCode"]').val(),
                            schoolYear:$('input[name="schoolYear"]').val(),
                            defaultSchoolYear:$('input[name="defaultSchoolYear"]').val(),
                            enabled:$('#isEnabled option:selected').val(),
                            position:$('input[name="position"]').val(),
                            note:$('input[name="note"]').val(),
                        }
                        newSupervision(data,dataId,$('#trList'))
                        layer.close(index);
                    }
                });
            })
        })

        //新建
        function newSupervision(data,dataId,element){
            $.ajax({
                type:'post',
                url:'/eduYear/addEduYear',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.flag){
                        $.layerMsg({content:'新建成功！',icon:1});
                        init(dataId,element)
                    }else{
                        $.layerMsg({content:'新建失败！',icon:2});
                    }
                }
            })
        }
        //编辑保存
        function updataSupervision(data,dataId,element){
            $.ajax({
                type:'post',
                url:'/eduYear/updateEduYear',
                dataType:'json',
                data:data,
                success:function(res){
                    if(res.flag){
                        $.layerMsg({content:'修改成功！',icon:1});
                        init(dataId,element)
                    }else{
                        $.layerMsg({content:'修改失败！',icon:2});
                    }
                }
            })
        }
        //删除
        function deleteData(id,dataId,element) {
            layer.confirm('确定要删除吗？', {
                btn: ['确定','取消'], //按钮
                title:"删除"
            }, function(){
                //确定删除，调接口
                $.ajax({
                    type:'post',
                    url:'/eduYear/deleteEduYear',
                    dataType:'json',
                    data:{'yearId':id},
                    success:function(){
                        layer.msg('删除成功！', { icon:6});
                        init(dataId,element)
                    }
                })

            }, function(){
                layer.closeAll();
            });
        }
        function init(dataId,element) {
            var ajaxPage={
                data:dataId,
                page:function () {
                    element.find('tr').remove();
                    var me=this;
                    $.ajax({
                        type:'get',
                        url:'/eduYear/selectAll',
                        dataType:'json',
                        data:me.data,
                        success:function(res) {
                            var datas=res.obj;
                            var str='';
                            for(var i=0;i<datas.length;i++){
                                var dataText='';
                                str+='<tr data-id="'+datas[i].yearId+'">' +
                                    '<td>'+(i+1)+'</td>' +
                                    '<td>'+datas[i].yearName+'</td>' +
                                    '<td>'+datas[i].yearCode+'</td>' +
                                    '<td>'+datas[i].schoolYear+'</td>' +
                                    '<td>'+datas[i].defaultSchoolYear+'</td>' +
                                    '<td>'+function () {
                                        if(datas[i].enabled == '0'){
                                            return '激活';
                                        }else if(datas[i].enabled == '1'){
                                            return '不激活';
                                        }else {
                                            return '';
                                        }
                                    }()+'</td>' +
                                    '<td>'+datas[i].position+'</td>' +
                                    '<td>'+datas[i].note+'</td>' +
                                    '<td><a href="javascript:;" style="margin-right: 10px" class="dataEdit">编辑</a><a href="javascript:;" class="dataDetele">删除</a></td>' +
                                    '</tr>'
                            }

                            element.html(str);
                            me.pageTwo(res.totleNum,me.data.pageSize,me.data.page)
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
            };
            ajaxPage.page();
        }

        //时间控件调用
        var start = {
            format: 'YYYY-MM-DD',
            /* min: laydate.now(), //设定最小日期为当前日期*/
            /* max: '2099-06-16 23:59:59', //最大日期*/
            // istime: true,
            istoday: false,
            choose: function(datas){
                end.min = datas; //开始日选好后，重置结束日的最小日期
                end.start = datas //将结束日的初始值设定为开始日
            }
        };
        var end = {
            format: 'YYYY-MM-DD',
            /*min: laydate.now(),*/
            /*max: '2099-06-16 23:59:59',*/
            // istime: true,
            istoday: false,
            choose: function(datas){
                start.max = datas; //结束日选好后，重置开始日的最大日期
            }
        };


    </script>
</div>
</body>
</html>
