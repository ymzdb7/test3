<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
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
   <meta name="viewport" content="width=device-width, initial-scale=0.3, user-scalable=0, minimum-scale=0, maximum-scale=5.0,user-scalable=yes">
   <title><fmt:message code="sup.th.SupervisionClassification" /></title>
   <link rel="stylesheet" href="/css/supervise/supervisionType.css">
   <link rel="stylesheet" href="/lib/layer/skin/default/layer.css">
   <link rel="stylesheet" href="/lib/laydate/need/laydate.css">
   <link rel="stylesheet" href="/lib/pagination/style/pagination.css">
   <script type="text/javascript" src="/js/jquery/jquery-1.9.1.js"></script>
   <script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
   <script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>
   <script src="/lib/layer/layer.js"></script>
   <script src="/js/base/base.js"></script>
   <script src="/lib/laydate/laydate.js"></script>
   <script src="/lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<style>
   .layui-layer{
      top:50px!important;
   }
</style>
<link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
<body>
<div class="headTop">
   <div class="headImg">
      <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_type.png" alt="">
   </div>
   <div class="divTitle">
      <fmt:message code="sup.th.SupervisionClassification" />
   </div>
   <div class="newClass" id="newClass" style="border-radius: 3px"><img src="../../img/mywork/newbuildworjk.png" style="margin:-3px 0px 0px 9px;line-height: 28px" alt=""><span style="margin-left: 5px;"><fmt:message code="sup.th.NewCategory" /></span></div>
</div>
<div class="pagediv" style="margin: 0 auto;width: 97%;margin-top: 50px;">
   <table>
      <thead>
      <tr>
         <th width="25%"><fmt:message code="sup.th.CategoryName" /></th>
         <th><fmt:message code="sup.th.Personnel" /></th>
         <th><fmt:message code="sup.th.SubordinateRole" /></th>
         <th><fmt:message code="workflow.th.sector" /></th>
         <th><fmt:message code="notice.th.operation" /></th>
      </tr>
      </thead>
      <tbody>

      </tbody>
   </table>
      <%--<table id="tt" style="width:600px;height:400px"></table>--%>
</div>
<script>
    var dept_id='';
    var priv_id='';
    var user_id='';
   $(function(){
       //数据初始化
       init();
       //点击新建分类
       $('#newClass').click(function(event){
           event.stopPropagation();
           layer.open({
               type: 1,
               title:['<fmt:message code="sup.th.NewCategory" />', 'background-color:#2b7fe0;color:#fff;'],
               area: ['600px', '460px'],
               shadeClose: true, //点击遮罩关闭
               btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
               content: '<div class="div_table" style="margin: 35px auto;width: 96%;">' +
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.CategoryName" />：</span><span><input type="text" style="width: 180px;" name="typeName" class="inputTd" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="file.th.Sort" />：</span><span><input type="text" style="width: 180px;" name="sort_no" class="inputTd" value="" /></span><span style="color: #FF0000;margin-left: 10px;font-size: 16px;">*</span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ParentClass" />：</span><span><select name="parentId" id="parentId" style="width: 180px;height: 28px;margin-left: 5px;"></select></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Personnel" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 300px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SubordinateRole" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv" userpriv="" value="" disabled style="min-width: 300px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="workflow.th.sector" />：</span><span><div class="inPole"><textarea name="txt" id="userDept" deptid="" value="" disabled style="min-width: 300px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
               '</div>',
               success:function(){
                   //所属分类下拉
                   $('#parentId').typeSelect();
               },
               yes:function(index){
                  var data={
                      typeName:$('input[name="typeName"]').val(),
                      orderNum:$('input[name="sort_no"]').val(),
                      parentId:$('#parentId option:checked').val(),
                      userId:$('#userDept').attr('deptid')+'|'+$('#userPriv').attr('userpriv')+'|'+$('#userDuser').attr('user_id'),
                  }
                  if($('input[name="typeName"]').val() == '' || $('input[name="sort_no"]').val() == ''){
                      $.layerMsg({content:'<fmt:message code="sup.th.With*" />！',icon:1});
                      return;
                  }
                   newClassification(data);
                   layer.close(index);
               },
           });
           $('#selectUser').click(function(){//选人员控件
               user_id='userDuser';
               $.popWindow("../common/selectUser");
           });
           $("#selectPriv").on("click",function(){//选角色控件
               priv_id='userPriv';
               $.popWindow("../common/selectPriv");
           });
           $("#selectDept").on("click",function(){//选部门控件
               dept_id='userDept';
               $.popWindow("../common/selectDept");
           });
           $('#clearUser').click(function(){ //清空人员
               $('#userDuser').attr('user_id','');
               $('#userDuser').attr('dataid','');
               $('#userDuser').val('');
           });
           $('#clearPriv').click(function(){ //清空角色
               $('#userPriv').attr('privid','');
               $('#userPriv').attr('userpriv','');
               $('#userPriv').val('');
           });
           $('#clearDept').click(function(){ //清空部门
               $('#userDept').attr('deptid','');
               $('#userDept').attr('deptno','');
               $('#userDept').val('');
           });
           $('#fatherClass').click(function(){ //清空父级分类
               $('input[name="father"]').val('');
           });
       })

       //编辑按钮
       $('.pagediv').on('click','.editData',function(event){
           event.stopPropagation();
           var sId=$(this).parents('tr').attr('sId');
           layer.open({
               type: 1,
               title:['<fmt:message code="sup.th.EditCategories" />', 'background-color:#2b7fe0;color:#fff;'],
               area: ['600px', '380px'],
               shadeClose: true, //点击遮罩关闭
               btn: ['<fmt:message code="global.lang.save" />', '<fmt:message code="global.lang.close" />'],
               content: '<div class="div_table" style="margin: 35px auto;width: 96%;">' +
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.CategoryName" />：</span><span><input type="text" style="width: 180px;" name="typeName" class="inputTd" value="" /></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="file.th.Sort" />：</span><span><input type="text" style="width: 180px;" name="sort_no" class="inputTd" value="" /></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.ParentClass" />：</span><span><select name="parentId" id="parentId" style="width: 180px;height: 28px;margin-left: 5px;"></select></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.Personnel" />：</span><span><div class="inPole"><textarea name="txt" id="userDuser" user_id="" value="" disabled style="min-width: 300px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectUser" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearUser" class="clearUser "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="sup.th.SubordinateRole" />：</span><span><div class="inPole"><textarea name="txt" id="userPriv" privid="" value="" disabled style="min-width: 300px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectPriv" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearPriv" class="clearPriv "><fmt:message code="global.lang.empty" /></a></span></div></span></div>'+
               '<div class="div_tr"><span class="span_td"><fmt:message code="workflow.th.sector" />：</span><span><div class="inPole"><textarea name="txt" id="userDept" deptid="" value="" disabled style="min-width: 300px;min-height:50px;"></textarea><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="selectDept" class="Add "><fmt:message code="global.lang.add" /></a></span><span class="add_img" style="margin-left: 10px"><a href="javascript:;" id="clearDept" class="clearDept "><fmt:message code="global.lang.empty" /></a></span></div></span></div>' +
               '</div>',
               success:function(){
                   //所属分类下拉
                   $('#parentId').typeSelect();
                    $.ajax({
                        type:'get',
                        url:'<%=basePath%>supervisionType/getSupervisionTypeDetail',
                        dataType:'json',
                        data:{'sid':sId},
                        success:function(res){
                           var datas=res.object;
                           if(datas){
                               $('input[name="typeName"]').val(datas.typeName);
                               $('input[name="sort_no"]').val(datas.orderNum);
                               $('#parentId').val(datas.sid);
                               $('#userDuser').val(datas.userName);
                               $('#userPriv').val(datas.userPrivName);
                               $('#userDept').val(datas.deptName);
                               $('#userDuser').attr('user_id',datas.userId);
                               $('#userPriv').attr('userpriv',datas.userPrivId);
                               $('#userDept').attr('deptid',datas.deptId);
                           }
                        }
                    })
               },
               yes:function(index){
                   var data={
                       sid:sId,
                       typeName:$('input[name="typeName"]').val(),
                       orderNum:$('input[name="sort_no"]').val(),
                       parentId:$('#parentId option:checked').val(),
                       userId:$('#userDept').attr('deptid')+'|'+function(){if($('#userPriv').attr('userpriv')==undefined){return ""}else{return $('#userPriv').attr('userpriv')}}()+'|'+$('#userDuser').attr('user_id'),
                   }
                   if($('input[name="typeName"]').val() == '' || $('input[name="sort_no"]').val() == ''){
                       $.layerMsg({content:'<fmt:message code="sup.th.With*" />！',icon:1});
                       return;
                   }
                   editClassification(data)
                   layer.close(index);
               },
           });
           $('#selectUser').click(function(){//选人员控件
               user_id='userDuser';
               $.popWindow("../common/selectUser");
           });
           $("#selectPriv").on("click",function(){//选角色控件
               priv_id='userPriv';
               $.popWindow("../common/selectPriv");
           });
           $("#selectDept").on("click",function(){//选部门控件
               dept_id='userDept';
               $.popWindow("../common/selectDept");
           });
           $('#clearUser').click(function(){ //清空人员
               $('#userDuser').attr('user_id','');
               $('#userDuser').attr('dataid','');
               $('#userDuser').val('');
           });
           $('#clearPriv').click(function(){ //清空角色
               $('#userPriv').attr('privid','');
               $('#userPriv').attr('userpriv','');
               $('#userPriv').val('');
           });
           $('#clearDept').click(function(){ //清空部门
               $('#userDept').attr('deptid','');
               $('#userDept').attr('deptno','');
               $('#userDept').val('');
           });
           $('#fatherClass').click(function(){ //清空父级分类
               $('input[name="father"]').val('');
           });
       })
       //删除按钮
       $('.pagediv').on('click','.deleteData',function(){
           var sId=$(this).parents('tr').attr('sId');
           layer.confirm('<fmt:message code="sup.th.Delete" />？', {
               btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮
               title:"<fmt:message code="notice.th.DeleteFile" />"
           }, function(){
               //确定删除，调接口
               $.ajax({
                   type:'post',
                   url:'<%=basePath%>supervisionType/deleteSupervisionTypeBySid',
                   dataType:'json',
                   data:{'sid':sId},
                   success:function(){
                       layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});
                       init();
                   }
               })
           }, function(){
               layer.closeAll();
           });
       })
       //详情点击
       $('.pagediv').on('click','.details',function(event){
           event.stopPropagation();
           var sId=$(this).parents('tr').attr('sId');
           layer.open({
               type: 1,
               title:['<fmt:message code="file.th.detail" />', 'background-color:#2b7fe0;color:#fff;'],
               area: ['600px', '360px'],
               shadeClose: true, //点击遮罩关闭
               btn: ['<fmt:message code="global.lang.close" />'],
               content: '<table style="width: 80%;margin: 15px 50px;">' +
               '<tr><td width="20%"><fmt:message code="sup.th.CategoryName" />：</td><td class="typeName"></td></tr>' +
               '<tr><td width="20%"><fmt:message code="file.th.Sort" />：</td><td class="sortNum"></td></tr>' +
               '<tr><td width="20%"><fmt:message code="sup.th.Personnel" />：</td><td class="theUser"></td></tr>' +
               '<tr><td width="20%"><fmt:message code="sup.th.SubordinateRole" />：</td><td class="thePriv"></td></tr>' +
               '<tr><td width="20%"><fmt:message code="workflow.th.sector" />：</td><td class="theDept"></td></tr>' +
               '</table>',
               success:function(){
                   $.ajax({
                       type:'get',
                       url:'<%=basePath%>supervisionType/getSupervisionTypeDetail',
                       dataType:'json',
                       data:{'sid':sId},
                       success:function(res){
                           var data=res.object;
                           $('.typeName').text('');
                           $('.sortNum').text('');
                           $('.theUser').text('');
                           $('.thePriv').text('');
                           $('.theDept').text('');

                           $('.typeName').text(data.typeName);
                           $('.sortNum').text(data.orderNum);
                           $('.theUser').text(data.userName);
                           $('.thePriv').text(data.userPrivName);
                           $('.theDept').text(data.deptName);
                       }
                   })
               },
               yes:function(index){

                   layer.close(index);
               },
           });
       })
   })
    function zi(data){
       if(data==undefined){
           return "";
       }else{
           return data;
       }
    }
   function init(){
       $('.pagediv tbody tr').remove();

       <%--$('#tt').treegrid({--%>
           <%--url:'<%=basePath%>supervisionType/getSupTypeList',--%>
           <%--idField:'sid',--%>
           <%--treeField:'typeName',--%>
           <%--columns:[[--%>
               <%--{field:'typeName',title:'分类名称',width:250},--%>
               <%--{field:'userNames',title:'所属人员',width:250},--%>
               <%--{field:'roleNames',title:'所属角色',width:250},--%>
               <%--{field:'deptNames',title:'所属部门',width:250},--%>
               <%--{field:'opt_',title:'操作',width:300,formatter:function(value,rowData,rowIndex){--%>
                   <%--var opt="<a href=\"#\" onclick=\"detail("+rowData.sid+")\">详情</a>";--%>
                   <%--opt+="&nbsp;&nbsp;&nbsp;<a href=\"\" onclick=\"addOrUpdate("+rowData.sid+")\">编辑</a>&nbsp;&nbsp;&nbsp;<a href=\"#\" onclick=\"del("+rowData.sid+")\">删除</a>";--%>
                   <%--return opt;--%>
               <%--}}--%>
           <%--]]--%>
       <%--});--%>
       $.ajax({
           type:'get',
           url:'<%=basePath%>supervisionType/getSupervisionTypeList',
           dataType:'json',
           success:function(res){
               var data=digui(res.obj,0);
               var str='';
               if(data.length>0){
                   for(var i=0;i<data.length;i++){
                       if(data[i].childs.length>0){
                           str+='<tr sId="'+data[i].sid+'">' +
                               '<td><a href="javascript:;" class="details">'+data[i].typeName+'</a></td>' +
                               '<td>'+zi(data[i].userName)+'</td>' +
                               '<td>'+zi(data[i].userPrivName)+'</td>' +
                               '<td>'+zi(data[i].deptName)+'</td>' +
                               '<td><a href="javascript:;" class="btnA editData"><fmt:message code="global.lang.edit" /></a><a href="javascript:;" class="btnA deleteData"><fmt:message code="global.lang.delete" /></a></td>' +
                               '</tr>';
                           for(var j=0;j<data[i].childs.length;j++){
                               str+= '<tr sId="'+data[i].childs[j].sid+'">' +
                                      '<td><a href="javascript:;" class="details">'+data[i].childs[j].typeName+'</a></td>' +
                                      '<td>'+zi(data[i].childs[j].userName)+'</td>' +
                                      '<td>'+zi(data[i].childs[j].userPrivName)+'</td>' +
                                      '<td>'+zi(data[i].childs[j].deptName)+'</td>' +
                                      '<td><a href="javascript:;" class="btnA editData"><fmt:message code="global.lang.edit" /></a><a href="javascript:;" class="btnA deleteData"><fmt:message code="global.lang.delete" /></a></td>' +
                                   '</tr>';
                           }
                       }else{
                           str+='<tr sId="'+data[i].sid+'">' +
                                  '<td><a href="javascript:;" class="details">'+data[i].typeName+'</a></td>' +
                                  '<td>'+zi(data[i].userName)+'</td>' +
                                  '<td>'+zi(data[i].userPrivName)+'</td>' +
                                  '<td>'+zi(data[i].deptName)+'</td>' +
                                  '<td><a href="javascript:;" class="btnA editData"><fmt:message code="global.lang.edit" /></a><a href="javascript:;" class="btnA deleteData"><fmt:message code="global.lang.delete" /></a></td>' +
                               '</tr>';
                       }
                   }
                   $('.pagediv tbody').append(str);
               }else{
                   $.layerMsg({content:'没有更多内容！',icon:5});
               }
           }
       })
   }

   //层级数据递归方法
    function digui(datas,sId) {
        var data=new Array();
        for(var i=0;i<datas.length;i++){
            if(!datas[i].parentId){
                datas[i]["parentId"]=0;
            }
            if(datas[i].parentId==sId){
                datas[i]["childs"]=digui(datas,datas[i].sid);
                data.push(datas[i]);
            }
        }
        return data;
    }
    //新建分类接口
    function newClassification(data){
         $.ajax({
             type:'post',
             url:'<%=basePath%>supervisionType/addSupervisionType',
             dataType:'json',
             data:data,
             success:function(res){
                 if(res.flag){
                     $.layerMsg({content:'<fmt:message code="depatement.th.Newsuccessfully" />！',icon:1});
                     init();
                 }else{
                     $.layerMsg({content:'<fmt:message code="depatement.th.Newfailed" />！',icon:2});
                 }
             }
         })
    }

    //编辑保存接口
    function editClassification(data){
        $.ajax({
            type:'post',
            url:'<%=basePath%>supervisionType/updateSupervisionType',
            dataType:'json',
            data:data,
            success:function(res){
                if(res.flag){
                    $.layerMsg({content:'<fmt:message code="menuSSetting.th.editSuccess" />！',icon:1});
                    init();
                }else{
                    $.layerMsg({content:'<fmt:message code="depatement.th.modifyfailed" />！',icon:2});
                }
            }
        })
    }

</script>
</body>
</html>
