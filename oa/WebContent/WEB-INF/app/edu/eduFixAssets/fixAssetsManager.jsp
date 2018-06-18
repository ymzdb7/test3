<%--
  Created by IntelliJ IDEA.
  User: 牛江丽
  Date: 2017/9/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title><fmt:message code="main.assetmanage" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <%-- <link rel="stylesheet" type="text/css" href="../css/base.css" />
     <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
     <script src="../../lib/layer/layer.js"></script>--%>

    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <!-- word文本编辑器 -->
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <script src="../../lib/layer/layer.js"></script>
    <script src="/lib/jquery.form.min.js"></script>
</head>
<style>
    .navigation{
        margin-left: 30px;
    }
    .del_btn {
        color: #E01919;
        cursor: pointer;
    }
    .edit_btn {
        color: #1772C0;
        cursor: pointer;
    }
    #tr_td td{
        text-align: center;
    }
    .exportsss {
        width: 80px;
        height: 30px;
        cursor: pointer;
        background-image: url(../../img/import.png);
        padding-left: 25px;
        font-size: 13px;
        background-repeat: no-repeat;
        border-width: initial;
        border-style: none;
        border-color: initial;
        border-image: initial;
    }
    .fileload {
        position: absolute;
        opacity: 0;
        width: 80px;
        right: 520px;
        height: 29px;
        top: 21px;
    }
</style>

<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body style="font-family: 微软雅黑;">
<div>
    <div class="navigation  clearfix">
        <div class="left">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/fixAssetsManage.png">
            <div class="news">
                <fmt:message code="main.assetmanage" />
            </div>
            <div style="height:70px;line-height:70px">
                <input name="assetsName" id="assetsName" class="button1 nav_type">
                <div id="cx" class="submit">
                    <fmt:message code="global.lang.query" />
                </div>
               <%-- <div style="margin-top: 20px">
                    <form action="/eduFixAssets/inputFixAsserts" id="fileload" enctype="multipart/form-data" method ="post">
                        <input type="button" value="<fmt:message code="workflow.th.Import" />" class="exportsss"  title="导入固定资产" >&nbsp;&nbsp;
                        <input type="file" name="file" class="fileload" onchange="filechang()">
                    </form>
                </div>--%>
            </div>
        </div>

        <%--分页按钮--%>
        <div id="dbgz_page" class="M-box3 fr" style="margin-right: 6%;margin-top: 2%">

        </div>
    </div>


    <div>
        <div>
            <table id="tr_td" style="margin-left: 1%;width: 98%;" >
                <thead>
                <tr>
                    <%--<td class="th"><fmt:message code="notice.th.chose"/></td>--%>
                    <td class="th"><fmt:message code="event.th.FixedAssetNumber" /></td>
                    <td class="th"><fmt:message code="event.th.AssetName" /></td>
                    <td class="th" ><fmt:message code="event.th.BuyTime" /></td>
                    <td class="th titleOne"><fmt:message code="event.th.Information" /></td>
                    <td class="th"><fmt:message code="event.th.Number" /></td>
                    <td class="th"><fmt:message code="event.th.location" /></td>
                    <td class="th"><fmt:message code="event.th.Custodian" /></td>
                    <td class="th"><fmt:message code="event.th.ArticleStatus" /></td>
                    <td class="th"><fmt:message code="event.th.FixedAssetsPicture" /></td>
                    <td class="th notice_do"><fmt:message code="notice.th.operation" /></td>
                </tr>
                </thead>
                <tbody id="j_tb"></tbody>
            </table>
        </div>
    </div>
</div>
<script>
    $("#tr_td").on("click",".del_btn",function () {
        var id= $(this).attr("id");
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />', '<fmt:message code="depatement.th.quxiao" />'], //按钮
            title: "<fmt:message code="event.th.DeleteAssets" />"
        }, function () {
            //确定删除，调接口
            $.ajax({
                url: '/eduFixAssets/deleteFixAssetsById',
                type: 'get',
                data: {
                    id: id,
                },
                dataType: 'json',
                success: function (json) {
                    if (json.flag) {
                        $.layerMsg({content: '<fmt:message code="workflow.th.delsucess" />！', icon: 1}, function () {
                            window.location.href = '<%=basePath%>/eduFixAssets/fixAssetsManager';
                        });
                    }
                }
            })
        }, function () {
            layer.closeAll();
        });
    })


    //进行条件查询方法，并在列表中显示
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            useFlag:true,
            condition:2,
            assetsName:null
        },
        init:function () {
        },
        page:function () {
            var me=this;
            $.get('/eduFixAssets/selFixAssetsByCond',me.data,function (obj) {
                $("#tr_td tbody").html("");
                var str="";
                var data=obj.obj;
                if(obj.flag){
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td>'+data[i].id+'</td>' +
                            '<td>'+data[i].assetsName+'</td>' +
                            '<td>'+data[i].buyTime+'</td>' +
                            '<td>'+data[i].info+'</td>' +
                            '<td>'+data[i].number+'</td>' +
                            '<td>'+data[i].locationAddressName+'</td>' +
                            '<td>'+data[i].custodionName+'</td>';
                        if(data[i].status==1){
                            str+='<td><fmt:message code="event.th.notUsed" /></td>';
                        }else if(data[i].status==2){
                            str+='<td><fmt:message code="evvent.th.Use" /></td>';
                        }else if(data[i].status==3){
                            str+='<td><fmt:message code="event.th.damage" /></td>';
                        }else if(data[i].status==4){
                            str+='<td><fmt:message code="event.th.Lose" /></td>';
                        }else{
                            str+='<td><fmt:message code="event.th.Scrap" /></td>';
                        }

                        if(data[i].image!='' && data[i].image!='undefined'){
                            str += '<td>' + '<img src="/img/edu/eduFixAssets/' + data[i].image + '" style="height: 70px;width: 110px;"/>' + '</td>';
                        }else{
                            str += '<td></td>';
                        }
                        str+= '<td><a class="edit_btn" href="../../eduFixAssets/fixAssetsEdit?editFlag=1&id='+data[i].id+'"><fmt:message code="global.lang.edit" /></a>' +
                            ' &nbsp;' +
                            '<span class="del_btn" id="'+data[i].id+'"><fmt:message code="global.lang.delete" /></span></td>' +
                            '</tr>';
                    }
                    $("#tr_td tbody").html(str);
                }
                me.pageTwo(obj.totleNum,me.data.pageSize,me.data.page)
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

    $(".submit").click(function(){
        ajaxPage.data.page=1;
        ajaxPage.data.condition=1;
        ajaxPage.data.assetsName=$("#assetsName").val();
        ajaxPage.page()
    })

    function filechang() {
        $.upload($('#fileload'),function (c) {
            $.layerMsg({content:'<fmt:message code="menuSSetting.th.importSuccess" />'+c.inputSuccess+'<fmt:message code="event.th.StripData" />,<fmt:message code="event.th.fail" />'+c.inputFail+'<fmt:message code="event.th.StripData" />，<fmt:message code="event.th.FailureReason" />：'+c.faillReason+'<fmt:message code="event.th.AlreadyExists" />',icon:1})
            var file = $("#fileload")
            file.after(file.clone().val(""));
            file.remove();
        })
    }
</script>
</body>
</html>
