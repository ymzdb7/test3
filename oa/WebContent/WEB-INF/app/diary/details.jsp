<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title><fmt:message code="log.th.Logdetails"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/style.css" />
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../css/workflow/work/bootstrap.tag.css">
    <link rel="stylesheet" type="text/css" href="../css/diary/workLog.css"/>
    <link rel="stylesheet" type="text/css" href="../css/diary/details.css"/>
    <script src="../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/workflow/work/attach.js"></script>
    <script src="../../js/workflow/work/jquery.ux.attachmenu.js"></script>
    <script src="../../js/bootstrap/bootstrap.min.js"></script>
    <script src="../lib/layer/layer.js"></script>
</head>

<style>
    html,body{
        background:none;
        height:100%;
        background:#f7f7f7;
    }
    .feed-cmt-list-item{
        border-top: none;
    }
    .layui-layer-title {
        padding: 0 80px 0 20px;
        height: 42px;
        line-height: 42px;
        border-bottom: 1px solid #eee;
        font-size: 16px;
        color: #fff;
        overflow: hidden;
        background-color: #2b7fe0;
        border-radius: 2px 2px 0 0;
    }
    .feed .pop-content{
        position:relative;
        border:none;
        box-shadow:none;
        border-radius:0px;
        background:none;
        margin-top:105px;
    }
    .feed-hd{
        position:absolute;
        top:15px;
        right:20px;
    }
    #diary-detail-container{
        width:100%;
     }
    #diary-detail-bg{
        width:1012px;
        margin:0 auto;
        text-align:center;
        position:static;
        background:url(../../img/diary/background.png) no-repeat;
    }
    #diary-detail-header{
        padding:0px;
    }
    #diary-detail-header .diary-detail-title h1{
        font-size:20px;
        top:90px;
        width:100%;
        text-align:center;
    }
    #diary-detail-header .diary-detail-ext-header{
        font-size:14px;
        top:118px;
        width:100%;
        text-align:center;
    }
    #diary-detail-content{
        background:none;
    }
    .rich-content{
        padding:0px;
        background:none;
    }
    .feed-title{
        padding-bottom:10px;
        padding-top:22px;
        border-bottom:1px solid #ccc;
    }
    .feed-hd .feed-time{
        padding-top:3px;
        padding-left:10px;
    }
    .jjl_body{
        font-size:14px;
        line-height:21px;

    }
    #diary-detail-container{
        width:1012px;
        margin:-166px auto;
    }

</style>

<body>
<div id="shareModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="shareModal" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="shareModalLabel"><fmt:message code="diary.th.Share"/></h3>
    </div>
    <div class="modal-body">
        <form name="shareform">
            <div id="share-group" class="control-group">
                <div class="share-control pull-right">
                    <button type="button" id="share-plus" class="btn btn-mini"><i class="icon-plus"></i></button>
                    <button type="button" id="share-trash" class="btn btn-mini"><i class="icon-trash"></i></button>
                </div>
                <label class="control-label" ><b><fmt:message code="diary.th.body"/></b></label>
                <div class="controls">
                    <div id="share-tags">  </div>
                    <input type="hidden" id="sharename" name="sharename" />
                    <input type="hidden" id="sharetext" name="sharetext" />
                </div>
            </div>
        </form>
    </div>
    <div class="modal-footer">
        <button id="shareSubmit" class="btn btn-primary"><fmt:message code="global.lang.ok"/></button>
        <button class="btn" data-dismiss="modal" aria-hidden="true"><fmt:message code="global.lang.close"/></button>
    </div>
</div>

<div id="diary-fixed-box" style="display:none">
    <ul>
        <li class="prev">
            <a href="show_diary.php?dia_id=215&diary_copy_time=" class="icon-chevron-left"></a>
        </li>
    </ul>
</div>
<div style="height:100%;background:#fff;width:1012px;margin:0 auto">
    <div id="diary-detail-bg">	</div>
    <div id="diary-detail-container" class="container" data-diary-id="216">
        <div id="diary-detail-header">
            <div style="text-align: center;">
                <img src="../../img/diary/boy.png" alt="">
            </div>
            <a target="_blank" href="" class="diary-detail-title">
                <h1 class="shoutest"><fmt:message code="email.th.systemmanager"/></h1>
            </a>
            <div class="diary-detail-ext-header">
                <span class="diary-detail-dept"> <fmt:message code="diary.th.test"/> </span>
                <span class="diary-detail-priv"> OA<fmt:message code="diary.th.manager"/> </span>
            </div>
        </div>

        <div id="diary-detail-content" class="feed">
            <div class="pop-content clearfix">
                <div class="feed-hd">

                    <span class="feed-time" title="">6月09 10：12</span>

                    <div class="feed-act" style="float:right;display: inline-block;">

                      <%--  <a class="pinglun" href="javascript:void(0)"  onclick= "develop()">
                            <fmt:message code="news.th.comment"/><span class="pingNum">(0)</span>
                        </a>--%>
                        <a href="javascript:void(0)" onclick= "share_details()"><fmt:message code="diary.th.Share"/></a>
                       <%-- <a href="javascript:void(0)"  onclick= "develop()">
                            <fmt:message code="notice.th.top"/>
                        </a>--%>
                        <a href="javascript:void(0)" onclick= "deleteEdit()">
                            <fmt:message code="global.lang.edit"/>
                        </a>
                        <a href="javascript:void(0)" data-cmd="del" hidefocus="hidefocus"  onclick= "delete_details()">
                            <fmt:message code="global.lang.delete"/>
                        </a>
                    </div>
                    <%--<div class="feed-basic">--%>
                    <%--<span class="feed-type" id="feed-type">--%>
                    <%--<fmt:message code="main.worklog"/>--%>
                    <%--</span>--%>
                    <%--</div>--%>
                </div>
                <div class="feed-bd">
                    <h4 class="feed-title">2017-05-12 <fmt:message code="Friday"/>  <fmt:message code="main.worklog"/></h4>
                    <div class="feed-ct">
                        <div class="feed-txt-full rich-content">
                            <div class="feed-txt-summary">
                                <div class="jjl_body"><fmt:message code="log.th.Logcontent"/></div>
                            </div>
                        </div>
                    </div>
                    <div class="feed-attachments">
                        <%--下载附件--%>

                    </div>

                </div>
            </div>
        </div>

        <%--<div id="footer">--%>
        <%--<div class="previous-page">--%>
        <%--<a href="show_diary.php?dia_id=213&amp;diary_copy_time=">--%>
        <%--上一篇                    </a>--%>
        <%--</div>--%>
        <%--<div class="next-page">--%>
        <%--<a href="show_diary.php?dia_id=216&amp;diary_copy_time=">--%>
        <%--下一篇                    </a>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--<div class="feed-ext-detailreaders"><span>暂无人员浏览</span></div>--%>
        <%--<div class="feed-ext-body">--%>
        <%--<ul class="feed-ext-list ">--%>
        <%--</ul>--%>
        <%--<div class="feed-ext-add-comment">--%>
        <%--<form target="" action="" name="feed-comment-form">--%>
        <%--<div class="feed-ext-add-comment-to">--%>
        <%--</div>--%>
        <%--<textarea name="TD_HTML_EDITOR_feed-submit-cmt-context-216" class="feed-submit-cmt-context"></textarea>--%>
        <%--<button type="button" data-cmd="replySubmit" class="btn btn-primary feed-submit-cmt-btn">--%>
        <%--提交--%>
        <%--</button>--%>
        <%--<input type="hidden" name="comment-to" value="">--%>
        <%--<input type="hidden" name="comment-id" value="">--%>
        <%--<input type="hidden" name="comment-type" value="">--%>
        <%--<input type="hidden" name="diary-id" value="216">--%>
        <%--<div class="feed-ext-comment-sms-op">--%>
        <%--<label class='sms-remind-label'><input type="checkbox" name="SMS_REMIND" id="SMS_REMIND" checked>发送事务提醒消息</label>                    </div>--%>
        <%--<div class="feed-ext-comment-sms-advcomment">--%>
        <%--<label>--%>
        <%--<input type="checkbox" name="advcomment" class="advcomment" />高级评论--%>
        <%--</label>--%>
        <%--</div>--%>
        <%--</form>--%>
        <%--</div>--%>

        <%--</div>--%>
    </div>
</div>


</body>

<script src="../../js/workflow/work/jquery.tmpl.min.js"></script>
<script src="../../js/bootstrap/bootstrap.tag.js"></script>
<script src="../../js/workflow/work/module.js"></script>
<script id="cmtTmpl" type="text/x-jquery-tmpl">
<li class="feed-cmt-list-item  >
    <a href="javascript:void(0); class="feed-cmt-list-user"></a>

        <fmt:message code="email.th.reply"/><a href="javascript:void(0);"  hidefocus="hidefocus" class="feed-cmt-list-user"></a>

    <div class="feed-cmt-list-ext">

        <a class="feed-cmt-del-handle" href="javascript:;"><fmt:message code="global.lang.delete"/></a>

        <a class="feed-cmt-reply-handle"  href="javascript:void(0);" hidefocus="hidefocus"><fmt:message code="email.th.reply"/></a>

        <span class="feed-cmt-list-time"  ></span>
    </div>
    <div class="feed-cmt-content"></div>
    <div class="feed-cmt-attachments"></div>
</li>
</script>

<script src="../../js/workflow/work/GM.js"></script>
<script>
    $(function () {
        var nid=$.getQueryString('id');
//        alert(nid);
        $.ajax({
            type:'get',
            url:'<%=basePath%>diary/getConByDiaId',
            dataType:'json',
            data:{'diaId':nid},
            success:function(data){
                var name=data.object.userName;//用户
                var feed_time=data.object.diaTime;//时间
                var feed_title=data.object.subject;//标题
                var jjl_body=data.object.content;//内容
                $('.shoutest').html(name);//用户
                $('.feed-time').html(feed_time);//时间
                $('.feed-title').html(feed_title);//标题
                $('.jjl_body').html(jjl_body);//内容
                $('.pingNum').html('('+data.object.comTotal+')')

                if(data.object.diaType==1){
                    $("#feed-type").html('<fmt:message code="main.worklog" />');/*工作日志*/
                }else{
                    $("#feed-type").html('<fmt:message code="diary.th.personLog" />');/*个人日志*/
                };// diaType(日志类型(1-工作日志,2-个人日志)
                //附件下载
                var str1 = "";
                var arr = new Array();
                arr = data.object.attachment;
                if (data.attachmentName != '') {
                    for (var i = 0; i < (arr.length); i++) {
                        str1 += '<div class="font_"><a download="'+ arr[i].attUrl+'" href="<%=basePath%>download?'+ arr[i].attUrl + '"><img class="img_" src="../img/enclosure.png"/>' + arr[i].attachName + '</a></div>'+
                            '<input type="hidden" class="inHidden" NAME="'+arr[i].attachName+'*" value="'+arr[i].aid+'@'+arr[i].ym+'_'+arr[i].attachId+',">';
                    }
                    $('.feed-attachments').append(str1);
                }
            }
        });

    }) ;
    //日志详情删除接口
    function delete_details(){
//        alert(111);
        var data={
            'diaId':$.getQueryString('id')
        };
        $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="workflow.th.que" />？',icon:0},function(){/*确定删除 您确定要删除吗*/
            $.ajax({
                url:"<%=basePath%>diary/delete",
                type:'get',
                dataType:"JSON",
                data : data,
                success:function(data){
                    window.close();
                    window.opener.location.reload()
                },
                error:function(e){
                    console.log(e);
                }
            });
        },function(){
            return true;
        })
    };
    //详情日志的共享
    function share_details(){
//        alert(111);
        layer.open({
            type: 1,
            /* skin: 'layui-layer-rim', //加上边框 */
            offset: '80px',
            area: ['400px', '300px'], //宽高
            title:'<fmt:message code="diary.th.Share"/>',
            closeBtn: 0,
            content: '<div id="" class="ry">'+
            '<label class="control-label"><b class="date"><fmt:message code="diary.th.body"/></b></label>'+
            '<div class="controls">'+
            '<textarea class="inText" id="gx_text_" type="text" readonly></textarea>'+
            '<div id="add_gx_"><fmt:message code="global.lang.add"/></div>'+
            '<div id="clear_gx_"><fmt:message code="global.lang.empty"/></div>'+
            '</div>'+
            ' </div>',
            btn:['<fmt:message code="global.lang.ok"/>', '<fmt:message code="global.lang.close"/>'],
            yes: function(){


                layer.closeAll();
            }
        });
        /*写日志共享人员控件*/
        $('#add_gx_').click(function(){
            user_id='gx_text_';
            $.popWindow("../common/selectUser");
        });
        /*清空共享人员控件*/
        $('#clear_gx_').click(function(){
            $("#gx_text_").val("");
        });


    };

    //新闻详情编辑接口
    function deleteEdit() {
        $(window.opener.document.getElementById("logInfo")).hide();
        $(window.opener.document.getElementById("logNew")).show();
        $(window.opener.document.getElementsByClassName("log")).html('<fmt:message code="diary.th.modi" />');/*修改日志*/
        $(window.opener.document.getElementById("hd")).attr('ac',"update");
        var datas={
            'diaId':$.getQueryString('id')
        };
//        alert(datas.diaId);
        $.ajax({
            url:"<%=basePath%>diary/getConByDiaId",
            type:'get',
            dataType:"JSON",
            data : datas,
            success:function(data){
                $(window.opener.document.getElementById("diary_log")).find("option[value="+data.object.diaType+"]").attr("selected",true);//(日志类型(1-工作日志,2-个人日志))
                $(window.opener.document.getElementById("query_subject")).val(data.object.subject);
                window.opener.ue.setContent(data.object.content);//（日志内容）
                if(data.object.toAll==1){
                    $(window.opener.document.getElementById("share_type")).attr("checked", true);
                    $(window.opener.document.getElementById("share")).show();
                }else{
                    $(window.opener.document.getElementById("share_type")).attr("checked", false);
                    $(window.opener.document.getElementById("share")).hide();
                };// （是否全部共享(0-否,1-是)）
                $(window.opener.document.getElementById("add_text")).val(data.object.toIdName);//（共享用户ID串,人员控件）
                $(window.opener.document.getElementById("add_text")).attr("user_id",data.object.toId);
                //附件下载
                var str1 = "";
                var arr = new Array();
                arr = data.object.attachment;
                if (data.attachmentName != '') {
                    for (var i = 0; i < (arr.length); i++) {
                        str1 += '<div class="font_"><a href="<%=basePath%>download?' + arr[i].attUrl + '"><img class="img_" src="../img/enclosure.png"/>' + arr[i].attachName + '</a></div></br>'+
                            '<input type="hidden" class="inHidden" NAME="'+arr[i].attachName+'*" value="'+arr[i].aid+'@'+arr[i].ym+'_'+arr[i].attachId+',">';
                    }
                    $(window.opener.document.getElementById("query_uploadArr")).append(str1);
                }
                window.close();
            },
            error:function(e){
                console.log(e);
            }
        });

    }


    //正在开发中
    function develop(i){
        <%--layer.msg('<fmt:message code="global.lang.doing" />', {icon: 6});--%>
        $.layerMsg({content:'<fmt:message code="sup.th.UnderDevelopment" />!',icon:6},function(){});/*正在开发中*/

    }

</script>


</html>

