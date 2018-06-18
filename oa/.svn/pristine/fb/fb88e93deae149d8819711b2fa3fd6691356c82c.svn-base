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
    <title><fmt:message code="adding.th.EducationalWages" /></title>

    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css" />
    <link rel="stylesheet" type="text/css" href="../../css/news/new_news.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/news/management_query.css" />
    <link rel="stylesheet" href="/css/workflow/work/automaticNumbering.css">
    <script type="text/javascript" src="../../js/news/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script type="text/javascript"  src="/js/base/tablePage.js"></script>
    <style>
        .headtop{
            font-size: 18px;
        }
        .heads{
            float: left;
            font-size: 17pt;
            color: #494d59;
            font-family: "微软雅黑";
            margin-left:30px;
        }
        .switch{
             float: left;
             width:70px;
            font-size:14px;
            line-height: 30px;
             height:30px;
             border-radius:5px;
             background: #2b7fe0;
            color:#ffffff;
            text-align: center;
            margin-right:30px;
            cursor:pointer;
         }
         .img{
             margin:-3px 0px 0px -2px;
         }
        .th{
            padding:10px 5px 10px 0;
        }
        .demand{
            font-size: 16px;
            margin-left:60px ;
            float: left;
        }

    </style>
</head>
<body>
<div class="headtop">
    <p  class="heads">
        <img src="/img/commonTheme/theme1/yibanfawen.png" alt="">
        <fmt:message code="adding.th.EducationalWages" />
    </p>
    <div class="demand">
        <select  name="YYYY"  id="year" style="text-align: center"> </select>
        <span><fmt:message code="chat.th.year" /></span>
        <select name="MM" id="month" style="text-align: center"></select>
        <span><fmt:message code="global.lang.month" /></span>
        <span class="switch query" style="float: none;display: inline-block"><fmt:message code="global.lang.query" /></span>
    </div>
    <p  class="add switch">
        <img src="../../img/mywork/newbuildworjk.png" alt="" class="img __web-inspector-hide-shortcut__">
        <fmt:message code="workflow.th.Import" />
    </p>
    <div style="clear:both;"></div>
</div>


<div class="pagediv" style="margin-top:21px;width:100%;">
    <table style=" margin:0 16px 0 16px">
        <thead class="thead">
            <tr></tr>
        </thead>
        <tbody class="tbody">

        </tbody>
    </table>
    <div id="dbgz_page" class="M-box3 fr">

    </div>
</div>
</body>
<script>
    function YYYYMM(){//默认显示查询时间
        var y  = new Date().getFullYear();
        for (var i=(y-5);i<(y+10);i++){
            $('#year').append(new Option(" "+ i ));
        }
        $('#year').val(y);

        for (var i=1;i<13;i++){
            $('#month').append(new Option(" " + i ));
        }
        $('#month').val = new Date().getMonth() + 1;
    }YYYYMM();
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:8,//一页显示几条
            useFlag:true,
            data50:1,
            data1:null,
        },

        page:function () {
            var me=this;

            $.post('/bonusmsg/query',this.data,function (json) {
                var str='';
                var str2='';
                var i=0;
                if(json.obj.length>0) {
                    var arr = json.obj[0].bonus;
                }
                    for (var s in arr) {
                        i++
                    }
                    for (var n = 1; n <= i - 3; n++) {//列表头数据展示
                        var temp = 'data' + n;

                        str += '<th class="th">' + arr[temp] + '</th>'
                    }
                    $('.thead  tr').html(str)
                    for (var m = 0; m < json.obj.length; m++) {
                        var arr2 = json.obj[m];

                        for (var t = 1; t <= i - 3; t++) {//列表内容数据展示
                            var temp = 'data' + t;
                            str2 += '<td class="publishtip">' + arr2[temp] + '</td>'
                        }
                        str2 = '<tr>' + str2 + '</tr>'
                    }
                    $('.tbody').html(str2)

                me.pageTwo(json.totleNum,me.data.pageSize,me.data.page)
            },'json')

        },
        pageTwo:function (totalData, pageSize,indexs) {//设置分页
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
    $(function () {
        ajaxPage.page()
        $('.add').click(function () {//导入
            layer.open({
                type: 2,
                title: '<fmt:message code="adding.th.salary" />',
                shadeClose: true,
                shade: 0.5,
                area: ['30%', '350px'],
                content: '/salary/payimport',
                btn:['<fmt:message code="workflow.th.Import" />','<fmt:message code="global.lang.close" />'],
                yes: function(index, layero){
                    var body = layer.getChildFrame('body', index);
                    var iframeWin = window[layero.find('iframe')[0]['name']];//子页面对象
                    iframeWin.upfile();
                    setTimeout(function () {
                        ajaxPage.page()
                        layer.close(index)

                    },1000)
                }

            });

        });



        /*$('tbody').on('mouseenter','.publishtip',function () {

            var that = $(this);
            //var str=that.attr('toTypeName').replace(/-/g,'<br>')
            layer.tips(str,that, {
                tips: [1, '#3595CC'],
                time: 10000
            });
        });*/


        $('.query').click(function(json){
            var data1=$('#year option:selected').val()+'<fmt:message code="chat.th.year" />'+$('#month option:selected').val()+'<fmt:message code="global.lang.month" />';
            ajaxPage.data.data1=data1;
            ajaxPage.page();
        })

    })
</script>
</html>
