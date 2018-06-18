
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>模板管理</title>
    <style>
        .news{
            cursor: pointer;
        }
        .layui-layer-btn {
            text-align: center !important;
        }
        .back{
            display: inline-block;
            float: right;
            margin-right: 3%;
            margin-top: 5px;
            color: #fff;
            border-radius: 6px;
            cursor: pointer;
            height: 30px;
            line-height: 30px;
            font-size: 12pt;
            background: #dd2e2c;
            width: 70px;
            text-align: center;
        }
        #form{
            width:100%;
            height:100%;

        }
        .left{
            float:left;
            width:80%;
            height:100%;
        }
        .right{
            float: right;
            width:20%;
            height:100%;
        }
        .input{
            height:25px;
            width:150px;
        }

    </style>
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <link rel="stylesheet" type="text/css" href="../css/base.css">
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/lib/laydate/laydate.js"></script>
    <script type="text/javascript" src="../../lib/layui-v1.0.9_rls/layui/layui.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="background: #fff">
<div class="templateManager">
    <div class="maintop clearfix" id="title" style="">
        <p style="margin-left: 10px">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/wangguan.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
            <label>模板管理</label>
        </p>

        <a  class="newsBtn newsBtntwo btnTheme " id="NewBtn" style="float: right;margin-right: 3%;margin-top: 5px;" href="javascript:void (0)" data-num="0">
            <img src="../../img/mywork/newbuildworjk.png" alt="" style="margin:-3px 0px 0px -8px;">
            <fmt:message code="global.lang.new" />
        </a>
        <span class="back" onclick="history.go(-1)">返回</span>
    </div>
    <div class="mainBottom" style="margin-top: 21px;">
        <table>
            <thead>
            <tr portalId="">
                <th class="th" width="10%" align="center">模板名称</th>
                <th class="th" width="10%" align="center">文件名</th>
                <th class="th" width="10%" align="center">模板描述</th>
                <th class="th" width="20%" align="center">操作</th>
            </tr>
            </thead>
            <tbody id="tbodys">

            </tbody>
        </table>
    </div>
</div>
</body>
<script>
    $(function(){
        function getParams(url) {//获取地址栏的参数
            if (!url)
                url = location.href;
            if (url.indexOf("?") !== -1)
            {
                var str = url.substr(url.indexOf("?") + 1) + "&";
                var strs = str.split("&");
                for (var i = 0; i < strs.length - 1; i++)
                {
                    var key = strs[i].substring(0, strs[i].indexOf("="));
                    var val = strs[i].substring(strs[i].indexOf("=") + 1);

                }
            }
            return val;
        }
        var portalId = getParams();
        var id={portalId:portalId}
        $.ajax({//列表
            type:'get',
            url:'/temp/selectPortalTemplate',
            dataType:'json',
            data:id,
            success:function(res){
                if(res.flag){
                    var data=res.obj;
                    var str='';
                    for(var i=0;i<data.length;i++){
                        str+='<tr templateid='+data[i].templateId+' portalId='+data[i].portalId+'>' +
                            '<td>'+data[i].templateName+'</td>' +
                            '<td>'+data[i].templateFile+'</td>' +
                            '<td>'+data[i].templateDesc+'</td>' +
                            '<td>' +
                            '<a id="edit" href="javascript:void (0)">编辑</a>' +
                            '<a id="delete" href="javascript:void (0)">删除</a>' +
                            '</td>' +
                            '</tr>'
                    }
                    $('#tbodys').html(str)
                }
            }
        })

        $('#title').on('click','#NewBtn',function(){//模板新建
            layer.open({
                type: 1,
                title: ['新建模板', 'background-color:#2b7fe0;color:#fff;'],
                area: ['80%', '90%'],
                shadeClose: false, //点击遮罩关闭
                content: '<form id="form" class="clearfix">' +
                '<div class="box clearfix">' +
                '<div class="left">' +
                '<textarea style="width:100%;height:100%" name="" id="" ></textarea>' +
                '</div>' +
                '<div class="right">' +
                '<ul style="margin-left:10px;">' +
                '<li><span class="text-r">模板名：</span><input class="input" name="templateName" type="text"></li>' +
                '<li style="margin-top:10px;margin-bottom:10px;"><span class="text-r">文件名：</span><input class="input" name="templateFile" type="text"></li>' +
                '<li><span class="text-r">描述：</span><textarea style="margin-left:1em;width:150px;height:100px;" name="templateDesc" id="" ></textarea></li>' +
                '</ul>' +
                '</div>' +
                '</div>' +
                '</form>',
                btn: ['保存','关闭'],
                btn1: function (index) {
                    $.ajax({
                        type: 'post',
                        url: '/temp/insertPortalTemplate',
                        dataType: 'json',
                        data: {
                            portalId:portalId,
                            templateName:$('input[name="templateName"]').val(),
                            templateFile:$('input[name="templateFile"]').val(),
                            templateDesc:$('textarea[name="templateDesc"]').val()
                        },
                        success:function(){

                        }
                    });
                    layer.close(index);
                    location.reload();
                }
            })
        })

        $('#tbodys').on('click','#delete',function(){ //模板删除
            var templateId=$(this).parents('tr').attr('templateid');
            //console.log(templateId)
            layer.confirm('确定要删除吗？', {
                btn: ['确定', '取消'], //按钮
                title: "删除信息"
            }, function() {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '/temp/delPortalTemplate' ,
                    dataType: 'json',
                    data: {
                        templateId: templateId
                    },
                    success: function(res) {
                        if (res.flag) {
                            $.layerMsg({ content: '删除成功！', icon: 1 });
                        } else {
                            $.layerMsg({ content: '删除失败！', icon: 1 });
                        }
                        location.reload();
                    }
                })
            });

        })

        $('#tbodys').on('click','#edit',function(){//模板编辑
            var templateId=$(this).parents('tr').attr('templateId');
            layer.open({
                type: 1,
                title: ['新建模板', 'background-color:#2b7fe0;color:#fff;'],
                area: ['80%', '90%'],
                shadeClose: false, //点击遮罩关闭
                content: '<form id="form" class="clearfix">' +
                '<div class="box clearfix">' +
                '<div class="left">' +
                '<textarea style="width:100%;height:100%" name="" id="" ></textarea>' +
                '</div>' +
                '<div class="right">' +
                '<ul style="margin-left:10px;">' +
                '<li><span class="text-r">模板名：</span><input class="input" name="templateName" type="text"></li>' +
                '<li style="margin-top:10px;margin-bottom:10px;"><span class="text-r">文件名：</span><input class="input" name="templateFile" type="text"></li>' +
                '<li><span class="text-r">描述：</span><textarea style="margin-left:1em;width:150px;height:100px;" name="templateDesc" id="" ></textarea></li>' +
                '</ul>' +
                '</div>' +
                '</div>' +
                '</form>',
                btn: ['保存','关闭'],
                success:function(){
                    $.ajax({
                        type: 'post',
                        url: '/temp/selectPortalTemplateById',
                        dataType: 'json',
                        data: {templateId:templateId},
                        success:function(res){
                            var data=res.object;
                            $('input[name="templateName"]').val(data.templateName);
                            $('input[name="templateFile"]').val(data.templateFile);
                            $('textarea[name="templateDesc"]').val(data.templateDesc);
                        }
                    });
                },
                btn1: function (index) {
                    $.ajax({
                        type: 'post',
                        url: '/temp/upPortalTemplate',
                        dataType: 'json',
                        data: {
                            templateId:templateId,
                            templateName:$('input[name="templateName"]').val(),
                            templateFile: $('input[name="templateFile"]').val(),
                            templateDesc:$('textarea[name="templateDesc"]').val()
                        },
                        success:function(){
                            location.reload();
                        }
                    });
                }
            })
        })
    })
</script>
</html>
