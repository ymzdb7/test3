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
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <link rel="stylesheet" type="text/css" href="../css/news/management_query.css" />
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../lib/layer/layer.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/layer/layer.js"></script>
</head>
<body>
<div class="bx">
    <div class="center" id="" style="width: 100%;margin-left: 10px;">
        <div class="nav_box clearfix">
        <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png"></div>
        <div class="nav_t2" class="news">考试管理查询</div>
    </div>
            <table class="clearfix total">
                <tbody>
                <tr>
                    <td colspan="2" class="query_title">
                        输入查询条件
                    </td>
                </tr>
                <tr>
                    <td class="td_w size_color">
                        学年：
                    </td>
                    <td>
                        <select name="" class="year" id="format"></select>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text size_color">
                       学期：
                    </td>
                    <td>
                        <select name="" class="typeId" id="type_id">
                            <option value="0">第一学期</option>
                            <option value="0">第二学期</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="blue_text size_color">
                       考试类型：
                    </td>
                    <td>
                        <select name="" class="test"></select>
                    </td>
                </tr>
                <tr>
                    <td class="size_color">
                        考试安排:
                    </td>
                    <td>
                        <input class="title_" id="subject" type="text"/>
                    </td>
                </tr>
                <tr class="table_b">
                    <td colspan="2">
                        <div class="bt determine">查询</div>
                        <div class="exportNew" id="export">导出</div>
                    </td>
                </tr>

                </tbody>
            </table>
    </div>
</div>
</body>
</html>
<script>
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


</script>
<script>
    $(function(){
        getYear('.year','EDU_YEAR_NO');
        getYear('.test','EXAM_TYPE');






    })
</script>
