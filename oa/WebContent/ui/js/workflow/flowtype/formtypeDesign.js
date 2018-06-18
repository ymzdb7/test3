var dept_id='';
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


//表单分类接口
function item(callback){
    $.ajax({
        url:'../../workflow/flowclassify/form',
        type:'get',
        dataType:'json',
        success:function(obj){
            if(obj.flag){
                var data=obj.datas;
                callback(data);
            }
        }
    });
}
//父表单递归方法（表单）
function Child(datas,opt_li,level,parentId){
    for(var i=0;i<datas.length;i++){
        if(level==0&&i==0) continue;
        var String="";
        var space=""
        for(var j=0;j<level;j++){
            space+="├&nbsp;&nbsp;&nbsp;";
        }
        if(i==0){
            String=space+"┌";
        }
        if(i!=0){
            String=space+"├";
        }
        if(i==datas.length-1){
            String=space+"└";
        }
        if(parentId==datas[i].sortId){
            opt_li+='<option value="'+datas[i].sortId+'" selected="selected">'+String+datas[i].sortName+'</option>';
        }else{
            opt_li+='<option value="'+datas[i].sortId+'">'+String+datas[i].sortName+'</option>';
        }
        if(datas[i].childs!=null){
            opt_li = Child(datas[i].childs,opt_li,level+1,parentId);
        }
    }
    return opt_li;
}




//点击
function getFlowList(sortId) {
    if (sortId==0)
    {
        sortId=-2;
    }
    if(sortId==-1)
        sortId=0;

    $.ajax({
        url:'../../form/formlistbysort',
        type:'post',
        dataType:'json',
        data:{sortId:sortId},
        success:function (ret) {
            if(ret.flag==true){
                renderDatas(ret.datas);
            }else{
                noDatas();
            }
        },
    });

}
function noDatas() {//没有数据的展示
    var html='<div class="noData_out">' +
        '<div class="noDatas_pic">' +
        '<img src="../../img/workflow/img_nomessage_03.png">' +
        '</div>' +
        '<div class="noDatas" >'+palseNew+'</div>' +
        '</div>';
    $(".cont_rig").html(html);
}







$(function () {
    getFlowList(null);//默认查询全部


    $('[name="form_value"]').keyup(function (e) {//input回车事件绑定
        if(e.keyCode==13){
            $("#btn_search").click()
        }
    })
    //获取左侧分类
    $('#li_parent').tree({
        url: '../../workflow/flowclassify/formJsTree',
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
            $("#li_parent li").find("div[node-id='-1']").addClass("tree-node-selected");   //设置第一个节点高亮
            var n = $("#li_parent").tree("getSelected");
            if(n!=null){
                $("#li_parent").tree("select",n.target);    //相当于默认点击了一下第一个节点，执行onSelect方法
            }
        },
    });


    $("#btn_search").click(function(){//input按钮点击查询
        var value=$('[name="form_value"]').val();

        $.ajax({
            url:'../../form/formBySearch',
            type:'post',
            dataType:'json',
            data:{searchValue:value},
            success:function(ret){
                if(ret.flag==true){
                    renderDatas(ret.datas);
                }else{
                    noDatas();
                }

            }
        });

    })




    $(document).on('click','.set',function () {
        var formId = $(this).attr("formId");
        window.open("/form/designer?formId="+formId+"&type=edit");
    })

    $(document).on('click','.foot_span_show',function () {
        var formId = $(this).attr("formId");
        window.open("/workflow/work/workform1?formId="+formId);

    })


})