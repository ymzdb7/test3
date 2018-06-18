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
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <script src="/js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js"></script>
    <script src="/js/base/base.js"></script>
    <title>学生管理</title>
    <style>
        html,
        body,
        .wrap{
            width:100%;
            height:100%;
            /* overflow: hidden;*/
        }


        #cont_left::-webkit-scrollbar {
            width: 0px;
        }

        #cont_left::-webkit-scrollbar-corner {
            /*background: #82AFFF;*/
        }

        .head_rig h1 {
            float: left;
            margin-right:20px;
        }

        .cont {
            width: 102%;
            height: 95%;
            overflow-y: scroll;
        }
        .head {
            border-bottom: 1px solid #dedede;
            height: 45px;
        }
        .head_rig h1 :hover {
            cursor: pointer;
        }
        .search h1 :hover {
            cursor: pointer;
        }
        .new_excell_info_other span {
            margin-left: 10px;
            color: black;
        }

        .new_excell_info_other li {
            height: 50%;
            line-height: 24px;
            font-size: 20px;
        }

        user agent stylesheet
        li {
            display: list-item;
            text-align: -webkit-match-parent;
        }
        select {

            height: 32px;
            width: 220px;
            border-radius: 4px;
            border: 1px solid #cccccc;
            background-color: #ffffff;
        }

        .f_field_ctrl input {
            color: #000;
        }
        .layui-layer-page .layui-layer-btn {
            padding-top: 10px;
            text-align: center;
        }
        dpetWhole0 li{white-space: nowrap;}

        #deptName{
            margin-left: 75px;
            font-size: 14px;
            color: black;
            margin-top: 20px;
        }
        .grade{
            height:35px;
            line-height:35px;
            padding:14px;
            cursor:pointer;
        }
        .home{
            vertical-align:middle;
            width: 15px;
            margin-right: 10px;
            margin-left: 15px;
        }
        .gd0{
            font-size:14px;
        }
        .banJi{
            padding-left: 40px;
            /*height: 35px;*/
            line-height: 35px;
        }
        .banImg{
            margin-left: 12px;
            width: 8px;
            height: 14px;
            margin-top: -3px;
            margin-right: 4px;

        }
        .users{
            line-height:40px;
            margin-left:20px;
            font-size:14px;
        }
        .users img{
            width:30px;
            height:30px;
            margin-right:5px;
        }
        .head_left div{
            font-size: 22px;
            height: 100%;
            line-height: 50px;
            text-align: left;
            display: inline-block;
            width: 227px;
        }
        .dept_li:hover{
            background:powderblue
        }
        .msg{
            width:300px;
            height:100px;
            text-align:center;
            line-height:100px;
            margin:30px auto;
            background:#2F8AE3;
            font-size:20px;
            border-radius:10px;
            color:#fff;
        }
    </style>
</head>
<body style="overflow:scroll;overflow-y: hidden;overflow-x:hidden;">
<%--左侧树形结构--%>
<div class="wrap" style="margin-left:0px !important;">
    <div class="head">
        <div class="head_left">
            <img style="margin:-6px 0px 0px 5px" src="../../img/edu/eduSchoolCalendar/computer.png" alt="">
            <div>学生及家长管理</div>
        </div>
    </div>

    <div class="cont">
        <div class="cont_left" id="cont_left" style="float:left">
            <ul>
                <li class="liDown dept_li" id="student_list" drop="false"><img src="../../img/edu/eduSchoolCalendar/icon_sectorList.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="">学生及家长管理</li>
                <li class="pick" style="display: block;margin-top:-1px">  <%--//里面保存年级--%>
                </li>
                <li class="liDown dept_li" id="see"  drop="false"><img src="../../img/edu/eduSchoolCalendar/see.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="">学生及家长信息查询或导出</li>
                <li class="liDown dept_li" id="import"  drop="false"><img src="../../img/edu/eduSchoolCalendar/import.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="">学生及家长导入</li>
                <li class="liDown dept_li" id="up"  drop="false"><img src="../../img/edu/eduSchoolCalendar/up.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="">学生升级</li>
            </ul>
        </div>
        <div class="cont_rig" style="width:80%;height:100%;float:right">
            <iframe id="iframe" style="width: 100%;height:90%" src="/edu/student/eduStudentSearch" frameborder="0"></iframe>

            <div class="msg" style="display:none">
                您已经升级过！
            </div>
        </div>

    </div>
</div>


</body>
<script type="text/javascript">
    <%--刷新页面--%>
    function refresh(){
        window.location.reload();
    }

    <%--点击查询跳转页面--%>
    $('#see').click(function(){
        document.getElementById("iframe").src='/edu/student/eduStudentSearch';
        $('#iframe').show();
        $('.msg').hide();
    })

//    点击导入页面跳转
    $('#import').click(function(){
        document.getElementById("iframe").src='/edu/student/importStudent';
        $('#iframe').show();
        $('.msg').hide();
    })

    $('#up').click(function(){
       $('#iframe').hide();
       $('.msg').show();
    })


<%--点击学生信息--%>
        $('#student_list').click(function () {
            $('#iframe').show();
            $('.msg').hide();
            var that=$(this);
//            $('.pick').empty();
            if(that.attr('drop')=="false"){
                that.attr('drop','true');

                var str="";
                $.ajax({
                    url:'/edu/student/getGrade',
                    type:'get',
                    dataType:'json',
                    success:function(data){
                        var datas=data.obj;
                        for(i=0;i<datas.length;i++){
                            str=' <li class="nianJi" id="'+datas[i].deptId+'" drop="false"> ' +
                                '<span  class="grade" > ' +
                                '<img class="home" src="../../img/edu/eduSchoolCalendar/icon_company.png" alt=""> ' +
                                '<span class="gd0">'+datas[i].deptName+'</span> ' +
                                '</span> ' +
                                '<ul class="saveBan" >'+ <%--//里面放班级--%>

                                '</ul> ' +
                                '</li>';
                            $('.pick').append(str);
                        }
                    }
                })
            }else{
                that.attr('drop','false');
                $('.pick').empty();
            }

        })
//点击年级
$('.pick').on('click','.nianJi',function(e){
    var me=$(this);
    var title=me.find('.gd0').html();
    var gradeId=me.attr('id');
    var classname='nianJi';
    document.getElementById('iframe').src='/edu/student/eduStudentList?title='+encodeURI(title)+'&gradeId='+gradeId+'&classname='+encodeURI(classname);
    if(me.attr('drop')=="false"){
        me.attr('drop','true');
        var sId=me.attr('id');
        e.stopPropagation();
        $.ajax({
            url:'/edu/student/getClassByDeptId',
            type:'get',
            dataType:'json',
            data:{"deptId":sId},
            success:function (date) {
                var data=date.obj;
                for(i=0;i<data.length;i++){
                    var str=' <li class="banJi"  id="'+data[i].deptId+'" drop="false"> ' +
                        '<span class="ban"> ' +
                        '<img class="banImg" src="/img/commonTheme/${sessionScope.InterfaceModel}/dapt_right.png" alt=""> ' +
                        '<span class="gd0">'+data[i].deptName+'</span> ' +
                        '</span> ' +
                        '<ul class="saveUser">'+ <%--//里面保存人员--%>
                        '</ul>' +
                        '</li> ' ;
                    me.find('.saveBan').append(str);
                }

            }
        })
    }else{

        me.attr('drop','false');

        me.find('.saveBan').empty();
    }


})
//点击班级
$('.pick').on('click','.banJi',function(e){
    var she=$(this);
    e.stopPropagation();
    var classId=she.attr('id');
    title=she.find('.gd0').html();
    var grade=she.parent().siblings().find('.gd0').html();
    var classname='banJi'
    document.getElementById('iframe').src='/edu/student/eduStudentList?title='+encodeURI(title)+'&classId='+classId+'&classname='+classname+'&grade='+encodeURI(grade);
    if(she.attr('drop')=="false"){
        she.attr('drop','true');
        she.find('.banImg').attr('src','/img/edu/eduSchoolCalendar/dapt_down.png')
        she.find('.banImg').css({"width":"14px","height":"9px"})
        var sId=she.attr('id');
        $.ajax({
            url:'/edu/student/getUserByDeptId',
            type:'get',
            dataType:'json',
            data:{"deptId":sId},
            success:function(reg){

                var data=reg.obj;
                for(i=0;i<data.length;i++){
                    var str='<li class="users" id="'+data[i].uid+'"><img src="'+function(){
                        if(data[i].sex==0){
                            return '../../img/user/boy.png'
                        }else{
                            return '../../img/user/girl.png'
                        }
                        }()+'" alt=""><span>'+data[i].userName+'</span></li>';
                    she.find('.saveUser').append(str);
                }
            }
        })
    }else{
        she.find('.banImg').attr('src','//img/commonTheme/${sessionScope.InterfaceModel}/dapt_right.png')
        she.find('.banImg').css({"width":"8px","height":"14px"})
        she.attr('drop','false');
        she.find('.saveUser').empty();
    }


})

// 点击学生
$('.pick').on('click','.users',function(e){
    e.stopPropagation();
    var sId=$(this).attr('id');
    document.cookie='editId='+sId;
    var classId=$(this).parents('.banJi').attr('id');
    var title=$(this).parents('.banJi').find('.gd0').html();
    document.getElementById("iframe").src='/edu/student/editStudent?classId='+classId+"&title="+encodeURI(title);
})












</script>

</html>
