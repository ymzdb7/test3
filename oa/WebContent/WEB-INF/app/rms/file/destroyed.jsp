<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="dem.th.ArchivesDestruction" /></title>
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script src="../js/news/page.js"></script>
    <script src="../lib/laydate.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js"></script>
    <script type="text/javascript" src="/lib/jquery.form.min.js"></script>
    <style>
        a {
            text-decoration: none;
            color: #207bd6;
        }
        .buttonDiv{
            width: 100%;
        }
        .buttonDiv .deleteBtn{
            width: 99px;
            height: 28px;
            background: url("../img/btn_deletecontent_03.png") no-repeat;
            line-height: 28px;
            margin-right: 20px;
            cursor: pointer;
        }
        .editMange input[type="text"]{
            width: 260px;
            height: 30px;
        }
        select{
            width: 260px;
            height: 30px;
        }
        textarea{
            width: 260px;
            height: 50px;
            vertical-align: middle;
        }
        a{
            text-decoration: none;
            color: #207bd6;
        }
        .newTbale tr td{
            border-right: #ccc 1px solid;
            padding: 5px;
        }
        .buttonDiv{
            width: 100%;
            margin-top: 20px;
        }
        .buttonDiv>div{
            float: left;
        }
        .exportBtn{
            background: url(../img/icon_huanyuan.png) no-repeat;
            border: none;
            width: 99px;
            height: 28px;
            line-height: 28px;
            margin-right: 20px;
            cursor: pointer;
        }
        #tr_td tr:nth-child(odd){
            background-color: #fff;
        }
    </style>
</head>

<body>
<div class="bx">
    <div class="navigation  clearfix juMange" style="display: block;">
        <input type="hidden" id="hiddenId" name="hiddenId" value="">
        <div class="left" style="margin-left: 30px">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_destroyed.png">
            <div class="news">
                <span><fmt:message code="dem.th.ArchivesDestruction" /></span>
            </div>
        </div>
        <div class="wrap" style="margin-left: 0;padding: 0 20px;">
            <table id="tr_td">
                <thead>
                <tr>
                    <td>
                        <input type="checkbox" id="checkedAll">
                    </td>
                    <td class="th">
                        <fmt:message code="dem.th.FileNum" />
                    </td>
                    <td class="th">
                        <fmt:message code="dem.th.FileTitle" />
                    </td>
                    <td class="th">
                        <fmt:message code="dem.th.Dense" />
                    </td>
                    <td class="th">
                        <fmt:message code="doc.th.DispatchUnit" />
                    </td>
                    <td class="th">
                        <fmt:message code="doc.th.DispatchTime" />
                    </td>
                    <td class="th">
                        <fmt:message code="dem.th.EmergencyGrade" />
                    </td>
                    <td class="th" style="">
                        <fmt:message code="notice.th.operation" />
                    </td>
                </tr>
                </thead>
                <tbody id="j_tb">

                </tbody>
            </table>
            <div class="right">
                <!-- 分页按钮-->
                <div class="M-box3" id="dbgz_page">
                </div>

            </div>
            <div class="buttonDiv">
                <div class="exportBtn"><span style="margin-left: 35px;"><fmt:message code="dem.th.BatchReduction" /></span></div>
                <div class="deleteBtn"><span style="margin-left: 36px;"><fmt:message code="meet.th.BatchDelete" /></span></div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    $(function(){
        var dataId={
            page:1,//当前处于第几页
            pageSize:5,//一页显示几条
            delStatus:'1'
        };
        $('.M-box3').pagination({
            pageCount:10,
            jump:true,
            coping:true,
            homePage:'首页',
            endPage:'末页',
            prevContent:'上页',
            nextContent:'下页'
        });
        init(dataId,$('#j_tb'));

        //            点击全选
        $('#checkedAll').click(function(){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
                $(".checkedChild").prop("checked",true);
            }else{
                $(this).prop("checked",false);
                $(".checkedChild").prop("checked",false);
            }
        })

        //    销毁
        $('#j_tb').on('click','.deleteData',function(){
            var deleteId=$(this).parents('tr').attr('data-id');
            deleteData(deleteId,dataId)
        });
//        还原
        $('#j_tb').on('click','.reduction',function(){
            var reductionId=$(this).parents('tr').attr('data-id');
            reductionData(reductionId,dataId);
        })
//    复选框
        $('#j_tb').on('click','.checkedChild',function(){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
            }else{
                $('#checkedAll').prop("checked",false);
                $(this).prop("checked",false);
            }
            var child =   $(".checkedChild");
            for(var i=0;i<child.length;i++){
                var childstate= $(child[i]).prop("checked");
                if(state!=childstate){
                    return
                }
            }
            $('#checkedAll').prop("checked",state);
        });
//批量销毁
        $('.deleteBtn').click(function(){
            var deleteId='';
            $(".checkedChild:checkbox:checked").each(function(){
                var conId=$(this).parents('tr').attr("data-id");
                deleteId+=conId+',';
            });
            deleteData(deleteId,dataId);
        });
//        批量还原
        $('.exportBtn').click(function(){
            var reductionId='';
            $(".checkedChild:checkbox:checked").each(function(){
                var conId=$(this).parents('tr').attr("data-id");
                reductionId+=conId+',';
            });
            reductionData(reductionId,dataId);
        })
//        文件详情
        $('#j_tb').on('click','.to_detail',function () {
            var editId=$(this).parents('tr').attr('data-id');
            $.popWindow('/rmsFile/detail?fileId='+editId);
        })
    })
    //查询数据
    function init(dataId,element) {
        var ajaxPage={
            data:dataId,
            page:function () {
                element.find('tr').remove();
                var me=this;
                $.ajax({
                    type:'get',
                    url:'/rmsFile/query',
                    dataType:'json',
                    data:me.data,
                    success:function(res) {
                        var datas=res.obj;
                        var str='';
                        for(var i=0;i<datas.length;i++){
                            var secretName='';
                            if(datas[i].secret == '1'){
                                secretName='<fmt:message code="dem.th.PuDense" />';
                            }else if(datas[i].secret == '2'){
                                secretName='<fmt:message code="doc.th.Top-secret" />';
                            }else if(datas[i].secret == '3'){
                                secretName='<fmt:message code="dem.th.Confidential" />';
                            }else if(datas[i].secret == '4'){
                                secretName='<fmt:message code="dem.th.Secret" />';
                            }
                            if(datas[i].urgency == '1'){
                                datas[i].urgency='<fmt:message code="hr.th.EmployeeType" />';
                            }else{
                                datas[i].urgency='<fmt:message code="dem.th.PuDense" />';
                            }
                            str+='<tr data-id="'+datas[i].fileId+'" data-status="'+datas[i].status+'">' +
                                '<td><input type="checkbox" name="check" class="checkedChild" value=""></td>' +
                                '<td>'+datas[i].fileCode+'</td>' +
                                '<td class="to_detail" style="color:#1687cb;cursor: pointer">'+datas[i].fileTitle+'</td>' +
                                '<td>'+secretName+'</td>' +
                                '<td>'+ function(){
                                    if(datas[i].sendUnit != undefined){
                                        return datas[i].sendUnit;
                                    }else{
                                        return '';
                                    }
                                }()+'</td>' +
                                '<td>'+function(){
                                    if(datas[i].sendDate != undefined){
                                        return datas[i].sendDate;
                                    }else{
                                        return '';
                                    }
                                }()+'</td>' +
                                '<td>'+datas[i].urgency+'</td>' +
                                '<td><a href="javascript:;" class="reduction"><fmt:message code="dem.th.reduction" /></a><a href="javascript:;" class="deleteData" style="margin-left: 10px;"><fmt:message code="global.lang.delete" /></a></td>' +
                                '</tr>'
                        }

                        element.append(str);
                        me.pageTwo(res.totleNum,me.data.pageSize,me.data.page)
                    }
                })

            },
            pageTwo:function (totalData, pageSize,indexs) {
                var mes=this;
                $('#dbgz_page').pagination({
                    totalData: totalData,
                    showData: pageSize,
                    jump: true,
                    coping: true,
                    homePage:'',
                    endPage: '',
                    current:indexs||1,
                    callback: function (index) {
                        mes.data.page=index.getCurrent();
                        mes.page();
                    }
                });
            }
        };
        ajaxPage.page();
    }
    //销毁
    function deleteData(deleData,dataSele){
        layer.confirm('<fmt:message code="workflow.th.que" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="workflow.th.suredel" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'/rmsFile/delete',
                dataType:'json',
                data:{'fileIds':deleData},
                success:function(res){
                    if(res.flag){
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                        init(dataSele,$('#j_tb'))
                    }else{
                        layer.msg('<fmt:message code="lang.th.deleSucess" />', { icon:6});
                    }
                }
            });

        }, function(){
            layer.closeAll();
        });
    }
    //还原
    function reductionData(deleData,dataSele){
        layer.confirm('<fmt:message code="dem.th.DoData" />？', {
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
            title:"<fmt:message code="dem.th.ConfirmationReduction" />"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'/rmsFile/restore',
                dataType:'json',
                data:{'fileIds':deleData},
                success:function(res){
                    if(res.flag){
                        layer.msg('<fmt:message code="dem.th.ReductionSuccess" />', { icon:6});
                        init(dataSele,$('#j_tb'))
                    }else{
                        layer.msg('<fmt:message code="dem.th.restoreFailed" />', { icon:6});
                    }
                }
            });

        }, function(){
            layer.closeAll();
        });
    }
</script>
</body>
</html>
