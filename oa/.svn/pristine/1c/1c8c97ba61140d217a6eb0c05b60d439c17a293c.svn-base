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
<head lang="en">
    <meta charset="UTF-8">
    <title><fmt:message code="document.th.Sealmanagement" /></title>
    <%--<link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="../lib/pagination/style/pagination.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="../css/base.css"/>--%>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.ui.widget.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.iframe-transport.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jQuery-File-Upload-master/jquery.fileupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js"></script>
    <script src="/js/ajaxupload.js" type="text/javascript" charset="utf-8"></script>
    <script src="/lib/jquery.form.min.js"></script>

    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            font-family: 微软雅黑;
        }
        .bx{
            width: 100%;
        }
        .navigation{
            height: 70px;
            width: 100%;
            border-bottom: #ccc 1px solid;
            line-height: 70px;
        }
        .navigation img{
            float: left;
            margin-top: 20px;
            margin-left: 30px;
            margin-right: 10px;
        }
        .navigation .news{
            float:left;
            font-size: 22px;
        }
        .tab{
            margin: 10px auto;
        }
        a{
            text-decoration: none;
        }
        .tab tr{
            border:#ccc 1px solid;
        }
        .tab tr td{
            border-right: #ccc 1px solid;
            padding: 6px;
            font-size: 14px;
        }
        .tab tr td input[type="text"]{
            height: 28px;
            width: 260px;
            padding-left: 5px;
        }
        .tab tr td select{
            height: 28px;
            width: 200px;
        }
        .divBtn{
            width: 100%;
        }
        .divBtn .buildSeal{
            background: url("../img/document/btn_makeseal_03.png");
            font-size: 14px;
            margin: 10px auto;
            width: 93px;
            height: 28px;
            line-height: 28px;
            /*border: #ccc 1px solid;*/
            /*border-radius: 5px;*/
            /*text-align: center;*/
            cursor: pointer;
        }
        .imgBox{
            margin: 10px auto;
            width: 200px;
            height: 200px;
        }
        .changeFile{
            margin: 10px auto;
            text-align: center;
            width: 120px;
            height: 28px;
            border-radius: 5px;
            border: #ccc 1px solid;
            cursor: pointer;
            line-height: 28px;
        }
        a{
            cursor:pointer;
        }
    </style>
</head>
<body>
<div class="bx">
    <!--head开始-->
    <%--<div class="head w clearfix">--%>
        <%--<ul class="index_head">--%>
           <%--<li data_id="0" data-num="0"><span class="one headli1_1"><fmt:message code="document.th.To-doList" /></span><img class="headli1_2" src="../img/twoth.png" alt=""/>--%>
            <%--</li>--%>
            <%----%>
            <%--<li data_id="" data-num="1"><span class="headli2_1"><fmt:message code="document.th.InOffice" /></span><img src="../img/twoth.png" alt="" class="headli2_2"/>--%>
            <%--</li>--%>
                    <%----%>
           <%--<li data_id="1" data-num="2"><span class="headli3"><fmt:message code="document.th.AnOfficial" /></span></li>--%>
           <%----%>
        <%--</ul>--%>
        <%--<div class="new_liucheng" style="padding-left:25px;margin-top: 10px;"><h1 style="line-height: 30px;overflow: hidden;text-overflow: ellipsis;white-space: normal;width: 70px" ><fmt:message code="document.th.NewOfficial" /></h1></div>--%>
    <%--</div>--%>
    <!--head通栏结束-->

    <!--navigation开始-->
        <div class="navigation  clearfix">
            <img src="/img/commonTheme/${sessionScope.InterfaceModel}/yinzhang.png">
            <div class="news">
                <fmt:message code="document.th.Sealmaking" />
            </div>
        </div>

        <!--navigation结束-->

        <!--content部分开始-->
        <div class="content">
            <table cellspacing="0" cellpadding="0" class="tab" style="border-collapse:collapse;background-color: #fff;width: 50%;">
                <tr>
                    <td><fmt:message code="document.th.SealId" /></td>
                    <td><input type="text" name="years" value="2017"  id="sealId1" disabled style="width: 120px;"><span>-</span><input type="text" name="number" id="sealId2" value="" maxlength="2" style="width: 120px;"><span>-</span><input type="text" value="" id="sealId3" disabled style="width: 120px;"></td>
                    <%--<td rowspan="9" style="width: 45%;">--%>
                        <%--<div class="imgBox"></div>--%>
                        <%--<div class="changeFile"><span>选择BMP文件</span></div>--%>
                    <%--</td>--%>
                </tr>
                <tr>
                    <td><fmt:message code="document.th.SealName" /></td>
                    <td><input type="text" name="sealName" value="" id="sealName"></td>
                </tr>
              <%--  <tr>
                    <td>印章密码</td>
                    <td><input type="text" name="sealName" value=""></td>
                </tr>
                <tr>
                    <td>确认密码</td>
                    <td><input type="text" name="sealName" value=""></td>
                </tr>--%>
                <tr>
                    <td><fmt:message code="document.th.SealDept" /></td>
                    <td>
                        <%--<select name="sealDept" id="sealDept">--%>
                            <%--&lt;%&ndash;<option value="1">董事会</option>&ndash;%&gt;--%>
                        <%--</select>--%>
                            <input class="td_title1" type="text" style="width: 200px"  id="sealDept" />

                            <a class="release3 addDept"><fmt:message code="global.lang.add" /></a>
                            <a class="release3 clearDept"><fmt:message code="notice.th.delete1" /></a>
                    </td>
                </tr>
              <%--  <tr>
                    <td>图片宽度</td>
                    <td><input type="text" name="picWidth" value=""><span>mm</span></td>
                </tr>
                <tr>
                    <td>图片宽度</td>
                    <td><input type="text" name="picHeight" value=""><span>mm</span></td>
                </tr>
                <tr>
                    <td>印章大小</td>
                    <td>
                        <select name="sealSize" id="sealSize">
                            <option value="1">图片与印章等大</option>
                            <option value="2">图片2倍与印章</option>
                            <option value="3">图片3倍与印章</option>
                        </select>
                        <span style="font-size: 12px;">图片大，则印章打印清晰</span>
                    </td>
                </tr>
                <tr>
                    <td>图片深度</td>
                    <td>
                        <select name="sealDepth" id="sealDepth">
                            <option value="1">单色显示</option>
                            <option value="2">16色显示</option>
                            <option value="3">256色显示</option>
                            <option value="4">24位真彩色</option>
                        </select>
                        <span style="font-size: 12px;">色彩位数越高，打印越清晰</span>
                    </td>
                </tr>--%>
                <tr>
                    <td><fmt:message code="document.th.Sealdocument" /></td>
                    <td>
                        <div class="attmend"></div>
                        <form id="uploadimgform" target="uploadiframe"  action="/upload?module=seal"  method="post" >
                            <input type="file" multiple="multiple" name="file" id="uploadinputimg"  class="w-icon5" style="position: absolute;opacity: 0;width: 70px;
filter: progid:DXImageTransform.Microsoft.Alpha(opacity=0)">
                            <a href="#" id="uploadimg"><img style="margin-right:5px;" src="../img/icon_uplod.png"/><fmt:message code="global.th.fileup" /></a>
                        </form>
                    </td>
                </tr>
            </table>
            <div class="divBtn">
                <div class="buildSeal"><span style="margin-left: 30px;"  id="makeSeal"><fmt:message code="document.th.Generateseal" /></span></div>
            </div>
        </div>
</div>

<script>
    $(function(){
        // 添加部门信息
        $(".addDept").on("click",function(){
            dept_id="sealDept";
            $.popWindow("../common/selectDept");
        });
        // 清空部门信息
        $('.clearDept').click(function () {
            $('#sealDept').attr("deptid","");
            $('#sealDept').attr("deptno","");
            $('#sealDept').val("");
        });
        //$('#sealDept').deptSelect();

        //附件上传
//        $('#uploadimg').on('click', function(ele) {
//            $('#uploadinputimg').click();
//        })
        <%--$('#uploadinputimg').change(function(e){--%>
            <%--var target = $(e.target);--%>
            <%--var file;--%>
            <%--if(target[0].files && target[0].files[0]){--%>
                <%--file=target[0].files[0];--%>
            <%--}--%>
            <%--if(file){--%>
                <%--$('#uploadimgform').ajaxSubmit({--%>
                    <%--type:'post',--%>
                    <%--dataType:'json',--%>
                    <%--success:function (res) {--%>
                        <%--console.log(res)--%>
                        <%--var data=res.obj;--%>
                        <%--var str='';--%>
                        <%--var str1='';--%>
                        <%--for(var i=0;i<data.length;i++){--%>
                            <%--str+='<div class="dech" deUrl="'+data[i].attUrl+'"><a href="<%=basePath %>download?'+data[i].attUrl+'" NAME="'+data[i].attachName+'*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>'+data[i].attachName+'</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="'+data[i].aid+'@'+data[i].ym+'_'+data[i].attachId+',"></div>';--%>
                        <%--}--%>
                        <%--$('.attmend').append(str);--%>
                    <%--}--%>
                <%--})--%>
            <%--}--%>
        <%--});--%>

        $('#uploadinputimg').fileupload({
            dataType:'json',
            done: function (e, data) {
                if(data.result.obj != ''){
                    var data = data.result.obj;
                    var str = '';
                    var str1 = '';
                    for (var i = 0; i < data.length; i++) {
                        str += '<div class="dech" deUrl="' + data[i].attUrl+ '"><a href="<%=basePath %>download?'+encodeURI(data[i].attUrl)+'" NAME="' + data[i].attachName + '*"><img style="margin-right:10px;" src="../img/attachment_icon.png"/>' + data[i].attachName + '</a><img class="deImgs" style="margin-left:5px;cursor: pointer;" src="../img/file/icon_deletecha_03.png"/><input type="hidden" class="inHidden" value="' + data[i].aid + '@' + data[i].ym + '_' + data[i].attachId + ',"></div>';
                    }
                    $('.attmend').append(str);
                }else{
                    //alert('添加附件大小不能为空!');
                    layer.alert('添加附件大小不能为空!',{},function(){
                        layer.closeAll();
                    });
                }
            }
        });

        //附件删除
        $('.attmend').on('click','.deImgs',function(){
            var data=$(this).parents('.dech').attr('deUrl');
            var dome=$(this).parents('.dech');
            deleteChatment(data,dome);
        })

    })

 /*   $('#sealId1').val().toString()+$('#sealId2').val().toString()+$('#sealId3').val().toString();*/
  //失去焦点时获取印章编号
    $("#sealId2").blur(function(){
        if($('#sealId2').val()==""){
            $.layerMsg({content: "<fmt:message code="document.th.NoID" />", icon: 2}, function () {
            });
        }else{
            $.ajax({
                url: '/seal/getSealIdById',
                dataType: 'json',
                data: {id:$('#sealId1').val().toString()+$('#sealId2').val().toString()},
                success: function (obj) {
                    if(obj.object!=undefined)
                    {
                        $('#sealId3').val(obj.object);
                    }

                }
            })
        }
    });


   $('#makeSeal').click(function() {
       var sealId = $('#sealId1').val().toString() + $('#sealId2').val().toString() + $('#sealId3').val().toString();
       var sId='';
       var uId='';
       for(var i=0;i<$('.attmend .inHidden').length;i++){
           sId += $('.attmend .inHidden').eq(i).val();
       }
       for(var i=0;i<$('.attmend .inHidden').length;i++){
           uId += $('.attmend a').eq(i).attr('NAME');
       }
      /* var sId = $('.attmend .inHidden').val();
       var uId = $('.attmend a').attr('NAME');*/
       var sealName=$('#sealName').val();
       data = {
           sealId: sealId,
           sealName: $('#sealName').val(),
           deptId: $('#sealDept').attr('deptid'),
           attachmentId: sId,
           attachmentName: uId
       }
       if (sId == "" || sId == undefined) {
           $.layerMsg({content: "<fmt:message code="document.th.pleaseSealaccessories" />", icon: 2}, function () {
           });
       } else {
           //判断附件格式是否正确
           var s = uId.substring(uId.length - 5, uId.length - 1);
           var arr = uId.split("*");
           if (arr.length <= 2) {
           //如果不是正确的附件
           if (s != ".sel") {
               $.layerMsg({
                   content: "<fmt:message code="document.th.pleaseCorrectAttach" />",
                   icon: 2
               }, function () {
               });
           } else {
               if ($('#sealId2').val().toString() != "") {
                   //自定义印章名称不能为空
                   if (sealName == "") {
                       $.layerMsg({
                           content: "<fmt:message code="document.th.NosealName" />",
                           icon: 2
                       }, function () {
                       });
                   } else {
                       $.ajax({
                           url: '/seal/getSealLogBySealId',
                           dataType: 'json',
                           data: {sealId: sealId},
                           success: function (obj) {
                               if (obj.object == undefined) {
                                   $.ajax({
                                       url: '/seal/addSealObject',
                                       dataType: 'json',
                                       data: data,
                                       success: function (obj) {
                                           if (obj.flag) {
                                               $.layerMsg({
                                                   content: "<fmt:message code="document.th.Successfulproduction" />",
                                                   icon: 1
                                               }, function () {
                                                   document.location.reload()
                                               });
                                           }
                                       }
                                   })
                               } else {
                                   $.layerMsg({
                                       content: "<fmt:message code="document.th.pleaseNorepeatID" />",
                                       icon: 2
                                   }, function () {
                                   });
                               }
                           }
                       })
                   }

               }
               else {
                   $.layerMsg({content: "<fmt:message code="document.th.pleaseID" />", icon: 2}, function () {
                   });
               }
           }
       }else{
               $.layerMsg({content: "<fmt:message code="document.th.pleaseOneAttach" />", icon: 2}, function () {
               });
           }
   }
    })

    //删除附件
    function deleteChatment(data,element){

        layer.confirm('<fmt:message code="menuSSetting.th.isdeleteMenu" />？', {/*确定要删除吗*/
            btn: ['<fmt:message code="global.lang.ok" />','<fmt:message code="depatement.th.quxiao" />'], //按钮 /*确定 取消*/
            title:'<fmt:message code="notice.th.DeleteAttachment" />' /*删除附件*/
        }, function(){
            //确定删除，调接口
            $.ajax({
                type:'get',
                url:'../delete',
                dataType:'json',
                data:data,
                success:function(res){

                    if(res.flag == true){
                        layer.msg('<fmt:message code="workflow.th.delsucess" />', { icon:6});/*删除成功*/
                        element.remove();
                    }else{
                        layer.msg('<fmt:message code="lang.th.deleSucess" />', { icon:6});/*删除失败*/
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
