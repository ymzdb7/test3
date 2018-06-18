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
    <title>设计流程</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <link rel="stylesheet" type="text/css" href="../../css/workflow/index.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../../lib/easyui/themes/icon.css"/>
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js" ></script>
    <script type="text/javascript" src="../../lib/easyui/jquery.easyui.min.js" ></script>
    <script type="text/javascript" src="../../lib/easyui/tree.js" ></script>
    <script type="text/javascript" src="../../js/index.js" ></script>

    <style>
        .head {
            width: 100%;
            height: 45px;
            background: #fff;
            border-bottom: 1px solid #919191;
        }

        .wrap {
            width: 101%;
            height: 100%;
            overflow: hidden;
        }
        .cont_left {
            width: 15%;
            height:100%;
            border-right: 1px solid #919191;
            overflow-y: scroll;
        }
        .noDatas {margin-top:10px;}
        .noDatas_pic {margin-top:20%;}
        .noData_out{margin:0 auto;text-align:center;}
        .head_rig h1 {
            /*width:78px;*/
            /*height:30px;*/
            /*font-size:13px !important;*/
            /*background-image:url(../../img/workflow/btn_new_nor_03.png),url(../../img/workflow/icon_plus_03.png);*/
            /*cursor:pointer;*/
            /*background-repeat:no-repeat;*/
        }
        .search h1 {
            text-align: center;
            color: #fff;
            font-size: 14px;
            line-height: 28px;
            background-image:url(../../img/workflow/btn_check_nor_03.png);
            background-repeat:no-repeat;
        }
        .cont_rig {
            width: 84%;
            height: 91%;
            overflow-y: scroll;
        }
        .head_rig {width: 10%;margin-top:0px;}
        .head_rig {
            background-repeat:no-repeat;
            background-image:url(../../img/work/flow/btn_new_nor_03.png);
        }
        .cont_left {
            width: 15%;
            height: 100%;
            border-right: 1px solid #000;
            overflow-y: scroll;
        }
        .head_rig h1 :hover{
            cursor:pointer;
        }
        .inp {
            width: 214px;
            height: 30px;
            border-radius: 4px;
            border: 1px solid #c0c0c0;
        }
        .search {}
        .new_excell_pic{
            border-radius: 0;border: none; width: 70px;height: 70px;margin:10px 24px 10px 20px;
        }
        .deldel{
            color: #fff;font-size: 12px;float: right;margin-right: 10px;margin-left: 10px;line-height: 28px;cursor: pointer;
        }
        .footer_span_space{
            color: #fff;font-size: 12px;float: right;margin-right: 10px;line-height: 28px;cursor: pointer;
        }
        .edit{
            color: #fff;font-size: 12px;float: right;margin-right: 10px;margin-left: 10px;line-height: 28px;cursor: pointer;
        }
        .deldel_img{
            float: right;height: 15px;margin-top: 7px;
        }
        .edit_img{
            float: right;height: 15px;margin-top: 7px;
        }
        .new_excell_footer {
            width: 100%;
            height: 28px;
            position: relative;
            background-color: #59bdf0;
        }
        .new_excell_head {
            position: relative;
            width: 100%;
            height: 30px;
        }
        .new_excell_name {
            border-left: 4px solid #59bdf0;
            color: #59bdf0;
            position: absolute;
            bottom: 0;
            font-size: 16px;
            font-weight: 700;
            height: 24px;
            margin-left: 15px;
            width: 15em;
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .new_excell_info {
            width: 100%;
            height: 116px;
            position: relative;
        }
        .new_excell_center {
            margin-left: 6%;
        }
        .new_excell_info_main {
            width: 100%;
            height: 62px;
            position: absolute;

        }

        .new_excell_info_other {
            position: absolute;
            top: 10px;
            height: 100%;
            margin-left:45px;
            margin-top:10px;
            list-style-type: none;
            left: 20%;
        }

        .new_excell_main {
            width:285px;
            height: 174px;
            border: 1px solid #ddd;
            margin: auto;
            margin-top: 10px;
            border-radius: 5px;
            margin-left:40px
        }
        .new_excell_main:hover {
            border: 2px solid #59bdf0;
        }
        .new_excell_info_mian_pic {
            float:left;
        }
        .new_excell {
            width: 318px;
            height: 191px;
            float:left;
            margin-left: 0px;
            margin-right:0px;
        }
        .new_excell_info_other span {
            margin-left: 10px;
            color: black;
        }
        .new_excell_info_other span {
            margin-left: 10px;
        }
        .new_excell_info_other li {
            height: 50%;
            line-height: 24px;
            font-size: 20px;
        }
        user agent stylesheet li {
            display: list-item;
            text-align: -webkit-match-parent;
        }
        .cont_left::-webkit-scrollbar{
            width: 4px;
            height: 16px;
            background-color: #f5f5f5;
        }

        .cont_left::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        .cont{
            width: 100%;
            height: 101%;
            overflow-y: hidden;
        }

        .cont_left::-webkit-scrollbar-thumb{
            /*width: 10px;*/
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }


        .cont_left::-webkit-scrollbar{
            width: 4px;
            height: 16px;
            background-color: #f5f5f5;
        }

        .cont_left::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        .cont_left::-webkit-scrollbar-thumb{
            /*width: 10px;*/
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }
        .cont_rig::-webkit-scrollbar{
            width: 4px;
            height: 16px;
            background-color: #f5f5f5;
        }

        .cont_rig::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }


        .cont_rig::-webkit-scrollbar-thumb{
            /*width: 10px;*/
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }


        .cont_rig::-webkit-scrollbar{
            width: 4px;
            height: 16px;
            background-color: #f5f5f5;
        }

        .cont_rig::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        .cont_rig::-webkit-scrollbar-thumb{
            /*width: 10px;*/
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;}
        .head_left_pic {
            display: inline-block;
            margin-top: 15px;
            float: left;
            margin-left: 30px;
            width: 22px;
            height: 21px;

        }
        .head_left_pic img{
            width:22px;
            height:21px;
        }
        .head_left h1 {
            color: #333333;
            font-size: 16pt!important;
            height: 100%;
            line-height: 50px;
            /* text-align: center; */
            margin-left: 7px;
            float: left;
        }
        .new_liucheng{
            background: url("/img/cabinet01.png") no-repeat;
            color: #fff;
            border-radius: 6px;
            position: absolute;
            right: 3px;
            cursor: pointer;
            height:30px;
            line-height: 30px;
            font-size:12pt;
            width: 100px;
            text-align: center;
            margin-top:10px;
        }
        .tree-node-hover {
            background: #d1ecff!important;
        }
        .tree-node-selected{
            background: #b6e0ff!important;

        }
    </style>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>
</head>
<body>

<div class="wrap">
    <div class="head">
        <div class="head_left">
            <div class="head_left_pic"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_processdesign_03.png"></div>
            <h1><fmt:message code="workflow.th.design" /></h1>
        </div>
        <div class="head_mid clearfix">
            <div style="position: relative;float: left">
            <input  id="flow_search_value" class="inp" type="text" placeholder="&nbsp;<fmt:message code="workflow.th.tiaojian" />">
                <div id="btn_search" style="position: absolute;right: 2px;top: 11px;" class="search"><h1 style="cursor:pointer;">
                    <img src="../../img/reaschbutton.png" alt=""></h1></div>
            </div>

        </div>
        <div class="head_rig">
            <a href="../../flowSetting/flowSettingMain?type=add"  target="_blank">
                <h1 class="new_liucheng" style='background-image:url(../../img/work/flow/btn_new_nor_03.png) no-reapt;'><img style="margin-right: 4px;margin-left: -10px;margin-bottom: -1px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="global.lang.new" /></h1>
            </a>
        </div>
    </div>

    <div class="cont">
        <div class="cont_left">
            <div class="left_all">
                <div class="ul_all" id="li_parent">
                    <%--<li><img src="/../img/workflow/wenjian.png"><h1>公文管理</h1></li>--%>
                    <%--<li><img src="../../img/workflow/wenjian.png"><h1>公文管理</h1></li>--%>
                    <%--<li><img src="../../img/workflow/wenjian.png"><h1>公文管理</h1></li>--%>
                    <%--<li><img src="../../img/workflow/wenjian.png"><h1>公文管理</h1></li>--%>
                    <%--<li><img src="../../img/workflow/wenjian.png"><h1>公文管理</h1></li>--%>
                    <%--<li><img src="../../img/workflow/wenjian.png"><h1>公文管理</h1></li>--%>
                </div>
            </div>

        </div>

        <div class="cont_rig">
        </div>
    </div>
    <div class="footer">
    </div>
</div>
</body>
<script type="text/javascript">

    $(function () {
        $("#btn_search").click(function (event) {
            var search_value=  $("#flow_search_value").val();
            $.post("../../flow/flowBySearch",{searchValue:search_value} ,function (ret) {

                if(ret.flag==true){
                    renderDatas(ret.obj);
                    bindClick();
                }else{
                    renderNoDatas();
                }
            },"json");

        })



        //获取左侧分类
        $('.cont_rig').on('click','.new_excell',function(){
            defaultStatus

        })
        var data=[{"dataId":"1","children":[{"dataId":"13","children":[],"checked":false,"attributes":{"id":13,"type":"0"},"id":"13","state":null,"text":"行政办公制度","url":null,"parentId":"1"},{"dataId":"43","children":[],"checked":false,"attributes":{"id":43,"type":"0"},"id":"43","state":null,"text":"人力资源开发与管理制度","url":null,"parentId":"1"},{"dataId":"44","children":[],"checked":false,"attributes":{"id":44,"type":"0"},"id":"44","state":null,"text":"采购报销和备用金制度","url":null,"parentId":"1"}],"checked":false,"attributes":{"id":1,"type":"0"},"id":"1","state":null,"text":"公司管理制度","url":null,"parentId":"0"},{"dataId":"39","children":[{"dataId":"45","children":[],"checked":false,"attributes":{"id":45,"type":"0"},"id":"45","state":null,"text":"综合管理部职能分配","url":null,"parentId":"39"},{"dataId":"46","children":[],"checked":false,"attributes":{"id":46,"type":"0"},"id":"46","state":null,"text":"财务管理制度","url":null,"parentId":"39"},{"dataId":"47","children":[],"checked":false,"attributes":{"id":47,"type":"0"},"id":"47","state":null,"text":"项目部项目管理规范","url":null,"parentId":"39"}],"checked":false,"attributes":{"id":39,"type":"0"},"id":"39","state":null,"text":"部门管理制度","url":null,"parentId":"0"},{"dataId":"3","children":[],"checked":false,"attributes":{"id":3,"type":"0"},"id":"3","state":null,"text":"公司大事记","url":null,"parentId":"0"},{"dataId":"40","children":[{"dataId":"41","children":[],"checked":false,"attributes":{"id":41,"type":"0"},"id":"41","state":null,"text":"系统使用","url":null,"parentId":"40"},{"dataId":"42","children":[],"checked":false,"attributes":{"id":42,"type":"0"},"id":"42","state":null,"text":"公司知识库","url":null,"parentId":"40"}],"checked":false,"attributes":{"id":40,"type":"0"},"id":"40","state":null,"text":"学习资料","url":null,"parentId":"0"},{"dataId":"10","children":[],"checked":false,"attributes":{"id":10,"type":"0"},"id":"10","state":null,"text":"文档标准","url":null,"parentId":"0"}]
        $('#li_parent').tree({
            url: '../../workflow/flowclassify/flowJsTree',
            animate:true,
            lines:false,
            loadFilter: function(rows){

                return convert(rows.datas);
            },
            onClick:function(node){

                getFlowList(node.id);
                if(node.state=='closed'&&(!$("#tree").tree('isLeaf',node.target))){  //状态为关闭而且非叶子节点
                    $(this).tree('expand',node.target);//点击文字展开菜单
//                    if (node.attributes && node.attributes.url) {
//
//                    }
                }else{
                    if($("#tree").tree('isLeaf',node.target)){  //状态为打开而且为叶子节点
//                        if (node.attributes && node.attributes.url) {
//
//                        }
                    }else{
                        $(this).tree('collapse',node.target);//点击文字关闭菜单
                    }
                }






            },
            onLoadSuccess:function(node,data) {
                defaultRenderLi(-1);
                getFlowList(null);
            },

        });
        function defaultRenderLi(nodeId){
            $("#li_parent li").find("div[node-id='"+nodeId+"']").addClass("tree-node-selected");   //设置第一个节点高亮
            var n = $("#li_parent").tree("getSelected");
            if(n!=null){
                $("#li_parent").tree("select",n.target);    //相当于默认点击了一下第一个节点，执行onSelect方法
            }
        }


        //处理树结构
        function convert(rows){
            function exists(rows, parentId){
                for(var i=0; i<rows.length; i++){
                    if (rows[i].sortId == parentId) return true;
                }
                return false;
            }
            var nodes = [];
            // get the top level nodes
            for(var i=0; i<rows.length; i++){
                var row = rows[i];

                if (!exists(rows, row.sortParent)){
                    nodes.push({
                        id:row.sortId,
                        text:row.sortName,
                    });
                }
            }
            var toDo = [];
            for(var i=0; i<nodes.length; i++){
                toDo.push(nodes[i]);
            }
            while(toDo.length){
                var node = toDo.shift();	// the parent node
                // get the children nodes
                for(var i=0; i<rows.length; i++){
                    var row = rows[i];
                    if (row.sortParent == node.id){
                        var child = {id:row.sortId,text:row.sortName};
                        if (node.children){
                            if(node.id!=0){
                                node.state="closed"
                            }
                            node.children.push(child);
                        } else {

                            node.children = [child];
                        }
                        toDo.push(child);
                    }
                }
            }
            return nodes;
        }

        function getFlowList(sortId) {
            $.post("../../flow/flowlistbysort",{flowId:sortId} ,function (ret) {

                if(ret.flag==true){
                    renderDatas(ret.obj);
                    bindClick();
                }else{
                    renderNoDatas();
                }
            },"json");
        }
        function bindClick() {
            $(".set").click(function () {
                var flowId= $(this).attr("flow_id");
                window.open("../../flowSetting/flowSettingMain?type=edit&flowId="+flowId);
            })
            $(".deldel").click(function () {
                var formId= $(this).attr("formId");
                window.open("/flowSetting/processDesignTool?flowId="+formId);
            })

        }

        function renderNoDatas() {
            var html='<div class="noData_out"><div class="noDatas_pic"><img src="../../img/workflow/img_nomessage_03.png"></div><div class="noDatas" ><fmt:message code="sys.th.NoProcess" /></div></div>';
            $(".cont_rig").html(html);
        }


        function renderDatas(data) {
            var html="";
            var typeName="<fmt:message code="sys.th.Undefined" />";
            var img_url="";
            for(var i =0 ;i<data.length;i++){
                if(data[i].flowType==1){
                    //固定
                    typeName="<fmt:message code="workflow.th.fixedflow" />";
                    img_url="../../img/workflow/icon_fixedprocess_03.png";
                }
                if(data[i].flowType==2){
                    //自由
                    typeName="<fmt:message code="workflow.th.freeflow" />";
                    img_url="../../img/workflow/icon_freeprocess_03.png";
                }
                //if(i%3==0) {html+='<div class="new_excell_center">';}
                html+=  ' <div class="new_excell" id="new_excell1">'+
                    '<div class="new_excell_main">'+
                    '<a class="set" flow_id="'+data[i].flowId+'" href="javascript:void(0)">'+
                    '<div class="new_excell_head">'+
                    '<span class="new_excell_name">&nbsp;'+data[i].flowName+'</span></div>'+
                    '<div class="new_excell_info"><div class="new_excell_info_main">'+
                    ' <div class="new_excell_info_mian_pic">'+
                    ' <img src="'+img_url+'" class="new_excell_pic">'+
                    ' <ul class="new_excell_info_other">'+
                    ' <li><span class="new_excell_info_username">'+typeName+'</span></li>'+
                    '<li style="font-size: 12px;height: 16px;line-height: 16px;">'+
                    '<span class="new_excell_info_time" style="margin-left: 13px;color: #999;">'+
                    '<fmt:message code="workflow.th.flowtype" /></span></li>'+
                    '</ul>'+
                    '</div>'+
                    '</div>'+
                    ' <div style="position: absolute;bottom: 5px;left: 20px;"><div style="float: left;">'+
                    '<span class="new_excell_info_username" style="font-size: 12px;margin-left: 5px;color: #999;display:block;">'+data[i].depName+'</span>'+
                    ' </div>'+
                    ' </div>'+
                    ' </div>'+
                    '</a>'+
                    ' <div class="new_excell_footer">'+
                    //'<span class="lcsjq">流程设计器</span>'+
                    //'<img src="../../img/workflow/design_03.png" class="deldel_img" >'+
                    '<span class="deldel" formId="'+data[i].flowId+'"><fmt:message code="workflow.th.designer" /></span>'+
                    '<img src="../../img/workflow/design_03.png" class="deldel_img" >'+
                    '</div>'+
                    '</div>'+
                    '</div>';
                //if(i%3==2){html+='</div>';}
            }
            $(".cont_rig").html(html);

        }
    })
</script>

</html>

