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
<head>
    <meta charset="UTF-8">
    <title><fmt:message code="global.lang.deptuser" /></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
    <link rel="stylesheet" type="text/css" href="../../css/sys/userManagement.css"/>
    <link rel="stylesheet" type="text/css" href="../../css/base.css"/>
    <style>
        .content .left {
            width: 19%;
            border-right: 1px solid #c0c0c0!important;
        }
        .colorRed td{
            color: red!important;
        }
        .colorddd td{
            color: #999!important;
        }
        .content .left .collect .liUp:first-of-type{
            border-top:none!important;
        }
        #btn{
            line-height: 28px;
        }
        table  tr td{
            text-align: center;
        }
        #btn {
            line-height: 28px;
            float: right;
            margin-right: 12px;
            margin-top:4px;
            margin-left:0px;
            border:none;
        }
        body{
            background-color: #fff;
        }
        .content .left{
            overflow-x:auto;
            width: 19%;
            border-right: 1px solid #c0c0c0!important;
            background-color: #f5f7f8;

        }

        #downChild .firsttr{
            height: 10px;
        }
        #downChild .dpetWhole0 .childdept{
            padding-left: 60px!important;
        }
        #downChild .dpetWhole0 ul .childdept{
            padding-left: 80px!important;
        }
        #downChild .dpetWhole0 ul ul li .childdept{
            padding-left: 95px!important;
        }
        .dynatree-title{
            font-size: 14px;
            color: #666!important;
        }
        /*.pickCompany{*/
            /*margin-bottom: 30px;*/
        /*}*/
        .tab table {
            white-space: nowrap;
            word-break: keep-all;
        }
    </style>
    <script src="../../js/jquery/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/jquery/jquery.cookie.js"></script>
</head>
<body>
<div class="content clearfix">
    <input type="hidden" name="hiddenDept">
    <div class="headDiv">
        <div class="div_Img">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/classifyUserManager.png" style="vertical-align: middle;" alt="用户管理-管理范围（全体）">
        </div>
        <div class="divP"><fmt:message code="global.lang.deptuser" /></div>
    </div>
    <div class="left">
        <div class="collect">
            <div id="incum" class="divUP">
                <span class="spanUP liUp AUP"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_inservicsPersonnel.png" style="vertical-align: middle;width: 15px;margin-right: 10px;" alt="在职人员"><fmt:message code="userManagement.th.In-servicePersonnel" /></span>
                <div id="downChild">
                    <div class="pickCompany"><div style="padding-left: 16px;margin-top: 8px;" class="childdept"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left: 13px;margin-bottom: 4px;"><a href="javascript:void(0)" class="dynatree-title" title=""></a></div></div>

                </div>
            </div>
        </div>
    </div>
    <div class="right" style="display: block">
        <div class="header">
            <span class="USER"><fmt:message code="userManagement.th.NewUser" /></span><span class="post newDept"></span>
            <input type="button" class="new_liucheng" name="btn" id="btn" value="<fmt:message code="userManagement.th.NewUser" />" /><span class="newroletwo">(<span></span><input type="hidden">)</span>
        </div>
        <div class="title">
            <span class="USER"><fmt:message code="main.usermanage" /></span><span class="post currentDept"></span>
            <select name="allUser" id="allSelUser">
                <option value=""><fmt:message code="userManagement.th.AllUser" /></option>
                <option value="0"><fmt:message code="userManagement.th.AllowIogonUser" /></option>
                <option value="1"><fmt:message code="userManagement.th.NoIogonUser" /></option>
            </select>
            <span class="explain"><fmt:message code="userManagement.th.Explanation" /></span>
        </div>
        <div class="tab">
            <table cellspacing="0" cellpadding="0" style="border-collapse:collapse;">
                <tr class='tr_befor'>
                    <th width="4%">

                    </th>
                    <th width="8%"><fmt:message code="userName" /></th>
                    <th width="8%"><fmt:message code="userManagement.th.Realname" /></th>
                    <th width="8%"><fmt:message code="userManagement.th.department" /></th>
                    <th width="8%"><fmt:message code="userManagement.th.Scheduling" /></th>
                    <th width="14%"><fmt:message code="userManagement.th.role" /></th>
                    <th width="8%"><fmt:message code="userManagement.th.ManagementScope" /></th>
                    <th width="18%"><fmt:message code="userManagement.th.LastAccess" /></th>
                    <th width="8%"><fmt:message code="userManagement.th.idle" /></th>
                    <th width="16%"><fmt:message code="notice.th.operation" /></th>
                </tr>

            </table>
        </div>
        <div class="bottom w clearfix">
            <div class="checkALL">
                <input id="checkedAll" type="checkbox" name="" value="" >
                <label for="checkedAll" style="font-size: 14px;"><fmt:message code="notice.th.allchose" /></label>
            </div>
            <div class="boto">
                <a class="ONE" href="javascript:void(0)"><span><fmt:message code="global.lang.delete" /></span></a>
            </div>
            <div class="boto">
                <a class="TWO" href="javascript:void(0)"><span><fmt:message code="userManagement.th.Emptylong" /></span></a>
            </div>
            <div class="boto">
                <a class="THREE" href="javascript:void(0)"><span><fmt:message code="userManagement.th.Emptypassword" /></span></a>
            </div>
            <div class="boto">
                <a class="FOUR" href="javascript:void(0)"><span><fmt:message code="userManangement.th.Nologin" /></span></a>
            </div>
            <%--<div class="boto">
                <a class="FIVE" href="javascript:void(0)"><span><fmt:message code="userManagement.th.Remind" /></span></a>
            </div>--%>
            <div class="boto">
                <a class="SIX" href="javascript:void(0)"><span><fmt:message code="userManagement.th.BatchExchangeDepartment" /></span></a>
            </div>

        </div>
    </div>
    <div class="rightMain clearfix" style="background:#fff;display: none">
        <iframe src="../../user/goQueryExportUsers" frameborder="0">

        </iframe>
    </div>
</div>
<script type="text/javascript">


    $('.left').height($(document).height()-46)
    var userstr;
    var user_id;
    var numdept;
    function deptById(data,element){
        $('.tab').find('.userData').remove();
        $('.content .right').css("display","block");
        $('.content .rightMain').css("display","none");
        $.ajax({
            url:'/user/queryExportUsers',
            type:'get',
            dataType:'json',
            data:data,
            success:function(rsp){
                var data1=rsp.obj;
                var str='';
                for(var i=0;i<data1.length;i++){
                    var colorNum='';
                    var lastVisitTime='';
                    if(data1[i].password=='') {
                        colorNum = 'colorRed'
                    }
                    if(data1[i].notLogin==1){
                        colorNum='colorddd'
                    }
                    if(data1[i].lastVisitTime!=undefined){
                        lastVisitTime=data1[i].lastVisitTime
                    }

                    str += '<tr class="userData '+colorNum+'" uId="' + data1[i].uid + '">' +
                        '<td>'+function(){if(data1[i].byname=="admin"){
                            return ''
                        }else{
                            return '<input type="checkbox" class="checkChild" name="checkbox" value=""  style="width:13px;height:13px;" />'
                        }}()+'</td>' +
                        '<td>' + data1[i].byname + '</td>' +
                        '<td>' + data1[i].userName + '</td>' +
                        '<td data-deptid="'+data1[i].deptId+'">' + data1[i].deptName + '</td>' +
                        '<td>' + function () {
                            switch (data1[i].dutyType) {
                                case 1:
                                    return '<fmt:message code="sys.th.RegularClass" />';
                                    break;
                                case 2:
                                    return '<fmt:message code="sys.th.Whole-day" />';
                                    break;
                                case 99:
                                    return '<fmt:message code="sys.th.ShiftSystem" />';
                                    break;
                            }

                        }() + '</td>' +
                        '<td>' + data1[i].userPrivName + '</td>' +
                        '<td>' +function () {
                            switch (parseInt(data1[i].postPriv)) {
                                case 1:
                                    return '<fmt:message code="url.th.all" />';
                                    break
                                case 2:
                                    return '<fmt:message code="sys.th.DesignatedDepartment" />';
                                    break
                                case 0:
                                    return '<fmt:message code="sys.th.ThisDepartment" />';
                                    break
                            }

                        }()  + '</td>' +
                        '<td>' + lastVisitTime + '</td>' +
                        '<td>' + data1[i].idleTime + '</td>' +
                        '<td>'+function(){
                            if(data1[i].byname=='admin'){
                                return '';
                            }else{
                                return '<a href="javascript:void(0)" onclick="clickrenwu('+data1[i].uid+',this)" style="margin-right: 5px;"><fmt:message code="global.lang.edit" /></a>'
                            }
                        }()+'</td>' +
                        '</tr>';  //<a href="javascript:;">
                    <%--<fmt:message code="userManagement.th.MenuAauthority" />--%>
                    //</a>:菜单权限查看

                }

                element.after(str);
                $('.userData').click(function(){
                    var inCh=$(this).find('.checkChild').prop('checked');
                    if(inCh == true){
                        $(this).find('.checkChild').prop('checked',true);
                        $(this).addClass('bgColor');
                    }else{
                        $('#checkedAll').prop('checked',false);
                        $(this).find('.checkChild').prop('checked',false);
                        $(this).removeClass('bgColor');
                    }
                    var child = $(".checkChild");
                    for(var i=0;i<child.length;i++){
                        var childstate= $(child[i]).prop("checked");
                        if(inCh!=childstate){
                            return
                        }
                    }
                    $('#checkedAll').prop("checked",inCh);
                })
            }
        })
    }
    function ajaxdata (depeId,me) {
        deptById({'deptId':depeId,'notLogin':$('#allSelUser').val()},$('.tr_befor'))
    }


    function clickrenwu(deptId,me) {
        userstr=$(me).text();
        $.popWindow('../../addUsers?'+deptId,'<fmt:message code="sys.th.EditUser" />','0','0','800px','600px');
    }

    $(function () {
        loadSidebar1($('#downChild'),0)
        function loadSidebar1(target,deptId) {
            console.log(deptId);
            $.ajax({
                url: '/department/getChDeptfq',
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {
                    var str = '';
                    data.obj.forEach(function (v, i) {
                        if(v.deptNo.length==3 || v.deptNo.length==6) {
                            var admin = v.classifyOrgAdmin;
                            if (v.classifyOrg == 1 && admin != 'undefined') {
                                if (admin.indexOf("," + $.cookie("uid") + ",") >= 0 || admin.indexOf($.cookie("uid") + ",") >= 0) {
                                    if (v.deptName) {
                                        str += '<li><span data-types="1"  data-numtrue="1" ' +
                                            'onclick= "imgDown(' +v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 30px" deptid="' + v.deptId + '" class="firsttr childdept"><span class=""></span><img src="/img/sys/dapt_right.png" alt="" style="margin-left: 12px;width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                                    }
                                }
                            }
                        }

                    })
                    widthnum++;
                    target.append(str);
                }
            })
        }
        $.ajax({
            url:'/sys/showUnitManage',
            type:'get',
            dataType:"JSON",
            data : '',
            success:function(obj){
                console.log(obj);
                var data = obj.object.unitName;
                $('#downChild .pickCompany .dynatree-title').text(data).attr('title',data);

            },
            error:function(e){
                console.log(e);
            }
        })


        $('.rightMain ').height($(document).height()-46);


        $(document).delegate('.childdept','click',function(){
            $('.newroletwo').children('span').text($(this).children('a').text());
            $('.newroletwo').children('input').val($(this).attr('deptid'))
        })
        $('#btn').click(function(){
            <%--userstr=$('.newroletwo').find('span').text();--%>
            <%--if(userstr==''){--%>
            <%--$.layerMsg({content:'<fmt:message code="sys.th.DepartmentFirst" />',icon:2});--%>
            <%--return--%>
            <%--}--%>
            numdept=$('.newroletwo').find('input').val();
            $.popWindow('../../addUsers?0','<fmt:message code="userManagement.th.NewUser" />','0','0','800px','600px');
        });

        $('#allSelUser ').on('change',function () {

            var deptId= 0 ;
            var deptIdDom = $('.collect .add_back').attr('deptid');
            if(deptIdDom!=undefined&&deptIdDom!=''&&deptIdDom!='undefined'){
                deptId = deptIdDom;
            }
            var data={
                'deptId':deptId,
                'notLogin':$(this).val()
            };

            if($(this).val()==''){
                delete data.notLogin;
            }

            deptById(data,$('.tr_befor'))

        });

//        init()
//        getChDept($('#ULDown'),30);
        $('.AUP').click(function(){
            //$('#ulList').slideToggle();
            if($('#downChild').css('display')=='block'){
                $(this).addClass('liUp').removeClass('liDown');
                $('#downChild').slideUp();
            }else{
                $(this).addClass('liDown').removeClass('liUp');
                $('#downChild').slideDown();
            }
        });
        $('.proceed').click(function () {
            $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:6})
        });

        $('.employee').click(function () {
            var data={
                'deptId':0,
                'notLogin':$('#allSelUser').val()
            };
            deptById(data,$('.tr_befor'));
        });

        // 查询新增用户
        $('.newUsers').click(function(){
            $('.tab').find('.userData').remove();
            $('.content .right').css("display","block");
            $('.content .rightMain').css("display","none");
            $.ajax({
                url:'../user/getNewUsers',
                type:'get',
                dataType:'json',
                success:function(rsp){
                    var data1=rsp.obj;
                    console.log(data1);
                    var str='';
                    for(var i=0;i<data1.length;i++){
                        var colorNum='';
                        var lastVisitTime=''
                        if(data1[i].password=='') {
                            colorNum = 'colorRed'
                        }
                        if(data1[i].notLogin==1){
                            colorNum='colorddd'
                        }
                        if(data1[i].lastVisitTime!=undefined){
                            lastVisitTime=data1[i].lastVisitTime
                        }

                        str += '<tr class="userData '+colorNum+'" uId="' + data1[i].uid + '">' +
                            '<td><input type="checkbox" class="checkChild" name="checkbox" value="" style="width:13px;height:13px;" /></td>' +
                            '<td>' + data1[i].byname + '</td>' +
                            '<td>' + data1[i].userName + '</td>' +
                            '<td data-deptid="'+data1[i].deptId+'">' + data1[i].deptName + '</td>' +
                            '<td>' + function () {
                                switch (data1[i].dutyType) {
                                    case 1:
                                        return '<fmt:message code="sys.th.RegularClass" />';
                                        break
                                    case 2:
                                        return '<fmt:message code="sys.th.Whole-day" />';
                                        break
                                    case 99:
                                        return '<fmt:message code="sys.th.ShiftSystem" />';
                                        break
                                }

                            }() + '</td>' +
                            '<td>' + data1[i].userPrivName + '</td>' +
                            '<td>' +function () {
                                switch (parseInt(data1[i].postPriv)) {
                                    case 1:
                                        return '<fmt:message code="url.th.all" />';
                                        break
                                    case 2:
                                        return '<fmt:message code="sys.th.DesignatedDepartment" />';
                                        break
                                    case 0:
                                        return '<fmt:message code="sys.th.ThisDepartment" />';
                                        break
                                }

                            }()  + '</td>' +
                            '<td>' + lastVisitTime + '</td>' +
                            '<td>' + data1[i].idleTime + '</td>' +
                            '<td><a href="javascript:void(0)" onclick="clickrenwu('+data1[i].uid+',this)" style="margin-right: 5px;"><fmt:message code="global.lang.edit" /></a></td>' +
                            '</tr>';  //<a href="javascript:;">
                        <%--<fmt:message code="userManagement.th.MenuAauthority" />--%>
                        //</a>:菜单权限查看

                    }

                    $('.tr_befor').after(str);
                    $('.userData').click(function(){
                        var inCh=$(this).find('.checkChild').prop('checked');
                        if(inCh == true){
                            $(this).find('.checkChild').prop('checked',true);
                            $(this).addClass('bgColor');
                        }else{
                            $('#checkedAll').prop('checked',false);
                            $(this).find('.checkChild').prop('checked',false);
                            $(this).removeClass('bgColor');
                        }
                        var child = $(".checkChild");
                        for(var i=0;i<child.length;i++){
                            var childstate= $(child[i]).prop("checked");
                            if(inCh!=childstate){
                                return
                            }
                        }
                        $('#checkedAll').prop("checked",inCh);
                    })
                }
            })
        })
        // 查询和导出
        $('.queryExport').click(function () {
            $('.content .right').css("display","none");
            $('.rightMain').css("display","block");
            $('.rightMain iframe').attr("src","../user/goQueryExportUsers");
        });
        // 导入
        $('.import').click(function () {
            $('.content .right').css("display","none");
            $('.rightMain').css("display","block");
            $('.rightMain iframe').attr("src","../user/goImportUsers");
        });
        // 批量设置
        $('.editUserBatch').click(function () {
            $('.content .right').css("display","none");
            $('.rightMain').css("display","block");
            $('.rightMain iframe').attr("src","../user/goEditUserBatch");
        });

//        //部门人员情况列表
//        $('#ULDown').on('click','.childdept',function(){
//            var  that = $(this);
//            var deptid=that.attr('deptid');
//            var deName=that.attr('Name');
//            var val=$('#allSelUser option:checked').val();
//            $('.childdept').removeClass('on');
//            that.addClass('on')
//            getChDept(that.next(),deptid);
//            that.next().slideToggle();
//            var data={
//                'deptId':deptid,
//                'notLogin':val
//            }
//            $('.newDept').text('（'+deName+'）');
//            $('.currentDept').text('（'+deName+'）');
//            deptById(data,$('.tr_befor'));
//        })

        //全选点击事件
        $('#checkedAll').click(function(){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
                $(".checkChild").prop("checked",true);
                $(".userData").addClass('bgcolor');
            }else{
                $(this).prop("checked",false);
                $(".checkChild").prop("checked",false);
                $('.userData').removeClass('bgcolor');
            }
        })

        //删除人员按钮
        $('.ONE').click(function(){
            if($('.tab table input[type="checkbox"]:checked').length==0){
                $.layerMsg({content:'<fmt:message code="sys.th.PleaseFirst" />',icon:1})
                return
            }
            buttonInterface('../user/deleteUser','<fmt:message code="sys.th.MakeSureDelete" />？');
        })
        //清空在线时长按钮
        $('.TWO').click(function(){
            if($('.tab table input[type="checkbox"]:checked').length==0){
                $.layerMsg({content:'<fmt:message code="sys.th.PleaseFirst" />',icon:1})
                return
            }
            buttonInterface('../user/clearOnLine','<fmt:message code="sys.th.MakeSureEmpty" />？');
        })
        //清空密码按钮
        $('.THREE').click(function(){
            if($('.tab table input[type="checkbox"]:checked').length==0){
                $.layerMsg({content:'<fmt:message code="sys.th.PleaseFirst" />',icon:1})
                return
            }
            buttonInterface('../user/clearPassword','<fmt:message code="sys.th.VerifyPassword" />？');
        })
        //禁止登录按钮
        $('.FOUR').click(function(){
            if($('.tab table input[type="checkbox"]:checked').length==0){
                $.layerMsg({content:'<fmt:message code="sys.th.PleaseFirst" />',icon:1})
                return
            }
            buttonInterface('../user/setNotLogin','<fmt:message code="sys.th.MakeSure" />？');
        })
        // 提醒空密码用户按钮
        $('.FIVE').click(function(){
            $.layerMsg({content:'<fmt:message code="lang.th.Upcoming" />',icon:1})
            return
        })
        // 批量修改部门按钮
        $('.SIX').click(function(){
            if($('.tab table input[type="checkbox"]:checked').length==0){
                $.layerMsg({content:'<fmt:message code="sys.th.PleaseFirst" />',icon:1})
                return
            }
            layer.open({
                title:'<fmt:message code="sys.th.BatchModification" />',
                content:'<div>' +
                '<table>' +
                '<tr><td style="border-right: 1px solid #ddd"><fmt:message code="main.usermanage" />:</td><td><textarea style="margin-right: 10px;" name="" id="textareaopen"></textarea><a href="javascript:void(0)" class="addopens"><fmt:message code="global.lang.add" /></a></td></tr>' +
                '<tr><td style="border-right: 1px solid #ddd"><fmt:message code="sys.th.NewSector" />:</td><td><select style="width: 139px;margin-left: -28px;" name="" id="newselectrrole"></select></td></tr>' +
                '<tr><td style="border-right: 1px solid #ddd"><fmt:message code="sys.th.ReminderDepartment" />:</td><td><label style="margin-right: 10px;"><input name="checktit" type="checkbox"><fmt:message code="notice.th.remindermessage" /></label>' +
                '<label><input name="checktit" type="checkbox"><fmt:message code="sys.th.SendReminderMessage" /></label></td></tr></table></div>',
                area:['500px','300px'],
                btn:['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'],
                yes:function (index) {

                    var obj={
                        'deptId':$('#newselectrrole').val(),
                        'uids':$('#textareaopen').attr('user_id')

                    }
                    $.post('/user/editUsersDeptId',obj,function (json) {
                        if(json.flag){
                            $.layerMsg({content:'<fmt:message code="sys.th.SwapComplete" />',icon:1},function () {
                                location.reload()
                            })
                        }
                    },'json')
                },
                success:function () {
                    $('#newselectrrole').deptSelect(function (me) {//me是传过来的this，newselectrrole
                        $('#newselectrrole').val($('.tab table tbody [type="checkbox"]:checked').parent().parent().find('td').eq(3).attr('data-deptid'))
                        $(me).append('<option value="0"><fmt:message code="userManagement.th.Outgoing" /></option>')
                    })
                    var strcheck='',struserId='';
                    $('.tab table tbody [type="checkbox"]:checked').each(function(){
                        strcheck+=$(this).parent().parent().find('td').eq(2).text()+',';
                        struserId+=$(this).parent().parent().find('td').eq(1).text()+',';
                    })
                    $('#textareaopen').val(strcheck)
                    $('#textareaopen').attr('user_id',struserId)
                    $('.addopens').click(function(){
                        user_id=$(this).prev().prop('id')
                        $.popWindow("../common/selectUser");
                    })
                }
            })

        })


        function init(){
            $.ajax({
                url:'../department/getChDept',
                type:'get',
                data:{'deptId':20 },
                dataType:'json',
                success:function(res){
                    var data1=res.obj;
                    var str='';
                    str='<span deptid="'+data1.deptId+'" class="childdept" style="display: block;width:100%;padding:8px 0 8px 30px;font-size: 14px;"><a href="javascript:void(0)" class="dynatree-title" title="'+data1[0].deptName+'">'+data1[0].deptName+'</a></span>'
                    $('#ULDown').before(str);
                }
            })
        }

        //部门人员树状图方法
        function getChDept(element,deptId){

            $.ajax({
                url:'../department/getChDept',
                type:'get',
                data:{'deptId':deptId },
                dataType:'json',
                success:function(data){

                    if(deptId==30){
                        var str = '';
                        data.obj.forEach(function(v,i){
                            if(v.deptName){
                                str+='<li><span deptid="'+v.deptId+'" Name="'+v.deptName+'" class="childdept"><img style="margin-left: 42px;margin-right: 5px" src="../img/main_img/company_logo.png" alt=""><a href="javascript:void(0)"  class="dynatree-title" title="'+v.deptName+'">'+v.deptName+'</a></span><ul></ul></li>';
                            }else{
                                str+='<li><span deptid="'+v.deptId+'" Name="'+v.deptName+'" class="childdept"><span><img style="margin-left: 65px;margin-right: 5px" src="../img/main_img/man.png" alt=""></span><img style="margin-left: 65px;margin-right: 5px" src="../img/main_img/man.png" alt=""><a href="javascript:void(0)"  class="dynatree-title" title="'+v.userName+'">'+v.userName+'</a></span><ul></ul></li>';
                            }
                        });
                    }else{
                        var str = '';
                        data.obj.forEach(function(v,i){
                            if(v.deptName){
                                str+='<li><span deptid="'+v.deptId+'" Name="'+v.deptName+'" class="childdept"><img style="margin-left: 65px;margin-right: 5px" src="../img/main_img/company_logo.png" alt=""><a href="javascript:void(0)" data-uid="'+v.uid+'" onclick="edituser(this)" class="dynatree-title" title="'+v.deptName+'">'+v.deptName+'</a></span><ul></ul></li>';
                            }else{
                                if(v.sex==0){
                                    str+='<li><span deptid="'+v.deptId+'" Name="'+v.deptName+'" class="childdept"><img style="margin-left: 65px;margin-right: 5px" src="../img/main_img/man.png" alt=""><a href="javascript:void(0)" data-uid="'+v.uid+'" onclick="edituser(this)" class="dynatree-title" title="'+v.userName+'">'+v.userName+'</a></span><ul></ul></li>';
                                }else if(v.sex==1){
                                    str+='<li><span deptid="'+v.deptId+'" Name="'+v.deptName+'" class="childdept"><img style="margin-left: 65px;margin-right: 5px" src="../img/main_img/women.png" alt=""><a href="javascript:void(0)" data-uid="'+v.uid+'" onclick="edituser(this)" class="dynatree-title" title="'+v.userName+'">'+v.userName+'</a></span><ul></ul></li>';
                                }
                            }

                        });
                    }
                    element.html(str);

                }
            })
        }

        //人员列表展示


        //列表功能按钮
        function buttonInterface(URL,txt) {
            var deptid = $('.collect .add_back').attr('deptid');
            var val = $('#allSelUser option:checked').val();

            var string = '';
            $('.tab table input[type="checkbox"]:checked').each(function (i, n) {
                string += $(this).parent().parent().attr('uId') + ',';
            })
//           var str=string.split("").join(",");
            var msg = txt;

            $.layerConfirm({title: msg, content: msg, icon: 0}, function () {
                $.ajax({
                    type: 'post',
                    url: URL,
                    dataType: 'json',
                    data: {'uids': string},
                    success: function (res) {
//                        console.log(res.flag);
//                        deptById(data,$('.tr_befor'));
                        deptById({'deptId': deptid, 'notLogin': $('#allSelUser').val()}, $('.tr_befor'))
                        /*location.reload()*/
                    }
                })
            })

        }


        $.extend({
            loadSidebar: function (target, deptId, fn) {
                /*if(deptId==0){
                    $.ajax({
                        url: '/hierarchical/getClassifyOrgByAdmin',
                        type: 'get',
                        dataType: 'json',
                        data: {
                            deptId: deptId
                        },
                        success: function (data){
                            var str = '';
                            data.obj.forEach(function (v, i) {
                                if (v.deptName) {
                                    str += '<li><span data-types="1"  data-numtrue="1" ' +
                                        'onclick= "imgDown(' + v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span><img src="/img/spirit/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left:15px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                                }
                            })
                            widthnum++;
                            target.html(str);
                            if (fn != undefined) {
                                fn($(target).find('.dpetWhole0'))
                            }
                        }
                    })
                    return;
                }*/
                $.ajax({
                    url: '/department/getChDeptfq',
                    type: 'get',
                    data: {
                        deptId: deptId
                    },
                    dataType: 'json',
                    success: function (data) {
                       if(deptId == 0){
                            var str = '';
                            data.obj.forEach(function (v, i) {
                                var str = '';
                                var strtwo='';
                                data.obj.forEach(function (v, i) {
                                    var admin=v.classifyOrgAdmin;
                                    if(v.classifyOrg==1  && admin!='undefined') {
                                        if(admin.indexOf(","+$.cookie("uid")+",")>=0 || admin.indexOf($.cookie("uid")+",")>=0){
                                            if (v.deptName) {
                                                str += '<li><span data-types="1"  data-numtrue="1" ' +
                                                    'onclick= "imgDown(' + v.deptId + ',this)" ' +
                                                    ' style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" ' +
                                                    'class="childdept"><span class=""></span><img src="/img/sys/dapt_right.png" alt="" style="    ' +
                                                    'width: 8px;height: 14px;margin-top: -3px;margin-right: 4px;"><a href="javascript:void(0)" ' +
                                                    'class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a>' +
                                                    '</span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                                            }
                                        }
                                    }

                                })
                            })
                            widthnum++;
                            target.html(str);
                            if (fn != undefined) {
                                fn($(target).find('.dpetWhole0'))
                            }


                        }else {
                           var str = '';
                           var strtwo='';
                           var numss=0;
                           data.obj.forEach(function (v, i) {
                               var targetnum = parseInt($(target).prev().attr('data-numtrue'))
                               var admin=v.classifyOrgAdmin;
                               if (v.classifyOrg == 1 && admin!='undefined') {
                                   if(admin.indexOf(","+$.cookie("uid")+",")>=0 || admin.indexOf($.cookie("uid")+",")>=0){
                                       if (v.deptName && v.isHaveCh == 1) {
                                           str += '<li><span  onclick= "imgDown(' + v.deptId + ',this)" data-numString="2" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '"  style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img id="img' + v.deptId + '" src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                       } else {
                                           str += '<li><span onclick="imgDown(' + v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '" style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img  src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                       }
                                   }
                               }else {
                                   if (v.deptName && v.isHaveCh == 1) {
                                       numss++;
                                       strtwo += '<li><span  onclick= "imgDown(' + v.deptId + ',this)" data-numString="2" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '"  style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img id="img' + v.deptId + '" src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                   } else {
                                       numss++;
                                       strtwo += '<li><span onclick="imgDown(' + v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="' + (targetnum + 1) + '" style="padding-left:' + (20 + (20 * parseInt($(target).prev().attr('data-numtrue')))) + 'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img  src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                                   }
                               }

                           });
                           widthnum++
                           if(numss==data.obj.length){
                               target.html(strtwo);
                           }else {
                               target.html(str);
                           }
                            if (fn != undefined) {
                                fn()
                            }
                        }

                    }
                })
            },
            loadrole:function (target,teptId,num,fn) {
                $.ajax({
                    url: employeeUrl,
                    type: 'get',
                    data: {
                        deptId: teptId
                    },
                    dataType: 'json',
                    success: function (data) {
                        if(!data.flag){
                            return
                        }
                        var str='';
                        var arr=[];
                        if($(target).find('li').length==0) {
                            for (var i = 0; i < data.object.length; i++) {
                                str += '<li><span onclick="clickrenwu(' + data.object[i].uid + ',this)" data-uid="' + data.object[i].uid + '" data-numString="1"  style="padding-left:' + (20+20*parseInt(num)) + 'px;height:35px;line-height:35px;"  class="childdept"><span></span>' +
                                    '<img  src="'+function () {
                                        if(data.object[i].avatar==0){
                                            return '/img/email/icon_head_man_06.png'
                                        }else if(data.object[i].avatar==1){
                                            return '/img/email/icon_head_woman_06.png'
                                        }else {
                                            return '/img/user/'+data.object[i].avatar
                                        }
                                    }()+'" style="width: 20px;height:20px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + data.object[i].userName + '">' + data.object[i].userName + '</a></span></li>';

                            }
                            $(target).html(str);
                        }else {
                            $(target).find('li').each(function (m, b) {
                                for (var i = 0; i < data.object.length; i++) {
                                    if ( $($(target).find('li')[i]).children('span').attr('data-uid')!= data.object[i].uid) {
                                        str = '<li><span onclick="clickrenwu(' + data.object[i].uid + ',this)" data-uid="' + data.object[i].uid + '" data-numString="1"  style="padding-left:' + (20+20*parseInt(num) ) + 'px;height:35px;line-height:35px;"  class="childdept"><span></span>' +
                                            '<img  src="'+function () {
                                                if(data.object[i].avatar==0){
                                                    return '/img/email/icon_head_man_06.png'
                                                }else if(data.object[i].avatar==1){
                                                    return '/img/email/icon_head_woman_06.png'
                                                }else {
                                                    return '/img/user/'+data.object[i].avatar
                                                }
                                            }()+'" style="width: 20px;height:20px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + data.object[i].userName + '">' + data.object[i].userName + '</a></span></li>';
                                        $(target).append(str)
                                    }
                                }
                                return false
                            })
                        }

                    }
                })
            }

        })



      /*  $.loadSidebar($('#downChild'),0,function (el) {
//            $.loadSidebar(el,30)
        });*/
    })
</script>
</body>
</html>
