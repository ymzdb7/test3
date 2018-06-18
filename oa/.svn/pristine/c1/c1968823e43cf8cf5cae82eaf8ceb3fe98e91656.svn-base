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
    <title>选修课基础课表管理</title>
    <link rel="stylesheet" type="text/css" href="../../css/edu/vehicleInfo.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
    <style>
        table td,th{
            font-size: 14px;
        }
        .trList:hover{
            background-color: #D3E7FA;
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
            <img src="../../img/edu/xuanxiukejichu.png" >
        </div>
        <div class="title">选修课基础课表管理</div>
    </div>
    <div class="main" style="padding-top: 11px">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr id="trBefor">
                <th>选择</th>
                <th>选修课程编号</th>
                <th>选修课程名称</th>
                <th>选修课程英文名</th>
                <th>选修课程所属领域</th>
                <th>操作</th>
            </tr>

            <tr>
                <td>
                    <input type="checkbox" name="checkedAll" id="checkedAll" />全选
                </td>
                <td colspan="5" style="text-align: left;">
                    <div><a id="deleteMore" href="javascript:;" style="font-size: 12px;">删除</a></div>
                </td>
            </tr>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        init($('#trBefor'));

        //单条删除
        $('.main').on('click','.deleteData',function(){
            var arrdata=[];
            var thisId=$(this).parents('tr').attr('data_id');
            arrdata.push(thisId);
            deleteList(arrdata,$('#trBefor'));
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
            deleteList(arrData,$('#trBefor'));
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
                url:'<%=basePath%>eduElectiveCourseController/deleteElectveCourse',
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

    //初始加载
    function init(element){
        element.nextAll('.trList').remove();
        $.ajax({
            type:'get',
            url:'<%=basePath%>eduElectiveCourseController/selectEduElectiveCourse',
            dataType:'json',
            success:function(res){
                var data=res.obj;
                var str='';
                if(res.msg == 'ok'){
                    for(var i=0;i<data.length;i++){
                        str+='<tr class="trList" data_id="'+data[i].id+'">' +
                            '<td><input type="checkbox" name="checkData" class="checkData" value="" /></td>' +
                            '<td>'+data[i].nid+'</td>' +
                            '<td>'+data[i].courseName+'</td>' +
                            '<td>'+data[i].courseEname+'</td>' +
                            '<td>'+data[i].courseAreaName+'</td>' +
                            '<td><a href="javascript:;" class="selectDate" style="color:#1772c0">详细信息</a><a href="javascript:;"class="updateDate" style="color:#1772c0">编辑</a><a href="javascript:;" class="deleteData"  style="color:#e01919">删除</a></td>' +
                            '</tr>'
                    }
                    element.after(str);
                    $(".trList").click(function () {
                        var state=$(this).find('.checkData').prop("checked");
                        if(state==true){
                            $(this).find('.checkData').prop("checked",true);
                        }else{
                            $('#checkedAll').prop("checked",false);
                            $(this).find('.checkData').prop("checked",false);
                        }
                        var child =   $(".checkData");
                        for(var i=0;i<child.length;i++){
                            var childstate= $(child[i]).prop("checked");
                            if(state!=childstate){
                                return
                            }
                        }
                        $('#checkedAll').prop("checked",state);
                    })
                }
            }
        })
    }
    //详细信息

        $('.main').on('click','.selectDate',function () {
            var thisId=$(this).parents('tr').attr('data_id');

            layer.open({
                type: 1,
                title:['选修课基础表详情', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '360px'],
                shadeClose: true, //点击遮罩关闭
                btn: ['关闭'],
                content: '<table cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff;width: 100%;">' +
                '<tr><td style="width: 50%">选修课程编号：</td><td></td></tr>'+
                '<tr><td>选课名称：</td><td></td></tr>'+
                '<tr><td>选修课程英语名：</td><td></td></tr>'+
                '<tr><td>选修课程所属领域：</td><td></td></tr>'+
                '</table>',
                success:function(){
                    $.ajax({
                        type:'get',
                        url:'<%=basePath%>eduElectiveCourseController/selectEduElectiveCourse',
                        dataType:'json',
                        data:{id:thisId},
                        success:function(res){
                            var data=res.obj;
                            $('.tab').find('tr').eq(0).find('td').eq(1).text(data[0].nid);
                            $('.tab').find('tr').eq(1).find('td').eq(1).text(data[0].courseName);
                            $('.tab').find('tr').eq(2).find('td').eq(1).text(data[0].courseEname);
                            $('.tab').find('tr').eq(3).find('td').eq(1).text(data[0].courseAreaName);
                        }
                    })
                },
                yes:function(index){
                    layer.close(index);
                }
            });
        })

    //编辑
    $(function(){
        $('.main').on('click','.updateDate',function () {
            var thisId=$(this).parents('tr').attr('data_id');
            //编辑调用编辑接口跳转
            self.parent.document.getElementById('iframe').src='/eduElectiveCourseController/eduCourseUpdate?id='+thisId;
        })
    })
</script>
</body>
</html>

