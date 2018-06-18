<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><fmt:message code="doc.th.AttendancePson" /></title>
    <link rel="stylesheet" href="/css/supervise/statistic.css">
    <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
    <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
    <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
    <script src="/js/common/language.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
    <script src="/lib/layer/layer.js"></script>
    <script src="/js/base/base.js"></script>
    <script src="/lib/laydate/laydate.js"></script>
    <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" 	src="/js/base/tablePage.js"></script>
    <style>
        .queryConditon input{
            width:100px;
        }
    </style>
</head>
<body>
<!--标题导航结束-->
<div class="main">
    <div class="byDepart" style="display: block;">
        <div class="queryConditon">
            <span><fmt:message code="attend.th.AttendanceType" />:</span>
            <select name="" id="attendance" style="width: 100px;height: 28px;margin-left: 5px;border: #ebebeb 1px solid;">
                <option value=""><fmt:message code="attend.th.default" /></option>
            </select>
            <span><fmt:message code="hr.th.department" />:</span>
            <select name="" id="bumen" style="width: 100px;height: 28px;margin-left: 5px;border: #ebebeb 1px solid;"></select>
            <span><fmt:message code="diary.th.body" />:</span>
            <select name="" id="pople" style="width: 100px;height: 28px;margin-left: 5px;border: #ebebeb 1px solid;">
                <option value="" class="all"><fmt:message code="notice.th.all" /></option>
            </select>
            <span><fmt:message code="doc.th.timeFrame" />：</span>
            <input type="text" name="startTime" id="startTimeOne" onclick="laydate(start)">
            <span style="margin: 0 15px;"><fmt:message code="global.lang.to" /></span>
            <input type="text" name="endTime" id="endTimeOne" onclick="laydate(end)">
            <span class="btnSpan" id="query"><fmt:message code="global.lang.query" /></span>
            <button class="btnSpan" id="reset"><fmt:message code="attend.th.timeReset" /></button>
        </div>

        <div class="queryConditon" style="margin-top:10px;" >

        </div>
        <div class="pagediv" id="already" style="margin: 0 auto;width: 97%;margin-top: 10px;">
            <table>
                <thead>
                <tr>
                    <th><fmt:message code="userDetails.th.name" /></th>
                    <th><fmt:message code="hr.th.department" /></th>
                    <th><fmt:message code="doc.th.BeWork" /></th>
                    <th><fmt:message code="doc.th.OffDuty" /></th>
                    <th><fmt:message code="doc.th.Late" /></th>
                    <th><fmt:message code="doc.th.LeaveEarly" /></th>
                    <th><fmt:message code="doc.th.DeviceException" /></th>
                    <th><fmt:message code="doc.th.NoSignIn" /></th>
                    <th><fmt:message code="doc.th.NoReturn" /></th>
                    <th><fmt:message code="attend.th.Sign" /></th>
                    <th><fmt:message code="attend.th.overtime" /></th>
                    <th><fmt:message code="attend.th.ATravel" /></th>
                    <th><fmt:message code="attend.th.leave" /></th>
                    <th><fmt:message code="attend.th.goOut" /></th>
                    <th><fmt:message code="notice.th.operation" /></th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
        <div id="dbgz_page" class="M-box3 fr">

        </div>
    </div>
</div>

<script>
    var start = {
        format: 'YYYY-MM-DD',
        /* min: laydate.now(), //设定最小日期为当前日期*/
        /* max: '2099-06-16 23:59:59', //最大日期*/
        istime: true,
        istoday: false,
        choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var end = {
        /*format: 'YYYY/MM/DD hh:mm',*/
        format:'YYYY-MM-DD',
        /*min: laydate.now(),*/
        /*max: '2099-06-16 23:59:59',*/
        istime: true,
        istoday: false,
        choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    var ajaxPage={
        data:{
            page:1,//当前处于第几页
            pageSize:6,//一页显示几条
            uesFlag:true,
        },
        page:function(){
            var me=this;
            $.ajax({  //列表数据展示
                type:'post',
                url:'<%=basePath%>attend/pcAttendanceStatistics',
                dataType:'json',
               // data:me.data,
                success:function(res){
                    var data=res.data;
                    var str='';

                    for(var i=0;i<data.length;i++){
                        str+='<tr uid='+data[i].uid+'>' +
                            '<td >'+data[i].userName+'</td><td>'+data[i].deptName+'</td><td>'+data[i].count1+'</td><td>'+data[i].count2+'</td><td>'+data[i].count5+'</td>' +
                            '<td>'+data[i].count6+'</td><td>'+data[i].count7+'</td><td>'+data[i].count3+'</td><td>'+data[i].count4+'</td>' +
                            '<td>'+data[i].count8+'</td><td>'+data[i].count9+'</td><td>'+data[i].count10+'</td><td>'+data[i].count11+'</td><td>'+data[i].count12+'</td><td><a href="#" class="particular"><fmt:message code="file.th.detail" /></a></td>' +
                            '</tr>'
                    }
                    $('#already tbody').html(str);
                    //me.pageTwo(json.total,me.data.pageSize,me.data.page)
                }
            })
        },
        init:function(){
            var deptId=$('#bumen').find("option:selected").attr('deptId');
            $.ajax({//部门选择
                type:'get',
                url: '../../department/getAlldept',
                // data:deptId,
                dataType:'json',
                success:function(res){
                    console.log(res)
                    var data=res.obj;
                    var src ='<option><fmt:message code="hr.th.PleaseSelect" /></option>';
                    for(var i=0;i<data.length;i++){
                        src+='<option deptId='+data[i].deptId+'>'+data[i].deptName+'</option>'
                    }
                    $('#bumen').html(src)
                }
            });
            $('#bumen').change(function(){
                var deptid=$(this).find("option:selected").attr('deptId');
                var deptId={deptId:deptid}
                $.ajax({//人员展示
                    type:'get',
                    url: '/user/getuserNameByDeptId',
                    data:deptId,
                    dataType:'json',
                    success:function(res){
                        var data=res.obj;
                        var src ='';
                        for(var i=0;i<data.length;i++){
                            src+='<option uid='+data[i].uid+'>'+data[i].userName+'</option>'
                        }
                        $('.all').after(src)
                    }
                })
            });
        },
        pageTwo:function (totalData, pageSize,indexs) {//设置分页
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
    ajaxPage.init();

   $(function(){
        $('#query').click(function(){//查询
            var data1={
                'beiginDate':$("#startTimeOne").val(),
                'endDate':$("#endTimeOne").val(),
                'uid':$('#pople option:selected').attr('uid'),
                'deptId':$('#bumen').find("option:selected").attr('deptId'),
            }
            $.ajax({
                type:'post',
                url:'<%=basePath%>attend/pcAttendanceStatistics',
                dataType:'json',
                 data:data1,
                success:function(res){
                    var data=res.data;
                    var str='';
                    for(var i=0;i<data.length;i++){
                        str+='<tr>' +
                            '<td>'+data[i].userName+'</td><td>'+data[i].deptName+'</td><td>'+data[i].count1+'</td><td>'+data[i].count2+'</td><td>'+data[i].count5+'</td>' +
                            '<td>'+data[i].count6+'</td><td>'+data[i].count7+'</td><td>'+data[i].count3+'</td><td>'+data[i].count4+'</td>' +
                            '<td>'+data[i].count8+'</td><td>'+data[i].count9+'</td><td>'+data[i].count10+'</td><td>'+data[i].count11+'</td><td>'+data[i].count12+'</td><td><a href="#" class="particular"><fmt:message code="file.th.detail" /></a></td>' +
                            '</tr>'
                    }
                    $('#already tbody').html(str);
                }
            });

            $('#reset').click(function(){//时间重置按钮
                $('input[name="startTime"]').val('');
                $('input[name="endTime"]').val('');
            })
        });

       function init(){//时间初始化
           var d = new Date();
           var vYear = d.getFullYear();
           var vMon = d.getMonth() + 1;
           var vDay = d.getDate();
           if (parseInt(vMon) < 10)
           {
               vMon = "0" + vMon;
           }
           if (parseInt(vDay) < 10)
           {
               vDay = "0" + vDay;
           }
           $("#startTimeOne").val(vYear+"-"+vMon+"-"+"01");
           $("#endTimeOne").val(vYear+"-"+vMon+"-"+vDay)
           var startTimeOne =$("#startTimeOne").val();
           var endTimeOne =$("#endTimeOne").val();

       }init();

       $('.pagediv').on('click','.particular',function(){//查看详情
           var Uid=$(this).parent().parent().attr('uid');
           var uid={uid:Uid};
           layer.open({
               type: 1,
               title:['<fmt:message code="roleAuthorization.th.ViewDetails" />'],
               area: ['500px', '300px'], //宽高
               content: '<table >' +
                    '<thead><th><fmt:message code="attend.rh.SignDate" /></th><th><fmt:message code="attend.th.SignType" /></th><th><fmt:message code="attend.th.CheckTime" /></th></thead>' +
                    '<tbody class="speciality"></tbody>' +
               '</table>',
               success:function(){
//                   var uid=$('tr').firstChild;

                   $.ajax({
                       url:'/attend/personalAttendance?date=2018-01&_=1516262779859',
                       type:'post',
                       dataType:'json',
                       data:uid,
                       success:function(res){
                           //console.log()
                           if(res.flag){
                               var data=res.data.list;
                             //  console.log(data)
                                var str ='';
                                for(var i=0;i<data.length;i++){
                                    str+='<tr>' +
                                        '<td>'+data[i].attendList[data[i].attendList.length-1].dateName+'</td>' +
                                        '<td>'+data[i].attendList[data[i].attendList.length-1].atimestate+'</td>' +
                                        '<td>'+data[i].attendList[data[i].attendList.length-1].time+'</td>' +
                                    '</tr>'
                                }
                                $('.speciality').html(str);
                           }
                       }
                   })
               }
           });
       })
   });

</script>
</body>
</html>
