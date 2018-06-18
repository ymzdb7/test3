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
    <title><fmt:message code="common.th.SeleDepart" /></title><%--选择部门--%>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/common/style.css" />
    <link rel="stylesheet" type="text/css" href="../css/common/select.css" />
    <!-- 	<link rel="stylesheet" type="text/css" href="../css/common/ui.dynatree.css"> -->
    <link rel="stylesheet" type="text/css" href="../css/common/org_select.css">
    <link rel="stylesheet" type="text/css" href="../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/easyui/themes/icon.css"/>
    <script type="text/javascript" src="../lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>
     <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>     <script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>    <script src="/js/base/base.js"></script>
    <script type="text/javascript" src="../lib/easyui/jquery.easyui.min.js" ></script>
    <script type="text/javascript" src="../lib/easyui/tree.js" ></script>
</head>
<style>
    #dept_menu{
        overflow-x: auto;
    }
    .left_choose ul li div,.left_choose ul li h1,.left_choose ul img{
        float:left;
    }
    .left_choose ul img{
    <!-- margin-top:8px; -->
    }
    .left_choose ul li{
        width:80%;
        height:20px;
    <!-- background:red; -->
        margin-top:10px;
    }
    .mar{
        margin-left:10%;
    }
    .name li{
        list-style-type:none;
    }
    .choose{
        background:#D6E4EF !important;
    }
</style>
<body>
<!-- //开始 -->
<!-- //头部 -->

<div id="north">
    <div id="navMenu" style="width:auto;">
        <a href="#" title='<fmt:message code="common.th.selPerson" />' class="tab_btn"  block="selected" hidefocus="hidefocus"><span><fmt:message code="common.th.selected" /></span></a><%--已选人员  已选--%>
        <a href="#" title='<fmt:message code="common.th.selByDepart" />' block="dept" hidefocus="hidefocus" class=" tab_btn active"><span><fmt:message code="userManagement.th.department" /></span></a><%--按部门选择   部门--%>

        <a href="#" block="query" class="tab_btn" hidefocus="hidefocus" style="display:none;"><span><fmt:message code="workflow.th.sousuo" /></span></a><%--搜索--%>
    </div>
    <div id="navRight" style="float:right;">
        <div class="search">
            <div class="search-body">
                <div class="search-input"><input notlogin_flag="" id="keyword" type="text" value=""></div>
                <div id="search_clear" class="search-clear" style="display:none;"></div>
            </div>
        </div>
    </div>
</div>

<!-- //内容 -->
<div>
    <div class="main-block" id="deptBox" style="display:block;">
        <div class="left moduleContainer" id="dept_menu">
            <div class="tree">
                <div class="pickCompany">
                    <span  class="childdept" style="display: none;">
                        <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 5px;margin-left: 5px;margin-bottom: 4px;">
                        <a href="javascript:void(0)" class="dynatree-title" onclick="initTree();"  id="companyName" title=""></a>
                    </span>
                </div>
                <ul class="dynatree-container dynatree-no-connector" style="margin-left: 10px;" id="deptOrg">
                </ul>
            </div>

        </div>
        <div class="right" id="dept_item">
            <div class="block-right" id="dept_item_2">
                <!-- 部门名 -->
                <div class="block-right-header" title=""></div>

                <div id="block-right-add" class="block-right-add"><fmt:message code="meet.th.addAll" /></div><%--全部添加--%>
                <div id="block-right-remove" class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>

                <div class="userItem">

                </div>
            </div>
        </div>
    </div>
    <!-- 已选 -->
    <div class="main-block" id="selectedDox" >
        <div class="left moduleContainer" id="dept_menu">
            <div class="tree">
                <ul class="dynatree-container dynatree-no-connector" id="deptOrg">
                </ul>
            </div>

        </div>
        <div class="right" id="dept_item">
            <div class="block-right" id="dept_item_2">
                <!-- 部门名 -->

                <div id="block-right-remove" class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>

                <div class="userItem">

                </div>
            </div>
        </div>
    </div>


</div>
<!-- //结束 -->
<div id="south">
    <input type="button" class="BigButtonA" value='<fmt:message code="global.lang.ok" />' onclick="close_window();">&nbsp;&nbsp;<%--确定--%>
</div>
</body>
<script>
    function quceil(arr){
        var res = [];
        var json = {};
        for(var i = 0; i < arr.length; i++){
            if(!json[arr[i]]){
                res.push(arr[i]);
                json[arr[i]] = 1;
            }
        }
        return res;
    }



    function close_window(){
        var itemsArr = $('#selectedDox .userItem .block-right-item');
        var itemnum=location.href.split('?')[1]
        if(itemnum==0){
            if(itemsArr.length>1){
                alert('<fmt:message code="common.th.onlyChooseOne" />')/*只能选择一个*/
                return
            }

        }
        var selectItemsId = '';
        var selectItemsName = '';
        var selectdeptNo = '';
        for(var i=0;i<itemsArr.length;i++){
            var obj = itemsArr.eq(i);
            selectItemsId+=(obj.attr("deptId")+',');
            selectItemsName+=(obj.attr("deptName")+',');
            selectdeptNo+=(obj.attr("deptNo")+',');
        };
        //alert(selectItemsId);
        var selectName=parent.opener.document.getElementById(parent.opener.dept_id).value;
        var selectDeptName= parent.opener.document.getElementById(parent.opener.dept_id).getAttribute('deptname');
        var selectDeptId=  parent.opener.document.getElementById(parent.opener.dept_id).getAttribute('deptId');
        var selectDeptNo=  parent.opener.document.getElementById(parent.opener.dept_id).getAttribute('deptNo');


//        if(selectItemsName.indexOf(selectName)!= -1&&selectItemsName.indexOf(selectDeptName)!= -1 &&selectItemsId.indexOf(selectDeptId)!=-1&&selectdeptNo.indexOf(selectDeptNo)!= -1){
//            $.layerMsg({content:'所属部门不能重复',icon:2});
//            return;
//        }
//        if(selectName.indexOf(selectItemsName)!= -1&&selectDeptName.indexOf(selectItemsName)!= -1 &&selectDeptId.indexOf(selectItemsId)!=-1&&selectDeptNo.indexOf(selectdeptNo)!= -1){
//            $.layerMsg({content:'所属部门不能重复',icon:2});
//            return;
//        }


        if(selectName!=""){
            var arr=(parent.opener.document.getElementById(parent.opener.dept_id).value+selectItemsName).replace('null',"")
            var result=arr.split(',');
            var res = [];
            var json = {};
            for(var i = 0; i < result.length; i++){
                if(!json[result[i]]){
                    res.push(result[i]);
                    json[result[i]] = 1;
                }
            }
            res.join(',')
            parent.opener.document.getElementById(parent.opener.dept_id).value=res;
        }else{
            parent.opener.document.getElementById(parent.opener.dept_id).value=selectItemsName;
        }



        if(selectDeptName!=""){
            var arr1=(selectDeptName+selectItemsName).replace('null',"");
            var result1=arr1.split(',');
            var res1 = [];
            var json1 = {};
            for(var i = 0; i < result1.length; i++){
                if(!json1[result1[i]]){
                    res1.push(result1[i]);
                    json1[result1[i]] = 1;
                }
            }
            res1.join(',')
            parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptname',res1);
        }else{
            parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptname',selectItemsName);
        }

        if(selectDeptId!=""){
            var arr2=(selectDeptId+selectItemsId).replace('null',"");
            var result2=arr2.split(',');
            var res2 = [];
            var json2 = {};
            for(var i = 0; i < result2.length; i++){
                if(!json2[result2[i]]){
                    res2.push(result2[i]);
                    json2[result2[i]] = 1;
                }
            }
            res2.join(',')
            parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptId',res2);
        }else{
            parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptId',selectItemsId);
        }

        if(selectDeptNo!=""){
            var arr3=(selectDeptNo+selectdeptNo).replace('null',"");
            var result3=arr3.split(',');
            var res3 = [];
            var json3 = {};
            for(var i = 0; i < result3.length; i++){
                if(!json3[result3[i]]){
                    res3.push(result3[i]);
                    json3[result3[i]] = 1;
                }
            }
            res3.join(',')
            parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptNo',res3);
        }else{
            parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptNo',selectdeptNo);
        }


//        parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptname',selectItemsName);
//        parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptId',selectItemsId);
//        parent.opener.document.getElementById(parent.opener.dept_id).setAttribute('deptNo',selectdeptNo);

        window.close();
    }

    var initTree ;
    $(function(){
        var globalIndex = 0;
        initTree = function(){
            $('#deptOrg').tree({
                url: '../department/getChDeptfq?deptId=0',
                animate:true,
                loadFilter: function(node){
                    var arr = convert(node.obj);
                    return arr;
                },
                onClick:function(node){
                    build(node.id);
                    $(this).tree(node.state === 'closed' ? 'expand' : 'collapse', node.target);
                    node.state = node.state === 'closed' ? 'open' : 'closed';
                },
                onBeforeExpand:function(node,param){
                    $('#deptOrg').tree('options').url = "../department/getChDeptfq?deptId=" + node.id;// change the url
                }

            });
        };
        $.ajax({
            url:'../sys/showUnitManage',
            type:'get',
            dataType:'json',
            success:function(obj){
                $('#companyName').html(obj.object.unitName);
                $('.childdept').show();
                initTree();
            }
        });


        function TreeNode(id,text,state,children){
            this.id = id;
            this.text = text;
            this.state = state;
            this.children = children;
        }
        function convert(data){
            var arr = [];
            var tr = '';
            data.forEach(function(v,i){
                if(v.deptId){
                    var node = new TreeNode(v.deptId,v.deptName,"closed")
                    arr.push(node);
                    tr+='<div class="block-right-item" deptNo="'+v.deptNo+'" deptName="'+v.deptName+'" id="'+v.deptId+'" deptId="'+v.deptId+'" title="'+v.deptName+'"><span class="name">'+v.deptName+'<span class="status"></span></span></div>';

                }
            });
           $('#deptBox .userItem').html(tr);
            return arr;
        }
        //组织
        $('.tab_btn').click(function(){
            var type = $(this).attr('block');
            $(this).addClass("active").siblings().removeClass('active');
            switch(type){
                case "selected":
                    $('#selectedDox').show().siblings().hide();
                    break;
                case "dept":
                    $('#deptBox').show().siblings().hide();
                    break;
                case "priv":

                    break;
                case "group":

                    break;
                case "query":

                    break;
            }
        });
        function build(id){
            $.ajax({
                url:'../department/getChDept?deptId='+id,
                type:'get',
                dataType:'json',
                success:function(obj){
                    if(obj.flag){
                        var data = obj.obj;
                        var tr = '';
                        data.forEach(function(v,i){
                            if(v.deptId){

                                tr+='<div class="block-right-item" deptNo="'+v.deptNo+'" deptName="'+v.deptName+'" id="'+v.deptId+'" deptId="'+v.deptId+'" title="'+v.deptName+'"><span class="name">'+v.deptName+'<span class="status"></span></span></div>';
                            }
                        });

                        $('#deptBox .userItem').html(tr);

                    }
                }
            });
        }
        $('#dept_item').on("click",".block-right-item",function(){
            var that = $(this);
            if(that.attr('class').indexOf('active') > 0){
                that.removeClass("active");
                if( $('#selectedDox .userItem #'+that.attr('deptId')).length > 0){

                    $('#selectedDox .userItem #'+that.attr('deptId')).remove();
                }
            }else{

                var divObj = $(that.prop("outerHTML"));
                divObj.addClass("active");
                that.addClass("active");


                if( $('#selectedDox .userItem #'+that.attr('deptId')).length < 1){
                    $('#selectedDox .userItem').append(divObj);
                }

            }

        });

        $('#selectedDox #block-right-remove').on('click',function () {
            $('#selectedDox .userItem .block-right-item').each(function() {
                if( $('#deptBox .userItem #'+$(this).attr('deptid')).length > 0){
                    $('#deptBox .userItem #'+$(this).attr('deptid')).removeClass('active');
                }
            });
            $('#selectedDox .userItem .block-right-item').remove();
        });

        $('#selectedDox .userItem ').on('click','.block-right-item',function () {
            $('#deptBox .userItem #'+$(this).attr('deptid')).removeClass('active');
            $(this).remove();
        });

        $('#deptBox #block-right-add').on('click',function () {
            $('#deptBox .userItem .block-right-item').addClass('active');
            var str  = '';
            $('#deptBox .userItem .active').each(function (i,v) {
                if( $('#selectedDox .userItem #'+$(this).attr('deptid')).length < 1){
                    str += $(this).prop("outerHTML");
                }
            });
            $('#selectedDox .userItem').append(str);
        });

        $('#deptBox #block-right-remove').on('click',function () {
            $('#deptBox .userItem .active').each(function (i,v) {

                if( $('#selectedDox .userItem #'+$(this).attr('deptid')).length > 0){

                    $('#selectedDox .userItem #'+$(this).attr('deptid')).remove();
                }
            });
            $('#deptBox .userItem .block-right-item').removeClass('active');
        });

        $('.tree .dynatree-container').on('click','.childdept',function(){
            var  that = $(this);
            getChDept(that.next(),that.attr('deptid'));
            var title=that.find('a').text();
            $('.block-right-header').html(title);
        });

        $('.block-right').on('mouseover','div',function(){
            $(this).addClass('hover');
        });
        $('.block-right').on('mouseout','div',function(){
            $(this).removeClass('hover');
        });
    });
</script>
</html>