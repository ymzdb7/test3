<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>选修课发布管理</title>
    <link rel="stylesheet" type="text/css" href="../../css/edu/vehicleInfo.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/laydate/laydate.js"></script>
    <link rel="stylesheet" type="text/css" href="../../lib/laydate.css"/>
    <style>
        table td,th{
            font-size: 14px;
            padding:10px;
        }
        table tr td, th{
            padding:10px;
        }
        .title{
            font-size:22px;
            color:#494d59;
            padding-left:0%;
            padding-right: 20px;
            display: inline;
        }
        .nav_t1{
            display: inline;
            float: left;
        }
        .nav_t1 img{
            vertical-align: top;
        }
        #deleteMore{
            background: url(../../img/news/btn_delete_min_03.png) 0px 0px no-repeat;
            font-size: 12px;
            width: 50px;
            height: 28px;
            line-height: 25px;
            padding-left: 23px;
            margin-left: 20px;
            cursor: pointer;
            display: inline-block;
            color:#000;
        }
    </style>
</head>
<!DOCTYPE html>
<html>
<body>
<div class="content">
    <div class="header">
        <div class="nav_t1" style="padding-left: 15px;padding-top: 10px">
            <img src="../../img/edu/xuankefabuguanli.png" >
        </div>
        <div class="title">选修课发布管理</div>
    </div>
    <div class="main" style="padding-top: 11px">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr id="beforeData">
                <th>选择</th>
                <th>选修课名称</th>
                <th>课程(点击设置课程详细)</th>
                <th>学年</th>
                <th>学期</th>
                <th>每人选课上限</th>
                <th>选课开始时间</th>
                <th>选课结束时间</th>
                <th>班级名称</th>
                <th>操作</th>
            </tr>

            <tr>
                <td>
                    <input type="checkbox" name="checkedAll" id="checkedAll" />全选
                </td>
                <td colspan="9" style="text-align: left;">
                    <div><a href="javascript:;" id="deleteMore" style="font-size: 12px;">删除</a></div>
                </td>
            </tr>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        init($('#beforeData'));

        //详细信息
        $('.main').on('click','.detailsData',function(){
            var dataId=$(this).parents('tr').attr('data_id');
            $.popWindow('<%=basePath%>eduElectivePublish/eduDetails?dataId='+dataId,'选修课发布详情','100','300','1000px','700px');
        })

        //课程详情
        $('.main').on('click','.course',function(){
            var dataId=$(this).parents('tr').attr('data_id');
            var nId=$(this).parents('tr').attr('nId');
            var electiveCourse=$(this).parents('tr').attr('electiveCourse');
            var courseName=$(this).parents('tr').attr('data_courseName');
            <%--$.popWindow('<%=basePath%>eduElectivePublish/electiveDetails?dataId='+dataId+'&nid='+nId,'选修课发布详情','50','300','1000px','700px');--%>
            $.popWindow('<%=basePath%>eduElectivePublish/electiveDetails?courseName='+courseName+'&electiveCourset='+electiveCourse+'&nId='+nId+'&dataId='+dataId,'选修课发布详情','50','300','1000px','700px');
        })
    })

    //初始加载
    function init(element){
        element.nextAll('.trList').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath%>eduElectivePublish/selectEduPublish',
            dataType:'json',
            success:function(res){
                var data=res.obj;
                var str='';
                for(var i=0;i<data.length;i++){
                    var startTime=new Date((data[i].startTime)).Format('yyyy-MM-dd');
                    var endTime=new Date((data[i].endTime)).Format('yyyy-MM-dd');
                    var termText='';
                    if(data[i].term == "1"){
                        termText='第一学期';
                    }else if(data[i].term == "2"){
                        termText='第二学期';
                    }
                    str+='<tr class="trList" electiveCourse="'+data[i].electiveCourse+'" nId="'+data[i].nid+'"  data_id="'+data[i].id+' " data_courseName="'+data[i].courseName+'">' +
                        '<td><input type="checkbox" name="checkData" class="checkData" value="" /></td>' +
                        '<td>'+data[i].electiveCourse+'</td>' +
                        '<td><a href="javascript:;" class="course" style="color:#1772c0">'+data[i].courseName+'</a></td>' +
                        '<td>'+data[i].year+'</td>' +
                        '<td>'+termText+'</td>' +
                        '<td>'+data[i].maxClass+'</td>' +
                        '<td>'+startTime+'</td>' +
                        '<td>'+endTime+'</td>' +
                        '<td>'+data[i].classNames+'</td>' +
                        '<td><a href="javascript:;" class="detailsData" style="color:#1772c0">详细信息</a><a href="javascript:;" class="updateDate" style="color:#1772c0">编辑</a><a href="javascript:;" class="deleteData" style="color:#e01919">删除</a></td>' +
                        '</tr>'
                }
                element.after(str);
            }
        })
    }

    $(function(){
        //单条删除
        $('.main').on('click','.deleteData',function(){
            var arrdata=[];
            var thisId=$(this).parents('tr').attr('data_id');
            arrdata.push(thisId);
            deleteList(arrdata,$('#beforeData'));
        });

        //全选
        $('#checkedAll').click(function(){
            var state =$(this).prop("checked");
            if(state==true){
                $(this).prop("checked",true);
                $(".checkData").prop("checked",true);
            }else{
                $(this).prop("checked",false);
                $(".checkData").prop("checked",false);;
            }
        })
        //多条删除
        $('#deleteMore').click(function(){
            var arrData=[];
            $(".checkData:checkbox:checked").each(function(){
                var dataId=$(this).parents('tr').attr('data_id');
                arrData.push(dataId);
            })
            deleteList(arrData,$('#beforeData'));
        })
    })

    //删除
    function deleteList(id,element){
        layer.confirm('确定删除此条信息？', {
            btn: ['确定','取消'], //按钮
            title:"删除"
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'post',
                url:'<%=basePath%>eduElectivePublish/deleteEduPublish',
//                traditional:true,
                dataType:'json',
                data:{id:id},
                success:function(res){
                    if(res.flag){
                        layer.msg('删除成功！', { icon:1});

                        init(element)
                    }else{
                        layer.msg('删除失败！', { icon:2});
                    }
                }
            })
        }, function(){
            layer.closeAll();
        });
    }
    //编辑
    $(function(){
        $('.main').on('click','.updateDate',function () {
            var thisId=$(this).parents('tr').attr('data_id');
            //编辑调用编辑接口
           self.parent.document.getElementById('iframe').src='/eduElectivePublish/eduElectiveUpdate?id='+thisId;
        })
    })
</script>
</body>
</html>

