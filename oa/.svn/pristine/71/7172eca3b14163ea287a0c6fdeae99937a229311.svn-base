<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/8/1
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><fmt:message code="workflow.th.privilege" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/workflow/flowsetting/style.css">
    <script src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
</head>
<body>
<div class="cont_r" style="margin-left: 0px;">
    <div class="item_s item_con">
        <table class="table" cellspacing="0" id="table_power">
            <caption class="clearfix">
                <img style="margin-right: 10px;width: 18px;padding-left: 15px;float: left;" src="/img/workflow/flowsetting/flowSettingMain/guanliquanxian.png"  alt="">

                <span class="priv_t"><fmt:message code="workflow.th.privilege" /></span>
                <a href="javascript:void (0)" class="new_liucheng newAndeEdit" id="new"><fmt:message code="global.lang.new" /></a>
                <a href="javascript:void (0)" id="deleteAll"></a>
            </caption>
            <thead>
                <tr>
                    <th><fmt:message code="sms.th.Button" /></th>
                    <th><fmt:message code="workflow.th.PrivilegeType" /></th>
                    <th><fmt:message code="doc.th.ScopeAuthorization" /></th>
                    <th><fmt:message code="userManagement.th.ManagementScope" /></th>
                    <th><fmt:message code="notice.th.operation" /></th>
                </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
<script>
    var priv_type = ['<fmt:message code="main.th.manage" />', '<fmt:message code="workflow.th.Monitor" />', '<fmt:message code="global.lang.query" />', '<fmt:message code="global.lang.edit" />', '<fmt:message code="workflow.th.Comment" />']
    function allPeimissions() {
        $.ajax({
            type: 'get',
            url: "/flowSetDatas/getFlowPrivList",
            dataType: "json",
            data: {
                flowId: parent.getResObj.flowId
            },
            success: function (data) {
                var datas = data.datas;
                var html=''
                if (data.flag) {
                    for (var i = 0; i < datas.length; i++) {
                        var type = (datas[i].privType) * 1;
                        var typeStr = "";
//                        if (i >= 0 && i <= 5) {
                            typeStr = priv_type[type - 1];
//                        }
                        var u_d_r_Str = "";
                        if (datas[i].userName) {
                            u_d_r_Str += "<fmt:message code="journal.th.user" />:" + datas[i].userName + "</br>";
                        }
                        if (datas[i].roleName) {
                            u_d_r_Str += "<fmt:message code="userManagement.th.role" />:" + datas[i].roleName + "</br>";
                        }
                        if (datas[i].deptName) {
                            u_d_r_Str += "<fmt:message code="userManagement.th.department" />:" + datas[i].deptName + "</br>";
                        }

                        var data_g = {};
                        data_g.dept = datas[i].dept;
                        data_g.deptName = datas[i].deptName;
                        data_g.privScopeName = datas[i].privScopeName;
                        data_g.roleName = datas[i].roleName;
                        data_g.userName = datas[i].userName;
                        data_g.privType = datas[i].privType;
                        data_g.privScope = datas[i].privScope;
                        data_g.user = datas[i].user;
                        data_g.role = datas[i].role;
                        data_g.dept = datas[i].dept;
                        data_g.privType = datas[i].privType;
                        var strdata_g = JSON.stringify(data_g);

                        html += '' +
                            '<tr>' + '' +
                            '<td style="display: none">' + datas[i].id + '</td>'
                            + '<td>' + '<input type="checkbox" privId="' + datas[i].id + '" class="one">' + '</td>' +
                            '' + '<td>' + typeStr + '</td>' + '' +
                            '<td style="text-align: center;padding-left: 10px">' + u_d_r_Str + '</td>'
                            + '<td style="text-align: center;padding-left: 10px">' + datas[i].privScopeName + '</td>' +
                            '' + '<td>' + '<a href="javascript:void(0)" class="powerUpdate fileUpdateactive newAndeEdit" data-id="1" privId="' + datas[i].id + '" >' +
                            '<input type="hidden" value=' + strdata_g + '><fmt:message code="menuSSetting.th.editMenu" /></a>' +
                            '' + '<a href="javascript:void(0)" class="delete_d del_privactive" privId="' + datas[i].id + '"><fmt:message code="menuSSetting.th.deleteMenu" /></a>' + '</td>' + '</tr>';
                    }
                }
                $('#table_power tbody').html(html);
            }
        })
    }
    allPeimissions()
    $('#table_power').delegate('.newAndeEdit','click',function () {
        var url='';
        var meTwo=this;
        if($(this).attr('data-id')==1){
            url='/flowSetDatas/updateFlowPriv'
            var privId = $(this).attr('privId')
            var data_i = $(this).find('input').val()
            var data_i = JSON.parse(data_i)
        }else {
            url='/flowSetDatas/newFlowPriv'
        }


        layer.open({
            title: '<p style="background: #2b7fe0;height: 43px;width: 100%;font-size: 16px;padding-left: 10px;color: #fff">新建</p>',
            shade: 0.3,
            content: '<div class="pop_con">' +
            '<div class="con_t">' +
            '<div class="con_l">' +
            '<div class="con_title">' +
            '<div class="title_1">' +
            '<div class="title_label"></div>' +
            '<span class="title_s"><fmt:message code="workflow.th.Authorizationype" /> <label style="color: red;">*</label></span>' +
            '<div class="title_put"><select name="" id="select_t" class="select_t"><option value="1"><fmt:message code="workflow.th.Administration" /></option><option value="2"><fmt:message code="workflow.th.Monitor" /></option><option value="3"><fmt:message code="global.lang.query" /></option><option value="4"><fmt:message code="global.lang.edit" /></option><option value="5"><fmt:message code="workflow.th.Comment" /></option></select></div></div>' +
            '<div class="title_2">' +
            '<p class="title_s" style="display:block"><fmt:message code="userManagement.th.ManagementScope" /> <label style="color: red;">*</label></p>' +

            '<select name="" id="select_ment" class="select_t">' +
            '<option value="-2"><fmt:message code="workflow.th.allpart" /></option>' +
            '<option value="-3"><fmt:message code="workflow.th.ThisBody" /></option>' +
            '<option value="-1"><fmt:message code="workflow.th.subordinateDepartment" /></option>' +
            '<option value="-1"><fmt:message code="workflow.th.ThisDepartment" /></option>' +
            '<option value="11"><fmt:message code="workflow.th.CustomDepartments" /></option>' +
            '</select></div>' +
            '<div class="title_3" id="select_mentTwo" style="display: none">' +
            '<div class="title3_label"><span class="title_s"><fmt:message code="workflow.th.CustomDepartments" /><label style="color: red;">*</label></span></div>' +
            '<div class="select_put" style="padding-left: 151px">' +
            '<textarea name="txt" id="addUserTwos" user_id="admin" value="admin" disabled=""></textarea>' +
            '<a style="margin-left: 10px;cursor: pointer" id="addSave_uTwo"><fmt:message code="global.lang.add" /></a>' +
            '<a id="clear_r" style="margin-left: 10px;cursor: pointer"></a>' +
            '</div>' +
            '</div>' +
            '<div class="title_3">' +
            '<div class="title3_label">' +
            '<span class="title_s"><fmt:message code="netdisk.th.Scope(personnel)" /></span></div>' +
            '<div class="select_put">' +
            '<textarea name="txt" id="senduser" user_id="admin" value="admin" disabled></textarea>' +
            '<a style="margin-left: 10px;cursor: pointer" id="selectUser"><fmt:message code="global.lang.add" /></a>' +
            '<a style="margin-left: 10px;cursor: pointer" class="clear_r_cTwo"><fmt:message code="global.lang.empty" /></a></div></div>' + '<div class="title_3">' +
            '<div class="title3_label">' +
            '<span class="title_s"><fmt:message code="netdisk.th.Scope(role)" /></span></div>' +
            '<div class="select_put">' +
            '<textarea name="txt" id="sendRole" user_id="admin" value="admin" disabled></textarea>' +
            '<span style="margin-left: 10px;cursor: pointer" id="selectUser_s"><fmt:message code="global.lang.add" /></span>' +
            '<span style="margin-left: 10px;cursor: pointer" class="clear_r_cTwo"><fmt:message code="global.lang.empty" /></span></div></div>' + '<div class="title_3">' +
            '<div class="title3_label">' +
            '<span class="title_s"><fmt:message code="netdisk.th.ScopeAuthorization" /></span></div>' +
            '<div class="select_put">' +
            '<textarea name="txt" id="sendept" dept_id="admin" value="admin" disabled></textarea>' +
            '<span style="margin-left: 10px;cursor: pointer" id="selectUser_t"><fmt:message code="global.lang.add" /></span>' +
            '<span style="margin-left: 10px;cursor: pointer" class="clear_r_cTwo"><fmt:message code="global.lang.empty" /></span></div></div>' +
            '</div></div></div>' +
            '</div>',
            area: ['750px', '600px'],
            btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
            scrolling: 'no',
            success: function () {
                $('.clear_r_cTwo').click(function () {
                    $(this).siblings('textarea').val('')
                    $(this).siblings('textarea').attr('dataid','')
                    $(this).siblings('textarea').attr('privid','')
                    $(this).siblings('textarea').attr('deptid','')
                })
                /*弹窗控件*/
                $("#selectUser").click(function () {
                    user_id = 'senduser';
                    $.popWindow("../common/selectUser");
                });
                $("#selectUser_t").click(function () {
                    dept_id = 'sendept';
                    $.popWindow("../common/selectDept");
                })
                $("#selectUser_s").click(function () {
                    priv_id = 'sendRole';
                    $.popWindow("../common/selectPriv");
                })
                $("#addSave_uTwo").click(function () {
                    dept_id = 'addUserTwos';
                    $.popWindow("../common/selectDept");
                })
                $('#select_ment').change(function () {
                    if($(this).val()==11){
                        $('#select_mentTwo').show()
                    }else {
                        $('#select_mentTwo').hide()
                    }
                })

                if($(meTwo).attr('data-id')==1){
//                    $("#select_t").val(data_i.privType)
                    $('#select_t').find('option').each(function (i,n) {
                        if($(this).val()==data_i.privType){
                            $(this).attr('selected','selected')
                            return false
                        }
                    })


                    var nums=null;
                    if(data_i.privScope=='SELF_ORG'){
                        nums=-3
                    }else if(data_i.privScope=='ALL_DEPT'){
                        nums=-2
                    }else {
                        nums=-1
                    }

                    $('#select_ment').find('option').each(function (i,n) {
                        if($(this).val()==nums){
                            $(this).attr('selected','selected')
                            return false
                        }
                    })

                    var privScopeNum=data_i.privScope.replace(/,/g,'')
                    if(!isNaN(privScopeNum)){
                        $($('#select_ment').find('option')[$('#select_ment').find('option').length-1]).attr('selected','selected')
                        $('#addUserTwos').attr('deptid',data_i.privScope)
                        $('#addUserTwos').val(data_i.privScopeName)
                        $('#select_mentTwo').show()
                    }



                    $('#senduser').val(data_i.userName);
                    $('#senduser').attr('dataid',data_i.user.split(',').splice(0,1).join()+',');
                    $('#sendept').val(data_i.deptName);
                    $('#sendept').attr('deptid',data_i.dept.split(',').splice(0,1).join()+',')
                    $('#sendRole').val(data_i.roleName)
                    $('#sendRole').attr('privid',data_i.role.split(',').splice(0,1).join()+',')
                }
            },
            yes: function (index) {
                if($("#senduser").attr("dataid")!=undefined || $("#sendRole").attr("privid")!=undefined ||
                    $("#sendept").attr("deptid")!=undefined){
                    if($('#select_mentTwo').css('display')!='none'){
                        if($('#addUserTwos').attr('deptid')==undefined){
                            alert('<fmt:message code="workflow.th.customDepartment" />')
                            return
                        }
                        var scopeVal = [];
                        var scopeValarr=$('#addUserTwos').attr('deptid').split(',')
                        scopeValarr.splice(scopeValarr.length-1,1)
                        scopeVal=scopeValarr;

                    }else {
                        var scopeVal = [];
                        scopeVal.push($('#select_ment').val());
                    }
                    var userId = $("#senduser").attr("dataid");
                    var userIdAry = new Array();
                    userIdAry.push(userId||-1);

                    var privid = $('#sendRole').attr('privid');
                    var privIdAry = [];
                    privIdAry.push(privid||-1);

                    var deptId = $('#sendept').attr('deptid');
                    var deptIdAry = [];
                    deptIdAry.push(deptId||-1);
                    var data = {
                        privType: $('#select_t').val(),
                        'scope[]': scopeVal,
                        'user[]': userIdAry,
                        'role[]': privIdAry,
                        'dept[]': deptIdAry,
                        'flowId':parent.getResObj.flowId
                    };

                    if($(meTwo).attr('data-id')==1){
                        data.privId=privId;
                        var strTitle='<fmt:message code="menuSSetting.th.editSuccess" />'
                    }else {
                        var strTitle='<fmt:message code="depatement.th.Newsuccessfully" />'
                    }
                    $.ajax({
                        type: 'post',
                        url: url,
                        dataType: 'json',
                        data: data,
                        success: function (data) {
                            if (data.flag) {
                                $.layerMsg({content:strTitle,icon:1},function(){
                                    allPeimissions();
                                });


                            } else {
                                layer.msg('<fmt:message code="sms.th.operationFailed" />。。', {icon: 6})

                            }
                        }
                    })

                }else {
                    alert('<fmt:message code="workflow.th.Authorization" />')
                }















            }
        })
    })




    $('#table_power').delegate('.delete_d','click',function () {
        var me=this;
        $.layerConfirm({title:'<fmt:message code="menuSSetting.th.suredeleteMenu" />',content:'<fmt:message code="workflow.th.que" />？',icon:0},function(){
            var privId = [];
            var pId = $(me).attr("privId");
            privId.push(pId);
            $.ajax({
                type: 'get',
                url: '/flowSetDatas/deleteFlowPriv',
                dataType: 'json',
                data: {
                    'privId[]': privId
                },
                success: function (ret) {
                    if (ret.flag) {
                        $.layerMsg({content:'<fmt:message code="workflow.th.delsucess" />！',icon:1},function(){
                            allPeimissions();
                        });

                    } else {
                        $.layerMsg({content:'<fmt:message code="lang.th.deleSucess" />！',icon:1});
                    }

                }
            })
        })

    })
</script>
</body>
</html>
