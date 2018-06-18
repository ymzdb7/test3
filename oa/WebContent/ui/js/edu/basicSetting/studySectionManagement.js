var dataId={
    page:1,//当前处于第几页
    pageSize:10,//一页显示几条
    useFlag:true
};
$(function () {
    $('.M-box3').pagination({
        pageCount:10,
        jump:true,
        coping:true,
        homePage:'首页',
        endPage:'末页',
        prevContent:'上页',
        nextContent:'下页'
    });

    init(dataId,$('#trList'));
    //编辑
    $('#trList').on('click','.dataEdit',function () {
        var id=$(this).parents('tr').attr('data-id');
        layer.open({
            type: 1,
            title:['编辑', 'background-color:#2b7fe0;color:#fff;font-size:13pt;'],
            area: ['600px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['保存','关闭'],
            content: '<div class="newLayer">' +
            '<table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">' +
            '<tr><td>名称：</td><td><input type="text" name="yearName" value=""></td></tr>' +
            '<tr><td>编号：</td><td><input type="text" name="code" value=""></td></tr>' +
            '<tr><td>领导小组：</td><td><input type="text" name="leader" value=""></td></tr>' +
            '<tr><td>学部：</td><td><input type="text" name="facultyNo" value=""></td></tr>' +
            '<tr><td>激活：</td><td><select name="isEnabled" id="isEnabled"><option value="0">激活</option><option value="1">不激活</option></select></td></tr>' +
            '<tr><td>显示位置：</td><td><input type="text" name="posotion" value=""></td></tr>' +
            '<tr><td>备注：</td><td><input type="text" name="remark" value=""></td></tr>' +
            '</table>' +
            '</div>',
            success:function(){
                $.ajax({
                    type:'get',
                    url:'/eduLearnPhase/selEduLearnPhaseById',
                    dataType:'json',
                    data:{id:id},
                    success:function (res) {
                        var data=res.object;
                        $('input[name="yearName"]').val(data.name);
                        $('input[name="code"]').val(data.code);
                        $('input[name="leader"]').val(data.leader);
                        $('input[name="facultyNo"]').val(data.facultyNo);
                        $('#isEnabled').val(data.isEnabled);
                        $('input[name="posotion"]').val(data.posotion);
                        $('input[name="remark"]').val(data.remark);
                    }
                })
            },
            yes:function(index){
                var data={
                    id:id,
                    name:$('input[name="yearName"]').val(),
                    code:$('input[name="code"]').val(),
                    leader:$('input[name="leader"]').val(),
                    facultyNo:$('input[name="facultyNo"]').val(),
                    isEnabled:$('#isEnabled option:selected').val(),
                    posotion:$('input[name="posotion"]').val(),
                    remark:$('input[name="remark"]').val(),
                }
                updataSupervision(data,dataId,$('#trList'))
                layer.close(index);
            }
        });
    })
    //删除
    $('#trList').on('click','.dataDetele',function () {
        var id=$(this).parents('tr').attr('data-id');
        deleteData(id,dataId,$('#trList'));
    })

    $('.divBtn').click(function () {
        layer.open({
            type: 1,
            title:['新建', 'background-color:#2b7fe0;color:#fff;font-size:13pt;'],
            area: ['600px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['保存','关闭'],
            content: '<div class="newLayer">' +
            '<table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">' +
            '<tr><td>名称：</td><td><input type="text" name="yearName" value=""></td></tr>' +
            '<tr><td>编号：</td><td><input type="text" name="code" value=""></td></tr>' +
            '<tr><td>领导小组：</td><td><input type="text" name="leader" value=""></td></tr>' +
            '<tr><td>学部：</td><td><input type="text" name="facultyNo" value=""></td></tr>' +
            '<tr><td>激活：</td><td><select name="isEnabled" id="isEnabled"><option value="0">激活</option><option value="1">不激活</option></select></td></tr>' +
            '<tr><td>显示位置：</td><td><input type="text" name="posotion" value=""></td></tr>' +
            '<tr><td>备注：</td><td><input type="text" name="remark" value=""></td></tr>' +
            '</table>' +
            '</div>',
            success:function(){

            },
            yes:function(index){
                var data={
                    name:$('input[name="yearName"]').val(),
                    code:$('input[name="code"]').val(),
                    leader:$('input[name="leader"]').val(),
                    facultyNo:$('input[name="facultyNo"]').val(),
                    isEnabled:$('#isEnabled option:selected').val(),
                    posotion:$('input[name="posotion"]').val(),
                    remark:$('input[name="remark"]').val(),
                }
                newSupervision(data,dataId,$('#trList'))
                layer.close(index);
            }
        });
    })
})

//新建
function newSupervision(data,dataId,element){
    $.ajax({
        type:'post',
        url:'/eduLearnPhase/addEduLearnPhase',
        dataType:'json',
        data:data,
        success:function(res){
            if(res.flag){
                $.layerMsg({content:'新建成功！',icon:1});
                init(dataId,element)
            }else{
                $.layerMsg({content:'新建失败！',icon:2});
            }
        }
    })
}
//编辑保存
function updataSupervision(data,dataId,element){
    $.ajax({
        type:'post',
        url:'/eduLearnPhase/updateEduLearnPhase',
        dataType:'json',
        data:data,
        success:function(res){
            if(res.flag){
                $.layerMsg({content:'修改成功！',icon:1});
                init(dataId,element)
            }else{
                $.layerMsg({content:'修改失败！',icon:2});
            }
        }
    })
}
//删除
function deleteData(id,dataId,element) {
    layer.confirm('确定要删除吗？', {
        btn: ['确定','取消'], //按钮
        title:"删除"
    }, function(){
        //确定删除，调接口
        $.ajax({
            type:'post',
            url:'/eduLearnPhase/delEduLearnPhase',
            dataType:'json',
            data:{'id':id},
            success:function(){
                layer.msg('删除成功！', { icon:6});
                init(dataId,element)
            }
        })

    }, function(){
        layer.closeAll();
    });
}
function init(dataId,element) {
    var ajaxPage={
        data:dataId,
        page:function () {
            element.find('tr').remove();
            var me=this;
            $.ajax({
                type:'get',
                url:'/eduLearnPhase/selEduLearnPhase',
                dataType:'json',
                data:me.data,
                success:function(res) {
                    var datas=res.obj;
                    var str='';
                    for(var i=0;i<datas.length;i++){
                        var dataText='';
                        str+='<tr data-id="'+datas[i].id+'">' +
                            '<td>'+(i+1)+'</td>' +
                            '<td>'+datas[i].name+'</td>' +
                            '<td>'+datas[i].code+'</td>' +
                            '<td>'+datas[i].leader+'</td>' +
                            '<td>'+datas[i].facultyNo+'</td>' +
                            '<td>'+function () {
                                if(datas[i].isEnabled == '0'){
                                    return '激活';
                                }else if(datas[i].isEnabled == '1'){
                                    return '不激活';
                                }else {
                                    return '';
                                }
                            }()+'</td>' +
                            '<td>'+datas[i].posotion+'</td>' +
                            '<td>'+datas[i].remark+'</td>' +
                            '<td><a href="javascript:;" style="margin-right: 10px" class="dataEdit">编辑</a><a href="javascript:;" class="dataDetele">删除</a></td>' +
                            '</tr>'
                    }

                    element.append(str);
                    me.pageTwo(res.totleNum,me.data.pageSize,me.data.page)
                }
            })

        },
        pageTwo:function (totalData, pageSize,indexs) {
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
}

