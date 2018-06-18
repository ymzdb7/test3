<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title><fmt:message code="main.news" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" >
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>


</head>
<body>
<style>
    /*标题长时隐藏设置*/
    .title{
        width: 250px;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }
    .btn_icons{
        /*width: 100%;*/
        border: #DCDCDC 1px solid;
        border-top: none;
    }
    .center .login .icons{
        height: 58px;
        line-height: 58px;
        width: 204px;
        margin: 0 auto;
        padding-left: 0px;
        border: none;
    }

    .center .login .icons div{
        margin-left: 22px;
    }
</style>
<div class="bx">
    <!--head开始-->
    <div class="head w clearfix">
        <ul class="index_head">
           <li data_id="0" data-num="0"><span class=" headli1_1 one"><fmt:message
                    code="news.title.unread"/></span><img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            <li data_id="" data-num="1"><span class="headli2_1 "><fmt:message
                    code="news.title.new"/></span><img src="../img/twoth.png" alt="" class="headli2_2"/>
            </li>
                    
           <li data_id="1" data-num="2"><span class="headli3"><fmt:message code="news.title.query"/></span></li>
           
        </ul>
    </div>
    <!--head通栏结束-->

    <!--navigation开始-->
    <div class="step1" style="margin-left: 0">
        <div class="navigation  clearfix">
            <div class="left" style="margin-left: 30px">

                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png">
                
                <div class="news">
                    <%--<fmt:message code="news.title.new"/>--%>
                    <fmt:message code="news.title.unread"/>
                </div>                
               <select name="TYPE" class="button1 nav_type" id="select">
                </select>
                <div>
                    <div class="nav_date">
                        <fmt:message code="global.lang.date"/>
                        :
                    </div>
                    <input class="button1" id="sendTime">
                </div>
                <!-- 查询按钮 -->
                <div id="cx" class="submit">
                    <fmt:message code="global.lang.query"/>
                </div>
            </div>
            
            <div class="right" style="margin-right: 20px;">
                <!-- 分页按钮-->
                <div class="M-box3">
                </div>

            </div>

        </div>

        <!--navigation结束-->

        <!--content部分开始-->
        <div>
            <div style="padding: 0 20px;">
                <table  id="tr_td">
                    <thead>
                    <tr>
                        <td class="th">
                            <fmt:message code="notice.th.title"/>
                        </td>
                        <td class="th">
                            <fmt:message code="news.th.type"/>
                        </td>
                        <!-- <td class="th" style="position: relative"><fmt:message code="notice.title.Releasedate" />
                               <img style="position: absolute;margin-left:9px;cursor: pointer;" src="../img/fiveth.png" alt=""/>
                             <img style="position: absolute;margin-top:13px;margin-left:9px;cursor: pointer;" src="../img/sixth.png " alt=""/>
                        </td> -->
                        <td class="th">
                            <fmt:message code="notice.title.Releasedate"/>
                        </td>

                        <td class="th">
                            <fmt:message code="news.th.clicks"/>
                        </td>
                        <td class="th">
                            <fmt:message code="news.th.comment"/>
                        </td>
                        <td class="th">
                            <fmt:message code="news.th.newscomment"/>
                        </td>
                        <!-- <td class="th">发布部门</td> -->
                    </tr>
                    </thead>
                    <tbody id="j_tb" calss="tr_td">
                    
                    </tbody>
                </table>
            </div>


        </div>
        <!--content部分结束-->

    </div>
</div>
<!-- 新闻查询 -->
<!-- <div class="center" style="width:100%;margin-top: 50px;display: none;"> -->
<!-- 新闻nav部分 -->

<div class="center" id="qt"  style="margin-left: 0">
	 <div class="navigation  clearfix">
            <div class="left" style="margin-left: 30px">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png">
                <div class="news">
                    	<fmt:message code="news.title.query"/>
                </div>                              
	</div> 
    <div class="login">
        <div class="header">
            <fmt:message code="global.lang.inputquerycondition"/>
        </div>
        <form id="empty">
        <div class="middle">
            <div class="le publisher">
                <div class="color" style="width:120px;">
                    <fmt:message code="notice.th.publisher"/> ：
                </div>
                <input id="input_text1" type="text"/>
                <div style="    margin-left: 5px;margin-right:16px;">
                     <a style="color:#207bd6;font-size: 14px;" href="javascript:;" id="query_adduser"><fmt:message code="global.lang.add"/></a>
                </div>
                <div>
                    <a  style="color:#207bd6;font-size: 14px;" href="javascript:;"  onclick="clearData()"><fmt:message code="global.lang.empty"/> </a>
                </div>
            </div>
            <div class="le subject">
                <div class="color" style="width:120px;">
                    <fmt:message code="notice.th.title"/> ：</div>
                <input id="subject_query" class="input_text2" type="text"/>
            </div>
            <div class="le date">
                <div class="color" style="width:120px;"><fmt:message code="notice.title.Releasedate"/> ：</div>
                <input id="beginTime"class="input_text3" type="text"/>
                <div class="color">
                    <fmt:message code="global.lang.to"/>
                </div>
                
               <div><input id="endTime" class="input_text4" type="text"/></div> 
            </div>
            <div class="le ce1">
                <div class="color" style="width:120px;"><fmt:message code="news.title.new"/> ：</div>
            <div> 
                 <select name="TYPE"  class="button1 input_text5" id="select_query">
                    </select>
                </div>

            </div>
            <div class="le ce2">
                <div class="color" style="width:120px;"><fmt:message code="notice.th.content"/>:</div>
              	<input id="content" class="input_text6" type="text"/>
            </div>
        </div>
         </form>
        <div class="btn_icons">
            <div class="icons">
                <!--   <img id="btn_query" style="margin-right:30px; cursor: pointer;" src="../img/threeth_three.png" alt=""/>
                  <img style="margin-right:30px; cursor: pointer;" src="../fourth_four.png" alt=""/>
                  <img style=" cursor: pointer;" src="../fiveth_five.png" alt=""/> -->
                <div id="btn_query"><fmt:message code="global.lang.query"/></div>

                <div  class="filling" onclick="Refillings()"><fmt:message code="global.lang.refillings"/></div>
            </div>
        </div>
    </div>
   
</div>
</div>
<script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>
<script>
user_id='input_text1';//选人控件
    $(function () {
        //页面加载时发送ajax获取下拉框数据
        var str="<option value=\"0\" selected=\"\"><fmt:message code="news.th.type"/></option>";
        $.ajax({
            url: "<%=basePath%>/code/GetDropDownBox",
            type:'get',
            dataType:"JSON",
            data : {"CodeNos":"NEWS"},
            success:function(data){
                for (var proId in data){
               for(var i=0;i<data[proId].length;i++){
                   str+='<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'
               }
                }
                $('#select').append(str);
                $('#select_query').append(str);
            }


        })







        var data = {
            read: $('.index_head .one').parent().attr('data_id'),
            typeId: $('#select').val() == 0 ? '' : $('#select').val(),
            nTime: $('#sendTime').val(),
            page: 1,
            pageSize: 5,
            useFlag: true,
            newsTime: '',
            lastEditTime: '',
            content: '',
            subject: '',
            fromId:''
        };
        initPageList(function (pageCount) {
            initPagination(pageCount, data.pageSize);
        });
        $(".index_head li").click(function () {
            $(this).find('span').addClass('one').parent().siblings('').find('span').removeClass('one');  // 删除其他兄弟元素的样式
            $(".news").html($(this).find('span').text());
            data.read = $(this).attr('data_id');
            data.typeId = $('#select').val() == 0 ? '' : $('#select').val();
            data.nTime = $('#sendTime').val();
            if($(this).attr('data-num')==0){
                $('.navigation .left img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/weiduxinwen.png')
            }else if($(this).attr('data-num')==1){
                $('.navigation .left img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/la2.png')
            }else {
                $('.navigation .left img').prop('src','/img/commonTheme/${sessionScope.InterfaceModel}/xinwenchaxun.png')
            }
            if (data.read == '' || data.read == 0) {
                $('.step1').show();
                $('.center').hide();

                 data.typeId='';
                 data.nTime='';
                 data.newsTime='';
                 data.lastEditTime='';
                 data.content='';
                 data.subject='';
                 data.fromId='';



                initPageList(function (pageCount) {
                    initPagination(pageCount, data.pageSize);
                });
            } else if (data.read == 1) {
                $('.step1').hide();
                $('.center').show();
                $('#subject').val('');
                $('#beginTime').val('');
                $('#endTime').val('');
                $('#select').val() == 0 ? '' : $('#select').val();
                $('#content').val('');
            }
        });
        $('.export').on('click',function(){
            $.layerMsg({content:'<fmt:message code="lang.th.Upcoming"/>',icon:6},function(){});
        })
        function initPageList(cb) {
            var layerIndex = layer.load(0, {shade: false}); /* 0代表加载的风格，支持0-2 */
            $.ajax({
                type: "get",
                url: "<%=basePath%>news/newsManage",
                dataType: 'JSON',
                data: data,
                success: function (obj) {
                    layer.closeAll();
                    if (obj.obj.length == 0) {
                        if ($('.index_head .one').parent().attr('data_id') == '0') {
                            $("#j_tb").html("");
                            layer.msg('<fmt:message code="new.alert.nodatealert"/>', {icon: 6});
                            var turnindex = setInterval(function () {
                                layer.closeAll();
                                $(".index_head li").eq(1).click();
                                clearInterval(turnindex);
                            }, 2 * 1000);
                        } else {
                            $("#j_tb").html("");
                            layer.msg('<fmt:message code="global.lang.nodata"/>', {icon: 6});
                            if (cb) {
                                cb(0);
                            }
                        };
                    } else {
                        var str = "";
                        for (var i = 0; i < obj.obj.length; i++) {
                            var typeName = ""
                            if(obj.obj[i].typeName==-1){
                                typeName ="";
                            }else{
                                typeName =obj.obj[i].typeName;
                            };
                            var comment="";
                            if(obj.obj[i].anonymityYn==2){
                                comment=""
                            }else{
                                comment="<fmt:message code="news.th.comment"/>"
                            };
                            str += "<tr><td><a href='#' style='color:#59b7fb;' newsId=" + obj.obj[i].newsId + " class='windowOpen'>" +
                                "<div class='title' title='" + obj.obj[i].subject + "'>" +function () {
                                   if(obj.obj[i].top==1){
                                       return "<img style='margin-right: 5px;vertical-align: middle;' src='/img/news/top.png' alt=''>"
                                   }else {
                                       return ''
                                   }
                                }() + obj.obj[i].subject +"</div>" +
                                "</a></td>" +
                                    "<td><a href='#' style='color:#666;' newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + typeName + "</a></td>" +
                                    "<td><a href='#'  style='color:#666;' newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + obj.obj[i].newsDateTime + "</a></td>" +
                                    "<td><a href='#'  style='color:#666;'  newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + obj.obj[i].clickCount + "</a></td>" +
                                    "<td><a href='#'  style='color:#666;' newsId=" + obj.obj[i].newsTime + " class='windowOpen'>" + obj.obj[i].newsCount + "</a></td>" +
                                    "<td><a href='#'  style='color:#59b7fb;' newsId=" + obj.obj[i].newsId + " comment_number=" + obj.obj[i].anonymityYn + " class='windowOpen_comment'>" + comment + "</a></td>" +
                                "</tr>";
                        };
                        var loadindex = setInterval(function () {
                            layer.closeAll();
                            $("#j_tb").html(str);
                            clearInterval(loadindex);
                        }, 1000);

                        if (cb) {
                            cb(obj.totleNum);
                        }
                    }
                }
            })
        };

        function initPagination(totalData, pageSize) {
            $('.M-box3').pagination({
                totalData: totalData,  
                showData: pageSize,
                jump: true,
                coping: true,
                homePage: '<fmt:message code="global.page.first" />',
                endPage: '<fmt:message code="global.page.last" />',
                prevContent: '<fmt:message code="global.page.pre" />',
                nextContent: '<fmt:message code="global.page.next" />',
                jumpBtn: '<fmt:message code="global.page.jump" />',
                callback: function (index) {
                    data.page = index.getCurrent();
                    initPageList();
                }
            });
        }

        /* 新闻详情页 */
        $("#j_tb").on('click', '.windowOpen', function () {
            var nid = $(this).attr('newsId');
            console.log(qt);
//            if(qt.webChannelTransport == undefined){
                $.popWindow('detail?newsId=' + nid,'<fmt:message code="news.th.newsDetail"/>','0','100','1200px','700px');
            <%--}else{--%>
                <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                    <%--var content = channel.objects.interface;--%>
                    <%--content.xoa_sms('/news/detail?newsId='+nid,'<fmt:message code="news.th.newsDetail"/>',"web_child_url");--%>
                <%--});--%>
            <%--}--%>
        });
        /* 新闻评论页 */
        $("#j_tb").on('click', '.windowOpen_comment', function () {
            var nid = $(this).attr('newsId');
            var comment = $(this).attr('comment_number');
//            if(qt.webChannelTransport == undefined){
                $.popWindow('comment?newsId='+ nid +'&comment='+ comment +'');
            <%--}else{--%>
                <%--new QWebChannel(qt.webChannelTransport, function(channel){--%>
                    <%--var content = channel.objects.interface;--%>
                    <%--content.xoa_sms('/news/comment?newsId='+nid+'&comment='+ comment,'<fmt:message code="news.th.newscomment"/>',"web_child_url");--%>
                <%--});--%>
            <%--}--%>

        });
        $('.submit').click(function () {
            data.read = $('.index_head .one').parent().attr('data_id');
            data.typeId = $('#select').val();
            data.nTime = $('#sendTime').val();
            initPageList(function (pageCount) {
                initPagination(pageCount, data.pageSize);
            });
        });
        //时间控件调用
        //新闻查询
        $('#btn_query').click(function () {
            data.fromId=$("#input_text1").attr("user_id");//人员控件 -
            data.read = "";
            data.subject = $('#subject_query').val();
            data.newsTime = $('#beginTime').val();
            data.lastEditTime = $('#endTime').val();
            data.typeId = $('#select_query').val() == 0 ? '' : $('#select_query').val();
            data.content = $('#content').val();
            initPageList();
            $('.step1').show();
            $('.center').hide();
        });
    });

    laydate({
        elem: '#sendTime', //目标元素。
        format: 'YYYY-MM-DD', //日期格式
        istime: true, //显示时、分、秒
    });
  //时间控件调用
    var start = {
        elem: '#beginTime',
        format: 'YYYY-MM-DD',
//        /* min: laydate.now(), //设定最小日期为当前日期*/
        max: '2099-06-16 23:59:59', //最大日期
        istime: true,
        istoday: false,
        choose: function (datas) {
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas; //将结束日的初始值设定为开始日
        }
    };
    var end = {
        elem: '#endTime',
        format: 'YYYY-MM-DD',
//        /*min: laydate.now(),*/
        max: '2099-06-16 23:59:59',
        istime: true,
        istoday: false,
        choose: function (datas) {
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    laydate(start);
    laydate(end);
    /* 新闻查询重填 */
	function Refillings(){
		document.getElementById("empty").reset();  
	}
/* 新闻查询清空 */	
	function clearData(){
		$("#input_text1").val("");
		$("#input_text1").attr("user_id","")

	}
/* 选人控件 */
$("#query_adduser").on("click",function(){
   		user_id = "input_text1";
       	$.popWindow("../common/selectUser");      		 		 
       	});
</script>
</body>


</html>
