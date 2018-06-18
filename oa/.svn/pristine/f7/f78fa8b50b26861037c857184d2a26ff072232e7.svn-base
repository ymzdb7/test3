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
    <title></title>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../css/document/index.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/document/index.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js"></script>
    <style>
        .layui-layer-title {
            background: #2b7fe0!important;
            color: #fff!important;
        }
        .conter {
            width: 350px;
            max-height: 800px;
            margin: auto;
        }
        .f_title {
            margin-top: 22px;
        }
        .f_field_title {
            font-size: 16px;
            font-weight: bold;
            margin-left: 2px;
            margin-right: 2px;
        }
        .f_field_required {
            color: red;
            font-size: 12px;
            margin-top: 0px;
            margin-left: 2px;
            margin-right: 2px;
        }
        .f_field_ctrl {
            float: right;
            margin-left: 2px;
        }
        .f_field_ctrl select {
            height: 32px;
            width: 210px;
            border-radius: 4px;
            border: 1px solid #cccccc;
            background-color: #ffffff;
        }
        .f_field_block {
            width: 100%;
            height: 34px;
            margin-top: 10px;
            margin-bottom: 10px;
            display: block;
            text-align: left;
            line-height: 34px;
        }
        .f_field_ctrl input {
            color: #000;
            text-align: left;
            text-indent: 5px;
        }

        .inp {
            width: 208px;
            height: 32px;
            line-height: 32px;
            border-radius: 4px;
            padding: 0;
        }
        .layui-layer-btn0{
            text-align: center;
            padding: 0 30px;
        }
        .edit_choose{
            float: left;
            width: 33.33333333333333333333%;
            cursor: pointer;
            color: #138eee;
        }
    </style>
</head>
<body>
<div class="bx">
    <!--head开始-->
    <div class="head w clearfix">
        <ul class="index_head">
           <li data_id="0" data-num="0"><span class="one headli1_1"><fmt:message code="document.th.To-doList" /></span><img class="headli1_2" src="../img/twoth.png" alt=""/>
            </li>
            
            <li data_id="" data-num="1"><span class="headli2_1"><fmt:message code="document.th.InOffice" /></span><img src="../img/twoth.png" alt="" class="headli2_2"/>
            </li>
                    
           <li data_id="1" data-num="2"><span class="headli3"><fmt:message code="document.th.AnOfficial" /></span></li>
           
        </ul>
        <div class="new_liucheng" style="padding-left:25px;margin-top: 10px;"><h1 style="line-height: 30px;overflow: hidden;text-overflow: ellipsis;white-space: normal;width: 70px" ><fmt:message code="document.th.NewOfficial" /></h1></div>
    </div>
    <!--head通栏结束-->

    <!--navigation开始-->
    <div class="step1">
        <div class="navigation  clearfix">
            <div class="left">

                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yinzhang.png">
                
                <div class="news">
                    <fmt:message code="document.th.To-doList" />
                </div>                
               <select name="TYPE" class="button1 nav_type" id="select">
                    <option value="0" selected="">
                        <fmt:message code="news.th.type"/>
                    </option>
                    <option value="01">
                        <fmt:message code="news.th.company"/>
                    </option>
                    <option value="02">
                        <fmt:message code="news.th.media"/>
                    </option>
                    <option value="03">
                        <fmt:message code="news.th.industry"/>
                    </option>
                    <option value="04">
                        <fmt:message code="news.th.partner"/>
                    </option>
                    <option value="05">
                        <fmt:message code="news.th.client"/>
                    </option>
                    <option value="-1">
                        <fmt:message code="news.th.none"/>
                    </option>
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
            
            <div class="right">
                <!-- 分页按钮-->
                <div class="M-box3">
                </div>

            </div>

        </div>

        <!--navigation结束-->

        <!--content部分开始-->
        <div>
            <div>
                <table  id="tr_td">
                    <thead>
                    <tr>
                        <td class="th">
                            <fmt:message code="notice.th.title" />
                        </td>
                        <td class="th">
                            <fmt:message code="document.th.DocumentNumber" />
                        </td>
                        <!-- <td class="th" style="position: relative"><fmt:message code="notice.title.Releasedate" />
                               <img style="position: absolute;margin-left:9px;cursor: pointer;" src="../img/fiveth.png" alt=""/>
                             <img style="position: absolute;margin-top:13px;margin-left:9px;cursor: pointer;" src="../img/sixth.png " alt=""/>
                        </td> -->
                        <td class="th">
                            <fmt:message code="document.th.DocumentType" />
                        </td>

                        <td class="th">
                            <fmt:message code="document.th.Incoming-outgoing" />
                        </td>
                        <td class="th">
                            <fmt:message code="document.th.DocumentState" />
                        </td>
                        <td class="th">
                            <fmt:message code="document.th.Urgency" />
                        </td>
                        <td class="th">
                            <fmt:message code="global.lang.date" />
                        </td>
                        <td class="th" style="text-align: center;">
                            <fmt:message code="notice.th.operation" />
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

<div class="center" id="qt">
	 <div class="navigation  clearfix">
            <div class="left">
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png">
                <div class="news">
                    	<fmt:message code="news.title.query" />
                </div>                              
	</div> 
	
    <div class="login">
        <div class="header">
            <fmt:message code="global.lang.inputquerycondition"/>
        </div>
        <form id="empty">
        <div class="middle">
            <div class="le publisher">
                <div class="color" style="width:105px;">
                    <fmt:message code="notice.th.publisher"/> ：
                </div>
                <input id="input_text1" type="text"/>
                <div style="margin-right:23px; color:#207BD6">
                     <a href="javascript:;" id="query_adduser"><fmt:message code="global.lang.add"/></a>
                </div>
                <div>
                    <a href="javascript:;"  onclick="clearData()"><fmt:message code="global.lang.empty"/> </a>
                </div>
            </div>
            <div class="le subject">
                <div class="color" style="width:105px;">
                    <fmt:message code="notice.th.title"/> ：</div>
                <input id="subject_query" class="input_text2" type="text"/>
            </div>
            <div class="le date">
                <div class="color" style="width:105px;"><fmt:message code="notice.title.Releasedate"/> ：</div>  
                <input id="beginTime"class="input_text3" type="text"/>
                <div class="color">
                    <fmt:message code="global.lang.to"/>
                </div>
                
               <div><input id="endTime" class="input_text4" type="text"/></div> 
            </div>
            <div class="le ce1">
                <div class="color" style="width:105px;"><fmt:message code="news.title.new"/> ：</div>
            <div> 
                 <select name="TYPE"  class="button1 input_text5" id="select_query">
                        <option value="0" selected="">
                            <fmt:message code="news.th.type"/>
                        </option>
                        <option value="01">
                            <fmt:message code="news.th.company"/>
                        </option>
                        <option value="02">
                            <fmt:message code="news.th.media"/>
                        </option>
                        <option value="03">
                            <fmt:message code="news.th.industry"/>
                        </option>
                        <option value="04">
                            <fmt:message code="news.th.partner"/>
                        </option>
                        <option value="05">
                            <fmt:message code="news.th.client"/>
                        </option>
                        <option value="-1">
                            <fmt:message code="news.th.none"/>
                        </option>
                    </select>
                </div>

            </div>
            <div class="le ce2">
                <div class="color" style="width:105px;"><fmt:message code="notice.th.content"/>:</div>          
              	<input id="content" class="input_text6" type="text"/>
            </div>
        </div>
         </form>
        <div class="icons">
          <!--   <img id="btn_query" style="margin-right:30px; cursor: pointer;" src="../img/
            <img style="margin-right:30px; cursor: pointer;" src="../fourth_four.png" alt=""/>
            <img style=" cursor: pointer;" src="../fiveth_five.png" alt=""/> -->
            <div id="btn_query"><fmt:message code="global.lang.query" /></div>
            <div class="export"><fmt:message code="global.lang.report" /></div>
            <div  class="filling" onclick="Refillings()"><fmt:message code="global.lang.refillings" /></div>
        </div>
    </div>
   
</div>
<!--footer部分结束-->
</div>

<script>
user_id='input_text1';//选人控件       	
    $(function () {    	   
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
            subject: ''

        };
        initPageList(function (pageCount) {
            console.log(pageCount);
            initPagination(pageCount, data.pageSize);
        });


        $(".index_head li").click(function () {

            $(this).find('span').addClass('one').parent().siblings('').find('span').removeClass('one');  // 删除其他兄弟元素的样式
            $(".news").html($(this).find('span').text());
            data.read = $(this).attr('data_id');
            data.typeId = $('#select').val() == 0 ? '' : $('#select').val();
            data.nTime = $('#sendTime').val();

            if($(this).attr('data-num')==0){
                $('.navigation .left img').prop('src','/img/daibangongwen.png')
            }else if($(this).attr('data-num')==1){
                $('.navigation .left img').prop('src','/img/zaibangongwen.png')
            }else {
                $('.navigation .left img').prop('src','/img/yibangongwen.png')
            }
            console.log(data);

                initPageList(function (pageCount) {
                    initPagination(pageCount, data.pageSize);
                });

        });
        function initPageList(cb) {
            var layerIndex = layer.load(0, {shade: false}); /* 0代表加载的风格，支持0-2 */
            $.ajax({
                type: "get",
                url: "<%=basePath%>document/selectDocAll",
                dataType: 'JSON',
                data: {},
                success: function (obj) {
                    layer.closeAll();
                    if (obj.obj.length == 0) {
                        if ($('.index_head .one').parent().attr('data_id') == '0') {
                            $("#j_tb").html("");
                            layer.msg('<fmt:message code="new.alert.nodatealert" />', {icon: 6});
                            var turnindex = setInterval(function () {
                                layer.closeAll();
                                $(".index_head li").eq(1).click();
                                clearInterval(turnindex);
                            }, 2 * 1000);
                        } else {
                            $("#j_tb").html("");
                            layer.msg('<fmt:message code="global.lang.nodata" />！', {icon: 6});
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
                            str += "<tr class='change_data'><td><a href='#' style='color:#2B7FE0;' newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + obj.obj[i].title + "</a></td>" +
                                    "<td><a href='#' style='color:#666;' newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + obj.obj[i].docNo + "</a></td>" +
                                    "<td><a href='#'  style='color:#666;' newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + obj.obj[i].documentType + "</a></td>" +
                                    "<td><a href='#'  style='color:#666;'  newsId=" + obj.obj[i].newsId + " class='windowOpen'>" + obj.obj[i].unit + "</a></td>" +
                                    "<td><a href='#'  style='color:#666;' newsId=" + obj.obj[i].newsTime + " class='windowOpen'>" + '0' + "</a></td>"+
                                    "<td><a href='#'  style='color:#666;' newsId=" + obj.obj[i].newsTime + " class='windowOpen'>" + obj.obj[i].urgency + "</a></td>"+
                                    "<td><a href='#'  style='color:#666;' newsId=" + obj.obj[i].newsTime + " class='windowOpen'>" + obj.obj[i].printDate + "</a></td>"+
                                    "<td><div class='edit_choose' id='edit'><fmt:message code="global.lang.edit" /></div><div class='edit_choose' id='do'><fmt:message code="document.th.handle" /></div><div class='edit_choose' id='delete' data_id='"+obj.obj[i].id+"'><fmt:message code="global.lang.delete" /></div></td>";
                        }
                        var loadindex = setInterval(function () {
                            layer.closeAll();
                            $("#j_tb").html(str);
                            clearInterval(loadindex);
                        }, 1000);

                        if (cb) {
                            //alert(obj.totleNum);
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
                    console.log(index.getCurrent());
                    initPageList();
                }
            });
        }
        $('#j_tb').on('click', '#delete', function () {
            var id = $(this).attr('data_id');
            $.ajax({
                type: "get",
                url: "<%=basePath%>document/deleteDoc",
                dataType: 'JSON',
                data: {
                    id:id
                },
                success: function (obj) {
                    alert('<fmt:message code="workflow.th.delsucess" />');
                }
            });
            $(this).parents('.change_data').remove();
        });
        /* 新闻详情页 */
        $("#j_tb").on('click', '.windowOpen', function () {
            var nid = $(this).attr('newsId');
            $.popWindow('detail?newsId=' + nid, '1111');
        });
        $('.submit').click(function () {
            data.read = $('.index_head .one').parent().attr('data_id');
            data.typeId = $('#select').val();
            data.nTime = $('#sendTime').val();
            //console.log(read,typeId,nTime);

            initPageList(function (pageCount) {
                console.log(pageCount);
                initPagination(pageCount, data.pageSize);
            });
        });
        //时间控件调用

        $('#btn_query').click(function () {

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

    //新增
    $('.new_document').on('click',function(){
        layer.open({
            type: 1,
            /* skin: 'layui-layer-rim', //加上边框 */
            offset: '80px',
            area: ['600px', '400px'], //宽高
            title:$(this).find('h1').text(),
            closeBtn: 0,
            content: '<div class="conter"><div class="f_title">'+
            '<div class="f_field_block"><span class="f_field_title" id="name_form"><fmt:message code="notice.th.title" />：</span><div class="f_field_ctrl clear"><input type="text" class="inp name_biaodan" name="SORT_NAME" size="30" maxlength="100" value="" id="sort_name"></div></div>'+
            '<div class="f_field_block"><span class="f_field_title" id="name_form"><fmt:message code="document.th.DocumentType" />：</span><div class="f_field_ctrl clear"><select name="SORT_PARENT" id="sort_parent"><option>收文</option><option>发文</option></select></div></div>'+
            '<div class="f_field_block"><span class="f_field_title" id="name_form"><fmt:message code="document.th.Incoming-outgoing" />：</span><div class="f_field_ctrl clear"><input type="text" class="inp name_biaodan" name="SORT_NAME" size="30" maxlength="100" value="" id="sort_name"></div></div>'+
            '<div class="f_field_block"><span class="f_field_title" id="name_form"><fmt:message code="workflow.th.allpart" />：</span><div class="f_field_ctrl clear"><select class="select_duplicate_sort" name="DEPT_ID" id="dept_id"><option><fmt:message code="workflow.th.allpart" /></option></select></div></div>'+
            '</div></div>',

            btn:['<fmt:message code="global.lang.new" />','<fmt:message code="global.lang.close" />'],
            yes: function(index, layero){

            }
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
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
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
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
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
	}
/* 选人控件 */
$("#query_adduser").on("click",function(){
   		user_id = "input_text1";
       	$.popWindow("../common/selectUser");      		 		 
       	});  

</script>
</body>


</html>
