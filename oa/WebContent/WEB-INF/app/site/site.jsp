
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>站点管理</title>
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
        .templateManager{
            display: none;
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
    <%--<script src="/js/smsSettings/sms.js"></script>--%>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body style="background: #fff">
<div class="site">
    <div class="maintop clearfix" id="maintop" style="">
        <p style="margin-left: 10px">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/wangguan.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
            <label>站点管理</label>
        </p>
        <a  class="newsBtn newsBtntwo btnTheme " id="newBtn1" style="float: right;margin-right: 3%;margin-top: 5px;" href="javascript:void (0)" data-num="0"><img src="../../img/mywork/newbuildworjk.png" alt="" style="margin:-3px 0px 0px -8px;"><fmt:message code="global.lang.new" /></a><%--新建--%>
    </div>
    <div class="mainBottom" style="margin-top: 21px;">
        <table>
            <thead>
            <tr>
                <th class="th" width="10%" align="center">站点名称</th>
                <th class="th" width="10%" align="center">站点标识</th>
                <th class="th" width="10%" align="center">排序号</th>
                <th class="th" width="10%" align="center">存放位置</th>
                <th class="th" width="20%" align="center">操作</th>
            </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
        </table>
    </div>
</div>
</body>
<script>
    function checkehuo(name, val) {
        if (val == '') {
            return;
        }
        $('[name="' + name + '"]').find('option').each(function(i, n) {
            if ($(this).val() == val) {
                $(this).attr('selected', 'selected')
            } else {
                $(this).removeAttr('selected', 'selected')
            }
        })
    }

    function getData(){  //站点列表
        $.get('/site/selectSite',function (json) {
            if(json.flag){
                var arr=json.obj;
                console.log(arr);
                var str='';
                for(var i=0;i<arr.length;i++){
                    str+='<tr portalId='+arr[i].portalId+'>' +
                        '<td>'+arr[i].portalName+'</td>' +
                        '<td>'+arr[i].portalMark+'</td>' +
                        '<td>'+arr[i].sortNo+'</td>' +
                        '<td>'+arr[i].path+'</td>' +
                        '<td>' +
                        '<a id="editor" href="javascript:void (0)">编辑</a>' +
                        '<a id="template" href="/site/templateManager?portalId='+arr[i].portalId+'">模板</a>' +
                        '<a id="del" href="javascript:void (0)">删除</a>' +
                        '<a href="javascript:void (0)">发布</a>' +
                        '<a href="javascript:void (0)">预览</a>' +
                        '</td>' +
                        '</tr>'
                }
                $('table #tbody').html(str)
            }
        },'json')
    } getData();

    $(function(){
        $('#maintop').on('click','#newBtn1', function () {//站点新建
            layer.open({
                type: 1,
                title:['创建站点', 'background-color:#2b7fe0;color:#fff;'],
                area: ['700px', '460px'],
                shadeClose: false, //点击遮罩关闭
                content:
                '<form id="saveRule" class="layui-form">' +
                '<div class="inputlayout">' +
                '<ul>' +
                '<li class="clearfix">' +
                '<p style="text-align: center;background: #f0f0f0;font-weight: 700;">基础信息</p>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>站点名称 ：</label><input id="portalName" type="text" name="portalName" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>站点标识 ：</label><input id="portalMark" type="text" name="portalMark" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>排序号 ：</label><input id="sortNo" type="text" name="sortNo" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>存放位置 ：</label><input id="path" type="path" name="port">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>页面发布类型 ：</label>' +
                '<select id="select" style="display:inline-block;margin-left:5%;">' +
                '<option value="">html</option>' +
                '<option value="">jsp</option>' +
                '<option value="">php</option>' +
                '<option value="">aspx</option>' +
                '</select> ' +
                '</li>' +
                '</ul>' +
                '</div>' +
                '</form>',
                btn: ['保存','取消'],
                btn1: function (index) {
                    $.ajax({
                        type:'post',
                        url:'/site/insertSite',
                        dataType:'json',
                        data:{
                            portalName:$('#portalName').val(),
                            portalMark:$('#portalMark').val(),
                            sortNo:$('#sortNo').val(),
                            path:$('#path').val(),
                        },
                        success:function(){
                            location.reload();
                        }
                    });

                },
            });
        })

        $('#tbody').on('click','#del',function(){ //站点删除
            var portalId=$(this).parents('tr').attr('portalid');
            layer.confirm('确定要删除吗？', {
                btn: ['确定', '取消'], //按钮
                title: "删除信息"
            }, function() {
                //确定删除，调接口
                $.ajax({
                    type: 'post',
                    url: '/site/delSite',
                    dataType: 'json',
                    data: {
                        portalId: portalId
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

        $('#tbody').on('click','#editor',function(){ //站点编辑
            var portalId=$(this).parents('tr').attr('portalId');
            layer.open({
                type: 1,
                title:['编辑站点', 'background-color:#2b7fe0;color:#fff;'],
                area: ['700px', '460px'],
                shadeClose: false, //点击遮罩关闭
                content:
                '<form id="saveRule" class="layui-form">' +
                '<div class="inputlayout">' +
                '<ul>' +
                '<li class="clearfix">' +
                '<p style="text-align: center;background: #f0f0f0;font-weight: 700;">基础信息</p>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>站点名称 ：</label><input type="text" name="portalName" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>站点标识' +
                ' ：</label><input type="text" name="portalMark" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>排序号 ：</label><input type="text" name="sortNo" value="">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>存放位置 ：</label><input type="text" name="path">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>页面发布类型 ：</label>' +
                '<select id="" style="display:inline-block;margin-left:5%;">' +
                '<option value="">html</option>' +

                '</select> ' +
                '</li>' +
                '</ul>' +
                '<ul>' +
                '<li><p style="text-align: center;background: #f0f0f0;font-weight: 700;">发布相关</p></li>' +
                '<li class="clearfix"><label>首页模板：</label><select style="display: inline-block" name="homePage" id="homePage"></select></li>'+
                '</ul>'+
                '</div>' +
                '</form>',
                btn: ['保存','取消'],
                success:function(){
                    $.ajax({//发布相关展示
                        type:'post',
                        url:'/temp/selectPortalTemplate',
                        data:{portalId:portalId},
                        success:function(res){
                            var obj=res.obj;
                            var str='';
                            if(res.flag){
                                for(var i =0;i<obj.length;i++){
                                    str+='<option templateId='+obj[i].templateId+' value='+obj[i].templateId+'>'+obj[i].templateName+'</option>'
                                }
                                $('#homePage').html(str);
                            }
                        }
                    })

                    $.ajax({//信息回显
                        type:'get',
                        url:'/site/selectSiteById',
                        dataType:'json',
                        data:{portalId:portalId},
                        success:function(res){
                            var data=res.object;
                            var templateId=$("#homePage option:checked").attr('templateId');
                            // var value=$("#homePage").attr('value');
                            if(res.flag){
                                //checkehuo("homePage",data.homeTemplate);
                                $('input[name="path"]').val(data.path);
                                $('input[name="portalName"]').val(data.portalName);
                                $('input[name="portalMark"]').val(data.portalMark);
                                $('input[name="sortNo"]').val(data.sortNo)

                            }
                        }
                    })

                    $.ajax({//编辑模板回显
                        type:'get',
                        url:'/site/selectSiteByTemp',
                        dataType:'json',
                        data:{portalId:portalId},
                        success:function(res){
                            var data=res.object;
                            if(res.flag){
                                checkehuo("homePage",data.homeTemplate);
                            }
                        }
                    })
                },
                btn1: function (index) {
                    var templateId=$("#homePage option:checked").attr('templateId');
                    $.ajax({
                        type:'post',
                        url:'/site/upSite',
                        dataType:'json',
                        data:{
                            templateId:templateId,
                            homeTemplate:templateId,
                            portalId:portalId,
                            portalName:$('input[name="portalName"]').val(),
                            portalMark:$('input[name="portalMark"]').val(),
                            sortNo:$('input[name="sortNo"]').val(),
                            path:$('input[name="path"]').val()
                        },
                    });
                    layer.close(index);
                    location.reload();
                },

            });
        })
    })
</script>
</html>
