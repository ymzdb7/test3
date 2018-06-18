
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html style="height:100%;">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>栏目管理</title>
    <script type="text/javascript" src="/js/jquery/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="/js/zTree/jquery.ztree.core.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/zTreeStyle/zTreeStyle.css"/>
    <link rel="stylesheet" type="text/css" href="../css/base.css">
    <style>
        .fr{
            float: right;
        }
        .fl{
            float: left;
        }
        .clearfix:after{
            display: block;
            clear:both;
            height:0;
            content: "";
        }
        .mangement {
            margin-left: 5px;
            font-family: "微软雅黑";
            margin-top: -3px;
            margin-right: 40px;
            font-size: 22px;
            color: #494d59;
        }
        .column{
            height:100%;
        }
         .channel_ico_close,.channel_ico_docu{
             background-position: -110px 0;
             margin-right: 2px;
             vertical-align: top;
         }
        .channel_ico_open{
            background-position: -110px -16px;
            margin-right: 2px;
            vertical-align: top;
        }
        .tree,.count{
            width:20%;
            height:100%;
        }
        .count{
            width:80%;
        }

    </style>
</head>
<body style="height:100%;">
    <div class="column clearfix">
        <div class="titles">
            <p>
                <img src="/img/commonTheme/${sessionScope.InterfaceModel}/wangguan.png" style="width: 25px;height: 24px;vertical-align: text-bottom;" alt="">
                <span class="mangement">栏目管理</span>
            </p>
        </div>
        <div class="fl tree">
            <ul id="treeDemo" class="ztree "></ul>
        </div>
        <div class="fl count">
            <iframe class="" id="iframe" src="/site/choice" frameborder="0" scrolling="no" style="width:100%;height:100%;"></iframe>
        </div>
    </div>
</body>
<script>
    $(function () {
        $.ajax({
            url:'/column/ColumnTreeController',
            type:'post',
            data:{id:0},
            dataType:'json',
            success:function(res){
                var data=res.obj;
                var arr=[];
                var setting = {
                    view: {
                        selectedMulti: false,//设置是否允许同时选中多个节点
                    },
                    async: {
                        enable: true,//是否异步
                        url:"/column/ColumnTreeController",
                        autoParam:["id",],//给后台传的值
                        dataFilter:dataFilter,//显示子节点，
                    },
                    callback: {
                        onClick: zTreeOnClick
                    }
                };
                for(var i=0;i<data.length;i++){
                    obj={ id:data[i].id, pId:0, name:data[i].name, isParent:true};
                    arr.push(obj);
                }
                $.fn.zTree.init($("#treeDemo"), setting, arr);
                //console.log(zTree)
            }
        })

    })

    function dataFilter(treeId, parentNode, childNodes) {//显示节点
      //console.log(parentNode);
       return childNodes.obj
   }
    var parentid ;
    var extend;
    function zTreeOnClick(event, treeId, treeNode) {//点击节点添加子节点
        var extend1=treeNode.id
        var id=treeNode.id;
        parentid=id;
        extend=extend1;
        $.ajax({
            url:'/column/ColumnTreeController',
            type:'post',
            data:{id:id},
            dataType:'json',
            success:function(res){//当前节点添加子节点
                var obj=res.obj;
                var zTree  = $.fn.zTree.getZTreeObj("treeDemo");
                var node=zTree.getSelectedNodes();//获取当前节点信息
                //console.log(node)
                var node1=node[0];//获取当前子节点信息
                //console.log(node1)
                node1.isParent = true;//把属性变成true，让这个节点被认为是根节点
                zTree.reAsyncChildNodes(node1, "refresh",false);//给当前根节点添加子节点

                $('#iframe').attr('src','/site/columncout')
            }
        })
    }
</script>
</html>