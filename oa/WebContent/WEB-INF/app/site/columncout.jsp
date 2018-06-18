<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height:100%;">
    <head></head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="../../lib/layui-v1.0.9_rls/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="../css/base.css">
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layer/layer.js"></script>
    <script type="text/javascript" src="/lib/laydate/laydate.js"></script>
    <script type="text/javascript" src="../../lib/layui-v1.0.9_rls/layui/layui.js"></script>
    <script type="text/javascript" src="/js/base/base.js"></script>
    <title></title>
    <style>
        .fl{
            float: left;
        }
        .clearfix:after{
            display: block;
            clear:both;
            height:0;
            content: "";
        }
        .foot{
            position: absolute;
            left: 0;
            right: 0;
            bottom: 15%;
        }
        .newcolumn{
            background-color: rgb(91, 192, 222);
        }
        .delcolumn,.newcolumn{
            width:105px;
            height:28px;
            color:#fff;
            cursor:pointer;
        }
        #edit{
            cursor:pointer;
            width:18px;
            height:18px;
        }
        .delcolumn{
            background-color: rgb(217, 83, 79);
        }
        .columnCount{
            height: 150px;
            width: 100px;
            margin-right:10px;
        }
        .count{
            margin-top:30px;
        }
        .table tr{
            border:none;
        }
        .table td{
            text-align: center;
            padding:5px 0 5px 0;
        }
        .jichu{
            text-align: center;
            font-weight: bold;
        }
        .w150{
            width:150px;
        }
        .input{
            width:170px;
            border-radius: 3px;
            margin-right: 20px;
        }
        .table{
            width:95%;
            margin:10px auto;
        }
        .layui-layer-btn{
            text-align: center !important;
        }
    </style>
    <body style="height:100%;">
        <div class="iofo">
           <div class="title">
               <span>当前位置</span>
               <span class="court"></span>
           </div>
            <div class="count clearfix">

            </div>
            <div class="foot">
                <button class="newcolumn">创建栏目</button>
                <button class="delcolumn">删除栏目</button>
            </div>
        </div>
    </body>
    <script>
        $(function(){
            function checkehuo(name, val) {
                if (val == '') {
                    return;
                }
                $('[name="' + name + '"]').find('option').each(function(i, n) {
                    if ($(this).val() == val) {
                        $(this).attr('selected', 'selected')
                    } else {
                        $(this).removeAttr('selected', 'selected')
                    }
                })
            }


            var id=window.parent.parentid;//得到父元素当前点击id
            // console.log(id)
            str=""
            for(i=0;i<id.length;i++) {
                if("0123456789".indexOf(id.substr(i,1))>-1)
                    str+=id.substr(i,1)
            }
            var pid=str;
            console.log(pid)
            $.ajax({//栏目展示
                url:'/column/ColumnTreeController',
                data:{id:id},
                type:'get',
                dataType:'json',
                success:function(res){
                    var data=res.obj;
                    var str='';
                    for(var i=0;i<data.length;i++){
                        str+='<div class="fl columnCount">' +
                            '<div><img src="/img/cms/file.png" alt=""></div>' +
                            '<p style="text-align: center">' +
                            '<input value='+data[i].extend1+' class="choice" type="checkbox">' +
                            '<span id="edit" columnId='+data[i].extend1+' style="display:inline-block;"><img src="/img/cms/edit.png" alt=""></span>'+
                            '<span >'+data[i].name+'</span>' +
                            '</p>' +
                            '</div>'
                    }
                    $('.count').html(str)
                }
            })

            $('.newcolumn').click(function(){//新建
                layer.open({
                    type: 1,
                    title:['创建栏目', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['650px', '380px'],
                    content:'<div>' +
                                '<table class="table">' +
                                    '<tr><td colspan="4" style="background:#f0f0f0;"><p class="jichu">基础信息</p></td></tr>'+
                                    '<tr><td class="w150">栏目标识:</td><td><input id="columnMark" class="input" type="text"></td><td class="w150">显示名称:</td><td><input id="columnName" class="input" type="text"></td></tr>' +
                                    '<tr><td>排序号:</td><td><input id="sortNo" class="input" type="text"></td><td>存放位置:</td><td><input id="path" class="input" type="text"></td></tr>' +
                                    '<tr><td>栏目分页大小:</td><td><input id="pageSize" class="input" type="text"></td><td></td><td></td></tr>' +
                                    '<tr style="height:20px;"><td colspan="4"></td></tr>' +
                                    '<tr><td colspan="4" style="background:#f0f0f0;"><p class="jichu">发布相关</p></td></tr>'+
                                    '<tr><td>首页模板:</td><td><select name="" id="listTemplate"></select></td><td></td><td></td></tr>' +
                                '</table>' +
                            '</div>',
                             btn: ['保存','取消'],
                             success:function(){
                                $.ajax({
                                    url:'/temp/selectPortalTemplate',
                                    type:'get',
                                    data:{portalId:pid},
                                    dataType:'json',
                                    success:function(res){
                                        var data=res.obj;
                                        var str='';
                                        for(var i=0;i<data.length;i++){
                                            str+='<option>'+data[i].templateName+'</option>'
                                        }
                                        $('#listTemplate').html(str)
                                    }
                                })
                             },
                             btn1:function(){
                                 $.ajax({
                                     url:'/column/insertPortalColumn',
                                     type:'get',
                                     data:{
                                         portalId:pid,
                                         columnMark:$('#columnMark').val(),
                                         columnName:$('#columnName').val(),
                                         sortNo:$('#sortNo').val(),
                                         path:$('#path').val(),
                                         pageSize:$('#pageSize').val(),
                                         listTemplate:$('#listTemplate option:selected').text()
                                     },
                                     dataType:'json',
                                     success:function(){
                                         location.reload();
                                     }
                                 })
                             }


                })
            })

            $(".delcolumn").click(function(){//删除
                var del= $("input[type='checkbox']").is(':checked');
                var ids=[];
                if(del==true){
                   $.each($('input:checkbox:checked'),function(){
                       var columnId=$(this).val();
                       //console.log(columnId)
                       ids.push(columnId)
                      // console.log(arr)
                   });
                    layer.confirm('确定要删除栏目吗？', {
                        btn: ['确定','取消'], //按钮
                        title:"确定删除？"
                    },function(){
                        $.ajax({
                            url:'/column/delPortalColumn',
                            type:'get',
                            data:{ids:ids},
                            dataType:'json',
                            success:function(){
                                layer.msg('删除成功', { icon:6,time:1000});
                            }
                        })
                        location.reload();
                    })
               }else{
                   alert('请至少选择一个要删除的栏目')
               }

            })

//
            $('.count').on('click','#edit',function(){//编辑
               var columnId=$(this).attr('columnId');
              // console.log(columnId)
                layer.open({
                    type: 1,
                    title:['创建栏目', 'background-color:#2b7fe0;color:#fff;'],
                    area: ['650px', '380px'],
                    content:'<div>' +
                    '<table class="table">' +
                    '<tr><td colspan="4" style="background:#f0f0f0;"><p class="jichu">基础信息</p></td></tr>'+
                    '<tr><td class="w150">栏目标识:</td><td><input name="columnMark" class="input" type="text"></td><td class="w150">显示名称:</td><td><input name="columnName" class="input" type="text"></td></tr>' +
                    '<tr><td>排序号:</td><td><input name="sortNo" class="input" type="text"></td><td>存放位置:</td><td><input name="path" class="input" type="text"></td></tr>' +
                    '<tr><td>栏目分页大小:</td><td><input name="pageSize" class="input" type="text"></td><td></td><td></td></tr>' +
                    '<tr style="height:20px;"><td colspan="4"></td></tr>' +
                    '<tr><td colspan="4" style="background:#f0f0f0;"><p class="jichu">发布相关</p></td></tr>'+
                    '<tr><td>首页模板:</td><td><select name="" class="listTemplate"><option value="">1</option></select></td><td></td><td></td></tr>' +
                    '</table>' +
                    '</div>',
                    btn: ['保存','取消'],
                    success:function(){
                        $.ajax({
                            url:'/temp/selectPortalTemplate',
                            type:'get',
                            data:{portalId:pid},
                            dataType:'json',
                            success:function(res){
                                var data=res.obj;
                                var str='';
                                for(var i=0;i<data.length;i++){
                                    str+='<option templateId='+data[i].templateId+'>'+data[i].templateName+'</option>'
                                }
                                $('.listTemplate').html(str)
                            }
                        })

                      $.ajax({//基础信息回显
                          url:'/column/selectPortalColumnById',
                          type:'get',
                          data:{columnId:columnId},
                          dataType:'json',
                          success:function(res){
                            var data=res.object;
                            if(res.flag){
                                $('input[name="columnMark"]').val(data.columnMark);
                                $('input[name="columnName"]').val(data.columnName);
                                $('input[name="sortNo"]').val(data.sortNo);
                                $('input[name="pageSize"]').val(data.pageSize);
                                $('input[name="path"]').val(data.path);
                                checkehuo("listTemplate",data.templateName);
                            }
                          }
                      })
                    },
                    btn1:function(){
                        data={
                            columnId:columnId,
                            columnMark:$('input[name="columnMark"]').val(),
                            columnName:$('input[name="columnName"]').val(),
                            sortNo:$('input[name="sortNo"]').val(),
                            pageSize:$('input[name="pageSize"]').val(),
                            path:$('input[name="path"]').val(),
                            listTemplate:$('.listTemplate option:checked').attr('templateId')
                        }
                        $.ajax({
                            url:'/column/upPortalColumn',
                            type:'get',
                            data:data,
                            dataType:'json',
                            success:function(res){
                                location.reload();
                            }
                        })
                    },


                })

            })

        })
    </script>
</html>