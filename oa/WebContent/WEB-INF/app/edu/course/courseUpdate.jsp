<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head


>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../css/news/center.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css" />
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <script src="../../lib/layer/layer.js"></script>
    <!-- 课程管理  -->
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
<style>
    .release4{
        margin-top: 10px;
    }
    #tr_td .publishtip {
        overflow: hidden;
        text-overflow:ellipsis;
        width: 60px;
        white-space:nowrap;
    }

    /*标题长时隐藏设置*/
    .title{
        width: 300px;
        overflow: hidden;
        text-overflow: ellipsis;
        white-space: nowrap;
    }

    .head .headli3{
        width:120px;
    }
    .float {
        float: left;
    }
    #cx{
        float:left;
    }

    .left .inputWidth{
        width:150px;
        margin:20px 0px 0px 5px;
    }

</style>
<body>
<!-- 修改课程页面********************* -->
<div class="step2" style="display: none;margin-left: 10px;">
    <!-- 中间部分 -->
    <table class="newNews">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/newsManages2_1.png"></div>
            <div class="nav_t2" class="news">修改课程</div>
        </div>
        <tbody>
        <tr>
            <td class="td_w">
                课程编号:
            </td>
            <td>
                <input class="td_title1" id="COURSE_ID" type="text"  placeholder="请输入课程编号..."/>
                <img class="td_title2" src="../img/mg2.png" alt=""/>
            </td>
        </tr>
        <tr>
            <td class="blue_text">  课程名称:</td>
            <td>
                <input class="td_title1" id="COURSE_NAME" type="text"  placeholder="请输入课程名称..."/>
                <img class="td_title2" src="../img/mg2.png" alt=""/>

            </td>
        </tr>
        <tr id="role">
            <td class="blue_text">  课程序号:</td>
            <td>
                <input class="td_title1" id="ORDER_NO" type="text"  value="10"/>
                <img class="td_title2" src="../img/mg2.png" alt=""/>
            </td>
        </tr>
        <tr id="man">
            <td class="blue_text"> 课程阶段: </td>
            <td>
                <input type="checkbox" name="STAGE" class="news_t1 remindCheck">小学<br>
                <input type="checkbox" name="STAGE" class="news_t1 remindCheck">初中<br>
                <input type="checkbox" name="STAGE" class="news_t1 remindCheck">高中<br>
                <input type="checkbox" name="STAGE" class="news_t1 remindCheck">大学<br>

            </td>
        </tr>
        <tr>
            <td class="blue_text">
                所属领域:
            </td>
            <td>
                <select name="" class="anonymityYn" id="REALM">
                    <option value="0"></option>
                    <option value="1"></option>
                    <option value="2"></option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                课程类别:
            </td>
            <td>
                <select name="" class="anonymityYn" id="COURSE_TYPE">
                    <option value="0"></option>
                    <option value="1"></option>
                    <option value="2"></option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                开设部门:
            </td>
            <td class="remind">
                <select name="" class="anonymityYn" id="DEPARTMENT">
                    <option value="0"></option>
                    <option value="1"></option>
                    <option value="2"></option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="blue_text">
                选课指导:
            </td>
            <td class="top_box">
                <textarea name="GUIDANCE" id="GUIDANCE" cols="74" rows="3" value></textarea>
            </td>
        </tr>
        <tr>
            <td>学分:</td>
            <td><input class="td_title1" id="COURSE_SCORE" type="text"  /></td>
        </tr>
        <tr>
            <td>周学时间:</td>
            <td><input class="td_title1" id="CREDIT_HOURS" type="text"  /></td>
        </tr>
        <tr>
            <td>人数上限:</td>
            <td><input class="td_title1" id="MAX_MEMBER" type="text"  /></td>
        </tr>
        <tr>
            <td>年级要求:</td>
            <td>
                <textarea name="GRADE_REQ" id="GRADE_REQ" cols="74" rows="3" value></textarea></td>
        </tr>
        <tr>
            <td>性别要求要求:</td>
            <td>
                <textarea name="SEX_REQ" cols="74" rows="3" value></textarea></td>
        </tr>
        <tr>
            <td>上课时间要求:</td>
            <td>
                <input class="td_title1 time_coumon" id="CLASS_TIME_REQ" type="text" placeholder="请输入发布时间...">
        </tr>
        <tr>
            <td>场地要求:</td>
            <td>
                <textarea name="SITE_REQ" cols="74" rows="3" value></textarea></td>
        </tr>
        <tr>
            <td>课程规划:</td>
            <td colspan="2"><script class="content" id="container" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></script></td>
        </tr>
        <tr>
            <td>附件文档</td>
            <td>
        <tr>
            <td colspan="2"><script class="content" id="" name="content" type="text/plain" style="width: 100%;min-height: 200px;"></script></td>
        </tr>
        <tr>
            <td class="blue_text">
                <fmt:message code="notice.th.keyWord"/>：
            </td>
            <td class="keyword">
                <input class="keyword_ip" id="COURSE_DESCRIPTION" type="text" placeholder="<fmt:message code="notice.th.key"/>..."/>
                <%--<div class="keyword_t"><fmt:message code="notice.th.AutomaticKeywordAcquisition"/></div>--%>
                <div class="keyword_t2"><fmt:message code="notice.th.keyContent"/></div>

        </tr>
        </td>
        </tr>
        <tr>
            <td class="blue_text">
                附件上传:
            </td>
            <td class="enclosure">
                <div id="query_uploadArr" style="display: block;">

                </div>
                <div><img src="../img/mg11.png" alt=""/></div>
                <!--  <div class="enclosure_t"><a href="#">添加附件</a></div> -->
                <div>
                    <form id="uploadimgform" target="uploadiframe"  action="../upload?module=news" enctype="multipart/form-data" method="post" >
                        <input type="file" multiple="multiple" name="file" id="ATTACHMENT_ID"  class="w-icon5" style="display:none;">
                        <a id="uploadimg" style="cursor: pointer;">添加附件</a>
                    </form>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <div class="foot_mg">
        <!--<img  id="hd" type="publish" class="fot_1 btn_ok" src="../img/mg5.png" alt=""/>
         <img  id="rs" type="save" class="btn_ok"  src="../img/mg6.png" alt=""/>  -->
        <div class="btn_">
            <div  id="hd" type="publish" class="fot_1 btn_ok" style="padding-left:15px;background:url(../../img/save.png) no-repeat;color:#999;">保存</div>
            <div  id="rd" type="save" class="btn_style btn_ok" style="padding-left:15px;background:url(../../img/save.png) no-repeat;color:#999;">关闭</div>
        </div>
    </div>
</div>
</div>

</body>
    </html>
