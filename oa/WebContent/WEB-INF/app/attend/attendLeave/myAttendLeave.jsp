<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/26
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="attend.th.LeaveApproval" /></title>
    <link rel="stylesheet" href="/css/officialDocument/officialDocument.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/css/base.css">
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
<style>
    table{
        table-layout: fixed;
    }
    table tr td{
        overflow: hidden;
        text-overflow:ellipsis;
        white-space: nowrap;
    }
    html,body{
        height:100%;
    }
</style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

</head>
<body>

    
    <div style="margin: 0 auto;margin-top: 46px;height: 60px;width: 97%;" class="clearfix">
        <label class="fl clearfix" style="margin-top: 16px;margin-left: 10px;" >
            <span class="fl" style="margin-top: 5px;"><fmt:message code="foot.th.status" />：</span>
            <label class="fl"><select name="status">
                <option value="1"><fmt:message code="attend.th.needDealt" /></option>
                <option value="2"><fmt:message code="attend.th.Have" /></option>
            </select></label>
            <button  type="button" class="Query fl"><fmt:message code="global.lang.query" /></button>
        </label>
        <div id="dbgz_page" class="M-box3 fr">

        </div>
    </div>


    <div class="pagediv" style="margin: 0 auto;width: 97%;">
        <table>
            <thead>
                <tr>
                    <th><fmt:message code="sup.th.Applicant" /></th>
                    <th><fmt:message code="hr.th.department" /></th>
                    <th><fmt:message code="sup.th.startTime" /></th>
                    <th><fmt:message code="meet.th.EndTime" /></th>
                    <th><fmt:message code="attend.th.Reason" /></th>
                    <th ><fmt:message code="attend.th.CurrentStep" /></th>
                    <th><fmt:message code="notice.th.state" /></th>
                    <th><fmt:message code="menuSSetting.th.menuSetting" /></th>
                </tr>
            </thead>
            <tbody>

        </tbody>
        </table>
    </div>
<script>
    var openRold;
    if(parent.opennew!=undefined){
        openRold=parent.opennew;
    }
    var ajaxPage={
        data:{
            num:null,
            page:1,//当前处于第几页
            pageSize:10,//一页显示几条
            useFlag:true

        },

        page:function (num) {
            var me=this;
            this.data.num=$('[name="status"]').val();
         $.get('/attendLeave/backlogAttendList',me.data,function (json) {
                var str='';
                var arr=json.datas
                for(var i=0;i<arr.length;i++){
                    str+='<tr>' +
                        '<td>'+arr[i].createrName+'</td>' +
                        '<td>'+arr[i].deptName+'</td>' +
                        '<td>'+arr[i].beginDate+'</td>' +
                        '<td>'+arr[i].endDate+'</td>' +
                        '<td>'+arr[i].leaveType+'</td>' +

                        '<td>第'+arr[i].step+'步：'+arr[i].prcsName+'</td>' +
                        '<td>'+function () {
                            if(arr[i].prFlag==1){
                                return '<fmt:message code="lang.th.will" />'
                            }else  if(arr[i].prFlag==2){
                                return '<fmt:message code="lang.th.Process" />'
                            }else  if(arr[i].prFlag==3){
                                return '<fmt:message code="lang.th.will" />'
                            }else{
                                return '<fmt:message code="lang.th.HaveThrough" />'
                            }
                        }()+'</td>' +
                        '<td>' +function () {
                        if(me.data.num==1){
                            return '<a href="/workflow/work/workform?opflag=1&flowId='+arr[i].flowId+'&prcsId='+arr[i].realPrcsId+'&flowStep='+arr[i].step
                                +'&runId='+arr[i].runId+'&tabId='+arr[i].leaveId+'&tableName='+arr[i].tableName+'&isNomalType=true" target="_blank" style="margin-right: 10px"><fmt:message code="document.th.handle" /></a>' +
                                '<a href="/workflow/work/workformPreView?flowId='+arr[i].flowId+'&flowStep='+arr[i].step+'&tabId='+arr[i].leaveId+'&tableName='+arr[i].tableName+'&runId='+arr[i].runId+'&prcsId='+arr[i].realPrcsId+'" target="_blank"><fmt:message code="roleAuthorization.th.ViewDetails" /></a>'
                        }else {
                            return '<a href="/workflow/work/workformPreView?flowId='+arr[i].flowId+'&flowStep='+arr[i].step+'&tabId='+arr[i].leaveId+'&tableName='+arr[i].tableName+'&runId='+arr[i].runId+'&prcsId='+arr[i].realPrcsId+'" target="_blank"><fmt:message code="roleAuthorization.th.ViewDetails" /></a>'
                        }
                            }()+
                        '</td>' +
                        '</tr>'
                }
                $('.pagediv table tbody').html(str)

                me.pageTwo(json.total,me.data.pageSize,me.data.page)



            },'json')
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
    }
    ajaxPage.page()
    $('.Query').click(function () {
        ajaxPage.data.page=1;
        ajaxPage.page()
    })
</script>
</body>

</html>
