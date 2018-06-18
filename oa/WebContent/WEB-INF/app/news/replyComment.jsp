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
    <title>回复评论</title>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <link rel="stylesheet" type="text/css" href="../css/news/comment.css"/>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<table class="clearfix total">
    <tbody>
    <tr>
        <td colspan="2" class="query_title">
            发表评论
        </td>
    </tr>

    <tr>
        <td class="size_color td_w">内容:</td>
        <td>
            <textarea class="SmallStatic" id="add_text" name="to_name" style="margin: 0px;width: 98%;height: 85px;"> </textarea>
        </td>
    </tr>
    <tr class="operation">
        <td class="size_color">署名:</td>
        <td>
            <div id="system_personnel">
                <input type="radio" name="radio" value="1" checked>
                <div class="operation1" id="operation1_name"></div>
            </div>
            <div id="anonymous_personnel">
                <input type="radio" name="radio" value="2">昵称
                <input id="personnel_nm" type="text">
            </div>
        </td>
    </tr>
    <tr class="table_b">
        <td colspan="2">
            <div class="bt determine" id="determine">发表</div>
            <%--<div class="exportNew" id="look_comment">查看所有评论</div>--%>
            <div  onclick="close_w()">关闭</div>
        </td>
    </tr>

    </tbody>
</table>
</body>
<script>
    function close_w(){
        window.close();
    };
    $(function(){
        var nid = $.getQueryString('newsId');
        var comment = $.getQueryString('comment');
        var parent_id = $.getQueryString('parent_id');
        if(comment==0){
            $("#anonymous_personnel").hide();
        }else{
            $("#system_personnel").show();
            $("#anonymous_personnel").show()
        };
        /* 获取署名的那个接口 */
        $.ajax({
            url: "<%=basePath%>news/getUser",
            type:'get',
            dataType:"JSON",
            success:function(data){
                $("#operation1_name").html(data.object.userName)
            },
            error:function(e){
                console.log(e);
            }
        });
        // 发表评论
        $("#determine").on("click",function(){
//            alert(nid);
//            alert($("#operation1_name").html());
            var data = {
                'news_id':nid, //新闻ID
                "content": $("#add_text").val(),  // 评论/回复内容
                "user_id": $("#operation1_name").html(),  //  发表评论/回复的用户
                "nick_name": $("#personnel_nm").val(),   //  昵称
                "parent_id":parent_id
            };
            $.ajax({
                url: "<%=basePath%>news/AddNewsComment",
                type:'post',
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

        });





    })




</script>


</html>
