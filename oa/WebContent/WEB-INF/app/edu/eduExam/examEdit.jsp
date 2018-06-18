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
    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <link rel="stylesheet" type="text/css" href="../css/edu/eduExam/editExam.css"/>
    <link rel="stylesheet" type="text/css" href="../css/news/management_query.css" />
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../lib/layer/layer.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <!-- word文本编辑器 -->
    <script src="../lib/ueditor/ueditor.config.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/ueditor/ueditor.all.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>


</head>
<body>
    <div class="bx">
        <div class="step2" style="margin-left: 10px;">
            <table class="newNews">
                <div class="nav_box clearfix">
                    <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png"></div>
                    <div class="nav_t2" class="news">考试管理</div>
                </div>
                <tbody>
                <tr>
                    <td class="blue_text td_w">
                        考试名称：
                    </td>
                    <td>
                        <input class="td_title1" id="query_subject" type="text"  placeholder=""/>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">
                        学年：
                    </td>
                    <td>
                        <select name="" class="anonymityYn year" id=""></select>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">
                        学期:
                    </td>
                    <td>
                        <select name="" class="term">
                            <option value="0">第一学期</option>
                            <option value="1">第二学期</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">考试范围(年级)：</td>
                    <td>
                        <textarea readonly="readonly" class=" td_title1  release1" id="query_toId" dataid="" resize="auto"></textarea>
                        <%--<input class="td_title1  release1"  id="query_toId" type="text"/>--%>
                        <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt=""/>
                        <div class="release3" id="grade">添加</div>
                        <div class="release4 empty"onclick="empty('query_toId','query_toId')">清空</div>
                    </td>
                </tr>
                <tr id="role">
                    <td class="blue_text">考试范围(班级)：</td>
                    <td>
                        <textarea readonly="readonly" class="td_title1  release1" id="query_privId" dataid="" resize="auto"></textarea>
                        <%--<input class="td_title1  release1" id="query_privId" type="text"/>--%>
                        <img class="td_title2 release2" id="ip2" src="../img/mg2.png" alt=""/>
                        <div class="release3" id="priv_add">添加</div>
                        <div class="release4 empty" onclick="empty('query_privId','query_privId')">清空</div>
                    </td>
                </tr>
                <tr id="man">
                    <td class="blue_text">考试范围(人员)：</td>
                    <td>
                        <textarea readonly="readonly" class=" td_title1  release1" id="query_userId" dataid="" resize="auto"></textarea>
                        <img class="td_title2 release2"  src="../img/mg2.png" alt=""/>
                        <div class="release3"  id="query_adduser">添加</div>
                        <div class="release4 empty" onclick="empty('query_userId','query_userId')">清空</div>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">
                        考试类型:
                    </td>
                    <td>
                        <select name="" class="test" id="query_anonymityYn"></select>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">考试安排:</td>
                    <td><div class="content" id="container" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></div></td>
                </tr>
                <tr>
                    <td class="blue_text">
                        附件上传:
                    </td>
                    <td class="enclosure">
                        <div id="query_uploadArr" style="display: block;">
                        </div>
                        <div><img src="../img/mg11.png" alt=""/></div>
                        <div>
                            <form id="uploadimgform" target="uploadiframe"  action="../upload?module=news" enctype="multipart/form-data" method="post" >
                                <input type="file" multiple="multiple" name="file" id="uploadinputimg"  class="w-icon5" style="display:none;">
                                <a id="uploadimg" style="cursor: pointer;">添加附件</a>
                            </form>
                        </div>
                        <%--<div><img class="left_img" src="../img/mg12.png" alt=""/></div>--%>
                        <%--<div class="enclosure_t">从文件柜和网络硬盘选择附件</div>--%>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text">
                      提醒：
                    </td>
                    <td class="remind">
                        <div><input class="news_t1 remindCheck"  type="checkbox" checked="checked" /></div>
                        <div class="news_t">发送事务提醒消息</div>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="foot_mg">
                <div class="btn_">
                    <div  id="hd" type="publish" class="fot_1 btn_ok">保存</div>
                    <div  id="rs" type="save" class="btn_style btn_ok">返回</div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
<script>
    var ue = UE.getEditor('container');
    // 获取学年、考试类型控件
    function getYear(year,type){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:type},
            dataType:'json',
            success:function(reg){
                var datas=reg.obj;
                for (var i=0;i<datas.length;i++){
                    if(datas[i].codeOrder==13){
                        var str='<option value="'+datas[i].codeOrder+'" selected="true">'+datas[i].codeName+'</option>';
                    }else{
                        var str='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                    }
                    $(year).append(str);
                }
            }
        })
    }
    function empty(id,type){
        $("#"+id).val("");
        $("#"+id).attr(type,"");
    };



</script>
<script>
    $(function(){
        getYear('.year','EDU_YEAR_NO');
        getYear('.test','EXAM_TYPE');
        //选人员
        $('#query_adduser').click(function(){
            user_id='query_userId';
            $.popWindow("../common/selectEduUser");
        });
        //选班级
        $('#priv_add').click(function(){
            dept_id='query_privId';
            $.popWindow("../common/selectEduDept");
        });
        //选年级
        $('#grade').click(function(){
            dept_id='query_toId';
            $.popWindow("../common/selectEduDept");
        });






    })


</script>


